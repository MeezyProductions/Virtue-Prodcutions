/* Class412_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class412_Sub1 extends Class412
{
    int anInt10143;
    int[] anIntArray10144 = new int[((Class412_Sub1) this).anInt4723];
    byte[] aByteArray10145;
    int anInt10146;
    
    void method4920(int i, int i_0_) {
	((Class412_Sub1) this).anInt10146
	    += i_0_ * ((Class412_Sub1) this).anIntArray10144[i] >> 12;
    }
    
    void method4916() {
	((Class412_Sub1) this).anInt10143 = 0;
	((Class412_Sub1) this).anInt10146 = 0;
    }
    
    void method4910(int i, int i_1_) {
	((Class412_Sub1) this).anInt10146
	    += i_1_ * ((Class412_Sub1) this).anIntArray10144[i] >> 12;
    }
    
    void method4912() {
	((Class412_Sub1) this).anInt10146
	    = Math.abs(((Class412_Sub1) this).anInt10146);
	if (((Class412_Sub1) this).anInt10146 >= 4096)
	    ((Class412_Sub1) this).anInt10146 = 4095;
	method9175(((Class412_Sub1) this).anInt10143++,
		   (byte) (((Class412_Sub1) this).anInt10146 >> 4));
	((Class412_Sub1) this).anInt10146 = 0;
    }
    
    void method9175(int i, byte i_2_) {
	((Class412_Sub1) this).aByteArray10145
	    [((Class412_Sub1) this).anInt10143++]
	    = (byte) (127 + ((i_2_ & 0xff) >> 1));
    }
    
    void method4919(int i, int i_3_) {
	((Class412_Sub1) this).anInt10146
	    += i_3_ * ((Class412_Sub1) this).anIntArray10144[i] >> 12;
    }
    
    void method4914() {
	((Class412_Sub1) this).anInt10143 = 0;
	((Class412_Sub1) this).anInt10146 = 0;
    }
    
    Class412_Sub1(int i, int i_4_, int i_5_, int i_6_, int i_7_, float f) {
	super(i, i_4_, i_5_, i_6_, i_7_);
	for (int i_8_ = 0; i_8_ < ((Class412_Sub1) this).anInt4723; i_8_++)
	    ((Class412_Sub1) this).anIntArray10144[i_8_]
		= (short) (int) (Math.pow((double) f, (double) i_8_) * 4096.0);
    }
    
    void method9176(int i, byte i_9_) {
	((Class412_Sub1) this).aByteArray10145
	    [((Class412_Sub1) this).anInt10143++]
	    = (byte) (127 + ((i_9_ & 0xff) >> 1));
    }
    
    void method4918() {
	((Class412_Sub1) this).anInt10146
	    = Math.abs(((Class412_Sub1) this).anInt10146);
	if (((Class412_Sub1) this).anInt10146 >= 4096)
	    ((Class412_Sub1) this).anInt10146 = 4095;
	method9175(((Class412_Sub1) this).anInt10143++,
		   (byte) (((Class412_Sub1) this).anInt10146 >> 4));
	((Class412_Sub1) this).anInt10146 = 0;
    }
    
    void method9177(int i, byte i_10_) {
	((Class412_Sub1) this).aByteArray10145
	    [((Class412_Sub1) this).anInt10143++]
	    = (byte) (127 + ((i_10_ & 0xff) >> 1));
    }
    
    void method4917() {
	((Class412_Sub1) this).anInt10146
	    = Math.abs(((Class412_Sub1) this).anInt10146);
	if (((Class412_Sub1) this).anInt10146 >= 4096)
	    ((Class412_Sub1) this).anInt10146 = 4095;
	method9175(((Class412_Sub1) this).anInt10143++,
		   (byte) (((Class412_Sub1) this).anInt10146 >> 4));
	((Class412_Sub1) this).anInt10146 = 0;
    }
    
    void method4909(int i, int i_11_) {
	((Class412_Sub1) this).anInt10146
	    += i_11_ * ((Class412_Sub1) this).anIntArray10144[i] >> 12;
    }
}
