/* Class402_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class402_Sub2_Sub1 extends Class402_Sub2 implements Interface43
{
    public void method235(int i, int i_0_, int i_1_, int i_2_, byte[] is,
			  Class149 class149, int i_3_, int i_4_) {
	super.method212(i, i_0_, i_1_, i_2_, is, class149, i_3_, i_4_);
    }
    
    public float method239() {
	return super.method245();
    }
    
    public float method253() {
	return super.method217();
    }
    
    public void method115() {
	super.method115();
    }
    
    public int method1() {
	return super.method1();
    }
    
    public boolean method218() {
	return super.method218();
    }
    
    public void method236(int i, int i_5_, int i_6_, int i_7_, int[] is,
			  int i_8_) {
	long l
	    = IDirect3DTexture
		  .GetSurfaceLevel(((Class402_Sub2_Sub1) this).aLong4453, 0);
	long l_9_
	    = IDirect3DDevice.CreateRenderTarget((((Class173_Sub1_Sub2)
						   (((Class402_Sub2_Sub1) this)
						    .aClass173_Sub1_Sub2_4452))
						  .aLong11378),
						 i_6_, i_7_, 21, 0, 0, true);
	((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
	    .method8451(i_7_ * i_6_ * 4);
	if (Class360.method4593
	    (IDirect3DDevice.StretchRect((((Class173_Sub1_Sub2)
					   (((Class402_Sub2_Sub1) this)
					    .aClass173_Sub1_Sub2_4452))
					  .aLong11378),
					 l, i, i_5_, i_6_, i_7_, l_9_, 0, 0,
					 i_6_, i_7_, 1))) {
	    IDirect3DSurface.Download(l_9_, 0, 0, i_6_, i_7_, i_6_ * 4, 16,
				      (((Class402_Sub2_Sub1) this)
				       .aClass173_Sub1_Sub2_4452.aLong9223));
	    ((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
		.aByteBuffer9222.clear();
	    ((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
		.aByteBuffer9222.asIntBuffer
		().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_9_);
    }
    
    public float method221(float f) {
	return super.method221(f);
    }
    
    public boolean method252() {
	return super.method218();
    }
    
    public void method219(int i, int i_10_, int i_11_, int i_12_, int[] is,
			  int i_13_) {
	long l
	    = IDirect3DTexture
		  .GetSurfaceLevel(((Class402_Sub2_Sub1) this).aLong4453, 0);
	long l_14_
	    = IDirect3DDevice.CreateRenderTarget((((Class173_Sub1_Sub2)
						   (((Class402_Sub2_Sub1) this)
						    .aClass173_Sub1_Sub2_4452))
						  .aLong11378),
						 i_11_, i_12_, 21, 0, 0, true);
	((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
	    .method8451(i_12_ * i_11_ * 4);
	if (Class360.method4593
	    (IDirect3DDevice.StretchRect((((Class173_Sub1_Sub2)
					   (((Class402_Sub2_Sub1) this)
					    .aClass173_Sub1_Sub2_4452))
					  .aLong11378),
					 l, i, i_10_, i_11_, i_12_, l_14_, 0,
					 0, i_11_, i_12_, 1))) {
	    IDirect3DSurface.Download(l_14_, 0, 0, i_11_, i_12_, i_11_ * 4, 16,
				      (((Class402_Sub2_Sub1) this)
				       .aClass173_Sub1_Sub2_4452.aLong9223));
	    ((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
		.aByteBuffer9222.clear();
	    ((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
		.aByteBuffer9222.asIntBuffer
		().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_14_);
    }
    
    public void method220(boolean bool, boolean bool_15_) {
	super.method220(bool, bool_15_);
    }
    
    public void method212(int i, int i_16_, int i_17_, int i_18_, byte[] is,
			  Class149 class149, int i_19_, int i_20_) {
	super.method212(i, i_16_, i_17_, i_18_, is, class149, i_19_, i_20_);
    }
    
    public void method206(int i, int i_21_, int i_22_, int i_23_, int[] is,
			  int[] is_24_, int i_25_) {
	super.method206(i, i_21_, i_22_, i_23_, is, is_24_, i_25_);
    }
    
    public void method216(int i, int i_26_, int i_27_, int i_28_, int i_29_,
			  int i_30_) {
	super.method216(i, i_26_, i_27_, i_28_, i_29_, i_30_);
    }
    
    public float method245() {
	return super.method245();
    }
    
    public float method217() {
	return super.method217();
    }
    
    public boolean method232() {
	return super.method232();
    }
    
    public void method308() {
	super.method308();
    }
    
    public void method303(Class340 class340) {
	super.method303(class340);
    }
    
    public int method222() {
	return super.method1();
    }
    
    public float method208(float f) {
	return super.method207(f);
    }
    
    public int method215() {
	return super.method1();
    }
    
    public int method246() {
	return super.method1();
    }
    
    public void method116() {
	super.method115();
    }
    
    public int method223() {
	return super.method68();
    }
    
    public int method224() {
	return super.method68();
    }
    
    public int method225() {
	return super.method68();
    }
    
    public float method226(float f) {
	return super.method207(f);
    }
    
    public boolean method209() {
	return super.method218();
    }
    
    public float method228(float f) {
	return super.method221(f);
    }
    
    public float method229(float f) {
	return super.method221(f);
    }
    
    public float method213(float f) {
	return super.method221(f);
    }
    
    public void method211(int i, int i_31_, int i_32_, int i_33_, int[] is,
			  int i_34_, int i_35_) {
	super.method211(i, i_31_, i_32_, i_33_, is, i_34_, i_35_);
    }
    
    public void method231(boolean bool, boolean bool_36_) {
	super.method220(bool, bool_36_);
    }
    
    public void method256(int i, int i_37_, int i_38_, int i_39_, int[] is,
			  int i_40_, int i_41_) {
	super.method211(i, i_37_, i_38_, i_39_, is, i_40_, i_41_);
    }
    
    public void method233(int i, int i_42_, int i_43_, int i_44_, int[] is,
			  int i_45_, int i_46_) {
	super.method211(i, i_42_, i_43_, i_44_, is, i_45_, i_46_);
    }
    
    public float method207(float f) {
	return super.method207(f);
    }
    
    public Interface19 method320(int i) {
	return new Class406(this, i);
    }
    
    public boolean method248() {
	return super.method218();
    }
    
    public int method68() {
	return super.method68();
    }
    
    public void method238(int i, int i_47_, int i_48_, int i_49_, int[] is,
			  int i_50_) {
	long l
	    = IDirect3DTexture
		  .GetSurfaceLevel(((Class402_Sub2_Sub1) this).aLong4453, 0);
	long l_51_
	    = IDirect3DDevice.CreateRenderTarget((((Class173_Sub1_Sub2)
						   (((Class402_Sub2_Sub1) this)
						    .aClass173_Sub1_Sub2_4452))
						  .aLong11378),
						 i_48_, i_49_, 21, 0, 0, true);
	((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
	    .method8451(i_49_ * i_48_ * 4);
	if (Class360.method4593
	    (IDirect3DDevice.StretchRect((((Class173_Sub1_Sub2)
					   (((Class402_Sub2_Sub1) this)
					    .aClass173_Sub1_Sub2_4452))
					  .aLong11378),
					 l, i, i_47_, i_48_, i_49_, l_51_, 0,
					 0, i_48_, i_49_, 1))) {
	    IDirect3DSurface.Download(l_51_, 0, 0, i_48_, i_49_, i_48_ * 4, 16,
				      (((Class402_Sub2_Sub1) this)
				       .aClass173_Sub1_Sub2_4452.aLong9223));
	    ((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
		.aByteBuffer9222.clear();
	    ((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
		.aByteBuffer9222.asIntBuffer
		().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_51_);
    }
    
    public void method247(int i, int i_52_, int i_53_, int i_54_, int[] is,
			  int[] is_55_, int i_56_) {
	super.method206(i, i_52_, i_53_, i_54_, is, is_55_, i_56_);
    }
    
    public void method227(int i, int i_57_, int i_58_, int i_59_, int[] is,
			  int[] is_60_, int i_61_) {
	super.method206(i, i_57_, i_58_, i_59_, is, is_60_, i_61_);
    }
    
    public void method306() {
	super.method308();
    }
    
    public void method242(int i, int i_62_, int i_63_, int i_64_, int[] is,
			  int[] is_65_, int i_66_) {
	super.method206(i, i_62_, i_63_, i_64_, is, is_65_, i_66_);
    }
    
    public void method243(int i, int i_67_, int i_68_, int i_69_, int i_70_,
			  int i_71_) {
	super.method216(i, i_67_, i_68_, i_69_, i_70_, i_71_);
    }
    
    public void method244(int i, int i_72_, int i_73_, int i_74_, int i_75_,
			  int i_76_) {
	super.method216(i, i_72_, i_73_, i_74_, i_75_, i_76_);
    }
    
    public float method210() {
	return super.method245();
    }
    
    public int method250() {
	return super.method1();
    }
    
    public float method214() {
	return super.method245();
    }
    
    public void method237(int i, int i_77_, int i_78_, int i_79_, int[] is,
			  int i_80_) {
	long l
	    = IDirect3DTexture
		  .GetSurfaceLevel(((Class402_Sub2_Sub1) this).aLong4453, 0);
	long l_81_
	    = IDirect3DDevice.CreateRenderTarget((((Class173_Sub1_Sub2)
						   (((Class402_Sub2_Sub1) this)
						    .aClass173_Sub1_Sub2_4452))
						  .aLong11378),
						 i_78_, i_79_, 21, 0, 0, true);
	((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
	    .method8451(i_79_ * i_78_ * 4);
	if (Class360.method4593
	    (IDirect3DDevice.StretchRect((((Class173_Sub1_Sub2)
					   (((Class402_Sub2_Sub1) this)
					    .aClass173_Sub1_Sub2_4452))
					  .aLong11378),
					 l, i, i_77_, i_78_, i_79_, l_81_, 0,
					 0, i_78_, i_79_, 1))) {
	    IDirect3DSurface.Download(l_81_, 0, 0, i_78_, i_79_, i_78_ * 4, 16,
				      (((Class402_Sub2_Sub1) this)
				       .aClass173_Sub1_Sub2_4452.aLong9223));
	    ((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
		.aByteBuffer9222.clear();
	    ((Class402_Sub2_Sub1) this).aClass173_Sub1_Sub2_4452
		.aByteBuffer9222.asIntBuffer
		().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_81_);
    }
    
    public boolean method249() {
	return super.method218();
    }
    
    public float method254() {
	return super.method217();
    }
    
    public boolean method251() {
	return super.method218();
    }
    
    public boolean method230() {
	return super.method232();
    }
    
    Class402_Sub2_Sub1(Class173_Sub1_Sub2 class173_sub1_sub2,
		       Class149 class149, Class169 class169, int i,
		       int i_82_) {
	super(class173_sub1_sub2, class149, class169, i, i_82_, 1025, 0);
    }
    
    public void method305() {
	super.method308();
    }
    
    public void method302(Class340 class340) {
	super.method303(class340);
    }
    
    public void method307(Class340 class340) {
	super.method303(class340);
    }
    
    public void method304(Class340 class340) {
	super.method303(class340);
    }
    
    public Interface19 method321(int i) {
	return new Class406(this, i);
    }
    
    public void method234(int i, int i_83_, int i_84_, int i_85_, byte[] is,
			  Class149 class149, int i_86_, int i_87_) {
	super.method212(i, i_83_, i_84_, i_85_, is, class149, i_86_, i_87_);
    }
    
    public void method241(int i, int i_88_, int i_89_, int i_90_, int[] is,
			  int[] is_91_, int i_92_) {
	super.method206(i, i_88_, i_89_, i_90_, is, is_91_, i_92_);
    }
    
    public float method255() {
	return super.method217();
    }
    
    public float method240() {
	return super.method217();
    }
}
