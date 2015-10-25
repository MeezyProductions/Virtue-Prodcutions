/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11
{
    static final int anInt158 = 512;
    public static final int anInt159 = 64;
    byte[] aByteArray160 = new byte[32];
    static final String aString161
	= "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
    static long[][] aLongArrayArray162 = new long[8][256];
    static final int anInt163 = 10;
    byte[] aByteArray164 = new byte[64];
    static long[] aLongArray165 = new long[11];
    int anInt166 = 0;
    int anInt167 = 0;
    long[] aLongArray168 = new long[8];
    long[] aLongArray169 = new long[8];
    long[] aLongArray170 = new long[8];
    long[] aLongArray171 = new long[8];
    long[] aLongArray172 = new long[8];
    
    void method607(short i) {
	int i_0_ = 0;
	int i_1_ = 0;
	while (i_0_ < 8) {
	    ((Class11) this).aLongArray171[i_0_]
		= ((long) ((Class11) this).aByteArray164[i_1_] << 56
		   ^ (((long) ((Class11) this).aByteArray164[1 + i_1_] & 0xffL)
		      << 48)
		   ^ (((long) ((Class11) this).aByteArray164[i_1_ + 2] & 0xffL)
		      << 40)
		   ^ (((long) ((Class11) this).aByteArray164[3 + i_1_] & 0xffL)
		      << 32)
		   ^ (((long) ((Class11) this).aByteArray164[4 + i_1_] & 0xffL)
		      << 24)
		   ^ (((long) ((Class11) this).aByteArray164[i_1_ + 5] & 0xffL)
		      << 16)
		   ^ (((long) ((Class11) this).aByteArray164[i_1_ + 6] & 0xffL)
		      << 8)
		   ^ (long) ((Class11) this).aByteArray164[i_1_ + 7] & 0xffL);
	    i_0_++;
	    i_1_ += 8;
	}
	for (i_0_ = 0; i_0_ < 8; i_0_++)
	    ((Class11) this).aLongArray172[i_0_]
		= (((Class11) this).aLongArray171[i_0_]
		   ^ (((Class11) this).aLongArray169[i_0_]
		      = ((Class11) this).aLongArray168[i_0_]));
	for (i_0_ = 1; i_0_ <= 10; i_0_++) {
	    for (i_1_ = 0; i_1_ < 8; i_1_++) {
		((Class11) this).aLongArray170[i_1_] = 0L;
		int i_2_ = 0;
		int i_3_ = 56;
		while (i_2_ < 8) {
		    ((Class11) this).aLongArray170[i_1_]
			^= (aLongArrayArray162[i_2_]
			    [(int) ((((Class11) this).aLongArray169
				     [i_1_ - i_2_ & 0x7])
				    >>> i_3_) & 0xff]);
		    i_2_++;
		    i_3_ -= 8;
		}
	    }
	    for (i_1_ = 0; i_1_ < 8; i_1_++)
		((Class11) this).aLongArray169[i_1_]
		    = ((Class11) this).aLongArray170[i_1_];
	    ((Class11) this).aLongArray169[0] ^= aLongArray165[i_0_];
	    for (i_1_ = 0; i_1_ < 8; i_1_++) {
		((Class11) this).aLongArray170[i_1_]
		    = ((Class11) this).aLongArray169[i_1_];
		int i_4_ = 0;
		int i_5_ = 56;
		while (i_4_ < 8) {
		    ((Class11) this).aLongArray170[i_1_]
			^= (aLongArrayArray162[i_4_]
			    [(int) ((((Class11) this).aLongArray172
				     [i_1_ - i_4_ & 0x7])
				    >>> i_5_) & 0xff]);
		    i_4_++;
		    i_5_ -= 8;
		}
	    }
	    for (i_1_ = 0; i_1_ < 8; i_1_++)
		((Class11) this).aLongArray172[i_1_]
		    = ((Class11) this).aLongArray170[i_1_];
	}
	for (i_0_ = 0; i_0_ < 8; i_0_++)
	    ((Class11) this).aLongArray168[i_0_]
		^= (((Class11) this).aLongArray172[i_0_]
		    ^ ((Class11) this).aLongArray171[i_0_]);
    }
    
    void method608() {
	for (int i = 0; i < 32; i++)
	    ((Class11) this).aByteArray160[i] = (byte) 0;
	((Class11) this).anInt167 = 0;
	((Class11) this).anInt166 = 0;
	((Class11) this).aByteArray164[0] = (byte) 0;
	for (int i = 0; i < 8; i++)
	    ((Class11) this).aLongArray168[i] = 0L;
    }
    
    void method609(byte[] is, int i, int i_6_) {
	((Class11) this).aByteArray164[((Class11) this).anInt167 * 152906301]
	    |= 128 >>> (((Class11) this).anInt166 * 144269775 & 0x7);
	((Class11) this).anInt167 += 2070363413;
	if (((Class11) this).anInt167 * 152906301 > 32) {
	    while (((Class11) this).anInt167 * 152906301 < 64)
		((Class11) this).aByteArray164
		    [(((Class11) this).anInt167 += 2070363413) * 152906301 - 1]
		    = (byte) 0;
	    method607((short) -4438);
	    ((Class11) this).anInt167 = 0;
	}
	while (((Class11) this).anInt167 * 152906301 < 32)
	    ((Class11) this).aByteArray164
		[(((Class11) this).anInt167 += 2070363413) * 152906301 - 1]
		= (byte) 0;
	System.arraycopy(((Class11) this).aByteArray160, 0,
			 ((Class11) this).aByteArray164, 32, 32);
	method607((short) -18444);
	int i_7_ = 0;
	int i_8_ = i;
	while (i_7_ < 8) {
	    long l = ((Class11) this).aLongArray168[i_7_];
	    is[i_8_] = (byte) (int) (l >>> 56);
	    is[i_8_ + 1] = (byte) (int) (l >>> 48);
	    is[2 + i_8_] = (byte) (int) (l >>> 40);
	    is[i_8_ + 3] = (byte) (int) (l >>> 32);
	    is[i_8_ + 4] = (byte) (int) (l >>> 24);
	    is[i_8_ + 5] = (byte) (int) (l >>> 16);
	    is[6 + i_8_] = (byte) (int) (l >>> 8);
	    is[7 + i_8_] = (byte) (int) l;
	    i_7_++;
	    i_8_ += 8;
	}
    }
    
    void method610(byte[] is, long l) {
	int i = 0;
	int i_9_ = 8 - ((int) l & 0x7) & 0x7;
	int i_10_ = 144269775 * ((Class11) this).anInt166 & 0x7;
	long l_11_ = l;
	int i_12_ = 31;
	int i_13_ = 0;
	for (/**/; i_12_ >= 0; i_12_--) {
	    i_13_ += ((((Class11) this).aByteArray160[i_12_] & 0xff)
		      + ((int) l_11_ & 0xff));
	    ((Class11) this).aByteArray160[i_12_] = (byte) i_13_;
	    i_13_ >>>= 8;
	    l_11_ >>>= 8;
	}
	while (l > 8L) {
	    int i_14_ = is[i] << i_9_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_9_;
	    if (i_14_ < 0 || i_14_ >= 256)
		throw new RuntimeException();
	    ((Class11) this).aByteArray164[(152906301
					    * ((Class11) this).anInt167)]
		|= i_14_ >>> i_10_;
	    ((Class11) this).anInt167 += 2070363413;
	    ((Class11) this).anInt166 += (8 - i_10_) * -1515059921;
	    if (((Class11) this).anInt166 * 144269775 == 512) {
		method607((short) -20298);
		((Class11) this).anInt167 = 0;
		((Class11) this).anInt166 = 0;
	    }
	    ((Class11) this).aByteArray164[(((Class11) this).anInt167
					    * 152906301)]
		= (byte) (i_14_ << 8 - i_10_ & 0xff);
	    ((Class11) this).anInt166 += i_10_ * -1515059921;
	    l -= 8L;
	    i++;
	}
	int i_15_;
	if (l > 0L) {
	    i_15_ = is[i] << i_9_ & 0xff;
	    ((Class11) this).aByteArray164[(152906301
					    * ((Class11) this).anInt167)]
		|= i_15_ >>> i_10_;
	} else
	    i_15_ = 0;
	if (l + (long) i_10_ < 8L)
	    ((Class11) this).anInt166 += -1515059921L * l;
	else {
	    ((Class11) this).anInt167 += 2070363413;
	    ((Class11) this).anInt166 += -1515059921 * (8 - i_10_);
	    l -= (long) (8 - i_10_);
	    if (512 == ((Class11) this).anInt166 * 144269775) {
		method607((short) -7974);
		((Class11) this).anInt167 = 0;
		((Class11) this).anInt166 = 0;
	    }
	    ((Class11) this).aByteArray164[(152906301
					    * ((Class11) this).anInt167)]
		= (byte) (i_15_ << 8 - i_10_ & 0xff);
	    ((Class11) this).anInt166 += (int) l * -1515059921;
	}
    }
    
    Class11() {
	/* empty */
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_16_
		= "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
		      .charAt(i / 2);
	    long l = (0 == (i & 0x1) ? (long) (i_16_ >>> 8)
		      : (long) (i_16_ & 0xff));
	    long l_17_ = l << 1;
	    if (l_17_ >= 256L)
		l_17_ ^= 0x11dL;
	    long l_18_ = l_17_ << 1;
	    if (l_18_ >= 256L)
		l_18_ ^= 0x11dL;
	    long l_19_ = l_18_ ^ l;
	    long l_20_ = l_18_ << 1;
	    if (l_20_ >= 256L)
		l_20_ ^= 0x11dL;
	    long l_21_ = l_20_ ^ l;
	    aLongArrayArray162[0][i]
		= (l << 56 | l << 48 | l_18_ << 40 | l << 32 | l_20_ << 24
		   | l_19_ << 16 | l_17_ << 8 | l_21_);
	    for (int i_22_ = 1; i_22_ < 8; i_22_++)
		aLongArrayArray162[i_22_][i]
		    = (aLongArrayArray162[i_22_ - 1][i] >>> 8
		       | aLongArrayArray162[i_22_ - 1][i] << 56);
	}
	aLongArray165[0] = 0L;
	for (int i = 1; i <= 10; i++) {
	    int i_23_ = 8 * (i - 1);
	    aLongArray165[i]
		= (aLongArrayArray162[0][i_23_] & ~0xffffffffffffffL
		   ^ aLongArrayArray162[1][1 + i_23_] & 0xff000000000000L
		   ^ aLongArrayArray162[2][i_23_ + 2] & 0xff0000000000L
		   ^ aLongArrayArray162[3][i_23_ + 3] & 0xff00000000L
		   ^ aLongArrayArray162[4][i_23_ + 4] & 0xff000000L
		   ^ aLongArrayArray162[5][5 + i_23_] & 0xff0000L
		   ^ aLongArrayArray162[6][i_23_ + 6] & 0xff00L
		   ^ aLongArrayArray162[7][7 + i_23_] & 0xffL);
	}
    }
    
    void method611(byte i) {
	for (int i_24_ = 0; i_24_ < 32; i_24_++)
	    ((Class11) this).aByteArray160[i_24_] = (byte) 0;
	((Class11) this).anInt167 = 0;
	((Class11) this).anInt166 = 0;
	((Class11) this).aByteArray164[0] = (byte) 0;
	for (int i_25_ = 0; i_25_ < 8; i_25_++)
	    ((Class11) this).aLongArray168[i_25_] = 0L;
    }
    
    public static void method612(boolean bool, byte[] is, byte i) {
	if (Class148.aClass528_Sub42_1674 == null)
	    Class148.aClass528_Sub42_1674 = new ByteBuffer(20000);
	Class148.aClass528_Sub42_1674.method9618(is, 0, is.length, 1285185019);
	if (bool) {
	    ISAACCipher.method606(Class148.aClass528_Sub42_1674.payload,
			      797446690);
	    Class12.aClass602_Sub1Array180
		= new Class602_Sub1[1760550375 * Class604.anInt7886];
	    int i_26_ = 0;
	    for (int i_27_ = Class604.anInt7889 * 973177359;
		 i_27_ <= Class533.anInt7132 * -1941954941; i_27_++) {
		Class602_Sub1 class602_sub1
		    = Class209.method2936(i_27_, 2015312861);
		if (class602_sub1 != null)
		    Class12.aClass602_Sub1Array180[i_26_++] = class602_sub1;
	    }
	    Class12.aBool179 = false;
	    Class519.aLong7043
		= Class249.method3417(1931107196) * -4156628380149104369L;
	    Class148.aClass528_Sub42_1674 = null;
	}
    }
    
    static final void method613(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class36.method792(class229, class226, class648, (byte) 15);
    }
    
    static final void method614(byte i) {
	client.aBool11176 = false;
	if (Class181_Sub5.anInt9778 * 1926870089 != 3) {
	    Class422 class422
		= (Class108.myPlayer.method7693()
		   .aClass422_4868);
	    Class466 class466 = client.aClass495_10935.method6006((byte) 0);
	    if (Class390.anInt4111 * -1860881523 == 4
		|| Class390.anInt4111 * -1860881523 == 6
		|| -1 != Class690_Sub2.anInt10780 * -958954655) {
		Class578 class578
		    = client.aClass495_10935.method5966(1273279609);
		int i_28_;
		int i_29_;
		if (-1860881523 * Class390.anInt4111 == 6) {
		    Class422 class422_30_
			= Class495.aClass283_Sub1_5578.method3785((byte) 7)
			      .method7988(1699487919);
		    if (Float.isNaN(class422_30_.aFloat4780))
			return;
		    i_28_ = ((int) class422_30_.aFloat4780
			     - (961465569 * class578.anInt7607 << 9));
		    i_29_ = ((int) class422_30_.aFloat4777
			     - (-173815201 * class578.anInt7608 << 9));
		    if (i_28_ < 0 || i_29_ < 0
			|| (i_28_ >> 9
			    >= (class466.aByteArrayArrayArray5312
				[1926870089 * Class181_Sub5.anInt9778]).length)
			|| (i_29_ >> 9
			    >= (class466.aByteArrayArrayArray5312
				[Class181_Sub5.anInt9778 * 1926870089]
				[i_28_ >> 9]).length))
			return;
		} else if (Class390.anInt4111 * -1860881523 == 4) {
		    i_28_ = (int) class422.aFloat4780;
		    i_29_ = (int) class422.aFloat4777;
		} else {
		    i_28_ = -958954655 * Class690_Sub2.anInt10780;
		    i_29_ = Class386.anInt4069 * 305017743;
		}
		if (0 != ((class466.aByteArrayArrayArray5312
			   [Class181_Sub5.anInt9778 * 1926870089][i_28_ >> 9]
			   [i_29_ >> 9])
			  & 0x4))
		    client.aBool11176 = true;
		else {
		    int i_31_;
		    int i_32_;
		    if (6 == Class390.anInt4111 * -1860881523) {
			Class422 class422_33_
			    = Class495.aClass283_Sub1_5578.method3811
				  (629548282).method4236((byte) 63);
			i_31_ = (((int) class422_33_.aFloat4780 >> 9)
				 - class578.anInt7607 * 961465569);
			i_32_ = (((int) class422_33_.aFloat4777 >> 9)
				 - -173815201 * class578.anInt7608);
			if (i_31_ < 0 || i_32_ < 0
			    || i_31_ >= (class466.aByteArrayArrayArray5312
					 [(Class181_Sub5.anInt9778
					   * 1926870089)]).length
			    || i_32_ >= (class466.aByteArrayArrayArray5312
					 [Class181_Sub5.anInt9778 * 1926870089]
					 [i_31_]).length)
			    return;
		    } else {
			i_31_ = -639218145 * Class626.anInt8136 >> 9;
			i_32_ = Class227.anInt2347 * -1246131271 >> 9;
		    }
		    int i_34_ = i_28_ >> 9;
		    int i_35_ = i_29_ >> 9;
		    if (class466.method5630(i_31_, i_32_, (byte) 79)) {
			int i_36_ = (Class335_Sub1_Sub1.method10374
				     (Class626.anInt8136 * -639218145,
				      -1246131271 * Class227.anInt2347, 3,
				      -759833206));
			if (950408709 * Class137.anInt1630 >= i_36_)
			    client.aBool11176 = true;
		    } else {
		    while_86_:
			do {
			    if (Class309_Sub1.anInt9907 * -499166573 < 2560) {
				int i_37_;
				if (i_34_ > i_31_)
				    i_37_ = i_34_ - i_31_;
				else
				    i_37_ = i_31_ - i_34_;
				int i_38_;
				if (i_35_ > i_32_)
				    i_38_ = i_35_ - i_32_;
				else
				    i_38_ = i_32_ - i_35_;
				if (i_37_ == 0 && 0 == i_38_
				    || i_37_ <= -client.aClass495_10935
						     .method6029((short) 25177)
				    || i_37_ >= client.aClass495_10935
						    .method6029((short) 25835)
				    || i_38_ <= -client.aClass495_10935
						     .method5967(1411320189)
				    || i_38_ >= client.aClass495_10935
						    .method5967(1544087287)) {
				    if (Class390.anInt4111 * -1860881523 != 6)
					VarDomainType.method5340
					    (new StringBuilder().append
						 (i_31_).append
						 (Class49.aString555).append
						 (i_32_).append
						 (" ").append
						 (i_34_).append
						 (Class49.aString555).append
						 (i_35_).append
						 (" ").append
						 (class578.anInt7607
						  * 961465569)
						 .append
						 (Class49.aString555).append
						 (-173815201
						  * class578.anInt7608)
						 .toString(),
					     new RuntimeException(),
					     2049694861);
				    break;
				}
				if (i_37_ > i_38_) {
				    int i_39_ = i_38_ * 65536 / i_37_;
				    int i_40_ = 32768;
				while_85_:
				    do {
					for (;;) {
					    if (i_31_ == i_34_)
						break while_85_;
					    if (i_31_ < i_34_)
						i_31_++;
					    else if (i_31_ > i_34_)
						i_31_--;
					    if (0
						!= ((class466
						     .aByteArrayArrayArray5312
						     [(1926870089
						       * (Class181_Sub5
							  .anInt9778))]
						     [i_31_][i_32_])
						    & 0x4)) {
						client.aBool11176 = true;
						return;
					    }
					    if ((i_32_ + 1
						 < (class466
						    .aByteArrayArrayArray5312
						    [(1926870089
						      * (Class181_Sub5
							 .anInt9778))]
						    [i_31_]).length)
						&& ((class466
						     .aByteArrayArrayArray5312
						     [(1926870089
						       * (Class181_Sub5
							  .anInt9778))]
						     [i_31_][1 + i_32_])
						    & 0x4) != 0) {
						client.aBool11176 = true;
						return;
					    }
					    if (i_32_ > 0
						&& ((class466
						     .aByteArrayArrayArray5312
						     [(Class181_Sub5.anInt9778
						       * 1926870089)]
						     [i_31_][i_32_ - 1])
						    & 0x4) != 0) {
						client.aBool11176 = true;
						return;
					    }
					    i_40_ += i_39_;
					    if (i_40_ >= 65536) {
						i_40_ -= 65536;
						if (i_32_ < i_35_) {
						    i_32_++;
						    if ((1 + i_32_
							 < (class466
							    .aByteArrayArrayArray5312
							    [((Class181_Sub5
							       .anInt9778)
							      * 1926870089)]
							    [i_31_]).length)
							&& (0
							    != ((class466
								 .aByteArrayArrayArray5312
								 [((Class181_Sub5
								    .anInt9778)
								   * 1926870089)]
								 [i_31_]
								 [1 + i_32_])
								& 0x4))) {
							client.aBool11176
							    = true;
							return;
						    }
						} else if (i_32_ > i_35_
							   && --i_32_ > 0
							   && (0
							       != ((class466
								    .aByteArrayArrayArray5312
								    [(1926870089
								      * (Class181_Sub5
									 .anInt9778))]
								    [i_31_]
								    [(i_32_
								      - 1)])
								   & 0x4)))
						    break;
					    }
					}
					client.aBool11176 = true;
					return;
				    } while (false);
				} else {
				    int i_41_ = i_37_ * 65536 / i_38_;
				    int i_42_ = 32768;
				    for (;;) {
					if (i_35_ == i_32_)
					    break while_86_;
					if (i_32_ < i_35_)
					    i_32_++;
					else if (i_32_ > i_35_)
					    i_32_--;
					if (0 != ((class466
						   .aByteArrayArrayArray5312
						   [(Class181_Sub5.anInt9778
						     * 1926870089)]
						   [i_31_][i_32_])
						  & 0x4)) {
					    client.aBool11176 = true;
					    return;
					}
					if ((i_31_ + 1
					     < (class466
						.aByteArrayArrayArray5312
						[(Class181_Sub5.anInt9778
						  * 1926870089)]).length)
					    && ((class466
						 .aByteArrayArrayArray5312
						 [(Class181_Sub5.anInt9778
						   * 1926870089)]
						 [1 + i_31_][i_32_])
						& 0x4) != 0) {
					    client.aBool11176 = true;
					    return;
					}
					if (i_31_ > 0
					    && ((class466
						 .aByteArrayArrayArray5312
						 [(1926870089
						   * Class181_Sub5.anInt9778)]
						 [i_31_ - 1][i_32_])
						& 0x4) != 0) {
					    client.aBool11176 = true;
					    return;
					}
					i_42_ += i_41_;
					if (i_42_ >= 65536) {
					    i_42_ -= 65536;
					    if (i_31_ < i_34_) {
						if ((++i_31_ + 1
						     < (class466
							.aByteArrayArrayArray5312
							[((Class181_Sub5
							   .anInt9778)
							  * 1926870089)]).length)
						    && ((class466
							 .aByteArrayArrayArray5312
							 [(1926870089
							   * (Class181_Sub5
							      .anInt9778))]
							 [1 + i_31_][i_32_])
							& 0x4) != 0) {
						    client.aBool11176 = true;
						    return;
						}
					    } else if (i_31_ > i_34_
						       && --i_31_ > 0
						       && ((class466
							    .aByteArrayArrayArray5312
							    [(1926870089
							      * (Class181_Sub5
								 .anInt9778))]
							    [i_31_ - 1][i_32_])
							   & 0x4) != 0)
						break;
					}
				    }
				    client.aBool11176 = true;
				    break;
				}
			    }
			} while (false);
		    }
		}
	    } else {
		int i_43_
		    = (Class335_Sub1_Sub1.method10374
		       (Class626.anInt8136 * -639218145,
			-1246131271 * Class227.anInt2347,
			Class181_Sub5.anInt9778 * 1926870089, -759833206));
		if (i_43_ - Class137.anInt1630 * 950408709 < 3200
		    && 0 != ((class466.aByteArrayArrayArray5312
			      [1926870089 * Class181_Sub5.anInt9778]
			      [-639218145 * Class626.anInt8136 >> 9]
			      [Class227.anInt2347 * -1246131271 >> 9])
			     & 0x4))
		    client.aBool11176 = true;
	    }
	}
    }
    
    static final void method615(Class648 class648, int i) {
	((Class648) class648).anInt8410 -= 1600226731;
	((Class648) class648).anInt8395 -= -577899301;
	String string
	    = (String) (((Class648) class648).anObjectArray8396
			[-520794877 * ((Class648) class648).anInt8410]);
	boolean bool = ((((Class648) class648).anIntArray8394
			 [((Class648) class648).anInt8395 * 717927929])
			== 1);
	boolean bool_44_
	    = 1 == (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	boolean bool_45_
	    = 1 == (((Class648) class648).anIntArray8394
		    [2 + ((Class648) class648).anInt8395 * 717927929]);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4565,
				  client.aClass109_11162.aClass10_1379,
				  -1996125722);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .method9717(Class14.method627(string, 720678839) + 1, (byte) 72);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
							     -1936289654);
	int i_46_ = 0;
	if (bool)
	    i_46_ |= 0x1;
	if (bool_44_)
	    i_46_ |= 0x2;
	if (bool_45_)
	    i_46_ |= 0x4;
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i_46_, (byte) 16);
	client.aClass109_11162.method1380(class528_sub34, 1483087046);
    }
}
