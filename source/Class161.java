/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class161
{
    static byte[] aByteArray1806;
    boolean aBool1807;
    static short[] aShortArray1808;
    static short[] aShortArray1809;
    Class528_Sub16 aClass528_Sub16_1810 = null;
    static final int anInt1811 = 2;
    boolean aBool1812;
    int anInt1813 = 0;
    short[] aShortArray1814;
    short[] aShortArray1815;
    short[] aShortArray1816;
    short[] aShortArray1817;
    short[] aShortArray1818;
    byte[] aByteArray1819;
    static short[] aShortArray1820;
    static short[] aShortArray1821 = new short[500];
    boolean aBool1822;
    static short[] aShortArray1823 = new short[500];
    static final int anInt1824 = 2;
    static final int anInt1825 = 1;
    
    static {
	aShortArray1808 = new short[500];
	aShortArray1809 = new short[500];
	aShortArray1820 = new short[500];
	aByteArray1806 = new byte[500];
    }
    
    Class161(byte[] is, Class528_Sub16 class528_sub16) {
	((Class161) this).aBool1812 = false;
	((Class161) this).aBool1807 = false;
	((Class161) this).aBool1822 = false;
	((Class161) this).aClass528_Sub16_1810 = class528_sub16;
	try {
	    ByteBuffer class528_sub42 = new ByteBuffer(is);
	    ByteBuffer class528_sub42_0_ = new ByteBuffer(is);
	    int i = class528_sub42.readUnsignedByte((byte) 72);
	    class528_sub42.pointer += -264964202;
	    int i_1_ = class528_sub42.readUnsignedShort(-2089364694);
	    int i_2_ = 0;
	    int i_3_ = -1;
	    int i_4_ = -1;
	    class528_sub42_0_.pointer
		= (class528_sub42.pointer * -185904669 + i_1_) * 2015001547;
	    for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
		int i_6_ = (((Class528_Sub16)
			     ((Class161) this).aClass528_Sub16_1810)
			    .anIntArray10384[i_5_]);
		if (i_6_ == 0)
		    i_3_ = i_5_;
		int i_7_ = class528_sub42.readUnsignedByte((byte) 3);
		if (i_7_ > 0) {
		    if (i_6_ == 0)
			i_4_ = i_5_;
		    aShortArray1821[i_2_] = (short) i_5_;
		    short i_8_ = 0;
		    if (i_6_ == 3 || i_6_ == 10)
			i_8_ = (short) 128;
		    if (i >= 2 && i_6_ == 7) {
			if ((i_7_ & 0x1) != 0) {
			    aShortArray1823[i_2_]
				= (short) class528_sub42_0_
					      .method9640(-2045994835);
			    class528_sub42_0_.method9640(-1409871655);
			} else
			    aShortArray1823[i_2_] = i_8_;
			if ((i_7_ & 0x2) != 0) {
			    aShortArray1808[i_2_]
				= (short) class528_sub42_0_
					      .method9640(-1620126511);
			    class528_sub42_0_.method9640(-1800215650);
			} else
			    aShortArray1808[i_2_] = i_8_;
			if ((i_7_ & 0x4) != 0) {
			    aShortArray1809[i_2_]
				= (short) class528_sub42_0_
					      .method9640(-1817734608);
			    class528_sub42_0_.method9640(-1919226713);
			} else
			    aShortArray1809[i_2_] = i_8_;
		    } else {
			if ((i_7_ & 0x1) != 0)
			    aShortArray1823[i_2_]
				= (short) class528_sub42_0_
					      .method9640(-1285828350);
			else
			    aShortArray1823[i_2_] = i_8_;
			if ((i_7_ & 0x2) != 0)
			    aShortArray1808[i_2_]
				= (short) class528_sub42_0_
					      .method9640(-2041372388);
			else
			    aShortArray1808[i_2_] = i_8_;
			if ((i_7_ & 0x4) != 0)
			    aShortArray1809[i_2_]
				= (short) class528_sub42_0_
					      .method9640(-1214614046);
			else
			    aShortArray1809[i_2_] = i_8_;
		    }
		    aByteArray1806[i_2_] = (byte) (i_7_ >>> 3 & 0x3);
		    if (i_6_ == 2 || i_6_ == 9) {
			aShortArray1823[i_2_]
			    = (short) (aShortArray1823[i_2_] << 2 & 0x3fff);
			aShortArray1808[i_2_]
			    = (short) (aShortArray1808[i_2_] << 2 & 0x3fff);
			aShortArray1809[i_2_]
			    = (short) (aShortArray1809[i_2_] << 2 & 0x3fff);
		    }
		    aShortArray1820[i_2_] = (short) -1;
		    if (i_6_ == 1 || i_6_ == 2 || i_6_ == 3) {
			if (i_3_ > i_4_) {
			    aShortArray1820[i_2_] = (short) i_3_;
			    i_4_ = i_3_;
			}
		    } else if (i_6_ == 5)
			((Class161) this).aBool1812 = true;
		    else if (i_6_ == 7)
			((Class161) this).aBool1807 = true;
		    else if (i_6_ == 9 || i_6_ == 10 || i_6_ == 8)
			((Class161) this).aBool1822 = true;
		    i_2_++;
		}
	    }
	    if (class528_sub42_0_.pointer * -185904669 != is.length)
		throw new RuntimeException();
	    ((Class161) this).anInt1813 = i_2_;
	    ((Class161) this).aShortArray1814 = new short[i_2_];
	    ((Class161) this).aShortArray1815 = new short[i_2_];
	    ((Class161) this).aShortArray1816 = new short[i_2_];
	    ((Class161) this).aShortArray1817 = new short[i_2_];
	    ((Class161) this).aShortArray1818 = new short[i_2_];
	    ((Class161) this).aByteArray1819 = new byte[i_2_];
	    for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
		((Class161) this).aShortArray1814[i_9_]
		    = aShortArray1821[i_9_];
		((Class161) this).aShortArray1815[i_9_]
		    = aShortArray1823[i_9_];
		((Class161) this).aShortArray1816[i_9_]
		    = aShortArray1808[i_9_];
		((Class161) this).aShortArray1817[i_9_]
		    = aShortArray1809[i_9_];
		((Class161) this).aShortArray1818[i_9_]
		    = aShortArray1820[i_9_];
		((Class161) this).aByteArray1819[i_9_] = aByteArray1806[i_9_];
	    }
	} catch (Exception exception) {
	    ((Class161) this).anInt1813 = 0;
	    ((Class161) this).aBool1812 = false;
	    ((Class161) this).aBool1807 = false;
	}
    }
}
