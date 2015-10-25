/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class46
{
    Class446 aClass446_532;
    public int anInt533 = 0;
    static final int anInt534 = 1;
    Class446 aClass446_535;
    Class186 aClass186_536;
    public int anInt537 = 0;
    static final int anInt538 = 32768;
    Interface71 anInterface71_539;
    public static Class446 aClass446_540;
    
    public Class528_Sub21_Sub4 method861(int i, byte i_0_) {
	Class528_Sub21_Sub4 class528_sub21_sub4
	    = ((Class528_Sub21_Sub4)
	       ((Class46) this).aClass186_536.method2727((long) i));
	if (null != class528_sub21_sub4)
	    return class528_sub21_sub4;
	byte[] is;
	if (i >= 32768)
	    is = ((Class46) this).aClass446_532.method5348(1, i & 0x7fff,
							   -1237537953);
	else
	    is = ((Class46) this).aClass446_535.method5348(1, i, -934397405);
	class528_sub21_sub4 = new Class528_Sub21_Sub4();
	((Class528_Sub21_Sub4) class528_sub21_sub4).aClass46_11528 = this;
	if (null != is)
	    class528_sub21_sub4.method10465(new ByteBuffer(is),
					    (byte) -127);
	if (i >= 32768)
	    class528_sub21_sub4.method10468(-1085201008);
	((Class46) this).aClass186_536.method2729(class528_sub21_sub4,
						  (long) i);
	return class528_sub21_sub4;
    }
    
    String method862(Class628 class628, int[] is, long l) {
	if (((Class46) this).anInterface71_539 != null) {
	    String string
		= ((Class46) this).anInterface71_539.method474(class628, is,
							       l);
	    if (null != string)
		return string;
	}
	return Long.toString(l);
    }
    
    public Class46(Class668 class668, Class446 class446, Class446 class446_1_,
		   Interface71 interface71) {
	((Class46) this).aClass186_536 = new Class186(64);
	((Class46) this).anInterface71_539 = null;
	((Class46) this).aClass446_535 = class446;
	((Class46) this).aClass446_532 = class446_1_;
	((Class46) this).anInterface71_539 = interface71;
	if (((Class46) this).aClass446_535 != null)
	    anInt533
		= (((Class46) this).aClass446_535.method5345(1, 2052365111)
		   * -452553377);
	if (null != ((Class46) this).aClass446_532)
	    anInt537
		= (((Class46) this).aClass446_532.method5345(1, 2052365111)
		   * -1275448653);
    }
    
    static boolean method863(int i, int i_2_, byte i_3_) {
	if (i_2_ >= 1000 && i < 1000)
	    return true;
	if (i_2_ < 1000 && i < 1000) {
	    if (Class208.method2934(i, 1137126492))
		return true;
	    if (Class208.method2934(i_2_, 169431219))
		return false;
	    return true;
	}
	if (i_2_ >= 1000 && i >= 1000)
	    return true;
	return false;
    }
    
    public static final void method864(String string, byte i) {
	if (null != string) {
	    String string_4_
		= Class487.method5889(string, Class688.aClass77_8657,
				      (byte) -94);
	    if (null != string_4_) {
		for (int i_5_ = 0; i_5_ < client.anInt11024 * -1924608781;
		     i_5_++) {
		    Class33 class33 = client.aClass33Array11164[i_5_];
		    String string_6_ = class33.aString311;
		    String string_7_
			= Class487.method5889(string_6_,
					      Class688.aClass77_8657,
					      (byte) -49);
		    if (Class27.method721(string, string_4_, string_6_,
					  string_7_, (byte) 80)) {
			client.anInt11024 -= 1925524539;
			for (int i_8_ = i_5_;
			     i_8_ < client.anInt11024 * -1924608781; i_8_++)
			    client.aClass33Array11164[i_8_]
				= client.aClass33Array11164[1 + i_8_];
			client.anInt11166 = -943047031 * client.anInt11018;
			Class109 class109 = Class591.method7078((byte) 34);
			Class528_Sub34 class528_sub34
			    = Class656.method7845(OutgoingOpcode.aClass403_4498,
						  class109.aClass10_1379,
						  -1872766412);
			class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			    (Class14.method627(string, 485490637), (byte) -99);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeString(string, -1936289654);
			class109.method1380(class528_sub34, 1916614280);
			break;
		    }
		}
	    }
	}
    }
    
    public static void method865(byte i) {
	Class581.aClass151_7645 = null;
    }
}
