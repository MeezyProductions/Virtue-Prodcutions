/* Class528_Sub8_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class528_Sub8_Sub3 extends Class528_Sub8
{
    static float aFloat11497;
    static float aFloat11498 = 1.0F;
    static float aFloat11499;
    static float aFloat11500;
    static float aFloat11501;
    static final String aString11502
	= "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";
    Class133 aClass133_11503;
    
    Class528_Sub8_Sub3(Class173_Sub2 class173_sub2) {
	super(class173_sub2);
    }
    
    Class169 method9303() {
	return Class169.aClass169_1935;
    }
    
    boolean method10452() {
	return (((Class173_Sub2)
		 ((Class528_Sub8_Sub3) this).aClass173_Sub2_10268)
		.aBool9583);
    }
    
    boolean method9295() {
	if (((Class173_Sub2) ((Class528_Sub8_Sub3) this).aClass173_Sub2_10268)
	    .aBool9583) {
	    ((Class528_Sub8_Sub3) this).aClass133_11503
		= (Class133.method1634
		   (((Class528_Sub8_Sub3) this).aClass173_Sub2_10268,
		    (new Class125[]
		     { Class125.method1612
		       (((Class528_Sub8_Sub3) this).aClass173_Sub2_10268,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return ((Class528_Sub8_Sub3) this).aClass133_11503 != null;
	}
	return false;
    }
    
    Class169 method9319() {
	return Class169.aClass169_1935;
    }
    
    void method9316(int i) {
	OpenGL.glUseProgram(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8775(null);
    }
    
    void method9298(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_0_, int i_1_, int i_2_) {
	int i_3_ = (((Class133) ((Class528_Sub8_Sub3) this).aClass133_11503)
		    .anInt1621);
	OpenGL.glUseProgram(i_3_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3_, "paramsGamma"),
			   aFloat11498);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3_, "paramsRanges"),
			   aFloat11497, aFloat11499, aFloat11501, aFloat11500);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268
	    .method8775(class120_sub4);
    }
    
    void method9299(int i) {
	OpenGL.glUseProgram(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8775(null);
    }
    
    boolean method9305() {
	return (aFloat11498 == 1.0F && aFloat11497 == 0.0F
		&& aFloat11499 == 1.0F && aFloat11501 == 0.0F
		&& aFloat11500 == 1.0F);
    }
    
    int method9312() {
	return 1;
    }
    
    void method9313(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_4_, int i_5_, int i_6_) {
	int i_7_ = (((Class133) ((Class528_Sub8_Sub3) this).aClass133_11503)
		    .anInt1621);
	OpenGL.glUseProgram(i_7_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_7_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "paramsGamma"),
			   aFloat11498);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_7_, "paramsRanges"),
			   aFloat11497, aFloat11499, aFloat11501, aFloat11500);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268
	    .method8775(class120_sub4);
    }
    
    static {
	aFloat11497 = 0.0F;
	aFloat11499 = 1.0F;
	aFloat11501 = 0.0F;
	aFloat11500 = 1.0F;
    }
    
    boolean method9306() {
	if (((Class173_Sub2) ((Class528_Sub8_Sub3) this).aClass173_Sub2_10268)
	    .aBool9583) {
	    ((Class528_Sub8_Sub3) this).aClass133_11503
		= (Class133.method1634
		   (((Class528_Sub8_Sub3) this).aClass173_Sub2_10268,
		    (new Class125[]
		     { Class125.method1612
		       (((Class528_Sub8_Sub3) this).aClass173_Sub2_10268,
			35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return ((Class528_Sub8_Sub3) this).aClass133_11503 != null;
	}
	return false;
    }
    
    void method9318() {
	((Class528_Sub8_Sub3) this).aClass133_11503 = null;
    }
    
    void method9308() {
	((Class528_Sub8_Sub3) this).aClass133_11503 = null;
    }
    
    void method9294() {
	((Class528_Sub8_Sub3) this).aClass133_11503 = null;
    }
    
    void method9310(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_8_, int i_9_, int i_10_) {
	int i_11_ = (((Class133) ((Class528_Sub8_Sub3) this).aClass133_11503)
		     .anInt1621);
	OpenGL.glUseProgram(i_11_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_11_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_11_, "paramsGamma"),
			   aFloat11498);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_11_, "paramsRanges"),
			   aFloat11497, aFloat11499, aFloat11501, aFloat11500);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268
	    .method8775(class120_sub4);
    }
    
    void method9324(int i, int i_12_) {
	/* empty */
    }
    
    void method9297(int i, int i_13_) {
	/* empty */
    }
    
    void method9309(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_14_, int i_15_, int i_16_) {
	int i_17_ = (((Class133) ((Class528_Sub8_Sub3) this).aClass133_11503)
		     .anInt1621);
	OpenGL.glUseProgram(i_17_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_17_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_17_, "paramsGamma"),
			   aFloat11498);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_17_, "paramsRanges"),
			   aFloat11497, aFloat11499, aFloat11501, aFloat11500);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268
	    .method8775(class120_sub4);
    }
    
    void method9314(int i) {
	OpenGL.glUseProgram(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8775(null);
    }
    
    void method9315(int i) {
	OpenGL.glUseProgram(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8775(null);
    }
    
    void method9317(int i) {
	OpenGL.glUseProgram(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8774(0);
	((Class528_Sub8_Sub3) this).aClass173_Sub2_10268.method8775(null);
    }
    
    Class169 method9321() {
	return Class169.aClass169_1935;
    }
    
    void method9296() {
	((Class528_Sub8_Sub3) this).aClass133_11503 = null;
    }
    
    boolean method9304() {
	return ((Class528_Sub8_Sub3) this).aClass133_11503 != null;
    }
    
    boolean method10453() {
	return (((Class173_Sub2)
		 ((Class528_Sub8_Sub3) this).aClass173_Sub2_10268)
		.aBool9583);
    }
    
    boolean method9302() {
	return ((Class528_Sub8_Sub3) this).aClass133_11503 != null;
    }
    
    boolean method9322() {
	return ((Class528_Sub8_Sub3) this).aClass133_11503 != null;
    }
    
    boolean method9323() {
	return ((Class528_Sub8_Sub3) this).aClass133_11503 != null;
    }
    
    boolean method9293() {
	return (aFloat11498 == 1.0F && aFloat11497 == 0.0F
		&& aFloat11499 == 1.0F && aFloat11501 == 0.0F
		&& aFloat11500 == 1.0F);
    }
    
    int method9325() {
	return 1;
    }
    
    int method9326() {
	return 1;
    }
}
