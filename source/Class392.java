/* Class392 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class392 implements Interface45
{
    static Class1 aClass1_4120;
    Class186 aClass186_4121 = new Class186(64);
    Class446 aClass446_4122;
    
    public Class392(Class446 class446) {
	((Class392) this).aClass446_4122 = class446;
    }
    
    public void method4796() {
	((Class392) this).aClass186_4121.method2731(-1367440579);
    }
    
    public void method4797(byte i) {
	((Class392) this).aClass186_4121.method2731(-948316391);
    }
    
    public synchronized Class386 method325(int i) {
	Class386 class386
	    = (Class386) ((Class392) this).aClass186_4121.method2727((long) i);
	if (class386 != null)
	    return class386;
	byte[] is
	    = ((Class392) this).aClass446_4122.method5348(0, i, -907489254);
	class386 = new Class386();
	if (null != is)
	    class386.method4740(new ByteBuffer(is), -416505824);
	class386.method4739(-519211336);
	((Class392) this).aClass186_4121.method2729(class386, (long) i);
	return class386;
    }
    
    public void method4798() {
	((Class392) this).aClass186_4121.method2731(-1056511766);
    }
    
    public synchronized Class386 method326(int i, byte i_0_) {
	Class386 class386
	    = (Class386) ((Class392) this).aClass186_4121.method2727((long) i);
	if (class386 != null)
	    return class386;
	byte[] is
	    = ((Class392) this).aClass446_4122.method5348(0, i, -1414922654);
	class386 = new Class386();
	if (null != is)
	    class386.method4740(new ByteBuffer(is), -1702027886);
	class386.method4739(537289749);
	((Class392) this).aClass186_4121.method2729(class386, (long) i);
	return class386;
    }
    
    static final void method4799(Class648 class648, byte i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_1_, (byte) -54);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2406 * -695134203;
    }
    
    public static Class1 method4800(Class446 class446, int i,
				    Interface75 interface75, byte i_2_) {
	byte[] is = class446.method5395(i, -760470393);
	if (is == null)
	    return null;
	return new Class1(is, interface75);
    }
}
