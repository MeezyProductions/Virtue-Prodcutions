/* Class589 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.List;

public class Class589 implements Interface67
{
    Class186 aClass186_7723;
    int anInt7724;
    boolean aBool7725;
    Class446 aClass446_7726;
    Class364 aClass364_7727;
    Class584 aClass584_7728 = Class584.aClass584_7698;
    Interface69 anInterface69_7729;
    int anInt7730;
    byte[] aByteArray7731;
    boolean aBool7732;
    
    public boolean method419(int i, int i_0_) {
	if (null == ((Class589) this).aClass186_7723)
	    return false;
	boolean bool = false;
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (null != list && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public void method309(int i) {
	if (Class584.aClass584_7699 == ((Class589) this).aClass584_7728) {
	    byte[] is
		= (((Class589) this).aClass446_7726.method5395
		   (((Class589) this).anInt7724 * 1924526813, -1045528107));
	    if (null != is) {
		((Class589) this).aByteArray7731 = is;
		method7067((byte) -78);
		((Class589) this).aClass584_7728 = Class584.aClass584_7700;
		if (((Class589) this).anInterface69_7729 != null)
		    ((Class589) this).anInterface69_7729.method465
			(this, is.length,
			 1924526813 * ((Class589) this).anInt7724, false,
			 725421485);
	    }
	}
    }
    
    void method7065() {
	/* empty */
    }
    
    void method7066() {
	/* empty */
    }
    
    public boolean method411(int i) {
	return false;
    }
    
    void method7067(byte i) {
	/* empty */
    }
    
    public int method440() {
	return ((Class589) this).anInt7724 * 1924526813;
    }
    
    public int method414(int i) {
	if (((Class589) this).aByteArray7731 != null)
	    return ((Class589) this).aByteArray7731.length;
	return 0;
    }
    
    public Class480 method453(int i) {
	return Class480.aClass480_5444;
    }
    
    public int method415(byte i) {
	return ((Class589) this).anInt7724 * 1924526813;
    }
    
    public void method423(ByteBuffer class528_sub42, int i) {
	if (null != ((Class589) this).aClass186_7723) {
	    if (((Class589) this).anInterface69_7729 != null)
		((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	    if (((Class589) this).aBool7725)
		throw new RuntimeException("");
	    synchronized (((Class589) this).aClass186_7723) {
		List list = method7069(-1188484180);
		if (null != list) {
		    list.add(class528_sub42);
		    ((Class589) this).anInt7730
			+= -303871569 * class528_sub42.payload.length;
		    method7068(list, ((Class589) this).anInt7730 * -465588913,
			       966379403);
		}
	    }
	}
    }
    
    public ByteBuffer method417(int i, byte i_1_) {
	if (((Class589) this).aClass186_7723 == null)
	    return null;
	ByteBuffer class528_sub42 = null;
	if (((Class589) this).anInterface69_7729 != null)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (list.size() > i)
		class528_sub42 = (ByteBuffer) list.get(i);
	}
	return class528_sub42;
    }
    
    public boolean method425() {
	return false;
    }
    
    public boolean method418(byte i) {
	return (((Class589) this).aClass186_7723 != null
		&& ((Class589) this).aBool7732);
    }
    
    public int method420(int i) {
	if (null == ((Class589) this).aClass186_7723)
	    return 0;
	int i_2_ = 0;
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (list != null)
		i_2_ = list.size();
	}
	return i_2_;
    }
    
    public void method421(boolean bool, int i) {
	if (null != ((Class589) this).anInterface69_7729)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	((Class589) this).aBool7725 = bool;
    }
    
    public Class480 method434() {
	return Class480.aClass480_5444;
    }
    
    void method7068(List list, int i, int i_3_) {
	if (((Class589) this).aClass186_7723 != null && null != list
	    && i >= 0) {
	    synchronized (((Class589) this).aClass186_7723) {
		((Class589) this).aClass186_7723.method2725
		    ((long) (1924526813 * ((Class589) this).anInt7724));
		if (i
		    <= ((Class589) this).aClass186_7723.method2751(1409155601))
		    ((Class589) this).aClass186_7723.method2730
			(list,
			 (long) (1924526813 * ((Class589) this).anInt7724), i,
			 -1226267209);
		else {
		    ((Class589) this).aBool7732 = false;
		    ((Class589) this).aBool7725 = false;
		    ((Class589) this).anInt7730 = 0;
		}
	    }
	}
    }
    
    List method7069(int i) {
	if (null == ((Class589) this).aClass186_7723
	    || !((Class589) this).aBool7732)
	    return null;
	Object object = null;
	List list;
	synchronized (((Class589) this).aClass186_7723) {
	    list
		= (List) (((Class589) this).aClass186_7723.method2727
			  ((long) (((Class589) this).anInt7724 * 1924526813)));
	    if (null == list && ((Class589) this).aBool7732) {
		list = new ArrayList();
		((Class589) this).aClass186_7723.method2730
		    (list, (long) (((Class589) this).anInt7724 * 1924526813),
		     0, -1226267209);
	    }
	}
	return list;
    }
    
    public byte[] method430(int i) {
	if (((Class589) this).anInterface69_7729 != null)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	return ((Class589) this).aByteArray7731;
    }
    
    public Class480 method431() {
	return Class480.aClass480_5444;
    }
    
    public Class469 method438(int i) {
	Class469 class469 = new Class469(((Class589) this).aClass364_7727);
	class469.method5739(this, 937834506);
	return class469;
    }
    
    public Class469 method424() {
	Class469 class469 = new Class469(((Class589) this).aClass364_7727);
	class469.method5739(this, 937834506);
	return class469;
    }
    
    public void method336() {
	if (Class584.aClass584_7699 == ((Class589) this).aClass584_7728) {
	    byte[] is
		= (((Class589) this).aClass446_7726.method5395
		   (((Class589) this).anInt7724 * 1924526813, -1665844224));
	    if (null != is) {
		((Class589) this).aByteArray7731 = is;
		method7067((byte) -32);
		((Class589) this).aClass584_7728 = Class584.aClass584_7700;
		if (((Class589) this).anInterface69_7729 != null)
		    ((Class589) this).anInterface69_7729.method465
			(this, is.length,
			 1924526813 * ((Class589) this).anInt7724, false,
			 623701522);
	    }
	}
    }
    
    public boolean method426() {
	return false;
    }
    
    void method7070() {
	/* empty */
    }
    
    public boolean method209() {
	return (((Class589) this).aClass186_7723 != null
		&& ((Class589) this).aBool7732);
    }
    
    public Class589(Class446 class446, int i, Class364 class364,
		    Interface69 interface69, Class186 class186) {
	((Class589) this).aClass446_7726 = class446;
	((Class589) this).anInt7724 = i * 36533621;
	((Class589) this).aClass364_7727 = class364;
	((Class589) this).anInterface69_7729 = interface69;
	((Class589) this).aClass186_7723 = class186;
	((Class589) this).aBool7732 = ((Class589) this).aClass186_7723 != null;
	((Class589) this).aClass584_7728 = Class584.aClass584_7699;
    }
    
    public byte[] method427(int i) {
	if (((Class589) this).anInterface69_7729 != null)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	return ((Class589) this).aByteArray7731;
    }
    
    public byte[] method428(int i) {
	if (((Class589) this).anInterface69_7729 != null)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	return ((Class589) this).aByteArray7731;
    }
    
    public int method450() {
	if (null == ((Class589) this).aClass186_7723)
	    return 0;
	int i = 0;
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (list != null)
		i = list.size();
	}
	return i;
    }
    
    public int method442() {
	if (((Class589) this).aByteArray7731 != null)
	    return ((Class589) this).aByteArray7731.length;
	return 0;
    }
    
    public void method413(ByteBuffer class528_sub42) {
	if (null != ((Class589) this).aClass186_7723) {
	    if (((Class589) this).anInterface69_7729 != null)
		((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	    if (((Class589) this).aBool7725)
		throw new RuntimeException("");
	    synchronized (((Class589) this).aClass186_7723) {
		List list = method7069(-1188484180);
		if (null != list) {
		    list.add(class528_sub42);
		    ((Class589) this).anInt7730
			+= -303871569 * class528_sub42.payload.length;
		    method7068(list, ((Class589) this).anInt7730 * -465588913,
			       980810992);
		}
	    }
	}
    }
    
    public Class480 method432() {
	return Class480.aClass480_5444;
    }
    
    public Class469 method445() {
	Class469 class469 = new Class469(((Class589) this).aClass364_7727);
	class469.method5739(this, 937834506);
	return class469;
    }
    
    public boolean method449(int i) {
	if (null == ((Class589) this).aClass186_7723)
	    return false;
	List list = method7069(-1188484180);
	if (null == list || list.size() <= 0)
	    ((Class589) this).aBool7725 = false;
	return ((Class589) this).aBool7725;
    }
    
    public int method435() {
	return ((Class589) this).anInt7724 * 1924526813;
    }
    
    public int method436() {
	return ((Class589) this).anInt7724 * 1924526813;
    }
    
    public int method437() {
	return ((Class589) this).anInt7724 * 1924526813;
    }
    
    public void method337() {
	if (Class584.aClass584_7699 == ((Class589) this).aClass584_7728) {
	    byte[] is
		= (((Class589) this).aClass446_7726.method5395
		   (((Class589) this).anInt7724 * 1924526813, -1970579603));
	    if (null != is) {
		((Class589) this).aByteArray7731 = is;
		method7067((byte) -15);
		((Class589) this).aClass584_7728 = Class584.aClass584_7700;
		if (((Class589) this).anInterface69_7729 != null)
		    ((Class589) this).anInterface69_7729.method465
			(this, is.length,
			 1924526813 * ((Class589) this).anInt7724, false,
			 -2078917082);
	    }
	}
    }
    
    public int method439() {
	return ((Class589) this).anInt7724 * 1924526813;
    }
    
    public Class480 method433() {
	return Class480.aClass480_5444;
    }
    
    public Class584 method410(byte i) {
	return ((Class589) this).aClass584_7728;
    }
    
    public void method452(ByteBuffer class528_sub42) {
	if (null != ((Class589) this).aClass186_7723) {
	    if (((Class589) this).anInterface69_7729 != null)
		((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	    if (((Class589) this).aBool7725)
		throw new RuntimeException("");
	    synchronized (((Class589) this).aClass186_7723) {
		List list = method7069(-1188484180);
		if (null != list) {
		    list.add(class528_sub42);
		    ((Class589) this).anInt7730
			+= -303871569 * class528_sub42.payload.length;
		    method7068(list, ((Class589) this).anInt7730 * -465588913,
			       875106874);
		}
	    }
	}
    }
    
    public void method412(ByteBuffer class528_sub42) {
	if (null != ((Class589) this).aClass186_7723) {
	    if (((Class589) this).anInterface69_7729 != null)
		((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	    if (((Class589) this).aBool7725)
		throw new RuntimeException("");
	    synchronized (((Class589) this).aClass186_7723) {
		List list = method7069(-1188484180);
		if (null != list) {
		    list.add(class528_sub42);
		    ((Class589) this).anInt7730
			+= -303871569 * class528_sub42.payload.length;
		    method7068(list, ((Class589) this).anInt7730 * -465588913,
			       300329313);
		}
	    }
	}
    }
    
    public ByteBuffer method444(int i) {
	if (((Class589) this).aClass186_7723 == null)
	    return null;
	ByteBuffer class528_sub42 = null;
	if (((Class589) this).anInterface69_7729 != null)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (list.size() > i)
		class528_sub42 = (ByteBuffer) list.get(i);
	}
	return class528_sub42;
    }
    
    public ByteBuffer method422(int i) {
	if (((Class589) this).aClass186_7723 == null)
	    return null;
	ByteBuffer class528_sub42 = null;
	if (((Class589) this).anInterface69_7729 != null)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (list.size() > i)
		class528_sub42 = (ByteBuffer) list.get(i);
	}
	return class528_sub42;
    }
    
    public ByteBuffer method446(int i) {
	if (((Class589) this).aClass186_7723 == null)
	    return null;
	ByteBuffer class528_sub42 = null;
	if (((Class589) this).anInterface69_7729 != null)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (list.size() > i)
		class528_sub42 = (ByteBuffer) list.get(i);
	}
	return class528_sub42;
    }
    
    public ByteBuffer method447(int i) {
	if (((Class589) this).aClass186_7723 == null)
	    return null;
	ByteBuffer class528_sub42 = null;
	if (((Class589) this).anInterface69_7729 != null)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (list.size() > i)
		class528_sub42 = (ByteBuffer) list.get(i);
	}
	return class528_sub42;
    }
    
    public boolean method448(int i) {
	if (null == ((Class589) this).aClass186_7723)
	    return false;
	boolean bool = false;
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (null != list && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public void method409(ByteBuffer class528_sub42) {
	if (null != ((Class589) this).aClass186_7723) {
	    if (((Class589) this).anInterface69_7729 != null)
		((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	    if (((Class589) this).aBool7725)
		throw new RuntimeException("");
	    synchronized (((Class589) this).aClass186_7723) {
		List list = method7069(-1188484180);
		if (null != list) {
		    list.add(class528_sub42);
		    ((Class589) this).anInt7730
			+= -303871569 * class528_sub42.payload.length;
		    method7068(list, ((Class589) this).anInt7730 * -465588913,
			       220843328);
		}
	    }
	}
    }
    
    public boolean method443(int i) {
	if (null == ((Class589) this).aClass186_7723)
	    return false;
	boolean bool = false;
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (null != list && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public byte[] method416(int i, byte i_4_) {
	if (((Class589) this).anInterface69_7729 != null)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	return ((Class589) this).aByteArray7731;
    }
    
    public int method451() {
	if (null == ((Class589) this).aClass186_7723)
	    return 0;
	int i = 0;
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (list != null)
		i = list.size();
	}
	return i;
    }
    
    public int method454() {
	if (null == ((Class589) this).aClass186_7723)
	    return 0;
	int i = 0;
	synchronized (((Class589) this).aClass186_7723) {
	    List list = method7069(-1188484180);
	    if (list != null)
		i = list.size();
	}
	return i;
    }
    
    public void method429(boolean bool) {
	if (null != ((Class589) this).anInterface69_7729)
	    ((Class589) this).anInterface69_7729.method462(this, (byte) 2);
	((Class589) this).aBool7725 = bool;
    }
    
    public boolean method441() {
	if (null == ((Class589) this).aClass186_7723)
	    return false;
	List list = method7069(-1188484180);
	if (null == list || list.size() <= 0)
	    ((Class589) this).aBool7725 = false;
	return ((Class589) this).aBool7725;
    }
    
    public Class584 method455() {
	return ((Class589) this).aClass584_7728;
    }
    
    static final void method7071(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2410 * 2073033379;
    }
    
    static final void method7072(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_5_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_6_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	Class79 class79
	    = (Class79) Class208.aClass5_Sub10_2239.method63(i_6_, 250796800);
	if (class79.method1140((short) 255))
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= ((ItemType)
		   Class18.aClass5_Sub13_206.method63(i_5_, 1607127826))
		      .method523(i_6_, class79.aString811, 1122388374);
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= (((ItemType)
		    Class18.aClass5_Sub13_206.method63(i_5_, 518341123))
		       .method522
		   (i_6_, 1875093329 * class79.anInt809, -1835291372));
    }
    
    public static float method7073(Class430 class430, int i) {
	Class422 class422 = Class422.method5051(0.0F, 0.0F, 1.0F);
	class422.method5075(class430);
	double d
	    = 1.5707963267948966 - Math.acos((double) class422.aFloat4776);
	class422.method5054();
	return (float) d;
    }
    
    public static void method7074(Class528_Sub33 class528_sub33, int i) {
	if (!Class622.method7419(175711435 * client.anInt10876, (byte) -17))
	    class528_sub33.method9510((byte) -115);
	else
	    Class626.aClass610_Sub2_8133.method7245(class528_sub33,
						    -872860961);
    }
}
