/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class236 implements Interface26
{
    Class215 aClass215_2595;
    Class207 this$0;
    static Class286 aClass286_2596;
    
    public void method139(Class216 class216) {
	class216.method3031(((Class236) this).aClass215_2595, -266767399);
    }
    
    public void method140(Class216 class216, int i) {
	class216.method3031(((Class236) this).aClass215_2595, -266767399);
    }
    
    Class236(Class207 class207, ByteBuffer class528_sub42) {
	((Class236) this).this$0 = class207;
	boolean bool = class528_sub42.readUnsignedByte((byte) 3) != 255;
	if (bool)
	    class528_sub42.pointer -= 2015001547;
	((Class236) this).aClass215_2595
	    = new Class215(class528_sub42, bool, true,
			   ((Class207) class207).anInterface24_2232);
    }
    
    public void method141(Class216 class216) {
	class216.method3031(((Class236) this).aClass215_2595, -266767399);
    }
    
    public void method138(Class216 class216) {
	class216.method3031(((Class236) this).aClass215_2595, -266767399);
    }
    
    static final void method3282(int i) {
	Class634.anInt8208 -= 59161049;
    }
    
    static final void method3283(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) -15);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class490.method5923(class229, class226, class648, 1814465664);
    }
    
    static final void method3284(Class648 class648, int i) {
	((Class648) class648).anInt8410 -= -1094513834;
	String string
	    = (String) (((Class648) class648).anObjectArray8396
			[-520794877 * ((Class648) class648).anInt8410]);
	String string_1_
	    = (String) (((Class648) class648).anObjectArray8396
			[1 + ((Class648) class648).anInt8410 * -520794877]);
	Class550.method6687(string, string_1_, 61026477);
    }
    
    static final void method3285(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class560.method6817(class229, class226, class648,
			    Class227.aClass227_2341, (byte) 31);
    }
    
    public static void method3286(int i, int i_2_, int i_3_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(17, (long) i_2_ << 32 | (long) i);
	class528_sub21_sub7.method10495(118823966);
    }
}
