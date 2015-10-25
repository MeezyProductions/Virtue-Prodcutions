/* Class412_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class412_Sub1_Sub2 extends Class412_Sub1
{
    byte[] aByteArray11524;
    
    byte[] method10458(int i, int i_0_, int i_1_) {
	((Class412_Sub1_Sub2) this).aByteArray11524
	    = new byte[i * i_0_ * i_1_ * 2];
	method4921(i, i_0_, i_1_);
	return ((Class412_Sub1_Sub2) this).aByteArray11524;
    }
    
    void method9177(int i, byte i_2_) {
	int i_3_ = i * 2;
	i_2_ = (byte) (127 + ((i_2_ & 0xff) >> 1));
	((Class412_Sub1_Sub2) this).aByteArray11524[i_3_++] = i_2_;
	((Class412_Sub1_Sub2) this).aByteArray11524[i_3_] = i_2_;
    }
    
    Class412_Sub1_Sub2() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    byte[] method10459(int i, int i_4_, int i_5_) {
	((Class412_Sub1_Sub2) this).aByteArray11524
	    = new byte[i * i_4_ * i_5_ * 2];
	method4921(i, i_4_, i_5_);
	return ((Class412_Sub1_Sub2) this).aByteArray11524;
    }
    
    void method9175(int i, byte i_6_) {
	int i_7_ = i * 2;
	i_6_ = (byte) (127 + ((i_6_ & 0xff) >> 1));
	((Class412_Sub1_Sub2) this).aByteArray11524[i_7_++] = i_6_;
	((Class412_Sub1_Sub2) this).aByteArray11524[i_7_] = i_6_;
    }
    
    void method9176(int i, byte i_8_) {
	int i_9_ = i * 2;
	i_8_ = (byte) (127 + ((i_8_ & 0xff) >> 1));
	((Class412_Sub1_Sub2) this).aByteArray11524[i_9_++] = i_8_;
	((Class412_Sub1_Sub2) this).aByteArray11524[i_9_] = i_8_;
    }
}
