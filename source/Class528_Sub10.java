/* Class528_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class528_Sub10 extends Node
{
    NativeHeapBuffer aNativeHeapBuffer10291;
    Class137_Sub3 aClass137_Sub3_10292;
    int anInt10293;
    Class173_Sub2 aClass173_Sub2_10294;
    float aFloat10295;
    Class122 aClass122_10296;
    Class126_Sub1 aClass126_Sub1_10297;
    int[] anIntArray10298;
    Class164 aClass164_10299;
    Stream aStream10300;
    
    void method9333(int i) {
	((Class528_Sub10) this).aNativeHeapBuffer10291
	    = ((Class173_Sub2) ((Class528_Sub10) this).aClass173_Sub2_10294)
		  .aNativeHeap9459.method1342(i * 4, true);
	((Class528_Sub10) this).aStream10300
	    = new Stream(((Class528_Sub10) this).aNativeHeapBuffer10291);
    }
    
    void method9334(int i) {
	((Class528_Sub10) this).aStream10300.method1185(i * 4 + 3);
	((Class528_Sub10) this).aStream10300.method1186(-1);
    }
    
    void method9335(int i, int i_0_, int i_1_) {
	((Class528_Sub10) this).anIntArray10298
	    [i_0_ * (((Class528_Sub10) this).aClass137_Sub3_10292.anInt1627
		     * -657933437) + i]
	    |= 1 << i_1_;
    }
    
    void method9336(int i, int i_2_, int i_3_, float f) {
	if (((Class528_Sub10) this).anInt10293 != -1) {
	    Class160 class160
		= (((Class528_Sub10) this).aClass173_Sub2_10294
		       .aClass165_1984.method2093
		   (((Class528_Sub10) this).anInt10293, (byte) -99));
	    int i_4_ = class160.aByte1802 & 0xff;
	    if (i_4_ != 0 && class160.aByte1790 != 4) {
		int i_5_;
		if (i_3_ < 0)
		    i_5_ = 0;
		else if (i_3_ > 127)
		    i_5_ = 16777215;
		else
		    i_5_ = 131586 * i_3_;
		if (i_4_ == 256)
		    i_2_ = i_5_;
		else {
		    int i_6_ = i_4_;
		    int i_7_ = 256 - i_4_;
		    i_2_
			= (((i_5_ & 0xff00ff) * i_6_ + (i_2_ & 0xff00ff) * i_7_
			    & ~0xff00ff)
			   + ((i_5_ & 0xff00) * i_6_ + (i_2_ & 0xff00) * i_7_
			      & 0xff0000)) >> 8;
		}
	    }
	    int i_8_ = class160.aByte1801 & 0xff;
	    if (i_8_ != 0) {
		i_8_ += 256;
		int i_9_ = ((i_2_ & 0xff0000) >> 16) * i_8_;
		if (i_9_ > 65535)
		    i_9_ = 65535;
		int i_10_ = ((i_2_ & 0xff00) >> 8) * i_8_;
		if (i_10_ > 65535)
		    i_10_ = 65535;
		int i_11_ = (i_2_ & 0xff) * i_8_;
		if (i_11_ > 65535)
		    i_11_ = 65535;
		i_2_
		    = (i_9_ << 8 & 0xff0000) + (i_10_ & 0xff00) + (i_11_ >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_12_ = i_2_ >> 16 & 0xff;
	    int i_13_ = i_2_ >> 8 & 0xff;
	    int i_14_ = i_2_ & 0xff;
	    i_12_ *= f;
	    if (i_12_ < 0)
		i_12_ = 0;
	    else if (i_12_ > 255)
		i_12_ = 255;
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
	    i_2_ = i_12_ << 16 | i_13_ << 8 | i_14_;
	}
	((Class528_Sub10) this).aStream10300.method1185(i * 4);
	((Class528_Sub10) this).aStream10300.method1186((byte) (i_2_ >> 16));
	((Class528_Sub10) this).aStream10300.method1186((byte) (i_2_ >> 8));
	((Class528_Sub10) this).aStream10300.method1186((byte) i_2_);
    }
    
    void method9337(int i) {
	((Class528_Sub10) this).aStream10300.method1189();
	Interface14 interface14
	    = (((Class528_Sub10) this).aClass173_Sub2_10294.method8766
	       (4, ((Class528_Sub10) this).aNativeHeapBuffer10291, i * 4,
		false));
	if (interface14 instanceof Class123_Sub2)
	    ((Class528_Sub10) this).aNativeHeapBuffer10291.method1168();
	((Class528_Sub10) this).aClass122_10296
	    = new Class122(interface14, 5121, 4, 0);
	((Class528_Sub10) this).aNativeHeapBuffer10291 = null;
	((Class528_Sub10) this).aStream10300 = null;
    }
    
    void method9338(int i) {
	((Class528_Sub10) this).aStream10300.method1185(i * 4 + 3);
	((Class528_Sub10) this).aStream10300.method1186(-1);
    }
    
    void method9339(int i) {
	((Class528_Sub10) this).aStream10300.method1185(i * 4 + 3);
	((Class528_Sub10) this).aStream10300.method1186(-1);
    }
    
    void method9340(int[] is, int i) {
	int i_15_ = 0;
	Class528_Sub42_Sub1 class528_sub42_sub1
	    = (((Class173_Sub2) ((Class528_Sub10) this).aClass173_Sub2_10294)
	       .aClass528_Sub42_Sub1_9597);
	class528_sub42_sub1.pointer = 0;
	if (((Class173_Sub2) ((Class528_Sub10) this).aClass173_Sub2_10294)
	    .aBool9561) {
	    for (int i_16_ = 0; i_16_ < i; i_16_++) {
		int i_17_ = is[i_16_];
		short[] is_18_ = (((Class137_Sub3) (((Class528_Sub10) this)
						    .aClass137_Sub3_10292))
				  .aShortArrayArray9006[i_17_]);
		int i_19_ = ((Class528_Sub10) this).anIntArray10298[i_17_];
		if (i_19_ != 0 && is_18_ != null) {
		    int i_20_ = 0;
		    int i_21_ = 0;
		    while (i_21_ < is_18_.length) {
			if ((i_19_ & 1 << i_20_++) != 0) {
			    class528_sub42_sub1.method9717((is_18_[i_21_++]
							    & 0xffff),
							   (byte) -15);
			    i_15_++;
			    class528_sub42_sub1.method9717((is_18_[i_21_++]
							    & 0xffff),
							   (byte) 103);
			    i_15_++;
			    class528_sub42_sub1.method9717((is_18_[i_21_++]
							    & 0xffff),
							   (byte) -15);
			    i_15_++;
			} else
			    i_21_ += 3;
		    }
		}
	    }
	} else {
	    for (int i_22_ = 0; i_22_ < i; i_22_++) {
		int i_23_ = is[i_22_];
		short[] is_24_ = (((Class137_Sub3) (((Class528_Sub10) this)
						    .aClass137_Sub3_10292))
				  .aShortArrayArray9006[i_23_]);
		int i_25_ = ((Class528_Sub10) this).anIntArray10298[i_23_];
		if (i_25_ != 0 && is_24_ != null) {
		    int i_26_ = 0;
		    int i_27_ = 0;
		    while (i_27_ < is_24_.length) {
			if ((i_25_ & 1 << i_26_++) != 0) {
			    class528_sub42_sub1.writeLEShort((is_24_[i_27_++]
							    & 0xffff),
							   -1102718643);
			    i_15_++;
			    class528_sub42_sub1.writeLEShort((is_24_[i_27_++]
							    & 0xffff),
							   -1102718643);
			    i_15_++;
			    class528_sub42_sub1.writeLEShort((is_24_[i_27_++]
							    & 0xffff),
							   -1102718643);
			    i_15_++;
			} else
			    i_27_ += 3;
		    }
		}
	    }
	}
	if (i_15_ > 0) {
	    ((Class528_Sub10) this).aClass126_Sub1_10297.method85
		(5123, class528_sub42_sub1.payload,
		 class528_sub42_sub1.pointer * -185904669);
	    ((Class528_Sub10) this).aClass173_Sub2_10294.method8779
		(((Class137_Sub3)
		  ((Class528_Sub10) this).aClass137_Sub3_10292).aClass122_9019,
		 ((Class137_Sub3)
		  ((Class528_Sub10) this).aClass137_Sub3_10292).aClass122_9030,
		 ((Class528_Sub10) this).aClass122_10296,
		 ((Class137_Sub3) (((Class528_Sub10) this)
				   .aClass137_Sub3_10292)).aClass122_9022);
	    ((Class528_Sub10) this).aClass173_Sub2_10294.method8809
		(((Class528_Sub10) this).anInt10293,
		 (((Class137_Sub3)
		   ((Class528_Sub10) this).aClass137_Sub3_10292).anInt9003
		  & 0x7) != 0,
		 (((Class137_Sub3)
		   ((Class528_Sub10) this).aClass137_Sub3_10292).anInt9003
		  & 0x8) != 0);
	    if (((Class173_Sub2) ((Class528_Sub10) this).aClass173_Sub2_10294)
		.aBool9510)
		((Class528_Sub10) this).aClass173_Sub2_10294.method2152
		    (2147483647, ((Class528_Sub10) this).aClass164_10299);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPushMatrix();
	    OpenGL.glScalef(1.0F / ((Class528_Sub10) this).aFloat10295,
			    1.0F / ((Class528_Sub10) this).aFloat10295, 1.0F);
	    OpenGL.glMatrixMode(5888);
	    ((Class528_Sub10) this).aClass173_Sub2_10294.method8779
		(((Class137_Sub3)
		  ((Class528_Sub10) this).aClass137_Sub3_10292).aClass122_9019,
		 ((Class137_Sub3)
		  ((Class528_Sub10) this).aClass137_Sub3_10292).aClass122_9030,
		 ((Class528_Sub10) this).aClass122_10296,
		 ((Class137_Sub3) (((Class528_Sub10) this)
				   .aClass137_Sub3_10292)).aClass122_9022);
	    ((Class528_Sub10) this).aClass173_Sub2_10294.method8769
		(((Class528_Sub10) this).aClass126_Sub1_10297, 4, 0, i_15_);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	}
    }
    
    void method9341(int i, int i_28_, int i_29_) {
	((Class528_Sub10) this).anIntArray10298
	    [i_28_ * (((Class528_Sub10) this).aClass137_Sub3_10292.anInt1627
		      * -657933437) + i]
	    |= 1 << i_29_;
    }
    
    void method9342(int i, int i_30_, int i_31_) {
	((Class528_Sub10) this).anIntArray10298
	    [i_30_ * (((Class528_Sub10) this).aClass137_Sub3_10292.anInt1627
		      * -657933437) + i]
	    |= 1 << i_31_;
    }
    
    Class528_Sub10(Class137_Sub3 class137_sub3, int i, int i_32_,
		   Class164 class164) {
	((Class528_Sub10) this).aClass137_Sub3_10292 = class137_sub3;
	((Class528_Sub10) this).aClass173_Sub2_10294
	    = (((Class137_Sub3) ((Class528_Sub10) this).aClass137_Sub3_10292)
	       .aClass173_Sub2_8999);
	((Class528_Sub10) this).anInt10293 = i;
	((Class528_Sub10) this).aFloat10295 = (float) i_32_;
	((Class528_Sub10) this).aClass164_10299 = class164;
	((Class528_Sub10) this).anIntArray10298
	    = (new int
	       [(((Class528_Sub10) this).aClass137_Sub3_10292.anInt1627
		 * -657933437
		 * (((Class528_Sub10) this).aClass137_Sub3_10292.anInt1626
		    * 1769495707))]);
	((Class528_Sub10) this).aClass126_Sub1_10297
	    = new Class126_Sub1(((Class528_Sub10) this).aClass173_Sub2_10294,
				5123, null, 1);
    }
}
