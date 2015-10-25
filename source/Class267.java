/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class267
{
    int anInt2878;
    byte[] aByteArray2879;
    
    Class267(byte[] is) {
	((Class267) this).aByteArray2879 = is;
	((Class267) this).anInt2878 = 0;
    }
    
    String method3669(int i) {
	int i_0_ = method3671(-1047430396);
	if (i_0_ == -1)
	    return null;
	if (i_0_ > 256)
	    throw new RuntimeException_Sub3();
	String string
	    = new String(((Class267) this).aByteArray2879,
			 -776250613 * ((Class267) this).anInt2878, i_0_);
	((Class267) this).anInt2878 += 184817827 * i_0_;
	return string;
    }
    
    int method3670() {
	short i = 0;
	for (int i_1_ = 0; i_1_ < 2; i_1_++)
	    i |= ((((Class267) this).aByteArray2879
		   [((((Class267) this).anInt2878 += 184817827) * -776250613
		     - 1)])
		  & 0xff) << 8 * i_1_;
	return i;
    }
    
    int method3671(int i) {
	short i_2_ = 0;
	for (int i_3_ = 0; i_3_ < 2; i_3_++)
	    i_2_ |= ((((Class267) this).aByteArray2879
		      [((((Class267) this).anInt2878 += 184817827) * -776250613
			- 1)])
		     & 0xff) << 8 * i_3_;
	return i_2_;
    }
    
    String method3672() {
	int i = method3671(307951148);
	if (i == -1)
	    return null;
	if (i > 256)
	    throw new RuntimeException_Sub3();
	String string
	    = new String(((Class267) this).aByteArray2879,
			 -776250613 * ((Class267) this).anInt2878, i);
	((Class267) this).anInt2878 += 184817827 * i;
	return string;
    }
    
    static void method3673(Class173 class173, int i, int i_4_, int i_5_,
			   int i_6_, int i_7_, int i_8_, int i_9_,
			   byte i_10_) {
	Class538 class538 = client.aClass495_10935.method5973((byte) 102);
	Interface60 interface60
	    = (Interface60) class538.method6600(i, i_4_, i_5_, (byte) -86);
	if (interface60 != null) {
	    Class596 class596
		= ((Class596)
		   (client.aClass495_10935.method5976((short) 29770).method63
		    (interface60.method397((short) -12404), 742844271)));
	    int i_11_ = interface60.method384(2090723482) & 0x3;
	    int i_12_ = interface60.method168(-1971212033);
	    if (-1 != 2063502347 * class596.anInt7801)
		Class528_Sub41.method9601(class173, class596, i_11_, i_6_,
					  i_7_, (byte) 4);
	    else {
		int i_13_ = i_8_;
		if (class596.anInt7785 * 567849393 > 0)
		    i_13_ = i_9_;
		if (i_12_ == 1922173025 * Class605.aClass605_7907.anInt7905
		    || (Class605.aClass605_7891.anInt7905 * 1922173025
			== i_12_)) {
		    if (i_11_ == 0)
			class173.method2522(i_6_, i_7_, 4, i_13_, (byte) 0);
		    else if (i_11_ == 1)
			class173.method2384(i_6_, i_7_, 4, i_13_, -1318242689);
		    else if (2 == i_11_)
			class173.method2522(3 + i_6_, i_7_, 4, i_13_,
					    (byte) 0);
		    else if (3 == i_11_)
			class173.method2384(i_6_, 3 + i_7_, 4, i_13_,
					    -1318242689);
		}
		if (i_12_ == Class605.aClass605_7911.anInt7905 * 1922173025) {
		    if (i_11_ == 0)
			class173.method2210(i_6_, i_7_, 1, 1, i_13_,
					    -1460573774);
		    else if (1 == i_11_)
			class173.method2210(3 + i_6_, i_7_, 1, 1, i_13_,
					    -1365966886);
		    else if (2 == i_11_)
			class173.method2210(3 + i_6_, 3 + i_7_, 1, 1, i_13_,
					    -1249834678);
		    else if (3 == i_11_)
			class173.method2210(i_6_, 3 + i_7_, 1, 1, i_13_,
					    -1146656081);
		}
		if (1922173025 * Class605.aClass605_7891.anInt7905 == i_12_) {
		    if (i_11_ == 0)
			class173.method2384(i_6_, i_7_, 4, i_13_, -1318242689);
		    else if (i_11_ == 1)
			class173.method2522(i_6_ + 3, i_7_, 4, i_13_,
					    (byte) 0);
		    else if (i_11_ == 2)
			class173.method2384(i_6_, 3 + i_7_, 4, i_13_,
					    -1318242689);
		    else if (i_11_ == 3)
			class173.method2522(i_6_, i_7_, 4, i_13_, (byte) 0);
		}
	    }
	}
	interface60
	    = (Interface60) class538.method6583(i, i_4_, i_5_,
						client.anInterface62_11170,
						1969551326);
	if (interface60 != null) {
	    Class596 class596
		= ((Class596)
		   (client.aClass495_10935.method5976((short) 19843).method63
		    (interface60.method397((short) 22107), -330015421)));
	    int i_14_ = interface60.method384(2040109492) & 0x3;
	    int i_15_ = interface60.method168(-1543671629);
	    if (class596.anInt7801 * 2063502347 != -1)
		Class528_Sub41.method9601(class173, class596, i_14_, i_6_,
					  i_7_, (byte) 4);
	    else if (1922173025 * Class605.aClass605_7909.anInt7905 == i_15_) {
		int i_16_ = -1118482;
		if (class596.anInt7785 * 567849393 > 0)
		    i_16_ = -1179648;
		if (i_14_ == 0 || i_14_ == 2)
		    class173.method2214(i_6_, i_7_ + 3, 3 + i_6_, i_7_, i_16_,
					(byte) 48);
		else
		    class173.method2214(i_6_, i_7_, 3 + i_6_, 3 + i_7_, i_16_,
					(byte) 113);
	    }
	}
	interface60
	    = (Interface60) class538.method6591(i, i_4_, i_5_, -1092098896);
	if (null != interface60) {
	    Class596 class596
		= ((Class596)
		   (client.aClass495_10935.method5976((short) 27910).method63
		    (interface60.method397((short) 17661), -2067081812)));
	    int i_17_ = interface60.method384(978783891) & 0x3;
	    if (-1 != class596.anInt7801 * 2063502347)
		Class528_Sub41.method9601(class173, class596, i_17_, i_6_,
					  i_7_, (byte) 4);
	}
    }
    
    static String method3674(String string, int i) {
	if (Class493.aString5525.startsWith("win"))
	    return new StringBuilder().append(string).append(".dll")
		       .toString();
	if (Class493.aString5525.startsWith("linux"))
	    return new StringBuilder().append("lib").append(string).append
		       (".so").toString();
	if (Class493.aString5525.startsWith("mac"))
	    return new StringBuilder().append("lib").append(string).append
		       (".dylib").toString();
	return null;
    }
    
    static final void method3675(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub7_10589,
	     ((((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	      == 1) ? 1 : 0,
	     1615405953);
	Class243.method3387(2136956935);
	client.aBool11161 = false;
    }
    
    static final void method3676(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (Class141_Sub1.aClass528_Sub37_8800.anInt10540 * 428595037 < 512
	       || client.aBool10864 || client.aBool10881) ? 1 : 0;
    }
}
