/* Class610_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;
import java.util.Queue;

public class Class610_Sub1 extends Class610
{
    Queue aQueue10663 = new LinkedList();
    
    void method9730(Class528_Sub33_Sub2 class528_sub33_sub2, int i) {
	((Class610_Sub1) this).aQueue10663.add(class528_sub33_sub2);
	if (((Class610_Sub1) this).aQueue10663.size() > 10)
	    ((Class610_Sub1) this).aQueue10663.poll();
    }
    
    int method7264() {
	return 1;
    }
    
    boolean method7257(int i) {
	return (!((Class610_Sub1) this).aQueue10663.isEmpty()
		|| (((Class610_Sub1) this).aLong7950 * -1961510344977715613L
		    < Class249.method3417(1901015948) - 2000L));
    }
    
    Class528_Sub34 method7250(int i) {
	return Class656.method7845(OutgoingOpcode.aClass403_4527,
				   client.aClass109_10930.aClass10_1379,
				   -2026604230);
    }
    
    void method9731(ByteBuffer class528_sub42,
		    Class528_Sub33_Sub2 class528_sub33_sub2, int i) {
	class528_sub42.writeByte(class528_sub33_sub2.method10607(-1515674384),
				  (byte) 49);
    }
    
    int method7247(byte i) {
	return 1;
    }
    
    void method7244(ByteBuffer class528_sub42,
		    Class528_Sub33 class528_sub33, int i) {
	method9731(class528_sub42, (Class528_Sub33_Sub2) class528_sub33,
		   -155510052);
    }
    
    void method7248(byte i) {
	Class528_Sub33_Sub2 class528_sub33_sub2
	    = (Class528_Sub33_Sub2) ((Class610_Sub1) this).aQueue10663.poll();
	if (class528_sub33_sub2 != null) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4535,
				      client.aClass109_10930.aClass10_1379,
				      -2036704196);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeMiddleInt
		((class528_sub33_sub2.method9494(-1236136691)
		  | class528_sub33_sub2.method9495((byte) 3) << 16),
		 (byte) 100);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717
		(method7246(class528_sub33_sub2, 65535, 1814120710),
		 (byte) 43);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByteC
		((class528_sub33_sub2.method10601((byte) 43) << 1
		  | class528_sub33_sub2.method10607(237018141) & 0x1),
		 2116817991);
	    client.aClass109_10930.method1380(class528_sub34, 2030944479);
	    class528_sub33_sub2.method9510((byte) -17);
	}
    }
    
    Class528_Sub34 method7256() {
	return Class656.method7845(OutgoingOpcode.aClass403_4527,
				   client.aClass109_10930.aClass10_1379,
				   -1867955514);
    }
    
    void method7251() {
	Class528_Sub33_Sub2 class528_sub33_sub2
	    = (Class528_Sub33_Sub2) ((Class610_Sub1) this).aQueue10663.poll();
	if (class528_sub33_sub2 != null) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4535,
				      client.aClass109_10930.aClass10_1379,
				      -2124867791);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeMiddleInt
		((class528_sub33_sub2.method9494(-1236136691)
		  | class528_sub33_sub2.method9495((byte) 3) << 16),
		 (byte) 111);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717
		(method7246(class528_sub33_sub2, 65535, -405602741),
		 (byte) -5);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByteC
		((class528_sub33_sub2.method10601((byte) 35) << 1
		  | class528_sub33_sub2.method10607(137944224) & 0x1),
		 2095819617);
	    client.aClass109_10930.method1380(class528_sub34, 437017333);
	    class528_sub33_sub2.method9510((byte) -93);
	}
    }
    
    void method7252() {
	Class528_Sub33_Sub2 class528_sub33_sub2
	    = (Class528_Sub33_Sub2) ((Class610_Sub1) this).aQueue10663.poll();
	if (class528_sub33_sub2 != null) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4535,
				      client.aClass109_10930.aClass10_1379,
				      -1916964514);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeMiddleInt
		((class528_sub33_sub2.method9494(-1236136691)
		  | class528_sub33_sub2.method9495((byte) 3) << 16),
		 (byte) 61);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717
		(method7246(class528_sub33_sub2, 65535, -203934703),
		 (byte) 11);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByteC
		((class528_sub33_sub2.method10601((byte) 127) << 1
		  | class528_sub33_sub2.method10607(-108229099) & 0x1),
		 2117575790);
	    client.aClass109_10930.method1380(class528_sub34, 2129078790);
	    class528_sub33_sub2.method9510((byte) -101);
	}
    }
    
    void method7253() {
	Class528_Sub33_Sub2 class528_sub33_sub2
	    = (Class528_Sub33_Sub2) ((Class610_Sub1) this).aQueue10663.poll();
	if (class528_sub33_sub2 != null) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4535,
				      client.aClass109_10930.aClass10_1379,
				      -2133306706);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeMiddleInt
		((class528_sub33_sub2.method9494(-1236136691)
		  | class528_sub33_sub2.method9495((byte) 3) << 16),
		 (byte) 46);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717
		(method7246(class528_sub33_sub2, 65535, 905969213),
		 (byte) -50);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByteC
		((class528_sub33_sub2.method10601((byte) 12) << 1
		  | class528_sub33_sub2.method10607(-189678011) & 0x1),
		 2113746799);
	    client.aClass109_10930.method1380(class528_sub34, 2011856664);
	    class528_sub33_sub2.method9510((byte) -93);
	}
    }
    
    void method7254() {
	Class528_Sub33_Sub2 class528_sub33_sub2
	    = (Class528_Sub33_Sub2) ((Class610_Sub1) this).aQueue10663.poll();
	if (class528_sub33_sub2 != null) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4535,
				      client.aClass109_10930.aClass10_1379,
				      -2125923720);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeMiddleInt
		((class528_sub33_sub2.method9494(-1236136691)
		  | class528_sub33_sub2.method9495((byte) 3) << 16),
		 (byte) 37);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717
		(method7246(class528_sub33_sub2, 65535, -879739892),
		 (byte) -80);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByteC
		((class528_sub33_sub2.method10601((byte) 90) << 1
		  | class528_sub33_sub2.method10607(313530476) & 0x1),
		 2098442940);
	    client.aClass109_10930.method1380(class528_sub34, 759238405);
	    class528_sub33_sub2.method9510((byte) -52);
	}
    }
    
    int method7258() {
	return 1;
    }
    
    boolean method7255() {
	return (!((Class610_Sub1) this).aQueue10663.isEmpty()
		|| (((Class610_Sub1) this).aLong7950 * -1961510344977715613L
		    < Class249.method3417(2028568297) - 2000L));
    }
    
    void method7259(ByteBuffer class528_sub42,
		    Class528_Sub33 class528_sub33) {
	method9731(class528_sub42, (Class528_Sub33_Sub2) class528_sub33,
		   867802855);
    }
    
    Class610_Sub1() {
	/* empty */
    }
    
    int method7243() {
	return 1;
    }
    
    void method7260(ByteBuffer class528_sub42,
		    Class528_Sub33 class528_sub33) {
	method9731(class528_sub42, (Class528_Sub33_Sub2) class528_sub33,
		   -1947849240);
    }
    
    void method7261(ByteBuffer class528_sub42,
		    Class528_Sub33 class528_sub33) {
	method9731(class528_sub42, (Class528_Sub33_Sub2) class528_sub33,
		   -699686208);
    }
    
    static void method9732(Class109 class109, Class229 class229, int i,
			   int i_0_, int i_1_, int i_2_) {
	if (i == 1) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4537,
				      class109.aClass10_1379, -2043833633);
	    Class505.method6150(class528_sub34, i_0_, i_1_,
				class229.anInt2528 * 1272672363, (byte) -2);
	    class109.method1380(class528_sub34, 610535686);
	}
	if (i == 2) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4543,
				      class109.aClass10_1379, -2024242737);
	    Class505.method6150(class528_sub34, i_0_, i_1_,
				1272672363 * class229.anInt2528, (byte) -77);
	    class109.method1380(class528_sub34, 1105124480);
	}
	if (3 == i) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4463,
				      class109.aClass10_1379, -1907941927);
	    Class505.method6150(class528_sub34, i_0_, i_1_,
				class229.anInt2528 * 1272672363, (byte) -48);
	    class109.method1380(class528_sub34, 1599856863);
	}
	if (4 == i) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4529,
				      class109.aClass10_1379, -2063487287);
	    Class505.method6150(class528_sub34, i_0_, i_1_,
				class229.anInt2528 * 1272672363, (byte) 29);
	    class109.method1380(class528_sub34, 196665365);
	}
	if (i == 5) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4458,
				      class109.aClass10_1379, -2140707770);
	    Class505.method6150(class528_sub34, i_0_, i_1_,
				class229.anInt2528 * 1272672363, (byte) -36);
	    class109.method1380(class528_sub34, 249712516);
	}
	if (6 == i) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4521,
				      class109.aClass10_1379, -2091754862);
	    Class505.method6150(class528_sub34, i_0_, i_1_,
				class229.anInt2528 * 1272672363, (byte) -35);
	    class109.method1380(class528_sub34, 922337111);
	}
	if (7 == i) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4531,
				      class109.aClass10_1379, -1968727889);
	    Class505.method6150(class528_sub34, i_0_, i_1_,
				class229.anInt2528 * 1272672363, (byte) -46);
	    class109.method1380(class528_sub34, 592156663);
	}
	if (i == 8) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4568,
				      class109.aClass10_1379, -2023888390);
	    Class505.method6150(class528_sub34, i_0_, i_1_,
				1272672363 * class229.anInt2528, (byte) 0);
	    class109.method1380(class528_sub34, 894020755);
	}
	if (9 == i) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4523,
				      class109.aClass10_1379, -1919392883);
	    Class505.method6150(class528_sub34, i_0_, i_1_,
				1272672363 * class229.anInt2528, (byte) 31);
	    class109.method1380(class528_sub34, 1194323313);
	}
	if (i == 10) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4557,
				      class109.aClass10_1379, -2082418263);
	    Class505.method6150(class528_sub34, i_0_, i_1_,
				class229.anInt2528 * 1272672363, (byte) 40);
	    class109.method1380(class528_sub34, 521937163);
	}
    }
    
    public static byte[][][] method9733(int i, byte i_3_) {
	byte[][][] is = new byte[8][4][];
	int i_4_ = i;
	int i_5_ = i;
	byte[] is_6_ = new byte[i_4_ * i_5_];
	int i_7_ = 0;
	for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
	    for (int i_9_ = 0; i_9_ < i_4_; i_9_++) {
		if (i_9_ <= i_8_)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[0][0] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_10_ = i_5_ - 1; i_10_ >= 0; i_10_--) {
	    for (int i_11_ = 0; i_11_ < i_5_; i_11_++) {
		if (i_11_ <= i_10_)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[0][1] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_12_ = 0; i_12_ < i_5_; i_12_++) {
	    for (int i_13_ = 0; i_13_ < i_4_; i_13_++) {
		if (i_13_ >= i_12_)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[0][2] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_14_ = i_5_ - 1; i_14_ >= 0; i_14_--) {
	    for (int i_15_ = 0; i_15_ < i_4_; i_15_++) {
		if (i_15_ >= i_14_)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[0][3] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_16_ = i_5_ - 1; i_16_ >= 0; i_16_--) {
	    for (int i_17_ = 0; i_17_ < i_4_; i_17_++) {
		if (i_17_ <= i_16_ >> 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[1][0] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_18_ = 0; i_18_ < i_5_; i_18_++) {
	    for (int i_19_ = 0; i_19_ < i_4_; i_19_++) {
		if (i_7_ < 0 || i_7_ >= is_6_.length)
		    i_7_++;
		else {
		    if (i_19_ >= i_18_ << 1)
			is_6_[i_7_] = (byte) -1;
		    i_7_++;
		}
	    }
	}
	is[1][1] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_20_ = 0; i_20_ < i_5_; i_20_++) {
	    for (int i_21_ = i_4_ - 1; i_21_ >= 0; i_21_--) {
		if (i_21_ <= i_20_ >> 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[1][2] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_22_ = i_5_ - 1; i_22_ >= 0; i_22_--) {
	    for (int i_23_ = i_4_ - 1; i_23_ >= 0; i_23_--) {
		if (i_23_ >= i_22_ << 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[1][3] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_24_ = i_5_ - 1; i_24_ >= 0; i_24_--) {
	    for (int i_25_ = i_4_ - 1; i_25_ >= 0; i_25_--) {
		if (i_25_ <= i_24_ >> 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[2][0] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_26_ = i_5_ - 1; i_26_ >= 0; i_26_--) {
	    for (int i_27_ = 0; i_27_ < i_4_; i_27_++) {
		if (i_27_ >= i_26_ << 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[2][1] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_28_ = 0; i_28_ < i_5_; i_28_++) {
	    for (int i_29_ = 0; i_29_ < i_4_; i_29_++) {
		if (i_29_ <= i_28_ >> 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[2][2] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_30_ = 0; i_30_ < i_5_; i_30_++) {
	    for (int i_31_ = i_4_ - 1; i_31_ >= 0; i_31_--) {
		if (i_31_ >= i_30_ << 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[2][3] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_32_ = i_5_ - 1; i_32_ >= 0; i_32_--) {
	    for (int i_33_ = 0; i_33_ < i_4_; i_33_++) {
		if (i_33_ >= i_32_ >> 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[3][0] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_34_ = 0; i_34_ < i_5_; i_34_++) {
	    for (int i_35_ = 0; i_35_ < i_4_; i_35_++) {
		if (i_35_ <= i_34_ << 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[3][1] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_36_ = 0; i_36_ < i_5_; i_36_++) {
	    for (int i_37_ = i_4_ - 1; i_37_ >= 0; i_37_--) {
		if (i_37_ >= i_36_ >> 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[3][2] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_38_ = i_5_ - 1; i_38_ >= 0; i_38_--) {
	    for (int i_39_ = i_4_ - 1; i_39_ >= 0; i_39_--) {
		if (i_39_ <= i_38_ << 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[3][3] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_40_ = i_5_ - 1; i_40_ >= 0; i_40_--) {
	    for (int i_41_ = i_4_ - 1; i_41_ >= 0; i_41_--) {
		if (i_41_ >= i_40_ >> 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[4][0] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_42_ = i_5_ - 1; i_42_ >= 0; i_42_--) {
	    for (int i_43_ = 0; i_43_ < i_4_; i_43_++) {
		if (i_43_ <= i_42_ << 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[4][1] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_44_ = 0; i_44_ < i_5_; i_44_++) {
	    for (int i_45_ = 0; i_45_ < i_4_; i_45_++) {
		if (i_45_ >= i_44_ >> 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[4][2] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_46_ = 0; i_46_ < i_5_; i_46_++) {
	    for (int i_47_ = i_4_ - 1; i_47_ >= 0; i_47_--) {
		if (i_47_ <= i_46_ << 1)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[4][3] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_48_ = 0; i_48_ < i_5_; i_48_++) {
	    for (int i_49_ = 0; i_49_ < i_4_; i_49_++) {
		if (i_49_ <= i_4_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[5][0] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_50_ = 0; i_50_ < i_5_; i_50_++) {
	    for (int i_51_ = 0; i_51_ < i_4_; i_51_++) {
		if (i_50_ <= i_5_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[5][1] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_52_ = 0; i_52_ < i_5_; i_52_++) {
	    for (int i_53_ = 0; i_53_ < i_4_; i_53_++) {
		if (i_53_ >= i_4_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[5][2] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_54_ = 0; i_54_ < i_5_; i_54_++) {
	    for (int i_55_ = 0; i_55_ < i_4_; i_55_++) {
		if (i_54_ >= i_5_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[5][3] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_56_ = 0; i_56_ < i_5_; i_56_++) {
	    for (int i_57_ = 0; i_57_ < i_4_; i_57_++) {
		if (i_57_ <= i_56_ - i_5_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[6][0] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_58_ = i_5_ - 1; i_58_ >= 0; i_58_--) {
	    for (int i_59_ = 0; i_59_ < i_4_; i_59_++) {
		if (i_59_ <= i_58_ - i_5_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[6][1] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_60_ = i_5_ - 1; i_60_ >= 0; i_60_--) {
	    for (int i_61_ = i_4_ - 1; i_61_ >= 0; i_61_--) {
		if (i_61_ <= i_60_ - i_5_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[6][2] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_62_ = 0; i_62_ < i_5_; i_62_++) {
	    for (int i_63_ = i_4_ - 1; i_63_ >= 0; i_63_--) {
		if (i_63_ <= i_62_ - i_5_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[6][3] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_64_ = 0; i_64_ < i_5_; i_64_++) {
	    for (int i_65_ = 0; i_65_ < i_4_; i_65_++) {
		if (i_65_ >= i_64_ - i_5_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[7][0] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_66_ = i_5_ - 1; i_66_ >= 0; i_66_--) {
	    for (int i_67_ = 0; i_67_ < i_4_; i_67_++) {
		if (i_67_ >= i_66_ - i_5_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[7][1] = is_6_;
	is_6_ = new byte[i_5_ * i_4_];
	i_7_ = 0;
	for (int i_68_ = i_5_ - 1; i_68_ >= 0; i_68_--) {
	    for (int i_69_ = i_4_ - 1; i_69_ >= 0; i_69_--) {
		if (i_69_ >= i_68_ - i_5_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[7][2] = is_6_;
	is_6_ = new byte[i_4_ * i_5_];
	i_7_ = 0;
	for (int i_70_ = 0; i_70_ < i_5_; i_70_++) {
	    for (int i_71_ = i_4_ - 1; i_71_ >= 0; i_71_--) {
		if (i_71_ >= i_70_ - i_5_ / 2)
		    is_6_[i_7_] = (byte) -1;
		i_7_++;
	    }
	}
	is[7][3] = is_6_;
	return is;
    }
    
    static final void method9734(Class648 class648, int i) {
	Class95.method1262(((Class648) class648).aClass645_Sub1_Sub2_Sub1_8409,
			   (((Class648) class648).anIntArray8394
			    [((((Class648) class648).anInt8395 -= 1239022665)
			      * 717927929)]),
			   true, 2137698312);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) client.aFloatArray10888[0];
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) client.aFloatArray10888[1];
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) client.aFloatArray10888[2];
    }
}
