/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class152
{
    public String aString1709;
    public static final int anInt1710 = 4318;
    public static final int anInt1711 = 4098;
    public static final int anInt1712 = 32902;
    public static final int anInt1713 = -1;
    public int anInt1714;
    public String aString1715;
    public int anInt1716;
    static Class178 aClass178_1717;
    public static final int anInt1718 = 0;
    public long aLong1719;
    
    public Class152(int i, String string, int i_0_, String string_1_, long l,
		    boolean bool) {
	anInt1714 = 1768295729 * i;
	aString1709 = string;
	anInt1716 = -520841713 * i_0_;
	aString1715 = string_1_;
	aLong1719 = l * 1065305126753452911L;
    }
    
    static final void method1823(Class648 class648, int i) {
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_2_, (byte) 12);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 1254224115 * class229.anInt2453;
    }
    
    static final void method1824(Class648 class648, byte i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class76.method1127(i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff, (byte) 29);
    }
    
    static final void method1825(byte i, int i_4_) {
	byte[][][] is = client.gameScene.method5978((byte) -74);
	if (is == null) {
	    is = (new byte[4][client.gameScene.method6029((short) 4591)]
		  [client.gameScene.method5967(-560168286)]);
	    client.gameScene.method5979(is, -1616010987);
	}
	for (int i_5_ = 0; i_5_ < 4; i_5_++) {
	    for (int i_6_ = 0;
		 i_6_ < client.gameScene.method6029((short) 2713);
		 i_6_++) {
		for (int i_7_ = 0;
		     i_7_ < client.gameScene.method5967(2062753797);
		     i_7_++)
		    is[i_5_][i_6_][i_7_] = i;
	    }
	}
    }
}
