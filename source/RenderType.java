/* RenderType - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.Iterator;

public class RenderType implements Interface1, Definition
{
    public boolean aBool7650;
    public int[] anIntArray7651;
    public int anInt7652;
    int anInt7653;
    public int anInt7654;
    public int anInt7655;
    public int[] anIntArray7656;
    public int anInt7657;
    public int anInt7658;
    public int anInt7659;
    public int anInt7660;
    public int anInt7661;
    public int anInt7662;
    public int anInt7663 = 193300033;
    public int anInt7664;
    public int anInt7665;
    public int anInt7666;
    public int anInt7667;
    public int anInt7668;
    public int anInt7669;
    public int anInt7670;
    public int anInt7671;
    public int anInt7672;
    public int anInt7673;
    public int anInt7674;
    public int[][] anIntArrayArray7675;
    public int anInt7676;
    public int anInt7677;
    public int[][] anIntArrayArray7678;
    public int anInt7679;
    Class433[] aClass433Array7680;
    public int[] anIntArray7681;
    public int[] anIntArray7682;
    public int anInt7683;
    public int anInt7684;
    public int anInt7685;
    public int anInt7686;
    public int anInt7687;
    public int anInt7688;
    public int anInt7689;
    public int anInt7690;
    public int anInt7691;
    public int anInt7692;
    public int anInt7693;
    
    public void method59() {
	/* empty */
    }
    
    RenderType(int i) {
	anIntArray7651 = null;
	anIntArray7656 = null;
	((RenderType) this).anInt7653 = 0;
	anInt7658 = 799785271;
	anInt7655 = -1879200517;
	anInt7673 = -1861914827;
	anInt7657 = 1496277299;
	anInt7665 = 1205396177;
	anInt7659 = 1919874223;
	anInt7660 = -2088399409;
	anInt7666 = -706336831;
	anInt7662 = 784657975;
	anInt7679 = 1355851385;
	anInt7664 = -1261981377;
	anInt7684 = 1112272097;
	anInt7669 = 702851031;
	anInt7667 = -1960332547;
	anInt7668 = 2060249363;
	anInt7672 = -2044748671;
	anInt7670 = -1819132355;
	anInt7671 = -2076792745;
	anInt7693 = -234703691;
	anInt7654 = -898065455;
	anInt7674 = 0;
	anInt7652 = 0;
	anInt7676 = 0;
	anInt7677 = 0;
	anInt7683 = 0;
	anInt7661 = 0;
	anInt7685 = 0;
	anInt7686 = 0;
	anInt7687 = 0;
	anInt7688 = 0;
	anInt7689 = 0;
	anInt7690 = 0;
	anInt7691 = -1706475439;
	anInt7692 = -1124942697;
	aBool7650 = true;
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 70);
	    if (i_0_ == 0)
		break;
	    method6979(class528_sub42, i_0_, 1100212455);
	}
    }
    
    void method6979(ByteBuffer class528_sub42, int i, int i_1_) {
	if (1 == i) {
	    anInt7663 = class528_sub42.method9645((short) 23623) * -193300033;
	    anInt7673 = class528_sub42.method9645((short) 2005) * 1861914827;
	} else if (2 == i)
	    anInt7664 = class528_sub42.method9645((short) -2327) * 1261981377;
	else if (i == 3)
	    anInt7684 = class528_sub42.method9645((short) 27245) * -1112272097;
	else if (i == 4)
	    anInt7669 = class528_sub42.method9645((short) 2867) * -702851031;
	else if (i == 5)
	    anInt7667 = class528_sub42.method9645((short) 2166) * 1960332547;
	else if (6 == i)
	    anInt7660 = class528_sub42.method9645((short) -16759) * 2088399409;
	else if (7 == i)
	    anInt7666 = class528_sub42.method9645((short) 813) * 706336831;
	else if (i == 8)
	    anInt7662 = class528_sub42.method9645((short) -25420) * -784657975;
	else if (9 == i)
	    anInt7679
		= class528_sub42.method9645((short) -10307) * -1355851385;
	else if (i == 26) {
	    anInt7674 = ((short) (class528_sub42.readUnsignedByte((byte) 122) * 4)
			 * 1364332145);
	    anInt7652 = ((short) (class528_sub42.readUnsignedByte((byte) 40) * 4)
			 * 2064816729);
	} else if (27 == i) {
	    int i_2_ = class528_sub42.readUnsignedByte((byte) 52);
	    if (anIntArrayArray7678 == null)
		anIntArrayArray7678 = new int[1 + i_2_][];
	    else if (i_2_ >= anIntArrayArray7678.length)
		anIntArrayArray7678
		    = (int[][]) Arrays.copyOf(anIntArrayArray7678, i_2_ + 1);
	    anIntArrayArray7678[i_2_] = new int[6];
	    for (int i_3_ = 0; i_3_ < 6; i_3_++)
		anIntArrayArray7678[i_2_][i_3_]
		    = class528_sub42.method9642(1808447578);
	} else if (i == 28) {
	    int i_4_ = class528_sub42.readUnsignedByte((byte) 8);
	    anIntArray7682 = new int[i_4_];
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		anIntArray7682[i_5_] = class528_sub42.readUnsignedByte((byte) 88);
		if (255 == anIntArray7682[i_5_])
		    anIntArray7682[i_5_] = -1;
	    }
	} else if (29 == i)
	    anInt7683 = class528_sub42.readUnsignedByte((byte) 15) * -1809591061;
	else if (i == 30)
	    anInt7661 = class528_sub42.readUnsignedShort(-1321340648) * 540295553;
	else if (i == 31)
	    anInt7685 = class528_sub42.readUnsignedByte((byte) 10) * 1060216487;
	else if (i == 32)
	    anInt7686 = class528_sub42.readUnsignedShort(404880699) * -1446048089;
	else if (33 == i)
	    anInt7687 = class528_sub42.method9642(-1919425634) * -1285489835;
	else if (i == 34)
	    anInt7688 = class528_sub42.readUnsignedByte((byte) 117) * 442167691;
	else if (i == 35)
	    anInt7689 = class528_sub42.readUnsignedShort(342443048) * -1610759163;
	else if (i == 36)
	    anInt7690 = class528_sub42.method9642(1599208436) * -402909081;
	else if (i == 37)
	    anInt7691 = class528_sub42.readUnsignedByte((byte) 1) * 1706475439;
	else if (i == 38)
	    anInt7658 = class528_sub42.method9645((short) 9388) * -799785271;
	else if (i == 39)
	    anInt7655 = class528_sub42.method9645((short) 7968) * 1879200517;
	else if (i == 40)
	    anInt7657 = class528_sub42.method9645((short) -2625) * -1496277299;
	else if (41 == i)
	    anInt7665 = class528_sub42.method9645((short) 5278) * -1205396177;
	else if (42 == i)
	    anInt7659
		= class528_sub42.method9645((short) -15803) * -1919874223;
	else if (i == 43)
	    class528_sub42.readUnsignedShort(-1633376956);
	else if (44 == i)
	    class528_sub42.readUnsignedShort(36073708);
	else if (45 == i)
	    anInt7692 = class528_sub42.readUnsignedShort(-1898687882) * 1124942697;
	else if (i == 46)
	    anInt7668
		= class528_sub42.method9645((short) -13407) * -2060249363;
	else if (i == 47)
	    anInt7672 = class528_sub42.method9645((short) 21885) * 2044748671;
	else if (48 == i)
	    anInt7670 = class528_sub42.method9645((short) -24625) * 1819132355;
	else if (49 == i)
	    anInt7671 = class528_sub42.method9645((short) 4924) * 2076792745;
	else if (50 == i)
	    anInt7693 = class528_sub42.method9645((short) -9476) * 234703691;
	else if (i == 51)
	    anInt7654 = class528_sub42.method9645((short) -20178) * 898065455;
	else if (52 == i) {
	    int i_6_ = class528_sub42.readUnsignedByte((byte) 53);
	    anIntArray7651 = new int[i_6_];
	    anIntArray7656 = new int[i_6_];
	    for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
		anIntArray7651[i_7_]
		    = class528_sub42.method9645((short) -8106);
		int i_8_ = class528_sub42.readUnsignedByte((byte) 24);
		anIntArray7656[i_7_] = i_8_;
		((RenderType) this).anInt7653 += i_8_ * -1834855167;
	    }
	} else if (53 == i)
	    aBool7650 = false;
	else if (i == 54) {
	    anInt7676
		= (class528_sub42.readUnsignedByte((byte) 91) << 6) * 216620307;
	    anInt7677
		= (class528_sub42.readUnsignedByte((byte) 85) << 6) * -1640903863;
	} else if (55 == i) {
	    int i_9_ = class528_sub42.readUnsignedByte((byte) 55);
	    if (anIntArray7681 == null)
		anIntArray7681 = new int[1 + i_9_];
	    else if (i_9_ >= anIntArray7681.length)
		anIntArray7681 = Arrays.copyOf(anIntArray7681, 1 + i_9_);
	    anIntArray7681[i_9_] = class528_sub42.readUnsignedShort(-853449930);
	} else if (56 == i) {
	    int i_10_ = class528_sub42.readUnsignedByte((byte) 73);
	    if (null == anIntArrayArray7675)
		anIntArrayArray7675 = new int[1 + i_10_][];
	    else if (i_10_ >= anIntArrayArray7675.length)
		anIntArrayArray7675
		    = (int[][]) Arrays.copyOf(anIntArrayArray7675, i_10_ + 1);
	    anIntArrayArray7675[i_10_] = new int[3];
	    for (int i_11_ = 0; i_11_ < 3; i_11_++)
		anIntArrayArray7675[i_10_][i_11_]
		    = class528_sub42.method9642(-244769617);
	}
    }
    
    public int[] method6980(byte i) {
	Class692 class692 = new Class692(16);
	Class385.method4734(-1581091265 * anInt7663, class692, -1889608824);
	if (anIntArray7651 != null) {
	    int[] is = anIntArray7651;
	    for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
		int i_13_ = is[i_12_];
		Class385.method4734(i_13_, class692, -1889608824);
	    }
	}
	Class385.method4734(anInt7658 * -49923207, class692, -1889608824);
	Class385.method4734(anInt7655 * -965312051, class692, -1889608824);
	Class385.method4734(1376605411 * anInt7673, class692, -1889608824);
	Class385.method4734(anInt7657 * -959152635, class692, -1889608824);
	Class385.method4734(-1635563057 * anInt7665, class692, -1889608824);
	Class385.method4734(-1883300431 * anInt7659, class692, -1889608824);
	Class385.method4734(630040273 * anInt7660, class692, -1889608824);
	Class385.method4734(anInt7666 * -1724508225, class692, -1889608824);
	Class385.method4734(anInt7662 * 888920185, class692, -1889608824);
	Class385.method4734(anInt7679 * 384769079, class692, -1889608824);
	Class385.method4734(1022705985 * anInt7664, class692, -1889608824);
	Class385.method4734(anInt7684 * -1467373345, class692, -1889608824);
	Class385.method4734(-137509863 * anInt7669, class692, -1889608824);
	Class385.method4734(anInt7667 * 299271595, class692, -1889608824);
	Class385.method4734(anInt7668 * -1023363355, class692, -1889608824);
	Class385.method4734(1016290431 * anInt7672, class692, -1889608824);
	Class385.method4734(anInt7670 * 136328939, class692, -1889608824);
	Class385.method4734(176635033 * anInt7671, class692, -1889608824);
	Class385.method4734(-307992989 * anInt7693, class692, -1889608824);
	Class385.method4734(anInt7654 * -2003541297, class692, -1889608824);
	int[] is = new int[class692.method8139((short) 2443)];
	int i_14_ = 0;
	Iterator iterator = class692.iterator();
	while (iterator.hasNext()) {
	    Node node = (Node) iterator.next();
	    is[i_14_++] = (int) (node.aLong7107 * -4849232331708333273L);
	}
	return is;
    }
    
    public void method9(int i, byte i_15_) {
	/* empty */
    }
    
    public boolean method6981(int i, int i_16_) {
	if (i == -1)
	    return false;
	if (i == -1581091265 * anInt7663)
	    return true;
	if (null != anIntArray7651) {
	    for (int i_17_ = 0; i_17_ < anIntArray7651.length; i_17_++) {
		if (i == anIntArray7651[i_17_])
		    return true;
	    }
	}
	return false;
    }
    
    public Class433[] method6982(int i) {
	if (((RenderType) this).aClass433Array7680 != null)
	    return ((RenderType) this).aClass433Array7680;
	if (anIntArrayArray7678 == null)
	    return null;
	((RenderType) this).aClass433Array7680
	    = new Class433[anIntArrayArray7678.length];
	for (int i_18_ = 0; i_18_ < anIntArrayArray7678.length; i_18_++) {
	    int i_19_ = 0;
	    int i_20_ = 0;
	    int i_21_ = 0;
	    int i_22_ = 0;
	    int i_23_ = 0;
	    int i_24_ = 0;
	    if (anIntArrayArray7678[i_18_] != null) {
		i_19_ = anIntArrayArray7678[i_18_][0];
		i_20_ = anIntArrayArray7678[i_18_][1];
		i_21_ = anIntArrayArray7678[i_18_][2];
		i_22_ = anIntArrayArray7678[i_18_][3] << 3;
		i_23_ = anIntArrayArray7678[i_18_][4] << 3;
		i_24_ = anIntArrayArray7678[i_18_][5] << 3;
	    }
	    if (0 != i_19_ || 0 != i_20_ || 0 != i_21_ || i_22_ != 0
		|| 0 != i_23_ || i_24_ != 0) {
		Class433 class433
		    = (((RenderType) this).aClass433Array7680[i_18_]
		       = new Class433());
		if (0 != i_24_)
		    class433.method5256(0.0F, 0.0F, 1.0F,
					Class417.method4970(i_24_));
		if (0 != i_22_)
		    class433.method5256(1.0F, 0.0F, 0.0F,
					Class417.method4970(i_22_));
		if (0 != i_23_)
		    class433.method5256(0.0F, 1.0F, 0.0F,
					Class417.method4970(i_23_));
		class433.method5252((float) i_19_, (float) i_20_,
				    (float) i_21_);
	    }
	}
	return ((RenderType) this).aClass433Array7680;
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    public void method8(int i) {
	/* empty */
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 19);
	    if (i == 0)
		break;
	    method6979(class528_sub42, i, -77819782);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 32);
	    if (i == 0)
		break;
	    method6979(class528_sub42, i, -1861372990);
	}
    }
    
    public int method6983(int i) {
	if (-1581091265 * anInt7663 != -1)
	    return -1581091265 * anInt7663;
	if (anIntArray7651 != null) {
	    int i_25_
		= (int) (Math.random()
			 * (double) (((RenderType) this).anInt7653 * 815180545));
	    int i_26_;
	    for (i_26_ = 0; i_25_ >= anIntArray7656[i_26_]; i_26_++)
		i_25_ -= anIntArray7656[i_26_];
	    return anIntArray7651[i_26_];
	}
	return -1;
    }
    
    public boolean method6984(int i) {
	if (i == -1)
	    return false;
	if (i == -1581091265 * anInt7663)
	    return true;
	if (null != anIntArray7651) {
	    for (int i_27_ = 0; i_27_ < anIntArray7651.length; i_27_++) {
		if (i == anIntArray7651[i_27_])
		    return true;
	    }
	}
	return false;
    }
    
    public int method6985() {
	if (-1581091265 * anInt7663 != -1)
	    return -1581091265 * anInt7663;
	if (anIntArray7651 != null) {
	    int i
		= (int) (Math.random()
			 * (double) (((RenderType) this).anInt7653 * 815180545));
	    int i_28_;
	    for (i_28_ = 0; i >= anIntArray7656[i_28_]; i_28_++)
		i -= anIntArray7656[i_28_];
	    return anIntArray7651[i_28_];
	}
	return -1;
    }
    
    public int method6986() {
	if (-1581091265 * anInt7663 != -1)
	    return -1581091265 * anInt7663;
	if (anIntArray7651 != null) {
	    int i
		= (int) (Math.random()
			 * (double) (((RenderType) this).anInt7653 * 815180545));
	    int i_29_;
	    for (i_29_ = 0; i >= anIntArray7656[i_29_]; i_29_++)
		i -= anIntArray7656[i_29_];
	    return anIntArray7651[i_29_];
	}
	return -1;
    }
    
    public int[] method6987() {
	Class692 class692 = new Class692(16);
	Class385.method4734(-1581091265 * anInt7663, class692, -1889608824);
	if (anIntArray7651 != null) {
	    int[] is = anIntArray7651;
	    for (int i = 0; i < is.length; i++) {
		int i_30_ = is[i];
		Class385.method4734(i_30_, class692, -1889608824);
	    }
	}
	Class385.method4734(anInt7658 * -49923207, class692, -1889608824);
	Class385.method4734(anInt7655 * -965312051, class692, -1889608824);
	Class385.method4734(1376605411 * anInt7673, class692, -1889608824);
	Class385.method4734(anInt7657 * -959152635, class692, -1889608824);
	Class385.method4734(-1635563057 * anInt7665, class692, -1889608824);
	Class385.method4734(-1883300431 * anInt7659, class692, -1889608824);
	Class385.method4734(630040273 * anInt7660, class692, -1889608824);
	Class385.method4734(anInt7666 * -1724508225, class692, -1889608824);
	Class385.method4734(anInt7662 * 888920185, class692, -1889608824);
	Class385.method4734(anInt7679 * 384769079, class692, -1889608824);
	Class385.method4734(1022705985 * anInt7664, class692, -1889608824);
	Class385.method4734(anInt7684 * -1467373345, class692, -1889608824);
	Class385.method4734(-137509863 * anInt7669, class692, -1889608824);
	Class385.method4734(anInt7667 * 299271595, class692, -1889608824);
	Class385.method4734(anInt7668 * -1023363355, class692, -1889608824);
	Class385.method4734(1016290431 * anInt7672, class692, -1889608824);
	Class385.method4734(anInt7670 * 136328939, class692, -1889608824);
	Class385.method4734(176635033 * anInt7671, class692, -1889608824);
	Class385.method4734(-307992989 * anInt7693, class692, -1889608824);
	Class385.method4734(anInt7654 * -2003541297, class692, -1889608824);
	int[] is = new int[class692.method8139((short) 25748)];
	int i = 0;
	Iterator iterator = class692.iterator();
	while (iterator.hasNext()) {
	    Node node = (Node) iterator.next();
	    is[i++] = (int) (node.aLong7107 * -4849232331708333273L);
	}
	return is;
    }
    
    RenderType() {
	anIntArray7651 = null;
	anIntArray7656 = null;
	((RenderType) this).anInt7653 = 0;
	anInt7658 = 799785271;
	anInt7655 = -1879200517;
	anInt7673 = -1861914827;
	anInt7657 = 1496277299;
	anInt7665 = 1205396177;
	anInt7659 = 1919874223;
	anInt7660 = -2088399409;
	anInt7666 = -706336831;
	anInt7662 = 784657975;
	anInt7679 = 1355851385;
	anInt7664 = -1261981377;
	anInt7684 = 1112272097;
	anInt7669 = 702851031;
	anInt7667 = -1960332547;
	anInt7668 = 2060249363;
	anInt7672 = -2044748671;
	anInt7670 = -1819132355;
	anInt7671 = -2076792745;
	anInt7693 = -234703691;
	anInt7654 = -898065455;
	anInt7674 = 0;
	anInt7652 = 0;
	anInt7676 = 0;
	anInt7677 = 0;
	anInt7683 = 0;
	anInt7661 = 0;
	anInt7685 = 0;
	anInt7686 = 0;
	anInt7687 = 0;
	anInt7688 = 0;
	anInt7689 = 0;
	anInt7690 = 0;
	anInt7691 = -1706475439;
	anInt7692 = -1124942697;
	aBool7650 = true;
    }
    
    static final void method6988(Class648 class648, byte i) {
	int i_31_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (((ItemType) Class18.aClass5_Sub13_206.method63(i_31_, 1402427092))
	       .anInt48) * -873846025;
    }
    
    static final void method6989(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class181.method2686(-1712965615) ? 1 : 0;
    }
    
    public static void method6990(int[] is, Object[] objects, int i, int i_32_,
				  int i_33_) {
	if (i < i_32_) {
	    int i_34_ = (i + i_32_) / 2;
	    int i_35_ = i;
	    int i_36_ = is[i_34_];
	    is[i_34_] = is[i_32_];
	    is[i_32_] = i_36_;
	    Object object = objects[i_34_];
	    objects[i_34_] = objects[i_32_];
	    objects[i_32_] = object;
	    int i_37_ = 2147483647 == i_36_ ? 0 : 1;
	    for (int i_38_ = i; i_38_ < i_32_; i_38_++) {
		if (is[i_38_] < (i_38_ & i_37_) + i_36_) {
		    int i_39_ = is[i_38_];
		    is[i_38_] = is[i_35_];
		    is[i_35_] = i_39_;
		    Object object_40_ = objects[i_38_];
		    objects[i_38_] = objects[i_35_];
		    objects[i_35_++] = object_40_;
		}
	    }
	    is[i_32_] = is[i_35_];
	    is[i_35_] = i_36_;
	    objects[i_32_] = objects[i_35_];
	    objects[i_35_] = object;
	    method6990(is, objects, i, i_35_ - 1, 707381032);
	    method6990(is, objects, i_35_ + 1, i_32_, -1803332499);
	}
    }
    
    static boolean method6991(Interface60 interface60, int i) {
	Class596 class596
	    = ((Class596)
	       (client.gameScene.method5976((short) 21786).method63
		(interface60.method397((short) 7976), -1458438665)));
	if (class596.anInt7801 * 2063502347 == -1)
	    return true;
	Class53 class53
	    = ((Class53)
	       Class316_Sub3.aClass5_Sub16_10053
		   .method63(2063502347 * class596.anInt7801, 2039115817));
	if (class53.anInt618 * 2038482793 == -1)
	    return true;
	return class53.method922(-141438179);
    }
    
    static final void method6992(Class648 class648, short i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 479568233 * Class547.anInt7413;
    }
    
    public static int[] method6993(int i, int i_41_, int i_42_, int i_43_,
				   int i_44_, float f, boolean bool,
				   short i_45_) {
	int[] is = new int[i];
	Class528_Sub41_Sub1 class528_sub41_sub1 = new Class528_Sub41_Sub1();
	((Class528_Sub41_Sub1) class528_sub41_sub1).anInt11733
	    = 113833973 * i_41_;
	((Class528_Sub41_Sub1) class528_sub41_sub1).aBool11741 = bool;
	((Class528_Sub41_Sub1) class528_sub41_sub1).anInt11737
	    = i_42_ * 312094341;
	((Class528_Sub41_Sub1) class528_sub41_sub1).anInt11738
	    = i_43_ * -1077570331;
	((Class528_Sub41_Sub1) class528_sub41_sub1).anInt11739
	    = i_44_ * 678079845;
	((Class528_Sub41_Sub1) class528_sub41_sub1).anInt11740
	    = (int) (4096.0F * f) * -1023698515;
	class528_sub41_sub1.method10650(-1087215923);
	Class66.method1063(i, 1, (byte) -119);
	class528_sub41_sub1.method10652(0, is, (byte) 2);
	return is;
    }
}
