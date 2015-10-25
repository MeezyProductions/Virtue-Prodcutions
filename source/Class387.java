/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class387
{
    public Class528_Sub21_Sub4 aClass528_Sub21_Sub4_4070;
    public int anInt4071;
    public int[] anIntArray4072;
    public static int anInt4073;
    
    public static void method4749(int i) {
	Class497.method6058();
    }
    
    static final void method4750(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub10_10572
		  .method8126(i_0_, -1955030095);
    }
    
    static final void method4751(int i, int i_1_, int i_2_, int i_3_, int i_4_,
				 int i_5_, int i_6_) {
	int i_7_ = 1087758653 * GPI.localPlayerCount;
	int[] is = GPI.localPlayerIndicies;
	client.anInt11121 = 0;
	int i_8_;
	if (0 == client.anInt10943 * 345087519)
	    i_8_ = Class185.aClass182Array2106.length;
	else
	    i_8_ = -2065344127 * client.anInt10922 + i_7_;
	for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
	    Class299 class299 = null;
	    Entity class645_sub1_sub5_sub1;
	    if (client.anInt10943 * 345087519 == 0) {
		Class182 class182 = Class185.aClass182Array2106[i_9_];
		if (!class182.aBool2097)
		    continue;
		class645_sub1_sub5_sub1 = class182.method2689(-1012043543);
		if (-2032978979 * client.anInt10968
		    != -676897173 * class645_sub1_sub5_sub1.anInt11822)
		    continue;
		if (-1832008567 * class182.anInt2096 >= 0) {
		    class299 = ((NPC)
				class645_sub1_sub5_sub1).aClass299_12043;
		    if (null != class299.anIntArray3302) {
			class299 = class299.method3996(Class570.playerVarsProvider,
						       Class570.playerVarsProvider,
						       -734725386);
			if (class299 == null)
			    continue;
		    }
		}
	    } else {
		if (i_9_ < i_7_)
		    class645_sub1_sub5_sub1
			= (client.localPlayers
			   [is[i_9_]]);
		else {
		    class645_sub1_sub5_sub1
			= ((Entity)
			   (((Class528_Sub31)
			     (client.aClass692_11110.method8137
			      ((long) client.anIntArray10923[i_9_ - i_7_])))
			    .anObject10468));
		    class299 = ((NPC)
				class645_sub1_sub5_sub1).aClass299_12043;
		    if (class299.anIntArray3302 != null) {
			class299 = class299.method3996(Class570.playerVarsProvider,
						       Class570.playerVarsProvider,
						       -878115444);
			if (class299 == null)
			    continue;
		    }
		}
		if (class645_sub1_sub5_sub1.anInt11767 * -659687063 < 0
		    || ((class645_sub1_sub5_sub1.anInt11822 * -676897173
			 != client.anInt10968 * -2032978979)
			&& (class645_sub1_sub5_sub1.aByte10675
			    != (Class108.myPlayer
				.aByte10675))))
		    continue;
	    }
	    Class661.method7873(class645_sub1_sub5_sub1,
				class645_sub1_sub5_sub1.method9785(1390642295),
				false, (byte) 61);
	    if (!(client.aFloatArray10888[0] < 0.0F)) {
		if (class645_sub1_sub5_sub1.method10679(-624627910)) {
		    Class492 class492
			= class645_sub1_sub5_sub1.method10680(1505311029);
		    if (class492 != null
			&& (-2016496297 * client.anInt11121
			    < client.anInt11122 * 1849994433)) {
			String string = class492.method5934((byte) 6);
			if (Class96.aClass259_1226.method3548(1549098179))
			    string = Class96.aClass259_1226
					 .method3547(string, -197560722);
			client.anIntArray11125[-2016496297 * client.anInt11121]
			    = Class392.aClass1_4120.method490(string,
							      941026227) / 2;
			client.anIntArray11003[client.anInt11121 * -2016496297]
			    = (int) client.aFloatArray10888[0];
			client.anIntArray11081[client.anInt11121 * -2016496297]
			    = (int) client.aFloatArray10888[1];
			client.aClass492Array11126[(-2016496297
						    * client.anInt11121)]
			    = class492;
			client.anInt11121 += 1861420647;
		    }
		}
		int i_10_ = (int) (client.aFloatArray10888[1] + (float) i_1_);
		i_10_ -= -55898191 * Class392.aClass1_4120.anInt12;
		boolean bool = false;
		if (!class645_sub1_sub5_sub1.aBool11763
		    && !class645_sub1_sub5_sub1.aClass695_11779
			    .method8178((byte) 1)) {
		    for (Class511_Sub3 class511_sub3
			     = (Class511_Sub3) class645_sub1_sub5_sub1
						   .aClass695_11779
						   .method8177(-2137397965);
			 class511_sub3 != null;
			 class511_sub3
			     = (Class511_Sub3) class645_sub1_sub5_sub1
						   .aClass695_11779
						   .method8184(-1271249023)) {
			Class511_Sub4 class511_sub4
			    = class511_sub3.method9292(client.anInt11127,
						       (byte) 2);
			if (class511_sub4 != null) {
			    Class556 class556 = class511_sub3.aClass556_10265;
			    Player class645_sub1_sub5_sub1_sub2
				= (client
				   .localPlayers
				   [is[i_9_]]);
			    Class151 class151;
			    Class151 class151_11_;
			    if (null != class645_sub1_sub5_sub1_sub2
				&& (Class213.aClass213_2250
				    != (class645_sub1_sub5_sub1_sub2
					.aClass213_12066))) {
				if ((class645_sub1_sub5_sub1_sub2
				     .aClass213_12066)
				    == Class213.aClass213_2251) {
				    class151
					= (class556.method6751
					   (Class587.aClass173_7714,
					    1840004443 * class556.anInt7464,
					    -1382827986));
				    class151_11_
					= (class556.method6751
					   (Class587.aClass173_7714,
					    -101825271 * class556.anInt7456,
					    -1601523501));
				} else {
				    class151
					= (class556.method6751
					   (Class587.aClass173_7714,
					    class556.anInt7462 * 366551457,
					    1060552358));
				    class151_11_
					= (class556.method6751
					   (Class587.aClass173_7714,
					    class556.anInt7463 * -508584775,
					    1171179636));
				}
			    } else {
				class151
				    = class556.method6751((Class587
							   .aClass173_7714),
							  (-134570477
							   * (class556
							      .anInt7461)),
							  -1289099444);
				class151_11_
				    = class556.method6751((Class587
							   .aClass173_7714),
							  (class556.anInt7460
							   * 1393464203),
							  1033344190);
			    }
			    if (null != class151 && null != class151_11_) {
				int i_12_ = 255;
				int i_13_ = -1;
				int i_14_ = (client.anInt11127
					     - (class511_sub4.anInt10273
						* -727626085));
				int i_15_ = (class151_11_.method1766()
					     * (class511_sub4.anInt10272
						* -596696737)
					     / 255);
				if (416530587 * class511_sub4.anInt10270
				    > i_14_) {
				    int i_16_
					= (0 == 2110849347 * class556.anInt7458
					   ? 0
					   : (i_14_
					      / (class556.anInt7458
						 * 2110849347)
					      * (class556.anInt7458
						 * 2110849347)));
				    int i_17_ = (class151_11_.method1766()
						 * (class511_sub4.anInt10271
						    * -815728913)
						 / 255);
				    i_13_ = ((i_15_ - i_17_) * i_16_
					     / (class511_sub4.anInt10270
						* 416530587)) + i_17_;
				} else {
				    i_13_ = i_15_;
				    int i_18_
					= (-667352383 * class556.anInt7459
					   + (class511_sub4.anInt10270
					      * 416530587)
					   - i_14_);
				    if (-2126636589 * class556.anInt7457 >= 0)
					i_12_ = ((i_18_ << 8)
						 / ((class556.anInt7459
						     * -667352383)
						    - (-2126636589
						       * class556.anInt7457)));
				}
				if (class511_sub4.anInt10272 * -596696737 > 0
				    && i_13_ < 2)
				    i_13_ = 2;
				int i_19_ = class151.method1767();
				int i_20_
				    = (int) (client.aFloatArray10888[0]
					     + (float) i
					     - (float) (class151.method1766()
							>> 1));
				i_10_ -= i_19_;
				if (i_12_ >= 0 && i_12_ < 255) {
				    int i_21_ = i_12_ << 24;
				    int i_22_ = i_21_ | 0xffffff;
				    class151.method1780(i_20_, i_10_, 0, i_22_,
							1);
				    Class587.aClass173_7714.method2205
					(i_20_, i_10_, i_13_ + i_20_,
					 i_10_ + i_19_);
				    class151_11_.method1780(i_20_, i_10_, 0,
							    i_22_, 1);
				} else {
				    class151.method1773(i_20_, i_10_);
				    Class587.aClass173_7714.method2205
					(i_20_, i_10_, i_20_ + i_13_,
					 i_19_ + i_10_);
				    class151_11_.method1773(i_20_, i_10_);
				}
				Class587.aClass173_7714.method2204(i, i_1_,
								   i_2_ + i,
								   (i_3_
								    + i_1_));
				i_10_ -= 2;
				bool = true;
			    }
			} else if (class511_sub3.method9287((short) -5211))
			    class511_sub3.method6259(1264750813);
		    }
		}
		if (!bool)
		    i_10_
			-= 2 + Class184.aClass622_2103.anInt8079 * 1271468339;
		if (!class645_sub1_sub5_sub1.aBool11763) {
		    if (class299 == null) {
			Player class645_sub1_sub5_sub1_sub2
			    = ((Player)
			       class645_sub1_sub5_sub1);
			for (int i_23_ = 0;
			     i_23_ < (class645_sub1_sub5_sub1_sub2
				      .headIconSubIDs).length;
			     i_23_++) {
			    if ((class645_sub1_sub5_sub1_sub2.headIconSubIDs
				 [i_23_])
				>= 0) {
				Object object = null;
				int i_24_ = (class645_sub1_sub5_sub1_sub2
					     .headIconSubIDs[i_23_]);
				int i_25_ = (class645_sub1_sub5_sub1_sub2
					     .headIconSpriteIDs[i_23_]);
				long l = (long) (i_25_ << 8 | i_24_);
				Class151 class151
				    = ((Class151)
				       client.aClass186_10915.method2727(l));
				if (null == class151) {
				    Class178[] class178s
					= (Class175.method2564
					   (Class623_Sub1.aClass446_10671,
					    i_25_, 0));
				    if (class178s == null)
					continue;
				    class151
					= (Class587.aClass173_7714.method2334
					   (class178s[i_24_], true));
				    client.aClass186_10915.method2729(class151,
								      l);
				}
				if (null != class151) {
				    i_10_ -= class151.method1767();
				    class151.method1773
					((int) (client.aFloatArray10888[0]
						+ (float) i - 12.0F),
					 i_10_);
				    i_10_ -= 2;
				}
			    }
			}
		    } else {
			NPC class645_sub1_sub5_sub1_sub1
			    = ((NPC)
			       class645_sub1_sub5_sub1);
			int[] is_26_
			    = ((class645_sub1_sub5_sub1_sub1.aClass281_12037
				!= null)
			       ? (class645_sub1_sub5_sub1_sub1.aClass281_12037
				  .anIntArray3064)
			       : (class645_sub1_sub5_sub1_sub1.aClass299_12043
				  .anIntArray3298));
			short[] is_27_
			    = ((class645_sub1_sub5_sub1_sub1.aClass281_12037
				!= null)
			       ? (class645_sub1_sub5_sub1_sub1.aClass281_12037
				  .aShortArray3065)
			       : (class645_sub1_sub5_sub1_sub1.aClass299_12043
				  .aShortArray3299));
			if (null != is_27_ && is_26_ != null) {
			    int i_28_ = 0;
			    for (/**/; i_28_ < is_27_.length; i_28_++) {
				if (is_27_[i_28_] >= 0 && is_26_[i_28_] >= 0) {
				    Object object = null;
				    long l = (long) (is_26_[i_28_] << 8
						     | is_27_[i_28_]);
				    Class151 class151
					= (Class151) client.aClass186_10915
							 .method2727(l);
				    if (class151 == null) {
					Class178[] class178s
					    = (Class175.method2564
					       (Class623_Sub1.aClass446_10671,
						is_26_[i_28_], 0));
					if (class178s == null)
					    continue;
					class151 = (Class587.aClass173_7714
							.method2334
						    (class178s[is_27_[i_28_]],
						     true));
					client.aClass186_10915
					    .method2729(class151, l);
				    }
				    if (class151 != null) {
					i_10_ -= class151.method1767();
					class151.method1773
					    ((int) ((float) i
						    + (client.aFloatArray10888
						       [0])
						    - (float) ((class151
								    .method1766
								())
							       >> 1)),
					     i_10_);
					i_10_ -= 2;
				    }
				}
			    }
			}
		    }
		}
		if (class645_sub1_sub5_sub1
		    instanceof Player) {
		    if (i_9_ >= 0) {
			int i_29_ = 0;
			Class96[] class96s = client.aClass96Array11016;
			for (int i_30_ = 0; i_30_ < class96s.length; i_30_++) {
			    Class96 class96 = class96s[i_30_];
			    if (null != class96
				&& 10 == class96.anInt1224 * -411936407
				&& (-1637531687 * class96.anInt1216
				    == is[i_9_])) {
				Class151 class151
				    = (Class215.aClass151Array2271
				       [(1574185279
					 * ((Class96) class96).anInt1225)]);
				if (class151.method1767() > i_29_)
				    i_29_ = class151.method1767();
				class151.method1773
				    ((int) (client.aFloatArray10888[0]
					    + (float) i - 12.0F),
				     i_10_ - class151.method1767());
			    }
			}
			if (i_29_ > 0)
			    i_10_ -= 2 + i_29_;
		    }
		} else {
		    int i_31_ = 0;
		    Class96[] class96s = client.aClass96Array11016;
		    for (int i_32_ = 0; i_32_ < class96s.length; i_32_++) {
			Class96 class96 = class96s[i_32_];
			if (class96 != null
			    && -411936407 * class96.anInt1224 == 1
			    && (client.anIntArray10923[i_9_ - i_7_]
				== -1637531687 * class96.anInt1216)) {
			    Class151 class151
				= (Class215.aClass151Array2271
				   [(1574185279
				     * ((Class96) class96).anInt1225)]);
			    if (class151.method1767() > i_31_)
				i_31_ = class151.method1767();
			    boolean bool_33_;
			    if (0
				== -2029922743 * ((Class96) class96).anInt1223)
				bool_33_ = true;
			    else {
				int i_34_
				    = (Class262.method3646(-1905838472) * 1000
				       / (-2029922743
					  * ((Class96) class96).anInt1223)
				       / 2);
				bool_33_
				    = client.anInt11127 % (2 * i_34_) < i_34_;
			    }
			    if (bool_33_)
				class151.method1773((int) ((float) i
							   + (client
							      .aFloatArray10888
							      [0])
							   - 12.0F),
						    (i_10_
						     - class151.method1767()));
			}
		    }
		    if (i_31_ > 0)
			i_10_ -= i_31_ + 2;
		}
		int i_35_ = 0;
		for (/**/;
		     i_35_ < Class184.aClass622_2103.anInt8071 * -55491509;
		     i_35_++) {
		    int i_36_ = class645_sub1_sub5_sub1.anIntArray11776[i_35_];
		    int i_37_ = class645_sub1_sub5_sub1.anIntArray11807[i_35_];
		    Class575 class575 = null;
		    int i_38_ = 0;
		    if (i_37_ >= 0) {
			if (i_36_ <= client.anInt11127)
			    continue;
			class575
			    = (Class575) (Class581.aClass5_Sub19_7649.method63
					  ((class645_sub1_sub5_sub1
					    .anIntArray11807[i_35_]),
					   2008119671));
			i_38_ = class575.anInt7580 * -601153071;
			if (null != class575
			    && null != class575.anIntArray7593) {
			    class575
				= class575.method6874(Class570.playerVarsProvider,
						      Class570.playerVarsProvider,
						      -1872314409);
			    if (null == class575) {
				class645_sub1_sub5_sub1.anIntArray11776[i_35_]
				    = -1;
				continue;
			    }
			}
		    } else if (i_36_ < 0)
			continue;
		    int i_39_ = class645_sub1_sub5_sub1.anIntArray11784[i_35_];
		    Class575 class575_40_ = null;
		    if (i_39_ >= 0) {
			class575_40_
			    = (Class575) Class581.aClass5_Sub19_7649
					     .method63(i_39_, -465985596);
			if (null != class575_40_
			    && class575_40_.anIntArray7593 != null)
			    class575_40_
				= class575_40_.method6874((Class570
							   .playerVarsProvider),
							  (Class570
							   .playerVarsProvider),
							  -650267465);
		    }
		    if (i_36_ - i_38_ <= client.anInt11127) {
			if (null == class575)
			    class645_sub1_sub5_sub1.anIntArray11776[i_35_]
				= -1;
			else {
			    int i_41_ = (class645_sub1_sub5_sub1
					     .method9785(-71866467)
					 / 2);
			    Class661.method7873(class645_sub1_sub5_sub1, i_41_,
						false, (byte) 33);
			    if (client.aFloatArray10888[0] > -1.0F) {
				client.aFloatArray10888[0]
				    += (float) (Class184.aClass622_2103
						.anIntArray8072[i_35_]);
				client.aFloatArray10888[1]
				    += (float) (Class184.aClass622_2103
						.anIntArray8087[i_35_]);
				Object object = null;
				Object object_42_ = null;
				Object object_43_ = null;
				Object object_44_ = null;
				int i_45_ = 0;
				int i_46_ = 0;
				int i_47_ = 0;
				int i_48_ = 0;
				int i_49_ = 0;
				int i_50_ = 0;
				int i_51_ = 0;
				int i_52_ = 0;
				Class151 class151 = null;
				Class151 class151_53_ = null;
				Class151 class151_54_ = null;
				Class151 class151_55_ = null;
				int i_56_ = 0;
				int i_57_ = 0;
				int i_58_ = 0;
				int i_59_ = 0;
				int i_60_ = 0;
				int i_61_ = 0;
				int i_62_ = 0;
				int i_63_ = 0;
				Class151 class151_64_
				    = class575.method6876((Class587
							   .aClass173_7714),
							  1436947504);
				if (null != class151_64_) {
				    i_45_ = class151_64_.method1766();
				    class151_64_
					.method1765(client.anIntArray11193);
				    i_49_ = client.anIntArray11193[0];
				}
				Class151 class151_65_
				    = class575.method6881((Class587
							   .aClass173_7714),
							  (short) 15429);
				if (class151_65_ != null) {
				    i_46_ = class151_65_.method1766();
				    class151_65_
					.method1765(client.anIntArray11193);
				    i_50_ = client.anIntArray11193[0];
				}
				Class151 class151_66_
				    = class575.method6877((Class587
							   .aClass173_7714),
							  -366451959);
				if (null != class151_66_) {
				    i_47_ = class151_66_.method1766();
				    class151_66_
					.method1765(client.anIntArray11193);
				    i_51_ = client.anIntArray11193[0];
				}
				Class151 class151_67_
				    = class575.method6879((Class587
							   .aClass173_7714),
							  -279532437);
				if (class151_67_ != null) {
				    i_48_ = class151_67_.method1766();
				    class151_67_
					.method1765(client.anIntArray11193);
				    i_52_ = client.anIntArray11193[0];
				}
				if (class575_40_ != null) {
				    class151 = (class575_40_.method6876
						(Class587.aClass173_7714,
						 1459693126));
				    if (null != class151) {
					i_56_ = class151.method1766();
					class151.method1765(client
							    .anIntArray11193);
					i_60_ = client.anIntArray11193[0];
				    }
				    class151_53_ = (class575_40_.method6881
						    (Class587.aClass173_7714,
						     (short) -14799));
				    if (class151_53_ != null) {
					i_57_ = class151_53_.method1766();
					class151_53_.method1765
					    (client.anIntArray11193);
					i_61_ = client.anIntArray11193[0];
				    }
				    class151_54_ = (class575_40_.method6877
						    (Class587.aClass173_7714,
						     368693451));
				    if (null != class151_54_) {
					i_58_ = class151_54_.method1766();
					class151_54_.method1765
					    (client.anIntArray11193);
					i_62_ = client.anIntArray11193[0];
				    }
				    class151_55_ = (class575_40_.method6879
						    (Class587.aClass173_7714,
						     -582325343));
				    if (null != class151_55_) {
					i_59_ = class151_55_.method1766();
					class151_55_.method1765
					    (client.anIntArray11193);
					i_63_ = client.anIntArray11193[0];
				    }
				}
				Class172 class172
				    = Class378_Sub1_Sub1.aClass172_11264;
				Class172 class172_68_
				    = Class378_Sub1_Sub1.aClass172_11264;
				Class1 class1 = Exception_Sub3.aClass1_11221;
				Class1 class1_69_
				    = Exception_Sub3.aClass1_11221;
				int i_70_ = class575.anInt7578 * -683067711;
				if (i_70_ >= 0) {
				    Class172 class172_71_
					= ((Class172)
					   (Class625.aClass414_8129.method4936
					    (client.anInterface50_10917, i_70_,
					     true, class575.aBool7575,
					     (byte) -55)));
				    Class1 class1_72_
					= (Class625.aClass414_8129.method4937
					   (client.anInterface50_10917, i_70_,
					    1197231304));
				    if (class172_71_ != null
					&& class1_72_ != null) {
					class172 = class172_71_;
					class1 = class1_72_;
				    }
				}
				if (class575_40_ != null) {
				    i_70_
					= -683067711 * class575_40_.anInt7578;
				    if (i_70_ >= 0) {
					Class172 class172_73_
					    = ((Class172)
					       (Class625.aClass414_8129
						    .method4936
						(client.anInterface50_10917,
						 i_70_, true,
						 class575_40_.aBool7575,
						 (byte) -119)));
					Class1 class1_74_
					    = (Class625.aClass414_8129
						   .method4937
					       (client.anInterface50_10917,
						i_70_, -172909875));
					if (class172_73_ != null
					    && null != class1_74_) {
					    class172_68_ = class172_73_;
					    class1_69_ = class1_74_;
					}
				    }
				}
				Object object_75_ = null;
				String string = null;
				boolean bool_76_ = false;
				int i_77_ = 0;
				String string_78_
				    = (class575.method6875
				       ((class645_sub1_sub5_sub1
					 .anIntArray11775[i_35_]),
					-1093012376));
				int i_79_
				    = class1.method490(string_78_, 941026227);
				if (null != class575_40_) {
				    string = (class575_40_.method6875
					      ((class645_sub1_sub5_sub1
						.anIntArray11778[i_35_]),
					       -1665764188));
				    i_77_ = class1_69_.method490(string,
								 941026227);
				}
				int i_80_ = 0;
				int i_81_ = 0;
				if (i_46_ > 0)
				    i_80_ = 1 + i_79_ / i_46_;
				if (class575_40_ != null && i_57_ > 0)
				    i_81_ = i_77_ / i_57_ + 1;
				int i_82_ = 0;
				int i_83_ = i_82_;
				if (i_45_ > 0)
				    i_82_ += i_45_;
				i_82_ += 2;
				int i_84_ = i_82_;
				if (i_47_ > 0)
				    i_82_ += i_47_;
				int i_85_ = i_82_;
				int i_86_ = i_82_;
				if (i_46_ > 0) {
				    int i_87_ = i_46_ * i_80_;
				    i_82_ += i_87_;
				    i_86_ += (i_87_ - i_79_) / 2;
				} else
				    i_82_ += i_79_;
				int i_88_ = i_82_;
				if (i_48_ > 0)
				    i_82_ += i_48_;
				int i_89_ = 0;
				int i_90_ = 0;
				int i_91_ = 0;
				int i_92_ = 0;
				int i_93_ = 0;
				if (null != class575_40_) {
				    i_82_ += 2;
				    i_89_ = i_82_;
				    if (i_56_ > 0)
					i_82_ += i_56_;
				    i_82_ += 2;
				    i_90_ = i_82_;
				    if (i_58_ > 0)
					i_82_ += i_58_;
				    i_91_ = i_82_;
				    i_93_ = i_82_;
				    if (i_57_ > 0) {
					int i_94_ = i_81_ * i_57_;
					i_82_ += i_94_;
					i_93_ += (i_94_ - i_77_) / 2;
				    } else
					i_82_ += i_77_;
				    i_92_ = i_82_;
				    if (i_59_ > 0)
					i_82_ += i_59_;
				}
				int i_95_ = ((class645_sub1_sub5_sub1
					      .anIntArray11776[i_35_])
					     - client.anInt11127);
				int i_96_ = (-1851030351 * class575.anInt7582
					     - (class575.anInt7582
						* -1851030351 * i_95_
						/ (-601153071
						   * class575.anInt7580)));
				int i_97_
				    = (-(-1799294155 * class575.anInt7586)
				       + (i_95_
					  * (-1799294155 * class575.anInt7586)
					  / (class575.anInt7580
					     * -601153071)));
				int i_98_
				    = (int) (client.aFloatArray10888[0]
					     + (float) i - (float) (i_82_ >> 1)
					     + (float) i_96_);
				int i_99_
				    = (int) ((float) i_97_
					     + (client.aFloatArray10888[1]
						+ (float) i_1_ - 12.0F));
				int i_100_ = (class575.anInt7590 * 1178721567
					      + (i_99_ + 15));
				int i_101_ = 0;
				if (null != class575_40_)
				    i_101_
					= (class575_40_.anInt7590 * 1178721567
					   + (15 + i_99_));
				int i_102_ = 255;
				if (1591801011 * class575.anInt7596 >= 0)
				    i_102_
					= ((i_95_ << 8)
					   / (class575.anInt7580 * -601153071
					      - (class575.anInt7596
						 * 1591801011)));
				if (i_102_ >= 0 && i_102_ < 255) {
				    int i_103_ = i_102_ << 24;
				    int i_104_ = i_103_ | 0xffffff;
				    if (class151_64_ != null)
					class151_64_.method1780((i_83_ + i_98_
								 - i_49_),
								i_99_, 0,
								i_104_, 1);
				    if (null != class151_66_)
					class151_66_.method1780
					    ((-1199790607 * class575.anInt7585
					      + (i_84_ + i_98_ - i_51_)),
					     i_99_ + (1995443171
						      * class575.anInt7577),
					     0, i_104_, 1);
				    if (class151_65_ != null) {
					for (int i_105_ = 0; i_105_ < i_80_;
					     i_105_++)
					    class151_65_.method1780
						(((class575.anInt7585
						   * -1199790607)
						  + (i_98_ + i_85_ - i_50_
						     + i_46_ * i_105_)),
						 ((1995443171
						   * class575.anInt7577)
						  + i_99_),
						 0, i_104_, 1);
				    }
				    if (null != class151_67_)
					class151_67_.method1780
					    ((i_98_ + i_88_ - i_52_
					      + (class575.anInt7585
						 * -1199790607)),
					     i_99_ + (class575.anInt7577
						      * 1995443171),
					     0, i_104_, 1);
				    class172.method2120(string_78_,
							i_86_ + i_98_, i_100_,
							((1150272955
							  * class575.anInt7591)
							 | i_103_),
							0, (byte) 115);
				    if (class575_40_ != null) {
					if (class151 != null)
					    class151.method1780((i_89_ + i_98_
								 - i_60_),
								i_99_, 0,
								i_104_, 1);
					if (class151_54_ != null)
					    class151_54_.method1780
						((i_98_ + i_90_ - i_62_
						  + (class575_40_.anInt7585
						     * -1199790607)),
						 (i_99_
						  + 1995443171 * (class575_40_
								  .anInt7577)),
						 0, i_104_, 1);
					if (class151_53_ != null) {
					    for (int i_106_ = 0;
						 i_106_ < i_81_; i_106_++)
						class151_53_.method1780
						    ((i_57_ * i_106_
						      + (i_91_ + i_98_ - i_61_)
						      + (class575_40_.anInt7585
							 * -1199790607)),
						     (1995443171
						      * (class575_40_
							 .anInt7577)) + i_99_,
						     0, i_104_, 1);
					}
					if (class151_55_ != null)
					    class151_55_.method1780
						((i_98_ + i_92_ - i_63_
						  + (-1199790607
						     * (class575_40_
							.anInt7585))),
						 (class575_40_.anInt7577
						  * 1995443171) + i_99_,
						 0, i_104_, 1);
					class172_68_.method2120
					    (string, i_93_ + i_98_, i_101_,
					     ((1150272955
					       * class575_40_.anInt7591)
					      | i_103_),
					     0, (byte) 53);
				    }
				} else {
				    if (null != class151_64_)
					class151_64_.method1773((i_83_ + i_98_
								 - i_49_),
								i_99_);
				    if (null != class151_66_)
					class151_66_.method1773
					    ((i_84_ + i_98_ - i_51_
					      + (-1199790607
						 * class575.anInt7585)),
					     (1995443171 * class575.anInt7577
					      + i_99_));
				    if (class151_65_ != null) {
					for (int i_107_ = 0; i_107_ < i_80_;
					     i_107_++)
					    class151_65_.method1773
						((i_46_ * i_107_
						  + (i_98_ + i_85_ - i_50_)
						  + (class575.anInt7585
						     * -1199790607)),
						 ((1995443171
						   * class575.anInt7577)
						  + i_99_));
				    }
				    if (null != class151_67_)
					class151_67_.method1773
					    ((class575.anInt7585 * -1199790607
					      + (i_88_ + i_98_ - i_52_)),
					     i_99_ + (class575.anInt7577
						      * 1995443171));
				    class172.method2120(string_78_,
							i_86_ + i_98_, i_100_,
							((class575.anInt7591
							  * 1150272955)
							 | ~0xffffff),
							0, (byte) 86);
				    if (null != class575_40_) {
					if (class151 != null)
					    class151.method1773((i_98_ + i_89_
								 - i_60_),
								i_99_);
					if (class151_54_ != null)
					    class151_54_.method1773
						((i_90_ + i_98_ - i_62_
						  + (class575_40_.anInt7585
						     * -1199790607)),
						 i_99_ + (1995443171
							  * (class575_40_
							     .anInt7577)));
					if (null != class151_53_) {
					    for (int i_108_ = 0;
						 i_108_ < i_81_; i_108_++)
						class151_53_.method1773
						    (((-1199790607
						       * (class575_40_
							  .anInt7585))
						      + (i_98_ + i_91_ - i_61_
							 + i_108_ * i_57_)),
						     (i_99_
						      + (class575_40_.anInt7577
							 * 1995443171)));
					}
					if (class151_55_ != null)
					    class151_55_.method1773
						(((class575_40_.anInt7585
						   * -1199790607)
						  + (i_98_ + i_92_ - i_63_)),
						 (class575_40_.anInt7577
						  * 1995443171) + i_99_);
					class172_68_.method2120
					    (string, i_93_ + i_98_, i_101_,
					     ((1150272955
					       * class575_40_.anInt7591)
					      | ~0xffffff),
					     0, (byte) 75);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i_109_ = 0; i_109_ < 1154356499 * client.anInt10999;
	     i_109_++) {
	    int i_110_ = client.anIntArray10997[i_109_];
	    Entity class645_sub1_sub5_sub1;
	    if (i_110_ < 2048)
		class645_sub1_sub5_sub1
		    = client.localPlayers[i_110_];
	    else
		class645_sub1_sub5_sub1
		    = ((Entity)
		       (((Class528_Sub31)
			 client.aClass692_11110.method8137((long) (i_110_
								   - 2048)))
			.anObject10468));
	    int i_111_ = client.anIntArray10950[i_109_];
	    Entity class645_sub1_sub5_sub1_112_;
	    if (i_111_ < 2048)
		class645_sub1_sub5_sub1_112_
		    = client.localPlayers[i_111_];
	    else
		class645_sub1_sub5_sub1_112_
		    = ((Entity)
		       (((Class528_Sub31)
			 client.aClass692_11110.method8137((long) (i_111_
								   - 2048)))
			.anObject10468));
	    Class453.method5458(class645_sub1_sub5_sub1,
				class645_sub1_sub5_sub1_112_,
				(class645_sub1_sub5_sub1.anInt11817
				 -= 1789104677) * -1300481619,
				i, i_1_, i_2_, i_3_, i_4_, i_5_, (byte) 0);
	}
	int i_113_ = 2 + (Class392.aClass1_4120.anInt13 * -46594681
			  + -55898191 * Class392.aClass1_4120.anInt12);
	for (int i_114_ = 0; i_114_ < client.anInt11121 * -2016496297;
	     i_114_++) {
	    int i_115_ = client.anIntArray11003[i_114_];
	    int i_116_ = client.anIntArray11081[i_114_];
	    int i_117_ = client.anIntArray11125[i_114_];
	    boolean bool = true;
	    while (bool) {
		bool = false;
		for (int i_118_ = 0; i_118_ < i_114_; i_118_++) {
		    if (i_116_ + 2 > client.anIntArray11081[i_118_] - i_113_
			&& i_116_ - i_113_ < client.anIntArray11081[i_118_] + 2
			&& i_115_ - i_117_ < (client.anIntArray11003[i_118_]
					      + client.anIntArray11125[i_118_])
			&& i_115_ + i_117_ > (client.anIntArray11003[i_118_]
					      - client.anIntArray11125[i_118_])
			&& client.anIntArray11081[i_118_] - i_113_ < i_116_) {
			i_116_ = client.anIntArray11081[i_118_] - i_113_;
			bool = true;
		    }
		}
	    }
	    client.anIntArray11081[i_114_] = i_116_;
	    String string
		= client.aClass492Array11126[i_114_].method5934((byte) 6);
	    if (Class96.aClass259_1226.method3548(1340337943))
		string = Class96.aClass259_1226.method3547(string, 475385201);
	    if (0 == 1777142663 * client.anInt11058) {
		int i_119_ = 16776960;
		int i_120_
		    = client.aClass492Array11126[i_114_].method5935((byte) 18);
		if (i_120_ < 6)
		    i_119_ = client.anIntArray11072[i_120_];
		if (i_120_ == 6)
		    i_119_ = (client.anInt10968 * -2032978979 % 20 < 10
			      ? 16711680 : 16776960);
		if (i_120_ == 7)
		    i_119_ = (-2032978979 * client.anInt10968 % 20 < 10 ? 255
			      : 65535);
		if (i_120_ == 8)
		    i_119_ = (-2032978979 * client.anInt10968 % 20 < 10 ? 45056
			      : 8454016);
		if (9 == i_120_) {
		    int i_121_ = 150 - (client.aClass492Array11126[i_114_]
					    .method5946(-618378560)
					* 150
					/ client.aClass492Array11126
					      [i_114_].method5937((byte) 13));
		    if (i_121_ < 50)
			i_119_ = 1280 * i_121_ + 16711680;
		    else if (i_121_ < 100)
			i_119_ = 16776960 - 327680 * (i_121_ - 50);
		    else if (i_121_ < 150)
			i_119_ = 65280 + (i_121_ - 100) * 5;
		}
		if (10 == i_120_) {
		    int i_122_ = 150 - (client.aClass492Array11126[i_114_]
					    .method5946(-311752764)
					* 150
					/ client.aClass492Array11126
					      [i_114_].method5937((byte) 13));
		    if (i_122_ < 50)
			i_119_ = i_122_ * 5 + 16711680;
		    else if (i_122_ < 100)
			i_119_ = 16711935 - 327680 * (i_122_ - 50);
		    else if (i_122_ < 150)
			i_119_ = ((i_122_ - 100) * 327680 + 255
				  - (i_122_ - 100) * 5);
		}
		if (i_120_ == 11) {
		    int i_123_ = 150 - (client.aClass492Array11126[i_114_]
					    .method5946(-739115745)
					* 150
					/ client.aClass492Array11126
					      [i_114_].method5937((byte) 13));
		    if (i_123_ < 50)
			i_119_ = 16777215 - 327685 * i_123_;
		    else if (i_123_ < 100)
			i_119_ = 327685 * (i_123_ - 50) + 65280;
		    else if (i_123_ < 150)
			i_119_ = 16777215 - (i_123_ - 100) * 327680;
		}
		int i_124_ = i_119_ | ~0xffffff;
		int i_125_ = client.aClass492Array11126[i_114_]
				 .method5941(-671121988);
		if (0 == i_125_)
		    Class176.aClass172_2027.method2130(string, i_115_ + i,
						       i_1_ + i_116_, i_124_,
						       -16777216, (byte) 0);
		if (1 == i_125_)
		    Class176.aClass172_2027.method2123(string, i_115_ + i,
						       i_1_ + i_116_, i_124_,
						       -16777216,
						       (-2032978979
							* client.anInt10968),
						       (byte) 1);
		if (i_125_ == 2)
		    Class176.aClass172_2027.method2144(string, i_115_ + i,
						       i_1_ + i_116_, i_124_,
						       -16777216,
						       (-2032978979
							* client.anInt10968),
						       1362588336);
		if (3 == i_125_) {
		    int i_126_ = 150 - (client.aClass492Array11126[i_114_]
					    .method5946(-453313104)
					* 150
					/ client.aClass492Array11126
					      [i_114_].method5937((byte) 13));
		    Class176.aClass172_2027.method2141(string, i + i_115_,
						       i_1_ + i_116_, i_124_,
						       -16777216,
						       (client.anInt10968
							* -2032978979),
						       i_126_, (byte) -112);
		}
		if (4 == i_125_) {
		    int i_127_ = 150 - (client.aClass492Array11126[i_114_]
					    .method5946(1279794158)
					* 150
					/ client.aClass492Array11126
					      [i_114_].method5937((byte) 13));
		    int i_128_
			= i_127_ * (Class392.aClass1_4120.method490(string,
								    941026227)
				    + 100) / 150;
		    Class587.aClass173_7714.method2205(i + i_115_ - 50, i_1_,
						       50 + (i + i_115_),
						       i_3_ + i_1_);
		    Class176.aClass172_2027.method2120(string,
						       (50 + (i_115_ + i)
							- i_128_),
						       i_1_ + i_116_, i_124_,
						       -16777216, (byte) 10);
		    Class587.aClass173_7714.method2204(i, i_1_, i_2_ + i,
						       i_3_ + i_1_);
		}
		if (i_125_ == 5) {
		    int i_129_ = 150 - (client.aClass492Array11126[i_114_]
					    .method5946(-108581730)
					* 150
					/ client.aClass492Array11126
					      [i_114_].method5937((byte) 13));
		    int i_130_ = 0;
		    if (i_129_ < 25)
			i_130_ = i_129_ - 25;
		    else if (i_129_ > 125)
			i_130_ = i_129_ - 125;
		    int i_131_ = (-46594681 * Class392.aClass1_4120.anInt13
				  + Class392.aClass1_4120.anInt12 * -55898191);
		    Class587.aClass173_7714.method2205(i,
						       (i_1_ + i_116_ - i_131_
							- 1),
						       i_2_ + i,
						       5 + (i_116_ + i_1_));
		    Class176.aClass172_2027.method2130(string, i + i_115_,
						       i_116_ + i_1_ + i_130_,
						       i_124_, -16777216,
						       (byte) 0);
		    Class587.aClass173_7714.method2204(i, i_1_, i_2_ + i,
						       i_3_ + i_1_);
		}
	    } else
		Class176.aClass172_2027.method2130(string, i_115_ + i,
						   i_116_ + i_1_, -256,
						   -16777216, (byte) 0);
	}
    }
}
