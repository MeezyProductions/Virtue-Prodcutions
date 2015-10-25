/* Class151_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class151_Sub1 extends Class151
{
    static int anInt8802;
    int anInt8803;
    int anInt8804;
    static int anInt8805;
    int anInt8806;
    static int anInt8807;
    int anInt8808;
    static int anInt8809;
    static final int anInt8810 = 4;
    static final int anInt8811 = 8;
    static final int anInt8812 = 12;
    static int anInt8813;
    Class173_Sub3 aClass173_Sub3_8814;
    static int anInt8815;
    static int anInt8816;
    static int anInt8817;
    static int anInt8818;
    int anInt8819;
    static int anInt8820;
    static int anInt8821;
    static int anInt8822;
    static int anInt8823;
    static int anInt8824;
    static int anInt8825;
    static int anInt8826;
    static int anInt8827;
    static int anInt8828;
    static int anInt8829;
    static int anInt8830 = 0;
    static int anInt8831 = 0;
    int anInt8832;
    static int anInt8833;
    static int anInt8834;
    int[] anIntArray8835;
    static int anInt8836;
    static int anInt8837;
    
    public int method1808() {
	return ((Class151_Sub1) this).anInt8803;
    }
    
    abstract void method8290(boolean bool, boolean bool_0_, boolean bool_1_,
			     int i, int i_2_, float f, int i_3_, int i_4_,
			     int i_5_, int i_6_, int i_7_, int i_8_,
			     boolean bool_9_);
    
    public void method1765(int[] is) {
	is[0] = ((Class151_Sub1) this).anInt8806;
	is[1] = ((Class151_Sub1) this).anInt8819;
	is[2] = ((Class151_Sub1) this).anInt8832;
	is[3] = ((Class151_Sub1) this).anInt8808;
    }
    
    public int method1766() {
	return ((Class151_Sub1) this).anInt8803;
    }
    
    public int method1767() {
	return ((Class151_Sub1) this).anInt8804;
    }
    
    public int method1768() {
	return (((Class151_Sub1) this).anInt8819
		+ ((Class151_Sub1) this).anInt8804
		+ ((Class151_Sub1) this).anInt8808);
    }
    
    public abstract void method1770(int i, int i_10_, int i_11_, int i_12_,
				    int[] is, int i_13_, int i_14_);
    
    public abstract void method1780(int i, int i_15_, int i_16_, int i_17_,
				    int i_18_);
    
    void method1764(float f, float f_19_, float f_20_, float f_21_,
		    float f_22_, float f_23_, int i, Class148 class148,
		    int i_24_, int i_25_) {
	if (((Class151_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (method8292(f, f_19_, f_20_, f_21_, f_22_, f_23_)) {
	    Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	    method8293(((Class148_Sub1) class148_sub1).anIntArray8789,
		       ((Class148_Sub1) class148_sub1).anIntArray8788,
		       anInt8813 - i_24_, -i_25_ - (anInt8816 - anInt8837));
	}
    }
    
    abstract void method1777(int i, int i_26_, int i_27_, int i_28_, int i_29_,
			     int i_30_, int i_31_, int i_32_);
    
    abstract void method8291(boolean bool, boolean bool_33_, boolean bool_34_,
			     int i, int i_35_, float f, int i_36_, int i_37_,
			     int i_38_, int i_39_, int i_40_, int i_41_,
			     boolean bool_42_);
    
    public void method1779(int i, int i_43_, int i_44_, int i_45_, int i_46_,
			   int i_47_, int i_48_) {
	if (((Class151_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (((Class151_Sub1) this).anIntArray8835 == null)
	    ((Class151_Sub1) this).anIntArray8835 = new int[4];
	((Class151_Sub1) this).aClass173_Sub3_8814
	    .method2207(((Class151_Sub1) this).anIntArray8835);
	((Class151_Sub1) this).aClass173_Sub3_8814.method2205
	    ((((Class173_Sub3) ((Class151_Sub1) this).aClass173_Sub3_8814)
	      .anInt9723) * -993497119,
	     (((Class173_Sub3) ((Class151_Sub1) this).aClass173_Sub3_8814)
	      .anInt9725) * 592117349,
	     i + i_44_, i_43_ + i_45_);
	int i_49_ = method40();
	int i_50_ = method1768();
	int i_51_ = (i_44_ + i_49_ - 1) / i_49_;
	int i_52_ = (i_45_ + i_50_ - 1) / i_50_;
	for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
	    int i_54_ = i_53_ * i_50_;
	    for (int i_55_ = 0; i_55_ < i_51_; i_55_++)
		method1780(i + i_55_ * i_49_, i_43_ + i_54_, i_46_, i_47_,
			   i_48_);
	}
	((Class151_Sub1) this).aClass173_Sub3_8814.method2204
	    (((Class151_Sub1) this).anIntArray8835[0],
	     ((Class151_Sub1) this).anIntArray8835[1],
	     ((Class151_Sub1) this).anIntArray8835[2],
	     ((Class151_Sub1) this).anIntArray8835[3]);
    }
    
    boolean method8292(float f, float f_56_, float f_57_, float f_58_,
		       float f_59_, float f_60_) {
	int i = (((Class151_Sub1) this).anInt8806
		 + ((Class151_Sub1) this).anInt8803
		 + ((Class151_Sub1) this).anInt8832);
	int i_61_ = (((Class151_Sub1) this).anInt8819
		     + ((Class151_Sub1) this).anInt8804
		     + ((Class151_Sub1) this).anInt8808);
	if (i != ((Class151_Sub1) this).anInt8803
	    || i_61_ != ((Class151_Sub1) this).anInt8804) {
	    float f_62_ = (f_57_ - f) / (float) i;
	    float f_63_ = (f_58_ - f_56_) / (float) i;
	    float f_64_ = (f_59_ - f) / (float) i_61_;
	    float f_65_ = (f_60_ - f_56_) / (float) i_61_;
	    float f_66_ = f_64_ * (float) ((Class151_Sub1) this).anInt8819;
	    float f_67_ = f_65_ * (float) ((Class151_Sub1) this).anInt8819;
	    float f_68_ = f_62_ * (float) ((Class151_Sub1) this).anInt8806;
	    float f_69_ = f_63_ * (float) ((Class151_Sub1) this).anInt8806;
	    float f_70_ = -f_62_ * (float) ((Class151_Sub1) this).anInt8832;
	    float f_71_ = -f_63_ * (float) ((Class151_Sub1) this).anInt8832;
	    float f_72_ = -f_64_ * (float) ((Class151_Sub1) this).anInt8808;
	    float f_73_ = -f_65_ * (float) ((Class151_Sub1) this).anInt8808;
	    f += f_68_ + f_66_;
	    f_56_ += f_69_ + f_67_;
	    f_57_ += f_70_ + f_66_;
	    f_58_ += f_71_ + f_67_;
	    f_59_ += f_68_ + f_72_;
	    f_60_ += f_69_ + f_73_;
	}
	float f_74_ = f_59_ + (f_57_ - f);
	float f_75_ = f_58_ + (f_60_ - f_56_);
	float f_76_;
	float f_77_;
	if (f < f_57_) {
	    f_76_ = f;
	    f_77_ = f_57_;
	} else {
	    f_76_ = f_57_;
	    f_77_ = f;
	}
	if (f_59_ < f_76_)
	    f_76_ = f_59_;
	if (f_74_ < f_76_)
	    f_76_ = f_74_;
	if (f_59_ > f_77_)
	    f_77_ = f_59_;
	if (f_74_ > f_77_)
	    f_77_ = f_74_;
	float f_78_;
	float f_79_;
	if (f_56_ < f_58_) {
	    f_78_ = f_56_;
	    f_79_ = f_58_;
	} else {
	    f_78_ = f_58_;
	    f_79_ = f_56_;
	}
	if (f_60_ < f_78_)
	    f_78_ = f_60_;
	if (f_75_ < f_78_)
	    f_78_ = f_75_;
	if (f_60_ > f_79_)
	    f_79_ = f_60_;
	if (f_75_ > f_79_)
	    f_79_ = f_75_;
	if (f_76_ < (float) (((Class173_Sub3) (((Class151_Sub1) this)
					       .aClass173_Sub3_8814)).anInt9723
			     * -993497119))
	    f_76_ = (float) (((Class173_Sub3) (((Class151_Sub1) this)
					       .aClass173_Sub3_8814)).anInt9723
			     * -993497119);
	if (f_77_ > (float) (((Class173_Sub3) (((Class151_Sub1) this)
					       .aClass173_Sub3_8814)).anInt9724
			     * 630968029))
	    f_77_ = (float) (((Class173_Sub3) (((Class151_Sub1) this)
					       .aClass173_Sub3_8814)).anInt9724
			     * 630968029);
	if (f_78_ < (float) (((Class173_Sub3) (((Class151_Sub1) this)
					       .aClass173_Sub3_8814)).anInt9725
			     * 592117349))
	    f_78_ = (float) (((Class173_Sub3) (((Class151_Sub1) this)
					       .aClass173_Sub3_8814)).anInt9725
			     * 592117349);
	if (f_79_ > (float) (((Class173_Sub3) (((Class151_Sub1) this)
					       .aClass173_Sub3_8814)).anInt9726
			     * 6965409))
	    f_79_ = (float) (((Class173_Sub3) (((Class151_Sub1) this)
					       .aClass173_Sub3_8814)).anInt9726
			     * 6965409);
	f_77_ = f_76_ - f_77_;
	if (f_77_ >= 0.0F)
	    return false;
	f_79_ = f_78_ - f_79_;
	if (f_79_ >= 0.0F)
	    return false;
	anInt8817
	    = (((Class173_Sub3) ((Class151_Sub1) this).aClass173_Sub3_8814)
	       .anInt9735) * 111437289;
	anInt8818 = (int) ((float) ((int) f_78_ * anInt8817) + f_76_);
	float f_80_
	    = (f_57_ - f) * (f_60_ - f_56_) - (f_58_ - f_56_) * (f_59_ - f);
	float f_81_
	    = (f_59_ - f) * (f_58_ - f_56_) - (f_60_ - f_56_) * (f_57_ - f);
	anInt8822 = (int) ((f_60_ - f_56_) * 4096.0F
			   * (float) ((Class151_Sub1) this).anInt8803 / f_80_);
	anInt8825 = (int) ((f_58_ - f_56_) * 4096.0F
			   * (float) ((Class151_Sub1) this).anInt8804 / f_81_);
	anInt8821 = (int) ((f_59_ - f) * 4096.0F
			   * (float) ((Class151_Sub1) this).anInt8803 / f_81_);
	anInt8802 = (int) ((f_57_ - f) * 4096.0F
			   * (float) ((Class151_Sub1) this).anInt8804 / f_80_);
	anInt8823 = (int) (f_76_ * 16.0F + 8.0F
			   - (f + f_57_ + f_59_ + f_74_) / 4.0F * 16.0F);
	anInt8824 = (int) (f_78_ * 16.0F + 8.0F
			   - (f_56_ + f_58_ + f_60_ + f_75_) / 4.0F * 16.0F);
	anInt8807 = ((((Class151_Sub1) this).anInt8803 >> 1 << 12)
		     + (anInt8824 * anInt8821 >> 4));
	anInt8826 = ((((Class151_Sub1) this).anInt8804 >> 1 << 12)
		     + (anInt8824 * anInt8802 >> 4));
	anInt8805 = anInt8823 * anInt8822 >> 4;
	anInt8828 = anInt8823 * anInt8825 >> 4;
	anInt8813 = (int) f_76_;
	anInt8809 = (int) f_77_;
	anInt8837 = (int) f_78_;
	anInt8816 = (int) f_79_;
	return true;
    }
    
    void method1785(float f, float f_82_, float f_83_, float f_84_,
		    float f_85_, float f_86_, int i, int i_87_, int i_88_,
		    int i_89_) {
	if (((Class151_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (method8292(f, f_82_, f_83_, f_84_, f_85_, f_86_)) {
	    anInt8829 = i_87_;
	    if (i != 1) {
		anInt8830 = i_87_ >>> 24;
		anInt8831 = 256 - anInt8830;
		if (i == 0) {
		    anInt8815 = (i_87_ & 0xff0000) >> 16;
		    anInt8833 = (i_87_ & 0xff00) >> 8;
		    anInt8836 = i_87_ & 0xff;
		} else if (i == 2) {
		    anInt8827 = i_87_ >>> 24;
		    anInt8820 = 256 - anInt8827;
		    int i_90_ = (i_87_ & 0xff00ff) * anInt8820 & ~0xff00ff;
		    int i_91_ = (i_87_ & 0xff00) * anInt8820 & 0xff0000;
		    anInt8834 = (i_90_ | i_91_) >>> 8;
		}
	    }
	    method8299(i, i_88_);
	}
    }
    
    public int method40() {
	return (((Class151_Sub1) this).anInt8806
		+ ((Class151_Sub1) this).anInt8803
		+ ((Class151_Sub1) this).anInt8832);
    }
    
    public abstract void method1775(int i, int i_92_, Class148 class148,
				    int i_93_, int i_94_);
    
    abstract void method8293(int[] is, int[] is_95_, int i, int i_96_);
    
    public int method1820() {
	return ((Class151_Sub1) this).anInt8804;
    }
    
    public int method1809() {
	return ((Class151_Sub1) this).anInt8803;
    }
    
    public abstract void method1789(int i, int i_97_, int i_98_, int i_99_,
				    int[] is, int i_100_, int i_101_);
    
    public abstract void method1790(int i, int i_102_, int i_103_, int i_104_,
				    int[] is, int i_105_, int i_106_);
    
    public abstract void method1791(int i, int i_107_, int i_108_, int i_109_,
				    int[] is, int i_110_, int i_111_);
    
    public abstract void method1792(int i, int i_112_, int i_113_, int i_114_,
				    int[] is, int i_115_, int i_116_);
    
    public abstract void method1811(int i, int i_117_, int i_118_, int i_119_,
				    int i_120_);
    
    public abstract void method1810(int i, int i_121_, int i_122_, int i_123_,
				    int i_124_);
    
    public int method37() {
	return (((Class151_Sub1) this).anInt8806
		+ ((Class151_Sub1) this).anInt8803
		+ ((Class151_Sub1) this).anInt8832);
    }
    
    public abstract void method1805(int i, int i_125_, Class148 class148,
				    int i_126_, int i_127_);
    
    abstract void method1797(int i, int i_128_, int i_129_, int i_130_,
			     int i_131_, int i_132_, int i_133_, int i_134_);
    
    abstract void method8294(int i, int i_135_);
    
    abstract void method8295(int i, int i_136_);
    
    abstract void method8296(int i, int i_137_);
    
    public abstract void method1788(int i, int i_138_, int i_139_, int i_140_,
				    int[] is, int i_141_, int i_142_);
    
    abstract void method8297(boolean bool, boolean bool_143_,
			     boolean bool_144_, int i, int i_145_, float f,
			     int i_146_, int i_147_, int i_148_, int i_149_,
			     int i_150_, int i_151_, boolean bool_152_);
    
    abstract void method8298(int[] is, int[] is_153_, int i, int i_154_);
    
    public void method1763(int i, int i_155_, int i_156_, int i_157_) {
	((Class151_Sub1) this).anInt8806 = i;
	((Class151_Sub1) this).anInt8819 = i_155_;
	((Class151_Sub1) this).anInt8832 = i_156_;
	((Class151_Sub1) this).anInt8808 = i_157_;
    }
    
    public void method1772(int[] is) {
	is[0] = ((Class151_Sub1) this).anInt8806;
	is[1] = ((Class151_Sub1) this).anInt8819;
	is[2] = ((Class151_Sub1) this).anInt8832;
	is[3] = ((Class151_Sub1) this).anInt8808;
    }
    
    public int method39() {
	return (((Class151_Sub1) this).anInt8806
		+ ((Class151_Sub1) this).anInt8803
		+ ((Class151_Sub1) this).anInt8832);
    }
    
    public void method1806(int i, int i_158_, int i_159_, int i_160_) {
	((Class151_Sub1) this).anInt8806 = i;
	((Class151_Sub1) this).anInt8819 = i_158_;
	((Class151_Sub1) this).anInt8832 = i_159_;
	((Class151_Sub1) this).anInt8808 = i_160_;
    }
    
    Class151_Sub1(Class173_Sub3 class173_sub3, int i, int i_161_) {
	((Class151_Sub1) this).aClass173_Sub3_8814 = class173_sub3;
	((Class151_Sub1) this).anInt8803 = i;
	((Class151_Sub1) this).anInt8804 = i_161_;
    }
    
    public int method38() {
	return (((Class151_Sub1) this).anInt8806
		+ ((Class151_Sub1) this).anInt8803
		+ ((Class151_Sub1) this).anInt8832);
    }
    
    void method1815(float f, float f_162_, float f_163_, float f_164_,
		    float f_165_, float f_166_, int i, int i_167_, int i_168_,
		    int i_169_) {
	if (((Class151_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (method8292(f, f_162_, f_163_, f_164_, f_165_, f_166_)) {
	    anInt8829 = i_167_;
	    if (i != 1) {
		anInt8830 = i_167_ >>> 24;
		anInt8831 = 256 - anInt8830;
		if (i == 0) {
		    anInt8815 = (i_167_ & 0xff0000) >> 16;
		    anInt8833 = (i_167_ & 0xff00) >> 8;
		    anInt8836 = i_167_ & 0xff;
		} else if (i == 2) {
		    anInt8827 = i_167_ >>> 24;
		    anInt8820 = 256 - anInt8827;
		    int i_170_ = (i_167_ & 0xff00ff) * anInt8820 & ~0xff00ff;
		    int i_171_ = (i_167_ & 0xff00) * anInt8820 & 0xff0000;
		    anInt8834 = (i_170_ | i_171_) >>> 8;
		}
	    }
	    method8299(i, i_168_);
	}
    }
    
    static {
	anInt8815 = 0;
	anInt8833 = 0;
	anInt8836 = 0;
	anInt8827 = 0;
	anInt8820 = 0;
	anInt8834 = 0;
    }
    
    public abstract void method1803(int i, int i_172_, int i_173_, int i_174_,
				    int i_175_);
    
    public void method1814(int i, int i_176_, int i_177_, int i_178_,
			   int i_179_, int i_180_, int i_181_) {
	if (((Class151_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (((Class151_Sub1) this).anIntArray8835 == null)
	    ((Class151_Sub1) this).anIntArray8835 = new int[4];
	((Class151_Sub1) this).aClass173_Sub3_8814
	    .method2207(((Class151_Sub1) this).anIntArray8835);
	((Class151_Sub1) this).aClass173_Sub3_8814.method2205
	    ((((Class173_Sub3) ((Class151_Sub1) this).aClass173_Sub3_8814)
	      .anInt9723) * -993497119,
	     (((Class173_Sub3) ((Class151_Sub1) this).aClass173_Sub3_8814)
	      .anInt9725) * 592117349,
	     i + i_177_, i_176_ + i_178_);
	int i_182_ = method40();
	int i_183_ = method1768();
	int i_184_ = (i_177_ + i_182_ - 1) / i_182_;
	int i_185_ = (i_178_ + i_183_ - 1) / i_183_;
	for (int i_186_ = 0; i_186_ < i_185_; i_186_++) {
	    int i_187_ = i_186_ * i_183_;
	    for (int i_188_ = 0; i_188_ < i_184_; i_188_++)
		method1780(i + i_188_ * i_182_, i_176_ + i_187_, i_179_,
			   i_180_, i_181_);
	}
	((Class151_Sub1) this).aClass173_Sub3_8814.method2204
	    (((Class151_Sub1) this).anIntArray8835[0],
	     ((Class151_Sub1) this).anIntArray8835[1],
	     ((Class151_Sub1) this).anIntArray8835[2],
	     ((Class151_Sub1) this).anIntArray8835[3]);
    }
    
    abstract void method8299(int i, int i_189_);
    
    public void method1801(int i, int i_190_, int i_191_, int i_192_) {
	((Class151_Sub1) this).anInt8806 = i;
	((Class151_Sub1) this).anInt8819 = i_190_;
	((Class151_Sub1) this).anInt8832 = i_191_;
	((Class151_Sub1) this).anInt8808 = i_192_;
    }
    
    void method1793(float f, float f_193_, float f_194_, float f_195_,
		    float f_196_, float f_197_, int i, int i_198_, int i_199_,
		    int i_200_) {
	if (((Class151_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (method8292(f, f_193_, f_194_, f_195_, f_196_, f_197_)) {
	    anInt8829 = i_198_;
	    if (i != 1) {
		anInt8830 = i_198_ >>> 24;
		anInt8831 = 256 - anInt8830;
		if (i == 0) {
		    anInt8815 = (i_198_ & 0xff0000) >> 16;
		    anInt8833 = (i_198_ & 0xff00) >> 8;
		    anInt8836 = i_198_ & 0xff;
		} else if (i == 2) {
		    anInt8827 = i_198_ >>> 24;
		    anInt8820 = 256 - anInt8827;
		    int i_201_ = (i_198_ & 0xff00ff) * anInt8820 & ~0xff00ff;
		    int i_202_ = (i_198_ & 0xff00) * anInt8820 & 0xff0000;
		    anInt8834 = (i_201_ | i_202_) >>> 8;
		}
	    }
	    method8299(i, i_199_);
	}
    }
    
    public int method1819() {
	return (((Class151_Sub1) this).anInt8819
		+ ((Class151_Sub1) this).anInt8804
		+ ((Class151_Sub1) this).anInt8808);
    }
    
    void method1816(float f, float f_203_, float f_204_, float f_205_,
		    float f_206_, float f_207_, int i, Class148 class148,
		    int i_208_, int i_209_) {
	if (((Class151_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (method8292(f, f_203_, f_204_, f_205_, f_206_, f_207_)) {
	    Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	    method8293(((Class148_Sub1) class148_sub1).anIntArray8789,
		       ((Class148_Sub1) class148_sub1).anIntArray8788,
		       anInt8813 - i_208_, -i_209_ - (anInt8816 - anInt8837));
	}
    }
    
    void method1817(float f, float f_210_, float f_211_, float f_212_,
		    float f_213_, float f_214_, int i, Class148 class148,
		    int i_215_, int i_216_) {
	if (((Class151_Sub1) this).aClass173_Sub3_8814.method8945())
	    throw new IllegalStateException();
	if (method8292(f, f_210_, f_211_, f_212_, f_213_, f_214_)) {
	    Class148_Sub1 class148_sub1 = (Class148_Sub1) class148;
	    method8293(((Class148_Sub1) class148_sub1).anIntArray8789,
		       ((Class148_Sub1) class148_sub1).anIntArray8788,
		       anInt8813 - i_215_, -i_216_ - (anInt8816 - anInt8837));
	}
    }
}
