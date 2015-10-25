/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class308
{
    long[] aLongArray3377;
    public boolean aBool3378;
    boolean aBool3379;
    long aLong3380;
    int anInt3381 = 0;
    public String aString3382 = null;
    int anInt3383 = 0;
    static final byte aByte3384 = 127;
    public byte aByte3385;
    static final byte aByte3386 = 0;
    public int[] anIntArray3387;
    public byte aByte3388;
    public int anInt3389;
    public static final byte aByte3390 = -1;
    public byte[] aByteArray3391;
    int[] anIntArray3392;
    int[] anIntArray3393;
    long[] aLongArray3394;
    public boolean[] aBoolArray3395;
    static final int anInt3396 = 6;
    public int anInt3397;
    public int anInt3398;
    public int anInt3399 = -1249559639;
    public String[] aStringArray3400;
    public String[] aStringArray3401;
    Class692 aClass692_3402;
    public byte aByte3403;
    static final byte aByte3404 = 126;
    static final byte aByte3405 = 125;
    public byte aByte3406;
    boolean aBool3407;
    
    void method4080(int i) {
	if (((Class308) this).aBool3379) {
	    if (((Class308) this).aLongArray3394 != null)
		System.arraycopy(((Class308) this).aLongArray3394, 0,
				 (((Class308) this).aLongArray3394
				  = new long[i]),
				 0, anInt3398 * 962389273);
	    else
		((Class308) this).aLongArray3394 = new long[i];
	}
	if (((Class308) this).aBool3407) {
	    if (null != aStringArray3401)
		System.arraycopy(aStringArray3401, 0,
				 aStringArray3401 = new String[i], 0,
				 962389273 * anInt3398);
	    else
		aStringArray3401 = new String[i];
	}
    }
    
    void method4081(int i, int i_0_) {
	if (((Class308) this).aBool3379) {
	    if (((Class308) this).aLongArray3377 != null)
		System.arraycopy(((Class308) this).aLongArray3377, 0,
				 (((Class308) this).aLongArray3377
				  = new long[i]),
				 0, 1957227505 * anInt3389);
	    else
		((Class308) this).aLongArray3377 = new long[i];
	}
	if (((Class308) this).aBool3407) {
	    if (null != aStringArray3400)
		System.arraycopy(aStringArray3400, 0,
				 aStringArray3400 = new String[i], 0,
				 anInt3389 * 1957227505);
	    else
		aStringArray3400 = new String[i];
	}
	if (aByteArray3391 != null)
	    System.arraycopy(aByteArray3391, 0, aByteArray3391 = new byte[i],
			     0, anInt3389 * 1957227505);
	else
	    aByteArray3391 = new byte[i];
	if (null != ((Class308) this).anIntArray3393)
	    System.arraycopy(((Class308) this).anIntArray3393, 0,
			     ((Class308) this).anIntArray3393 = new int[i], 0,
			     1957227505 * anInt3389);
	else
	    ((Class308) this).anIntArray3393 = new int[i];
	if (anIntArray3387 != null)
	    System.arraycopy(anIntArray3387, 0, anIntArray3387 = new int[i], 0,
			     1957227505 * anInt3389);
	else
	    anIntArray3387 = new int[i];
	if (aBoolArray3395 != null)
	    System.arraycopy(aBoolArray3395, 0,
			     aBoolArray3395 = new boolean[i], 0,
			     anInt3389 * 1957227505);
	else
	    aBoolArray3395 = new boolean[i];
    }
    
    public int method4082(String string, int i) {
	if (string == null || string.length() == 0)
	    return -1;
	for (int i_1_ = 0; i_1_ < 1957227505 * anInt3389; i_1_++) {
	    if (aStringArray3400[i_1_].equals(string))
		return i_1_;
	}
	return -1;
    }
    
    public int method4083(String string) {
	if (string == null || string.length() == 0)
	    return -1;
	for (int i = 0; i < 1957227505 * anInt3389; i++) {
	    if (aStringArray3400[i].equals(string))
		return i;
	}
	return -1;
    }
    
    public Integer method4084(int i, int i_2_) {
	if (null == ((Class308) this).aClass692_3402)
	    return null;
	Node node
	    = ((Class308) this).aClass692_3402.method8137((long) i);
	if (null == node || !(node instanceof Class528_Sub17))
	    return null;
	return new Integer(((Class528_Sub17) node).anInt10388 * 870949851);
    }
    
    public Class308(ByteBuffer class528_sub42) {
	anInt3397 = -650914271;
	method4113(class528_sub42, -1865747290);
    }
    
    public String method4085(int i, int i_3_) {
	if (null == ((Class308) this).aClass692_3402)
	    return null;
	Node node
	    = ((Class308) this).aClass692_3402.method8137((long) i);
	if (null == node || !(node instanceof Class528_Sub31))
	    return null;
	return (String) ((Class528_Sub31) node).anObject10468;
    }
    
    void method4086(int i) {
	if (((Class308) this).aBool3379) {
	    if (((Class308) this).aLongArray3394 != null)
		System.arraycopy(((Class308) this).aLongArray3394, 0,
				 (((Class308) this).aLongArray3394
				  = new long[i]),
				 0, anInt3398 * 962389273);
	    else
		((Class308) this).aLongArray3394 = new long[i];
	}
	if (((Class308) this).aBool3407) {
	    if (null != aStringArray3401)
		System.arraycopy(aStringArray3401, 0,
				 aStringArray3401 = new String[i], 0,
				 962389273 * anInt3398);
	    else
		aStringArray3401 = new String[i];
	}
    }
    
    void method4087(int i, byte i_4_) {
	if (i < 0 || i >= 1957227505 * anInt3389)
	    throw new RuntimeException("");
	anInt3389 -= -1172921071;
	((Class308) this).anIntArray3392 = null;
	if (0 == anInt3389 * 1957227505) {
	    ((Class308) this).aLongArray3377 = null;
	    aStringArray3400 = null;
	    aByteArray3391 = null;
	    ((Class308) this).anIntArray3393 = null;
	    anIntArray3387 = null;
	    aBoolArray3395 = null;
	    anInt3399 = -1249559639;
	    anInt3397 = -650914271;
	} else {
	    System.arraycopy(aByteArray3391, i + 1, aByteArray3391, i,
			     anInt3389 * 1957227505 - i);
	    System.arraycopy(((Class308) this).anIntArray3393, 1 + i,
			     ((Class308) this).anIntArray3393, i,
			     1957227505 * anInt3389 - i);
	    System.arraycopy(anIntArray3387, i + 1, anIntArray3387, i,
			     anInt3389 * 1957227505 - i);
	    System.arraycopy(aBoolArray3395, i + 1, aBoolArray3395, i,
			     anInt3389 * 1957227505 - i);
	    if (null != ((Class308) this).aLongArray3377)
		System.arraycopy(((Class308) this).aLongArray3377, 1 + i,
				 ((Class308) this).aLongArray3377, i,
				 anInt3389 * 1957227505 - i);
	    if (null != aStringArray3400)
		System.arraycopy(aStringArray3400, 1 + i, aStringArray3400, i,
				 1957227505 * anInt3389 - i);
	    method4094(-1587958482);
	}
    }
    
    void method4088(int i) {
	if (((Class308) this).aBool3379) {
	    if (((Class308) this).aLongArray3377 != null)
		System.arraycopy(((Class308) this).aLongArray3377, 0,
				 (((Class308) this).aLongArray3377
				  = new long[i]),
				 0, 1957227505 * anInt3389);
	    else
		((Class308) this).aLongArray3377 = new long[i];
	}
	if (((Class308) this).aBool3407) {
	    if (null != aStringArray3400)
		System.arraycopy(aStringArray3400, 0,
				 aStringArray3400 = new String[i], 0,
				 anInt3389 * 1957227505);
	    else
		aStringArray3400 = new String[i];
	}
	if (aByteArray3391 != null)
	    System.arraycopy(aByteArray3391, 0, aByteArray3391 = new byte[i],
			     0, anInt3389 * 1957227505);
	else
	    aByteArray3391 = new byte[i];
	if (null != ((Class308) this).anIntArray3393)
	    System.arraycopy(((Class308) this).anIntArray3393, 0,
			     ((Class308) this).anIntArray3393 = new int[i], 0,
			     1957227505 * anInt3389);
	else
	    ((Class308) this).anIntArray3393 = new int[i];
	if (anIntArray3387 != null)
	    System.arraycopy(anIntArray3387, 0, anIntArray3387 = new int[i], 0,
			     1957227505 * anInt3389);
	else
	    anIntArray3387 = new int[i];
	if (aBoolArray3395 != null)
	    System.arraycopy(aBoolArray3395, 0,
			     aBoolArray3395 = new boolean[i], 0,
			     anInt3389 * 1957227505);
	else
	    aBoolArray3395 = new boolean[i];
    }
    
    void method4089(int i, int i_5_) {
	anInt3398 -= -175331543;
	if (anInt3398 * 962389273 == 0) {
	    ((Class308) this).aLongArray3394 = null;
	    aStringArray3401 = null;
	} else {
	    if (((Class308) this).aLongArray3394 != null)
		System.arraycopy(((Class308) this).aLongArray3394, i + 1,
				 ((Class308) this).aLongArray3394, i,
				 962389273 * anInt3398 - i);
	    if (aStringArray3401 != null)
		System.arraycopy(aStringArray3401, 1 + i, aStringArray3401, i,
				 962389273 * anInt3398 - i);
	}
    }
    
    int method4090(int i, byte i_6_, int i_7_) {
	if (i_6_ == 126 || i_6_ == 127)
	    return -1;
	if (-1748736153 * anInt3399 == i
	    && (-959262177 * anInt3397 == -1
		|| aByteArray3391[-959262177 * anInt3397] < 125))
	    return -1;
	if (i_6_ == aByteArray3391[i])
	    return -1;
	aByteArray3391[i] = i_6_;
	method4094(-2049324029);
	return i;
    }
    
    int method4091(int i, boolean bool, byte i_8_) {
	if (aBoolArray3395[i] == bool)
	    return -1;
	aBoolArray3395[i] = bool;
	return i;
    }
    
    int method4092(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
	int i_13_ = (1 << i_10_) - 1;
	int i_14_ = 31 == i_11_ ? -1 : (1 << 1 + i_11_) - 1;
	int i_15_ = i_14_ ^ i_13_;
	i_9_ <<= i_10_;
	i_9_ &= i_15_;
	int i_16_ = ((Class308) this).anIntArray3393[i];
	if (i_9_ == (i_16_ & i_15_))
	    return -1;
	i_16_ &= i_15_ ^ 0xffffffff;
	((Class308) this).anIntArray3393[i] = i_16_ | i_9_;
	return i;
    }
    
    public int method4093(int i, int i_17_, int i_18_, byte i_19_) {
	int i_20_ = 31 == i_18_ ? -1 : (1 << 1 + i_18_) - 1;
	return (((Class308) this).anIntArray3393[i] & i_20_) >>> i_17_;
    }
    
    void method4094(int i) {
	if (anInt3389 * 1957227505 == 0) {
	    anInt3399 = -1249559639;
	    anInt3397 = -650914271;
	} else {
	    anInt3399 = -1249559639;
	    anInt3397 = -650914271;
	    int i_21_ = 0;
	    byte i_22_ = aByteArray3391[0];
	    for (int i_23_ = 1; i_23_ < 1957227505 * anInt3389; i_23_++) {
		if (aByteArray3391[i_23_] > i_22_) {
		    if (i_22_ == 125)
			anInt3397 = 650914271 * i_21_;
		    i_21_ = i_23_;
		    i_22_ = aByteArray3391[i_23_];
		} else if (anInt3397 * -959262177 == -1
			   && aByteArray3391[i_23_] == 125)
		    anInt3397 = 650914271 * i_23_;
	    }
	    anInt3399 = i_21_ * 1249559639;
	    if (-1 != -1748736153 * anInt3399)
		aByteArray3391[anInt3399 * -1748736153] = (byte) 126;
	}
    }
    
    void method4095(int i, byte i_24_) {
	if (((Class308) this).aBool3379) {
	    if (((Class308) this).aLongArray3394 != null)
		System.arraycopy(((Class308) this).aLongArray3394, 0,
				 (((Class308) this).aLongArray3394
				  = new long[i]),
				 0, anInt3398 * 962389273);
	    else
		((Class308) this).aLongArray3394 = new long[i];
	}
	if (((Class308) this).aBool3407) {
	    if (null != aStringArray3401)
		System.arraycopy(aStringArray3401, 0,
				 aStringArray3401 = new String[i], 0,
				 962389273 * anInt3398);
	    else
		aStringArray3401 = new String[i];
	}
    }
    
    boolean method4096(int i, String string, int i_25_) {
	if (string == null)
	    string = "";
	else if (string.length() > 80)
	    string = string.substring(0, 80);
	if (null != ((Class308) this).aClass692_3402) {
	    Node node
		= ((Class308) this).aClass692_3402.method8137((long) i);
	    if (null != node) {
		if (node instanceof Class528_Sub31) {
		    Class528_Sub31 class528_sub31 = (Class528_Sub31) node;
		    if (class528_sub31.anObject10468 instanceof String) {
			if (string.equals(class528_sub31.anObject10468))
			    return false;
			class528_sub31.method6443(-953963392);
			((Class308) this).aClass692_3402.method8142
			    (new Class528_Sub31(string),
			     -4849232331708333273L * class528_sub31.aLong7107);
			return true;
		    }
		}
		node.method6443(-1532230801);
	    }
	} else
	    ((Class308) this).aClass692_3402 = new Class692(4);
	((Class308) this).aClass692_3402.method8142(new Class528_Sub31(string),
						    (long) i);
	return true;
    }
    
    void method4097(int i) {
	if (((Class308) this).aBool3379) {
	    if (((Class308) this).aLongArray3377 != null)
		System.arraycopy(((Class308) this).aLongArray3377, 0,
				 (((Class308) this).aLongArray3377
				  = new long[i]),
				 0, 1957227505 * anInt3389);
	    else
		((Class308) this).aLongArray3377 = new long[i];
	}
	if (((Class308) this).aBool3407) {
	    if (null != aStringArray3400)
		System.arraycopy(aStringArray3400, 0,
				 aStringArray3400 = new String[i], 0,
				 anInt3389 * 1957227505);
	    else
		aStringArray3400 = new String[i];
	}
	if (aByteArray3391 != null)
	    System.arraycopy(aByteArray3391, 0, aByteArray3391 = new byte[i],
			     0, anInt3389 * 1957227505);
	else
	    aByteArray3391 = new byte[i];
	if (null != ((Class308) this).anIntArray3393)
	    System.arraycopy(((Class308) this).anIntArray3393, 0,
			     ((Class308) this).anIntArray3393 = new int[i], 0,
			     1957227505 * anInt3389);
	else
	    ((Class308) this).anIntArray3393 = new int[i];
	if (anIntArray3387 != null)
	    System.arraycopy(anIntArray3387, 0, anIntArray3387 = new int[i], 0,
			     1957227505 * anInt3389);
	else
	    anIntArray3387 = new int[i];
	if (aBoolArray3395 != null)
	    System.arraycopy(aBoolArray3395, 0,
			     aBoolArray3395 = new boolean[i], 0,
			     anInt3389 * 1957227505);
	else
	    aBoolArray3395 = new boolean[i];
    }
    
    void method4098(int i) {
	if (((Class308) this).aBool3379) {
	    if (((Class308) this).aLongArray3394 != null)
		System.arraycopy(((Class308) this).aLongArray3394, 0,
				 (((Class308) this).aLongArray3394
				  = new long[i]),
				 0, anInt3398 * 962389273);
	    else
		((Class308) this).aLongArray3394 = new long[i];
	}
	if (((Class308) this).aBool3407) {
	    if (null != aStringArray3401)
		System.arraycopy(aStringArray3401, 0,
				 aStringArray3401 = new String[i], 0,
				 962389273 * anInt3398);
	    else
		aStringArray3401 = new String[i];
	}
    }
    
    void method4099(long l, String string, int i, byte i_26_) {
	if (string != null && string.length() == 0)
	    string = null;
	if (((Class308) this).aBool3379 != l > 0L)
	    throw new RuntimeException("");
	if ((null != string) != ((Class308) this).aBool3407)
	    throw new RuntimeException("");
	if (l > 0L && (null == ((Class308) this).aLongArray3377
		       || (anInt3389 * 1957227505
			   >= ((Class308) this).aLongArray3377.length))
	    || (string != null
		&& (aStringArray3400 == null
		    || anInt3389 * 1957227505 >= aStringArray3400.length)))
	    method4081(1957227505 * anInt3389 + 5, -309064744);
	if (((Class308) this).aLongArray3377 != null)
	    ((Class308) this).aLongArray3377[anInt3389 * 1957227505] = l;
	if (aStringArray3400 != null)
	    aStringArray3400[1957227505 * anInt3389] = string;
	if (-1748736153 * anInt3399 == -1) {
	    anInt3399 = 350663399 * anInt3389;
	    aByteArray3391[anInt3389 * 1957227505] = (byte) 126;
	} else
	    aByteArray3391[1957227505 * anInt3389] = (byte) 0;
	((Class308) this).anIntArray3393[1957227505 * anInt3389] = 0;
	anIntArray3387[anInt3389 * 1957227505] = i;
	aBoolArray3395[anInt3389 * 1957227505] = false;
	anInt3389 += -1172921071;
	((Class308) this).anIntArray3392 = null;
    }
    
    void method4100(int i) {
	if (((Class308) this).aBool3379) {
	    if (((Class308) this).aLongArray3394 != null)
		System.arraycopy(((Class308) this).aLongArray3394, 0,
				 (((Class308) this).aLongArray3394
				  = new long[i]),
				 0, anInt3398 * 962389273);
	    else
		((Class308) this).aLongArray3394 = new long[i];
	}
	if (((Class308) this).aBool3407) {
	    if (null != aStringArray3401)
		System.arraycopy(aStringArray3401, 0,
				 aStringArray3401 = new String[i], 0,
				 962389273 * anInt3398);
	    else
		aStringArray3401 = new String[i];
	}
    }
    
    public int method4101(String string) {
	if (string == null || string.length() == 0)
	    return -1;
	for (int i = 0; i < 1957227505 * anInt3389; i++) {
	    if (aStringArray3400[i].equals(string))
		return i;
	}
	return -1;
    }
    
    void method4102(long l, String string, int i) {
	if (string != null && string.length() == 0)
	    string = null;
	if (l > 0L != ((Class308) this).aBool3379)
	    throw new RuntimeException("");
	if (((Class308) this).aBool3407 != (null != string))
	    throw new RuntimeException("");
	if (l > 0L && (null == ((Class308) this).aLongArray3394
		       || (anInt3398 * 962389273
			   >= ((Class308) this).aLongArray3394.length))
	    || (null != string
		&& (null == aStringArray3401
		    || anInt3398 * 962389273 >= aStringArray3401.length)))
	    method4095(5 + anInt3398 * 962389273, (byte) 71);
	if (((Class308) this).aLongArray3394 != null)
	    ((Class308) this).aLongArray3394[962389273 * anInt3398] = l;
	if (aStringArray3401 != null)
	    aStringArray3401[anInt3398 * 962389273] = string;
	anInt3398 += -175331543;
    }
    
    public Long method4103(int i, int i_27_) {
	if (null == ((Class308) this).aClass692_3402)
	    return null;
	Node node
	    = ((Class308) this).aClass692_3402.method8137((long) i);
	if (null == node || !(node instanceof Class528_Sub32))
	    return null;
	return new Long(9198117397452292413L
			* ((Class528_Sub32) node).aLong10469);
    }
    
    boolean method4104(int i, long l) {
	if (((Class308) this).aClass692_3402 != null) {
	    Node node
		= ((Class308) this).aClass692_3402.method8137((long) i);
	    if (node != null) {
		if (node instanceof Class528_Sub32) {
		    Class528_Sub32 class528_sub32 = (Class528_Sub32) node;
		    if (l == class528_sub32.aLong10469 * 9198117397452292413L)
			return false;
		    class528_sub32.aLong10469 = l * -684332442695901675L;
		    return true;
		}
		node.method6443(2018635356);
	    }
	} else
	    ((Class308) this).aClass692_3402 = new Class692(4);
	((Class308) this).aClass692_3402.method8142(new Class528_Sub32(l),
						    (long) i);
	return true;
    }
    
    void method4105() {
	if (anInt3389 * 1957227505 == 0) {
	    anInt3399 = -1249559639;
	    anInt3397 = -650914271;
	} else {
	    anInt3399 = -1249559639;
	    anInt3397 = -650914271;
	    int i = 0;
	    byte i_28_ = aByteArray3391[0];
	    for (int i_29_ = 1; i_29_ < 1957227505 * anInt3389; i_29_++) {
		if (aByteArray3391[i_29_] > i_28_) {
		    if (i_28_ == 125)
			anInt3397 = 650914271 * i;
		    i = i_29_;
		    i_28_ = aByteArray3391[i_29_];
		} else if (anInt3397 * -959262177 == -1
			   && aByteArray3391[i_29_] == 125)
		    anInt3397 = 650914271 * i_29_;
	    }
	    anInt3399 = i * 1249559639;
	    if (-1 != -1748736153 * anInt3399)
		aByteArray3391[anInt3399 * -1748736153] = (byte) 126;
	}
    }
    
    void method4106() {
	if (anInt3389 * 1957227505 == 0) {
	    anInt3399 = -1249559639;
	    anInt3397 = -650914271;
	} else {
	    anInt3399 = -1249559639;
	    anInt3397 = -650914271;
	    int i = 0;
	    byte i_30_ = aByteArray3391[0];
	    for (int i_31_ = 1; i_31_ < 1957227505 * anInt3389; i_31_++) {
		if (aByteArray3391[i_31_] > i_30_) {
		    if (i_30_ == 125)
			anInt3397 = 650914271 * i;
		    i = i_31_;
		    i_30_ = aByteArray3391[i_31_];
		} else if (anInt3397 * -959262177 == -1
			   && aByteArray3391[i_31_] == 125)
		    anInt3397 = 650914271 * i_31_;
	    }
	    anInt3399 = i * 1249559639;
	    if (-1 != -1748736153 * anInt3399)
		aByteArray3391[anInt3399 * -1748736153] = (byte) 126;
	}
    }
    
    void method4107(int i) {
	anInt3398 -= -175331543;
	if (anInt3398 * 962389273 == 0) {
	    ((Class308) this).aLongArray3394 = null;
	    aStringArray3401 = null;
	} else {
	    if (((Class308) this).aLongArray3394 != null)
		System.arraycopy(((Class308) this).aLongArray3394, i + 1,
				 ((Class308) this).aLongArray3394, i,
				 962389273 * anInt3398 - i);
	    if (aStringArray3401 != null)
		System.arraycopy(aStringArray3401, 1 + i, aStringArray3401, i,
				 962389273 * anInt3398 - i);
	}
    }
    
    void method4108(int i) {
	anInt3398 -= -175331543;
	if (anInt3398 * 962389273 == 0) {
	    ((Class308) this).aLongArray3394 = null;
	    aStringArray3401 = null;
	} else {
	    if (((Class308) this).aLongArray3394 != null)
		System.arraycopy(((Class308) this).aLongArray3394, i + 1,
				 ((Class308) this).aLongArray3394, i,
				 962389273 * anInt3398 - i);
	    if (aStringArray3401 != null)
		System.arraycopy(aStringArray3401, 1 + i, aStringArray3401, i,
				 962389273 * anInt3398 - i);
	}
    }
    
    boolean method4109(int i, int i_32_, byte i_33_) {
	if (((Class308) this).aClass692_3402 != null) {
	    Node node
		= ((Class308) this).aClass692_3402.method8137((long) i);
	    if (node != null) {
		if (node instanceof Class528_Sub17) {
		    Class528_Sub17 class528_sub17 = (Class528_Sub17) node;
		    if (i_32_ == class528_sub17.anInt10388 * 870949851)
			return false;
		    class528_sub17.anInt10388 = i_32_ * 1370857555;
		    return true;
		}
		node.method6443(-945594937);
	    }
	} else
	    ((Class308) this).aClass692_3402 = new Class692(4);
	((Class308) this).aClass692_3402.method8142(new Class528_Sub17(i_32_),
						    (long) i);
	return true;
    }
    
    public int[] method4110(byte i) {
	if (null == ((Class308) this).anIntArray3392) {
	    String[] strings = new String[anInt3389 * 1957227505];
	    ((Class308) this).anIntArray3392 = new int[1957227505 * anInt3389];
	    for (int i_34_ = 0; i_34_ < 1957227505 * anInt3389; i_34_++) {
		strings[i_34_] = aStringArray3400[i_34_];
		if (null != strings[i_34_])
		    strings[i_34_] = strings[i_34_].toLowerCase();
		((Class308) this).anIntArray3392[i_34_] = i_34_;
	    }
	    Class276.method3709(strings, ((Class308) this).anIntArray3392,
				117495312);
	}
	return ((Class308) this).anIntArray3392;
    }
    
    boolean method4111(int i, int i_35_, int i_36_, int i_37_, int i_38_) {
	int i_39_ = (1 << i_36_) - 1;
	int i_40_ = i_37_ == 31 ? -1 : (1 << i_37_ + 1) - 1;
	int i_41_ = i_40_ ^ i_39_;
	i_35_ <<= i_36_;
	i_35_ &= i_41_;
	if (null != ((Class308) this).aClass692_3402) {
	    Node node
		= ((Class308) this).aClass692_3402.method8137((long) i);
	    if (null != node) {
		if (node instanceof Class528_Sub17) {
		    Class528_Sub17 class528_sub17 = (Class528_Sub17) node;
		    if ((870949851 * class528_sub17.anInt10388 & i_41_)
			== i_35_)
			return false;
		    Class528_Sub17 class528_sub17_42_;
		    (class528_sub17_42_ = class528_sub17).anInt10388
			= (1370857555
			   * (class528_sub17_42_.anInt10388 * 870949851
			      & (i_41_ ^ 0xffffffff)));
		    Class528_Sub17 class528_sub17_43_;
		    (class528_sub17_43_ = class528_sub17).anInt10388
			= (1370857555
			   * (class528_sub17_43_.anInt10388 * 870949851
			      | i_35_));
		    return true;
		}
		node.method6443(-607007057);
	    }
	} else
	    ((Class308) this).aClass692_3402 = new Class692(4);
	((Class308) this).aClass692_3402.method8142(new Class528_Sub17(i_35_),
						    (long) i);
	return true;
    }
    
    void method4112(int i) {
	anInt3398 -= -175331543;
	if (anInt3398 * 962389273 == 0) {
	    ((Class308) this).aLongArray3394 = null;
	    aStringArray3401 = null;
	} else {
	    if (((Class308) this).aLongArray3394 != null)
		System.arraycopy(((Class308) this).aLongArray3394, i + 1,
				 ((Class308) this).aLongArray3394, i,
				 962389273 * anInt3398 - i);
	    if (aStringArray3401 != null)
		System.arraycopy(aStringArray3401, 1 + i, aStringArray3401, i,
				 962389273 * anInt3398 - i);
	}
    }
    
    void method4113(ByteBuffer class528_sub42, int i) {
	int i_44_ = class528_sub42.readUnsignedByte((byte) 77);
	if (i_44_ < 1 || i_44_ > 6)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i_44_).toString());
	int i_45_ = class528_sub42.readUnsignedByte((byte) 20);
	if (0 != (i_45_ & 0x1))
	    ((Class308) this).aBool3379 = true;
	if ((i_45_ & 0x2) != 0)
	    ((Class308) this).aBool3407 = true;
	if (!((Class308) this).aBool3379) {
	    ((Class308) this).aLongArray3377 = null;
	    ((Class308) this).aLongArray3394 = null;
	}
	if (!((Class308) this).aBool3407) {
	    aStringArray3400 = null;
	    aStringArray3401 = null;
	}
	((Class308) this).anInt3381
	    = class528_sub42.readInt(553535483) * 1565535543;
	((Class308) this).anInt3383
	    = class528_sub42.readInt(969834814) * 1275155219;
	if (i_44_ <= 3 && 0 != 1202548507 * ((Class308) this).anInt3383)
	    ((Class308) this).anInt3383 += 1350446816;
	anInt3389 = class528_sub42.readUnsignedShort(-1148085337) * -1172921071;
	anInt3398 = class528_sub42.readUnsignedByte((byte) 95) * -175331543;
	aString3382 = class528_sub42.readString(311936980);
	if (i_44_ >= 4)
	    class528_sub42.readInt(855965800);
	aBool3378 = class528_sub42.readUnsignedByte((byte) 31) == 1;
	aByte3385 = class528_sub42.method9627(-1801869964);
	aByte3403 = class528_sub42.method9627(-2144501826);
	aByte3406 = class528_sub42.method9627(-1391383843);
	aByte3388 = class528_sub42.method9627(-1338833211);
	if (anInt3389 * 1957227505 > 0) {
	    if (((Class308) this).aBool3379
		&& (null == ((Class308) this).aLongArray3377
		    || (((Class308) this).aLongArray3377.length
			< 1957227505 * anInt3389)))
		((Class308) this).aLongArray3377
		    = new long[1957227505 * anInt3389];
	    if (((Class308) this).aBool3407
		&& (null == aStringArray3400
		    || aStringArray3400.length < 1957227505 * anInt3389))
		aStringArray3400 = new String[anInt3389 * 1957227505];
	    if (null == aByteArray3391
		|| aByteArray3391.length < anInt3389 * 1957227505)
		aByteArray3391 = new byte[anInt3389 * 1957227505];
	    if (((Class308) this).anIntArray3393 == null
		|| (((Class308) this).anIntArray3393.length
		    < anInt3389 * 1957227505))
		((Class308) this).anIntArray3393
		    = new int[1957227505 * anInt3389];
	    if (anIntArray3387 == null
		|| anIntArray3387.length < 1957227505 * anInt3389)
		anIntArray3387 = new int[anInt3389 * 1957227505];
	    if (aBoolArray3395 == null
		|| aBoolArray3395.length < 1957227505 * anInt3389)
		aBoolArray3395 = new boolean[anInt3389 * 1957227505];
	    for (int i_46_ = 0; i_46_ < 1957227505 * anInt3389; i_46_++) {
		if (((Class308) this).aBool3379)
		    ((Class308) this).aLongArray3377[i_46_]
			= class528_sub42.method9633(771973092);
		if (((Class308) this).aBool3407)
		    aStringArray3400[i_46_]
			= class528_sub42.method9684((byte) 2);
		aByteArray3391[i_46_] = class528_sub42.method9627(-1046889191);
		if (i_44_ >= 2)
		    ((Class308) this).anIntArray3393[i_46_]
			= class528_sub42.readInt(-252346618);
		if (i_44_ >= 5)
		    anIntArray3387[i_46_]
			= class528_sub42.readUnsignedShort(712758527);
		else
		    anIntArray3387[i_46_] = 0;
		if (i_44_ >= 6)
		    aBoolArray3395[i_46_]
			= class528_sub42.readUnsignedByte((byte) 48) == 1;
		else
		    aBoolArray3395[i_46_] = false;
	    }
	    method4094(-1071771980);
	}
	if (962389273 * anInt3398 > 0) {
	    if (((Class308) this).aBool3379
		&& (((Class308) this).aLongArray3394 == null
		    || (((Class308) this).aLongArray3394.length
			< 962389273 * anInt3398)))
		((Class308) this).aLongArray3394
		    = new long[anInt3398 * 962389273];
	    if (((Class308) this).aBool3407
		&& (null == aStringArray3401
		    || aStringArray3401.length < 962389273 * anInt3398))
		aStringArray3401 = new String[anInt3398 * 962389273];
	    for (int i_47_ = 0; i_47_ < anInt3398 * 962389273; i_47_++) {
		if (((Class308) this).aBool3379)
		    ((Class308) this).aLongArray3394[i_47_]
			= class528_sub42.method9633(771973092);
		if (((Class308) this).aBool3407)
		    aStringArray3401[i_47_]
			= class528_sub42.method9684((byte) 16);
	    }
	}
	if (i_44_ >= 3) {
	    int i_48_ = class528_sub42.readUnsignedShort(-1678690188);
	    if (i_48_ > 0) {
		((Class308) this).aClass692_3402
		    = new Class692(i_48_ < 16
				   ? Class327.method4259(i_48_, -2134279851)
				   : 16);
		while (i_48_-- > 0) {
		    int i_49_ = class528_sub42.readInt(-874794788);
		    int i_50_ = i_49_ & 0x3fffffff;
		    int i_51_ = i_49_ >>> 30;
		    if (0 == i_51_) {
			int i_52_ = class528_sub42.readInt(-981195023);
			((Class308) this).aClass692_3402.method8142
			    (new Class528_Sub17(i_52_), (long) i_50_);
		    } else if (i_51_ == 1) {
			long l = class528_sub42.method9633(771973092);
			((Class308) this).aClass692_3402
			    .method8142(new Class528_Sub32(l), (long) i_50_);
		    } else if (i_51_ == 2) {
			String string = class528_sub42.readString(837387447);
			((Class308) this).aClass692_3402.method8142
			    (new Class528_Sub31(string), (long) i_50_);
		    }
		}
	    }
	}
    }
    
    static final void method4114(Class648 class648, int i) {
	int i_53_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_53_, (byte) 31);
	Class226 class226 = Class380.aClass226Array3970[i_53_ >> 16];
	Class691_Sub12.method9920(class229, class226, class648, (byte) -128);
    }
    
    static final void method4115(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.aBool2461
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	Class39.method811(class229, 1435904523);
	if (1835803215 * class229.anInt2377 == -1 && !class226.aBool2335)
	    Class528_Sub3.method9248(class229.anInt2376 * 306930455,
				     -721589891);
    }
    
    static final void method4116(Class648 class648, byte i)
	throws Exception_Sub4 {
	((Class648) class648).anInt8395 -= -577899301;
	Class495.aClass283_Sub1_5578.method3779
	    ((float) (((Class648) class648).anIntArray8394
		      [((Class648) class648).anInt8395 * 717927929]),
	     (float) (((Class648) class648).anIntArray8394
		      [717927929 * ((Class648) class648).anInt8395 + 1]),
	     (float) (((Class648) class648).anIntArray8394
		      [2 + 717927929 * ((Class648) class648).anInt8395]),
	     (byte) 8);
    }
    
    static final void method4117(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub27_10568,
	     (((Class648) class648).anIntArray8394
	      [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]),
	     743802506);
	Class186.method2754(Class514.aClass528_Sub38_6967
				.aClass691_Sub24_10594
				.method10014(-1824619963),
			    false, 753209496);
	Class243.method3387(2135024444);
    }
    
    static void method4118(Class528_Sub19 class528_sub19, int i) {
	Class71.aClass283_Sub1_774 = new Class283_Sub1(client.aClass31_11137);
	Class71.aClass283_Sub1_774.method3826(Class280.aClass280_3062,
					      58384044);
	try {
	    Class326_Sub2 class326_sub2
		= ((Class326_Sub2)
		   Class71.aClass283_Sub1_774
		       .method3763(Class297.aClass297_3255, false, 145413273));
	    Class684_Sub4 class684_sub4
		= ((Class684_Sub4)
		   Class71.aClass283_Sub1_774.method3831((Class294
							  .aClass294_3227),
							 false, -450898318));
	    class326_sub2.method9108(class528_sub19, -401153492);
	    class684_sub4.method10110(new Class430(0.0F, 0.0F, 0.0F),
				      -452032038);
	    Class71.aClass283_Sub1_774.method3771
		(Class422.method5051(99999.0F, 99999.0F, 99999.0F),
		 -1334952429);
	    Class71.aClass283_Sub1_774.method3768
		(Class422.method5051(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 (byte) 40);
	    Class71.aClass283_Sub1_774.method3818
		(Class422.method5051(99999.0F, 99999.0F, 99999.0F),
		 -118468290);
	    Class71.aClass283_Sub1_774.method3767
		(Class422.method5051(Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY,
				     Float.POSITIVE_INFINITY),
		 739775161);
	} catch (Exception_Sub4 exception_sub4) {
	    /* empty */
	}
	Class71.anInt775
	    = (Class95_Sub1_Sub2.aClass537_11200.method6507(1839562587)
	       * -970742707);
	Class71.anInt773
	    = (Class95_Sub1_Sub2.aClass537_11200.method6504((byte) 34)
	       * -1102045891);
	Class71.aBool776 = true;
    }
    
    static final void method4119(Class648 class648, int i) {
	int i_54_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (i_54_ > 255 || i_54_ < 0)
	    i_54_ = 0;
	if (i_54_ != Class514.aClass528_Sub38_6967.aClass691_Sub18_10599
			 .method9961(662937364)) {
	    Class514.aClass528_Sub38_6967.method9556((Class514
						      .aClass528_Sub38_6967
						      .aClass691_Sub18_10599),
						     i_54_, 1581863650);
	    Class243.method3387(2145724580);
	    client.aBool11161 = false;
	}
    }
    
    static final void method4120(boolean bool, Class648 class648, int i) {
	int i_55_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_55_, (byte) 23);
	Class226 class226 = Class380.aClass226Array3970[i_55_ >> 16];
	if (bool)
	    Class57.method989(class226, class229, 1556447889);
	else
	    Class557.method6760(class226, class229, -1736496318);
    }
    
    static final void method4121(Class648 class648, int i) {
	int i_56_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class239 class239
	    = ((Class239)
	       Class208.aClass5_Sub6_2238.method63(i_56_, 1514377050));
	if (null == class239.aString2609)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class239.aString2609;
    }
    
    public static void method4122(boolean bool, int i) {
	Class518_Sub1.aBool10698 = bool;
    }
}
