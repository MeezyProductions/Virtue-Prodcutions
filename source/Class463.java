/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class Class463
{
    Class441 aClass441_5294;
    Map aMap5295;
    AbstractQueue_Sub1 anAbstractQueue_Sub1_5296;
    int anInt5297;
    long aLong5298;
    Comparator aComparator5299 = new Class465(this);
    AbstractQueue_Sub1 anAbstractQueue_Sub1_5300;
    static int[] anIntArray5301;
    
    void method5591(int i) {
	if (-1L == -6849634421792430027L * ((Class463) this).aLong5298)
	    throw new IllegalStateException("");
	long l = (System.currentTimeMillis()
		  - ((Class463) this).aLong5298 * -6849634421792430027L);
	while (!((Class463) this).anAbstractQueue_Sub1_5296.isEmpty()) {
	    Class443 class443
		= ((Class443)
		   ((Class463) this).anAbstractQueue_Sub1_5296.peek());
	    if (1764050934023832073L * ((Class443) class443).aLong4912 < l) {
		((Class463) this).aMap5295
		    .remove(((Class443) class443).anObject4911);
		((Class463) this).anAbstractQueue_Sub1_5296.remove(class443);
		if (method5595(1150308924))
		    ((Class463) this).anAbstractQueue_Sub1_5300
			.remove(class443);
	    } else
		break;
	}
    }
    
    Class463(long l, int i, Class441 class441) {
	((Class463) this).aLong5298 = -5937080252508804579L * l;
	((Class463) this).anInt5297 = i * -2093270109;
	((Class463) this).aClass441_5294 = class441;
	if (-1 == -1811886069 * ((Class463) this).anInt5297) {
	    ((Class463) this).aMap5295 = new HashMap(64);
	    ((Class463) this).anAbstractQueue_Sub1_5296
		= new AbstractQueue_Sub1(64,
					 ((Class463) this).aComparator5299);
	    ((Class463) this).anAbstractQueue_Sub1_5300 = null;
	} else {
	    if (null == ((Class463) this).aClass441_5294)
		throw new IllegalArgumentException("");
	    ((Class463) this).aMap5295
		= new HashMap(((Class463) this).anInt5297 * -1811886069);
	    ((Class463) this).anAbstractQueue_Sub1_5296
		= new AbstractQueue_Sub1((((Class463) this).anInt5297
					  * -1811886069),
					 ((Class463) this).aComparator5299);
	    ((Class463) this).anAbstractQueue_Sub1_5300
		= new AbstractQueue_Sub1(((Class463) this).anInt5297
					 * -1811886069);
	}
    }
    
    public Class463(int i, Class441 class441) {
	this(-1L, i, class441);
    }
    
    public Object method5592(Object object, int i) {
	synchronized (this) {
	    if (-6849634421792430027L * ((Class463) this).aLong5298 != -1L)
		method5591(1196431429);
	    Class443 class443
		= (Class443) ((Class463) this).aMap5295.get(object);
	    if (class443 == null) {
		Object object_0_ = null;
		return object_0_;
	    }
	    method5594(class443, false, 1738589);
	    Object object_1_ = ((Class443) class443).anObject4913;
	    return object_1_;
	}
    }
    
    public Object method5593(Object object, Object object_2_, byte i) {
	synchronized (this) {
	    if (-1L != ((Class463) this).aLong5298 * -6849634421792430027L)
		method5591(1807237159);
	    Class443 class443
		= (Class443) ((Class463) this).aMap5295.get(object);
	    if (class443 != null) {
		Object object_3_ = ((Class443) class443).anObject4913;
		((Class443) class443).anObject4913 = object_2_;
		method5594(class443, false, 131932487);
		Object object_4_ = object_3_;
		return object_4_;
	    }
	    if (method5595(829792566)
		&& (((Class463) this).aMap5295.size()
		    == ((Class463) this).anInt5297 * -1811886069)) {
		Class443 class443_5_
		    = ((Class443)
		       ((Class463) this).anAbstractQueue_Sub1_5300.remove());
		((Class463) this).aMap5295
		    .remove(((Class443) class443_5_).anObject4911);
		((Class463) this).anAbstractQueue_Sub1_5296
		    .remove(class443_5_);
	    }
	    Class443 class443_6_ = new Class443(object_2_, object);
	    ((Class463) this).aMap5295.put(object, class443_6_);
	    method5594(class443_6_, true, 514818281);
	    Object object_7_ = null;
	    return object_7_;
	}
    }
    
    void method5594(Class443 class443, boolean bool, int i) {
	if (!bool) {
	    ((Class463) this).anAbstractQueue_Sub1_5296.remove(class443);
	    if (method5595(-595627293)
		&& !((Class463) this).anAbstractQueue_Sub1_5300
			.remove(class443))
		throw new IllegalStateException("");
	}
	((Class443) class443).aLong4912
	    = System.currentTimeMillis() * 6449902532473023545L;
	if (method5595(1899759556)) {
	    switch (((Class441) ((Class463) this).aClass441_5294).anInt4901
		    * -489636939) {
	    case 0:
		((Class443) class443).aLong4910 += 2491811331258326751L;
		break;
	    case 1:
		((Class443) class443).aLong4910
		    = 5282582780039467991L * ((Class443) class443).aLong4912;
		break;
	    }
	    ((Class463) this).anAbstractQueue_Sub1_5300.add(class443);
	}
	((Class463) this).anAbstractQueue_Sub1_5296.add(class443);
    }
    
    boolean method5595(int i) {
	return -1 != -1811886069 * ((Class463) this).anInt5297;
    }
    
    boolean method5596() {
	return -1 != -1811886069 * ((Class463) this).anInt5297;
    }
    
    void method5597() {
	if (-1L == -6849634421792430027L * ((Class463) this).aLong5298)
	    throw new IllegalStateException("");
	long l = (System.currentTimeMillis()
		  - ((Class463) this).aLong5298 * -6849634421792430027L);
	while (!((Class463) this).anAbstractQueue_Sub1_5296.isEmpty()) {
	    Class443 class443
		= ((Class443)
		   ((Class463) this).anAbstractQueue_Sub1_5296.peek());
	    if (1764050934023832073L * ((Class443) class443).aLong4912 < l) {
		((Class463) this).aMap5295
		    .remove(((Class443) class443).anObject4911);
		((Class463) this).anAbstractQueue_Sub1_5296.remove(class443);
		if (method5595(1882822667))
		    ((Class463) this).anAbstractQueue_Sub1_5300
			.remove(class443);
	    } else
		break;
	}
    }
    
    static final void method5598(Class229 class229, Class226 class226,
				 Class648 class648, short i) {
	class229.anInt2418 = -849511901;
	class229.anInt2419
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * -1761002431);
	Class39.method811(class229, 1435904523);
	if (class229.anInt2377 * 1835803215 == -1 && !class226.aBool2335)
	    Class26_Sub1.method9542(class229.anInt2376 * 306930455,
				    (short) 23542);
    }
    
    static final void method5599(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class105.method1355(class229, class226, class648, 1665530093);
    }
    
    static final void method5600(Class648 class648, int i) {
	int i_8_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (2 == client.anInt11158 * 1234694097
	    && i_8_ < client.anInt11157 * -1314218023)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1761252257 * client.aClass62Array11160[i_8_].anInt714;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    public static int method5601(byte i) {
	Class58_Sub1 class58_sub1 = Class420.method5036((byte) -33);
	Class444.method5325(class58_sub1, -1628727995);
	return class58_sub1.method995(1912581477);
    }
    
    public static final int method5602(int i, int i_9_, int i_10_, int i_11_,
				       int i_12_, int i_13_) {
	if (client.gameScene.method5973((byte) 13) == null)
	    return 0;
	if (i_12_ < 3) {
	    Class466 class466 = client.gameScene.method6006((byte) 0);
	    int i_14_ = i >> 9;
	    int i_15_ = i_9_ >> 9;
	    if (i_10_ < 0 || i_11_ < 0
		|| i_10_ > client.gameScene.method6029((short) 17218) - 1
		|| i_11_ > client.gameScene.method5967(651960518) - 1)
		return 0;
	    if (i_14_ < 1 || i_15_ < 1
		|| i_14_ > client.gameScene.method6029((short) 11499) - 1
		|| i_15_ > client.gameScene.method5967(-39329055) - 1)
		return 0;
	    boolean bool
		= 0 != (class466.aByteArrayArrayArray5312[1][i >> 9][i_9_ >> 9]
			& 0x2);
	    if ((i & 0x1ff) == 0) {
		boolean bool_16_ = (((class466.aByteArrayArrayArray5312[1]
				      [i_14_ - 1][i_9_ >> 9])
				     & 0x2)
				    != 0);
		boolean bool_17_ = 0 != ((class466.aByteArrayArrayArray5312[1]
					  [i_14_][i_9_ >> 9])
					 & 0x2);
		if (bool_17_ != bool_16_)
		    bool = 0 != ((class466.aByteArrayArrayArray5312[1][i_10_]
				  [i_11_])
				 & 0x2);
	    }
	    if ((i_9_ & 0x1ff) == 0) {
		boolean bool_18_
		    = ((class466.aByteArrayArrayArray5312[1][i >> 9][i_15_ - 1]
			& 0x2)
		       != 0);
		boolean bool_19_
		    = ((class466.aByteArrayArrayArray5312[1][i >> 9][i_15_]
			& 0x2)
		       != 0);
		if (bool_18_ != bool_19_)
		    bool = (class466.aByteArrayArrayArray5312[1][i_10_][i_11_]
			    & 0x2) != 0;
	    }
	    if (bool)
		i_12_++;
	}
	return client.gameScene.method5973((byte) 26)
		   .aClass137Array7161[i_12_].method1656(i, i_9_, 1460947409);
    }
}
