/* Class650 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.List;

public final class Class650
{
    Class650() throws Throwable {
	throw new Error();
    }
    
    public static String method7735(byte[] is, int i, int i_0_) {
	char[] cs = new char[i_0_];
	int i_1_ = 0;
	int i_2_ = i;
	int i_3_ = i_0_ + i;
	while (i_2_ < i_3_) {
	    int i_4_ = is[i_2_++] & 0xff;
	    int i_5_;
	    if (i_4_ < 128) {
		if (i_4_ == 0)
		    i_5_ = 65533;
		else
		    i_5_ = i_4_;
	    } else if (i_4_ < 192)
		i_5_ = 65533;
	    else if (i_4_ < 224) {
		if (i_2_ < i_3_ && (is[i_2_] & 0xc0) == 128) {
		    i_5_ = (i_4_ & 0x1f) << 6 | is[i_2_++] & 0x3f;
		    if (i_5_ < 128)
			i_5_ = 65533;
		} else
		    i_5_ = 65533;
	    } else if (i_4_ < 240) {
		if (i_2_ + 1 < i_3_ && (is[i_2_] & 0xc0) == 128
		    && 128 == (is[1 + i_2_] & 0xc0)) {
		    i_5_ = ((i_4_ & 0xf) << 12 | (is[i_2_++] & 0x3f) << 6
			    | is[i_2_++] & 0x3f);
		    if (i_5_ < 2048)
			i_5_ = 65533;
		} else
		    i_5_ = 65533;
	    } else if (i_4_ < 248) {
		if (2 + i_2_ < i_3_ && 128 == (is[i_2_] & 0xc0)
		    && (is[1 + i_2_] & 0xc0) == 128
		    && 128 == (is[i_2_ + 2] & 0xc0)) {
		    i_5_ = ((i_4_ & 0x7) << 18 | (is[i_2_++] & 0x3f) << 12
			    | (is[i_2_++] & 0x3f) << 6 | is[i_2_++] & 0x3f);
		    if (i_5_ < 65536 || i_5_ > 1114111)
			i_5_ = 65533;
		    else
			i_5_ = 65533;
		} else
		    i_5_ = 65533;
	    } else
		i_5_ = 65533;
	    cs[i_1_++] = (char) i_5_;
	}
	return new String(cs, 0, i_1_);
    }
    
    public static String method7736(byte[] is, int i, int i_6_) {
	char[] cs = new char[i_6_];
	int i_7_ = 0;
	int i_8_ = i;
	int i_9_ = i_6_ + i;
	while (i_8_ < i_9_) {
	    int i_10_ = is[i_8_++] & 0xff;
	    int i_11_;
	    if (i_10_ < 128) {
		if (i_10_ == 0)
		    i_11_ = 65533;
		else
		    i_11_ = i_10_;
	    } else if (i_10_ < 192)
		i_11_ = 65533;
	    else if (i_10_ < 224) {
		if (i_8_ < i_9_ && (is[i_8_] & 0xc0) == 128) {
		    i_11_ = (i_10_ & 0x1f) << 6 | is[i_8_++] & 0x3f;
		    if (i_11_ < 128)
			i_11_ = 65533;
		} else
		    i_11_ = 65533;
	    } else if (i_10_ < 240) {
		if (i_8_ + 1 < i_9_ && (is[i_8_] & 0xc0) == 128
		    && 128 == (is[1 + i_8_] & 0xc0)) {
		    i_11_ = ((i_10_ & 0xf) << 12 | (is[i_8_++] & 0x3f) << 6
			     | is[i_8_++] & 0x3f);
		    if (i_11_ < 2048)
			i_11_ = 65533;
		} else
		    i_11_ = 65533;
	    } else if (i_10_ < 248) {
		if (2 + i_8_ < i_9_ && 128 == (is[i_8_] & 0xc0)
		    && (is[1 + i_8_] & 0xc0) == 128
		    && 128 == (is[i_8_ + 2] & 0xc0)) {
		    i_11_ = ((i_10_ & 0x7) << 18 | (is[i_8_++] & 0x3f) << 12
			     | (is[i_8_++] & 0x3f) << 6 | is[i_8_++] & 0x3f);
		    if (i_11_ < 65536 || i_11_ > 1114111)
			i_11_ = 65533;
		    else
			i_11_ = 65533;
		} else
		    i_11_ = 65533;
	    } else
		i_11_ = 65533;
	    cs[i_7_++] = (char) i_11_;
	}
	return new String(cs, 0, i_7_);
    }
    
    public static void method7737(long[] ls, int[] is, int i) {
	Class684_Sub4.method10131(ls, is, 0, ls.length - 1, 1313165264);
    }
    
    public static void method7738(long[] ls, Object[] objects, short i) {
	Class691_Sub16.method9954(ls, objects, 0, ls.length - 1, 267982170);
    }
    
    static final void method7739(Class648 class648, byte i) {
	int i_12_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (!Class587.aClass173_7714.method2166())
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 3;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class514.aClass528_Sub38_6967.aClass691_Sub27_10567
		      .method8126(i_12_, -1955030095);
    }
    
    static void method7740(Class173 class173, int i, int i_13_, byte i_14_) {
	if (i >= 0 && i_13_ >= 0 && null != Class28.aClass418_287) {
	    Class578 class578 = client.gameScene.method5966(1273279609);
	    Class418 class418 = class173.method2241();
	    Class95.method1257(class173, (byte) 0);
	    class418.method5035(Class28.aClass433_289);
	    class418.method4974(Class28.aClass418_287);
	    class418.method5024();
	    int i_15_ = i - Class28.anInt286 * 1299216485;
	    int i_16_ = i_13_ - 1249642535 * Class28.anInt284;
	    if (client.gameScene.method5973((byte) 55) != null) {
		if (!client.aBool10899
		    || (Class296.anInt3249 * -856748185 & 0x40) != 0) {
		    int i_17_ = -1;
		    int i_18_ = -1;
		    float f = ((float) i_15_ * 2.0F / (float) (Class28.anInt285
							       * 1034376853)
			       - 1.0F);
		    float f_19_
			= (2.0F * (float) i_16_ / (float) (1788671925
							   * Class28.anInt272)
			   - 1.0F);
		    class418.method5030(f, f_19_, -1.0F,
					Class28.aFloatArray296);
		    float f_20_ = (Class28.aFloatArray296[0]
				   / Class28.aFloatArray296[3]);
		    float f_21_ = (Class28.aFloatArray296[1]
				   / Class28.aFloatArray296[3]);
		    float f_22_ = (Class28.aFloatArray296[2]
				   / Class28.aFloatArray296[3]);
		    class418.method5030(f, f_19_, 1.0F,
					Class28.aFloatArray296);
		    float f_23_ = (Class28.aFloatArray296[0]
				   / Class28.aFloatArray296[3]);
		    float f_24_ = (Class28.aFloatArray296[1]
				   / Class28.aFloatArray296[3]);
		    float f_25_ = (Class28.aFloatArray296[2]
				   / Class28.aFloatArray296[3]);
		    float f_26_
			= Class40.method817(f_20_, f_21_, f_22_, f_23_, f_24_,
					    f_25_, 4, (byte) -68);
		    if (f_26_ > 0.0F) {
			float f_27_ = f_23_ - f_20_;
			float f_28_ = f_25_ - f_22_;
			int i_29_ = (int) (f_20_ + f_26_ * f_27_);
			int i_30_ = (int) (f_26_ * f_28_ + f_22_);
			i_17_
			    = i_29_ + (Class108
					   .myPlayer
					   .method10671((byte) -19) - 1
				       << 8) >> 9;
			i_18_
			    = i_30_ + (Class108
					   .myPlayer
					   .method10671((byte) -71) - 1
				       << 8) >> 9;
			int i_31_
			    = (Class108.myPlayer
			       .aByte10675);
			if (i_31_ < 3 && ((client.gameScene.method6006
					   ((byte) 0).aByteArrayArrayArray5312
					   [1][i_29_ >> 9][i_30_ >> 9])
					  & 0x2) != 0)
			    i_31_++;
		    }
		    if (i_17_ != -1 && -1 != i_18_) {
			if (client.aBool10899
			    && 0 != (-856748185 * Class296.anInt3249 & 0x40)) {
			    Class229 class229
				= Class230.method3236((Class487.anInt5494
						       * -771216895),
						      (-1114833639
						       * client.anInt11052),
						      -934116544);
			    if (null != class229)
				Class280.method3738
				    (client.aString10902,
				     new StringBuilder().append(" ").append
					 (Class49.aString553).append
					 (" ").toString(),
				     Class528_Sub6.anInt10255 * -555764949, 59,
				     -1, 0L, i_17_, i_18_, true, false,
				     (long) (i_17_ << 32 | i_18_), true,
				     -507914382);
			    else
				Class7.method565(-1187426900);
			} else {
			    if (Class213.aBool2255)
				Class280.method3738((Class39.aClass39_475
							 .method807
						     ((Class378_Sub2
						       .aClass668_10123),
						      (byte) 102)),
						    "", -1, 60, -1, 0L, i_17_,
						    i_18_, true, false,
						    (long) (i_17_ << 32
							    | i_18_),
						    true, -2131248043);
			    Class280.method3738(Class137.aString1631, "",
						177967549 * client.anInt10963,
						23, -1, 0L, i_17_, i_18_, true,
						false,
						(long) (i_17_ << 32 | i_18_),
						true, 1900806751);
			}
		    }
		}
		Class555 class555 = (client.gameScene.method5973
				     ((byte) 33).aClass555_7207);
		int i_32_ = i;
		int i_33_ = i_13_;
		List list = class555.aList7448;
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
		    Class549 class549 = (Class549) iterator.next();
		    if ((client.aBool10894
			 || (class549.aClass645_Sub1_7417.aByte10675
			     == (Class108.myPlayer
				 .aByte10675)))
			&& class549.method6682(class173, i_32_, i_33_,
					       831566709)) {
			boolean bool = false;
			boolean bool_34_ = false;
			int i_35_;
			int i_36_;
			if (class549.aClass645_Sub1_7417
			    instanceof Class645_Sub1_Sub5) {
			    i_35_ = ((Class645_Sub1_Sub5)
				     class549.aClass645_Sub1_7417).aShort11747;
			    i_36_ = ((Class645_Sub1_Sub5)
				     class549.aClass645_Sub1_7417).aShort11745;
			} else {
			    Class422 class422
				= (class549.aClass645_Sub1_7417.method7693()
				   .aClass422_4868);
			    i_35_ = (int) class422.aFloat4780 >> 9;
			    i_36_ = (int) class422.aFloat4777 >> 9;
			}
			if (class549.aClass645_Sub1_7417
			    instanceof Player) {
			    Player class645_sub1_sub5_sub1_sub2
				= ((Player)
				   class549.aClass645_Sub1_7417);
			    int i_37_ = class645_sub1_sub5_sub1_sub2
					    .method10671((byte) -64);
			    Class422 class422
				= (class645_sub1_sub5_sub1_sub2.method7693()
				   .aClass422_4868);
			    if (((i_37_ & 0x1) == 0
				 && 0 == ((int) class422.aFloat4780 & 0x1ff)
				 && 0 == ((int) class422.aFloat4777 & 0x1ff))
				|| ((i_37_ & 0x1) == 1
				    && 256 == ((int) class422.aFloat4780
					       & 0x1ff)
				    && (((int) class422.aFloat4777 & 0x1ff)
					== 256))) {
				int i_38_
				    = ((int) class422.aFloat4780
				       - (class645_sub1_sub5_sub1_sub2
					      .method10671((byte) -54) - 1
					  << 8));
				int i_39_
				    = ((int) class422.aFloat4777
				       - (class645_sub1_sub5_sub1_sub2
					      .method10671((byte) -89) - 1
					  << 8));
				for (int i_40_ = 0;
				     i_40_ < client.anInt10922 * -2065344127;
				     i_40_++) {
				    Class528_Sub31 class528_sub31
					= ((Class528_Sub31)
					   (client.aClass692_11110.method8137
					    ((long) client.anIntArray10923
						    [i_40_])));
				    if (null != class528_sub31) {
					NPC class645_sub1_sub5_sub1_sub1
					    = ((NPC)
					       class528_sub31.anObject10468);
					if (((class645_sub1_sub5_sub1_sub1
					      .anInt11786) * 2038055139
					     != client.anInt11127)
					    && (class645_sub1_sub5_sub1_sub1
						.aBool11763)) {
					    Class422 class422_41_
						= (class645_sub1_sub5_sub1_sub1
						       .method7693
						   ().aClass422_4868);
					    int i_42_
						= ((int) (class422_41_
							  .aFloat4780)
						   - ((-2134279851
						       * (class645_sub1_sub5_sub1_sub1
							  .aClass299_12043
							  .anInt3321)) - 1
						      << 8));
					    int i_43_
						= ((int) (class422_41_
							  .aFloat4777)
						   - ((-2134279851
						       * (class645_sub1_sub5_sub1_sub1
							  .aClass299_12043
							  .anInt3321)) - 1
						      << 8));
					    if (i_42_ >= i_38_
						&& ((-2134279851
						     * (class645_sub1_sub5_sub1_sub1
							.aClass299_12043
							.anInt3321))
						    <= ((class645_sub1_sub5_sub1_sub2
							     .method10671
							 ((byte) -56))
							- (i_42_ - i_38_
							   >> 9)))
						&& i_43_ >= i_39_
						&& ((class645_sub1_sub5_sub1_sub1
						     .aClass299_12043
						     .anInt3321) * -2134279851
						    <= ((class645_sub1_sub5_sub1_sub2
							     .method10671
							 ((byte) -52))
							- (i_43_ - i_39_
							   >> 9)))) {
						Class224.method3170
						    (class645_sub1_sub5_sub1_sub1,
						     ((class549
						       .aClass645_Sub1_7417
						       .aByte10675)
						      != (Class108
							  .myPlayer
							  .aByte10675)),
						     606630488);
						class645_sub1_sub5_sub1_sub1
						    .anInt11786
						    = (-709294901
						       * client.anInt11127);
					    }
					}
				    }
				}
				int i_44_ = 1087758653 * GPI.localPlayerCount;
				int[] is = GPI.localPlayerIndicies;
				for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
				    Player class645_sub1_sub5_sub1_sub2_46_
					= (client
					   .localPlayers
					   [is[i_45_]]);
				    if ((class645_sub1_sub5_sub1_sub2_46_
					 != null)
					&& (client.anInt11127
					    != (class645_sub1_sub5_sub1_sub2_46_
						.anInt11786) * 2038055139)
					&& (class645_sub1_sub5_sub1_sub2
					    != class645_sub1_sub5_sub1_sub2_46_)
					&& (class645_sub1_sub5_sub1_sub2_46_
					    .aBool11763)) {
					Class422 class422_47_
					    = (class645_sub1_sub5_sub1_sub2_46_
						   .method7693
					       ().aClass422_4868);
					int i_48_
					    = ((int) class422_47_.aFloat4780
					       - ((class645_sub1_sub5_sub1_sub2_46_
						       .method10671((byte) -85)
						   - 1)
						  << 8));
					int i_49_
					    = ((int) class422_47_.aFloat4777
					       - ((class645_sub1_sub5_sub1_sub2_46_
						       .method10671
						   ((byte) -119)) - 1
						  << 8));
					if (i_48_ >= i_38_
					    && (class645_sub1_sub5_sub1_sub2_46_
						    .method10671((byte) -107)
						<= (class645_sub1_sub5_sub1_sub2
							.method10671((byte) -99)
						    - (i_48_ - i_38_ >> 9)))
					    && i_49_ >= i_39_
					    && (class645_sub1_sub5_sub1_sub2_46_
						    .method10671((byte) -111)
						<= ((class645_sub1_sub5_sub1_sub2
							 .method10671
						     ((byte) -101))
						    - (i_49_ - i_39_ >> 9)))) {
					    Class164.method2087
						(class645_sub1_sub5_sub1_sub2_46_,
						 ((Class108
						   .myPlayer
						   .aByte10675)
						  != (class549
						      .aClass645_Sub1_7417
						      .aByte10675)),
						 1126209556);
					    class645_sub1_sub5_sub1_sub2_46_
						.anInt11786
						= (-709294901
						   * client.anInt11127);
					}
				    }
				}
			    }
			    if (client.anInt11127
				== (class645_sub1_sub5_sub1_sub2.anInt11786
				    * 2038055139))
				continue;
			    Class164.method2087
				(class645_sub1_sub5_sub1_sub2,
				 (class549.aClass645_Sub1_7417.aByte10675
				  != (Class108
				      .myPlayer
				      .aByte10675)),
				 551241205);
			    class645_sub1_sub5_sub1_sub2.anInt11786
				= -709294901 * client.anInt11127;
			}
			if (class549.aClass645_Sub1_7417
			    instanceof NPC) {
			    NPC class645_sub1_sub5_sub1_sub1
				= ((NPC)
				   class549.aClass645_Sub1_7417);
			    if (null != (class645_sub1_sub5_sub1_sub1
					 .aClass299_12043)) {
				Class422 class422
				    = (class645_sub1_sub5_sub1_sub1.method7693
				       ().aClass422_4868);
				if ((0 == (((class645_sub1_sub5_sub1_sub1
					     .aClass299_12043.anInt3321)
					    * -2134279851)
					   & 0x1)
				     && (((int) class422.aFloat4780 & 0x1ff)
					 == 0)
				     && 0 == ((int) class422.aFloat4777
					      & 0x1ff))
				    || (((-2134279851
					  * (class645_sub1_sub5_sub1_sub1
					     .aClass299_12043.anInt3321))
					 & 0x1) == 1
					&& 256 == ((int) class422.aFloat4780
						   & 0x1ff)
					&& 256 == ((int) class422.aFloat4777
						   & 0x1ff))) {
				    int i_50_
					= ((int) class422.aFloat4780
					   - (((-2134279851
						* (class645_sub1_sub5_sub1_sub1
						   .aClass299_12043.anInt3321))
					       - 1)
					      << 8));
				    int i_51_
					= ((int) class422.aFloat4777
					   - (((-2134279851
						* (class645_sub1_sub5_sub1_sub1
						   .aClass299_12043.anInt3321))
					       - 1)
					      << 8));
				    for (int i_52_ = 0;
					 (i_52_
					  < client.anInt10922 * -2065344127);
					 i_52_++) {
					Class528_Sub31 class528_sub31
					    = ((Class528_Sub31)
					       (client.aClass692_11110
						    .method8137
						((long) client.anIntArray10923
							[i_52_])));
					if (null != class528_sub31) {
					    NPC class645_sub1_sub5_sub1_sub1_53_
						= ((NPC)
						   (class528_sub31
						    .anObject10468));
					    if (((class645_sub1_sub5_sub1_sub1_53_
						  .anInt11786) * 2038055139
						 != client.anInt11127)
						&& (class645_sub1_sub5_sub1_sub1
						    != class645_sub1_sub5_sub1_sub1_53_)
						&& (class645_sub1_sub5_sub1_sub1_53_
						    .aBool11763)) {
						Class422 class422_54_
						    = (class645_sub1_sub5_sub1_sub1_53_
							   .method7693
						       ().aClass422_4868);
						int i_55_
						    = ((int) (class422_54_
							      .aFloat4780)
						       - (((class645_sub1_sub5_sub1_sub1_53_
							    .aClass299_12043
							    .anInt3321)
							   * -2134279851) - 1
							  << 8));
						int i_56_
						    = ((int) (class422_54_
							      .aFloat4777)
						       - ((-2134279851
							   * (class645_sub1_sub5_sub1_sub1_53_
							      .aClass299_12043
							      .anInt3321)) - 1
							  << 8));
						if (i_55_ >= i_50_
						    && (((class645_sub1_sub5_sub1_sub1_53_
							  .aClass299_12043
							  .anInt3321)
							 * -2134279851)
							<= ((-2134279851
							     * (class645_sub1_sub5_sub1_sub1
								.aClass299_12043
								.anInt3321))
							    - (i_55_ - i_50_
							       >> 9)))
						    && i_56_ >= i_51_
						    && (((class645_sub1_sub5_sub1_sub1_53_
							  .aClass299_12043
							  .anInt3321)
							 * -2134279851)
							<= (((class645_sub1_sub5_sub1_sub1
							      .aClass299_12043
							      .anInt3321)
							     * -2134279851)
							    - (i_56_ - i_51_
							       >> 9)))) {
						    Class224.method3170
							(class645_sub1_sub5_sub1_sub1_53_,
							 ((Class108
							   .myPlayer
							   .aByte10675)
							  != (class549
							      .aClass645_Sub1_7417
							      .aByte10675)),
							 606630488);
						    class645_sub1_sub5_sub1_sub1_53_
							.anInt11786
							= (-709294901
							   * (client
							      .anInt11127));
						}
					    }
					}
				    }
				    int i_57_ = GPI.localPlayerCount * 1087758653;
				    int[] is = GPI.localPlayerIndicies;
				    for (int i_58_ = 0; i_58_ < i_57_;
					 i_58_++) {
					Player class645_sub1_sub5_sub1_sub2
					    = (client
					       .localPlayers
					       [is[i_58_]]);
					if ((class645_sub1_sub5_sub1_sub2
					     != null)
					    && (client.anInt11127
						!= (class645_sub1_sub5_sub1_sub2
						    .anInt11786) * 2038055139)
					    && (class645_sub1_sub5_sub1_sub2
						.aBool11763)) {
					    Class422 class422_59_
						= (class645_sub1_sub5_sub1_sub2
						       .method7693
						   ().aClass422_4868);
					    int i_60_
						= ((int) (class422_59_
							  .aFloat4780)
						   - ((class645_sub1_sub5_sub1_sub2
							   .method10671
						       ((byte) -55)) - 1
						      << 8));
					    int i_61_
						= ((int) (class422_59_
							  .aFloat4777)
						   - ((class645_sub1_sub5_sub1_sub2
							   .method10671
						       ((byte) -64)) - 1
						      << 8));
					    if (i_60_ >= i_50_
						&& (class645_sub1_sub5_sub1_sub2
							.method10671((byte) -57)
						    <= (((class645_sub1_sub5_sub1_sub1
							  .aClass299_12043
							  .anInt3321)
							 * -2134279851)
							- (i_60_ - i_50_
							   >> 9)))
						&& i_61_ >= i_51_
						&& ((class645_sub1_sub5_sub1_sub2
							 .method10671
						     ((byte) -106))
						    <= ((-2134279851
							 * (class645_sub1_sub5_sub1_sub1
							    .aClass299_12043
							    .anInt3321))
							- (i_61_ - i_51_
							   >> 9)))) {
						Class164.method2087
						    (class645_sub1_sub5_sub1_sub2,
						     ((Class108
						       .myPlayer
						       .aByte10675)
						      != (class549
							  .aClass645_Sub1_7417
							  .aByte10675)),
						     872375871);
						class645_sub1_sub5_sub1_sub2
						    .anInt11786
						    = (client.anInt11127
						       * -709294901);
					    }
					}
				    }
				}
				if ((2038055139
				     * class645_sub1_sub5_sub1_sub1.anInt11786)
				    == client.anInt11127)
				    continue;
				Class224.method3170
				    (class645_sub1_sub5_sub1_sub1,
				     ((Class108
				       .myPlayer
				       .aByte10675)
				      != (class549.aClass645_Sub1_7417
					  .aByte10675)),
				     606630488);
				class645_sub1_sub5_sub1_sub1.anInt11786
				    = -709294901 * client.anInt11127;
			    }
			}
			if (class549.aClass645_Sub1_7417
			    instanceof Class645_Sub1_Sub2_Sub1) {
			    int i_62_ = i_35_ + 961465569 * class578.anInt7607;
			    int i_63_
				= class578.anInt7608 * -173815201 + i_36_;
			    Class528_Sub2 class528_sub2
				= ((Class528_Sub2)
				   (client.aClass692_11042.method8137
				    ((long) ((class549.aClass645_Sub1_7417
					      .aByte10675) << 28
					     | i_63_ << 14 | i_62_))));
			    if (null != class528_sub2) {
				int i_64_ = 0;
				Class528_Sub1 class528_sub1
				    = ((Class528_Sub1)
				       class528_sub2.aClass688_10201
					   .method8036((byte) 0));
				while (null != class528_sub1) {
				    ItemType itemType
					= ((ItemType)
					   (Class18.aClass5_Sub13_206.method63
					    ((-48406585
					      * class528_sub1.anInt10200),
					     753595588)));
				    int i_65_;
				    if (itemType.aBool89)
					i_65_ = itemType.anInt101 * -1951328255;
				    else if (itemType.aBool53)
					i_65_ = -426779025 * (Class293
							      .aClass597_3223
							      .anInt7845);
				    else
					i_65_ = (Class293.aClass597_3223
						 .anInt7852) * 1093515045;
				    if (client.aBool10899
					&& ((Class108
					     .myPlayer
					     .aByte10675)
					    == (class549.aClass645_Sub1_7417
						.aByte10675))) {
					Class79 class79
					    = ((Class79)
					       ((Class690.anInt8680
						 * -1138738213) != -1
						? (Class208
						       .aClass5_Sub10_2239
						       .method63
						   ((-1138738213
						     * Class690.anInt8680),
						    -1905427623))
						: null));
					if (0 != ((-856748185
						   * Class296.anInt3249)
						  & 0x1)
					    && (class79 == null
						|| ((itemType.method522
						     ((Class690.anInt8680
						       * -1138738213),
						      (1875093329
						       * class79.anInt809),
						      -1835291372))
						    != (1875093329
							* class79.anInt809))))
					    Class280.method3738
						(client.aString10902,
						 new StringBuilder().append
						     (client.aString11175)
						     .append
						     (" ").append
						     (Class49.aString553)
						     .append
						     (" ").append
						     (Class666.method7905
						      (i_65_, (short) -22988))
						     .append
						     (itemType.aString36)
						     .toString(),
						 (Class528_Sub6.anInt10255
						  * -555764949),
						 17, -1,
						 (long) ((class528_sub1
							  .anInt10200)
							 * -48406585),
						 i_35_, i_36_, true, false,
						 (long) i_64_, false,
						 -1323924550);
				    }
				    if ((Class108
					 .myPlayer
					 .aByte10675)
					== (class549.aClass645_Sub1_7417
					    .aByte10675)) {
					String[] strings
					    = itemType.aStringArray90;
					for (int i_66_ = strings.length - 1;
					     i_66_ >= 0; i_66_--) {
					    if (strings[i_66_] != null) {
						int i_67_ = 0;
						int i_68_ = (client.anInt11036
							     * -1058229845);
						if (0 == i_66_)
						    i_67_ = 18;
						if (i_66_ == 1)
						    i_67_ = 19;
						if (2 == i_66_)
						    i_67_ = 20;
						if (i_66_ == 3)
						    i_67_ = 21;
						if (i_66_ == 4)
						    i_67_ = 22;
						if (i_66_ == 5)
						    i_67_ = 1004;
						int i_69_
						    = (itemType.method524
						       (i_66_, 1961083077));
						if (-1 != i_69_)
						    i_68_ = i_69_;
						Class280.method3738
						    (strings[i_66_],
						     new StringBuilder().append
							 (Class666.method7905
							  (i_65_,
							   (short) -23955))
							 .append
							 (itemType.aString36)
							 .toString(),
						     i_68_, i_67_, -1,
						     (long) ((class528_sub1
							      .anInt10200)
							     * -48406585),
						     i_35_, i_36_, true, false,
						     (long) i_64_, false,
						     -1353376734);
					    }
					}
				    }
				    class528_sub1
					= ((Class528_Sub1)
					   class528_sub2.aClass688_10201
					       .method8038(2123373125));
				    i_64_++;
				}
			    }
			}
			if (class549.aClass645_Sub1_7417
			    instanceof Interface60) {
			    Interface60 interface60
				= (Interface60) class549.aClass645_Sub1_7417;
			    Class596 class596
				= ((Class596)
				   (client.gameScene.method5976
					((short) 17043).method63
				    (interface60.method397((short) -13769),
				     1739992032)));
			    if (null != class596.anIntArray7767)
				class596
				    = class596.method7099((Class570
							   .playerVarsProvider),
							  (Class570
							   .playerVarsProvider),
							  1160548805);
			    if (class596 != null) {
				if (client.aBool10899
				    && (class549.aClass645_Sub1_7417.aByte10675
					== (Class108
					    .myPlayer
					    .aByte10675))) {
				    Class79 class79
					= ((Class79)
					   ((Class690.anInt8680 * -1138738213
					     != -1)
					    ? (Class208.aClass5_Sub10_2239
						   .method63
					       ((Class690.anInt8680
						 * -1138738213),
						-1023914778))
					    : null));
				    if ((-856748185 * Class296.anInt3249
					 & 0x4) != 0
					&& (class79 == null
					    || ((class596.method7112
						 ((Class690.anInt8680
						   * -1138738213),
						  (1875093329
						   * class79.anInt809),
						  999194630))
						!= (1875093329
						    * class79.anInt809))))
					Class280.method3738
					    (client.aString10902,
					     new StringBuilder().append
						 (client.aString11175).append
						 (" ").append
						 (Class49.aString553).append
						 (" ").append
						 (Class666.method7905
						  (65535, (short) 13959))
						 .append
						 (class596.aString7770)
						 .toString(),
					     (Class528_Sub6.anInt10255
					      * -555764949),
					     2, -1,
					     (Class5_Sub20.method10190
					      (interface60, i_35_, i_36_,
					       (byte) -12)),
					     i_35_, i_36_, true, false,
					     (long) interface60.hashCode(),
					     false, -846596497);
				}
				if ((Class108
				     .myPlayer
				     .aByte10675)
				    == (class549.aClass645_Sub1_7417
					.aByte10675)) {
				    String[] strings
					= class596.aStringArray7790;
				    if (strings != null) {
					for (int i_70_ = strings.length - 1;
					     i_70_ >= 0; i_70_--) {
					    if (strings[i_70_] != null) {
						int i_71_ = 0;
						int i_72_
						    = (-1058229845
						       * client.anInt11036);
						if (i_70_ == 0)
						    i_71_ = 3;
						if (i_70_ == 1)
						    i_71_ = 4;
						if (i_70_ == 2)
						    i_71_ = 5;
						if (i_70_ == 3)
						    i_71_ = 6;
						if (4 == i_70_)
						    i_71_ = 1001;
						if (i_70_ == 5)
						    i_71_ = 1002;
						int i_73_
						    = (class596.method7106
						       (i_70_, (byte) 105));
						if (i_73_ != -1)
						    i_72_ = i_73_;
						Class280.method3738
						    (strings[i_70_],
						     new StringBuilder().append
							 (Class666.method7905
							  (65535,
							   (short) 23780))
							 .append
							 (class596.aString7770)
							 .toString(),
						     i_72_, i_71_, -1,
						     (Class5_Sub20.method10190
						      (interface60, i_35_,
						       i_36_, (byte) -47)),
						     i_35_, i_36_, true, false,
						     (long) interface60
								.hashCode(),
						     false, -307696369);
					    }
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method7741(int i) {
	Class528_Sub6.aClass692_10254.method8141(2126611293);
    }
}
