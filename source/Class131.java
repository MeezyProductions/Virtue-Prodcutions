/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131
{
    Class173_Sub2 aClass173_Sub2_1596;
    static final int anInt1597 = 128;
    int anInt1598;
    Class155 aClass155_1599;
    int anInt1600;
    int anInt1601;
    boolean aBool1602 = true;
    int anInt1603;
    static final int anInt1604 = 7;
    Interface16 anInterface16_1605;
    Class120_Sub4 aClass120_Sub4_1606;
    Class126_Sub1 aClass126_Sub1_1607;
    
    void method1625() {
	method1628(((Class131) this).anInterface16_1605,
		   ((Class131) this).anInt1603);
    }
    
    void method1626() {
	method1628(((Class131) this).anInterface16_1605,
		   ((Class131) this).anInt1603);
    }
    
    void method1627(byte[] is, int i) {
	((Class131) this).aClass126_Sub1_1607.method85(5123, is, i * 2);
	method1628(((Class131) this).aClass126_Sub1_1607, i);
    }
    
    void method1628(Interface16 interface16, int i) {
	if (i != 0) {
	    method1631();
	    ((Class131) this).aClass173_Sub2_1596
		.method8775(((Class131) this).aClass120_Sub4_1606);
	    ((Class131) this).aClass173_Sub2_1596.method8769(interface16, 4, 0,
							     i);
	}
    }
    
    void method1629() {
	method1628(((Class131) this).anInterface16_1605,
		   ((Class131) this).anInt1603);
    }
    
    void method1630() {
	method1628(((Class131) this).anInterface16_1605,
		   ((Class131) this).anInt1603);
    }
    
    void method1631() {
	if (((Class131) this).aBool1602) {
	    ((Class131) this).aBool1602 = false;
	    byte[] is
		= ((Class155) ((Class131) this).aClass155_1599).aByteArray1727;
	    byte[] is_0_
		= (((Class173_Sub2) ((Class131) this).aClass173_Sub2_1596)
		   .aByteArray9601);
	    int i = 0;
	    int i_1_ = ((Class155) ((Class131) this).aClass155_1599).anInt1729;
	    int i_2_ = (((Class131) this).anInt1600
			+ (((Class131) this).anInt1601
			   * (((Class155) ((Class131) this).aClass155_1599)
			      .anInt1729)));
	    for (int i_3_ = -128; i_3_ < 0; i_3_++) {
		i = (i << 8) - i;
		for (int i_4_ = -128; i_4_ < 0; i_4_++) {
		    if (is[i_2_++] != 0)
			i++;
		}
		i_2_ += i_1_ - 128;
	    }
	    if (((Class131) this).aClass120_Sub4_1606 != null
		&& ((Class131) this).anInt1598 == i)
		((Class131) this).aBool1602 = false;
	    else {
		((Class131) this).anInt1598 = i;
		int i_5_ = 0;
		i_2_ = (((Class131) this).anInt1600
			+ ((Class131) this).anInt1601 * i_1_);
		for (int i_6_ = -128; i_6_ < 0; i_6_++) {
		    for (int i_7_ = -128; i_7_ < 0; i_7_++) {
			if (is[i_2_] != 0)
			    is_0_[i_5_++] = (byte) 68;
			else {
			    int i_8_ = 0;
			    if (is[i_2_ - 1] != 0)
				i_8_++;
			    if (is[i_2_ + 1] != 0)
				i_8_++;
			    if (is[i_2_ - i_1_] != 0)
				i_8_++;
			    if (is[i_2_ + i_1_] != 0)
				i_8_++;
			    is_0_[i_5_++] = (byte) (17 * i_8_);
			}
			i_2_++;
		    }
		    i_2_ += (((Class155) ((Class131) this).aClass155_1599)
			     .anInt1729) - 128;
		}
		if (((Class131) this).aClass120_Sub4_1606 == null) {
		    ((Class131) this).aClass120_Sub4_1606
			= new Class120_Sub4((((Class131) this)
					     .aClass173_Sub2_1596),
					    3553, Class149.aClass149_1677,
					    Class169.aClass169_1935, 128, 128,
					    false,
					    (((Class173_Sub2)
					      (((Class131) this)
					       .aClass173_Sub2_1596))
					     .aByteArray9601),
					    Class149.aClass149_1677, false);
		    ((Class131) this).aClass120_Sub4_1606.method8259(false,
								     false);
		    ((Class131) this).aClass120_Sub4_1606.method1545(true);
		} else
		    ((Class131) this).aClass120_Sub4_1606.method8258
			(0, 0, 128, 128,
			 (((Class173_Sub2)
			   ((Class131) this).aClass173_Sub2_1596)
			  .aByteArray9601),
			 Class149.aClass149_1677, 0, 0, false);
	    }
	}
    }
    
    Class131(Class173_Sub2 class173_sub2, Class155 class155,
	     Class137_Sub3 class137_sub3, int i, int i_9_, int i_10_,
	     int i_11_, int i_12_) {
	((Class131) this).anInt1598 = -1;
	((Class131) this).aClass173_Sub2_1596 = class173_sub2;
	((Class131) this).aClass155_1599 = class155;
	((Class131) this).anInt1600 = i_11_;
	((Class131) this).anInt1601 = i_12_;
	int i_13_ = 1 << i_10_;
	int i_14_ = 0;
	int i_15_ = i << i_10_;
	int i_16_ = i_9_ << i_10_;
	for (int i_17_ = 0; i_17_ < i_13_; i_17_++) {
	    int i_18_
		= ((i_16_ + i_17_) * (class137_sub3.anInt1627 * -657933437)
		   + i_15_);
	    for (int i_19_ = 0; i_19_ < i_13_; i_19_++) {
		short[] is = (((Class137_Sub3) class137_sub3)
			      .aShortArrayArray9006[i_18_++]);
		if (is != null)
		    i_14_ += is.length;
	    }
	}
	((Class131) this).anInt1603 = i_14_;
	if (i_14_ > 0) {
	    ByteBuffer class528_sub42 = new ByteBuffer(i_14_ * 2);
	    if (((Class173_Sub2) ((Class131) this).aClass173_Sub2_1596)
		.aBool9561) {
		for (int i_20_ = 0; i_20_ < i_13_; i_20_++) {
		    int i_21_ = ((i_16_ + i_20_) * (class137_sub3.anInt1627
						    * -657933437)
				 + i_15_);
		    for (int i_22_ = 0; i_22_ < i_13_; i_22_++) {
			short[] is = (((Class137_Sub3) class137_sub3)
				      .aShortArrayArray9006[i_21_++]);
			if (is != null) {
			    for (int i_23_ = 0; i_23_ < is.length; i_23_++)
				class528_sub42.method9717(is[i_23_] & 0xffff,
							  (byte) 44);
			}
		    }
		}
	    } else {
		for (int i_24_ = 0; i_24_ < i_13_; i_24_++) {
		    int i_25_ = ((i_16_ + i_24_) * (class137_sub3.anInt1627
						    * -657933437)
				 + i_15_);
		    for (int i_26_ = 0; i_26_ < i_13_; i_26_++) {
			short[] is = (((Class137_Sub3) class137_sub3)
				      .aShortArrayArray9006[i_25_++]);
			if (is != null) {
			    for (int i_27_ = 0; i_27_ < is.length; i_27_++)
				class528_sub42.writeLEShort(is[i_27_] & 0xffff,
							  -1102718643);
			}
		    }
		}
	    }
	    ((Class131) this).anInterface16_1605
		= (((Class131) this).aClass173_Sub2_1596.method8815
		   (5123, class528_sub42.payload,
		    class528_sub42.pointer * -185904669, false));
	    ((Class131) this).aClass126_Sub1_1607
		= new Class126_Sub1(((Class131) this).aClass173_Sub2_1596,
				    5123, null, 1);
	} else
	    ((Class131) this).aClass120_Sub4_1606 = null;
    }
}
