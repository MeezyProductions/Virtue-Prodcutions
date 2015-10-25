/* Class685 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class685
{
    public Class511_Sub2 aClass511_Sub2_8608 = new Class511_Sub2();
    Class511_Sub2 aClass511_Sub2_8609;
    
    public Class511_Sub2 method8009(int i) {
	Class511_Sub2 class511_sub2 = aClass511_Sub2_8608.aClass511_Sub2_10263;
	if (class511_sub2 == aClass511_Sub2_8608) {
	    ((Class685) this).aClass511_Sub2_8609 = null;
	    return null;
	}
	((Class685) this).aClass511_Sub2_8609
	    = class511_sub2.aClass511_Sub2_10263;
	return class511_sub2;
    }
    
    public void method8010(Class511_Sub2 class511_sub2, byte i) {
	if (class511_sub2.aClass511_Sub2_10262 != null)
	    class511_sub2.method9279((byte) 0);
	class511_sub2.aClass511_Sub2_10262
	    = aClass511_Sub2_8608.aClass511_Sub2_10262;
	class511_sub2.aClass511_Sub2_10263 = aClass511_Sub2_8608;
	class511_sub2.aClass511_Sub2_10262.aClass511_Sub2_10263
	    = class511_sub2;
	class511_sub2.aClass511_Sub2_10263.aClass511_Sub2_10262
	    = class511_sub2;
    }
    
    public Class685() {
	aClass511_Sub2_8608.aClass511_Sub2_10263 = aClass511_Sub2_8608;
	aClass511_Sub2_8608.aClass511_Sub2_10262 = aClass511_Sub2_8608;
    }
    
    public Class511_Sub2 method8011(byte i) {
	Class511_Sub2 class511_sub2 = ((Class685) this).aClass511_Sub2_8609;
	if (class511_sub2 == aClass511_Sub2_8608) {
	    ((Class685) this).aClass511_Sub2_8609 = null;
	    return null;
	}
	((Class685) this).aClass511_Sub2_8609
	    = class511_sub2.aClass511_Sub2_10263;
	return class511_sub2;
    }
    
    public void method8012(int i) {
	for (;;) {
	    Class511_Sub2 class511_sub2
		= aClass511_Sub2_8608.aClass511_Sub2_10263;
	    if (aClass511_Sub2_8608 == class511_sub2)
		break;
	    class511_sub2.method9279((byte) 0);
	}
	((Class685) this).aClass511_Sub2_8609 = null;
    }
    
    public void method8013() {
	for (;;) {
	    Class511_Sub2 class511_sub2
		= aClass511_Sub2_8608.aClass511_Sub2_10263;
	    if (aClass511_Sub2_8608 == class511_sub2)
		break;
	    class511_sub2.method9279((byte) 0);
	}
	((Class685) this).aClass511_Sub2_8609 = null;
    }
    
    static final void method8014(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class578.method6913((char) i_0_, (byte) -113) ? 1 : 0;
    }
}
