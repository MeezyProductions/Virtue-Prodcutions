/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class51
{
    static final int anInt571 = 10;
    static final int anInt572 = 1;
    LinkedHashMap aLinkedHashMap573 = new LinkedHashMap();
    
    void method896(int i) {
	Class23 class23 = null;
	do {
	    try {
		try {
		    class23 = Class223.method3160("3",
						  (client.aClass673_11108
						   .aString8534),
						  true, (byte) 91);
		    ByteBuffer class528_sub42 = new ByteBuffer(5000);
		    method903(class528_sub42, -22683589);
		    class23.method689(class528_sub42.payload, 0,
				      class528_sub42.pointer * -185904669,
				      -1662725530);
		} catch (Exception exception) {
		    try {
			if (null != class23)
			    class23.method683((byte) 51);
		    } catch (Exception exception_0_) {
			exception = exception_0_;
		    }
		    break;
		}
		try {
		    if (null != class23)
			class23.method683((byte) 78);
		} catch (Exception exception) {
		    /* empty */
		}
			} catch (Exception object) {
		try {
		    if (null != class23)
			class23.method683((byte) 6);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    Class51(ByteBuffer class528_sub42) {
	if (null != class528_sub42 && null != class528_sub42.payload) {
	    int i = class528_sub42.readUnsignedByte((byte) 93);
	    if (i > 0 && i <= 1) {
		int i_1_ = class528_sub42.readUnsignedByte((byte) 41);
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
		    long l = class528_sub42.method9633(771973092);
		    int i_3_ = class528_sub42.readInt(-899786861);
		    this.aLinkedHashMap573
			.put(Long.valueOf(l), Integer.valueOf(i_3_));
		}
	    }
	}
    }
    
    void method897(long l, int i, int i_4_) {
	if (this.aLinkedHashMap573.size() >= 10
	    && !this.aLinkedHashMap573
		    .containsKey(Long.valueOf(l))) {
	    Iterator iterator
		= this.aLinkedHashMap573.entrySet().iterator();
	    iterator.next();
	    iterator.remove();
	}
	this.aLinkedHashMap573.put(Long.valueOf(l),
					       Integer.valueOf(i));
	method896(842088442);
    }
    
    boolean method898(long l) {
	return this.aLinkedHashMap573.containsKey(Long.valueOf(l));
    }
    
    int method899(long l) {
	return ((Integer)
		this.aLinkedHashMap573.get(Long.valueOf(l)))
		   .intValue();
    }
    
    void method900(ByteBuffer class528_sub42) {
	class528_sub42.writeByte(1, (byte) -36);
	class528_sub42.writeByte(this.aLinkedHashMap573.size(),
				  (byte) -55);
	Iterator iterator
	    = this.aLinkedHashMap573.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    class528_sub42.method9606(((Long) entry.getKey()).longValue());
	    class528_sub42.writeInt(((Integer) entry.getValue()).intValue(),
				      2028069934);
	}
    }
    
    void method901(long l, int i) {
	if (this.aLinkedHashMap573.size() >= 10
	    && !this.aLinkedHashMap573
		    .containsKey(Long.valueOf(l))) {
	    Iterator iterator
		= this.aLinkedHashMap573.entrySet().iterator();
	    iterator.next();
	    iterator.remove();
	}
	this.aLinkedHashMap573.put(Long.valueOf(l),
					       Integer.valueOf(i));
	method896(-1159766571);
    }
    
    int method902(long l) {
	return ((Integer)
		this.aLinkedHashMap573.get(Long.valueOf(l)))
		   .intValue();
    }
    
    void method903(ByteBuffer class528_sub42, int i) {
	class528_sub42.writeByte(1, (byte) 66);
	class528_sub42.writeByte(this.aLinkedHashMap573.size(),
				  (byte) 44);
	Iterator iterator
	    = this.aLinkedHashMap573.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    class528_sub42.method9606(((Long) entry.getKey()).longValue());
	    class528_sub42.writeInt(((Integer) entry.getValue()).intValue(),
				      2013460728);
	}
    }
    
    Class51() {
	this(null);
    }
    
    int method904(long l) {
	return ((Integer)
		this.aLinkedHashMap573.get(Long.valueOf(l)))
		   .intValue();
    }
    
    void method905() {
	Class23 class23 = null;
	do {
	    try {
		try {
		    class23 = Class223.method3160("3",
						  (client.aClass673_11108
						   .aString8534),
						  true, (byte) -49);
		    ByteBuffer class528_sub42 = new ByteBuffer(5000);
		    method903(class528_sub42, -1309619199);
		    class23.method689(class528_sub42.payload, 0,
				      class528_sub42.pointer * -185904669,
				      -374703458);
		} catch (Exception exception) {
		    try {
			if (null != class23)
			    class23.method683((byte) 9);
		    } catch (Exception exception_5_) {
			exception = exception_5_;
		    }
		    break;
		}
		try {
		    if (null != class23)
			class23.method683((byte) 49);
		} catch (Exception exception) {
		    /* empty */
		}
			} catch (Exception object) {
		try {
		    if (null != class23)
			class23.method683((byte) 93);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    void method906() {
	Class23 class23 = null;
	do {
	    try {
		try {
		    class23 = Class223.method3160("3",
						  (client.aClass673_11108
						   .aString8534),
						  true, (byte) -72);
		    ByteBuffer class528_sub42 = new ByteBuffer(5000);
		    method903(class528_sub42, -300998679);
		    class23.method689(class528_sub42.payload, 0,
				      class528_sub42.pointer * -185904669,
				      -166547225);
		} catch (Exception exception) {
		    try {
			if (null != class23)
			    class23.method683((byte) 76);
		    } catch (Exception exception_6_) {
			exception = exception_6_;
		    }
		    break;
		}
		try {
		    if (null != class23)
			class23.method683((byte) 126);
		} catch (Exception exception) {
		    /* empty */
		}
			} catch (Exception object) {
		try {
		    if (null != class23)
			class23.method683((byte) 28);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    void method907() {
	Class23 class23 = null;
	do {
	    try {
		try {
		    class23 = Class223.method3160("3",
						  (client.aClass673_11108
						   .aString8534),
						  true, (byte) 8);
		    ByteBuffer class528_sub42 = new ByteBuffer(5000);
		    method903(class528_sub42, -794112864);
		    class23.method689(class528_sub42.payload, 0,
				      class528_sub42.pointer * -185904669,
				      -1876127544);
		} catch (Exception exception) {
		    try {
			if (null != class23)
			    class23.method683((byte) 114);
		    } catch (Exception exception_7_) {
			exception = exception_7_;
		    }
		    break;
		}
		try {
		    if (null != class23)
			class23.method683((byte) 108);
		} catch (Exception exception) {
		    /* empty */
		}
			} catch (Exception object) {
		try {
		    if (null != class23)
			class23.method683((byte) 7);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    void method908() {
	Class23 class23 = null;
	do {
	    try {
		try {
		    class23 = Class223.method3160("3",
						  (client.aClass673_11108
						   .aString8534),
						  true, (byte) -53);
		    ByteBuffer class528_sub42 = new ByteBuffer(5000);
		    method903(class528_sub42, -1459816731);
		    class23.method689(class528_sub42.payload, 0,
				      class528_sub42.pointer * -185904669,
				      942394413);
		} catch (Exception exception) {
		    try {
			if (null != class23)
			    class23.method683((byte) 65);
		    } catch (Exception exception_8_) {
			exception = exception_8_;
		    }
		    break;
		}
		try {
		    if (null != class23)
			class23.method683((byte) 105);
		} catch (Exception exception) {
		    /* empty */
		}
			} catch (Exception object) {
		try {
		    if (null != class23)
			class23.method683((byte) 27);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    static final void method909(int i) {
	int[] is = GPI.localPlayerIndicies;
	for (int i_9_ = 0; i_9_ < 1087758653 * GPI.localPlayerCount; i_9_++) {
	    Player class645_sub1_sub5_sub1_sub2
		= client.localPlayers[is[i_9_]];
	    if (class645_sub1_sub5_sub1_sub2 != null)
		class645_sub1_sub5_sub1_sub2.method10677(1154335551);
	}
	for (int i_10_ = 0; i_10_ < -2065344127 * client.anInt10922; i_10_++) {
	    long l = client.anIntArray10923[i_10_];
	    Class528_Sub31 class528_sub31
		= (Class528_Sub31) client.aClass692_11110.method8137(l);
	    if (null != class528_sub31)
		((Entity) class528_sub31.anObject10468)
		    .method10677(-1830395217);
	}
	if (0 == client.anInt10943 * 345087519) {
	    for (int i_11_ = 0; i_11_ < Class185.aClass182Array2106.length;
		 i_11_++) {
		Class182 class182 = Class185.aClass182Array2106[i_11_];
		if (class182.aBool2097)
		    class182.method2689(-1012043543).method10677(412991259);
	    }
	}
    }
}
