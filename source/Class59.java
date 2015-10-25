/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59 implements Interface62
{
    static long aLong708;
    
    public boolean method405(Class645_Sub1_Sub5 class645_sub1_sub5) {
	return (class645_sub1_sub5 instanceof Interface60
		&& ((Interface60) class645_sub1_sub5).method387((byte) -40));
    }
    
    public boolean method406(Class645_Sub1_Sub5 class645_sub1_sub5, int i) {
	return (class645_sub1_sub5 instanceof Interface60
		&& ((Interface60) class645_sub1_sub5).method387((byte) -40));
    }
    
    public boolean method404(Class645_Sub1_Sub5 class645_sub1_sub5) {
	return (class645_sub1_sub5 instanceof Interface60
		&& ((Interface60) class645_sub1_sub5).method387((byte) -77));
    }
    
    static void method996(int i) {
	if (Class64.aClass173_751 != null) {
	    Class64.aClass173_751.method2156(-1372793801);
	    Class64.aClass173_751 = null;
	    Class64.aClass172_752 = null;
	}
    }
    
    static final void method997(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class1 class1
	    = Class625.aClass414_8129.method4937(client.anInterface50_10917,
						 i_0_, 456144193);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class1.method504(string, Class298.aClass151Array3262,
			       (byte) 113);
    }
    
    static void method998(Class528_Sub21_Sub11 class528_sub21_sub11, int i,
			  int i_1_, boolean bool, int i_2_) {
	if (class528_sub21_sub11 != null
	    && Class28.aClass688_274.aClass528_8655 != class528_sub21_sub11) {
	    int i_3_
		= (517389195
		   * ((Class528_Sub21_Sub11) class528_sub21_sub11).anInt11593);
	    int i_4_
		= (((Class528_Sub21_Sub11) class528_sub21_sub11).anInt11590
		   * 1000490939);
	    int i_5_
		= (((Class528_Sub21_Sub11) class528_sub21_sub11).anInt11595
		   * 382057983);
	    int i_6_ = (int) (1856775008213551683L
			      * (((Class528_Sub21_Sub11) class528_sub21_sub11)
				 .aLong11589));
	    long l = (((Class528_Sub21_Sub11) class528_sub21_sub11).aLong11589
		      * 1856775008213551683L);
	    if (i_5_ >= 2000)
		i_5_ -= 2000;
	    Class578 class578 = client.aClass495_10935.method5966(1273279609);
	    if (i_5_ == 30 && client.aClass229_11059 == null) {
		Class641.method7603(i_4_, i_3_, (byte) 33);
		client.aClass229_11059
		    = Class230.method3236(i_4_, i_3_, 541906600);
		if (client.aClass229_11059 != null)
		    Class39.method811(client.aClass229_11059, 1435904523);
	    }
	    if (i_5_ == 60) {
		if (859247239 * client.playerRights > 0
		    && Class651.method7748((byte) 5))
		    Class29.method751((Class108
				       .myPlayer
				       .aByte10675),
				      i_3_ + class578.anInt7607 * 961465569,
				      i_4_ + -173815201 * class578.anInt7608,
				      469219997);
		else {
		    client.anInt11113 = 1740863991 * i;
		    client.anInt10965 = -1085374023 * i_1_;
		    client.anInt11006 = 1534029373;
		    client.anInt11005 = 0;
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4506,
					      (client.aClass109_10930
					       .aClass10_1379),
					      -2033611238);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9661
			(961465569 * class578.anInt7607 + i_3_, -6605755);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9660
			(class578.anInt7608 * -173815201 + i_4_, 887049031);
		    client.aClass109_10930.method1380(class528_sub34,
						      1585747956);
		}
	    }
	    if (57 == i_5_ || i_5_ == 1007)
		Class204.method2910(i_6_, i_4_, i_3_,
				    ((Class528_Sub21_Sub11)
				     class528_sub21_sub11).aString11596,
				    -2133134664);
	    if (58 == i_5_) {
		Class229 class229 = Class230.method3236(i_4_, i_3_, 898374120);
		if (null != class229)
		    Class298.method3990(class229, (byte) -127);
	    }
	    OutgoingOpcode outgoingOpcode = null;
	    if (i_5_ == 9)
		outgoingOpcode = OutgoingOpcode.aClass403_4566;
	    else if (i_5_ == 10)
		outgoingOpcode = OutgoingOpcode.aClass403_4486;
	    else if (i_5_ == 11)
		outgoingOpcode = OutgoingOpcode.aClass403_4556;
	    else if (12 == i_5_)
		outgoingOpcode = OutgoingOpcode.aClass403_4483;
	    else if (13 == i_5_)
		outgoingOpcode = OutgoingOpcode.aClass403_4465;
	    else if (1003 == i_5_)
		outgoingOpcode = OutgoingOpcode.aClass403_4507;
	    if (outgoingOpcode != null) {
		Class528_Sub31 class528_sub31
		    = ((Class528_Sub31)
		       client.aClass692_11110.method8137((long) i_6_));
		if (class528_sub31 != null) {
		    NPC class645_sub1_sub5_sub1_sub1
			= ((NPC)
			   class528_sub31.anObject10468);
		    client.anInt11113 = i * 1740863991;
		    client.anInt10965 = i_1_ * -1085374023;
		    client.anInt11006 = -1226908550;
		    client.anInt11005 = 0;
		    Class528_Sub34 class528_sub34
			= Class656.method7845(outgoingOpcode,
					      (client.aClass109_10930
					       .aClass10_1379),
					      -1894135121);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.method9717(i_6_, (byte) -19);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeByteC
			(Class181.method2683((byte) -6) ? 1 : 0, 2140886341);
		    client.aClass109_10930.method1380(class528_sub34,
						      1835215346);
		    Class568.method6847((class645_sub1_sub5_sub1_sub1
					 .sceneXQueue[0]),
					(class645_sub1_sub5_sub1_sub1
					 .sceneYQueue[0]),
					-1521620693);
		}
	    }
	    if (i_5_ == 59) {
		client.anInt11113 = i * 1740863991;
		client.anInt10965 = i_1_ * -1085374023;
		client.anInt11006 = 1534029373;
		client.anInt11005 = 0;
		Class528_Sub34 class528_sub34
		    = Class656.method7845(OutgoingOpcode.aClass403_4459,
					  client.aClass109_10930.aClass10_1379,
					  -2080781094);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeLEShortA(client.anInt11052 * -1114833639, -2074275469);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .writeInt(Class487.anInt5494 * -771216895, 2004840273);
		class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
		    (class578.anInt7608 * -173815201 + i_4_, -2125565119);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .method9660(client.anInt11053 * 1961354633, 1945785551);
		class528_sub34.aClass528_Sub42_Sub2_10481.method9660
		    (class578.anInt7607 * 961465569 + i_3_, 1676984497);
		client.aClass109_10930.method1380(class528_sub34, 2045145828);
		Class568.method6847(i_3_, i_4_, -2051789974);
	    }
	    OutgoingOpcode class403_7_ = null;
	    if (i_5_ == 3)
		class403_7_ = OutgoingOpcode.aClass403_4469;
	    else if (i_5_ == 4)
		class403_7_ = OutgoingOpcode.aClass403_4539;
	    else if (i_5_ == 5)
		class403_7_ = OutgoingOpcode.aClass403_4533;
	    else if (6 == i_5_)
		class403_7_ = OutgoingOpcode.aClass403_4482;
	    else if (i_5_ == 1001)
		class403_7_ = OutgoingOpcode.aClass403_4515;
	    else if (1002 == i_5_)
		class403_7_ = OutgoingOpcode.aClass403_4532;
	    if (null != class403_7_) {
		client.anInt11113 = i * 1740863991;
		client.anInt10965 = -1085374023 * i_1_;
		client.anInt11006 = -1226908550;
		client.anInt11005 = 0;
		Class528_Sub34 class528_sub34
		    = Class656.method7845(class403_7_,
					  client.aClass109_10930.aClass10_1379,
					  -2076436536);
		class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
		    (961465569 * class578.anInt7607 + i_3_, -2044952301);
		class528_sub34.aClass528_Sub42_Sub2_10481
		    .method9671((int) (l >>> 32) & 0x7fffffff, 668499139);
		class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
		    (-173815201 * class578.anInt7608 + i_4_, -2125611790);
		class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
		    (Class181.method2683((byte) -128) ? 1 : 0, (byte) 76);
		client.aClass109_10930.method1380(class528_sub34, 1602453942);
		Class568.method6847(i_3_, i_4_, -2109417615);
	    }
	    if (i_5_ == 25) {
		Class229 class229
		    = Class230.method3236(i_4_, i_3_, -491966355);
		if (null != class229) {
		    Class7.method565(-1187426900);
		    Class528_Sub29 class528_sub29
			= client.method10201(class229);
		    Class181_Sub1.method8397
			(class229, class528_sub29.method9474(1394932953),
			 class528_sub29.anInt10456 * -547002555, -1781367984);
		    client.aString10902
			= Class279.method3734(class229, -946781028);
		    if (null == client.aString10902)
			client.aString10902 = "Null";
		    client.aString11175
			= new StringBuilder().append(class229.aString2473)
			      .append
			      (Class666.method7905(16777215, (short) 790))
			      .toString();
		}
	    } else {
		if (8 == i_5_) {
		    Class528_Sub31 class528_sub31
			= ((Class528_Sub31)
			   client.aClass692_11110.method8137((long) i_6_));
		    if (null != class528_sub31) {
			NPC class645_sub1_sub5_sub1_sub1
			    = ((NPC)
			       class528_sub31.anObject10468);
			client.anInt11113 = 1740863991 * i;
			client.anInt10965 = -1085374023 * i_1_;
			client.anInt11006 = -1226908550;
			client.anInt11005 = 0;
			Class528_Sub34 class528_sub34
			    = Class656.method7845(OutgoingOpcode.aClass403_4558,
						  (client.aClass109_10930
						   .aClass10_1379),
						  -1928350865);
			class528_sub34.aClass528_Sub42_Sub2_10481.method9661
			    (client.anInt11053 * 1961354633, 1430865548);
			class528_sub34.aClass528_Sub42_Sub2_10481.method9660
			    (-1114833639 * client.anInt11052, 1092962597);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .method9717(i_6_, (byte) -56);
			class528_sub34.aClass528_Sub42_Sub2_10481.method9673
			    (-771216895 * Class487.anInt5494, 65535);
			class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			    (Class181.method2683((byte) -72) ? 1 : 0,
			     (byte) -89);
			client.aClass109_10930.method1380(class528_sub34,
							  1723031252);
			Class568.method6847((class645_sub1_sub5_sub1_sub1
					     .sceneXQueue[0]),
					    (class645_sub1_sub5_sub1_sub1
					     .sceneYQueue[0]),
					    -1540966001);
		    }
		}
		if (15 == i_5_) {
		    Player class645_sub1_sub5_sub1_sub2
			= client.localPlayers[i_6_];
		    if (null != class645_sub1_sub5_sub1_sub2) {
			client.anInt11113 = 1740863991 * i;
			client.anInt10965 = -1085374023 * i_1_;
			client.anInt11006 = -1226908550;
			client.anInt11005 = 0;
			Class528_Sub34 class528_sub34
			    = Class656.method7845(OutgoingOpcode.aClass403_4496,
						  (client.aClass109_10930
						   .aClass10_1379),
						  -2114284329);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeLEShortA(i_6_, -2103053798);
			class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
			    (client.anInt11053 * 1961354633, -1986776102);
			class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			    (Class181.method2683((byte) -103) ? 1 : 0,
			     (byte) -12);
			class528_sub34.aClass528_Sub42_Sub2_10481.method9660
			    (-1114833639 * client.anInt11052, 2081327578);
			class528_sub34.aClass528_Sub42_Sub2_10481.method9671
			    (Class487.anInt5494 * -771216895, 668499139);
			client.aClass109_10930.method1380(class528_sub34,
							  1135204330);
			Class568.method6847((class645_sub1_sub5_sub1_sub2
					     .sceneXQueue[0]),
					    (class645_sub1_sub5_sub1_sub2
					     .sceneYQueue[0]),
					    -1561164794);
		    }
		}
		if (i_5_ == 23) {
		    if (client.playerRights * 859247239 > 0
			&& Class651.method7748((byte) 119))
			Class29.method751((Class108
					   .myPlayer
					   .aByte10675),
					  (class578.anInt7607 * 961465569
					   + i_3_),
					  (-173815201 * class578.anInt7608
					   + i_4_),
					  469219997);
		    else {
			Class528_Sub34 class528_sub34
			    = Class686.method8028(i_3_, i_4_, i_6_,
						  1156275701);
			if (i_6_ == 1) {
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeByte(-1, (byte) 1);
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeByte(-1, (byte) -30);
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.method9717
				((int) client.aFloat11088, (byte) 33);
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeByte(57, (byte) 81);
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeByte
				(-946910725 * client.anInt10852, (byte) 2);
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeByte
				(-1303557179 * client.anInt11049, (byte) -114);
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeByte(89, (byte) 45);
			    Class422 class422
				= (Class108
				       .myPlayer
				       .method7693
				   ().aClass422_4868);
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.method9717
				((int) class422.aFloat4780, (byte) 28);
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.method9717
				((int) class422.aFloat4777, (byte) -49);
			    class528_sub34.aClass528_Sub42_Sub2_10481
				.writeByte(63, (byte) -32);
			} else {
			    client.anInt11113 = i * 1740863991;
			    client.anInt10965 = -1085374023 * i_1_;
			    client.anInt11006 = 1534029373;
			    client.anInt11005 = 0;
			}
			client.aClass109_10930.method1380(class528_sub34,
							  1851345974);
			Class568.method6847(i_3_, i_4_, -1949509777);
		    }
		}
		if (16 == i_5_) {
		    client.anInt11113 = i * 1740863991;
		    client.anInt10965 = -1085374023 * i_1_;
		    client.anInt11006 = -1226908550;
		    client.anInt11005 = 0;
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4496,
					      (client.aClass109_10930
					       .aClass10_1379),
					      -1915336024);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
			(-34811601 * (Class108
				      .myPlayer
				      .anInt11783),
			 -2123242707);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
			(1961354633 * client.anInt11053, -2134598041);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			(Class181.method2683((byte) -89) ? 1 : 0, (byte) -63);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9660
			(client.anInt11052 * -1114833639, 1568543242);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9671
			(-771216895 * Class487.anInt5494, 668499139);
		    client.aClass109_10930.method1380(class528_sub34,
						      427757222);
		}
		if (1008 == i_5_ || i_5_ == 1009 || i_5_ == 1010
		    || 1011 == i_5_ || 1012 == i_5_)
		    Class528_Sub15.method9403(i_5_, i_6_, i_3_, (byte) -19);
		OutgoingOpcode class403_8_ = null;
		if (18 == i_5_)
		    class403_8_ = OutgoingOpcode.aClass403_4478;
		else if (19 == i_5_)
		    class403_8_ = OutgoingOpcode.aClass403_4552;
		else if (i_5_ == 20)
		    class403_8_ = OutgoingOpcode.aClass403_4502;
		else if (21 == i_5_)
		    class403_8_ = OutgoingOpcode.aClass403_4454;
		else if (22 == i_5_)
		    class403_8_ = OutgoingOpcode.aClass403_4471;
		else if (i_5_ == 1004)
		    class403_8_ = OutgoingOpcode.aClass403_4500;
		if (class403_8_ != null) {
		    client.anInt11113 = i * 1740863991;
		    client.anInt10965 = -1085374023 * i_1_;
		    client.anInt11006 = -1226908550;
		    client.anInt11005 = 0;
		    Class528_Sub34 class528_sub34
			= Class656.method7845(class403_8_,
					      (client.aClass109_10930
					       .aClass10_1379),
					      -2082152360);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.method9661(i_6_, -1002885960);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			((bool ? 2 : 0) | (Class181.method2683((byte) -6) ? 1
					   : 0),
			 (byte) 47);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
			(961465569 * class578.anInt7607 + i_3_, -2065885982);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9660
			(i_4_ + class578.anInt7608 * -173815201, 1786287615);
		    client.aClass109_10930.method1380(class528_sub34,
						      233240187);
		    Class568.method6847(i_3_, i_4_, -1793229992);
		}
		OutgoingOpcode class403_9_ = null;
		if (44 == i_5_)
		    class403_9_ = OutgoingOpcode.aClass403_4526;
		else if (i_5_ == 45)
		    class403_9_ = OutgoingOpcode.aClass403_4492;
		else if (46 == i_5_)
		    class403_9_ = OutgoingOpcode.aClass403_4473;
		else if (47 == i_5_)
		    class403_9_ = OutgoingOpcode.aClass403_4503;
		else if (48 == i_5_)
		    class403_9_ = OutgoingOpcode.aClass403_4490;
		else if (49 == i_5_)
		    class403_9_ = OutgoingOpcode.aClass403_4457;
		else if (50 == i_5_)
		    class403_9_ = OutgoingOpcode.aClass403_4468;
		else if (i_5_ == 51)
		    class403_9_ = OutgoingOpcode.aClass403_4499;
		else if (i_5_ == 52)
		    class403_9_ = OutgoingOpcode.aClass403_4569;
		else if (53 == i_5_)
		    class403_9_ = OutgoingOpcode.aClass403_4472;
		if (null != class403_9_) {
		    Player class645_sub1_sub5_sub1_sub2
			= client.localPlayers[i_6_];
		    if (null != class645_sub1_sub5_sub1_sub2) {
			client.anInt11113 = 1740863991 * i;
			client.anInt10965 = i_1_ * -1085374023;
			client.anInt11006 = -1226908550;
			client.anInt11005 = 0;
			Class528_Sub34 class528_sub34
			    = Class656.method7845(class403_9_,
						  (client.aClass109_10930
						   .aClass10_1379),
						  -1945508713);
			class528_sub34.aClass528_Sub42_Sub2_10481.writeByteC
			    (Class181.method2683((byte) -2) ? 1 : 0,
			     2124733275);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .method9717(i_6_, (byte) 3);
			client.aClass109_10930.method1380(class528_sub34,
							  1451339230);
			Class568.method6847((class645_sub1_sub5_sub1_sub2
					     .sceneXQueue[0]),
					    (class645_sub1_sub5_sub1_sub2
					     .sceneYQueue[0]),
					    -2097076530);
		    }
		}
		if (i_5_ == 17) {
		    client.anInt11113 = 1740863991 * i;
		    client.anInt10965 = -1085374023 * i_1_;
		    client.anInt11006 = -1226908550;
		    client.anInt11005 = 0;
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4460,
					      (client.aClass109_10930
					       .aClass10_1379),
					      -2058847050);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9661
			(client.anInt11053 * 1961354633, -1547164674);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9660
			(i_3_ + 961465569 * class578.anInt7607, 729343888);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeLEShortA(i_6_, -1946222603);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeInt
			(-771216895 * Class487.anInt5494, 2039754727);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
			(-173815201 * class578.anInt7608 + i_4_, -2069939457);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9660
			(-1114833639 * client.anInt11052, 1659905831);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeByteC
			(Class181.method2683((byte) -116) ? 1 : 0, 2107131269);
		    client.aClass109_10930.method1380(class528_sub34,
						      1687852823);
		    Class568.method6847(i_3_, i_4_, -1443938174);
		}
		if (i_5_ == 2) {
		    client.anInt11113 = 1740863991 * i;
		    client.anInt10965 = -1085374023 * i_1_;
		    client.anInt11006 = -1226908550;
		    client.anInt11005 = 0;
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4572,
					      (client.aClass109_10930
					       .aClass10_1379),
					      -1932461560);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
			(client.anInt11052 * -1114833639, -2004234554);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9717
			(class578.anInt7608 * -173815201 + i_4_, (byte) 33);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9671
			(Class487.anInt5494 * -771216895, 668499139);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9654
			(Class181.method2683((byte) -80) ? 1 : 0, -1623238539);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeInt((int) (l >>> 32) & 0x7fffffff, 2064185438);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
			(961465569 * class578.anInt7607 + i_3_, -2077027312);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
			(1961354633 * client.anInt11053, -2041097470);
		    client.aClass109_10930.method1380(class528_sub34,
						      1817908598);
		    Class568.method6847(i_3_, i_4_, -1672597375);
		}
		if (client.aBool10899)
		    Class7.method565(-1187426900);
		if (null != Class252.aClass229_2801
		    && 0 == 1785311167 * client.anInt11007)
		    Class39.method811(Class252.aClass229_2801, 1435904523);
	    }
	}
    }
    
    static final void method999(Class648 class648, short i) {
	Class393.method4803(Class528_Sub1.method9237((byte) 54), class648,
			    (byte) -47);
    }
}
