/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class164
{
    public int anInt1827;
    public int anInt1828;
    public int anInt1829;
    int anInt1830;
    public int anInt1831;
    public int anInt1832;
    public int anInt1833;
    
    public Class164(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
		    int i_5_) {
	anInt1827 = -773326249 * i;
	anInt1828 = 516788591 * i_0_;
	anInt1829 = -1923235093 * i_1_;
	((Class164) this).anInt1830 = 527563479 * i_2_;
	anInt1831 = i_3_ * -1247427665;
	anInt1832 = i_4_ * 1420649565;
	anInt1833 = i_5_ * -589047283;
    }
    
    public Class164() {
	/* empty */
    }
    
    public boolean method2085(Class164 class164_6_, short i) {
	return (class164_6_.anInt1827 * -222719641 == anInt1827 * -222719641
		&& -386339441 * anInt1828 == class164_6_.anInt1828 * -386339441
		&& 1802884547 * anInt1829 == 1802884547 * class164_6_.anInt1829
		&& (513906919 * ((Class164) this).anInt1830
		    == 513906919 * ((Class164) class164_6_).anInt1830)
		&& class164_6_.anInt1831 * 861893455 == anInt1831 * 861893455
		&& class164_6_.anInt1832 * 1191940085 == 1191940085 * anInt1832
		&& (anInt1833 * 1057293509
		    == 1057293509 * class164_6_.anInt1833));
    }
    
    static final void method2086(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static void method2087
	(Player class645_sub1_sub5_sub1_sub2,
	 boolean bool, int i) {
	if (Class28.anInt303 * -1024340783 < 406) {
	    if (Class108.myPlayer
		== class645_sub1_sub5_sub1_sub2) {
		if (client.aBool10899
		    && 0 != (-856748185 * Class296.anInt3249 & 0x10))
		    Class280.method3738(client.aString10902,
					new StringBuilder().append
					    (client.aString11175).append
					    (" ").append
					    (Class49.aString553).append
					    (" ").append
					    (Class666.method7905(16777215,
								 (short) 2257))
					    .append
					    (Class39.aClass39_456.method807
					     (Class378_Sub2.aClass668_10123,
					      (byte) 102))
					    .toString(),
					-555764949 * Class528_Sub6.anInt10255,
					16, -1, 0L, 0, 0, true, false,
					(long) ((class645_sub1_sub5_sub1_sub2
						 .anInt11783)
						* -34811601),
					false, -662075374);
	    } else {
		String string;
		if (0
		    == 1977163315 * class645_sub1_sub5_sub1_sub2.skillLevel) {
		    boolean bool_7_ = true;
		    if (-1 != (Class108.myPlayer
			       .anInt12064) * 1543970045
			&& -1 != (1543970045
				  * class645_sub1_sub5_sub1_sub2.anInt12064)) {
			int i_8_
			    = (((1543970045
				 * (Class108.myPlayer
				    .anInt12064))
				< (1543970045
				   * class645_sub1_sub5_sub1_sub2.anInt12064))
			       ? (Class108.myPlayer
				  .anInt12064) * 1543970045
			       : (1543970045
				  * class645_sub1_sub5_sub1_sub2.anInt12064));
			int i_9_
			    = ((1305140229
				* (Class108.myPlayer
				   .combatLevel))
			       - (class645_sub1_sub5_sub1_sub2.combatLevel
				  * 1305140229));
			if (i_9_ < 0)
			    i_9_ = -i_9_;
			if (i_9_ > i_8_)
			    bool_7_ = false;
		    }
		    String string_10_
			= (Class673.aClass673_8531 == client.aClass673_11108
			   ? Class39.aClass39_478.method807((Class378_Sub2
							     .aClass668_10123),
							    (byte) 102)
			   : Class39.aClass39_476.method807((Class378_Sub2
							     .aClass668_10123),
							    (byte) 102));
		    if (class645_sub1_sub5_sub1_sub2.combatLevel * 1305140229
			>= (1715795123
			    * class645_sub1_sub5_sub1_sub2.anInt12056))
			string
			    = new StringBuilder().append
				  (class645_sub1_sub5_sub1_sub2
				       .method10929(true, (short) -3366))
				  .append
				  (bool_7_
				   ? (Class364_Sub1.method9171
				      ((1305140229
					* (class645_sub1_sub5_sub1_sub2
					   .combatLevel)),
				       (1305140229
					* (Class108
					   .myPlayer
					   .combatLevel)),
				       -1235924377))
				   : Class666.method7905(16777215,
							 (short) -13117))
				  .append
				  (Class49.aString551).append
				  (string_10_).append
				  (1305140229
				   * class645_sub1_sub5_sub1_sub2.combatLevel)
				  .append
				  (Class49.aString552).toString();
		    else
			string
			    = new StringBuilder().append
				  (class645_sub1_sub5_sub1_sub2
				       .method10929(true, (short) -30081))
				  .append
				  (bool_7_
				   ? (Class364_Sub1.method9171
				      ((1305140229
					* (class645_sub1_sub5_sub1_sub2
					   .combatLevel)),
				       (Class108
					.myPlayer
					.combatLevel) * 1305140229,
				       -209565917))
				   : Class666.method7905(16777215,
							 (short) -17428))
				  .append
				  (Class49.aString551).append
				  (string_10_).append
				  (class645_sub1_sub5_sub1_sub2.combatLevel
				   * 1305140229)
				  .append
				  ("+").append
				  ((class645_sub1_sub5_sub1_sub2.anInt12056
				    * 1715795123)
				   - (class645_sub1_sub5_sub1_sub2.combatLevel
				      * 1305140229))
				  .append
				  (Class49.aString552).toString();
		} else if (-1 == (class645_sub1_sub5_sub1_sub2.skillLevel
				  * 1977163315))
		    string = class645_sub1_sub5_sub1_sub2
				 .method10929(true, (short) -91);
		else
		    string = new StringBuilder().append
				 (class645_sub1_sub5_sub1_sub2
				      .method10929(true, (short) -31428))
				 .append
				 (Class49.aString551).append
				 (Class39.aClass39_477.method807
				  (Class378_Sub2.aClass668_10123, (byte) 102))
				 .append
				 (1977163315
				  * class645_sub1_sub5_sub1_sub2.skillLevel)
				 .append
				 (Class49.aString552).toString();
		boolean bool_11_ = false;
		if (null != class645_sub1_sub5_sub1_sub2.model
		    && -1 != 674438203 * (class645_sub1_sub5_sub1_sub2
					  .model.anInt7968)) {
		    Class299 class299
			= ((Class299)
			   (Class21.aClass5_Sub8_214.method63
			    (674438203 * (class645_sub1_sub5_sub1_sub2
					  .model.anInt7968),
			     -1475294557)));
		    if (class299.aBool3295) {
			bool_11_ = true;
			string = ((Class299)
				  (Class21.aClass5_Sub8_214.method63
				   ((class645_sub1_sub5_sub1_sub2
				     .model.anInt7968) * 674438203,
				    -1322109702))).aString3269;
			if (1767413015 * class299.anInt3266 != 0) {
			    String string_12_
				= ((Class673.aClass673_8531
				    == client.aClass673_11108)
				   ? (Class39.aClass39_478.method807
				      (Class378_Sub2.aClass668_10123,
				       (byte) 102))
				   : (Class39.aClass39_476.method807
				      (Class378_Sub2.aClass668_10123,
				       (byte) 102)));
			    string
				= new StringBuilder().append(string).append
				      (Class364_Sub1.method9171
				       (1767413015 * class299.anInt3266,
					(Class108
					 .myPlayer
					 .combatLevel) * 1305140229,
					1276210391))
				      .append
				      (Class49.aString551).append
				      (string_12_).append
				      (class299.anInt3266 * 1767413015).append
				      (Class49.aString552).toString();
			}
		    }
		}
		if (client.aBool10899 && !bool
		    && (-856748185 * Class296.anInt3249 & 0x8) != 0)
		    Class280.method3738
			(client.aString10902,
			 new StringBuilder().append(client.aString11175).append
			     (" ").append
			     (Class49.aString553).append
			     (" ").append
			     (Class666.method7905(16777215, (short) -28664))
			     .append
			     (string).toString(),
			 Class528_Sub6.anInt10255 * -555764949, 15, -1,
			 (long) (class645_sub1_sub5_sub1_sub2.anInt11783
				 * -34811601),
			 0, 0, true, false,
			 (long) (class645_sub1_sub5_sub1_sub2.anInt11783
				 * -34811601),
			 false, -65884057);
		if (!bool) {
		    for (int i_13_ = 7; i_13_ >= 0; i_13_--) {
			if (client.aStringArray11039[i_13_] != null) {
			    short i_14_ = 0;
			    if ((Class673.aClass673_8529
				 == client.aClass673_11108)
				&& (client.aStringArray11039[i_13_]
					.equalsIgnoreCase
				    (Class39.aClass39_513.method807
				     (Class378_Sub2.aClass668_10123,
				      (byte) 102)))) {
				if (client.aClass629_11034
				    == Class629.aClass629_8187)
				    i_14_ = (short) 2000;
				else if ((client.aClass629_11034
					  == Class629.aClass629_8188)
					 && ((class645_sub1_sub5_sub1_sub2
					      .combatLevel) * 1305140229
					     > (1305140229
						* (Class108
						   .myPlayer
						   .combatLevel))))
				    i_14_ = (short) 2000;
				if ((1050310403
				     * (Class108
					.myPlayer
					.teamId)) != 0
				    && (1050310403
					* (class645_sub1_sub5_sub1_sub2
					   .teamId)) != 0) {
				    if ((1050310403
					 * (Class108
					    .myPlayer
					    .teamId))
					== (class645_sub1_sub5_sub1_sub2
					    .teamId) * 1050310403)
					i_14_ = (short) 2000;
				    else
					i_14_ = (short) 0;
				} else if (class645_sub1_sub5_sub1_sub2
					   .inClan)
				    i_14_ = (short) 2000;
			    } else if (client.aBoolArray10875[i_13_])
				i_14_ = (short) 2000;
			    short i_15_
				= (short) (i_14_
					   + client.aShortArray11009[i_13_]);
			    int i_16_ = (-1 != client.anIntArray11038[i_13_]
					 ? client.anIntArray11038[i_13_]
					 : -1058229845 * client.anInt11036);
			    int i_17_ = bool_11_ ? 16776960 : 16777215;
			    Class280.method3738
				(client.aStringArray11039[i_13_],
				 new StringBuilder().append
				     (Class666.method7905(i_17_,
							  (short) -9997))
				     .append
				     (string).toString(),
				 i_16_, i_15_, -1,
				 (long) ((class645_sub1_sub5_sub1_sub2
					  .anInt11783)
					 * -34811601),
				 0, 0, true, false,
				 (long) ((class645_sub1_sub5_sub1_sub2
					  .anInt11783)
					 * -34811601),
				 false, -831176873);
			}
		    }
		} else if (!bool_11_)
		    Class280.method3738(new StringBuilder().append
					    (Class666.method7905(13421772,
								 (short) 2573))
					    .append
					    (string).toString(),
					"", -1, -1, 0, 0L, 0, 0, false, true,
					(long) ((class645_sub1_sub5_sub1_sub2
						 .anInt11783)
						* -34811601),
					false, 1891455716);
		if (!bool && !bool_11_) {
		    for (Class528_Sub21_Sub11 class528_sub21_sub11
			     = ((Class528_Sub21_Sub11)
				Class28.aClass688_274.method8034(849876748));
			 class528_sub21_sub11 != null;
			 class528_sub21_sub11
			     = ((Class528_Sub21_Sub11)
				Class28.aClass688_274
				    .method8037(-1300383150))) {
			if (23
			    == (((Class528_Sub21_Sub11) class528_sub21_sub11)
				.anInt11595) * 382057983) {
			    ((Class528_Sub21_Sub11) class528_sub21_sub11)
				.aString11584
				= new StringBuilder().append
				      (Class666.method7905(16777215,
							   (short) 20993))
				      .append
				      (string).toString();
			    break;
			}
		    }
		}
	    }
	}
    }
    
    static final void method2088(Class648 class648, int i) {
	((Class648) class648).anInt8410 -= -1094513834;
	String string
	    = (String) (((Class648) class648).anObjectArray8396
			[((Class648) class648).anInt8410 * -520794877]);
	String string_18_
	    = (String) (((Class648) class648).anObjectArray8396
			[1 + ((Class648) class648).anInt8410 * -520794877]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = new StringBuilder().append(string).append(string_18_).toString();
    }
    
    static void method2089(Entity class645_sub1_sub5_sub1,
			   byte i) {
	if (class645_sub1_sub5_sub1 instanceof NPC) {
	    NPC class645_sub1_sub5_sub1_sub1
		= (NPC) class645_sub1_sub5_sub1;
	    if (class645_sub1_sub5_sub1_sub1.aClass299_12043 != null)
		Class224.method3170(class645_sub1_sub5_sub1_sub1,
				    (class645_sub1_sub5_sub1_sub1.aByte10675
				     != (Class108
					 .myPlayer
					 .aByte10675)),
				    606630488);
	} else if (class645_sub1_sub5_sub1
		   instanceof Player) {
	    Player class645_sub1_sub5_sub1_sub2
		= (Player) class645_sub1_sub5_sub1;
	    method2087(class645_sub1_sub5_sub1_sub2,
		       (class645_sub1_sub5_sub1_sub2.aByte10675
			!= (Class108.myPlayer
			    .aByte10675)),
		       598808883);
	}
    }
    
    static final void method2090(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub2_10580,
	     ((((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	      == 1) ? 1 : 0,
	     136477086);
	Class662.method7878(1119281887);
	client.aClass495_10935.method5975(-624153062).method7492(1957979059);
	Class243.method3387(2139662272);
	client.aBool11161 = false;
    }
    
    static final int method2091(int i, int i_19_, int i_20_, byte i_21_) {
	int i_22_ = i / i_20_;
	int i_23_ = i & i_20_ - 1;
	int i_24_ = i_19_ / i_20_;
	int i_25_ = i_19_ & i_20_ - 1;
	int i_26_ = Class291.method3900(i_22_, i_24_, -1371010666);
	int i_27_ = Class291.method3900(i_22_ + 1, i_24_, 1798788800);
	int i_28_ = Class291.method3900(i_22_, 1 + i_24_, 539042529);
	int i_29_ = Class291.method3900(1 + i_22_, i_24_ + 1, 78242823);
	int i_30_
	    = Class365.method4637(i_26_, i_27_, i_23_, i_20_, -942738427);
	int i_31_
	    = Class365.method4637(i_28_, i_29_, i_23_, i_20_, -911806196);
	return Class365.method4637(i_30_, i_31_, i_25_, i_20_, -1868795304);
    }
    
    static final void method2092(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_32_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_33_ = (((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395]);
	int i_34_ = (((Class648) class648).anIntArray8394
		     [2 + 717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aClass217_11028.method3071(i_32_, -1408405328)
		  .method2907(i_33_, i_34_, -1251473722) == null ? 0 : 1;
    }
}
