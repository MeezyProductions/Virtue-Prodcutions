/* Class680 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class680 implements Definition, Interface1
{
    public boolean aBool8565;
    public int anInt8566;
    public int anInt8567;
    public int anInt8568;
    public boolean aBool8569;
    public int anInt8570;
    public int anInt8571;
    public int anInt8572;
    int anInt8573 = 0;
    
    public void method59() {
	/* empty */
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 25);
	    if (i_0_ == 0)
		break;
	    method7971(class528_sub42, i_0_, (byte) 11);
	}
    }
    
    void method7971(ByteBuffer class528_sub42, int i, byte i_1_) {
	if (i == 1) {
	    ((Class680) this).anInt8573
		= class528_sub42.readTriByte(770506796) * 1476779195;
	    method7972(((Class680) this).anInt8573 * 1743259763, 639889181);
	} else if (i == 2) {
	    anInt8566 = class528_sub42.readUnsignedShort(-1907274774) * -1271412243;
	    if (65535 == anInt8566 * 468843493)
		anInt8566 = 1271412243;
	} else if (i == 3)
	    anInt8567
		= (class528_sub42.readUnsignedShort(-1940830476) << 2) * -94268315;
	else if (i == 4)
	    aBool8565 = false;
	else if (5 == i)
	    aBool8569 = false;
    }
    
    void method7972(int i, int i_2_) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_3_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_4_ = (double) (i & 0xff) / 256.0;
	double d_5_ = d;
	if (d_3_ < d_5_)
	    d_5_ = d_3_;
	if (d_4_ < d_5_)
	    d_5_ = d_4_;
	double d_6_ = d;
	if (d_3_ > d_6_)
	    d_6_ = d_3_;
	if (d_4_ > d_6_)
	    d_6_ = d_4_;
	double d_7_ = 0.0;
	double d_8_ = 0.0;
	double d_9_ = (d_5_ + d_6_) / 2.0;
	if (d_6_ != d_5_) {
	    if (d_9_ < 0.5)
		d_8_ = (d_6_ - d_5_) / (d_6_ + d_5_);
	    if (d_9_ >= 0.5)
		d_8_ = (d_6_ - d_5_) / (2.0 - d_6_ - d_5_);
	    if (d_6_ == d)
		d_7_ = (d_3_ - d_4_) / (d_6_ - d_5_);
	    else if (d_6_ == d_3_)
		d_7_ = (d_4_ - d) / (d_6_ - d_5_) + 2.0;
	    else if (d_6_ == d_4_)
		d_7_ = (d - d_3_) / (d_6_ - d_5_) + 4.0;
	}
	d_7_ /= 6.0;
	anInt8571 = (int) (256.0 * d_8_) * -894517363;
	anInt8572 = -1879109145 * (int) (d_9_ * 256.0);
	if (anInt8571 * -207840443 < 0)
	    anInt8571 = 0;
	else if (-207840443 * anInt8571 > 255)
	    anInt8571 = -468660877;
	if (-1393069609 * anInt8572 < 0)
	    anInt8572 = 0;
	else if (-1393069609 * anInt8572 > 255)
	    anInt8572 = 1863505177;
	if (d_9_ > 0.5)
	    anInt8568 = -87041905 * (int) (d_8_ * (1.0 - d_9_) * 512.0);
	else
	    anInt8568 = -87041905 * (int) (512.0 * (d_8_ * d_9_));
	if (-1145682321 * anInt8568 < 1)
	    anInt8568 = -87041905;
	anInt8570
	    = (int) (d_7_ * (double) (anInt8568 * -1145682321)) * 1024786823;
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    void method7973(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_10_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_11_ = (double) (i & 0xff) / 256.0;
	double d_12_ = d;
	if (d_10_ < d_12_)
	    d_12_ = d_10_;
	if (d_11_ < d_12_)
	    d_12_ = d_11_;
	double d_13_ = d;
	if (d_10_ > d_13_)
	    d_13_ = d_10_;
	if (d_11_ > d_13_)
	    d_13_ = d_11_;
	double d_14_ = 0.0;
	double d_15_ = 0.0;
	double d_16_ = (d_12_ + d_13_) / 2.0;
	if (d_13_ != d_12_) {
	    if (d_16_ < 0.5)
		d_15_ = (d_13_ - d_12_) / (d_13_ + d_12_);
	    if (d_16_ >= 0.5)
		d_15_ = (d_13_ - d_12_) / (2.0 - d_13_ - d_12_);
	    if (d_13_ == d)
		d_14_ = (d_10_ - d_11_) / (d_13_ - d_12_);
	    else if (d_13_ == d_10_)
		d_14_ = (d_11_ - d) / (d_13_ - d_12_) + 2.0;
	    else if (d_13_ == d_11_)
		d_14_ = (d - d_10_) / (d_13_ - d_12_) + 4.0;
	}
	d_14_ /= 6.0;
	anInt8571 = (int) (256.0 * d_15_) * -894517363;
	anInt8572 = -1879109145 * (int) (d_16_ * 256.0);
	if (anInt8571 * -207840443 < 0)
	    anInt8571 = 0;
	else if (-207840443 * anInt8571 > 255)
	    anInt8571 = -468660877;
	if (-1393069609 * anInt8572 < 0)
	    anInt8572 = 0;
	else if (-1393069609 * anInt8572 > 255)
	    anInt8572 = 1863505177;
	if (d_16_ > 0.5)
	    anInt8568 = -87041905 * (int) (d_15_ * (1.0 - d_16_) * 512.0);
	else
	    anInt8568 = -87041905 * (int) (512.0 * (d_15_ * d_16_));
	if (-1145682321 * anInt8568 < 1)
	    anInt8568 = -87041905;
	anInt8570
	    = (int) (d_14_ * (double) (anInt8568 * -1145682321)) * 1024786823;
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 50);
	    if (i == 0)
		break;
	    method7971(class528_sub42, i, (byte) 96);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 113);
	    if (i == 0)
		break;
	    method7971(class528_sub42, i, (byte) 85);
	}
    }
    
    void method7974(int i) {
	double d = (double) (i >> 16 & 0xff) / 256.0;
	double d_17_ = (double) (i >> 8 & 0xff) / 256.0;
	double d_18_ = (double) (i & 0xff) / 256.0;
	double d_19_ = d;
	if (d_17_ < d_19_)
	    d_19_ = d_17_;
	if (d_18_ < d_19_)
	    d_19_ = d_18_;
	double d_20_ = d;
	if (d_17_ > d_20_)
	    d_20_ = d_17_;
	if (d_18_ > d_20_)
	    d_20_ = d_18_;
	double d_21_ = 0.0;
	double d_22_ = 0.0;
	double d_23_ = (d_19_ + d_20_) / 2.0;
	if (d_20_ != d_19_) {
	    if (d_23_ < 0.5)
		d_22_ = (d_20_ - d_19_) / (d_20_ + d_19_);
	    if (d_23_ >= 0.5)
		d_22_ = (d_20_ - d_19_) / (2.0 - d_20_ - d_19_);
	    if (d_20_ == d)
		d_21_ = (d_17_ - d_18_) / (d_20_ - d_19_);
	    else if (d_20_ == d_17_)
		d_21_ = (d_18_ - d) / (d_20_ - d_19_) + 2.0;
	    else if (d_20_ == d_18_)
		d_21_ = (d - d_17_) / (d_20_ - d_19_) + 4.0;
	}
	d_21_ /= 6.0;
	anInt8571 = (int) (256.0 * d_22_) * -894517363;
	anInt8572 = -1879109145 * (int) (d_23_ * 256.0);
	if (anInt8571 * -207840443 < 0)
	    anInt8571 = 0;
	else if (-207840443 * anInt8571 > 255)
	    anInt8571 = -468660877;
	if (-1393069609 * anInt8572 < 0)
	    anInt8572 = 0;
	else if (-1393069609 * anInt8572 > 255)
	    anInt8572 = 1863505177;
	if (d_23_ > 0.5)
	    anInt8568 = -87041905 * (int) (d_22_ * (1.0 - d_23_) * 512.0);
	else
	    anInt8568 = -87041905 * (int) (512.0 * (d_22_ * d_23_));
	if (-1145682321 * anInt8568 < 1)
	    anInt8568 = -87041905;
	anInt8570
	    = (int) (d_21_ * (double) (anInt8568 * -1145682321)) * 1024786823;
    }
    
    public void method8(int i) {
	/* empty */
    }
    
    void method7975(ByteBuffer class528_sub42, int i) {
	if (i == 1) {
	    ((Class680) this).anInt8573
		= class528_sub42.readTriByte(-669158473) * 1476779195;
	    method7972(((Class680) this).anInt8573 * 1743259763, 639889181);
	} else if (i == 2) {
	    anInt8566 = class528_sub42.readUnsignedShort(-1791936426) * -1271412243;
	    if (65535 == anInt8566 * 468843493)
		anInt8566 = 1271412243;
	} else if (i == 3)
	    anInt8567
		= (class528_sub42.readUnsignedShort(-1073370956) << 2) * -94268315;
	else if (i == 4)
	    aBool8565 = false;
	else if (5 == i)
	    aBool8569 = false;
    }
    
    Class680() {
	anInt8566 = 1271412243;
	anInt8567 = -1020737024;
	aBool8565 = true;
	aBool8569 = true;
    }
    
    public void method9(int i, byte i_24_) {
	/* empty */
    }
    
    void method7976(ByteBuffer class528_sub42, int i) {
	if (i == 1) {
	    ((Class680) this).anInt8573
		= class528_sub42.readTriByte(-160432766) * 1476779195;
	    method7972(((Class680) this).anInt8573 * 1743259763, 639889181);
	} else if (i == 2) {
	    anInt8566 = class528_sub42.readUnsignedShort(-1260279593) * -1271412243;
	    if (65535 == anInt8566 * 468843493)
		anInt8566 = 1271412243;
	} else if (i == 3)
	    anInt8567
		= (class528_sub42.readUnsignedShort(-1588652776) << 2) * -94268315;
	else if (i == 4)
	    aBool8565 = false;
	else if (5 == i)
	    aBool8569 = false;
    }
    
    void method7977(ByteBuffer class528_sub42, int i) {
	if (i == 1) {
	    ((Class680) this).anInt8573
		= class528_sub42.readTriByte(1643828674) * 1476779195;
	    method7972(((Class680) this).anInt8573 * 1743259763, 639889181);
	} else if (i == 2) {
	    anInt8566 = class528_sub42.readUnsignedShort(-75897498) * -1271412243;
	    if (65535 == anInt8566 * 468843493)
		anInt8566 = 1271412243;
	} else if (i == 3)
	    anInt8567
		= (class528_sub42.readUnsignedShort(-2058098235) << 2) * -94268315;
	else if (i == 4)
	    aBool8565 = false;
	else if (5 == i)
	    aBool8569 = false;
    }
    
    static final void method7978(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 6 == -1860881523 * Class390.anInt4111 ? 1 : 0;
    }
    
    static void method7979(int i) {
	Class581.aBool7637 = false;
	Class35.anIntArray330 = null;
	Class463.anIntArray5301 = null;
	Class581.aLinkedList7640.clear();
	Class581.aLinkedList7633.clear();
	Class587.aClass173_7714.method2342();
    }
}
