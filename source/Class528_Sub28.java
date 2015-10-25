/* Class528_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class528_Sub28 extends Node
{
    abstract void method9459(Class308 class308, int i);
    
    abstract void method9460(ByteBuffer class528_sub42);
    
    abstract void method9461(ByteBuffer class528_sub42);
    
    abstract void method9462(ByteBuffer class528_sub42);
    
    abstract void method9463(ByteBuffer class528_sub42);
    
    Class528_Sub28() {
	/* empty */
    }
    
    abstract void method9464(ByteBuffer class528_sub42, int i);
    
    abstract void method9465(Class308 class308);
    
    abstract void method9466(Class308 class308);
    
    public static void method9467(int i, short i_0_) {
	if (25 == i)
	    Class518_Sub1.aFloat6991 = 2.0F;
	else if (i == 37)
	    Class518_Sub1.aFloat6991 = 3.0F;
	else if (i == 50)
	    Class518_Sub1.aFloat6991 = 4.0F;
	else if (75 == i)
	    Class518_Sub1.aFloat6991 = 6.0F;
	else if (i == 100)
	    Class518_Sub1.aFloat6991 = 8.0F;
	else if (i == 200)
	    Class518_Sub1.aFloat6991 = 16.0F;
	Class518_Sub1.anInt10687 = 1998421085;
	Class518_Sub1.anInt10687 = 1998421085;
    }
    
    static void method9468(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	((Class648) class648).anIntArray8394[717927929 * (((Class648) class648)
							  .anInt8395)]
	    = Class527.method6432((((Class648) class648).anIntArray8394
				   [(((Class648) class648).anInt8395
				     * 717927929)]),
				  (((Class648) class648).anIntArray8394
				   [1 + (717927929
					 * ((Class648) class648).anInt8395)]),
				  (byte) -78);
	((Class648) class648).anInt8395 += 1239022665;
    }
    
    static ClientPacket method9469(byte i) {
	ClientPacket class528_sub21_sub7
	    = ((ClientPacket)
	       ClientPacket.aClass679_11567.method7960(-1550587110));
	if (null != class528_sub21_sub7) {
	    class528_sub21_sub7.method6443(140252053);
	    class528_sub21_sub7.method9429((byte) -31);
	    return class528_sub21_sub7;
	}
	for (;;) {
	    class528_sub21_sub7
		= (ClientPacket) ClientPacket.aClass679_11568
					    .method7960(-1550587110);
	    if (null == class528_sub21_sub7)
		return null;
	    if (class528_sub21_sub7.method10499(-1735709142)
		> Class249.method3417(2074161876))
		return null;
	    class528_sub21_sub7.method6443(1053471807);
	    class528_sub21_sub7.method9429((byte) -99);
	    if (0L != (-5214225787304728211L * class528_sub21_sub7.aLong10407
		       & ~0x7fffffffffffffffL))
		return class528_sub21_sub7;
	}
    }
    
    public static void method9470(int i, int i_1_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(3, (long) i);
	class528_sub21_sub7.method10495(-875746590);
    }
}
