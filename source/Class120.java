/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class120
{
    int anInt1485;
    Class149 aClass149_1486;
    static final int anInt1487 = 34037;
    static final int anInt1488 = 3553;
    static final int anInt1489 = 32879;
    static final int anInt1490 = 5121;
    Class173_Sub2 aClass173_Sub2_1491;
    static int[] anIntArray1492 = new int[1];
    int anInt1493;
    static final int anInt1494 = 34067;
    Class169 aClass169_1495;
    boolean aBool1496;
    boolean aBool1497 = false;
    int anInt1498;
    static final int anInt1499 = 3552;
    
    void method1545(boolean bool) {
	if (((Class120) this).aBool1497 != bool) {
	    ((Class120) this).aBool1497 = bool;
	    method1546();
	}
    }
    
    void method1546() {
	((Class120) this).aClass173_Sub2_1491.method8775(this);
	if (((Class120) this).aBool1497) {
	    OpenGL.glTexParameteri(((Class120) this).anInt1493, 10241,
				   ((Class120) this).aBool1496 ? 9987 : 9729);
	    OpenGL.glTexParameteri(((Class120) this).anInt1493, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(((Class120) this).anInt1493, 10241,
				   ((Class120) this).aBool1496 ? 9984 : 9728);
	    OpenGL.glTexParameteri(((Class120) this).anInt1493, 10240, 9728);
	}
    }
    
    boolean method1547() {
	if (((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491)
	    .aBool9506) {
	    int i = method1551();
	    ((Class120) this).aClass173_Sub2_1491.method8775(this);
	    OpenGL.glGenerateMipmapEXT(((Class120) this).anInt1493);
	    ((Class120) this).aBool1496 = true;
	    method1546();
	    method1550(i);
	    return true;
	}
	return false;
    }
    
    void method1548() {
	if (((Class120) this).anInt1485 != 0) {
	    ((Class120) this).aClass173_Sub2_1491
		.method8794(((Class120) this).anInt1485, method1551());
	    ((Class120) this).anInt1485 = 0;
	}
    }
    
    void method1549() {
	if (((Class120) this).anInt1485 != 0) {
	    ((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491).anInt9526
		-= method1551();
	    int[] is = new int[1];
	    is[0] = ((Class120) this).anInt1485;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class120) this).anInt1485 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	method1573();
	super.finalize();
    }
    
    void method1550(int i) {
	((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491).anInt9526 -= i;
	((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491).anInt9526
	    += method1551();
    }
    
    int method1551() {
	int i = (((Class120) this).aClass149_1486.anInt1686 * 427009899
		 * (((Class120) this).aClass169_1495.anInt1942 * -1009481111)
		 * ((Class120) this).anInt1498);
	return ((Class120) this).aBool1496 ? i * 4 / 3 : i;
    }
    
    static void method1552(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_, int[] is) {
	if (i_1_ > 0 && !Class507.method6152(i_1_, 1837575461))
	    throw new IllegalArgumentException("");
	if (i_2_ > 0 && !Class507.method6152(i_2_, 1301448268))
	    throw new IllegalArgumentException("");
	if (i_3_ != 32993)
	    throw new IllegalArgumentException("");
	int i_5_ = 0;
	int i_6_ = i_1_ < i_2_ ? i_1_ : i_2_;
	int i_7_ = i_1_ >> 1;
	int i_8_ = i_2_ >> 1;
	int[] is_9_ = is;
	int[] is_10_ = new int[i_7_ * i_8_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_5_, i_0_, i_1_, i_2_, 0, i_3_, i_4_,
				 is_9_, 0);
	    if (i_6_ <= 1)
		break;
	    int i_11_ = 0;
	    int i_12_ = 0;
	    int i_13_ = i_12_ + i_1_;
	    for (int i_14_ = 0; i_14_ < i_8_; i_14_++) {
		for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
		    int i_16_ = is_9_[i_12_++];
		    int i_17_ = is_9_[i_12_++];
		    int i_18_ = is_9_[i_13_++];
		    int i_19_ = is_9_[i_13_++];
		    int i_20_ = i_16_ >> 24 & 0xff;
		    int i_21_ = i_16_ >> 16 & 0xff;
		    int i_22_ = i_16_ >> 8 & 0xff;
		    int i_23_ = i_16_ & 0xff;
		    i_20_ += i_17_ >> 24 & 0xff;
		    i_21_ += i_17_ >> 16 & 0xff;
		    i_22_ += i_17_ >> 8 & 0xff;
		    i_23_ += i_17_ & 0xff;
		    i_20_ += i_18_ >> 24 & 0xff;
		    i_21_ += i_18_ >> 16 & 0xff;
		    i_22_ += i_18_ >> 8 & 0xff;
		    i_23_ += i_18_ & 0xff;
		    i_20_ += i_19_ >> 24 & 0xff;
		    i_21_ += i_19_ >> 16 & 0xff;
		    i_22_ += i_19_ >> 8 & 0xff;
		    i_23_ += i_19_ & 0xff;
		    is_10_[i_11_++]
			= ((i_20_ & 0x3fc) << 22 | (i_21_ & 0x3fc) << 14
			   | (i_22_ & 0x3fc) << 6 | (i_23_ & 0x3fc) >> 2);
		}
		i_12_ += i_1_;
		i_13_ += i_1_;
	    }
	    int[] is_24_ = is_10_;
	    is_10_ = is_9_;
	    is_9_ = is_24_;
	    i_1_ = i_7_;
	    i_2_ = i_8_;
	    i_7_ >>= 1;
	    i_8_ >>= 1;
	    i_6_ >>= 1;
	    i_5_++;
	}
    }
    
    static void method1553(int i, int i_25_, int i_26_, int i_27_,
			   Class149 class149, byte[] is) {
	if (i_26_ > 0 && !Class507.method6152(i_26_, 1651023031))
	    throw new IllegalArgumentException("");
	if (i_27_ > 0 && !Class507.method6152(i_27_, 1732046617))
	    throw new IllegalArgumentException("");
	int i_28_ = class149.anInt1686 * 427009899;
	int i_29_ = 0;
	int i_30_ = i_26_ < i_27_ ? i_26_ : i_27_;
	int i_31_ = i_26_ >> 1;
	int i_32_ = i_27_ >> 1;
	byte[] is_33_ = is;
	byte[] is_34_ = new byte[i_31_ * i_32_ * i_28_];
	for (;;) {
	    OpenGL.glTexImage2Dub(i, i_29_, i_25_, i_26_, i_27_, 0,
				  Class173_Sub2.method8797(class149), 5121,
				  is_33_, 0);
	    if (i_30_ <= 1)
		break;
	    int i_35_ = i_26_ * i_28_;
	    for (int i_36_ = 0; i_36_ < i_28_; i_36_++) {
		int i_37_ = i_36_;
		int i_38_ = i_36_;
		int i_39_ = i_38_ + i_35_;
		for (int i_40_ = 0; i_40_ < i_32_; i_40_++) {
		    for (int i_41_ = 0; i_41_ < i_31_; i_41_++) {
			int i_42_ = is_33_[i_38_];
			i_38_ += i_28_;
			i_42_ += is_33_[i_38_];
			i_38_ += i_28_;
			i_42_ += is_33_[i_39_];
			i_39_ += i_28_;
			i_42_ += is_33_[i_39_];
			i_39_ += i_28_;
			is_34_[i_37_] = (byte) (i_42_ >> 2);
			i_37_ += i_28_;
		    }
		    i_38_ += i_35_;
		    i_39_ += i_35_;
		}
	    }
	    byte[] is_43_ = is_34_;
	    is_34_ = is_33_;
	    is_33_ = is_43_;
	    i_26_ = i_31_;
	    i_27_ = i_32_;
	    i_31_ >>= 1;
	    i_32_ >>= 1;
	    i_30_ >>= 1;
	    i_29_++;
	}
    }
    
    static void method1554(int i, int i_44_, int i_45_, int i_46_,
			   Class149 class149, float[] fs) {
	if (i_45_ > 0 && !Class507.method6152(i_45_, 1601283631))
	    throw new IllegalArgumentException("");
	if (i_46_ > 0 && !Class507.method6152(i_46_, 1053214743))
	    throw new IllegalArgumentException("");
	int i_47_ = class149.anInt1686 * 427009899;
	int i_48_ = 0;
	int i_49_ = i_45_ < i_46_ ? i_45_ : i_46_;
	int i_50_ = i_45_ >> 1;
	int i_51_ = i_46_ >> 1;
	float[] fs_52_ = fs;
	float[] fs_53_ = new float[i_50_ * i_51_ * i_47_];
	for (;;) {
	    OpenGL.glTexImage2Df(i, i_48_, i_44_, i_45_, i_46_, 0,
				 Class173_Sub2.method8797(class149), 5126,
				 fs_52_, 0);
	    if (i_49_ <= 1)
		break;
	    int i_54_ = i_45_ * i_47_;
	    for (int i_55_ = 0; i_55_ < i_47_; i_55_++) {
		int i_56_ = i_55_;
		int i_57_ = i_55_;
		int i_58_ = i_57_ + i_54_;
		for (int i_59_ = 0; i_59_ < i_51_; i_59_++) {
		    for (int i_60_ = 0; i_60_ < i_50_; i_60_++) {
			float f = fs_52_[i_57_];
			i_57_ += i_47_;
			f += fs_52_[i_57_];
			i_57_ += i_47_;
			f += fs_52_[i_58_];
			i_58_ += i_47_;
			f += fs_52_[i_58_];
			i_58_ += i_47_;
			fs_53_[i_56_] = f * 0.25F;
			i_56_ += i_47_;
		    }
		    i_57_ += i_54_;
		    i_58_ += i_54_;
		}
	    }
	    float[] fs_61_ = fs_53_;
	    fs_53_ = fs_52_;
	    fs_52_ = fs_61_;
	    i_45_ = i_50_;
	    i_46_ = i_51_;
	    i_50_ >>= 1;
	    i_51_ >>= 1;
	    i_49_ >>= 1;
	    i_48_++;
	}
    }
    
    void method1555() throws Throwable {
	method1573();
	super.finalize();
    }
    
    void method1556() throws Throwable {
	method1573();
	super.finalize();
    }
    
    boolean method1557() {
	if (((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491)
	    .aBool9506) {
	    int i = method1551();
	    ((Class120) this).aClass173_Sub2_1491.method8775(this);
	    OpenGL.glGenerateMipmapEXT(((Class120) this).anInt1493);
	    ((Class120) this).aBool1496 = true;
	    method1546();
	    method1550(i);
	    return true;
	}
	return false;
    }
    
    void method1558() throws Throwable {
	method1573();
	super.finalize();
    }
    
    void method1559(boolean bool) {
	if (((Class120) this).aBool1496 != bool) {
	    int i = method1551();
	    ((Class120) this).aBool1496 = true;
	    method1546();
	    method1550(i);
	}
    }
    
    void method1560(boolean bool) {
	if (((Class120) this).aBool1497 != bool) {
	    ((Class120) this).aBool1497 = bool;
	    method1546();
	}
    }
    
    boolean method1561() {
	if (((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491)
	    .aBool9506) {
	    int i = method1551();
	    ((Class120) this).aClass173_Sub2_1491.method8775(this);
	    OpenGL.glGenerateMipmapEXT(((Class120) this).anInt1493);
	    ((Class120) this).aBool1496 = true;
	    method1546();
	    method1550(i);
	    return true;
	}
	return false;
    }
    
    boolean method1562() {
	if (((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491)
	    .aBool9506) {
	    int i = method1551();
	    ((Class120) this).aClass173_Sub2_1491.method8775(this);
	    OpenGL.glGenerateMipmapEXT(((Class120) this).anInt1493);
	    ((Class120) this).aBool1496 = true;
	    method1546();
	    method1550(i);
	    return true;
	}
	return false;
    }
    
    void method1563() throws Throwable {
	method1573();
	super.finalize();
    }
    
    void method1564(boolean bool) {
	if (((Class120) this).aBool1496 != bool) {
	    int i = method1551();
	    ((Class120) this).aBool1496 = true;
	    method1546();
	    method1550(i);
	}
    }
    
    void method1565(boolean bool) {
	if (((Class120) this).aBool1497 != bool) {
	    ((Class120) this).aBool1497 = bool;
	    method1546();
	}
    }
    
    void method1566() {
	if (((Class120) this).anInt1485 != 0) {
	    ((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491).anInt9526
		-= method1551();
	    int[] is = new int[1];
	    is[0] = ((Class120) this).anInt1485;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class120) this).anInt1485 = 0;
	}
    }
    
    void method1567() {
	if (((Class120) this).anInt1485 != 0) {
	    ((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491).anInt9526
		-= method1551();
	    int[] is = new int[1];
	    is[0] = ((Class120) this).anInt1485;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class120) this).anInt1485 = 0;
	}
    }
    
    void method1568() {
	if (((Class120) this).anInt1485 != 0) {
	    ((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491).anInt9526
		-= method1551();
	    int[] is = new int[1];
	    is[0] = ((Class120) this).anInt1485;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class120) this).anInt1485 = 0;
	}
    }
    
    void method1569(boolean bool) {
	if (((Class120) this).aBool1496 != bool) {
	    int i = method1551();
	    ((Class120) this).aBool1496 = true;
	    method1546();
	    method1550(i);
	}
    }
    
    void method1570(int i) {
	((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491).anInt9526 -= i;
	((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491).anInt9526
	    += method1551();
    }
    
    int method1571() {
	int i = (((Class120) this).aClass149_1486.anInt1686 * 427009899
		 * (((Class120) this).aClass169_1495.anInt1942 * -1009481111)
		 * ((Class120) this).anInt1498);
	return ((Class120) this).aBool1496 ? i * 4 / 3 : i;
    }
    
    int method1572() {
	int i = (((Class120) this).aClass149_1486.anInt1686 * 427009899
		 * (((Class120) this).aClass169_1495.anInt1942 * -1009481111)
		 * ((Class120) this).anInt1498);
	return ((Class120) this).aBool1496 ? i * 4 / 3 : i;
    }
    
    void method1573() {
	if (((Class120) this).anInt1485 != 0) {
	    ((Class120) this).aClass173_Sub2_1491
		.method8794(((Class120) this).anInt1485, method1551());
	    ((Class120) this).anInt1485 = 0;
	}
    }
    
    int method1574() {
	int i = (((Class120) this).aClass149_1486.anInt1686 * 427009899
		 * (((Class120) this).aClass169_1495.anInt1942 * -1009481111)
		 * ((Class120) this).anInt1498);
	return ((Class120) this).aBool1496 ? i * 4 / 3 : i;
    }
    
    void method1575() {
	if (((Class120) this).anInt1485 != 0) {
	    ((Class173_Sub2) ((Class120) this).aClass173_Sub2_1491).anInt9526
		-= method1551();
	    int[] is = new int[1];
	    is[0] = ((Class120) this).anInt1485;
	    OpenGL.glDeleteTextures(1, is, 0);
	    ((Class120) this).anInt1485 = 0;
	}
    }
    
    Class120(Class173_Sub2 class173_sub2, int i, Class149 class149,
	     Class169 class169, int i_62_, boolean bool) {
	((Class120) this).aClass173_Sub2_1491 = class173_sub2;
	((Class120) this).anInt1493 = i;
	((Class120) this).aClass149_1486 = class149;
	((Class120) this).aClass169_1495 = class169;
	((Class120) this).aBool1496 = bool;
	((Class120) this).anInt1498 = i_62_;
	OpenGL.glGenTextures(1, anIntArray1492, 0);
	((Class120) this).anInt1485 = anIntArray1492[0];
	method1550(0);
    }
}
