/* Class529 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class529
{
    Class521[] aClass521Array7108;
    Class524 this$0;
    int anInt7109;
    int anInt7110;
    int anInt7111;
    static int anInt7112;
    
    void method6447(int i, int i_0_) {
	if (((Class529) this).aClass521Array7108 == null
	    || ((Class529) this).anInt7111 * -176075189 != i_0_
	    || i != ((Class529) this).anInt7109 * 1987472551) {
	    ((Class529) this).anInt7109 = i * -1097303273;
	    ((Class529) this).anInt7110 = ((1 << i) - 1) * -66411725;
	    ((Class529) this).anInt7111 = i_0_ * 1861520227;
	    int i_1_ = 1 << (((Class529) this).anInt7109 * 1987472551
			     + -176075189 * ((Class529) this).anInt7111);
	    ((Class529) this).aClass521Array7108 = new Class521[i_1_];
	    for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
		((Class529) this).aClass521Array7108[i_2_]
		    = new Class521(this);
	}
    }
    
    void method6448() {
	int i = 1 << (((Class529) this).anInt7109 * 1987472551
		      + -176075189 * ((Class529) this).anInt7111);
	for (int i_3_ = 0; i_3_ < i; i_3_++)
	    ((Class529) this).aClass521Array7108[i_3_].method6350((byte) 0);
    }
    
    Class529(Class524 class524) {
	((Class529) this).this$0 = class524;
    }
    
    void method6449(int i, int i_4_) {
	if (((Class529) this).aClass521Array7108 == null
	    || ((Class529) this).anInt7111 * -176075189 != i_4_
	    || i != ((Class529) this).anInt7109 * 1987472551) {
	    ((Class529) this).anInt7109 = i * -1097303273;
	    ((Class529) this).anInt7110 = ((1 << i) - 1) * -66411725;
	    ((Class529) this).anInt7111 = i_4_ * 1861520227;
	    int i_5_ = 1 << (((Class529) this).anInt7109 * 1987472551
			     + -176075189 * ((Class529) this).anInt7111);
	    ((Class529) this).aClass521Array7108 = new Class521[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		((Class529) this).aClass521Array7108[i_6_]
		    = new Class521(this);
	}
    }
    
    void method6450() {
	int i = 1 << (((Class529) this).anInt7109 * 1987472551
		      + -176075189 * ((Class529) this).anInt7111);
	for (int i_7_ = 0; i_7_ < i; i_7_++)
	    ((Class529) this).aClass521Array7108[i_7_].method6350((byte) 0);
    }
    
    void method6451(byte i) {
	int i_8_ = 1 << (((Class529) this).anInt7109 * 1987472551
			 + -176075189 * ((Class529) this).anInt7111);
	for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
	    ((Class529) this).aClass521Array7108[i_9_].method6350((byte) 0);
    }
    
    void method6452() {
	int i = 1 << (((Class529) this).anInt7109 * 1987472551
		      + -176075189 * ((Class529) this).anInt7111);
	for (int i_10_ = 0; i_10_ < i; i_10_++)
	    ((Class529) this).aClass521Array7108[i_10_].method6350((byte) 0);
    }
    
    Class521 method6453(int i, byte i_11_, int i_12_) {
	return (((Class529) this).aClass521Array7108
		[(((i & -705294341 * ((Class529) this).anInt7110)
		   << ((Class529) this).anInt7111 * -176075189)
		  + ((i_11_ & 0xff)
		     >>> 8 - -176075189 * ((Class529) this).anInt7111))]);
    }
    
    void method6454(int i, int i_13_, int i_14_) {
	if (((Class529) this).aClass521Array7108 == null
	    || ((Class529) this).anInt7111 * -176075189 != i_13_
	    || i != ((Class529) this).anInt7109 * 1987472551) {
	    ((Class529) this).anInt7109 = i * -1097303273;
	    ((Class529) this).anInt7110 = ((1 << i) - 1) * -66411725;
	    ((Class529) this).anInt7111 = i_13_ * 1861520227;
	    int i_15_ = 1 << (((Class529) this).anInt7109 * 1987472551
			      + -176075189 * ((Class529) this).anInt7111);
	    ((Class529) this).aClass521Array7108 = new Class521[i_15_];
	    for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
		((Class529) this).aClass521Array7108[i_16_]
		    = new Class521(this);
	}
    }
    
    static final void method6455(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	if ((((Class648) class648).anIntArray8394
	     [717927929 * ((Class648) class648).anInt8395 + 1])
	    == (((Class648) class648).anIntArray8394
		[((Class648) class648).anInt8395 * 717927929]))
	    ((Class648) class648).anInt8390
		+= (1888568287
		    * (((Class648) class648).anIntArray8414
		       [-630179809 * ((Class648) class648).anInt8390]));
    }
    
    static final void method6456(Class648 class648, boolean bool,
				 boolean bool_17_, byte i) {
	int i_18_ = (((Class648) class648).anIntArray8414
		     [((Class648) class648).anInt8390 * -630179809]);
	int i_19_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (i_19_ < 0 || i_19_ >= ((Class648) class648).anIntArray8402[i_18_])
	    throw new RuntimeException();
	if (!bool)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= ((Class648) class648).anIntArrayArray8393[i_18_][i_19_];
	else if (bool_17_) {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= ((Class648) class648).anIntArrayArray8393[i_18_][i_19_];
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= i_19_;
	} else {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= i_19_;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= ((Class648) class648).anIntArrayArray8393[i_18_][i_19_];
	}
    }
    
    static final void method6457(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_20_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_21_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 1]);
	if (null
	    != Class108.myPlayer.model)
	    Class108.myPlayer.model
		.method7273(i_20_, i_21_, -1352480433);
    }
    
    static final void method6458(Class648 class648, byte i) {
	int i_22_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	ItemType itemType
	    = (ItemType) Class18.aClass5_Sub13_206.method63(i_22_, -1029341432);
	int i_23_;
	if (itemType.aBool89)
	    i_23_ = -1951328255 * itemType.anInt101;
	else if (itemType.aBool53)
	    i_23_ = -426779025 * Class293.aClass597_3223.anInt7845;
	else
	    i_23_ = 1093515045 * Class293.aClass597_3223.anInt7852;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_23_;
    }
}
