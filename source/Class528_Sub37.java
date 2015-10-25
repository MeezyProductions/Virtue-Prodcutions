/* Class528_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;

import jaclib.hardware_info.HardwareInfo;

public class Class528_Sub37 extends Node
{
    int anInt10504;
    static final int anInt10505 = 1;
    int anInt10506;
    int anInt10507;
    static final int anInt10508 = 4;
    int anInt10509;
    boolean aBool10510;
    static final int anInt10511 = 1;
    static final int anInt10512 = 25;
    static final int anInt10513 = 3;
    static final int anInt10514 = 4;
    int anInt10515;
    String aString10516;
    static final int anInt10517 = 7;
    static final int anInt10518 = 3;
    static final int anInt10519 = 9;
    static final int anInt10520 = 10;
    static final int anInt10521 = 8;
    static final int anInt10522 = 20;
    public static final int anInt10523 = 0;
    static final int anInt10524 = 22;
    static final int anInt10525 = 23;
    static final int anInt10526 = 24;
    static final int anInt10527 = 2;
    static final int anInt10528 = 26;
    int anInt10529;
    int anInt10530;
    static final int anInt10531 = 1;
    static final int anInt10532 = 4;
    static final int anInt10533 = 2;
    int anInt10534;
    static final int anInt10535 = 2;
    int anInt10536;
    static final int anInt10537 = 5;
    int anInt10538;
    boolean aBool10539;
    public int anInt10540;
    int[] anIntArray10541 = new int[3];
    static final int anInt10542 = 7;
    int anInt10543;
    static final int anInt10544 = 6;
    String aString10545;
    static final int anInt10546 = 3;
    static final int anInt10547 = 0;
    String aString10548;
    String aString10549;
    static final int anInt10550 = 27;
    int anInt10551;
    int anInt10552;
    static final int anInt10553 = 5;
    int anInt10554;
    String aString10555;
    String aString10556;
    static final int anInt10557 = 11;
    static final int anInt10558 = 21;
    String aString10559;
    
    public int method9543(int i) {
	int i_0_ = 38;
	i_0_ += Class528_Sub25.method9444(((Class528_Sub37) this).aString10545,
					  -248587328);
	i_0_ += Class528_Sub25.method9444(((Class528_Sub37) this).aString10548,
					  -289027048);
	i_0_ += Class528_Sub25.method9444(((Class528_Sub37) this).aString10549,
					  855199689);
	i_0_ += Class528_Sub25.method9444(((Class528_Sub37) this).aString10516,
					  1108414060);
	i_0_ += Class528_Sub25.method9444(((Class528_Sub37) this).aString10555,
					  863660077);
	i_0_ += Class528_Sub25.method9444(((Class528_Sub37) this).aString10556,
					  2037243611);
	i_0_ += Class528_Sub25.method9444(((Class528_Sub37) this).aString10559,
					  1143798651);
	return i_0_;
    }
    
    void method9544(byte i) {
	if (((Class528_Sub37) this).aString10545.length() > 40)
	    ((Class528_Sub37) this).aString10545
		= ((Class528_Sub37) this).aString10545.substring(0, 40);
	if (((Class528_Sub37) this).aString10548.length() > 40)
	    ((Class528_Sub37) this).aString10548
		= ((Class528_Sub37) this).aString10548.substring(0, 40);
	if (((Class528_Sub37) this).aString10549.length() > 10)
	    ((Class528_Sub37) this).aString10549
		= ((Class528_Sub37) this).aString10549.substring(0, 10);
	if (((Class528_Sub37) this).aString10516.length() > 10)
	    ((Class528_Sub37) this).aString10516
		= ((Class528_Sub37) this).aString10516.substring(0, 10);
	if (((Class528_Sub37) this).aString10559.length() > 120)
	    ((Class528_Sub37) this).aString10559
		= ((Class528_Sub37) this).aString10559.substring(0, 120);
    }
    
    public void method9545(ByteBuffer class528_sub42, int i) {
	class528_sub42.writeByte(7, (byte) 4);
	class528_sub42.writeByte((-45661793
				   * ((Class528_Sub37) this).anInt10509),
				  (byte) -19);
	class528_sub42.writeByte(((Class528_Sub37) this).aBool10510 ? 1 : 0,
				  (byte) 31);
	class528_sub42.writeByte((804619877
				   * ((Class528_Sub37) this).anInt10530),
				  (byte) -5);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10536
				   * -929989737),
				  (byte) -17);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10515
				   * -1036480091),
				  (byte) -52);
	class528_sub42.writeByte((1641275737
				   * ((Class528_Sub37) this).anInt10538),
				  (byte) 57);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10504
				   * -401996325),
				  (byte) 71);
	class528_sub42.writeByte(((Class528_Sub37) this).aBool10539 ? 1 : 0,
				  (byte) 83);
	class528_sub42.method9717((-1240942859
				   * ((Class528_Sub37) this).anInt10507),
				  (byte) -31);
	class528_sub42.writeByte((1492487475
				   * ((Class528_Sub37) this).anInt10543),
				  (byte) 51);
	class528_sub42.method9610(428595037 * anInt10540, (byte) 28);
	class528_sub42.method9717((((Class528_Sub37) this).anInt10529
				   * 1722286051),
				  (byte) 30);
	class528_sub42.method9616(((Class528_Sub37) this).aString10545,
				  -240466719);
	class528_sub42.method9616(((Class528_Sub37) this).aString10548,
				  1036760259);
	class528_sub42.method9616(((Class528_Sub37) this).aString10549,
				  463175095);
	class528_sub42.method9616(((Class528_Sub37) this).aString10516,
				  894091094);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10552
				   * -882635269),
				  (byte) -73);
	class528_sub42.method9717((-471612873
				   * ((Class528_Sub37) this).anInt10551),
				  (byte) -79);
	class528_sub42.method9616(((Class528_Sub37) this).aString10555,
				  5404966);
	class528_sub42.method9616(((Class528_Sub37) this).aString10556,
				  -543185210);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10506
				   * -1710084101),
				  (byte) -57);
	class528_sub42.writeByte((1098965341
				   * ((Class528_Sub37) this).anInt10554),
				  (byte) -33);
	for (int i_1_ = 0;
	     i_1_ < ((Class528_Sub37) this).anIntArray10541.length; i_1_++)
	    class528_sub42.writeInt((((Class528_Sub37) this).anIntArray10541
				       [i_1_]),
				      2088862670);
	class528_sub42.writeInt((1241255807
				   * ((Class528_Sub37) this).anInt10534),
				  2014349651);
	class528_sub42.method9616(((Class528_Sub37) this).aString10559,
				  1506823378);
    }
    
    public void method9546(ByteBuffer class528_sub42) {
	class528_sub42.writeByte(7, (byte) 21);
	class528_sub42.writeByte((-45661793
				   * ((Class528_Sub37) this).anInt10509),
				  (byte) -1);
	class528_sub42.writeByte(((Class528_Sub37) this).aBool10510 ? 1 : 0,
				  (byte) 86);
	class528_sub42.writeByte((804619877
				   * ((Class528_Sub37) this).anInt10530),
				  (byte) -17);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10536
				   * -929989737),
				  (byte) -17);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10515
				   * -1036480091),
				  (byte) 10);
	class528_sub42.writeByte((1641275737
				   * ((Class528_Sub37) this).anInt10538),
				  (byte) -73);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10504
				   * -401996325),
				  (byte) -12);
	class528_sub42.writeByte(((Class528_Sub37) this).aBool10539 ? 1 : 0,
				  (byte) 96);
	class528_sub42.method9717((-1240942859
				   * ((Class528_Sub37) this).anInt10507),
				  (byte) -1);
	class528_sub42.writeByte((1492487475
				   * ((Class528_Sub37) this).anInt10543),
				  (byte) 13);
	class528_sub42.method9610(428595037 * anInt10540, (byte) 28);
	class528_sub42.method9717((((Class528_Sub37) this).anInt10529
				   * 1722286051),
				  (byte) -42);
	class528_sub42.method9616(((Class528_Sub37) this).aString10545,
				  894325048);
	class528_sub42.method9616(((Class528_Sub37) this).aString10548,
				  -76056948);
	class528_sub42.method9616(((Class528_Sub37) this).aString10549,
				  1696187456);
	class528_sub42.method9616(((Class528_Sub37) this).aString10516,
				  1940702398);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10552
				   * -882635269),
				  (byte) -55);
	class528_sub42.method9717((-471612873
				   * ((Class528_Sub37) this).anInt10551),
				  (byte) -43);
	class528_sub42.method9616(((Class528_Sub37) this).aString10555,
				  1221585142);
	class528_sub42.method9616(((Class528_Sub37) this).aString10556,
				  666007447);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10506
				   * -1710084101),
				  (byte) 51);
	class528_sub42.writeByte((1098965341
				   * ((Class528_Sub37) this).anInt10554),
				  (byte) 33);
	for (int i = 0; i < ((Class528_Sub37) this).anIntArray10541.length;
	     i++)
	    class528_sub42.writeInt((((Class528_Sub37) this).anIntArray10541
				       [i]),
				      2032136551);
	class528_sub42.writeInt((1241255807
				   * ((Class528_Sub37) this).anInt10534),
				  2067949763);
	class528_sub42.method9616(((Class528_Sub37) this).aString10559,
				  759624972);
    }
    
    public int method9547() {
	int i = 38;
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10545,
				       1313570918);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10548,
				       1791271603);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10549,
				       1007664487);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10516,
				       90417835);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10555,
				       1424909807);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10556,
				       660842533);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10559,
				       40894654);
	return i;
    }
    
    void method9548() {
	if (((Class528_Sub37) this).aString10545.length() > 40)
	    ((Class528_Sub37) this).aString10545
		= ((Class528_Sub37) this).aString10545.substring(0, 40);
	if (((Class528_Sub37) this).aString10548.length() > 40)
	    ((Class528_Sub37) this).aString10548
		= ((Class528_Sub37) this).aString10548.substring(0, 40);
	if (((Class528_Sub37) this).aString10549.length() > 10)
	    ((Class528_Sub37) this).aString10549
		= ((Class528_Sub37) this).aString10549.substring(0, 10);
	if (((Class528_Sub37) this).aString10516.length() > 10)
	    ((Class528_Sub37) this).aString10516
		= ((Class528_Sub37) this).aString10516.substring(0, 10);
	if (((Class528_Sub37) this).aString10559.length() > 120)
	    ((Class528_Sub37) this).aString10559
		= ((Class528_Sub37) this).aString10559.substring(0, 120);
    }
    
    public void method9549(ByteBuffer class528_sub42) {
	class528_sub42.writeByte(7, (byte) -49);
	class528_sub42.writeByte((-45661793
				   * ((Class528_Sub37) this).anInt10509),
				  (byte) -68);
	class528_sub42.writeByte(((Class528_Sub37) this).aBool10510 ? 1 : 0,
				  (byte) -24);
	class528_sub42.writeByte((804619877
				   * ((Class528_Sub37) this).anInt10530),
				  (byte) -14);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10536
				   * -929989737),
				  (byte) -67);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10515
				   * -1036480091),
				  (byte) 46);
	class528_sub42.writeByte((1641275737
				   * ((Class528_Sub37) this).anInt10538),
				  (byte) -73);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10504
				   * -401996325),
				  (byte) 15);
	class528_sub42.writeByte(((Class528_Sub37) this).aBool10539 ? 1 : 0,
				  (byte) -16);
	class528_sub42.method9717((-1240942859
				   * ((Class528_Sub37) this).anInt10507),
				  (byte) -30);
	class528_sub42.writeByte((1492487475
				   * ((Class528_Sub37) this).anInt10543),
				  (byte) -57);
	class528_sub42.method9610(428595037 * anInt10540, (byte) 28);
	class528_sub42.method9717((((Class528_Sub37) this).anInt10529
				   * 1722286051),
				  (byte) 26);
	class528_sub42.method9616(((Class528_Sub37) this).aString10545,
				  -160186118);
	class528_sub42.method9616(((Class528_Sub37) this).aString10548,
				  1828395817);
	class528_sub42.method9616(((Class528_Sub37) this).aString10549,
				  247784242);
	class528_sub42.method9616(((Class528_Sub37) this).aString10516,
				  127637081);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10552
				   * -882635269),
				  (byte) 72);
	class528_sub42.method9717((-471612873
				   * ((Class528_Sub37) this).anInt10551),
				  (byte) 5);
	class528_sub42.method9616(((Class528_Sub37) this).aString10555,
				  1047411250);
	class528_sub42.method9616(((Class528_Sub37) this).aString10556,
				  1319963352);
	class528_sub42.writeByte((((Class528_Sub37) this).anInt10506
				   * -1710084101),
				  (byte) 41);
	class528_sub42.writeByte((1098965341
				   * ((Class528_Sub37) this).anInt10554),
				  (byte) -15);
	for (int i = 0; i < ((Class528_Sub37) this).anIntArray10541.length;
	     i++)
	    class528_sub42.writeInt((((Class528_Sub37) this).anIntArray10541
				       [i]),
				      2058644207);
	class528_sub42.writeInt((1241255807
				   * ((Class528_Sub37) this).anInt10534),
				  2077751881);
	class528_sub42.method9616(((Class528_Sub37) this).aString10559,
				  1612239456);
    }
    
    public int method9550() {
	int i = 38;
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10545,
				       1041740279);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10548,
				       236603419);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10549,
				       2060831369);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10516,
				       1977116281);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10555,
				       1436006953);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10556,
				       248789667);
	i += Class528_Sub25.method9444(((Class528_Sub37) this).aString10559,
				       593023457);
	return i;
    }
    
    public Class528_Sub37(boolean bool) {
	if (bool) {
	    if (Class312.aString3440.startsWith("win"))
		((Class528_Sub37) this).anInt10509 = 1691064927;
	    else if (Class312.aString3440.startsWith("mac"))
		((Class528_Sub37) this).anInt10509 = -912837442;
	    else if (Class312.aString3440.startsWith("linux"))
		((Class528_Sub37) this).anInt10509 = 778227485;
	    else
		((Class528_Sub37) this).anInt10509 = -1825674884;
	    if (Class674.aString8539.startsWith("amd64")
		|| Class674.aString8539.startsWith("x86_64"))
		((Class528_Sub37) this).aBool10510 = true;
	    else
		((Class528_Sub37) this).aBool10510 = false;
	    if (-45661793 * ((Class528_Sub37) this).anInt10509 == 1) {
		if (Class278.aString3050.indexOf("4.0") != -1)
		    ((Class528_Sub37) this).anInt10530 = 1283636077;
		else if (Class278.aString3050.indexOf("4.1") != -1)
		    ((Class528_Sub37) this).anInt10530 = -1727695142;
		else if (Class278.aString3050.indexOf("4.9") != -1)
		    ((Class528_Sub37) this).anInt10530 = -444059065;
		else if (Class278.aString3050.indexOf("5.0") != -1)
		    ((Class528_Sub37) this).anInt10530 = 839577012;
		else if (Class278.aString3050.indexOf("5.1") != -1)
		    ((Class528_Sub37) this).anInt10530 = 2123213089;
		else if (Class278.aString3050.indexOf("5.2") != -1)
		    ((Class528_Sub37) this).anInt10530 = 1679154024;
		else if (Class278.aString3050.indexOf("6.0") != -1)
		    ((Class528_Sub37) this).anInt10530 = -888118130;
		else if (Class278.aString3050.indexOf("6.1") != -1)
		    ((Class528_Sub37) this).anInt10530 = 395517947;
		else if (Class278.aString3050.indexOf("6.2") != -1)
		    ((Class528_Sub37) this).anInt10530 = -1332177195;
		else if (Class278.aString3050.indexOf("6.3") != -1)
		    ((Class528_Sub37) this).anInt10530 = -48541118;
		else if (Class278.aString3050.indexOf("10.0") != -1)
		    ((Class528_Sub37) this).anInt10530 = 1235094959;
	    } else if (-45661793 * ((Class528_Sub37) this).anInt10509 == 2) {
		if (Class278.aString3050.indexOf("10.4") != -1)
		    ((Class528_Sub37) this).anInt10530 = -97082236;
		else if (Class278.aString3050.indexOf("10.5") != -1)
		    ((Class528_Sub37) this).anInt10530 = 1186553841;
		else if (Class278.aString3050.indexOf("10.6") != -1)
		    ((Class528_Sub37) this).anInt10530 = -1824777378;
		else if (Class278.aString3050.indexOf("10.7") != -1)
		    ((Class528_Sub37) this).anInt10530 = -541141301;
		else if (Class278.aString3050.indexOf("10.8") != -1)
		    ((Class528_Sub37) this).anInt10530 = 742494776;
		else if (Class278.aString3050.indexOf("10.9") != -1)
		    ((Class528_Sub37) this).anInt10530 = 2026130853;
		else if (Class278.aString3050.indexOf("10.10") != -1)
		    ((Class528_Sub37) this).anInt10530 = -985200366;
		else if (Class278.aString3050.indexOf("10.11") != -1)
		    ((Class528_Sub37) this).anInt10530 = 298435711;
	    }
	    if (Class293.aString3221.toLowerCase().indexOf("sun") != -1)
		((Class528_Sub37) this).anInt10536 = -1366248409;
	    else if (Class293.aString3221.toLowerCase().indexOf("microsoft")
		     != -1)
		((Class528_Sub37) this).anInt10536 = 1562470478;
	    else if (Class293.aString3221.toLowerCase().indexOf("apple") != -1)
		((Class528_Sub37) this).anInt10536 = 196222069;
	    else if (Class293.aString3221.toLowerCase().indexOf("oracle")
		     != -1)
		((Class528_Sub37) this).anInt10536 = 1758692547;
	    else
		((Class528_Sub37) this).anInt10536 = -1170026340;
	    int i = 2;
	    int i_2_ = 0;
	    try {
		for (/**/; i < Class156.aString1735.length(); i++) {
		    int i_3_ = Class156.aString1735.charAt(i);
		    if (i_3_ < 48 || i_3_ > 57)
			break;
		    i_2_ = 10 * i_2_ + (i_3_ - 48);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    ((Class528_Sub37) this).anInt10515 = 1398533677 * i_2_;
	    i = Class156.aString1735.indexOf('.', 2) + 1;
	    i_2_ = 0;
	    try {
		for (/**/; i < Class156.aString1735.length(); i++) {
		    int i_4_ = Class156.aString1735.charAt(i);
		    if (i_4_ < 48 || i_4_ > 57)
			break;
		    i_2_ = i_2_ * 10 + (i_4_ - 48);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    ((Class528_Sub37) this).anInt10538 = i_2_ * 1771329257;
	    i = Class156.aString1735.indexOf('_', 4) + 1;
	    i_2_ = 0;
	    try {
		for (/**/; i < Class156.aString1735.length(); i++) {
		    int i_5_ = Class156.aString1735.charAt(i);
		    if (i_5_ < 48 || i_5_ > 57)
			break;
		    i_2_ = i_5_ - 48 + 10 * i_2_;
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    ((Class528_Sub37) this).anInt10504 = 494169683 * i_2_;
	    ((Class528_Sub37) this).aBool10539 = false;
	    ((Class528_Sub37) this).anInt10507
		= -1037951129 * Class509.anInt6957;
	    if (((Class528_Sub37) this).anInt10515 * -1036480091 > 3)
		((Class528_Sub37) this).anInt10543
		    = Class509.anInt6958 * 600965871;
	    else
		((Class528_Sub37) this).anInt10543 = 0;
	    try {
		int[] is = HardwareInfo.getCPUInfo();
		if (is != null && is.length == 3) {
		    ((Class528_Sub37) this).anInt10506 = -267812045 * is[0];
		    ((Class528_Sub37) this).anInt10529 = 656752075 * is[1];
		    anInt10540 = is[2] * -1067698955;
		}
		int[] is_6_ = HardwareInfo.getRawCPUInfo();
		if (null != is_6_ && 0 == is_6_.length % 5) {
		    HashMap hashmap = new HashMap();
		    for (int i_7_ = 0; i_7_ < is_6_.length / 5; i_7_++) {
			int i_8_ = is_6_[5 * i_7_];
			int i_9_ = is_6_[5 * i_7_ + 1];
			int i_10_ = is_6_[5 * i_7_ + 2];
			int i_11_ = is_6_[i_7_ * 5 + 3];
			int i_12_ = is_6_[i_7_ * 5 + 4];
			Class17 class17
			    = new Class17(i_8_, i_9_, i_10_, i_11_, i_12_);
			hashmap.put(Integer.valueOf(i_8_), class17);
		    }
		    Class17 class17
			= (Class17) hashmap.get(Integer.valueOf(0));
		    if (class17 != null) {
			ByteBuffer class528_sub42 = new ByteBuffer(13);
			class528_sub42.method9611((-684345763
						   * (((Class17) class17)
						      .anInt197)),
						  1613615070);
			class528_sub42.method9611((1898032963
						   * (((Class17) class17)
						      .anInt201)),
						  1564136915);
			class528_sub42.method9611((((Class17) class17).anInt199
						   * -1444950413),
						  1867974310);
			class528_sub42.pointer = 0;
			((Class528_Sub37) this).aString10555
			    = class528_sub42.readString(917520316);
		    }
		    Class17 class17_13_
			= (Class17) hashmap.get(Integer.valueOf(1));
		    if (class17_13_ != null) {
			((Class528_Sub37) this).anInt10534
			    = -1622317503 * ((Class17) class17_13_).anInt198;
			int i_14_
			    = ((Class17) class17_13_).anInt197 * -684345763;
			((Class528_Sub37) this).anInt10554
			    = -416646411 * (i_14_ >> 16 & 0xff);
			((Class528_Sub37) this).anIntArray10541[0]
			    = ((Class17) class17_13_).anInt199 * -1444950413;
			((Class528_Sub37) this).anIntArray10541[1]
			    = 1898032963 * ((Class17) class17_13_).anInt201;
		    }
		    Class17 class17_15_
			= (Class17) hashmap.get(Integer.valueOf(-2147483647));
		    if (null != class17_15_)
			((Class528_Sub37) this).anIntArray10541[2]
			    = 1898032963 * ((Class17) class17_15_).anInt201;
		    ByteBuffer class528_sub42 = new ByteBuffer(49);
		    for (int i_16_ = -2147483646; i_16_ <= -2147483644;
			 i_16_++) {
			Class17 class17_17_
			    = (Class17) hashmap.get(Integer.valueOf(i_16_));
			if (null != class17_17_) {
			    class528_sub42.method9611(((((Class17) class17_17_)
							.anInt198)
						       * -1050703553),
						      1876280410);
			    class528_sub42.method9611
				(-684345763 * ((Class17) class17_17_).anInt197,
				 2035966061);
			    class528_sub42.method9611((-1444950413
						       * (((Class17)
							   class17_17_)
							  .anInt199)),
						      2014851655);
			    class528_sub42.method9611((((Class17) class17_17_)
						       .anInt201) * 1898032963,
						      1761794742);
			}
		    }
		    class528_sub42.pointer = 0;
		    ((Class528_Sub37) this).aString10556
			= class528_sub42.readString(1426159404);
		}
		String[][] strings
		    = HardwareInfo.getDXDiagDisplayDevicesProps();
		if (strings != null && strings.length > 0
		    && null != strings[0]) {
		    for (int i_18_ = 0; i_18_ < strings[0].length;
			 i_18_ += 2) {
			if (strings[0][i_18_]
				.equalsIgnoreCase("szDescription"))
			    ((Class528_Sub37) this).aString10545
				= strings[0][i_18_ + 1];
			else if (strings[0][i_18_].equalsIgnoreCase
				 ("szDriverDateEnglish")) {
			    String string = strings[0][i_18_ + 1];
			    try {
				int i_19_ = string.indexOf("/");
				int i_20_ = string.indexOf("/", i_19_ + 1);
				((Class528_Sub37) this).anInt10552
				    = ((Integer.parseInt
					(string.substring(0, i_19_)))
				       * 1846605107);
				((Class528_Sub37) this).anInt10551
				    = ((Integer.parseInt
					(string.substring
					 (1 + i_20_,
					  string.indexOf(" ", i_20_))))
				       * 85562247);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
		    }
		}
		String[] strings_21_ = HardwareInfo.getDXDiagSystemProps();
		if (null != strings_21_) {
		    String string = "";
		    String string_22_ = "";
		    String string_23_ = "";
		    for (int i_24_ = 0; i_24_ < strings_21_.length;
			 i_24_ += 2) {
			if (strings_21_[i_24_]
				.equalsIgnoreCase("dwDirectXVersionMajor"))
			    string = strings_21_[i_24_ + 1];
			else if (strings_21_[i_24_].equalsIgnoreCase
				 ("dwDirectXVersionMinor"))
			    string_22_ = strings_21_[1 + i_24_];
			else if (strings_21_[i_24_].equalsIgnoreCase
				 ("dwDirectXVersionLetter"))
			    string_23_ = strings_21_[i_24_ + 1];
		    }
		    ((Class528_Sub37) this).aString10549
			= new StringBuilder().append(string).append(".").append
			      (string_22_).append
			      (string_23_).toString();
		}
	    } catch (Throwable throwable) {
		anInt10540 = 0;
	    }
	}
	if (null == ((Class528_Sub37) this).aString10545)
	    ((Class528_Sub37) this).aString10545 = "";
	if (null == ((Class528_Sub37) this).aString10548)
	    ((Class528_Sub37) this).aString10548 = "";
	if (((Class528_Sub37) this).aString10549 == null)
	    ((Class528_Sub37) this).aString10549 = "";
	if (null == ((Class528_Sub37) this).aString10516)
	    ((Class528_Sub37) this).aString10516 = "";
	if (((Class528_Sub37) this).aString10555 == null)
	    ((Class528_Sub37) this).aString10555 = "";
	if (null == ((Class528_Sub37) this).aString10556)
	    ((Class528_Sub37) this).aString10556 = "";
	if (null == ((Class528_Sub37) this).aString10559)
	    ((Class528_Sub37) this).aString10559 = "";
	method9544((byte) 1);
    }
    
    static Class263[] method9551(byte i) {
	return (new Class263[]
		{ Class263.aClass263_2859, Class263.aClass263_2861,
		  Class263.aClass263_2860 });
    }
    
    static void method9552(int i) {
	try {
	    File file = new File(Class700.aString8735, "random.dat");
	    if (file.exists())
		Class509.aClass22_6947
		    = new Class22(new Class23(file, "rw", 25L), 24, 0);
	    else {
	    while_82_:
		for (int i_25_ = 0; i_25_ < Class509.aStringArray6950.length;
		     i_25_++) {
		    for (int i_26_ = 0;
			 i_26_ < Class249.aStringArray2781.length; i_26_++) {
			File file_27_
			    = new File(new StringBuilder().append
					   (Class249.aStringArray2781[i_26_])
					   .append
					   (Class509.aStringArray6950[i_25_])
					   .append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_27_.exists()) {
			    Class509.aClass22_6947
				= new Class22(new Class23(file_27_, "rw", 25L),
					      24, 0);
			    break while_82_;
			}
		    }
		}
	    }
	    if (Class509.aClass22_6947 == null) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i_28_ = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i_28_);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		Class509.aClass22_6947
		    = new Class22(new Class23(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
}
