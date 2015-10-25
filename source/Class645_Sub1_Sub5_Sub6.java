/* Class645_Sub1_Sub5_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class645_Sub1_Sub5_Sub6 extends Class645_Sub1_Sub5
{
    public int anInt12008;
    int anInt12009;
    boolean aBool12010;
    public int anInt12011;
    double aDouble12012;
    int anInt12013;
    int anInt12014;
    Class612 aClass612_12015;
    public int anInt12016;
    int anInt12017;
    double aDouble12018;
    boolean aBool12019 = false;
    int anInt12020;
    double aDouble12021;
    boolean aBool12022;
    double aDouble12023;
    double aDouble12024;
    Class690 aClass690_12025;
    public int anInt12026;
    int anInt12027 = 0;
    int anInt12028;
    int anInt12029;
    
    void method10658() {
	Class422 class422 = method7693().aClass422_4868;
	aShort11747 = aShort11743
	    = (short) (int) (class422.aFloat4780 / 512.0F);
	aShort11745 = aShort11746
	    = (short) (int) (class422.aFloat4777 / 512.0F);
    }
    
    boolean method9797(int i) {
	return false;
    }
    
    boolean method9775(short i) {
	return ((Class645_Sub1_Sub5_Sub6) this).aBool12022;
    }
    
    public int method10878(byte i) {
	return ((Class645_Sub1_Sub5_Sub6) this).anInt12029 * -92716289;
    }
    
    final boolean method9802() {
	return false;
    }
    
    public void method10879() {
	if (!((Class645_Sub1_Sub5_Sub6) this).aBool12019) {
	    if (0
		!= 1445352189 * ((Class645_Sub1_Sub5_Sub6) this).anInt12028) {
		Entity class645_sub1_sub5_sub1 = null;
		if (client.anInt10943 * 345087519 == 0)
		    class645_sub1_sub5_sub1
			= Class185.aClass182Array2106
			      [1445352189 * (((Class645_Sub1_Sub5_Sub6) this)
					     .anInt12028) - 1]
			      .method2689(-1012043543);
		else if ((1445352189
			  * ((Class645_Sub1_Sub5_Sub6) this).anInt12028)
			 < 0) {
		    int i = (-(1445352189
			       * ((Class645_Sub1_Sub5_Sub6) this).anInt12028)
			     - 1);
		    if (i == -1453744879 * client.anInt11025)
			class645_sub1_sub5_sub1
			    = Class108.myPlayer;
		    else
			class645_sub1_sub5_sub1
			    = (client.localPlayers
			       [i]);
		} else {
		    int i = ((((Class645_Sub1_Sub5_Sub6) this).anInt12028
			      * 1445352189)
			     - 1);
		    Class528_Sub31 class528_sub31
			= ((Class528_Sub31)
			   client.aClass692_11110.method8137((long) i));
		    if (class528_sub31 != null)
			class645_sub1_sub5_sub1
			    = ((Entity)
			       class528_sub31.anObject10468);
		}
		if (class645_sub1_sub5_sub1 != null) {
		    Class422 class422
			= class645_sub1_sub5_sub1.method7693().aClass422_4868;
		    method7682(class422.aFloat4780,
			       (float) ((Class335_Sub1_Sub1.method10374
					 ((int) class422.aFloat4780,
					  (int) class422.aFloat4777,
					  aByte10675, -759833206))
					- (((Class645_Sub1_Sub5_Sub6) this)
					   .anInt12009) * 159441307),
			       class422.aFloat4777);
		    if ((-1911266675
			 * ((Class645_Sub1_Sub5_Sub6) this).anInt12020)
			>= 0) {
			RenderType renderType
			    = class645_sub1_sub5_sub1.getRender(4526706);
			int i = 0;
			int i_0_ = 0;
			if (renderType.anIntArrayArray7678 != null
			    && null != (renderType.anIntArrayArray7678
					[(-1911266675
					  * (((Class645_Sub1_Sub5_Sub6) this)
					     .anInt12020))])) {
			    i += (renderType.anIntArrayArray7678
				  [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						  this).anInt12020]
				  [0]);
			    i_0_ += (renderType.anIntArrayArray7678
				     [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						     this).anInt12020]
				     [2]);
			}
			if (null != renderType.anIntArrayArray7675
			    && (renderType.anIntArrayArray7675
				[-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						this).anInt12020]) != null) {
			    i += (renderType.anIntArrayArray7675
				  [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						  this).anInt12020]
				  [0]);
			    i_0_ += (renderType.anIntArrayArray7675
				     [(((Class645_Sub1_Sub5_Sub6) this)
				       .anInt12020) * -1911266675]
				     [2]);
			}
			if (0 != i || i_0_ != 0) {
			    int i_1_ = class645_sub1_sub5_sub1
					   .aClass37_11809
					   .method795(-835572511);
			    int i_2_ = i_1_;
			    if (null != class645_sub1_sub5_sub1.anIntArray11805
				&& -1 != (class645_sub1_sub5_sub1
					  .anIntArray11805
					  [(((Class645_Sub1_Sub5_Sub6) this)
					    .anInt12020) * -1911266675]))
				i_2_ = (class645_sub1_sub5_sub1.anIntArray11805
					[(-1911266675
					  * (((Class645_Sub1_Sub5_Sub6) this)
					     .anInt12020))]);
			    int i_3_ = i_2_ - i_1_ & 0x3fff;
			    int i_4_ = Class417.anIntArray4766[i_3_];
			    int i_5_ = Class417.anIntArray4767[i_3_];
			    int i_6_ = i_4_ * i_0_ + i_5_ * i >> 14;
			    i_0_ = i_5_ * i_0_ - i_4_ * i >> 14;
			    i = i_6_;
			    Class422 class422_7_
				= Class422
				      .method5052(method7693().aClass422_4868);
			    class422_7_.aFloat4780 += (float) i;
			    class422_7_.aFloat4777 += (float) i_0_;
			    method7688(class422_7_);
			    class422_7_.method5054();
			}
		    }
		}
	    }
	}
    }
    
    public void method10880(int i) {
	if (!((Class645_Sub1_Sub5_Sub6) this).aBool12019) {
	    if (0
		!= 1445352189 * ((Class645_Sub1_Sub5_Sub6) this).anInt12028) {
		Entity class645_sub1_sub5_sub1 = null;
		if (client.anInt10943 * 345087519 == 0)
		    class645_sub1_sub5_sub1
			= Class185.aClass182Array2106
			      [1445352189 * (((Class645_Sub1_Sub5_Sub6) this)
					     .anInt12028) - 1]
			      .method2689(-1012043543);
		else if ((1445352189
			  * ((Class645_Sub1_Sub5_Sub6) this).anInt12028)
			 < 0) {
		    int i_8_
			= (-(1445352189
			     * ((Class645_Sub1_Sub5_Sub6) this).anInt12028)
			   - 1);
		    if (i_8_ == -1453744879 * client.anInt11025)
			class645_sub1_sub5_sub1
			    = Class108.myPlayer;
		    else
			class645_sub1_sub5_sub1
			    = (client.localPlayers
			       [i_8_]);
		} else {
		    int i_9_ = ((((Class645_Sub1_Sub5_Sub6) this).anInt12028
				 * 1445352189)
				- 1);
		    Class528_Sub31 class528_sub31
			= ((Class528_Sub31)
			   client.aClass692_11110.method8137((long) i_9_));
		    if (class528_sub31 != null)
			class645_sub1_sub5_sub1
			    = ((Entity)
			       class528_sub31.anObject10468);
		}
		if (class645_sub1_sub5_sub1 != null) {
		    Class422 class422
			= class645_sub1_sub5_sub1.method7693().aClass422_4868;
		    method7682(class422.aFloat4780,
			       (float) ((Class335_Sub1_Sub1.method10374
					 ((int) class422.aFloat4780,
					  (int) class422.aFloat4777,
					  aByte10675, -759833206))
					- (((Class645_Sub1_Sub5_Sub6) this)
					   .anInt12009) * 159441307),
			       class422.aFloat4777);
		    if ((-1911266675
			 * ((Class645_Sub1_Sub5_Sub6) this).anInt12020)
			>= 0) {
			RenderType renderType
			    = class645_sub1_sub5_sub1.getRender(759457992);
			int i_10_ = 0;
			int i_11_ = 0;
			if (renderType.anIntArrayArray7678 != null
			    && null != (renderType.anIntArrayArray7678
					[(-1911266675
					  * (((Class645_Sub1_Sub5_Sub6) this)
					     .anInt12020))])) {
			    i_10_ += (renderType.anIntArrayArray7678
				      [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						      this).anInt12020]
				      [0]);
			    i_11_ += (renderType.anIntArrayArray7678
				      [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						      this).anInt12020]
				      [2]);
			}
			if (null != renderType.anIntArrayArray7675
			    && (renderType.anIntArrayArray7675
				[-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						this).anInt12020]) != null) {
			    i_10_ += (renderType.anIntArrayArray7675
				      [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						      this).anInt12020]
				      [0]);
			    i_11_ += (renderType.anIntArrayArray7675
				      [(((Class645_Sub1_Sub5_Sub6) this)
					.anInt12020) * -1911266675]
				      [2]);
			}
			if (0 != i_10_ || i_11_ != 0) {
			    int i_12_ = class645_sub1_sub5_sub1
					    .aClass37_11809
					    .method795(1598721760);
			    int i_13_ = i_12_;
			    if (null != class645_sub1_sub5_sub1.anIntArray11805
				&& -1 != (class645_sub1_sub5_sub1
					  .anIntArray11805
					  [(((Class645_Sub1_Sub5_Sub6) this)
					    .anInt12020) * -1911266675]))
				i_13_
				    = (class645_sub1_sub5_sub1.anIntArray11805
				       [(-1911266675
					 * (((Class645_Sub1_Sub5_Sub6) this)
					    .anInt12020))]);
			    int i_14_ = i_13_ - i_12_ & 0x3fff;
			    int i_15_ = Class417.anIntArray4766[i_14_];
			    int i_16_ = Class417.anIntArray4767[i_14_];
			    int i_17_ = i_15_ * i_11_ + i_16_ * i_10_ >> 14;
			    i_11_ = i_16_ * i_11_ - i_15_ * i_10_ >> 14;
			    i_10_ = i_17_;
			    Class422 class422_18_
				= Class422
				      .method5052(method7693().aClass422_4868);
			    class422_18_.aFloat4780 += (float) i_10_;
			    class422_18_.aFloat4777 += (float) i_11_;
			    method7688(class422_18_);
			    class422_18_.method5054();
			}
		    }
		}
	    }
	}
    }
    
    public final void method10881(int i, int i_19_) {
	((Class645_Sub1_Sub5_Sub6) this).aBool12019 = true;
	Class437 class437 = new Class437(method7693());
	class437.aClass422_4868.aFloat4780
	    += (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12012;
	class437.aClass422_4868.aFloat4777
	    += (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12021;
	if (((Class645_Sub1_Sub5_Sub6) this).aBool12010)
	    class437.aClass422_4868.aFloat4776
		= (float) ((Class335_Sub1_Sub1.method10374
			    ((int) class437.aClass422_4868.aFloat4780,
			     (int) class437.aClass422_4868.aFloat4777,
			     aByte10675, -759833206))
			   - (((Class645_Sub1_Sub5_Sub6) this).anInt12009
			      * 159441307));
	else if (-1789199283 * ((Class645_Sub1_Sub5_Sub6) this).anInt12013
		 != -1) {
	    class437.aClass422_4868.aFloat4776
		+= (((Class645_Sub1_Sub5_Sub6) this).aDouble12023 * (double) i
		    + ((double) i
		       * (((Class645_Sub1_Sub5_Sub6) this).aDouble12024 * 0.5)
		       * (double) i));
	    ((Class645_Sub1_Sub5_Sub6) this).aDouble12023
		+= (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12024;
	} else
	    class437.aClass422_4868.aFloat4776
		+= (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12023;
	class437.aClass430_4869.method5168
	    (1.0F, 0.0F, 0.0F,
	     (float) Math.atan2(((Class645_Sub1_Sub5_Sub6) this).aDouble12023,
				(((Class645_Sub1_Sub5_Sub6) this)
				 .aDouble12018)));
	Class430 class430 = Class430.method5188();
	class430.method5168
	    (0.0F, 1.0F, 0.0F,
	     ((float) Math.atan2(((Class645_Sub1_Sub5_Sub6) this).aDouble12012,
				 ((Class645_Sub1_Sub5_Sub6) this).aDouble12021)
	      - 3.1415927F));
	class437.aClass430_4869.method5176(class430);
	class430.method5194();
	method7698(class437);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		.method8080(1, (byte) 11)
	    && ((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		   .method8082(-908043829))
	    ((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		.method8084(-199795800);
    }
    
    public int method9819(int i) {
	return 2107863503 * ((Class645_Sub1_Sub5_Sub6) this).anInt12027;
    }
    
    Class549 method9813(Class173 class173, int i) {
	Class157 class157 = method10884(class173, 2048, 1252496788);
	if (null == class157)
	    return null;
	Class433 class433 = method7685();
	method10882(class173, class157, class433, 101632452);
	Class549 class549 = Class623.method7435(false, 1023850531);
	class157.method1897(class433, aClass159Array10678[0], 0);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass612_12015 != null) {
	    Class171 class171 = ((Class645_Sub1_Sub5_Sub6) this)
				    .aClass612_12015.method7312();
	    class173.method2209(class171);
	}
	((Class645_Sub1_Sub5_Sub6) this).aBool12022 = class157.method1919();
	class157.method1901();
	((Class645_Sub1_Sub5_Sub6) this).anInt12027
	    = class157.method2018() * 1065219375;
	return class549;
    }
    
    boolean method9783() {
	return false;
    }
    
    void method10656(int i) {
	Class422 class422 = method7693().aClass422_4868;
	aShort11747 = aShort11743
	    = (short) (int) (class422.aFloat4780 / 512.0F);
	aShort11745 = aShort11746
	    = (short) (int) (class422.aFloat4777 / 512.0F);
    }
    
    void method10882(Class173 class173, Class157 class157, Class433 class433,
		     int i) {
	class157.method1921(class433);
	Class170[] class170s = class157.method1922();
	Class144[] class144s = class157.method1923();
	if ((null == ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015
	     || ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.aBool7979)
	    && (null != class170s || null != class144s))
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015
		= Class612.method7315(client.anInt11127, true);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass612_12015 != null) {
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.method7306
		(class173, (long) client.anInt11127, class170s, class144s,
		 false);
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.method7303
		(aByte10675, aShort11747, aShort11743, aShort11745,
		 aShort11746);
	}
    }
    
    Class549 method9776(Class173 class173) {
	Class157 class157 = method10884(class173, 2048, 1951591536);
	if (null == class157)
	    return null;
	Class433 class433 = method7685();
	method10882(class173, class157, class433, 101632452);
	Class549 class549 = Class623.method7435(false, 517612479);
	class157.method1897(class433, aClass159Array10678[0], 0);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass612_12015 != null) {
	    Class171 class171 = ((Class645_Sub1_Sub5_Sub6) this)
				    .aClass612_12015.method7312();
	    class173.method2209(class171);
	}
	((Class645_Sub1_Sub5_Sub6) this).aBool12022 = class157.method1919();
	class157.method1901();
	((Class645_Sub1_Sub5_Sub6) this).anInt12027
	    = class157.method2018() * 1065219375;
	return class549;
    }
    
    public final void method10883(int i, int i_20_, int i_21_, int i_22_,
				  int i_23_) {
	Class422 class422 = Class422.method5052(method7693().aClass422_4868);
	if (!((Class645_Sub1_Sub5_Sub6) this).aBool12019) {
	    float f = (float) i - class422.aFloat4780;
	    float f_24_ = (float) i_20_ - class422.aFloat4777;
	    float f_25_ = (float) Math.sqrt((double) (f_24_ * f_24_ + f * f));
	    if (f_25_ != 0.0F) {
		class422.aFloat4780
		    += f * (float) (-308903953
				    * (((Class645_Sub1_Sub5_Sub6) this)
				       .anInt12014)) / f_25_;
		class422.aFloat4777
		    += (f_24_
			* (float) (((Class645_Sub1_Sub5_Sub6) this).anInt12014
				   * -308903953)
			/ f_25_);
	    }
	    if (((Class645_Sub1_Sub5_Sub6) this).aBool12010)
		class422.aFloat4776
		    = (float) ((Class335_Sub1_Sub1.method10374
				((int) class422.aFloat4780,
				 (int) class422.aFloat4777, aByte10675,
				 -759833206))
			       - (((Class645_Sub1_Sub5_Sub6) this).anInt12009
				  * 159441307));
	    method7688(class422);
	}
	double d = (double) (anInt12008 * -108038505 + 1 - i_22_);
	((Class645_Sub1_Sub5_Sub6) this).aDouble12012
	    = (double) ((float) i - class422.aFloat4780) / d;
	((Class645_Sub1_Sub5_Sub6) this).aDouble12021
	    = (double) ((float) i_20_ - class422.aFloat4777) / d;
	((Class645_Sub1_Sub5_Sub6) this).aDouble12018
	    = Math.sqrt((((Class645_Sub1_Sub5_Sub6) this).aDouble12012
			 * ((Class645_Sub1_Sub5_Sub6) this).aDouble12012)
			+ (((Class645_Sub1_Sub5_Sub6) this).aDouble12021
			   * ((Class645_Sub1_Sub5_Sub6) this).aDouble12021));
	if (((Class645_Sub1_Sub5_Sub6) this).anInt12013 * -1789199283 != -1) {
	    if (!((Class645_Sub1_Sub5_Sub6) this).aBool12019)
		((Class645_Sub1_Sub5_Sub6) this).aDouble12023
		    = (-((Class645_Sub1_Sub5_Sub6) this).aDouble12018
		       * Math.tan(0.02454369
				  * (double) (-1789199283
					      * ((Class645_Sub1_Sub5_Sub6)
						 this).anInt12013)));
	    ((Class645_Sub1_Sub5_Sub6) this).aDouble12024
		= (((double) ((float) i_21_ - class422.aFloat4776)
		    - ((Class645_Sub1_Sub5_Sub6) this).aDouble12023 * d)
		   * 2.0 / (d * d));
	} else
	    ((Class645_Sub1_Sub5_Sub6) this).aDouble12023
		= (double) ((float) i_21_ - class422.aFloat4776) / d;
	class422.method5054();
    }
    
    void method9779(Class173 class173, int i) {
	Class157 class157 = method10884(class173, 0, 1426120946);
	if (class157 != null) {
	    Class433 class433 = method7685();
	    ((Class645_Sub1_Sub5_Sub6) this).anInt12027
		= class157.method2018() * 1065219375;
	    class157.method1901();
	    method10882(class173, class157, class433, 101632452);
	}
    }
    
    final void method9798(Class173 class173, Class645_Sub1 class645_sub1,
			  int i, int i_26_, int i_27_, boolean bool,
			  int i_28_) {
	throw new IllegalStateException();
    }
    
    final void method9777(int i) {
	throw new IllegalStateException();
    }
    
    boolean method9772() {
	return false;
    }
    
    Class157 method10884(Class173 class173, int i, int i_29_) {
	Class669 class669
	    = ((Class669)
	       Class2.aClass5_Sub12_24.method63((((Class645_Sub1_Sub5_Sub6)
						  this).anInt12017
						 * -2043330897),
						721031641));
	return class669.method7927(class173, i,
				   (((Class645_Sub1_Sub5_Sub6) this)
				    .aClass690_12025),
				   (byte) 2, (byte) -23);
    }
    
    boolean method9789() {
	return false;
    }
    
    boolean method9790() {
	return ((Class645_Sub1_Sub5_Sub6) this).aBool12022;
    }
    
    final boolean method9771(int i) {
	return false;
    }
    
    public Class645_Sub1_Sub5_Sub6
	(Class538 class538, int i, int i_30_, int i_31_, int i_32_, int i_33_,
	 int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_,
	 int i_40_, int i_41_, boolean bool, int i_42_, int i_43_) {
	super(class538, i_30_, i_31_, i_32_,
	      (Class335_Sub1_Sub1.method10374(i_32_, i_33_, i_30_, -759833206)
	       - i_34_),
	      i_33_, i_32_ >> 9, i_32_ >> 9, i_33_ >> 9, i_33_ >> 9, false,
	      (byte) 0);
	((Class645_Sub1_Sub5_Sub6) this).aBool12022 = false;
	((Class645_Sub1_Sub5_Sub6) this).anInt12029 = 0;
	((Class645_Sub1_Sub5_Sub6) this).anInt12017 = -575481777 * i;
	anInt12011 = i_35_ * -1087880085;
	anInt12008 = 1369925927 * i_36_;
	((Class645_Sub1_Sub5_Sub6) this).anInt12013 = i_37_ * 1542233221;
	((Class645_Sub1_Sub5_Sub6) this).anInt12014 = -255291633 * i_38_;
	((Class645_Sub1_Sub5_Sub6) this).anInt12028 = -1686644139 * i_39_;
	anInt12016 = i_40_ * 629513109;
	((Class645_Sub1_Sub5_Sub6) this).anInt12009 = i_34_ * 1322032275;
	anInt12026 = 472790969 * i_41_;
	((Class645_Sub1_Sub5_Sub6) this).aBool12010 = bool;
	((Class645_Sub1_Sub5_Sub6) this).aBool12019 = false;
	((Class645_Sub1_Sub5_Sub6) this).anInt12020 = i_42_ * 1004744773;
	((Class645_Sub1_Sub5_Sub6) this).anInt12029 = -1023558401 * i_43_;
	int i_44_
	    = (((Class669)
		Class2.aClass5_Sub12_24.method63((-2043330897
						  * ((Class645_Sub1_Sub5_Sub6)
						     this).anInt12017),
						 -284285113)).anInt8519
	       * 916695593);
	((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
	    = new Class690_Sub1(this, false);
	((Class645_Sub1_Sub5_Sub6) this).aClass690_12025.method8069(i_44_,
								    (byte) 12);
	method9786(1, 766617455);
    }
    
    public int method9793() {
	return 2107863503 * ((Class645_Sub1_Sub5_Sub6) this).anInt12027;
    }
    
    public Class554 method9794(Class173 class173) {
	return null;
    }
    
    final boolean method9803() {
	return false;
    }
    
    Class549 method9787(Class173 class173) {
	Class157 class157 = method10884(class173, 2048, 1350128713);
	if (null == class157)
	    return null;
	Class433 class433 = method7685();
	method10882(class173, class157, class433, 101632452);
	Class549 class549 = Class623.method7435(false, 1552530836);
	class157.method1897(class433, aClass159Array10678[0], 0);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass612_12015 != null) {
	    Class171 class171 = ((Class645_Sub1_Sub5_Sub6) this)
				    .aClass612_12015.method7312();
	    class173.method2209(class171);
	}
	((Class645_Sub1_Sub5_Sub6) this).aBool12022 = class157.method1919();
	class157.method1901();
	((Class645_Sub1_Sub5_Sub6) this).anInt12027
	    = class157.method2018() * 1065219375;
	return class549;
    }
    
    Class549 method9778(Class173 class173) {
	Class157 class157 = method10884(class173, 2048, 1635798125);
	if (null == class157)
	    return null;
	Class433 class433 = method7685();
	method10882(class173, class157, class433, 101632452);
	Class549 class549 = Class623.method7435(false, 350602959);
	class157.method1897(class433, aClass159Array10678[0], 0);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass612_12015 != null) {
	    Class171 class171 = ((Class645_Sub1_Sub5_Sub6) this)
				    .aClass612_12015.method7312();
	    class173.method2209(class171);
	}
	((Class645_Sub1_Sub5_Sub6) this).aBool12022 = class157.method1919();
	class157.method1901();
	((Class645_Sub1_Sub5_Sub6) this).anInt12027
	    = class157.method2018() * 1065219375;
	return class549;
    }
    
    public Class554 method9795(Class173 class173) {
	return null;
    }
    
    void method9800(Class173 class173) {
	Class157 class157 = method10884(class173, 0, 2033974175);
	if (class157 != null) {
	    Class433 class433 = method7685();
	    ((Class645_Sub1_Sub5_Sub6) this).anInt12027
		= class157.method2018() * 1065219375;
	    class157.method1901();
	    method10882(class173, class157, class433, 101632452);
	}
    }
    
    public int method9792() {
	return 2107863503 * ((Class645_Sub1_Sub5_Sub6) this).anInt12027;
    }
    
    boolean method9774(Class173 class173, int i, int i_45_) {
	return false;
    }
    
    public void method10885(int i) {
	if (null != ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015)
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.method7304();
    }
    
    final void method9808() {
	throw new IllegalStateException();
    }
    
    final void method9804(Class173 class173, Class645_Sub1 class645_sub1,
			  int i, int i_46_, int i_47_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method9805() {
	throw new IllegalStateException();
    }
    
    void method10655() {
	Class422 class422 = method7693().aClass422_4868;
	aShort11747 = aShort11743
	    = (short) (int) (class422.aFloat4780 / 512.0F);
	aShort11745 = aShort11746
	    = (short) (int) (class422.aFloat4777 / 512.0F);
    }
    
    final void method9806() {
	throw new IllegalStateException();
    }
    
    public int method10886() {
	return ((Class645_Sub1_Sub5_Sub6) this).anInt12029 * -92716289;
    }
    
    public final void method10887(int i, int i_48_, int i_49_, int i_50_) {
	Class422 class422 = Class422.method5052(method7693().aClass422_4868);
	if (!((Class645_Sub1_Sub5_Sub6) this).aBool12019) {
	    float f = (float) i - class422.aFloat4780;
	    float f_51_ = (float) i_48_ - class422.aFloat4777;
	    float f_52_ = (float) Math.sqrt((double) (f_51_ * f_51_ + f * f));
	    if (f_52_ != 0.0F) {
		class422.aFloat4780
		    += f * (float) (-308903953
				    * (((Class645_Sub1_Sub5_Sub6) this)
				       .anInt12014)) / f_52_;
		class422.aFloat4777
		    += (f_51_
			* (float) (((Class645_Sub1_Sub5_Sub6) this).anInt12014
				   * -308903953)
			/ f_52_);
	    }
	    if (((Class645_Sub1_Sub5_Sub6) this).aBool12010)
		class422.aFloat4776
		    = (float) ((Class335_Sub1_Sub1.method10374
				((int) class422.aFloat4780,
				 (int) class422.aFloat4777, aByte10675,
				 -759833206))
			       - (((Class645_Sub1_Sub5_Sub6) this).anInt12009
				  * 159441307));
	    method7688(class422);
	}
	double d = (double) (anInt12008 * -108038505 + 1 - i_50_);
	((Class645_Sub1_Sub5_Sub6) this).aDouble12012
	    = (double) ((float) i - class422.aFloat4780) / d;
	((Class645_Sub1_Sub5_Sub6) this).aDouble12021
	    = (double) ((float) i_48_ - class422.aFloat4777) / d;
	((Class645_Sub1_Sub5_Sub6) this).aDouble12018
	    = Math.sqrt((((Class645_Sub1_Sub5_Sub6) this).aDouble12012
			 * ((Class645_Sub1_Sub5_Sub6) this).aDouble12012)
			+ (((Class645_Sub1_Sub5_Sub6) this).aDouble12021
			   * ((Class645_Sub1_Sub5_Sub6) this).aDouble12021));
	if (((Class645_Sub1_Sub5_Sub6) this).anInt12013 * -1789199283 != -1) {
	    if (!((Class645_Sub1_Sub5_Sub6) this).aBool12019)
		((Class645_Sub1_Sub5_Sub6) this).aDouble12023
		    = (-((Class645_Sub1_Sub5_Sub6) this).aDouble12018
		       * Math.tan(0.02454369
				  * (double) (-1789199283
					      * ((Class645_Sub1_Sub5_Sub6)
						 this).anInt12013)));
	    ((Class645_Sub1_Sub5_Sub6) this).aDouble12024
		= (((double) ((float) i_49_ - class422.aFloat4776)
		    - ((Class645_Sub1_Sub5_Sub6) this).aDouble12023 * d)
		   * 2.0 / (d * d));
	} else
	    ((Class645_Sub1_Sub5_Sub6) this).aDouble12023
		= (double) ((float) i_49_ - class422.aFloat4776) / d;
	class422.method5054();
    }
    
    public Class554 method9780(Class173 class173, int i) {
	return null;
    }
    
    public void method10888() {
	if (!((Class645_Sub1_Sub5_Sub6) this).aBool12019) {
	    if (0
		!= 1445352189 * ((Class645_Sub1_Sub5_Sub6) this).anInt12028) {
		Entity class645_sub1_sub5_sub1 = null;
		if (client.anInt10943 * 345087519 == 0)
		    class645_sub1_sub5_sub1
			= Class185.aClass182Array2106
			      [1445352189 * (((Class645_Sub1_Sub5_Sub6) this)
					     .anInt12028) - 1]
			      .method2689(-1012043543);
		else if ((1445352189
			  * ((Class645_Sub1_Sub5_Sub6) this).anInt12028)
			 < 0) {
		    int i = (-(1445352189
			       * ((Class645_Sub1_Sub5_Sub6) this).anInt12028)
			     - 1);
		    if (i == -1453744879 * client.anInt11025)
			class645_sub1_sub5_sub1
			    = Class108.myPlayer;
		    else
			class645_sub1_sub5_sub1
			    = (client.localPlayers
			       [i]);
		} else {
		    int i = ((((Class645_Sub1_Sub5_Sub6) this).anInt12028
			      * 1445352189)
			     - 1);
		    Class528_Sub31 class528_sub31
			= ((Class528_Sub31)
			   client.aClass692_11110.method8137((long) i));
		    if (class528_sub31 != null)
			class645_sub1_sub5_sub1
			    = ((Entity)
			       class528_sub31.anObject10468);
		}
		if (class645_sub1_sub5_sub1 != null) {
		    Class422 class422
			= class645_sub1_sub5_sub1.method7693().aClass422_4868;
		    method7682(class422.aFloat4780,
			       (float) ((Class335_Sub1_Sub1.method10374
					 ((int) class422.aFloat4780,
					  (int) class422.aFloat4777,
					  aByte10675, -759833206))
					- (((Class645_Sub1_Sub5_Sub6) this)
					   .anInt12009) * 159441307),
			       class422.aFloat4777);
		    if ((-1911266675
			 * ((Class645_Sub1_Sub5_Sub6) this).anInt12020)
			>= 0) {
			RenderType renderType
			    = class645_sub1_sub5_sub1.getRender(-2004436609);
			int i = 0;
			int i_53_ = 0;
			if (renderType.anIntArrayArray7678 != null
			    && null != (renderType.anIntArrayArray7678
					[(-1911266675
					  * (((Class645_Sub1_Sub5_Sub6) this)
					     .anInt12020))])) {
			    i += (renderType.anIntArrayArray7678
				  [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						  this).anInt12020]
				  [0]);
			    i_53_ += (renderType.anIntArrayArray7678
				      [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						      this).anInt12020]
				      [2]);
			}
			if (null != renderType.anIntArrayArray7675
			    && (renderType.anIntArrayArray7675
				[-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						this).anInt12020]) != null) {
			    i += (renderType.anIntArrayArray7675
				  [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						  this).anInt12020]
				  [0]);
			    i_53_ += (renderType.anIntArrayArray7675
				      [(((Class645_Sub1_Sub5_Sub6) this)
					.anInt12020) * -1911266675]
				      [2]);
			}
			if (0 != i || i_53_ != 0) {
			    int i_54_ = class645_sub1_sub5_sub1
					    .aClass37_11809
					    .method795(252446099);
			    int i_55_ = i_54_;
			    if (null != class645_sub1_sub5_sub1.anIntArray11805
				&& -1 != (class645_sub1_sub5_sub1
					  .anIntArray11805
					  [(((Class645_Sub1_Sub5_Sub6) this)
					    .anInt12020) * -1911266675]))
				i_55_
				    = (class645_sub1_sub5_sub1.anIntArray11805
				       [(-1911266675
					 * (((Class645_Sub1_Sub5_Sub6) this)
					    .anInt12020))]);
			    int i_56_ = i_55_ - i_54_ & 0x3fff;
			    int i_57_ = Class417.anIntArray4766[i_56_];
			    int i_58_ = Class417.anIntArray4767[i_56_];
			    int i_59_ = i_57_ * i_53_ + i_58_ * i >> 14;
			    i_53_ = i_58_ * i_53_ - i_57_ * i >> 14;
			    i = i_59_;
			    Class422 class422_60_
				= Class422
				      .method5052(method7693().aClass422_4868);
			    class422_60_.aFloat4780 += (float) i;
			    class422_60_.aFloat4777 += (float) i_53_;
			    method7688(class422_60_);
			    class422_60_.method5054();
			}
		    }
		}
	    }
	}
    }
    
    public void method10889() {
	if (!((Class645_Sub1_Sub5_Sub6) this).aBool12019) {
	    if (0
		!= 1445352189 * ((Class645_Sub1_Sub5_Sub6) this).anInt12028) {
		Entity class645_sub1_sub5_sub1 = null;
		if (client.anInt10943 * 345087519 == 0)
		    class645_sub1_sub5_sub1
			= Class185.aClass182Array2106
			      [1445352189 * (((Class645_Sub1_Sub5_Sub6) this)
					     .anInt12028) - 1]
			      .method2689(-1012043543);
		else if ((1445352189
			  * ((Class645_Sub1_Sub5_Sub6) this).anInt12028)
			 < 0) {
		    int i = (-(1445352189
			       * ((Class645_Sub1_Sub5_Sub6) this).anInt12028)
			     - 1);
		    if (i == -1453744879 * client.anInt11025)
			class645_sub1_sub5_sub1
			    = Class108.myPlayer;
		    else
			class645_sub1_sub5_sub1
			    = (client.localPlayers
			       [i]);
		} else {
		    int i = ((((Class645_Sub1_Sub5_Sub6) this).anInt12028
			      * 1445352189)
			     - 1);
		    Class528_Sub31 class528_sub31
			= ((Class528_Sub31)
			   client.aClass692_11110.method8137((long) i));
		    if (class528_sub31 != null)
			class645_sub1_sub5_sub1
			    = ((Entity)
			       class528_sub31.anObject10468);
		}
		if (class645_sub1_sub5_sub1 != null) {
		    Class422 class422
			= class645_sub1_sub5_sub1.method7693().aClass422_4868;
		    method7682(class422.aFloat4780,
			       (float) ((Class335_Sub1_Sub1.method10374
					 ((int) class422.aFloat4780,
					  (int) class422.aFloat4777,
					  aByte10675, -759833206))
					- (((Class645_Sub1_Sub5_Sub6) this)
					   .anInt12009) * 159441307),
			       class422.aFloat4777);
		    if ((-1911266675
			 * ((Class645_Sub1_Sub5_Sub6) this).anInt12020)
			>= 0) {
			RenderType renderType
			    = class645_sub1_sub5_sub1.getRender(970015286);
			int i = 0;
			int i_61_ = 0;
			if (renderType.anIntArrayArray7678 != null
			    && null != (renderType.anIntArrayArray7678
					[(-1911266675
					  * (((Class645_Sub1_Sub5_Sub6) this)
					     .anInt12020))])) {
			    i += (renderType.anIntArrayArray7678
				  [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						  this).anInt12020]
				  [0]);
			    i_61_ += (renderType.anIntArrayArray7678
				      [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						      this).anInt12020]
				      [2]);
			}
			if (null != renderType.anIntArrayArray7675
			    && (renderType.anIntArrayArray7675
				[-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						this).anInt12020]) != null) {
			    i += (renderType.anIntArrayArray7675
				  [-1911266675 * ((Class645_Sub1_Sub5_Sub6)
						  this).anInt12020]
				  [0]);
			    i_61_ += (renderType.anIntArrayArray7675
				      [(((Class645_Sub1_Sub5_Sub6) this)
					.anInt12020) * -1911266675]
				      [2]);
			}
			if (0 != i || i_61_ != 0) {
			    int i_62_ = class645_sub1_sub5_sub1
					    .aClass37_11809
					    .method795(-315590843);
			    int i_63_ = i_62_;
			    if (null != class645_sub1_sub5_sub1.anIntArray11805
				&& -1 != (class645_sub1_sub5_sub1
					  .anIntArray11805
					  [(((Class645_Sub1_Sub5_Sub6) this)
					    .anInt12020) * -1911266675]))
				i_63_
				    = (class645_sub1_sub5_sub1.anIntArray11805
				       [(-1911266675
					 * (((Class645_Sub1_Sub5_Sub6) this)
					    .anInt12020))]);
			    int i_64_ = i_63_ - i_62_ & 0x3fff;
			    int i_65_ = Class417.anIntArray4766[i_64_];
			    int i_66_ = Class417.anIntArray4767[i_64_];
			    int i_67_ = i_65_ * i_61_ + i_66_ * i >> 14;
			    i_61_ = i_66_ * i_61_ - i_65_ * i >> 14;
			    i = i_67_;
			    Class422 class422_68_
				= Class422
				      .method5052(method7693().aClass422_4868);
			    class422_68_.aFloat4780 += (float) i;
			    class422_68_.aFloat4777 += (float) i_61_;
			    method7688(class422_68_);
			    class422_68_.method5054();
			}
		    }
		}
	    }
	}
    }
    
    public final void method10890(int i) {
	((Class645_Sub1_Sub5_Sub6) this).aBool12019 = true;
	Class437 class437 = new Class437(method7693());
	class437.aClass422_4868.aFloat4780
	    += (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12012;
	class437.aClass422_4868.aFloat4777
	    += (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12021;
	if (((Class645_Sub1_Sub5_Sub6) this).aBool12010)
	    class437.aClass422_4868.aFloat4776
		= (float) ((Class335_Sub1_Sub1.method10374
			    ((int) class437.aClass422_4868.aFloat4780,
			     (int) class437.aClass422_4868.aFloat4777,
			     aByte10675, -759833206))
			   - (((Class645_Sub1_Sub5_Sub6) this).anInt12009
			      * 159441307));
	else if (-1789199283 * ((Class645_Sub1_Sub5_Sub6) this).anInt12013
		 != -1) {
	    class437.aClass422_4868.aFloat4776
		+= (((Class645_Sub1_Sub5_Sub6) this).aDouble12023 * (double) i
		    + ((double) i
		       * (((Class645_Sub1_Sub5_Sub6) this).aDouble12024 * 0.5)
		       * (double) i));
	    ((Class645_Sub1_Sub5_Sub6) this).aDouble12023
		+= (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12024;
	} else
	    class437.aClass422_4868.aFloat4776
		+= (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12023;
	class437.aClass430_4869.method5168
	    (1.0F, 0.0F, 0.0F,
	     (float) Math.atan2(((Class645_Sub1_Sub5_Sub6) this).aDouble12023,
				(((Class645_Sub1_Sub5_Sub6) this)
				 .aDouble12018)));
	Class430 class430 = Class430.method5188();
	class430.method5168
	    (0.0F, 1.0F, 0.0F,
	     ((float) Math.atan2(((Class645_Sub1_Sub5_Sub6) this).aDouble12012,
				 ((Class645_Sub1_Sub5_Sub6) this).aDouble12021)
	      - 3.1415927F));
	class437.aClass430_4869.method5176(class430);
	class430.method5194();
	method7698(class437);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		.method8080(1, (byte) 11)
	    && ((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		   .method8082(-1037487116))
	    ((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		.method8084(-1919773218);
    }
    
    public void method10891() {
	if (null != ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015)
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.method7304();
    }
    
    public final void method10892(int i) {
	((Class645_Sub1_Sub5_Sub6) this).aBool12019 = true;
	Class437 class437 = new Class437(method7693());
	class437.aClass422_4868.aFloat4780
	    += (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12012;
	class437.aClass422_4868.aFloat4777
	    += (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12021;
	if (((Class645_Sub1_Sub5_Sub6) this).aBool12010)
	    class437.aClass422_4868.aFloat4776
		= (float) ((Class335_Sub1_Sub1.method10374
			    ((int) class437.aClass422_4868.aFloat4780,
			     (int) class437.aClass422_4868.aFloat4777,
			     aByte10675, -759833206))
			   - (((Class645_Sub1_Sub5_Sub6) this).anInt12009
			      * 159441307));
	else if (-1789199283 * ((Class645_Sub1_Sub5_Sub6) this).anInt12013
		 != -1) {
	    class437.aClass422_4868.aFloat4776
		+= (((Class645_Sub1_Sub5_Sub6) this).aDouble12023 * (double) i
		    + ((double) i
		       * (((Class645_Sub1_Sub5_Sub6) this).aDouble12024 * 0.5)
		       * (double) i));
	    ((Class645_Sub1_Sub5_Sub6) this).aDouble12023
		+= (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12024;
	} else
	    class437.aClass422_4868.aFloat4776
		+= (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12023;
	class437.aClass430_4869.method5168
	    (1.0F, 0.0F, 0.0F,
	     (float) Math.atan2(((Class645_Sub1_Sub5_Sub6) this).aDouble12023,
				(((Class645_Sub1_Sub5_Sub6) this)
				 .aDouble12018)));
	Class430 class430 = Class430.method5188();
	class430.method5168
	    (0.0F, 1.0F, 0.0F,
	     ((float) Math.atan2(((Class645_Sub1_Sub5_Sub6) this).aDouble12012,
				 ((Class645_Sub1_Sub5_Sub6) this).aDouble12021)
	      - 3.1415927F));
	class437.aClass430_4869.method5176(class430);
	class430.method5194();
	method7698(class437);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		.method8080(1, (byte) 11)
	    && ((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		   .method8082(-654623040))
	    ((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		.method8084(-914404496);
    }
    
    boolean method9801(Class173 class173, int i, int i_69_) {
	return false;
    }
    
    void method10893(Class173 class173, Class157 class157, Class433 class433) {
	class157.method1921(class433);
	Class170[] class170s = class157.method1922();
	Class144[] class144s = class157.method1923();
	if ((null == ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015
	     || ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.aBool7979)
	    && (null != class170s || null != class144s))
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015
		= Class612.method7315(client.anInt11127, true);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass612_12015 != null) {
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.method7306
		(class173, (long) client.anInt11127, class170s, class144s,
		 false);
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.method7303
		(aByte10675, aShort11747, aShort11743, aShort11745,
		 aShort11746);
	}
    }
    
    public final void method10894(int i) {
	((Class645_Sub1_Sub5_Sub6) this).aBool12019 = true;
	Class437 class437 = new Class437(method7693());
	class437.aClass422_4868.aFloat4780
	    += (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12012;
	class437.aClass422_4868.aFloat4777
	    += (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12021;
	if (((Class645_Sub1_Sub5_Sub6) this).aBool12010)
	    class437.aClass422_4868.aFloat4776
		= (float) ((Class335_Sub1_Sub1.method10374
			    ((int) class437.aClass422_4868.aFloat4780,
			     (int) class437.aClass422_4868.aFloat4777,
			     aByte10675, -759833206))
			   - (((Class645_Sub1_Sub5_Sub6) this).anInt12009
			      * 159441307));
	else if (-1789199283 * ((Class645_Sub1_Sub5_Sub6) this).anInt12013
		 != -1) {
	    class437.aClass422_4868.aFloat4776
		+= (((Class645_Sub1_Sub5_Sub6) this).aDouble12023 * (double) i
		    + ((double) i
		       * (((Class645_Sub1_Sub5_Sub6) this).aDouble12024 * 0.5)
		       * (double) i));
	    ((Class645_Sub1_Sub5_Sub6) this).aDouble12023
		+= (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12024;
	} else
	    class437.aClass422_4868.aFloat4776
		+= (double) i * ((Class645_Sub1_Sub5_Sub6) this).aDouble12023;
	class437.aClass430_4869.method5168
	    (1.0F, 0.0F, 0.0F,
	     (float) Math.atan2(((Class645_Sub1_Sub5_Sub6) this).aDouble12023,
				(((Class645_Sub1_Sub5_Sub6) this)
				 .aDouble12018)));
	Class430 class430 = Class430.method5188();
	class430.method5168
	    (0.0F, 1.0F, 0.0F,
	     ((float) Math.atan2(((Class645_Sub1_Sub5_Sub6) this).aDouble12012,
				 ((Class645_Sub1_Sub5_Sub6) this).aDouble12021)
	      - 3.1415927F));
	class437.aClass430_4869.method5176(class430);
	class430.method5194();
	method7698(class437);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		.method8080(1, (byte) 11)
	    && ((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		   .method8082(-1645955428))
	    ((Class645_Sub1_Sub5_Sub6) this).aClass690_12025
		.method8084(-1307173701);
    }
    
    void method10657() {
	Class422 class422 = method7693().aClass422_4868;
	aShort11747 = aShort11743
	    = (short) (int) (class422.aFloat4780 / 512.0F);
	aShort11745 = aShort11746
	    = (short) (int) (class422.aFloat4777 / 512.0F);
    }
    
    boolean method9791() {
	return ((Class645_Sub1_Sub5_Sub6) this).aBool12022;
    }
    
    void method10895(Class173 class173, Class157 class157, Class433 class433) {
	class157.method1921(class433);
	Class170[] class170s = class157.method1922();
	Class144[] class144s = class157.method1923();
	if ((null == ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015
	     || ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.aBool7979)
	    && (null != class170s || null != class144s))
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015
		= Class612.method7315(client.anInt11127, true);
	if (((Class645_Sub1_Sub5_Sub6) this).aClass612_12015 != null) {
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.method7306
		(class173, (long) client.anInt11127, class170s, class144s,
		 false);
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.method7303
		(aByte10675, aShort11747, aShort11743, aShort11745,
		 aShort11746);
	}
    }
    
    boolean method9820(Class173 class173, int i, int i_70_, byte i_71_) {
	return false;
    }
    
    public void method10896() {
	if (null != ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015)
	    ((Class645_Sub1_Sub5_Sub6) this).aClass612_12015.method7304();
    }
}
