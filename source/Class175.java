/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class175
{
    static final int anInt2023 = 0;
    static final int anInt2024 = 1;
    static final int anInt2025 = 0;
    
    public static Class178 method2561(Class446 class446, int i, int i_0_) {
	byte[] is = class446.method5348(i, i_0_, -751519743);
	if (is == null)
	    return null;
	return method2563(is)[0];
    }
    
    public static Class178 method2562(Class446 class446, int i) {
	byte[] is = class446.method5395(i, -950549860);
	if (is == null)
	    return null;
	return method2563(is)[0];
    }
    
    Class175() throws Throwable {
	throw new Error();
    }
    
    public static Class178[] method2563(byte[] is) {
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	class528_sub42.pointer = (is.length - 2) * 2015001547;
	int i = class528_sub42.readUnsignedShort(-1521775339);
	int i_1_ = i >> 15;
	int i_2_ = i & 0x7fff;
	if (i_1_ == 0) {
	    Class178_Sub2[] class178_sub2s = new Class178_Sub2[i_2_];
	    for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
		class178_sub2s[i_3_] = new Class178_Sub2();
	    class528_sub42.pointer
		= (is.length - 7 - i_2_ * 8) * 2015001547;
	    int i_4_ = class528_sub42.readUnsignedShort(-1402902159);
	    int i_5_ = class528_sub42.readUnsignedShort(-21797022);
	    int i_6_ = (class528_sub42.readUnsignedByte((byte) 20) & 0xff) + 1;
	    for (int i_7_ = 0; i_7_ < i_2_; i_7_++)
		class178_sub2s[i_7_].anInt9767
		    = class528_sub42.readUnsignedShort(38022420);
	    for (int i_8_ = 0; i_8_ < i_2_; i_8_++)
		class178_sub2s[i_8_].anInt9765
		    = class528_sub42.readUnsignedShort(-2090124183);
	    for (int i_9_ = 0; i_9_ < i_2_; i_9_++)
		((Class178_Sub2) class178_sub2s[i_9_]).anInt9771
		    = class528_sub42.readUnsignedShort(164886611);
	    for (int i_10_ = 0; i_10_ < i_2_; i_10_++)
		((Class178_Sub2) class178_sub2s[i_10_]).anInt9766
		    = class528_sub42.readUnsignedShort(-1477815992);
	    for (int i_11_ = 0; i_11_ < i_2_; i_11_++) {
		Class178_Sub2 class178_sub2 = class178_sub2s[i_11_];
		((Class178_Sub2) class178_sub2).anInt9768
		    = (i_4_ - ((Class178_Sub2) class178_sub2).anInt9771
		       - class178_sub2.anInt9767);
		((Class178_Sub2) class178_sub2).anInt9772
		    = (i_5_ - ((Class178_Sub2) class178_sub2).anInt9766
		       - class178_sub2.anInt9765);
	    }
	    class528_sub42.pointer
		= (is.length - 7 - i_2_ * 8 - (i_6_ - 1) * 3) * 2015001547;
	    int[] is_12_ = new int[i_6_];
	    for (int i_13_ = 1; i_13_ < i_6_; i_13_++) {
		is_12_[i_13_] = class528_sub42.readTriByte(1040995280);
		if (is_12_[i_13_] == 0)
		    is_12_[i_13_] = 1;
	    }
	    for (int i_14_ = 0; i_14_ < i_2_; i_14_++)
		class178_sub2s[i_14_].anIntArray9769 = is_12_;
	    class528_sub42.pointer = 0;
	    for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
		Class178_Sub2 class178_sub2 = class178_sub2s[i_15_];
		int i_16_ = (((Class178_Sub2) class178_sub2).anInt9771
			     * ((Class178_Sub2) class178_sub2).anInt9766);
		class178_sub2.aByteArray9770 = new byte[i_16_];
		int i_17_ = class528_sub42.readUnsignedByte((byte) 20);
		if ((i_17_ & 0x2) == 0) {
		    if ((i_17_ & 0x1) == 0) {
			for (int i_18_ = 0; i_18_ < i_16_; i_18_++)
			    class178_sub2.aByteArray9770[i_18_]
				= class528_sub42.method9627(-970323027);
		    } else {
			for (int i_19_ = 0;
			     i_19_ < ((Class178_Sub2) class178_sub2).anInt9771;
			     i_19_++) {
			    for (int i_20_ = 0;
				 (i_20_
				  < ((Class178_Sub2) class178_sub2).anInt9766);
				 i_20_++)
				class178_sub2.aByteArray9770
				    [i_19_ + i_20_ * ((Class178_Sub2)
						      class178_sub2).anInt9771]
				    = class528_sub42.method9627(-1238078468);
			}
		    }
		} else {
		    boolean bool = false;
		    class178_sub2.aByteArray9773 = new byte[i_16_];
		    if ((i_17_ & 0x1) == 0) {
			for (int i_21_ = 0; i_21_ < i_16_; i_21_++)
			    class178_sub2.aByteArray9770[i_21_]
				= class528_sub42.method9627(-1831897673);
			for (int i_22_ = 0; i_22_ < i_16_; i_22_++) {
			    byte i_23_
				= (class178_sub2.aByteArray9773[i_22_]
				   = class528_sub42.method9627(-1211947136));
			    bool = bool | i_23_ != -1;
			}
		    } else {
			for (int i_24_ = 0;
			     i_24_ < ((Class178_Sub2) class178_sub2).anInt9771;
			     i_24_++) {
			    for (int i_25_ = 0;
				 (i_25_
				  < ((Class178_Sub2) class178_sub2).anInt9766);
				 i_25_++)
				class178_sub2.aByteArray9770
				    [i_24_ + i_25_ * ((Class178_Sub2)
						      class178_sub2).anInt9771]
				    = class528_sub42.method9627(-1342630824);
			}
			for (int i_26_ = 0;
			     i_26_ < ((Class178_Sub2) class178_sub2).anInt9771;
			     i_26_++) {
			    for (int i_27_ = 0;
				 (i_27_
				  < ((Class178_Sub2) class178_sub2).anInt9766);
				 i_27_++) {
				byte i_28_
				    = (class178_sub2.aByteArray9773
					   [i_26_ + i_27_ * (((Class178_Sub2)
							      class178_sub2)
							     .anInt9771)]
				       = class528_sub42
					     .method9627(-1945179534));
				bool = bool | i_28_ != -1;
			    }
			}
		    }
		    if (!bool)
			class178_sub2.aByteArray9773 = null;
		}
	    }
	    return class178_sub2s;
	}
	Class178_Sub1[] class178_sub1s = new Class178_Sub1[i_2_];
	class528_sub42.pointer = 0;
	int i_29_ = class528_sub42.readUnsignedByte((byte) 79);
	if (i_29_ == 0) {
	    boolean bool = class528_sub42.readUnsignedByte((byte) 46) == 1;
	    int i_30_ = class528_sub42.readUnsignedShort(363716124);
	    int i_31_ = class528_sub42.readUnsignedShort(-568019448);
	    for (int i_32_ = 0; i_32_ < i_2_; i_32_++) {
		int[] is_33_ = new int[i_30_ * i_31_];
		for (int i_34_ = 0; i_34_ < i_30_ * i_31_; i_34_++) {
		    is_33_[i_34_]
			= ~0xffffff | class528_sub42.readTriByte(985499294);
		    if (is_33_[i_34_] == -65281)
			is_33_[i_34_] = 0;
		}
		if (bool) {
		    for (int i_35_ = 0; i_35_ < i_30_ * i_31_; i_35_++) {
			is_33_[i_35_] &= 0xffffff;
			is_33_[i_35_]
			    |= class528_sub42.readUnsignedByte((byte) 4) << 24;
		    }
		}
		class178_sub1s[i_32_]
		    = new Class178_Sub1(i_30_, i_31_, is_33_);
	    }
	} else {
	    if (i_29_ == 1)
		throw new UnsupportedOperationException();
	    throw new RuntimeException();
	}
	return class178_sub1s;
    }
    
    public static Class178[] method2564(Class446 class446, int i, int i_36_) {
	byte[] is = class446.method5348(i, i_36_, -874263258);
	if (is == null)
	    return null;
	return method2563(is);
    }
    
    public static Class178[] method2565(Class446 class446, int i) {
	byte[] is = class446.method5395(i, -430414080);
	if (is == null)
	    return null;
	return method2563(is);
    }
}
