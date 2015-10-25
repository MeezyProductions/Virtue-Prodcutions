/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class153
{
    static final String aString1720
	= "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";
    Class173_Sub2 aClass173_Sub2_1721;
    Class133 aClass133_1722;
    
    boolean method1826() {
	if (((Class173_Sub2) ((Class153) this).aClass173_Sub2_1721).aBool9506
	    && (((Class173_Sub2) ((Class153) this).aClass173_Sub2_1721)
		.aBool9583)
	    && ((Class153) this).aClass133_1722 == null) {
	    Class125 class125
		= (Class125.method1612
		   (((Class153) this).aClass173_Sub2_1721, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (class125 != null)
		((Class153) this).aClass133_1722
		    = Class133.method1634((((Class153) this)
					   .aClass173_Sub2_1721),
					  new Class125[] { class125 });
	}
	return ((Class153) this).aClass133_1722 != null;
    }
    
    boolean method1827() {
	if (((Class173_Sub2) ((Class153) this).aClass173_Sub2_1721).aBool9506
	    && (((Class173_Sub2) ((Class153) this).aClass173_Sub2_1721)
		.aBool9583)
	    && ((Class153) this).aClass133_1722 == null) {
	    Class125 class125
		= (Class125.method1612
		   (((Class153) this).aClass173_Sub2_1721, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (class125 != null)
		((Class153) this).aClass133_1722
		    = Class133.method1634((((Class153) this)
					   .aClass173_Sub2_1721),
					  new Class125[] { class125 });
	}
	return ((Class153) this).aClass133_1722 != null;
    }
    
    boolean method1828(Class120_Sub2 class120_sub2,
		       Class120_Sub2 class120_sub2_0_, float f) {
	if (!method1827())
	    return false;
	Class163_Sub1_Sub1 class163_sub1_sub1
	    = (((Class173_Sub2) ((Class153) this).aClass173_Sub2_1721)
	       .aClass163_Sub1_Sub1_9591);
	Class528_Sub21_Sub3 class528_sub21_sub3
	    = new Class528_Sub21_Sub3(((Class153) this).aClass173_Sub2_1721,
				      Class149.aClass149_1676,
				      Class169.aClass169_1935,
				      (((Class120_Sub2) class120_sub2)
				       .anInt8772),
				      (((Class120_Sub2) class120_sub2)
				       .anInt8771));
	boolean bool = false;
	((Class153) this).aClass173_Sub2_1721.method2179(class163_sub1_sub1,
							 -2302079);
	class163_sub1_sub1.method8898(0, class528_sub21_sub3);
	if (class163_sub1_sub1.method8897()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, ((Class120_Sub2) class120_sub2).anInt8772,
			      ((Class120_Sub2) class120_sub2).anInt8771);
	    OpenGL.glUseProgram(((Class133) ((Class153) this).aClass133_1722)
				.anInt1621);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation((((Class133)
							     (((Class153) this)
							      .aClass133_1722))
							    .anInt1621),
							   "heightMap"),
			       0);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation((((Class133)
							     (((Class153) this)
							      .aClass133_1722))
							    .anInt1621),
							   "rcpRelief"),
			       1.0F / f);
	    OpenGL.glUniform2f
		(OpenGL.glGetUniformLocation((((Class133) (((Class153) this)
							   .aClass133_1722))
					      .anInt1621),
					     "sampleSize"),
		 1.0F / (float) ((Class120_Sub2) class120_sub2_0_).anInt8772,
		 1.0F / (float) ((Class120_Sub2) class120_sub2_0_).anInt8771);
	    for (int i = 0; i < ((Class120_Sub2) class120_sub2).anInt8773;
		 i++) {
		float f_1_
		    = ((float) i
		       / (float) ((Class120_Sub2) class120_sub2).anInt8773);
		((Class153) this).aClass173_Sub2_1721
		    .method8775(class120_sub2_0_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_1_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_1_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_1_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_1_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		class120_sub2.method8251
		    (0, 0, i, ((Class120_Sub2) class120_sub2).anInt8772,
		     ((Class120_Sub2) class120_sub2).anInt8771, 0, 0);
	    }
	    OpenGL.glUseProgram(0);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	class163_sub1_sub1.method8898(0, null);
	((Class153) this).aClass173_Sub2_1721.method2180(class163_sub1_sub1,
							 1746447143);
	return bool;
    }
    
    Class153(Class173_Sub2 class173_sub2) {
	((Class153) this).aClass173_Sub2_1721 = class173_sub2;
    }
}
