/* Class512_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class512_Sub1 extends Class512
{
    int[] anIntArray10664 = new int[512];
    static float[][] aFloatArrayArray10665
	= { { -0.333333F, -0.333333F, -0.333333F },
	    { 0.333333F, -0.333333F, -0.333333F },
	    { -0.333333F, 0.333333F, -0.333333F },
	    { 0.333333F, 0.333333F, -0.333333F },
	    { -0.333333F, -0.333333F, 0.333333F },
	    { 0.333333F, -0.333333F, 0.333333F },
	    { -0.333333F, 0.333333F, 0.333333F },
	    { 0.333333F, 0.333333F, 0.333333F } };
    
    public Class512_Sub1(int i) {
	Random random = new Random((long) i);
	for (int i_0_ = 0; i_0_ < 256; i_0_++)
	    ((Class512_Sub1) this).anIntArray10664[i_0_]
		= ((Class512_Sub1) this).anIntArray10664[i_0_ + 256] = i_0_;
	for (int i_1_ = 0; i_1_ < 256; i_1_++) {
	    int i_2_ = random.nextInt() & 0xff;
	    int i_3_ = ((Class512_Sub1) this).anIntArray10664[i_2_];
	    ((Class512_Sub1) this).anIntArray10664[i_2_]
		= ((Class512_Sub1) this).anIntArray10664[i_2_ + 256]
		= ((Class512_Sub1) this).anIntArray10664[i_1_];
	    ((Class512_Sub1) this).anIntArray10664[i_1_]
		= ((Class512_Sub1) this).anIntArray10664[i_1_ + 256] = i_3_;
	}
    }
    
    static final float method9738(float f, float f_4_, float f_5_) {
	return f + (f_4_ - f) * f_5_;
    }
    
    void method6268(int i, int i_6_, int i_7_, int i_8_, float f, float f_9_,
		    float f_10_, float f_11_, float[] fs, int i_12_) {
	int i_13_ = (int) ((float) i_6_ * f - 1.0F);
	i_13_ &= 0xff;
	int i_14_ = (int) ((float) i_7_ * f_9_ - 1.0F);
	i_14_ &= 0xff;
	int i_15_ = (int) ((float) i_8_ * f_10_ - 1.0F);
	i_15_ &= 0xff;
	float f_16_ = (float) i * f_10_;
	int i_17_ = (int) f_16_;
	int i_18_ = i_17_ + 1;
	float f_19_ = f_16_ - (float) i_17_;
	float f_20_ = 1.0F - f_19_;
	float f_21_ = method9740(f_19_);
	i_17_ &= i_15_;
	i_18_ &= i_15_;
	int i_22_ = ((Class512_Sub1) this).anIntArray10664[i_17_];
	int i_23_ = ((Class512_Sub1) this).anIntArray10664[i_18_];
	for (int i_24_ = 0; i_24_ < i_7_; i_24_++) {
	    float f_25_ = (float) i_24_ * f_9_;
	    int i_26_ = (int) f_25_;
	    int i_27_ = i_26_ + 1;
	    float f_28_ = f_25_ - (float) i_26_;
	    float f_29_ = 1.0F - f_28_;
	    float f_30_ = method9740(f_28_);
	    i_26_ &= i_14_;
	    i_27_ &= i_14_;
	    int i_31_ = ((Class512_Sub1) this).anIntArray10664[i_26_ + i_22_];
	    int i_32_ = ((Class512_Sub1) this).anIntArray10664[i_27_ + i_22_];
	    int i_33_ = ((Class512_Sub1) this).anIntArray10664[i_26_ + i_23_];
	    int i_34_ = ((Class512_Sub1) this).anIntArray10664[i_27_ + i_23_];
	    for (int i_35_ = 0; i_35_ < i_6_; i_35_++) {
		float f_36_ = (float) i_35_ * f;
		int i_37_ = (int) f_36_;
		int i_38_ = i_37_ + 1;
		float f_39_ = f_36_ - (float) i_37_;
		float f_40_ = 1.0F - f_39_;
		float f_41_ = method9740(f_39_);
		i_37_ &= i_13_;
		i_38_ &= i_13_;
		fs[i_12_++]
		    = (f_11_
		       * (method9738
			  ((method9738
			    (method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_37_ + i_31_]) & 0x7,
						   f_40_, f_29_, f_20_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_38_ + i_31_]) & 0x7,
						   f_39_, f_29_, f_20_),
					f_41_),
			     method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_37_ + i_32_]) & 0x7,
						   f_40_, f_28_, f_20_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_38_ + i_32_]) & 0x7,
						   f_39_, f_28_, f_20_),
					f_41_),
			     f_30_)),
			   (method9738
			    (method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_37_ + i_33_]) & 0x7,
						   f_40_, f_29_, f_19_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_38_ + i_33_]) & 0x7,
						   f_39_, f_29_, f_19_),
					f_41_),
			     method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_37_ + i_34_]) & 0x7,
						   f_40_, f_28_, f_19_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_38_ + i_34_]) & 0x7,
						   f_39_, f_28_, f_19_),
					f_41_),
			     f_30_)),
			   f_21_)));
	    }
	}
    }
    
    static final float method9739(int i, float f, float f_42_, float f_43_) {
	float[] fs = aFloatArrayArray10665[i];
	return fs[0] * f + fs[1] * f_42_ + fs[2] * f_43_;
    }
    
    static final float method9740(float f) {
	return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
    }
    
    void method6265(int i, int i_44_, int i_45_, int i_46_, float f,
		    float f_47_, float f_48_, float f_49_, float[] fs,
		    int i_50_) {
	int i_51_ = (int) ((float) i_44_ * f - 1.0F);
	i_51_ &= 0xff;
	int i_52_ = (int) ((float) i_45_ * f_47_ - 1.0F);
	i_52_ &= 0xff;
	int i_53_ = (int) ((float) i_46_ * f_48_ - 1.0F);
	i_53_ &= 0xff;
	float f_54_ = (float) i * f_48_;
	int i_55_ = (int) f_54_;
	int i_56_ = i_55_ + 1;
	float f_57_ = f_54_ - (float) i_55_;
	float f_58_ = 1.0F - f_57_;
	float f_59_ = method9740(f_57_);
	i_55_ &= i_53_;
	i_56_ &= i_53_;
	int i_60_ = ((Class512_Sub1) this).anIntArray10664[i_55_];
	int i_61_ = ((Class512_Sub1) this).anIntArray10664[i_56_];
	for (int i_62_ = 0; i_62_ < i_45_; i_62_++) {
	    float f_63_ = (float) i_62_ * f_47_;
	    int i_64_ = (int) f_63_;
	    int i_65_ = i_64_ + 1;
	    float f_66_ = f_63_ - (float) i_64_;
	    float f_67_ = 1.0F - f_66_;
	    float f_68_ = method9740(f_66_);
	    i_64_ &= i_52_;
	    i_65_ &= i_52_;
	    int i_69_ = ((Class512_Sub1) this).anIntArray10664[i_64_ + i_60_];
	    int i_70_ = ((Class512_Sub1) this).anIntArray10664[i_65_ + i_60_];
	    int i_71_ = ((Class512_Sub1) this).anIntArray10664[i_64_ + i_61_];
	    int i_72_ = ((Class512_Sub1) this).anIntArray10664[i_65_ + i_61_];
	    for (int i_73_ = 0; i_73_ < i_44_; i_73_++) {
		float f_74_ = (float) i_73_ * f;
		int i_75_ = (int) f_74_;
		int i_76_ = i_75_ + 1;
		float f_77_ = f_74_ - (float) i_75_;
		float f_78_ = 1.0F - f_77_;
		float f_79_ = method9740(f_77_);
		i_75_ &= i_51_;
		i_76_ &= i_51_;
		fs[i_50_++]
		    = (f_49_
		       * (method9738
			  ((method9738
			    (method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_75_ + i_69_]) & 0x7,
						   f_78_, f_67_, f_58_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_76_ + i_69_]) & 0x7,
						   f_77_, f_67_, f_58_),
					f_79_),
			     method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_75_ + i_70_]) & 0x7,
						   f_78_, f_66_, f_58_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_76_ + i_70_]) & 0x7,
						   f_77_, f_66_, f_58_),
					f_79_),
			     f_68_)),
			   (method9738
			    (method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_75_ + i_71_]) & 0x7,
						   f_78_, f_67_, f_57_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_76_ + i_71_]) & 0x7,
						   f_77_, f_67_, f_57_),
					f_79_),
			     method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_75_ + i_72_]) & 0x7,
						   f_78_, f_66_, f_57_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_76_ + i_72_]) & 0x7,
						   f_77_, f_66_, f_57_),
					f_79_),
			     f_68_)),
			   f_59_)));
	    }
	}
    }
    
    void method6267(int i, int i_80_, int i_81_, int i_82_, float f,
		    float f_83_, float f_84_, float f_85_, float[] fs,
		    int i_86_) {
	int i_87_ = (int) ((float) i_80_ * f - 1.0F);
	i_87_ &= 0xff;
	int i_88_ = (int) ((float) i_81_ * f_83_ - 1.0F);
	i_88_ &= 0xff;
	int i_89_ = (int) ((float) i_82_ * f_84_ - 1.0F);
	i_89_ &= 0xff;
	float f_90_ = (float) i * f_84_;
	int i_91_ = (int) f_90_;
	int i_92_ = i_91_ + 1;
	float f_93_ = f_90_ - (float) i_91_;
	float f_94_ = 1.0F - f_93_;
	float f_95_ = method9740(f_93_);
	i_91_ &= i_89_;
	i_92_ &= i_89_;
	int i_96_ = ((Class512_Sub1) this).anIntArray10664[i_91_];
	int i_97_ = ((Class512_Sub1) this).anIntArray10664[i_92_];
	for (int i_98_ = 0; i_98_ < i_81_; i_98_++) {
	    float f_99_ = (float) i_98_ * f_83_;
	    int i_100_ = (int) f_99_;
	    int i_101_ = i_100_ + 1;
	    float f_102_ = f_99_ - (float) i_100_;
	    float f_103_ = 1.0F - f_102_;
	    float f_104_ = method9740(f_102_);
	    i_100_ &= i_88_;
	    i_101_ &= i_88_;
	    int i_105_
		= ((Class512_Sub1) this).anIntArray10664[i_100_ + i_96_];
	    int i_106_
		= ((Class512_Sub1) this).anIntArray10664[i_101_ + i_96_];
	    int i_107_
		= ((Class512_Sub1) this).anIntArray10664[i_100_ + i_97_];
	    int i_108_
		= ((Class512_Sub1) this).anIntArray10664[i_101_ + i_97_];
	    for (int i_109_ = 0; i_109_ < i_80_; i_109_++) {
		float f_110_ = (float) i_109_ * f;
		int i_111_ = (int) f_110_;
		int i_112_ = i_111_ + 1;
		float f_113_ = f_110_ - (float) i_111_;
		float f_114_ = 1.0F - f_113_;
		float f_115_ = method9740(f_113_);
		i_111_ &= i_87_;
		i_112_ &= i_87_;
		fs[i_86_++]
		    = (f_85_
		       * (method9738
			  ((method9738
			    (method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_111_ + i_105_]) & 0x7,
						   f_114_, f_103_, f_94_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_112_ + i_105_]) & 0x7,
						   f_113_, f_103_, f_94_),
					f_115_),
			     method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_111_ + i_106_]) & 0x7,
						   f_114_, f_102_, f_94_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_112_ + i_106_]) & 0x7,
						   f_113_, f_102_, f_94_),
					f_115_),
			     f_104_)),
			   (method9738
			    (method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_111_ + i_107_]) & 0x7,
						   f_114_, f_103_, f_93_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_112_ + i_107_]) & 0x7,
						   f_113_, f_103_, f_93_),
					f_115_),
			     method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_111_ + i_108_]) & 0x7,
						   f_114_, f_102_, f_93_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_112_ + i_108_]) & 0x7,
						   f_113_, f_102_, f_93_),
					f_115_),
			     f_104_)),
			   f_95_)));
	    }
	}
    }
    
    void method6266(int i, int i_116_, int i_117_, int i_118_, float f,
		    float f_119_, float f_120_, float f_121_, float[] fs,
		    int i_122_) {
	int i_123_ = (int) ((float) i_116_ * f - 1.0F);
	i_123_ &= 0xff;
	int i_124_ = (int) ((float) i_117_ * f_119_ - 1.0F);
	i_124_ &= 0xff;
	int i_125_ = (int) ((float) i_118_ * f_120_ - 1.0F);
	i_125_ &= 0xff;
	float f_126_ = (float) i * f_120_;
	int i_127_ = (int) f_126_;
	int i_128_ = i_127_ + 1;
	float f_129_ = f_126_ - (float) i_127_;
	float f_130_ = 1.0F - f_129_;
	float f_131_ = method9740(f_129_);
	i_127_ &= i_125_;
	i_128_ &= i_125_;
	int i_132_ = ((Class512_Sub1) this).anIntArray10664[i_127_];
	int i_133_ = ((Class512_Sub1) this).anIntArray10664[i_128_];
	for (int i_134_ = 0; i_134_ < i_117_; i_134_++) {
	    float f_135_ = (float) i_134_ * f_119_;
	    int i_136_ = (int) f_135_;
	    int i_137_ = i_136_ + 1;
	    float f_138_ = f_135_ - (float) i_136_;
	    float f_139_ = 1.0F - f_138_;
	    float f_140_ = method9740(f_138_);
	    i_136_ &= i_124_;
	    i_137_ &= i_124_;
	    int i_141_
		= ((Class512_Sub1) this).anIntArray10664[i_136_ + i_132_];
	    int i_142_
		= ((Class512_Sub1) this).anIntArray10664[i_137_ + i_132_];
	    int i_143_
		= ((Class512_Sub1) this).anIntArray10664[i_136_ + i_133_];
	    int i_144_
		= ((Class512_Sub1) this).anIntArray10664[i_137_ + i_133_];
	    for (int i_145_ = 0; i_145_ < i_116_; i_145_++) {
		float f_146_ = (float) i_145_ * f;
		int i_147_ = (int) f_146_;
		int i_148_ = i_147_ + 1;
		float f_149_ = f_146_ - (float) i_147_;
		float f_150_ = 1.0F - f_149_;
		float f_151_ = method9740(f_149_);
		i_147_ &= i_123_;
		i_148_ &= i_123_;
		fs[i_122_++]
		    = (f_121_
		       * (method9738
			  ((method9738
			    (method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_147_ + i_141_]) & 0x7,
						   f_150_, f_139_, f_130_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_148_ + i_141_]) & 0x7,
						   f_149_, f_139_, f_130_),
					f_151_),
			     method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_147_ + i_142_]) & 0x7,
						   f_150_, f_138_, f_130_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_148_ + i_142_]) & 0x7,
						   f_149_, f_138_, f_130_),
					f_151_),
			     f_140_)),
			   (method9738
			    (method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_147_ + i_143_]) & 0x7,
						   f_150_, f_139_, f_129_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_148_ + i_143_]) & 0x7,
						   f_149_, f_139_, f_129_),
					f_151_),
			     method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_147_ + i_144_]) & 0x7,
						   f_150_, f_138_, f_129_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_148_ + i_144_]) & 0x7,
						   f_149_, f_138_, f_129_),
					f_151_),
			     f_140_)),
			   f_131_)));
	    }
	}
    }
    
    void method6269(int i, int i_152_, int i_153_, int i_154_, float f,
		    float f_155_, float f_156_, float f_157_, float[] fs,
		    int i_158_) {
	int i_159_ = (int) ((float) i_152_ * f - 1.0F);
	i_159_ &= 0xff;
	int i_160_ = (int) ((float) i_153_ * f_155_ - 1.0F);
	i_160_ &= 0xff;
	int i_161_ = (int) ((float) i_154_ * f_156_ - 1.0F);
	i_161_ &= 0xff;
	float f_162_ = (float) i * f_156_;
	int i_163_ = (int) f_162_;
	int i_164_ = i_163_ + 1;
	float f_165_ = f_162_ - (float) i_163_;
	float f_166_ = 1.0F - f_165_;
	float f_167_ = method9740(f_165_);
	i_163_ &= i_161_;
	i_164_ &= i_161_;
	int i_168_ = ((Class512_Sub1) this).anIntArray10664[i_163_];
	int i_169_ = ((Class512_Sub1) this).anIntArray10664[i_164_];
	for (int i_170_ = 0; i_170_ < i_153_; i_170_++) {
	    float f_171_ = (float) i_170_ * f_155_;
	    int i_172_ = (int) f_171_;
	    int i_173_ = i_172_ + 1;
	    float f_174_ = f_171_ - (float) i_172_;
	    float f_175_ = 1.0F - f_174_;
	    float f_176_ = method9740(f_174_);
	    i_172_ &= i_160_;
	    i_173_ &= i_160_;
	    int i_177_
		= ((Class512_Sub1) this).anIntArray10664[i_172_ + i_168_];
	    int i_178_
		= ((Class512_Sub1) this).anIntArray10664[i_173_ + i_168_];
	    int i_179_
		= ((Class512_Sub1) this).anIntArray10664[i_172_ + i_169_];
	    int i_180_
		= ((Class512_Sub1) this).anIntArray10664[i_173_ + i_169_];
	    for (int i_181_ = 0; i_181_ < i_152_; i_181_++) {
		float f_182_ = (float) i_181_ * f;
		int i_183_ = (int) f_182_;
		int i_184_ = i_183_ + 1;
		float f_185_ = f_182_ - (float) i_183_;
		float f_186_ = 1.0F - f_185_;
		float f_187_ = method9740(f_185_);
		i_183_ &= i_159_;
		i_184_ &= i_159_;
		fs[i_158_++]
		    = (f_157_
		       * (method9738
			  ((method9738
			    (method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_183_ + i_177_]) & 0x7,
						   f_186_, f_175_, f_166_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_184_ + i_177_]) & 0x7,
						   f_185_, f_175_, f_166_),
					f_187_),
			     method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_183_ + i_178_]) & 0x7,
						   f_186_, f_174_, f_166_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_184_ + i_178_]) & 0x7,
						   f_185_, f_174_, f_166_),
					f_187_),
			     f_176_)),
			   (method9738
			    (method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_183_ + i_179_]) & 0x7,
						   f_186_, f_175_, f_165_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_184_ + i_179_]) & 0x7,
						   f_185_, f_175_, f_165_),
					f_187_),
			     method9738(method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_183_ + i_180_]) & 0x7,
						   f_186_, f_174_, f_165_),
					method9739((((Class512_Sub1) this)
						    .anIntArray10664
						    [i_184_ + i_180_]) & 0x7,
						   f_185_, f_174_, f_165_),
					f_187_),
			     f_176_)),
			   f_167_)));
	    }
	}
    }
}
