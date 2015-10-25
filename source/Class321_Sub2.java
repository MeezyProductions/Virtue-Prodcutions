/* Class321_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class321_Sub2 extends Class321
{
    static final int anInt9994 = 0;
    static final int anInt9995 = 2;
    static final int anInt9996 = 3;
    int[] anIntArray9997;
    static final int anInt9998 = 3;
    static final int anInt9999 = 4;
    static final int anInt10000 = 5;
    static final int anInt10001 = 6;
    static final int anInt10002 = 7;
    static final int anInt10003 = 0;
    static final int anInt10004 = 1;
    static final int anInt10005 = 2;
    Class425 aClass425_10006;
    static final int anInt10007 = 1;
    int[][] anIntArrayArray10008;
    Class425 aClass425_10009;
    Class258 aClass258_10010;
    Class262[] aClass262Array10011 = new Class262[3];
    
    boolean method9072() throws Exception_Sub2 {
	((Class321_Sub2) this).aClass258_10010
	    = aClass173_Sub1_3474.method8580("Sprite");
	Class528_Sub22_Sub1 class528_sub22_sub1
	    = ((Class321_Sub2) this).aClass258_10010.method3498("WVPMatrix",
								-1728513373);
	Class528_Sub22_Sub1 class528_sub22_sub1_0_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("SpriteSampler", -1898517558);
	Class528_Sub22_Sub1 class528_sub22_sub1_1_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("MaskSampler",
								-1851833554);
	Class528_Sub22_Sub1 class528_sub22_sub1_2_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("MulColour",
								-1998151850);
	Class528_Sub22_Sub1 class528_sub22_sub1_3_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("AddColour",
								-2141187632);
	Class528_Sub22_Sub1 class528_sub22_sub1_4_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("SpriteTexCoordMatrix", -1900579249);
	Class528_Sub22_Sub1 class528_sub22_sub1_5_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("MaskTexCoordMatrix", -1561411384);
	((Class321_Sub2) this).aClass262Array10011[0]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("Normal",
								-69601674);
	((Class321_Sub2) this).aClass262Array10011[1]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("Masked",
								-1948242360);
	((Class321_Sub2) this).aClass262Array10011[2]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("AlphaTex",
								-757410056);
	for (int i = 0; i < 3; i++) {
	    int i_6_ = (((Class321_Sub2) this).aClass258_10010.method3540
			(((Class321_Sub2) this).aClass262Array10011[i],
			 (short) 14611));
	    ((Class321_Sub2) this).anIntArrayArray10008[i][0]
		= class528_sub22_sub1.method10441(i_6_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][1]
		= class528_sub22_sub1_0_.method10441(i_6_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][2]
		= class528_sub22_sub1_1_.method10441(i_6_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][5]
		= class528_sub22_sub1_2_.method10441(i_6_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][6]
		= class528_sub22_sub1_3_.method10441(i_6_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][3]
		= class528_sub22_sub1_4_.method10441(i_6_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][4]
		= class528_sub22_sub1_5_.method10441(i_6_);
	}
	((Class321_Sub2) this).aClass258_10010
	    .method3488(((Class321_Sub2) this).aClass262Array10011[0]);
	return true;
    }
    
    boolean method9073(byte i) throws Exception_Sub2 {
	((Class321_Sub2) this).aClass258_10010
	    = aClass173_Sub1_3474.method8580("Sprite");
	Class528_Sub22_Sub1 class528_sub22_sub1
	    = ((Class321_Sub2) this).aClass258_10010.method3498("WVPMatrix",
								-1537569533);
	Class528_Sub22_Sub1 class528_sub22_sub1_7_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("SpriteSampler", -1713358222);
	Class528_Sub22_Sub1 class528_sub22_sub1_8_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("MaskSampler",
								-1791409845);
	Class528_Sub22_Sub1 class528_sub22_sub1_9_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("MulColour",
								-1939032136);
	Class528_Sub22_Sub1 class528_sub22_sub1_10_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("AddColour",
								-1938626168);
	Class528_Sub22_Sub1 class528_sub22_sub1_11_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("SpriteTexCoordMatrix", -2091096537);
	Class528_Sub22_Sub1 class528_sub22_sub1_12_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("MaskTexCoordMatrix", -1859196181);
	((Class321_Sub2) this).aClass262Array10011[0]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("Normal",
								-241931505);
	((Class321_Sub2) this).aClass262Array10011[1]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("Masked",
								-1792372038);
	((Class321_Sub2) this).aClass262Array10011[2]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("AlphaTex",
								137906256);
	for (int i_13_ = 0; i_13_ < 3; i_13_++) {
	    int i_14_ = (((Class321_Sub2) this).aClass258_10010.method3540
			 (((Class321_Sub2) this).aClass262Array10011[i_13_],
			  (short) 270));
	    ((Class321_Sub2) this).anIntArrayArray10008[i_13_][0]
		= class528_sub22_sub1.method10441(i_14_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i_13_][1]
		= class528_sub22_sub1_7_.method10441(i_14_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i_13_][2]
		= class528_sub22_sub1_8_.method10441(i_14_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i_13_][5]
		= class528_sub22_sub1_9_.method10441(i_14_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i_13_][6]
		= class528_sub22_sub1_10_.method10441(i_14_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i_13_][3]
		= class528_sub22_sub1_11_.method10441(i_14_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i_13_][4]
		= class528_sub22_sub1_12_.method10441(i_14_);
	}
	((Class321_Sub2) this).aClass258_10010
	    .method3488(((Class321_Sub2) this).aClass262Array10011[0]);
	return true;
    }
    
    public void method4204(int i, int i_15_) {
	switch (i) {
	case 3:
	    ((Class321_Sub2) this).aClass425_10006
		.method5122(0xffffff | i_15_ & ~0xffffff);
	    ((Class321_Sub2) this).aClass425_10009
		.method5122(i_15_ & 0xffffff);
	    break;
	case 2:
	    ((Class321_Sub2) this).aClass425_10006.method5122(i_15_);
	    ((Class321_Sub2) this).aClass425_10009.method5122(0);
	    break;
	case 0:
	    ((Class321_Sub2) this).aClass425_10006.method5122(i_15_);
	    ((Class321_Sub2) this).aClass425_10009.method5122(0);
	    break;
	case 1:
	    ((Class321_Sub2) this).aClass425_10006.method5122(-1);
	    ((Class321_Sub2) this).aClass425_10009.method5122(0);
	    break;
	case 4:
	    ((Class321_Sub2) this).aClass425_10006.method5122(-1);
	    ((Class321_Sub2) this).aClass425_10009.method5122(i_15_);
	    ((Class321_Sub2) this).aClass425_10009.method5137();
	    break;
	}
    }
    
    void method9074(int i) {
	((Class321_Sub2) this).aClass258_10010.method3507
	    (((Class321_Sub2) this).anIntArray9997[1], 0, anInterface34_3472,
	     827013500);
	aClass173_Sub1_3474.method8618(aClass418_3470);
	((Class321_Sub2) this).aClass258_10010.method3506((((Class321_Sub2)
							    this)
							   .anIntArray9997[0]),
							  aClass418_3470,
							  -993320554);
	((Class321_Sub2) this).aClass258_10010.method3533((((Class321_Sub2)
							    this)
							   .anIntArray9997[3]),
							  aClass418_3471,
							  -908324200);
	((Class321_Sub2) this).aClass258_10010.method3501
	    (((Class321_Sub2) this).anIntArray9997[5],
	     ((Class321_Sub2) this).aClass425_10006.aFloat4790,
	     ((Class321_Sub2) this).aClass425_10006.aFloat4791,
	     ((Class321_Sub2) this).aClass425_10006.aFloat4792,
	     ((Class321_Sub2) this).aClass425_10006.aFloat4793, (short) 31261);
	((Class321_Sub2) this).aClass258_10010.method3501
	    (((Class321_Sub2) this).anIntArray9997[6],
	     ((Class321_Sub2) this).aClass425_10009.aFloat4790,
	     ((Class321_Sub2) this).aClass425_10009.aFloat4791,
	     ((Class321_Sub2) this).aClass425_10009.aFloat4792,
	     ((Class321_Sub2) this).aClass425_10009.aFloat4793, (short) 24158);
	aClass173_Sub1_3474.method8553(0, anInterface36_3473);
	aClass173_Sub1_3474.method8552(aClass344_3468);
	aClass173_Sub1_3474.method8561(Class363.aClass363_3837, anInt3467, 2);
    }
    
    public Class321_Sub2(Class173_Sub1 class173_sub1) throws Exception_Sub2 {
	super(class173_sub1);
	((Class321_Sub2) this).anIntArrayArray10008 = new int[3][7];
	((Class321_Sub2) this).aClass425_10006
	    = new Class425(1.0F, 1.0F, 1.0F, 1.0F);
	((Class321_Sub2) this).aClass425_10009
	    = new Class425(0.0F, 0.0F, 0.0F, 0.0F);
	method9073((byte) 112);
    }
    
    public void method4207() {
	((Class321_Sub2) this).aClass258_10010
	    .method3488(((Class321_Sub2) this).aClass262Array10011[1]);
	((Class321_Sub2) this).aClass258_10010.method3478();
	((Class321_Sub2) this).anIntArray9997
	    = (((Class321_Sub2) this).anIntArrayArray10008
	       [((Class321_Sub2) this).aClass258_10010
		    .method3530(-812992221)]);
	((Class321_Sub2) this).aClass258_10010.method3507
	    (((Class321_Sub2) this).anIntArray9997[2], 1, anInterface34_3469,
	     -1815498777);
	((Class321_Sub2) this).aClass258_10010.method3533((((Class321_Sub2)
							    this)
							   .anIntArray9997[4]),
							  aClass418_3475,
							  -908324200);
	method9074(513666424);
    }
    
    public void method4209(int i, int i_16_) {
	switch (i) {
	case 3:
	    ((Class321_Sub2) this).aClass425_10006
		.method5122(0xffffff | i_16_ & ~0xffffff);
	    ((Class321_Sub2) this).aClass425_10009
		.method5122(i_16_ & 0xffffff);
	    break;
	case 2:
	    ((Class321_Sub2) this).aClass425_10006.method5122(i_16_);
	    ((Class321_Sub2) this).aClass425_10009.method5122(0);
	    break;
	case 0:
	    ((Class321_Sub2) this).aClass425_10006.method5122(i_16_);
	    ((Class321_Sub2) this).aClass425_10009.method5122(0);
	    break;
	case 1:
	    ((Class321_Sub2) this).aClass425_10006.method5122(-1);
	    ((Class321_Sub2) this).aClass425_10009.method5122(0);
	    break;
	case 4:
	    ((Class321_Sub2) this).aClass425_10006.method5122(-1);
	    ((Class321_Sub2) this).aClass425_10009.method5122(i_16_);
	    ((Class321_Sub2) this).aClass425_10009.method5137();
	    break;
	}
    }
    
    public void method4205() {
	((Class321_Sub2) this).aClass258_10010
	    .method3488(((Class321_Sub2) this).aClass262Array10011[0]);
	((Class321_Sub2) this).aClass258_10010.method3478();
	((Class321_Sub2) this).anIntArray9997
	    = (((Class321_Sub2) this).anIntArrayArray10008
	       [((Class321_Sub2) this).aClass258_10010
		    .method3530(-812992221)]);
	method9074(513666424);
    }
    
    public void method4206() {
	((Class321_Sub2) this).aClass258_10010
	    .method3488(((Class321_Sub2) this).aClass262Array10011[0]);
	((Class321_Sub2) this).aClass258_10010.method3478();
	((Class321_Sub2) this).anIntArray9997
	    = (((Class321_Sub2) this).anIntArrayArray10008
	       [((Class321_Sub2) this).aClass258_10010
		    .method3530(-812992221)]);
	method9074(513666424);
    }
    
    boolean method9075() throws Exception_Sub2 {
	((Class321_Sub2) this).aClass258_10010
	    = aClass173_Sub1_3474.method8580("Sprite");
	Class528_Sub22_Sub1 class528_sub22_sub1
	    = ((Class321_Sub2) this).aClass258_10010.method3498("WVPMatrix",
								-1603636228);
	Class528_Sub22_Sub1 class528_sub22_sub1_17_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("SpriteSampler", -2011855520);
	Class528_Sub22_Sub1 class528_sub22_sub1_18_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("MaskSampler",
								-1763417760);
	Class528_Sub22_Sub1 class528_sub22_sub1_19_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("MulColour",
								-2000558880);
	Class528_Sub22_Sub1 class528_sub22_sub1_20_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("AddColour",
								-1875363053);
	Class528_Sub22_Sub1 class528_sub22_sub1_21_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("SpriteTexCoordMatrix", -1896356472);
	Class528_Sub22_Sub1 class528_sub22_sub1_22_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("MaskTexCoordMatrix", -1623492336);
	((Class321_Sub2) this).aClass262Array10011[0]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("Normal",
								208682578);
	((Class321_Sub2) this).aClass262Array10011[1]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("Masked",
								-280961142);
	((Class321_Sub2) this).aClass262Array10011[2]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("AlphaTex",
								-1040349830);
	for (int i = 0; i < 3; i++) {
	    int i_23_ = (((Class321_Sub2) this).aClass258_10010.method3540
			 (((Class321_Sub2) this).aClass262Array10011[i],
			  (short) 21018));
	    ((Class321_Sub2) this).anIntArrayArray10008[i][0]
		= class528_sub22_sub1.method10441(i_23_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][1]
		= class528_sub22_sub1_17_.method10441(i_23_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][2]
		= class528_sub22_sub1_18_.method10441(i_23_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][5]
		= class528_sub22_sub1_19_.method10441(i_23_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][6]
		= class528_sub22_sub1_20_.method10441(i_23_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][3]
		= class528_sub22_sub1_21_.method10441(i_23_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][4]
		= class528_sub22_sub1_22_.method10441(i_23_);
	}
	((Class321_Sub2) this).aClass258_10010
	    .method3488(((Class321_Sub2) this).aClass262Array10011[0]);
	return true;
    }
    
    boolean method9076() throws Exception_Sub2 {
	((Class321_Sub2) this).aClass258_10010
	    = aClass173_Sub1_3474.method8580("Sprite");
	Class528_Sub22_Sub1 class528_sub22_sub1
	    = ((Class321_Sub2) this).aClass258_10010.method3498("WVPMatrix",
								-1713503246);
	Class528_Sub22_Sub1 class528_sub22_sub1_24_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("SpriteSampler", -1810717802);
	Class528_Sub22_Sub1 class528_sub22_sub1_25_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("MaskSampler",
								-1729124866);
	Class528_Sub22_Sub1 class528_sub22_sub1_26_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("MulColour",
								-1685446905);
	Class528_Sub22_Sub1 class528_sub22_sub1_27_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("AddColour",
								-1808860780);
	Class528_Sub22_Sub1 class528_sub22_sub1_28_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("SpriteTexCoordMatrix", -1829779831);
	Class528_Sub22_Sub1 class528_sub22_sub1_29_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("MaskTexCoordMatrix", -1736859982);
	((Class321_Sub2) this).aClass262Array10011[0]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("Normal",
								-1366480084);
	((Class321_Sub2) this).aClass262Array10011[1]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("Masked",
								-494818959);
	((Class321_Sub2) this).aClass262Array10011[2]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("AlphaTex",
								40439995);
	for (int i = 0; i < 3; i++) {
	    int i_30_ = (((Class321_Sub2) this).aClass258_10010.method3540
			 (((Class321_Sub2) this).aClass262Array10011[i],
			  (short) 9032));
	    ((Class321_Sub2) this).anIntArrayArray10008[i][0]
		= class528_sub22_sub1.method10441(i_30_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][1]
		= class528_sub22_sub1_24_.method10441(i_30_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][2]
		= class528_sub22_sub1_25_.method10441(i_30_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][5]
		= class528_sub22_sub1_26_.method10441(i_30_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][6]
		= class528_sub22_sub1_27_.method10441(i_30_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][3]
		= class528_sub22_sub1_28_.method10441(i_30_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][4]
		= class528_sub22_sub1_29_.method10441(i_30_);
	}
	((Class321_Sub2) this).aClass258_10010
	    .method3488(((Class321_Sub2) this).aClass262Array10011[0]);
	return true;
    }
    
    boolean method9077() throws Exception_Sub2 {
	((Class321_Sub2) this).aClass258_10010
	    = aClass173_Sub1_3474.method8580("Sprite");
	Class528_Sub22_Sub1 class528_sub22_sub1
	    = ((Class321_Sub2) this).aClass258_10010.method3498("WVPMatrix",
								-1553854886);
	Class528_Sub22_Sub1 class528_sub22_sub1_31_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("SpriteSampler", -1739957717);
	Class528_Sub22_Sub1 class528_sub22_sub1_32_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("MaskSampler",
								-1907525150);
	Class528_Sub22_Sub1 class528_sub22_sub1_33_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("MulColour",
								-1710808034);
	Class528_Sub22_Sub1 class528_sub22_sub1_34_
	    = ((Class321_Sub2) this).aClass258_10010.method3498("AddColour",
								-1988901885);
	Class528_Sub22_Sub1 class528_sub22_sub1_35_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("SpriteTexCoordMatrix", -2013307373);
	Class528_Sub22_Sub1 class528_sub22_sub1_36_
	    = ((Class321_Sub2) this).aClass258_10010
		  .method3498("MaskTexCoordMatrix", -1563107107);
	((Class321_Sub2) this).aClass262Array10011[0]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("Normal",
								17203412);
	((Class321_Sub2) this).aClass262Array10011[1]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("Masked",
								90445283);
	((Class321_Sub2) this).aClass262Array10011[2]
	    = ((Class321_Sub2) this).aClass258_10010.method3483("AlphaTex",
								207171648);
	for (int i = 0; i < 3; i++) {
	    int i_37_ = (((Class321_Sub2) this).aClass258_10010.method3540
			 (((Class321_Sub2) this).aClass262Array10011[i],
			  (short) 26851));
	    ((Class321_Sub2) this).anIntArrayArray10008[i][0]
		= class528_sub22_sub1.method10441(i_37_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][1]
		= class528_sub22_sub1_31_.method10441(i_37_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][2]
		= class528_sub22_sub1_32_.method10441(i_37_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][5]
		= class528_sub22_sub1_33_.method10441(i_37_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][6]
		= class528_sub22_sub1_34_.method10441(i_37_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][3]
		= class528_sub22_sub1_35_.method10441(i_37_);
	    ((Class321_Sub2) this).anIntArrayArray10008[i][4]
		= class528_sub22_sub1_36_.method10441(i_37_);
	}
	((Class321_Sub2) this).aClass258_10010
	    .method3488(((Class321_Sub2) this).aClass262Array10011[0]);
	return true;
    }
    
    void method9078() {
	((Class321_Sub2) this).aClass258_10010.method3507
	    (((Class321_Sub2) this).anIntArray9997[1], 0, anInterface34_3472,
	     -453073098);
	aClass173_Sub1_3474.method8618(aClass418_3470);
	((Class321_Sub2) this).aClass258_10010.method3506((((Class321_Sub2)
							    this)
							   .anIntArray9997[0]),
							  aClass418_3470,
							  -1863613875);
	((Class321_Sub2) this).aClass258_10010.method3533((((Class321_Sub2)
							    this)
							   .anIntArray9997[3]),
							  aClass418_3471,
							  -908324200);
	((Class321_Sub2) this).aClass258_10010.method3501
	    (((Class321_Sub2) this).anIntArray9997[5],
	     ((Class321_Sub2) this).aClass425_10006.aFloat4790,
	     ((Class321_Sub2) this).aClass425_10006.aFloat4791,
	     ((Class321_Sub2) this).aClass425_10006.aFloat4792,
	     ((Class321_Sub2) this).aClass425_10006.aFloat4793, (short) 15159);
	((Class321_Sub2) this).aClass258_10010.method3501
	    (((Class321_Sub2) this).anIntArray9997[6],
	     ((Class321_Sub2) this).aClass425_10009.aFloat4790,
	     ((Class321_Sub2) this).aClass425_10009.aFloat4791,
	     ((Class321_Sub2) this).aClass425_10009.aFloat4792,
	     ((Class321_Sub2) this).aClass425_10009.aFloat4793, (short) 3001);
	aClass173_Sub1_3474.method8553(0, anInterface36_3473);
	aClass173_Sub1_3474.method8552(aClass344_3468);
	aClass173_Sub1_3474.method8561(Class363.aClass363_3837, anInt3467, 2);
    }
    
    void method9079() {
	((Class321_Sub2) this).aClass258_10010.method3507
	    (((Class321_Sub2) this).anIntArray9997[1], 0, anInterface34_3472,
	     224673752);
	aClass173_Sub1_3474.method8618(aClass418_3470);
	((Class321_Sub2) this).aClass258_10010.method3506((((Class321_Sub2)
							    this)
							   .anIntArray9997[0]),
							  aClass418_3470,
							  -306586530);
	((Class321_Sub2) this).aClass258_10010.method3533((((Class321_Sub2)
							    this)
							   .anIntArray9997[3]),
							  aClass418_3471,
							  -908324200);
	((Class321_Sub2) this).aClass258_10010.method3501
	    (((Class321_Sub2) this).anIntArray9997[5],
	     ((Class321_Sub2) this).aClass425_10006.aFloat4790,
	     ((Class321_Sub2) this).aClass425_10006.aFloat4791,
	     ((Class321_Sub2) this).aClass425_10006.aFloat4792,
	     ((Class321_Sub2) this).aClass425_10006.aFloat4793, (short) 5605);
	((Class321_Sub2) this).aClass258_10010.method3501
	    (((Class321_Sub2) this).anIntArray9997[6],
	     ((Class321_Sub2) this).aClass425_10009.aFloat4790,
	     ((Class321_Sub2) this).aClass425_10009.aFloat4791,
	     ((Class321_Sub2) this).aClass425_10009.aFloat4792,
	     ((Class321_Sub2) this).aClass425_10009.aFloat4793, (short) 21470);
	aClass173_Sub1_3474.method8553(0, anInterface36_3473);
	aClass173_Sub1_3474.method8552(aClass344_3468);
	aClass173_Sub1_3474.method8561(Class363.aClass363_3837, anInt3467, 2);
    }
    
    public void method4208() {
	((Class321_Sub2) this).aClass258_10010
	    .method3488(((Class321_Sub2) this).aClass262Array10011[1]);
	((Class321_Sub2) this).aClass258_10010.method3478();
	((Class321_Sub2) this).anIntArray9997
	    = (((Class321_Sub2) this).anIntArrayArray10008
	       [((Class321_Sub2) this).aClass258_10010
		    .method3530(-812992221)]);
	((Class321_Sub2) this).aClass258_10010.method3507
	    (((Class321_Sub2) this).anIntArray9997[2], 1, anInterface34_3469,
	     1073287299);
	((Class321_Sub2) this).aClass258_10010.method3533((((Class321_Sub2)
							    this)
							   .anIntArray9997[4]),
							  aClass418_3475,
							  -908324200);
	method9074(513666424);
    }
    
    static final void method9080(int i, int i_38_, int i_39_, int i_40_,
				 int i_41_, int i_42_, byte i_43_) {
	for (Class511_Sub6 class511_sub6
		 = ((Class511_Sub6)
		    client.aClass695_11045.method8177(-2118860909));
	     class511_sub6 != null;
	     class511_sub6 = ((Class511_Sub6)
			      client.aClass695_11045.method8184(-743905093))) {
	    if (client.anInt11127
		>= -2063601565 * ((Class511_Sub6) class511_sub6).anInt10308)
		class511_sub6.method6259(1571332956);
	    else {
		Class448.method5410
		    (((Class511_Sub6) class511_sub6).anInt10304 * -2056607339,
		     256 + ((-1544262239
			     * ((Class511_Sub6) class511_sub6).anInt10310)
			    << 9),
		     256 + ((1976037639
			     * ((Class511_Sub6) class511_sub6).anInt10306)
			    << 9),
		     0, ((Class511_Sub6) class511_sub6).anInt10307 * 158386470,
		     false, false, -431419824);
		Class176.aClass172_2027.method2130
		    (((Class511_Sub6) class511_sub6).aString10305,
		     (int) (client.aFloatArray10888[0] + (float) i),
		     (int) (client.aFloatArray10888[1] + (float) i_38_),
		     ~0xffffff | (((Class511_Sub6) class511_sub6).anInt10309
				  * -2062173197),
		     0, (byte) 0);
	    }
	}
    }
    
    public static boolean method9081(int i, int i_44_) {
	return i == 0 || i == 1 || 2 == i;
    }
}
