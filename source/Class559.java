/* Class559 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class559
{
    int[][][] anIntArrayArrayArray7480;
    static Class173 aClass173_7481;
    static final int anInt7482 = 10;
    static final float aFloat7483 = 3.0F;
    int anInt7484;
    Class538 aClass538_7485;
    int anInt7486;
    boolean aBool7487;
    boolean aBool7488;
    int anInt7489;
    Class541[] aClass541Array7490;
    public boolean aBool7491 = true;
    static final int anInt7492 = 102;
    int anInt7493;
    Class541[] aClass541Array7494;
    int anInt7495;
    Class541[] aClass541Array7496;
    int anInt7497;
    Class541[] aClass541Array7498;
    int anInt7499;
    int[] anIntArray7500;
    int[] anIntArray7501;
    int[] anIntArray7502;
    int[] anIntArray7503;
    int[] anIntArray7504;
    int[] anIntArray7505;
    float[] aFloatArray7506;
    int[] anIntArray7507;
    int anInt7508;
    Class545 aClass545_7509;
    boolean aBool7510;
    
    final boolean method6777(Class554 class554) {
	if (class554 == null)
	    return false;
	return method6787(((Class554) class554).anInt7438,
			  ((Class554) class554).anInt7443,
			  ((Class554) class554).anInt7441,
			  (((Class554) class554).anInt7442
			   - ((Class554) class554).anInt7438),
			  (((Class554) class554).anInt7444
			   - ((Class554) class554).anInt7443),
			  (((Class554) class554).anInt7446
			   - ((Class554) class554).anInt7441));
    }
    
    void method6778() {
	for (int i = 0; i < ((Class559) this).anInt7493; i++)
	    ((Class559) this).aClass541Array7494[i] = null;
	((Class559) this).anInt7493 = 0;
	for (int i = 0;
	     i < ((Class559) this).aClass538_7485.anInt7184 * -353005885;
	     i++) {
	    for (int i_0_ = 0;
		 (i_0_
		  < ((Class559) this).aClass538_7485.anInt7158 * -1102718643);
		 i_0_++) {
		for (int i_1_ = 0;
		     i_1_ < (((Class559) this).aClass538_7485.anInt7159
			     * -532233529);
		     i_1_++) {
		    Class546 class546
			= (((Class559) this).aClass538_7485
			   .aClass546ArrayArrayArray7160[i][i_1_][i_0_]);
		    if (class546 != null) {
			if (((Class546) class546).aShort7391 > 0)
			    ((Class546) class546).aShort7391 *= -1;
			if (((Class546) class546).aShort7400 > 0)
			    ((Class546) class546).aShort7400 *= -1;
		    }
		}
	    }
	}
	for (int i = 0;
	     i < ((Class559) this).aClass538_7485.anInt7184 * -353005885;
	     i++) {
	    for (int i_2_ = 0;
		 (i_2_
		  < ((Class559) this).aClass538_7485.anInt7158 * -1102718643);
		 i_2_++) {
		for (int i_3_ = 0;
		     i_3_ < (((Class559) this).aClass538_7485.anInt7159
			     * -532233529);
		     i_3_++) {
		    Class546 class546
			= (((Class559) this).aClass538_7485
			   .aClass546ArrayArrayArray7160[i][i_3_][i_2_]);
		    if (class546 != null) {
			boolean bool
			    = (((((Class559) this).aClass538_7485
				 .aClass546ArrayArrayArray7160[0][i_3_][i_2_])
				!= null)
			       && (((Class559) this).aClass538_7485
				   .aClass546ArrayArrayArray7160[0][i_3_][i_2_]
				   .aClass546_7392) != null);
			if (((Class546) class546).aShort7391 < 0) {
			    int i_4_ = i_2_;
			    int i_5_ = i_2_;
			    int i_6_ = i;
			    int i_7_ = i;
			    Class546 class546_8_
				= (((Class559) this).aClass538_7485
				   .aClass546ArrayArrayArray7160[i][i_3_]
				   [i_4_ - 1]);
			    int i_9_;
			    for (i_9_ = ((Class559) this).aClass538_7485
					    .aClass137Array7163[i]
					    .method1669(i_3_, i_2_, (byte) 0);
				 (i_4_ > 0 && class546_8_ != null
				  && ((Class546) class546_8_).aShort7391 < 0
				  && (((Class546) class546_8_).aShort7391
				      == ((Class546) class546).aShort7391)
				  && (((Class546) class546_8_).aShort7401
				      == ((Class546) class546).aShort7401)
				  && i_9_ == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_3_, i_4_ - 1, (byte) 0))
				  && (i_4_ - 1 <= 0
				      || i_9_ == (((Class559) this)
						      .aClass538_7485
						      .aClass137Array7163[i]
						      .method1669
						  (i_3_, i_4_ - 2, (byte) 0)))
				  && i_5_ - i_4_ <= 10);
				 class546_8_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i][i_3_]
					[i_4_ - 1]))
				i_4_--;
			    for (class546_8_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i][i_3_]
					[i_5_ + 1]);
				 (i_5_ < (((Class559) this).aClass538_7485
					  .anInt7159) * -532233529
				  && class546_8_ != null
				  && ((Class546) class546_8_).aShort7391 < 0
				  && (((Class546) class546_8_).aShort7391
				      == ((Class546) class546).aShort7391)
				  && (((Class546) class546_8_).aShort7401
				      == ((Class546) class546).aShort7401)
				  && i_9_ == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_3_, i_5_ + 1, (byte) 0))
				  && (i_5_ + 1 >= ((((Class559) this)
						    .aClass538_7485.anInt7159)
						   * -532233529)
				      || i_9_ == (((Class559) this)
						      .aClass538_7485
						      .aClass137Array7163[i]
						      .method1669
						  (i_3_, i_5_ + 2, (byte) 0)))
				  && i_5_ - i_4_ <= 10);
				 class546_8_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i][i_3_]
					[i_5_ + 1]))
				i_5_++;
			    int i_10_ = i_7_ - i_6_ + 1;
			    int i_11_ = ((Class559) this).aClass538_7485
					    .aClass137Array7163
					    [bool ? i_6_ + 1 : i_6_]
					    .method1669(i_3_, i_4_, (byte) 0);
			    int i_12_
				= (i_11_
				   + ((Class546) class546).aShort7391 * i_10_);
			    int i_13_
				= ((Class559) this).aClass538_7485
				      .aClass137Array7163
				      [bool ? i_6_ + 1 : i_6_]
				      .method1669(i_3_, i_5_ + 1, (byte) 0);
			    int i_14_
				= (i_13_
				   + ((Class546) class546).aShort7391 * i_10_);
			    int i_15_
				= i_3_ << (((Class559) this).aClass538_7485
					   .anInt7148) * -1532596617;
			    int i_16_
				= i_4_ << (((Class559) this).aClass538_7485
					   .anInt7148) * -1532596617;
			    int i_17_
				= ((i_5_ << (((Class559) this).aClass538_7485
					     .anInt7148) * -1532596617)
				   + (((Class538) (((Class559) this)
						   .aClass538_7485)).anInt7169
				      * 198274565));
			    ((Class559) this).aClass541Array7494
				[((Class559) this).anInt7493++]
				= (new Class541
				   (((Class559) this).aClass538_7485, 1, i_7_,
				    i_15_ + ((Class546) class546).aShort7401,
				    i_15_ + ((Class546) class546).aShort7401,
				    i_15_ + ((Class546) class546).aShort7401,
				    i_15_ + ((Class546) class546).aShort7401,
				    i_11_, i_13_, i_14_, i_12_, i_16_, i_17_,
				    i_17_, i_16_));
			    for (int i_18_ = i_6_; i_18_ <= i_7_; i_18_++) {
				for (int i_19_ = i_4_; i_19_ <= i_5_; i_19_++)
				    ((Class546)
				     (((Class559) this).aClass538_7485
				      .aClass546ArrayArrayArray7160[i_18_]
				      [i_3_][i_19_])).aShort7391
					*= -1;
			    }
			}
			if (((Class546) class546).aShort7400 < 0) {
			    int i_20_ = i_3_;
			    int i_21_ = i_3_;
			    int i_22_ = i;
			    int i_23_ = i;
			    Class546 class546_24_
				= (((Class559) this).aClass538_7485
				   .aClass546ArrayArrayArray7160[i][i_20_ - 1]
				   [i_2_]);
			    int i_25_;
			    for (i_25_ = ((Class559) this).aClass538_7485
					     .aClass137Array7163[i]
					     .method1669(i_3_, i_2_, (byte) 0);
				 (i_20_ > 0 && class546_24_ != null
				  && ((Class546) class546_24_).aShort7400 < 0
				  && (((Class546) class546_24_).aShort7400
				      == ((Class546) class546).aShort7400)
				  && (((Class546) class546_24_).aShort7403
				      == ((Class546) class546).aShort7403)
				  && i_25_ == (((Class559) this)
						   .aClass538_7485
						   .aClass137Array7163[i]
						   .method1669
					       (i_20_ - 1, i_2_, (byte) 0))
				  && (i_20_ - 1 <= 0
				      || (i_25_
					  == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_20_ - 2, i_2_, (byte) 0))))
				  && i_21_ - i_20_ <= 10);
				 class546_24_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_20_ - 1][i_2_]))
				i_20_--;
			    for (class546_24_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_21_ + 1][i_2_]);
				 (i_21_ < (((Class559) this).aClass538_7485
					   .anInt7158) * -1102718643
				  && class546_24_ != null
				  && ((Class546) class546_24_).aShort7400 < 0
				  && (((Class546) class546_24_).aShort7400
				      == ((Class546) class546).aShort7400)
				  && (((Class546) class546_24_).aShort7403
				      == ((Class546) class546).aShort7403)
				  && i_25_ == (((Class559) this)
						   .aClass538_7485
						   .aClass137Array7163[i]
						   .method1669
					       (i_21_ + 1, i_2_, (byte) 0))
				  && (i_21_ + 1 >= ((((Class559) this)
						     .aClass538_7485.anInt7158)
						    * -1102718643)
				      || (i_25_
					  == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_21_ + 2, i_2_, (byte) 0))))
				  && i_21_ - i_20_ <= 10);
				 class546_24_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_21_ + 1][i_2_]))
				i_21_++;
			    int i_26_ = i_23_ - i_22_ + 1;
			    int i_27_ = ((Class559) this).aClass538_7485
					    .aClass137Array7163
					    [bool ? i_22_ + 1 : i_22_]
					    .method1669(i_20_, i_2_, (byte) 0);
			    int i_28_
				= (i_27_
				   + ((Class546) class546).aShort7400 * i_26_);
			    int i_29_
				= ((Class559) this).aClass538_7485
				      .aClass137Array7163
				      [bool ? i_22_ + 1 : i_22_]
				      .method1669(i_21_ + 1, i_2_, (byte) 0);
			    int i_30_
				= (i_29_
				   + ((Class546) class546).aShort7400 * i_26_);
			    int i_31_
				= i_20_ << (((Class559) this).aClass538_7485
					    .anInt7148) * -1532596617;
			    int i_32_
				= ((i_21_ << (((Class559) this).aClass538_7485
					      .anInt7148) * -1532596617)
				   + (((Class538) (((Class559) this)
						   .aClass538_7485)).anInt7169
				      * 198274565));
			    int i_33_
				= i_2_ << (((Class559) this).aClass538_7485
					   .anInt7148) * -1532596617;
			    ((Class559) this).aClass541Array7494
				[((Class559) this).anInt7493++]
				= (new Class541
				   (((Class559) this).aClass538_7485, 2, i_23_,
				    i_31_, i_32_, i_32_, i_31_, i_27_, i_29_,
				    i_30_, i_28_,
				    i_33_ + ((Class546) class546).aShort7403,
				    i_33_ + ((Class546) class546).aShort7403,
				    i_33_ + ((Class546) class546).aShort7403,
				    i_33_ + ((Class546) class546).aShort7403));
			    for (int i_34_ = i_22_; i_34_ <= i_23_; i_34_++) {
				for (int i_35_ = i_20_; i_35_ <= i_21_;
				     i_35_++)
				    ((Class546)
				     (((Class559) this).aClass538_7485
				      .aClass546ArrayArrayArray7160[i_34_]
				      [i_35_][i_2_])).aShort7400
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	((Class559) this).aBool7487 = true;
    }
    
    void method6779(Class173 class173, int i) {
	aClass173_7481 = class173;
	if (!aBool7491 || !((Class559) this).aBool7488)
	    ((Class559) this).anInt7497 = 0;
	else {
	    if (((Class559) this).aBool7510)
		((Class538) ((Class559) this).aClass538_7485).aClass60_7153
		    .method1000(-572324145);
	    aClass173_7481.method2183(((Class559) this).anIntArray7507);
	    if ((((Class559) this).anInt7508
		 != (int) ((float) ((Class559) this).anIntArray7507[0] / 3.0F))
		|| (((Class559) this).anInt7489
		    != (int) ((float) ((Class559) this).anIntArray7507[1]
			      / 3.0F))) {
		((Class559) this).anInt7508
		    = (int) ((float) ((Class559) this).anIntArray7507[0]
			     / 3.0F);
		((Class559) this).anInt7489
		    = (int) ((float) ((Class559) this).anIntArray7507[1]
			     / 3.0F);
		((Class559) this).anIntArray7504
		    = new int[(((Class559) this).anInt7508
			       * ((Class559) this).anInt7489)];
	    }
	    ((Class559) this).anInt7497 = 0;
	    for (int i_36_ = 0; i_36_ < ((Class559) this).anInt7484; i_36_++)
		method6780(aClass173_7481,
			   ((Class559) this).aClass541Array7490[i_36_], i);
	    for (int i_37_ = 0; i_37_ < ((Class559) this).anInt7493; i_37_++)
		method6780(aClass173_7481,
			   ((Class559) this).aClass541Array7494[i_37_], i);
	    for (int i_38_ = 0; i_38_ < ((Class559) this).anInt7495; i_38_++)
		method6780(aClass173_7481,
			   ((Class559) this).aClass541Array7496[i_38_], i);
	    ((Class545) ((Class559) this).aClass545_7509).anInt7387 = 0;
	    if (((Class559) this).anInt7497 > 0) {
		int i_39_ = ((Class559) this).anIntArray7504.length;
		int i_40_ = i_39_ - i_39_ & 0x7;
		int i_41_ = 0;
		while (i_41_ < i_40_) {
		    ((Class559) this).anIntArray7504[i_41_++] = 2147483647;
		    ((Class559) this).anIntArray7504[i_41_++] = 2147483647;
		    ((Class559) this).anIntArray7504[i_41_++] = 2147483647;
		    ((Class559) this).anIntArray7504[i_41_++] = 2147483647;
		    ((Class559) this).anIntArray7504[i_41_++] = 2147483647;
		    ((Class559) this).anIntArray7504[i_41_++] = 2147483647;
		    ((Class559) this).anIntArray7504[i_41_++] = 2147483647;
		    ((Class559) this).anIntArray7504[i_41_++] = 2147483647;
		}
		while (i_41_ < i_39_)
		    ((Class559) this).anIntArray7504[i_41_++] = 2147483647;
		((Class545) ((Class559) this).aClass545_7509).anInt7383 = 1;
		for (int i_42_ = 0; i_42_ < ((Class559) this).anInt7497;
		     i_42_++) {
		    Class541 class541
			= ((Class559) this).aClass541Array7498[i_42_];
		    ((Class559) this).aClass545_7509.method6661
			(((Class541) class541).aShortArray7226[0],
			 ((Class541) class541).aShortArray7226[1],
			 ((Class541) class541).aShortArray7226[3],
			 ((Class541) class541).aShortArray7233[0],
			 ((Class541) class541).aShortArray7233[1],
			 ((Class541) class541).aShortArray7233[3],
			 ((Class541) class541).aShortArray7237[0],
			 ((Class541) class541).aShortArray7237[1],
			 ((Class541) class541).aShortArray7237[3]);
		    ((Class559) this).aClass545_7509.method6661
			(((Class541) class541).aShortArray7226[1],
			 ((Class541) class541).aShortArray7226[2],
			 ((Class541) class541).aShortArray7226[3],
			 ((Class541) class541).aShortArray7233[1],
			 ((Class541) class541).aShortArray7233[2],
			 ((Class541) class541).aShortArray7233[3],
			 ((Class541) class541).aShortArray7237[1],
			 ((Class541) class541).aShortArray7237[2],
			 ((Class541) class541).aShortArray7237[3]);
		}
		((Class545) ((Class559) this).aClass545_7509).anInt7383 = 2;
	    }
	    if (((Class559) this).aBool7510)
		((Class538) ((Class559) this).aClass538_7485).aClass60_7153
		    .method1000(-572324145);
	}
    }
    
    void method6780(Class173 class173, Class541 class541, int i) {
	aClass173_7481 = class173;
	if (((Class559) this).anIntArray7505 != null
	    && ((Class541) class541).aByte7227 >= i) {
	    for (int i_43_ = 0;
		 i_43_ < ((Class559) this).anIntArray7505.length; i_43_++) {
		if (((Class559) this).anIntArray7505[i_43_] != -1000000
		    && ((((Class541) class541).anIntArray7235[0]
			 <= ((Class559) this).anIntArray7505[i_43_])
			|| (((Class541) class541).anIntArray7235[1]
			    <= ((Class559) this).anIntArray7505[i_43_])
			|| (((Class541) class541).anIntArray7235[2]
			    <= ((Class559) this).anIntArray7505[i_43_])
			|| (((Class541) class541).anIntArray7235[3]
			    <= ((Class559) this).anIntArray7505[i_43_]))
		    && ((((Class541) class541).anIntArray7232[0]
			 <= ((Class559) this).anIntArray7501[i_43_])
			|| (((Class541) class541).anIntArray7232[1]
			    <= ((Class559) this).anIntArray7501[i_43_])
			|| (((Class541) class541).anIntArray7232[2]
			    <= ((Class559) this).anIntArray7501[i_43_])
			|| (((Class541) class541).anIntArray7232[3]
			    <= ((Class559) this).anIntArray7501[i_43_]))
		    && ((((Class541) class541).anIntArray7232[0]
			 >= ((Class559) this).anIntArray7500[i_43_])
			|| (((Class541) class541).anIntArray7232[1]
			    >= ((Class559) this).anIntArray7500[i_43_])
			|| (((Class541) class541).anIntArray7232[2]
			    >= ((Class559) this).anIntArray7500[i_43_])
			|| (((Class541) class541).anIntArray7232[3]
			    >= ((Class559) this).anIntArray7500[i_43_]))
		    && ((((Class541) class541).anIntArray7234[0]
			 <= ((Class559) this).anIntArray7502[i_43_])
			|| (((Class541) class541).anIntArray7234[1]
			    <= ((Class559) this).anIntArray7502[i_43_])
			|| (((Class541) class541).anIntArray7234[2]
			    <= ((Class559) this).anIntArray7502[i_43_])
			|| (((Class541) class541).anIntArray7234[3]
			    <= ((Class559) this).anIntArray7502[i_43_]))
		    && ((((Class541) class541).anIntArray7234[0]
			 >= ((Class559) this).anIntArray7503[i_43_])
			|| (((Class541) class541).anIntArray7234[1]
			    >= ((Class559) this).anIntArray7503[i_43_])
			|| (((Class541) class541).anIntArray7234[2]
			    >= ((Class559) this).anIntArray7503[i_43_])
			|| (((Class541) class541).anIntArray7234[3]
			    >= ((Class559) this).anIntArray7503[i_43_])))
		    return;
	    }
	}
	if (((Class541) class541).aByte7222 == 1) {
	    int i_44_
		= (((Class541) class541).aShort7236
		   - (((Class538) ((Class559) this).aClass538_7485).anInt7167
		      * 1980357015)
		   + (((Class538) ((Class559) this).aClass538_7485).anInt7190
		      * -117642839));
	    if (i_44_ >= 0
		&& i_44_ <= ((((Class538) ((Class559) this).aClass538_7485)
			      .anInt7190) * -117642839
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839)) {
		int i_45_ = (((Class541) class541).aShort7230
			     - (((Class538) ((Class559) this).aClass538_7485)
				.anInt7185) * -1890816403
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		if (i_45_ < 0)
		    i_45_ = 0;
		else if (i_45_
			 > ((((Class538) ((Class559) this).aClass538_7485)
			     .anInt7190) * -117642839
			    + (((Class538) ((Class559) this).aClass538_7485)
			       .anInt7190) * -117642839))
		    return;
		int i_46_ = (((Class541) class541).aShort7231
			     - (((Class538) ((Class559) this).aClass538_7485)
				.anInt7185) * -1890816403
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		if (i_46_
		    > ((((Class538) ((Class559) this).aClass538_7485).anInt7190
			* -117642839)
		       + (((Class538) ((Class559) this).aClass538_7485)
			  .anInt7190) * -117642839))
		    i_46_ = ((((Class538) ((Class559) this).aClass538_7485)
			      .anInt7190) * -117642839
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		else if (i_46_ < 0)
		    return;
		boolean bool = false;
	    while_5_:
		do {
		    do {
			if (i_45_ > i_46_)
			    break while_5_;
		    } while (!((Class538) ((Class559) this).aClass538_7485)
			      .aBoolArrayArray7210[i_44_][i_45_++]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f
			= (float) ((((Class538) (((Class559) this)
						 .aClass538_7485)).anInt7186
				    * 2075767487)
				   - ((Class541) class541).anIntArray7232[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) ((Class559) this).anInt7486)
			&& method6781(class541, 0) && method6781(class541, 1)
			&& method6781(class541, 2) && method6781(class541, 3))
			((Class559) this).aClass541Array7498
			    [((Class559) this).anInt7497++]
			    = class541;
		}
	    }
	} else if (((Class541) class541).aByte7222 == 2) {
	    int i_47_
		= (((Class541) class541).aShort7230
		   - (((Class538) ((Class559) this).aClass538_7485).anInt7185
		      * -1890816403)
		   + (((Class538) ((Class559) this).aClass538_7485).anInt7190
		      * -117642839));
	    if (i_47_ >= 0
		&& i_47_ <= ((((Class538) ((Class559) this).aClass538_7485)
			      .anInt7190) * -117642839
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839)) {
		int i_48_ = (((Class541) class541).aShort7236
			     - (((Class538) ((Class559) this).aClass538_7485)
				.anInt7167) * 1980357015
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		if (i_48_ < 0)
		    i_48_ = 0;
		else if (i_48_
			 > ((((Class538) ((Class559) this).aClass538_7485)
			     .anInt7190) * -117642839
			    + (((Class538) ((Class559) this).aClass538_7485)
			       .anInt7190) * -117642839))
		    return;
		int i_49_ = (((Class541) class541).aShort7229
			     - (((Class538) ((Class559) this).aClass538_7485)
				.anInt7167) * 1980357015
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		if (i_49_
		    > ((((Class538) ((Class559) this).aClass538_7485).anInt7190
			* -117642839)
		       + (((Class538) ((Class559) this).aClass538_7485)
			  .anInt7190) * -117642839))
		    i_49_ = ((((Class538) ((Class559) this).aClass538_7485)
			      .anInt7190) * -117642839
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		else if (i_49_ < 0)
		    return;
		boolean bool = false;
	    while_6_:
		do {
		    do {
			if (i_48_ > i_49_)
			    break while_6_;
		    } while (!((Class538) ((Class559) this).aClass538_7485)
			      .aBoolArrayArray7210[i_48_++][i_47_]);
		    bool = true;
		} while (false);
		if (bool) {
		    float f
			= (float) ((((Class538) (((Class559) this)
						 .aClass538_7485)).anInt7187
				    * 999136813)
				   - ((Class541) class541).anIntArray7234[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) ((Class559) this).anInt7486)
			&& method6781(class541, 0) && method6781(class541, 1)
			&& method6781(class541, 2) && method6781(class541, 3))
			((Class559) this).aClass541Array7498
			    [((Class559) this).anInt7497++]
			    = class541;
		}
	    }
	} else if (((Class541) class541).aByte7222 == 16
		   || ((Class541) class541).aByte7222 == 8) {
	    int i_50_
		= (((Class541) class541).aShort7236
		   - (((Class538) ((Class559) this).aClass538_7485).anInt7167
		      * 1980357015)
		   + (((Class538) ((Class559) this).aClass538_7485).anInt7190
		      * -117642839));
	    if (i_50_ >= 0
		&& i_50_ <= ((((Class538) ((Class559) this).aClass538_7485)
			      .anInt7190) * -117642839
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839)) {
		int i_51_ = (((Class541) class541).aShort7230
			     - (((Class538) ((Class559) this).aClass538_7485)
				.anInt7185) * -1890816403
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		if (i_51_ >= 0
		    && (i_51_
			<= ((((Class538) ((Class559) this).aClass538_7485)
			     .anInt7190) * -117642839
			    + (((Class538) ((Class559) this).aClass538_7485)
			       .anInt7190) * -117642839))
		    && (((Class538) ((Class559) this).aClass538_7485)
			.aBoolArrayArray7210[i_50_][i_51_])) {
		    float f
			= (float) ((((Class538) (((Class559) this)
						 .aClass538_7485)).anInt7186
				    * 2075767487)
				   - ((Class541) class541).anIntArray7232[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_52_
			= (float) ((((Class538) (((Class559) this)
						 .aClass538_7485)).anInt7187
				    * 999136813)
				   - ((Class541) class541).anIntArray7234[0]);
		    if (f_52_ < 0.0F)
			f_52_ *= -1.0F;
		    if ((!(f < (float) ((Class559) this).anInt7486)
			 || !(f_52_ < (float) ((Class559) this).anInt7486))
			&& method6781(class541, 0) && method6781(class541, 1)
			&& method6781(class541, 2) && method6781(class541, 3))
			((Class559) this).aClass541Array7498
			    [((Class559) this).anInt7497++]
			    = class541;
		}
	    }
	} else if (((Class541) class541).aByte7222 == 4) {
	    float f = (float) (((Class541) class541).anIntArray7235[0]
			       - (((Class538) ((Class559) this).aClass538_7485)
				  .anInt7188) * -2106205561);
	    if (!(f <= (float) ((Class559) this).anInt7499)) {
		int i_53_ = (((Class541) class541).aShort7230
			     - (((Class538) ((Class559) this).aClass538_7485)
				.anInt7185) * -1890816403
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		if (i_53_ < 0)
		    i_53_ = 0;
		else if (i_53_
			 > ((((Class538) ((Class559) this).aClass538_7485)
			     .anInt7190) * -117642839
			    + (((Class538) ((Class559) this).aClass538_7485)
			       .anInt7190) * -117642839))
		    return;
		int i_54_ = (((Class541) class541).aShort7231
			     - (((Class538) ((Class559) this).aClass538_7485)
				.anInt7185) * -1890816403
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		if (i_54_
		    > ((((Class538) ((Class559) this).aClass538_7485).anInt7190
			* -117642839)
		       + (((Class538) ((Class559) this).aClass538_7485)
			  .anInt7190) * -117642839))
		    i_54_ = ((((Class538) ((Class559) this).aClass538_7485)
			      .anInt7190) * -117642839
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		else if (i_54_ < 0)
		    return;
		int i_55_ = (((Class541) class541).aShort7236
			     - (((Class538) ((Class559) this).aClass538_7485)
				.anInt7167) * 1980357015
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		if (i_55_ < 0)
		    i_55_ = 0;
		else if (i_55_
			 > ((((Class538) ((Class559) this).aClass538_7485)
			     .anInt7190) * -117642839
			    + (((Class538) ((Class559) this).aClass538_7485)
			       .anInt7190) * -117642839))
		    return;
		int i_56_ = (((Class541) class541).aShort7229
			     - (((Class538) ((Class559) this).aClass538_7485)
				.anInt7167) * 1980357015
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		if (i_56_
		    > ((((Class538) ((Class559) this).aClass538_7485).anInt7190
			* -117642839)
		       + (((Class538) ((Class559) this).aClass538_7485)
			  .anInt7190) * -117642839))
		    i_56_ = ((((Class538) ((Class559) this).aClass538_7485)
			      .anInt7190) * -117642839
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7190) * -117642839);
		else if (i_56_ < 0)
		    return;
		boolean bool = false;
	    while_7_:
		for (int i_57_ = i_55_; i_57_ <= i_56_; i_57_++) {
		    for (int i_58_ = i_53_; i_58_ <= i_54_; i_58_++) {
			if (((Class538) ((Class559) this).aClass538_7485)
			    .aBoolArrayArray7210[i_57_][i_58_]) {
			    bool = true;
			    break while_7_;
			}
		    }
		}
		if (bool && method6781(class541, 0) && method6781(class541, 1)
		    && method6781(class541, 2) && method6781(class541, 3))
		    ((Class559) this).aClass541Array7498
			[((Class559) this).anInt7497++]
			= class541;
	    }
	}
    }
    
    boolean method6781(Class541 class541, int i) {
	if (!method6782(((Class541) class541).anIntArray7232[i],
			((Class541) class541).anIntArray7235[i],
			((Class541) class541).anIntArray7234[i]))
	    return false;
	((Class541) class541).aShortArray7233[i]
	    = (short) (int) ((Class559) this).aFloatArray7506[0];
	((Class541) class541).aShortArray7226[i]
	    = (short) (int) ((Class559) this).aFloatArray7506[1];
	((Class541) class541).aShortArray7237[i]
	    = (short) (int) ((Class559) this).aFloatArray7506[2];
	return true;
    }
    
    final boolean method6782(int i, int i_59_, int i_60_) {
	aClass173_7481.method2322((float) i, (float) i_59_, (float) i_60_,
				  ((Class559) this).aFloatArray7506);
	if (((Class559) this).aFloatArray7506[2] < 50.0F)
	    return false;
	((Class559) this).aFloatArray7506[0] /= 3.0F;
	((Class559) this).aFloatArray7506[1] /= 3.0F;
	return true;
    }
    
    boolean method6783(int i, int i_61_, int i_62_) {
	if (!aBool7491 || !((Class559) this).aBool7488)
	    return false;
	if (((Class545) ((Class559) this).aClass545_7509).anInt7387 < 102)
	    return false;
	int i_63_
	    = ((Class559) this).anIntArrayArrayArray7480[i][i_61_][i_62_];
	if (i_63_ == -(((Class538) ((Class559) this).aClass538_7485).anInt7189
		       * 1444873413))
	    return false;
	if (i_63_ == (((Class538) ((Class559) this).aClass538_7485).anInt7189
		      * 1444873413))
	    return true;
	if (((Class559) this).aClass538_7485.aClass137Array7161
	    == ((Class559) this).aClass538_7485.aClass137Array7202)
	    return false;
	int i_64_
	    = (i_61_
	       << ((Class559) this).aClass538_7485.anInt7148 * -1532596617);
	int i_65_
	    = (i_62_
	       << ((Class559) this).aClass538_7485.anInt7148 * -1532596617);
	if (method6788(i_64_ + 1,
		       ((Class559) this).aClass538_7485.aClass137Array7161
			   [i].method1669(i_61_, i_62_, (byte) 0),
		       i_65_ + 1,
		       i_64_ + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565 - 1,
		       ((Class559) this).aClass538_7485.aClass137Array7161
			   [i].method1669(i_61_ + 1, i_62_ + 1, (byte) 0),
		       i_65_ + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565 - 1,
		       i_64_ + 1,
		       ((Class559) this).aClass538_7485.aClass137Array7161
			   [i].method1669(i_61_, i_62_ + 1, (byte) 0),
		       i_65_ + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565 - 1)
	    && method6788(i_64_ + 1,
			  ((Class559) this).aClass538_7485
			      .aClass137Array7161[i]
			      .method1669(i_61_, i_62_, (byte) 0),
			  i_65_ + 1,
			  (i_64_
			   + (((Class538) ((Class559) this).aClass538_7485)
			      .anInt7169) * 198274565
			   - 1),
			  ((Class559) this).aClass538_7485
			      .aClass137Array7161[i]
			      .method1669(i_61_ + 1, i_62_, (byte) 0),
			  i_65_ + 1,
			  (i_64_
			   + (((Class538) ((Class559) this).aClass538_7485)
			      .anInt7169) * 198274565
			   - 1),
			  ((Class559) this).aClass538_7485
			      .aClass137Array7161[i]
			      .method1669(i_61_ + 1, i_62_ + 1, (byte) 0),
			  (i_65_
			   + (((Class538) ((Class559) this).aClass538_7485)
			      .anInt7169) * 198274565
			   - 1))) {
	    ((Class559) this).anIntArrayArrayArray7480[i][i_61_][i_62_]
		= (((Class538) ((Class559) this).aClass538_7485).anInt7189
		   * 1444873413);
	    return true;
	}
	((Class559) this).anIntArrayArrayArray7480[i][i_61_][i_62_]
	    = -(((Class538) ((Class559) this).aClass538_7485).anInt7189
		* 1444873413);
	return false;
    }
    
    boolean method6784(Class645_Sub1_Sub3 class645_sub1_sub3, int i, int i_66_,
		       int i_67_) {
	if (!aBool7491 || !((Class559) this).aBool7488)
	    return false;
	if (((Class545) ((Class559) this).aClass545_7509).anInt7387 < 102)
	    return false;
	if (!method6783(i, i_66_, i_67_))
	    return false;
	int i_68_
	    = (i_66_
	       << ((Class559) this).aClass538_7485.anInt7148 * -1532596617);
	int i_69_
	    = (i_67_
	       << ((Class559) this).aClass538_7485.anInt7148 * -1532596617);
	int i_70_ = (((Class559) this).aClass538_7485.aClass137Array7161[i]
			 .method1669(i_66_, i_67_, (byte) 0)
		     - 1);
	int i_71_ = i_70_ + class645_sub1_sub3.method9819(594861573);
	if (class645_sub1_sub3.aShort11707 == 1) {
	    if (!method6788(i_68_, i_70_, i_69_, i_68_, i_71_, i_69_, i_68_,
			    i_71_,
			    (i_69_
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565)))
		return false;
	    if (!method6788(i_68_, i_70_, i_69_, i_68_, i_71_,
			    (i_69_
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565),
			    i_68_, i_70_,
			    (i_69_
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565)))
		return false;
	    return true;
	}
	if (class645_sub1_sub3.aShort11707 == 2) {
	    if (!method6788
		 (i_68_, i_70_,
		  i_69_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_68_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_71_,
		  i_69_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_68_, i_71_,
		  i_69_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565))
		return false;
	    if (!method6788
		 (i_68_, i_70_,
		  i_69_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_68_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_70_,
		  i_69_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_68_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_71_,
		  i_69_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565))
		return false;
	    return true;
	}
	if (class645_sub1_sub3.aShort11707 == 4) {
	    if (!method6788
		 (i_68_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_70_, i_69_,
		  i_68_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_71_, i_69_,
		  i_68_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_71_,
		  i_69_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565))
		return false;
	    if (!method6788
		 (i_68_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_70_, i_69_,
		  i_68_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_71_,
		  i_69_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_68_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565,
		  i_70_,
		  i_69_ + (((Class538) ((Class559) this).aClass538_7485)
			   .anInt7169) * 198274565))
		return false;
	    return true;
	}
	if (class645_sub1_sub3.aShort11707 == 8) {
	    if (!method6788(i_68_, i_70_, i_69_,
			    (i_68_
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565),
			    i_71_, i_69_, i_68_, i_71_, i_69_))
		return false;
	    if (!method6788(i_68_, i_70_, i_69_,
			    (i_68_
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565),
			    i_70_, i_69_,
			    (i_68_
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565),
			    i_71_, i_69_))
		return false;
	    return true;
	}
	if (class645_sub1_sub3.aShort11707 == 16) {
	    if (!method6787(i_68_, i_70_,
			    (i_69_
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7155) * 486809201),
			    (((Class538) ((Class559) this).aClass538_7485)
			     .anInt7155) * 486809201,
			    i_71_,
			    (((Class538) ((Class559) this).aClass538_7485)
			     .anInt7155) * 486809201))
		return false;
	    return true;
	}
	if (class645_sub1_sub3.aShort11707 == 32) {
	    if (!method6787((i_68_
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7155) * 486809201),
			    i_70_,
			    (i_69_
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7155) * 486809201),
			    (((Class538) ((Class559) this).aClass538_7485)
			     .anInt7155) * 486809201,
			    i_71_,
			    (((Class538) ((Class559) this).aClass538_7485)
			     .anInt7155) * 486809201))
		return false;
	    return true;
	}
	if (class645_sub1_sub3.aShort11707 == 64) {
	    if (!method6787((i_68_
			     + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7155) * 486809201),
			    i_70_, i_69_,
			    (((Class538) ((Class559) this).aClass538_7485)
			     .anInt7155) * 486809201,
			    i_71_,
			    (((Class538) ((Class559) this).aClass538_7485)
			     .anInt7155) * 486809201))
		return false;
	    return true;
	}
	if (class645_sub1_sub3.aShort11707 == 128) {
	    if (!method6787(i_68_, i_70_, i_69_,
			    (((Class538) ((Class559) this).aClass538_7485)
			     .anInt7155) * 486809201,
			    i_71_,
			    (((Class538) ((Class559) this).aClass538_7485)
			     .anInt7155) * 486809201))
		return false;
	    return true;
	}
	return true;
    }
    
    boolean method6785(int i, int i_72_, int i_73_, int i_74_) {
	if (!aBool7491 || !((Class559) this).aBool7488)
	    return false;
	if (((Class545) ((Class559) this).aClass545_7509).anInt7387 < 102)
	    return false;
	if (!method6783(i, i_72_, i_73_))
	    return false;
	int i_75_
	    = (i_72_
	       << ((Class559) this).aClass538_7485.anInt7148 * -1532596617);
	int i_76_
	    = (i_73_
	       << ((Class559) this).aClass538_7485.anInt7148 * -1532596617);
	if (method6787(i_75_,
		       ((Class559) this).aClass538_7485.aClass137Array7161
			   [i].method1669(i_72_, i_73_, (byte) 0),
		       i_76_,
		       (((Class538) ((Class559) this).aClass538_7485).anInt7169
			* 198274565),
		       i_74_,
		       (((Class538) ((Class559) this).aClass538_7485).anInt7169
			* 198274565)))
	    return true;
	return false;
    }
    
    public void method6786(int i, int i_77_, int i_78_, int i_79_, int i_80_,
			   int i_81_, int i_82_, int i_83_) {
	((Class559) this).aClass541Array7490[((Class559) this).anInt7484++]
	    = new Class541(((Class559) this).aClass538_7485, i, i_77_, i_78_,
			   i_79_, i_79_, i_78_, i_82_, i_83_, i_83_, i_82_,
			   i_80_, i_80_, i_81_, i_81_);
    }
    
    final boolean method6787(int i, int i_84_, int i_85_, int i_86_, int i_87_,
			     int i_88_) {
	int i_89_ = i + i_86_;
	int i_90_ = i_84_ + i_87_;
	int i_91_ = i_85_ + i_88_;
	if (!method6788(i, i_90_, i_85_, i_89_, i_90_, i_91_, i, i_90_, i_91_))
	    return false;
	if (!method6788(i, i_90_, i_85_, i_89_, i_90_, i_85_, i_89_, i_90_,
			i_91_))
	    return false;
	if (i < (((Class538) ((Class559) this).aClass538_7485).anInt7186
		 * 2075767487)) {
	    if (!method6788(i, i_84_, i_91_, i, i_90_, i_85_, i, i_90_, i_91_))
		return false;
	    if (!method6788(i, i_84_, i_91_, i, i_84_, i_85_, i, i_90_, i_85_))
		return false;
	} else {
	    if (!method6788(i_89_, i_84_, i_91_, i_89_, i_90_, i_85_, i_89_,
			    i_90_, i_91_))
		return false;
	    if (!method6788(i_89_, i_84_, i_91_, i_89_, i_84_, i_85_, i_89_,
			    i_90_, i_85_))
		return false;
	}
	if (i_85_ < (((Class538) ((Class559) this).aClass538_7485).anInt7187
		     * 999136813)) {
	    if (!method6788(i, i_84_, i_85_, i_89_, i_90_, i_85_, i, i_90_,
			    i_85_))
		return false;
	    if (!method6788(i, i_84_, i_85_, i_89_, i_84_, i_85_, i_89_, i_90_,
			    i_85_))
		return false;
	} else {
	    if (!method6788(i, i_84_, i_91_, i_89_, i_90_, i_91_, i, i_90_,
			    i_91_))
		return false;
	    if (!method6788(i, i_84_, i_91_, i_89_, i_84_, i_91_, i_89_, i_90_,
			    i_91_))
		return false;
	}
	return true;
    }
    
    final boolean method6788(int i, int i_92_, int i_93_, int i_94_, int i_95_,
			     int i_96_, int i_97_, int i_98_, int i_99_) {
	if (!method6782(i, i_92_, i_93_))
	    return false;
	i = (int) ((Class559) this).aFloatArray7506[0];
	i_92_ = (int) ((Class559) this).aFloatArray7506[1];
	i_93_ = (int) ((Class559) this).aFloatArray7506[2];
	if (!method6782(i_94_, i_95_, i_96_))
	    return false;
	i_94_ = (int) ((Class559) this).aFloatArray7506[0];
	i_95_ = (int) ((Class559) this).aFloatArray7506[1];
	i_96_ = (int) ((Class559) this).aFloatArray7506[2];
	if (!method6782(i_97_, i_98_, i_99_))
	    return false;
	i_97_ = (int) ((Class559) this).aFloatArray7506[0];
	i_98_ = (int) ((Class559) this).aFloatArray7506[1];
	i_99_ = (int) ((Class559) this).aFloatArray7506[2];
	return ((Class559) this).aClass545_7509.method6661(i_92_, i_95_, i_98_,
							   i, i_94_, i_97_,
							   i_93_, i_96_,
							   i_99_);
    }
    
    public void method6789(int i, int i_100_, int i_101_, int i_102_) {
	if (i == 8 || i == 16) {
	    for (int i_103_ = 0; i_103_ < ((Class559) this).anInt7495;
		 i_103_++) {
		Class541 class541
		    = ((Class559) this).aClass541Array7496[i_103_];
		if (((Class541) class541).aByte7222 == i
		    && ((Class541) class541).aByte7227 == i_100_
		    && ((((Class541) class541).aShort7236 == i_101_
			 && ((Class541) class541).aShort7230 == i_102_)
			|| (((Class541) class541).aShort7229 == i_101_
			    && ((Class541) class541).aShort7231 == i_102_))) {
		    if (i_103_ != ((Class559) this).anInt7495)
			System.arraycopy(((Class559) this).aClass541Array7496,
					 i_103_ + 1,
					 ((Class559) this).aClass541Array7496,
					 i_103_,
					 ((((Class559) this)
					   .aClass541Array7496).length
					  - (i_103_ + 1)));
		    ((Class559) this).anInt7495--;
		    break;
		}
	    }
	} else {
	    Class546 class546
		= (((Class559) this).aClass538_7485
		   .aClass546ArrayArrayArray7160[i_100_][i_101_][i_102_]);
	    if (class546 != null) {
		if (i == 1)
		    ((Class546) class546).aShort7391 = (short) 0;
		else if (i == 2)
		    ((Class546) class546).aShort7400 = (short) 0;
	    }
	    method6778();
	}
    }
    
    public void method6790(int i, int i_104_, int i_105_, int i_106_) {
	if (i == 8 || i == 16) {
	    for (int i_107_ = 0; i_107_ < ((Class559) this).anInt7495;
		 i_107_++) {
		Class541 class541
		    = ((Class559) this).aClass541Array7496[i_107_];
		if (((Class541) class541).aByte7222 == i
		    && ((Class541) class541).aByte7227 == i_104_
		    && ((((Class541) class541).aShort7236 == i_105_
			 && ((Class541) class541).aShort7230 == i_106_)
			|| (((Class541) class541).aShort7229 == i_105_
			    && ((Class541) class541).aShort7231 == i_106_))) {
		    if (i_107_ != ((Class559) this).anInt7495)
			System.arraycopy(((Class559) this).aClass541Array7496,
					 i_107_ + 1,
					 ((Class559) this).aClass541Array7496,
					 i_107_,
					 ((((Class559) this)
					   .aClass541Array7496).length
					  - (i_107_ + 1)));
		    ((Class559) this).anInt7495--;
		    break;
		}
	    }
	} else {
	    Class546 class546
		= (((Class559) this).aClass538_7485
		   .aClass546ArrayArrayArray7160[i_104_][i_105_][i_106_]);
	    if (class546 != null) {
		if (i == 1)
		    ((Class546) class546).aShort7391 = (short) 0;
		else if (i == 2)
		    ((Class546) class546).aShort7400 = (short) 0;
	    }
	    method6778();
	}
    }
    
    public void method6791(int i, int i_108_, int i_109_, int i_110_) {
	if (i == 8 || i == 16) {
	    for (int i_111_ = 0; i_111_ < ((Class559) this).anInt7495;
		 i_111_++) {
		Class541 class541
		    = ((Class559) this).aClass541Array7496[i_111_];
		if (((Class541) class541).aByte7222 == i
		    && ((Class541) class541).aByte7227 == i_108_
		    && ((((Class541) class541).aShort7236 == i_109_
			 && ((Class541) class541).aShort7230 == i_110_)
			|| (((Class541) class541).aShort7229 == i_109_
			    && ((Class541) class541).aShort7231 == i_110_))) {
		    if (i_111_ != ((Class559) this).anInt7495)
			System.arraycopy(((Class559) this).aClass541Array7496,
					 i_111_ + 1,
					 ((Class559) this).aClass541Array7496,
					 i_111_,
					 ((((Class559) this)
					   .aClass541Array7496).length
					  - (i_111_ + 1)));
		    ((Class559) this).anInt7495--;
		    break;
		}
	    }
	} else {
	    Class546 class546
		= (((Class559) this).aClass538_7485
		   .aClass546ArrayArrayArray7160[i_108_][i_109_][i_110_]);
	    if (class546 != null) {
		if (i == 1)
		    ((Class546) class546).aShort7391 = (short) 0;
		else if (i == 2)
		    ((Class546) class546).aShort7400 = (short) 0;
	    }
	    method6778();
	}
    }
    
    void method6792() {
	for (int i = 0; i < ((Class559) this).anInt7493; i++)
	    ((Class559) this).aClass541Array7494[i] = null;
	((Class559) this).anInt7493 = 0;
	for (int i = 0;
	     i < ((Class559) this).aClass538_7485.anInt7184 * -353005885;
	     i++) {
	    for (int i_112_ = 0;
		 (i_112_
		  < ((Class559) this).aClass538_7485.anInt7158 * -1102718643);
		 i_112_++) {
		for (int i_113_ = 0;
		     i_113_ < (((Class559) this).aClass538_7485.anInt7159
			       * -532233529);
		     i_113_++) {
		    Class546 class546
			= (((Class559) this).aClass538_7485
			   .aClass546ArrayArrayArray7160[i][i_113_][i_112_]);
		    if (class546 != null) {
			if (((Class546) class546).aShort7391 > 0)
			    ((Class546) class546).aShort7391 *= -1;
			if (((Class546) class546).aShort7400 > 0)
			    ((Class546) class546).aShort7400 *= -1;
		    }
		}
	    }
	}
	for (int i = 0;
	     i < ((Class559) this).aClass538_7485.anInt7184 * -353005885;
	     i++) {
	    for (int i_114_ = 0;
		 (i_114_
		  < ((Class559) this).aClass538_7485.anInt7158 * -1102718643);
		 i_114_++) {
		for (int i_115_ = 0;
		     i_115_ < (((Class559) this).aClass538_7485.anInt7159
			       * -532233529);
		     i_115_++) {
		    Class546 class546
			= (((Class559) this).aClass538_7485
			   .aClass546ArrayArrayArray7160[i][i_115_][i_114_]);
		    if (class546 != null) {
			boolean bool
			    = ((((Class559) this).aClass538_7485
				.aClass546ArrayArrayArray7160[0][i_115_]
				[i_114_]) != null
			       && (((Class559) this).aClass538_7485
				   .aClass546ArrayArrayArray7160[0][i_115_]
				   [i_114_].aClass546_7392) != null);
			if (((Class546) class546).aShort7391 < 0) {
			    int i_116_ = i_114_;
			    int i_117_ = i_114_;
			    int i_118_ = i;
			    int i_119_ = i;
			    Class546 class546_120_
				= (((Class559) this).aClass538_7485
				   .aClass546ArrayArrayArray7160[i][i_115_]
				   [i_116_ - 1]);
			    int i_121_;
			    for (i_121_
				     = (((Class559) this).aClass538_7485
					    .aClass137Array7163[i].method1669
					(i_115_, i_114_, (byte) 0));
				 (i_116_ > 0 && class546_120_ != null
				  && ((Class546) class546_120_).aShort7391 < 0
				  && (((Class546) class546_120_).aShort7391
				      == ((Class546) class546).aShort7391)
				  && (((Class546) class546_120_).aShort7401
				      == ((Class546) class546).aShort7401)
				  && (i_121_
				      == (((Class559) this).aClass538_7485
					      .aClass137Array7163[i].method1669
					  (i_115_, i_116_ - 1, (byte) 0)))
				  && (i_116_ - 1 <= 0
				      || (i_121_
					  == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_115_, i_116_ - 2, (byte) 0))))
				  && i_117_ - i_116_ <= 10);
				 class546_120_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_115_][i_116_ - 1]))
				i_116_--;
			    for (class546_120_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_115_][i_117_ + 1]);
				 (i_117_ < (((Class559) this).aClass538_7485
					    .anInt7159) * -532233529
				  && class546_120_ != null
				  && ((Class546) class546_120_).aShort7391 < 0
				  && (((Class546) class546_120_).aShort7391
				      == ((Class546) class546).aShort7391)
				  && (((Class546) class546_120_).aShort7401
				      == ((Class546) class546).aShort7401)
				  && (i_121_
				      == (((Class559) this).aClass538_7485
					      .aClass137Array7163[i].method1669
					  (i_115_, i_117_ + 1, (byte) 0)))
				  && (i_117_ + 1 >= (((Class559) this)
						     .aClass538_7485
						     .anInt7159) * -532233529
				      || (i_121_
					  == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_115_, i_117_ + 2, (byte) 0))))
				  && i_117_ - i_116_ <= 10);
				 class546_120_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_115_][i_117_ + 1]))
				i_117_++;
			    int i_122_ = i_119_ - i_118_ + 1;
			    int i_123_
				= ((Class559) this).aClass538_7485
				      .aClass137Array7163
				      [bool ? i_118_ + 1 : i_118_]
				      .method1669(i_115_, i_116_, (byte) 0);
			    int i_124_
				= i_123_ + (((Class546) class546).aShort7391
					    * i_122_);
			    int i_125_
				= (((Class559) this).aClass538_7485
				       .aClass137Array7163
				       [bool ? i_118_ + 1 : i_118_].method1669
				   (i_115_, i_117_ + 1, (byte) 0));
			    int i_126_
				= i_125_ + (((Class546) class546).aShort7391
					    * i_122_);
			    int i_127_
				= i_115_ << (((Class559) this).aClass538_7485
					     .anInt7148) * -1532596617;
			    int i_128_
				= i_116_ << (((Class559) this).aClass538_7485
					     .anInt7148) * -1532596617;
			    int i_129_
				= ((i_117_ << (((Class559) this).aClass538_7485
					       .anInt7148) * -1532596617)
				   + (((Class538) (((Class559) this)
						   .aClass538_7485)).anInt7169
				      * 198274565));
			    ((Class559) this).aClass541Array7494
				[((Class559) this).anInt7493++]
				= (new Class541
				   (((Class559) this).aClass538_7485, 1,
				    i_119_,
				    i_127_ + ((Class546) class546).aShort7401,
				    i_127_ + ((Class546) class546).aShort7401,
				    i_127_ + ((Class546) class546).aShort7401,
				    i_127_ + ((Class546) class546).aShort7401,
				    i_123_, i_125_, i_126_, i_124_, i_128_,
				    i_129_, i_129_, i_128_));
			    for (int i_130_ = i_118_; i_130_ <= i_119_;
				 i_130_++) {
				for (int i_131_ = i_116_; i_131_ <= i_117_;
				     i_131_++)
				    ((Class546)
				     (((Class559) this).aClass538_7485
				      .aClass546ArrayArrayArray7160[i_130_]
				      [i_115_][i_131_])).aShort7391
					*= -1;
			    }
			}
			if (((Class546) class546).aShort7400 < 0) {
			    int i_132_ = i_115_;
			    int i_133_ = i_115_;
			    int i_134_ = i;
			    int i_135_ = i;
			    Class546 class546_136_
				= (((Class559) this).aClass538_7485
				   .aClass546ArrayArrayArray7160[i][i_132_ - 1]
				   [i_114_]);
			    int i_137_;
			    for (i_137_
				     = (((Class559) this).aClass538_7485
					    .aClass137Array7163[i].method1669
					(i_115_, i_114_, (byte) 0));
				 (i_132_ > 0 && class546_136_ != null
				  && ((Class546) class546_136_).aShort7400 < 0
				  && (((Class546) class546_136_).aShort7400
				      == ((Class546) class546).aShort7400)
				  && (((Class546) class546_136_).aShort7403
				      == ((Class546) class546).aShort7403)
				  && (i_137_
				      == (((Class559) this).aClass538_7485
					      .aClass137Array7163[i].method1669
					  (i_132_ - 1, i_114_, (byte) 0)))
				  && (i_132_ - 1 <= 0
				      || (i_137_
					  == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_132_ - 2, i_114_, (byte) 0))))
				  && i_133_ - i_132_ <= 10);
				 class546_136_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_132_ - 1][i_114_]))
				i_132_--;
			    for (class546_136_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_133_ + 1][i_114_]);
				 (i_133_ < (((Class559) this).aClass538_7485
					    .anInt7158) * -1102718643
				  && class546_136_ != null
				  && ((Class546) class546_136_).aShort7400 < 0
				  && (((Class546) class546_136_).aShort7400
				      == ((Class546) class546).aShort7400)
				  && (((Class546) class546_136_).aShort7403
				      == ((Class546) class546).aShort7403)
				  && (i_137_
				      == (((Class559) this).aClass538_7485
					      .aClass137Array7163[i].method1669
					  (i_133_ + 1, i_114_, (byte) 0)))
				  && (i_133_ + 1 >= (((Class559) this)
						     .aClass538_7485
						     .anInt7158) * -1102718643
				      || (i_137_
					  == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_133_ + 2, i_114_, (byte) 0))))
				  && i_133_ - i_132_ <= 10);
				 class546_136_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_133_ + 1][i_114_]))
				i_133_++;
			    int i_138_ = i_135_ - i_134_ + 1;
			    int i_139_
				= ((Class559) this).aClass538_7485
				      .aClass137Array7163
				      [bool ? i_134_ + 1 : i_134_]
				      .method1669(i_132_, i_114_, (byte) 0);
			    int i_140_
				= i_139_ + (((Class546) class546).aShort7400
					    * i_138_);
			    int i_141_
				= (((Class559) this).aClass538_7485
				       .aClass137Array7163
				       [bool ? i_134_ + 1 : i_134_].method1669
				   (i_133_ + 1, i_114_, (byte) 0));
			    int i_142_
				= i_141_ + (((Class546) class546).aShort7400
					    * i_138_);
			    int i_143_
				= i_132_ << (((Class559) this).aClass538_7485
					     .anInt7148) * -1532596617;
			    int i_144_
				= ((i_133_ << (((Class559) this).aClass538_7485
					       .anInt7148) * -1532596617)
				   + (((Class538) (((Class559) this)
						   .aClass538_7485)).anInt7169
				      * 198274565));
			    int i_145_
				= i_114_ << (((Class559) this).aClass538_7485
					     .anInt7148) * -1532596617;
			    ((Class559) this).aClass541Array7494
				[((Class559) this).anInt7493++]
				= (new Class541
				   (((Class559) this).aClass538_7485, 2,
				    i_135_, i_143_, i_144_, i_144_, i_143_,
				    i_139_, i_141_, i_142_, i_140_,
				    i_145_ + ((Class546) class546).aShort7403,
				    i_145_ + ((Class546) class546).aShort7403,
				    i_145_ + ((Class546) class546).aShort7403,
				    (i_145_
				     + ((Class546) class546).aShort7403)));
			    for (int i_146_ = i_134_; i_146_ <= i_135_;
				 i_146_++) {
				for (int i_147_ = i_132_; i_147_ <= i_133_;
				     i_147_++)
				    ((Class546)
				     (((Class559) this).aClass538_7485
				      .aClass546ArrayArrayArray7160[i_146_]
				      [i_147_][i_114_])).aShort7400
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	((Class559) this).aBool7487 = true;
    }
    
    public void method6793(int i, int i_148_, int i_149_, int i_150_,
			   int i_151_, int i_152_) {
	if (i == 8 || i == 16) {
	    if (i == 8) {
		int i_153_
		    = i_149_ << (((Class559) this).aClass538_7485.anInt7148
				 * -1532596617);
		int i_154_
		    = i_153_ + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565;
		int i_155_
		    = i_150_ << (((Class559) this).aClass538_7485.anInt7148
				 * -1532596617);
		int i_156_
		    = i_155_ + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565;
		int i_157_
		    = ((Class559) this).aClass538_7485.aClass137Array7163
			  [i_148_].method1669(i_149_, i_150_, (byte) 0);
		int i_158_ = ((Class559) this).aClass538_7485
				 .aClass137Array7163[i_148_]
				 .method1669(i_149_ + 1, i_150_ + 1, (byte) 0);
		((Class559) this).aClass541Array7496
		    [((Class559) this).anInt7495++]
		    = new Class541(((Class559) this).aClass538_7485, i, i_148_,
				   i_153_, i_154_, i_154_, i_153_, i_157_,
				   i_158_, i_158_ - i_151_, i_157_ - i_151_,
				   i_155_, i_156_, i_156_, i_155_);
	    } else {
		int i_159_
		    = ((i_149_ << (((Class559) this).aClass538_7485.anInt7148
				   * -1532596617))
		       + (((Class538) ((Class559) this).aClass538_7485)
			  .anInt7169) * 198274565);
		int i_160_
		    = i_159_ - (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565;
		int i_161_
		    = i_150_ << (((Class559) this).aClass538_7485.anInt7148
				 * -1532596617);
		int i_162_
		    = i_161_ + (((Class538) ((Class559) this).aClass538_7485)
				.anInt7169) * 198274565;
		int i_163_
		    = ((Class559) this).aClass538_7485.aClass137Array7163
			  [i_148_].method1669(i_149_ + 1, i_150_, (byte) 0);
		int i_164_
		    = ((Class559) this).aClass538_7485.aClass137Array7163
			  [i_148_].method1669(i_149_, i_150_ + 1, (byte) 0);
		((Class559) this).aClass541Array7496
		    [((Class559) this).anInt7495++]
		    = new Class541(((Class559) this).aClass538_7485, i, i_148_,
				   i_159_, i_160_, i_160_, i_159_, i_163_,
				   i_164_, i_164_ - i_151_, i_163_ - i_151_,
				   i_161_, i_162_, i_162_, i_161_);
	    }
	} else {
	    Class546 class546
		= (((Class559) this).aClass538_7485
		   .aClass546ArrayArrayArray7160[i_148_][i_149_][i_150_]);
	    if (class546 == null)
		((Class559) this).aClass538_7485
		    .aClass546ArrayArrayArray7160[i_148_][i_149_][i_150_]
		    = class546 = new Class546(i_148_);
	    if (i == 1) {
		((Class546) class546).aShort7391 = (short) i_151_;
		((Class546) class546).aShort7401 = (short) i_152_;
	    } else if (i == 2) {
		((Class546) class546).aShort7400 = (short) i_151_;
		((Class546) class546).aShort7403 = (short) i_152_;
	    }
	    if (((Class559) this).aBool7487)
		method6778();
	}
    }
    
    public void method6794() {
	method6778();
    }
    
    void method6795() {
	for (int i = 0; i < ((Class559) this).anInt7493; i++)
	    ((Class559) this).aClass541Array7494[i] = null;
	((Class559) this).anInt7493 = 0;
	for (int i = 0;
	     i < ((Class559) this).aClass538_7485.anInt7184 * -353005885;
	     i++) {
	    for (int i_165_ = 0;
		 (i_165_
		  < ((Class559) this).aClass538_7485.anInt7158 * -1102718643);
		 i_165_++) {
		for (int i_166_ = 0;
		     i_166_ < (((Class559) this).aClass538_7485.anInt7159
			       * -532233529);
		     i_166_++) {
		    Class546 class546
			= (((Class559) this).aClass538_7485
			   .aClass546ArrayArrayArray7160[i][i_166_][i_165_]);
		    if (class546 != null) {
			if (((Class546) class546).aShort7391 > 0)
			    ((Class546) class546).aShort7391 *= -1;
			if (((Class546) class546).aShort7400 > 0)
			    ((Class546) class546).aShort7400 *= -1;
		    }
		}
	    }
	}
	for (int i = 0;
	     i < ((Class559) this).aClass538_7485.anInt7184 * -353005885;
	     i++) {
	    for (int i_167_ = 0;
		 (i_167_
		  < ((Class559) this).aClass538_7485.anInt7158 * -1102718643);
		 i_167_++) {
		for (int i_168_ = 0;
		     i_168_ < (((Class559) this).aClass538_7485.anInt7159
			       * -532233529);
		     i_168_++) {
		    Class546 class546
			= (((Class559) this).aClass538_7485
			   .aClass546ArrayArrayArray7160[i][i_168_][i_167_]);
		    if (class546 != null) {
			boolean bool
			    = ((((Class559) this).aClass538_7485
				.aClass546ArrayArrayArray7160[0][i_168_]
				[i_167_]) != null
			       && (((Class559) this).aClass538_7485
				   .aClass546ArrayArrayArray7160[0][i_168_]
				   [i_167_].aClass546_7392) != null);
			if (((Class546) class546).aShort7391 < 0) {
			    int i_169_ = i_167_;
			    int i_170_ = i_167_;
			    int i_171_ = i;
			    int i_172_ = i;
			    Class546 class546_173_
				= (((Class559) this).aClass538_7485
				   .aClass546ArrayArrayArray7160[i][i_168_]
				   [i_169_ - 1]);
			    int i_174_;
			    for (i_174_
				     = (((Class559) this).aClass538_7485
					    .aClass137Array7163[i].method1669
					(i_168_, i_167_, (byte) 0));
				 (i_169_ > 0 && class546_173_ != null
				  && ((Class546) class546_173_).aShort7391 < 0
				  && (((Class546) class546_173_).aShort7391
				      == ((Class546) class546).aShort7391)
				  && (((Class546) class546_173_).aShort7401
				      == ((Class546) class546).aShort7401)
				  && (i_174_
				      == (((Class559) this).aClass538_7485
					      .aClass137Array7163[i].method1669
					  (i_168_, i_169_ - 1, (byte) 0)))
				  && (i_169_ - 1 <= 0
				      || (i_174_
					  == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_168_, i_169_ - 2, (byte) 0))))
				  && i_170_ - i_169_ <= 10);
				 class546_173_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_168_][i_169_ - 1]))
				i_169_--;
			    for (class546_173_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_168_][i_170_ + 1]);
				 (i_170_ < (((Class559) this).aClass538_7485
					    .anInt7159) * -532233529
				  && class546_173_ != null
				  && ((Class546) class546_173_).aShort7391 < 0
				  && (((Class546) class546_173_).aShort7391
				      == ((Class546) class546).aShort7391)
				  && (((Class546) class546_173_).aShort7401
				      == ((Class546) class546).aShort7401)
				  && (i_174_
				      == (((Class559) this).aClass538_7485
					      .aClass137Array7163[i].method1669
					  (i_168_, i_170_ + 1, (byte) 0)))
				  && (i_170_ + 1 >= (((Class559) this)
						     .aClass538_7485
						     .anInt7159) * -532233529
				      || (i_174_
					  == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_168_, i_170_ + 2, (byte) 0))))
				  && i_170_ - i_169_ <= 10);
				 class546_173_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_168_][i_170_ + 1]))
				i_170_++;
			    int i_175_ = i_172_ - i_171_ + 1;
			    int i_176_
				= ((Class559) this).aClass538_7485
				      .aClass137Array7163
				      [bool ? i_171_ + 1 : i_171_]
				      .method1669(i_168_, i_169_, (byte) 0);
			    int i_177_
				= i_176_ + (((Class546) class546).aShort7391
					    * i_175_);
			    int i_178_
				= (((Class559) this).aClass538_7485
				       .aClass137Array7163
				       [bool ? i_171_ + 1 : i_171_].method1669
				   (i_168_, i_170_ + 1, (byte) 0));
			    int i_179_
				= i_178_ + (((Class546) class546).aShort7391
					    * i_175_);
			    int i_180_
				= i_168_ << (((Class559) this).aClass538_7485
					     .anInt7148) * -1532596617;
			    int i_181_
				= i_169_ << (((Class559) this).aClass538_7485
					     .anInt7148) * -1532596617;
			    int i_182_
				= ((i_170_ << (((Class559) this).aClass538_7485
					       .anInt7148) * -1532596617)
				   + (((Class538) (((Class559) this)
						   .aClass538_7485)).anInt7169
				      * 198274565));
			    ((Class559) this).aClass541Array7494
				[((Class559) this).anInt7493++]
				= (new Class541
				   (((Class559) this).aClass538_7485, 1,
				    i_172_,
				    i_180_ + ((Class546) class546).aShort7401,
				    i_180_ + ((Class546) class546).aShort7401,
				    i_180_ + ((Class546) class546).aShort7401,
				    i_180_ + ((Class546) class546).aShort7401,
				    i_176_, i_178_, i_179_, i_177_, i_181_,
				    i_182_, i_182_, i_181_));
			    for (int i_183_ = i_171_; i_183_ <= i_172_;
				 i_183_++) {
				for (int i_184_ = i_169_; i_184_ <= i_170_;
				     i_184_++)
				    ((Class546)
				     (((Class559) this).aClass538_7485
				      .aClass546ArrayArrayArray7160[i_183_]
				      [i_168_][i_184_])).aShort7391
					*= -1;
			    }
			}
			if (((Class546) class546).aShort7400 < 0) {
			    int i_185_ = i_168_;
			    int i_186_ = i_168_;
			    int i_187_ = i;
			    int i_188_ = i;
			    Class546 class546_189_
				= (((Class559) this).aClass538_7485
				   .aClass546ArrayArrayArray7160[i][i_185_ - 1]
				   [i_167_]);
			    int i_190_;
			    for (i_190_
				     = (((Class559) this).aClass538_7485
					    .aClass137Array7163[i].method1669
					(i_168_, i_167_, (byte) 0));
				 (i_185_ > 0 && class546_189_ != null
				  && ((Class546) class546_189_).aShort7400 < 0
				  && (((Class546) class546_189_).aShort7400
				      == ((Class546) class546).aShort7400)
				  && (((Class546) class546_189_).aShort7403
				      == ((Class546) class546).aShort7403)
				  && (i_190_
				      == (((Class559) this).aClass538_7485
					      .aClass137Array7163[i].method1669
					  (i_185_ - 1, i_167_, (byte) 0)))
				  && (i_185_ - 1 <= 0
				      || (i_190_
					  == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_185_ - 2, i_167_, (byte) 0))))
				  && i_186_ - i_185_ <= 10);
				 class546_189_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_185_ - 1][i_167_]))
				i_185_--;
			    for (class546_189_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_186_ + 1][i_167_]);
				 (i_186_ < (((Class559) this).aClass538_7485
					    .anInt7158) * -1102718643
				  && class546_189_ != null
				  && ((Class546) class546_189_).aShort7400 < 0
				  && (((Class546) class546_189_).aShort7400
				      == ((Class546) class546).aShort7400)
				  && (((Class546) class546_189_).aShort7403
				      == ((Class546) class546).aShort7403)
				  && (i_190_
				      == (((Class559) this).aClass538_7485
					      .aClass137Array7163[i].method1669
					  (i_186_ + 1, i_167_, (byte) 0)))
				  && (i_186_ + 1 >= (((Class559) this)
						     .aClass538_7485
						     .anInt7158) * -1102718643
				      || (i_190_
					  == (((Class559) this)
						  .aClass538_7485
						  .aClass137Array7163[i]
						  .method1669
					      (i_186_ + 2, i_167_, (byte) 0))))
				  && i_186_ - i_185_ <= 10);
				 class546_189_
				     = (((Class559) this).aClass538_7485
					.aClass546ArrayArrayArray7160[i]
					[i_186_ + 1][i_167_]))
				i_186_++;
			    int i_191_ = i_188_ - i_187_ + 1;
			    int i_192_
				= ((Class559) this).aClass538_7485
				      .aClass137Array7163
				      [bool ? i_187_ + 1 : i_187_]
				      .method1669(i_185_, i_167_, (byte) 0);
			    int i_193_
				= i_192_ + (((Class546) class546).aShort7400
					    * i_191_);
			    int i_194_
				= (((Class559) this).aClass538_7485
				       .aClass137Array7163
				       [bool ? i_187_ + 1 : i_187_].method1669
				   (i_186_ + 1, i_167_, (byte) 0));
			    int i_195_
				= i_194_ + (((Class546) class546).aShort7400
					    * i_191_);
			    int i_196_
				= i_185_ << (((Class559) this).aClass538_7485
					     .anInt7148) * -1532596617;
			    int i_197_
				= ((i_186_ << (((Class559) this).aClass538_7485
					       .anInt7148) * -1532596617)
				   + (((Class538) (((Class559) this)
						   .aClass538_7485)).anInt7169
				      * 198274565));
			    int i_198_
				= i_167_ << (((Class559) this).aClass538_7485
					     .anInt7148) * -1532596617;
			    ((Class559) this).aClass541Array7494
				[((Class559) this).anInt7493++]
				= (new Class541
				   (((Class559) this).aClass538_7485, 2,
				    i_188_, i_196_, i_197_, i_197_, i_196_,
				    i_192_, i_194_, i_195_, i_193_,
				    i_198_ + ((Class546) class546).aShort7403,
				    i_198_ + ((Class546) class546).aShort7403,
				    i_198_ + ((Class546) class546).aShort7403,
				    (i_198_
				     + ((Class546) class546).aShort7403)));
			    for (int i_199_ = i_187_; i_199_ <= i_188_;
				 i_199_++) {
				for (int i_200_ = i_185_; i_200_ <= i_186_;
				     i_200_++)
				    ((Class546)
				     (((Class559) this).aClass538_7485
				      .aClass546ArrayArrayArray7160[i_199_]
				      [i_200_][i_167_])).aShort7400
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	((Class559) this).aBool7487 = true;
    }
    
    boolean method6796(int i, int i_201_, int i_202_, int i_203_, int i_204_,
		       Class554 class554) {
	if (!aBool7491 || !((Class559) this).aBool7488)
	    return false;
	if (((Class545) ((Class559) this).aClass545_7509).anInt7387 < 102)
	    return false;
	if (i_201_ < 0 || i_203_ < 0
	    || i_202_ >= ((Class559) this).anIntArrayArrayArray7480[i].length
	    || i_204_ >= (((Class559) this).anIntArrayArrayArray7480[i]
			  [i_201_]).length)
	    return false;
	if (i_201_ == i_202_ && i_203_ == i_204_) {
	    if (!method6783(i, i_201_, i_203_))
		return false;
	    if (method6777(class554))
		return true;
	    return false;
	}
	for (int i_205_ = i_201_; i_205_ <= i_202_; i_205_++) {
	    for (int i_206_ = i_203_; i_206_ <= i_204_; i_206_++) {
		if ((((Class559) this).anIntArrayArrayArray7480[i][i_205_]
		     [i_206_])
		    == -((((Class538) ((Class559) this).aClass538_7485)
			  .anInt7189)
			 * 1444873413))
		    return false;
	    }
	}
	if (!method6777(class554))
	    return false;
	return true;
    }
    
    Class559(Class538 class538) {
	((Class559) this).aBool7488 = true;
	((Class559) this).aBool7487 = false;
	((Class559) this).anInt7497 = 0;
	((Class559) this).aFloatArray7506 = new float[3];
	((Class559) this).anIntArray7507 = new int[2];
	((Class559) this).anInt7508 = -1;
	((Class559) this).anInt7489 = -1;
	((Class559) this).aBool7510 = true;
	((Class559) this).anInt7486
	    = ((Class538) class538).anInt7169 * 198274565;
	((Class559) this).anInt7499
	    = ((Class538) class538).anInt7169 * 198274565;
	((Class559) this).aClass538_7485 = class538;
	((Class559) this).aClass541Array7490 = new Class541[534];
	((Class559) this).anInt7484 = 0;
	((Class559) this).aClass541Array7494 = new Class541[2021];
	((Class559) this).anInt7493 = 0;
	((Class559) this).aClass541Array7496 = new Class541[1033];
	((Class559) this).anInt7495 = 0;
	((Class559) this).aClass541Array7498 = new Class541[1007];
	((Class559) this).anInt7497 = 0;
	((Class559) this).anIntArrayArrayArray7480
	    = (new int[((Class559) this).aClass538_7485.anInt7184 * -353005885]
	       [((Class559) this).aClass538_7485.anInt7158 * -1102718643 + 1]
	       [((Class559) this).aClass538_7485.anInt7159 * -532233529 + 1]);
	((Class559) this).aBool7487 = false;
	aBool7491 = true;
	if (aBool7491)
	    ((Class559) this).aClass545_7509 = new Class545(this);
    }
}
