/* BitBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class BitBuffer extends ByteBuffer
{
    static int[] anIntArray11689
	= { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191,
	    16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151,
	    4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
	    268435455, 536870911, 1073741823, 2147483647, -1 };
    ISAACCipher aClass10_11690;
    int anInt11691;
    
    public void method10616(ISAACCipher iSAACCipher, int i) {
	((BitBuffer) this).aClass10_11690 = iSAACCipher;
    }
    
    public void method10617(int i, int i_0_) {
	payload[(pointer += 2015001547) * -185904669 - 1]
	    = (byte) (i + ((BitBuffer) this).aClass10_11690
			      .method595(-1210292703));
    }
    
    public int method10618(byte i) {
	int i_1_
	    = ((payload[(pointer += 2015001547) * -185904669 - 1]
		- ((BitBuffer) this).aClass10_11690
		      .method595(-1210292703))
	       & 0xff);
	if (i_1_ < 128)
	    return i_1_;
	return ((i_1_ - 128 << 8)
		+ (((payload
		     [(pointer += 2015001547) * -185904669 - 1])
		    - ((BitBuffer) this).aClass10_11690
			  .method595(-1210292703))
		   & 0xff));
    }
    
    public void method10619(byte[] is, int i, int i_2_, int i_3_) {
	for (int i_4_ = 0; i_4_ < i_2_; i_4_++)
	    is[i + i_4_]
		= (byte) ((payload
			   [(pointer += 2015001547) * -185904669 - 1])
			  - ((BitBuffer) this).aClass10_11690
				.method595(-1210292703));
    }
    
    public void setBitAccess(int i) {
	((BitBuffer) this).anInt11691 = pointer * 2136533416;
    }
    
    public int readBits(int i, byte i_5_) {
	int i_6_ = ((BitBuffer) this).anInt11691 * -2074161737 >> 3;
	int i_7_ = 8 - (((BitBuffer) this).anInt11691 * -2074161737
			& 0x7);
	int i_8_ = 0;
	((BitBuffer) this).anInt11691 += -1512398841 * i;
	for (/**/; i > i_7_; i_7_ = 8) {
	    i_8_ += ((payload[i_6_++] & anIntArray11689[i_7_])
		     << i - i_7_);
	    i -= i_7_;
	}
	if (i == i_7_)
	    i_8_ += payload[i_6_] & anIntArray11689[i_7_];
	else
	    i_8_ += payload[i_6_] >> i_7_ - i & anIntArray11689[i];
	return i_8_;
    }
    
    public int method10622(int i, byte i_9_) {
	return 8 * i - -2074161737 * ((BitBuffer) this).anInt11691;
    }
    
    public boolean method10623(byte i) {
	int i_10_ = ((payload[pointer * -185904669]
		      - ((BitBuffer) this).aClass10_11690
			    .method600(1239022665))
		     & 0xff);
	if (i_10_ < 128)
	    return false;
	return true;
    }
    
    public BitBuffer(int i) {
	super(i);
    }
    
    public void setByteAccess(int i) {
	pointer = (((BitBuffer) this).anInt11691 * -2074161737
		      + 7) / 8 * 2015001547;
    }
    
    public int method10625(int i) {
	return ((payload[(pointer += 2015001547) * -185904669 - 1]
		 - ((BitBuffer) this).aClass10_11690
		       .method595(-1210292703))
		& 0xff);
    }
    
    static final void method10626(byte i) {
	byte[][][] is = client.gameScene.method5978((byte) -88);
	byte i_11_ = (byte) (-2032978979 * client.anInt10968 - 4 & 0xff);
	int i_12_ = (-2032978979 * client.anInt10968
		     % client.gameScene.method6029((short) 667));
	for (int i_13_ = 0; i_13_ < 4; i_13_++) {
	    for (int i_14_ = 0;
		 i_14_ < client.gameScene.method5967(51723941); i_14_++)
		is[i_13_][i_12_][i_14_] = i_11_;
	}
	if (3 != Class181_Sub5.anInt9778 * 1926870089) {
	    for (int i_15_ = 0; i_15_ < 2; i_15_++) {
		client.anIntArray10880[i_15_] = -1000000;
		client.anIntArray11013[i_15_] = 1000000;
		client.anIntArray11014[i_15_] = 0;
		client.anIntArray11012[i_15_] = 1000000;
		client.anIntArray10967[i_15_] = 0;
	    }
	    Class422 class422
		= (Class108.myPlayer.method7693()
		   .aClass422_4868);
	    Class466 class466 = client.gameScene.method6006((byte) 0);
	    Class538 class538 = client.gameScene.method5973((byte) 54);
	    if (4 == Class390.anInt4111 * -1860881523
		|| 6 == -1860881523 * Class390.anInt4111
		|| -1 != Class690_Sub2.anInt10780 * -958954655) {
		Class578 class578
		    = client.gameScene.method5966(1273279609);
		int i_16_;
		int i_17_;
		if (6 == -1860881523 * Class390.anInt4111) {
		    Class422 class422_18_
			= Class495.aClass283_Sub1_5578.method3785
			      ((byte) 50).method7988(1562564871);
		    if (Float.isNaN(class422_18_.aFloat4780))
			return;
		    i_16_ = ((int) class422_18_.aFloat4780
			     - (class578.anInt7607 * 961465569 << 9));
		    i_17_ = ((int) class422_18_.aFloat4777
			     - (class578.anInt7608 * -173815201 << 9));
		    if (i_16_ < 0 || i_17_ < 0
			|| (i_16_ >> 9
			    >= (class466.aByteArrayArrayArray5312
				[1926870089 * Class181_Sub5.anInt9778]).length)
			|| (i_17_ >> 9
			    >= (class466.aByteArrayArrayArray5312
				[1926870089 * Class181_Sub5.anInt9778]
				[i_16_ >> 9]).length))
			return;
		} else if (4 == Class390.anInt4111 * -1860881523) {
		    i_16_ = (int) class422.aFloat4780;
		    i_17_ = (int) class422.aFloat4777;
		} else {
		    i_16_ = Class690_Sub2.anInt10780 * -958954655;
		    i_17_ = Class386.anInt4069 * 305017743;
		}
		if (0 != ((class466.aByteArrayArrayArray5312
			   [Class181_Sub5.anInt9778 * 1926870089][i_16_ >> 9]
			   [i_17_ >> 9])
			  & 0x4))
		    Class209.method2945(class538.aClass546ArrayArrayArray7160,
					0, i_16_ >> 9, i_17_ >> 9, false,
					640920038);
		else {
		    int i_19_;
		    int i_20_;
		    if (-1860881523 * Class390.anInt4111 == 6) {
			Class422 class422_21_
			    = Class495.aClass283_Sub1_5578.method3811
				  (-321268184).method4236((byte) 99);
			i_19_ = (((int) class422_21_.aFloat4780 >> 9)
				 - class578.anInt7607 * 961465569);
			i_20_ = (((int) class422_21_.aFloat4777 >> 9)
				 - -173815201 * class578.anInt7608);
			if (i_19_ < 0 || i_20_ < 0
			    || i_19_ >= (class466.aByteArrayArrayArray5312
					 [(Class181_Sub5.anInt9778
					   * 1926870089)]).length
			    || i_20_ >= (class466.aByteArrayArrayArray5312
					 [1926870089 * Class181_Sub5.anInt9778]
					 [i_19_]).length)
			    return;
		    } else {
			i_19_ = -639218145 * Class626.anInt8136 >> 9;
			i_20_ = -1246131271 * Class227.anInt2347 >> 9;
		    }
		    int i_22_ = i_16_ >> 9;
		    int i_23_ = i_17_ >> 9;
		    if (class466.method5630(i_19_, i_20_, (byte) 71)) {
			int i_24_ = (Class335_Sub1_Sub1.method10374
				     (-639218145 * Class626.anInt8136,
				      Class227.anInt2347 * -1246131271, 3,
				      -759833206));
			if (Class137.anInt1630 * 950408709 >= i_24_)
			    Class209.method2945
				(class538.aClass546ArrayArrayArray7160, 1,
				 i_19_, i_20_, false, 109817966);
		    } else {
		    while_14_:
			do {
			    if (Class309_Sub1.anInt9907 * -499166573 < 2560) {
				int i_25_;
				if (i_22_ > i_19_)
				    i_25_ = i_22_ - i_19_;
				else
				    i_25_ = i_19_ - i_22_;
				int i_26_;
				if (i_23_ > i_20_)
				    i_26_ = i_23_ - i_20_;
				else
				    i_26_ = i_20_ - i_23_;
				if (i_25_ == 0 && i_26_ == 0
				    || i_25_ <= -client.gameScene
						     .method6029((short) 19235)
				    || i_25_ >= client.gameScene
						    .method6029((short) 5566)
				    || i_26_ <= -client.gameScene
						     .method5967(1668440035)
				    || i_26_ >= client.gameScene
						    .method5967(1184435117)) {
				    if (6 != Class390.anInt4111 * -1860881523)
					VarDomainType.method5340
					    (new StringBuilder().append
						 (i_19_).append
						 (Class49.aString555).append
						 (i_20_).append
						 (" ").append
						 (i_22_).append
						 (Class49.aString555).append
						 (i_23_).append
						 (" ").append
						 (961465569
						  * class578.anInt7607)
						 .append
						 (Class49.aString555).append
						 (-173815201
						  * class578.anInt7608)
						 .toString(),
					     new RuntimeException(),
					     1907756567);
				    break;
				}
				if (i_25_ > i_26_) {
				    int i_27_ = i_26_ * 65536 / i_25_;
				    int i_28_ = 32768;
				while_13_:
				    do {
					for (;;) {
					    if (i_22_ == i_19_)
						break while_13_;
					    if (i_19_ < i_22_)
						i_19_++;
					    else if (i_19_ > i_22_)
						i_19_--;
					    if (((class466
						  .aByteArrayArrayArray5312
						  [(1926870089
						    * Class181_Sub5.anInt9778)]
						  [i_19_][i_20_])
						 & 0x4)
						!= 0) {
						Class209.method2945
						    ((class538
						      .aClass546ArrayArrayArray7160),
						     1, i_19_, i_20_, false,
						     1615506803);
						break while_13_;
					    }
					    if ((1 + i_20_
						 < (class466
						    .aByteArrayArrayArray5312
						    [(Class181_Sub5.anInt9778
						      * 1926870089)]
						    [i_19_]).length)
						&& (0
						    != ((class466
							 .aByteArrayArrayArray5312
							 [(1926870089
							   * (Class181_Sub5
							      .anInt9778))]
							 [i_19_][i_20_ + 1])
							& 0x4))) {
						Class209.method2945
						    ((class538
						      .aClass546ArrayArrayArray7160),
						     1, i_19_, 1 + i_20_,
						     false, 1952947628);
						break while_13_;
					    }
					    if (i_20_ > 0
						&& ((class466
						     .aByteArrayArrayArray5312
						     [(1926870089
						       * (Class181_Sub5
							  .anInt9778))]
						     [i_19_][i_20_ - 1])
						    & 0x4) != 0) {
						Class209.method2945
						    ((class538
						      .aClass546ArrayArrayArray7160),
						     1, i_19_, i_20_ - 1,
						     false, 1619473231);
						break while_13_;
					    }
					    i_28_ += i_27_;
					    if (i_28_ >= 65536) {
						i_28_ -= 65536;
						if (i_20_ < i_23_) {
						    i_20_++;
						    if ((1 + i_20_
							 < (class466
							    .aByteArrayArrayArray5312
							    [(1926870089
							      * (Class181_Sub5
								 .anInt9778))]
							    [i_19_]).length)
							&& ((class466
							     .aByteArrayArrayArray5312
							     [((Class181_Sub5
								.anInt9778)
							       * 1926870089)]
							     [i_19_]
							     [1 + i_20_])
							    & 0x4) != 0) {
							Class209.method2945
							    ((class538
							      .aClass546ArrayArrayArray7160),
							     1, i_19_,
							     i_20_ + 1, false,
							     1767512860);
							break while_13_;
						    }
						} else if (i_20_ > i_23_
							   && --i_20_ > 0
							   && ((class466
								.aByteArrayArrayArray5312
								[((Class181_Sub5
								   .anInt9778)
								  * 1926870089)]
								[i_19_]
								[i_20_ - 1])
							       & 0x4) != 0)
						    break;
					    }
					}
					Class209.method2945
					    ((class538
					      .aClass546ArrayArrayArray7160),
					     1, i_19_, i_20_ - 1, false,
					     1764081134);
				    } while (false);
				} else {
				    int i_29_ = 65536 * i_25_ / i_26_;
				    int i_30_ = 32768;
				    for (;;) {
					if (i_23_ == i_20_)
					    break while_14_;
					if (i_20_ < i_23_)
					    i_20_++;
					else if (i_20_ > i_23_)
					    i_20_--;
					if (((class466.aByteArrayArrayArray5312
					      [(Class181_Sub5.anInt9778
						* 1926870089)]
					      [i_19_][i_20_])
					     & 0x4)
					    != 0) {
					    Class209.method2945
						((class538
						  .aClass546ArrayArrayArray7160),
						 1, i_19_, i_20_, false,
						 869209236);
					    break while_14_;
					}
					if ((1 + i_19_
					     < (class466
						.aByteArrayArrayArray5312
						[(1926870089
						  * (Class181_Sub5
						     .anInt9778))]).length)
					    && 0 != ((class466
						      .aByteArrayArrayArray5312
						      [(1926870089
							* (Class181_Sub5
							   .anInt9778))]
						      [i_19_ + 1][i_20_])
						     & 0x4)) {
					    Class209.method2945
						((class538
						  .aClass546ArrayArrayArray7160),
						 1, 1 + i_19_, i_20_, false,
						 1067487010);
					    break while_14_;
					}
					if (i_19_ > 0
					    && ((class466
						 .aByteArrayArrayArray5312
						 [(1926870089
						   * Class181_Sub5.anInt9778)]
						 [i_19_ - 1][i_20_])
						& 0x4) != 0) {
					    Class209.method2945
						((class538
						  .aClass546ArrayArrayArray7160),
						 1, i_19_ - 1, i_20_, false,
						 247094427);
					    break while_14_;
					}
					i_30_ += i_29_;
					if (i_30_ >= 65536) {
					    i_30_ -= 65536;
					    if (i_19_ < i_22_) {
						i_19_++;
						if ((1 + i_19_
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
							 [1 + i_19_][i_20_])
							& 0x4) != 0) {
						    Class209.method2945
							((class538
							  .aClass546ArrayArrayArray7160),
							 1, i_19_ + 1, i_20_,
							 false, 996808065);
						    break while_14_;
						}
					    } else if (i_19_ > i_22_
						       && --i_19_ > 0
						       && (0
							   != ((class466
								.aByteArrayArrayArray5312
								[(1926870089
								  * (Class181_Sub5
								     .anInt9778))]
								[i_19_ - 1]
								[i_20_])
							       & 0x4)))
						break;
					}
				    }
				    Class209.method2945
					(class538.aClass546ArrayArrayArray7160,
					 1, i_19_ - 1, i_20_, false,
					 -20149371);
				}
			    }
			} while (false);
		    }
		}
	    } else {
		int i_31_
		    = (Class335_Sub1_Sub1.method10374
		       (Class626.anInt8136 * -639218145,
			Class227.anInt2347 * -1246131271,
			1926870089 * Class181_Sub5.anInt9778, -759833206));
		if (i_31_ - Class137.anInt1630 * 950408709 < 3200
		    && ((class466.aByteArrayArrayArray5312
			 [1926870089 * Class181_Sub5.anInt9778]
			 [Class626.anInt8136 * -639218145 >> 9]
			 [-1246131271 * Class227.anInt2347 >> 9])
			& 0x4) != 0)
		    Class209.method2945(class538.aClass546ArrayArrayArray7160,
					1,
					Class626.anInt8136 * -639218145 >> 9,
					Class227.anInt2347 * -1246131271 >> 9,
					false, 473113122);
	    }
	}
    }
}
