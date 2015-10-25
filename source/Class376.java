/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class376 implements Interface44
{
    Class446 aClass446_3939;
    Class186 aClass186_3940 = new Class186(64);
    static Class446 aClass446_3941;
    
    public Class391 method323(int i) {
	Class391 class391
	    = (Class391) ((Class376) this).aClass186_3940.method2727((long) i);
	if (class391 != null)
	    return class391;
	byte[] is
	    = ((Class376) this).aClass446_3939.method5348(0, i, -2003680736);
	class391 = new Class391();
	if (is != null)
	    class391.method4787(new ByteBuffer(is), i, (byte) 63);
	((Class376) this).aClass186_3940.method2729(class391, (long) i);
	return class391;
    }
    
    public Class391 method324(int i, int i_0_) {
	Class391 class391
	    = (Class391) ((Class376) this).aClass186_3940.method2727((long) i);
	if (class391 != null)
	    return class391;
	byte[] is
	    = ((Class376) this).aClass446_3939.method5348(0, i, -1666719278);
	class391 = new Class391();
	if (is != null)
	    class391.method4787(new ByteBuffer(is), i, (byte) 86);
	((Class376) this).aClass186_3940.method2729(class391, (long) i);
	return class391;
    }
    
    public Class376(Class446 class446) {
	((Class376) this).aClass446_3939 = class446;
    }
    
    public Class391 method322(int i) {
	Class391 class391
	    = (Class391) ((Class376) this).aClass186_3940.method2727((long) i);
	if (class391 != null)
	    return class391;
	byte[] is
	    = ((Class376) this).aClass446_3939.method5348(0, i, -1583105216);
	class391 = new Class391();
	if (is != null)
	    class391.method4787(new ByteBuffer(is), i, (byte) -74);
	((Class376) this).aClass186_3940.method2729(class391, (long) i);
	return class391;
    }
    
    static long method4694(byte i) {
	return Class509.aClass501_6921.method6100(1838178391);
    }
    
    static final void method4695(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_1_, (byte) 41);
	Class36.method787(class229, class648, 2054705635);
    }
    
    static final void method4696(Class648 class648, byte i)
	throws Exception_Sub4 {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_2_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	Class422 class422
	    = Class422.method5051((float) i_2_, (float) i_2_, (float) i_2_);
	Class495.aClass283_Sub1_5578.method3818(class422, 2005137332);
	class422.method5054();
    }
    
    static final void method4697(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	class229.aBool2408 = i_3_ == 1;
	Class39.method811(class229, 1435904523);
    }
    
    static final void method4698(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class666.method7905(i_4_, (short) 20046);
    }
}
