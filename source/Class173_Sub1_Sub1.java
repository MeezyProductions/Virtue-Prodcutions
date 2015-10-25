/* Class173_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

public final class Class173_Sub1_Sub1 extends Class173_Sub1
{
    float[] aFloatArray11265;
    int anInt11266;
    Class688 aClass688_11267;
    boolean aBool11268;
    Class688 aClass688_11269;
    Class688 aClass688_11270;
    OpenGL anOpenGL11271;
    boolean aBool11272;
    long aLong11273;
    int[] anIntArray11274;
    boolean aBool11275;
    boolean aBool11276;
    boolean aBool11277;
    long[] aLongArray11278;
    Class478_Sub1[] aClass478_Sub1Array11279;
    Class478_Sub2 aClass478_Sub2_11280;
    int[] anIntArray11281;
    Class262_Sub2 aClass262_Sub2_11282;
    boolean aBool11283;
    boolean aBool11284;
    String aString11285;
    Class688 aClass688_11286;
    boolean aBool11287;
    boolean aBool11288;
    boolean aBool11289;
    boolean aBool11290;
    int[] anIntArray11291;
    Class688 aClass688_11292;
    Class688 aClass688_11293 = new Class688();
    int anInt11294;
    boolean aBool11295;
    boolean aBool11296;
    float[] aFloatArray11297;
    int anInt11298;
    static final int anInt11299 = 3;
    Class151 aClass151_11300;
    Class151 aClass151_11301;
    int anInt11302;
    int[] anIntArray11303;
    Class688 aClass688_11304;
    Class163_Sub1 aClass163_Sub1_11305;
    int anInt11306;
    String aString11307;
    
    void method8726() {
	OpenGL.glActiveTexture(33984 + anInt9308);
    }
    
    public Class258 method8580(String string) {
	byte[] is = method10361(string);
	if (is == null)
	    return null;
	Class275 class275 = method8455(is);
	return new Class258_Sub2(this, class275);
    }
    
    public boolean method8448() {
	return ((Class173_Sub1_Sub1) this).aBool11268;
    }
    
    public boolean method8596() {
	return ((Class173_Sub1_Sub1) this).aBool11277;
    }
    
    public boolean method8449(boolean bool) {
	return true;
    }
    
    Class173_Sub1_Sub1(OpenGL opengl, Canvas canvas, long l, Class165 class165,
		       Interface22 interface22, Interface44 interface44,
		       Interface45 interface45, Interface46 interface46,
		       Class446 class446, int i) {
	super(class165, interface22, interface44, interface45, interface46,
	      class446, i, 1);
	((Class173_Sub1_Sub1) this).aClass688_11267 = new Class688();
	((Class173_Sub1_Sub1) this).aClass688_11304 = new Class688();
	((Class173_Sub1_Sub1) this).aClass688_11269 = new Class688();
	((Class173_Sub1_Sub1) this).aClass688_11270 = new Class688();
	((Class173_Sub1_Sub1) this).aClass688_11292 = new Class688();
	((Class173_Sub1_Sub1) this).aClass688_11286 = new Class688();
	((Class173_Sub1_Sub1) this).anIntArray11274 = new int[1000];
	((Class173_Sub1_Sub1) this).aClass478_Sub1Array11279
	    = new Class478_Sub1[16];
	new MapBuffer();
	new MapBuffer();
	((Class173_Sub1_Sub1) this).aFloatArray11297 = new float[4];
	((Class173_Sub1_Sub1) this).aFloatArray11265 = new float[16];
	((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	((Class173_Sub1_Sub1) this).aClass151_11301 = null;
	((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	((Class173_Sub1_Sub1) this).anIntArray11303 = new int[3];
	((Class173_Sub1_Sub1) this).aLongArray11278 = new long[3];
	((Class173_Sub1_Sub1) this).anIntArray11291 = new int[3];
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	int[] is = new int[1];
	try {
	    ((Class173_Sub1_Sub1) this).anOpenGL11271 = opengl;
	    ((Class173_Sub1_Sub1) this).anOpenGL11271.method1162();
	    ((Class173_Sub1_Sub1) this).aString11307
		= OpenGL.glGetString(7936).toLowerCase();
	    ((Class173_Sub1_Sub1) this).aString11285
		= OpenGL.glGetString(7937).toLowerCase();
	    if ((((Class173_Sub1_Sub1) this).aString11307.indexOf("microsoft")
		 != -1)
		|| ((Class173_Sub1_Sub1) this).aString11307
		       .indexOf("brian paul") != -1
		|| (((Class173_Sub1_Sub1) this).aString11307.indexOf("mesa")
		    != -1))
		throw new RuntimeException("");
	    String string = OpenGL.glGetString(7938);
	    String[] strings = Class520.method6348(string.replace('.', ' '),
						   ' ', (byte) -5);
	    if (strings.length >= 2) {
		try {
		    int i_0_ = Class454.method5495(strings[0], 717927929);
		    int i_1_ = Class454.method5495(strings[1], 717927929);
		    ((Class173_Sub1_Sub1) this).anInt11298 = i_0_ * 10 + i_1_;
		} catch (NumberFormatException numberformatexception) {
		    throw new RuntimeException("");
		}
	    } else
		throw new RuntimeException("");
	    if (((Class173_Sub1_Sub1) this).anInt11298 < 12)
		throw new RuntimeException("");
	    OpenGL.glGetIntegerv(34018, is, 0);
	    anInt9235 = is[0];
	    if (anInt9235 < 2)
		throw new RuntimeException("");
	    anInt9211 = 8;
	    ((Class173_Sub1_Sub1) this).aBool11287
		= ((Class173_Sub1_Sub1) this).anOpenGL11271
		      .method1161("GL_ARB_vertex_buffer_object");
	    aBool9362 = ((Class173_Sub1_Sub1) this).anOpenGL11271
			    .method1161("GL_ARB_multisample");
	    aBool9370 = ((Class173_Sub1_Sub1) this).anOpenGL11271
			    .method1161("GL_EXT_blend_func_separate");
	    ((Class173_Sub1_Sub1) this).aBool11288
		= ((Class173_Sub1_Sub1) this).anOpenGL11271
		      .method1161("GL_ARB_texture_rectangle");
	    aBool9278 = ((Class173_Sub1_Sub1) this).anOpenGL11271
			    .method1161("GL_ARB_texture_cube_map");
	    ((Class173_Sub1_Sub1) this).aBool11289
		= ((Class173_Sub1_Sub1) this).anOpenGL11271
		      .method1161("GL_ARB_texture_non_power_of_two");
	    aBool9368 = true;
	    ((Class173_Sub1_Sub1) this).aBool11268
		= ((Class173_Sub1_Sub1) this).anOpenGL11271
		      .method1161("GL_ARB_vertex_shader");
	    ((Class173_Sub1_Sub1) this).aBool11290
		= ((Class173_Sub1_Sub1) this).anOpenGL11271
		      .method1161("GL_ARB_vertex_program");
	    ((Class173_Sub1_Sub1) this).aBool11277
		= ((Class173_Sub1_Sub1) this).anOpenGL11271
		      .method1161("GL_ARB_fragment_shader");
	    ((Class173_Sub1_Sub1) this).aBool11272
		= ((Class173_Sub1_Sub1) this).anOpenGL11271
		      .method1161("GL_ARB_fragment_program");
	    aBool9279 = ((Class173_Sub1_Sub1) this).anOpenGL11271
			    .method1161("GL_EXT_framebuffer_object");
	    aBool9359 = aBool9279;
	    aBool9364 = ((Class173_Sub1_Sub1) this).anOpenGL11271
			    .method1161("GL_EXT_framebuffer_blit");
	    aBool9225 = ((Class173_Sub1_Sub1) this).anOpenGL11271
			    .method1161("GL_EXT_framebuffer_multisample");
	    ((Class173_Sub1_Sub1) this).aBool11295
		= (anUnsafe9221 != null
		   && (((Class173_Sub1_Sub1) this).anInt11298 >= 32
		       || ((Class173_Sub1_Sub1) this).anOpenGL11271
			      .method1161("GL_ARB_sync")));
	    ((Class173_Sub1_Sub1) this).anIntArray11281 = new int[anInt9235];
	    if (!method8448() || !method8596()) {
		if (!((Class173_Sub1_Sub1) this).anOpenGL11271
			 .method1161("GL_ARB_multitexture"))
		    throw new RuntimeException("");
		if (!((Class173_Sub1_Sub1) this).anOpenGL11271
			 .method1161("GL_ARB_texture_env_combine"))
		    throw new RuntimeException("");
	    }
	    Class493.aString5525.startsWith("mac");
	    ((Class173_Sub1_Sub1) this).anInt11294
		= Stream.method1190() ? 33639 : 5121;
	    if ((((Class173_Sub1_Sub1) this).aString11285.indexOf("radeon")
		 != -1)
		|| (((Class173_Sub1_Sub1) this).aString11307.indexOf("intel")
		    != -1)) {
		int i_2_ = 0;
		boolean bool = (((Class173_Sub1_Sub1) this).aString11307
				    .indexOf("intel")
				!= -1);
		boolean bool_3_ = false;
		boolean bool_4_ = false;
		String[] strings_5_
		    = Class520.method6348(((Class173_Sub1_Sub1) this)
					      .aString11285.replace('/', ' '),
					  ' ', (byte) 0);
		for (int i_6_ = 0; i_6_ < strings_5_.length; i_6_++) {
		    String string_7_ = strings_5_[i_6_];
		    try {
			if (string_7_.length() <= 0)
			    continue;
			if (string_7_.charAt(0) == 'x'
			    && string_7_.length() >= 3
			    && Class615.method7353(string_7_.substring(1, 3),
						   -196490854)) {
			    string_7_ = string_7_.substring(1);
			    bool_4_ = true;
			}
			if (string_7_.equals("hd")) {
			    bool_3_ = true;
			    continue;
			}
			if (string_7_.startsWith("hd")) {
			    string_7_ = string_7_.substring(2);
			    bool_3_ = true;
			}
			if (string_7_.length() < 4
			    || !Class615.method7353(string_7_.substring(0, 4),
						    -1747570035))
			    continue;
			i_2_ = Class454.method5495(string_7_.substring(0, 4),
						   717927929);
		    } catch (Exception exception) {
			continue;
		    }
		    break;
		}
		if (bool) {
		    if (!bool_3_)
			aBool9279 = false;
		} else {
		    if (!bool_4_ && !bool_3_) {
			if (i_2_ >= 7000 && i_2_ <= 7999)
			    ((Class173_Sub1_Sub1) this).aBool11287 = false;
			if (i_2_ >= 7000 && i_2_ <= 9250)
			    aBool9368 = false;
		    }
		    ((Class173_Sub1_Sub1) this).aBool11288
			&= ((Class173_Sub1_Sub1) this).anOpenGL11271
			       .method1161("GL_ARB_half_float_pixel");
		    ((Class173_Sub1_Sub1) this).aBool11283 = true;
		}
	    }
	    if (((Class173_Sub1_Sub1) this).aBool11287) {
		try {
		    int[] is_8_ = new int[1];
		    OpenGL.glGenBuffersARB(1, is_8_, 0);
		} catch (Throwable throwable) {
		    throw new RuntimeException("");
		}
	    } else
		throw new RuntimeException("");
	    method2387(canvas, new Class163_Sub2_Sub2_Sub2(this, canvas, l),
		       (byte) 103);
	    method2177(canvas, (short) 168);
	    method8547(32768, false);
	    method8547(32768, false);
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method2156(-1372793801);
	    if (throwable instanceof OutOfMemoryError)
		throw (OutOfMemoryError) throwable;
	    throw new RuntimeException("");
	}
    }
    
    public Class152 method2528() {
	int i = -1;
	if (((Class173_Sub1_Sub1) this).aString11307.indexOf("nvidia") != -1)
	    i = 4318;
	else if (((Class173_Sub1_Sub1) this).aString11307.indexOf("intel")
		 != -1)
	    i = 32902;
	else if (((Class173_Sub1_Sub1) this).aString11307.indexOf("ati") != -1)
	    i = 4098;
	return new Class152(i, method8450() ? "OpenGL FF" : "OpenGL",
			    ((Class173_Sub1_Sub1) this).anInt11298,
			    ((Class173_Sub1_Sub1) this).aString11285, 0L,
			    method8450());
    }
    
    public void method2155() {
	OpenGL.glFinish();
    }
    
    final void method8524() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = (float) (anInt9314 & 0xff0000) / 1.671168E7F;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = (float) (anInt9314 & 0xff00) / 65280.0F;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = (float) (anInt9314 & 0xff) / 255.0F;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3]
	    = (float) (anInt9314 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705,
			  ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    public float method8468() {
	return 0.0F;
    }
    
    Class163_Sub2 method2310(Canvas canvas, int i, int i_9_) {
	return new Class163_Sub2_Sub2_Sub2(this, canvas);
    }
    
    public Class163_Sub1 method2236() {
	return new Class163_Sub1_Sub3_Sub2(this);
    }
    
    static final int method10347(Class357 class357) {
	if (class357 == Class357.aClass357_3814)
	    return 5890;
	if (class357 == Class357.aClass357_3817)
	    return 34167;
	if (class357 == Class357.aClass357_3813)
	    return 34168;
	if (class357 == Class357.aClass357_3816)
	    return 34166;
	throw new IllegalArgumentException();
    }
    
    public Class168 method2368(Class168 class168, Class168 class168_10_,
			       float f, Class168 class168_11_) {
	return f < 0.5F ? class168 : class168_10_;
    }
    
    public Interface21 method2411(int i, int i_12_, int i_13_) {
	return new Class485(this, Class149.aClass149_1683,
			    Class169.aClass169_1937, i, i_12_, i_13_);
    }
    
    public int[] method2208(int i, int i_14_, int i_15_, int i_16_) {
	int[] is = new int[i_15_ * i_16_];
	int i_17_ = aClass163_1998.method2070();
	for (int i_18_ = 0; i_18_ < i_16_; i_18_++)
	    OpenGL.glReadPixelsi(i, i_17_ - i_14_ - i_18_ - 1, i_15_, 1, 32993,
				 ((Class173_Sub1_Sub1) this).anInt11294, is,
				 i_18_ * i_15_);
	return is;
    }
    
    public void method2186() {
	if (aClass163_1998 != null) {
	    int i = aClass163_1998.method2074();
	    int i_19_ = aClass163_1998.method2070();
	    if (i > 0 || i_19_ > 0) {
		int i_20_ = anInt9275;
		int i_21_ = anInt9350;
		int i_22_ = anInt9258;
		int i_23_ = anInt9303;
		method2527();
		int i_24_ = anInt9272;
		int i_25_ = anInt9273;
		int i_26_ = anInt9365;
		int i_27_ = anInt9271;
		method2203();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method8495();
		method8661(false);
		method8505(false);
		method8502(false);
		method8624(false);
		method8526(null);
		method8586(1);
		method8479(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_19_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method2204(i_24_, i_26_, i_25_, i_27_);
		method2275(i_20_, i_21_, i_22_, i_23_);
	    }
	}
    }
    
    public boolean method2426() {
	return ((Class173_Sub1_Sub1) this).aBool11295;
    }
    
    void method8623() {
	if (aBool9249 && aBool9342 && anInt9236 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    public boolean method2189() {
	return true;
    }
    
    void method8668() {
	OpenGL.glDepthFunc(515);
	OpenGL.glEnable(2884);
	OpenGL.glCullFace(1029);
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9362) {
	    method8470(anInt9355 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9235 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_28_ = 16384 + i;
	    OpenGL.glLightfv(i_28_, 4608, fs, 0);
	    OpenGL.glLightf(i_28_, 4615, 0.0F);
	    OpenGL.glLightf(i_28_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	((Class173_Sub1_Sub1) this).anOpenGL11271.setSwapInterval(0);
	super.method8668();
    }
    
    void method8682() {
	/* empty */
    }
    
    public void method2193(int i, int i_29_, int i_30_) {
	method2254();
	if (((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 == null)
	    method10349(i_29_, i_30_);
	if (((Class173_Sub1_Sub1) this).aClass151_11300 == null)
	    ((Class173_Sub1_Sub1) this).aClass151_11300
		= method2234(0, 0, aClass163_1998.method2074(),
			     aClass163_1998.method2070(), false);
	else
	    ((Class173_Sub1_Sub1) this).aClass151_11300.method1784
		(0, 0, aClass163_1998.method2074(),
		 aClass163_1998.method2070(), 0, 0);
	method2179(((Class173_Sub1_Sub1) this).aClass163_Sub1_11305,
		   -275235592);
	method2268(1, -16777216);
	((Class173_Sub1_Sub1) this).aClass151_11300.method1774
	    (anInt2002 * 1354853215, anInt2007 * -2074272721,
	     anInt2006 * 857980141, anInt1990 * -649725419);
	OpenGL.glBindBufferARB(35051,
			       (((Class173_Sub1_Sub1) this).anIntArray11303
				[((Class173_Sub1_Sub1) this).anInt11266]));
	OpenGL.glReadPixelsub(0, 0, anInt1976 * 1361535585,
			      anInt2003 * 171311817, 32993, 5121, null, 0);
	OpenGL.glBindBufferARB(35051, 0);
	method2180(((Class173_Sub1_Sub1) this).aClass163_Sub1_11305,
		   1123315795);
	((Class173_Sub1_Sub1) this).aLongArray11278
	    [((Class173_Sub1_Sub1) this).anInt11266]
	    = OpenGL.glFenceSync(37143, 0);
	((Class173_Sub1_Sub1) this).anIntArray11291
	    [((Class173_Sub1_Sub1) this).anInt11266]
	    = i;
	if (++((Class173_Sub1_Sub1) this).anInt11266 >= 3)
	    ((Class173_Sub1_Sub1) this).anInt11266 = 0;
	method2237();
    }
    
    public void method2232() {
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this).aLongArray11278
				    [i]);
		((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    public long method2194(int i, int i_31_) {
	return method10348(i, i_31_, null, null);
    }
    
    public void method2196(int i, int i_32_, int[] is, int[] is_33_) {
	method10348(i, i_32_, is, is_33_);
    }
    
    long method10348(int i, int i_34_, int[] is, int[] is_35_) {
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    if ((((Class173_Sub1_Sub1) this).aLongArray11278
		 [((Class173_Sub1_Sub1) this).anInt11306])
		!= 0L) {
		OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this).aLongArray11278
				    [((Class173_Sub1_Sub1) this).anInt11306]);
		((Class173_Sub1_Sub1) this).aLongArray11278
		    [((Class173_Sub1_Sub1) this).anInt11306]
		    = 0L;
	    }
	    OpenGL.glBindBufferARB(35051,
				   (((Class173_Sub1_Sub1) this).anIntArray11303
				    [((Class173_Sub1_Sub1) this).anInt11306]));
	    long l = OpenGL.glMapBufferARB(35051, 35000);
	    if (is != null) {
		for (int i_36_ = 0; i_36_ < i * i_34_; i_36_++)
		    is[i_36_] = anUnsafe9221.getInt(l + (long) (i_36_ * 4));
		if (OpenGL.glUnmapBufferARB(35051)) {
		    /* empty */
		}
		OpenGL.glBindBufferARB(35051, 0);
		l = 0L;
	    }
	    if (++((Class173_Sub1_Sub1) this).anInt11306 >= 3)
		((Class173_Sub1_Sub1) this).anInt11306 = 0;
	    return l;
	}
	if (((Class173_Sub1_Sub1) this).aClass151_11301 == null)
	    method10349(i, i_34_);
	if (((Class173_Sub1_Sub1) this).aClass151_11300 == null)
	    ((Class173_Sub1_Sub1) this).aClass151_11300
		= method2234(0, 0, aClass163_1998.method2074(),
			     aClass163_1998.method2070(), false);
	else
	    ((Class173_Sub1_Sub1) this).aClass151_11300.method1784
		(0, 0, aClass163_1998.method2074(),
		 aClass163_1998.method2070(), 0, 0);
	method2179(((Class173_Sub1_Sub1) this).aClass163_Sub1_11305,
		   -2053289745);
	method2268(1, -16777216);
	((Class173_Sub1_Sub1) this).aClass151_11300.method1774
	    (anInt2002 * 1354853215, anInt2007 * -2074272721,
	     anInt2006 * 857980141, anInt1990 * -649725419);
	((Class173_Sub1_Sub1) this).aClass151_11301
	    .method1771(0, 0, i, i_34_, is, is_35_, 0, i);
	method2180(((Class173_Sub1_Sub1) this).aClass163_Sub1_11305,
		   1058283520);
	return 0L;
    }
    
    void method2494(int i, int i_37_) throws Exception_Sub5 {
	aClass163_Sub2_1999.method8917();
	if (anInterface22_1991 != null)
	    anInterface22_1991.method27((byte) -15);
    }
    
    public void method2342() {
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	    if (((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 != null) {
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305.method115();
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, (((Class173_Sub1_Sub1) this)
					  .anIntArray11303), 0);
	    for (int i = 0; i < 3; i++) {
		((Class173_Sub1_Sub1) this).anIntArray11303[i] = 0;
		if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		    OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this)
					.aLongArray11278[i]);
		    ((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
		}
	    }
	} else {
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11301 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    void method10349(int i, int i_38_) {
	method2342();
	method2197(i, i_38_, (byte) 1);
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    ((Class173_Sub1_Sub1) this).aClass151_11301
		= method2191(i, i_38_, false, true);
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = method2236();
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305.method8898
		(0, ((Class173_Sub1_Sub1) this).aClass151_11301.method1769());
	    OpenGL.glGenBuffersARB(3,
				   ((Class173_Sub1_Sub1) this).anIntArray11303,
				   0);
	    for (int i_39_ = 0; i_39_ < 3; i_39_++) {
		OpenGL.glBindBufferARB(35051, (((Class173_Sub1_Sub1) this)
					       .anIntArray11303[i_39_]));
		OpenGL.glBufferDataARBa(35051, i * i_38_ * 4, 0L, 35041);
		OpenGL.glBindBufferARB(35051, 0);
	    }
	} else {
	    ((Class173_Sub1_Sub1) this).aClass151_11301
		= method2191(i, i_38_, false, true);
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = method2236();
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305.method8898
		(0, ((Class173_Sub1_Sub1) this).aClass151_11301.method1769());
	}
    }
    
    public Class168 method2410(Class168 class168, Class168 class168_40_,
			       float f, Class168 class168_41_) {
	return f < 0.5F ? class168 : class168_40_;
    }
    
    public void method2268(int i, int i_42_) {
	int i_43_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_42_ & 0xff0000) / 1.671168E7F,
				(float) (i_42_ & 0xff00) / 65280.0F,
				(float) (i_42_ & 0xff) / 255.0F,
				(float) (i_42_ >>> 24) / 255.0F);
	    i_43_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method8624(true);
	    i_43_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_43_ |= 0x400;
	OpenGL.glClear(i_43_);
    }
    
    void method8483() {
	if (aClass163_1998 != null)
	    OpenGL.glViewport(anInt9282 + anInt9275,
			      (anInt9238 + aClass163_1998.method2070()
			       - anInt9350 - anInt9303),
			      anInt9258, anInt9303);
	OpenGL.glDepthRange(aFloat9367, aFloat9265);
    }
    
    void method8622() {
	if (aClass163_1998 != null) {
	    int i = anInt9282 + anInt9272;
	    int i_44_ = anInt9238 + aClass163_1998.method2070() - anInt9271;
	    int i_45_ = anInt9273 - anInt9272;
	    int i_46_ = anInt9271 - anInt9365;
	    if (i_45_ < 0)
		i_45_ = 0;
	    if (i_46_ < 0)
		i_46_ = 0;
	    OpenGL.glScissor(i, i_44_, i_45_, i_46_);
	}
    }
    
    public Interface21 method2548(int i, int i_47_, int i_48_) {
	return new Class485(this, Class149.aClass149_1683,
			    Class169.aClass169_1937, i, i_47_, i_48_);
    }
    
    public void method2323() {
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this).aLongArray11278
				    [i]);
		((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    public void method8618(Class418 class418) {
	float[] fs = class418.aFloatArray4768;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    public boolean method2175() {
	return true;
    }
    
    void method8642() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = aFloat9298 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = aFloat9298 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = aFloat9298 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightModelfv(2899,
			      ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    void method8727() {
	/* empty */
    }
    
    public void method2327(long l) {
	if (l != 0L) {
	    if (OpenGL.glUnmapBufferARB(35051)) {
		/* empty */
	    }
	    OpenGL.glBindBufferARB(35051, 0);
	}
    }
    
    void method8621() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = aFloat9299 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = aFloat9299 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = aFloat9299 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609,
			 ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = -aFloat9300 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = -aFloat9300 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = -aFloat9300 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609,
			 ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    void method8445() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass418_9381.aFloatArray4768, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9290, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9267, 0);
    }
    
    void method8460() {
	if (aBool9288) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    public int[] method2311(int i, int i_49_, int i_50_, int i_51_) {
	int[] is = new int[i_50_ * i_51_];
	int i_52_ = aClass163_1998.method2070();
	for (int i_53_ = 0; i_53_ < i_51_; i_53_++)
	    OpenGL.glReadPixelsi(i, i_52_ - i_49_ - i_53_ - 1, i_50_, 1, 32993,
				 ((Class173_Sub1_Sub1) this).anInt11294, is,
				 i_53_ * i_50_);
	return is;
    }
    
    Interface34 method8542(Class149 class149, int i, int i_54_, boolean bool,
			   float[] fs, int i_55_, int i_56_) {
	return new Class470_Sub3(this, class149, i, i_54_, bool, fs, i_55_,
				 i_56_);
    }
    
    public void method2285() {
	OpenGL.glFinish();
    }
    
    boolean method8577(Class149 class149, Class169 class169) {
	return aBool9368;
    }
    
    Interface34 method8519(Class149 class149, Class169 class169, int i,
			   int i_57_) {
	return method8525(class149, class169, i, i_57_);
    }
    
    Interface34 method8522(int i, int i_58_, boolean bool, int[] is, int i_59_,
			   int i_60_) {
	return new Class470_Sub3(this, i, i_58_, bool, is, i_59_, i_60_);
    }
    
    Interface34 method8520(Class149 class149, int i, int i_61_, boolean bool,
			   byte[] is, int i_62_, int i_63_) {
	return new Class470_Sub3(this, class149, i, i_61_, bool, is, i_62_,
				 i_63_);
    }
    
    Interface34 method8521(Class149 class149, int i, int i_64_, boolean bool,
			   float[] fs, int i_65_, int i_66_) {
	return new Class470_Sub3(this, class149, i, i_64_, bool, fs, i_65_,
				 i_66_);
    }
    
    public void method8712(int i, Interface36 interface36) {
	((Class173_Sub1_Sub1) this).aClass478_Sub1Array11279[i]
	    = (Class478_Sub1) interface36;
    }
    
    public Class163_Sub1 method2540() {
	return new Class163_Sub1_Sub3_Sub2(this);
    }
    
    Interface32 method8469(Class149 class149, int i, int i_67_, int i_68_,
			   boolean bool, byte[] is) {
	return new Class470_Sub1(this, class149, i, i_67_, i_68_, bool, is);
    }
    
    public void method8527() {
	int i = ((Class173_Sub1_Sub1) this).anIntArray11281[anInt9308];
	if (i != 0) {
	    ((Class173_Sub1_Sub1) this).anIntArray11281[anInt9308] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    void method8538() {
	OpenGL.glMatrixMode(5890);
	if (aClass358Array9231[anInt9308] != Class358.aClass358_3822)
	    OpenGL.glLoadMatrixf
		(aClass418Array9310[anInt9308]
		     .method4994(((Class173_Sub1_Sub1) this).aFloatArray11265),
		 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method8652() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass418_9381.aFloatArray4768, 0);
	int i;
	for (i = 0; i < anInt9333; i++) {
	    Class528_Sub12 class528_sub12 = aClass528_Sub12Array9210[i];
	    int i_69_ = class528_sub12.method9361((byte) -14);
	    int i_70_ = 16386 + i;
	    float f = class528_sub12.method9362(1881761817) / 255.0F;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[0]
		= (float) class528_sub12.method9366(1316190910);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[1]
		= (float) class528_sub12.method9360(-1375654801);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[2]
		= (float) class528_sub12.method9370(1221114533);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	    OpenGL.glLightfv(i_70_, 4611,
			     ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[0]
		= (float) (i_69_ >> 16 & 0xff) * f;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[1]
		= (float) (i_69_ >> 8 & 0xff) * f;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[2]
		= (float) (i_69_ & 0xff) * f;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	    OpenGL.glLightfv(i_70_, 4609,
			     ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
	    OpenGL.glLightf(i_70_, 4617,
			    (1.0F
			     / (float) (class528_sub12.method9357(1494327648)
					* class528_sub12
					      .method9357(1032772406))));
	    OpenGL.glEnable(i_70_);
	}
	for (/**/; i < anInt9302; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    Interface39 method8531(int i, boolean bool, int[][] is) {
	return new Class470_Sub2(this, i, bool, is);
    }
    
    public final synchronized void method2461(int i) {
	try {
	    method10358();
	} catch (Exception exception) {
	    return;
	}
	int i_71_ = 0;
	i &= 0x7fffffff;
	while (!((Class173_Sub1_Sub1) this).aClass688_11267
		    .method8040((byte) -80)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11267
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_71_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9230 -= class528_sub17.anInt10388 * 870949851;
	    if (i_71_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_71_, (((Class173_Sub1_Sub1) this)
						  .anIntArray11274), 0);
		i_71_ = 0;
	    }
	}
	if (i_71_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_71_, (((Class173_Sub1_Sub1) this)
					      .anIntArray11274), 0);
	    i_71_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11304
		    .method8040((byte) -40)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11304
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_71_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9229 -= class528_sub17.anInt10388 * 870949851;
	    if (i_71_ == 1000) {
		OpenGL.glDeleteTextures(i_71_, (((Class173_Sub1_Sub1) this)
						.anIntArray11274), 0);
		i_71_ = 0;
	    }
	}
	if (i_71_ > 0) {
	    OpenGL.glDeleteTextures(i_71_, (((Class173_Sub1_Sub1) this)
					    .anIntArray11274), 0);
	    i_71_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11269
		    .method8040((byte) -24)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11269
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_71_++]
		= class528_sub17.anInt10388 * 870949851;
	    if (i_71_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_71_,
					       (((Class173_Sub1_Sub1) this)
						.anIntArray11274),
					       0);
		i_71_ = 0;
	    }
	}
	if (i_71_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_71_, (((Class173_Sub1_Sub1) this)
						   .anIntArray11274), 0);
	    i_71_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11270
		    .method8040((byte) -1)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11270
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_71_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9287 -= class528_sub17.anInt10388 * 870949851;
	    if (i_71_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_71_,
						(((Class173_Sub1_Sub1) this)
						 .anIntArray11274),
						0);
		i_71_ = 0;
	    }
	}
	if (i_71_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_71_, (((Class173_Sub1_Sub1) this)
						    .anIntArray11274), 0);
	    boolean bool = false;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11293
		    .method8040((byte) -2)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11293
				       .method8032(-1490570711);
	    OpenGL.glDeleteLists((int) (class528_sub17.aLong7107
					* -4849232331708333273L),
				 class528_sub17.anInt10388 * 870949851);
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11292
		    .method8040((byte) -17)) {
	    Node node = ((Class173_Sub1_Sub1) this).aClass688_11292
				    .method8032(-1490570711);
	    OpenGL.glDeleteProgram((int) (node.aLong7107
					  * -4849232331708333273L));
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11286
		    .method8040((byte) -29)) {
	    Node node = ((Class173_Sub1_Sub1) this).aClass688_11286
				    .method8032(-1490570711);
	    OpenGL.glDeleteShader((int) (node.aLong7107
					 * -4849232331708333273L));
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11293
		    .method8040((byte) -58)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11293
				       .method8032(-1490570711);
	    OpenGL.glDeleteLists((int) (class528_sub17.aLong7107
					* -4849232331708333273L),
				 class528_sub17.anInt10388 * 870949851);
	}
	if (method2159() > 100663296
	    && (Class249.method3417(2120936392)
		> ((Class173_Sub1_Sub1) this).aLong11273 + 60000L)) {
	    System.gc();
	    ((Class173_Sub1_Sub1) this).aLong11273
		= Class249.method3417(1968954810);
	}
	super.method2158(i);
    }
    
    final void method8529(int i, Class357 class357, boolean bool,
			  boolean bool_72_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method10347(class357));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_72_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_72_ ? 769 : 768);
    }
    
    final void method8604(int i, Class357 class357, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method10347(class357));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    final void method8537() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = (float) (anInt9314 & 0xff0000) / 1.671168E7F;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = (float) (anInt9314 & 0xff00) / 65280.0F;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = (float) (anInt9314 & 0xff) / 255.0F;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3]
	    = (float) (anInt9314 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705,
			  ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    static final int method10350(Class356 class356) {
	if (class356 == Class356.aClass356_3808)
	    return 7681;
	if (class356 == Class356.aClass356_3807)
	    return 8448;
	if (class356 == Class356.aClass356_3811)
	    return 34165;
	if (class356 == Class356.aClass356_3809)
	    return 260;
	if (class356 == Class356.aClass356_3810)
	    return 34023;
	throw new IllegalArgumentException();
    }
    
    public String method2536() {
	String string = "Caps: 4:";
	String string_73_ = ":";
	string = new StringBuilder().append(string).append(anInt9355).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).anInt11294).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append(anInt9235).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append(anInt9211).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11287 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9362 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11290 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11272 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11268 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11277 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9368 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11288 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9278 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11289 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9279 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9364 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9225 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9370 ? 1 : 0).append
		     (string_73_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    void method8545(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    void method8546() {
	if (aBool9353)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9354 & 0xff) / 255.0F);
	if (anInt9355 > 1) {
	    if (aByte9354 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    void method8556() {
	if (aBool9370) {
	    int i = 0;
	    int i_74_ = 0;
	    if (anInt9384 == 0) {
		i = 0;
		i_74_ = 0;
	    } else if (anInt9384 == 1) {
		i = 1;
		i_74_ = 0;
	    } else if (anInt9384 == 2) {
		i = 1;
		i_74_ = 1;
	    } else if (anInt9384 == 3) {
		i = 0;
		i_74_ = 1;
	    }
	    if (aClass368_9351 == Class368.aClass368_3859)
		OpenGL.glBlendFuncSeparate(770, 771, i, i_74_);
	    else if (aClass368_9351 == Class368.aClass368_3857)
		OpenGL.glBlendFuncSeparate(1, 1, i, i_74_);
	    else if (aClass368_9351 == Class368.aClass368_3858)
		OpenGL.glBlendFuncSeparate(774, 1, i, i_74_);
	    else if (aClass368_9351 == Class368.aClass368_3860)
		OpenGL.glBlendFuncSeparate(1, 0, i, i_74_);
	} else if (aClass368_9351 == Class368.aClass368_3859) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(770, 771);
	} else if (aClass368_9351 == Class368.aClass368_3857) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(1, 1);
	} else if (aClass368_9351 == Class368.aClass368_3858) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(774, 1);
	} else
	    OpenGL.glDisable(3042);
    }
    
    void method8548() {
	if (aBool9338)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method8573() {
	if (aBool9338)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method8685() {
	OpenGL.glTexEnvi(8960, 34162,
			 method10350(aClass356Array9313[anInt9308]));
    }
    
    public Class152 method2282() {
	int i = -1;
	if (((Class173_Sub1_Sub1) this).aString11307.indexOf("nvidia") != -1)
	    i = 4318;
	else if (((Class173_Sub1_Sub1) this).aString11307.indexOf("intel")
		 != -1)
	    i = 32902;
	else if (((Class173_Sub1_Sub1) this).aString11307.indexOf("ati") != -1)
	    i = 4098;
	return new Class152(i, method8450() ? "OpenGL FF" : "OpenGL",
			    ((Class173_Sub1_Sub1) this).anInt11298,
			    ((Class173_Sub1_Sub1) this).aString11285, 0L,
			    method8450());
    }
    
    final Interface36 method8549(boolean bool) {
	return new Class478_Sub1(this, bool);
    }
    
    final Interface41 method8476(boolean bool) {
	return new Class478_Sub2(this, Class169.aClass169_1933, bool);
    }
    
    void method8539() {
	OpenGL.glTexEnvi(8960, 34162,
			 method10350(aClass356Array9313[anInt9308]));
    }
    
    void method8722() {
	OpenGL.glTexEnvi(8960, 34161,
			 method10350(aClass356Array9312[anInt9308]));
    }
    
    public void method2331(int i, int i_75_, int[] is, int[] is_76_) {
	method10348(i, i_75_, is, is_76_);
    }
    
    public void method8552(Class344 class344) {
	Class345[] class345s = class344.aClass345Array3639;
	int i = 0;
	boolean bool = false;
	boolean bool_77_ = false;
	boolean bool_78_ = false;
	for (int i_79_ = 0; i_79_ < class345s.length; i_79_++) {
	    Class345 class345 = class345s[i_79_];
	    Class478_Sub1 class478_sub1
		= ((Class173_Sub1_Sub1) this).aClass478_Sub1Array11279[i_79_];
	    int i_80_ = 0;
	    int i_81_ = class478_sub1.method9120();
	    long l = class478_sub1.method5840();
	    class478_sub1.method5841();
	    for (int i_82_ = 0; i_82_ < class345.method4529(); i_82_++) {
		Class331 class331 = class345.method4530(i_82_);
		switch (class331.anInt3526) {
		case 2:
		    OpenGL.glNormalPointer(5126, i_81_, l + (long) i_80_);
		    bool_77_ = true;
		    break;
		case 6:
		    OpenGL.glVertexPointer(3, 5126, i_81_, l + (long) i_80_);
		    bool_78_ = true;
		    break;
		case 4:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_81_, l + (long) i_80_);
		    break;
		case 1:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_81_, l + (long) i_80_);
		    break;
		case 9:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_81_, l + (long) i_80_);
		    break;
		default:
		    break;
		case 10:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_81_, l + (long) i_80_);
		    break;
		case 8:
		    OpenGL.glColorPointer(4, 5121, i_81_, l + (long) i_80_);
		    bool = true;
		}
		i_80_ += class331.anInt3520;
	    }
	}
	if (((Class173_Sub1_Sub1) this).aBool11284 != bool_78_) {
	    if (bool_78_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    ((Class173_Sub1_Sub1) this).aBool11284 = bool_78_;
	}
	if (((Class173_Sub1_Sub1) this).aBool11275 != bool_77_) {
	    if (bool_77_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    ((Class173_Sub1_Sub1) this).aBool11275 = bool_77_;
	}
	if (((Class173_Sub1_Sub1) this).aBool11276 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    ((Class173_Sub1_Sub1) this).aBool11276 = bool;
	}
	if (((Class173_Sub1_Sub1) this).anInt11302 < i) {
	    for (int i_83_ = ((Class173_Sub1_Sub1) this).anInt11302; i_83_ < i;
		 i_83_++) {
		OpenGL.glClientActiveTexture(33984 + i_83_);
		OpenGL.glEnableClientState(32888);
	    }
	    ((Class173_Sub1_Sub1) this).anInt11302 = i;
	} else if (((Class173_Sub1_Sub1) this).anInt11302 > i) {
	    for (int i_84_ = i; i_84_ < ((Class173_Sub1_Sub1) this).anInt11302;
		 i_84_++) {
		OpenGL.glClientActiveTexture(33984 + i_84_);
		OpenGL.glDisableClientState(32888);
	    }
	    ((Class173_Sub1_Sub1) this).anInt11302 = i;
	}
    }
    
    void method8639() {
	if (aBool9343 && !aBool9297)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    final void method8562(Interface41 interface41, Class363 class363, int i,
			  int i_85_, int i_86_, int i_87_) {
	int i_88_;
	int i_89_;
	if (class363 == Class363.aClass363_3838) {
	    i_88_ = 1;
	    i_89_ = i_87_ * 2;
	} else if (class363 == Class363.aClass363_3836) {
	    i_88_ = 3;
	    i_89_ = i_87_ + 1;
	} else if (class363 == Class363.aClass363_3839) {
	    i_88_ = 4;
	    i_89_ = i_87_ * 3;
	} else if (class363 == Class363.aClass363_3837) {
	    i_88_ = 6;
	    i_89_ = i_87_ + 2;
	} else if (class363 == Class363.aClass363_3835) {
	    i_88_ = 5;
	    i_89_ = i_87_ + 2;
	} else {
	    i_88_ = 0;
	    i_89_ = i_87_;
	}
	Class169 class169 = interface41.method310();
	Class478_Sub2 class478_sub2 = (Class478_Sub2) interface41;
	class478_sub2.method5841();
	OpenGL.glDrawElements(i_88_, i_89_, method10360(class169),
			      (class478_sub2.method5840()
			       + (long) (i_86_ * (class169.anInt1942
						  * -1009481111))));
    }
    
    public boolean method8598() {
	return ((Class173_Sub1_Sub1) this).aBool11277;
    }
    
    public void method2281(boolean bool) {
	/* empty */
    }
    
    final synchronized void method10351(int i, int i_90_) {
	Class528_Sub17 class528_sub17 = new Class528_Sub17(i_90_);
	class528_sub17.aLong7107 = (long) i * -9171965245836510057L;
	((Class173_Sub1_Sub1) this).aClass688_11267.method8031(class528_sub17,
							       (byte) -19);
    }
    
    final synchronized void method10352(int i, int i_91_) {
	Class528_Sub17 class528_sub17 = new Class528_Sub17(i_91_);
	class528_sub17.aLong7107 = (long) i * -9171965245836510057L;
	((Class173_Sub1_Sub1) this).aClass688_11304.method8031(class528_sub17,
							       (byte) 76);
    }
    
    final synchronized void method10353(int i) {
	Class528_Sub17 class528_sub17 = new Class528_Sub17(i);
	((Class173_Sub1_Sub1) this).aClass688_11269.method8031(class528_sub17,
							       (byte) -97);
    }
    
    void method2154(int i, int i_92_) throws Exception_Sub5 {
	aClass163_Sub2_1999.method8917();
	if (anInterface22_1991 != null)
	    anInterface22_1991.method27((byte) -41);
    }
    
    final synchronized void method10354(long l) {
	Node node = new Node();
	node.aLong7107 = l * -9171965245836510057L;
	((Class173_Sub1_Sub1) this).aClass688_11286.method8031(node,
							       (byte) 3);
    }
    
    final synchronized void method10355(int i) {
	Node node = new Node();
	node.aLong7107 = (long) i * -9171965245836510057L;
	((Class173_Sub1_Sub1) this).aClass688_11292.method8031(node,
							       (byte) 45);
    }
    
    public long method2326(int i, int i_93_) {
	return method10348(i, i_93_, null, null);
    }
    
    static int method10356(Class149 class149) {
	switch (class149.anInt1685 * -78130535) {
	case 5:
	    return 6408;
	case 2:
	    return 6406;
	case 7:
	    return 6410;
	case 4:
	    return 6407;
	default:
	    throw new IllegalStateException();
	case 9:
	    return 6402;
	case 0:
	    return 6409;
	}
    }
    
    static int method10357(Class149 class149, Class169 class169) {
	if (class169 == Class169.aClass169_1935) {
	    switch (class149.anInt1685 * -78130535) {
	    case 5:
		return 6408;
	    default:
		throw new IllegalArgumentException();
	    case 2:
		return 6406;
	    case 4:
		return 6407;
	    case 0:
		return 6409;
	    case 7:
		return 6410;
	    case 6:
		return 33779;
	    case 3:
		return 33777;
	    }
	}
	if (class169 == Class169.aClass169_1933) {
	    switch (class149.anInt1685 * -78130535) {
	    case 5:
		return 32859;
	    case 2:
		return 32830;
	    default:
		throw new IllegalArgumentException();
	    case 7:
		return 36219;
	    case 4:
		return 32852;
	    case 9:
		return 33189;
	    case 0:
		return 32834;
	    }
	}
	if (class169 == Class169.aClass169_1937) {
	    switch (class149.anInt1685 * -78130535) {
	    default:
		throw new IllegalArgumentException();
	    case 9:
		return 33190;
	    }
	}
	if (class169 == Class169.aClass169_1938) {
	    switch (class149.anInt1685 * -78130535) {
	    default:
		throw new IllegalArgumentException();
	    case 9:
		return 33191;
	    }
	}
	if (class169 == Class169.aClass169_1939) {
	    switch (class149.anInt1685 * -78130535) {
	    case 2:
		return 34844;
	    case 5:
		return 34842;
	    case 7:
		return 34847;
	    case 0:
		return 34846;
	    default:
		throw new IllegalArgumentException();
	    case 4:
		return 34843;
	    }
	}
	if (class169 == Class169.aClass169_1940) {
	    switch (class149.anInt1685 * -78130535) {
	    default:
		throw new IllegalArgumentException();
	    case 0:
		return 34840;
	    case 4:
		return 34837;
	    case 5:
		return 34836;
	    case 2:
		return 34838;
	    case 7:
		return 34841;
	    }
	}
	throw new IllegalArgumentException();
    }
    
    Interface32 method8662(Class149 class149, int i, int i_94_, int i_95_,
			   boolean bool, byte[] is) {
	return new Class470_Sub1(this, class149, i, i_94_, i_95_, bool, is);
    }
    
    void method10358() {
	int i = 0;
	while (!((Class173_Sub1_Sub1) this).anOpenGL11271.method1162()) {
	    if (i++ > 5)
		throw new RuntimeException("");
	    Class511_Sub1.method9241(1000L);
	}
    }
    
    void method8565(int i) {
	if (!((Class173_Sub1_Sub1) this).aBool11296)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    public String method2169() {
	String string = "Caps: 4:";
	String string_96_ = ":";
	string = new StringBuilder().append(string).append(anInt9355).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).anInt11294).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append(anInt9235).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append(anInt9211).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11287 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9362 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11290 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11272 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11268 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11277 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9368 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11288 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9278 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (((Class173_Sub1_Sub1) this).aBool11289 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9279 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9364 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9225 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (aBool9370 ? 1 : 0).append
		     (string_96_).toString();
	string = new StringBuilder().append(string).append
		     (OpenGL.glGetString(35724).toLowerCase()).toString();
	return string;
    }
    
    public Class163_Sub1 method2478() {
	return new Class163_Sub1_Sub3_Sub2(this);
    }
    
    public Class152 method2535() {
	int i = -1;
	if (((Class173_Sub1_Sub1) this).aString11307.indexOf("nvidia") != -1)
	    i = 4318;
	else if (((Class173_Sub1_Sub1) this).aString11307.indexOf("intel")
		 != -1)
	    i = 32902;
	else if (((Class173_Sub1_Sub1) this).aString11307.indexOf("ati") != -1)
	    i = 4098;
	return new Class152(i, method8450() ? "OpenGL FF" : "OpenGL",
			    ((Class173_Sub1_Sub1) this).anInt11298,
			    ((Class173_Sub1_Sub1) this).aString11285, 0L,
			    method8450());
    }
    
    public void method2284() {
	OpenGL.glFinish();
    }
    
    public boolean method2531() {
	return false;
    }
    
    public void method2286() {
	OpenGL.glFinish();
    }
    
    void method2287() {
	super.method2199();
	if (((Class173_Sub1_Sub1) this).anOpenGL11271 != null) {
	    ((Class173_Sub1_Sub1) this).anOpenGL11271.method1163();
	    ((Class173_Sub1_Sub1) this).anOpenGL11271.release();
	    ((Class173_Sub1_Sub1) this).anOpenGL11271 = null;
	}
    }
    
    void method2288() {
	super.method2199();
	if (((Class173_Sub1_Sub1) this).anOpenGL11271 != null) {
	    ((Class173_Sub1_Sub1) this).anOpenGL11271.method1163();
	    ((Class173_Sub1_Sub1) this).anOpenGL11271.release();
	    ((Class173_Sub1_Sub1) this).anOpenGL11271 = null;
	}
    }
    
    public final synchronized void method2289(int i) {
	try {
	    method10358();
	} catch (Exception exception) {
	    return;
	}
	int i_97_ = 0;
	i &= 0x7fffffff;
	while (!((Class173_Sub1_Sub1) this).aClass688_11267
		    .method8040((byte) -88)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11267
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_97_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9230 -= class528_sub17.anInt10388 * 870949851;
	    if (i_97_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_97_, (((Class173_Sub1_Sub1) this)
						  .anIntArray11274), 0);
		i_97_ = 0;
	    }
	}
	if (i_97_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_97_, (((Class173_Sub1_Sub1) this)
					      .anIntArray11274), 0);
	    i_97_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11304
		    .method8040((byte) -16)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11304
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_97_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9229 -= class528_sub17.anInt10388 * 870949851;
	    if (i_97_ == 1000) {
		OpenGL.glDeleteTextures(i_97_, (((Class173_Sub1_Sub1) this)
						.anIntArray11274), 0);
		i_97_ = 0;
	    }
	}
	if (i_97_ > 0) {
	    OpenGL.glDeleteTextures(i_97_, (((Class173_Sub1_Sub1) this)
					    .anIntArray11274), 0);
	    i_97_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11269
		    .method8040((byte) -116)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11269
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_97_++]
		= class528_sub17.anInt10388 * 870949851;
	    if (i_97_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_97_,
					       (((Class173_Sub1_Sub1) this)
						.anIntArray11274),
					       0);
		i_97_ = 0;
	    }
	}
	if (i_97_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_97_, (((Class173_Sub1_Sub1) this)
						   .anIntArray11274), 0);
	    i_97_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11270
		    .method8040((byte) -21)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11270
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_97_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9287 -= class528_sub17.anInt10388 * 870949851;
	    if (i_97_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_97_,
						(((Class173_Sub1_Sub1) this)
						 .anIntArray11274),
						0);
		i_97_ = 0;
	    }
	}
	if (i_97_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_97_, (((Class173_Sub1_Sub1) this)
						    .anIntArray11274), 0);
	    boolean bool = false;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11293
		    .method8040((byte) -103)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11293
				       .method8032(-1490570711);
	    OpenGL.glDeleteLists((int) (class528_sub17.aLong7107
					* -4849232331708333273L),
				 class528_sub17.anInt10388 * 870949851);
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11292
		    .method8040((byte) -115)) {
	    Node node = ((Class173_Sub1_Sub1) this).aClass688_11292
				    .method8032(-1490570711);
	    OpenGL.glDeleteProgram((int) (node.aLong7107
					  * -4849232331708333273L));
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11286
		    .method8040((byte) -118)) {
	    Node node = ((Class173_Sub1_Sub1) this).aClass688_11286
				    .method8032(-1490570711);
	    OpenGL.glDeleteShader((int) (node.aLong7107
					 * -4849232331708333273L));
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11293
		    .method8040((byte) -71)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11293
				       .method8032(-1490570711);
	    OpenGL.glDeleteLists((int) (class528_sub17.aLong7107
					* -4849232331708333273L),
				 class528_sub17.anInt10388 * 870949851);
	}
	if (method2159() > 100663296
	    && (Class249.method3417(2064052964)
		> ((Class173_Sub1_Sub1) this).aLong11273 + 60000L)) {
	    System.gc();
	    ((Class173_Sub1_Sub1) this).aLong11273
		= Class249.method3417(2030851715);
	}
	super.method2158(i);
    }
    
    public final synchronized void method2260(int i) {
	try {
	    method10358();
	} catch (Exception exception) {
	    return;
	}
	int i_98_ = 0;
	i &= 0x7fffffff;
	while (!((Class173_Sub1_Sub1) this).aClass688_11267
		    .method8040((byte) -85)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11267
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_98_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9230 -= class528_sub17.anInt10388 * 870949851;
	    if (i_98_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_98_, (((Class173_Sub1_Sub1) this)
						  .anIntArray11274), 0);
		i_98_ = 0;
	    }
	}
	if (i_98_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_98_, (((Class173_Sub1_Sub1) this)
					      .anIntArray11274), 0);
	    i_98_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11304
		    .method8040((byte) -88)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11304
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_98_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9229 -= class528_sub17.anInt10388 * 870949851;
	    if (i_98_ == 1000) {
		OpenGL.glDeleteTextures(i_98_, (((Class173_Sub1_Sub1) this)
						.anIntArray11274), 0);
		i_98_ = 0;
	    }
	}
	if (i_98_ > 0) {
	    OpenGL.glDeleteTextures(i_98_, (((Class173_Sub1_Sub1) this)
					    .anIntArray11274), 0);
	    i_98_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11269
		    .method8040((byte) -102)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11269
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_98_++]
		= class528_sub17.anInt10388 * 870949851;
	    if (i_98_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_98_,
					       (((Class173_Sub1_Sub1) this)
						.anIntArray11274),
					       0);
		i_98_ = 0;
	    }
	}
	if (i_98_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_98_, (((Class173_Sub1_Sub1) this)
						   .anIntArray11274), 0);
	    i_98_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11270
		    .method8040((byte) -97)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11270
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_98_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9287 -= class528_sub17.anInt10388 * 870949851;
	    if (i_98_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_98_,
						(((Class173_Sub1_Sub1) this)
						 .anIntArray11274),
						0);
		i_98_ = 0;
	    }
	}
	if (i_98_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_98_, (((Class173_Sub1_Sub1) this)
						    .anIntArray11274), 0);
	    boolean bool = false;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11293
		    .method8040((byte) -47)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11293
				       .method8032(-1490570711);
	    OpenGL.glDeleteLists((int) (class528_sub17.aLong7107
					* -4849232331708333273L),
				 class528_sub17.anInt10388 * 870949851);
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11292
		    .method8040((byte) -37)) {
	    Node node = ((Class173_Sub1_Sub1) this).aClass688_11292
				    .method8032(-1490570711);
	    OpenGL.glDeleteProgram((int) (node.aLong7107
					  * -4849232331708333273L));
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11286
		    .method8040((byte) -89)) {
	    Node node = ((Class173_Sub1_Sub1) this).aClass688_11286
				    .method8032(-1490570711);
	    OpenGL.glDeleteShader((int) (node.aLong7107
					 * -4849232331708333273L));
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11293
		    .method8040((byte) -92)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11293
				       .method8032(-1490570711);
	    OpenGL.glDeleteLists((int) (class528_sub17.aLong7107
					* -4849232331708333273L),
				 class528_sub17.anInt10388 * 870949851);
	}
	if (method2159() > 100663296
	    && (Class249.method3417(2007808398)
		> ((Class173_Sub1_Sub1) this).aLong11273 + 60000L)) {
	    System.gc();
	    ((Class173_Sub1_Sub1) this).aLong11273
		= Class249.method3417(2093690159);
	}
	super.method2158(i);
    }
    
    void method8647() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = aFloat9299 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = aFloat9299 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = aFloat9299 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609,
			 ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = -aFloat9300 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = -aFloat9300 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = -aFloat9300 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609,
			 ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    void method8723(int i) {
	if (!((Class173_Sub1_Sub1) this).aBool11296)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    void method8554(Interface41 interface41) {
	((Class173_Sub1_Sub1) this).aClass478_Sub2_11280
	    = (Class478_Sub2) interface41;
	((Class173_Sub1_Sub1) this).aClass478_Sub2_11280.method5841();
    }
    
    public void method2307(boolean bool) {
	/* empty */
    }
    
    public void method2243(boolean bool) {
	/* empty */
    }
    
    public void method2437(boolean bool) {
	/* empty */
    }
    
    public void method2309(boolean bool) {
	/* empty */
    }
    
    void method8480() {
	if (aBool9386)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    public void method2352(long l) {
	if (l != 0L) {
	    if (OpenGL.glUnmapBufferARB(35051)) {
		/* empty */
	    }
	    OpenGL.glBindBufferARB(35051, 0);
	}
    }
    
    public boolean method2162() {
	return ((Class173_Sub1_Sub1) this).aBool11295;
    }
    
    public boolean method2314() {
	return ((Class173_Sub1_Sub1) this).aBool11295;
    }
    
    public boolean method2315() {
	if (((Class173_Sub1_Sub1) this).aBool11295
	    && (((Class173_Sub1_Sub1) this).aLongArray11278
		[((Class173_Sub1_Sub1) this).anInt11266]) != 0L)
	    return false;
	return true;
    }
    
    void method8488() {
	if (aBool9386)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    public Interface19 method2483(int i, int i_99_, Class149 class149,
				  Class169 class169, int i_100_) {
	return new Class485(this, class149, class169, i, i_99_, i_100_);
    }
    
    public int method2318() {
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    if ((((Class173_Sub1_Sub1) this).aLongArray11278
		 [((Class173_Sub1_Sub1) this).anInt11306])
		== 0L)
		return -1;
	    int i = OpenGL.glClientWaitSync((((Class173_Sub1_Sub1) this)
					     .aLongArray11278
					     [(((Class173_Sub1_Sub1) this)
					       .anInt11306)]),
					    0, 0);
	    if (i == 37149) {
		method2232();
		return -1;
	    }
	    return (i != 37147
		    ? (((Class173_Sub1_Sub1) this).anIntArray11291
		       [((Class173_Sub1_Sub1) this).anInt11306])
		    : -1);
	}
	return -1;
    }
    
    public void method2320(int i, int i_101_, int i_102_) {
	method2254();
	if (((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 == null)
	    method10349(i_101_, i_102_);
	if (((Class173_Sub1_Sub1) this).aClass151_11300 == null)
	    ((Class173_Sub1_Sub1) this).aClass151_11300
		= method2234(0, 0, aClass163_1998.method2074(),
			     aClass163_1998.method2070(), false);
	else
	    ((Class173_Sub1_Sub1) this).aClass151_11300.method1784
		(0, 0, aClass163_1998.method2074(),
		 aClass163_1998.method2070(), 0, 0);
	method2179(((Class173_Sub1_Sub1) this).aClass163_Sub1_11305,
		   -1541281399);
	method2268(1, -16777216);
	((Class173_Sub1_Sub1) this).aClass151_11300.method1774
	    (anInt2002 * 1354853215, anInt2007 * -2074272721,
	     anInt2006 * 857980141, anInt1990 * -649725419);
	OpenGL.glBindBufferARB(35051,
			       (((Class173_Sub1_Sub1) this).anIntArray11303
				[((Class173_Sub1_Sub1) this).anInt11266]));
	OpenGL.glReadPixelsub(0, 0, anInt1976 * 1361535585,
			      anInt2003 * 171311817, 32993, 5121, null, 0);
	OpenGL.glBindBufferARB(35051, 0);
	method2180(((Class173_Sub1_Sub1) this).aClass163_Sub1_11305,
		   676905259);
	((Class173_Sub1_Sub1) this).aLongArray11278
	    [((Class173_Sub1_Sub1) this).anInt11266]
	    = OpenGL.glFenceSync(37143, 0);
	((Class173_Sub1_Sub1) this).anIntArray11291
	    [((Class173_Sub1_Sub1) this).anInt11266]
	    = i;
	if (++((Class173_Sub1_Sub1) this).anInt11266 >= 3)
	    ((Class173_Sub1_Sub1) this).anInt11266 = 0;
	method2237();
    }
    
    public void method2446() {
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	    if (((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 != null) {
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305.method115();
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, (((Class173_Sub1_Sub1) this)
					  .anIntArray11303), 0);
	    for (int i = 0; i < 3; i++) {
		((Class173_Sub1_Sub1) this).anIntArray11303[i] = 0;
		if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		    OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this)
					.aLongArray11278[i]);
		    ((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
		}
	    }
	} else {
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11301 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    public void method2304() {
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this).aLongArray11278
				    [i]);
		((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    final void method8669(int i, Class357 class357, boolean bool,
			  boolean bool_103_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method10347(class357));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_103_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_103_ ? 769 : 768);
    }
    
    public long method2324(int i, int i_104_) {
	return method10348(i, i_104_, null, null);
    }
    
    public long method2488(int i, int i_105_) {
	return method10348(i, i_105_, null, null);
    }
    
    public boolean method8721() {
	return ((Class173_Sub1_Sub1) this).aBool11277;
    }
    
    public void method2329(long l) {
	if (l != 0L) {
	    if (OpenGL.glUnmapBufferARB(35051)) {
		/* empty */
	    }
	    OpenGL.glBindBufferARB(35051, 0);
	}
    }
    
    public void method2550(int i, int i_106_, int[] is, int[] is_107_) {
	method10348(i, i_106_, is, is_107_);
    }
    
    void method8684() {
	OpenGL.glTexEnvi(8960, 34161,
			 method10350(aClass356Array9312[anInt9308]));
    }
    
    public void method2332() {
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	    if (((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 != null) {
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305.method115();
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, (((Class173_Sub1_Sub1) this)
					  .anIntArray11303), 0);
	    for (int i = 0; i < 3; i++) {
		((Class173_Sub1_Sub1) this).anIntArray11303[i] = 0;
		if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		    OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this)
					.aLongArray11278[i]);
		    ((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
		}
	    }
	} else {
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11301 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    public void method2333() {
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	    if (((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 != null) {
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305.method115();
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, (((Class173_Sub1_Sub1) this)
					  .anIntArray11303), 0);
	    for (int i = 0; i < 3; i++) {
		((Class173_Sub1_Sub1) this).anIntArray11303[i] = 0;
		if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		    OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this)
					.aLongArray11278[i]);
		    ((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
		}
	    }
	} else {
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11301 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    public void method2400() {
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	    if (((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 != null) {
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305.method115();
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, (((Class173_Sub1_Sub1) this)
					  .anIntArray11303), 0);
	    for (int i = 0; i < 3; i++) {
		((Class173_Sub1_Sub1) this).anIntArray11303[i] = 0;
		if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		    OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this)
					.aLongArray11278[i]);
		    ((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
		}
	    }
	} else {
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11301 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    public void method2278() {
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	    if (((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 != null) {
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305.method115();
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, (((Class173_Sub1_Sub1) this)
					  .anIntArray11303), 0);
	    for (int i = 0; i < 3; i++) {
		((Class173_Sub1_Sub1) this).anIntArray11303[i] = 0;
		if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		    OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this)
					.aLongArray11278[i]);
		    ((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
		}
	    }
	} else {
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11301 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    public boolean method2188() {
	if (((Class173_Sub1_Sub1) this).aBool11295
	    && (((Class173_Sub1_Sub1) this).aLongArray11278
		[((Class173_Sub1_Sub1) this).anInt11266]) != 0L)
	    return false;
	return true;
    }
    
    Interface32 method8663(Class149 class149, int i, int i_108_, int i_109_,
			   boolean bool, byte[] is) {
	return new Class470_Sub1(this, class149, i, i_108_, i_109_, bool, is);
    }
    
    public void method2325(int i, int i_110_) {
	int i_111_ = 0;
	if ((i & 0x1) != 0) {
	    OpenGL.glClearColor((float) (i_110_ & 0xff0000) / 1.671168E7F,
				(float) (i_110_ & 0xff00) / 65280.0F,
				(float) (i_110_ & 0xff) / 255.0F,
				(float) (i_110_ >>> 24) / 255.0F);
	    i_111_ = 16384;
	}
	if ((i & 0x2) != 0) {
	    method8624(true);
	    i_111_ |= 0x100;
	}
	if ((i & 0x4) != 0)
	    i_111_ |= 0x400;
	OpenGL.glClear(i_111_);
    }
    
    void method8705() {
	/* empty */
    }
    
    public Class168 method2434(Class168 class168, Class168 class168_112_,
			       float f, Class168 class168_113_) {
	return f < 0.5F ? class168 : class168_112_;
    }
    
    final synchronized void method10359(int i, int i_114_) {
	Class528_Sub17 class528_sub17 = new Class528_Sub17(i_114_);
	class528_sub17.aLong7107 = (long) i * -9171965245836510057L;
	((Class173_Sub1_Sub1) this).aClass688_11270.method8031(class528_sub17,
							       (byte) 83);
    }
    
    public Interface21 method2184(int i, int i_115_) {
	return new Class485(this, Class149.aClass149_1683,
			    Class169.aClass169_1937, i, i_115_);
    }
    
    Interface32 method8660(Class149 class149, int i, int i_116_, int i_117_,
			   boolean bool, byte[] is) {
	return new Class470_Sub1(this, class149, i, i_116_, i_117_, bool, is);
    }
    
    void method8631() {
	if (aBool9353)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9354 & 0xff) / 255.0F);
	if (anInt9355 > 1) {
	    if (aByte9354 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    public Class163_Sub1 method2313() {
	return new Class163_Sub1_Sub3_Sub2(this);
    }
    
    final void method8672(int i, Class357 class357, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method10347(class357));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    public void method2469() {
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	    if (((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 != null) {
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305.method115();
		((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    }
	    OpenGL.glDeleteBuffersARB(3, (((Class173_Sub1_Sub1) this)
					  .anIntArray11303), 0);
	    for (int i = 0; i < 3; i++) {
		((Class173_Sub1_Sub1) this).anIntArray11303[i] = 0;
		if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		    OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this)
					.aLongArray11278[i]);
		    ((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
		}
	    }
	} else {
	    ((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11301 = null;
	    ((Class173_Sub1_Sub1) this).aClass151_11300 = null;
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    void method2495(int i, int i_118_) throws Exception_Sub5 {
	aClass163_Sub2_1999.method8917();
	if (anInterface22_1991 != null)
	    anInterface22_1991.method27((byte) 50);
    }
    
    static final int method10360(Class169 class169) {
	switch (class169.anInt1941 * 1984037941) {
	case 0:
	    return 5120;
	case 2:
	    return 5122;
	case 5:
	    return 5131;
	default:
	    return 5121;
	case 4:
	    return 5123;
	case 6:
	    return 5121;
	case 1:
	    return 5124;
	case 8:
	    return 5125;
	case 3:
	    return 5126;
	}
    }
    
    public Interface21 method2150(int i, int i_119_) {
	return new Class485(this, Class149.aClass149_1683,
			    Class169.aClass169_1937, i, i_119_);
    }
    
    void method8513() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass418_9381.aFloatArray4768, 0);
	int i;
	for (i = 0; i < anInt9333; i++) {
	    Class528_Sub12 class528_sub12 = aClass528_Sub12Array9210[i];
	    int i_120_ = class528_sub12.method9361((byte) 41);
	    int i_121_ = 16386 + i;
	    float f = class528_sub12.method9362(2070866581) / 255.0F;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[0]
		= (float) class528_sub12.method9366(1792622935);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[1]
		= (float) class528_sub12.method9360(-1375654801);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[2]
		= (float) class528_sub12.method9370(1221114533);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	    OpenGL.glLightfv(i_121_, 4611,
			     ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[0]
		= (float) (i_120_ >> 16 & 0xff) * f;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[1]
		= (float) (i_120_ >> 8 & 0xff) * f;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[2]
		= (float) (i_120_ & 0xff) * f;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	    OpenGL.glLightfv(i_121_, 4609,
			     ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
	    OpenGL.glLightf(i_121_, 4617,
			    (1.0F
			     / (float) (class528_sub12.method9357(772402716)
					* class528_sub12
					      .method9357(1759153408))));
	    OpenGL.glEnable(i_121_);
	}
	for (/**/; i < anInt9302; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    public Interface21 method2249(int i, int i_122_) {
	return new Class485(this, Class149.aClass149_1683,
			    Class169.aClass169_1937, i, i_122_);
    }
    
    public final void method8563(Class363 class363, int i, int i_123_,
				 int i_124_, int i_125_) {
	int i_126_;
	int i_127_;
	if (class363 == Class363.aClass363_3838) {
	    i_126_ = 1;
	    i_127_ = i_125_ * 2;
	} else if (class363 == Class363.aClass363_3836) {
	    i_126_ = 3;
	    i_127_ = i_125_ + 1;
	} else if (class363 == Class363.aClass363_3839) {
	    i_126_ = 4;
	    i_127_ = i_125_ * 3;
	} else if (class363 == Class363.aClass363_3837) {
	    i_126_ = 6;
	    i_127_ = i_125_ + 2;
	} else if (class363 == Class363.aClass363_3835) {
	    i_126_ = 5;
	    i_127_ = i_125_ + 2;
	} else {
	    i_126_ = 0;
	    i_127_ = i_125_;
	}
	Class169 class169
	    = ((Class173_Sub1_Sub1) this).aClass478_Sub2_11280.method310();
	OpenGL.glDrawElements(i_126_, i_127_, method10360(class169),
			      (((Class173_Sub1_Sub1) this)
				   .aClass478_Sub2_11280.method5840()
			       + (long) (i_124_ * (class169.anInt1942
						   * -1009481111))));
    }
    
    public Interface21 method2202(int i, int i_128_, int i_129_) {
	return new Class485(this, Class149.aClass149_1683,
			    Class169.aClass169_1937, i, i_128_, i_129_);
    }
    
    void method2493(int i, int i_130_) throws Exception_Sub5 {
	aClass163_Sub2_1999.method8917();
	if (anInterface22_1991 != null)
	    anInterface22_1991.method27((byte) -71);
    }
    
    void method8470(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    public Class168 method2436(Class168 class168, Class168 class168_131_,
			       float f, Class168 class168_132_) {
	return f < 0.5F ? class168 : class168_131_;
    }
    
    public void method2500() {
	if (aClass163_1998 != null) {
	    int i = aClass163_1998.method2074();
	    int i_133_ = aClass163_1998.method2070();
	    if (i > 0 || i_133_ > 0) {
		int i_134_ = anInt9275;
		int i_135_ = anInt9350;
		int i_136_ = anInt9258;
		int i_137_ = anInt9303;
		method2527();
		int i_138_ = anInt9272;
		int i_139_ = anInt9273;
		int i_140_ = anInt9365;
		int i_141_ = anInt9271;
		method2203();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method8495();
		method8661(false);
		method8505(false);
		method8502(false);
		method8624(false);
		method8526(null);
		method8586(1);
		method8479(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_133_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method2204(i_138_, i_140_, i_139_, i_141_);
		method2275(i_134_, i_135_, i_136_, i_137_);
	    }
	}
    }
    
    public Interface19 method2416(int i, int i_142_, Class149 class149,
				  Class169 class169, int i_143_) {
	return new Class485(this, class149, class169, i, i_142_, i_143_);
    }
    
    public boolean method2502() {
	return true;
    }
    
    void method8466() {
	OpenGL.glTexEnvi(8960, 34161,
			 method10350(aClass356Array9312[anInt9308]));
    }
    
    public boolean method8595() {
	return ((Class173_Sub1_Sub1) this).aBool11268;
    }
    
    public void method2321() {
	for (int i = 0; i < 3; i++) {
	    if (((Class173_Sub1_Sub1) this).aLongArray11278[i] != 0L) {
		OpenGL.glDeleteSync(((Class173_Sub1_Sub1) this).aLongArray11278
				    [i]);
		((Class173_Sub1_Sub1) this).aLongArray11278[i] = 0L;
	    }
	}
	((Class173_Sub1_Sub1) this).anInt11266 = 0;
	((Class173_Sub1_Sub1) this).anInt11306 = 0;
    }
    
    public boolean method8597() {
	return ((Class173_Sub1_Sub1) this).aBool11277;
    }
    
    public void method2319(int i, int i_144_, int i_145_) {
	method2254();
	if (((Class173_Sub1_Sub1) this).aClass163_Sub1_11305 == null)
	    method10349(i_144_, i_145_);
	if (((Class173_Sub1_Sub1) this).aClass151_11300 == null)
	    ((Class173_Sub1_Sub1) this).aClass151_11300
		= method2234(0, 0, aClass163_1998.method2074(),
			     aClass163_1998.method2070(), false);
	else
	    ((Class173_Sub1_Sub1) this).aClass151_11300.method1784
		(0, 0, aClass163_1998.method2074(),
		 aClass163_1998.method2070(), 0, 0);
	method2179(((Class173_Sub1_Sub1) this).aClass163_Sub1_11305,
		   -1096326487);
	method2268(1, -16777216);
	((Class173_Sub1_Sub1) this).aClass151_11300.method1774
	    (anInt2002 * 1354853215, anInt2007 * -2074272721,
	     anInt2006 * 857980141, anInt1990 * -649725419);
	OpenGL.glBindBufferARB(35051,
			       (((Class173_Sub1_Sub1) this).anIntArray11303
				[((Class173_Sub1_Sub1) this).anInt11266]));
	OpenGL.glReadPixelsub(0, 0, anInt1976 * 1361535585,
			      anInt2003 * 171311817, 32993, 5121, null, 0);
	OpenGL.glBindBufferARB(35051, 0);
	method2180(((Class173_Sub1_Sub1) this).aClass163_Sub1_11305,
		   -370227852);
	((Class173_Sub1_Sub1) this).aLongArray11278
	    [((Class173_Sub1_Sub1) this).anInt11266]
	    = OpenGL.glFenceSync(37143, 0);
	((Class173_Sub1_Sub1) this).anIntArray11291
	    [((Class173_Sub1_Sub1) this).anInt11266]
	    = i;
	if (++((Class173_Sub1_Sub1) this).anInt11266 >= 3)
	    ((Class173_Sub1_Sub1) this).anInt11266 = 0;
	method2237();
    }
    
    public boolean method8510(boolean bool) {
	return true;
    }
    
    public boolean method8600(boolean bool) {
	return true;
    }
    
    public Class258 method8603(String string) {
	byte[] is = method10361(string);
	if (is == null)
	    return null;
	Class275 class275 = method8455(is);
	return new Class258_Sub2(this, class275);
    }
    
    void method8698() {
	if (aBool9338)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    public void method8606(Class418 class418, Class418 class418_146_,
			   Class418 class418_147_) {
	OpenGL.glMatrixMode(5888);
	aClass418_9243.method4998(class418, class418_146_);
	OpenGL.glLoadMatrixf(aClass418_9243.aFloatArray4768, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class418_147_.aFloatArray4768, 0);
    }
    
    void method8467() {
	OpenGL.glDepthFunc(515);
	OpenGL.glEnable(2884);
	OpenGL.glCullFace(1029);
	OpenGL.glClearDepth(1.0F);
	OpenGL.glAlphaFunc(516, 0.0F);
	OpenGL.glPolygonMode(1028, 6914);
	if (aBool9362) {
	    method8470(anInt9355 > 1);
	    OpenGL.glDisable(32926);
	}
	for (int i = anInt9235 - 1; i >= 0; i--) {
	    OpenGL.glActiveTexture(33984 + i);
	    OpenGL.glTexEnvi(8960, 8704, 34160);
	    OpenGL.glTexEnvi(8960, 34161, 8448);
	    OpenGL.glTexEnvi(8960, 34178, 34166);
	    OpenGL.glTexEnvi(8960, 34162, 8448);
	    OpenGL.glTexEnvi(8960, 34186, 34166);
	}
	OpenGL.glTexEnvi(8960, 34186, 34168);
	OpenGL.glShadeModel(7425);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glColorMaterial(1028, 5634);
	OpenGL.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	for (int i = 0; i < 8; i++) {
	    int i_148_ = 16384 + i;
	    OpenGL.glLightfv(i_148_, 4608, fs, 0);
	    OpenGL.glLightf(i_148_, 4615, 0.0F);
	    OpenGL.glLightf(i_148_, 4616, 0.0F);
	}
	OpenGL.glFogf(2914, 0.95F);
	OpenGL.glFogi(2917, 9729);
	OpenGL.glHint(3156, 4353);
	((Class173_Sub1_Sub1) this).anOpenGL11271.setSwapInterval(0);
	super.method8668();
    }
    
    public float method8583() {
	return 0.0F;
    }
    
    void method8667() {
	if (aClass163_1998 != null) {
	    int i = anInt9282 + anInt9272;
	    int i_149_ = anInt9238 + aClass163_1998.method2070() - anInt9271;
	    int i_150_ = anInt9273 - anInt9272;
	    int i_151_ = anInt9271 - anInt9365;
	    if (i_150_ < 0)
		i_150_ = 0;
	    if (i_151_ < 0)
		i_151_ = 0;
	    OpenGL.glScissor(i, i_149_, i_150_, i_151_);
	}
    }
    
    void method8713(Interface41 interface41) {
	((Class173_Sub1_Sub1) this).aClass478_Sub2_11280
	    = (Class478_Sub2) interface41;
	((Class173_Sub1_Sub1) this).aClass478_Sub2_11280.method5841();
    }
    
    public Interface21 method2337(int i, int i_152_) {
	return new Class485(this, Class149.aClass149_1683,
			    Class169.aClass169_1937, i, i_152_);
    }
    
    void method8491() {
	if (aBool9386)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    void method8725() {
	if (aClass163_1998 != null)
	    OpenGL.glViewport(anInt9282 + anInt9275,
			      (anInt9238 + aClass163_1998.method2070()
			       - anInt9350 - anInt9303),
			      anInt9258, anInt9303);
	OpenGL.glDepthRange(aFloat9367, aFloat9265);
    }
    
    void method8509() {
	if (aBool9343 && !aBool9297)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    void method8635() {
	if (aBool9286)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    void method8697() {
	OpenGL.glDepthMask(aBool9284 && aBool9246);
    }
    
    void method8636() {
	OpenGL.glDepthMask(aBool9284 && aBool9246);
    }
    
    Interface43 method8525(Class149 class149, Class169 class169, int i,
			   int i_153_) {
	return new Class470_Sub3(this, class149, class169, i, i_153_);
    }
    
    public void method2328(long l) {
	if (l != 0L) {
	    if (OpenGL.glUnmapBufferARB(35051)) {
		/* empty */
	    }
	    OpenGL.glBindBufferARB(35051, 0);
	}
    }
    
    void method8640() {
	if (aBool9343 && !aBool9297)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    void method8641() {
	if (aBool9343 && !aBool9297)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    Interface32 method8664(Class149 class149, int i, int i_154_, int i_155_,
			   boolean bool, byte[] is) {
	return new Class470_Sub1(this, class149, i, i_154_, i_155_, bool, is);
    }
    
    void method8643() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = aFloat9298 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = aFloat9298 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = aFloat9298 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightModelfv(2899,
			      ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    void method8589() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = aFloat9298 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = aFloat9298 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = aFloat9298 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightModelfv(2899,
			      ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    boolean method8514(Class149 class149, Class169 class169) {
	return true;
    }
    
    void method8644() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = aFloat9298 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = aFloat9298 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = aFloat9298 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightModelfv(2899,
			      ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    void method8645() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = aFloat9299 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = aFloat9299 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = aFloat9299 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609,
			 ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = -aFloat9300 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = -aFloat9300 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = -aFloat9300 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609,
			 ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    void method8465() {
	if (aBool9286)
	    OpenGL.glEnable(2929);
	else
	    OpenGL.glDisable(2929);
    }
    
    public void method2511(boolean bool) {
	/* empty */
    }
    
    public boolean method2317() {
	return false;
    }
    
    void method8649() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass418_9381.aFloatArray4768, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9290, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9267, 0);
    }
    
    void method8711() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass418_9381.aFloatArray4768, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9290, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9267, 0);
    }
    
    void method8569() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass418_9381.aFloatArray4768, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9290, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9267, 0);
    }
    
    void method8619() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass418_9381.aFloatArray4768, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9290, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9267, 0);
    }
    
    void method8602() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass418_9381.aFloatArray4768, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9290, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9267, 0);
    }
    
    void method8650() {
	if (aBool9288) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    void method8651() {
	if (aBool9288) {
	    OpenGL.glEnable(16384);
	    OpenGL.glEnable(16385);
	} else {
	    OpenGL.glDisable(16384);
	    OpenGL.glDisable(16385);
	}
    }
    
    public void method2501() {
	if (aClass163_1998 != null) {
	    int i = aClass163_1998.method2074();
	    int i_156_ = aClass163_1998.method2070();
	    if (i > 0 || i_156_ > 0) {
		int i_157_ = anInt9275;
		int i_158_ = anInt9350;
		int i_159_ = anInt9258;
		int i_160_ = anInt9303;
		method2527();
		int i_161_ = anInt9272;
		int i_162_ = anInt9273;
		int i_163_ = anInt9365;
		int i_164_ = anInt9271;
		method2203();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		method8495();
		method8661(false);
		method8505(false);
		method8502(false);
		method8624(false);
		method8526(null);
		method8586(1);
		method8479(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glDisable(3553);
		OpenGL.glCopyPixels(0, 0, i, i_156_, 6144);
		OpenGL.glEnable(3553);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		method2204(i_161_, i_163_, i_162_, i_164_);
		method2275(i_157_, i_158_, i_159_, i_160_);
	    }
	}
    }
    
    void method8590() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass418_9381.aFloatArray4768, 0);
	int i;
	for (i = 0; i < anInt9333; i++) {
	    Class528_Sub12 class528_sub12 = aClass528_Sub12Array9210[i];
	    int i_165_ = class528_sub12.method9361((byte) -40);
	    int i_166_ = 16386 + i;
	    float f = class528_sub12.method9362(1927053650) / 255.0F;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[0]
		= (float) class528_sub12.method9366(2036217832);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[1]
		= (float) class528_sub12.method9360(-1375654801);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[2]
		= (float) class528_sub12.method9370(1221114533);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	    OpenGL.glLightfv(i_166_, 4611,
			     ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[0]
		= (float) (i_165_ >> 16 & 0xff) * f;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[1]
		= (float) (i_165_ >> 8 & 0xff) * f;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[2]
		= (float) (i_165_ & 0xff) * f;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	    OpenGL.glLightfv(i_166_, 4609,
			     ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
	    OpenGL.glLightf(i_166_, 4617,
			    (1.0F
			     / (float) (class528_sub12.method9357(1026156017)
					* class528_sub12
					      .method9357(874292994))));
	    OpenGL.glEnable(i_166_);
	}
	for (/**/; i < anInt9302; i++)
	    OpenGL.glDisable(16386 + i);
    }
    
    boolean method8653(Class149 class149, Class169 class169) {
	return true;
    }
    
    boolean method8654(Class149 class149, Class169 class169) {
	return true;
    }
    
    boolean method8690(Class149 class149, Class169 class169) {
	return true;
    }
    
    boolean method8655(Class149 class149, Class169 class169) {
	return true;
    }
    
    boolean method8678(Class149 class149, Class169 class169) {
	return aBool9368;
    }
    
    Interface34 method8656(Class149 class149, Class169 class169, int i,
			   int i_167_) {
	return method8525(class149, class169, i, i_167_);
    }
    
    Interface34 method8657(Class149 class149, int i, int i_168_, boolean bool,
			   byte[] is, int i_169_, int i_170_) {
	return new Class470_Sub3(this, class149, i, i_168_, bool, is, i_169_,
				 i_170_);
    }
    
    Interface34 method8658(Class149 class149, int i, int i_171_, boolean bool,
			   byte[] is, int i_172_, int i_173_) {
	return new Class470_Sub3(this, class149, i, i_171_, bool, is, i_172_,
				 i_173_);
    }
    
    public void method8605(Class418 class418, Class418 class418_174_,
			   Class418 class418_175_) {
	OpenGL.glMatrixMode(5888);
	aClass418_9243.method4998(class418, class418_174_);
	OpenGL.glLoadMatrixf(aClass418_9243.aFloatArray4768, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class418_175_.aFloatArray4768, 0);
    }
    
    Interface34 method8591(int i, int i_176_, boolean bool, int[] is,
			   int i_177_, int i_178_) {
	return new Class470_Sub3(this, i, i_176_, bool, is, i_177_, i_178_);
    }
    
    public final synchronized void method2158(int i) {
	try {
	    method10358();
	} catch (Exception exception) {
	    return;
	}
	int i_179_ = 0;
	i &= 0x7fffffff;
	while (!((Class173_Sub1_Sub1) this).aClass688_11267
		    .method8040((byte) -50)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11267
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_179_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9230 -= class528_sub17.anInt10388 * 870949851;
	    if (i_179_ == 1000) {
		OpenGL.glDeleteBuffersARB(i_179_, (((Class173_Sub1_Sub1) this)
						   .anIntArray11274), 0);
		i_179_ = 0;
	    }
	}
	if (i_179_ > 0) {
	    OpenGL.glDeleteBuffersARB(i_179_, (((Class173_Sub1_Sub1) this)
					       .anIntArray11274), 0);
	    i_179_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11304
		    .method8040((byte) -22)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11304
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_179_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9229 -= class528_sub17.anInt10388 * 870949851;
	    if (i_179_ == 1000) {
		OpenGL.glDeleteTextures(i_179_, (((Class173_Sub1_Sub1) this)
						 .anIntArray11274), 0);
		i_179_ = 0;
	    }
	}
	if (i_179_ > 0) {
	    OpenGL.glDeleteTextures(i_179_, (((Class173_Sub1_Sub1) this)
					     .anIntArray11274), 0);
	    i_179_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11269
		    .method8040((byte) -74)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11269
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_179_++]
		= class528_sub17.anInt10388 * 870949851;
	    if (i_179_ == 1000) {
		OpenGL.glDeleteFramebuffersEXT(i_179_,
					       (((Class173_Sub1_Sub1) this)
						.anIntArray11274),
					       0);
		i_179_ = 0;
	    }
	}
	if (i_179_ > 0) {
	    OpenGL.glDeleteFramebuffersEXT(i_179_, (((Class173_Sub1_Sub1) this)
						    .anIntArray11274), 0);
	    i_179_ = 0;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11270
		    .method8040((byte) -64)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11270
				       .method8032(-1490570711);
	    ((Class173_Sub1_Sub1) this).anIntArray11274[i_179_++]
		= (int) (class528_sub17.aLong7107 * -4849232331708333273L);
	    anInt9287 -= class528_sub17.anInt10388 * 870949851;
	    if (i_179_ == 1000) {
		OpenGL.glDeleteRenderbuffersEXT(i_179_,
						(((Class173_Sub1_Sub1) this)
						 .anIntArray11274),
						0);
		i_179_ = 0;
	    }
	}
	if (i_179_ > 0) {
	    OpenGL.glDeleteRenderbuffersEXT(i_179_,
					    (((Class173_Sub1_Sub1) this)
					     .anIntArray11274),
					    0);
	    boolean bool = false;
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11293
		    .method8040((byte) -31)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11293
				       .method8032(-1490570711);
	    OpenGL.glDeleteLists((int) (class528_sub17.aLong7107
					* -4849232331708333273L),
				 class528_sub17.anInt10388 * 870949851);
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11292
		    .method8040((byte) -89)) {
	    Node node = ((Class173_Sub1_Sub1) this).aClass688_11292
				    .method8032(-1490570711);
	    OpenGL.glDeleteProgram((int) (node.aLong7107
					  * -4849232331708333273L));
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11286
		    .method8040((byte) -87)) {
	    Node node = ((Class173_Sub1_Sub1) this).aClass688_11286
				    .method8032(-1490570711);
	    OpenGL.glDeleteShader((int) (node.aLong7107
					 * -4849232331708333273L));
	}
	while (!((Class173_Sub1_Sub1) this).aClass688_11293
		    .method8040((byte) -116)) {
	    Class528_Sub17 class528_sub17
		= (Class528_Sub17) ((Class173_Sub1_Sub1) this)
				       .aClass688_11293
				       .method8032(-1490570711);
	    OpenGL.glDeleteLists((int) (class528_sub17.aLong7107
					* -4849232331708333273L),
				 class528_sub17.anInt10388 * 870949851);
	}
	if (method2159() > 100663296
	    && (Class249.method3417(2083574310)
		> ((Class173_Sub1_Sub1) this).aLong11273 + 60000L)) {
	    System.gc();
	    ((Class173_Sub1_Sub1) this).aLong11273
		= Class249.method3417(1956545983);
	}
	super.method2158(i);
    }
    
    byte[] method10361(String string) {
	return method8454("gl", string);
    }
    
    public boolean method8599() {
	return ((Class173_Sub1_Sub1) this).aBool11277;
    }
    
    Interface32 method8535(Class149 class149, int i, int i_180_, int i_181_,
			   boolean bool, byte[] is) {
	return new Class470_Sub1(this, class149, i, i_180_, i_181_, bool, is);
    }
    
    void method8681() {
	OpenGL.glActiveTexture(33984 + anInt9308);
    }
    
    Interface32 method8541(Class149 class149, int i, int i_182_, int i_183_,
			   boolean bool, byte[] is) {
	return new Class470_Sub1(this, class149, i, i_182_, i_183_, bool, is);
    }
    
    void method8620() {
	aFloat9348 = aFloat9269 - (float) anInt9346;
	aFloat9347 = aFloat9348 - (float) anInt9236;
	if (aFloat9347 < aFloat9361)
	    aFloat9347 = aFloat9361;
	if (aBool9274) {
	    OpenGL.glFogf(2915, aFloat9347);
	    OpenGL.glFogf(2916, aFloat9348);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[0]
		= (float) (anInt9344 & 0xff0000) / 1.671168E7F;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[1]
		= (float) (anInt9344 & 0xff00) / 65280.0F;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[2]
		= (float) (anInt9344 & 0xff) / 255.0F;
	    OpenGL.glFogfv(2918, ((Class173_Sub1_Sub1) this).aFloatArray11297,
			   0);
	}
    }
    
    Interface43 method8665(Class149 class149, Class169 class169, int i,
			   int i_184_) {
	return new Class470_Sub3(this, class149, class169, i, i_184_);
    }
    
    Interface43 method8579(Class149 class149, Class169 class169, int i,
			   int i_185_) {
	return new Class470_Sub3(this, class149, class169, i, i_185_);
    }
    
    public void method8689() {
	int i = ((Class173_Sub1_Sub1) this).anIntArray11281[anInt9308];
	if (i != 0) {
	    ((Class173_Sub1_Sub1) this).anIntArray11281[anInt9308] = 0;
	    OpenGL.glBindTexture(i, 0);
	    OpenGL.glDisable(i);
	}
    }
    
    public final void method8719(Class363 class363, int i, int i_186_,
				 int i_187_, int i_188_) {
	int i_189_;
	int i_190_;
	if (class363 == Class363.aClass363_3838) {
	    i_189_ = 1;
	    i_190_ = i_188_ * 2;
	} else if (class363 == Class363.aClass363_3836) {
	    i_189_ = 3;
	    i_190_ = i_188_ + 1;
	} else if (class363 == Class363.aClass363_3839) {
	    i_189_ = 4;
	    i_190_ = i_188_ * 3;
	} else if (class363 == Class363.aClass363_3837) {
	    i_189_ = 6;
	    i_190_ = i_188_ + 2;
	} else if (class363 == Class363.aClass363_3835) {
	    i_189_ = 5;
	    i_190_ = i_188_ + 2;
	} else {
	    i_189_ = 0;
	    i_190_ = i_188_;
	}
	Class169 class169
	    = ((Class173_Sub1_Sub1) this).aClass478_Sub2_11280.method310();
	OpenGL.glDrawElements(i_189_, i_190_, method10360(class169),
			      (((Class173_Sub1_Sub1) this)
				   .aClass478_Sub2_11280.method5840()
			       + (long) (i_187_ * (class169.anInt1942
						   * -1009481111))));
    }
    
    final void method8670(int i, Class357 class357, boolean bool,
			  boolean bool_191_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method10347(class357));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_191_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_191_ ? 769 : 768);
    }
    
    final void method8671(int i, Class357 class357, boolean bool,
			  boolean bool_192_) {
	OpenGL.glTexEnvi(8960, 34176 + i, method10347(class357));
	if (bool)
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_192_ ? 771 : 770);
	else
	    OpenGL.glTexEnvi(8960, 34192 + i, bool_192_ ? 769 : 768);
    }
    
    public void method8585(int i, Interface36 interface36) {
	((Class173_Sub1_Sub1) this).aClass478_Sub1Array11279[i]
	    = (Class478_Sub1) interface36;
    }
    
    final void method8673(int i, Class357 class357, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method10347(class357));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    final void method8503(int i, Class357 class357, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method10347(class357));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    final void method8674(int i, Class357 class357, boolean bool) {
	OpenGL.glTexEnvi(8960, 34184 + i, method10347(class357));
	OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
    }
    
    final void method8679() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = (float) (anInt9314 & 0xff0000) / 1.671168E7F;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = (float) (anInt9314 & 0xff00) / 65280.0F;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = (float) (anInt9314 & 0xff) / 255.0F;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3]
	    = (float) (anInt9314 >>> 24) / 255.0F;
	OpenGL.glTexEnvfv(8960, 8705,
			  ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    void method8680() {
	OpenGL.glMatrixMode(5890);
	if (aClass358Array9231[anInt9308] != Class358.aClass358_3822)
	    OpenGL.glLoadMatrixf
		(aClass418Array9310[anInt9308]
		     .method4994(((Class173_Sub1_Sub1) this).aFloatArray11265),
		 0);
	else
	    OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    void method8567() {
	OpenGL.glActiveTexture(33984 + anInt9308);
    }
    
    public final void method8561(Class363 class363, int i, int i_193_) {
	int i_194_;
	int i_195_;
	if (class363 == Class363.aClass363_3838) {
	    i_194_ = 1;
	    i_195_ = i_193_ * 2;
	} else if (class363 == Class363.aClass363_3836) {
	    i_194_ = 3;
	    i_195_ = i_193_ + 1;
	} else if (class363 == Class363.aClass363_3839) {
	    i_194_ = 4;
	    i_195_ = i_193_ * 3;
	} else if (class363 == Class363.aClass363_3837) {
	    i_194_ = 6;
	    i_195_ = i_193_ + 2;
	} else if (class363 == Class363.aClass363_3835) {
	    i_194_ = 5;
	    i_195_ = i_193_ + 2;
	} else {
	    i_194_ = 0;
	    i_195_ = i_193_;
	}
	OpenGL.glDrawArrays(i_194_, i, i_195_);
    }
    
    void method8515() {
	OpenGL.glActiveTexture(33984 + anInt9308);
    }
    
    public int method2427() {
	if (((Class173_Sub1_Sub1) this).aBool11295) {
	    if ((((Class173_Sub1_Sub1) this).aLongArray11278
		 [((Class173_Sub1_Sub1) this).anInt11306])
		== 0L)
		return -1;
	    int i = OpenGL.glClientWaitSync((((Class173_Sub1_Sub1) this)
					     .aLongArray11278
					     [(((Class173_Sub1_Sub1) this)
					       .anInt11306)]),
					    0, 0);
	    if (i == 37149) {
		method2232();
		return -1;
	    }
	    return (i != 37147
		    ? (((Class173_Sub1_Sub1) this).anIntArray11291
		       [((Class173_Sub1_Sub1) this).anInt11306])
		    : -1);
	}
	return -1;
    }
    
    void method8648() {
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadMatrixf(aClass418_9381.aFloatArray4768, 0);
	OpenGL.glLightfv(16384, 4611, aFloatArray9290, 0);
	OpenGL.glLightfv(16385, 4611, aFloatArray9267, 0);
    }
    
    void method8511() {
	OpenGL.glTexEnvi(8960, 34161,
			 method10350(aClass356Array9312[anInt9308]));
    }
    
    public Interface19 method2336(int i, int i_196_, Class149 class149,
				  Class169 class169, int i_197_) {
	return new Class485(this, class149, class169, i, i_196_, i_197_);
    }
    
    void method8568(int i) {
	OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0,
			   (i & 0x8) != 0);
    }
    
    Class344 method8543(Class345[] class345s) {
	return new Class344_Sub2(class345s);
    }
    
    void method8625() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = aFloat9298 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = aFloat9298 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = aFloat9298 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightModelfv(2899,
			      ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    void method8692() {
	if (aBool9353)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9354 & 0xff) / 255.0F);
	if (anInt9355 > 1) {
	    if (aByte9354 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    Interface34 method8683(int i, int i_198_, boolean bool, int[] is,
			   int i_199_, int i_200_) {
	return new Class470_Sub3(this, i, i_198_, bool, is, i_199_, i_200_);
    }
    
    void method8638() {
	if (aBool9370) {
	    int i = 0;
	    int i_201_ = 0;
	    if (anInt9384 == 0) {
		i = 0;
		i_201_ = 0;
	    } else if (anInt9384 == 1) {
		i = 1;
		i_201_ = 0;
	    } else if (anInt9384 == 2) {
		i = 1;
		i_201_ = 1;
	    } else if (anInt9384 == 3) {
		i = 0;
		i_201_ = 1;
	    }
	    if (aClass368_9351 == Class368.aClass368_3859)
		OpenGL.glBlendFuncSeparate(770, 771, i, i_201_);
	    else if (aClass368_9351 == Class368.aClass368_3857)
		OpenGL.glBlendFuncSeparate(1, 1, i, i_201_);
	    else if (aClass368_9351 == Class368.aClass368_3858)
		OpenGL.glBlendFuncSeparate(774, 1, i, i_201_);
	    else if (aClass368_9351 == Class368.aClass368_3860)
		OpenGL.glBlendFuncSeparate(1, 0, i, i_201_);
	} else if (aClass368_9351 == Class368.aClass368_3859) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(770, 771);
	} else if (aClass368_9351 == Class368.aClass368_3857) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(1, 1);
	} else if (aClass368_9351 == Class368.aClass368_3858) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(774, 1);
	} else
	    OpenGL.glDisable(3042);
    }
    
    void method8694() {
	if (aBool9370) {
	    int i = 0;
	    int i_202_ = 0;
	    if (anInt9384 == 0) {
		i = 0;
		i_202_ = 0;
	    } else if (anInt9384 == 1) {
		i = 1;
		i_202_ = 0;
	    } else if (anInt9384 == 2) {
		i = 1;
		i_202_ = 1;
	    } else if (anInt9384 == 3) {
		i = 0;
		i_202_ = 1;
	    }
	    if (aClass368_9351 == Class368.aClass368_3859)
		OpenGL.glBlendFuncSeparate(770, 771, i, i_202_);
	    else if (aClass368_9351 == Class368.aClass368_3857)
		OpenGL.glBlendFuncSeparate(1, 1, i, i_202_);
	    else if (aClass368_9351 == Class368.aClass368_3858)
		OpenGL.glBlendFuncSeparate(774, 1, i, i_202_);
	    else if (aClass368_9351 == Class368.aClass368_3860)
		OpenGL.glBlendFuncSeparate(1, 0, i, i_202_);
	} else if (aClass368_9351 == Class368.aClass368_3859) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(770, 771);
	} else if (aClass368_9351 == Class368.aClass368_3857) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(1, 1);
	} else if (aClass368_9351 == Class368.aClass368_3858) {
	    OpenGL.glEnable(3042);
	    OpenGL.glBlendFunc(774, 1);
	} else
	    OpenGL.glDisable(3042);
    }
    
    void method8456() {
	if (aBool9353)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9354 & 0xff) / 255.0F);
	if (anInt9355 > 1) {
	    if (aByte9354 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    void method8675() {
	OpenGL.glActiveTexture(33984 + anInt9308);
    }
    
    void method8688() {
	if (aBool9338)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    void method8691() {
	if (aBool9353)
	    OpenGL.glEnable(3008);
	else
	    OpenGL.glDisable(3008);
	OpenGL.glAlphaFunc(516, (float) (aByte9354 & 0xff) / 255.0F);
	if (anInt9355 > 1) {
	    if (aByte9354 != 0)
		OpenGL.glEnable(32926);
	    else
		OpenGL.glDisable(32926);
	}
    }
    
    void method8700() {
	aFloat9348 = aFloat9269 - (float) anInt9346;
	aFloat9347 = aFloat9348 - (float) anInt9236;
	if (aFloat9347 < aFloat9361)
	    aFloat9347 = aFloat9361;
	if (aBool9274) {
	    OpenGL.glFogf(2915, aFloat9347);
	    OpenGL.glFogf(2916, aFloat9348);
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[0]
		= (float) (anInt9344 & 0xff0000) / 1.671168E7F;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[1]
		= (float) (anInt9344 & 0xff00) / 65280.0F;
	    ((Class173_Sub1_Sub1) this).aFloatArray11297[2]
		= (float) (anInt9344 & 0xff) / 255.0F;
	    OpenGL.glFogfv(2918, ((Class173_Sub1_Sub1) this).aFloatArray11297,
			   0);
	}
    }
    
    void method8615() {
	if (aBool9249 && aBool9342 && anInt9236 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    void method8701() {
	if (aBool9249 && aBool9342 && anInt9236 >= 0)
	    OpenGL.glEnable(2912);
	else
	    OpenGL.glDisable(2912);
    }
    
    void method8703(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    void method8704(boolean bool) {
	if (bool)
	    OpenGL.glEnable(32925);
	else
	    OpenGL.glDisable(32925);
    }
    
    final Interface41 method8617(boolean bool) {
	return new Class478_Sub2(this, Class169.aClass169_1933, bool);
    }
    
    final Interface41 method8706(boolean bool) {
	return new Class478_Sub2(this, Class169.aClass169_1933, bool);
    }
    
    final Interface41 method8707(boolean bool) {
	return new Class478_Sub2(this, Class169.aClass169_1933, bool);
    }
    
    public Class168 method2433(Class168 class168, Class168 class168_203_,
			       float f, Class168 class168_204_) {
	return f < 0.5F ? class168 : class168_203_;
    }
    
    final Interface36 method8676(boolean bool) {
	return new Class478_Sub1(this, bool);
    }
    
    Class344 method8686(Class345[] class345s) {
	return new Class344_Sub2(class345s);
    }
    
    Class344 method8708(Class345[] class345s) {
	return new Class344_Sub2(class345s);
    }
    
    Class344 method8709(Class345[] class345s) {
	return new Class344_Sub2(class345s);
    }
    
    public void method8710(Class344 class344) {
	Class345[] class345s = class344.aClass345Array3639;
	int i = 0;
	boolean bool = false;
	boolean bool_205_ = false;
	boolean bool_206_ = false;
	for (int i_207_ = 0; i_207_ < class345s.length; i_207_++) {
	    Class345 class345 = class345s[i_207_];
	    Class478_Sub1 class478_sub1
		= ((Class173_Sub1_Sub1) this).aClass478_Sub1Array11279[i_207_];
	    int i_208_ = 0;
	    int i_209_ = class478_sub1.method9120();
	    long l = class478_sub1.method5840();
	    class478_sub1.method5841();
	    for (int i_210_ = 0; i_210_ < class345.method4529(); i_210_++) {
		Class331 class331 = class345.method4530(i_210_);
		switch (class331.anInt3526) {
		case 2:
		    OpenGL.glNormalPointer(5126, i_209_, l + (long) i_208_);
		    bool_205_ = true;
		    break;
		case 6:
		    OpenGL.glVertexPointer(3, 5126, i_209_, l + (long) i_208_);
		    bool_206_ = true;
		    break;
		case 4:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(1, 5126, i_209_,
					     l + (long) i_208_);
		    break;
		case 1:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(4, 5126, i_209_,
					     l + (long) i_208_);
		    break;
		case 9:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(2, 5126, i_209_,
					     l + (long) i_208_);
		    break;
		default:
		    break;
		case 10:
		    OpenGL.glClientActiveTexture(33984 + i++);
		    OpenGL.glTexCoordPointer(3, 5126, i_209_,
					     l + (long) i_208_);
		    break;
		case 8:
		    OpenGL.glColorPointer(4, 5121, i_209_, l + (long) i_208_);
		    bool = true;
		}
		i_208_ += class331.anInt3520;
	    }
	}
	if (((Class173_Sub1_Sub1) this).aBool11284 != bool_206_) {
	    if (bool_206_)
		OpenGL.glEnableClientState(32884);
	    else
		OpenGL.glDisableClientState(32884);
	    ((Class173_Sub1_Sub1) this).aBool11284 = bool_206_;
	}
	if (((Class173_Sub1_Sub1) this).aBool11275 != bool_205_) {
	    if (bool_205_)
		OpenGL.glEnableClientState(32885);
	    else
		OpenGL.glDisableClientState(32885);
	    ((Class173_Sub1_Sub1) this).aBool11275 = bool_205_;
	}
	if (((Class173_Sub1_Sub1) this).aBool11276 != bool) {
	    if (bool)
		OpenGL.glEnableClientState(32886);
	    else
		OpenGL.glDisableClientState(32886);
	    ((Class173_Sub1_Sub1) this).aBool11276 = bool;
	}
	if (((Class173_Sub1_Sub1) this).anInt11302 < i) {
	    for (int i_211_ = ((Class173_Sub1_Sub1) this).anInt11302;
		 i_211_ < i; i_211_++) {
		OpenGL.glClientActiveTexture(33984 + i_211_);
		OpenGL.glEnableClientState(32888);
	    }
	    ((Class173_Sub1_Sub1) this).anInt11302 = i;
	} else if (((Class173_Sub1_Sub1) this).anInt11302 > i) {
	    for (int i_212_ = i;
		 i_212_ < ((Class173_Sub1_Sub1) this).anInt11302; i_212_++) {
		OpenGL.glClientActiveTexture(33984 + i_212_);
		OpenGL.glDisableClientState(32888);
	    }
	    ((Class173_Sub1_Sub1) this).anInt11302 = i;
	}
    }
    
    void method8696() {
	if (aBool9338)
	    OpenGL.glEnable(3042);
	else
	    OpenGL.glDisable(3042);
    }
    
    public boolean method2316() {
	if (((Class173_Sub1_Sub1) this).aBool11295
	    && (((Class173_Sub1_Sub1) this).aLongArray11278
		[((Class173_Sub1_Sub1) this).anInt11266]) != 0L)
	    return false;
	return true;
    }
    
    void method8702(Interface41 interface41) {
	((Class173_Sub1_Sub1) this).aClass478_Sub2_11280
	    = (Class478_Sub2) interface41;
	((Class173_Sub1_Sub1) this).aClass478_Sub2_11280.method5841();
    }
    
    public final void method8714(Class363 class363, int i, int i_213_) {
	int i_214_;
	int i_215_;
	if (class363 == Class363.aClass363_3838) {
	    i_214_ = 1;
	    i_215_ = i_213_ * 2;
	} else if (class363 == Class363.aClass363_3836) {
	    i_214_ = 3;
	    i_215_ = i_213_ + 1;
	} else if (class363 == Class363.aClass363_3839) {
	    i_214_ = 4;
	    i_215_ = i_213_ * 3;
	} else if (class363 == Class363.aClass363_3837) {
	    i_214_ = 6;
	    i_215_ = i_213_ + 2;
	} else if (class363 == Class363.aClass363_3835) {
	    i_214_ = 5;
	    i_215_ = i_213_ + 2;
	} else {
	    i_214_ = 0;
	    i_215_ = i_213_;
	}
	OpenGL.glDrawArrays(i_214_, i, i_215_);
    }
    
    final void method8715(Interface41 interface41, Class363 class363, int i,
			  int i_216_, int i_217_, int i_218_) {
	int i_219_;
	int i_220_;
	if (class363 == Class363.aClass363_3838) {
	    i_219_ = 1;
	    i_220_ = i_218_ * 2;
	} else if (class363 == Class363.aClass363_3836) {
	    i_219_ = 3;
	    i_220_ = i_218_ + 1;
	} else if (class363 == Class363.aClass363_3839) {
	    i_219_ = 4;
	    i_220_ = i_218_ * 3;
	} else if (class363 == Class363.aClass363_3837) {
	    i_219_ = 6;
	    i_220_ = i_218_ + 2;
	} else if (class363 == Class363.aClass363_3835) {
	    i_219_ = 5;
	    i_220_ = i_218_ + 2;
	} else {
	    i_219_ = 0;
	    i_220_ = i_218_;
	}
	Class169 class169 = interface41.method310();
	Class478_Sub2 class478_sub2 = (Class478_Sub2) interface41;
	class478_sub2.method5841();
	OpenGL.glDrawElements(i_219_, i_220_, method10360(class169),
			      (class478_sub2.method5840()
			       + (long) (i_217_ * (class169.anInt1942
						   * -1009481111))));
    }
    
    final void method8716(Interface41 interface41, Class363 class363, int i,
			  int i_221_, int i_222_, int i_223_) {
	int i_224_;
	int i_225_;
	if (class363 == Class363.aClass363_3838) {
	    i_224_ = 1;
	    i_225_ = i_223_ * 2;
	} else if (class363 == Class363.aClass363_3836) {
	    i_224_ = 3;
	    i_225_ = i_223_ + 1;
	} else if (class363 == Class363.aClass363_3839) {
	    i_224_ = 4;
	    i_225_ = i_223_ * 3;
	} else if (class363 == Class363.aClass363_3837) {
	    i_224_ = 6;
	    i_225_ = i_223_ + 2;
	} else if (class363 == Class363.aClass363_3835) {
	    i_224_ = 5;
	    i_225_ = i_223_ + 2;
	} else {
	    i_224_ = 0;
	    i_225_ = i_223_;
	}
	Class169 class169 = interface41.method310();
	Class478_Sub2 class478_sub2 = (Class478_Sub2) interface41;
	class478_sub2.method5841();
	OpenGL.glDrawElements(i_224_, i_225_, method10360(class169),
			      (class478_sub2.method5840()
			       + (long) (i_222_ * (class169.anInt1942
						   * -1009481111))));
    }
    
    public final void method8717(Class363 class363, int i, int i_226_,
				 int i_227_, int i_228_) {
	int i_229_;
	int i_230_;
	if (class363 == Class363.aClass363_3838) {
	    i_229_ = 1;
	    i_230_ = i_228_ * 2;
	} else if (class363 == Class363.aClass363_3836) {
	    i_229_ = 3;
	    i_230_ = i_228_ + 1;
	} else if (class363 == Class363.aClass363_3839) {
	    i_229_ = 4;
	    i_230_ = i_228_ * 3;
	} else if (class363 == Class363.aClass363_3837) {
	    i_229_ = 6;
	    i_230_ = i_228_ + 2;
	} else if (class363 == Class363.aClass363_3835) {
	    i_229_ = 5;
	    i_230_ = i_228_ + 2;
	} else {
	    i_229_ = 0;
	    i_230_ = i_228_;
	}
	Class169 class169
	    = ((Class173_Sub1_Sub1) this).aClass478_Sub2_11280.method310();
	OpenGL.glDrawElements(i_229_, i_230_, method10360(class169),
			      (((Class173_Sub1_Sub1) this)
				   .aClass478_Sub2_11280.method5840()
			       + (long) (i_227_ * (class169.anInt1942
						   * -1009481111))));
    }
    
    public final void method8718(Class363 class363, int i, int i_231_,
				 int i_232_, int i_233_) {
	int i_234_;
	int i_235_;
	if (class363 == Class363.aClass363_3838) {
	    i_234_ = 1;
	    i_235_ = i_233_ * 2;
	} else if (class363 == Class363.aClass363_3836) {
	    i_234_ = 3;
	    i_235_ = i_233_ + 1;
	} else if (class363 == Class363.aClass363_3839) {
	    i_234_ = 4;
	    i_235_ = i_233_ * 3;
	} else if (class363 == Class363.aClass363_3837) {
	    i_234_ = 6;
	    i_235_ = i_233_ + 2;
	} else if (class363 == Class363.aClass363_3835) {
	    i_234_ = 5;
	    i_235_ = i_233_ + 2;
	} else {
	    i_234_ = 0;
	    i_235_ = i_233_;
	}
	Class169 class169
	    = ((Class173_Sub1_Sub1) this).aClass478_Sub2_11280.method310();
	OpenGL.glDrawElements(i_234_, i_235_, method10360(class169),
			      (((Class173_Sub1_Sub1) this)
				   .aClass478_Sub2_11280.method5840()
			       + (long) (i_232_ * (class169.anInt1942
						   * -1009481111))));
    }
    
    public void method8699(Class418 class418) {
	float[] fs = class418.aFloatArray4768;
	fs[1] = -fs[1];
	fs[5] = -fs[5];
	fs[9] = -fs[9];
	fs[13] = -fs[13];
    }
    
    public Interface19 method2482(int i, int i_236_, Class149 class149,
				  Class169 class169, int i_237_) {
	return new Class485(this, class149, class169, i, i_236_, i_237_);
    }
    
    void method8724(int i) {
	if (!((Class173_Sub1_Sub1) this).aBool11296)
	    OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
    }
    
    public Interface19 method2362(int i, int i_238_, Class149 class149,
				  Class169 class169, int i_239_) {
	return new Class485(this, class149, class169, i, i_238_, i_239_);
    }
    
    void method8576() {
	if (aClass163_1998 != null)
	    OpenGL.glViewport(anInt9282 + anInt9275,
			      (anInt9238 + aClass163_1998.method2070()
			       - anInt9350 - anInt9303),
			      anInt9258, anInt9303);
	OpenGL.glDepthRange(aFloat9367, aFloat9265);
    }
    
    void method8555() {
	if (aClass163_1998 != null)
	    OpenGL.glViewport(anInt9282 + anInt9275,
			      (anInt9238 + aClass163_1998.method2070()
			       - anInt9350 - anInt9303),
			      anInt9258, anInt9303);
	OpenGL.glDepthRange(aFloat9367, aFloat9265);
    }
    
    Class163_Sub2 method2253(Canvas canvas, int i, int i_240_) {
	return new Class163_Sub2_Sub2_Sub2(this, canvas);
    }
    
    void method8637() {
	/* empty */
    }
    
    void method2199() {
	super.method2199();
	if (((Class173_Sub1_Sub1) this).anOpenGL11271 != null) {
	    ((Class173_Sub1_Sub1) this).anOpenGL11271.method1163();
	    ((Class173_Sub1_Sub1) this).anOpenGL11271.release();
	    ((Class173_Sub1_Sub1) this).anOpenGL11271 = null;
	}
    }
    
    byte[] method10362(String string) {
	return method8454("gl", string);
    }
    
    void method8485() {
	if (aBool9386)
	    OpenGL.glEnable(3089);
	else
	    OpenGL.glDisable(3089);
    }
    
    void method8570() {
	if (aClass163_1998 != null) {
	    int i = anInt9282 + anInt9272;
	    int i_241_ = anInt9238 + aClass163_1998.method2070() - anInt9271;
	    int i_242_ = anInt9273 - anInt9272;
	    int i_243_ = anInt9271 - anInt9365;
	    if (i_242_ < 0)
		i_242_ = 0;
	    if (i_243_ < 0)
		i_243_ = 0;
	    OpenGL.glScissor(i, i_241_, i_242_, i_243_);
	}
    }
    
    public void method8553(int i, Interface36 interface36) {
	((Class173_Sub1_Sub1) this).aClass478_Sub1Array11279[i]
	    = (Class478_Sub1) interface36;
    }
    
    void method8504() {
	OpenGL.glDepthMask(aBool9284 && aBool9246);
    }
    
    public void method8693(Class418 class418, Class418 class418_244_,
			   Class418 class418_245_) {
	OpenGL.glMatrixMode(5888);
	aClass418_9243.method4998(class418, class418_244_);
	OpenGL.glLoadMatrixf(aClass418_9243.aFloatArray4768, 0);
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadMatrixf(class418_245_.aFloatArray4768, 0);
    }
    
    void method8507() {
	if (aBool9343 && !aBool9297)
	    OpenGL.glEnable(2896);
	else
	    OpenGL.glDisable(2896);
    }
    
    void method8508() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = aFloat9298 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = aFloat9298 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = aFloat9298 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightModelfv(2899,
			      ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    void method8720() {
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = aFloat9299 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = aFloat9299 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = aFloat9299 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightfv(16384, 4609,
			 ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
	((Class173_Sub1_Sub1) this).aFloatArray11297[0]
	    = -aFloat9300 * aFloat9295;
	((Class173_Sub1_Sub1) this).aFloatArray11297[1]
	    = -aFloat9300 * aFloat9296;
	((Class173_Sub1_Sub1) this).aFloatArray11297[2]
	    = -aFloat9300 * aFloat9251;
	((Class173_Sub1_Sub1) this).aFloatArray11297[3] = 1.0F;
	OpenGL.glLightfv(16385, 4609,
			 ((Class173_Sub1_Sub1) this).aFloatArray11297, 0);
    }
    
    Interface39 method8523(int i, boolean bool, int[][] is) {
	return new Class470_Sub2(this, i, bool, is);
    }
    
    final Interface41 method8574(boolean bool) {
	return new Class478_Sub2(this, Class169.aClass169_1933, bool);
    }
}
