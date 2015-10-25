/* Class364_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class364_Sub1 extends Class364
{
    List aList10134;
    Class355 aClass355_10135;
    Thread aThread10136;
    volatile boolean aBool10137 = false;
    static final float aFloat10138 = 2.0F;
    Thread aThread10139;
    HashMap aHashMap10140;
    Runnable aRunnable10141;
    Runnable aRunnable10142;
    
    public Class468 method4607(Class480 class480, byte i) {
	synchronized (((Class364_Sub1) this).aHashMap10140) {
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub1) this).aHashMap10140.get(class480));
	    if (null == class468s) {
		Class468 class468 = null;
		return class468;
	    }
	    for (int i_0_ = 0; i_0_ < class468s.length; i_0_++) {
		Class468 class468 = class468s[i_0_];
		Class472 class472 = class468.method5722(-1369325982);
		if (class472 == Class472.aClass472_5407) {
		    class468.method5693((byte) 100);
		    Class468 class468_1_ = class468;
		    return class468_1_;
		}
	    }
	}
	return null;
    }
    
    Object method4623(Class351 class351) {
	return null;
    }
    
    public void method4617(Object object, byte[] is, int i, int i_2_) {
	if (object != null && object instanceof Class531) {
	    Class531 class531 = (Class531) object;
	    synchronized (((Class531) class531).aClass558_7121) {
		class531.method6466(is, i, i_2_, (byte) -39);
	    }
	}
    }
    
    public int method4613(Object object, int i) {
	if (object != null && object instanceof Class531) {
	    Class531 class531 = (Class531) object;
	    synchronized (((Class531) class531).aClass558_7121) {
		int i_3_ = class531.method6467(-1759249844);
		return i_3_;
	    }
	}
	return 0;
    }
    
    public Class468 method4619(Class480 class480) {
	synchronized (((Class364_Sub1) this).aHashMap10140) {
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub1) this).aHashMap10140.get(class480));
	    if (null == class468s) {
		Class468 class468 = null;
		return class468;
	    }
	    for (int i = 0; i < class468s.length; i++) {
		Class468 class468 = class468s[i];
		Class472 class472 = class468.method5722(-1369325982);
		if (class472 == Class472.aClass472_5407) {
		    class468.method5693((byte) 75);
		    Class468 class468_4_ = class468;
		    return class468_4_;
		}
	    }
	}
	return null;
    }
    
    public void method4604(Object object, int i) {
	if (null != object && object instanceof Class531) {
	    Class531 class531 = (Class531) object;
	    synchronized (((Class531) class531).aClass558_7121) {
		((Class531) class531).aClass558_7121.method6765(class531,
								205382038);
	    }
	}
    }
    
    public int method4615(Object object) {
	if (object != null && object instanceof Class531) {
	    Class531 class531 = (Class531) object;
	    synchronized (((Class531) class531).aClass558_7121) {
		int i = class531.method6467(-954003550);
		return i;
	    }
	}
	return 0;
    }
    
    public Class468 method4629(Class480 class480) {
	synchronized (((Class364_Sub1) this).aHashMap10140) {
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub1) this).aHashMap10140.get(class480));
	    if (null == class468s) {
		Class468 class468 = null;
		return class468;
	    }
	    for (int i = 0; i < class468s.length; i++) {
		Class468 class468 = class468s[i];
		Class472 class472 = class468.method5722(-1369325982);
		if (class472 == Class472.aClass472_5407) {
		    class468.method5693((byte) 66);
		    Class468 class468_5_ = class468;
		    return class468_5_;
		}
	    }
	}
	return null;
    }
    
    Class558 method9164(float f, byte i) {
	float f_6_ = -1.0F;
	float f_7_ = 3.4028235E38F;
	Class558 class558 = null;
	Iterator iterator = ((Class364_Sub1) this).aList10134.iterator();
	while (iterator.hasNext()) {
	    Class558 class558_8_ = (Class558) iterator.next();
	    float f_9_ = ((Class558) class558_8_).aFloat7475;
	    float f_10_ = Math.abs(f_9_ - f);
	    if (f_6_ < 0.0F || f_10_ < f_7_) {
		f_6_ = f_9_;
		f_7_ = f_10_;
		class558 = class558_8_;
	    }
	}
	return class558;
    }
    
    HashMap method9165() {
	return ((Class364_Sub1) this).aHashMap10140;
    }
    
    public Class355 method4609(byte i) {
	return ((Class364_Sub1) this).aClass355_10135;
    }
    
    public void method4610(int i) {
	HashMap hashmap = method9166((byte) 87);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class480 class480 = (Class480) iterator.next();
		Class468[] class468s = (Class468[]) hashmap.get(class480);
		for (int i_11_ = 0; i_11_ < class468s.length; i_11_++) {
		    if (class468s[i_11_].method5722(-1369325982)
			!= Class472.aClass472_5407) {
			class468s[i_11_].method5696(-2117664730);
			class468s[i_11_].method5656(-1811045213);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class480 class480 = (Class480) iterator.next();
		    Class468[] class468s = (Class468[]) hashmap.get(class480);
		    for (int i_12_ = 0; i_12_ < class468s.length; i_12_++) {
			if (class468s[i_12_].method5722(-1369325982)
			    != Class472.aClass472_5407) {
			    class468s[i_12_].method5666(-726616849);
			    bool = false;
			}
		    }
		}
	    }
	    Class511_Sub1.method9241(10L);
	}
	((Class364_Sub1) this).aBool10137 = true;
	try {
	    ((Class364_Sub1) this).aThread10139.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class364_Sub1) this).aThread10136.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method4611() {
	if (null != ((Class364_Sub1) this).aClass355_10135)
	    ((Class364_Sub1) this).aClass355_10135.method4580((byte) -5);
	Iterator iterator
	    = ((Class364_Sub1) this).aHashMap10140.keySet().iterator();
	while (iterator.hasNext()) {
	    Class480 class480 = (Class480) iterator.next();
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub1) this).aHashMap10140.get(class480));
	    if (!class480.aBool5452) {
		boolean bool = false;
		for (int i = 0; i < class468s.length; i++) {
		    class468s[i].method5666(-421385484);
		    bool |= class468s[i].method5665((byte) 1);
		}
		if (bool)
		    Arrays.sort(class468s, new Class519(this));
	    }
	    int i = 6;
	    boolean bool = false;
	    int i_13_ = class468s.length - 1;
	    while (!bool) {
		float f = class468s[i_13_].method5651((byte) -10);
		Class472 class472 = class468s[i_13_].method5722(-1369325982);
		if (f < 0.0F) {
		    if (Class472.aClass472_5411 == class472
			|| Class472.aClass472_5409 == class472
			|| class472 == Class472.aClass472_5408)
			class468s[i_13_].method5696(-2117879828);
		} else
		    bool = true;
		if (--i_13_ < 0)
		    bool = true;
	    }
	    if (i_13_ >= class468s.length - i) {
		for (/**/; i_13_ >= class468s.length - i; i_13_--) {
		    Class472 class472
			= class468s[i_13_].method5722(-1369325982);
		    if (class472 == Class472.aClass472_5411)
			class468s[i_13_].method5696(-2139237380);
		}
	    }
	}
    }
    
    public void method4606(int i) {
	if (null != ((Class364_Sub1) this).aClass355_10135)
	    ((Class364_Sub1) this).aClass355_10135.method4580((byte) 39);
	Iterator iterator
	    = ((Class364_Sub1) this).aHashMap10140.keySet().iterator();
	while (iterator.hasNext()) {
	    Class480 class480 = (Class480) iterator.next();
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub1) this).aHashMap10140.get(class480));
	    if (!class480.aBool5452) {
		boolean bool = false;
		for (int i_14_ = 0; i_14_ < class468s.length; i_14_++) {
		    class468s[i_14_].method5666(1873681816);
		    bool |= class468s[i_14_].method5665((byte) 1);
		}
		if (bool)
		    Arrays.sort(class468s, new Class519(this));
	    }
	    int i_15_ = 6;
	    boolean bool = false;
	    int i_16_ = class468s.length - 1;
	    while (!bool) {
		float f = class468s[i_16_].method5651((byte) -4);
		Class472 class472 = class468s[i_16_].method5722(-1369325982);
		if (f < 0.0F) {
		    if (Class472.aClass472_5411 == class472
			|| Class472.aClass472_5409 == class472
			|| class472 == Class472.aClass472_5408)
			class468s[i_16_].method5696(-2145862983);
		} else
		    bool = true;
		if (--i_16_ < 0)
		    bool = true;
	    }
	    if (i_16_ >= class468s.length - i_15_) {
		for (/**/; i_16_ >= class468s.length - i_15_; i_16_--) {
		    Class472 class472
			= class468s[i_16_].method5722(-1369325982);
		    if (class472 == Class472.aClass472_5411)
			class468s[i_16_].method5696(-2121745821);
		}
	    }
	}
    }
    
    public void method4626(Object object, byte[] is, int i, int i_17_,
			   byte i_18_) {
	if (object != null && object instanceof Class531) {
	    Class531 class531 = (Class531) object;
	    synchronized (((Class531) class531).aClass558_7121) {
		class531.method6466(is, i, i_17_, (byte) -35);
	    }
	}
    }
    
    public Object method4614(int i, int i_19_, Class365 class365,
			     Class362 class362, int i_20_, float f) {
	Class558 class558 = method9164(f * (float) i_19_, (byte) -12);
	Class531 class531
	    = new Class531(this, class558, i_20_, (float) i_19_ * f,
			   1968729145 * class365.anInt3842, i < 2 ? 2 : i,
			   (class365 == Class365.aClass365_3846
			    || class365 == Class365.aClass365_3844),
			   class362 == Class362.aClass362_3834);
	synchronized (((Class531) class531).aClass558_7121) {
	    ((Class531) class531).aClass558_7121.method6769(class531,
							    -1249703392);
	}
	return class531;
    }
    
    public Object method4620(int i, int i_21_, Class365 class365,
			     Class362 class362, int i_22_, float f) {
	Class558 class558 = method9164(f * (float) i_21_, (byte) -15);
	Class531 class531
	    = new Class531(this, class558, i_22_, (float) i_21_ * f,
			   1968729145 * class365.anInt3842, i < 2 ? 2 : i,
			   (class365 == Class365.aClass365_3846
			    || class365 == Class365.aClass365_3844),
			   class362 == Class362.aClass362_3834);
	synchronized (((Class531) class531).aClass558_7121) {
	    ((Class531) class531).aClass558_7121.method6769(class531,
							    -1552316667);
	}
	return class531;
    }
    
    public void method4616(Object object) {
	if (null != object && object instanceof Class531) {
	    Class531 class531 = (Class531) object;
	    synchronized (((Class531) class531).aClass558_7121) {
		((Class531) class531).aClass558_7121.method6765(class531,
								-974980717);
	    }
	}
    }
    
    HashMap method9166(byte i) {
	return ((Class364_Sub1) this).aHashMap10140;
    }
    
    public void method4618(Object object, byte[] is, int i, int i_23_) {
	if (object != null && object instanceof Class531) {
	    Class531 class531 = (Class531) object;
	    synchronized (((Class531) class531).aClass558_7121) {
		class531.method6466(is, i, i_23_, (byte) -100);
	    }
	}
    }
    
    public void method4612() {
	if (null != ((Class364_Sub1) this).aClass355_10135)
	    ((Class364_Sub1) this).aClass355_10135.method4580((byte) -31);
	Iterator iterator
	    = ((Class364_Sub1) this).aHashMap10140.keySet().iterator();
	while (iterator.hasNext()) {
	    Class480 class480 = (Class480) iterator.next();
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub1) this).aHashMap10140.get(class480));
	    if (!class480.aBool5452) {
		boolean bool = false;
		for (int i = 0; i < class468s.length; i++) {
		    class468s[i].method5666(-855070112);
		    bool |= class468s[i].method5665((byte) 1);
		}
		if (bool)
		    Arrays.sort(class468s, new Class519(this));
	    }
	    int i = 6;
	    boolean bool = false;
	    int i_24_ = class468s.length - 1;
	    while (!bool) {
		float f = class468s[i_24_].method5651((byte) -82);
		Class472 class472 = class468s[i_24_].method5722(-1369325982);
		if (f < 0.0F) {
		    if (Class472.aClass472_5411 == class472
			|| Class472.aClass472_5409 == class472
			|| class472 == Class472.aClass472_5408)
			class468s[i_24_].method5696(-2146468552);
		} else
		    bool = true;
		if (--i_24_ < 0)
		    bool = true;
	    }
	    if (i_24_ >= class468s.length - i) {
		for (/**/; i_24_ >= class468s.length - i; i_24_--) {
		    Class472 class472
			= class468s[i_24_].method5722(-1369325982);
		    if (class472 == Class472.aClass472_5411)
			class468s[i_24_].method5696(-2091361099);
		}
	    }
	}
    }
    
    Object method4608(Class351 class351, int i) {
	return null;
    }
    
    public Class364_Sub1(Class642 class642) {
	((Class364_Sub1) this).aList10134 = new ArrayList();
	((Class364_Sub1) this).aRunnable10141 = new Class557(this);
	((Class364_Sub1) this).aRunnable10142 = new Class550(this);
	((Class364_Sub1) this).aClass355_10135 = new Class355(this);
	((Class364_Sub1) this).aHashMap10140 = new HashMap();
	Iterator iterator = class642.aHashMap8274.keySet().iterator();
	while (iterator.hasNext()) {
	    Class480 class480 = (Class480) iterator.next();
	    ((Class364_Sub1) this).aHashMap10140.put(class480,
						     (new Class468
						      [((Integer)
							class642
							    .aHashMap8274
							    .get(class480))
							   .intValue()]));
	}
	iterator = ((Class364_Sub1) this).aHashMap10140.keySet().iterator();
	while (iterator.hasNext()) {
	    Class480 class480 = (Class480) iterator.next();
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub1) this).aHashMap10140.get(class480));
	    for (int i = 0; i < class468s.length; i++) {
		Class241 class241 = new Class241(2.0F);
		class241.method266(0, Class365.aClass365_3846,
				   Class362.aClass362_3833, 2);
		class468s[i] = new Class468(class480, 8192, 3, class241, this);
	    }
	}
	Class558 class558 = new Class558(this, 44100.0F, 32768);
	Class558 class558_25_ = new Class558(this, 22050.0F, 16384);
	((Class364_Sub1) this).aList10134.add(class558);
	((Class364_Sub1) this).aList10134.add(class558_25_);
	((Class364_Sub1) this).aThread10139
	    = new Thread(((Class364_Sub1) this).aRunnable10142);
	((Class364_Sub1) this).aThread10136
	    = new Thread(((Class364_Sub1) this).aRunnable10141);
	((Class364_Sub1) this).aThread10139.setPriority(10);
	((Class364_Sub1) this).aThread10136.setPriority(10);
	((Class364_Sub1) this).aThread10139.start();
	((Class364_Sub1) this).aThread10136.start();
    }
    
    Object method4603(Class351 class351) {
	return null;
    }
    
    public Object method4605(int i, int i_26_, Class365 class365,
			     Class362 class362, int i_27_, float f,
			     byte i_28_) {
	Class558 class558 = method9164(f * (float) i_26_, (byte) -60);
	Class531 class531
	    = new Class531(this, class558, i_27_, (float) i_26_ * f,
			   1968729145 * class365.anInt3842, i < 2 ? 2 : i,
			   (class365 == Class365.aClass365_3846
			    || class365 == Class365.aClass365_3844),
			   class362 == Class362.aClass362_3834);
	synchronized (((Class531) class531).aClass558_7121) {
	    ((Class531) class531).aClass558_7121.method6769(class531,
							    -2053754781);
	}
	return class531;
    }
    
    Object method4624(Class351 class351) {
	return null;
    }
    
    public Class355 method4625() {
	return ((Class364_Sub1) this).aClass355_10135;
    }
    
    public Class355 method4622() {
	return ((Class364_Sub1) this).aClass355_10135;
    }
    
    public Class355 method4627() {
	return ((Class364_Sub1) this).aClass355_10135;
    }
    
    public Class355 method4628() {
	return ((Class364_Sub1) this).aClass355_10135;
    }
    
    public void method4602() {
	HashMap hashmap = method9166((byte) 72);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class480 class480 = (Class480) iterator.next();
		Class468[] class468s = (Class468[]) hashmap.get(class480);
		for (int i = 0; i < class468s.length; i++) {
		    if (class468s[i].method5722(-1369325982)
			!= Class472.aClass472_5407) {
			class468s[i].method5696(-2090842063);
			class468s[i].method5656(121289738);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class480 class480 = (Class480) iterator.next();
		    Class468[] class468s = (Class468[]) hashmap.get(class480);
		    for (int i = 0; i < class468s.length; i++) {
			if (class468s[i].method5722(-1369325982)
			    != Class472.aClass472_5407) {
			    class468s[i].method5666(-534865215);
			    bool = false;
			}
		    }
		}
	    }
	    Class511_Sub1.method9241(10L);
	}
	((Class364_Sub1) this).aBool10137 = true;
	try {
	    ((Class364_Sub1) this).aThread10139.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class364_Sub1) this).aThread10136.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public Class468 method4621(Class480 class480) {
	synchronized (((Class364_Sub1) this).aHashMap10140) {
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub1) this).aHashMap10140.get(class480));
	    if (null == class468s) {
		Class468 class468 = null;
		return class468;
	    }
	    for (int i = 0; i < class468s.length; i++) {
		Class468 class468 = class468s[i];
		Class472 class472 = class468.method5722(-1369325982);
		if (class472 == Class472.aClass472_5407) {
		    class468.method5693((byte) 114);
		    Class468 class468_29_ = class468;
		    return class468_29_;
		}
	    }
	}
	return null;
    }
    
    HashMap method9167() {
	return ((Class364_Sub1) this).aHashMap10140;
    }
    
    static final void method9168(byte i) {
	for (Class528_Sub21_Sub10 class528_sub21_sub10
		 = ((Class528_Sub21_Sub10)
		    client.aClass688_11043.method8034(830956658));
	     null != class528_sub21_sub10;
	     class528_sub21_sub10
		 = ((Class528_Sub21_Sub10)
		    client.aClass688_11043.method8037(-1597857563))) {
	    Class645_Sub1_Sub5_Sub6 class645_sub1_sub5_sub6
		= (((Class528_Sub21_Sub10) class528_sub21_sub10)
		   .aClass645_Sub1_Sub5_Sub6_11583);
	    if (client.anInt11127
		> class645_sub1_sub5_sub6.anInt12008 * -108038505) {
		class528_sub21_sub10.method6443(-1607947977);
		class645_sub1_sub5_sub6.method10885(-977882301);
	    } else if (client.anInt11127
		       >= class645_sub1_sub5_sub6.anInt12011 * -39303101) {
		class645_sub1_sub5_sub6.method10880(-1301790773);
		if (class645_sub1_sub5_sub6.anInt12016 * 1063966653 > 0) {
		    if (0 == client.anInt10943 * 345087519) {
			Entity class645_sub1_sub5_sub1
			    = Class185.aClass182Array2106
				  [(class645_sub1_sub5_sub6.anInt12016
				    * 1063966653) - 1]
				  .method2689(-1012043543);
			if (null != class645_sub1_sub5_sub1) {
			    Class422 class422
				= (class645_sub1_sub5_sub1.method7693()
				   .aClass422_4868);
			    if ((int) class422.aFloat4780 >= 0
				&& ((int) class422.aFloat4780
				    < client.aClass495_10935
					  .method6029((short) 8618) * 512)
				&& (int) class422.aFloat4777 >= 0
				&& ((int) class422.aFloat4777
				    < client.aClass495_10935
					  .method5967(88367576) * 512))
				class645_sub1_sub5_sub6.method10883
				    ((int) class422.aFloat4780,
				     (int) class422.aFloat4777,
				     ((Class335_Sub1_Sub1.method10374
				       ((int) class422.aFloat4780,
					(int) class422.aFloat4777,
					class645_sub1_sub5_sub1.aByte10675,
					-759833206))
				      - 1004576393 * (class645_sub1_sub5_sub6
						      .anInt12026)),
				     client.anInt11127, -976331621);
			}
		    } else {
			Class528_Sub31 class528_sub31
			    = ((Class528_Sub31)
			       (client.aClass692_11110.method8137
				((long) ((1063966653
					  * class645_sub1_sub5_sub6.anInt12016)
					 - 1))));
			if (null != class528_sub31) {
			    NPC class645_sub1_sub5_sub1_sub1
				= ((NPC)
				   class528_sub31.anObject10468);
			    Class422 class422
				= (class645_sub1_sub5_sub1_sub1.method7693()
				   .aClass422_4868);
			    if ((int) class422.aFloat4780 >= 0
				&& ((int) class422.aFloat4780
				    < client.aClass495_10935
					  .method6029((short) 16954) * 512)
				&& (int) class422.aFloat4777 >= 0
				&& ((int) class422.aFloat4777
				    < client.aClass495_10935
					  .method5967(1645022406) * 512))
				class645_sub1_sub5_sub6.method10883
				    ((int) class422.aFloat4780,
				     (int) class422.aFloat4777,
				     ((Class335_Sub1_Sub1.method10374
				       ((int) class422.aFloat4780,
					(int) class422.aFloat4777,
					class645_sub1_sub5_sub6.aByte10675,
					-759833206))
				      - (class645_sub1_sub5_sub6.anInt12026
					 * 1004576393)),
				     client.anInt11127, -600795988);
			}
		    }
		}
		if (1063966653 * class645_sub1_sub5_sub6.anInt12016 < 0) {
		    int i_30_
			= (-(class645_sub1_sub5_sub6.anInt12016 * 1063966653)
			   - 1);
		    Player class645_sub1_sub5_sub1_sub2;
		    if (-1453744879 * client.anInt11025 == i_30_)
			class645_sub1_sub5_sub1_sub2
			    = Class108.myPlayer;
		    else
			class645_sub1_sub5_sub1_sub2
			    = (client.localPlayers
			       [i_30_]);
		    if (class645_sub1_sub5_sub1_sub2 != null) {
			Class422 class422
			    = (class645_sub1_sub5_sub1_sub2.method7693()
			       .aClass422_4868);
			if ((int) class422.aFloat4780 >= 0
			    && ((int) class422.aFloat4780
				< client.aClass495_10935
				      .method6029((short) 28345) * 512)
			    && (int) class422.aFloat4777 >= 0
			    && ((int) class422.aFloat4777
				< client.aClass495_10935
				      .method5967(2030033831) * 512))
			    class645_sub1_sub5_sub6.method10883
				((int) class422.aFloat4780,
				 (int) class422.aFloat4777,
				 ((Class335_Sub1_Sub1.method10374
				   ((int) class422.aFloat4780,
				    (int) class422.aFloat4777,
				    class645_sub1_sub5_sub6.aByte10675,
				    -759833206))
				  - (class645_sub1_sub5_sub6.anInt12026
				     * 1004576393)),
				 client.anInt11127, 1450712817);
		    }
		}
		class645_sub1_sub5_sub6
		    .method10881(-178309515 * client.anInt10971, -1451336175);
		client.aClass495_10935.method5973((byte) 57)
		    .method6545(class645_sub1_sub5_sub6, true, 1567478138);
	    }
	}
    }
    
    static final void method9169(int i) {
	BitBuffer class528_sub42_sub2
	    = ((Class109) client.aClass109_10930).aClass528_Sub42_Sub2_1378;
	class528_sub42_sub2.setBitAccess(456456071);
	int i_31_ = class528_sub42_sub2.readBits(8, (byte) -43);
	if (i_31_ < -2065344127 * client.anInt10922) {
	    for (int i_32_ = i_31_; i_32_ < client.anInt10922 * -2065344127;
		 i_32_++)
		client.anIntArray10928
		    [(client.anInt10927 += 1202438591) * -1261097409 - 1]
		    = client.anIntArray10923[i_32_];
	}
	if (i_31_ > client.anInt10922 * -2065344127)
	    throw new RuntimeException();
	client.anInt10922 = 0;
	for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
	    int i_34_ = client.anIntArray10923[i_33_];
	    NPC class645_sub1_sub5_sub1_sub1
		= ((NPC)
		   (((Class528_Sub31)
		     client.aClass692_11110.method8137((long) i_34_))
		    .anObject10468));
	    int i_35_ = class528_sub42_sub2.readBits(1, (byte) -59);
	    if (0 == i_35_) {
		client.anIntArray10923
		    [(client.anInt10922 += -1811618175) * -2065344127 - 1]
		    = i_34_;
		class645_sub1_sub5_sub1_sub1.anInt11758
		    = -653015535 * client.anInt11032;
	    } else {
		int i_36_ = class528_sub42_sub2.readBits(2, (byte) -44);
		if (i_36_ == 0) {
		    client.anIntArray10923
			[(client.anInt10922 += -1811618175) * -2065344127 - 1]
			= i_34_;
		    class645_sub1_sub5_sub1_sub1.anInt11758
			= -653015535 * client.anInt11032;
		    client.anIntArray10925
			[(client.anInt10924 += 1904393989) * -141740595 - 1]
			= i_34_;
		} else if (i_36_ == 1) {
		    client.anIntArray10923
			[(client.anInt10922 += -1811618175) * -2065344127 - 1]
			= i_34_;
		    class645_sub1_sub5_sub1_sub1.anInt11758
			= -653015535 * client.anInt11032;
		    Class657 class657
			= ((Class657)
			   (Class443.method5321
			    (Class575.method6890((byte) 119),
			     class528_sub42_sub2.readBits(3, (byte) -125),
			     646437025)));
		    class645_sub1_sub5_sub1_sub1.method10901(class657,
							     (Class666
							      .aClass666_8476
							      .aByte8478),
							     (byte) 0);
		    int i_37_ = class528_sub42_sub2.readBits(1, (byte) -1);
		    if (i_37_ == 1)
			client.anIntArray10925[((client.anInt10924
						 += 1904393989) * -141740595
						- 1)]
			    = i_34_;
		} else if (i_36_ == 2) {
		    client.anIntArray10923
			[(client.anInt10922 += -1811618175) * -2065344127 - 1]
			= i_34_;
		    class645_sub1_sub5_sub1_sub1.anInt11758
			= -653015535 * client.anInt11032;
		    if (class528_sub42_sub2.readBits(1, (byte) -4) == 1) {
			Class657 class657
			    = ((Class657)
			       (Class443.method5321
				(Class575.method6890((byte) 122),
				 class528_sub42_sub2.readBits(3,
								 (byte) -62),
				 698257473)));
			class645_sub1_sub5_sub1_sub1.method10901
			    (class657, Class666.aClass666_8479.aByte8478,
			     (byte) 0);
			Class657 class657_38_
			    = ((Class657)
			       (Class443.method5321
				(Class575.method6890((byte) 111),
				 class528_sub42_sub2.readBits(3,
								 (byte) -109),
				 1473950752)));
			class645_sub1_sub5_sub1_sub1.method10901
			    (class657_38_, Class666.aClass666_8479.aByte8478,
			     (byte) 0);
		    } else {
			Class657 class657
			    = ((Class657)
			       (Class443.method5321
				(Class575.method6890((byte) 47),
				 class528_sub42_sub2.readBits(3,
								 (byte) -26),
				 1298247860)));
			class645_sub1_sub5_sub1_sub1.method10901
			    (class657, Class666.aClass666_8477.aByte8478,
			     (byte) 0);
		    }
		    int i_39_ = class528_sub42_sub2.readBits(1, (byte) -74);
		    if (1 == i_39_)
			client.anIntArray10925[((client.anInt10924
						 += 1904393989) * -141740595
						- 1)]
			    = i_34_;
		} else if (3 == i_36_)
		    client.anIntArray10928
			[(client.anInt10927 += 1202438591) * -1261097409 - 1]
			= i_34_;
	    }
	}
    }
    
    static final void method9170(Class648 class648, int i) {
	int i_40_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if ((Class495.aClass283_Sub1_5578.method3787((byte) -81)
	     != Class297.aClass297_3251)
	    || (Class495.aClass283_Sub1_5578.method3786((byte) -94)
		!= Class294.aClass294_3225))
	    throw new RuntimeException();
	Class326_Sub1 class326_sub1
	    = ((Class326_Sub1)
	       Class495.aClass283_Sub1_5578.method3811(729549527));
	Class684_Sub1 class684_sub1
	    = ((Class684_Sub1)
	       Class495.aClass283_Sub1_5578.method3785((byte) 122));
	Class422 class422 = class326_sub1.method9088((byte) 3);
	Class422 class422_41_ = Class422.method5052(class422);
	class422_41_.aFloat4776 += (float) i_40_;
	Class422 class422_42_
	    = Class422.method5065(class684_sub1.method7987(-1914997382),
				  class422_41_);
	class422_42_.method5062();
	float f = class326_sub1.method9089((byte) 0).method5069();
	Class429.method5161(class684_sub1.method7987(-1914997382),
			    class422_42_, class422, f,
			    Class634.aClass422Array8210);
	Object object = null;
	if (null == Class634.aClass422Array8210[0])
	    throw new RuntimeException("");
	Class422 class422_43_;
	if (Class634.aClass422Array8210[1] == null)
	    class422_43_ = Class634.aClass422Array8210[0];
	else if (Class422.method5065
		     (class684_sub1.method7987(-1914997382),
		      Class634.aClass422Array8210[0])
		     .method5069()
		 < Class422.method5065
		       (class684_sub1.method7987(-1914997382),
			Class634.aClass422Array8210[1])
		       .method5069())
	    class422_43_ = Class634.aClass422Array8210[1];
	else
	    class422_43_ = Class634.aClass422Array8210[0];
	float f_44_ = Class535.method6496((class422.aFloat4780
					   - class422_43_.aFloat4780),
					  (class422.aFloat4777
					   - class422_43_.aFloat4777),
					  -1623553020);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 0;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) (2607.5945876176133 * (double) f_44_) & 0x3fff;
    }
    
    static String method9171(int i, int i_45_, int i_46_) {
	int i_47_ = i_45_ - i;
	if (i_47_ < -9)
	    return Class666.method7905(16711680, (short) 9745);
	if (i_47_ < -6)
	    return Class666.method7905(16723968, (short) -2983);
	if (i_47_ < -3)
	    return Class666.method7905(16740352, (short) -12902);
	if (i_47_ < 0)
	    return Class666.method7905(16756736, (short) 18963);
	if (i_47_ > 9)
	    return Class666.method7905(65280, (short) 29991);
	if (i_47_ > 6)
	    return Class666.method7905(4259584, (short) 3701);
	if (i_47_ > 3)
	    return Class666.method7905(8453888, (short) -2426);
	if (i_47_ > 0)
	    return Class666.method7905(12648192, (short) -14548);
	return Class666.method7905(16776960, (short) 9399);
    }
}
