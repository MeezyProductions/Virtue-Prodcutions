/* Class610 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public abstract class Class610
{
    long aLong7950;
    long aLong7951;
    int anInt7952;
    Class688 aClass688_7953 = new Class688();
    int anInt7954;
    
    void method7242(int i) {
	((Class610) this).aClass688_7953.method8059((byte) -76);
	((Class610) this).aLong7951 = 7285888321289092269L;
	((Class610) this).aLong7950 = 5998922238861999285L;
	((Class610) this).anInt7952 = -2080771543;
	((Class610) this).anInt7954 = 499076597;
    }
    
    abstract int method7243();
    
    abstract void method7244(ByteBuffer class528_sub42,
			     Class528_Sub33 class528_sub33, int i);
    
    void method7245(Class528_Sub33 class528_sub33, int i) {
	((Class610) this).aClass688_7953.method8031(class528_sub33, (byte) 58);
    }
    
    int method7246(Class528_Sub33 class528_sub33, int i, int i_0_) {
	long l;
	if (-1L == -7368301318134843173L * ((Class610) this).aLong7951)
	    l = (long) i;
	else {
	    l = (class528_sub33.method9508((byte) 19)
		 - -7368301318134843173L * ((Class610) this).aLong7951);
	    if (l > (long) i)
		l = (long) i;
	}
	((Class610) this).aLong7951
	    = class528_sub33.method9508((byte) 127) * -7285888321289092269L;
	return (int) l;
    }
    
    abstract int method7247(byte i);
    
    Class610() {
	((Class610) this).aLong7951 = 7285888321289092269L;
	((Class610) this).aLong7950 = 5998922238861999285L;
	((Class610) this).anInt7952 = -2080771543;
	((Class610) this).anInt7954 = 499076597;
    }
    
    abstract void method7248(byte i);
    
    void method7249() {
	if (method7257(-2073702096)) {
	    Class528_Sub34 class528_sub34 = null;
	    int i = 0;
	    int i_1_ = 0;
	    int i_2_ = 0;
	    Iterator iterator = ((Class610) this).aClass688_7953.iterator();
	    while (iterator.hasNext()) {
		Class528_Sub33 class528_sub33
		    = (Class528_Sub33) iterator.next();
		if (null != class528_sub34
		    && ((class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			 * -185904669) - i
			>= 252 - (6 + method7247((byte) -16))))
		    break;
		class528_sub33.method6443(532463590);
		int i_3_ = class528_sub33.method9495((byte) 3);
		if (i_3_ < -1)
		    i_3_ = -1;
		else if (i_3_ > 65534)
		    i_3_ = 65534;
		int i_4_ = class528_sub33.method9494(-1236136691);
		if (i_4_ < -1)
		    i_4_ = -1;
		else if (i_4_ > 65534)
		    i_4_ = 65534;
		if (1781806567 * ((Class610) this).anInt7952 == i_4_
		    && ((Class610) this).anInt7954 * -1249064541 == i_3_)
		    class528_sub33.method9510((byte) -102);
		else {
		    if (class528_sub34 == null) {
			class528_sub34 = method7250(1091117566);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeByte(0, (byte) -3);
			i = (class528_sub34.aClass528_Sub42_Sub2_10481
			     .pointer) * -185904669;
			class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			    += -264964202;
			i_1_ = 0;
			i_2_ = 0;
		    }
		    int i_5_;
		    int i_6_;
		    int i_7_;
		    if (((Class610) this).aLong7950 * -1961510344977715613L
			!= -1L) {
			i_5_ = i_4_ - 1781806567 * ((Class610) this).anInt7952;
			i_6_
			    = i_3_ - -1249064541 * ((Class610) this).anInt7954;
			i_7_ = (int) ((class528_sub33.method9508((byte) 112)
				       - (((Class610) this).aLong7950
					  * -1961510344977715613L))
				      / 20L);
			i_1_ += (class528_sub33.method9508((byte) 62)
				 - (-1961510344977715613L
				    * ((Class610) this).aLong7950)) % 20L;
		    } else {
			i_5_ = i_4_;
			i_6_ = i_3_;
			i_7_ = 2147483647;
		    }
		    ((Class610) this).anInt7952 = i_4_ * 2080771543;
		    ((Class610) this).anInt7954 = -499076597 * i_3_;
		    if (i_7_ < 8 && i_5_ >= -32 && i_5_ <= 31 && i_6_ >= -32
			&& i_6_ <= 31) {
			i_5_ += 32;
			i_6_ += 32;
			class528_sub34.aClass528_Sub42_Sub2_10481.method9717
			    ((i_5_ << 6) + (i_7_ << 12) + i_6_, (byte) -58);
		    } else if (i_7_ < 32 && i_5_ >= -128 && i_5_ <= 127
			       && i_6_ >= -128 && i_6_ <= 127) {
			i_5_ += 128;
			i_6_ += 128;
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeByte(128 + i_7_, (byte) -68);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .method9717(i_6_ + (i_5_ << 8), (byte) -46);
		    } else if (i_7_ < 32) {
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeByte(i_7_ + 192, (byte) -100);
			if (-1 == i_4_ || i_3_ == -1)
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeInt(-2147483648, 2108652211);
			else
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeInt(i_4_ | i_3_ << 16, 2007085752);
		    } else {
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .method9717((i_7_ & 0x1fff) + 57344, (byte) 46);
			if (-1 == i_4_ || -1 == i_3_)
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeInt(-2147483648, 2119598453);
			else
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeInt(i_4_ | i_3_ << 16, 2101077666);
		    }
		    i_2_++;
		    method7244(class528_sub34.aClass528_Sub42_Sub2_10481,
			       class528_sub33, -1418143615);
		    ((Class610) this).aLong7950
			= (class528_sub33.method9508((byte) 123)
			   * -5998922238861999285L);
		    class528_sub33.method9510((byte) -7);
		}
	    }
	    if (null != class528_sub34) {
		class528_sub34.aClass528_Sub42_Sub2_10481.method9662
		    ((class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		      * -185904669) - i,
		     (byte) 45);
		int i_8_
		    = (class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		       * -185904669);
		class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		    = 2015001547 * i;
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(i_1_ / i_2_, (byte) 67);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(i_1_ % i_2_, (byte) 15);
		class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		    = i_8_ * 2015001547;
		client.aClass109_10930.method1380(class528_sub34, 1252568014);
	    }
	}
	method7248((byte) 10);
    }
    
    abstract Class528_Sub34 method7250(int i);
    
    abstract void method7251();
    
    abstract void method7252();
    
    abstract void method7253();
    
    abstract void method7254();
    
    abstract boolean method7255();
    
    abstract Class528_Sub34 method7256();
    
    abstract boolean method7257(int i);
    
    abstract int method7258();
    
    abstract void method7259(ByteBuffer class528_sub42,
			     Class528_Sub33 class528_sub33);
    
    abstract void method7260(ByteBuffer class528_sub42,
			     Class528_Sub33 class528_sub33);
    
    abstract void method7261(ByteBuffer class528_sub42,
			     Class528_Sub33 class528_sub33);
    
    void method7262() {
	((Class610) this).aClass688_7953.method8059((byte) -20);
	((Class610) this).aLong7951 = 7285888321289092269L;
	((Class610) this).aLong7950 = 5998922238861999285L;
	((Class610) this).anInt7952 = -2080771543;
	((Class610) this).anInt7954 = 499076597;
    }
    
    void method7263() {
	((Class610) this).aClass688_7953.method8059((byte) -80);
	((Class610) this).aLong7951 = 7285888321289092269L;
	((Class610) this).aLong7950 = 5998922238861999285L;
	((Class610) this).anInt7952 = -2080771543;
	((Class610) this).anInt7954 = 499076597;
    }
    
    abstract int method7264();
    
    void method7265(byte i) {
	if (method7257(-2073702096)) {
	    Class528_Sub34 class528_sub34 = null;
	    int i_9_ = 0;
	    int i_10_ = 0;
	    int i_11_ = 0;
	    Iterator iterator = ((Class610) this).aClass688_7953.iterator();
	    while (iterator.hasNext()) {
		Class528_Sub33 class528_sub33
		    = (Class528_Sub33) iterator.next();
		if (null != class528_sub34
		    && ((class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			 * -185904669) - i_9_
			>= 252 - (6 + method7247((byte) -49))))
		    break;
		class528_sub33.method6443(-2004516809);
		int i_12_ = class528_sub33.method9495((byte) 3);
		if (i_12_ < -1)
		    i_12_ = -1;
		else if (i_12_ > 65534)
		    i_12_ = 65534;
		int i_13_ = class528_sub33.method9494(-1236136691);
		if (i_13_ < -1)
		    i_13_ = -1;
		else if (i_13_ > 65534)
		    i_13_ = 65534;
		if (1781806567 * ((Class610) this).anInt7952 == i_13_
		    && ((Class610) this).anInt7954 * -1249064541 == i_12_)
		    class528_sub33.method9510((byte) -10);
		else {
		    if (class528_sub34 == null) {
			class528_sub34 = method7250(-1848500784);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeByte(0, (byte) -52);
			i_9_ = (class528_sub34.aClass528_Sub42_Sub2_10481
				.pointer) * -185904669;
			class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			    += -264964202;
			i_10_ = 0;
			i_11_ = 0;
		    }
		    int i_14_;
		    int i_15_;
		    int i_16_;
		    if (((Class610) this).aLong7950 * -1961510344977715613L
			!= -1L) {
			i_14_
			    = i_13_ - 1781806567 * ((Class610) this).anInt7952;
			i_15_ = (i_12_
				 - -1249064541 * ((Class610) this).anInt7954);
			i_16_ = (int) ((class528_sub33.method9508((byte) 79)
					- (((Class610) this).aLong7950
					   * -1961510344977715613L))
				       / 20L);
			i_10_ += (class528_sub33.method9508((byte) 104)
				  - (-1961510344977715613L
				     * ((Class610) this).aLong7950)) % 20L;
		    } else {
			i_14_ = i_13_;
			i_15_ = i_12_;
			i_16_ = 2147483647;
		    }
		    ((Class610) this).anInt7952 = i_13_ * 2080771543;
		    ((Class610) this).anInt7954 = -499076597 * i_12_;
		    if (i_16_ < 8 && i_14_ >= -32 && i_14_ <= 31
			&& i_15_ >= -32 && i_15_ <= 31) {
			i_14_ += 32;
			i_15_ += 32;
			class528_sub34.aClass528_Sub42_Sub2_10481.method9717
			    ((i_14_ << 6) + (i_16_ << 12) + i_15_, (byte) 42);
		    } else if (i_16_ < 32 && i_14_ >= -128 && i_14_ <= 127
			       && i_15_ >= -128 && i_15_ <= 127) {
			i_14_ += 128;
			i_15_ += 128;
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeByte(128 + i_16_, (byte) 45);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .method9717(i_15_ + (i_14_ << 8), (byte) 16);
		    } else if (i_16_ < 32) {
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeByte(i_16_ + 192, (byte) -53);
			if (-1 == i_13_ || i_12_ == -1)
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeInt(-2147483648, 2115676674);
			else
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeInt(i_13_ | i_12_ << 16, 2040016924);
		    } else {
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .method9717((i_16_ & 0x1fff) + 57344, (byte) 75);
			if (-1 == i_13_ || -1 == i_12_)
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeInt(-2147483648, 2099276093);
			else
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeInt(i_13_ | i_12_ << 16, 2123839612);
		    }
		    i_11_++;
		    method7244(class528_sub34.aClass528_Sub42_Sub2_10481,
			       class528_sub33, -1605862460);
		    ((Class610) this).aLong7950
			= (class528_sub33.method9508((byte) 7)
			   * -5998922238861999285L);
		    class528_sub33.method9510((byte) -107);
		}
	    }
	    if (null != class528_sub34) {
		class528_sub34.aClass528_Sub42_Sub2_10481.method9662
		    ((class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		      * -185904669) - i_9_,
		     (byte) 18);
		int i_17_
		    = (class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		       * -185904669);
		class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		    = 2015001547 * i_9_;
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(i_10_ / i_11_, (byte) -61);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeByte(i_10_ % i_11_, (byte) 91);
		class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		    = i_17_ * 2015001547;
		client.aClass109_10930.method1380(class528_sub34, 290554184);
	    }
	}
	method7248((byte) 96);
    }
    
    static final void method7266(Class648 class648, int i) {
	int i_18_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_18_, (byte) -121);
	Class226 class226 = Class380.aClass226Array3970[i_18_ >> 16];
	Class229.method3234(class229, class226, class648, (byte) -19);
    }
    
    static final void method7267(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2383
	    = Class181_Sub23.method8999(string, class648, (byte) -24);
	class229.aBool2483 = true;
    }
    
    public static int method7268(ModeWhere modeWhere, Class678 class678, int i,
				 byte i_19_) {
	if (ModeWhere.LIVE == modeWhere)
	    return 443;
	return 50000 + i;
    }
    
    static final void method7269(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	long l = (long) (((Class648) class648).anIntArray8394
			 [717927929 * ((Class648) class648).anInt8395]);
	long l_20_
	    = (long) (((Class648) class648).anIntArray8394
		      [((Class648) class648).anInt8395 * 717927929 + 1]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) (l + l_20_ * l / 100L);
    }
}
