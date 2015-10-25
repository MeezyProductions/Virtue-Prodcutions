/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;

class Class138 implements Runnable
{
    Class364_Sub2 this$0;
    
    Class138(Class364_Sub2 class364_sub2) {
	((Class138) this).this$0 = class364_sub2;
    }
    
    public void run() {
	try {
	    while (!((Class364_Sub2) ((Class138) this).this$0).aBool10193) {
		HashMap hashmap
		    = ((Class138) this).this$0.method9231((byte) -17);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class480 class480 = (Class480) iterator.next();
		    if (!class480.aBool5452) {
			Class468[] class468s
			    = (Class468[]) hashmap.get(class480);
			for (int i = 0; i < class468s.length; i++)
			    class468s[i].method5674((byte) -87);
		    }
		}
		Class511_Sub1.method9241(25L);
	    }
	} catch (Exception exception) {
	    VarDomainType.method5340(null, exception, 2043826505);
	}
    }
    
    public void method1696() {
	try {
	    while (!((Class364_Sub2) ((Class138) this).this$0).aBool10193) {
		HashMap hashmap
		    = ((Class138) this).this$0.method9231((byte) -72);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class480 class480 = (Class480) iterator.next();
		    if (!class480.aBool5452) {
			Class468[] class468s
			    = (Class468[]) hashmap.get(class480);
			for (int i = 0; i < class468s.length; i++)
			    class468s[i].method5674((byte) -46);
		    }
		}
		Class511_Sub1.method9241(25L);
	    }
	} catch (Exception exception) {
	    VarDomainType.method5340(null, exception, 2072496185);
	}
    }
    
    static final void method1697(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aBool10864 ? 1 : 0;
    }
}
