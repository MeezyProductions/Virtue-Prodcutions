/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class333
{
    int anInt3549;
    static final int anInt3550 = 128;
    int anInt3551;
    Class334 aClass334_3552;
    Class173_Sub1 aClass173_Sub1_3553;
    int anInt3554;
    static final int anInt3555 = 7;
    int anInt3556;
    int anInt3557;
    Interface41 anInterface41_3558;
    byte[] aByteArray3559;
    int anInt3560;
    Interface34 anInterface34_3561;
    int[] anIntArray3562;
    boolean aBool3563 = true;
    
    void method4339() {
	if (((Class333) this).aBool3563) {
	    ((Class333) this).aBool3563 = false;
	    byte[] is
		= ((Class334) ((Class333) this).aClass334_3552).aByteArray3568;
	    int i = 0;
	    int i_0_ = ((Class334) ((Class333) this).aClass334_3552).anInt3567;
	    int i_1_ = (((Class333) this).anInt3554
			+ (((Class333) this).anInt3549
			   * (((Class334) ((Class333) this).aClass334_3552)
			      .anInt3567)));
	    for (int i_2_ = -128; i_2_ < 0; i_2_++) {
		i = (i << 8) - i;
		for (int i_3_ = -128; i_3_ < 0; i_3_++) {
		    if (is[i_1_++] != 0)
			i++;
		}
		i_1_ += i_0_ - 128;
	    }
	    if (((Class333) this).anInterface34_3561 != null
		&& ((Class333) this).anInt3556 == i)
		((Class333) this).aBool3563 = false;
	    else {
		((Class333) this).anInt3556 = i;
		int i_4_ = 0;
		i_1_ = (((Class333) this).anInt3554
			+ ((Class333) this).anInt3549 * i_0_);
		if (((Class333) this).aClass173_Sub1_3553.method8514
		    (Class149.aClass149_1677, Class169.aClass169_1935)) {
		    if (((Class333) this).aByteArray3559 == null)
			((Class333) this).aByteArray3559 = new byte[16384];
		    byte[] is_5_ = ((Class333) this).aByteArray3559;
		    for (int i_6_ = -128; i_6_ < 0; i_6_++) {
			for (int i_7_ = -128; i_7_ < 0; i_7_++) {
			    if (is[i_1_] != 0)
				is_5_[i_4_++] = (byte) 68;
			    else {
				int i_8_ = 0;
				if (is[i_1_ - 1] != 0)
				    i_8_++;
				if (is[i_1_ + 1] != 0)
				    i_8_++;
				if (is[i_1_ - i_0_] != 0)
				    i_8_++;
				if (is[i_1_ + i_0_] != 0)
				    i_8_++;
				is_5_[i_4_++] = (byte) (17 * i_8_);
			    }
			    i_1_++;
			}
			i_1_ += (((Class334) ((Class333) this).aClass334_3552)
				 .anInt3567) - 128;
		    }
		    if (((Class333) this).anInterface34_3561 == null) {
			((Class333) this).anInterface34_3561
			    = (((Class333) this).aClass173_Sub1_3553.method8517
			       (Class149.aClass149_1677, 128, 128, false,
				((Class333) this).aByteArray3559));
			((Class333) this).anInterface34_3561.method220(false,
								       false);
		    } else
			((Class333) this).anInterface34_3561.method212
			    (0, 0, 128, 128, ((Class333) this).aByteArray3559,
			     Class149.aClass149_1677, 0, 128);
		} else {
		    if (((Class333) this).anIntArray3562 == null)
			((Class333) this).anIntArray3562 = new int[16384];
		    int[] is_9_ = ((Class333) this).anIntArray3562;
		    for (int i_10_ = -128; i_10_ < 0; i_10_++) {
			for (int i_11_ = -128; i_11_ < 0; i_11_++) {
			    if (is[i_1_] != 0)
				is_9_[i_4_++] = 1140850688;
			    else {
				int i_12_ = 0;
				if (is[i_1_ - 1] != 0)
				    i_12_++;
				if (is[i_1_ + 1] != 0)
				    i_12_++;
				if (is[i_1_ - i_0_] != 0)
				    i_12_++;
				if (is[i_1_ + i_0_] != 0)
				    i_12_++;
				is_9_[i_4_++] = 17 * i_12_ << 24;
			    }
			    i_1_++;
			}
			i_1_ += (((Class334) ((Class333) this).aClass334_3552)
				 .anInt3567) - 128;
		    }
		    if (((Class333) this).anInterface34_3561 == null) {
			((Class333) this).anInterface34_3561
			    = (((Class333) this).aClass173_Sub1_3553.method8516
			       (128, 128, false,
				((Class333) this).anIntArray3562));
			((Class333) this).anInterface34_3561.method220(false,
								       false);
		    } else
			((Class333) this).anInterface34_3561.method211
			    (0, 0, 128, 128, ((Class333) this).anIntArray3562,
			     0, 128);
		}
	    }
	}
    }
    
    void method4340(Class306 class306, Interface41 interface41, int i,
		    int i_13_) {
	if (i_13_ > 0) {
	    method4339();
	    ((Class333) this).aClass173_Sub1_3553.method8554(interface41);
	    class306.anInterface34_3355 = ((Class333) this).anInterface34_3561;
	    class306.anInt3370 = ((Class333) this).anInt3560;
	    class306.anInt3354 = (((Class333) this).anInt3557
				  - ((Class333) this).anInt3560 + 1);
	    class306.anInt3351 = i;
	    class306.anInt3373 = i_13_;
	    class306.method4058(false);
	}
    }
    
    Class333(Class173_Sub1 class173_sub1, Class334 class334,
	     Class137_Sub2 class137_sub2, int i, int i_14_, int i_15_,
	     int i_16_, int i_17_) {
	((Class333) this).anInt3556 = -1;
	((Class333) this).aClass173_Sub1_3553 = class173_sub1;
	((Class333) this).aClass334_3552 = class334;
	((Class333) this).anInt3554 = i_16_;
	((Class333) this).anInt3549 = i_17_;
	int i_18_ = 1 << i_15_;
	int i_19_ = 0;
	int i_20_ = i << i_15_;
	int i_21_ = i_14_ << i_15_;
	for (int i_22_ = 0; i_22_ < i_18_; i_22_++) {
	    int i_23_
		= ((i_21_ + i_22_) * (class137_sub2.anInt1627 * -657933437)
		   + i_20_);
	    for (int i_24_ = 0; i_24_ < i_18_; i_24_++) {
		short[] is = (((Class137_Sub2) class137_sub2)
			      .aShortArrayArray8967[i_23_++]);
		if (is != null)
		    i_19_ += is.length;
	    }
	}
	if (i_19_ > 0) {
	    ((Class333) this).anInt3557 = -2147483648;
	    ((Class333) this).anInt3560 = 2147483647;
	    ((Class333) this).anInterface41_3558
		= ((Class333) this).aClass173_Sub1_3553.method8476(false);
	    ((Class333) this).anInterface41_3558.method311(i_19_);
	    ByteBuffer bytebuffer
		= ((Class333) this).aClass173_Sub1_3553.aByteBuffer9222;
	    bytebuffer.clear();
	    for (int i_25_ = 0; i_25_ < i_18_; i_25_++) {
		int i_26_
		    = ((i_21_ + i_25_) * (class137_sub2.anInt1627 * -657933437)
		       + i_20_);
		for (int i_27_ = 0; i_27_ < i_18_; i_27_++) {
		    short[] is = (((Class137_Sub2) class137_sub2)
				  .aShortArrayArray8967[i_26_++]);
		    if (is != null) {
			for (int i_28_ = 0; i_28_ < is.length; i_28_++) {
			    int i_29_ = is[i_28_] & 0xffff;
			    if (i_29_ < ((Class333) this).anInt3560)
				((Class333) this).anInt3560 = i_29_;
			    if (i_29_ > ((Class333) this).anInt3557)
				((Class333) this).anInt3557 = i_29_;
			    bytebuffer.putShort((short) i_29_);
			}
		    }
		}
	    }
	    ((Class333) this).anInterface41_3558.method197
		(0, bytebuffer.position(),
		 ((Class333) this).aClass173_Sub1_3553.aLong9223);
	    ((Class333) this).anInt3551 = i_19_ / 3;
	} else {
	    ((Class333) this).anInt3551 = 0;
	    ((Class333) this).anInterface34_3561 = null;
	}
    }
    
    void method4341(Class306 class306) {
	method4340(class306, ((Class333) this).anInterface41_3558, 0,
		   ((Class333) this).anInt3551);
    }
}
