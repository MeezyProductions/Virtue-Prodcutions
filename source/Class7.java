/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class7 implements Definition, Interface1
{
    Map aMap128;
    public Class459 aClass459_129;
    String aString130 = "null";
    public Class459 aClass459_131;
    Object[] anObjectArray132;
    int anInt133;
    int anInt134 = 0;
    HashMap aHashMap135;
    
    public int[] method548(Object object, byte i) {
	if (0 == 1515370961 * ((Class7) this).anInt134)
	    return null;
	if (((Class7) this).aHashMap135 == null)
	    method555(-1800344808);
	return (int[]) ((Class7) this).aHashMap135.get(object);
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 118);
	    if (0 == i_0_)
		break;
	    method549(class528_sub42, i_0_, 2060150736);
	}
    }
    
    void method549(ByteBuffer class528_sub42, int i, int i_1_) {
	if (1 == i) {
	    char c
		= Class505.method6149(class528_sub42.method9627(-2073293217),
				      898278238);
	    aClass459_131 = Class459.method5562(c, (byte) -66);
	} else if (2 == i) {
	    char c = Class505.method6149(class528_sub42.method9627(-970812721),
					 1524132073);
	    aClass459_129 = Class459.method5562(c, (byte) 48);
	} else if (3 == i)
	    ((Class7) this).aString130 = class528_sub42.readString(364915244);
	else if (i == 4)
	    ((Class7) this).anInt133
		= class528_sub42.readInt(-1280116751) * 875546401;
	else if (i == 5 || 6 == i) {
	    ((Class7) this).anInt134
		= class528_sub42.readUnsignedShort(-429026637) * -546291919;
	    ((Class7) this).aMap128
		= new HashMap(((Class7) this).anInt134 * 1515370961);
	    for (int i_2_ = 0; i_2_ < ((Class7) this).anInt134 * 1515370961;
		 i_2_++) {
		int i_3_ = class528_sub42.readInt(-218525869);
		java.io.Serializable serializable;
		if (5 == i)
		    serializable = class528_sub42.readString(1256433668);
		else
		    serializable
			= new Integer(class528_sub42.readInt(-1471562101));
		((Class7) this).aMap128.put(new Integer(i_3_), serializable);
	    }
	} else if (i == 7 || i == 8) {
	    int i_4_ = class528_sub42.readUnsignedShort(885429555);
	    ((Class7) this).anInt134
		= class528_sub42.readUnsignedShort(-1001011865) * -546291919;
	    ((Class7) this).anObjectArray132 = new Object[i_4_];
	    for (int i_5_ = 0; i_5_ < ((Class7) this).anInt134 * 1515370961;
		 i_5_++) {
		int i_6_ = class528_sub42.readUnsignedShort(-908320816);
		if (i == 7)
		    ((Class7) this).anObjectArray132[i_6_]
			= class528_sub42.readString(1880446917);
		else
		    ((Class7) this).anObjectArray132[i_6_]
			= new Integer(class528_sub42.readInt(-787195721));
	    }
	} else if (101 == i)
	    aClass459_131
		= ((Class459)
		   Class443.method5321(Class459.method5563(-249990879),
				       class528_sub42.method9719(65280),
				       2048014877));
	else if (102 == i)
	    aClass459_129
		= ((Class459)
		   Class443.method5321(Class459.method5563(-459963553),
				       class528_sub42.method9719(65280),
				       1483108469));
    }
    
    public int method550(int i) {
	return ((Class7) this).anInt134 * 1515370961;
    }
    
    public String method551(int i, int i_7_) {
	Object object = method552(i, -2098534133);
	if (null == object)
	    return ((Class7) this).aString130;
	return (String) object;
    }
    
    Object method552(int i, int i_8_) {
	if (((Class7) this).anObjectArray132 != null) {
	    if (i < 0 || i >= ((Class7) this).anObjectArray132.length)
		return null;
	    return ((Class7) this).anObjectArray132[i];
	}
	if (((Class7) this).aMap128 != null)
	    return ((Class7) this).aMap128.get(new Integer(i));
	return null;
    }
    
    public boolean method553(Object object, int i) {
	if (1515370961 * ((Class7) this).anInt134 == 0)
	    return false;
	if (null == ((Class7) this).aHashMap135)
	    method555(-1800344808);
	return ((Class7) this).aHashMap135.containsKey(object);
    }
    
    void method554() {
	HashMap hashmap = new HashMap();
	if (null != ((Class7) this).anObjectArray132) {
	    for (int i = 0; i < ((Class7) this).anObjectArray132.length; i++) {
		if (null != ((Class7) this).anObjectArray132[i]) {
		    Object object = ((Class7) this).anObjectArray132[i];
		    List list = (List) hashmap.get(object);
		    if (list == null) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i));
		}
	    }
	} else if (null != ((Class7) this).aMap128) {
	    Iterator iterator = ((Class7) this).aMap128.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (null == list) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	((Class7) this).aHashMap135 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i = 0;
	    Iterator iterator_9_ = list.iterator();
	    while (iterator_9_.hasNext()) {
		Integer integer = (Integer) iterator_9_.next();
		is[i++] = integer.intValue();
	    }
	    if (null == ((Class7) this).anObjectArray132)
		Arrays.sort(is);
	    ((Class7) this).aHashMap135.put(entry.getKey(), is);
	}
    }
    
    void method555(int i) {
	HashMap hashmap = new HashMap();
	if (null != ((Class7) this).anObjectArray132) {
	    for (int i_10_ = 0;
		 i_10_ < ((Class7) this).anObjectArray132.length; i_10_++) {
		if (null != ((Class7) this).anObjectArray132[i_10_]) {
		    Object object = ((Class7) this).anObjectArray132[i_10_];
		    List list = (List) hashmap.get(object);
		    if (list == null) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i_10_));
		}
	    }
	} else if (null != ((Class7) this).aMap128) {
	    Iterator iterator = ((Class7) this).aMap128.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (null == list) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	((Class7) this).aHashMap135 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i_11_ = 0;
	    Iterator iterator_12_ = list.iterator();
	    while (iterator_12_.hasNext()) {
		Integer integer = (Integer) iterator_12_.next();
		is[i_11_++] = integer.intValue();
	    }
	    if (null == ((Class7) this).anObjectArray132)
		Arrays.sort(is);
	    ((Class7) this).aHashMap135.put(entry.getKey(), is);
	}
    }
    
    void method556() {
	HashMap hashmap = new HashMap();
	if (null != ((Class7) this).anObjectArray132) {
	    for (int i = 0; i < ((Class7) this).anObjectArray132.length; i++) {
		if (null != ((Class7) this).anObjectArray132[i]) {
		    Object object = ((Class7) this).anObjectArray132[i];
		    List list = (List) hashmap.get(object);
		    if (list == null) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i));
		}
	    }
	} else if (null != ((Class7) this).aMap128) {
	    Iterator iterator = ((Class7) this).aMap128.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (null == list) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	((Class7) this).aHashMap135 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i = 0;
	    Iterator iterator_13_ = list.iterator();
	    while (iterator_13_.hasNext()) {
		Integer integer = (Integer) iterator_13_.next();
		is[i++] = integer.intValue();
	    }
	    if (null == ((Class7) this).anObjectArray132)
		Arrays.sort(is);
	    ((Class7) this).aHashMap135.put(entry.getKey(), is);
	}
    }
    
    Class7() {
	/* empty */
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 70);
	    if (0 == i)
		break;
	    method549(class528_sub42, i, -600713692);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 78);
	    if (0 == i)
		break;
	    method549(class528_sub42, i, 1918265693);
	}
    }
    
    public void method9(int i, byte i_14_) {
	/* empty */
    }
    
    public void method8(int i) {
	/* empty */
    }
    
    void method557(ByteBuffer class528_sub42, int i) {
	if (1 == i) {
	    char c
		= Class505.method6149(class528_sub42.method9627(-1633375266),
				      139553394);
	    aClass459_131 = Class459.method5562(c, (byte) 77);
	} else if (2 == i) {
	    char c = Class505.method6149(class528_sub42.method9627(-920012516),
					 -773108005);
	    aClass459_129 = Class459.method5562(c, (byte) -24);
	} else if (3 == i)
	    ((Class7) this).aString130 = class528_sub42.readString(434149783);
	else if (i == 4)
	    ((Class7) this).anInt133
		= class528_sub42.readInt(-807583658) * 875546401;
	else if (i == 5 || 6 == i) {
	    ((Class7) this).anInt134
		= class528_sub42.readUnsignedShort(311007407) * -546291919;
	    ((Class7) this).aMap128
		= new HashMap(((Class7) this).anInt134 * 1515370961);
	    for (int i_15_ = 0; i_15_ < ((Class7) this).anInt134 * 1515370961;
		 i_15_++) {
		int i_16_ = class528_sub42.readInt(347216836);
		java.io.Serializable serializable;
		if (5 == i)
		    serializable = class528_sub42.readString(1957397490);
		else
		    serializable
			= new Integer(class528_sub42.readInt(-1903092527));
		((Class7) this).aMap128.put(new Integer(i_16_), serializable);
	    }
	} else if (i == 7 || i == 8) {
	    int i_17_ = class528_sub42.readUnsignedShort(-215752607);
	    ((Class7) this).anInt134
		= class528_sub42.readUnsignedShort(-884151625) * -546291919;
	    ((Class7) this).anObjectArray132 = new Object[i_17_];
	    for (int i_18_ = 0; i_18_ < ((Class7) this).anInt134 * 1515370961;
		 i_18_++) {
		int i_19_ = class528_sub42.readUnsignedShort(-812602416);
		if (i == 7)
		    ((Class7) this).anObjectArray132[i_19_]
			= class528_sub42.readString(589925643);
		else
		    ((Class7) this).anObjectArray132[i_19_]
			= new Integer(class528_sub42.readInt(-1267449802));
	    }
	} else if (101 == i)
	    aClass459_131
		= ((Class459)
		   Class443.method5321(Class459.method5563(1722159984),
				       class528_sub42.method9719(65280),
				       729733248));
	else if (102 == i)
	    aClass459_129
		= ((Class459)
		   Class443.method5321(Class459.method5563(468250703),
				       class528_sub42.method9719(65280),
				       916788986));
    }
    
    public int method558(int i) {
	Object object = method552(i, -610369534);
	if (null == object)
	    return ((Class7) this).anInt133 * -1580303135;
	return ((Integer) object).intValue();
    }
    
    public int method559(int i) {
	Object object = method552(i, -73592344);
	if (null == object)
	    return ((Class7) this).anInt133 * -1580303135;
	return ((Integer) object).intValue();
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    public String method560(int i) {
	Object object = method552(i, -925893763);
	if (null == object)
	    return ((Class7) this).aString130;
	return (String) object;
    }
    
    public int method561(int i, int i_20_) {
	Object object = method552(i, -374514163);
	if (null == object)
	    return ((Class7) this).anInt133 * -1580303135;
	return ((Integer) object).intValue();
    }
    
    public int method562() {
	return ((Class7) this).anInt134 * 1515370961;
    }
    
    public void method59() {
	/* empty */
    }
    
    public String method563(int i) {
	Object object = method552(i, -1223833950);
	if (null == object)
	    return ((Class7) this).aString130;
	return (String) object;
    }
    
    public static int method564(int i, int i_21_, int i_22_) {
	int i_23_ = 1;
	for (/**/; i_21_ > 1; i_21_ >>= 1) {
	    if (0 != (i_21_ & 0x1))
		i_23_ *= i;
	    i *= i;
	}
	if (i_21_ == 1)
	    return i_23_ * i;
	return i_23_;
    }
    
    public static void method565(int i) {
	if (client.aBool10899) {
	    Class229 class229
		= Class230.method3236(-771216895 * Class487.anInt5494,
				      -1114833639 * client.anInt11052,
				      1295944037);
	    if (class229 != null && class229.anObjectArray2495 != null) {
		Class528_Sub30 class528_sub30 = new Class528_Sub30();
		class528_sub30.aClass229_10461 = class229;
		class528_sub30.anObjectArray10460 = class229.anObjectArray2495;
		Class555.method6741(class528_sub30, (short) 11290);
	    }
	    client.anInt11048 = -1210203257;
	    client.anInt11053 = -1433018553;
	    client.aBool10899 = false;
	    if (null != class229)
		Class39.method811(class229, 1435904523);
	}
    }
    
    static void method566(int i) {
	/* empty */
    }
}
