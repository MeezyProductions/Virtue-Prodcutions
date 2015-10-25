/* Class526 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class526
{
    static final int anInt7077 = 4;
    static final int anInt7078 = 8;
    static final int anInt7079 = 2;
    static final int anInt7080 = 4;
    static final int anInt7081 = 2;
    static final int anInt7082 = 128;
    static final int anInt7083 = 4;
    static final int anInt7084 = 14;
    static final int anInt7085 = 4;
    static final int anInt7086 = 8;
    static final int anInt7087 = 12;
    static final int anInt7088 = 16;
    static final int anInt7089 = 6;
    static final int anInt7090 = 16;
    static final int anInt7091 = 3;
    static final int anInt7092 = 3;
    static final int anInt7093 = 8;
    static final int anInt7094 = 4;
    static final int anInt7095 = 8;
    
    static final boolean method6393(int i) {
	return i < 7;
    }
    
    static final int method6394(int i) {
	return i < 7 ? 9 : 11;
    }
    
    static final int method6395(int i) {
	if (i < 4)
	    return 0;
	if (i < 10)
	    return i - 3;
	return i - 6;
    }
    
    static final int method6396(int i) {
	if (i < 4)
	    return 0;
	if (i < 10)
	    return i - 3;
	return i - 6;
    }
    
    static final int method6397(int i) {
	return i < 7 ? 7 : 10;
    }
    
    static final int method6398(int i) {
	return i < 7 ? 7 : 10;
    }
    
    static final int method6399(int i) {
	return i < 7 ? 8 : 11;
    }
    
    static final int method6400(int i) {
	return i < 7 ? 8 : 11;
    }
    
    static final int method6401(int i) {
	return i < 7 ? 8 : 11;
    }
    
    static final int method6402(int i) {
	return i < 7 ? 8 : 11;
    }
    
    static final int method6403(int i) {
	return i < 7 ? 8 : 11;
    }
    
    static final int method6404(int i) {
	return i < 7 ? 9 : 11;
    }
    
    static final int method6405(int i) {
	return i < 7 ? 9 : 11;
    }
    
    static final int method6406(int i) {
	return i < 7 ? 7 : 10;
    }
    
    static final int method6407(int i) {
	return i < 7 ? 9 : 11;
    }
    
    static final boolean method6408(int i) {
	return i < 7;
    }
    
    static final boolean method6409(int i) {
	return i < 7;
    }
    
    Class526() throws Throwable {
	throw new Error();
    }
    
    static void method6410(int i) {
	synchronized (Class626.aQueue8135) {
	    Point point;
	    if (Class64.aCanvas754.isShowing())
		point = Class64.aCanvas754.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class528_Sub33_Sub2 class528_sub33_sub2
		    = (Class528_Sub33_Sub2) Class626.aQueue8135.poll();
		if (class528_sub33_sub2 == null)
		    break;
		if (null == point || !Class64.aCanvas754.isShowing()
		    || !Class395.aBool4154)
		    class528_sub33_sub2.method9510((byte) -37);
		else {
		    class528_sub33_sub2.method10603(point, 2079438715);
		    if (!class528_sub33_sub2.method10602(1086239490)
			&& (class528_sub33_sub2.method9494(-1236136691)
			    < Class411.anInt4713 * -1117838587)
			&& (class528_sub33_sub2.method9495((byte) 3)
			    < Class509.anInt6933 * -2142152407)
			&& class528_sub33_sub2.method9494(-1236136691) >= 0
			&& class528_sub33_sub2.method9495((byte) 3) >= 0) {
			int i_0_ = class528_sub33_sub2.method9506((byte) -21);
			if (class528_sub33_sub2.method9506((byte) -101) == -1)
			    Class626.aClass610_Sub1_8134
				.method7245(class528_sub33_sub2, -872860961);
			else if (Class321_Sub2.method9081(i_0_, -1581175193))
			    Class626.aClass610_Sub1_8134
				.method9730(class528_sub33_sub2, 406953288);
		    }
		}
	    }
	}
    }
    
    static final void method6411(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 83224063;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_2_ = ((((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395])
		    << 1);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 2]);
	int i_4_ = (((Class648) class648).anIntArray8394
		    [3 + ((Class648) class648).anInt8395 * 717927929]);
	int i_5_ = (((Class648) class648).anIntArray8394
		    [4 + ((Class648) class648).anInt8395 * 717927929]);
	int i_6_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 5]);
	int i_7_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 6]);
	if (i_1_ >= 0 && i_1_ < 2
	    && client.anIntArrayArrayArray10986[i_1_] != null && i_2_ >= 0
	    && i_2_ < client.anIntArrayArrayArray10986[i_1_].length) {
	    client.anIntArrayArrayArray10986[i_1_][i_2_]
		= new int[] { (i_3_ >> 14 & 0x3fff) << 9, i_4_ << 2,
			      (i_3_ & 0x3fff) << 9, i_7_ };
	    client.anIntArrayArrayArray10986[i_1_][i_2_ + 1]
		= new int[] { (i_5_ >> 14 & 0x3fff) << 9, i_6_ << 2,
			      (i_5_ & 0x3fff) << 9 };
	}
    }
    
    static final void method6412(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_8_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	short i_9_
	    = (short) (((Class648) class648).anIntArray8394
		       [717927929 * ((Class648) class648).anInt8395 + 1]);
	short i_10_
	    = (short) (((Class648) class648).anIntArray8394
		       [717927929 * ((Class648) class648).anInt8395 + 2]);
	if (i_8_ >= 0 && i_8_ < 5) {
	    class229.method3203(i_8_, i_9_, i_10_, (byte) 1);
	    Class39.method811(class229, 1435904523);
	    if (1835803215 * class229.anInt2377 == -1 && !class226.aBool2335)
		Class623_Sub1.method9754(class229.anInt2376 * 306930455, i_8_,
					 (short) -20161);
	}
    }
    
    static int method6413(int i) {
	if (client.aClass229_11067 == null) {
	    if (!Class28.aBool273) {
		if (Class293.aClass597_3223.aBool7853) {
		    if (null != Class587.aClass528_Sub21_Sub11_7715)
			return (918413423
				* (((Class528_Sub21_Sub11)
				    Class587.aClass528_Sub21_Sub11_7715)
				   .anInt11586));
		} else if (null != Class28.aClass528_Sub21_Sub11_271)
		    return (918413423
			    * ((Class528_Sub21_Sub11)
			       Class28.aClass528_Sub21_Sub11_271).anInt11586);
	    } else {
		Class1 class1 = Class106.method1359(-220968233);
		int i_11_
		    = Class95_Sub1_Sub2.aClass537_11200.method6507(1484813308);
		int i_12_ = Class95_Sub1_Sub2.aClass537_11200
				.method6504((byte) -102);
		if (!Class28.aBool264) {
		    if (i_11_ > Class32.anInt309 * -2002292621
			&& i_11_ < (-2002292621 * Class32.anInt309
				    + Class369.anInt3868 * 385971415)) {
			int i_13_ = -1;
			for (int i_14_ = 0;
			     i_14_ < -1024340783 * Class28.anInt303; i_14_++) {
			    if (Class28.aBool257) {
				int i_15_
				    = (1
				       + (-55898191 * class1.anInt12
					  + (684569813 * Class25.anInt239
					     + 20))
				       + ((-1024340783 * Class28.anInt303 - 1
					   - i_14_)
					  * (-812992221 * Class28.anInt260)));
				if ((i_12_
				     > i_15_ - -55898191 * class1.anInt12 - 1)
				    && (i_12_
					< class1.anInt13 * -46594681 + i_15_))
				    i_13_ = i_14_;
			    } else {
				int i_16_
				    = (31 + 684569813 * Class25.anInt239
				       + (Class28.anInt260 * -812992221
					  * (-1024340783 * Class28.anInt303 - 1
					     - i_14_)));
				if ((i_12_
				     > i_16_ - -55898191 * class1.anInt12 - 1)
				    && (i_12_
					< i_16_ + class1.anInt13 * -46594681))
				    i_13_ = i_14_;
			    }
			}
			if (i_13_ != -1) {
			    int i_17_ = 0;
			    Class703 class703
				= new Class703(Class28.aClass688_274);
			    for (Class528_Sub21_Sub11 class528_sub21_sub11
				     = ((Class528_Sub21_Sub11)
					class703.method8230(1406697593));
				 null != class528_sub21_sub11;
				 class528_sub21_sub11 = ((Class528_Sub21_Sub11)
							 class703.next())) {
				if (i_17_++ == i_13_)
				    return (((Class528_Sub21_Sub11)
					     class528_sub21_sub11).anInt11586
					    * 918413423);
			    }
			}
		    }
		} else if (i_11_ > -2002292621 * Class32.anInt309
			   && i_11_ < (385971415 * Class369.anInt3868
				       + Class32.anInt309 * -2002292621)) {
		    int i_18_ = -1;
		    for (int i_19_ = 0; i_19_ < 773625589 * Class28.anInt261;
			 i_19_++) {
			if (Class28.aBool257) {
			    int i_20_ = (Class28.anInt260 * -812992221 * i_19_
					 + (1 + (-55898191 * class1.anInt12
						 + (20 + (Class25.anInt239
							  * 684569813)))));
			    if (i_12_ > i_20_ - -55898191 * class1.anInt12 - 1
				&& i_12_ < i_20_ + -46594681 * class1.anInt13)
				i_18_ = i_19_;
			} else {
			    int i_21_
				= (Class28.anInt260 * -812992221 * i_19_
				   + (684569813 * Class25.anInt239 + 31));
			    if (i_12_ > i_21_ - class1.anInt12 * -55898191 - 1
				&& i_12_ < i_21_ + class1.anInt13 * -46594681)
				i_18_ = i_19_;
			}
		    }
		    if (i_18_ != -1) {
			int i_22_ = 0;
			Class693 class693
			    = new Class693(Class28.aClass679_276);
			for (Class528_Sub21_Sub5 class528_sub21_sub5
				 = ((Class528_Sub21_Sub5)
				    class693.method8161(-440808890));
			     class528_sub21_sub5 != null;
			     class528_sub21_sub5
				 = (Class528_Sub21_Sub5) class693.next()) {
			    if (i_22_++ == i_18_)
				return 918413423 * (((Class528_Sub21_Sub11)
						     (Class528_Sub21_Sub11)
						     (((Class528_Sub21_Sub5)
						       class528_sub21_sub5)
						      .aClass679_11535
						      .aClass528_Sub21_8561
						      .aClass528_Sub21_10408))
						    .anInt11586);
			}
		    }
		} else if (null != Class28.aClass528_Sub21_Sub5_265
			   && i_11_ > 898461861 * Class74.anInt785
			   && i_11_ < (898461861 * Class74.anInt785
				       + (WeakReference_Sub1.anInt11754
					  * -2109025023))) {
		    int i_23_ = -1;
		    for (int i_24_ = 0;
			 (i_24_
			  < 942428025 * (((Class528_Sub21_Sub5)
					  Class28.aClass528_Sub21_Sub5_265)
					 .anInt11534));
			 i_24_++) {
			if (Class28.aBool257) {
			    int i_25_
				= (1
				   + (class1.anInt12 * -55898191
				      + (1577622393 * Class381.anInt3974 + 20))
				   + i_24_ * (Class28.anInt260 * -812992221));
			    if (i_12_ > i_25_ - -55898191 * class1.anInt12 - 1
				&& i_12_ < i_25_ + class1.anInt13 * -46594681)
				i_23_ = i_24_;
			} else {
			    int i_26_
				= (-812992221 * Class28.anInt260 * i_24_
				   + (Class381.anInt3974 * 1577622393 + 31));
			    if (i_12_ > i_26_ - -55898191 * class1.anInt12 - 1
				&& i_12_ < i_26_ + class1.anInt13 * -46594681)
				i_23_ = i_24_;
			}
		    }
		    if (i_23_ != -1) {
			int i_27_ = 0;
			Class693 class693
			    = new Class693(((Class528_Sub21_Sub5)
					    Class28.aClass528_Sub21_Sub5_265)
					   .aClass679_11535);
			for (Class528_Sub21_Sub11 class528_sub21_sub11
				 = ((Class528_Sub21_Sub11)
				    class693.method8161(1936828018));
			     class528_sub21_sub11 != null;
			     class528_sub21_sub11
				 = (Class528_Sub21_Sub11) class693.next()) {
			    if (i_27_++ == i_23_)
				return (((Class528_Sub21_Sub11)
					 class528_sub21_sub11).anInt11586
					* 918413423);
			}
		    }
		}
	    }
	}
	return -1;
    }
    
    public static void method6414(Node node, Node class528_28_,
				  int i) {
	if (null != node.aClass528_7105)
	    node.method6443(-1796378317);
	node.aClass528_7105 = class528_28_.aClass528_7105;
	node.aClass528_7106 = class528_28_;
	node.aClass528_7105.aClass528_7106 = node;
	node.aClass528_7106.aClass528_7105 = node;
    }
    
    static final void method6415(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
    }
    
    static final void method6416(Class648 class648, int i) {
	int i_29_ = -1427801851 * Class5_Sub6.anInt10837;
	int i_30_ = Class453.anInt4977 * 1779729855;
	int i_31_ = -1;
	if (Class700.aBool8733) {
	    Class683[] class683s = Class657.method7850(1239022665);
	    for (int i_32_ = 0; i_32_ < class683s.length; i_32_++) {
		Class683 class683 = class683s[i_32_];
		if (i_29_ == class683.anInt8604 * -1425052405
		    && class683.anInt8605 * -968107603 == i_30_) {
		    i_31_ = i_32_;
		    break;
		}
	    }
	}
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_31_;
    }
}
