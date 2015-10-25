/* Class528_Sub21_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub21_Sub6 extends Class528_Sub21
{
    public String aString11537;
    public char[] aCharArray11538;
    public char[] aCharArray11539;
    public int[] anIntArray11540;
    public int[] anIntArray11541;
    
    void method10486(ByteBuffer class528_sub42, int i, int i_0_) {
	do {
	    if (1 == i)
		aString11537 = class528_sub42.readString(1676372688);
	    else if (2 == i) {
		int i_1_ = class528_sub42.readUnsignedByte((byte) 52);
		anIntArray11541 = new int[i_1_];
		aCharArray11539 = new char[i_1_];
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
		    anIntArray11541[i_2_]
			= class528_sub42.readUnsignedShort(356051546);
		    byte i_3_ = class528_sub42.method9627(-1595001360);
		    aCharArray11539[i_2_]
			= 0 == i_3_ ? '\0' : Class505.method6149(i_3_,
								 2012803956);
		}
	    } else if (3 == i) {
		int i_4_ = class528_sub42.readUnsignedByte((byte) 61);
		anIntArray11540 = new int[i_4_];
		aCharArray11538 = new char[i_4_];
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		    anIntArray11540[i_5_]
			= class528_sub42.readUnsignedShort(83675598);
		    byte i_6_ = class528_sub42.method9627(-1280284825);
		    aCharArray11538[i_5_]
			= i_6_ == 0 ? '\0' : Class505.method6149(i_6_,
								 -510016877);
		}
	    } else if (4 == i)
		break;
	} while (false);
    }
    
    public int method10487(char c, int i) {
	if (null == anIntArray11540)
	    return -1;
	for (int i_7_ = 0; i_7_ < anIntArray11540.length; i_7_++) {
	    if (c == aCharArray11538[i_7_])
		return anIntArray11540[i_7_];
	}
	return -1;
    }
    
    void method10488(byte i) {
	if (anIntArray11540 != null) {
	    for (int i_8_ = 0; i_8_ < anIntArray11540.length; i_8_++)
		anIntArray11540[i_8_] |= 0x8000;
	}
	if (anIntArray11541 != null) {
	    for (int i_9_ = 0; i_9_ < anIntArray11541.length; i_9_++)
		anIntArray11541[i_9_] |= 0x8000;
	}
    }
    
    public int method10489(char c, int i) {
	if (null == anIntArray11541)
	    return -1;
	for (int i_10_ = 0; i_10_ < anIntArray11541.length; i_10_++) {
	    if (c == aCharArray11539[i_10_])
		return anIntArray11541[i_10_];
	}
	return -1;
    }
    
    void method10490() {
	if (anIntArray11540 != null) {
	    for (int i = 0; i < anIntArray11540.length; i++)
		anIntArray11540[i] |= 0x8000;
	}
	if (anIntArray11541 != null) {
	    for (int i = 0; i < anIntArray11541.length; i++)
		anIntArray11541[i] |= 0x8000;
	}
    }
    
    Class528_Sub21_Sub6() {
	/* empty */
    }
    
    void method10491(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 22);
	    if (0 == i)
		break;
	    method10486(class528_sub42, i, 1247164594);
	}
    }
    
    void method10492() {
	if (anIntArray11540 != null) {
	    for (int i = 0; i < anIntArray11540.length; i++)
		anIntArray11540[i] |= 0x8000;
	}
	if (anIntArray11541 != null) {
	    for (int i = 0; i < anIntArray11541.length; i++)
		anIntArray11541[i] |= 0x8000;
	}
    }
    
    void method10493(ByteBuffer class528_sub42, int i) {
	for (;;) {
	    int i_11_ = class528_sub42.readUnsignedByte((byte) 7);
	    if (0 == i_11_)
		break;
	    method10486(class528_sub42, i_11_, 670190017);
	}
    }
}
