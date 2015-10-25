/* Class645_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class645_Sub1_Sub3 extends Class645_Sub1
{
    Class528_Sub12[] aClass528_Sub12Array11701;
    public static final int anInt11702 = 2;
    public static final int anInt11703 = 4;
    public static final int anInt11704 = 8;
    public static final int anInt11705 = 64;
    public static final int anInt11706 = 32;
    public short aShort11707;
    public static final int anInt11708 = 128;
    static int[] anIntArray11709 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    public static final int anInt11710 = 1;
    public static final int anInt11711 = 16;
    int anInt11712 = 0;
    
    int method9817(Class528_Sub12[] class528_sub12s, int i) {
	if (aBool8373) {
	    Class422 class422 = method7693().aClass422_4868;
	    int i_0_ = ((int) class422.aFloat4780
			>> -1532596617 * aClass538_10676.anInt7148);
	    int i_1_ = ((int) class422.aFloat4777
			>> aClass538_10676.anInt7148 * -1532596617);
	    int i_2_ = 0;
	    if (i_0_ == 1980357015 * ((Class538) aClass538_10676).anInt7167)
		i_2_++;
	    else if (1980357015 * ((Class538) aClass538_10676).anInt7167
		     < i_0_)
		i_2_ += 2;
	    if (i_1_ == ((Class538) aClass538_10676).anInt7185 * -1890816403)
		i_2_ += 3;
	    else if (-1890816403 * ((Class538) aClass538_10676).anInt7185
		     > i_1_)
		i_2_ += 6;
	    int i_3_ = anIntArray11709[i_2_];
	    if ((aShort11707 & i_3_) == 0) {
		if (1 == aShort11707 && i_0_ > 0)
		    i_0_--;
		else if (aShort11707 == 4
			 && i_0_ <= aClass538_10676.anInt7158 * -1102718643)
		    i_0_++;
		else if (aShort11707 == 8 && i_1_ > 0)
		    i_1_--;
		else if (2 == aShort11707
			 && i_1_ <= -532233529 * aClass538_10676.anInt7159)
		    i_1_++;
		else if (16 == aShort11707 && i_0_ > 0
			 && i_1_ <= aClass538_10676.anInt7159 * -532233529) {
		    i_0_--;
		    i_1_++;
		} else if (32 == aShort11707
			   && i_0_ <= -1102718643 * aClass538_10676.anInt7158
			   && i_1_ <= -532233529 * aClass538_10676.anInt7159) {
		    i_0_++;
		    i_1_++;
		} else if (aShort11707 == 128 && i_0_ > 0 && i_1_ > 0) {
		    i_0_--;
		    i_1_--;
		} else if (aShort11707 == 64
			   && i_0_ <= aClass538_10676.anInt7158 * -1102718643
			   && i_1_ > 0) {
		    i_0_++;
		    i_1_--;
		} else
		    throw new RuntimeException("");
	    }
	    ((Class645_Sub1_Sub3) this).anInt11712
		= method9807(i_0_, i_1_,
			     (((Class645_Sub1_Sub3) this)
			      .aClass528_Sub12Array11701),
			     303539092) * 2023427641;
	    aBool8373 = false;
	}
	for (int i_4_ = 0;
	     i_4_ < ((Class645_Sub1_Sub3) this).anInt11712 * 384860169; i_4_++)
	    class528_sub12s[i_4_]
		= ((Class645_Sub1_Sub3) this).aClass528_Sub12Array11701[i_4_];
	return ((Class645_Sub1_Sub3) this).anInt11712 * 384860169;
    }
    
    boolean method9788(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	return (aClass538_10676.aClass559_7156.method6784
		(this, aByte10674,
		 ((int) class422.aFloat4780
		  >> aClass538_10676.anInt7148 * -1532596617),
		 ((int) class422.aFloat4777
		  >> -1532596617 * aClass538_10676.anInt7148)));
    }
    
    boolean method9781(Class173 class173, byte i) {
	Class422 class422 = method7693().aClass422_4868;
	return (aClass538_10676.aClass559_7156.method6784
		(this, aByte10674,
		 ((int) class422.aFloat4780
		  >> aClass538_10676.anInt7148 * -1532596617),
		 ((int) class422.aFloat4777
		  >> -1532596617 * aClass538_10676.anInt7148)));
    }
    
    Class645_Sub1_Sub3(Class538 class538, int i, int i_5_, int i_6_, int i_7_,
		       int i_8_, int i_9_) {
	super(class538);
	((Class645_Sub1_Sub3) this).aClass528_Sub12Array11701
	    = new Class528_Sub12[4];
	aByte10675 = (byte) i_7_;
	aByte10674 = (byte) i_8_;
	aShort11707 = (short) i_9_;
	method7688(new Class422((float) i, (float) i_5_, (float) i_6_));
	for (int i_10_ = 0; i_10_ < 4; i_10_++)
	    ((Class645_Sub1_Sub3) this).aClass528_Sub12Array11701[i_10_]
		= null;
    }
    
    int method9812(Class528_Sub12[] class528_sub12s) {
	if (aBool8373) {
	    Class422 class422 = method7693().aClass422_4868;
	    int i = ((int) class422.aFloat4780
		     >> -1532596617 * aClass538_10676.anInt7148);
	    int i_11_ = ((int) class422.aFloat4777
			 >> aClass538_10676.anInt7148 * -1532596617);
	    int i_12_ = 0;
	    if (i == 1980357015 * ((Class538) aClass538_10676).anInt7167)
		i_12_++;
	    else if (1980357015 * ((Class538) aClass538_10676).anInt7167 < i)
		i_12_ += 2;
	    if (i_11_ == ((Class538) aClass538_10676).anInt7185 * -1890816403)
		i_12_ += 3;
	    else if (-1890816403 * ((Class538) aClass538_10676).anInt7185
		     > i_11_)
		i_12_ += 6;
	    int i_13_ = anIntArray11709[i_12_];
	    if ((aShort11707 & i_13_) == 0) {
		if (1 == aShort11707 && i > 0)
		    i--;
		else if (aShort11707 == 4
			 && i <= aClass538_10676.anInt7158 * -1102718643)
		    i++;
		else if (aShort11707 == 8 && i_11_ > 0)
		    i_11_--;
		else if (2 == aShort11707
			 && i_11_ <= -532233529 * aClass538_10676.anInt7159)
		    i_11_++;
		else if (16 == aShort11707 && i > 0
			 && i_11_ <= aClass538_10676.anInt7159 * -532233529) {
		    i--;
		    i_11_++;
		} else if (32 == aShort11707
			   && i <= -1102718643 * aClass538_10676.anInt7158
			   && (i_11_
			       <= -532233529 * aClass538_10676.anInt7159)) {
		    i++;
		    i_11_++;
		} else if (aShort11707 == 128 && i > 0 && i_11_ > 0) {
		    i--;
		    i_11_--;
		} else if (aShort11707 == 64
			   && i <= aClass538_10676.anInt7158 * -1102718643
			   && i_11_ > 0) {
		    i++;
		    i_11_--;
		} else
		    throw new RuntimeException("");
	    }
	    ((Class645_Sub1_Sub3) this).anInt11712
		= method9807(i, i_11_,
			     (((Class645_Sub1_Sub3) this)
			      .aClass528_Sub12Array11701),
			     303539092) * 2023427641;
	    aBool8373 = false;
	}
	for (int i = 0; i < ((Class645_Sub1_Sub3) this).anInt11712 * 384860169;
	     i++)
	    class528_sub12s[i]
		= ((Class645_Sub1_Sub3) this).aClass528_Sub12Array11701[i];
	return ((Class645_Sub1_Sub3) this).anInt11712 * 384860169;
    }
    
    int method9811(Class528_Sub12[] class528_sub12s) {
	if (aBool8373) {
	    Class422 class422 = method7693().aClass422_4868;
	    int i = ((int) class422.aFloat4780
		     >> -1532596617 * aClass538_10676.anInt7148);
	    int i_14_ = ((int) class422.aFloat4777
			 >> aClass538_10676.anInt7148 * -1532596617);
	    int i_15_ = 0;
	    if (i == 1980357015 * ((Class538) aClass538_10676).anInt7167)
		i_15_++;
	    else if (1980357015 * ((Class538) aClass538_10676).anInt7167 < i)
		i_15_ += 2;
	    if (i_14_ == ((Class538) aClass538_10676).anInt7185 * -1890816403)
		i_15_ += 3;
	    else if (-1890816403 * ((Class538) aClass538_10676).anInt7185
		     > i_14_)
		i_15_ += 6;
	    int i_16_ = anIntArray11709[i_15_];
	    if ((aShort11707 & i_16_) == 0) {
		if (1 == aShort11707 && i > 0)
		    i--;
		else if (aShort11707 == 4
			 && i <= aClass538_10676.anInt7158 * -1102718643)
		    i++;
		else if (aShort11707 == 8 && i_14_ > 0)
		    i_14_--;
		else if (2 == aShort11707
			 && i_14_ <= -532233529 * aClass538_10676.anInt7159)
		    i_14_++;
		else if (16 == aShort11707 && i > 0
			 && i_14_ <= aClass538_10676.anInt7159 * -532233529) {
		    i--;
		    i_14_++;
		} else if (32 == aShort11707
			   && i <= -1102718643 * aClass538_10676.anInt7158
			   && (i_14_
			       <= -532233529 * aClass538_10676.anInt7159)) {
		    i++;
		    i_14_++;
		} else if (aShort11707 == 128 && i > 0 && i_14_ > 0) {
		    i--;
		    i_14_--;
		} else if (aShort11707 == 64
			   && i <= aClass538_10676.anInt7158 * -1102718643
			   && i_14_ > 0) {
		    i++;
		    i_14_--;
		} else
		    throw new RuntimeException("");
	    }
	    ((Class645_Sub1_Sub3) this).anInt11712
		= method9807(i, i_14_,
			     (((Class645_Sub1_Sub3) this)
			      .aClass528_Sub12Array11701),
			     303539092) * 2023427641;
	    aBool8373 = false;
	}
	for (int i = 0; i < ((Class645_Sub1_Sub3) this).anInt11712 * 384860169;
	     i++)
	    class528_sub12s[i]
		= ((Class645_Sub1_Sub3) this).aClass528_Sub12Array11701[i];
	return ((Class645_Sub1_Sub3) this).anInt11712 * 384860169;
    }
    
    boolean method9816() {
	Class422 class422 = method7693().aClass422_4868;
	return (((Class538) aClass538_10676).aBoolArrayArray7210
		[(((Class538) aClass538_10676).anInt7190 * -117642839
		  + (((int) class422.aFloat4780
		      >> aClass538_10676.anInt7148 * -1532596617)
		     - 1980357015 * ((Class538) aClass538_10676).anInt7167))]
		[(((int) class422.aFloat4777
		   >> aClass538_10676.anInt7148 * -1532596617)
		  - ((Class538) aClass538_10676).anInt7185 * -1890816403
		  + -117642839 * ((Class538) aClass538_10676).anInt7190)]);
    }
    
    boolean method9814(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	return (aClass538_10676.aClass559_7156.method6784
		(this, aByte10674,
		 ((int) class422.aFloat4780
		  >> aClass538_10676.anInt7148 * -1532596617),
		 ((int) class422.aFloat4777
		  >> -1532596617 * aClass538_10676.anInt7148)));
    }
    
    boolean method9815(Class173 class173) {
	Class422 class422 = method7693().aClass422_4868;
	return (aClass538_10676.aClass559_7156.method6784
		(this, aByte10674,
		 ((int) class422.aFloat4780
		  >> aClass538_10676.anInt7148 * -1532596617),
		 ((int) class422.aFloat4777
		  >> -1532596617 * aClass538_10676.anInt7148)));
    }
    
    boolean method9782(byte i) {
	Class422 class422 = method7693().aClass422_4868;
	return (((Class538) aClass538_10676).aBoolArrayArray7210
		[(((Class538) aClass538_10676).anInt7190 * -117642839
		  + (((int) class422.aFloat4780
		      >> aClass538_10676.anInt7148 * -1532596617)
		     - 1980357015 * ((Class538) aClass538_10676).anInt7167))]
		[(((int) class422.aFloat4777
		   >> aClass538_10676.anInt7148 * -1532596617)
		  - ((Class538) aClass538_10676).anInt7185 * -1890816403
		  + -117642839 * ((Class538) aClass538_10676).anInt7190)]);
    }
    
    boolean method9799() {
	Class422 class422 = method7693().aClass422_4868;
	return (((Class538) aClass538_10676).aBoolArrayArray7210
		[(((Class538) aClass538_10676).anInt7190 * -117642839
		  + (((int) class422.aFloat4780
		      >> aClass538_10676.anInt7148 * -1532596617)
		     - 1980357015 * ((Class538) aClass538_10676).anInt7167))]
		[(((int) class422.aFloat4777
		   >> aClass538_10676.anInt7148 * -1532596617)
		  - ((Class538) aClass538_10676).anInt7185 * -1890816403
		  + -117642839 * ((Class538) aClass538_10676).anInt7190)]);
    }
}
