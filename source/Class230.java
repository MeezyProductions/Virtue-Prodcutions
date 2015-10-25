/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class230 implements IClientEnum
{
    static Class230 aClass230_2558;
    static Class230 aClass230_2559;
    static Class230 aClass230_2560;
    static Class230 aClass230_2561;
    static Class230 aClass230_2562 = new Class230(5, 1);
    int anInt2563;
    static Class230 aClass230_2564;
    static Class230 aClass230_2565;
    static Class230 aClass230_2566 = new Class230(4, 2);
    static Class230 aClass230_2567;
    static Class230 aClass230_2568;
    static Class230 aClass230_2569;
    static Class230 aClass230_2570;
    static Class230 aClass230_2571;
    static Class230 aClass230_2572;
    int anInt2573;
    
    static Class230[] method3235(int i) {
	return new Class230[] { aClass230_2565, aClass230_2564, aClass230_2572,
				aClass230_2568, aClass230_2566, aClass230_2562,
				aClass230_2571, aClass230_2561, aClass230_2560,
				aClass230_2569, aClass230_2567, aClass230_2570,
				aClass230_2559, aClass230_2558 };
    }
    
    Class230(int i, int i_0_) {
	((Class230) this).anInt2563 = 1603445907 * i;
	((Class230) this).anInt2573 = i_0_ * -1032962061;
    }
    
    public int method73() {
	return ((Class230) this).anInt2573 * 74412347;
    }
    
    public int method68() {
	return ((Class230) this).anInt2573 * 74412347;
    }
    
    public int method5() {
	return ((Class230) this).anInt2573 * 74412347;
    }
    
    public int method6() {
	return ((Class230) this).anInt2573 * 74412347;
    }
    
    public int method72() {
	return ((Class230) this).anInt2573 * 74412347;
    }
    
    static {
	aClass230_2560 = new Class230(8, 3);
	aClass230_2561 = new Class230(7, 4);
	aClass230_2572 = new Class230(2, 5);
	aClass230_2571 = new Class230(6, 6);
	aClass230_2564 = new Class230(1, 7);
	aClass230_2565 = new Class230(0, 8);
	aClass230_2559 = new Class230(12, 9);
	aClass230_2567 = new Class230(10, 10);
	aClass230_2568 = new Class230(3, 11);
	aClass230_2569 = new Class230(9, 12);
	aClass230_2570 = new Class230(11, 13);
	aClass230_2558 = new Class230(13, 14);
    }
    
    public int method71() {
	return ((Class230) this).anInt2573 * 74412347;
    }
    
    public static Class229 method3236(int i, int i_1_, int i_2_) {
	Class229 class229 = Class623_Sub1.method9755(i, (byte) 46);
	if (i_1_ == -1)
	    return class229;
	if (class229 == null || class229.aClass229Array2542 == null
	    || i_1_ >= class229.aClass229Array2542.length)
	    return null;
	return class229.aClass229Array2542[i_1_];
    }
    
    static void method3237(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class378.method4711(1801712754);
    }
    
    public static Class675[] method3238(int i) {
	return (new Class675[]
		{ Class675.aClass675_8540, Class675.aClass675_8542,
		  Class675.aClass675_8548, Class675.aClass675_8543,
		  Class675.aClass675_8550, Class675.aClass675_8544,
		  Class675.aClass675_8545, Class675.aClass675_8547,
		  Class675.aClass675_8541, Class675.aClass675_8546 });
    }
    
    static final void method3239(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 962389273 * ((Class648) class648).aClass308_8391.anInt3398;
    }
    
    public static Class533 method3240(Class446 class446, String string,
				      boolean bool, int i) {
	int i_3_ = class446.method5362(string, (byte) -8);
	if (i_3_ == -1)
	    return new Class533(0);
	byte[] is = class446.method5348(i_3_, 1, -990502501);
	if (null == is)
	    return new Class533(0);
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	int i_4_ = class528_sub42.readUnsignedShort(884518290);
	Class533 class533 = new Class533(i_4_);
	int i_5_ = 0;
	while (i_5_ < -595383187 * class533.anInt7130) {
	    int i_6_ = class528_sub42.readInt(953144986);
	    int i_7_ = class528_sub42.readUnsignedShort(-636769446);
	    int i_8_ = class528_sub42.readUnsignedByte((byte) 107);
	    if (bool || 1 != i_8_) {
		class533.anIntArray7129[i_5_] = i_6_;
		class533.anIntArray7131[i_5_] = i_7_;
		i_5_++;
	    } else
		class533.anInt7130 -= -597705371;
	}
	return class533;
    }
    
    static final void method3241(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class562.method6820(class229, class226, class648, (byte) -10);
    }
}
