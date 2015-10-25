/* Class557 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;

class Class557 implements Runnable
{
    Class364_Sub1 this$0;
    public static Class455 aClass455_7466;
    static int anInt7467;
    
    Class557(Class364_Sub1 class364_sub1) {
	((Class557) this).this$0 = class364_sub1;
    }
    
    public void run() {
	try {
	    while (!((Class364_Sub1) ((Class557) this).this$0).aBool10137) {
		Iterator iterator = ((Class364_Sub1) ((Class557) this).this$0)
					.aList10134.iterator();
		while (iterator.hasNext()) {
		    Class558 class558 = (Class558) iterator.next();
		    class558.method6762(-999486349);
		}
		HashMap hashmap
		    = ((Class557) this).this$0.method9166((byte) 97);
		Iterator iterator_0_ = hashmap.keySet().iterator();
		while (iterator_0_.hasNext()) {
		    Class480 class480 = (Class480) iterator_0_.next();
		    if (!class480.aBool5452) {
			Class468[] class468s
			    = (Class468[]) hashmap.get(class480);
			for (int i = 0; i < class468s.length; i++)
			    class468s[i].method5677(-172122540);
		    }
		}
		iterator_0_ = ((Class364_Sub1) ((Class557) this).this$0)
				  .aList10134.iterator();
		while (iterator_0_.hasNext()) {
		    Class558 class558 = (Class558) iterator_0_.next();
		    class558.method6763(1239022665);
		}
		Class511_Sub1.method9241(6L);
	    }
	} catch (Exception exception) {
	    VarDomainType.method5340(null, exception, 1950499418);
	    exception.printStackTrace();
	}
    }
    
    public void method6759() {
	try {
	    while (!((Class364_Sub1) ((Class557) this).this$0).aBool10137) {
		Iterator iterator = ((Class364_Sub1) ((Class557) this).this$0)
					.aList10134.iterator();
		while (iterator.hasNext()) {
		    Class558 class558 = (Class558) iterator.next();
		    class558.method6762(-1928768112);
		}
		HashMap hashmap
		    = ((Class557) this).this$0.method9166((byte) 110);
		Iterator iterator_1_ = hashmap.keySet().iterator();
		while (iterator_1_.hasNext()) {
		    Class480 class480 = (Class480) iterator_1_.next();
		    if (!class480.aBool5452) {
			Class468[] class468s
			    = (Class468[]) hashmap.get(class480);
			for (int i = 0; i < class468s.length; i++)
			    class468s[i].method5677(-1036978095);
		    }
		}
		iterator_1_ = ((Class364_Sub1) ((Class557) this).this$0)
				  .aList10134.iterator();
		while (iterator_1_.hasNext()) {
		    Class558 class558 = (Class558) iterator_1_.next();
		    class558.method6763(1239022665);
		}
		Class511_Sub1.method9241(6L);
	    }
	} catch (Exception exception) {
	    VarDomainType.method5340(null, exception, 2085948736);
	    exception.printStackTrace();
	}
    }
    
    static void method6760(Class226 class226, Class229 class229, int i) {
	if (null != class229) {
	    if (1835803215 * class229.anInt2377 != -1) {
		Class229 class229_2_
		    = (class226.aClass229Array2336
		       [-1027873541 * class229.anInt2522 & 0xffff]);
		if (null != class229_2_) {
		    if (class229_2_.aClass229Array2542
			== class229_2_.aClass229Array2390) {
			class229_2_.aClass229Array2390
			    = (new Class229
			       [class229_2_.aClass229Array2542.length]);
			class229_2_.aClass229Array2390[0] = class229;
			Class670.method7940(class229_2_.aClass229Array2542, 0,
					    class229_2_.aClass229Array2390, 1,
					    1835803215 * class229.anInt2377);
			Class670.method7940
			    (class229_2_.aClass229Array2542,
			     1 + class229.anInt2377 * 1835803215,
			     class229_2_.aClass229Array2390,
			     1835803215 * class229.anInt2377 + 1,
			     (class229_2_.aClass229Array2542.length
			      - class229.anInt2377 * 1835803215 - 1));
		    } else {
			int i_3_ = 0;
			Class229[] class229s;
			for (class229s = class229_2_.aClass229Array2390;
			     (i_3_ < class229s.length
			      && class229 != class229s[i_3_]);
			     i_3_++) {
			    /* empty */
			}
			if (i_3_ < class229s.length) {
			    Class670.method7940(class229s, 0, class229s, 1,
						i_3_);
			    class229s[0] = class229;
			}
		    }
		}
	    } else {
		Class229[] class229s = class226.method3176(-1350237444);
		int i_4_;
		for (i_4_ = 0;
		     i_4_ < class229s.length && class229s[i_4_] != class229;
		     i_4_++) {
		    /* empty */
		}
		if (i_4_ < class229s.length) {
		    Class670.method7940(class229s, 0, class229s, 1, i_4_);
		    class229s[0] = class229;
		}
	    }
	}
    }
    
    static final void method6761(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2456
	    = Class181_Sub23.method8999(string, class648, (byte) 91);
	class229.aBool2483 = true;
    }
}
