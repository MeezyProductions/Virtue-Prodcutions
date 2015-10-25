/* Class137_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class137_Sub1 extends Class137
{
    float aFloat8852;
    Class130[][] aClass130ArrayArray8853;
    static final int anInt8854 = 1;
    Class102[][] aClass102ArrayArray8855;
    static final int anInt8856 = 4;
    Class173_Sub3 aClass173_Sub3_8857;
    int anInt8858;
    byte[][] aByteArrayArray8859;
    Class100[][] aClass100ArrayArray8860;
    Class87[][] aClass87ArrayArray8861;
    float aFloat8862;
    Class132[][] aClass132ArrayArray8863;
    static final int anInt8864 = 64;
    float aFloat8865;
    float aFloat8866;
    float aFloat8867;
    float aFloat8868;
    float aFloat8869;
    byte[][] aByteArrayArray8870;
    float aFloat8871;
    float aFloat8872;
    float aFloat8873;
    float aFloat8874;
    float aFloat8875;
    float aFloat8876;
    static final int anInt8877 = 2;
    static final int anInt8878 = -1694498816;
    float aFloat8879;
    float aFloat8880;
    float aFloat8881;
    static final boolean aBool8882 = true;
    static final boolean aBool8883 = true;
    static final boolean aBool8884 = false;
    
    public void method1676(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_0_, int i_1_, int i_2_, boolean bool) {
	/* empty */
    }
    
    public void method1651(int i, int i_3_, int i_4_) {
	i = Math.min(((Class137_Sub1) this).aByteArrayArray8859.length - 1,
		     Math.max(0, i));
	i_3_ = Math.min((((Class137_Sub1) this).aByteArrayArray8859[i].length
			 - 1),
			Math.max(0, i_3_));
	if (((Class137_Sub1) this).aByteArrayArray8859[i][i_3_] < i_4_)
	    ((Class137_Sub1) this).aByteArrayArray8859[i][i_3_] = (byte) i_4_;
    }
    
    public void method1652
	(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_, int[] is_8_,
	 int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_,
	 int[] is_14_, int[] is_15_, Class164 class164, boolean bool) {
	if (((Class137_Sub1) this).aClass130ArrayArray8853 == null) {
	    ((Class137_Sub1) this).aClass130ArrayArray8853
		= new Class130[anInt1627 * -657933437][anInt1626 * 1769495707];
	    ((Class137_Sub1) this).aClass100ArrayArray8860
		= new Class100[anInt1627 * -657933437][anInt1626 * 1769495707];
	} else if (((Class137_Sub1) this).aClass87ArrayArray8861 != null
		   || ((Class137_Sub1) this).aClass132ArrayArray8863 != null)
	    throw new IllegalStateException();
	boolean bool_16_ = false;
	if (is_12_.length == 2 && is_9_.length == 2
	    && (is_12_[0] == is_12_[1]
		|| is_14_[0] != -1 && is_14_[0] == is_14_[1])) {
	    bool_16_ = true;
	    for (int i_17_ = 1; i_17_ < 2; i_17_++) {
		int i_18_ = is[is_9_[i_17_]];
		int i_19_ = is_7_[is_9_[i_17_]];
		if (i_18_ != 0 && i_18_ != anInt1628 * 2130003981
		    || i_19_ != 0 && i_19_ != anInt1628 * 2130003981) {
		    bool_16_ = false;
		    break;
		}
	    }
	}
	if (!bool_16_) {
	    Class100 class100 = new Class100();
	    short i_20_ = (short) is.length;
	    int i_21_ = (short) is_12_.length;
	    ((Class100) class100).aShort1273 = i_20_;
	    ((Class100) class100).aShortArray1278 = new short[i_20_];
	    ((Class100) class100).aShortArray1275 = new short[i_20_];
	    ((Class100) class100).aShortArray1282 = new short[i_20_];
	    ((Class100) class100).aShortArray1277 = new short[i_20_];
	    for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
		int i_23_ = is[i_22_];
		int i_24_ = is_7_[i_22_];
		if (i_23_ == 0 && i_24_ == 0)
		    ((Class100) class100).aShortArray1278[i_22_]
			= (short) ((((Class137_Sub1) this).aByteArrayArray8870
				    [i][i_5_])
				   - (((Class137_Sub1) this)
				      .aByteArrayArray8859[i][i_5_]));
		else if (i_23_ == 0 && i_24_ == anInt1628 * 2130003981)
		    ((Class100) class100).aShortArray1278[i_22_]
			= (short) ((((Class137_Sub1) this).aByteArrayArray8870
				    [i][i_5_ + 1])
				   - (((Class137_Sub1) this)
				      .aByteArrayArray8859[i][i_5_ + 1]));
		else if (i_23_ == anInt1628 * 2130003981
			 && i_24_ == anInt1628 * 2130003981)
		    ((Class100) class100).aShortArray1278[i_22_]
			= (short) ((((Class137_Sub1) this).aByteArrayArray8870
				    [i + 1][i_5_ + 1])
				   - (((Class137_Sub1) this)
				      .aByteArrayArray8859[i + 1][i_5_ + 1]));
		else if (i_23_ == anInt1628 * 2130003981 && i_24_ == 0)
		    ((Class100) class100).aShortArray1278[i_22_]
			= (short) ((((Class137_Sub1) this).aByteArrayArray8870
				    [i + 1][i_5_])
				   - (((Class137_Sub1) this)
				      .aByteArrayArray8859[i + 1][i_5_]));
		else {
		    int i_25_
			= ((((Class137_Sub1) this).aByteArrayArray8870[i][i_5_]
			    - (((Class137_Sub1) this).aByteArrayArray8859[i]
			       [i_5_])) * (anInt1628 * 2130003981 - i_23_)
			   + ((((Class137_Sub1) this).aByteArrayArray8870
			       [i + 1][i_5_])
			      - (((Class137_Sub1) this).aByteArrayArray8859
				 [i + 1][i_5_])) * i_23_);
		    int i_26_
			= (((((Class137_Sub1) this).aByteArrayArray8870[i]
			     [i_5_ + 1])
			    - (((Class137_Sub1) this).aByteArrayArray8859[i]
			       [i_5_ + 1])) * (anInt1628 * 2130003981 - i_23_)
			   + ((((Class137_Sub1) this).aByteArrayArray8870
			       [i + 1][i_5_ + 1])
			      - (((Class137_Sub1) this).aByteArrayArray8859
				 [i + 1][i_5_ + 1])) * i_23_);
		    ((Class100) class100).aShortArray1278[i_22_]
			= (short) ((i_25_ * (anInt1628 * 2130003981 - i_24_)
				    + i_26_ * i_24_)
				   >> anInt1625 * -1208275318);
		}
		int i_27_ = (i << anInt1625 * 1543345989) + i_23_;
		int i_28_ = (i_5_ << anInt1625 * 1543345989) + i_24_;
		((Class100) class100).aShortArray1275[i_22_] = (short) i_23_;
		((Class100) class100).aShortArray1277[i_22_] = (short) i_24_;
		((Class100) class100).aShortArray1282[i_22_]
		    = (short) (method1656(i_27_, i_28_, 1920486249)
			       + (is_6_ != null ? is_6_[i_22_] : 0));
		if (((Class100) class100).aShortArray1278[i_22_] < 2)
		    ((Class100) class100).aShortArray1278[i_22_] = (short) 2;
	    }
	    boolean bool_29_ = false;
	    int i_30_ = 0;
	    for (int i_31_ = 0; i_31_ < i_21_; i_31_++) {
		if (is_12_[i_31_] >= 0 || is_13_ != null && is_13_[i_31_] >= 0)
		    i_30_++;
		int i_32_ = is_14_[i_31_];
		if (i_32_ != -1) {
		    Class160 class160
			= ((Class137_Sub1) this).aClass173_Sub3_8857
			      .aClass165_1984.method2093(i_32_, (byte) -68);
		    if (!class160.aBool1800) {
			bool_29_ = true;
			if (method8319(class160.aByte1790)
			    || class160.aByte1775 != 0
			    || class160.aByte1776 != 0)
			    ((Class100) class100).aByte1272 |= 0x4;
		    }
		}
	    }
	    ((Class100) class100).anIntArray1284 = new int[i_30_];
	    if (is_13_ != null)
		((Class100) class100).anIntArray1285 = new int[i_30_];
	    ((Class100) class100).aShortArray1279 = new short[i_30_];
	    ((Class100) class100).aShortArray1276 = new short[i_30_];
	    ((Class100) class100).aShortArray1281 = new short[i_30_];
	    if (bool_29_) {
		((Class100) class100).aShortArray1283 = new short[i_30_];
		((Class100) class100).aShortArray1274 = new short[i_30_];
	    }
	    for (int i_33_ = 0; i_33_ < i_21_; i_33_++) {
		if (is_12_[i_33_] >= 0
		    || is_13_ != null && is_13_[i_33_] >= 0) {
		    if (is_12_[i_33_] >= 0)
			((Class100) class100).anIntArray1284
			    [((Class100) class100).aShort1280]
			    = Class516.method6283(is_12_[i_33_], 515814180);
		    else
			((Class100) class100).anIntArray1284
			    [((Class100) class100).aShort1280]
			    = -1;
		    if (is_13_ != null) {
			if (is_13_[i_33_] != -1)
			    ((Class100) class100).anIntArray1285
				[((Class100) class100).aShort1280]
				= Class516.method6283(is_13_[i_33_],
						      515814180);
			else
			    ((Class100) class100).anIntArray1285
				[((Class100) class100).aShort1280]
				= -1;
		    }
		    ((Class100) class100).aShortArray1279
			[((Class100) class100).aShort1280]
			= (short) is_9_[i_33_];
		    ((Class100) class100).aShortArray1276
			[((Class100) class100).aShort1280]
			= (short) is_10_[i_33_];
		    ((Class100) class100).aShortArray1281
			[((Class100) class100).aShort1280]
			= (short) is_11_[i_33_];
		    if (bool_29_) {
			if (is_14_[i_33_] != -1
			    && !(((Class137_Sub1) this).aClass173_Sub3_8857
				     .aClass165_1984.method2093
				 (is_14_[i_33_], (byte) -63).aBool1800)) {
			    ((Class100) class100).aShortArray1283
				[((Class100) class100).aShort1280]
				= (short) is_14_[i_33_];
			    ((Class100) class100).aShortArray1274
				[((Class100) class100).aShort1280]
				= (short) is_15_[i_33_];
			} else
			    ((Class100) class100).aShortArray1283
				[((Class100) class100).aShort1280]
				= (short) -1;
		    }
		    ((Class100) class100).aShort1280++;
		}
	    }
	    ((Class137_Sub1) this).aClass100ArrayArray8860[i][i_5_] = class100;
	} else if (is_12_[0] >= 0 || is_13_ != null && is_13_[0] >= 0) {
	    Class130 class130 = new Class130();
	    int i_34_ = is_12_[0];
	    int i_35_ = is_14_[0];
	    if (is_13_ != null) {
		((Class130) class130).anInt1595
		    = PlayerModel.method7300(Class516.method6283(is_13_[0],
							      515814180),
					  ((((Class137_Sub1) this)
					    .aByteArrayArray8870[i][i_5_])
					   - (((Class137_Sub1) this)
					      .aByteArrayArray8859[i][i_5_])),
					  (byte) -68);
		if (i_34_ == -1)
		    ((Class130) class130).aByte1590 |= 0x2;
	    }
	    if ((anIntArrayArray1629[i][i_5_]
		 == anIntArrayArray1629[i + 1][i_5_])
		&& (anIntArrayArray1629[i][i_5_]
		    == anIntArrayArray1629[i + 1][i_5_ + 1])
		&& (anIntArrayArray1629[i][i_5_]
		    == anIntArrayArray1629[i][i_5_ + 1]))
		((Class130) class130).aByte1590 |= 0x1;
	    Class160 class160 = null;
	    if (i_35_ != -1)
		class160 = ((Class137_Sub1) this).aClass173_Sub3_8857
			       .aClass165_1984.method2093(i_35_, (byte) -4);
	    if (class160 != null
		&& (((Class130) class130).aByte1590 & 0x2) == 0
		&& !class160.aBool1800) {
		((Class130) class130).aShort1592
		    = (short) ((((Class137_Sub1) this).aByteArrayArray8870[i]
				[i_5_])
			       - (((Class137_Sub1) this).aByteArrayArray8859[i]
				  [i_5_]));
		((Class130) class130).aShort1591
		    = (short) ((((Class137_Sub1) this).aByteArrayArray8870
				[i + 1][i_5_])
			       - (((Class137_Sub1) this).aByteArrayArray8859
				  [i + 1][i_5_]));
		((Class130) class130).aShort1594
		    = (short) ((((Class137_Sub1) this).aByteArrayArray8870
				[i + 1][i_5_ + 1])
			       - (((Class137_Sub1) this).aByteArrayArray8859
				  [i + 1][i_5_ + 1]));
		((Class130) class130).aShort1593
		    = (short) ((((Class137_Sub1) this).aByteArrayArray8870[i]
				[i_5_ + 1])
			       - (((Class137_Sub1) this).aByteArrayArray8859[i]
				  [i_5_ + 1]));
		((Class130) class130).aShort1589 = (short) i_35_;
		if (method8319(class160.aByte1790) || class160.aByte1775 != 0
		    || class160.aByte1776 != 0)
		    ((Class130) class130).aByte1590 |= 0x4;
	    } else {
		short i_36_ = Class516.method6283(i_34_, 515814180);
		((Class130) class130).aShort1592
		    = (short) PlayerModel.method7300(i_36_,
						  ((((Class137_Sub1) this)
						    .aByteArrayArray8870[i]
						    [i_5_])
						   - (((Class137_Sub1) this)
						      .aByteArrayArray8859[i]
						      [i_5_])),
						  (byte) -80);
		((Class130) class130).aShort1591
		    = (short) PlayerModel.method7300(i_36_,
						  ((((Class137_Sub1) this)
						    .aByteArrayArray8870[i + 1]
						    [i_5_])
						   - (((Class137_Sub1) this)
						      .aByteArrayArray8859
						      [i + 1][i_5_])),
						  (byte) -9);
		((Class130) class130).aShort1594
		    = (short) PlayerModel.method7300(i_36_,
						  ((((Class137_Sub1) this)
						    .aByteArrayArray8870[i + 1]
						    [i_5_ + 1])
						   - (((Class137_Sub1) this)
						      .aByteArrayArray8859
						      [i + 1][i_5_ + 1])),
						  (byte) -39);
		((Class130) class130).aShort1593
		    = (short) PlayerModel.method7300(i_36_,
						  ((((Class137_Sub1) this)
						    .aByteArrayArray8870[i]
						    [i_5_ + 1])
						   - (((Class137_Sub1) this)
						      .aByteArrayArray8859[i]
						      [i_5_ + 1])),
						  (byte) -120);
		((Class130) class130).aShort1589 = (short) -1;
	    }
	    ((Class137_Sub1) this).aClass130ArrayArray8853[i][i_5_] = class130;
	}
    }
    
    public void method1686(int i, int i_37_, int[] is, int[] is_38_,
			   int[] is_39_, int[] is_40_, int[] is_41_,
			   int[] is_42_, int[] is_43_, int[] is_44_,
			   Class164 class164, boolean bool) {
	boolean bool_45_ = (((Class137_Sub1) this).anInt8858 & 0x20) == 0;
	if (((Class137_Sub1) this).aClass87ArrayArray8861 == null
	    && !bool_45_) {
	    ((Class137_Sub1) this).aClass87ArrayArray8861
		= new Class87[anInt1627 * -657933437][anInt1626 * 1769495707];
	    ((Class137_Sub1) this).aClass102ArrayArray8855
		= new Class102[anInt1627 * -657933437][anInt1626 * 1769495707];
	} else if (((Class137_Sub1) this).aClass132ArrayArray8863 == null
		   && bool_45_)
	    ((Class137_Sub1) this).aClass132ArrayArray8863
		= new Class132[anInt1627 * -657933437][anInt1626 * 1769495707];
	else if (((Class137_Sub1) this).aClass130ArrayArray8853 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_46_ = 0; i_46_ < is_41_.length; i_46_++) {
		if (is_41_[i_46_] == -1)
		    is_41_[i_46_] = 0;
		else
		    is_41_[i_46_]
			= (Class72.anIntArray777
			   [(Class516.method6283(is_41_[i_46_], 515814180)
			     & 0xffff)]) << 8 | 0xff;
	    }
	    if (is_42_ != null) {
		for (int i_47_ = 0; i_47_ < is_42_.length; i_47_++) {
		    if (is_42_[i_47_] == -1)
			is_42_[i_47_] = 0;
		    else
			is_42_[i_47_]
			    = (Class72.anIntArray777
			       [(Class516.method6283(is_42_[i_47_], 515814180)
				 & 0xffff)]) << 8 | 0xff;
		}
	    }
	    if (bool_45_) {
		Class132 class132 = new Class132();
		((Class132) class132).aShort1609 = (short) is.length;
		((Class132) class132).aShort1608 = (short) (is.length / 3);
		((Class132) class132).aShortArray1610
		    = new short[((Class132) class132).aShort1609];
		((Class132) class132).aShortArray1611
		    = new short[((Class132) class132).aShort1609];
		((Class132) class132).aShortArray1612
		    = new short[((Class132) class132).aShort1609];
		((Class132) class132).anIntArray1616
		    = new int[((Class132) class132).aShort1609];
		((Class132) class132).aShortArray1615
		    = new short[((Class132) class132).aShort1609];
		((Class132) class132).aShortArray1617
		    = new short[((Class132) class132).aShort1609];
		((Class132) class132).aByteArray1614
		    = new byte[((Class132) class132).aShort1609];
		if (is_40_ != null)
		    ((Class132) class132).aShortArray1613
			= new short[((Class132) class132).aShort1609];
		for (int i_48_ = 0; i_48_ < ((Class132) class132).aShort1609;
		     i_48_++) {
		    int i_49_ = is[i_48_];
		    int i_50_ = is_39_[i_48_];
		    boolean bool_51_ = false;
		    int i_52_;
		    if (i_49_ == 0 && i_50_ == 0)
			i_52_ = ((((Class137_Sub1) this).aByteArrayArray8870[i]
				  [i_37_])
				 - (((Class137_Sub1) this).aByteArrayArray8859
				    [i][i_37_]));
		    else if (i_49_ == 0 && i_50_ == anInt1628 * 2130003981)
			i_52_ = ((((Class137_Sub1) this).aByteArrayArray8870[i]
				  [i_37_ + 1])
				 - (((Class137_Sub1) this).aByteArrayArray8859
				    [i][i_37_ + 1]));
		    else if (i_49_ == anInt1628 * 2130003981
			     && i_50_ == anInt1628 * 2130003981)
			i_52_ = ((((Class137_Sub1) this).aByteArrayArray8870
				  [i + 1][i_37_ + 1])
				 - (((Class137_Sub1) this).aByteArrayArray8859
				    [i + 1][i_37_ + 1]));
		    else if (i_49_ == anInt1628 * 2130003981 && i_50_ == 0)
			i_52_ = ((((Class137_Sub1) this).aByteArrayArray8870
				  [i + 1][i_37_])
				 - (((Class137_Sub1) this).aByteArrayArray8859
				    [i + 1][i_37_]));
		    else {
			int i_53_
			    = ((((((Class137_Sub1) this).aByteArrayArray8870[i]
				  [i_37_])
				 - (((Class137_Sub1) this).aByteArrayArray8859
				    [i][i_37_]))
				* (anInt1628 * 2130003981 - i_49_))
			       + ((((Class137_Sub1) this).aByteArrayArray8870
				   [i + 1][i_37_])
				  - (((Class137_Sub1) this).aByteArrayArray8859
				     [i + 1][i_37_])) * i_49_);
			int i_54_
			    = ((((((Class137_Sub1) this).aByteArrayArray8870[i]
				  [i_37_ + 1])
				 - (((Class137_Sub1) this).aByteArrayArray8859
				    [i][i_37_ + 1]))
				* (anInt1628 * 2130003981 - i_49_))
			       + ((((Class137_Sub1) this).aByteArrayArray8870
				   [i + 1][i_37_ + 1])
				  - (((Class137_Sub1) this).aByteArrayArray8859
				     [i + 1][i_37_ + 1])) * i_49_);
			i_52_ = (i_53_ * (anInt1628 * 2130003981 - i_50_)
				 + i_54_ * i_50_) >> anInt1625 * -1208275318;
		    }
		    int i_55_ = (i << anInt1625 * 1543345989) + i_49_;
		    int i_56_ = (i_37_ << anInt1625 * 1543345989) + i_50_;
		    ((Class132) class132).aShortArray1610[i_48_]
			= (short) i_49_;
		    ((Class132) class132).aShortArray1612[i_48_]
			= (short) i_50_;
		    ((Class132) class132).aShortArray1611[i_48_]
			= (short) (method1656(i_55_, i_56_, 1188934119)
				   + (is_38_ != null ? is_38_[i_48_] : 0));
		    if (i_52_ < 0)
			i_52_ = 0;
		    if (is_41_[i_48_] == 0) {
			((Class132) class132).anIntArray1616[i_48_] = 0;
			if (is_42_ != null)
			    ((Class132) class132).aByteArray1614[i_48_]
				= (byte) i_52_;
		    } else {
			int i_57_ = 0;
			if (is_40_ != null) {
			    int i_58_
				= (((Class132) class132).aShortArray1613[i_48_]
				   = (short) is_40_[i_48_]);
			    if (class164.anInt1828 * -386339441 != 0) {
				i_57_ = 255 * i_58_ / (class164.anInt1828
						       * -386339441);
				if (i_57_ < 0)
				    i_57_ = 0;
				else if (i_57_ > 255)
				    i_57_ = 255;
			    }
			}
			int i_59_ = -16777216;
			if (is_43_[i_48_] != -1) {
			    Class160 class160
				= ((Class137_Sub1) this)
				      .aClass173_Sub3_8857.aClass165_1984
				      .method2093(is_43_[i_48_], (byte) -84);
			    if (class160.aBool1768
				&& method8319(class160.aByte1790))
				i_59_ = -1694498816;
			}
			((Class132) class132).anIntArray1616[i_48_]
			    = (i_59_
			       | Class472.method5817(method8309((is_41_[i_48_]
								 >> 8),
								i_52_),
						     (class164.anInt1827
						      * -222719641),
						     i_57_, (byte) 16));
			if (is_42_ != null)
			    ((Class132) class132).aByteArray1614[i_48_]
				= (byte) i_52_;
		    }
		    ((Class132) class132).aShortArray1615[i_48_]
			= (short) is_43_[i_48_];
		    ((Class132) class132).aShortArray1617[i_48_]
			= (short) is_44_[i_48_];
		}
		if (is_42_ != null) {
		    ((Class132) class132).anIntArray1618
			= new int[((Class132) class132).aShort1608];
		    for (int i_60_ = 0;
			 i_60_ < ((Class132) class132).aShort1608; i_60_++) {
			int i_61_ = i_60_ * 3;
			if (is_42_[i_61_] != 0)
			    ((Class132) class132).anIntArray1618[i_60_]
				= ~0xffffff | is_42_[i_61_] >> 8;
		    }
		}
		((Class137_Sub1) this).aClass132ArrayArray8863[i][i_37_]
		    = class132;
	    } else {
		boolean bool_62_ = true;
		int i_63_ = -1;
		int i_64_ = -1;
		int i_65_ = -1;
		int i_66_ = -1;
		if (is.length == 6) {
		    for (int i_67_ = 0; i_67_ < 6; i_67_++) {
			if (is[i_67_] == 0 && is_39_[i_67_] == 0) {
			    if (i_63_ != -1
				&& is_41_[i_63_] != is_41_[i_67_]) {
				bool_62_ = false;
				break;
			    }
			    i_63_ = i_67_;
			} else if (is[i_67_] == anInt1628 * 2130003981
				   && is_39_[i_67_] == 0) {
			    if (i_64_ != -1
				&& is_41_[i_64_] != is_41_[i_67_]) {
				bool_62_ = false;
				break;
			    }
			    i_64_ = i_67_;
			} else if (is[i_67_] == anInt1628 * 2130003981
				   && (is_39_[i_67_]
				       == anInt1628 * 2130003981)) {
			    if (i_65_ != -1
				&& is_41_[i_65_] != is_41_[i_67_]) {
				bool_62_ = false;
				break;
			    }
			    i_65_ = i_67_;
			} else if (is[i_67_] == 0
				   && (is_39_[i_67_]
				       == anInt1628 * 2130003981)) {
			    if (i_66_ != -1
				&& is_41_[i_66_] != is_41_[i_67_]) {
				bool_62_ = false;
				break;
			    }
			    i_66_ = i_67_;
			}
		    }
		    if (i_63_ == -1 || i_64_ == -1 || i_65_ == -1
			|| i_66_ == -1)
			bool_62_ = false;
		    if (bool_62_) {
			if (is_38_ != null) {
			    for (int i_68_ = 0; i_68_ < 4; i_68_++) {
				if (is_38_[i_68_] != 0) {
				    bool_62_ = false;
				    break;
				}
			    }
			}
			if (bool_62_) {
			    for (int i_69_ = 1; i_69_ < 4; i_69_++) {
				if (is[i_69_] != is[0]
				    && (is[i_69_]
					!= is[0] + anInt1628 * 2130003981)
				    && (is[i_69_]
					!= is[0] - anInt1628 * 2130003981)) {
				    bool_62_ = false;
				    break;
				}
				if (is_39_[i_69_] != is_39_[0]
				    && (is_39_[i_69_]
					!= is_39_[0] + anInt1628 * 2130003981)
				    && (is_39_[i_69_]
					!= (is_39_[0]
					    - anInt1628 * 2130003981))) {
				    bool_62_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_62_ = false;
		if (bool_62_) {
		    Class87 class87 = new Class87();
		    int i_70_ = is_41_[0];
		    int i_71_ = is_43_[0];
		    if (is_42_ != null) {
			((Class87) class87).anInt1121 = is_42_[0] >> 8;
			if (i_70_ == 0)
			    ((Class87) class87).aByte1115 |= 0x2;
		    } else if (i_70_ == 0)
			return;
		    if ((anIntArrayArray1629[i][i_37_]
			 == anIntArrayArray1629[i + 1][i_37_])
			&& (anIntArrayArray1629[i][i_37_]
			    == anIntArrayArray1629[i + 1][i_37_ + 1])
			&& (anIntArrayArray1629[i][i_37_]
			    == anIntArrayArray1629[i][i_37_ + 1]))
			((Class87) class87).aByte1115 |= 0x1;
		    if (i_71_ != -1
			&& (((Class87) class87).aByte1115 & 0x2) == 0
			&& !(((Class137_Sub1) this).aClass173_Sub3_8857
				 .aClass165_1984.method2093
			     (i_71_, (byte) -18).aBool1800)) {
			int i_72_;
			if (is_40_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_72_ = 255 * is_40_[i_63_] / (class164.anInt1828
							   * -386339441);
			    if (i_72_ < 0)
				i_72_ = 0;
			    else if (i_72_ > 255)
				i_72_ = 255;
			} else
			    i_72_ = 0;
			((Class87) class87).anInt1122
			    = (Class472.method5817
			       (method8309(is_41_[i_63_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i][i_37_])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i]
					       [i_37_]))),
				class164.anInt1827 * -222719641, i_72_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1122
				|= (255 - ((((Class137_Sub1) this)
					    .aByteArrayArray8870[i][i_37_])
					   - (((Class137_Sub1) this)
					      .aByteArrayArray8859[i][i_37_]))
				    << 25);
			if (is_40_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_72_ = 255 * is_40_[i_64_] / (class164.anInt1828
							   * -386339441);
			    if (i_72_ < 0)
				i_72_ = 0;
			    else if (i_72_ > 255)
				i_72_ = 255;
			} else
			    i_72_ = 0;
			((Class87) class87).anInt1114
			    = (Class472.method5817
			       (method8309(is_41_[i_64_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i + 1]
					     [i_37_])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i + 1]
					       [i_37_]))),
				class164.anInt1827 * -222719641, i_72_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1114
				|= 255 - ((((Class137_Sub1) this)
					   .aByteArrayArray8870[i + 1][i_37_])
					  - (((Class137_Sub1) this)
					     .aByteArrayArray8859[i + 1]
					     [i_37_])) << 25;
			if (is_40_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_72_ = 255 * is_40_[i_65_] / (class164.anInt1828
							   * -386339441);
			    if (i_72_ < 0)
				i_72_ = 0;
			    else if (i_72_ > 255)
				i_72_ = 255;
			} else
			    i_72_ = 0;
			((Class87) class87).anInt1113
			    = (Class472.method5817
			       (method8309(is_41_[i_65_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i + 1]
					     [i_37_ + 1])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i + 1]
					       [i_37_ + 1]))),
				class164.anInt1827 * -222719641, i_72_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1113
				|= 255 - ((((Class137_Sub1) this)
					   .aByteArrayArray8870[i + 1]
					   [i_37_ + 1])
					  - (((Class137_Sub1) this)
					     .aByteArrayArray8859[i + 1]
					     [i_37_ + 1])) << 25;
			if (is_40_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_72_ = 255 * is_40_[i_66_] / (class164.anInt1828
							   * -386339441);
			    if (i_72_ < 0)
				i_72_ = 0;
			    else if (i_72_ > 255)
				i_72_ = 255;
			} else
			    i_72_ = 0;
			((Class87) class87).anInt1116
			    = (Class472.method5817
			       (method8309(is_41_[i_66_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i]
					     [i_37_ + 1])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i]
					       [i_37_ + 1]))),
				class164.anInt1827 * -222719641, i_72_,
				(byte) 16));
			((Class87) class87).aShort1112 = (short) i_71_;
		    } else {
			int i_73_;
			if (is_40_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_73_ = 255 * is_40_[i_63_] / (class164.anInt1828
							   * -386339441);
			    if (i_73_ < 0)
				i_73_ = 0;
			    else if (i_73_ > 255)
				i_73_ = 255;
			} else
			    i_73_ = 0;
			((Class87) class87).anInt1122
			    = (Class472.method5817
			       (method8309(is_41_[i_63_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i][i_37_])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i]
					       [i_37_]))),
				class164.anInt1827 * -222719641, i_73_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1122
				|= (255 - ((((Class137_Sub1) this)
					    .aByteArrayArray8870[i][i_37_])
					   - (((Class137_Sub1) this)
					      .aByteArrayArray8859[i][i_37_]))
				    << 25);
			if (is_40_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_73_ = 255 * is_40_[i_64_] / (class164.anInt1828
							   * -386339441);
			    if (i_73_ < 0)
				i_73_ = 0;
			    else if (i_73_ > 255)
				i_73_ = 255;
			} else
			    i_73_ = 0;
			((Class87) class87).anInt1114
			    = (Class472.method5817
			       (method8309(is_41_[i_64_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i + 1]
					     [i_37_])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i + 1]
					       [i_37_]))),
				class164.anInt1827 * -222719641, i_73_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1114
				|= 255 - ((((Class137_Sub1) this)
					   .aByteArrayArray8870[i + 1][i_37_])
					  - (((Class137_Sub1) this)
					     .aByteArrayArray8859[i + 1]
					     [i_37_])) << 25;
			if (is_40_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_73_ = 255 * is_40_[i_65_] / (class164.anInt1828
							   * -386339441);
			    if (i_73_ < 0)
				i_73_ = 0;
			    else if (i_73_ > 255)
				i_73_ = 255;
			} else
			    i_73_ = 0;
			((Class87) class87).anInt1113
			    = (Class472.method5817
			       (method8309(is_41_[i_65_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i + 1]
					     [i_37_ + 1])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i + 1]
					       [i_37_ + 1]))),
				class164.anInt1827 * -222719641, i_73_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1113
				|= 255 - ((((Class137_Sub1) this)
					   .aByteArrayArray8870[i + 1]
					   [i_37_ + 1])
					  - (((Class137_Sub1) this)
					     .aByteArrayArray8859[i + 1]
					     [i_37_ + 1])) << 25;
			if (is_40_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_73_ = 255 * is_40_[i_66_] / (class164.anInt1828
							   * -386339441);
			    if (i_73_ < 0)
				i_73_ = 0;
			    else if (i_73_ > 255)
				i_73_ = 255;
			} else
			    i_73_ = 0;
			((Class87) class87).anInt1116
			    = (Class472.method5817
			       (method8309(is_41_[i_66_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i]
					     [i_37_ + 1])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i]
					       [i_37_ + 1]))),
				class164.anInt1827 * -222719641, i_73_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1116
				|= 255 - ((((Class137_Sub1) this)
					   .aByteArrayArray8870[i][i_37_ + 1])
					  - (((Class137_Sub1) this)
					     .aByteArrayArray8859[i]
					     [i_37_ + 1])) << 25;
			((Class87) class87).aShort1112 = (short) -1;
		    }
		    if (is_40_ != null) {
			((Class87) class87).aShort1119 = (short) is_40_[i_65_];
			((Class87) class87).aShort1120 = (short) is_40_[i_66_];
			((Class87) class87).aShort1118 = (short) is_40_[i_64_];
			((Class87) class87).aShort1117 = (short) is_40_[i_63_];
		    }
		    ((Class137_Sub1) this).aClass87ArrayArray8861[i][i_37_]
			= class87;
		} else {
		    Class102 class102 = new Class102();
		    ((Class102) class102).aShort1289 = (short) is.length;
		    ((Class102) class102).aShort1291 = (short) (is.length / 3);
		    ((Class102) class102).aShortArray1295
			= new short[((Class102) class102).aShort1289];
		    ((Class102) class102).aShortArray1292
			= new short[((Class102) class102).aShort1289];
		    ((Class102) class102).aShortArray1293
			= new short[((Class102) class102).aShort1289];
		    ((Class102) class102).anIntArray1288
			= new int[((Class102) class102).aShort1289];
		    if (is_40_ != null)
			((Class102) class102).aShortArray1294
			    = new short[((Class102) class102).aShort1289];
		    for (int i_74_ = 0;
			 i_74_ < ((Class102) class102).aShort1289; i_74_++) {
			int i_75_ = is[i_74_];
			int i_76_ = is_39_[i_74_];
			boolean bool_77_ = false;
			int i_78_;
			if (i_75_ == 0 && i_76_ == 0)
			    i_78_ = ((((Class137_Sub1) this)
				      .aByteArrayArray8870[i][i_37_])
				     - (((Class137_Sub1) this)
					.aByteArrayArray8859[i][i_37_]));
			else if (i_75_ == 0 && i_76_ == anInt1628 * 2130003981)
			    i_78_ = ((((Class137_Sub1) this)
				      .aByteArrayArray8870[i][i_37_ + 1])
				     - (((Class137_Sub1) this)
					.aByteArrayArray8859[i][i_37_ + 1]));
			else if (i_75_ == anInt1628 * 2130003981
				 && i_76_ == anInt1628 * 2130003981)
			    i_78_
				= ((((Class137_Sub1) this).aByteArrayArray8870
				    [i + 1][i_37_ + 1])
				   - (((Class137_Sub1) this)
				      .aByteArrayArray8859[i + 1][i_37_ + 1]));
			else if (i_75_ == anInt1628 * 2130003981 && i_76_ == 0)
			    i_78_ = ((((Class137_Sub1) this)
				      .aByteArrayArray8870[i + 1][i_37_])
				     - (((Class137_Sub1) this)
					.aByteArrayArray8859[i + 1][i_37_]));
			else {
			    int i_79_
				= ((((((Class137_Sub1) this)
				      .aByteArrayArray8870[i][i_37_])
				     - (((Class137_Sub1) this)
					.aByteArrayArray8859[i][i_37_]))
				    * (anInt1628 * 2130003981 - i_75_))
				   + (((((Class137_Sub1) this)
					.aByteArrayArray8870[i + 1][i_37_])
				       - (((Class137_Sub1) this)
					  .aByteArrayArray8859[i + 1][i_37_]))
				      * i_75_));
			    int i_80_
				= ((((((Class137_Sub1) this)
				      .aByteArrayArray8870[i][i_37_ + 1])
				     - (((Class137_Sub1) this)
					.aByteArrayArray8859[i][i_37_ + 1]))
				    * (anInt1628 * 2130003981 - i_75_))
				   + ((((Class137_Sub1) this)
				       .aByteArrayArray8870[i + 1][i_37_ + 1])
				      - (((Class137_Sub1) this)
					 .aByteArrayArray8859[i + 1]
					 [i_37_ + 1])) * i_75_);
			    i_78_
				= (i_79_ * (anInt1628 * 2130003981 - i_76_)
				   + i_80_ * i_76_) >> anInt1625 * -1208275318;
			}
			int i_81_ = (i << anInt1625 * 1543345989) + i_75_;
			int i_82_ = (i_37_ << anInt1625 * 1543345989) + i_76_;
			((Class102) class102).aShortArray1295[i_74_]
			    = (short) i_75_;
			((Class102) class102).aShortArray1293[i_74_]
			    = (short) i_76_;
			((Class102) class102).aShortArray1292[i_74_]
			    = (short) (method1656(i_81_, i_82_, 1888244564)
				       + (is_38_ != null ? is_38_[i_74_] : 0));
			if (i_78_ < 0)
			    i_78_ = 0;
			if (is_41_[i_74_] == 0) {
			    if (is_42_ != null)
				((Class102) class102).anIntArray1288[i_74_]
				    = i_78_ << 25;
			    else
				((Class102) class102).anIntArray1288[i_74_]
				    = 0;
			} else {
			    int i_83_ = 0;
			    if (is_40_ != null) {
				int i_84_ = (((Class102) class102)
						 .aShortArray1294[i_74_]
					     = (short) is_40_[i_74_]);
				if (class164.anInt1828 * -386339441 != 0) {
				    i_83_ = 255 * i_84_ / (class164.anInt1828
							   * -386339441);
				    if (i_83_ < 0)
					i_83_ = 0;
				    else if (i_83_ > 255)
					i_83_ = 255;
				}
			    }
			    ((Class102) class102).anIntArray1288[i_74_]
				= Class472.method5817(method8309((is_41_[i_74_]
								  >> 8),
								 i_78_),
						      (class164.anInt1827
						       * -222719641),
						      i_83_, (byte) 16);
			    if (is_42_ != null)
				((Class102) class102).anIntArray1288[i_74_]
				    |= i_78_ << 25;
			}
		    }
		    boolean bool_85_ = false;
		    for (int i_86_ = 0;
			 i_86_ < ((Class102) class102).aShort1291; i_86_++) {
			if (is_43_[i_86_ * 3] != -1
			    && !(((Class137_Sub1) this).aClass173_Sub3_8857
				     .aClass165_1984.method2093
				 (is_43_[i_86_ * 3], (byte) -125).aBool1800))
			    bool_85_ = true;
		    }
		    if (is_42_ != null)
			((Class102) class102).anIntArray1298
			    = new int[((Class102) class102).aShort1291];
		    if (bool_85_) {
			((Class102) class102).aShortArray1296
			    = new short[((Class102) class102).aShort1291];
			((Class102) class102).aShortArray1297
			    = new short[((Class102) class102).aShort1291];
		    }
		    for (int i_87_ = 0;
			 i_87_ < ((Class102) class102).aShort1291; i_87_++) {
			int i_88_ = i_87_ * 3;
			if (is_42_ != null && is_42_[i_88_] != 0)
			    ((Class102) class102).anIntArray1298[i_87_]
				= is_42_[i_88_] >> 8;
			if (bool_85_) {
			    int i_89_ = i_88_ + 1;
			    int i_90_ = i_89_ + 1;
			    boolean bool_91_ = false;
			    boolean bool_92_ = true;
			    int i_93_ = is_43_[i_88_];
			    if (i_93_ == -1
				|| (((Class137_Sub1) this)
					.aClass173_Sub3_8857.aClass165_1984
					.method2093
				    (i_93_, (byte) -98).aBool1800))
				bool_92_ = false;
			    else
				bool_91_ = true;
			    i_93_ = is_43_[i_89_];
			    if (i_93_ == -1
				|| (((Class137_Sub1) this)
					.aClass173_Sub3_8857.aClass165_1984
					.method2093
				    (i_93_, (byte) -37).aBool1800))
				bool_92_ = false;
			    else
				bool_91_ = true;
			    i_93_ = is_43_[i_90_];
			    if (i_93_ == -1
				|| (((Class137_Sub1) this)
					.aClass173_Sub3_8857.aClass165_1984
					.method2093
				    (i_93_, (byte) -126).aBool1800))
				bool_92_ = false;
			    else
				bool_91_ = true;
			    if (bool_92_) {
				((Class102) class102).aShortArray1296[i_87_]
				    = (short) i_93_;
				((Class102) class102).aShortArray1297[i_87_]
				    = (short) is_44_[i_88_];
			    } else {
				if (bool_91_) {
				    i_93_ = is_43_[i_88_];
				    if (i_93_ != -1
					&& !(((Class137_Sub1) this)
						 .aClass173_Sub3_8857
						 .aClass165_1984.method2093
					     (i_93_, (byte) -50).aBool1800))
					((Class102) class102)
					    .anIntArray1288[i_88_]
					    = (Class72.anIntArray777
					       [(Class516.method6283
						 ((((Class137_Sub1) this)
						       .aClass173_Sub3_8857
						       .aClass165_1984
						       .method2093
						   (i_93_, (byte) -126)
						   .aShort1804) & 0xffff,
						  515814180)) & 0xffff]);
				    i_93_ = is_43_[i_89_];
				    if (i_93_ != -1
					&& !(((Class137_Sub1) this)
						 .aClass173_Sub3_8857
						 .aClass165_1984.method2093
					     (i_93_, (byte) -115).aBool1800))
					((Class102) class102)
					    .anIntArray1288[i_89_]
					    = (Class72.anIntArray777
					       [(Class516.method6283
						 ((((Class137_Sub1) this)
						       .aClass173_Sub3_8857
						       .aClass165_1984
						       .method2093
						   (i_93_, (byte) -23)
						   .aShort1804) & 0xffff,
						  515814180)) & 0xffff]);
				    i_93_ = is_43_[i_90_];
				    if (i_93_ != -1
					&& !(((Class137_Sub1) this)
						 .aClass173_Sub3_8857
						 .aClass165_1984.method2093
					     (i_93_, (byte) -45).aBool1800))
					((Class102) class102)
					    .anIntArray1288[i_90_]
					    = (Class72.anIntArray777
					       [(Class516.method6283
						 ((((Class137_Sub1) this)
						       .aClass173_Sub3_8857
						       .aClass165_1984
						       .method2093
						   (i_93_, (byte) -124)
						   .aShort1804) & 0xffff,
						  515814180)) & 0xffff]);
				}
				((Class102) class102).aShortArray1296[i_87_]
				    = (short) -1;
			    }
			}
		    }
		    ((Class137_Sub1) this).aClass102ArrayArray8855[i][i_37_]
			= class102;
		}
	    }
	}
    }
    
    static int method8309(int i, int i_94_) {
	int i_95_ = (i & 0xff0000) * i_94_ >> 23;
	if (i_95_ < 2)
	    i_95_ = 2;
	else if (i_95_ > 253)
	    i_95_ = 253;
	int i_96_ = (i & 0xff00) * i_94_ >> 15;
	if (i_96_ < 2)
	    i_96_ = 2;
	else if (i_96_ > 253)
	    i_96_ = 253;
	int i_97_ = (i & 0xff) * i_94_ >> 7;
	if (i_97_ < 2)
	    i_97_ = 2;
	else if (i_97_ > 253)
	    i_97_ = 253;
	return i_95_ << 16 | i_96_ << 8 | i_97_;
    }
    
    public void method1653() {
	((Class137_Sub1) this).aByteArrayArray8870 = null;
	((Class137_Sub1) this).aByteArrayArray8859 = null;
    }
    
    public void method1654(int i, int i_98_, int i_99_, boolean[][] bools,
			   boolean bool, int i_100_) {
	if ((((Class173_Sub3) ((Class137_Sub1) this).aClass173_Sub3_8857)
	     .anIntArray9719) == null
	    || (((Class173_Sub3) ((Class137_Sub1) this).aClass173_Sub3_8857)
		.aFloatArray9716) == null)
	    throw new IllegalStateException("");
	Class418 class418
	    = (((Class173_Sub3) ((Class137_Sub1) this).aClass173_Sub3_8857)
	       .aClass418_9736);
	((Class137_Sub1) this).aFloat8862 = class418.aFloatArray4768[0];
	((Class137_Sub1) this).aFloat8865 = class418.aFloatArray4768[1];
	((Class137_Sub1) this).aFloat8866 = class418.aFloatArray4768[2];
	((Class137_Sub1) this).aFloat8867 = class418.aFloatArray4768[3];
	((Class137_Sub1) this).aFloat8868 = class418.aFloatArray4768[4];
	((Class137_Sub1) this).aFloat8852 = class418.aFloatArray4768[5];
	((Class137_Sub1) this).aFloat8869 = class418.aFloatArray4768[6];
	((Class137_Sub1) this).aFloat8871 = class418.aFloatArray4768[7];
	((Class137_Sub1) this).aFloat8872 = class418.aFloatArray4768[8];
	((Class137_Sub1) this).aFloat8873 = class418.aFloatArray4768[9];
	((Class137_Sub1) this).aFloat8874 = class418.aFloatArray4768[10];
	((Class137_Sub1) this).aFloat8875 = class418.aFloatArray4768[11];
	((Class137_Sub1) this).aFloat8881 = class418.aFloatArray4768[12];
	((Class137_Sub1) this).aFloat8880 = class418.aFloatArray4768[13];
	((Class137_Sub1) this).aFloat8876 = class418.aFloatArray4768[14];
	((Class137_Sub1) this).aFloat8879 = class418.aFloatArray4768[15];
	for (int i_101_ = 0; i_101_ < i_99_ + i_99_; i_101_++) {
	    for (int i_102_ = 0; i_102_ < i_99_ + i_99_; i_102_++) {
		if (bools[i_101_][i_102_]) {
		    int i_103_ = i - i_99_ + i_101_;
		    int i_104_ = i_98_ - i_99_ + i_102_;
		    if (i_103_ >= 0 && i_103_ < anInt1627 * -657933437
			&& i_104_ >= 0 && i_104_ < anInt1626 * 1769495707)
			method8310(i_103_, i_104_, i_100_);
		}
	    }
	}
    }
    
    void method8310(int i, int i_105_, int i_106_) {
	Class107 class107 = ((Class137_Sub1) this).aClass173_Sub3_8857
				.method8939(Thread.currentThread());
	((Class121) ((Class107) class107).aClass121_1330).anInt1526 = 0;
	if (((Class137_Sub1) this).aClass87ArrayArray8861 != null)
	    method8312(i, i_105_, ((Class107) class107).aBool1324, class107,
		       ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_106_);
	else if (((Class137_Sub1) this).aClass130ArrayArray8853 != null)
	    method8311(i, i_105_, ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_106_);
	else if (((Class137_Sub1) this).aClass132ArrayArray8863 != null)
	    method8313(i, i_105_, ((Class107) class107).aBool1324, class107,
		       ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_106_);
    }
    
    void method8311(int i, int i_107_, Class121 class121, float[] fs,
		    float[] fs_108_, float[] fs_109_, float[] fs_110_,
		    float[] fs_111_, int i_112_) {
	Class130 class130
	    = ((Class137_Sub1) this).aClass130ArrayArray8853[i][i_107_];
	if (class130 != null) {
	    if ((((Class130) class130).aByte1590 & 0x2) == 0) {
		if (i_112_ != 0) {
		    if ((((Class130) class130).aByte1590 & 0x4) != 0) {
			if ((i_112_ & 0x1) != 0)
			    return;
		    } else if ((i_112_ & 0x2) != 0)
			return;
		}
		int i_113_ = i * (anInt1628 * 2130003981);
		int i_114_ = i_113_ + anInt1628 * 2130003981;
		int i_115_ = i_107_ * (anInt1628 * 2130003981);
		int i_116_ = i_115_ + anInt1628 * 2130003981;
		float f;
		float f_117_;
		float f_118_;
		float f_119_;
		float f_120_;
		float f_121_;
		float f_122_;
		float f_123_;
		float f_124_;
		float f_125_;
		float f_126_;
		float f_127_;
		float f_128_;
		float f_129_;
		float f_130_;
		float f_131_;
		if ((((Class130) class130).aByte1590 & 0x1) != 0) {
		    int i_132_ = anIntArrayArray1629[i][i_107_];
		    float f_133_
			= ((Class137_Sub1) this).aFloat8869 * (float) i_132_;
		    float f_134_
			= ((Class137_Sub1) this).aFloat8871 * (float) i_132_;
		    float f_135_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_113_)
				       + f_133_
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_115_)));
		    f = (((Class137_Sub1) this).aFloat8879
			 + (((Class137_Sub1) this).aFloat8867 * (float) i_113_
			    + f_134_
			    + (((Class137_Sub1) this).aFloat8875
			       * (float) i_115_)));
		    if (f_135_ < -f)
			return;
		    float f_136_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_114_)
				       + f_133_
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_115_)));
		    f_117_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_114_)
				 + f_134_
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_115_)));
		    if (f_136_ < -f_117_)
			return;
		    float f_137_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_114_)
				       + f_133_
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_116_)));
		    f_118_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_114_)
				 + f_134_
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_116_)));
		    if (f_137_ < -f_118_)
			return;
		    float f_138_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_113_)
				       + f_133_
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_116_)));
		    f_119_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_113_)
				 + f_134_
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_116_)));
		    if (f_138_ < -f_119_)
			return;
		    float f_139_
			= ((Class137_Sub1) this).aFloat8868 * (float) i_132_;
		    float f_140_
			= ((Class137_Sub1) this).aFloat8852 * (float) i_132_;
		    float f_141_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_113_)
				       + f_139_
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_115_)));
		    f_120_ = (((Class121) class121).aFloat1507
			      + ((Class121) class121).aFloat1508 * f_141_ / f);
		    float f_142_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_113_)
				       + f_140_
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_115_)));
		    f_121_ = (((Class121) class121).aFloat1512
			      + ((Class121) class121).aFloat1510 * f_142_ / f);
		    f_122_ = (((Class121) class121).aFloat1511
			      + ((Class121) class121).aFloat1503 * f_135_ / f);
		    float f_143_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_114_)
				       + f_139_
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_115_)));
		    f_123_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_143_
				 / f_117_));
		    float f_144_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_114_)
				       + f_140_
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_115_)));
		    f_124_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_144_
				 / f_117_));
		    f_125_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_136_
				 / f_117_));
		    float f_145_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_114_)
				       + f_139_
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_116_)));
		    f_126_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_145_
				 / f_118_));
		    float f_146_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_114_)
				       + f_140_
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_116_)));
		    f_127_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_146_
				 / f_118_));
		    f_128_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_137_
				 / f_118_));
		    float f_147_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_113_)
				       + f_139_
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_116_)));
		    f_129_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_147_
				 / f_119_));
		    float f_148_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_113_)
				       + f_140_
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_116_)));
		    f_130_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_148_
				 / f_119_));
		    f_131_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_138_
				 / f_119_));
		} else {
		    int i_149_ = anIntArrayArray1629[i][i_107_];
		    int i_150_ = anIntArrayArray1629[i + 1][i_107_];
		    int i_151_ = anIntArrayArray1629[i + 1][i_107_ + 1];
		    int i_152_ = anIntArrayArray1629[i][i_107_ + 1];
		    float f_153_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_113_)
				       + (((Class137_Sub1) this).aFloat8869
					  * (float) i_149_)
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_115_)));
		    f = (((Class137_Sub1) this).aFloat8879
			 + (((Class137_Sub1) this).aFloat8867 * (float) i_113_
			    + (((Class137_Sub1) this).aFloat8871
			       * (float) i_149_)
			    + (((Class137_Sub1) this).aFloat8875
			       * (float) i_115_)));
		    if (f_153_ < -f)
			return;
		    float f_154_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_114_)
				       + (((Class137_Sub1) this).aFloat8869
					  * (float) i_150_)
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_115_)));
		    f_117_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_114_)
				 + (((Class137_Sub1) this).aFloat8871
				    * (float) i_150_)
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_115_)));
		    if (f_154_ < -f_117_)
			return;
		    float f_155_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_114_)
				       + (((Class137_Sub1) this).aFloat8869
					  * (float) i_151_)
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_116_)));
		    f_118_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_114_)
				 + (((Class137_Sub1) this).aFloat8871
				    * (float) i_151_)
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_116_)));
		    if (f_155_ < -f_118_)
			return;
		    float f_156_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_113_)
				       + (((Class137_Sub1) this).aFloat8869
					  * (float) i_152_)
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_116_)));
		    f_119_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_113_)
				 + (((Class137_Sub1) this).aFloat8871
				    * (float) i_152_)
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_116_)));
		    if (f_156_ < -f_119_)
			return;
		    float f_157_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_113_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_149_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_115_)));
		    f_120_ = (((Class121) class121).aFloat1507
			      + ((Class121) class121).aFloat1508 * f_157_ / f);
		    float f_158_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_113_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_149_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_115_)));
		    f_121_ = (((Class121) class121).aFloat1512
			      + ((Class121) class121).aFloat1510 * f_158_ / f);
		    f_122_ = (((Class121) class121).aFloat1511
			      + ((Class121) class121).aFloat1503 * f_153_ / f);
		    float f_159_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_114_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_150_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_115_)));
		    f_123_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_159_
				 / f_117_));
		    float f_160_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_114_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_150_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_115_)));
		    f_124_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_160_
				 / f_117_));
		    f_125_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_154_
				 / f_117_));
		    float f_161_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_114_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_151_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_116_)));
		    f_126_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_161_
				 / f_118_));
		    float f_162_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_114_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_151_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_116_)));
		    f_127_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_162_
				 / f_118_));
		    f_128_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_155_
				 / f_118_));
		    float f_163_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_113_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_152_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_116_)));
		    f_129_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_163_
				 / f_119_));
		    float f_164_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_113_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_152_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_116_)));
		    f_130_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_164_
				 / f_119_));
		    f_131_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_156_
				 / f_119_));
		}
		boolean bool = false;
		if (((Class130) class130).aShort1589 != -1) {
		    Class160 class160
			= (((Class137_Sub1) this).aClass173_Sub3_8857
			       .aClass165_1984.method2093
			   (((Class130) class130).aShort1589 & 0xffff,
			    (byte) -2));
		    bool = class160.aBool1768;
		}
		if (((f_126_ - f_129_) * (f_124_ - f_130_)
		     - (f_127_ - f_130_) * (f_123_ - f_129_))
		    > 0.0F) {
		    ((Class121) class121).aBool1504
			= (f_126_ < 0.0F || f_129_ < 0.0F || f_123_ < 0.0F
			   || f_126_ > (float) ((Class121) class121).anInt1513
			   || f_129_ > (float) ((Class121) class121).anInt1513
			   || (f_123_
			       > (float) ((Class121) class121).anInt1513));
		    if (bool)
			class121.method1583
			    (true, true, false, f_127_, f_130_, f_124_, f_126_,
			     f_129_, f_123_, f_128_, f_131_, f_125_, f_118_,
			     f_119_, f_117_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
			     0.0F,
			     ~0xffffff | (Class72.anIntArray777
					  [(((Class130) class130).aShort1594
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class72.anIntArray777
					  [(((Class130) class130).aShort1593
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class72.anIntArray777
					  [(((Class130) class130).aShort1591
					    & 0xffff)]) & 0xffffff,
			     0, 0.0F, 0.0F, 0.0F,
			     ((Class130) class130).aShort1589 & 0xffff);
		    else
			class121.method1576
			    (true, true, false, f_127_, f_130_, f_124_, f_126_,
			     f_129_, f_123_, f_128_, f_131_, f_125_,
			     (float) (((Class130) class130).aShort1594
				      & 0xffff),
			     (float) (((Class130) class130).aShort1593
				      & 0xffff),
			     (float) (((Class130) class130).aShort1591
				      & 0xffff));
		}
		if (((f_120_ - f_123_) * (f_130_ - f_124_)
		     - (f_121_ - f_124_) * (f_129_ - f_123_))
		    > 0.0F) {
		    ((Class121) class121).aBool1504
			= (f_120_ < 0.0F || f_123_ < 0.0F || f_129_ < 0.0F
			   || f_120_ > (float) ((Class121) class121).anInt1513
			   || f_123_ > (float) ((Class121) class121).anInt1513
			   || (f_129_
			       > (float) ((Class121) class121).anInt1513));
		    if (bool)
			class121.method1583
			    (true, true, false, f_121_, f_124_, f_130_, f_120_,
			     f_123_, f_129_, f_122_, f_125_, f_131_, f, f_117_,
			     f_119_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
			     ~0xffffff | (Class72.anIntArray777
					  [(((Class130) class130).aShort1592
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class72.anIntArray777
					  [(((Class130) class130).aShort1591
					    & 0xffff)]) & 0xffffff,
			     ~0xffffff | (Class72.anIntArray777
					  [(((Class130) class130).aShort1593
					    & 0xffff)]) & 0xffffff,
			     0, 0.0F, 0.0F, 0.0F,
			     ((Class130) class130).aShort1589 & 0xffff);
		    else
			class121.method1576
			    (true, true, false, f_121_, f_124_, f_130_, f_120_,
			     f_123_, f_129_, f_122_, f_125_, f_131_,
			     (float) (((Class130) class130).aShort1592
				      & 0xffff),
			     (float) (((Class130) class130).aShort1591
				      & 0xffff),
			     (float) (((Class130) class130).aShort1593
				      & 0xffff));
		}
	    }
	} else {
	    Class100 class100
		= ((Class137_Sub1) this).aClass100ArrayArray8860[i][i_107_];
	    if (class100 != null) {
		if (i_112_ != 0) {
		    if ((((Class100) class100).aByte1272 & 0x4) != 0) {
			if ((i_112_ & 0x1) != 0)
			    return;
		    } else if ((i_112_ & 0x2) != 0)
			return;
		}
		for (int i_165_ = 0; i_165_ < ((Class100) class100).aShort1273;
		     i_165_++) {
		    int i_166_ = (((Class100) class100).aShortArray1275[i_165_]
				  + (i << anInt1625 * 1543345989));
		    short i_167_
			= ((Class100) class100).aShortArray1282[i_165_];
		    int i_168_ = (((Class100) class100).aShortArray1277[i_165_]
				  + (i_107_ << anInt1625 * 1543345989));
		    float f = (((Class137_Sub1) this).aFloat8876
			       + ((((Class137_Sub1) this).aFloat8866
				   * (float) i_166_)
				  + (((Class137_Sub1) this).aFloat8869
				     * (float) i_167_)
				  + (((Class137_Sub1) this).aFloat8874
				     * (float) i_168_)));
		    float f_169_ = (((Class137_Sub1) this).aFloat8879
				    + ((((Class137_Sub1) this).aFloat8867
					* (float) i_166_)
				       + (((Class137_Sub1) this).aFloat8871
					  * (float) i_167_)
				       + (((Class137_Sub1) this).aFloat8875
					  * (float) i_168_)));
		    if (f < -f_169_)
			return;
		    float f_170_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_166_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_167_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_168_)));
		    float f_171_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_166_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_167_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_168_)));
		    fs[i_165_] = (((Class121) class121).aFloat1507
				  + (((Class121) class121).aFloat1508 * f_170_
				     / f_169_));
		    fs_108_[i_165_] = (((Class121) class121).aFloat1512
				       + (((Class121) class121).aFloat1510
					  * f_171_ / f_169_));
		    fs_109_[i_165_]
			= (((Class121) class121).aFloat1511
			   + ((Class121) class121).aFloat1503 * f / f_169_);
		    fs_110_[i_165_] = f_169_;
		}
		if (((Class100) class100).aShortArray1283 != null) {
		    for (int i_172_ = 0;
			 i_172_ < ((Class100) class100).aShort1280; i_172_++) {
			short i_173_
			    = ((Class100) class100).aShortArray1279[i_172_];
			short i_174_
			    = ((Class100) class100).aShortArray1276[i_172_];
			short i_175_
			    = ((Class100) class100).aShortArray1281[i_172_];
			float f = fs[i_173_];
			float f_176_ = fs[i_174_];
			float f_177_ = fs[i_175_];
			float f_178_ = fs_108_[i_173_];
			float f_179_ = fs_108_[i_174_];
			float f_180_ = fs_108_[i_175_];
			if (((f - f_176_) * (f_180_ - f_179_)
			     - (f_178_ - f_179_) * (f_177_ - f_176_))
			    > 0.0F) {
			    ((Class121) class121).aBool1504
				= (f < 0.0F || f_176_ < 0.0F || f_177_ < 0.0F
				   || f > (float) (((Class121) class121)
						   .anInt1513)
				   || f_176_ > (float) (((Class121) class121)
							.anInt1513)
				   || f_177_ > (float) (((Class121) class121)
							.anInt1513));
			    boolean bool = false;
			    if (((Class100) class100).aShortArray1283[i_172_]
				!= -1) {
				Class160 class160
				    = (((Class137_Sub1) this)
					   .aClass173_Sub3_8857.aClass165_1984
					   .method2093
				       ((((Class100) class100).aShortArray1283
					 [i_172_]) & 0xffff,
					(byte) -102));
				bool = class160.aBool1768;
			    }
			    if (bool)
				class121.method1583
				    (true, true, false, f_178_, f_179_, f_180_,
				     f, f_176_, f_177_, fs_109_[i_173_],
				     fs_109_[i_174_], fs_109_[i_175_],
				     fs_110_[i_173_], fs_110_[i_174_],
				     fs_110_[i_175_],
				     ((float) (((Class100) class100)
					       .aShortArray1275[i_173_])
				      / (float) (anInt1628 * 2130003981)),
				     ((float) (((Class100) class100)
					       .aShortArray1275[i_174_])
				      / (float) (anInt1628 * 2130003981)),
				     ((float) (((Class100) class100)
					       .aShortArray1275[i_175_])
				      / (float) (anInt1628 * 2130003981)),
				     ((float) (((Class100) class100)
					       .aShortArray1277[i_173_])
				      / (float) (anInt1628 * 2130003981)),
				     ((float) (((Class100) class100)
					       .aShortArray1277[i_174_])
				      / (float) (anInt1628 * 2130003981)),
				     ((float) (((Class100) class100)
					       .aShortArray1277[i_175_])
				      / (float) (anInt1628 * 2130003981)),
				     ~0xffffff | (Class72.anIntArray777
						  [((((Class100) class100)
						     .aShortArray1278[i_173_])
						    & 0xffff)]) & 0xffffff,
				     ~0xffffff | (Class72.anIntArray777
						  [((((Class100) class100)
						     .aShortArray1278[i_174_])
						    & 0xffff)]) & 0xffffff,
				     ~0xffffff | (Class72.anIntArray777
						  [((((Class100) class100)
						     .aShortArray1278[i_175_])
						    & 0xffff)]) & 0xffffff,
				     0, 0.0F, 0.0F, 0.0F,
				     (((Class100) class100).aShortArray1283
				      [i_172_]) & 0xffff);
			    else {
				int i_181_ = (((Class100) class100)
					      .anIntArray1284[i_172_]);
				if (i_181_ != -1)
				    class121.method1576
					(true, true, false, f_178_, f_179_,
					 f_180_, f, f_176_, f_177_,
					 fs_109_[i_173_], fs_109_[i_174_],
					 fs_109_[i_175_],
					 (float) (PlayerModel.method7300
						  (i_181_,
						   (((Class100) class100)
						    .aShortArray1278[i_173_]),
						   (byte) 0)),
					 (float) (PlayerModel.method7300
						  (i_181_,
						   (((Class100) class100)
						    .aShortArray1278[i_174_]),
						   (byte) -19)),
					 (float) (PlayerModel.method7300
						  (i_181_,
						   (((Class100) class100)
						    .aShortArray1278[i_175_]),
						   (byte) 5)));
			    }
			}
		    }
		} else {
		    for (int i_182_ = 0;
			 i_182_ < ((Class100) class100).aShort1280; i_182_++) {
			short i_183_
			    = ((Class100) class100).aShortArray1279[i_182_];
			short i_184_
			    = ((Class100) class100).aShortArray1276[i_182_];
			short i_185_
			    = ((Class100) class100).aShortArray1281[i_182_];
			float f = fs[i_183_];
			float f_186_ = fs[i_184_];
			float f_187_ = fs[i_185_];
			float f_188_ = fs_108_[i_183_];
			float f_189_ = fs_108_[i_184_];
			float f_190_ = fs_108_[i_185_];
			if (((f - f_186_) * (f_190_ - f_189_)
			     - (f_188_ - f_189_) * (f_187_ - f_186_))
			    > 0.0F) {
			    int i_191_
				= ((Class100) class100).anIntArray1284[i_182_];
			    if (i_191_ != -1) {
				((Class121) class121).aBool1504
				    = (f < 0.0F || f_186_ < 0.0F
				       || f_187_ < 0.0F
				       || f > (float) (((Class121) class121)
						       .anInt1513)
				       || f_186_ > (float) ((Class121)
							    class121).anInt1513
				       || (f_187_
					   > (float) (((Class121) class121)
						      .anInt1513)));
				class121.method1576
				    (true, true, false, f_188_, f_189_, f_190_,
				     f, f_186_, f_187_, fs_109_[i_183_],
				     fs_109_[i_184_], fs_109_[i_185_],
				     (float) (PlayerModel.method7300
					      (i_191_,
					       (((Class100) class100)
						.aShortArray1278[i_183_]),
					       (byte) -31)),
				     (float) (PlayerModel.method7300
					      (i_191_,
					       (((Class100) class100)
						.aShortArray1278[i_184_]),
					       (byte) -113)),
				     (float) (PlayerModel.method7300
					      (i_191_,
					       (((Class100) class100)
						.aShortArray1278[i_185_]),
					       (byte) -93)));
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method8312(int i, int i_192_, boolean bool, Class107 class107,
		    Class121 class121, float[] fs, float[] fs_193_,
		    float[] fs_194_, float[] fs_195_, float[] fs_196_,
		    int i_197_) {
	Class87 class87
	    = ((Class137_Sub1) this).aClass87ArrayArray8861[i][i_192_];
	if (class87 != null) {
	    if ((((Class87) class87).aByte1115 & 0x2) == 0) {
		if (i_197_ != 0) {
		    if ((((Class87) class87).aByte1115 & 0x4) != 0) {
			if ((i_197_ & 0x1) != 0)
			    return;
		    } else if ((i_197_ & 0x2) != 0)
			return;
		}
		int i_198_ = i * (anInt1628 * 2130003981);
		int i_199_ = i_198_ + anInt1628 * 2130003981;
		int i_200_ = i_192_ * (anInt1628 * 2130003981);
		int i_201_ = i_200_ + anInt1628 * 2130003981;
		float f = 0.0F;
		float f_202_ = 0.0F;
		float f_203_ = 0.0F;
		float f_204_ = 0.0F;
		float f_205_;
		float f_206_;
		float f_207_;
		float f_208_;
		float f_209_;
		float f_210_;
		float f_211_;
		float f_212_;
		float f_213_;
		float f_214_;
		float f_215_;
		float f_216_;
		float f_217_;
		float f_218_;
		float f_219_;
		float f_220_;
		if ((((Class87) class87).aByte1115 & 0x1) != 0 && !bool) {
		    int i_221_ = anIntArrayArray1629[i][i_192_];
		    float f_222_
			= ((Class137_Sub1) this).aFloat8869 * (float) i_221_;
		    float f_223_
			= ((Class137_Sub1) this).aFloat8871 * (float) i_221_;
		    float f_224_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_198_)
				       + f_222_
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_200_)));
		    f_205_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_198_)
				 + f_223_
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_200_)));
		    if (f_224_ < -f_205_)
			return;
		    float f_225_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_199_)
				       + f_222_
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_200_)));
		    f_206_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_199_)
				 + f_223_
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_200_)));
		    if (f_225_ < -f_206_)
			return;
		    float f_226_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_199_)
				       + f_222_
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_201_)));
		    f_207_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_199_)
				 + f_223_
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_201_)));
		    if (f_226_ < -f_207_)
			return;
		    float f_227_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_198_)
				       + f_222_
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_201_)));
		    f_208_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_198_)
				 + f_223_
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_201_)));
		    if (f_227_ < -f_208_)
			return;
		    f_209_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_224_
				 / f_205_));
		    f_210_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_225_
				 / f_206_));
		    f_211_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_226_
				 / f_207_));
		    f_212_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_227_
				 / f_208_));
		    if (((Class107) class107).aBool1327) {
			float f_228_
			    = f_224_ - ((Class107) class107).aFloat1320;
			if (f_228_ > 0.0F) {
			    f = f_228_ / ((Class107) class107).aFloat1321;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_228_ = f_225_ - ((Class107) class107).aFloat1320;
			if (f_228_ > 0.0F) {
			    f_202_ = f_228_ / ((Class107) class107).aFloat1321;
			    if (f_202_ > 1.0F)
				f_202_ = 1.0F;
			}
			f_228_ = f_226_ - ((Class107) class107).aFloat1320;
			if (f_228_ > 0.0F) {
			    f_203_ = f_228_ / ((Class107) class107).aFloat1321;
			    if (f_203_ > 1.0F)
				f_203_ = 1.0F;
			}
			f_228_ = f_227_ - ((Class107) class107).aFloat1320;
			if (f_228_ > 0.0F) {
			    f_204_ = f_228_ / ((Class107) class107).aFloat1321;
			    if (f_204_ > 1.0F)
				f_204_ = 1.0F;
			}
		    }
		    float f_229_
			= ((Class137_Sub1) this).aFloat8868 * (float) i_221_;
		    float f_230_
			= ((Class137_Sub1) this).aFloat8852 * (float) i_221_;
		    float f_231_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_198_)
				       + f_229_
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_200_)));
		    f_213_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_231_
				 / f_205_));
		    float f_232_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_198_)
				       + f_230_
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_200_)));
		    f_214_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_232_
				 / f_205_));
		    float f_233_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_199_)
				       + f_229_
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_200_)));
		    f_215_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_233_
				 / f_206_));
		    float f_234_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_199_)
				       + f_230_
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_200_)));
		    f_216_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_234_
				 / f_206_));
		    float f_235_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_199_)
				       + f_229_
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_201_)));
		    f_217_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_235_
				 / f_207_));
		    float f_236_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_199_)
				       + f_230_
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_201_)));
		    f_218_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_236_
				 / f_207_));
		    float f_237_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_198_)
				       + f_229_
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_201_)));
		    f_219_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_237_
				 / f_208_));
		    float f_238_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_198_)
				       + f_230_
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_201_)));
		    f_220_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_238_
				 / f_208_));
		} else {
		    int i_239_ = anIntArrayArray1629[i][i_192_];
		    int i_240_ = anIntArrayArray1629[i + 1][i_192_];
		    int i_241_ = anIntArrayArray1629[i + 1][i_192_ + 1];
		    int i_242_ = anIntArrayArray1629[i][i_192_ + 1];
		    float f_243_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_198_)
				       + (((Class137_Sub1) this).aFloat8869
					  * (float) i_239_)
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_200_)));
		    f_205_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_198_)
				 + (((Class137_Sub1) this).aFloat8871
				    * (float) i_239_)
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_200_)));
		    if (f_243_ < -f_205_)
			return;
		    float f_244_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_199_)
				       + (((Class137_Sub1) this).aFloat8869
					  * (float) i_240_)
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_200_)));
		    f_206_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_199_)
				 + (((Class137_Sub1) this).aFloat8871
				    * (float) i_240_)
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_200_)));
		    if (f_244_ < -f_206_)
			return;
		    float f_245_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_199_)
				       + (((Class137_Sub1) this).aFloat8869
					  * (float) i_241_)
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_201_)));
		    f_207_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_199_)
				 + (((Class137_Sub1) this).aFloat8871
				    * (float) i_241_)
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_201_)));
		    if (f_245_ < -f_207_)
			return;
		    float f_246_ = (((Class137_Sub1) this).aFloat8876
				    + ((((Class137_Sub1) this).aFloat8866
					* (float) i_198_)
				       + (((Class137_Sub1) this).aFloat8869
					  * (float) i_242_)
				       + (((Class137_Sub1) this).aFloat8874
					  * (float) i_201_)));
		    f_208_ = (((Class137_Sub1) this).aFloat8879
			      + ((((Class137_Sub1) this).aFloat8867
				  * (float) i_198_)
				 + (((Class137_Sub1) this).aFloat8871
				    * (float) i_242_)
				 + (((Class137_Sub1) this).aFloat8875
				    * (float) i_201_)));
		    if (f_246_ < -f_208_)
			return;
		    f_209_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_243_
				 / f_205_));
		    f_210_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_244_
				 / f_206_));
		    f_211_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_245_
				 / f_207_));
		    f_212_ = (((Class121) class121).aFloat1511
			      + (((Class121) class121).aFloat1503 * f_246_
				 / f_208_));
		    if (bool) {
			float f_247_
			    = f_243_ - ((Class107) class107).aFloat1320;
			if (f_247_ > 0.0F) {
			    f_247_ /= ((Class107) class107).aFloat1321;
			    if (f_247_ > 1.0F)
				f_247_ = 1.0F;
			    f = f_247_;
			    int i_248_
				= (int) ((float) ((Class87) class87).aShort1117
					 * f_247_);
			    if (i_248_ > 0)
				i_239_ -= i_248_;
			}
			f_247_ = f_244_ - ((Class107) class107).aFloat1320;
			if (f_247_ > 0.0F) {
			    f_247_ /= ((Class107) class107).aFloat1321;
			    if (f_247_ > 1.0F)
				f_247_ = 1.0F;
			    f_202_ = f_247_;
			    int i_249_
				= (int) ((float) ((Class87) class87).aShort1118
					 * f_247_);
			    if (i_249_ > 0)
				i_240_ -= i_249_;
			}
			f_247_ = f_245_ - ((Class107) class107).aFloat1320;
			if (f_247_ > 0.0F) {
			    f_247_ /= ((Class107) class107).aFloat1321;
			    if (f_247_ > 1.0F)
				f_247_ = 1.0F;
			    f_203_ = f_247_;
			    int i_250_
				= (int) ((float) ((Class87) class87).aShort1119
					 * f_247_);
			    if (i_250_ > 0)
				i_241_ -= i_250_;
			}
			f_247_ = f_246_ - ((Class107) class107).aFloat1320;
			if (f_247_ > 0.0F) {
			    f_247_ /= ((Class107) class107).aFloat1321;
			    if (f_247_ > 1.0F)
				f_247_ = 1.0F;
			    f_204_ = f_247_;
			    int i_251_
				= (int) ((float) ((Class87) class87).aShort1120
					 * f_247_);
			    if (i_251_ > 0)
				i_242_ -= i_251_;
			}
		    } else if (((Class107) class107).aBool1327) {
			float f_252_
			    = f_243_ - ((Class107) class107).aFloat1320;
			if (f_252_ > 0.0F) {
			    f = f_252_ / ((Class107) class107).aFloat1321;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_252_ = f_244_ - ((Class107) class107).aFloat1320;
			if (f_252_ > 0.0F) {
			    f_202_ = f_252_ / ((Class107) class107).aFloat1321;
			    if (f_202_ > 1.0F)
				f_202_ = 1.0F;
			}
			f_252_ = f_245_ - ((Class107) class107).aFloat1320;
			if (f_252_ > 0.0F) {
			    f_203_ = f_252_ / ((Class107) class107).aFloat1321;
			    if (f_203_ > 1.0F)
				f_203_ = 1.0F;
			}
			f_252_ = f_246_ - ((Class107) class107).aFloat1320;
			if (f_252_ > 0.0F) {
			    f_204_ = f_252_ / ((Class107) class107).aFloat1321;
			    if (f_204_ > 1.0F)
				f_204_ = 1.0F;
			}
		    }
		    float f_253_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_198_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_239_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_200_)));
		    f_213_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_253_
				 / f_205_));
		    float f_254_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_198_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_239_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_200_)));
		    f_214_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_254_
				 / f_205_));
		    float f_255_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_199_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_240_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_200_)));
		    f_215_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_255_
				 / f_206_));
		    float f_256_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_199_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_240_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_200_)));
		    f_216_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_256_
				 / f_206_));
		    float f_257_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_199_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_241_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_201_)));
		    f_217_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_257_
				 / f_207_));
		    float f_258_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_199_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_241_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_201_)));
		    f_218_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_258_
				 / f_207_));
		    float f_259_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_198_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_242_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_201_)));
		    f_219_ = (((Class121) class121).aFloat1507
			      + (((Class121) class121).aFloat1508 * f_259_
				 / f_208_));
		    float f_260_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_198_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_242_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_201_)));
		    f_220_ = (((Class121) class121).aFloat1512
			      + (((Class121) class121).aFloat1510 * f_260_
				 / f_208_));
		}
		Class160 class160 = null;
		boolean bool_261_ = false;
		if (((Class87) class87).aShort1112 != -1) {
		    class160 = (((Class137_Sub1) this).aClass173_Sub3_8857
				    .aClass165_1984.method2093
				(((Class87) class87).aShort1112 & 0xffff,
				 (byte) -89));
		    bool_261_ = class160.aBool1768;
		}
		boolean bool_262_
		    = class160 != null && method8319(class160.aByte1790);
		float f_263_ = f_202_ + f_203_ + f_204_;
		if (((f_217_ - f_219_) * (f_216_ - f_220_)
		     - (f_218_ - f_220_) * (f_215_ - f_219_))
		    > 0.0F) {
		    ((Class121) class121).aBool1504
			= (f_217_ < 0.0F || f_219_ < 0.0F || f_215_ < 0.0F
			   || f_217_ > (float) ((Class121) class121).anInt1513
			   || f_219_ > (float) ((Class121) class121).anInt1513
			   || (f_215_
			       > (float) ((Class121) class121).anInt1513));
		    if (f_263_ < 3.0F) {
			if (f_263_ > 0.0F) {
			    if (bool_261_) {
				int i_264_ = -16777216;
				if (bool_262_)
				    i_264_ = -1694498816;
				class121.method1583
				    (true, true, false, f_218_, f_220_, f_216_,
				     f_217_, f_219_, f_215_, f_211_, f_212_,
				     f_210_, f_207_, f_208_, f_206_, 1.0F,
				     0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				     i_264_ | (((Class87) class87).anInt1113
					       & 0xffffff),
				     i_264_ | (((Class87) class87).anInt1116
					       & 0xffffff),
				     i_264_ | (((Class87) class87).anInt1114
					       & 0xffffff),
				     (((Class107) class107).anInt1342
				      * -1050551989),
				     f_203_ * 255.0F, f_204_ * 255.0F,
				     f_202_ * 255.0F,
				     ((Class87) class87).aShort1112 & 0xffff);
			    } else {
				if (bool_262_)
				    ((Class121) class121).anInt1526 = 100;
				class121.method1580
				    (true, true, false, f_218_, f_220_, f_216_,
				     f_217_, f_219_, f_215_, f_211_, f_212_,
				     f_210_,
				     (Class491.method5928
				      (((Class87) class87).anInt1113,
				       ((int) (f_203_ * 255.0F) << 24
					| (((Class107) class107).anInt1342
					   * -1050551989)),
				       260113475)),
				     (Class491.method5928
				      (((Class87) class87).anInt1116,
				       ((int) (f_204_ * 255.0F) << 24
					| (((Class107) class107).anInt1342
					   * -1050551989)),
				       -351101481)),
				     (Class491.method5928
				      (((Class87) class87).anInt1114,
				       ((int) (f_202_ * 255.0F) << 24
					| (((Class107) class107).anInt1342
					   * -1050551989)),
				       -657284077)));
				((Class121) class121).anInt1526 = 0;
			    }
			} else if (bool_261_) {
			    int i_265_ = -16777216;
			    if (bool_262_)
				i_265_ = -1694498816;
			    class121.method1583
				(true, true, false, f_218_, f_220_, f_216_,
				 f_217_, f_219_, f_215_, f_211_, f_212_,
				 f_210_, f_207_, f_208_, f_206_, 1.0F, 0.0F,
				 1.0F, 1.0F, 1.0F, 0.0F,
				 (i_265_
				  | ((Class87) class87).anInt1113 & 0xffffff),
				 (i_265_
				  | ((Class87) class87).anInt1116 & 0xffffff),
				 (i_265_
				  | ((Class87) class87).anInt1114 & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class87) class87).aShort1112 & 0xffff);
			} else {
			    if (bool_262_)
				((Class121) class121).anInt1526 = 100;
			    class121.method1580(true, true, false, f_218_,
						f_220_, f_216_, f_217_, f_219_,
						f_215_, f_211_, f_212_, f_210_,
						((Class87) class87).anInt1113,
						((Class87) class87).anInt1116,
						((Class87) class87).anInt1114);
			    ((Class121) class121).anInt1526 = 0;
			}
		    } else
			class121.method1582(true, true, false, f_218_, f_220_,
					    f_216_, f_217_, f_219_, f_215_,
					    f_211_, f_212_, f_210_,
					    (((Class107) class107).anInt1342
					     * -1050551989));
		}
		f_263_ = f + f_202_ + f_204_;
		if (((f_213_ - f_215_) * (f_220_ - f_216_)
		     - (f_214_ - f_216_) * (f_219_ - f_215_))
		    > 0.0F) {
		    ((Class121) class121).aBool1504
			= (f_213_ < 0.0F || f_215_ < 0.0F || f_219_ < 0.0F
			   || f_213_ > (float) ((Class121) class121).anInt1513
			   || f_215_ > (float) ((Class121) class121).anInt1513
			   || (f_219_
			       > (float) ((Class121) class121).anInt1513));
		    if (f_263_ < 3.0F) {
			if (bool_262_)
			    ((Class121) class121).anInt1526 = -1694498816;
			if (f_263_ > 0.0F) {
			    if (bool_261_) {
				int i_266_ = -16777216;
				if (bool_262_)
				    i_266_ = -1694498816;
				class121.method1583
				    (true, true, false, f_214_, f_216_, f_220_,
				     f_213_, f_215_, f_219_, f_209_, f_210_,
				     f_212_, f_205_, f_206_, f_208_, 0.0F,
				     1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				     i_266_ | (((Class87) class87).anInt1122
					       & 0xffffff),
				     i_266_ | (((Class87) class87).anInt1114
					       & 0xffffff),
				     i_266_ | (((Class87) class87).anInt1116
					       & 0xffffff),
				     (((Class107) class107).anInt1342
				      * -1050551989),
				     f * 255.0F, f_202_ * 255.0F,
				     f_204_ * 255.0F,
				     ((Class87) class87).aShort1112 & 0xffff);
			    } else {
				if (bool_262_)
				    ((Class121) class121).anInt1526 = 100;
				class121.method1580
				    (true, true, false, f_214_, f_216_, f_220_,
				     f_213_, f_215_, f_219_, f_209_, f_210_,
				     f_212_,
				     (Class491.method5928
				      (((Class87) class87).anInt1122,
				       ((int) (f * 255.0F) << 24
					| (((Class107) class107).anInt1342
					   * -1050551989)),
				       430662083)),
				     (Class491.method5928
				      (((Class87) class87).anInt1114,
				       ((int) (f_202_ * 255.0F) << 24
					| (((Class107) class107).anInt1342
					   * -1050551989)),
				       753351764)),
				     (Class491.method5928
				      (((Class87) class87).anInt1116,
				       ((int) (f_204_ * 255.0F) << 24
					| (((Class107) class107).anInt1342
					   * -1050551989)),
				       2115753240)));
				((Class121) class121).anInt1526 = 0;
			    }
			} else if (bool_261_) {
			    int i_267_ = -16777216;
			    if (bool_262_)
				i_267_ = -1694498816;
			    class121.method1583
				(true, true, false, f_214_, f_216_, f_220_,
				 f_213_, f_215_, f_219_, f_209_, f_210_,
				 f_212_, f_205_, f_206_, f_208_, 0.0F, 1.0F,
				 1.0F, 0.0F, 0.0F, 1.0F,
				 (i_267_
				  | ((Class87) class87).anInt1122 & 0xffffff),
				 (i_267_
				  | ((Class87) class87).anInt1114 & 0xffffff),
				 (i_267_
				  | ((Class87) class87).anInt1116 & 0xffffff),
				 0, 0.0F, 0.0F, 0.0F,
				 ((Class87) class87).aShort1112 & 0xffff);
			} else {
			    if (bool_262_)
				((Class121) class121).anInt1526 = 100;
			    class121.method1580(true, true, false, f_214_,
						f_216_, f_220_, f_213_, f_215_,
						f_219_, f_209_, f_210_, f_212_,
						((Class87) class87).anInt1122,
						((Class87) class87).anInt1114,
						((Class87) class87).anInt1116);
			    ((Class121) class121).anInt1526 = 0;
			}
		    } else
			class121.method1582(true, true, false, f_214_, f_216_,
					    f_220_, f_213_, f_215_, f_219_,
					    f_209_, f_210_, f_212_,
					    (((Class107) class107).anInt1342
					     * -1050551989));
		}
	    }
	} else {
	    Class102 class102
		= ((Class137_Sub1) this).aClass102ArrayArray8855[i][i_192_];
	    if (class102 != null) {
		if (i_197_ != 0) {
		    if ((((Class102) class102).aByte1290 & 0x4) != 0) {
			if ((i_197_ & 0x1) != 0)
			    return;
		    } else if ((i_197_ & 0x2) != 0)
			return;
		}
		for (int i_268_ = 0; i_268_ < ((Class102) class102).aShort1289;
		     i_268_++) {
		    int i_269_ = (((Class102) class102).aShortArray1295[i_268_]
				  + (i << anInt1625 * 1543345989));
		    int i_270_ = ((Class102) class102).aShortArray1292[i_268_];
		    int i_271_ = (((Class102) class102).aShortArray1293[i_268_]
				  + (i_192_ << anInt1625 * 1543345989));
		    float f = (((Class137_Sub1) this).aFloat8876
			       + ((((Class137_Sub1) this).aFloat8866
				   * (float) i_269_)
				  + (((Class137_Sub1) this).aFloat8869
				     * (float) i_270_)
				  + (((Class137_Sub1) this).aFloat8874
				     * (float) i_271_)));
		    float f_272_ = (((Class137_Sub1) this).aFloat8879
				    + ((((Class137_Sub1) this).aFloat8867
					* (float) i_269_)
				       + (((Class137_Sub1) this).aFloat8871
					  * (float) i_270_)
				       + (((Class137_Sub1) this).aFloat8875
					  * (float) i_271_)));
		    if (f < -f_272_)
			return;
		    float f_273_
			= (((Class121) class121).aFloat1511
			   + ((Class121) class121).aFloat1503 * f / f_272_);
		    fs_196_[i_268_] = 0.0F;
		    if (bool) {
			float f_274_ = f - ((Class107) class107).aFloat1320;
			if (f_274_ > 0.0F) {
			    f_274_ /= ((Class107) class107).aFloat1321;
			    if (f_274_ > 1.0F)
				f_274_ = 1.0F;
			    fs_196_[i_268_] = f_274_;
			    int i_275_
				= (int) ((float) (((Class102) class102)
						  .aShortArray1294[i_268_])
					 * f_274_);
			    if (i_275_ > 0)
				i_270_ -= i_275_;
			}
		    } else if (((Class107) class107).aBool1327) {
			float f_276_ = f - ((Class107) class107).aFloat1320;
			if (f_276_ > 0.0F) {
			    fs_196_[i_268_]
				= f_276_ / ((Class107) class107).aFloat1321;
			    if (fs_196_[i_268_] > 1.0F)
				fs_196_[i_268_] = 1.0F;
			}
		    }
		    float f_277_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_269_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_270_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_271_)));
		    float f_278_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_269_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_270_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_271_)));
		    fs[i_268_] = (((Class121) class121).aFloat1507
				  + (((Class121) class121).aFloat1508 * f_277_
				     / f_272_));
		    fs_193_[i_268_] = (((Class121) class121).aFloat1512
				       + (((Class121) class121).aFloat1510
					  * f_278_ / f_272_));
		    fs_194_[i_268_] = f_273_;
		    fs_195_[i_268_] = f_272_;
		}
		if (((Class102) class102).aShortArray1296 != null) {
		    for (int i_279_ = 0;
			 i_279_ < ((Class102) class102).aShort1291; i_279_++) {
			int i_280_ = i_279_ * 3;
			int i_281_ = i_280_ + 1;
			int i_282_ = i_281_ + 1;
			float f = fs[i_280_];
			float f_283_ = fs[i_281_];
			float f_284_ = fs[i_282_];
			float f_285_ = fs_193_[i_280_];
			float f_286_ = fs_193_[i_281_];
			float f_287_ = fs_193_[i_282_];
			float f_288_ = (fs_196_[i_280_] + fs_196_[i_281_]
					+ fs_196_[i_282_]);
			if (((f - f_283_) * (f_287_ - f_286_)
			     - (f_285_ - f_286_) * (f_284_ - f_283_))
			    > 0.0F) {
			    ((Class121) class121).aBool1504
				= (f < 0.0F || f_283_ < 0.0F || f_284_ < 0.0F
				   || f > (float) (((Class121) class121)
						   .anInt1513)
				   || f_283_ > (float) (((Class121) class121)
							.anInt1513)
				   || f_284_ > (float) (((Class121) class121)
							.anInt1513));
			    Class160 class160 = null;
			    boolean bool_289_ = false;
			    if (((Class102) class102).aShortArray1296[i_279_]
				!= -1) {
				class160
				    = (((Class137_Sub1) this)
					   .aClass173_Sub3_8857.aClass165_1984
					   .method2093
				       ((((Class102) class102).aShortArray1296
					 [i_279_]) & 0xffff,
					(byte) -60));
				bool_289_ = class160.aBool1768;
			    }
			    if (f_288_ < 3.0F) {
				if (f_288_ > 0.0F) {
				    if (bool_289_) {
					int i_290_ = -16777216;
					if (method8319(class160.aByte1790))
					    i_290_ = -1694498816;
					class121.method1583
					    (true, true, false, f_285_, f_286_,
					     f_287_, f, f_283_, f_284_,
					     fs_194_[i_280_], fs_194_[i_281_],
					     fs_194_[i_282_], fs_195_[i_280_],
					     fs_195_[i_281_], fs_195_[i_282_],
					     ((float) (((Class102) class102)
						       .aShortArray1295
						       [i_280_])
					      / (float) (anInt1628
							 * 2130003981)),
					     ((float) (((Class102) class102)
						       .aShortArray1295
						       [i_281_])
					      / (float) (anInt1628
							 * 2130003981)),
					     ((float) (((Class102) class102)
						       .aShortArray1295
						       [i_282_])
					      / (float) (anInt1628
							 * 2130003981)),
					     ((float) (((Class102) class102)
						       .aShortArray1293
						       [i_280_])
					      / (float) (anInt1628
							 * 2130003981)),
					     ((float) (((Class102) class102)
						       .aShortArray1293
						       [i_281_])
					      / (float) (anInt1628
							 * 2130003981)),
					     ((float) (((Class102) class102)
						       .aShortArray1293
						       [i_282_])
					      / (float) (anInt1628
							 * 2130003981)),
					     i_290_ | (((Class102) class102)
						       .anIntArray1288
						       [i_280_]) & 0xffffff,
					     i_290_ | (((Class102) class102)
						       .anIntArray1288
						       [i_281_]) & 0xffffff,
					     i_290_ | (((Class102) class102)
						       .anIntArray1288
						       [i_282_]) & 0xffffff,
					     (((Class107) class107).anInt1342
					      * -1050551989),
					     fs_196_[i_280_] * 255.0F,
					     fs_196_[i_281_] * 255.0F,
					     fs_196_[i_282_] * 255.0F,
					     ((((Class102) class102)
					       .aShortArray1296[i_279_])
					      & 0xffff));
				    } else if (((((Class102) class102)
						 .anIntArray1288[i_280_])
						& 0xffffff)
					       != 0) {
					class121.method1580
					    (true, true, false, f_285_, f_286_,
					     f_287_, f, f_283_, f_284_,
					     fs_194_[i_280_], fs_194_[i_281_],
					     fs_194_[i_282_],
					     (Class491.method5928
					      ((((Class102) class102)
						.anIntArray1288[i_280_]),
					       ((int) (fs_196_[i_280_]
						       * 255.0F) << 24
						| (((Class107) class107)
						   .anInt1342) * -1050551989),
					       618088075)),
					     (Class491.method5928
					      ((((Class102) class102)
						.anIntArray1288[i_281_]),
					       ((int) (fs_196_[i_281_]
						       * 255.0F) << 24
						| (((Class107) class107)
						   .anInt1342) * -1050551989),
					       -746387649)),
					     (Class491.method5928
					      ((((Class102) class102)
						.anIntArray1288[i_282_]),
					       ((int) (fs_196_[i_282_]
						       * 255.0F) << 24
						| (((Class107) class107)
						   .anInt1342) * -1050551989),
					       -1455414008)));
					((Class121) class121).anInt1526 = 0;
				    }
				} else if (bool_289_) {
				    int i_291_ = -16777216;
				    if (method8319(class160.aByte1790))
					i_291_ = -1694498816;
				    class121.method1583
					(true, true, false, f_285_, f_286_,
					 f_287_, f, f_283_, f_284_,
					 fs_194_[i_280_], fs_194_[i_281_],
					 fs_194_[i_282_], fs_195_[i_280_],
					 fs_195_[i_281_], fs_195_[i_282_],
					 ((float) (((Class102) class102)
						   .aShortArray1295[i_280_])
					  / (float) (anInt1628 * 2130003981)),
					 ((float) (((Class102) class102)
						   .aShortArray1295[i_281_])
					  / (float) (anInt1628 * 2130003981)),
					 ((float) (((Class102) class102)
						   .aShortArray1295[i_282_])
					  / (float) (anInt1628 * 2130003981)),
					 ((float) (((Class102) class102)
						   .aShortArray1293[i_280_])
					  / (float) (anInt1628 * 2130003981)),
					 ((float) (((Class102) class102)
						   .aShortArray1293[i_281_])
					  / (float) (anInt1628 * 2130003981)),
					 ((float) (((Class102) class102)
						   .aShortArray1293[i_282_])
					  / (float) (anInt1628 * 2130003981)),
					 i_291_ | ((((Class102) class102)
						    .anIntArray1288[i_280_])
						   & 0xffffff),
					 i_291_ | ((((Class102) class102)
						    .anIntArray1288[i_281_])
						   & 0xffffff),
					 i_291_ | ((((Class102) class102)
						    .anIntArray1288[i_282_])
						   & 0xffffff),
					 0, 0.0F, 0.0F, 0.0F,
					 (((Class102) class102).aShortArray1296
					  [i_279_]) & 0xffff);
				} else if (((((Class102) class102)
					     .anIntArray1288[i_280_])
					    & 0xffffff)
					   != 0) {
				    class121.method1580(true, true, false,
							f_285_, f_286_, f_287_,
							f, f_283_, f_284_,
							fs_194_[i_280_],
							fs_194_[i_281_],
							fs_194_[i_282_],
							(((Class102) class102)
							 .anIntArray1288
							 [i_280_]),
							(((Class102) class102)
							 .anIntArray1288
							 [i_281_]),
							(((Class102) class102)
							 .anIntArray1288
							 [i_282_]));
				    ((Class121) class121).anInt1526 = 0;
				}
			    } else
				class121.method1582(true, true, false, f_285_,
						    f_286_, f_287_, f, f_283_,
						    f_284_, fs_194_[i_280_],
						    fs_194_[i_281_],
						    fs_194_[i_282_],
						    ((((Class107) class107)
						      .anInt1342)
						     * -1050551989));
			}
		    }
		} else {
		    for (int i_292_ = 0;
			 i_292_ < ((Class102) class102).aShort1291; i_292_++) {
			int i_293_ = i_292_ * 3;
			int i_294_ = i_293_ + 1;
			int i_295_ = i_294_ + 1;
			float f = fs[i_293_];
			float f_296_ = fs[i_294_];
			float f_297_ = fs[i_295_];
			float f_298_ = fs_193_[i_293_];
			float f_299_ = fs_193_[i_294_];
			float f_300_ = fs_193_[i_295_];
			float f_301_ = (fs_196_[i_293_] + fs_196_[i_294_]
					+ fs_196_[i_295_]);
			if (((f - f_296_) * (f_300_ - f_299_)
			     - (f_298_ - f_299_) * (f_297_ - f_296_))
			    > 0.0F) {
			    ((Class121) class121).aBool1504
				= (f < 0.0F || f_296_ < 0.0F || f_297_ < 0.0F
				   || f > (float) (((Class121) class121)
						   .anInt1513)
				   || f_296_ > (float) (((Class121) class121)
							.anInt1513)
				   || f_297_ > (float) (((Class121) class121)
							.anInt1513));
			    if (f_301_ < 3.0F) {
				if (f_301_ > 0.0F) {
				    if (((((Class102) class102).anIntArray1288
					  [i_293_])
					 & 0xffffff)
					!= 0)
					class121.method1580
					    (true, true, false, f_298_, f_299_,
					     f_300_, f, f_296_, f_297_,
					     fs_194_[i_293_], fs_194_[i_294_],
					     fs_194_[i_295_],
					     (Class405.method4873
					      ((((Class102) class102)
						.anIntArray1288[i_293_]),
					       (((Class107) class107).anInt1342
						* -1050551989),
					       fs_196_[i_293_] * 255.0F,
					       2040829392)),
					     (Class405.method4873
					      ((((Class102) class102)
						.anIntArray1288[i_294_]),
					       (((Class107) class107).anInt1342
						* -1050551989),
					       fs_196_[i_294_] * 255.0F,
					       2040829392)),
					     (Class405.method4873
					      ((((Class102) class102)
						.anIntArray1288[i_295_]),
					       (((Class107) class107).anInt1342
						* -1050551989),
					       fs_196_[i_295_] * 255.0F,
					       2040829392)));
				} else if (((((Class102) class102)
					     .anIntArray1288[i_293_])
					    & 0xffffff)
					   != 0)
				    class121.method1580(true, true, false,
							f_298_, f_299_, f_300_,
							f, f_296_, f_297_,
							fs_194_[i_293_],
							fs_194_[i_294_],
							fs_194_[i_295_],
							(((Class102) class102)
							 .anIntArray1288
							 [i_293_]),
							(((Class102) class102)
							 .anIntArray1288
							 [i_294_]),
							(((Class102) class102)
							 .anIntArray1288
							 [i_295_]));
			    } else
				class121.method1582(true, true, false, f_298_,
						    f_299_, f_300_, f, f_296_,
						    f_297_, fs_194_[i_293_],
						    fs_194_[i_294_],
						    fs_194_[i_295_],
						    ((((Class107) class107)
						      .anInt1342)
						     * -1050551989));
			}
		    }
		}
	    }
	}
    }
    
    void method8313(int i, int i_302_, boolean bool, Class107 class107,
		    Class121 class121, float[] fs, float[] fs_303_,
		    float[] fs_304_, float[] fs_305_, float[] fs_306_,
		    int i_307_) {
	Class132 class132
	    = ((Class137_Sub1) this).aClass132ArrayArray8863[i][i_302_];
	if (i_307_ == 0 || (i_307_ & 0x2) == 0) {
	    if (class132 != null) {
		for (int i_308_ = 0; i_308_ < ((Class132) class132).aShort1609;
		     i_308_++) {
		    int i_309_ = (((Class132) class132).aShortArray1610[i_308_]
				  + (i << anInt1625 * 1543345989));
		    int i_310_ = ((Class132) class132).aShortArray1611[i_308_];
		    int i_311_ = (((Class132) class132).aShortArray1612[i_308_]
				  + (i_302_ << anInt1625 * 1543345989));
		    float f = (((Class137_Sub1) this).aFloat8876
			       + ((((Class137_Sub1) this).aFloat8866
				   * (float) i_309_)
				  + (((Class137_Sub1) this).aFloat8869
				     * (float) i_310_)
				  + (((Class137_Sub1) this).aFloat8874
				     * (float) i_311_)));
		    float f_312_ = (((Class137_Sub1) this).aFloat8879
				    + ((((Class137_Sub1) this).aFloat8867
					* (float) i_309_)
				       + (((Class137_Sub1) this).aFloat8871
					  * (float) i_310_)
				       + (((Class137_Sub1) this).aFloat8875
					  * (float) i_311_)));
		    if (f < -f_312_)
			return;
		    fs_306_[i_308_] = 0.0F;
		    if (bool) {
			float f_313_ = f - ((Class107) class107).aFloat1320;
			if (f_313_ > 0.0F) {
			    f_313_ /= ((Class107) class107).aFloat1321;
			    if (f_313_ > 1.0F)
				f_313_ = 1.0F;
			    fs_306_[i_308_] = f_313_;
			    int i_314_
				= (int) ((float) (((Class132) class132)
						  .aShortArray1613[i_308_])
					 * f_313_);
			    if (i_314_ > 0)
				i_310_ -= i_314_;
			}
		    } else if (((Class107) class107).aBool1327) {
			float f_315_ = f - ((Class107) class107).aFloat1320;
			if (f_315_ > 0.0F) {
			    fs_306_[i_308_]
				= f_315_ / ((Class107) class107).aFloat1321;
			    if (fs_306_[i_308_] > 1.0F)
				fs_306_[i_308_] = 1.0F;
			}
		    }
		    float f_316_ = (((Class137_Sub1) this).aFloat8881
				    + ((((Class137_Sub1) this).aFloat8862
					* (float) i_309_)
				       + (((Class137_Sub1) this).aFloat8868
					  * (float) i_310_)
				       + (((Class137_Sub1) this).aFloat8872
					  * (float) i_311_)));
		    float f_317_ = (((Class137_Sub1) this).aFloat8880
				    + ((((Class137_Sub1) this).aFloat8865
					* (float) i_309_)
				       + (((Class137_Sub1) this).aFloat8852
					  * (float) i_310_)
				       + (((Class137_Sub1) this).aFloat8873
					  * (float) i_311_)));
		    fs[i_308_] = (((Class121) class121).aFloat1507
				  + (((Class121) class121).aFloat1508 * f_316_
				     / f_312_));
		    fs_303_[i_308_] = (((Class121) class121).aFloat1512
				       + (((Class121) class121).aFloat1510
					  * f_317_ / f_312_));
		    fs_304_[i_308_]
			= (((Class121) class121).aFloat1511
			   + ((Class121) class121).aFloat1503 * f / f_312_);
		    fs_305_[i_308_] = f_312_;
		}
		float f = (float) (anInt1628 * 2130003981);
		for (int i_318_ = 0; i_318_ < ((Class132) class132).aShort1608;
		     i_318_++) {
		    int i_319_ = i_318_ * 3;
		    int i_320_ = i_319_ + 1;
		    int i_321_ = i_320_ + 1;
		    float f_322_ = fs[i_319_];
		    float f_323_ = fs[i_320_];
		    float f_324_ = fs[i_321_];
		    float f_325_ = fs_303_[i_319_];
		    float f_326_ = fs_303_[i_320_];
		    float f_327_ = fs_303_[i_321_];
		    if (((f_322_ - f_323_) * (f_327_ - f_326_)
			 - (f_325_ - f_326_) * (f_324_ - f_323_))
			> 0.0F) {
			((Class121) class121).aBool1504
			    = (f_322_ < 0.0F || f_323_ < 0.0F || f_324_ < 0.0F
			       || (f_322_
				   > (float) ((Class121) class121).anInt1513)
			       || (f_323_
				   > (float) ((Class121) class121).anInt1513)
			       || (f_324_
				   > (float) ((Class121) class121).anInt1513));
			if (fs_306_[i_319_] + fs_306_[i_320_] + fs_306_[i_321_]
			    < 3.0F) {
			    int i_328_ = i << anInt1625 * 1543345989;
			    int i_329_ = i_302_ << anInt1625 * 1543345989;
			    if ((((Class132) class132).anIntArray1616[i_319_]
				 & 0xffffff)
				!= 0) {
				if ((((Class132) class132).aShortArray1615
				     [i_319_]) != -1
				    && (((Class132) class132).aShortArray1615
					[i_320_]) != -1
				    && (((Class132) class132).aShortArray1615
					[i_321_]) != -1) {
				    if (((((Class132) class132).aShortArray1615
					  [i_319_])
					 == (((Class132) class132)
					     .aShortArray1615[i_320_]))
					&& ((((Class132) class132)
					     .aShortArray1615[i_319_])
					    == (((Class132) class132)
						.aShortArray1615[i_321_]))
					&& ((((Class132) class132)
					     .aShortArray1617[i_319_])
					    == (((Class132) class132)
						.aShortArray1617[i_320_]))
					&& ((((Class132) class132)
					     .aShortArray1617[i_319_])
					    == (((Class132) class132)
						.aShortArray1617[i_321_])))
					class121.method1583
					    (true, true, false, f_325_, f_326_,
					     f_327_, f_322_, f_323_, f_324_,
					     fs_304_[i_319_], fs_304_[i_320_],
					     fs_304_[i_321_], fs_305_[i_319_],
					     fs_305_[i_320_], fs_305_[i_321_],
					     ((float) (i_328_
						       + (((Class132) class132)
							  .aShortArray1610
							  [i_319_]))
					      / (float) (((Class132) class132)
							 .aShortArray1617
							 [i_319_])),
					     ((float) (i_328_
						       + (((Class132) class132)
							  .aShortArray1610
							  [i_320_]))
					      / (float) (((Class132) class132)
							 .aShortArray1617
							 [i_320_])),
					     ((float) (i_328_
						       + (((Class132) class132)
							  .aShortArray1610
							  [i_321_]))
					      / (float) (((Class132) class132)
							 .aShortArray1617
							 [i_321_])),
					     ((float) (i_329_
						       + (((Class132) class132)
							  .aShortArray1612
							  [i_319_]))
					      / (float) (((Class132) class132)
							 .aShortArray1617
							 [i_319_])),
					     ((float) (i_329_
						       + (((Class132) class132)
							  .aShortArray1612
							  [i_320_]))
					      / (float) (((Class132) class132)
							 .aShortArray1617
							 [i_320_])),
					     ((float) (i_329_
						       + (((Class132) class132)
							  .aShortArray1612
							  [i_321_]))
					      / (float) (((Class132) class132)
							 .aShortArray1617
							 [i_321_])),
					     (((Class132) class132)
					      .anIntArray1616[i_319_]),
					     (((Class132) class132)
					      .anIntArray1616[i_320_]),
					     (((Class132) class132)
					      .anIntArray1616[i_321_]),
					     (((Class107) class107).anInt1342
					      * -1050551989),
					     fs_306_[i_319_] * 255.0F,
					     fs_306_[i_320_] * 255.0F,
					     fs_306_[i_321_] * 255.0F,
					     ((((Class132) class132)
					       .aShortArray1615[i_319_])
					      & 0xffff));
				    else
					class121.method1585
					    (true, true, false, f_325_, f_326_,
					     f_327_, f_322_, f_323_, f_324_,
					     fs_304_[i_319_], fs_304_[i_320_],
					     fs_304_[i_321_], fs_305_[i_319_],
					     fs_305_[i_320_], fs_305_[i_321_],
					     (float) (i_328_
						      + (((Class132) class132)
							 .aShortArray1610
							 [i_319_])) / f,
					     (float) (i_328_
						      + (((Class132) class132)
							 .aShortArray1610
							 [i_320_])) / f,
					     (float) (i_328_
						      + (((Class132) class132)
							 .aShortArray1610
							 [i_321_])) / f,
					     (float) (i_329_
						      + (((Class132) class132)
							 .aShortArray1612
							 [i_319_])) / f,
					     (float) (i_329_
						      + (((Class132) class132)
							 .aShortArray1612
							 [i_320_])) / f,
					     (float) (i_329_
						      + (((Class132) class132)
							 .aShortArray1612
							 [i_321_])) / f,
					     (((Class132) class132)
					      .anIntArray1616[i_319_]),
					     (((Class132) class132)
					      .anIntArray1616[i_320_]),
					     (((Class132) class132)
					      .anIntArray1616[i_321_]),
					     (((Class107) class107).anInt1342
					      * -1050551989),
					     fs_306_[i_319_] * 255.0F,
					     fs_306_[i_320_] * 255.0F,
					     fs_306_[i_321_] * 255.0F,
					     ((((Class132) class132)
					       .aShortArray1615[i_319_])
					      & 0xffff),
					     f / (float) (((Class132) class132)
							  .aShortArray1617
							  [i_319_]),
					     ((((Class132) class132)
					       .aShortArray1615[i_320_])
					      & 0xffff),
					     f / (float) (((Class132) class132)
							  .aShortArray1617
							  [i_320_]),
					     ((((Class132) class132)
					       .aShortArray1615[i_321_])
					      & 0xffff),
					     f / (float) (((Class132) class132)
							  .aShortArray1617
							  [i_321_]));
				} else if ((fs_306_[i_319_] + fs_306_[i_320_]
					    + fs_306_[i_321_])
					   > 0.0F)
				    class121.method1580
					(true, true, false, f_325_, f_326_,
					 f_327_, f_322_, f_323_, f_324_,
					 fs_304_[i_319_], fs_304_[i_320_],
					 fs_304_[i_321_],
					 (Class405.method4873
					  ((((Class132) class132)
					    .anIntArray1616[i_319_]),
					   (((Class107) class107).anInt1342
					    * -1050551989),
					   fs_306_[i_319_] * 255.0F,
					   2040829392)),
					 (Class405.method4873
					  ((((Class132) class132)
					    .anIntArray1616[i_320_]),
					   (((Class107) class107).anInt1342
					    * -1050551989),
					   fs_306_[i_320_] * 255.0F,
					   2040829392)),
					 (Class405.method4873
					  ((((Class132) class132)
					    .anIntArray1616[i_321_]),
					   (((Class107) class107).anInt1342
					    * -1050551989),
					   fs_306_[i_321_] * 255.0F,
					   2040829392)));
				else
				    class121.method1580(true, true, false,
							f_325_, f_326_, f_327_,
							f_322_, f_323_, f_324_,
							fs_304_[i_319_],
							fs_304_[i_320_],
							fs_304_[i_321_],
							(((Class132) class132)
							 .anIntArray1616
							 [i_319_]),
							(((Class132) class132)
							 .anIntArray1616
							 [i_320_]),
							(((Class132) class132)
							 .anIntArray1616
							 [i_321_]));
			    }
			} else
			    class121.method1582(true, true, false, f_325_,
						f_326_, f_327_, f_322_, f_323_,
						f_324_, fs_304_[i_319_],
						fs_304_[i_320_],
						fs_304_[i_321_],
						(((Class107) class107)
						 .anInt1342) * -1050551989);
		    }
		}
	    }
	}
    }
    
    public void method1689(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_330_, int i_331_, int i_332_, boolean bool) {
	/* empty */
    }
    
    public void method1655(int i, int i_333_, int i_334_, int i_335_,
			   int i_336_, int i_337_, int i_338_,
			   boolean[][] bools) {
	Class107 class107 = ((Class137_Sub1) this).aClass173_Sub3_8857
				.method8939(Thread.currentThread());
	Class121 class121 = ((Class107) class107).aClass121_1330;
	((Class121) class121).anInt1526 = 0;
	((Class121) class121).aBool1504 = true;
	((Class137_Sub1) this).aClass173_Sub3_8857.method8932();
	if (((Class137_Sub1) this).aClass87ArrayArray8861 != null
	    || ((Class137_Sub1) this).aClass132ArrayArray8863 != null)
	    method8314(i, i_333_, i_334_, i_335_, i_336_, i_337_, i_338_,
		       bools, class107, class121,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353);
	else if (((Class137_Sub1) this).aClass130ArrayArray8853 != null)
	    method8315(i, i_333_, i_334_, i_335_, i_336_, i_337_, i_338_,
		       bools, class107, class121,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353);
    }
    
    public void method1682(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_339_, int i_340_, int i_341_, boolean bool) {
	/* empty */
    }
    
    void method8314(int i, int i_342_, int i_343_, int i_344_, int i_345_,
		    int i_346_, int i_347_, boolean[][] bools,
		    Class107 class107, Class121 class121, float[] fs,
		    float[] fs_348_) {
	int i_349_ = (i_347_ - i_345_) * i_343_ / 256;
	int i_350_ = i_343_ >> 8;
	boolean bool = ((Class107) class107).aBool1344;
	((Class137_Sub1) this).aClass173_Sub3_8857.method2283(false);
	((Class121) class121).aBool1501 = false;
	((Class121) class121).aBool1502 = false;
	int i_351_ = i;
	int i_352_ = i_342_ + i_349_;
	for (int i_353_ = i_344_; i_353_ < i_346_; i_353_++) {
	    for (int i_354_ = i_345_; i_354_ < i_347_; i_354_++) {
		if (bools[i_353_ - i_344_][i_354_ - i_345_]) {
		    if (((Class137_Sub1) this).aClass87ArrayArray8861
			!= null) {
			if ((((Class137_Sub1) this).aClass87ArrayArray8861
			     [i_353_][i_354_])
			    != null) {
			    Class87 class87
				= (((Class137_Sub1) this)
				   .aClass87ArrayArray8861[i_353_][i_354_]);
			    if (((Class87) class87).aShort1112 != -1
				&& (((Class87) class87).aByte1115 & 0x2) == 0
				&& ((Class87) class87).anInt1121 == 0) {
				int i_355_
				    = (((Class137_Sub1) this)
					   .aClass173_Sub3_8857.method8936
				       (((Class87) class87).aShort1112
					& 0xffff));
				class121.method1576
				    (true, true, false,
				     (float) (i_352_ - i_350_),
				     (float) (i_352_ - i_350_), (float) i_352_,
				     (float) (i_351_ + i_350_), (float) i_351_,
				     (float) (i_351_ + i_350_), 100.0F, 100.0F,
				     100.0F,
				     (float) PlayerModel.method7300(i_355_,
								 (((Class87)
								   class87)
								  .anInt1113),
								 (byte) -8),
				     (float) PlayerModel.method7300(i_355_,
								 (((Class87)
								   class87)
								  .anInt1116),
								 (byte) -74),
				     (float) PlayerModel.method7300(i_355_,
								 (((Class87)
								   class87)
								  .anInt1114),
								 (byte) -32));
				class121.method1576
				    (true, true, false, (float) i_352_,
				     (float) i_352_, (float) (i_352_ - i_350_),
				     (float) i_351_, (float) (i_351_ + i_350_),
				     (float) i_351_, 100.0F, 100.0F, 100.0F,
				     (float) PlayerModel.method7300(i_355_,
								 (((Class87)
								   class87)
								  .anInt1122),
								 (byte) -118),
				     (float) PlayerModel.method7300(i_355_,
								 (((Class87)
								   class87)
								  .anInt1114),
								 (byte) -125),
				     (float) PlayerModel.method7300(i_355_,
								 (((Class87)
								   class87)
								  .anInt1116),
								 (byte) -50));
			    } else if (((Class87) class87).anInt1121 == 0) {
				class121.method1580
				    (true, true, false,
				     (float) (i_352_ - i_350_),
				     (float) (i_352_ - i_350_), (float) i_352_,
				     (float) (i_351_ + i_350_), (float) i_351_,
				     (float) (i_351_ + i_350_), 100.0F, 100.0F,
				     100.0F, ((Class87) class87).anInt1113,
				     ((Class87) class87).anInt1116,
				     ((Class87) class87).anInt1114);
				class121.method1580
				    (true, true, false, (float) i_352_,
				     (float) i_352_, (float) (i_352_ - i_350_),
				     (float) i_351_, (float) (i_351_ + i_350_),
				     (float) i_351_, 100.0F, 100.0F, 100.0F,
				     ((Class87) class87).anInt1122,
				     ((Class87) class87).anInt1114,
				     ((Class87) class87).anInt1116);
			    } else {
				int i_356_ = ((Class87) class87).anInt1121;
				class121.method1580
				    (true, true, false,
				     (float) (i_352_ - i_350_),
				     (float) (i_352_ - i_350_), (float) i_352_,
				     (float) (i_351_ + i_350_), (float) i_351_,
				     (float) (i_351_ + i_350_), 100.0F, 100.0F,
				     100.0F,
				     Class491.method5928(i_356_,
							 ((((Class87) class87)
							   .anInt1113)
							  & ~0xffffff),
							 -1023714287),
				     Class491.method5928(i_356_,
							 ((((Class87) class87)
							   .anInt1116)
							  & ~0xffffff),
							 780224113),
				     Class491.method5928(i_356_,
							 ((((Class87) class87)
							   .anInt1114)
							  & ~0xffffff),
							 303153639));
				class121.method1580
				    (true, true, false, (float) i_352_,
				     (float) i_352_, (float) (i_352_ - i_350_),
				     (float) i_351_, (float) (i_351_ + i_350_),
				     (float) i_351_, 100.0F, 100.0F, 100.0F,
				     Class491.method5928(i_356_,
							 ((((Class87) class87)
							   .anInt1122)
							  & ~0xffffff),
							 -239209896),
				     Class491.method5928(i_356_,
							 ((((Class87) class87)
							   .anInt1114)
							  & ~0xffffff),
							 -1333774162),
				     Class491.method5928(i_356_,
							 ((((Class87) class87)
							   .anInt1116)
							  & ~0xffffff),
							 -911913275));
			    }
			} else if ((((Class137_Sub1) this)
				    .aClass102ArrayArray8855[i_353_][i_354_])
				   != null) {
			    Class102 class102
				= (((Class137_Sub1) this)
				   .aClass102ArrayArray8855[i_353_][i_354_]);
			    for (int i_357_ = 0;
				 i_357_ < ((Class102) class102).aShort1289;
				 i_357_++) {
				fs[i_357_]
				    = (float) (i_351_
					       + ((((Class102) class102)
						   .aShortArray1295[i_357_])
						  * i_350_
						  / (anInt1628 * 2130003981)));
				fs_348_[i_357_]
				    = (float) (i_352_
					       - ((((Class102) class102)
						   .aShortArray1293[i_357_])
						  * i_350_
						  / (anInt1628 * 2130003981)));
			    }
			    for (int i_358_ = 0;
				 i_358_ < ((Class102) class102).aShort1291;
				 i_358_++) {
				int i_359_ = i_358_ * 3;
				int i_360_ = i_359_ + 1;
				int i_361_ = i_360_ + 1;
				float f = fs[i_359_];
				float f_362_ = fs[i_360_];
				float f_363_ = fs[i_361_];
				float f_364_ = fs_348_[i_359_];
				float f_365_ = fs_348_[i_360_];
				float f_366_ = fs_348_[i_361_];
				if ((((Class102) class102).anIntArray1298
				     != null)
				    && (((Class102) class102).anIntArray1298
					[i_358_]) != 0
				    && ((((Class102) class102).aShortArray1296
					 == null)
					|| ((((Class102) class102)
					     .aShortArray1296) != null
					    && ((((Class102) class102)
						 .aShortArray1296[i_358_])
						== -1)))) {
				    int i_367_ = (((Class102) class102)
						  .anIntArray1298[i_358_]);
				    class121.method1580
					(true, true, false, f_364_, f_365_,
					 f_366_, f, f_362_, f_363_, 100.0F,
					 100.0F, 100.0F,
					 (Class491.method5928
					  (i_367_,
					   -16777216 - ((((Class102) class102)
							 .anIntArray1288
							 [i_359_])
							& ~0xffffff),
					   -2140161552)),
					 (Class491.method5928
					  (i_367_,
					   -16777216 - ((((Class102) class102)
							 .anIntArray1288
							 [i_360_])
							& ~0xffffff),
					   579546827)),
					 (Class491.method5928
					  (i_367_,
					   -16777216 - ((((Class102) class102)
							 .anIntArray1288
							 [i_361_])
							& ~0xffffff),
					   1790349803)));
				} else if ((((Class102) class102)
					    .aShortArray1296) != null
					   && ((((Class102) class102)
						.aShortArray1296[i_358_])
					       != -1)) {
				    int i_368_
					= (((Class137_Sub1) this)
					       .aClass173_Sub3_8857.method8936
					   ((((Class102) class102)
					     .aShortArray1296[i_358_])
					    & 0xffff));
				    class121.method1576(true, true, false,
							f_364_, f_365_, f_366_,
							f, f_362_, f_363_,
							100.0F, 100.0F, 100.0F,
							(float) i_368_,
							(float) i_368_,
							(float) i_368_);
				} else
				    class121.method1580(true, true, false,
							f_364_, f_365_, f_366_,
							f, f_362_, f_363_,
							100.0F, 100.0F, 100.0F,
							(((Class102) class102)
							 .anIntArray1288
							 [i_359_]),
							(((Class102) class102)
							 .anIntArray1288
							 [i_360_]),
							(((Class102) class102)
							 .anIntArray1288
							 [i_361_]));
			    }
			}
		    } else if ((((Class137_Sub1) this).aClass132ArrayArray8863
				[i_353_][i_354_])
			       != null) {
			Class132 class132
			    = (((Class137_Sub1) this).aClass132ArrayArray8863
			       [i_353_][i_354_]);
			for (int i_369_ = 0;
			     i_369_ < ((Class132) class132).aShort1609;
			     i_369_++) {
			    fs[i_369_]
				= (float) (i_351_
					   + ((((Class132) class132)
					       .aShortArray1610[i_369_])
					      * i_350_
					      / (anInt1628 * 2130003981)));
			    fs_348_[i_369_]
				= (float) (i_352_
					   - ((((Class132) class132)
					       .aShortArray1612[i_369_])
					      * i_350_
					      / (anInt1628 * 2130003981)));
			}
			for (int i_370_ = 0;
			     i_370_ < ((Class132) class132).aShort1608;
			     i_370_++) {
			    int i_371_ = i_370_ * 3;
			    int i_372_ = i_371_ + 1;
			    int i_373_ = i_372_ + 1;
			    float f = fs[i_371_];
			    float f_374_ = fs[i_372_];
			    float f_375_ = fs[i_373_];
			    float f_376_ = fs_348_[i_371_];
			    float f_377_ = fs_348_[i_372_];
			    float f_378_ = fs_348_[i_373_];
			    if (((Class132) class132).anIntArray1618 != null
				&& (((Class132) class132).anIntArray1618
				    [i_370_]) != 0) {
				int i_379_ = (((Class132) class132)
					      .anIntArray1618[i_370_]);
				class121.method1580(true, true, false, f_376_,
						    f_377_, f_378_, f, f_374_,
						    f_375_, 100.0F, 100.0F,
						    100.0F, i_379_, i_379_,
						    i_379_);
			    } else
				class121.method1580(true, true, false, f_376_,
						    f_377_, f_378_, f, f_374_,
						    f_375_, 100.0F, 100.0F,
						    100.0F,
						    (((Class132) class132)
						     .anIntArray1616[i_371_]),
						    (((Class132) class132)
						     .anIntArray1616[i_372_]),
						    (((Class132) class132)
						     .anIntArray1616[i_373_]));
			}
		    }
		}
		i_352_ -= i_350_;
	    }
	    i_352_ = i_342_ + i_349_;
	    i_351_ += i_350_;
	}
	((Class121) class121).aBool1501 = true;
	((Class137_Sub1) this).aClass173_Sub3_8857.method2283(bool);
    }
    
    public void method1661(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_380_, int i_381_, int i_382_, boolean bool) {
	/* empty */
    }
    
    public void method1685(Class528_Sub12 class528_sub12, int[] is) {
	/* empty */
    }
    
    public void method1662(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_383_, int i_384_, int i_385_, boolean bool) {
	/* empty */
    }
    
    Class137_Sub1(Class173_Sub3 class173_sub3, int i, int i_386_, int i_387_,
		  int i_388_, int[][] is, int[][] is_389_, int i_390_) {
	super(i_387_, i_388_, i_390_, is);
	((Class137_Sub1) this).aClass173_Sub3_8857 = class173_sub3;
	((Class137_Sub1) this).anInt8858 = i_386_;
	((Class137_Sub1) this).aByteArrayArray8870
	    = new byte[i_387_ + 1][i_388_ + 1];
	int i_391_
	    = ((((Class173_Sub3) ((Class137_Sub1) this).aClass173_Sub3_8857)
		.anInt9732) * -868495557
	       >> 9);
	for (int i_392_ = 1; i_392_ < i_388_; i_392_++) {
	    for (int i_393_ = 1; i_393_ < i_387_; i_393_++) {
		int i_394_ = i_391_;
		int i_395_ = (is_389_[i_393_ + 1][i_392_]
			      - is_389_[i_393_ - 1][i_392_]);
		int i_396_ = (is_389_[i_393_][i_392_ + 1]
			      - is_389_[i_393_][i_392_ - 1]);
		int i_397_
		    = (int) Math.sqrt((double) (i_395_ * i_395_ + 512 * i_390_
						+ i_396_ * i_396_));
		int i_398_ = (i_395_ << 8) / i_397_;
		int i_399_ = -512 * i_390_ / i_397_;
		int i_400_ = (i_396_ << 8) / i_397_;
		i_394_ += ((((Class173_Sub3) (((Class137_Sub1) this)
					      .aClass173_Sub3_8857)).anInt9727
			    * 911244877 * i_398_)
			   + (((Class173_Sub3)
			       ((Class137_Sub1) this).aClass173_Sub3_8857)
			      .anInt9728) * -949467139 * i_399_
			   + (((Class173_Sub3)
			       ((Class137_Sub1) this).aClass173_Sub3_8857)
			      .anInt9729) * -1327222113 * i_400_) >> 17;
		i_394_ >>= 1;
		if (i_394_ < 2)
		    i_394_ = 2;
		else if (i_394_ > 126)
		    i_394_ = 126;
		((Class137_Sub1) this).aByteArrayArray8870[i_393_][i_392_]
		    = (byte) i_394_;
	    }
	}
	((Class137_Sub1) this).aByteArrayArray8859
	    = new byte[i_387_ + 1][i_388_ + 1];
    }
    
    public void method1666(int i, int i_401_, int i_402_) {
	i = Math.min(((Class137_Sub1) this).aByteArrayArray8859.length - 1,
		     Math.max(0, i));
	i_401_ = Math.min((((Class137_Sub1) this).aByteArrayArray8859[i].length
			   - 1),
			  Math.max(0, i_401_));
	if (((Class137_Sub1) this).aByteArrayArray8859[i][i_401_] < i_402_)
	    ((Class137_Sub1) this).aByteArrayArray8859[i][i_401_]
		= (byte) i_402_;
    }
    
    public void method1664(int i, int i_403_, int i_404_) {
	i = Math.min(((Class137_Sub1) this).aByteArrayArray8859.length - 1,
		     Math.max(0, i));
	i_403_ = Math.min((((Class137_Sub1) this).aByteArrayArray8859[i].length
			   - 1),
			  Math.max(0, i_403_));
	if (((Class137_Sub1) this).aByteArrayArray8859[i][i_403_] < i_404_)
	    ((Class137_Sub1) this).aByteArrayArray8859[i][i_403_]
		= (byte) i_404_;
    }
    
    public void method1675(int i, int i_405_, int[] is, int[] is_406_,
			   int[] is_407_, int[] is_408_, int[] is_409_,
			   int[] is_410_, int[] is_411_, int[] is_412_,
			   Class164 class164, boolean bool) {
	boolean bool_413_ = (((Class137_Sub1) this).anInt8858 & 0x20) == 0;
	if (((Class137_Sub1) this).aClass87ArrayArray8861 == null
	    && !bool_413_) {
	    ((Class137_Sub1) this).aClass87ArrayArray8861
		= new Class87[anInt1627 * -657933437][anInt1626 * 1769495707];
	    ((Class137_Sub1) this).aClass102ArrayArray8855
		= new Class102[anInt1627 * -657933437][anInt1626 * 1769495707];
	} else if (((Class137_Sub1) this).aClass132ArrayArray8863 == null
		   && bool_413_)
	    ((Class137_Sub1) this).aClass132ArrayArray8863
		= new Class132[anInt1627 * -657933437][anInt1626 * 1769495707];
	else if (((Class137_Sub1) this).aClass130ArrayArray8853 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_414_ = 0; i_414_ < is_409_.length; i_414_++) {
		if (is_409_[i_414_] == -1)
		    is_409_[i_414_] = 0;
		else
		    is_409_[i_414_]
			= (Class72.anIntArray777
			   [(Class516.method6283(is_409_[i_414_], 515814180)
			     & 0xffff)]) << 8 | 0xff;
	    }
	    if (is_410_ != null) {
		for (int i_415_ = 0; i_415_ < is_410_.length; i_415_++) {
		    if (is_410_[i_415_] == -1)
			is_410_[i_415_] = 0;
		    else
			is_410_[i_415_]
			    = ((Class72.anIntArray777
				[Class516.method6283(is_410_[i_415_],
						     515814180) & 0xffff]) << 8
			       | 0xff);
		}
	    }
	    if (bool_413_) {
		Class132 class132 = new Class132();
		((Class132) class132).aShort1609 = (short) is.length;
		((Class132) class132).aShort1608 = (short) (is.length / 3);
		((Class132) class132).aShortArray1610
		    = new short[((Class132) class132).aShort1609];
		((Class132) class132).aShortArray1611
		    = new short[((Class132) class132).aShort1609];
		((Class132) class132).aShortArray1612
		    = new short[((Class132) class132).aShort1609];
		((Class132) class132).anIntArray1616
		    = new int[((Class132) class132).aShort1609];
		((Class132) class132).aShortArray1615
		    = new short[((Class132) class132).aShort1609];
		((Class132) class132).aShortArray1617
		    = new short[((Class132) class132).aShort1609];
		((Class132) class132).aByteArray1614
		    = new byte[((Class132) class132).aShort1609];
		if (is_408_ != null)
		    ((Class132) class132).aShortArray1613
			= new short[((Class132) class132).aShort1609];
		for (int i_416_ = 0; i_416_ < ((Class132) class132).aShort1609;
		     i_416_++) {
		    int i_417_ = is[i_416_];
		    int i_418_ = is_407_[i_416_];
		    boolean bool_419_ = false;
		    int i_420_;
		    if (i_417_ == 0 && i_418_ == 0)
			i_420_ = ((((Class137_Sub1) this).aByteArrayArray8870
				   [i][i_405_])
				  - (((Class137_Sub1) this).aByteArrayArray8859
				     [i][i_405_]));
		    else if (i_417_ == 0 && i_418_ == anInt1628 * 2130003981)
			i_420_ = ((((Class137_Sub1) this).aByteArrayArray8870
				   [i][i_405_ + 1])
				  - (((Class137_Sub1) this).aByteArrayArray8859
				     [i][i_405_ + 1]));
		    else if (i_417_ == anInt1628 * 2130003981
			     && i_418_ == anInt1628 * 2130003981)
			i_420_ = ((((Class137_Sub1) this).aByteArrayArray8870
				   [i + 1][i_405_ + 1])
				  - (((Class137_Sub1) this).aByteArrayArray8859
				     [i + 1][i_405_ + 1]));
		    else if (i_417_ == anInt1628 * 2130003981 && i_418_ == 0)
			i_420_ = ((((Class137_Sub1) this).aByteArrayArray8870
				   [i + 1][i_405_])
				  - (((Class137_Sub1) this).aByteArrayArray8859
				     [i + 1][i_405_]));
		    else {
			int i_421_
			    = ((((((Class137_Sub1) this).aByteArrayArray8870[i]
				  [i_405_])
				 - (((Class137_Sub1) this).aByteArrayArray8859
				    [i][i_405_]))
				* (anInt1628 * 2130003981 - i_417_))
			       + ((((Class137_Sub1) this).aByteArrayArray8870
				   [i + 1][i_405_])
				  - (((Class137_Sub1) this).aByteArrayArray8859
				     [i + 1][i_405_])) * i_417_);
			int i_422_
			    = ((((((Class137_Sub1) this).aByteArrayArray8870[i]
				  [i_405_ + 1])
				 - (((Class137_Sub1) this).aByteArrayArray8859
				    [i][i_405_ + 1]))
				* (anInt1628 * 2130003981 - i_417_))
			       + ((((Class137_Sub1) this).aByteArrayArray8870
				   [i + 1][i_405_ + 1])
				  - (((Class137_Sub1) this).aByteArrayArray8859
				     [i + 1][i_405_ + 1])) * i_417_);
			i_420_
			    = (i_421_ * (anInt1628 * 2130003981 - i_418_)
			       + i_422_ * i_418_) >> anInt1625 * -1208275318;
		    }
		    int i_423_ = (i << anInt1625 * 1543345989) + i_417_;
		    int i_424_ = (i_405_ << anInt1625 * 1543345989) + i_418_;
		    ((Class132) class132).aShortArray1610[i_416_]
			= (short) i_417_;
		    ((Class132) class132).aShortArray1612[i_416_]
			= (short) i_418_;
		    ((Class132) class132).aShortArray1611[i_416_]
			= (short) (method1656(i_423_, i_424_, 1332366559)
				   + (is_406_ != null ? is_406_[i_416_] : 0));
		    if (i_420_ < 0)
			i_420_ = 0;
		    if (is_409_[i_416_] == 0) {
			((Class132) class132).anIntArray1616[i_416_] = 0;
			if (is_410_ != null)
			    ((Class132) class132).aByteArray1614[i_416_]
				= (byte) i_420_;
		    } else {
			int i_425_ = 0;
			if (is_408_ != null) {
			    int i_426_ = (((Class132) class132)
					      .aShortArray1613[i_416_]
					  = (short) is_408_[i_416_]);
			    if (class164.anInt1828 * -386339441 != 0) {
				i_425_ = 255 * i_426_ / (class164.anInt1828
							 * -386339441);
				if (i_425_ < 0)
				    i_425_ = 0;
				else if (i_425_ > 255)
				    i_425_ = 255;
			    }
			}
			int i_427_ = -16777216;
			if (is_411_[i_416_] != -1) {
			    Class160 class160
				= (((Class137_Sub1) this)
				       .aClass173_Sub3_8857.aClass165_1984
				       .method2093
				   (is_411_[i_416_], (byte) -123));
			    if (class160.aBool1768
				&& method8319(class160.aByte1790))
				i_427_ = -1694498816;
			}
			((Class132) class132).anIntArray1616[i_416_]
			    = i_427_ | (Class472.method5817
					(method8309(is_409_[i_416_] >> 8,
						    i_420_),
					 class164.anInt1827 * -222719641,
					 i_425_, (byte) 16));
			if (is_410_ != null)
			    ((Class132) class132).aByteArray1614[i_416_]
				= (byte) i_420_;
		    }
		    ((Class132) class132).aShortArray1615[i_416_]
			= (short) is_411_[i_416_];
		    ((Class132) class132).aShortArray1617[i_416_]
			= (short) is_412_[i_416_];
		}
		if (is_410_ != null) {
		    ((Class132) class132).anIntArray1618
			= new int[((Class132) class132).aShort1608];
		    for (int i_428_ = 0;
			 i_428_ < ((Class132) class132).aShort1608; i_428_++) {
			int i_429_ = i_428_ * 3;
			if (is_410_[i_429_] != 0)
			    ((Class132) class132).anIntArray1618[i_428_]
				= ~0xffffff | is_410_[i_429_] >> 8;
		    }
		}
		((Class137_Sub1) this).aClass132ArrayArray8863[i][i_405_]
		    = class132;
	    } else {
		boolean bool_430_ = true;
		int i_431_ = -1;
		int i_432_ = -1;
		int i_433_ = -1;
		int i_434_ = -1;
		if (is.length == 6) {
		    for (int i_435_ = 0; i_435_ < 6; i_435_++) {
			if (is[i_435_] == 0 && is_407_[i_435_] == 0) {
			    if (i_431_ != -1
				&& is_409_[i_431_] != is_409_[i_435_]) {
				bool_430_ = false;
				break;
			    }
			    i_431_ = i_435_;
			} else if (is[i_435_] == anInt1628 * 2130003981
				   && is_407_[i_435_] == 0) {
			    if (i_432_ != -1
				&& is_409_[i_432_] != is_409_[i_435_]) {
				bool_430_ = false;
				break;
			    }
			    i_432_ = i_435_;
			} else if (is[i_435_] == anInt1628 * 2130003981
				   && (is_407_[i_435_]
				       == anInt1628 * 2130003981)) {
			    if (i_433_ != -1
				&& is_409_[i_433_] != is_409_[i_435_]) {
				bool_430_ = false;
				break;
			    }
			    i_433_ = i_435_;
			} else if (is[i_435_] == 0
				   && (is_407_[i_435_]
				       == anInt1628 * 2130003981)) {
			    if (i_434_ != -1
				&& is_409_[i_434_] != is_409_[i_435_]) {
				bool_430_ = false;
				break;
			    }
			    i_434_ = i_435_;
			}
		    }
		    if (i_431_ == -1 || i_432_ == -1 || i_433_ == -1
			|| i_434_ == -1)
			bool_430_ = false;
		    if (bool_430_) {
			if (is_406_ != null) {
			    for (int i_436_ = 0; i_436_ < 4; i_436_++) {
				if (is_406_[i_436_] != 0) {
				    bool_430_ = false;
				    break;
				}
			    }
			}
			if (bool_430_) {
			    for (int i_437_ = 1; i_437_ < 4; i_437_++) {
				if (is[i_437_] != is[0]
				    && (is[i_437_]
					!= is[0] + anInt1628 * 2130003981)
				    && (is[i_437_]
					!= is[0] - anInt1628 * 2130003981)) {
				    bool_430_ = false;
				    break;
				}
				if (is_407_[i_437_] != is_407_[0]
				    && (is_407_[i_437_]
					!= is_407_[0] + anInt1628 * 2130003981)
				    && (is_407_[i_437_]
					!= (is_407_[0]
					    - anInt1628 * 2130003981))) {
				    bool_430_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_430_ = false;
		if (bool_430_) {
		    Class87 class87 = new Class87();
		    int i_438_ = is_409_[0];
		    int i_439_ = is_411_[0];
		    if (is_410_ != null) {
			((Class87) class87).anInt1121 = is_410_[0] >> 8;
			if (i_438_ == 0)
			    ((Class87) class87).aByte1115 |= 0x2;
		    } else if (i_438_ == 0)
			return;
		    if ((anIntArrayArray1629[i][i_405_]
			 == anIntArrayArray1629[i + 1][i_405_])
			&& (anIntArrayArray1629[i][i_405_]
			    == anIntArrayArray1629[i + 1][i_405_ + 1])
			&& (anIntArrayArray1629[i][i_405_]
			    == anIntArrayArray1629[i][i_405_ + 1]))
			((Class87) class87).aByte1115 |= 0x1;
		    if (i_439_ != -1
			&& (((Class87) class87).aByte1115 & 0x2) == 0
			&& !(((Class137_Sub1) this).aClass173_Sub3_8857
				 .aClass165_1984.method2093
			     (i_439_, (byte) -101).aBool1800)) {
			int i_440_;
			if (is_408_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_440_
				= 255 * is_408_[i_431_] / (class164.anInt1828
							   * -386339441);
			    if (i_440_ < 0)
				i_440_ = 0;
			    else if (i_440_ > 255)
				i_440_ = 255;
			} else
			    i_440_ = 0;
			((Class87) class87).anInt1122
			    = (Class472.method5817
			       (method8309(is_409_[i_431_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i][i_405_])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i]
					       [i_405_]))),
				class164.anInt1827 * -222719641, i_440_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1122
				|= (255 - ((((Class137_Sub1) this)
					    .aByteArrayArray8870[i][i_405_])
					   - (((Class137_Sub1) this)
					      .aByteArrayArray8859[i][i_405_]))
				    << 25);
			if (is_408_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_440_
				= 255 * is_408_[i_432_] / (class164.anInt1828
							   * -386339441);
			    if (i_440_ < 0)
				i_440_ = 0;
			    else if (i_440_ > 255)
				i_440_ = 255;
			} else
			    i_440_ = 0;
			((Class87) class87).anInt1114
			    = (Class472.method5817
			       (method8309(is_409_[i_432_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i + 1]
					     [i_405_])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i + 1]
					       [i_405_]))),
				class164.anInt1827 * -222719641, i_440_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1114
				|= 255 - ((((Class137_Sub1) this)
					   .aByteArrayArray8870[i + 1][i_405_])
					  - (((Class137_Sub1) this)
					     .aByteArrayArray8859[i + 1]
					     [i_405_])) << 25;
			if (is_408_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_440_
				= 255 * is_408_[i_433_] / (class164.anInt1828
							   * -386339441);
			    if (i_440_ < 0)
				i_440_ = 0;
			    else if (i_440_ > 255)
				i_440_ = 255;
			} else
			    i_440_ = 0;
			((Class87) class87).anInt1113
			    = (Class472.method5817
			       (method8309(is_409_[i_433_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i + 1]
					     [i_405_ + 1])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i + 1]
					       [i_405_ + 1]))),
				class164.anInt1827 * -222719641, i_440_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1113
				|= 255 - ((((Class137_Sub1) this)
					   .aByteArrayArray8870[i + 1]
					   [i_405_ + 1])
					  - (((Class137_Sub1) this)
					     .aByteArrayArray8859[i + 1]
					     [i_405_ + 1])) << 25;
			if (is_408_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_440_
				= 255 * is_408_[i_434_] / (class164.anInt1828
							   * -386339441);
			    if (i_440_ < 0)
				i_440_ = 0;
			    else if (i_440_ > 255)
				i_440_ = 255;
			} else
			    i_440_ = 0;
			((Class87) class87).anInt1116
			    = (Class472.method5817
			       (method8309(is_409_[i_434_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i]
					     [i_405_ + 1])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i]
					       [i_405_ + 1]))),
				class164.anInt1827 * -222719641, i_440_,
				(byte) 16));
			((Class87) class87).aShort1112 = (short) i_439_;
		    } else {
			int i_441_;
			if (is_408_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_441_
				= 255 * is_408_[i_431_] / (class164.anInt1828
							   * -386339441);
			    if (i_441_ < 0)
				i_441_ = 0;
			    else if (i_441_ > 255)
				i_441_ = 255;
			} else
			    i_441_ = 0;
			((Class87) class87).anInt1122
			    = (Class472.method5817
			       (method8309(is_409_[i_431_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i][i_405_])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i]
					       [i_405_]))),
				class164.anInt1827 * -222719641, i_441_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1122
				|= (255 - ((((Class137_Sub1) this)
					    .aByteArrayArray8870[i][i_405_])
					   - (((Class137_Sub1) this)
					      .aByteArrayArray8859[i][i_405_]))
				    << 25);
			if (is_408_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_441_
				= 255 * is_408_[i_432_] / (class164.anInt1828
							   * -386339441);
			    if (i_441_ < 0)
				i_441_ = 0;
			    else if (i_441_ > 255)
				i_441_ = 255;
			} else
			    i_441_ = 0;
			((Class87) class87).anInt1114
			    = (Class472.method5817
			       (method8309(is_409_[i_432_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i + 1]
					     [i_405_])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i + 1]
					       [i_405_]))),
				class164.anInt1827 * -222719641, i_441_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1114
				|= 255 - ((((Class137_Sub1) this)
					   .aByteArrayArray8870[i + 1][i_405_])
					  - (((Class137_Sub1) this)
					     .aByteArrayArray8859[i + 1]
					     [i_405_])) << 25;
			if (is_408_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_441_
				= 255 * is_408_[i_433_] / (class164.anInt1828
							   * -386339441);
			    if (i_441_ < 0)
				i_441_ = 0;
			    else if (i_441_ > 255)
				i_441_ = 255;
			} else
			    i_441_ = 0;
			((Class87) class87).anInt1113
			    = (Class472.method5817
			       (method8309(is_409_[i_433_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i + 1]
					     [i_405_ + 1])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i + 1]
					       [i_405_ + 1]))),
				class164.anInt1827 * -222719641, i_441_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1113
				|= 255 - ((((Class137_Sub1) this)
					   .aByteArrayArray8870[i + 1]
					   [i_405_ + 1])
					  - (((Class137_Sub1) this)
					     .aByteArrayArray8859[i + 1]
					     [i_405_ + 1])) << 25;
			if (is_408_ != null
			    && class164.anInt1828 * -386339441 != 0) {
			    i_441_
				= 255 * is_408_[i_434_] / (class164.anInt1828
							   * -386339441);
			    if (i_441_ < 0)
				i_441_ = 0;
			    else if (i_441_ > 255)
				i_441_ = 255;
			} else
			    i_441_ = 0;
			((Class87) class87).anInt1116
			    = (Class472.method5817
			       (method8309(is_409_[i_434_] >> 8,
					   ((((Class137_Sub1) this)
					     .aByteArrayArray8870[i]
					     [i_405_ + 1])
					    - (((Class137_Sub1) this)
					       .aByteArrayArray8859[i]
					       [i_405_ + 1]))),
				class164.anInt1827 * -222719641, i_441_,
				(byte) 16));
			if (((Class87) class87).anInt1121 != 0)
			    ((Class87) class87).anInt1116
				|= 255 - ((((Class137_Sub1) this)
					   .aByteArrayArray8870[i][i_405_ + 1])
					  - (((Class137_Sub1) this)
					     .aByteArrayArray8859[i]
					     [i_405_ + 1])) << 25;
			((Class87) class87).aShort1112 = (short) -1;
		    }
		    if (is_408_ != null) {
			((Class87) class87).aShort1119
			    = (short) is_408_[i_433_];
			((Class87) class87).aShort1120
			    = (short) is_408_[i_434_];
			((Class87) class87).aShort1118
			    = (short) is_408_[i_432_];
			((Class87) class87).aShort1117
			    = (short) is_408_[i_431_];
		    }
		    ((Class137_Sub1) this).aClass87ArrayArray8861[i][i_405_]
			= class87;
		} else {
		    Class102 class102 = new Class102();
		    ((Class102) class102).aShort1289 = (short) is.length;
		    ((Class102) class102).aShort1291 = (short) (is.length / 3);
		    ((Class102) class102).aShortArray1295
			= new short[((Class102) class102).aShort1289];
		    ((Class102) class102).aShortArray1292
			= new short[((Class102) class102).aShort1289];
		    ((Class102) class102).aShortArray1293
			= new short[((Class102) class102).aShort1289];
		    ((Class102) class102).anIntArray1288
			= new int[((Class102) class102).aShort1289];
		    if (is_408_ != null)
			((Class102) class102).aShortArray1294
			    = new short[((Class102) class102).aShort1289];
		    for (int i_442_ = 0;
			 i_442_ < ((Class102) class102).aShort1289; i_442_++) {
			int i_443_ = is[i_442_];
			int i_444_ = is_407_[i_442_];
			boolean bool_445_ = false;
			int i_446_;
			if (i_443_ == 0 && i_444_ == 0)
			    i_446_ = ((((Class137_Sub1) this)
				       .aByteArrayArray8870[i][i_405_])
				      - (((Class137_Sub1) this)
					 .aByteArrayArray8859[i][i_405_]));
			else if (i_443_ == 0
				 && i_444_ == anInt1628 * 2130003981)
			    i_446_ = ((((Class137_Sub1) this)
				       .aByteArrayArray8870[i][i_405_ + 1])
				      - (((Class137_Sub1) this)
					 .aByteArrayArray8859[i][i_405_ + 1]));
			else if (i_443_ == anInt1628 * 2130003981
				 && i_444_ == anInt1628 * 2130003981)
			    i_446_ = ((((Class137_Sub1) this)
				       .aByteArrayArray8870[i + 1][i_405_ + 1])
				      - (((Class137_Sub1) this)
					 .aByteArrayArray8859[i + 1]
					 [i_405_ + 1]));
			else if (i_443_ == anInt1628 * 2130003981
				 && i_444_ == 0)
			    i_446_ = ((((Class137_Sub1) this)
				       .aByteArrayArray8870[i + 1][i_405_])
				      - (((Class137_Sub1) this)
					 .aByteArrayArray8859[i + 1][i_405_]));
			else {
			    int i_447_
				= ((((((Class137_Sub1) this)
				      .aByteArrayArray8870[i][i_405_])
				     - (((Class137_Sub1) this)
					.aByteArrayArray8859[i][i_405_]))
				    * (anInt1628 * 2130003981 - i_443_))
				   + (((((Class137_Sub1) this)
					.aByteArrayArray8870[i + 1][i_405_])
				       - (((Class137_Sub1) this)
					  .aByteArrayArray8859[i + 1][i_405_]))
				      * i_443_));
			    int i_448_
				= ((((((Class137_Sub1) this)
				      .aByteArrayArray8870[i][i_405_ + 1])
				     - (((Class137_Sub1) this)
					.aByteArrayArray8859[i][i_405_ + 1]))
				    * (anInt1628 * 2130003981 - i_443_))
				   + ((((Class137_Sub1) this)
				       .aByteArrayArray8870[i + 1][i_405_ + 1])
				      - (((Class137_Sub1) this)
					 .aByteArrayArray8859[i + 1]
					 [i_405_ + 1])) * i_443_);
			    i_446_ = (i_447_ * (anInt1628 * 2130003981
						- i_444_) + i_448_ * i_444_
				      >> anInt1625 * -1208275318);
			}
			int i_449_ = (i << anInt1625 * 1543345989) + i_443_;
			int i_450_
			    = (i_405_ << anInt1625 * 1543345989) + i_444_;
			((Class102) class102).aShortArray1295[i_442_]
			    = (short) i_443_;
			((Class102) class102).aShortArray1293[i_442_]
			    = (short) i_444_;
			((Class102) class102).aShortArray1292[i_442_]
			    = (short) (method1656(i_449_, i_450_, 1289671404)
				       + (is_406_ != null ? is_406_[i_442_]
					  : 0));
			if (i_446_ < 0)
			    i_446_ = 0;
			if (is_409_[i_442_] == 0) {
			    if (is_410_ != null)
				((Class102) class102).anIntArray1288[i_442_]
				    = i_446_ << 25;
			    else
				((Class102) class102).anIntArray1288[i_442_]
				    = 0;
			} else {
			    int i_451_ = 0;
			    if (is_408_ != null) {
				int i_452_ = (((Class102) class102)
						  .aShortArray1294[i_442_]
					      = (short) is_408_[i_442_]);
				if (class164.anInt1828 * -386339441 != 0) {
				    i_451_ = 255 * i_452_ / (class164.anInt1828
							     * -386339441);
				    if (i_451_ < 0)
					i_451_ = 0;
				    else if (i_451_ > 255)
					i_451_ = 255;
				}
			    }
			    ((Class102) class102).anIntArray1288[i_442_]
				= (Class472.method5817
				   (method8309(is_409_[i_442_] >> 8, i_446_),
				    class164.anInt1827 * -222719641, i_451_,
				    (byte) 16));
			    if (is_410_ != null)
				((Class102) class102).anIntArray1288[i_442_]
				    |= i_446_ << 25;
			}
		    }
		    boolean bool_453_ = false;
		    for (int i_454_ = 0;
			 i_454_ < ((Class102) class102).aShort1291; i_454_++) {
			if (is_411_[i_454_ * 3] != -1
			    && !(((Class137_Sub1) this).aClass173_Sub3_8857
				     .aClass165_1984.method2093
				 (is_411_[i_454_ * 3], (byte) -99).aBool1800))
			    bool_453_ = true;
		    }
		    if (is_410_ != null)
			((Class102) class102).anIntArray1298
			    = new int[((Class102) class102).aShort1291];
		    if (bool_453_) {
			((Class102) class102).aShortArray1296
			    = new short[((Class102) class102).aShort1291];
			((Class102) class102).aShortArray1297
			    = new short[((Class102) class102).aShort1291];
		    }
		    for (int i_455_ = 0;
			 i_455_ < ((Class102) class102).aShort1291; i_455_++) {
			int i_456_ = i_455_ * 3;
			if (is_410_ != null && is_410_[i_456_] != 0)
			    ((Class102) class102).anIntArray1298[i_455_]
				= is_410_[i_456_] >> 8;
			if (bool_453_) {
			    int i_457_ = i_456_ + 1;
			    int i_458_ = i_457_ + 1;
			    boolean bool_459_ = false;
			    boolean bool_460_ = true;
			    int i_461_ = is_411_[i_456_];
			    if (i_461_ == -1
				|| (((Class137_Sub1) this)
					.aClass173_Sub3_8857.aClass165_1984
					.method2093
				    (i_461_, (byte) -114).aBool1800))
				bool_460_ = false;
			    else
				bool_459_ = true;
			    i_461_ = is_411_[i_457_];
			    if (i_461_ == -1
				|| (((Class137_Sub1) this)
					.aClass173_Sub3_8857.aClass165_1984
					.method2093
				    (i_461_, (byte) -84).aBool1800))
				bool_460_ = false;
			    else
				bool_459_ = true;
			    i_461_ = is_411_[i_458_];
			    if (i_461_ == -1
				|| (((Class137_Sub1) this)
					.aClass173_Sub3_8857.aClass165_1984
					.method2093
				    (i_461_, (byte) -73).aBool1800))
				bool_460_ = false;
			    else
				bool_459_ = true;
			    if (bool_460_) {
				((Class102) class102).aShortArray1296[i_455_]
				    = (short) i_461_;
				((Class102) class102).aShortArray1297[i_455_]
				    = (short) is_412_[i_456_];
			    } else {
				if (bool_459_) {
				    i_461_ = is_411_[i_456_];
				    if (i_461_ != -1
					&& !(((Class137_Sub1) this)
						 .aClass173_Sub3_8857
						 .aClass165_1984.method2093
					     (i_461_, (byte) -125).aBool1800))
					((Class102) class102)
					    .anIntArray1288[i_456_]
					    = (Class72.anIntArray777
					       [(Class516.method6283
						 ((((Class137_Sub1) this)
						       .aClass173_Sub3_8857
						       .aClass165_1984
						       .method2093
						   (i_461_, (byte) -73)
						   .aShort1804) & 0xffff,
						  515814180)) & 0xffff]);
				    i_461_ = is_411_[i_457_];
				    if (i_461_ != -1
					&& !(((Class137_Sub1) this)
						 .aClass173_Sub3_8857
						 .aClass165_1984.method2093
					     (i_461_, (byte) -103).aBool1800))
					((Class102) class102)
					    .anIntArray1288[i_457_]
					    = (Class72.anIntArray777
					       [(Class516.method6283
						 ((((Class137_Sub1) this)
						       .aClass173_Sub3_8857
						       .aClass165_1984
						       .method2093
						   (i_461_, (byte) -49)
						   .aShort1804) & 0xffff,
						  515814180)) & 0xffff]);
				    i_461_ = is_411_[i_458_];
				    if (i_461_ != -1
					&& !(((Class137_Sub1) this)
						 .aClass173_Sub3_8857
						 .aClass165_1984.method2093
					     (i_461_, (byte) -2).aBool1800))
					((Class102) class102)
					    .anIntArray1288[i_458_]
					    = (Class72.anIntArray777
					       [(Class516.method6283
						 ((((Class137_Sub1) this)
						       .aClass173_Sub3_8857
						       .aClass165_1984
						       .method2093
						   (i_461_, (byte) -68)
						   .aShort1804) & 0xffff,
						  515814180)) & 0xffff]);
				}
				((Class102) class102).aShortArray1296[i_455_]
				    = (short) -1;
			    }
			}
		    }
		    ((Class137_Sub1) this).aClass102ArrayArray8855[i][i_405_]
			= class102;
		}
	    }
	}
    }
    
    void method8315(int i, int i_462_, int i_463_, int i_464_, int i_465_,
		    int i_466_, int i_467_, boolean[][] bools,
		    Class107 class107, Class121 class121, float[] fs,
		    float[] fs_468_) {
	int i_469_ = (i_467_ - i_465_) * i_463_ / 256;
	int i_470_ = i_463_ >> 8;
	boolean bool = ((Class107) class107).aBool1344;
	((Class137_Sub1) this).aClass173_Sub3_8857.method2283(false);
	((Class121) class121).aBool1501 = false;
	((Class121) class121).aBool1502 = false;
	int i_471_ = i;
	int i_472_ = i_462_ + i_469_;
	for (int i_473_ = i_464_; i_473_ < i_466_; i_473_++) {
	    for (int i_474_ = i_465_; i_474_ < i_467_; i_474_++) {
		if (bools[i_473_ - i_464_][i_474_ - i_465_]) {
		    if ((((Class137_Sub1) this).aClass130ArrayArray8853[i_473_]
			 [i_474_])
			!= null) {
			Class130 class130
			    = (((Class137_Sub1) this).aClass130ArrayArray8853
			       [i_473_][i_474_]);
			if (((Class130) class130).aShort1589 != -1
			    && (((Class130) class130).aByte1590 & 0x2) == 0
			    && ((Class130) class130).anInt1595 == -1) {
			    int i_475_ = (((Class137_Sub1) this)
					      .aClass173_Sub3_8857.method8936
					  (((Class130) class130).aShort1589
					   & 0xffff));
			    class121.method1576
				(true, true, false, (float) (i_472_ - i_470_),
				 (float) (i_472_ - i_470_), (float) i_472_,
				 (float) (i_471_ + i_470_), (float) i_471_,
				 (float) (i_471_ + i_470_), 100.0F, 100.0F,
				 100.0F,
				 (float) PlayerModel.method7300(i_475_,
							     ((((Class130)
								class130)
							       .aShort1594)
							      & 0xffff),
							     (byte) -24),
				 (float) PlayerModel.method7300(i_475_,
							     ((((Class130)
								class130)
							       .aShort1593)
							      & 0xffff),
							     (byte) -85),
				 (float) PlayerModel.method7300(i_475_,
							     ((((Class130)
								class130)
							       .aShort1591)
							      & 0xffff),
							     (byte) -68));
			    class121.method1576
				(true, true, false, (float) i_472_,
				 (float) i_472_, (float) (i_472_ - i_470_),
				 (float) i_471_, (float) (i_471_ + i_470_),
				 (float) i_471_, 100.0F, 100.0F, 100.0F,
				 (float) PlayerModel.method7300(i_475_,
							     ((((Class130)
								class130)
							       .aShort1592)
							      & 0xffff),
							     (byte) -109),
				 (float) PlayerModel.method7300(i_475_,
							     ((((Class130)
								class130)
							       .aShort1591)
							      & 0xffff),
							     (byte) 0),
				 (float) PlayerModel.method7300(i_475_,
							     ((((Class130)
								class130)
							       .aShort1593)
							      & 0xffff),
							     (byte) -4));
			} else if (((Class130) class130).anInt1595 == -1) {
			    class121.method1576
				(true, true, false, (float) (i_472_ - i_470_),
				 (float) (i_472_ - i_470_), (float) i_472_,
				 (float) (i_471_ + i_470_), (float) i_471_,
				 (float) (i_471_ + i_470_), 100.0F, 100.0F,
				 100.0F,
				 (float) (((Class130) class130).aShort1594
					  & 0xffff),
				 (float) (((Class130) class130).aShort1593
					  & 0xffff),
				 (float) (((Class130) class130).aShort1591
					  & 0xffff));
			    class121.method1576
				(true, true, false, (float) i_472_,
				 (float) i_472_, (float) (i_472_ - i_470_),
				 (float) i_471_, (float) (i_471_ + i_470_),
				 (float) i_471_, 100.0F, 100.0F, 100.0F,
				 (float) (((Class130) class130).aShort1592
					  & 0xffff),
				 (float) (((Class130) class130).aShort1591
					  & 0xffff),
				 (float) (((Class130) class130).aShort1593
					  & 0xffff));
			} else {
			    int i_476_ = ((Class130) class130).anInt1595;
			    class121.method1576(true, true, false,
						(float) (i_472_ - i_470_),
						(float) (i_472_ - i_470_),
						(float) i_472_,
						(float) (i_471_ + i_470_),
						(float) i_471_,
						(float) (i_471_ + i_470_),
						100.0F, 100.0F, 100.0F,
						(float) i_476_, (float) i_476_,
						(float) i_476_);
			    class121.method1576(true, true, false,
						(float) i_472_, (float) i_472_,
						(float) (i_472_ - i_470_),
						(float) i_471_,
						(float) (i_471_ + i_470_),
						(float) i_471_, 100.0F, 100.0F,
						100.0F, (float) i_476_,
						(float) i_476_,
						(float) i_476_);
			}
		    } else if ((((Class137_Sub1) this).aClass100ArrayArray8860
				[i_473_][i_474_])
			       != null) {
			Class100 class100
			    = (((Class137_Sub1) this).aClass100ArrayArray8860
			       [i_473_][i_474_]);
			for (int i_477_ = 0;
			     i_477_ < ((Class100) class100).aShort1273;
			     i_477_++) {
			    fs[i_477_]
				= (float) (i_471_
					   + ((((Class100) class100)
					       .aShortArray1275[i_477_])
					      * i_470_
					      / (anInt1628 * 2130003981)));
			    fs_468_[i_477_]
				= (float) (i_472_
					   - ((((Class100) class100)
					       .aShortArray1277[i_477_])
					      * i_470_
					      / (anInt1628 * 2130003981)));
			}
			for (int i_478_ = 0;
			     i_478_ < ((Class100) class100).aShort1280;
			     i_478_++) {
			    short i_479_ = (((Class100) class100)
					    .aShortArray1279[i_478_]);
			    short i_480_ = (((Class100) class100)
					    .aShortArray1276[i_478_]);
			    short i_481_ = (((Class100) class100)
					    .aShortArray1281[i_478_]);
			    float f = fs[i_479_];
			    float f_482_ = fs[i_480_];
			    float f_483_ = fs[i_481_];
			    float f_484_ = fs_468_[i_479_];
			    float f_485_ = fs_468_[i_480_];
			    float f_486_ = fs_468_[i_481_];
			    if (((Class100) class100).anIntArray1285 != null
				&& (((Class100) class100).anIntArray1285
				    [i_478_]) != -1) {
				int i_487_ = (((Class100) class100)
					      .anIntArray1285[i_478_]);
				class121.method1576
				    (true, true, false, f_484_, f_485_, f_486_,
				     f, f_482_, f_483_, 100.0F, 100.0F, 100.0F,
				     (float) (PlayerModel.method7300
					      (i_487_,
					       (((Class100) class100)
						.aShortArray1278[i_479_]),
					       (byte) -30)),
				     (float) (PlayerModel.method7300
					      (i_487_,
					       (((Class100) class100)
						.aShortArray1278[i_480_]),
					       (byte) -103)),
				     (float) (PlayerModel.method7300
					      (i_487_,
					       (((Class100) class100)
						.aShortArray1278[i_481_]),
					       (byte) -106)));
			    } else if ((((Class100) class100).aShortArray1283
					!= null)
				       && (((Class100) class100)
					   .aShortArray1283[i_478_]) != -1) {
				int i_488_
				    = (((Class137_Sub1) this)
					   .aClass173_Sub3_8857.method8936
				       ((((Class100) class100).aShortArray1283
					 [i_478_]) & 0xffff));
				class121.method1576
				    (true, true, false, f_484_, f_485_, f_486_,
				     f, f_482_, f_483_, 100.0F, 100.0F, 100.0F,
				     (float) (PlayerModel.method7300
					      (i_488_,
					       (((Class100) class100)
						.aShortArray1278[i_479_]),
					       (byte) -83)),
				     (float) (PlayerModel.method7300
					      (i_488_,
					       (((Class100) class100)
						.aShortArray1278[i_480_]),
					       (byte) 1)),
				     (float) (PlayerModel.method7300
					      (i_488_,
					       (((Class100) class100)
						.aShortArray1278[i_481_]),
					       (byte) -7)));
			    } else {
				int i_489_ = (((Class100) class100)
					      .anIntArray1284[i_478_]);
				class121.method1576
				    (true, true, false, f_484_, f_485_, f_486_,
				     f, f_482_, f_483_, 100.0F, 100.0F, 100.0F,
				     (float) (PlayerModel.method7300
					      (i_489_,
					       (((Class100) class100)
						.aShortArray1278[i_479_]),
					       (byte) -94)),
				     (float) (PlayerModel.method7300
					      (i_489_,
					       (((Class100) class100)
						.aShortArray1278[i_480_]),
					       (byte) -14)),
				     (float) (PlayerModel.method7300
					      (i_489_,
					       (((Class100) class100)
						.aShortArray1278[i_481_]),
					       (byte) -3)));
			    }
			}
		    }
		}
		i_472_ -= i_470_;
	    }
	    i_472_ = i_462_ + i_469_;
	    i_471_ += i_470_;
	}
	((Class121) class121).aBool1501 = true;
	((Class137_Sub1) this).aClass173_Sub3_8857.method2283(bool);
    }
    
    public void method1665(int i, int i_490_, int[] is, int[] is_491_,
			   int[] is_492_, int[] is_493_, int[] is_494_,
			   int[] is_495_, int[] is_496_, int[] is_497_,
			   int[] is_498_, int[] is_499_, int[] is_500_,
			   Class164 class164, boolean bool) {
	if (((Class137_Sub1) this).aClass130ArrayArray8853 == null) {
	    ((Class137_Sub1) this).aClass130ArrayArray8853
		= new Class130[anInt1627 * -657933437][anInt1626 * 1769495707];
	    ((Class137_Sub1) this).aClass100ArrayArray8860
		= new Class100[anInt1627 * -657933437][anInt1626 * 1769495707];
	} else if (((Class137_Sub1) this).aClass87ArrayArray8861 != null
		   || ((Class137_Sub1) this).aClass132ArrayArray8863 != null)
	    throw new IllegalStateException();
	boolean bool_501_ = false;
	if (is_497_.length == 2 && is_494_.length == 2
	    && (is_497_[0] == is_497_[1]
		|| is_499_[0] != -1 && is_499_[0] == is_499_[1])) {
	    bool_501_ = true;
	    for (int i_502_ = 1; i_502_ < 2; i_502_++) {
		int i_503_ = is[is_494_[i_502_]];
		int i_504_ = is_492_[is_494_[i_502_]];
		if (i_503_ != 0 && i_503_ != anInt1628 * 2130003981
		    || i_504_ != 0 && i_504_ != anInt1628 * 2130003981) {
		    bool_501_ = false;
		    break;
		}
	    }
	}
	if (!bool_501_) {
	    Class100 class100 = new Class100();
	    short i_505_ = (short) is.length;
	    int i_506_ = (short) is_497_.length;
	    ((Class100) class100).aShort1273 = i_505_;
	    ((Class100) class100).aShortArray1278 = new short[i_505_];
	    ((Class100) class100).aShortArray1275 = new short[i_505_];
	    ((Class100) class100).aShortArray1282 = new short[i_505_];
	    ((Class100) class100).aShortArray1277 = new short[i_505_];
	    for (int i_507_ = 0; i_507_ < i_505_; i_507_++) {
		int i_508_ = is[i_507_];
		int i_509_ = is_492_[i_507_];
		if (i_508_ == 0 && i_509_ == 0)
		    ((Class100) class100).aShortArray1278[i_507_]
			= (short) ((((Class137_Sub1) this).aByteArrayArray8870
				    [i][i_490_])
				   - (((Class137_Sub1) this)
				      .aByteArrayArray8859[i][i_490_]));
		else if (i_508_ == 0 && i_509_ == anInt1628 * 2130003981)
		    ((Class100) class100).aShortArray1278[i_507_]
			= (short) ((((Class137_Sub1) this).aByteArrayArray8870
				    [i][i_490_ + 1])
				   - (((Class137_Sub1) this)
				      .aByteArrayArray8859[i][i_490_ + 1]));
		else if (i_508_ == anInt1628 * 2130003981
			 && i_509_ == anInt1628 * 2130003981)
		    ((Class100) class100).aShortArray1278[i_507_]
			= (short) ((((Class137_Sub1) this).aByteArrayArray8870
				    [i + 1][i_490_ + 1])
				   - (((Class137_Sub1) this)
				      .aByteArrayArray8859[i + 1]
				      [i_490_ + 1]));
		else if (i_508_ == anInt1628 * 2130003981 && i_509_ == 0)
		    ((Class100) class100).aShortArray1278[i_507_]
			= (short) ((((Class137_Sub1) this).aByteArrayArray8870
				    [i + 1][i_490_])
				   - (((Class137_Sub1) this)
				      .aByteArrayArray8859[i + 1][i_490_]));
		else {
		    int i_510_
			= (((((Class137_Sub1) this).aByteArrayArray8870[i]
			     [i_490_])
			    - (((Class137_Sub1) this).aByteArrayArray8859[i]
			       [i_490_])) * (anInt1628 * 2130003981 - i_508_)
			   + ((((Class137_Sub1) this).aByteArrayArray8870
			       [i + 1][i_490_])
			      - (((Class137_Sub1) this).aByteArrayArray8859
				 [i + 1][i_490_])) * i_508_);
		    int i_511_
			= ((((((Class137_Sub1) this).aByteArrayArray8870[i]
			      [i_490_ + 1])
			     - (((Class137_Sub1) this).aByteArrayArray8859[i]
				[i_490_ + 1]))
			    * (anInt1628 * 2130003981 - i_508_))
			   + ((((Class137_Sub1) this).aByteArrayArray8870
			       [i + 1][i_490_ + 1])
			      - (((Class137_Sub1) this).aByteArrayArray8859
				 [i + 1][i_490_ + 1])) * i_508_);
		    ((Class100) class100).aShortArray1278[i_507_]
			= (short) ((i_510_ * (anInt1628 * 2130003981 - i_509_)
				    + i_511_ * i_509_)
				   >> anInt1625 * -1208275318);
		}
		int i_512_ = (i << anInt1625 * 1543345989) + i_508_;
		int i_513_ = (i_490_ << anInt1625 * 1543345989) + i_509_;
		((Class100) class100).aShortArray1275[i_507_] = (short) i_508_;
		((Class100) class100).aShortArray1277[i_507_] = (short) i_509_;
		((Class100) class100).aShortArray1282[i_507_]
		    = (short) (method1656(i_512_, i_513_, 1877865206)
			       + (is_491_ != null ? is_491_[i_507_] : 0));
		if (((Class100) class100).aShortArray1278[i_507_] < 2)
		    ((Class100) class100).aShortArray1278[i_507_] = (short) 2;
	    }
	    boolean bool_514_ = false;
	    int i_515_ = 0;
	    for (int i_516_ = 0; i_516_ < i_506_; i_516_++) {
		if (is_497_[i_516_] >= 0
		    || is_498_ != null && is_498_[i_516_] >= 0)
		    i_515_++;
		int i_517_ = is_499_[i_516_];
		if (i_517_ != -1) {
		    Class160 class160
			= ((Class137_Sub1) this).aClass173_Sub3_8857
			      .aClass165_1984.method2093(i_517_, (byte) -6);
		    if (!class160.aBool1800) {
			bool_514_ = true;
			if (method8319(class160.aByte1790)
			    || class160.aByte1775 != 0
			    || class160.aByte1776 != 0)
			    ((Class100) class100).aByte1272 |= 0x4;
		    }
		}
	    }
	    ((Class100) class100).anIntArray1284 = new int[i_515_];
	    if (is_498_ != null)
		((Class100) class100).anIntArray1285 = new int[i_515_];
	    ((Class100) class100).aShortArray1279 = new short[i_515_];
	    ((Class100) class100).aShortArray1276 = new short[i_515_];
	    ((Class100) class100).aShortArray1281 = new short[i_515_];
	    if (bool_514_) {
		((Class100) class100).aShortArray1283 = new short[i_515_];
		((Class100) class100).aShortArray1274 = new short[i_515_];
	    }
	    for (int i_518_ = 0; i_518_ < i_506_; i_518_++) {
		if (is_497_[i_518_] >= 0
		    || is_498_ != null && is_498_[i_518_] >= 0) {
		    if (is_497_[i_518_] >= 0)
			((Class100) class100).anIntArray1284
			    [((Class100) class100).aShort1280]
			    = Class516.method6283(is_497_[i_518_], 515814180);
		    else
			((Class100) class100).anIntArray1284
			    [((Class100) class100).aShort1280]
			    = -1;
		    if (is_498_ != null) {
			if (is_498_[i_518_] != -1)
			    ((Class100) class100).anIntArray1285
				[((Class100) class100).aShort1280]
				= Class516.method6283(is_498_[i_518_],
						      515814180);
			else
			    ((Class100) class100).anIntArray1285
				[((Class100) class100).aShort1280]
				= -1;
		    }
		    ((Class100) class100).aShortArray1279
			[((Class100) class100).aShort1280]
			= (short) is_494_[i_518_];
		    ((Class100) class100).aShortArray1276
			[((Class100) class100).aShort1280]
			= (short) is_495_[i_518_];
		    ((Class100) class100).aShortArray1281
			[((Class100) class100).aShort1280]
			= (short) is_496_[i_518_];
		    if (bool_514_) {
			if (is_499_[i_518_] != -1
			    && !(((Class137_Sub1) this).aClass173_Sub3_8857
				     .aClass165_1984.method2093
				 (is_499_[i_518_], (byte) -21).aBool1800)) {
			    ((Class100) class100).aShortArray1283
				[((Class100) class100).aShort1280]
				= (short) is_499_[i_518_];
			    ((Class100) class100).aShortArray1274
				[((Class100) class100).aShort1280]
				= (short) is_500_[i_518_];
			} else
			    ((Class100) class100).aShortArray1283
				[((Class100) class100).aShort1280]
				= (short) -1;
		    }
		    ((Class100) class100).aShort1280++;
		}
	    }
	    ((Class137_Sub1) this).aClass100ArrayArray8860[i][i_490_]
		= class100;
	} else if (is_497_[0] >= 0 || is_498_ != null && is_498_[0] >= 0) {
	    Class130 class130 = new Class130();
	    int i_519_ = is_497_[0];
	    int i_520_ = is_499_[0];
	    if (is_498_ != null) {
		((Class130) class130).anInt1595
		    = PlayerModel.method7300(Class516.method6283(is_498_[0],
							      515814180),
					  ((((Class137_Sub1) this)
					    .aByteArrayArray8870[i][i_490_])
					   - (((Class137_Sub1) this)
					      .aByteArrayArray8859[i]
					      [i_490_])),
					  (byte) -103);
		if (i_519_ == -1)
		    ((Class130) class130).aByte1590 |= 0x2;
	    }
	    if ((anIntArrayArray1629[i][i_490_]
		 == anIntArrayArray1629[i + 1][i_490_])
		&& (anIntArrayArray1629[i][i_490_]
		    == anIntArrayArray1629[i + 1][i_490_ + 1])
		&& (anIntArrayArray1629[i][i_490_]
		    == anIntArrayArray1629[i][i_490_ + 1]))
		((Class130) class130).aByte1590 |= 0x1;
	    Class160 class160 = null;
	    if (i_520_ != -1)
		class160 = ((Class137_Sub1) this).aClass173_Sub3_8857
			       .aClass165_1984.method2093(i_520_, (byte) -42);
	    if (class160 != null
		&& (((Class130) class130).aByte1590 & 0x2) == 0
		&& !class160.aBool1800) {
		((Class130) class130).aShort1592
		    = (short) ((((Class137_Sub1) this).aByteArrayArray8870[i]
				[i_490_])
			       - (((Class137_Sub1) this).aByteArrayArray8859[i]
				  [i_490_]));
		((Class130) class130).aShort1591
		    = (short) ((((Class137_Sub1) this).aByteArrayArray8870
				[i + 1][i_490_])
			       - (((Class137_Sub1) this).aByteArrayArray8859
				  [i + 1][i_490_]));
		((Class130) class130).aShort1594
		    = (short) ((((Class137_Sub1) this).aByteArrayArray8870
				[i + 1][i_490_ + 1])
			       - (((Class137_Sub1) this).aByteArrayArray8859
				  [i + 1][i_490_ + 1]));
		((Class130) class130).aShort1593
		    = (short) ((((Class137_Sub1) this).aByteArrayArray8870[i]
				[i_490_ + 1])
			       - (((Class137_Sub1) this).aByteArrayArray8859[i]
				  [i_490_ + 1]));
		((Class130) class130).aShort1589 = (short) i_520_;
		if (method8319(class160.aByte1790) || class160.aByte1775 != 0
		    || class160.aByte1776 != 0)
		    ((Class130) class130).aByte1590 |= 0x4;
	    } else {
		short i_521_ = Class516.method6283(i_519_, 515814180);
		((Class130) class130).aShort1592
		    = (short) PlayerModel.method7300(i_521_,
						  ((((Class137_Sub1) this)
						    .aByteArrayArray8870[i]
						    [i_490_])
						   - (((Class137_Sub1) this)
						      .aByteArrayArray8859[i]
						      [i_490_])),
						  (byte) -59);
		((Class130) class130).aShort1591
		    = (short) PlayerModel.method7300(i_521_,
						  ((((Class137_Sub1) this)
						    .aByteArrayArray8870[i + 1]
						    [i_490_])
						   - (((Class137_Sub1) this)
						      .aByteArrayArray8859
						      [i + 1][i_490_])),
						  (byte) -42);
		((Class130) class130).aShort1594
		    = (short) PlayerModel.method7300(i_521_,
						  ((((Class137_Sub1) this)
						    .aByteArrayArray8870[i + 1]
						    [i_490_ + 1])
						   - (((Class137_Sub1) this)
						      .aByteArrayArray8859
						      [i + 1][i_490_ + 1])),
						  (byte) -61);
		((Class130) class130).aShort1593
		    = (short) PlayerModel.method7300(i_521_,
						  ((((Class137_Sub1) this)
						    .aByteArrayArray8870[i]
						    [i_490_ + 1])
						   - (((Class137_Sub1) this)
						      .aByteArrayArray8859[i]
						      [i_490_ + 1])),
						  (byte) -111);
		((Class130) class130).aShort1589 = (short) -1;
	    }
	    ((Class137_Sub1) this).aClass130ArrayArray8853[i][i_490_]
		= class130;
	}
    }
    
    public void method1667() {
	((Class137_Sub1) this).aByteArrayArray8870 = null;
	((Class137_Sub1) this).aByteArrayArray8859 = null;
    }
    
    public void method1668() {
	((Class137_Sub1) this).aByteArrayArray8870 = null;
	((Class137_Sub1) this).aByteArrayArray8859 = null;
    }
    
    public Class528_Sub21_Sub12 method1677
	(int i, int i_522_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	return null;
    }
    
    void method8316(int i, int i_523_, int i_524_) {
	Class107 class107 = ((Class137_Sub1) this).aClass173_Sub3_8857
				.method8939(Thread.currentThread());
	((Class121) ((Class107) class107).aClass121_1330).anInt1526 = 0;
	if (((Class137_Sub1) this).aClass87ArrayArray8861 != null)
	    method8312(i, i_523_, ((Class107) class107).aBool1324, class107,
		       ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_524_);
	else if (((Class137_Sub1) this).aClass130ArrayArray8853 != null)
	    method8311(i, i_523_, ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_524_);
	else if (((Class137_Sub1) this).aClass132ArrayArray8863 != null)
	    method8313(i, i_523_, ((Class107) class107).aBool1324, class107,
		       ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_524_);
    }
    
    void method8317(int i, int i_525_, int i_526_) {
	Class107 class107 = ((Class137_Sub1) this).aClass173_Sub3_8857
				.method8939(Thread.currentThread());
	((Class121) ((Class107) class107).aClass121_1330).anInt1526 = 0;
	if (((Class137_Sub1) this).aClass87ArrayArray8861 != null)
	    method8312(i, i_525_, ((Class107) class107).aBool1324, class107,
		       ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_526_);
	else if (((Class137_Sub1) this).aClass130ArrayArray8853 != null)
	    method8311(i, i_525_, ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_526_);
	else if (((Class137_Sub1) this).aClass132ArrayArray8863 != null)
	    method8313(i, i_525_, ((Class107) class107).aBool1324, class107,
		       ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_526_);
    }
    
    void method8318(int i, int i_527_, int i_528_) {
	Class107 class107 = ((Class137_Sub1) this).aClass173_Sub3_8857
				.method8939(Thread.currentThread());
	((Class121) ((Class107) class107).aClass121_1330).anInt1526 = 0;
	if (((Class137_Sub1) this).aClass87ArrayArray8861 != null)
	    method8312(i, i_527_, ((Class107) class107).aBool1324, class107,
		       ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_528_);
	else if (((Class137_Sub1) this).aClass130ArrayArray8853 != null)
	    method8311(i, i_527_, ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_528_);
	else if (((Class137_Sub1) this).aClass132ArrayArray8863 != null)
	    method8313(i, i_527_, ((Class107) class107).aBool1324, class107,
		       ((Class107) class107).aClass121_1330,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353,
		       ((Class107) class107).aFloatArray1358,
		       ((Class107) class107).aFloatArray1359,
		       ((Class107) class107).aFloatArray1360, i_528_);
    }
    
    public void method1670(Class528_Sub12 class528_sub12, int[] is) {
	/* empty */
    }
    
    boolean method8319(int i) {
	if ((((Class137_Sub1) this).anInt8858 & 0x8) == 0)
	    return false;
	if (i == 4)
	    return true;
	if (i == 8)
	    return true;
	if (i == 9)
	    return true;
	return false;
    }
    
    public void method1658(int i, int i_529_, int i_530_, int i_531_,
			   int i_532_, int i_533_, int i_534_,
			   boolean[][] bools) {
	Class107 class107 = ((Class137_Sub1) this).aClass173_Sub3_8857
				.method8939(Thread.currentThread());
	Class121 class121 = ((Class107) class107).aClass121_1330;
	((Class121) class121).anInt1526 = 0;
	((Class121) class121).aBool1504 = true;
	((Class137_Sub1) this).aClass173_Sub3_8857.method8932();
	if (((Class137_Sub1) this).aClass87ArrayArray8861 != null
	    || ((Class137_Sub1) this).aClass132ArrayArray8863 != null)
	    method8314(i, i_529_, i_530_, i_531_, i_532_, i_533_, i_534_,
		       bools, class107, class121,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353);
	else if (((Class137_Sub1) this).aClass130ArrayArray8853 != null)
	    method8315(i, i_529_, i_530_, i_531_, i_532_, i_533_, i_534_,
		       bools, class107, class121,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353);
    }
    
    public void method1671(int i, int i_535_, int i_536_, int i_537_,
			   int i_538_, int i_539_, int i_540_,
			   boolean[][] bools) {
	Class107 class107 = ((Class137_Sub1) this).aClass173_Sub3_8857
				.method8939(Thread.currentThread());
	Class121 class121 = ((Class107) class107).aClass121_1330;
	((Class121) class121).anInt1526 = 0;
	((Class121) class121).aBool1504 = true;
	((Class137_Sub1) this).aClass173_Sub3_8857.method8932();
	if (((Class137_Sub1) this).aClass87ArrayArray8861 != null
	    || ((Class137_Sub1) this).aClass132ArrayArray8863 != null)
	    method8314(i, i_535_, i_536_, i_537_, i_538_, i_539_, i_540_,
		       bools, class107, class121,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353);
	else if (((Class137_Sub1) this).aClass130ArrayArray8853 != null)
	    method8315(i, i_535_, i_536_, i_537_, i_538_, i_539_, i_540_,
		       bools, class107, class121,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353);
    }
    
    public void method1678(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			   int i_541_, int i_542_, int i_543_, boolean bool) {
	/* empty */
    }
    
    public void method1672(int i, int i_544_, int i_545_, int i_546_,
			   int i_547_, int i_548_, int i_549_,
			   boolean[][] bools) {
	Class107 class107 = ((Class137_Sub1) this).aClass173_Sub3_8857
				.method8939(Thread.currentThread());
	Class121 class121 = ((Class107) class107).aClass121_1330;
	((Class121) class121).anInt1526 = 0;
	((Class121) class121).aBool1504 = true;
	((Class137_Sub1) this).aClass173_Sub3_8857.method8932();
	if (((Class137_Sub1) this).aClass87ArrayArray8861 != null
	    || ((Class137_Sub1) this).aClass132ArrayArray8863 != null)
	    method8314(i, i_544_, i_545_, i_546_, i_547_, i_548_, i_549_,
		       bools, class107, class121,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353);
	else if (((Class137_Sub1) this).aClass130ArrayArray8853 != null)
	    method8315(i, i_544_, i_545_, i_546_, i_547_, i_548_, i_549_,
		       bools, class107, class121,
		       ((Class107) class107).aFloatArray1356,
		       ((Class107) class107).aFloatArray1353);
    }
    
    public boolean method1679(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_550_, int i_551_, int i_552_,
			      boolean bool) {
	return false;
    }
    
    public boolean method1663(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_553_, int i_554_, int i_555_,
			      boolean bool) {
	return false;
    }
    
    public boolean method1680(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_556_, int i_557_, int i_558_,
			      boolean bool) {
	return false;
    }
    
    public Class528_Sub21_Sub12 method1673
	(int i, int i_559_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	return null;
    }
    
    public Class528_Sub21_Sub12 method1674
	(int i, int i_560_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	return null;
    }
    
    public Class528_Sub21_Sub12 method1660
	(int i, int i_561_, Class528_Sub21_Sub12 class528_sub21_sub12) {
	return null;
    }
    
    public boolean method1681(Class528_Sub21_Sub12 class528_sub21_sub12, int i,
			      int i_562_, int i_563_, int i_564_,
			      boolean bool) {
	return false;
    }
    
    public void method1650(Class528_Sub12 class528_sub12, int[] is) {
	/* empty */
    }
    
    public void method1684(Class528_Sub12 class528_sub12, int[] is) {
	/* empty */
    }
    
    public void method1687(int i, int i_565_, int i_566_, boolean[][] bools,
			   boolean bool, int i_567_) {
	if ((((Class173_Sub3) ((Class137_Sub1) this).aClass173_Sub3_8857)
	     .anIntArray9719) == null
	    || (((Class173_Sub3) ((Class137_Sub1) this).aClass173_Sub3_8857)
		.aFloatArray9716) == null)
	    throw new IllegalStateException("");
	Class418 class418
	    = (((Class173_Sub3) ((Class137_Sub1) this).aClass173_Sub3_8857)
	       .aClass418_9736);
	((Class137_Sub1) this).aFloat8862 = class418.aFloatArray4768[0];
	((Class137_Sub1) this).aFloat8865 = class418.aFloatArray4768[1];
	((Class137_Sub1) this).aFloat8866 = class418.aFloatArray4768[2];
	((Class137_Sub1) this).aFloat8867 = class418.aFloatArray4768[3];
	((Class137_Sub1) this).aFloat8868 = class418.aFloatArray4768[4];
	((Class137_Sub1) this).aFloat8852 = class418.aFloatArray4768[5];
	((Class137_Sub1) this).aFloat8869 = class418.aFloatArray4768[6];
	((Class137_Sub1) this).aFloat8871 = class418.aFloatArray4768[7];
	((Class137_Sub1) this).aFloat8872 = class418.aFloatArray4768[8];
	((Class137_Sub1) this).aFloat8873 = class418.aFloatArray4768[9];
	((Class137_Sub1) this).aFloat8874 = class418.aFloatArray4768[10];
	((Class137_Sub1) this).aFloat8875 = class418.aFloatArray4768[11];
	((Class137_Sub1) this).aFloat8881 = class418.aFloatArray4768[12];
	((Class137_Sub1) this).aFloat8880 = class418.aFloatArray4768[13];
	((Class137_Sub1) this).aFloat8876 = class418.aFloatArray4768[14];
	((Class137_Sub1) this).aFloat8879 = class418.aFloatArray4768[15];
	for (int i_568_ = 0; i_568_ < i_566_ + i_566_; i_568_++) {
	    for (int i_569_ = 0; i_569_ < i_566_ + i_566_; i_569_++) {
		if (bools[i_568_][i_569_]) {
		    int i_570_ = i - i_566_ + i_568_;
		    int i_571_ = i_565_ - i_566_ + i_569_;
		    if (i_570_ >= 0 && i_570_ < anInt1627 * -657933437
			&& i_571_ >= 0 && i_571_ < anInt1626 * 1769495707)
			method8310(i_570_, i_571_, i_567_);
		}
	    }
	}
    }
}
