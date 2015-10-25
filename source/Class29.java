/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class29 implements Iterator
{
    Class25 this$0;
    int anInt305;
    static int anInt306;
    
    public Object next() {
	return (((Class25) ((Class29) this).this$0).anInterface10Array235
		[(((Class29) this).anInt305 += -915131697) * -1278897105 - 1]);
    }
    
    public void method746() {
	throw new UnsupportedOperationException();
    }
    
    public boolean hasNext() {
	return (((Class29) this).anInt305 * -1278897105
		< (((Class25) ((Class29) this).this$0)
		   .anInterface10Array235).length);
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    public Object method747() {
	return (((Class25) ((Class29) this).this$0).anInterface10Array235
		[(((Class29) this).anInt305 += -915131697) * -1278897105 - 1]);
    }
    
    Class29(Class25 class25) {
	((Class29) this).this$0 = class25;
    }
    
    public void method748() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method749() {
	return (((Class29) this).anInt305 * -1278897105
		< (((Class25) ((Class29) this).this$0)
		   .anInterface10Array235).length);
    }
    
    public boolean method750() {
	return (((Class29) this).anInt305 * -1278897105
		< (((Class25) ((Class29) this).this$0)
		   .anInterface10Array235).length);
    }
    
    static final void method751(int i, int i_0_, int i_1_, int i_2_) {
	String string = new StringBuilder().append("tele ").append(i).append
			    (Class49.aString555).append
			    (i_0_ >> 6).append
			    (Class49.aString555).append
			    (i_1_ >> 6).append
			    (Class49.aString555).append
			    (i_0_ & 0x3f).append
			    (Class49.aString555).append
			    (i_1_ & 0x3f).toString();
	System.out.println(string);
	Class445_Sub5.method9222(string, true, false, 2008672007);
    }
    
    static final void method752(Class229 class229, Class226 class226,
				Class648 class648, int i) {
	class229.aString2482
	    = (String) (((Class648) class648).anObjectArray8396
			[((((Class648) class648).anInt8410 -= 1600226731)
			  * -520794877)]);
    }
}
