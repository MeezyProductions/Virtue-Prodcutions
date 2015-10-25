/* Class178_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class178_Sub1 extends Class178
{
    int[] anIntArray9757;
    int anInt9758;
    int anInt9759;
    int anInt9760;
    int anInt9761;
    int anInt9762;
    int anInt9763;
    boolean aBool9764 = false;
    
    public int method2641() {
	return ((Class178_Sub1) this).anInt9760;
    }
    
    public boolean method2599() {
	return false;
    }
    
    public void method2655(int i, int i_0_, int i_1_) {
	for (int i_2_ = 1; i_2_ < ((Class178_Sub1) this).anIntArray9757.length;
	     i_2_++) {
	    int i_3_
		= ((Class178_Sub1) this).anIntArray9757[i_2_] >> 16 & 0xff;
	    i_3_ += i;
	    if (i_3_ < 0)
		i_3_ = 0;
	    else if (i_3_ > 255)
		i_3_ = 255;
	    int i_4_ = ((Class178_Sub1) this).anIntArray9757[i_2_] >> 8 & 0xff;
	    i_4_ += i_0_;
	    if (i_4_ < 0)
		i_4_ = 0;
	    else if (i_4_ > 255)
		i_4_ = 255;
	    int i_5_ = ((Class178_Sub1) this).anIntArray9757[i_2_] >> 0 & 0xff;
	    i_5_ += i_1_;
	    if (i_5_ < 0)
		i_5_ = 0;
	    else if (i_5_ > 255)
		i_5_ = 255;
	    ((Class178_Sub1) this).anIntArray9757[i_2_]
		= (((Class178_Sub1) this).anIntArray9757[i_2_] & ~0xffffff
		   | i_3_ << 16 | i_4_ << 8 | i_5_);
	}
    }
    
    public int method2656(int i, int i_6_) {
	return (((Class178_Sub1) this).anIntArray9757
		[i + i_6_ * ((Class178_Sub1) this).anInt9760]);
    }
    
    public int method2636() {
	return ((Class178_Sub1) this).anInt9762;
    }
    
    public int method2608() {
	return (((Class178_Sub1) this).anInt9760
		+ ((Class178_Sub1) this).anInt9763
		+ ((Class178_Sub1) this).anInt9761);
    }
    
    public int method2615() {
	return (((Class178_Sub1) this).anInt9759
		+ ((Class178_Sub1) this).anInt9758
		+ ((Class178_Sub1) this).anInt9762);
    }
    
    public int method2603() {
	return ((Class178_Sub1) this).anInt9763;
    }
    
    public int method2604() {
	return ((Class178_Sub1) this).anInt9761;
    }
    
    public int method2605() {
	return ((Class178_Sub1) this).anInt9758;
    }
    
    public int method2606() {
	return ((Class178_Sub1) this).anInt9762;
    }
    
    public void method2621() {
	((Class178_Sub1) this).anInt9762 = 0;
	((Class178_Sub1) this).anInt9758 = 0;
	((Class178_Sub1) this).anInt9761 = 0;
	((Class178_Sub1) this).anInt9763 = 0;
    }
    
    public void method2609(int i) {
	int i_7_ = method2608();
	int i_8_ = method2615();
	if (((Class178_Sub1) this).anInt9760 != i_7_
	    || ((Class178_Sub1) this).anInt9759 != i_8_) {
	    int i_9_ = i;
	    if (i_9_ > ((Class178_Sub1) this).anInt9763)
		i_9_ = ((Class178_Sub1) this).anInt9763;
	    int i_10_ = i;
	    if ((i_10_ + ((Class178_Sub1) this).anInt9763
		 + ((Class178_Sub1) this).anInt9760)
		> i_7_)
		i_10_ = (i_7_ - ((Class178_Sub1) this).anInt9763
			 - ((Class178_Sub1) this).anInt9760);
	    int i_11_ = i;
	    if (i_11_ > ((Class178_Sub1) this).anInt9758)
		i_11_ = ((Class178_Sub1) this).anInt9758;
	    int i_12_ = i;
	    if ((i_12_ + ((Class178_Sub1) this).anInt9758
		 + ((Class178_Sub1) this).anInt9759)
		> i_8_)
		i_12_ = (i_8_ - ((Class178_Sub1) this).anInt9758
			 - ((Class178_Sub1) this).anInt9759);
	    int i_13_ = ((Class178_Sub1) this).anInt9760 + i_9_ + i_10_;
	    int i_14_ = ((Class178_Sub1) this).anInt9759 + i_11_ + i_12_;
	    int[] is = new int[i_13_ * i_14_];
	    ((Class178_Sub1) this).aBool9764 = false;
	    for (int i_15_ = 0; i_15_ < ((Class178_Sub1) this).anInt9759;
		 i_15_++) {
		int i_16_ = i_15_ * ((Class178_Sub1) this).anInt9760;
		int i_17_ = (i_15_ + i_11_) * i_13_ + i_9_;
		for (int i_18_ = 0; i_18_ < ((Class178_Sub1) this).anInt9760;
		     i_18_++) {
		    if ((((Class178_Sub1) this).anIntArray9757[i_16_]
			 & ~0xffffff)
			!= -16777216)
			((Class178_Sub1) this).aBool9764 = true;
		    is[i_17_++]
			= ((Class178_Sub1) this).anIntArray9757[i_16_++];
		}
	    }
	    ((Class178_Sub1) this).anInt9763 -= i_9_;
	    ((Class178_Sub1) this).anInt9758 -= i_11_;
	    ((Class178_Sub1) this).anInt9761 -= i_10_;
	    ((Class178_Sub1) this).anInt9762 -= i_12_;
	    ((Class178_Sub1) this).anInt9760 = i_13_;
	    ((Class178_Sub1) this).anInt9759 = i_14_;
	    ((Class178_Sub1) this).anIntArray9757 = is;
	}
    }
    
    public void method2610(int i) {
	int i_19_ = 0;
	((Class178_Sub1) this).aBool9764 = false;
	int[] is = new int[(((Class178_Sub1) this).anInt9760
			    * ((Class178_Sub1) this).anInt9759)];
	for (int i_20_ = 0; i_20_ < ((Class178_Sub1) this).anInt9759;
	     i_20_++) {
	    for (int i_21_ = 0; i_21_ < ((Class178_Sub1) this).anInt9760;
		 i_21_++) {
		int i_22_ = ((Class178_Sub1) this).anIntArray9757[i_19_];
		if ((i_22_ & ~0xffffff) == 0) {
		    if (i_21_ > 0
			&& (((Class178_Sub1) this).anIntArray9757[i_19_ - 1]
			    & ~0xffffff) != 0)
			i_22_ = i;
		    else if (i_20_ > 0
			     && ((((Class178_Sub1) this).anIntArray9757
				  [i_19_ - ((Class178_Sub1) this).anInt9760])
				 & ~0xffffff) != 0)
			i_22_ = i;
		    else if (i_21_ < ((Class178_Sub1) this).anInt9760 - 1
			     && ((((Class178_Sub1) this).anIntArray9757
				  [i_19_ + 1])
				 & ~0xffffff) != 0)
			i_22_ = i;
		    else if (i_20_ < ((Class178_Sub1) this).anInt9759 - 1
			     && ((((Class178_Sub1) this).anIntArray9757
				  [i_19_ + ((Class178_Sub1) this).anInt9760])
				 & ~0xffffff) != 0)
			i_22_ = i;
		}
		if ((i_22_ & ~0xffffff) != -16777216)
		    ((Class178_Sub1) this).aBool9764 = true;
		is[i_19_++] = i_22_;
	    }
	}
	((Class178_Sub1) this).anIntArray9757 = is;
    }
    
    public int method2632() {
	return ((Class178_Sub1) this).anInt9761;
    }
    
    public void method2645() {
	int[] is = ((Class178_Sub1) this).anIntArray9757;
	for (int i = ((Class178_Sub1) this).anInt9759 - 1; i >= 0; i--) {
	    int i_23_ = i * ((Class178_Sub1) this).anInt9760;
	    for (int i_24_ = (i + 1) * ((Class178_Sub1) this).anInt9760;
		 i_23_ < i_24_; i_23_++) {
		i_24_--;
		int i_25_ = is[i_23_];
		is[i_23_] = is[i_24_];
		is[i_24_] = i_25_;
	    }
	}
	int i = ((Class178_Sub1) this).anInt9763;
	((Class178_Sub1) this).anInt9763 = ((Class178_Sub1) this).anInt9761;
	((Class178_Sub1) this).anInt9761 = i;
    }
    
    public boolean method2650() {
	return ((Class178_Sub1) this).aBool9764;
    }
    
    public boolean method2600() {
	return ((Class178_Sub1) this).aBool9764;
    }
    
    public int[] method2629(boolean bool) {
	if (bool && (method2608() != ((Class178_Sub1) this).anInt9760
		     || method2615() != ((Class178_Sub1) this).anInt9759)) {
	    int i = method2608();
	    int[] is = new int[i * method2615()];
	    for (int i_26_ = 0; i_26_ < ((Class178_Sub1) this).anInt9759;
		 i_26_++) {
		int i_27_ = i_26_ * ((Class178_Sub1) this).anInt9760;
		int i_28_ = (((Class178_Sub1) this).anInt9763
			     + (i_26_ + ((Class178_Sub1) this).anInt9758) * i);
		for (int i_29_ = 0; i_29_ < ((Class178_Sub1) this).anInt9760;
		     i_29_++) {
		    is[i_28_++] = ((Class178_Sub1) this).anIntArray9757[i_27_];
		    i_27_++;
		}
	    }
	    return is;
	}
	return ((Class178_Sub1) this).anIntArray9757;
    }
    
    public void method2623() {
	int[] is = ((Class178_Sub1) this).anIntArray9757;
	for (int i = ((Class178_Sub1) this).anInt9759 - 1; i >= 0; i--) {
	    int i_30_ = i * ((Class178_Sub1) this).anInt9760;
	    for (int i_31_ = (i + 1) * ((Class178_Sub1) this).anInt9760;
		 i_30_ < i_31_; i_30_++) {
		i_31_--;
		int i_32_ = is[i_30_];
		is[i_30_] = is[i_31_];
		is[i_31_] = i_32_;
	    }
	}
	int i = ((Class178_Sub1) this).anInt9763;
	((Class178_Sub1) this).anInt9763 = ((Class178_Sub1) this).anInt9761;
	((Class178_Sub1) this).anInt9761 = i;
    }
    
    public int method2617(int i, int i_33_) {
	return (((Class178_Sub1) this).anIntArray9757
		[i + i_33_ * ((Class178_Sub1) this).anInt9760]);
    }
    
    public boolean method2618() {
	return false;
    }
    
    public boolean method2620() {
	return false;
    }
    
    public void method2648() {
	int[] is = new int[(((Class178_Sub1) this).anInt9760
			    * ((Class178_Sub1) this).anInt9759)];
	int i = 0;
	for (int i_34_ = 0; i_34_ < ((Class178_Sub1) this).anInt9760;
	     i_34_++) {
	    for (int i_35_ = ((Class178_Sub1) this).anInt9759 - 1; i_35_ >= 0;
		 i_35_--)
		is[i++] = (((Class178_Sub1) this).anIntArray9757
			   [i_34_ + i_35_ * ((Class178_Sub1) this).anInt9760]);
	}
	((Class178_Sub1) this).anIntArray9757 = is;
	int i_36_ = ((Class178_Sub1) this).anInt9758;
	((Class178_Sub1) this).anInt9758 = ((Class178_Sub1) this).anInt9763;
	((Class178_Sub1) this).anInt9763 = ((Class178_Sub1) this).anInt9762;
	((Class178_Sub1) this).anInt9762 = ((Class178_Sub1) this).anInt9761;
	((Class178_Sub1) this).anInt9761 = i_36_;
	i_36_ = ((Class178_Sub1) this).anInt9759;
	((Class178_Sub1) this).anInt9759 = ((Class178_Sub1) this).anInt9760;
	((Class178_Sub1) this).anInt9760 = i_36_;
    }
    
    public void method2639(int i) {
	int i_37_ = method2608();
	int i_38_ = method2615();
	if (((Class178_Sub1) this).anInt9760 != i_37_
	    || ((Class178_Sub1) this).anInt9759 != i_38_) {
	    int i_39_ = i;
	    if (i_39_ > ((Class178_Sub1) this).anInt9763)
		i_39_ = ((Class178_Sub1) this).anInt9763;
	    int i_40_ = i;
	    if ((i_40_ + ((Class178_Sub1) this).anInt9763
		 + ((Class178_Sub1) this).anInt9760)
		> i_37_)
		i_40_ = (i_37_ - ((Class178_Sub1) this).anInt9763
			 - ((Class178_Sub1) this).anInt9760);
	    int i_41_ = i;
	    if (i_41_ > ((Class178_Sub1) this).anInt9758)
		i_41_ = ((Class178_Sub1) this).anInt9758;
	    int i_42_ = i;
	    if ((i_42_ + ((Class178_Sub1) this).anInt9758
		 + ((Class178_Sub1) this).anInt9759)
		> i_38_)
		i_42_ = (i_38_ - ((Class178_Sub1) this).anInt9758
			 - ((Class178_Sub1) this).anInt9759);
	    int i_43_ = ((Class178_Sub1) this).anInt9760 + i_39_ + i_40_;
	    int i_44_ = ((Class178_Sub1) this).anInt9759 + i_41_ + i_42_;
	    int[] is = new int[i_43_ * i_44_];
	    ((Class178_Sub1) this).aBool9764 = false;
	    for (int i_45_ = 0; i_45_ < ((Class178_Sub1) this).anInt9759;
		 i_45_++) {
		int i_46_ = i_45_ * ((Class178_Sub1) this).anInt9760;
		int i_47_ = (i_45_ + i_41_) * i_43_ + i_39_;
		for (int i_48_ = 0; i_48_ < ((Class178_Sub1) this).anInt9760;
		     i_48_++) {
		    if ((((Class178_Sub1) this).anIntArray9757[i_46_]
			 & ~0xffffff)
			!= -16777216)
			((Class178_Sub1) this).aBool9764 = true;
		    is[i_47_++]
			= ((Class178_Sub1) this).anIntArray9757[i_46_++];
		}
	    }
	    ((Class178_Sub1) this).anInt9763 -= i_39_;
	    ((Class178_Sub1) this).anInt9758 -= i_41_;
	    ((Class178_Sub1) this).anInt9761 -= i_40_;
	    ((Class178_Sub1) this).anInt9762 -= i_42_;
	    ((Class178_Sub1) this).anInt9760 = i_43_;
	    ((Class178_Sub1) this).anInt9759 = i_44_;
	    ((Class178_Sub1) this).anIntArray9757 = is;
	}
    }
    
    public int method2628() {
	return (((Class178_Sub1) this).anInt9759
		+ ((Class178_Sub1) this).anInt9758
		+ ((Class178_Sub1) this).anInt9762);
    }
    
    public int[] method2649(boolean bool) {
	if (bool && (method2608() != ((Class178_Sub1) this).anInt9760
		     || method2615() != ((Class178_Sub1) this).anInt9759)) {
	    int i = method2608();
	    int[] is = new int[i * method2615()];
	    for (int i_49_ = 0; i_49_ < ((Class178_Sub1) this).anInt9759;
		 i_49_++) {
		int i_50_ = i_49_ * ((Class178_Sub1) this).anInt9760;
		int i_51_ = (((Class178_Sub1) this).anInt9763
			     + (i_49_ + ((Class178_Sub1) this).anInt9758) * i);
		for (int i_52_ = 0; i_52_ < ((Class178_Sub1) this).anInt9760;
		     i_52_++) {
		    is[i_51_++] = ((Class178_Sub1) this).anIntArray9757[i_50_];
		    i_50_++;
		}
	    }
	    return is;
	}
	return ((Class178_Sub1) this).anIntArray9757;
    }
    
    public int method2619() {
	return ((Class178_Sub1) this).anInt9759;
    }
    
    public int method2633() {
	return (((Class178_Sub1) this).anInt9760
		+ ((Class178_Sub1) this).anInt9763
		+ ((Class178_Sub1) this).anInt9761);
    }
    
    public void method2616(int i, int i_53_, int i_54_) {
	for (int i_55_ = 1;
	     i_55_ < ((Class178_Sub1) this).anIntArray9757.length; i_55_++) {
	    int i_56_
		= ((Class178_Sub1) this).anIntArray9757[i_55_] >> 16 & 0xff;
	    i_56_ += i;
	    if (i_56_ < 0)
		i_56_ = 0;
	    else if (i_56_ > 255)
		i_56_ = 255;
	    int i_57_
		= ((Class178_Sub1) this).anIntArray9757[i_55_] >> 8 & 0xff;
	    i_57_ += i_53_;
	    if (i_57_ < 0)
		i_57_ = 0;
	    else if (i_57_ > 255)
		i_57_ = 255;
	    int i_58_
		= ((Class178_Sub1) this).anIntArray9757[i_55_] >> 0 & 0xff;
	    i_58_ += i_54_;
	    if (i_58_ < 0)
		i_58_ = 0;
	    else if (i_58_ > 255)
		i_58_ = 255;
	    ((Class178_Sub1) this).anIntArray9757[i_55_]
		= (((Class178_Sub1) this).anIntArray9757[i_55_] & ~0xffffff
		   | i_56_ << 16 | i_57_ << 8 | i_58_);
	}
    }
    
    public int method2627() {
	return (((Class178_Sub1) this).anInt9759
		+ ((Class178_Sub1) this).anInt9758
		+ ((Class178_Sub1) this).anInt9762);
    }
    
    public int method2626() {
	return (((Class178_Sub1) this).anInt9760
		+ ((Class178_Sub1) this).anInt9763
		+ ((Class178_Sub1) this).anInt9761);
    }
    
    public int method2624() {
	return ((Class178_Sub1) this).anInt9763;
    }
    
    public int method2630() {
	return ((Class178_Sub1) this).anInt9763;
    }
    
    public int method2614() {
	return ((Class178_Sub1) this).anInt9761;
    }
    
    public void method2611(int i) {
	for (int i_59_ = ((Class178_Sub1) this).anInt9759 - 1; i_59_ > 0;
	     i_59_--) {
	    int i_60_ = i_59_ * ((Class178_Sub1) this).anInt9760;
	    for (int i_61_ = ((Class178_Sub1) this).anInt9760 - 1; i_61_ > 0;
		 i_61_--) {
		if ((((Class178_Sub1) this).anIntArray9757[i_61_ + i_60_]
		     & ~0xffffff) == 0
		    && ((((Class178_Sub1) this).anIntArray9757
			 [(i_61_ + i_60_ - 1
			   - ((Class178_Sub1) this).anInt9760)])
			& ~0xffffff) != 0)
		    ((Class178_Sub1) this).anIntArray9757[i_61_ + i_60_] = i;
	    }
	}
    }
    
    public int method2612() {
	return ((Class178_Sub1) this).anInt9761;
    }
    
    public int method2634() {
	return ((Class178_Sub1) this).anInt9761;
    }
    
    public int method2657() {
	return ((Class178_Sub1) this).anInt9762;
    }
    
    public void method2652(int i) {
	int i_62_ = 0;
	((Class178_Sub1) this).aBool9764 = false;
	int[] is = new int[(((Class178_Sub1) this).anInt9760
			    * ((Class178_Sub1) this).anInt9759)];
	for (int i_63_ = 0; i_63_ < ((Class178_Sub1) this).anInt9759;
	     i_63_++) {
	    for (int i_64_ = 0; i_64_ < ((Class178_Sub1) this).anInt9760;
		 i_64_++) {
		int i_65_ = ((Class178_Sub1) this).anIntArray9757[i_62_];
		if ((i_65_ & ~0xffffff) == 0) {
		    if (i_64_ > 0
			&& (((Class178_Sub1) this).anIntArray9757[i_62_ - 1]
			    & ~0xffffff) != 0)
			i_65_ = i;
		    else if (i_63_ > 0
			     && ((((Class178_Sub1) this).anIntArray9757
				  [i_62_ - ((Class178_Sub1) this).anInt9760])
				 & ~0xffffff) != 0)
			i_65_ = i;
		    else if (i_64_ < ((Class178_Sub1) this).anInt9760 - 1
			     && ((((Class178_Sub1) this).anIntArray9757
				  [i_62_ + 1])
				 & ~0xffffff) != 0)
			i_65_ = i;
		    else if (i_63_ < ((Class178_Sub1) this).anInt9759 - 1
			     && ((((Class178_Sub1) this).anIntArray9757
				  [i_62_ + ((Class178_Sub1) this).anInt9760])
				 & ~0xffffff) != 0)
			i_65_ = i;
		}
		if ((i_65_ & ~0xffffff) != -16777216)
		    ((Class178_Sub1) this).aBool9764 = true;
		is[i_62_++] = i_65_;
	    }
	}
	((Class178_Sub1) this).anIntArray9757 = is;
    }
    
    public void method2637() {
	((Class178_Sub1) this).anInt9762 = 0;
	((Class178_Sub1) this).anInt9758 = 0;
	((Class178_Sub1) this).anInt9761 = 0;
	((Class178_Sub1) this).anInt9763 = 0;
    }
    
    public void method2640() {
	((Class178_Sub1) this).anInt9762 = 0;
	((Class178_Sub1) this).anInt9758 = 0;
	((Class178_Sub1) this).anInt9761 = 0;
	((Class178_Sub1) this).anInt9763 = 0;
    }
    
    public int method2622() {
	return ((Class178_Sub1) this).anInt9759;
    }
    
    public void method2598(int i) {
	int i_66_ = method2608();
	int i_67_ = method2615();
	if (((Class178_Sub1) this).anInt9760 != i_66_
	    || ((Class178_Sub1) this).anInt9759 != i_67_) {
	    int i_68_ = i;
	    if (i_68_ > ((Class178_Sub1) this).anInt9763)
		i_68_ = ((Class178_Sub1) this).anInt9763;
	    int i_69_ = i;
	    if ((i_69_ + ((Class178_Sub1) this).anInt9763
		 + ((Class178_Sub1) this).anInt9760)
		> i_66_)
		i_69_ = (i_66_ - ((Class178_Sub1) this).anInt9763
			 - ((Class178_Sub1) this).anInt9760);
	    int i_70_ = i;
	    if (i_70_ > ((Class178_Sub1) this).anInt9758)
		i_70_ = ((Class178_Sub1) this).anInt9758;
	    int i_71_ = i;
	    if ((i_71_ + ((Class178_Sub1) this).anInt9758
		 + ((Class178_Sub1) this).anInt9759)
		> i_67_)
		i_71_ = (i_67_ - ((Class178_Sub1) this).anInt9758
			 - ((Class178_Sub1) this).anInt9759);
	    int i_72_ = ((Class178_Sub1) this).anInt9760 + i_68_ + i_69_;
	    int i_73_ = ((Class178_Sub1) this).anInt9759 + i_70_ + i_71_;
	    int[] is = new int[i_72_ * i_73_];
	    ((Class178_Sub1) this).aBool9764 = false;
	    for (int i_74_ = 0; i_74_ < ((Class178_Sub1) this).anInt9759;
		 i_74_++) {
		int i_75_ = i_74_ * ((Class178_Sub1) this).anInt9760;
		int i_76_ = (i_74_ + i_70_) * i_72_ + i_68_;
		for (int i_77_ = 0; i_77_ < ((Class178_Sub1) this).anInt9760;
		     i_77_++) {
		    if ((((Class178_Sub1) this).anIntArray9757[i_75_]
			 & ~0xffffff)
			!= -16777216)
			((Class178_Sub1) this).aBool9764 = true;
		    is[i_76_++]
			= ((Class178_Sub1) this).anIntArray9757[i_75_++];
		}
	    }
	    ((Class178_Sub1) this).anInt9763 -= i_68_;
	    ((Class178_Sub1) this).anInt9758 -= i_70_;
	    ((Class178_Sub1) this).anInt9761 -= i_69_;
	    ((Class178_Sub1) this).anInt9762 -= i_71_;
	    ((Class178_Sub1) this).anInt9760 = i_72_;
	    ((Class178_Sub1) this).anInt9759 = i_73_;
	    ((Class178_Sub1) this).anIntArray9757 = is;
	}
    }
    
    Class178_Sub1(int i, int i_78_, int[] is) {
	((Class178_Sub1) this).anInt9760 = i;
	((Class178_Sub1) this).anInt9759 = i_78_;
	((Class178_Sub1) this).anIntArray9757 = is;
	for (int i_79_ = 0;
	     i_79_ < ((Class178_Sub1) this).anIntArray9757.length; i_79_++) {
	    if ((((Class178_Sub1) this).anIntArray9757[i_79_] & ~0xffffff)
		!= -16777216) {
		((Class178_Sub1) this).aBool9764 = true;
		break;
	    }
	}
    }
    
    public void method2642(int i) {
	int i_80_ = 0;
	((Class178_Sub1) this).aBool9764 = false;
	int[] is = new int[(((Class178_Sub1) this).anInt9760
			    * ((Class178_Sub1) this).anInt9759)];
	for (int i_81_ = 0; i_81_ < ((Class178_Sub1) this).anInt9759;
	     i_81_++) {
	    for (int i_82_ = 0; i_82_ < ((Class178_Sub1) this).anInt9760;
		 i_82_++) {
		int i_83_ = ((Class178_Sub1) this).anIntArray9757[i_80_];
		if ((i_83_ & ~0xffffff) == 0) {
		    if (i_82_ > 0
			&& (((Class178_Sub1) this).anIntArray9757[i_80_ - 1]
			    & ~0xffffff) != 0)
			i_83_ = i;
		    else if (i_81_ > 0
			     && ((((Class178_Sub1) this).anIntArray9757
				  [i_80_ - ((Class178_Sub1) this).anInt9760])
				 & ~0xffffff) != 0)
			i_83_ = i;
		    else if (i_82_ < ((Class178_Sub1) this).anInt9760 - 1
			     && ((((Class178_Sub1) this).anIntArray9757
				  [i_80_ + 1])
				 & ~0xffffff) != 0)
			i_83_ = i;
		    else if (i_81_ < ((Class178_Sub1) this).anInt9759 - 1
			     && ((((Class178_Sub1) this).anIntArray9757
				  [i_80_ + ((Class178_Sub1) this).anInt9760])
				 & ~0xffffff) != 0)
			i_83_ = i;
		}
		if ((i_83_ & ~0xffffff) != -16777216)
		    ((Class178_Sub1) this).aBool9764 = true;
		is[i_80_++] = i_83_;
	    }
	}
	((Class178_Sub1) this).anIntArray9757 = is;
    }
    
    public void method2643(int i) {
	for (int i_84_ = ((Class178_Sub1) this).anInt9759 - 1; i_84_ > 0;
	     i_84_--) {
	    int i_85_ = i_84_ * ((Class178_Sub1) this).anInt9760;
	    for (int i_86_ = ((Class178_Sub1) this).anInt9760 - 1; i_86_ > 0;
		 i_86_--) {
		if ((((Class178_Sub1) this).anIntArray9757[i_86_ + i_85_]
		     & ~0xffffff) == 0
		    && ((((Class178_Sub1) this).anIntArray9757
			 [(i_86_ + i_85_ - 1
			   - ((Class178_Sub1) this).anInt9760)])
			& ~0xffffff) != 0)
		    ((Class178_Sub1) this).anIntArray9757[i_86_ + i_85_] = i;
	    }
	}
    }
    
    public void method2644() {
	int[] is = ((Class178_Sub1) this).anIntArray9757;
	for (int i = ((Class178_Sub1) this).anInt9759 - 1; i >= 0; i--) {
	    int i_87_ = i * ((Class178_Sub1) this).anInt9760;
	    for (int i_88_ = (i + 1) * ((Class178_Sub1) this).anInt9760;
		 i_87_ < i_88_; i_87_++) {
		i_88_--;
		int i_89_ = is[i_87_];
		is[i_87_] = is[i_88_];
		is[i_88_] = i_89_;
	    }
	}
	int i = ((Class178_Sub1) this).anInt9763;
	((Class178_Sub1) this).anInt9763 = ((Class178_Sub1) this).anInt9761;
	((Class178_Sub1) this).anInt9761 = i;
    }
    
    public int method2601() {
	return ((Class178_Sub1) this).anInt9760;
    }
    
    public void method2646() {
	int[] is = ((Class178_Sub1) this).anIntArray9757;
	for (int i = ((Class178_Sub1) this).anInt9759 - 1; i >= 0; i--) {
	    int i_90_ = i * ((Class178_Sub1) this).anInt9760;
	    for (int i_91_ = (i + 1) * ((Class178_Sub1) this).anInt9760;
		 i_90_ < i_91_; i_90_++) {
		i_91_--;
		int i_92_ = is[i_90_];
		is[i_90_] = is[i_91_];
		is[i_91_] = i_92_;
	    }
	}
	int i = ((Class178_Sub1) this).anInt9763;
	((Class178_Sub1) this).anInt9763 = ((Class178_Sub1) this).anInt9761;
	((Class178_Sub1) this).anInt9761 = i;
    }
    
    public void method2635() {
	int[] is = new int[(((Class178_Sub1) this).anInt9760
			    * ((Class178_Sub1) this).anInt9759)];
	int i = 0;
	for (int i_93_ = 0; i_93_ < ((Class178_Sub1) this).anInt9760;
	     i_93_++) {
	    for (int i_94_ = ((Class178_Sub1) this).anInt9759 - 1; i_94_ >= 0;
		 i_94_--)
		is[i++] = (((Class178_Sub1) this).anIntArray9757
			   [i_93_ + i_94_ * ((Class178_Sub1) this).anInt9760]);
	}
	((Class178_Sub1) this).anIntArray9757 = is;
	int i_95_ = ((Class178_Sub1) this).anInt9758;
	((Class178_Sub1) this).anInt9758 = ((Class178_Sub1) this).anInt9763;
	((Class178_Sub1) this).anInt9763 = ((Class178_Sub1) this).anInt9762;
	((Class178_Sub1) this).anInt9762 = ((Class178_Sub1) this).anInt9761;
	((Class178_Sub1) this).anInt9761 = i_95_;
	i_95_ = ((Class178_Sub1) this).anInt9759;
	((Class178_Sub1) this).anInt9759 = ((Class178_Sub1) this).anInt9760;
	((Class178_Sub1) this).anInt9760 = i_95_;
    }
    
    public int[] method2631(boolean bool) {
	if (bool && (method2608() != ((Class178_Sub1) this).anInt9760
		     || method2615() != ((Class178_Sub1) this).anInt9759)) {
	    int i = method2608();
	    int[] is = new int[i * method2615()];
	    for (int i_96_ = 0; i_96_ < ((Class178_Sub1) this).anInt9759;
		 i_96_++) {
		int i_97_ = i_96_ * ((Class178_Sub1) this).anInt9760;
		int i_98_ = (((Class178_Sub1) this).anInt9763
			     + (i_96_ + ((Class178_Sub1) this).anInt9758) * i);
		for (int i_99_ = 0; i_99_ < ((Class178_Sub1) this).anInt9760;
		     i_99_++) {
		    is[i_98_++] = ((Class178_Sub1) this).anIntArray9757[i_97_];
		    i_97_++;
		}
	    }
	    return is;
	}
	return ((Class178_Sub1) this).anIntArray9757;
    }
    
    public int method2602() {
	return ((Class178_Sub1) this).anInt9759;
    }
    
    public int[] method2659(boolean bool) {
	if (bool && (method2608() != ((Class178_Sub1) this).anInt9760
		     || method2615() != ((Class178_Sub1) this).anInt9759)) {
	    int i = method2608();
	    int[] is = new int[i * method2615()];
	    for (int i_100_ = 0; i_100_ < ((Class178_Sub1) this).anInt9759;
		 i_100_++) {
		int i_101_ = i_100_ * ((Class178_Sub1) this).anInt9760;
		int i_102_
		    = (((Class178_Sub1) this).anInt9763
		       + (i_100_ + ((Class178_Sub1) this).anInt9758) * i);
		for (int i_103_ = 0; i_103_ < ((Class178_Sub1) this).anInt9760;
		     i_103_++) {
		    is[i_102_++]
			= ((Class178_Sub1) this).anIntArray9757[i_101_];
		    i_101_++;
		}
	    }
	    return is;
	}
	return ((Class178_Sub1) this).anIntArray9757;
    }
    
    public void method2651(int i, int i_104_, int i_105_) {
	for (int i_106_ = 1;
	     i_106_ < ((Class178_Sub1) this).anIntArray9757.length; i_106_++) {
	    int i_107_
		= ((Class178_Sub1) this).anIntArray9757[i_106_] >> 16 & 0xff;
	    i_107_ += i;
	    if (i_107_ < 0)
		i_107_ = 0;
	    else if (i_107_ > 255)
		i_107_ = 255;
	    int i_108_
		= ((Class178_Sub1) this).anIntArray9757[i_106_] >> 8 & 0xff;
	    i_108_ += i_104_;
	    if (i_108_ < 0)
		i_108_ = 0;
	    else if (i_108_ > 255)
		i_108_ = 255;
	    int i_109_
		= ((Class178_Sub1) this).anIntArray9757[i_106_] >> 0 & 0xff;
	    i_109_ += i_105_;
	    if (i_109_ < 0)
		i_109_ = 0;
	    else if (i_109_ > 255)
		i_109_ = 255;
	    ((Class178_Sub1) this).anIntArray9757[i_106_]
		= (((Class178_Sub1) this).anIntArray9757[i_106_] & ~0xffffff
		   | i_107_ << 16 | i_108_ << 8 | i_109_);
	}
    }
    
    public void method2638(int i, int i_110_, int i_111_) {
	for (int i_112_ = 1;
	     i_112_ < ((Class178_Sub1) this).anIntArray9757.length; i_112_++) {
	    int i_113_
		= ((Class178_Sub1) this).anIntArray9757[i_112_] >> 16 & 0xff;
	    i_113_ += i;
	    if (i_113_ < 0)
		i_113_ = 0;
	    else if (i_113_ > 255)
		i_113_ = 255;
	    int i_114_
		= ((Class178_Sub1) this).anIntArray9757[i_112_] >> 8 & 0xff;
	    i_114_ += i_110_;
	    if (i_114_ < 0)
		i_114_ = 0;
	    else if (i_114_ > 255)
		i_114_ = 255;
	    int i_115_
		= ((Class178_Sub1) this).anIntArray9757[i_112_] >> 0 & 0xff;
	    i_115_ += i_111_;
	    if (i_115_ < 0)
		i_115_ = 0;
	    else if (i_115_ > 255)
		i_115_ = 255;
	    ((Class178_Sub1) this).anIntArray9757[i_112_]
		= (((Class178_Sub1) this).anIntArray9757[i_112_] & ~0xffffff
		   | i_113_ << 16 | i_114_ << 8 | i_115_);
	}
    }
    
    public void method2653(int i, int i_116_, int i_117_) {
	for (int i_118_ = 1;
	     i_118_ < ((Class178_Sub1) this).anIntArray9757.length; i_118_++) {
	    int i_119_
		= ((Class178_Sub1) this).anIntArray9757[i_118_] >> 16 & 0xff;
	    i_119_ += i;
	    if (i_119_ < 0)
		i_119_ = 0;
	    else if (i_119_ > 255)
		i_119_ = 255;
	    int i_120_
		= ((Class178_Sub1) this).anIntArray9757[i_118_] >> 8 & 0xff;
	    i_120_ += i_116_;
	    if (i_120_ < 0)
		i_120_ = 0;
	    else if (i_120_ > 255)
		i_120_ = 255;
	    int i_121_
		= ((Class178_Sub1) this).anIntArray9757[i_118_] >> 0 & 0xff;
	    i_121_ += i_117_;
	    if (i_121_ < 0)
		i_121_ = 0;
	    else if (i_121_ > 255)
		i_121_ = 255;
	    ((Class178_Sub1) this).anIntArray9757[i_118_]
		= (((Class178_Sub1) this).anIntArray9757[i_118_] & ~0xffffff
		   | i_119_ << 16 | i_120_ << 8 | i_121_);
	}
    }
    
    public void method2654(int i, int i_122_, int i_123_) {
	for (int i_124_ = 1;
	     i_124_ < ((Class178_Sub1) this).anIntArray9757.length; i_124_++) {
	    int i_125_
		= ((Class178_Sub1) this).anIntArray9757[i_124_] >> 16 & 0xff;
	    i_125_ += i;
	    if (i_125_ < 0)
		i_125_ = 0;
	    else if (i_125_ > 255)
		i_125_ = 255;
	    int i_126_
		= ((Class178_Sub1) this).anIntArray9757[i_124_] >> 8 & 0xff;
	    i_126_ += i_122_;
	    if (i_126_ < 0)
		i_126_ = 0;
	    else if (i_126_ > 255)
		i_126_ = 255;
	    int i_127_
		= ((Class178_Sub1) this).anIntArray9757[i_124_] >> 0 & 0xff;
	    i_127_ += i_123_;
	    if (i_127_ < 0)
		i_127_ = 0;
	    else if (i_127_ > 255)
		i_127_ = 255;
	    ((Class178_Sub1) this).anIntArray9757[i_124_]
		= (((Class178_Sub1) this).anIntArray9757[i_124_] & ~0xffffff
		   | i_125_ << 16 | i_126_ << 8 | i_127_);
	}
    }
    
    public int method2625() {
	return ((Class178_Sub1) this).anInt9759;
    }
    
    public int method2647() {
	return ((Class178_Sub1) this).anInt9758;
    }
    
    public int method2607(int i, int i_128_) {
	return (((Class178_Sub1) this).anIntArray9757
		[i + i_128_ * ((Class178_Sub1) this).anInt9760]);
    }
    
    public void method2658() {
	int[] is = ((Class178_Sub1) this).anIntArray9757;
	for (int i = (((Class178_Sub1) this).anInt9759 >> 1) - 1; i >= 0;
	     i--) {
	    int i_129_ = i * ((Class178_Sub1) this).anInt9760;
	    int i_130_ = ((((Class178_Sub1) this).anInt9759 - i - 1)
			  * ((Class178_Sub1) this).anInt9760);
	    for (int i_131_ = -((Class178_Sub1) this).anInt9760; i_131_ < 0;
		 i_131_++) {
		int i_132_ = is[i_129_];
		is[i_129_] = is[i_130_];
		is[i_130_] = i_132_;
		i_129_++;
		i_130_++;
	    }
	}
	int i = ((Class178_Sub1) this).anInt9758;
	((Class178_Sub1) this).anInt9758 = ((Class178_Sub1) this).anInt9762;
	((Class178_Sub1) this).anInt9762 = i;
    }
    
    public int method2660() {
	return ((Class178_Sub1) this).anInt9758;
    }
    
    public void method2613() {
	int[] is = ((Class178_Sub1) this).anIntArray9757;
	for (int i = (((Class178_Sub1) this).anInt9759 >> 1) - 1; i >= 0;
	     i--) {
	    int i_133_ = i * ((Class178_Sub1) this).anInt9760;
	    int i_134_ = ((((Class178_Sub1) this).anInt9759 - i - 1)
			  * ((Class178_Sub1) this).anInt9760);
	    for (int i_135_ = -((Class178_Sub1) this).anInt9760; i_135_ < 0;
		 i_135_++) {
		int i_136_ = is[i_133_];
		is[i_133_] = is[i_134_];
		is[i_134_] = i_136_;
		i_133_++;
		i_134_++;
	    }
	}
	int i = ((Class178_Sub1) this).anInt9758;
	((Class178_Sub1) this).anInt9758 = ((Class178_Sub1) this).anInt9762;
	((Class178_Sub1) this).anInt9762 = i;
    }
}
