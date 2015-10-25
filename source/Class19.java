/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public final class Class19
{
    Class19() throws Throwable {
	throw new Error();
    }
    
    static final void method647(int i) {
	if (client.anInt10889 * -794452495 > 1) {
	    client.anInt10889 -= 866235153;
	    client.anInt11105 = -325079279 * client.anInt11018;
	}
	if (client.aClass109_10930.aBool1387) {
	    client.aClass109_10930.aBool1387 = false;
	    Class662.method7879((byte) 92);
	} else {
	    if (!Class28.aBool273)
		Class24.method698(95190825);
	    for (int i_0_ = 0;
		 (i_0_ < 100
		  && Class258.method3545(client.aClass109_10930, (byte) 15));
		 i_0_++) {
		/* empty */
	    }
	    if (client.anInt10876 * 175711435 == 9) {
		while (Class564.method6828(-2017937826)) {
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4517,
					      (client.aClass109_10930
					       .aClass10_1379),
					      -2124365809);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeByte(0, (byte) 19);
		    int i_1_ = (-185904669
				* (class528_sub34.aClass528_Sub42_Sub2_10481
				   .pointer));
		    Class259.method3576((class528_sub34
					 .aClass528_Sub42_Sub2_10481),
					(byte) 0);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9662
			((-185904669 * (class528_sub34
					.aClass528_Sub42_Sub2_10481.pointer)
			  - i_1_),
			 (byte) 35);
		    client.aClass109_10930.method1380(class528_sub34,
						      632125763);
		}
		if (Class208.aClass652_2240 != null) {
		    if (Class208.aClass652_2240.anInt8426 * -1617466425
			!= -1) {
			Class528_Sub34 class528_sub34
			    = Class656.method7845(OutgoingOpcode.aClass403_4474,
						  (client.aClass109_10930
						   .aClass10_1379),
						  -1878770969);
			if (Class193.aGarbageCollectorMXBean2173 == null
			    || !Class193.aGarbageCollectorMXBean2173
				    .isValid()) {
			    try {
				Iterator iterator
				    = ManagementFactory
					  .getGarbageCollectorMXBeans
					  ().iterator();
				while (iterator.hasNext()) {
				    GarbageCollectorMXBean garbagecollectormxbean
					= ((GarbageCollectorMXBean)
					   iterator.next());
				    if (garbagecollectormxbean.isValid()) {
					Class193.aGarbageCollectorMXBean2173
					    = garbagecollectormxbean;
					client.aLong10874 = 51816913697784875L;
					client.aLong11171
					    = -5031812507369259819L;
				    }
				}
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
			long l = Class249.method3417(1904132157);
			int i_2_ = -1;
			if (null != Class193.aGarbageCollectorMXBean2173) {
			    long l_3_ = Class193
					    .aGarbageCollectorMXBean2173
					    .getCollectionTime();
			    if (-1L
				!= 1141062290069250947L * client.aLong11171) {
				long l_4_ = l_3_ - (1141062290069250947L
						    * client.aLong11171);
				long l_5_ = l - (-3097781405420247683L
						 * client.aLong10874);
				if (l_5_ != 0L)
				    i_2_ = (int) (100L * l_4_ / l_5_);
			    }
			    client.aLong11171 = l_3_ * 5031812507369259819L;
			    client.aLong10874 = -51816913697784875L * l;
			}
			class528_sub34.aClass528_Sub42_Sub2_10481.method9652
			    (296883021 * client.anInt6953, (byte) -78);
			class528_sub34.aClass528_Sub42_Sub2_10481.method9660
			    (Class208.aClass652_2240.anInt8426 * -1617466425,
			     1366385240);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .method9654(i_2_, -1623238539);
			client.aClass109_10930.method1380(class528_sub34,
							  1223637173);
			Class208.aClass652_2240 = null;
			Class59.aLong708 = (l + 30000L) * 1440296647038234043L;
		    }
		} else if (Class249.method3417(1933802969)
			   >= Class59.aLong708 * -5523753293351727245L)
		    Class208.aClass652_2240
			= client.aClass631_10885.method7533((Class12
							     .aClass16_176
							     .aString194),
							    (byte) -124);
		Class447.method5407(1861943205);
		Class209.method2935(1854296487);
		Class528_Sub33 class528_sub33
		    = ((Class528_Sub33)
		       client.aClass688_10900.method8034(1693684070));
		if (client.aClass495_10935.method5973((byte) 27) != null) {
		    if (3 == -1860881523 * Class390.anInt4111)
			Class405.method4875((byte) 50);
		    else if (5 == -1860881523 * Class390.anInt4111)
			Class213.method2968(-411960355);
		}
		if (client.aBool11187)
		    client.aBool11187 = false;
		else
		    client.aFloat11037 /= 2.0F;
		if (client.aBool10979)
		    client.aBool10979 = false;
		else
		    client.aFloat10976 /= 2.0F;
		if (Class677.method7955(-225278296))
		    Class581.method6976((byte) -3);
		else if (6 == Class390.anInt4111 * -1860881523) {
		    Class578 class578
			= client.aClass495_10935.method5966(1273279609);
		    int i_6_ = class578.anInt7607 * 961465569 << 9;
		    int i_7_ = class578.anInt7608 * -173815201 << 9;
		    if (8617023563899752735L * Class452.aLong4974 <= 0L)
			Class452.aLong4974 = (Class249.method3417(2076655620)
					      * 1033284500683221727L);
		    float f = (float) (Class249.method3417(2094072171)
				       - (8617023563899752735L
					  * Class452.aLong4974));
		    int i_8_ = 1000 / Class262.method3646(-1847738930);
		    i_8_ *= 1.25;
		    for (/**/; f > 0.0F; f -= (float) i_8_) {
			float f_9_ = Math.min(f, (float) i_8_);
			Class495.aClass283_Sub1_5578.method3760
			    (f_9_ / 1000.0F,
			     (client.aClass495_10935.method6024(-765386834)
			      .anIntArrayArrayArray5087),
			     client.aClass495_10935.method6006((byte) 0), i_6_,
			     i_7_, -2137352661);
		    }
		    Class452.aLong4974 = (Class249.method3417(1999764858)
					  * 1033284500683221727L);
		}
		Class622.method7420(-100784812);
		if (9 == 175711435 * client.anInt10876) {
		    client.aClass495_10935.method5975(-90624100)
			.method7463(client.aClass495_10935, 1627739188);
		    Class210.method2955((byte) 0);
		    if (-1054745505 * client.anInt11023 > 10)
			((Class109) client.aClass109_10930).anInt1394
			    += -1429233051;
		    if ((-1618133139
			 * ((Class109) client.aClass109_10930).anInt1394)
			> 2250)
			Class662.method7879((byte) 121);
		    else {
			if (client.anInt10943 * 345087519 == 4) {
			    Class658.method7852(1260021185);
			    Class298.method3991((byte) 70);
			} else if (Class173_Sub3.aClass618_9756
				       .anInterface65_8046.method408
				   (class528_sub33,
				    client.anInterface61Array10907,
				    client.anInt10906 * 691559213,
				    Class416.aClass544_4749, (byte) 11))
			    Class181_Sub6.method8960(false, -466744998);
			else {
			    if (345087519 * client.anInt10943 == 1
				&& Class533.method6485((client.anInt10895
							* 76543593),
						       (byte) 91)) {
				client.aClass495_10935.method5990
				    (new Class498(Class489.aClass489_5499,
						  null),
				     1268833808);
				client.anInt10943 = 1805588893;
			    }
			    if (client.anInt10943 * 345087519 == 3
				&& 1 != 175711435 * client.anInt10876) {
				Class185.aClass692_2114.method8141(2083473917);
				client.anInt10943 = 0;
				client.anInt10945
				    = 2060166951 * client.anInt11127;
				client.anInt11015 = 0;
				client.aBool10944 = false;
				Class105.method1354(-344311330);
			    }
			    if (client.anInt10943 * 345087519 == 0) {
				int i_10_ = (client.anInt11127
					     - -149071721 * client.anInt10945);
				if (client.anInt11015 * -1709673117
				    < Class667.aClass181Array8487.length) {
				    do {
					Class181 class181
					    = (Class667.aClass181Array8487
					       [(-1709673117
						 * client.anInt11015)]);
					if (class181.anInt2092 * 629066277
					    > i_10_)
					    break;
					class181.method2675((byte) 90);
				    } while (client.anInt10943 * 345087519 == 0
					     && ((client.anInt11015
						  += -1102793653) * -1709673117
						 < (Class667
						    .aClass181Array8487).length));
				}
				if (345087519 * client.anInt10943 == 0) {
				    for (int i_11_ = 0;
					 i_11_ < (Class185
						  .aClass182Array2106).length;
					 i_11_++) {
					Class182 class182
					    = (Class185.aClass182Array2106
					       [i_11_]);
					if (class182.aBool2097) {
					    Entity class645_sub1_sub5_sub1
						= class182
						      .method2689(-1012043543);
					    Class95_Sub1_Sub1.method10291
						(class645_sub1_sub5_sub1, true,
						 -372478472);
					}
				    }
				}
			    }
			}
			Class51.method909(2015001547);
			Class372.method4678(1023298270);
			IncomingPacket.method4813(-1935558558);
			Class634.method7560(false, 1128711134);
			Class47.method878(Class587.aClass173_7714,
					  Class289.aClass165_3184, 2077270938);
			client.anInt10971 += 1654155741;
			if (0 != 1341659413 * client.anInt11006) {
			    client.anInt11005 += -1652452340;
			    if (1450042455 * client.anInt11005 >= 400)
				client.anInt11006 = 0;
			}
			if (Class252.aClass229_2801 != null) {
			    client.anInt11007 += 527581247;
			    if (1785311167 * client.anInt11007 >= 15) {
				Class39.method811(Class252.aClass229_2801,
						  1435904523);
				Class252.aClass229_2801 = null;
			    }
			}
			client.aClass229_11071 = null;
			client.aBool10890 = false;
			client.aBool11041 = false;
			Class36.aClass229_335 = null;
			Class389.method4772(null, -1, -1, (byte) 10);
			if (!client.aBool10899)
			    client.anInt11048 = -1210203257;
			Class286.method3858(-603878595);
			client.anInt11018 += 1008134521;
			if (client.aBool10947) {
			    Class528_Sub34 class528_sub34
				= Class656.method7845(OutgoingOpcode.aClass403_4519,
						      (client.aClass109_10930
						       .aClass10_1379),
						      -1912901536);
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeMiddleInt
				((1973315555 * Class265.anInt2870 << 28
				  | 36929353 * Class445_Sub1.anInt10126 << 14
				  | -1414246193 * Class258.anInt2842),
				 (byte) 27);
			    client.aClass109_10930.method1380(class528_sub34,
							      1921595769);
			    client.aBool10947 = false;
			}
			for (;;) {
			    Class528_Sub30 class528_sub30
				= ((Class528_Sub30)
				   client.aClass688_11146
				       .method8032(-1490570711));
			    if (null == class528_sub30)
				break;
			    Class229 class229 = class528_sub30.aClass229_10461;
			    if (class229.anInt2377 * 1835803215 >= 0) {
				Class229 class229_12_
				    = Class623_Sub1.method9755(((class229
								 .anInt2522)
								* -1027873541),
							       (byte) -18);
				if (class229_12_ == null
				    || class229_12_.aClass229Array2542 == null
				    || (1835803215 * class229.anInt2377
					>= (class229_12_
					    .aClass229Array2542).length)
				    || class229 != (class229_12_
						    .aClass229Array2542
						    [(1835803215
						      * class229.anInt2377)]))
				    continue;
			    }
			    Class555.method6741(class528_sub30, (short) 13897);
			}
			for (;;) {
			    Class528_Sub30 class528_sub30
				= ((Class528_Sub30)
				   client.aClass688_10958
				       .method8032(-1490570711));
			    if (null == class528_sub30)
				break;
			    Class229 class229 = class528_sub30.aClass229_10461;
			    if (1835803215 * class229.anInt2377 >= 0) {
				Class229 class229_13_
				    = Class623_Sub1.method9755(((class229
								 .anInt2522)
								* -1027873541),
							       (byte) 75);
				if (null == class229_13_
				    || class229_13_.aClass229Array2542 == null
				    || (1835803215 * class229.anInt2377
					>= (class229_13_
					    .aClass229Array2542).length)
				    || class229 != (class229_13_
						    .aClass229Array2542
						    [(class229.anInt2377
						      * 1835803215)]))
				    continue;
			    }
			    Class555.method6741(class528_sub30,
						(short) -11511);
			}
			for (;;) {
			    Class528_Sub30 class528_sub30
				= ((Class528_Sub30)
				   client.aClass688_10992
				       .method8032(-1490570711));
			    if (null == class528_sub30)
				break;
			    Class229 class229 = class528_sub30.aClass229_10461;
			    if (class229.anInt2377 * 1835803215 >= 0) {
				Class229 class229_14_
				    = (Class623_Sub1.method9755
				       (-1027873541 * class229.anInt2522,
					(byte) 98));
				if (class229_14_ == null
				    || null == class229_14_.aClass229Array2542
				    || (1835803215 * class229.anInt2377
					>= (class229_14_
					    .aClass229Array2542).length)
				    || ((class229_14_.aClass229Array2542
					 [1835803215 * class229.anInt2377])
					!= class229))
				    continue;
			    }
			    Class555.method6741(class528_sub30, (short) -8219);
			}
			if (null == Class36.aClass229_335)
			    client.anInt11128 = 0;
			if (null != client.aClass229_11067)
			    Class377.method4707(-1660150254);
			Class326.method4256(1921426291);
			if (859247239 * client.playerRights > 0
			    && Class416.aClass544_4749.method6644(82,
								  290011759)
			    && Class416.aClass544_4749.method6644(81,
								  -854665886)
			    && 0 != 454740049 * client.anInt10926) {
			    int i_15_
				= ((Class108.myPlayer
				    .aByte10675)
				   - 454740049 * client.anInt10926);
			    if (i_15_ < 0)
				i_15_ = 0;
			    else if (i_15_ > 3)
				i_15_ = 3;
			    Class578 class578 = client.aClass495_10935
						    .method5966(1273279609);
			    Class29.method751
				(i_15_,
				 (class578.anInt7607 * 961465569
				  + (Class108
				     .myPlayer
				     .sceneXQueue[0])),
				 (-173815201 * class578.anInt7608
				  + (Class108
				     .myPlayer
				     .sceneYQueue[0])),
				 469219997);
			}
			for (int i_16_ = 0; i_16_ < 5; i_16_++)
			    client.anIntArray11143[i_16_]++;
			if (Class423.aClass141_Sub1_4785.aBool8795
			    && ((Class423.aClass141_Sub1_4785.aLong8791
				 * 1986110058572725775L)
				< Class249.method3417(2142776419) - 60000L))
			    Class647.method7712((short) 728);
			Class423.aClass141_Sub1_4785.method8274((byte) -10);
			for (Class511_Sub5 class511_sub5
				 = ((Class511_Sub5)
				    client.aClass695_10903
					.method8177(-1963887298));
			     null != class511_sub5;
			     class511_sub5 = ((Class511_Sub5)
					      client.aClass695_10903
						  .method8184(-1322955913))) {
			    if ((long) ((((Class511_Sub5) class511_sub5)
					 .anInt10302)
					* -1767134803)
				< (Class249.method3417(1956191937) / 1000L
				   - 5L)) {
				if (((Class511_Sub5) class511_sub5).aShort10303
				    > 0)
				    ModeWhere.method7898
					(5, 0, "", "", "",
					 new StringBuilder().append
					     (((Class511_Sub5) class511_sub5)
					      .aString10301)
					     .append
					     (Class39.aClass39_393.method807
					      (Class378_Sub2.aClass668_10123,
					       (byte) 102))
					     .toString(),
					 null, -1148742267);
				if (0 == (((Class511_Sub5) class511_sub5)
					  .aShort10303))
				    ModeWhere.method7898
					(5, 0, "", "", "",
					 new StringBuilder().append
					     (((Class511_Sub5) class511_sub5)
					      .aString10301)
					     .append
					     (Class39.aClass39_467.method807
					      (Class378_Sub2.aClass668_10123,
					       (byte) 102))
					     .toString(),
					 null, 481292414);
				class511_sub5.method6259(1242084865);
			    }
			}
			client.anInt10964 += -1107144069;
			if (client.anInt10964 * 1963637939 > 508) {
			    client.anInt10964 = 0;
			    int i_17_ = (int) (Math.random() * 8.0);
			    if (1 == (i_17_ & 0x1))
				client.anInt10960
				    += client.anInt10959 * 1667427081;
			    if (2 == (i_17_ & 0x2))
				client.anInt11117
				    += 1910376757 * client.anInt10901;
			    if ((i_17_ & 0x4) == 4)
				client.anInt10911
				    += client.anInt11056 * 692742073;
			}
			if (client.anInt10960 * -1357804645 < -55)
			    client.anInt10959 = 921352054;
			if (client.anInt10960 * -1357804645 > 53)
			    client.anInt10959 = -921352054;
			if (client.anInt11117 * -1631621005 < -59)
			    client.anInt10901 = 1219160158;
			if (-1631621005 * client.anInt11117 > 57)
			    client.anInt10901 = -1219160158;
			if (-564436957 * client.anInt10911 < -40)
			    client.anInt11056 = 708266851;
			if (client.anInt10911 * -564436957 > 42)
			    client.anInt11056 = -708266851;
			client.anInt11184 += -2082418441;
			if (-354750265 * client.anInt11184 > 504) {
			    client.anInt11184 = 0;
			    int i_18_ = (int) (Math.random() * 8.0);
			    if ((i_18_ & 0x1) == 1)
				client.anInt10852
				    += client.anInt10975 * 216093653;
			    if ((i_18_ & 0x2) == 2)
				client.anInt11049
				    += 1730121681 * client.anInt10898;
			}
			if (-946910725 * client.anInt10852 < -67)
			    client.anInt10975 = 691128782;
			if (-946910725 * client.anInt10852 > 67)
			    client.anInt10975 = -691128782;
			if (-1303557179 * client.anInt11049 < -22)
			    client.anInt10898 = 373498493;
			if (-1303557179 * client.anInt11049 > 10)
			    client.anInt10898 = -373498493;
			client.aClass109_10930.anInt1386 += 1455852407;
			if (client.aClass109_10930.anInt1386 * -918831545
			    > 50) {
			    Class528_Sub34 class528_sub34
				= Class656.method7845(OutgoingOpcode.aClass403_4570,
						      (client.aClass109_10930
						       .aClass10_1379),
						      -2073941470);
			    client.aClass109_10930.method1380(class528_sub34,
							      955603966);
			}
			if (client.aBool10933) {
			    Class195.method2827(-1641883924);
			    client.aBool10933 = false;
			}
			try {
			    client.aClass109_10930.method1379(-1269923470);
			} catch (IOException ioexception) {
			    Class662.method7879((byte) 38);
			}
		    }
		}
	    }
	}
    }
    
    static final void method648(Class648 class648, int i) {
	Class692 class692
	    = (((Class648) class648).aClass528_Sub21_Sub14_8397
	       .aClass692Array11618
	       [(((Class648) class648).anIntArray8414
		 [((Class648) class648).anInt8390 * -630179809])]);
	Class528_Sub17 class528_sub17
	    = ((Class528_Sub17)
	       class692.method8137((long) ((Class648) class648).anIntArray8394
					  [(((Class648) class648).anInt8395
					    -= 1239022665) * 717927929]));
	if (null != class528_sub17)
	    ((Class648) class648).anInt8390
		+= -42791739 * class528_sub17.anInt10388;
    }
    
    static void method649(int i, int i_19_, int i_20_, int i_21_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(9, (long) i);
	class528_sub21_sub7.method10496(1899785232);
	((ClientPacket) class528_sub21_sub7).anInt11543
	    = 1959780981 * i_19_;
	((ClientPacket) class528_sub21_sub7).anInt11544
	    = i_20_ * 23247007;
    }
    
    static final void method650(Class648 class648, byte i) {
	Class62.method1021(-8046763);
	Class287.method3864((byte) 1);
	client.aClass495_10935.method5989(2016078152);
	Class243.method3387(2145376686);
	client.aBool11161 = false;
    }
}
