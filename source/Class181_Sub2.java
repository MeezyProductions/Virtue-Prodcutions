/* Class181_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class181_Sub2 extends Class181
{
    int anInt9387;
    int anInt9388;
    int anInt9389;
    int anInt9390;
    int anInt9391;
    
    public void method2675(byte i) {
	Class181_Sub15.method8967
	    (((Class181_Sub2) this).anInt9391 * -140411473,
	     ((Class181_Sub2) this).anInt9389 * 1948349625,
	     ((Class181_Sub2) this).anInt9388 * -2063259173, 100, 100, false,
	     (byte) 28);
	Class275.method3707(-1972420523 * ((Class181_Sub2) this).anInt9390,
			    ((Class181_Sub2) this).anInt9387 * -2027740703, 0,
			    -2096573873);
	client.aBool10944 = true;
    }
    
    public void method2681() {
	Class181_Sub15.method8967
	    (((Class181_Sub2) this).anInt9391 * -140411473,
	     ((Class181_Sub2) this).anInt9389 * 1948349625,
	     ((Class181_Sub2) this).anInt9388 * -2063259173, 100, 100, false,
	     (byte) -16);
	Class275.method3707(-1972420523 * ((Class181_Sub2) this).anInt9390,
			    ((Class181_Sub2) this).anInt9387 * -2027740703, 0,
			    -2068962766);
	client.aBool10944 = true;
    }
    
    Class181_Sub2(ByteBuffer class528_sub42) {
	super(class528_sub42);
	((Class181_Sub2) this).anInt9391
	    = class528_sub42.readUnsignedShort(472156555) * -1434060465;
	((Class181_Sub2) this).anInt9388
	    = class528_sub42.readUnsignedShort(-1239663395) * 521710163;
	((Class181_Sub2) this).anInt9389
	    = class528_sub42.readUnsignedShort(-214766188) * -998616695;
	((Class181_Sub2) this).anInt9390
	    = class528_sub42.readUnsignedShort(-1731380136) * 1553186045;
	((Class181_Sub2) this).anInt9387
	    = class528_sub42.readUnsignedShort(54813882) * -1030692319;
    }
    
    public void method2678() {
	Class181_Sub15.method8967
	    (((Class181_Sub2) this).anInt9391 * -140411473,
	     ((Class181_Sub2) this).anInt9389 * 1948349625,
	     ((Class181_Sub2) this).anInt9388 * -2063259173, 100, 100, false,
	     (byte) 93);
	Class275.method3707(-1972420523 * ((Class181_Sub2) this).anInt9390,
			    ((Class181_Sub2) this).anInt9387 * -2027740703, 0,
			    -2102270983);
	client.aBool10944 = true;
    }
    
    static final void method8728(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	ItemType itemType
	    = (ItemType) Class18.aClass5_Sub13_206.method63(i_0_, 1999002728);
	if (-1 == 1509129727 * itemType.anInt84
	    && 1513779459 * itemType.anInt39 >= 0)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1513779459 * itemType.anInt39;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= i_0_;
    }
    
    static void method8729(byte i) {
	if (Class514.aClass528_Sub38_6967.aClass691_Sub31_10602
		.method10076(-740804623)
	    == 1)
	    Class590.aClass488_7736.method5895(new Class498((Class489
							     .aClass489_5505),
							    null),
					       858427788);
	else {
	    client.aClass495_10935.method5989(2016078152);
	    Class494.method5961(-111142549);
	}
    }
}
