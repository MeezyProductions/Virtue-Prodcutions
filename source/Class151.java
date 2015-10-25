/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class151 implements Interface3
{
    public abstract void method1763(int i, int i_0_, int i_1_, int i_2_);
    
    abstract void method1764(float f, float f_3_, float f_4_, float f_5_,
			     float f_6_, float f_7_, int i, Class148 class148,
			     int i_8_, int i_9_);
    
    public abstract void method1765(int[] is);
    
    public abstract int method1766();
    
    public abstract int method40();
    
    public abstract int method1767();
    
    public abstract int method1768();
    
    public abstract Interface19 method1769();
    
    public abstract void method1770(int i, int i_10_, int i_11_, int i_12_,
				    int[] is, int i_13_, int i_14_);
    
    public abstract void method1771(int i, int i_15_, int i_16_, int i_17_,
				    int[] is, int[] is_18_, int i_19_,
				    int i_20_);
    
    public abstract void method1772(int[] is);
    
    public final void method1773(int i, int i_21_) {
	method1780(i, i_21_, 1, -1, 1);
    }
    
    public final void method1774(int i, int i_22_, int i_23_, int i_24_) {
	method1777(i, i_22_, i_23_, i_24_, 1, -1, 1, 1);
    }
    
    public abstract void method1775(int i, int i_25_, Class148 class148,
				    int i_26_, int i_27_);
    
    public final void method1776(int i, int i_28_, int i_29_, int i_30_,
				 int i_31_, int i_32_, int i_33_) {
	method1777(i, i_28_, i_29_, i_30_, i_31_, i_32_, i_33_, 1);
    }
    
    abstract void method1777(int i, int i_34_, int i_35_, int i_36_, int i_37_,
			     int i_38_, int i_39_, int i_40_);
    
    public abstract void method1778(int i, int i_41_, int i_42_);
    
    public abstract void method1779(int i, int i_43_, int i_44_, int i_45_,
				    int i_46_, int i_47_, int i_48_);
    
    public abstract void method1780(int i, int i_49_, int i_50_, int i_51_,
				    int i_52_);
    
    public final void method1781(float f, float f_53_, int i, int i_54_) {
	method1822(f, f_53_, (float) method40() / 2.0F,
		   (float) method1768() / 2.0F, i, i_54_, 1, -1, 1);
    }
    
    public final void method1782(float f, float f_55_, int i, int i_56_,
				 int i_57_, int i_58_, int i_59_) {
	method1822(f, f_55_, (float) method40() / 2.0F,
		   (float) method1768() / 2.0F, i, i_56_, i_57_, i_58_, i_59_);
    }
    
    public final void method1783(float f, float f_60_, float f_61_,
				 float f_62_, int i, int i_63_, int i_64_,
				 int i_65_, int i_66_, int i_67_) {
	if (i != 0 && i_63_ != 0) {
	    double d = (double) (i_64_ & 0xffff) * 9.587379924285257E-5;
	    float f_68_ = (float) Math.sin(d) * (float) i_63_;
	    float f_69_ = (float) Math.cos(d) * (float) i_63_;
	    float f_70_ = (float) Math.sin(d) * (float) i;
	    float f_71_ = (float) Math.cos(d) * (float) i;
	    float f_72_ = (-f_61_ * f_71_ + -f_62_ * f_68_) / 4096.0F + f;
	    float f_73_ = (--f_61_ * f_70_ + -f_62_ * f_69_) / 4096.0F + f_60_;
	    float f_74_ = ((((float) method40() - f_61_) * f_71_
			    + -f_62_ * f_68_) / 4096.0F
			   + f);
	    float f_75_ = ((-((float) method40() - f_61_) * f_70_
			    + -f_62_ * f_69_) / 4096.0F
			   + f_60_);
	    float f_76_ = ((-f_61_ * f_71_
			    + ((float) method1768() - f_62_) * f_68_) / 4096.0F
			   + f);
	    float f_77_ = ((--f_61_ * f_70_
			    + ((float) method1768() - f_62_) * f_69_) / 4096.0F
			   + f_60_);
	    method1821(f_72_, f_73_, f_74_, f_75_, f_76_, f_77_, i_65_, i_66_,
		       i_67_);
	}
    }
    
    public abstract int method39();
    
    public abstract void method1784(int i, int i_78_, int i_79_, int i_80_,
				    int i_81_, int i_82_);
    
    abstract void method1785(float f, float f_83_, float f_84_, float f_85_,
			     float f_86_, float f_87_, int i, int i_88_,
			     int i_89_, int i_90_);
    
    final void method1786(float f, float f_91_, float f_92_, float f_93_,
			  float f_94_, float f_95_, Class148 class148, int i,
			  int i_96_) {
	method1764(f, f_91_, f_92_, f_93_, f_94_, f_95_, 1, class148, i,
		   i_96_);
    }
    
    public abstract void method1787(int i, int i_97_, int i_98_);
    
    public abstract void method1788(int i, int i_99_, int i_100_, int i_101_,
				    int[] is, int i_102_, int i_103_);
    
    public abstract void method1789(int i, int i_104_, int i_105_, int i_106_,
				    int[] is, int i_107_, int i_108_);
    
    public abstract void method1790(int i, int i_109_, int i_110_, int i_111_,
				    int[] is, int i_112_, int i_113_);
    
    public abstract void method1791(int i, int i_114_, int i_115_, int i_116_,
				    int[] is, int i_117_, int i_118_);
    
    public abstract void method1792(int i, int i_119_, int i_120_, int i_121_,
				    int[] is, int i_122_, int i_123_);
    
    abstract void method1793(float f, float f_124_, float f_125_, float f_126_,
			     float f_127_, float f_128_, int i, int i_129_,
			     int i_130_, int i_131_);
    
    public final void method1794(float f, float f_132_, int i, int i_133_,
				 Class148 class148, int i_134_, int i_135_) {
	method1804(f, f_132_, (float) method40() / 2.0F,
		   (float) method1768() / 2.0F, i, i_133_, class148, i_134_,
		   i_135_);
    }
    
    public abstract void method1795(int i, int i_136_, int i_137_, int i_138_,
				    int i_139_, int i_140_);
    
    public abstract void method1796(int i, int i_141_, int i_142_, int i_143_,
				    int i_144_, int i_145_);
    
    abstract void method1797(int i, int i_146_, int i_147_, int i_148_,
			     int i_149_, int i_150_, int i_151_, int i_152_);
    
    public abstract void method1798(int i, int i_153_, int i_154_, int i_155_,
				    int[] is, int[] is_156_, int i_157_,
				    int i_158_);
    
    public abstract Interface19 method1799();
    
    public abstract Interface19 method1800();
    
    public abstract void method1801(int i, int i_159_, int i_160_, int i_161_);
    
    public abstract void method1802(int i, int i_162_, int i_163_, int i_164_,
				    int[] is, int[] is_165_, int i_166_,
				    int i_167_);
    
    public abstract void method1803(int i, int i_168_, int i_169_, int i_170_,
				    int i_171_);
    
    public final void method1804(float f, float f_172_, float f_173_,
				 float f_174_, int i, int i_175_,
				 Class148 class148, int i_176_, int i_177_) {
	if (i != 0) {
	    double d = (double) (i_175_ & 0xffff) * 9.587379924285257E-5;
	    float f_178_ = (float) Math.sin(d) * (float) i;
	    float f_179_ = (float) Math.cos(d) * (float) i;
	    float f_180_ = (-f_173_ * f_179_ + -f_174_ * f_178_) / 4096.0F + f;
	    float f_181_
		= (--f_173_ * f_178_ + -f_174_ * f_179_) / 4096.0F + f_172_;
	    float f_182_ = ((((float) method40() - f_173_) * f_179_
			     + -f_174_ * f_178_) / 4096.0F
			    + f);
	    float f_183_ = ((-((float) method40() - f_173_) * f_178_
			     + -f_174_ * f_179_) / 4096.0F
			    + f_172_);
	    float f_184_
		= ((-f_173_ * f_179_
		    + ((float) method1768() - f_174_) * f_178_) / 4096.0F
		   + f);
	    float f_185_
		= ((--f_173_ * f_178_
		    + ((float) method1768() - f_174_) * f_179_) / 4096.0F
		   + f_172_);
	    method1786(f_180_, f_181_, f_182_, f_183_, f_184_, f_185_,
		       class148, i_176_, i_177_);
	}
    }
    
    public abstract void method1805(int i, int i_186_, Class148 class148,
				    int i_187_, int i_188_);
    
    public abstract void method1806(int i, int i_189_, int i_190_, int i_191_);
    
    public final void method1807(float f, float f_192_, float f_193_,
				 float f_194_, int i, int i_195_) {
	method1822(f, f_192_, f_193_, f_194_, i, i_195_, 1, -1, 1);
    }
    
    public abstract int method1808();
    
    public abstract int method1809();
    
    public abstract void method1810(int i, int i_196_, int i_197_, int i_198_,
				    int i_199_);
    
    public abstract void method1811(int i, int i_200_, int i_201_, int i_202_,
				    int i_203_);
    
    public abstract int method37();
    
    public abstract void method1812(int i, int i_204_, int i_205_);
    
    public final void method1813(int i, int i_206_, int i_207_, int i_208_) {
	method1779(i, i_206_, i_207_, i_208_, 1, -1, 1);
    }
    
    public abstract void method1814(int i, int i_209_, int i_210_, int i_211_,
				    int i_212_, int i_213_, int i_214_);
    
    abstract void method1815(float f, float f_215_, float f_216_, float f_217_,
			     float f_218_, float f_219_, int i, int i_220_,
			     int i_221_, int i_222_);
    
    abstract void method1816(float f, float f_223_, float f_224_, float f_225_,
			     float f_226_, float f_227_, int i,
			     Class148 class148, int i_228_, int i_229_);
    
    abstract void method1817(float f, float f_230_, float f_231_, float f_232_,
			     float f_233_, float f_234_, int i,
			     Class148 class148, int i_235_, int i_236_);
    
    public final void method1818(int i, int i_237_) {
	method1780(i, i_237_, 1, -1, 1);
    }
    
    public abstract int method38();
    
    public abstract int method1819();
    
    public abstract int method1820();
    
    public final void method1821(float f, float f_238_, float f_239_,
				 float f_240_, float f_241_, float f_242_,
				 int i, int i_243_, int i_244_) {
	method1785(f, f_238_, f_239_, f_240_, f_241_, f_242_, i, i_243_,
		   i_244_, 1);
    }
    
    public final void method1822(float f, float f_245_, float f_246_,
				 float f_247_, int i, int i_248_, int i_249_,
				 int i_250_, int i_251_) {
	if (i != 0) {
	    double d = (double) (i_248_ & 0xffff) * 9.587379924285257E-5;
	    float f_252_ = (float) Math.sin(d) * (float) i;
	    float f_253_ = (float) Math.cos(d) * (float) i;
	    float f_254_ = (-f_246_ * f_253_ + -f_247_ * f_252_) / 4096.0F + f;
	    float f_255_
		= (--f_246_ * f_252_ + -f_247_ * f_253_) / 4096.0F + f_245_;
	    float f_256_ = ((((float) method40() - f_246_) * f_253_
			     + -f_247_ * f_252_) / 4096.0F
			    + f);
	    float f_257_ = ((-((float) method40() - f_246_) * f_252_
			     + -f_247_ * f_253_) / 4096.0F
			    + f_245_);
	    float f_258_
		= ((-f_246_ * f_253_
		    + ((float) method1768() - f_247_) * f_252_) / 4096.0F
		   + f);
	    float f_259_
		= ((--f_246_ * f_252_
		    + ((float) method1768() - f_247_) * f_253_) / 4096.0F
		   + f_245_);
	    method1821(f_254_, f_255_, f_256_, f_257_, f_258_, f_259_, i_249_,
		       i_250_, i_251_);
	}
    }
    
    Class151() {
	/* empty */
    }
}
