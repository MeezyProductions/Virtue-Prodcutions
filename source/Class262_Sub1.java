/* Class262_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class262_Sub1 extends Class262
{
    static float[] aFloatArray9848 = new float[16];
    float[][] aFloatArrayArray9849;
    Class173_Sub1_Sub2 aClass173_Sub1_Sub2_9850;
    long aLong9851;
    long aLong9852;
    boolean aBool9853 = false;
    byte[] aByteArray9854;
    byte[] aByteArray9855;
    Class258_Sub1 aClass258_Sub1_9856;
    static final int anInt9857 = 1;
    boolean[] aBoolArray9858;
    static final int anInt9859 = 0;
    
    void method3627(int i, Class418 class418) {
	int i_0_ = i >> 16;
	int i_1_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method5026(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_0_],
			 i_1_, 8);
	((Class262_Sub1) this).aBoolArray9858[i_0_] = true;
    }
    
    void method3636(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_2_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_3_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2963)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_2_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_3_ >= 0) {
	    i_3_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_3_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_3_ + 1] = f_2_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    public boolean method3588() {
	if (((Class262_Sub1) this).aBool9853)
	    return true;
	((Class262_Sub1) this).aLong9851
	    = (((Class262_Sub1) this).aByteArray9854 == null ? 0L
	       : (IDirect3DDevice.CreateVertexShader
		  ((((Class173_Sub1_Sub2)
		     ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850)
		    .aLong11378),
		   ((Class262_Sub1) this).aByteArray9854)));
	((Class262_Sub1) this).aLong9852
	    = (((Class262_Sub1) this).aByteArray9855 == null ? 0L
	       : (IDirect3DDevice.CreatePixelShader
		  ((((Class173_Sub1_Sub2)
		     ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850)
		    .aLong11378),
		   ((Class262_Sub1) this).aByteArray9855)));
	if (((Class262_Sub1) this).aLong9851 == 0L
	    && ((Class262_Sub1) this).aLong9852 == 0L)
	    return false;
	int i = -1;
	for (int i_4_ = 0; i_4_ < ((Class262_Sub1) this)
				      .aClass258_Sub1_9856
				      .method3477(2056246920); i_4_++) {
	    if (((Class262_Sub1) this).aClass258_Sub1_9856
		    .method3527(i_4_, (byte) 94)
		== this) {
		i = i_4_;
		break;
	    }
	}
	int i_5_ = ((Class262_Sub1) this).aClass258_Sub1_9856
		       .method3534(-716572197);
	int i_6_ = ((Class262_Sub1) this).aClass258_Sub1_9856
		       .method3509(2064037684);
	for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub1) this).aClass258_Sub1_9856
		      .method3512(i_7_, (short) 6607);
	    class528_sub22_sub1.method10437(i);
	}
	for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub1) this).aClass258_Sub1_9856
		      .method3528(i_8_, (byte) 64);
	    class528_sub22_sub1.method10437(i);
	}
	int i_9_ = 0;
	int i_10_ = 0;
	int i_11_ = ((Class262_Sub1) this).aClass258_Sub1_9856
			.method3540(this, (short) 4513);
	for (int i_12_ = 0; i_12_ < i_5_ + i_6_; i_12_++) {
	    Class528_Sub22_Sub1_Sub2 class528_sub22_sub1_sub2
		= ((Class528_Sub22_Sub1_Sub2)
		   (i_12_ < i_5_
		    ? ((Class262_Sub1) this).aClass258_Sub1_9856
			  .method3512(i_12_, (short) 24610)
		    : ((Class262_Sub1) this).aClass258_Sub1_9856
			  .method3528(i_12_ - i_5_, (byte) 82)));
	    Class274 class274
		= class528_sub22_sub1_sub2.method10434(684569813);
	    int i_13_ = 1;
	    if (class274 == Class274.aClass274_2909) {
		class274 = class528_sub22_sub1_sub2.method10443(-780032621);
		i_13_ = class528_sub22_sub1_sub2.method10436((byte) 27);
	    }
	    switch (class274.anInt2985 * 2114174033) {
	    case 11:
	    case 51:
	    case 65:
	    case 74:
	    case 75:
		break;
	    case 15:
	    case 59:
	    case 67:
	    case 108:
		i_13_ *= 3;
		break;
	    case 4:
	    case 9:
	    case 25:
	    case 62:
		i_13_ *= 2;
		break;
	    case 0:
	    case 48:
	    case 57:
	    case 71:
		i_13_ *= 4;
		break;
	    default:
		i_13_ = 0;
	    }
	    if ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
		 .anIntArray11992[i_11_])
		>= 0) {
		int i_14_
		    = ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
			.anIntArray11992[i_11_])
		       + i_13_);
		if (i_9_ < i_14_)
		    i_9_ = i_14_;
	    }
	    if ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
		 .anIntArray11993[i_11_])
		>= 0) {
		int i_15_
		    = ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
			.anIntArray11993[i_11_])
		       + i_13_);
		if (i_10_ < i_15_)
		    i_10_ = i_15_;
	    }
	}
	((Class262_Sub1) this).aFloatArrayArray9849[0] = new float[i_9_ * 4];
	((Class262_Sub1) this).aFloatArrayArray9849[1] = new float[i_10_ * 4];
	((Class262_Sub1) this).aBool9853 = true;
	return true;
    }
    
    final void method8978(int i, float[] fs, int i_16_) {
	Class670.method7939(fs, 0,
			    ((Class262_Sub1) this).aFloatArrayArray9849[0],
			    i * 4, i_16_);
	((Class262_Sub1) this).aBoolArray9858[0] = true;
    }
    
    void method3590(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_17_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_18_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2963)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_17_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_18_ >= 0) {
	    i_18_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_18_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_18_ + 1] = f_17_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3591(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_19_, float f_20_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_21_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2933)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_19_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 2] = f_20_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_21_ >= 0) {
	    i_21_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_21_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_21_ + 1] = f_19_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_21_ + 2] = f_20_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3594(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_22_, float f_23_, float f_24_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_25_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2934)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_22_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 2] = f_23_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 3] = f_24_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_25_ >= 0) {
	    i_25_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_25_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_25_ + 1] = f_22_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_25_ + 2] = f_23_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_25_ + 3] = f_24_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    Class262_Sub1(Class173_Sub1_Sub2 class173_sub1_sub2,
		  Class258_Sub1 class258_sub1, Class261 class261) {
	this(class173_sub1_sub2, class261);
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850 = class173_sub1_sub2;
	((Class262_Sub1) this).aClass258_Sub1_9856 = class258_sub1;
    }
    
    void method3595(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_26_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2915)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0)
	    method8978(i, class418.method4973(aFloatArray9848), 16);
	if (i_26_ >= 0)
	    method8980(i_26_, class418.method4973(aFloatArray9848), 16);
    }
    
    void method3623(int i, float[] fs, int i_27_) {
	int i_28_ = i >> 16;
	int i_29_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_28_],
			 i_29_, i_27_);
	((Class262_Sub1) this).aBoolArray9858[i_28_] = true;
    }
    
    void method3596(Class528_Sub22_Sub1 class528_sub22_sub1, int i,
		    Interface38 interface38) {
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.method8496(i);
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
	    .method8526(interface38);
    }
    
    void method3597(int i, float f, float f_30_, float f_31_) {
	int i_32_ = i >> 16;
	int i_33_ = (i & 0xffff) * 4;
	((Class262_Sub1) this).aFloatArrayArray9849[i_32_][i_33_] = f;
	((Class262_Sub1) this).aFloatArrayArray9849[i_32_][i_33_ + 1] = f_30_;
	((Class262_Sub1) this).aFloatArrayArray9849[i_32_][i_33_ + 2] = f_31_;
	((Class262_Sub1) this).aBoolArray9858[i_32_] = true;
    }
    
    void method3626(int i, Class418 class418) {
	int i_34_ = i >> 16;
	int i_35_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method4973(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_34_],
			 i_35_, 12);
	((Class262_Sub1) this).aBoolArray9858[i_34_] = true;
    }
    
    void method3600(int i, Class418 class418) {
	int i_36_ = i >> 16;
	int i_37_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method4973(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_36_],
			 i_37_, 12);
	((Class262_Sub1) this).aBoolArray9858[i_36_] = true;
    }
    
    void method3601(int i, Class418 class418) {
	int i_38_ = i >> 16;
	int i_39_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method5026(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_38_],
			 i_39_, 8);
	((Class262_Sub1) this).aBoolArray9858[i_38_] = true;
    }
    
    void method8979() {
	method8982();
    }
    
    void method3599(int i, float[] fs, int i_40_) {
	int i_41_ = i >> 16;
	int i_42_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_41_],
			 i_42_, i_40_);
	((Class262_Sub1) this).aBoolArray9858[i_41_] = true;
    }
    
    void method3618(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_43_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2948)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0)
	    method8978(i, class418.method5026(aFloatArray9848), 8);
	if (i_43_ >= 0)
	    method8980(i_43_, class418.method5026(aFloatArray9848), 8);
    }
    
    final void method8980(int i, float[] fs, int i_44_) {
	Class670.method7939(fs, 0,
			    ((Class262_Sub1) this).aFloatArrayArray9849[1],
			    i * 4, i_44_);
	((Class262_Sub1) this).aBoolArray9858[1] = true;
    }
    
    void method8981() {
	if (((Class262_Sub1) this).aBoolArray9858[0]) {
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aByteBuffer9222
		.clear();
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aByteBuffer9222
		.asFloatBuffer
		().put(((Class262_Sub1) this).aFloatArrayArray9849[0]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(((Class173_Sub1_Sub2)
		  ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850).aLong11378,
		 0, ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aLong9223,
		 ((Class262_Sub1) this).aFloatArrayArray9849[0].length / 4);
	    ((Class262_Sub1) this).aBoolArray9858[0] = false;
	}
	if (((Class262_Sub1) this).aBoolArray9858[1]) {
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aByteBuffer9222
		.clear();
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aByteBuffer9222
		.asFloatBuffer
		().put(((Class262_Sub1) this).aFloatArrayArray9849[1]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(((Class173_Sub1_Sub2)
		  ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850).aLong11378,
		 0, ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aLong9223,
		 ((Class262_Sub1) this).aFloatArrayArray9849[1].length / 4);
	    ((Class262_Sub1) this).aBoolArray9858[1] = false;
	}
    }
    
    public void method115() {
	if (((Class262_Sub1) this).aLong9851 != 0L) {
	    IUnknown.Release(((Class262_Sub1) this).aLong9851);
	    ((Class262_Sub1) this).aLong9851 = 0L;
	}
	if (((Class262_Sub1) this).aLong9852 != 0L) {
	    IUnknown.Release(((Class262_Sub1) this).aLong9852);
	    ((Class262_Sub1) this).aLong9852 = 0L;
	}
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.method8446(this);
    }
    
    void method8982() {
	if (((Class262_Sub1) this).aLong9851 != 0L) {
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
		.method10397(((Class262_Sub1) this).aLong9851);
	    ((Class262_Sub1) this).aLong9851 = 0L;
	}
	if (((Class262_Sub1) this).aLong9852 != 0L) {
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
		.method10397(((Class262_Sub1) this).aLong9852);
	    ((Class262_Sub1) this).aLong9852 = 0L;
	}
    }
    
    public void finalize() {
	method8982();
    }
    
    void method3603(Class528_Sub22_Sub1 class528_sub22_sub1, float[] fs,
		    int i) {
	int i_45_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_46_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2909)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i_45_ >= 0)
	    method8978(i_45_, fs, i);
	if (i_46_ >= 0)
	    method8980(i_46_, fs, i);
    }
    
    public void method116() {
	if (((Class262_Sub1) this).aLong9851 != 0L) {
	    IUnknown.Release(((Class262_Sub1) this).aLong9851);
	    ((Class262_Sub1) this).aLong9851 = 0L;
	}
	if (((Class262_Sub1) this).aLong9852 != 0L) {
	    IUnknown.Release(((Class262_Sub1) this).aLong9852);
	    ((Class262_Sub1) this).aLong9852 = 0L;
	}
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.method8446(this);
    }
    
    void method8983() {
	method8982();
    }
    
    void method8984() {
	method8982();
    }
    
    void method8985() {
	method8982();
    }
    
    void method3598(int i, Class418 class418) {
	int i_47_ = i >> 16;
	int i_48_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method5026(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_47_],
			 i_48_, 8);
	((Class262_Sub1) this).aBoolArray9858[i_47_] = true;
    }
    
    public boolean method3604() {
	if (((Class262_Sub1) this).aBool9853)
	    return true;
	((Class262_Sub1) this).aLong9851
	    = (((Class262_Sub1) this).aByteArray9854 == null ? 0L
	       : (IDirect3DDevice.CreateVertexShader
		  ((((Class173_Sub1_Sub2)
		     ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850)
		    .aLong11378),
		   ((Class262_Sub1) this).aByteArray9854)));
	((Class262_Sub1) this).aLong9852
	    = (((Class262_Sub1) this).aByteArray9855 == null ? 0L
	       : (IDirect3DDevice.CreatePixelShader
		  ((((Class173_Sub1_Sub2)
		     ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850)
		    .aLong11378),
		   ((Class262_Sub1) this).aByteArray9855)));
	if (((Class262_Sub1) this).aLong9851 == 0L
	    && ((Class262_Sub1) this).aLong9852 == 0L)
	    return false;
	int i = -1;
	for (int i_49_ = 0; i_49_ < ((Class262_Sub1) this)
					.aClass258_Sub1_9856
					.method3477(1968632352); i_49_++) {
	    if (((Class262_Sub1) this).aClass258_Sub1_9856
		    .method3527(i_49_, (byte) 90)
		== this) {
		i = i_49_;
		break;
	    }
	}
	int i_50_ = ((Class262_Sub1) this).aClass258_Sub1_9856
			.method3534(-1684812852);
	int i_51_ = ((Class262_Sub1) this).aClass258_Sub1_9856
			.method3509(2064037684);
	for (int i_52_ = 0; i_52_ < i_50_; i_52_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub1) this).aClass258_Sub1_9856
		      .method3512(i_52_, (short) 7624);
	    class528_sub22_sub1.method10437(i);
	}
	for (int i_53_ = 0; i_53_ < i_51_; i_53_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub1) this).aClass258_Sub1_9856
		      .method3528(i_53_, (byte) 8);
	    class528_sub22_sub1.method10437(i);
	}
	int i_54_ = 0;
	int i_55_ = 0;
	int i_56_ = ((Class262_Sub1) this).aClass258_Sub1_9856
			.method3540(this, (short) 10835);
	for (int i_57_ = 0; i_57_ < i_50_ + i_51_; i_57_++) {
	    Class528_Sub22_Sub1_Sub2 class528_sub22_sub1_sub2
		= ((Class528_Sub22_Sub1_Sub2)
		   (i_57_ < i_50_
		    ? ((Class262_Sub1) this).aClass258_Sub1_9856
			  .method3512(i_57_, (short) 12345)
		    : ((Class262_Sub1) this).aClass258_Sub1_9856
			  .method3528(i_57_ - i_50_, (byte) 45)));
	    Class274 class274
		= class528_sub22_sub1_sub2.method10434(684569813);
	    int i_58_ = 1;
	    if (class274 == Class274.aClass274_2909) {
		class274 = class528_sub22_sub1_sub2.method10443(-780032621);
		i_58_ = class528_sub22_sub1_sub2.method10436((byte) 52);
	    }
	    switch (class274.anInt2985 * 2114174033) {
	    case 11:
	    case 51:
	    case 65:
	    case 74:
	    case 75:
		break;
	    case 15:
	    case 59:
	    case 67:
	    case 108:
		i_58_ *= 3;
		break;
	    case 4:
	    case 9:
	    case 25:
	    case 62:
		i_58_ *= 2;
		break;
	    case 0:
	    case 48:
	    case 57:
	    case 71:
		i_58_ *= 4;
		break;
	    default:
		i_58_ = 0;
	    }
	    if ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
		 .anIntArray11992[i_56_])
		>= 0) {
		int i_59_
		    = ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
			.anIntArray11992[i_56_])
		       + i_58_);
		if (i_54_ < i_59_)
		    i_54_ = i_59_;
	    }
	    if ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
		 .anIntArray11993[i_56_])
		>= 0) {
		int i_60_
		    = ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
			.anIntArray11993[i_56_])
		       + i_58_);
		if (i_55_ < i_60_)
		    i_55_ = i_60_;
	    }
	}
	((Class262_Sub1) this).aFloatArrayArray9849[0] = new float[i_54_ * 4];
	((Class262_Sub1) this).aFloatArrayArray9849[1] = new float[i_55_ * 4];
	((Class262_Sub1) this).aBool9853 = true;
	return true;
    }
    
    void method3608(int i, int i_61_, Interface38 interface38) {
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.method8496(i_61_);
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
	    .method8526(interface38);
    }
    
    void method3606(Class528_Sub22_Sub1 class528_sub22_sub1, float f) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_62_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if ((class528_sub22_sub1.method10434(684569813)
	     != Class274.aClass274_2931)
	    && (class528_sub22_sub1.method10434(684569813)
		!= Class274.aClass274_2977))
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i] = f;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_62_ >= 0) {
	    i_62_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_62_] = f;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3641(Class528_Sub22_Sub1 class528_sub22_sub1, float f) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_63_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if ((class528_sub22_sub1.method10434(684569813)
	     != Class274.aClass274_2931)
	    && (class528_sub22_sub1.method10434(684569813)
		!= Class274.aClass274_2977))
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i] = f;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_63_ >= 0) {
	    i_63_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_63_] = f;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3587(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_64_, float f_65_, float f_66_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_67_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2934)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_64_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 2] = f_65_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 3] = f_66_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_67_ >= 0) {
	    i_67_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_67_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_67_ + 1] = f_64_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_67_ + 2] = f_65_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_67_ + 3] = f_66_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3609(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_68_, float f_69_, float f_70_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_71_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2934)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_68_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 2] = f_69_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 3] = f_70_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_71_ >= 0) {
	    i_71_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_71_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_71_ + 1] = f_68_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_71_ + 2] = f_69_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_71_ + 3] = f_70_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    public boolean method3605() {
	if (((Class262_Sub1) this).aBool9853)
	    return true;
	((Class262_Sub1) this).aLong9851
	    = (((Class262_Sub1) this).aByteArray9854 == null ? 0L
	       : (IDirect3DDevice.CreateVertexShader
		  ((((Class173_Sub1_Sub2)
		     ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850)
		    .aLong11378),
		   ((Class262_Sub1) this).aByteArray9854)));
	((Class262_Sub1) this).aLong9852
	    = (((Class262_Sub1) this).aByteArray9855 == null ? 0L
	       : (IDirect3DDevice.CreatePixelShader
		  ((((Class173_Sub1_Sub2)
		     ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850)
		    .aLong11378),
		   ((Class262_Sub1) this).aByteArray9855)));
	if (((Class262_Sub1) this).aLong9851 == 0L
	    && ((Class262_Sub1) this).aLong9852 == 0L)
	    return false;
	int i = -1;
	for (int i_72_ = 0; i_72_ < ((Class262_Sub1) this)
					.aClass258_Sub1_9856
					.method3477(2071470240); i_72_++) {
	    if (((Class262_Sub1) this).aClass258_Sub1_9856
		    .method3527(i_72_, (byte) 20)
		== this) {
		i = i_72_;
		break;
	    }
	}
	int i_73_ = ((Class262_Sub1) this).aClass258_Sub1_9856
			.method3534(-1759763039);
	int i_74_ = ((Class262_Sub1) this).aClass258_Sub1_9856
			.method3509(2064037684);
	for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub1) this).aClass258_Sub1_9856
		      .method3512(i_75_, (short) 22006);
	    class528_sub22_sub1.method10437(i);
	}
	for (int i_76_ = 0; i_76_ < i_74_; i_76_++) {
	    Class528_Sub22_Sub1 class528_sub22_sub1
		= ((Class262_Sub1) this).aClass258_Sub1_9856
		      .method3528(i_76_, (byte) 104);
	    class528_sub22_sub1.method10437(i);
	}
	int i_77_ = 0;
	int i_78_ = 0;
	int i_79_ = ((Class262_Sub1) this).aClass258_Sub1_9856
			.method3540(this, (short) 16316);
	for (int i_80_ = 0; i_80_ < i_73_ + i_74_; i_80_++) {
	    Class528_Sub22_Sub1_Sub2 class528_sub22_sub1_sub2
		= ((Class528_Sub22_Sub1_Sub2)
		   (i_80_ < i_73_
		    ? ((Class262_Sub1) this).aClass258_Sub1_9856
			  .method3512(i_80_, (short) 5132)
		    : ((Class262_Sub1) this).aClass258_Sub1_9856
			  .method3528(i_80_ - i_73_, (byte) 6)));
	    Class274 class274
		= class528_sub22_sub1_sub2.method10434(684569813);
	    int i_81_ = 1;
	    if (class274 == Class274.aClass274_2909) {
		class274 = class528_sub22_sub1_sub2.method10443(-780032621);
		i_81_ = class528_sub22_sub1_sub2.method10436((byte) 65);
	    }
	    switch (class274.anInt2985 * 2114174033) {
	    case 11:
	    case 51:
	    case 65:
	    case 74:
	    case 75:
		break;
	    case 15:
	    case 59:
	    case 67:
	    case 108:
		i_81_ *= 3;
		break;
	    case 4:
	    case 9:
	    case 25:
	    case 62:
		i_81_ *= 2;
		break;
	    case 0:
	    case 48:
	    case 57:
	    case 71:
		i_81_ *= 4;
		break;
	    default:
		i_81_ = 0;
	    }
	    if ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
		 .anIntArray11992[i_79_])
		>= 0) {
		int i_82_
		    = ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
			.anIntArray11992[i_79_])
		       + i_81_);
		if (i_77_ < i_82_)
		    i_77_ = i_82_;
	    }
	    if ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
		 .anIntArray11993[i_79_])
		>= 0) {
		int i_83_
		    = ((((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1_sub2)
			.anIntArray11993[i_79_])
		       + i_81_);
		if (i_78_ < i_83_)
		    i_78_ = i_83_;
	    }
	}
	((Class262_Sub1) this).aFloatArrayArray9849[0] = new float[i_77_ * 4];
	((Class262_Sub1) this).aFloatArrayArray9849[1] = new float[i_78_ * 4];
	((Class262_Sub1) this).aBool9853 = true;
	return true;
    }
    
    void method3611(Class528_Sub22_Sub1 class528_sub22_sub1, float[] fs,
		    int i) {
	int i_84_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_85_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2909)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i_84_ >= 0)
	    method8978(i_84_, fs, i);
	if (i_85_ >= 0)
	    method8980(i_85_, fs, i);
    }
    
    void method3629(int i, Class418 class418) {
	int i_86_ = i >> 16;
	int i_87_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method4973(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_86_],
			 i_87_, 16);
	((Class262_Sub1) this).aBoolArray9858[i_86_] = true;
    }
    
    void method8986() {
	if (((Class262_Sub1) this).aLong9851 != 0L) {
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
		.method10397(((Class262_Sub1) this).aLong9851);
	    ((Class262_Sub1) this).aLong9851 = 0L;
	}
	if (((Class262_Sub1) this).aLong9852 != 0L) {
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
		.method10397(((Class262_Sub1) this).aLong9852);
	    ((Class262_Sub1) this).aLong9852 = 0L;
	}
    }
    
    void method8987() {
	if (((Class262_Sub1) this).aLong9851 != 0L) {
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
		.method10397(((Class262_Sub1) this).aLong9851);
	    ((Class262_Sub1) this).aLong9851 = 0L;
	}
	if (((Class262_Sub1) this).aLong9852 != 0L) {
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
		.method10397(((Class262_Sub1) this).aLong9852);
	    ((Class262_Sub1) this).aLong9852 = 0L;
	}
    }
    
    void method3615(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_88_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2948)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0)
	    method8978(i, class418.method5026(aFloatArray9848), 8);
	if (i_88_ >= 0)
	    method8980(i_88_, class418.method5026(aFloatArray9848), 8);
    }
    
    void method3616(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_89_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2948)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0)
	    method8978(i, class418.method5026(aFloatArray9848), 8);
	if (i_89_ >= 0)
	    method8980(i_89_, class418.method5026(aFloatArray9848), 8);
    }
    
    void method3625(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_90_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2948)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0)
	    method8978(i, class418.method5026(aFloatArray9848), 8);
	if (i_90_ >= 0)
	    method8980(i_90_, class418.method5026(aFloatArray9848), 8);
    }
    
    void method3639(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_91_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_92_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2963)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_91_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_92_ >= 0) {
	    i_92_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_92_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_92_ + 1] = f_91_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3612(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_93_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2915)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0)
	    method8978(i, class418.method4973(aFloatArray9848), 16);
	if (i_93_ >= 0)
	    method8980(i_93_, class418.method4973(aFloatArray9848), 16);
    }
    
    void method3619(Class528_Sub22_Sub1 class528_sub22_sub1, int i,
		    Interface38 interface38) {
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.method8496(i);
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
	    .method8526(interface38);
    }
    
    void method3642(Class528_Sub22_Sub1 class528_sub22_sub1, int i,
		    Interface38 interface38) {
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.method8496(i);
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
	    .method8526(interface38);
    }
    
    void method3621(int i, float f, float f_94_, float f_95_, float f_96_) {
	int i_97_ = i >> 16;
	int i_98_ = (i & 0xffff) * 4;
	((Class262_Sub1) this).aFloatArrayArray9849[i_97_][i_98_] = f;
	((Class262_Sub1) this).aFloatArrayArray9849[i_97_][i_98_ + 1] = f_94_;
	((Class262_Sub1) this).aFloatArrayArray9849[i_97_][i_98_ + 2] = f_95_;
	((Class262_Sub1) this).aFloatArrayArray9849[i_97_][i_98_ + 3] = f_96_;
	((Class262_Sub1) this).aBoolArray9858[i_97_] = true;
    }
    
    void method3622(int i, float[] fs, int i_99_) {
	int i_100_ = i >> 16;
	int i_101_ = (i & 0xffff) * 4;
	System.arraycopy(fs, 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_100_],
			 i_101_, i_99_);
	((Class262_Sub1) this).aBoolArray9858[i_100_] = true;
    }
    
    Class262_Sub1(Class173_Sub1_Sub2 class173_sub1_sub2, Class261 class261) {
	((Class262_Sub1) this).aFloatArrayArray9849 = new float[2][];
	((Class262_Sub1) this).aBoolArray9858 = new boolean[2];
	aString2855 = class261.aString2850;
	if (class261.aString2849 != null) {
	    aString2856 = class261.aString2849;
	    ((Class262_Sub1) this).aByteArray9854
		= class173_sub1_sub2.method10393(aString2856);
	}
	if (class261.aString2851 != null) {
	    aString2857 = class261.aString2851;
	    ((Class262_Sub1) this).aByteArray9855
		= class173_sub1_sub2.method10393(aString2857);
	}
	class173_sub1_sub2.method8494(this);
    }
    
    void method3607(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_102_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2948)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0)
	    method8978(i, class418.method5026(aFloatArray9848), 8);
	if (i_102_ >= 0)
	    method8980(i_102_, class418.method5026(aFloatArray9848), 8);
    }
    
    void method3586(int i, Class418 class418) {
	int i_103_ = i >> 16;
	int i_104_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method4973(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_103_],
			 i_104_, 12);
	((Class262_Sub1) this).aBoolArray9858[i_103_] = true;
    }
    
    void method3617(int i, Class418 class418) {
	int i_105_ = i >> 16;
	int i_106_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method5026(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_105_],
			 i_106_, 8);
	((Class262_Sub1) this).aBoolArray9858[i_105_] = true;
    }
    
    void method3592(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_107_, float f_108_, float f_109_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_110_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2934)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_107_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 2] = f_108_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 3] = f_109_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_110_ >= 0) {
	    i_110_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_110_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_110_ + 1]
		= f_107_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_110_ + 2]
		= f_108_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_110_ + 3]
		= f_109_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3620(Class528_Sub22_Sub1 class528_sub22_sub1, float[] fs,
		    int i) {
	int i_111_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_112_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2909)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i_111_ >= 0)
	    method8978(i_111_, fs, i);
	if (i_112_ >= 0)
	    method8980(i_112_, fs, i);
    }
    
    void method3610(int i, float f, float f_113_, float f_114_, float f_115_) {
	int i_116_ = i >> 16;
	int i_117_ = (i & 0xffff) * 4;
	((Class262_Sub1) this).aFloatArrayArray9849[i_116_][i_117_] = f;
	((Class262_Sub1) this).aFloatArrayArray9849[i_116_][i_117_ + 1]
	    = f_113_;
	((Class262_Sub1) this).aFloatArrayArray9849[i_116_][i_117_ + 2]
	    = f_114_;
	((Class262_Sub1) this).aFloatArrayArray9849[i_116_][i_117_ + 3]
	    = f_115_;
	((Class262_Sub1) this).aBoolArray9858[i_116_] = true;
    }
    
    void method3630(int i, Class418 class418) {
	int i_118_ = i >> 16;
	int i_119_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method4973(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_118_],
			 i_119_, 16);
	((Class262_Sub1) this).aBoolArray9858[i_118_] = true;
    }
    
    void method3631(int i, Class418 class418) {
	int i_120_ = i >> 16;
	int i_121_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method4973(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_120_],
			 i_121_, 16);
	((Class262_Sub1) this).aBoolArray9858[i_120_] = true;
    }
    
    void method3632(int i, Class418 class418) {
	int i_122_ = i >> 16;
	int i_123_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method4973(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_122_],
			 i_123_, 16);
	((Class262_Sub1) this).aBoolArray9858[i_122_] = true;
    }
    
    void method3633(int i, int i_124_, Interface38 interface38) {
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.method8496(i_124_);
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
	    .method8526(interface38);
    }
    
    void method3634(int i, int i_125_, Interface38 interface38) {
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.method8496(i_125_);
	((Class262_Sub1) this).aClass173_Sub1_Sub2_9850
	    .method8526(interface38);
    }
    
    void method3624(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_126_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_127_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2963)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_126_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_127_ >= 0) {
	    i_127_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_127_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_127_ + 1]
		= f_126_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3614(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_128_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2948)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0)
	    method8978(i, class418.method5026(aFloatArray9848), 8);
	if (i_128_ >= 0)
	    method8980(i_128_, class418.method5026(aFloatArray9848), 8);
    }
    
    void method3637(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_129_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_130_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2963)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_129_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_130_ >= 0) {
	    i_130_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_130_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_130_ + 1]
		= f_129_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3638(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_131_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_132_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2963)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_131_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_132_ >= 0) {
	    i_132_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_132_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_132_ + 1]
		= f_131_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3589(Class528_Sub22_Sub1 class528_sub22_sub1, float f) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_133_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if ((class528_sub22_sub1.method10434(684569813)
	     != Class274.aClass274_2931)
	    && (class528_sub22_sub1.method10434(684569813)
		!= Class274.aClass274_2977))
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i] = f;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_133_ >= 0) {
	    i_133_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_133_] = f;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3640(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_134_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_135_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2963)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_134_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_135_ >= 0) {
	    i_135_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_135_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_135_ + 1]
		= f_134_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3613(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_136_, float f_137_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_138_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2933)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_136_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 2] = f_137_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_138_ >= 0) {
	    i_138_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_138_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_138_ + 1]
		= f_136_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_138_ + 2]
		= f_137_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3628(Class528_Sub22_Sub1 class528_sub22_sub1, float f,
		    float f_139_, float f_140_) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_141_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2933)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0) {
	    i *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 1] = f_139_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[0][i + 2] = f_140_;
	    ((Class262_Sub1) this).aBoolArray9858[0] = true;
	}
	if (i_141_ >= 0) {
	    i_141_ *= 4;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_141_ + 0] = f;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_141_ + 1]
		= f_139_;
	    ((Class262_Sub1) this).aFloatArrayArray9849[1][i_141_ + 2]
		= f_140_;
	    ((Class262_Sub1) this).aBoolArray9858[1] = true;
	}
    }
    
    void method3643(int i, float f, float f_142_, float f_143_) {
	int i_144_ = i >> 16;
	int i_145_ = (i & 0xffff) * 4;
	((Class262_Sub1) this).aFloatArrayArray9849[i_144_][i_145_] = f;
	((Class262_Sub1) this).aFloatArrayArray9849[i_144_][i_145_ + 1]
	    = f_142_;
	((Class262_Sub1) this).aFloatArrayArray9849[i_144_][i_145_ + 2]
	    = f_143_;
	((Class262_Sub1) this).aBoolArray9858[i_144_] = true;
    }
    
    void method8988() {
	if (((Class262_Sub1) this).aBoolArray9858[0]) {
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aByteBuffer9222
		.clear();
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aByteBuffer9222
		.asFloatBuffer
		().put(((Class262_Sub1) this).aFloatArrayArray9849[0]);
	    IDirect3DDevice.SetVertexShaderConstantF
		(((Class173_Sub1_Sub2)
		  ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850).aLong11378,
		 0, ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aLong9223,
		 ((Class262_Sub1) this).aFloatArrayArray9849[0].length / 4);
	    ((Class262_Sub1) this).aBoolArray9858[0] = false;
	}
	if (((Class262_Sub1) this).aBoolArray9858[1]) {
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aByteBuffer9222
		.clear();
	    ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aByteBuffer9222
		.asFloatBuffer
		().put(((Class262_Sub1) this).aFloatArrayArray9849[1]);
	    IDirect3DDevice.SetPixelShaderConstantF
		(((Class173_Sub1_Sub2)
		  ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850).aLong11378,
		 0, ((Class262_Sub1) this).aClass173_Sub1_Sub2_9850.aLong9223,
		 ((Class262_Sub1) this).aFloatArrayArray9849[1].length / 4);
	    ((Class262_Sub1) this).aBoolArray9858[1] = false;
	}
    }
    
    void method3602(Class528_Sub22_Sub1 class528_sub22_sub1,
		    Class418 class418) {
	int i = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10841();
	int i_146_
	    = ((Class528_Sub22_Sub1_Sub2) class528_sub22_sub1).method10838();
	if (class528_sub22_sub1.method10434(684569813)
	    != Class274.aClass274_2915)
	    throw new IllegalArgumentException_Sub1(class528_sub22_sub1, "");
	if (i >= 0)
	    method8978(i, class418.method4973(aFloatArray9848), 16);
	if (i_146_ >= 0)
	    method8980(i_146_, class418.method4973(aFloatArray9848), 16);
    }
    
    void method3635(int i, Class418 class418) {
	int i_147_ = i >> 16;
	int i_148_ = (i & 0xffff) * 4;
	System.arraycopy(class418.method4973(aFloatArray9848), 0,
			 ((Class262_Sub1) this).aFloatArrayArray9849[i_147_],
			 i_148_, 12);
	((Class262_Sub1) this).aBoolArray9858[i_147_] = true;
    }
}
