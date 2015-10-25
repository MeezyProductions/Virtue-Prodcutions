/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class190 implements Definition
{
    public int[] anIntArray2139;
    Class200 aClass200_2140;
    public int anInt2141;
    public int[] anIntArray2142;
    public int[] anIntArray2143;
    public int anInt2144;
    public int anInt2145 = 0;
    public Class180 aClass180_2146;
    int anInt2147 = 635896253;
    public int anInt2148;
    public int[] anIntArray2149;
    public int anInt2150;
    public int anInt2151;
    public int anInt2152;
    public int anInt2153;
    public int anInt2154;
    public boolean aBool2155;
    public int anInt2156;
    public int[][] anIntArrayArray2157;
    public boolean aBool2158;
    public int[] anIntArray2159;
    public int[] anIntArray2160;
    public static boolean aBool2161 = false;
    Class692 aClass692_2162;
    public int anInt2163;
    
    public void method59() {
	if (-766728977 * anInt2154 == -1) {
	    if (null != aClass180_2146
		&& null != aClass180_2146.aBoolArray2089)
		anInt2154 = -671214562;
	    else
		anInt2154 = 0;
	}
	if (-1 == -1651238579 * anInt2163) {
	    if (null != aClass180_2146
		&& aClass180_2146.aBoolArray2089 != null)
		anInt2163 = -202797302;
	    else
		anInt2163 = 0;
	}
	if (anIntArray2139 != null) {
	    anInt2145 = 0;
	    for (int i = 0; i < anIntArray2139.length; i++)
		anInt2145 += anIntArray2139[i] * 1230337803;
	}
    }
    
    public boolean method2774() {
	if (anIntArray2142 == null)
	    return true;
	boolean bool = true;
	int[] is = anIntArray2142;
	for (int i = 0; i < is.length; i++) {
	    int i_0_ = is[i];
	    if (((Class190) this).aClass200_2140.method2844(i_0_ >>> 16,
							    (byte) 1)
		== null)
		bool = false;
	}
	return bool;
    }
    
    public int method2775(int i, int i_1_) {
	if (null == ((Class190) this).aClass692_2162)
	    return i_1_;
	Class528_Sub17 class528_sub17
	    = ((Class528_Sub17)
	       ((Class190) this).aClass692_2162.method8137((long) i));
	if (class528_sub17 == null)
	    return i_1_;
	return 870949851 * class528_sub17.anInt10388;
    }
    
    public void method61(int i) {
	if (-766728977 * anInt2154 == -1) {
	    if (null != aClass180_2146
		&& null != aClass180_2146.aBoolArray2089)
		anInt2154 = -671214562;
	    else
		anInt2154 = 0;
	}
	if (-1 == -1651238579 * anInt2163) {
	    if (null != aClass180_2146
		&& aClass180_2146.aBoolArray2089 != null)
		anInt2163 = -202797302;
	    else
		anInt2163 = 0;
	}
	if (anIntArray2139 != null) {
	    anInt2145 = 0;
	    for (int i_2_ = 0; i_2_ < anIntArray2139.length; i_2_++)
		anInt2145 += anIntArray2139[i_2_] * 1230337803;
	}
    }
    
    public boolean method2776(int i) {
	if (anIntArray2142 == null)
	    return true;
	boolean bool = true;
	int[] is = anIntArray2142;
	for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
	    int i_4_ = is[i_3_];
	    if (((Class190) this).aClass200_2140.method2844(i_4_ >>> 16,
							    (byte) 1)
		== null)
		bool = false;
	}
	return bool;
    }
    
    public int method2777(int i, int i_5_, int i_6_) {
	if (null == ((Class190) this).aClass692_2162)
	    return i_5_;
	Class528_Sub17 class528_sub17
	    = ((Class528_Sub17)
	       ((Class190) this).aClass692_2162.method8137((long) i));
	if (class528_sub17 == null)
	    return i_5_;
	return 870949851 * class528_sub17.anInt10388;
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 95);
	    if (i == 0)
		break;
	    method2781(class528_sub42, i, 2117298394);
	}
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_7_ = class528_sub42.readUnsignedByte((byte) 79);
	    if (i_7_ == 0)
		break;
	    method2781(class528_sub42, i_7_, -1640244506);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 46);
	    if (i == 0)
		break;
	    method2781(class528_sub42, i, -1669846561);
	}
    }
    
    void method2778(ByteBuffer class528_sub42, int i) {
	if (i == 1) {
	    int i_8_ = class528_sub42.readUnsignedShort(-818464950);
	    anIntArray2139 = new int[i_8_];
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
		anIntArray2139[i_9_] = class528_sub42.readUnsignedShort(-1654990783);
	    anIntArray2142 = new int[i_8_];
	    for (int i_10_ = 0; i_10_ < i_8_; i_10_++)
		anIntArray2142[i_10_] = class528_sub42.readUnsignedShort(-1671053663);
	    for (int i_11_ = 0; i_11_ < i_8_; i_11_++)
		anIntArray2142[i_11_] = (class528_sub42.readUnsignedShort(-1274930855)
					 << 16) + anIntArray2142[i_11_];
	} else if (i == 2)
	    anInt2144 = class528_sub42.readUnsignedShort(-518059446) * 1383268929;
	else if (i == 5)
	    anInt2150 = class528_sub42.readUnsignedByte((byte) 54) * -997260431;
	else if (i == 6)
	    anInt2151 = class528_sub42.readUnsignedShort(-987456052) * -1552125431;
	else if (i == 7)
	    anInt2152 = class528_sub42.readUnsignedShort(-29635523) * -26515929;
	else if (i == 8)
	    anInt2153 = class528_sub42.readUnsignedByte((byte) 46) * 1459700167;
	else if (i == 9)
	    anInt2154 = class528_sub42.readUnsignedByte((byte) 82) * -335607281;
	else if (10 == i)
	    anInt2163 = class528_sub42.readUnsignedByte((byte) 72) * -101398651;
	else if (11 == i)
	    anInt2156 = class528_sub42.readUnsignedByte((byte) 9) * 2012358945;
	else if (12 == i || i == 112) {
	    int i_12_;
	    if (i == 12)
		i_12_ = class528_sub42.readUnsignedByte((byte) 124);
	    else
		i_12_ = class528_sub42.readUnsignedShort(749920600);
	    anIntArray2143 = new int[i_12_];
	    for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
		anIntArray2143[i_13_] = class528_sub42.readUnsignedShort(-260590435);
	    for (int i_14_ = 0; i_14_ < i_12_; i_14_++)
		anIntArray2143[i_14_] = (class528_sub42.readUnsignedShort(-780365697)
					 << 16) + anIntArray2143[i_14_];
	} else if (i == 13) {
	    int i_15_ = class528_sub42.readUnsignedShort(-95728900);
	    anIntArrayArray2157 = new int[i_15_][];
	    for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
		int i_17_ = class528_sub42.readUnsignedByte((byte) 20);
		if (i_17_ > 0) {
		    anIntArrayArray2157[i_16_] = new int[i_17_];
		    anIntArrayArray2157[i_16_][0]
			= class528_sub42.readTriByte(-1192347775);
		    for (int i_18_ = 1; i_18_ < i_17_; i_18_++)
			anIntArrayArray2157[i_16_][i_18_]
			    = class528_sub42.readUnsignedShort(65648927);
		}
	    }
	} else if (14 == i)
	    aBool2155 = true;
	else if (i == 15)
	    aBool2158 = true;
	else if (16 != i && i != 18) {
	    if (19 == i || i == 119) {
		if (anIntArray2159 == null) {
		    anIntArray2159 = new int[anIntArrayArray2157.length];
		    for (int i_19_ = 0; i_19_ < anIntArrayArray2157.length;
			 i_19_++)
			anIntArray2159[i_19_] = 255;
		}
		int i_20_;
		if (19 == i)
		    i_20_ = class528_sub42.readUnsignedByte((byte) 40);
		else
		    i_20_ = class528_sub42.readUnsignedShort(-1852035230);
		anIntArray2159[i_20_] = class528_sub42.readUnsignedByte((byte) 82);
	    } else if (i == 20 || i == 120) {
		if (anIntArray2160 == null || null == anIntArray2149) {
		    anIntArray2160 = new int[anIntArrayArray2157.length];
		    anIntArray2149 = new int[anIntArrayArray2157.length];
		    for (int i_21_ = 0; i_21_ < anIntArrayArray2157.length;
			 i_21_++) {
			anIntArray2160[i_21_] = 256;
			anIntArray2149[i_21_] = 256;
		    }
		}
		int i_22_;
		if (20 == i)
		    i_22_ = class528_sub42.readUnsignedByte((byte) 7);
		else
		    i_22_ = class528_sub42.readUnsignedShort(1202652);
		anIntArray2160[i_22_] = class528_sub42.readUnsignedShort(-378903145);
		anIntArray2149[i_22_] = class528_sub42.readUnsignedShort(-848880303);
	    } else if (i == 22)
		anInt2148 = class528_sub42.readUnsignedByte((byte) 119) * 957615195;
	    else if (i == 23)
		class528_sub42.readUnsignedShort(-649104912);
	    else if (i == 24) {
		((Class190) this).anInt2147
		    = class528_sub42.readUnsignedShort(722710176) * -635896253;
		if (((Class190) this).aClass200_2140 != null)
		    aClass180_2146
			= ((Class180)
			   (((Class200) ((Class190) this).aClass200_2140)
				.anInterface12_2209.method63
			    (((Class190) this).anInt2147 * -1740063125,
			     -357047129)));
	    } else if (i == 249) {
		int i_23_ = class528_sub42.readUnsignedByte((byte) 110);
		if (((Class190) this).aClass692_2162 == null) {
		    int i_24_ = Class327.method4259(i_23_, -2134279851);
		    ((Class190) this).aClass692_2162 = new Class692(i_24_);
		}
		for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
		    boolean bool = class528_sub42.readUnsignedByte((byte) 102) == 1;
		    int i_26_ = class528_sub42.readTriByte(1487085248);
		    Node node;
		    if (bool)
			node
			    = new Class528_Sub31(class528_sub42
						     .readString(2115156698));
		    else
			node
			    = new Class528_Sub17(class528_sub42
						     .readInt(802842506));
		    ((Class190) this).aClass692_2162.method8142(node,
								(long) i_26_);
		}
	    }
	}
    }
    
    public String method2779(int i, String string, int i_27_) {
	if (((Class190) this).aClass692_2162 == null)
	    return string;
	Class528_Sub31 class528_sub31
	    = ((Class528_Sub31)
	       ((Class190) this).aClass692_2162.method8137((long) i));
	if (class528_sub31 == null)
	    return string;
	return (String) class528_sub31.anObject10468;
    }
    
    public int method2780(int i, int i_28_) {
	if (null == ((Class190) this).aClass692_2162)
	    return i_28_;
	Class528_Sub17 class528_sub17
	    = ((Class528_Sub17)
	       ((Class190) this).aClass692_2162.method8137((long) i));
	if (class528_sub17 == null)
	    return i_28_;
	return 870949851 * class528_sub17.anInt10388;
    }
    
    void method2781(ByteBuffer class528_sub42, int i, int i_29_) {
	if (i == 1) {
	    int i_30_ = class528_sub42.readUnsignedShort(129314823);
	    anIntArray2139 = new int[i_30_];
	    for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
		anIntArray2139[i_31_] = class528_sub42.readUnsignedShort(-1508671254);
	    anIntArray2142 = new int[i_30_];
	    for (int i_32_ = 0; i_32_ < i_30_; i_32_++)
		anIntArray2142[i_32_] = class528_sub42.readUnsignedShort(25019750);
	    for (int i_33_ = 0; i_33_ < i_30_; i_33_++)
		anIntArray2142[i_33_] = (class528_sub42.readUnsignedShort(-1785205578)
					 << 16) + anIntArray2142[i_33_];
	} else if (i == 2)
	    anInt2144 = class528_sub42.readUnsignedShort(-1308887415) * 1383268929;
	else if (i == 5)
	    anInt2150 = class528_sub42.readUnsignedByte((byte) 70) * -997260431;
	else if (i == 6)
	    anInt2151 = class528_sub42.readUnsignedShort(-1614474611) * -1552125431;
	else if (i == 7)
	    anInt2152 = class528_sub42.readUnsignedShort(452158106) * -26515929;
	else if (i == 8)
	    anInt2153 = class528_sub42.readUnsignedByte((byte) 23) * 1459700167;
	else if (i == 9)
	    anInt2154 = class528_sub42.readUnsignedByte((byte) 93) * -335607281;
	else if (10 == i)
	    anInt2163 = class528_sub42.readUnsignedByte((byte) 17) * -101398651;
	else if (11 == i)
	    anInt2156 = class528_sub42.readUnsignedByte((byte) 63) * 2012358945;
	else if (12 == i || i == 112) {
	    int i_34_;
	    if (i == 12)
		i_34_ = class528_sub42.readUnsignedByte((byte) 98);
	    else
		i_34_ = class528_sub42.readUnsignedShort(-297888919);
	    anIntArray2143 = new int[i_34_];
	    for (int i_35_ = 0; i_35_ < i_34_; i_35_++)
		anIntArray2143[i_35_] = class528_sub42.readUnsignedShort(-1480411935);
	    for (int i_36_ = 0; i_36_ < i_34_; i_36_++)
		anIntArray2143[i_36_] = (class528_sub42.readUnsignedShort(-2015501823)
					 << 16) + anIntArray2143[i_36_];
	} else if (i == 13) {
	    int i_37_ = class528_sub42.readUnsignedShort(-1148590801);
	    anIntArrayArray2157 = new int[i_37_][];
	    for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
		int i_39_ = class528_sub42.readUnsignedByte((byte) 99);
		if (i_39_ > 0) {
		    anIntArrayArray2157[i_38_] = new int[i_39_];
		    anIntArrayArray2157[i_38_][0]
			= class528_sub42.readTriByte(-1292653491);
		    for (int i_40_ = 1; i_40_ < i_39_; i_40_++)
			anIntArrayArray2157[i_38_][i_40_]
			    = class528_sub42.readUnsignedShort(547823673);
		}
	    }
	} else if (14 == i)
	    aBool2155 = true;
	else if (i == 15)
	    aBool2158 = true;
	else if (16 != i && i != 18) {
	    if (19 == i || i == 119) {
		if (anIntArray2159 == null) {
		    anIntArray2159 = new int[anIntArrayArray2157.length];
		    for (int i_41_ = 0; i_41_ < anIntArrayArray2157.length;
			 i_41_++)
			anIntArray2159[i_41_] = 255;
		}
		int i_42_;
		if (19 == i)
		    i_42_ = class528_sub42.readUnsignedByte((byte) 13);
		else
		    i_42_ = class528_sub42.readUnsignedShort(-1520271926);
		anIntArray2159[i_42_] = class528_sub42.readUnsignedByte((byte) 102);
	    } else if (i == 20 || i == 120) {
		if (anIntArray2160 == null || null == anIntArray2149) {
		    anIntArray2160 = new int[anIntArrayArray2157.length];
		    anIntArray2149 = new int[anIntArrayArray2157.length];
		    for (int i_43_ = 0; i_43_ < anIntArrayArray2157.length;
			 i_43_++) {
			anIntArray2160[i_43_] = 256;
			anIntArray2149[i_43_] = 256;
		    }
		}
		int i_44_;
		if (20 == i)
		    i_44_ = class528_sub42.readUnsignedByte((byte) 3);
		else
		    i_44_ = class528_sub42.readUnsignedShort(-2116675778);
		anIntArray2160[i_44_] = class528_sub42.readUnsignedShort(486169596);
		anIntArray2149[i_44_] = class528_sub42.readUnsignedShort(-318368324);
	    } else if (i == 22)
		anInt2148 = class528_sub42.readUnsignedByte((byte) 49) * 957615195;
	    else if (i == 23)
		class528_sub42.readUnsignedShort(-347411177);
	    else if (i == 24) {
		((Class190) this).anInt2147
		    = class528_sub42.readUnsignedShort(-2036280993) * -635896253;
		if (((Class190) this).aClass200_2140 != null)
		    aClass180_2146
			= ((Class180)
			   (((Class200) ((Class190) this).aClass200_2140)
				.anInterface12_2209.method63
			    (((Class190) this).anInt2147 * -1740063125,
			     1877932118)));
	    } else if (i == 249) {
		int i_45_ = class528_sub42.readUnsignedByte((byte) 63);
		if (((Class190) this).aClass692_2162 == null) {
		    int i_46_ = Class327.method4259(i_45_, -2134279851);
		    ((Class190) this).aClass692_2162 = new Class692(i_46_);
		}
		for (int i_47_ = 0; i_47_ < i_45_; i_47_++) {
		    boolean bool = class528_sub42.readUnsignedByte((byte) 24) == 1;
		    int i_48_ = class528_sub42.readTriByte(-1918819539);
		    Node node;
		    if (bool)
			node
			    = new Class528_Sub31(class528_sub42
						     .readString(1088905659));
		    else
			node
			    = new Class528_Sub17(class528_sub42
						     .readInt(589713047));
		    ((Class190) this).aClass692_2162.method8142(node,
								(long) i_48_);
		}
	    }
	}
    }
    
    Class190(int i, Class200 class200) {
	anInt2144 = -1383268929;
	anInt2150 = -691334859;
	anInt2151 = 1552125431;
	anInt2152 = 26515929;
	anInt2153 = -1518571531;
	anInt2154 = 335607281;
	anInt2163 = 101398651;
	anInt2156 = -270249406;
	aBool2155 = false;
	aBool2158 = false;
	anInt2148 = -957615195;
	anInt2141 = -1197676403 * i;
	((Class190) this).aClass200_2140 = class200;
    }
    
    static final void method2782(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Entity.method10728(class229, class226, class648,
					    (byte) -52);
    }
    
    public static float method2783(Class430 class430, int i) {
	Class422 class422 = Class422.method5051(0.0F, 0.0F, 1.0F);
	class422.method5075(class430);
	double d = Math.atan2((double) class422.aFloat4780,
			      (double) class422.aFloat4777);
	class422.method5054();
	if (d < 0.0)
	    d = 3.141592653589793 + (3.141592653589793 + d);
	return (float) d;
    }
    
    static void method2784(int i) {
	if (Class99.anInt1265 * -1026839985 < 102)
	    Class99.anInt1265 += -1155855334;
	if (Class99.anInt1257 * 123581583 != -1
	    && (Class99.aLong1267 * 1013267771366510847L
		< Class249.method3417(1951207140))) {
	    for (int i_49_ = 123581583 * Class99.anInt1257;
		 i_49_ < Class428.aStringArray4812.length; i_49_++) {
		if (Class428.aStringArray4812[i_49_].startsWith("pause")) {
		    int i_50_ = 5;
		    try {
			i_50_ = Integer.parseInt(Class428.aStringArray4812
						     [i_49_].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("Pausing for ").append
						 (i_50_).append
						 (" seconds...").toString(),
					     (byte) 51);
		    Class99.anInt1257 = -714282385 * (1 + i_49_);
		    Class99.aLong1267
			= (Class249.method3417(2038926132)
			   + (long) (1000 * i_50_)) * 2935999340532461311L;
		    return;
		}
		Class99.aString1264 = Class428.aStringArray4812[i_49_];
		Class264.method3657(false, (byte) 68);
	    }
	    Class99.anInt1257 = 714282385;
	}
	if (454740049 * client.anInt10926 != 0) {
	    Class99.anInt1261 -= client.anInt10926 * 1974991457;
	    if (Class99.anInt1261 * 1727710133
		>= -1589365317 * Class99.anInt1268)
		Class99.anInt1261
		    = Class99.anInt1268 * -1666917969 - -819047779;
	    if (Class99.anInt1261 * 1727710133 < 0)
		Class99.anInt1261 = 0;
	    client.anInt10926 = 0;
	}
	for (int i_51_ = 0; i_51_ < -1384174071 * client.anInt10995; i_51_++) {
	    Interface61 interface61 = client.anInterface61Array11123[i_51_];
	    int i_52_ = interface61.method384(1717599602);
	    char c = interface61.method399((byte) -105);
	    int i_53_ = interface61.method402(352445610);
	    if (84 == i_52_)
		Class264.method3657(false, (byte) 113);
	    if (i_52_ == 80)
		Class264.method3657(true, (byte) 61);
	    else if (i_52_ == 66 && (i_53_ & 0x4) != 0) {
		if (null != Class141_Sub1.aClipboard8801) {
		    String string = "";
		    for (int i_54_ = Class99.aStringArray1259.length - 1;
			 i_54_ >= 0; i_54_--) {
			if (null != Class99.aStringArray1259[i_54_]
			    && Class99.aStringArray1259[i_54_].length() > 0)
			    string
				= new StringBuilder().append(string).append
				      (Class99.aStringArray1259[i_54_]).append
				      ('\n').toString();
		    }
		    Class141_Sub1.aClipboard8801
			.setContents(new StringSelection(string), null);
		}
	    } else if (67 == i_52_ && (i_53_ & 0x4) != 0) {
		if (Class141_Sub1.aClipboard8801 != null) {
		    try {
			Transferable transferable
			    = Class141_Sub1.aClipboard8801.getContents(null);
			if (transferable != null) {
			    String string
				= (String) (transferable.getTransferData
					    (DataFlavor.stringFlavor));
			    if (null != string) {
				String[] strings
				    = Class520.method6348(string, '\n',
							  (byte) 33);
				Class98.method1308(strings, -723356038);
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
	    } else if (i_52_ == 85 && -1643546867 * Class99.anInt1269 > 0) {
		Class99.aString1264
		    = new StringBuilder().append
			  (Class99.aString1264.substring(0,
							 (Class99.anInt1269
							  * -1643546867) - 1))
			  .append
			  (Class99.aString1264
			       .substring(-1643546867 * Class99.anInt1269))
			  .toString();
		Class99.anInt1269 -= 105656261;
	    } else if (i_52_ == 101 && (Class99.anInt1269 * -1643546867
					< Class99.aString1264.length()))
		Class99.aString1264
		    = new StringBuilder().append
			  (Class99.aString1264
			       .substring(0, Class99.anInt1269 * -1643546867))
			  .append
			  (Class99.aString1264
			       .substring(-1643546867 * Class99.anInt1269 + 1))
			  .toString();
	    else if (96 == i_52_ && -1643546867 * Class99.anInt1269 > 0)
		Class99.anInt1269 -= 105656261;
	    else if (97 == i_52_ && (-1643546867 * Class99.anInt1269
				     < Class99.aString1264.length()))
		Class99.anInt1269 += 105656261;
	    else if (102 == i_52_)
		Class99.anInt1269 = 0;
	    else if (i_52_ == 103)
		Class99.anInt1269 = Class99.aString1264.length() * 105656261;
	    else if (104 == i_52_ && (Class99.anInt1263 * -1202639803
				      < Class99.aStringArray1259.length)) {
		Class99.anInt1263 += 768411277;
		Class222.method3158(-1200744750);
		Class99.anInt1269 = Class99.aString1264.length() * 105656261;
	    } else if (105 == i_52_ && -1202639803 * Class99.anInt1263 > 0) {
		Class99.anInt1263 -= 768411277;
		Class222.method3158(-1116929242);
		Class99.anInt1269 = Class99.aString1264.length() * 105656261;
	    } else if (Class578.method6913(c, (byte) -27)
		       || "\\/.:, _-+[]~@".indexOf(c) != -1) {
		Class99.aString1264
		    = new StringBuilder().append
			  (Class99.aString1264
			       .substring(0, -1643546867 * Class99.anInt1269))
			  .append
			  (client.anInterface61Array11123[i_51_]
			       .method399((byte) -58))
			  .append
			  (Class99.aString1264
			       .substring(Class99.anInt1269 * -1643546867))
			  .toString();
		Class99.anInt1269 += 105656261;
	    }
	}
	client.anInt10995 = 0;
	client.anInt10906 = 0;
	PlayerModel.method7298(-2071891052);
    }
    
    static final void method2785(Class648 class648, int i) {
	int i_55_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (1234694097 * client.anInt11158 != 0
	    && i_55_ < -1924608781 * client.anInt11024)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= client.aClass33Array11164[i_55_].aString311;
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
    }
    
    static void method2786(Entity class645_sub1_sub5_sub1,
			   int i, int i_56_, int i_57_, int i_58_) {
	RenderType renderType = class645_sub1_sub5_sub1.getRender(-2073024244);
	Class690_Sub3 class690_sub3
	    = class645_sub1_sub5_sub1.aClass690_Sub3_11803;
	int i_59_
	    = ((-49484805 * class645_sub1_sub5_sub1.anInt11808
		- -247599997 * class645_sub1_sub5_sub1.aClass37_11809.anInt336)
	       & 0x3fff);
	if (i == Class666.aClass666_8481.aByte8478) {
	    if (0 != i_59_
		|| class645_sub1_sub5_sub1.anInt11806 * 542446475 > 25) {
		if (i_57_ < 0 && -1 != -49923207 * renderType.anInt7658) {
		    class690_sub3.method8072(renderType.anInt7658 * -49923207,
					     false, true, -1259630182);
		    class690_sub3.aBool10798 = false;
		} else if (i_57_ > 0
			   && -1 != renderType.anInt7655 * -965312051) {
		    class690_sub3.method8072(-965312051 * renderType.anInt7655,
					     false, true, -1259630182);
		    class690_sub3.aBool10798 = false;
		} else if (!class690_sub3.aBool10798
			   || !renderType.method6981(class690_sub3
						       .method8068(-772845955),
						   1896881891)) {
		    class690_sub3.method8072(renderType.method6983(-448877519),
					     false, true, -1259630182);
		    class690_sub3.aBool10798
			= class645_sub1_sub5_sub1.aClass690_Sub3_11803
			      .method8067((byte) 29);
		}
	    } else if (!class690_sub3.aBool10798
		       || !renderType.method6981(class690_sub3
						   .method8068(-772845955),
					       795769333)) {
		class690_sub3.method8072(renderType.method6983(2030572495),
					 false, true, -1259630182);
		class690_sub3.aBool10798 = class690_sub3.method8067((byte) 25);
	    }
	} else if (class645_sub1_sub5_sub1.anInt11780 * -1378983465 != -1
		   && (i_59_ >= 10240 || i_59_ <= 2048)) {
	    int i_60_ = ((client.anIntArray10957[i_56_]
			  - (class645_sub1_sub5_sub1.aClass37_11809.anInt336
			     * -247599997))
			 & 0x3fff);
	    if (i == Class666.aClass666_8479.aByte8478
		&& 630040273 * renderType.anInt7660 != -1) {
		if (i_60_ > 2048 && i_60_ <= 6144
		    && -1 != renderType.anInt7679 * 384769079)
		    class690_sub3.method8072(384769079 * renderType.anInt7679,
					     false, true, -1259630182);
		else if (i_60_ >= 10240 && i_60_ < 14336
			 && -1 != 888920185 * renderType.anInt7662)
		    class690_sub3.method8072(renderType.anInt7662 * 888920185,
					     false, true, -1259630182);
		else if (i_60_ > 6144 && i_60_ < 10240
			 && -1 != renderType.anInt7666 * -1724508225)
		    class690_sub3.method8072(renderType.anInt7666 * -1724508225,
					     false, true, -1259630182);
		else
		    class690_sub3.method8072(renderType.anInt7660 * 630040273,
					     false, true, -1259630182);
	    } else if (Class666.aClass666_8477.aByte8478 == i
		       && -1 != 1022705985 * renderType.anInt7664) {
		if (i_60_ > 2048 && i_60_ <= 6144
		    && -1 != 299271595 * renderType.anInt7667)
		    class690_sub3.method8072(renderType.anInt7667 * 299271595,
					     false, true, -1259630182);
		else if (i_60_ >= 10240 && i_60_ < 14336
			 && renderType.anInt7669 * -137509863 != -1)
		    class690_sub3.method8072(renderType.anInt7669 * -137509863,
					     false, true, -1259630182);
		else if (i_60_ > 6144 && i_60_ < 10240
			 && -1467373345 * renderType.anInt7684 != -1)
		    class690_sub3.method8072(-1467373345 * renderType.anInt7684,
					     false, true, -1259630182);
		else
		    class690_sub3.method8072(renderType.anInt7664 * 1022705985,
					     false, true, -1259630182);
	    } else if (i_60_ > 2048 && i_60_ <= 6144
		       && -1883300431 * renderType.anInt7659 != -1)
		class690_sub3.method8072(renderType.anInt7659 * -1883300431,
					 false, true, -1259630182);
	    else if (i_60_ >= 10240 && i_60_ < 14336
		     && renderType.anInt7665 * -1635563057 != -1)
		class690_sub3.method8072(-1635563057 * renderType.anInt7665,
					 false, true, -1259630182);
	    else if (i_60_ > 6144 && i_60_ < 10240
		     && -1 != renderType.anInt7657 * -959152635)
		class690_sub3.method8072(renderType.anInt7657 * -959152635,
					 false, true, -1259630182);
	    else
		class690_sub3.method8072(renderType.anInt7673 * 1376605411,
					 false, true, -1259630182);
	    class690_sub3.aBool10798 = false;
	} else if (0 != i_59_
		   || class645_sub1_sub5_sub1.anInt11806 * 542446475 > 25) {
	    if (i == Class666.aClass666_8479.aByte8478
		&& -1 != renderType.anInt7660 * 630040273) {
		if (i_57_ < 0 && -1 != 136328939 * renderType.anInt7670)
		    class690_sub3.method8072(renderType.anInt7670 * 136328939,
					     false, true, -1259630182);
		else if (i_57_ > 0 && 176635033 * renderType.anInt7671 != -1)
		    class690_sub3.method8072(renderType.anInt7671 * 176635033,
					     false, true, -1259630182);
		else
		    class690_sub3.method8072(renderType.anInt7660 * 630040273,
					     false, true, -1259630182);
	    } else if (Class666.aClass666_8477.aByte8478 == i
		       && renderType.anInt7664 * 1022705985 != -1) {
		if (i_57_ < 0 && renderType.anInt7668 * -1023363355 != -1)
		    class690_sub3.method8072(-1023363355 * renderType.anInt7668,
					     false, true, -1259630182);
		else if (i_57_ > 0 && 1016290431 * renderType.anInt7672 != -1)
		    class690_sub3.method8072(renderType.anInt7672 * 1016290431,
					     false, true, -1259630182);
		else
		    class690_sub3.method8072(renderType.anInt7664 * 1022705985,
					     false, true, -1259630182);
	    } else if (i_57_ < 0 && -1 != renderType.anInt7693 * -307992989)
		class690_sub3.method8072(-307992989 * renderType.anInt7693,
					 false, true, -1259630182);
	    else if (i_57_ > 0 && -1 != -2003541297 * renderType.anInt7654)
		class690_sub3.method8072(renderType.anInt7654 * -2003541297,
					 false, true, -1259630182);
	    else
		class690_sub3.method8072(renderType.anInt7673 * 1376605411,
					 false, true, -1259630182);
	    class690_sub3.aBool10798 = false;
	} else {
	    if (Class666.aClass666_8479.aByte8478 == i
		&& -1 != 630040273 * renderType.anInt7660)
		class690_sub3.method8072(renderType.anInt7660 * 630040273, false,
					 true, -1259630182);
	    else if (Class666.aClass666_8477.aByte8478 == i
		     && 1022705985 * renderType.anInt7664 != -1)
		class690_sub3.method8072(1022705985 * renderType.anInt7664,
					 false, true, -1259630182);
	    else
		class690_sub3.method8072(1376605411 * renderType.anInt7673,
					 false, true, -1259630182);
	    class690_sub3.aBool10798 = false;
	}
    }
    
    static final void method2787(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class92.method1225(class229, class226, class648, 35483203);
    }
}
