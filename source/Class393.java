/* Class393 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class393 implements Interface46
{
    Class186 aClass186_4123 = new Class186(64);
    Class446 aClass446_4124;
    
    public Class388 method327(int i) {
	Class388 class388
	    = (Class388) ((Class393) this).aClass186_4123.method2727((long) i);
	if (null != class388)
	    return class388;
	byte[] is
	    = ((Class393) this).aClass446_4124.method5348(1, i, -341107757);
	class388 = new Class388();
	class388.anInt4083 = i * 331823353;
	if (is != null)
	    class388.method4753(new ByteBuffer(is), -514965570);
	class388.method4755((byte) -26);
	((Class393) this).aClass186_4123.method2729(class388, (long) i);
	return class388;
    }
    
    public Class388 method328(int i, int i_0_) {
	Class388 class388
	    = (Class388) ((Class393) this).aClass186_4123.method2727((long) i);
	if (null != class388)
	    return class388;
	byte[] is
	    = ((Class393) this).aClass446_4124.method5348(1, i, -1805778719);
	class388 = new Class388();
	class388.anInt4083 = i * 331823353;
	if (is != null)
	    class388.method4753(new ByteBuffer(is), 251452516);
	class388.method4755((byte) 10);
	((Class393) this).aClass186_4123.method2729(class388, (long) i);
	return class388;
    }
    
    public void method4801(int i) {
	((Class393) this).aClass186_4123.method2731(-1748774865);
    }
    
    public Class388 method329(int i) {
	Class388 class388
	    = (Class388) ((Class393) this).aClass186_4123.method2727((long) i);
	if (null != class388)
	    return class388;
	byte[] is
	    = ((Class393) this).aClass446_4124.method5348(1, i, -1504821566);
	class388 = new Class388();
	class388.anInt4083 = i * 331823353;
	if (is != null)
	    class388.method4753(new ByteBuffer(is), -1528985669);
	class388.method4755((byte) -93);
	((Class393) this).aClass186_4123.method2729(class388, (long) i);
	return class388;
    }
    
    public Class393(Class446 class446) {
	((Class393) this).aClass446_4124 = class446;
    }
    
    public static void method4802(int i, int i_1_, int i_2_, int i_3_,
				  int i_4_) {
	Class581.aLinkedList7640.addLast(new Class573(i, i_1_, i_2_ - i,
						      i_3_ - i_1_));
    }
    
    static final void method4803(Class528_Sub21_Sub11 class528_sub21_sub11,
				 Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class60.method1001(class528_sub21_sub11, 651076312);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class494.method5955(class528_sub21_sub11, (byte) 14);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class238.method3294(class528_sub21_sub11, -360292702);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class142_Sub2.method8324(class528_sub21_sub11, 707868779);
    }
    
    static final void method4804(Class648 class648, int i) {
	Class533.method6489(Class372.method4679(-1935861153), -1574727596);
    }
    
    static final void method4805(Class648 class648, int i) {
	int i_5_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_5_, (byte) 37);
	Class226 class226 = Class380.aClass226Array3970[i_5_ >> 16];
	Class29.method752(class229, class226, class648, -1712961913);
    }
}
