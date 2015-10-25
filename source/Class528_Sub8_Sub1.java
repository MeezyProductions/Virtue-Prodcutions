/* Class528_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class528_Sub8_Sub1 extends Class528_Sub8
{
    Class120_Sub4[] aClass120_Sub4Array11443;
    static final int anInt11444 = 256;
    static float aFloat11445;
    static float aFloat11446;
    static final String aString11447
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
    static final String aString11448
	= "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
    static float aFloat11449 = 0.25F;
    static final String aString11450
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";
    static final String aString11451
	= "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
    Class163_Sub1_Sub1 aClass163_Sub1_Sub1_11452;
    Class163_Sub1_Sub1 aClass163_Sub1_Sub1_11453;
    Class120_Sub4 aClass120_Sub4_11454;
    Class133 aClass133_11455;
    int anInt11456;
    int anInt11457;
    int anInt11458;
    int anInt11459;
    Class133 aClass133_11460;
    Class133 aClass133_11461;
    Class120_Sub4 aClass120_Sub4_11462;
    Class133 aClass133_11463;
    
    void method9318() {
	((Class528_Sub8_Sub1) this).anInt11459 = -1;
	((Class528_Sub8_Sub1) this).anInt11458 = -1;
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 = null;
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4_11454 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4_11462 = null;
	((Class528_Sub8_Sub1) this).aClass133_11463 = null;
	((Class528_Sub8_Sub1) this).aClass133_11455 = null;
	((Class528_Sub8_Sub1) this).aClass133_11461 = null;
	((Class528_Sub8_Sub1) this).aClass133_11460 = null;
    }
    
    boolean method10417() {
	return (((Class173_Sub2)
		 ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268).aBool9506
		&& ((Class173_Sub2)
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268).aBool9583
		&& ((Class173_Sub2) (((Class528_Sub8_Sub1) this)
				     .aClass173_Sub2_10268)).aBool9420);
    }
    
    boolean method9304() {
	return ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453 != null;
    }
    
    Class169 method9321() {
	return Class169.aClass169_1939;
    }
    
    boolean method9323() {
	return ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453 != null;
    }
    
    void method9313(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_0_, int i_1_, int i_2_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 != null) {
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452,
		 -787399981);
	    int i_3_ = ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11456,
					-104371721);
	    int i_4_ = ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11457,
					-19215565);
	    int i_5_ = 0;
	    while (i_3_ > 256 || i_4_ > 256) {
		OpenGL.glViewport(0, 0, i_3_, i_4_);
		((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452
		    .method8898
		    (0, ((Class528_Sub8_Sub1) this)
			    .aClass120_Sub4Array11443[i_5_].method8263(0));
		if (i_5_ == 0) {
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
			.method8775(class120_sub4);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F,
					(float) ((((Class528_Sub8_Sub1) this)
						  .anInt11457)
						 - i_1_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_2_),
					(float) ((((Class528_Sub8_Sub1) this)
						  .anInt11457)
						 - i_1_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_2_),
					(float) (((Class528_Sub8_Sub1) this)
						 .anInt11457));
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F,
					(float) (((Class528_Sub8_Sub1) this)
						 .anInt11457));
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775
			(((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
			 [i_5_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_3_ > 256)
		    i_3_ >>= 1;
		if (i_4_ > 256)
		    i_4_ >>= 1;
		i_5_++;
	    }
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452,
		 -1086036406);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775
		(((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
		 [i_5_ - 1]);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -890184770);
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		.method10327(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_6_
		= (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11455)
		   .anInt1621);
	    OpenGL.glUseProgram(i_6_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_6_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_6_, "params"),
			       aFloat11446, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
		.method8775(class120_sub4);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -1291619116);
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		.method10327(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_7_
		= (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11463)
		   .anInt1621);
	    OpenGL.glUseProgram(i_7_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_7_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_7_, "params"),
			       aFloat11446, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) ((Class528_Sub8_Sub1) this).anInt11456,
				0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) ((Class528_Sub8_Sub1) this).anInt11456,
				(float) (((Class528_Sub8_Sub1) this)
					 .anInt11457));
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) (((Class528_Sub8_Sub1) this)
					       .anInt11457));
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method10327(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11454);
	int i_8_ = (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11460)
		    .anInt1621);
	OpenGL.glUseProgram(i_8_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_8_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_8_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method10327(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11462);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_8_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
	    (((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
	     1954290346);
	int i_9_ = (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11461)
		    .anInt1621);
	OpenGL.glUseProgram(i_9_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_9_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_9_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_9_, "params"),
			   aFloat11449, aFloat11445, 0.0F);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11454);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(class120_sub4);
    }
    
    static {
	aFloat11445 = 1.0F;
	aFloat11446 = 1.0F;
    }
    
    void method9299(int i) {
	OpenGL.glUseProgram(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775(null);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(0);
    }
    
    Class169 method9303() {
	return Class169.aClass169_1939;
    }
    
    int method9312() {
	return 0;
    }
    
    void method9315(int i) {
	OpenGL.glUseProgram(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775(null);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(0);
    }
    
    void method9297(int i, int i_10_) {
	((Class528_Sub8_Sub1) this).anInt11456 = i;
	((Class528_Sub8_Sub1) this).anInt11457 = i_10_;
	int i_11_ = ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11456,
				     -825468028);
	int i_12_ = ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11457,
				     -728485541);
	if (((Class528_Sub8_Sub1) this).anInt11458 != i_11_
	    || ((Class528_Sub8_Sub1) this).anInt11459 != i_12_) {
	    if (((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 != null) {
		for (int i_13_ = 0;
		     i_13_ < (((Class528_Sub8_Sub1) this)
			      .aClass120_Sub4Array11443).length;
		     i_13_++)
		    ((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
			[i_13_].method1549();
		((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 = null;
	    }
	    if (i_11_ > 256 || i_12_ > 256) {
		int i_14_ = i_11_;
		int i_15_ = i_12_;
		int i_16_ = 0;
		while (i_14_ > 256 || i_15_ > 256) {
		    if (i_14_ > 256)
			i_14_ >>= 1;
		    if (i_15_ > 256)
			i_15_ >>= 1;
		    i_16_++;
		}
		if (((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452
		    == null)
		    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452
			= new Class163_Sub1_Sub1(((Class528_Sub8_Sub1) this)
						 .aClass173_Sub2_10268);
		((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
		    = new Class120_Sub4[i_16_];
		i_14_ = i_11_;
		i_15_ = i_12_;
		i_16_ = 0;
		while (i_14_ > 256 || i_15_ > 256) {
		    ((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
			[i_16_++]
			= new Class120_Sub4((((Class528_Sub8_Sub1) this)
					     .aClass173_Sub2_10268),
					    3553, Class149.aClass149_1676,
					    method9303(), i_14_, i_15_);
		    if (i_14_ > 256)
			i_14_ >>= 1;
		    if (i_15_ > 256)
			i_15_ >>= 1;
		}
	    } else
		((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452 = null;
	    ((Class528_Sub8_Sub1) this).anInt11458 = i_11_;
	    ((Class528_Sub8_Sub1) this).anInt11459 = i_12_;
	}
    }
    
    boolean method9306() {
	if ((((Class173_Sub2) ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268)
	     .aBool9506)
	    && ((Class173_Sub2)
		((Class528_Sub8_Sub1) this).aClass173_Sub2_10268).aBool9583
	    && ((Class173_Sub2)
		((Class528_Sub8_Sub1) this).aClass173_Sub2_10268).aBool9420) {
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		= new Class163_Sub1_Sub1(((Class528_Sub8_Sub1) this)
					 .aClass173_Sub2_10268);
	    ((Class528_Sub8_Sub1) this).aClass120_Sub4_11454
		= new Class120_Sub4((((Class528_Sub8_Sub1) this)
				     .aClass173_Sub2_10268),
				    3553, Class149.aClass149_1676,
				    method9303(), 256, 256);
	    ((Class528_Sub8_Sub1) this).aClass120_Sub4_11454.method8259(false,
									false);
	    ((Class528_Sub8_Sub1) this).aClass120_Sub4_11462
		= new Class120_Sub4((((Class528_Sub8_Sub1) this)
				     .aClass173_Sub2_10268),
				    3553, Class149.aClass149_1676,
				    method9303(), 256, 256);
	    ((Class528_Sub8_Sub1) this).aClass120_Sub4_11462.method8259(false,
									false);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -1317579835);
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method8898
		(0, ((Class528_Sub8_Sub1) this).aClass120_Sub4_11454
			.method8263(0));
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method8898
		(1, ((Class528_Sub8_Sub1) this).aClass120_Sub4_11462
			.method8263(0));
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		.method10327(0);
	    if (!((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		     .method8897()) {
		((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
		    (((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		     1089929341);
		return false;
	    }
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -1966256802);
	    ((Class528_Sub8_Sub1) this).aClass133_11463
		= (Class133.method1634
		   (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
		    (new Class125[]
		     { Class125.method1612
		       (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    ((Class528_Sub8_Sub1) this).aClass133_11455
		= (Class133.method1634
		   (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
		    (new Class125[]
		     { Class125.method1612
		       (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
			35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    ((Class528_Sub8_Sub1) this).aClass133_11461
		= (Class133.method1634
		   (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
		    (new Class125[]
		     { Class125.method1612
		       (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    ((Class528_Sub8_Sub1) this).aClass133_11460
		= (Class133.method1634
		   (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
		    (new Class125[]
		     { Class125.method1612
		       (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
			35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (((Class528_Sub8_Sub1) this).aClass133_11455 != null
		    && ((Class528_Sub8_Sub1) this).aClass133_11463 != null
		    && ((Class528_Sub8_Sub1) this).aClass133_11461 != null
		    && ((Class528_Sub8_Sub1) this).aClass133_11460 != null);
	}
	return false;
    }
    
    boolean method9302() {
	return ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453 != null;
    }
    
    void method9296() {
	((Class528_Sub8_Sub1) this).anInt11459 = -1;
	((Class528_Sub8_Sub1) this).anInt11458 = -1;
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 = null;
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4_11454 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4_11462 = null;
	((Class528_Sub8_Sub1) this).aClass133_11463 = null;
	((Class528_Sub8_Sub1) this).aClass133_11455 = null;
	((Class528_Sub8_Sub1) this).aClass133_11461 = null;
	((Class528_Sub8_Sub1) this).aClass133_11460 = null;
    }
    
    void method9294() {
	((Class528_Sub8_Sub1) this).anInt11459 = -1;
	((Class528_Sub8_Sub1) this).anInt11458 = -1;
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 = null;
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4_11454 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4_11462 = null;
	((Class528_Sub8_Sub1) this).aClass133_11463 = null;
	((Class528_Sub8_Sub1) this).aClass133_11455 = null;
	((Class528_Sub8_Sub1) this).aClass133_11461 = null;
	((Class528_Sub8_Sub1) this).aClass133_11460 = null;
    }
    
    void method9310(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_17_, int i_18_, int i_19_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 != null) {
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452,
		 -439087303);
	    int i_20_
		= ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11456,
				   -1751439357);
	    int i_21_
		= ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11457,
				   -1469427272);
	    int i_22_ = 0;
	    while (i_20_ > 256 || i_21_ > 256) {
		OpenGL.glViewport(0, 0, i_20_, i_21_);
		((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452
		    .method8898
		    (0, ((Class528_Sub8_Sub1) this)
			    .aClass120_Sub4Array11443[i_22_].method8263(0));
		if (i_22_ == 0) {
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
			.method8775(class120_sub4);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F,
					(float) ((((Class528_Sub8_Sub1) this)
						  .anInt11457)
						 - i_18_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_19_),
					(float) ((((Class528_Sub8_Sub1) this)
						  .anInt11457)
						 - i_18_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_19_),
					(float) (((Class528_Sub8_Sub1) this)
						 .anInt11457));
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F,
					(float) (((Class528_Sub8_Sub1) this)
						 .anInt11457));
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775
			(((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
			 [i_22_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_20_ > 256)
		    i_20_ >>= 1;
		if (i_21_ > 256)
		    i_21_ >>= 1;
		i_22_++;
	    }
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452,
		 2074015372);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775
		(((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
		 [i_22_ - 1]);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -999881323);
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		.method10327(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_23_
		= (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11455)
		   .anInt1621);
	    OpenGL.glUseProgram(i_23_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_23_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_23_, "params"),
			       aFloat11446, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
		.method8775(class120_sub4);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -635031065);
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		.method10327(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_24_
		= (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11463)
		   .anInt1621);
	    OpenGL.glUseProgram(i_24_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_24_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_24_, "params"),
			       aFloat11446, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) ((Class528_Sub8_Sub1) this).anInt11456,
				0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) ((Class528_Sub8_Sub1) this).anInt11456,
				(float) (((Class528_Sub8_Sub1) this)
					 .anInt11457));
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) (((Class528_Sub8_Sub1) this)
					       .anInt11457));
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method10327(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11454);
	int i_25_ = (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11460)
		     .anInt1621);
	OpenGL.glUseProgram(i_25_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_25_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_25_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method10327(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11462);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_25_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
	    (((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453, 746134357);
	int i_26_ = (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11461)
		     .anInt1621);
	OpenGL.glUseProgram(i_26_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_26_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_26_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_26_, "params"),
			   aFloat11449, aFloat11445, 0.0F);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11454);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(class120_sub4);
    }
    
    Class528_Sub8_Sub1(Class173_Sub2 class173_sub2) {
	super(class173_sub2);
    }
    
    void method9309(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_27_, int i_28_, int i_29_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 != null) {
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452,
		 242769793);
	    int i_30_
		= ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11456,
				   -353846065);
	    int i_31_
		= ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11457,
				   -4030083);
	    int i_32_ = 0;
	    while (i_30_ > 256 || i_31_ > 256) {
		OpenGL.glViewport(0, 0, i_30_, i_31_);
		((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452
		    .method8898
		    (0, ((Class528_Sub8_Sub1) this)
			    .aClass120_Sub4Array11443[i_32_].method8263(0));
		if (i_32_ == 0) {
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
			.method8775(class120_sub4);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F,
					(float) ((((Class528_Sub8_Sub1) this)
						  .anInt11457)
						 - i_28_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_29_),
					(float) ((((Class528_Sub8_Sub1) this)
						  .anInt11457)
						 - i_28_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_29_),
					(float) (((Class528_Sub8_Sub1) this)
						 .anInt11457));
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F,
					(float) (((Class528_Sub8_Sub1) this)
						 .anInt11457));
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775
			(((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
			 [i_32_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_30_ > 256)
		    i_30_ >>= 1;
		if (i_31_ > 256)
		    i_31_ >>= 1;
		i_32_++;
	    }
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452,
		 1186533725);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775
		(((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
		 [i_32_ - 1]);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -532141137);
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		.method10327(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_33_
		= (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11455)
		   .anInt1621);
	    OpenGL.glUseProgram(i_33_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_33_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_33_, "params"),
			       aFloat11446, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
		.method8775(class120_sub4);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -1921056158);
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		.method10327(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_34_
		= (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11463)
		   .anInt1621);
	    OpenGL.glUseProgram(i_34_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_34_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_34_, "params"),
			       aFloat11446, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) ((Class528_Sub8_Sub1) this).anInt11456,
				0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) ((Class528_Sub8_Sub1) this).anInt11456,
				(float) (((Class528_Sub8_Sub1) this)
					 .anInt11457));
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) (((Class528_Sub8_Sub1) this)
					       .anInt11457));
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method10327(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11454);
	int i_35_ = (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11460)
		     .anInt1621);
	OpenGL.glUseProgram(i_35_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_35_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_35_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method10327(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11462);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_35_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
	    (((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
	     1392843536);
	int i_36_ = (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11461)
		     .anInt1621);
	OpenGL.glUseProgram(i_36_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_36_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_36_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_36_, "params"),
			   aFloat11449, aFloat11445, 0.0F);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11454);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(class120_sub4);
    }
    
    void method9317(int i) {
	OpenGL.glUseProgram(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775(null);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(0);
    }
    
    void method9314(int i) {
	OpenGL.glUseProgram(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775(null);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(0);
    }
    
    void method9316(int i) {
	OpenGL.glUseProgram(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775(null);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(0);
    }
    
    boolean method9305() {
	return false;
    }
    
    void method9308() {
	((Class528_Sub8_Sub1) this).anInt11459 = -1;
	((Class528_Sub8_Sub1) this).anInt11458 = -1;
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 = null;
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4_11454 = null;
	((Class528_Sub8_Sub1) this).aClass120_Sub4_11462 = null;
	((Class528_Sub8_Sub1) this).aClass133_11463 = null;
	((Class528_Sub8_Sub1) this).aClass133_11455 = null;
	((Class528_Sub8_Sub1) this).aClass133_11461 = null;
	((Class528_Sub8_Sub1) this).aClass133_11460 = null;
    }
    
    Class169 method9319() {
	return Class169.aClass169_1939;
    }
    
    boolean method9293() {
	return false;
    }
    
    void method9298(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_37_, int i_38_, int i_39_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 != null) {
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452,
		 -165741687);
	    int i_40_
		= ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11456,
				   266834683);
	    int i_41_
		= ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11457,
				   -1248839242);
	    int i_42_ = 0;
	    while (i_40_ > 256 || i_41_ > 256) {
		OpenGL.glViewport(0, 0, i_40_, i_41_);
		((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452
		    .method8898
		    (0, ((Class528_Sub8_Sub1) this)
			    .aClass120_Sub4Array11443[i_42_].method8263(0));
		if (i_42_ == 0) {
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
			.method8775(class120_sub4);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F,
					(float) ((((Class528_Sub8_Sub1) this)
						  .anInt11457)
						 - i_38_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_39_),
					(float) ((((Class528_Sub8_Sub1) this)
						  .anInt11457)
						 - i_38_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_39_),
					(float) (((Class528_Sub8_Sub1) this)
						 .anInt11457));
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F,
					(float) (((Class528_Sub8_Sub1) this)
						 .anInt11457));
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775
			(((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
			 [i_42_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_40_ > 256)
		    i_40_ >>= 1;
		if (i_41_ > 256)
		    i_41_ >>= 1;
		i_42_++;
	    }
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452,
		 1182647958);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8775
		(((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
		 [i_42_ - 1]);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -604137224);
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		.method10327(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_43_
		= (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11455)
		   .anInt1621);
	    OpenGL.glUseProgram(i_43_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_43_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_43_, "params"),
			       aFloat11446, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
		.method8775(class120_sub4);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -541200326);
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		.method10327(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_44_
		= (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11463)
		   .anInt1621);
	    OpenGL.glUseProgram(i_44_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_44_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_44_, "params"),
			       aFloat11446, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) ((Class528_Sub8_Sub1) this).anInt11456,
				0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) ((Class528_Sub8_Sub1) this).anInt11456,
				(float) (((Class528_Sub8_Sub1) this)
					 .anInt11457));
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) (((Class528_Sub8_Sub1) this)
					       .anInt11457));
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method10327(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11454);
	int i_45_ = (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11460)
		     .anInt1621);
	OpenGL.glUseProgram(i_45_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_45_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_45_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method10327(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11462);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_45_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
	    (((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
	     -1643148979);
	int i_46_ = (((Class133) ((Class528_Sub8_Sub1) this).aClass133_11461)
		     .anInt1621);
	OpenGL.glUseProgram(i_46_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_46_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_46_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_46_, "params"),
			   aFloat11449, aFloat11445, 0.0F);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(1);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(((Class528_Sub8_Sub1) this).aClass120_Sub4_11454);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub1) this).aClass173_Sub2_10268
	    .method8775(class120_sub4);
    }
    
    boolean method9322() {
	return ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453 != null;
    }
    
    boolean method9295() {
	if ((((Class173_Sub2) ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268)
	     .aBool9506)
	    && ((Class173_Sub2)
		((Class528_Sub8_Sub1) this).aClass173_Sub2_10268).aBool9583
	    && ((Class173_Sub2)
		((Class528_Sub8_Sub1) this).aClass173_Sub2_10268).aBool9420) {
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		= new Class163_Sub1_Sub1(((Class528_Sub8_Sub1) this)
					 .aClass173_Sub2_10268);
	    ((Class528_Sub8_Sub1) this).aClass120_Sub4_11454
		= new Class120_Sub4((((Class528_Sub8_Sub1) this)
				     .aClass173_Sub2_10268),
				    3553, Class149.aClass149_1676,
				    method9303(), 256, 256);
	    ((Class528_Sub8_Sub1) this).aClass120_Sub4_11454.method8259(false,
									false);
	    ((Class528_Sub8_Sub1) this).aClass120_Sub4_11462
		= new Class120_Sub4((((Class528_Sub8_Sub1) this)
				     .aClass173_Sub2_10268),
				    3553, Class149.aClass149_1676,
				    method9303(), 256, 256);
	    ((Class528_Sub8_Sub1) this).aClass120_Sub4_11462.method8259(false,
									false);
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2179
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 -1865483741);
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method8898
		(0, ((Class528_Sub8_Sub1) this).aClass120_Sub4_11454
			.method8263(0));
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453.method8898
		(1, ((Class528_Sub8_Sub1) this).aClass120_Sub4_11462
			.method8263(0));
	    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		.method10327(0);
	    if (!((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453
		     .method8897()) {
		((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
		    (((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		     -1569820718);
		return false;
	    }
	    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268.method2180
		(((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11453,
		 1513274848);
	    ((Class528_Sub8_Sub1) this).aClass133_11463
		= (Class133.method1634
		   (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
		    (new Class125[]
		     { Class125.method1612
		       (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    ((Class528_Sub8_Sub1) this).aClass133_11455
		= (Class133.method1634
		   (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
		    (new Class125[]
		     { Class125.method1612
		       (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
			35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    ((Class528_Sub8_Sub1) this).aClass133_11461
		= (Class133.method1634
		   (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
		    (new Class125[]
		     { Class125.method1612
		       (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    ((Class528_Sub8_Sub1) this).aClass133_11460
		= (Class133.method1634
		   (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
		    (new Class125[]
		     { Class125.method1612
		       (((Class528_Sub8_Sub1) this).aClass173_Sub2_10268,
			35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (((Class528_Sub8_Sub1) this).aClass133_11455 != null
		    && ((Class528_Sub8_Sub1) this).aClass133_11463 != null
		    && ((Class528_Sub8_Sub1) this).aClass133_11461 != null
		    && ((Class528_Sub8_Sub1) this).aClass133_11460 != null);
	}
	return false;
    }
    
    void method9324(int i, int i_47_) {
	((Class528_Sub8_Sub1) this).anInt11456 = i;
	((Class528_Sub8_Sub1) this).anInt11457 = i_47_;
	int i_48_ = ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11456,
				     289316717);
	int i_49_ = ItemStyleOverride.method531(((Class528_Sub8_Sub1) this).anInt11457,
				     914771740);
	if (((Class528_Sub8_Sub1) this).anInt11458 != i_48_
	    || ((Class528_Sub8_Sub1) this).anInt11459 != i_49_) {
	    if (((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 != null) {
		for (int i_50_ = 0;
		     i_50_ < (((Class528_Sub8_Sub1) this)
			      .aClass120_Sub4Array11443).length;
		     i_50_++)
		    ((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
			[i_50_].method1549();
		((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443 = null;
	    }
	    if (i_48_ > 256 || i_49_ > 256) {
		int i_51_ = i_48_;
		int i_52_ = i_49_;
		int i_53_ = 0;
		while (i_51_ > 256 || i_52_ > 256) {
		    if (i_51_ > 256)
			i_51_ >>= 1;
		    if (i_52_ > 256)
			i_52_ >>= 1;
		    i_53_++;
		}
		if (((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452
		    == null)
		    ((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452
			= new Class163_Sub1_Sub1(((Class528_Sub8_Sub1) this)
						 .aClass173_Sub2_10268);
		((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
		    = new Class120_Sub4[i_53_];
		i_51_ = i_48_;
		i_52_ = i_49_;
		i_53_ = 0;
		while (i_51_ > 256 || i_52_ > 256) {
		    ((Class528_Sub8_Sub1) this).aClass120_Sub4Array11443
			[i_53_++]
			= new Class120_Sub4((((Class528_Sub8_Sub1) this)
					     .aClass173_Sub2_10268),
					    3553, Class149.aClass149_1676,
					    method9303(), i_51_, i_52_);
		    if (i_51_ > 256)
			i_51_ >>= 1;
		    if (i_52_ > 256)
			i_52_ >>= 1;
		}
	    } else
		((Class528_Sub8_Sub1) this).aClass163_Sub1_Sub1_11452 = null;
	    ((Class528_Sub8_Sub1) this).anInt11458 = i_48_;
	    ((Class528_Sub8_Sub1) this).anInt11459 = i_49_;
	}
    }
    
    int method9325() {
	return 0;
    }
    
    int method9326() {
	return 0;
    }
    
    boolean method10418() {
	return (((Class173_Sub2)
		 ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268).aBool9506
		&& ((Class173_Sub2)
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268).aBool9583
		&& ((Class173_Sub2) (((Class528_Sub8_Sub1) this)
				     .aClass173_Sub2_10268)).aBool9420);
    }
    
    boolean method10419() {
	return (((Class173_Sub2)
		 ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268).aBool9506
		&& ((Class173_Sub2)
		    ((Class528_Sub8_Sub1) this).aClass173_Sub2_10268).aBool9583
		&& ((Class173_Sub2) (((Class528_Sub8_Sub1) this)
				     .aClass173_Sub2_10268)).aBool9420);
    }
}
