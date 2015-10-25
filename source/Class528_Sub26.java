/* Class528_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class528_Sub26 extends Node
{
    Interface36 anInterface36_10427;
    Class137_Sub2 aClass137_Sub2_10428;
    long aLong10429;
    ByteBuffer aByteBuffer10430;
    Class164 aClass164_10431;
    Class173_Sub1 aClass173_Sub1_10432;
    int anInt10433 = 0;
    float aFloat10434;
    int anInt10435 = 0;
    int anInt10436 = 0;
    int anInt10437 = 0;
    int[] anIntArray10438;
    int anInt10439;
    
    void method9446(int i, int i_0_, int i_1_) {
	((Class528_Sub26) this).anIntArray10438
	    [i_0_ * (((Class528_Sub26) this).aClass137_Sub2_10428.anInt1627
		     * -657933437) + i]
	    |= 1 << i_1_;
	((Class528_Sub26) this).anInt10433++;
    }
    
    void method9447(int i) {
	((Class528_Sub26) this).aClass173_Sub1_10432.anUnsafe9221.putByte
	    (((Class528_Sub26) this).aLong10429 + (long) (i * 4) + 3L,
	     (byte) -1);
    }
    
    void method9448(int i) {
	((Class528_Sub26) this).aByteBuffer10430
	    = ((Class528_Sub26) this).aClass173_Sub1_10432.method8452(i * 4);
	((Class528_Sub26) this).aLong10429
	    = ((Class528_Sub26) this).aClass173_Sub1_10432
		  .method8453(((Class528_Sub26) this).aByteBuffer10430);
	for (int i_2_ = 3; i_2_ < i * 4; i_2_ += 4)
	    ((Class528_Sub26) this).aClass173_Sub1_10432.anUnsafe9221.putByte
		(((Class528_Sub26) this).aLong10429 + (long) i_2_, (byte) 0);
    }
    
    void method9449(int i, int i_3_, int i_4_, float f) {
	if (((Class528_Sub26) this).anInt10439 != -1) {
	    Class160 class160
		= (((Class528_Sub26) this).aClass173_Sub1_10432
		       .aClass165_1984.method2093
		   (((Class528_Sub26) this).anInt10439, (byte) -21));
	    int i_5_ = class160.aByte1802 & 0xff;
	    if (i_5_ != 0 && class160.aByte1790 != 4) {
		int i_6_;
		if (i_4_ < 0)
		    i_6_ = 0;
		else if (i_4_ > 127)
		    i_6_ = 16777215;
		else
		    i_6_ = 131586 * i_4_;
		if (i_5_ == 256)
		    i_3_ = i_6_;
		else {
		    int i_7_ = i_5_;
		    int i_8_ = 256 - i_5_;
		    i_3_
			= (((i_6_ & 0xff00ff) * i_7_ + (i_3_ & 0xff00ff) * i_8_
			    & ~0xff00ff)
			   + ((i_6_ & 0xff00) * i_7_ + (i_3_ & 0xff00) * i_8_
			      & 0xff0000)) >> 8;
		}
	    }
	    int i_9_ = class160.aByte1801 & 0xff;
	    if (i_9_ != 0) {
		i_9_ += 256;
		int i_10_ = ((i_3_ & 0xff0000) >> 16) * i_9_;
		if (i_10_ > 65535)
		    i_10_ = 65535;
		int i_11_ = ((i_3_ & 0xff00) >> 8) * i_9_;
		if (i_11_ > 65535)
		    i_11_ = 65535;
		int i_12_ = (i_3_ & 0xff) * i_9_;
		if (i_12_ > 65535)
		    i_12_ = 65535;
		i_3_ = (i_10_ << 8 & 0xff0000) + (i_11_ & 0xff00) + (i_12_
								     >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_13_ = i_3_ >> 16 & 0xff;
	    int i_14_ = i_3_ >> 8 & 0xff;
	    int i_15_ = i_3_ & 0xff;
	    i_13_ *= f;
	    if (i_13_ < 0)
		i_13_ = 0;
	    else if (i_13_ > 255)
		i_13_ = 255;
	    i_14_ *= f;
	    if (i_14_ < 0)
		i_14_ = 0;
	    else if (i_14_ > 255)
		i_14_ = 255;
	    i_15_ *= f;
	    if (i_15_ < 0)
		i_15_ = 0;
	    else if (i_15_ > 255)
		i_15_ = 255;
	    i_3_ = i_13_ << 16 | i_14_ << 8 | i_15_;
	}
	if ((((Class173_Sub1) ((Class528_Sub26) this).aClass173_Sub1_10432)
	     .anInt9377)
	    == 0) {
	    ((Class528_Sub26) this).aByteBuffer10430.put(i * 4 + 0,
							 (byte) (i_3_ >> 16));
	    ((Class528_Sub26) this).aByteBuffer10430.put(i * 4 + 1,
							 (byte) (i_3_ >> 8));
	    ((Class528_Sub26) this).aByteBuffer10430.put(i * 4 + 2,
							 (byte) (i_3_ >> 0));
	} else {
	    ((Class528_Sub26) this).aByteBuffer10430.put(i * 4 + 0,
							 (byte) (i_3_ >> 0));
	    ((Class528_Sub26) this).aByteBuffer10430.put(i * 4 + 1,
							 (byte) (i_3_ >> 8));
	    ((Class528_Sub26) this).aByteBuffer10430.put(i * 4 + 2,
							 (byte) (i_3_ >> 16));
	}
    }
    
    void method9450(int i) {
	((Class528_Sub26) this).anInterface36_10427
	    = ((Class528_Sub26) this).aClass173_Sub1_10432.method8549(false);
	((Class528_Sub26) this).anInterface36_10427.method258(i * 4, 4);
	((Class528_Sub26) this).anInterface36_10427
	    .method197(0, i * 4, ((Class528_Sub26) this).aLong10429);
	((Class528_Sub26) this).aByteBuffer10430.clear();
	((Class528_Sub26) this).aByteBuffer10430 = null;
	((Class528_Sub26) this).aLong10429 = 0L;
    }
    
    void method9451(int i) {
	((Class528_Sub26) this).aByteBuffer10430
	    = ((Class528_Sub26) this).aClass173_Sub1_10432.method8452(i * 4);
	((Class528_Sub26) this).aLong10429
	    = ((Class528_Sub26) this).aClass173_Sub1_10432
		  .method8453(((Class528_Sub26) this).aByteBuffer10430);
	for (int i_16_ = 3; i_16_ < i * 4; i_16_ += 4)
	    ((Class528_Sub26) this).aClass173_Sub1_10432.anUnsafe9221.putByte
		(((Class528_Sub26) this).aLong10429 + (long) i_16_, (byte) 0);
    }
    
    void method9452(int i) {
	((Class528_Sub26) this).aByteBuffer10430
	    = ((Class528_Sub26) this).aClass173_Sub1_10432.method8452(i * 4);
	((Class528_Sub26) this).aLong10429
	    = ((Class528_Sub26) this).aClass173_Sub1_10432
		  .method8453(((Class528_Sub26) this).aByteBuffer10430);
	for (int i_17_ = 3; i_17_ < i * 4; i_17_ += 4)
	    ((Class528_Sub26) this).aClass173_Sub1_10432.anUnsafe9221.putByte
		(((Class528_Sub26) this).aLong10429 + (long) i_17_, (byte) 0);
    }
    
    void method9453(int i) {
	((Class528_Sub26) this).aClass173_Sub1_10432.anUnsafe9221.putByte
	    (((Class528_Sub26) this).aLong10429 + (long) (i * 4) + 3L,
	     (byte) -1);
    }
    
    void method9454(int i) {
	((Class528_Sub26) this).aClass173_Sub1_10432.anUnsafe9221.putByte
	    (((Class528_Sub26) this).aLong10429 + (long) (i * 4) + 3L,
	     (byte) -1);
    }
    
    void method9455(int i, int i_18_, int i_19_) {
	((Class528_Sub26) this).anIntArray10438
	    [i_18_ * (((Class528_Sub26) this).aClass137_Sub2_10428.anInt1627
		      * -657933437) + i]
	    |= 1 << i_19_;
	((Class528_Sub26) this).anInt10433++;
    }
    
    void method9456(int i, int i_20_, int i_21_) {
	((Class528_Sub26) this).anIntArray10438
	    [i_20_ * (((Class528_Sub26) this).aClass137_Sub2_10428.anInt1627
		      * -657933437) + i]
	    |= 1 << i_21_;
	((Class528_Sub26) this).anInt10433++;
    }
    
    Class528_Sub26(Class137_Sub2 class137_sub2, int i, int i_22_,
		   Class164 class164) {
	((Class528_Sub26) this).aClass137_Sub2_10428 = class137_sub2;
	((Class528_Sub26) this).aClass173_Sub1_10432
	    = (((Class137_Sub2) ((Class528_Sub26) this).aClass137_Sub2_10428)
	       .aClass173_Sub1_8980);
	((Class528_Sub26) this).anInt10439 = i;
	((Class528_Sub26) this).aFloat10434 = (float) i_22_;
	((Class528_Sub26) this).aClass164_10431 = class164;
	((Class528_Sub26) this).anIntArray10438
	    = (new int
	       [(((Class528_Sub26) this).aClass137_Sub2_10428.anInt1627
		 * -657933437
		 * (((Class528_Sub26) this).aClass137_Sub2_10428.anInt1626
		    * 1769495707))]);
    }
    
    void method9457(int i) {
	((Class528_Sub26) this).anInterface36_10427
	    = ((Class528_Sub26) this).aClass173_Sub1_10432.method8549(false);
	((Class528_Sub26) this).anInterface36_10427.method258(i * 4, 4);
	((Class528_Sub26) this).anInterface36_10427
	    .method197(0, i * 4, ((Class528_Sub26) this).aLong10429);
	((Class528_Sub26) this).aByteBuffer10430.clear();
	((Class528_Sub26) this).aByteBuffer10430 = null;
	((Class528_Sub26) this).aLong10429 = 0L;
    }
    
    void method9458(int[] is, int i) {
	((Class528_Sub26) this).anInt10435 = 0;
	((Class528_Sub26) this).anInt10436 = 32767;
	((Class528_Sub26) this).anInt10437 = -32768;
	ByteBuffer bytebuffer
	    = ((Class528_Sub26) this).aClass173_Sub1_10432.aByteBuffer9222;
	for (int i_23_ = 0; i_23_ < i; i_23_++) {
	    int i_24_ = is[i_23_];
	    short[] is_25_ = (((Class137_Sub2)
			       ((Class528_Sub26) this).aClass137_Sub2_10428)
			      .aShortArrayArray8967[i_24_]);
	    int i_26_ = ((Class528_Sub26) this).anIntArray10438[i_24_];
	    if (i_26_ != 0 && is_25_ != null) {
		int i_27_ = 0;
		int i_28_ = 0;
		while (i_28_ < is_25_.length) {
		    if ((i_26_ & 1 << i_27_++) != 0) {
			for (int i_29_ = 0; i_29_ < 3; i_29_++) {
			    int i_30_ = is_25_[i_28_++] & 0xffff;
			    if (i_30_ > ((Class528_Sub26) this).anInt10437)
				((Class528_Sub26) this).anInt10437 = i_30_;
			    if (i_30_ < ((Class528_Sub26) this).anInt10436)
				((Class528_Sub26) this).anInt10436 = i_30_;
			    bytebuffer.putShort((short) i_30_);
			}
			((Class528_Sub26) this).anInt10435 += 3;
		    } else
			i_28_ += 3;
		}
	    }
	}
    }
}
