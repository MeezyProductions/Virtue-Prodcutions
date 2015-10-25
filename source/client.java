
/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;

import javax.imageio.ImageIO;

import jaclib.ping.Ping;

public final class client extends Class509 {
	static int anInt10852;
	public static boolean aBool10853;
	static int anInt10854;
	public static boolean[] aBoolArray10855;
	public static int anInt10856;
	static String aString10857;
	public static int anInt10858;
	public static boolean aBool10859;
	public static int anInt10860;
	public static int anInt10861;
	public static int anInt10862;
	public static int anInt10863;
	public static boolean aBool10864;
	static int[] anIntArray10865;
	static String aString10866;
	public static String aString10867;
	static String aString10868;
	public static boolean aBool10869;
	public static int anInt10870;
	static boolean aBool10871;
	public static int anInt10872;
	static int anInt10873;
	static long aLong10874;
	static boolean[] aBoolArray10875;
	public static int anInt10876;
	static Class418 aClass418_10877;
	static final int anInt10878 = 1375731712;
	static Class433 aClass433_10879;
	static int[] anIntArray10880;
	public static boolean aBool10881;
	static boolean aBool10882;
	public static int anInt10883;
	static boolean aBool10884;
	public static Class631 aClass631_10885;
	static final int anInt10886 = 1245184;
	static boolean aBool10887;
	public static float[] aFloatArray10888;
	public static int anInt10889;
	static boolean aBool10890;
	public static int anInt10891;
	public static boolean aBool10892;
	static boolean aBool10893;
	static boolean aBool10894;
	public static int anInt10895;
	public static boolean aBool10896;
	public static int anInt10897;
	static int anInt10898;
	public static boolean aBool10899;
	public static Class688 aClass688_10900;
	static int anInt10901;
	public static String aString10902;
	static Class695 aClass695_10903;
	public static int anInt10904;
	static final int anInt10905 = 77;
	public static int anInt10906;
	public static Interface61[] anInterface61Array10907;
	static int[] anIntArray10908;
	public static Color[] aColorArray10909;
	public static Color[] aColorArray10910;
	static int anInt10911;
	static int anInt10912;
	static int anInt10913;
	public static boolean aBool10914;
	static Class186 aClass186_10915;
	static String aString10916;
	public static Interface50 anInterface50_10917;
	public static Interface24 anInterface24_10918;
	public static Color[] aColorArray10919;
	public static Class528_Sub31[] aClass528_Sub31Array10920;
	public static int anInt10921;
	public static int anInt10922;
	public static int[] anIntArray10923;
	static int anInt10924;
	static int[] anIntArray10925;
	static int anInt10926;
	static int anInt10927;
	static int[] anIntArray10928;
	static boolean aBool10929;
	public static Class109 aClass109_10930;
	public static Class109[] aClass109Array10931;
	static int anInt10932;
	static boolean aBool10933;
	public static boolean aBool10934;
	public static Class495 aClass495_10935;
	public static volatile boolean aBool10936;
	public static Object anObject10937;
	public static Object anObject10938;
	public static int[] anIntArray10939;
	public static int anInt10940;
	public static int[] anIntArray10941;
	static int anInt10942;
	public static int anInt10943;
	public static boolean aBool10944;
	static int anInt10945;
	static boolean aBool10946;
	static boolean aBool10947;
	public static final int anInt10948 = 102;
	public static int anInt10949;
	static int[] anIntArray10950;
	public static int anInt10951;
	static boolean[] aBoolArray10952;
	public static int anInt10953;
	static final int anInt10954 = 4095;
	static int[] anIntArray10955;
	public static boolean aBool10956;
	static int[] anIntArray10957;
	static Class688 aClass688_10958;
	static int anInt10959;
	static int anInt10960;
	static boolean aBool10961;
	static String aString10962;
	static int anInt10963;
	static int anInt10964;
	static int anInt10965;
	public static boolean aBool10966;
	static int[] anIntArray10967;
	public static int anInt10968;
	public static short aShort10969;
	static Random aRandom10970;
	static int anInt10971;
	public static int anInt10972;
	public static int anInt10973;
	static boolean aBool10974;
	static int anInt10975;
	static float aFloat10976;
	static Class186 aClass186_10977;
	public static volatile int anInt10978;
	static boolean aBool10979;
	public static int anInt10980;
	public static int anInt10981;
	public static boolean aBool10982;
	static int anInt10983;
	public static final int anInt10984 = 2;
	static final int anInt10985 = 65535;
	public static int[][][] anIntArrayArrayArray10986;
	public static Class229 aClass229_10987;
	public static int anInt10988;
	public static int anInt10989;
	public static int anInt10990;
	public static int anInt10991;
	public static Class688 aClass688_10992;
	static boolean aBool10993;
	static boolean aBool10994;
	public static int anInt10995;
	static int anInt10996;
	static int[] anIntArray10997;
	public static int anInt10998;
	static int anInt10999;
	static Class695 aClass695_11000;
	static int anInt11001;
	public static float aFloat11002;
	static int[] anIntArray11003;
	public static Class487[][] aClass487ArrayArray11004;
	static int anInt11005;
	static int anInt11006;
	static int anInt11007;
	public static final int anInt11008 = 2048;
	static short[] aShortArray11009;
	public static Class527[] aClass527Array11010;
	static final int anInt11011 = 2;
	static int[] anIntArray11012;
	static int[] anIntArray11013;
	static int[] anIntArray11014;
	static int anInt11015;
	public static Class96[] aClass96Array11016;
	static long aLong11017;
	public static int anInt11018;
	static int anInt11019;
	static int anInt11020;
	static int anInt11021;
	public static int anInt11022;
	static int anInt11023;
	public static int anInt11024;
	public static int anInt11025;
	static Map aMap11026;
	public static Class229 aClass229_11027;
	public static Class217 aClass217_11028;
	public static int playerRights;
	public static int anInt11030;
	public static Player[] localPlayers;
	static int anInt11032;
	public static boolean aBool11033;
	static Class629 aClass629_11034;
	public static boolean aBool11035;
	public static int anInt11036;
	static float aFloat11037;
	static int[] anIntArray11038;
	static String[] aStringArray11039;
	static int anInt11040;
	static boolean aBool11041;
	public static Class692 aClass692_11042;
	public static Class688 aClass688_11043;
	public static Class692 aClass692_11044;
	public static Class695 aClass695_11045;
	static int anInt11046;
	public static int anInt11047;
	static int anInt11048;
	static int anInt11049;
	public static int anInt11050;
	static Map aMap11051;
	static int anInt11052;
	static int anInt11053;
	static String aString11054;
	static boolean aBool11055;
	static int anInt11056;
	static boolean aBool11057;
	static int anInt11058;
	public static Class229 aClass229_11059;
	public static int anInt11060;
	public static int anInt11061;
	static boolean aBool11062;
	static boolean aBool11063;
	static final int anInt11064 = 9633792;
	public static int anInt11065;
	static boolean aBool11066;
	public static Class229 aClass229_11067;
	static long aLong11068;
	static int anInt11069;
	static int anInt11070;
	static Class229 aClass229_11071;
	static int[] anIntArray11072;
	static int anInt11073;
	static int anInt11074;
	static int anInt11075;
	static int anInt11076;
	public static String aString11077;
	static int anInt11078;
	static int anInt11079;
	static Class433 aClass433_11080;
	static int[] anIntArray11081;
	static boolean aBool11082;
	static final int anInt11083 = 128;
	public static boolean aBool11084;
	public static short aShort11085;
	static final int anInt11086 = 63;
	static int[] anIntArray11087;
	public static float aFloat11088;
	static int[] anIntArray11089;
	static Rectangle[] aRectangleArray11090;
	static int[] anIntArray11091;
	static int anInt11092;
	static int[] anIntArray11093;
	static int anInt11094;
	static int[] anIntArray11095;
	static int anInt11096;
	public static Class692 aClass692_11097;
	static int[] anIntArray11098;
	public static int anInt11099;
	static final int anInt11100 = 8;
	static int anInt11101;
	static int anInt11102;
	static int anInt11103;
	public static int anInt11104;
	static int anInt11105;
	static int anInt11106;
	static int anInt11107;
	public static Class673 aClass673_11108 = null;
	static final int anInt11109 = 1;
	public static Class692 aClass692_11110;
	public static short aShort11111;
	static Class692 aClass692_11112;
	static int anInt11113;
	static int anInt11114;
	static int anInt11115;
	static int anInt11116;
	static int anInt11117;
	static final int anInt11118 = 64;
	static int anInt11119;
	static int[] anIntArray11120;
	static int anInt11121;
	static int anInt11122;
	public static Interface61[] anInterface61Array11123;
	public static int anInt11124;
	static int[] anIntArray11125;
	static Class492[] aClass492Array11126;
	public static int anInt11127;
	static int anInt11128;
	static final int anInt11129 = 301989888;
	static final int anInt11130 = 100;
	static long[] aLongArray11131;
	static int anInt11132;
	public static String aString11133;
	public static int anInt11134;
	public static int anInt11135;
	static int anInt11136;
	static Class31 aClass31_11137;
	static final int anInt11138 = 5;
	static boolean[] aBoolArray11139;
	static int[] anIntArray11140;
	public static boolean aBool11141;
	static int[] anIntArray11142;
	static int[] anIntArray11143;
	public static short aShort11144;
	static int anInt11145;
	static Class688 aClass688_11146;
	public static short aShort11147;
	public static short aShort11148;
	public static short aShort11149;
	public static boolean aBool11150;
	public static short aShort11151;
	static int anInt11152;
	static int anInt11153;
	public static int anInt11154;
	public static int anInt11155;
	static int anInt11156;
	public static int anInt11157;
	public static int anInt11158;
	static final int anInt11159 = 400;
	public static Class62[] aClass62Array11160;
	public static boolean aBool11161;
	public static Class109 aClass109_11162;
	static final int anInt11163 = 400;
	public static Class33[] aClass33Array11164;
	static int anInt11165;
	static int anInt11166;
	static int anInt11167;
	static long aLong11168;
	static Calendar aCalendar11169;
	public static Interface62 anInterface62_11170;
	static long aLong11171;
	public static String aString11172;
	static Class186 aClass186_11173;
	static final int anInt11174 = -771751936;
	public static String aString11175;
	static boolean aBool11176;
	static final int anInt11177 = 1179648;
	static final int anInt11178 = 5373952;
	static final int anInt11179 = 9568256;
	static final int anInt11180 = 13762560;
	public static int anInt11181;
	static final int anInt11182 = 0;
	static final int anInt11183 = -1845493760;
	static int anInt11184;
	static final int anInt11185 = 13828096;
	static final int anInt11186 = 5439488;
	static boolean aBool11187;
	public static int anInt11188;
	static final int anInt11189 = 318767104;
	static final int anInt11190 = 1392508928;
	static final int anInt11191 = -1828716544;
	static final int anInt11192 = -754974720;
	static int[] anIntArray11193;

	@Override
	public final void init() {
		if (method6182(-1696312871)) {
			String string = "";
			Class405[] class405s = Class362.method4596(-366180438);
			for (int i = 0; i < class405s.length; i++) {
				Class405 class405 = class405s[i];
				String string_0_ = Class196.anApplet2198.getParameter(class405.aString4645);
				if (null != string_0_) {
					switch (Integer.parseInt(class405.aString4645)) {
					case 3:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt192 = Integer.parseInt(string_0_) * 1068151373;
						break;
					case 32:
						if (string_0_.equalsIgnoreCase(Class49.aString550))
							aBool10869 = true;
						else
							aBool10869 = false;
						break;
					case 41:
						if (null == Class12.aClass16_174)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.aString194 = string_0_;
						break;
					case 22:
						if (Class12.aClass16_174 == null)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt193 = Integer.parseInt(string_0_) * 1685978521;
						break;
					case 39:
						anInt10863 = Integer.parseInt(string_0_) * -1786748395;
						if (anInt10863 * 1181441341 < 0 || (1181441341 * anInt10863 >= aColorArray10919.length))
							anInt10863 = 0;
						break;
					case 26:
						aString11077 = string_0_;
						break;
					case 35:
						if (string_0_.equalsIgnoreCase(Class49.aString550)) {
							/* empty */
						}
						break;
					case 21:
						if (Class12.aClass16_182 == null)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt191 = Integer.parseInt(string_0_) * -792516699;
						break;
					case 36:
						if (null == Class12.aClass16_174)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt191 = Integer.parseInt(string_0_) * -792516699;
						break;
					case 15:
						if (string_0_.equalsIgnoreCase(Class49.aString550))
							aBool10993 = true;
						else
							aBool10993 = false;
						break;
					case 17:
						if (string_0_.equals(Class49.aString550))
							aBool10956 = true;
						else
							aBool10956 = false;
						break;
					case 49:
						anInt10860 = Integer.parseInt(string_0_) * -1888478825;
						break;
					case 24:
						if (Class12.aClass16_177 == null)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.aString194 = string_0_;
						break;
					case 40:
						if (null == Class12.aClass16_175)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.aString194 = string_0_;
						break;
					case 2:
						if (null == Class12.aClass16_177)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt193 = Integer.parseInt(string_0_) * 1685978521;
						break;
					case 12:
						Class378_Sub2.aClass668_10123 = Class668.method7913(Integer.parseInt(string_0_), 159661366);
						break;
					case 29:
						Class217.aString2291 = string_0_;
						break;
					case 28:
						aString11054 = string_0_;
						break;
					case 45:
						aString10857 = string_0_;
						break;
					case 20:
						aString10866 = string_0_;
						if (aString10866.length() > 100)
							aString10866 = null;
						break;
					case 43:
						aClass673_11108 = Class628.method7519(Integer.parseInt(string_0_), (byte) 1);
						if (Class673.aClass673_8529 == aClass673_11108)
							Class688.aClass77_8657 = Class77.aClass77_804;
						else
							Class688.aClass77_8657 = Class77.aClass77_807;
						break;
					case 27:
						if (string_0_.equalsIgnoreCase(Class49.aString550))
							aBool10853 = true;
						else
							aBool10853 = false;
						break;
					case 9:
						aString10962 = string_0_;
						break;
					case 25:
						anInt10861 = Integer.parseInt(string_0_) * 771816177;
						break;
					case 50:
						if (Class12.aClass16_177 == null)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt191 = Integer.parseInt(string_0_) * -792516699;
						break;
					case 46:
						if (string_0_.equals(Class49.aString550))
							aBool10859 = true;
						else
							aBool10859 = false;
						break;
					case 18:
						anInt10856 = Integer.parseInt(string_0_) * -689310945;
						break;
					case 44:
						aString10867 = string_0_;
						break;
					case 11:
						break;
					case 31:
						Class522.aString7051 = string_0_;
						break;
					case 48:
						if (Class12.aClass16_174 == null)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt192 = Integer.parseInt(string_0_) * 1068151373;
						break;
					case 19:
						Class242.aClass696_2722 = Class573.method6867(Integer.parseInt(string_0_), 961465569);
						if (Class242.aClass696_2722 != Class696.aClass696_8711
								&& (Class242.aClass696_2722 != Class696.aClass696_8710)
								&& (Class242.aClass696_2722 != Class696.aClass696_8713)
								&& (Class242.aClass696_2722 != Class696.aClass696_8709))
							Class242.aClass696_2722 = Class696.aClass696_8709;
						break;
					case 8:
						Class646.aClass665_8386 = ((ModeWhere) Class443.method5321(ModeWhere.method7893(1962816352),
								Integer.parseInt(string_0_), 776079569));
						if (ModeWhere.aClass665_8465 == Class646.aClass665_8386)
							Class646.aClass665_8386 = ModeWhere.aClass665_8464;
						else if (!(Class646.aClass665_8386.method7892(Class667.aClass667_8485, 364491346))
								&& (ModeWhere.LIVE != Class646.aClass665_8386))
							Class646.aClass665_8386 = ModeWhere.LIVE;
						break;
					case 16:
						anInt11104 = Integer.parseInt(string_0_) * 1953172635;
						break;
					case 4:
						if (string_0_.equalsIgnoreCase(Class49.aString550))
							aBool10871 = true;
						else
							aBool10871 = false;
						break;
					case 38:
						if (string_0_.equalsIgnoreCase(Class49.aString550))
							aBool10914 = true;
						break;
					case 34:
						if (string_0_.equalsIgnoreCase(Class49.aString550))
							aBool10884 = true;
						else
							aBool10884 = false;
						break;
					case 1:
						break;
					case 30:
						if (null == Class12.aClass16_182)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt192 = Integer.parseInt(string_0_) * 1068151373;
						break;
					case 52:
						anInt10873 = Integer.parseInt(string_0_) * -1659944355;
						break;
					case 13:
						break;
					case 6:
						if (null == Class12.aClass16_177)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt192 = Integer.parseInt(string_0_) * 1068151373;
						break;
					default:
						VarDomainType.method5340("", new RuntimeException(), 2039963948);
						break;
					case 33:
						if (Class12.aClass16_182 == null)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt193 = Integer.parseInt(string_0_) * 1685978521;
						break;
					case 51:
						aString10868 = string_0_;
						break;
					case 37:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt191 = Integer.parseInt(string_0_) * -792516699;
						break;
					case 42:
						Class528_Sub35.anInt10494 = Integer.parseInt(string_0_) * -1958106627;
						break;
					case 23:
						break;
					case 47:
						anInt10862 = Integer.parseInt(string_0_) * 17704847;
						break;
					case 7:
						Class623.anInt8119 = Integer.parseInt(string_0_) * -1973001665;
						break;
					case 5:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt193 = Integer.parseInt(string_0_) * 1685978521;
						break;
					case 14:
						string = string_0_;
					}
				}
			}
			if (null == aString10962)
				aString10962 = "";
			Class510 class510 = new Class510(473615593 * anInt11124, -14625703 * anInt11022, anInt11019 * 2095238197,
					anInt11020 * -362064957, aClass673_11108.aString8536);
			Class326.aclient3497 = this;
			String string_1_ = Class242.aClass696_2722.aString8714;
			int i = 32 + Class242.aClass696_2722.anInt8708 * -313882147;
			if (!string.equals("")) {
				string_1_ = new StringBuilder().append(string_1_).append("_").append(string).toString();
				i = 0;
			}
			method6232(class510, aClass673_11108.aString8534, string_1_, i, Class668.method7924(-1756310274), 857, 1,
					aBool10871, 370496947);
		}
	}

	@Override
	final void method6190(byte i) {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class137.aClass229_1632 = new Class229();
		Class206.method2921(1554711040);
		Class257.method3471(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 },
				new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, 611121296);
		Class422.method5099(100);
		Class430.method5200(10);
		Class311.method4141(100, -2066958145);
		Class380.method4719(100, -993497119);
		if (ModeWhere.LIVE != Class646.aClass665_8386)
			Class58.aByteArrayArray707 = new byte[50][];
		Class514.aClass528_Sub38_6967 = Class67.method1068(-45117717);
		if (Class514.aClass528_Sub38_6967.aClass691_Sub31_10602.method10076(-740804623) == 1)
			Class538.aBool7171 = false;
		switch (Class514.aClass528_Sub38_6967.aClass691_Sub33_10560.method10104(1342783616)) {
		case 4:
			Class97.aBool1238 = true;
			Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub33_10560), 0,
					1117276513);
			Class5_Sub1.method10057(Class50.aClass50_563, 416678558);
			break;
		default:
			break;
		case 3:
			Class97.aBool1237 = true;
			Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub33_10560), 0,
					690473812);
			Class5_Sub1.method10057(Class50.aClass50_567, 793908089);
		}
		if (null == Class12.aClass16_182.aString194)
			Class12.aClass16_182.aString194 = Class196.anApplet2198.getCodeBase().getHost();
		Class12.aClass16_176 = Class12.aClass16_182;
		Class557.aClass455_7466 = new Class455();
		Class700.aClass454_8734 = new Class454_Sub1();
		Class624.aClass449_8128 = new Class449(Class12.aClass16_175.aString194,
				-1255012695 * Class12.aClass16_175.anInt193, -352215983 * aClass673_11108.anInt8535);
		if (Class673.aClass673_8529 == aClass673_11108)
			aBool10894 = false;
		Class596.aShortArray7842 = Class299.aShortArray3324 = ItemType.aShortArray30 = new short[256];
		try {
			Class141_Sub1.aClipboard8801 = Class465.method5625(312287159).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class416.aClass544_4749 = Class542.method6627(Class64.aCanvas754, 832048346);
		Class95_Sub1_Sub2.aClass537_11200 = Class259.method3579(Class64.aCanvas754, true, 857323134);
		if (aClass22_6948 != null)
			Class671.aClass539_8527 = new Class539(255, aClass22_6948, aClass22_6959, 2000000);
		Class495.aClass283_Sub1_5578 = new Class283_Sub1(aClass31_11137);
		try {
			Class495.aClass283_Sub1_5578.method3826(Class280.aClass280_3062, 58384044);
			Class495.aClass283_Sub1_5578.method3763(Class297.aClass297_3255, false, -1767346905);
			Class495.aClass283_Sub1_5578.method3831(Class294.aClass294_3226, false, 1812411209);
			Class495.aClass283_Sub1_5578.method3763(Class297.aClass297_3255, false, -607770696);
			Class495.aClass283_Sub1_5578.method3771(Class422.method5051(99999.0F, 99999.0F, 99999.0F), 1047096249);
			Class495.aClass283_Sub1_5578.method3768(
					Class422.method5051(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY),
					(byte) 31);
			Class495.aClass283_Sub1_5578.method3818(Class422.method5051(99999.0F, 99999.0F, 99999.0F), 1852904163);
			Class495.aClass283_Sub1_5578.method3767(
					Class422.method5051(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY),
					743067961);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
		Class555.method6746(Class196.anApplet2198, Class312.aString3440, 1406272237);
		if (ModeWhere.LIVE != Class646.aClass665_8386 && ModeWhere.aClass665_8470 != Class646.aClass665_8386)
			aBool10887 = true;
		aString6922 = Class39.aClass39_439.method807(Class378_Sub2.aClass668_10123, (byte) 102);
		Class590.aClass488_7736 = new Class488();
		new Thread(Class590.aClass488_7736).start();
		Class499.aClass40_6844 = new Class40();
		Class96.aClass259_1226 = new Class259();
	}

	@Override
	final void method6191(int i) {
		if (3 != anInt10876 * 175711435) {
			if ((15 == 175711435 * anInt10876 || ScenePacketType.method4846(anInt10876 * 175711435, 1226330573)
					|| Class309.method4127(175711435 * anInt10876, 2130436643)) && null != Class365.aClass218_3848)
				Class365.aClass218_3848.method3109(Class365.aClass218_3848.method3107(1948124834),
						Class514.aClass528_Sub38_6967.aClass691_Sub34_10584.method10132((byte) 70), (byte) 41);
			if (aBool10936) {
				synchronized (anObject10938) {
					anObject10938.notify();
				}
				synchronized (anObject10937) {
					try {
						anObject10937.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool10936 = false;
			}
			anInt11127++;
			if (anInt11127 % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				Class464.anInt5305 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10
						+ gregoriancalendar.get(13) / 6);
				aRandom10970.setSeed(Class464.anInt5305);
			}
			long l = Class249.method3417(2143481240);
			aClass109_10930.method1387(-2093717952);
			aClass109_11162.method1387(-1291194132);
			method10260(2023672960);
			if (null != Class244.aClass428_2737)
				Class244.aClass428_2737.method5152(-31932756);
			if (null != Class365.aClass218_3848)
				Class365.aClass218_3848.method3125(-362154873);
			Class416.aClass544_4749.method6643(-1423067607);
			Class95_Sub1_Sub2.aClass537_11200.method6498(-1967805335);
			Class372.method4676(Class587.aClass173_7714, l);
			if (Class587.aClass173_7714 != null)
				Class587.aClass173_7714.method2158((int) l);
			anInt10995 = 0;
			anInt10906 = 0;
			for (Interface61 interface61 = Class416.aClass544_4749.method6645(
					1793269677); null != interface61; interface61 = Class416.aClass544_4749.method6645(1793269677)) {
				int i_2_ = interface61.method48(-723983655);
				if (i_2_ == 2 || i_2_ == 3) {
					if (-1384174071 * anInt10995 < 128) {
						anInterface61Array11123[anInt10995 * -1384174071] = interface61;
						anInt10995 += 619233337;
					}
				} else if (i_2_ == 0) {
					if (Class26.method708((short) -23004) && interface61.method384(1838827879) == 28) {
						if (playerRights * 859247239 >= 2 && Class416.aClass544_4749.method6644(82, 831929792)) {
							if (Class677.method7955(-225278296))
								Class327.method4262(115096820);
							else
								Class308.method4118(Class108.myPlayer.method169(829192689), 1867824259);
						} else if (Class194.method2812(1439800124)
								&& (Class514.aClass528_Sub38_6967.aClass691_Sub26_10573.method10035(1674537078) == 0
										|| Class416.aClass544_4749.method6644(86, -120662589)))
							Class301.method4022((byte) 8);
						else if (Class514.aClass528_Sub38_6967.aClass691_Sub26_10573.method10035(321374334) == 0
								|| Class416.aClass544_4749.method6644(86, -1398574197))
							HandshakeOpcode.method4870((byte) 91);
						else
							Class173.method2555(
									(Class39.aClass39_343.method807((Class378_Sub2.aClass668_10123), (byte) 102)),
									-787565797);
					}
					if (anInt10906 * 691559213 < 77) {
						anInterface61Array10907[anInt10906 * 691559213] = interface61;
						anInt10906 += -1644712795;
					}
				}
			}
			anInt10926 = 0;
			for (Class528_Sub33 class528_sub33 = Class95_Sub1_Sub2.aClass537_11200
					.method6508(12358400); class528_sub33 != null; class528_sub33 = Class95_Sub1_Sub2.aClass537_11200
							.method6508(12358400)) {
				int i_3_ = class528_sub33.method9506((byte) -12);
				if (-1 == i_3_)
					Class589.method7074(class528_sub33, 1521609046);
				else if (i_3_ == 6) {
					anInt10926 += class528_sub33.method9496(165433223) * 929267889;
					class528_sub33.method9510((byte) -56);
				} else if (Class321_Sub2.method9081(i_3_, -1421760085)) {
					aClass688_10900.method8031(class528_sub33, (byte) -78);
					if (aClass688_10900.method8039(-1162780761) > 10) {
						Class528_Sub33 class528_sub33_4_ = ((Class528_Sub33) aClass688_10900.method8032(-1490570711));
						if (class528_sub33_4_ != null)
							class528_sub33_4_.method9510((byte) -117);
					}
				}
			}
			if (Class194.method2812(1439800124))
				Class190.method2784(804273529);
			if (Class539.method6615(anInt10876 * 175711435, -2032815428)) {
				Class192.method2795(1278114172);
				Class450.method5430((byte) 1);
			} else if (Class667.method7910(175711435 * anInt10876, 1640480288))
				aClass495_10935.method5980((byte) 8);
			if (ScenePacketType.method4846(anInt10876 * 175711435, -233628803)
					&& !Class667.method7910(anInt10876 * 175711435, -148456434)) {
				method10194((byte) -103);
				Class691_Sub19.method9974(1708325665);
				ProtocolLoop.method1059((byte) -110);
			} else if (Class309.method4127(175711435 * anInt10876, 2130436643)
					&& !Class667.method7910(anInt10876 * 175711435, -599780922)) {
				method10194((byte) -42);
				ProtocolLoop.method1059((byte) -112);
			} else if (175711435 * anInt10876 == 0)
				ProtocolLoop.method1059((byte) -42);
			else if (Class622.method7419(175711435 * anInt10876, (byte) -123)
					&& !Class667.method7910(anInt10876 * 175711435, 825455210))
				Class19.method647(-2115145944);
			else if (anInt10876 * 175711435 == 17 || anInt10876 * 175711435 == 7) {
				ProtocolLoop.method1059((byte) -6);
				if (-3 != Class54.anInt669 * -1852659257 && -1852659257 * Class54.anInt669 != 2
						&& 15 != Class54.anInt669 * -1852659257) {
					if (175711435 * anInt10876 == 7) {
						Class54.anInt672 = Class54.anInt679 * -1497558947;
						Class54.anInt645 = Class54.anInt674 * 146226169;
						Class54.anInt670 = -2095807961 * Class54.anInt669;
						if (Class616.aBool8033) {
							Class168.method2100(Class281.aClass16_3066.anInt192 * 2027542149,
									Class281.aClass16_3066.aString194, -1255012695 * Class281.aClass16_3066.anInt193,
									1401645101 * Class281.aClass16_3066.anInt191, 289841317);
							aClass109_10930.method1397((short) 19135);
							Class487.method5890(17, 2130003981);
						} else
							Class416.method4969(Class54.aBool675, 5126206);
					} else
						Class416.method4969(false, 5126206);
				}
			}
			Class54.method956(Class587.aClass173_7714, 1502009502);
			aClass688_10900.method8032(-1490570711);
			if (Class587.aClass173_7714 != null) {
				Iterator iterator = aMap11051.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Class105 class105 = (Class105) entry.getValue();
					if (class105.method1352(61095725)) {
						byte[] is = class105.method1353(-1125706660);
						if (is != null) {
							try {
								BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
								int[] is_5_ = Class207.method2927(bufferedimage, -1494425507);
								Class151 class151 = (Class587.aClass173_7714.method2418(is_5_, 0,
										bufferedimage.getWidth(), bufferedimage.getWidth(), bufferedimage.getHeight(),
										-181499792));
								aClass186_11173.method2729(class151, ((Integer) entry.getKey()).intValue());
							} catch (IOException ioexception) {
								VarDomainType.method5340(Class326.aclient3497.method6214(-787870562), ioexception,
										2086696297);
							}
						}
						iterator.remove();
					}
				}
			}
		}
	}

	public static final void method10192(Class226 class226, Class229[] class229s, int i, int i_6_, int i_7_, int i_8_,
			int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		for (int i_14_ = 0; i_14_ < class229s.length; i_14_++) {
			Class229 class229 = class229s[i_14_];
			if (class229 != null && -1027873541 * class229.anInt2522 == i) {
				int i_15_ = class229.anInt2388 * -147131735 + i_10_;
				int i_16_ = -1087215923 * class229.anInt2360 + i_11_;
				int i_17_;
				int i_18_;
				int i_19_;
				int i_20_;
				if (class229.anInt2378 * -319431967 == 2) {
					i_17_ = i_6_;
					i_18_ = i_7_;
					i_19_ = i_8_;
					i_20_ = i_9_;
				} else {
					int i_21_ = i_15_ + class229.anInt2476 * -1352480433;
					int i_22_ = i_16_ + class229.anInt2458 * 1661025435;
					if (-319431967 * class229.anInt2378 == 9) {
						i_21_++;
						i_22_++;
					}
					i_17_ = i_15_ > i_6_ ? i_15_ : i_6_;
					i_18_ = i_16_ > i_7_ ? i_16_ : i_7_;
					i_19_ = i_21_ < i_8_ ? i_21_ : i_8_;
					i_20_ = i_22_ < i_9_ ? i_22_ : i_9_;
				}
				if (class229.anInt2378 * -319431967 != 0 && !class229.aBool2483
						&& method10201(class229).anInt10455 * -450987711 == 0 && class229 != aClass229_10987
						&& (-1257480855 * class229.anInt2474 != Class229.anInt2484 * 362380521)
						&& (Class229.anInt2361 * -701024247 != -1257480855 * class229.anInt2474)
						&& (-1948898659 * Class229.anInt2356 != class229.anInt2474 * -1257480855)
						&& (Class229.anInt2355 * 251079357 != class229.anInt2474 * -1257480855)) {
					if (i_17_ < i_19_ && i_18_ < i_20_)
						Class195.method2826(class229, 1996270446);
				} else if (!method10203(class229)) {
					if (class229 == aClass229_11067 && Class347.method4546(aClass229_11067, -186802661)) {
						aBool10890 = true;
						anInt11078 = 1917575263 * i_15_;
						anInt11079 = -1559734921 * i_16_;
					}
					if (class229.aBool2507 || i_17_ < i_19_ && i_18_ < i_20_) {
						if (class229.aBool2492 && i_12_ >= i_17_ && i_13_ >= i_18_ && i_12_ < i_19_ && i_13_ < i_20_) {
							for (Class528_Sub30 class528_sub30 = ((Class528_Sub30) aClass688_10992.method8034(
									548929191)); null != class528_sub30; class528_sub30 = ((Class528_Sub30) aClass688_10992
											.method8037(-823122697))) {
								if (class528_sub30.aBool10458) {
									class528_sub30.method6443(2127286745);
									class528_sub30.aClass229_10461.aBool2544 = false;
								}
							}
							if (-1758535753 * ItemType.anInt104 == 0) {
								aClass229_11067 = null;
								aClass229_10987 = null;
							}
							anInt11128 = 0;
							Class518_Sub1.aBool10702 = false;
							aBool10947 = false;
							if (!Class28.aBool273)
								Class24.method698(95190825);
						}
						boolean bool = (class229.aBool2538 && 5 == class229.anInt2378 * -319431967
								&& 0 == -695134203 * class229.anInt2406 && -182549293 * class229.anInt2533 < 0
								&& -1 == 1272672363 * class229.anInt2528 && !class229.aBool2411
								&& 2073033379 * class229.anInt2410 == 0);
						boolean bool_23_ = false;
						if (i_12_ >= i_17_ && i_13_ >= i_18_ && i_12_ < i_19_ && i_13_ < i_20_) {
							if (bool) {
								Class243 class243 = class229.method3197((Class587.aClass173_7714), 1460227679);
								if (null == class243
										|| (-1352480433 * class229.anInt2476 != class243.anInt2725 * -728362293)
										|| (class229.anInt2458 * 1661025435 != 1122147715 * class243.anInt2728))
									bool_23_ = true;
								else {
									int i_24_ = i_12_ - i_15_;
									int i_25_ = i_13_ - i_16_;
									if (i_25_ >= 0 && i_25_ < (class243.anIntArray2727).length) {
										int i_26_ = class243.anIntArray2727[i_25_];
										if (i_24_ >= i_26_ && (i_24_ <= i_26_ + (class243.anIntArray2726[i_25_])))
											bool_23_ = true;
									}
								}
							} else
								bool_23_ = true;
						}
						if (!aBool10899 && bool_23_) {
							if (-1715270145 * class229.anInt2350 >= 0)
								anInt11048 = -128491129 * class229.anInt2350;
							else if (class229.aBool2492)
								anInt11048 = -1210203257;
						}
						if (!Class28.aBool273 && bool_23_ && !class226.aBool2335)
							Class238.method3297(class229, i_12_ - i_15_, i_13_ - i_16_, 219783196);
						boolean bool_27_ = false;
						if (Class95_Sub1_Sub2.aClass537_11200.method6503((short) -18038) && bool_23_)
							bool_27_ = true;
						boolean bool_28_ = false;
						Class528_Sub33 class528_sub33 = ((Class528_Sub33) aClass688_10900.method8034(1209970755));
						if (null != class528_sub33 && class528_sub33.method9506((byte) -95) == 0
								&& class528_sub33.method9494(-1236136691) >= i_17_
								&& class528_sub33.method9495((byte) 3) >= i_18_
								&& class528_sub33.method9494(-1236136691) < i_19_
								&& class528_sub33.method9495((byte) 3) < i_20_) {
							if (bool) {
								Class243 class243 = class229.method3197((Class587.aClass173_7714), 1077430836);
								if (null == class243
										|| (-728362293 * class243.anInt2725 != class229.anInt2476 * -1352480433)
										|| (1661025435 * class229.anInt2458 != class243.anInt2728 * 1122147715))
									bool_28_ = true;
								else {
									int i_29_ = (class528_sub33.method9494(-1236136691) - i_15_);
									int i_30_ = (class528_sub33.method9495((byte) 3) - i_16_);
									if (i_30_ >= 0 && i_30_ < (class243.anIntArray2727).length) {
										int i_31_ = class243.anIntArray2727[i_30_];
										if (i_29_ >= i_31_ && (i_29_ <= i_31_ + (class243.anIntArray2726[i_30_])))
											bool_28_ = true;
									}
								}
							} else
								bool_28_ = true;
						}
						if (class229.aBool2507 && !Class194.method2812(1439800124)) {
							for (int i_32_ = 0; i_32_ < class229.aByteArrayArray2464.length; i_32_++) {
								boolean bool_33_ = false;
								boolean bool_34_ = false;
								if (class229.anIntArray2537[i_32_] > 0) {
									for (int i_35_ = 0; i_35_ < anInt10995 * -1384174071; i_35_++) {
										if (class229.anIntArray2537[i_32_] == anInterface61Array11123[i_35_]
												.method399((byte) -5)) {
											bool_33_ = true;
											if (class229.anIntArray2555 == null
													|| (class229.anIntArray2555[i_32_]) <= anInt11127)
												bool_34_ = true;
											break;
										}
									}
								}
								if (!bool_33_ && null != (class229.aByteArrayArray2464[i_32_])) {
									for (int i_36_ = 0; i_36_ < (class229.aByteArrayArray2464[i_32_]).length; i_36_++) {
										if (Class416.aClass544_4749
												.method6644((class229.aByteArrayArray2464[i_32_][i_36_]), -918710438)) {
											bool_33_ = true;
											if (null != class229.anIntArray2555
													&& (class229.anIntArray2555[i_32_]) > anInt11127)
												break;
											byte i_37_ = (class229.aByteArrayArray2465[i_32_][i_36_]);
											if (i_37_ == 0
													|| ((0 == (i_37_ & 0x8)
															|| (!(Class416.aClass544_4749.method6644(86, -1012666363))
																	&& !(Class416.aClass544_4749.method6644(82,
																			-597813168))
													&& !(Class416.aClass544_4749.method6644(81, 1288868747))))
													&& (0 == (i_37_ & 0x2)
															|| (Class416.aClass544_4749.method6644(86, -1933704550)))
													&& (0 == (i_37_ & 0x1)
															|| (Class416.aClass544_4749.method6644(82, 1379733494)))
													&& (0 == (i_37_ & 0x4)
															|| (Class416.aClass544_4749.method6644(81, 1787178002))))) {
												bool_34_ = true;
												break;
											}
										}
									}
								}
								if (bool_34_) {
									if (i_32_ < 10)
										Class204.method2910(1 + i_32_, class229.anInt2376 * 306930455,
												1835803215 * class229.anInt2377, "", -2133134664);
									else if (10 == i_32_) {
										Class7.method565(-1187426900);
										Class528_Sub29 class528_sub29 = method10201(class229);
										Class181_Sub1.method8397(class229, class528_sub29.method9474(598150749),
												(class528_sub29.anInt10456 * -547002555), 1165336146);
										aString10902 = Class279.method3734(class229, -1161709639);
										if (null == aString10902)
											aString10902 = "Null";
										aString11175 = new StringBuilder().append(class229.aString2473)
												.append(Class666.method7905(16777215, (short) -31588)).toString();
									}
									int i_38_ = class229.anIntArray2466[i_32_];
									if (class229.anIntArray2555 == null)
										class229.anIntArray2555 = (new int[(class229.aByteArrayArray2464).length]);
									if (null == class229.anIntArray2467)
										class229.anIntArray2467 = (new int[(class229.aByteArrayArray2464).length]);
									if (i_38_ != 0) {
										if (class229.anIntArray2555[i_32_] == 0)
											class229.anIntArray2555[i_32_] = ((class229.anIntArray2467[i_32_])
													+ (anInt11127 + i_38_));
										else
											class229.anIntArray2555[i_32_] = i_38_ + anInt11127;
									} else
										class229.anIntArray2555[i_32_] = 2147483647;
								}
								if (!bool_33_ && null != class229.anIntArray2555)
									class229.anIntArray2555[i_32_] = 0;
							}
						}
						if (bool_28_)
							Class689.method8062(class229, (class528_sub33.method9494(-1236136691) - i_15_),
									class528_sub33.method9495((byte) 3) - i_16_, 1160917245);
						if (null != aClass229_11067 && aClass229_11067 != class229 && bool_23_) {
							if (true == class229.aBool2492)
								aClass229_11071 = null;
							if (method10201(class229).method9476(-1728090276))
								aClass229_11071 = class229;
						}
						if (aClass229_10987 == class229) {
							aBool11041 = true;
							anInt11073 = -592246737 * i_15_;
							anInt11074 = i_16_ * -901358103;
							anInt11075 = aClass229_10987.anInt2476 * 1357798961;
							anInt11076 = aClass229_10987.anInt2458 * -1508220413;
						}
						if (class229.aBool2483 || -1257480855 * class229.anInt2474 != 0) {
							if (bool_23_ && 454740049 * anInt10926 != 0 && null != class229.anObjectArray2511) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aBool10458 = true;
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anInt10464 = anInt10926 * -899278211;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2511;
								aClass688_10992.method8031(class528_sub30, (byte) 55);
							}
							if (null != aClass229_11067) {
								bool_28_ = false;
								bool_27_ = false;
							} else if (Class28.aBool273
									|| ((class229.anInt2474 * -1257480855 != (-1742987307 * Class229.anInt2358))
											&& 1914299515 * anInt11128 > 0)) {
								bool_28_ = false;
								bool_27_ = false;
								bool_23_ = false;
							}
							if (-1257480855 * class229.anInt2474 != 0) {
								if ((-1948898659 * Class229.anInt2356 == -1257480855 * class229.anInt2474)
										|| (251079357 * Class229.anInt2355 == class229.anInt2474 * -1257480855)) {
									aClass229_11027 = class229;
									Class607 class607 = aClass495_10935.method5975(-1304110409).method7487(1481157638);
									if (class607.method7214((byte) -23) != null
											&& !Class590.aClass488_7736.method5893(890412533))
										class607.method7214((byte) -28).method6078(Class587.aClass173_7714,
												class229.anInt2458 * 1661025435,
												Class514.aClass528_Sub38_6967.aClass691_Sub22_10588
														.method9998(934870892),
												1862629170);
									if (Class229.anInt2356 * -1948898659 == class229.anInt2474 * -1257480855) {
										if (!Class28.aBool273 && i_12_ >= i_17_ && i_13_ >= i_18_ && i_12_ < i_19_
												&& i_13_ < i_20_) {
											Class650.method7740(Class587.aClass173_7714, i_12_, i_13_, (byte) 6);
											for (Class511_Sub1 class511_sub1 = ((Class511_Sub1) (aClass695_11000
													.method8177(
															-1591660054))); null != class511_sub1; class511_sub1 = ((Class511_Sub1) (aClass695_11000
																	.method8184(-796729433)))) {
												if ((i_12_ >= (-652345335 * (class511_sub1.anInt10205)))
														&& (i_12_ < (949174909 * (class511_sub1.anInt10207)))
														&& (i_13_ >= ((class511_sub1.anInt10202) * -1453031909))
														&& (i_13_ < ((class511_sub1.anInt10208) * 2105335129))) {
													Class24.method698(95190825);
													Class164.method2089((class511_sub1.aClass645_Sub1_Sub5_Sub1_10204),
															(byte) 108);
												}
											}
										} else
											Class95.method1257(Class587.aClass173_7714, (byte) 0);
									}
									int i_39_ = GPI.localPlayerCount * 1087758653;
									int[] is = GPI.localPlayerIndicies;
									for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
										Player class645_sub1_sub5_sub1_sub2 = (localPlayers[is[i_40_]]);
										if (null != class645_sub1_sub5_sub1_sub2) {
											Class420.method5038(Cs2Context.aClass561_7526, -1, -1,
													class645_sub1_sub5_sub1_sub2, is[i_40_], (byte) 80);
											class645_sub1_sub5_sub1_sub2.method10684(i_17_, i_18_, i_19_, i_20_,
													(i_15_ - (-1014124179 * class229.anInt2400)),
													(i_16_ - (1665217863 * class229.anInt2401)), i_12_, i_13_,
													1957167147);
										}
									}
									for (int i_41_ = 0; i_41_ < anInt10922 * -2065344127; i_41_++) {
										int i_42_ = anIntArray10923[i_41_];
										Class528_Sub31 class528_sub31 = ((Class528_Sub31) aClass692_11110
												.method8137(i_42_));
										if (null != class528_sub31) {
											Class420.method5038(Cs2Context.aClass561_7525,
													(284752095
															* (((NPC) (class528_sub31.anObject10468)).aClass299_12043.anInt3268)),
													-1, ((Entity) (class528_sub31.anObject10468)), i_42_, (byte) 58);
											((Entity) class528_sub31.anObject10468).method10684(i_17_, i_18_, i_19_,
													i_20_, (i_15_ - (-1014124179 * class229.anInt2400)),
													(i_16_ - (1665217863 * class229.anInt2401)), i_12_, i_13_,
													1962173695);
										}
									}
									continue;
								}
								if (-1257480855 * class229.anInt2474 == 362380521 * Class229.anInt2484) {
									int i_43_ = 0;
									int i_44_ = i_8_ - i_6_;
									int i_45_ = i_12_ - i_15_;
									int i_46_ = i_13_ - i_16_;
									if (-319431967 * class229.anInt2378 == 5) {
										Class243 class243 = (class229.method3197(Class587.aClass173_7714, 1528857535));
										if (class243 == null)
											continue;
										if (i_12_ >= i_17_ && i_13_ >= i_18_ && i_12_ < i_19_ && i_13_ < i_20_) {
											i_43_ = (class243.anIntArray2727[i_46_]);
											i_44_ = (class243.anIntArray2726[i_46_]);
										}
									}
									if ((1886713181 * Class98.anInt1252 == 0 || (Class98.anInt1252 * 1886713181 == 3))
											&& !Class28.aBool273 && i_12_ >= i_17_ && i_13_ >= i_18_ && i_12_ < i_19_
											&& i_13_ < i_20_ && i_45_ >= i_43_ && i_45_ <= i_43_ + i_44_) {
										i_45_ -= (class229.anInt2476 * -1352480433 / 2);
										i_46_ -= (1661025435 * class229.anInt2458 / 2);
										int i_47_;
										if (-1860881523 * Class390.anInt4111 == 1)
											i_47_ = (int) aFloat11088 & 0x3fff;
										else if (6 == (-1860881523 * Class390.anInt4111))
											i_47_ = (int) ((Class495.aClass283_Sub1_5578.method3792(-16777216))
													* 2607.5945876176133);
										else
											i_47_ = (((int) aFloat11088 + anInt10852 * -946910725) & 0x3fff);
										int i_48_ = Class417.anIntArray4766[i_47_];
										int i_49_ = Class417.anIntArray4767[i_47_];
										if (1 != (-1860881523 * Class390.anInt4111)) {
											i_48_ = ((256 + anInt11049 * -1303557179) * i_48_) >> 8;
											i_49_ = ((256 + -1303557179 * anInt11049) * i_49_) >> 8;
										}
										int i_50_ = (i_46_ * i_48_ + i_49_ * i_45_ >> 14);
										int i_51_ = (i_46_ * i_49_ - i_45_ * i_48_ >> 14);
										int i_52_;
										int i_53_;
										if (1 == (Class390.anInt4111 * -1860881523)) {
											i_52_ = (anInt10972 * 51753521 >> 9) + (i_50_ >> 2);
											i_53_ = (1159024597 * anInt10973 >> 9) - (i_51_ >> 2);
										} else {
											int i_54_ = (Class108.myPlayer.method10671((byte) -84) - 1) * 256;
											Class422 class422 = (Class108.myPlayer.method7693().aClass422_4868);
											i_52_ = (((int) class422.aFloat4780 - i_54_) >> 9) + (i_50_ >> 2);
											i_53_ = (((int) class422.aFloat4777 - i_54_) >> 9) - (i_51_ >> 2);
										}
										if (aBool10899 && 0 != ((Class296.anInt3249 * -856748185) & 0x40)) {
											Class229 class229_55_ = (Class230.method3236(
													(Class487.anInt5494 * -771216895), -1114833639 * anInt11052,
													351101509));
											if (null != class229_55_)
												Class280.method3738(aString10902,
														new StringBuilder().append(" ").append(Class49.aString553)
																.toString(),
														(Class528_Sub6.anInt10255 * -555764949), 59,
														(class229.anInt2528 * 1272672363), 1L, i_52_, i_53_, true,
														false, ((1835803215 * (class229.anInt2377)) << 32)
																| ((class229.anInt2376) * 306930455),
														true, 1541243471);
											else
												Class7.method565(-1187426900);
										} else {
											if (aClass673_11108 == Class673.aClass673_8531)
												Class280.method3738(
														(Class39.aClass39_475.method807((Class378_Sub2.aClass668_10123),
																(byte) 102)),
														"", -1, 60, -1, 1L, i_52_, i_53_, true, false, 0L, true,
														1807323508);
											Class280.method3738(Class137.aString1631, "", 177967549 * anInt10963, 23,
													-1, 1L, i_52_, i_53_, true, false, 0L, true, 1520637496);
										}
									}
									continue;
								}
								if (-1257480855 * class229.anInt2474 == Class229.anInt2358 * -1742987307) {
									Class36.aClass229_335 = class229;
									if (bool_23_)
										Class518_Sub1.aBool10702 = true;
									if (bool_28_) {
										int i_56_ = (int) (((class528_sub33.method9494(-1236136691)) - i_15_
												- ((class229.anInt2476) * -1352480433 / 2)) * 2.0
												/ (Class518.aFloat7023));
										int i_57_ = (int) -(((class528_sub33.method9495((byte) 3)) - i_16_
												- ((class229.anInt2458) * 1661025435 / 2)) * 2.0
												/ (Class518.aFloat7023));
										int i_58_ = (Class518.anInt6972
												+ (i_56_ + (Class200_Sub1.anInt9820 * -1004126987)));
										int i_59_ = (Class98.anInt1256 * -1160116407 + i_57_ + Class518.anInt6995);
										Class528_Sub21_Sub17 class528_sub21_sub17 = Class625.method7447((byte) 6);
										if (null != class528_sub21_sub17) {
											int[] is = new int[3];
											class528_sub21_sub17.method10584(i_58_, i_59_, is, -797499173);
											if (is != null) {
												if ((Class416.aClass544_4749.method6644(82, -966546754))
														&& (859247239 * playerRights > 0)) {
													Class29.method751(is[0], is[1], is[2], 469219997);
													continue;
												}
												aBool10947 = true;
												Class265.anInt2870 = is[0] * -100002357;
												Class445_Sub1.anInt10126 = 1366663929 * is[1];
												Class258.anInt2842 = is[2] * 1492039215;
											}
											anInt11128 = 18242227;
											aBool11082 = false;
											anInt11069 = (Class95_Sub1_Sub2.aClass537_11200.method6507(1489714944)
													* -1509058011);
											anInt11070 = (Class95_Sub1_Sub2.aClass537_11200.method6504((byte) 26)
													* -2138511203);
										}
									} else if (bool_27_ && (anInt11128 * 1914299515 > 0)) {
										if (1914299515 * anInt11128 == 1 && ((anInt11069
												* -62197331 != Class95_Sub1_Sub2.aClass537_11200.method6507(874160083))
												|| (anInt11070 * -525017675 != (Class95_Sub1_Sub2.aClass537_11200
														.method6504((byte) -19))))) {
											Class557.anInt7467 = (-231849485 * Class200_Sub1.anInt9820);
											Class529.anInt7112 = (-1452017131 * Class98.anInt1256);
											anInt11128 = 36484454;
										}
										if (1914299515 * anInt11128 == 2) {
											aBool11082 = true;
											Class235.method3281(((2043959159 * Class557.anInt7467)
													+ (int) (((-62197331 * anInt11069)
															- (Class95_Sub1_Sub2.aClass537_11200.method6507(272965846)))
															* 2.0 / (Class518.aFloat6991))),
													(byte) -40);
											Class590.method7076(((-1835062939 * Class529.anInt7112)
													- (int) (((-525017675 * anInt11070)
															- (Class95_Sub1_Sub2.aClass537_11200.method6504((byte) 69)))
															* 2.0 / (Class518.aFloat6991))),
													-1223580235);
										}
									} else {
										if (1914299515 * anInt11128 > 0 && !aBool11082) {
											if ((1 == anInt11046 * -1046544163 || Class552.method6715(717927929))
													&& (Class28.anInt303 * -1024340783) > 2)
												Class5_Sub18.method10185(anInt11069 * -62197331,
														-525017675 * anInt11070, (byte) -9);
											else if (Class71.method1096((byte) 98))
												Class5_Sub18.method10185(anInt11069 * -62197331,
														-525017675 * anInt11070, (byte) 6);
										}
										anInt11128 = 0;
									}
									continue;
								}
								if (-1257480855 * class229.anInt2474 == Class229.anInt2359 * 651813819) {
									if (bool_27_)
										Class92.method1229(
												(Class95_Sub1_Sub2.aClass537_11200.method6507(-1094287454) - i_15_),
												(Class95_Sub1_Sub2.aClass537_11200.method6504((byte) -38) - i_16_),
												-1352480433 * class229.anInt2476, 1661025435 * class229.anInt2458,
												1437421750);
									continue;
								}
								if (class229.anInt2474 * -1257480855 == -701024247 * Class229.anInt2361) {
									Class389.method4772(class229, i_15_, i_16_, (byte) 10);
									continue;
								}
							}
							if (!class229.aBool2395 && bool_28_) {
								class229.aBool2395 = true;
								if (class229.anObjectArray2485 != null) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aBool10458 = true;
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anInt10459 = (class528_sub33.method9494(-1236136691) - i_15_)
											* -391683557;
									class528_sub30.anInt10464 = (class528_sub33.method9495((byte) 3) - i_16_)
											* 388878445;
									class528_sub30.anObjectArray10460 = class229.anObjectArray2485;
									aClass688_10992.method8031(class528_sub30, (byte) -61);
								}
							}
							if (class229.aBool2395 && bool_27_ && class229.anObjectArray2486 != null) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aBool10458 = true;
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anInt10459 = (Class95_Sub1_Sub2.aClass537_11200.method6507(-827370059)
										- i_15_) * -391683557;
								class528_sub30.anInt10464 = (Class95_Sub1_Sub2.aClass537_11200.method6504((byte) -36)
										- i_16_) * 388878445;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2486;
								aClass688_10992.method8031(class528_sub30, (byte) -8);
							}
							if (class229.aBool2395 && !bool_27_) {
								class229.aBool2395 = false;
								if (class229.anObjectArray2487 != null) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aBool10458 = true;
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anInt10459 = (Class95_Sub1_Sub2.aClass537_11200.method6507(358299260)
											- i_15_) * -391683557;
									class528_sub30.anInt10464 = (Class95_Sub1_Sub2.aClass537_11200.method6504((byte) 47)
											- i_16_) * 388878445;
									class528_sub30.anObjectArray10460 = class229.anObjectArray2487;
									aClass688_10958.method8031(class528_sub30, (byte) -31);
								}
							}
							if (bool_27_ && null != class229.anObjectArray2491) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aBool10458 = true;
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anInt10459 = (Class95_Sub1_Sub2.aClass537_11200.method6507(1438618693)
										- i_15_) * -391683557;
								class528_sub30.anInt10464 = (Class95_Sub1_Sub2.aClass537_11200.method6504((byte) 17)
										- i_16_) * 388878445;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2491;
								aClass688_10992.method8031(class528_sub30, (byte) 66);
							}
							if (!class229.aBool2544 && bool_23_) {
								class229.aBool2544 = true;
								if (class229.anObjectArray2552 != null) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aBool10458 = true;
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anInt10459 = (Class95_Sub1_Sub2.aClass537_11200
											.method6507(1370038454) - i_15_) * -391683557;
									class528_sub30.anInt10464 = (Class95_Sub1_Sub2.aClass537_11200
											.method6504((byte) -103) - i_16_) * 388878445;
									class528_sub30.anObjectArray10460 = class229.anObjectArray2552;
									aClass688_10992.method8031(class528_sub30, (byte) -50);
								}
							}
							if (class229.aBool2544 && bool_23_ && null != class229.anObjectArray2417) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aBool10458 = true;
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anInt10459 = (Class95_Sub1_Sub2.aClass537_11200.method6507(-1071841686)
										- i_15_) * -391683557;
								class528_sub30.anInt10464 = (Class95_Sub1_Sub2.aClass537_11200.method6504((byte) 13)
										- i_16_) * 388878445;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2417;
								aClass688_10992.method8031(class528_sub30, (byte) 15);
							}
							if (class229.aBool2544 && !bool_23_) {
								class229.aBool2544 = false;
								if (null != class229.anObjectArray2530) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aBool10458 = true;
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anInt10459 = (Class95_Sub1_Sub2.aClass537_11200
											.method6507(1662394956) - i_15_) * -391683557;
									class528_sub30.anInt10464 = (Class95_Sub1_Sub2.aClass537_11200.method6504((byte) 24)
											- i_16_) * 388878445;
									class528_sub30.anObjectArray10460 = class229.anObjectArray2530;
									aClass688_10958.method8031(class528_sub30, (byte) 79);
								}
							}
							if (class229.anObjectArray2508 != null) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2508;
								aClass688_11146.method8031(class528_sub30, (byte) 3);
							}
							if (class229.anObjectArray2502 != null
									&& (1435712025 * anInt11094 > -1901110041 * class229.anInt2498)) {
								if (class229.anIntArray2503 == null
										|| ((anInt11094 * 1435712025 - -1901110041 * class229.anInt2498) > 64)) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anObjectArray10460 = class229.anObjectArray2502;
									aClass688_10992.method8031(class528_sub30, (byte) 102);
								} else {
									while_62_: for (int i_60_ = (-1901110041 * class229.anInt2498); i_60_ < 1435712025
											* anInt11094; i_60_++) {
										int i_61_ = anIntArray11093[i_60_ & 0x3f];
										for (int i_62_ = 0; i_62_ < (class229.anIntArray2503).length; i_62_++) {
											if (class229.anIntArray2503[i_62_] == i_61_) {
												Class528_Sub30 class528_sub30 = new Class528_Sub30();
												class528_sub30.aClass229_10461 = class229;
												class528_sub30.anObjectArray10460 = (class229.anObjectArray2502);
												aClass688_10992.method8031(class528_sub30, (byte) 33);
												break while_62_;
											}
										}
									}
								}
								class229.anInt2498 = anInt11094 * -1811492609;
							}
							if (null != class229.anObjectArray2504
									&& (-727191365 * anInt11021 > 617693451 * class229.anInt2551)) {
								if (class229.anIntArray2505 == null
										|| ((-727191365 * anInt11021 - 617693451 * class229.anInt2551) > 64)) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anObjectArray10460 = class229.anObjectArray2504;
									aClass688_10992.method8031(class528_sub30, (byte) -99);
								} else {
									while_63_: for (int i_63_ = class229.anInt2551 * 617693451; i_63_ < -727191365
											* anInt11021; i_63_++) {
										int i_64_ = anIntArray11095[i_63_ & 0x3f];
										for (int i_65_ = 0; i_65_ < (class229.anIntArray2505).length; i_65_++) {
											if (class229.anIntArray2505[i_65_] == i_64_) {
												Class528_Sub30 class528_sub30 = new Class528_Sub30();
												class528_sub30.aClass229_10461 = class229;
												class528_sub30.anObjectArray10460 = (class229.anObjectArray2504);
												aClass688_10992.method8031(class528_sub30, (byte) 9);
												break while_63_;
											}
										}
									}
								}
								class229.anInt2551 = -2102837999 * anInt11021;
							}
							if (class229.anObjectArray2496 != null
									&& (anInt10942 * 1039196235 > class229.anInt2547 * 326993345)) {
								if (null == class229.anIntArray2497
										|| ((1039196235 * anInt10942 - 326993345 * class229.anInt2547) > 64)) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anObjectArray10460 = class229.anObjectArray2496;
									aClass688_10992.method8031(class528_sub30, (byte) -15);
								} else {
									while_64_: for (int i_66_ = class229.anInt2547 * 326993345; i_66_ < anInt10942
											* 1039196235; i_66_++) {
										int i_67_ = anIntArray11087[i_66_ & 0x3f];
										for (int i_68_ = 0; i_68_ < (class229.anIntArray2497).length; i_68_++) {
											if (class229.anIntArray2497[i_68_] == i_67_) {
												Class528_Sub30 class528_sub30 = new Class528_Sub30();
												class528_sub30.aClass229_10461 = class229;
												class528_sub30.anObjectArray10460 = (class229.anObjectArray2496);
												aClass688_10992.method8031(class528_sub30, (byte) 39);
												break while_64_;
											}
										}
									}
								}
								class229.anInt2547 = 2069782795 * anInt10942;
							}
							if (class229.anObjectArray2546 != null
									&& (1221114533 * anInt11040 > class229.anInt2548 * -1434099999)) {
								if (null == class229.anIntArray2463
										|| ((anInt11040 * 1221114533 - class229.anInt2548 * -1434099999) > 64)) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anObjectArray10460 = class229.anObjectArray2546;
									aClass688_10992.method8031(class528_sub30, (byte) -54);
								} else {
									while_65_: for (int i_69_ = (-1434099999 * class229.anInt2548); i_69_ < 1221114533
											* anInt11040; i_69_++) {
										int i_70_ = anIntArray11089[i_69_ & 0x3f];
										for (int i_71_ = 0; i_71_ < (class229.anIntArray2463).length; i_71_++) {
											if (class229.anIntArray2463[i_71_] == i_70_) {
												Class528_Sub30 class528_sub30 = new Class528_Sub30();
												class528_sub30.aClass229_10461 = class229;
												class528_sub30.anObjectArray10460 = (class229.anObjectArray2546);
												aClass688_10992.method8031(class528_sub30, (byte) 17);
												break while_65_;
											}
										}
									}
								}
								class229.anInt2548 = 727918661 * anInt11040;
							}
							if (null != class229.anObjectArray2352
									&& (anInt11092 * -1511064793 > class229.anInt2389 * 1217776581)) {
								if (class229.anIntArray2549 == null
										|| ((-1511064793 * anInt11092 - class229.anInt2389 * 1217776581) > 64)) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anObjectArray10460 = class229.anObjectArray2352;
									aClass688_10992.method8031(class528_sub30, (byte) -36);
								} else {
									while_66_: for (int i_72_ = class229.anInt2389 * 1217776581; i_72_ < -1511064793
											* anInt11092; i_72_++) {
										int i_73_ = anIntArray11091[i_72_ & 0x3f];
										for (int i_74_ = 0; i_74_ < (class229.anIntArray2549).length; i_74_++) {
											if (i_73_ == (class229.anIntArray2549[i_74_])) {
												Class528_Sub30 class528_sub30 = new Class528_Sub30();
												class528_sub30.aClass229_10461 = class229;
												class528_sub30.anObjectArray10460 = (class229.anObjectArray2352);
												aClass688_10992.method8031(class528_sub30, (byte) -3);
												break while_66_;
											}
										}
									}
								}
								class229.anInt2389 = anInt11092 * 274562555;
							}
							if (class229.anObjectArray2383 != null
									&& (951632291 * anInt10996 > class229.anInt2434 * 903341833)) {
								if (null == class229.anIntArray2478
										|| ((anInt10996 * 951632291 - class229.anInt2434 * 903341833) > 64)) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anObjectArray10460 = class229.anObjectArray2383;
									aClass688_10992.method8031(class528_sub30, (byte) -60);
								} else {
									while_67_: for (int i_75_ = 903341833 * class229.anInt2434; i_75_ < anInt10996
											* 951632291; i_75_++) {
										int i_76_ = anIntArray10908[i_75_ & 0x3f];
										for (int i_77_ = 0; i_77_ < (class229.anIntArray2478).length; i_77_++) {
											if (class229.anIntArray2478[i_77_] == i_76_) {
												Class528_Sub30 class528_sub30 = new Class528_Sub30();
												class528_sub30.aClass229_10461 = class229;
												class528_sub30.anObjectArray10460 = (class229.anObjectArray2383);
												aClass688_10992.method8031(class528_sub30, (byte) 29);
												break while_67_;
											}
										}
									}
								}
								class229.anInt2434 = anInt10996 * 500826699;
							}
							if ((144238161 * anInt11099 > -1642392569 * class229.anInt2509)
									&& class229.anObjectArray2512 != null) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2512;
								aClass688_10992.method8031(class528_sub30, (byte) 22);
							}
							if ((anInt11166 * 597413953 > class229.anInt2509 * -1642392569)
									&& null != class229.anObjectArray2514) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2514;
								aClass688_10992.method8031(class528_sub30, (byte) -33);
							}
							if ((1311186751 * anInt11101 > -1642392569 * class229.anInt2509)
									&& class229.anObjectArray2515 != null) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2515;
								aClass688_10992.method8031(class528_sub30, (byte) 60);
							}
							if ((54459253 * anInt11102 > class229.anInt2509 * -1642392569)
									&& null != class229.anObjectArray2516) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2516;
								aClass688_10992.method8031(class528_sub30, (byte) -21);
							}
							if ((-149494945 * anInt11103 > class229.anInt2509 * -1642392569)
									&& null != class229.anObjectArray2398) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2398;
								aClass688_10992.method8031(class528_sub30, (byte) -56);
							}
							if ((966386851 * anInt10854 > -1642392569 * class229.anInt2509)
									&& null != class229.anObjectArray2519) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2519;
								aClass688_10992.method8031(class528_sub30, (byte) -33);
							}
							if ((299292217 * anInt11105 > class229.anInt2509 * -1642392569)
									&& class229.anObjectArray2518 != null) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2518;
								aClass688_10992.method8031(class528_sub30, (byte) -19);
							}
							if ((anInt11106 * -189186443 > -1642392569 * class229.anInt2509)
									&& null != class229.anObjectArray2524) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2524;
								aClass688_10992.method8031(class528_sub30, (byte) -23);
							}
							if ((1094784629 * anInt11107 > -1642392569 * class229.anInt2509)
									&& class229.anObjectArray2456 != null) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2456;
								aClass688_10992.method8031(class528_sub30, (byte) 87);
							}
							if ((anInt11145 * 403626033 > -1642392569 * class229.anInt2509)
									&& class229.anObjectArray2521 != null) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2521;
								aClass688_10992.method8031(class528_sub30, (byte) -72);
							}
							class229.anInt2509 = 1530560687 * anInt11018;
							if (null != class229.anObjectArray2425) {
								for (int i_78_ = 0; i_78_ < anInt10995 * -1384174071; i_78_++) {
									Class528_Sub30 class528_sub30 = new Class528_Sub30();
									class528_sub30.aClass229_10461 = class229;
									class528_sub30.anInt10467 = (anInterface61Array11123[i_78_].method384(1712602044)
											* -569553313);
									class528_sub30.anInt10465 = (anInterface61Array11123[i_78_].method399((byte) -86)
											* -1605161741);
									class528_sub30.anObjectArray10460 = class229.anObjectArray2425;
									aClass688_10992.method8031(class528_sub30, (byte) -6);
								}
							}
							if (aBool10994 && null != class229.anObjectArray2385) {
								Class528_Sub30 class528_sub30 = new Class528_Sub30();
								class528_sub30.aClass229_10461 = class229;
								class528_sub30.anObjectArray10460 = class229.anObjectArray2385;
								aClass688_10992.method8031(class528_sub30, (byte) 55);
							}
						}
						if (5 == class229.anInt2378 * -319431967 && -1 != class229.anInt2533 * -182549293)
							class229.method3195(Class317_Sub1.aClass5_Sub1_9957, Class243.aClass5_Sub2_2730, (byte) 37)
									.method6078(Class587.aClass173_7714, class229.anInt2458 * 1661025435,
											Class514.aClass528_Sub38_6967.aClass691_Sub22_10588.method9998(604045520),
											979388530);
						Class195.method2826(class229, 1164901328);
						if (-319431967 * class229.anInt2378 == 0) {
							method10192(class226, class229s, 306930455 * class229.anInt2376, i_17_, i_18_, i_19_, i_20_,
									(i_15_ - class229.anInt2400 * -1014124179),
									(i_16_ - class229.anInt2401 * 1665217863), i_12_, i_13_);
							if (class229.aClass229Array2390 != null)
								method10192(class226, class229.aClass229Array2390, class229.anInt2376 * 306930455,
										i_17_, i_18_, i_19_, i_20_, i_15_ - (-1014124179 * class229.anInt2400),
										i_16_ - (1665217863 * class229.anInt2401), i_12_, i_13_);
							Class528_Sub39 class528_sub39 = (Class528_Sub39) (aClass692_11097
									.method8137(class229.anInt2376 * 306930455));
							if (null != class528_sub39)
								ModeWhere.method7896(class528_sub39, 905908359 * class528_sub39.anInt10625, i_17_,
										i_18_, i_19_, i_20_, i_15_ - -1014124179 * class229.anInt2400,
										i_16_ - class229.anInt2401 * 1665217863, i_12_, i_13_, 451553424);
						}
					}
				}
			}
		}
	}

	@Override
	final void method6192(int i) {
		if (null != Class423.aClass141_Sub1_4785 && Class423.aClass141_Sub1_4785.aBool8795)
			Class647.method7712((short) 728);
		Class382.method4727((byte) -111);
		Class163.method2081(-798672408);
		if (Class587.aClass173_7714 != null)
			Class587.aClass173_7714.method2156(-1372793801);
		if (Class700.aBool8733 && Class207.aFrame2236 != null) {
			Class452.method5449(Class181.aClass702_2093, Class207.aFrame2236, -897101797);
			Class207.aFrame2236 = null;
		}
		aClass109_10930.method1382(1274270834);
		aClass109_10930.aClass61_1395.method1014((byte) 84);
		aClass109_11162.method1382(-1231444249);
		aClass109_11162.aClass61_1395.method1014((byte) 53);
		if (null != Class365.aClass218_3848)
			Class365.aClass218_3848.method3093(-48094534);
		Class700.aClass454_8734.method5468(1962763505);
		Class624.aClass449_8128.method5416(661133061);
		Class557.aClass455_7466.method5504(1309392402);
		if (aClass631_10885 != null) {
			aClass631_10885.method7534(1978648237);
			aClass631_10885 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class109.method1404((byte) -22);
		try {
			Class24.method702(1651235821);
		} catch (Exception exception) {
			/* empty */
		}
		if (null != Class499.aClass40_6844)
			Class499.aClass40_6844.method812(-1001988854);
		if (aBool6952 && Class646.aClass665_8386 != ModeWhere.aClass665_8465)
			Class181_Sub11.method8963(694468067);
	}

	void method10193(int i, int i_79_) {
		Class511_Sub3.aSocket10267 = null;
		Class203.aClass551_2218 = null;
		anInt11135 = 0;
		Class700.aClass454_8734.anInt4992 += -1968474927;
		Class700.aClass454_8734.anInt4993 = i * -1124216087;
	}

	final void method10194(byte i) {
		if (anInt10876 * 175711435 == 12 && !Class181.method2686(-1712965615)
				|| (anInt10876 * 175711435 == 13 && -1852659257 * Class54.anInt669 == 42)
				|| (10 == anInt10876 * 175711435
						&& (49 == Class54.anInt668 * 693748093 || 52 == Class54.anInt668 * 693748093))
				|| 14 == 175711435 * anInt10876) {
			if (anInt10889 * -794452495 > 1) {
				anInt10889 -= 866235153;
				anInt11105 = anInt11018 * -325079279;
			}
			if (!Class28.aBool273)
				Class24.method698(95190825);
			if (10 != anInt10876 * 175711435
					|| (Class54.anInt668 * 693748093 != 49 && 52 != 693748093 * Class54.anInt668)) {
				for (int i_80_ = 0; (i_80_ < 100 && Class258.method3545(aClass109_11162, (byte) 99)); i_80_++) {
					/* empty */
				}
			}
		}
		IncomingPacket.method4813(-2060717458);
		Class467.method5646((byte) -56);
		anInt10971 += 1654155741;
		Class528_Sub24.method9443(-1, -1, (byte) 42);
		Class389.method4772(null, -1, -1, (byte) 10);
		Class286.method3858(-71696986);
		anInt11018 += 1008134521;
		for (int i_81_ = 0; i_81_ < anInt10921 * -693122579; i_81_++) {
			NPC class645_sub1_sub5_sub1_sub1 = ((NPC) aClass528_Sub31Array10920[i_81_].anObject10468);
			if (class645_sub1_sub5_sub1_sub1 != null) {
				byte i_82_ = class645_sub1_sub5_sub1_sub1.aClass299_12043.aByte3314;
				if ((i_82_ & 0x1) != 0) {
					int i_83_ = class645_sub1_sub5_sub1_sub1.method10671((byte) -128);
					if (0 != (i_82_ & 0x2) && (class645_sub1_sub5_sub1_sub1.quenedStepCount * 540774833 == 0)
							&& Math.random() * 1000.0 < 10.0) {
						int i_84_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						int i_85_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						if (i_84_ != 0 || i_85_ != 0) {
							int i_86_ = ((class645_sub1_sub5_sub1_sub1.sceneXQueue[0]) + i_84_);
							int i_87_ = ((class645_sub1_sub5_sub1_sub1.sceneYQueue[0]) + i_85_);
							if (i_86_ < 0) {
								boolean bool = false;
							} else if (i_86_ > (aClass495_10935.method6029((short) 26364) - i_83_ - 1))
								i_86_ = (aClass495_10935.method6029((short) 18182) - i_83_ - 1);
							if (i_87_ < 0) {
								boolean bool = false;
							} else if (i_87_ > (aClass495_10935.method5967(1460089065) - i_83_ - 1))
								i_87_ = (aClass495_10935.method5967(945101306) - i_83_ - 1);
						}
					}
					Class640.method7590(class645_sub1_sub5_sub1_sub1, true, (byte) 90);
					int i_88_ = Class666.method7906(class645_sub1_sub5_sub1_sub1, 702604059);
					Class598.method7131(class645_sub1_sub5_sub1_sub1, -357593992);
					Class190.method2786(class645_sub1_sub5_sub1_sub1, 173368941 * VarDomainType.anInt4931,
							Class547.anInt7412 * -1505041153, i_88_, -1249310094);
					Class181_Sub1.method8396(class645_sub1_sub5_sub1_sub1, VarDomainType.anInt4931 * 173368941, (byte) 8);
					Class424.method5117(class645_sub1_sub5_sub1_sub1, (byte) 63);
					Class430 class430 = Class430.method5188();
					class430.method5189(
							Class417.method4970(class645_sub1_sub5_sub1_sub1.aClass37_11809.method795(1464145320)),
							Class417.method4970(class645_sub1_sub5_sub1_sub1.aClass37_11811.method795(-346033871)),
							Class417.method4970(class645_sub1_sub5_sub1_sub1.aClass37_11777.method795(-446961911)));
					class645_sub1_sub5_sub1_sub1.method7687(class430);
					class430.method5194();
				}
			}
		}
		if ((175711435 * anInt10876 == 8 || 13 == 175711435 * anInt10876 || 12 == 175711435 * anInt10876
				|| 14 == 175711435 * anInt10876)
				&& (!Class181.method2686(-1712965615)
						|| (175711435 * anInt10876 == 13 && 42 == Class54.anInt669 * -1852659257)
						|| (10 == anInt10876 * 175711435
								&& (49 == Class54.anInt668 * 693748093 || 52 == 693748093 * Class54.anInt668)))
				&& !Class528_Sub36.method9535(1879108594)) {
			if (Class390.anInt4111 * -1860881523 == 3)
				Class405.method4875((byte) 50);
			else
				Class213.method2968(598559157);
			if (Class626.anInt8136 * -639218145 >> 9 < 14
					|| (-639218145 * Class626.anInt8136 >> 9 >= aClass495_10935.method6029((short) 27194) - 14)
					|| Class227.anInt2347 * -1246131271 >> 9 < 14
					|| (-1246131271 * Class227.anInt2347 >> 9 >= aClass495_10935.method5967(-385674311) - 14))
				aClass495_10935.method5990(new Class498((Class489.aClass489_5503), null), 1268833808);
		}
		for (;;) {
			Class528_Sub30 class528_sub30 = (Class528_Sub30) aClass688_11146.method8032(-1490570711);
			if (null == class528_sub30)
				break;
			Class229 class229 = class528_sub30.aClass229_10461;
			if (class229.anInt2377 * 1835803215 >= 0) {
				Class229 class229_89_ = Class623_Sub1.method9755((class229.anInt2522 * -1027873541), (byte) -25);
				if (class229_89_ == null || class229_89_.aClass229Array2542 == null
						|| (class229.anInt2377 * 1835803215 >= class229_89_.aClass229Array2542.length)
						|| (class229_89_.aClass229Array2542[1835803215 * class229.anInt2377]) != class229)
					continue;
			}
			Class555.method6741(class528_sub30, (short) -1798);
		}
		for (;;) {
			Class528_Sub30 class528_sub30 = (Class528_Sub30) aClass688_10958.method8032(-1490570711);
			if (class528_sub30 == null)
				break;
			Class229 class229 = class528_sub30.aClass229_10461;
			if (class229.anInt2377 * 1835803215 >= 0) {
				Class229 class229_90_ = Class623_Sub1.method9755((class229.anInt2522 * -1027873541), (byte) -57);
				if (class229_90_ == null || null == class229_90_.aClass229Array2542
						|| (class229.anInt2377 * 1835803215 >= class229_90_.aClass229Array2542.length)
						|| class229 != (class229_90_.aClass229Array2542[class229.anInt2377 * 1835803215]))
					continue;
			}
			Class555.method6741(class528_sub30, (short) 14891);
		}
		for (;;) {
			Class528_Sub30 class528_sub30 = (Class528_Sub30) aClass688_10992.method8032(-1490570711);
			if (null == class528_sub30)
				break;
			Class229 class229 = class528_sub30.aClass229_10461;
			if (1835803215 * class229.anInt2377 >= 0) {
				Class229 class229_91_ = Class623_Sub1.method9755((-1027873541 * class229.anInt2522), (byte) -76);
				if (null == class229_91_ || class229_91_.aClass229Array2542 == null
						|| (class229.anInt2377 * 1835803215 >= class229_91_.aClass229Array2542.length)
						|| class229 != (class229_91_.aClass229Array2542[1835803215 * class229.anInt2377]))
					continue;
			}
			Class555.method6741(class528_sub30, (short) -6359);
		}
		if (aClass229_11067 != null)
			Class377.method4707(-1403484328);
		if (anInt11127 % 15000 == 0)
			Class592.method7081((short) 23535);
		if (anInt10876 * 175711435 == 12 && !Class181.method2686(-1712965615)
				|| (13 == 175711435 * anInt10876 && 42 == Class54.anInt669 * -1852659257)
				|| (175711435 * anInt10876 == 10
						&& (Class54.anInt668 * 693748093 == 49 || 693748093 * Class54.anInt668 == 52))
				|| 14 == anInt10876 * 175711435)
			Class326.method4256(1718815976);
		Class481.method5859(-500257527);
		if (aBool10933 && 12 == 175711435 * anInt10876) {
			Class195.method2827(-1219987211);
			aBool10933 = false;
		}
		if (Class423.aClass141_Sub1_4785.aBool8795 && (1986110058572725775L
				* Class423.aClass141_Sub1_4785.aLong8791 < Class249.method3417(2096002763) - 60000L))
			Class647.method7712((short) 728);
		for (Class511_Sub5 class511_sub5 = (Class511_Sub5) aClass695_10903
				.method8177(-1826774082); null != class511_sub5; class511_sub5 = (Class511_Sub5) aClass695_10903
						.method8184(-1648589152)) {
			if (class511_sub5.anInt10302 * -1767134803 < Class249.method3417(2024466695) / 1000L - 5L) {
				if (class511_sub5.aShort10303 > 0)
					ModeWhere.method7898(5, 0, "", "", "",
							new StringBuilder().append(class511_sub5.aString10301)
									.append(Class39.aClass39_393.method807(Class378_Sub2.aClass668_10123, (byte) 102))
									.toString(),
							null, 699130335);
				if (0 == class511_sub5.aShort10303)
					ModeWhere.method7898(5, 0, "", "", "",
							new StringBuilder().append(class511_sub5.aString10301)
									.append(Class39.aClass39_467.method807(Class378_Sub2.aClass668_10123, (byte) 102))
									.toString(),
							null, 94680719);
				class511_sub5.method6259(1676831297);
			}
		}
		if (12 == anInt10876 * 175711435 && !Class181.method2686(-1712965615)
				|| (175711435 * anInt10876 == 13 && 42 == Class54.anInt669 * -1852659257)
				|| (anInt10876 * 175711435 == 10
						&& (49 == Class54.anInt668 * 693748093 || 52 == 693748093 * Class54.anInt668))
				|| 175711435 * anInt10876 == 14) {
			if (175711435 * anInt10876 != 13 && aClass109_11162.method1384((byte) 80) == null)
				Class416.method4969(false, 5126206);
			else if (null != aClass109_11162) {
				aClass109_11162.anInt1386 += 1455852407;
				if (aClass109_11162.anInt1386 * -918831545 > 50) {
					Class528_Sub34 class528_sub34 = Class656.method7845(OutgoingOpcode.aClass403_4570,
							aClass109_11162.aClass10_1379, -2134307833);
					aClass109_11162.method1380(class528_sub34, 1537517447);
				}
				try {
					aClass109_11162.method1379(-1354038853);
				} catch (IOException ioexception) {
					if (anInt10876 * 175711435 == 13)
						aClass109_11162.method1382(-1082768150);
					else
						Class416.method4969(false, 5126206);
				}
			}
		}
	}

	static final void method10195() {
		int i = GPI.localPlayerCount * 1087758653;
		int[] is = GPI.localPlayerIndicies;
		int i_92_ = Class514.aClass528_Sub38_6967.aClass691_Sub14_10570.method9932((byte) -1);
		boolean bool = i_92_ == 1 && i > 200 || i_92_ == 0 && i > 50;
		for (int i_93_ = 0; i_93_ < i; i_93_++) {
			Player class645_sub1_sub5_sub1_sub2 = localPlayers[is[i_93_]];
			if (!class645_sub1_sub5_sub1_sub2.method10924((byte) 8))
				class645_sub1_sub5_sub1_sub2.anInt11767 = -322053849;
			else if (class645_sub1_sub5_sub1_sub2.hidden)
				class645_sub1_sub5_sub1_sub2.anInt11767 = -322053849;
			else {
				class645_sub1_sub5_sub1_sub2.method10656(1333563675);
				if (class645_sub1_sub5_sub1_sub2.aShort11747 < 0 || class645_sub1_sub5_sub1_sub2.aShort11745 < 0
						|| (class645_sub1_sub5_sub1_sub2.aShort11743 >= aClass495_10935.method6029((short) 3582))
						|| (class645_sub1_sub5_sub1_sub2.aShort11746 >= aClass495_10935.method5967(328556103)))
					class645_sub1_sub5_sub1_sub2.anInt11767 = -322053849;
				else {
					class645_sub1_sub5_sub1_sub2.aBool12049 = (class645_sub1_sub5_sub1_sub2.aClass690_Sub3_11803.aBool10798)
							? bool : false;
					if (Class108.myPlayer == class645_sub1_sub5_sub1_sub2)
						class645_sub1_sub5_sub1_sub2.anInt11767 = 1825429799;
					else {
						int i_94_ = 0;
						if (!class645_sub1_sub5_sub1_sub2.aBool11763)
							i_94_++;
						if (!class645_sub1_sub5_sub1_sub2.aClass695_11779.method8178((byte) 1))
							i_94_ += 2;
						i_94_ += 5 - class645_sub1_sub5_sub1_sub2.method10671((byte) -93) << 2;
						if ((Class213.aClass213_2250 != class645_sub1_sub5_sub1_sub2.aClass213_12066)
								|| class645_sub1_sub5_sub1_sub2.inClan)
							i_94_ += 512;
						else {
							if (-594883223 * anInt11001 == 0)
								i_94_ += 32;
							else
								i_94_ += 128;
							i_94_ += 256;
						}
						if (class645_sub1_sub5_sub1_sub2.method10687(1600226731) == anInt10872 * 712301817)
							i_94_ += 2047;
						class645_sub1_sub5_sub1_sub2.anInt11767 = (i_94_ + 1) * 322053849;
					}
				}
			}
		}
		for (int i_95_ = 0; i_95_ < -2065344127 * anInt10922; i_95_++) {
			NPC class645_sub1_sub5_sub1_sub1 = ((NPC) (((Class528_Sub31) aClass692_11110
					.method8137(anIntArray10923[i_95_])).anObject10468));
			if (!class645_sub1_sub5_sub1_sub1.method10903(-408750586) || !(class645_sub1_sub5_sub1_sub1.aClass299_12043
					.method4001(Class570.playerVarsProvider, Class570.playerVarsProvider, -291479268)))
				class645_sub1_sub5_sub1_sub1.anInt11767 = -322053849;
			else {
				class645_sub1_sub5_sub1_sub1.method10656(122987492);
				if (class645_sub1_sub5_sub1_sub1.aShort11747 < 0 || class645_sub1_sub5_sub1_sub1.aShort11745 < 0
						|| (class645_sub1_sub5_sub1_sub1.aShort11743 >= aClass495_10935.method6029((short) 20997))
						|| (class645_sub1_sub5_sub1_sub1.aShort11746 >= aClass495_10935.method5967(1264882846)))
					class645_sub1_sub5_sub1_sub1.anInt11767 = -322053849;
				else {
					int i_96_ = 0;
					if (!class645_sub1_sub5_sub1_sub1.aBool11763)
						i_96_++;
					if (!class645_sub1_sub5_sub1_sub1.aClass695_11779.method8178((byte) 1))
						i_96_ += 2;
					if (class645_sub1_sub5_sub1_sub1.method10671((byte) -28) < 5)
						i_96_ += 5 - class645_sub1_sub5_sub1_sub1.method10671((byte) -3) << 2;
					if (anInt11001 * -594883223 == 0) {
						if (class645_sub1_sub5_sub1_sub1.aClass299_12043.aBool3279)
							i_96_ += 64;
						else
							i_96_ += 128;
					} else if (1 == -594883223 * anInt11001) {
						if (class645_sub1_sub5_sub1_sub1.aClass299_12043.aBool3279)
							i_96_ += 32;
						else
							i_96_ += 64;
					}
					if (class645_sub1_sub5_sub1_sub1.aClass299_12043.aBool3290)
						i_96_ += 1024;
					else if (!class645_sub1_sub5_sub1_sub1.aClass299_12043.aBool3294)
						i_96_ += 256;
					if (class645_sub1_sub5_sub1_sub1.method10687(1600226731) == 712301817 * anInt10872)
						i_96_ += 2047;
					class645_sub1_sub5_sub1_sub1.anInt11767 = (i_96_ + 1) * 322053849;
				}
			}
		}
		for (int i_97_ = 0; i_97_ < aClass96Array11016.length; i_97_++) {
			Class96 class96 = aClass96Array11016[i_97_];
			if (null != class96) {
				if (1 == -411936407 * class96.anInt1224) {
					Class528_Sub31 class528_sub31 = ((Class528_Sub31) aClass692_11110
							.method8137(class96.anInt1216 * -1637531687));
					if (null != class528_sub31) {
						NPC class645_sub1_sub5_sub1_sub1 = ((NPC) class528_sub31.anObject10468);
						if ((class645_sub1_sub5_sub1_sub1.anInt11767 * -659687063) >= 0)
							class645_sub1_sub5_sub1_sub1.anInt11767 += -1858680832;
					}
				} else if (-411936407 * class96.anInt1224 == 10) {
					Player class645_sub1_sub5_sub1_sub2 = (localPlayers[-1637531687
							* class96.anInt1216]);
					if (class645_sub1_sub5_sub1_sub2 != null && (class645_sub1_sub5_sub1_sub2 != Class108.myPlayer)
							&& (-659687063 * class645_sub1_sub5_sub1_sub2.anInt11767) >= 0)
						class645_sub1_sub5_sub1_sub2.anInt11767 += -1858680832;
				}
			}
		}
	}

	static final void method10196() {
		int[][] is = aClass495_10935.method6048(-1502302909);
		int i = aClass495_10935.method6029((short) 15315);
		int i_98_ = aClass495_10935.method5967(-257120221);
		for (int i_99_ = 0; i_99_ < i; i_99_++) {
			int[] is_100_ = is[i_99_];
			for (int i_101_ = 0; i_101_ < i_98_; i_101_++)
				is_100_[i_101_] = 0;
		}
	}

	static final void method10197(int i) {
		int i_102_ = GPI.localPlayerCount * 1087758653;
		int[] is = GPI.localPlayerIndicies;
		int[][] is_103_ = aClass495_10935.method6048(-2132045403);
		int[][] is_104_ = aClass495_10935.method6045(1504237287);
		int i_105_;
		if (345087519 * anInt10943 == 0)
			i_105_ = Class185.aClass182Array2106.length;
		else
			i_105_ = aBool10893 ? i_102_ : -2065344127 * anInt10922 + i_102_;
		for (int i_106_ = 0; i_106_ < i_105_; i_106_++) {
			Entity class645_sub1_sub5_sub1;
			if (anInt10943 * 345087519 == 0) {
				Class182 class182 = Class185.aClass182Array2106[i_106_];
				if (!class182.aBool2097)
					continue;
				class645_sub1_sub5_sub1 = class182.method2689(-1012043543);
			} else {
				if (i_106_ < i_102_)
					class645_sub1_sub5_sub1 = localPlayers[is[i_106_]];
				else
					class645_sub1_sub5_sub1 = ((Entity) (((Class528_Sub31) aClass692_11110
							.method8137(anIntArray10923[(i_106_ - i_102_)])).anObject10468));
				if (i != class645_sub1_sub5_sub1.aByte10675)
					continue;
				if (class645_sub1_sub5_sub1.anInt11767 * -659687063 < 0) {
					class645_sub1_sub5_sub1.aBool11763 = false;
					continue;
				}
			}
			class645_sub1_sub5_sub1.anInt11817 = 0;
			int i_107_ = class645_sub1_sub5_sub1.method10671((byte) -69);
			Class422 class422 = class645_sub1_sub5_sub1.method7693().aClass422_4868;
			if ((i_107_ & 0x1) == 0) {
				if (((int) class422.aFloat4780 & 0x1ff) != 0 || 0 != ((int) class422.aFloat4777 & 0x1ff)) {
					class645_sub1_sub5_sub1.aBool11763 = false;
					continue;
				}
			} else if (256 != ((int) class422.aFloat4780 & 0x1ff) || ((int) class422.aFloat4777 & 0x1ff) != 256) {
				class645_sub1_sub5_sub1.aBool11763 = false;
				continue;
			}
			if (0 != anInt10943 * 345087519 && !class645_sub1_sub5_sub1.aBool11764) {
				if (i_107_ == 1) {
					int i_108_ = (int) class422.aFloat4780 >> 9;
					int i_109_ = (int) class422.aFloat4777 >> 9;
					if (is_103_[i_108_][i_109_] != -659687063 * class645_sub1_sub5_sub1.anInt11767) {
						class645_sub1_sub5_sub1.aBool11763 = true;
						continue;
					}
					if (is_104_[i_108_][i_109_] > 1) {
						is_104_[i_108_][i_109_]--;
						class645_sub1_sub5_sub1.aBool11763 = true;
						continue;
					}
				} else {
					int i_110_ = 256 * (i_107_ - 1) + 252;
					int i_111_ = (int) class422.aFloat4780 - i_110_ >> 9;
					int i_112_ = (int) class422.aFloat4777 - i_110_ >> 9;
					int i_113_ = i_110_ + (int) class422.aFloat4780 >> 9;
					int i_114_ = i_110_ + (int) class422.aFloat4777 >> 9;
					if (!Class626.method7459(is_103_, is_104_, (-659687063 * (class645_sub1_sub5_sub1.anInt11767)),
							i_111_, i_112_, i_113_, i_114_, -1486179207)) {
						for (int i_115_ = i_111_; i_115_ <= i_113_; i_115_++) {
							for (int i_116_ = i_112_; i_116_ <= i_114_; i_116_++) {
								if ((-659687063 * class645_sub1_sub5_sub1.anInt11767) == is_103_[i_115_][i_116_])
									is_104_[i_115_][i_116_]--;
							}
						}
						class645_sub1_sub5_sub1.aBool11763 = true;
						continue;
					}
				}
			}
			class645_sub1_sub5_sub1.aBool11763 = false;
			if ((class645_sub1_sub5_sub1.anInt11792 * -1833893027 <= anInt11127
					&& (class645_sub1_sub5_sub1.anInt11793 * -1416183947 < anInt11127))
					|| (class645_sub1_sub5_sub1.anInt11791 * -1080767853 == class645_sub1_sub5_sub1.anInt11790
							* 991304933))
				class645_sub1_sub5_sub1.method7682(
						class422.aFloat4780, (Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
								(int) class422.aFloat4777, class645_sub1_sub5_sub1.aByte10675, -759833206)),
						class422.aFloat4777);
			aClass495_10935.method5973((byte) 14).method6545(class645_sub1_sub5_sub1, true, 2067728633);
		}
	}

	static final void method10198() {
		anInt10999 = 0;
		for (int i = 0; i < -2065344127 * anInt10922; i++) {
			NPC class645_sub1_sub5_sub1_sub1 = ((NPC) (((Class528_Sub31) aClass692_11110
					.method8137(anIntArray10923[i])).anObject10468));
			if (class645_sub1_sub5_sub1_sub1.aBool11763
					&& (class645_sub1_sub5_sub1_sub1.method10703(-1408060508) != -1)) {
				int i_117_ = ((class645_sub1_sub5_sub1_sub1.method10671((byte) -19) - 1) * 256 + 252);
				Class422 class422 = class645_sub1_sub5_sub1_sub1.method7693().aClass422_4868;
				int i_118_ = (int) class422.aFloat4780 - i_117_ >> 9;
				int i_119_ = (int) class422.aFloat4777 - i_117_ >> 9;
				Entity class645_sub1_sub5_sub1 = Class603.method7186((class645_sub1_sub5_sub1_sub1.aByte10675), i_118_,
						i_119_, 1584783695);
				if (null != class645_sub1_sub5_sub1) {
					int i_120_ = class645_sub1_sub5_sub1.anInt11783 * -34811601;
					if (class645_sub1_sub5_sub1 instanceof NPC)
						i_120_ += 2048;
					if (0 == -1300481619 * class645_sub1_sub5_sub1.anInt11817
							&& (class645_sub1_sub5_sub1.method10703(-1933764248) != -1)) {
						anIntArray10997[anInt10999 * 1154356499] = i_120_;
						anIntArray10950[anInt10999 * 1154356499] = i_120_;
						anInt10999 += -1127154405;
						class645_sub1_sub5_sub1.anInt11817 += 1789104677;
					}
					anIntArray10997[anInt10999 * 1154356499] = i_120_;
					anIntArray10950[1154356499 * anInt10999] = (class645_sub1_sub5_sub1_sub1.anInt11783 * -34811601
							+ 2048);
					anInt10999 += -1127154405;
					class645_sub1_sub5_sub1.anInt11817 += 1789104677;
				}
			}
		}
		Class464.method5610(anIntArray10950, anIntArray10997, 0, anInt10999 * 1154356499 - 1, 569529839);
	}

	static final void method10199() {
		int i = 1087758653 * GPI.localPlayerCount;
		int[] is = GPI.localPlayerIndicies;
		int i_121_;
		if (0 == 345087519 * anInt10943)
			i_121_ = Class185.aClass182Array2106.length;
		else
			i_121_ = aBool10893 ? i : i + -2065344127 * anInt10922;
		for (int i_122_ = 0; i_122_ < i_121_; i_122_++) {
			Entity class645_sub1_sub5_sub1;
			if (anInt10943 * 345087519 == 0) {
				Class182 class182 = Class185.aClass182Array2106[i_122_];
				if (!class182.aBool2097)
					continue;
				class645_sub1_sub5_sub1 = class182.method2689(-1012043543);
			} else {
				if (i_122_ < i)
					class645_sub1_sub5_sub1 = localPlayers[is[i_122_]];
				else
					class645_sub1_sub5_sub1 = ((Entity) (((Class528_Sub31) aClass692_11110
							.method8137(anIntArray10923[i_122_ - i])).anObject10468));
				if (-659687063 * class645_sub1_sub5_sub1.anInt11767 < 0)
					continue;
			}
			int i_123_ = class645_sub1_sub5_sub1.method10671((byte) -111);
			Class422 class422 = class645_sub1_sub5_sub1.method7693().aClass422_4868;
			if (0 == (i_123_ & 0x1)) {
				if (((int) class422.aFloat4780 & 0x1ff) == 0 && 0 == ((int) class422.aFloat4777 & 0x1ff))
					continue;
			} else if (((int) class422.aFloat4780 & 0x1ff) == 256 && ((int) class422.aFloat4777 & 0x1ff) == 256)
				continue;
			if ((-1833893027 * class645_sub1_sub5_sub1.anInt11792 <= anInt11127
					&& (class645_sub1_sub5_sub1.anInt11793 * -1416183947 < anInt11127))
					|| (class645_sub1_sub5_sub1.anInt11790 * 991304933 == class645_sub1_sub5_sub1.anInt11791
							* -1080767853))
				class645_sub1_sub5_sub1.method7682(
						class422.aFloat4780, (Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
								(int) class422.aFloat4777, class645_sub1_sub5_sub1.aByte10675, -759833206)),
						class422.aFloat4777);
			aClass495_10935.method5973((byte) 57).method6545(class645_sub1_sub5_sub1, true, 1813154716);
		}
	}

	static final void method10200() {
		int i = 256 + -2136693248 * Class231.anInt2575;
		int i_124_ = 256 + -725560832 * Class72.anInt778;
		int i_125_ = (Class335_Sub1_Sub1.method10374(i, i_124_, (1926870089 * Class181_Sub5.anInt9778), -759833206)
				- Class326_Sub2.anInt10045 * -301505943);
		if (VarDomainType.anInt4932 * -874739631 >= 100) {
			Class626.anInt8136 = Class231.anInt2575 * 697997824 + -1985093888;
			Class227.anInt2347 = -2124127744 * Class72.anInt778 + -1224046336;
			Class137.anInt1630 = ((Class335_Sub1_Sub1.method10374(Class626.anInt8136 * -639218145,
					-1246131271 * Class227.anInt2347, Class181_Sub5.anInt9778 * 1926870089, -759833206))
					- -301505943 * Class326_Sub2.anInt10045) * 1124026061;
		} else {
			if (-639218145 * Class626.anInt8136 < i) {
				Class626.anInt8136 += 1636412895 * (Class316_Sub1.anInt9900 * 1564478433
						+ ((i - -639218145 * Class626.anInt8136) * (-874739631 * VarDomainType.anInt4932) / 1000));
				if (Class626.anInt8136 * -639218145 > i)
					Class626.anInt8136 = 1636412895 * i;
			}
			if (-639218145 * Class626.anInt8136 > i) {
				Class626.anInt8136 -= ((1564478433 * Class316_Sub1.anInt9900
						+ (-874739631 * VarDomainType.anInt4932 * (Class626.anInt8136 * -639218145 - i) / 1000))
						* 1636412895);
				if (Class626.anInt8136 * -639218145 < i)
					Class626.anInt8136 = i * 1636412895;
			}
			if (Class137.anInt1630 * 950408709 < i_125_) {
				Class137.anInt1630 += (((i_125_ - 950408709 * Class137.anInt1630) * (VarDomainType.anInt4932 * -874739631)
						/ 1000) + Class316_Sub1.anInt9900 * 1564478433) * 1124026061;
				if (950408709 * Class137.anInt1630 > i_125_)
					Class137.anInt1630 = i_125_ * 1124026061;
			}
			if (Class137.anInt1630 * 950408709 > i_125_) {
				Class137.anInt1630 -= 1124026061 * (1564478433 * Class316_Sub1.anInt9900
						+ (VarDomainType.anInt4932 * -874739631 * (Class137.anInt1630 * 950408709 - i_125_) / 1000));
				if (Class137.anInt1630 * 950408709 < i_125_)
					Class137.anInt1630 = 1124026061 * i_125_;
			}
			if (Class227.anInt2347 * -1246131271 < i_124_) {
				Class227.anInt2347 += (397871753
						* (((i_124_ - -1246131271 * Class227.anInt2347) * (-874739631 * VarDomainType.anInt4932) / 1000)
								+ 1564478433 * Class316_Sub1.anInt9900));
				if (Class227.anInt2347 * -1246131271 > i_124_)
					Class227.anInt2347 = 397871753 * i_124_;
			}
			if (Class227.anInt2347 * -1246131271 > i_124_) {
				Class227.anInt2347 -= ((Class316_Sub1.anInt9900 * 1564478433
						+ ((-1246131271 * Class227.anInt2347 - i_124_) * (-874739631 * VarDomainType.anInt4932) / 1000))
						* 397871753);
				if (Class227.anInt2347 * -1246131271 < i_124_)
					Class227.anInt2347 = 397871753 * i_124_;
			}
		}
		i = Class655.anInt8433 * -535394816 + 256;
		i_124_ = Class578.anInt7609 * -1678436864 + 256;
		i_125_ = (Class335_Sub1_Sub1.method10374(i, i_124_, (Class181_Sub5.anInt9778 * 1926870089), -759833206)
				- -1739906383 * Class249.anInt2780);
		int i_126_ = i - Class626.anInt8136 * -639218145;
		int i_127_ = i_125_ - 950408709 * Class137.anInt1630;
		int i_128_ = i_124_ - -1246131271 * Class227.anInt2347;
		int i_129_ = (int) Math.sqrt(i_126_ * i_126_ + i_128_ * i_128_);
		int i_130_ = ((int) (Math.atan2(i_127_, i_129_) * 2607.5945876176133) & 0x3fff);
		int i_131_ = ((int) (Math.atan2(i_126_, i_128_) * -2607.5945876176133) & 0x3fff);
		if (i_130_ < 1024)
			i_130_ = 1024;
		if (i_130_ > 3072)
			i_130_ = 3072;
		if (Class309_Sub1.anInt9907 * -499166573 < i_130_) {
			Class309_Sub1.anInt9907 += (2028903323 * ((((i_130_ - -499166573 * Class309_Sub1.anInt9907 >> 3)
					* (Class480.anInt5455 * -1329360119) / 1000) + Class215.anInt2272 * -362664325) << 3));
			if (-499166573 * Class309_Sub1.anInt9907 > i_130_)
				Class309_Sub1.anInt9907 = i_130_ * 2028903323;
		}
		if (-499166573 * Class309_Sub1.anInt9907 > i_130_) {
			Class309_Sub1.anInt9907 -= ((-362664325 * Class215.anInt2272 + (-1329360119 * Class480.anInt5455
					* (Class309_Sub1.anInt9907 * -499166573 - i_130_ >> 3) / 1000)) << 3) * 2028903323;
			if (-499166573 * Class309_Sub1.anInt9907 < i_130_)
				Class309_Sub1.anInt9907 = 2028903323 * i_130_;
		}
		int i_132_ = i_131_ - Class653.anInt8429 * 869770707;
		if (i_132_ > 8192)
			i_132_ -= 16384;
		if (i_132_ < -8192)
			i_132_ += 16384;
		i_132_ >>= 3;
		if (i_132_ > 0) {
			Class653.anInt8429 += ((i_132_ * (-1329360119 * Class480.anInt5455) / 1000
					+ Class215.anInt2272 * -362664325) << 3) * -1829176741;
			Class653.anInt8429 = (869770707 * Class653.anInt8429 & 0x3fff) * -1829176741;
		}
		if (i_132_ < 0) {
			Class653.anInt8429 -= ((-1329360119 * Class480.anInt5455 * -i_132_ / 1000
					+ -362664325 * Class215.anInt2272) << 3) * -1829176741;
			Class653.anInt8429 = (869770707 * Class653.anInt8429 & 0x3fff) * -1829176741;
		}
		int i_133_ = i_131_ - Class653.anInt8429 * 869770707;
		if (i_133_ > 8192)
			i_133_ -= 16384;
		if (i_133_ < -8192)
			i_133_ += 16384;
		if (i_133_ < 0 && i_132_ > 0 || i_133_ > 0 && i_132_ < 0)
			Class653.anInt8429 = i_131_ * -1829176741;
		Class48.anInt548 = 0;
	}

	public static Class528_Sub29 method10201(Class229 class229) {
		Class528_Sub29 class528_sub29 = ((Class528_Sub29) aClass692_11112
				.method8137(((long) (306930455 * class229.anInt2376) << 32) + class229.anInt2377 * 1835803215));
		return (class528_sub29 != null ? class528_sub29 : class229.aClass528_Sub29_2499);
	}

	static Class229 method10202(Class229 class229) {
		Class528_Sub29 class528_sub29 = method10201(class229);
		if (class528_sub29.method9478(2142936562))
			return Class137.aClass229_1632;
		int i = class528_sub29.method9475(-623938272);
		if (i == 0)
			return null;
		for (int i_134_ = 0; i_134_ < i; i_134_++) {
			class229 = Class242.method3379(Class405.method4876((306930455 * (class229.anInt2376)), 2136835799),
					class229, (byte) -48);
			if (class229 == null)
				return Class137.aClass229_1632;
		}
		return class229;
	}

	public static boolean method10203(Class229 class229) {
		if (aBool11062) {
			if (method10201(class229).anInt10455 * -450987711 != 0)
				return false;
			if (0 == -319431967 * class229.anInt2378)
				return false;
		}
		if (class229.anInt2474 * -1257480855 == Class229.anInt2379 * 416009815)
			return class229.aBool2488 || !aBool10887 && !aBool11057;
		return class229.aBool2488;
	}

	static {
		aBool10853 = false;
		aBool10993 = false;
		aString10962 = null;
		anInt10856 = 0;
		anInt10863 = 0;
		aBool10859 = false;
		anInt10860 = 0;
		anInt10861 = 0;
		anInt10862 = 0;
		anInt11104 = 0;
		aBool10864 = false;
		aBool11033 = false;
		aString10866 = null;
		aString10867 = null;
		aString10868 = null;
		aBool10869 = false;
		aBool10884 = false;
		aBool10871 = false;
		anInt10872 = 0;
		anInt10873 = 1659944355;
		aString11054 = null;
		aString11077 = null;
		anInt10876 = 20736449;
		aClass418_10877 = new Class418();
		aClass433_11080 = new Class433();
		aClass433_10879 = new Class433();
		aLong11068 = 0L;
		aBool10881 = false;
		aBool10882 = true;
		anInt10883 = 0;
		anInt11127 = 0;
		aBool11161 = true;
		aBool11150 = true;
		aBool10887 = false;
		aBool11057 = false;
		anInt10889 = 0;
		aClass96Array11016 = new Class96[9];
		aClass527Array11010 = new Class527[11];
		aBool10892 = false;
		aBool10893 = false;
		aBool10894 = true;
		aLong11168 = (long) (Math.random() * 9.999999999E9) * -7352669865016477421L;
		aBool10896 = false;
		anInt10897 = 0;
		anInt11023 = 0;
		aBool10956 = false;
		aClass688_10900 = new Class688();
		anInt10926 = 0;
		anInt10995 = 0;
		anInterface61Array11123 = new Interface61[128];
		anInt10906 = 0;
		anInterface61Array10907 = new Interface61[77];
		aColorArray10919 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650),
				new Color(3289650) };
		aColorArray10909 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277),
				new Color(16726277) };
		aColorArray10910 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381),
				new Color(16741381) };
		anInt11135 = 0;
		anInt10912 = 0;
		anInt10913 = 0;
		aClass186_10977 = new Class186(8);
		aClass186_10915 = new Class186(8);
		aString10916 = null;
		anInterface50_10917 = new Class42();
		anInterface24_10918 = new Class45();
		aClass692_11110 = new Class692(64);
		aClass528_Sub31Array10920 = new Class528_Sub31[1024];
		anInt10921 = 0;
		anInt10922 = 0;
		anIntArray10923 = new int[1024];
		anInt10924 = 0;
		anIntArray10925 = new int[254];
		anInt11032 = 0;
		anInt10927 = 0;
		anIntArray10928 = new int[1006];
		aClass109_11162 = new Class109();
		aClass109_10930 = new Class109();
		aClass109Array10931 = new Class109[] { aClass109_10930, aClass109_11162 };
		anInt10932 = 0;
		aBool10933 = false;
		aClass631_10885 = new Class631();
		aClass495_10935 = new Class495(false);
		aBool10936 = false;
		anObject10937 = new Object();
		anObject10938 = new Object();
		anIntArray10939 = new int[64];
		anInt11181 = 0;
		anIntArray10941 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		anInt10895 = -258800089;
		anInt10943 = 975796092;
		aBool10944 = false;
		anInt10945 = -2060166951;
		anInt11015 = 0;
		anInt10891 = 0;
		anInt10858 = 1382192057;
		anInt10949 = -670933471;
		anInt10904 = -1685053957;
		anInt10951 = 0;
		anInt10870 = 0;
		anInt10953 = 0;
		anIntArray10955 = new int[4096];
		anIntArray10865 = new int[4096];
		anIntArray10957 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
		anInt10960 = 0;
		anInt10959 = 921352054;
		anInt11117 = 0;
		anInt10901 = 1219160158;
		anInt10911 = 0;
		anInt11056 = 708266851;
		anInt10964 = 0;
		anInt10852 = 0;
		anInt10975 = 691128782;
		anInt11049 = 0;
		anInt10898 = 373498493;
		anInt11184 = 0;
		aRandom10970 = new Random();
		anInt10971 = 0;
		anInt10972 = 0;
		anInt10973 = 0;
		aFloat11002 = 1027.0F;
		aFloat11088 = 0.0F;
		aFloat10976 = 0.0F;
		aFloat11037 = 0.0F;
		aBool11187 = false;
		aBool10979 = false;
		anInt10980 = 350189163;
		anInt10981 = -76731528 + -496842747 * anInt10980;
		aBool10982 = true;
		anInt10983 = 0;
		anIntArrayArrayArray10986 = new int[2][][];
		anInt11065 = -681116073;
		anInt10988 = 159441195;
		anInt10989 = 0;
		anInt10990 = 0;
		anInt10991 = 0;
		anInt11188 = 0;
		anInt11134 = 0;
		aBool10994 = false;
		aBool10974 = false;
		anInt10968 = 0;
		anIntArray10997 = new int[507];
		anIntArray10950 = new int[507];
		anInt10999 = 0;
		aClass695_11000 = new Class695();
		anInt11001 = 0;
		aFloatArray10888 = new float[3];
		anInt11113 = 0;
		anInt10965 = 0;
		anInt11005 = 0;
		anInt11006 = 0;
		anInt11007 = 0;
		anInt11096 = -1337838097;
		anIntArray10880 = new int[2];
		anIntArray11013 = new int[2];
		anIntArray11014 = new int[2];
		anIntArray10967 = new int[2];
		anIntArray11012 = new int[2];
		aLong11017 = 0L;
		aBool10929 = true;
		anInt11019 = 1013236640;
		anInt11020 = 1283149488;
		anInt11124 = -1097225995;
		anInt11022 = 1150362193;
		localPlayers = new Player[2048];
		anInt11025 = 909315087;
		aMap11026 = new HashMap();
		aBool10914 = false;
		aBool10966 = false;
		playerRights = 0;
		anInt11030 = 0;
		aBool11141 = false;
		aBool10934 = false;
		aBool10946 = false;
		aClass629_11034 = Class629.aClass629_8188;
		aBool11035 = false;
		aShortArray11009 = new short[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		anIntArray11038 = new int[8];
		aStringArray11039 = new String[8];
		aBoolArray10875 = new boolean[8];
		anInt10963 = 1371852395;
		aClass692_11042 = new Class692(64);
		aClass688_11043 = new Class688();
		aClass692_11044 = new Class692(16);
		aClass695_11045 = new Class695();
		anInt11046 = 0;
		anInt11047 = 439912949;
		anInt11048 = -1210203257;
		anInt11036 = -702071043;
		anInt11050 = 1918947249;
		aBool10899 = false;
		anInt11052 = -2049904425;
		anInt11053 = -1433018553;
		aString10902 = null;
		aString11175 = null;
		anInt10978 = -345853007;
		aClass692_11097 = new Class692(8);
		anInt11058 = 0;
		aClass229_11059 = null;
		anInt11060 = 0;
		anInt11061 = 0;
		aBool11062 = false;
		aBool11063 = false;
		aClass229_11027 = null;
		aBool11084 = true;
		aBool11066 = false;
		aClass229_11067 = null;
		aClass229_10987 = null;
		anInt11069 = 0;
		anInt11070 = 0;
		aClass229_11071 = null;
		aBool11041 = false;
		anInt11073 = 592246737;
		anInt11074 = 901358103;
		anInt11075 = 970227585;
		anInt11076 = 1735712071;
		aBool10890 = false;
		anInt11078 = -1917575263;
		anInt11079 = 1559734921;
		aBool11055 = false;
		anInt11128 = 0;
		aBool11082 = false;
		aBool10947 = false;
		anInt11018 = 1008134521;
		anIntArray11087 = new int[64];
		anInt10942 = 0;
		anIntArray11089 = new int[64];
		anInt11040 = 0;
		anIntArray11091 = new int[64];
		anInt11092 = 0;
		anIntArray11093 = new int[64];
		anInt11094 = 0;
		anIntArray11095 = new int[64];
		anInt11021 = 0;
		anIntArray10908 = new int[64];
		anInt10996 = 0;
		anInt11099 = 0;
		anInt11166 = 0;
		anInt11101 = 0;
		anInt11102 = 0;
		anInt11103 = 0;
		anInt10854 = 0;
		anInt11105 = 0;
		anInt11106 = 0;
		anInt11107 = 0;
		anInt11145 = 0;
		aClass688_10992 = new Class688();
		aClass688_11146 = new Class688();
		aClass688_10958 = new Class688();
		aClass692_11112 = new Class692(512);
		anInt11114 = 0;
		anInt11115 = 254899430;
		aBoolArray10855 = new boolean[102];
		aBoolArray10952 = new boolean[102];
		aRectangleArray11090 = new Rectangle[102];
		for (int i = 0; i < 102; i++)
			aRectangleArray11090[i] = new Rectangle();
		anInt11119 = 0;
		anIntArray11120 = new int[4];
		anInt11121 = 0;
		anInt11122 = 417474868;
		anIntArray11003 = new int[anInt11122 * 1849994433];
		anIntArray11081 = new int[anInt11122 * 1849994433];
		anIntArray11125 = new int[1849994433 * anInt11122];
		aClass492Array11126 = new Class492[1849994433 * anInt11122];
		anIntArray11072 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		anInt10940 = 0;
		anInt10998 = 0;
		aLongArray11131 = new long[100];
		anInt11132 = 0;
		aString11133 = null;
		aString11172 = null;
		aClass487ArrayArray11004 = new Class487[3][8];
		anInt11136 = 0;
		aClass31_11137 = new Class31();
		aBoolArray11139 = new boolean[5];
		anIntArray11140 = new int[5];
		anIntArray11098 = new int[5];
		anIntArray11142 = new int[5];
		anIntArray11143 = new int[5];
		aShort11144 = (short) 256;
		aShort11085 = (short) 205;
		aShort11111 = (short) 256;
		aShort11147 = (short) 320;
		aShort11148 = (short) 1;
		aShort11149 = (short) 32767;
		aShort10969 = (short) 1;
		aShort11151 = (short) 32767;
		anInt11152 = 0;
		anInt11153 = 0;
		anInt11154 = 0;
		anInt11155 = 0;
		anInt11156 = 0;
		anInt11157 = 0;
		anInt11158 = 0;
		aClass62Array11160 = new Class62[400];
		aClass695_10903 = new Class695();
		anInt11024 = 0;
		aClass33Array11164 = new Class33[400];
		anInt11165 = 0;
		anInt11116 = 842511391;
		anInt11167 = -371552019;
		aBool10961 = false;
		aCalendar11169 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		anInterface62_11170 = new Class59();
		aLong11171 = -5031812507369259819L;
		aLong10874 = 51816913697784875L;
		aClass186_11173 = new Class186(8);
		aMap11051 = new HashMap();
		aClass217_11028 = new Class217();
		aBool11176 = false;
		anIntArray11193 = new int[4];
	}

	@Override
	final void method6188() {
		if (null != Class423.aClass141_Sub1_4785 && Class423.aClass141_Sub1_4785.aBool8795)
			Class647.method7712((short) 728);
		Class382.method4727((byte) -88);
		Class163.method2081(-798672408);
		if (Class587.aClass173_7714 != null)
			Class587.aClass173_7714.method2156(-1372793801);
		if (Class700.aBool8733 && Class207.aFrame2236 != null) {
			Class452.method5449(Class181.aClass702_2093, Class207.aFrame2236, 1692085689);
			Class207.aFrame2236 = null;
		}
		aClass109_10930.method1382(-938606009);
		aClass109_10930.aClass61_1395.method1014((byte) 64);
		aClass109_11162.method1382(-1717108759);
		aClass109_11162.aClass61_1395.method1014((byte) 120);
		if (null != Class365.aClass218_3848)
			Class365.aClass218_3848.method3093(-48094534);
		Class700.aClass454_8734.method5468(1962763505);
		Class624.aClass449_8128.method5416(1473187032);
		Class557.aClass455_7466.method5504(1727179384);
		if (aClass631_10885 != null) {
			aClass631_10885.method7534(1583938020);
			aClass631_10885 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class109.method1404((byte) 16);
		try {
			Class24.method702(1238278999);
		} catch (Exception exception) {
			/* empty */
		}
		if (null != Class499.aClass40_6844)
			Class499.aClass40_6844.method812(-411278966);
		if (aBool6952 && Class646.aClass665_8386 != ModeWhere.aClass665_8465)
			Class181_Sub11.method8963(1577231603);
	}

	@Override
	final void method6198() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class137.aClass229_1632 = new Class229();
		Class206.method2921(890942611);
		Class257.method3471(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 },
				new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, 176575450);
		Class422.method5099(100);
		Class430.method5200(10);
		Class311.method4141(100, -2042754538);
		Class380.method4719(100, -993497119);
		if (ModeWhere.LIVE != Class646.aClass665_8386)
			Class58.aByteArrayArray707 = new byte[50][];
		Class514.aClass528_Sub38_6967 = Class67.method1068(1507262063);
		if (Class514.aClass528_Sub38_6967.aClass691_Sub31_10602.method10076(-740804623) == 1)
			Class538.aBool7171 = false;
		switch (Class514.aClass528_Sub38_6967.aClass691_Sub33_10560.method10104(1754379600)) {
		case 4:
			Class97.aBool1238 = true;
			Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub33_10560), 0,
					-37997986);
			Class5_Sub1.method10057(Class50.aClass50_563, -419100396);
			break;
		default:
			break;
		case 3:
			Class97.aBool1237 = true;
			Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub33_10560), 0,
					594412954);
			Class5_Sub1.method10057(Class50.aClass50_567, -354809650);
		}
		if (null == Class12.aClass16_182.aString194)
			Class12.aClass16_182.aString194 = Class196.anApplet2198.getCodeBase().getHost();
		Class12.aClass16_176 = Class12.aClass16_182;
		Class557.aClass455_7466 = new Class455();
		Class700.aClass454_8734 = new Class454_Sub1();
		Class624.aClass449_8128 = new Class449(Class12.aClass16_175.aString194,
				-1255012695 * Class12.aClass16_175.anInt193, -352215983 * aClass673_11108.anInt8535);
		if (Class673.aClass673_8529 == aClass673_11108)
			aBool10894 = false;
		Class596.aShortArray7842 = Class299.aShortArray3324 = ItemType.aShortArray30 = new short[256];
		try {
			Class141_Sub1.aClipboard8801 = Class465.method5625(312287159).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class416.aClass544_4749 = Class542.method6627(Class64.aCanvas754, 832048346);
		Class95_Sub1_Sub2.aClass537_11200 = Class259.method3579(Class64.aCanvas754, true, 1978278282);
		if (aClass22_6948 != null)
			Class671.aClass539_8527 = new Class539(255, aClass22_6948, aClass22_6959, 2000000);
		Class495.aClass283_Sub1_5578 = new Class283_Sub1(aClass31_11137);
		try {
			Class495.aClass283_Sub1_5578.method3826(Class280.aClass280_3062, 58384044);
			Class495.aClass283_Sub1_5578.method3763(Class297.aClass297_3255, false, 1263917118);
			Class495.aClass283_Sub1_5578.method3831(Class294.aClass294_3226, false, -152090922);
			Class495.aClass283_Sub1_5578.method3763(Class297.aClass297_3255, false, -237149162);
			Class495.aClass283_Sub1_5578.method3771(Class422.method5051(99999.0F, 99999.0F, 99999.0F), -522372807);
			Class495.aClass283_Sub1_5578.method3768(
					Class422.method5051(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY),
					(byte) 15);
			Class495.aClass283_Sub1_5578.method3818(Class422.method5051(99999.0F, 99999.0F, 99999.0F), -32755371);
			Class495.aClass283_Sub1_5578.method3767(
					Class422.method5051(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY),
					2092966901);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
		Class555.method6746(Class196.anApplet2198, Class312.aString3440, 1406272237);
		if (ModeWhere.LIVE != Class646.aClass665_8386 && ModeWhere.aClass665_8470 != Class646.aClass665_8386)
			aBool10887 = true;
		aString6922 = Class39.aClass39_439.method807(Class378_Sub2.aClass668_10123, (byte) 102);
		Class590.aClass488_7736 = new Class488();
		new Thread(Class590.aClass488_7736).start();
		Class499.aClass40_6844 = new Class40();
		Class96.aClass259_1226 = new Class259();
	}

	@Override
	final void method6203() {
		if (3 != anInt10876 * 175711435) {
			if ((15 == 175711435 * anInt10876 || ScenePacketType.method4846(anInt10876 * 175711435, 353671148)
					|| Class309.method4127(175711435 * anInt10876, 2130436643)) && null != Class365.aClass218_3848)
				Class365.aClass218_3848.method3109(Class365.aClass218_3848.method3107(1788808518),
						Class514.aClass528_Sub38_6967.aClass691_Sub34_10584.method10132((byte) 7), (byte) -56);
			if (aBool10936) {
				synchronized (anObject10938) {
					anObject10938.notify();
				}
				synchronized (anObject10937) {
					try {
						anObject10937.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool10936 = false;
			}
			anInt11127++;
			if (anInt11127 % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				Class464.anInt5305 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10
						+ gregoriancalendar.get(13) / 6);
				aRandom10970.setSeed(Class464.anInt5305);
			}
			long l = Class249.method3417(1904686998);
			aClass109_10930.method1387(-1341642353);
			aClass109_11162.method1387(-1239513869);
			method10260(1925358741);
			if (null != Class244.aClass428_2737)
				Class244.aClass428_2737.method5152(-31932756);
			if (null != Class365.aClass218_3848)
				Class365.aClass218_3848.method3125(-362154873);
			Class416.aClass544_4749.method6643(-469870523);
			Class95_Sub1_Sub2.aClass537_11200.method6498(-2108133204);
			Class372.method4676(Class587.aClass173_7714, l);
			if (Class587.aClass173_7714 != null)
				Class587.aClass173_7714.method2158((int) l);
			anInt10995 = 0;
			anInt10906 = 0;
			for (Interface61 interface61 = Class416.aClass544_4749.method6645(
					1793269677); null != interface61; interface61 = Class416.aClass544_4749.method6645(1793269677)) {
				int i = interface61.method48(987687934);
				if (i == 2 || i == 3) {
					if (-1384174071 * anInt10995 < 128) {
						anInterface61Array11123[anInt10995 * -1384174071] = interface61;
						anInt10995 += 619233337;
					}
				} else if (i == 0) {
					if (Class26.method708((short) -19207) && interface61.method384(1763564086) == 28) {
						if (playerRights * 859247239 >= 2 && Class416.aClass544_4749.method6644(82, -117773044)) {
							if (Class677.method7955(-225278296))
								Class327.method4262(115096820);
							else
								Class308.method4118(Class108.myPlayer.method169(1736599052), 343930460);
						} else if (Class194.method2812(1439800124)
								&& (Class514.aClass528_Sub38_6967.aClass691_Sub26_10573.method10035(-1940099566) == 0
										|| Class416.aClass544_4749.method6644(86, -1957308686)))
							Class301.method4022((byte) 8);
						else if (Class514.aClass528_Sub38_6967.aClass691_Sub26_10573.method10035(-241005801) == 0
								|| Class416.aClass544_4749.method6644(86, -583767312))
							HandshakeOpcode.method4870((byte) 99);
						else
							Class173.method2555(
									(Class39.aClass39_343.method807((Class378_Sub2.aClass668_10123), (byte) 102)),
									-787565797);
					}
					if (anInt10906 * 691559213 < 77) {
						anInterface61Array10907[anInt10906 * 691559213] = interface61;
						anInt10906 += -1644712795;
					}
				}
			}
			anInt10926 = 0;
			for (Class528_Sub33 class528_sub33 = Class95_Sub1_Sub2.aClass537_11200
					.method6508(12358400); class528_sub33 != null; class528_sub33 = Class95_Sub1_Sub2.aClass537_11200
							.method6508(12358400)) {
				int i = class528_sub33.method9506((byte) -42);
				if (-1 == i)
					Class589.method7074(class528_sub33, 1521609046);
				else if (i == 6) {
					anInt10926 += class528_sub33.method9496(165433223) * 929267889;
					class528_sub33.method9510((byte) -18);
				} else if (Class321_Sub2.method9081(i, -708047839)) {
					aClass688_10900.method8031(class528_sub33, (byte) 17);
					if (aClass688_10900.method8039(-1223481295) > 10) {
						Class528_Sub33 class528_sub33_135_ = ((Class528_Sub33) aClass688_10900.method8032(-1490570711));
						if (class528_sub33_135_ != null)
							class528_sub33_135_.method9510((byte) -120);
					}
				}
			}
			if (Class194.method2812(1439800124))
				Class190.method2784(804273529);
			if (Class539.method6615(anInt10876 * 175711435, -2098920321)) {
				Class192.method2795(1278114172);
				Class450.method5430((byte) 31);
			} else if (Class667.method7910(175711435 * anInt10876, -111730852))
				aClass495_10935.method5980((byte) 8);
			if (ScenePacketType.method4846(anInt10876 * 175711435, 1403940791)
					&& !Class667.method7910(anInt10876 * 175711435, -523937732)) {
				method10194((byte) -115);
				Class691_Sub19.method9974(1708325665);
				ProtocolLoop.method1059((byte) -115);
			} else if (Class309.method4127(175711435 * anInt10876, 2130436643)
					&& !Class667.method7910(anInt10876 * 175711435, 1748018540)) {
				method10194((byte) -98);
				ProtocolLoop.method1059((byte) -87);
			} else if (175711435 * anInt10876 == 0)
				ProtocolLoop.method1059((byte) -5);
			else if (Class622.method7419(175711435 * anInt10876, (byte) -122)
					&& !Class667.method7910(anInt10876 * 175711435, 708905527))
				Class19.method647(-1971321617);
			else if (anInt10876 * 175711435 == 17 || anInt10876 * 175711435 == 7) {
				ProtocolLoop.method1059((byte) -99);
				if (-3 != Class54.anInt669 * -1852659257 && -1852659257 * Class54.anInt669 != 2
						&& 15 != Class54.anInt669 * -1852659257) {
					if (175711435 * anInt10876 == 7) {
						Class54.anInt672 = Class54.anInt679 * -1497558947;
						Class54.anInt645 = Class54.anInt674 * 146226169;
						Class54.anInt670 = -2095807961 * Class54.anInt669;
						if (Class616.aBool8033) {
							Class168.method2100(Class281.aClass16_3066.anInt192 * 2027542149,
									Class281.aClass16_3066.aString194, -1255012695 * Class281.aClass16_3066.anInt193,
									1401645101 * Class281.aClass16_3066.anInt191, 803858571);
							aClass109_10930.method1397((short) 21417);
							Class487.method5890(17, 2130003981);
						} else
							Class416.method4969(Class54.aBool675, 5126206);
					} else
						Class416.method4969(false, 5126206);
				}
			}
			Class54.method956(Class587.aClass173_7714, 692266235);
			aClass688_10900.method8032(-1490570711);
			if (Class587.aClass173_7714 != null) {
				Iterator iterator = aMap11051.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Class105 class105 = (Class105) entry.getValue();
					if (class105.method1352(-1719691253)) {
						byte[] is = class105.method1353(632878285);
						if (is != null) {
							try {
								BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
								int[] is_136_ = Class207.method2927(bufferedimage, -1309289613);
								Class151 class151 = (Class587.aClass173_7714.method2418(is_136_, 0,
										bufferedimage.getWidth(), bufferedimage.getWidth(), bufferedimage.getHeight(),
										472092494));
								aClass186_11173.method2729(class151, ((Integer) entry.getKey()).intValue());
							} catch (IOException ioexception) {
								VarDomainType.method5340(Class326.aclient3497.method6214(-1787229341), ioexception,
										1787975810);
							}
						}
						iterator.remove();
					}
				}
			}
		}
	}

	@Override
	final void method6226() {
		if (null != Class423.aClass141_Sub1_4785 && Class423.aClass141_Sub1_4785.aBool8795)
			Class647.method7712((short) 728);
		Class382.method4727((byte) -17);
		Class163.method2081(-798672408);
		if (Class587.aClass173_7714 != null)
			Class587.aClass173_7714.method2156(-1372793801);
		if (Class700.aBool8733 && Class207.aFrame2236 != null) {
			Class452.method5449(Class181.aClass702_2093, Class207.aFrame2236, -1274578876);
			Class207.aFrame2236 = null;
		}
		aClass109_10930.method1382(127033462);
		aClass109_10930.aClass61_1395.method1014((byte) 7);
		aClass109_11162.method1382(448102353);
		aClass109_11162.aClass61_1395.method1014((byte) 107);
		if (null != Class365.aClass218_3848)
			Class365.aClass218_3848.method3093(-48094534);
		Class700.aClass454_8734.method5468(1962763505);
		Class624.aClass449_8128.method5416(464681177);
		Class557.aClass455_7466.method5504(-2017568210);
		if (aClass631_10885 != null) {
			aClass631_10885.method7534(1449152973);
			aClass631_10885 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class109.method1404((byte) -5);
		try {
			Class24.method702(-756047158);
		} catch (Exception exception) {
			/* empty */
		}
		if (null != Class499.aClass40_6844)
			Class499.aClass40_6844.method812(-47876106);
		if (aBool6952 && Class646.aClass665_8386 != ModeWhere.aClass665_8465)
			Class181_Sub11.method8963(193232569);
	}

	@Override
	final void method6202() {
		if (null != Class423.aClass141_Sub1_4785 && Class423.aClass141_Sub1_4785.aBool8795)
			Class647.method7712((short) 728);
		Class382.method4727((byte) -105);
		Class163.method2081(-798672408);
		if (Class587.aClass173_7714 != null)
			Class587.aClass173_7714.method2156(-1372793801);
		if (Class700.aBool8733 && Class207.aFrame2236 != null) {
			Class452.method5449(Class181.aClass702_2093, Class207.aFrame2236, -55008958);
			Class207.aFrame2236 = null;
		}
		aClass109_10930.method1382(-1401143802);
		aClass109_10930.aClass61_1395.method1014((byte) 115);
		aClass109_11162.method1382(722874222);
		aClass109_11162.aClass61_1395.method1014((byte) 32);
		if (null != Class365.aClass218_3848)
			Class365.aClass218_3848.method3093(-48094534);
		Class700.aClass454_8734.method5468(1962763505);
		Class624.aClass449_8128.method5416(-131454986);
		Class557.aClass455_7466.method5504(1119720920);
		if (aClass631_10885 != null) {
			aClass631_10885.method7534(758580880);
			aClass631_10885 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class109.method1404((byte) -26);
		try {
			Class24.method702(-1264322442);
		} catch (Exception exception) {
			/* empty */
		}
		if (null != Class499.aClass40_6844)
			Class499.aClass40_6844.method812(-1803426003);
		if (aBool6952 && Class646.aClass665_8386 != ModeWhere.aClass665_8465)
			Class181_Sub11.method8963(1462438473);
	}

	@Override
	public String method6222() {
		String string = " ";
		try {
			Class578 class578 = aClass495_10935.method5966(1273279609);
			string = new StringBuilder().append(string).append(961465569 * class578.anInt7607)
					.append(Class49.aString555).append(-173815201 * class578.anInt7608).append(Class49.aString555)
					.append(aClass495_10935.method6029((short) 2514)).append(Class49.aString555)
					.append(aClass495_10935.method5967(-313574124)).append(" ").toString();
			if (null != Class108.myPlayer)
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneXQueue[0]) + class578.anInt7607 * 961465569)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneYQueue[0]) + class578.anInt7608 * -173815201).append(" ")
						.toString();
			else
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(Class181_Sub5.anInt9778 * 1926870089)
						.append(Class49.aString555).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub24_10594.method10014(-1824619963)).append(" ")
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub27_10567.method10040((byte) -70)).append(" ")
					.append(Class377.method4705(-1042755491)).append(" ").append(Class411.anInt4713 * -1117838587)
					.append(Class49.aString555).append(anInt6933 * -2142152407).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub2_10580.method9747(-2098321037)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub8_10565.method9883(1818663149)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub15_10566.method9938(1325478421)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub19_10601.method9967(-1299857138)).append(" ")
					.toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(1110656915 * anInt6957).append(" ").toString();
			string = new StringBuilder().append(string).append(175711435 * anInt10876).append(" ").toString();
			if (Class141_Sub1.aClass528_Sub37_8800 != null)
				string = new StringBuilder().append(string)
						.append(428595037 * Class141_Sub1.aClass528_Sub37_8800.anInt10540).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11054 != null)
				string = new StringBuilder().append(string).append(aString11054).toString();
			else
				string = new StringBuilder().append(string).append(Class49.aString555).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	@Override
	public String method6204() {
		String string = " ";
		try {
			Class578 class578 = aClass495_10935.method5966(1273279609);
			string = new StringBuilder().append(string).append(961465569 * class578.anInt7607)
					.append(Class49.aString555).append(-173815201 * class578.anInt7608).append(Class49.aString555)
					.append(aClass495_10935.method6029((short) 14939)).append(Class49.aString555)
					.append(aClass495_10935.method5967(-431445793)).append(" ").toString();
			if (null != Class108.myPlayer)
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneXQueue[0]) + class578.anInt7607 * 961465569)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneYQueue[0]) + class578.anInt7608 * -173815201).append(" ")
						.toString();
			else
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(Class181_Sub5.anInt9778 * 1926870089)
						.append(Class49.aString555).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub24_10594.method10014(-1824619963)).append(" ")
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub27_10567.method10040((byte) -15)).append(" ")
					.append(Class377.method4705(1342540012)).append(" ").append(Class411.anInt4713 * -1117838587)
					.append(Class49.aString555).append(anInt6933 * -2142152407).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub2_10580.method9747(-2098321037)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub8_10565.method9883(1975737025)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub15_10566.method9938(2139843824)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub19_10601.method9967(-1627661083)).append(" ")
					.toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(1110656915 * anInt6957).append(" ").toString();
			string = new StringBuilder().append(string).append(175711435 * anInt10876).append(" ").toString();
			if (Class141_Sub1.aClass528_Sub37_8800 != null)
				string = new StringBuilder().append(string)
						.append(428595037 * Class141_Sub1.aClass528_Sub37_8800.anInt10540).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11054 != null)
				string = new StringBuilder().append(string).append(aString11054).toString();
			else
				string = new StringBuilder().append(string).append(Class49.aString555).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	@Override
	public String method6205() {
		String string = " ";
		try {
			Class578 class578 = aClass495_10935.method5966(1273279609);
			string = new StringBuilder().append(string).append(961465569 * class578.anInt7607)
					.append(Class49.aString555).append(-173815201 * class578.anInt7608).append(Class49.aString555)
					.append(aClass495_10935.method6029((short) 28518)).append(Class49.aString555)
					.append(aClass495_10935.method5967(97300879)).append(" ").toString();
			if (null != Class108.myPlayer)
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneXQueue[0]) + class578.anInt7607 * 961465569)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneYQueue[0]) + class578.anInt7608 * -173815201).append(" ")
						.toString();
			else
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(Class181_Sub5.anInt9778 * 1926870089)
						.append(Class49.aString555).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub24_10594.method10014(-1824619963)).append(" ")
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub27_10567.method10040((byte) -19)).append(" ")
					.append(Class377.method4705(434275072)).append(" ").append(Class411.anInt4713 * -1117838587)
					.append(Class49.aString555).append(anInt6933 * -2142152407).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub2_10580.method9747(-2098321037)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub8_10565.method9883(1954133545)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub15_10566.method9938(-62314503)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub19_10601.method9967(-1811971657)).append(" ")
					.toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(1110656915 * anInt6957).append(" ").toString();
			string = new StringBuilder().append(string).append(175711435 * anInt10876).append(" ").toString();
			if (Class141_Sub1.aClass528_Sub37_8800 != null)
				string = new StringBuilder().append(string)
						.append(428595037 * Class141_Sub1.aClass528_Sub37_8800.anInt10540).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11054 != null)
				string = new StringBuilder().append(string).append(aString11054).toString();
			else
				string = new StringBuilder().append(string).append(Class49.aString555).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	@Override
	public String method6183() {
		String string = " ";
		try {
			Class578 class578 = aClass495_10935.method5966(1273279609);
			string = new StringBuilder().append(string).append(961465569 * class578.anInt7607)
					.append(Class49.aString555).append(-173815201 * class578.anInt7608).append(Class49.aString555)
					.append(aClass495_10935.method6029((short) 11736)).append(Class49.aString555)
					.append(aClass495_10935.method5967(421361141)).append(" ").toString();
			if (null != Class108.myPlayer)
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneXQueue[0]) + class578.anInt7607 * 961465569)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneYQueue[0]) + class578.anInt7608 * -173815201).append(" ")
						.toString();
			else
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(Class181_Sub5.anInt9778 * 1926870089)
						.append(Class49.aString555).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub24_10594.method10014(-1824619963)).append(" ")
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub27_10567.method10040((byte) -1)).append(" ")
					.append(Class377.method4705(1338163926)).append(" ").append(Class411.anInt4713 * -1117838587)
					.append(Class49.aString555).append(anInt6933 * -2142152407).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub2_10580.method9747(-2098321037)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub8_10565.method9883(1872805286)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub15_10566.method9938(770529638)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub19_10601.method9967(-509533378)).append(" ")
					.toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(1110656915 * anInt6957).append(" ").toString();
			string = new StringBuilder().append(string).append(175711435 * anInt10876).append(" ").toString();
			if (Class141_Sub1.aClass528_Sub37_8800 != null)
				string = new StringBuilder().append(string)
						.append(428595037 * Class141_Sub1.aClass528_Sub37_8800.anInt10540).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11054 != null)
				string = new StringBuilder().append(string).append(aString11054).toString();
			else
				string = new StringBuilder().append(string).append(Class49.aString555).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	@Override
	public String method6207() {
		String string = " ";
		try {
			Class578 class578 = aClass495_10935.method5966(1273279609);
			string = new StringBuilder().append(string).append(961465569 * class578.anInt7607)
					.append(Class49.aString555).append(-173815201 * class578.anInt7608).append(Class49.aString555)
					.append(aClass495_10935.method6029((short) 12806)).append(Class49.aString555)
					.append(aClass495_10935.method5967(479019192)).append(" ").toString();
			if (null != Class108.myPlayer)
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneXQueue[0]) + class578.anInt7607 * 961465569)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneYQueue[0]) + class578.anInt7608 * -173815201).append(" ")
						.toString();
			else
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(Class181_Sub5.anInt9778 * 1926870089)
						.append(Class49.aString555).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub24_10594.method10014(-1824619963)).append(" ")
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub27_10567.method10040((byte) -2)).append(" ")
					.append(Class377.method4705(455756342)).append(" ").append(Class411.anInt4713 * -1117838587)
					.append(Class49.aString555).append(anInt6933 * -2142152407).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub2_10580.method9747(-2098321037)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub8_10565.method9883(1856911145)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub15_10566.method9938(1954535817)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub19_10601.method9967(-1104204277)).append(" ")
					.toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(1110656915 * anInt6957).append(" ").toString();
			string = new StringBuilder().append(string).append(175711435 * anInt10876).append(" ").toString();
			if (Class141_Sub1.aClass528_Sub37_8800 != null)
				string = new StringBuilder().append(string)
						.append(428595037 * Class141_Sub1.aClass528_Sub37_8800.anInt10540).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11054 != null)
				string = new StringBuilder().append(string).append(aString11054).toString();
			else
				string = new StringBuilder().append(string).append(Class49.aString555).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	static final void method10204() {
		Iterator iterator = aClass692_11044.iterator();
		while (iterator.hasNext()) {
			Class528_Sub21_Sub19 class528_sub21_sub19 = (Class528_Sub21_Sub19) iterator.next();
			Class645_Sub1_Sub5_Sub4 class645_sub1_sub5_sub4 = (class528_sub21_sub19.aClass645_Sub1_Sub5_Sub4_11688);
			if (aClass495_10935.method5973((byte) 119) != null && class645_sub1_sub5_sub4.method10859(-1864395182))
				aClass495_10935.method5973((byte) 40).method6545(class645_sub1_sub5_sub4, true, 1792455463);
		}
	}

	static void method10205() {
		if (ModeWhere.aClass665_8465 != Class646.aClass665_8386)
			Class398.aClass398_4403.method4821(1071224287);
	}

	void method10206(int i) {
		if (Class700.aClass454_8734.anInt4992 * -1174576079 > -75308187 * anInt10913) {
			Class12.aClass16_174.method634(-1926397834);
			anInt10912 = Class700.aClass454_8734.anInt4992 * -488470462 - 2026186210;
			if (-1977962931 * anInt10912 > 3000)
				anInt10912 = -1455569256;
			if (-1174576079 * Class700.aClass454_8734.anInt4992 >= 2
					&& 6 == 1918248281 * Class700.aClass454_8734.anInt4993) {
				method6173("js5connect_outofdate", -1556627988);
				anInt10876 = 1957913257;
				return;
			}
			if (Class700.aClass454_8734.anInt4992 * -1174576079 >= 1
					&& 48 == 1918248281 * Class700.aClass454_8734.anInt4993) {
				method6173("sessionexpired", -1556627988);
				anInt10876 = 1957913257;
				return;
			}
			if (-1174576079 * Class700.aClass454_8734.anInt4992 >= 4
					&& -1 == 1918248281 * Class700.aClass454_8734.anInt4993) {
				method6194("js5crc",
						new StringBuilder().append("a=").append(Class700.aClass454_8734.anInt4988 * 372570771)
								.append("&g=").append(-1505792639 * Class700.aClass454_8734.anInt4995).toString(),
						(byte) 45);
				anInt10876 = 1957913257;
				return;
			}
			if (Class700.aClass454_8734.anInt4992 * -1174576079 >= 4
					&& Class539.method6615(175711435 * anInt10876, -1942434840)) {
				if (7 == Class700.aClass454_8734.anInt4993 * 1918248281
						|| 9 == Class700.aClass454_8734.anInt4993 * 1918248281)
					method6173("js5connect_full", -1556627988);
				else if (Class700.aClass454_8734.anInt4993 * 1918248281 > 0) {
					if (aString10916 == null)
						method6173("js5connect", -1556627988);
					else
						method6173(new StringBuilder().append("js5proxy_").append(aString10916.trim()).toString(),
								-1556627988);
				} else
					method6173("js5io", -1556627988);
				anInt10876 = 1957913257;
				return;
			}
		}
		anInt10913 = -125804835 * Class700.aClass454_8734.anInt4992;
		if (anInt10912 * -1977962931 > 0)
			anInt10912 -= -163693947;
		else {
			try {
				if (anInt11135 * 2081643045 == 0) {
					Class511_Sub3.aSocket10267 = Class12.aClass16_174.method639(-853267202);
					anInt11135 += 948908461;
				}
				if (2081643045 * anInt11135 == 1) {
					Class203.aClass551_2218 = Class439.method5301(Class511_Sub3.aSocket10267, 125000, 2122479929);
					int i_137_ = 10 + aString11054.length();
					ByteBuffer class528_sub42 = new ByteBuffer(i_137_ + 2);
					class528_sub42.writeByte(-257442419 * (HandshakeOpcode.aClass404_4589.anInt4590), (byte) 92);
					class528_sub42.writeByte(i_137_, (byte) -86);
					class528_sub42.writeInt(857, 2007796627);
					class528_sub42.writeInt(1, 2128172559);
					class528_sub42.writeString(aString11054, -1936289654);
					class528_sub42.writeByte((Class378_Sub2.aClass668_10123.anInt8500) * 1736046843, (byte) 1);
					Class203.aClass551_2218.method6693((class528_sub42.payload), 0, 2 + i_137_, (byte) 48);
					anInt11135 += 948908461;
					Class181_Sub9.aLong9804 = (Class249.method3417(1985332794) * 8098888164731497155L);
				}
				if (2081643045 * anInt11135 == 2) {
					if (Class203.aClass551_2218.method6690(1, -676836283)) {
						byte[] is = new byte[1];
						int i_138_ = Class203.aClass551_2218.method6689(is, 0, 1, -1857352782);
						if (is[0] != 0) {
							method10193(i_138_, 1963970698);
							return;
						}
						anInt11135 += 948908461;
					} else if ((Class249.method3417(2093200661)
							- (6654980750108972523L * Class181_Sub9.aLong9804)) > 30000L) {
						method10193(1001, 1447142781);
						return;
					}
				}
				if (3 == 2081643045 * anInt11135) {
					Class63[] class63s = Class63.method1030(1823771569);
					int i_139_ = class63s.length * 4;
					if (Class203.aClass551_2218.method6690(i_139_, -676836283)) {
						ByteBuffer class528_sub42 = new ByteBuffer(i_139_);
						Class203.aClass551_2218.method6689(class528_sub42.payload, 0, class528_sub42.payload.length,
								-1695067674);
						for (int i_140_ = 0; i_140_ < class63s.length; i_140_++)
							class63s[i_140_].method1032(class528_sub42.readInt(611779442), 97319378);
						boolean bool = (Class539.method6615(anInt10876 * 175711435, -1687670827)
								|| ScenePacketType.method4846(175711435 * anInt10876, 902427404)
								|| Class309.method4127(175711435 * anInt10876, 2130436643));
						Class700.aClass454_8734.method5474((Class203.aClass551_2218), !bool, 111791555);
						Class511_Sub3.aSocket10267 = null;
						Class203.aClass551_2218 = null;
						anInt11135 = 0;
					}
				}
			} catch (IOException ioexception) {
				method10193(1002, 1824195223);
			}
		}
	}

	static final void method10207() {
		int i = 1087758653 * GPI.localPlayerCount;
		int[] is = GPI.localPlayerIndicies;
		int i_141_;
		if (0 == 345087519 * anInt10943)
			i_141_ = Class185.aClass182Array2106.length;
		else
			i_141_ = aBool10893 ? i : i + -2065344127 * anInt10922;
		for (int i_142_ = 0; i_142_ < i_141_; i_142_++) {
			Entity class645_sub1_sub5_sub1;
			if (anInt10943 * 345087519 == 0) {
				Class182 class182 = Class185.aClass182Array2106[i_142_];
				if (!class182.aBool2097)
					continue;
				class645_sub1_sub5_sub1 = class182.method2689(-1012043543);
			} else {
				if (i_142_ < i)
					class645_sub1_sub5_sub1 = localPlayers[is[i_142_]];
				else
					class645_sub1_sub5_sub1 = ((Entity) (((Class528_Sub31) aClass692_11110
							.method8137(anIntArray10923[i_142_ - i])).anObject10468));
				if (-659687063 * class645_sub1_sub5_sub1.anInt11767 < 0)
					continue;
			}
			int i_143_ = class645_sub1_sub5_sub1.method10671((byte) -33);
			Class422 class422 = class645_sub1_sub5_sub1.method7693().aClass422_4868;
			if (0 == (i_143_ & 0x1)) {
				if (((int) class422.aFloat4780 & 0x1ff) == 0 && 0 == ((int) class422.aFloat4777 & 0x1ff))
					continue;
			} else if (((int) class422.aFloat4780 & 0x1ff) == 256 && ((int) class422.aFloat4777 & 0x1ff) == 256)
				continue;
			if ((-1833893027 * class645_sub1_sub5_sub1.anInt11792 <= anInt11127
					&& (class645_sub1_sub5_sub1.anInt11793 * -1416183947 < anInt11127))
					|| (class645_sub1_sub5_sub1.anInt11790 * 991304933 == class645_sub1_sub5_sub1.anInt11791
							* -1080767853))
				class645_sub1_sub5_sub1.method7682(
						class422.aFloat4780, (Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
								(int) class422.aFloat4777, class645_sub1_sub5_sub1.aByte10675, -759833206)),
						class422.aFloat4777);
			aClass495_10935.method5973((byte) 67).method6545(class645_sub1_sub5_sub1, true, 2057337701);
		}
	}

	static final void method10208() {
		BitBuffer class528_sub42_sub2 = aClass109_10930.aClass528_Sub42_Sub2_1378;
		class528_sub42_sub2.setBitAccess(456456071);
		int i = class528_sub42_sub2.readBits(8, (byte) -13);
		if (i < -2065344127 * anInt10922) {
			for (int i_144_ = i; i_144_ < anInt10922 * -2065344127; i_144_++)
				anIntArray10928[(anInt10927 += 1202438591) * -1261097409 - 1] = anIntArray10923[i_144_];
		}
		if (i > anInt10922 * -2065344127)
			throw new RuntimeException();
		anInt10922 = 0;
		for (int i_145_ = 0; i_145_ < i; i_145_++) {
			int i_146_ = anIntArray10923[i_145_];
			NPC class645_sub1_sub5_sub1_sub1 = ((NPC) ((Class528_Sub31) aClass692_11110
					.method8137(i_146_)).anObject10468);
			int i_147_ = class528_sub42_sub2.readBits(1, (byte) -86);
			if (0 == i_147_) {
				anIntArray10923[(anInt10922 += -1811618175) * -2065344127 - 1] = i_146_;
				class645_sub1_sub5_sub1_sub1.anInt11758 = -653015535 * anInt11032;
			} else {
				int i_148_ = class528_sub42_sub2.readBits(2, (byte) -24);
				if (i_148_ == 0) {
					anIntArray10923[((anInt10922 += -1811618175) * -2065344127 - 1)] = i_146_;
					class645_sub1_sub5_sub1_sub1.anInt11758 = -653015535 * anInt11032;
					anIntArray10925[((anInt10924 += 1904393989) * -141740595 - 1)] = i_146_;
				} else if (i_148_ == 1) {
					anIntArray10923[((anInt10922 += -1811618175) * -2065344127 - 1)] = i_146_;
					class645_sub1_sub5_sub1_sub1.anInt11758 = -653015535 * anInt11032;
					Class657 class657 = ((Class657) Class443.method5321(Class575.method6890((byte) 44),
							class528_sub42_sub2.readBits(3, (byte) -29), 1937159315));
					class645_sub1_sub5_sub1_sub1.method10901(class657, (Class666.aClass666_8476.aByte8478), (byte) 0);
					int i_149_ = class528_sub42_sub2.readBits(1, (byte) -55);
					if (i_149_ == 1)
						anIntArray10925[(anInt10924 += 1904393989) * -141740595 - 1] = i_146_;
				} else if (i_148_ == 2) {
					anIntArray10923[((anInt10922 += -1811618175) * -2065344127 - 1)] = i_146_;
					class645_sub1_sub5_sub1_sub1.anInt11758 = -653015535 * anInt11032;
					if (class528_sub42_sub2.readBits(1, (byte) -49) == 1) {
						Class657 class657 = ((Class657) (Class443.method5321(Class575.method6890((byte) 82),
								class528_sub42_sub2.readBits(3, (byte) -75), 1155328980)));
						class645_sub1_sub5_sub1_sub1.method10901(class657, Class666.aClass666_8479.aByte8478, (byte) 0);
						Class657 class657_150_ = ((Class657) (Class443.method5321(Class575.method6890((byte) 94),
								class528_sub42_sub2.readBits(3, (byte) -21), 1297353071)));
						class645_sub1_sub5_sub1_sub1.method10901(class657_150_, Class666.aClass666_8479.aByte8478,
								(byte) 0);
					} else {
						Class657 class657 = ((Class657) (Class443.method5321(Class575.method6890((byte) 50),
								class528_sub42_sub2.readBits(3, (byte) -34), 1147552718)));
						class645_sub1_sub5_sub1_sub1.method10901(class657, Class666.aClass666_8477.aByte8478, (byte) 0);
					}
					int i_151_ = class528_sub42_sub2.readBits(1, (byte) -88);
					if (1 == i_151_)
						anIntArray10925[(anInt10924 += 1904393989) * -141740595 - 1] = i_146_;
				} else if (3 == i_148_)
					anIntArray10928[((anInt10927 += 1202438591) * -1261097409 - 1)] = i_146_;
			}
		}
	}

	static void method10209() {
		for (int i = 0; i < 102; i++)
			aBoolArray10855[i] = true;
	}

	static final void method10210() {
		Class160.aClass5_Sub11_1805.method539(-793672986);
		Class224.aClass5_Sub18_2330.method539(-2068422666);
		ISAACCipher.aClass5_Sub7_157.method539(-89201245);
		aClass495_10935.method5976((short) 26392).method539(-939202388);
		Class21.aClass5_Sub8_214.method539(1095301288);
		Class18.aClass5_Sub13_206.method539(1146538531);
		Class379.aClass5_Sub4_3966.method539(840077705);
		Class2.aClass5_Sub12_24.method539(-1505375236);
		Class5_Sub7.aClass5_Sub5_10838.method539(-181901848);
		Class691_Sub20.aClass95_Sub1_Sub2_10751.method10294(-947080555);
		Class664.aClass95_Sub1_Sub1_8460.method10282((byte) -22);
		Class320.aClass95_Sub1_Sub1_3466.method10282((byte) -31);
		Class181_Sub20.aClass95_Sub1_Sub1_9866.method10282((byte) 27);
		Class237.aClass95_Sub1_Sub1_2601.method10282((byte) 63);
		Class147.aClass5_Sub14_1673.method539(-867533157);
		Class316_Sub3.aClass5_Sub16_10053.method539(-324467737);
		Class208.aClass5_Sub6_2238.method539(-1540908062);
		Class208.aClass5_Sub10_2239.method539(-1703014669);
		Class317_Sub1.aClass5_Sub1_9957.method539(963872130);
		Class243.aClass5_Sub2_2730.method539(-1480135867);
		Class57.aClass5_Sub22_686.method539(1194239155);
		Class525.aClass5_Sub20_7075.method539(231593183);
		Class581.aClass5_Sub19_7649.method539(-1723648151);
		Class533.aClass5_Sub9_7133.method539(-1253487471);
		Class690_Sub2.method10062(733538335);
		Class147.method1722((byte) 0);
		Class625.aClass414_8129.method4940(-1696165928);
		Class95.method1255((byte) 110);
		Class540.method6619(2127861361);
		aClass186_10977.method2735(-1320689563);
		aClass186_10915.method2735(-1972726838);
		Class634.aClass186_8205.method2735(-972492964);
		aClass186_11173.method2735(-1302651116);
	}

	static final void method10211() {
		if (Class309.method4127(175711435 * anInt10876, 2130436643)
				|| ScenePacketType.method4846(175711435 * anInt10876, 1248706544))
			Class416.method4969(false, 5126206);
		else {
			Class225.aClass551_2334 = aClass109_10930.method1384((byte) 46);
			aClass109_10930.method1397((short) 1893);
			Class487.method5890(17, 2130003981);
		}
	}

	static final void method10212() {
		Iterator iterator = aClass692_11044.iterator();
		while (iterator.hasNext()) {
			Class528_Sub21_Sub19 class528_sub21_sub19 = (Class528_Sub21_Sub19) iterator.next();
			Class645_Sub1_Sub5_Sub4 class645_sub1_sub5_sub4 = (class528_sub21_sub19.aClass645_Sub1_Sub5_Sub4_11688);
			class645_sub1_sub5_sub4.method10847(1, -957582330);
			if (class645_sub1_sub5_sub4.method10849((byte) -127)) {
				class528_sub21_sub19.method6443(-987230805);
				class645_sub1_sub5_sub4.method10848(-2076773411);
			}
		}
	}

	static final void method10213() {
		int i = GPI.localPlayerCount * 1087758653;
		int[] is = GPI.localPlayerIndicies;
		int i_152_ = Class514.aClass528_Sub38_6967.aClass691_Sub14_10570.method9932((byte) -1);
		boolean bool = i_152_ == 1 && i > 200 || i_152_ == 0 && i > 50;
		for (int i_153_ = 0; i_153_ < i; i_153_++) {
			Player class645_sub1_sub5_sub1_sub2 = localPlayers[is[i_153_]];
			if (!class645_sub1_sub5_sub1_sub2.method10924((byte) 15))
				class645_sub1_sub5_sub1_sub2.anInt11767 = -322053849;
			else if (class645_sub1_sub5_sub1_sub2.hidden)
				class645_sub1_sub5_sub1_sub2.anInt11767 = -322053849;
			else {
				class645_sub1_sub5_sub1_sub2.method10656(714572627);
				if (class645_sub1_sub5_sub1_sub2.aShort11747 < 0 || class645_sub1_sub5_sub1_sub2.aShort11745 < 0
						|| (class645_sub1_sub5_sub1_sub2.aShort11743 >= aClass495_10935.method6029((short) 15018))
						|| (class645_sub1_sub5_sub1_sub2.aShort11746 >= aClass495_10935.method5967(455542683)))
					class645_sub1_sub5_sub1_sub2.anInt11767 = -322053849;
				else {
					class645_sub1_sub5_sub1_sub2.aBool12049 = (class645_sub1_sub5_sub1_sub2.aClass690_Sub3_11803.aBool10798)
							? bool : false;
					if (Class108.myPlayer == class645_sub1_sub5_sub1_sub2)
						class645_sub1_sub5_sub1_sub2.anInt11767 = 1825429799;
					else {
						int i_154_ = 0;
						if (!class645_sub1_sub5_sub1_sub2.aBool11763)
							i_154_++;
						if (!class645_sub1_sub5_sub1_sub2.aClass695_11779.method8178((byte) 1))
							i_154_ += 2;
						i_154_ += 5 - class645_sub1_sub5_sub1_sub2.method10671((byte) -43) << 2;
						if ((Class213.aClass213_2250 != class645_sub1_sub5_sub1_sub2.aClass213_12066)
								|| class645_sub1_sub5_sub1_sub2.inClan)
							i_154_ += 512;
						else {
							if (-594883223 * anInt11001 == 0)
								i_154_ += 32;
							else
								i_154_ += 128;
							i_154_ += 256;
						}
						if (class645_sub1_sub5_sub1_sub2.method10687(1600226731) == anInt10872 * 712301817)
							i_154_ += 2047;
						class645_sub1_sub5_sub1_sub2.anInt11767 = (i_154_ + 1) * 322053849;
					}
				}
			}
		}
		for (int i_155_ = 0; i_155_ < -2065344127 * anInt10922; i_155_++) {
			NPC class645_sub1_sub5_sub1_sub1 = ((NPC) (((Class528_Sub31) aClass692_11110
					.method8137(anIntArray10923[i_155_])).anObject10468));
			if (!class645_sub1_sub5_sub1_sub1.method10903(1024109885) || !(class645_sub1_sub5_sub1_sub1.aClass299_12043
					.method4001(Class570.playerVarsProvider, Class570.playerVarsProvider, 635638626)))
				class645_sub1_sub5_sub1_sub1.anInt11767 = -322053849;
			else {
				class645_sub1_sub5_sub1_sub1.method10656(-196118123);
				if (class645_sub1_sub5_sub1_sub1.aShort11747 < 0 || class645_sub1_sub5_sub1_sub1.aShort11745 < 0
						|| (class645_sub1_sub5_sub1_sub1.aShort11743 >= aClass495_10935.method6029((short) 1719))
						|| (class645_sub1_sub5_sub1_sub1.aShort11746 >= aClass495_10935.method5967(1353810022)))
					class645_sub1_sub5_sub1_sub1.anInt11767 = -322053849;
				else {
					int i_156_ = 0;
					if (!class645_sub1_sub5_sub1_sub1.aBool11763)
						i_156_++;
					if (!class645_sub1_sub5_sub1_sub1.aClass695_11779.method8178((byte) 1))
						i_156_ += 2;
					if (class645_sub1_sub5_sub1_sub1.method10671((byte) -108) < 5)
						i_156_ += 5 - class645_sub1_sub5_sub1_sub1.method10671((byte) -102) << 2;
					if (anInt11001 * -594883223 == 0) {
						if (class645_sub1_sub5_sub1_sub1.aClass299_12043.aBool3279)
							i_156_ += 64;
						else
							i_156_ += 128;
					} else if (1 == -594883223 * anInt11001) {
						if (class645_sub1_sub5_sub1_sub1.aClass299_12043.aBool3279)
							i_156_ += 32;
						else
							i_156_ += 64;
					}
					if (class645_sub1_sub5_sub1_sub1.aClass299_12043.aBool3290)
						i_156_ += 1024;
					else if (!class645_sub1_sub5_sub1_sub1.aClass299_12043.aBool3294)
						i_156_ += 256;
					if (class645_sub1_sub5_sub1_sub1.method10687(1600226731) == 712301817 * anInt10872)
						i_156_ += 2047;
					class645_sub1_sub5_sub1_sub1.anInt11767 = (i_156_ + 1) * 322053849;
				}
			}
		}
		for (int i_157_ = 0; i_157_ < aClass96Array11016.length; i_157_++) {
			Class96 class96 = aClass96Array11016[i_157_];
			if (null != class96) {
				if (1 == -411936407 * class96.anInt1224) {
					Class528_Sub31 class528_sub31 = ((Class528_Sub31) aClass692_11110
							.method8137(class96.anInt1216 * -1637531687));
					if (null != class528_sub31) {
						NPC class645_sub1_sub5_sub1_sub1 = ((NPC) class528_sub31.anObject10468);
						if ((class645_sub1_sub5_sub1_sub1.anInt11767 * -659687063) >= 0)
							class645_sub1_sub5_sub1_sub1.anInt11767 += -1858680832;
					}
				} else if (-411936407 * class96.anInt1224 == 10) {
					Player class645_sub1_sub5_sub1_sub2 = (localPlayers[-1637531687
							* class96.anInt1216]);
					if (class645_sub1_sub5_sub1_sub2 != null && (class645_sub1_sub5_sub1_sub2 != Class108.myPlayer)
							&& (-659687063 * class645_sub1_sub5_sub1_sub2.anInt11767) >= 0)
						class645_sub1_sub5_sub1_sub2.anInt11767 += -1858680832;
				}
			}
		}
	}

	static final void method10214() {
		Class216.method3066(Class587.aClass173_7714, 1818632035);
		if (-793614607 * anInt11096 != Class181_Sub5.anInt9778 * 1926870089)
			Class541.method6620(-870310796);
	}

	static final void method10215() {
		Class216.method3066(Class587.aClass173_7714, 1818632035);
		if (-793614607 * anInt11096 != Class181_Sub5.anInt9778 * 1926870089)
			Class541.method6620(1535159286);
	}

	static final void method10216() {
		int[] is = GPI.localPlayerIndicies;
		for (int i = 0; i < 1087758653 * GPI.localPlayerCount; i++) {
			Player class645_sub1_sub5_sub1_sub2 = localPlayers[is[i]];
			if (class645_sub1_sub5_sub1_sub2 != null)
				class645_sub1_sub5_sub1_sub2.method10677(640536022);
		}
		for (int i = 0; i < -2065344127 * anInt10922; i++) {
			long l = anIntArray10923[i];
			Class528_Sub31 class528_sub31 = (Class528_Sub31) aClass692_11110.method8137(l);
			if (null != class528_sub31)
				((Entity) class528_sub31.anObject10468).method10677(1031616190);
		}
		if (0 == anInt10943 * 345087519) {
			for (int i = 0; i < Class185.aClass182Array2106.length; i++) {
				Class182 class182 = Class185.aClass182Array2106[i];
				if (class182.aBool2097)
					class182.method2689(-1012043543).method10677(-1652085731);
			}
		}
	}

	public static final void method10217() {
		if (-213699943 * anInt11065 != -1 && -1 != anInt10988 * -1427953027) {
			int i = ((anInt10991 * 1414509155 * (-1206937049 * anInt11134 - 1505565631 * anInt11188) >> 16)
					+ anInt11188 * 1505565631);
			anInt10991 += 1627152203 * i;
			if (1414509155 * anInt10991 >= 65535) {
				anInt10991 = -28401483;
				if (!aBool10974)
					aBool10994 = true;
				else
					aBool10994 = false;
				aBool10974 = true;
			} else {
				aBool10994 = false;
				aBool10974 = false;
			}
			float f = 1414509155 * anInt10991 / 65535.0F;
			float[] fs = new float[3];
			int i_158_ = 1320502914 * anInt10989;
			for (int i_159_ = 0; i_159_ < 3; i_159_++) {
				int i_160_ = ((anIntArrayArrayArray10986[anInt11065 * -213699943][i_158_][i_159_]) * 3);
				int i_161_ = 3 * (anIntArrayArrayArray10986[-213699943 * anInt11065][i_158_ + 1][i_159_]);
				int i_162_ = 3 * ((anIntArrayArrayArray10986[-213699943 * anInt11065][2 + i_158_][i_159_])
						- ((anIntArrayArrayArray10986[-213699943 * anInt11065][i_158_ + 3][i_159_])
								- (anIntArrayArrayArray10986[anInt11065 * -213699943][2 + i_158_][i_159_])));
				int i_163_ = (anIntArrayArrayArray10986[-213699943 * anInt11065][i_158_][i_159_]);
				int i_164_ = i_161_ - i_160_;
				int i_165_ = i_160_ - 2 * i_161_ + i_162_;
				int i_166_ = i_161_
						+ ((anIntArrayArrayArray10986[anInt11065 * -213699943][i_158_ + 2][i_159_]) - i_163_) - i_162_;
				fs[i_159_] = ((i_164_ + f * (f * i_166_ + i_165_)) * f + i_163_);
			}
			Class578 class578 = aClass495_10935.method5966(1273279609);
			Class626.anInt8136 = (((int) fs[0] - -1650867712 * class578.anInt7607) * 1636412895);
			Class137.anInt1630 = -1124026061 * (int) fs[1];
			Class227.anInt2347 = ((int) fs[2] - 1200930304 * class578.anInt7608) * 397871753;
			float[] fs_167_ = new float[3];
			int i_168_ = -607210462 * anInt10990;
			for (int i_169_ = 0; i_169_ < 3; i_169_++) {
				int i_170_ = ((anIntArrayArrayArray10986[-1427953027 * anInt10988][i_168_][i_169_]) * 3);
				int i_171_ = ((anIntArrayArrayArray10986[anInt10988 * -1427953027][1 + i_168_][i_169_]) * 3);
				int i_172_ = (((anIntArrayArrayArray10986[-1427953027 * anInt10988][i_168_ + 2][i_169_])
						- ((anIntArrayArrayArray10986[anInt10988 * -1427953027][i_168_ + 3][i_169_])
								- (anIntArrayArrayArray10986[anInt10988 * -1427953027][2 + i_168_][i_169_])))
						* 3);
				int i_173_ = (anIntArrayArrayArray10986[-1427953027 * anInt10988][i_168_][i_169_]);
				int i_174_ = i_171_ - i_170_;
				int i_175_ = i_172_ + (i_170_ - i_171_ * 2);
				int i_176_ = ((anIntArrayArrayArray10986[-1427953027 * anInt10988][2 + i_168_][i_169_]) - i_173_
						+ i_171_ - i_172_);
				fs_167_[i_169_] = (f * (i_176_ * f + i_175_) + i_174_) * f + i_173_;
			}
			float f_177_ = fs_167_[0] - fs[0];
			float f_178_ = (fs_167_[1] - fs[1]) * -1.0F;
			float f_179_ = fs_167_[2] - fs[2];
			double d = Math.sqrt(f_179_ * f_179_ + f_177_ * f_177_);
			Class309_Sub1.anInt9907 = ((int) (Math.atan2(f_178_, d) * 2607.5945876176133) & 0x3fff) * 2028903323;
			Class653.anInt8429 = ((int) (-Math.atan2(f_177_, f_179_) * 2607.5945876176133) & 0x3fff) * -1829176741;
			Class48.anInt548 = -1623194183 * (((((anIntArrayArrayArray10986[anInt11065 * -213699943][2 + i_158_][3])
					- (anIntArrayArrayArray10986[-213699943 * anInt11065][i_158_][3]))
					* (1414509155 * anInt10991)) >> 16)
					+ (anIntArrayArrayArray10986[anInt11065 * -213699943][i_158_][3]));
		}
	}

	static final void method10218() {
		int i = 256 + -2136693248 * Class231.anInt2575;
		int i_180_ = 256 + -725560832 * Class72.anInt778;
		int i_181_ = (Class335_Sub1_Sub1.method10374(i, i_180_, (1926870089 * Class181_Sub5.anInt9778), -759833206)
				- Class326_Sub2.anInt10045 * -301505943);
		if (VarDomainType.anInt4932 * -874739631 >= 100) {
			Class626.anInt8136 = Class231.anInt2575 * 697997824 + -1985093888;
			Class227.anInt2347 = -2124127744 * Class72.anInt778 + -1224046336;
			Class137.anInt1630 = ((Class335_Sub1_Sub1.method10374(Class626.anInt8136 * -639218145,
					-1246131271 * Class227.anInt2347, Class181_Sub5.anInt9778 * 1926870089, -759833206))
					- -301505943 * Class326_Sub2.anInt10045) * 1124026061;
		} else {
			if (-639218145 * Class626.anInt8136 < i) {
				Class626.anInt8136 += 1636412895 * (Class316_Sub1.anInt9900 * 1564478433
						+ ((i - -639218145 * Class626.anInt8136) * (-874739631 * VarDomainType.anInt4932) / 1000));
				if (Class626.anInt8136 * -639218145 > i)
					Class626.anInt8136 = 1636412895 * i;
			}
			if (-639218145 * Class626.anInt8136 > i) {
				Class626.anInt8136 -= ((1564478433 * Class316_Sub1.anInt9900
						+ (-874739631 * VarDomainType.anInt4932 * (Class626.anInt8136 * -639218145 - i) / 1000))
						* 1636412895);
				if (Class626.anInt8136 * -639218145 < i)
					Class626.anInt8136 = i * 1636412895;
			}
			if (Class137.anInt1630 * 950408709 < i_181_) {
				Class137.anInt1630 += (((i_181_ - 950408709 * Class137.anInt1630) * (VarDomainType.anInt4932 * -874739631)
						/ 1000) + Class316_Sub1.anInt9900 * 1564478433) * 1124026061;
				if (950408709 * Class137.anInt1630 > i_181_)
					Class137.anInt1630 = i_181_ * 1124026061;
			}
			if (Class137.anInt1630 * 950408709 > i_181_) {
				Class137.anInt1630 -= 1124026061 * (1564478433 * Class316_Sub1.anInt9900
						+ (VarDomainType.anInt4932 * -874739631 * (Class137.anInt1630 * 950408709 - i_181_) / 1000));
				if (Class137.anInt1630 * 950408709 < i_181_)
					Class137.anInt1630 = 1124026061 * i_181_;
			}
			if (Class227.anInt2347 * -1246131271 < i_180_) {
				Class227.anInt2347 += (397871753
						* (((i_180_ - -1246131271 * Class227.anInt2347) * (-874739631 * VarDomainType.anInt4932) / 1000)
								+ 1564478433 * Class316_Sub1.anInt9900));
				if (Class227.anInt2347 * -1246131271 > i_180_)
					Class227.anInt2347 = 397871753 * i_180_;
			}
			if (Class227.anInt2347 * -1246131271 > i_180_) {
				Class227.anInt2347 -= ((Class316_Sub1.anInt9900 * 1564478433
						+ ((-1246131271 * Class227.anInt2347 - i_180_) * (-874739631 * VarDomainType.anInt4932) / 1000))
						* 397871753);
				if (Class227.anInt2347 * -1246131271 < i_180_)
					Class227.anInt2347 = 397871753 * i_180_;
			}
		}
		i = Class655.anInt8433 * -535394816 + 256;
		i_180_ = Class578.anInt7609 * -1678436864 + 256;
		i_181_ = (Class335_Sub1_Sub1.method10374(i, i_180_, (Class181_Sub5.anInt9778 * 1926870089), -759833206)
				- -1739906383 * Class249.anInt2780);
		int i_182_ = i - Class626.anInt8136 * -639218145;
		int i_183_ = i_181_ - 950408709 * Class137.anInt1630;
		int i_184_ = i_180_ - -1246131271 * Class227.anInt2347;
		int i_185_ = (int) Math.sqrt(i_182_ * i_182_ + i_184_ * i_184_);
		int i_186_ = ((int) (Math.atan2(i_183_, i_185_) * 2607.5945876176133) & 0x3fff);
		int i_187_ = ((int) (Math.atan2(i_182_, i_184_) * -2607.5945876176133) & 0x3fff);
		if (i_186_ < 1024)
			i_186_ = 1024;
		if (i_186_ > 3072)
			i_186_ = 3072;
		if (Class309_Sub1.anInt9907 * -499166573 < i_186_) {
			Class309_Sub1.anInt9907 += (2028903323 * ((((i_186_ - -499166573 * Class309_Sub1.anInt9907 >> 3)
					* (Class480.anInt5455 * -1329360119) / 1000) + Class215.anInt2272 * -362664325) << 3));
			if (-499166573 * Class309_Sub1.anInt9907 > i_186_)
				Class309_Sub1.anInt9907 = i_186_ * 2028903323;
		}
		if (-499166573 * Class309_Sub1.anInt9907 > i_186_) {
			Class309_Sub1.anInt9907 -= ((-362664325 * Class215.anInt2272 + (-1329360119 * Class480.anInt5455
					* (Class309_Sub1.anInt9907 * -499166573 - i_186_ >> 3) / 1000)) << 3) * 2028903323;
			if (-499166573 * Class309_Sub1.anInt9907 < i_186_)
				Class309_Sub1.anInt9907 = 2028903323 * i_186_;
		}
		int i_188_ = i_187_ - Class653.anInt8429 * 869770707;
		if (i_188_ > 8192)
			i_188_ -= 16384;
		if (i_188_ < -8192)
			i_188_ += 16384;
		i_188_ >>= 3;
		if (i_188_ > 0) {
			Class653.anInt8429 += ((i_188_ * (-1329360119 * Class480.anInt5455) / 1000
					+ Class215.anInt2272 * -362664325) << 3) * -1829176741;
			Class653.anInt8429 = (869770707 * Class653.anInt8429 & 0x3fff) * -1829176741;
		}
		if (i_188_ < 0) {
			Class653.anInt8429 -= ((-1329360119 * Class480.anInt5455 * -i_188_ / 1000
					+ -362664325 * Class215.anInt2272) << 3) * -1829176741;
			Class653.anInt8429 = (869770707 * Class653.anInt8429 & 0x3fff) * -1829176741;
		}
		int i_189_ = i_187_ - Class653.anInt8429 * 869770707;
		if (i_189_ > 8192)
			i_189_ -= 16384;
		if (i_189_ < -8192)
			i_189_ += 16384;
		if (i_189_ < 0 && i_188_ > 0 || i_189_ > 0 && i_188_ < 0)
			Class653.anInt8429 = i_187_ * -1829176741;
		Class48.anInt548 = 0;
	}

	public static final void method10219() {
		if (!aBool11187) {
			aFloat11037 += (12.0F - aFloat11037) / 2.0F;
			aBool10982 = true;
			aBool11187 = true;
		}
	}

	public static final void method10220() {
		if (!aBool11187) {
			aFloat11037 += (-12.0F - aFloat11037) / 2.0F;
			aBool10982 = true;
			aBool11187 = true;
		}
	}

	public static final void method10221() {
		if (!aBool10979) {
			aFloat10976 += (24.0F - aFloat10976) / 2.0F;
			aBool10982 = true;
			aBool10979 = true;
		}
	}

	public static final void method10222() {
		if (!aBool10979) {
			aFloat10976 += (24.0F - aFloat10976) / 2.0F;
			aBool10982 = true;
			aBool10979 = true;
		}
	}

	public static final void method10223() {
		if (!aBool10979) {
			aFloat10976 += (-24.0F - aFloat10976) / 2.0F;
			aBool10982 = true;
			aBool10979 = true;
		}
	}

	static final void method10224(int i) {
		int i_190_ = 1087758653 * GPI.localPlayerCount;
		int[] is = GPI.localPlayerIndicies;
		int[][] is_191_ = aClass495_10935.method6048(-1337300632);
		int[][] is_192_ = aClass495_10935.method6045(1620973475);
		int i_193_;
		if (0 == 345087519 * anInt10943)
			i_193_ = Class185.aClass182Array2106.length;
		else
			i_193_ = i_190_ + -2065344127 * anInt10922;
		for (int i_194_ = 0; i_194_ < i_193_; i_194_++) {
			Entity class645_sub1_sub5_sub1;
			if (345087519 * anInt10943 == 0) {
				Class182 class182 = Class185.aClass182Array2106[i_194_];
				if (!class182.aBool2097)
					continue;
				class645_sub1_sub5_sub1 = class182.method2689(-1012043543);
			} else {
				if (i_194_ < i_190_)
					class645_sub1_sub5_sub1 = localPlayers[is[i_194_]];
				else
					class645_sub1_sub5_sub1 = ((Entity) (((Class528_Sub31) aClass692_11110
							.method8137(anIntArray10923[(i_194_ - i_190_)])).anObject10468));
				if (class645_sub1_sub5_sub1.aByte10675 != i || class645_sub1_sub5_sub1.anInt11767 * -659687063 < 0
						|| class645_sub1_sub5_sub1.aBool11764)
					continue;
			}
			int i_195_ = class645_sub1_sub5_sub1.method10671((byte) -121);
			Class422 class422 = class645_sub1_sub5_sub1.method7693().aClass422_4868;
			if ((i_195_ & 0x1) == 0) {
				if (((int) class422.aFloat4780 & 0x1ff) != 0 || ((int) class422.aFloat4777 & 0x1ff) != 0)
					continue;
			} else if (256 != ((int) class422.aFloat4780 & 0x1ff) || 256 != ((int) class422.aFloat4777 & 0x1ff))
				continue;
			if (1 == i_195_) {
				int i_196_ = (int) class422.aFloat4780 >> 9;
				int i_197_ = (int) class422.aFloat4777 >> 9;
				if (class645_sub1_sub5_sub1.anInt11767 * -659687063 > is_191_[i_196_][i_197_]) {
					is_191_[i_196_][i_197_] = -659687063 * class645_sub1_sub5_sub1.anInt11767;
					is_192_[i_196_][i_197_] = 1;
				} else if (is_191_[i_196_][i_197_] == -659687063 * class645_sub1_sub5_sub1.anInt11767)
					is_192_[i_196_][i_197_]++;
			} else {
				int i_198_ = 60 + (i_195_ - 1) * 256;
				int i_199_ = (int) class422.aFloat4780 - i_198_ >> 9;
				int i_200_ = (int) class422.aFloat4777 - i_198_ >> 9;
				int i_201_ = (int) class422.aFloat4780 + i_198_ >> 9;
				int i_202_ = (int) class422.aFloat4777 + i_198_ >> 9;
				for (int i_203_ = i_199_; i_203_ <= i_201_; i_203_++) {
					for (int i_204_ = i_200_; i_204_ <= i_202_; i_204_++) {
						if (class645_sub1_sub5_sub1.anInt11767 * -659687063 > is_191_[i_203_][i_204_]) {
							is_191_[i_203_][i_204_] = (-659687063 * class645_sub1_sub5_sub1.anInt11767);
							is_192_[i_203_][i_204_] = 1;
						} else if ((class645_sub1_sub5_sub1.anInt11767 * -659687063) == is_191_[i_203_][i_204_])
							is_192_[i_203_][i_204_]++;
					}
				}
			}
		}
	}

	static final void method10225() {
		if (aFloat11002 < 1112.0F)
			aFloat11002 = 1112.0F;
		if (aFloat11002 > 3057.0F)
			aFloat11002 = 3057.0F;
		for (/**/; aFloat11088 >= 16384.0F; aFloat11088 -= 16384.0F) {
			/* empty */
		}
		for (/**/; aFloat11088 < 0.0F; aFloat11088 += 16384.0F) {
			/* empty */
		}
		Class466 class466 = aClass495_10935.method6006((byte) 0);
		Class538 class538 = aClass495_10935.method5973((byte) 76);
		int i = Class494.anInt5533 * -858645029 >> 9;
		int i_205_ = 593060725 * Class622.anInt8116 >> 9;
		int i_206_ = Class335_Sub1_Sub1.method10374(-858645029 * Class494.anInt5533, 593060725 * Class622.anInt8116,
				(1926870089 * Class181_Sub5.anInt9778), -759833206);
		int i_207_ = 0;
		if (i > 3 && i_205_ > 3 && i < aClass495_10935.method6029((short) 17970) - 4
				&& i_205_ < aClass495_10935.method5967(-289972898) - 4) {
			for (int i_208_ = i - 4; i_208_ <= 4 + i; i_208_++) {
				for (int i_209_ = i_205_ - 4; i_209_ <= 4 + i_205_; i_209_++) {
					int i_210_ = 1926870089 * Class181_Sub5.anInt9778;
					if (i_210_ < 3 && class466.method5633(i_208_, i_209_, (short) 15775))
						i_210_++;
					int i_211_ = 0;
					byte[][] is = aClass495_10935.method5974(i_210_, (byte) -2);
					if (is != null)
						i_211_ = 8 * (is[i_208_][i_209_] & 0xff) << 2;
					if (null != class538.aClass137Array7161 && null != class538.aClass137Array7161[i_210_]) {
						int i_212_ = (i_206_
								- (class538.aClass137Array7161[i_210_].method1669(i_208_, i_209_, (byte) 0) - i_211_));
						if (i_212_ > i_207_)
							i_207_ = i_212_;
					}
				}
			}
		}
		int i_213_ = 1536 * (i_207_ >> 2);
		if (i_213_ > 786432)
			i_213_ = 786432;
		if (i_213_ < 262144)
			i_213_ = 262144;
		if (i_213_ > 1320750875 * anInt10983)
			anInt10983 += (i_213_ - anInt10983 * 1320750875) / 24 * 1331475219;
		else if (i_213_ < 1320750875 * anInt10983)
			anInt10983 += (i_213_ - 1320750875 * anInt10983) / 80 * 1331475219;
	}

	public static final void method10226() {
		for (int i = 0; i < 5; i++)
			aBoolArray11139[i] = false;
		anInt11065 = -681116073;
		anInt10988 = 159441195;
		Class215.anInt2272 = 0;
		Class480.anInt5455 = 0;
		Class390.anInt4111 = 2086833802;
		if (Class372.method4679(-1926201990) == 6) {
			Class578 class578 = aClass495_10935.method5966(1273279609);
			int i = class578.anInt7607 * 961465569 << 9;
			int i_214_ = -173815201 * class578.anInt7608 << 9;
			int i_215_ = 1000 / Class262.method3646(-1969467661);
			Class495.aClass283_Sub1_5578.method3760(i_215_ / 1000.0F,
					(aClass495_10935.method6024(-765386834).anIntArrayArrayArray5087),
					aClass495_10935.method6006((byte) 0), i, i_214_, -2137352661);
		}
		Class386.anInt4069 = 1476949137;
		Class690_Sub2.anInt10780 = 1603116895;
		anInt11136 = anInt11127 * 243491283;
		Class210.anInt2244 = 781637499 * Class626.anInt8136;
		Class375.anInt3938 = -823559375 * Class137.anInt1630;
		Class29.anInt306 = Class227.anInt2347 * -1751109343;
		Class424.anInt4789 = Class309_Sub1.anInt9907 * 715063449;
		Class278.anInt3052 = 323440981 * Class653.anInt8429;
		Class295.anInt3236 = anInt11156 * 1053713531;
	}

	static final void method10227() {
		Class578 class578 = aClass495_10935.method5966(1273279609);
		Class422 class422 = Class495.aClass283_Sub1_5578.method3788((short) -16664);
		Class626.anInt8136 = ((int) class422.aFloat4780 - (class578.anInt7607 * 961465569 << 9)) * 1636412895;
		Class137.anInt1630 = 1124026061 * -(int) class422.aFloat4776;
		Class227.anInt2347 = ((int) class422.aFloat4777 - (class578.anInt7608 * -173815201 << 9)) * 397871753;
		Class309_Sub1.anInt9907 = ((int) (Class495.aClass283_Sub1_5578.method3791(1288554614) * 2607.5945876176133)
				& 0x3fff) * 2028903323;
		Class653.anInt8429 = ((int) (Class495.aClass283_Sub1_5578.method3792(-16777216) * 2607.5945876176133) & 0x3fff)
				* -1829176741;
		Class48.anInt548 = 0;
	}

	static final void method10228() {
		Class39.method811(aClass229_11067, 1435904523);
		ItemType.anInt104 += 10694151;
		if (!aBool10890 || !aBool11041) {
			if (-1758535753 * ItemType.anInt104 > 1) {
				aClass229_11067 = null;
				aClass229_10987 = null;
			}
		} else {
			int i = Class95_Sub1_Sub2.aClass537_11200.method6507(-1316251710);
			int i_216_ = Class95_Sub1_Sub2.aClass537_11200.method6504((byte) 34);
			i -= anInt11069 * -62197331;
			i_216_ -= -525017675 * anInt11070;
			if (i < -208716081 * anInt11073)
				i = -208716081 * anInt11073;
			if (i + aClass229_11067.anInt2476 * -1352480433 > -208716081 * anInt11073 + 506740607 * anInt11075)
				i = (-208716081 * anInt11073 + 506740607 * anInt11075 - -1352480433 * aClass229_11067.anInt2476);
			if (i_216_ < -255571367 * anInt11074)
				i_216_ = anInt11074 * -255571367;
			if (i_216_ + aClass229_11067.anInt2458 * 1661025435 > -1525398647 * anInt11076 + -255571367 * anInt11074)
				i_216_ = (anInt11074 * -255571367 + anInt11076 * -1525398647 - 1661025435 * aClass229_11067.anInt2458);
			int i_217_;
			int i_218_;
			if (Class137.aClass229_1632 == aClass229_10987) {
				i_217_ = i;
				i_218_ = i_216_;
			} else {
				i_217_ = (i - anInt11073 * -208716081 + aClass229_10987.anInt2400 * -1014124179);
				i_218_ = (1665217863 * aClass229_10987.anInt2401 + (i_216_ - -255571367 * anInt11074));
			}
			if (!Class95_Sub1_Sub2.aClass537_11200.method6502(-670475408)) {
				if (aBool11055) {
					Class7.method565(-1187426900);
					if (null != aClass229_11067.anObjectArray2493) {
						Class528_Sub30 class528_sub30 = new Class528_Sub30();
						class528_sub30.aClass229_10461 = aClass229_11067;
						class528_sub30.anInt10459 = -391683557 * i_217_;
						class528_sub30.anInt10464 = 388878445 * i_218_;
						Class229 class229 = method10202(aClass229_11067);
						Class229 class229_219_ = aClass229_11071;
						boolean bool = false;
						for (/**/; (class229_219_ != null && -1 != -1027873541 * class229_219_.anInt2522
								&& null != class229); class229_219_ = (Class380.aClass226Array3970[class229_219_.anInt2376
										* 306930455 >> 16].aClass229Array2336[(class229_219_.anInt2522 * -1027873541
												& 0xffff)])) {
							if (306930455 * class229_219_.anInt2376 == 306930455 * class229.anInt2376) {
								bool = true;
								break;
							}
						}
						if (class229_219_ != null && null != class229 && Class137.aClass229_1632 != class229 && !bool)
							class528_sub30.aClass229_10463 = Class137.aClass229_1632;
						else
							class528_sub30.aClass229_10463 = aClass229_11071;
						class528_sub30.anObjectArray10460 = aClass229_11067.anObjectArray2493;
						Class555.method6741(class528_sub30, (short) 22179);
					}
					if (aClass229_11071 != null && method10202(aClass229_11067) != null)
						Class242.method3378(aClass229_11067, aClass229_11071, -520794877);
				} else if ((-1046544163 * anInt11046 == 1 || Class552.method6715(717927929))
						&& -1024340783 * Class28.anInt303 > 2)
					Class5_Sub18.method10185((-483492961 * anInt11078 + anInt11069 * -62197331),
							(anInt11070 * -525017675 + -1428876217 * anInt11079), (byte) -54);
				else if (Class71.method1096((byte) 98))
					Class5_Sub18.method10185((-62197331 * anInt11069 + anInt11078 * -483492961),
							(-1428876217 * anInt11079 + anInt11070 * -525017675), (byte) 83);
				aClass229_11067 = null;
				aClass229_10987 = null;
			} else {
				if (-1758535753 * ItemType.anInt104 > aClass229_11067.anInt2480 * 1823380081) {
					int i_220_ = i - anInt11078 * -483492961;
					int i_221_ = i_216_ - -1428876217 * anInt11079;
					if (i_220_ > aClass229_11067.anInt2510 * 325431661
							|| i_220_ < -(325431661 * aClass229_11067.anInt2510)
							|| i_221_ > aClass229_11067.anInt2510 * 325431661
							|| i_221_ < -(325431661 * aClass229_11067.anInt2510))
						aBool11055 = true;
				}
				if (aClass229_11067.anObjectArray2501 != null && aBool11055) {
					Class528_Sub30 class528_sub30 = new Class528_Sub30();
					class528_sub30.aClass229_10461 = aClass229_11067;
					class528_sub30.anInt10459 = -391683557 * i_217_;
					class528_sub30.anInt10464 = i_218_ * 388878445;
					class528_sub30.anObjectArray10460 = aClass229_11067.anObjectArray2501;
					Class555.method6741(class528_sub30, (short) 16086);
				}
			}
		}
	}

	static final void method10229() {
		Class691_Sub15.method9947(Class587.aClass173_7714, anInt11127);
		if (2088127151 * anInt10978 != -1)
			Class97.method1291(2088127151 * anInt10978, (short) 16384);
		for (int i = 0; i < -230570629 * anInt11114; i++) {
			aBoolArray10952[i] = aBoolArray10855[i];
			aBoolArray10855[i] = false;
		}
		anInt11115 = -127449715 * anInt11127;
		if (anInt10978 * 2088127151 != -1) {
			anInt11114 = 0;
			Class476.method5836((short) 716);
		}
		Class587.aClass173_7714.method2203();
		ProtocolLoop.method1060(Class587.aClass173_7714, 1464766604);
		int i = Class526.method6413(596804263);
		if (i == -1)
			i = -1902678583 * anInt11048;
		if (-1 == i)
			i = 960030115 * anInt11047;
		Class89.method1209(i, 732590428);
		anInt10971 = 0;
	}

	static final void method10230() {
		int i = 0;
		Class538 class538 = aClass495_10935.method5973((byte) 99);
		for (int i_222_ = 0; i_222_ < aClass495_10935.method6029((short) 16238); i_222_++) {
			for (int i_223_ = 0; i_223_ < aClass495_10935.method5967(1661738510); i_223_++) {
				if (Class209.method2945(class538.aClass546ArrayArrayArray7160, i, i_222_, i_223_, true, 2063494646))
					i++;
				if (i >= 512)
					return;
			}
		}
	}

	static final void method10231() {
		Class691_Sub15.method9947(Class587.aClass173_7714, anInt11127);
		if (2088127151 * anInt10978 != -1)
			Class97.method1291(2088127151 * anInt10978, (short) 16384);
		for (int i = 0; i < -230570629 * anInt11114; i++) {
			aBoolArray10952[i] = aBoolArray10855[i];
			aBoolArray10855[i] = false;
		}
		anInt11115 = -127449715 * anInt11127;
		if (anInt10978 * 2088127151 != -1) {
			anInt11114 = 0;
			Class476.method5836((short) 716);
		}
		Class587.aClass173_7714.method2203();
		ProtocolLoop.method1060(Class587.aClass173_7714, 1796384366);
		int i = Class526.method6413(1321981983);
		if (i == -1)
			i = -1902678583 * anInt11048;
		if (-1 == i)
			i = 960030115 * anInt11047;
		Class89.method1209(i, 131454408);
		anInt10971 = 0;
	}

	static final void method10232() {
		for (Class511_Sub1 class511_sub1 = (Class511_Sub1) aClass695_11000
				.method8179((short) 653); null != class511_sub1; class511_sub1 = (Class511_Sub1) aClass695_11000
						.method8179((short) 653))
			Class503.method6116(class511_sub1, 536300132);
		int i = 0;
		int i_224_ = 3;
		if (anInt10943 * 345087519 == 0) {
			for (int i_225_ = i; i_225_ <= i_224_; i_225_++)
				method10197(i_225_);
			method10199();
		} else {
			method10195();
			for (int i_226_ = i; i_226_ <= i_224_; i_226_++) {
				method10196();
				method10224(i_226_);
				method10197(i_226_);
			}
			method10198();
			method10199();
		}
	}

	static final void method10233() {
		for (Class511_Sub1 class511_sub1 = (Class511_Sub1) aClass695_11000
				.method8179((short) 653); null != class511_sub1; class511_sub1 = (Class511_Sub1) aClass695_11000
						.method8179((short) 653))
			Class503.method6116(class511_sub1, 536300132);
		int i = 0;
		int i_227_ = 3;
		if (anInt10943 * 345087519 == 0) {
			for (int i_228_ = i; i_228_ <= i_227_; i_228_++)
				method10197(i_228_);
			method10199();
		} else {
			method10195();
			for (int i_229_ = i; i_229_ <= i_227_; i_229_++) {
				method10196();
				method10224(i_229_);
				method10197(i_229_);
			}
			method10198();
			method10199();
		}
	}

	static final void method10234() {
		int[][] is = aClass495_10935.method6048(184901907);
		int i = aClass495_10935.method6029((short) 12163);
		int i_230_ = aClass495_10935.method5967(-454630624);
		for (int i_231_ = 0; i_231_ < i; i_231_++) {
			int[] is_232_ = is[i_231_];
			for (int i_233_ = 0; i_233_ < i_230_; i_233_++)
				is_232_[i_233_] = 0;
		}
	}

	static final void method10235() {
		anInt10999 = 0;
		for (int i = 0; i < -2065344127 * anInt10922; i++) {
			NPC class645_sub1_sub5_sub1_sub1 = ((NPC) (((Class528_Sub31) aClass692_11110
					.method8137(anIntArray10923[i])).anObject10468));
			if (class645_sub1_sub5_sub1_sub1.aBool11763
					&& (class645_sub1_sub5_sub1_sub1.method10703(-1981595227) != -1)) {
				int i_234_ = ((class645_sub1_sub5_sub1_sub1.method10671((byte) -77) - 1) * 256 + 252);
				Class422 class422 = class645_sub1_sub5_sub1_sub1.method7693().aClass422_4868;
				int i_235_ = (int) class422.aFloat4780 - i_234_ >> 9;
				int i_236_ = (int) class422.aFloat4777 - i_234_ >> 9;
				Entity class645_sub1_sub5_sub1 = Class603.method7186((class645_sub1_sub5_sub1_sub1.aByte10675), i_235_,
						i_236_, 1140228770);
				if (null != class645_sub1_sub5_sub1) {
					int i_237_ = class645_sub1_sub5_sub1.anInt11783 * -34811601;
					if (class645_sub1_sub5_sub1 instanceof NPC)
						i_237_ += 2048;
					if (0 == -1300481619 * class645_sub1_sub5_sub1.anInt11817
							&& (class645_sub1_sub5_sub1.method10703(-907965991) != -1)) {
						anIntArray10997[anInt10999 * 1154356499] = i_237_;
						anIntArray10950[anInt10999 * 1154356499] = i_237_;
						anInt10999 += -1127154405;
						class645_sub1_sub5_sub1.anInt11817 += 1789104677;
					}
					anIntArray10997[anInt10999 * 1154356499] = i_237_;
					anIntArray10950[1154356499 * anInt10999] = (class645_sub1_sub5_sub1_sub1.anInt11783 * -34811601
							+ 2048);
					anInt10999 += -1127154405;
					class645_sub1_sub5_sub1.anInt11817 += 1789104677;
				}
			}
		}
		Class464.method5610(anIntArray10950, anIntArray10997, 0, anInt10999 * 1154356499 - 1, 1573605627);
	}

	static final void method10236() {
		for (Class528_Sub21_Sub10 class528_sub21_sub10 = ((Class528_Sub21_Sub10) aClass688_11043.method8034(
				2119089057)); null != class528_sub21_sub10; class528_sub21_sub10 = ((Class528_Sub21_Sub10) aClass688_11043
						.method8037(-1892248646))) {
			Class645_Sub1_Sub5_Sub6 class645_sub1_sub5_sub6 = (class528_sub21_sub10.aClass645_Sub1_Sub5_Sub6_11583);
			if (anInt11127 > class645_sub1_sub5_sub6.anInt12008 * -108038505) {
				class528_sub21_sub10.method6443(874884727);
				class645_sub1_sub5_sub6.method10885(-977882301);
			} else if (anInt11127 >= class645_sub1_sub5_sub6.anInt12011 * -39303101) {
				class645_sub1_sub5_sub6.method10880(-841276340);
				if (class645_sub1_sub5_sub6.anInt12016 * 1063966653 > 0) {
					if (0 == anInt10943 * 345087519) {
						Entity class645_sub1_sub5_sub1 = Class185.aClass182Array2106[(class645_sub1_sub5_sub6.anInt12016
								* 1063966653) - 1].method2689(-1012043543);
						if (null != class645_sub1_sub5_sub1) {
							Class422 class422 = (class645_sub1_sub5_sub1.method7693().aClass422_4868);
							if ((int) class422.aFloat4780 >= 0
									&& ((int) class422.aFloat4780 < (aClass495_10935.method6029((short) 4176) * 512))
									&& (int) class422.aFloat4777 >= 0
									&& ((int) class422.aFloat4777 < (aClass495_10935.method5967(559246286) * 512)))
								class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780,
										(int) class422.aFloat4777,
										((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
												(int) class422.aFloat4777, class645_sub1_sub5_sub1.aByte10675,
												-759833206)) - 1004576393 * (class645_sub1_sub5_sub6.anInt12026)),
										anInt11127, 1849455461);
						}
					} else {
						Class528_Sub31 class528_sub31 = ((Class528_Sub31) (aClass692_11110
								.method8137((1063966653 * class645_sub1_sub5_sub6.anInt12016) - 1)));
						if (null != class528_sub31) {
							NPC class645_sub1_sub5_sub1_sub1 = ((NPC) class528_sub31.anObject10468);
							Class422 class422 = (class645_sub1_sub5_sub1_sub1.method7693().aClass422_4868);
							if ((int) class422.aFloat4780 >= 0
									&& ((int) class422.aFloat4780 < (aClass495_10935.method6029((short) 1172) * 512))
									&& (int) class422.aFloat4777 >= 0
									&& ((int) class422.aFloat4777 < (aClass495_10935.method5967(1702207332) * 512)))
								class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780,
										(int) class422.aFloat4777,
										((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
												(int) class422.aFloat4777, class645_sub1_sub5_sub6.aByte10675,
												-759833206)) - (class645_sub1_sub5_sub6.anInt12026 * 1004576393)),
										anInt11127, -333385399);
						}
					}
				}
				if (1063966653 * class645_sub1_sub5_sub6.anInt12016 < 0) {
					int i = (-(class645_sub1_sub5_sub6.anInt12016 * 1063966653) - 1);
					Player class645_sub1_sub5_sub1_sub2;
					if (-1453744879 * anInt11025 == i)
						class645_sub1_sub5_sub1_sub2 = Class108.myPlayer;
					else
						class645_sub1_sub5_sub1_sub2 = localPlayers[i];
					if (class645_sub1_sub5_sub1_sub2 != null) {
						Class422 class422 = (class645_sub1_sub5_sub1_sub2.method7693().aClass422_4868);
						if ((int) class422.aFloat4780 >= 0
								&& ((int) class422.aFloat4780 < (aClass495_10935.method6029((short) 2848) * 512))
								&& (int) class422.aFloat4777 >= 0
								&& ((int) class422.aFloat4777 < (aClass495_10935.method5967(-372828222) * 512)))
							class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780, (int) class422.aFloat4777,
									((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
											(int) class422.aFloat4777, class645_sub1_sub5_sub6.aByte10675, -759833206))
											- (class645_sub1_sub5_sub6.anInt12026 * 1004576393)),
									anInt11127, 702278696);
					}
				}
				class645_sub1_sub5_sub6.method10881(-178309515 * anInt10971, -249130077);
				aClass495_10935.method5973((byte) 83).method6545(class645_sub1_sub5_sub6, true, 1699596336);
			}
		}
	}

	static final void method10237() {
		for (Class528_Sub21_Sub10 class528_sub21_sub10 = ((Class528_Sub21_Sub10) aClass688_11043.method8034(
				1696294297)); null != class528_sub21_sub10; class528_sub21_sub10 = ((Class528_Sub21_Sub10) aClass688_11043
						.method8037(-1519180002))) {
			Class645_Sub1_Sub5_Sub6 class645_sub1_sub5_sub6 = (class528_sub21_sub10.aClass645_Sub1_Sub5_Sub6_11583);
			if (anInt11127 > class645_sub1_sub5_sub6.anInt12008 * -108038505) {
				class528_sub21_sub10.method6443(1436483489);
				class645_sub1_sub5_sub6.method10885(-977882301);
			} else if (anInt11127 >= class645_sub1_sub5_sub6.anInt12011 * -39303101) {
				class645_sub1_sub5_sub6.method10880(-1729721668);
				if (class645_sub1_sub5_sub6.anInt12016 * 1063966653 > 0) {
					if (0 == anInt10943 * 345087519) {
						Entity class645_sub1_sub5_sub1 = Class185.aClass182Array2106[(class645_sub1_sub5_sub6.anInt12016
								* 1063966653) - 1].method2689(-1012043543);
						if (null != class645_sub1_sub5_sub1) {
							Class422 class422 = (class645_sub1_sub5_sub1.method7693().aClass422_4868);
							if ((int) class422.aFloat4780 >= 0
									&& ((int) class422.aFloat4780 < (aClass495_10935.method6029((short) 4528) * 512))
									&& (int) class422.aFloat4777 >= 0
									&& ((int) class422.aFloat4777 < (aClass495_10935.method5967(1630342644) * 512)))
								class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780,
										(int) class422.aFloat4777,
										((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
												(int) class422.aFloat4777, class645_sub1_sub5_sub1.aByte10675,
												-759833206)) - 1004576393 * (class645_sub1_sub5_sub6.anInt12026)),
										anInt11127, -1839181346);
						}
					} else {
						Class528_Sub31 class528_sub31 = ((Class528_Sub31) (aClass692_11110
								.method8137((1063966653 * class645_sub1_sub5_sub6.anInt12016) - 1)));
						if (null != class528_sub31) {
							NPC class645_sub1_sub5_sub1_sub1 = ((NPC) class528_sub31.anObject10468);
							Class422 class422 = (class645_sub1_sub5_sub1_sub1.method7693().aClass422_4868);
							if ((int) class422.aFloat4780 >= 0
									&& ((int) class422.aFloat4780 < (aClass495_10935.method6029((short) 8221) * 512))
									&& (int) class422.aFloat4777 >= 0
									&& ((int) class422.aFloat4777 < (aClass495_10935.method5967(2113774054) * 512)))
								class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780,
										(int) class422.aFloat4777,
										((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
												(int) class422.aFloat4777, class645_sub1_sub5_sub6.aByte10675,
												-759833206)) - (class645_sub1_sub5_sub6.anInt12026 * 1004576393)),
										anInt11127, 229332331);
						}
					}
				}
				if (1063966653 * class645_sub1_sub5_sub6.anInt12016 < 0) {
					int i = (-(class645_sub1_sub5_sub6.anInt12016 * 1063966653) - 1);
					Player class645_sub1_sub5_sub1_sub2;
					if (-1453744879 * anInt11025 == i)
						class645_sub1_sub5_sub1_sub2 = Class108.myPlayer;
					else
						class645_sub1_sub5_sub1_sub2 = localPlayers[i];
					if (class645_sub1_sub5_sub1_sub2 != null) {
						Class422 class422 = (class645_sub1_sub5_sub1_sub2.method7693().aClass422_4868);
						if ((int) class422.aFloat4780 >= 0
								&& ((int) class422.aFloat4780 < (aClass495_10935.method6029((short) 5042) * 512))
								&& (int) class422.aFloat4777 >= 0
								&& ((int) class422.aFloat4777 < aClass495_10935.method5967(795196264) * 512))
							class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780, (int) class422.aFloat4777,
									((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
											(int) class422.aFloat4777, class645_sub1_sub5_sub6.aByte10675, -759833206))
											- (class645_sub1_sub5_sub6.anInt12026 * 1004576393)),
									anInt11127, -1405955825);
					}
				}
				class645_sub1_sub5_sub6.method10881(-178309515 * anInt10971, 298572037);
				aClass495_10935.method5973((byte) 4).method6545(class645_sub1_sub5_sub6, true, 1482112743);
			}
		}
	}

	static final void method10238() {
		Iterator iterator = aClass692_11044.iterator();
		while (iterator.hasNext()) {
			Class528_Sub21_Sub19 class528_sub21_sub19 = (Class528_Sub21_Sub19) iterator.next();
			Class645_Sub1_Sub5_Sub4 class645_sub1_sub5_sub4 = (class528_sub21_sub19.aClass645_Sub1_Sub5_Sub4_11688);
			class645_sub1_sub5_sub4.method10847(1, -1456255122);
			if (class645_sub1_sub5_sub4.method10849((byte) -104)) {
				class528_sub21_sub19.method6443(577871211);
				class645_sub1_sub5_sub4.method10848(-654501504);
			}
		}
	}

	static final void method10239() {
		Iterator iterator = aClass692_11044.iterator();
		while (iterator.hasNext()) {
			Class528_Sub21_Sub19 class528_sub21_sub19 = (Class528_Sub21_Sub19) iterator.next();
			Class645_Sub1_Sub5_Sub4 class645_sub1_sub5_sub4 = (class528_sub21_sub19.aClass645_Sub1_Sub5_Sub4_11688);
			class645_sub1_sub5_sub4.method10847(1, -370590756);
			if (class645_sub1_sub5_sub4.method10849((byte) -3)) {
				class528_sub21_sub19.method6443(-1918455222);
				class645_sub1_sub5_sub4.method10848(-918436174);
			}
		}
	}

	static final void method10240() {
		Iterator iterator = aClass692_11044.iterator();
		while (iterator.hasNext()) {
			Class528_Sub21_Sub19 class528_sub21_sub19 = (Class528_Sub21_Sub19) iterator.next();
			Class645_Sub1_Sub5_Sub4 class645_sub1_sub5_sub4 = (class528_sub21_sub19.aClass645_Sub1_Sub5_Sub4_11688);
			class645_sub1_sub5_sub4.method10847(1, -855440921);
			if (class645_sub1_sub5_sub4.method10849((byte) -128)) {
				class528_sub21_sub19.method6443(-1875985279);
				class645_sub1_sub5_sub4.method10848(-2096264543);
			}
		}
	}

	@Override
	final void method6229() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class137.aClass229_1632 = new Class229();
		Class206.method2921(242792834);
		Class257.method3471(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 },
				new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, 1965300722);
		Class422.method5099(100);
		Class430.method5200(10);
		Class311.method4141(100, -2083086756);
		Class380.method4719(100, -993497119);
		if (ModeWhere.LIVE != Class646.aClass665_8386)
			Class58.aByteArrayArray707 = new byte[50][];
		Class514.aClass528_Sub38_6967 = Class67.method1068(-585965780);
		if (Class514.aClass528_Sub38_6967.aClass691_Sub31_10602.method10076(-740804623) == 1)
			Class538.aBool7171 = false;
		switch (Class514.aClass528_Sub38_6967.aClass691_Sub33_10560.method10104(1310588954)) {
		case 4:
			Class97.aBool1238 = true;
			Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub33_10560), 0,
					-16576899);
			Class5_Sub1.method10057(Class50.aClass50_563, 1956609951);
			break;
		default:
			break;
		case 3:
			Class97.aBool1237 = true;
			Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967.aClass691_Sub33_10560), 0,
					1017240439);
			Class5_Sub1.method10057(Class50.aClass50_567, 1211316711);
		}
		if (null == Class12.aClass16_182.aString194)
			Class12.aClass16_182.aString194 = Class196.anApplet2198.getCodeBase().getHost();
		Class12.aClass16_176 = Class12.aClass16_182;
		Class557.aClass455_7466 = new Class455();
		Class700.aClass454_8734 = new Class454_Sub1();
		Class624.aClass449_8128 = new Class449(Class12.aClass16_175.aString194,
				-1255012695 * Class12.aClass16_175.anInt193, -352215983 * aClass673_11108.anInt8535);
		if (Class673.aClass673_8529 == aClass673_11108)
			aBool10894 = false;
		Class596.aShortArray7842 = Class299.aShortArray3324 = ItemType.aShortArray30 = new short[256];
		try {
			Class141_Sub1.aClipboard8801 = Class465.method5625(312287159).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class416.aClass544_4749 = Class542.method6627(Class64.aCanvas754, 832048346);
		Class95_Sub1_Sub2.aClass537_11200 = Class259.method3579(Class64.aCanvas754, true, 750614076);
		if (aClass22_6948 != null)
			Class671.aClass539_8527 = new Class539(255, aClass22_6948, aClass22_6959, 2000000);
		Class495.aClass283_Sub1_5578 = new Class283_Sub1(aClass31_11137);
		try {
			Class495.aClass283_Sub1_5578.method3826(Class280.aClass280_3062, 58384044);
			Class495.aClass283_Sub1_5578.method3763(Class297.aClass297_3255, false, 418180115);
			Class495.aClass283_Sub1_5578.method3831(Class294.aClass294_3226, false, -1233548345);
			Class495.aClass283_Sub1_5578.method3763(Class297.aClass297_3255, false, -1782190276);
			Class495.aClass283_Sub1_5578.method3771(Class422.method5051(99999.0F, 99999.0F, 99999.0F), 422909548);
			Class495.aClass283_Sub1_5578.method3768(
					Class422.method5051(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY),
					(byte) 58);
			Class495.aClass283_Sub1_5578.method3818(Class422.method5051(99999.0F, 99999.0F, 99999.0F), 825380969);
			Class495.aClass283_Sub1_5578.method3767(
					Class422.method5051(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY),
					-283647197);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
		Class555.method6746(Class196.anApplet2198, Class312.aString3440, 1406272237);
		if (ModeWhere.LIVE != Class646.aClass665_8386 && ModeWhere.aClass665_8470 != Class646.aClass665_8386)
			aBool10887 = true;
		aString6922 = Class39.aClass39_439.method807(Class378_Sub2.aClass668_10123, (byte) 102);
		Class590.aClass488_7736 = new Class488();
		new Thread(Class590.aClass488_7736).start();
		Class499.aClass40_6844 = new Class40();
		Class96.aClass259_1226 = new Class259();
	}

	static final void method10241() {
		Iterator iterator = aClass692_11044.iterator();
		while (iterator.hasNext()) {
			Class528_Sub21_Sub19 class528_sub21_sub19 = (Class528_Sub21_Sub19) iterator.next();
			Class645_Sub1_Sub5_Sub4 class645_sub1_sub5_sub4 = (class528_sub21_sub19.aClass645_Sub1_Sub5_Sub4_11688);
			if (aClass495_10935.method5973((byte) 49) != null && class645_sub1_sub5_sub4.method10859(-1864395182))
				aClass495_10935.method5973((byte) 86).method6545(class645_sub1_sub5_sub4, true, 2009092968);
		}
	}

	@Override
	final void method6206(int i) {
		if (175711435 * anInt10876 != 3) {
			long l = (Class376.method4694((byte) 32) / 1000000L - aLong11068 * -302427645888646523L);
			aLong11068 = (Class376.method4694((byte) 29) / 1000000L * 3582591739889808973L);
			if (Class498.method6069(175711435 * anInt10876, 1486533655)) {
				if (-7428808465316354023L * aLong11017 != 0L
						&& (Class249.method3417(2146634433) > aLong11017 * -7428808465316354023L))
					Class289.method3875(Class377.method4705(-1646448758), -1, -1, false, 2130003981);
				else if (!Class587.aClass173_7714.method2161() && aBool6923)
					Class277.method3722((byte) 1);
			}
			if (null == Class207.aFrame2236)
				Class696.method8190(-378906900);
			if (Class700.aBool8733 && null != Class207.aFrame2236 && !Class395.aBool4154
					&& Class498.method6069(175711435 * anInt10876, 1331313444))
				Class289.method3875(Class514.aClass528_Sub38_6967.aClass691_Sub3_10593.method9844((byte) 18), -1, -1,
						false, 2130003981);
			boolean bool = false;
			if (aBool6934) {
				aBool6934 = false;
				bool = true;
			}
			if (bool)
				Class162.method2068((byte) 2);
			if ((Class587.aClass173_7714 != null && Class587.aClass173_7714.method2161())
					|| Class377.method4705(187144484) != 1)
				PlayerModel.method7298(-471000260);
			if (Class539.method6615(175711435 * anInt10876, -2113895115))
				Class215.method3011(bool, -1005216973);
			else if (Class647.method7711(anInt10876 * 175711435, (byte) 2))
				Class221.method3152(639747877);
			else if (Class462.method5589(175711435 * anInt10876, 1441061717))
				Class221.method3152(1449299144);
			else if (Class667.method7910(175711435 * anInt10876, -467607749)) {
				if (aClass495_10935.method5963(-1545330493) == Class481.aClass481_5456) {
					int i_238_ = aClass495_10935.method5964(717927929) / 2;
					Class691_Sub18
							.method9964(
									new StringBuilder()
											.append(Class39.aClass39_439.method807((Class378_Sub2.aClass668_10123),
													(byte) 102))
											.append(Class49.aString554).append("(").append(i_238_).append("%)")
											.toString(),
									true, Class587.aClass173_7714, Class191.aClass172_2171, Class27.aClass1_253,
									-433589172);
				} else if (aClass495_10935.method5963(25085204) == Class481.aClass481_5458) {
					int i_239_ = 50 + aClass495_10935.method5965((byte) -120) / 2;
					Class691_Sub18
							.method9964(
									new StringBuilder()
											.append(Class39.aClass39_439.method807((Class378_Sub2.aClass668_10123),
													(byte) 102))
											.append(Class49.aString554).append("(").append(i_239_).append("%)")
											.toString(),
									true, Class587.aClass173_7714, Class191.aClass172_2171, Class27.aClass1_253,
									-479529224);
				} else
					Class691_Sub18.method9964(
							(Class39.aClass39_439.method807(Class378_Sub2.aClass668_10123, (byte) 102)), true,
							Class587.aClass173_7714, Class191.aClass172_2171, Class27.aClass1_253, -453895465);
			} else if (9 == 175711435 * anInt10876)
				Class142_Sub2.method8323(l);
			else if (17 == 175711435 * anInt10876)
				Class691_Sub18
						.method9964(
								new StringBuilder()
										.append(Class39.aClass39_441
												.method807((Class378_Sub2.aClass668_10123), (byte) 102))
										.append(Class49.aString554)
										.append(Class39.aClass39_442.method807((Class378_Sub2.aClass668_10123),
												(byte) 102))
										.toString(),
								false, Class587.aClass173_7714, Class191.aClass172_2171, Class27.aClass1_253,
								1693514350);
			else if (anInt10876 * 175711435 == 7)
				Class691_Sub18.method9964(Class39.aClass39_414.method807(Class378_Sub2.aClass668_10123, (byte) 102),
						false, Class587.aClass173_7714, Class191.aClass172_2171, Class27.aClass1_253, 654780973);
			if (3 == anInt11119 * -335828689) {
				for (int i_240_ = 0; i_240_ < anInt11114 * -230570629; i_240_++) {
					Rectangle rectangle = aRectangleArray11090[i_240_];
					if (aBoolArray10952[i_240_])
						Class587.aClass173_7714.method2206(rectangle.x, rectangle.y, rectangle.width, rectangle.height,
								-65281, -1340546305);
					else
						Class587.aClass173_7714.method2206(rectangle.x, rectangle.y, rectangle.width, rectangle.height,
								-16711936, -1683528155);
				}
			}
			if (Class194.method2812(1439800124))
				Class586.method7013(Class587.aClass173_7714, (byte) 41);
			if (!Class539.method6615(anInt10876 * 175711435, -1951334999)
					&& !Class667.method7910(175711435 * anInt10876, 215783701) && -1 != anInt10978 * 2088127151) {
				try {
					Class587.aClass173_7714.method2235();
					Class16.method640(Class587.aClass173_7714, Class249.method3417(2023936543),
							Class411.anInt4713 * -1117838587, -2142152407 * anInt6933, (byte) -74);
					Class587.aClass173_7714.method2273(1956128100);
				} catch (Exception_Sub5 exception_sub5) {
					VarDomainType.method5340(new StringBuilder().append(exception_sub5.getMessage()).append(" ")
							.append(method6214(-536611172)).toString(), exception_sub5, 1853809027);
					switch (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594.method10014(-1824619963)) {
					default:
						Class186.method2754(0, false, 381199535);
						break;
					case 3:
						HandshakeOpcode.method4863(exception_sub5.method10324(-52499355), -6904713);
						Class186.method2754(1, false, 1474911029);
					}
				}
			}
			int i_241_ = Class514.aClass528_Sub38_6967.aClass691_Sub32_10598.method10100((byte) 1);
			if (i_241_ == 0)
				Class511_Sub1.method9241(15L);
			else if (1 == i_241_)
				Class511_Sub1.method9241(10L);
			else if (i_241_ == 2)
				Class511_Sub1.method9241(5L);
			else if (3 == i_241_)
				Class511_Sub1.method9241(2L);
			if (aBool10892)
				Class225.method3174(-352364399);
			if (Class514.aClass528_Sub38_6967.aClass691_Sub33_10560.method10104(1369684923) == 1
					&& 8 == 175711435 * anInt10876 && 2088127151 * anInt10978 != -1) {
				Class514.aClass528_Sub38_6967.method9556(Class514.aClass528_Sub38_6967.aClass691_Sub33_10560, 0,
						2140832698);
				Class243.method3387(2143142984);
			}
		}
	}

	@Override
	final void method6200() {
		if (175711435 * anInt10876 != 3) {
			long l = (Class376.method4694((byte) -5) / 1000000L - aLong11068 * -302427645888646523L);
			aLong11068 = (Class376.method4694((byte) 75) / 1000000L * 3582591739889808973L);
			if (Class498.method6069(175711435 * anInt10876, 2100628701)) {
				if (-7428808465316354023L * aLong11017 != 0L
						&& (Class249.method3417(2031502352) > aLong11017 * -7428808465316354023L))
					Class289.method3875(Class377.method4705(787290774), -1, -1, false, 2130003981);
				else if (!Class587.aClass173_7714.method2161() && aBool6923)
					Class277.method3722((byte) 1);
			}
			if (null == Class207.aFrame2236)
				Class696.method8190(-2117811813);
			if (Class700.aBool8733 && null != Class207.aFrame2236 && !Class395.aBool4154
					&& Class498.method6069(175711435 * anInt10876, -263950511))
				Class289.method3875(Class514.aClass528_Sub38_6967.aClass691_Sub3_10593.method9844((byte) 42), -1, -1,
						false, 2130003981);
			boolean bool = false;
			if (aBool6934) {
				aBool6934 = false;
				bool = true;
			}
			if (bool)
				Class162.method2068((byte) 2);
			if ((Class587.aClass173_7714 != null && Class587.aClass173_7714.method2161())
					|| Class377.method4705(353255190) != 1)
				PlayerModel.method7298(945637861);
			if (Class539.method6615(175711435 * anInt10876, -2005215561))
				Class215.method3011(bool, -1511428522);
			else if (Class647.method7711(anInt10876 * 175711435, (byte) 2))
				Class221.method3152(779932120);
			else if (Class462.method5589(175711435 * anInt10876, 504946262))
				Class221.method3152(58778717);
			else if (Class667.method7910(175711435 * anInt10876, 682870518)) {
				if (aClass495_10935.method5963(1481737500) == Class481.aClass481_5456) {
					int i = aClass495_10935.method5964(717927929) / 2;
					Class691_Sub18
							.method9964(
									new StringBuilder()
											.append(Class39.aClass39_439.method807((Class378_Sub2.aClass668_10123),
													(byte) 102))
											.append(Class49.aString554).append("(").append(i).append("%)").toString(),
									true, Class587.aClass173_7714, Class191.aClass172_2171, Class27.aClass1_253,
									992815201);
				} else if (aClass495_10935.method5963(999044323) == Class481.aClass481_5458) {
					int i = 50 + aClass495_10935.method5965((byte) -78) / 2;
					Class691_Sub18
							.method9964(
									new StringBuilder()
											.append(Class39.aClass39_439.method807((Class378_Sub2.aClass668_10123),
													(byte) 102))
											.append(Class49.aString554).append("(").append(i).append("%)").toString(),
									true, Class587.aClass173_7714, Class191.aClass172_2171, Class27.aClass1_253,
									1953610841);
				} else
					Class691_Sub18.method9964(
							(Class39.aClass39_439.method807(Class378_Sub2.aClass668_10123, (byte) 102)), true,
							Class587.aClass173_7714, Class191.aClass172_2171, Class27.aClass1_253, 5557187);
			} else if (9 == 175711435 * anInt10876)
				Class142_Sub2.method8323(l);
			else if (17 == 175711435 * anInt10876)
				Class691_Sub18
						.method9964(
								new StringBuilder()
										.append(Class39.aClass39_441
												.method807((Class378_Sub2.aClass668_10123), (byte) 102))
										.append(Class49.aString554)
										.append(Class39.aClass39_442.method807((Class378_Sub2.aClass668_10123),
												(byte) 102))
										.toString(),
								false, Class587.aClass173_7714, Class191.aClass172_2171, Class27.aClass1_253,
								1061519425);
			else if (anInt10876 * 175711435 == 7)
				Class691_Sub18.method9964(Class39.aClass39_414.method807(Class378_Sub2.aClass668_10123, (byte) 102),
						false, Class587.aClass173_7714, Class191.aClass172_2171, Class27.aClass1_253, 786761009);
			if (3 == anInt11119 * -335828689) {
				for (int i = 0; i < anInt11114 * -230570629; i++) {
					Rectangle rectangle = aRectangleArray11090[i];
					if (aBoolArray10952[i])
						Class587.aClass173_7714.method2206(rectangle.x, rectangle.y, rectangle.width, rectangle.height,
								-65281, -1014656973);
					else
						Class587.aClass173_7714.method2206(rectangle.x, rectangle.y, rectangle.width, rectangle.height,
								-16711936, -222269927);
				}
			}
			if (Class194.method2812(1439800124))
				Class586.method7013(Class587.aClass173_7714, (byte) 51);
			if (!Class539.method6615(anInt10876 * 175711435, -1690045394)
					&& !Class667.method7910(175711435 * anInt10876, -75374813) && -1 != anInt10978 * 2088127151) {
				try {
					Class587.aClass173_7714.method2235();
					Class16.method640(Class587.aClass173_7714, Class249.method3417(2070684439),
							Class411.anInt4713 * -1117838587, -2142152407 * anInt6933, (byte) 39);
					Class587.aClass173_7714.method2273(1956128100);
				} catch (Exception_Sub5 exception_sub5) {
					VarDomainType.method5340(new StringBuilder().append(exception_sub5.getMessage()).append(" ")
							.append(method6214(-1116451974)).toString(), exception_sub5, 1782641327);
					switch (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594.method10014(-1824619963)) {
					default:
						Class186.method2754(0, false, 35160390);
						break;
					case 3:
						HandshakeOpcode.method4863(exception_sub5.method10324(-132890175), -25785774);
						Class186.method2754(1, false, 2092910506);
					}
				}
			}
			int i = Class514.aClass528_Sub38_6967.aClass691_Sub32_10598.method10100((byte) 1);
			if (i == 0)
				Class511_Sub1.method9241(15L);
			else if (1 == i)
				Class511_Sub1.method9241(10L);
			else if (i == 2)
				Class511_Sub1.method9241(5L);
			else if (3 == i)
				Class511_Sub1.method9241(2L);
			if (aBool10892)
				Class225.method3174(-2140090496);
			if (Class514.aClass528_Sub38_6967.aClass691_Sub33_10560.method10104(1143166176) == 1
					&& 8 == 175711435 * anInt10876 && 2088127151 * anInt10978 != -1) {
				Class514.aClass528_Sub38_6967.method9556(Class514.aClass528_Sub38_6967.aClass691_Sub33_10560, 0,
						1085925910);
				Class243.method3387(2141805950);
			}
		}
	}

	static final void method10242(boolean bool) {
		Class698.method8209(anInt10978 * 2088127151, Class411.anInt4713 * -1117838587, anInt6933 * -2142152407, bool,
				-8802298);
	}

	@Override
	public String method6214(int i) {
		String string = " ";
		try {
			Class578 class578 = aClass495_10935.method5966(1273279609);
			string = new StringBuilder().append(string).append(961465569 * class578.anInt7607)
					.append(Class49.aString555).append(-173815201 * class578.anInt7608).append(Class49.aString555)
					.append(aClass495_10935.method6029((short) 5507)).append(Class49.aString555)
					.append(aClass495_10935.method5967(130518174)).append(" ").toString();
			if (null != Class108.myPlayer)
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneXQueue[0]) + class578.anInt7607 * 961465569)
						.append(Class49.aString555)
						.append((Class108.myPlayer.sceneYQueue[0]) + class578.anInt7608 * -173815201).append(" ")
						.toString();
			else
				string = new StringBuilder().append(string).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(1926870089 * Class181_Sub5.anInt9778)
						.append(Class49.aString555).append(Class181_Sub5.anInt9778 * 1926870089)
						.append(Class49.aString555).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub24_10594.method10014(-1824619963)).append(" ")
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub27_10567.method10040((byte) -39)).append(" ")
					.append(Class377.method4705(-1640297628)).append(" ").append(Class411.anInt4713 * -1117838587)
					.append(Class49.aString555).append(anInt6933 * -2142152407).append(" ").toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub2_10580.method9747(-2098321037)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub8_10565.method9883(1965549647)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub15_10566.method9938(756063070)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub12_10590.method9915((byte) 1)).append(" ")
					.toString();
			string = new StringBuilder().append(string)
					.append(Class514.aClass528_Sub38_6967.aClass691_Sub19_10601.method9967(-1862408834)).append(" ")
					.toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(1110656915 * anInt6957).append(" ").toString();
			string = new StringBuilder().append(string).append(175711435 * anInt10876).append(" ").toString();
			if (Class141_Sub1.aClass528_Sub37_8800 != null)
				string = new StringBuilder().append(string)
						.append(428595037 * Class141_Sub1.aClass528_Sub37_8800.anInt10540).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString11054 != null)
				string = new StringBuilder().append(string).append(aString11054).toString();
			else
				string = new StringBuilder().append(string).append(Class49.aString555).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	public static final void method10243() {
		if (!aBool10979) {
			aFloat10976 += (-24.0F - aFloat10976) / 2.0F;
			aBool10982 = true;
			aBool10979 = true;
		}
	}

	static final void method10244(int i) {
		anIntArray10880 = new int[i];
		anIntArray11013 = new int[i];
		anIntArray11014 = new int[i];
		anIntArray10967 = new int[i];
		anIntArray11012 = new int[i];
	}

	@Override
	final void method6208() {
		if (null != Class423.aClass141_Sub1_4785 && Class423.aClass141_Sub1_4785.aBool8795)
			Class647.method7712((short) 728);
		Class382.method4727((byte) -76);
		Class163.method2081(-798672408);
		if (Class587.aClass173_7714 != null)
			Class587.aClass173_7714.method2156(-1372793801);
		if (Class700.aBool8733 && Class207.aFrame2236 != null) {
			Class452.method5449(Class181.aClass702_2093, Class207.aFrame2236, -118539315);
			Class207.aFrame2236 = null;
		}
		aClass109_10930.method1382(-1934496814);
		aClass109_10930.aClass61_1395.method1014((byte) 101);
		aClass109_11162.method1382(-540536260);
		aClass109_11162.aClass61_1395.method1014((byte) 110);
		if (null != Class365.aClass218_3848)
			Class365.aClass218_3848.method3093(-48094534);
		Class700.aClass454_8734.method5468(1962763505);
		Class624.aClass449_8128.method5416(997635501);
		Class557.aClass455_7466.method5504(1078487764);
		if (aClass631_10885 != null) {
			aClass631_10885.method7534(1902250171);
			aClass631_10885 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class109.method1404((byte) 23);
		try {
			Class24.method702(-1245364589);
		} catch (Exception exception) {
			/* empty */
		}
		if (null != Class499.aClass40_6844)
			Class499.aClass40_6844.method812(1495319587);
		if (aBool6952 && Class646.aClass665_8386 != ModeWhere.aClass665_8465)
			Class181_Sub11.method8963(300168955);
	}

	static final void method10245() {
		for (Class528_Sub21_Sub10 class528_sub21_sub10 = ((Class528_Sub21_Sub10) aClass688_11043.method8034(
				1649222065)); null != class528_sub21_sub10; class528_sub21_sub10 = ((Class528_Sub21_Sub10) aClass688_11043
						.method8037(1448798874))) {
			Class645_Sub1_Sub5_Sub6 class645_sub1_sub5_sub6 = (class528_sub21_sub10.aClass645_Sub1_Sub5_Sub6_11583);
			if (anInt11127 > class645_sub1_sub5_sub6.anInt12008 * -108038505) {
				class528_sub21_sub10.method6443(894192157);
				class645_sub1_sub5_sub6.method10885(-977882301);
			} else if (anInt11127 >= class645_sub1_sub5_sub6.anInt12011 * -39303101) {
				class645_sub1_sub5_sub6.method10880(-169095542);
				if (class645_sub1_sub5_sub6.anInt12016 * 1063966653 > 0) {
					if (0 == anInt10943 * 345087519) {
						Entity class645_sub1_sub5_sub1 = Class185.aClass182Array2106[(class645_sub1_sub5_sub6.anInt12016
								* 1063966653) - 1].method2689(-1012043543);
						if (null != class645_sub1_sub5_sub1) {
							Class422 class422 = (class645_sub1_sub5_sub1.method7693().aClass422_4868);
							if ((int) class422.aFloat4780 >= 0
									&& ((int) class422.aFloat4780 < aClass495_10935.method6029((short) 29967) * 512)
									&& (int) class422.aFloat4777 >= 0
									&& ((int) class422.aFloat4777 < (aClass495_10935.method5967(690681134) * 512)))
								class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780,
										(int) class422.aFloat4777,
										((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
												(int) class422.aFloat4777, class645_sub1_sub5_sub1.aByte10675,
												-759833206)) - 1004576393 * (class645_sub1_sub5_sub6.anInt12026)),
										anInt11127, 1177681787);
						}
					} else {
						Class528_Sub31 class528_sub31 = ((Class528_Sub31) (aClass692_11110
								.method8137((1063966653 * class645_sub1_sub5_sub6.anInt12016) - 1)));
						if (null != class528_sub31) {
							NPC class645_sub1_sub5_sub1_sub1 = ((NPC) class528_sub31.anObject10468);
							Class422 class422 = (class645_sub1_sub5_sub1_sub1.method7693().aClass422_4868);
							if ((int) class422.aFloat4780 >= 0
									&& ((int) class422.aFloat4780 < aClass495_10935.method6029((short) 24907) * 512)
									&& (int) class422.aFloat4777 >= 0
									&& ((int) class422.aFloat4777 < (aClass495_10935.method5967(138172360) * 512)))
								class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780,
										(int) class422.aFloat4777,
										((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
												(int) class422.aFloat4777, class645_sub1_sub5_sub6.aByte10675,
												-759833206)) - (class645_sub1_sub5_sub6.anInt12026 * 1004576393)),
										anInt11127, 193353998);
						}
					}
				}
				if (1063966653 * class645_sub1_sub5_sub6.anInt12016 < 0) {
					int i = (-(class645_sub1_sub5_sub6.anInt12016 * 1063966653) - 1);
					Player class645_sub1_sub5_sub1_sub2;
					if (-1453744879 * anInt11025 == i)
						class645_sub1_sub5_sub1_sub2 = Class108.myPlayer;
					else
						class645_sub1_sub5_sub1_sub2 = localPlayers[i];
					if (class645_sub1_sub5_sub1_sub2 != null) {
						Class422 class422 = (class645_sub1_sub5_sub1_sub2.method7693().aClass422_4868);
						if ((int) class422.aFloat4780 >= 0
								&& ((int) class422.aFloat4780 < (aClass495_10935.method6029((short) 12849) * 512))
								&& (int) class422.aFloat4777 >= 0
								&& ((int) class422.aFloat4777 < aClass495_10935.method5967(358925032) * 512))
							class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780, (int) class422.aFloat4777,
									((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
											(int) class422.aFloat4777, class645_sub1_sub5_sub6.aByte10675, -759833206))
											- (class645_sub1_sub5_sub6.anInt12026 * 1004576393)),
									anInt11127, -1481936598);
					}
				}
				class645_sub1_sub5_sub6.method10881(-178309515 * anInt10971, 353757928);
				aClass495_10935.method5973((byte) 92).method6545(class645_sub1_sub5_sub6, true, 2015755178);
			}
		}
	}

	public static final void method10246() {
		if (!aBool10979) {
			aFloat10976 += (24.0F - aFloat10976) / 2.0F;
			aBool10982 = true;
			aBool10979 = true;
		}
	}

	static final void method10247() {
		BitBuffer class528_sub42_sub2 = aClass109_10930.aClass528_Sub42_Sub2_1378;
		class528_sub42_sub2.setBitAccess(456456071);
		int i = class528_sub42_sub2.readBits(8, (byte) -21);
		if (i < -2065344127 * anInt10922) {
			for (int i_242_ = i; i_242_ < anInt10922 * -2065344127; i_242_++)
				anIntArray10928[(anInt10927 += 1202438591) * -1261097409 - 1] = anIntArray10923[i_242_];
		}
		if (i > anInt10922 * -2065344127)
			throw new RuntimeException();
		anInt10922 = 0;
		for (int i_243_ = 0; i_243_ < i; i_243_++) {
			int i_244_ = anIntArray10923[i_243_];
			NPC class645_sub1_sub5_sub1_sub1 = ((NPC) ((Class528_Sub31) aClass692_11110
					.method8137(i_244_)).anObject10468);
			int i_245_ = class528_sub42_sub2.readBits(1, (byte) -75);
			if (0 == i_245_) {
				anIntArray10923[(anInt10922 += -1811618175) * -2065344127 - 1] = i_244_;
				class645_sub1_sub5_sub1_sub1.anInt11758 = -653015535 * anInt11032;
			} else {
				int i_246_ = class528_sub42_sub2.readBits(2, (byte) -72);
				if (i_246_ == 0) {
					anIntArray10923[((anInt10922 += -1811618175) * -2065344127 - 1)] = i_244_;
					class645_sub1_sub5_sub1_sub1.anInt11758 = -653015535 * anInt11032;
					anIntArray10925[((anInt10924 += 1904393989) * -141740595 - 1)] = i_244_;
				} else if (i_246_ == 1) {
					anIntArray10923[((anInt10922 += -1811618175) * -2065344127 - 1)] = i_244_;
					class645_sub1_sub5_sub1_sub1.anInt11758 = -653015535 * anInt11032;
					Class657 class657 = ((Class657) (Class443.method5321(Class575.method6890((byte) 73),
							class528_sub42_sub2.readBits(3, (byte) -113), 1833988966)));
					class645_sub1_sub5_sub1_sub1.method10901(class657, (Class666.aClass666_8476.aByte8478), (byte) 0);
					int i_247_ = class528_sub42_sub2.readBits(1, (byte) -28);
					if (i_247_ == 1)
						anIntArray10925[(anInt10924 += 1904393989) * -141740595 - 1] = i_244_;
				} else if (i_246_ == 2) {
					anIntArray10923[((anInt10922 += -1811618175) * -2065344127 - 1)] = i_244_;
					class645_sub1_sub5_sub1_sub1.anInt11758 = -653015535 * anInt11032;
					if (class528_sub42_sub2.readBits(1, (byte) -85) == 1) {
						Class657 class657 = ((Class657) (Class443.method5321(Class575.method6890((byte) 59),
								class528_sub42_sub2.readBits(3, (byte) -123), 1062889169)));
						class645_sub1_sub5_sub1_sub1.method10901(class657, Class666.aClass666_8479.aByte8478, (byte) 0);
						Class657 class657_248_ = ((Class657) (Class443.method5321(Class575.method6890((byte) 107),
								class528_sub42_sub2.readBits(3, (byte) -125), 1480782848)));
						class645_sub1_sub5_sub1_sub1.method10901(class657_248_, Class666.aClass666_8479.aByte8478,
								(byte) 0);
					} else {
						Class657 class657 = ((Class657) (Class443.method5321(Class575.method6890((byte) 68),
								class528_sub42_sub2.readBits(3, (byte) -26), 968861402)));
						class645_sub1_sub5_sub1_sub1.method10901(class657, Class666.aClass666_8477.aByte8478, (byte) 0);
					}
					int i_249_ = class528_sub42_sub2.readBits(1, (byte) -105);
					if (1 == i_249_)
						anIntArray10925[(anInt10924 += 1904393989) * -141740595 - 1] = i_244_;
				} else if (3 == i_246_)
					anIntArray10928[((anInt10927 += 1202438591) * -1261097409 - 1)] = i_244_;
			}
		}
	}

	static final void method10248() {
		BitBuffer class528_sub42_sub2 = aClass109_10930.aClass528_Sub42_Sub2_1378;
		for (int i = 0; i < anInt10924 * -141740595; i++) {
			int i_250_ = anIntArray10925[i];
			NPC class645_sub1_sub5_sub1_sub1 = ((NPC) ((Class528_Sub31) aClass692_11110
					.method8137(i_250_)).anObject10468);
			class528_sub42_sub2.readUnsignedShort(-468411432);
			int i_251_ = class528_sub42_sub2.readUnsignedByte((byte) 121);
			if (0 != (i_251_ & 0x4))
				i_251_ += class528_sub42_sub2.readUnsignedByte((byte) 109) << 8;
			if (0 != (i_251_ & 0x1000))
				i_251_ += class528_sub42_sub2.readUnsignedByte((byte) 9) << 16;
			if (0 != (i_251_ & 0x10000))
				i_251_ += class528_sub42_sub2.readUnsignedByte((byte) 42) << 24;
			if (0 != (i_251_ & 0x8000)) {
				int i_252_ = class528_sub42_sub2.readUnsignedByte((byte) 1);
				int[] is = new int[i_252_];
				int[] is_253_ = new int[i_252_];
				int[] is_254_ = new int[i_252_];
				for (int i_255_ = 0; i_255_ < i_252_; i_255_++) {
					int i_256_ = class528_sub42_sub2.method9645((short) 513);
					is[i_255_] = i_256_;
					is_253_[i_255_] = class528_sub42_sub2.readUnsignedByte((byte) 14);
					is_254_[i_255_] = class528_sub42_sub2.readUnsignedShort(-680914221);
				}
				Class498.method6068(class645_sub1_sub5_sub1_sub1, is, is_253_, is_254_, -2010573714);
			}
			if (0 != (i_251_ & 0x800)) {
				class645_sub1_sub5_sub1_sub1.anInt12039 = class528_sub42_sub2.readShortA((byte) -113) * 1702071077;
				if (-1979082579 * class645_sub1_sub5_sub1_sub1.anInt12039 == 65535)
					class645_sub1_sub5_sub1_sub1.anInt12039 = -1702071077;
			}
			if ((i_251_ & 0x20000) != 0) {
				int i_257_ = ((class528_sub42_sub2.payload[((class528_sub42_sub2.pointer += 2015001547) * -185904669)
						- 1]) & 0xff);
				for (int i_258_ = 0; i_258_ < i_257_; i_258_++) {
					int i_259_ = class528_sub42_sub2.method9614(-1220398584);
					int i_260_ = class528_sub42_sub2.method9675(2133838913);
					int i_261_ = class528_sub42_sub2.method9641(-1304091339);
					class645_sub1_sub5_sub1_sub1.method10910(i_259_, i_260_, i_261_, (byte) -1);
				}
			}
			if (0 != (i_251_ & 0x10)) {
				class645_sub1_sub5_sub1_sub1.anInt11780 = class528_sub42_sub2.readUnsignedShort(-342246046) * 1577001447;
				if (65535 == -1378983465 * class645_sub1_sub5_sub1_sub1.anInt11780)
					class645_sub1_sub5_sub1_sub1.anInt11780 = -1577001447;
			}
			if (0 != (i_251_ & 0x20)) {
				int i_262_ = class528_sub42_sub2.readUnsignedShort(-1192122086);
				int i_263_ = class528_sub42_sub2.readLEInt((short) 16385);
				if (i_262_ == 65535)
					i_262_ = -1;
				int i_264_ = class528_sub42_sub2.readUnsignedA((byte) -34);
				int i_265_ = i_264_ & 0x7;
				int i_266_ = i_264_ >> 3 & 0xf;
				if (15 == i_266_)
					i_266_ = -1;
				boolean bool = 1 == (i_264_ >> 7 & 0x1);
				class645_sub1_sub5_sub1_sub1.method10667(i_262_, i_263_, i_265_, i_266_, bool, 0, (byte) -70);
			}
			if (0 != (i_251_ & 0x400000)) {
				class645_sub1_sub5_sub1_sub1.aString12044 = class528_sub42_sub2.readString(1265185142);
				if ("".equals(class645_sub1_sub5_sub1_sub1.aString12044) || (class645_sub1_sub5_sub1_sub1.aString12044
						.equals(class645_sub1_sub5_sub1_sub1.aClass299_12043.aString3269)))
					class645_sub1_sub5_sub1_sub1.aString12044 = (class645_sub1_sub5_sub1_sub1.aClass299_12043.aString3269);
			}
			if (0 != (i_251_ & 0x2)) {
				int i_267_ = class528_sub42_sub2.readUnsignedByte((byte) 79);
				if (i_267_ > 0) {
					for (int i_268_ = 0; i_268_ < i_267_; i_268_++) {
						int i_269_ = -1;
						int i_270_ = -1;
						int i_271_ = -1;
						int i_272_ = class528_sub42_sub2.method9719(65280);
						if (i_272_ == 32767) {
							i_272_ = class528_sub42_sub2.method9719(65280);
							i_270_ = class528_sub42_sub2.method9719(65280);
							i_269_ = class528_sub42_sub2.method9719(65280);
							i_271_ = class528_sub42_sub2.method9719(65280);
						} else if (32766 != i_272_)
							i_270_ = class528_sub42_sub2.method9719(65280);
						else {
							i_272_ = -1;
							i_270_ = class528_sub42_sub2.readUnsignedByte((byte) 67);
						}
						int i_273_ = class528_sub42_sub2.method9719(65280);
						class645_sub1_sub5_sub1_sub1.method10683(i_272_, i_270_, i_269_, i_271_, anInt11127, i_273_,
								(short) -8557);
					}
				}
				int i_274_ = class528_sub42_sub2.readUnsignedS(-1351494587);
				if (i_274_ > 0) {
					for (int i_275_ = 0; i_275_ < i_274_; i_275_++) {
						int i_276_ = class528_sub42_sub2.method9719(65280);
						int i_277_ = class528_sub42_sub2.method9719(65280);
						if (i_277_ != 32767) {
							int i_278_ = class528_sub42_sub2.method9719(65280);
							int i_279_ = class528_sub42_sub2.readUnsignedByte((byte) 89);
							int i_280_ = (i_277_ > 0 ? class528_sub42_sub2.readUnsignedS(1439201445) : i_279_);
							class645_sub1_sub5_sub1_sub1.method10669(i_276_, anInt11127, i_277_, i_278_, i_279_, i_280_,
									-176496841);
						} else
							class645_sub1_sub5_sub1_sub1.method10670(i_276_, -213827427);
					}
				}
			}
			if (0 != (i_251_ & 0x4000000)) {
				int i_281_ = class528_sub42_sub2.readUnsignedShort(-1232689418);
				int i_282_ = class528_sub42_sub2.readLEInt((short) 16385);
				if (65535 == i_281_)
					i_281_ = -1;
				int i_283_ = class528_sub42_sub2.method9614(-1220398584);
				int i_284_ = i_283_ & 0x7;
				int i_285_ = i_283_ >> 3 & 0xf;
				if (15 == i_285_)
					i_285_ = -1;
				boolean bool = 1 == (i_283_ >> 7 & 0x1);
				class645_sub1_sub5_sub1_sub1.method10667(i_281_, i_282_, i_284_, i_285_, bool, 3, (byte) -6);
			}
			if (0 != (i_251_ & 0x10000000)) {
				int i_286_ = class528_sub42_sub2.readLEShortA(1174779571);
				int i_287_ = class528_sub42_sub2.readLEInt((short) 16385);
				if (65535 == i_286_)
					i_286_ = -1;
				int i_288_ = class528_sub42_sub2.readUnsignedS(-1173918508);
				int i_289_ = i_288_ & 0x7;
				int i_290_ = i_288_ >> 3 & 0xf;
				if (15 == i_290_)
					i_290_ = -1;
				boolean bool = (i_288_ >> 7 & 0x1) == 1;
				class645_sub1_sub5_sub1_sub1.method10667(i_286_, i_287_, i_289_, i_290_, bool, 4, (byte) -18);
			}
			if (0 != (i_251_ & 0x8))
				class645_sub1_sub5_sub1_sub1.method10907(class528_sub42_sub2.readString(432632499), 0, 0, (byte) 35);
			if (0 != (i_251_ & 0x1000000))
				class645_sub1_sub5_sub1_sub1.aBool11764 = class528_sub42_sub2.readUnsignedA((byte) -72) == 1;
			if (0 != (i_251_ & 0x8000000)) {
				class645_sub1_sub5_sub1_sub1.aByte11797 = class528_sub42_sub2.readSignedS(897967514);
				class645_sub1_sub5_sub1_sub1.aByte11815 = class528_sub42_sub2.method9657((byte) 115);
				class645_sub1_sub5_sub1_sub1.aByte11799 = class528_sub42_sub2.readSignedC(649762945);
				class645_sub1_sub5_sub1_sub1.aByte11788 = (byte) class528_sub42_sub2.method9614(-1220398584);
				class645_sub1_sub5_sub1_sub1.anInt11756 = ((anInt11127 + class528_sub42_sub2.readShortA((byte) -52))
						* 661225281);
				class645_sub1_sub5_sub1_sub1.anInt11796 = ((anInt11127 + class528_sub42_sub2.readShortA((byte) -13))
						* 1584973623);
			}
			if ((i_251_ & 0x2000000) != 0)
				class645_sub1_sub5_sub1_sub1.anInt12046 = class528_sub42_sub2.readUnsignedByte((byte) 35) * 367698243;
			if (0 != (i_251_ & 0x100000)) {
				class645_sub1_sub5_sub1_sub1.anInt12038 = class528_sub42_sub2.readLEShortA(1924869327) * 287979369;
				if (65535 == class645_sub1_sub5_sub1_sub1.anInt12038 * -807024423)
					class645_sub1_sub5_sub1_sub1.anInt12038 = 975378287
							* (class645_sub1_sub5_sub1_sub1.aClass299_12043.anInt3266);
			}
			if (0 != (i_251_ & 0x80)) {
				int[] is = new int[4];
				for (int i_291_ = 0; i_291_ < 4; i_291_++)
					is[i_291_] = class528_sub42_sub2.method9645((short) -2539);
				int i_292_ = class528_sub42_sub2.method9614(-1220398584);
				Class528_Sub29.method9490(class645_sub1_sub5_sub1_sub1, is, i_292_, true, 89178858);
			}
			if (0 != (i_251_ & 0x2000)) {
				int i_293_ = class528_sub42_sub2.readUnsignedA((byte) -117);
				int[] is = new int[i_293_];
				int[] is_294_ = new int[i_293_];
				for (int i_295_ = 0; i_295_ < i_293_; i_295_++) {
					int i_296_ = class528_sub42_sub2.readUnsignedShort((short) 25594);
					if ((i_296_ & 0xc000) == 49152) {
						int i_297_ = class528_sub42_sub2.readUnsignedShort(823117894);
						is[i_295_] = i_296_ << 16 | i_297_;
					} else
						is[i_295_] = i_296_;
					is_294_[i_295_] = class528_sub42_sub2.readUnsignedShort(-1048534023);
				}
				class645_sub1_sub5_sub1_sub1.method10665(is, is_294_, -567037965);
			}
			if (0 != (i_251_ & 0x200)) {
				int i_298_ = class528_sub42_sub2.readUnsignedShort((short) 32318);
				int i_299_ = class528_sub42_sub2.readIntB(167027493);
				if (i_298_ == 65535)
					i_298_ = -1;
				int i_300_ = class528_sub42_sub2.method9614(-1220398584);
				int i_301_ = i_300_ & 0x7;
				int i_302_ = i_300_ >> 3 & 0xf;
				if (i_302_ == 15)
					i_302_ = -1;
				boolean bool = (i_300_ >> 7 & 0x1) == 1;
				class645_sub1_sub5_sub1_sub1.method10667(i_298_, i_299_, i_301_, i_302_, bool, 1, (byte) -99);
			}
			if (0 != (i_251_ & 0x40000)) {
				class645_sub1_sub5_sub1_sub1.anInterface2_11798.method27((byte) 2);
				class528_sub42_sub2.pointer += -264964202;
				int i_303_ = ((class528_sub42_sub2.payload[((class528_sub42_sub2.pointer += 2015001547) * -185904669)
						- 1]) & 0xff);
				for (int i_304_ = 0; i_304_ < i_303_; i_304_++) {
					int i_305_ = class528_sub42_sub2.readUnsignedA((byte) -115);
					Class483 class483 = ((Class483) Class443.method5321(Class483.method5867((byte) 1), i_305_,
							957888184));
					Class411 class411 = (Class664.aClass95_Sub1_Sub1_8460.method8256(class528_sub42_sub2, class483,
							966508745));
					class645_sub1_sub5_sub1_sub1.anInterface2_11798.method15(1862601893 * class411.anInt4711,
							class411.anObject4712, -1367254756);
				}
			}
			if ((i_251_ & 0x800000) != 0) {
				int i_306_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.anIntArray3272).length;
				int i_307_ = 0;
				if ((class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3284) != null)
					i_307_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3284).length;
				int i_308_ = 0;
				if (null != (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3320))
					i_307_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3320).length;
				int i_309_ = class528_sub42_sub2.method9614(-1220398584);
				if (1 != (i_309_ & 0x1)) {
					class528_sub42_sub2.pointer += -264964202;
					int[] is = null;
					if ((i_309_ & 0x2) == 2) {
						is = new int[i_306_];
						for (int i_310_ = 0; i_310_ < i_306_; i_310_++)
							is[i_310_] = class528_sub42_sub2.method9645((short) 3415);
					}
					short[] is_311_ = null;
					if ((i_309_ & 0x4) == 4) {
						is_311_ = new short[i_307_];
						for (int i_312_ = 0; i_312_ < i_307_; i_312_++)
							is_311_[i_312_] = (short) class528_sub42_sub2.readLEShortA(1235257572);
					}
					short[] is_313_ = null;
					if ((i_309_ & 0x8) == 8) {
						is_313_ = new short[i_308_];
						for (int i_314_ = 0; i_314_ < i_308_; i_314_++)
							is_313_[i_314_] = (short) class528_sub42_sub2.readUnsignedShort((short) 13164);
					}
					long l = (NPC.anInt12035 += -1410889035) * -885877859 - 1;
					new Class287(l, is, null, null, null, is_311_, is_313_);
				}
			}
			if (0 != (i_251_ & 0x100)) {
				class645_sub1_sub5_sub1_sub1.anInt11766 = class528_sub42_sub2.readSignedS(1341744089) * -888913659;
				class645_sub1_sub5_sub1_sub1.anInt11765 = class528_sub42_sub2.method9627(-1748308354) * -960732905;
				class645_sub1_sub5_sub1_sub1.anInt11787 = class528_sub42_sub2.method9657((byte) 116) * 979283275;
				class645_sub1_sub5_sub1_sub1.anInt11789 = class528_sub42_sub2.readSignedC(596629691) * 1152853501;
				class645_sub1_sub5_sub1_sub1.anInt11790 = class528_sub42_sub2.readSignedC(272799238) * 691421421;
				class645_sub1_sub5_sub1_sub1.anInt11791 = class528_sub42_sub2.readSignedC(1365258372) * 842261403;
				class645_sub1_sub5_sub1_sub1.anInt11792 = (class528_sub42_sub2.readShortA((byte) -64) + anInt11127)
						* 377645301;
				class645_sub1_sub5_sub1_sub1.anInt11793 = (class528_sub42_sub2.readUnsignedShort((short) 19706) + anInt11127)
						* -808789795;
				class645_sub1_sub5_sub1_sub1.anInt11794 = (class528_sub42_sub2.readUnsignedShort((short) 21233) * -818794613);
				class645_sub1_sub5_sub1_sub1.quenedStepCount = -670034095;
				class645_sub1_sub5_sub1_sub1.anInt11818 = 0;
				class645_sub1_sub5_sub1_sub1.anInt11766 += (-888913659 * class645_sub1_sub5_sub1_sub1.sceneXQueue[0]);
				class645_sub1_sub5_sub1_sub1.anInt11765 += (class645_sub1_sub5_sub1_sub1.sceneYQueue[0] * -960732905);
				class645_sub1_sub5_sub1_sub1.anInt11787 += (class645_sub1_sub5_sub1_sub1.sceneXQueue[0] * 979283275);
				class645_sub1_sub5_sub1_sub1.anInt11789 += (1152853501 * class645_sub1_sub5_sub1_sub1.sceneYQueue[0]);
				class645_sub1_sub5_sub1_sub1.anInt11790 += 691421421 * class645_sub1_sub5_sub1_sub1.aByte10675;
				class645_sub1_sub5_sub1_sub1.anInt11791 += class645_sub1_sub5_sub1_sub1.aByte10675 * 842261403;
			}
			if (0 != (i_251_ & 0x80000)) {
				class528_sub42_sub2.pointer += -264964202;
				int i_315_ = ((class528_sub42_sub2.payload[((class528_sub42_sub2.pointer += 2015001547) * -185904669)
						- 1]) & 0xff);
				for (int i_316_ = 0; i_316_ < i_315_; i_316_++) {
					int i_317_ = class528_sub42_sub2.readUnsignedByte((byte) 74);
					Class483 class483 = ((Class483) Class443.method5321(Class483.method5867((byte) 1), i_317_,
							941583640));
					Class411 class411 = (Class664.aClass95_Sub1_Sub1_8460.method8256(class528_sub42_sub2, class483,
							-245461704));
					class645_sub1_sub5_sub1_sub1.anInterface2_11798.method15(1862601893 * class411.anInt4711,
							class411.anObject4712, -2147295678);
				}
			}
			if (0 != (i_251_ & 0x1)) {
				if (class645_sub1_sub5_sub1_sub1.aClass299_12043.method4002((byte) 14))
					Class692.method8152(class645_sub1_sub5_sub1_sub1, 339289776);
				class645_sub1_sub5_sub1_sub1
						.method10899(
								((Class299) (Class21.aClass5_Sub8_214
										.method63(class528_sub42_sub2.method9645((short) -14999), 2032851846))),
								0 == (i_251_ & 0x400000), (i_251_ & 0x100000) == 0, true, 831448667);
				class645_sub1_sub5_sub1_sub1
						.setSize((class645_sub1_sub5_sub1_sub1.aClass299_12043.anInt3321 * -2134279851), -2077521446);
				class645_sub1_sub5_sub1_sub1.anInt11760 = -1365090067
						* (65886605 * (class645_sub1_sub5_sub1_sub1.aClass299_12043.anInt3301) << 3);
				if (class645_sub1_sub5_sub1_sub1.aClass299_12043.method4002((byte) 66))
					Class293.method3961(class645_sub1_sub5_sub1_sub1.aByte10675,
							class645_sub1_sub5_sub1_sub1.sceneXQueue[0], class645_sub1_sub5_sub1_sub1.sceneYQueue[0], 0,
							null, class645_sub1_sub5_sub1_sub1, null, (short) 857);
			}
			if ((i_251_ & 0x40) != 0) {
				class645_sub1_sub5_sub1_sub1.anInt12031 = class528_sub42_sub2.readLEShortA(1539324869) * 327351317;
				class645_sub1_sub5_sub1_sub1.anInt12032 = class528_sub42_sub2.readLEShortA(1467052869) * 259201889;
			}
			if (0 != (i_251_ & 0x200000)) {
				int i_318_ = class528_sub42_sub2.method9614(-1220398584);
				int[] is = new int[8];
				short[] is_319_ = new short[8];
				for (int i_320_ = 0; i_320_ < 8; i_320_++) {
					if (0 != (i_318_ & 1 << i_320_)) {
						is[i_320_] = class528_sub42_sub2.method9645((short) 8447);
						is_319_[i_320_] = (short) class528_sub42_sub2.method9725(-1656713266);
					} else {
						is[i_320_] = -1;
						is_319_[i_320_] = (short) -1;
					}
				}
				class645_sub1_sub5_sub1_sub1.aClass281_12037 = new Class281(is, is_319_);
			}
			if ((i_251_ & 0x20000000) != 0) {
				int i_321_ = class528_sub42_sub2.readUnsignedShort(462341839);
				int i_322_ = class528_sub42_sub2.readIntB(1132977758);
				if (i_321_ == 65535)
					i_321_ = -1;
				int i_323_ = class528_sub42_sub2.readUnsignedByte((byte) 56);
				int i_324_ = i_323_ & 0x7;
				int i_325_ = i_323_ >> 3 & 0xf;
				if (i_325_ == 15)
					i_325_ = -1;
				boolean bool = 1 == (i_323_ >> 7 & 0x1);
				class645_sub1_sub5_sub1_sub1.method10667(i_321_, i_322_, i_324_, i_325_, bool, 2, (byte) 79);
			}
			if ((i_251_ & 0x400) != 0) {
				int i_326_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.anIntArray3271).length;
				int i_327_ = 0;
				if (null != (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3284))
					i_327_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3284).length;
				int i_328_ = 0;
				if (null != (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3320))
					i_328_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3320).length;
				int i_329_ = class528_sub42_sub2.method9614(-1220398584);
				if (1 == (i_329_ & 0x1))
					class645_sub1_sub5_sub1_sub1.aClass287_12033 = null;
				else {
					class528_sub42_sub2.pointer += -264964202;
					int[] is = null;
					float[] fs = null;
					int[][] is_330_ = null;
					int[][] is_331_ = null;
					if (2 == (i_329_ & 0x2)) {
						is = new int[i_326_];
						if ((i_329_ & 0x10) == 16) {
							fs = new float[i_326_];
							is_330_ = new int[i_326_][3];
							is_331_ = new int[i_326_][3];
						}
						for (int i_332_ = 0; i_332_ < i_326_; i_332_++) {
							is[i_332_] = class528_sub42_sub2.method9645((short) 17366);
							if (16 == (i_329_ & 0x10) && -1 != is[i_332_]) {
								fs[i_332_] = class528_sub42_sub2.method9635(-2128456330);
								for (int i_333_ = 0; i_333_ < 3; i_333_++)
									is_330_[i_332_][i_333_] = class528_sub42_sub2.method9668(-1404752208);
								for (int i_334_ = 0; i_334_ < 3; i_334_++)
									is_331_[i_332_][i_334_] = class528_sub42_sub2.method9612(837549199);
							}
						}
					}
					short[] is_335_ = null;
					if (4 == (i_329_ & 0x4)) {
						is_335_ = new short[i_327_];
						for (int i_336_ = 0; i_336_ < i_327_; i_336_++)
							is_335_[i_336_] = (short) class528_sub42_sub2.readLEShortA(1088306738);
					}
					short[] is_337_ = null;
					if (8 == (i_329_ & 0x8)) {
						is_337_ = new short[i_328_];
						for (int i_338_ = 0; i_338_ < i_328_; i_338_++)
							is_337_[i_338_] = (short) class528_sub42_sub2.readUnsignedShort((short) 27991);
					}
					long l = (NPC.anInt12034 += 519628303) * 826493167 - 1;
					class645_sub1_sub5_sub1_sub1.aClass287_12033 = new Class287(l, is, fs, is_330_, is_331_, is_335_,
							is_337_);
				}
			}
		}
	}

	static final void method10249() {
		BitBuffer class528_sub42_sub2 = aClass109_10930.aClass528_Sub42_Sub2_1378;
		for (int i = 0; i < anInt10924 * -141740595; i++) {
			int i_339_ = anIntArray10925[i];
			NPC class645_sub1_sub5_sub1_sub1 = ((NPC) ((Class528_Sub31) aClass692_11110
					.method8137(i_339_)).anObject10468);
			class528_sub42_sub2.readUnsignedShort(869497012);
			int i_340_ = class528_sub42_sub2.readUnsignedByte((byte) 10);
			if (0 != (i_340_ & 0x4))
				i_340_ += class528_sub42_sub2.readUnsignedByte((byte) 112) << 8;
			if (0 != (i_340_ & 0x1000))
				i_340_ += class528_sub42_sub2.readUnsignedByte((byte) 5) << 16;
			if (0 != (i_340_ & 0x10000))
				i_340_ += class528_sub42_sub2.readUnsignedByte((byte) 78) << 24;
			if (0 != (i_340_ & 0x8000)) {
				int i_341_ = class528_sub42_sub2.readUnsignedByte((byte) 4);
				int[] is = new int[i_341_];
				int[] is_342_ = new int[i_341_];
				int[] is_343_ = new int[i_341_];
				for (int i_344_ = 0; i_344_ < i_341_; i_344_++) {
					int i_345_ = class528_sub42_sub2.method9645((short) 20701);
					is[i_344_] = i_345_;
					is_342_[i_344_] = class528_sub42_sub2.readUnsignedByte((byte) 22);
					is_343_[i_344_] = class528_sub42_sub2.readUnsignedShort(-2099437178);
				}
				Class498.method6068(class645_sub1_sub5_sub1_sub1, is, is_342_, is_343_, -2010573714);
			}
			if (0 != (i_340_ & 0x800)) {
				class645_sub1_sub5_sub1_sub1.anInt12039 = class528_sub42_sub2.readShortA((byte) -100) * 1702071077;
				if (-1979082579 * class645_sub1_sub5_sub1_sub1.anInt12039 == 65535)
					class645_sub1_sub5_sub1_sub1.anInt12039 = -1702071077;
			}
			if ((i_340_ & 0x20000) != 0) {
				int i_346_ = ((class528_sub42_sub2.payload[((class528_sub42_sub2.pointer += 2015001547) * -185904669)
						- 1]) & 0xff);
				for (int i_347_ = 0; i_347_ < i_346_; i_347_++) {
					int i_348_ = class528_sub42_sub2.method9614(-1220398584);
					int i_349_ = class528_sub42_sub2.method9675(2074831576);
					int i_350_ = class528_sub42_sub2.method9641(-1854086206);
					class645_sub1_sub5_sub1_sub1.method10910(i_348_, i_349_, i_350_, (byte) -1);
				}
			}
			if (0 != (i_340_ & 0x10)) {
				class645_sub1_sub5_sub1_sub1.anInt11780 = class528_sub42_sub2.readUnsignedShort(-1292223913) * 1577001447;
				if (65535 == -1378983465 * class645_sub1_sub5_sub1_sub1.anInt11780)
					class645_sub1_sub5_sub1_sub1.anInt11780 = -1577001447;
			}
			if (0 != (i_340_ & 0x20)) {
				int i_351_ = class528_sub42_sub2.readUnsignedShort(-143892662);
				int i_352_ = class528_sub42_sub2.readLEInt((short) 16385);
				if (i_351_ == 65535)
					i_351_ = -1;
				int i_353_ = class528_sub42_sub2.readUnsignedA((byte) -3);
				int i_354_ = i_353_ & 0x7;
				int i_355_ = i_353_ >> 3 & 0xf;
				if (15 == i_355_)
					i_355_ = -1;
				boolean bool = 1 == (i_353_ >> 7 & 0x1);
				class645_sub1_sub5_sub1_sub1.method10667(i_351_, i_352_, i_354_, i_355_, bool, 0, (byte) -10);
			}
			if (0 != (i_340_ & 0x400000)) {
				class645_sub1_sub5_sub1_sub1.aString12044 = class528_sub42_sub2.readString(812255552);
				if ("".equals(class645_sub1_sub5_sub1_sub1.aString12044) || (class645_sub1_sub5_sub1_sub1.aString12044
						.equals(class645_sub1_sub5_sub1_sub1.aClass299_12043.aString3269)))
					class645_sub1_sub5_sub1_sub1.aString12044 = (class645_sub1_sub5_sub1_sub1.aClass299_12043.aString3269);
			}
			if (0 != (i_340_ & 0x2)) {
				int i_356_ = class528_sub42_sub2.readUnsignedByte((byte) 24);
				if (i_356_ > 0) {
					for (int i_357_ = 0; i_357_ < i_356_; i_357_++) {
						int i_358_ = -1;
						int i_359_ = -1;
						int i_360_ = -1;
						int i_361_ = class528_sub42_sub2.method9719(65280);
						if (i_361_ == 32767) {
							i_361_ = class528_sub42_sub2.method9719(65280);
							i_359_ = class528_sub42_sub2.method9719(65280);
							i_358_ = class528_sub42_sub2.method9719(65280);
							i_360_ = class528_sub42_sub2.method9719(65280);
						} else if (32766 != i_361_)
							i_359_ = class528_sub42_sub2.method9719(65280);
						else {
							i_361_ = -1;
							i_359_ = class528_sub42_sub2.readUnsignedByte((byte) 9);
						}
						int i_362_ = class528_sub42_sub2.method9719(65280);
						class645_sub1_sub5_sub1_sub1.method10683(i_361_, i_359_, i_358_, i_360_, anInt11127, i_362_,
								(short) -32166);
					}
				}
				int i_363_ = class528_sub42_sub2.readUnsignedS(-177471087);
				if (i_363_ > 0) {
					for (int i_364_ = 0; i_364_ < i_363_; i_364_++) {
						int i_365_ = class528_sub42_sub2.method9719(65280);
						int i_366_ = class528_sub42_sub2.method9719(65280);
						if (i_366_ != 32767) {
							int i_367_ = class528_sub42_sub2.method9719(65280);
							int i_368_ = class528_sub42_sub2.readUnsignedByte((byte) 64);
							int i_369_ = (i_366_ > 0 ? class528_sub42_sub2.readUnsignedS(557556156) : i_368_);
							class645_sub1_sub5_sub1_sub1.method10669(i_365_, anInt11127, i_366_, i_367_, i_368_, i_369_,
									-816194806);
						} else
							class645_sub1_sub5_sub1_sub1.method10670(i_365_, 1402215322);
					}
				}
			}
			if (0 != (i_340_ & 0x4000000)) {
				int i_370_ = class528_sub42_sub2.readUnsignedShort(-1708607040);
				int i_371_ = class528_sub42_sub2.readLEInt((short) 16385);
				if (65535 == i_370_)
					i_370_ = -1;
				int i_372_ = class528_sub42_sub2.method9614(-1220398584);
				int i_373_ = i_372_ & 0x7;
				int i_374_ = i_372_ >> 3 & 0xf;
				if (15 == i_374_)
					i_374_ = -1;
				boolean bool = 1 == (i_372_ >> 7 & 0x1);
				class645_sub1_sub5_sub1_sub1.method10667(i_370_, i_371_, i_373_, i_374_, bool, 3, (byte) -54);
			}
			if (0 != (i_340_ & 0x10000000)) {
				int i_375_ = class528_sub42_sub2.readLEShortA(1788797822);
				int i_376_ = class528_sub42_sub2.readLEInt((short) 16385);
				if (65535 == i_375_)
					i_375_ = -1;
				int i_377_ = class528_sub42_sub2.readUnsignedS(-449212225);
				int i_378_ = i_377_ & 0x7;
				int i_379_ = i_377_ >> 3 & 0xf;
				if (15 == i_379_)
					i_379_ = -1;
				boolean bool = (i_377_ >> 7 & 0x1) == 1;
				class645_sub1_sub5_sub1_sub1.method10667(i_375_, i_376_, i_378_, i_379_, bool, 4, (byte) 75);
			}
			if (0 != (i_340_ & 0x8))
				class645_sub1_sub5_sub1_sub1.method10907(class528_sub42_sub2.readString(1532982034), 0, 0, (byte) 8);
			if (0 != (i_340_ & 0x1000000))
				class645_sub1_sub5_sub1_sub1.aBool11764 = class528_sub42_sub2.readUnsignedA((byte) -22) == 1;
			if (0 != (i_340_ & 0x8000000)) {
				class645_sub1_sub5_sub1_sub1.aByte11797 = class528_sub42_sub2.readSignedS(-1896558286);
				class645_sub1_sub5_sub1_sub1.aByte11815 = class528_sub42_sub2.method9657((byte) 41);
				class645_sub1_sub5_sub1_sub1.aByte11799 = class528_sub42_sub2.readSignedC(1109877204);
				class645_sub1_sub5_sub1_sub1.aByte11788 = (byte) class528_sub42_sub2.method9614(-1220398584);
				class645_sub1_sub5_sub1_sub1.anInt11756 = ((anInt11127 + class528_sub42_sub2.readShortA((byte) -2))
						* 661225281);
				class645_sub1_sub5_sub1_sub1.anInt11796 = ((anInt11127 + class528_sub42_sub2.readShortA((byte) -122))
						* 1584973623);
			}
			if ((i_340_ & 0x2000000) != 0)
				class645_sub1_sub5_sub1_sub1.anInt12046 = class528_sub42_sub2.readUnsignedByte((byte) 67) * 367698243;
			if (0 != (i_340_ & 0x100000)) {
				class645_sub1_sub5_sub1_sub1.anInt12038 = class528_sub42_sub2.readLEShortA(759213667) * 287979369;
				if (65535 == class645_sub1_sub5_sub1_sub1.anInt12038 * -807024423)
					class645_sub1_sub5_sub1_sub1.anInt12038 = 975378287
							* (class645_sub1_sub5_sub1_sub1.aClass299_12043.anInt3266);
			}
			if (0 != (i_340_ & 0x80)) {
				int[] is = new int[4];
				for (int i_380_ = 0; i_380_ < 4; i_380_++)
					is[i_380_] = class528_sub42_sub2.method9645((short) -3947);
				int i_381_ = class528_sub42_sub2.method9614(-1220398584);
				Class528_Sub29.method9490(class645_sub1_sub5_sub1_sub1, is, i_381_, true, 89178858);
			}
			if (0 != (i_340_ & 0x2000)) {
				int i_382_ = class528_sub42_sub2.readUnsignedA((byte) -112);
				int[] is = new int[i_382_];
				int[] is_383_ = new int[i_382_];
				for (int i_384_ = 0; i_384_ < i_382_; i_384_++) {
					int i_385_ = class528_sub42_sub2.readUnsignedShort((short) 11396);
					if ((i_385_ & 0xc000) == 49152) {
						int i_386_ = class528_sub42_sub2.readUnsignedShort(-2015433443);
						is[i_384_] = i_385_ << 16 | i_386_;
					} else
						is[i_384_] = i_385_;
					is_383_[i_384_] = class528_sub42_sub2.readUnsignedShort(-1992193719);
				}
				class645_sub1_sub5_sub1_sub1.method10665(is, is_383_, -1885082743);
			}
			if (0 != (i_340_ & 0x200)) {
				int i_387_ = class528_sub42_sub2.readUnsignedShort((short) 18879);
				int i_388_ = class528_sub42_sub2.readIntB(-1594672685);
				if (i_387_ == 65535)
					i_387_ = -1;
				int i_389_ = class528_sub42_sub2.method9614(-1220398584);
				int i_390_ = i_389_ & 0x7;
				int i_391_ = i_389_ >> 3 & 0xf;
				if (i_391_ == 15)
					i_391_ = -1;
				boolean bool = (i_389_ >> 7 & 0x1) == 1;
				class645_sub1_sub5_sub1_sub1.method10667(i_387_, i_388_, i_390_, i_391_, bool, 1, (byte) -65);
			}
			if (0 != (i_340_ & 0x40000)) {
				class645_sub1_sub5_sub1_sub1.anInterface2_11798.method27((byte) 2);
				class528_sub42_sub2.pointer += -264964202;
				int i_392_ = ((class528_sub42_sub2.payload[((class528_sub42_sub2.pointer += 2015001547) * -185904669)
						- 1]) & 0xff);
				for (int i_393_ = 0; i_393_ < i_392_; i_393_++) {
					int i_394_ = class528_sub42_sub2.readUnsignedA((byte) -6);
					Class483 class483 = ((Class483) Class443.method5321(Class483.method5867((byte) 1), i_394_,
							1486540725));
					Class411 class411 = (Class664.aClass95_Sub1_Sub1_8460.method8256(class528_sub42_sub2, class483,
							1091386425));
					class645_sub1_sub5_sub1_sub1.anInterface2_11798.method15(1862601893 * class411.anInt4711,
							class411.anObject4712, -1373818750);
				}
			}
			if ((i_340_ & 0x800000) != 0) {
				int i_395_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.anIntArray3272).length;
				int i_396_ = 0;
				if ((class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3284) != null)
					i_396_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3284).length;
				int i_397_ = 0;
				if (null != (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3320))
					i_396_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3320).length;
				int i_398_ = class528_sub42_sub2.method9614(-1220398584);
				if (1 != (i_398_ & 0x1)) {
					class528_sub42_sub2.pointer += -264964202;
					int[] is = null;
					if ((i_398_ & 0x2) == 2) {
						is = new int[i_395_];
						for (int i_399_ = 0; i_399_ < i_395_; i_399_++)
							is[i_399_] = class528_sub42_sub2.method9645((short) 2161);
					}
					short[] is_400_ = null;
					if ((i_398_ & 0x4) == 4) {
						is_400_ = new short[i_396_];
						for (int i_401_ = 0; i_401_ < i_396_; i_401_++)
							is_400_[i_401_] = (short) class528_sub42_sub2.readLEShortA(1900522890);
					}
					short[] is_402_ = null;
					if ((i_398_ & 0x8) == 8) {
						is_402_ = new short[i_397_];
						for (int i_403_ = 0; i_403_ < i_397_; i_403_++)
							is_402_[i_403_] = (short) class528_sub42_sub2.readUnsignedShort((short) 23401);
					}
					long l = (NPC.anInt12035 += -1410889035) * -885877859 - 1;
					new Class287(l, is, null, null, null, is_400_, is_402_);
				}
			}
			if (0 != (i_340_ & 0x100)) {
				class645_sub1_sub5_sub1_sub1.anInt11766 = class528_sub42_sub2.readSignedS(494387172) * -888913659;
				class645_sub1_sub5_sub1_sub1.anInt11765 = class528_sub42_sub2.method9627(-1919880898) * -960732905;
				class645_sub1_sub5_sub1_sub1.anInt11787 = class528_sub42_sub2.method9657((byte) 48) * 979283275;
				class645_sub1_sub5_sub1_sub1.anInt11789 = class528_sub42_sub2.readSignedC(-103925011) * 1152853501;
				class645_sub1_sub5_sub1_sub1.anInt11790 = class528_sub42_sub2.readSignedC(-852917834) * 691421421;
				class645_sub1_sub5_sub1_sub1.anInt11791 = class528_sub42_sub2.readSignedC(1647579037) * 842261403;
				class645_sub1_sub5_sub1_sub1.anInt11792 = (class528_sub42_sub2.readShortA((byte) -12) + anInt11127)
						* 377645301;
				class645_sub1_sub5_sub1_sub1.anInt11793 = (class528_sub42_sub2.readUnsignedShort((short) 23806) + anInt11127)
						* -808789795;
				class645_sub1_sub5_sub1_sub1.anInt11794 = (class528_sub42_sub2.readUnsignedShort((short) 22708) * -818794613);
				class645_sub1_sub5_sub1_sub1.quenedStepCount = -670034095;
				class645_sub1_sub5_sub1_sub1.anInt11818 = 0;
				class645_sub1_sub5_sub1_sub1.anInt11766 += (-888913659 * class645_sub1_sub5_sub1_sub1.sceneXQueue[0]);
				class645_sub1_sub5_sub1_sub1.anInt11765 += (class645_sub1_sub5_sub1_sub1.sceneYQueue[0] * -960732905);
				class645_sub1_sub5_sub1_sub1.anInt11787 += (class645_sub1_sub5_sub1_sub1.sceneXQueue[0] * 979283275);
				class645_sub1_sub5_sub1_sub1.anInt11789 += (1152853501 * class645_sub1_sub5_sub1_sub1.sceneYQueue[0]);
				class645_sub1_sub5_sub1_sub1.anInt11790 += 691421421 * class645_sub1_sub5_sub1_sub1.aByte10675;
				class645_sub1_sub5_sub1_sub1.anInt11791 += class645_sub1_sub5_sub1_sub1.aByte10675 * 842261403;
			}
			if (0 != (i_340_ & 0x80000)) {
				class528_sub42_sub2.pointer += -264964202;
				int i_404_ = ((class528_sub42_sub2.payload[((class528_sub42_sub2.pointer += 2015001547) * -185904669)
						- 1]) & 0xff);
				for (int i_405_ = 0; i_405_ < i_404_; i_405_++) {
					int i_406_ = class528_sub42_sub2.readUnsignedByte((byte) 46);
					Class483 class483 = ((Class483) Class443.method5321(Class483.method5867((byte) 1), i_406_,
							2079734180));
					Class411 class411 = (Class664.aClass95_Sub1_Sub1_8460.method8256(class528_sub42_sub2, class483,
							492936128));
					class645_sub1_sub5_sub1_sub1.anInterface2_11798.method15(1862601893 * class411.anInt4711,
							class411.anObject4712, -138663257);
				}
			}
			if (0 != (i_340_ & 0x1)) {
				if (class645_sub1_sub5_sub1_sub1.aClass299_12043.method4002((byte) 69))
					Class692.method8152(class645_sub1_sub5_sub1_sub1, 339289776);
				class645_sub1_sub5_sub1_sub1
						.method10899(
								((Class299) (Class21.aClass5_Sub8_214
										.method63(class528_sub42_sub2.method9645((short) 12356), 2101198396))),
								0 == (i_340_ & 0x400000), (i_340_ & 0x100000) == 0, true, 2113558515);
				class645_sub1_sub5_sub1_sub1
						.setSize((class645_sub1_sub5_sub1_sub1.aClass299_12043.anInt3321 * -2134279851), -912435848);
				class645_sub1_sub5_sub1_sub1.anInt11760 = -1365090067
						* (65886605 * (class645_sub1_sub5_sub1_sub1.aClass299_12043.anInt3301) << 3);
				if (class645_sub1_sub5_sub1_sub1.aClass299_12043.method4002((byte) 75))
					Class293.method3961(class645_sub1_sub5_sub1_sub1.aByte10675,
							class645_sub1_sub5_sub1_sub1.sceneXQueue[0], class645_sub1_sub5_sub1_sub1.sceneYQueue[0], 0,
							null, class645_sub1_sub5_sub1_sub1, null, (short) 857);
			}
			if ((i_340_ & 0x40) != 0) {
				class645_sub1_sub5_sub1_sub1.anInt12031 = class528_sub42_sub2.readLEShortA(1173545383) * 327351317;
				class645_sub1_sub5_sub1_sub1.anInt12032 = class528_sub42_sub2.readLEShortA(1822736591) * 259201889;
			}
			if (0 != (i_340_ & 0x200000)) {
				int i_407_ = class528_sub42_sub2.method9614(-1220398584);
				int[] is = new int[8];
				short[] is_408_ = new short[8];
				for (int i_409_ = 0; i_409_ < 8; i_409_++) {
					if (0 != (i_407_ & 1 << i_409_)) {
						is[i_409_] = class528_sub42_sub2.method9645((short) 15659);
						is_408_[i_409_] = (short) class528_sub42_sub2.method9725(-508439300);
					} else {
						is[i_409_] = -1;
						is_408_[i_409_] = (short) -1;
					}
				}
				class645_sub1_sub5_sub1_sub1.aClass281_12037 = new Class281(is, is_408_);
			}
			if ((i_340_ & 0x20000000) != 0) {
				int i_410_ = class528_sub42_sub2.readUnsignedShort(-1485483088);
				int i_411_ = class528_sub42_sub2.readIntB(-732201934);
				if (i_410_ == 65535)
					i_410_ = -1;
				int i_412_ = class528_sub42_sub2.readUnsignedByte((byte) 79);
				int i_413_ = i_412_ & 0x7;
				int i_414_ = i_412_ >> 3 & 0xf;
				if (i_414_ == 15)
					i_414_ = -1;
				boolean bool = 1 == (i_412_ >> 7 & 0x1);
				class645_sub1_sub5_sub1_sub1.method10667(i_410_, i_411_, i_413_, i_414_, bool, 2, (byte) 66);
			}
			if ((i_340_ & 0x400) != 0) {
				int i_415_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.anIntArray3271).length;
				int i_416_ = 0;
				if (null != (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3284))
					i_416_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3284).length;
				int i_417_ = 0;
				if (null != (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3320))
					i_417_ = (class645_sub1_sub5_sub1_sub1.aClass299_12043.aShortArray3320).length;
				int i_418_ = class528_sub42_sub2.method9614(-1220398584);
				if (1 == (i_418_ & 0x1))
					class645_sub1_sub5_sub1_sub1.aClass287_12033 = null;
				else {
					class528_sub42_sub2.pointer += -264964202;
					int[] is = null;
					float[] fs = null;
					int[][] is_419_ = null;
					int[][] is_420_ = null;
					if (2 == (i_418_ & 0x2)) {
						is = new int[i_415_];
						if ((i_418_ & 0x10) == 16) {
							fs = new float[i_415_];
							is_419_ = new int[i_415_][3];
							is_420_ = new int[i_415_][3];
						}
						for (int i_421_ = 0; i_421_ < i_415_; i_421_++) {
							is[i_421_] = class528_sub42_sub2.method9645((short) 19493);
							if (16 == (i_418_ & 0x10) && -1 != is[i_421_]) {
								fs[i_421_] = class528_sub42_sub2.method9635(-2069883304);
								for (int i_422_ = 0; i_422_ < 3; i_422_++)
									is_419_[i_421_][i_422_] = class528_sub42_sub2.method9668(-1684123310);
								for (int i_423_ = 0; i_423_ < 3; i_423_++)
									is_420_[i_421_][i_423_] = class528_sub42_sub2.method9612(1289742020);
							}
						}
					}
					short[] is_424_ = null;
					if (4 == (i_418_ & 0x4)) {
						is_424_ = new short[i_416_];
						for (int i_425_ = 0; i_425_ < i_416_; i_425_++)
							is_424_[i_425_] = (short) class528_sub42_sub2.readLEShortA(960400670);
					}
					short[] is_426_ = null;
					if (8 == (i_418_ & 0x8)) {
						is_426_ = new short[i_417_];
						for (int i_427_ = 0; i_427_ < i_417_; i_427_++)
							is_426_[i_427_] = (short) class528_sub42_sub2.readUnsignedShort((short) 30296);
					}
					long l = (NPC.anInt12034 += 519628303) * 826493167 - 1;
					class645_sub1_sub5_sub1_sub1.aClass287_12033 = new Class287(l, is, fs, is_419_, is_420_, is_424_,
							is_426_);
				}
			}
		}
	}

	static final void method10250() {
		Class304.aClass229Array3347 = null;
		Class474.method5827(2088127151 * anInt10978, 0, 0, Class411.anInt4713 * -1117838587, -2142152407 * anInt6933, 0,
				0, -1, (byte) 79);
		if (null != Class304.aClass229Array3347) {
			Class564.method6829(Class304.aClass229Array3347, -1412584499, 0, 0, Class411.anInt4713 * -1117838587,
					anInt6933 * -2142152407, Class285.anInt3128 * 1642816321, 1570889407 * Class8_Sub1.anInt10772,
					(aClass229_10987 == Class137.aClass229_1632 ? -1 : -188853385 * aClass229_10987.anInt2553), true,
					-131947697);
			Class304.aClass229Array3347 = null;
		}
	}

	public static void method10251(int i, int i_428_) {
		Class528_Sub34 class528_sub34 = Class656.method7845(OutgoingOpcode.aClass403_4559, aClass109_10930.aClass10_1379,
				-2040660313);
		class528_sub34.aClass528_Sub42_Sub2_10481.method9671(i, 668499139);
		class528_sub34.aClass528_Sub42_Sub2_10481.method9661(i_428_, 1719945955);
		aClass109_10930.method1380(class528_sub34, 275181048);
	}

	static final void method10252() {
		Class304.aClass229Array3347 = null;
		Class474.method5827(2088127151 * anInt10978, 0, 0, Class411.anInt4713 * -1117838587, -2142152407 * anInt6933, 0,
				0, -1, (byte) 0);
		if (null != Class304.aClass229Array3347) {
			Class564.method6829(Class304.aClass229Array3347, -1412584499, 0, 0, Class411.anInt4713 * -1117838587,
					anInt6933 * -2142152407, Class285.anInt3128 * 1642816321, 1570889407 * Class8_Sub1.anInt10772,
					(aClass229_10987 == Class137.aClass229_1632 ? -1 : -188853385 * aClass229_10987.anInt2553), true,
					1880553726);
			Class304.aClass229Array3347 = null;
		}
	}

	static final void method10253(boolean bool) {
		Class698.method8209(anInt10978 * 2088127151, Class411.anInt4713 * -1117838587, anInt6933 * -2142152407, bool,
				-395755183);
	}

	static final void method10254(boolean bool) {
		Class698.method8209(anInt10978 * 2088127151, Class411.anInt4713 * -1117838587, anInt6933 * -2142152407, bool,
				-55726835);
	}

	@Override
	final void method6199() {
		if (3 != anInt10876 * 175711435) {
			if ((15 == 175711435 * anInt10876 || ScenePacketType.method4846(anInt10876 * 175711435, -2088323411)
					|| Class309.method4127(175711435 * anInt10876, 2130436643)) && null != Class365.aClass218_3848)
				Class365.aClass218_3848.method3109(Class365.aClass218_3848.method3107(2023566609),
						Class514.aClass528_Sub38_6967.aClass691_Sub34_10584.method10132((byte) 18), (byte) 0);
			if (aBool10936) {
				synchronized (anObject10938) {
					anObject10938.notify();
				}
				synchronized (anObject10937) {
					try {
						anObject10937.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool10936 = false;
			}
			anInt11127++;
			if (anInt11127 % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				Class464.anInt5305 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10
						+ gregoriancalendar.get(13) / 6);
				aRandom10970.setSeed(Class464.anInt5305);
			}
			long l = Class249.method3417(1932511583);
			aClass109_10930.method1387(-1462696973);
			aClass109_11162.method1387(-1292366153);
			method10260(1913983774);
			if (null != Class244.aClass428_2737)
				Class244.aClass428_2737.method5152(-31932756);
			if (null != Class365.aClass218_3848)
				Class365.aClass218_3848.method3125(-362154873);
			Class416.aClass544_4749.method6643(-1698857178);
			Class95_Sub1_Sub2.aClass537_11200.method6498(-1066858422);
			Class372.method4676(Class587.aClass173_7714, l);
			if (Class587.aClass173_7714 != null)
				Class587.aClass173_7714.method2158((int) l);
			anInt10995 = 0;
			anInt10906 = 0;
			for (Interface61 interface61 = Class416.aClass544_4749.method6645(
					1793269677); null != interface61; interface61 = Class416.aClass544_4749.method6645(1793269677)) {
				int i = interface61.method48(-2006940998);
				if (i == 2 || i == 3) {
					if (-1384174071 * anInt10995 < 128) {
						anInterface61Array11123[anInt10995 * -1384174071] = interface61;
						anInt10995 += 619233337;
					}
				} else if (i == 0) {
					if (Class26.method708((short) -7437) && interface61.method384(1800629466) == 28) {
						if (playerRights * 859247239 >= 2 && Class416.aClass544_4749.method6644(82, 1977602869)) {
							if (Class677.method7955(-225278296))
								Class327.method4262(115096820);
							else
								Class308.method4118(Class108.myPlayer.method169(916252759), -561150433);
						} else if (Class194.method2812(1439800124)
								&& (Class514.aClass528_Sub38_6967.aClass691_Sub26_10573.method10035(1536180109) == 0
										|| Class416.aClass544_4749.method6644(86, 6806887)))
							Class301.method4022((byte) 8);
						else if (Class514.aClass528_Sub38_6967.aClass691_Sub26_10573.method10035(379952262) == 0
								|| Class416.aClass544_4749.method6644(86, 410708016))
							HandshakeOpcode.method4870((byte) 37);
						else
							Class173.method2555(
									(Class39.aClass39_343.method807((Class378_Sub2.aClass668_10123), (byte) 102)),
									-787565797);
					}
					if (anInt10906 * 691559213 < 77) {
						anInterface61Array10907[anInt10906 * 691559213] = interface61;
						anInt10906 += -1644712795;
					}
				}
			}
			anInt10926 = 0;
			for (Class528_Sub33 class528_sub33 = Class95_Sub1_Sub2.aClass537_11200
					.method6508(12358400); class528_sub33 != null; class528_sub33 = Class95_Sub1_Sub2.aClass537_11200
							.method6508(12358400)) {
				int i = class528_sub33.method9506((byte) -32);
				if (-1 == i)
					Class589.method7074(class528_sub33, 1521609046);
				else if (i == 6) {
					anInt10926 += class528_sub33.method9496(165433223) * 929267889;
					class528_sub33.method9510((byte) -46);
				} else if (Class321_Sub2.method9081(i, -707742689)) {
					aClass688_10900.method8031(class528_sub33, (byte) 17);
					if (aClass688_10900.method8039(-1730658658) > 10) {
						Class528_Sub33 class528_sub33_429_ = ((Class528_Sub33) aClass688_10900.method8032(-1490570711));
						if (class528_sub33_429_ != null)
							class528_sub33_429_.method9510((byte) -40);
					}
				}
			}
			if (Class194.method2812(1439800124))
				Class190.method2784(804273529);
			if (Class539.method6615(anInt10876 * 175711435, -1775051970)) {
				Class192.method2795(1278114172);
				Class450.method5430((byte) -11);
			} else if (Class667.method7910(175711435 * anInt10876, 1649612549))
				aClass495_10935.method5980((byte) 8);
			if (ScenePacketType.method4846(anInt10876 * 175711435, -1818120625)
					&& !Class667.method7910(anInt10876 * 175711435, 1741613078)) {
				method10194((byte) -20);
				Class691_Sub19.method9974(1708325665);
				ProtocolLoop.method1059((byte) -11);
			} else if (Class309.method4127(175711435 * anInt10876, 2130436643)
					&& !Class667.method7910(anInt10876 * 175711435, 570796677)) {
				method10194((byte) -74);
				ProtocolLoop.method1059((byte) -66);
			} else if (175711435 * anInt10876 == 0)
				ProtocolLoop.method1059((byte) -89);
			else if (Class622.method7419(175711435 * anInt10876, (byte) -45)
					&& !Class667.method7910(anInt10876 * 175711435, 1508534389))
				Class19.method647(-2078812814);
			else if (anInt10876 * 175711435 == 17 || anInt10876 * 175711435 == 7) {
				ProtocolLoop.method1059((byte) -68);
				if (-3 != Class54.anInt669 * -1852659257 && -1852659257 * Class54.anInt669 != 2
						&& 15 != Class54.anInt669 * -1852659257) {
					if (175711435 * anInt10876 == 7) {
						Class54.anInt672 = Class54.anInt679 * -1497558947;
						Class54.anInt645 = Class54.anInt674 * 146226169;
						Class54.anInt670 = -2095807961 * Class54.anInt669;
						if (Class616.aBool8033) {
							Class168.method2100(Class281.aClass16_3066.anInt192 * 2027542149,
									Class281.aClass16_3066.aString194, -1255012695 * Class281.aClass16_3066.anInt193,
									1401645101 * Class281.aClass16_3066.anInt191, 1411505198);
							aClass109_10930.method1397((short) -21242);
							Class487.method5890(17, 2130003981);
						} else
							Class416.method4969(Class54.aBool675, 5126206);
					} else
						Class416.method4969(false, 5126206);
				}
			}
			Class54.method956(Class587.aClass173_7714, 1991322021);
			aClass688_10900.method8032(-1490570711);
			if (Class587.aClass173_7714 != null) {
				Iterator iterator = aMap11051.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Class105 class105 = (Class105) entry.getValue();
					if (class105.method1352(-1037282141)) {
						byte[] is = class105.method1353(947798582);
						if (is != null) {
							try {
								BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
								int[] is_430_ = Class207.method2927(bufferedimage, -1253589563);
								Class151 class151 = (Class587.aClass173_7714.method2418(is_430_, 0,
										bufferedimage.getWidth(), bufferedimage.getWidth(), bufferedimage.getHeight(),
										-2120794697));
								aClass186_11173.method2729(class151, ((Integer) entry.getKey()).intValue());
							} catch (IOException ioexception) {
								VarDomainType.method5340(Class326.aclient3497.method6214(393149124), ioexception,
										1762988144);
							}
						}
						iterator.remove();
					}
				}
			}
		}
	}

	public static final void method10255() {
		aBool11055 = true;
	}

	public static final void method10256() {
		aBool11055 = true;
	}

	static final void method10257() {
		Class39.method811(aClass229_11067, 1435904523);
		ItemType.anInt104 += 10694151;
		if (!aBool10890 || !aBool11041) {
			if (-1758535753 * ItemType.anInt104 > 1) {
				aClass229_11067 = null;
				aClass229_10987 = null;
			}
		} else {
			int i = Class95_Sub1_Sub2.aClass537_11200.method6507(713797094);
			int i_431_ = Class95_Sub1_Sub2.aClass537_11200.method6504((byte) -60);
			i -= anInt11069 * -62197331;
			i_431_ -= -525017675 * anInt11070;
			if (i < -208716081 * anInt11073)
				i = -208716081 * anInt11073;
			if (i + aClass229_11067.anInt2476 * -1352480433 > -208716081 * anInt11073 + 506740607 * anInt11075)
				i = (-208716081 * anInt11073 + 506740607 * anInt11075 - -1352480433 * aClass229_11067.anInt2476);
			if (i_431_ < -255571367 * anInt11074)
				i_431_ = anInt11074 * -255571367;
			if (i_431_ + aClass229_11067.anInt2458 * 1661025435 > -1525398647 * anInt11076 + -255571367 * anInt11074)
				i_431_ = (anInt11074 * -255571367 + anInt11076 * -1525398647 - 1661025435 * aClass229_11067.anInt2458);
			int i_432_;
			int i_433_;
			if (Class137.aClass229_1632 == aClass229_10987) {
				i_432_ = i;
				i_433_ = i_431_;
			} else {
				i_432_ = (i - anInt11073 * -208716081 + aClass229_10987.anInt2400 * -1014124179);
				i_433_ = (1665217863 * aClass229_10987.anInt2401 + (i_431_ - -255571367 * anInt11074));
			}
			if (!Class95_Sub1_Sub2.aClass537_11200.method6502(-627985227)) {
				if (aBool11055) {
					Class7.method565(-1187426900);
					if (null != aClass229_11067.anObjectArray2493) {
						Class528_Sub30 class528_sub30 = new Class528_Sub30();
						class528_sub30.aClass229_10461 = aClass229_11067;
						class528_sub30.anInt10459 = -391683557 * i_432_;
						class528_sub30.anInt10464 = 388878445 * i_433_;
						Class229 class229 = method10202(aClass229_11067);
						Class229 class229_434_ = aClass229_11071;
						boolean bool = false;
						for (/**/; (class229_434_ != null && -1 != -1027873541 * class229_434_.anInt2522
								&& null != class229); class229_434_ = (Class380.aClass226Array3970[class229_434_.anInt2376
										* 306930455 >> 16].aClass229Array2336[(class229_434_.anInt2522 * -1027873541
												& 0xffff)])) {
							if (306930455 * class229_434_.anInt2376 == 306930455 * class229.anInt2376) {
								bool = true;
								break;
							}
						}
						if (class229_434_ != null && null != class229 && Class137.aClass229_1632 != class229 && !bool)
							class528_sub30.aClass229_10463 = Class137.aClass229_1632;
						else
							class528_sub30.aClass229_10463 = aClass229_11071;
						class528_sub30.anObjectArray10460 = aClass229_11067.anObjectArray2493;
						Class555.method6741(class528_sub30, (short) -24721);
					}
					if (aClass229_11071 != null && method10202(aClass229_11067) != null)
						Class242.method3378(aClass229_11067, aClass229_11071, -520794877);
				} else if ((-1046544163 * anInt11046 == 1 || Class552.method6715(717927929))
						&& -1024340783 * Class28.anInt303 > 2)
					Class5_Sub18.method10185((-483492961 * anInt11078 + anInt11069 * -62197331),
							(anInt11070 * -525017675 + -1428876217 * anInt11079), (byte) 66);
				else if (Class71.method1096((byte) 98))
					Class5_Sub18.method10185((-62197331 * anInt11069 + anInt11078 * -483492961),
							(-1428876217 * anInt11079 + anInt11070 * -525017675), (byte) 96);
				aClass229_11067 = null;
				aClass229_10987 = null;
			} else {
				if (-1758535753 * ItemType.anInt104 > aClass229_11067.anInt2480 * 1823380081) {
					int i_435_ = i - anInt11078 * -483492961;
					int i_436_ = i_431_ - -1428876217 * anInt11079;
					if (i_435_ > aClass229_11067.anInt2510 * 325431661
							|| i_435_ < -(325431661 * aClass229_11067.anInt2510)
							|| i_436_ > aClass229_11067.anInt2510 * 325431661
							|| i_436_ < -(325431661 * aClass229_11067.anInt2510))
						aBool11055 = true;
				}
				if (aClass229_11067.anObjectArray2501 != null && aBool11055) {
					Class528_Sub30 class528_sub30 = new Class528_Sub30();
					class528_sub30.aClass229_10461 = aClass229_11067;
					class528_sub30.anInt10459 = -391683557 * i_432_;
					class528_sub30.anInt10464 = i_433_ * 388878445;
					class528_sub30.anObjectArray10460 = aClass229_11067.anObjectArray2501;
					Class555.method6741(class528_sub30, (short) -28897);
				}
			}
		}
	}

	static final void method10258() {
		byte[][][] is = aClass495_10935.method5978((byte) -60);
		byte i = (byte) (-2032978979 * anInt10968 - 4 & 0xff);
		int i_437_ = (-2032978979 * anInt10968 % aClass495_10935.method6029((short) 26390));
		for (int i_438_ = 0; i_438_ < 4; i_438_++) {
			for (int i_439_ = 0; i_439_ < aClass495_10935.method5967(1537073219); i_439_++)
				is[i_438_][i_437_][i_439_] = i;
		}
		if (3 != Class181_Sub5.anInt9778 * 1926870089) {
			for (int i_440_ = 0; i_440_ < 2; i_440_++) {
				anIntArray10880[i_440_] = -1000000;
				anIntArray11013[i_440_] = 1000000;
				anIntArray11014[i_440_] = 0;
				anIntArray11012[i_440_] = 1000000;
				anIntArray10967[i_440_] = 0;
			}
			Class422 class422 = (Class108.myPlayer.method7693().aClass422_4868);
			Class466 class466 = aClass495_10935.method6006((byte) 0);
			Class538 class538 = aClass495_10935.method5973((byte) 52);
			if (4 == Class390.anInt4111 * -1860881523 || 6 == -1860881523 * Class390.anInt4111
					|| -1 != Class690_Sub2.anInt10780 * -958954655) {
				Class578 class578 = aClass495_10935.method5966(1273279609);
				int i_441_;
				int i_442_;
				if (6 == -1860881523 * Class390.anInt4111) {
					Class422 class422_443_ = Class495.aClass283_Sub1_5578.method3785((byte) 24).method7988(213449377);
					if (Float.isNaN(class422_443_.aFloat4780))
						return;
					i_441_ = ((int) class422_443_.aFloat4780 - (class578.anInt7607 * 961465569 << 9));
					i_442_ = ((int) class422_443_.aFloat4777 - (class578.anInt7608 * -173815201 << 9));
					if (i_441_ < 0 || i_442_ < 0
							|| (i_441_ >> 9 >= (class466.aByteArrayArrayArray5312[1926870089
									* Class181_Sub5.anInt9778]).length)
							|| (i_442_ >> 9 >= (class466.aByteArrayArrayArray5312[1926870089
									* Class181_Sub5.anInt9778][i_441_ >> 9]).length))
						return;
				} else if (4 == Class390.anInt4111 * -1860881523) {
					i_441_ = (int) class422.aFloat4780;
					i_442_ = (int) class422.aFloat4777;
				} else {
					i_441_ = Class690_Sub2.anInt10780 * -958954655;
					i_442_ = Class386.anInt4069 * 305017743;
				}
				if (0 != ((class466.aByteArrayArrayArray5312[Class181_Sub5.anInt9778
						* 1926870089][i_441_ >> 9][i_442_ >> 9]) & 0x4))
					Class209.method2945(class538.aClass546ArrayArrayArray7160, 0, i_441_ >> 9, i_442_ >> 9, false,
							1303804950);
				else {
					int i_444_;
					int i_445_;
					if (-1860881523 * Class390.anInt4111 == 6) {
						Class422 class422_446_ = Class495.aClass283_Sub1_5578.method3811(-1853266681)
								.method4236((byte) 106);
						i_444_ = (((int) class422_446_.aFloat4780 >> 9) - class578.anInt7607 * 961465569);
						i_445_ = (((int) class422_446_.aFloat4777 >> 9) - -173815201 * class578.anInt7608);
						if (i_444_ < 0 || i_445_ < 0
								|| i_444_ >= (class466.aByteArrayArrayArray5312[(Class181_Sub5.anInt9778
										* 1926870089)]).length
								|| (i_445_ >= (class466.aByteArrayArrayArray5312[1926870089
										* Class181_Sub5.anInt9778][i_444_]).length))
							return;
					} else {
						i_444_ = -639218145 * Class626.anInt8136 >> 9;
						i_445_ = -1246131271 * Class227.anInt2347 >> 9;
					}
					int i_447_ = i_441_ >> 9;
					int i_448_ = i_442_ >> 9;
					if (class466.method5630(i_444_, i_445_, (byte) 54)) {
						int i_449_ = (Class335_Sub1_Sub1.method10374(-639218145 * Class626.anInt8136,
								Class227.anInt2347 * -1246131271, 3, -759833206));
						if (Class137.anInt1630 * 950408709 >= i_449_)
							Class209.method2945(class538.aClass546ArrayArrayArray7160, 1, i_444_, i_445_, false,
									1024740449);
					} else {
						while_69_: do {
							if (Class309_Sub1.anInt9907 * -499166573 < 2560) {
								int i_450_;
								if (i_447_ > i_444_)
									i_450_ = i_447_ - i_444_;
								else
									i_450_ = i_444_ - i_447_;
								int i_451_;
								if (i_448_ > i_445_)
									i_451_ = i_448_ - i_445_;
								else
									i_451_ = i_445_ - i_448_;
								if (i_450_ == 0 && i_451_ == 0 || (i_450_ <= -aClass495_10935.method6029((short) 12717))
										|| i_450_ >= aClass495_10935.method6029((short) 24282)
										|| i_451_ <= -aClass495_10935.method5967(1909600908)
										|| i_451_ >= aClass495_10935.method5967(1451012152)) {
									if (6 != Class390.anInt4111 * -1860881523)
										VarDomainType.method5340(new StringBuilder().append(i_444_)
												.append(Class49.aString555).append(i_445_).append(" ").append(i_447_)
												.append(Class49.aString555).append(i_448_).append(" ")
												.append(961465569 * class578.anInt7607).append(Class49.aString555)
												.append(-173815201 * class578.anInt7608).toString(),
												new RuntimeException(), 1879731532);
									break;
								}
								if (i_450_ > i_451_) {
									int i_452_ = i_451_ * 65536 / i_450_;
									int i_453_ = 32768;
									while_68_: do {
										for (;;) {
											if (i_447_ == i_444_)
												break while_68_;
											if (i_444_ < i_447_)
												i_444_++;
											else if (i_444_ > i_447_)
												i_444_--;
											if (((class466.aByteArrayArrayArray5312[(1926870089
													* Class181_Sub5.anInt9778)][i_444_][i_445_]) & 0x4) != 0) {
												Class209.method2945((class538.aClass546ArrayArrayArray7160), 1, i_444_,
														i_445_, false, 1033953895);
												break while_68_;
											}
											if ((1 + i_445_ < (class466.aByteArrayArrayArray5312[(Class181_Sub5.anInt9778
													* 1926870089)][i_444_]).length)
													&& (0 != ((class466.aByteArrayArrayArray5312[(1926870089
															* (Class181_Sub5.anInt9778))][i_444_][i_445_ + 1])
															& 0x4))) {
												Class209.method2945((class538.aClass546ArrayArrayArray7160), 1, i_444_,
														1 + i_445_, false, 398364936);
												break while_68_;
											}
											if (i_445_ > 0 && ((class466.aByteArrayArrayArray5312[(1926870089
													* (Class181_Sub5.anInt9778))][i_444_][i_445_ - 1]) & 0x4) != 0) {
												Class209.method2945((class538.aClass546ArrayArrayArray7160), 1, i_444_,
														i_445_ - 1, false, -71064387);
												break while_68_;
											}
											i_453_ += i_452_;
											if (i_453_ >= 65536) {
												i_453_ -= 65536;
												if (i_445_ < i_448_) {
													i_445_++;
													if ((1 + i_445_ < (class466.aByteArrayArrayArray5312[(1926870089
															* (Class181_Sub5.anInt9778))][i_444_]).length)
															&& ((class466.aByteArrayArrayArray5312[((Class181_Sub5.anInt9778)
																	* 1926870089)][i_444_][1 + i_445_]) & 0x4) != 0) {
														Class209.method2945((class538.aClass546ArrayArrayArray7160), 1,
																i_444_, i_445_ + 1, false, 1169151691);
														break while_68_;
													}
												} else if (i_445_ > i_448_ && --i_445_ > 0
														&& ((class466.aByteArrayArrayArray5312[((Class181_Sub5.anInt9778)
																* 1926870089)][i_444_][i_445_ - 1]) & 0x4) != 0)
													break;
											}
										}
										Class209.method2945((class538.aClass546ArrayArrayArray7160), 1, i_444_,
												i_445_ - 1, false, 2080890182);
									} while (false);
								} else {
									int i_454_ = 65536 * i_450_ / i_451_;
									int i_455_ = 32768;
									for (;;) {
										if (i_448_ == i_445_)
											break while_69_;
										if (i_445_ < i_448_)
											i_445_++;
										else if (i_445_ > i_448_)
											i_445_--;
										if (((class466.aByteArrayArrayArray5312[(Class181_Sub5.anInt9778
												* 1926870089)][i_444_][i_445_]) & 0x4) != 0) {
											Class209.method2945((class538.aClass546ArrayArrayArray7160), 1, i_444_,
													i_445_, false, 329470999);
											break while_69_;
										}
										if ((1 + i_444_ < (class466.aByteArrayArrayArray5312[(1926870089
												* (Class181_Sub5.anInt9778))]).length)
												&& 0 != ((class466.aByteArrayArrayArray5312[(1926870089
														* (Class181_Sub5.anInt9778))][i_444_ + 1][i_445_]) & 0x4)) {
											Class209.method2945((class538.aClass546ArrayArrayArray7160), 1, 1 + i_444_,
													i_445_, false, 1322504697);
											break while_69_;
										}
										if (i_444_ > 0 && ((class466.aByteArrayArrayArray5312[(1926870089
												* Class181_Sub5.anInt9778)][i_444_ - 1][i_445_]) & 0x4) != 0) {
											Class209.method2945((class538.aClass546ArrayArrayArray7160), 1, i_444_ - 1,
													i_445_, false, 464978018);
											break while_69_;
										}
										i_455_ += i_454_;
										if (i_455_ >= 65536) {
											i_455_ -= 65536;
											if (i_444_ < i_447_) {
												i_444_++;
												if ((1 + i_444_ < (class466.aByteArrayArrayArray5312[((Class181_Sub5.anInt9778)
														* 1926870089)]).length)
														&& ((class466.aByteArrayArrayArray5312[(1926870089
																* (Class181_Sub5.anInt9778))][1 + i_444_][i_445_])
																& 0x4) != 0) {
													Class209.method2945((class538.aClass546ArrayArrayArray7160), 1,
															i_444_ + 1, i_445_, false, 1387892691);
													break while_69_;
												}
											} else
												if (i_444_ > i_447_ && --i_444_ > 0
														&& (0 != ((class466.aByteArrayArrayArray5312[(1926870089
																* (Class181_Sub5.anInt9778))][i_444_ - 1][i_445_])
																& 0x4)))
												break;
										}
									}
									Class209.method2945(class538.aClass546ArrayArrayArray7160, 1, i_444_ - 1, i_445_,
											false, 581096624);
								}
							}
						} while (false);
					}
				}
			} else {
				int i_456_ = (Class335_Sub1_Sub1.method10374(Class626.anInt8136 * -639218145,
						Class227.anInt2347 * -1246131271, 1926870089 * Class181_Sub5.anInt9778, -759833206));
				if (i_456_ - Class137.anInt1630 * 950408709 < 3200
						&& ((class466.aByteArrayArrayArray5312[1926870089 * Class181_Sub5.anInt9778][Class626.anInt8136
								* -639218145 >> 9][-1246131271 * Class227.anInt2347 >> 9]) & 0x4) != 0)
					Class209.method2945(class538.aClass546ArrayArrayArray7160, 1, Class626.anInt8136 * -639218145 >> 9,
							Class227.anInt2347 * -1246131271 >> 9, false, 1501149093);
			}
		}
	}

	static final void method10259() {
		for (Class528_Sub21_Sub10 class528_sub21_sub10 = ((Class528_Sub21_Sub10) aClass688_11043.method8034(
				1819478428)); null != class528_sub21_sub10; class528_sub21_sub10 = ((Class528_Sub21_Sub10) aClass688_11043
						.method8037(696424436))) {
			Class645_Sub1_Sub5_Sub6 class645_sub1_sub5_sub6 = (class528_sub21_sub10.aClass645_Sub1_Sub5_Sub6_11583);
			if (anInt11127 > class645_sub1_sub5_sub6.anInt12008 * -108038505) {
				class528_sub21_sub10.method6443(1582382039);
				class645_sub1_sub5_sub6.method10885(-977882301);
			} else if (anInt11127 >= class645_sub1_sub5_sub6.anInt12011 * -39303101) {
				class645_sub1_sub5_sub6.method10880(953309448);
				if (class645_sub1_sub5_sub6.anInt12016 * 1063966653 > 0) {
					if (0 == anInt10943 * 345087519) {
						Entity class645_sub1_sub5_sub1 = Class185.aClass182Array2106[(class645_sub1_sub5_sub6.anInt12016
								* 1063966653) - 1].method2689(-1012043543);
						if (null != class645_sub1_sub5_sub1) {
							Class422 class422 = (class645_sub1_sub5_sub1.method7693().aClass422_4868);
							if ((int) class422.aFloat4780 >= 0
									&& ((int) class422.aFloat4780 < aClass495_10935.method6029((short) 22111) * 512)
									&& (int) class422.aFloat4777 >= 0
									&& ((int) class422.aFloat4777 < (aClass495_10935.method5967(-18940672) * 512)))
								class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780,
										(int) class422.aFloat4777,
										((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
												(int) class422.aFloat4777, class645_sub1_sub5_sub1.aByte10675,
												-759833206)) - 1004576393 * (class645_sub1_sub5_sub6.anInt12026)),
										anInt11127, -411634107);
						}
					} else {
						Class528_Sub31 class528_sub31 = ((Class528_Sub31) (aClass692_11110
								.method8137((1063966653 * class645_sub1_sub5_sub6.anInt12016) - 1)));
						if (null != class528_sub31) {
							NPC class645_sub1_sub5_sub1_sub1 = ((NPC) class528_sub31.anObject10468);
							Class422 class422 = (class645_sub1_sub5_sub1_sub1.method7693().aClass422_4868);
							if ((int) class422.aFloat4780 >= 0
									&& ((int) class422.aFloat4780 < (aClass495_10935.method6029((short) 4316) * 512))
									&& (int) class422.aFloat4777 >= 0
									&& ((int) class422.aFloat4777 < (aClass495_10935.method5967(119273697) * 512)))
								class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780,
										(int) class422.aFloat4777,
										((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
												(int) class422.aFloat4777, class645_sub1_sub5_sub6.aByte10675,
												-759833206)) - (class645_sub1_sub5_sub6.anInt12026 * 1004576393)),
										anInt11127, 17535377);
						}
					}
				}
				if (1063966653 * class645_sub1_sub5_sub6.anInt12016 < 0) {
					int i = (-(class645_sub1_sub5_sub6.anInt12016 * 1063966653) - 1);
					Player class645_sub1_sub5_sub1_sub2;
					if (-1453744879 * anInt11025 == i)
						class645_sub1_sub5_sub1_sub2 = Class108.myPlayer;
					else
						class645_sub1_sub5_sub1_sub2 = localPlayers[i];
					if (class645_sub1_sub5_sub1_sub2 != null) {
						Class422 class422 = (class645_sub1_sub5_sub1_sub2.method7693().aClass422_4868);
						if ((int) class422.aFloat4780 >= 0
								&& ((int) class422.aFloat4780 < (aClass495_10935.method6029((short) 13483) * 512))
								&& (int) class422.aFloat4777 >= 0
								&& ((int) class422.aFloat4777 < (aClass495_10935.method5967(1351096951) * 512)))
							class645_sub1_sub5_sub6.method10883((int) class422.aFloat4780, (int) class422.aFloat4777,
									((Class335_Sub1_Sub1.method10374((int) class422.aFloat4780,
											(int) class422.aFloat4777, class645_sub1_sub5_sub6.aByte10675, -759833206))
											- (class645_sub1_sub5_sub6.anInt12026 * 1004576393)),
									anInt11127, -856984824);
					}
				}
				class645_sub1_sub5_sub6.method10881(-178309515 * anInt10971, -248445584);
				aClass495_10935.method5973((byte) 31).method6545(class645_sub1_sub5_sub6, true, 1971536344);
			}
		}
	}

	void method10260(int i) {
		boolean bool = Class700.aClass454_8734.method5469((byte) -16);
		if (!bool)
			method10206(-1366633713);
	}

	public static final void method10261() {
		if (!aBool11187) {
			aFloat11037 += (12.0F - aFloat11037) / 2.0F;
			aBool10982 = true;
			aBool11187 = true;
		}
	}

	@Override
	public final void method365() {
		if (method6182(-983669595)) {
			String string = "";
			Class405[] class405s = Class362.method4596(380570543);
			for (int i = 0; i < class405s.length; i++) {
				Class405 class405 = class405s[i];
				String string_457_ = Class196.anApplet2198.getParameter(class405.aString4645);
				if (null != string_457_) {
					switch (Integer.parseInt(class405.aString4645)) {
					case 3:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt192 = Integer.parseInt(string_457_) * 1068151373;
						break;
					case 32:
						if (string_457_.equalsIgnoreCase(Class49.aString550))
							aBool10869 = true;
						else
							aBool10869 = false;
						break;
					case 41:
						if (null == Class12.aClass16_174)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.aString194 = string_457_;
						break;
					case 22:
						if (Class12.aClass16_174 == null)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt193 = Integer.parseInt(string_457_) * 1685978521;
						break;
					case 39:
						anInt10863 = Integer.parseInt(string_457_) * -1786748395;
						if (anInt10863 * 1181441341 < 0 || (1181441341 * anInt10863 >= aColorArray10919.length))
							anInt10863 = 0;
						break;
					case 26:
						aString11077 = string_457_;
						break;
					case 35:
						if (string_457_.equalsIgnoreCase(Class49.aString550)) {
							/* empty */
						}
						break;
					case 21:
						if (Class12.aClass16_182 == null)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt191 = Integer.parseInt(string_457_) * -792516699;
						break;
					case 36:
						if (null == Class12.aClass16_174)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt191 = Integer.parseInt(string_457_) * -792516699;
						break;
					case 15:
						if (string_457_.equalsIgnoreCase(Class49.aString550))
							aBool10993 = true;
						else
							aBool10993 = false;
						break;
					case 17:
						if (string_457_.equals(Class49.aString550))
							aBool10956 = true;
						else
							aBool10956 = false;
						break;
					case 49:
						anInt10860 = Integer.parseInt(string_457_) * -1888478825;
						break;
					case 24:
						if (Class12.aClass16_177 == null)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.aString194 = string_457_;
						break;
					case 40:
						if (null == Class12.aClass16_175)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.aString194 = string_457_;
						break;
					case 2:
						if (null == Class12.aClass16_177)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt193 = Integer.parseInt(string_457_) * 1685978521;
						break;
					case 12:
						Class378_Sub2.aClass668_10123 = Class668.method7913(Integer.parseInt(string_457_), -741949694);
						break;
					case 29:
						Class217.aString2291 = string_457_;
						break;
					case 28:
						aString11054 = string_457_;
						break;
					case 45:
						aString10857 = string_457_;
						break;
					case 20:
						aString10866 = string_457_;
						if (aString10866.length() > 100)
							aString10866 = null;
						break;
					case 43:
						aClass673_11108 = Class628.method7519(Integer.parseInt(string_457_), (byte) 1);
						if (Class673.aClass673_8529 == aClass673_11108)
							Class688.aClass77_8657 = Class77.aClass77_804;
						else
							Class688.aClass77_8657 = Class77.aClass77_807;
						break;
					case 27:
						if (string_457_.equalsIgnoreCase(Class49.aString550))
							aBool10853 = true;
						else
							aBool10853 = false;
						break;
					case 9:
						aString10962 = string_457_;
						break;
					case 25:
						anInt10861 = Integer.parseInt(string_457_) * 771816177;
						break;
					case 50:
						if (Class12.aClass16_177 == null)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt191 = Integer.parseInt(string_457_) * -792516699;
						break;
					case 46:
						if (string_457_.equals(Class49.aString550))
							aBool10859 = true;
						else
							aBool10859 = false;
						break;
					case 18:
						anInt10856 = Integer.parseInt(string_457_) * -689310945;
						break;
					case 44:
						aString10867 = string_457_;
						break;
					case 11:
						break;
					case 31:
						Class522.aString7051 = string_457_;
						break;
					case 48:
						if (Class12.aClass16_174 == null)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt192 = Integer.parseInt(string_457_) * 1068151373;
						break;
					case 19:
						Class242.aClass696_2722 = Class573.method6867(Integer.parseInt(string_457_), 961465569);
						if (Class242.aClass696_2722 != Class696.aClass696_8711
								&& (Class242.aClass696_2722 != Class696.aClass696_8710)
								&& (Class242.aClass696_2722 != Class696.aClass696_8713)
								&& (Class242.aClass696_2722 != Class696.aClass696_8709))
							Class242.aClass696_2722 = Class696.aClass696_8709;
						break;
					case 8:
						Class646.aClass665_8386 = ((ModeWhere) Class443.method5321(ModeWhere.method7893(559552141),
								Integer.parseInt(string_457_), 1785012617));
						if (ModeWhere.aClass665_8465 == Class646.aClass665_8386)
							Class646.aClass665_8386 = ModeWhere.aClass665_8464;
						else if (!(Class646.aClass665_8386.method7892(Class667.aClass667_8485, 364491346))
								&& (ModeWhere.LIVE != Class646.aClass665_8386))
							Class646.aClass665_8386 = ModeWhere.LIVE;
						break;
					case 16:
						anInt11104 = Integer.parseInt(string_457_) * 1953172635;
						break;
					case 4:
						if (string_457_.equalsIgnoreCase(Class49.aString550))
							aBool10871 = true;
						else
							aBool10871 = false;
						break;
					case 38:
						if (string_457_.equalsIgnoreCase(Class49.aString550))
							aBool10914 = true;
						break;
					case 34:
						if (string_457_.equalsIgnoreCase(Class49.aString550))
							aBool10884 = true;
						else
							aBool10884 = false;
						break;
					case 1:
						break;
					case 30:
						if (null == Class12.aClass16_182)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt192 = Integer.parseInt(string_457_) * 1068151373;
						break;
					case 52:
						anInt10873 = Integer.parseInt(string_457_) * -1659944355;
						break;
					case 13:
						break;
					case 6:
						if (null == Class12.aClass16_177)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt192 = Integer.parseInt(string_457_) * 1068151373;
						break;
					default:
						VarDomainType.method5340("", new RuntimeException(), 1877593292);
						break;
					case 33:
						if (Class12.aClass16_182 == null)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt193 = Integer.parseInt(string_457_) * 1685978521;
						break;
					case 51:
						aString10868 = string_457_;
						break;
					case 37:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt191 = Integer.parseInt(string_457_) * -792516699;
						break;
					case 42:
						Class528_Sub35.anInt10494 = Integer.parseInt(string_457_) * -1958106627;
						break;
					case 23:
						break;
					case 47:
						anInt10862 = Integer.parseInt(string_457_) * 17704847;
						break;
					case 7:
						Class623.anInt8119 = Integer.parseInt(string_457_) * -1973001665;
						break;
					case 5:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt193 = Integer.parseInt(string_457_) * 1685978521;
						break;
					case 14:
						string = string_457_;
					}
				}
			}
			if (null == aString10962)
				aString10962 = "";
			Class510 class510 = new Class510(473615593 * anInt11124, -14625703 * anInt11022, anInt11019 * 2095238197,
					anInt11020 * -362064957, aClass673_11108.aString8536);
			Class326.aclient3497 = this;
			String string_458_ = Class242.aClass696_2722.aString8714;
			int i = 32 + Class242.aClass696_2722.anInt8708 * -313882147;
			if (!string.equals("")) {
				string_458_ = new StringBuilder().append(string_458_).append("_").append(string).toString();
				i = 0;
			}
			method6232(class510, aClass673_11108.aString8534, string_458_, i, Class668.method7924(-102853524), 857, 1,
					aBool10871, 573546491);
		}
	}

	static final void method10262() {
		int i = 0;
		Class538 class538 = aClass495_10935.method5973((byte) 44);
		for (int i_459_ = 0; i_459_ < aClass495_10935.method6029((short) 6821); i_459_++) {
			for (int i_460_ = 0; i_460_ < aClass495_10935.method5967(1862205946); i_460_++) {
				if (Class209.method2945(class538.aClass546ArrayArrayArray7160, i, i_459_, i_460_, true, 1290254534))
					i++;
				if (i >= 512)
					return;
			}
		}
	}

	static final void method10263() {
		Class304.aClass229Array3347 = null;
		Class474.method5827(2088127151 * anInt10978, 0, 0, Class411.anInt4713 * -1117838587, -2142152407 * anInt6933, 0,
				0, -1, (byte) -14);
		if (null != Class304.aClass229Array3347) {
			Class564.method6829(Class304.aClass229Array3347, -1412584499, 0, 0, Class411.anInt4713 * -1117838587,
					anInt6933 * -2142152407, Class285.anInt3128 * 1642816321, 1570889407 * Class8_Sub1.anInt10772,
					(aClass229_10987 == Class137.aClass229_1632 ? -1 : -188853385 * aClass229_10987.anInt2553), true,
					66454818);
			Class304.aClass229Array3347 = null;
		}
	}

	public static final void method10264() {
		for (int i = 0; i < 5; i++)
			aBoolArray11139[i] = false;
		anInt11065 = -681116073;
		anInt10988 = 159441195;
		Class215.anInt2272 = 0;
		Class480.anInt5455 = 0;
		Class390.anInt4111 = 2086833802;
		if (Class372.method4679(-1351430274) == 6) {
			Class578 class578 = aClass495_10935.method5966(1273279609);
			int i = class578.anInt7607 * 961465569 << 9;
			int i_461_ = -173815201 * class578.anInt7608 << 9;
			int i_462_ = 1000 / Class262.method3646(-1824734029);
			Class495.aClass283_Sub1_5578.method3760(i_462_ / 1000.0F,
					(aClass495_10935.method6024(-765386834).anIntArrayArrayArray5087),
					aClass495_10935.method6006((byte) 0), i, i_461_, -2137352661);
		}
		Class386.anInt4069 = 1476949137;
		Class690_Sub2.anInt10780 = 1603116895;
		anInt11136 = anInt11127 * 243491283;
		Class210.anInt2244 = 781637499 * Class626.anInt8136;
		Class375.anInt3938 = -823559375 * Class137.anInt1630;
		Class29.anInt306 = Class227.anInt2347 * -1751109343;
		Class424.anInt4789 = Class309_Sub1.anInt9907 * 715063449;
		Class278.anInt3052 = 323440981 * Class653.anInt8429;
		Class295.anInt3236 = anInt11156 * 1053713531;
	}

	static void method10265() {
		if (ModeWhere.aClass665_8465 != Class646.aClass665_8386)
			Class398.aClass398_4403.method4821(1802965837);
	}

	static void method10266() {
		if (ModeWhere.aClass665_8465 != Class646.aClass665_8386)
			Class398.aClass398_4403.method4821(578069072);
	}

	static void method10267() {
		if (ModeWhere.aClass665_8465 != Class646.aClass665_8386)
			Class398.aClass398_4403.method4821(1819712705);
	}

	@Override
	public final void method381() {
		if (method6182(-953280118)) {
			String string = "";
			Class405[] class405s = Class362.method4596(-910927257);
			for (int i = 0; i < class405s.length; i++) {
				Class405 class405 = class405s[i];
				String string_463_ = Class196.anApplet2198.getParameter(class405.aString4645);
				if (null != string_463_) {
					switch (Integer.parseInt(class405.aString4645)) {
					case 3:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt192 = Integer.parseInt(string_463_) * 1068151373;
						break;
					case 32:
						if (string_463_.equalsIgnoreCase(Class49.aString550))
							aBool10869 = true;
						else
							aBool10869 = false;
						break;
					case 41:
						if (null == Class12.aClass16_174)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.aString194 = string_463_;
						break;
					case 22:
						if (Class12.aClass16_174 == null)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt193 = Integer.parseInt(string_463_) * 1685978521;
						break;
					case 39:
						anInt10863 = Integer.parseInt(string_463_) * -1786748395;
						if (anInt10863 * 1181441341 < 0 || (1181441341 * anInt10863 >= aColorArray10919.length))
							anInt10863 = 0;
						break;
					case 26:
						aString11077 = string_463_;
						break;
					case 35:
						if (string_463_.equalsIgnoreCase(Class49.aString550)) {
							/* empty */
						}
						break;
					case 21:
						if (Class12.aClass16_182 == null)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt191 = Integer.parseInt(string_463_) * -792516699;
						break;
					case 36:
						if (null == Class12.aClass16_174)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt191 = Integer.parseInt(string_463_) * -792516699;
						break;
					case 15:
						if (string_463_.equalsIgnoreCase(Class49.aString550))
							aBool10993 = true;
						else
							aBool10993 = false;
						break;
					case 17:
						if (string_463_.equals(Class49.aString550))
							aBool10956 = true;
						else
							aBool10956 = false;
						break;
					case 49:
						anInt10860 = Integer.parseInt(string_463_) * -1888478825;
						break;
					case 24:
						if (Class12.aClass16_177 == null)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.aString194 = string_463_;
						break;
					case 40:
						if (null == Class12.aClass16_175)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.aString194 = string_463_;
						break;
					case 2:
						if (null == Class12.aClass16_177)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt193 = Integer.parseInt(string_463_) * 1685978521;
						break;
					case 12:
						Class378_Sub2.aClass668_10123 = Class668.method7913(Integer.parseInt(string_463_), -328823905);
						break;
					case 29:
						Class217.aString2291 = string_463_;
						break;
					case 28:
						aString11054 = string_463_;
						break;
					case 45:
						aString10857 = string_463_;
						break;
					case 20:
						aString10866 = string_463_;
						if (aString10866.length() > 100)
							aString10866 = null;
						break;
					case 43:
						aClass673_11108 = Class628.method7519(Integer.parseInt(string_463_), (byte) 1);
						if (Class673.aClass673_8529 == aClass673_11108)
							Class688.aClass77_8657 = Class77.aClass77_804;
						else
							Class688.aClass77_8657 = Class77.aClass77_807;
						break;
					case 27:
						if (string_463_.equalsIgnoreCase(Class49.aString550))
							aBool10853 = true;
						else
							aBool10853 = false;
						break;
					case 9:
						aString10962 = string_463_;
						break;
					case 25:
						anInt10861 = Integer.parseInt(string_463_) * 771816177;
						break;
					case 50:
						if (Class12.aClass16_177 == null)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt191 = Integer.parseInt(string_463_) * -792516699;
						break;
					case 46:
						if (string_463_.equals(Class49.aString550))
							aBool10859 = true;
						else
							aBool10859 = false;
						break;
					case 18:
						anInt10856 = Integer.parseInt(string_463_) * -689310945;
						break;
					case 44:
						aString10867 = string_463_;
						break;
					case 11:
						break;
					case 31:
						Class522.aString7051 = string_463_;
						break;
					case 48:
						if (Class12.aClass16_174 == null)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt192 = Integer.parseInt(string_463_) * 1068151373;
						break;
					case 19:
						Class242.aClass696_2722 = Class573.method6867(Integer.parseInt(string_463_), 961465569);
						if (Class242.aClass696_2722 != Class696.aClass696_8711
								&& (Class242.aClass696_2722 != Class696.aClass696_8710)
								&& (Class242.aClass696_2722 != Class696.aClass696_8713)
								&& (Class242.aClass696_2722 != Class696.aClass696_8709))
							Class242.aClass696_2722 = Class696.aClass696_8709;
						break;
					case 8:
						Class646.aClass665_8386 = ((ModeWhere) Class443.method5321(ModeWhere.method7893(1220427530),
								Integer.parseInt(string_463_), 1918758426));
						if (ModeWhere.aClass665_8465 == Class646.aClass665_8386)
							Class646.aClass665_8386 = ModeWhere.aClass665_8464;
						else if (!(Class646.aClass665_8386.method7892(Class667.aClass667_8485, 364491346))
								&& (ModeWhere.LIVE != Class646.aClass665_8386))
							Class646.aClass665_8386 = ModeWhere.LIVE;
						break;
					case 16:
						anInt11104 = Integer.parseInt(string_463_) * 1953172635;
						break;
					case 4:
						if (string_463_.equalsIgnoreCase(Class49.aString550))
							aBool10871 = true;
						else
							aBool10871 = false;
						break;
					case 38:
						if (string_463_.equalsIgnoreCase(Class49.aString550))
							aBool10914 = true;
						break;
					case 34:
						if (string_463_.equalsIgnoreCase(Class49.aString550))
							aBool10884 = true;
						else
							aBool10884 = false;
						break;
					case 1:
						break;
					case 30:
						if (null == Class12.aClass16_182)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt192 = Integer.parseInt(string_463_) * 1068151373;
						break;
					case 52:
						anInt10873 = Integer.parseInt(string_463_) * -1659944355;
						break;
					case 13:
						break;
					case 6:
						if (null == Class12.aClass16_177)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt192 = Integer.parseInt(string_463_) * 1068151373;
						break;
					default:
						VarDomainType.method5340("", new RuntimeException(), 2079777063);
						break;
					case 33:
						if (Class12.aClass16_182 == null)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt193 = Integer.parseInt(string_463_) * 1685978521;
						break;
					case 51:
						aString10868 = string_463_;
						break;
					case 37:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt191 = Integer.parseInt(string_463_) * -792516699;
						break;
					case 42:
						Class528_Sub35.anInt10494 = Integer.parseInt(string_463_) * -1958106627;
						break;
					case 23:
						break;
					case 47:
						anInt10862 = Integer.parseInt(string_463_) * 17704847;
						break;
					case 7:
						Class623.anInt8119 = Integer.parseInt(string_463_) * -1973001665;
						break;
					case 5:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt193 = Integer.parseInt(string_463_) * 1685978521;
						break;
					case 14:
						string = string_463_;
					}
				}
			}
			if (null == aString10962)
				aString10962 = "";
			Class510 class510 = new Class510(473615593 * anInt11124, -14625703 * anInt11022, anInt11019 * 2095238197,
					anInt11020 * -362064957, aClass673_11108.aString8536);
			Class326.aclient3497 = this;
			String string_464_ = Class242.aClass696_2722.aString8714;
			int i = 32 + Class242.aClass696_2722.anInt8708 * -313882147;
			if (!string.equals("")) {
				string_464_ = new StringBuilder().append(string_464_).append("_").append(string).toString();
				i = 0;
			}
			method6232(class510, aClass673_11108.aString8534, string_464_, i, Class668.method7924(283546938), 857, 1,
					aBool10871, 325324695);
		}
	}

	@Override
	public final void method375() {
		if (method6182(-1242247100)) {
			String string = "";
			Class405[] class405s = Class362.method4596(-509846797);
			for (int i = 0; i < class405s.length; i++) {
				Class405 class405 = class405s[i];
				String string_465_ = Class196.anApplet2198.getParameter(class405.aString4645);
				if (null != string_465_) {
					switch (Integer.parseInt(class405.aString4645)) {
					case 3:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt192 = Integer.parseInt(string_465_) * 1068151373;
						break;
					case 32:
						if (string_465_.equalsIgnoreCase(Class49.aString550))
							aBool10869 = true;
						else
							aBool10869 = false;
						break;
					case 41:
						if (null == Class12.aClass16_174)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.aString194 = string_465_;
						break;
					case 22:
						if (Class12.aClass16_174 == null)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt193 = Integer.parseInt(string_465_) * 1685978521;
						break;
					case 39:
						anInt10863 = Integer.parseInt(string_465_) * -1786748395;
						if (anInt10863 * 1181441341 < 0 || (1181441341 * anInt10863 >= aColorArray10919.length))
							anInt10863 = 0;
						break;
					case 26:
						aString11077 = string_465_;
						break;
					case 35:
						if (string_465_.equalsIgnoreCase(Class49.aString550)) {
							/* empty */
						}
						break;
					case 21:
						if (Class12.aClass16_182 == null)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt191 = Integer.parseInt(string_465_) * -792516699;
						break;
					case 36:
						if (null == Class12.aClass16_174)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt191 = Integer.parseInt(string_465_) * -792516699;
						break;
					case 15:
						if (string_465_.equalsIgnoreCase(Class49.aString550))
							aBool10993 = true;
						else
							aBool10993 = false;
						break;
					case 17:
						if (string_465_.equals(Class49.aString550))
							aBool10956 = true;
						else
							aBool10956 = false;
						break;
					case 49:
						anInt10860 = Integer.parseInt(string_465_) * -1888478825;
						break;
					case 24:
						if (Class12.aClass16_177 == null)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.aString194 = string_465_;
						break;
					case 40:
						if (null == Class12.aClass16_175)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.aString194 = string_465_;
						break;
					case 2:
						if (null == Class12.aClass16_177)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt193 = Integer.parseInt(string_465_) * 1685978521;
						break;
					case 12:
						Class378_Sub2.aClass668_10123 = Class668.method7913(Integer.parseInt(string_465_), -2011876792);
						break;
					case 29:
						Class217.aString2291 = string_465_;
						break;
					case 28:
						aString11054 = string_465_;
						break;
					case 45:
						aString10857 = string_465_;
						break;
					case 20:
						aString10866 = string_465_;
						if (aString10866.length() > 100)
							aString10866 = null;
						break;
					case 43:
						aClass673_11108 = Class628.method7519(Integer.parseInt(string_465_), (byte) 1);
						if (Class673.aClass673_8529 == aClass673_11108)
							Class688.aClass77_8657 = Class77.aClass77_804;
						else
							Class688.aClass77_8657 = Class77.aClass77_807;
						break;
					case 27:
						if (string_465_.equalsIgnoreCase(Class49.aString550))
							aBool10853 = true;
						else
							aBool10853 = false;
						break;
					case 9:
						aString10962 = string_465_;
						break;
					case 25:
						anInt10861 = Integer.parseInt(string_465_) * 771816177;
						break;
					case 50:
						if (Class12.aClass16_177 == null)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt191 = Integer.parseInt(string_465_) * -792516699;
						break;
					case 46:
						if (string_465_.equals(Class49.aString550))
							aBool10859 = true;
						else
							aBool10859 = false;
						break;
					case 18:
						anInt10856 = Integer.parseInt(string_465_) * -689310945;
						break;
					case 44:
						aString10867 = string_465_;
						break;
					case 11:
						break;
					case 31:
						Class522.aString7051 = string_465_;
						break;
					case 48:
						if (Class12.aClass16_174 == null)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt192 = Integer.parseInt(string_465_) * 1068151373;
						break;
					case 19:
						Class242.aClass696_2722 = Class573.method6867(Integer.parseInt(string_465_), 961465569);
						if (Class242.aClass696_2722 != Class696.aClass696_8711
								&& (Class242.aClass696_2722 != Class696.aClass696_8710)
								&& (Class242.aClass696_2722 != Class696.aClass696_8713)
								&& (Class242.aClass696_2722 != Class696.aClass696_8709))
							Class242.aClass696_2722 = Class696.aClass696_8709;
						break;
					case 8:
						Class646.aClass665_8386 = ((ModeWhere) Class443.method5321(ModeWhere.method7893(-174168014),
								Integer.parseInt(string_465_), 2027895042));
						if (ModeWhere.aClass665_8465 == Class646.aClass665_8386)
							Class646.aClass665_8386 = ModeWhere.aClass665_8464;
						else if (!(Class646.aClass665_8386.method7892(Class667.aClass667_8485, 364491346))
								&& (ModeWhere.LIVE != Class646.aClass665_8386))
							Class646.aClass665_8386 = ModeWhere.LIVE;
						break;
					case 16:
						anInt11104 = Integer.parseInt(string_465_) * 1953172635;
						break;
					case 4:
						if (string_465_.equalsIgnoreCase(Class49.aString550))
							aBool10871 = true;
						else
							aBool10871 = false;
						break;
					case 38:
						if (string_465_.equalsIgnoreCase(Class49.aString550))
							aBool10914 = true;
						break;
					case 34:
						if (string_465_.equalsIgnoreCase(Class49.aString550))
							aBool10884 = true;
						else
							aBool10884 = false;
						break;
					case 1:
						break;
					case 30:
						if (null == Class12.aClass16_182)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt192 = Integer.parseInt(string_465_) * 1068151373;
						break;
					case 52:
						anInt10873 = Integer.parseInt(string_465_) * -1659944355;
						break;
					case 13:
						break;
					case 6:
						if (null == Class12.aClass16_177)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt192 = Integer.parseInt(string_465_) * 1068151373;
						break;
					default:
						VarDomainType.method5340("", new RuntimeException(), 2081929231);
						break;
					case 33:
						if (Class12.aClass16_182 == null)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt193 = Integer.parseInt(string_465_) * 1685978521;
						break;
					case 51:
						aString10868 = string_465_;
						break;
					case 37:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt191 = Integer.parseInt(string_465_) * -792516699;
						break;
					case 42:
						Class528_Sub35.anInt10494 = Integer.parseInt(string_465_) * -1958106627;
						break;
					case 23:
						break;
					case 47:
						anInt10862 = Integer.parseInt(string_465_) * 17704847;
						break;
					case 7:
						Class623.anInt8119 = Integer.parseInt(string_465_) * -1973001665;
						break;
					case 5:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt193 = Integer.parseInt(string_465_) * 1685978521;
						break;
					case 14:
						string = string_465_;
					}
				}
			}
			if (null == aString10962)
				aString10962 = "";
			Class510 class510 = new Class510(473615593 * anInt11124, -14625703 * anInt11022, anInt11019 * 2095238197,
					anInt11020 * -362064957, aClass673_11108.aString8536);
			Class326.aclient3497 = this;
			String string_466_ = Class242.aClass696_2722.aString8714;
			int i = 32 + Class242.aClass696_2722.anInt8708 * -313882147;
			if (!string.equals("")) {
				string_466_ = new StringBuilder().append(string_466_).append("_").append(string).toString();
				i = 0;
			}
			method6232(class510, aClass673_11108.aString8534, string_466_, i, Class668.method7924(620357964), 857, 1,
					aBool10871, -1830707918);
		}
	}

	@Override
	public final void method368() {
		if (method6182(-1371470759)) {
			String string = "";
			Class405[] class405s = Class362.method4596(-870091597);
			for (int i = 0; i < class405s.length; i++) {
				Class405 class405 = class405s[i];
				String string_467_ = Class196.anApplet2198.getParameter(class405.aString4645);
				if (null != string_467_) {
					switch (Integer.parseInt(class405.aString4645)) {
					case 3:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt192 = Integer.parseInt(string_467_) * 1068151373;
						break;
					case 32:
						if (string_467_.equalsIgnoreCase(Class49.aString550))
							aBool10869 = true;
						else
							aBool10869 = false;
						break;
					case 41:
						if (null == Class12.aClass16_174)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.aString194 = string_467_;
						break;
					case 22:
						if (Class12.aClass16_174 == null)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt193 = Integer.parseInt(string_467_) * 1685978521;
						break;
					case 39:
						anInt10863 = Integer.parseInt(string_467_) * -1786748395;
						if (anInt10863 * 1181441341 < 0 || (1181441341 * anInt10863 >= aColorArray10919.length))
							anInt10863 = 0;
						break;
					case 26:
						aString11077 = string_467_;
						break;
					case 35:
						if (string_467_.equalsIgnoreCase(Class49.aString550)) {
							/* empty */
						}
						break;
					case 21:
						if (Class12.aClass16_182 == null)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt191 = Integer.parseInt(string_467_) * -792516699;
						break;
					case 36:
						if (null == Class12.aClass16_174)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt191 = Integer.parseInt(string_467_) * -792516699;
						break;
					case 15:
						if (string_467_.equalsIgnoreCase(Class49.aString550))
							aBool10993 = true;
						else
							aBool10993 = false;
						break;
					case 17:
						if (string_467_.equals(Class49.aString550))
							aBool10956 = true;
						else
							aBool10956 = false;
						break;
					case 49:
						anInt10860 = Integer.parseInt(string_467_) * -1888478825;
						break;
					case 24:
						if (Class12.aClass16_177 == null)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.aString194 = string_467_;
						break;
					case 40:
						if (null == Class12.aClass16_175)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.aString194 = string_467_;
						break;
					case 2:
						if (null == Class12.aClass16_177)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt193 = Integer.parseInt(string_467_) * 1685978521;
						break;
					case 12:
						Class378_Sub2.aClass668_10123 = Class668.method7913(Integer.parseInt(string_467_), -1635935433);
						break;
					case 29:
						Class217.aString2291 = string_467_;
						break;
					case 28:
						aString11054 = string_467_;
						break;
					case 45:
						aString10857 = string_467_;
						break;
					case 20:
						aString10866 = string_467_;
						if (aString10866.length() > 100)
							aString10866 = null;
						break;
					case 43:
						aClass673_11108 = Class628.method7519(Integer.parseInt(string_467_), (byte) 1);
						if (Class673.aClass673_8529 == aClass673_11108)
							Class688.aClass77_8657 = Class77.aClass77_804;
						else
							Class688.aClass77_8657 = Class77.aClass77_807;
						break;
					case 27:
						if (string_467_.equalsIgnoreCase(Class49.aString550))
							aBool10853 = true;
						else
							aBool10853 = false;
						break;
					case 9:
						aString10962 = string_467_;
						break;
					case 25:
						anInt10861 = Integer.parseInt(string_467_) * 771816177;
						break;
					case 50:
						if (Class12.aClass16_177 == null)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt191 = Integer.parseInt(string_467_) * -792516699;
						break;
					case 46:
						if (string_467_.equals(Class49.aString550))
							aBool10859 = true;
						else
							aBool10859 = false;
						break;
					case 18:
						anInt10856 = Integer.parseInt(string_467_) * -689310945;
						break;
					case 44:
						aString10867 = string_467_;
						break;
					case 11:
						break;
					case 31:
						Class522.aString7051 = string_467_;
						break;
					case 48:
						if (Class12.aClass16_174 == null)
							Class12.aClass16_174 = new Class16();
						Class12.aClass16_174.anInt192 = Integer.parseInt(string_467_) * 1068151373;
						break;
					case 19:
						Class242.aClass696_2722 = Class573.method6867(Integer.parseInt(string_467_), 961465569);
						if (Class242.aClass696_2722 != Class696.aClass696_8711
								&& (Class242.aClass696_2722 != Class696.aClass696_8710)
								&& (Class242.aClass696_2722 != Class696.aClass696_8713)
								&& (Class242.aClass696_2722 != Class696.aClass696_8709))
							Class242.aClass696_2722 = Class696.aClass696_8709;
						break;
					case 8:
						Class646.aClass665_8386 = ((ModeWhere) Class443.method5321(ModeWhere.method7893(302514778),
								Integer.parseInt(string_467_), 2078730310));
						if (ModeWhere.aClass665_8465 == Class646.aClass665_8386)
							Class646.aClass665_8386 = ModeWhere.aClass665_8464;
						else if (!(Class646.aClass665_8386.method7892(Class667.aClass667_8485, 364491346))
								&& (ModeWhere.LIVE != Class646.aClass665_8386))
							Class646.aClass665_8386 = ModeWhere.LIVE;
						break;
					case 16:
						anInt11104 = Integer.parseInt(string_467_) * 1953172635;
						break;
					case 4:
						if (string_467_.equalsIgnoreCase(Class49.aString550))
							aBool10871 = true;
						else
							aBool10871 = false;
						break;
					case 38:
						if (string_467_.equalsIgnoreCase(Class49.aString550))
							aBool10914 = true;
						break;
					case 34:
						if (string_467_.equalsIgnoreCase(Class49.aString550))
							aBool10884 = true;
						else
							aBool10884 = false;
						break;
					case 1:
						break;
					case 30:
						if (null == Class12.aClass16_182)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt192 = Integer.parseInt(string_467_) * 1068151373;
						break;
					case 52:
						anInt10873 = Integer.parseInt(string_467_) * -1659944355;
						break;
					case 13:
						break;
					case 6:
						if (null == Class12.aClass16_177)
							Class12.aClass16_177 = new Class16();
						Class12.aClass16_177.anInt192 = Integer.parseInt(string_467_) * 1068151373;
						break;
					default:
						VarDomainType.method5340("", new RuntimeException(), 1971435152);
						break;
					case 33:
						if (Class12.aClass16_182 == null)
							Class12.aClass16_182 = new Class16();
						Class12.aClass16_182.anInt193 = Integer.parseInt(string_467_) * 1685978521;
						break;
					case 51:
						aString10868 = string_467_;
						break;
					case 37:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt191 = Integer.parseInt(string_467_) * -792516699;
						break;
					case 42:
						Class528_Sub35.anInt10494 = Integer.parseInt(string_467_) * -1958106627;
						break;
					case 23:
						break;
					case 47:
						anInt10862 = Integer.parseInt(string_467_) * 17704847;
						break;
					case 7:
						Class623.anInt8119 = Integer.parseInt(string_467_) * -1973001665;
						break;
					case 5:
						if (Class12.aClass16_175 == null)
							Class12.aClass16_175 = new Class16();
						Class12.aClass16_175.anInt193 = Integer.parseInt(string_467_) * 1685978521;
						break;
					case 14:
						string = string_467_;
					}
				}
			}
			if (null == aString10962)
				aString10962 = "";
			Class510 class510 = new Class510(473615593 * anInt11124, -14625703 * anInt11022, anInt11019 * 2095238197,
					anInt11020 * -362064957, aClass673_11108.aString8536);
			Class326.aclient3497 = this;
			String string_468_ = Class242.aClass696_2722.aString8714;
			int i = 32 + Class242.aClass696_2722.anInt8708 * -313882147;
			if (!string.equals("")) {
				string_468_ = new StringBuilder().append(string_468_).append("_").append(string).toString();
				i = 0;
			}
			method6232(class510, aClass673_11108.aString8534, string_468_, i, Class668.method7924(1094495564), 857, 1,
					aBool10871, -1687454646);
		}
	}

	static void method10268(byte i) {
		Class54.aClass109_624.method1378((short) 26564);
		Class54.aClass109_624.aClass528_Sub42_Sub2_1378.pointer = 0;
		Class54.aClass109_624.aClass396_1380 = null;
		Class54.aClass109_624.aClass396_1385 = null;
		Class54.aClass109_624.aClass396_1390 = null;
		Class54.aClass109_624.anInt1394 = 0;
		anInt10889 = 0;
		Class283.method3835(794210864);
		anInt11158 = 0;
		anInt11157 = 0;
		anInt11024 = 0;
		aString11133 = null;
		Class667.anInt8488 = 0;
		Class5_Sub19.aClass89Array10849 = null;
		Class553.aClass308_7436 = null;
		Class142_Sub2.aClass308_8919 = null;
		Class186.method2753((byte) 114);
		for (int i_469_ = 0; (i_469_ < Class570.playerVarsProvider.aClass620Array1210.length); i_469_++) {
			Class620 class620 = new Class620(Class53.aClass587_622.method7019(i_469_, 1914835642), false);
			class620.method7392(0, 1030474414);
			class620.method7396(0, (byte) 105);
			Class570.playerVarsProvider.aClass620Array1210[i_469_] = class620;
		}
		Class570.playerVarsProvider.aClass586_1209.method7006(-1954600666);
		Class488.method5908(1572665758);
		Class388.method4769(Class54.aClass109_624, (byte) -60);
	}

	static void method10269(Class229 class229, Class243 class243, int i, int i_470_, int i_471_, int i_472_, int i_473_,
			long l) {
		int i_474_ = i_471_ * i_471_ + i_472_ * i_472_;
		if (i_474_ <= l) {
			int i_475_;
			if (Class390.anInt4111 * -1860881523 == 6)
				i_475_ = ((int) (Class495.aClass283_Sub1_5578.method3792(-16777216) * 2607.5945876176133)
						+ anInt10852 * -946910725) & 0x3fff;
			else if (Class390.anInt4111 * -1860881523 == 1)
				i_475_ = (int) aFloat11088 & 0x3fff;
			else
				i_475_ = (int) aFloat11088 + -946910725 * anInt10852 & 0x3fff;
			int i_476_ = Class417.anIntArray4766[i_475_];
			int i_477_ = Class417.anIntArray4767[i_475_];
			if (-1860881523 * Class390.anInt4111 != 1) {
				i_476_ = 256 * i_476_ / (-1303557179 * anInt11049 + 256);
				i_477_ = i_477_ * 256 / (anInt11049 * -1303557179 + 256);
			}
			int i_478_ = i_477_ * i_471_ + i_476_ * i_472_ >> 14;
			int i_479_ = i_472_ * i_477_ - i_476_ * i_471_ >> 14;
			Class151 class151 = Class528_Sub3.aClass151Array10218[i_473_];
			int i_480_ = class151.method1766();
			int i_481_ = class151.method1767();
			int i_482_ = -1352480433 * class229.anInt2476 / 2 + i_478_ - i_480_ / 2;
			int i_483_ = i_480_ + i_482_;
			int i_484_ = -i_479_ + 1661025435 * class229.anInt2458 / 2 - i_481_;
			int i_485_ = i_484_ + i_481_;
			boolean bool;
			if (class243 != null)
				bool = (!class243.method3383(i_482_, i_484_, (byte) 1) || !class243.method3383(i_483_, i_484_, (byte) 1)
						|| !class243.method3383(i_482_, i_485_, (byte) 1)
						|| !class243.method3383(i_483_, i_485_, (byte) 1));
			else {
				int i_486_ = i_481_;
				int i_487_ = i_480_ / 2;
				bool = (i_484_ <= -i_486_ || i_485_ >= 1661025435 * class229.anInt2458 || i_482_ <= -i_487_
						|| i_483_ >= i_487_ + class229.anInt2476 * -1352480433);
			}
			if (bool) {
				double d = Math.atan2(i_478_, i_479_);
				double d_488_ = Math.atan2(Math.abs(i_478_), Math.abs(i_479_));
				double d_489_ = Math.atan2(class229.anInt2476 * -1352480433 / 2, 1661025435 * class229.anInt2458 / 2);
				boolean bool_490_ = false;
				double d_491_ = 0.0;
				int i_492_;
				if (d_488_ < d_489_) {
					d_491_ = 1.5707963267948966 - d;
					i_492_ = 1661025435 * class229.anInt2458 / 2;
				} else {
					d_491_ = d;
					i_492_ = -1352480433 * class229.anInt2476 / 2;
				}
				int i_493_ = Math.abs((int) -(i_492_ * Math.sin(1.5707963267948966) / Math.sin(d_491_)));
				Class183.aClass151Array2101[i_473_].method1807((i + class229.anInt2476 * -1352480433 / 2.0F + 0.0F),
						(i_470_ + 1661025435 * class229.anInt2458 / 2.0F - 0.0F),
						(Class183.aClass151Array2101[i_473_].method40() / 2.0F), i_493_, 4096,
						(int) (-d / 6.283185307179586 * 65535.0));
			} else if (class243 != null)
				class151.method1775(i + i_482_, i_470_ + i_484_, class243.aClass148_2724, i, i_470_);
			else
				class151.method1773(i_482_ + i, i_470_ + i_484_);
		}
	}

	static final void method10270(Class648 class648, int i) {
		int i_494_ = (class648.anIntArray8394[(class648.anInt8395 -= 1239022665) * 717927929]);
		boolean bool = true;
		if (i_494_ < 0)
			bool = (1 + i_494_) % 4 == 0;
		else if (i_494_ < 1582)
			bool = i_494_ % 4 == 0;
		else if (0 != i_494_ % 4)
			bool = false;
		else if (0 != i_494_ % 100)
			bool = true;
		else if (0 != i_494_ % 400)
			bool = false;
		class648.anIntArray8394[(class648.anInt8395 += 1239022665) * 717927929 - 1] = bool ? 1 : 0;
	}
}
