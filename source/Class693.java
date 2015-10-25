/* Class693 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class693 implements Iterator
{
    Class679 aClass679_8692;
    Class528_Sub21 aClass528_Sub21_8693;
    Class528_Sub21 aClass528_Sub21_8694 = null;
    public static Class432 aClass432_8695;
    public static byte aByte8696;
    static int anInt8697;
    
    public Class693(Class679 class679) {
	((Class693) this).aClass679_8692 = class679;
	((Class693) this).aClass528_Sub21_8693
	    = (((Class693) this).aClass679_8692.aClass528_Sub21_8561
	       .aClass528_Sub21_10408);
	((Class693) this).aClass528_Sub21_8694 = null;
    }
    
    void method8154(int i) {
	((Class693) this).aClass528_Sub21_8693
	    = (((Class693) this).aClass679_8692.aClass528_Sub21_8561
	       .aClass528_Sub21_10408);
	((Class693) this).aClass528_Sub21_8694 = null;
    }
    
    public void method8155() {
	if (((Class693) this).aClass528_Sub21_8694 == null)
	    throw new IllegalStateException();
	((Class693) this).aClass528_Sub21_8694.method9429((byte) -37);
	((Class693) this).aClass528_Sub21_8694 = null;
    }
    
    void method8156() {
	((Class693) this).aClass528_Sub21_8693
	    = (((Class693) this).aClass679_8692.aClass528_Sub21_8561
	       .aClass528_Sub21_10408);
	((Class693) this).aClass528_Sub21_8694 = null;
    }
    
    public boolean hasNext() {
	return (((Class693) this).aClass679_8692.aClass528_Sub21_8561
		!= ((Class693) this).aClass528_Sub21_8693);
    }
    
    public void remove() {
	if (((Class693) this).aClass528_Sub21_8694 == null)
	    throw new IllegalStateException();
	((Class693) this).aClass528_Sub21_8694.method9429((byte) -48);
	((Class693) this).aClass528_Sub21_8694 = null;
    }
    
    public Object method8157() {
	Class528_Sub21 class528_sub21 = ((Class693) this).aClass528_Sub21_8693;
	if (((Class693) this).aClass679_8692.aClass528_Sub21_8561
	    == class528_sub21) {
	    class528_sub21 = null;
	    ((Class693) this).aClass528_Sub21_8693 = null;
	} else
	    ((Class693) this).aClass528_Sub21_8693
		= class528_sub21.aClass528_Sub21_10408;
	((Class693) this).aClass528_Sub21_8694 = class528_sub21;
	return class528_sub21;
    }
    
    public void method8158() {
	if (((Class693) this).aClass528_Sub21_8694 == null)
	    throw new IllegalStateException();
	((Class693) this).aClass528_Sub21_8694.method9429((byte) -100);
	((Class693) this).aClass528_Sub21_8694 = null;
    }
    
    public boolean method8159() {
	return (((Class693) this).aClass679_8692.aClass528_Sub21_8561
		!= ((Class693) this).aClass528_Sub21_8693);
    }
    
    public boolean method8160() {
	return (((Class693) this).aClass679_8692.aClass528_Sub21_8561
		!= ((Class693) this).aClass528_Sub21_8693);
    }
    
    public Class528_Sub21 method8161(int i) {
	method8154(-104844805);
	return (Class528_Sub21) next();
    }
    
    void method8162() {
	((Class693) this).aClass528_Sub21_8693
	    = (((Class693) this).aClass679_8692.aClass528_Sub21_8561
	       .aClass528_Sub21_10408);
	((Class693) this).aClass528_Sub21_8694 = null;
    }
    
    public Object next() {
	Class528_Sub21 class528_sub21 = ((Class693) this).aClass528_Sub21_8693;
	if (((Class693) this).aClass679_8692.aClass528_Sub21_8561
	    == class528_sub21) {
	    class528_sub21 = null;
	    ((Class693) this).aClass528_Sub21_8693 = null;
	} else
	    ((Class693) this).aClass528_Sub21_8693
		= class528_sub21.aClass528_Sub21_10408;
	((Class693) this).aClass528_Sub21_8694 = class528_sub21;
	return class528_sub21;
    }
    
    public static void method8163(int i) {
	Class47.aClass688_541 = new Class688();
    }
    
    static final void method8164(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2400 * -1014124179;
    }
    
    static final void method8165(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.method6275((byte) 2);
    }
}
