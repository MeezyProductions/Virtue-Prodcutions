/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class467
{
    public static final int anInt5313 = 8;
    public static final int anInt5314 = 3;
    public static final int anInt5315 = 0;
    public static final int anInt5316 = 2;
    public static final int anInt5317 = 1;
    public static final int anInt5318 = 5;
    
    Class467() throws Throwable {
	throw new Error();
    }
    
    public static void method5646(byte i) {
	synchronized (Class626.aQueue8135) {
	    for (;;) {
		Class528_Sub33_Sub2 class528_sub33_sub2
		    = (Class528_Sub33_Sub2) Class626.aQueue8135.poll();
		if (null == class528_sub33_sub2)
		    break;
		class528_sub33_sub2.method9510((byte) -17);
	    }
	}
    }
    
    static final void method5647(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	if (i_0_ == -1 && -1 == i_1_)
	    class229.aClass229_2351 = null;
	else
	    class229.aClass229_2351
		= Class230.method3236(i_0_, i_1_, 1864729667);
    }
    
    static final void method5648(Class648 class648, byte i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int i_2_ = 0;
	if (Class615.method7353(string, 1837827371))
	    i_2_ = Class454.method5495(string, 717927929);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4493,
				  client.aClass109_10930.aClass10_1379,
				  -1931875087);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeInt(i_2_, 2085118736);
	client.aClass109_10930.method1380(class528_sub34, 211832595);
    }
    
    static final void method5649(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (-1 == i_3_)
	    throw new RuntimeException("");
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = new StringBuilder().append(string).append((char) i_3_)
		  .toString();
    }
    
    static final void method5650(Class648 class648, int i) {
	Class511.method6263((byte) 102);
    }
}
