/* Class691_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class691_Sub34 extends Class691
{
    static final int anInt10824 = 0;
    static final int anInt10825 = 255;
    
    public Class691_Sub34(int i, Class528_Sub38 class528_sub38) {
	super(i, class528_sub38);
    }
    
    int method8125(int i) {
	return 127;
    }
    
    int method8129() {
	return 127;
    }
    
    public Class691_Sub34(Class528_Sub38 class528_sub38) {
	super(class528_sub38);
    }
    
    void method8131(int i) {
	anInt8681 = -1594538169 * i;
    }
    
    void method8128(int i, byte i_0_) {
	anInt8681 = -1594538169 * i;
    }
    
    public int method10132(byte i) {
	return anInt8681 * -1318047113;
    }
    
    int method8126(int i, int i_1_) {
	return 1;
    }
    
    int method8130() {
	return 127;
    }
    
    int method8127(int i) {
	return 1;
    }
    
    void method8132(int i) {
	anInt8681 = -1594538169 * i;
    }
    
    public void method10133(byte i) {
	if (-1318047113 * anInt8681 < 0 && -1318047113 * anInt8681 > 255)
	    anInt8681 = method8125(-879360961) * -1594538169;
    }
    
    public int method10134() {
	return anInt8681 * -1318047113;
    }
    
    public int method10135() {
	return anInt8681 * -1318047113;
    }
    
    public static void method10136(String string, int i) {
	if (client.anInt10876 * 175711435 == 14) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4549,
				      client.aClass109_11162.aClass10_1379,
				      -2077084400);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(0, (byte) 37);
	    int i_2_
		= (-185904669
		   * class528_sub34.aClass528_Sub42_Sub2_10481.pointer);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
								 -1936289654);
	    class528_sub34.aClass528_Sub42_Sub2_10481.pointer += 1220108941;
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9705
		(Class43.anIntArray525, i_2_,
		 (class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		  * -185904669),
		 16711935);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9662
		((class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		  * -185904669) - i_2_,
		 (byte) 108);
	    client.aClass109_11162.method1380(class528_sub34, 1625848242);
	    Class501_Sub1.aClass698_10133 = Class698.aClass698_8719;
	}
    }
}
