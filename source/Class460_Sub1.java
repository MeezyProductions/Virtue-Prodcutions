/* Class460_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class460_Sub1 extends Class460
{
    Class688 aClass688_10147;
    boolean aBool10148;
    Class449 aClass449_10149;
    boolean aBool10150;
    Class692 aClass692_10151;
    Class539 aClass539_10152;
    Class528_Sub21_Sub9 aClass528_Sub21_Sub9_10153;
    Class454 aClass454_10154;
    byte[] aByteArray10155;
    int anInt10156;
    Class539 aClass539_10157;
    static final byte aByte10158 = 0;
    static final byte aByte10159 = 1;
    static final byte aByte10160 = -1;
    byte[] aByteArray10161;
    int anInt10162 = 0;
    long aLong10163;
    int anInt10164;
    boolean aBool10165;
    boolean aBool10166;
    Class688 aClass688_10167;
    Class455 aClass455_10168;
    int anInt10169;
    static final int anInt10170 = 250;
    Class438 aClass438_10171;
    static final int anInt10172 = 1000;
    int anInt10173;
    static CRC32 aCRC32_10174 = new CRC32();
    static final int anInt10175 = 0;
    static final int anInt10176 = 1;
    static final int anInt10177 = 2;
    public static Class446 aClass446_10178;
    
    byte[] method5577(int i) {
	Class528_Sub21_Sub9 class528_sub21_sub9 = method9192(i, 0, 1003974567);
	if (class528_sub21_sub9 == null)
	    return null;
	byte[] is = class528_sub21_sub9.method10545(129148203);
	class528_sub21_sub9.method6443(2096894225);
	return is;
    }
    
    void method9184(int i, byte[] is, int i_0_, int i_1_, int i_2_) {
	if (!method9185(i, is, i_0_, i_1_, 1474453142)) {
	    ((Class460_Sub1) this).anInt10164 = 149026493 * i;
	    ((Class460_Sub1) this).aByteArray10155 = is;
	    ((Class460_Sub1) this).anInt10156 = i_0_ * -1537438001;
	    ((Class460_Sub1) this).aClass438_10171 = null;
	    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
	    if (!((Class460_Sub1) this).aClass454_10154.method5463(-486502254))
		((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
		    = (((Class460_Sub1) this).aClass454_10154.method5461
		       (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			(byte) 0, true, -1440661293));
	}
    }
    
    boolean method9185(int i, byte[] is, int i_3_, int i_4_, int i_5_) {
	if (i == -1608436587 * ((Class460_Sub1) this).anInt10164
	    && i_3_ == ((Class460_Sub1) this).anInt10156 * -585910225) {
	    boolean bool = true;
	    for (int i_6_ = 0;
		 i_6_ < ((Class460_Sub1) this).aByteArray10155.length;
		 i_6_++) {
		if (is[i_6_] != ((Class460_Sub1) this).aByteArray10155[i_6_]) {
		    bool = false;
		    break;
		}
	    }
	    if (bool)
		return true;
	}
	return false;
    }
    
    public int method9186(int i) {
	if (method5571(-355274421) == null) {
	    if (null == ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153)
		return 0;
	    return ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
		       .method10546(1353536974);
	}
	return 100;
    }
    
    Class438 method5571(int i) {
	if (((Class460_Sub1) this).aClass438_10171 != null)
	    return ((Class460_Sub1) this).aClass438_10171;
	if (null == ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153) {
	    if (((Class460_Sub1) this).aClass454_10154.method5463(-486502254))
		return null;
	    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
		= (((Class460_Sub1) this).aClass454_10154.method5461
		   (255, ((Class460_Sub1) this).anInt10173 * 4771823, (byte) 0,
		    true, -121469729));
	}
	if (((Class528_Sub21_Sub9)
	     ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153)
	    .aBool11576)
	    return null;
	byte[] is = ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			.method10545(99524330);
	if (((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
	    instanceof Class528_Sub21_Sub9_Sub2) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		((Class460_Sub1) this).aClass438_10171
		    = new Class438(is,
				   (-1608436587
				    * ((Class460_Sub1) this).anInt10164),
				   ((Class460_Sub1) this).aByteArray10155);
		if (((Class460_Sub1) this).anInt10156 * -585910225
		    != (((Class438) ((Class460_Sub1) this).aClass438_10171)
			.anInt4873) * 2036154075)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		((Class460_Sub1) this).aClass438_10171 = null;
		if (((Class460_Sub1) this).aClass454_10154
			.method5463(-486502254))
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
		else
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			    (byte) 0, true, 959002208));
		return null;
	    }
	} else {
	    try {
		if (null == is)
		    throw new RuntimeException();
		((Class460_Sub1) this).aClass438_10171
		    = new Class438(is,
				   (-1608436587
				    * ((Class460_Sub1) this).anInt10164),
				   ((Class460_Sub1) this).aByteArray10155);
	    } catch (RuntimeException runtimeexception) {
		((Class460_Sub1) this).aClass454_10154.method5466
		    (255, ((Class460_Sub1) this).anInt10173 * 4771823,
		     (byte) 1);
		((Class460_Sub1) this).aClass438_10171 = null;
		if (((Class460_Sub1) this).aClass454_10154
			.method5463(-486502254))
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
		else
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			    (byte) 0, true, 1834489975));
		return null;
	    }
	    if (((Class460_Sub1) this).aClass539_10152 != null)
		((Class460_Sub1) this).aClass455_10168.method5503
		    (((Class460_Sub1) this).anInt10173 * 4771823, is,
		     ((Class460_Sub1) this).aClass539_10152, (short) -17913);
	}
	((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
	if (((Class460_Sub1) this).aClass539_10157 != null) {
	    ((Class460_Sub1) this).aByteArray10161
		= new byte[-311250737 * (((Class438) (((Class460_Sub1) this)
						      .aClass438_10171))
					 .anInt4881)];
	    ((Class460_Sub1) this).anInt10162 = 0;
	}
	return ((Class460_Sub1) this).aClass438_10171;
    }
    
    void method9187(boolean bool) {
	((Class460_Sub1) this).aClass449_10149.method5413(bool, 1633176214);
    }
    
    byte[] method5574(int i) {
	Class528_Sub21_Sub9 class528_sub21_sub9 = method9192(i, 0, 646010227);
	if (class528_sub21_sub9 == null)
	    return null;
	byte[] is = class528_sub21_sub9.method10545(909772436);
	class528_sub21_sub9.method6443(-945751408);
	return is;
    }
    
    void method9188(byte i) {
	if (((Class460_Sub1) this).aClass688_10167 != null
	    && method5571(377354004) != null) {
	    for (Node node = ((Class460_Sub1) this).aClass688_10147
					 .method8034(1732544932);
		 node != null;
		 node = ((Class460_Sub1) this).aClass688_10147
				.method8037(-1921026764)) {
		int i_7_ = (int) (node.aLong7107 * -4849232331708333273L);
		if (i_7_ < 0
		    || (i_7_
			>= (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anInt4881) * -311250737)
		    || (((Class438) ((Class460_Sub1) this).aClass438_10171)
			.anIntArray4885[i_7_]) == 0)
		    node.method6443(-431515736);
		else {
		    if (0 == ((Class460_Sub1) this).aByteArray10161[i_7_])
			method9192(i_7_, 1, 821795368);
		    if (((Class460_Sub1) this).aByteArray10161[i_7_] == -1)
			method9192(i_7_, 2, 1074457149);
		    if (((Class460_Sub1) this).aByteArray10161[i_7_] == 1)
			node.method6443(833710533);
		}
	    }
	}
    }
    
    void method9189() {
	if (((Class460_Sub1) this).aClass688_10167 != null
	    && method5571(-1183664520) != null) {
	    for (Node node = ((Class460_Sub1) this).aClass688_10147
					 .method8034(1993863273);
		 node != null;
		 node = ((Class460_Sub1) this).aClass688_10147
				.method8037(617736217)) {
		int i = (int) (node.aLong7107 * -4849232331708333273L);
		if (i < 0
		    || (i
			>= (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anInt4881) * -311250737)
		    || (((Class438) ((Class460_Sub1) this).aClass438_10171)
			.anIntArray4885[i]) == 0)
		    node.method6443(-868689257);
		else {
		    if (0 == ((Class460_Sub1) this).aByteArray10161[i])
			method9192(i, 1, 213783282);
		    if (((Class460_Sub1) this).aByteArray10161[i] == -1)
			method9192(i, 2, 941934156);
		    if (((Class460_Sub1) this).aByteArray10161[i] == 1)
			node.method6443(1973366586);
		}
	    }
	}
    }
    
    public int method9190(int i) {
	if (((Class460_Sub1) this).aClass438_10171 == null)
	    return 0;
	return (-1319948689
		* (((Class438) ((Class460_Sub1) this).aClass438_10171)
		   .anInt4887));
    }
    
    public int method9191(int i) {
	return 662579805 * ((Class460_Sub1) this).anInt10162;
    }
    
    Class528_Sub21_Sub9 method9192(int i, int i_8_, int i_9_) {
	Class528_Sub21_Sub9 class528_sub21_sub9
	    = ((Class528_Sub21_Sub9)
	       ((Class460_Sub1) this).aClass692_10151.method8137((long) i));
	if (class528_sub21_sub9 != null && i_8_ == 0
	    && !((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11577
	    && ((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11576) {
	    class528_sub21_sub9.method6443(-751159147);
	    class528_sub21_sub9 = null;
	}
	if (null == class528_sub21_sub9) {
	    if (i_8_ == 0) {
		if (null != ((Class460_Sub1) this).aClass539_10157
		    && -1 != ((Class460_Sub1) this).aByteArray10161[i])
		    class528_sub21_sub9
			= (((Class460_Sub1) this).aClass455_10168.method5500
			   (i, ((Class460_Sub1) this).aClass539_10157,
			    (byte) 9));
		else if (((Class460_Sub1) this).aClass449_10149 != null) {
		    class528_sub21_sub9
			= (((Class460_Sub1) this).aClass449_10149.method5415
			   (4771823 * ((Class460_Sub1) this).anInt10173, i,
			    (byte) 2, true,
			    ((Class438) (((Class460_Sub1) this)
					 .aClass438_10171)).anIntArray4872[i],
			    ((Class438) (((Class460_Sub1) this)
					 .aClass438_10171)).anIntArray4875[i],
			    (short) 255));
		    if (null == class528_sub21_sub9)
			return null;
		} else if (!((Class460_Sub1) this).aClass454_10154
				.method5463(-486502254))
		    class528_sub21_sub9
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (((Class460_Sub1) this).anInt10173 * 4771823, i,
			    (byte) 2, true, -1067239450));
		else
		    return null;
	    } else if (1 == i_8_) {
		if (null == ((Class460_Sub1) this).aClass539_10157)
		    throw new RuntimeException();
		class528_sub21_sub9
		    = (((Class460_Sub1) this).aClass455_10168.method5501
		       (i, ((Class460_Sub1) this).aClass539_10157, (byte) 0));
	    } else if (i_8_ == 2) {
		if (((Class460_Sub1) this).aClass539_10157 == null)
		    throw new RuntimeException();
		if (((Class460_Sub1) this).aByteArray10161[i] != -1)
		    throw new RuntimeException();
		if (null != ((Class460_Sub1) this).aClass449_10149)
		    return null;
		if (!((Class460_Sub1) this).aClass454_10154
			 .method5462(1219233696))
		    class528_sub21_sub9
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (((Class460_Sub1) this).anInt10173 * 4771823, i,
			    (byte) 2, false, -1619776478));
		else
		    return null;
	    } else
		throw new RuntimeException();
	    ((Class460_Sub1) this).aClass692_10151
		.method8142(class528_sub21_sub9, (long) i);
	}
	if (((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11576)
	    return null;
	byte[] is = class528_sub21_sub9.method10545(-31157256);
	if (class528_sub21_sub9 instanceof Class528_Sub21_Sub9_Sub2) {
	    Class528_Sub21_Sub9 class528_sub21_sub9_10_;
	    try {
		if (is == null || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10174.reset();
		aCRC32_10174.update(is, 0, is.length - 2);
		int i_11_ = (int) aCRC32_10174.getValue();
		if (i_11_
		    != (((Class438) ((Class460_Sub1) this).aClass438_10171)
			.anIntArray4872[i]))
		    throw new RuntimeException();
		if ((((Class438) ((Class460_Sub1) this).aClass438_10171)
		     .aByteArrayArray4870) != null
		    && (((Class438) ((Class460_Sub1) this).aClass438_10171)
			.aByteArrayArray4870[i]) != null) {
		    byte[] is_12_
			= (((Class438) ((Class460_Sub1) this).aClass438_10171)
			   .aByteArrayArray4870[i]);
		    byte[] is_13_ = Class227.method3183(is, 0, is.length - 2,
							1143180743);
		    for (int i_14_ = 0; i_14_ < 64; i_14_++) {
			if (is_13_[i_14_] != is_12_[i_14_])
			    throw new RuntimeException();
		    }
		}
		int i_15_ = (((is[is.length - 2] & 0xff) << 8)
			     + (is[is.length - 1] & 0xff));
		if (((((Class438) ((Class460_Sub1) this).aClass438_10171)
		      .anIntArray4875[i])
		     & 0xffff)
		    != i_15_)
		    throw new RuntimeException();
		if (1 != ((Class460_Sub1) this).aByteArray10161[i]) {
		    if (0 != ((Class460_Sub1) this).aByteArray10161[i]) {
			/* empty */
		    }
		    ((Class460_Sub1) this).anInt10162 += 1383201269;
		    ((Class460_Sub1) this).aByteArray10161[i] = (byte) 1;
		}
		if (!((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11577)
		    class528_sub21_sub9.method6443(-118835798);
		class528_sub21_sub9_10_ = class528_sub21_sub9;
	    } catch (Exception exception) {
		((Class460_Sub1) this).aByteArray10161[i] = (byte) -1;
		class528_sub21_sub9.method6443(2036891659);
		if (((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11577) {
		    if (null != ((Class460_Sub1) this).aClass449_10149) {
			if (!((Class460_Sub1) this).aClass449_10149
				 .method5412((byte) 123)) {
			    Class528_Sub21_Sub9_Sub1 class528_sub21_sub9_sub1
				= (((Class460_Sub1) this).aClass449_10149
				       .method5415
				   ((((Class460_Sub1) this).anInt10173
				     * 4771823),
				    i, (byte) 2, true,
				    (((Class438)
				      ((Class460_Sub1) this).aClass438_10171)
				     .anIntArray4872[i]),
				    (((Class438)
				      ((Class460_Sub1) this).aClass438_10171)
				     .anIntArray4875[i]),
				    (short) 255));
			    if (null != class528_sub21_sub9_sub1)
				((Class460_Sub1) this).aClass692_10151
				    .method8142
				    (class528_sub21_sub9_sub1, (long) i);
			}
		    } else if (!((Class460_Sub1) this).aClass454_10154
				    .method5463(-486502254)) {
			Class528_Sub21_Sub9_Sub3 class528_sub21_sub9_sub3
			    = (((Class460_Sub1) this).aClass454_10154
				   .method5461
			       (((Class460_Sub1) this).anInt10173 * 4771823, i,
				(byte) 2, true, 658730010));
			((Class460_Sub1) this).aClass692_10151
			    .method8142(class528_sub21_sub9_sub3, (long) i);
		    }
		}
		return null;
	    }
	    return class528_sub21_sub9_10_;
	}
	try {
	    if (is == null || is.length <= 2) {
		if (((Class460_Sub1) this).aClass449_10149 != null) {
		    class528_sub21_sub9.method6443(280934816);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10174.reset();
	    aCRC32_10174.update(is, 0, is.length - 2);
	    int i_16_ = (int) aCRC32_10174.getValue();
	    if ((((Class438) ((Class460_Sub1) this).aClass438_10171)
		 .anIntArray4872[i])
		!= i_16_)
		throw new RuntimeException();
	    if ((((Class438) ((Class460_Sub1) this).aClass438_10171)
		 .aByteArrayArray4870) != null
		&& null != (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .aByteArrayArray4870[i])) {
		byte[] is_17_
		    = (((Class438) ((Class460_Sub1) this).aClass438_10171)
		       .aByteArrayArray4870[i]);
		byte[] is_18_
		    = Class227.method3183(is, 0, is.length - 2, 1500717261);
		for (int i_19_ = 0; i_19_ < 64; i_19_++) {
		    if (is_17_[i_19_] != is_18_[i_19_])
			throw new RuntimeException();
		}
	    }
	    if (((Class460_Sub1) this).aClass449_10149 != null) {
		((Class460_Sub1) this).aClass454_10154.anInt4992 = 0;
		((Class460_Sub1) this).aClass454_10154.anInt4993 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    ((Class460_Sub1) this).aClass454_10154.method5466
		(4771823 * ((Class460_Sub1) this).anInt10173, i, (byte) 1);
	    class528_sub21_sub9.method6443(2054950139);
	    if (((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11577) {
		if (((Class460_Sub1) this).aClass449_10149 != null) {
		    if (!((Class460_Sub1) this).aClass449_10149
			     .method5412((byte) 56)) {
			Class528_Sub21_Sub9_Sub1 class528_sub21_sub9_sub1
			    = (((Class460_Sub1) this).aClass449_10149
				   .method5415
			       (((Class460_Sub1) this).anInt10173 * 4771823, i,
				(byte) 2, true,
				(((Class438)
				  ((Class460_Sub1) this).aClass438_10171)
				 .anIntArray4872[i]),
				(((Class438)
				  ((Class460_Sub1) this).aClass438_10171)
				 .anIntArray4875[i]),
				(short) 255));
			if (null != class528_sub21_sub9_sub1)
			    ((Class460_Sub1) this).aClass692_10151.method8142
				(class528_sub21_sub9_sub1, (long) i);
		    }
		} else if (!((Class460_Sub1) this).aClass454_10154
				.method5463(-486502254)) {
		    Class528_Sub21_Sub9_Sub3 class528_sub21_sub9_sub3
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (4771823 * ((Class460_Sub1) this).anInt10173, i,
			    (byte) 2, true, -1143226424));
		    ((Class460_Sub1) this).aClass692_10151
			.method8142(class528_sub21_sub9_sub3, (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2]
	    = (byte) ((((Class438) ((Class460_Sub1) this).aClass438_10171)
		       .anIntArray4875[i])
		      >>> 8);
	is[is.length - 1]
	    = (byte) (((Class438) ((Class460_Sub1) this).aClass438_10171)
		      .anIntArray4875[i]);
	if (((Class460_Sub1) this).aClass539_10157 != null) {
	    ((Class460_Sub1) this).aClass455_10168.method5503
		(i, is, ((Class460_Sub1) this).aClass539_10157,
		 (short) -32644);
	    if (1 != ((Class460_Sub1) this).aByteArray10161[i]) {
		((Class460_Sub1) this).anInt10162 += 1383201269;
		((Class460_Sub1) this).aByteArray10161[i] = (byte) 1;
	    }
	}
	if (!((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11577)
	    class528_sub21_sub9.method6443(-883495298);
	return class528_sub21_sub9;
    }
    
    public void method9193(int i) {
	if (null == ((Class460_Sub1) this).aClass449_10149
	    && ((Class460_Sub1) this).aClass539_10157 != null) {
	    ((Class460_Sub1) this).aBool10150 = true;
	    ((Class460_Sub1) this).aBool10165 = true;
	    if (null == ((Class460_Sub1) this).aClass688_10167)
		((Class460_Sub1) this).aClass688_10167 = new Class688();
	}
    }
    
    void method5573(int i, byte i_20_) {
	if (((Class460_Sub1) this).aClass539_10157 != null) {
	    for (Node node = ((Class460_Sub1) this).aClass688_10147
					 .method8034(1910450875);
		 node != null;
		 node = ((Class460_Sub1) this).aClass688_10147
				.method8037(-342066109)) {
		if (node.aLong7107 * -4849232331708333273L == (long) i)
		    return;
	    }
	    Node node = new Node();
	    node.aLong7107 = (long) i * -9171965245836510057L;
	    ((Class460_Sub1) this).aClass688_10147.method8031(node,
							      (byte) 47);
	}
    }
    
    int method5578(int i, int i_21_) {
	Class528_Sub21_Sub9 class528_sub21_sub9
	    = ((Class528_Sub21_Sub9)
	       ((Class460_Sub1) this).aClass692_10151.method8137((long) i));
	if (null != class528_sub21_sub9)
	    return class528_sub21_sub9.method10546(-128791925);
	return 0;
    }
    
    public int method9194(int i) {
	if (null == ((Class460_Sub1) this).aClass438_10171)
	    return 0;
	if (!((Class460_Sub1) this).aBool10166)
	    return ((((Class438) ((Class460_Sub1) this).aClass438_10171)
		     .anInt4887)
		    * -1319948689);
	Node node
	    = ((Class460_Sub1) this).aClass688_10167.method8034(1963900674);
	if (node == null)
	    return 0;
	return (int) (-4849232331708333273L * node.aLong7107);
    }
    
    boolean method9195() {
	return null != ((Class460_Sub1) this).aClass449_10149;
    }
    
    boolean method9196(short i) {
	return null != ((Class460_Sub1) this).aClass449_10149;
    }
    
    public int method9197() {
	return 662579805 * ((Class460_Sub1) this).anInt10162;
    }
    
    Class438 method5576() {
	if (((Class460_Sub1) this).aClass438_10171 != null)
	    return ((Class460_Sub1) this).aClass438_10171;
	if (null == ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153) {
	    if (((Class460_Sub1) this).aClass454_10154.method5463(-486502254))
		return null;
	    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
		= (((Class460_Sub1) this).aClass454_10154.method5461
		   (255, ((Class460_Sub1) this).anInt10173 * 4771823, (byte) 0,
		    true, -1968898172));
	}
	if (((Class528_Sub21_Sub9)
	     ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153)
	    .aBool11576)
	    return null;
	byte[] is = ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			.method10545(-1469197700);
	if (((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
	    instanceof Class528_Sub21_Sub9_Sub2) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		((Class460_Sub1) this).aClass438_10171
		    = new Class438(is,
				   (-1608436587
				    * ((Class460_Sub1) this).anInt10164),
				   ((Class460_Sub1) this).aByteArray10155);
		if (((Class460_Sub1) this).anInt10156 * -585910225
		    != (((Class438) ((Class460_Sub1) this).aClass438_10171)
			.anInt4873) * 2036154075)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		((Class460_Sub1) this).aClass438_10171 = null;
		if (((Class460_Sub1) this).aClass454_10154
			.method5463(-486502254))
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
		else
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			    (byte) 0, true, 664762635));
		return null;
	    }
	} else {
	    try {
		if (null == is)
		    throw new RuntimeException();
		((Class460_Sub1) this).aClass438_10171
		    = new Class438(is,
				   (-1608436587
				    * ((Class460_Sub1) this).anInt10164),
				   ((Class460_Sub1) this).aByteArray10155);
	    } catch (RuntimeException runtimeexception) {
		((Class460_Sub1) this).aClass454_10154.method5466
		    (255, ((Class460_Sub1) this).anInt10173 * 4771823,
		     (byte) 1);
		((Class460_Sub1) this).aClass438_10171 = null;
		if (((Class460_Sub1) this).aClass454_10154
			.method5463(-486502254))
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
		else
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			    (byte) 0, true, 243668919));
		return null;
	    }
	    if (((Class460_Sub1) this).aClass539_10152 != null)
		((Class460_Sub1) this).aClass455_10168.method5503
		    (((Class460_Sub1) this).anInt10173 * 4771823, is,
		     ((Class460_Sub1) this).aClass539_10152, (short) -1685);
	}
	((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
	if (((Class460_Sub1) this).aClass539_10157 != null) {
	    ((Class460_Sub1) this).aByteArray10161
		= new byte[-311250737 * (((Class438) (((Class460_Sub1) this)
						      .aClass438_10171))
					 .anInt4881)];
	    ((Class460_Sub1) this).anInt10162 = 0;
	}
	return ((Class460_Sub1) this).aClass438_10171;
    }
    
    Class438 method5583() {
	if (((Class460_Sub1) this).aClass438_10171 != null)
	    return ((Class460_Sub1) this).aClass438_10171;
	if (null == ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153) {
	    if (((Class460_Sub1) this).aClass454_10154.method5463(-486502254))
		return null;
	    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
		= (((Class460_Sub1) this).aClass454_10154.method5461
		   (255, ((Class460_Sub1) this).anInt10173 * 4771823, (byte) 0,
		    true, -147632273));
	}
	if (((Class528_Sub21_Sub9)
	     ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153)
	    .aBool11576)
	    return null;
	byte[] is = ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			.method10545(172457023);
	if (((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
	    instanceof Class528_Sub21_Sub9_Sub2) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		((Class460_Sub1) this).aClass438_10171
		    = new Class438(is,
				   (-1608436587
				    * ((Class460_Sub1) this).anInt10164),
				   ((Class460_Sub1) this).aByteArray10155);
		if (((Class460_Sub1) this).anInt10156 * -585910225
		    != (((Class438) ((Class460_Sub1) this).aClass438_10171)
			.anInt4873) * 2036154075)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		((Class460_Sub1) this).aClass438_10171 = null;
		if (((Class460_Sub1) this).aClass454_10154
			.method5463(-486502254))
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
		else
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			    (byte) 0, true, -1556838207));
		return null;
	    }
	} else {
	    try {
		if (null == is)
		    throw new RuntimeException();
		((Class460_Sub1) this).aClass438_10171
		    = new Class438(is,
				   (-1608436587
				    * ((Class460_Sub1) this).anInt10164),
				   ((Class460_Sub1) this).aByteArray10155);
	    } catch (RuntimeException runtimeexception) {
		((Class460_Sub1) this).aClass454_10154.method5466
		    (255, ((Class460_Sub1) this).anInt10173 * 4771823,
		     (byte) 1);
		((Class460_Sub1) this).aClass438_10171 = null;
		if (((Class460_Sub1) this).aClass454_10154
			.method5463(-486502254))
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
		else
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			    (byte) 0, true, -1212552820));
		return null;
	    }
	    if (((Class460_Sub1) this).aClass539_10152 != null)
		((Class460_Sub1) this).aClass455_10168.method5503
		    (((Class460_Sub1) this).anInt10173 * 4771823, is,
		     ((Class460_Sub1) this).aClass539_10152, (short) -12257);
	}
	((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
	if (((Class460_Sub1) this).aClass539_10157 != null) {
	    ((Class460_Sub1) this).aByteArray10161
		= new byte[-311250737 * (((Class438) (((Class460_Sub1) this)
						      .aClass438_10171))
					 .anInt4881)];
	    ((Class460_Sub1) this).anInt10162 = 0;
	}
	return ((Class460_Sub1) this).aClass438_10171;
    }
    
    void method9198() {
	if (((Class460_Sub1) this).aClass688_10167 != null) {
	    if (method5571(-1134425531) == null)
		return;
	    if (((Class460_Sub1) this).aBool10166) {
		boolean bool = true;
		for (Node node = ((Class460_Sub1) this)
					     .aClass688_10167
					     .method8034(1303007002);
		     null != node;
		     node = ((Class460_Sub1) this).aClass688_10167
				    .method8037(1912250153)) {
		    int i = (int) (node.aLong7107 * -4849232331708333273L);
		    if (((Class460_Sub1) this).aByteArray10161[i] == 0)
			method9192(i, 1, 1737473865);
		    if (0 != ((Class460_Sub1) this).aByteArray10161[i])
			node.method6443(727028698);
		    else
			bool = false;
		}
		while (((Class460_Sub1) this).anInt10169 * 535183061
		       < (((Class438) ((Class460_Sub1) this).aClass438_10171)
			  .anIntArray4885).length) {
		    if (0
			== (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anIntArray4885
			    [((Class460_Sub1) this).anInt10169 * 535183061]))
			((Class460_Sub1) this).anInt10169 += -81589635;
		    else {
			if (-1226496401 * (((Class455) (((Class460_Sub1) this)
							.aClass455_10168))
					   .anInt5001)
			    >= 250) {
			    bool = false;
			    break;
			}
			if ((((Class460_Sub1) this).aByteArray10161
			     [535183061 * ((Class460_Sub1) this).anInt10169])
			    == 0)
			    method9192((((Class460_Sub1) this).anInt10169
					* 535183061),
				       1, 147825269);
			if (0 == (((Class460_Sub1) this).aByteArray10161
				  [(535183061
				    * ((Class460_Sub1) this).anInt10169)])) {
			    Node node = new Node();
			    node.aLong7107
				= (7036118098110217123L
				   * (long) ((Class460_Sub1) this).anInt10169);
			    ((Class460_Sub1) this).aClass688_10167
				.method8031(node, (byte) -74);
			    bool = false;
			}
			((Class460_Sub1) this).anInt10169 += -81589635;
		    }
		}
		if (bool) {
		    ((Class460_Sub1) this).aBool10166 = false;
		    ((Class460_Sub1) this).anInt10169 = 0;
		}
	    } else if (((Class460_Sub1) this).aBool10150) {
		boolean bool = true;
		for (Node node = ((Class460_Sub1) this)
					     .aClass688_10167
					     .method8034(1610819469);
		     node != null;
		     node = ((Class460_Sub1) this).aClass688_10167
				    .method8037(1776753552)) {
		    int i = (int) (-4849232331708333273L * node.aLong7107);
		    if (1 != ((Class460_Sub1) this).aByteArray10161[i])
			method9192(i, 2, 997273270);
		    if (1 == ((Class460_Sub1) this).aByteArray10161[i])
			node.method6443(-1710396955);
		    else
			bool = false;
		}
		while (535183061 * ((Class460_Sub1) this).anInt10169
		       < (((Class438) ((Class460_Sub1) this).aClass438_10171)
			  .anIntArray4885).length) {
		    if (0
			== (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anIntArray4885
			    [((Class460_Sub1) this).anInt10169 * 535183061]))
			((Class460_Sub1) this).anInt10169 += -81589635;
		    else {
			if (((Class460_Sub1) this).aClass454_10154
				.method5462(1219233696)) {
			    bool = false;
			    break;
			}
			if (1 != (((Class460_Sub1) this).aByteArray10161
				  [(535183061
				    * ((Class460_Sub1) this).anInt10169)]))
			    method9192((((Class460_Sub1) this).anInt10169
					* 535183061),
				       2, 1981311005);
			if ((((Class460_Sub1) this).aByteArray10161
			     [535183061 * ((Class460_Sub1) this).anInt10169])
			    != 1) {
			    Node node = new Node();
			    node.aLong7107
				= (7036118098110217123L
				   * (long) ((Class460_Sub1) this).anInt10169);
			    ((Class460_Sub1) this).aClass688_10167
				.method8031(node, (byte) 57);
			    bool = false;
			}
			((Class460_Sub1) this).anInt10169 += -81589635;
		    }
		}
		if (bool) {
		    ((Class460_Sub1) this).aBool10150 = false;
		    ((Class460_Sub1) this).anInt10169 = 0;
		}
	    } else
		((Class460_Sub1) this).aClass688_10167 = null;
	}
	if (((Class460_Sub1) this).aBool10148
	    && (Class249.method3417(2108593549)
		>= -436416584991249471L * ((Class460_Sub1) this).aLong10163)) {
	    for (Class528_Sub21_Sub9 class528_sub21_sub9
		     = (Class528_Sub21_Sub9) ((Class460_Sub1) this)
						 .aClass692_10151
						 .method8146(-1942855841);
		 class528_sub21_sub9 != null;
		 class528_sub21_sub9
		     = (Class528_Sub21_Sub9) ((Class460_Sub1) this)
						 .aClass692_10151
						 .method8138(-1553631005)) {
		if (!((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11576) {
		    if (((Class528_Sub21_Sub9) class528_sub21_sub9)
			.aBool11575) {
			if (!((Class528_Sub21_Sub9) class528_sub21_sub9)
			     .aBool11577)
			    throw new RuntimeException();
			class528_sub21_sub9.method6443(2085857621);
		    } else
			((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11575
			    = true;
		}
	    }
	    ((Class460_Sub1) this).aLong10163
		= ((Class249.method3417(2120518066) + 1000L)
		   * 5578550170659595329L);
	}
    }
    
    void method5579(int i) {
	if (((Class460_Sub1) this).aClass539_10157 != null) {
	    for (Node node = ((Class460_Sub1) this).aClass688_10147
					 .method8034(1911602976);
		 node != null;
		 node = ((Class460_Sub1) this).aClass688_10147
				.method8037(-72335952)) {
		if (node.aLong7107 * -4849232331708333273L == (long) i)
		    return;
	    }
	    Node node = new Node();
	    node.aLong7107 = (long) i * -9171965245836510057L;
	    ((Class460_Sub1) this).aClass688_10147.method8031(node,
							      (byte) -70);
	}
    }
    
    Class438 method5570() {
	if (((Class460_Sub1) this).aClass438_10171 != null)
	    return ((Class460_Sub1) this).aClass438_10171;
	if (null == ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153) {
	    if (((Class460_Sub1) this).aClass454_10154.method5463(-486502254))
		return null;
	    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
		= (((Class460_Sub1) this).aClass454_10154.method5461
		   (255, ((Class460_Sub1) this).anInt10173 * 4771823, (byte) 0,
		    true, -1117532983));
	}
	if (((Class528_Sub21_Sub9)
	     ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153)
	    .aBool11576)
	    return null;
	byte[] is = ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			.method10545(-1842016782);
	if (((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
	    instanceof Class528_Sub21_Sub9_Sub2) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		((Class460_Sub1) this).aClass438_10171
		    = new Class438(is,
				   (-1608436587
				    * ((Class460_Sub1) this).anInt10164),
				   ((Class460_Sub1) this).aByteArray10155);
		if (((Class460_Sub1) this).anInt10156 * -585910225
		    != (((Class438) ((Class460_Sub1) this).aClass438_10171)
			.anInt4873) * 2036154075)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		((Class460_Sub1) this).aClass438_10171 = null;
		if (((Class460_Sub1) this).aClass454_10154
			.method5463(-486502254))
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
		else
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			    (byte) 0, true, 217463022));
		return null;
	    }
	} else {
	    try {
		if (null == is)
		    throw new RuntimeException();
		((Class460_Sub1) this).aClass438_10171
		    = new Class438(is,
				   (-1608436587
				    * ((Class460_Sub1) this).anInt10164),
				   ((Class460_Sub1) this).aByteArray10155);
	    } catch (RuntimeException runtimeexception) {
		((Class460_Sub1) this).aClass454_10154.method5466
		    (255, ((Class460_Sub1) this).anInt10173 * 4771823,
		     (byte) 1);
		((Class460_Sub1) this).aClass438_10171 = null;
		if (((Class460_Sub1) this).aClass454_10154
			.method5463(-486502254))
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
		else
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			    (byte) 0, true, -791534815));
		return null;
	    }
	    if (((Class460_Sub1) this).aClass539_10152 != null)
		((Class460_Sub1) this).aClass455_10168.method5503
		    (((Class460_Sub1) this).anInt10173 * 4771823, is,
		     ((Class460_Sub1) this).aClass539_10152, (short) -13141);
	}
	((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
	if (((Class460_Sub1) this).aClass539_10157 != null) {
	    ((Class460_Sub1) this).aByteArray10161
		= new byte[-311250737 * (((Class438) (((Class460_Sub1) this)
						      .aClass438_10171))
					 .anInt4881)];
	    ((Class460_Sub1) this).anInt10162 = 0;
	}
	return ((Class460_Sub1) this).aClass438_10171;
    }
    
    int method5581(int i) {
	Class528_Sub21_Sub9 class528_sub21_sub9
	    = ((Class528_Sub21_Sub9)
	       ((Class460_Sub1) this).aClass692_10151.method8137((long) i));
	if (null != class528_sub21_sub9)
	    return class528_sub21_sub9.method10546(-35853786);
	return 0;
    }
    
    public int method9199() {
	if (((Class460_Sub1) this).aClass438_10171 == null)
	    return 0;
	return (-1319948689
		* (((Class438) ((Class460_Sub1) this).aClass438_10171)
		   .anInt4887));
    }
    
    public int method9200() {
	if (method5571(1859545462) == null) {
	    if (null == ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153)
		return 0;
	    return ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
		       .method10546(-740444276);
	}
	return 100;
    }
    
    int method5582(int i) {
	Class528_Sub21_Sub9 class528_sub21_sub9
	    = ((Class528_Sub21_Sub9)
	       ((Class460_Sub1) this).aClass692_10151.method8137((long) i));
	if (null != class528_sub21_sub9)
	    return class528_sub21_sub9.method10546(-1411379211);
	return 0;
    }
    
    public void method9201() {
	if (null == ((Class460_Sub1) this).aClass449_10149
	    && ((Class460_Sub1) this).aClass539_10157 != null) {
	    ((Class460_Sub1) this).aBool10150 = true;
	    ((Class460_Sub1) this).aBool10165 = true;
	    if (null == ((Class460_Sub1) this).aClass688_10167)
		((Class460_Sub1) this).aClass688_10167 = new Class688();
	}
    }
    
    public int method9202() {
	return 662579805 * ((Class460_Sub1) this).anInt10162;
    }
    
    void method9203(boolean bool, int i) {
	((Class460_Sub1) this).aClass449_10149.method5413(bool, 1648572743);
    }
    
    void method9204() {
	if (((Class460_Sub1) this).aClass688_10167 != null
	    && method5571(-827383562) != null) {
	    for (Node node = ((Class460_Sub1) this).aClass688_10147
					 .method8034(1465967691);
		 node != null;
		 node = ((Class460_Sub1) this).aClass688_10147
				.method8037(-1012215378)) {
		int i = (int) (node.aLong7107 * -4849232331708333273L);
		if (i < 0
		    || (i
			>= (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anInt4881) * -311250737)
		    || (((Class438) ((Class460_Sub1) this).aClass438_10171)
			.anIntArray4885[i]) == 0)
		    node.method6443(-553528010);
		else {
		    if (0 == ((Class460_Sub1) this).aByteArray10161[i])
			method9192(i, 1, 1179639840);
		    if (((Class460_Sub1) this).aByteArray10161[i] == -1)
			method9192(i, 2, 1970555194);
		    if (((Class460_Sub1) this).aByteArray10161[i] == 1)
			node.method6443(961828679);
		}
	    }
	}
    }
    
    void method9205() {
	if (((Class460_Sub1) this).aClass688_10167 != null) {
	    if (method5571(553999408) == null)
		return;
	    if (((Class460_Sub1) this).aBool10166) {
		boolean bool = true;
		for (Node node = ((Class460_Sub1) this)
					     .aClass688_10167
					     .method8034(2024986344);
		     null != node;
		     node = ((Class460_Sub1) this).aClass688_10167
				    .method8037(-603868942)) {
		    int i = (int) (node.aLong7107 * -4849232331708333273L);
		    if (((Class460_Sub1) this).aByteArray10161[i] == 0)
			method9192(i, 1, 1149229187);
		    if (0 != ((Class460_Sub1) this).aByteArray10161[i])
			node.method6443(1100652823);
		    else
			bool = false;
		}
		while (((Class460_Sub1) this).anInt10169 * 535183061
		       < (((Class438) ((Class460_Sub1) this).aClass438_10171)
			  .anIntArray4885).length) {
		    if (0
			== (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anIntArray4885
			    [((Class460_Sub1) this).anInt10169 * 535183061]))
			((Class460_Sub1) this).anInt10169 += -81589635;
		    else {
			if (-1226496401 * (((Class455) (((Class460_Sub1) this)
							.aClass455_10168))
					   .anInt5001)
			    >= 250) {
			    bool = false;
			    break;
			}
			if ((((Class460_Sub1) this).aByteArray10161
			     [535183061 * ((Class460_Sub1) this).anInt10169])
			    == 0)
			    method9192((((Class460_Sub1) this).anInt10169
					* 535183061),
				       1, 725479004);
			if (0 == (((Class460_Sub1) this).aByteArray10161
				  [(535183061
				    * ((Class460_Sub1) this).anInt10169)])) {
			    Node node = new Node();
			    node.aLong7107
				= (7036118098110217123L
				   * (long) ((Class460_Sub1) this).anInt10169);
			    ((Class460_Sub1) this).aClass688_10167
				.method8031(node, (byte) 105);
			    bool = false;
			}
			((Class460_Sub1) this).anInt10169 += -81589635;
		    }
		}
		if (bool) {
		    ((Class460_Sub1) this).aBool10166 = false;
		    ((Class460_Sub1) this).anInt10169 = 0;
		}
	    } else if (((Class460_Sub1) this).aBool10150) {
		boolean bool = true;
		for (Node node = ((Class460_Sub1) this)
					     .aClass688_10167
					     .method8034(1451956313);
		     node != null;
		     node = ((Class460_Sub1) this).aClass688_10167
				    .method8037(-308111121)) {
		    int i = (int) (-4849232331708333273L * node.aLong7107);
		    if (1 != ((Class460_Sub1) this).aByteArray10161[i])
			method9192(i, 2, 891077516);
		    if (1 == ((Class460_Sub1) this).aByteArray10161[i])
			node.method6443(742904739);
		    else
			bool = false;
		}
		while (535183061 * ((Class460_Sub1) this).anInt10169
		       < (((Class438) ((Class460_Sub1) this).aClass438_10171)
			  .anIntArray4885).length) {
		    if (0
			== (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anIntArray4885
			    [((Class460_Sub1) this).anInt10169 * 535183061]))
			((Class460_Sub1) this).anInt10169 += -81589635;
		    else {
			if (((Class460_Sub1) this).aClass454_10154
				.method5462(1219233696)) {
			    bool = false;
			    break;
			}
			if (1 != (((Class460_Sub1) this).aByteArray10161
				  [(535183061
				    * ((Class460_Sub1) this).anInt10169)]))
			    method9192((((Class460_Sub1) this).anInt10169
					* 535183061),
				       2, 1505175216);
			if ((((Class460_Sub1) this).aByteArray10161
			     [535183061 * ((Class460_Sub1) this).anInt10169])
			    != 1) {
			    Node node = new Node();
			    node.aLong7107
				= (7036118098110217123L
				   * (long) ((Class460_Sub1) this).anInt10169);
			    ((Class460_Sub1) this).aClass688_10167
				.method8031(node, (byte) -117);
			    bool = false;
			}
			((Class460_Sub1) this).anInt10169 += -81589635;
		    }
		}
		if (bool) {
		    ((Class460_Sub1) this).aBool10150 = false;
		    ((Class460_Sub1) this).anInt10169 = 0;
		}
	    } else
		((Class460_Sub1) this).aClass688_10167 = null;
	}
	if (((Class460_Sub1) this).aBool10148
	    && (Class249.method3417(2003918468)
		>= -436416584991249471L * ((Class460_Sub1) this).aLong10163)) {
	    for (Class528_Sub21_Sub9 class528_sub21_sub9
		     = (Class528_Sub21_Sub9) ((Class460_Sub1) this)
						 .aClass692_10151
						 .method8146(-1942855841);
		 class528_sub21_sub9 != null;
		 class528_sub21_sub9
		     = (Class528_Sub21_Sub9) ((Class460_Sub1) this)
						 .aClass692_10151
						 .method8138(984279636)) {
		if (!((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11576) {
		    if (((Class528_Sub21_Sub9) class528_sub21_sub9)
			.aBool11575) {
			if (!((Class528_Sub21_Sub9) class528_sub21_sub9)
			     .aBool11577)
			    throw new RuntimeException();
			class528_sub21_sub9.method6443(-1877017567);
		    } else
			((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11575
			    = true;
		}
	    }
	    ((Class460_Sub1) this).aLong10163
		= ((Class249.method3417(2120418345) + 1000L)
		   * 5578550170659595329L);
	}
    }
    
    void method9206() {
	if (((Class460_Sub1) this).aClass688_10167 != null) {
	    if (method5571(1184375986) == null)
		return;
	    if (((Class460_Sub1) this).aBool10166) {
		boolean bool = true;
		for (Node node = ((Class460_Sub1) this)
					     .aClass688_10167
					     .method8034(875791025);
		     null != node;
		     node = ((Class460_Sub1) this).aClass688_10167
				    .method8037(-1028956081)) {
		    int i = (int) (node.aLong7107 * -4849232331708333273L);
		    if (((Class460_Sub1) this).aByteArray10161[i] == 0)
			method9192(i, 1, 668098930);
		    if (0 != ((Class460_Sub1) this).aByteArray10161[i])
			node.method6443(934511025);
		    else
			bool = false;
		}
		while (((Class460_Sub1) this).anInt10169 * 535183061
		       < (((Class438) ((Class460_Sub1) this).aClass438_10171)
			  .anIntArray4885).length) {
		    if (0
			== (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anIntArray4885
			    [((Class460_Sub1) this).anInt10169 * 535183061]))
			((Class460_Sub1) this).anInt10169 += -81589635;
		    else {
			if (-1226496401 * (((Class455) (((Class460_Sub1) this)
							.aClass455_10168))
					   .anInt5001)
			    >= 250) {
			    bool = false;
			    break;
			}
			if ((((Class460_Sub1) this).aByteArray10161
			     [535183061 * ((Class460_Sub1) this).anInt10169])
			    == 0)
			    method9192((((Class460_Sub1) this).anInt10169
					* 535183061),
				       1, 874965303);
			if (0 == (((Class460_Sub1) this).aByteArray10161
				  [(535183061
				    * ((Class460_Sub1) this).anInt10169)])) {
			    Node node = new Node();
			    node.aLong7107
				= (7036118098110217123L
				   * (long) ((Class460_Sub1) this).anInt10169);
			    ((Class460_Sub1) this).aClass688_10167
				.method8031(node, (byte) -12);
			    bool = false;
			}
			((Class460_Sub1) this).anInt10169 += -81589635;
		    }
		}
		if (bool) {
		    ((Class460_Sub1) this).aBool10166 = false;
		    ((Class460_Sub1) this).anInt10169 = 0;
		}
	    } else if (((Class460_Sub1) this).aBool10150) {
		boolean bool = true;
		for (Node node = ((Class460_Sub1) this)
					     .aClass688_10167
					     .method8034(1584390927);
		     node != null;
		     node = ((Class460_Sub1) this).aClass688_10167
				    .method8037(-1043447792)) {
		    int i = (int) (-4849232331708333273L * node.aLong7107);
		    if (1 != ((Class460_Sub1) this).aByteArray10161[i])
			method9192(i, 2, 1188628860);
		    if (1 == ((Class460_Sub1) this).aByteArray10161[i])
			node.method6443(-619803960);
		    else
			bool = false;
		}
		while (535183061 * ((Class460_Sub1) this).anInt10169
		       < (((Class438) ((Class460_Sub1) this).aClass438_10171)
			  .anIntArray4885).length) {
		    if (0
			== (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anIntArray4885
			    [((Class460_Sub1) this).anInt10169 * 535183061]))
			((Class460_Sub1) this).anInt10169 += -81589635;
		    else {
			if (((Class460_Sub1) this).aClass454_10154
				.method5462(1219233696)) {
			    bool = false;
			    break;
			}
			if (1 != (((Class460_Sub1) this).aByteArray10161
				  [(535183061
				    * ((Class460_Sub1) this).anInt10169)]))
			    method9192((((Class460_Sub1) this).anInt10169
					* 535183061),
				       2, 1445668192);
			if ((((Class460_Sub1) this).aByteArray10161
			     [535183061 * ((Class460_Sub1) this).anInt10169])
			    != 1) {
			    Node node = new Node();
			    node.aLong7107
				= (7036118098110217123L
				   * (long) ((Class460_Sub1) this).anInt10169);
			    ((Class460_Sub1) this).aClass688_10167
				.method8031(node, (byte) 102);
			    bool = false;
			}
			((Class460_Sub1) this).anInt10169 += -81589635;
		    }
		}
		if (bool) {
		    ((Class460_Sub1) this).aBool10150 = false;
		    ((Class460_Sub1) this).anInt10169 = 0;
		}
	    } else
		((Class460_Sub1) this).aClass688_10167 = null;
	}
	if (((Class460_Sub1) this).aBool10148
	    && (Class249.method3417(1985977541)
		>= -436416584991249471L * ((Class460_Sub1) this).aLong10163)) {
	    for (Class528_Sub21_Sub9 class528_sub21_sub9
		     = (Class528_Sub21_Sub9) ((Class460_Sub1) this)
						 .aClass692_10151
						 .method8146(-1942855841);
		 class528_sub21_sub9 != null;
		 class528_sub21_sub9
		     = (Class528_Sub21_Sub9) ((Class460_Sub1) this)
						 .aClass692_10151
						 .method8138(942084590)) {
		if (!((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11576) {
		    if (((Class528_Sub21_Sub9) class528_sub21_sub9)
			.aBool11575) {
			if (!((Class528_Sub21_Sub9) class528_sub21_sub9)
			     .aBool11577)
			    throw new RuntimeException();
			class528_sub21_sub9.method6443(-2119413592);
		    } else
			((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11575
			    = true;
		}
	    }
	    ((Class460_Sub1) this).aLong10163
		= ((Class249.method3417(1906831684) + 1000L)
		   * 5578550170659595329L);
	}
    }
    
    byte[] method5572(int i, byte i_22_) {
	Class528_Sub21_Sub9 class528_sub21_sub9 = method9192(i, 0, 1759220664);
	if (class528_sub21_sub9 == null)
	    return null;
	byte[] is = class528_sub21_sub9.method10545(-1812445938);
	class528_sub21_sub9.method6443(1855424647);
	return is;
    }
    
    void method9207() {
	if (((Class460_Sub1) this).aClass688_10167 != null) {
	    if (method5571(867799998) == null)
		return;
	    if (((Class460_Sub1) this).aBool10166) {
		boolean bool = true;
		for (Node node = ((Class460_Sub1) this)
					     .aClass688_10167
					     .method8034(1616479169);
		     null != node;
		     node = ((Class460_Sub1) this).aClass688_10167
				    .method8037(-1261922027)) {
		    int i = (int) (node.aLong7107 * -4849232331708333273L);
		    if (((Class460_Sub1) this).aByteArray10161[i] == 0)
			method9192(i, 1, 1549827472);
		    if (0 != ((Class460_Sub1) this).aByteArray10161[i])
			node.method6443(-674525641);
		    else
			bool = false;
		}
		while (((Class460_Sub1) this).anInt10169 * 535183061
		       < (((Class438) ((Class460_Sub1) this).aClass438_10171)
			  .anIntArray4885).length) {
		    if (0
			== (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anIntArray4885
			    [((Class460_Sub1) this).anInt10169 * 535183061]))
			((Class460_Sub1) this).anInt10169 += -81589635;
		    else {
			if (-1226496401 * (((Class455) (((Class460_Sub1) this)
							.aClass455_10168))
					   .anInt5001)
			    >= 250) {
			    bool = false;
			    break;
			}
			if ((((Class460_Sub1) this).aByteArray10161
			     [535183061 * ((Class460_Sub1) this).anInt10169])
			    == 0)
			    method9192((((Class460_Sub1) this).anInt10169
					* 535183061),
				       1, 688026275);
			if (0 == (((Class460_Sub1) this).aByteArray10161
				  [(535183061
				    * ((Class460_Sub1) this).anInt10169)])) {
			    Node node = new Node();
			    node.aLong7107
				= (7036118098110217123L
				   * (long) ((Class460_Sub1) this).anInt10169);
			    ((Class460_Sub1) this).aClass688_10167
				.method8031(node, (byte) -60);
			    bool = false;
			}
			((Class460_Sub1) this).anInt10169 += -81589635;
		    }
		}
		if (bool) {
		    ((Class460_Sub1) this).aBool10166 = false;
		    ((Class460_Sub1) this).anInt10169 = 0;
		}
	    } else if (((Class460_Sub1) this).aBool10150) {
		boolean bool = true;
		for (Node node = ((Class460_Sub1) this)
					     .aClass688_10167
					     .method8034(1487821302);
		     node != null;
		     node = ((Class460_Sub1) this).aClass688_10167
				    .method8037(-370197787)) {
		    int i = (int) (-4849232331708333273L * node.aLong7107);
		    if (1 != ((Class460_Sub1) this).aByteArray10161[i])
			method9192(i, 2, 130167357);
		    if (1 == ((Class460_Sub1) this).aByteArray10161[i])
			node.method6443(-2102260175);
		    else
			bool = false;
		}
		while (535183061 * ((Class460_Sub1) this).anInt10169
		       < (((Class438) ((Class460_Sub1) this).aClass438_10171)
			  .anIntArray4885).length) {
		    if (0
			== (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anIntArray4885
			    [((Class460_Sub1) this).anInt10169 * 535183061]))
			((Class460_Sub1) this).anInt10169 += -81589635;
		    else {
			if (((Class460_Sub1) this).aClass454_10154
				.method5462(1219233696)) {
			    bool = false;
			    break;
			}
			if (1 != (((Class460_Sub1) this).aByteArray10161
				  [(535183061
				    * ((Class460_Sub1) this).anInt10169)]))
			    method9192((((Class460_Sub1) this).anInt10169
					* 535183061),
				       2, 1571020164);
			if ((((Class460_Sub1) this).aByteArray10161
			     [535183061 * ((Class460_Sub1) this).anInt10169])
			    != 1) {
			    Node node = new Node();
			    node.aLong7107
				= (7036118098110217123L
				   * (long) ((Class460_Sub1) this).anInt10169);
			    ((Class460_Sub1) this).aClass688_10167
				.method8031(node, (byte) -75);
			    bool = false;
			}
			((Class460_Sub1) this).anInt10169 += -81589635;
		    }
		}
		if (bool) {
		    ((Class460_Sub1) this).aBool10150 = false;
		    ((Class460_Sub1) this).anInt10169 = 0;
		}
	    } else
		((Class460_Sub1) this).aClass688_10167 = null;
	}
	if (((Class460_Sub1) this).aBool10148
	    && (Class249.method3417(2115062119)
		>= -436416584991249471L * ((Class460_Sub1) this).aLong10163)) {
	    for (Class528_Sub21_Sub9 class528_sub21_sub9
		     = (Class528_Sub21_Sub9) ((Class460_Sub1) this)
						 .aClass692_10151
						 .method8146(-1942855841);
		 class528_sub21_sub9 != null;
		 class528_sub21_sub9
		     = (Class528_Sub21_Sub9) ((Class460_Sub1) this)
						 .aClass692_10151
						 .method8138(-5924394)) {
		if (!((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11576) {
		    if (((Class528_Sub21_Sub9) class528_sub21_sub9)
			.aBool11575) {
			if (!((Class528_Sub21_Sub9) class528_sub21_sub9)
			     .aBool11577)
			    throw new RuntimeException();
			class528_sub21_sub9.method6443(-1260455879);
		    } else
			((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11575
			    = true;
		}
	    }
	    ((Class460_Sub1) this).aLong10163
		= ((Class249.method3417(2069659187) + 1000L)
		   * 5578550170659595329L);
	}
    }
    
    public int method9208() {
	if (((Class460_Sub1) this).aClass438_10171 == null)
	    return 0;
	return (-1319948689
		* (((Class438) ((Class460_Sub1) this).aClass438_10171)
		   .anInt4887));
    }
    
    public int method9209() {
	return 662579805 * ((Class460_Sub1) this).anInt10162;
    }
    
    void method9210(short i) {
	if (((Class460_Sub1) this).aClass688_10167 != null) {
	    if (method5571(-485888939) == null)
		return;
	    if (((Class460_Sub1) this).aBool10166) {
		boolean bool = true;
		for (Node node = ((Class460_Sub1) this)
					     .aClass688_10167
					     .method8034(720844219);
		     null != node;
		     node = ((Class460_Sub1) this).aClass688_10167
				    .method8037(604771153)) {
		    int i_23_
			= (int) (node.aLong7107 * -4849232331708333273L);
		    if (((Class460_Sub1) this).aByteArray10161[i_23_] == 0)
			method9192(i_23_, 1, 2132383204);
		    if (0 != ((Class460_Sub1) this).aByteArray10161[i_23_])
			node.method6443(-60360186);
		    else
			bool = false;
		}
		while (((Class460_Sub1) this).anInt10169 * 535183061
		       < (((Class438) ((Class460_Sub1) this).aClass438_10171)
			  .anIntArray4885).length) {
		    if (0
			== (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anIntArray4885
			    [((Class460_Sub1) this).anInt10169 * 535183061]))
			((Class460_Sub1) this).anInt10169 += -81589635;
		    else {
			if (-1226496401 * (((Class455) (((Class460_Sub1) this)
							.aClass455_10168))
					   .anInt5001)
			    >= 250) {
			    bool = false;
			    break;
			}
			if ((((Class460_Sub1) this).aByteArray10161
			     [535183061 * ((Class460_Sub1) this).anInt10169])
			    == 0)
			    method9192((((Class460_Sub1) this).anInt10169
					* 535183061),
				       1, 275850753);
			if (0 == (((Class460_Sub1) this).aByteArray10161
				  [(535183061
				    * ((Class460_Sub1) this).anInt10169)])) {
			    Node node = new Node();
			    node.aLong7107
				= (7036118098110217123L
				   * (long) ((Class460_Sub1) this).anInt10169);
			    ((Class460_Sub1) this).aClass688_10167
				.method8031(node, (byte) -82);
			    bool = false;
			}
			((Class460_Sub1) this).anInt10169 += -81589635;
		    }
		}
		if (bool) {
		    ((Class460_Sub1) this).aBool10166 = false;
		    ((Class460_Sub1) this).anInt10169 = 0;
		}
	    } else if (((Class460_Sub1) this).aBool10150) {
		boolean bool = true;
		for (Node node = ((Class460_Sub1) this)
					     .aClass688_10167
					     .method8034(1349077141);
		     node != null;
		     node = ((Class460_Sub1) this).aClass688_10167
				    .method8037(1273951503)) {
		    int i_24_
			= (int) (-4849232331708333273L * node.aLong7107);
		    if (1 != ((Class460_Sub1) this).aByteArray10161[i_24_])
			method9192(i_24_, 2, 588328729);
		    if (1 == ((Class460_Sub1) this).aByteArray10161[i_24_])
			node.method6443(-1451481550);
		    else
			bool = false;
		}
		while (535183061 * ((Class460_Sub1) this).anInt10169
		       < (((Class438) ((Class460_Sub1) this).aClass438_10171)
			  .anIntArray4885).length) {
		    if (0
			== (((Class438) ((Class460_Sub1) this).aClass438_10171)
			    .anIntArray4885
			    [((Class460_Sub1) this).anInt10169 * 535183061]))
			((Class460_Sub1) this).anInt10169 += -81589635;
		    else {
			if (((Class460_Sub1) this).aClass454_10154
				.method5462(1219233696)) {
			    bool = false;
			    break;
			}
			if (1 != (((Class460_Sub1) this).aByteArray10161
				  [(535183061
				    * ((Class460_Sub1) this).anInt10169)]))
			    method9192((((Class460_Sub1) this).anInt10169
					* 535183061),
				       2, 300688553);
			if ((((Class460_Sub1) this).aByteArray10161
			     [535183061 * ((Class460_Sub1) this).anInt10169])
			    != 1) {
			    Node node = new Node();
			    node.aLong7107
				= (7036118098110217123L
				   * (long) ((Class460_Sub1) this).anInt10169);
			    ((Class460_Sub1) this).aClass688_10167
				.method8031(node, (byte) -69);
			    bool = false;
			}
			((Class460_Sub1) this).anInt10169 += -81589635;
		    }
		}
		if (bool) {
		    ((Class460_Sub1) this).aBool10150 = false;
		    ((Class460_Sub1) this).anInt10169 = 0;
		}
	    } else
		((Class460_Sub1) this).aClass688_10167 = null;
	}
	if (((Class460_Sub1) this).aBool10148
	    && (Class249.method3417(2097233775)
		>= -436416584991249471L * ((Class460_Sub1) this).aLong10163)) {
	    for (Class528_Sub21_Sub9 class528_sub21_sub9
		     = (Class528_Sub21_Sub9) ((Class460_Sub1) this)
						 .aClass692_10151
						 .method8146(-1942855841);
		 class528_sub21_sub9 != null;
		 class528_sub21_sub9
		     = (Class528_Sub21_Sub9) ((Class460_Sub1) this)
						 .aClass692_10151
						 .method8138(-2134705385)) {
		if (!((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11576) {
		    if (((Class528_Sub21_Sub9) class528_sub21_sub9)
			.aBool11575) {
			if (!((Class528_Sub21_Sub9) class528_sub21_sub9)
			     .aBool11577)
			    throw new RuntimeException();
			class528_sub21_sub9.method6443(-1167100401);
		    } else
			((Class528_Sub21_Sub9) class528_sub21_sub9).aBool11575
			    = true;
		}
	    }
	    ((Class460_Sub1) this).aLong10163
		= ((Class249.method3417(2060215051) + 1000L)
		   * 5578550170659595329L);
	}
    }
    
    Class438 method5575() {
	if (((Class460_Sub1) this).aClass438_10171 != null)
	    return ((Class460_Sub1) this).aClass438_10171;
	if (null == ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153) {
	    if (((Class460_Sub1) this).aClass454_10154.method5463(-486502254))
		return null;
	    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
		= (((Class460_Sub1) this).aClass454_10154.method5461
		   (255, ((Class460_Sub1) this).anInt10173 * 4771823, (byte) 0,
		    true, 158752957));
	}
	if (((Class528_Sub21_Sub9)
	     ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153)
	    .aBool11576)
	    return null;
	byte[] is = ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			.method10545(-79765250);
	if (((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
	    instanceof Class528_Sub21_Sub9_Sub2) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		((Class460_Sub1) this).aClass438_10171
		    = new Class438(is,
				   (-1608436587
				    * ((Class460_Sub1) this).anInt10164),
				   ((Class460_Sub1) this).aByteArray10155);
		if (((Class460_Sub1) this).anInt10156 * -585910225
		    != (((Class438) ((Class460_Sub1) this).aClass438_10171)
			.anInt4873) * 2036154075)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		((Class460_Sub1) this).aClass438_10171 = null;
		if (((Class460_Sub1) this).aClass454_10154
			.method5463(-486502254))
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
		else
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			    (byte) 0, true, 1042939207));
		return null;
	    }
	} else {
	    try {
		if (null == is)
		    throw new RuntimeException();
		((Class460_Sub1) this).aClass438_10171
		    = new Class438(is,
				   (-1608436587
				    * ((Class460_Sub1) this).anInt10164),
				   ((Class460_Sub1) this).aByteArray10155);
	    } catch (RuntimeException runtimeexception) {
		((Class460_Sub1) this).aClass454_10154.method5466
		    (255, ((Class460_Sub1) this).anInt10173 * 4771823,
		     (byte) 1);
		((Class460_Sub1) this).aClass438_10171 = null;
		if (((Class460_Sub1) this).aClass454_10154
			.method5463(-486502254))
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
		else
		    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
			= (((Class460_Sub1) this).aClass454_10154.method5461
			   (255, 4771823 * ((Class460_Sub1) this).anInt10173,
			    (byte) 0, true, -76208787));
		return null;
	    }
	    if (((Class460_Sub1) this).aClass539_10152 != null)
		((Class460_Sub1) this).aClass455_10168.method5503
		    (((Class460_Sub1) this).anInt10173 * 4771823, is,
		     ((Class460_Sub1) this).aClass539_10152, (short) -235);
	}
	((Class460_Sub1) this).aClass528_Sub21_Sub9_10153 = null;
	if (((Class460_Sub1) this).aClass539_10157 != null) {
	    ((Class460_Sub1) this).aByteArray10161
		= new byte[-311250737 * (((Class438) (((Class460_Sub1) this)
						      .aClass438_10171))
					 .anInt4881)];
	    ((Class460_Sub1) this).anInt10162 = 0;
	}
	return ((Class460_Sub1) this).aClass438_10171;
    }
    
    public int method9211() {
	return 662579805 * ((Class460_Sub1) this).anInt10162;
    }
    
    public int method9212() {
	return 662579805 * ((Class460_Sub1) this).anInt10162;
    }
    
    public void method9213() {
	if (null == ((Class460_Sub1) this).aClass449_10149
	    && ((Class460_Sub1) this).aClass539_10157 != null) {
	    ((Class460_Sub1) this).aBool10150 = true;
	    ((Class460_Sub1) this).aBool10165 = true;
	    if (null == ((Class460_Sub1) this).aClass688_10167)
		((Class460_Sub1) this).aClass688_10167 = new Class688();
	}
    }
    
    void method5580(int i) {
	if (((Class460_Sub1) this).aClass539_10157 != null) {
	    for (Node node = ((Class460_Sub1) this).aClass688_10147
					 .method8034(1672629232);
		 node != null;
		 node = ((Class460_Sub1) this).aClass688_10147
				.method8037(-1349247334)) {
		if (node.aLong7107 * -4849232331708333273L == (long) i)
		    return;
	    }
	    Node node = new Node();
	    node.aLong7107 = (long) i * -9171965245836510057L;
	    ((Class460_Sub1) this).aClass688_10147.method8031(node,
							      (byte) 65);
	}
    }
    
    public int method9214() {
	if (null == ((Class460_Sub1) this).aClass438_10171)
	    return 0;
	if (!((Class460_Sub1) this).aBool10166)
	    return ((((Class438) ((Class460_Sub1) this).aClass438_10171)
		     .anInt4887)
		    * -1319948689);
	Node node
	    = ((Class460_Sub1) this).aClass688_10167.method8034(1379660008);
	if (node == null)
	    return 0;
	return (int) (-4849232331708333273L * node.aLong7107);
    }
    
    public boolean method9215(int i) {
	return ((Class460_Sub1) this).aBool10165;
    }
    
    public void method9216() {
	if (null == ((Class460_Sub1) this).aClass449_10149
	    && ((Class460_Sub1) this).aClass539_10157 != null) {
	    ((Class460_Sub1) this).aBool10150 = true;
	    ((Class460_Sub1) this).aBool10165 = true;
	    if (null == ((Class460_Sub1) this).aClass688_10167)
		((Class460_Sub1) this).aClass688_10167 = new Class688();
	}
    }
    
    void method9217(boolean bool) {
	((Class460_Sub1) this).aClass449_10149.method5413(bool, 2095857956);
    }
    
    Class460_Sub1(int i, Class539 class539, Class539 class539_25_,
		  Class454 class454, Class449 class449, Class455 class455,
		  int i_26_, byte[] is, int i_27_, boolean bool, int i_28_) {
	((Class460_Sub1) this).aClass692_10151 = new Class692(16);
	((Class460_Sub1) this).anInt10169 = 0;
	((Class460_Sub1) this).aClass688_10147 = new Class688();
	((Class460_Sub1) this).aLong10163 = 0L;
	((Class460_Sub1) this).anInt10173 = 1752186639 * i;
	((Class460_Sub1) this).aClass539_10157 = class539;
	if (((Class460_Sub1) this).aClass539_10157 == null)
	    ((Class460_Sub1) this).aBool10166 = false;
	else {
	    ((Class460_Sub1) this).aBool10166 = true;
	    ((Class460_Sub1) this).aClass688_10167 = new Class688();
	}
	((Class460_Sub1) this).aClass539_10152 = class539_25_;
	((Class460_Sub1) this).aClass454_10154 = class454;
	((Class460_Sub1) this).aClass449_10149 = class449;
	((Class460_Sub1) this).aClass455_10168 = class455;
	((Class460_Sub1) this).anInt10164 = i_26_ * 149026493;
	((Class460_Sub1) this).aByteArray10155 = is;
	((Class460_Sub1) this).anInt10156 = -1537438001 * i_27_;
	((Class460_Sub1) this).aBool10148 = bool;
	if (null != ((Class460_Sub1) this).aClass539_10152)
	    ((Class460_Sub1) this).aClass528_Sub21_Sub9_10153
		= (((Class460_Sub1) this).aClass455_10168.method5500
		   (((Class460_Sub1) this).anInt10173 * 4771823,
		    ((Class460_Sub1) this).aClass539_10152, (byte) -71));
    }
    
    boolean method9218() {
	return null != ((Class460_Sub1) this).aClass449_10149;
    }
    
    static final void method9219(Class648 class648, byte i) {
	int i_29_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_29_, (byte) 11);
	Class226 class226 = Class380.aClass226Array3970[i_29_ >> 16];
	Class514.method6277(class229, class226, class648, 868566537);
    }
}
