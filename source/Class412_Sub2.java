/* Class412_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class412_Sub2 extends Class412
{
    int anInt10181;
    int anInt10182;
    int anInt10183;
    int anInt10184;
    int anInt10185;
    byte[] aByteArray10186;
    int anInt10187;
    int anInt10188;
    int anInt10189;
    
    void method4916() {
	((Class412_Sub2) this).anInt10181 = 0;
	((Class412_Sub2) this).anInt10183 = 0;
    }
    
    void method4920(int i, int i_0_) {
	if (i != 0) {
	    ((Class412_Sub2) this).anInt10182
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10187) >> 12;
	    if (((Class412_Sub2) this).anInt10182 < 0)
		((Class412_Sub2) this).anInt10182 = 0;
	    else if (((Class412_Sub2) this).anInt10182 > 4096)
		((Class412_Sub2) this).anInt10182 = 4096;
	    ((Class412_Sub2) this).anInt10184
		= ((Class412_Sub2) this).anInt10188 - (i_0_ < 0 ? -i_0_
						       : i_0_);
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10184) >> 12;
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10182) >> 12;
	    ((Class412_Sub2) this).anInt10183
		+= (((Class412_Sub2) this).anInt10184
		    * ((Class412_Sub2) this).anInt10185) >> 12;
	    ((Class412_Sub2) this).anInt10185
		= (((Class412_Sub2) this).anInt10185
		   * ((Class412_Sub2) this).anInt10189) >> 12;
	} else {
	    ((Class412_Sub2) this).anInt10184
		= ((Class412_Sub2) this).anInt10188 - (i_0_ < 0 ? -i_0_
						       : i_0_);
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10184) >> 12;
	    ((Class412_Sub2) this).anInt10182 = 4096;
	    ((Class412_Sub2) this).anInt10183
		= ((Class412_Sub2) this).anInt10184;
	}
    }
    
    void method4910(int i, int i_1_) {
	if (i != 0) {
	    ((Class412_Sub2) this).anInt10182
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10187) >> 12;
	    if (((Class412_Sub2) this).anInt10182 < 0)
		((Class412_Sub2) this).anInt10182 = 0;
	    else if (((Class412_Sub2) this).anInt10182 > 4096)
		((Class412_Sub2) this).anInt10182 = 4096;
	    ((Class412_Sub2) this).anInt10184
		= ((Class412_Sub2) this).anInt10188 - (i_1_ < 0 ? -i_1_
						       : i_1_);
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10184) >> 12;
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10182) >> 12;
	    ((Class412_Sub2) this).anInt10183
		+= (((Class412_Sub2) this).anInt10184
		    * ((Class412_Sub2) this).anInt10185) >> 12;
	    ((Class412_Sub2) this).anInt10185
		= (((Class412_Sub2) this).anInt10185
		   * ((Class412_Sub2) this).anInt10189) >> 12;
	} else {
	    ((Class412_Sub2) this).anInt10184
		= ((Class412_Sub2) this).anInt10188 - (i_1_ < 0 ? -i_1_
						       : i_1_);
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10184) >> 12;
	    ((Class412_Sub2) this).anInt10182 = 4096;
	    ((Class412_Sub2) this).anInt10183
		= ((Class412_Sub2) this).anInt10184;
	}
    }
    
    void method9224(int i, byte i_2_) {
	((Class412_Sub2) this).aByteArray10186[i] = i_2_;
    }
    
    void method4918() {
	((Class412_Sub2) this).anInt10185 = ((Class412_Sub2) this).anInt10189;
	((Class412_Sub2) this).anInt10183 >>= 4;
	if (((Class412_Sub2) this).anInt10183 < 0)
	    ((Class412_Sub2) this).anInt10183 = 0;
	else if (((Class412_Sub2) this).anInt10183 > 255)
	    ((Class412_Sub2) this).anInt10183 = 255;
	method9225(((Class412_Sub2) this).anInt10181++,
		   (byte) ((Class412_Sub2) this).anInt10183);
	((Class412_Sub2) this).anInt10183 = 0;
    }
    
    void method9225(int i, byte i_3_) {
	((Class412_Sub2) this).aByteArray10186[i] = i_3_;
    }
    
    void method9226(int i, byte i_4_) {
	((Class412_Sub2) this).aByteArray10186[i] = i_4_;
    }
    
    void method9227(int i, byte i_5_) {
	((Class412_Sub2) this).aByteArray10186[i] = i_5_;
    }
    
    void method9228(int i, byte i_6_) {
	((Class412_Sub2) this).aByteArray10186[i] = i_6_;
    }
    
    Class412_Sub2(int i, int i_7_, int i_8_, int i_9_, int i_10_, float f,
		  float f_11_, float f_12_) {
	super(i, i_7_, i_8_, i_9_, i_10_);
	((Class412_Sub2) this).anInt10187 = (int) (f_12_ * 4096.0F);
	((Class412_Sub2) this).anInt10188 = (int) (f_11_ * 4096.0F);
	((Class412_Sub2) this).anInt10185
	    = ((Class412_Sub2) this).anInt10189
	    = (int) (Math.pow(0.5, (double) -f) * 4096.0);
    }
    
    void method4914() {
	((Class412_Sub2) this).anInt10181 = 0;
	((Class412_Sub2) this).anInt10183 = 0;
    }
    
    void method4917() {
	((Class412_Sub2) this).anInt10185 = ((Class412_Sub2) this).anInt10189;
	((Class412_Sub2) this).anInt10183 >>= 4;
	if (((Class412_Sub2) this).anInt10183 < 0)
	    ((Class412_Sub2) this).anInt10183 = 0;
	else if (((Class412_Sub2) this).anInt10183 > 255)
	    ((Class412_Sub2) this).anInt10183 = 255;
	method9225(((Class412_Sub2) this).anInt10181++,
		   (byte) ((Class412_Sub2) this).anInt10183);
	((Class412_Sub2) this).anInt10183 = 0;
    }
    
    void method9229(int i, byte i_13_) {
	((Class412_Sub2) this).aByteArray10186[i] = i_13_;
    }
    
    void method4919(int i, int i_14_) {
	if (i != 0) {
	    ((Class412_Sub2) this).anInt10182
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10187) >> 12;
	    if (((Class412_Sub2) this).anInt10182 < 0)
		((Class412_Sub2) this).anInt10182 = 0;
	    else if (((Class412_Sub2) this).anInt10182 > 4096)
		((Class412_Sub2) this).anInt10182 = 4096;
	    ((Class412_Sub2) this).anInt10184
		= ((Class412_Sub2) this).anInt10188 - (i_14_ < 0 ? -i_14_
						       : i_14_);
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10184) >> 12;
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10182) >> 12;
	    ((Class412_Sub2) this).anInt10183
		+= (((Class412_Sub2) this).anInt10184
		    * ((Class412_Sub2) this).anInt10185) >> 12;
	    ((Class412_Sub2) this).anInt10185
		= (((Class412_Sub2) this).anInt10185
		   * ((Class412_Sub2) this).anInt10189) >> 12;
	} else {
	    ((Class412_Sub2) this).anInt10184
		= ((Class412_Sub2) this).anInt10188 - (i_14_ < 0 ? -i_14_
						       : i_14_);
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10184) >> 12;
	    ((Class412_Sub2) this).anInt10182 = 4096;
	    ((Class412_Sub2) this).anInt10183
		= ((Class412_Sub2) this).anInt10184;
	}
    }
    
    void method4912() {
	((Class412_Sub2) this).anInt10185 = ((Class412_Sub2) this).anInt10189;
	((Class412_Sub2) this).anInt10183 >>= 4;
	if (((Class412_Sub2) this).anInt10183 < 0)
	    ((Class412_Sub2) this).anInt10183 = 0;
	else if (((Class412_Sub2) this).anInt10183 > 255)
	    ((Class412_Sub2) this).anInt10183 = 255;
	method9225(((Class412_Sub2) this).anInt10181++,
		   (byte) ((Class412_Sub2) this).anInt10183);
	((Class412_Sub2) this).anInt10183 = 0;
    }
    
    void method4909(int i, int i_15_) {
	if (i != 0) {
	    ((Class412_Sub2) this).anInt10182
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10187) >> 12;
	    if (((Class412_Sub2) this).anInt10182 < 0)
		((Class412_Sub2) this).anInt10182 = 0;
	    else if (((Class412_Sub2) this).anInt10182 > 4096)
		((Class412_Sub2) this).anInt10182 = 4096;
	    ((Class412_Sub2) this).anInt10184
		= ((Class412_Sub2) this).anInt10188 - (i_15_ < 0 ? -i_15_
						       : i_15_);
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10184) >> 12;
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10182) >> 12;
	    ((Class412_Sub2) this).anInt10183
		+= (((Class412_Sub2) this).anInt10184
		    * ((Class412_Sub2) this).anInt10185) >> 12;
	    ((Class412_Sub2) this).anInt10185
		= (((Class412_Sub2) this).anInt10185
		   * ((Class412_Sub2) this).anInt10189) >> 12;
	} else {
	    ((Class412_Sub2) this).anInt10184
		= ((Class412_Sub2) this).anInt10188 - (i_15_ < 0 ? -i_15_
						       : i_15_);
	    ((Class412_Sub2) this).anInt10184
		= (((Class412_Sub2) this).anInt10184
		   * ((Class412_Sub2) this).anInt10184) >> 12;
	    ((Class412_Sub2) this).anInt10182 = 4096;
	    ((Class412_Sub2) this).anInt10183
		= ((Class412_Sub2) this).anInt10184;
	}
    }
}
