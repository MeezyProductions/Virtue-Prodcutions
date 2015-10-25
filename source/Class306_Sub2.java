/* Class306_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class306_Sub2 extends Class306
{
    static final int anInt9959 = 9;
    static final int anInt9960 = 0;
    static final int anInt9961 = 1;
    static final int anInt9962 = 2;
    static final int anInt9963 = 18;
    static final int anInt9964 = 16;
    static final int anInt9965 = 5;
    static final int anInt9966 = 6;
    static final int anInt9967 = 7;
    static final int anInt9968 = 8;
    static final int anInt9969 = 4;
    Class258 aClass258_9970;
    static final int anInt9971 = 11;
    static final int anInt9972 = 12;
    static final int anInt9973 = 10;
    static final int anInt9974 = 14;
    static final int anInt9975 = 15;
    static final int anInt9976 = 0;
    static final int anInt9977 = 17;
    static final int anInt9978 = 17;
    int[] anIntArray9979;
    static final int anInt9980 = 2;
    static final int anInt9981 = 7;
    static final int anInt9982 = 12;
    static final int anInt9983 = 3;
    Class262[] aClass262Array9984;
    static final int anInt9985 = 13;
    static final int anInt9986 = 1;
    static final int anInt9987 = 19;
    int[][] anIntArrayArray9988;
    Class418 aClass418_9989 = new Class418();
    
    public void method4062() {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[17]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	method9063(0, 2115755517);
    }
    
    boolean method9062(int i) throws Exception_Sub2 {
	((Class306_Sub2) this).aClass258_9970
	    = aClass173_Sub1_3352.method8580("Model");
	Class528_Sub22_Sub1 class528_sub22_sub1
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("DiffuseSampler", -2022521294);
	Class528_Sub22_Sub1 class528_sub22_sub1_0_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("EnvironmentSampler", -1838382514);
	Class528_Sub22_Sub1 class528_sub22_sub1_1_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("PointLightsPosAndRadiusInv", -1779560192);
	Class528_Sub22_Sub1 class528_sub22_sub1_2_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("PointLightsDiffuseColour", -1673550767);
	Class528_Sub22_Sub1 class528_sub22_sub1_3_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("WVPMatrix",
							       -1705715021);
	Class528_Sub22_Sub1 class528_sub22_sub1_4_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("TexCoordMatrix", -2018822658);
	Class528_Sub22_Sub1 class528_sub22_sub1_5_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("HeightFogPlane", -1802108726);
	Class528_Sub22_Sub1 class528_sub22_sub1_6_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("HeightFogColour", -1538524392);
	Class528_Sub22_Sub1 class528_sub22_sub1_7_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("DistanceFogPlane", -1884249827);
	Class528_Sub22_Sub1 class528_sub22_sub1_8_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("DistanceFogColour", -2064487229);
	Class528_Sub22_Sub1 class528_sub22_sub1_9_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("SunDir",
							       -2145506494);
	Class528_Sub22_Sub1 class528_sub22_sub1_10_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("SunColour",
							       -1664802934);
	Class528_Sub22_Sub1 class528_sub22_sub1_11_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("AntiSunColour",
							       -1771481839);
	Class528_Sub22_Sub1 class528_sub22_sub1_12_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("AmbientColour",
							       -1922252927);
	Class528_Sub22_Sub1 class528_sub22_sub1_13_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("EyePos",
							       -1880859979);
	Class528_Sub22_Sub1 class528_sub22_sub1_14_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("SpecularExponent", -1537831141);
	Class528_Sub22_Sub1 class528_sub22_sub1_15_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("WorldMatrix",
							       -2086430345);
	((Class306_Sub2) this).aClass262Array9984[0]
	    = ((Class306_Sub2) this).aClass258_9970.method3483("Unlit",
							       -107760666);
	((Class306_Sub2) this).aClass262Array9984[1]
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3483("Unlit_IgnoreAlpha", -138394158);
	((Class306_Sub2) this).aClass262Array9984[17]
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3483("UnderwaterGround", -343606633);
	((Class306_Sub2) this).aClass262Array9984[18]
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3483("UnderwaterGroundSpecular", -1940199748);
	for (int i_16_ = 0; i_16_ <= 4; i_16_++) {
	    ((Class306_Sub2) this).aClass262Array9984[2 + i_16_]
		= (((Class306_Sub2) this).aClass258_9970.method3483
		   (new StringBuilder().append("Standard_").append(i_16_)
			.append
			("PointLights").toString(),
		    -637997931));
	    ((Class306_Sub2) this).aClass262Array9984[7 + i_16_]
		= (((Class306_Sub2) this).aClass258_9970.method3483
		   (new StringBuilder().append("Specular_").append(i_16_)
			.append
			("PointLights").toString(),
		    -438643551));
	    ((Class306_Sub2) this).aClass262Array9984[12 + i_16_]
		= (((Class306_Sub2) this).aClass258_9970.method3483
		   (new StringBuilder().append("EnvironmentalMapping_").append
			(i_16_).append
			("PointLights").toString(),
		    -1389062256));
	}
	for (int i_17_ = 0; i_17_ < 19; i_17_++) {
	    int i_18_ = (((Class306_Sub2) this).aClass258_9970.method3540
			 (((Class306_Sub2) this).aClass262Array9984[i_17_],
			  (short) 11678));
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][2]
		= class528_sub22_sub1.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][3]
		= class528_sub22_sub1_0_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][1]
		= class528_sub22_sub1_1_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][0]
		= class528_sub22_sub1_2_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][4]
		= class528_sub22_sub1_3_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][5]
		= class528_sub22_sub1_4_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][7]
		= class528_sub22_sub1_5_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][8]
		= class528_sub22_sub1_6_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][9]
		= class528_sub22_sub1_7_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][10]
		= class528_sub22_sub1_8_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][11]
		= class528_sub22_sub1_9_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][12]
		= class528_sub22_sub1_10_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][13]
		= class528_sub22_sub1_11_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][14]
		= class528_sub22_sub1_12_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][6]
		= class528_sub22_sub1_13_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][15]
		= class528_sub22_sub1_15_.method10441(i_18_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i_17_][16]
		= class528_sub22_sub1_14_.method10441(i_18_);
	}
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[2]);
	return true;
    }
    
    void method9063(int i, int i_19_) {
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[2]),
							 0, anInterface34_3355,
							 -1013326725);
	((Class306_Sub2) this).aClass258_9970.method3506
	    (((Class306_Sub2) this).anIntArray9979[4],
	     ((Class306_Sub2) this).aClass418_9989, -955099490);
	((Class306_Sub2) this).aClass258_9970.method3533((((Class306_Sub2)
							   this)
							  .anIntArray9979[5]),
							 aClass418_3358,
							 -908324200);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[7],
	     aClass425_3361.aFloat4790, aClass425_3361.aFloat4791,
	     aClass425_3361.aFloat4792, aClass425_3361.aFloat4793,
	     (short) 23971);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[8],
	     aClass422_3362.aFloat4780, aClass422_3362.aFloat4776,
	     aClass422_3362.aFloat4777, (byte) 49);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[9],
	     aClass425_3372.aFloat4790, aClass425_3372.aFloat4791,
	     aClass425_3372.aFloat4792, aClass425_3372.aFloat4793,
	     (short) 20726);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[10],
	     aClass422_3368.aFloat4780, aClass422_3368.aFloat4776,
	     aClass422_3368.aFloat4777, (byte) -87);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[11]),
							 aClass422_3365,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[12]),
							 aClass422_3366,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[13]),
							 aClass422_3367,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[14]),
							 aClass422_3363,
							 -1182370236);
	if (i > 0) {
	    ((Class306_Sub2) this).aClass258_9970.method3503
		(((Class306_Sub2) this).anIntArray9979[1], aFloatArray3364,
		 i * 4, 2041557393);
	    ((Class306_Sub2) this).aClass258_9970.method3503
		(((Class306_Sub2) this).anIntArray9979[0], aFloatArray3357,
		 4 * i, 2041557393);
	}
	aClass173_Sub1_3352.method8563(Class363.aClass363_3839, anInt3370,
				       anInt3354, anInt3351, anInt3373);
    }
    
    public void method4058(boolean bool) {
	if (bool)
	    ((Class306_Sub2) this).aClass258_9970
		.method3488(((Class306_Sub2) this).aClass262Array9984[1]);
	else
	    ((Class306_Sub2) this).aClass258_9970
		.method3488(((Class306_Sub2) this).aClass262Array9984[0]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[2]),
							 0, anInterface34_3355,
							 -1580172083);
	((Class306_Sub2) this).aClass258_9970.method3506
	    (((Class306_Sub2) this).anIntArray9979[4],
	     ((Class306_Sub2) this).aClass418_9989, -146192085);
	((Class306_Sub2) this).aClass258_9970.method3533((((Class306_Sub2)
							   this)
							  .anIntArray9979[5]),
							 aClass418_3358,
							 -908324200);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[7],
	     aClass425_3361.aFloat4790, aClass425_3361.aFloat4791,
	     aClass425_3361.aFloat4792, aClass425_3361.aFloat4793,
	     (short) 31537);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[8],
	     aClass422_3362.aFloat4780, aClass422_3362.aFloat4776,
	     aClass422_3362.aFloat4777, (byte) 9);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[9],
	     aClass425_3372.aFloat4790, aClass425_3372.aFloat4791,
	     aClass425_3372.aFloat4792, aClass425_3372.aFloat4793,
	     (short) 22648);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[10],
	     aClass422_3368.aFloat4780, aClass422_3368.aFloat4776,
	     aClass422_3368.aFloat4777, (byte) -112);
	aClass173_Sub1_3352.method8563(Class363.aClass363_3839, anInt3370,
				       anInt3354, anInt3351, anInt3373);
    }
    
    boolean method9064() throws Exception_Sub2 {
	((Class306_Sub2) this).aClass258_9970
	    = aClass173_Sub1_3352.method8580("Model");
	Class528_Sub22_Sub1 class528_sub22_sub1
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("DiffuseSampler", -1774420073);
	Class528_Sub22_Sub1 class528_sub22_sub1_20_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("EnvironmentSampler", -1620973212);
	Class528_Sub22_Sub1 class528_sub22_sub1_21_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("PointLightsPosAndRadiusInv", -1847685819);
	Class528_Sub22_Sub1 class528_sub22_sub1_22_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("PointLightsDiffuseColour", -2053771549);
	Class528_Sub22_Sub1 class528_sub22_sub1_23_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("WVPMatrix",
							       -1619179943);
	Class528_Sub22_Sub1 class528_sub22_sub1_24_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("TexCoordMatrix", -1916105476);
	Class528_Sub22_Sub1 class528_sub22_sub1_25_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("HeightFogPlane", -1887167234);
	Class528_Sub22_Sub1 class528_sub22_sub1_26_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("HeightFogColour", -1569730869);
	Class528_Sub22_Sub1 class528_sub22_sub1_27_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("DistanceFogPlane", -1660941733);
	Class528_Sub22_Sub1 class528_sub22_sub1_28_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("DistanceFogColour", -1916696611);
	Class528_Sub22_Sub1 class528_sub22_sub1_29_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("SunDir",
							       -1603189041);
	Class528_Sub22_Sub1 class528_sub22_sub1_30_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("SunColour",
							       -1644811067);
	Class528_Sub22_Sub1 class528_sub22_sub1_31_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("AntiSunColour",
							       -1950713981);
	Class528_Sub22_Sub1 class528_sub22_sub1_32_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("AmbientColour",
							       -1552837856);
	Class528_Sub22_Sub1 class528_sub22_sub1_33_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("EyePos",
							       -1862533078);
	Class528_Sub22_Sub1 class528_sub22_sub1_34_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("SpecularExponent", -1638291857);
	Class528_Sub22_Sub1 class528_sub22_sub1_35_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("WorldMatrix",
							       -2122520007);
	((Class306_Sub2) this).aClass262Array9984[0]
	    = ((Class306_Sub2) this).aClass258_9970.method3483("Unlit",
							       -1719198695);
	((Class306_Sub2) this).aClass262Array9984[1]
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3483("Unlit_IgnoreAlpha", -601461978);
	((Class306_Sub2) this).aClass262Array9984[17]
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3483("UnderwaterGround", 276787579);
	((Class306_Sub2) this).aClass262Array9984[18]
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3483("UnderwaterGroundSpecular", -585831195);
	for (int i = 0; i <= 4; i++) {
	    ((Class306_Sub2) this).aClass262Array9984[2 + i]
		= (((Class306_Sub2) this).aClass258_9970.method3483
		   (new StringBuilder().append("Standard_").append(i).append
			("PointLights").toString(),
		    -1912278811));
	    ((Class306_Sub2) this).aClass262Array9984[7 + i]
		= (((Class306_Sub2) this).aClass258_9970.method3483
		   (new StringBuilder().append("Specular_").append(i).append
			("PointLights").toString(),
		    -1105821282));
	    ((Class306_Sub2) this).aClass262Array9984[12 + i]
		= (((Class306_Sub2) this).aClass258_9970.method3483
		   (new StringBuilder().append("EnvironmentalMapping_").append
			(i).append
			("PointLights").toString(),
		    -1429157996));
	}
	for (int i = 0; i < 19; i++) {
	    int i_36_ = (((Class306_Sub2) this).aClass258_9970.method3540
			 (((Class306_Sub2) this).aClass262Array9984[i],
			  (short) 23782));
	    ((Class306_Sub2) this).anIntArrayArray9988[i][2]
		= class528_sub22_sub1.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][3]
		= class528_sub22_sub1_20_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][1]
		= class528_sub22_sub1_21_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][0]
		= class528_sub22_sub1_22_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][4]
		= class528_sub22_sub1_23_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][5]
		= class528_sub22_sub1_24_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][7]
		= class528_sub22_sub1_25_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][8]
		= class528_sub22_sub1_26_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][9]
		= class528_sub22_sub1_27_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][10]
		= class528_sub22_sub1_28_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][11]
		= class528_sub22_sub1_29_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][12]
		= class528_sub22_sub1_30_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][13]
		= class528_sub22_sub1_31_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][14]
		= class528_sub22_sub1_32_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][6]
		= class528_sub22_sub1_33_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][15]
		= class528_sub22_sub1_35_.method10441(i_36_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][16]
		= class528_sub22_sub1_34_.method10441(i_36_);
	}
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[2]);
	return true;
    }
    
    boolean method9065() throws Exception_Sub2 {
	((Class306_Sub2) this).aClass258_9970
	    = aClass173_Sub1_3352.method8580("Model");
	Class528_Sub22_Sub1 class528_sub22_sub1
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("DiffuseSampler", -1710002120);
	Class528_Sub22_Sub1 class528_sub22_sub1_37_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("EnvironmentSampler", -1862797140);
	Class528_Sub22_Sub1 class528_sub22_sub1_38_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("PointLightsPosAndRadiusInv", -1879279458);
	Class528_Sub22_Sub1 class528_sub22_sub1_39_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("PointLightsDiffuseColour", -2110343954);
	Class528_Sub22_Sub1 class528_sub22_sub1_40_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("WVPMatrix",
							       -1863916254);
	Class528_Sub22_Sub1 class528_sub22_sub1_41_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("TexCoordMatrix", -1569373546);
	Class528_Sub22_Sub1 class528_sub22_sub1_42_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("HeightFogPlane", -1843888063);
	Class528_Sub22_Sub1 class528_sub22_sub1_43_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("HeightFogColour", -1775298901);
	Class528_Sub22_Sub1 class528_sub22_sub1_44_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("DistanceFogPlane", -2105479556);
	Class528_Sub22_Sub1 class528_sub22_sub1_45_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("DistanceFogColour", -2043161908);
	Class528_Sub22_Sub1 class528_sub22_sub1_46_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("SunDir",
							       -1611501848);
	Class528_Sub22_Sub1 class528_sub22_sub1_47_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("SunColour",
							       -2067504490);
	Class528_Sub22_Sub1 class528_sub22_sub1_48_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("AntiSunColour",
							       -2023186909);
	Class528_Sub22_Sub1 class528_sub22_sub1_49_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("AmbientColour",
							       -1991301618);
	Class528_Sub22_Sub1 class528_sub22_sub1_50_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("EyePos",
							       -2119285382);
	Class528_Sub22_Sub1 class528_sub22_sub1_51_
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3498("SpecularExponent", -2031765580);
	Class528_Sub22_Sub1 class528_sub22_sub1_52_
	    = ((Class306_Sub2) this).aClass258_9970.method3498("WorldMatrix",
							       -1973897842);
	((Class306_Sub2) this).aClass262Array9984[0]
	    = ((Class306_Sub2) this).aClass258_9970.method3483("Unlit",
							       -933487612);
	((Class306_Sub2) this).aClass262Array9984[1]
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3483("Unlit_IgnoreAlpha", -425583567);
	((Class306_Sub2) this).aClass262Array9984[17]
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3483("UnderwaterGround", 316045428);
	((Class306_Sub2) this).aClass262Array9984[18]
	    = ((Class306_Sub2) this).aClass258_9970
		  .method3483("UnderwaterGroundSpecular", -253961080);
	for (int i = 0; i <= 4; i++) {
	    ((Class306_Sub2) this).aClass262Array9984[2 + i]
		= (((Class306_Sub2) this).aClass258_9970.method3483
		   (new StringBuilder().append("Standard_").append(i).append
			("PointLights").toString(),
		    387378798));
	    ((Class306_Sub2) this).aClass262Array9984[7 + i]
		= (((Class306_Sub2) this).aClass258_9970.method3483
		   (new StringBuilder().append("Specular_").append(i).append
			("PointLights").toString(),
		    -578291697));
	    ((Class306_Sub2) this).aClass262Array9984[12 + i]
		= (((Class306_Sub2) this).aClass258_9970.method3483
		   (new StringBuilder().append("EnvironmentalMapping_").append
			(i).append
			("PointLights").toString(),
		    -285637209));
	}
	for (int i = 0; i < 19; i++) {
	    int i_53_ = (((Class306_Sub2) this).aClass258_9970.method3540
			 (((Class306_Sub2) this).aClass262Array9984[i],
			  (short) 15890));
	    ((Class306_Sub2) this).anIntArrayArray9988[i][2]
		= class528_sub22_sub1.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][3]
		= class528_sub22_sub1_37_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][1]
		= class528_sub22_sub1_38_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][0]
		= class528_sub22_sub1_39_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][4]
		= class528_sub22_sub1_40_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][5]
		= class528_sub22_sub1_41_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][7]
		= class528_sub22_sub1_42_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][8]
		= class528_sub22_sub1_43_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][9]
		= class528_sub22_sub1_44_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][10]
		= class528_sub22_sub1_45_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][11]
		= class528_sub22_sub1_46_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][12]
		= class528_sub22_sub1_47_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][13]
		= class528_sub22_sub1_48_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][14]
		= class528_sub22_sub1_49_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][6]
		= class528_sub22_sub1_50_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][15]
		= class528_sub22_sub1_52_.method10441(i_53_);
	    ((Class306_Sub2) this).anIntArrayArray9988[i][16]
		= class528_sub22_sub1_51_.method10441(i_53_);
	}
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[2]);
	return true;
    }
    
    public void method4060(int i) {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[7 + i]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[6],
	     aClass422_3369.aFloat4780, aClass422_3369.aFloat4776,
	     aClass422_3369.aFloat4777, (byte) 77);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[16], aFloat3359, aFloat3360,
	     0.0F, 0.0F, (short) 16996);
	method9063(i, -331002786);
    }
    
    public void method4055() {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[18]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[6],
	     aClass422_3369.aFloat4780, aClass422_3369.aFloat4776,
	     aClass422_3369.aFloat4777, (byte) -33);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[16], aFloat3359, aFloat3360,
	     0.0F, 0.0F, (short) 13018);
	method9063(0, 1187363160);
    }
    
    public void method4057(Class418 class418) {
	((Class306_Sub2) this).aClass418_9989.method4986(class418);
	((Class306_Sub2) this).aClass418_9989
	    .method4974(aClass173_Sub1_3352.aClass418_9352);
    }
    
    public void method4071(int i) {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[i + 12]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3504((((Class306_Sub2)
							   this)
							  .anIntArray9979[15]),
							 aClass418_3353,
							 614594942);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[6],
	     aClass422_3369.aFloat4780, aClass422_3369.aFloat4776,
	     aClass422_3369.aFloat4777, (byte) 8);
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[3]),
							 1, anInterface39_3356,
							 -378313261);
	method9063(i, 163706170);
    }
    
    public void method4064(Class418 class418) {
	((Class306_Sub2) this).aClass418_9989.method4986(class418);
	((Class306_Sub2) this).aClass418_9989
	    .method4974(aClass173_Sub1_3352.aClass418_9352);
    }
    
    public void method4063() {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[18]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[6],
	     aClass422_3369.aFloat4780, aClass422_3369.aFloat4776,
	     aClass422_3369.aFloat4777, (byte) 45);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[16], aFloat3359, aFloat3360,
	     0.0F, 0.0F, (short) 14225);
	method9063(0, 2041189410);
    }
    
    public void method4065(int i) {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[7 + i]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[6],
	     aClass422_3369.aFloat4780, aClass422_3369.aFloat4776,
	     aClass422_3369.aFloat4777, (byte) -46);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[16], aFloat3359, aFloat3360,
	     0.0F, 0.0F, (short) 18538);
	method9063(i, 719661487);
    }
    
    public void method4067(int i) {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[i + 12]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3504((((Class306_Sub2)
							   this)
							  .anIntArray9979[15]),
							 aClass418_3353,
							 529995898);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[6],
	     aClass422_3369.aFloat4780, aClass422_3369.aFloat4776,
	     aClass422_3369.aFloat4777, (byte) 101);
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[3]),
							 1, anInterface39_3356,
							 -1098784000);
	method9063(i, 1320919639);
    }
    
    public void method4068(int i) {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[i + 12]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3504((((Class306_Sub2)
							   this)
							  .anIntArray9979[15]),
							 aClass418_3353,
							 1386888199);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[6],
	     aClass422_3369.aFloat4780, aClass422_3369.aFloat4776,
	     aClass422_3369.aFloat4777, (byte) 2);
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[3]),
							 1, anInterface39_3356,
							 -1748978795);
	method9063(i, 1957985112);
    }
    
    public void method4069() {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[17]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	method9063(0, 625898879);
    }
    
    public void method4070() {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[18]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[6],
	     aClass422_3369.aFloat4780, aClass422_3369.aFloat4776,
	     aClass422_3369.aFloat4777, (byte) -73);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[16], aFloat3359, aFloat3360,
	     0.0F, 0.0F, (short) 31676);
	method9063(0, 475816393);
    }
    
    public void method4059(int i) {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[i + 2]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	method9063(i, 1915006156);
    }
    
    public void method4072(boolean bool) {
	if (bool)
	    ((Class306_Sub2) this).aClass258_9970
		.method3488(((Class306_Sub2) this).aClass262Array9984[1]);
	else
	    ((Class306_Sub2) this).aClass258_9970
		.method3488(((Class306_Sub2) this).aClass262Array9984[0]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[2]),
							 0, anInterface34_3355,
							 -2147317849);
	((Class306_Sub2) this).aClass258_9970.method3506
	    (((Class306_Sub2) this).anIntArray9979[4],
	     ((Class306_Sub2) this).aClass418_9989, -1705727687);
	((Class306_Sub2) this).aClass258_9970.method3533((((Class306_Sub2)
							   this)
							  .anIntArray9979[5]),
							 aClass418_3358,
							 -908324200);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[7],
	     aClass425_3361.aFloat4790, aClass425_3361.aFloat4791,
	     aClass425_3361.aFloat4792, aClass425_3361.aFloat4793,
	     (short) 16802);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[8],
	     aClass422_3362.aFloat4780, aClass422_3362.aFloat4776,
	     aClass422_3362.aFloat4777, (byte) -56);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[9],
	     aClass425_3372.aFloat4790, aClass425_3372.aFloat4791,
	     aClass425_3372.aFloat4792, aClass425_3372.aFloat4793,
	     (short) 7467);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[10],
	     aClass422_3368.aFloat4780, aClass422_3368.aFloat4776,
	     aClass422_3368.aFloat4777, (byte) 57);
	aClass173_Sub1_3352.method8563(Class363.aClass363_3839, anInt3370,
				       anInt3354, anInt3351, anInt3373);
    }
    
    public void method4073(boolean bool) {
	if (bool)
	    ((Class306_Sub2) this).aClass258_9970
		.method3488(((Class306_Sub2) this).aClass262Array9984[1]);
	else
	    ((Class306_Sub2) this).aClass258_9970
		.method3488(((Class306_Sub2) this).aClass262Array9984[0]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[2]),
							 0, anInterface34_3355,
							 -1900211757);
	((Class306_Sub2) this).aClass258_9970.method3506
	    (((Class306_Sub2) this).anIntArray9979[4],
	     ((Class306_Sub2) this).aClass418_9989, -647813574);
	((Class306_Sub2) this).aClass258_9970.method3533((((Class306_Sub2)
							   this)
							  .anIntArray9979[5]),
							 aClass418_3358,
							 -908324200);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[7],
	     aClass425_3361.aFloat4790, aClass425_3361.aFloat4791,
	     aClass425_3361.aFloat4792, aClass425_3361.aFloat4793,
	     (short) 2350);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[8],
	     aClass422_3362.aFloat4780, aClass422_3362.aFloat4776,
	     aClass422_3362.aFloat4777, (byte) -84);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[9],
	     aClass425_3372.aFloat4790, aClass425_3372.aFloat4791,
	     aClass425_3372.aFloat4792, aClass425_3372.aFloat4793,
	     (short) 32760);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[10],
	     aClass422_3368.aFloat4780, aClass422_3368.aFloat4776,
	     aClass422_3368.aFloat4777, (byte) -8);
	aClass173_Sub1_3352.method8563(Class363.aClass363_3839, anInt3370,
				       anInt3354, anInt3351, anInt3373);
    }
    
    public void method4074(boolean bool) {
	if (bool)
	    ((Class306_Sub2) this).aClass258_9970
		.method3488(((Class306_Sub2) this).aClass262Array9984[1]);
	else
	    ((Class306_Sub2) this).aClass258_9970
		.method3488(((Class306_Sub2) this).aClass262Array9984[0]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[2]),
							 0, anInterface34_3355,
							 87657316);
	((Class306_Sub2) this).aClass258_9970.method3506
	    (((Class306_Sub2) this).anIntArray9979[4],
	     ((Class306_Sub2) this).aClass418_9989, -274871077);
	((Class306_Sub2) this).aClass258_9970.method3533((((Class306_Sub2)
							   this)
							  .anIntArray9979[5]),
							 aClass418_3358,
							 -908324200);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[7],
	     aClass425_3361.aFloat4790, aClass425_3361.aFloat4791,
	     aClass425_3361.aFloat4792, aClass425_3361.aFloat4793,
	     (short) 14322);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[8],
	     aClass422_3362.aFloat4780, aClass422_3362.aFloat4776,
	     aClass422_3362.aFloat4777, (byte) -9);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[9],
	     aClass425_3372.aFloat4790, aClass425_3372.aFloat4791,
	     aClass425_3372.aFloat4792, aClass425_3372.aFloat4793,
	     (short) 28485);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[10],
	     aClass422_3368.aFloat4780, aClass422_3368.aFloat4776,
	     aClass422_3368.aFloat4777, (byte) -107);
	aClass173_Sub1_3352.method8563(Class363.aClass363_3839, anInt3370,
				       anInt3354, anInt3351, anInt3373);
    }
    
    public void method4066(int i) {
	((Class306_Sub2) this).aClass258_9970
	    .method3488(((Class306_Sub2) this).aClass262Array9984[i + 2]);
	((Class306_Sub2) this).anIntArray9979
	    = (((Class306_Sub2) this).anIntArrayArray9988
	       [((Class306_Sub2) this).aClass258_9970.method3530(-812992221)]);
	((Class306_Sub2) this).aClass258_9970.method3478();
	method9063(i, 711418477);
    }
    
    public Class306_Sub2(Class173_Sub1 class173_sub1) throws Exception_Sub2 {
	super(class173_sub1);
	((Class306_Sub2) this).aClass262Array9984 = new Class262[19];
	((Class306_Sub2) this).anIntArrayArray9988 = new int[19][17];
	method9062(-863631649);
    }
    
    void method9066(int i) {
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[2]),
							 0, anInterface34_3355,
							 -1831589207);
	((Class306_Sub2) this).aClass258_9970.method3506
	    (((Class306_Sub2) this).anIntArray9979[4],
	     ((Class306_Sub2) this).aClass418_9989, -916167871);
	((Class306_Sub2) this).aClass258_9970.method3533((((Class306_Sub2)
							   this)
							  .anIntArray9979[5]),
							 aClass418_3358,
							 -908324200);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[7],
	     aClass425_3361.aFloat4790, aClass425_3361.aFloat4791,
	     aClass425_3361.aFloat4792, aClass425_3361.aFloat4793,
	     (short) 26767);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[8],
	     aClass422_3362.aFloat4780, aClass422_3362.aFloat4776,
	     aClass422_3362.aFloat4777, (byte) 82);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[9],
	     aClass425_3372.aFloat4790, aClass425_3372.aFloat4791,
	     aClass425_3372.aFloat4792, aClass425_3372.aFloat4793,
	     (short) 26761);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[10],
	     aClass422_3368.aFloat4780, aClass422_3368.aFloat4776,
	     aClass422_3368.aFloat4777, (byte) -78);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[11]),
							 aClass422_3365,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[12]),
							 aClass422_3366,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[13]),
							 aClass422_3367,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[14]),
							 aClass422_3363,
							 -1182370236);
	if (i > 0) {
	    ((Class306_Sub2) this).aClass258_9970.method3503
		(((Class306_Sub2) this).anIntArray9979[1], aFloatArray3364,
		 i * 4, 2041557393);
	    ((Class306_Sub2) this).aClass258_9970.method3503
		(((Class306_Sub2) this).anIntArray9979[0], aFloatArray3357,
		 4 * i, 2041557393);
	}
	aClass173_Sub1_3352.method8563(Class363.aClass363_3839, anInt3370,
				       anInt3354, anInt3351, anInt3373);
    }
    
    void method9067(int i) {
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[2]),
							 0, anInterface34_3355,
							 -1756170088);
	((Class306_Sub2) this).aClass258_9970.method3506
	    (((Class306_Sub2) this).anIntArray9979[4],
	     ((Class306_Sub2) this).aClass418_9989, -1776675253);
	((Class306_Sub2) this).aClass258_9970.method3533((((Class306_Sub2)
							   this)
							  .anIntArray9979[5]),
							 aClass418_3358,
							 -908324200);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[7],
	     aClass425_3361.aFloat4790, aClass425_3361.aFloat4791,
	     aClass425_3361.aFloat4792, aClass425_3361.aFloat4793,
	     (short) 24518);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[8],
	     aClass422_3362.aFloat4780, aClass422_3362.aFloat4776,
	     aClass422_3362.aFloat4777, (byte) 34);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[9],
	     aClass425_3372.aFloat4790, aClass425_3372.aFloat4791,
	     aClass425_3372.aFloat4792, aClass425_3372.aFloat4793,
	     (short) 9805);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[10],
	     aClass422_3368.aFloat4780, aClass422_3368.aFloat4776,
	     aClass422_3368.aFloat4777, (byte) -79);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[11]),
							 aClass422_3365,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[12]),
							 aClass422_3366,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[13]),
							 aClass422_3367,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[14]),
							 aClass422_3363,
							 -1182370236);
	if (i > 0) {
	    ((Class306_Sub2) this).aClass258_9970.method3503
		(((Class306_Sub2) this).anIntArray9979[1], aFloatArray3364,
		 i * 4, 2041557393);
	    ((Class306_Sub2) this).aClass258_9970.method3503
		(((Class306_Sub2) this).anIntArray9979[0], aFloatArray3357,
		 4 * i, 2041557393);
	}
	aClass173_Sub1_3352.method8563(Class363.aClass363_3839, anInt3370,
				       anInt3354, anInt3351, anInt3373);
    }
    
    void method9068(int i) {
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[2]),
							 0, anInterface34_3355,
							 1443629038);
	((Class306_Sub2) this).aClass258_9970.method3506
	    (((Class306_Sub2) this).anIntArray9979[4],
	     ((Class306_Sub2) this).aClass418_9989, -1302941792);
	((Class306_Sub2) this).aClass258_9970.method3533((((Class306_Sub2)
							   this)
							  .anIntArray9979[5]),
							 aClass418_3358,
							 -908324200);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[7],
	     aClass425_3361.aFloat4790, aClass425_3361.aFloat4791,
	     aClass425_3361.aFloat4792, aClass425_3361.aFloat4793,
	     (short) 25670);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[8],
	     aClass422_3362.aFloat4780, aClass422_3362.aFloat4776,
	     aClass422_3362.aFloat4777, (byte) -26);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[9],
	     aClass425_3372.aFloat4790, aClass425_3372.aFloat4791,
	     aClass425_3372.aFloat4792, aClass425_3372.aFloat4793,
	     (short) 31447);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[10],
	     aClass422_3368.aFloat4780, aClass422_3368.aFloat4776,
	     aClass422_3368.aFloat4777, (byte) 6);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[11]),
							 aClass422_3365,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[12]),
							 aClass422_3366,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[13]),
							 aClass422_3367,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[14]),
							 aClass422_3363,
							 -1182370236);
	if (i > 0) {
	    ((Class306_Sub2) this).aClass258_9970.method3503
		(((Class306_Sub2) this).anIntArray9979[1], aFloatArray3364,
		 i * 4, 2041557393);
	    ((Class306_Sub2) this).aClass258_9970.method3503
		(((Class306_Sub2) this).anIntArray9979[0], aFloatArray3357,
		 4 * i, 2041557393);
	}
	aClass173_Sub1_3352.method8563(Class363.aClass363_3839, anInt3370,
				       anInt3354, anInt3351, anInt3373);
    }
    
    void method9069(int i) {
	((Class306_Sub2) this).aClass258_9970.method3507((((Class306_Sub2)
							   this)
							  .anIntArray9979[2]),
							 0, anInterface34_3355,
							 594095328);
	((Class306_Sub2) this).aClass258_9970.method3506
	    (((Class306_Sub2) this).anIntArray9979[4],
	     ((Class306_Sub2) this).aClass418_9989, -611427471);
	((Class306_Sub2) this).aClass258_9970.method3533((((Class306_Sub2)
							   this)
							  .anIntArray9979[5]),
							 aClass418_3358,
							 -908324200);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[7],
	     aClass425_3361.aFloat4790, aClass425_3361.aFloat4791,
	     aClass425_3361.aFloat4792, aClass425_3361.aFloat4793,
	     (short) 3372);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[8],
	     aClass422_3362.aFloat4780, aClass422_3362.aFloat4776,
	     aClass422_3362.aFloat4777, (byte) -10);
	((Class306_Sub2) this).aClass258_9970.method3501
	    (((Class306_Sub2) this).anIntArray9979[9],
	     aClass425_3372.aFloat4790, aClass425_3372.aFloat4791,
	     aClass425_3372.aFloat4792, aClass425_3372.aFloat4793,
	     (short) 26868);
	((Class306_Sub2) this).aClass258_9970.method3500
	    (((Class306_Sub2) this).anIntArray9979[10],
	     aClass422_3368.aFloat4780, aClass422_3368.aFloat4776,
	     aClass422_3368.aFloat4777, (byte) 88);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[11]),
							 aClass422_3365,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[12]),
							 aClass422_3366,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[13]),
							 aClass422_3367,
							 -1182370236);
	((Class306_Sub2) this).aClass258_9970.method3502((((Class306_Sub2)
							   this)
							  .anIntArray9979[14]),
							 aClass422_3363,
							 -1182370236);
	if (i > 0) {
	    ((Class306_Sub2) this).aClass258_9970.method3503
		(((Class306_Sub2) this).anIntArray9979[1], aFloatArray3364,
		 i * 4, 2041557393);
	    ((Class306_Sub2) this).aClass258_9970.method3503
		(((Class306_Sub2) this).anIntArray9979[0], aFloatArray3357,
		 4 * i, 2041557393);
	}
	aClass173_Sub1_3352.method8563(Class363.aClass363_3839, anInt3370,
				       anInt3354, anInt3351, anInt3373);
    }
    
    static void method9070(ByteBuffer class528_sub42, int i) {
	for (;;) {
	    int i_54_ = class528_sub42.readUnsignedByte((byte) 53);
	    switch (i_54_) {
	    case 255:
		return;
	    case 0:
		Class185.anInt2108
		    = class528_sub42.readUnsignedShort(-1209690978) * -1868042195;
		Class185.anInt2111
		    = class528_sub42.readUnsignedShort(-321326969) * 728858395;
	    }
	}
    }
    
    public static void method9071(Class446 class446, Class165 class165,
				  Interface22 interface22, int i) {
	Class28.aClass446_304 = class446;
	Class264.aClass165_2865 = class165;
	Class481.anInterface22_5460 = interface22;
    }
}
