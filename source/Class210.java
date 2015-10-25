/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class210
{
    static int anInt2242;
    String aString2243;
    static int anInt2244;
    
    Class210(ByteBuffer class528_sub42, boolean bool, boolean bool_0_) {
	if (bool)
	    class528_sub42.method9633(771973092);
	if (bool_0_)
	    ((Class210) this).aString2243
		= class528_sub42.method9684((byte) -86);
	else
	    ((Class210) this).aString2243 = null;
    }
    
    public String method2947(int i) {
	return ((Class210) this).aString2243;
    }
    
    public String method2948() {
	return ((Class210) this).aString2243;
    }
    
    static final void method2949(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	if ((((Class648) class648).anIntArray8394
	     [((Class648) class648).anInt8395 * 717927929])
	    > (((Class648) class648).anIntArray8394
	       [((Class648) class648).anInt8395 * 717927929 + 1]))
	    ((Class648) class648).anInt8390
		+= (1888568287
		    * (((Class648) class648).anIntArray8414
		       [-630179809 * ((Class648) class648).anInt8390]));
    }
    
    static final void method2950(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2516
	    = Class181_Sub23.method8999(string, class648, (byte) -24);
	class229.aBool2483 = true;
    }
    
    static final void method2951(Class648 class648, short i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -538831931 * Class54.anInt678;
    }
    
    static final void method2952(Class648 class648, int i) {
	if (client.playerRights * 859247239 >= 2)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 859247239 * client.playerRights;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    public static int method2953(int i, int i_1_) {
	Class528_Sub21_Sub13 class528_sub21_sub13
	    = ((Class528_Sub21_Sub13)
	       Class277.aClass692_3044.method8137((long) i));
	if (class528_sub21_sub13 == null)
	    return -1;
	if (Class277.aClass679_3043.aClass528_Sub21_8561
	    == class528_sub21_sub13.aClass528_Sub21_10406)
	    return -1;
	return (1394353867
		* ((Class528_Sub21_Sub13)
		   class528_sub21_sub13.aClass528_Sub21_10406).anInt11616);
    }
    
    public static final void method2954(int i, int i_2_, int i_3_, int i_4_,
					boolean bool, byte i_5_) {
	if (i_3_ < 1)
	    i_3_ = 1;
	if (i_4_ < 1)
	    i_4_ = 1;
	int i_6_ = i_4_ - 334;
	if (i_6_ < 0)
	    i_6_ = 0;
	else if (i_6_ > 100)
	    i_6_ = 100;
	int i_7_ = ((client.aShort11085 - client.aShort11144) * i_6_ / 100
		    + client.aShort11144);
	int i_8_ = 512 * (i_7_ * i_4_) / (334 * i_3_);
	if (i_8_ < client.aShort10969) {
	    i_8_ = client.aShort10969;
	    i_7_ = 334 * (i_3_ * i_8_) / (512 * i_4_);
	    if (i_7_ > client.aShort11149) {
		i_7_ = client.aShort11149;
		int i_9_ = 512 * (i_4_ * i_7_) / (334 * i_8_);
		int i_10_ = (i_3_ - i_9_) / 2;
		if (bool) {
		    Class587.aClass173_7714.method2203();
		    Class587.aClass173_7714.method2210(i, i_2_, i_10_, i_4_,
						       -16777216, -124244273);
		    Class587.aClass173_7714.method2210(i_3_ + i - i_10_, i_2_,
						       i_10_, i_4_, -16777216,
						       -2047447993);
		}
		i += i_10_;
		i_3_ -= i_10_ * 2;
	    }
	} else if (i_8_ > client.aShort11151) {
	    i_8_ = client.aShort11151;
	    i_7_ = i_3_ * i_8_ * 334 / (512 * i_4_);
	    if (i_7_ < client.aShort11148) {
		i_7_ = client.aShort11148;
		int i_11_ = 334 * (i_8_ * i_3_) / (512 * i_7_);
		int i_12_ = (i_4_ - i_11_) / 2;
		if (bool) {
		    Class587.aClass173_7714.method2203();
		    Class587.aClass173_7714.method2210(i, i_2_, i_3_, i_12_,
						       -16777216, -646715102);
		    Class587.aClass173_7714.method2210(i, i_2_ + i_4_ - i_12_,
						       i_3_, i_12_, -16777216,
						       -587250735);
		}
		i_2_ += i_12_;
		i_4_ -= 2 * i_12_;
	    }
	}
	client.anInt11156 = i_7_ * i_4_ / 334 * -933165621;
	client.anInt11152 = -952407497 * i;
	client.anInt11153 = i_2_ * 62661137;
	client.anInt11154 = (short) i_3_ * -2123379779;
	client.anInt11155 = (short) i_4_ * -1225698623;
    }
    
    static final void method2955(byte i) {
	for (Class528_Sub9 class528_sub9
		 = ((Class528_Sub9)
		    Class528_Sub9.aClass688_10287.method8034(553366998));
	     null != class528_sub9;
	     class528_sub9 = (Class528_Sub9) Class528_Sub9.aClass688_10287
						 .method8037(-730868433))
	    Class154.method1836(class528_sub9, false, 1811553949);
	for (Class528_Sub9 class528_sub9
		 = ((Class528_Sub9)
		    Class528_Sub9.aClass688_10274.method8034(691171664));
	     class528_sub9 != null;
	     class528_sub9 = (Class528_Sub9) Class528_Sub9.aClass688_10274
						 .method8037(-1537954423))
	    Class154.method1836(class528_sub9, true, 1339657384);
    }
    
    static final void method2956(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class467.method5647(class229, class226, class648, 1982725648);
    }
    
    public static void method2957(int i, int i_13_) {
	Class95.aBoolArray1212[i] = false;
	Class33.method760(i, (byte) 46);
    }
}
