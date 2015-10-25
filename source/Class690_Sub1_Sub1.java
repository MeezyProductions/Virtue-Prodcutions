/* Class690_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class690_Sub1_Sub1 extends Class690_Sub1
{
    public int anInt11700;
    
    public Class690_Sub1_Sub1(Class645_Sub1 class645_sub1) {
	super(class645_sub1, false);
    }
    
    public static void method10629(int i) {
	Class293.aBool3219 = true;
	Class25.aString238 = Class54.aString662;
	Class5_Sub10.aString10840 = Class54.aString663;
	Class416.method4969(false, 5126206);
	Class668.method7923(252703489);
	Class293.aClass286Array3212 = null;
	Class244.aClass428_2737 = null;
	Class487.method5890(11, 2130003981);
    }
    
    public static final int method10630
	(Class5_Sub15 class5_sub15, byte[] is, int i, int i_0_, int i_1_,
	 int i_2_, Class608 class608, Class608 class608_3_, int i_4_) {
	int i_5_ = 0;
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	int i_6_ = -1;
	for (;;) {
	    int i_7_ = class528_sub42.method9643(-297337019);
	    if (i_7_ == 0)
		break;
	    i_6_ += i_7_;
	    int i_8_ = 0;
	    boolean bool = false;
	    for (;;) {
		if (bool) {
		    int i_9_ = class528_sub42.method9719(65280);
		    if (0 == i_9_)
			break;
		    class528_sub42.readUnsignedByte((byte) 15);
		} else {
		    int i_10_ = class528_sub42.method9719(65280);
		    if (i_10_ == 0)
			break;
		    i_8_ += i_10_ - 1;
		    int i_11_ = i_8_ & 0x3f;
		    int i_12_ = i_8_ >> 6 & 0x3f;
		    int i_13_ = class528_sub42.readUnsignedByte((byte) 20) >> 2;
		    int i_14_ = i_13_ & 0x3;
		    i_13_ >>= 2;
		    int i_15_ = i + i_12_;
		    int i_16_ = i_11_ + i_0_;
		    Class596 class596
			= (Class596) class5_sub15.method63(i_6_, 1874359656);
		    int i_17_;
		    int i_18_;
		    if (0 == (i_14_ & 0x1)) {
			i_17_ = -267660407 * class596.anInt7812;
			i_18_ = class596.anInt7843 * 423043053;
		    } else {
			i_17_ = 423043053 * class596.anInt7843;
			i_18_ = -267660407 * class596.anInt7812;
		    }
		    if (i_15_ < i_1_ && i_16_ < i_2_ && i_15_ + i_17_ >= 0
			&& i_16_ + i_18_ >= 0) {
			if ((Class605.aClass605_7913.anInt7905 * 1922173025
			     != i_13_)
			    || (Class514.aClass528_Sub38_6967
				    .aClass691_Sub4_10578.method9850((byte) 40)
				!= 0)
			    || class596.anInt7785 * 567849393 != 0
			    || 1 == class596.anInt7784 * 751199807
			    || class596.aBool7816) {
			    if (!class596.method7096(class608_3_,
						     2043083688)) {
				class608.anInt7947 = i_6_ * -277978303;
				i_5_++;
			    }
			    bool = true;
			}
		    }
		}
	    }
	}
	return i_5_;
    }
}
