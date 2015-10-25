/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class108
{
    int anInt1362;
    float aFloat1363 = 1.0F;
    float aFloat1364 = 1.0F;
    int anInt1365;
    int anInt1366;
    int anInt1367;
    int anInt1368;
    float aFloat1369;
    int anInt1370;
    int anInt1371;
    int anInt1372;
    public static Player myPlayer;
    
    Class108(int i, float f, float f_0_, int i_1_, int i_2_, int i_3_) {
	((Class108) this).anInt1368 = i * 323344021;
	((Class108) this).aFloat1363 = f;
	((Class108) this).aFloat1364 = f_0_;
	((Class108) this).anInt1365 = -731787657 * i_1_;
	((Class108) this).anInt1366 = 1335672291 * i_2_;
	((Class108) this).anInt1367 = i_3_ * 1644905941;
    }
    
    Class108 method1373(byte i) {
	return new Class108(((Class108) this).anInt1368 * -1351793475,
			    ((Class108) this).aFloat1363,
			    ((Class108) this).aFloat1364,
			    ((Class108) this).anInt1365 * 1175219015,
			    ((Class108) this).anInt1366 * -467636277,
			    337890173 * ((Class108) this).anInt1367);
    }
    
    Class108(int i) {
	((Class108) this).anInt1368 = i * 323344021;
    }
    
    void method1374(Class108 class108_4_, byte i) {
	((Class108) this).aFloat1363 = ((Class108) class108_4_).aFloat1363;
	((Class108) this).aFloat1364 = ((Class108) class108_4_).aFloat1364;
	((Class108) this).anInt1365 = 1 * ((Class108) class108_4_).anInt1365;
	((Class108) this).anInt1366 = 1 * ((Class108) class108_4_).anInt1366;
	((Class108) this).anInt1368 = 1 * ((Class108) class108_4_).anInt1368;
	((Class108) this).anInt1367 = 1 * ((Class108) class108_4_).anInt1367;
    }
    
    static void method1375(Class173 class173, Class148 class148,
			   Class229 class229, int i, int i_5_, int i_6_,
			   int i_7_, int i_8_, int i_9_) {
	Class239 class239
	    = (Class239) Class208.aClass5_Sub6_2238.method63(i_8_, -775648220);
	if (class239 != null && null != class239.anIntArray2631
	    && class239.method3299(Class570.playerVarsProvider,
				   Class570.playerVarsProvider, -1902203571))
	    class239 = class239.method3304(Class570.playerVarsProvider,
					   Class570.playerVarsProvider, 865737916);
	if (null != class239 && class239.aBool2635
	    && class239.method3299(Class570.playerVarsProvider,
				   Class570.playerVarsProvider, 561692547)) {
	    if (null != class239.anIntArray2632) {
		int[] is = new int[class239.anIntArray2632.length];
		for (int i_10_ = 0; i_10_ < is.length / 2; i_10_++) {
		    int i_11_;
		    if (6 == Class390.anInt4111 * -1860881523)
			i_11_ = ((int) ((double) Class495
						     .aClass283_Sub1_5578
						     .method3792(-16777216)
					* 2607.5945876176133)
				 + -946910725 * client.anInt10852) & 0x3fff;
		    else if (-1860881523 * Class390.anInt4111 == 1)
			i_11_ = (int) client.aFloat11088 & 0x3fff;
		    else
			i_11_ = ((int) client.aFloat11088
				 + client.anInt10852 * -946910725) & 0x3fff;
		    int i_12_ = Class417.anIntArray4766[i_11_];
		    int i_13_ = Class417.anIntArray4767[i_11_];
		    if (1 != -1860881523 * Class390.anInt4111) {
			i_12_ = (i_12_ * 256
				 / (256 + -1303557179 * client.anInt11049));
			i_13_ = (i_13_ * 256
				 / (256 + client.anInt11049 * -1303557179));
		    }
		    is[i_10_ * 2]
			= (class229.anInt2476 * -1352480433 / 2 + i
			   + ((i_12_ * (i_7_ + (class239.anIntArray2632
						[i_10_ * 2 + 1]) * 4)
			       + ((i_6_
				   + class239.anIntArray2632[i_10_ * 2] * 4)
				  * i_13_))
			      >> 14));
		    is[1 + 2 * i_10_]
			= (class229.anInt2458 * 1661025435 / 2 + i_5_
			   - (((class239.anIntArray2632[2 * i_10_ + 1] * 4
				+ i_7_) * i_13_
			       - (i_12_
				  * (4 * class239.anIntArray2632[i_10_ * 2]
				     + i_6_)))
			      >> 14));
		}
		Class243 class243 = class229.method3197(class173, 750998155);
		if (null != class243)
		    Class158.method2040(class173, is,
					class239.anInt2640 * 892082507,
					class243.anIntArray2727,
					class243.anIntArray2726);
		if (-1459473585 * class239.anInt2638 > 0) {
		    for (int i_14_ = 0; i_14_ < is.length / 2 - 1; i_14_++) {
			int i_15_ = is[i_14_ * 2];
			int i_16_ = is[2 * i_14_ + 1];
			int i_17_ = is[(i_14_ + 1) * 2];
			int i_18_ = is[1 + (1 + i_14_) * 2];
			if (i_17_ < i_15_) {
			    int i_19_ = i_15_;
			    int i_20_ = i_16_;
			    i_15_ = i_17_;
			    i_16_ = i_18_;
			    i_17_ = i_19_;
			    i_18_ = i_20_;
			} else if (i_15_ == i_17_ && i_18_ < i_16_) {
			    int i_21_ = i_16_;
			    i_16_ = i_18_;
			    i_18_ = i_21_;
			}
			if (class148 != null)
			    class173.method2222
				(i_15_, i_16_, i_17_, i_18_,
				 (class239.anIntArray2648
				  [class239.aByteArray2646[i_14_] & 0xff]),
				 1, class148, i, i_5_,
				 class239.anInt2638 * -1459473585,
				 class239.anInt2615 * -408396417,
				 1012770115 * class239.anInt2621);
			else
			    class173.method2221
				(i_15_, i_16_, i_17_, i_18_,
				 (class239.anIntArray2648
				  [class239.aByteArray2646[i_14_] & 0xff]),
				 1, class239.anInt2638 * -1459473585,
				 -408396417 * class239.anInt2615,
				 1012770115 * class239.anInt2621);
		    }
		    int i_22_ = is[is.length - 2];
		    int i_23_ = is[is.length - 1];
		    int i_24_ = is[0];
		    int i_25_ = is[1];
		    if (i_24_ < i_22_) {
			int i_26_ = i_22_;
			int i_27_ = i_23_;
			i_22_ = i_24_;
			i_23_ = i_25_;
			i_24_ = i_26_;
			i_25_ = i_27_;
		    } else if (i_24_ == i_22_ && i_25_ < i_23_) {
			int i_28_ = i_23_;
			i_23_ = i_25_;
			i_25_ = i_28_;
		    }
		    if (null != class148)
			class173.method2222(i_22_, i_23_, i_24_, i_25_,
					    (class239.anIntArray2648
					     [(class239.aByteArray2646
					       [(class239.aByteArray2646.length
						 - 1)]) & 0xff]),
					    1, class148, i, i_5_,
					    -1459473585 * class239.anInt2638,
					    -408396417 * class239.anInt2615,
					    class239.anInt2621 * 1012770115);
		    else
			class173.method2221(i_22_, i_23_, i_24_, i_25_,
					    (class239.anIntArray2648
					     [(class239.aByteArray2646
					       [(class239.aByteArray2646.length
						 - 1)]) & 0xff]),
					    1,
					    class239.anInt2638 * -1459473585,
					    -408396417 * class239.anInt2615,
					    class239.anInt2621 * 1012770115);
		} else if (class148 != null) {
		    for (int i_29_ = 0; i_29_ < is.length / 2 - 1; i_29_++)
			class173.method2220(is[2 * i_29_], is[i_29_ * 2 + 1],
					    is[(1 + i_29_) * 2],
					    is[1 + 2 * (1 + i_29_)],
					    (class239.anIntArray2648
					     [(class239.aByteArray2646[i_29_]
					       & 0xff)]),
					    1, class148, i, i_5_);
		    class173.method2220(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class239.anIntArray2648
					 [(class239.aByteArray2646
					   [(class239.aByteArray2646.length
					     - 1)]) & 0xff]),
					1, class148, i, i_5_);
		} else {
		    for (int i_30_ = 0; i_30_ < is.length / 2 - 1; i_30_++)
			class173.method2219(is[2 * i_30_], is[1 + 2 * i_30_],
					    is[(i_30_ + 1) * 2],
					    is[1 + (i_30_ + 1) * 2],
					    (class239.anIntArray2648
					     [(class239.aByteArray2646[i_30_]
					       & 0xff)]),
					    1);
		    class173.method2219(is[is.length - 2], is[is.length - 1],
					is[0], is[1],
					(class239.anIntArray2648
					 [(class239.aByteArray2646
					   [(class239.aByteArray2646.length
					     - 1)]) & 0xff]),
					1);
		}
	    }
	    Class151 class151 = null;
	    if (879785891 * class239.anInt2607 != -1) {
		class151 = class239.method3305(class173, false, -1629461829);
		if (class151 != null) {
		    int i_31_
			= (639550437 * class239.anInt2636 > 0
			   ? 639550437 * class239.anInt2636
			   : Class184.aClass622_2103.anInt8086 * -1939388371);
		    Class273.method3694(class229, class148, i, i_5_, i_6_,
					i_7_, class151, (double) i_31_,
					class239.aClass263_2643,
					class239.aClass257_2628, (byte) 19);
		}
	    }
	    if (null != class239.aString2609) {
		int i_32_ = 0;
		if (null != class151)
		    i_32_ = class151.method1767();
		Class172 class172 = Class378_Sub1_Sub1.aClass172_11264;
		Class1 class1 = Exception_Sub3.aClass1_11221;
		if (1 == class239.anInt2612 * -874915157) {
		    class172 = Class191.aClass172_2171;
		    class1 = Class27.aClass1_253;
		}
		if (2 == -874915157 * class239.anInt2612) {
		    class172 = Class176.aClass172_2027;
		    class1 = Class392.aClass1_4120;
		}
		Class106.method1360(class229, class148, i, i_5_, i_6_, i_7_,
				    i_32_, class239.aString2609, class172,
				    class1, class239.anInt2610 * 1180390923,
				    -1384766626);
	    }
	}
    }
    
    static final void method1376(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aBool10899 ? 1 : 0;
    }
    
    static final void method1377(int i, int i_33_, int i_34_, int i_35_,
				 int i_36_, int i_37_, int i_38_, int i_39_) {
	if (4 == client.anInt10943 * 345087519) {
	    int i_40_ = 1087758653 * GPI.localPlayerCount;
	    int[] is = GPI.localPlayerIndicies;
	    for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
		Player class645_sub1_sub5_sub1_sub2
		    = (client.localPlayers
		       [is[i_41_]]);
		if (null != class645_sub1_sub5_sub1_sub2)
		    class645_sub1_sub5_sub1_sub2.method10701(i, i_33_, i_34_,
							     i_35_, i_36_,
							     i_37_, i_38_,
							     (byte) 101);
	    }
	    for (int i_42_ = 0; i_42_ < client.anInt10922 * -2065344127;
		 i_42_++) {
		int i_43_ = client.anIntArray10923[i_42_];
		Class528_Sub31 class528_sub31
		    = ((Class528_Sub31)
		       client.aClass692_11110.method8137((long) i_43_));
		if (null != class528_sub31)
		    ((Entity) class528_sub31.anObject10468)
			.method10701
			(i, i_33_, i_34_, i_35_, i_36_, i_37_, i_38_,
			 (byte) 73);
	    }
	}
    }
}
