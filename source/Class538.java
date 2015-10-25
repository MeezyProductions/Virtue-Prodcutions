/* Class538 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class538
{
    int anInt7147 = 5088;
    public int anInt7148;
    short[][] aShortArrayArray7149;
    long[][][] aLongArrayArrayArray7150;
    static final int anInt7151 = 4;
    byte[][] aByteArrayArray7152;
    Class60 aClass60_7153;
    boolean aBool7154;
    int anInt7155;
    public Class559 aClass559_7156;
    int anInt7157;
    public int anInt7158;
    public int anInt7159;
    public Class546[][][] aClass546ArrayArrayArray7160;
    public Class137[] aClass137Array7161;
    public Class546[][][] aClass546ArrayArrayArray7162;
    public Class137[] aClass137Array7163;
    public Class546[][][] aClass546ArrayArrayArray7164;
    boolean[] aBoolArray7165;
    Class173 aClass173_7166;
    int anInt7167;
    byte[][] aByteArrayArray7168;
    int anInt7169;
    byte[][] aByteArrayArray7170;
    public static boolean aBool7171 = true;
    int anInt7172;
    int anInt7173 = 10093;
    int anInt7174 = 5094;
    int[][] anIntArrayArray7175;
    Class645_Sub1[] aClass645_Sub1Array7176;
    Class645_Sub1[] aClass645_Sub1Array7177;
    Class645_Sub1[] aClass645_Sub1Array7178;
    int anInt7179;
    int anInt7180;
    Class645_Sub1[] aClass645_Sub1Array7181;
    Class645_Sub1[] aClass645_Sub1Array7182;
    int anInt7183 = 65483;
    public int anInt7184;
    int anInt7185;
    int anInt7186;
    int anInt7187;
    int anInt7188;
    int anInt7189;
    int anInt7190;
    int anInt7191;
    int anInt7192;
    int anInt7193;
    boolean[][] aBoolArrayArray7194;
    int anInt7195;
    int anInt7196;
    float[] aFloatArray7197;
    boolean aBool7198;
    HashMap aHashMap7199;
    Class645_Sub1_Sub5[] aClass645_Sub1_Sub5Array7200;
    byte[][] aByteArrayArray7201;
    public Class137[] aClass137Array7202;
    Class543[] aClass543Array7203;
    int anInt7204;
    HashMap aHashMap7205;
    Class528_Sub12[] aClass528_Sub12Array7206;
    public Class555 aClass555_7207;
    int anInt7208 = 16;
    int[] anIntArray7209;
    boolean[][] aBoolArrayArray7210;
    boolean[][] aBoolArrayArray7211;
    
    public void method6530() {
	for (int i = 0; i < ((Class538) this).anInt7172 * -190672245; i++) {
	    Class645_Sub1_Sub5 class645_sub1_sub5
		= ((Class538) this).aClass645_Sub1_Sub5Array7200[i];
	    method6551(class645_sub1_sub5, true, (byte) 73);
	    ((Class538) this).aClass645_Sub1_Sub5Array7200[i] = null;
	}
	((Class538) this).anInt7172 = 0;
    }
    
    public void method6531(int i, int i_0_) {
	/* empty */
    }
    
    public void method6532(Class172 class172, int i) {
	/* empty */
    }
    
    public void method6533(boolean bool, int i) {
	if (bool) {
	    aClass546ArrayArrayArray7160 = aClass546ArrayArrayArray7164;
	    aClass137Array7161 = aClass137Array7202;
	} else {
	    aClass546ArrayArrayArray7160 = aClass546ArrayArrayArray7162;
	    aClass137Array7161 = aClass137Array7163;
	}
	anInt7184 = aClass546ArrayArrayArray7160.length * -1178005013;
    }
    
    public void method6534(int i) {
	for (int i_1_ = 0; i_1_ < anInt7158 * -1102718643; i_1_++) {
	    for (int i_2_ = 0; i_2_ < anInt7159 * -532233529; i_2_++) {
		if (null == aClass546ArrayArrayArray7160[0][i_1_][i_2_])
		    aClass546ArrayArrayArray7160[0][i_1_][i_2_]
			= new Class546(0);
	    }
	}
    }
    
    public void method6535(int i, int i_3_, int i_4_) {
	Class546 class546 = aClass546ArrayArrayArray7160[0][i][i_3_];
	for (int i_5_ = 0; i_5_ < 3; i_5_++) {
	    Class546 class546_6_
		= (aClass546ArrayArrayArray7160[i_5_][i][i_3_]
		   = aClass546ArrayArrayArray7160[i_5_ + 1][i][i_3_]);
	    if (class546_6_ != null) {
		for (Class542 class542 = class546_6_.aClass542_7399;
		     null != class542; class542 = class542.aClass542_7238) {
		    Class645_Sub1_Sub5 class645_sub1_sub5
			= class542.aClass645_Sub1_Sub5_7239;
		    if (i == class645_sub1_sub5.aShort11747
			&& class645_sub1_sub5.aShort11745 == i_3_)
			class645_sub1_sub5.aByte10675--;
		}
		if (class546_6_.aClass645_Sub1_Sub4_7397 != null)
		    class546_6_.aClass645_Sub1_Sub4_7397.aByte10675--;
		if (class546_6_.aClass645_Sub1_Sub3_7393 != null)
		    class546_6_.aClass645_Sub1_Sub3_7393.aByte10675--;
		if (class546_6_.aClass645_Sub1_Sub3_7394 != null)
		    class546_6_.aClass645_Sub1_Sub3_7394.aByte10675--;
		if (null != class546_6_.aClass645_Sub1_Sub1_7395)
		    class546_6_.aClass645_Sub1_Sub1_7395.aByte10675--;
		if (null != class546_6_.aClass645_Sub1_Sub1_7396)
		    class546_6_.aClass645_Sub1_Sub1_7396.aByte10675--;
	    }
	}
	if (null == aClass546ArrayArrayArray7160[0][i][i_3_]) {
	    aClass546ArrayArrayArray7160[0][i][i_3_] = new Class546(0);
	    aClass546ArrayArrayArray7160[0][i][i_3_].aByte7402 = (byte) 1;
	}
	aClass546ArrayArrayArray7160[0][i][i_3_].aClass546_7392 = class546;
	aClass546ArrayArrayArray7160[3][i][i_3_] = null;
    }
    
    Class546 method6536(int i, int i_7_, int i_8_, int i_9_) {
	if (null == aClass546ArrayArrayArray7160[i][i_7_][i_8_]) {
	    boolean bool = (null != aClass546ArrayArrayArray7160[0][i_7_][i_8_]
			    && null != (aClass546ArrayArrayArray7160[0][i_7_]
					[i_8_].aClass546_7392));
	    if (bool && i >= -353005885 * anInt7184 - 1)
		return null;
	    method6582(i, i_7_, i_8_, 407633450);
	}
	return aClass546ArrayArrayArray7160[i][i_7_][i_8_];
    }
    
    Class546 method6537(int i, int i_10_, int i_11_, short i_12_) {
	return method6536(i,
			  Math.min(-1102718643 * anInt7158 - 1,
				   Math.max(0, i_10_)),
			  Math.min(anInt7159 * -532233529 - 1,
				   Math.max(0, i_11_)),
			  700809161);
    }
    
    public void method6538(int i, Class137 class137, byte i_13_) {
	aClass137Array7161[i] = class137;
    }
    
    public int method6539(int i, int i_14_, short i_15_) {
	return (null != ((Class538) this).anIntArrayArray7175
		? ((Class538) this).anIntArrayArray7175[i][i_14_] & 0xffffff
		: 0);
    }
    
    public int method6540(int i, int i_16_, byte i_17_) {
	return (((Class538) this).aByteArrayArray7168 != null
		? ((Class538) this).aByteArrayArray7168[i][i_16_] & 0xff : 0);
    }
    
    public int method6541(int i, int i_18_, int i_19_) {
	return (null != ((Class538) this).aByteArrayArray7170
		? ((Class538) this).aByteArrayArray7170[i][i_18_] & 0xff : 0);
    }
    
    public int method6542(int i, int i_20_, int i_21_) {
	return (((Class538) this).aByteArrayArray7201 != null
		? ((Class538) this).aByteArrayArray7201[i][i_20_] & 0xff : 0);
    }
    
    public void method6543(int i, int i_22_, int i_23_,
			   Class645_Sub1_Sub4 class645_sub1_sub4, int i_24_) {
	Class546 class546 = method6536(i, i_22_, i_23_, 97475385);
	if (class546 != null) {
	    class546.aClass645_Sub1_Sub4_7397 = class645_sub1_sub4;
	    int i_25_ = aClass137Array7202 == aClass137Array7161 ? 1 : 0;
	    if (class645_sub1_sub4.method9797(-217235802)) {
		if (class645_sub1_sub4.method9775((short) -1059)) {
		    ((Class645_Sub1_Sub4) class645_sub1_sub4)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7177[i_25_];
		    ((Class538) this).aClass645_Sub1Array7177[i_25_]
			= class645_sub1_sub4;
		} else {
		    ((Class645_Sub1_Sub4) class645_sub1_sub4)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7176[i_25_];
		    ((Class538) this).aClass645_Sub1Array7176[i_25_]
			= class645_sub1_sub4;
		}
	    } else {
		((Class645_Sub1_Sub4) class645_sub1_sub4).aClass645_Sub1_10673
		    = ((Class538) this).aClass645_Sub1Array7178[i_25_];
		((Class538) this).aClass645_Sub1Array7178[i_25_]
		    = class645_sub1_sub4;
	    }
	}
    }
    
    public Class542 method6544(int i, int i_26_, int i_27_, int i_28_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_26_][i_27_];
	if (class546 == null)
	    return null;
	return class546.aClass542_7399;
    }
    
    public boolean method6545(Class645_Sub1_Sub5 class645_sub1_sub5,
			      boolean bool, int i) {
	boolean bool_29_ = aClass137Array7161 == aClass137Array7202;
	int i_30_ = 0;
	short i_31_ = 0;
	byte i_32_ = 0;
	class645_sub1_sub5.method10656(1103160324);
	short i_33_ = 0;
	int i_34_ = Math.min(anInt7158 * -1102718643 - 1,
			     Math.max(0, class645_sub1_sub5.aShort11747));
	int i_35_ = Math.min(anInt7158 * -1102718643 - 1,
			     Math.max(0, class645_sub1_sub5.aShort11743));
	int i_36_ = Math.min(anInt7159 * -532233529 - 1,
			     Math.max(0, class645_sub1_sub5.aShort11745));
	int i_37_ = Math.min(-532233529 * anInt7159 - 1,
			     Math.max(0, class645_sub1_sub5.aShort11746));
	for (int i_38_ = i_34_; i_38_ <= i_35_; i_38_++) {
	    for (int i_39_ = i_36_; i_39_ <= i_37_; i_39_++) {
		Class546 class546 = method6537(class645_sub1_sub5.aByte10675,
					       i_38_, i_39_, (short) 19830);
		if (class546 != null) {
		    Class542 class542
			= Class632.method7554(class645_sub1_sub5, -447050540);
		    Class542 class542_40_ = class546.aClass542_7399;
		    if (class542_40_ == null)
			class546.aClass542_7399 = class542;
		    else {
			for (/**/; class542_40_.aClass542_7238 != null;
			     class542_40_ = class542_40_.aClass542_7238) {
			    /* empty */
			}
			class542_40_.aClass542_7238 = class542;
		    }
		    if (bool_29_ && 0 != ((((Class538) this)
					   .anIntArrayArray7175[i_38_][i_39_])
					  & ~0xffffff)) {
			i_30_ = (((Class538) this).anIntArrayArray7175[i_38_]
				 [i_39_]);
			i_31_ = (((Class538) this).aShortArrayArray7149[i_38_]
				 [i_39_]);
			i_32_ = (((Class538) this).aByteArrayArray7168[i_38_]
				 [i_39_]);
		    }
		    if (!bool && null != class546.aClass645_Sub1_Sub4_7397
			&& (class546.aClass645_Sub1_Sub4_7397.aShort11726
			    > i_33_))
			i_33_ = class546.aClass645_Sub1_Sub4_7397.aShort11726;
		}
	    }
	}
	if (bool_29_ && (i_30_ & ~0xffffff) != 0) {
	    for (int i_41_ = i_34_; i_41_ <= i_35_; i_41_++) {
		for (int i_42_ = i_36_; i_42_ <= i_37_; i_42_++) {
		    if ((((Class538) this).anIntArrayArray7175[i_41_][i_42_]
			 & ~0xffffff)
			== 0) {
			((Class538) this).anIntArrayArray7175[i_41_][i_42_]
			    = i_30_;
			((Class538) this).aShortArrayArray7149[i_41_][i_42_]
			    = i_31_;
			((Class538) this).aByteArrayArray7168[i_41_][i_42_]
			    = i_32_;
		    }
		}
	    }
	}
	if (bool) {
	    ((Class538) this).aClass645_Sub1_Sub5Array7200
		[(((Class538) this).anInt7172 += 2116273443) * -190672245 - 1]
		= class645_sub1_sub5;
	    class645_sub1_sub5.aClass538_10676 = this;
	} else {
	    int i_43_ = aClass137Array7202 == aClass137Array7161 ? 1 : 0;
	    if (class645_sub1_sub5.method9797(-867614160)) {
		if (class645_sub1_sub5.method9775((short) -20719)) {
		    ((Class645_Sub1_Sub5) class645_sub1_sub5)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7177[i_43_];
		    ((Class538) this).aClass645_Sub1Array7177[i_43_]
			= class645_sub1_sub5;
		} else {
		    ((Class645_Sub1_Sub5) class645_sub1_sub5)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7176[i_43_];
		    ((Class538) this).aClass645_Sub1Array7176[i_43_]
			= class645_sub1_sub5;
		}
	    } else {
		((Class645_Sub1_Sub5) class645_sub1_sub5).aClass645_Sub1_10673
		    = ((Class538) this).aClass645_Sub1Array7178[i_43_];
		((Class538) this).aClass645_Sub1Array7178[i_43_]
		    = class645_sub1_sub5;
	    }
	}
	if (bool) {
	    Class422 class422
		= Class422.method5052(class645_sub1_sub5.method7693()
				      .aClass422_4868);
	    class422.aFloat4776 -= (float) i_33_;
	    class645_sub1_sub5.method7688(class422);
	    class422.method5054();
	}
	return true;
    }
    
    public void method6546(int i, int i_44_, int i_45_, int i_46_,
			   short i_47_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_44_][i_45_];
	if (null != class546) {
	    Class645_Sub1_Sub1 class645_sub1_sub1
		= class546.aClass645_Sub1_Sub1_7395;
	    Class645_Sub1_Sub1 class645_sub1_sub1_48_
		= class546.aClass645_Sub1_Sub1_7396;
	    if (class645_sub1_sub1 != null) {
		class645_sub1_sub1.aShort11696
		    = (short) (class645_sub1_sub1.aShort11696 * i_46_
			       / (16 << -1532596617 * anInt7148 - 7));
		class645_sub1_sub1.aShort11697
		    = (short) (class645_sub1_sub1.aShort11697 * i_46_
			       / (16 << -1532596617 * anInt7148 - 7));
	    }
	    if (null != class645_sub1_sub1_48_) {
		class645_sub1_sub1_48_.aShort11696
		    = (short) (class645_sub1_sub1_48_.aShort11696 * i_46_
			       / (16 << anInt7148 * -1532596617 - 7));
		class645_sub1_sub1_48_.aShort11697
		    = (short) (class645_sub1_sub1_48_.aShort11697 * i_46_
			       / (16 << -1532596617 * anInt7148 - 7));
	    }
	}
    }
    
    public void method6547(byte i) {
	for (int i_49_ = 0; i_49_ < ((Class538) this).anInt7172 * -190672245;
	     i_49_++) {
	    Class645_Sub1_Sub5 class645_sub1_sub5
		= ((Class538) this).aClass645_Sub1_Sub5Array7200[i_49_];
	    method6551(class645_sub1_sub5, true, (byte) 81);
	    ((Class538) this).aClass645_Sub1_Sub5Array7200[i_49_] = null;
	}
	((Class538) this).anInt7172 = 0;
    }
    
    public int method6548(int i, int i_50_, int i_51_) {
	return (null != ((Class538) this).aByteArrayArray7152
		? ((Class538) this).aByteArrayArray7152[i][i_50_] & 0xff : 0);
    }
    
    public Class645_Sub1_Sub1 method6549(int i, int i_52_, int i_53_,
					 byte i_54_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_52_][i_53_];
	if (class546 != null) {
	    method6552(class546.aClass645_Sub1_Sub1_7395, -654582622);
	    if (class546.aClass645_Sub1_Sub1_7395 != null) {
		Class645_Sub1_Sub1 class645_sub1_sub1
		    = class546.aClass645_Sub1_Sub1_7395;
		class546.aClass645_Sub1_Sub1_7395 = null;
		return class645_sub1_sub1;
	    }
	}
	return null;
    }
    
    public Class645_Sub1_Sub2 method6550(int i, int i_55_, int i_56_,
					 int i_57_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_55_][i_56_];
	if (class546 == null)
	    return null;
	Class645_Sub1_Sub2 class645_sub1_sub2
	    = ((Class546) class546).aClass645_Sub1_Sub2_7398;
	((Class546) class546).aClass645_Sub1_Sub2_7398 = null;
	method6552(class645_sub1_sub2, -654582622);
	return class645_sub1_sub2;
    }
    
    void method6551(Class645_Sub1_Sub5 class645_sub1_sub5, boolean bool,
		    byte i) {
	int i_58_ = Math.min(anInt7158 * -1102718643 - 1,
			     Math.max(0, class645_sub1_sub5.aShort11747));
	int i_59_ = Math.min(-1102718643 * anInt7158 - 1,
			     Math.max(0, class645_sub1_sub5.aShort11743));
	int i_60_ = Math.min(anInt7159 * -532233529 - 1,
			     Math.max(0, class645_sub1_sub5.aShort11745));
	int i_61_ = Math.min(-532233529 * anInt7159 - 1,
			     Math.max(0, class645_sub1_sub5.aShort11746));
	for (int i_62_ = i_58_; i_62_ <= i_59_; i_62_++) {
	    for (int i_63_ = i_60_; i_63_ <= i_61_; i_63_++) {
		Class546 class546
		    = (aClass546ArrayArrayArray7160
		       [class645_sub1_sub5.aByte10675][i_62_][i_63_]);
		if (class546 != null) {
		    Class542 class542 = class546.aClass542_7399;
		    Class542 class542_64_ = null;
		    for (/**/; class542 != null;
			 class542 = class542.aClass542_7238) {
			if (class645_sub1_sub5
			    == class542.aClass645_Sub1_Sub5_7239) {
			    if (null != class542_64_)
				class542_64_.aClass542_7238
				    = class542.aClass542_7238;
			    else
				class546.aClass542_7399
				    = class542.aClass542_7238;
			    class542.method6624(2019255612);
			    break;
			}
			class542_64_ = class542;
		    }
		}
	    }
	}
	if (!bool)
	    method6552(class645_sub1_sub5, -654582622);
    }
    
    void method6552(Class645_Sub1 class645_sub1, int i) {
	if (null != class645_sub1) {
	    class645_sub1.method7692();
	    for (int i_65_ = 0; i_65_ < 2; i_65_++) {
		Class645_Sub1 class645_sub1_66_ = null;
		for (Class645_Sub1 class645_sub1_67_
			 = ((Class538) this).aClass645_Sub1Array7176[i_65_];
		     class645_sub1_67_ != null;
		     class645_sub1_67_ = (((Class645_Sub1) class645_sub1_67_)
					  .aClass645_Sub1_10673)) {
		    if (class645_sub1 == class645_sub1_67_) {
			if (class645_sub1_66_ != null)
			    ((Class645_Sub1) class645_sub1_66_)
				.aClass645_Sub1_10673
				= (((Class645_Sub1) class645_sub1_67_)
				   .aClass645_Sub1_10673);
			else
			    ((Class538) this).aClass645_Sub1Array7176[i_65_]
				= (((Class645_Sub1) class645_sub1_67_)
				   .aClass645_Sub1_10673);
			return;
		    }
		    class645_sub1_66_ = class645_sub1_67_;
		}
		class645_sub1_66_ = null;
		for (Class645_Sub1 class645_sub1_68_
			 = ((Class538) this).aClass645_Sub1Array7177[i_65_];
		     null != class645_sub1_68_;
		     class645_sub1_68_ = (((Class645_Sub1) class645_sub1_68_)
					  .aClass645_Sub1_10673)) {
		    if (class645_sub1 == class645_sub1_68_) {
			if (null != class645_sub1_66_)
			    ((Class645_Sub1) class645_sub1_66_)
				.aClass645_Sub1_10673
				= (((Class645_Sub1) class645_sub1_68_)
				   .aClass645_Sub1_10673);
			else
			    ((Class538) this).aClass645_Sub1Array7177[i_65_]
				= (((Class645_Sub1) class645_sub1_68_)
				   .aClass645_Sub1_10673);
			return;
		    }
		    class645_sub1_66_ = class645_sub1_68_;
		}
		class645_sub1_66_ = null;
		for (Class645_Sub1 class645_sub1_69_
			 = ((Class538) this).aClass645_Sub1Array7178[i_65_];
		     null != class645_sub1_69_;
		     class645_sub1_69_ = (((Class645_Sub1) class645_sub1_69_)
					  .aClass645_Sub1_10673)) {
		    if (class645_sub1 == class645_sub1_69_) {
			if (class645_sub1_66_ != null)
			    ((Class645_Sub1) class645_sub1_66_)
				.aClass645_Sub1_10673
				= (((Class645_Sub1) class645_sub1_69_)
				   .aClass645_Sub1_10673);
			else
			    ((Class538) this).aClass645_Sub1Array7178[i_65_]
				= (((Class645_Sub1) class645_sub1_69_)
				   .aClass645_Sub1_10673);
			return;
		    }
		    class645_sub1_66_ = class645_sub1_69_;
		}
	    }
	}
    }
    
    void method6553(Class645_Sub1[] class645_sub1s, int i, int i_70_) {
	if (i < i_70_) {
	    int i_71_ = (i_70_ + i) / 2;
	    int i_72_ = i;
	    Class645_Sub1 class645_sub1 = class645_sub1s[i_71_];
	    class645_sub1s[i_71_] = class645_sub1s[i_70_];
	    class645_sub1s[i_70_] = class645_sub1;
	    int i_73_ = 830655065 * ((Class645_Sub1) class645_sub1).anInt10677;
	    for (int i_74_ = i; i_74_ < i_70_; i_74_++) {
		if ((((Class645_Sub1) class645_sub1s[i_74_]).anInt10677
		     * 830655065)
		    > i_73_ + (i_74_ & 0x1)) {
		    Class645_Sub1 class645_sub1_75_ = class645_sub1s[i_74_];
		    class645_sub1s[i_74_] = class645_sub1s[i_72_];
		    class645_sub1s[i_72_++] = class645_sub1_75_;
		}
	    }
	    class645_sub1s[i_70_] = class645_sub1s[i_72_];
	    class645_sub1s[i_72_] = class645_sub1;
	    method6553(class645_sub1s, i, i_72_ - 1);
	    method6553(class645_sub1s, i_72_ + 1, i_70_);
	}
    }
    
    public Class645_Sub1_Sub3 method6554(int i, int i_76_, int i_77_,
					 int i_78_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_76_][i_77_];
	if (class546 == null)
	    return null;
	return class546.aClass645_Sub1_Sub3_7394;
    }
    
    public Class645_Sub1_Sub1 method6555(int i, int i_79_, int i_80_,
					 int i_81_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_79_][i_80_];
	if (class546 == null)
	    return null;
	return class546.aClass645_Sub1_Sub1_7395;
    }
    
    public Class645_Sub1_Sub5 method6556(int i, int i_82_, int i_83_,
					 Interface62 interface62, int i_84_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_82_][i_83_];
	if (class546 == null)
	    return null;
	for (Class542 class542 = class546.aClass542_7399; null != class542;
	     class542 = class542.aClass542_7238) {
	    Class645_Sub1_Sub5 class645_sub1_sub5
		= class542.aClass645_Sub1_Sub5_7239;
	    if ((interface62 == null
		 || interface62.method406(class645_sub1_sub5, -1560841978))
		&& class645_sub1_sub5.aShort11747 == i_82_
		&& i_83_ == class645_sub1_sub5.aShort11745) {
		method6551(class645_sub1_sub5, false, (byte) 106);
		return class645_sub1_sub5;
	    }
	}
	return null;
    }
    
    public void method6557() {
	for (int i = 0; i < anInt7158 * -1102718643; i++) {
	    for (int i_85_ = 0; i_85_ < anInt7159 * -532233529; i_85_++) {
		if (null == aClass546ArrayArrayArray7160[0][i][i_85_])
		    aClass546ArrayArrayArray7160[0][i][i_85_]
			= new Class546(0);
	    }
	}
    }
    
    public void method6558() {
	for (int i = 0; i < anInt7184 * -353005885; i++) {
	    for (int i_86_ = 0; i_86_ < -1102718643 * anInt7158; i_86_++) {
		for (int i_87_ = 0; i_87_ < anInt7159 * -532233529; i_87_++) {
		    Class546 class546
			= aClass546ArrayArrayArray7160[i][i_86_][i_87_];
		    if (class546 != null) {
			Class645_Sub1_Sub3 class645_sub1_sub3
			    = class546.aClass645_Sub1_Sub3_7393;
			Class645_Sub1_Sub3 class645_sub1_sub3_88_
			    = class546.aClass645_Sub1_Sub3_7394;
			if (null != class645_sub1_sub3
			    && class645_sub1_sub3.method9771(-395745760)) {
			    method6596(class645_sub1_sub3, i, i_86_, i_87_, 1,
				       1);
			    if (null != class645_sub1_sub3_88_
				&& class645_sub1_sub3_88_
				       .method9771(-395745760)) {
				method6596(class645_sub1_sub3_88_, i, i_86_,
					   i_87_, 1, 1);
				class645_sub1_sub3_88_.method9798
				    (((Class538) this).aClass173_7166,
				     class645_sub1_sub3, 0, 0, 0, false,
				     -334122812);
				class645_sub1_sub3_88_.method9777(-611629277);
			    }
			    class645_sub1_sub3.method9777(-1444472537);
			}
			for (Class542 class542 = class546.aClass542_7399;
			     class542 != null;
			     class542 = class542.aClass542_7238) {
			    Class645_Sub1_Sub5 class645_sub1_sub5
				= class542.aClass645_Sub1_Sub5_7239;
			    if (null != class645_sub1_sub5
				&& class645_sub1_sub5.method9771(-395745760)) {
				method6596(class645_sub1_sub5, i, i_86_, i_87_,
					   (class645_sub1_sub5.aShort11743
					    - class645_sub1_sub5.aShort11747
					    + 1),
					   1 + (class645_sub1_sub5.aShort11746
						- (class645_sub1_sub5
						   .aShort11745)));
				class645_sub1_sub5.method9777(-1722859774);
			    }
			}
			Class645_Sub1_Sub4 class645_sub1_sub4
			    = class546.aClass645_Sub1_Sub4_7397;
			if (null != class645_sub1_sub4
			    && class645_sub1_sub4.method9771(-395745760)) {
			    method6559(class645_sub1_sub4, i, i_86_, i_87_,
				       (byte) 113);
			    class645_sub1_sub4.method9777(-1653933078);
			}
		    }
		}
	    }
	}
    }
    
    void method6559(Class645_Sub1 class645_sub1, int i, int i_89_, int i_90_,
		    byte i_91_) {
	if (i_89_ < -1102718643 * anInt7158) {
	    Class546 class546
		= aClass546ArrayArrayArray7160[i][i_89_ + 1][i_90_];
	    if (class546 != null && null != class546.aClass645_Sub1_Sub4_7397
		&& class546.aClass645_Sub1_Sub4_7397.method9771(-395745760)) {
		int i_92_
		    = ((aClass137Array7161[i].method1669(1 + i_89_, i_90_,
							 (byte) 0)
			+ aClass137Array7161[i].method1669(i_89_ + 1 + 1,
							   i_90_, (byte) 0)
			+ aClass137Array7161[i].method1669(1 + i_89_,
							   i_90_ + 1, (byte) 0)
			+ aClass137Array7161[i].method1669(1 + (1 + i_89_),
							   1 + i_90_,
							   (byte) 0)) / 4
		       - (aClass137Array7161[i].method1669(i_89_, i_90_,
							   (byte) 0)
			  + aClass137Array7161[i].method1669(1 + i_89_, i_90_,
							     (byte) 0)
			  + aClass137Array7161[i].method1669(i_89_, 1 + i_90_,
							     (byte) 0)
			  + aClass137Array7161[i].method1669(1 + i_89_,
							     1 + i_90_,
							     (byte) 0)) / 4);
		class645_sub1.method9798(((Class538) this).aClass173_7166,
					 class546.aClass645_Sub1_Sub4_7397,
					 (198274565
					  * ((Class538) this).anInt7169),
					 i_92_, 0, true, -448086224);
	    }
	}
	if (i_90_ < anInt7158 * -1102718643) {
	    Class546 class546
		= aClass546ArrayArrayArray7160[i][i_89_][1 + i_90_];
	    if (null != class546 && null != class546.aClass645_Sub1_Sub4_7397
		&& class546.aClass645_Sub1_Sub4_7397.method9771(-395745760)) {
		int i_93_
		    = ((aClass137Array7161[i].method1669(i_89_, i_90_,
							 (byte) 0)
			+ aClass137Array7161[i].method1669(i_89_ + 1,
							   1 + i_90_, (byte) 0)
			+ aClass137Array7161[i]
			      .method1669(i_89_, 1 + (1 + i_90_), (byte) 0)
			+ aClass137Array7161[i].method1669(1 + i_89_,
							   1 + i_90_ + 1,
							   (byte) 0)) / 4
		       - (aClass137Array7161[i].method1669(i_89_, i_90_,
							   (byte) 0)
			  + aClass137Array7161[i].method1669(i_89_ + 1, i_90_,
							     (byte) 0)
			  + aClass137Array7161[i].method1669(i_89_, i_90_ + 1,
							     (byte) 0)
			  + aClass137Array7161[i].method1669(1 + i_89_,
							     i_90_ + 1,
							     (byte) 0)) / 4);
		class645_sub1.method9798(((Class538) this).aClass173_7166,
					 class546.aClass645_Sub1_Sub4_7397, 0,
					 i_93_,
					 (198274565
					  * ((Class538) this).anInt7169),
					 true, -925103349);
	    }
	}
	if (i_89_ < anInt7158 * -1102718643
	    && i_90_ < -532233529 * anInt7159) {
	    Class546 class546
		= aClass546ArrayArrayArray7160[i][i_89_ + 1][1 + i_90_];
	    if (null != class546 && class546.aClass645_Sub1_Sub4_7397 != null
		&& class546.aClass645_Sub1_Sub4_7397.method9771(-395745760)) {
		int i_94_
		    = ((aClass137Array7161[i].method1669(i_89_ + 1, 1 + i_90_,
							 (byte) 0)
			+ aClass137Array7161[i].method1669(i_89_ + 1 + 1,
							   i_90_ + 1, (byte) 0)
			+ aClass137Array7161[i]
			      .method1669(i_89_ + 1, 1 + (i_90_ + 1), (byte) 0)
			+ aClass137Array7161[i].method1669(1 + (1 + i_89_),
							   1 + (1 + i_90_),
							   (byte) 0)) / 4
		       - (aClass137Array7161[i].method1669(i_89_, i_90_,
							   (byte) 0)
			  + aClass137Array7161[i].method1669(i_89_ + 1, i_90_,
							     (byte) 0)
			  + aClass137Array7161[i].method1669(i_89_, i_90_ + 1,
							     (byte) 0)
			  + aClass137Array7161[i].method1669(i_89_ + 1,
							     i_90_ + 1,
							     (byte) 0)) / 4);
		class645_sub1.method9798(((Class538) this).aClass173_7166,
					 class546.aClass645_Sub1_Sub4_7397,
					 (198274565
					  * ((Class538) this).anInt7169),
					 i_94_,
					 (((Class538) this).anInt7169
					  * 198274565),
					 true, -1322084719);
	    }
	}
	if (i_89_ < anInt7158 * -1102718643 && i_90_ > 0) {
	    Class546 class546
		= aClass546ArrayArrayArray7160[i][i_89_ + 1][i_90_ - 1];
	    if (class546 != null && null != class546.aClass645_Sub1_Sub4_7397
		&& class546.aClass645_Sub1_Sub4_7397.method9771(-395745760)) {
		int i_95_
		    = ((aClass137Array7161[i].method1669(1 + i_89_, i_90_ - 1,
							 (byte) 0)
			+ aClass137Array7161[i].method1669(1 + (1 + i_89_),
							   i_90_ - 1, (byte) 0)
			+ aClass137Array7161[i]
			      .method1669(1 + i_89_, i_90_ + 1 - 1, (byte) 0)
			+ aClass137Array7161[i].method1669(1 + (1 + i_89_),
							   i_90_ + 1 - 1,
							   (byte) 0)) / 4
		       - (aClass137Array7161[i].method1669(i_89_, i_90_,
							   (byte) 0)
			  + aClass137Array7161[i].method1669(1 + i_89_, i_90_,
							     (byte) 0)
			  + aClass137Array7161[i].method1669(i_89_, i_90_ + 1,
							     (byte) 0)
			  + aClass137Array7161[i].method1669(i_89_ + 1,
							     1 + i_90_,
							     (byte) 0)) / 4);
		class645_sub1.method9798(((Class538) this).aClass173_7166,
					 class546.aClass645_Sub1_Sub4_7397,
					 (198274565
					  * ((Class538) this).anInt7169),
					 i_95_,
					 -(((Class538) this).anInt7169
					   * 198274565),
					 true, -1569349012);
	    }
	}
    }
    
    public void method6560(Class543 class543, byte i) {
	if (598332735 * ((Class538) this).anInt7195 < 65483) {
	    Class528_Sub12 class528_sub12 = class543.aClass528_Sub12_7266;
	    ((Class538) this).aClass543Array7203[(((Class538) this).anInt7195
						  * 598332735)]
		= class543;
	    ((Class538) this).aBoolArray7165[(((Class538) this).anInt7195
					      * 598332735)]
		= false;
	    ((Class538) this).anInt7195 += 2071894719;
	    int i_96_ = class543.anInt7262 * 264933169;
	    if (((Class543) class543).aBool7265)
		i_96_ = 0;
	    int i_97_ = 264933169 * class543.anInt7262;
	    if (((Class543) class543).aBool7264)
		i_97_ = -353005885 * anInt7184 - 1;
	    for (int i_98_ = i_96_; i_98_ <= i_97_; i_98_++) {
		int i_99_ = 0;
		int i_100_ = ((class528_sub12.method9370(1221114533)
			       - class528_sub12.method9357(1563838430)
			       + ((Class538) this).anInt7155 * 486809201)
			      >> -1532596617 * anInt7148);
		if (i_100_ < 0) {
		    i_99_ -= i_100_;
		    i_100_ = 0;
		}
		int i_101_ = ((class528_sub12.method9370(1221114533)
			       + class528_sub12.method9357(1356864119)
			       - 486809201 * ((Class538) this).anInt7155)
			      >> -1532596617 * anInt7148);
		if (i_101_ >= anInt7159 * -532233529)
		    i_101_ = anInt7159 * -532233529 - 1;
		for (int i_102_ = i_100_; i_102_ <= i_101_; i_102_++) {
		    int i_103_
			= ((Class543) class543).aShortArray7267[i_99_++];
		    int i_104_ = (((class528_sub12.method9366(1059533522)
				    - class528_sub12.method9357(872830945)
				    + ((Class538) this).anInt7155 * 486809201)
				   >> -1532596617 * anInt7148)
				  + (i_103_ >>> 8));
		    int i_105_ = (i_103_ & 0xff) + i_104_ - 1;
		    if (i_104_ < 0)
			i_104_ = 0;
		    if (i_105_ >= anInt7158 * -1102718643)
			i_105_ = -1102718643 * anInt7158 - 1;
		    for (int i_106_ = i_104_; i_106_ <= i_105_; i_106_++) {
			long l = (((Class538) this).aLongArrayArrayArray7150
				  [i_98_][i_106_][i_102_]);
			if ((l & 0xffffL) == 0L)
			    ((Class538) this).aLongArrayArrayArray7150
				[i_98_][i_106_][i_102_]
				= l | (long) (598332735
					      * ((Class538) this).anInt7195);
			else if ((l & 0xffff0000L) == 0L)
			    ((Class538) this).aLongArrayArrayArray7150
				[i_98_][i_106_][i_102_]
				= l | (long) (((Class538) this).anInt7195
					      * 598332735) << 16;
			else if ((l & 0xffff00000000L) == 0L)
			    ((Class538) this).aLongArrayArrayArray7150
				[i_98_][i_106_][i_102_]
				= l | ((long) (598332735
					       * ((Class538) this).anInt7195)
				       << 32);
			else if (0L == (l & ~0xffffffffffffL))
			    ((Class538) this).aLongArrayArrayArray7150
				[i_98_][i_106_][i_102_]
				= l | ((long) (598332735
					       * ((Class538) this).anInt7195)
				       << 48);
		    }
		}
	    }
	    if (-1 != ((Class543) class543).anInt7274 * -1743266361) {
		List list
		    = ((List)
		       (((Class538) this).aHashMap7205.get
			(Integer.valueOf(-1743266361
					 * ((Class543) class543).anInt7274))));
		if (null == list) {
		    list = new ArrayList();
		    ((Class538) this).aHashMap7205.put
			(Integer.valueOf(((Class543) class543).anInt7274
					 * -1743266361),
			 list);
		}
		list.add(class543);
		Class528_Sub12 class528_sub12_107_
		    = ((Class528_Sub12)
		       (((Class538) this).aHashMap7199.get
			(Integer.valueOf(-1743266361
					 * ((Class543) class543).anInt7274))));
		if (null != class528_sub12_107_) {
		    class543.aClass528_Sub12_7266.method9369
			(class528_sub12_107_.method9361((byte) 65), 783584497);
		    class543.aClass528_Sub12_7266.method9382
			(class528_sub12_107_.method9356((byte) 25),
			 class528_sub12_107_.method9364(122347976),
			 (byte) -48);
		}
	    }
	}
    }
    
    public void method6561
	(int i, int i_108_, int i_109_, int i_110_, byte[][][] is,
	 int[] is_111_, int[] is_112_, int[] is_113_, int[] is_114_,
	 int[] is_115_, int i_116_, byte i_117_, int i_118_, int i_119_,
	 boolean bool, boolean bool_120_, int i_121_, boolean bool_122_) {
	((Class559) aClass559_7156).aBool7488 = true;
	((Class538) this).aBool7198 = bool_120_;
	((Class538) this).anInt7167
	    = 594949671 * (i_108_ >> -1532596617 * anInt7148);
	((Class538) this).anInt7185
	    = -1687631003 * (i_110_ >> -1532596617 * anInt7148);
	((Class538) this).anInt7186 = i_108_ * 522894655;
	((Class538) this).anInt7187 = i_110_ * 1345479077;
	((Class538) this).anInt7188 = i_109_ * -2001482953;
	((Class538) this).anInt7193
	    = (((Class538) this).anInt7167 * 1518855953
	       - ((Class538) this).anInt7190 * 411206575);
	if (((Class538) this).anInt7193 * 95897127 < 0) {
	    ((Class538) this).anInt7191
		= -(-911046861 * ((Class538) this).anInt7193);
	    ((Class538) this).anInt7193 = 0;
	} else
	    ((Class538) this).anInt7191 = 0;
	((Class538) this).anInt7192
	    = (((Class538) this).anInt7185 * 2056305841
	       - ((Class538) this).anInt7190 * -57469539);
	if (((Class538) this).anInt7192 * -1672999811 < 0) {
	    ((Class538) this).anInt7157
		= -(-948279029 * ((Class538) this).anInt7192);
	    ((Class538) this).anInt7192 = 0;
	} else
	    ((Class538) this).anInt7157 = 0;
	((Class538) this).anInt7204
	    = (((Class538) this).anInt7190 * 1379920013
	       + ((Class538) this).anInt7167 * -1151584333);
	if (((Class538) this).anInt7204 * 1827546253 > -1102718643 * anInt7158)
	    ((Class538) this).anInt7204 = 1021982657 * anInt7158;
	((Class538) this).anInt7196
	    = (((Class538) this).anInt7190 * 1076315823
	       + ((Class538) this).anInt7185 * -1315510709);
	if (((Class538) this).anInt7196 * -1133876441 > -532233529 * anInt7159)
	    ((Class538) this).anInt7196 = anInt7159 * -2005389471;
	boolean[][] bools = ((Class538) this).aBoolArrayArray7210;
	boolean[][] bools_123_ = ((Class538) this).aBoolArrayArray7194;
	if (((Class538) this).aBool7198) {
	    for (int i_124_ = 0;
		 i_124_ < (((Class538) this).anInt7190 * -117642839
			   + -117642839 * ((Class538) this).anInt7190 + 2);
		 i_124_++) {
		int i_125_ = 0;
		int i_126_ = 0;
		for (int i_127_ = 0;
		     i_127_ < 2 + (((Class538) this).anInt7190 * -117642839
				   + ((Class538) this).anInt7190 * -117642839);
		     i_127_++) {
		    if (i_127_ > 1)
			((Class538) this).anIntArray7209[i_127_ - 2] = i_125_;
		    i_125_ = i_126_;
		    int i_128_
			= (i_124_
			   + (1980357015 * ((Class538) this).anInt7167
			      - ((Class538) this).anInt7190 * -117642839));
		    int i_129_ = (-1890816403 * ((Class538) this).anInt7185
				  - ((Class538) this).anInt7190 * -117642839
				  + i_127_);
		    if (i_128_ >= 0 && i_129_ >= 0
			&& i_128_ < -1102718643 * anInt7158
			&& i_129_ < -532233529 * anInt7159) {
			int i_130_ = i_128_ << anInt7148 * -1532596617;
			int i_131_ = i_129_ << -1532596617 * anInt7148;
			int i_132_ = (aClass137Array7163
					  [aClass137Array7163.length - 1]
					  .method1669(i_128_, i_129_, (byte) 0)
				      - (1000 << anInt7148 * -1532596617 - 7));
			int i_133_
			    = ((aClass137Array7202 != null
				? (aClass137Array7202[0]
				       .method1669(i_128_, i_129_, (byte) 0)
				   + ((Class538) this).anInt7169 * 198274565)
				: (aClass137Array7163[0]
				       .method1669(i_128_, i_129_, (byte) 0)
				   + ((Class538) this).anInt7169 * 198274565))
			       + (1000 << anInt7148 * -1532596617 - 7));
			i_126_ = (((Class538) this).aClass173_7166.method2224
				  (i_130_, i_132_, i_131_, i_130_, i_133_,
				   i_131_));
			((Class538) this).aBoolArrayArray7194[i_124_][i_127_]
			    = 0 == i_126_;
		    } else {
			i_126_ = -1;
			((Class538) this).aBoolArrayArray7194[i_124_][i_127_]
			    = false;
		    }
		    if (i_124_ > 0 && i_127_ > 0) {
			int i_134_
			    = (((Class538) this).anIntArray7209[i_127_ - 1]
			       & ((Class538) this).anIntArray7209[i_127_]
			       & i_125_ & i_126_);
			((Class538) this).aBoolArrayArray7210[i_124_ - 1]
			    [i_127_ - 1]
			    = 0 == i_134_;
		    }
		}
		((Class538) this).anIntArray7209
		    [(-117642839 * ((Class538) this).anInt7190
		      + ((Class538) this).anInt7190 * -117642839)]
		    = i_125_;
		((Class538) this).anIntArray7209
		    [(-117642839 * ((Class538) this).anInt7190
		      + ((Class538) this).anInt7190 * -117642839 + 1)]
		    = i_126_;
	    }
	    if (!bool_122_)
		((Class559) aClass559_7156).aBool7488 = false;
	    else {
		((Class559) aClass559_7156).anIntArray7505 = is_111_;
		((Class559) aClass559_7156).anIntArray7500 = is_112_;
		((Class559) aClass559_7156).anIntArray7501 = is_113_;
		((Class559) aClass559_7156).anIntArray7502 = is_114_;
		((Class559) aClass559_7156).anIntArray7503 = is_115_;
		aClass559_7156.method6779(((Class538) this).aClass173_7166,
					  i_116_);
	    }
	} else {
	    if (null == ((Class538) this).aBoolArrayArray7211)
		((Class538) this).aBoolArrayArray7211
		    = (new boolean
		       [(-117642839 * ((Class538) this).anInt7190
			 + ((Class538) this).anInt7190 * -117642839 + 2)]
		       [2 + (((Class538) this).anInt7190 * -117642839
			     + -117642839 * ((Class538) this).anInt7190)]);
	    for (int i_135_ = 0;
		 i_135_ < ((Class538) this).aBoolArrayArray7211.length;
		 i_135_++) {
		for (int i_136_ = 0;
		     i_136_ < ((Class538) this).aBoolArrayArray7211[0].length;
		     i_136_++)
		    ((Class538) this).aBoolArrayArray7211[i_135_][i_136_]
			= true;
	    }
	    ((Class538) this).aBoolArrayArray7194
		= ((Class538) this).aBoolArrayArray7211;
	    ((Class538) this).aBoolArrayArray7210
		= ((Class538) this).aBoolArrayArray7211;
	    ((Class538) this).anInt7193 = 0;
	    ((Class538) this).anInt7192 = 0;
	    ((Class538) this).anInt7204 = anInt7158 * 1021982657;
	    ((Class538) this).anInt7196 = anInt7159 * -2005389471;
	    ((Class559) aClass559_7156).aBool7488 = false;
	}
	Class386.method4744(this, ((Class538) this).aClass173_7166,
			    -1058491960);
	if (!((Class555) aClass555_7207).aBool7450) {
	    Iterator iterator = aClass555_7207.aList7448.iterator();
	    while (iterator.hasNext()) {
		Class549 class549 = (Class549) iterator.next();
		iterator.remove();
		Class528_Sub3.method9247(class549, (short) 128);
	    }
	}
	if (((Class538) this).aBool7154) {
	    for (int i_137_ = 0;
		 i_137_ < ((Class538) this).anInt7195 * 598332735; i_137_++)
		((Class538) this).aClass543Array7203[i_137_]
		    .method6631(i, bool, 1440506479);
	}
	if (aClass546ArrayArrayArray7164 != null) {
	    method6533(true, -2064158476);
	    ((Class538) this).aClass173_7166
		.method2274(-1, new Class164(1583160, 40, 127, 63, 0, 0, 0));
	    method6562(true, is, i_116_, i_117_, i_121_);
	    ((Class538) this).aClass173_7166.method2276();
	    method6533(false, -1699816303);
	}
	method6562(false, is, i_116_, i_117_, i_121_);
	if (!((Class538) this).aBool7198) {
	    ((Class538) this).aBoolArrayArray7210 = bools;
	    ((Class538) this).aBoolArrayArray7194 = bools_123_;
	}
    }
    
    void method6562(boolean bool, byte[][][] is, int i, byte i_138_,
		    int i_139_) {
	int i_140_ = bool ? 1 : 0;
	((Class538) this).anInt7179 = 0;
	((Class538) this).anInt7180 = 0;
	((Class538) this).anInt7189 += -189146611;
	if (0 == (i_139_ & 0x2)) {
	    for (Class645_Sub1 class645_sub1
		     = ((Class538) this).aClass645_Sub1Array7176[i_140_];
		 null != class645_sub1;
		 class645_sub1
		     = ((Class645_Sub1) class645_sub1).aClass645_Sub1_10673) {
		method6563(class645_sub1, 602565571);
		if ((-1
		     != 830655065 * ((Class645_Sub1) class645_sub1).anInt10677)
		    && !method6566(class645_sub1, bool, is, i, i_138_))
		    ((Class538) this).aClass645_Sub1Array7182
			[((((Class538) this).anInt7179 += -575701895)
			  * 965094857) - 1]
			= class645_sub1;
	    }
	}
	if ((i_139_ & 0x1) == 0) {
	    for (Class645_Sub1 class645_sub1
		     = ((Class538) this).aClass645_Sub1Array7177[i_140_];
		 class645_sub1 != null;
		 class645_sub1
		     = ((Class645_Sub1) class645_sub1).aClass645_Sub1_10673) {
		method6563(class645_sub1, 1080551381);
		if ((830655065 * ((Class645_Sub1) class645_sub1).anInt10677
		     != -1)
		    && !method6566(class645_sub1, bool, is, i, i_138_))
		    ((Class538) this).aClass645_Sub1Array7181
			[((((Class538) this).anInt7180 += 181338745)
			  * -769407031) - 1]
			= class645_sub1;
	    }
	    for (Class645_Sub1 class645_sub1
		     = ((Class538) this).aClass645_Sub1Array7178[i_140_];
		 class645_sub1 != null;
		 class645_sub1
		     = ((Class645_Sub1) class645_sub1).aClass645_Sub1_10673) {
		method6563(class645_sub1, 269752282);
		if ((((Class645_Sub1) class645_sub1).anInt10677 * 830655065
		     != -1)
		    && !method6566(class645_sub1, bool, is, i, i_138_)) {
		    if (class645_sub1.method9775((short) -5607))
			((Class538) this).aClass645_Sub1Array7181
			    [((((Class538) this).anInt7180 += 181338745)
			      * -769407031) - 1]
			    = class645_sub1;
		    else
			((Class538) this).aClass645_Sub1Array7182
			    [((((Class538) this).anInt7179 += -575701895)
			      * 965094857) - 1]
			    = class645_sub1;
		}
	    }
	    if (!bool) {
		for (int i_141_ = 0;
		     i_141_ < -190672245 * ((Class538) this).anInt7172;
		     i_141_++) {
		    method6563((((Class538) this).aClass645_Sub1_Sub5Array7200
				[i_141_]),
			       836845021);
		    if (-1 != 830655065 * ((Class645_Sub1_Sub5)
					   (((Class538) this)
					    .aClass645_Sub1_Sub5Array7200
					    [i_141_])).anInt10677
			&& !method6566((((Class538) this)
					.aClass645_Sub1_Sub5Array7200[i_141_]),
				       bool, is, i, i_138_)) {
			if (((Class538) this).aClass645_Sub1_Sub5Array7200
				[i_141_].method9775((short) -27779))
			    ((Class538) this).aClass645_Sub1Array7181
				[((((Class538) this).anInt7180 += 181338745)
				  * -769407031) - 1]
				= (((Class538) this)
				   .aClass645_Sub1_Sub5Array7200[i_141_]);
			else
			    ((Class538) this).aClass645_Sub1Array7182
				[((((Class538) this).anInt7179 += -575701895)
				  * 965094857) - 1]
				= (((Class538) this)
				   .aClass645_Sub1_Sub5Array7200[i_141_]);
		    }
		}
	    }
	}
	if (((Class538) this).anInt7179 * 965094857 > 0) {
	    method6565(((Class538) this).aClass645_Sub1Array7182, 0,
		       ((Class538) this).anInt7179 * 965094857 - 1);
	    for (int i_142_ = 0;
		 i_142_ < 965094857 * ((Class538) this).anInt7179; i_142_++)
		method6567(((Class538) this).aClass645_Sub1Array7182[i_142_],
			   ((Class538) this).aClass528_Sub12Array7206);
	}
	if (((Class538) this).aBool7154)
	    ((Class538) this).aClass173_7166.method2258(0, null);
	if ((i_139_ & 0x2) == 0) {
	    for (int i_143_ = 0; i_143_ < -353005885 * anInt7184; i_143_++) {
		if (i_143_ >= i && null != is) {
		    int i_144_ = ((Class538) this).aBoolArrayArray7210.length;
		    if ((((Class538) this).aBoolArrayArray7210.length
			 + ((Class538) this).anInt7193 * 95897127)
			> anInt7158 * -1102718643)
			i_144_ -= (((Class538) this).aBoolArrayArray7210.length
				   + 95897127 * ((Class538) this).anInt7193
				   - anInt7158 * -1102718643);
		    int i_145_
			= ((Class538) this).aBoolArrayArray7210[0].length;
		    if ((((Class538) this).aBoolArrayArray7210[0].length
			 + -1672999811 * ((Class538) this).anInt7192)
			> -532233529 * anInt7159)
			i_145_
			    -= (((Class538) this).aBoolArrayArray7210[0].length
				+ -1672999811 * ((Class538) this).anInt7192
				- anInt7159 * -532233529);
		    boolean[][] bools = ((Class538) this).aBoolArrayArray7194;
		    if (((Class538) this).aBool7198) {
			for (int i_146_
				 = ((Class538) this).anInt7191 * -653085379;
			     i_146_ < i_144_; i_146_++) {
			    int i_147_
				= (((Class538) this).anInt7193 * 95897127
				   + i_146_
				   - ((Class538) this).anInt7191 * -653085379);
			    for (int i_148_ = (((Class538) this).anInt7157
					       * 1142990231);
				 i_148_ < i_145_; i_148_++) {
				bools[i_146_][i_148_] = false;
				if (((Class538) this).aBoolArrayArray7210
				    [i_146_][i_148_]) {
				    int i_149_
					= (i_148_
					   + (((Class538) this).anInt7192
					      * -1672999811)
					   - (1142990231
					      * ((Class538) this).anInt7157));
				    for (int i_150_ = i_143_; i_150_ >= 0;
					 i_150_--) {
					if ((aClass546ArrayArrayArray7160
					     [i_150_][i_147_][i_149_]) != null
					    && (aClass546ArrayArrayArray7160
						[i_150_][i_147_][i_149_]
						.aByte7402) == i_143_) {
					    if ((i_150_ >= i
						 && i_138_ == (is[i_150_]
							       [i_147_]
							       [i_149_]))
						|| (aClass559_7156.method6783
						    (i_143_, i_147_, i_149_)))
						bools[i_146_][i_148_] = false;
					    else
						bools[i_146_][i_148_] = true;
					    break;
					}
				    }
				}
			    }
			}
		    }
		    aClass137Array7161[i_143_].method1654
			(((Class538) this).anInt7167 * 1980357015,
			 ((Class538) this).anInt7185 * -1890816403,
			 ((Class538) this).anInt7190 * -117642839,
			 ((Class538) this).aBoolArrayArray7194, false, i_139_);
		} else {
		    int i_151_ = ((Class538) this).aBoolArrayArray7210.length;
		    if ((((Class538) this).aBoolArrayArray7210.length
			 + ((Class538) this).anInt7193 * 95897127)
			> anInt7158 * -1102718643)
			i_151_ -= (((Class538) this).aBoolArrayArray7210.length
				   + ((Class538) this).anInt7193 * 95897127
				   - -1102718643 * anInt7158);
		    int i_152_
			= ((Class538) this).aBoolArrayArray7210[0].length;
		    if ((((Class538) this).aBoolArrayArray7210[0].length
			 + ((Class538) this).anInt7192 * -1672999811)
			> -532233529 * anInt7159)
			i_152_ -= (((Class538) this).anInt7192 * -1672999811
				   + (((Class538) this).aBoolArrayArray7210
				      [0]).length
				   - -532233529 * anInt7159);
		    boolean[][] bools = ((Class538) this).aBoolArrayArray7194;
		    if (((Class538) this).aBool7198) {
			for (int i_153_
				 = ((Class538) this).anInt7191 * -653085379;
			     i_153_ < i_151_; i_153_++) {
			    int i_154_
				= (((Class538) this).anInt7193 * 95897127
				   + i_153_
				   - ((Class538) this).anInt7191 * -653085379);
			    for (int i_155_ = (1142990231
					       * ((Class538) this).anInt7157);
				 i_155_ < i_152_; i_155_++) {
				if ((((Class538) this).aBoolArrayArray7210
				     [i_153_][i_155_])
				    && !(aClass559_7156.method6783
					 (i_143_, i_154_,
					  ((-1672999811
					    * ((Class538) this).anInt7192)
					   + i_155_
					   - (((Class538) this).anInt7157
					      * 1142990231)))))
				    bools[i_153_][i_155_] = true;
				else
				    bools[i_153_][i_155_] = false;
			    }
			}
		    }
		    aClass137Array7161[i_143_].method1654
			(1980357015 * ((Class538) this).anInt7167,
			 -1890816403 * ((Class538) this).anInt7185,
			 -117642839 * ((Class538) this).anInt7190,
			 ((Class538) this).aBoolArrayArray7194, true, i_139_);
		}
	    }
	}
	if (-769407031 * ((Class538) this).anInt7180 > 0) {
	    method6553(((Class538) this).aClass645_Sub1Array7181, 0,
		       ((Class538) this).anInt7180 * -769407031 - 1);
	    for (int i_156_ = 0;
		 i_156_ < ((Class538) this).anInt7180 * -769407031; i_156_++)
		method6567(((Class538) this).aClass645_Sub1Array7181[i_156_],
			   ((Class538) this).aClass528_Sub12Array7206);
	}
    }
    
    void method6563(Class645_Sub1 class645_sub1, int i) {
	Class422 class422 = class645_sub1.method7693().aClass422_4868;
	((Class538) this).aClass173_7166.method2322
	    ((float) (int) class422.aFloat4780,
	     (float) ((int) class422.aFloat4776
		      + (class645_sub1.method9819(-1735669178) >> 1)),
	     (float) (int) class422.aFloat4777,
	     ((Class538) this).aFloatArray7197);
	((Class645_Sub1) class645_sub1).anInt10677
	    = -358621719 * (int) ((Class538) this).aFloatArray7197[2];
    }
    
    public void method6564(int i) {
	for (int i_157_ = 0; i_157_ < 598332735 * ((Class538) this).anInt7195;
	     i_157_++) {
	    if (!((Class538) this).aBoolArray7165[i_157_]) {
		Class543 class543
		    = ((Class538) this).aClass543Array7203[i_157_];
		Class528_Sub12 class528_sub12 = class543.aClass528_Sub12_7266;
		int i_158_ = class543.anInt7262 * 264933169;
		int i_159_ = (class528_sub12.method9357(1665590611)
			      - ((Class538) this).anInt7155 * 486809201);
		int i_160_ = 1 + (2 * i_159_ >> -1532596617 * anInt7148);
		int i_161_ = 0;
		int[] is = new int[i_160_ * i_160_];
		int i_162_ = (class528_sub12.method9366(1078398087) - i_159_
			      >> -1532596617 * anInt7148);
		int i_163_ = (class528_sub12.method9370(1221114533) - i_159_
			      >> anInt7148 * -1532596617);
		int i_164_ = (class528_sub12.method9370(1221114533) + i_159_
			      >> anInt7148 * -1532596617);
		if (i_163_ < 0) {
		    i_161_ -= i_163_;
		    i_163_ = 0;
		}
		if (i_164_ >= -532233529 * anInt7159)
		    i_164_ = anInt7159 * -532233529 - 1;
		for (int i_165_ = i_163_; i_165_ <= i_164_; i_165_++) {
		    int i_166_ = ((Class543) class543).aShortArray7267[i_161_];
		    int i_167_ = i_166_ >>> 8;
		    int i_168_ = i_167_ + i_161_ * i_160_;
		    int i_169_ = i_162_ + (i_166_ >>> 8);
		    int i_170_ = i_169_ + (i_166_ & 0xff) - 1;
		    if (i_169_ < 0) {
			i_168_ -= i_169_;
			i_169_ = 0;
		    }
		    if (i_170_ >= anInt7158 * -1102718643)
			i_170_ = -1102718643 * anInt7158 - 1;
		    for (int i_171_ = i_169_; i_171_ <= i_170_; i_171_++) {
			int i_172_ = 1;
			Class645_Sub1_Sub5 class645_sub1_sub5
			    = method6583(i_158_, i_171_, i_165_, null,
					 2138503896);
			if (class645_sub1_sub5 != null
			    && 0 != (((Class645_Sub1_Sub5) class645_sub1_sub5)
				     .aByte11748)) {
			    if (1 == (((Class645_Sub1_Sub5) class645_sub1_sub5)
				      .aByte11748)) {
				boolean bool = i_171_ - 1 >= i_169_;
				boolean bool_173_ = 1 + i_171_ <= i_170_;
				if (!bool && i_165_ + 1 <= i_164_) {
				    int i_174_
					= (((Class543) class543)
					   .aShortArray7267[1 + i_161_]);
				    int i_175_ = (i_174_ >>> 8) + i_162_;
				    int i_176_ = (i_174_ & 0xff) + i_175_;
				    bool = i_171_ > i_175_ && i_171_ < i_176_;
				}
				if (!bool_173_ && i_165_ - 1 >= i_163_) {
				    int i_177_
					= (((Class543) class543)
					   .aShortArray7267[i_161_ - 1]);
				    int i_178_ = i_162_ + (i_177_ >>> 8);
				    int i_179_ = i_178_ + (i_177_ & 0xff);
				    bool_173_
					= i_171_ > i_178_ && i_171_ < i_179_;
				}
				if (bool && !bool_173_)
				    i_172_ = 4;
				else if (bool_173_ && !bool)
				    i_172_ = 2;
			    } else {
				boolean bool = i_171_ - 1 >= i_169_;
				boolean bool_180_ = 1 + i_171_ <= i_170_;
				if (!bool && i_165_ - 1 >= i_163_) {
				    int i_181_
					= (((Class543) class543)
					   .aShortArray7267[i_161_ - 1]);
				    int i_182_ = i_162_ + (i_181_ >>> 8);
				    int i_183_ = (i_181_ & 0xff) + i_182_;
				    bool = i_171_ > i_182_ && i_171_ < i_183_;
				}
				if (!bool_180_ && 1 + i_165_ <= i_164_) {
				    int i_184_
					= (((Class543) class543)
					   .aShortArray7267[1 + i_161_]);
				    int i_185_ = (i_184_ >>> 8) + i_162_;
				    int i_186_ = i_185_ + (i_184_ & 0xff);
				    bool_180_
					= i_171_ > i_185_ && i_171_ < i_186_;
				}
				if (bool && !bool_180_)
				    i_172_ = 3;
				else if (bool_180_ && !bool)
				    i_172_ = 5;
			    }
			}
			is[i_168_++] = i_172_;
		    }
		    i_161_++;
		}
		((Class538) this).aBoolArray7165[i_157_] = true;
		if (aBool7171)
		    aClass137Array7161[i_158_].method1670(class528_sub12, is);
	    }
	}
    }
    
    void method6565(Class645_Sub1[] class645_sub1s, int i, int i_187_) {
	if (i < i_187_) {
	    int i_188_ = (i_187_ + i) / 2;
	    int i_189_ = i;
	    Class645_Sub1 class645_sub1 = class645_sub1s[i_188_];
	    class645_sub1s[i_188_] = class645_sub1s[i_187_];
	    class645_sub1s[i_187_] = class645_sub1;
	    int i_190_
		= 830655065 * ((Class645_Sub1) class645_sub1).anInt10677;
	    for (int i_191_ = i; i_191_ < i_187_; i_191_++) {
		if ((830655065
		     * ((Class645_Sub1) class645_sub1s[i_191_]).anInt10677)
		    < (i_191_ & 0x1) + i_190_) {
		    Class645_Sub1 class645_sub1_192_ = class645_sub1s[i_191_];
		    class645_sub1s[i_191_] = class645_sub1s[i_189_];
		    class645_sub1s[i_189_++] = class645_sub1_192_;
		}
	    }
	    class645_sub1s[i_187_] = class645_sub1s[i_189_];
	    class645_sub1s[i_189_] = class645_sub1;
	    method6565(class645_sub1s, i, i_189_ - 1);
	    method6565(class645_sub1s, i_189_ + 1, i_187_);
	}
    }
    
    boolean method6566(Class645_Sub1 class645_sub1, boolean bool,
		       byte[][][] is, int i, byte i_193_) {
	if (!((Class538) this).aBool7198)
	    return false;
	if (class645_sub1 instanceof Class645_Sub1_Sub5) {
	    int i_194_ = ((Class645_Sub1_Sub5) class645_sub1).aShort11743;
	    int i_195_ = ((Class645_Sub1_Sub5) class645_sub1).aShort11746;
	    int i_196_ = ((Class645_Sub1_Sub5) class645_sub1).aShort11747;
	    int i_197_ = ((Class645_Sub1_Sub5) class645_sub1).aShort11745;
	    for (int i_198_ = i_196_; i_198_ <= i_194_; i_198_++) {
		for (int i_199_ = i_197_; i_199_ <= i_195_; i_199_++) {
		    if (class645_sub1.aByte10674 < -353005885 * anInt7184
			&& i_198_ >= 95897127 * ((Class538) this).anInt7193
			&& i_198_ < 1827546253 * ((Class538) this).anInt7204
			&& i_199_ >= -1672999811 * ((Class538) this).anInt7192
			&& (i_199_
			    < ((Class538) this).anInt7196 * -1133876441)) {
			if ((is != null && class645_sub1.aByte10675 >= i
			     && (is[class645_sub1.aByte10675][i_198_][i_199_]
				 == i_193_))
			    || !class645_sub1.method9782((byte) 108)
			    || class645_sub1.method9781((((Class538) this)
							 .aClass173_7166),
							(byte) 81)) {
			    if (!bool
				&& i_198_ >= 1980357015 * (((Class538) this)
							   .anInt7167) - 16
				&& i_198_ <= 1980357015 * (((Class538) this)
							   .anInt7167) + 16
				&& i_199_ >= (((Class538) this).anInt7185
					      * -1890816403) - 16
				&& i_199_ <= (((Class538) this).anInt7185
					      * -1890816403) + 16)
				class645_sub1.method9779((((Class538) this)
							  .aClass173_7166),
							 -1137075754);
			    return true;
			}
			return false;
		    }
		}
	    }
	    return true;
	}
	Class422 class422 = class645_sub1.method7693().aClass422_4868;
	int i_200_ = (int) class422.aFloat4780 >> anInt7148 * -1532596617;
	int i_201_ = (int) class422.aFloat4777 >> anInt7148 * -1532596617;
	if (class645_sub1.aByte10674 < anInt7184 * -353005885
	    && i_200_ >= 95897127 * ((Class538) this).anInt7193
	    && i_200_ < ((Class538) this).anInt7204 * 1827546253
	    && i_201_ >= -1672999811 * ((Class538) this).anInt7192
	    && i_201_ < -1133876441 * ((Class538) this).anInt7196) {
	    if ((is != null && class645_sub1.aByte10675 >= i
		 && i_193_ == is[class645_sub1.aByte10675][i_200_][i_201_])
		|| !class645_sub1.method9782((byte) 82)
		|| class645_sub1.method9781(((Class538) this).aClass173_7166,
					    (byte) 66)) {
		if (!bool
		    && i_200_ >= 1980357015 * ((Class538) this).anInt7167 - 16
		    && i_200_ <= 16 + 1980357015 * ((Class538) this).anInt7167
		    && i_201_ >= ((Class538) this).anInt7185 * -1890816403 - 16
		    && (i_201_
			<= -1890816403 * ((Class538) this).anInt7185 + 16))
		    class645_sub1.method9779(((Class538) this).aClass173_7166,
					     -1137075754);
		return true;
	    }
	    return false;
	}
	return true;
    }
    
    void method6567(Class645_Sub1 class645_sub1,
		    Class528_Sub12[] class528_sub12s) {
	if (((Class538) this).aBool7154) {
	    int i = class645_sub1.method9817(class528_sub12s, 520199231);
	    ((Class538) this).aClass173_7166.method2258(i, class528_sub12s);
	}
	if (aClass137Array7202 == aClass137Array7161) {
	    boolean bool = false;
	    boolean bool_202_ = false;
	    Class422 class422 = class645_sub1.method7693().aClass422_4868;
	    int i;
	    int i_203_;
	    if (class645_sub1 instanceof Class645_Sub1_Sub5) {
		i = ((Class645_Sub1_Sub5) class645_sub1).aShort11747;
		i_203_ = ((Class645_Sub1_Sub5) class645_sub1).aShort11745;
	    } else {
		i = (int) class422.aFloat4780 >> anInt7148 * -1532596617;
		i_203_ = (int) class422.aFloat4777 >> -1532596617 * anInt7148;
	    }
	    i = Math.min(-1102718643 * anInt7158 - 1, Math.max(0, i));
	    i_203_ = Math.min(-532233529 * anInt7159 - 1, Math.max(0, i_203_));
	    Class164 class164 = new Class164();
	    class164.anInt1827
		= method6539(i, i_203_, (short) 512) * -773326249;
	    class164.anInt1828 = method6575(i, i_203_, 1229029821) * 516788591;
	    class164.anInt1829
		= method6540(i, i_203_, (byte) -82) * -1923235093;
	    class164.anInt1831
		= method6548(i, i_203_, 1239022665) * -1247427665;
	    class164.anInt1832
		= method6541(i, i_203_, -1460251593) * 1420649565;
	    class164.anInt1833
		= method6542(i, i_203_, 1607220441) * -589047283;
	    ((Class538) this).aClass173_7166.method2152
		(aClass137Array7163[0].method1656((int) class422.aFloat4780,
						  (int) class422.aFloat4777,
						  1124196448),
		 class164);
	}
	Class549 class549
	    = class645_sub1.method9813(((Class538) this).aClass173_7166,
				       -1424328917);
	if (class549 != null) {
	    if (((Class549) class549).aBool7419) {
		class549.aClass645_Sub1_7417 = class645_sub1;
		aClass555_7207.method6739(class549, 190229260);
	    } else
		Class528_Sub3.method9247(class549, (short) 128);
	}
    }
    
    public void method6568(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_204_, int i_205_, boolean[] bools,
			   int i_206_) {
	if (aClass137Array7161 != aClass137Array7202) {
	    int i_207_
		= aClass137Array7163[i].method1656(i_204_, i_205_, 899061001);
	    for (int i_208_ = 0; i_208_ <= i; i_208_++) {
		if (bools == null || bools[i_208_]) {
		    Class137 class137 = aClass137Array7163[i_208_];
		    if (class137 != null)
			class137.method1662
			    (class528_sub21_sub12, i_204_,
			     i_207_ - class137.method1656(i_204_, i_205_,
							  2004061686),
			     i_205_, 0, false);
		}
	    }
	}
    }
    
    void method6569(int i, int i_209_, int i_210_) {
	Class528_Sub21_Sub12 class528_sub21_sub12 = null;
	for (int i_211_ = i; i_211_ < i_209_; i_211_++) {
	    Class137 class137 = aClass137Array7163[i_211_];
	    if (null != class137) {
		for (int i_212_ = 0; i_212_ < anInt7159 * -532233529;
		     i_212_++) {
		    for (int i_213_ = 0; i_213_ < anInt7158 * -1102718643;
			 i_213_++) {
			class528_sub21_sub12
			    = class137.method1660(i_213_, i_212_,
						  class528_sub21_sub12);
			if (null != class528_sub21_sub12) {
			    int i_214_ = i_213_ << anInt7148 * -1532596617;
			    int i_215_ = i_212_ << -1532596617 * anInt7148;
			    for (int i_216_ = i_211_ - 1; i_216_ >= 0;
				 i_216_--) {
				Class137 class137_217_
				    = aClass137Array7163[i_216_];
				if (null != class137_217_) {
				    int i_218_
					= (class137.method1669(i_213_, i_212_,
							       (byte) 0)
					   - (class137_217_.method1669
					      (i_213_, i_212_, (byte) 0)));
				    int i_219_
					= (class137.method1669(i_213_ + 1,
							       i_212_,
							       (byte) 0)
					   - (class137_217_.method1669
					      (1 + i_213_, i_212_, (byte) 0)));
				    int i_220_
					= (class137.method1669(1 + i_213_,
							       i_212_ + 1,
							       (byte) 0)
					   - (class137_217_.method1669
					      (i_213_ + 1, i_212_ + 1,
					       (byte) 0)));
				    int i_221_
					= (class137.method1669(i_213_,
							       i_212_ + 1,
							       (byte) 0)
					   - (class137_217_.method1669
					      (i_213_, 1 + i_212_, (byte) 0)));
				    class137_217_.method1661
					(class528_sub21_sub12, i_214_,
					 ((i_221_ + (i_218_ + i_219_ + i_220_))
					  / 4),
					 i_215_, 0, false);
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method6570(byte i) {
	method6569(1, anInt7184 * -353005885, 1698274862);
    }
    
    public void method6571(int i, int i_222_, int i_223_, byte i_224_) {
	List list
	    = (List) ((Class538) this).aHashMap7205.get(Integer.valueOf(i));
	if (null != list) {
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class543 class543 = (Class543) iterator.next();
		class543.aClass528_Sub12_7266.method9382(i_222_, i_223_,
							 (byte) -111);
	    }
	}
    }
    
    public HashMap method6572(byte i) {
	((Class538) this).aHashMap7199.clear();
	Iterator iterator
	    = ((Class538) this).aHashMap7205.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    ((Class538) this).aHashMap7199.put(entry.getKey(),
					       (((Class543)
						 ((List) entry.getValue())
						     .get(0))
						.aClass528_Sub12_7266));
	}
	return ((Class538) this).aHashMap7199;
    }
    
    public void method6573(HashMap hashmap, int i) {
	((Class538) this).aHashMap7199 = hashmap;
    }
    
    public void method6574(int i) {
	/* empty */
    }
    
    public int method6575(int i, int i_225_, int i_226_) {
	return (((Class538) this).aShortArrayArray7149 != null
		? ((Class538) this).aShortArrayArray7149[i][i_225_] & 0xffff
		: 0);
    }
    
    public void method6576(int i, int i_227_, int i_228_, int i_229_,
			   Class645_Sub1_Sub2 class645_sub1_sub2, int i_230_) {
	Class546 class546 = method6536(i, i_227_, i_228_, -1727155794);
	if (class546 != null) {
	    class645_sub1_sub2.method7688
		(new Class422((float) (486809201 * ((Class538) this).anInt7155
				       + (i_227_ << -1532596617 * anInt7148)),
			      (float) i_229_,
			      (float) ((i_228_ << -1532596617 * anInt7148)
				       + (((Class538) this).anInt7155
					  * 486809201))));
	    ((Class546) class546).aClass645_Sub1_Sub2_7398
		= class645_sub1_sub2;
	    int i_231_ = aClass137Array7161 == aClass137Array7202 ? 1 : 0;
	    if (class645_sub1_sub2.method9797(-2019772110)) {
		if (class645_sub1_sub2.method9775((short) -27274)) {
		    ((Class645_Sub1_Sub2) class645_sub1_sub2)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7177[i_231_];
		    ((Class538) this).aClass645_Sub1Array7177[i_231_]
			= class645_sub1_sub2;
		} else {
		    ((Class645_Sub1_Sub2) class645_sub1_sub2)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7176[i_231_];
		    ((Class538) this).aClass645_Sub1Array7176[i_231_]
			= class645_sub1_sub2;
		}
	    } else {
		((Class645_Sub1_Sub2) class645_sub1_sub2).aClass645_Sub1_10673
		    = ((Class538) this).aClass645_Sub1Array7178[i_231_];
		((Class538) this).aClass645_Sub1Array7178[i_231_]
		    = class645_sub1_sub2;
	    }
	}
    }
    
    public void method6577() {
	for (int i = 0; i < anInt7158 * -1102718643; i++) {
	    for (int i_232_ = 0; i_232_ < anInt7159 * -532233529; i_232_++) {
		if (null == aClass546ArrayArrayArray7160[0][i][i_232_])
		    aClass546ArrayArrayArray7160[0][i][i_232_]
			= new Class546(0);
	    }
	}
    }
    
    public void method6578() {
	for (int i = 0; i < anInt7158 * -1102718643; i++) {
	    for (int i_233_ = 0; i_233_ < anInt7159 * -532233529; i_233_++) {
		if (null == aClass546ArrayArrayArray7160[0][i][i_233_])
		    aClass546ArrayArrayArray7160[0][i][i_233_]
			= new Class546(0);
	    }
	}
    }
    
    public void method6579() {
	for (int i = 0; i < anInt7158 * -1102718643; i++) {
	    for (int i_234_ = 0; i_234_ < anInt7159 * -532233529; i_234_++) {
		if (null == aClass546ArrayArrayArray7160[0][i][i_234_])
		    aClass546ArrayArrayArray7160[0][i][i_234_]
			= new Class546(0);
	    }
	}
    }
    
    public int method6580(int i, int i_235_) {
	return (null != ((Class538) this).anIntArrayArray7175
		? ((Class538) this).anIntArrayArray7175[i][i_235_] & 0xffffff
		: 0);
    }
    
    public boolean method6581(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_236_, int i_237_, boolean[] bools,
			      byte i_238_) {
	boolean bool = false;
	if (aClass137Array7161 != aClass137Array7202) {
	    int i_239_
		= aClass137Array7163[i].method1656(i_236_, i_237_, 1348184033);
	    int i_240_ = 0;
	    for (/**/; i_240_ <= i; i_240_++) {
		Class137 class137 = aClass137Array7163[i_240_];
		if (null != class137) {
		    int i_241_ = i_239_ - class137.method1656(i_236_, i_237_,
							      1337202591);
		    if (null != bools) {
			bools[i_240_]
			    = class137.method1663(class528_sub21_sub12, i_236_,
						  i_241_, i_237_, 0, false);
			if (!bools[i_240_])
			    continue;
		    }
		    class137.method1661(class528_sub21_sub12, i_236_, i_241_,
					i_237_, 0, false);
		    bool = true;
		}
	    }
	}
	return bool;
    }
    
    public void method6582(int i, int i_242_, int i_243_, int i_244_) {
	boolean bool = (aClass546ArrayArrayArray7160[0][i_242_][i_243_] != null
			&& null != (aClass546ArrayArrayArray7160[0][i_242_]
				    [i_243_].aClass546_7392));
	for (int i_245_ = i; i_245_ >= 0; i_245_--) {
	    if (aClass546ArrayArrayArray7160[i_245_][i_242_][i_243_] == null) {
		Class546 class546
		    = (aClass546ArrayArrayArray7160[i_245_][i_242_][i_243_]
		       = new Class546(i_245_));
		if (bool)
		    class546.aByte7402++;
	    }
	}
    }
    
    public Class645_Sub1_Sub5 method6583(int i, int i_246_, int i_247_,
					 Interface62 interface62, int i_248_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_246_][i_247_];
	if (class546 == null)
	    return null;
	for (Class542 class542 = class546.aClass542_7399; class542 != null;
	     class542 = class542.aClass542_7238) {
	    Class645_Sub1_Sub5 class645_sub1_sub5
		= class542.aClass645_Sub1_Sub5_7239;
	    if ((null == interface62
		 || interface62.method406(class645_sub1_sub5, -1356334257))
		&& i_246_ == class645_sub1_sub5.aShort11747
		&& class645_sub1_sub5.aShort11745 == i_247_)
		return class645_sub1_sub5;
	}
	return null;
    }
    
    public int method6584(int i, int i_249_) {
	return (((Class538) this).aByteArrayArray7168 != null
		? ((Class538) this).aByteArrayArray7168[i][i_249_] & 0xff : 0);
    }
    
    public Class538(Class173 class173, int i, int i_250_, int i_251_,
		    int i_252_, int i_253_, boolean bool, boolean bool_254_) {
	((Class538) this).anInt7172 = 0;
	((Class538) this).anInt7173 = 10093;
	((Class538) this).anInt7174 = 5094;
	((Class538) this).anInt7147 = 5088;
	((Class538) this).aFloatArray7197 = new float[3];
	((Class538) this).aClass528_Sub12Array7206 = new Class528_Sub12[8];
	((Class538) this).anInt7183 = 65483;
	((Class538) this).aHashMap7205 = new HashMap();
	((Class538) this).aHashMap7199 = new HashMap();
	((Class538) this).aClass173_7166 = class173;
	((Class538) this).aBool7154
	    = ((Class538) this).aClass173_7166.method2256() > 0;
	anInt7148 = -1971729593 * i;
	((Class538) this).anInt7169
	    = (1 << -1532596617 * anInt7148) * 2051944141;
	((Class538) this).anInt7155
	    = (((Class538) this).anInt7169 * 198274565 >> 1) * -436477295;
	anInt7184 = -1178005013 * i_250_;
	anInt7158 = -178714747 * i_251_;
	anInt7159 = 153313015 * i_252_;
	((Class538) this).anInt7190 = 1649527449 * i_253_;
	((Class538) this).aClass60_7153 = new Class60();
	aClass559_7156 = new Class559(this);
	aClass546ArrayArrayArray7162
	    = (new Class546[i_250_][anInt7158 * -1102718643]
	       [-532233529 * anInt7159]);
	aClass137Array7163 = new Class137[i_250_];
	if (bool) {
	    ((Class538) this).anIntArrayArray7175
		= new int[-1102718643 * anInt7158][anInt7159 * -532233529];
	    ((Class538) this).aByteArrayArray7168
		= new byte[-1102718643 * anInt7158][anInt7159 * -532233529];
	    ((Class538) this).aShortArrayArray7149
		= new short[-1102718643 * anInt7158][-532233529 * anInt7159];
	    ((Class538) this).aByteArrayArray7152
		= new byte[anInt7158 * -1102718643][anInt7159 * -532233529];
	    ((Class538) this).aByteArrayArray7170
		= new byte[anInt7158 * -1102718643][-532233529 * anInt7159];
	    ((Class538) this).aByteArrayArray7201
		= new byte[-1102718643 * anInt7158][anInt7159 * -532233529];
	    aClass546ArrayArrayArray7164
		= (new Class546[1][anInt7158 * -1102718643]
		   [-532233529 * anInt7159]);
	    aClass137Array7202 = new Class137[1];
	}
	if (bool_254_) {
	    ((Class538) this).aLongArrayArrayArray7150
		= new long[i_250_][i_251_][i_252_];
	    ((Class538) this).aClass543Array7203 = new Class543[65483];
	    ((Class538) this).aBoolArray7165 = new boolean[65483];
	    ((Class538) this).anInt7195 = 0;
	}
	method6533(false, -437324121);
	((Class538) this).aClass645_Sub1Array7176 = new Class645_Sub1[2];
	((Class538) this).aClass645_Sub1Array7177 = new Class645_Sub1[2];
	((Class538) this).aClass645_Sub1Array7178 = new Class645_Sub1[2];
	((Class538) this).aClass645_Sub1Array7182 = new Class645_Sub1[10093];
	((Class538) this).anInt7179 = 0;
	((Class538) this).aClass645_Sub1Array7181 = new Class645_Sub1[5094];
	((Class538) this).anInt7180 = 0;
	((Class538) this).aClass645_Sub1_Sub5Array7200
	    = new Class645_Sub1_Sub5[5088];
	((Class538) this).anInt7172 = 0;
	((Class538) this).aBoolArrayArray7210
	    = (new boolean
	       [(-117642839 * ((Class538) this).anInt7190
		 + ((Class538) this).anInt7190 * -117642839 + 1)]
	       [(-117642839 * ((Class538) this).anInt7190
		 + ((Class538) this).anInt7190 * -117642839 + 1)]);
	((Class538) this).aBoolArrayArray7194
	    = (new boolean
	       [2 + (((Class538) this).anInt7190 * -117642839
		     + ((Class538) this).anInt7190 * -117642839)]
	       [2 + (-117642839 * ((Class538) this).anInt7190
		     + -117642839 * ((Class538) this).anInt7190)]);
	((Class538) this).anIntArray7209
	    = new int[(-117642839 * ((Class538) this).anInt7190
		       + ((Class538) this).anInt7190 * -117642839 + 2)];
	aClass555_7207 = new Class555(false);
    }
    
    public Class645_Sub1_Sub3 method6585(int i, int i_255_, int i_256_,
					 byte i_257_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_255_][i_256_];
	if (null != class546) {
	    method6552(class546.aClass645_Sub1_Sub3_7394, -654582622);
	    if (class546.aClass645_Sub1_Sub3_7394 != null) {
		Class645_Sub1_Sub3 class645_sub1_sub3
		    = class546.aClass645_Sub1_Sub3_7394;
		class546.aClass645_Sub1_Sub3_7394 = null;
		return class645_sub1_sub3;
	    }
	}
	return null;
    }
    
    public void method6586
	(int i, int i_258_, int i_259_, Class645_Sub1_Sub3 class645_sub1_sub3,
	 Class645_Sub1_Sub3 class645_sub1_sub3_260_, int i_261_) {
	Class546 class546 = method6536(i, i_258_, i_259_, -2027844904);
	if (null != class546) {
	    class546.aClass645_Sub1_Sub3_7393 = class645_sub1_sub3;
	    class546.aClass645_Sub1_Sub3_7394 = class645_sub1_sub3_260_;
	    int i_262_ = aClass137Array7161 == aClass137Array7202 ? 1 : 0;
	    if (class645_sub1_sub3.method9797(1686382007)) {
		if (class645_sub1_sub3.method9775((short) -21701)) {
		    ((Class645_Sub1_Sub3) class645_sub1_sub3)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7177[i_262_];
		    ((Class538) this).aClass645_Sub1Array7177[i_262_]
			= class645_sub1_sub3;
		} else {
		    ((Class645_Sub1_Sub3) class645_sub1_sub3)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7176[i_262_];
		    ((Class538) this).aClass645_Sub1Array7176[i_262_]
			= class645_sub1_sub3;
		}
	    } else {
		((Class645_Sub1_Sub3) class645_sub1_sub3).aClass645_Sub1_10673
		    = ((Class538) this).aClass645_Sub1Array7178[i_262_];
		((Class538) this).aClass645_Sub1Array7178[i_262_]
		    = class645_sub1_sub3;
	    }
	    if (class645_sub1_sub3_260_ != null) {
		if (class645_sub1_sub3_260_.method9797(-2147356927)) {
		    if (class645_sub1_sub3_260_.method9775((short) -28633)) {
			((Class645_Sub1_Sub3) class645_sub1_sub3_260_)
			    .aClass645_Sub1_10673
			    = (((Class538) this).aClass645_Sub1Array7177
			       [i_262_]);
			((Class538) this).aClass645_Sub1Array7177[i_262_]
			    = class645_sub1_sub3_260_;
		    } else {
			((Class645_Sub1_Sub3) class645_sub1_sub3_260_)
			    .aClass645_Sub1_10673
			    = (((Class538) this).aClass645_Sub1Array7176
			       [i_262_]);
			((Class538) this).aClass645_Sub1Array7176[i_262_]
			    = class645_sub1_sub3_260_;
		    }
		} else {
		    ((Class645_Sub1_Sub3) class645_sub1_sub3_260_)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7178[i_262_];
		    ((Class538) this).aClass645_Sub1Array7178[i_262_]
			= class645_sub1_sub3_260_;
		}
	    }
	}
    }
    
    public void method6587() {
	for (int i = 0; i < anInt7184 * -353005885; i++) {
	    for (int i_263_ = 0; i_263_ < -1102718643 * anInt7158; i_263_++) {
		for (int i_264_ = 0; i_264_ < anInt7159 * -532233529;
		     i_264_++) {
		    Class546 class546
			= aClass546ArrayArrayArray7160[i][i_263_][i_264_];
		    if (class546 != null) {
			Class645_Sub1_Sub3 class645_sub1_sub3
			    = class546.aClass645_Sub1_Sub3_7393;
			Class645_Sub1_Sub3 class645_sub1_sub3_265_
			    = class546.aClass645_Sub1_Sub3_7394;
			if (null != class645_sub1_sub3
			    && class645_sub1_sub3.method9771(-395745760)) {
			    method6596(class645_sub1_sub3, i, i_263_, i_264_,
				       1, 1);
			    if (null != class645_sub1_sub3_265_
				&& class645_sub1_sub3_265_
				       .method9771(-395745760)) {
				method6596(class645_sub1_sub3_265_, i, i_263_,
					   i_264_, 1, 1);
				class645_sub1_sub3_265_.method9798
				    (((Class538) this).aClass173_7166,
				     class645_sub1_sub3, 0, 0, 0, false,
				     -1166459533);
				class645_sub1_sub3_265_.method9777(-125190125);
			    }
			    class645_sub1_sub3.method9777(-957662868);
			}
			for (Class542 class542 = class546.aClass542_7399;
			     class542 != null;
			     class542 = class542.aClass542_7238) {
			    Class645_Sub1_Sub5 class645_sub1_sub5
				= class542.aClass645_Sub1_Sub5_7239;
			    if (null != class645_sub1_sub5
				&& class645_sub1_sub5.method9771(-395745760)) {
				method6596(class645_sub1_sub5, i, i_263_,
					   i_264_,
					   (class645_sub1_sub5.aShort11743
					    - class645_sub1_sub5.aShort11747
					    + 1),
					   1 + (class645_sub1_sub5.aShort11746
						- (class645_sub1_sub5
						   .aShort11745)));
				class645_sub1_sub5.method9777(-908401208);
			    }
			}
			Class645_Sub1_Sub4 class645_sub1_sub4
			    = class546.aClass645_Sub1_Sub4_7397;
			if (null != class645_sub1_sub4
			    && class645_sub1_sub4.method9771(-395745760)) {
			    method6559(class645_sub1_sub4, i, i_263_, i_264_,
				       (byte) 37);
			    class645_sub1_sub4.method9777(-1004670591);
			}
		    }
		}
	    }
	}
    }
    
    public void method6588(int i, int i_266_, int i_267_, int i_268_,
			   int i_269_, int i_270_, int i_271_, int i_272_,
			   byte i_273_) {
	if (((Class538) this).anIntArrayArray7175 != null)
	    ((Class538) this).anIntArrayArray7175[i][i_266_]
		= ~0xffffff | i_267_;
	if (null != ((Class538) this).aShortArrayArray7149)
	    ((Class538) this).aShortArrayArray7149[i][i_266_] = (short) i_268_;
	if (((Class538) this).aByteArrayArray7168 != null)
	    ((Class538) this).aByteArrayArray7168[i][i_266_] = (byte) i_269_;
	if (null != ((Class538) this).aByteArrayArray7152)
	    ((Class538) this).aByteArrayArray7152[i][i_266_] = (byte) i_270_;
	if (null != ((Class538) this).aByteArrayArray7170)
	    ((Class538) this).aByteArrayArray7170[i][i_266_] = (byte) i_271_;
	if (null != ((Class538) this).aByteArrayArray7201)
	    ((Class538) this).aByteArrayArray7201[i][i_266_] = (byte) i_272_;
    }
    
    public void method6589() {
	for (int i = 0; i < ((Class538) this).anInt7172 * -190672245; i++) {
	    Class645_Sub1_Sub5 class645_sub1_sub5
		= ((Class538) this).aClass645_Sub1_Sub5Array7200[i];
	    method6551(class645_sub1_sub5, true, (byte) 94);
	    ((Class538) this).aClass645_Sub1_Sub5Array7200[i] = null;
	}
	((Class538) this).anInt7172 = 0;
    }
    
    public Class645_Sub1_Sub1 method6590(int i, int i_274_, int i_275_,
					 int i_276_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_274_][i_275_];
	if (null != class546) {
	    method6552(class546.aClass645_Sub1_Sub1_7396, -654582622);
	    if (class546.aClass645_Sub1_Sub1_7396 != null) {
		Class645_Sub1_Sub1 class645_sub1_sub1
		    = class546.aClass645_Sub1_Sub1_7396;
		class546.aClass645_Sub1_Sub1_7396 = null;
		return class645_sub1_sub1;
	    }
	}
	return null;
    }
    
    public Class645_Sub1_Sub4 method6591(int i, int i_277_, int i_278_,
					 int i_279_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_277_][i_278_];
	if (null == class546 || class546.aClass645_Sub1_Sub4_7397 == null)
	    return null;
	return class546.aClass645_Sub1_Sub4_7397;
    }
    
    public Class645_Sub1_Sub4 method6592(int i, int i_280_, int i_281_,
					 byte i_282_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_280_][i_281_];
	if (null == class546)
	    return null;
	method6552(class546.aClass645_Sub1_Sub4_7397, -654582622);
	if (null != class546.aClass645_Sub1_Sub4_7397) {
	    Class645_Sub1_Sub4 class645_sub1_sub4
		= class546.aClass645_Sub1_Sub4_7397;
	    class546.aClass645_Sub1_Sub4_7397 = null;
	    return class645_sub1_sub4;
	}
	return null;
    }
    
    public Class645_Sub1_Sub3 method6593(int i, int i_283_, int i_284_,
					 int i_285_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_283_][i_284_];
	if (class546 != null) {
	    method6552(class546.aClass645_Sub1_Sub3_7393, -654582622);
	    if (null != class546.aClass645_Sub1_Sub3_7393) {
		Class645_Sub1_Sub3 class645_sub1_sub3
		    = class546.aClass645_Sub1_Sub3_7393;
		class546.aClass645_Sub1_Sub3_7393 = null;
		return class645_sub1_sub3;
	    }
	}
	return null;
    }
    
    public void method6594(int i) {
	/* empty */
    }
    
    public void method6595() {
	for (int i = 0; i < anInt7184 * -353005885; i++) {
	    for (int i_286_ = 0; i_286_ < -1102718643 * anInt7158; i_286_++) {
		for (int i_287_ = 0; i_287_ < anInt7159 * -532233529;
		     i_287_++) {
		    Class546 class546
			= aClass546ArrayArrayArray7160[i][i_286_][i_287_];
		    if (class546 != null) {
			Class645_Sub1_Sub3 class645_sub1_sub3
			    = class546.aClass645_Sub1_Sub3_7393;
			Class645_Sub1_Sub3 class645_sub1_sub3_288_
			    = class546.aClass645_Sub1_Sub3_7394;
			if (null != class645_sub1_sub3
			    && class645_sub1_sub3.method9771(-395745760)) {
			    method6596(class645_sub1_sub3, i, i_286_, i_287_,
				       1, 1);
			    if (null != class645_sub1_sub3_288_
				&& class645_sub1_sub3_288_
				       .method9771(-395745760)) {
				method6596(class645_sub1_sub3_288_, i, i_286_,
					   i_287_, 1, 1);
				class645_sub1_sub3_288_.method9798
				    (((Class538) this).aClass173_7166,
				     class645_sub1_sub3, 0, 0, 0, false,
				     -1074031684);
				class645_sub1_sub3_288_.method9777(-620843083);
			    }
			    class645_sub1_sub3.method9777(-446906216);
			}
			for (Class542 class542 = class546.aClass542_7399;
			     class542 != null;
			     class542 = class542.aClass542_7238) {
			    Class645_Sub1_Sub5 class645_sub1_sub5
				= class542.aClass645_Sub1_Sub5_7239;
			    if (null != class645_sub1_sub5
				&& class645_sub1_sub5.method9771(-395745760)) {
				method6596(class645_sub1_sub5, i, i_286_,
					   i_287_,
					   (class645_sub1_sub5.aShort11743
					    - class645_sub1_sub5.aShort11747
					    + 1),
					   1 + (class645_sub1_sub5.aShort11746
						- (class645_sub1_sub5
						   .aShort11745)));
				class645_sub1_sub5.method9777(-1654507719);
			    }
			}
			Class645_Sub1_Sub4 class645_sub1_sub4
			    = class546.aClass645_Sub1_Sub4_7397;
			if (null != class645_sub1_sub4
			    && class645_sub1_sub4.method9771(-395745760)) {
			    method6559(class645_sub1_sub4, i, i_286_, i_287_,
				       (byte) 104);
			    class645_sub1_sub4.method9777(-1948394865);
			}
		    }
		}
	    }
	}
    }
    
    void method6596(Class645_Sub1 class645_sub1, int i, int i_289_, int i_290_,
		    int i_291_, int i_292_) {
	boolean bool = true;
	int i_293_ = i_289_;
	int i_294_ = i_289_ + i_291_;
	int i_295_ = i_290_ - 1;
	int i_296_ = i_292_ + i_290_;
	for (int i_297_ = i; i_297_ <= 1 + i; i_297_++) {
	    if (anInt7184 * -353005885 != i_297_) {
		for (int i_298_ = i_293_; i_298_ <= i_294_; i_298_++) {
		    if (i_298_ >= 0 && i_298_ < anInt7158 * -1102718643) {
			for (int i_299_ = i_295_; i_299_ <= i_296_; i_299_++) {
			    if (i_299_ >= 0 && i_299_ < anInt7159 * -532233529
				&& (!bool || i_298_ >= i_294_
				    || i_299_ >= i_296_
				    || i_299_ < i_290_ && i_289_ != i_298_)) {
				Class546 class546
				    = (aClass546ArrayArrayArray7160[i_297_]
				       [i_298_][i_299_]);
				if (class546 != null) {
				    int i_300_
					= (((aClass137Array7161[i_297_]
						 .method1669
					     (i_298_, i_299_, (byte) 0))
					    + (aClass137Array7161[i_297_]
						   .method1669
					       (1 + i_298_, i_299_, (byte) 0))
					    + (aClass137Array7161[i_297_]
						   .method1669
					       (i_298_, 1 + i_299_, (byte) 0))
					    + (aClass137Array7161[i_297_]
						   .method1669
					       (1 + i_298_, i_299_ + 1,
						(byte) 0))) / 4
					   - ((aClass137Array7161[i].method1669
					       (i_289_, i_290_, (byte) 0))
					      + (aClass137Array7161[i]
						     .method1669
						 (1 + i_289_, i_290_,
						  (byte) 0))
					      + (aClass137Array7161[i]
						     .method1669
						 (i_289_, 1 + i_290_,
						  (byte) 0))
					      + (aClass137Array7161[i]
						     .method1669
						 (1 + i_289_, i_290_ + 1,
						  (byte) 0))) / 4);
				    Class645_Sub1_Sub3 class645_sub1_sub3
					= class546.aClass645_Sub1_Sub3_7393;
				    Class645_Sub1_Sub3 class645_sub1_sub3_301_
					= class546.aClass645_Sub1_Sub3_7394;
				    if (class645_sub1_sub3 != null
					&& class645_sub1_sub3
					       .method9771(-395745760))
					class645_sub1.method9798
					    (((Class538) this).aClass173_7166,
					     class645_sub1_sub3,
					     ((((Class538) this).anInt7169
					       * 198274565 * (i_298_ - i_289_))
					      + ((1 - i_291_)
						 * (((Class538) this).anInt7155
						    * 486809201))),
					     i_300_,
					     ((((Class538) this).anInt7155
					       * 486809201 * (1 - i_292_))
					      + ((i_299_ - i_290_)
						 * (198274565
						    * (((Class538) this)
						       .anInt7169)))),
					     bool, -1085637577);
				    if (null != class645_sub1_sub3_301_
					&& class645_sub1_sub3_301_
					       .method9771(-395745760))
					class645_sub1.method9798
					    (((Class538) this).aClass173_7166,
					     class645_sub1_sub3_301_,
					     ((((Class538) this).anInt7169
					       * 198274565 * (i_298_ - i_289_))
					      + ((1 - i_291_)
						 * (((Class538) this).anInt7155
						    * 486809201))),
					     i_300_,
					     ((198274565
					       * ((Class538) this).anInt7169
					       * (i_299_ - i_290_))
					      + ((1 - i_292_)
						 * (((Class538) this).anInt7155
						    * 486809201))),
					     bool, -1852681477);
				    for (Class542 class542
					     = class546.aClass542_7399;
					 null != class542;
					 class542 = class542.aClass542_7238) {
					Class645_Sub1_Sub5 class645_sub1_sub5
					    = (class542
					       .aClass645_Sub1_Sub5_7239);
					if (class645_sub1_sub5 != null
					    && class645_sub1_sub5
						   .method9771(-395745760)
					    && ((class645_sub1_sub5.aShort11747
						 == i_298_)
						|| i_293_ == i_298_)
					    && ((class645_sub1_sub5.aShort11745
						 == i_299_)
						|| i_299_ == i_295_)) {
					    int i_302_
						= 1 + ((class645_sub1_sub5
							.aShort11743)
						       - (class645_sub1_sub5
							  .aShort11747));
					    int i_303_
						= 1 + ((class645_sub1_sub5
							.aShort11746)
						       - (class645_sub1_sub5
							  .aShort11745));
					    class645_sub1.method9798
						((((Class538) this)
						  .aClass173_7166),
						 class645_sub1_sub5,
						 ((((Class538) this).anInt7169
						   * 198274565
						   * ((class645_sub1_sub5
						       .aShort11747)
						      - i_289_))
						  + ((i_302_ - i_291_)
						     * ((((Class538) this)
							 .anInt7155)
							* 486809201))),
						 i_300_,
						 (((i_303_ - i_292_)
						   * (486809201
						      * (((Class538) this)
							 .anInt7155)))
						  + ((((Class538) this)
						      .anInt7169)
						     * 198274565
						     * ((class645_sub1_sub5
							 .aShort11745)
							- i_290_))),
						 bool, -721702038);
					}
				    }
				}
			    }
			}
		    }
		}
		i_293_--;
		bool = false;
	    }
	}
    }
    
    public Class645_Sub1_Sub2 method6597(int i, int i_304_, int i_305_,
					 short i_306_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_304_][i_305_];
	if (class546 == null)
	    return null;
	return ((Class546) class546).aClass645_Sub1_Sub2_7398;
    }
    
    public void method6598
	(int i, int i_307_, int i_308_, Class645_Sub1_Sub1 class645_sub1_sub1,
	 Class645_Sub1_Sub1 class645_sub1_sub1_309_, int i_310_) {
	Class546 class546 = method6536(i, i_307_, i_308_, -2070260800);
	if (class546 != null) {
	    class546.aClass645_Sub1_Sub1_7395 = class645_sub1_sub1;
	    class546.aClass645_Sub1_Sub1_7396 = class645_sub1_sub1_309_;
	    int i_311_ = aClass137Array7202 == aClass137Array7161 ? 1 : 0;
	    if (class645_sub1_sub1.method9797(737119777)) {
		if (class645_sub1_sub1.method9775((short) -4848)) {
		    ((Class645_Sub1_Sub1) class645_sub1_sub1)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7177[i_311_];
		    ((Class538) this).aClass645_Sub1Array7177[i_311_]
			= class645_sub1_sub1;
		} else {
		    ((Class645_Sub1_Sub1) class645_sub1_sub1)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7176[i_311_];
		    ((Class538) this).aClass645_Sub1Array7176[i_311_]
			= class645_sub1_sub1;
		}
	    } else {
		((Class645_Sub1_Sub1) class645_sub1_sub1).aClass645_Sub1_10673
		    = ((Class538) this).aClass645_Sub1Array7178[i_311_];
		((Class538) this).aClass645_Sub1Array7178[i_311_]
		    = class645_sub1_sub1;
	    }
	    if (class645_sub1_sub1_309_ != null) {
		if (class645_sub1_sub1_309_.method9797(-120319099)) {
		    if (class645_sub1_sub1_309_.method9775((short) -24781)) {
			((Class645_Sub1_Sub1) class645_sub1_sub1_309_)
			    .aClass645_Sub1_10673
			    = (((Class538) this).aClass645_Sub1Array7177
			       [i_311_]);
			((Class538) this).aClass645_Sub1Array7177[i_311_]
			    = class645_sub1_sub1_309_;
		    } else {
			((Class645_Sub1_Sub1) class645_sub1_sub1_309_)
			    .aClass645_Sub1_10673
			    = (((Class538) this).aClass645_Sub1Array7176
			       [i_311_]);
			((Class538) this).aClass645_Sub1Array7176[i_311_]
			    = class645_sub1_sub1_309_;
		    }
		} else {
		    ((Class645_Sub1_Sub1) class645_sub1_sub1_309_)
			.aClass645_Sub1_10673
			= ((Class538) this).aClass645_Sub1Array7178[i_311_];
		    ((Class538) this).aClass645_Sub1Array7178[i_311_]
			= class645_sub1_sub1_309_;
		}
	    }
	}
    }
    
    public void method6599() {
	for (int i = 0; i < 598332735 * ((Class538) this).anInt7195; i++) {
	    if (!((Class538) this).aBoolArray7165[i]) {
		Class543 class543 = ((Class538) this).aClass543Array7203[i];
		Class528_Sub12 class528_sub12 = class543.aClass528_Sub12_7266;
		int i_312_ = class543.anInt7262 * 264933169;
		int i_313_ = (class528_sub12.method9357(1135999047)
			      - ((Class538) this).anInt7155 * 486809201);
		int i_314_ = 1 + (2 * i_313_ >> -1532596617 * anInt7148);
		int i_315_ = 0;
		int[] is = new int[i_314_ * i_314_];
		int i_316_ = (class528_sub12.method9366(1462029359) - i_313_
			      >> -1532596617 * anInt7148);
		int i_317_ = (class528_sub12.method9370(1221114533) - i_313_
			      >> anInt7148 * -1532596617);
		int i_318_ = (class528_sub12.method9370(1221114533) + i_313_
			      >> anInt7148 * -1532596617);
		if (i_317_ < 0) {
		    i_315_ -= i_317_;
		    i_317_ = 0;
		}
		if (i_318_ >= -532233529 * anInt7159)
		    i_318_ = anInt7159 * -532233529 - 1;
		for (int i_319_ = i_317_; i_319_ <= i_318_; i_319_++) {
		    int i_320_ = ((Class543) class543).aShortArray7267[i_315_];
		    int i_321_ = i_320_ >>> 8;
		    int i_322_ = i_321_ + i_315_ * i_314_;
		    int i_323_ = i_316_ + (i_320_ >>> 8);
		    int i_324_ = i_323_ + (i_320_ & 0xff) - 1;
		    if (i_323_ < 0) {
			i_322_ -= i_323_;
			i_323_ = 0;
		    }
		    if (i_324_ >= anInt7158 * -1102718643)
			i_324_ = -1102718643 * anInt7158 - 1;
		    for (int i_325_ = i_323_; i_325_ <= i_324_; i_325_++) {
			int i_326_ = 1;
			Class645_Sub1_Sub5 class645_sub1_sub5
			    = method6583(i_312_, i_325_, i_319_, null,
					 2000683781);
			if (class645_sub1_sub5 != null
			    && 0 != (((Class645_Sub1_Sub5) class645_sub1_sub5)
				     .aByte11748)) {
			    if (1 == (((Class645_Sub1_Sub5) class645_sub1_sub5)
				      .aByte11748)) {
				boolean bool = i_325_ - 1 >= i_323_;
				boolean bool_327_ = 1 + i_325_ <= i_324_;
				if (!bool && i_319_ + 1 <= i_318_) {
				    int i_328_
					= (((Class543) class543)
					   .aShortArray7267[1 + i_315_]);
				    int i_329_ = (i_328_ >>> 8) + i_316_;
				    int i_330_ = (i_328_ & 0xff) + i_329_;
				    bool = i_325_ > i_329_ && i_325_ < i_330_;
				}
				if (!bool_327_ && i_319_ - 1 >= i_317_) {
				    int i_331_
					= (((Class543) class543)
					   .aShortArray7267[i_315_ - 1]);
				    int i_332_ = i_316_ + (i_331_ >>> 8);
				    int i_333_ = i_332_ + (i_331_ & 0xff);
				    bool_327_
					= i_325_ > i_332_ && i_325_ < i_333_;
				}
				if (bool && !bool_327_)
				    i_326_ = 4;
				else if (bool_327_ && !bool)
				    i_326_ = 2;
			    } else {
				boolean bool = i_325_ - 1 >= i_323_;
				boolean bool_334_ = 1 + i_325_ <= i_324_;
				if (!bool && i_319_ - 1 >= i_317_) {
				    int i_335_
					= (((Class543) class543)
					   .aShortArray7267[i_315_ - 1]);
				    int i_336_ = i_316_ + (i_335_ >>> 8);
				    int i_337_ = (i_335_ & 0xff) + i_336_;
				    bool = i_325_ > i_336_ && i_325_ < i_337_;
				}
				if (!bool_334_ && 1 + i_319_ <= i_318_) {
				    int i_338_
					= (((Class543) class543)
					   .aShortArray7267[1 + i_315_]);
				    int i_339_ = (i_338_ >>> 8) + i_316_;
				    int i_340_ = i_339_ + (i_338_ & 0xff);
				    bool_334_
					= i_325_ > i_339_ && i_325_ < i_340_;
				}
				if (bool && !bool_334_)
				    i_326_ = 3;
				else if (bool_334_ && !bool)
				    i_326_ = 5;
			    }
			}
			is[i_322_++] = i_326_;
		    }
		    i_315_++;
		}
		((Class538) this).aBoolArray7165[i] = true;
		if (aBool7171)
		    aClass137Array7161[i_312_].method1670(class528_sub12, is);
	    }
	}
    }
    
    public Class645_Sub1_Sub3 method6600(int i, int i_341_, int i_342_,
					 byte i_343_) {
	Class546 class546 = aClass546ArrayArrayArray7160[i][i_341_][i_342_];
	if (null == class546)
	    return null;
	return class546.aClass645_Sub1_Sub3_7393;
    }
    
    public void method6601() {
	method6569(1, anInt7184 * -353005885, 125298196);
    }
    
    public void method6602() {
	for (int i = 0; i < 598332735 * ((Class538) this).anInt7195; i++) {
	    if (!((Class538) this).aBoolArray7165[i]) {
		Class543 class543 = ((Class538) this).aClass543Array7203[i];
		Class528_Sub12 class528_sub12 = class543.aClass528_Sub12_7266;
		int i_344_ = class543.anInt7262 * 264933169;
		int i_345_ = (class528_sub12.method9357(1434626687)
			      - ((Class538) this).anInt7155 * 486809201);
		int i_346_ = 1 + (2 * i_345_ >> -1532596617 * anInt7148);
		int i_347_ = 0;
		int[] is = new int[i_346_ * i_346_];
		int i_348_ = (class528_sub12.method9366(1766625260) - i_345_
			      >> -1532596617 * anInt7148);
		int i_349_ = (class528_sub12.method9370(1221114533) - i_345_
			      >> anInt7148 * -1532596617);
		int i_350_ = (class528_sub12.method9370(1221114533) + i_345_
			      >> anInt7148 * -1532596617);
		if (i_349_ < 0) {
		    i_347_ -= i_349_;
		    i_349_ = 0;
		}
		if (i_350_ >= -532233529 * anInt7159)
		    i_350_ = anInt7159 * -532233529 - 1;
		for (int i_351_ = i_349_; i_351_ <= i_350_; i_351_++) {
		    int i_352_ = ((Class543) class543).aShortArray7267[i_347_];
		    int i_353_ = i_352_ >>> 8;
		    int i_354_ = i_353_ + i_347_ * i_346_;
		    int i_355_ = i_348_ + (i_352_ >>> 8);
		    int i_356_ = i_355_ + (i_352_ & 0xff) - 1;
		    if (i_355_ < 0) {
			i_354_ -= i_355_;
			i_355_ = 0;
		    }
		    if (i_356_ >= anInt7158 * -1102718643)
			i_356_ = -1102718643 * anInt7158 - 1;
		    for (int i_357_ = i_355_; i_357_ <= i_356_; i_357_++) {
			int i_358_ = 1;
			Class645_Sub1_Sub5 class645_sub1_sub5
			    = method6583(i_344_, i_357_, i_351_, null,
					 1911490662);
			if (class645_sub1_sub5 != null
			    && 0 != (((Class645_Sub1_Sub5) class645_sub1_sub5)
				     .aByte11748)) {
			    if (1 == (((Class645_Sub1_Sub5) class645_sub1_sub5)
				      .aByte11748)) {
				boolean bool = i_357_ - 1 >= i_355_;
				boolean bool_359_ = 1 + i_357_ <= i_356_;
				if (!bool && i_351_ + 1 <= i_350_) {
				    int i_360_
					= (((Class543) class543)
					   .aShortArray7267[1 + i_347_]);
				    int i_361_ = (i_360_ >>> 8) + i_348_;
				    int i_362_ = (i_360_ & 0xff) + i_361_;
				    bool = i_357_ > i_361_ && i_357_ < i_362_;
				}
				if (!bool_359_ && i_351_ - 1 >= i_349_) {
				    int i_363_
					= (((Class543) class543)
					   .aShortArray7267[i_347_ - 1]);
				    int i_364_ = i_348_ + (i_363_ >>> 8);
				    int i_365_ = i_364_ + (i_363_ & 0xff);
				    bool_359_
					= i_357_ > i_364_ && i_357_ < i_365_;
				}
				if (bool && !bool_359_)
				    i_358_ = 4;
				else if (bool_359_ && !bool)
				    i_358_ = 2;
			    } else {
				boolean bool = i_357_ - 1 >= i_355_;
				boolean bool_366_ = 1 + i_357_ <= i_356_;
				if (!bool && i_351_ - 1 >= i_349_) {
				    int i_367_
					= (((Class543) class543)
					   .aShortArray7267[i_347_ - 1]);
				    int i_368_ = i_348_ + (i_367_ >>> 8);
				    int i_369_ = (i_367_ & 0xff) + i_368_;
				    bool = i_357_ > i_368_ && i_357_ < i_369_;
				}
				if (!bool_366_ && 1 + i_351_ <= i_350_) {
				    int i_370_
					= (((Class543) class543)
					   .aShortArray7267[1 + i_347_]);
				    int i_371_ = (i_370_ >>> 8) + i_348_;
				    int i_372_ = i_371_ + (i_370_ & 0xff);
				    bool_366_
					= i_357_ > i_371_ && i_357_ < i_372_;
				}
				if (bool && !bool_366_)
				    i_358_ = 3;
				else if (bool_366_ && !bool)
				    i_358_ = 5;
			    }
			}
			is[i_354_++] = i_358_;
		    }
		    i_347_++;
		}
		((Class538) this).aBoolArray7165[i] = true;
		if (aBool7171)
		    aClass137Array7161[i_344_].method1670(class528_sub12, is);
	    }
	}
    }
    
    static final void method6603(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub8_10565
		  .method9883(1844985377);
    }
    
    static void method6604(int i, int i_373_) {
	Class96.aClass186_1215.method2747(i, 662243651);
    }
    
    static final void method6605(Class648 class648, int i) {
	int i_374_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class378_Sub2.method9159(i_374_, -956140735);
    }
}
