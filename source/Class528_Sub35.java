/* Class528_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub35 extends Node
{
    public int anInt10485;
    public int anInt10486;
    public int anInt10487;
    public int anInt10488;
    public int anInt10489;
    public int anInt10490;
    public int anInt10491;
    public int anInt10492;
    public int anInt10493;
    public static int anInt10494;
    
    Class528_Sub35(ByteBuffer class528_sub42) {
	int i = class528_sub42.readInt(172724774);
	anInt10486 = 1116565133 * (i >>> 28);
	anInt10493 = (i >>> 14 & 0x3fff) * -1942081243;
	anInt10487 = (i & 0x3fff) * 274554173;
	anInt10491 = class528_sub42.readUnsignedByte((byte) 109) * 1354269669;
	anInt10492 = class528_sub42.readUnsignedByte((byte) 9) * 983048499;
	anInt10490 = class528_sub42.readUnsignedByte((byte) 89) * -1259035409;
	anInt10489 = class528_sub42.readUnsignedByte((byte) 34) * 1092060151;
	anInt10485 = class528_sub42.readUnsignedByte((byte) 21) * -2048203539;
	anInt10488 = class528_sub42.readUnsignedByte((byte) 112) * 1577932183;
    }
    
    public static Class528_Sub34 method9518(int i) {
	Class528_Sub34 class528_sub34 = Class141.method1701((byte) 11);
	((Class528_Sub34) class528_sub34).aClass403_10482 = null;
	((Class528_Sub34) class528_sub34).anInt10480 = 0;
	class528_sub34.aClass528_Sub42_Sub2_10481
	    = new BitBuffer(5000);
	return class528_sub34;
    }
}
