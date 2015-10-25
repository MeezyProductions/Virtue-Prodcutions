/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class471
{
    Class468 this$0;
    int anInt5402;
    int anInt5403;
    ByteBuffer aClass528_Sub42_5404;
    boolean aBool5405;
    
    void method5808() {
	if (null != ((Class471) this).aClass528_Sub42_5404
	    && false == ((Class471) this).aBool5405)
	    ((Class471) this).aClass528_Sub42_5404.method9632((byte) 25);
	((Class471) this).anInt5403 = -559437379;
	((Class471) this).anInt5402 = -946270067;
    }
    
    void method5809(byte i) {
	if (null != ((Class471) this).aClass528_Sub42_5404
	    && false == ((Class471) this).aBool5405)
	    ((Class471) this).aClass528_Sub42_5404.method9632((byte) -27);
	((Class471) this).anInt5403 = -559437379;
	((Class471) this).anInt5402 = -946270067;
    }
    
    Class471(Class468 class468, ByteBuffer class528_sub42, boolean bool) {
	((Class471) this).this$0 = class468;
	((Class471) this).aClass528_Sub42_5404 = class528_sub42;
	((Class471) this).aBool5405 = bool;
	((Class471) this).anInt5403 = -559437379;
	((Class471) this).anInt5402 = -946270067;
    }
    
    void method5810() {
	if (null != ((Class471) this).aClass528_Sub42_5404
	    && false == ((Class471) this).aBool5405)
	    ((Class471) this).aClass528_Sub42_5404.method9632((byte) -81);
	((Class471) this).anInt5403 = -559437379;
	((Class471) this).anInt5402 = -946270067;
    }
    
    static final void method5811(Class648 class648, byte i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 57);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class176.method2570(class229, class226, class648, (byte) 69);
    }
    
    static final void method5812(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -656097211 * class229.anInt2462;
    }
    
    public static int method5813(Class430 class430, int i) {
	Class422 class422 = Class422.method5051(0.0F, 0.0F, 1.0F);
	class422.method5075(class430);
	double d = Math.atan2((double) class422.aFloat4780,
			      (double) class422.aFloat4777);
	class422.method5054();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (int) (16384.0 * (d / 6.283185307179586)) & 0x3fff;
    }
    
    static final void method5814(int i) {
	int i_1_ = 0;
	Class538 class538 = client.aClass495_10935.method5973((byte) 78);
	for (int i_2_ = 0;
	     i_2_ < client.aClass495_10935.method6029((short) 1972); i_2_++) {
	    for (int i_3_ = 0;
		 i_3_ < client.aClass495_10935.method5967(1945228008);
		 i_3_++) {
		if (Class209.method2945(class538.aClass546ArrayArrayArray7160,
					i_1_, i_2_, i_3_, true, 1186247430))
		    i_1_++;
		if (i_1_ >= 512)
		    return;
	    }
	}
    }
    
    static void method5815(int i, int i_4_) {
	if (153 == Class54.anInt651 * -1132112883)
	    Class54.anInt668 = -1766228011 * i;
	else if (-1132112883 * Class54.anInt651 == 265)
	    Class54.anInt669 = i * 1851279351;
    }
    
    static final void method5816(String string, int i) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class347.method4549(string, "%0a", "\n",
						    -791140843))
			       .toString());
    }
}
