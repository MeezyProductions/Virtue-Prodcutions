/* Class262_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

import jaggl.OpenGL;

public class Class262_Sub2 extends Class262
{
    String aString9881;
    static final int anInt9882 = 35632;
    static final int anInt9883 = 13;
    Class173_Sub1_Sub1 aClass173_Sub1_Sub1_9884;
    Class258_Sub2 aClass258_Sub2_9885;
    int anInt9886 = 0;
    int anInt9887 = 0;
    int anInt9888 = 0;
    boolean aBool9889 = false;
    Map aMap9890;
    static int[] anIntArray9891;
    int[] anIntArray9892 = new int[13];
    static float[] aFloatArray9893;
    Map aMap9894;
    Map aMap9895;
    static final int anInt9896 = 35633;
    Map aMap9897;
    String aString9898;
    Map aMap9899;
    static boolean $assertionsDisabled
	= !Class262_Sub2.class.desiredAssertionStatus();
    
    void method3587(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_0_, float f_1_, float f_2_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9897.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_0_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i)))
		       .floatValue() != f_1_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9897.get(Integer.valueOf(i)))
		       .floatValue() != f_2_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_0_));
		((Class262_Sub2) this).aMap9899.put(Integer.valueOf(i),
						    Float.valueOf(f_1_));
		((Class262_Sub2) this).aMap9897.put(Integer.valueOf(i),
						    Float.valueOf(f_2_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2934)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform4f(i, f, f_0_, f_1_, f_2_);
	    }
	}
    }
    
    void method3601(int i, Class418 class418) {
	OpenGL.glUniform2fv(i, 4, class418.method5034(aFloatArray9893), 0);
    }
    
    int method9000(int i, String string, String string_3_) {
	if (string == null)
	    return 0;
	int i_4_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_4_, string);
	OpenGL.glCompileShader(i_4_);
	OpenGL.glGetShaderiv(i_4_, 35713, anIntArray9891, 0);
	if (anIntArray9891[0] == 0) {
	    OpenGL.glDeleteShader(i_4_);
	    i_4_ = 0;
	}
	return i_4_;
    }
    
    void method3597(int i, float f, float f_5_, float f_6_) {
	OpenGL.glUniform3f(i, f, f_5_, f_6_);
    }
    
    void method3634(int i, int i_7_, Interface38 interface38) {
	((Class262_Sub2) this).aClass173_Sub1_Sub1_9884.method8496(i_7_);
	((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
	    .method8526(interface38);
	OpenGL.glUniform1i(i, i_7_);
    }
    
    void method3590(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_8_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_8_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_8_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2963)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform2f(i, f, f_8_);
	    }
	}
    }
    
    void method3591(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_9_, float f_10_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_9_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i)))
		       .floatValue() != f_10_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_9_));
		((Class262_Sub2) this).aMap9899.put(Integer.valueOf(i),
						    Float.valueOf(f_10_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2933)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform3f(i, f, f_9_, f_10_);
	    }
	}
    }
    
    void method3592(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_11_, float f_12_, float f_13_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9897.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_11_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i)))
		       .floatValue() != f_12_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9897.get(Integer.valueOf(i)))
		       .floatValue() != f_13_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_11_));
		((Class262_Sub2) this).aMap9899.put(Integer.valueOf(i),
						    Float.valueOf(f_12_));
		((Class262_Sub2) this).aMap9897.put(Integer.valueOf(i),
						    Float.valueOf(f_13_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2934)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform4f(i, f, f_11_, f_12_, f_13_);
	    }
	}
    }
    
    void method3603(Class528_Sub22_Sub1 class528_sub22_sub1, float[] fs,
		    int i) {
	int i_14_
	    = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i_14_ != -1)
	    OpenGL.glUniform4fv(i_14_, i, fs, 0);
    }
    
    void method3607(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	if (!$assertionsDisabled && (class528_sub22_sub1.method10434(684569813)
				     != Class274.aClass274_2948))
	    throw new AssertionError();
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class418.method5034(aFloatArray9893), 0);
    }
    
    void method3595(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	if (!$assertionsDisabled && (class528_sub22_sub1.method10434(684569813)
				     != Class274.aClass274_2915))
	    throw new AssertionError();
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class418.method4994(aFloatArray9893), 0);
    }
    
    void method3620(Class528_Sub22_Sub1 class528_sub22_sub1, float[] fs,
		    int i) {
	int i_15_
	    = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i_15_ != -1)
	    OpenGL.glUniform4fv(i_15_, i, fs, 0);
    }
    
    void method3642(Class528_Sub22_Sub1 class528_sub22_sub1, int i,
		    Interface38 interface38) {
	int i_16_
	    = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i_16_ != -1) {
	    if (interface38 == null)
		interface38 = (((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
			       .anInterface34_9316);
	    if (i
		< ((Class262_Sub2) this).aClass173_Sub1_Sub1_9884.anInt9235) {
		((Class262_Sub2) this).aClass173_Sub1_Sub1_9884.method8496(i);
		((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
		    .method8526(interface38);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture((((Class470) (Class470) interface38)
				      .anInt5395),
				     (((Class470) (Class470) interface38)
				      .anInt5394));
	    }
	    if ((((Class262_Sub2) this).aMap9895.get(Integer.valueOf(i_16_))
		 == null)
		|| ((Integer) ((Class262_Sub2) this).aMap9895
				  .get(Integer.valueOf(i_16_)))
		       .intValue() != i) {
		((Class262_Sub2) this).aMap9895.put(Integer.valueOf(i_16_),
						    Integer.valueOf(i));
		OpenGL.glUniform1i(i_16_, i);
	    }
	}
    }
    
    void method3610(int i, float f, float f_17_, float f_18_, float f_19_) {
	OpenGL.glUniform4f(i, f, f_17_, f_18_, f_19_);
    }
    
    void method3599(int i, float[] fs, int i_20_) {
	OpenGL.glUniform4fv(i, i_20_, fs, 0);
    }
    
    void method3600(int i, Class418 class418) {
	OpenGL.glUniform3fv(i, 3, class418.method4996(aFloatArray9893), 0);
    }
    
    public void method115() {
	if (((Class262_Sub2) this).anInt9886 != 0) {
	    ((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
		.method10355(((Class262_Sub2) this).anInt9886);
	    if (((Class262_Sub2) this).anInt9887 != 0)
		((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
		    .method10354((long) ((Class262_Sub2) this).anInt9887);
	    if (((Class262_Sub2) this).anInt9888 != 0)
		((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
		    .method10354((long) ((Class262_Sub2) this).anInt9888);
	    ((Class262_Sub2) this).anInt9886 = 0;
	    ((Class262_Sub2) this).anInt9887 = 0;
	    ((Class262_Sub2) this).anInt9888 = 0;
	}
    }
    
    void method3627(int i, Class418 class418) {
	OpenGL.glUniform2fv(i, 4, class418.method5034(aFloatArray9893), 0);
    }
    
    void method3608(int i, int i_21_, Interface38 interface38) {
	((Class262_Sub2) this).aClass173_Sub1_Sub1_9884.method8496(i_21_);
	((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
	    .method8526(interface38);
	OpenGL.glUniform1i(i, i_21_);
    }
    
    void method3629(int i, Class418 class418) {
	OpenGL.glUniform4fv(i, 4, class418.method4994(aFloatArray9893), 0);
    }
    
    public void finalize() {
	method115();
    }
    
    static {
	anIntArray9891 = new int[2];
	aFloatArray9893 = new float[16];
    }
    
    void method3589(Class528_Sub22_Sub1 class528_sub22_sub1, float f) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		if ((class528_sub22_sub1.method10434(684569813)
		     != Class274.aClass274_2931)
		    && (class528_sub22_sub1.method10434(684569813)
			!= Class274.aClass274_2977))
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method3639(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_22_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_22_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_22_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2963)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform2f(i, f, f_22_);
	    }
	}
    }
    
    void method9001() {
	method115();
    }
    
    void method9002() {
	method115();
    }
    
    void method3617(int i, Class418 class418) {
	OpenGL.glUniform2fv(i, 4, class418.method5034(aFloatArray9893), 0);
    }
    
    public boolean method3604() {
	if (((Class262_Sub2) this).aBool9889)
	    return true;
	((Class173_Sub1_Sub1) ((Class262_Sub2) this).aClass173_Sub1_Sub1_9884)
	    .aClass262_Sub2_11282
	    = null;
	((Class262_Sub2) this).anInt9887
	    = method9000(35633, ((Class262_Sub2) this).aString9898,
			 aString2856);
	((Class262_Sub2) this).anInt9888
	    = method9000(35632, ((Class262_Sub2) this).aString9881,
			 aString2857);
	if (((Class262_Sub2) this).anInt9887 == 0
	    || ((Class262_Sub2) this).anInt9888 == 0) {
	    if (((Class262_Sub2) this).anInt9887 != 0)
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9887);
	    if (((Class262_Sub2) this).anInt9888 != 0)
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9888);
	    return false;
	}
	((Class262_Sub2) this).anInt9886 = OpenGL.glCreateProgram();
	if (((Class262_Sub2) this).anInt9887 != 0)
	    OpenGL.glAttachShader(((Class262_Sub2) this).anInt9886,
				  ((Class262_Sub2) this).anInt9887);
	if (((Class262_Sub2) this).anInt9888 != 0)
	    OpenGL.glAttachShader(((Class262_Sub2) this).anInt9886,
				  ((Class262_Sub2) this).anInt9888);
	OpenGL.glLinkProgram(((Class262_Sub2) this).anInt9886);
	OpenGL.glGetProgramiv(((Class262_Sub2) this).anInt9886, 35714,
			      anIntArray9891, 0);
	if (anIntArray9891[0] == 0) {
	    if (((Class262_Sub2) this).anInt9887 != 0) {
		OpenGL.glDetachShader(((Class262_Sub2) this).anInt9886,
				      ((Class262_Sub2) this).anInt9887);
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9887);
	    }
	    if (((Class262_Sub2) this).anInt9888 != 0) {
		OpenGL.glDetachShader(((Class262_Sub2) this).anInt9886,
				      ((Class262_Sub2) this).anInt9888);
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9888);
	    }
	    OpenGL.glDeleteProgram(((Class262_Sub2) this).anInt9886);
	    return false;
	}
	OpenGL.glUseProgram(((Class262_Sub2) this).anInt9886);
	int i = -1;
	for (int i_23_ = 0; i_23_ < ((Class262_Sub2) this)
					.aClass258_Sub2_9885
					.method3477(1960326077); i_23_++) {
	    if (((Class262_Sub2) this).aClass258_Sub2_9885
		    .method3527(i_23_, (byte) 60)
		== this) {
		i = i_23_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_24_ = 0; i_24_ < ((Class262_Sub2) this)
					.aClass258_Sub2_9885
					.method3534(-2122284005); i_24_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub2) this).aClass258_Sub2_9885
		      .method3512(i_24_, (short) 749);
	    if (class528_sub22_sub1 != null)
		class528_sub22_sub1.method10437(i);
	}
	for (int i_25_ = 0; i_25_ < ((Class262_Sub2) this)
					.aClass258_Sub2_9885
					.method3509(2064037684); i_25_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub2) this).aClass258_Sub2_9885
		      .method3528(i_25_, (byte) 30);
	    if (class528_sub22_sub1 != null)
		class528_sub22_sub1.method10437(i);
	}
	((Class262_Sub2) this).aString9898 = null;
	((Class262_Sub2) this).aString9881 = null;
	((Class262_Sub2) this).aBool9889 = true;
	return true;
    }
    
    void method3594(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_26_, float f_27_, float f_28_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9897.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_26_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i)))
		       .floatValue() != f_27_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9897.get(Integer.valueOf(i)))
		       .floatValue() != f_28_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_26_));
		((Class262_Sub2) this).aMap9899.put(Integer.valueOf(i),
						    Float.valueOf(f_27_));
		((Class262_Sub2) this).aMap9897.put(Integer.valueOf(i),
						    Float.valueOf(f_28_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2934)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform4f(i, f, f_26_, f_27_, f_28_);
	    }
	}
    }
    
    void method3606(Class528_Sub22_Sub1 class528_sub22_sub1, float f) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		if ((class528_sub22_sub1.method10434(684569813)
		     != Class274.aClass274_2931)
		    && (class528_sub22_sub1.method10434(684569813)
			!= Class274.aClass274_2977))
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method3641(Class528_Sub22_Sub1 class528_sub22_sub1, float f) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		if ((class528_sub22_sub1.method10434(684569813)
		     != Class274.aClass274_2931)
		    && (class528_sub22_sub1.method10434(684569813)
			!= Class274.aClass274_2977))
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method3640(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_29_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_29_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_29_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2963)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform2f(i, f, f_29_);
	    }
	}
    }
    
    void method3609(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_30_, float f_31_, float f_32_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9897.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_30_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i)))
		       .floatValue() != f_31_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9897.get(Integer.valueOf(i)))
		       .floatValue() != f_32_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_30_));
		((Class262_Sub2) this).aMap9899.put(Integer.valueOf(i),
						    Float.valueOf(f_31_));
		((Class262_Sub2) this).aMap9897.put(Integer.valueOf(i),
						    Float.valueOf(f_32_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2934)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform4f(i, f, f_30_, f_31_, f_32_);
	    }
	}
    }
    
    public boolean method3605() {
	if (((Class262_Sub2) this).aBool9889)
	    return true;
	((Class173_Sub1_Sub1) ((Class262_Sub2) this).aClass173_Sub1_Sub1_9884)
	    .aClass262_Sub2_11282
	    = null;
	((Class262_Sub2) this).anInt9887
	    = method9000(35633, ((Class262_Sub2) this).aString9898,
			 aString2856);
	((Class262_Sub2) this).anInt9888
	    = method9000(35632, ((Class262_Sub2) this).aString9881,
			 aString2857);
	if (((Class262_Sub2) this).anInt9887 == 0
	    || ((Class262_Sub2) this).anInt9888 == 0) {
	    if (((Class262_Sub2) this).anInt9887 != 0)
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9887);
	    if (((Class262_Sub2) this).anInt9888 != 0)
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9888);
	    return false;
	}
	((Class262_Sub2) this).anInt9886 = OpenGL.glCreateProgram();
	if (((Class262_Sub2) this).anInt9887 != 0)
	    OpenGL.glAttachShader(((Class262_Sub2) this).anInt9886,
				  ((Class262_Sub2) this).anInt9887);
	if (((Class262_Sub2) this).anInt9888 != 0)
	    OpenGL.glAttachShader(((Class262_Sub2) this).anInt9886,
				  ((Class262_Sub2) this).anInt9888);
	OpenGL.glLinkProgram(((Class262_Sub2) this).anInt9886);
	OpenGL.glGetProgramiv(((Class262_Sub2) this).anInt9886, 35714,
			      anIntArray9891, 0);
	if (anIntArray9891[0] == 0) {
	    if (((Class262_Sub2) this).anInt9887 != 0) {
		OpenGL.glDetachShader(((Class262_Sub2) this).anInt9886,
				      ((Class262_Sub2) this).anInt9887);
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9887);
	    }
	    if (((Class262_Sub2) this).anInt9888 != 0) {
		OpenGL.glDetachShader(((Class262_Sub2) this).anInt9886,
				      ((Class262_Sub2) this).anInt9888);
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9888);
	    }
	    OpenGL.glDeleteProgram(((Class262_Sub2) this).anInt9886);
	    return false;
	}
	OpenGL.glUseProgram(((Class262_Sub2) this).anInt9886);
	int i = -1;
	for (int i_33_ = 0; i_33_ < ((Class262_Sub2) this)
					.aClass258_Sub2_9885
					.method3477(1971728836); i_33_++) {
	    if (((Class262_Sub2) this).aClass258_Sub2_9885
		    .method3527(i_33_, (byte) 42)
		== this) {
		i = i_33_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_34_ = 0; i_34_ < ((Class262_Sub2) this)
					.aClass258_Sub2_9885
					.method3534(-1265213115); i_34_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub2) this).aClass258_Sub2_9885
		      .method3512(i_34_, (short) 5373);
	    if (class528_sub22_sub1 != null)
		class528_sub22_sub1.method10437(i);
	}
	for (int i_35_ = 0; i_35_ < ((Class262_Sub2) this)
					.aClass258_Sub2_9885
					.method3509(2064037684); i_35_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub2) this).aClass258_Sub2_9885
		      .method3528(i_35_, (byte) 63);
	    if (class528_sub22_sub1 != null)
		class528_sub22_sub1.method10437(i);
	}
	((Class262_Sub2) this).aString9898 = null;
	((Class262_Sub2) this).aString9881 = null;
	((Class262_Sub2) this).aBool9889 = true;
	return true;
    }
    
    void method3611(Class528_Sub22_Sub1 class528_sub22_sub1, float[] fs,
		    int i) {
	int i_36_
	    = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i_36_ != -1)
	    OpenGL.glUniform4fv(i_36_, i, fs, 0);
    }
    
    void method3630(int i, Class418 class418) {
	OpenGL.glUniform4fv(i, 4, class418.method4994(aFloatArray9893), 0);
    }
    
    void method3618(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	if (!$assertionsDisabled && (class528_sub22_sub1.method10434(684569813)
				     != Class274.aClass274_2948))
	    throw new AssertionError();
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class418.method5034(aFloatArray9893), 0);
    }
    
    void method3637(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_37_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_37_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_37_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2963)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform2f(i, f, f_37_);
	    }
	}
    }
    
    void method3638(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_38_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_38_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_38_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2963)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform2f(i, f, f_38_);
	    }
	}
    }
    
    void method3616(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	if (!$assertionsDisabled && (class528_sub22_sub1.method10434(684569813)
				     != Class274.aClass274_2948))
	    throw new AssertionError();
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class418.method5034(aFloatArray9893), 0);
    }
    
    void method3625(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	if (!$assertionsDisabled && (class528_sub22_sub1.method10434(684569813)
				     != Class274.aClass274_2948))
	    throw new AssertionError();
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class418.method5034(aFloatArray9893), 0);
    }
    
    void method3602(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	if (!$assertionsDisabled && (class528_sub22_sub1.method10434(684569813)
				     != Class274.aClass274_2915))
	    throw new AssertionError();
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class418.method4994(aFloatArray9893), 0);
    }
    
    void method3612(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	if (!$assertionsDisabled && (class528_sub22_sub1.method10434(684569813)
				     != Class274.aClass274_2915))
	    throw new AssertionError();
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class418.method4994(aFloatArray9893), 0);
    }
    
    void method3619(Class528_Sub22_Sub1 class528_sub22_sub1, int i,
		    Interface38 interface38) {
	int i_39_
	    = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i_39_ != -1) {
	    if (interface38 == null)
		interface38 = (((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
			       .anInterface34_9316);
	    if (i
		< ((Class262_Sub2) this).aClass173_Sub1_Sub1_9884.anInt9235) {
		((Class262_Sub2) this).aClass173_Sub1_Sub1_9884.method8496(i);
		((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
		    .method8526(interface38);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture((((Class470) (Class470) interface38)
				      .anInt5395),
				     (((Class470) (Class470) interface38)
				      .anInt5394));
	    }
	    if ((((Class262_Sub2) this).aMap9895.get(Integer.valueOf(i_39_))
		 == null)
		|| ((Integer) ((Class262_Sub2) this).aMap9895
				  .get(Integer.valueOf(i_39_)))
		       .intValue() != i) {
		((Class262_Sub2) this).aMap9895.put(Integer.valueOf(i_39_),
						    Integer.valueOf(i));
		OpenGL.glUniform1i(i_39_, i);
	    }
	}
    }
    
    void method3614(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	if (!$assertionsDisabled && (class528_sub22_sub1.method10434(684569813)
				     != Class274.aClass274_2948))
	    throw new AssertionError();
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class418.method5034(aFloatArray9893), 0);
    }
    
    void method3621(int i, float f, float f_40_, float f_41_, float f_42_) {
	OpenGL.glUniform4f(i, f, f_40_, f_41_, f_42_);
    }
    
    void method3622(int i, float[] fs, int i_43_) {
	OpenGL.glUniform4fv(i, i_43_, fs, 0);
    }
    
    void method3623(int i, float[] fs, int i_44_) {
	OpenGL.glUniform4fv(i, i_44_, fs, 0);
    }
    
    void method3635(int i, Class418 class418) {
	OpenGL.glUniform3fv(i, 3, class418.method4996(aFloatArray9893), 0);
    }
    
    void method3586(int i, Class418 class418) {
	OpenGL.glUniform3fv(i, 3, class418.method4996(aFloatArray9893), 0);
    }
    
    void method3626(int i, Class418 class418) {
	OpenGL.glUniform3fv(i, 3, class418.method4996(aFloatArray9893), 0);
    }
    
    Class262_Sub2(Class173_Sub1_Sub1 class173_sub1_sub1, Class261 class261) {
	((Class262_Sub2) this).aMap9890 = new HashMap();
	((Class262_Sub2) this).aMap9894 = new HashMap();
	((Class262_Sub2) this).aMap9899 = new HashMap();
	((Class262_Sub2) this).aMap9897 = new HashMap();
	((Class262_Sub2) this).aMap9895 = new HashMap();
	aString2855 = class261.aString2850;
	StringBuilder stringbuilder = new StringBuilder();
	if (class261.aString2849 != null) {
	    aString2856 = class261.aString2849;
	    if (class261.aClass264Array2848 != null) {
		Class264[] class264s = class261.aClass264Array2848;
		for (int i = 0; i < class264s.length; i++) {
		    Class264 class264 = class264s[i];
		    stringbuilder.append(new StringBuilder().append
					     ("#define ").append
					     (class264.aString2863).append
					     (" ").append
					     (class264.aString2864).append
					     ('\n').toString());
		}
	    }
	    stringbuilder.append(new String(class173_sub1_sub1
						.method10361(aString2856)));
	    ((Class262_Sub2) this).aString9898 = stringbuilder.toString();
	}
	if (class261.aString2851 != null) {
	    aString2857 = class261.aString2851;
	    stringbuilder.setLength(0);
	    if (class261.aClass264Array2852 != null) {
		Class264[] class264s = class261.aClass264Array2852;
		for (int i = 0; i < class264s.length; i++) {
		    Class264 class264 = class264s[i];
		    stringbuilder.append(new StringBuilder().append
					     ("#define ").append
					     (class264.aString2863).append
					     (" ").append
					     (class264.aString2864).append
					     ('\n').toString());
		}
	    }
	    stringbuilder.append(new String(class173_sub1_sub1
						.method10361(aString2857)));
	    ((Class262_Sub2) this).aString9881 = stringbuilder.toString();
	}
	Class670.method7941(((Class262_Sub2) this).anIntArray9892, 0,
			    ((Class262_Sub2) this).anIntArray9892.length, -1);
    }
    
    void method3624(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_45_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_45_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_45_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2963)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform2f(i, f, f_45_);
	    }
	}
    }
    
    void method3598(int i, Class418 class418) {
	OpenGL.glUniform2fv(i, 4, class418.method5034(aFloatArray9893), 0);
    }
    
    void method3615(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	if (!$assertionsDisabled && (class528_sub22_sub1.method10434(684569813)
				     != Class274.aClass274_2948))
	    throw new AssertionError();
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class418.method5034(aFloatArray9893), 0);
    }
    
    void method3631(int i, Class418 class418) {
	OpenGL.glUniform4fv(i, 4, class418.method4994(aFloatArray9893), 0);
    }
    
    void method3632(int i, Class418 class418) {
	OpenGL.glUniform4fv(i, 4, class418.method4994(aFloatArray9893), 0);
    }
    
    void method3633(int i, int i_46_, Interface38 interface38) {
	((Class262_Sub2) this).aClass173_Sub1_Sub1_9884.method8496(i_46_);
	((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
	    .method8526(interface38);
	OpenGL.glUniform1i(i, i_46_);
    }
    
    Class262_Sub2(Class173_Sub1_Sub1 class173_sub1_sub1,
		  Class258_Sub2 class258_sub2, Class261 class261) {
	this(class173_sub1_sub1, class261);
	((Class262_Sub2) this).aClass258_Sub2_9885 = class258_sub2;
	((Class262_Sub2) this).aClass173_Sub1_Sub1_9884 = class173_sub1_sub1;
    }
    
    void method9003() {
	method115();
    }
    
    void method9004() {
	method115();
    }
    
    public void method116() {
	if (((Class262_Sub2) this).anInt9886 != 0) {
	    ((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
		.method10355(((Class262_Sub2) this).anInt9886);
	    if (((Class262_Sub2) this).anInt9887 != 0)
		((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
		    .method10354((long) ((Class262_Sub2) this).anInt9887);
	    if (((Class262_Sub2) this).anInt9888 != 0)
		((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
		    .method10354((long) ((Class262_Sub2) this).anInt9888);
	    ((Class262_Sub2) this).anInt9886 = 0;
	    ((Class262_Sub2) this).anInt9887 = 0;
	    ((Class262_Sub2) this).anInt9888 = 0;
	}
    }
    
    void method3636(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_47_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_47_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_47_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2963)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform2f(i, f, f_47_);
	    }
	}
    }
    
    public boolean method3588() {
	if (((Class262_Sub2) this).aBool9889)
	    return true;
	((Class173_Sub1_Sub1) ((Class262_Sub2) this).aClass173_Sub1_Sub1_9884)
	    .aClass262_Sub2_11282
	    = null;
	((Class262_Sub2) this).anInt9887
	    = method9000(35633, ((Class262_Sub2) this).aString9898,
			 aString2856);
	((Class262_Sub2) this).anInt9888
	    = method9000(35632, ((Class262_Sub2) this).aString9881,
			 aString2857);
	if (((Class262_Sub2) this).anInt9887 == 0
	    || ((Class262_Sub2) this).anInt9888 == 0) {
	    if (((Class262_Sub2) this).anInt9887 != 0)
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9887);
	    if (((Class262_Sub2) this).anInt9888 != 0)
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9888);
	    return false;
	}
	((Class262_Sub2) this).anInt9886 = OpenGL.glCreateProgram();
	if (((Class262_Sub2) this).anInt9887 != 0)
	    OpenGL.glAttachShader(((Class262_Sub2) this).anInt9886,
				  ((Class262_Sub2) this).anInt9887);
	if (((Class262_Sub2) this).anInt9888 != 0)
	    OpenGL.glAttachShader(((Class262_Sub2) this).anInt9886,
				  ((Class262_Sub2) this).anInt9888);
	OpenGL.glLinkProgram(((Class262_Sub2) this).anInt9886);
	OpenGL.glGetProgramiv(((Class262_Sub2) this).anInt9886, 35714,
			      anIntArray9891, 0);
	if (anIntArray9891[0] == 0) {
	    if (((Class262_Sub2) this).anInt9887 != 0) {
		OpenGL.glDetachShader(((Class262_Sub2) this).anInt9886,
				      ((Class262_Sub2) this).anInt9887);
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9887);
	    }
	    if (((Class262_Sub2) this).anInt9888 != 0) {
		OpenGL.glDetachShader(((Class262_Sub2) this).anInt9886,
				      ((Class262_Sub2) this).anInt9888);
		OpenGL.glDeleteShader(((Class262_Sub2) this).anInt9888);
	    }
	    OpenGL.glDeleteProgram(((Class262_Sub2) this).anInt9886);
	    return false;
	}
	OpenGL.glUseProgram(((Class262_Sub2) this).anInt9886);
	int i = -1;
	for (int i_48_ = 0; i_48_ < ((Class262_Sub2) this)
					.aClass258_Sub2_9885
					.method3477(2019746120); i_48_++) {
	    if (((Class262_Sub2) this).aClass258_Sub2_9885
		    .method3527(i_48_, (byte) 119)
		== this) {
		i = i_48_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_49_ = 0; i_49_ < ((Class262_Sub2) this)
					.aClass258_Sub2_9885
					.method3534(-485852287); i_49_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub2) this).aClass258_Sub2_9885
		      .method3512(i_49_, (short) 26074);
	    if (class528_sub22_sub1 != null)
		class528_sub22_sub1.method10437(i);
	}
	for (int i_50_ = 0; i_50_ < ((Class262_Sub2) this)
					.aClass258_Sub2_9885
					.method3509(2064037684); i_50_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub2) this).aClass258_Sub2_9885
		      .method3528(i_50_, (byte) 117);
	    if (class528_sub22_sub1 != null)
		class528_sub22_sub1.method10437(i);
	}
	((Class262_Sub2) this).aString9898 = null;
	((Class262_Sub2) this).aString9881 = null;
	((Class262_Sub2) this).aBool9889 = true;
	return true;
    }
    
    void method3596(Class528_Sub22_Sub1 class528_sub22_sub1, int i,
		    Interface38 interface38) {
	int i_51_
	    = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i_51_ != -1) {
	    if (interface38 == null)
		interface38 = (((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
			       .anInterface34_9316);
	    if (i
		< ((Class262_Sub2) this).aClass173_Sub1_Sub1_9884.anInt9235) {
		((Class262_Sub2) this).aClass173_Sub1_Sub1_9884.method8496(i);
		((Class262_Sub2) this).aClass173_Sub1_Sub1_9884
		    .method8526(interface38);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture((((Class470) (Class470) interface38)
				      .anInt5395),
				     (((Class470) (Class470) interface38)
				      .anInt5394));
	    }
	    if ((((Class262_Sub2) this).aMap9895.get(Integer.valueOf(i_51_))
		 == null)
		|| ((Integer) ((Class262_Sub2) this).aMap9895
				  .get(Integer.valueOf(i_51_)))
		       .intValue() != i) {
		((Class262_Sub2) this).aMap9895.put(Integer.valueOf(i_51_),
						    Integer.valueOf(i));
		OpenGL.glUniform1i(i_51_, i);
	    }
	}
    }
    
    void method3613(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_52_, float f_53_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_52_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i)))
		       .floatValue() != f_53_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_52_));
		((Class262_Sub2) this).aMap9899.put(Integer.valueOf(i),
						    Float.valueOf(f_53_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2933)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform3f(i, f, f_52_, f_53_);
	    }
	}
    }
    
    void method3628(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_54_, float f_55_) {
	int i = ((Class528_Sub22_Sub1_Sub1) class528_sub22_sub1).method10834();
	if (i != -1) {
	    if (((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)) == null
		|| (((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i))
		    == null)
		|| (((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i))
		    == null)
		|| ((Float)
		    ((Class262_Sub2) this).aMap9890.get(Integer.valueOf(i)))
		       .floatValue() != f
		|| ((Float)
		    ((Class262_Sub2) this).aMap9894.get(Integer.valueOf(i)))
		       .floatValue() != f_54_
		|| ((Float)
		    ((Class262_Sub2) this).aMap9899.get(Integer.valueOf(i)))
		       .floatValue() != f_55_) {
		((Class262_Sub2) this).aMap9890.put(Integer.valueOf(i),
						    Float.valueOf(f));
		((Class262_Sub2) this).aMap9894.put(Integer.valueOf(i),
						    Float.valueOf(f_54_));
		((Class262_Sub2) this).aMap9899.put(Integer.valueOf(i),
						    Float.valueOf(f_55_));
		if (class528_sub22_sub1.method10434(684569813)
		    != Class274.aClass274_2933)
		    throw new IllegalArgumentException_Sub1
			      (class528_sub22_sub1, "");
		OpenGL.glUniform3f(i, f, f_54_, f_55_);
	    }
	}
    }
    
    void method3643(int i, float f, float f_56_, float f_57_) {
	OpenGL.glUniform3f(i, f, f_56_, f_57_);
    }
}
