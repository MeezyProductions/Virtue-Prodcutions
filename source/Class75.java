/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class75 implements Definition, Interface1
{
    public int anInt786 = 0;
    public int anInt787 = 0;
    public int anInt788;
    public int anInt789 = 487237632;
    static Class689 aClass689_790;
    
    Class75() {
	anInt788 = -510429184;
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 49);
	    if (i_0_ == 0)
		break;
	    method1116(class528_sub42, i_0_, -1684113424);
	}
    }
    
    void method1116(ByteBuffer class528_sub42, int i, int i_1_) {
	if (1 == i)
	    anInt786 = class528_sub42.readUnsignedByte((byte) 66) * 385573681;
	else if (i == 2)
	    anInt788 = class528_sub42.readUnsignedShort(-661638481) * 1002189423;
	else if (3 == i)
	    anInt789 = class528_sub42.readUnsignedShort(303723029) * 633577813;
	else if (i == 4)
	    anInt787 = class528_sub42.method9642(1356358542) * -1281080489;
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 2);
	    if (i == 0)
		break;
	    method1116(class528_sub42, i, -994530878);
	}
    }
    
    public void method9(int i, byte i_2_) {
	/* empty */
    }
    
    void method1117(ByteBuffer class528_sub42, int i) {
	if (1 == i)
	    anInt786 = class528_sub42.readUnsignedByte((byte) 60) * 385573681;
	else if (i == 2)
	    anInt788 = class528_sub42.readUnsignedShort(-277467039) * 1002189423;
	else if (3 == i)
	    anInt789 = class528_sub42.readUnsignedShort(151461314) * 633577813;
	else if (i == 4)
	    anInt787 = class528_sub42.method9642(-1710519346) * -1281080489;
    }
    
    public void method59() {
	/* empty */
    }
    
    public void method8(int i) {
	/* empty */
    }
    
    void method1118(ByteBuffer class528_sub42, int i) {
	if (1 == i)
	    anInt786 = class528_sub42.readUnsignedByte((byte) 59) * 385573681;
	else if (i == 2)
	    anInt788 = class528_sub42.readUnsignedShort(915481381) * 1002189423;
	else if (3 == i)
	    anInt789 = class528_sub42.readUnsignedShort(-1441296790) * 633577813;
	else if (i == 4)
	    anInt787 = class528_sub42.method9642(-984493312) * -1281080489;
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 24);
	    if (i == 0)
		break;
	    method1116(class528_sub42, i, -844185342);
	}
    }
    
    static final void method1119(Class648 class648, int i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class528_Sub21_Sub17 class528_sub21_sub17 = Class518.method6291(i_3_);
	if (class528_sub21_sub17 == null) {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	} else {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= (-1495150719 * class528_sub21_sub17.anInt11646
		   - class528_sub21_sub17.anInt11643 * -1138033051);
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= (class528_sub21_sub17.anInt11636 * 1067701203
		   - 1798192673 * class528_sub21_sub17.anInt11645);
	}
    }
}
