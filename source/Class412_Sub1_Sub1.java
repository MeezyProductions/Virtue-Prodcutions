/* Class412_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class412_Sub1_Sub1 extends Class412_Sub1
{
    byte[] aByteArray11476;
    
    byte[] method10429(int i, int i_0_, int i_1_) {
	((Class412_Sub1_Sub1) this).aByteArray11476
	    = new byte[i * i_0_ * i_1_ * 2];
	method4921(i, i_0_, i_1_);
	return ((Class412_Sub1_Sub1) this).aByteArray11476;
    }
    
    byte[] method10430(int i, int i_2_, int i_3_) {
	((Class412_Sub1_Sub1) this).aByteArray11476
	    = new byte[i * i_2_ * i_3_ * 2];
	method4921(i, i_2_, i_3_);
	return ((Class412_Sub1_Sub1) this).aByteArray11476;
    }
    
    void method9175(int i, byte i_4_) {
	int i_5_ = i * 2;
	i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
	((Class412_Sub1_Sub1) this).aByteArray11476[i_5_++] = i_4_;
	((Class412_Sub1_Sub1) this).aByteArray11476[i_5_] = i_4_;
    }
    
    void method9177(int i, byte i_6_) {
	int i_7_ = i * 2;
	i_6_ = (byte) (127 + ((i_6_ & 0xff) >> 1));
	((Class412_Sub1_Sub1) this).aByteArray11476[i_7_++] = i_6_;
	((Class412_Sub1_Sub1) this).aByteArray11476[i_7_] = i_6_;
    }
    
    void method9176(int i, byte i_8_) {
	int i_9_ = i * 2;
	i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
	((Class412_Sub1_Sub1) this).aByteArray11476[i_9_++] = i_8_;
	((Class412_Sub1_Sub1) this).aByteArray11476[i_9_] = i_8_;
    }
    
    Class412_Sub1_Sub1() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
}
