/* Class631 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

import jaclib.ping.Ping;

public class Class631 implements Runnable
{
    Queue aQueue8192;
    Object anObject8193 = new Object();
    Thread aThread8194;
    
    void method7532(Object object, int i) {
	synchronized (((Class631) this).aQueue8192) {
	    ((Class631) this).aQueue8192.add(object);
	    ((Class631) this).aQueue8192.notify();
	}
    }
    
    public Class652 method7533(String string, byte i) {
	if (((Class631) this).aThread8194 == null)
	    throw new IllegalStateException("");
	if (string == null)
	    throw new IllegalArgumentException("");
	Class652 class652 = new Class652(string);
	method7532(class652, -65534);
	return class652;
    }
    
    public void method7534(int i) {
	if (null != ((Class631) this).aThread8194) {
	    method7532(((Class631) this).anObject8193, -65534);
	    try {
		((Class631) this).aThread8194.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    ((Class631) this).aThread8194 = null;
	}
    }
    
    public void method7535() {
	for (;;) {
	    Class652 class652;
	    synchronized (((Class631) this).aQueue8192) {
		Object object;
		for (object = ((Class631) this).aQueue8192.poll();
		     object == null;
		     object = ((Class631) this).aQueue8192.poll()) {
		    try {
			((Class631) this).aQueue8192.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (((Class631) this).anObject8193 == object)
		    break;
		class652 = (Class652) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName
			  (((Class652) class652).aString8425).getAddress();
		i = Ping.method593(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class652.anInt8426 = 378725879 * i;
	}
    }
    
    public void run() {
	for (;;) {
	    Class652 class652;
	    synchronized (((Class631) this).aQueue8192) {
		Object object;
		for (object = ((Class631) this).aQueue8192.poll();
		     object == null;
		     object = ((Class631) this).aQueue8192.poll()) {
		    try {
			((Class631) this).aQueue8192.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (((Class631) this).anObject8193 == object)
		    break;
		class652 = (Class652) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName
			  (((Class652) class652).aString8425).getAddress();
		i = Ping.method593(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class652.anInt8426 = 378725879 * i;
	}
    }
    
    public Class631() {
	((Class631) this).aQueue8192 = new LinkedList();
	((Class631) this).aThread8194 = new Thread(this);
	((Class631) this).aThread8194.setDaemon(true);
	((Class631) this).aThread8194.start();
    }
    
    public void method7536() {
	if (null != ((Class631) this).aThread8194) {
	    method7532(((Class631) this).anObject8193, -65534);
	    try {
		((Class631) this).aThread8194.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    ((Class631) this).aThread8194 = null;
	}
    }
    
    public void method7537() {
	if (null != ((Class631) this).aThread8194) {
	    method7532(((Class631) this).anObject8193, -65534);
	    try {
		((Class631) this).aThread8194.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    ((Class631) this).aThread8194 = null;
	}
    }
    
    public void method7538() {
	if (null != ((Class631) this).aThread8194) {
	    method7532(((Class631) this).anObject8193, -65534);
	    try {
		((Class631) this).aThread8194.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    ((Class631) this).aThread8194 = null;
	}
    }
    
    void method7539(Object object) {
	synchronized (((Class631) this).aQueue8192) {
	    ((Class631) this).aQueue8192.add(object);
	    ((Class631) this).aQueue8192.notify();
	}
    }
    
    void method7540(Object object) {
	synchronized (((Class631) this).aQueue8192) {
	    ((Class631) this).aQueue8192.add(object);
	    ((Class631) this).aQueue8192.notify();
	}
    }
    
    static final void method7541(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (((Class648) class648).anIntArray8405
	       [(((Class648) class648).anIntArray8414
		 [((Class648) class648).anInt8390 * -630179809])]);
    }
    
    static final void method7542(Class648 class648, byte i) {
	if (client.aString11133 != null)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= Class189.method2771(client.aString11133, -1333077652);
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
    }
    
    static final void method7543(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = ((Class648) class648).aClass308_8391.aByteArray3391[i_0_];
    }
    
    static final void method7544(Class648 class648, int i) {
	((Class648) class648).anInt8410 -= -1094513834;
	String string
	    = (String) (((Class648) class648).anObjectArray8396
			[((Class648) class648).anInt8410 * -520794877]);
	String string_1_
	    = (String) (((Class648) class648).anObjectArray8396
			[1 + -520794877 * ((Class648) class648).anInt8410]);
	((Class648) class648).anInt8395 -= -1816921966;
	int i_2_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	if (string_1_ == null)
	    string_1_ = "";
	if (string_1_.length() > 80)
	    string_1_ = string_1_.substring(0, 80);
	Class109 class109 = Class591.method7078((byte) 78);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4512,
				  class109.aClass10_1379, -2091810672);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
	    ((Class14.method627(string, -1982789632) + 2
	      + Class14.method627(string_1_, -1357819187)),
	     (byte) -28);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
							     -1936289654);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i_2_ - 1,
							     (byte) -98);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i_3_, (byte) -9);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string_1_,
							     -1936289654);
	class109.method1380(class528_sub34, 468124496);
    }
    
    static final void method7545(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) 83);
	Class226 class226 = Class380.aClass226Array3970[i_4_ >> 16];
	Class61.method1020(class229, class226, class648, 990630830);
    }
    
    static final void method7546(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub30_10600
		  .method10069(1822176799) == 1 ? 1 : 0;
    }
    
    static final void method7547(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1087215923 * class229.anInt2360;
    }
    
    static ByteBuffer method7548(byte i) {
	ByteBuffer class528_sub42 = new ByteBuffer(518);
	Class54.anIntArray655 = new int[4];
	Class54.anIntArray655[0] = (int) (Math.random() * 9.9999999E7);
	Class54.anIntArray655[1] = (int) (Math.random() * 9.9999999E7);
	Class54.anIntArray655[2] = (int) (Math.random() * 9.9999999E7);
	Class54.anIntArray655[3] = (int) (Math.random() * 9.9999999E7);
	class528_sub42.writeByte(10, (byte) -105);
	class528_sub42.writeInt(Class54.anIntArray655[0], 2071825198);
	class528_sub42.writeInt(Class54.anIntArray655[1], 2116188301);
	class528_sub42.writeInt(Class54.anIntArray655[2], 2072895180);
	class528_sub42.writeInt(Class54.anIntArray655[3], 2090141926);
	return class528_sub42;
    }
    
    static final void method7549(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class229.method3234(class229, class226, class648, (byte) -43);
    }
}
