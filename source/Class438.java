/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class438
{
    byte[][] aByteArrayArray4870;
    int anInt4871;
    int[] anIntArray4872;
    int anInt4873;
    int[][] anIntArrayArray4874;
    int[] anIntArray4875;
    int[] anIntArray4876;
    Class253 aClass253_4877;
    byte[] aByteArray4878;
    int[] anIntArray4879;
    int[] anIntArray4880;
    int anInt4881;
    int[] anIntArray4882;
    int[] anIntArray4883;
    int[] anIntArray4884;
    int[] anIntArray4885;
    int[][] anIntArrayArray4886;
    int anInt4887;
    Class253[] aClass253Array4888;
    static final int anInt4889 = 7;
    
    Class438(byte[] is, int i, byte[] is_0_) {
	((Class438) this).anInt4871
	    = Class22.method679(is, is.length, -1178829625) * -1966704275;
	if (i != -461146011 * ((Class438) this).anInt4871)
	    throw new RuntimeException();
	if (is_0_ != null) {
	    if (is_0_.length != 64)
		throw new RuntimeException();
	    ((Class438) this).aByteArray4878
		= Class227.method3183(is, 0, is.length, 1514971751);
	    for (int i_1_ = 0; i_1_ < 64; i_1_++) {
		if (((Class438) this).aByteArray4878[i_1_] != is_0_[i_1_])
		    throw new RuntimeException();
	    }
	}
	method5297(is, 763366711);
    }
    
    void method5297(byte[] is, int i) {
	ByteBuffer class528_sub42
	    = new ByteBuffer(Class257.method3473(is, (byte) 16));
	int i_2_ = class528_sub42.readUnsignedByte((byte) 58);
	if (i_2_ < 5 || i_2_ > 7)
	    throw new RuntimeException();
	if (i_2_ >= 6)
	    ((Class438) this).anInt4873
		= class528_sub42.readInt(243932761) * 1263701331;
	else
	    ((Class438) this).anInt4873 = 0;
	int i_3_ = class528_sub42.readUnsignedByte((byte) 59);
	boolean bool = 0 != (i_3_ & 0x1);
	boolean bool_4_ = (i_3_ & 0x2) != 0;
	boolean bool_5_ = 0 != (i_3_ & 0x4);
	boolean bool_6_ = 0 != (i_3_ & 0x8);
	if (i_2_ >= 7)
	    ((Class438) this).anInt4887
		= class528_sub42.method9722(-572384805) * -376442737;
	else
	    ((Class438) this).anInt4887
		= class528_sub42.readUnsignedShort(-242609908) * -376442737;
	int i_7_ = 0;
	int i_8_ = -1;
	((Class438) this).anIntArray4882
	    = new int[-1319948689 * ((Class438) this).anInt4887];
	if (i_2_ >= 7) {
	    for (int i_9_ = 0;
		 i_9_ < ((Class438) this).anInt4887 * -1319948689; i_9_++) {
		((Class438) this).anIntArray4882[i_9_] = i_7_
		    += class528_sub42.method9722(-572384805);
		if (((Class438) this).anIntArray4882[i_9_] > i_8_)
		    i_8_ = ((Class438) this).anIntArray4882[i_9_];
	    }
	} else {
	    for (int i_10_ = 0;
		 i_10_ < ((Class438) this).anInt4887 * -1319948689; i_10_++) {
		((Class438) this).anIntArray4882[i_10_] = i_7_
		    += class528_sub42.readUnsignedShort(-705567078);
		if (((Class438) this).anIntArray4882[i_10_] > i_8_)
		    i_8_ = ((Class438) this).anIntArray4882[i_10_];
	    }
	}
	((Class438) this).anInt4881 = 1102337583 * (i_8_ + 1);
	((Class438) this).anIntArray4872
	    = new int[((Class438) this).anInt4881 * -311250737];
	if (bool_6_)
	    ((Class438) this).anIntArray4880
		= new int[-311250737 * ((Class438) this).anInt4881];
	if (bool_4_)
	    ((Class438) this).aByteArrayArray4870
		= new byte[((Class438) this).anInt4881 * -311250737][];
	((Class438) this).anIntArray4875
	    = new int[((Class438) this).anInt4881 * -311250737];
	((Class438) this).anIntArray4885
	    = new int[((Class438) this).anInt4881 * -311250737];
	((Class438) this).anIntArrayArray4886
	    = new int[((Class438) this).anInt4881 * -311250737][];
	((Class438) this).anIntArray4879
	    = new int[-311250737 * ((Class438) this).anInt4881];
	if (bool) {
	    ((Class438) this).anIntArray4876
		= new int[((Class438) this).anInt4881 * -311250737];
	    for (int i_11_ = 0;
		 i_11_ < -311250737 * ((Class438) this).anInt4881; i_11_++)
		((Class438) this).anIntArray4876[i_11_] = -1;
	    for (int i_12_ = 0;
		 i_12_ < ((Class438) this).anInt4887 * -1319948689; i_12_++)
		((Class438) this).anIntArray4876[(((Class438) this)
						  .anIntArray4882[i_12_])]
		    = class528_sub42.readInt(31887143);
	    ((Class438) this).aClass253_4877
		= new Class253(((Class438) this).anIntArray4876);
	}
	for (int i_13_ = 0; i_13_ < ((Class438) this).anInt4887 * -1319948689;
	     i_13_++)
	    ((Class438) this).anIntArray4872[(((Class438) this).anIntArray4882
					      [i_13_])]
		= class528_sub42.readInt(715713978);
	if (bool_6_) {
	    for (int i_14_ = 0;
		 i_14_ < -1319948689 * ((Class438) this).anInt4887; i_14_++)
		((Class438) this).anIntArray4880[i_14_]
		    = class528_sub42.readInt(-1497639142);
	}
	if (bool_4_) {
	    for (int i_15_ = 0;
		 i_15_ < -1319948689 * ((Class438) this).anInt4887; i_15_++) {
		byte[] is_16_ = new byte[64];
		class528_sub42.method9718(is_16_, 0, 64, -1456124512);
		((Class438) this).aByteArrayArray4870[(((Class438) this)
						       .anIntArray4882[i_15_])]
		    = is_16_;
	    }
	}
	if (bool_5_) {
	    ((Class438) this).anIntArray4883
		= new int[-311250737 * ((Class438) this).anInt4881];
	    ((Class438) this).anIntArray4884
		= new int[-311250737 * ((Class438) this).anInt4881];
	    for (int i_17_ = 0;
		 i_17_ < ((Class438) this).anInt4887 * -1319948689; i_17_++) {
		((Class438) this).anIntArray4883[(((Class438) this)
						  .anIntArray4882[i_17_])]
		    = class528_sub42.readInt(-510318923);
		((Class438) this).anIntArray4884[(((Class438) this)
						  .anIntArray4882[i_17_])]
		    = class528_sub42.readInt(-267506099);
	    }
	}
	for (int i_18_ = 0; i_18_ < ((Class438) this).anInt4887 * -1319948689;
	     i_18_++)
	    ((Class438) this).anIntArray4875[(((Class438) this).anIntArray4882
					      [i_18_])]
		= class528_sub42.readInt(264949012);
	if (i_2_ >= 7) {
	    for (int i_19_ = 0;
		 i_19_ < ((Class438) this).anInt4887 * -1319948689; i_19_++)
		((Class438) this).anIntArray4885[(((Class438) this)
						  .anIntArray4882[i_19_])]
		    = class528_sub42.method9722(-572384805);
	    for (int i_20_ = 0;
		 i_20_ < -1319948689 * ((Class438) this).anInt4887; i_20_++) {
		int i_21_ = ((Class438) this).anIntArray4882[i_20_];
		int i_22_ = ((Class438) this).anIntArray4885[i_21_];
		i_7_ = 0;
		int i_23_ = -1;
		((Class438) this).anIntArrayArray4886[i_21_] = new int[i_22_];
		for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
		    int i_25_
			= (((Class438) this).anIntArrayArray4886[i_21_][i_24_]
			   = i_7_ += class528_sub42.method9722(-572384805));
		    if (i_25_ > i_23_)
			i_23_ = i_25_;
		}
		((Class438) this).anIntArray4879[i_21_] = i_23_ + 1;
		if (1 + i_23_ == i_22_)
		    ((Class438) this).anIntArrayArray4886[i_21_] = null;
	    }
	} else {
	    for (int i_26_ = 0;
		 i_26_ < ((Class438) this).anInt4887 * -1319948689; i_26_++)
		((Class438) this).anIntArray4885[(((Class438) this)
						  .anIntArray4882[i_26_])]
		    = class528_sub42.readUnsignedShort(-2123706078);
	    for (int i_27_ = 0;
		 i_27_ < -1319948689 * ((Class438) this).anInt4887; i_27_++) {
		int i_28_ = ((Class438) this).anIntArray4882[i_27_];
		int i_29_ = ((Class438) this).anIntArray4885[i_28_];
		i_7_ = 0;
		int i_30_ = -1;
		((Class438) this).anIntArrayArray4886[i_28_] = new int[i_29_];
		for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
		    int i_32_
			= (((Class438) this).anIntArrayArray4886[i_28_][i_31_]
			   = i_7_ += class528_sub42.readUnsignedShort(-702891188));
		    if (i_32_ > i_30_)
			i_30_ = i_32_;
		}
		((Class438) this).anIntArray4879[i_28_] = 1 + i_30_;
		if (i_30_ + 1 == i_29_)
		    ((Class438) this).anIntArrayArray4886[i_28_] = null;
	    }
	}
	if (bool) {
	    ((Class438) this).anIntArrayArray4874 = new int[1 + i_8_][];
	    ((Class438) this).aClass253Array4888 = new Class253[i_8_ + 1];
	    for (int i_33_ = 0;
		 i_33_ < -1319948689 * ((Class438) this).anInt4887; i_33_++) {
		int i_34_ = ((Class438) this).anIntArray4882[i_33_];
		int i_35_ = ((Class438) this).anIntArray4885[i_34_];
		((Class438) this).anIntArrayArray4874[i_34_]
		    = new int[((Class438) this).anIntArray4879[i_34_]];
		for (int i_36_ = 0;
		     i_36_ < ((Class438) this).anIntArray4879[i_34_]; i_36_++)
		    ((Class438) this).anIntArrayArray4874[i_34_][i_36_] = -1;
		for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
		    int i_38_;
		    if (((Class438) this).anIntArrayArray4886[i_34_] != null)
			i_38_ = (((Class438) this).anIntArrayArray4886[i_34_]
				 [i_37_]);
		    else
			i_38_ = i_37_;
		    ((Class438) this).anIntArrayArray4874[i_34_][i_38_]
			= class528_sub42.readInt(-1096664187);
		}
		((Class438) this).aClass253Array4888[i_34_]
		    = new Class253(((Class438) this).anIntArrayArray4874
				   [i_34_]);
	    }
	}
    }
    
    void method5298(byte[] is) {
	ByteBuffer class528_sub42
	    = new ByteBuffer(Class257.method3473(is, (byte) 16));
	int i = class528_sub42.readUnsignedByte((byte) 17);
	if (i < 5 || i > 7)
	    throw new RuntimeException();
	if (i >= 6)
	    ((Class438) this).anInt4873
		= class528_sub42.readInt(643262532) * 1263701331;
	else
	    ((Class438) this).anInt4873 = 0;
	int i_39_ = class528_sub42.readUnsignedByte((byte) 75);
	boolean bool = 0 != (i_39_ & 0x1);
	boolean bool_40_ = (i_39_ & 0x2) != 0;
	boolean bool_41_ = 0 != (i_39_ & 0x4);
	boolean bool_42_ = 0 != (i_39_ & 0x8);
	if (i >= 7)
	    ((Class438) this).anInt4887
		= class528_sub42.method9722(-572384805) * -376442737;
	else
	    ((Class438) this).anInt4887
		= class528_sub42.readUnsignedShort(116554670) * -376442737;
	int i_43_ = 0;
	int i_44_ = -1;
	((Class438) this).anIntArray4882
	    = new int[-1319948689 * ((Class438) this).anInt4887];
	if (i >= 7) {
	    for (int i_45_ = 0;
		 i_45_ < ((Class438) this).anInt4887 * -1319948689; i_45_++) {
		((Class438) this).anIntArray4882[i_45_] = i_43_
		    += class528_sub42.method9722(-572384805);
		if (((Class438) this).anIntArray4882[i_45_] > i_44_)
		    i_44_ = ((Class438) this).anIntArray4882[i_45_];
	    }
	} else {
	    for (int i_46_ = 0;
		 i_46_ < ((Class438) this).anInt4887 * -1319948689; i_46_++) {
		((Class438) this).anIntArray4882[i_46_] = i_43_
		    += class528_sub42.readUnsignedShort(-1772044146);
		if (((Class438) this).anIntArray4882[i_46_] > i_44_)
		    i_44_ = ((Class438) this).anIntArray4882[i_46_];
	    }
	}
	((Class438) this).anInt4881 = 1102337583 * (i_44_ + 1);
	((Class438) this).anIntArray4872
	    = new int[((Class438) this).anInt4881 * -311250737];
	if (bool_42_)
	    ((Class438) this).anIntArray4880
		= new int[-311250737 * ((Class438) this).anInt4881];
	if (bool_40_)
	    ((Class438) this).aByteArrayArray4870
		= new byte[((Class438) this).anInt4881 * -311250737][];
	((Class438) this).anIntArray4875
	    = new int[((Class438) this).anInt4881 * -311250737];
	((Class438) this).anIntArray4885
	    = new int[((Class438) this).anInt4881 * -311250737];
	((Class438) this).anIntArrayArray4886
	    = new int[((Class438) this).anInt4881 * -311250737][];
	((Class438) this).anIntArray4879
	    = new int[-311250737 * ((Class438) this).anInt4881];
	if (bool) {
	    ((Class438) this).anIntArray4876
		= new int[((Class438) this).anInt4881 * -311250737];
	    for (int i_47_ = 0;
		 i_47_ < -311250737 * ((Class438) this).anInt4881; i_47_++)
		((Class438) this).anIntArray4876[i_47_] = -1;
	    for (int i_48_ = 0;
		 i_48_ < ((Class438) this).anInt4887 * -1319948689; i_48_++)
		((Class438) this).anIntArray4876[(((Class438) this)
						  .anIntArray4882[i_48_])]
		    = class528_sub42.readInt(512816320);
	    ((Class438) this).aClass253_4877
		= new Class253(((Class438) this).anIntArray4876);
	}
	for (int i_49_ = 0; i_49_ < ((Class438) this).anInt4887 * -1319948689;
	     i_49_++)
	    ((Class438) this).anIntArray4872[(((Class438) this).anIntArray4882
					      [i_49_])]
		= class528_sub42.readInt(834087923);
	if (bool_42_) {
	    for (int i_50_ = 0;
		 i_50_ < -1319948689 * ((Class438) this).anInt4887; i_50_++)
		((Class438) this).anIntArray4880[i_50_]
		    = class528_sub42.readInt(743881992);
	}
	if (bool_40_) {
	    for (int i_51_ = 0;
		 i_51_ < -1319948689 * ((Class438) this).anInt4887; i_51_++) {
		byte[] is_52_ = new byte[64];
		class528_sub42.method9718(is_52_, 0, 64, -1456124512);
		((Class438) this).aByteArrayArray4870[(((Class438) this)
						       .anIntArray4882[i_51_])]
		    = is_52_;
	    }
	}
	if (bool_41_) {
	    ((Class438) this).anIntArray4883
		= new int[-311250737 * ((Class438) this).anInt4881];
	    ((Class438) this).anIntArray4884
		= new int[-311250737 * ((Class438) this).anInt4881];
	    for (int i_53_ = 0;
		 i_53_ < ((Class438) this).anInt4887 * -1319948689; i_53_++) {
		((Class438) this).anIntArray4883[(((Class438) this)
						  .anIntArray4882[i_53_])]
		    = class528_sub42.readInt(961805052);
		((Class438) this).anIntArray4884[(((Class438) this)
						  .anIntArray4882[i_53_])]
		    = class528_sub42.readInt(-35032040);
	    }
	}
	for (int i_54_ = 0; i_54_ < ((Class438) this).anInt4887 * -1319948689;
	     i_54_++)
	    ((Class438) this).anIntArray4875[(((Class438) this).anIntArray4882
					      [i_54_])]
		= class528_sub42.readInt(-298426813);
	if (i >= 7) {
	    for (int i_55_ = 0;
		 i_55_ < ((Class438) this).anInt4887 * -1319948689; i_55_++)
		((Class438) this).anIntArray4885[(((Class438) this)
						  .anIntArray4882[i_55_])]
		    = class528_sub42.method9722(-572384805);
	    for (int i_56_ = 0;
		 i_56_ < -1319948689 * ((Class438) this).anInt4887; i_56_++) {
		int i_57_ = ((Class438) this).anIntArray4882[i_56_];
		int i_58_ = ((Class438) this).anIntArray4885[i_57_];
		i_43_ = 0;
		int i_59_ = -1;
		((Class438) this).anIntArrayArray4886[i_57_] = new int[i_58_];
		for (int i_60_ = 0; i_60_ < i_58_; i_60_++) {
		    int i_61_
			= (((Class438) this).anIntArrayArray4886[i_57_][i_60_]
			   = i_43_ += class528_sub42.method9722(-572384805));
		    if (i_61_ > i_59_)
			i_59_ = i_61_;
		}
		((Class438) this).anIntArray4879[i_57_] = i_59_ + 1;
		if (1 + i_59_ == i_58_)
		    ((Class438) this).anIntArrayArray4886[i_57_] = null;
	    }
	} else {
	    for (int i_62_ = 0;
		 i_62_ < ((Class438) this).anInt4887 * -1319948689; i_62_++)
		((Class438) this).anIntArray4885[(((Class438) this)
						  .anIntArray4882[i_62_])]
		    = class528_sub42.readUnsignedShort(-1702921260);
	    for (int i_63_ = 0;
		 i_63_ < -1319948689 * ((Class438) this).anInt4887; i_63_++) {
		int i_64_ = ((Class438) this).anIntArray4882[i_63_];
		int i_65_ = ((Class438) this).anIntArray4885[i_64_];
		i_43_ = 0;
		int i_66_ = -1;
		((Class438) this).anIntArrayArray4886[i_64_] = new int[i_65_];
		for (int i_67_ = 0; i_67_ < i_65_; i_67_++) {
		    int i_68_
			= (((Class438) this).anIntArrayArray4886[i_64_][i_67_]
			   = i_43_ += class528_sub42.readUnsignedShort(-1011511162));
		    if (i_68_ > i_66_)
			i_66_ = i_68_;
		}
		((Class438) this).anIntArray4879[i_64_] = 1 + i_66_;
		if (i_66_ + 1 == i_65_)
		    ((Class438) this).anIntArrayArray4886[i_64_] = null;
	    }
	}
	if (bool) {
	    ((Class438) this).anIntArrayArray4874 = new int[1 + i_44_][];
	    ((Class438) this).aClass253Array4888 = new Class253[i_44_ + 1];
	    for (int i_69_ = 0;
		 i_69_ < -1319948689 * ((Class438) this).anInt4887; i_69_++) {
		int i_70_ = ((Class438) this).anIntArray4882[i_69_];
		int i_71_ = ((Class438) this).anIntArray4885[i_70_];
		((Class438) this).anIntArrayArray4874[i_70_]
		    = new int[((Class438) this).anIntArray4879[i_70_]];
		for (int i_72_ = 0;
		     i_72_ < ((Class438) this).anIntArray4879[i_70_]; i_72_++)
		    ((Class438) this).anIntArrayArray4874[i_70_][i_72_] = -1;
		for (int i_73_ = 0; i_73_ < i_71_; i_73_++) {
		    int i_74_;
		    if (((Class438) this).anIntArrayArray4886[i_70_] != null)
			i_74_ = (((Class438) this).anIntArrayArray4886[i_70_]
				 [i_73_]);
		    else
			i_74_ = i_73_;
		    ((Class438) this).anIntArrayArray4874[i_70_][i_74_]
			= class528_sub42.readInt(820147229);
		}
		((Class438) this).aClass253Array4888[i_70_]
		    = new Class253(((Class438) this).anIntArrayArray4874
				   [i_70_]);
	    }
	}
    }
    
    static final void method5299(Class648 class648, byte i) {
	int i_75_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (Class700.aBool8733) {
	    Class683[] class683s = Class657.method7850(1239022665);
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1425052405 * class683s[i_75_].anInt8604;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= class683s[i_75_].anInt8605 * -968107603;
	} else {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	}
    }
    
    static void method5300(int i, String string, byte i_76_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(2, (long) i);
	class528_sub21_sub7.method10496(1774747419);
	((ClientPacket) class528_sub21_sub7).aString11546 = string;
    }
}
