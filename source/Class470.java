/* Class470 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class470 implements Interface38
{
    Class173_Sub1_Sub1 aClass173_Sub1_Sub1_5389;
    Class340 aClass340_5390 = Class340.aClass340_3585;
    static final int anInt5391 = 34067;
    static final int anInt5392 = 3553;
    static final int anInt5393 = 0;
    int anInt5394;
    int anInt5395;
    static final int anInt5396 = 32879;
    Class169 aClass169_5397;
    Class149 aClass149_5398;
    boolean aBool5399;
    int anInt5400;
    static int[] anIntArray5401 = new int[1];
    
    boolean method249() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	int i = method5794();
	((Class470) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glEnable(((Class470) this).anInt5395);
	OpenGL.glGenerateMipmapEXT(((Class470) this).anInt5395);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glDisable(((Class470) this).anInt5395);
	((Class470) this).aBool5399 = true;
	method5792();
	method5805(i);
	return true;
    }
    
    public void method308() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	int i = ((Class470) this).aClass173_Sub1_Sub1_5389.method8616();
	int i_0_ = (((Class173_Sub1_Sub1)
		     ((Class470) this).aClass173_Sub1_Sub1_5389)
		    .anIntArray11281[i]);
	if (i_0_ != ((Class470) this).anInt5395) {
	    if (i_0_ != 0) {
		OpenGL.glBindTexture(i_0_, 0);
		OpenGL.glDisable(i_0_);
	    }
	    OpenGL.glEnable(((Class470) this).anInt5395);
	    ((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
		.anIntArray11281[i]
		= ((Class470) this).anInt5395;
	}
	OpenGL.glBindTexture(((Class470) this).anInt5395,
			     ((Class470) this).anInt5394);
    }
    
    void method5791(int i) {
	((Class470) this).aClass173_Sub1_Sub1_5389.anInt9229 -= i;
	((Class470) this).aClass173_Sub1_Sub1_5389.anInt9229 += method5794();
    }
    
    void method5792() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	((Class470) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (((Class470) this).aClass340_5390 == Class340.aClass340_3585) {
	    OpenGL.glTexParameteri(((Class470) this).anInt5395, 10241,
				   ((Class470) this).aBool5399 ? 9987 : 9729);
	    OpenGL.glTexParameteri(((Class470) this).anInt5395, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(((Class470) this).anInt5395, 10241,
				   ((Class470) this).aBool5399 ? 9984 : 9728);
	    OpenGL.glTexParameteri(((Class470) this).anInt5395, 10240, 9728);
	}
    }
    
    boolean method218() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	int i = method5794();
	((Class470) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glEnable(((Class470) this).anInt5395);
	OpenGL.glGenerateMipmapEXT(((Class470) this).anInt5395);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glDisable(((Class470) this).anInt5395);
	((Class470) this).aBool5399 = true;
	method5792();
	method5805(i);
	return true;
    }
    
    public void method305() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	int i = ((Class470) this).aClass173_Sub1_Sub1_5389.method8616();
	int i_1_ = (((Class173_Sub1_Sub1)
		     ((Class470) this).aClass173_Sub1_Sub1_5389)
		    .anIntArray11281[i]);
	if (i_1_ != ((Class470) this).anInt5395) {
	    if (i_1_ != 0) {
		OpenGL.glBindTexture(i_1_, 0);
		OpenGL.glDisable(i_1_);
	    }
	    OpenGL.glEnable(((Class470) this).anInt5395);
	    ((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
		.anIntArray11281[i]
		= ((Class470) this).anInt5395;
	}
	OpenGL.glBindTexture(((Class470) this).anInt5395,
			     ((Class470) this).anInt5394);
    }
    
    public void method303(Class340 class340) {
	if (((Class470) this).aClass340_5390 != class340) {
	    ((Class470) this).aClass340_5390 = class340;
	    method5792();
	}
    }
    
    void method5793(int i, int i_2_, int i_3_, float[] fs) {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	if (i_2_ > 0 && !Class507.method6152(i_2_, 1351787196))
	    throw new IllegalArgumentException("");
	if (i_3_ > 0 && !Class507.method6152(i_3_, 1037391418))
	    throw new IllegalArgumentException("");
	int i_4_ = ((Class470) this).aClass149_5398.anInt1686 * 427009899;
	int i_5_ = 0;
	int i_6_ = i_2_ < i_3_ ? i_2_ : i_3_;
	int i_7_ = i_2_ >> 1;
	int i_8_ = i_3_ >> 1;
	float[] fs_9_ = fs;
	float[] fs_10_ = new float[i_7_ * i_8_ * i_4_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_5_,
		 Class173_Sub1_Sub1.method10357((((Class470) this)
						 .aClass149_5398),
						(((Class470) this)
						 .aClass169_5397)),
		 i_2_, i_3_, 0,
		 Class173_Sub1_Sub1
		     .method10356(((Class470) this).aClass149_5398),
		 5126, fs_9_, 0);
	    if (i_6_ <= 1)
		break;
	    int i_11_ = i_2_ * i_4_;
	    for (int i_12_ = 0; i_12_ < i_4_; i_12_++) {
		int i_13_ = i_12_;
		int i_14_ = i_12_;
		int i_15_ = i_14_ + i_11_;
		for (int i_16_ = 0; i_16_ < i_8_; i_16_++) {
		    for (int i_17_ = 0; i_17_ < i_7_; i_17_++) {
			float f = fs_9_[i_14_];
			i_14_ += i_4_;
			f += fs_9_[i_14_];
			i_14_ += i_4_;
			f += fs_9_[i_15_];
			i_15_ += i_4_;
			f += fs_9_[i_15_];
			i_15_ += i_4_;
			fs_10_[i_13_] = f * 0.25F;
			i_13_ += i_4_;
		    }
		    i_14_ += i_11_;
		    i_15_ += i_11_;
		}
	    }
	    float[] fs_18_ = fs_10_;
	    fs_10_ = fs_9_;
	    fs_9_ = fs_18_;
	    i_2_ = i_7_;
	    i_3_ = i_8_;
	    i_7_ >>= 1;
	    i_8_ >>= 1;
	    i_6_ >>= 1;
	    i_5_++;
	}
    }
    
    Class470(Class173_Sub1_Sub1 class173_sub1_sub1, int i, Class149 class149,
	     Class169 class169, int i_19_, boolean bool) {
	((Class470) this).aClass173_Sub1_Sub1_5389 = class173_sub1_sub1;
	((Class470) this).anInt5395 = i;
	((Class470) this).aClass149_5398 = class149;
	((Class470) this).aClass169_5397 = class169;
	((Class470) this).aBool5399 = bool;
	((Class470) this).anInt5400 = i_19_;
	OpenGL.glGenTextures(1, anIntArray5401, 0);
	((Class470) this).anInt5394 = anIntArray5401[0];
	method5792();
	method5805(0);
    }
    
    int method5794() {
	int i = (((Class470) this).aClass149_5398.anInt1686 * 427009899
		 * (((Class470) this).aClass169_5397.anInt1942 * -1009481111)
		 * ((Class470) this).anInt5400);
	return ((Class470) this).aBool5399 ? i * 4 / 3 : i;
    }
    
    void method5795() {
	if (((Class470) this).anInt5394 != 0) {
	    ((Class470) this).aClass173_Sub1_Sub1_5389
		.method10352(((Class470) this).anInt5394, method5794());
	    ((Class470) this).anInt5394 = 0;
	}
    }
    
    void method5796() {
	if (((Class470) this).anInt5394 != 0) {
	    ((Class470) this).aClass173_Sub1_Sub1_5389
		.method10352(((Class470) this).anInt5394, method5794());
	    ((Class470) this).anInt5394 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	method5796();
	super.finalize();
    }
    
    void method5797(int i) {
	((Class470) this).aClass173_Sub1_Sub1_5389.anInt9229 -= i;
	((Class470) this).aClass173_Sub1_Sub1_5389.anInt9229 += method5794();
    }
    
    public void method116() {
	if (((Class470) this).anInt5394 != 0) {
	    ((Class470) this).aClass173_Sub1_Sub1_5389.anInt9229
		-= method5794();
	    int[] is = new int[1];
	    is[0] = ((Class470) this).anInt5394;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class470) this).anInt5394 = 0;
	}
    }
    
    void method5798() throws Throwable {
	method5796();
	super.finalize();
    }
    
    void method5799() throws Throwable {
	method5796();
	super.finalize();
    }
    
    void method5800() throws Throwable {
	method5796();
	super.finalize();
    }
    
    void method5801() throws Throwable {
	method5796();
	super.finalize();
    }
    
    boolean method248() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	int i = method5794();
	((Class470) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glEnable(((Class470) this).anInt5395);
	OpenGL.glGenerateMipmapEXT(((Class470) this).anInt5395);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glDisable(((Class470) this).anInt5395);
	((Class470) this).aBool5399 = true;
	method5792();
	method5805(i);
	return true;
    }
    
    public void method115() {
	if (((Class470) this).anInt5394 != 0) {
	    ((Class470) this).aClass173_Sub1_Sub1_5389.anInt9229
		-= method5794();
	    int[] is = new int[1];
	    is[0] = ((Class470) this).anInt5394;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class470) this).anInt5394 = 0;
	}
    }
    
    boolean method252() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	int i = method5794();
	((Class470) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glEnable(((Class470) this).anInt5395);
	OpenGL.glGenerateMipmapEXT(((Class470) this).anInt5395);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glDisable(((Class470) this).anInt5395);
	((Class470) this).aBool5399 = true;
	method5792();
	method5805(i);
	return true;
    }
    
    boolean method251() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	int i = method5794();
	((Class470) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glEnable(((Class470) this).anInt5395);
	OpenGL.glGenerateMipmapEXT(((Class470) this).anInt5395);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glDisable(((Class470) this).anInt5395);
	((Class470) this).aBool5399 = true;
	method5792();
	method5805(i);
	return true;
    }
    
    void method5802(int i, int i_20_, int i_21_, int[] is) {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	if (i_20_ > 0 && !Class507.method6152(i_20_, 1344305232))
	    throw new IllegalArgumentException("");
	if (i_21_ > 0 && !Class507.method6152(i_21_, 2099433321))
	    throw new IllegalArgumentException("");
	if (((Class470) this).aClass149_5398 != Class149.aClass149_1676)
	    throw new IllegalArgumentException("");
	int i_22_ = 0;
	int i_23_ = i_20_ < i_21_ ? i_20_ : i_21_;
	int i_24_ = i_20_ >> 1;
	int i_25_ = i_21_ >> 1;
	int[] is_26_ = is;
	int[] is_27_ = new int[i_24_ * i_25_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_22_,
				 (Class173_Sub1_Sub1.method10357
				  (((Class470) this).aClass149_5398,
				   ((Class470) this).aClass169_5397)),
				 i_20_, i_21_, 0, 32993,
				 (((Class173_Sub1_Sub1)
				   ((Class470) this).aClass173_Sub1_Sub1_5389)
				  .anInt11294),
				 is_26_, 0);
	    if (i_23_ <= 1)
		break;
	    int i_28_ = 0;
	    int i_29_ = 0;
	    int i_30_ = i_29_ + i_20_;
	    for (int i_31_ = 0; i_31_ < i_25_; i_31_++) {
		for (int i_32_ = 0; i_32_ < i_24_; i_32_++) {
		    int i_33_ = is_26_[i_29_++];
		    int i_34_ = is_26_[i_29_++];
		    int i_35_ = is_26_[i_30_++];
		    int i_36_ = is_26_[i_30_++];
		    int i_37_ = i_33_ >> 24 & 0xff;
		    int i_38_ = i_33_ >> 16 & 0xff;
		    int i_39_ = i_33_ >> 8 & 0xff;
		    int i_40_ = i_33_ & 0xff;
		    i_37_ += i_34_ >> 24 & 0xff;
		    i_38_ += i_34_ >> 16 & 0xff;
		    i_39_ += i_34_ >> 8 & 0xff;
		    i_40_ += i_34_ & 0xff;
		    i_37_ += i_35_ >> 24 & 0xff;
		    i_38_ += i_35_ >> 16 & 0xff;
		    i_39_ += i_35_ >> 8 & 0xff;
		    i_40_ += i_35_ & 0xff;
		    i_37_ += i_36_ >> 24 & 0xff;
		    i_38_ += i_36_ >> 16 & 0xff;
		    i_39_ += i_36_ >> 8 & 0xff;
		    i_40_ += i_36_ & 0xff;
		    is_27_[i_28_++]
			= ((i_37_ & 0x3fc) << 22 | (i_38_ & 0x3fc) << 14
			   | (i_39_ & 0x3fc) << 6 | (i_40_ & 0x3fc) >> 2);
		}
		i_29_ += i_20_;
		i_30_ += i_20_;
	    }
	    int[] is_41_ = is_27_;
	    is_27_ = is_26_;
	    is_26_ = is_41_;
	    i_20_ = i_24_;
	    i_21_ = i_25_;
	    i_24_ >>= 1;
	    i_25_ >>= 1;
	    i_23_ >>= 1;
	    i_22_++;
	}
    }
    
    void method5803(int i, int i_42_, int i_43_, byte[] is) {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	if (i_42_ > 0 && !Class507.method6152(i_42_, 1020010198))
	    throw new IllegalArgumentException("");
	if (i_43_ > 0 && !Class507.method6152(i_43_, 1000937976))
	    throw new IllegalArgumentException("");
	int i_44_ = ((Class470) this).aClass149_5398.anInt1686 * 427009899;
	int i_45_ = 0;
	int i_46_ = i_42_ < i_43_ ? i_42_ : i_43_;
	int i_47_ = i_42_ >> 1;
	int i_48_ = i_43_ >> 1;
	byte[] is_49_ = is;
	byte[] is_50_ = new byte[i_47_ * i_48_ * i_44_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_45_,
		 Class173_Sub1_Sub1.method10357((((Class470) this)
						 .aClass149_5398),
						(((Class470) this)
						 .aClass169_5397)),
		 i_42_, i_43_, 0,
		 Class173_Sub1_Sub1
		     .method10356(((Class470) this).aClass149_5398),
		 5121, is_49_, 0);
	    if (i_46_ <= 1)
		break;
	    int i_51_ = i_42_ * i_44_;
	    for (int i_52_ = 0; i_52_ < i_44_; i_52_++) {
		int i_53_ = i_52_;
		int i_54_ = i_52_;
		int i_55_ = i_54_ + i_51_;
		for (int i_56_ = 0; i_56_ < i_48_; i_56_++) {
		    for (int i_57_ = 0; i_57_ < i_47_; i_57_++) {
			int i_58_ = is_49_[i_54_];
			i_54_ += i_44_;
			i_58_ += is_49_[i_54_];
			i_54_ += i_44_;
			i_58_ += is_49_[i_55_];
			i_55_ += i_44_;
			i_58_ += is_49_[i_55_];
			i_55_ += i_44_;
			is_50_[i_53_] = (byte) (i_58_ >> 2);
			i_53_ += i_44_;
		    }
		    i_54_ += i_51_;
		    i_55_ += i_51_;
		}
	    }
	    byte[] is_59_ = is_50_;
	    is_50_ = is_49_;
	    is_49_ = is_59_;
	    i_42_ = i_47_;
	    i_43_ = i_48_;
	    i_47_ >>= 1;
	    i_48_ >>= 1;
	    i_46_ >>= 1;
	    i_45_++;
	}
    }
    
    public void method306() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	int i = ((Class470) this).aClass173_Sub1_Sub1_5389.method8616();
	int i_60_ = (((Class173_Sub1_Sub1)
		      ((Class470) this).aClass173_Sub1_Sub1_5389)
		     .anIntArray11281[i]);
	if (i_60_ != ((Class470) this).anInt5395) {
	    if (i_60_ != 0) {
		OpenGL.glBindTexture(i_60_, 0);
		OpenGL.glDisable(i_60_);
	    }
	    OpenGL.glEnable(((Class470) this).anInt5395);
	    ((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
		.anIntArray11281[i]
		= ((Class470) this).anInt5395;
	}
	OpenGL.glBindTexture(((Class470) this).anInt5395,
			     ((Class470) this).anInt5394);
    }
    
    public void method302(Class340 class340) {
	if (((Class470) this).aClass340_5390 != class340) {
	    ((Class470) this).aClass340_5390 = class340;
	    method5792();
	}
    }
    
    public void method304(Class340 class340) {
	if (((Class470) this).aClass340_5390 != class340) {
	    ((Class470) this).aClass340_5390 = class340;
	    method5792();
	}
    }
    
    void method5804() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	((Class470) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (((Class470) this).aClass340_5390 == Class340.aClass340_3585) {
	    OpenGL.glTexParameteri(((Class470) this).anInt5395, 10241,
				   ((Class470) this).aBool5399 ? 9987 : 9729);
	    OpenGL.glTexParameteri(((Class470) this).anInt5395, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(((Class470) this).anInt5395, 10241,
				   ((Class470) this).aBool5399 ? 9984 : 9728);
	    OpenGL.glTexParameteri(((Class470) this).anInt5395, 10240, 9728);
	}
    }
    
    void method5805(int i) {
	((Class470) this).aClass173_Sub1_Sub1_5389.anInt9229 -= i;
	((Class470) this).aClass173_Sub1_Sub1_5389.anInt9229 += method5794();
    }
    
    int method5806() {
	int i = (((Class470) this).aClass149_5398.anInt1686 * 427009899
		 * (((Class470) this).aClass169_5397.anInt1942 * -1009481111)
		 * ((Class470) this).anInt5400);
	return ((Class470) this).aBool5399 ? i * 4 / 3 : i;
    }
    
    public void method307(Class340 class340) {
	if (((Class470) this).aClass340_5390 != class340) {
	    ((Class470) this).aClass340_5390 = class340;
	    method5792();
	}
    }
    
    boolean method209() {
	if (((Class470) this).anInt5394 == 0)
	    throw new IllegalStateException("");
	int i = method5794();
	((Class470) this).aClass173_Sub1_Sub1_5389.method8526(this);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glEnable(((Class470) this).anInt5395);
	OpenGL.glGenerateMipmapEXT(((Class470) this).anInt5395);
	if (((Class173_Sub1_Sub1) ((Class470) this).aClass173_Sub1_Sub1_5389)
	    .aBool11283)
	    OpenGL.glDisable(((Class470) this).anInt5395);
	((Class470) this).aBool5399 = true;
	method5792();
	method5805(i);
	return true;
    }
    
    void method5807(int i) {
	((Class470) this).aClass173_Sub1_Sub1_5389.anInt9229 -= i;
	((Class470) this).aClass173_Sub1_Sub1_5389.anInt9229 += method5794();
    }
}
