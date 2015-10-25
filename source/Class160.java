/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160
{
    static final int anInt1754 = 32;
    static final int anInt1755 = 1;
    static final int anInt1756 = 2;
    public byte aByte1757;
    static final int anInt1758 = 4;
    static final int anInt1759 = 1;
    public static final int anInt1760 = 9;
    static final int anInt1761 = 16;
    public int anInt1762;
    static final int anInt1763 = 64;
    static final int anInt1764 = 16;
    static final int anInt1765 = 256;
    public static final int anInt1766 = 16;
    public static final byte aByte1767 = 0;
    public boolean aBool1768 = false;
    public static final int anInt1769 = 6;
    static final int anInt1770 = 2;
    public Class583 aClass583_1771;
    static final int anInt1772 = 128;
    public boolean aBool1773 = false;
    public int anInt1774;
    public byte aByte1775 = 0;
    public byte aByte1776 = 0;
    public boolean aBool1777 = false;
    static final int anInt1778 = 1;
    public byte aByte1779;
    public byte aByte1780;
    public byte aByte1781;
    public static final int anInt1782 = 0;
    public static final byte aByte1783 = 1;
    static final int anInt1784 = 512;
    public static final int anInt1785 = 3;
    public static final int anInt1786 = 8;
    public static final int anInt1787 = 5;
    public static final int anInt1788 = 1;
    public static final int anInt1789 = 7;
    public byte aByte1790;
    static final int anInt1791 = 0;
    public static final int anInt1792 = 11;
    public static final int anInt1793 = 13;
    static final int anInt1794 = 3;
    public static final int anInt1795 = 4;
    public byte aByte1796;
    public int anInt1797;
    public boolean aBool1798;
    public static final int anInt1799 = 2;
    public boolean aBool1800;
    public byte aByte1801;
    public byte aByte1802;
    public byte aByte1803;
    public short aShort1804;
    public static Class5_Sub11 aClass5_Sub11_1805;
    
    Class160() {
	aClass583_1771 = Class583.aClass583_7695;
	aByte1779 = (byte) -1;
	aByte1780 = (byte) 0;
	aByte1781 = (byte) 0;
	aByte1790 = (byte) 0;
	aByte1796 = (byte) 0;
	anInt1797 = 0;
	aByte1757 = (byte) 0;
	aBool1798 = false;
	aBool1800 = false;
	aByte1801 = (byte) 0;
	aByte1802 = (byte) -1;
	aByte1803 = (byte) 0;
	aShort1804 = (short) 0;
    }
    
    void method2058(int i, ByteBuffer class528_sub42, int i_0_) {
	anInt1762 = i * 1761647117;
	int i_1_ = class528_sub42.readUnsignedByte((byte) 85);
	if (0 == i_1_)
	    anInt1774 = -73177280;
	else if (i_1_ == 1)
	    anInt1774 = -146354560;
	else if (i_1_ == 2)
	    anInt1774 = -292709120;
	else if (3 == i_1_)
	    anInt1774 = -585418240;
	else if (i_1_ == 4)
	    anInt1774 = -1170836480;
	int i_2_ = class528_sub42.readInt(-1718451211);
	aBool1768 = (i_2_ & 0x1) != 0;
	aBool1773 = (i_2_ & 0x10) != 0;
	int i_3_ = (byte) class528_sub42.readUnsignedByte((byte) 118);
	aByte1780 = (byte) (i_3_ & 0x7);
	aByte1781 = (byte) (i_3_ >> 3 & 0x7);
	int i_4_ = class528_sub42.readInt(-1438839900);
	if ((i_4_ & 0x10) != 0) {
	    class528_sub42.method9635(-1554741889);
	    class528_sub42.method9635(-1786294865);
	}
	if ((i_4_ & 0x20) != 0)
	    class528_sub42.readInt(-531774735);
	if (0 != (i_4_ & 0x40))
	    class528_sub42.readInt(-1165870248);
	if (0 != (i_4_ & 0x80))
	    class528_sub42.readInt(-1836827051);
	if (0 != (i_4_ & 0x100))
	    class528_sub42.readInt(706673840);
	if (0 != (i_4_ & 0x200))
	    class528_sub42.readInt(439154204);
	aBool1777 = class528_sub42.readUnsignedByte((byte) 8) == 1;
	Class443.method5321(HandshakeOpcode.method4862(151597127),
			    class528_sub42.readUnsignedByte((byte) 4), 869444095);
	Class443.method5321(Class281.method3741(1069902205),
			    class528_sub42.readUnsignedByte((byte) 31), 1062861900);
	aClass583_1771
	    = ((Class583)
	       Class443.method5321(Class522.method6358(-941331402),
				   class528_sub42.readUnsignedByte((byte) 68),
				   2075333714));
	if (Class583.aClass583_7696 == aClass583_1771)
	    aByte1779 = (byte) class528_sub42.readUnsignedByte((byte) 42);
	int i_5_ = class528_sub42.readUnsignedByte((byte) 1);
	if ((i_5_ & 0x1) != 0)
	    aByte1775 = (byte) class528_sub42.readUnsignedByte((byte) 42);
	if ((i_5_ & 0x2) != 0)
	    aByte1776 = (byte) class528_sub42.readUnsignedByte((byte) 62);
	if (class528_sub42.readUnsignedByte((byte) 98) == 1) {
	    aByte1790 = (byte) class528_sub42.readUnsignedByte((byte) 71);
	    aByte1796 = (byte) class528_sub42.readUnsignedByte((byte) 67);
	    anInt1797 = class528_sub42.readInt(-2106506542) * -636518659;
	    aByte1803 = (byte) class528_sub42.readUnsignedByte((byte) 105);
	    class528_sub42.readUnsignedByte((byte) 92);
	    aByte1757 = (byte) class528_sub42.readUnsignedByte((byte) 68);
	    aBool1798 = class528_sub42.readUnsignedByte((byte) 80) == 1;
	    aBool1800 = class528_sub42.readUnsignedByte((byte) 108) == 1;
	    aByte1801 = (byte) class528_sub42.readUnsignedByte((byte) 69);
	    aByte1802 = (byte) class528_sub42.readUnsignedByte((byte) 66);
	    aShort1804 = (short) class528_sub42.readUnsignedShort(-1509445797);
	}
    }
    
    static final void method2059(Class229 class229, Class226 class226,
				 boolean bool, int i, Class648 class648,
				 int i_6_) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_7_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_8_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	if (-1 == 1835803215 * class229.anInt2377 && !class226.aBool2335) {
	    Class504.method6122(class229.anInt2376 * 306930455, 1224082358);
	    Class550.method6688(class229.anInt2376 * 306930455, -1203793876);
	    Class528_Sub2.method9239(class229.anInt2376 * 306930455,
				     -662484932);
	}
	if (-1 == i_7_) {
	    class229.anInt2418 = -849511901;
	    class229.anInt2419 = 1761002431;
	    class229.anInt2528 = 238437309;
	} else {
	    class229.anInt2528 = -238437309 * i_7_;
	    class229.anInt2529 = -1620248749 * i_8_;
	    class229.aBool2532 = bool;
	    ItemType itemType
		= ((ItemType)
		   Class18.aClass5_Sub13_206.method63(i_7_, -496836793));
	    class229.anInt2424 = 375752789 * itemType.anInt47;
	    class229.anInt2517 = -1117977693 * itemType.anInt46;
	    class229.anInt2426 = -213493851 * itemType.anInt54;
	    class229.anInt2462 = -309360785 * itemType.anInt44;
	    class229.anInt2423 = -1253449691 * itemType.anInt41;
	    class229.anInt2430 = itemType.anInt68 * 856353963;
	    class229.anInt2435 = i * 1023027137;
	    if (1520184523 * class229.anInt2431 > 0)
		class229.anInt2430
		    = (-395745760 * class229.anInt2430
		       / (class229.anInt2431 * 1520184523) * -44552751);
	    else if (class229.anInt2386 * 2038633197 > 0)
		class229.anInt2430
		    = -44552751 * (class229.anInt2430 * -395745760
				   / (2038633197 * class229.anInt2386));
	}
    }
    
    static final void method2060(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2493
	    = Class181_Sub23.method8999(string, class648, (byte) -77);
	class229.aBool2483 = true;
    }
    
    static final void method2061(Class648 class648, int i) {
	int i_9_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_9_, (byte) 72);
	Class226 class226 = Class380.aClass226Array3970[i_9_ >> 16];
	Class223.method3166(class229, class226, class648, 752883483);
    }
    
    static final void method2062(Class648 class648, int i) {
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = (((Class648) class648).aClass528_Sub21_Sub14_8397
	       .anObjectArray11622
	       [-630179809 * ((Class648) class648).anInt8390]);
    }
    
    public static Class528_Sub19 method2063(int i, boolean bool, byte i_10_) {
	synchronized (Class528_Sub19.aClass528_Sub19Array10395) {
	    if (Class528_Sub19.anInt10391 * 817159537 == 0) {
		Class528_Sub19 class528_sub19 = new Class528_Sub19(i, bool);
		return class528_sub19;
	    }
	    Class528_Sub19.aClass528_Sub19Array10395
		[(Class528_Sub19.anInt10391 -= 1748648849) * 817159537]
		.method9416(i, bool, -2096666627);
	    Class528_Sub19 class528_sub19
		= (Class528_Sub19.aClass528_Sub19Array10395
		   [817159537 * Class528_Sub19.anInt10391]);
	    return class528_sub19;
	}
    }
    
    static void method2064(Class648 class648, short i) {
	((Class648) class648).anIntArray8394
	    [((Class648) class648).anInt8395 * 717927929 - 2]
	    = (((Class256)
		(Class669.aClass25_Sub1_8522.method63
		 ((((Class648) class648).anIntArray8394
		   [717927929 * ((Class648) class648).anInt8395 - 2]),
		  -1538634096)))
	       .anIntArray2816
	       [(((Class648) class648).anIntArray8394
		 [((Class648) class648).anInt8395 * 717927929 - 1])]);
	((Class648) class648).anInt8395 -= 1239022665;
    }
    
    static final void method2065(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class191.method2791(class229, class226, class648, -1866010134);
    }
    
    public static void method2066(String string, byte i) {
	if (14 == client.anInt10876 * 175711435) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4495,
				      client.aClass109_11162.aClass10_1379,
				      -1965828644);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717(0, (byte) -4);
	    int i_11_ = (class528_sub34.aClass528_Sub42_Sub2_10481.pointer
			 * -185904669);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
								 -1936289654);
	    class528_sub34.aClass528_Sub42_Sub2_10481.pointer += 1220108941;
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9705
		(Class43.anIntArray525, i_11_,
		 (-185904669
		  * class528_sub34.aClass528_Sub42_Sub2_10481.pointer),
		 16711935);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9620
		(-185904669 * (class528_sub34.aClass528_Sub42_Sub2_10481
			       .pointer) - i_11_,
		 1707915456);
	    client.aClass109_11162.method1380(class528_sub34, 614503912);
	    Class181_Sub23.aClass682_9880 = Class682.aClass682_8596;
	}
    }
}
