/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.List;

public class Class217
{
    static final int anInt2289 = 5;
    List aList2290 = new ArrayList();
    static String aString2291;
    
    public int method3069(short i) {
	return ((Class217) this).aList2290.size();
    }
    
    public int method3070(Class204 class204, int i) {
	return method3072(class204, -1, 1733874875);
    }
    
    public Class204 method3071(int i, int i_0_) {
	return (Class204) ((Class217) this).aList2290.get(i);
    }
    
    public int method3072(Class204 class204, int i, int i_1_) {
	if (((Class217) this).aList2290.size() == 5)
	    throw new RuntimeException("");
	if (method3076(class204.anInt2224 * -1891422719, 516312311) != -1)
	    throw new RuntimeException("");
	if (i == -1)
	    i = ((Class217) this).aList2290.size();
	((Class217) this).aList2290.add(i, class204);
	return i;
    }
    
    public void method3073(int i, byte i_2_) {
	((Class217) this).aList2290.remove(i);
    }
    
    public void method3074(short i) {
	((Class217) this).aList2290.clear();
    }
    
    public int method3075() {
	return ((Class217) this).aList2290.size();
    }
    
    public int method3076(int i, int i_3_) {
	for (int i_4_ = 0; i_4_ < ((Class217) this).aList2290.size(); i_4_++) {
	    if ((((Class204) ((Class217) this).aList2290.get(i_4_)).anInt2224
		 * -1891422719)
		== i)
		return i_4_;
	}
	return -1;
    }
    
    public static String method3077(byte[] is, int i, int i_5_, int i_6_) {
	char[] cs = new char[i_5_];
	int i_7_ = 0;
	int i_8_ = i;
	int i_9_ = i_5_ + i;
	while (i_8_ < i_9_) {
	    int i_10_ = is[i_8_++] & 0xff;
	    int i_11_;
	    if (i_10_ < 128) {
		if (i_10_ == 0)
		    i_11_ = 65533;
		else
		    i_11_ = i_10_;
	    } else if (i_10_ < 192)
		i_11_ = 65533;
	    else if (i_10_ < 224) {
		if (i_8_ < i_9_ && (is[i_8_] & 0xc0) == 128) {
		    i_11_ = (i_10_ & 0x1f) << 6 | is[i_8_++] & 0x3f;
		    if (i_11_ < 128)
			i_11_ = 65533;
		} else
		    i_11_ = 65533;
	    } else if (i_10_ < 240) {
		if (i_8_ + 1 < i_9_ && (is[i_8_] & 0xc0) == 128
		    && 128 == (is[1 + i_8_] & 0xc0)) {
		    i_11_ = ((i_10_ & 0xf) << 12 | (is[i_8_++] & 0x3f) << 6
			     | is[i_8_++] & 0x3f);
		    if (i_11_ < 2048)
			i_11_ = 65533;
		} else
		    i_11_ = 65533;
	    } else if (i_10_ < 248) {
		if (2 + i_8_ < i_9_ && 128 == (is[i_8_] & 0xc0)
		    && (is[1 + i_8_] & 0xc0) == 128
		    && 128 == (is[i_8_ + 2] & 0xc0)) {
		    i_11_ = ((i_10_ & 0x7) << 18 | (is[i_8_++] & 0x3f) << 12
			     | (is[i_8_++] & 0x3f) << 6 | is[i_8_++] & 0x3f);
		    if (i_11_ < 65536 || i_11_ > 1114111)
			i_11_ = 65533;
		    else
			i_11_ = 65533;
		} else
		    i_11_ = 65533;
	    } else
		i_11_ = 65533;
	    cs[i_7_++] = (char) i_11_;
	}
	return new String(cs, 0, i_7_);
    }
    
    static final void method3078(Class648 class648, int i) {
	Class445_Sub5.method9222((String) (((Class648) class648)
					   .anObjectArray8396
					   [(((Class648) class648).anInt8410
					     -= 1600226731) * -520794877]),
				 false, false, 2008672007);
    }
    
    static final void method3079(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub34_10608
		  .method10132((byte) 47);
    }
    
    static boolean method3080(int i, byte i_12_) {
	if (i == 3 || i == 4 || 5 == i || i == 6 || 1001 == i || 1002 == i)
	    return true;
	if (i == 2)
	    return true;
	return false;
    }
}
