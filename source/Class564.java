/* Class564 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.MalformedURLException;
import java.net.URL;

public class Class564 implements Interface65
{
    int[] anIntArray7545;
    
    public boolean method408(Class528_Sub33 class528_sub33,
			     Interface61[] interface61s, int i,
			     Class544 class544, byte i_0_) {
	int[] is = ((Class564) this).anIntArray7545;
	for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
	    int i_2_ = is[i_1_];
	    if (!class544.method6644(i_2_, -280838372))
		return false;
	}
	return true;
    }
    
    public boolean method407(Class528_Sub33 class528_sub33,
			     Interface61[] interface61s, int i,
			     Class544 class544) {
	int[] is = ((Class564) this).anIntArray7545;
	for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
	    int i_4_ = is[i_3_];
	    if (!class544.method6644(i_4_, 956320234))
		return false;
	}
	return true;
    }
    
    Class564(int[] is) {
	((Class564) this).anIntArray7545 = is;
    }
    
    static final void method6827(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2402 * -1428356149;
    }
    
    public static boolean method6828(int i) {
	Class528_Sub40 class528_sub40
	    = (Class528_Sub40) Class47.aClass688_541.method8034(1666662289);
	if (null == class528_sub40)
	    return false;
	return true;
    }
    
    public static final void method6829
	(Class229[] class229s, int i, int i_5_, int i_6_, int i_7_, int i_8_,
	 int i_9_, int i_10_, int i_11_, boolean bool, int i_12_) {
	Class587.aClass173_7714.method2204(i_5_, i_6_, i_7_, i_8_);
	for (int i_13_ = 0; i_13_ < class229s.length; i_13_++) {
	    Class229 class229 = class229s[i_13_];
	    if (class229 != null
		&& (i == -1027873541 * class229.anInt2522
		    || (-1412584499 == i
			&& client.aClass229_11067 == class229))) {
		int i_14_;
		if (i_11_ == -1) {
		    client.aRectangleArray11090
			[-230570629 * client.anInt11114].setBounds
			(i_9_ + class229.anInt2388 * -147131735,
			 -1087215923 * class229.anInt2360 + i_10_,
			 class229.anInt2476 * -1352480433,
			 class229.anInt2458 * 1661025435);
		    i_14_
			= (client.anInt11114 += -1184542285) * -230570629 - 1;
		} else
		    i_14_ = i_11_;
		class229.anInt2553 = -2068679097 * i_14_;
		class229.anInt2554 = client.anInt11127 * 611237573;
		if (!client.method10203(class229)) {
		    if (class229.anInt2474 * -1257480855 != 0)
			Class282.method3759(class229, (short) 22456);
		    int i_15_ = class229.anInt2388 * -147131735 + i_9_;
		    int i_16_ = i_10_ + -1087215923 * class229.anInt2360;
		    int i_17_ = class229.anInt2406 * -695134203;
		    if (client.aBool11062
			&& ((client.method10201(class229).anInt10455
			     * -450987711) != 0
			    || -319431967 * class229.anInt2378 == 0)
			&& i_17_ > 127)
			i_17_ = 127;
		    if (class229 == client.aClass229_11067) {
			if (-1412584499 != i
			    && ((Class229.anInt2536 * 229565833
				 == -1485173519 * class229.anInt2481)
				|| (Class229.anInt2391 * 1032506869
				    == -1485173519 * class229.anInt2481)
				|| (client.method10201(class229)
					.method9478(2093244779)
				    && (class229.anInt2481 * -1485173519
					!= (Class229.anInt2368
					    * -1835999081))))) {
			    Class304.aClass229Array3347 = class229s;
			    Class285.anInt3128 = i_9_ * 951790785;
			    Class8_Sub1.anInt10772 = i_10_ * 973115711;
			    continue;
			}
			if (client.aBool11055 && client.aBool11041) {
			    int i_18_ = Class95_Sub1_Sub2.aClass537_11200
					    .method6507(204317376);
			    int i_19_ = Class95_Sub1_Sub2.aClass537_11200
					    .method6504((byte) -34);
			    i_18_ -= -62197331 * client.anInt11069;
			    i_19_ -= -525017675 * client.anInt11070;
			    if (i_18_ < -208716081 * client.anInt11073)
				i_18_ = client.anInt11073 * -208716081;
			    if (i_18_ + class229.anInt2476 * -1352480433
				> (-208716081 * client.anInt11073
				   + client.anInt11075 * 506740607))
				i_18_ = (-208716081 * client.anInt11073
					 + 506740607 * client.anInt11075
					 - class229.anInt2476 * -1352480433);
			    if (i_19_ < client.anInt11074 * -255571367)
				i_19_ = client.anInt11074 * -255571367;
			    if (i_19_ + class229.anInt2458 * 1661025435
				> (client.anInt11074 * -255571367
				   + -1525398647 * client.anInt11076))
				i_19_ = (-255571367 * client.anInt11074
					 + client.anInt11076 * -1525398647
					 - 1661025435 * class229.anInt2458);
			    if (client.method10201(class229)
				    .method9478(2125837313))
				Class171.method2117(i_18_, i_19_,
						    (-1352480433
						     * class229.anInt2476),
						    (class229.anInt2458
						     * 1661025435),
						    (byte) -87);
			    if (class229.anInt2481 * -1485173519
				!= Class229.anInt2368 * -1835999081) {
				i_15_ = i_18_;
				i_16_ = i_19_;
			    }
			}
			if (-1485173519 * class229.anInt2481
			    == Class229.anInt2391 * 1032506869)
			    i_17_ = 128;
		    }
		    int i_20_;
		    int i_21_;
		    int i_22_;
		    int i_23_;
		    if (-319431967 * class229.anInt2378 == 2) {
			i_20_ = i_5_;
			i_21_ = i_6_;
			i_22_ = i_7_;
			i_23_ = i_8_;
		    } else {
			int i_24_ = -1352480433 * class229.anInt2476 + i_15_;
			int i_25_ = i_16_ + 1661025435 * class229.anInt2458;
			if (9 == -319431967 * class229.anInt2378) {
			    i_24_++;
			    i_25_++;
			}
			i_20_ = i_15_ > i_5_ ? i_15_ : i_5_;
			i_21_ = i_16_ > i_6_ ? i_16_ : i_6_;
			i_22_ = i_24_ < i_7_ ? i_24_ : i_7_;
			i_23_ = i_25_ < i_8_ ? i_25_ : i_8_;
		    }
		    if (i_20_ < i_22_ && i_21_ < i_23_) {
			if (0 != class229.anInt2474 * -1257480855) {
			    if ((Class229.anInt2356 * -1948898659
				 == class229.anInt2474 * -1257480855)
				|| (-1257480855 * class229.anInt2474
				    == Class229.anInt2355 * 251079357)) {
				if (client.aBool11084) {
				    Class587.aClass173_7714.method2235();
				    Class530.method6463
					(i_15_, i_16_,
					 -1352480433 * class229.anInt2476,
					 class229.anInt2458 * 1661025435,
					 (251079357 * Class229.anInt2355
					  == -1257480855 * class229.anInt2474),
					 2057833721);
				    Class108.method1377(i_14_, i_20_, i_21_,
							i_22_, i_23_, i_15_,
							i_16_, -921504360);
				    Class587.aClass173_7714.method2527();
				    Class587.aClass173_7714
					.method2204(i_5_, i_6_, i_7_, i_8_);
				    client.aBoolArray10855[i_14_] = true;
				}
				continue;
			    }
			    if ((class229.anInt2474 * -1257480855
				 == Class229.anInt2484 * 362380521)
				&& 4 == 345087519 * client.anInt10943) {
				if (5 != -319431967 * class229.anInt2378
				    || (class229.method3197((Class587
							     .aClass173_7714),
							    1481176668)
					!= null)) {
				    Class137.method1692((Class587
							 .aClass173_7714),
							class229, i_15_, i_16_,
							443621667);
				    Class587.aClass173_7714
					.method2204(i_5_, i_6_, i_7_, i_8_);
				}
				continue;
			    }
			    if (-1834944047 * Class229.anInt2363
				== -1257480855 * class229.anInt2474) {
				Class27.method719(Class587.aClass173_7714,
						  i_15_, i_16_, class229,
						  -432122524);
				continue;
			    }
			    if (-512383939 * Class229.anInt2364
				== class229.anInt2474 * -1257480855) {
				Class219.method3144(Class587.aClass173_7714,
						    i_15_, i_16_, class229,
						    (class229.anInt2404
						     * -696699221 % 64),
						    641394882);
				continue;
			    }
			    if (-207569383 * Class229.anInt2357
				== -1257480855 * class229.anInt2474) {
				if (class229.method3197((Class587
							 .aClass173_7714),
							847511983)
				    != null) {
				    Class587.aClass173_7714.method2235();
				    Class576.method6895(class229, i_15_, i_16_,
							-442707546);
				    Class587.aClass173_7714
					.method2204(i_5_, i_6_, i_7_, i_8_);
				}
				continue;
			    }
			    if (-1257480855 * class229.anInt2474
				== Class229.anInt2358 * -1742987307) {
				Class513.method6274(Class587.aClass173_7714,
						    i_15_, i_16_,
						    (-1352480433
						     * class229.anInt2476),
						    (1661025435
						     * class229.anInt2458),
						    -1353373471);
				client.aBoolArray10855[i_14_] = true;
				Class587.aClass173_7714.method2204(i_5_, i_6_,
								   i_7_, i_8_);
				continue;
			    }
			    if (Class229.anInt2359 * 651813819
				== -1257480855 * class229.anInt2474) {
				Class304.method4050(Class587.aClass173_7714,
						    i_15_, i_16_,
						    (class229.anInt2476
						     * -1352480433),
						    (1661025435
						     * class229.anInt2458),
						    1553107335);
				client.aBoolArray10855[i_14_] = true;
				Class587.aClass173_7714.method2204(i_5_, i_6_,
								   i_7_, i_8_);
				continue;
			    }
			    if (Class229.anInt2379 * 416009815
				== class229.anInt2474 * -1257480855) {
				if (client.aBool10887 || client.aBool11057) {
				    Class92.method1227(i_15_, i_16_, class229,
						       98739717);
				    client.aBoolArray10855[i_14_] = true;
				}
				continue;
			    }
			    if (817150165 * Class229.anInt2365
				== class229.anInt2474 * -1257480855) {
				Class151 class151
				    = Class623_Sub1.method9753(42994991);
				if (null != class151) {
				    int i_26_ = i_7_ - i_5_;
				    int i_27_ = i_8_ - i_6_;
				    float f = (float) i_26_ / (float) i_27_;
				    float f_28_
					= ((float) class151.method1766()
					   / (float) class151.method1767());
				    int i_29_;
				    int i_30_;
				    if (f < f_28_) {
					i_29_ = i_26_;
					i_30_ = (int) ((float) i_26_ / f_28_);
				    } else {
					i_29_ = (int) (f_28_ * (float) i_27_);
					i_30_ = i_27_;
				    }
				    int i_31_ = i_5_ + (i_26_ - i_29_) / 2;
				    int i_32_ = i_6_ + (i_27_ - i_30_) / 2;
				    class151.method1774(i_31_, i_32_, i_29_,
							i_30_);
				}
				continue;
			    }
			    if (class229.anInt2474 * -1257480855
				== Class229.anInt2366 * 1836700139) {
				if (Class239.method3309((byte) 12)
				    && Class532.method6482(1434811910))
				    Class393.method4802(i_5_, i_6_, i_7_, i_8_,
							1909025654);
				continue;
			    }
			}
			if (-319431967 * class229.anInt2378 == 0) {
			    if (-661992929 * Class229.anInt2362
				== -1257480855 * class229.anInt2474) {
				Class587.aClass173_7714.method2235();
				client.gameScene.method5975
				    (-1919776385).method7464
				    (client.gameScene, 1271477822);
				Class587.aClass173_7714.method2262
				    (i_15_, i_16_,
				     -1117838587 * Class411.anInt4713,
				     -2142152407 * client.anInt6933);
			    }
			    method6829(class229s,
				       class229.anInt2376 * 306930455, i_20_,
				       i_21_, i_22_, i_23_,
				       (i_15_
					- -1014124179 * class229.anInt2400),
				       i_16_ - class229.anInt2401 * 1665217863,
				       i_14_, bool, -1547643525);
			    if (null != class229.aClass229Array2390)
				method6829(class229.aClass229Array2390,
					   306930455 * class229.anInt2376,
					   i_20_, i_21_, i_22_, i_23_,
					   i_15_ - (class229.anInt2400
						    * -1014124179),
					   (i_16_
					    - 1665217863 * class229.anInt2401),
					   i_14_, bool, -212081416);
			    Class528_Sub39 class528_sub39
				= ((Class528_Sub39)
				   (client.aClass692_11097.method8137
				    ((long) (class229.anInt2376
					     * 306930455))));
			    if (class528_sub39 != null)
				Class474.method5827
				    (905908359 * class528_sub39.anInt10625,
				     i_20_, i_21_, i_22_, i_23_,
				     i_15_ - class229.anInt2400 * -1014124179,
				     i_16_ - class229.anInt2401 * 1665217863,
				     i_14_, (byte) -4);
			    if (-1257480855 * class229.anInt2474
				== Class229.anInt2362 * -661992929) {
				if (Class587.aClass173_7714.method2264()) {
				    Class587.aClass173_7714.method2263
					(-1352480433 * class229.anInt2476,
					 class229.anInt2458 * 1661025435);
				    if (9 == 175711435 * client.anInt10876)
					Class181_Sub4.method8913
					    (i_15_, i_16_,
					     -1352480433 * class229.anInt2476,
					     1661025435 * class229.anInt2458,
					     -916349451);
				}
				if (0 == client.anInt10943 * 345087519) {
				    int i_33_ = 1256377805 * client.anInt10904;
				    int i_34_ = client.anInt10951 * 1632793721;
				    int i_35_ = -77639059 * client.anInt10870;
				    int i_36_
					= client.anInt10953 * -1540848447;
				    if (client.anInt11127
					< -926983649 * client.anInt10949) {
					float f
					    = ((float) (client.anInt11127
							- (client.anInt10858
							   * 1080851831))
					       * 1.0F
					       / (float) ((-926983649
							   * client.anInt10949)
							  - (client.anInt10858
							     * 1080851831)));
					i_33_
					    = (int) (f * (float) (1256377805
								  * (client
								     .anInt10904))
						     + ((1.0F - f)
							* (float) ((Class317_Sub1
								    .anInt9958)
								   * 1799757219)));
					i_34_
					    = (int) (f * (float) (1632793721
								  * (client
								     .anInt10951))
						     + ((1.0F - f)
							* (float) ((Class264
								    .anInt2866)
								   * -239896701)));
					i_35_
					    = (int) (((1.0F - f)
						      * (float) ((Class555
								  .anInt7451)
								 * -1737479823))
						     + (f
							* (float) ((client
								    .anInt10870)
								   * -77639059)));
					i_36_
					    = (int) (((float) (405742551
							       * (Class499
								  .anInt6845))
						      * (1.0F - f))
						     + ((float) (-1540848447
								 * (client
								    .anInt10953))
							* f));
				    }
				    if (i_33_ > 0)
					Class587.aClass173_7714.method2210
					    (i_20_, i_21_, i_22_ - i_20_,
					     i_23_ - i_21_,
					     (i_33_ << 24 | i_34_ << 16
					      | i_35_ << 8 | i_36_),
					     -1661351269);
				}
			    }
			    Class587.aClass173_7714.method2204(i_5_, i_6_,
							       i_7_, i_8_);
			}
			if (client.aBoolArray10952[i_14_]
			    || client.anInt11119 * -335828689 > 1) {
			    if (3 == -319431967 * class229.anInt2378) {
				if (0 == i_17_) {
				    if (class229.aBool2405)
					Class587.aClass173_7714.method2216
					    (i_15_, i_16_,
					     class229.anInt2476 * -1352480433,
					     class229.anInt2458 * 1661025435,
					     (~0xffffff
					      | (-696699221
						 * class229.anInt2404)),
					     0);
				    else
					Class587.aClass173_7714.method2215
					    (i_15_, i_16_,
					     -1352480433 * class229.anInt2476,
					     1661025435 * class229.anInt2458,
					     ~0xffffff | (class229.anInt2404
							  * -696699221),
					     0);
				} else if (class229.aBool2405)
				    Class587.aClass173_7714.method2216
					(i_15_, i_16_,
					 class229.anInt2476 * -1352480433,
					 class229.anInt2458 * 1661025435,
					 (255 - (i_17_ & 0xff) << 24
					  | (-696699221 * class229.anInt2404
					     & 0xffffff)),
					 1);
				else
				    Class587.aClass173_7714.method2215
					(i_15_, i_16_,
					 class229.anInt2476 * -1352480433,
					 class229.anInt2458 * 1661025435,
					 (255 - (i_17_ & 0xff) << 24
					  | (-696699221 * class229.anInt2404
					     & 0xffffff)),
					 1);
			    } else if (-319431967 * class229.anInt2378 == 4) {
				int i_37_ = 255 - (i_17_ & 0xff);
				if (i_37_ != 0) {
				    Class172 class172
					= (class229.method3192
					   (Class625.aClass414_8129,
					    client.anInterface50_10917,
					    -1052433778));
				    if (null == class172) {
					if (Class229.aBool2373)
					    Class39.method811(class229,
							      1435904523);
				    } else {
					int i_38_
					    = -696699221 * class229.anInt2404;
					String string = class229.aString2455;
					if (1272672363 * class229.anInt2528
					    != -1) {
					    ItemType itemType
						= ((ItemType)
						   (Class18
							.aClass5_Sub13_206
							.method63
						    ((1272672363
						      * class229.anInt2528),
						     1226229942)));
					    string = itemType.aString36;
					    if (null == string)
						string = "null";
					    if ((1 == (itemType.anInt43
						       * -2057416305)
						 || 1 != (class229.anInt2529
							  * 1956930779))
						&& (-1
						    != (1956930779
							* class229.anInt2529)))
						string
						    = new StringBuilder()
							  .append
							  (Class666.method7905
							   (16748608,
							    (short) -27051))
							  .append
							  (string).append
							  (Class49.aString549)
							  .append
							  (" x").append
							  (Class39.method808
							   ((1956930779
							     * (class229
								.anInt2529)),
							    -394999107))
							  .toString();
					}
					if (class229
					    == client.aClass229_11059) {
					    string = (Class39.aClass39_414
							  .method807
						      ((Class378_Sub2
							.aClass668_10123),
						       (byte) 102));
					    i_38_ = (class229.anInt2404
						     * -696699221);
					}
					if (client.aBool11066)
					    Class587.aClass173_7714.method2205
						(i_15_, i_16_,
						 i_15_ + (class229.anInt2476
							  * -1352480433),
						 (i_16_
						  + (1661025435
						     * class229.anInt2458)));
					i_37_ <<= 24;
					if (class229.aBool2461)
					    class172.method2127
						(string, i_15_, i_16_,
						 (-1352480433
						  * class229.anInt2476),
						 (class229.anInt2458
						  * 1661025435),
						 i_37_ | i_38_,
						 (class229.aBool2441 ? i_37_
						  : -1),
						 (339120349
						  * class229.anInt2543),
						 (class229.anInt2459
						  * -463395969),
						 client.aRandom10970,
						 Class464.anInt5305,
						 client.anIntArray11120,
						 Class298.aClass151Array3262,
						 null, -1658658966);
					else
					    class172.method2121
						(string, i_15_, i_16_,
						 (-1352480433
						  * class229.anInt2476),
						 (1661025435
						  * class229.anInt2458),
						 i_37_ | i_38_,
						 (class229.aBool2441 ? i_37_
						  : -1),
						 (339120349
						  * class229.anInt2543),
						 (-463395969
						  * class229.anInt2459),
						 (-1557508349
						  * class229.anInt2380),
						 (415883209
						  * class229.anInt2460),
						 Class298.aClass151Array3262,
						 null, null, 0, 0,
						 -2110082296);
					if (client.aBool11066)
					    Class587.aClass173_7714.method2204
						(i_5_, i_6_, i_7_, i_8_);
				    }
				}
			    } else if (class229.anInt2378 * -319431967 == 5) {
				if (-182549293 * class229.anInt2533 >= 0)
				    class229.method3195
					(Class317_Sub1.aClass5_Sub1_9957,
					 Class243.aClass5_Sub2_2730,
					 (byte) -12)
					.method6092
					(Class587.aClass173_7714, 0, i_15_,
					 i_16_,
					 -1352480433 * class229.anInt2476,
					 1661025435 * class229.anInt2458,
					 class229.anInt2534 * 1779350229 << 3,
					 156081999 * class229.anInt2535 << 3,
					 0, 0, 1094590434);
				else {
				    Class151 class151;
				    if (-1
					!= 1272672363 * class229.anInt2528) {
					PlayerModel playerModel
					    = (class229.aBool2532
					       ? (Class108
						  .myPlayer
						  .model)
					       : null);
					class151
					    = (Class18.aClass5_Sub13_206
						   .method10165
					       (Class587.aClass173_7714,
						(1272672363
						 * class229.anInt2528),
						(1956930779
						 * class229.anInt2529),
						738835805 * class229.anInt2412,
						(~0xffffff
						 | (-1357003215
						    * class229.anInt2413)),
						(class229.anInt2435
						 * -172627903),
						playerModel, -1046772752));
				    } else if (-1748514729 * class229.anInt2489
					       != -1) {
					class151
					    = ((Class151)
					       (client.aClass186_11173
						    .method2727
						((long) (-1748514729
							 * (class229
							    .anInt2489)))));
					if (class151 == null
					    && !(client.aMap11051.containsKey
						 (Integer.valueOf
						  (class229.anInt2489
						   * -1748514729)))) {
					    try {
						client.aMap11051.put
						    ((Integer.valueOf
						      (-1748514729
						       * class229.anInt2489)),
						     (Class499
							  .aClass40_6844
							  .method813
						      ((new URL
							(new StringBuilder
							     ().append
							     (client
							      .aString10868)
							     .append
							     ("/img/image_")
							     .append
							     ((class229
							       .anInt2489)
							      * -1748514729)
							     .append
							     (".png?a=").append
							     (Class249
								  .method3417
							      (1930996469))
							     .toString())),
						       -354779574)));
					    } catch (MalformedURLException malformedurlexception) {
						VarDomainType.method5340
						    (null,
						     malformedurlexception,
						     2084967522);
					    }
					}
				    } else
					class151 = (class229.method3191
						    (Class587.aClass173_7714,
						     (byte) -6));
				    if (null != class151) {
					int i_39_ = class151.method40();
					int i_40_ = class151.method1768();
					int i_41_ = 255 - (i_17_ & 0xff);
					if (i_41_ != 0) {
					    int i_42_;
					    if (-1 == (class229.anInt2404
						       * -696699221))
						i_42_ = 16777215;
					    else {
						i_42_ = ((class229.anInt2404
							  * -696699221)
							 & 0xffffff);
						if (i_42_ == 0)
						    i_42_ = 16777215;
					    }
					    i_42_ |= i_41_ << 24;
					    boolean bool_43_ = -1 != i_42_;
					    if (class229.aBool2411) {
						Class587.aClass173_7714
						    .method2205
						    (i_15_, i_16_,
						     (class229.anInt2476
						      * -1352480433) + i_15_,
						     ((1661025435
						       * class229.anInt2458)
						      + i_16_));
						if ((class229.anInt2410
						     * 2073033379)
						    != 0) {
						    int i_44_
							= ((i_39_ - 1
							    + (-1352480433
							       * (class229
								  .anInt2476)))
							   / i_39_);
						    int i_45_
							= (((1661025435
							     * (class229
								.anInt2458))
							    + (i_40_ - 1))
							   / i_40_);
						    for (int i_46_ = 0;
							 i_46_ < i_44_;
							 i_46_++) {
							for (int i_47_ = 0;
							     i_47_ < i_45_;
							     i_47_++) {
							    if (bool_43_)
								class151
								    .method1782
								    ((((float) i_39_
								       / 2.0F)
								      + (float) (i_39_ * i_46_ + i_15_)),
								     ((float) (i_16_
									       + i_47_ * i_40_)
								      + ((float) i_40_
									 / 2.0F)),
								     4096,
								     (2073033379
								      * (class229
									 .anInt2410)),
								     0, i_42_,
								     1);
							    else
								class151
								    .method1781
								    ((((float) i_39_
								       / 2.0F)
								      + (float) (i_15_ + i_39_ * i_46_)),
								     ((float) (i_40_ * i_47_
									       + i_16_)
								      + ((float) i_40_
									 / 2.0F)),
								     4096,
								     (2073033379
								      * (class229
									 .anInt2410)));
							}
						    }
						} else if (bool_43_)
						    class151.method1779
							(i_15_, i_16_,
							 (-1352480433
							  * (class229
							     .anInt2476)),
							 (1661025435
							  * (class229
							     .anInt2458)),
							 0, i_42_, 1);
						else
						    class151.method1813
							(i_15_, i_16_,
							 (class229.anInt2476
							  * -1352480433),
							 (1661025435
							  * (class229
							     .anInt2458)));
						Class587.aClass173_7714
						    .method2204
						    (i_5_, i_6_, i_7_, i_8_);
					    } else if (bool_43_) {
						if (0
						    != (2073033379
							* class229.anInt2410))
						    class151.method1782
							((((float) ((class229
								     .anInt2476)
								    * -1352480433)
							   / 2.0F)
							  + (float) i_15_),
							 ((float) i_16_
							  + ((float) ((class229
								       .anInt2458)
								      * 1661025435)
							     / 2.0F)),
							 (class229.anInt2476
							  * 747958272 / i_39_),
							 (2073033379
							  * (class229
							     .anInt2410)),
							 0, i_42_, 1);
						else if ((i_39_
							  != ((class229
							       .anInt2476)
							      * -1352480433))
							 || ((1661025435
							      * (class229
								 .anInt2458))
							     != i_40_))
						    class151.method1776
							(i_15_, i_16_,
							 (-1352480433
							  * (class229
							     .anInt2476)),
							 (class229.anInt2458
							  * 1661025435),
							 0, i_42_, 1);
						else
						    class151.method1780(i_15_,
									i_16_,
									0,
									i_42_,
									1);
					    } else if (0 != (class229.anInt2410
							     * 2073033379))
						class151.method1783
						    (((float) ((class229
								.anInt2476)
							       * -1352480433)
						      / 2.0F) + (float) i_15_,
						     ((float) (1661025435
							       * (class229
								  .anInt2458))
						      / 2.0F) + (float) i_16_,
						     (float) i_39_ / 2.0F,
						     (float) i_40_ / 2.0F,
						     (747958272
						      * class229.anInt2476
						      / i_39_),
						     (class229.anInt2458
						      * 331984896 / i_40_),
						     (2073033379
						      * class229.anInt2410),
						     1, -1, 1);
					    else if ((i_39_
						      != (class229.anInt2476
							  * -1352480433))
						     || ((1661025435
							  * class229.anInt2458)
							 != i_40_))
						class151.method1774
						    (i_15_, i_16_,
						     (-1352480433
						      * class229.anInt2476),
						     (1661025435
						      * class229.anInt2458));
					    else
						class151.method1773(i_15_,
								    i_16_);
					}
				    } else if (Class229.aBool2373)
					Class39.method811(class229,
							  1435904523);
				}
			    } else if (-319431967 * class229.anInt2378 == 6) {
				Class587.aClass173_7714.method2235();
				Class157 class157 = null;
				int i_48_ = 2048;
				if (class229.anInt2443 * -412903239 != 0)
				    i_48_ |= 0x80000;
				int i_49_ = 0;
				if (class229.anInt2528 * 1272672363 != -1) {
				    ItemType itemType
					= ((ItemType)
					   (Class18.aClass5_Sub13_206.method63
					    (1272672363 * class229.anInt2528,
					     -1572640498)));
				    if (itemType != null) {
					itemType = (itemType.method527
						  ((1956930779
						    * class229.anInt2529),
						   -404603094));
					class157
					    = (itemType.method516
					       (Class587.aClass173_7714, i_48_,
						1,
						(class229.aBool2532
						 ? (Class108
						    .myPlayer
						    .model)
						 : null),
						class229.aClass690_2541, 0, 0,
						0, 0, (byte) 77));
					if (class157 != null)
					    i_49_
						= -class157.method2018() >> 1;
					else
					    Class39.method811(class229,
							      1435904523);
				    }
				} else if (3
					   == class229.anInt2418 * 292816267) {
				    int i_50_
					= -1386163263 * class229.anInt2419;
				    if (i_50_ >= 0 && i_50_ < 2048) {
					Player class645_sub1_sub5_sub1_sub2
					    = (client
					       .localPlayers
					       [i_50_]);
					if ((null
					     != class645_sub1_sub5_sub1_sub2)
					    && ((-1453744879
						 * client.anInt11025) == i_50_
						|| ((Class57.method992
						     ((class645_sub1_sub5_sub1_sub2
						       .displayUnfiltered),
						      -1872640331))
						    == (-723949689
							* (class229
							   .anInt2349))))) {
					    class157
						= (class229.method3202
						   (Class587.aClass173_7714,
						    i_48_,
						    (Class147
						     .aClass5_Sub14_1673),
						    ISAACCipher.aClass5_Sub7_157,
						    Class21.aClass5_Sub8_214,
						    Class18.aClass5_Sub13_206,
						    Class379.aClass5_Sub4_3966,
						    Class570.playerVarsProvider,
						    Class570.playerVarsProvider,
						    class229.aClass690_2541,
						    (class645_sub1_sub5_sub1_sub2
						     .model),
						    -1262956069));
					    if (null == class157
						&& Class229.aBool2373)
						Class39.method811(class229,
								  1435904523);
					}
				    }
				} else if (292816267 * class229.anInt2418
					   == 5) {
				    int i_51_
					= -1386163263 * class229.anInt2419;
				    Player class645_sub1_sub5_sub1_sub2
					= null;
				    boolean bool_52_ = false;
				    if (i_51_ >= 0 && i_51_ < 2048) {
					class645_sub1_sub5_sub1_sub2
					    = (client
					       .localPlayers
					       [i_51_]);
					bool_52_
					    = ((null
						!= class645_sub1_sub5_sub1_sub2)
					       && ((i_51_
						    == (-1453744879
							* client.anInt11025))
						   || ((Class57.method992
							((class645_sub1_sub5_sub1_sub2
							  .displayUnfiltered),
							 -1160351521))
						       == (-723949689
							   * (class229
							      .anInt2349)))));
				    } else if (-1 == i_51_) {
					bool_52_ = true;
					class645_sub1_sub5_sub1_sub2
					    = (Class108
					       .myPlayer);
				    } else {
					Player class645_sub1_sub5_sub1_sub2_53_
					    = ((Player)
					       (client.aMap11026.get
						(Integer.valueOf(i_51_))));
					if ((class645_sub1_sub5_sub1_sub2_53_
					     != null)
					    && (i_51_
						== (-34811601
						    * (class645_sub1_sub5_sub1_sub2_53_
						       .anInt11783)))) {
					    bool_52_ = true;
					    class645_sub1_sub5_sub1_sub2
						= class645_sub1_sub5_sub1_sub2_53_;
					}
				    }
				    if (bool_52_
					&& class645_sub1_sub5_sub1_sub2 != null
					&& (null
					    != (class645_sub1_sub5_sub1_sub2
						.model)))
					class157
					    = (class645_sub1_sub5_sub1_sub2
						   .model.method7287
					       (Class587.aClass173_7714, i_48_,
						Class147.aClass5_Sub14_1673,
						ISAACCipher.aClass5_Sub7_157,
						Class21.aClass5_Sub8_214,
						Class18.aClass5_Sub13_206,
						Class570.playerVarsProvider,
						Class570.playerVarsProvider,
						class229.aClass690_2541, null,
						null, null, 0, true,
						Class162.equipDefaults,
						-289327997));
				} else if (class229.anInt2418 * 292816267 == 8
					   || (class229.anInt2418 * 292816267
					       == 9)) {
				    Class528_Sub6 class528_sub6
					= IncomingPacket.method4814((-1386163263
							       * (class229
								  .anInt2419)),
							      false,
							      1964978131);
				    if (null != class528_sub6)
					class157
					    = (class528_sub6.method9265
					       (Class587.aClass173_7714, i_48_,
						class229.aClass690_2541,
						(class229.anInt2349
						 * -723949689),
						(292816267 * class229.anInt2418
						 == 9),
						(class229.aBool2532
						 ? (Class108
						    .myPlayer
						    .model)
						 : null),
						(byte) -89));
				} else if (null == class229.aClass690_2541
					   || !class229.aClass690_2541
						   .method8067((byte) 22)) {
				    class157
					= (class229.method3202
					   (Class587.aClass173_7714, i_48_,
					    Class147.aClass5_Sub14_1673,
					    ISAACCipher.aClass5_Sub7_157,
					    Class21.aClass5_Sub8_214,
					    Class18.aClass5_Sub13_206,
					    Class379.aClass5_Sub4_3966,
					    Class570.playerVarsProvider,
					    Class570.playerVarsProvider, null,
					    (Class108
					     .myPlayer
					     .model),
					    569761970));
				    if (class157 == null && Class229.aBool2373)
					Class39.method811(class229,
							  1435904523);
				} else {
				    class157
					= (class229.method3202
					   (Class587.aClass173_7714, i_48_,
					    Class147.aClass5_Sub14_1673,
					    ISAACCipher.aClass5_Sub7_157,
					    Class21.aClass5_Sub8_214,
					    Class18.aClass5_Sub13_206,
					    Class379.aClass5_Sub4_3966,
					    Class570.playerVarsProvider,
					    Class570.playerVarsProvider,
					    class229.aClass690_2541,
					    (Class108
					     .myPlayer
					     .model),
					    -74994670));
				    if (null == class157 && Class229.aBool2373)
					Class39.method811(class229,
							  1435904523);
				}
				if (null != class157) {
				    if (class229.anInt2443 * -412903239 != 0)
					class157.method1917
					    (1801179431 * class229.anInt2399,
					     2146713755 * class229.anInt2477,
					     class229.anInt2442 * 423541963,
					     class229.anInt2443 * -412903239);
				    int i_54_;
				    if (class229.anInt2431 * 1520184523 > 0)
					i_54_ = (((-1352480433
						   * class229.anInt2476)
						  << 9)
						 / (1520184523
						    * class229.anInt2431));
				    else
					i_54_ = 512;
				    int i_55_;
				    if (704341795 * class229.anInt2432 > 0)
					i_55_
					    = ((1661025435 * class229.anInt2458
						<< 9)
					       / (class229.anInt2432
						  * 704341795));
				    else
					i_55_ = 512;
				    int i_56_ = i_15_ + (class229.anInt2476
							 * -1352480433 / 2);
				    int i_57_
					= (1661025435 * class229.anInt2458 / 2
					   + i_16_);
				    if (!class229.aBool2421) {
					i_56_
					    += (178288827 * class229.anInt2403
						* i_54_) >> 9;
					i_57_ += i_55_ * (class229.anInt2428
							  * 338034459) >> 9;
				    }
				    client.aClass433_11080.method5219();
				    Class587.aClass173_7714
					.method2465(client.aClass433_11080);
				    Class418 class418
					= Class587.aClass173_7714.method2241();
				    int i_58_ = client.gameScene
						    .method6020(1737452510);
				    int i_59_ = client.gameScene
						    .method5972(1387307158);
				    i_59_ += class229.anInt2430 * 2135116593;
				    if (class229.aBool2433) {
					if (6 == (Class390.anInt4111
						  * -1860881523)) {
					    if (class229.aBool2421)
						class418.method5025
						    ((float) i_56_,
						     (float) i_57_,
						     (float) i_54_,
						     (float) i_55_,
						     (Class495
							  .aClass283_Sub1_5578
							  .method3830
						      (921797074)),
						     (Class495
							  .aClass283_Sub1_5578
							  .method3797
						      (2059857974)),
						     (float) (-1117838587
							      * (Class411
								 .anInt4713)),
						     (float) (-2142152407
							      * (client
								 .anInt6933)),
						     (float) ((class229
							       .anInt2430)
							      * 2135116593));
					    else
						class418.method5025
						    ((float) i_56_,
						     (float) i_57_,
						     (float) i_54_,
						     (float) i_55_,
						     (Class495
							  .aClass283_Sub1_5578
							  .method3830
						      (354933607)),
						     (Class495
							  .aClass283_Sub1_5578
							  .method3797
						      (2074331886)),
						     (float) ((Class411
							       .anInt4713)
							      * -1117838587),
						     (float) (client.anInt6933
							      * -2142152407),
						     (float) ((2135116593
							       * (class229
								  .anInt2430))
							      << 2));
					} else if (class229.aBool2421)
					    class418.method5025
						((float) i_56_, (float) i_57_,
						 (float) i_54_, (float) i_55_,
						 (float) i_58_, (float) i_59_,
						 (float) (-1117838587
							  * (Class411
							     .anInt4713)),
						 (float) (client.anInt6933
							  * -2142152407),
						 (float) (2135116593
							  * (class229
							     .anInt2430)));
					else
					    class418.method5025
						((float) i_56_, (float) i_57_,
						 (float) i_54_, (float) i_55_,
						 (float) i_58_, (float) i_59_,
						 (float) (Class411.anInt4713
							  * -1117838587),
						 (float) (-2142152407
							  * client.anInt6933),
						 (float) ((class229.anInt2430
							   * 2135116593)
							  << 2));
				    } else if (6 == (-1860881523
						     * Class390.anInt4111))
					class418.method4984
					    ((float) i_56_, (float) i_57_,
					     (float) i_54_, (float) i_55_,
					     Class495.aClass283_Sub1_5578
						 .method3830(-1314199620),
					     Class495.aClass283_Sub1_5578
						 .method3797(2077965638),
					     (float) (Class411.anInt4713
						      * -1117838587),
					     (float) (-2142152407
						      * client.anInt6933));
				    else
					class418.method4984
					    ((float) i_56_, (float) i_57_,
					     (float) i_54_, (float) i_55_,
					     (float) i_58_, (float) i_59_,
					     (float) (-1117838587
						      * Class411.anInt4713),
					     (float) (client.anInt6933
						      * -2142152407));
				    Class587.aClass173_7714
					.method2252(class418);
				    Class587.aClass173_7714.method2268(2, 0);
				    if (class229.aBool2506)
					Class587.aClass173_7714
					    .method2283(false);
				    if (class229.aBool2421) {
					client.aClass433_10879.method5224
					    (1.0F, 0.0F, 0.0F,
					     (Class417.method4970
					      (1748557977
					       * class229.anInt2424)));
					client.aClass433_10879.method5256
					    (0.0F, 1.0F, 0.0F,
					     Class417.method4970((class229
								  .anInt2517)
								 * 733415573));
					client.aClass433_10879.method5256
					    (0.0F, 0.0F, 1.0F,
					     (Class417.method4970
					      (-1036451571
					       * class229.anInt2426)));
					client.aClass433_10879.method5252
					    ((float) (178288827
						      * class229.anInt2403),
					     (float) (class229.anInt2428
						      * 338034459),
					     (float) (class229.anInt2429
						      * 468955689));
				    } else {
					int i_60_
					    = (((Class417.anIntArray4766
						 [(1748557977
						   * class229.anInt2424) << 3])
						* ((2135116593
						    * class229.anInt2430)
						   << 2))
					       >> 14);
					int i_61_
					    = ((class229.anInt2430 * 2135116593
						<< 2)
					       * (Class417.anIntArray4767
						  [((1748557977
						     * class229.anInt2424)
						    << 3)])) >> 14;
					client.aClass433_10879.method5224
					    (0.0F, 0.0F, 1.0F,
					     (Class417.method4970
					      (-(class229.anInt2426
						 * -1036451571) << 3)));
					client.aClass433_10879.method5256
					    (0.0F, 1.0F, 0.0F,
					     (Class417.method4970
					      (733415573 * class229.anInt2517
					       << 3)));
					client.aClass433_10879.method5252
					    ((float) ((class229.anInt2462
						       * -656097211)
						      << 2),
					     (float) (i_60_
						      + ((class229.anInt2423
							  * -1052877275)
							 << 2)
						      + i_49_),
					     (float) (i_61_
						      + ((-1052877275
							  * class229.anInt2423)
							 << 2)));
					client.aClass433_10879.method5256
					    (1.0F, 0.0F, 0.0F,
					     (Class417.method4970
					      (1748557977 * class229.anInt2424
					       << 3)));
				    }
				    class229.method3194((Class587
							 .aClass173_7714),
							class157,
							client.aClass433_10879,
							client.anInt11127,
							-1778130617);
				    Class587.aClass173_7714.method2527();
				    Class587.aClass173_7714.method2350(true);
				    Class587.aClass173_7714
					.method2204(i_5_, i_6_, i_7_, i_8_);
				    if (client.aBool11066)
					Class587.aClass173_7714.method2205
					    (i_15_, i_16_,
					     i_15_ + (class229.anInt2476
						      * -1352480433),
					     i_16_ + (class229.anInt2458
						      * 1661025435));
				    if (class229.aBool2444)
					client.gameScene.method5975
					    (-2106179709).method7479
					    (((float) (1303231609
						       * class229.anInt2450)
					      / 256.0F),
					     ((float) (-1294379823
						       * class229.anInt2448)
					      / 256.0F),
					     (float) (class229.anInt2449
						      * 543883937) / 256.0F,
					     class229.anInt2451 * 1572293109,
					     -1768224951 * class229.anInt2445,
					     -230835647 * class229.anInt2525,
					     -735911545 * class229.anInt2447,
					     class229.anInt2422 * 232456167,
					     -302458544);
				    else
					client.gameScene.method5975
					    (-603795563).method7486((byte) 2);
				    class157.method1897(client.aClass433_10879,
							null, 1);
				    if (!class229.aBool2433
					&& null != class229.aClass612_2556)
					Class587.aClass173_7714.method2209
					    (class229.aClass612_2556
						 .method7309());
				    if (client.aBool11066)
					Class587.aClass173_7714.method2204
					    (i_5_, i_6_, i_7_, i_8_);
				    Class587.aClass173_7714.method2350(false);
				    Class587.aClass173_7714.method2203();
				    Class587.aClass173_7714
					.method2204(i_5_, i_6_, i_7_, i_8_);
				    if (class229.aBool2444)
					client.gameScene.method5975
					    (24848848).method7486((byte) 2);
				    if (class229.aBool2506)
					Class587.aClass173_7714
					    .method2283(true);
				}
			    } else if (9 == -319431967 * class229.anInt2378) {
				int i_62_;
				int i_63_;
				int i_64_;
				int i_65_;
				if (class229.aBool2408) {
				    i_62_ = i_15_;
				    i_63_ = (1661025435 * class229.anInt2458
					     + i_16_);
				    i_64_ = (class229.anInt2476 * -1352480433
					     + i_15_);
				    i_65_ = i_16_;
				} else {
				    i_62_ = i_15_;
				    i_63_ = i_16_;
				    i_64_ = (class229.anInt2476 * -1352480433
					     + i_15_);
				    i_65_ = i_16_ + (1661025435
						     * class229.anInt2458);
				}
				if (class229.anInt2407 * 197036027 == 1)
				    Class587.aClass173_7714.method2219
					(i_62_, i_63_, i_64_, i_65_,
					 (~0xffffff
					  | class229.anInt2404 * -696699221),
					 0);
				else
				    Class587.aClass173_7714.method2223
					(i_62_, i_63_, i_64_, i_65_,
					 (~0xffffff
					  | class229.anInt2404 * -696699221),
					 class229.anInt2407 * 197036027, 0);
			    }
			}
		    }
		}
	    }
	}
    }
}
