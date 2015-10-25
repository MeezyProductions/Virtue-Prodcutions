/* Class455 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class455 implements Runnable
{
    Class679 aClass679_5000 = new Class679();
    int anInt5001 = 0;
    boolean aBool5002 = false;
    Thread aThread5003 = new Thread(this);
    
    public void method5499() {
	((Class455) this).aBool5002 = true;
	synchronized (((Class455) this).aClass679_5000) {
	    ((Class455) this).aClass679_5000.notifyAll();
	}
	try {
	    ((Class455) this).aThread5003.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	((Class455) this).aThread5003 = null;
    }
    
    Class528_Sub21_Sub9_Sub2 method5500(int i, Class539 class539, byte i_0_) {
	Class528_Sub21_Sub9_Sub2 class528_sub21_sub9_sub2
	    = new Class528_Sub21_Sub9_Sub2();
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).anInt11951
	    = -2028506919;
	synchronized (((Class455) this).aClass679_5000) {
	    for (Class528_Sub21_Sub9_Sub2 class528_sub21_sub9_sub2_1_
		     = (Class528_Sub21_Sub9_Sub2) ((Class455) this)
						      .aClass679_5000
						      .method7960(-1550587110);
		 class528_sub21_sub9_sub2_1_ != null;
		 class528_sub21_sub9_sub2_1_
		     = ((Class528_Sub21_Sub9_Sub2)
			((Class455) this).aClass679_5000
			    .method7969(-1026842248))) {
		if ((class528_sub21_sub9_sub2_1_.aLong10407
		     * -5214225787304728211L) == (long) i
		    && class539 == (((Class528_Sub21_Sub9_Sub2)
				     class528_sub21_sub9_sub2_1_)
				    .aClass539_11954)
		    && 2 == 2050363241 * (((Class528_Sub21_Sub9_Sub2)
					   class528_sub21_sub9_sub2_1_)
					  .anInt11951)) {
		    ((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2)
			.aByteArray11955
			= ((Class528_Sub21_Sub9_Sub2)
			   class528_sub21_sub9_sub2_1_).aByteArray11955;
		    ((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2)
			.aBool11576
			= false;
		    Class528_Sub21_Sub9_Sub2 class528_sub21_sub9_sub2_2_
			= class528_sub21_sub9_sub2;
		    return class528_sub21_sub9_sub2_2_;
		}
	    }
	}
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).aByteArray11955
	    = class539.method6612(i, (byte) 21);
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).aBool11576
	    = false;
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).aBool11577
	    = true;
	return class528_sub21_sub9_sub2;
    }
    
    public Class455() {
	((Class455) this).aThread5003.setDaemon(true);
	((Class455) this).aThread5003.start();
	((Class455) this).aThread5003.setPriority(1);
    }
    
    Class528_Sub21_Sub9_Sub2 method5501(int i, Class539 class539, byte i_3_) {
	Class528_Sub21_Sub9_Sub2 class528_sub21_sub9_sub2
	    = new Class528_Sub21_Sub9_Sub2();
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).anInt11951
	    = -1790553461;
	class528_sub21_sub9_sub2.aLong10407 = (long) i * -7069004085892986779L;
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).aClass539_11954
	    = class539;
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).aBool11577
	    = false;
	method5502(class528_sub21_sub9_sub2, (byte) -41);
	return class528_sub21_sub9_sub2;
    }
    
    void method5502(Class528_Sub21_Sub9_Sub2 class528_sub21_sub9_sub2,
		    byte i) {
	synchronized (((Class455) this).aClass679_5000) {
	    ((Class455) this).aClass679_5000
		.method7959(class528_sub21_sub9_sub2, -1299208647);
	    ((Class455) this).anInt5001 += -176359281;
	    ((Class455) this).aClass679_5000.notifyAll();
	}
    }
    
    public void run() {
	while (!((Class455) this).aBool5002) {
	    Class528_Sub21_Sub9_Sub2 class528_sub21_sub9_sub2;
	    synchronized (((Class455) this).aClass679_5000) {
		class528_sub21_sub9_sub2
		    = (Class528_Sub21_Sub9_Sub2) ((Class455) this)
						     .aClass679_5000
						     .method7962(-1203743740);
		if (null != class528_sub21_sub9_sub2)
		    ((Class455) this).anInt5001 -= -176359281;
		else {
		    try {
			((Class455) this).aClass679_5000.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if (2050363241 * ((Class528_Sub21_Sub9_Sub2)
				  class528_sub21_sub9_sub2).anInt11951
		    == 2)
		    ((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2)
			.aClass539_11954.method6607
			((int) (-5214225787304728211L
				* class528_sub21_sub9_sub2.aLong10407),
			 (((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2)
			  .aByteArray11955),
			 (((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2)
			  .aByteArray11955).length,
			 1514036356);
		else if (3
			 == 2050363241 * ((Class528_Sub21_Sub9_Sub2)
					  class528_sub21_sub9_sub2).anInt11951)
		    ((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2)
			.aByteArray11955
			= (((Class528_Sub21_Sub9_Sub2)
			    class528_sub21_sub9_sub2)
			       .aClass539_11954.method6612
			   ((int) (-5214225787304728211L
				   * class528_sub21_sub9_sub2.aLong10407),
			    (byte) 21));
	    } catch (Exception exception) {
		VarDomainType.method5340(null, exception, 1823755753);
	    }
	    ((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).aBool11576
		= false;
	}
    }
    
    Class528_Sub21_Sub9_Sub2 method5503(int i, byte[] is, Class539 class539,
					short i_4_) {
	Class528_Sub21_Sub9_Sub2 class528_sub21_sub9_sub2
	    = new Class528_Sub21_Sub9_Sub2();
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).anInt11951
	    = 237953458;
	class528_sub21_sub9_sub2.aLong10407 = (long) i * -7069004085892986779L;
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).aByteArray11955
	    = is;
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).aClass539_11954
	    = class539;
	((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).aBool11577
	    = false;
	method5502(class528_sub21_sub9_sub2, (byte) 12);
	return class528_sub21_sub9_sub2;
    }
    
    public void method5504(int i) {
	((Class455) this).aBool5002 = true;
	synchronized (((Class455) this).aClass679_5000) {
	    ((Class455) this).aClass679_5000.notifyAll();
	}
	try {
	    ((Class455) this).aThread5003.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	((Class455) this).aThread5003 = null;
    }
    
    public void method5505() {
	while (!((Class455) this).aBool5002) {
	    Class528_Sub21_Sub9_Sub2 class528_sub21_sub9_sub2;
	    synchronized (((Class455) this).aClass679_5000) {
		class528_sub21_sub9_sub2
		    = (Class528_Sub21_Sub9_Sub2) ((Class455) this)
						     .aClass679_5000
						     .method7962(-463114692);
		if (null != class528_sub21_sub9_sub2)
		    ((Class455) this).anInt5001 -= -176359281;
		else {
		    try {
			((Class455) this).aClass679_5000.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if (2050363241 * ((Class528_Sub21_Sub9_Sub2)
				  class528_sub21_sub9_sub2).anInt11951
		    == 2)
		    ((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2)
			.aClass539_11954.method6607
			((int) (-5214225787304728211L
				* class528_sub21_sub9_sub2.aLong10407),
			 (((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2)
			  .aByteArray11955),
			 (((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2)
			  .aByteArray11955).length,
			 955958727);
		else if (3
			 == 2050363241 * ((Class528_Sub21_Sub9_Sub2)
					  class528_sub21_sub9_sub2).anInt11951)
		    ((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2)
			.aByteArray11955
			= (((Class528_Sub21_Sub9_Sub2)
			    class528_sub21_sub9_sub2)
			       .aClass539_11954.method6612
			   ((int) (-5214225787304728211L
				   * class528_sub21_sub9_sub2.aLong10407),
			    (byte) 21));
	    } catch (Exception exception) {
		VarDomainType.method5340(null, exception, 1842602473);
	    }
	    ((Class528_Sub21_Sub9_Sub2) class528_sub21_sub9_sub2).aBool11576
		= false;
	}
    }
    
    public int method5506(int i) {
	synchronized (((Class455) this).aClass679_5000) {
	    int i_5_ = -1226496401 * ((Class455) this).anInt5001;
	    return i_5_;
	}
    }
    
    public int method5507() {
	synchronized (((Class455) this).aClass679_5000) {
	    int i = -1226496401 * ((Class455) this).anInt5001;
	    return i;
	}
    }
    
    public int method5508() {
	synchronized (((Class455) this).aClass679_5000) {
	    int i = -1226496401 * ((Class455) this).anInt5001;
	    return i;
	}
    }
    
    public void method5509() {
	((Class455) this).aBool5002 = true;
	synchronized (((Class455) this).aClass679_5000) {
	    ((Class455) this).aClass679_5000.notifyAll();
	}
	try {
	    ((Class455) this).aThread5003.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	((Class455) this).aThread5003 = null;
    }
    
    public void method5510() {
	((Class455) this).aBool5002 = true;
	synchronized (((Class455) this).aClass679_5000) {
	    ((Class455) this).aClass679_5000.notifyAll();
	}
	try {
	    ((Class455) this).aThread5003.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	((Class455) this).aThread5003 = null;
    }
    
    static final void method5511(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class616.method7372(class229, class226, class648, -1626937533);
    }
    
    static final void method5512(Class648 class648, byte i) {
	int i_6_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_6_, (byte) 28);
	Class226 class226 = Class380.aClass226Array3970[i_6_ >> 16];
	Class379.method4716(class229, class226, class648, 2145426438);
    }
    
    static final void method5513(Class648 class648, int i) {
	int i_7_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (client.anInt11158 * 1234694097 == 2 && i_7_ >= 0
	    && i_7_ < -1314218023 * client.anInt11157)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= client.aClass62Array11160[i_7_].anInt716 * -938215239;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    static final void method5514(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	byte[] is = { (byte) ((Class648) class648).anIntArray8394
			     [((Class648) class648).anInt8395 * 717927929] };
	byte[] is_8_
	    = { (byte) ((Class648) class648).anIntArray8394
		       [717927929 * ((Class648) class648).anInt8395 + 1] };
	int i_9_ = (((Class648) class648).anIntArray8394
		    [2 + 717927929 * ((Class648) class648).anInt8395]);
	Class229 class229 = Class623_Sub1.method9755(i_9_, (byte) 40);
	Class373.method4684(class229, is, is_8_, class648, (byte) 47);
    }
    
    static final void method5515(Class648 class648, byte i) {
	Class181_Sub18.anInt9847 = 0;
    }
    
    static boolean method5516(boolean bool, boolean bool_10_, String string,
			      String string_11_, long l) {
	Class54.reconnecting = bool;
	if (!bool_10_)
	    Class54.anInt631 = 1168625563;
	Class54.aBool627 = bool_10_;
	Class54.aString662 = string;
	Class54.aString663 = string_11_;
	Class54.aLong632 = -7408127865711447937L * l;
	if (!Class54.aBool627 && (Class54.aString662.equals("")
				  || Class54.aString663.equals(""))) {
	    Class471.method5815(3, -607367357);
	    Class15.method633((short) 23550);
	    return false;
	}
	if (153 != -1132112883 * Class54.anInt651) {
	    Class54.anInt673 = 0;
	    Class54.anInt679 = 1721793801;
	    Class54.anInt674 = 249656329;
	}
	Class54.aClass109_624.aBool1387 = false;
	Class471.method5815(-3, -617359955);
	Class54.stage = -374956199;
	Class54.anInt666 = 0;
	Class54.anInt667 = 0;
	return true;
    }
}
