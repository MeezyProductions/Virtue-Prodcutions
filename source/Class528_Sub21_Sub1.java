/* Class528_Sub21_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub21_Sub1 extends Class528_Sub21
    implements Definition, Interface1
{
    Class692 aClass692_11194;
    static boolean aBool11195;
    
    public String method10271(int i, String string) {
	if (((Class528_Sub21_Sub1) this).aClass692_11194 == null)
	    return string;
	Class528_Sub31 class528_sub31
	    = (Class528_Sub31) ((Class528_Sub21_Sub1) this).aClass692_11194
				   .method8137((long) i);
	if (class528_sub31 == null)
	    return string;
	return (String) class528_sub31.anObject10468;
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 40);
	    if (i_0_ == 0)
		break;
	    method10276(class528_sub42, i_0_, -872966101);
	}
    }
    
    public int method10272(int i, int i_1_, int i_2_) {
	if (null == ((Class528_Sub21_Sub1) this).aClass692_11194)
	    return i_1_;
	Class528_Sub17 class528_sub17
	    = (Class528_Sub17) ((Class528_Sub21_Sub1) this).aClass692_11194
				   .method8137((long) i);
	if (null == class528_sub17)
	    return i_1_;
	return 870949851 * class528_sub17.anInt10388;
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 31);
	    if (i == 0)
		break;
	    method10276(class528_sub42, i, -872966101);
	}
    }
    
    public String method10273(int i, String string, int i_3_) {
	if (((Class528_Sub21_Sub1) this).aClass692_11194 == null)
	    return string;
	Class528_Sub31 class528_sub31
	    = (Class528_Sub31) ((Class528_Sub21_Sub1) this).aClass692_11194
				   .method8137((long) i);
	if (class528_sub31 == null)
	    return string;
	return (String) class528_sub31.anObject10468;
    }
    
    void method10274(ByteBuffer class528_sub42, int i) {
	if (249 == i) {
	    int i_4_ = class528_sub42.readUnsignedByte((byte) 13);
	    if (null == ((Class528_Sub21_Sub1) this).aClass692_11194) {
		int i_5_ = Class327.method4259(i_4_, -2134279851);
		((Class528_Sub21_Sub1) this).aClass692_11194
		    = new Class692(i_5_);
	    }
	    for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
		boolean bool = class528_sub42.readUnsignedByte((byte) 117) == 1;
		int i_7_ = class528_sub42.readTriByte(-1039439259);
		Node node;
		if (bool)
		    node = new Class528_Sub31(class528_sub42
						      .readString(903627537));
		else
		    node = new Class528_Sub17(class528_sub42
						      .readInt(22805894));
		((Class528_Sub21_Sub1) this).aClass692_11194
		    .method8142(node, (long) i_7_);
	    }
	}
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    public void method9(int i, byte i_8_) {
	/* empty */
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 7);
	    if (i == 0)
		break;
	    method10276(class528_sub42, i, -872966101);
	}
    }
    
    public void method59() {
	/* empty */
    }
    
    public void method8(int i) {
	/* empty */
    }
    
    Class528_Sub21_Sub1() {
	/* empty */
    }
    
    public int method10275(int i, int i_9_) {
	if (null == ((Class528_Sub21_Sub1) this).aClass692_11194)
	    return i_9_;
	Class528_Sub17 class528_sub17
	    = (Class528_Sub17) ((Class528_Sub21_Sub1) this).aClass692_11194
				   .method8137((long) i);
	if (null == class528_sub17)
	    return i_9_;
	return 870949851 * class528_sub17.anInt10388;
    }
    
    void method10276(ByteBuffer class528_sub42, int i, int i_10_) {
	if (249 == i) {
	    int i_11_ = class528_sub42.readUnsignedByte((byte) 112);
	    if (null == ((Class528_Sub21_Sub1) this).aClass692_11194) {
		int i_12_ = Class327.method4259(i_11_, -2134279851);
		((Class528_Sub21_Sub1) this).aClass692_11194
		    = new Class692(i_12_);
	    }
	    for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
		boolean bool = class528_sub42.readUnsignedByte((byte) 123) == 1;
		int i_14_ = class528_sub42.readTriByte(-1211006518);
		Node node;
		if (bool)
		    node = new Class528_Sub31(class528_sub42
						      .readString(1042233415));
		else
		    node = new Class528_Sub17(class528_sub42
						      .readInt(-423189343));
		((Class528_Sub21_Sub1) this).aClass692_11194
		    .method8142(node, (long) i_14_);
	    }
	}
    }
    
    static final void method10277(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 661123364;
	int i_15_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	int i_16_ = (((Class648) class648).anIntArray8394
		     [1 + ((Class648) class648).anInt8395 * 717927929]);
	int i_17_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395 + 2]);
	int i_18_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395 + 3]);
	i_15_ += i_16_ << 14;
	i_15_ += i_17_ << 28;
	i_15_ += i_18_;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_15_;
    }
    
    static void method10278(int i, int i_19_, int i_20_, int i_21_,
			    int i_22_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(8, (long) i);
	class528_sub21_sub7.method10496(1818163381);
	((ClientPacket) class528_sub21_sub7).anInt11543
	    = i_19_ * 1959780981;
	((ClientPacket) class528_sub21_sub7).anInt11544
	    = i_20_ * 23247007;
	((ClientPacket) class528_sub21_sub7).anInt11554
	    = -1646078671 * i_21_;
    }
}
