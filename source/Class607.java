/* Class607 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Method;

public class Class607
{
    Class422 aClass422_7928;
    float aFloat7929;
    float aFloat7930;
    float[] aFloatArray7931;
    float aFloat7932;
    int anInt7933;
    int anInt7934;
    Class168 aClass168_7935;
    float aFloat7936;
    float aFloat7937;
    float aFloat7938;
    Class500 aClass500_7939;
    float aFloat7940;
    float aFloat7941;
    int[] anIntArray7942;
    float aFloat7943;
    float aFloat7944;
    float aFloat7945 = 1.0F;
    int anInt7946;
    
    public Class607() {
	((Class607) this).aFloat7941 = 0.0F;
	((Class607) this).aFloat7930 = 1.0F;
	((Class607) this).aFloat7943 = 0.0F;
	((Class607) this).aFloat7944 = 1.0F;
	((Class607) this).anIntArray7942 = new int[] { -1, -1, -1 };
	((Class607) this).aFloatArray7931 = new float[] { 0.0F, 0.0F, 0.0F };
	method7223(-1830098675);
    }
    
    void method7213(ByteBuffer class528_sub42, int i, int i_0_) {
	((Class607) this).anIntArray7942[i]
	    = class528_sub42.readUnsignedShort(-1457025202);
	((Class607) this).aFloatArray7931[i]
	    = class528_sub42.method9635(-1524999363);
    }
    
    public Class500 method7214(byte i) {
	return ((Class607) this).aClass500_7939;
    }
    
    void method7215(Class173 class173, Class607 class607_1_,
		    Class607 class607_2_, float f, int i) {
	((Class607) this).anInt7946
	    = Class405.method4873((1281669227
				   * ((Class607) class607_1_).anInt7946),
				  (((Class607) class607_2_).anInt7946
				   * 1281669227),
				  f * 255.0F, 2040829392) * 134886467;
	((Class607) this).aFloat7932
	    = (f * (((Class607) class607_2_).aFloat7932
		    - ((Class607) class607_1_).aFloat7932)
	       + ((Class607) class607_1_).aFloat7932);
	((Class607) this).aFloat7940
	    = ((((Class607) class607_2_).aFloat7940
		- ((Class607) class607_1_).aFloat7940) * f
	       + ((Class607) class607_1_).aFloat7940);
	((Class607) this).aFloat7929
	    = ((((Class607) class607_2_).aFloat7929
		- ((Class607) class607_1_).aFloat7929) * f
	       + ((Class607) class607_1_).aFloat7929);
	((Class607) this).aFloat7938
	    = (f * (((Class607) class607_2_).aFloat7938
		    - ((Class607) class607_1_).aFloat7938)
	       + ((Class607) class607_1_).aFloat7938);
	((Class607) this).aFloat7936
	    = ((((Class607) class607_2_).aFloat7936
		- ((Class607) class607_1_).aFloat7936) * f
	       + ((Class607) class607_1_).aFloat7936);
	((Class607) this).aFloat7937
	    = (f * (((Class607) class607_2_).aFloat7937
		    - ((Class607) class607_1_).aFloat7937)
	       + ((Class607) class607_1_).aFloat7937);
	((Class607) this).anInt7933
	    = Class405.method4873((((Class607) class607_1_).anInt7933
				   * 723412233),
				  (((Class607) class607_2_).anInt7933
				   * 723412233),
				  255.0F * f, 2040829392) * 997767481;
	((Class607) this).anInt7934
	    = ((int) ((float) (((Class607) class607_2_).anInt7934 * -1642290569
			       - (-1642290569
				  * ((Class607) class607_1_).anInt7934)) * f
		      + (float) (-1642290569
				 * ((Class607) class607_1_).anInt7934))
	       * -175384761);
	if (((Class607) class607_2_).aClass168_7935
	    != ((Class607) class607_1_).aClass168_7935)
	    ((Class607) this).aClass168_7935
		= class173.method2368(((Class607) class607_1_).aClass168_7935,
				      ((Class607) class607_2_).aClass168_7935,
				      f, ((Class607) this).aClass168_7935);
	if (((Class607) class607_2_).aClass500_7939
	    != ((Class607) class607_1_).aClass500_7939) {
	    if (((Class607) class607_1_).aClass500_7939 == null) {
		((Class607) this).aClass500_7939
		    = ((Class607) class607_2_).aClass500_7939;
		if (null != ((Class607) this).aClass500_7939)
		    ((Class607) this).aClass500_7939
			.method6075((int) (f * 255.0F), 0, (byte) 62);
	    } else {
		((Class607) this).aClass500_7939
		    = ((Class607) class607_1_).aClass500_7939;
		if (null != ((Class607) this).aClass500_7939)
		    ((Class607) this).aClass500_7939
			.method6075((int) (f * 255.0F), 255, (byte) 26);
	    }
	}
	((Class607) this).aFloat7945
	    = (f * (((Class607) class607_2_).aFloat7945
		    - ((Class607) class607_1_).aFloat7945)
	       + ((Class607) class607_1_).aFloat7945);
	((Class607) this).aFloat7941
	    = ((((Class607) class607_2_).aFloat7941
		- ((Class607) class607_1_).aFloat7941) * f
	       + ((Class607) class607_1_).aFloat7941);
	((Class607) this).aFloat7930
	    = (f * (((Class607) class607_2_).aFloat7930
		    - ((Class607) class607_1_).aFloat7930)
	       + ((Class607) class607_1_).aFloat7930);
	((Class607) this).aFloat7943
	    = (((Class607) class607_1_).aFloat7943
	       + f * (((Class607) class607_2_).aFloat7943
		      - ((Class607) class607_1_).aFloat7943));
	((Class607) this).aFloat7944
	    = (((Class607) class607_1_).aFloat7944
	       + (((Class607) class607_2_).aFloat7944
		  - ((Class607) class607_1_).aFloat7944) * f);
	float f_3_ = (((Class607) class607_1_).aFloatArray7931[1]
		      + ((Class607) class607_1_).aFloatArray7931[0]
		      + ((Class607) class607_1_).aFloatArray7931[2]);
	float f_4_ = (((Class607) class607_2_).aFloatArray7931[2]
		      + (((Class607) class607_2_).aFloatArray7931[0]
			 + ((Class607) class607_2_).aFloatArray7931[1]));
	float f_5_ = f * (f_4_ - f_3_) + f_3_;
	if (0.0F == f_5_) {
	    int[] is = ((Class607) this).anIntArray7942;
	    int[] is_6_ = ((Class607) this).anIntArray7942;
	    ((Class607) this).anIntArray7942[2] = -1;
	    is_6_[1] = -1;
	    is[0] = -1;
	    float[] fs = ((Class607) this).aFloatArray7931;
	    float[] fs_7_ = ((Class607) this).aFloatArray7931;
	    ((Class607) this).aFloatArray7931[2] = 0.0F;
	    fs_7_[1] = 0.0F;
	    fs[0] = 0.0F;
	} else if (-1 == ((Class607) class607_1_).anIntArray7942[0]
		   && -1 == ((Class607) class607_1_).anIntArray7942[1]
		   && ((Class607) class607_1_).anIntArray7942[2] == -1) {
	    for (int i_8_ = 0; i_8_ < 3; i_8_++) {
		((Class607) this).anIntArray7942[i_8_]
		    = ((Class607) class607_2_).anIntArray7942[i_8_];
		if (((Class607) this).anIntArray7942[i_8_] == -1)
		    ((Class607) this).aFloatArray7931[i_8_] = 0.0F;
		else
		    ((Class607) this).aFloatArray7931[i_8_]
			= f * ((Class607) class607_2_).aFloatArray7931[i_8_];
	    }
	} else if (((Class607) class607_2_).anIntArray7942[0] == -1
		   && -1 == ((Class607) class607_2_).anIntArray7942[1]
		   && -1 == ((Class607) class607_2_).anIntArray7942[2]) {
	    for (int i_9_ = 0; i_9_ < 3; i_9_++) {
		((Class607) this).anIntArray7942[i_9_]
		    = ((Class607) class607_1_).anIntArray7942[i_9_];
		if (((Class607) this).anIntArray7942[i_9_] == -1)
		    ((Class607) this).aFloatArray7931[i_9_] = 0.0F;
		else
		    ((Class607) this).aFloatArray7931[i_9_]
			= (((Class607) class607_1_).aFloatArray7931[i_9_]
			   * (1.0F - f));
	    }
	} else {
	    float f_10_ = 1.0F - f;
	    int i_11_ = 0;
	    int[] is = { -1, -1, -1, -1, -1, -1 };
	    float[] fs = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
	    for (int i_12_ = 0; i_12_ < 3; i_12_++) {
		if (((Class607) class607_1_).anIntArray7942[i_12_] > -1) {
		    is[i_11_] = ((Class607) class607_1_).anIntArray7942[i_12_];
		    fs[i_11_++]
			= (((Class607) class607_1_).aFloatArray7931[i_12_]
			   * f_10_);
		}
	    }
	    int i_13_ = i_11_;
	    for (int i_14_ = 0; i_14_ < 3; i_14_++) {
		if (((Class607) class607_2_).anIntArray7942[i_14_] > -1) {
		    float f_15_
			= f * ((Class607) class607_2_).aFloatArray7931[i_14_];
		    for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
			if (is[i_16_] == (((Class607) class607_2_)
					  .anIntArray7942[i_14_])) {
			    fs[i_16_] += f_15_;
			    break;
			}
			if (i_16_ == i_13_ - 1) {
			    is[i_11_] = (((Class607) class607_2_)
					 .anIntArray7942[i_14_]);
			    fs[i_11_++] = f_15_;
			}
		    }
		}
	    }
	    if (i_11_ > 3) {
		float f_17_ = 0.0F;
		float f_18_ = 0.0F;
		for (int i_19_ = 0; i_19_ < i_11_; i_19_++)
		    f_17_ += fs[i_19_];
		Class63.method1034(fs, is, 0, i_11_ - 1, (byte) 113);
		for (int i_20_ = 0; i_20_ < 3; i_20_++)
		    f_18_ += fs[i_20_];
		float f_21_ = f_17_ / f_18_;
		for (int i_22_ = 0; i_22_ < 3; i_22_++)
		    fs[i_22_] *= f_21_;
	    }
	    for (int i_23_ = 0; i_23_ < 3; i_23_++) {
		((Class607) this).anIntArray7942[i_23_] = is[i_23_];
		((Class607) this).aFloatArray7931[i_23_] = fs[i_23_];
	    }
	}
    }
    
    void method7216(ByteBuffer class528_sub42, int i) {
	((Class607) this).anIntArray7942[i]
	    = class528_sub42.readUnsignedShort(970231975);
	((Class607) this).aFloatArray7931[i]
	    = class528_sub42.method9635(-1935302419);
    }
    
    public void method7217(ByteBuffer class528_sub42, int i) {
	((Class607) this).aFloat7936 = class528_sub42.method9635(-1990599941);
	((Class607) this).aFloat7937 = class528_sub42.method9635(-2126061970);
	((Class607) this).aFloat7938 = class528_sub42.method9635(-2083101755);
    }
    
    public void method7218(ByteBuffer class528_sub42, byte i) {
	method7213(class528_sub42, 0, -1705649839);
    }
    
    void method7219(Class607 class607_24_, int i) {
	((Class607) this).anInt7946 = 1 * ((Class607) class607_24_).anInt7946;
	((Class607) this).aFloat7929 = ((Class607) class607_24_).aFloat7929;
	((Class607) this).aFloat7932 = ((Class607) class607_24_).aFloat7932;
	((Class607) this).aFloat7940 = ((Class607) class607_24_).aFloat7940;
	((Class607) this).aClass422_7928
	    .method5058(((Class607) class607_24_).aClass422_7928);
	((Class607) this).anInt7933 = ((Class607) class607_24_).anInt7933 * 1;
	((Class607) this).anInt7934 = ((Class607) class607_24_).anInt7934 * 1;
	((Class607) this).aClass168_7935
	    = ((Class607) class607_24_).aClass168_7935;
	((Class607) this).aFloat7936 = ((Class607) class607_24_).aFloat7936;
	((Class607) this).aFloat7937 = ((Class607) class607_24_).aFloat7937;
	((Class607) this).aFloat7938 = ((Class607) class607_24_).aFloat7938;
	((Class607) this).aClass500_7939
	    = ((Class607) class607_24_).aClass500_7939;
	((Class607) this).aFloat7945 = ((Class607) class607_24_).aFloat7945;
	((Class607) this).aFloat7941 = ((Class607) class607_24_).aFloat7941;
	((Class607) this).aFloat7930 = ((Class607) class607_24_).aFloat7930;
	((Class607) this).aFloat7943 = ((Class607) class607_24_).aFloat7943;
	((Class607) this).aFloat7944 = ((Class607) class607_24_).aFloat7944;
	((Class607) this).anIntArray7942[0]
	    = ((Class607) class607_24_).anIntArray7942[0];
	((Class607) this).anIntArray7942[1]
	    = ((Class607) class607_24_).anIntArray7942[1];
	((Class607) this).anIntArray7942[2]
	    = ((Class607) class607_24_).anIntArray7942[2];
	((Class607) this).aFloatArray7931[0]
	    = ((Class607) class607_24_).aFloatArray7931[0];
	((Class607) this).aFloatArray7931[1]
	    = ((Class607) class607_24_).aFloatArray7931[1];
	((Class607) this).aFloatArray7931[2]
	    = ((Class607) class607_24_).aFloatArray7931[2];
    }
    
    public void method7220(ByteBuffer class528_sub42, Class627 class627,
			   short i) {
	int i_25_ = class528_sub42.readUnsignedShort(-1191341494);
	int i_26_ = class528_sub42.method9642(-1357549680);
	int i_27_ = class528_sub42.method9642(-342568957);
	int i_28_ = class528_sub42.method9642(-28180681);
	int i_29_ = class528_sub42.readUnsignedShort(-1665059455);
	Class379.anInt3967 = -210032167 * i_29_;
	((Class607) this).aClass500_7939
	    = class627.method7470(i_25_, i_26_, i_27_, i_28_, (byte) 21);
    }
    
    void method7221(Class627 class627, Class643 class643, int i) {
	if (Class514.aClass528_Sub38_6967.aClass691_Sub2_10580
		.method9747(-2098321037) == 1
	    && Class587.aClass173_7714.method2256() > 0) {
	    if (class643.method7614(16777472) != -1)
		((Class607) this).anInt7946
		    = class643.method7614(16777472) * 134886467;
	    if (class643.method7615(1306748603) != -1.0F)
		((Class607) this).aFloat7929 = class643.method7615(438210951);
	    if (class643.method7616((byte) 1) != -1.0F)
		((Class607) this).aFloat7932 = class643.method7616((byte) 1);
	    if (class643.method7635(-226934043) != -1.0F)
		((Class607) this).aFloat7940 = class643.method7635(1819319894);
	}
	if (class643.method7618(-247190532) != null)
	    ((Class607) this).aClass422_7928
		.method5058(class643.method7618(-247190532));
	if (class643.method7650(423586797) != -1)
	    ((Class607) this).anInt7933
		= class643.method7650(-834488282) * 997767481;
	if (class643.method7657(1409888444) != -1)
	    ((Class607) this).anInt7934
		= class643.method7657(1661425248) * -175384761;
	if (class643.method7634((byte) 42) != -1.0F)
	    ((Class607) this).aFloat7937 = class643.method7634((byte) 117);
	if (class643.method7621(-1938319122) != -1.0F)
	    ((Class607) this).aFloat7938 = class643.method7621(-813814448);
	if (class643.method7648(1754231496) != -1.0F)
	    ((Class607) this).aFloat7936 = class643.method7648(1623122205);
	if (class643.method7622(-1875533332) != -1)
	    ((Class607) this).aClass168_7935
		= class627.method7489(class643.method7622(-1875533332),
				      -1121191984);
	if (class643.method7623(-516794893) != -1) {
	    int i_30_ = class643.method7623(936686467);
	    int i_31_ = class643.method7642(16711935);
	    int i_32_ = class643.method7659(-1730800404);
	    int i_33_ = class643.method7631(717714171);
	    int i_34_ = class643.method7626(-98771134);
	    Class379.anInt3967 = i_34_ * -210032167;
	    ((Class607) this).aClass500_7939
		= class627.method7470(i_30_, i_31_, i_32_, i_33_, (byte) 1);
	}
	if (class643.method7627(0, (byte) 3) != -1) {
	    ((Class607) this).anIntArray7942[0]
		= class643.method7627(0, (byte) -59);
	    ((Class607) this).aFloatArray7931[0]
		= class643.method7620(0, (short) -2121);
	}
	if (class643.method7627(1, (byte) -113) != -1) {
	    ((Class607) this).anIntArray7942[1]
		= class643.method7627(1, (byte) -64);
	    ((Class607) this).aFloatArray7931[1]
		= class643.method7620(1, (short) -8437);
	}
	if (class643.method7627(2, (byte) -5) != -1) {
	    ((Class607) this).anIntArray7942[2]
		= class643.method7627(2, (byte) -42);
	    ((Class607) this).aFloatArray7931[2]
		= class643.method7620(2, (short) 14007);
	}
    }
    
    public int method7222(int i) {
	return 723412233 * ((Class607) this).anInt7933;
    }
    
    public Class607(ByteBuffer class528_sub42, Class627 class627) {
	((Class607) this).aFloat7941 = 0.0F;
	((Class607) this).aFloat7930 = 1.0F;
	((Class607) this).aFloat7943 = 0.0F;
	((Class607) this).aFloat7944 = 1.0F;
	((Class607) this).anIntArray7942 = new int[] { -1, -1, -1 };
	((Class607) this).aFloatArray7931 = new float[] { 0.0F, 0.0F, 0.0F };
	method7227(class528_sub42, class627, 2076322049);
    }
    
    void method7223(int i) {
	((Class607) this).anInt7946 = 989187005;
	((Class607) this).aClass422_7928
	    = Class422.method5051(-50.0F, -60.0F, -50.0F);
	((Class607) this).aFloat7929 = 1.1523438F;
	((Class607) this).aFloat7932 = 0.69921875F;
	((Class607) this).aFloat7940 = 1.2F;
	((Class607) this).anInt7933 = 1185697128;
	((Class607) this).anInt7934 = 0;
	((Class607) this).aClass168_7935 = Class627.aClass168_8138;
	((Class607) this).aFloat7936 = 1.0F;
	((Class607) this).aFloat7937 = 0.25F;
	((Class607) this).aFloat7938 = 1.0F;
	((Class607) this).aClass500_7939 = Class671.aClass500_8524;
	((Class607) this).aFloat7945 = 1.0F;
	((Class607) this).aFloat7941 = 0.0F;
	((Class607) this).aFloat7930 = 1.0F;
	((Class607) this).aFloat7943 = 0.0F;
	((Class607) this).aFloat7944 = 1.0F;
	int[] is = ((Class607) this).anIntArray7942;
	int[] is_35_ = ((Class607) this).anIntArray7942;
	((Class607) this).anIntArray7942[2] = -1;
	is_35_[1] = -1;
	is[0] = -1;
	float[] fs = ((Class607) this).aFloatArray7931;
	float[] fs_36_ = ((Class607) this).aFloatArray7931;
	((Class607) this).aFloatArray7931[2] = 0.0F;
	fs_36_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    public void method7224(ByteBuffer class528_sub42) {
	((Class607) this).aFloat7936 = class528_sub42.method9635(-1380063953);
	((Class607) this).aFloat7937 = class528_sub42.method9635(-1446768595);
	((Class607) this).aFloat7938 = class528_sub42.method9635(-1938908422);
    }
    
    public void method7225(ByteBuffer class528_sub42) {
	((Class607) this).aFloat7936 = class528_sub42.method9635(-2116083340);
	((Class607) this).aFloat7937 = class528_sub42.method9635(-1964573288);
	((Class607) this).aFloat7938 = class528_sub42.method9635(-1654205575);
    }
    
    public void method7226(ByteBuffer class528_sub42) {
	method7213(class528_sub42, 0, -1101962889);
    }
    
    public void method7227(ByteBuffer class528_sub42, Class627 class627,
			   int i) {
	int i_37_ = class528_sub42.readUnsignedByte((byte) 35);
	if (Class514.aClass528_Sub38_6967.aClass691_Sub2_10580
		.method9747(-2098321037) == 1
	    && Class587.aClass173_7714.method2256() > 0) {
	    if ((i_37_ & 825175209 * Class635.aClass635_8212.anInt8217) != 0)
		((Class607) this).anInt7946
		    = class528_sub42.readInt(-2090227197) * 134886467;
	    else
		((Class607) this).anInt7946 = 989187005;
	    if (0 != (i_37_ & 825175209 * Class635.aClass635_8213.anInt8217))
		((Class607) this).aFloat7929
		    = (float) class528_sub42.readUnsignedShort(-404126650) / 256.0F;
	    else
		((Class607) this).aFloat7929 = 1.1523438F;
	    if (0 != (i_37_ & 825175209 * Class635.aClass635_8214.anInt8217))
		((Class607) this).aFloat7932
		    = (float) class528_sub42.readUnsignedShort(791300011) / 256.0F;
	    else
		((Class607) this).aFloat7932 = 0.69921875F;
	    if ((i_37_ & Class635.aClass635_8215.anInt8217 * 825175209) != 0)
		((Class607) this).aFloat7940
		    = (float) class528_sub42.readUnsignedShort(693668576) / 256.0F;
	    else
		((Class607) this).aFloat7940 = 1.2F;
	} else {
	    if (0 != (i_37_ & Class635.aClass635_8212.anInt8217 * 825175209))
		class528_sub42.readInt(-2013537408);
	    if (0 != (i_37_ & 825175209 * Class635.aClass635_8213.anInt8217))
		class528_sub42.readUnsignedShort(-890712147);
	    if ((i_37_ & Class635.aClass635_8214.anInt8217 * 825175209) != 0)
		class528_sub42.readUnsignedShort(-1843154659);
	    if ((i_37_ & Class635.aClass635_8215.anInt8217 * 825175209) != 0)
		class528_sub42.readUnsignedShort(-1071217864);
	    ((Class607) this).anInt7946 = 989187005;
	    ((Class607) this).aFloat7940 = 1.2F;
	    ((Class607) this).aFloat7932 = 0.69921875F;
	    ((Class607) this).aFloat7929 = 1.1523438F;
	}
	if (0 != (i_37_ & 825175209 * Class635.aClass635_8221.anInt8217))
	    ((Class607) this).aClass422_7928
		= Class422.method5051((float) class528_sub42
						  .method9642(-470456091),
				      (float) class528_sub42
						  .method9642(237047806),
				      (float) class528_sub42
						  .method9642(-1703382244));
	else
	    ((Class607) this).aClass422_7928
		= Class422.method5051(-50.0F, -60.0F, -50.0F);
	if ((i_37_ & Class635.aClass635_8227.anInt8217 * 825175209) != 0)
	    ((Class607) this).anInt7933
		= class528_sub42.readInt(-1887025669) * 997767481;
	else
	    ((Class607) this).anInt7933 = 1185697128;
	if (0 != (i_37_ & 825175209 * Class635.aClass635_8218.anInt8217))
	    ((Class607) this).anInt7934
		= class528_sub42.readUnsignedShort(-2066377507) * -175384761;
	else
	    ((Class607) this).anInt7934 = 0;
	if (0 != (i_37_ & Class635.aClass635_8219.anInt8217 * 825175209)) {
	    int i_38_ = class528_sub42.readUnsignedShort(109716065);
	    ((Class607) this).aClass168_7935
		= class627.method7489(i_38_, -1121024308);
	} else
	    ((Class607) this).aClass168_7935 = Class627.aClass168_8138;
    }
    
    boolean method7228(Class607 class607_39_, byte i) {
	return ((1281669227 * ((Class607) this).anInt7946
		 == 1281669227 * ((Class607) class607_39_).anInt7946)
		&& (((Class607) this).aFloat7929
		    == ((Class607) class607_39_).aFloat7929)
		&& (((Class607) this).aFloat7932
		    == ((Class607) class607_39_).aFloat7932)
		&& (((Class607) this).aFloat7940
		    == ((Class607) class607_39_).aFloat7940)
		&& (((Class607) class607_39_).aFloat7937
		    == ((Class607) this).aFloat7937)
		&& (((Class607) this).aFloat7936
		    == ((Class607) class607_39_).aFloat7936)
		&& (((Class607) class607_39_).aFloat7938
		    == ((Class607) this).aFloat7938)
		&& (723412233 * ((Class607) this).anInt7933
		    == 723412233 * ((Class607) class607_39_).anInt7933)
		&& (-1642290569 * ((Class607) this).anInt7934
		    == ((Class607) class607_39_).anInt7934 * -1642290569)
		&& (((Class607) class607_39_).aClass168_7935
		    == ((Class607) this).aClass168_7935)
		&& (((Class607) class607_39_).aClass500_7939
		    == ((Class607) this).aClass500_7939)
		&& (((Class607) class607_39_).aFloat7945
		    == ((Class607) this).aFloat7945)
		&& (((Class607) class607_39_).aFloat7941
		    == ((Class607) this).aFloat7941)
		&& (((Class607) class607_39_).aFloat7930
		    == ((Class607) this).aFloat7930)
		&& (((Class607) class607_39_).aFloat7943
		    == ((Class607) this).aFloat7943)
		&& (((Class607) this).aFloat7944
		    == ((Class607) class607_39_).aFloat7944)
		&& (((Class607) this).anIntArray7942[0]
		    == ((Class607) class607_39_).anIntArray7942[0])
		&& (((Class607) class607_39_).anIntArray7942[1]
		    == ((Class607) this).anIntArray7942[1])
		&& (((Class607) this).anIntArray7942[2]
		    == ((Class607) class607_39_).anIntArray7942[2])
		&& (((Class607) this).aFloatArray7931[0]
		    == ((Class607) class607_39_).aFloatArray7931[0])
		&& (((Class607) this).aFloatArray7931[1]
		    == ((Class607) class607_39_).aFloatArray7931[1])
		&& (((Class607) this).aFloatArray7931[2]
		    == ((Class607) class607_39_).aFloatArray7931[2]));
    }
    
    public int method7229() {
	return 723412233 * ((Class607) this).anInt7933;
    }
    
    public int method7230() {
	return 723412233 * ((Class607) this).anInt7933;
    }
    
    public int method7231() {
	return 723412233 * ((Class607) this).anInt7933;
    }
    
    public static void method7232(Canvas canvas, int i) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    static final void method7233(Class648 class648, byte i) {
	int i_40_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_40_, (byte) -2);
	Class226 class226 = Class380.aClass226Array3970[i_40_ >> 16];
	Class193.method2804(class229, class226, class648, -1050335314);
    }
    
    static void method7234(Class173 class173, int i, int i_41_,
			   Class229 class229, Class148 class148, int i_42_,
			   int i_43_, byte i_44_) {
	for (int i_45_ = 0; i_45_ < -2065344127 * client.anInt10922; i_45_++) {
	    Class528_Sub31 class528_sub31
		= ((Class528_Sub31)
		   client.aClass692_11110
		       .method8137((long) client.anIntArray10923[i_45_]));
	    if (class528_sub31 != null) {
		NPC class645_sub1_sub5_sub1_sub1
		    = ((NPC)
		       class528_sub31.anObject10468);
		if (class645_sub1_sub5_sub1_sub1.method10903(1719144371)
		    && (class645_sub1_sub5_sub1_sub1.aByte10675
			== (Class108.myPlayer
			    .aByte10675))) {
		    Class299 class299
			= class645_sub1_sub5_sub1_sub1.aClass299_12043;
		    if (null != class299 && null != class299.anIntArray3302)
			class299 = class299.method3996(Class570.playerVarsProvider,
						       Class570.playerVarsProvider,
						       -1449064824);
		    if (null != class299 && class299.aBool3289
			&& class299.aBool3305) {
			Class422 class422
			    = (class645_sub1_sub5_sub1_sub1.method7693()
			       .aClass422_4868);
			int i_46_ = (int) class422.aFloat4780 / 128 - i / 128;
			int i_47_
			    = (int) class422.aFloat4777 / 128 - i_41_ / 128;
			if (475144907 * class299.anInt3327 != -1)
			    Class108.method1375(class173, class148, class229,
						i_42_, i_43_, i_46_, i_47_,
						class299.anInt3327 * 475144907,
						-1775564101);
			else
			    Class302.method4031(class229, class148, i_42_,
						i_43_, i_46_, i_47_,
						Class482.aClass151Array5471[1],
						(short) -8823);
		    }
		}
	    }
	}
    }
    
    static int method7235(int i, int i_48_, int i_49_) {
	if (i == 1922173025 * Class605.aClass605_7898.anInt7905
	    || Class605.aClass605_7911.anInt7905 * 1922173025 == i)
	    return Class645_Sub1_Sub3_Sub1.anIntArray11873[i_48_ & 0x3];
	return Class645_Sub1_Sub3_Sub1.anIntArray11876[i_48_ & 0x3];
    }
    
    static final void method7236(Class648 class648, int i) {
	Class170.method2110((byte) -24);
	Class28.aBool257 = false;
    }
}
