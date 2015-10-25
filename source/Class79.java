/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class79 implements Definition, Interface1
{
    public int anInt809;
    Class459 aClass459_810;
    public String aString811;
    public boolean aBool812 = true;
    
    Class79() {
	/* empty */
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 10);
	    if (i_0_ == 0)
		break;
	    method1139(class528_sub42, i_0_, 1098800403);
	}
    }
    
    void method1139(ByteBuffer class528_sub42, int i, int i_1_) {
	if (1 == i) {
	    char c
		= Class505.method6149(class528_sub42.method9627(-2112870866),
				      1837558617);
	    ((Class79) this).aClass459_810 = Class459.method5562(c, (byte) 89);
	} else if (2 == i)
	    anInt809 = class528_sub42.readInt(-1009493419) * 879886769;
	else if (4 == i)
	    aBool812 = false;
	else if (5 == i)
	    aString811 = class528_sub42.readString(61079261);
	else if (101 == i)
	    ((Class79) this).aClass459_810
		= ((Class459)
		   Class443.method5321(Class459.method5563(364994839),
				       class528_sub42.method9719(65280),
				       1756903776));
    }
    
    public boolean method1140(short i) {
	return Class459.aClass459_5132 == ((Class79) this).aClass459_810;
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 106);
	    if (i == 0)
		break;
	    method1139(class528_sub42, i, 1334561479);
	}
    }
    
    public void method9(int i, byte i_2_) {
	/* empty */
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 36);
	    if (i == 0)
		break;
	    method1139(class528_sub42, i, 2134915173);
	}
    }
    
    void method1141(ByteBuffer class528_sub42, int i) {
	if (1 == i) {
	    char c
		= Class505.method6149(class528_sub42.method9627(-1531465881),
				      1528882307);
	    ((Class79) this).aClass459_810
		= Class459.method5562(c, (byte) -24);
	} else if (2 == i)
	    anInt809 = class528_sub42.readInt(-97031282) * 879886769;
	else if (4 == i)
	    aBool812 = false;
	else if (5 == i)
	    aString811 = class528_sub42.readString(294914244);
	else if (101 == i)
	    ((Class79) this).aClass459_810
		= ((Class459)
		   Class443.method5321(Class459.method5563(977602111),
				       class528_sub42.method9719(65280),
				       1089337458));
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    public void method8(int i) {
	/* empty */
    }
    
    public void method59() {
	/* empty */
    }
    
    void method1142(ByteBuffer class528_sub42, int i) {
	if (1 == i) {
	    char c
		= Class505.method6149(class528_sub42.method9627(-1499644061),
				      1616356612);
	    ((Class79) this).aClass459_810
		= Class459.method5562(c, (byte) -20);
	} else if (2 == i)
	    anInt809 = class528_sub42.readInt(-1717864912) * 879886769;
	else if (4 == i)
	    aBool812 = false;
	else if (5 == i)
	    aString811 = class528_sub42.readString(926049639);
	else if (101 == i)
	    ((Class79) this).aClass459_810
		= ((Class459)
		   Class443.method5321(Class459.method5563(-1966575326),
				       class528_sub42.method9719(65280),
				       1971592374));
    }
    
    public boolean method1143() {
	return Class459.aClass459_5132 == ((Class79) this).aClass459_810;
    }
    
    public boolean method1144() {
	return Class459.aClass459_5132 == ((Class79) this).aClass459_810;
    }
    
    static final void method1145(Class648 class648, int i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class33.aClass46_314.method861(i_3_, (byte) -84)
		  .method10476(1826728356);
    }
    
    static ClientPacket method1146(int i, long l) {
	ClientPacket.aBool11565 = false;
	ClientPacket class528_sub21_sub7
	    = (ClientPacket) ClientPacket.aClass692_11552
					.method8137((long) i << 56 | l);
	if (null == class528_sub21_sub7) {
	    class528_sub21_sub7 = new ClientPacket(i, l);
	    ClientPacket.aClass692_11552.method8142
		(class528_sub21_sub7,
		 class528_sub21_sub7.aLong7107 * -4849232331708333273L);
	    ClientPacket.aBool11565 = true;
	}
	return class528_sub21_sub7;
    }
    
    static final void method1147(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	Class365.aClass218_3848.method3109((((Class648) class648)
					    .anIntArray8394
					    [717927929 * (((Class648) class648)
							  .anInt8395)]),
					   255, (byte) 11);
    }
}
