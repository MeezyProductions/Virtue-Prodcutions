/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class209 implements Interface26
{
    Class207 this$0;
    Class210 aClass210_2241;
    
    public void method138(Class216 class216) {
	class216.method3032(((Class209) this).aClass210_2241, -53619352);
    }
    
    public void method140(Class216 class216, int i) {
	class216.method3032(((Class209) this).aClass210_2241, -53619352);
    }
    
    public void method141(Class216 class216) {
	class216.method3032(((Class209) this).aClass210_2241, -53619352);
    }
    
    public void method139(Class216 class216) {
	class216.method3032(((Class209) this).aClass210_2241, -53619352);
    }
    
    Class209(Class207 class207, ByteBuffer class528_sub42) {
	((Class209) this).this$0 = class207;
	boolean bool = class528_sub42.readUnsignedByte((byte) 94) != 255;
	if (bool)
	    class528_sub42.pointer -= 2015001547;
	((Class209) this).aClass210_2241
	    = new Class210(class528_sub42, bool, true);
    }
    
    public static void method2935(int i) {
	if ((175711435 * client.anInt10876 == 9
	     || 175711435 * client.anInt10876 == 1)
	    && null != client.aClass109_10930) {
	    for (;;) {
		Interface63 interface63
		    = (Interface63) Class570.aLinkedList7556.poll();
		if (interface63 == null)
		    break;
		interface63.method309(-116300036);
	    }
	}
    }
    
    public static Class602_Sub1 method2936(int i, int i_0_) {
	if (!Class604.aBool7888 || i < Class604.anInt7889 * 973177359
	    || i > -1941954941 * Class533.anInt7132)
	    return null;
	return (Class201.aClass602_Sub1Array2210
		[i - Class604.anInt7889 * 973177359]);
    }
    
    static void method2937(Class648 class648, int i) {
	((Class648) class648).anInt8410 -= -1094513834;
	String string
	    = (String) (((Class648) class648).anObjectArray8396
			[((Class648) class648).anInt8410 * -520794877]);
	String string_1_
	    = (String) (((Class648) class648).anObjectArray8396
			[1 + ((Class648) class648).anInt8410 * -520794877]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class443.method5324(string, string_1_, 1529072800);
    }
    
    static final void method2938(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class641.method7600(class229, class226, class648, 806224668);
    }
    
    static final void method2939(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class181_Sub17.method8976(class229, class648, (byte) -13);
    }
    
    static final void method2940(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2485
	    = Class181_Sub23.method8999(string, class648, (byte) 49);
	class229.aBool2483 = true;
    }
    
    static final void method2941(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class365.method4636(class229, class226, class648, -1077380716);
    }
    
    static final void method2942(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub15_10566
		  .method9938(899131453) == 2 ? 1 : 0;
    }
    
    static final void method2943(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (Class495.aClass283_Sub1_5578.method3786((byte) 58) == null ? -1
	       : (Class495.aClass283_Sub1_5578.method3786((byte) 84).anInt3224
		  * 2019281651));
    }
    
    static final void method2944(int i) {
	client.anInt10895 = -258800089;
	client.anInt10943 = 975796092;
	Class487.aClass528_Sub42_5493 = null;
	Class602_Sub1.method9587(-625442181);
    }
    
    static final boolean method2945(Class546[][][] class546s, int i, int i_2_,
				    int i_3_, boolean bool, int i_4_) {
	byte[][][] is = client.gameScene.method5978((byte) -30);
	byte i_5_ = (bool ? (byte) 1
		     : (byte) (-2032978979 * client.anInt10968 & 0xff));
	if (is[1926870089 * Class181_Sub5.anInt9778][i_2_][i_3_] == i_5_)
	    return false;
	Class466 class466 = client.gameScene.method6006((byte) 0);
	if (0 == ((class466.aByteArrayArrayArray5312
		   [1926870089 * Class181_Sub5.anInt9778][i_2_][i_3_])
		  & 0x4))
	    return false;
	int i_6_ = 0;
	int i_7_ = 0;
	client.anIntArray10955[i_6_] = i_2_;
	client.anIntArray10865[i_6_++] = i_3_;
	is[1926870089 * Class181_Sub5.anInt9778][i_2_][i_3_] = i_5_;
	while (i_6_ != i_7_) {
	    int i_8_ = client.anIntArray10955[i_7_] & 0xffff;
	    int i_9_ = client.anIntArray10955[i_7_] >> 16 & 0xff;
	    int i_10_ = client.anIntArray10955[i_7_] >> 24 & 0xff;
	    int i_11_ = client.anIntArray10865[i_7_] & 0xffff;
	    int i_12_ = client.anIntArray10865[i_7_] >> 16 & 0xff;
	    i_7_ = i_7_ + 1 & 0xfff;
	    boolean bool_13_ = false;
	    if (0 == ((class466.aByteArrayArrayArray5312
		       [Class181_Sub5.anInt9778 * 1926870089][i_8_][i_11_])
		      & 0x4))
		bool_13_ = true;
	    boolean bool_14_ = false;
	    if (null != class546s) {
		int i_15_ = 1 + 1926870089 * Class181_Sub5.anInt9778;
	    while_60_:
		for (/**/; i_15_ <= 3; i_15_++) {
		    if (class546s[i_15_] != null
			&& 0 == ((class466.aByteArrayArrayArray5312[i_15_]
				  [i_8_][i_11_])
				 & 0x8)) {
			if (bool_13_
			    && class546s[i_15_][i_8_][i_11_] != null) {
			    if (null != (class546s[i_15_][i_8_][i_11_]
					 .aClass645_Sub1_Sub3_7393)) {
				int i_16_
				    = Class407.method4884(i_9_, 1945451655);
				if (((class546s[i_15_][i_8_][i_11_]
				      .aClass645_Sub1_Sub3_7393.aShort11707)
				     == i_16_)
				    || ((class546s[i_15_][i_8_][i_11_]
					 .aClass645_Sub1_Sub3_7394) != null
					&& i_16_ == (class546s[i_15_][i_8_]
						     [i_11_]
						     .aClass645_Sub1_Sub3_7394
						     .aShort11707)))
				    continue;
				if (i_10_ != 0) {
				    int i_17_
					= Class407.method4884(i_10_,
							      -1536731587);
				    if ((class546s[i_15_][i_8_][i_11_]
					 .aClass645_Sub1_Sub3_7393
					 .aShort11707) == i_17_
					|| ((class546s[i_15_][i_8_][i_11_]
					     .aClass645_Sub1_Sub3_7394) != null
					    && (i_17_
						== (class546s[i_15_][i_8_]
						    [i_11_]
						    .aClass645_Sub1_Sub3_7394
						    .aShort11707))))
					continue;
				}
				if (0 != i_12_) {
				    int i_18_
					= Class407.method4884(i_12_, 86505931);
				    if ((class546s[i_15_][i_8_][i_11_]
					 .aClass645_Sub1_Sub3_7393
					 .aShort11707) == i_18_
					|| (null != (class546s[i_15_][i_8_]
						     [i_11_]
						     .aClass645_Sub1_Sub3_7394)
					    && (i_18_
						== (class546s[i_15_][i_8_]
						    [i_11_]
						    .aClass645_Sub1_Sub3_7394
						    .aShort11707))))
					continue;
				}
			    }
			    Class546 class546 = class546s[i_15_][i_8_][i_11_];
			    if (class546.aClass542_7399 != null) {
				for (Class542 class542
					 = class546.aClass542_7399;
				     class542 != null;
				     class542 = class542.aClass542_7238) {
				    Class645_Sub1_Sub5 class645_sub1_sub5
					= class542.aClass645_Sub1_Sub5_7239;
				    if (class645_sub1_sub5
					instanceof Interface60) {
					Interface60 interface60
					    = (Interface60) class645_sub1_sub5;
					int i_19_
					    = interface60
						  .method168(-1202126205);
					int i_20_ = interface60
							.method384(1901184050);
					if (21 == i_19_)
					    i_19_ = 19;
					int i_21_ = i_19_ | i_20_ << 6;
					if (i_9_ == i_21_
					    || 0 != i_10_ && i_10_ == i_21_
					    || 0 != i_12_ && i_21_ == i_12_)
					    continue while_60_;
				    }
				}
			    }
			}
			Class546 class546 = class546s[i_15_][i_8_][i_11_];
			if (null != class546
			    && class546.aClass542_7399 != null) {
			    for (Class542 class542 = class546.aClass542_7399;
				 null != class542;
				 class542 = class542.aClass542_7238) {
				Class645_Sub1_Sub5 class645_sub1_sub5
				    = class542.aClass645_Sub1_Sub5_7239;
				if ((class645_sub1_sub5.aShort11747
				     != class645_sub1_sub5.aShort11743)
				    || (class645_sub1_sub5.aShort11746
					!= class645_sub1_sub5.aShort11745)) {
				    short i_22_
					= class645_sub1_sub5.aShort11747;
				    short i_23_
					= class645_sub1_sub5.aShort11743;
				    short i_24_
					= class645_sub1_sub5.aShort11745;
				    short i_25_
					= class645_sub1_sub5.aShort11746;
				    int i_26_
					= Math.max(0,
						   Math.min(i_22_,
							    (is[i_15_].length
							     - 1)));
				    int i_27_
					= Math.max(0,
						   Math.min(i_24_,
							    (is[i_15_]
							     [0]).length - 1));
				    int i_28_
					= Math.max(0,
						   Math.min(i_23_,
							    (is[i_15_].length
							     - 1)));
				    int i_29_
					= Math.max(0,
						   Math.min(i_25_,
							    (is[i_15_]
							     [0]).length - 1));
				    for (/**/; i_26_ <= i_28_; i_26_++) {
					for (/**/; i_27_ <= i_29_; i_27_++)
					    is[i_15_][i_26_][i_27_] = i_5_;
				    }
				}
			    }
			}
			is[i_15_][i_8_][i_11_] = i_5_;
			bool_14_ = true;
		    }
		}
	    }
	    if (bool_14_) {
		int i_30_ = client.gameScene.method5973((byte) 68)
				.aClass137Array7161
				[Class181_Sub5.anInt9778 * 1926870089 + 1]
				.method1669(i_8_, i_11_, (byte) 0);
		if (client.anIntArray10880[i] < i_30_)
		    client.anIntArray10880[i] = i_30_;
		int i_31_ = i_8_ << 9;
		int i_32_ = i_11_ << 9;
		if (client.anIntArray11013[i] > i_31_)
		    client.anIntArray11013[i] = i_31_;
		else if (client.anIntArray11014[i] < i_31_)
		    client.anIntArray11014[i] = i_31_;
		if (client.anIntArray11012[i] > i_32_)
		    client.anIntArray11012[i] = i_32_;
		else if (client.anIntArray10967[i] < i_32_)
		    client.anIntArray10967[i] = i_32_;
	    }
	    if (!bool_13_) {
		if (i_8_ >= 1
		    && i_5_ != (is[Class181_Sub5.anInt9778 * 1926870089]
				[i_8_ - 1][i_11_])) {
		    client.anIntArray10955[i_6_]
			= i_8_ - 1 | 0x120000 | ~0x2cffffff;
		    client.anIntArray10865[i_6_] = i_11_ | 0x130000;
		    i_6_ = 1 + i_6_ & 0xfff;
		    is[Class181_Sub5.anInt9778 * 1926870089][i_8_ - 1][i_11_]
			= i_5_;
		}
		if (++i_11_ < client.gameScene.method5967(246781536)) {
		    if (i_8_ - 1 >= 0
			&& (is[Class181_Sub5.anInt9778 * 1926870089][i_8_ - 1]
			    [i_11_]) != i_5_
			&& ((class466.aByteArrayArrayArray5312
			     [1926870089 * Class181_Sub5.anInt9778][i_8_]
			     [i_11_])
			    & 0x4) == 0
			&& ((class466.aByteArrayArrayArray5312
			     [1926870089 * Class181_Sub5.anInt9778][i_8_ - 1]
			     [i_11_ - 1])
			    & 0x4) == 0) {
			client.anIntArray10955[i_6_]
			    = i_8_ - 1 | 0x120000 | 0x52000000;
			client.anIntArray10865[i_6_] = i_11_ | 0x130000;
			i_6_ = 1 + i_6_ & 0xfff;
			is[1926870089 * Class181_Sub5.anInt9778][i_8_ - 1]
			    [i_11_]
			    = i_5_;
		    }
		    if (is[Class181_Sub5.anInt9778 * 1926870089][i_8_][i_11_]
			!= i_5_) {
			client.anIntArray10955[i_6_]
			    = i_8_ | 0x520000 | 0x13000000;
			client.anIntArray10865[i_6_] = i_11_ | 0x530000;
			i_6_ = i_6_ + 1 & 0xfff;
			is[Class181_Sub5.anInt9778 * 1926870089][i_8_][i_11_]
			    = i_5_;
		    }
		    if ((i_8_ + 1
			 < client.gameScene.method6029((short) 10181))
			&& (is[Class181_Sub5.anInt9778 * 1926870089][1 + i_8_]
			    [i_11_]) != i_5_
			&& 0 == ((class466.aByteArrayArrayArray5312
				  [Class181_Sub5.anInt9778 * 1926870089][i_8_]
				  [i_11_])
				 & 0x4)
			&& ((class466.aByteArrayArrayArray5312
			     [1926870089 * Class181_Sub5.anInt9778][1 + i_8_]
			     [i_11_ - 1])
			    & 0x4) == 0) {
			client.anIntArray10955[i_6_]
			    = i_8_ + 1 | 0x520000 | ~0x6dffffff;
			client.anIntArray10865[i_6_] = i_11_ | 0x530000;
			i_6_ = i_6_ + 1 & 0xfff;
			is[Class181_Sub5.anInt9778 * 1926870089][i_8_ + 1]
			    [i_11_]
			    = i_5_;
		    }
		}
		i_11_--;
		if (i_8_ + 1 < client.gameScene.method6029((short) 6242)
		    && (is[1926870089 * Class181_Sub5.anInt9778][i_8_ + 1]
			[i_11_]) != i_5_) {
		    client.anIntArray10955[i_6_]
			= i_8_ + 1 | 0x920000 | 0x53000000;
		    client.anIntArray10865[i_6_] = i_11_ | 0x930000;
		    i_6_ = i_6_ + 1 & 0xfff;
		    is[Class181_Sub5.anInt9778 * 1926870089][i_8_ + 1][i_11_]
			= i_5_;
		}
		if (--i_11_ >= 0) {
		    if (i_8_ - 1 >= 0
			&& i_5_ != (is[Class181_Sub5.anInt9778 * 1926870089]
				    [i_8_ - 1][i_11_])
			&& ((class466.aByteArrayArrayArray5312
			     [Class181_Sub5.anInt9778 * 1926870089][i_8_]
			     [i_11_])
			    & 0x4) == 0
			&& ((class466.aByteArrayArrayArray5312
			     [1926870089 * Class181_Sub5.anInt9778][i_8_ - 1]
			     [i_11_ + 1])
			    & 0x4) == 0) {
			client.anIntArray10955[i_6_]
			    = i_8_ - 1 | 0xd20000 | 0x12000000;
			client.anIntArray10865[i_6_] = i_11_ | 0xd30000;
			i_6_ = 1 + i_6_ & 0xfff;
			is[1926870089 * Class181_Sub5.anInt9778][i_8_ - 1]
			    [i_11_]
			    = i_5_;
		    }
		    if (is[1926870089 * Class181_Sub5.anInt9778][i_8_][i_11_]
			!= i_5_) {
			client.anIntArray10955[i_6_]
			    = i_8_ | 0xd20000 | ~0x6cffffff;
			client.anIntArray10865[i_6_] = i_11_ | 0xd30000;
			i_6_ = i_6_ + 1 & 0xfff;
			is[1926870089 * Class181_Sub5.anInt9778][i_8_][i_11_]
			    = i_5_;
		    }
		    if ((1 + i_8_
			 < client.gameScene.method6029((short) 25284))
			&& (is[Class181_Sub5.anInt9778 * 1926870089][1 + i_8_]
			    [i_11_]) != i_5_
			&& ((class466.aByteArrayArrayArray5312
			     [1926870089 * Class181_Sub5.anInt9778][i_8_]
			     [i_11_])
			    & 0x4) == 0
			&& ((class466.aByteArrayArrayArray5312
			     [Class181_Sub5.anInt9778 * 1926870089][1 + i_8_]
			     [i_11_ + 1])
			    & 0x4) == 0) {
			client.anIntArray10955[i_6_]
			    = 1 + i_8_ | 0x920000 | ~0x2dffffff;
			client.anIntArray10865[i_6_] = i_11_ | 0x930000;
			i_6_ = 1 + i_6_ & 0xfff;
			is[Class181_Sub5.anInt9778 * 1926870089][i_8_ + 1]
			    [i_11_]
			    = i_5_;
		    }
		}
	    }
	}
	if (client.anIntArray10880[i] != -1000000) {
	    client.anIntArray10880[i] += 40;
	    client.anIntArray11013[i] -= 512;
	    client.anIntArray11014[i] += 512;
	    client.anIntArray10967[i] += 512;
	    client.anIntArray11012[i] -= 512;
	}
	return true;
    }
    
    static final void method2946(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class691_Sub32.aClass216_10805.method3022(378771982) ? 1 : 0;
    }
}
