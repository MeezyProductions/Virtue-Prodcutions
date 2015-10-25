/* Class562 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class562
{
    public static final int anInt7536 = 9;
    public static final int anInt7537 = 512;
    public static final int anInt7538 = 7;
    public static final int anInt7539 = 511;
    public static final int anInt7540 = 2;
    public static final int anInt7541 = 8;
    public static final int anInt7542 = 256;
    public static final int anInt7543 = 128;
    public static final int anInt7544 = 1024;
    
    static {
	Math.sqrt(131072.0);
    }
    
    Class562() throws Throwable {
	throw new Error();
    }
    
    static Class628[] method6819(short i) {
	return (new Class628[]
		{ Class628.aClass628_8176, Class628.aClass628_8177,
		  Class628.aClass628_8174, Class628.aClass628_8180,
		  Class628.aClass628_8179, Class628.aClass628_8170,
		  Class628.aClass628_8182, Class628.aClass628_8169,
		  Class628.aClass628_8171, Class628.aClass628_8172,
		  Class628.aClass628_8167, Class628.aClass628_8168,
		  Class628.aClass628_8178, Class628.aClass628_8175 });
    }
    
    static final void method6820(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= 661123364;
	class229.anInt2386
	    = -1767630107 * (((Class648) class648).anIntArray8394
			     [717927929 * ((Class648) class648).anInt8395]);
	class229.anInt2387
	    = -697207703 * (((Class648) class648).anIntArray8394
			    [((Class648) class648).anInt8395 * 717927929 + 1]);
	class229.anInt2431 = 0;
	class229.anInt2432 = 0;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 2]);
	if (i_0_ < 0)
	    i_0_ = 0;
	else if (i_0_ > 4)
	    i_0_ = 4;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [3 + ((Class648) class648).anInt8395 * 717927929]);
	if (i_1_ < 0)
	    i_1_ = 0;
	else if (i_1_ > 4)
	    i_1_ = 4;
	class229.aByte2452 = (byte) i_0_;
	class229.aByte2526 = (byte) i_1_;
	Class39.method811(class229, 1435904523);
	Class576.method6893(class226, class229, -2025544239);
	if (0 == class229.anInt2378 * -319431967)
	    Class423.method5110(class226, class229, false, -1920431224);
    }
    
    static final void method6821(Class648 class648, int i) {
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_2_, (byte) 24);
	ProtocolLoop.method1053(class229, class648, (byte) 0);
    }
    
    static final void method6822(Class648 class648, int i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (null != client.aString11133
	    && i_3_ < 1502735135 * Class667.anInt8488)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class5_Sub19.aClass89Array10849[i_3_].aByte1131;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    static final void method6823(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) 58);
	Class226 class226 = Class380.aClass226Array3970[i_4_ >> 16];
	method6820(class229, class226, class648, (byte) -86);
    }
}
