/* Class178_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class178_Sub2 extends Class178
{
    public int anInt9765;
    int anInt9766;
    public int anInt9767;
    int anInt9768;
    public int[] anIntArray9769;
    public byte[] aByteArray9770;
    int anInt9771;
    int anInt9772;
    public byte[] aByteArray9773;
    
    public int method2607(int i, int i_0_) {
	return (anIntArray9769
		[(aByteArray9770[i + i_0_ * ((Class178_Sub2) this).anInt9771]
		  & 0xff)]);
    }
    
    public void method2613() {
	byte[] is = aByteArray9770;
	if (aByteArray9773 == null) {
	    for (int i = (((Class178_Sub2) this).anInt9766 >> 1) - 1; i >= 0;
		 i--) {
		int i_1_ = i * ((Class178_Sub2) this).anInt9771;
		int i_2_ = ((((Class178_Sub2) this).anInt9766 - i - 1)
			    * ((Class178_Sub2) this).anInt9771);
		for (int i_3_ = -((Class178_Sub2) this).anInt9771; i_3_ < 0;
		     i_3_++) {
		    byte i_4_ = is[i_1_];
		    is[i_1_] = is[i_2_];
		    is[i_2_] = i_4_;
		    i_1_++;
		    i_2_++;
		}
	    }
	} else {
	    byte[] is_5_ = aByteArray9773;
	    for (int i = (((Class178_Sub2) this).anInt9766 >> 1) - 1; i >= 0;
		 i--) {
		int i_6_ = i * ((Class178_Sub2) this).anInt9771;
		int i_7_ = ((((Class178_Sub2) this).anInt9766 - i - 1)
			    * ((Class178_Sub2) this).anInt9771);
		for (int i_8_ = -((Class178_Sub2) this).anInt9771; i_8_ < 0;
		     i_8_++) {
		    byte i_9_ = is[i_6_];
		    is[i_6_] = is[i_7_];
		    is[i_7_] = i_9_;
		    i_9_ = is_5_[i_6_];
		    is_5_[i_6_] = is_5_[i_7_];
		    is_5_[i_7_] = i_9_;
		    i_6_++;
		    i_7_++;
		}
	    }
	}
	int i = anInt9765;
	anInt9765 = ((Class178_Sub2) this).anInt9772;
	((Class178_Sub2) this).anInt9772 = i;
    }
    
    public boolean method2600() {
	return aByteArray9773 != null;
    }
    
    public void method2651(int i, int i_10_, int i_11_) {
	for (int i_12_ = 1; i_12_ < anIntArray9769.length; i_12_++) {
	    if (anIntArray9769[i_12_] != 1
		&& anIntArray9769[i_12_] != 16711935) {
		int i_13_ = anIntArray9769[i_12_] >> 16 & 0xff;
		i_13_ += i;
		if (i_13_ < 0)
		    i_13_ = 0;
		else if (i_13_ > 255)
		    i_13_ = 255;
		int i_14_ = anIntArray9769[i_12_] >> 8 & 0xff;
		i_14_ += i_10_;
		if (i_14_ < 0)
		    i_14_ = 0;
		else if (i_14_ > 255)
		    i_14_ = 255;
		int i_15_ = anIntArray9769[i_12_] >> 0 & 0xff;
		i_15_ += i_11_;
		if (i_15_ < 0)
		    i_15_ = 0;
		else if (i_15_ > 255)
		    i_15_ = 255;
		anIntArray9769[i_12_] = i_13_ << 16 | i_14_ << 8 | i_15_;
	    }
	}
    }
    
    public int method2634() {
	return ((Class178_Sub2) this).anInt9768;
    }
    
    public int method2608() {
	return (((Class178_Sub2) this).anInt9771 + anInt9767
		+ ((Class178_Sub2) this).anInt9768);
    }
    
    public int method2615() {
	return (((Class178_Sub2) this).anInt9766 + anInt9765
		+ ((Class178_Sub2) this).anInt9772);
    }
    
    public int method2656(int i, int i_16_) {
	return (anIntArray9769
		[(aByteArray9770[i + i_16_ * ((Class178_Sub2) this).anInt9771]
		  & 0xff)]);
    }
    
    public int method2604() {
	return ((Class178_Sub2) this).anInt9768;
    }
    
    public int method2605() {
	return anInt9765;
    }
    
    public int method2606() {
	return ((Class178_Sub2) this).anInt9772;
    }
    
    public void method2621() {
	((Class178_Sub2) this).anInt9772 = 0;
	anInt9765 = 0;
	((Class178_Sub2) this).anInt9768 = 0;
	anInt9767 = 0;
    }
    
    public void method2609(int i) {
	int i_17_ = method2608();
	int i_18_ = method2615();
	if (((Class178_Sub2) this).anInt9771 != i_17_
	    || ((Class178_Sub2) this).anInt9766 != i_18_) {
	    int i_19_ = i;
	    if (i_19_ > anInt9767)
		i_19_ = anInt9767;
	    int i_20_ = i;
	    if (i_20_ + anInt9767 + ((Class178_Sub2) this).anInt9771 > i_17_)
		i_20_ = i_17_ - anInt9767 - ((Class178_Sub2) this).anInt9771;
	    int i_21_ = i;
	    if (i_21_ > anInt9765)
		i_21_ = anInt9765;
	    int i_22_ = i;
	    if (i_22_ + anInt9765 + ((Class178_Sub2) this).anInt9766 > i_18_)
		i_22_ = i_18_ - anInt9765 - ((Class178_Sub2) this).anInt9766;
	    int i_23_ = ((Class178_Sub2) this).anInt9771 + i_19_ + i_20_;
	    int i_24_ = ((Class178_Sub2) this).anInt9766 + i_21_ + i_22_;
	    byte[] is = new byte[i_23_ * i_24_];
	    if (aByteArray9773 == null) {
		for (int i_25_ = 0; i_25_ < ((Class178_Sub2) this).anInt9766;
		     i_25_++) {
		    int i_26_ = i_25_ * ((Class178_Sub2) this).anInt9771;
		    int i_27_ = (i_25_ + i_21_) * i_23_ + i_19_;
		    for (int i_28_ = 0;
			 i_28_ < ((Class178_Sub2) this).anInt9771; i_28_++)
			is[i_27_++] = aByteArray9770[i_26_++];
		}
	    } else {
		byte[] is_29_ = new byte[i_23_ * i_24_];
		for (int i_30_ = 0; i_30_ < ((Class178_Sub2) this).anInt9766;
		     i_30_++) {
		    int i_31_ = i_30_ * ((Class178_Sub2) this).anInt9771;
		    int i_32_ = (i_30_ + i_21_) * i_23_ + i_19_;
		    for (int i_33_ = 0;
			 i_33_ < ((Class178_Sub2) this).anInt9771; i_33_++) {
			is_29_[i_32_] = aByteArray9773[i_31_];
			is[i_32_++] = aByteArray9770[i_31_++];
		    }
		}
		aByteArray9773 = is_29_;
	    }
	    anInt9767 -= i_19_;
	    anInt9765 -= i_21_;
	    ((Class178_Sub2) this).anInt9768 -= i_20_;
	    ((Class178_Sub2) this).anInt9772 -= i_22_;
	    ((Class178_Sub2) this).anInt9771 = i_23_;
	    ((Class178_Sub2) this).anInt9766 = i_24_;
	    aByteArray9770 = is;
	}
    }
    
    public void method2610(int i) {
	int i_34_ = -1;
	if (anIntArray9769.length < 255) {
	    for (int i_35_ = 0; i_35_ < anIntArray9769.length; i_35_++) {
		if (anIntArray9769[i_35_] == i) {
		    i_34_ = i_35_;
		    break;
		}
	    }
	    if (i_34_ == -1) {
		i_34_ = anIntArray9769.length;
		int[] is = new int[anIntArray9769.length + 1];
		System.arraycopy(anIntArray9769, 0, is, 0,
				 anIntArray9769.length);
		anIntArray9769 = is;
		is[i_34_] = i;
	    }
	} else {
	    int i_36_ = 2147483647;
	    int i_37_ = i >> 16 & 0xff;
	    int i_38_ = i >> 8 & 0xff;
	    int i_39_ = i & 0xff;
	    for (int i_40_ = 0; i_40_ < anIntArray9769.length; i_40_++) {
		int i_41_ = anIntArray9769[i_40_];
		int i_42_ = i_41_ >> 16 & 0xff;
		int i_43_ = i_41_ >> 8 & 0xff;
		int i_44_ = i_41_ & 0xff;
		int i_45_ = i_37_ - i_42_;
		if (i_45_ < 0)
		    i_45_ = -i_45_;
		int i_46_ = i_38_ - i_43_;
		if (i_46_ < 0)
		    i_46_ = -i_46_;
		int i_47_ = i_39_ - i_44_;
		if (i_47_ < 0)
		    i_47_ = -i_47_;
		int i_48_ = i_45_ + i_46_ + i_47_;
		if (i_48_ < i_36_) {
		    i_36_ = i_48_;
		    i_34_ = i_40_;
		}
	    }
	}
	int i_49_ = 0;
	byte[] is = new byte[(((Class178_Sub2) this).anInt9771
			      * ((Class178_Sub2) this).anInt9766)];
	for (int i_50_ = 0; i_50_ < ((Class178_Sub2) this).anInt9766;
	     i_50_++) {
	    for (int i_51_ = 0; i_51_ < ((Class178_Sub2) this).anInt9771;
		 i_51_++) {
		int i_52_ = aByteArray9770[i_49_] & 0xff;
		if (anIntArray9769[i_52_] == 0) {
		    if (i_51_ > 0
			&& (anIntArray9769[aByteArray9770[i_49_ - 1] & 0xff]
			    != 0))
			i_52_ = i_34_;
		    else if (i_50_ > 0
			     && (anIntArray9769
				 [((aByteArray9770
				    [i_49_ - ((Class178_Sub2) this).anInt9771])
				   & 0xff)]) != 0)
			i_52_ = i_34_;
		    else if (i_51_ < ((Class178_Sub2) this).anInt9771 - 1
			     && (anIntArray9769
				 [aByteArray9770[i_49_ + 1] & 0xff]) != 0)
			i_52_ = i_34_;
		    else if (i_50_ < ((Class178_Sub2) this).anInt9766 - 1
			     && (anIntArray9769
				 [((aByteArray9770
				    [i_49_ + ((Class178_Sub2) this).anInt9771])
				   & 0xff)]) != 0)
			i_52_ = i_34_;
		}
		is[i_49_++] = (byte) i_52_;
	    }
	}
	aByteArray9770 = is;
    }
    
    public void method2611(int i) {
	int i_53_ = -1;
	if (anIntArray9769.length < 255) {
	    for (int i_54_ = 0; i_54_ < anIntArray9769.length; i_54_++) {
		if (anIntArray9769[i_54_] == i) {
		    i_53_ = i_54_;
		    break;
		}
	    }
	    if (i_53_ == -1) {
		i_53_ = anIntArray9769.length;
		int[] is = new int[anIntArray9769.length + 1];
		System.arraycopy(anIntArray9769, 0, is, 0,
				 anIntArray9769.length);
		anIntArray9769 = is;
		is[i_53_] = i;
	    }
	} else {
	    int i_55_ = 2147483647;
	    int i_56_ = i >> 16 & 0xff;
	    int i_57_ = i >> 8 & 0xff;
	    int i_58_ = i & 0xff;
	    for (int i_59_ = 0; i_59_ < anIntArray9769.length; i_59_++) {
		int i_60_ = anIntArray9769[i_59_];
		int i_61_ = i_60_ >> 16 & 0xff;
		int i_62_ = i_60_ >> 8 & 0xff;
		int i_63_ = i_60_ & 0xff;
		int i_64_ = i_56_ - i_61_;
		if (i_64_ < 0)
		    i_64_ = -i_64_;
		int i_65_ = i_57_ - i_62_;
		if (i_65_ < 0)
		    i_65_ = -i_65_;
		int i_66_ = i_58_ - i_63_;
		if (i_66_ < 0)
		    i_66_ = -i_66_;
		int i_67_ = i_64_ + i_65_ + i_66_;
		if (i_67_ < i_55_) {
		    i_55_ = i_67_;
		    i_53_ = i_59_;
		}
	    }
	}
	for (int i_68_ = ((Class178_Sub2) this).anInt9766 - 1; i_68_ > 0;
	     i_68_--) {
	    int i_69_ = i_68_ * ((Class178_Sub2) this).anInt9771;
	    for (int i_70_ = ((Class178_Sub2) this).anInt9771 - 1; i_70_ > 0;
		 i_70_--) {
		if (anIntArray9769[aByteArray9770[i_70_ + i_69_] & 0xff] == 0
		    && (anIntArray9769
			[(aByteArray9770[(i_70_ + i_69_ - 1
					  - ((Class178_Sub2) this).anInt9771)]
			  & 0xff)]) != 0)
		    aByteArray9770[i_70_ + i_69_] = (byte) i_53_;
	    }
	}
    }
    
    public void method2623() {
	byte[] is = aByteArray9770;
	if (aByteArray9773 == null) {
	    for (int i = ((Class178_Sub2) this).anInt9766 - 1; i >= 0; i--) {
		int i_71_ = i * ((Class178_Sub2) this).anInt9771;
		for (int i_72_ = (i + 1) * ((Class178_Sub2) this).anInt9771;
		     i_71_ < i_72_; i_71_++) {
		    i_72_--;
		    byte i_73_ = is[i_71_];
		    is[i_71_] = is[i_72_];
		    is[i_72_] = i_73_;
		}
	    }
	} else {
	    byte[] is_74_ = aByteArray9773;
	    for (int i = ((Class178_Sub2) this).anInt9766 - 1; i >= 0; i--) {
		int i_75_ = i * ((Class178_Sub2) this).anInt9771;
		for (int i_76_ = (i + 1) * ((Class178_Sub2) this).anInt9771;
		     i_75_ < i_76_; i_75_++) {
		    i_76_--;
		    byte i_77_ = is[i_75_];
		    is[i_75_] = is[i_76_];
		    is[i_76_] = i_77_;
		    i_77_ = is_74_[i_75_];
		    is_74_[i_75_] = is_74_[i_76_];
		    is_74_[i_76_] = i_77_;
		}
	    }
	}
	int i = anInt9767;
	anInt9767 = ((Class178_Sub2) this).anInt9768;
	((Class178_Sub2) this).anInt9768 = i;
    }
    
    public int method2660() {
	return anInt9765;
    }
    
    public int method2603() {
	return anInt9767;
    }
    
    public int[] method2629(boolean bool) {
	int[] is;
	if (bool) {
	    int i = method2608();
	    is = new int[i * method2615()];
	    if (aByteArray9773 != null) {
		for (int i_78_ = 0; i_78_ < ((Class178_Sub2) this).anInt9766;
		     i_78_++) {
		    int i_79_ = i_78_ * ((Class178_Sub2) this).anInt9771;
		    int i_80_ = anInt9767 + (i_78_ + anInt9765) * i;
		    for (int i_81_ = 0;
			 i_81_ < ((Class178_Sub2) this).anInt9771; i_81_++) {
			is[i_80_++]
			    = (aByteArray9773[i_79_] << 24
			       | anIntArray9769[aByteArray9770[i_79_] & 0xff]);
			i_79_++;
		    }
		}
	    } else {
		for (int i_82_ = 0; i_82_ < ((Class178_Sub2) this).anInt9766;
		     i_82_++) {
		    int i_83_ = i_82_ * ((Class178_Sub2) this).anInt9771;
		    int i_84_ = anInt9767 + (i_82_ + anInt9765) * i;
		    for (int i_85_ = 0;
			 i_85_ < ((Class178_Sub2) this).anInt9771; i_85_++) {
			int i_86_
			    = anIntArray9769[aByteArray9770[i_83_++] & 0xff];
			if (i_86_ != 0)
			    is[i_84_++] = ~0xffffff | i_86_;
			else
			    is[i_84_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[(((Class178_Sub2) this).anInt9771
			  * ((Class178_Sub2) this).anInt9766)];
	    int i = 0;
	    int i_87_ = 0;
	    if (aByteArray9773 != null) {
		for (int i_88_ = 0; i_88_ < ((Class178_Sub2) this).anInt9766;
		     i_88_++) {
		    for (int i_89_ = 0;
			 i_89_ < ((Class178_Sub2) this).anInt9771; i_89_++) {
			is[i_87_++]
			    = (aByteArray9773[i] << 24
			       | anIntArray9769[aByteArray9770[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_90_ = 0; i_90_ < ((Class178_Sub2) this).anInt9766;
		     i_90_++) {
		    for (int i_91_ = 0;
			 i_91_ < ((Class178_Sub2) this).anInt9771; i_91_++) {
			int i_92_ = anIntArray9769[aByteArray9770[i++] & 0xff];
			is[i_87_++] = i_92_ != 0 ? ~0xffffff | i_92_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public void method2648() {
	byte[] is = new byte[(((Class178_Sub2) this).anInt9771
			      * ((Class178_Sub2) this).anInt9766)];
	int i = 0;
	if (aByteArray9773 == null) {
	    for (int i_93_ = 0; i_93_ < ((Class178_Sub2) this).anInt9771;
		 i_93_++) {
		for (int i_94_ = ((Class178_Sub2) this).anInt9766 - 1;
		     i_94_ >= 0; i_94_--)
		    is[i++]
			= (aByteArray9770
			   [i_93_ + i_94_ * ((Class178_Sub2) this).anInt9771]);
	    }
	    aByteArray9770 = is;
	} else {
	    byte[] is_95_ = new byte[(((Class178_Sub2) this).anInt9771
				      * ((Class178_Sub2) this).anInt9766)];
	    for (int i_96_ = 0; i_96_ < ((Class178_Sub2) this).anInt9771;
		 i_96_++) {
		for (int i_97_ = ((Class178_Sub2) this).anInt9766 - 1;
		     i_97_ >= 0; i_97_--) {
		    is[i]
			= (aByteArray9770
			   [i_96_ + i_97_ * ((Class178_Sub2) this).anInt9771]);
		    is_95_[i++]
			= (aByteArray9773
			   [i_96_ + i_97_ * ((Class178_Sub2) this).anInt9771]);
		}
	    }
	    aByteArray9770 = is;
	    aByteArray9773 = is_95_;
	}
	int i_98_ = anInt9765;
	anInt9765 = anInt9767;
	anInt9767 = ((Class178_Sub2) this).anInt9772;
	((Class178_Sub2) this).anInt9772 = ((Class178_Sub2) this).anInt9768;
	((Class178_Sub2) this).anInt9768 = i_98_;
	i_98_ = ((Class178_Sub2) this).anInt9766;
	((Class178_Sub2) this).anInt9766 = ((Class178_Sub2) this).anInt9771;
	((Class178_Sub2) this).anInt9771 = i_98_;
    }
    
    public int method2617(int i, int i_99_) {
	return (anIntArray9769
		[(aByteArray9770[i + i_99_ * ((Class178_Sub2) this).anInt9771]
		  & 0xff)]);
    }
    
    public boolean method2618() {
	return true;
    }
    
    public boolean method2620() {
	return true;
    }
    
    public boolean method2650() {
	return aByteArray9773 != null;
    }
    
    public int method2641() {
	return ((Class178_Sub2) this).anInt9771;
    }
    
    public int method2622() {
	return ((Class178_Sub2) this).anInt9766;
    }
    
    public int method2612() {
	return ((Class178_Sub2) this).anInt9768;
    }
    
    public void method2635() {
	byte[] is = new byte[(((Class178_Sub2) this).anInt9771
			      * ((Class178_Sub2) this).anInt9766)];
	int i = 0;
	if (aByteArray9773 == null) {
	    for (int i_100_ = 0; i_100_ < ((Class178_Sub2) this).anInt9771;
		 i_100_++) {
		for (int i_101_ = ((Class178_Sub2) this).anInt9766 - 1;
		     i_101_ >= 0; i_101_--)
		    is[i++]
			= aByteArray9770[i_100_ + i_101_ * ((Class178_Sub2)
							    this).anInt9771];
	    }
	    aByteArray9770 = is;
	} else {
	    byte[] is_102_ = new byte[(((Class178_Sub2) this).anInt9771
				       * ((Class178_Sub2) this).anInt9766)];
	    for (int i_103_ = 0; i_103_ < ((Class178_Sub2) this).anInt9771;
		 i_103_++) {
		for (int i_104_ = ((Class178_Sub2) this).anInt9766 - 1;
		     i_104_ >= 0; i_104_--) {
		    is[i] = aByteArray9770[i_103_ + i_104_ * ((Class178_Sub2)
							      this).anInt9771];
		    is_102_[i++]
			= aByteArray9773[i_103_ + i_104_ * ((Class178_Sub2)
							    this).anInt9771];
		}
	    }
	    aByteArray9770 = is;
	    aByteArray9773 = is_102_;
	}
	int i_105_ = anInt9765;
	anInt9765 = anInt9767;
	anInt9767 = ((Class178_Sub2) this).anInt9772;
	((Class178_Sub2) this).anInt9772 = ((Class178_Sub2) this).anInt9768;
	((Class178_Sub2) this).anInt9768 = i_105_;
	i_105_ = ((Class178_Sub2) this).anInt9766;
	((Class178_Sub2) this).anInt9766 = ((Class178_Sub2) this).anInt9771;
	((Class178_Sub2) this).anInt9771 = i_105_;
    }
    
    public int method2633() {
	return (((Class178_Sub2) this).anInt9771 + anInt9767
		+ ((Class178_Sub2) this).anInt9768);
    }
    
    public int method2626() {
	return (((Class178_Sub2) this).anInt9771 + anInt9767
		+ ((Class178_Sub2) this).anInt9768);
    }
    
    public void method2658() {
	byte[] is = aByteArray9770;
	if (aByteArray9773 == null) {
	    for (int i = (((Class178_Sub2) this).anInt9766 >> 1) - 1; i >= 0;
		 i--) {
		int i_106_ = i * ((Class178_Sub2) this).anInt9771;
		int i_107_ = ((((Class178_Sub2) this).anInt9766 - i - 1)
			      * ((Class178_Sub2) this).anInt9771);
		for (int i_108_ = -((Class178_Sub2) this).anInt9771;
		     i_108_ < 0; i_108_++) {
		    byte i_109_ = is[i_106_];
		    is[i_106_] = is[i_107_];
		    is[i_107_] = i_109_;
		    i_106_++;
		    i_107_++;
		}
	    }
	} else {
	    byte[] is_110_ = aByteArray9773;
	    for (int i = (((Class178_Sub2) this).anInt9766 >> 1) - 1; i >= 0;
		 i--) {
		int i_111_ = i * ((Class178_Sub2) this).anInt9771;
		int i_112_ = ((((Class178_Sub2) this).anInt9766 - i - 1)
			      * ((Class178_Sub2) this).anInt9771);
		for (int i_113_ = -((Class178_Sub2) this).anInt9771;
		     i_113_ < 0; i_113_++) {
		    byte i_114_ = is[i_111_];
		    is[i_111_] = is[i_112_];
		    is[i_112_] = i_114_;
		    i_114_ = is_110_[i_111_];
		    is_110_[i_111_] = is_110_[i_112_];
		    is_110_[i_112_] = i_114_;
		    i_111_++;
		    i_112_++;
		}
	    }
	}
	int i = anInt9765;
	anInt9765 = ((Class178_Sub2) this).anInt9772;
	((Class178_Sub2) this).anInt9772 = i;
    }
    
    public int method2628() {
	return (((Class178_Sub2) this).anInt9766 + anInt9765
		+ ((Class178_Sub2) this).anInt9772);
    }
    
    public int method2624() {
	return anInt9767;
    }
    
    public int method2630() {
	return anInt9767;
    }
    
    public int method2614() {
	return ((Class178_Sub2) this).anInt9768;
    }
    
    public int method2632() {
	return ((Class178_Sub2) this).anInt9768;
    }
    
    public boolean method2599() {
	return true;
    }
    
    public int method2602() {
	return ((Class178_Sub2) this).anInt9766;
    }
    
    public int method2657() {
	return ((Class178_Sub2) this).anInt9772;
    }
    
    public int method2636() {
	return ((Class178_Sub2) this).anInt9772;
    }
    
    public void method2643(int i) {
	int i_115_ = -1;
	if (anIntArray9769.length < 255) {
	    for (int i_116_ = 0; i_116_ < anIntArray9769.length; i_116_++) {
		if (anIntArray9769[i_116_] == i) {
		    i_115_ = i_116_;
		    break;
		}
	    }
	    if (i_115_ == -1) {
		i_115_ = anIntArray9769.length;
		int[] is = new int[anIntArray9769.length + 1];
		System.arraycopy(anIntArray9769, 0, is, 0,
				 anIntArray9769.length);
		anIntArray9769 = is;
		is[i_115_] = i;
	    }
	} else {
	    int i_117_ = 2147483647;
	    int i_118_ = i >> 16 & 0xff;
	    int i_119_ = i >> 8 & 0xff;
	    int i_120_ = i & 0xff;
	    for (int i_121_ = 0; i_121_ < anIntArray9769.length; i_121_++) {
		int i_122_ = anIntArray9769[i_121_];
		int i_123_ = i_122_ >> 16 & 0xff;
		int i_124_ = i_122_ >> 8 & 0xff;
		int i_125_ = i_122_ & 0xff;
		int i_126_ = i_118_ - i_123_;
		if (i_126_ < 0)
		    i_126_ = -i_126_;
		int i_127_ = i_119_ - i_124_;
		if (i_127_ < 0)
		    i_127_ = -i_127_;
		int i_128_ = i_120_ - i_125_;
		if (i_128_ < 0)
		    i_128_ = -i_128_;
		int i_129_ = i_126_ + i_127_ + i_128_;
		if (i_129_ < i_117_) {
		    i_117_ = i_129_;
		    i_115_ = i_121_;
		}
	    }
	}
	for (int i_130_ = ((Class178_Sub2) this).anInt9766 - 1; i_130_ > 0;
	     i_130_--) {
	    int i_131_ = i_130_ * ((Class178_Sub2) this).anInt9771;
	    for (int i_132_ = ((Class178_Sub2) this).anInt9771 - 1; i_132_ > 0;
		 i_132_--) {
		if (anIntArray9769[aByteArray9770[i_132_ + i_131_] & 0xff] == 0
		    && (anIntArray9769
			[(aByteArray9770[(i_132_ + i_131_ - 1
					  - ((Class178_Sub2) this).anInt9771)]
			  & 0xff)]) != 0)
		    aByteArray9770[i_132_ + i_131_] = (byte) i_115_;
	    }
	}
    }
    
    public void method2640() {
	((Class178_Sub2) this).anInt9772 = 0;
	anInt9765 = 0;
	((Class178_Sub2) this).anInt9768 = 0;
	anInt9767 = 0;
    }
    
    public int method2627() {
	return (((Class178_Sub2) this).anInt9766 + anInt9765
		+ ((Class178_Sub2) this).anInt9772);
    }
    
    public int method2625() {
	return ((Class178_Sub2) this).anInt9766;
    }
    
    public void method2652(int i) {
	int i_133_ = -1;
	if (anIntArray9769.length < 255) {
	    for (int i_134_ = 0; i_134_ < anIntArray9769.length; i_134_++) {
		if (anIntArray9769[i_134_] == i) {
		    i_133_ = i_134_;
		    break;
		}
	    }
	    if (i_133_ == -1) {
		i_133_ = anIntArray9769.length;
		int[] is = new int[anIntArray9769.length + 1];
		System.arraycopy(anIntArray9769, 0, is, 0,
				 anIntArray9769.length);
		anIntArray9769 = is;
		is[i_133_] = i;
	    }
	} else {
	    int i_135_ = 2147483647;
	    int i_136_ = i >> 16 & 0xff;
	    int i_137_ = i >> 8 & 0xff;
	    int i_138_ = i & 0xff;
	    for (int i_139_ = 0; i_139_ < anIntArray9769.length; i_139_++) {
		int i_140_ = anIntArray9769[i_139_];
		int i_141_ = i_140_ >> 16 & 0xff;
		int i_142_ = i_140_ >> 8 & 0xff;
		int i_143_ = i_140_ & 0xff;
		int i_144_ = i_136_ - i_141_;
		if (i_144_ < 0)
		    i_144_ = -i_144_;
		int i_145_ = i_137_ - i_142_;
		if (i_145_ < 0)
		    i_145_ = -i_145_;
		int i_146_ = i_138_ - i_143_;
		if (i_146_ < 0)
		    i_146_ = -i_146_;
		int i_147_ = i_144_ + i_145_ + i_146_;
		if (i_147_ < i_135_) {
		    i_135_ = i_147_;
		    i_133_ = i_139_;
		}
	    }
	}
	int i_148_ = 0;
	byte[] is = new byte[(((Class178_Sub2) this).anInt9771
			      * ((Class178_Sub2) this).anInt9766)];
	for (int i_149_ = 0; i_149_ < ((Class178_Sub2) this).anInt9766;
	     i_149_++) {
	    for (int i_150_ = 0; i_150_ < ((Class178_Sub2) this).anInt9771;
		 i_150_++) {
		int i_151_ = aByteArray9770[i_148_] & 0xff;
		if (anIntArray9769[i_151_] == 0) {
		    if (i_150_ > 0
			&& (anIntArray9769[aByteArray9770[i_148_ - 1] & 0xff]
			    != 0))
			i_151_ = i_133_;
		    else if (i_149_ > 0
			     && (anIntArray9769
				 [(aByteArray9770[i_148_ - ((Class178_Sub2)
							    this).anInt9771]
				   & 0xff)]) != 0)
			i_151_ = i_133_;
		    else if (i_150_ < ((Class178_Sub2) this).anInt9771 - 1
			     && (anIntArray9769
				 [aByteArray9770[i_148_ + 1] & 0xff]) != 0)
			i_151_ = i_133_;
		    else if (i_149_ < ((Class178_Sub2) this).anInt9766 - 1
			     && (anIntArray9769
				 [(aByteArray9770[i_148_ + ((Class178_Sub2)
							    this).anInt9771]
				   & 0xff)]) != 0)
			i_151_ = i_133_;
		}
		is[i_148_++] = (byte) i_151_;
	    }
	}
	aByteArray9770 = is;
    }
    
    public void method2642(int i) {
	int i_152_ = -1;
	if (anIntArray9769.length < 255) {
	    for (int i_153_ = 0; i_153_ < anIntArray9769.length; i_153_++) {
		if (anIntArray9769[i_153_] == i) {
		    i_152_ = i_153_;
		    break;
		}
	    }
	    if (i_152_ == -1) {
		i_152_ = anIntArray9769.length;
		int[] is = new int[anIntArray9769.length + 1];
		System.arraycopy(anIntArray9769, 0, is, 0,
				 anIntArray9769.length);
		anIntArray9769 = is;
		is[i_152_] = i;
	    }
	} else {
	    int i_154_ = 2147483647;
	    int i_155_ = i >> 16 & 0xff;
	    int i_156_ = i >> 8 & 0xff;
	    int i_157_ = i & 0xff;
	    for (int i_158_ = 0; i_158_ < anIntArray9769.length; i_158_++) {
		int i_159_ = anIntArray9769[i_158_];
		int i_160_ = i_159_ >> 16 & 0xff;
		int i_161_ = i_159_ >> 8 & 0xff;
		int i_162_ = i_159_ & 0xff;
		int i_163_ = i_155_ - i_160_;
		if (i_163_ < 0)
		    i_163_ = -i_163_;
		int i_164_ = i_156_ - i_161_;
		if (i_164_ < 0)
		    i_164_ = -i_164_;
		int i_165_ = i_157_ - i_162_;
		if (i_165_ < 0)
		    i_165_ = -i_165_;
		int i_166_ = i_163_ + i_164_ + i_165_;
		if (i_166_ < i_154_) {
		    i_154_ = i_166_;
		    i_152_ = i_158_;
		}
	    }
	}
	int i_167_ = 0;
	byte[] is = new byte[(((Class178_Sub2) this).anInt9771
			      * ((Class178_Sub2) this).anInt9766)];
	for (int i_168_ = 0; i_168_ < ((Class178_Sub2) this).anInt9766;
	     i_168_++) {
	    for (int i_169_ = 0; i_169_ < ((Class178_Sub2) this).anInt9771;
		 i_169_++) {
		int i_170_ = aByteArray9770[i_167_] & 0xff;
		if (anIntArray9769[i_170_] == 0) {
		    if (i_169_ > 0
			&& (anIntArray9769[aByteArray9770[i_167_ - 1] & 0xff]
			    != 0))
			i_170_ = i_152_;
		    else if (i_168_ > 0
			     && (anIntArray9769
				 [(aByteArray9770[i_167_ - ((Class178_Sub2)
							    this).anInt9771]
				   & 0xff)]) != 0)
			i_170_ = i_152_;
		    else if (i_169_ < ((Class178_Sub2) this).anInt9771 - 1
			     && (anIntArray9769
				 [aByteArray9770[i_167_ + 1] & 0xff]) != 0)
			i_170_ = i_152_;
		    else if (i_168_ < ((Class178_Sub2) this).anInt9766 - 1
			     && (anIntArray9769
				 [(aByteArray9770[i_167_ + ((Class178_Sub2)
							    this).anInt9771]
				   & 0xff)]) != 0)
			i_170_ = i_152_;
		}
		is[i_167_++] = (byte) i_170_;
	    }
	}
	aByteArray9770 = is;
    }
    
    public int method2619() {
	return ((Class178_Sub2) this).anInt9766;
    }
    
    public void method2644() {
	byte[] is = aByteArray9770;
	if (aByteArray9773 == null) {
	    for (int i = ((Class178_Sub2) this).anInt9766 - 1; i >= 0; i--) {
		int i_171_ = i * ((Class178_Sub2) this).anInt9771;
		for (int i_172_ = (i + 1) * ((Class178_Sub2) this).anInt9771;
		     i_171_ < i_172_; i_171_++) {
		    i_172_--;
		    byte i_173_ = is[i_171_];
		    is[i_171_] = is[i_172_];
		    is[i_172_] = i_173_;
		}
	    }
	} else {
	    byte[] is_174_ = aByteArray9773;
	    for (int i = ((Class178_Sub2) this).anInt9766 - 1; i >= 0; i--) {
		int i_175_ = i * ((Class178_Sub2) this).anInt9771;
		for (int i_176_ = (i + 1) * ((Class178_Sub2) this).anInt9771;
		     i_175_ < i_176_; i_175_++) {
		    i_176_--;
		    byte i_177_ = is[i_175_];
		    is[i_175_] = is[i_176_];
		    is[i_176_] = i_177_;
		    i_177_ = is_174_[i_175_];
		    is_174_[i_175_] = is_174_[i_176_];
		    is_174_[i_176_] = i_177_;
		}
	    }
	}
	int i = anInt9767;
	anInt9767 = ((Class178_Sub2) this).anInt9768;
	((Class178_Sub2) this).anInt9768 = i;
    }
    
    public void method2645() {
	byte[] is = aByteArray9770;
	if (aByteArray9773 == null) {
	    for (int i = ((Class178_Sub2) this).anInt9766 - 1; i >= 0; i--) {
		int i_178_ = i * ((Class178_Sub2) this).anInt9771;
		for (int i_179_ = (i + 1) * ((Class178_Sub2) this).anInt9771;
		     i_178_ < i_179_; i_178_++) {
		    i_179_--;
		    byte i_180_ = is[i_178_];
		    is[i_178_] = is[i_179_];
		    is[i_179_] = i_180_;
		}
	    }
	} else {
	    byte[] is_181_ = aByteArray9773;
	    for (int i = ((Class178_Sub2) this).anInt9766 - 1; i >= 0; i--) {
		int i_182_ = i * ((Class178_Sub2) this).anInt9771;
		for (int i_183_ = (i + 1) * ((Class178_Sub2) this).anInt9771;
		     i_182_ < i_183_; i_182_++) {
		    i_183_--;
		    byte i_184_ = is[i_182_];
		    is[i_182_] = is[i_183_];
		    is[i_183_] = i_184_;
		    i_184_ = is_181_[i_182_];
		    is_181_[i_182_] = is_181_[i_183_];
		    is_181_[i_183_] = i_184_;
		}
	    }
	}
	int i = anInt9767;
	anInt9767 = ((Class178_Sub2) this).anInt9768;
	((Class178_Sub2) this).anInt9768 = i;
    }
    
    public void method2646() {
	byte[] is = aByteArray9770;
	if (aByteArray9773 == null) {
	    for (int i = ((Class178_Sub2) this).anInt9766 - 1; i >= 0; i--) {
		int i_185_ = i * ((Class178_Sub2) this).anInt9771;
		for (int i_186_ = (i + 1) * ((Class178_Sub2) this).anInt9771;
		     i_185_ < i_186_; i_185_++) {
		    i_186_--;
		    byte i_187_ = is[i_185_];
		    is[i_185_] = is[i_186_];
		    is[i_186_] = i_187_;
		}
	    }
	} else {
	    byte[] is_188_ = aByteArray9773;
	    for (int i = ((Class178_Sub2) this).anInt9766 - 1; i >= 0; i--) {
		int i_189_ = i * ((Class178_Sub2) this).anInt9771;
		for (int i_190_ = (i + 1) * ((Class178_Sub2) this).anInt9771;
		     i_189_ < i_190_; i_189_++) {
		    i_190_--;
		    byte i_191_ = is[i_189_];
		    is[i_189_] = is[i_190_];
		    is[i_190_] = i_191_;
		    i_191_ = is_188_[i_189_];
		    is_188_[i_189_] = is_188_[i_190_];
		    is_188_[i_190_] = i_191_;
		}
	    }
	}
	int i = anInt9767;
	anInt9767 = ((Class178_Sub2) this).anInt9768;
	((Class178_Sub2) this).anInt9768 = i;
    }
    
    public void method2598(int i) {
	int i_192_ = method2608();
	int i_193_ = method2615();
	if (((Class178_Sub2) this).anInt9771 != i_192_
	    || ((Class178_Sub2) this).anInt9766 != i_193_) {
	    int i_194_ = i;
	    if (i_194_ > anInt9767)
		i_194_ = anInt9767;
	    int i_195_ = i;
	    if (i_195_ + anInt9767 + ((Class178_Sub2) this).anInt9771 > i_192_)
		i_195_ = i_192_ - anInt9767 - ((Class178_Sub2) this).anInt9771;
	    int i_196_ = i;
	    if (i_196_ > anInt9765)
		i_196_ = anInt9765;
	    int i_197_ = i;
	    if (i_197_ + anInt9765 + ((Class178_Sub2) this).anInt9766 > i_193_)
		i_197_ = i_193_ - anInt9765 - ((Class178_Sub2) this).anInt9766;
	    int i_198_ = ((Class178_Sub2) this).anInt9771 + i_194_ + i_195_;
	    int i_199_ = ((Class178_Sub2) this).anInt9766 + i_196_ + i_197_;
	    byte[] is = new byte[i_198_ * i_199_];
	    if (aByteArray9773 == null) {
		for (int i_200_ = 0; i_200_ < ((Class178_Sub2) this).anInt9766;
		     i_200_++) {
		    int i_201_ = i_200_ * ((Class178_Sub2) this).anInt9771;
		    int i_202_ = (i_200_ + i_196_) * i_198_ + i_194_;
		    for (int i_203_ = 0;
			 i_203_ < ((Class178_Sub2) this).anInt9771; i_203_++)
			is[i_202_++] = aByteArray9770[i_201_++];
		}
	    } else {
		byte[] is_204_ = new byte[i_198_ * i_199_];
		for (int i_205_ = 0; i_205_ < ((Class178_Sub2) this).anInt9766;
		     i_205_++) {
		    int i_206_ = i_205_ * ((Class178_Sub2) this).anInt9771;
		    int i_207_ = (i_205_ + i_196_) * i_198_ + i_194_;
		    for (int i_208_ = 0;
			 i_208_ < ((Class178_Sub2) this).anInt9771; i_208_++) {
			is_204_[i_207_] = aByteArray9773[i_206_];
			is[i_207_++] = aByteArray9770[i_206_++];
		    }
		}
		aByteArray9773 = is_204_;
	    }
	    anInt9767 -= i_194_;
	    anInt9765 -= i_196_;
	    ((Class178_Sub2) this).anInt9768 -= i_195_;
	    ((Class178_Sub2) this).anInt9772 -= i_197_;
	    ((Class178_Sub2) this).anInt9771 = i_198_;
	    ((Class178_Sub2) this).anInt9766 = i_199_;
	    aByteArray9770 = is;
	}
    }
    
    public int[] method2631(boolean bool) {
	int[] is;
	if (bool) {
	    int i = method2608();
	    is = new int[i * method2615()];
	    if (aByteArray9773 != null) {
		for (int i_209_ = 0; i_209_ < ((Class178_Sub2) this).anInt9766;
		     i_209_++) {
		    int i_210_ = i_209_ * ((Class178_Sub2) this).anInt9771;
		    int i_211_ = anInt9767 + (i_209_ + anInt9765) * i;
		    for (int i_212_ = 0;
			 i_212_ < ((Class178_Sub2) this).anInt9771; i_212_++) {
			is[i_211_++] = (aByteArray9773[i_210_] << 24
					| (anIntArray9769
					   [aByteArray9770[i_210_] & 0xff]));
			i_210_++;
		    }
		}
	    } else {
		for (int i_213_ = 0; i_213_ < ((Class178_Sub2) this).anInt9766;
		     i_213_++) {
		    int i_214_ = i_213_ * ((Class178_Sub2) this).anInt9771;
		    int i_215_ = anInt9767 + (i_213_ + anInt9765) * i;
		    for (int i_216_ = 0;
			 i_216_ < ((Class178_Sub2) this).anInt9771; i_216_++) {
			int i_217_
			    = anIntArray9769[aByteArray9770[i_214_++] & 0xff];
			if (i_217_ != 0)
			    is[i_215_++] = ~0xffffff | i_217_;
			else
			    is[i_215_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[(((Class178_Sub2) this).anInt9771
			  * ((Class178_Sub2) this).anInt9766)];
	    int i = 0;
	    int i_218_ = 0;
	    if (aByteArray9773 != null) {
		for (int i_219_ = 0; i_219_ < ((Class178_Sub2) this).anInt9766;
		     i_219_++) {
		    for (int i_220_ = 0;
			 i_220_ < ((Class178_Sub2) this).anInt9771; i_220_++) {
			is[i_218_++]
			    = (aByteArray9773[i] << 24
			       | anIntArray9769[aByteArray9770[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_221_ = 0; i_221_ < ((Class178_Sub2) this).anInt9766;
		     i_221_++) {
		    for (int i_222_ = 0;
			 i_222_ < ((Class178_Sub2) this).anInt9771; i_222_++) {
			int i_223_
			    = anIntArray9769[aByteArray9770[i++] & 0xff];
			is[i_218_++] = i_223_ != 0 ? ~0xffffff | i_223_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public int[] method2649(boolean bool) {
	int[] is;
	if (bool) {
	    int i = method2608();
	    is = new int[i * method2615()];
	    if (aByteArray9773 != null) {
		for (int i_224_ = 0; i_224_ < ((Class178_Sub2) this).anInt9766;
		     i_224_++) {
		    int i_225_ = i_224_ * ((Class178_Sub2) this).anInt9771;
		    int i_226_ = anInt9767 + (i_224_ + anInt9765) * i;
		    for (int i_227_ = 0;
			 i_227_ < ((Class178_Sub2) this).anInt9771; i_227_++) {
			is[i_226_++] = (aByteArray9773[i_225_] << 24
					| (anIntArray9769
					   [aByteArray9770[i_225_] & 0xff]));
			i_225_++;
		    }
		}
	    } else {
		for (int i_228_ = 0; i_228_ < ((Class178_Sub2) this).anInt9766;
		     i_228_++) {
		    int i_229_ = i_228_ * ((Class178_Sub2) this).anInt9771;
		    int i_230_ = anInt9767 + (i_228_ + anInt9765) * i;
		    for (int i_231_ = 0;
			 i_231_ < ((Class178_Sub2) this).anInt9771; i_231_++) {
			int i_232_
			    = anIntArray9769[aByteArray9770[i_229_++] & 0xff];
			if (i_232_ != 0)
			    is[i_230_++] = ~0xffffff | i_232_;
			else
			    is[i_230_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[(((Class178_Sub2) this).anInt9771
			  * ((Class178_Sub2) this).anInt9766)];
	    int i = 0;
	    int i_233_ = 0;
	    if (aByteArray9773 != null) {
		for (int i_234_ = 0; i_234_ < ((Class178_Sub2) this).anInt9766;
		     i_234_++) {
		    for (int i_235_ = 0;
			 i_235_ < ((Class178_Sub2) this).anInt9771; i_235_++) {
			is[i_233_++]
			    = (aByteArray9773[i] << 24
			       | anIntArray9769[aByteArray9770[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_236_ = 0; i_236_ < ((Class178_Sub2) this).anInt9766;
		     i_236_++) {
		    for (int i_237_ = 0;
			 i_237_ < ((Class178_Sub2) this).anInt9771; i_237_++) {
			int i_238_
			    = anIntArray9769[aByteArray9770[i++] & 0xff];
			is[i_233_++] = i_238_ != 0 ? ~0xffffff | i_238_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public int[] method2659(boolean bool) {
	int[] is;
	if (bool) {
	    int i = method2608();
	    is = new int[i * method2615()];
	    if (aByteArray9773 != null) {
		for (int i_239_ = 0; i_239_ < ((Class178_Sub2) this).anInt9766;
		     i_239_++) {
		    int i_240_ = i_239_ * ((Class178_Sub2) this).anInt9771;
		    int i_241_ = anInt9767 + (i_239_ + anInt9765) * i;
		    for (int i_242_ = 0;
			 i_242_ < ((Class178_Sub2) this).anInt9771; i_242_++) {
			is[i_241_++] = (aByteArray9773[i_240_] << 24
					| (anIntArray9769
					   [aByteArray9770[i_240_] & 0xff]));
			i_240_++;
		    }
		}
	    } else {
		for (int i_243_ = 0; i_243_ < ((Class178_Sub2) this).anInt9766;
		     i_243_++) {
		    int i_244_ = i_243_ * ((Class178_Sub2) this).anInt9771;
		    int i_245_ = anInt9767 + (i_243_ + anInt9765) * i;
		    for (int i_246_ = 0;
			 i_246_ < ((Class178_Sub2) this).anInt9771; i_246_++) {
			int i_247_
			    = anIntArray9769[aByteArray9770[i_244_++] & 0xff];
			if (i_247_ != 0)
			    is[i_245_++] = ~0xffffff | i_247_;
			else
			    is[i_245_++] = 0;
		    }
		}
	    }
	} else {
	    is = new int[(((Class178_Sub2) this).anInt9771
			  * ((Class178_Sub2) this).anInt9766)];
	    int i = 0;
	    int i_248_ = 0;
	    if (aByteArray9773 != null) {
		for (int i_249_ = 0; i_249_ < ((Class178_Sub2) this).anInt9766;
		     i_249_++) {
		    for (int i_250_ = 0;
			 i_250_ < ((Class178_Sub2) this).anInt9771; i_250_++) {
			is[i_248_++]
			    = (aByteArray9773[i] << 24
			       | anIntArray9769[aByteArray9770[i] & 0xff]);
			i++;
		    }
		}
	    } else {
		for (int i_251_ = 0; i_251_ < ((Class178_Sub2) this).anInt9766;
		     i_251_++) {
		    for (int i_252_ = 0;
			 i_252_ < ((Class178_Sub2) this).anInt9771; i_252_++) {
			int i_253_
			    = anIntArray9769[aByteArray9770[i++] & 0xff];
			is[i_248_++] = i_253_ != 0 ? ~0xffffff | i_253_ : 0;
		    }
		}
	    }
	}
	return is;
    }
    
    public void method2637() {
	((Class178_Sub2) this).anInt9772 = 0;
	anInt9765 = 0;
	((Class178_Sub2) this).anInt9768 = 0;
	anInt9767 = 0;
    }
    
    public void method2638(int i, int i_254_, int i_255_) {
	for (int i_256_ = 1; i_256_ < anIntArray9769.length; i_256_++) {
	    if (anIntArray9769[i_256_] != 1
		&& anIntArray9769[i_256_] != 16711935) {
		int i_257_ = anIntArray9769[i_256_] >> 16 & 0xff;
		i_257_ += i;
		if (i_257_ < 0)
		    i_257_ = 0;
		else if (i_257_ > 255)
		    i_257_ = 255;
		int i_258_ = anIntArray9769[i_256_] >> 8 & 0xff;
		i_258_ += i_254_;
		if (i_258_ < 0)
		    i_258_ = 0;
		else if (i_258_ > 255)
		    i_258_ = 255;
		int i_259_ = anIntArray9769[i_256_] >> 0 & 0xff;
		i_259_ += i_255_;
		if (i_259_ < 0)
		    i_259_ = 0;
		else if (i_259_ > 255)
		    i_259_ = 255;
		anIntArray9769[i_256_] = i_257_ << 16 | i_258_ << 8 | i_259_;
	    }
	}
    }
    
    public void method2653(int i, int i_260_, int i_261_) {
	for (int i_262_ = 1; i_262_ < anIntArray9769.length; i_262_++) {
	    if (anIntArray9769[i_262_] != 1
		&& anIntArray9769[i_262_] != 16711935) {
		int i_263_ = anIntArray9769[i_262_] >> 16 & 0xff;
		i_263_ += i;
		if (i_263_ < 0)
		    i_263_ = 0;
		else if (i_263_ > 255)
		    i_263_ = 255;
		int i_264_ = anIntArray9769[i_262_] >> 8 & 0xff;
		i_264_ += i_260_;
		if (i_264_ < 0)
		    i_264_ = 0;
		else if (i_264_ > 255)
		    i_264_ = 255;
		int i_265_ = anIntArray9769[i_262_] >> 0 & 0xff;
		i_265_ += i_261_;
		if (i_265_ < 0)
		    i_265_ = 0;
		else if (i_265_ > 255)
		    i_265_ = 255;
		anIntArray9769[i_262_] = i_263_ << 16 | i_264_ << 8 | i_265_;
	    }
	}
    }
    
    public void method2654(int i, int i_266_, int i_267_) {
	for (int i_268_ = 1; i_268_ < anIntArray9769.length; i_268_++) {
	    if (anIntArray9769[i_268_] != 1
		&& anIntArray9769[i_268_] != 16711935) {
		int i_269_ = anIntArray9769[i_268_] >> 16 & 0xff;
		i_269_ += i;
		if (i_269_ < 0)
		    i_269_ = 0;
		else if (i_269_ > 255)
		    i_269_ = 255;
		int i_270_ = anIntArray9769[i_268_] >> 8 & 0xff;
		i_270_ += i_266_;
		if (i_270_ < 0)
		    i_270_ = 0;
		else if (i_270_ > 255)
		    i_270_ = 255;
		int i_271_ = anIntArray9769[i_268_] >> 0 & 0xff;
		i_271_ += i_267_;
		if (i_271_ < 0)
		    i_271_ = 0;
		else if (i_271_ > 255)
		    i_271_ = 255;
		anIntArray9769[i_268_] = i_269_ << 16 | i_270_ << 8 | i_271_;
	    }
	}
    }
    
    public void method2655(int i, int i_272_, int i_273_) {
	for (int i_274_ = 1; i_274_ < anIntArray9769.length; i_274_++) {
	    if (anIntArray9769[i_274_] != 1
		&& anIntArray9769[i_274_] != 16711935) {
		int i_275_ = anIntArray9769[i_274_] >> 16 & 0xff;
		i_275_ += i;
		if (i_275_ < 0)
		    i_275_ = 0;
		else if (i_275_ > 255)
		    i_275_ = 255;
		int i_276_ = anIntArray9769[i_274_] >> 8 & 0xff;
		i_276_ += i_272_;
		if (i_276_ < 0)
		    i_276_ = 0;
		else if (i_276_ > 255)
		    i_276_ = 255;
		int i_277_ = anIntArray9769[i_274_] >> 0 & 0xff;
		i_277_ += i_273_;
		if (i_277_ < 0)
		    i_277_ = 0;
		else if (i_277_ > 255)
		    i_277_ = 255;
		anIntArray9769[i_274_] = i_275_ << 16 | i_276_ << 8 | i_277_;
	    }
	}
    }
    
    Class178_Sub2() {
	/* empty */
    }
    
    public void method2616(int i, int i_278_, int i_279_) {
	for (int i_280_ = 1; i_280_ < anIntArray9769.length; i_280_++) {
	    if (anIntArray9769[i_280_] != 1
		&& anIntArray9769[i_280_] != 16711935) {
		int i_281_ = anIntArray9769[i_280_] >> 16 & 0xff;
		i_281_ += i;
		if (i_281_ < 0)
		    i_281_ = 0;
		else if (i_281_ > 255)
		    i_281_ = 255;
		int i_282_ = anIntArray9769[i_280_] >> 8 & 0xff;
		i_282_ += i_278_;
		if (i_282_ < 0)
		    i_282_ = 0;
		else if (i_282_ > 255)
		    i_282_ = 255;
		int i_283_ = anIntArray9769[i_280_] >> 0 & 0xff;
		i_283_ += i_279_;
		if (i_283_ < 0)
		    i_283_ = 0;
		else if (i_283_ > 255)
		    i_283_ = 255;
		anIntArray9769[i_280_] = i_281_ << 16 | i_282_ << 8 | i_283_;
	    }
	}
    }
    
    public int method2601() {
	return ((Class178_Sub2) this).anInt9771;
    }
    
    public void method2639(int i) {
	int i_284_ = method2608();
	int i_285_ = method2615();
	if (((Class178_Sub2) this).anInt9771 != i_284_
	    || ((Class178_Sub2) this).anInt9766 != i_285_) {
	    int i_286_ = i;
	    if (i_286_ > anInt9767)
		i_286_ = anInt9767;
	    int i_287_ = i;
	    if (i_287_ + anInt9767 + ((Class178_Sub2) this).anInt9771 > i_284_)
		i_287_ = i_284_ - anInt9767 - ((Class178_Sub2) this).anInt9771;
	    int i_288_ = i;
	    if (i_288_ > anInt9765)
		i_288_ = anInt9765;
	    int i_289_ = i;
	    if (i_289_ + anInt9765 + ((Class178_Sub2) this).anInt9766 > i_285_)
		i_289_ = i_285_ - anInt9765 - ((Class178_Sub2) this).anInt9766;
	    int i_290_ = ((Class178_Sub2) this).anInt9771 + i_286_ + i_287_;
	    int i_291_ = ((Class178_Sub2) this).anInt9766 + i_288_ + i_289_;
	    byte[] is = new byte[i_290_ * i_291_];
	    if (aByteArray9773 == null) {
		for (int i_292_ = 0; i_292_ < ((Class178_Sub2) this).anInt9766;
		     i_292_++) {
		    int i_293_ = i_292_ * ((Class178_Sub2) this).anInt9771;
		    int i_294_ = (i_292_ + i_288_) * i_290_ + i_286_;
		    for (int i_295_ = 0;
			 i_295_ < ((Class178_Sub2) this).anInt9771; i_295_++)
			is[i_294_++] = aByteArray9770[i_293_++];
		}
	    } else {
		byte[] is_296_ = new byte[i_290_ * i_291_];
		for (int i_297_ = 0; i_297_ < ((Class178_Sub2) this).anInt9766;
		     i_297_++) {
		    int i_298_ = i_297_ * ((Class178_Sub2) this).anInt9771;
		    int i_299_ = (i_297_ + i_288_) * i_290_ + i_286_;
		    for (int i_300_ = 0;
			 i_300_ < ((Class178_Sub2) this).anInt9771; i_300_++) {
			is_296_[i_299_] = aByteArray9773[i_298_];
			is[i_299_++] = aByteArray9770[i_298_++];
		    }
		}
		aByteArray9773 = is_296_;
	    }
	    anInt9767 -= i_286_;
	    anInt9765 -= i_288_;
	    ((Class178_Sub2) this).anInt9768 -= i_287_;
	    ((Class178_Sub2) this).anInt9772 -= i_289_;
	    ((Class178_Sub2) this).anInt9771 = i_290_;
	    ((Class178_Sub2) this).anInt9766 = i_291_;
	    aByteArray9770 = is;
	}
    }
    
    public int method2647() {
	return anInt9765;
    }
}
