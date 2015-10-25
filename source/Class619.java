/* Class619 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class619 implements Iterator
{
    int anInt8047;
    Class95_Sub1_Sub1 this$0;
    
    public Object method7380() {
	int i = (((Class619) this).anInt8047 += 1816114815) * 939919743 - 1;
	Class142_Sub2 class142_sub2
	    = (Class142_Sub2) ((Class95_Sub1_Sub1) ((Class619) this).this$0)
				  .aClass186_11197.method2727((long) i);
	if (class142_sub2 != null)
	    return class142_sub2;
	return ((Class619) this).this$0.method10279(i, 1313634500);
    }
    
    public boolean hasNext() {
	return (939919743 * ((Class619) this).anInt8047
		< ((Class619) this).this$0.method62((short) 3553));
    }
    
    public Object next() {
	int i = (((Class619) this).anInt8047 += 1816114815) * 939919743 - 1;
	Class142_Sub2 class142_sub2
	    = (Class142_Sub2) ((Class95_Sub1_Sub1) ((Class619) this).this$0)
				  .aClass186_11197.method2727((long) i);
	if (class142_sub2 != null)
	    return class142_sub2;
	return ((Class619) this).this$0.method10279(i, -293363446);
    }
    
    public boolean method7381() {
	return (939919743 * ((Class619) this).anInt8047
		< ((Class619) this).this$0.method62((short) 3553));
    }
    
    Class619(Class95_Sub1_Sub1 class95_sub1_sub1) {
	((Class619) this).this$0 = class95_sub1_sub1;
    }
    
    public void method7382() {
	throw new UnsupportedOperationException();
    }
    
    public void method7383() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method7384() {
	return (939919743 * ((Class619) this).anInt8047
		< ((Class619) this).this$0.method62((short) 3553));
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    static final void method7385(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2515
	    = Class181_Sub23.method8999(string, class648, (byte) -7);
	class229.aBool2483 = true;
    }
    
    static final void method7386(Class229 class229, Class648 class648,
				 byte i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	int i_1_
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       - 1);
	if (292816267 * class229.anInt2418 != 6)
	    throw new RuntimeException("");
	Class299 class299
	    = ((Class299)
	       Class21.aClass5_Sub8_214
		   .method63(class229.anInt2419 * -1386163263, -604650048));
	if (class229.aClass287_2479 == null)
	    class229.aClass287_2479 = new Class287(class299, true);
	class229.aClass287_2479.aLong3154
	    = Class598.method7130(-253091288) * 6725947522742831901L;
	if (i_1_ < 0 || i_1_ >= class299.anIntArray3271.length)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i_1_).toString());
	class229.aClass287_2479.anIntArray3159[i_1_] = i_0_;
	Class39.method811(class229, 1435904523);
    }
    
    public static void method7387(int i) {
	if (2027542149 * Class12.aClass16_178.anInt192 != -1)
	    Class168.method2100(2027542149 * Class12.aClass16_178.anInt192,
				Class12.aClass16_178.aString194,
				Class12.aClass16_178.anInt193 * -1255012695,
				1401645101 * Class12.aClass16_178.anInt191,
				-1170015258);
    }
    
    static final void decodeMasks
	(BitBuffer class528_sub42_sub2, int i,
	 Player class645_sub1_sub5_sub1_sub2, int i_2_,
	 int i_3_) {
	if ((i_2_ & 0x10) != 0) {
	    int i_4_ = class528_sub42_sub2.readUnsignedShort((short) 16845);
	    if (i_4_ == 65535)
		i_4_ = -1;
	    class645_sub1_sub5_sub1_sub2.anInt11780 = 1577001447 * i_4_;
	}
	if (0 != (i_2_ & 0x80000)) {
	    int i_5_ = class528_sub42_sub2.readUnsignedShort((short) 28456);
	    int i_6_ = class528_sub42_sub2.readInt(-496564712);
	    if (i_5_ == 65535)
		i_5_ = -1;
	    int i_7_ = class528_sub42_sub2.readUnsignedS(-1618677217);
	    int i_8_ = i_7_ & 0x7;
	    int i_9_ = i_7_ >> 3 & 0xf;
	    if (i_9_ == 15)
		i_9_ = -1;
	    boolean bool = 1 == (i_7_ >> 7 & 0x1);
	    class645_sub1_sub5_sub1_sub2.method10667(i_5_, i_6_, i_8_, i_9_,
						     bool, 3, (byte) 31);
	}
	if ((i_2_ & 0x1) != 0) {
	    class645_sub1_sub5_sub1_sub2.anInt11766
		= class528_sub42_sub2.method9657((byte) 96) * -888913659;
	    class645_sub1_sub5_sub1_sub2.anInt11765
		= class528_sub42_sub2.method9627(-2092397390) * -960732905;
	    class645_sub1_sub5_sub1_sub2.anInt11787
		= class528_sub42_sub2.method9657((byte) 13) * 979283275;
	    class645_sub1_sub5_sub1_sub2.anInt11789
		= class528_sub42_sub2.method9657((byte) 48) * 1152853501;
	    class645_sub1_sub5_sub1_sub2.anInt11790
		= class528_sub42_sub2.method9657((byte) 108) * 691421421;
	    class645_sub1_sub5_sub1_sub2.anInt11791
		= class528_sub42_sub2.method9657((byte) 10) * 842261403;
	    class645_sub1_sub5_sub1_sub2.anInt11792
		= (class528_sub42_sub2.readLEShortA(1934476295)
		   + client.anInt11127) * 377645301;
	    class645_sub1_sub5_sub1_sub2.anInt11793
		= (class528_sub42_sub2.readLEShortA(1342735337)
		   + client.anInt11127) * -808789795;
	    class645_sub1_sub5_sub1_sub2.anInt11794
		= class528_sub42_sub2.readUnsignedShort((short) 12646) * -818794613;
	    class645_sub1_sub5_sub1_sub2.quenedStepCount = -670034095;
	    class645_sub1_sub5_sub1_sub2.anInt11818 = 0;
	    class645_sub1_sub5_sub1_sub2.anInt11766
		+= (class645_sub1_sub5_sub1_sub2.sceneXQueue[0]
		    * -888913659);
	    class645_sub1_sub5_sub1_sub2.anInt11765
		+= (class645_sub1_sub5_sub1_sub2.sceneYQueue[0]
		    * -960732905);
	    class645_sub1_sub5_sub1_sub2.anInt11787
		+= 979283275 * class645_sub1_sub5_sub1_sub2.sceneXQueue[0];
	    class645_sub1_sub5_sub1_sub2.anInt11789
		+= (1152853501
		    * class645_sub1_sub5_sub1_sub2.sceneYQueue[0]);
	    class645_sub1_sub5_sub1_sub2.anInt11790
		+= 691421421 * class645_sub1_sub5_sub1_sub2.aByte10675;
	    class645_sub1_sub5_sub1_sub2.anInt11791
		+= 842261403 * class645_sub1_sub5_sub1_sub2.aByte10675;
	}
	if (0 != (i_2_ & 0x100000)) {
	    int i_10_ = class528_sub42_sub2.readUnsignedS(-1660915337);
	    int[] is = new int[i_10_];
	    int[] is_11_ = new int[i_10_];
	    for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
		int i_13_ = class528_sub42_sub2.readUnsignedShort((short) 31462);
		if ((i_13_ & 0xc000) == 49152) {
		    int i_14_ = class528_sub42_sub2.readShortA((byte) -126);
		    is[i_12_] = i_13_ << 16 | i_14_;
		} else
		    is[i_12_] = i_13_;
		is_11_[i_12_] = class528_sub42_sub2.readShortA((byte) -127);
	    }
	    class645_sub1_sub5_sub1_sub2.method10665(is, is_11_, -1036989251);
	}
	if (0 != (i_2_ & 0x400)) {
	    int i_15_ = class528_sub42_sub2.readShortA((byte) -114);
	    int i_16_ = class528_sub42_sub2.readInt(-1556037715);
	    if (65535 == i_15_)
		i_15_ = -1;
	    int i_17_ = class528_sub42_sub2.readUnsignedS(610280122);
	    int i_18_ = i_17_ & 0x7;
	    int i_19_ = i_17_ >> 3 & 0xf;
	    if (15 == i_19_)
		i_19_ = -1;
	    boolean bool = (i_17_ >> 7 & 0x1) == 1;
	    class645_sub1_sub5_sub1_sub2
		.method10667(i_15_, i_16_, i_18_, i_19_, bool, 1, (byte) 81);
	}
	if ((i_2_ & 0x100) != 0) {
	    class645_sub1_sub5_sub1_sub2.aClass213_12066
		= ((Class213)
		   Class443.method5321(Class213.method2967(-1428872643),
				       class528_sub42_sub2
					   .method9614(-1220398584),
				       1524159637));
	    if (null == class645_sub1_sub5_sub1_sub2.aClass213_12066)
		class645_sub1_sub5_sub1_sub2.aClass213_12066
		    = Class213.aClass213_2250;
	}
	if ((i_2_ & 0x8) != 0) {
	    int[] is = new int[4];
	    for (int i_20_ = 0; i_20_ < 4; i_20_++)
		is[i_20_] = class528_sub42_sub2.method9645((short) 20174);
	    int i_21_ = class528_sub42_sub2.readUnsignedByte((byte) 68);
	    Class528_Sub29.method9490(class645_sub1_sub5_sub1_sub2, is, i_21_,
				      false, 89178858);
	}
	if ((i_2_ & 0x200000) != 0) {
	    int i_22_ = class528_sub42_sub2.readUnsignedShort(28083176);
	    int i_23_ = class528_sub42_sub2.readLEInt((short) 16385);
	    if (65535 == i_22_)
		i_22_ = -1;
	    int i_24_ = class528_sub42_sub2.readUnsignedByte((byte) 6);
	    int i_25_ = i_24_ & 0x7;
	    int i_26_ = i_24_ >> 3 & 0xf;
	    if (i_26_ == 15)
		i_26_ = -1;
	    boolean bool = (i_24_ >> 7 & 0x1) == 1;
	    class645_sub1_sub5_sub1_sub2
		.method10667(i_22_, i_23_, i_25_, i_26_, bool, 4, (byte) 34);
	}
	if (0 != (i_2_ & 0x4)) {
	    class645_sub1_sub5_sub1_sub2.facingDirection
		= class528_sub42_sub2.readUnsignedShort((short) 26530) * 2102619979;
	    if (540774833 * class645_sub1_sub5_sub1_sub2.quenedStepCount == 0) {
		class645_sub1_sub5_sub1_sub2.method10691
		    (class645_sub1_sub5_sub1_sub2.facingDirection * 1063002723,
		     (byte) -114);
		class645_sub1_sub5_sub1_sub2.facingDirection = -2102619979;
	    }
	}
	if (0 != (i_2_ & 0x400000)) {
	    String string = class528_sub42_sub2.readString(44795320);
	    int i_27_ = class528_sub42_sub2.readUnsignedS(-410666515);
	    if (0 != (i_27_ & 0x1))
		ModeWhere.method7898(2, i_27_,
				    class645_sub1_sub5_sub1_sub2
					.method10929(true, (short) -21736),
				    class645_sub1_sub5_sub1_sub2
					.method10921(false, (byte) -76),
				    class645_sub1_sub5_sub1_sub2.displayFiltered,
				    string, null, -567461628);
	    class645_sub1_sub5_sub1_sub2.method10925(string, 0, 0, (byte) 0);
	}
	if (0 != (i_2_ & 0x2)) {
	    int i_28_ = class528_sub42_sub2.readShortA((byte) -86);
	    int i_29_ = class528_sub42_sub2.method9675(2034680572);
	    if (65535 == i_28_)
		i_28_ = -1;
	    int i_30_ = class528_sub42_sub2.readUnsignedByte((byte) 6);
	    int i_31_ = i_30_ & 0x7;
	    int i_32_ = i_30_ >> 3 & 0xf;
	    if (i_32_ == 15)
		i_32_ = -1;
	    boolean bool = 1 == (i_30_ >> 7 & 0x1);
	    class645_sub1_sub5_sub1_sub2
		.method10667(i_28_, i_29_, i_31_, i_32_, bool, 0, (byte) -5);
	}
	if ((i_2_ & 0x20) != 0) {
	    int i_33_ = class528_sub42_sub2.readUnsignedS(1144004955);
	    if (i_33_ > 0) {
		for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
		    int i_35_ = -1;
		    int i_36_ = -1;
		    int i_37_ = -1;
		    int i_38_ = class528_sub42_sub2.method9719(65280);
		    if (32767 == i_38_) {
			i_38_ = class528_sub42_sub2.method9719(65280);
			i_36_ = class528_sub42_sub2.method9719(65280);
			i_35_ = class528_sub42_sub2.method9719(65280);
			i_37_ = class528_sub42_sub2.method9719(65280);
		    } else if (32766 != i_38_)
			i_36_ = class528_sub42_sub2.method9719(65280);
		    else {
			i_38_ = -1;
			i_36_ = class528_sub42_sub2.readUnsignedByte((byte) 40);
		    }
		    int i_39_ = class528_sub42_sub2.method9719(65280);
		    class645_sub1_sub5_sub1_sub2.method10683(i_38_, i_36_,
							     i_35_, i_37_,
							     client.anInt11127,
							     i_39_,
							     (short) -32239);
		}
	    }
	    int i_40_ = class528_sub42_sub2.method9614(-1220398584);
	    if (i_40_ > 0) {
		for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
		    int i_42_ = class528_sub42_sub2.method9719(65280);
		    int i_43_ = class528_sub42_sub2.method9719(65280);
		    if (i_43_ != 32767) {
			int i_44_ = class528_sub42_sub2.method9719(65280);
			int i_45_ = class528_sub42_sub2.readUnsignedA((byte) -16);
			int i_46_
			    = (i_43_ > 0
			       ? class528_sub42_sub2.readUnsignedA((byte) -127)
			       : i_45_);
			class645_sub1_sub5_sub1_sub2.method10669(i_42_,
								 (client
								  .anInt11127),
								 i_43_, i_44_,
								 i_45_, i_46_,
								 -1536276229);
		    } else
			class645_sub1_sub5_sub1_sub2.method10670(i_42_,
								 -1377100613);
		}
	    }
	}
	if ((i_2_ & 0x8000) != 0) {
	    int i_47_ = class528_sub42_sub2.method9614(-1220398584);
	    int[] is = new int[i_47_];
	    int[] is_48_ = new int[i_47_];
	    int[] is_49_ = new int[i_47_];
	    for (int i_50_ = 0; i_50_ < i_47_; i_50_++) {
		is[i_50_] = class528_sub42_sub2.method9645((short) 17329);
		is_48_[i_50_] = class528_sub42_sub2.readUnsignedA((byte) -126);
		is_49_[i_50_] = class528_sub42_sub2.readShortA((byte) -60);
	    }
	    Class498.method6068(class645_sub1_sub5_sub1_sub2, is, is_48_,
				is_49_, -2010573714);
	}
	if (0 != (i_2_ & 0x20000)) {
	    class645_sub1_sub5_sub1_sub2.anInterface2_11798.method27((byte) 2);
	    class528_sub42_sub2.pointer += -264964202;
	    int i_51_ = ((class528_sub42_sub2.payload
			  [((class528_sub42_sub2.pointer += 2015001547)
			    * -185904669) - 1])
			 & 0xff);
	    for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
		int i_53_ = class528_sub42_sub2.readUnsignedByte((byte) 98);
		Class483 class483
		    = ((Class483)
		       Class443.method5321(Class483.method5867((byte) 1),
					   i_53_, 1984237361));
		Class411 class411
		    = Class691_Sub20.aClass95_Sub1_Sub2_10751
			  .method8256(class528_sub42_sub2, class483, 52956843);
		class645_sub1_sub5_sub1_sub2.anInterface2_11798.method15
		    (class411.anInt4711 * 1862601893, class411.anObject4712,
		     -641493478);
	    }
	}
	if ((i_2_ & 0x1000) != 0) {
	    int i_54_ = class528_sub42_sub2.readLEShortA(1767118692);
	    int i_55_ = class528_sub42_sub2.method9675(2146153246);
	    if (i_54_ == 65535)
		i_54_ = -1;
	    int i_56_ = class528_sub42_sub2.readUnsignedS(-2046945017);
	    int i_57_ = i_56_ & 0x7;
	    int i_58_ = i_56_ >> 3 & 0xf;
	    if (i_58_ == 15)
		i_58_ = -1;
	    boolean bool = (i_56_ >> 7 & 0x1) == 1;
	    class645_sub1_sub5_sub1_sub2
		.method10667(i_54_, i_55_, i_57_, i_58_, bool, 2, (byte) 91);
	}
	if (0 != (i_2_ & 0x800)) {
	    String string = class528_sub42_sub2.readString(1131058028);
	    if (class645_sub1_sub5_sub1_sub2
		== Class108.myPlayer)
		ModeWhere.method7898(2, 0,
				    class645_sub1_sub5_sub1_sub2
					.method10929(true, (short) -20823),
				    class645_sub1_sub5_sub1_sub2
					.method10921(false, (byte) 11),
				    class645_sub1_sub5_sub1_sub2.displayFiltered,
				    string, null, -1331480424);
	    class645_sub1_sub5_sub1_sub2.method10925(string, 0, 0, (byte) 0);
	}
	if ((i_2_ & 0x10000) != 0)
	    class645_sub1_sub5_sub1_sub2.inClan
		= class528_sub42_sub2.readUnsignedS(841760583) == 1;
	if (0 != (i_2_ & 0x800000)) {
	    class645_sub1_sub5_sub1_sub2.aByte11797
		= class528_sub42_sub2.method9657((byte) 54);
	    class645_sub1_sub5_sub1_sub2.aByte11815
		= class528_sub42_sub2.readSignedS(-1459942163);
	    class645_sub1_sub5_sub1_sub2.aByte11799
		= class528_sub42_sub2.readSignedC(-545488484);
	    class645_sub1_sub5_sub1_sub2.aByte11788
		= (byte) class528_sub42_sub2.readUnsignedByte((byte) 98);
	    class645_sub1_sub5_sub1_sub2.anInt11756
		= (client.anInt11127
		   + class528_sub42_sub2.readShortA((byte) -2)) * 661225281;
	    class645_sub1_sub5_sub1_sub2.anInt11796
		= (client.anInt11127
		   + class528_sub42_sub2.readUnsignedShort(-2092155880)) * 1584973623;
	}
	if (0 != (i_2_ & 0x200)) {
	    int i_59_ = class528_sub42_sub2.method9614(-1220398584);
	    byte[] is = new byte[i_59_];
	    ByteBuffer class528_sub42 = new ByteBuffer(is);
	    class528_sub42_sub2.method9677(is, 0, i_59_, (byte) 28);
	    GPI.cachedHeadIcons[i] = class528_sub42;
	    class645_sub1_sub5_sub1_sub2.decodeHeadIcons(class528_sub42,
						     (byte) -110);
	}
	if (0 != (i_2_ & 0x40000)) {
	    class528_sub42_sub2.pointer += -264964202;
	    int i_60_ = ((class528_sub42_sub2.payload
			  [((class528_sub42_sub2.pointer += 2015001547)
			    * -185904669) - 1])
			 & 0xff);
	    for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
		int i_62_ = class528_sub42_sub2.method9614(-1220398584);
		Class483 class483
		    = ((Class483)
		       Class443.method5321(Class483.method5867((byte) 1),
					   i_62_, 1716348837));
		Class411 class411
		    = (Class691_Sub20.aClass95_Sub1_Sub2_10751.method8256
		       (class528_sub42_sub2, class483, 150742962));
		class645_sub1_sub5_sub1_sub2.anInterface2_11798.method15
		    (1862601893 * class411.anInt4711, class411.anObject4712,
		     -971060733);
	    }
	}
	if (0 != (i_2_ & 0x80)) {
	    int i_63_ = class528_sub42_sub2.readUnsignedA((byte) -123);
	    byte[] is = new byte[i_63_];
	    ByteBuffer class528_sub42 = new ByteBuffer(is);
	    class528_sub42_sub2.method9667(is, 0, i_63_, 402181733);
	    GPI.cachedAppearances[i] = class528_sub42;
	    class645_sub1_sub5_sub1_sub2.decodeCharacterData(class528_sub42,
						     -28209778);
	}
    }
}
