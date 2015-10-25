/* Class232_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class232_Sub1 extends Class232
{
    public Definition method43(int i, Interface12 interface12) {
	return new Class239(i, interface12, this);
    }
    
    public Definition method42(int i, Interface12 interface12, int i_0_) {
	return new Class239(i, interface12, this);
    }
    
    public Class method45(short i) {
	return Class239.class;
    }
    
    Class232_Sub1(Class446 class446, int i) {
	super(class446, i);
    }
    
    public Class method44() {
	return Class239.class;
    }
    
    public Class method41() {
	return Class239.class;
    }
    
    public Class method46() {
	return Class239.class;
    }
    
    static void method8992(Class226 class226, int i, int i_1_, int i_2_,
			   boolean bool, Class648 class648, byte i_3_) {
	if (0 == i_1_)
	    throw new RuntimeException();
	Class229 class229 = class226.aClass229Array2336[i];
	if (null == class229.aClass229Array2542) {
	    class229.aClass229Array2542 = new Class229[i_2_ + 1];
	    class229.aClass229Array2390 = class229.aClass229Array2542;
	}
	if (class229.aClass229Array2542.length <= i_2_) {
	    if (class229.aClass229Array2542 == class229.aClass229Array2390) {
		Class229[] class229s = new Class229[1 + i_2_];
		for (int i_4_ = 0; i_4_ < class229.aClass229Array2542.length;
		     i_4_++)
		    class229s[i_4_] = class229.aClass229Array2542[i_4_];
		class229.aClass229Array2542 = class229.aClass229Array2390
		    = class229s;
	    } else {
		Class229[] class229s = new Class229[1 + i_2_];
		Class229[] class229s_5_ = new Class229[1 + i_2_];
		for (int i_6_ = 0; i_6_ < class229.aClass229Array2542.length;
		     i_6_++) {
		    class229s[i_6_] = class229.aClass229Array2542[i_6_];
		    class229s_5_[i_6_] = class229.aClass229Array2390[i_6_];
		}
		class229.aClass229Array2542 = class229s;
		class229.aClass229Array2390 = class229s_5_;
	    }
	}
	if (i_2_ > 0 && class229.aClass229Array2542[i_2_ - 1] == null)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i_2_ - 1).toString());
	Class229 class229_7_ = new Class229();
	class229_7_.anInt2378 = i_1_ * -1961301727;
	class229_7_.anInt2522
	    = (class229_7_.anInt2376 = class229.anInt2376 * 1) * -523188331;
	class229_7_.anInt2377 = i_2_ * -1585728337;
	class229.aClass229Array2542[i_2_] = class229_7_;
	if (class229.aClass229Array2390 != class229.aClass229Array2542)
	    class229.aClass229Array2390[i_2_] = class229_7_;
	Class646 class646;
	if (bool)
	    class646 = ((Class648) class648).aClass646_8406;
	else
	    class646 = ((Class648) class648).aClass646_8392;
	((Class646) class646).aClass226_8384 = class226;
	((Class646) class646).aClass229_8385 = class229_7_;
	Class39.method811(class229, 1435904523);
    }
    
    public static final void method8993(String string, int i) {
	int i_8_ = client.aBool10914 ? 400 : 200;
	if (null != string) {
	    if (-1314218023 * client.anInt11157 >= i_8_)
		Class640.method7592
		    (4,
		     (client.aBool10914
		      ? Class39.aClass39_378.method807((Class378_Sub2
							.aClass668_10123),
						       (byte) 102)
		      : Class39.aClass39_409.method807((Class378_Sub2
							.aClass668_10123),
						       (byte) 102)),
		     (byte) 26);
	    else {
		String string_9_
		    = Class487.method5889(string, Class688.aClass77_8657,
					  (byte) -127);
		if (null != string_9_) {
		    for (int i_10_ = 0;
			 i_10_ < client.anInt11157 * -1314218023; i_10_++) {
			Class62 class62 = client.aClass62Array11160[i_10_];
			String string_11_
			    = Class487.method5889(class62.aString720,
						  Class688.aClass77_8657,
						  (byte) -111);
			if (string_11_ != null
			    && string_11_.equals(string_9_)) {
			    Class640.method7592(4,
						new StringBuilder().append
						    (string).append
						    (Class39.aClass39_488
							 .method807
						     ((Class378_Sub2
						       .aClass668_10123),
						      (byte) 102))
						    .toString(),
						(byte) -22);
			    return;
			}
			if (class62.aString715 != null) {
			    String string_12_
				= Class487.method5889(class62.aString715,
						      Class688.aClass77_8657,
						      (byte) -53);
			    if (string_12_ != null
				&& string_12_.equals(string_9_)) {
				Class640.method7592(4,
						    new StringBuilder().append
							(string).append
							(Class39
							     .aClass39_488
							     .method807
							 ((Class378_Sub2
							   .aClass668_10123),
							  (byte) 102))
							.toString(),
						    (byte) -20);
				return;
			    }
			}
		    }
		    for (int i_13_ = 0;
			 i_13_ < -1924608781 * client.anInt11024; i_13_++) {
			Class33 class33 = client.aClass33Array11164[i_13_];
			String string_14_
			    = Class487.method5889(class33.aString311,
						  Class688.aClass77_8657,
						  (byte) -78);
			if (string_14_ != null
			    && string_14_.equals(string_9_)) {
			    Class640.method7592
				(4, new StringBuilder().append
					(Class39.aClass39_495.method807
					 (Class378_Sub2.aClass668_10123,
					  (byte) 102))
					.append
					(string).append
					(Class39.aClass39_496.method807
					 (Class378_Sub2.aClass668_10123,
					  (byte) 102))
					.toString(), (byte) -14);
			    return;
			}
			if (null != class33.aString313) {
			    String string_15_
				= Class487.method5889(class33.aString313,
						      Class688.aClass77_8657,
						      (byte) 3);
			    if (null != string_15_
				&& string_15_.equals(string_9_)) {
				Class640.method7592
				    (4, new StringBuilder().append
					    (Class39.aClass39_495.method807
					     (Class378_Sub2.aClass668_10123,
					      (byte) 102))
					    .append
					    (string).append
					    (Class39.aClass39_496.method807
					     (Class378_Sub2.aClass668_10123,
					      (byte) 102))
					    .toString(), (byte) 30);
				return;
			    }
			}
		    }
		    if (Class487.method5889
			    ((Class108.myPlayer
			      .displayUnfiltered),
			     Class688.aClass77_8657, (byte) -58)
			    .equals(string_9_))
			Class640.method7592(4, (Class39.aClass39_492.method807
						(Class378_Sub2.aClass668_10123,
						 (byte) 102)), (byte) -34);
		    else {
			Class109 class109 = Class591.method7078((byte) 119);
			Class528_Sub34 class528_sub34
			    = Class656.method7845(OutgoingOpcode.aClass403_4489,
						  class109.aClass10_1379,
						  -2005026336);
			class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			    (Class14.method627(string, -239499727), (byte) 19);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeString(string, -1936289654);
			class109.method1380(class528_sub34, 2105903452);
		    }
		}
	    }
	}
    }
    
    static void method8994(Class528_Sub30 class528_sub30, int i, byte i_16_) {
	Object[] objects = class528_sub30.anObjectArray10460;
	int i_17_ = ((Integer) objects[0]).intValue();
	Class528_Sub21_Sub14 class528_sub21_sub14
	    = Class510.method6253(i_17_, (byte) -3);
	if (null != class528_sub21_sub14) {
	    Class648 class648 = Class528_Sub15_Sub1.method10454((byte) 10);
	    ((Class648) class648).anIntArray8405
		= new int[-1274963297 * class528_sub21_sub14.anInt11628];
	    int i_18_ = 0;
	    ((Class648) class648).anObjectArray8412
		= new String[class528_sub21_sub14.anInt11623 * 558215757];
	    int i_19_ = 0;
	    ((Class648) class648).aLongArray8407
		= new long[class528_sub21_sub14.anInt11625 * -567751509];
	    int i_20_ = 0;
	    for (int i_21_ = 1; i_21_ < objects.length; i_21_++) {
		if (objects[i_21_] instanceof Integer) {
		    int i_22_ = ((Integer) objects[i_21_]).intValue();
		    if (-2147483647 == i_22_)
			i_22_ = -1397315565 * class528_sub30.anInt10459;
		    if (i_22_ == -2147483646)
			i_22_ = class528_sub30.anInt10464 * -674842267;
		    if (-2147483645 == i_22_)
			i_22_ = (class528_sub30.aClass229_10461 != null
				 ? (class528_sub30.aClass229_10461.anInt2376
				    * 306930455)
				 : -1);
		    if (-2147483644 == i_22_)
			i_22_ = class528_sub30.anInt10457 * 332813309;
		    if (-2147483643 == i_22_)
			i_22_ = (null != class528_sub30.aClass229_10461
				 ? (1835803215
				    * class528_sub30.aClass229_10461.anInt2377)
				 : -1);
		    if (i_22_ == -2147483642)
			i_22_ = (null != class528_sub30.aClass229_10463
				 ? (class528_sub30.aClass229_10463.anInt2376
				    * 306930455)
				 : -1);
		    if (-2147483641 == i_22_)
			i_22_ = (class528_sub30.aClass229_10463 != null
				 ? (class528_sub30.aClass229_10463.anInt2377
				    * 1835803215)
				 : -1);
		    if (i_22_ == -2147483640)
			i_22_ = -1548841569 * class528_sub30.anInt10467;
		    if (-2147483639 == i_22_)
			i_22_ = -877540293 * class528_sub30.anInt10465;
		    ((Class648) class648).anIntArray8405[i_18_++] = i_22_;
		} else if (objects[i_21_] instanceof String) {
		    String string = (String) objects[i_21_];
		    if (string.equals("event_opbase"))
			string = class528_sub30.aString10466;
		    ((Class648) class648).anObjectArray8412[i_19_++] = string;
		} else if (objects[i_21_] instanceof Long) {
		    long l = ((Long) objects[i_21_]).longValue();
		    ((Class648) class648).aLongArray8407[i_20_++] = l;
		}
	    }
	    ((Class648) class648).anInt8403
		= ((Class528_Sub30) class528_sub30).anInt10462 * -1911951849;
	    Class309.method4126(class528_sub21_sub14, i, class648, (byte) 3);
	    ((Class648) class648).anInt8403 = 0;
	}
    }
}
