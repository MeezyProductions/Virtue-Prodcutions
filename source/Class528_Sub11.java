/* Class528_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub11 extends Node
{
    int anInt10311;
    Class469 aClass469_10312;
    static Class688 aClass688_10313;
    Class422 aClass422_10314 = new Class422(0.0F, 0.0F, 0.0F);
    int anInt10315;
    int anInt10316;
    int anInt10317;
    static Class688 aClass688_10318 = new Class688();
    int[] anIntArray10319;
    Class596 aClass596_10320;
    int anInt10321;
    int anInt10322;
    int anInt10323;
    int anInt10324;
    static Class692 aClass692_10325;
    NPC aClass645_Sub1_Sub5_Sub1_Sub1_10326;
    Player aClass645_Sub1_Sub5_Sub1_Sub2_10327;
    static final int anInt10328 = 0;
    static final int anInt10329 = 512;
    static final int anInt10330 = 2;
    static final int anInt10331 = 3;
    int anInt10332;
    boolean aBool10333;
    int anInt10334;
    int anInt10335;
    int anInt10336;
    Class469 aClass469_10337;
    Class422 aClass422_10338 = new Class422(0.0F, 0.0F, 0.0F);
    int anInt10339;
    int anInt10340;
    static final int anInt10341 = 1;
    int anInt10342;
    
    void method9347(int i) {
	int i_0_ = ((Class528_Sub11) this).anInt10336 * -389624731;
	if (null != ((Class528_Sub11) this).aClass596_10320) {
	    Class596 class596
		= (((Class528_Sub11) this).aClass596_10320.method7099
		   (Class570.playerVarsProvider,
		    (0 == client.anInt10943 * 345087519
		     ? (IMultiVarValueReader) Class185.anInterface18_2117
		     : Class570.playerVarsProvider),
		    1488538385));
	    if (null != class596) {
		((Class528_Sub11) this).anInt10336
		    = class596.anInt7823 * -1266024123;
		((Class528_Sub11) this).anInt10323
		    = (-1450576049 * class596.anInt7824 << 9) * 1515624751;
		((Class528_Sub11) this).anInt10334
		    = -533943287 * class596.anInt7826;
		((Class528_Sub11) this).anInt10339
		    = 789971103 * class596.anInt7827;
		((Class528_Sub11) this).anInt10324
		    = -1610491437 * class596.anInt7828;
		((Class528_Sub11) this).anIntArray10319
		    = class596.anIntArray7829;
		((Class528_Sub11) this).anInt10335
		    = -1535679901 * class596.anInt7803;
		((Class528_Sub11) this).anInt10321
		    = 1877613441 * class596.anInt7783;
	    } else {
		((Class528_Sub11) this).anInt10336 = -1704527213;
		((Class528_Sub11) this).anInt10323 = 0;
		((Class528_Sub11) this).anInt10334 = 0;
		((Class528_Sub11) this).anInt10339 = 0;
		((Class528_Sub11) this).anInt10324 = 0;
		((Class528_Sub11) this).anIntArray10319 = null;
		((Class528_Sub11) this).anInt10335 = -438432000;
		((Class528_Sub11) this).anInt10321 = 106846976;
		((Class528_Sub11) this).anInt10322 = 0;
	    }
	} else if (((Class528_Sub11) this).aClass645_Sub1_Sub5_Sub1_Sub1_10326
		   != null) {
	    int i_1_
		= Class443.method5323((((Class528_Sub11) this)
				       .aClass645_Sub1_Sub5_Sub1_Sub1_10326),
				      -1100527832);
	    if (i_1_ != i_0_) {
		((Class528_Sub11) this).anInt10336 = i_1_ * 1704527213;
		Class299 class299
		    = (((Class528_Sub11) this)
		       .aClass645_Sub1_Sub5_Sub1_Sub1_10326.aClass299_12043);
		if (class299.anIntArray3302 != null)
		    class299 = class299.method3996(Class570.playerVarsProvider,
						   Class570.playerVarsProvider,
						   -541555533);
		if (null != class299) {
		    ((Class528_Sub11) this).anInt10323
			= (class299.anInt3293 * -1125421609 << 9) * 1515624751;
		    ((Class528_Sub11) this).anInt10322
			= 596733547 * (class299.anInt3322 * -1472670161 << 9);
		    ((Class528_Sub11) this).anInt10334
			= class299.anInt3300 * 1937393747;
		    ((Class528_Sub11) this).anInt10335
			= class299.anInt3332 * -362713459;
		    ((Class528_Sub11) this).anInt10321
			= class299.anInt3309 * -714684605;
		} else {
		    ((Class528_Sub11) this).anInt10322 = 0;
		    ((Class528_Sub11) this).anInt10323 = 0;
		    ((Class528_Sub11) this).anInt10334 = 0;
		    ((Class528_Sub11) this).anInt10335 = -438432000;
		    ((Class528_Sub11) this).anInt10321 = 106846976;
		}
	    }
	} else if (((Class528_Sub11) this).aClass645_Sub1_Sub5_Sub1_Sub2_10327
		   != null) {
	    ((Class528_Sub11) this).anInt10336
		= Class377.method4706((((Class528_Sub11) this)
				       .aClass645_Sub1_Sub5_Sub1_Sub2_10327),
				      -47873479) * 1704527213;
	    ((Class528_Sub11) this).anInt10323
		= (-645857965 * (((Class528_Sub11) this)
				 .aClass645_Sub1_Sub5_Sub1_Sub2_10327
				 .anInt12050)
		   << 9) * 1515624751;
	    ((Class528_Sub11) this).anInt10322 = 0;
	    ((Class528_Sub11) this).anInt10334
		= -2135058741 * (((Class528_Sub11) this)
				 .aClass645_Sub1_Sub5_Sub1_Sub2_10327
				 .anInt12067);
	    ((Class528_Sub11) this).anInt10335 = -438432000;
	    ((Class528_Sub11) this).anInt10321 = 106846976;
	}
	if (((Class528_Sub11) this).anInt10336 * -389624731 != i_0_
	    && null != ((Class528_Sub11) this).aClass469_10337
	    && ((Class528_Sub11) this).aClass469_10337 != null) {
	    ((Class528_Sub11) this).aClass469_10337.method5742(100,
							       2031111076);
	    Class365.aClass218_3848.method3101((((Class528_Sub11) this)
						.aClass469_10337),
					       1205108470);
	    ((Class528_Sub11) this).aClass469_10337 = null;
	}
    }
    
    public static void method9348(boolean bool) {
	for (Class528_Sub11 class528_sub11
		 = (Class528_Sub11) aClass688_10318.method8034(734063165);
	     class528_sub11 != null;
	     class528_sub11
		 = (Class528_Sub11) aClass688_10318.method8037(896549170)) {
	    if (((Class528_Sub11) class528_sub11).aClass469_10337 != null) {
		((Class528_Sub11) class528_sub11).aClass469_10337
		    .method5742(150, 1993707575);
		Class365.aClass218_3848.method3101((((Class528_Sub11)
						     class528_sub11)
						    .aClass469_10337),
						   1508766478);
		((Class528_Sub11) class528_sub11).aClass469_10337 = null;
	    }
	    if (null != ((Class528_Sub11) class528_sub11).aClass469_10312) {
		((Class528_Sub11) class528_sub11).aClass469_10312
		    .method5742(150, 2146088036);
		Class365.aClass218_3848.method3101((((Class528_Sub11)
						     class528_sub11)
						    .aClass469_10312),
						   962999271);
		((Class528_Sub11) class528_sub11).aClass469_10312 = null;
	    }
	    class528_sub11.method6443(529301606);
	}
	if (bool) {
	    for (Class528_Sub11 class528_sub11
		     = (Class528_Sub11) aClass688_10313.method8034(902371972);
		 class528_sub11 != null;
		 class528_sub11 = ((Class528_Sub11)
				   aClass688_10313.method8037(1062110900))) {
		if (null
		    != ((Class528_Sub11) class528_sub11).aClass469_10337) {
		    ((Class528_Sub11) class528_sub11).aClass469_10337
			.method5742(150, 2133352551);
		    Class365.aClass218_3848.method3101((((Class528_Sub11)
							 class528_sub11)
							.aClass469_10337),
						       1879523726);
		    ((Class528_Sub11) class528_sub11).aClass469_10337 = null;
		}
		class528_sub11.method6443(-424861107);
	    }
	    for (Class528_Sub11 class528_sub11
		     = ((Class528_Sub11)
			aClass692_10325.method8146(-1942855841));
		 null != class528_sub11;
		 class528_sub11 = ((Class528_Sub11)
				   aClass692_10325.method8138(-1974168015))) {
		if (null
		    != ((Class528_Sub11) class528_sub11).aClass469_10337) {
		    ((Class528_Sub11) class528_sub11).aClass469_10337
			.method5742(150, 2142038072);
		    Class365.aClass218_3848.method3101((((Class528_Sub11)
							 class528_sub11)
							.aClass469_10337),
						       1257246522);
		    ((Class528_Sub11) class528_sub11).aClass469_10337 = null;
		}
		class528_sub11.method6443(-1391492892);
	    }
	}
    }
    
    public static void method9349() {
	for (Class528_Sub11 class528_sub11
		 = (Class528_Sub11) aClass688_10318.method8034(580837744);
	     null != class528_sub11;
	     class528_sub11
		 = (Class528_Sub11) aClass688_10318.method8037(-1116264495)) {
	    if (((Class528_Sub11) class528_sub11).aBool10333)
		class528_sub11.method9347(132554674);
	}
	for (Class528_Sub11 class528_sub11
		 = (Class528_Sub11) aClass688_10313.method8034(757665535);
	     null != class528_sub11;
	     class528_sub11
		 = (Class528_Sub11) aClass688_10313.method8037(-65006081)) {
	    if (((Class528_Sub11) class528_sub11).aBool10333)
		class528_sub11.method9347(645096097);
	}
    }
    
    void method9350() {
	int i = ((Class528_Sub11) this).anInt10336 * -389624731;
	if (null != ((Class528_Sub11) this).aClass596_10320) {
	    Class596 class596
		= (((Class528_Sub11) this).aClass596_10320.method7099
		   (Class570.playerVarsProvider,
		    (0 == client.anInt10943 * 345087519
		     ? (IMultiVarValueReader) Class185.anInterface18_2117
		     : Class570.playerVarsProvider),
		    1984771074));
	    if (null != class596) {
		((Class528_Sub11) this).anInt10336
		    = class596.anInt7823 * -1266024123;
		((Class528_Sub11) this).anInt10323
		    = (-1450576049 * class596.anInt7824 << 9) * 1515624751;
		((Class528_Sub11) this).anInt10334
		    = -533943287 * class596.anInt7826;
		((Class528_Sub11) this).anInt10339
		    = 789971103 * class596.anInt7827;
		((Class528_Sub11) this).anInt10324
		    = -1610491437 * class596.anInt7828;
		((Class528_Sub11) this).anIntArray10319
		    = class596.anIntArray7829;
		((Class528_Sub11) this).anInt10335
		    = -1535679901 * class596.anInt7803;
		((Class528_Sub11) this).anInt10321
		    = 1877613441 * class596.anInt7783;
	    } else {
		((Class528_Sub11) this).anInt10336 = -1704527213;
		((Class528_Sub11) this).anInt10323 = 0;
		((Class528_Sub11) this).anInt10334 = 0;
		((Class528_Sub11) this).anInt10339 = 0;
		((Class528_Sub11) this).anInt10324 = 0;
		((Class528_Sub11) this).anIntArray10319 = null;
		((Class528_Sub11) this).anInt10335 = -438432000;
		((Class528_Sub11) this).anInt10321 = 106846976;
		((Class528_Sub11) this).anInt10322 = 0;
	    }
	} else if (((Class528_Sub11) this).aClass645_Sub1_Sub5_Sub1_Sub1_10326
		   != null) {
	    int i_2_
		= Class443.method5323((((Class528_Sub11) this)
				       .aClass645_Sub1_Sub5_Sub1_Sub1_10326),
				      631867869);
	    if (i_2_ != i) {
		((Class528_Sub11) this).anInt10336 = i_2_ * 1704527213;
		Class299 class299
		    = (((Class528_Sub11) this)
		       .aClass645_Sub1_Sub5_Sub1_Sub1_10326.aClass299_12043);
		if (class299.anIntArray3302 != null)
		    class299 = class299.method3996(Class570.playerVarsProvider,
						   Class570.playerVarsProvider,
						   -1882021936);
		if (null != class299) {
		    ((Class528_Sub11) this).anInt10323
			= (class299.anInt3293 * -1125421609 << 9) * 1515624751;
		    ((Class528_Sub11) this).anInt10322
			= 596733547 * (class299.anInt3322 * -1472670161 << 9);
		    ((Class528_Sub11) this).anInt10334
			= class299.anInt3300 * 1937393747;
		    ((Class528_Sub11) this).anInt10335
			= class299.anInt3332 * -362713459;
		    ((Class528_Sub11) this).anInt10321
			= class299.anInt3309 * -714684605;
		} else {
		    ((Class528_Sub11) this).anInt10322 = 0;
		    ((Class528_Sub11) this).anInt10323 = 0;
		    ((Class528_Sub11) this).anInt10334 = 0;
		    ((Class528_Sub11) this).anInt10335 = -438432000;
		    ((Class528_Sub11) this).anInt10321 = 106846976;
		}
	    }
	} else if (((Class528_Sub11) this).aClass645_Sub1_Sub5_Sub1_Sub2_10327
		   != null) {
	    ((Class528_Sub11) this).anInt10336
		= Class377.method4706((((Class528_Sub11) this)
				       .aClass645_Sub1_Sub5_Sub1_Sub2_10327),
				      1844872697) * 1704527213;
	    ((Class528_Sub11) this).anInt10323
		= (-645857965 * (((Class528_Sub11) this)
				 .aClass645_Sub1_Sub5_Sub1_Sub2_10327
				 .anInt12050)
		   << 9) * 1515624751;
	    ((Class528_Sub11) this).anInt10322 = 0;
	    ((Class528_Sub11) this).anInt10334
		= -2135058741 * (((Class528_Sub11) this)
				 .aClass645_Sub1_Sub5_Sub1_Sub2_10327
				 .anInt12067);
	    ((Class528_Sub11) this).anInt10335 = -438432000;
	    ((Class528_Sub11) this).anInt10321 = 106846976;
	}
	if (((Class528_Sub11) this).anInt10336 * -389624731 != i
	    && null != ((Class528_Sub11) this).aClass469_10337
	    && ((Class528_Sub11) this).aClass469_10337 != null) {
	    ((Class528_Sub11) this).aClass469_10337.method5742(100,
							       2004897469);
	    Class365.aClass218_3848.method3101((((Class528_Sub11) this)
						.aClass469_10337),
					       1241147470);
	    ((Class528_Sub11) this).aClass469_10337 = null;
	}
    }
    
    void method9351() {
	int i = ((Class528_Sub11) this).anInt10336 * -389624731;
	if (null != ((Class528_Sub11) this).aClass596_10320) {
	    Class596 class596
		= (((Class528_Sub11) this).aClass596_10320.method7099
		   (Class570.playerVarsProvider,
		    (0 == client.anInt10943 * 345087519
		     ? (IMultiVarValueReader) Class185.anInterface18_2117
		     : Class570.playerVarsProvider),
		    1063984106));
	    if (null != class596) {
		((Class528_Sub11) this).anInt10336
		    = class596.anInt7823 * -1266024123;
		((Class528_Sub11) this).anInt10323
		    = (-1450576049 * class596.anInt7824 << 9) * 1515624751;
		((Class528_Sub11) this).anInt10334
		    = -533943287 * class596.anInt7826;
		((Class528_Sub11) this).anInt10339
		    = 789971103 * class596.anInt7827;
		((Class528_Sub11) this).anInt10324
		    = -1610491437 * class596.anInt7828;
		((Class528_Sub11) this).anIntArray10319
		    = class596.anIntArray7829;
		((Class528_Sub11) this).anInt10335
		    = -1535679901 * class596.anInt7803;
		((Class528_Sub11) this).anInt10321
		    = 1877613441 * class596.anInt7783;
	    } else {
		((Class528_Sub11) this).anInt10336 = -1704527213;
		((Class528_Sub11) this).anInt10323 = 0;
		((Class528_Sub11) this).anInt10334 = 0;
		((Class528_Sub11) this).anInt10339 = 0;
		((Class528_Sub11) this).anInt10324 = 0;
		((Class528_Sub11) this).anIntArray10319 = null;
		((Class528_Sub11) this).anInt10335 = -438432000;
		((Class528_Sub11) this).anInt10321 = 106846976;
		((Class528_Sub11) this).anInt10322 = 0;
	    }
	} else if (((Class528_Sub11) this).aClass645_Sub1_Sub5_Sub1_Sub1_10326
		   != null) {
	    int i_3_
		= Class443.method5323((((Class528_Sub11) this)
				       .aClass645_Sub1_Sub5_Sub1_Sub1_10326),
				      -859811097);
	    if (i_3_ != i) {
		((Class528_Sub11) this).anInt10336 = i_3_ * 1704527213;
		Class299 class299
		    = (((Class528_Sub11) this)
		       .aClass645_Sub1_Sub5_Sub1_Sub1_10326.aClass299_12043);
		if (class299.anIntArray3302 != null)
		    class299 = class299.method3996(Class570.playerVarsProvider,
						   Class570.playerVarsProvider,
						   -1096340167);
		if (null != class299) {
		    ((Class528_Sub11) this).anInt10323
			= (class299.anInt3293 * -1125421609 << 9) * 1515624751;
		    ((Class528_Sub11) this).anInt10322
			= 596733547 * (class299.anInt3322 * -1472670161 << 9);
		    ((Class528_Sub11) this).anInt10334
			= class299.anInt3300 * 1937393747;
		    ((Class528_Sub11) this).anInt10335
			= class299.anInt3332 * -362713459;
		    ((Class528_Sub11) this).anInt10321
			= class299.anInt3309 * -714684605;
		} else {
		    ((Class528_Sub11) this).anInt10322 = 0;
		    ((Class528_Sub11) this).anInt10323 = 0;
		    ((Class528_Sub11) this).anInt10334 = 0;
		    ((Class528_Sub11) this).anInt10335 = -438432000;
		    ((Class528_Sub11) this).anInt10321 = 106846976;
		}
	    }
	} else if (((Class528_Sub11) this).aClass645_Sub1_Sub5_Sub1_Sub2_10327
		   != null) {
	    ((Class528_Sub11) this).anInt10336
		= Class377.method4706((((Class528_Sub11) this)
				       .aClass645_Sub1_Sub5_Sub1_Sub2_10327),
				      -1621029502) * 1704527213;
	    ((Class528_Sub11) this).anInt10323
		= (-645857965 * (((Class528_Sub11) this)
				 .aClass645_Sub1_Sub5_Sub1_Sub2_10327
				 .anInt12050)
		   << 9) * 1515624751;
	    ((Class528_Sub11) this).anInt10322 = 0;
	    ((Class528_Sub11) this).anInt10334
		= -2135058741 * (((Class528_Sub11) this)
				 .aClass645_Sub1_Sub5_Sub1_Sub2_10327
				 .anInt12067);
	    ((Class528_Sub11) this).anInt10335 = -438432000;
	    ((Class528_Sub11) this).anInt10321 = 106846976;
	}
	if (((Class528_Sub11) this).anInt10336 * -389624731 != i
	    && null != ((Class528_Sub11) this).aClass469_10337
	    && ((Class528_Sub11) this).aClass469_10337 != null) {
	    ((Class528_Sub11) this).aClass469_10337.method5742(100,
							       2024599824);
	    Class365.aClass218_3848.method3101((((Class528_Sub11) this)
						.aClass469_10337),
					       1005207842);
	    ((Class528_Sub11) this).aClass469_10337 = null;
	}
    }
    
    void method9352() {
	int i = ((Class528_Sub11) this).anInt10336 * -389624731;
	if (null != ((Class528_Sub11) this).aClass596_10320) {
	    Class596 class596
		= (((Class528_Sub11) this).aClass596_10320.method7099
		   (Class570.playerVarsProvider,
		    (0 == client.anInt10943 * 345087519
		     ? (IMultiVarValueReader) Class185.anInterface18_2117
		     : Class570.playerVarsProvider),
		    450571078));
	    if (null != class596) {
		((Class528_Sub11) this).anInt10336
		    = class596.anInt7823 * -1266024123;
		((Class528_Sub11) this).anInt10323
		    = (-1450576049 * class596.anInt7824 << 9) * 1515624751;
		((Class528_Sub11) this).anInt10334
		    = -533943287 * class596.anInt7826;
		((Class528_Sub11) this).anInt10339
		    = 789971103 * class596.anInt7827;
		((Class528_Sub11) this).anInt10324
		    = -1610491437 * class596.anInt7828;
		((Class528_Sub11) this).anIntArray10319
		    = class596.anIntArray7829;
		((Class528_Sub11) this).anInt10335
		    = -1535679901 * class596.anInt7803;
		((Class528_Sub11) this).anInt10321
		    = 1877613441 * class596.anInt7783;
	    } else {
		((Class528_Sub11) this).anInt10336 = -1704527213;
		((Class528_Sub11) this).anInt10323 = 0;
		((Class528_Sub11) this).anInt10334 = 0;
		((Class528_Sub11) this).anInt10339 = 0;
		((Class528_Sub11) this).anInt10324 = 0;
		((Class528_Sub11) this).anIntArray10319 = null;
		((Class528_Sub11) this).anInt10335 = -438432000;
		((Class528_Sub11) this).anInt10321 = 106846976;
		((Class528_Sub11) this).anInt10322 = 0;
	    }
	} else if (((Class528_Sub11) this).aClass645_Sub1_Sub5_Sub1_Sub1_10326
		   != null) {
	    int i_4_
		= Class443.method5323((((Class528_Sub11) this)
				       .aClass645_Sub1_Sub5_Sub1_Sub1_10326),
				      2080455440);
	    if (i_4_ != i) {
		((Class528_Sub11) this).anInt10336 = i_4_ * 1704527213;
		Class299 class299
		    = (((Class528_Sub11) this)
		       .aClass645_Sub1_Sub5_Sub1_Sub1_10326.aClass299_12043);
		if (class299.anIntArray3302 != null)
		    class299 = class299.method3996(Class570.playerVarsProvider,
						   Class570.playerVarsProvider,
						   -1582936412);
		if (null != class299) {
		    ((Class528_Sub11) this).anInt10323
			= (class299.anInt3293 * -1125421609 << 9) * 1515624751;
		    ((Class528_Sub11) this).anInt10322
			= 596733547 * (class299.anInt3322 * -1472670161 << 9);
		    ((Class528_Sub11) this).anInt10334
			= class299.anInt3300 * 1937393747;
		    ((Class528_Sub11) this).anInt10335
			= class299.anInt3332 * -362713459;
		    ((Class528_Sub11) this).anInt10321
			= class299.anInt3309 * -714684605;
		} else {
		    ((Class528_Sub11) this).anInt10322 = 0;
		    ((Class528_Sub11) this).anInt10323 = 0;
		    ((Class528_Sub11) this).anInt10334 = 0;
		    ((Class528_Sub11) this).anInt10335 = -438432000;
		    ((Class528_Sub11) this).anInt10321 = 106846976;
		}
	    }
	} else if (((Class528_Sub11) this).aClass645_Sub1_Sub5_Sub1_Sub2_10327
		   != null) {
	    ((Class528_Sub11) this).anInt10336
		= Class377.method4706((((Class528_Sub11) this)
				       .aClass645_Sub1_Sub5_Sub1_Sub2_10327),
				      -667233203) * 1704527213;
	    ((Class528_Sub11) this).anInt10323
		= (-645857965 * (((Class528_Sub11) this)
				 .aClass645_Sub1_Sub5_Sub1_Sub2_10327
				 .anInt12050)
		   << 9) * 1515624751;
	    ((Class528_Sub11) this).anInt10322 = 0;
	    ((Class528_Sub11) this).anInt10334
		= -2135058741 * (((Class528_Sub11) this)
				 .aClass645_Sub1_Sub5_Sub1_Sub2_10327
				 .anInt12067);
	    ((Class528_Sub11) this).anInt10335 = -438432000;
	    ((Class528_Sub11) this).anInt10321 = 106846976;
	}
	if (((Class528_Sub11) this).anInt10336 * -389624731 != i
	    && null != ((Class528_Sub11) this).aClass469_10337
	    && ((Class528_Sub11) this).aClass469_10337 != null) {
	    ((Class528_Sub11) this).aClass469_10337.method5742(100,
							       2139171076);
	    Class365.aClass218_3848.method3101((((Class528_Sub11) this)
						.aClass469_10337),
					       2037796200);
	    ((Class528_Sub11) this).aClass469_10337 = null;
	}
    }
    
    Class528_Sub11() {
	((Class528_Sub11) this).anInt10332 = 0;
    }
    
    public static void method9353(boolean bool) {
	for (Class528_Sub11 class528_sub11
		 = (Class528_Sub11) aClass688_10318.method8034(1034708050);
	     class528_sub11 != null;
	     class528_sub11
		 = (Class528_Sub11) aClass688_10318.method8037(-1856286031)) {
	    if (((Class528_Sub11) class528_sub11).aClass469_10337 != null) {
		((Class528_Sub11) class528_sub11).aClass469_10337
		    .method5742(150, 2138913154);
		Class365.aClass218_3848.method3101((((Class528_Sub11)
						     class528_sub11)
						    .aClass469_10337),
						   1740486944);
		((Class528_Sub11) class528_sub11).aClass469_10337 = null;
	    }
	    if (null != ((Class528_Sub11) class528_sub11).aClass469_10312) {
		((Class528_Sub11) class528_sub11).aClass469_10312
		    .method5742(150, 2074984514);
		Class365.aClass218_3848.method3101((((Class528_Sub11)
						     class528_sub11)
						    .aClass469_10312),
						   1603821192);
		((Class528_Sub11) class528_sub11).aClass469_10312 = null;
	    }
	    class528_sub11.method6443(1028414879);
	}
	if (bool) {
	    for (Class528_Sub11 class528_sub11
		     = (Class528_Sub11) aClass688_10313.method8034(1690976140);
		 class528_sub11 != null;
		 class528_sub11 = ((Class528_Sub11)
				   aClass688_10313.method8037(-817115124))) {
		if (null
		    != ((Class528_Sub11) class528_sub11).aClass469_10337) {
		    ((Class528_Sub11) class528_sub11).aClass469_10337
			.method5742(150, 2083164991);
		    Class365.aClass218_3848.method3101((((Class528_Sub11)
							 class528_sub11)
							.aClass469_10337),
						       736788588);
		    ((Class528_Sub11) class528_sub11).aClass469_10337 = null;
		}
		class528_sub11.method6443(1781954401);
	    }
	    for (Class528_Sub11 class528_sub11
		     = ((Class528_Sub11)
			aClass692_10325.method8146(-1942855841));
		 null != class528_sub11;
		 class528_sub11 = ((Class528_Sub11)
				   aClass692_10325.method8138(1161967213))) {
		if (null
		    != ((Class528_Sub11) class528_sub11).aClass469_10337) {
		    ((Class528_Sub11) class528_sub11).aClass469_10337
			.method5742(150, 2146194851);
		    Class365.aClass218_3848.method3101((((Class528_Sub11)
							 class528_sub11)
							.aClass469_10337),
						       1682920817);
		    ((Class528_Sub11) class528_sub11).aClass469_10337 = null;
		}
		class528_sub11.method6443(1836985043);
	    }
	}
    }
    
    static {
	aClass688_10313 = new Class688();
	aClass692_10325 = new Class692(16);
    }
    
    public static int method9354(String string, int i) {
	return Canvas_Sub1.aTwitchTV11693.ChatSendMessage(string);
    }
    
    static final void method9355(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class378_Sub2.aClass668_10123.method68();
    }
}
