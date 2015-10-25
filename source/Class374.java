/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class374 implements Interface47
{
    public int anInt3914;
    public int anInt3915;
    public int anInt3916;
    public Class381 aClass381_3917;
    public Class377 aClass377_3918;
    public int anInt3919;
    public int anInt3920;
    public int anInt3921;
    public int anInt3922;
    public int anInt3923;
    public boolean aBool3924;
    
    Class374(int i, Class381 class381, Class377 class377, int i_0_, int i_1_,
	     int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
	anInt3914 = i * 1421779243;
	aClass381_3917 = class381;
	aClass377_3918 = class377;
	anInt3916 = i_0_ * 455988569;
	anInt3921 = i_1_ * -952706907;
	anInt3923 = i_2_ * -744279449;
	anInt3922 = i_3_ * -289056453;
	anInt3915 = -956342035 * i_4_;
	anInt3919 = 50343751 * i_5_;
	anInt3920 = i_6_ * -1906000113;
	aBool3924 = bool;
    }
    
    public Class379 method331(int i) {
	return Class379.aClass379_3958;
    }
    
    public Class379 method330() {
	return Class379.aClass379_3958;
    }
    
    public static Class372 method4685(ByteBuffer class528_sub42, byte i) {
	int i_7_ = class528_sub42.method9645((short) -7429);
	Class381 class381 = (Class577.method6896(278647783)
			     [class528_sub42.readUnsignedByte((byte) 60)]);
	Class377 class377 = (Class95.method1256((byte) 107)
			     [class528_sub42.readUnsignedByte((byte) 79)]);
	int i_8_ = class528_sub42.method9642(-994292157);
	int i_9_ = class528_sub42.method9642(1646297813);
	return new Class372(i_7_, class381, class377, i_8_, i_9_);
    }
    
    static final void method4686(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (null == client.aClass229_11027 ? -1
	       : 306930455 * client.aClass229_11027.anInt2376);
    }
}
