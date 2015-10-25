/* Class151_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class151_Sub2 extends Class151
{
    int anInt8904;
    int anInt8905;
    Interface19 anInterface19_8906;
    int anInt8907;
    int anInt8908;
    Class173_Sub1 aClass173_Sub1_8909;
    boolean aBool8910 = false;
    boolean aBool8911;
    int anInt8912;
    Interface34 anInterface34_8913;
    int anInt8914 = 0;
    boolean aBool8915;
    boolean aBool8916;
    boolean aBool8917;
    
    public void method1780(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575) {
	    i += ((Class151_Sub2) this).anInt8907;
	    i_0_ += ((Class151_Sub2) this).anInt8914;
	    ((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		.aClass371_9321.method4653
		((float) i, (float) i_0_,
		 (float) (i + ((Class151_Sub2) this).anInt8904),
		 (float) (i_0_ + ((Class151_Sub2) this).anInt8908), 0.0F, 0.0F,
		 ((Class151_Sub2) this).anInterface34_8913.method245(),
		 ((Class151_Sub2) this).anInterface34_8913.method217(),
		 ((Class151_Sub2) this).anInterface34_8913, i_2_);
	} else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_3_);
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i_1_, i_2_);
	    i += ((Class151_Sub2) this).anInt8907;
	    i_0_ += ((Class151_Sub2) this).anInt8914;
	    float f
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -119).method2074();
	    float f_4_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -13).method2070();
	    class321.aClass418_3470.method4976
		((float) ((Class151_Sub2) this).anInt8904 * 2.0F / f,
		 (float) ((Class151_Sub2) this).anInt8908 * 2.0F / f_4_, 1.0F,
		 1.0F);
	    class321.aClass418_3470.aFloatArray4768[12]
		= (((float) i
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= (((float) i_0_
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_4_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method4976
		(((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 1.0F, 1.0F);
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    class321.method4206();
	}
    }
    
    Class151_Sub2(Class173_Sub1 class173_sub1, Interface34 interface34, int i,
		  int i_5_) {
	((Class151_Sub2) this).anInt8907 = 0;
	((Class151_Sub2) this).anInt8912 = 0;
	((Class151_Sub2) this).anInt8905 = 0;
	((Class151_Sub2) this).aClass173_Sub1_8909 = class173_sub1;
	((Class151_Sub2) this).anInt8904 = i;
	((Class151_Sub2) this).anInt8908 = i_5_;
	((Class151_Sub2) this).anInterface34_8913 = interface34;
	((Class151_Sub2) this).anInterface19_8906 = null;
	((Class151_Sub2) this).aBool8911
	    = ((Class151_Sub2) this).anInterface34_8913.method1() != i;
	((Class151_Sub2) this).aBool8915
	    = ((Class151_Sub2) this).anInterface34_8913.method68() != i_5_;
	((Class151_Sub2) this).aBool8916
	    = (!((Class151_Sub2) this).aBool8911
	       && ((Class151_Sub2) this).anInterface34_8913.method232());
	((Class151_Sub2) this).aBool8917
	    = (!((Class151_Sub2) this).aBool8915
	       && ((Class151_Sub2) this).anInterface34_8913.method232());
    }
    
    Class151_Sub2(Class173_Sub1 class173_sub1, Interface34 interface34) {
	this(class173_sub1, interface34, interface34.method1(),
	     interface34.method68());
    }
    
    Class151_Sub2(Class173_Sub1 class173_sub1, int i, int i_6_, boolean bool,
		  boolean bool_7_) {
	((Class151_Sub2) this).anInt8907 = 0;
	((Class151_Sub2) this).anInt8912 = 0;
	((Class151_Sub2) this).anInt8905 = 0;
	((Class151_Sub2) this).aClass173_Sub1_8909 = class173_sub1;
	((Class151_Sub2) this).anInt8904 = i;
	((Class151_Sub2) this).anInt8908 = i_6_;
	if (bool_7_) {
	    Interface43 interface43
		= class173_sub1.method8525((bool ? Class149.aClass149_1676
					    : Class149.aClass149_1684),
					   Class169.aClass169_1935, i, i_6_);
	    ((Class151_Sub2) this).anInterface19_8906
		= interface43.method320(0);
	    ((Class151_Sub2) this).anInterface34_8913 = interface43;
	} else {
	    ((Class151_Sub2) this).anInterface34_8913
		= class173_sub1.method8519((bool ? Class149.aClass149_1676
					    : Class149.aClass149_1684),
					   Class169.aClass169_1935, i, i_6_);
	    ((Class151_Sub2) this).anInterface19_8906 = null;
	}
	((Class151_Sub2) this).anInterface34_8913.method220(true, true);
	((Class151_Sub2) this).aBool8911
	    = ((Class151_Sub2) this).anInterface34_8913.method1() != i;
	((Class151_Sub2) this).aBool8915
	    = ((Class151_Sub2) this).anInterface34_8913.method68() != i_6_;
	((Class151_Sub2) this).aBool8916
	    = (!((Class151_Sub2) this).aBool8911
	       && ((Class151_Sub2) this).anInterface34_8913.method232());
	((Class151_Sub2) this).aBool8917
	    = (!((Class151_Sub2) this).aBool8915
	       && ((Class151_Sub2) this).anInterface34_8913.method232());
    }
    
    public void method1784(int i, int i_8_, int i_9_, int i_10_, int i_11_,
			   int i_12_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method216(i, i_8_, i_9_, i_10_, i_11_, i_12_);
    }
    
    public void method1802(int i, int i_13_, int i_14_, int i_15_, int[] is,
			   int[] is_16_, int i_17_, int i_18_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method206(i, i_13_, i_14_, i_15_, is, is_16_, i_17_);
    }
    
    public void method1801(int i, int i_19_, int i_20_, int i_21_) {
	((Class151_Sub2) this).anInt8907 = i;
	((Class151_Sub2) this).anInt8914 = i_19_;
	((Class151_Sub2) this).anInt8905 = i_20_;
	((Class151_Sub2) this).anInt8912 = i_21_;
	((Class151_Sub2) this).aBool8910
	    = (((Class151_Sub2) this).anInt8907 != 0
	       || ((Class151_Sub2) this).anInt8914 != 0
	       || ((Class151_Sub2) this).anInt8905 != 0
	       || ((Class151_Sub2) this).anInt8912 != 0);
    }
    
    public void method1765(int[] is) {
	is[0] = ((Class151_Sub2) this).anInt8907;
	is[1] = ((Class151_Sub2) this).anInt8914;
	is[2] = ((Class151_Sub2) this).anInt8905;
	is[3] = ((Class151_Sub2) this).anInt8912;
    }
    
    public int method1766() {
	return ((Class151_Sub2) this).anInt8904;
    }
    
    public int method40() {
	return (((Class151_Sub2) this).anInt8904
		+ ((Class151_Sub2) this).anInt8907
		+ ((Class151_Sub2) this).anInt8905);
    }
    
    public int method1767() {
	return ((Class151_Sub2) this).anInt8908;
    }
    
    public int method1768() {
	return (((Class151_Sub2) this).anInt8908
		+ ((Class151_Sub2) this).anInt8914
		+ ((Class151_Sub2) this).anInt8912);
    }
    
    public Interface19 method1769() {
	return ((Class151_Sub2) this).anInterface19_8906;
    }
    
    public void method1770(int i, int i_22_, int i_23_, int i_24_, int[] is,
			   int i_25_, int i_26_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method211(i, i_22_, i_23_, i_24_, is, i_25_, i_26_);
    }
    
    public void method1792(int i, int i_27_, int i_28_, int i_29_, int[] is,
			   int i_30_, int i_31_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method211(i, i_27_, i_28_, i_29_, is, i_30_, i_31_);
    }
    
    public int method38() {
	return (((Class151_Sub2) this).anInt8904
		+ ((Class151_Sub2) this).anInt8907
		+ ((Class151_Sub2) this).anInt8905);
    }
    
    public void method1775(int i, int i_32_, Class148 class148, int i_33_,
			   int i_34_) {
	((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	Class321 class321
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .aClass321_9325);
	class321.anInterface34_3472
	    = ((Class151_Sub2) this).anInterface34_8913;
	class321.method4204(1, -1);
	i += ((Class151_Sub2) this).anInt8907;
	i_32_ += ((Class151_Sub2) this).anInt8914;
	float f = (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -28).method2074();
	float f_35_
	    = (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			  ((byte) -76).method2070();
	class321.aClass418_3470.method4976
	    ((float) ((Class151_Sub2) this).anInt8904 * 2.0F / f,
	     (float) ((Class151_Sub2) this).anInt8908 * 2.0F / f_35_, 1.0F,
	     1.0F);
	class321.aClass418_3470.aFloatArray4768[12]
	    = (((float) i
		+ ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
	       * 2.0F / f) - 1.0F;
	class321.aClass418_3470.aFloatArray4768[13]
	    = (((float) i_32_
		+ ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
	       * 2.0F / f_35_) - 1.0F;
	class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	class321.aClass418_3471.method4976
	    (((Class151_Sub2) this).anInterface34_8913
		 .method207((float) ((Class151_Sub2) this).anInt8904),
	     ((Class151_Sub2) this).anInterface34_8913
		 .method221((float) ((Class151_Sub2) this).anInt8908),
	     1.0F, 1.0F);
	class321.anInterface36_3473
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .anInterface36_9372);
	class321.anInt3467 = 0;
	class321.aClass344_3468
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .aClass344_9375);
	Interface34 interface34
	    = ((Class148_Sub2) (Class148_Sub2) class148).anInterface34_8885;
	class321.anInterface34_3469 = interface34;
	class321.aClass418_3475.method4976
	    (interface34.method207((float) ((Class151_Sub2) this).anInt8904),
	     interface34.method221((float) ((Class151_Sub2) this).anInt8908),
	     1.0F, 1.0F);
	class321.aClass418_3475.aFloatArray4768[12]
	    = interface34.method207((float) (i - i_33_));
	class321.aClass418_3475.aFloatArray4768[13]
	    = interface34.method221((float) (i_32_ - i_34_));
	class321.method4207();
    }
    
    public int method1808() {
	return ((Class151_Sub2) this).anInt8904;
    }
    
    public void method1779(int i, int i_36_, int i_37_, int i_38_, int i_39_,
			   int i_40_, int i_41_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575) {
	    int i_42_ = i_36_ + i_38_;
	    int i_43_ = i + i_37_;
	    int i_44_ = method40();
	    int i_45_ = method1768();
	    int i_46_ = i_36_ + ((Class151_Sub2) this).anInt8914;
	    for (int i_47_ = i_46_ + ((Class151_Sub2) this).anInt8908;
		 i_47_ <= i_42_; i_47_ += i_45_) {
		int i_48_ = i + ((Class151_Sub2) this).anInt8907;
		for (int i_49_ = i_48_ + ((Class151_Sub2) this).anInt8904;
		     i_49_ <= i_43_; i_49_ += i_44_) {
		    ((Class173_Sub1)
		     ((Class151_Sub2) this).aClass173_Sub1_8909)
			.aClass371_9321.method4653
			((float) i_48_, (float) i_46_,
			 (float) (i_48_ + ((Class151_Sub2) this).anInt8904),
			 (float) (i_46_ + ((Class151_Sub2) this).anInt8908),
			 0.0F, 0.0F,
			 ((Class151_Sub2) this).anInterface34_8913.method245(),
			 ((Class151_Sub2) this).anInterface34_8913.method217(),
			 ((Class151_Sub2) this).anInterface34_8913, i_40_);
		    i_48_ += i_44_;
		}
		if (i_48_ < i_43_) {
		    int i_50_ = i_43_ - i_48_;
		    ((Class173_Sub1)
		     ((Class151_Sub2) this).aClass173_Sub1_8909)
			.aClass371_9321.method4653
			((float) i_48_, (float) i_46_, (float) (i_48_ + i_50_),
			 (float) (i_46_ + ((Class151_Sub2) this).anInt8908),
			 0.0F, 0.0F,
			 ((float) i_50_
			  / (float) ((Class151_Sub2) this).anInt8904
			  * ((Class151_Sub2) this).anInterface34_8913
				.method245()),
			 ((Class151_Sub2) this).anInterface34_8913.method217(),
			 ((Class151_Sub2) this).anInterface34_8913, i_40_);
		}
		i_46_ += i_45_;
	    }
	    if (i_46_ < i_42_) {
		int i_51_ = i_42_ - i_46_;
		float f
		    = ((float) i_51_ / (float) ((Class151_Sub2) this).anInt8908
		       * ((Class151_Sub2) this).anInterface34_8913
			     .method217());
		int i_52_ = i + ((Class151_Sub2) this).anInt8907;
		for (int i_53_ = i_52_ + ((Class151_Sub2) this).anInt8904;
		     i_53_ <= i_43_; i_53_ += i_44_) {
		    ((Class173_Sub1)
		     ((Class151_Sub2) this).aClass173_Sub1_8909)
			.aClass371_9321.method4653
			((float) i_52_, (float) i_46_,
			 (float) (i_52_ + ((Class151_Sub2) this).anInt8904),
			 (float) (i_46_ + i_51_), 0.0F, 0.0F,
			 ((Class151_Sub2) this).anInterface34_8913.method245(),
			 f, ((Class151_Sub2) this).anInterface34_8913, i_40_);
		    i_52_ += i_44_;
		}
		if (i_52_ < i_43_) {
		    int i_54_ = i_43_ - i_52_;
		    ((Class173_Sub1)
		     ((Class151_Sub2) this).aClass173_Sub1_8909)
			.aClass371_9321.method4653
			((float) i_52_, (float) i_46_, (float) (i_52_ + i_54_),
			 (float) (i_46_ + i_51_), 0.0F, 0.0F,
			 ((float) i_54_
			  / (float) ((Class151_Sub2) this).anInt8904
			  * ((Class151_Sub2) this).anInterface34_8913
				.method245()),
			 f, ((Class151_Sub2) this).anInterface34_8913, i_40_);
		}
	    }
	} else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_41_);
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i_39_, i_40_);
	    float f
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -46).method2074();
	    float f_55_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -110).method2070();
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    boolean bool = (((Class151_Sub2) this).aBool8917
			    && ((Class151_Sub2) this).anInt8914 == 0
			    && ((Class151_Sub2) this).anInt8912 == 0);
	    boolean bool_56_ = (((Class151_Sub2) this).aBool8916
				&& ((Class151_Sub2) this).anInt8907 == 0
				&& ((Class151_Sub2) this).anInt8905 == 0);
	    if (bool_56_ & bool) {
		class321.aClass418_3470.method4976((float) i_37_ * 2.0F / f,
						   ((float) i_38_ * 2.0F
						    / f_55_),
						   1.0F, 1.0F);
		class321.aClass418_3470.aFloatArray4768[12]
		    = ((float) i + ((Class151_Sub2) this)
				       .aClass173_Sub1_8909
				       .method8468()) * 2.0F / f - 1.0F;
		class321.aClass418_3470.aFloatArray4768[13]
		    = (((float) i_36_ + ((Class151_Sub2) this)
					    .aClass173_Sub1_8909.method8468())
		       * 2.0F / f_55_) - 1.0F;
		class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
		class321.aClass418_3471.method4976
		    (((Class151_Sub2) this).anInterface34_8913
			 .method207((float) i_37_),
		     ((Class151_Sub2) this).anInterface34_8913
			 .method221((float) i_38_),
		     1.0F, 1.0F);
		class321.method4206();
	    } else if (bool_56_) {
		int i_57_ = i_36_ + i_38_;
		int i_58_ = method1768();
		class321.aClass418_3471.method4976
		    (((Class151_Sub2) this).anInterface34_8913
			 .method207((float) i_37_),
		     ((Class151_Sub2) this).anInterface34_8913
			 .method221((float) ((Class151_Sub2) this).anInt8908),
		     1.0F, 1.0F);
		int i_59_ = i_36_ + ((Class151_Sub2) this).anInt8914;
		for (int i_60_ = i_59_ + ((Class151_Sub2) this).anInt8908;
		     i_60_ <= i_57_; i_60_ += i_58_) {
		    class321.aClass418_3470.method4976
			((float) i_37_ * 2.0F / f,
			 ((float) ((Class151_Sub2) this).anInt8908 * 2.0F
			  / f_55_),
			 1.0F, 1.0F);
		    class321.aClass418_3470.aFloatArray4768[12]
			= (((float) i + ((Class151_Sub2) this)
					    .aClass173_Sub1_8909.method8468())
			   * 2.0F / f) - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[13]
			= ((float) i_59_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f_55_ - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
		    class321.method4206();
		    i_59_ += i_58_;
		}
		if (i_59_ < i_57_) {
		    int i_61_ = i_57_ - i_59_;
		    class321.aClass418_3471.method4976
			(((Class151_Sub2) this).anInterface34_8913
			     .method207((float) i_37_),
			 ((Class151_Sub2) this).anInterface34_8913
			     .method221((float) i_61_),
			 1.0F, 1.0F);
		    class321.aClass418_3470.method4976(((float) i_37_ * 2.0F
							/ f),
						       ((float) i_61_ * 2.0F
							/ f_55_),
						       1.0F, 1.0F);
		    class321.aClass418_3470.aFloatArray4768[12]
			= (((float) i + ((Class151_Sub2) this)
					    .aClass173_Sub1_8909.method8468())
			   * 2.0F / f) - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[13]
			= ((float) i_59_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f_55_ - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
		    class321.method4206();
		}
	    } else if (bool) {
		int i_62_ = i + i_37_;
		int i_63_ = method40();
		class321.aClass418_3471.method4976
		    (((Class151_Sub2) this).anInterface34_8913
			 .method207((float) ((Class151_Sub2) this).anInt8904),
		     ((Class151_Sub2) this).anInterface34_8913
			 .method221((float) i_38_),
		     1.0F, 1.0F);
		int i_64_ = i + ((Class151_Sub2) this).anInt8907;
		for (int i_65_ = i_64_ + ((Class151_Sub2) this).anInt8904;
		     i_65_ <= i_62_; i_65_ += i_63_) {
		    class321.aClass418_3470.method4976
			((float) ((Class151_Sub2) this).anInt8904 * 2.0F / f,
			 (float) i_38_ * 2.0F / f_55_, 1.0F, 1.0F);
		    class321.aClass418_3470.aFloatArray4768[12]
			= ((float) i_64_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[13]
			= ((float) i_36_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f_55_ - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
		    class321.method4206();
		    i_64_ += i_63_;
		}
		if (i_64_ < i_62_) {
		    int i_66_ = i_62_ - i_64_;
		    class321.aClass418_3471.method4976
			(((Class151_Sub2) this).anInterface34_8913
			     .method207((float) i_66_),
			 ((Class151_Sub2) this).anInterface34_8913
			     .method221((float) i_38_),
			 1.0F, 1.0F);
		    class321.aClass418_3470.method4976(((float) i_66_ * 2.0F
							/ f),
						       ((float) i_38_ * 2.0F
							/ f_55_),
						       1.0F, 1.0F);
		    class321.aClass418_3470.aFloatArray4768[12]
			= ((float) i_64_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[13]
			= ((float) i_36_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f_55_ - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
		    class321.method4206();
		}
	    } else {
		int i_67_ = i_36_ + i_38_;
		int i_68_ = i + i_37_;
		int i_69_ = method40();
		int i_70_ = method1768();
		int i_71_ = i_36_ + ((Class151_Sub2) this).anInt8914;
		for (int i_72_ = i_71_ + ((Class151_Sub2) this).anInt8908;
		     i_72_ <= i_67_; i_72_ += i_70_) {
		    class321.aClass418_3471.method4976
			((((Class151_Sub2) this).anInterface34_8913.method207
			  ((float) ((Class151_Sub2) this).anInt8904)),
			 (((Class151_Sub2) this).anInterface34_8913.method221
			  ((float) ((Class151_Sub2) this).anInt8908)),
			 1.0F, 1.0F);
		    int i_73_ = i + ((Class151_Sub2) this).anInt8907;
		    for (int i_74_ = i_73_ + ((Class151_Sub2) this).anInt8904;
			 i_74_ <= i_68_; i_74_ += i_69_) {
			class321.aClass418_3470.method4976
			    (((float) ((Class151_Sub2) this).anInt8904 * 2.0F
			      / f),
			     ((float) ((Class151_Sub2) this).anInt8908 * 2.0F
			      / f_55_),
			     1.0F, 1.0F);
			class321.aClass418_3470.aFloatArray4768[12]
			    = ((float) i_73_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f - 1.0F;
			class321.aClass418_3470.aFloatArray4768[13]
			    = ((float) i_71_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f_55_ - 1.0F;
			class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
			class321.method4206();
			i_73_ += i_69_;
		    }
		    if (i_73_ < i_68_) {
			int i_75_ = i_68_ - i_73_;
			class321.aClass418_3471.method4976
			    (((Class151_Sub2) this).anInterface34_8913
				 .method207((float) i_75_),
			     (((Class151_Sub2) this).anInterface34_8913
				  .method221
			      ((float) ((Class151_Sub2) this).anInt8908)),
			     1.0F, 1.0F);
			class321.aClass418_3470.method4976
			    ((float) i_75_ * 2.0F / f,
			     ((float) ((Class151_Sub2) this).anInt8908 * 2.0F
			      / f_55_),
			     1.0F, 1.0F);
			class321.aClass418_3470.aFloatArray4768[12]
			    = ((float) i_73_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f - 1.0F;
			class321.aClass418_3470.aFloatArray4768[13]
			    = ((float) i_71_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f_55_ - 1.0F;
			class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
			class321.method4206();
		    }
		    i_71_ += i_70_;
		}
		if (i_71_ < i_67_) {
		    int i_76_ = i_67_ - i_71_;
		    class321.aClass418_3471.method4976
			((((Class151_Sub2) this).anInterface34_8913.method207
			  ((float) ((Class151_Sub2) this).anInt8904)),
			 ((Class151_Sub2) this).anInterface34_8913
			     .method221((float) i_76_),
			 1.0F, 1.0F);
		    int i_77_ = i + ((Class151_Sub2) this).anInt8907;
		    for (int i_78_ = i_77_ + ((Class151_Sub2) this).anInt8904;
			 i_78_ <= i_68_; i_78_ += i_69_) {
			class321.aClass418_3470.method4976
			    (((float) ((Class151_Sub2) this).anInt8904 * 2.0F
			      / f),
			     (float) i_76_ * 2.0F / f_55_, 1.0F, 1.0F);
			class321.aClass418_3470.aFloatArray4768[12]
			    = ((float) i_77_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f - 1.0F;
			class321.aClass418_3470.aFloatArray4768[13]
			    = ((float) i_71_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f_55_ - 1.0F;
			class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
			class321.method4206();
			i_77_ += i_69_;
		    }
		    if (i_77_ < i_68_) {
			int i_79_ = i_68_ - i_77_;
			class321.aClass418_3471.method4976
			    (((Class151_Sub2) this).anInterface34_8913
				 .method207((float) i_79_),
			     ((Class151_Sub2) this).anInterface34_8913
				 .method221((float) i_76_),
			     1.0F, 1.0F);
			class321.aClass418_3470.method4976(((float) i_79_
							    * 2.0F / f),
							   ((float) i_76_
							    * 2.0F / f_55_),
							   1.0F, 1.0F);
			class321.aClass418_3470.aFloatArray4768[12]
			    = ((float) i_77_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f - 1.0F;
			class321.aClass418_3470.aFloatArray4768[13]
			    = ((float) i_71_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f_55_ - 1.0F;
			class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
			class321.method4206();
		    }
		}
	    }
	}
    }
    
    void method1785(float f, float f_80_, float f_81_, float f_82_,
		    float f_83_, float f_84_, int i, int i_85_, int i_86_,
		    int i_87_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575)
	    ((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		.aClass371_9321.method4657
		(f, f_80_, f_81_, f_82_, f_83_, f_84_, f_81_ + f_83_ - f,
		 f_82_ + f_84_ - f_80_, 0.0F, 0.0F,
		 ((Class151_Sub2) this).anInterface34_8913.method245(), 0.0F,
		 0.0F, ((Class151_Sub2) this).anInterface34_8913.method217(),
		 ((Class151_Sub2) this).anInterface34_8913.method245(),
		 ((Class151_Sub2) this).anInterface34_8913.method217(),
		 ((Class151_Sub2) this).anInterface34_8913, i_85_);
	else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_86_);
	    if (((Class151_Sub2) this).aBool8910) {
		float f_88_ = (float) method40();
		float f_89_ = (float) method1768();
		float f_90_ = (f_81_ - f) / f_88_;
		float f_91_ = (f_82_ - f_80_) / f_88_;
		float f_92_ = (f_83_ - f) / f_89_;
		float f_93_ = (f_84_ - f_80_) / f_89_;
		float f_94_ = f_92_ * (float) ((Class151_Sub2) this).anInt8914;
		float f_95_ = f_93_ * (float) ((Class151_Sub2) this).anInt8914;
		float f_96_ = f_90_ * (float) ((Class151_Sub2) this).anInt8907;
		float f_97_ = f_91_ * (float) ((Class151_Sub2) this).anInt8907;
		float f_98_
		    = -f_90_ * (float) ((Class151_Sub2) this).anInt8905;
		float f_99_
		    = -f_91_ * (float) ((Class151_Sub2) this).anInt8905;
		float f_100_
		    = -f_92_ * (float) ((Class151_Sub2) this).anInt8912;
		float f_101_
		    = -f_93_ * (float) ((Class151_Sub2) this).anInt8912;
		f = f + f_96_ + f_94_;
		f_80_ = f_80_ + f_97_ + f_95_;
		f_81_ = f_81_ + f_98_ + f_94_;
		f_82_ = f_82_ + f_99_ + f_95_;
		f_83_ = f_83_ + f_96_ + f_100_;
		f_84_ = f_84_ + f_97_ + f_101_;
	    }
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i, i_85_);
	    float f_102_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -14).method2074();
	    float f_103_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -68).method2070();
	    class321.aClass418_3470.method5013();
	    class321.aClass418_3470.aFloatArray4768[0]
		= (f_81_ - f) * 2.0F / f_102_;
	    class321.aClass418_3470.aFloatArray4768[1]
		= (f_82_ - f_80_) * 2.0F / f_103_;
	    class321.aClass418_3470.aFloatArray4768[4]
		= (f_83_ - f) * 2.0F / f_102_;
	    class321.aClass418_3470.aFloatArray4768[5]
		= (f_84_ - f_80_) * 2.0F / f_103_;
	    class321.aClass418_3470.aFloatArray4768[12]
		= ((f
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_102_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= ((f_80_
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_103_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method4976
		(((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 1.0F, 1.0F);
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    class321.method4206();
	}
    }
    
    void method1764(float f, float f_104_, float f_105_, float f_106_,
		    float f_107_, float f_108_, int i, Class148 class148,
		    int i_109_, int i_110_) {
	((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	Class321 class321
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .aClass321_9325);
	class321.anInterface34_3472
	    = ((Class151_Sub2) this).anInterface34_8913;
	class321.method4204(1, -1);
	float f_111_
	    = (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			  ((byte) -3).method2074();
	float f_112_
	    = (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			  ((byte) -103).method2070();
	class321.aClass418_3470.method5013();
	if (((Class151_Sub2) this).aBool8910) {
	    float f_113_ = ((float) ((Class151_Sub2) this).anInt8904
			    / (float) method40());
	    float f_114_ = ((float) ((Class151_Sub2) this).anInt8908
			    / (float) method1768());
	    class321.aClass418_3470.aFloatArray4768[0] = (f_105_ - f) * f_113_;
	    class321.aClass418_3470.aFloatArray4768[1]
		= (f_106_ - f_104_) * f_113_;
	    class321.aClass418_3470.aFloatArray4768[4] = (f_107_ - f) * f_114_;
	    class321.aClass418_3470.aFloatArray4768[5]
		= (f_108_ - f_104_) * f_114_;
	    class321.aClass418_3470.aFloatArray4768[12]
		= ((f + (float) ((Class151_Sub2) this).anInt8907) * f_113_
		   + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468());
	    class321.aClass418_3470.aFloatArray4768[13]
		= ((f_104_ + (float) ((Class151_Sub2) this).anInt8914) * f_114_
		   + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468());
	} else {
	    class321.aClass418_3470.aFloatArray4768[0] = f_105_ - f;
	    class321.aClass418_3470.aFloatArray4768[1] = f_106_ - f_104_;
	    class321.aClass418_3470.aFloatArray4768[4] = f_107_ - f;
	    class321.aClass418_3470.aFloatArray4768[5] = f_108_ - f_104_;
	    class321.aClass418_3470.aFloatArray4768[12]
		= f + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468();
	    class321.aClass418_3470.aFloatArray4768[13]
		= (f_104_
		   + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468());
	}
	Class418 class418
	    = ((Class151_Sub2) this).aClass173_Sub1_8909.aClass418_9243;
	class418.method5013();
	class418.aFloatArray4768[0] = 2.0F / f_111_;
	class418.aFloatArray4768[5] = 2.0F / f_112_;
	class418.aFloatArray4768[12] = -1.0F;
	class418.aFloatArray4768[13] = -1.0F;
	class418.aFloatArray4768[14] = -1.0F;
	class321.aClass418_3470.method4974(class418);
	class321.aClass418_3471.method4976
	    (((Class151_Sub2) this).anInterface34_8913
		 .method207((float) ((Class151_Sub2) this).anInt8904),
	     ((Class151_Sub2) this).anInterface34_8913
		 .method221((float) ((Class151_Sub2) this).anInt8908),
	     1.0F, 1.0F);
	class321.anInterface36_3473
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .anInterface36_9372);
	class321.anInt3467 = 0;
	class321.aClass344_3468
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .aClass344_9375);
	Interface34 interface34
	    = ((Class148_Sub2) (Class148_Sub2) class148).anInterface34_8885;
	class321.anInterface34_3469 = interface34;
	class321.aClass418_3475.method5013();
	class321.aClass418_3475.aFloatArray4768[0]
	    = (f_105_ - f) * interface34.method207(1.0F);
	class321.aClass418_3475.aFloatArray4768[1]
	    = (f_106_ - f_104_) * interface34.method207(1.0F);
	class321.aClass418_3475.aFloatArray4768[4]
	    = (f_107_ - f) * interface34.method221(1.0F);
	class321.aClass418_3475.aFloatArray4768[5]
	    = (f_108_ - f_104_) * interface34.method221(1.0F);
	class321.aClass418_3475.aFloatArray4768[12]
	    = (f - (float) i_109_) * interface34.method207(1.0F);
	class321.aClass418_3475.aFloatArray4768[13]
	    = (f_104_ - (float) i_110_) * interface34.method221(1.0F);
	class321.method4207();
    }
    
    public void method1788(int i, int i_115_, int i_116_, int i_117_, int[] is,
			   int i_118_, int i_119_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method211(i, i_115_, i_116_, i_117_, is, i_118_, i_119_);
    }
    
    public void method1789(int i, int i_120_, int i_121_, int i_122_, int[] is,
			   int i_123_, int i_124_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method211(i, i_120_, i_121_, i_122_, is, i_123_, i_124_);
    }
    
    public void method1790(int i, int i_125_, int i_126_, int i_127_, int[] is,
			   int i_128_, int i_129_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method211(i, i_125_, i_126_, i_127_, is, i_128_, i_129_);
    }
    
    public void method1811(int i, int i_130_, int i_131_, int i_132_,
			   int i_133_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575) {
	    i += ((Class151_Sub2) this).anInt8907;
	    i_130_ += ((Class151_Sub2) this).anInt8914;
	    ((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		.aClass371_9321.method4653
		((float) i, (float) i_130_,
		 (float) (i + ((Class151_Sub2) this).anInt8904),
		 (float) (i_130_ + ((Class151_Sub2) this).anInt8908), 0.0F,
		 0.0F, ((Class151_Sub2) this).anInterface34_8913.method245(),
		 ((Class151_Sub2) this).anInterface34_8913.method217(),
		 ((Class151_Sub2) this).anInterface34_8913, i_132_);
	} else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_133_);
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i_131_, i_132_);
	    i += ((Class151_Sub2) this).anInt8907;
	    i_130_ += ((Class151_Sub2) this).anInt8914;
	    float f
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -104).method2074();
	    float f_134_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -80).method2070();
	    class321.aClass418_3470.method4976
		((float) ((Class151_Sub2) this).anInt8904 * 2.0F / f,
		 (float) ((Class151_Sub2) this).anInt8908 * 2.0F / f_134_,
		 1.0F, 1.0F);
	    class321.aClass418_3470.aFloatArray4768[12]
		= (((float) i
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= (((float) i_130_
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_134_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method4976
		(((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 1.0F, 1.0F);
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    class321.method4206();
	}
    }
    
    public int method1820() {
	return ((Class151_Sub2) this).anInt8908;
    }
    
    void method1777(int i, int i_135_, int i_136_, int i_137_, int i_138_,
		    int i_139_, int i_140_, int i_141_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575) {
	    if (((Class151_Sub2) this).aBool8910) {
		i_136_
		    = i_136_ * ((Class151_Sub2) this).anInt8904 / method40();
		i_137_
		    = i_137_ * ((Class151_Sub2) this).anInt8908 / method1768();
		i += (((Class151_Sub2) this).anInt8907 * i_136_
		      / ((Class151_Sub2) this).anInt8904);
		i_135_ += (((Class151_Sub2) this).anInt8914 * i_137_
			   / ((Class151_Sub2) this).anInt8908);
	    }
	    ((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		.aClass371_9321.method4653
		((float) i, (float) i_135_, (float) (i + i_136_),
		 (float) (i_135_ + i_137_),
		 ((Class151_Sub2) this).anInterface34_8913.method207(0.0F),
		 ((Class151_Sub2) this).anInterface34_8913.method221(0.0F),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 ((Class151_Sub2) this).anInterface34_8913, i_139_);
	} else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_140_);
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i_138_, i_139_);
	    if (((Class151_Sub2) this).aBool8910) {
		i_136_
		    = i_136_ * ((Class151_Sub2) this).anInt8904 / method40();
		i_137_
		    = i_137_ * ((Class151_Sub2) this).anInt8908 / method1768();
		i += (((Class151_Sub2) this).anInt8907 * i_136_
		      / ((Class151_Sub2) this).anInt8904);
		i_135_ += (((Class151_Sub2) this).anInt8914 * i_137_
			   / ((Class151_Sub2) this).anInt8908);
	    }
	    float f
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -48).method2074();
	    float f_142_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -112).method2070();
	    class321.aClass418_3470.method4976((float) i_136_ * 2.0F / f,
					       (float) i_137_ * 2.0F / f_142_,
					       1.0F, 1.0F);
	    class321.aClass418_3470.aFloatArray4768[12]
		= (((float) i
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= (((float) i_135_
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_142_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method4976
		(((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 1.0F, 1.0F);
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    class321.method4206();
	}
    }
    
    public void method1798(int i, int i_143_, int i_144_, int i_145_, int[] is,
			   int[] is_146_, int i_147_, int i_148_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method206(i, i_143_, i_144_, i_145_, is, is_146_, i_147_);
    }
    
    public void method1795(int i, int i_149_, int i_150_, int i_151_,
			   int i_152_, int i_153_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method216(i, i_149_, i_150_, i_151_, i_152_, i_153_);
    }
    
    public void method1796(int i, int i_154_, int i_155_, int i_156_,
			   int i_157_, int i_158_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method216(i, i_154_, i_155_, i_156_, i_157_, i_158_);
    }
    
    public void method1778(int i, int i_159_, int i_160_) {
	int[] is = (((Class151_Sub2) this).aClass173_Sub1_8909.method2208
		    (i, i_159_, ((Class151_Sub2) this).anInt8904,
		     ((Class151_Sub2) this).anInt8908));
	int[] is_161_ = new int[(((Class151_Sub2) this).anInt8904
				 * ((Class151_Sub2) this).anInt8908)];
	((Class151_Sub2) this).anInterface34_8913.method219
	    (0, 0, ((Class151_Sub2) this).anInt8904,
	     ((Class151_Sub2) this).anInt8908, is_161_, 0);
	if (i_160_ == 0) {
	    for (int i_162_ = 0; i_162_ < ((Class151_Sub2) this).anInt8908;
		 i_162_++) {
		int i_163_ = i_162_ * ((Class151_Sub2) this).anInt8904;
		for (int i_164_ = 0; i_164_ < ((Class151_Sub2) this).anInt8904;
		     i_164_++)
		    is_161_[i_163_ + i_164_]
			= (is_161_[i_163_ + i_164_] & 0xffffff
			   | is[i_163_ + i_164_] << 8 & ~0xffffff);
	    }
	} else if (i_160_ == 1) {
	    for (int i_165_ = 0; i_165_ < ((Class151_Sub2) this).anInt8908;
		 i_165_++) {
		int i_166_ = i_165_ * ((Class151_Sub2) this).anInt8904;
		for (int i_167_ = 0; i_167_ < ((Class151_Sub2) this).anInt8904;
		     i_167_++)
		    is_161_[i_166_ + i_167_]
			= (is_161_[i_166_ + i_167_] & 0xffffff
			   | is[i_166_ + i_167_] << 16 & ~0xffffff);
	    }
	} else if (i_160_ == 2) {
	    for (int i_168_ = 0; i_168_ < ((Class151_Sub2) this).anInt8908;
		 i_168_++) {
		int i_169_ = i_168_ * ((Class151_Sub2) this).anInt8904;
		for (int i_170_ = 0; i_170_ < ((Class151_Sub2) this).anInt8904;
		     i_170_++)
		    is_161_[i_169_ + i_170_]
			= (is_161_[i_169_ + i_170_] & 0xffffff
			   | is[i_169_ + i_170_] << 24 & ~0xffffff);
	    }
	} else if (i_160_ == 3) {
	    for (int i_171_ = 0; i_171_ < ((Class151_Sub2) this).anInt8908;
		 i_171_++) {
		int i_172_ = i_171_ * ((Class151_Sub2) this).anInt8904;
		for (int i_173_ = 0; i_173_ < ((Class151_Sub2) this).anInt8904;
		     i_173_++)
		    is_161_[i_172_ + i_173_]
			= (is_161_[i_172_ + i_173_] & 0xffffff
			   | (is[i_172_ + i_173_] != 0 ? -16777216 : 0));
	    }
	}
	method1770(0, 0, ((Class151_Sub2) this).anInt8904,
		   ((Class151_Sub2) this).anInt8908, is_161_, 0,
		   ((Class151_Sub2) this).anInt8904);
    }
    
    public void method1812(int i, int i_174_, int i_175_) {
	int[] is = (((Class151_Sub2) this).aClass173_Sub1_8909.method2208
		    (i, i_174_, ((Class151_Sub2) this).anInt8904,
		     ((Class151_Sub2) this).anInt8908));
	int[] is_176_ = new int[(((Class151_Sub2) this).anInt8904
				 * ((Class151_Sub2) this).anInt8908)];
	((Class151_Sub2) this).anInterface34_8913.method219
	    (0, 0, ((Class151_Sub2) this).anInt8904,
	     ((Class151_Sub2) this).anInt8908, is_176_, 0);
	if (i_175_ == 0) {
	    for (int i_177_ = 0; i_177_ < ((Class151_Sub2) this).anInt8908;
		 i_177_++) {
		int i_178_ = i_177_ * ((Class151_Sub2) this).anInt8904;
		for (int i_179_ = 0; i_179_ < ((Class151_Sub2) this).anInt8904;
		     i_179_++)
		    is_176_[i_178_ + i_179_]
			= (is_176_[i_178_ + i_179_] & 0xffffff
			   | is[i_178_ + i_179_] << 8 & ~0xffffff);
	    }
	} else if (i_175_ == 1) {
	    for (int i_180_ = 0; i_180_ < ((Class151_Sub2) this).anInt8908;
		 i_180_++) {
		int i_181_ = i_180_ * ((Class151_Sub2) this).anInt8904;
		for (int i_182_ = 0; i_182_ < ((Class151_Sub2) this).anInt8904;
		     i_182_++)
		    is_176_[i_181_ + i_182_]
			= (is_176_[i_181_ + i_182_] & 0xffffff
			   | is[i_181_ + i_182_] << 16 & ~0xffffff);
	    }
	} else if (i_175_ == 2) {
	    for (int i_183_ = 0; i_183_ < ((Class151_Sub2) this).anInt8908;
		 i_183_++) {
		int i_184_ = i_183_ * ((Class151_Sub2) this).anInt8904;
		for (int i_185_ = 0; i_185_ < ((Class151_Sub2) this).anInt8904;
		     i_185_++)
		    is_176_[i_184_ + i_185_]
			= (is_176_[i_184_ + i_185_] & 0xffffff
			   | is[i_184_ + i_185_] << 24 & ~0xffffff);
	    }
	} else if (i_175_ == 3) {
	    for (int i_186_ = 0; i_186_ < ((Class151_Sub2) this).anInt8908;
		 i_186_++) {
		int i_187_ = i_186_ * ((Class151_Sub2) this).anInt8904;
		for (int i_188_ = 0; i_188_ < ((Class151_Sub2) this).anInt8904;
		     i_188_++)
		    is_176_[i_187_ + i_188_]
			= (is_176_[i_187_ + i_188_] & 0xffffff
			   | (is[i_187_ + i_188_] != 0 ? -16777216 : 0));
	    }
	}
	method1770(0, 0, ((Class151_Sub2) this).anInt8904,
		   ((Class151_Sub2) this).anInt8908, is_176_, 0,
		   ((Class151_Sub2) this).anInt8904);
    }
    
    public Interface19 method1799() {
	return ((Class151_Sub2) this).anInterface19_8906;
    }
    
    public void method1803(int i, int i_189_, int i_190_, int i_191_,
			   int i_192_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575) {
	    i += ((Class151_Sub2) this).anInt8907;
	    i_189_ += ((Class151_Sub2) this).anInt8914;
	    ((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		.aClass371_9321.method4653
		((float) i, (float) i_189_,
		 (float) (i + ((Class151_Sub2) this).anInt8904),
		 (float) (i_189_ + ((Class151_Sub2) this).anInt8908), 0.0F,
		 0.0F, ((Class151_Sub2) this).anInterface34_8913.method245(),
		 ((Class151_Sub2) this).anInterface34_8913.method217(),
		 ((Class151_Sub2) this).anInterface34_8913, i_191_);
	} else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_192_);
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i_190_, i_191_);
	    i += ((Class151_Sub2) this).anInt8907;
	    i_189_ += ((Class151_Sub2) this).anInt8914;
	    float f
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -107).method2074();
	    float f_193_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -54).method2070();
	    class321.aClass418_3470.method4976
		((float) ((Class151_Sub2) this).anInt8904 * 2.0F / f,
		 (float) ((Class151_Sub2) this).anInt8908 * 2.0F / f_193_,
		 1.0F, 1.0F);
	    class321.aClass418_3470.aFloatArray4768[12]
		= (((float) i
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= (((float) i_189_
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_193_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method4976
		(((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 1.0F, 1.0F);
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    class321.method4206();
	}
    }
    
    public void method1791(int i, int i_194_, int i_195_, int i_196_, int[] is,
			   int i_197_, int i_198_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method211(i, i_194_, i_195_, i_196_, is, i_197_, i_198_);
    }
    
    public void method1810(int i, int i_199_, int i_200_, int i_201_,
			   int i_202_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575) {
	    i += ((Class151_Sub2) this).anInt8907;
	    i_199_ += ((Class151_Sub2) this).anInt8914;
	    ((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		.aClass371_9321.method4653
		((float) i, (float) i_199_,
		 (float) (i + ((Class151_Sub2) this).anInt8904),
		 (float) (i_199_ + ((Class151_Sub2) this).anInt8908), 0.0F,
		 0.0F, ((Class151_Sub2) this).anInterface34_8913.method245(),
		 ((Class151_Sub2) this).anInterface34_8913.method217(),
		 ((Class151_Sub2) this).anInterface34_8913, i_201_);
	} else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_202_);
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i_200_, i_201_);
	    i += ((Class151_Sub2) this).anInt8907;
	    i_199_ += ((Class151_Sub2) this).anInt8914;
	    float f
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -59).method2074();
	    float f_203_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -26).method2070();
	    class321.aClass418_3470.method4976
		((float) ((Class151_Sub2) this).anInt8904 * 2.0F / f,
		 (float) ((Class151_Sub2) this).anInt8908 * 2.0F / f_203_,
		 1.0F, 1.0F);
	    class321.aClass418_3470.aFloatArray4768[12]
		= (((float) i
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= (((float) i_199_
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_203_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method4976
		(((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 1.0F, 1.0F);
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    class321.method4206();
	}
    }
    
    public int method39() {
	return (((Class151_Sub2) this).anInt8904
		+ ((Class151_Sub2) this).anInt8907
		+ ((Class151_Sub2) this).anInt8905);
    }
    
    public void method1805(int i, int i_204_, Class148 class148, int i_205_,
			   int i_206_) {
	((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	Class321 class321
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .aClass321_9325);
	class321.anInterface34_3472
	    = ((Class151_Sub2) this).anInterface34_8913;
	class321.method4204(1, -1);
	i += ((Class151_Sub2) this).anInt8907;
	i_204_ += ((Class151_Sub2) this).anInt8914;
	float f = (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -6).method2074();
	float f_207_
	    = (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			  ((byte) -4).method2070();
	class321.aClass418_3470.method4976
	    ((float) ((Class151_Sub2) this).anInt8904 * 2.0F / f,
	     (float) ((Class151_Sub2) this).anInt8908 * 2.0F / f_207_, 1.0F,
	     1.0F);
	class321.aClass418_3470.aFloatArray4768[12]
	    = (((float) i
		+ ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
	       * 2.0F / f) - 1.0F;
	class321.aClass418_3470.aFloatArray4768[13]
	    = (((float) i_204_
		+ ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
	       * 2.0F / f_207_) - 1.0F;
	class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	class321.aClass418_3471.method4976
	    (((Class151_Sub2) this).anInterface34_8913
		 .method207((float) ((Class151_Sub2) this).anInt8904),
	     ((Class151_Sub2) this).anInterface34_8913
		 .method221((float) ((Class151_Sub2) this).anInt8908),
	     1.0F, 1.0F);
	class321.anInterface36_3473
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .anInterface36_9372);
	class321.anInt3467 = 0;
	class321.aClass344_3468
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .aClass344_9375);
	Interface34 interface34
	    = ((Class148_Sub2) (Class148_Sub2) class148).anInterface34_8885;
	class321.anInterface34_3469 = interface34;
	class321.aClass418_3475.method4976
	    (interface34.method207((float) ((Class151_Sub2) this).anInt8904),
	     interface34.method221((float) ((Class151_Sub2) this).anInt8908),
	     1.0F, 1.0F);
	class321.aClass418_3475.aFloatArray4768[12]
	    = interface34.method207((float) (i - i_205_));
	class321.aClass418_3475.aFloatArray4768[13]
	    = interface34.method221((float) (i_204_ - i_206_));
	class321.method4207();
    }
    
    void method1797(int i, int i_208_, int i_209_, int i_210_, int i_211_,
		    int i_212_, int i_213_, int i_214_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575) {
	    if (((Class151_Sub2) this).aBool8910) {
		i_209_
		    = i_209_ * ((Class151_Sub2) this).anInt8904 / method40();
		i_210_
		    = i_210_ * ((Class151_Sub2) this).anInt8908 / method1768();
		i += (((Class151_Sub2) this).anInt8907 * i_209_
		      / ((Class151_Sub2) this).anInt8904);
		i_208_ += (((Class151_Sub2) this).anInt8914 * i_210_
			   / ((Class151_Sub2) this).anInt8908);
	    }
	    ((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		.aClass371_9321.method4653
		((float) i, (float) i_208_, (float) (i + i_209_),
		 (float) (i_208_ + i_210_),
		 ((Class151_Sub2) this).anInterface34_8913.method207(0.0F),
		 ((Class151_Sub2) this).anInterface34_8913.method221(0.0F),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 ((Class151_Sub2) this).anInterface34_8913, i_212_);
	} else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_213_);
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i_211_, i_212_);
	    if (((Class151_Sub2) this).aBool8910) {
		i_209_
		    = i_209_ * ((Class151_Sub2) this).anInt8904 / method40();
		i_210_
		    = i_210_ * ((Class151_Sub2) this).anInt8908 / method1768();
		i += (((Class151_Sub2) this).anInt8907 * i_209_
		      / ((Class151_Sub2) this).anInt8904);
		i_208_ += (((Class151_Sub2) this).anInt8914 * i_210_
			   / ((Class151_Sub2) this).anInt8908);
	    }
	    float f
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -20).method2074();
	    float f_215_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -95).method2070();
	    class321.aClass418_3470.method4976((float) i_209_ * 2.0F / f,
					       (float) i_210_ * 2.0F / f_215_,
					       1.0F, 1.0F);
	    class321.aClass418_3470.aFloatArray4768[12]
		= (((float) i
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= (((float) i_208_
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_215_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method4976
		(((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 1.0F, 1.0F);
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    class321.method4206();
	}
    }
    
    public void method1806(int i, int i_216_, int i_217_, int i_218_) {
	((Class151_Sub2) this).anInt8907 = i;
	((Class151_Sub2) this).anInt8914 = i_216_;
	((Class151_Sub2) this).anInt8905 = i_217_;
	((Class151_Sub2) this).anInt8912 = i_218_;
	((Class151_Sub2) this).aBool8910
	    = (((Class151_Sub2) this).anInt8907 != 0
	       || ((Class151_Sub2) this).anInt8914 != 0
	       || ((Class151_Sub2) this).anInt8905 != 0
	       || ((Class151_Sub2) this).anInt8912 != 0);
    }
    
    public void method1763(int i, int i_219_, int i_220_, int i_221_) {
	((Class151_Sub2) this).anInt8907 = i;
	((Class151_Sub2) this).anInt8914 = i_219_;
	((Class151_Sub2) this).anInt8905 = i_220_;
	((Class151_Sub2) this).anInt8912 = i_221_;
	((Class151_Sub2) this).aBool8910
	    = (((Class151_Sub2) this).anInt8907 != 0
	       || ((Class151_Sub2) this).anInt8914 != 0
	       || ((Class151_Sub2) this).anInt8905 != 0
	       || ((Class151_Sub2) this).anInt8912 != 0);
    }
    
    public void method1772(int[] is) {
	is[0] = ((Class151_Sub2) this).anInt8907;
	is[1] = ((Class151_Sub2) this).anInt8914;
	is[2] = ((Class151_Sub2) this).anInt8905;
	is[3] = ((Class151_Sub2) this).anInt8912;
    }
    
    void method1793(float f, float f_222_, float f_223_, float f_224_,
		    float f_225_, float f_226_, int i, int i_227_, int i_228_,
		    int i_229_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575)
	    ((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		.aClass371_9321.method4657
		(f, f_222_, f_223_, f_224_, f_225_, f_226_,
		 f_223_ + f_225_ - f, f_224_ + f_226_ - f_222_, 0.0F, 0.0F,
		 ((Class151_Sub2) this).anInterface34_8913.method245(), 0.0F,
		 0.0F, ((Class151_Sub2) this).anInterface34_8913.method217(),
		 ((Class151_Sub2) this).anInterface34_8913.method245(),
		 ((Class151_Sub2) this).anInterface34_8913.method217(),
		 ((Class151_Sub2) this).anInterface34_8913, i_227_);
	else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_228_);
	    if (((Class151_Sub2) this).aBool8910) {
		float f_230_ = (float) method40();
		float f_231_ = (float) method1768();
		float f_232_ = (f_223_ - f) / f_230_;
		float f_233_ = (f_224_ - f_222_) / f_230_;
		float f_234_ = (f_225_ - f) / f_231_;
		float f_235_ = (f_226_ - f_222_) / f_231_;
		float f_236_
		    = f_234_ * (float) ((Class151_Sub2) this).anInt8914;
		float f_237_
		    = f_235_ * (float) ((Class151_Sub2) this).anInt8914;
		float f_238_
		    = f_232_ * (float) ((Class151_Sub2) this).anInt8907;
		float f_239_
		    = f_233_ * (float) ((Class151_Sub2) this).anInt8907;
		float f_240_
		    = -f_232_ * (float) ((Class151_Sub2) this).anInt8905;
		float f_241_
		    = -f_233_ * (float) ((Class151_Sub2) this).anInt8905;
		float f_242_
		    = -f_234_ * (float) ((Class151_Sub2) this).anInt8912;
		float f_243_
		    = -f_235_ * (float) ((Class151_Sub2) this).anInt8912;
		f = f + f_238_ + f_236_;
		f_222_ = f_222_ + f_239_ + f_237_;
		f_223_ = f_223_ + f_240_ + f_236_;
		f_224_ = f_224_ + f_241_ + f_237_;
		f_225_ = f_225_ + f_238_ + f_242_;
		f_226_ = f_226_ + f_239_ + f_243_;
	    }
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i, i_227_);
	    float f_244_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -65).method2074();
	    float f_245_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -22).method2070();
	    class321.aClass418_3470.method5013();
	    class321.aClass418_3470.aFloatArray4768[0]
		= (f_223_ - f) * 2.0F / f_244_;
	    class321.aClass418_3470.aFloatArray4768[1]
		= (f_224_ - f_222_) * 2.0F / f_245_;
	    class321.aClass418_3470.aFloatArray4768[4]
		= (f_225_ - f) * 2.0F / f_244_;
	    class321.aClass418_3470.aFloatArray4768[5]
		= (f_226_ - f_222_) * 2.0F / f_245_;
	    class321.aClass418_3470.aFloatArray4768[12]
		= ((f
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_244_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= ((f_222_
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_245_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method4976
		(((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 1.0F, 1.0F);
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    class321.method4206();
	}
    }
    
    public int method1809() {
	return ((Class151_Sub2) this).anInt8904;
    }
    
    public void method1787(int i, int i_246_, int i_247_) {
	int[] is = (((Class151_Sub2) this).aClass173_Sub1_8909.method2208
		    (i, i_246_, ((Class151_Sub2) this).anInt8904,
		     ((Class151_Sub2) this).anInt8908));
	int[] is_248_ = new int[(((Class151_Sub2) this).anInt8904
				 * ((Class151_Sub2) this).anInt8908)];
	((Class151_Sub2) this).anInterface34_8913.method219
	    (0, 0, ((Class151_Sub2) this).anInt8904,
	     ((Class151_Sub2) this).anInt8908, is_248_, 0);
	if (i_247_ == 0) {
	    for (int i_249_ = 0; i_249_ < ((Class151_Sub2) this).anInt8908;
		 i_249_++) {
		int i_250_ = i_249_ * ((Class151_Sub2) this).anInt8904;
		for (int i_251_ = 0; i_251_ < ((Class151_Sub2) this).anInt8904;
		     i_251_++)
		    is_248_[i_250_ + i_251_]
			= (is_248_[i_250_ + i_251_] & 0xffffff
			   | is[i_250_ + i_251_] << 8 & ~0xffffff);
	    }
	} else if (i_247_ == 1) {
	    for (int i_252_ = 0; i_252_ < ((Class151_Sub2) this).anInt8908;
		 i_252_++) {
		int i_253_ = i_252_ * ((Class151_Sub2) this).anInt8904;
		for (int i_254_ = 0; i_254_ < ((Class151_Sub2) this).anInt8904;
		     i_254_++)
		    is_248_[i_253_ + i_254_]
			= (is_248_[i_253_ + i_254_] & 0xffffff
			   | is[i_253_ + i_254_] << 16 & ~0xffffff);
	    }
	} else if (i_247_ == 2) {
	    for (int i_255_ = 0; i_255_ < ((Class151_Sub2) this).anInt8908;
		 i_255_++) {
		int i_256_ = i_255_ * ((Class151_Sub2) this).anInt8904;
		for (int i_257_ = 0; i_257_ < ((Class151_Sub2) this).anInt8904;
		     i_257_++)
		    is_248_[i_256_ + i_257_]
			= (is_248_[i_256_ + i_257_] & 0xffffff
			   | is[i_256_ + i_257_] << 24 & ~0xffffff);
	    }
	} else if (i_247_ == 3) {
	    for (int i_258_ = 0; i_258_ < ((Class151_Sub2) this).anInt8908;
		 i_258_++) {
		int i_259_ = i_258_ * ((Class151_Sub2) this).anInt8904;
		for (int i_260_ = 0; i_260_ < ((Class151_Sub2) this).anInt8904;
		     i_260_++)
		    is_248_[i_259_ + i_260_]
			= (is_248_[i_259_ + i_260_] & 0xffffff
			   | (is[i_259_ + i_260_] != 0 ? -16777216 : 0));
	    }
	}
	method1770(0, 0, ((Class151_Sub2) this).anInt8904,
		   ((Class151_Sub2) this).anInt8908, is_248_, 0,
		   ((Class151_Sub2) this).anInt8904);
    }
    
    public void method1814(int i, int i_261_, int i_262_, int i_263_,
			   int i_264_, int i_265_, int i_266_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575) {
	    int i_267_ = i_261_ + i_263_;
	    int i_268_ = i + i_262_;
	    int i_269_ = method40();
	    int i_270_ = method1768();
	    int i_271_ = i_261_ + ((Class151_Sub2) this).anInt8914;
	    for (int i_272_ = i_271_ + ((Class151_Sub2) this).anInt8908;
		 i_272_ <= i_267_; i_272_ += i_270_) {
		int i_273_ = i + ((Class151_Sub2) this).anInt8907;
		for (int i_274_ = i_273_ + ((Class151_Sub2) this).anInt8904;
		     i_274_ <= i_268_; i_274_ += i_269_) {
		    ((Class173_Sub1)
		     ((Class151_Sub2) this).aClass173_Sub1_8909)
			.aClass371_9321.method4653
			((float) i_273_, (float) i_271_,
			 (float) (i_273_ + ((Class151_Sub2) this).anInt8904),
			 (float) (i_271_ + ((Class151_Sub2) this).anInt8908),
			 0.0F, 0.0F,
			 ((Class151_Sub2) this).anInterface34_8913.method245(),
			 ((Class151_Sub2) this).anInterface34_8913.method217(),
			 ((Class151_Sub2) this).anInterface34_8913, i_265_);
		    i_273_ += i_269_;
		}
		if (i_273_ < i_268_) {
		    int i_275_ = i_268_ - i_273_;
		    ((Class173_Sub1)
		     ((Class151_Sub2) this).aClass173_Sub1_8909)
			.aClass371_9321.method4653
			((float) i_273_, (float) i_271_,
			 (float) (i_273_ + i_275_),
			 (float) (i_271_ + ((Class151_Sub2) this).anInt8908),
			 0.0F, 0.0F,
			 ((float) i_275_
			  / (float) ((Class151_Sub2) this).anInt8904
			  * ((Class151_Sub2) this).anInterface34_8913
				.method245()),
			 ((Class151_Sub2) this).anInterface34_8913.method217(),
			 ((Class151_Sub2) this).anInterface34_8913, i_265_);
		}
		i_271_ += i_270_;
	    }
	    if (i_271_ < i_267_) {
		int i_276_ = i_267_ - i_271_;
		float f = ((float) i_276_
			   / (float) ((Class151_Sub2) this).anInt8908
			   * ((Class151_Sub2) this).anInterface34_8913
				 .method217());
		int i_277_ = i + ((Class151_Sub2) this).anInt8907;
		for (int i_278_ = i_277_ + ((Class151_Sub2) this).anInt8904;
		     i_278_ <= i_268_; i_278_ += i_269_) {
		    ((Class173_Sub1)
		     ((Class151_Sub2) this).aClass173_Sub1_8909)
			.aClass371_9321.method4653
			((float) i_277_, (float) i_271_,
			 (float) (i_277_ + ((Class151_Sub2) this).anInt8904),
			 (float) (i_271_ + i_276_), 0.0F, 0.0F,
			 ((Class151_Sub2) this).anInterface34_8913.method245(),
			 f, ((Class151_Sub2) this).anInterface34_8913, i_265_);
		    i_277_ += i_269_;
		}
		if (i_277_ < i_268_) {
		    int i_279_ = i_268_ - i_277_;
		    ((Class173_Sub1)
		     ((Class151_Sub2) this).aClass173_Sub1_8909)
			.aClass371_9321.method4653
			((float) i_277_, (float) i_271_,
			 (float) (i_277_ + i_279_), (float) (i_271_ + i_276_),
			 0.0F, 0.0F,
			 ((float) i_279_
			  / (float) ((Class151_Sub2) this).anInt8904
			  * ((Class151_Sub2) this).anInterface34_8913
				.method245()),
			 f, ((Class151_Sub2) this).anInterface34_8913, i_265_);
		}
	    }
	} else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_266_);
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i_264_, i_265_);
	    float f
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -54).method2074();
	    float f_280_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -17).method2070();
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    boolean bool = (((Class151_Sub2) this).aBool8917
			    && ((Class151_Sub2) this).anInt8914 == 0
			    && ((Class151_Sub2) this).anInt8912 == 0);
	    boolean bool_281_ = (((Class151_Sub2) this).aBool8916
				 && ((Class151_Sub2) this).anInt8907 == 0
				 && ((Class151_Sub2) this).anInt8905 == 0);
	    if (bool_281_ & bool) {
		class321.aClass418_3470.method4976((float) i_262_ * 2.0F / f,
						   ((float) i_263_ * 2.0F
						    / f_280_),
						   1.0F, 1.0F);
		class321.aClass418_3470.aFloatArray4768[12]
		    = ((float) i + ((Class151_Sub2) this)
				       .aClass173_Sub1_8909
				       .method8468()) * 2.0F / f - 1.0F;
		class321.aClass418_3470.aFloatArray4768[13]
		    = (((float) i_261_ + ((Class151_Sub2) this)
					     .aClass173_Sub1_8909.method8468())
		       * 2.0F / f_280_) - 1.0F;
		class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
		class321.aClass418_3471.method4976
		    (((Class151_Sub2) this).anInterface34_8913
			 .method207((float) i_262_),
		     ((Class151_Sub2) this).anInterface34_8913
			 .method221((float) i_263_),
		     1.0F, 1.0F);
		class321.method4206();
	    } else if (bool_281_) {
		int i_282_ = i_261_ + i_263_;
		int i_283_ = method1768();
		class321.aClass418_3471.method4976
		    (((Class151_Sub2) this).anInterface34_8913
			 .method207((float) i_262_),
		     ((Class151_Sub2) this).anInterface34_8913
			 .method221((float) ((Class151_Sub2) this).anInt8908),
		     1.0F, 1.0F);
		int i_284_ = i_261_ + ((Class151_Sub2) this).anInt8914;
		for (int i_285_ = i_284_ + ((Class151_Sub2) this).anInt8908;
		     i_285_ <= i_282_; i_285_ += i_283_) {
		    class321.aClass418_3470.method4976
			((float) i_262_ * 2.0F / f,
			 ((float) ((Class151_Sub2) this).anInt8908 * 2.0F
			  / f_280_),
			 1.0F, 1.0F);
		    class321.aClass418_3470.aFloatArray4768[12]
			= (((float) i + ((Class151_Sub2) this)
					    .aClass173_Sub1_8909.method8468())
			   * 2.0F / f) - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[13]
			= ((float) i_284_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f_280_ - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
		    class321.method4206();
		    i_284_ += i_283_;
		}
		if (i_284_ < i_282_) {
		    int i_286_ = i_282_ - i_284_;
		    class321.aClass418_3471.method4976
			(((Class151_Sub2) this).anInterface34_8913
			     .method207((float) i_262_),
			 ((Class151_Sub2) this).anInterface34_8913
			     .method221((float) i_286_),
			 1.0F, 1.0F);
		    class321.aClass418_3470.method4976(((float) i_262_ * 2.0F
							/ f),
						       ((float) i_286_ * 2.0F
							/ f_280_),
						       1.0F, 1.0F);
		    class321.aClass418_3470.aFloatArray4768[12]
			= (((float) i + ((Class151_Sub2) this)
					    .aClass173_Sub1_8909.method8468())
			   * 2.0F / f) - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[13]
			= ((float) i_284_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f_280_ - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
		    class321.method4206();
		}
	    } else if (bool) {
		int i_287_ = i + i_262_;
		int i_288_ = method40();
		class321.aClass418_3471.method4976
		    (((Class151_Sub2) this).anInterface34_8913
			 .method207((float) ((Class151_Sub2) this).anInt8904),
		     ((Class151_Sub2) this).anInterface34_8913
			 .method221((float) i_263_),
		     1.0F, 1.0F);
		int i_289_ = i + ((Class151_Sub2) this).anInt8907;
		for (int i_290_ = i_289_ + ((Class151_Sub2) this).anInt8904;
		     i_290_ <= i_287_; i_290_ += i_288_) {
		    class321.aClass418_3470.method4976
			((float) ((Class151_Sub2) this).anInt8904 * 2.0F / f,
			 (float) i_263_ * 2.0F / f_280_, 1.0F, 1.0F);
		    class321.aClass418_3470.aFloatArray4768[12]
			= ((float) i_289_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[13]
			= ((float) i_261_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f_280_ - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
		    class321.method4206();
		    i_289_ += i_288_;
		}
		if (i_289_ < i_287_) {
		    int i_291_ = i_287_ - i_289_;
		    class321.aClass418_3471.method4976
			(((Class151_Sub2) this).anInterface34_8913
			     .method207((float) i_291_),
			 ((Class151_Sub2) this).anInterface34_8913
			     .method221((float) i_263_),
			 1.0F, 1.0F);
		    class321.aClass418_3470.method4976(((float) i_291_ * 2.0F
							/ f),
						       ((float) i_263_ * 2.0F
							/ f_280_),
						       1.0F, 1.0F);
		    class321.aClass418_3470.aFloatArray4768[12]
			= ((float) i_289_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[13]
			= ((float) i_261_
			   + ((Class151_Sub2) this).aClass173_Sub1_8909
				 .method8468()) * 2.0F / f_280_ - 1.0F;
		    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
		    class321.method4206();
		}
	    } else {
		int i_292_ = i_261_ + i_263_;
		int i_293_ = i + i_262_;
		int i_294_ = method40();
		int i_295_ = method1768();
		int i_296_ = i_261_ + ((Class151_Sub2) this).anInt8914;
		for (int i_297_ = i_296_ + ((Class151_Sub2) this).anInt8908;
		     i_297_ <= i_292_; i_297_ += i_295_) {
		    class321.aClass418_3471.method4976
			((((Class151_Sub2) this).anInterface34_8913.method207
			  ((float) ((Class151_Sub2) this).anInt8904)),
			 (((Class151_Sub2) this).anInterface34_8913.method221
			  ((float) ((Class151_Sub2) this).anInt8908)),
			 1.0F, 1.0F);
		    int i_298_ = i + ((Class151_Sub2) this).anInt8907;
		    for (int i_299_
			     = i_298_ + ((Class151_Sub2) this).anInt8904;
			 i_299_ <= i_293_; i_299_ += i_294_) {
			class321.aClass418_3470.method4976
			    (((float) ((Class151_Sub2) this).anInt8904 * 2.0F
			      / f),
			     ((float) ((Class151_Sub2) this).anInt8908 * 2.0F
			      / f_280_),
			     1.0F, 1.0F);
			class321.aClass418_3470.aFloatArray4768[12]
			    = ((float) i_298_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f - 1.0F;
			class321.aClass418_3470.aFloatArray4768[13]
			    = ((float) i_296_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f_280_ - 1.0F;
			class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
			class321.method4206();
			i_298_ += i_294_;
		    }
		    if (i_298_ < i_293_) {
			int i_300_ = i_293_ - i_298_;
			class321.aClass418_3471.method4976
			    (((Class151_Sub2) this).anInterface34_8913
				 .method207((float) i_300_),
			     (((Class151_Sub2) this).anInterface34_8913
				  .method221
			      ((float) ((Class151_Sub2) this).anInt8908)),
			     1.0F, 1.0F);
			class321.aClass418_3470.method4976
			    ((float) i_300_ * 2.0F / f,
			     ((float) ((Class151_Sub2) this).anInt8908 * 2.0F
			      / f_280_),
			     1.0F, 1.0F);
			class321.aClass418_3470.aFloatArray4768[12]
			    = ((float) i_298_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f - 1.0F;
			class321.aClass418_3470.aFloatArray4768[13]
			    = ((float) i_296_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f_280_ - 1.0F;
			class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
			class321.method4206();
		    }
		    i_296_ += i_295_;
		}
		if (i_296_ < i_292_) {
		    int i_301_ = i_292_ - i_296_;
		    class321.aClass418_3471.method4976
			((((Class151_Sub2) this).anInterface34_8913.method207
			  ((float) ((Class151_Sub2) this).anInt8904)),
			 ((Class151_Sub2) this).anInterface34_8913
			     .method221((float) i_301_),
			 1.0F, 1.0F);
		    int i_302_ = i + ((Class151_Sub2) this).anInt8907;
		    for (int i_303_
			     = i_302_ + ((Class151_Sub2) this).anInt8904;
			 i_303_ <= i_293_; i_303_ += i_294_) {
			class321.aClass418_3470.method4976
			    (((float) ((Class151_Sub2) this).anInt8904 * 2.0F
			      / f),
			     (float) i_301_ * 2.0F / f_280_, 1.0F, 1.0F);
			class321.aClass418_3470.aFloatArray4768[12]
			    = ((float) i_302_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f - 1.0F;
			class321.aClass418_3470.aFloatArray4768[13]
			    = ((float) i_296_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f_280_ - 1.0F;
			class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
			class321.method4206();
			i_302_ += i_294_;
		    }
		    if (i_302_ < i_293_) {
			int i_304_ = i_293_ - i_302_;
			class321.aClass418_3471.method4976
			    (((Class151_Sub2) this).anInterface34_8913
				 .method207((float) i_304_),
			     ((Class151_Sub2) this).anInterface34_8913
				 .method221((float) i_301_),
			     1.0F, 1.0F);
			class321.aClass418_3470.method4976(((float) i_304_
							    * 2.0F / f),
							   ((float) i_301_
							    * 2.0F / f_280_),
							   1.0F, 1.0F);
			class321.aClass418_3470.aFloatArray4768[12]
			    = ((float) i_302_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f - 1.0F;
			class321.aClass418_3470.aFloatArray4768[13]
			    = ((float) i_296_
			       + ((Class151_Sub2) this).aClass173_Sub1_8909
				     .method8468()) * 2.0F / f_280_ - 1.0F;
			class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
			class321.method4206();
		    }
		}
	    }
	}
    }
    
    Class151_Sub2(Class173_Sub1 class173_sub1, int i, int i_305_, int[] is,
		  int i_306_, int i_307_) {
	((Class151_Sub2) this).anInt8907 = 0;
	((Class151_Sub2) this).anInt8912 = 0;
	((Class151_Sub2) this).anInt8905 = 0;
	((Class151_Sub2) this).aClass173_Sub1_8909 = class173_sub1;
	((Class151_Sub2) this).anInt8904 = i;
	((Class151_Sub2) this).anInt8908 = i_305_;
	((Class151_Sub2) this).anInterface19_8906 = null;
	((Class151_Sub2) this).anInterface34_8913
	    = class173_sub1.method8522(i, i_305_, false, is, i_306_, i_307_);
	((Class151_Sub2) this).anInterface34_8913.method220(true, true);
	((Class151_Sub2) this).aBool8911
	    = ((Class151_Sub2) this).anInterface34_8913.method1() != i;
	((Class151_Sub2) this).aBool8915
	    = ((Class151_Sub2) this).anInterface34_8913.method68() != i_305_;
	((Class151_Sub2) this).aBool8916
	    = (!((Class151_Sub2) this).aBool8911
	       && ((Class151_Sub2) this).anInterface34_8913.method232());
	((Class151_Sub2) this).aBool8917
	    = (!((Class151_Sub2) this).aBool8915
	       && ((Class151_Sub2) this).anInterface34_8913.method232());
    }
    
    public void method1771(int i, int i_308_, int i_309_, int i_310_, int[] is,
			   int[] is_311_, int i_312_, int i_313_) {
	((Class151_Sub2) this).anInterface34_8913
	    .method206(i, i_308_, i_309_, i_310_, is, is_311_, i_312_);
    }
    
    public int method1819() {
	return (((Class151_Sub2) this).anInt8908
		+ ((Class151_Sub2) this).anInt8914
		+ ((Class151_Sub2) this).anInt8912);
    }
    
    public Interface19 method1800() {
	return ((Class151_Sub2) this).anInterface19_8906;
    }
    
    public int method37() {
	return (((Class151_Sub2) this).anInt8904
		+ ((Class151_Sub2) this).anInt8907
		+ ((Class151_Sub2) this).anInt8905);
    }
    
    void method1815(float f, float f_314_, float f_315_, float f_316_,
		    float f_317_, float f_318_, int i, int i_319_, int i_320_,
		    int i_321_) {
	if (((Class151_Sub2) this).aClass173_Sub1_8909.method8687()
	    != Class336.aClass336_3575)
	    ((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		.aClass371_9321.method4657
		(f, f_314_, f_315_, f_316_, f_317_, f_318_,
		 f_315_ + f_317_ - f, f_316_ + f_318_ - f_314_, 0.0F, 0.0F,
		 ((Class151_Sub2) this).anInterface34_8913.method245(), 0.0F,
		 0.0F, ((Class151_Sub2) this).anInterface34_8913.method217(),
		 ((Class151_Sub2) this).anInterface34_8913.method245(),
		 ((Class151_Sub2) this).anInterface34_8913.method217(),
		 ((Class151_Sub2) this).anInterface34_8913, i_319_);
	else {
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	    ((Class151_Sub2) this).aClass173_Sub1_8909.method8479(i_320_);
	    if (((Class151_Sub2) this).aBool8910) {
		float f_322_ = (float) method40();
		float f_323_ = (float) method1768();
		float f_324_ = (f_315_ - f) / f_322_;
		float f_325_ = (f_316_ - f_314_) / f_322_;
		float f_326_ = (f_317_ - f) / f_323_;
		float f_327_ = (f_318_ - f_314_) / f_323_;
		float f_328_
		    = f_326_ * (float) ((Class151_Sub2) this).anInt8914;
		float f_329_
		    = f_327_ * (float) ((Class151_Sub2) this).anInt8914;
		float f_330_
		    = f_324_ * (float) ((Class151_Sub2) this).anInt8907;
		float f_331_
		    = f_325_ * (float) ((Class151_Sub2) this).anInt8907;
		float f_332_
		    = -f_324_ * (float) ((Class151_Sub2) this).anInt8905;
		float f_333_
		    = -f_325_ * (float) ((Class151_Sub2) this).anInt8905;
		float f_334_
		    = -f_326_ * (float) ((Class151_Sub2) this).anInt8912;
		float f_335_
		    = -f_327_ * (float) ((Class151_Sub2) this).anInt8912;
		f = f + f_330_ + f_328_;
		f_314_ = f_314_ + f_331_ + f_329_;
		f_315_ = f_315_ + f_332_ + f_328_;
		f_316_ = f_316_ + f_333_ + f_329_;
		f_317_ = f_317_ + f_330_ + f_334_;
		f_318_ = f_318_ + f_331_ + f_335_;
	    }
	    Class321 class321
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass321_9325);
	    class321.anInterface34_3472
		= ((Class151_Sub2) this).anInterface34_8913;
	    class321.method4204(i, i_319_);
	    float f_336_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -98).method2074();
	    float f_337_
		= (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			      ((byte) -75).method2070();
	    class321.aClass418_3470.method5013();
	    class321.aClass418_3470.aFloatArray4768[0]
		= (f_315_ - f) * 2.0F / f_336_;
	    class321.aClass418_3470.aFloatArray4768[1]
		= (f_316_ - f_314_) * 2.0F / f_337_;
	    class321.aClass418_3470.aFloatArray4768[4]
		= (f_317_ - f) * 2.0F / f_336_;
	    class321.aClass418_3470.aFloatArray4768[5]
		= (f_318_ - f_314_) * 2.0F / f_337_;
	    class321.aClass418_3470.aFloatArray4768[12]
		= ((f
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_336_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[13]
		= ((f_314_
		    + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468())
		   * 2.0F / f_337_) - 1.0F;
	    class321.aClass418_3470.aFloatArray4768[14] = -1.0F;
	    class321.aClass418_3471.method4976
		(((Class151_Sub2) this).anInterface34_8913
		     .method207((float) ((Class151_Sub2) this).anInt8904),
		 ((Class151_Sub2) this).anInterface34_8913
		     .method221((float) ((Class151_Sub2) this).anInt8908),
		 1.0F, 1.0F);
	    class321.anInterface36_3473
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .anInterface36_9372);
	    class321.anInt3467 = 0;
	    class321.aClass344_3468
		= (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
		   .aClass344_9375);
	    class321.method4206();
	}
    }
    
    void method1816(float f, float f_338_, float f_339_, float f_340_,
		    float f_341_, float f_342_, int i, Class148 class148,
		    int i_343_, int i_344_) {
	((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	Class321 class321
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .aClass321_9325);
	class321.anInterface34_3472
	    = ((Class151_Sub2) this).anInterface34_8913;
	class321.method4204(1, -1);
	float f_345_
	    = (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			  ((byte) -86).method2074();
	float f_346_
	    = (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			  ((byte) -18).method2070();
	class321.aClass418_3470.method5013();
	if (((Class151_Sub2) this).aBool8910) {
	    float f_347_ = ((float) ((Class151_Sub2) this).anInt8904
			    / (float) method40());
	    float f_348_ = ((float) ((Class151_Sub2) this).anInt8908
			    / (float) method1768());
	    class321.aClass418_3470.aFloatArray4768[0] = (f_339_ - f) * f_347_;
	    class321.aClass418_3470.aFloatArray4768[1]
		= (f_340_ - f_338_) * f_347_;
	    class321.aClass418_3470.aFloatArray4768[4] = (f_341_ - f) * f_348_;
	    class321.aClass418_3470.aFloatArray4768[5]
		= (f_342_ - f_338_) * f_348_;
	    class321.aClass418_3470.aFloatArray4768[12]
		= ((f + (float) ((Class151_Sub2) this).anInt8907) * f_347_
		   + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468());
	    class321.aClass418_3470.aFloatArray4768[13]
		= ((f_338_ + (float) ((Class151_Sub2) this).anInt8914) * f_348_
		   + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468());
	} else {
	    class321.aClass418_3470.aFloatArray4768[0] = f_339_ - f;
	    class321.aClass418_3470.aFloatArray4768[1] = f_340_ - f_338_;
	    class321.aClass418_3470.aFloatArray4768[4] = f_341_ - f;
	    class321.aClass418_3470.aFloatArray4768[5] = f_342_ - f_338_;
	    class321.aClass418_3470.aFloatArray4768[12]
		= f + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468();
	    class321.aClass418_3470.aFloatArray4768[13]
		= (f_338_
		   + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468());
	}
	Class418 class418
	    = ((Class151_Sub2) this).aClass173_Sub1_8909.aClass418_9243;
	class418.method5013();
	class418.aFloatArray4768[0] = 2.0F / f_345_;
	class418.aFloatArray4768[5] = 2.0F / f_346_;
	class418.aFloatArray4768[12] = -1.0F;
	class418.aFloatArray4768[13] = -1.0F;
	class418.aFloatArray4768[14] = -1.0F;
	class321.aClass418_3470.method4974(class418);
	class321.aClass418_3471.method4976
	    (((Class151_Sub2) this).anInterface34_8913
		 .method207((float) ((Class151_Sub2) this).anInt8904),
	     ((Class151_Sub2) this).anInterface34_8913
		 .method221((float) ((Class151_Sub2) this).anInt8908),
	     1.0F, 1.0F);
	class321.anInterface36_3473
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .anInterface36_9372);
	class321.anInt3467 = 0;
	class321.aClass344_3468
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .aClass344_9375);
	Interface34 interface34
	    = ((Class148_Sub2) (Class148_Sub2) class148).anInterface34_8885;
	class321.anInterface34_3469 = interface34;
	class321.aClass418_3475.method5013();
	class321.aClass418_3475.aFloatArray4768[0]
	    = (f_339_ - f) * interface34.method207(1.0F);
	class321.aClass418_3475.aFloatArray4768[1]
	    = (f_340_ - f_338_) * interface34.method207(1.0F);
	class321.aClass418_3475.aFloatArray4768[4]
	    = (f_341_ - f) * interface34.method221(1.0F);
	class321.aClass418_3475.aFloatArray4768[5]
	    = (f_342_ - f_338_) * interface34.method221(1.0F);
	class321.aClass418_3475.aFloatArray4768[12]
	    = (f - (float) i_343_) * interface34.method207(1.0F);
	class321.aClass418_3475.aFloatArray4768[13]
	    = (f_338_ - (float) i_344_) * interface34.method221(1.0F);
	class321.method4207();
    }
    
    void method1817(float f, float f_349_, float f_350_, float f_351_,
		    float f_352_, float f_353_, int i, Class148 class148,
		    int i_354_, int i_355_) {
	((Class151_Sub2) this).aClass173_Sub1_8909.method8564();
	Class321 class321
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .aClass321_9325);
	class321.anInterface34_3472
	    = ((Class151_Sub2) this).anInterface34_8913;
	class321.method4204(1, -1);
	float f_356_
	    = (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			  ((byte) -7).method2074();
	float f_357_
	    = (float) ((Class151_Sub2) this).aClass173_Sub1_8909.method2403
			  ((byte) -65).method2070();
	class321.aClass418_3470.method5013();
	if (((Class151_Sub2) this).aBool8910) {
	    float f_358_ = ((float) ((Class151_Sub2) this).anInt8904
			    / (float) method40());
	    float f_359_ = ((float) ((Class151_Sub2) this).anInt8908
			    / (float) method1768());
	    class321.aClass418_3470.aFloatArray4768[0] = (f_350_ - f) * f_358_;
	    class321.aClass418_3470.aFloatArray4768[1]
		= (f_351_ - f_349_) * f_358_;
	    class321.aClass418_3470.aFloatArray4768[4] = (f_352_ - f) * f_359_;
	    class321.aClass418_3470.aFloatArray4768[5]
		= (f_353_ - f_349_) * f_359_;
	    class321.aClass418_3470.aFloatArray4768[12]
		= ((f + (float) ((Class151_Sub2) this).anInt8907) * f_358_
		   + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468());
	    class321.aClass418_3470.aFloatArray4768[13]
		= ((f_349_ + (float) ((Class151_Sub2) this).anInt8914) * f_359_
		   + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468());
	} else {
	    class321.aClass418_3470.aFloatArray4768[0] = f_350_ - f;
	    class321.aClass418_3470.aFloatArray4768[1] = f_351_ - f_349_;
	    class321.aClass418_3470.aFloatArray4768[4] = f_352_ - f;
	    class321.aClass418_3470.aFloatArray4768[5] = f_353_ - f_349_;
	    class321.aClass418_3470.aFloatArray4768[12]
		= f + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468();
	    class321.aClass418_3470.aFloatArray4768[13]
		= (f_349_
		   + ((Class151_Sub2) this).aClass173_Sub1_8909.method8468());
	}
	Class418 class418
	    = ((Class151_Sub2) this).aClass173_Sub1_8909.aClass418_9243;
	class418.method5013();
	class418.aFloatArray4768[0] = 2.0F / f_356_;
	class418.aFloatArray4768[5] = 2.0F / f_357_;
	class418.aFloatArray4768[12] = -1.0F;
	class418.aFloatArray4768[13] = -1.0F;
	class418.aFloatArray4768[14] = -1.0F;
	class321.aClass418_3470.method4974(class418);
	class321.aClass418_3471.method4976
	    (((Class151_Sub2) this).anInterface34_8913
		 .method207((float) ((Class151_Sub2) this).anInt8904),
	     ((Class151_Sub2) this).anInterface34_8913
		 .method221((float) ((Class151_Sub2) this).anInt8908),
	     1.0F, 1.0F);
	class321.anInterface36_3473
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .anInterface36_9372);
	class321.anInt3467 = 0;
	class321.aClass344_3468
	    = (((Class173_Sub1) ((Class151_Sub2) this).aClass173_Sub1_8909)
	       .aClass344_9375);
	Interface34 interface34
	    = ((Class148_Sub2) (Class148_Sub2) class148).anInterface34_8885;
	class321.anInterface34_3469 = interface34;
	class321.aClass418_3475.method5013();
	class321.aClass418_3475.aFloatArray4768[0]
	    = (f_350_ - f) * interface34.method207(1.0F);
	class321.aClass418_3475.aFloatArray4768[1]
	    = (f_351_ - f_349_) * interface34.method207(1.0F);
	class321.aClass418_3475.aFloatArray4768[4]
	    = (f_352_ - f) * interface34.method221(1.0F);
	class321.aClass418_3475.aFloatArray4768[5]
	    = (f_353_ - f_349_) * interface34.method221(1.0F);
	class321.aClass418_3475.aFloatArray4768[12]
	    = (f - (float) i_354_) * interface34.method207(1.0F);
	class321.aClass418_3475.aFloatArray4768[13]
	    = (f_349_ - (float) i_355_) * interface34.method221(1.0F);
	class321.method4207();
    }
}
