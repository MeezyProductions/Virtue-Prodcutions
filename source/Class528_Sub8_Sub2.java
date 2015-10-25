/* Class528_Sub8_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class528_Sub8_Sub2 extends Class528_Sub8
{
    static final String aString11482
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11483
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static float[] aFloatArray11484 = { 0.0F, 0.0F, 0.0F };
    static Class162_Sub1[] aClass162_Sub1Array11485;
    static final String aString11486
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";
    static final String aString11487
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11488
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";
    static final String aString11489
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static float aFloat11490 = 1.0F;
    static int anInt11491 = 1;
    static final String aString11492
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11493
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    Class133[] aClass133Array11494 = null;
    
    boolean method10449() {
	return (((Class173_Sub2)
		 ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268)
		.aBool9583);
    }
    
    boolean method9322() {
	return ((Class528_Sub8_Sub2) this).aClass133Array11494 != null;
    }
    
    boolean method9304() {
	return ((Class528_Sub8_Sub2) this).aClass133Array11494 != null;
    }
    
    void method9313(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_0_, int i_1_, int i_2_) {
	if (anInt11491 >= 1 && anInt11491 <= 3) {
	    int i_3_ = (((Class133) (((Class528_Sub8_Sub2) this)
				     .aClass133Array11494[anInt11491 - 1]))
			.anInt1621);
	    OpenGL.glUseProgram(i_3_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3_,
							   "paramsWeightings"),
			       aFloat11490, aFloatArray11484[0],
			       aFloatArray11484[1], aFloatArray11484[2]);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8774(0);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
		.method8775(class120_sub4);
	    for (int i_4_ = anInt11491 - 1; i_4_ >= 0; i_4_--) {
		if (aClass162_Sub1Array11485[i_4_] != null) {
		    if (i_4_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_3_, "remap_1"), 1);
		    if (i_4_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_3_, "remap_2"), 2);
		    if (i_4_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_3_, "remap_3"), 3);
		    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
			.method8774(i_4_ + 1);
		    Class120 class120
			= aClass162_Sub1Array11485[i_4_].method8441();
		    if (class120 != null)
			((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
			    .method8775(class120);
		}
	    }
	}
    }
    
    void method9308() {
	if (((Class528_Sub8_Sub2) this).aClass133Array11494 != null) {
	    for (int i = 0;
		 i < ((Class528_Sub8_Sub2) this).aClass133Array11494.length;
		 i++)
		((Class528_Sub8_Sub2) this).aClass133Array11494[i] = null;
	    ((Class528_Sub8_Sub2) this).aClass133Array11494 = null;
	}
    }
    
    void method9296() {
	if (((Class528_Sub8_Sub2) this).aClass133Array11494 != null) {
	    for (int i = 0;
		 i < ((Class528_Sub8_Sub2) this).aClass133Array11494.length;
		 i++)
		((Class528_Sub8_Sub2) this).aClass133Array11494[i] = null;
	    ((Class528_Sub8_Sub2) this).aClass133Array11494 = null;
	}
    }
    
    boolean method9306() {
	if (((Class173_Sub2) ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268)
	    .aBool9583) {
	    ((Class528_Sub8_Sub2) this).aClass133Array11494 = new Class133[3];
	    if (((Class173_Sub2)
		 ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268)
		.aBool9574) {
		((Class528_Sub8_Sub2) this).aClass133Array11494[0]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class528_Sub8_Sub2) this).aClass133Array11494[1]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class528_Sub8_Sub2) this).aClass133Array11494[2]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (((Class528_Sub8_Sub2) this).aClass133Array11494[i]
			== null)
			return false;
		}
	    } else {
		((Class528_Sub8_Sub2) this).aClass133Array11494[0]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class528_Sub8_Sub2) this).aClass133Array11494[1]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class528_Sub8_Sub2) this).aClass133Array11494[2]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (((Class528_Sub8_Sub2) this).aClass133Array11494[i]
			== null)
			return false;
		}
	    }
	    return ((Class528_Sub8_Sub2) this).aClass133Array11494 != null;
	}
	return false;
    }
    
    void method9299(int i) {
	OpenGL.glUseProgram(0);
	for (int i_5_ = anInt11491; i_5_ >= 0; i_5_--) {
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8774(i_5_);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8775(null);
	}
    }
    
    Class169 method9303() {
	return Class169.aClass169_1935;
    }
    
    int method9312() {
	return 2;
    }
    
    boolean method9293() {
	return (aFloat11490 == 1.0F
		|| (aFloatArray11484[0] + aFloatArray11484[1]
		    + aFloatArray11484[2]) == 0.0F
		|| (aClass162_Sub1Array11485[0] == null
		    && aClass162_Sub1Array11485[1] == null
		    && aClass162_Sub1Array11485[2] == null));
    }
    
    void method9309(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_6_, int i_7_, int i_8_) {
	if (anInt11491 >= 1 && anInt11491 <= 3) {
	    int i_9_ = (((Class133) (((Class528_Sub8_Sub2) this)
				     .aClass133Array11494[anInt11491 - 1]))
			.anInt1621);
	    OpenGL.glUseProgram(i_9_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_9_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_9_,
							   "paramsWeightings"),
			       aFloat11490, aFloatArray11484[0],
			       aFloatArray11484[1], aFloatArray11484[2]);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8774(0);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
		.method8775(class120_sub4);
	    for (int i_10_ = anInt11491 - 1; i_10_ >= 0; i_10_--) {
		if (aClass162_Sub1Array11485[i_10_] != null) {
		    if (i_10_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_9_, "remap_1"), 1);
		    if (i_10_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_9_, "remap_2"), 2);
		    if (i_10_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_9_, "remap_3"), 3);
		    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
			.method8774(i_10_ + 1);
		    Class120 class120
			= aClass162_Sub1Array11485[i_10_].method8441();
		    if (class120 != null)
			((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
			    .method8775(class120);
		}
	    }
	}
    }
    
    boolean method9295() {
	if (((Class173_Sub2) ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268)
	    .aBool9583) {
	    ((Class528_Sub8_Sub2) this).aClass133Array11494 = new Class133[3];
	    if (((Class173_Sub2)
		 ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268)
		.aBool9574) {
		((Class528_Sub8_Sub2) this).aClass133Array11494[0]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class528_Sub8_Sub2) this).aClass133Array11494[1]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class528_Sub8_Sub2) this).aClass133Array11494[2]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (((Class528_Sub8_Sub2) this).aClass133Array11494[i]
			== null)
			return false;
		}
	    } else {
		((Class528_Sub8_Sub2) this).aClass133Array11494[0]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class528_Sub8_Sub2) this).aClass133Array11494[1]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		((Class528_Sub8_Sub2) this).aClass133Array11494[2]
		    = (Class133.method1634
		       (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			(new Class125[]
			 { Class125.method1612
			   (((Class528_Sub8_Sub2) this).aClass173_Sub2_10268,
			    35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (((Class528_Sub8_Sub2) this).aClass133Array11494[i]
			== null)
			return false;
		}
	    }
	    return ((Class528_Sub8_Sub2) this).aClass133Array11494 != null;
	}
	return false;
    }
    
    void method9297(int i, int i_11_) {
	/* empty */
    }
    
    static {
	aClass162_Sub1Array11485 = new Class162_Sub1[] { null, null, null };
    }
    
    void method9294() {
	if (((Class528_Sub8_Sub2) this).aClass133Array11494 != null) {
	    for (int i = 0;
		 i < ((Class528_Sub8_Sub2) this).aClass133Array11494.length;
		 i++)
		((Class528_Sub8_Sub2) this).aClass133Array11494[i] = null;
	    ((Class528_Sub8_Sub2) this).aClass133Array11494 = null;
	}
    }
    
    void method9310(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_12_, int i_13_, int i_14_) {
	if (anInt11491 >= 1 && anInt11491 <= 3) {
	    int i_15_ = (((Class133) (((Class528_Sub8_Sub2) this)
				      .aClass133Array11494[anInt11491 - 1]))
			 .anInt1621);
	    OpenGL.glUseProgram(i_15_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_15_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_15_,
							   "paramsWeightings"),
			       aFloat11490, aFloatArray11484[0],
			       aFloatArray11484[1], aFloatArray11484[2]);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8774(0);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
		.method8775(class120_sub4);
	    for (int i_16_ = anInt11491 - 1; i_16_ >= 0; i_16_--) {
		if (aClass162_Sub1Array11485[i_16_] != null) {
		    if (i_16_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_15_, "remap_1"), 1);
		    if (i_16_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_15_, "remap_2"), 2);
		    if (i_16_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_15_, "remap_3"), 3);
		    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
			.method8774(i_16_ + 1);
		    Class120 class120
			= aClass162_Sub1Array11485[i_16_].method8441();
		    if (class120 != null)
			((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
			    .method8775(class120);
		}
	    }
	}
    }
    
    void method9315(int i) {
	OpenGL.glUseProgram(0);
	for (int i_17_ = anInt11491; i_17_ >= 0; i_17_--) {
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8774(i_17_);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8775(null);
	}
    }
    
    void method9318() {
	if (((Class528_Sub8_Sub2) this).aClass133Array11494 != null) {
	    for (int i = 0;
		 i < ((Class528_Sub8_Sub2) this).aClass133Array11494.length;
		 i++)
		((Class528_Sub8_Sub2) this).aClass133Array11494[i] = null;
	    ((Class528_Sub8_Sub2) this).aClass133Array11494 = null;
	}
    }
    
    void method9317(int i) {
	OpenGL.glUseProgram(0);
	for (int i_18_ = anInt11491; i_18_ >= 0; i_18_--) {
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8774(i_18_);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8775(null);
	}
    }
    
    void method9314(int i) {
	OpenGL.glUseProgram(0);
	for (int i_19_ = anInt11491; i_19_ >= 0; i_19_--) {
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8774(i_19_);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8775(null);
	}
    }
    
    void method9298(int i, Class120_Sub4 class120_sub4,
		    Class120_Sub4 class120_sub4_20_, int i_21_, int i_22_) {
	if (anInt11491 >= 1 && anInt11491 <= 3) {
	    int i_23_ = (((Class133) (((Class528_Sub8_Sub2) this)
				      .aClass133Array11494[anInt11491 - 1]))
			 .anInt1621);
	    OpenGL.glUseProgram(i_23_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_23_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_23_,
							   "paramsWeightings"),
			       aFloat11490, aFloatArray11484[0],
			       aFloatArray11484[1], aFloatArray11484[2]);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8774(0);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
		.method8775(class120_sub4);
	    for (int i_24_ = anInt11491 - 1; i_24_ >= 0; i_24_--) {
		if (aClass162_Sub1Array11485[i_24_] != null) {
		    if (i_24_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_23_, "remap_1"), 1);
		    if (i_24_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_23_, "remap_2"), 2);
		    if (i_24_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_23_, "remap_3"), 3);
		    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
			.method8774(i_24_ + 1);
		    Class120 class120
			= aClass162_Sub1Array11485[i_24_].method8441();
		    if (class120 != null)
			((Class528_Sub8_Sub2) this).aClass173_Sub2_10268
			    .method8775(class120);
		}
	    }
	}
    }
    
    void method9316(int i) {
	OpenGL.glUseProgram(0);
	for (int i_25_ = anInt11491; i_25_ >= 0; i_25_--) {
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8774(i_25_);
	    ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268.method8775(null);
	}
    }
    
    Class169 method9321() {
	return Class169.aClass169_1935;
    }
    
    Class169 method9319() {
	return Class169.aClass169_1935;
    }
    
    boolean method10450() {
	return (((Class173_Sub2)
		 ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268)
		.aBool9583);
    }
    
    boolean method9302() {
	return ((Class528_Sub8_Sub2) this).aClass133Array11494 != null;
    }
    
    Class528_Sub8_Sub2(Class173_Sub2 class173_sub2) {
	super(class173_sub2);
    }
    
    boolean method9323() {
	return ((Class528_Sub8_Sub2) this).aClass133Array11494 != null;
    }
    
    void method9324(int i, int i_26_) {
	/* empty */
    }
    
    int method9325() {
	return 2;
    }
    
    int method9326() {
	return 2;
    }
    
    boolean method10451() {
	return (((Class173_Sub2)
		 ((Class528_Sub8_Sub2) this).aClass173_Sub2_10268)
		.aBool9583);
    }
    
    boolean method9305() {
	return (aFloat11490 == 1.0F
		|| (aFloatArray11484[0] + aFloatArray11484[1]
		    + aFloatArray11484[2]) == 0.0F
		|| (aClass162_Sub1Array11485[0] == null
		    && aClass162_Sub1Array11485[1] == null
		    && aClass162_Sub1Array11485[2] == null));
    }
}
