/* Class173_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;

public class Class173_Sub1_Sub2 extends Class173_Sub1
{
    boolean aBool11343;
    int anInt11344;
    int anInt11345;
    static int[] anIntArray11346;
    long aLong11347;
    D3DDISPLAYMODE aD3DDISPLAYMODE11348;
    boolean[] aBoolArray11349;
    boolean aBool11350;
    long aLong11351;
    Class688 aClass688_11352;
    long aLong11353;
    boolean aBool11354;
    int anInt11355;
    int anInt11356;
    boolean[] aBoolArray11357;
    long[] aLongArray11358;
    Class340[] aClass340Array11359;
    int[] anIntArray11360;
    Class418 aClass418_11361;
    Class262_Sub1 aClass262_Sub1_11362;
    long aLong11363;
    D3DCAPS aD3DCAPS11364;
    boolean aBool11365;
    boolean[] aBoolArray11366;
    long aLong11367 = 0L;
    D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11368;
    boolean aBool11369;
    boolean aBool11370;
    long[] aLongArray11371;
    boolean aBool11372;
    boolean aBool11373;
    boolean aBool11374;
    float[] aFloatArray11375;
    int anInt11376;
    boolean aBool11377;
    long aLong11378 = 0L;
    static final int anInt11379 = 3;
    long aLong11380;
    long[] aLongArray11381;
    int anInt11382;
    int[] anIntArray11383;
    boolean aBool11384;
    boolean[] aBoolArray11385;
    static int[] anIntArray11386 = { 77, 80 };
    boolean aBool11387;
    
    public boolean method8596() {
	return ((((Class173_Sub1_Sub2) this).aD3DCAPS11364.PixelShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    public boolean method8449(boolean bool) {
	if (bool)
	    return ((Class173_Sub1_Sub2) this).aBool11372;
	return (((Class173_Sub1_Sub2) this).aBool11372
		&& ((Class173_Sub1_Sub2) this).aBool11373);
    }
    
    public void method2278() {
	if (((Class173_Sub1_Sub2) this).aLong11380 != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLong11380);
	    ((Class173_Sub1_Sub2) this).aLong11380 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	    if (((Class173_Sub1_Sub2) this).aLongArray11358[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11358[i]);
		((Class173_Sub1_Sub2) this).aLongArray11358[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    Class173_Sub1_Sub2
	(int i, int i_0_, long l, long l_1_, D3DDISPLAYMODE d3ddisplaymode,
	 D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps,
	 Class165 class165, Interface22 interface22, Interface44 interface44,
	 Interface45 interface45, Interface46 interface46, Class446 class446,
	 int i_2_) {
	super(class165, interface22, interface44, interface45, interface46,
	      class446, i_2_, 0);
	((Class173_Sub1_Sub2) this).aClass688_11352 = new Class688();
	((Class173_Sub1_Sub2) this).aBool11350 = false;
	((Class173_Sub1_Sub2) this).aLong11351 = 0L;
	((Class173_Sub1_Sub2) this).aLong11353 = 0L;
	((Class173_Sub1_Sub2) this).aLong11347 = 0L;
	((Class173_Sub1_Sub2) this).aBool11354 = false;
	((Class173_Sub1_Sub2) this).aFloatArray11375 = new float[16];
	((Class173_Sub1_Sub2) this).anInt11376 = 128;
	((Class173_Sub1_Sub2) this).anInt11355 = 0;
	((Class173_Sub1_Sub2) this).aLongArray11371
	    = new long[((Class173_Sub1_Sub2) this).anInt11376];
	((Class173_Sub1_Sub2) this).aLong11380 = 0L;
	((Class173_Sub1_Sub2) this).aLongArray11381 = new long[3];
	((Class173_Sub1_Sub2) this).aLongArray11358 = new long[3];
	((Class173_Sub1_Sub2) this).anIntArray11383 = new int[3];
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	try {
	    ((Class173_Sub1_Sub2) this).anInt11382 = i;
	    ((Class173_Sub1_Sub2) this).anInt11344 = i_0_;
	    ((Class173_Sub1_Sub2) this).aLong11367 = l;
	    ((Class173_Sub1_Sub2) this).aLong11378 = l_1_;
	    ((Class173_Sub1_Sub2) this).aD3DDISPLAYMODE11348 = d3ddisplaymode;
	    ((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
		= d3dpresent_parameters;
	    ((Class173_Sub1_Sub2) this).aD3DCAPS11364 = d3dcaps;
	    ((Class173_Sub1_Sub2) this).aLong11351 = D3DLIGHT.Create();
	    ((Class173_Sub1_Sub2) this).aLong11353 = D3DLIGHT.Create();
	    ((Class173_Sub1_Sub2) this).aLong11347 = D3DLIGHT.Create();
	    anInt9235 = (((Class173_Sub1_Sub2) this).aD3DCAPS11364
			 .MaxSimultaneousTextures);
	    anInt9211
		= ((((Class173_Sub1_Sub2) this).aD3DCAPS11364.MaxActiveLights
		    > 0)
		   ? ((Class173_Sub1_Sub2) this).aD3DCAPS11364.MaxActiveLights
		   : 8);
	    ((Class173_Sub1_Sub2) this).aBool11384
		= (((Class173_Sub1_Sub2) this).aD3DCAPS11364.TextureCaps
		   & 0x2) == 0;
	    aBool9278 = (((Class173_Sub1_Sub2) this).aD3DCAPS11364.TextureCaps
			 & 0x800) != 0;
	    aBool9368 = (((Class173_Sub1_Sub2) this).aD3DCAPS11364.TextureCaps
			 & 0x2000) != 0;
	    ((Class173_Sub1_Sub2) this).aBool11365
		= (((Class173_Sub1_Sub2) this).aD3DCAPS11364.TextureCaps
		   & 0x8000) != 0;
	    ((Class173_Sub1_Sub2) this).aBool11377
		= (((Class173_Sub1_Sub2) this).aD3DCAPS11364.TextureCaps
		   & 0x10000) != 0;
	    ((Class173_Sub1_Sub2) this).aBool11387
		= (((Class173_Sub1_Sub2) this).aD3DCAPS11364.TextureCaps
		   & 0x4000) != 0;
	    aBool9279
		= (((Class173_Sub1_Sub2) this).aD3DCAPS11364.NumSimultaneousRTs
		   > 0);
	    aBool9359 = aBool9279;
	    aBool9364
		= (((Class173_Sub1_Sub2) this).aD3DCAPS11364.NumSimultaneousRTs
		   > 0);
	    aBool9362
		= anInt9355 > 0 || (IDirect3D.CheckDeviceMultiSampleType
				    (((Class173_Sub1_Sub2) this).aLong11367,
				     ((Class173_Sub1_Sub2) this).anInt11382,
				     ((Class173_Sub1_Sub2) this).anInt11344,
				     (((Class173_Sub1_Sub2) this)
				      .aD3DPRESENT_PARAMETERS11368
				      .BackBufferFormat),
				     true, 2)) == 0;
	    aBool9225 = ((((Class173_Sub1_Sub2) this).aD3DCAPS11364
			  .NumSimultaneousRTs) > 0 && anInt9355 > 0
			 || (IDirect3D.CheckDeviceMultiSampleType
			     (((Class173_Sub1_Sub2) this).aLong11367,
			      ((Class173_Sub1_Sub2) this).anInt11382,
			      ((Class173_Sub1_Sub2) this).anInt11344, 113,
			      true, 2)) == 0);
	    ((Class173_Sub1_Sub2) this).aBool11369
		= (IDirect3D.CheckDeviceFormat
		   (((Class173_Sub1_Sub2) this).aLong11367,
		    ((Class173_Sub1_Sub2) this).anInt11382,
		    ((Class173_Sub1_Sub2) this).anInt11344,
		    (((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
		     .BackBufferFormat),
		    0, 1, method8566('A', 'T', 'O', 'C'))) == 0;
	    ((Class173_Sub1_Sub2) this).aBool11370
		= (IDirect3D.CheckDeviceFormat
		   (((Class173_Sub1_Sub2) this).aLong11367,
		    ((Class173_Sub1_Sub2) this).anInt11382,
		    ((Class173_Sub1_Sub2) this).anInt11344,
		    (((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
		     .BackBufferFormat),
		    0, 1, method8566('A', '2', 'M', '1'))) == 0;
	    ((Class173_Sub1_Sub2) this).aBool11343
		= (IDirect3D.CheckDeviceFormat
		   (((Class173_Sub1_Sub2) this).aLong11367,
		    ((Class173_Sub1_Sub2) this).anInt11382,
		    ((Class173_Sub1_Sub2) this).anInt11344,
		    (((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
		     .BackBufferFormat),
		    0, 1, method8566('S', 'S', 'A', 'A'))) == 0;
	    aBool9370
		= (((Class173_Sub1_Sub2) this).aD3DCAPS11364.PrimitiveMiscCaps
		   & 0x20000) != 0;
	    ((Class173_Sub1_Sub2) this).aBool11372
		= (IDirect3D.CheckDeviceFormat
		   (((Class173_Sub1_Sub2) this).aLong11367,
		    ((Class173_Sub1_Sub2) this).anInt11382,
		    ((Class173_Sub1_Sub2) this).anInt11344,
		    ((Class173_Sub1_Sub2) this).aD3DDISPLAYMODE11348.Format,
		    524288, 3, 113)) == 0;
	    ((Class173_Sub1_Sub2) this).aBool11373
		= (IDirect3D.CheckDeviceFormat
		   (((Class173_Sub1_Sub2) this).aLong11367,
		    ((Class173_Sub1_Sub2) this).anInt11382,
		    ((Class173_Sub1_Sub2) this).anInt11344,
		    ((Class173_Sub1_Sub2) this).aD3DDISPLAYMODE11348.Format,
		    524288, 3, 116)) == 0;
	    ((Class173_Sub1_Sub2) this).aBoolArray11385
		= new boolean[anInt9235];
	    ((Class173_Sub1_Sub2) this).aBoolArray11349
		= new boolean[anInt9235];
	    ((Class173_Sub1_Sub2) this).aBoolArray11357
		= new boolean[anInt9235];
	    ((Class173_Sub1_Sub2) this).aClass340Array11359
		= new Class340[anInt9235];
	    ((Class173_Sub1_Sub2) this).aBoolArray11366
		= new boolean[anInt9235];
	    ((Class173_Sub1_Sub2) this).anIntArray11360 = new int[anInt9235];
	    Class433 class433 = new Class433();
	    class433.method5227(1.0F, -1.0F, 0.5F);
	    class433.method5252(0.0F, 0.0F, 0.5F);
	    ((Class173_Sub1_Sub2) this).aClass418_11361 = new Class418();
	    ((Class173_Sub1_Sub2) this).aClass418_11361.method5035(class433);
	    IDirect3DDevice.BeginScene(((Class173_Sub1_Sub2) this).aLong11378);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method2156(-1372793801);
	    throw new RuntimeException("");
	}
    }
    
    void method8557() {
	for (Class528_Sub31 class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8034(1063055001);
	     class528_sub31 != null;
	     class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8037(-1703844006)) {
	    Interface49 interface49
		= (Interface49) class528_sub31.anObject10468;
	    interface49.method336();
	    if (interface49 == aClass163_1998)
		interface49.method335();
	}
	super.method8557();
    }
    
    void method8601() {
	method2342();
	for (Class528_Sub31 class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8034(1274142254);
	     class528_sub31 != null;
	     class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8037(664427182)) {
	    Interface49 interface49
		= (Interface49) class528_sub31.anObject10468;
	    interface49.method115();
	}
	super.method8601();
    }
    
    boolean method10381(int i, int i_3_) {
	int i_4_
	    = IDirect3DDevice.TestCooperativeLevel(((Class173_Sub1_Sub2) this)
						   .aLong11378);
	if (i_4_ == 0 || i_4_ == -2005530519) {
	    IDirect3DDevice.SetDepthStencilSurface((((Class173_Sub1_Sub2) this)
						    .aLong11378),
						   0L);
	    for (int i_5_ = 1; i_5_ < 4; i_5_++)
		IDirect3DDevice.SetRenderTarget((((Class173_Sub1_Sub2) this)
						 .aLong11378),
						i_5_, 0L);
	    for (int i_6_ = 0; i_6_ < 4; i_6_++)
		IDirect3DDevice.SetStreamSource((((Class173_Sub1_Sub2) this)
						 .aLong11378),
						i_6_, 0L, 0, 0);
	    for (int i_7_ = 0; i_7_ < 4; i_7_++)
		IDirect3DDevice.SetTexture((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   i_7_, 0L);
	    IDirect3DDevice.SetIndices(((Class173_Sub1_Sub2) this).aLong11378,
				       0L);
	    method8601();
	    ((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
		.BackBufferWidth
		= i;
	    ((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
		.BackBufferHeight
		= i_3_;
	    ((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
		.BackBufferCount
		= 1;
	    if (method10396(((Class173_Sub1_Sub2) this).anInt11382,
			    ((Class173_Sub1_Sub2) this).anInt11344,
			    ((Class173_Sub1_Sub2) this).aLong11367, anInt9355,
			    ((Class173_Sub1_Sub2) this).aD3DDISPLAYMODE11348,
			    (((Class173_Sub1_Sub2) this)
			     .aD3DPRESENT_PARAMETERS11368))) {
		int i_8_
		    = IDirect3DDevice.Reset((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    (((Class173_Sub1_Sub2) this)
					     .aD3DPRESENT_PARAMETERS11368));
		if (Class360.method4593(i_8_)) {
		    ((Class173_Sub1_Sub2) this).aBool11350 = false;
		    method8557();
		    method8668();
		    return true;
		}
	    }
	}
	return false;
    }
    
    void method8668() {
	for (int i = 0; i < anInt9235; i++) {
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    i, 7, 2);
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    i, 6, 2);
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    i, 5, 2);
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    i, 1, 1);
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    i, 2, 1);
	    ((Class173_Sub1_Sub2) this).aClass340Array11359[i]
		= Class340.aClass340_3585;
	    boolean[] bools = ((Class173_Sub1_Sub2) this).aBoolArray11385;
	    int i_9_ = i;
	    ((Class173_Sub1_Sub2) this).aBoolArray11349[i] = true;
	    bools[i_9_] = true;
	    ((Class173_Sub1_Sub2) this).aBoolArray11366[i] = false;
	    ((Class173_Sub1_Sub2) this).anIntArray11360[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
					      .aLong11378),
					     0, 6, 1);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       9, 2);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       23, 4);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       25, 5);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       24, 0);
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 206,
				   aBool9370);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       181, 0);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       22, 2);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       147, 1);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       145, 1);
	IDirect3DDevice.method9172(((Class173_Sub1_Sub2) this).aLong11378, 38,
				   0.95F);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       35, 3);
	IDirect3DDevice.method9172(((Class173_Sub1_Sub2) this).aLong11378, 154,
				   1.0F);
	D3DLIGHT.SetType(((Class173_Sub1_Sub2) this).aLong11351, 3);
	D3DLIGHT.SetType(((Class173_Sub1_Sub2) this).aLong11353, 3);
	D3DLIGHT.SetType(((Class173_Sub1_Sub2) this).aLong11347, 1);
	((Class173_Sub1_Sub2) this).aBool11354 = false;
	super.method8668();
    }
    
    public Class152 method2528() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(((Class173_Sub1_Sub2) this).aLong11367,
				       ((Class173_Sub1_Sub2) this).anInt11382,
				       0, d3dadapter_identifier);
	return new Class152(d3dadapter_identifier.VendorID,
			    method8450() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion, method8450());
    }
    
    void method2154(int i, int i_10_) throws Exception_Sub5 {
	if (((Class173_Sub1_Sub2) this).aBool11350) {
	    if (!method10381(aClass163_Sub2_1999.method2074(),
			     aClass163_Sub2_1999.method2070()))
		return;
	    ((Class163_Sub2_Sub2_Sub1) aClass163_Sub2_1999).method336();
	} else
	    IDirect3DDevice.EndScene(((Class173_Sub1_Sub2) this).aLong11378);
	int i_11_ = aClass163_Sub2_1999.method8917();
	if (Class360.method4592(i_11_)) {
	    ((Class173_Sub1_Sub2) this).aBool11350 = true;
	    aClass163_Sub2_1999.method115();
	} else {
	    IDirect3DDevice.BeginScene(((Class173_Sub1_Sub2) this).aLong11378);
	    if (anInterface22_1991 != null)
		anInterface22_1991.method27((byte) -38);
	}
    }
    
    public void method2155() {
	long l = IDirect3DDevice
		     .CreateEventQuery(((Class173_Sub1_Sub2) this).aLong11378);
	if (Class360.method4593(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    void method8488() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 174,
				   aBool9386);
    }
    
    public final void method8714(Class363 class363, int i, int i_12_) {
	if (((Class173_Sub1_Sub2) this).aClass262_Sub1_11362 != null)
	    ((Class173_Sub1_Sub2) this).aClass262_Sub1_11362.method8981();
	IDirect3DDevice.DrawPrimitive(((Class173_Sub1_Sub2) this).aLong11378,
				      method10398(class363), i, i_12_);
    }
    
    public float method8468() {
	return -0.5F;
    }
    
    Class344 method8543(Class345[] class345s) {
	return new Class344_Sub1(this, class345s);
    }
    
    Class163_Sub2 method2253(Canvas canvas, int i, int i_13_) {
	return new Class163_Sub2_Sub2_Sub1(this, canvas, i, i_13_, false);
    }
    
    public Interface19 method2416(int i, int i_14_, Class149 class149,
				  Class169 class169, int i_15_) {
	return new Class415(this, class149, class169, i, i_14_, i_15_);
    }
    
    public Interface21 method2184(int i, int i_16_) {
	return new Class400(this, Class169.aClass169_1937, i, i_16_, 0);
    }
    
    void method8635() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 7,
				   aBool9286);
    }
    
    Class528_Sub31 method10382(Interface49 interface49) {
	for (Class528_Sub31 class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8034(2012806102);
	     class528_sub31 != null;
	     class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8037(1140211272)) {
	    if (class528_sub31.anObject10468 == interface49)
		return class528_sub31;
	}
	return null;
    }
    
    void method8720() {
	if (aBool9274) {
	    float f = aBool9288 ? aFloat9299 : 0.0F;
	    float f_17_ = aBool9288 ? -aFloat9300 : 0.0F;
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11351,
				f * aFloat9295, f * aFloat9296, f * aFloat9251,
				0.0F);
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11353,
				f_17_ * aFloat9295, f_17_ * aFloat9296,
				f_17_ * aFloat9251, 0.0F);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    void method10383(Interface49 interface49) {
	Class528_Sub31 class528_sub31 = method10382(interface49);
	if (class528_sub31 != null)
	    class528_sub31.method6443(1887659281);
    }
    
    public Class163_Sub1 method2313() {
	return new Class163_Sub1_Sub3_Sub1(this);
    }
    
    public void method8552(Class344 class344) {
	Class344_Sub1 class344_sub1 = (Class344_Sub1) class344;
	IDirect3DDevice.SetVertexDeclaration((((Class173_Sub1_Sub2) this)
					      .aLong11378),
					     (((Class344_Sub1) class344_sub1)
					      .aLong10047));
    }
    
    void method10384(int i, int i_18_) {
	method2342();
	method2197(i, i_18_, (byte) 1);
	((Class173_Sub1_Sub2) this).aLong11380
	    = (IDirect3DDevice.CreateRenderTarget
	       (((Class173_Sub1_Sub2) this).aLong11378, i, i_18_,
		method10394(Class149.aClass149_1676, Class169.aClass169_1935),
		0, 0, false));
	for (int i_19_ = 0; i_19_ < 3; i_19_++)
	    ((Class173_Sub1_Sub2) this).aLongArray11358[i_19_]
		= (IDirect3DDevice.CreateOffscreenPlainSurface
		   (((Class173_Sub1_Sub2) this).aLong11378, i, i_18_,
		    method10394(Class149.aClass149_1676,
				Class169.aClass169_1935),
		    2));
	method8451(i * i_18_ * 4);
    }
    
    public Interface21 method2150(int i, int i_20_) {
	return new Class400(this, Class169.aClass169_1937, i, i_20_, 0);
    }
    
    public boolean method2189() {
	return true;
    }
    
    public boolean method2531() {
	return false;
    }
    
    void method8556() {
	switch (aClass368_9351.anInt3856) {
	case 0:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 5);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 6);
	    break;
	case 3:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 2);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 2);
	    break;
	case 1:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 2);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 1);
	    break;
	case 2:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 9);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 2);
	    break;
	}
	switch (anInt9384) {
	case 1:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 2);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 1);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 1);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 2);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 1);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 1);
	    break;
	case 2:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 2);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 2);
	    break;
	}
    }
    
    public int method2427() {
	if ((((Class173_Sub1_Sub2) this).aLongArray11381
	     [((Class173_Sub1_Sub2) this).anInt11345])
	    == 0L)
	    return -1;
	return (Class360.method4593(IDirect3DEventQuery.IsSignaled
				    (((Class173_Sub1_Sub2) this)
				     .aLongArray11381
				     [((Class173_Sub1_Sub2) this).anInt11345]))
		? (((Class173_Sub1_Sub2) this).anIntArray11383
		   [((Class173_Sub1_Sub2) this).anInt11345])
		: -1);
    }
    
    void method8684() {
	if (aBool9274) {
	    int i = (((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308]
		     ? method10390(aClass356Array9312[anInt9308]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, 1, i);
	}
    }
    
    void method8545(int i) {
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       168, i);
    }
    
    public void method2196(int i, int i_21_, int[] is, int[] is_22_) {
	method10385(i, i_21_, is, is_22_);
    }
    
    long method10385(int i, int i_23_, int[] is, int[] is_24_) {
	if ((((Class173_Sub1_Sub2) this).aLongArray11381
	     [((Class173_Sub1_Sub2) this).anInt11345])
	    != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLongArray11381
			     [((Class173_Sub1_Sub2) this).anInt11345]);
	    ((Class173_Sub1_Sub2) this).aLongArray11381
		[((Class173_Sub1_Sub2) this).anInt11345]
		= 0L;
	}
	aByteBuffer9222.clear();
	IDirect3DSurface.Download((((Class173_Sub1_Sub2) this).aLongArray11358
				   [((Class173_Sub1_Sub2) this).anInt11345]),
				  0, 0, i, i_23_, i * 4, 0, aLong9223);
	if (++((Class173_Sub1_Sub2) this).anInt11345 >= 3)
	    ((Class173_Sub1_Sub2) this).anInt11345 = 0;
	if (is != null) {
	    aByteBuffer9222.asIntBuffer().get(is);
	    return 0L;
	}
	return aLong9223;
    }
    
    public String method2169() {
	String string = "Caps: 4:";
	String string_25_ = ":";
	string = new StringBuilder().append(string).append(anInt9355).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append(anInt9235).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append(anInt9211).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9362 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (method8448() ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (method8596() ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9368 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9278 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11384 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11365 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11377 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11387 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9279 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9364 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9225 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11369 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11370 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11343 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9370 ? 1 : 0).append
		     (string_25_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11372 ? 1 : 0).append
		     (string_25_).toString();
	string
	    = new StringBuilder().append(string).append
		  (((Class173_Sub1_Sub2) this).aBool11373 ? 1 : 0).toString();
	return string;
    }
    
    public void method2331(int i, int i_26_, int[] is, int[] is_27_) {
	method10385(i, i_26_, is, is_27_);
    }
    
    void method2489() {
	super.finalize();
    }
    
    public void method2268(int i, int i_28_) {
	IDirect3DDevice.Clear(((Class173_Sub1_Sub2) this).aLong11378, i, i_28_,
			      1.0F, 0);
    }
    
    void method8483() {
	if (aClass163_1998 != null)
	    IDirect3DDevice.SetViewport(((Class173_Sub1_Sub2) this).aLong11378,
					anInt9282 + anInt9275,
					anInt9238 + anInt9350, anInt9258,
					anInt9303, aFloat9367, aFloat9265);
    }
    
    void method2492() {
	super.finalize();
    }
    
    void method8485() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 174,
				   aBool9386);
    }
    
    public Class168 method2436(Class168 class168, Class168 class168_29_,
			       float f, Class168 class168_30_) {
	return f < 0.5F ? class168 : class168_29_;
    }
    
    final void method10386(long l) {
	IDirect3DDevice.SetPixelShader(((Class173_Sub1_Sub2) this).aLong11378,
				       l);
    }
    
    public void method8693(Class418 class418, Class418 class418_31_,
			   Class418 class418_32_) {
	IDirect3DDevice.SetTransform(((Class173_Sub1_Sub2) this).aLong11378,
				     256, class418.aFloatArray4768);
	IDirect3DDevice.SetTransform(((Class173_Sub1_Sub2) this).aLong11378, 2,
				     class418_31_.aFloatArray4768);
	IDirect3DDevice.SetTransform(((Class173_Sub1_Sub2) this).aLong11378, 3,
				     class418_32_.aFloatArray4768);
    }
    
    Interface34 method8519(Class149 class149, Class169 class169, int i,
			   int i_33_) {
	return new Class402_Sub2(this, class149, class169, i, i_33_);
    }
    
    void method8465() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 7,
				   aBool9286);
    }
    
    void method8504() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 14,
				   aBool9284 && aBool9246);
    }
    
    final void method8524() {
	if (aBool9274)
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   60, anInt9314);
    }
    
    void method8649() {
	if (aBool9274) {
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11351,
				  -aFloatArray9290[0], -aFloatArray9290[1],
				  -aFloatArray9290[2]);
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11353,
				  -aFloatArray9267[0], -aFloatArray9267[1],
				  -aFloatArray9267[2]);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    boolean method8514(Class149 class149, Class169 class169) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class360.method4593(IDirect3D.GetAdapterDisplayMode
				    (((Class173_Sub1_Sub2) this).aLong11367,
				     ((Class173_Sub1_Sub2) this).anInt11382,
				     d3ddisplaymode))
		&& Class360.method4593(IDirect3D.CheckDeviceFormat
				       (((Class173_Sub1_Sub2) this).aLong11367,
					((Class173_Sub1_Sub2) this).anInt11382,
					((Class173_Sub1_Sub2) this).anInt11344,
					d3ddisplaymode.Format, 0, 3,
					method10394(class149, class169))));
    }
    
    void method8445() {
	if (aBool9274) {
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11351,
				  -aFloatArray9290[0], -aFloatArray9290[1],
				  -aFloatArray9290[2]);
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11353,
				  -aFloatArray9267[0], -aFloatArray9267[1],
				  -aFloatArray9267[2]);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    void method8460() {
	method8621();
	method8705();
    }
    
    void method8705() {
	if (aBool9274 && !((Class173_Sub1_Sub2) this).aBool11354) {
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					0, false);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					1, false);
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378, 0,
				     ((Class173_Sub1_Sub2) this).aLong11351);
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378, 1,
				     ((Class173_Sub1_Sub2) this).aLong11353);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					0, true);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					1, true);
	    ((Class173_Sub1_Sub2) this).aBool11354 = true;
	}
    }
    
    void method8513() {
	int i;
	for (i = 0; i < anInt9333; i++) {
	    Class528_Sub12 class528_sub12 = aClass528_Sub12Array9210[i];
	    int i_34_ = i + 2;
	    int i_35_ = class528_sub12.method9361((byte) -59);
	    float f = class528_sub12.method9362(1918314738) / 255.0F;
	    D3DLIGHT.SetPosition(((Class173_Sub1_Sub2) this).aLong11347,
				 (float) class528_sub12.method9366(1583421443),
				 (float) class528_sub12
					     .method9360(-1375654801),
				 (float) class528_sub12
					     .method9370(1221114533));
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11347,
				(float) (i_35_ >> 16 & 0xff) * f,
				(float) (i_35_ >> 8 & 0xff) * f,
				(float) (i_35_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(((Class173_Sub1_Sub2) this).aLong11347, 0.0F, 0.0F,
		 1.0F / (float) (class528_sub12.method9357(1292893295)
				 * class528_sub12.method9357(2045738369)));
	    D3DLIGHT.SetRange(((Class173_Sub1_Sub2) this).aLong11347,
			      (float) class528_sub12.method9357(2103404699));
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378,
				     i_34_,
				     ((Class173_Sub1_Sub2) this).aLong11347);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					i_34_, true);
	}
	for (/**/; i < anInt9302; i++)
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					i + 2, false);
    }
    
    public final void method8718(Class363 class363, int i, int i_36_,
				 int i_37_, int i_38_) {
	if (((Class173_Sub1_Sub2) this).aClass262_Sub1_11362 != null)
	    ((Class173_Sub1_Sub2) this).aClass262_Sub1_11362.method8981();
	IDirect3DDevice.DrawIndexedPrimitive((((Class173_Sub1_Sub2) this)
					      .aLong11378),
					     method10398(class363), 0, i,
					     i_36_, i_37_, i_38_);
    }
    
    void method8640() {
	if (aBool9274)
	    IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378,
				       137, aBool9343 && !aBool9297);
    }
    
    void method8515() {
	/* empty */
    }
    
    void method8539() {
	if (aBool9274) {
	    int i = (((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308]
		     ? method10390(aClass356Array9313[anInt9308]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, 4, i);
	}
    }
    
    Interface34 method8520(Class149 class149, int i, int i_39_, boolean bool,
			   byte[] is, int i_40_, int i_41_) {
	return new Class402_Sub2(this, class149, i, i_39_, bool, is, i_40_,
				 i_41_);
    }
    
    Interface34 method8521(Class149 class149, int i, int i_42_, boolean bool,
			   float[] fs, int i_43_, int i_44_) {
	return new Class402_Sub2(this, class149, i, i_42_, bool, fs, i_43_,
				 i_44_);
    }
    
    Interface43 method8525(Class149 class149, Class169 class169, int i,
			   int i_45_) {
	return new Class402_Sub2_Sub1(this, class149, class169, i, i_45_);
    }
    
    final void method8529(int i, Class357 class357, boolean bool,
			  boolean bool_46_) {
	if (aBool9274) {
	    int i_47_ = 0;
	    int i_48_;
	    switch (i) {
	    case 2:
		i_48_ = 26;
		break;
	    case 1:
		i_48_ = 3;
		break;
	    default:
		i_48_ = 2;
	    }
	    if (bool)
		i_47_ |= 0x20;
	    if (bool_46_)
		i_47_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, i_48_,
						 (method10391(class357)
						  | i_47_));
	}
    }
    
    Interface32 method8469(Class149 class149, int i, int i_49_, int i_50_,
			   boolean bool, byte[] is) {
	return new Class402_Sub1(this, class149, i, i_49_, i_50_, bool, is);
    }
    
    final void method10387(Class402 class402) {
	IDirect3DDevice.SetTexture(((Class173_Sub1_Sub2) this).aLong11378,
				   anInt9308, class402.method4848());
	if (aBool9274
	    && !((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308]) {
	    ((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308] = true;
	    method8539();
	    method8722();
	}
    }
    
    final void method10388(Class402_Sub2 class402_sub2) {
	method10387(class402_sub2);
	if (((Class173_Sub1_Sub2) this).aBoolArray11385[anInt9308]
	    != ((Class402_Sub2) class402_sub2).aBool10119) {
	    IDirect3DDevice.SetSamplerState
		(((Class173_Sub1_Sub2) this).aLong11378, anInt9308, 1,
		 ((Class402_Sub2) class402_sub2).aBool10119 ? 1 : 3);
	    ((Class173_Sub1_Sub2) this).aBoolArray11385[anInt9308]
		= ((Class402_Sub2) class402_sub2).aBool10119;
	}
	if (((Class173_Sub1_Sub2) this).aBoolArray11349[anInt9308]
	    != ((Class402_Sub2) class402_sub2).aBool10120) {
	    IDirect3DDevice.SetSamplerState
		(((Class173_Sub1_Sub2) this).aLong11378, anInt9308, 2,
		 ((Class402_Sub2) class402_sub2).aBool10120 ? 1 : 3);
	    ((Class173_Sub1_Sub2) this).aBoolArray11349[anInt9308]
		= ((Class402_Sub2) class402_sub2).aBool10120;
	}
    }
    
    final void method10389(Class402_Sub1 class402_sub1) {
	method10387(class402_sub1);
	if (!((Class173_Sub1_Sub2) this).aBoolArray11385[anInt9308]) {
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    anInt9308, 1, 1);
	    ((Class173_Sub1_Sub2) this).aBoolArray11385[anInt9308] = true;
	}
	if (!((Class173_Sub1_Sub2) this).aBoolArray11349[anInt9308]) {
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    anInt9308, 2, 1);
	    ((Class173_Sub1_Sub2) this).aBoolArray11349[anInt9308] = true;
	}
    }
    
    public float method8583() {
	return -0.5F;
    }
    
    Interface34 method8522(int i, int i_51_, boolean bool, int[] is, int i_52_,
			   int i_53_) {
	return new Class402_Sub2(this, i, i_51_, bool, is, i_52_, i_53_);
    }
    
    void method8726() {
	/* empty */
    }
    
    public boolean method2426() {
	return true;
    }
    
    final void method8671(int i, Class357 class357, boolean bool,
			  boolean bool_54_) {
	if (aBool9274) {
	    int i_55_ = 0;
	    int i_56_;
	    switch (i) {
	    case 2:
		i_56_ = 26;
		break;
	    case 1:
		i_56_ = 3;
		break;
	    default:
		i_56_ = 2;
	    }
	    if (bool)
		i_55_ |= 0x20;
	    if (bool_54_)
		i_55_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, i_56_,
						 (method10391(class357)
						  | i_55_));
	}
    }
    
    final void method8679() {
	if (aBool9274)
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   60, anInt9314);
    }
    
    final void method8604(int i, Class357 class357, boolean bool) {
	if (aBool9274) {
	    int i_57_ = 0;
	    int i_58_;
	    switch (i) {
	    default:
		i_58_ = 5;
		break;
	    case 1:
		i_58_ = 6;
		break;
	    case 2:
		i_58_ = 27;
	    }
	    if (bool)
		i_57_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, i_58_,
						 (method10391(class357)
						  | i_57_));
	}
    }
    
    final void method8537() {
	if (aBool9274)
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   60, anInt9314);
    }
    
    static final int method10390(Class356 class356) {
	switch (class356.anInt3812) {
	default:
	    throw new IllegalArgumentException();
	case 0:
	    return 7;
	case 1:
	    return 4;
	case 2:
	    return 2;
	case 3:
	    return 26;
	case 4:
	    return 10;
	}
    }
    
    static final int method10391(Class357 class357) {
	switch (class357.anInt3815) {
	case 1:
	    return 0;
	case 2:
	    return 3;
	default:
	    throw new IllegalArgumentException();
	case 0:
	    return 1;
	case 3:
	    return 2;
	}
    }
    
    public final void method8561(Class363 class363, int i, int i_59_) {
	if (((Class173_Sub1_Sub2) this).aClass262_Sub1_11362 != null)
	    ((Class173_Sub1_Sub2) this).aClass262_Sub1_11362.method8981();
	IDirect3DDevice.DrawPrimitive(((Class173_Sub1_Sub2) this).aLong11378,
				      method10398(class363), i, i_59_);
    }
    
    void method8570() {
	IDirect3DDevice.SetScissorRect(((Class173_Sub1_Sub2) this).aLong11378,
				       anInt9282 + anInt9272,
				       anInt9238 + anInt9365, anInt9273,
				       anInt9271);
    }
    
    void method8546() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 15,
				   aBool9353);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       24, aByte9354 & 0xff);
	if ((((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9353 || aByte9354 == 0) {
		if (((Class173_Sub1_Sub2) this).aBool11343
		    || ((Class173_Sub1_Sub2) this).aBool11369)
		    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						    .aLong11378),
						   181, 0);
		else if (((Class173_Sub1_Sub2) this).aBool11370)
		    IDirect3DDevice.method9172((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       154, 1.0F);
	    } else if (((Class173_Sub1_Sub2) this).aBool11343)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       181,
					       method8566('S', 'S', 'A', 'A'));
	    else if (((Class173_Sub1_Sub2) this).aBool11369)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       181,
					       method8566('A', 'T', 'O', 'C'));
	    else if (((Class173_Sub1_Sub2) this).aBool11370)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       154,
					       method8566('A', '2', 'M', '1'));
	}
    }
    
    public boolean method2316() {
	if (((Class173_Sub1_Sub2) this).aBool11350)
	    return false;
	if ((((Class173_Sub1_Sub2) this).aLongArray11381
	     [((Class173_Sub1_Sub2) this).anInt11356])
	    != 0L)
	    return false;
	return true;
    }
    
    void method8548() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 27,
				   aBool9338);
    }
    
    public void method2332() {
	if (((Class173_Sub1_Sub2) this).aLong11380 != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLong11380);
	    ((Class173_Sub1_Sub2) this).aLong11380 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	    if (((Class173_Sub1_Sub2) this).aLongArray11358[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11358[i]);
		((Class173_Sub1_Sub2) this).aLongArray11358[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    void method8470(boolean bool) {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 161,
				   bool);
    }
    
    final Interface41 method8476(boolean bool) {
	return new Class413(this, Class169.aClass169_1933, bool);
    }
    
    Interface34 method8656(Class149 class149, Class169 class169, int i,
			   int i_60_) {
	return new Class402_Sub2(this, class149, class169, i, i_60_);
    }
    
    public Class163_Sub1 method2236() {
	return new Class163_Sub1_Sub3_Sub1(this);
    }
    
    void method8611() {
	method2342();
	for (Class528_Sub31 class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352.method8034(713198171);
	     class528_sub31 != null;
	     class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8037(2009034462)) {
	    Interface49 interface49
		= (Interface49) class528_sub31.anObject10468;
	    interface49.method115();
	}
	super.method8601();
    }
    
    public void method8553(int i, Interface36 interface36) {
	Class408 class408 = (Class408) interface36;
	IDirect3DDevice.SetStreamSource(((Class173_Sub1_Sub2) this).aLong11378,
					i, ((Class408) class408).aLong4706, 0,
					class408.method4887());
    }
    
    void method8554(Interface41 interface41) {
	IDirect3DDevice.SetIndices(((Class173_Sub1_Sub2) this).aLong11378,
				   (((Class413) (Class413) interface41)
				    .aLong4730));
    }
    
    boolean method8678(Class149 class149, Class169 class169) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class360.method4593(IDirect3D.GetAdapterDisplayMode
				    (((Class173_Sub1_Sub2) this).aLong11367,
				     ((Class173_Sub1_Sub2) this).anInt11382,
				     d3ddisplaymode))
		&& Class360.method4593(IDirect3D.CheckDeviceFormat
				       (((Class173_Sub1_Sub2) this).aLong11367,
					((Class173_Sub1_Sub2) this).anInt11382,
					((Class173_Sub1_Sub2) this).anInt11344,
					d3ddisplaymode.Format, 0, 4,
					method10394(class149, class169))));
    }
    
    static Class173 method10392
	(Canvas canvas, Class165 class165, Interface22 interface22,
	 Interface44 interface44, Interface45 interface45,
	 Interface46 interface46, Class446 class446, Integer integer) {
	Class173_Sub1_Sub2 class173_sub1_sub2 = null;
	Class173_Sub1_Sub2 class173_sub1_sub2_61_;
	try {
	    int i = 0;
	    int i_62_ = 1;
	    long l = IDirect3D.Direct3DCreate();
	    D3DCAPS d3dcaps = new D3DCAPS();
	    IDirect3D.GetDeviceCaps(l, i, i_62_, d3dcaps);
	    if ((d3dcaps.RasterCaps & 0x1000000) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxSimultaneousTextures < 2)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x8) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x40) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x200) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
		throw new RuntimeException("");
	    if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
		throw new RuntimeException("");
	    if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
		throw new RuntimeException("");
	    if (d3dcaps.MaxStreams < 5)
		throw new RuntimeException("");
	    D3DPRESENT_PARAMETERS d3dpresent_parameters
		= new D3DPRESENT_PARAMETERS(canvas);
	    d3dpresent_parameters.Windowed = true;
	    d3dpresent_parameters.EnableAutoDepthStencil = true;
	    d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
	    d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
	    d3dpresent_parameters.BackBufferCount = 1;
	    d3dpresent_parameters.PresentationInterval = -2147483648;
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (!method10396(i, i_62_, l, integer.intValue(), d3ddisplaymode,
			     d3dpresent_parameters))
		throw new RuntimeException("");
	    int i_63_ = 0;
	    if ((d3dcaps.DevCaps & 0x100000) != 0)
		i_63_ |= 0x10;
	    long l_64_ = 0L;
	    try {
		l_64_ = IDirect3D.CreateDeviceContext(l, i, i_62_, canvas,
						      i_63_ | 0x40,
						      d3dpresent_parameters);
	    } catch (RuntimeException_Sub5 runtimeexception_sub5) {
		l_64_ = IDirect3D.CreateDeviceContext(l, i, i_62_, canvas,
						      i_63_ & ~0x100000 | 0x20,
						      d3dpresent_parameters);
	    }
	    class173_sub1_sub2
		= new Class173_Sub1_Sub2(i, i_62_, l, l_64_, d3ddisplaymode,
					 d3dpresent_parameters, d3dcaps,
					 class165, interface22, interface44,
					 interface45, interface46, class446,
					 integer.intValue());
	    if (!class173_sub1_sub2.aHashtable2000.containsKey(canvas)) {
		Class607.method7232(canvas, 1774790062);
		class173_sub1_sub2.method2387
		    (canvas,
		     new Class163_Sub2_Sub2_Sub1(class173_sub1_sub2, canvas,
						 canvas.getWidth(),
						 canvas.getHeight(), true),
		     (byte) 31);
	    }
	    class173_sub1_sub2.method2177(canvas, (short) 168);
	    class173_sub1_sub2.method8458();
	    class173_sub1_sub2_61_ = class173_sub1_sub2;
	} catch (RuntimeException runtimeexception) {
	    if (class173_sub1_sub2 != null)
		class173_sub1_sub2.method2199();
	    throw runtimeexception;
	}
	return class173_sub1_sub2_61_;
    }
    
    public final void method8563(Class363 class363, int i, int i_65_,
				 int i_66_, int i_67_) {
	if (((Class173_Sub1_Sub2) this).aClass262_Sub1_11362 != null)
	    ((Class173_Sub1_Sub2) this).aClass262_Sub1_11362.method8981();
	IDirect3DDevice.DrawIndexedPrimitive((((Class173_Sub1_Sub2) this)
					      .aLong11378),
					     method10398(class363), 0, i,
					     i_65_, i_66_, i_67_);
    }
    
    byte[] method10393(String string) {
	return method8454("dx", string);
    }
    
    public Class258 method8580(String string) {
	byte[] is = method10393(string);
	if (is == null)
	    return null;
	Class275 class275 = method8455(is);
	return new Class258_Sub1(this, class275);
    }
    
    public final synchronized void method2158(int i) {
	for (int i_68_ = 0; i_68_ < ((Class173_Sub1_Sub2) this).anInt11355;
	     i_68_++)
	    IUnknown
		.Release(((Class173_Sub1_Sub2) this).aLongArray11371[i_68_]);
	((Class173_Sub1_Sub2) this).anInt11355 = 0;
	super.method2158(i);
    }
    
    static final int method10394(Class149 class149, Class169 class169) {
	switch (class169.anInt1941 * 1984037941) {
	case 3:
	    if (class149 == Class149.aClass149_1676)
		return 116;
	    break;
	case 6:
	    switch (class149.anInt1685 * -78130535) {
	    case 2:
		return 28;
	    case 4:
		return 22;
	    case 9:
		return 77;
	    case 3:
		return Class349.anInt3672 * 2127203671;
	    case 0:
		return 50;
	    case 5:
		return 21;
	    default:
		break;
	    case 7:
		return 51;
	    case 6:
		return Class349.anInt3673 * 112329901;
	    }
	    break;
	case 5:
	    if (class149 == Class149.aClass149_1676)
		return 113;
	    break;
	}
	throw new IllegalArgumentException("");
    }
    
    static final int method10395(Class169 class169) {
	if (class169 == Class169.aClass169_1933)
	    return 80;
	if (class169 == Class169.aClass169_1937)
	    return 77;
	throw new IllegalArgumentException("");
    }
    
    Class163_Sub2 method2310(Canvas canvas, int i, int i_69_) {
	return new Class163_Sub2_Sub2_Sub1(this, canvas, i, i_69_, false);
    }
    
    public void method2281(boolean bool) {
	/* empty */
    }
    
    static boolean method10396(int i, int i_70_, long l, int i_71_,
			       D3DDISPLAYMODE d3ddisplaymode,
			       D3DPRESENT_PARAMETERS d3dpresent_parameters) {
	int i_72_ = 0;
	int i_73_ = 0;
	int i_74_ = 0;
	boolean bool;
	try {
	    if (Class360.method4592
		(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
		return false;
	while_61_:
	    for (/**/; i_71_ >= 0; i_71_--) {
		if (i_71_ != 1) {
		    i_74_ = 0 + i_71_;
		    for (int i_75_ = 0; i_75_ < anIntArray11346.length;
			 i_75_++) {
			if (IDirect3D.CheckDeviceType(l, i, i_70_,
						      d3ddisplaymode.Format,
						      anIntArray11346[i_75_],
						      true) == 0
			    && IDirect3D.CheckDeviceFormat(l, i, i_70_,
							   (d3ddisplaymode
							    .Format),
							   1, 1,
							   (anIntArray11346
							    [i_75_])) == 0
			    && (i_71_ == 0
				|| (IDirect3D.CheckDeviceMultiSampleType
				    (l, i, i_70_, anIntArray11346[i_75_], true,
				     i_74_)) == 0)) {
			    for (int i_76_ = 0; i_76_ < anIntArray11386.length;
				 i_76_++) {
				if ((IDirect3D.CheckDeviceFormat
				     (l, i, i_70_, d3ddisplaymode.Format, 2, 1,
				      anIntArray11386[i_76_])) == 0
				    && (IDirect3D.CheckDepthStencilMatch
					(l, i, i_70_, d3ddisplaymode.Format,
					 anIntArray11346[i_75_],
					 anIntArray11386[i_76_])) == 0
				    && (i_71_ == 0
					|| (IDirect3D
						.CheckDeviceMultiSampleType
					    (l, i, i_70_,
					     anIntArray11386[i_75_], true,
					     i_74_)) == 0)) {
				    i_73_ = anIntArray11346[i_75_];
				    i_72_ = anIntArray11386[i_76_];
				    break while_61_;
				}
			    }
			}
		    }
		}
	    }
	    if (i_71_ < 0 || i_73_ == 0 || i_72_ == 0)
		return false;
	    d3dpresent_parameters.BackBufferFormat = i_73_;
	    d3dpresent_parameters.AutoDepthStencilFormat = i_72_;
	    d3dpresent_parameters.MultiSampleType = i_74_;
	    d3dpresent_parameters.MultiSampleQuality = 0;
	    bool = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return bool;
    }
    
    synchronized void method10397(long l) {
	if (((Class173_Sub1_Sub2) this).anInt11355
	    == ((Class173_Sub1_Sub2) this).anInt11376) {
	    ((Class173_Sub1_Sub2) this).anInt11376 *= 2;
	    long[] ls = new long[((Class173_Sub1_Sub2) this).anInt11376];
	    System.arraycopy(((Class173_Sub1_Sub2) this).aLongArray11371, 0,
			     ls, 0, ((Class173_Sub1_Sub2) this).anInt11355);
	    ((Class173_Sub1_Sub2) this).aLongArray11371 = ls;
	}
	((Class173_Sub1_Sub2) this).aLongArray11371
	    [((Class173_Sub1_Sub2) this).anInt11355]
	    = l;
	((Class173_Sub1_Sub2) this).anInt11355++;
    }
    
    public void method8712(int i, Interface36 interface36) {
	Class408 class408 = (Class408) interface36;
	IDirect3DDevice.SetStreamSource(((Class173_Sub1_Sub2) this).aLong11378,
					i, ((Class408) class408).aLong4706, 0,
					class408.method4887());
    }
    
    static {
	anIntArray11346 = new int[] { 22, 23 };
    }
    
    public Class152 method2282() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(((Class173_Sub1_Sub2) this).aLong11367,
				       ((Class173_Sub1_Sub2) this).anInt11382,
				       0, d3dadapter_identifier);
	return new Class152(d3dadapter_identifier.VendorID,
			    method8450() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion, method8450());
    }
    
    public Class152 method2535() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	IDirect3D.GetAdapterIdentifier(((Class173_Sub1_Sub2) this).aLong11367,
				       ((Class173_Sub1_Sub2) this).anInt11382,
				       0, d3dadapter_identifier);
	return new Class152(d3dadapter_identifier.VendorID,
			    method8450() ? "Direct3D FF" : "Direct3D", 9,
			    d3dadapter_identifier.Description,
			    d3dadapter_identifier.DriverVersion, method8450());
    }
    
    public void method2284() {
	long l = IDirect3DDevice
		     .CreateEventQuery(((Class173_Sub1_Sub2) this).aLong11378);
	if (Class360.method4593(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    public void method2285() {
	long l = IDirect3DDevice
		     .CreateEventQuery(((Class173_Sub1_Sub2) this).aLong11378);
	if (Class360.method4593(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    void method8573() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 27,
				   aBool9338);
    }
    
    void method2287() {
	super.method2199();
	if (((Class173_Sub1_Sub2) this).aLong11351 != 0L) {
	    D3DLIGHT.Destroy(((Class173_Sub1_Sub2) this).aLong11351);
	    ((Class173_Sub1_Sub2) this).aLong11351 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11353 != 0L) {
	    D3DLIGHT.Destroy(((Class173_Sub1_Sub2) this).aLong11353);
	    ((Class173_Sub1_Sub2) this).aLong11353 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11347 != 0L) {
	    D3DLIGHT.Destroy(((Class173_Sub1_Sub2) this).aLong11347);
	    ((Class173_Sub1_Sub2) this).aLong11347 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11378 != 0L) {
	    IDirect3DDevice.Destroy(((Class173_Sub1_Sub2) this).aLong11378);
	    ((Class173_Sub1_Sub2) this).aLong11378 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11367 != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLong11367);
	    ((Class173_Sub1_Sub2) this).aLong11367 = 0L;
	}
    }
    
    void method2288() {
	super.method2199();
	if (((Class173_Sub1_Sub2) this).aLong11351 != 0L) {
	    D3DLIGHT.Destroy(((Class173_Sub1_Sub2) this).aLong11351);
	    ((Class173_Sub1_Sub2) this).aLong11351 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11353 != 0L) {
	    D3DLIGHT.Destroy(((Class173_Sub1_Sub2) this).aLong11353);
	    ((Class173_Sub1_Sub2) this).aLong11353 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11347 != 0L) {
	    D3DLIGHT.Destroy(((Class173_Sub1_Sub2) this).aLong11347);
	    ((Class173_Sub1_Sub2) this).aLong11347 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11378 != 0L) {
	    IDirect3DDevice.Destroy(((Class173_Sub1_Sub2) this).aLong11378);
	    ((Class173_Sub1_Sub2) this).aLong11378 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11367 != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLong11367);
	    ((Class173_Sub1_Sub2) this).aLong11367 = 0L;
	}
    }
    
    public final synchronized void method2289(int i) {
	for (int i_77_ = 0; i_77_ < ((Class173_Sub1_Sub2) this).anInt11355;
	     i_77_++)
	    IUnknown
		.Release(((Class173_Sub1_Sub2) this).aLongArray11371[i_77_]);
	((Class173_Sub1_Sub2) this).anInt11355 = 0;
	super.method2158(i);
    }
    
    void method2494(int i, int i_78_) throws Exception_Sub5 {
	if (((Class173_Sub1_Sub2) this).aBool11350) {
	    if (!method10381(aClass163_Sub2_1999.method2074(),
			     aClass163_Sub2_1999.method2070()))
		return;
	    ((Class163_Sub2_Sub2_Sub1) aClass163_Sub2_1999).method336();
	} else
	    IDirect3DDevice.EndScene(((Class173_Sub1_Sub2) this).aLong11378);
	int i_79_ = aClass163_Sub2_1999.method8917();
	if (Class360.method4592(i_79_)) {
	    ((Class173_Sub1_Sub2) this).aBool11350 = true;
	    aClass163_Sub2_1999.method115();
	} else {
	    IDirect3DDevice.BeginScene(((Class173_Sub1_Sub2) this).aLong11378);
	    if (anInterface22_1991 != null)
		anInterface22_1991.method27((byte) 66);
	}
    }
    
    public final synchronized void method2461(int i) {
	for (int i_80_ = 0; i_80_ < ((Class173_Sub1_Sub2) this).anInt11355;
	     i_80_++)
	    IUnknown
		.Release(((Class173_Sub1_Sub2) this).aLongArray11371[i_80_]);
	((Class173_Sub1_Sub2) this).anInt11355 = 0;
	super.method2158(i);
    }
    
    public String method2536() {
	String string = "Caps: 4:";
	String string_81_ = ":";
	string = new StringBuilder().append(string).append(anInt9355).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append(anInt9235).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append(anInt9211).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9362 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (method8448() ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (method8596() ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9368 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9278 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11384 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11365 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11377 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11387 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9279 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9364 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9225 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11369 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11370 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11343 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9370 ? 1 : 0).append
		     (string_81_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub2) this).aBool11372 ? 1 : 0).append
		     (string_81_).toString();
	string
	    = new StringBuilder().append(string).append
		  (((Class173_Sub1_Sub2) this).aBool11373 ? 1 : 0).toString();
	return string;
    }
    
    public void method2511(boolean bool) {
	/* empty */
    }
    
    void method8695() {
	for (Class528_Sub31 class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8034(1588225414);
	     class528_sub31 != null;
	     class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8037(-8670311)) {
	    Interface49 interface49
		= (Interface49) class528_sub31.anObject10468;
	    interface49.method336();
	    if (interface49 == aClass163_1998)
		interface49.method335();
	}
	super.method8557();
    }
    
    void method8625() {
	if (aBool9274) {
	    D3DLIGHT.SetAmbient(((Class173_Sub1_Sub2) this).aLong11351,
				aFloat9295 * aFloat9298,
				aFloat9296 * aFloat9298,
				aFloat9251 * aFloat9298, 0.0F);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    public void method2437(boolean bool) {
	/* empty */
    }
    
    public void method2309(boolean bool) {
	/* empty */
    }
    
    public Class163_Sub1 method2478() {
	return new Class163_Sub1_Sub3_Sub1(this);
    }
    
    public final synchronized void method2260(int i) {
	for (int i_82_ = 0; i_82_ < ((Class173_Sub1_Sub2) this).anInt11355;
	     i_82_++)
	    IUnknown
		.Release(((Class173_Sub1_Sub2) this).aLongArray11371[i_82_]);
	((Class173_Sub1_Sub2) this).anInt11355 = 0;
	super.method2158(i);
    }
    
    public void method2232() {
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    public boolean method2314() {
	return true;
    }
    
    public boolean method2315() {
	if (((Class173_Sub1_Sub2) this).aBool11350)
	    return false;
	if ((((Class173_Sub1_Sub2) this).aLongArray11381
	     [((Class173_Sub1_Sub2) this).anInt11356])
	    != 0L)
	    return false;
	return true;
    }
    
    public boolean method2162() {
	return true;
    }
    
    public void method8606(Class418 class418, Class418 class418_83_,
			   Class418 class418_84_) {
	IDirect3DDevice.SetTransform(((Class173_Sub1_Sub2) this).aLong11378,
				     256, class418.aFloatArray4768);
	IDirect3DDevice.SetTransform(((Class173_Sub1_Sub2) this).aLong11378, 2,
				     class418_83_.aFloatArray4768);
	IDirect3DDevice.SetTransform(((Class173_Sub1_Sub2) this).aLong11378, 3,
				     class418_84_.aFloatArray4768);
    }
    
    public void method2186() {
	/* empty */
    }
    
    void method8620() {
	aFloat9348 = aFloat9269 - (float) anInt9346;
	aFloat9347 = aFloat9348 - (float) anInt9236;
	if (aFloat9347 < aFloat9361)
	    aFloat9347 = aFloat9361;
	if (aBool9274) {
	    IDirect3DDevice.method9172(((Class173_Sub1_Sub2) this).aLong11378,
				       36, aFloat9347);
	    IDirect3DDevice.method9172(((Class173_Sub1_Sub2) this).aLong11378,
				       37, aFloat9348);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   34, anInt9344);
	}
    }
    
    public void method2321() {
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    public void method2320(int i, int i_85_, int i_86_) {
	if (((Class173_Sub1_Sub2) this).aLong11380 == 0L)
	    method10384(i_85_, i_86_);
	long l
	    = IDirect3DDevice
		  .GetRenderTarget(((Class173_Sub1_Sub2) this).aLong11378, 0);
	if (!Class360.method4592(IDirect3DDevice.StretchRect
				 (((Class173_Sub1_Sub2) this).aLong11378, l, 0,
				  0, aClass163_1998.method2074(),
				  aClass163_1998.method2070(),
				  ((Class173_Sub1_Sub2) this).aLong11380,
				  anInt2002 * 1354853215,
				  anInt2007 * -2074272721,
				  anInt2006 * 857980141,
				  anInt1990 * -649725419, 2))) {
	    /* empty */
	}
	IUnknown.Release(l);
	IDirect3DDevice.GetRenderTargetData
	    (((Class173_Sub1_Sub2) this).aLong11378,
	     ((Class173_Sub1_Sub2) this).aLong11380,
	     (((Class173_Sub1_Sub2) this).aLongArray11358
	      [((Class173_Sub1_Sub2) this).anInt11356]));
	long l_87_
	    = IDirect3DDevice
		  .CreateEventQuery(((Class173_Sub1_Sub2) this).aLong11378);
	if (Class360.method4593(IDirect3DEventQuery.Issue(l_87_)))
	    ((Class173_Sub1_Sub2) this).aLongArray11381
		[((Class173_Sub1_Sub2) this).anInt11356]
		= l_87_;
	((Class173_Sub1_Sub2) this).anIntArray11383
	    [((Class173_Sub1_Sub2) this).anInt11356]
	    = i;
	if (++((Class173_Sub1_Sub2) this).anInt11356 >= 3)
	    ((Class173_Sub1_Sub2) this).anInt11356 = 0;
    }
    
    final void method8673(int i, Class357 class357, boolean bool) {
	if (aBool9274) {
	    int i_88_ = 0;
	    int i_89_;
	    switch (i) {
	    default:
		i_89_ = 5;
		break;
	    case 1:
		i_89_ = 6;
		break;
	    case 2:
		i_89_ = 27;
	    }
	    if (bool)
		i_88_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, i_89_,
						 (method10391(class357)
						  | i_88_));
	}
    }
    
    public long method2324(int i, int i_90_) {
	return method10385(i, i_90_, null, null);
    }
    
    public long method2488(int i, int i_91_) {
	return method10385(i, i_91_, null, null);
    }
    
    public long method2326(int i, int i_92_) {
	return method10385(i, i_92_, null, null);
    }
    
    public void method2327(long l) {
	/* empty */
    }
    
    public void method2328(long l) {
	/* empty */
    }
    
    public void method2329(long l) {
	/* empty */
    }
    
    final Interface36 method8549(boolean bool) {
	return new Class408(this, bool);
    }
    
    void method8667() {
	IDirect3DDevice.SetScissorRect(((Class173_Sub1_Sub2) this).aLong11378,
				       anInt9282 + anInt9272,
				       anInt9238 + anInt9365, anInt9273,
				       anInt9271);
    }
    
    public int method2318() {
	if ((((Class173_Sub1_Sub2) this).aLongArray11381
	     [((Class173_Sub1_Sub2) this).anInt11345])
	    == 0L)
	    return -1;
	return (Class360.method4593(IDirect3DEventQuery.IsSignaled
				    (((Class173_Sub1_Sub2) this)
				     .aLongArray11381
				     [((Class173_Sub1_Sub2) this).anInt11345]))
		? (((Class173_Sub1_Sub2) this).anIntArray11383
		   [((Class173_Sub1_Sub2) this).anInt11345])
		: -1);
    }
    
    void method8697() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 14,
				   aBool9284 && aBool9246);
    }
    
    public void method2400() {
	if (((Class173_Sub1_Sub2) this).aLong11380 != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLong11380);
	    ((Class173_Sub1_Sub2) this).aLong11380 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	    if (((Class173_Sub1_Sub2) this).aLongArray11358[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11358[i]);
		((Class173_Sub1_Sub2) this).aLongArray11358[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    void method8565(int i) {
	if (!((Class173_Sub1_Sub2) this).aBool11374) {
	    int i_93_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   8, i_93_);
	}
    }
    
    public void method2446() {
	if (((Class173_Sub1_Sub2) this).aLong11380 != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLong11380);
	    ((Class173_Sub1_Sub2) this).aLong11380 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	    if (((Class173_Sub1_Sub2) this).aLongArray11358[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11358[i]);
		((Class173_Sub1_Sub2) this).aLongArray11358[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    public void method2469() {
	if (((Class173_Sub1_Sub2) this).aLong11380 != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLong11380);
	    ((Class173_Sub1_Sub2) this).aLong11380 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	    if (((Class173_Sub1_Sub2) this).aLongArray11358[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11358[i]);
		((Class173_Sub1_Sub2) this).aLongArray11358[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    public void method2325(int i, int i_94_) {
	IDirect3DDevice.Clear(((Class173_Sub1_Sub2) this).aLong11378, i, i_94_,
			      1.0F, 0);
    }
    
    public Class168 method2433(Class168 class168, Class168 class168_95_,
			       float f, Class168 class168_96_) {
	return f < 0.5F ? class168 : class168_95_;
    }
    
    public Class168 method2434(Class168 class168, Class168 class168_97_,
			       float f, Class168 class168_98_) {
	return f < 0.5F ? class168 : class168_97_;
    }
    
    public Class168 method2410(Class168 class168, Class168 class168_99_,
			       float f, Class168 class168_100_) {
	return f < 0.5F ? class168 : class168_99_;
    }
    
    public Interface21 method2337(int i, int i_101_) {
	return new Class400(this, Class169.aClass169_1937, i, i_101_, 0);
    }
    
    public Class163_Sub1 method2540() {
	return new Class163_Sub1_Sub3_Sub1(this);
    }
    
    void method8621() {
	if (aBool9274) {
	    float f = aBool9288 ? aFloat9299 : 0.0F;
	    float f_102_ = aBool9288 ? -aFloat9300 : 0.0F;
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11351,
				f * aFloat9295, f * aFloat9296, f * aFloat9251,
				0.0F);
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11353,
				f_102_ * aFloat9295, f_102_ * aFloat9296,
				f_102_ * aFloat9251, 0.0F);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    public boolean method2317() {
	return false;
    }
    
    public Interface19 method2336(int i, int i_103_, Class149 class149,
				  Class169 class169, int i_104_) {
	return new Class415(this, class149, class169, i, i_103_, i_104_);
    }
    
    final void method8562(Interface41 interface41, Class363 class363, int i,
			  int i_105_, int i_106_, int i_107_) {
	if (((Class173_Sub1_Sub2) this).aClass262_Sub1_11362 != null)
	    ((Class173_Sub1_Sub2) this).aClass262_Sub1_11362.method8981();
	IDirect3DDevice.DrawIndexedPrimitiveIB
	    (((Class173_Sub1_Sub2) this).aLong11378,
	     ((Class413) (Class413) interface41).aLong4730, 4, 0, i, i_105_,
	     i_106_, i_107_);
    }
    
    public Interface19 method2482(int i, int i_108_, Class149 class149,
				  Class169 class169, int i_109_) {
	return new Class415(this, class149, class169, i, i_108_, i_109_);
    }
    
    public Interface19 method2483(int i, int i_110_, Class149 class149,
				  Class169 class169, int i_111_) {
	return new Class415(this, class149, class169, i, i_110_, i_111_);
    }
    
    public void method2193(int i, int i_112_, int i_113_) {
	if (((Class173_Sub1_Sub2) this).aLong11380 == 0L)
	    method10384(i_112_, i_113_);
	long l
	    = IDirect3DDevice
		  .GetRenderTarget(((Class173_Sub1_Sub2) this).aLong11378, 0);
	if (!Class360.method4592(IDirect3DDevice.StretchRect
				 (((Class173_Sub1_Sub2) this).aLong11378, l, 0,
				  0, aClass163_1998.method2074(),
				  aClass163_1998.method2070(),
				  ((Class173_Sub1_Sub2) this).aLong11380,
				  anInt2002 * 1354853215,
				  anInt2007 * -2074272721,
				  anInt2006 * 857980141,
				  anInt1990 * -649725419, 2))) {
	    /* empty */
	}
	IUnknown.Release(l);
	IDirect3DDevice.GetRenderTargetData
	    (((Class173_Sub1_Sub2) this).aLong11378,
	     ((Class173_Sub1_Sub2) this).aLong11380,
	     (((Class173_Sub1_Sub2) this).aLongArray11358
	      [((Class173_Sub1_Sub2) this).anInt11356]));
	long l_114_
	    = IDirect3DDevice
		  .CreateEventQuery(((Class173_Sub1_Sub2) this).aLong11378);
	if (Class360.method4593(IDirect3DEventQuery.Issue(l_114_)))
	    ((Class173_Sub1_Sub2) this).aLongArray11381
		[((Class173_Sub1_Sub2) this).anInt11356]
		= l_114_;
	((Class173_Sub1_Sub2) this).anIntArray11383
	    [((Class173_Sub1_Sub2) this).anInt11356]
	    = i;
	if (++((Class173_Sub1_Sub2) this).anInt11356 >= 3)
	    ((Class173_Sub1_Sub2) this).anInt11356 = 0;
    }
    
    final Interface41 method8707(boolean bool) {
	return new Class413(this, Class169.aClass169_1933, bool);
    }
    
    public Interface21 method2249(int i, int i_115_) {
	return new Class400(this, Class169.aClass169_1937, i, i_115_, 0);
    }
    
    public Interface21 method2548(int i, int i_116_, int i_117_) {
	return new Class400(this, Class169.aClass169_1937, i, i_116_, i_117_);
    }
    
    public Interface21 method2202(int i, int i_118_, int i_119_) {
	return new Class400(this, Class169.aClass169_1937, i, i_118_, i_119_);
    }
    
    Interface43 method8579(Class149 class149, Class169 class169, int i,
			   int i_120_) {
	return new Class402_Sub2_Sub1(this, class149, class169, i, i_120_);
    }
    
    void method2484() {
	super.finalize();
    }
    
    void method2491() {
	super.finalize();
    }
    
    void method8704(boolean bool) {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 161,
				   bool);
    }
    
    void method2493(int i, int i_121_) throws Exception_Sub5 {
	if (((Class173_Sub1_Sub2) this).aBool11350) {
	    if (!method10381(aClass163_Sub2_1999.method2074(),
			     aClass163_Sub2_1999.method2070()))
		return;
	    ((Class163_Sub2_Sub2_Sub1) aClass163_Sub2_1999).method336();
	} else
	    IDirect3DDevice.EndScene(((Class173_Sub1_Sub2) this).aLong11378);
	int i_122_ = aClass163_Sub2_1999.method8917();
	if (Class360.method4592(i_122_)) {
	    ((Class173_Sub1_Sub2) this).aBool11350 = true;
	    aClass163_Sub2_1999.method115();
	} else {
	    IDirect3DDevice.BeginScene(((Class173_Sub1_Sub2) this).aLong11378);
	    if (anInterface22_1991 != null)
		anInterface22_1991.method27((byte) 10);
	}
    }
    
    public void method8527() {
	if (((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308]) {
	    ((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308] = false;
	    IDirect3DDevice.SetTexture(((Class173_Sub1_Sub2) this).aLong11378,
				       anInt9308, 0L);
	    method8539();
	    method8722();
	}
    }
    
    void method2495(int i, int i_123_) throws Exception_Sub5 {
	if (((Class173_Sub1_Sub2) this).aBool11350) {
	    if (!method10381(aClass163_Sub2_1999.method2074(),
			     aClass163_Sub2_1999.method2070()))
		return;
	    ((Class163_Sub2_Sub2_Sub1) aClass163_Sub2_1999).method336();
	} else
	    IDirect3DDevice.EndScene(((Class173_Sub1_Sub2) this).aLong11378);
	int i_124_ = aClass163_Sub2_1999.method8917();
	if (Class360.method4592(i_124_)) {
	    ((Class173_Sub1_Sub2) this).aBool11350 = true;
	    aClass163_Sub2_1999.method115();
	} else {
	    IDirect3DDevice.BeginScene(((Class173_Sub1_Sub2) this).aLong11378);
	    if (anInterface22_1991 != null)
		anInterface22_1991.method27((byte) -54);
	}
    }
    
    public void method2500() {
	/* empty */
    }
    
    public void method2501() {
	/* empty */
    }
    
    public boolean method2502() {
	return true;
    }
    
    public boolean method2175() {
	return true;
    }
    
    final void method8674(int i, Class357 class357, boolean bool) {
	if (aBool9274) {
	    int i_125_ = 0;
	    int i_126_;
	    switch (i) {
	    default:
		i_126_ = 5;
		break;
	    case 1:
		i_126_ = 6;
		break;
	    case 2:
		i_126_ = 27;
	    }
	    if (bool)
		i_125_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, i_126_,
						 (method10391(class357)
						  | i_125_));
	}
    }
    
    public boolean method8721() {
	return ((((Class173_Sub1_Sub2) this).aD3DCAPS11364.PixelShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    public boolean method8597() {
	return ((((Class173_Sub1_Sub2) this).aD3DCAPS11364.PixelShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    public boolean method8598() {
	return ((((Class173_Sub1_Sub2) this).aD3DCAPS11364.PixelShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    void method8636() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 14,
				   aBool9284 && aBool9246);
    }
    
    public boolean method8510(boolean bool) {
	if (bool)
	    return ((Class173_Sub1_Sub2) this).aBool11372;
	return (((Class173_Sub1_Sub2) this).aBool11372
		&& ((Class173_Sub1_Sub2) this).aBool11373);
    }
    
    public boolean method8600(boolean bool) {
	if (bool)
	    return ((Class173_Sub1_Sub2) this).aBool11372;
	return (((Class173_Sub1_Sub2) this).aBool11372
		&& ((Class173_Sub1_Sub2) this).aBool11373);
    }
    
    public Class258 method8603(String string) {
	byte[] is = method10393(string);
	if (is == null)
	    return null;
	Class275 class275 = method8455(is);
	return new Class258_Sub1(this, class275);
    }
    
    public void method8605(Class418 class418, Class418 class418_127_,
			   Class418 class418_128_) {
	IDirect3DDevice.SetTransform(((Class173_Sub1_Sub2) this).aLong11378,
				     256, class418.aFloatArray4768);
	IDirect3DDevice.SetTransform(((Class173_Sub1_Sub2) this).aLong11378, 2,
				     class418_127_.aFloatArray4768);
	IDirect3DDevice.SetTransform(((Class173_Sub1_Sub2) this).aLong11378, 3,
				     class418_128_.aFloatArray4768);
    }
    
    public void method2352(long l) {
	/* empty */
    }
    
    void method8467() {
	for (int i = 0; i < anInt9235; i++) {
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    i, 7, 2);
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    i, 6, 2);
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    i, 5, 2);
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    i, 1, 1);
	    IDirect3DDevice.SetSamplerState((((Class173_Sub1_Sub2) this)
					     .aLong11378),
					    i, 2, 1);
	    ((Class173_Sub1_Sub2) this).aClass340Array11359[i]
		= Class340.aClass340_3585;
	    boolean[] bools = ((Class173_Sub1_Sub2) this).aBoolArray11385;
	    int i_129_ = i;
	    ((Class173_Sub1_Sub2) this).aBoolArray11349[i] = true;
	    bools[i_129_] = true;
	    ((Class173_Sub1_Sub2) this).aBoolArray11366[i] = false;
	    ((Class173_Sub1_Sub2) this).anIntArray11360[i] = 0;
	}
	IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
					      .aLong11378),
					     0, 6, 1);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       9, 2);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       23, 4);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       25, 5);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       24, 0);
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 206,
				   aBool9370);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       181, 0);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       22, 2);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       147, 1);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       145, 1);
	IDirect3DDevice.method9172(((Class173_Sub1_Sub2) this).aLong11378, 38,
				   0.95F);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       35, 3);
	IDirect3DDevice.method9172(((Class173_Sub1_Sub2) this).aLong11378, 154,
				   1.0F);
	D3DLIGHT.SetType(((Class173_Sub1_Sub2) this).aLong11351, 3);
	D3DLIGHT.SetType(((Class173_Sub1_Sub2) this).aLong11353, 3);
	D3DLIGHT.SetType(((Class173_Sub1_Sub2) this).aLong11347, 1);
	((Class173_Sub1_Sub2) this).aBool11354 = false;
	super.method8668();
    }
    
    public Interface19 method2362(int i, int i_130_, Class149 class149,
				  Class169 class169, int i_131_) {
	return new Class415(this, class149, class169, i, i_130_, i_131_);
    }
    
    void method8572() {
	method2342();
	for (Class528_Sub31 class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352.method8034(687393648);
	     class528_sub31 != null;
	     class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8037(1002547587)) {
	    Interface49 interface49
		= (Interface49) class528_sub31.anObject10468;
	    interface49.method115();
	}
	super.method8601();
    }
    
    Interface39 method8523(int i, boolean bool, int[][] is) {
	return new Class402_Sub3(this, i, bool, is);
    }
    
    void method8613() {
	for (Class528_Sub31 class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8034(1063456371);
	     class528_sub31 != null;
	     class528_sub31
		 = (Class528_Sub31) ((Class173_Sub1_Sub2) this)
					.aClass688_11352
					.method8037(-2064783214)) {
	    Interface49 interface49
		= (Interface49) class528_sub31.anObject10468;
	    interface49.method336();
	    if (interface49 == aClass163_1998)
		interface49.method335();
	}
	super.method8557();
    }
    
    void method8724(int i) {
	if (!((Class173_Sub1_Sub2) this).aBool11374) {
	    int i_132_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   8, i_132_);
	}
    }
    
    void method8622() {
	IDirect3DDevice.SetScissorRect(((Class173_Sub1_Sub2) this).aLong11378,
				       anInt9282 + anInt9272,
				       anInt9238 + anInt9365, anInt9273,
				       anInt9271);
    }
    
    static final int method10398(Class363 class363) {
	switch (class363.anInt3841) {
	case 0:
	    return 2;
	case 5:
	    return 6;
	case 4:
	    return 5;
	case 3:
	    return 4;
	case 1:
	    return 3;
	case 2:
	    return 1;
	default:
	    throw new IllegalArgumentException("");
	}
    }
    
    void method8491() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 174,
				   aBool9386);
    }
    
    void method8722() {
	if (aBool9274) {
	    int i = (((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308]
		     ? method10390(aClass356Array9312[anInt9308]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, 1, i);
	}
    }
    
    public void method8699(Class418 class418) {
	class418.method4974(((Class173_Sub1_Sub2) this).aClass418_11361);
    }
    
    void method8480() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 174,
				   aBool9386);
    }
    
    void method2199() {
	super.method2199();
	if (((Class173_Sub1_Sub2) this).aLong11351 != 0L) {
	    D3DLIGHT.Destroy(((Class173_Sub1_Sub2) this).aLong11351);
	    ((Class173_Sub1_Sub2) this).aLong11351 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11353 != 0L) {
	    D3DLIGHT.Destroy(((Class173_Sub1_Sub2) this).aLong11353);
	    ((Class173_Sub1_Sub2) this).aLong11353 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11347 != 0L) {
	    D3DLIGHT.Destroy(((Class173_Sub1_Sub2) this).aLong11347);
	    ((Class173_Sub1_Sub2) this).aLong11347 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11378 != 0L) {
	    IDirect3DDevice.Destroy(((Class173_Sub1_Sub2) this).aLong11378);
	    ((Class173_Sub1_Sub2) this).aLong11378 = 0L;
	}
	if (((Class173_Sub1_Sub2) this).aLong11367 != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLong11367);
	    ((Class173_Sub1_Sub2) this).aLong11367 = 0L;
	}
    }
    
    void method8509() {
	if (aBool9274)
	    IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378,
				       137, aBool9343 && !aBool9297);
    }
    
    void method8639() {
	if (aBool9274)
	    IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378,
				       137, aBool9343 && !aBool9297);
    }
    
    void method8511() {
	if (aBool9274) {
	    int i = (((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308]
		     ? method10390(aClass356Array9312[anInt9308]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, 1, i);
	}
    }
    
    public final void method8719(Class363 class363, int i, int i_133_,
				 int i_134_, int i_135_) {
	if (((Class173_Sub1_Sub2) this).aClass262_Sub1_11362 != null)
	    ((Class173_Sub1_Sub2) this).aClass262_Sub1_11362.method8981();
	IDirect3DDevice.DrawIndexedPrimitive((((Class173_Sub1_Sub2) this)
					      .aLong11378),
					     method10398(class363), 0, i,
					     i_133_, i_134_, i_135_);
    }
    
    void method8642() {
	if (aBool9274) {
	    D3DLIGHT.SetAmbient(((Class173_Sub1_Sub2) this).aLong11351,
				aFloat9295 * aFloat9298,
				aFloat9296 * aFloat9298,
				aFloat9251 * aFloat9298, 0.0F);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    public void method2319(int i, int i_136_, int i_137_) {
	if (((Class173_Sub1_Sub2) this).aLong11380 == 0L)
	    method10384(i_136_, i_137_);
	long l
	    = IDirect3DDevice
		  .GetRenderTarget(((Class173_Sub1_Sub2) this).aLong11378, 0);
	if (!Class360.method4592(IDirect3DDevice.StretchRect
				 (((Class173_Sub1_Sub2) this).aLong11378, l, 0,
				  0, aClass163_1998.method2074(),
				  aClass163_1998.method2070(),
				  ((Class173_Sub1_Sub2) this).aLong11380,
				  anInt2002 * 1354853215,
				  anInt2007 * -2074272721,
				  anInt2006 * 857980141,
				  anInt1990 * -649725419, 2))) {
	    /* empty */
	}
	IUnknown.Release(l);
	IDirect3DDevice.GetRenderTargetData
	    (((Class173_Sub1_Sub2) this).aLong11378,
	     ((Class173_Sub1_Sub2) this).aLong11380,
	     (((Class173_Sub1_Sub2) this).aLongArray11358
	      [((Class173_Sub1_Sub2) this).anInt11356]));
	long l_138_
	    = IDirect3DDevice
		  .CreateEventQuery(((Class173_Sub1_Sub2) this).aLong11378);
	if (Class360.method4593(IDirect3DEventQuery.Issue(l_138_)))
	    ((Class173_Sub1_Sub2) this).aLongArray11381
		[((Class173_Sub1_Sub2) this).anInt11356]
		= l_138_;
	((Class173_Sub1_Sub2) this).anIntArray11383
	    [((Class173_Sub1_Sub2) this).anInt11356]
	    = i;
	if (++((Class173_Sub1_Sub2) this).anInt11356 >= 3)
	    ((Class173_Sub1_Sub2) this).anInt11356 = 0;
    }
    
    void method8589() {
	if (aBool9274) {
	    D3DLIGHT.SetAmbient(((Class173_Sub1_Sub2) this).aLong11351,
				aFloat9295 * aFloat9298,
				aFloat9296 * aFloat9298,
				aFloat9251 * aFloat9298, 0.0F);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    void method8508() {
	if (aBool9274) {
	    D3DLIGHT.SetAmbient(((Class173_Sub1_Sub2) this).aLong11351,
				aFloat9295 * aFloat9298,
				aFloat9296 * aFloat9298,
				aFloat9251 * aFloat9298, 0.0F);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    void method8644() {
	if (aBool9274) {
	    D3DLIGHT.SetAmbient(((Class173_Sub1_Sub2) this).aLong11351,
				aFloat9295 * aFloat9298,
				aFloat9296 * aFloat9298,
				aFloat9251 * aFloat9298, 0.0F);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    boolean method8577(Class149 class149, Class169 class169) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class360.method4593(IDirect3D.GetAdapterDisplayMode
				    (((Class173_Sub1_Sub2) this).aLong11367,
				     ((Class173_Sub1_Sub2) this).anInt11382,
				     d3ddisplaymode))
		&& Class360.method4593(IDirect3D.CheckDeviceFormat
				       (((Class173_Sub1_Sub2) this).aLong11367,
					((Class173_Sub1_Sub2) this).anInt11382,
					((Class173_Sub1_Sub2) this).anInt11344,
					d3ddisplaymode.Format, 0, 4,
					method10394(class149, class169))));
    }
    
    void method8647() {
	if (aBool9274) {
	    float f = aBool9288 ? aFloat9299 : 0.0F;
	    float f_139_ = aBool9288 ? -aFloat9300 : 0.0F;
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11351,
				f * aFloat9295, f * aFloat9296, f * aFloat9251,
				0.0F);
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11353,
				f_139_ * aFloat9295, f_139_ * aFloat9296,
				f_139_ * aFloat9251, 0.0F);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    void method8623() {
	if (aBool9274)
	    IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378,
				       28,
				       (aBool9249 && aBool9342
					&& anInt9236 >= 0));
    }
    
    public boolean method2188() {
	if (((Class173_Sub1_Sub2) this).aBool11350)
	    return false;
	if ((((Class173_Sub1_Sub2) this).aLongArray11381
	     [((Class173_Sub1_Sub2) this).anInt11356])
	    != 0L)
	    return false;
	return true;
    }
    
    void method8711() {
	if (aBool9274) {
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11351,
				  -aFloatArray9290[0], -aFloatArray9290[1],
				  -aFloatArray9290[2]);
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11353,
				  -aFloatArray9267[0], -aFloatArray9267[1],
				  -aFloatArray9267[2]);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    void method8569() {
	if (aBool9274) {
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11351,
				  -aFloatArray9290[0], -aFloatArray9290[1],
				  -aFloatArray9290[2]);
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11353,
				  -aFloatArray9267[0], -aFloatArray9267[1],
				  -aFloatArray9267[2]);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    void method8645() {
	if (aBool9274) {
	    float f = aBool9288 ? aFloat9299 : 0.0F;
	    float f_140_ = aBool9288 ? -aFloat9300 : 0.0F;
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11351,
				f * aFloat9295, f * aFloat9296, f * aFloat9251,
				0.0F);
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11353,
				f_140_ * aFloat9295, f_140_ * aFloat9296,
				f_140_ * aFloat9251, 0.0F);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    void method8602() {
	if (aBool9274) {
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11351,
				  -aFloatArray9290[0], -aFloatArray9290[1],
				  -aFloatArray9290[2]);
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11353,
				  -aFloatArray9267[0], -aFloatArray9267[1],
				  -aFloatArray9267[2]);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    void method8650() {
	method8621();
	method8705();
    }
    
    void method8651() {
	method8621();
	method8705();
    }
    
    void method8652() {
	int i;
	for (i = 0; i < anInt9333; i++) {
	    Class528_Sub12 class528_sub12 = aClass528_Sub12Array9210[i];
	    int i_141_ = i + 2;
	    int i_142_ = class528_sub12.method9361((byte) 17);
	    float f = class528_sub12.method9362(2086734484) / 255.0F;
	    D3DLIGHT.SetPosition(((Class173_Sub1_Sub2) this).aLong11347,
				 (float) class528_sub12.method9366(2113977702),
				 (float) class528_sub12
					     .method9360(-1375654801),
				 (float) class528_sub12
					     .method9370(1221114533));
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11347,
				(float) (i_142_ >> 16 & 0xff) * f,
				(float) (i_142_ >> 8 & 0xff) * f,
				(float) (i_142_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(((Class173_Sub1_Sub2) this).aLong11347, 0.0F, 0.0F,
		 1.0F / (float) (class528_sub12.method9357(883895795)
				 * class528_sub12.method9357(825368459)));
	    D3DLIGHT.SetRange(((Class173_Sub1_Sub2) this).aLong11347,
			      (float) class528_sub12.method9357(700090797));
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378,
				     i_141_,
				     ((Class173_Sub1_Sub2) this).aLong11347);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					i_141_, true);
	}
	for (/**/; i < anInt9302; i++)
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					i + 2, false);
    }
    
    void method8590() {
	int i;
	for (i = 0; i < anInt9333; i++) {
	    Class528_Sub12 class528_sub12 = aClass528_Sub12Array9210[i];
	    int i_143_ = i + 2;
	    int i_144_ = class528_sub12.method9361((byte) 98);
	    float f = class528_sub12.method9362(1811400017) / 255.0F;
	    D3DLIGHT.SetPosition(((Class173_Sub1_Sub2) this).aLong11347,
				 (float) class528_sub12.method9366(1568731629),
				 (float) class528_sub12
					     .method9360(-1375654801),
				 (float) class528_sub12
					     .method9370(1221114533));
	    D3DLIGHT.SetDiffuse(((Class173_Sub1_Sub2) this).aLong11347,
				(float) (i_144_ >> 16 & 0xff) * f,
				(float) (i_144_ >> 8 & 0xff) * f,
				(float) (i_144_ & 0xff) * f, 0.0F);
	    D3DLIGHT.SetAttenuation
		(((Class173_Sub1_Sub2) this).aLong11347, 0.0F, 0.0F,
		 1.0F / (float) (class528_sub12.method9357(1858017385)
				 * class528_sub12.method9357(1793846401)));
	    D3DLIGHT.SetRange(((Class173_Sub1_Sub2) this).aLong11347,
			      (float) class528_sub12.method9357(1891701161));
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378,
				     i_143_,
				     ((Class173_Sub1_Sub2) this).aLong11347);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					i_143_, true);
	}
	for (/**/; i < anInt9302; i++)
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					i + 2, false);
    }
    
    void method8538() {
	if (((Class173_Sub1_Sub2) this).aLong11363 == 0L
	    && aClass358Array9231[anInt9308] != Class358.aClass358_3822) {
	    if (aClass358Array9231[anInt9308] == Class358.aClass358_3820)
		IDirect3DDevice.SetTransform
		    (((Class173_Sub1_Sub2) this).aLong11378, 16 + anInt9308,
		     (aClass418Array9310[anInt9308].method5031
		      (((Class173_Sub1_Sub2) this).aFloatArray11375)));
	    else
		IDirect3DDevice.SetTransform
		    (((Class173_Sub1_Sub2) this).aLong11378, 16 + anInt9308,
		     (aClass418Array9310[anInt9308].method4994
		      (((Class173_Sub1_Sub2) this).aFloatArray11375)));
	    int i = method10400(aClass358Array9231[anInt9308]);
	    if (i != ((Class173_Sub1_Sub2) this).anIntArray11360[anInt9308]) {
		IDirect3DDevice.SetTextureStageState(((Class173_Sub1_Sub2)
						      this).aLong11378,
						     anInt9308, 24, i);
		((Class173_Sub1_Sub2) this).anIntArray11360[anInt9308] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, 24, 0);
	    ((Class173_Sub1_Sub2) this).anIntArray11360[anInt9308] = 0;
	}
    }
    
    boolean method8654(Class149 class149, Class169 class169) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class360.method4593(IDirect3D.GetAdapterDisplayMode
				    (((Class173_Sub1_Sub2) this).aLong11367,
				     ((Class173_Sub1_Sub2) this).anInt11382,
				     d3ddisplaymode))
		&& Class360.method4593(IDirect3D.CheckDeviceFormat
				       (((Class173_Sub1_Sub2) this).aLong11367,
					((Class173_Sub1_Sub2) this).anInt11382,
					((Class173_Sub1_Sub2) this).anInt11344,
					d3ddisplaymode.Format, 0, 3,
					method10394(class149, class169))));
    }
    
    boolean method8690(Class149 class149, Class169 class169) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class360.method4593(IDirect3D.GetAdapterDisplayMode
				    (((Class173_Sub1_Sub2) this).aLong11367,
				     ((Class173_Sub1_Sub2) this).anInt11382,
				     d3ddisplaymode))
		&& Class360.method4593(IDirect3D.CheckDeviceFormat
				       (((Class173_Sub1_Sub2) this).aLong11367,
					((Class173_Sub1_Sub2) this).anInt11382,
					((Class173_Sub1_Sub2) this).anInt11344,
					d3ddisplaymode.Format, 0, 3,
					method10394(class149, class169))));
    }
    
    boolean method8655(Class149 class149, Class169 class169) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class360.method4593(IDirect3D.GetAdapterDisplayMode
				    (((Class173_Sub1_Sub2) this).aLong11367,
				     ((Class173_Sub1_Sub2) this).anInt11382,
				     d3ddisplaymode))
		&& Class360.method4593(IDirect3D.CheckDeviceFormat
				       (((Class173_Sub1_Sub2) this).aLong11367,
					((Class173_Sub1_Sub2) this).anInt11382,
					((Class173_Sub1_Sub2) this).anInt11344,
					d3ddisplaymode.Format, 0, 3,
					method10394(class149, class169))));
    }
    
    Interface34 method8591(int i, int i_145_, boolean bool, int[] is,
			   int i_146_, int i_147_) {
	return new Class402_Sub2(this, i, i_145_, bool, is, i_146_, i_147_);
    }
    
    public Interface21 method2411(int i, int i_148_, int i_149_) {
	return new Class400(this, Class169.aClass169_1937, i, i_148_, i_149_);
    }
    
    Interface34 method8657(Class149 class149, int i, int i_150_, boolean bool,
			   byte[] is, int i_151_, int i_152_) {
	return new Class402_Sub2(this, class149, i, i_150_, bool, is, i_151_,
				 i_152_);
    }
    
    Interface34 method8658(Class149 class149, int i, int i_153_, boolean bool,
			   byte[] is, int i_154_, int i_155_) {
	return new Class402_Sub2(this, class149, i, i_153_, bool, is, i_154_,
				 i_155_);
    }
    
    Interface34 method8542(Class149 class149, int i, int i_156_, boolean bool,
			   float[] fs, int i_157_, int i_158_) {
	return new Class402_Sub2(this, class149, i, i_156_, bool, fs, i_157_,
				 i_158_);
    }
    
    public void method2550(int i, int i_159_, int[] is, int[] is_160_) {
	method10385(i, i_159_, is, is_160_);
    }
    
    public long method2194(int i, int i_161_) {
	return method10385(i, i_161_, null, null);
    }
    
    Interface32 method8660(Class149 class149, int i, int i_162_, int i_163_,
			   boolean bool, byte[] is) {
	return new Class402_Sub1(this, class149, i, i_162_, i_163_, bool, is);
    }
    
    Interface32 method8535(Class149 class149, int i, int i_164_, int i_165_,
			   boolean bool, byte[] is) {
	return new Class402_Sub1(this, class149, i, i_164_, i_165_, bool, is);
    }
    
    Interface32 method8662(Class149 class149, int i, int i_166_, int i_167_,
			   boolean bool, byte[] is) {
	return new Class402_Sub1(this, class149, i, i_166_, i_167_, bool, is);
    }
    
    Interface32 method8663(Class149 class149, int i, int i_168_, int i_169_,
			   boolean bool, byte[] is) {
	return new Class402_Sub1(this, class149, i, i_168_, i_169_, bool, is);
    }
    
    Interface32 method8541(Class149 class149, int i, int i_170_, int i_171_,
			   boolean bool, byte[] is) {
	return new Class402_Sub1(this, class149, i, i_170_, i_171_, bool, is);
    }
    
    Interface32 method8664(Class149 class149, int i, int i_172_, int i_173_,
			   boolean bool, byte[] is) {
	return new Class402_Sub1(this, class149, i, i_172_, i_173_, bool, is);
    }
    
    Interface43 method8665(Class149 class149, Class169 class169, int i,
			   int i_174_) {
	return new Class402_Sub2_Sub1(this, class149, class169, i, i_174_);
    }
    
    public void method8689() {
	if (((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308]) {
	    ((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308] = false;
	    IDirect3DDevice.SetTexture(((Class173_Sub1_Sub2) this).aLong11378,
				       anInt9308, 0L);
	    method8539();
	    method8722();
	}
    }
    
    final void method8669(int i, Class357 class357, boolean bool,
			  boolean bool_175_) {
	if (aBool9274) {
	    int i_176_ = 0;
	    int i_177_;
	    switch (i) {
	    case 2:
		i_177_ = 26;
		break;
	    case 1:
		i_177_ = 3;
		break;
	    default:
		i_177_ = 2;
	    }
	    if (bool)
		i_176_ |= 0x20;
	    if (bool_175_)
		i_176_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, i_177_,
						 (method10391(class357)
						  | i_176_));
	}
    }
    
    public void method2286() {
	long l = IDirect3DDevice
		     .CreateEventQuery(((Class173_Sub1_Sub2) this).aLong11378);
	if (Class360.method4593(IDirect3DEventQuery.Issue(l))) {
	    for (;;) {
		int i = IDirect3DEventQuery.IsSignaled(l);
		if (i != 1)
		    break;
		Thread.yield();
	    }
	}
	IUnknown.Release(l);
    }
    
    final void method8670(int i, Class357 class357, boolean bool,
			  boolean bool_178_) {
	if (aBool9274) {
	    int i_179_ = 0;
	    int i_180_;
	    switch (i) {
	    case 2:
		i_180_ = 26;
		break;
	    case 1:
		i_180_ = 3;
		break;
	    default:
		i_180_ = 2;
	    }
	    if (bool)
		i_179_ |= 0x20;
	    if (bool_178_)
		i_179_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, i_180_,
						 (method10391(class357)
						  | i_179_));
	}
    }
    
    final void method8672(int i, Class357 class357, boolean bool) {
	if (aBool9274) {
	    int i_181_ = 0;
	    int i_182_;
	    switch (i) {
	    default:
		i_182_ = 5;
		break;
	    case 1:
		i_182_ = 6;
		break;
	    case 2:
		i_182_ = 27;
	    }
	    if (bool)
		i_181_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, i_182_,
						 (method10391(class357)
						  | i_181_));
	}
    }
    
    public final void method8717(Class363 class363, int i, int i_183_,
				 int i_184_, int i_185_) {
	if (((Class173_Sub1_Sub2) this).aClass262_Sub1_11362 != null)
	    ((Class173_Sub1_Sub2) this).aClass262_Sub1_11362.method8981();
	IDirect3DDevice.DrawIndexedPrimitive((((Class173_Sub1_Sub2) this)
					      .aLong11378),
					     method10398(class363), 0, i,
					     i_183_, i_184_, i_185_);
    }
    
    final void method8503(int i, Class357 class357, boolean bool) {
	if (aBool9274) {
	    int i_186_ = 0;
	    int i_187_;
	    switch (i) {
	    default:
		i_187_ = 5;
		break;
	    case 1:
		i_187_ = 6;
		break;
	    case 2:
		i_187_ = 27;
	    }
	    if (bool)
		i_186_ |= 0x10;
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, i_187_,
						 (method10391(class357)
						  | i_186_));
	}
    }
    
    public void finalize() {
	super.finalize();
    }
    
    public boolean method8599() {
	return ((((Class173_Sub1_Sub2) this).aD3DCAPS11364.PixelShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    public void method2342() {
	if (((Class173_Sub1_Sub2) this).aLong11380 != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLong11380);
	    ((Class173_Sub1_Sub2) this).aLong11380 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	    if (((Class173_Sub1_Sub2) this).aLongArray11358[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11358[i]);
		((Class173_Sub1_Sub2) this).aLongArray11358[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    void method8680() {
	if (((Class173_Sub1_Sub2) this).aLong11363 == 0L
	    && aClass358Array9231[anInt9308] != Class358.aClass358_3822) {
	    if (aClass358Array9231[anInt9308] == Class358.aClass358_3820)
		IDirect3DDevice.SetTransform
		    (((Class173_Sub1_Sub2) this).aLong11378, 16 + anInt9308,
		     (aClass418Array9310[anInt9308].method5031
		      (((Class173_Sub1_Sub2) this).aFloatArray11375)));
	    else
		IDirect3DDevice.SetTransform
		    (((Class173_Sub1_Sub2) this).aLong11378, 16 + anInt9308,
		     (aClass418Array9310[anInt9308].method4994
		      (((Class173_Sub1_Sub2) this).aFloatArray11375)));
	    int i = method10400(aClass358Array9231[anInt9308]);
	    if (i != ((Class173_Sub1_Sub2) this).anIntArray11360[anInt9308]) {
		IDirect3DDevice.SetTextureStageState(((Class173_Sub1_Sub2)
						      this).aLong11378,
						     anInt9308, 24, i);
		((Class173_Sub1_Sub2) this).anIntArray11360[anInt9308] = i;
	    }
	} else {
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, 24, 0);
	    ((Class173_Sub1_Sub2) this).anIntArray11360[anInt9308] = 0;
	}
    }
    
    public int[] method2208(int i, int i_188_, int i_189_, int i_190_) {
	method2235();
	int[] is = null;
	long l
	    = IDirect3DDevice
		  .GetRenderTarget(((Class173_Sub1_Sub2) this).aLong11378, 0);
	long l_191_
	    = IDirect3DDevice.CreateRenderTarget((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 i_189_, i_190_, 21, 0, 0,
						 true);
	int i_192_
	    = IDirect3DDevice.StretchRect((((Class173_Sub1_Sub2) this)
					   .aLong11378),
					  l, i, i_188_, i_189_, i_190_, l_191_,
					  0, 0, i_189_, i_190_, 1);
	method8451(i_189_ * i_190_ * 4);
	if (Class360.method4593(i_192_)) {
	    is = new int[i_189_ * i_190_];
	    IDirect3DSurface.Download(l_191_, 0, 0, i_189_, i_190_, i_189_ * 4,
				      16, aLong9223);
	    aByteBuffer9222.clear();
	    aByteBuffer9222.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_191_);
	return is;
    }
    
    void method8681() {
	/* empty */
    }
    
    public void method2243(boolean bool) {
	/* empty */
    }
    
    void method8675() {
	/* empty */
    }
    
    void method8466() {
	if (aBool9274) {
	    int i = (((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308]
		     ? method10390(aClass356Array9312[anInt9308]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, 1, i);
	}
    }
    
    void method8619() {
	if (aBool9274) {
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11351,
				  -aFloatArray9290[0], -aFloatArray9290[1],
				  -aFloatArray9290[2]);
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11353,
				  -aFloatArray9267[0], -aFloatArray9267[1],
				  -aFloatArray9267[2]);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    public void method8618(Class418 class418) {
	class418.method4974(((Class173_Sub1_Sub2) this).aClass418_11361);
    }
    
    void method8685() {
	if (aBool9274) {
	    int i = (((Class173_Sub1_Sub2) this).aBoolArray11357[anInt9308]
		     ? method10390(aClass356Array9313[anInt9308]) : 1);
	    IDirect3DDevice.SetTextureStageState((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 anInt9308, 4, i);
	}
    }
    
    void method8568(int i) {
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       168, i);
    }
    
    void method8631() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 15,
				   aBool9353);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       24, aByte9354 & 0xff);
	if ((((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9353 || aByte9354 == 0) {
		if (((Class173_Sub1_Sub2) this).aBool11343
		    || ((Class173_Sub1_Sub2) this).aBool11369)
		    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						    .aLong11378),
						   181, 0);
		else if (((Class173_Sub1_Sub2) this).aBool11370)
		    IDirect3DDevice.method9172((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       154, 1.0F);
	    } else if (((Class173_Sub1_Sub2) this).aBool11343)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       181,
					       method8566('S', 'S', 'A', 'A'));
	    else if (((Class173_Sub1_Sub2) this).aBool11369)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       181,
					       method8566('A', 'T', 'O', 'C'));
	    else if (((Class173_Sub1_Sub2) this).aBool11370)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       154,
					       method8566('A', '2', 'M', '1'));
	}
    }
    
    void method8691() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 15,
				   aBool9353);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       24, aByte9354 & 0xff);
	if ((((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9353 || aByte9354 == 0) {
		if (((Class173_Sub1_Sub2) this).aBool11343
		    || ((Class173_Sub1_Sub2) this).aBool11369)
		    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						    .aLong11378),
						   181, 0);
		else if (((Class173_Sub1_Sub2) this).aBool11370)
		    IDirect3DDevice.method9172((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       154, 1.0F);
	    } else if (((Class173_Sub1_Sub2) this).aBool11343)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       181,
					       method8566('S', 'S', 'A', 'A'));
	    else if (((Class173_Sub1_Sub2) this).aBool11369)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       181,
					       method8566('A', 'T', 'O', 'C'));
	    else if (((Class173_Sub1_Sub2) this).aBool11370)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       154,
					       method8566('A', '2', 'M', '1'));
	}
    }
    
    void method8692() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 15,
				   aBool9353);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       24, aByte9354 & 0xff);
	if ((((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9353 || aByte9354 == 0) {
		if (((Class173_Sub1_Sub2) this).aBool11343
		    || ((Class173_Sub1_Sub2) this).aBool11369)
		    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						    .aLong11378),
						   181, 0);
		else if (((Class173_Sub1_Sub2) this).aBool11370)
		    IDirect3DDevice.method9172((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       154, 1.0F);
	    } else if (((Class173_Sub1_Sub2) this).aBool11343)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       181,
					       method8566('S', 'S', 'A', 'A'));
	    else if (((Class173_Sub1_Sub2) this).aBool11369)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       181,
					       method8566('A', 'T', 'O', 'C'));
	    else if (((Class173_Sub1_Sub2) this).aBool11370)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       154,
					       method8566('A', '2', 'M', '1'));
	}
    }
    
    void method8456() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 15,
				   aBool9353);
	IDirect3DDevice.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378,
				       24, aByte9354 & 0xff);
	if ((((Class173_Sub1_Sub2) this).aD3DPRESENT_PARAMETERS11368
	     .MultiSampleType)
	    > 0) {
	    if (!aBool9353 || aByte9354 == 0) {
		if (((Class173_Sub1_Sub2) this).aBool11343
		    || ((Class173_Sub1_Sub2) this).aBool11369)
		    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						    .aLong11378),
						   181, 0);
		else if (((Class173_Sub1_Sub2) this).aBool11370)
		    IDirect3DDevice.method9172((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       154, 1.0F);
	    } else if (((Class173_Sub1_Sub2) this).aBool11343)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       181,
					       method8566('S', 'S', 'A', 'A'));
	    else if (((Class173_Sub1_Sub2) this).aBool11369)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       181,
					       method8566('A', 'T', 'O', 'C'));
	    else if (((Class173_Sub1_Sub2) this).aBool11370)
		IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
						.aLong11378),
					       154,
					       method8566('A', '2', 'M', '1'));
	}
    }
    
    void method8638() {
	switch (aClass368_9351.anInt3856) {
	case 0:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 5);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 6);
	    break;
	case 3:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 2);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 2);
	    break;
	case 1:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 2);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 1);
	    break;
	case 2:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 9);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 2);
	    break;
	}
	switch (anInt9384) {
	case 1:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 2);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 1);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 1);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 2);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 1);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 1);
	    break;
	case 2:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 2);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 2);
	    break;
	}
    }
    
    void method8694() {
	switch (aClass368_9351.anInt3856) {
	case 0:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 5);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 6);
	    break;
	case 3:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 2);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 2);
	    break;
	case 1:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 2);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 1);
	    break;
	case 2:
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 19, 9);
	    IDirect3DDevice
		.SetRenderState(((Class173_Sub1_Sub2) this).aLong11378, 20, 2);
	    break;
	}
	switch (anInt9384) {
	case 1:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 2);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 1);
	    break;
	case 3:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 1);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 2);
	    break;
	case 0:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 1);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 1);
	    break;
	case 2:
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   207, 2);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   208, 2);
	    break;
	}
    }
    
    void method8682() {
	if (aBool9274 && !((Class173_Sub1_Sub2) this).aBool11354) {
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					0, false);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					1, false);
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378, 0,
				     ((Class173_Sub1_Sub2) this).aLong11351);
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378, 1,
				     ((Class173_Sub1_Sub2) this).aLong11353);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					0, true);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					1, true);
	    ((Class173_Sub1_Sub2) this).aBool11354 = true;
	}
    }
    
    void method8696() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 27,
				   aBool9338);
    }
    
    Interface39 method8531(int i, boolean bool, int[][] is) {
	return new Class402_Sub3(this, i, bool, is);
    }
    
    void method8698() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 27,
				   aBool9338);
    }
    
    void method8700() {
	aFloat9348 = aFloat9269 - (float) anInt9346;
	aFloat9347 = aFloat9348 - (float) anInt9236;
	if (aFloat9347 < aFloat9361)
	    aFloat9347 = aFloat9361;
	if (aBool9274) {
	    IDirect3DDevice.method9172(((Class173_Sub1_Sub2) this).aLong11378,
				       36, aFloat9347);
	    IDirect3DDevice.method9172(((Class173_Sub1_Sub2) this).aLong11378,
				       37, aFloat9348);
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   34, anInt9344);
	}
    }
    
    void method8615() {
	if (aBool9274)
	    IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378,
				       28,
				       (aBool9249 && aBool9342
					&& anInt9236 >= 0));
    }
    
    void method8701() {
	if (aBool9274)
	    IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378,
				       28,
				       (aBool9249 && aBool9342
					&& anInt9236 >= 0));
    }
    
    public int[] method2311(int i, int i_193_, int i_194_, int i_195_) {
	method2235();
	int[] is = null;
	long l
	    = IDirect3DDevice
		  .GetRenderTarget(((Class173_Sub1_Sub2) this).aLong11378, 0);
	long l_196_
	    = IDirect3DDevice.CreateRenderTarget((((Class173_Sub1_Sub2) this)
						  .aLong11378),
						 i_194_, i_195_, 21, 0, 0,
						 true);
	int i_197_
	    = IDirect3DDevice.StretchRect((((Class173_Sub1_Sub2) this)
					   .aLong11378),
					  l, i, i_193_, i_194_, i_195_, l_196_,
					  0, 0, i_194_, i_195_, 1);
	method8451(i_194_ * i_195_ * 4);
	if (Class360.method4593(i_197_)) {
	    is = new int[i_194_ * i_195_];
	    IDirect3DSurface.Download(l_196_, 0, 0, i_194_, i_195_, i_194_ * 4,
				      16, aLong9223);
	    aByteBuffer9222.clear();
	    aByteBuffer9222.asIntBuffer().get(is);
	}
	IUnknown.Release(l);
	IUnknown.Release(l_196_);
	return is;
    }
    
    public void method2323() {
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    final Interface41 method8617(boolean bool) {
	return new Class413(this, Class169.aClass169_1933, bool);
    }
    
    final Interface41 method8706(boolean bool) {
	return new Class413(this, Class169.aClass169_1933, bool);
    }
    
    void method8727() {
	if (aBool9274 && !((Class173_Sub1_Sub2) this).aBool11354) {
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					0, false);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					1, false);
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378, 0,
				     ((Class173_Sub1_Sub2) this).aLong11351);
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378, 1,
				     ((Class173_Sub1_Sub2) this).aLong11353);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					0, true);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					1, true);
	    ((Class173_Sub1_Sub2) this).aBool11354 = true;
	}
    }
    
    final Interface41 method8574(boolean bool) {
	return new Class413(this, Class169.aClass169_1933, bool);
    }
    
    void method8637() {
	if (aBool9274 && !((Class173_Sub1_Sub2) this).aBool11354) {
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					0, false);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					1, false);
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378, 0,
				     ((Class173_Sub1_Sub2) this).aLong11351);
	    IDirect3DDevice.SetLight(((Class173_Sub1_Sub2) this).aLong11378, 1,
				     ((Class173_Sub1_Sub2) this).aLong11353);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					0, true);
	    IDirect3DDevice.LightEnable(((Class173_Sub1_Sub2) this).aLong11378,
					1, true);
	    ((Class173_Sub1_Sub2) this).aBool11354 = true;
	}
    }
    
    Class344 method8686(Class345[] class345s) {
	return new Class344_Sub1(this, class345s);
    }
    
    Class344 method8708(Class345[] class345s) {
	return new Class344_Sub1(this, class345s);
    }
    
    Class344 method8709(Class345[] class345s) {
	return new Class344_Sub1(this, class345s);
    }
    
    public void method8710(Class344 class344) {
	Class344_Sub1 class344_sub1 = (Class344_Sub1) class344;
	IDirect3DDevice.SetVertexDeclaration((((Class173_Sub1_Sub2) this)
					      .aLong11378),
					     (((Class344_Sub1) class344_sub1)
					      .aLong10047));
    }
    
    public void method8585(int i, Interface36 interface36) {
	Class408 class408 = (Class408) interface36;
	IDirect3DDevice.SetStreamSource(((Class173_Sub1_Sub2) this).aLong11378,
					i, ((Class408) class408).aLong4706, 0,
					class408.method4887());
    }
    
    final void method10399(long l) {
	((Class173_Sub1_Sub2) this).aLong11363 = l;
	IDirect3DDevice.SetVertexShader(((Class173_Sub1_Sub2) this).aLong11378,
					l);
    }
    
    void method8713(Interface41 interface41) {
	IDirect3DDevice.SetIndices(((Class173_Sub1_Sub2) this).aLong11378,
				   (((Class413) (Class413) interface41)
				    .aLong4730));
    }
    
    void method8702(Interface41 interface41) {
	IDirect3DDevice.SetIndices(((Class173_Sub1_Sub2) this).aLong11378,
				   (((Class413) (Class413) interface41)
				    .aLong4730));
    }
    
    Interface34 method8683(int i, int i_198_, boolean bool, int[] is,
			   int i_199_, int i_200_) {
	return new Class402_Sub2(this, i, i_198_, bool, is, i_199_, i_200_);
    }
    
    final void method8715(Interface41 interface41, Class363 class363, int i,
			  int i_201_, int i_202_, int i_203_) {
	if (((Class173_Sub1_Sub2) this).aClass262_Sub1_11362 != null)
	    ((Class173_Sub1_Sub2) this).aClass262_Sub1_11362.method8981();
	IDirect3DDevice.DrawIndexedPrimitiveIB
	    (((Class173_Sub1_Sub2) this).aLong11378,
	     ((Class413) (Class413) interface41).aLong4730, 4, 0, i, i_201_,
	     i_202_, i_203_);
    }
    
    final void method8716(Interface41 interface41, Class363 class363, int i,
			  int i_204_, int i_205_, int i_206_) {
	if (((Class173_Sub1_Sub2) this).aClass262_Sub1_11362 != null)
	    ((Class173_Sub1_Sub2) this).aClass262_Sub1_11362.method8981();
	IDirect3DDevice.DrawIndexedPrimitiveIB
	    (((Class173_Sub1_Sub2) this).aLong11378,
	     ((Class413) (Class413) interface41).aLong4730, 4, 0, i, i_204_,
	     i_205_, i_206_);
    }
    
    void method8648() {
	if (aBool9274) {
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11351,
				  -aFloatArray9290[0], -aFloatArray9290[1],
				  -aFloatArray9290[2]);
	    D3DLIGHT.SetDirection(((Class173_Sub1_Sub2) this).aLong11353,
				  -aFloatArray9267[0], -aFloatArray9267[1],
				  -aFloatArray9267[2]);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    void method8703(boolean bool) {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 161,
				   bool);
    }
    
    static final int method10400(Class358 class358) {
	switch (class358.anInt3821) {
	default:
	    return 0;
	case 5:
	    return 1;
	case 3:
	    return 2;
	case 2:
	    return 4;
	case 1:
	    return 256;
	case 0:
	    return 3;
	}
    }
    
    void method8723(int i) {
	if (!((Class173_Sub1_Sub2) this).aBool11374) {
	    int i_207_ = (i & 0x2) != 0 ? 2 : 3;
	    IDirect3DDevice.SetRenderState((((Class173_Sub1_Sub2) this)
					    .aLong11378),
					   8, i_207_);
	}
    }
    
    void method8641() {
	if (aBool9274)
	    IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378,
				       137, aBool9343 && !aBool9297);
    }
    
    void method8567() {
	/* empty */
    }
    
    final Interface36 method8676(boolean bool) {
	return new Class408(this, bool);
    }
    
    public boolean method8448() {
	return ((((Class173_Sub1_Sub2) this).aD3DCAPS11364.VertexShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    void method8725() {
	if (aClass163_1998 != null)
	    IDirect3DDevice.SetViewport(((Class173_Sub1_Sub2) this).aLong11378,
					anInt9282 + anInt9275,
					anInt9238 + anInt9350, anInt9258,
					anInt9303, aFloat9367, aFloat9265);
    }
    
    void method8576() {
	if (aClass163_1998 != null)
	    IDirect3DDevice.SetViewport(((Class173_Sub1_Sub2) this).aLong11378,
					anInt9282 + anInt9275,
					anInt9238 + anInt9350, anInt9258,
					anInt9303, aFloat9367, aFloat9265);
    }
    
    void method8555() {
	if (aClass163_1998 != null)
	    IDirect3DDevice.SetViewport(((Class173_Sub1_Sub2) this).aLong11378,
					anInt9282 + anInt9275,
					anInt9238 + anInt9350, anInt9258,
					anInt9303, aFloat9367, aFloat9265);
    }
    
    public void method2304() {
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    void method8643() {
	if (aBool9274) {
	    D3DLIGHT.SetAmbient(((Class173_Sub1_Sub2) this).aLong11351,
				aFloat9295 * aFloat9298,
				aFloat9296 * aFloat9298,
				aFloat9251 * aFloat9298, 0.0F);
	    ((Class173_Sub1_Sub2) this).aBool11354 = false;
	}
    }
    
    public Class168 method2368(Class168 class168, Class168 class168_208_,
			       float f, Class168 class168_209_) {
	return f < 0.5F ? class168 : class168_208_;
    }
    
    public void method2333() {
	if (((Class173_Sub1_Sub2) this).aLong11380 != 0L) {
	    IUnknown.Release(((Class173_Sub1_Sub2) this).aLong11380);
	    ((Class173_Sub1_Sub2) this).aLong11380 = 0L;
	}
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub2) this).aLongArray11381[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11381[i]);
		((Class173_Sub1_Sub2) this).aLongArray11381[i] = 0L;
	    }
	    if (((Class173_Sub1_Sub2) this).aLongArray11358[i] != 0L) {
		IUnknown
		    .Release(((Class173_Sub1_Sub2) this).aLongArray11358[i]);
		((Class173_Sub1_Sub2) this).aLongArray11358[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub2) this).anInt11356 = 0;
	((Class173_Sub1_Sub2) this).anInt11345 = 0;
    }
    
    public boolean method8595() {
	return ((((Class173_Sub1_Sub2) this).aD3DCAPS11364.VertexShaderVersion
		 & 0xffff)
		>= 257);
    }
    
    boolean method8653(Class149 class149, Class169 class169) {
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class360.method4593(IDirect3D.GetAdapterDisplayMode
				    (((Class173_Sub1_Sub2) this).aLong11367,
				     ((Class173_Sub1_Sub2) this).anInt11382,
				     d3ddisplaymode))
		&& Class360.method4593(IDirect3D.CheckDeviceFormat
				       (((Class173_Sub1_Sub2) this).aLong11367,
					((Class173_Sub1_Sub2) this).anInt11382,
					((Class173_Sub1_Sub2) this).anInt11344,
					d3ddisplaymode.Format, 0, 3,
					method10394(class149, class169))));
    }
    
    void method8507() {
	if (aBool9274)
	    IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378,
				       137, aBool9343 && !aBool9297);
    }
    
    void method10401(Interface49 interface49) {
	if (method10382(interface49) == null)
	    ((Class173_Sub1_Sub2) this).aClass688_11352
		.method8031(new Class528_Sub31(interface49), (byte) 28);
    }
    
    void method8688() {
	IDirect3DDevice.method9173(((Class173_Sub1_Sub2) this).aLong11378, 27,
				   aBool9338);
    }
    
    public void method2307(boolean bool) {
	/* empty */
    }
}
