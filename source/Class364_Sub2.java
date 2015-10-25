/* Class364_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class364_Sub2 extends Class364
{
    Thread aThread10190;
    HashMap aHashMap10191;
    Class355 aClass355_10192;
    volatile boolean aBool10193 = false;
    Thread aThread10194;
    static final float aFloat10195 = 2.0F;
    long aLong10196 = Class249.method3417(1998608269) * -4095630446161518985L;
    Runnable aRunnable10197 = new Class134(this);
    Runnable aRunnable10198 = new Class138(this);
    
    Object method4623(Class351 class351) {
	return null;
    }
    
    public int method4613(Object object, int i) {
	long l = Class249.method3417(1926956756);
	int i_0_ = (int) (180000.0F
			  / ((float) (l - (((Class364_Sub2) this).aLong10196
					   * 5746386822442425159L))
			     / 1000.0F));
	((Class364_Sub2) this).aLong10196 = -4095630446161518985L * l;
	return i_0_;
    }
    
    public void method4606(int i) {
	if (null != ((Class364_Sub2) this).aClass355_10192)
	    ((Class364_Sub2) this).aClass355_10192.method4580((byte) -48);
	Iterator iterator
	    = ((Class364_Sub2) this).aHashMap10191.keySet().iterator();
	while (iterator.hasNext()) {
	    Class480 class480 = (Class480) iterator.next();
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub2) this).aHashMap10191.get(class480));
	    if (!class480.aBool5452) {
		boolean bool = false;
		for (int i_1_ = 0; i_1_ < class468s.length; i_1_++) {
		    class468s[i_1_].method5666(757089209);
		    bool |= class468s[i_1_].method5665((byte) 1);
		}
		if (bool)
		    Arrays.sort(class468s, new Class154(this));
	    }
	    int i_2_ = 3;
	    boolean bool = false;
	    int i_3_ = class468s.length - 1;
	    while (!bool) {
		float f = class468s[i_3_].method5651((byte) -65);
		Class472 class472 = class468s[i_3_].method5722(-1369325982);
		if (f < 0.0F) {
		    if (class472 == Class472.aClass472_5411
			|| class472 == Class472.aClass472_5409
			|| Class472.aClass472_5408 == class472)
			class468s[i_3_].method5696(-2135561324);
		} else
		    bool = true;
		if (--i_3_ < 0)
		    bool = true;
	    }
	    if (i_3_ >= class468s.length - i_2_) {
		for (/**/; i_3_ >= class468s.length - i_2_; i_3_--) {
		    Class472 class472
			= class468s[i_3_].method5722(-1369325982);
		    if (Class472.aClass472_5411 == class472)
			class468s[i_3_].method5696(-2103695272);
		}
	    }
	}
    }
    
    Object method4608(Class351 class351, int i) {
	return null;
    }
    
    public Object method4605(int i, int i_4_, Class365 class365,
			     Class362 class362, int i_5_, float f, byte i_6_) {
	return new Object();
    }
    
    public void method4604(Object object, int i) {
	/* empty */
    }
    
    public void method4616(Object object) {
	/* empty */
    }
    
    public Class364_Sub2(Class642 class642) {
	((Class364_Sub2) this).aClass355_10192 = new Class355(this);
	((Class364_Sub2) this).aHashMap10191 = new HashMap();
	Iterator iterator = class642.aHashMap8274.keySet().iterator();
	while (iterator.hasNext()) {
	    Class480 class480 = (Class480) iterator.next();
	    ((Class364_Sub2) this).aHashMap10191.put(class480,
						     (new Class468
						      [((Integer)
							class642
							    .aHashMap8274
							    .get(class480))
							   .intValue()]));
	}
	iterator = ((Class364_Sub2) this).aHashMap10191.keySet().iterator();
	while (iterator.hasNext()) {
	    Class480 class480 = (Class480) iterator.next();
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub2) this).aHashMap10191.get(class480));
	    for (int i = 0; i < class468s.length; i++) {
		Class241 class241 = new Class241(2.0F);
		class241.method266(0, Class365.aClass365_3846,
				   Class362.aClass362_3833, 2);
		class468s[i]
		    = new Class468(class480, 32768, 3, class241, this);
	    }
	}
	((Class364_Sub2) this).aThread10194
	    = new Thread(((Class364_Sub2) this).aRunnable10198);
	((Class364_Sub2) this).aThread10190
	    = new Thread(((Class364_Sub2) this).aRunnable10197);
	((Class364_Sub2) this).aThread10194.setPriority(1);
	((Class364_Sub2) this).aThread10190.setPriority(1);
	((Class364_Sub2) this).aThread10194.start();
	((Class364_Sub2) this).aThread10190.start();
    }
    
    public Class468 method4629(Class480 class480) {
	synchronized (((Class364_Sub2) this).aHashMap10191) {
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub2) this).aHashMap10191.get(class480));
	    if (class468s == null) {
		Class468 class468 = null;
		return class468;
	    }
	    for (int i = 0; i < class468s.length; i++) {
		Class468 class468 = class468s[i];
		Class472 class472 = class468.method5722(-1369325982);
		if (class472 == Class472.aClass472_5407) {
		    class468.method5693((byte) 126);
		    Class468 class468_7_ = class468;
		    return class468_7_;
		}
	    }
	}
	return null;
    }
    
    public Class355 method4609(byte i) {
	return ((Class364_Sub2) this).aClass355_10192;
    }
    
    public void method4610(int i) {
	HashMap hashmap = method9231((byte) -122);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class480 class480 = (Class480) iterator.next();
		Class468[] class468s = (Class468[]) hashmap.get(class480);
		for (int i_8_ = 0; i_8_ < class468s.length; i_8_++) {
		    if (class468s[i_8_].method5722(-1369325982)
			!= Class472.aClass472_5407) {
			class468s[i_8_].method5696(-2103907075);
			class468s[i_8_].method5656(118384980);
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
		    for (int i_9_ = 0; i_9_ < class468s.length; i_9_++) {
			if (class468s[i_9_].method5722(-1369325982)
			    != Class472.aClass472_5407) {
			    class468s[i_9_].method5666(-962533849);
			    bool = false;
			}
		    }
		}
	    }
	    Class511_Sub1.method9241(10L);
	}
	((Class364_Sub2) this).aBool10193 = true;
	try {
	    ((Class364_Sub2) this).aThread10194.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class364_Sub2) this).aThread10190.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public Object method4614(int i, int i_10_, Class365 class365,
			     Class362 class362, int i_11_, float f) {
	return new Object();
    }
    
    HashMap method9230() {
	return ((Class364_Sub2) this).aHashMap10191;
    }
    
    public void method4611() {
	if (null != ((Class364_Sub2) this).aClass355_10192)
	    ((Class364_Sub2) this).aClass355_10192.method4580((byte) -43);
	Iterator iterator
	    = ((Class364_Sub2) this).aHashMap10191.keySet().iterator();
	while (iterator.hasNext()) {
	    Class480 class480 = (Class480) iterator.next();
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub2) this).aHashMap10191.get(class480));
	    if (!class480.aBool5452) {
		boolean bool = false;
		for (int i = 0; i < class468s.length; i++) {
		    class468s[i].method5666(-81141303);
		    bool |= class468s[i].method5665((byte) 1);
		}
		if (bool)
		    Arrays.sort(class468s, new Class154(this));
	    }
	    int i = 3;
	    boolean bool = false;
	    int i_12_ = class468s.length - 1;
	    while (!bool) {
		float f = class468s[i_12_].method5651((byte) -94);
		Class472 class472 = class468s[i_12_].method5722(-1369325982);
		if (f < 0.0F) {
		    if (class472 == Class472.aClass472_5411
			|| class472 == Class472.aClass472_5409
			|| Class472.aClass472_5408 == class472)
			class468s[i_12_].method5696(-2099345864);
		} else
		    bool = true;
		if (--i_12_ < 0)
		    bool = true;
	    }
	    if (i_12_ >= class468s.length - i) {
		for (/**/; i_12_ >= class468s.length - i; i_12_--) {
		    Class472 class472
			= class468s[i_12_].method5722(-1369325982);
		    if (Class472.aClass472_5411 == class472)
			class468s[i_12_].method5696(-2104043897);
		}
	    }
	}
    }
    
    public Class468 method4607(Class480 class480, byte i) {
	synchronized (((Class364_Sub2) this).aHashMap10191) {
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub2) this).aHashMap10191.get(class480));
	    if (class468s == null) {
		Class468 class468 = null;
		return class468;
	    }
	    for (int i_13_ = 0; i_13_ < class468s.length; i_13_++) {
		Class468 class468 = class468s[i_13_];
		Class472 class472 = class468.method5722(-1369325982);
		if (class472 == Class472.aClass472_5407) {
		    class468.method5693((byte) 58);
		    Class468 class468_14_ = class468;
		    return class468_14_;
		}
	    }
	}
	return null;
    }
    
    public Class355 method4627() {
	return ((Class364_Sub2) this).aClass355_10192;
    }
    
    Object method4603(Class351 class351) {
	return null;
    }
    
    public Object method4620(int i, int i_15_, Class365 class365,
			     Class362 class362, int i_16_, float f) {
	return new Object();
    }
    
    public int method4615(Object object) {
	long l = Class249.method3417(2065404020);
	int i = (int) (180000.0F
		       / ((float) (l - (((Class364_Sub2) this).aLong10196
					* 5746386822442425159L))
			  / 1000.0F));
	((Class364_Sub2) this).aLong10196 = -4095630446161518985L * l;
	return i;
    }
    
    HashMap method9231(byte i) {
	return ((Class364_Sub2) this).aHashMap10191;
    }
    
    public void method4618(Object object, byte[] is, int i, int i_17_) {
	/* empty */
    }
    
    public void method4612() {
	if (null != ((Class364_Sub2) this).aClass355_10192)
	    ((Class364_Sub2) this).aClass355_10192.method4580((byte) 70);
	Iterator iterator
	    = ((Class364_Sub2) this).aHashMap10191.keySet().iterator();
	while (iterator.hasNext()) {
	    Class480 class480 = (Class480) iterator.next();
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub2) this).aHashMap10191.get(class480));
	    if (!class480.aBool5452) {
		boolean bool = false;
		for (int i = 0; i < class468s.length; i++) {
		    class468s[i].method5666(-219707966);
		    bool |= class468s[i].method5665((byte) 1);
		}
		if (bool)
		    Arrays.sort(class468s, new Class154(this));
	    }
	    int i = 3;
	    boolean bool = false;
	    int i_18_ = class468s.length - 1;
	    while (!bool) {
		float f = class468s[i_18_].method5651((byte) -48);
		Class472 class472 = class468s[i_18_].method5722(-1369325982);
		if (f < 0.0F) {
		    if (class472 == Class472.aClass472_5411
			|| class472 == Class472.aClass472_5409
			|| Class472.aClass472_5408 == class472)
			class468s[i_18_].method5696(-2129995625);
		} else
		    bool = true;
		if (--i_18_ < 0)
		    bool = true;
	    }
	    if (i_18_ >= class468s.length - i) {
		for (/**/; i_18_ >= class468s.length - i; i_18_--) {
		    Class472 class472
			= class468s[i_18_].method5722(-1369325982);
		    if (Class472.aClass472_5411 == class472)
			class468s[i_18_].method5696(-2112130519);
		}
	    }
	}
    }
    
    public Class468 method4619(Class480 class480) {
	synchronized (((Class364_Sub2) this).aHashMap10191) {
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub2) this).aHashMap10191.get(class480));
	    if (class468s == null) {
		Class468 class468 = null;
		return class468;
	    }
	    for (int i = 0; i < class468s.length; i++) {
		Class468 class468 = class468s[i];
		Class472 class472 = class468.method5722(-1369325982);
		if (class472 == Class472.aClass472_5407) {
		    class468.method5693((byte) 90);
		    Class468 class468_19_ = class468;
		    return class468_19_;
		}
	    }
	}
	return null;
    }
    
    public Class468 method4621(Class480 class480) {
	synchronized (((Class364_Sub2) this).aHashMap10191) {
	    Class468[] class468s
		= ((Class468[])
		   ((Class364_Sub2) this).aHashMap10191.get(class480));
	    if (class468s == null) {
		Class468 class468 = null;
		return class468;
	    }
	    for (int i = 0; i < class468s.length; i++) {
		Class468 class468 = class468s[i];
		Class472 class472 = class468.method5722(-1369325982);
		if (class472 == Class472.aClass472_5407) {
		    class468.method5693((byte) 58);
		    Class468 class468_20_ = class468;
		    return class468_20_;
		}
	    }
	}
	return null;
    }
    
    public Class355 method4622() {
	return ((Class364_Sub2) this).aClass355_10192;
    }
    
    HashMap method9232() {
	return ((Class364_Sub2) this).aHashMap10191;
    }
    
    Object method4624(Class351 class351) {
	return null;
    }
    
    public Class355 method4625() {
	return ((Class364_Sub2) this).aClass355_10192;
    }
    
    public void method4626(Object object, byte[] is, int i, int i_21_,
			   byte i_22_) {
	/* empty */
    }
    
    public void method4617(Object object, byte[] is, int i, int i_23_) {
	/* empty */
    }
    
    public Class355 method4628() {
	return ((Class364_Sub2) this).aClass355_10192;
    }
    
    public void method4602() {
	HashMap hashmap = method9231((byte) -64);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class480 class480 = (Class480) iterator.next();
		Class468[] class468s = (Class468[]) hashmap.get(class480);
		for (int i = 0; i < class468s.length; i++) {
		    if (class468s[i].method5722(-1369325982)
			!= Class472.aClass472_5407) {
			class468s[i].method5696(-2095105566);
			class468s[i].method5656(-1051821144);
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
			    class468s[i].method5666(586648969);
			    bool = false;
			}
		    }
		}
	    }
	    Class511_Sub1.method9241(10L);
	}
	((Class364_Sub2) this).aBool10193 = true;
	try {
	    ((Class364_Sub2) this).aThread10194.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    ((Class364_Sub2) this).aThread10190.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    static String method9233(String string, boolean bool, int i) {
	String string_24_ = bool ? "https://" : "http://";
	if (ModeWhere.aClass665_8462 == Class646.aClass665_8386)
	    string = new StringBuilder().append(string).append("-wtrc")
			 .toString();
	else if (Class646.aClass665_8386 == ModeWhere.aClass665_8468)
	    string = new StringBuilder().append(string).append("-wtqa")
			 .toString();
	else if (Class646.aClass665_8386 == ModeWhere.aClass665_8464)
	    string = new StringBuilder().append(string).append("-wtwip")
			 .toString();
	else if (Class646.aClass665_8386 == ModeWhere.aClass665_8469)
	    string
		= new StringBuilder().append(string).append("-wti").toString();
	else if (Class646.aClass665_8386 == ModeWhere.aClass665_8470)
	    string = new StringBuilder().append(string).append("-demo")
			 .toString();
	else if (ModeWhere.aClass665_8465 == Class646.aClass665_8386)
	    string = "local";
	String string_25_ = "";
	if (client.aString10962 != null)
	    string_25_ = new StringBuilder().append("/p=").append
			     (client.aString10962).toString();
	String string_26_ = new StringBuilder().append
				(client.aClass673_11108.aString8534).append
				(".com").toString();
	return new StringBuilder().append(string_24_).append(string).append
		   (".").append
		   (string_26_).append
		   ("/l=").append
		   (Class378_Sub2.aClass668_10123.anInt8500 * 1736046843)
		   .append
		   ("/a=").append
		   (client.anInt10856 * -1608791841).append
		   (string_25_).append
		   ("/").toString();
    }
    
    static final void method9234(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	Class666 class666
	    = ((Class666)
	       Class443.method5321(Class666.method7904(-1004289681),
				   (((Class648) class648).anIntArray8394
				    [(717927929
				      * ((Class648) class648).anInt8395)]),
				   1734394062));
	Class578 class578
	    = new Class578(((Class648) class648).anIntArray8394
			   [717927929 * ((Class648) class648).anInt8395 + 1]);
	if (-1 == -2013577247 * class578.anInt7606)
	    throw new RuntimeException("");
	if (Class666.aClass666_8477 != class666
	    && class666 != Class666.aClass666_8476
	    && class666 != Class666.aClass666_8479)
	    throw new RuntimeException("");
	if (client.aClass109_10930 != null) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4567,
				      client.aClass109_10930.aClass10_1379,
				      -2111487215);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9652(class666.method68(), (byte) -63);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9717(class578.anInt7607 * 961465569, (byte) 62);
	    class528_sub34.aClass528_Sub42_Sub2_10481
		.method9661(class578.anInt7608 * -173815201, -1623467461);
	    client.aClass109_10930.method1380(class528_sub34, 246231913);
	}
    }
    
    static final void method9235(Class648 class648, int i) {
	int i_27_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub25_10592
		  .method8126(i_27_, -1955030095);
    }
    
    public static void method9236(String string, byte i) {
	if (null == Class99.aStringArray1259)
	    Class635.method7562(2019515460);
	client.aCalendar11169
	    .setTime(new Date(Class249.method3417(2104563971)));
	int i_28_ = client.aCalendar11169.get(11);
	int i_29_ = client.aCalendar11169.get(12);
	int i_30_ = client.aCalendar11169.get(13);
	String string_31_
	    = new StringBuilder().append(Integer.toString(i_28_ / 10)).append
		  (i_28_ % 10).append
		  (":").append
		  (i_29_ / 10).append
		  (i_29_ % 10).append
		  (":").append
		  (i_30_ / 10).append
		  (i_30_ % 10).toString();
	String[] strings = Class520.method6348(string, '\n', (byte) 2);
	for (int i_32_ = 0; i_32_ < strings.length; i_32_++) {
	    for (int i_33_ = -1589365317 * Class99.anInt1268; i_33_ > 0;
		 i_33_--)
		Class99.aStringArray1259[i_33_]
		    = Class99.aStringArray1259[i_33_ - 1];
	    Class99.aStringArray1259[0]
		= new StringBuilder().append(string_31_).append(": ").append
		      (strings[i_32_]).toString();
	    if (Class315.aFileOutputStream3446 != null) {
		try {
		    Class315.aFileOutputStream3446.write
			(Class183.method2706(new StringBuilder().append
						 (Class99.aStringArray1259[0])
						 .append
						 ("\n").toString(),
					     1168034245));
		} catch (IOException ioexception) {
		    /* empty */
		}
	    }
	    if (-1589365317 * Class99.anInt1268
		< Class99.aStringArray1259.length - 1) {
		Class99.anInt1268 += -527480973;
		if (1727710133 * Class99.anInt1261 > 0)
		    Class99.anInt1261 += -819047779;
	    }
	}
    }
}
