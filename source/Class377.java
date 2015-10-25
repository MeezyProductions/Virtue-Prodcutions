/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class377
{
    static Class377 aClass377_3942;
    static Class377 aClass377_3943 = new Class377();
    static Class377 aClass377_3944 = new Class377();
    
    public int method4699(int i, int i_0_) {
	int i_1_ = (-2142152407 * Class509.anInt6933 > i_0_
		    ? -2142152407 * Class509.anInt6933 : i_0_);
	if (aClass377_3943 == this)
	    return 0;
	if (aClass377_3942 == this)
	    return i_1_ - i;
	if (this == aClass377_3944)
	    return (i_1_ - i) / 2;
	return 0;
    }
    
    Class377() {
	/* empty */
    }
    
    static {
	aClass377_3942 = new Class377();
    }
    
    public int method4700(int i, int i_2_, int i_3_) {
	int i_4_ = (-2142152407 * Class509.anInt6933 > i_2_
		    ? -2142152407 * Class509.anInt6933 : i_2_);
	if (aClass377_3943 == this)
	    return 0;
	if (aClass377_3942 == this)
	    return i_4_ - i;
	if (this == aClass377_3944)
	    return (i_4_ - i) / 2;
	return 0;
    }
    
    public int method4701(int i, int i_5_) {
	int i_6_ = (-2142152407 * Class509.anInt6933 > i_5_
		    ? -2142152407 * Class509.anInt6933 : i_5_);
	if (aClass377_3943 == this)
	    return 0;
	if (aClass377_3942 == this)
	    return i_6_ - i;
	if (this == aClass377_3944)
	    return (i_6_ - i) / 2;
	return 0;
    }
    
    static void method4702(Class528_Sub21_Sub5 class528_sub21_sub5, byte i) {
	boolean bool = false;
	class528_sub21_sub5.method9429((byte) -56);
	for (Class528_Sub21_Sub5 class528_sub21_sub5_7_
		 = ((Class528_Sub21_Sub5)
		    Class28.aClass679_276.method7960(-1550587110));
	     null != class528_sub21_sub5_7_;
	     class528_sub21_sub5_7_
		 = ((Class528_Sub21_Sub5)
		    Class28.aClass679_276.method7969(-391305717))) {
	    if (Class46.method863(class528_sub21_sub5.method10482(-774962903),
				  class528_sub21_sub5_7_
				      .method10482(-1037165824),
				  (byte) 58)) {
		Class509.method6236(class528_sub21_sub5,
				    class528_sub21_sub5_7_, 99278520);
		bool = true;
		break;
	    }
	}
	if (!bool)
	    Class28.aClass679_276.method7959(class528_sub21_sub5, -76663264);
    }
    
    static void method4703(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class560_Sub1.method9840(373903307);
    }
    
    static final void method4704(Class648 class648, byte i) {
	int i_8_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = (((Class648) class648).aClass528_Sub36_8416.aClass305Array10498
	       [i_8_].aString3350);
    }
    
    public static int method4705(int i) {
	if (Class700.aBool8733 && Class207.aFrame2236 != null)
	    return 3;
	return client.aBool10929 ? 2 : 1;
    }
    
    static int method4706
	(Player class645_sub1_sub5_sub1_sub2, int i) {
	int i_9_ = class645_sub1_sub5_sub1_sub2.anInt12060 * 1707492535;
	RenderType renderType
	    = class645_sub1_sub5_sub1_sub2.getRender(-664864054);
	int i_10_ = class645_sub1_sub5_sub1_sub2.aClass690_Sub3_11803
			.method8068(-772845955);
	if (i_10_ == -1
	    || class645_sub1_sub5_sub1_sub2.aClass690_Sub3_11803.aBool10798)
	    i_9_ = class645_sub1_sub5_sub1_sub2.anInt12062 * -1616325767;
	else if (630040273 * renderType.anInt7660 == i_10_
		 || i_10_ == renderType.anInt7666 * -1724508225
		 || 384769079 * renderType.anInt7679 == i_10_
		 || renderType.anInt7662 * 888920185 == i_10_)
	    i_9_ = 303614391 * class645_sub1_sub5_sub1_sub2.anInt12048;
	else if (1022705985 * renderType.anInt7664 == i_10_
		 || i_10_ == renderType.anInt7684 * -1467373345
		 || 299271595 * renderType.anInt7667 == i_10_
		 || i_10_ == renderType.anInt7669 * -137509863)
	    i_9_ = class645_sub1_sub5_sub1_sub2.anInt12063 * -50209973;
	return i_9_;
    }
    
    static final void method4707(int i) {
	Class39.method811(client.aClass229_11067, 1435904523);
	ItemType.anInt104 += 10694151;
	if (!client.aBool10890 || !client.aBool11041) {
	    if (-1758535753 * ItemType.anInt104 > 1) {
		client.aClass229_11067 = null;
		client.aClass229_10987 = null;
	    }
	} else {
	    int i_11_
		= Class95_Sub1_Sub2.aClass537_11200.method6507(1299182684);
	    int i_12_
		= Class95_Sub1_Sub2.aClass537_11200.method6504((byte) -32);
	    i_11_ -= client.anInt11069 * -62197331;
	    i_12_ -= -525017675 * client.anInt11070;
	    if (i_11_ < -208716081 * client.anInt11073)
		i_11_ = -208716081 * client.anInt11073;
	    if (i_11_ + client.aClass229_11067.anInt2476 * -1352480433
		> (-208716081 * client.anInt11073
		   + 506740607 * client.anInt11075))
		i_11_ = (-208716081 * client.anInt11073
			 + 506740607 * client.anInt11075
			 - -1352480433 * client.aClass229_11067.anInt2476);
	    if (i_12_ < -255571367 * client.anInt11074)
		i_12_ = client.anInt11074 * -255571367;
	    if (i_12_ + client.aClass229_11067.anInt2458 * 1661025435
		> (-1525398647 * client.anInt11076
		   + -255571367 * client.anInt11074))
		i_12_ = (client.anInt11074 * -255571367
			 + client.anInt11076 * -1525398647
			 - 1661025435 * client.aClass229_11067.anInt2458);
	    int i_13_;
	    int i_14_;
	    if (Class137.aClass229_1632 == client.aClass229_10987) {
		i_13_ = i_11_;
		i_14_ = i_12_;
	    } else {
		i_13_ = (i_11_ - client.anInt11073 * -208716081
			 + client.aClass229_10987.anInt2400 * -1014124179);
		i_14_ = (1665217863 * client.aClass229_10987.anInt2401
			 + (i_12_ - -255571367 * client.anInt11074));
	    }
	    if (!Class95_Sub1_Sub2.aClass537_11200.method6502(1617133131)) {
		if (client.aBool11055) {
		    Class7.method565(-1187426900);
		    if (null != client.aClass229_11067.anObjectArray2493) {
			Class528_Sub30 class528_sub30 = new Class528_Sub30();
			class528_sub30.aClass229_10461
			    = client.aClass229_11067;
			class528_sub30.anInt10459 = -391683557 * i_13_;
			class528_sub30.anInt10464 = 388878445 * i_14_;
			Class229 class229
			    = client.method10202(client.aClass229_11067);
			Class229 class229_15_ = client.aClass229_11071;
			boolean bool = false;
			for (/**/;
			     (class229_15_ != null
			      && -1 != -1027873541 * class229_15_.anInt2522
			      && null != class229);
			     class229_15_
				 = (Class380.aClass226Array3970
				    [class229_15_.anInt2376 * 306930455 >> 16]
				    .aClass229Array2336
				    [(class229_15_.anInt2522 * -1027873541
				      & 0xffff)])) {
			    if (306930455 * class229_15_.anInt2376
				== 306930455 * class229.anInt2376) {
				bool = true;
				break;
			    }
			}
			if (class229_15_ != null && null != class229
			    && Class137.aClass229_1632 != class229 && !bool)
			    class528_sub30.aClass229_10463
				= Class137.aClass229_1632;
			else
			    class528_sub30.aClass229_10463
				= client.aClass229_11071;
			class528_sub30.anObjectArray10460
			    = client.aClass229_11067.anObjectArray2493;
			Class555.method6741(class528_sub30, (short) 11594);
		    }
		    if (client.aClass229_11071 != null
			&& client.method10202(client.aClass229_11067) != null)
			Class242.method3378(client.aClass229_11067,
					    client.aClass229_11071,
					    -520794877);
		} else if ((-1046544163 * client.anInt11046 == 1
			    || Class552.method6715(717927929))
			   && -1024340783 * Class28.anInt303 > 2)
		    Class5_Sub18.method10185((-483492961 * client.anInt11078
					      + client.anInt11069 * -62197331),
					     (client.anInt11070 * -525017675
					      + (-1428876217
						 * client.anInt11079)),
					     (byte) -74);
		else if (Class71.method1096((byte) 98))
		    Class5_Sub18.method10185((-62197331 * client.anInt11069
					      + (client.anInt11078
						 * -483492961)),
					     (-1428876217 * client.anInt11079
					      + (client.anInt11070
						 * -525017675)),
					     (byte) -37);
		client.aClass229_11067 = null;
		client.aClass229_10987 = null;
	    } else {
		if (-1758535753 * ItemType.anInt104
		    > client.aClass229_11067.anInt2480 * 1823380081) {
		    int i_16_ = i_11_ - client.anInt11078 * -483492961;
		    int i_17_ = i_12_ - -1428876217 * client.anInt11079;
		    if (i_16_ > client.aClass229_11067.anInt2510 * 325431661
			|| i_16_ < -(325431661
				     * client.aClass229_11067.anInt2510)
			|| i_17_ > client.aClass229_11067.anInt2510 * 325431661
			|| i_17_ < -(325431661
				     * client.aClass229_11067.anInt2510))
			client.aBool11055 = true;
		}
		if (client.aClass229_11067.anObjectArray2501 != null
		    && client.aBool11055) {
		    Class528_Sub30 class528_sub30 = new Class528_Sub30();
		    class528_sub30.aClass229_10461 = client.aClass229_11067;
		    class528_sub30.anInt10459 = -391683557 * i_13_;
		    class528_sub30.anInt10464 = i_14_ * 388878445;
		    class528_sub30.anObjectArray10460
			= client.aClass229_11067.anObjectArray2501;
		    Class555.method6741(class528_sub30, (short) 3653);
		}
	    }
	}
    }
    
    static final void method4708(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2491
	    = Class181_Sub23.method8999(string, class648, (byte) -48);
	class229.aBool2483 = true;
    }
}
