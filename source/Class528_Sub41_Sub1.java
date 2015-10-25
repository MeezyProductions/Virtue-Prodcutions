/* Class528_Sub41_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub41_Sub1 extends Class528_Sub41
{
    static final int anInt11728 = 1638;
    static final int anInt11729 = 4;
    static final int anInt11730 = 4;
    static final boolean aBool11731 = true;
    short[] aShortArray11732;
    int anInt11733;
    short[] aShortArray11734;
    byte[] aByteArray11735 = new byte[512];
    static final int anInt11736 = 0;
    int anInt11737;
    int anInt11738;
    int anInt11739;
    int anInt11740;
    boolean aBool11741;
    static final int anInt11742 = 8;
    
    void method10648() {
	if (637219365 * ((Class528_Sub41_Sub1) this).anInt11740 > 0) {
	    ((Class528_Sub41_Sub1) this).aShortArray11732
		= (new short
		   [((Class528_Sub41_Sub1) this).anInt11739 * -1721320339]);
	    ((Class528_Sub41_Sub1) this).aShortArray11734
		= (new short
		   [((Class528_Sub41_Sub1) this).anInt11739 * -1721320339]);
	    for (int i = 0;
		 i < ((Class528_Sub41_Sub1) this).anInt11739 * -1721320339;
		 i++) {
		((Class528_Sub41_Sub1) this).aShortArray11732[i]
		    = (short) (int) ((Math.pow
				      ((double) ((float) (637219365
							  * ((Class528_Sub41_Sub1)
							     this).anInt11740)
						 / 4096.0F),
				       (double) i))
				     * 4096.0);
		((Class528_Sub41_Sub1) this).aShortArray11734[i]
		    = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (null != ((Class528_Sub41_Sub1) this).aShortArray11732
		   && (((Class528_Sub41_Sub1) this).aShortArray11732.length
		       == (((Class528_Sub41_Sub1) this).anInt11739
			   * -1721320339))) {
	    ((Class528_Sub41_Sub1) this).aShortArray11734
		= (new short
		   [-1721320339 * ((Class528_Sub41_Sub1) this).anInt11739]);
	    for (int i = 0;
		 i < ((Class528_Sub41_Sub1) this).anInt11739 * -1721320339;
		 i++)
		((Class528_Sub41_Sub1) this).aShortArray11734[i]
		    = (short) (int) Math.pow(2.0, (double) i);
	}
    }
    
    int method10649(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
		    int i_5_) {
	int i_6_ = i >> 12;
	int i_7_ = 1 + i_6_;
	if (i_7_ >= i_4_)
	    i_7_ = 0;
	i &= 0xfff;
	i_6_ &= 0xff;
	i_7_ &= 0xff;
	int i_8_ = i - 4096;
	int i_9_ = i_0_ - 4096;
	int i_10_ = Class412.anIntArray4716[i];
	int i_11_
	    = ((Class528_Sub41_Sub1) this).aByteArray11735[i_6_ + i_1_] & 0x3;
	int i_12_;
	if (i_11_ <= 1)
	    i_12_ = i_11_ == 0 ? i_0_ + i : i_0_ - i;
	else
	    i_12_ = i_11_ == 2 ? i - i_0_ : -i - i_0_;
	i_11_
	    = ((Class528_Sub41_Sub1) this).aByteArray11735[i_7_ + i_1_] & 0x3;
	int i_13_;
	if (i_11_ <= 1)
	    i_13_ = 0 == i_11_ ? i_8_ + i_0_ : i_0_ - i_8_;
	else
	    i_13_ = 2 == i_11_ ? i_8_ - i_0_ : -i_8_ - i_0_;
	int i_14_ = (i_10_ * (i_13_ - i_12_) >> 12) + i_12_;
	i_11_
	    = ((Class528_Sub41_Sub1) this).aByteArray11735[i_2_ + i_6_] & 0x3;
	if (i_11_ <= 1)
	    i_12_ = i_11_ == 0 ? i_9_ + i : i_9_ - i;
	else
	    i_12_ = 2 == i_11_ ? i - i_9_ : -i - i_9_;
	i_11_
	    = ((Class528_Sub41_Sub1) this).aByteArray11735[i_7_ + i_2_] & 0x3;
	if (i_11_ <= 1)
	    i_13_ = 0 == i_11_ ? i_9_ + i_8_ : i_9_ - i_8_;
	else
	    i_13_ = i_11_ == 2 ? i_8_ - i_9_ : -i_8_ - i_9_;
	int i_15_ = ((i_13_ - i_12_) * i_10_ >> 12) + i_12_;
	return (i_3_ * (i_15_ - i_14_) >> 12) + i_14_;
    }
    
    void method10650(int i) {
	((Class528_Sub41_Sub1) this).aByteArray11735
	    = Class66.method1064((630111325
				  * ((Class528_Sub41_Sub1) this).anInt11733),
				 -2047946716);
	method10651((byte) 3);
	for (int i_16_
		 = -1721320339 * ((Class528_Sub41_Sub1) this).anInt11739 - 1;
	     i_16_ >= 1; i_16_--) {
	    short i_17_ = ((Class528_Sub41_Sub1) this).aShortArray11732[i_16_];
	    if (i_17_ > 8 || i_17_ < -8)
		break;
	    ((Class528_Sub41_Sub1) this).anInt11739 -= 678079845;
	}
    }
    
    void method10651(byte i) {
	if (637219365 * ((Class528_Sub41_Sub1) this).anInt11740 > 0) {
	    ((Class528_Sub41_Sub1) this).aShortArray11732
		= (new short
		   [((Class528_Sub41_Sub1) this).anInt11739 * -1721320339]);
	    ((Class528_Sub41_Sub1) this).aShortArray11734
		= (new short
		   [((Class528_Sub41_Sub1) this).anInt11739 * -1721320339]);
	    for (int i_18_ = 0;
		 i_18_ < ((Class528_Sub41_Sub1) this).anInt11739 * -1721320339;
		 i_18_++) {
		((Class528_Sub41_Sub1) this).aShortArray11732[i_18_]
		    = (short) (int) ((Math.pow
				      ((double) ((float) (637219365
							  * ((Class528_Sub41_Sub1)
							     this).anInt11740)
						 / 4096.0F),
				       (double) i_18_))
				     * 4096.0);
		((Class528_Sub41_Sub1) this).aShortArray11734[i_18_]
		    = (short) (int) Math.pow(2.0, (double) i_18_);
	    }
	} else if (null != ((Class528_Sub41_Sub1) this).aShortArray11732
		   && (((Class528_Sub41_Sub1) this).aShortArray11732.length
		       == (((Class528_Sub41_Sub1) this).anInt11739
			   * -1721320339))) {
	    ((Class528_Sub41_Sub1) this).aShortArray11734
		= (new short
		   [-1721320339 * ((Class528_Sub41_Sub1) this).anInt11739]);
	    for (int i_19_ = 0;
		 i_19_ < ((Class528_Sub41_Sub1) this).anInt11739 * -1721320339;
		 i_19_++)
		((Class528_Sub41_Sub1) this).aShortArray11734[i_19_]
		    = (short) (int) Math.pow(2.0, (double) i_19_);
	}
    }
    
    void method10652(int i, int[] is, byte i_20_) {
	int i_21_ = (((Class528_Sub41_Sub1) this).anInt11738 * 1792411885
		     * Class66.anIntArray756[i]);
	if (1 == ((Class528_Sub41_Sub1) this).anInt11739 * -1721320339) {
	    int i_22_ = ((Class528_Sub41_Sub1) this).aShortArray11732[0];
	    int i_23_ = ((Class528_Sub41_Sub1) this).aShortArray11734[0] << 12;
	    int i_24_ = (i_23_ * (((Class528_Sub41_Sub1) this).anInt11738
				  * 1792411885)
			 >> 12);
	    int i_25_
		= (((Class528_Sub41_Sub1) this).anInt11737 * 341088845 * i_23_
		   >> 12);
	    int i_26_ = i_21_ * i_23_ >> 12;
	    int i_27_ = i_26_ >> 12;
	    int i_28_ = i_27_ + 1;
	    if (i_28_ >= i_24_)
		i_28_ = 0;
	    i_26_ &= 0xfff;
	    int i_29_ = Class412.anIntArray4716[i_26_];
	    int i_30_
		= (((Class528_Sub41_Sub1) this).aByteArray11735[i_27_ & 0xff]
		   & 0xff);
	    int i_31_
		= (((Class528_Sub41_Sub1) this).aByteArray11735[i_28_ & 0xff]
		   & 0xff);
	    if (((Class528_Sub41_Sub1) this).aBool11741) {
		for (int i_32_ = 0; i_32_ < Class66.anInt760 * 736531093;
		     i_32_++) {
		    int i_33_
			= (341088845 * ((Class528_Sub41_Sub1) this).anInt11737
			   * Class66.anIntArray759[i_32_]);
		    int i_34_ = method10649(i_33_ * i_23_ >> 12, i_26_, i_30_,
					    i_31_, i_29_, i_25_, -2072091944);
		    i_34_ = i_22_ * i_34_ >> 12;
		    is[i_32_] = (i_34_ >> 1) + 2048;
		}
	    } else {
		for (int i_35_ = 0; i_35_ < Class66.anInt760 * 736531093;
		     i_35_++) {
		    int i_36_ = (((Class528_Sub41_Sub1) this).anInt11737
				 * 341088845 * Class66.anIntArray759[i_35_]);
		    int i_37_ = method10649(i_36_ * i_23_ >> 12, i_26_, i_30_,
					    i_31_, i_29_, i_25_, -2092503136);
		    is[i_35_] = i_22_ * i_37_ >> 12;
		}
	    }
	} else {
	    int i_38_ = ((Class528_Sub41_Sub1) this).aShortArray11732[0];
	    if (i_38_ > 8 || i_38_ < -8) {
		int i_39_
		    = ((Class528_Sub41_Sub1) this).aShortArray11734[0] << 12;
		int i_40_ = (i_39_ * (((Class528_Sub41_Sub1) this).anInt11738
				      * 1792411885)
			     >> 12);
		int i_41_
		    = (i_39_ * (341088845
				* ((Class528_Sub41_Sub1) this).anInt11737)
		       >> 12);
		int i_42_ = i_39_ * i_21_ >> 12;
		int i_43_ = i_42_ >> 12;
		int i_44_ = 1 + i_43_;
		if (i_44_ >= i_40_)
		    i_44_ = 0;
		i_42_ &= 0xfff;
		int i_45_ = Class412.anIntArray4716[i_42_];
		int i_46_ = ((((Class528_Sub41_Sub1) this).aByteArray11735
			      [i_43_ & 0xff])
			     & 0xff);
		int i_47_ = ((((Class528_Sub41_Sub1) this).aByteArray11735
			      [i_44_ & 0xff])
			     & 0xff);
		for (int i_48_ = 0; i_48_ < 736531093 * Class66.anInt760;
		     i_48_++) {
		    int i_49_ = (((Class528_Sub41_Sub1) this).anInt11737
				 * 341088845 * Class66.anIntArray759[i_48_]);
		    int i_50_ = method10649(i_39_ * i_49_ >> 12, i_42_, i_46_,
					    i_47_, i_45_, i_41_, -1945411608);
		    is[i_48_] = i_38_ * i_50_ >> 12;
		}
	    }
	    for (int i_51_ = 1;
		 i_51_ < -1721320339 * ((Class528_Sub41_Sub1) this).anInt11739;
		 i_51_++) {
		i_38_ = ((Class528_Sub41_Sub1) this).aShortArray11732[i_51_];
		if (i_38_ > 8 || i_38_ < -8) {
		    int i_52_
			= (((Class528_Sub41_Sub1) this).aShortArray11734[i_51_]
			   << 12);
		    int i_53_ = ((((Class528_Sub41_Sub1) this).anInt11738
				  * 1792411885 * i_52_)
				 >> 12);
		    int i_54_
			= (i_52_ * (341088845
				    * ((Class528_Sub41_Sub1) this).anInt11737)
			   >> 12);
		    int i_55_ = i_21_ * i_52_ >> 12;
		    int i_56_ = i_55_ >> 12;
		    int i_57_ = i_56_ + 1;
		    if (i_57_ >= i_53_)
			i_57_ = 0;
		    i_55_ &= 0xfff;
		    int i_58_ = Class412.anIntArray4716[i_55_];
		    int i_59_ = ((((Class528_Sub41_Sub1) this).aByteArray11735
				  [i_56_ & 0xff])
				 & 0xff);
		    int i_60_ = ((((Class528_Sub41_Sub1) this).aByteArray11735
				  [i_57_ & 0xff])
				 & 0xff);
		    if (((Class528_Sub41_Sub1) this).aBool11741
			&& i_51_ == (((Class528_Sub41_Sub1) this).anInt11739
				     * -1721320339) - 1) {
			for (int i_61_ = 0;
			     i_61_ < 736531093 * Class66.anInt760; i_61_++) {
			    int i_62_
				= (Class66.anIntArray759[i_61_]
				   * (((Class528_Sub41_Sub1) this).anInt11737
				      * 341088845));
			    int i_63_ = method10649(i_62_ * i_52_ >> 12, i_55_,
						    i_59_, i_60_, i_58_, i_54_,
						    -2003658757);
			    i_63_ = is[i_61_] + (i_38_ * i_63_ >> 12);
			    is[i_61_] = (i_63_ >> 1) + 2048;
			}
		    } else {
			for (int i_64_ = 0;
			     i_64_ < 736531093 * Class66.anInt760; i_64_++) {
			    int i_65_
				= (((Class528_Sub41_Sub1) this).anInt11737
				   * 341088845 * Class66.anIntArray759[i_64_]);
			    int i_66_ = method10649(i_65_ * i_52_ >> 12, i_55_,
						    i_59_, i_60_, i_58_, i_54_,
						    -2059814701);
			    is[i_64_] += i_66_ * i_38_ >> 12;
			}
		    }
		}
	    }
	}
    }
    
    void method10653() {
	if (637219365 * ((Class528_Sub41_Sub1) this).anInt11740 > 0) {
	    ((Class528_Sub41_Sub1) this).aShortArray11732
		= (new short
		   [((Class528_Sub41_Sub1) this).anInt11739 * -1721320339]);
	    ((Class528_Sub41_Sub1) this).aShortArray11734
		= (new short
		   [((Class528_Sub41_Sub1) this).anInt11739 * -1721320339]);
	    for (int i = 0;
		 i < ((Class528_Sub41_Sub1) this).anInt11739 * -1721320339;
		 i++) {
		((Class528_Sub41_Sub1) this).aShortArray11732[i]
		    = (short) (int) ((Math.pow
				      ((double) ((float) (637219365
							  * ((Class528_Sub41_Sub1)
							     this).anInt11740)
						 / 4096.0F),
				       (double) i))
				     * 4096.0);
		((Class528_Sub41_Sub1) this).aShortArray11734[i]
		    = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (null != ((Class528_Sub41_Sub1) this).aShortArray11732
		   && (((Class528_Sub41_Sub1) this).aShortArray11732.length
		       == (((Class528_Sub41_Sub1) this).anInt11739
			   * -1721320339))) {
	    ((Class528_Sub41_Sub1) this).aShortArray11734
		= (new short
		   [-1721320339 * ((Class528_Sub41_Sub1) this).anInt11739]);
	    for (int i = 0;
		 i < ((Class528_Sub41_Sub1) this).anInt11739 * -1721320339;
		 i++)
		((Class528_Sub41_Sub1) this).aShortArray11734[i]
		    = (short) (int) Math.pow(2.0, (double) i);
	}
    }
    
    Class528_Sub41_Sub1() {
	super(0, true);
	((Class528_Sub41_Sub1) this).anInt11733 = 0;
	((Class528_Sub41_Sub1) this).anInt11737 = 1248377364;
	((Class528_Sub41_Sub1) this).anInt11738 = -15314028;
	((Class528_Sub41_Sub1) this).anInt11739 = -1582647916;
	((Class528_Sub41_Sub1) this).anInt11740 = -1780922130;
	((Class528_Sub41_Sub1) this).aBool11741 = true;
    }
    
    void method10654() {
	if (637219365 * ((Class528_Sub41_Sub1) this).anInt11740 > 0) {
	    ((Class528_Sub41_Sub1) this).aShortArray11732
		= (new short
		   [((Class528_Sub41_Sub1) this).anInt11739 * -1721320339]);
	    ((Class528_Sub41_Sub1) this).aShortArray11734
		= (new short
		   [((Class528_Sub41_Sub1) this).anInt11739 * -1721320339]);
	    for (int i = 0;
		 i < ((Class528_Sub41_Sub1) this).anInt11739 * -1721320339;
		 i++) {
		((Class528_Sub41_Sub1) this).aShortArray11732[i]
		    = (short) (int) ((Math.pow
				      ((double) ((float) (637219365
							  * ((Class528_Sub41_Sub1)
							     this).anInt11740)
						 / 4096.0F),
				       (double) i))
				     * 4096.0);
		((Class528_Sub41_Sub1) this).aShortArray11734[i]
		    = (short) (int) Math.pow(2.0, (double) i);
	    }
	} else if (null != ((Class528_Sub41_Sub1) this).aShortArray11732
		   && (((Class528_Sub41_Sub1) this).aShortArray11732.length
		       == (((Class528_Sub41_Sub1) this).anInt11739
			   * -1721320339))) {
	    ((Class528_Sub41_Sub1) this).aShortArray11734
		= (new short
		   [-1721320339 * ((Class528_Sub41_Sub1) this).anInt11739]);
	    for (int i = 0;
		 i < ((Class528_Sub41_Sub1) this).anInt11739 * -1721320339;
		 i++)
		((Class528_Sub41_Sub1) this).aShortArray11734[i]
		    = (short) (int) Math.pow(2.0, (double) i);
	}
    }
}
