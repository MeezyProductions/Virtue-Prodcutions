/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;

public class Class99
{
    static int anInt1257;
    static int anInt1258;
    static String[] aStringArray1259;
    static final String aString1260 = "Success";
    static int anInt1261;
    static final String aString1262 = "\\/.:, _-+[]~@";
    static int anInt1263;
    static String aString1264;
    static int anInt1265;
    static boolean aBool1266;
    static long aLong1267;
    static int anInt1268 = 0;
    static int anInt1269;
    static final int anInt1270 = 350;
    static final String aString1271 = "Failure";
    
    static void method1310(int i) {
	if (i == 6)
	    throw new Error();
	if (i == 14)
	    throw new OutOfMemoryError();
	try {
	    if (17 == i)
		Class301.method4022((byte) 8);
	    else if (16 == i)
		Class364_Sub2.method9236(new StringBuilder().append("").append
					     (296883021 * Class509.anInt6953)
					     .toString(),
					 (byte) -36);
	    else if (i == 22) {
		Class559 class559 = (client.aClass495_10935.method5973
				     ((byte) 1).aClass559_7156);
		class559.aBool7491 = !class559.aBool7491;
	    } else if (i == 5)
		client.aBool10887 = true;
	    else if (i == 27)
		client.aBool10887 = false;
	    else if (13 == i)
		client.aClass695_11045.method8174(1848902271);
	    else if (9 == i) {
		Class625.method7450(-927120728);
		for (int i_0_ = 0; i_0_ < 10; i_0_++)
		    System.gc();
		Runtime runtime = Runtime.getRuntime();
		int i_1_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		Class364_Sub2.method9236(new StringBuilder().append("").append
					     (i_1_).toString(),
					 (byte) 35);
	    } else if (19 == i) {
		Class625.method7450(-1622473488);
		for (int i_2_ = 0; i_2_ < 10; i_2_++)
		    System.gc();
		Runtime runtime = Runtime.getRuntime();
		int i_3_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		Class364_Sub2.method9236(new StringBuilder().append("").append
					     (i_3_).toString(),
					 (byte) -18);
		Class156.method1861(1285716496);
		Class625.method7450(-1493689848);
		for (int i_4_ = 0; i_4_ < 10; i_4_++)
		    System.gc();
		i_3_ = (int) ((runtime.totalMemory() - runtime.freeMemory())
			      / 1024L);
		Class364_Sub2.method9236(new StringBuilder().append("").append
					     (i_3_).toString(),
					 (byte) 66);
	    } else if (24 == i)
		Class364_Sub2.method9236((Class605.aClass525_7916
					      .method357((byte) 0)
					  ? "Success" : "Failure"),
					 (byte) -80);
	    else if (i == 25)
		Class12.aClass16_176.method634(1250963605);
	    else if (i == 11)
		Class700.aClass454_8734.method5468(1962763505);
	    else if (20 == i)
		Class700.aClass454_8734.method5460((byte) 24);
	    else if (2 == i)
		Class64.aCanvas754.setLocation(50, 50);
	    else if (28 == i)
		Class64.aCanvas754.setLocation(1401768651 * Class509.anInt6931,
					       (Class509.anInt6943
						* -952966111));
	    else if (i == 15)
		Class181_Sub2.method8729((byte) 0);
	    else if (26 == i) {
		client.aClass495_10935.aLong5558
		    = Class249.method3417(1901393886) * -8826400789005528605L;
		client.aClass495_10935.aBool5574 = true;
		Class181_Sub2.method8729((byte) 0);
	    } else if (23 == i) {
		Class422 class422
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868);
		Class364_Sub2.method9236(new StringBuilder().append
					     ((int) class422.aFloat4780 >> 9)
					     .append
					     (" ").append
					     ((int) class422.aFloat4777 >> 9)
					     .toString(),
					 (byte) -71);
	    } else if (8 == i) {
		Class422 class422
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868);
		Class364_Sub2.method9236
		    (new StringBuilder().append("").append
			 (client.aClass495_10935.method5973((byte) 117)
			      .aClass137Array7161
			      [(Class108.myPlayer
				.aByte10675)]
			      .method1669
			  ((int) class422.aFloat4780 >> 9,
			   (int) class422.aFloat4777 >> 9, (byte) 0))
			 .toString(),
		     (byte) -27);
	    } else if (29 == i) {
		Class364_Sub2.method9236(new StringBuilder().append
					     (Class229.aClass186_2490
						  .method2736(-63416889))
					     .append
					     (" ").append
					     (Class229.aClass186_2490
						  .method2751(659999305))
					     .toString(),
					 (byte) 2);
		Class364_Sub2.method9236(new StringBuilder().append
					     (Class229.aClass186_2372
						  .method2736(-1634708343))
					     .append
					     (" ").append
					     (Class229.aClass186_2372
						  .method2751(1226991450))
					     .toString(),
					 (byte) -26);
	    } else if (4 == i)
		Class666.method7908(false, 1373785037);
	    else if (7 == i) {
		client.aBool11057 = !client.aBool11057;
		Class587.aClass173_7714.method2281(client.aBool11057);
		Class7.method566(610692023);
	    } else if (i == 10) {
		client.anInt10897 = 0;
		client.aClass495_10935.method5989(2016078152);
	    } else if (i == 1) {
		client.anInt10897 = -1221863335;
		client.aClass495_10935.method5989(2016078152);
	    } else if (21 == i) {
		client.anInt10897 = 1851240626;
		client.aClass495_10935.method5989(2016078152);
	    }
	} catch (Exception exception) {
	    Class364_Sub2.method9236
		(Class39.aClass39_342.method807(Class378_Sub2.aClass668_10123,
						(byte) 102),
		 (byte) 27);
	}
    }
    
    static boolean method1311() {
	if (Class539.method6615(client.anInt10876 * 175711435, -1943968974))
	    return false;
	return true;
    }
    
    static boolean method1312() {
	if (Class539.method6615(client.anInt10876 * 175711435, -1943299266))
	    return false;
	return true;
    }
    
    static void method1313() {
	if (Class26.method708((short) -2406)) {
	    if (null == aStringArray1259)
		Class635.method7562(2000376573);
	    aBool1266 = true;
	    anInt1265 = 0;
	}
    }
    
    static void method1314() {
	anInt1258
	    = -1009935322 + (Class392.aClass1_4120.anInt12 * -1856464861
			     + -872936699 * Class392.aClass1_4120.anInt13);
	Class210.anInt2242
	    = -2131851818 + (Class27.aClass1_253.anInt13 * -125443859
			     + 374999419 * Class27.aClass1_253.anInt12);
	aStringArray1259 = new String[500];
	for (int i = 0; i < aStringArray1259.length; i++)
	    aStringArray1259[i] = "";
	Class364_Sub2.method9236
	    (Class39.aClass39_363.method807(Class378_Sub2.aClass668_10123,
					    (byte) 102),
	     (byte) -8);
    }
    
    Class99() throws Throwable {
	throw new Error();
    }
    
    static boolean method1315() {
	return aBool1266;
    }
    
    static void method1316() {
	aBool1266 = false;
	PlayerModel.method7298(541915450);
    }
    
    static void method1317() {
	/* empty */
    }
    
    static void method1318() {
	if (null != Class315.aFileOutputStream3446) {
	    try {
		Class315.aFileOutputStream3446.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	Class315.aFileOutputStream3446 = null;
    }
    
    static boolean method1319() {
	return aBool1266;
    }
    
    static void method1320() {
	/* empty */
    }
    
    static void method1321() {
	if (anInt1265 * -1026839985 < 102)
	    anInt1265 += -1155855334;
	if (anInt1257 * 123581583 != -1
	    && (aLong1267 * 1013267771366510847L
		< Class249.method3417(1905210020))) {
	    for (int i = 123581583 * anInt1257;
		 i < Class428.aStringArray4812.length; i++) {
		if (Class428.aStringArray4812[i].startsWith("pause")) {
		    int i_5_ = 5;
		    try {
			i_5_ = Integer.parseInt(Class428.aStringArray4812
						    [i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("Pausing for ").append
						 (i_5_).append
						 (" seconds...").toString(),
					     (byte) 43);
		    anInt1257 = -714282385 * (1 + i);
		    aLong1267
			= (Class249.method3417(1976951812)
			   + (long) (1000 * i_5_)) * 2935999340532461311L;
		    return;
		}
		aString1264 = Class428.aStringArray4812[i];
		Class264.method3657(false, (byte) 20);
	    }
	    anInt1257 = 714282385;
	}
	if (454740049 * client.anInt10926 != 0) {
	    anInt1261 -= client.anInt10926 * 1974991457;
	    if (anInt1261 * 1727710133 >= -1589365317 * anInt1268)
		anInt1261 = anInt1268 * -1666917969 - -819047779;
	    if (anInt1261 * 1727710133 < 0)
		anInt1261 = 0;
	    client.anInt10926 = 0;
	}
	for (int i = 0; i < -1384174071 * client.anInt10995; i++) {
	    Interface61 interface61 = client.anInterface61Array11123[i];
	    int i_6_ = interface61.method384(1818270184);
	    char c = interface61.method399((byte) -36);
	    int i_7_ = interface61.method402(-1816014409);
	    if (84 == i_6_)
		Class264.method3657(false, (byte) 72);
	    if (i_6_ == 80)
		Class264.method3657(true, (byte) 120);
	    else if (i_6_ == 66 && (i_7_ & 0x4) != 0) {
		if (null != Class141_Sub1.aClipboard8801) {
		    String string = "";
		    for (int i_8_ = aStringArray1259.length - 1; i_8_ >= 0;
			 i_8_--) {
			if (null != aStringArray1259[i_8_]
			    && aStringArray1259[i_8_].length() > 0)
			    string = new StringBuilder().append(string).append
					 (aStringArray1259[i_8_]).append
					 ('\n').toString();
		    }
		    Class141_Sub1.aClipboard8801
			.setContents(new StringSelection(string), null);
		}
	    } else if (67 == i_6_ && (i_7_ & 0x4) != 0) {
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
							  (byte) 28);
				Class98.method1308(strings, 59632067);
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
	    } else if (i_6_ == 85 && -1643546867 * anInt1269 > 0) {
		aString1264
		    = new StringBuilder().append
			  (aString1264.substring(0,
						 anInt1269 * -1643546867 - 1))
			  .append
			  (aString1264.substring(-1643546867 * anInt1269))
			  .toString();
		anInt1269 -= 105656261;
	    } else if (i_6_ == 101
		       && anInt1269 * -1643546867 < aString1264.length())
		aString1264
		    = new StringBuilder().append
			  (aString1264.substring(0, anInt1269 * -1643546867))
			  .append
			  (aString1264.substring(-1643546867 * anInt1269 + 1))
			  .toString();
	    else if (96 == i_6_ && -1643546867 * anInt1269 > 0)
		anInt1269 -= 105656261;
	    else if (97 == i_6_
		     && -1643546867 * anInt1269 < aString1264.length())
		anInt1269 += 105656261;
	    else if (102 == i_6_)
		anInt1269 = 0;
	    else if (i_6_ == 103)
		anInt1269 = aString1264.length() * 105656261;
	    else if (104 == i_6_
		     && anInt1263 * -1202639803 < aStringArray1259.length) {
		anInt1263 += 768411277;
		Class222.method3158(-1304337650);
		anInt1269 = aString1264.length() * 105656261;
	    } else if (105 == i_6_ && -1202639803 * anInt1263 > 0) {
		anInt1263 -= 768411277;
		Class222.method3158(-1154595784);
		anInt1269 = aString1264.length() * 105656261;
	    } else if (Class578.method6913(c, (byte) -46)
		       || "\\/.:, _-+[]~@".indexOf(c) != -1) {
		aString1264
		    = new StringBuilder().append
			  (aString1264.substring(0, -1643546867 * anInt1269))
			  .append
			  (client.anInterface61Array11123[i]
			       .method399((byte) -26))
			  .append
			  (aString1264.substring(anInt1269 * -1643546867))
			  .toString();
		anInt1269 += 105656261;
	    }
	}
	client.anInt10995 = 0;
	client.anInt10906 = 0;
	PlayerModel.method7298(1684084706);
    }
    
    static void method1322() {
	if (anInt1265 * -1026839985 < 102)
	    anInt1265 += -1155855334;
	if (anInt1257 * 123581583 != -1
	    && (aLong1267 * 1013267771366510847L
		< Class249.method3417(2048178122))) {
	    for (int i = 123581583 * anInt1257;
		 i < Class428.aStringArray4812.length; i++) {
		if (Class428.aStringArray4812[i].startsWith("pause")) {
		    int i_9_ = 5;
		    try {
			i_9_ = Integer.parseInt(Class428.aStringArray4812
						    [i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("Pausing for ").append
						 (i_9_).append
						 (" seconds...").toString(),
					     (byte) -39);
		    anInt1257 = -714282385 * (1 + i);
		    aLong1267
			= (Class249.method3417(2085981991)
			   + (long) (1000 * i_9_)) * 2935999340532461311L;
		    return;
		}
		aString1264 = Class428.aStringArray4812[i];
		Class264.method3657(false, (byte) 20);
	    }
	    anInt1257 = 714282385;
	}
	if (454740049 * client.anInt10926 != 0) {
	    anInt1261 -= client.anInt10926 * 1974991457;
	    if (anInt1261 * 1727710133 >= -1589365317 * anInt1268)
		anInt1261 = anInt1268 * -1666917969 - -819047779;
	    if (anInt1261 * 1727710133 < 0)
		anInt1261 = 0;
	    client.anInt10926 = 0;
	}
	for (int i = 0; i < -1384174071 * client.anInt10995; i++) {
	    Interface61 interface61 = client.anInterface61Array11123[i];
	    int i_10_ = interface61.method384(1425347925);
	    char c = interface61.method399((byte) -33);
	    int i_11_ = interface61.method402(153689142);
	    if (84 == i_10_)
		Class264.method3657(false, (byte) 100);
	    if (i_10_ == 80)
		Class264.method3657(true, (byte) 33);
	    else if (i_10_ == 66 && (i_11_ & 0x4) != 0) {
		if (null != Class141_Sub1.aClipboard8801) {
		    String string = "";
		    for (int i_12_ = aStringArray1259.length - 1; i_12_ >= 0;
			 i_12_--) {
			if (null != aStringArray1259[i_12_]
			    && aStringArray1259[i_12_].length() > 0)
			    string = new StringBuilder().append(string).append
					 (aStringArray1259[i_12_]).append
					 ('\n').toString();
		    }
		    Class141_Sub1.aClipboard8801
			.setContents(new StringSelection(string), null);
		}
	    } else if (67 == i_10_ && (i_11_ & 0x4) != 0) {
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
							  (byte) -13);
				Class98.method1308(strings, 1895748981);
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
	    } else if (i_10_ == 85 && -1643546867 * anInt1269 > 0) {
		aString1264
		    = new StringBuilder().append
			  (aString1264.substring(0,
						 anInt1269 * -1643546867 - 1))
			  .append
			  (aString1264.substring(-1643546867 * anInt1269))
			  .toString();
		anInt1269 -= 105656261;
	    } else if (i_10_ == 101
		       && anInt1269 * -1643546867 < aString1264.length())
		aString1264
		    = new StringBuilder().append
			  (aString1264.substring(0, anInt1269 * -1643546867))
			  .append
			  (aString1264.substring(-1643546867 * anInt1269 + 1))
			  .toString();
	    else if (96 == i_10_ && -1643546867 * anInt1269 > 0)
		anInt1269 -= 105656261;
	    else if (97 == i_10_
		     && -1643546867 * anInt1269 < aString1264.length())
		anInt1269 += 105656261;
	    else if (102 == i_10_)
		anInt1269 = 0;
	    else if (i_10_ == 103)
		anInt1269 = aString1264.length() * 105656261;
	    else if (104 == i_10_
		     && anInt1263 * -1202639803 < aStringArray1259.length) {
		anInt1263 += 768411277;
		Class222.method3158(-1944421300);
		anInt1269 = aString1264.length() * 105656261;
	    } else if (105 == i_10_ && -1202639803 * anInt1263 > 0) {
		anInt1263 -= 768411277;
		Class222.method3158(-1360301381);
		anInt1269 = aString1264.length() * 105656261;
	    } else if (Class578.method6913(c, (byte) -76)
		       || "\\/.:, _-+[]~@".indexOf(c) != -1) {
		aString1264
		    = new StringBuilder().append
			  (aString1264.substring(0, -1643546867 * anInt1269))
			  .append
			  (client.anInterface61Array11123[i]
			       .method399((byte) -65))
			  .append
			  (aString1264.substring(anInt1269 * -1643546867))
			  .toString();
		anInt1269 += 105656261;
	    }
	}
	client.anInt10995 = 0;
	client.anInt10906 = 0;
	PlayerModel.method7298(-1155558136);
    }
    
    static void method1323() {
	if (anInt1265 * -1026839985 < 102)
	    anInt1265 += -1155855334;
	if (anInt1257 * 123581583 != -1
	    && (aLong1267 * 1013267771366510847L
		< Class249.method3417(1920445549))) {
	    for (int i = 123581583 * anInt1257;
		 i < Class428.aStringArray4812.length; i++) {
		if (Class428.aStringArray4812[i].startsWith("pause")) {
		    int i_13_ = 5;
		    try {
			i_13_ = Integer.parseInt(Class428.aStringArray4812
						     [i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class364_Sub2.method9236(new StringBuilder().append
						 ("Pausing for ").append
						 (i_13_).append
						 (" seconds...").toString(),
					     (byte) -3);
		    anInt1257 = -714282385 * (1 + i);
		    aLong1267
			= (Class249.method3417(1948965634)
			   + (long) (1000 * i_13_)) * 2935999340532461311L;
		    return;
		}
		aString1264 = Class428.aStringArray4812[i];
		Class264.method3657(false, (byte) 77);
	    }
	    anInt1257 = 714282385;
	}
	if (454740049 * client.anInt10926 != 0) {
	    anInt1261 -= client.anInt10926 * 1974991457;
	    if (anInt1261 * 1727710133 >= -1589365317 * anInt1268)
		anInt1261 = anInt1268 * -1666917969 - -819047779;
	    if (anInt1261 * 1727710133 < 0)
		anInt1261 = 0;
	    client.anInt10926 = 0;
	}
	for (int i = 0; i < -1384174071 * client.anInt10995; i++) {
	    Interface61 interface61 = client.anInterface61Array11123[i];
	    int i_14_ = interface61.method384(1925216581);
	    char c = interface61.method399((byte) -38);
	    int i_15_ = interface61.method402(-2127593813);
	    if (84 == i_14_)
		Class264.method3657(false, (byte) 94);
	    if (i_14_ == 80)
		Class264.method3657(true, (byte) 47);
	    else if (i_14_ == 66 && (i_15_ & 0x4) != 0) {
		if (null != Class141_Sub1.aClipboard8801) {
		    String string = "";
		    for (int i_16_ = aStringArray1259.length - 1; i_16_ >= 0;
			 i_16_--) {
			if (null != aStringArray1259[i_16_]
			    && aStringArray1259[i_16_].length() > 0)
			    string = new StringBuilder().append(string).append
					 (aStringArray1259[i_16_]).append
					 ('\n').toString();
		    }
		    Class141_Sub1.aClipboard8801
			.setContents(new StringSelection(string), null);
		}
	    } else if (67 == i_14_ && (i_15_ & 0x4) != 0) {
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
							  (byte) 29);
				Class98.method1308(strings, -1196058258);
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
	    } else if (i_14_ == 85 && -1643546867 * anInt1269 > 0) {
		aString1264
		    = new StringBuilder().append
			  (aString1264.substring(0,
						 anInt1269 * -1643546867 - 1))
			  .append
			  (aString1264.substring(-1643546867 * anInt1269))
			  .toString();
		anInt1269 -= 105656261;
	    } else if (i_14_ == 101
		       && anInt1269 * -1643546867 < aString1264.length())
		aString1264
		    = new StringBuilder().append
			  (aString1264.substring(0, anInt1269 * -1643546867))
			  .append
			  (aString1264.substring(-1643546867 * anInt1269 + 1))
			  .toString();
	    else if (96 == i_14_ && -1643546867 * anInt1269 > 0)
		anInt1269 -= 105656261;
	    else if (97 == i_14_
		     && -1643546867 * anInt1269 < aString1264.length())
		anInt1269 += 105656261;
	    else if (102 == i_14_)
		anInt1269 = 0;
	    else if (i_14_ == 103)
		anInt1269 = aString1264.length() * 105656261;
	    else if (104 == i_14_
		     && anInt1263 * -1202639803 < aStringArray1259.length) {
		anInt1263 += 768411277;
		Class222.method3158(-1900410764);
		anInt1269 = aString1264.length() * 105656261;
	    } else if (105 == i_14_ && -1202639803 * anInt1263 > 0) {
		anInt1263 -= 768411277;
		Class222.method3158(-1595890122);
		anInt1269 = aString1264.length() * 105656261;
	    } else if (Class578.method6913(c, (byte) -113)
		       || "\\/.:, _-+[]~@".indexOf(c) != -1) {
		aString1264
		    = new StringBuilder().append
			  (aString1264.substring(0, -1643546867 * anInt1269))
			  .append
			  (client.anInterface61Array11123[i]
			       .method399((byte) -109))
			  .append
			  (aString1264.substring(anInt1269 * -1643546867))
			  .toString();
		anInt1269 += 105656261;
	    }
	}
	client.anInt10995 = 0;
	client.anInt10906 = 0;
	PlayerModel.method7298(1707174140);
    }
    
    static void method1324() {
	if (-1202639803 * anInt1263 > 0) {
	    int i = 0;
	    for (int i_17_ = 0; i_17_ < aStringArray1259.length; i_17_++) {
		if (aStringArray1259[i_17_].indexOf("--> ") != -1
		    && ++i == -1202639803 * anInt1263) {
		    aString1264
			= aStringArray1259[i_17_].substring(aStringArray1259
								[i_17_]
								.indexOf('>')
							    + 2);
		    break;
		}
	    }
	} else
	    aString1264 = "";
    }
    
    static void method1325() {
	aBool1266 = false;
	PlayerModel.method7298(-1123868635);
    }
    
    static void method1326() {
	anInt1258
	    = -1009935322 + (Class392.aClass1_4120.anInt12 * -1856464861
			     + -872936699 * Class392.aClass1_4120.anInt13);
	Class210.anInt2242
	    = -2131851818 + (Class27.aClass1_253.anInt13 * -125443859
			     + 374999419 * Class27.aClass1_253.anInt12);
	aStringArray1259 = new String[500];
	for (int i = 0; i < aStringArray1259.length; i++)
	    aStringArray1259[i] = "";
	Class364_Sub2.method9236
	    (Class39.aClass39_363.method807(Class378_Sub2.aClass668_10123,
					    (byte) 102),
	     (byte) 26);
    }
    
    static void method1327() {
	/* empty */
    }
    
    static void method1328() {
	/* empty */
    }
    
    static void method1329() {
	/* empty */
    }
    
    static void method1330() {
	anInt1258
	    = -1009935322 + (Class392.aClass1_4120.anInt12 * -1856464861
			     + -872936699 * Class392.aClass1_4120.anInt13);
	Class210.anInt2242
	    = -2131851818 + (Class27.aClass1_253.anInt13 * -125443859
			     + 374999419 * Class27.aClass1_253.anInt12);
	aStringArray1259 = new String[500];
	for (int i = 0; i < aStringArray1259.length; i++)
	    aStringArray1259[i] = "";
	Class364_Sub2.method9236
	    (Class39.aClass39_363.method807(Class378_Sub2.aClass668_10123,
					    (byte) 102),
	     (byte) 23);
    }
    
    static boolean method1331() {
	return aBool1266;
    }
    
    static void method1332(int i) {
	if (i == 6)
	    throw new Error();
	if (i == 14)
	    throw new OutOfMemoryError();
	try {
	    if (17 == i)
		Class301.method4022((byte) 8);
	    else if (16 == i)
		Class364_Sub2.method9236(new StringBuilder().append("").append
					     (296883021 * Class509.anInt6953)
					     .toString(),
					 (byte) 3);
	    else if (i == 22) {
		Class559 class559 = (client.aClass495_10935.method5973
				     ((byte) 14).aClass559_7156);
		class559.aBool7491 = !class559.aBool7491;
	    } else if (i == 5)
		client.aBool10887 = true;
	    else if (i == 27)
		client.aBool10887 = false;
	    else if (13 == i)
		client.aClass695_11045.method8174(-1139133404);
	    else if (9 == i) {
		Class625.method7450(-726212944);
		for (int i_18_ = 0; i_18_ < 10; i_18_++)
		    System.gc();
		Runtime runtime = Runtime.getRuntime();
		int i_19_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		Class364_Sub2.method9236(new StringBuilder().append("").append
					     (i_19_).toString(),
					 (byte) 52);
	    } else if (19 == i) {
		Class625.method7450(-1021005922);
		for (int i_20_ = 0; i_20_ < 10; i_20_++)
		    System.gc();
		Runtime runtime = Runtime.getRuntime();
		int i_21_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		Class364_Sub2.method9236(new StringBuilder().append("").append
					     (i_21_).toString(),
					 (byte) 81);
		Class156.method1861(1285716496);
		Class625.method7450(-1267892191);
		for (int i_22_ = 0; i_22_ < 10; i_22_++)
		    System.gc();
		i_21_ = (int) ((runtime.totalMemory() - runtime.freeMemory())
			       / 1024L);
		Class364_Sub2.method9236(new StringBuilder().append("").append
					     (i_21_).toString(),
					 (byte) -81);
	    } else if (24 == i)
		Class364_Sub2.method9236((Class605.aClass525_7916
					      .method357((byte) 0)
					  ? "Success" : "Failure"),
					 (byte) -1);
	    else if (i == 25)
		Class12.aClass16_176.method634(1420524209);
	    else if (i == 11)
		Class700.aClass454_8734.method5468(1962763505);
	    else if (20 == i)
		Class700.aClass454_8734.method5460((byte) 24);
	    else if (2 == i)
		Class64.aCanvas754.setLocation(50, 50);
	    else if (28 == i)
		Class64.aCanvas754.setLocation(1401768651 * Class509.anInt6931,
					       (Class509.anInt6943
						* -952966111));
	    else if (i == 15)
		Class181_Sub2.method8729((byte) 0);
	    else if (26 == i) {
		client.aClass495_10935.aLong5558
		    = Class249.method3417(2080061817) * -8826400789005528605L;
		client.aClass495_10935.aBool5574 = true;
		Class181_Sub2.method8729((byte) 0);
	    } else if (23 == i) {
		Class422 class422
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868);
		Class364_Sub2.method9236(new StringBuilder().append
					     ((int) class422.aFloat4780 >> 9)
					     .append
					     (" ").append
					     ((int) class422.aFloat4777 >> 9)
					     .toString(),
					 (byte) 9);
	    } else if (8 == i) {
		Class422 class422
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868);
		Class364_Sub2.method9236
		    (new StringBuilder().append("").append
			 (client.aClass495_10935.method5973((byte) 41)
			      .aClass137Array7161
			      [(Class108.myPlayer
				.aByte10675)]
			      .method1669
			  ((int) class422.aFloat4780 >> 9,
			   (int) class422.aFloat4777 >> 9, (byte) 0))
			 .toString(),
		     (byte) -14);
	    } else if (29 == i) {
		Class364_Sub2.method9236(new StringBuilder().append
					     (Class229.aClass186_2490
						  .method2736(-1948633241))
					     .append
					     (" ").append
					     (Class229.aClass186_2490
						  .method2751(1354110544))
					     .toString(),
					 (byte) 24);
		Class364_Sub2.method9236(new StringBuilder().append
					     (Class229.aClass186_2372
						  .method2736(-1503574922))
					     .append
					     (" ").append
					     (Class229.aClass186_2372
						  .method2751(-9288394))
					     .toString(),
					 (byte) -10);
	    } else if (4 == i)
		Class666.method7908(false, -1504508452);
	    else if (7 == i) {
		client.aBool11057 = !client.aBool11057;
		Class587.aClass173_7714.method2281(client.aBool11057);
		Class7.method566(-1311440055);
	    } else if (i == 10) {
		client.anInt10897 = 0;
		client.aClass495_10935.method5989(2016078152);
	    } else if (i == 1) {
		client.anInt10897 = -1221863335;
		client.aClass495_10935.method5989(2016078152);
	    } else if (21 == i) {
		client.anInt10897 = 1851240626;
		client.aClass495_10935.method5989(2016078152);
	    }
	} catch (Exception exception) {
	    Class364_Sub2.method9236
		(Class39.aClass39_342.method807(Class378_Sub2.aClass668_10123,
						(byte) 102),
		 (byte) 5);
	}
    }
    
    static {
	anInt1261 = 0;
	aString1264 = "";
	anInt1263 = 0;
	anInt1269 = 0;
	anInt1265 = 0;
	aBool1266 = false;
	anInt1257 = 714282385;
    }
    
    static void method1333() {
	if (Class514.aClass528_Sub38_6967.aClass691_Sub31_10602
		.method10076(-740804623)
	    == 1)
	    Class590.aClass488_7736.method5895(new Class498((Class489
							     .aClass489_5505),
							    null),
					       1205382515);
	else {
	    client.aClass495_10935.method5989(2016078152);
	    Class494.method5961(1068906539);
	}
    }
    
    public static final int method1334(String string, int i) {
	if (string == null || string.length() == 0)
	    return -1;
	for (int i_23_ = 0; i_23_ < -1924608781 * client.anInt11024; i_23_++) {
	    if (string.equalsIgnoreCase(client.aClass33Array11164[i_23_]
					.aString311))
		return i_23_;
	}
	return -1;
    }
    
    static final void method1335(Class648 class648, short i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class69.aBool772 ? 1 : 0;
    }
}
