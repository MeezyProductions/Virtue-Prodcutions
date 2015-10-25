/* Class446 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class446
{
    static final int anInt4933 = 2;
    static boolean aBool4934;
    Object[][] anObjectArrayArray4935;
    boolean aBool4936;
    Class438 aClass438_4937 = null;
    static final int anInt4938 = 0;
    public static final int anInt4939 = 1;
    Object[] anObjectArray4940;
    static Class78 aClass78_4941 = new Class78();
    int anInt4942;
    Class460 aClass460_4943;
    static int anInt4944;
    
    synchronized boolean method5341(int i, int i_0_, int[] is, int i_1_) {
	if (!method5344(i, (byte) 13))
	    return false;
	if (null == ((Class446) this).anObjectArray4940[i])
	    return false;
	int i_2_
	    = ((Class438) ((Class446) this).aClass438_4937).anIntArray4885[i];
	int[] is_3_ = (((Class438) ((Class446) this).aClass438_4937)
		       .anIntArrayArray4886[i]);
	if (null == ((Class446) this).anObjectArrayArray4935[i])
	    ((Class446) this).anObjectArrayArray4935[i]
		= new Object[(((Class438) ((Class446) this).aClass438_4937)
			      .anIntArray4879[i])];
	Object[] objects = ((Class446) this).anObjectArrayArray4935[i];
	boolean bool = true;
	for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
	    int i_5_;
	    if (is_3_ == null)
		i_5_ = i_4_;
	    else
		i_5_ = is_3_[i_4_];
	    if (null == objects[i_5_]) {
		bool = false;
		break;
	    }
	}
	if (bool)
	    return true;
	byte[] is_6_;
	if (null != is
	    && (is[0] != 0 || is[1] != 0 || is[2] != 0 || 0 != is[3])) {
	    is_6_ = Class653.method7795(((Class446) this).anObjectArray4940[i],
					true, (byte) -8);
	    ByteBuffer class528_sub42 = new ByteBuffer(is_6_);
	    int i_7_ = class528_sub42.readUnsignedByte((byte) 5);
	    int i_8_ = class528_sub42.readInt(-95516070);
	    int i_9_
		= (i_7_ == Class442.aClass442_4908.method68() ? 5 : 9) + i_8_;
	    class528_sub42.method9649(is, 5, i_9_, -1773008380);
	} else
	    is_6_ = Class653.method7795(((Class446) this).anObjectArray4940[i],
					false, (byte) -20);
	byte[] is_10_;
	try {
	    is_10_ = Class257.method3473(is_6_, (byte) 16);
	} catch (RuntimeException runtimeexception) {
	    throw Class511_Sub6.method9345
		      (runtimeexception,
		       new StringBuilder().append(is != null).append(" ")
			   .append
			   (i).append
			   (" ").append
			   (is_6_.length).append
			   (" ").append
			   (Class22.method679(is_6_, is_6_.length,
					      -1178829625))
			   .append
			   (" ").append
			   (Class22.method679(is_6_, is_6_.length - 2,
					      -1178829625))
			   .append
			   (" ").append
			   (((Class438) ((Class446) this).aClass438_4937)
			    .anIntArray4872[i])
			   .append
			   (" ").append
			   ((((Class438) ((Class446) this).aClass438_4937)
			     .anInt4871) * -461146011)
			   .toString());
	}
	if (((Class446) this).aBool4936)
	    ((Class446) this).anObjectArray4940[i] = null;
	if (i_2_ > 1) {
	    if (2 != ((Class446) this).anInt4942 * -685595255) {
		int i_11_ = is_10_.length;
		int i_12_ = is_10_[--i_11_] & 0xff;
		i_11_ -= i_12_ * i_2_ * 4;
		ByteBuffer class528_sub42 = new ByteBuffer(is_10_);
		int[] is_13_ = new int[i_2_];
		class528_sub42.pointer = i_11_ * 2015001547;
		for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
		    int i_15_ = 0;
		    for (int i_16_ = 0; i_16_ < i_2_; i_16_++) {
			i_15_ += class528_sub42.readInt(-969203780);
			is_13_[i_16_] += i_15_;
		    }
		}
		byte[][] is_17_ = new byte[i_2_][];
		for (int i_18_ = 0; i_18_ < i_2_; i_18_++) {
		    is_17_[i_18_] = new byte[is_13_[i_18_]];
		    is_13_[i_18_] = 0;
		}
		class528_sub42.pointer = i_11_ * 2015001547;
		int i_19_ = 0;
		for (int i_20_ = 0; i_20_ < i_12_; i_20_++) {
		    int i_21_ = 0;
		    for (int i_22_ = 0; i_22_ < i_2_; i_22_++) {
			i_21_ += class528_sub42.readInt(91859237);
			System.arraycopy(is_10_, i_19_, is_17_[i_22_],
					 is_13_[i_22_], i_21_);
			is_13_[i_22_] += i_21_;
			i_19_ += i_21_;
		    }
		}
		for (int i_23_ = 0; i_23_ < i_2_; i_23_++) {
		    int i_24_;
		    if (is_3_ == null)
			i_24_ = i_23_;
		    else
			i_24_ = is_3_[i_23_];
		    if (0 == -685595255 * ((Class446) this).anInt4942)
			objects[i_24_] = Class36.method788(is_17_[i_23_],
							   false, (byte) -64);
		    else
			objects[i_24_] = is_17_[i_23_];
		}
	    } else {
		int i_25_ = is_10_.length;
		int i_26_ = is_10_[--i_25_] & 0xff;
		i_25_ -= 4 * (i_26_ * i_2_);
		ByteBuffer class528_sub42 = new ByteBuffer(is_10_);
		int i_27_ = 0;
		int i_28_ = 0;
		class528_sub42.pointer = i_25_ * 2015001547;
		for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
		    int i_30_ = 0;
		    for (int i_31_ = 0; i_31_ < i_2_; i_31_++) {
			i_30_ += class528_sub42.readInt(-1601922288);
			int i_32_;
			if (is_3_ == null)
			    i_32_ = i_31_;
			else
			    i_32_ = is_3_[i_31_];
			if (i_0_ == i_32_) {
			    i_27_ += i_30_;
			    i_28_ = i_32_;
			}
		    }
		}
		if (i_27_ == 0)
		    return true;
		byte[] is_33_ = new byte[i_27_];
		i_27_ = 0;
		class528_sub42.pointer = 2015001547 * i_25_;
		int i_34_ = 0;
		for (int i_35_ = 0; i_35_ < i_26_; i_35_++) {
		    int i_36_ = 0;
		    for (int i_37_ = 0; i_37_ < i_2_; i_37_++) {
			i_36_ += class528_sub42.readInt(-366665984);
			int i_38_;
			if (null == is_3_)
			    i_38_ = i_37_;
			else
			    i_38_ = is_3_[i_37_];
			if (i_38_ == i_0_) {
			    System.arraycopy(is_10_, i_34_, is_33_, i_27_,
					     i_36_);
			    i_27_ += i_36_;
			}
			i_34_ += i_36_;
		    }
		}
		objects[i_28_] = is_33_;
	    }
	} else {
	    int i_39_;
	    if (null == is_3_)
		i_39_ = 0;
	    else
		i_39_ = is_3_[0];
	    if (0 == ((Class446) this).anInt4942 * -685595255)
		objects[i_39_] = Class36.method788(is_10_, false, (byte) 52);
	    else
		objects[i_39_] = is_10_;
	}
	return true;
    }
    
    synchronized boolean method5342(int i) {
	if (null == ((Class446) this).aClass438_4937) {
	    ((Class446) this).aClass438_4937
		= ((Class446) this).aClass460_4943.method5571(-310452357);
	    if (((Class446) this).aClass438_4937 == null)
		return false;
	    ((Class446) this).anObjectArray4940
		= new Object[(((Class438) ((Class446) this).aClass438_4937)
			      .anInt4881) * -311250737];
	    ((Class446) this).anObjectArrayArray4935
		= (new Object
		   [-311250737 * (((Class438) ((Class446) this).aClass438_4937)
				  .anInt4881)]
		   []);
	}
	return true;
    }
    
    public synchronized int method5343() {
	if (!method5342(-1876925730))
	    return 0;
	int i = 0;
	int i_40_ = 0;
	for (int i_41_ = 0; i_41_ < ((Class446) this).anObjectArray4940.length;
	     i_41_++) {
	    if ((((Class438) ((Class446) this).aClass438_4937).anIntArray4885
		 [i_41_])
		> 0) {
		i += 100;
		i_40_ += method5354(i_41_, (byte) -49);
	    }
	}
	if (0 == i)
	    return 100;
	int i_42_ = 100 * i_40_ / i;
	return i_42_;
    }
    
    synchronized boolean method5344(int i, byte i_43_) {
	if (!method5342(-1088576424))
	    return false;
	if (i < 0
	    || i >= (((Class438) ((Class446) this).aClass438_4937)
		     .anIntArray4879).length
	    || 0 == (((Class438) ((Class446) this).aClass438_4937)
		     .anIntArray4879[i])) {
	    if (aBool4934)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    public int method5345(int i, int i_44_) {
	if (!method5344(i, (byte) 13))
	    return 0;
	return ((Class438) ((Class446) this).aClass438_4937).anIntArray4879[i];
    }
    
    synchronized void method5346(int i, int i_45_) {
	if (((Class446) this).aBool4936)
	    ((Class446) this).anObjectArray4940[i]
		= ((Class446) this).aClass460_4943.method5572(i, (byte) 51);
	else
	    ((Class446) this).anObjectArray4940[i]
		= Class36.method788(((Class446) this).aClass460_4943
					.method5572(i, (byte) 51),
				    false, (byte) 47);
    }
    
    public void method5347(int i, short i_46_) {
	((Class446) this).aClass460_4943.method5573(i, (byte) -50);
    }
    
    public byte[] method5348(int i, int i_47_, int i_48_) {
	return method5349(i, i_47_, null, (short) 18689);
    }
    
    public synchronized byte[] method5349(int i, int i_49_, int[] is,
					  short i_50_) {
	if (!method5387(i, i_49_, (byte) 1))
	    return null;
	byte[] is_51_ = null;
	if (((Class446) this).anObjectArrayArray4935[i] == null
	    || null == ((Class446) this).anObjectArrayArray4935[i][i_49_]) {
	    boolean bool = method5341(i, i_49_, is, -1992469446);
	    if (!bool) {
		method5346(i, -218211754);
		bool = method5341(i, i_49_, is, -1992469446);
		if (!bool)
		    return null;
	    }
	}
	if (((Class446) this).anObjectArrayArray4935[i] == null)
	    throw new RuntimeException("");
	if (((Class446) this).anObjectArrayArray4935[i][i_49_] != null) {
	    is_51_ = Class653.method7795((((Class446) this)
					  .anObjectArrayArray4935[i][i_49_]),
					 false, (byte) -7);
	    if (null == is_51_)
		throw new RuntimeException("");
	}
	if (is_51_ != null) {
	    if (1 == ((Class446) this).anInt4942 * -685595255) {
		((Class446) this).anObjectArrayArray4935[i][i_49_] = null;
		if (1 == (((Class438) ((Class446) this).aClass438_4937)
			  .anIntArray4879[i]))
		    ((Class446) this).anObjectArrayArray4935[i] = null;
	    } else if (-685595255 * ((Class446) this).anInt4942 == 2)
		((Class446) this).anObjectArrayArray4935[i] = null;
	}
	return is_51_;
    }
    
    public synchronized boolean method5350(int i, int i_52_, int i_53_) {
	if (!method5387(i, i_52_, (byte) 1))
	    return false;
	if (null != ((Class446) this).anObjectArrayArray4935[i]
	    && ((Class446) this).anObjectArrayArray4935[i][i_52_] != null)
	    return true;
	if (null != ((Class446) this).anObjectArray4940[i])
	    return true;
	method5346(i, -620735898);
	if (null != ((Class446) this).anObjectArray4940[i])
	    return true;
	return false;
    }
    
    public int method5351(int i, int i_54_) {
	if (!method5342(-47672981))
	    return -1;
	int i_55_ = ((Class438) ((Class446) this).aClass438_4937)
			.aClass253_4877.method3434(i, 1849097020);
	if (!method5344(i_55_, (byte) 13))
	    return -1;
	return i_55_;
    }
    
    public synchronized boolean method5352(int i, int i_56_) {
	if (!method5344(i, (byte) 13))
	    return false;
	if (null != ((Class446) this).anObjectArray4940[i])
	    return true;
	method5346(i, -1645706167);
	if (((Class446) this).anObjectArray4940[i] != null)
	    return true;
	return false;
    }
    
    public synchronized boolean method5353(byte i) {
	if (!method5342(-1979230114))
	    return false;
	boolean bool = true;
	for (int i_57_ = 0;
	     i_57_ < (((Class438) ((Class446) this).aClass438_4937)
		      .anIntArray4882).length;
	     i_57_++) {
	    int i_58_ = (((Class438) ((Class446) this).aClass438_4937)
			 .anIntArray4882[i_57_]);
	    if (((Class446) this).anObjectArray4940[i_58_] == null) {
		method5346(i_58_, -550405736);
		if (null == ((Class446) this).anObjectArray4940[i_58_])
		    bool = false;
	    }
	}
	return bool;
    }
    
    public synchronized int method5354(int i, byte i_59_) {
	if (!method5344(i, (byte) 13))
	    return 0;
	if (null != ((Class446) this).anObjectArray4940[i])
	    return 100;
	return ((Class446) this).aClass460_4943.method5578(i, -1712479297);
    }
    
    public synchronized int method5355(int i) {
	if (!method5342(-1269786260))
	    return 0;
	int i_60_ = 0;
	int i_61_ = 0;
	for (int i_62_ = 0; i_62_ < ((Class446) this).anObjectArray4940.length;
	     i_62_++) {
	    if ((((Class438) ((Class446) this).aClass438_4937).anIntArray4885
		 [i_62_])
		> 0) {
		i_60_ += 100;
		i_61_ += method5354(i_62_, (byte) 10);
	    }
	}
	if (0 == i_60_)
	    return 100;
	int i_63_ = 100 * i_61_ / i_60_;
	return i_63_;
    }
    
    public int method5356(int i) {
	if (!method5342(79622898))
	    return -1;
	return (((Class438) ((Class446) this).aClass438_4937)
		.anIntArray4879).length;
    }
    
    public synchronized boolean method5357(int i, short i_64_) {
	if (!method5342(-1944773676))
	    return false;
	if (((Class438) ((Class446) this).aClass438_4937).anIntArray4879.length
	    == 1)
	    return method5350(0, i, 709028747);
	if (!method5344(i, (byte) 13))
	    return false;
	if (1
	    == ((Class438) ((Class446) this).aClass438_4937).anIntArray4879[i])
	    return method5350(i, 0, -1097218919);
	throw new RuntimeException();
    }
    
    public Class446(Class460 class460, boolean bool, int i) {
	if (i < 0 || i > 2)
	    throw new IllegalArgumentException("");
	((Class446) this).aClass460_4943 = class460;
	((Class446) this).aBool4936 = bool;
	((Class446) this).anInt4942 = i * -989110087;
    }
    
    public boolean method5358(String string, byte i) {
	if (!method5342(-392311354))
	    return false;
	string = string.toLowerCase();
	int i_65_ = (((Class438) ((Class446) this).aClass438_4937)
			 .aClass253_4877.method3434
		     (Class272.method3688(string, -1897933355), 2049316194));
	if (i_65_ < 0)
	    return false;
	return true;
    }
    
    public synchronized void method5359(int i, byte i_66_) {
	if (method5344(i, (byte) 13)) {
	    if (((Class446) this).anObjectArrayArray4935 != null)
		((Class446) this).anObjectArrayArray4935[i] = null;
	}
    }
    
    public void method5360(boolean bool, boolean bool_67_, int i) {
	if (method5342(-576915376)) {
	    if (bool) {
		((Class438) ((Class446) this).aClass438_4937).anIntArray4876
		    = null;
		((Class438) ((Class446) this).aClass438_4937).aClass253_4877
		    = null;
	    }
	    if (bool_67_) {
		((Class438) ((Class446) this).aClass438_4937)
		    .anIntArrayArray4874
		    = null;
		((Class438) ((Class446) this).aClass438_4937)
		    .aClass253Array4888
		    = null;
	    }
	}
    }
    
    public synchronized int[] method5361(int i, byte i_68_) {
	if (!method5344(i, (byte) 13))
	    return null;
	int[] is = (((Class438) ((Class446) this).aClass438_4937)
		    .anIntArrayArray4886[i]);
	if (null == is) {
	    is = new int[(((Class438) ((Class446) this).aClass438_4937)
			  .anIntArray4885[i])];
	    for (int i_69_ = 0; i_69_ < is.length; i_69_++)
		is[i_69_] = i_69_;
	}
	return is;
    }
    
    public int method5362(String string, byte i) {
	if (!method5342(-1168499227))
	    return -1;
	string = string.toLowerCase();
	int i_70_ = (((Class438) ((Class446) this).aClass438_4937)
			 .aClass253_4877.method3434
		     (Class272.method3688(string, -1947747760), 1647625598));
	if (!method5344(i_70_, (byte) 13))
	    return -1;
	return i_70_;
    }
    
    public synchronized boolean method5363(int i) {
	if (!method5342(-451348365))
	    return false;
	if (((Class438) ((Class446) this).aClass438_4937).anIntArray4879.length
	    == 1)
	    return method5350(0, i, -580638033);
	if (!method5344(i, (byte) 13))
	    return false;
	if (1
	    == ((Class438) ((Class446) this).aClass438_4937).anIntArray4879[i])
	    return method5350(i, 0, -418769581);
	throw new RuntimeException();
    }
    
    public boolean method5364(String string, String string_71_, short i) {
	if (!method5342(-2089028053))
	    return false;
	string = string.toLowerCase();
	string_71_ = string_71_.toLowerCase();
	int i_72_ = (((Class438) ((Class446) this).aClass438_4937)
			 .aClass253_4877.method3434
		     (Class272.method3688(string, -2013094240), 1708252292));
	if (i_72_ < 0)
	    return false;
	int i_73_
	    = (((Class438) ((Class446) this).aClass438_4937)
		   .aClass253Array4888[i_72_].method3434
	       (Class272.method3688(string_71_, -1425853082), 1727648654));
	if (i_73_ < 0)
	    return false;
	return true;
    }
    
    public synchronized byte[] method5365(String string, String string_74_,
					  int i) {
	if (!method5342(-1396279585))
	    return null;
	string = string.toLowerCase();
	string_74_ = string_74_.toLowerCase();
	int i_75_ = (((Class438) ((Class446) this).aClass438_4937)
			 .aClass253_4877.method3434
		     (Class272.method3688(string, -1841449869), 1711914071));
	if (!method5344(i_75_, (byte) 13))
	    return null;
	int i_76_
	    = (((Class438) ((Class446) this).aClass438_4937)
		   .aClass253Array4888[i_75_].method3434
	       (Class272.method3688(string_74_, -2008825875), 1782670724));
	return method5348(i_75_, i_76_, -1607455383);
    }
    
    boolean method5366(String string, String string_77_, int i) {
	if (!method5342(-1554678548))
	    return false;
	string = string.toLowerCase();
	string_77_ = string_77_.toLowerCase();
	int i_78_ = (((Class438) ((Class446) this).aClass438_4937)
			 .aClass253_4877.method3434
		     (Class272.method3688(string, -1999759503), 1813330391));
	if (!method5344(i_78_, (byte) 13))
	    return false;
	int i_79_
	    = (((Class438) ((Class446) this).aClass438_4937)
		   .aClass253Array4888[i_78_].method3434
	       (Class272.method3688(string_77_, -1340004924), 1592561441));
	return method5350(i_78_, i_79_, -719562582);
    }
    
    public boolean method5367(String string, byte i) {
	if (!method5342(-879833503))
	    return false;
	string = string.toLowerCase();
	int i_80_ = (((Class438) ((Class446) this).aClass438_4937)
			 .aClass253_4877.method3434
		     (Class272.method3688(string, -2135298381), 1929616151));
	return method5352(i_80_, -1674572175);
    }
    
    public synchronized boolean method5368(int i, int i_81_) {
	if (!method5342(-440782702))
	    return false;
	if (i < 0 || i_81_ < 0
	    || i >= (((Class438) ((Class446) this).aClass438_4937)
		     .anIntArray4879).length
	    || i_81_ >= (((Class438) ((Class446) this).aClass438_4937)
			 .anIntArray4879[i])) {
	    if (aBool4934)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_81_).toString());
	    return false;
	}
	return true;
    }
    
    static {
	aBool4934 = false;
	anInt4944 = 0;
    }
    
    synchronized boolean method5369() {
	if (null == ((Class446) this).aClass438_4937) {
	    ((Class446) this).aClass438_4937
		= ((Class446) this).aClass460_4943.method5571(125851284);
	    if (((Class446) this).aClass438_4937 == null)
		return false;
	    ((Class446) this).anObjectArray4940
		= new Object[(((Class438) ((Class446) this).aClass438_4937)
			      .anInt4881) * -311250737];
	    ((Class446) this).anObjectArrayArray4935
		= (new Object
		   [-311250737 * (((Class438) ((Class446) this).aClass438_4937)
				  .anInt4881)]
		   []);
	}
	return true;
    }
    
    synchronized boolean method5370() {
	if (null == ((Class446) this).aClass438_4937) {
	    ((Class446) this).aClass438_4937
		= ((Class446) this).aClass460_4943.method5571(1872342415);
	    if (((Class446) this).aClass438_4937 == null)
		return false;
	    ((Class446) this).anObjectArray4940
		= new Object[(((Class438) ((Class446) this).aClass438_4937)
			      .anInt4881) * -311250737];
	    ((Class446) this).anObjectArrayArray4935
		= (new Object
		   [-311250737 * (((Class438) ((Class446) this).aClass438_4937)
				  .anInt4881)]
		   []);
	}
	return true;
    }
    
    public int method5371() {
	if (!method5342(-747153125))
	    throw new IllegalStateException("");
	return (((Class438) ((Class446) this).aClass438_4937).anInt4871
		* -461146011);
    }
    
    public int method5372() {
	if (!method5342(-1897959385))
	    throw new IllegalStateException("");
	return (((Class438) ((Class446) this).aClass438_4937).anInt4871
		* -461146011);
    }
    
    public int method5373(int i) {
	if (!method5344(i, (byte) 13))
	    return 0;
	return ((Class438) ((Class446) this).aClass438_4937).anIntArray4879[i];
    }
    
    public synchronized int method5374(int i) {
	if (!method5344(i, (byte) 13))
	    return 0;
	if (null != ((Class446) this).anObjectArray4940[i])
	    return 100;
	return ((Class446) this).aClass460_4943.method5578(i, 1280365477);
    }
    
    synchronized void method5375(int i) {
	if (((Class446) this).aBool4936)
	    ((Class446) this).anObjectArray4940[i]
		= ((Class446) this).aClass460_4943.method5572(i, (byte) 51);
	else
	    ((Class446) this).anObjectArray4940[i]
		= Class36.method788(((Class446) this).aClass460_4943
					.method5572(i, (byte) 51),
				    false, (byte) -79);
    }
    
    public void method5376(int i) {
	((Class446) this).aClass460_4943.method5573(i, (byte) -80);
    }
    
    public int method5377(int i) {
	if (!method5342(-1646326531))
	    throw new IllegalStateException("");
	return (((Class438) ((Class446) this).aClass438_4937).anInt4871
		* -461146011);
    }
    
    public synchronized int method5378() {
	if (!method5342(-758817924))
	    return 0;
	int i = 0;
	int i_82_ = 0;
	for (int i_83_ = 0; i_83_ < ((Class446) this).anObjectArray4940.length;
	     i_83_++) {
	    if ((((Class438) ((Class446) this).aClass438_4937).anIntArray4885
		 [i_83_])
		> 0) {
		i += 100;
		i_82_ += method5354(i_83_, (byte) 92);
	    }
	}
	if (0 == i)
	    return 100;
	int i_84_ = 100 * i_82_ / i;
	return i_84_;
    }
    
    public synchronized boolean method5379(int i, int i_85_) {
	if (!method5387(i, i_85_, (byte) 1))
	    return false;
	if (null != ((Class446) this).anObjectArrayArray4935[i]
	    && ((Class446) this).anObjectArrayArray4935[i][i_85_] != null)
	    return true;
	if (null != ((Class446) this).anObjectArray4940[i])
	    return true;
	method5346(i, -200428535);
	if (null != ((Class446) this).anObjectArray4940[i])
	    return true;
	return false;
    }
    
    public synchronized boolean method5380(int i, int i_86_) {
	if (!method5387(i, i_86_, (byte) 1))
	    return false;
	if (null != ((Class446) this).anObjectArrayArray4935[i]
	    && ((Class446) this).anObjectArrayArray4935[i][i_86_] != null)
	    return true;
	if (null != ((Class446) this).anObjectArray4940[i])
	    return true;
	method5346(i, -287816017);
	if (null != ((Class446) this).anObjectArray4940[i])
	    return true;
	return false;
    }
    
    public synchronized boolean method5381(int i, int i_87_) {
	if (!method5342(-633384415))
	    return false;
	if (i < 0 || i_87_ < 0
	    || i >= (((Class438) ((Class446) this).aClass438_4937)
		     .anIntArray4879).length
	    || i_87_ >= (((Class438) ((Class446) this).aClass438_4937)
			 .anIntArray4879[i])) {
	    if (aBool4934)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_87_).toString());
	    return false;
	}
	return true;
    }
    
    public synchronized boolean method5382() {
	if (!method5342(-441852277))
	    return false;
	boolean bool = true;
	for (int i = 0; i < (((Class438) ((Class446) this).aClass438_4937)
			     .anIntArray4882).length; i++) {
	    int i_88_ = (((Class438) ((Class446) this).aClass438_4937)
			 .anIntArray4882[i]);
	    if (((Class446) this).anObjectArray4940[i_88_] == null) {
		method5346(i_88_, -636811092);
		if (null == ((Class446) this).anObjectArray4940[i_88_])
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method5383(String string, int i) {
	int i_89_ = method5362("", (byte) -11);
	if (-1 != i_89_)
	    return method5366("", string, 597551204);
	return method5366(string, "", 736246288);
    }
    
    public synchronized boolean method5384(int i) {
	if (!method5344(i, (byte) 13))
	    return false;
	if (null != ((Class446) this).anObjectArray4940[i])
	    return true;
	method5346(i, -593808183);
	if (((Class446) this).anObjectArray4940[i] != null)
	    return true;
	return false;
    }
    
    public int method5385(int i) {
	if (!method5342(-1841819699))
	    return -1;
	int i_90_ = ((Class438) ((Class446) this).aClass438_4937)
			.aClass253_4877.method3434(i, 2129481393);
	if (!method5344(i_90_, (byte) 13))
	    return -1;
	return i_90_;
    }
    
    public synchronized int method5386(int i) {
	if (!method5344(i, (byte) 13))
	    return 0;
	if (null != ((Class446) this).anObjectArray4940[i])
	    return 100;
	return ((Class446) this).aClass460_4943.method5578(i, -614914538);
    }
    
    public synchronized boolean method5387(int i, int i_91_, byte i_92_) {
	if (!method5342(-409496247))
	    return false;
	if (i < 0 || i_91_ < 0
	    || i >= (((Class438) ((Class446) this).aClass438_4937)
		     .anIntArray4879).length
	    || i_91_ >= (((Class438) ((Class446) this).aClass438_4937)
			 .anIntArray4879[i])) {
	    if (aBool4934)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_91_).toString());
	    return false;
	}
	return true;
    }
    
    public int method5388(String string, int i) {
	if (!method5342(-687333688))
	    return 0;
	string = string.toLowerCase();
	int i_93_ = (((Class438) ((Class446) this).aClass438_4937)
			 .aClass253_4877.method3434
		     (Class272.method3688(string, -1801676783), 1931508349));
	return method5354(i_93_, (byte) 33);
    }
    
    public boolean method5389(int i, int i_94_) {
	if (!method5342(-874234988))
	    return false;
	if (1 == (((Class438) ((Class446) this).aClass438_4937)
		  .anIntArray4879).length)
	    return method5387(0, i, (byte) 1);
	if (!method5344(i, (byte) 13))
	    return false;
	if (1
	    == ((Class438) ((Class446) this).aClass438_4937).anIntArray4879[i])
	    return method5387(i, 0, (byte) 1);
	throw new RuntimeException();
    }
    
    public int method5390(int i) {
	if (!method5344(i, (byte) 13))
	    return 0;
	return ((Class438) ((Class446) this).aClass438_4937).anIntArray4879[i];
    }
    
    public int method5391(int i) {
	if (!method5344(i, (byte) 13))
	    return 0;
	return ((Class438) ((Class446) this).aClass438_4937).anIntArray4879[i];
    }
    
    public int method5392() {
	if (!method5342(-1160214925))
	    return -1;
	return (((Class438) ((Class446) this).aClass438_4937)
		.anIntArray4879).length;
    }
    
    public synchronized void method5393(int i) {
	if (method5344(i, (byte) 13)) {
	    if (((Class446) this).anObjectArrayArray4935 != null)
		((Class446) this).anObjectArrayArray4935[i] = null;
	}
    }
    
    public synchronized void method5394(int i) {
	if (method5344(i, (byte) 13)) {
	    if (((Class446) this).anObjectArrayArray4935 != null)
		((Class446) this).anObjectArrayArray4935[i] = null;
	}
    }
    
    public synchronized byte[] method5395(int i, int i_95_) {
	if (!method5342(-1329443433))
	    return null;
	if (1 == (((Class438) ((Class446) this).aClass438_4937)
		  .anIntArray4879).length)
	    return method5348(0, i, -1080063970);
	if (!method5344(i, (byte) 13))
	    return null;
	if (((Class438) ((Class446) this).aClass438_4937).anIntArray4879[i]
	    == 1)
	    return method5348(i, 0, -2086156016);
	throw new RuntimeException();
    }
    
    public synchronized boolean method5396(int i, int i_96_) {
	if (!method5387(i, i_96_, (byte) 1))
	    return false;
	if (null != ((Class446) this).anObjectArrayArray4935[i]
	    && ((Class446) this).anObjectArrayArray4935[i][i_96_] != null)
	    return true;
	if (null != ((Class446) this).anObjectArray4940[i])
	    return true;
	method5346(i, -1290683181);
	if (null != ((Class446) this).anObjectArray4940[i])
	    return true;
	return false;
    }
    
    static final void method5397(Class648 class648, int i) {
	int i_97_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (2088127151 * client.anInt10978 != -1) {
	    if (i_97_ == 0) {
		((Class648) class648).anIntArray8394
		    [((((Class648) class648).anInt8395 += 1239022665)
		      * 717927929) - 1]
		    = client.anInt10978 * 2088127151;
		return;
	    }
	    i_97_--;
	}
	Class528_Sub39 class528_sub39
	    = (Class528_Sub39) client.aClass692_11097.method8146(-1942855841);
	while (i_97_-- > 0)
	    class528_sub39 = ((Class528_Sub39)
			      client.aClass692_11097.method8138(1039849027));
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class528_sub39.anInt10625 * 905908359;
    }
    
    static Class579 method5398(ByteBuffer class528_sub42, int i) {
	int i_98_ = class528_sub42.readUnsignedByte((byte) 72);
	int i_99_ = class528_sub42.readUnsignedByte((byte) 81);
	return new Class579(i_98_, i_99_);
    }
    
    static final void method5399(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	int i_100_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class79 class79
	    = ((Class79)
	       Class208.aClass5_Sub10_2239.method63(i_100_, 693562635));
	if (class79.method1140((short) 255))
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class229.method3201(i_100_, class79.aString811, (byte) 5);
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= class229.method3210(i_100_, 1875093329 * class79.anInt809,
				      1659812912);
    }
    
    public static Class528_Sub21_Sub8 method5400(int i, Class273 class273,
						 ByteBuffer class528_sub42,
						 byte i_101_) {
	if (Class273.aClass273_2904 == class273)
	    return new Class528_Sub21_Sub8_Sub1(i, class528_sub42);
	if (class273 == Class273.aClass273_2905)
	    return new Class528_Sub21_Sub8_Sub2(i, class528_sub42);
	return null;
    }
}
