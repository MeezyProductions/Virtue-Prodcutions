/* Class531 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class531
{
    int anInt7114;
    byte[] aByteArray7115;
    int anInt7116;
    int anInt7117;
    byte[] aByteArray7118;
    int anInt7119;
    int anInt7120;
    Class558 aClass558_7121;
    int anInt7122;
    float aFloat7123;
    Class364_Sub1 this$0;
    
    void method6466(byte[] is, int i, int i_0_, byte i_1_) {
	int i_2_ = i;
	while (i_2_ < i_0_ + i) {
	    ((Class531) this).aByteArray7115[(568613423
					      * ((Class531) this).anInt7116)]
		= is[i_2_];
	    ((Class531) this).aByteArray7115[1 + 568613423 * (((Class531) this)
							      .anInt7116)]
		= is[i_2_ + 1];
	    i_2_ += 2;
	    ((Class531) this).anInt7116 += -97887842;
	    ((Class531) this).anInt7116
		= 2098539727 * (568613423 * ((Class531) this).anInt7116
				% ((Class531) this).aByteArray7115.length);
	    ((Class531) this).anInt7114 -= 386556742;
	}
    }
    
    int method6467(int i) {
	return 1941408267 * ((Class531) this).anInt7114;
    }
    
    Class531(Class364_Sub1 class364_sub1, Class558 class558, int i, float f,
	     int i_3_, int i_4_, boolean bool, boolean bool_5_) {
	((Class531) this).this$0 = class364_sub1;
	((Class531) this).aClass558_7121 = class558;
	((Class531) this).aByteArray7115 = new byte[i];
	((Class531) this).aByteArray7118 = new byte[i_3_ / 8];
	((Class531) this).anInt7114
	    = 193278371 * ((Class531) this).aByteArray7115.length;
	((Class531) this).aFloat7123 = f;
	((Class531) this).anInt7122 = -146737949 * i_3_;
	((Class531) this).anInt7119 = 1731455749 * i_4_;
	((Class531) this).anInt7116 = 0;
	((Class531) this).anInt7117 = 0;
	((Class531) this).anInt7120 = 0;
    }
    
    int method6468() {
	return 1941408267 * ((Class531) this).anInt7114;
    }
    
    int method6469() {
	return 1941408267 * ((Class531) this).anInt7114;
    }
    
    static final void method6470(Class648 class648, int i) {
	int i_6_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_6_, (byte) 47);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2453 * 1254224115;
    }
    
    static final void method6471(Class648 class648, short i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_7_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_8_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	Class5.method544(i_7_, i_8_ >> 14 & 0x3fff, i_8_ & 0x3fff, false,
			 (byte) -67);
    }
    
    static final void method6472(int i, int i_9_) {
	int i_10_ = client.anInt11127 - client.anInt11136 * 1004838491;
	if (i_10_ >= 100) {
	    Class390.anInt4111 = Class372.method4679(-1640963452) * 1043416901;
	    Class386.anInt4069 = 1476949137;
	    Class690_Sub2.anInt10780 = 1603116895;
	} else {
	    float f = 1.0F - (float) ((100 - i_10_) * (100 - i_10_)
				      * (100 - i_10_)) / 1000000.0F;
	    int i_11_;
	    if (Class372.method4679(-1572006260) == 6) {
		Class528_Sub19 class528_sub19
		    = Class495.aClass283_Sub1_5578.method3811(1165194288)
			  .method4241(-1405057790);
		Class578 class578
		    = client.gameScene.method5966(1273279609);
		Class309_Sub1.anInt9907
		    = ((int) ((double) Class495.aClass283_Sub1_5578
					   .method3791(882092435)
			      * 2607.5945876176133)
		       & 0x3fff) * 2028903323;
		Class653.anInt8429
		    = ((int) ((double) Class495.aClass283_Sub1_5578
					   .method3792(-16777216)
			      * -2607.5945876176133)
		       & 0x3fff) * -1829176741;
		Class48.anInt548 = 0;
		client.anInt11156
		    = (int) ((float) (Class295.anInt3236 * 826581433)
			     + (float) ((int) ((double) (client.anInt11154
							 * 1114720149)
					       / (4.0
						  * (Math.tan
						     ((double) ((Class495
								     .aClass283_Sub1_5578
								     .method3802
								 (2143279579))
								/ 2.0F)))))
					- (Class295.anInt3236
					   * 826581433)) * f) * -933165621;
		Class626.anInt8136
		    = (1636412895
		       * (int) ((float) (969740461 * Class210.anInt2244)
				+ f * (float) ((124815955
						* class528_sub19.anInt10390)
					       - (-1650867712
						  * class578.anInt7607)
					       - (Class210.anInt2244
						  * 969740461))));
		Class137.anInt1630
		    = (1124026061
		       * (int) ((float) (-172365035 * Class375.anInt3938)
				+ ((float) (-(class528_sub19.anInt10394
					      * 1385495327)
					    - -172365035 * Class375.anInt3938)
				   * f)));
		Class227.anInt2347
		    = (397871753
		       * (int) (f * (float) ((class528_sub19.anInt10393
					      * -1852661307)
					     - 1200930304 * class578.anInt7608
					     - -697086055 * Class29.anInt306)
				+ (float) (-697086055 * Class29.anInt306)));
		i_11_ = (-(869770707 * Class653.anInt8429)
			 - Class278.anInt3052 * 1737800327) & 0x3fff;
		if (i_11_ > 8192)
		    i_11_ -= 16384;
		else if (i_11_ < -8192)
		    i_11_ += 16384;
	    } else {
		int i_12_ = (int) client.aFloat11002;
		if (client.anInt10983 * 1320750875 >> 8 > i_12_)
		    i_12_ = 1320750875 * client.anInt10983 >> 8;
		if (client.aBoolArray11139[4]
		    && 128 + client.anIntArray11098[4] > i_12_)
		    i_12_ = client.anIntArray11098[4] + 128;
		int i_13_ = ((-564436957 * client.anInt10911
			      + (int) client.aFloat11088)
			     & 0x3fff);
		Class422 class422
		    = (Class108.myPlayer.method7693()
		       .aClass422_4868);
		Class281.method3743(Class494.anInt5533 * -858645029,
				    ((Class335_Sub1_Sub1.method10374
				      ((int) class422.aFloat4780,
				       (int) class422.aFloat4777,
				       1926870089 * Class181_Sub5.anInt9778,
				       -759833206))
				     - 367247095 * client.anInt10981),
				    Class622.anInt8116 * 593060725, i_12_,
				    i_13_, 600 + (i_12_ >> 3) * 3 << 2, i,
				    -1346980720);
		Class626.anInt8136
		    = (1636412895
		       * (int) (f * (float) (-639218145 * Class626.anInt8136
					     - 969740461 * Class210.anInt2244)
				+ (float) (969740461 * Class210.anInt2244)));
		Class137.anInt1630
		    = (1124026061
		       * (int) ((float) (-172365035 * Class375.anInt3938)
				+ f * (float) (950408709 * Class137.anInt1630
					       - (-172365035
						  * Class375.anInt3938))));
		Class227.anInt2347
		    = (397871753
		       * (int) (f * (float) (Class227.anInt2347 * -1246131271
					     - -697086055 * Class29.anInt306)
				+ (float) (Class29.anInt306 * -697086055)));
		Class309_Sub1.anInt9907
		    = ((int) ((float) (Class309_Sub1.anInt9907 * -499166573
				       - Class424.anInt4789 * 1171270667) * f
			      + (float) (Class424.anInt4789 * 1171270667))
		       * 2028903323);
		i_11_ = (869770707 * Class653.anInt8429
			 - 1737800327 * Class278.anInt3052);
		if (i_11_ > 8192)
		    i_11_ -= 16384;
		else if (i_11_ < -8192)
		    i_11_ += 16384;
	    }
	    Class653.anInt8429
		= -1829176741 * (int) (f * (float) i_11_
				       + (float) (1737800327
						  * Class278.anInt3052));
	    Class653.anInt8429
		= (Class653.anInt8429 * 869770707 & 0x3fff) * -1829176741;
	    client.anInt11156
		= (-933165621
		   * (int) ((float) (Class295.anInt3236 * 826581433)
			    + f * (float) (1812199395 * client.anInt11156
					   - Class295.anInt3236 * 826581433)));
	}
    }
    
    static Class511_Sub1 method6473(int i) {
	Class511_Sub1 class511_sub1
	    = ((Class511_Sub1)
	       Class511_Sub1.aClass695_10203.method8179((short) 653));
	if (class511_sub1 != null) {
	    Class511_Sub1.anInt10206 -= 1007263943;
	    return class511_sub1;
	}
	return new Class511_Sub1();
    }
}
