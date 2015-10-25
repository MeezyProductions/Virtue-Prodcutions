/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class15 implements Interface2
{
    Map aMap189;
    Interface52 anInterface52_190;
    
    public void method25(int i, long l) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, Long.valueOf(l)));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 == null)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, Long.valueOf(l)));
	    else
		class411.anObject4712 = Long.valueOf(l);
	}
    }
    
    public int method10(int i, short i_0_) {
	if (null != ((Class15) this).aMap189) {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null != class411)
		return ((Integer) class411.anObject4712).intValue();
	}
	return ((Integer)
		((Class15) this).anInterface52_190.method344(i, -2056863916))
		   .intValue();
    }
    
    public void method11(int i, int i_1_, int i_2_) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i,
						      Integer.valueOf(i_1_)));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null == class411)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i,
							  Integer
							      .valueOf(i_1_)));
	    else
		class411.anObject4712 = Integer.valueOf(i_1_);
	}
    }
    
    public long method12(int i, int i_3_) {
	if (null != ((Class15) this).aMap189) {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 != null)
		return ((Long) class411.anObject4712).longValue();
	}
	return ((Long)
		((Class15) this).anInterface52_190.method344(i, -1904518814))
		   .longValue();
    }
    
    public void method13(int i, long l) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, Long.valueOf(l)));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 == null)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, Long.valueOf(l)));
	    else
		class411.anObject4712 = Long.valueOf(l);
	}
    }
    
    public Object method14(int i, byte i_4_) {
	if (null != ((Class15) this).aMap189) {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 != null)
		return class411.anObject4712;
	}
	return ((Class15) this).anInterface52_190.method344(i, -1646731423);
    }
    
    public void method29(int i, Object object) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, object));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null == class411)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, object));
	    else
		class411.anObject4712 = object;
	}
    }
    
    public void method19(int i, int i_5_) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i,
						      Integer.valueOf(i_5_)));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null == class411)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i,
							  Integer
							      .valueOf(i_5_)));
	    else
		class411.anObject4712 = Integer.valueOf(i_5_);
	}
    }
    
    public void method17(int i, int i_6_) {
	if (((Class15) this).aMap189 != null)
	    ((Class15) this).aMap189.remove(Integer.valueOf(i));
    }
    
    public Iterator iterator() {
	if (((Class15) this).aMap189 == null)
	    return Collections.emptyList().iterator();
	return ((Class15) this).aMap189.values().iterator();
    }
    
    public Iterator method630() {
	if (((Class15) this).aMap189 == null)
	    return Collections.emptyList().iterator();
	return ((Class15) this).aMap189.values().iterator();
    }
    
    public void method23(int i, long l) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, Long.valueOf(l)));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 == null)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, Long.valueOf(l)));
	    else
		class411.anObject4712 = Long.valueOf(l);
	}
    }
    
    public Class15(Interface52 interface52) {
	((Class15) this).anInterface52_190 = interface52;
    }
    
    public long method20(int i) {
	if (null != ((Class15) this).aMap189) {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 != null)
		return ((Long) class411.anObject4712).longValue();
	}
	return ((Long)
		((Class15) this).anInterface52_190.method344(i, -1653704149))
		   .longValue();
    }
    
    public void method21(int i, long l) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, Long.valueOf(l)));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 == null)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, Long.valueOf(l)));
	    else
		class411.anObject4712 = Long.valueOf(l);
	}
    }
    
    public void method32(int i, long l) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, Long.valueOf(l)));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 == null)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, Long.valueOf(l)));
	    else
		class411.anObject4712 = Long.valueOf(l);
	}
    }
    
    public void method27(byte i) {
	if (((Class15) this).aMap189 != null)
	    ((Class15) this).aMap189.clear();
    }
    
    public void method24(int i, long l) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, Long.valueOf(l)));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 == null)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, Long.valueOf(l)));
	    else
		class411.anObject4712 = Long.valueOf(l);
	}
    }
    
    public int method34(int i) {
	if (null != ((Class15) this).aMap189) {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null != class411)
		return ((Integer) class411.anObject4712).intValue();
	}
	return ((Integer)
		((Class15) this).anInterface52_190.method344(i, -2032452585))
		   .intValue();
    }
    
    public void method28(int i, long l) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, Long.valueOf(l)));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 == null)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, Long.valueOf(l)));
	    else
		class411.anObject4712 = Long.valueOf(l);
	}
    }
    
    public Object method35(int i) {
	if (null != ((Class15) this).aMap189) {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (class411 != null)
		return class411.anObject4712;
	}
	return ((Class15) this).anInterface52_190.method344(i, -1552342049);
    }
    
    public void method22(int i, Object object) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, object));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null == class411)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, object));
	    else
		class411.anObject4712 = object;
	}
    }
    
    public void method36() {
	if (((Class15) this).aMap189 != null)
	    ((Class15) this).aMap189.clear();
    }
    
    public void method30(int i, Object object) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, object));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null == class411)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, object));
	    else
		class411.anObject4712 = object;
	}
    }
    
    public void method31(int i) {
	if (((Class15) this).aMap189 != null)
	    ((Class15) this).aMap189.remove(Integer.valueOf(i));
    }
    
    public int method16(int i) {
	if (null != ((Class15) this).aMap189) {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null != class411)
		return ((Integer) class411.anObject4712).intValue();
	}
	return ((Integer)
		((Class15) this).anInterface52_190.method344(i, -1958346820))
		   .intValue();
    }
    
    public int method33(int i) {
	if (null != ((Class15) this).aMap189) {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null != class411)
		return ((Integer) class411.anObject4712).intValue();
	}
	return ((Integer)
		((Class15) this).anInterface52_190.method344(i, -1878478100))
		   .intValue();
    }
    
    public void method18(int i, int i_7_) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i,
						      Integer.valueOf(i_7_)));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null == class411)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i,
							  Integer
							      .valueOf(i_7_)));
	    else
		class411.anObject4712 = Integer.valueOf(i_7_);
	}
    }
    
    public void method26() {
	if (((Class15) this).aMap189 != null)
	    ((Class15) this).aMap189.clear();
    }
    
    public void method15(int i, Object object, int i_8_) {
	if (((Class15) this).aMap189 == null) {
	    ((Class15) this).aMap189 = new HashMap();
	    ((Class15) this).aMap189.put(Integer.valueOf(i),
					 new Class411(i, object));
	} else {
	    Class411 class411
		= (Class411) ((Class15) this).aMap189.get(Integer.valueOf(i));
	    if (null == class411)
		((Class15) this).aMap189.put(Integer.valueOf(i),
					     new Class411(i, object));
	    else
		class411.anObject4712 = object;
	}
    }
    
    static final void method631(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = ((Class648) class648).aClass308_8391.aByte3388;
    }
    
    static final void method632(Class648 class648, byte i) {
	if (Class553.aClass308_7436 != null) {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1;
	    ((Class648) class648).aClass308_8391 = Class553.aClass308_7436;
	    ((Class648) class648).aMap8417.put
		(VarDomainType.CLAN_SETTING,
		 Class639.method7586(((Class648) class648).aClass308_8391,
				     998397941));
	} else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    static void method633(short i) {
	if (HandshakeOpcode.method4871(client.anInt10876 * 175711435, (byte) 5)) {
	    if (client.aClass109_11162.method1384((byte) 9) == null)
		Class487.method5890(10, 2130003981);
	    else
		Class487.method5890(12, 2130003981);
	} else if (10 == client.anInt10876 * 175711435
		   || 2 == client.anInt10876 * 175711435)
	    Class487.method5890(8, 2130003981);
	else if (client.anInt10876 * 175711435 == 0)
	    Class487.method5890(8, 2130003981);
    }
}
