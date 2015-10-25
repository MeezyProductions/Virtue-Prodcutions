/* Class550 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;

class Class550 implements Runnable
{
    Class364_Sub1 this$0;
    
    public void run() {
	try {
	    while (!((Class364_Sub1) ((Class550) this).this$0).aBool10137) {
		HashMap hashmap
		    = ((Class550) this).this$0.method9166((byte) 94);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class480 class480 = (Class480) iterator.next();
		    if (!class480.aBool5452) {
			Class468[] class468s
			    = (Class468[]) hashmap.get(class480);
			for (int i = 0; i < class468s.length; i++)
			    class468s[i].method5674((byte) -64);
		    }
		}
		Class511_Sub1.method9241(10L);
	    }
	} catch (Exception exception) {
	    VarDomainType.method5340(null, exception, 1932319321);
	    exception.printStackTrace();
	}
    }
    
    Class550(Class364_Sub1 class364_sub1) {
	((Class550) this).this$0 = class364_sub1;
    }
    
    public void method6686() {
	try {
	    while (!((Class364_Sub1) ((Class550) this).this$0).aBool10137) {
		HashMap hashmap
		    = ((Class550) this).this$0.method9166((byte) 14);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class480 class480 = (Class480) iterator.next();
		    if (!class480.aBool5452) {
			Class468[] class468s
			    = (Class468[]) hashmap.get(class480);
			for (int i = 0; i < class468s.length; i++)
			    class468s[i].method5674((byte) -111);
		    }
		}
		Class511_Sub1.method9241(10L);
	    }
	} catch (Exception exception) {
	    VarDomainType.method5340(null, exception, 1829259986);
	    exception.printStackTrace();
	}
    }
    
    public static final void method6687(String string, String string_0_,
					int i) {
	Class109 class109 = Class591.method7078((byte) 93);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4470,
				  class109.aClass10_1379, -1994279252);
	if (string_0_.length() > 30)
	    string_0_ = string_0_.substring(0, 30);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
	    ((Class14.method627(string, -1935227571)
	      + Class14.method627(string_0_, -2063350458)),
	     (byte) 0);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string_0_,
							     -1936289654);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
							     -1936289654);
	class109.method1380(class528_sub34, 1246265622);
    }
    
    public static void method6688(int i, int i_1_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(8, (long) i);
	class528_sub21_sub7.method10495(-1183647590);
    }
}
