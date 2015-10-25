/* Class110_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class110_Sub9 extends Class110
{
    static final String aString8949
	= "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
    Class133 aClass133_8950;
    boolean aBool8951;
    boolean aBool8952 = false;
    static final String aString8953
	= "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
    Class115 aClass115_8954;
    
    void method1408(boolean bool) {
	Class120_Sub1 class120_sub1
	    = ((Class110_Sub9) this).aClass173_Sub2_1397.method8763();
	if (((Class110_Sub9) this).aBool8951 && class120_sub1 != null) {
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397
		.method8775(class120_sub1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(0);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub9) this).aClass115_8954)
		 .aClass120_Sub2_1420);
	    int i
		= ((Class133) ((Class110_Sub9) this).aClass133_8950).anInt1621;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f
		(OpenGL.glGetUniformLocation(i, "sunDir"),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[0]),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[1]),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[2]));
	    OpenGL.glUniform4f
		(OpenGL.glGetUniformLocation(i, "sunColour"),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9436),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9525),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9458),
		 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(((Class173_Sub2)
						 (((Class110_Sub9) this)
						  .aClass173_Sub2_1397))
						.aFloatArray9521[1]) * 928.0F);
	    ((Class110_Sub9) this).aBool8952 = true;
	}
    }
    
    void method1406(boolean bool) {
	/* empty */
    }
    
    void method1405(boolean bool) {
	/* empty */
    }
    
    void method1410(int i, int i_0_) {
	if (((Class110_Sub9) this).aBool8952) {
	    int i_1_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_2_ = i_0_ & 0xffff;
	    float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
	    int i_4_
		= ((Class133) ((Class110_Sub9) this).aClass133_8950).anInt1621;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"),
			       (float) (i_1_
					* ((Class173_Sub2)
					   (((Class110_Sub9) this)
					    .aClass173_Sub2_1397)).anInt9474
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_,
							   "breakWaterDepth"),
			       (float) i_2_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_,
							   "breakWaterOffset"),
			       f_3_);
	}
    }
    
    void method1409() {
	if (((Class110_Sub9) this).aBool8952) {
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775(null);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(0);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775(null);
	    OpenGL.glUseProgram(0);
	    ((Class110_Sub9) this).aBool8952 = false;
	}
    }
    
    void method1419(boolean bool) {
	Class120_Sub1 class120_sub1
	    = ((Class110_Sub9) this).aClass173_Sub2_1397.method8763();
	if (((Class110_Sub9) this).aBool8951 && class120_sub1 != null) {
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397
		.method8775(class120_sub1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(0);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub9) this).aClass115_8954)
		 .aClass120_Sub2_1420);
	    int i
		= ((Class133) ((Class110_Sub9) this).aClass133_8950).anInt1621;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f
		(OpenGL.glGetUniformLocation(i, "sunDir"),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[0]),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[1]),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[2]));
	    OpenGL.glUniform4f
		(OpenGL.glGetUniformLocation(i, "sunColour"),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9436),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9525),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9458),
		 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(((Class173_Sub2)
						 (((Class110_Sub9) this)
						  .aClass173_Sub2_1397))
						.aFloatArray9521[1]) * 928.0F);
	    ((Class110_Sub9) this).aBool8952 = true;
	}
    }
    
    void method1414(Class120 class120, int i) {
	if (!((Class110_Sub9) this).aBool8952) {
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775(class120);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8776(i);
	}
    }
    
    boolean method1412() {
	return ((Class110_Sub9) this).aBool8951;
    }
    
    boolean method1413() {
	return ((Class110_Sub9) this).aBool8951;
    }
    
    boolean method1417() {
	return ((Class110_Sub9) this).aBool8951;
    }
    
    boolean method1407() {
	return ((Class110_Sub9) this).aBool8951;
    }
    
    void method1416(boolean bool) {
	Class120_Sub1 class120_sub1
	    = ((Class110_Sub9) this).aClass173_Sub2_1397.method8763();
	if (((Class110_Sub9) this).aBool8951 && class120_sub1 != null) {
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397
		.method8775(class120_sub1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(0);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub9) this).aClass115_8954)
		 .aClass120_Sub2_1420);
	    int i
		= ((Class133) ((Class110_Sub9) this).aClass133_8950).anInt1621;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f
		(OpenGL.glGetUniformLocation(i, "sunDir"),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[0]),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[1]),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[2]));
	    OpenGL.glUniform4f
		(OpenGL.glGetUniformLocation(i, "sunColour"),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9436),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9525),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9458),
		 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(((Class173_Sub2)
						 (((Class110_Sub9) this)
						  .aClass173_Sub2_1397))
						.aFloatArray9521[1]) * 928.0F);
	    ((Class110_Sub9) this).aBool8952 = true;
	}
    }
    
    boolean method1415() {
	return ((Class110_Sub9) this).aBool8951;
    }
    
    void method1418(boolean bool) {
	Class120_Sub1 class120_sub1
	    = ((Class110_Sub9) this).aClass173_Sub2_1397.method8763();
	if (((Class110_Sub9) this).aBool8951 && class120_sub1 != null) {
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397
		.method8775(class120_sub1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(0);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775
		(((Class115) ((Class110_Sub9) this).aClass115_8954)
		 .aClass120_Sub2_1420);
	    int i
		= ((Class133) ((Class110_Sub9) this).aClass133_8950).anInt1621;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f
		(OpenGL.glGetUniformLocation(i, "sunDir"),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[0]),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[1]),
		 -(((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		   .aFloatArray9521[2]));
	    OpenGL.glUniform4f
		(OpenGL.glGetUniformLocation(i, "sunColour"),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9436),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9525),
		 (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		  .aFloat9458),
		 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(((Class173_Sub2)
						 (((Class110_Sub9) this)
						  .aClass173_Sub2_1397))
						.aFloatArray9521[1]) * 928.0F);
	    ((Class110_Sub9) this).aBool8952 = true;
	}
    }
    
    void method1421(int i, int i_5_) {
	if (((Class110_Sub9) this).aBool8952) {
	    int i_6_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_7_ = i_5_ & 0xffff;
	    float f_8_ = (float) (i_5_ >> 16 & 0x3) / 8.0F;
	    int i_9_
		= ((Class133) ((Class110_Sub9) this).aClass133_8950).anInt1621;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "time"),
			       (float) (i_6_
					* ((Class173_Sub2)
					   (((Class110_Sub9) this)
					    .aClass173_Sub2_1397)).anInt9474
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_,
							   "breakWaterDepth"),
			       (float) i_7_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_,
							   "breakWaterOffset"),
			       f_8_);
	}
    }
    
    void method1420() {
	if (((Class110_Sub9) this).aBool8952) {
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775(null);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(0);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775(null);
	    OpenGL.glUseProgram(0);
	    ((Class110_Sub9) this).aBool8952 = false;
	}
    }
    
    void method1424() {
	if (((Class110_Sub9) this).aBool8952) {
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(1);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775(null);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8774(0);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775(null);
	    OpenGL.glUseProgram(0);
	    ((Class110_Sub9) this).aBool8952 = false;
	}
    }
    
    void method1411(Class120 class120, int i) {
	if (!((Class110_Sub9) this).aBool8952) {
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775(class120);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8776(i);
	}
    }
    
    void method1422(int i, int i_10_) {
	if (((Class110_Sub9) this).aBool8952) {
	    int i_11_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_12_ = i_10_ & 0xffff;
	    float f_13_ = (float) (i_10_ >> 16 & 0x3) / 8.0F;
	    int i_14_
		= ((Class133) ((Class110_Sub9) this).aClass133_8950).anInt1621;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "time"),
			       (float) (i_11_
					* ((Class173_Sub2)
					   (((Class110_Sub9) this)
					    .aClass173_Sub2_1397)).anInt9474
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_,
							   "breakWaterDepth"),
			       (float) i_12_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_14_,
							   "breakWaterOffset"),
			       f_13_);
	}
    }
    
    void method1423(Class120 class120, int i) {
	if (!((Class110_Sub9) this).aBool8952) {
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8775(class120);
	    ((Class110_Sub9) this).aClass173_Sub2_1397.method8776(i);
	}
    }
    
    Class110_Sub9(Class173_Sub2 class173_sub2, Class115 class115) {
	super(class173_sub2);
	((Class110_Sub9) this).aBool8951 = false;
	((Class110_Sub9) this).aClass115_8954 = class115;
	if ((((Class115) ((Class110_Sub9) this).aClass115_8954)
	     .aClass120_Sub2_1420) != null
	    && (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		.aBool9433)
	    && (((Class173_Sub2) ((Class110_Sub9) this).aClass173_Sub2_1397)
		.aBool9583)) {
	    Class125 class125
		= (Class125.method1612
		   (((Class110_Sub9) this).aClass173_Sub2_1397, 35633,
		    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
	    Class125 class125_15_
		= (Class125.method1612
		   (((Class110_Sub9) this).aClass173_Sub2_1397, 35632,
		    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
	    ((Class110_Sub9) this).aClass133_8950
		= Class133.method1634((((Class110_Sub9) this)
				       .aClass173_Sub2_1397),
				      new Class125[] { class125,
						       class125_15_ });
	    ((Class110_Sub9) this).aBool8951
		= ((Class110_Sub9) this).aClass133_8950 != null;
	}
    }
}
