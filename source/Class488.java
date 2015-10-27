/* Class488 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class488 implements Runnable
{
    volatile boolean aBool5495 = false;
    LinkedList aLinkedList5496 = new LinkedList();
    Class495 aClass495_5497 = new Class495(true);
    
    public boolean method5893(int i) {
	return this.aBool5495;
    }
    
    public void method5894(Class5_Sub15 class5_sub15, int i) {
	this.aClass495_5497.method5981(class5_sub15, 2100736071);
    }
    
    public void method5895(Class498 class498, int i) {
	synchronized (this.aLinkedList5496) {
	    this.aLinkedList5496.add(class498);
	    this.aLinkedList5496.notify();
	}
    }
    
    public boolean method5896() {
	return this.aBool5495;
    }
    
    public Class495 method5897(int i) {
	return this.aClass495_5497;
    }
    
    void method5898(Class495 class495, int i) {
	this.aClass495_5497 = class495;
    }
    
    void method5899(int i) {
	Object object = null;
	Class498 class498;
	synchronized (this.aLinkedList5496) {
	    try {
		this.aLinkedList5496.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class498
		= (Class498) this.aLinkedList5496.pollFirst();
	}
	do {
	    try {
		try {
		    if (null != class498) {
			this.aBool5495 = true;
			method5901(class498, (byte) -58);
		    }
		} catch (Exception exception) {
		    this.aBool5495 = false;
		    break;
		}
		this.aBool5495 = false;
			} catch (Exception object_0_) {
		this.aBool5495 = false;
		throw object_0_;
	    }
	} while (false);
    }
    
    void method5900() {
	Object object = null;
	Class498 class498;
	synchronized (this.aLinkedList5496) {
	    try {
		this.aLinkedList5496.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class498
		= (Class498) this.aLinkedList5496.pollFirst();
	}
	do {
	    try {
		try {
		    if (null != class498) {
			this.aBool5495 = true;
			method5901(class498, (byte) -97);
		    }
		} catch (Exception exception) {
		    this.aBool5495 = false;
		    break;
		}
		this.aBool5495 = false;
			} catch (Exception object_1_) {
		this.aBool5495 = false;
		throw object_1_;
	    }
	} while (false);
    }
    
    void method5901(Class498 class498, byte i) {
	if (class498.aClass489_6837 == Class489.aClass489_5505)
	    this.aClass495_5497.method5989(2016078152);
	else
	    this.aClass495_5497.method5990(class498, 1268833808);
	for (boolean bool
		 = this.aClass495_5497.method5980((byte) 8);
	     !bool;
	     bool = this.aClass495_5497.method5980((byte) 8)) {
	    /* empty */
	}
	this.aClass495_5497.method6034(-2091361076);
	client.gameScene.method6034(-1970996056);
    }
    
    public void method5902() {
	for (;;)
	    method5899(1837861986);
    }
    
    public boolean method5903() {
	return this.aBool5495;
    }
    
    void method5904() {
	Object object = null;
	Class498 class498;
	synchronized (this.aLinkedList5496) {
	    try {
		this.aLinkedList5496.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class498
		= (Class498) this.aLinkedList5496.pollFirst();
	}
	do {
	    try {
		try {
		    if (null != class498) {
			this.aBool5495 = true;
			method5901(class498, (byte) 65);
		    }
		} catch (Exception exception) {
		    this.aBool5495 = false;
		    break;
		}
		this.aBool5495 = false;
			} catch (Exception object_2_) {
		this.aBool5495 = false;
		throw object_2_;
	    }
	} while (false);
    }
    
    @Override
	public void run() {
	for (;;)
	    method5899(977777357);
    }
    
    void method5905() {
	Object object = null;
	Class498 class498;
	synchronized (this.aLinkedList5496) {
	    try {
		this.aLinkedList5496.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class498
		= (Class498) this.aLinkedList5496.pollFirst();
	}
	do {
	    try {
		try {
		    if (null != class498) {
			this.aBool5495 = true;
			method5901(class498, (byte) -21);
		    }
		} catch (Exception exception) {
		    this.aBool5495 = false;
		    break;
		}
		this.aBool5495 = false;
			} catch (Exception object_3_) {
		this.aBool5495 = false;
		throw object_3_;
	    }
	} while (false);
    }
    
    static final void method5906(Class648 class648, int i) {
	int i_4_
	    = (class648.anIntArray8394
	       [(class648.anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) -5);
	Class226 class226 = Class380.aClass226Array3970[i_4_ >> 16];
	Class525.method6390(class229, class226, class648, -2045797045);
    }
    
    static final void method5907(Class229 class229, Class648 class648, int i) {
	class648.anInt8395 -= -577899301;
	int i_5_ = ((class648.anIntArray8394
		     [717927929 * class648.anInt8395])
		    - 1);
	int i_6_ = (class648.anIntArray8394
		    [class648.anInt8395 * 717927929 + 1]);
	int i_7_ = (class648.anIntArray8394
		    [2 + 717927929 * class648.anInt8395]);
	if (i_5_ < 0 || i_5_ > 9)
	    throw new RuntimeException();
	Class496.method6053(class229, i_5_, i_6_, i_7_, class648, 127482414);
    }
    
    static void method5908(int i) {
	ClientPacket.aClass692_11552.method8141(2098208500);
	ClientPacket.aClass679_11568.method7961(-1525349485);
	ClientPacket.aClass679_11567.method7961(-1930443003);
    }
}
