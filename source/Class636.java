/* Class636 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Map;

public class Class636 implements Definition, Interface1
{
    public int anInt8228;
    int anInt8229;
    public int anInt8230 = 0;
    public int anInt8231;
    public boolean aBool8232;
    public int anInt8233;
    public int anInt8234;
    public boolean aBool8235;
    public int anInt8236;
    static final int anInt8237 = 1190717;
    public boolean aBool8238;
    public int anInt8239;
    public int anInt8240;
    public int anInt8241;
    public int anInt8242;
    boolean aBool8243;
    public int anInt8244;
    public static Map aMap8245;
    
    static int method7565(int i) {
	if (16711935 == i)
	    return -1;
	return Class472.method5818(i, (byte) -1);
    }
    
    void method7566(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    anInt8230
		= Class215.method3012(class528_sub42.readTriByte(1347138815),
				      (byte) -36) * 1677149669;
	else if (2 == i)
	    anInt8228 = class528_sub42.readUnsignedByte((byte) 3) * -819362751;
	else if (i == 3) {
	    anInt8228 = class528_sub42.readUnsignedShort(156273121) * -819362751;
	    if (65535 == 1038388161 * anInt8228)
		anInt8228 = 819362751;
	} else if (5 == i)
	    aBool8232 = false;
	else if (i == 7)
	    anInt8233
		= Class215.method3012(class528_sub42.readTriByte(1255511422),
				      (byte) 40) * 8074275;
	else if (8 == i)
	    ((Class636) this).aBool8243 = true;
	else if (9 == i)
	    anInt8234
		= (class528_sub42.readUnsignedShort(671081338) << 2) * 748252841;
	else if (i == 10)
	    aBool8235 = false;
	else if (11 == i)
	    anInt8236 = class528_sub42.readUnsignedByte((byte) 40) * -1746719483;
	else if (12 == i)
	    aBool8238 = true;
	else if (i == 13)
	    anInt8239 = class528_sub42.readTriByte(1570744521) * 1855613749;
	else if (14 == i)
	    anInt8244
		= (class528_sub42.readUnsignedByte((byte) 85) << 2) * 1038287907;
	else if (16 == i)
	    anInt8231 = class528_sub42.readUnsignedByte((byte) 108) * -591414811;
	else if (20 == i)
	    anInt8241 = class528_sub42.readUnsignedShort(-1862961151) * -613835909;
	else if (21 == i)
	    anInt8242 = class528_sub42.readUnsignedByte((byte) 106) * -843218641;
	else if (22 == i)
	    anInt8240 = class528_sub42.readUnsignedShort(425773977) * 771537813;
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 66);
	    if (i == 0)
		break;
	    method7569(class528_sub42, i, (byte) -89);
	}
    }
    
    public void method61(int i) {
	anInt8236 = (anInt8236 * 538679245 << 8
		     | 1494455755 * ((Class636) this).anInt8229) * -1746719483;
    }
    
    public void method9(int i, byte i_0_) {
	((Class636) this).anInt8229 = i * -680990749;
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_1_ = class528_sub42.readUnsignedByte((byte) 16);
	    if (i_1_ == 0)
		break;
	    method7569(class528_sub42, i_1_, (byte) -16);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 63);
	    if (i == 0)
		break;
	    method7569(class528_sub42, i, (byte) -59);
	}
    }
    
    public void method59() {
	anInt8236 = (anInt8236 * 538679245 << 8
		     | 1494455755 * ((Class636) this).anInt8229) * -1746719483;
    }
    
    Class636() {
	anInt8228 = 819362751;
	aBool8232 = true;
	anInt8233 = -8074275;
	anInt8234 = 853365248;
	aBool8235 = true;
	anInt8236 = -1088853976;
	aBool8238 = false;
	anInt8239 = -729320799;
	anInt8244 = 2025916608;
	anInt8231 = -486921445;
	anInt8241 = -16956603;
	anInt8242 = 0;
	anInt8240 = 2133779776;
	((Class636) this).aBool8243 = false;
    }
    
    void method7567(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    anInt8230
		= Class215.method3012(class528_sub42.readTriByte(-1497450751),
				      (byte) -12) * 1677149669;
	else if (2 == i)
	    anInt8228 = class528_sub42.readUnsignedByte((byte) 74) * -819362751;
	else if (i == 3) {
	    anInt8228 = class528_sub42.readUnsignedShort(-1690688746) * -819362751;
	    if (65535 == 1038388161 * anInt8228)
		anInt8228 = 819362751;
	} else if (5 == i)
	    aBool8232 = false;
	else if (i == 7)
	    anInt8233
		= Class215.method3012(class528_sub42.readTriByte(-471658450),
				      (byte) 0) * 8074275;
	else if (8 == i)
	    ((Class636) this).aBool8243 = true;
	else if (9 == i)
	    anInt8234
		= (class528_sub42.readUnsignedShort(-1391970450) << 2) * 748252841;
	else if (i == 10)
	    aBool8235 = false;
	else if (11 == i)
	    anInt8236 = class528_sub42.readUnsignedByte((byte) 96) * -1746719483;
	else if (12 == i)
	    aBool8238 = true;
	else if (i == 13)
	    anInt8239 = class528_sub42.readTriByte(-199204303) * 1855613749;
	else if (14 == i)
	    anInt8244
		= (class528_sub42.readUnsignedByte((byte) 85) << 2) * 1038287907;
	else if (16 == i)
	    anInt8231 = class528_sub42.readUnsignedByte((byte) 108) * -591414811;
	else if (20 == i)
	    anInt8241 = class528_sub42.readUnsignedShort(40171845) * -613835909;
	else if (21 == i)
	    anInt8242 = class528_sub42.readUnsignedByte((byte) 90) * -843218641;
	else if (22 == i)
	    anInt8240 = class528_sub42.readUnsignedShort(702819446) * 771537813;
    }
    
    void method7568(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    anInt8230
		= Class215.method3012(class528_sub42.readTriByte(88611782),
				      (byte) 21) * 1677149669;
	else if (2 == i)
	    anInt8228 = class528_sub42.readUnsignedByte((byte) 52) * -819362751;
	else if (i == 3) {
	    anInt8228 = class528_sub42.readUnsignedShort(-1550534697) * -819362751;
	    if (65535 == 1038388161 * anInt8228)
		anInt8228 = 819362751;
	} else if (5 == i)
	    aBool8232 = false;
	else if (i == 7)
	    anInt8233
		= Class215.method3012(class528_sub42.readTriByte(-480202959),
				      (byte) 37) * 8074275;
	else if (8 == i)
	    ((Class636) this).aBool8243 = true;
	else if (9 == i)
	    anInt8234
		= (class528_sub42.readUnsignedShort(941141672) << 2) * 748252841;
	else if (i == 10)
	    aBool8235 = false;
	else if (11 == i)
	    anInt8236 = class528_sub42.readUnsignedByte((byte) 116) * -1746719483;
	else if (12 == i)
	    aBool8238 = true;
	else if (i == 13)
	    anInt8239 = class528_sub42.readTriByte(-218072782) * 1855613749;
	else if (14 == i)
	    anInt8244
		= (class528_sub42.readUnsignedByte((byte) 126) << 2) * 1038287907;
	else if (16 == i)
	    anInt8231 = class528_sub42.readUnsignedByte((byte) 73) * -591414811;
	else if (20 == i)
	    anInt8241 = class528_sub42.readUnsignedShort(-359596262) * -613835909;
	else if (21 == i)
	    anInt8242 = class528_sub42.readUnsignedByte((byte) 66) * -843218641;
	else if (22 == i)
	    anInt8240 = class528_sub42.readUnsignedShort(-957351466) * 771537813;
    }
    
    public void method8(int i) {
	((Class636) this).anInt8229 = i * -680990749;
    }
    
    void method7569(ByteBuffer class528_sub42, int i, byte i_2_) {
	if (i == 1)
	    anInt8230
		= Class215.method3012(class528_sub42.readTriByte(1281936307),
				      (byte) -1) * 1677149669;
	else if (2 == i)
	    anInt8228 = class528_sub42.readUnsignedByte((byte) 78) * -819362751;
	else if (i == 3) {
	    anInt8228 = class528_sub42.readUnsignedShort(787290437) * -819362751;
	    if (65535 == 1038388161 * anInt8228)
		anInt8228 = 819362751;
	} else if (5 == i)
	    aBool8232 = false;
	else if (i == 7)
	    anInt8233
		= Class215.method3012(class528_sub42.readTriByte(-362554372),
				      (byte) 38) * 8074275;
	else if (8 == i)
	    ((Class636) this).aBool8243 = true;
	else if (9 == i)
	    anInt8234
		= (class528_sub42.readUnsignedShort(-154981780) << 2) * 748252841;
	else if (i == 10)
	    aBool8235 = false;
	else if (11 == i)
	    anInt8236 = class528_sub42.readUnsignedByte((byte) 39) * -1746719483;
	else if (12 == i)
	    aBool8238 = true;
	else if (i == 13)
	    anInt8239 = class528_sub42.readTriByte(550370948) * 1855613749;
	else if (14 == i)
	    anInt8244
		= (class528_sub42.readUnsignedByte((byte) 73) << 2) * 1038287907;
	else if (16 == i)
	    anInt8231 = class528_sub42.readUnsignedByte((byte) 83) * -591414811;
	else if (20 == i)
	    anInt8241 = class528_sub42.readUnsignedShort(-1664828191) * -613835909;
	else if (21 == i)
	    anInt8242 = class528_sub42.readUnsignedByte((byte) 76) * -843218641;
	else if (22 == i)
	    anInt8240 = class528_sub42.readUnsignedShort(130180246) * 771537813;
    }
    
    static final void method7570(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.aBool2441
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	Class39.method811(class229, 1435904523);
    }
    
    static final void method7571(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class229 class229_3_
	    = Class242.method3379(class226, class229, (byte) 54);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = null == class229_3_ ? -1 : 306930455 * class229_3_.anInt2376;
    }
    
    static final void method7572(Class648 class648, short i)
	throws Exception_Sub4 {
	Class495.aClass283_Sub1_5578.method3769((byte) 26);
    }
    
    static int method7573(CharSequence charsequence, char c, int i) {
	int i_4_ = 0;
	int i_5_ = charsequence.length();
	for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
	    if (charsequence.charAt(i_6_) == c)
		i_4_++;
	}
	return i_4_;
    }
    
    static final void method7574(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class691_Sub32.aClass216_10805.method3057(103866889).method68();
    }
}
