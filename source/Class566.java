/* Class566 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class566 implements Interface63
{
    int anInt7546;
    String aString7547;
    String aString7548;
    Class67 aClass67_7549;
    
    Class566(Class67 class67, String string, int i, Throwable throwable) {
	((Class566) this).aClass67_7549 = class67;
	((Class566) this).aString7547 = string;
	((Class566) this).anInt7546 = -2061182107 * i;
	((Class566) this).aString7548
	    = null != throwable ? throwable.getMessage() : null;
    }
    
    public void method309(int i) {
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4541,
				  client.aClass109_10930.aClass10_1379,
				  -2137068688);
	int i_0_ = ((class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		     += 2015001547)
		    * -185904669);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeByte(((Class566) this).aClass67_7549.method68(), (byte) 34);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeString(((Class566) this).aString7547, -1936289654);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .method9717(814341741 * ((Class566) this).anInt7546, (byte) -68);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeString(Class493.aString5526, -1936289654);
	if (((Class566) this).aString7548 != null) {
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(1, (byte) 42);
	    String string = ((Class566) this).aString7548;
	    if (string.length() > 100)
		string = string.substring(0, 100);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
								 -1936289654);
	} else
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(0,
								 (byte) -62);
	class528_sub34.aClass528_Sub42_Sub2_10481.method9662
	    ((class528_sub34.aClass528_Sub42_Sub2_10481.pointer * -185904669
	      - i_0_),
	     (byte) 44);
	client.aClass109_10930.method1380(class528_sub34, 1058447984);
    }
    
    public void method263() {
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4541,
				  client.aClass109_10930.aClass10_1379,
				  -1932937984);
	int i = ((class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		  += 2015001547)
		 * -185904669);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(((Class566) this)
								 .aClass67_7549
								 .method68(),
							     (byte) -43);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeString(((Class566) this).aString7547, -1936289654);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .method9717(814341741 * ((Class566) this).anInt7546, (byte) -18);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeString(Class493.aString5526, -1936289654);
	if (((Class566) this).aString7548 != null) {
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(1,
								 (byte) -25);
	    String string = ((Class566) this).aString7548;
	    if (string.length() > 100)
		string = string.substring(0, 100);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
								 -1936289654);
	} else
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(0, (byte) 18);
	class528_sub34.aClass528_Sub42_Sub2_10481.method9662
	    ((class528_sub34.aClass528_Sub42_Sub2_10481.pointer * -185904669
	      - i),
	     (byte) 101);
	client.aClass109_10930.method1380(class528_sub34, 466581935);
    }
    
    static void method6833(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class548.method6676(1860279482);
    }
    
    static final void method6834(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [2 + ((Class648) class648).anInt8395 * 717927929]);
	Class266 class266 = Class166.method2098(i_1_, -2012620273);
	float f = (float) i_2_;
	if (class266 == Class266.aClass266_2874
	    || Class266.aClass266_2875 == class266
	    || Class266.aClass266_2876 == class266)
	    f = Class417.method4970(i_2_);
	Class528_Sub21_Sub8_Sub1 class528_sub21_sub8_sub1
	    = new Class528_Sub21_Sub8_Sub1(Class495.aClass283_Sub1_5578
					       .method9022((byte) 77),
					   class266, f,
					   (float) i_3_ / 1000.0F);
	Class495.aClass283_Sub1_5578.method3781(class528_sub21_sub8_sub1,
						1348591420);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class528_sub21_sub8_sub1.anInt11574 * 811527563;
    }
    
    static final void method6835(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub32_10598,
	     (((Class648) class648).anIntArray8394
	      [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]),
	     1690074736);
	Class243.method3387(2138300996);
    }
}
