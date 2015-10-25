/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class199 implements Interface55
{
    Class218 this$0;
    
    Class199(Class218 class218) {
	((Class199) this).this$0 = class218;
    }
    
    public void method351(Object object, float[] fs, Object[] objects, int i) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -23503);
	float f = class469.method5784((short) -19197);
	float f_0_ = class469.method5756(1770494187);
	Class422 class422_1_
	    = Class422.method5065(class422, ((Class199) this).this$0
						.method3085(508332228));
	float f_2_ = 0.0F;
	float f_3_ = class422_1_.method5069();
	if (f_3_ >= f_0_)
	    f_2_ = 0.0F;
	if (f_3_ <= f)
	    f_2_ = 1.0F;
	else {
	    float f_4_ = 1.0F - (f_3_ - f) * (1.0F / (f_0_ - f));
	    if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
		f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
	    f_2_ = f_4_;
	}
	fs[0] = f_2_;
	fs[1] = f_2_;
    }
    
    public void method347(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -29754);
	float f = class469.method5784((short) -10547);
	float f_5_ = class469.method5756(1770494187);
	Class422 class422_6_
	    = Class422.method5065(class422, ((Class199) this).this$0
						.method3085(-386796695));
	float f_7_ = 0.0F;
	float f_8_ = class422_6_.method5069();
	if (f_8_ >= f_5_)
	    f_7_ = 0.0F;
	if (f_8_ <= f)
	    f_7_ = 1.0F;
	else {
	    float f_9_ = 1.0F - (f_8_ - f) * (1.0F / (f_5_ - f));
	    if ((double) f_9_ < 0.0 || (double) f_9_ > 1.0)
		f_9_ = Math.min(Math.max(f_9_, 0.0F), 1.0F);
	    f_7_ = f_9_;
	}
	fs[0] = f_7_;
	fs[1] = f_7_;
    }
    
    public void method348(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -18359);
	float f = class469.method5784((short) -8577);
	float f_10_ = class469.method5756(1770494187);
	Class422 class422_11_
	    = Class422.method5065(class422, ((Class199) this).this$0
						.method3085(-156577996));
	float f_12_ = 0.0F;
	float f_13_ = class422_11_.method5069();
	if (f_13_ >= f_10_)
	    f_12_ = 0.0F;
	if (f_13_ <= f)
	    f_12_ = 1.0F;
	else {
	    float f_14_ = 1.0F - (f_13_ - f) * (1.0F / (f_10_ - f));
	    if ((double) f_14_ < 0.0 || (double) f_14_ > 1.0)
		f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
	    f_12_ = f_14_;
	}
	fs[0] = f_12_;
	fs[1] = f_12_;
    }
    
    public void method350(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -18033);
	float f = class469.method5784((short) 7170);
	float f_15_ = class469.method5756(1770494187);
	Class422 class422_16_
	    = Class422.method5065(class422, ((Class199) this).this$0
						.method3085(1932502617));
	float f_17_ = 0.0F;
	float f_18_ = class422_16_.method5069();
	if (f_18_ >= f_15_)
	    f_17_ = 0.0F;
	if (f_18_ <= f)
	    f_17_ = 1.0F;
	else {
	    float f_19_ = 1.0F - (f_18_ - f) * (1.0F / (f_15_ - f));
	    if ((double) f_19_ < 0.0 || (double) f_19_ > 1.0)
		f_19_ = Math.min(Math.max(f_19_, 0.0F), 1.0F);
	    f_17_ = f_19_;
	}
	fs[0] = f_17_;
	fs[1] = f_17_;
    }
    
    public void method349(Object object, float[] fs, Object[] objects) {
	Class469 class469 = (Class469) object;
	Class422 class422 = class469.method5762((short) -6649);
	float f = class469.method5784((short) -10824);
	float f_20_ = class469.method5756(1770494187);
	Class422 class422_21_
	    = Class422.method5065(class422, ((Class199) this).this$0
						.method3085(340105459));
	float f_22_ = 0.0F;
	float f_23_ = class422_21_.method5069();
	if (f_23_ >= f_20_)
	    f_22_ = 0.0F;
	if (f_23_ <= f)
	    f_22_ = 1.0F;
	else {
	    float f_24_ = 1.0F - (f_23_ - f) * (1.0F / (f_20_ - f));
	    if ((double) f_24_ < 0.0 || (double) f_24_ > 1.0)
		f_24_ = Math.min(Math.max(f_24_, 0.0F), 1.0F);
	    f_22_ = f_24_;
	}
	fs[0] = f_22_;
	fs[1] = f_22_;
    }
    
    public static void method2840(Interface57 interface57, int i) {
	if (null != Class503.anInterface57_6873)
	    throw new IllegalStateException("");
	Class503.anInterface57_6873 = interface57;
    }
    
    static final void method2841(Class229 class229, int i, byte[] is,
				 byte[] is_25_, Class648 class648,
				 byte i_26_) {
	if (class229.aByteArrayArray2464 == null) {
	    if (null != is) {
		class229.aByteArrayArray2464 = new byte[11][];
		class229.aByteArrayArray2465 = new byte[11][];
		class229.anIntArray2466 = new int[11];
		class229.anIntArray2467 = new int[11];
		class229.anIntArray2537 = new int[11];
	    } else
		return;
	}
	class229.aByteArrayArray2464[i] = is;
	if (is != null)
	    class229.aBool2507 = true;
	else {
	    class229.aBool2507 = false;
	    for (int i_27_ = 0; i_27_ < class229.aByteArrayArray2464.length;
		 i_27_++) {
		if (class229.aByteArrayArray2464[i_27_] != null
		    || class229.anIntArray2537[i_27_] > 0) {
		    class229.aBool2507 = true;
		    break;
		}
	    }
	}
	class229.aByteArrayArray2465[i] = is_25_;
    }
    
    static final void method2842(Class648 class648, int i) {
	int i_28_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_28_ & 0x3fff;
    }
    
    static final void method2843(Class648 class648, byte i) {
	int i_29_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	ItemType itemType
	    = (ItemType) Class18.aClass5_Sub13_206.method63(i_29_, -155384715);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = itemType.anInt49 * 993693743;
    }
}
