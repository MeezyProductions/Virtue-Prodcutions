/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService
{
    List aList10610 = new ArrayList();
    static volatile IcmpService_Sub1 anIcmpService_Sub1_10611;
    
    protected void notify(int i) {
	Iterator iterator = ((IcmpService_Sub1) this).aList10610.iterator();
	while (iterator.hasNext()) {
	    Interface72 interface72 = (Interface72) iterator.next();
	    interface72.method477(i == 0, (short) 16090);
	}
    }
    
    protected void notify(int i, int i_0_, int i_1_) {
	Iterator iterator = ((IcmpService_Sub1) this).aList10610.iterator();
	while (iterator.hasNext()) {
	    Interface72 interface72 = (Interface72) iterator.next();
	    interface72.method478(i, i_0_, i_1_, 1590283021);
	}
    }
    
    protected void method1175(int i) {
	Iterator iterator = ((IcmpService_Sub1) this).aList10610.iterator();
	while (iterator.hasNext()) {
	    Interface72 interface72 = (Interface72) iterator.next();
	    interface72.method477(i == 0, (short) 6509);
	}
    }
    
    IcmpService_Sub1() {
	/* empty */
    }
    
    protected void method1177(int i, int i_2_, int i_3_) {
	Iterator iterator = ((IcmpService_Sub1) this).aList10610.iterator();
	while (iterator.hasNext()) {
	    Interface72 interface72 = (Interface72) iterator.next();
	    interface72.method478(i, i_2_, i_3_, 1739351539);
	}
    }
    
    public static void method9566() {
	if (anIcmpService_Sub1_10611 != null) {
	    try {
		anIcmpService_Sub1_10611.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    anIcmpService_Sub1_10611 = null;
	}
    }
    
    public static boolean method9567() {
	do {
	    boolean bool;
	    try {
		if (available())
		    break;
		bool = false;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	} while (false);
	if (null != anIcmpService_Sub1_10611)
	    throw new IllegalStateException("");
	anIcmpService_Sub1_10611 = new IcmpService_Sub1();
	Thread thread = new Thread(new Class633());
	thread.setDaemon(true);
	thread.start();
	return true;
    }
    
    protected void method1176(int i, int i_4_, int i_5_) {
	Iterator iterator = ((IcmpService_Sub1) this).aList10610.iterator();
	while (iterator.hasNext()) {
	    Interface72 interface72 = (Interface72) iterator.next();
	    interface72.method478(i, i_4_, i_5_, 1578416131);
	}
    }
    
    public static boolean method9568() {
	do {
	    boolean bool;
	    try {
		if (available())
		    break;
		bool = false;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	} while (false);
	if (null != anIcmpService_Sub1_10611)
	    throw new IllegalStateException("");
	anIcmpService_Sub1_10611 = new IcmpService_Sub1();
	Thread thread = new Thread(new Class633());
	thread.setDaemon(true);
	thread.start();
	return true;
    }
}
