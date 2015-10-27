/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class137
{
    public int anInt1625;
    public int anInt1626;
    public int anInt1627;
    public int anInt1628;
    public int[][] anIntArrayArray1629;
    static int anInt1630;
    static String aString1631;
    static Class229 aClass229_1632;
    
    public abstract void method1650(Class528_Sub12 class528_sub12, int[] is);
    
    public abstract void method1651(int i, int i_0_, int i_1_);
    
    public abstract void method1652
	(int i, int i_2_, int[] is, int[] is_3_, int[] is_4_, int[] is_5_,
	 int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_,
	 int[] is_11_, int[] is_12_, Class164 class164, boolean bool);
    
    public abstract void method1653();
    
    public abstract void method1654(int i, int i_13_, int i_14_,
				    boolean[][] bools, boolean bool,
				    int i_15_);
    
    public abstract void method1655(int i, int i_16_, int i_17_, int i_18_,
				    int i_19_, int i_20_, int i_21_,
				    boolean[][] bools);
    
    public final int method1656(int i, int i_22_, int i_23_) {
	int i_24_ = i >> 1543345989 * anInt1625;
	int i_25_ = i_22_ >> anInt1625 * 1543345989;
	if (i_24_ < 0 || i_25_ < 0 || i_24_ > anInt1627 * -657933437 - 1
	    || i_25_ > 1769495707 * anInt1626 - 1)
	    return 0;
	int i_26_ = i & 2130003981 * anInt1628 - 1;
	int i_27_ = i_22_ & anInt1628 * 2130003981 - 1;
	int i_28_ = ((i_26_ * anIntArrayArray1629[i_24_ + 1][i_25_]
		      + ((2130003981 * anInt1628 - i_26_)
			 * anIntArrayArray1629[i_24_][i_25_]))
		     >> 1543345989 * anInt1625);
	int i_29_ = ((((2130003981 * anInt1628 - i_26_)
		       * anIntArrayArray1629[i_24_][i_25_ + 1])
		      + i_26_ * anIntArrayArray1629[1 + i_24_][i_25_ + 1])
		     >> 1543345989 * anInt1625);
	return (i_27_ * i_29_ + (anInt1628 * 2130003981 - i_27_) * i_28_
		>> 1543345989 * anInt1625);
    }
    
    public final int method1657(int i, int i_30_, int i_31_) {
	int i_32_ = i >> anInt1625 * 1543345989;
	int i_33_ = i_30_ >> 1543345989 * anInt1625;
	i_32_ = Math.min(-657933437 * anInt1627 - 1, Math.max(0, i_32_));
	i_33_ = Math.min(anInt1626 * 1769495707 - 1, Math.max(0, i_33_));
	int i_34_ = Math.min(anInt1627 * -657933437 - 1, i_32_ + 1);
	int i_35_ = Math.min(1769495707 * anInt1626 - 1, i_33_ + 1);
	int i_36_ = i & anInt1628 * 2130003981 - 1;
	int i_37_ = i_30_ & 2130003981 * anInt1628 - 1;
	int i_38_
	    = ((i_36_ * anIntArrayArray1629[i_34_][i_33_]
		+ anIntArrayArray1629[i_32_][i_33_] * (2130003981 * anInt1628
						       - i_36_))
	       >> 1543345989 * anInt1625);
	int i_39_ = ((((anInt1628 * 2130003981 - i_36_)
		       * anIntArrayArray1629[i_32_][i_35_])
		      + i_36_ * anIntArrayArray1629[i_34_][i_35_])
		     >> anInt1625 * 1543345989);
	return (i_37_ * i_39_ + (2130003981 * anInt1628 - i_37_) * i_38_
		>> 1543345989 * anInt1625);
    }
    
    public abstract void method1658(int i, int i_40_, int i_41_, int i_42_,
				    int i_43_, int i_44_, int i_45_,
				    boolean[][] bools);
    
    public final int method1659(int i, int i_46_, int i_47_) {
	return (anIntArrayArray1629
		[Math.min(-657933437 * anInt1627 - 1, Math.max(0, i))]
		[Math.min(1769495707 * anInt1626 - 1, Math.max(0, i_46_))]);
    }
    
    public abstract Class528_Sub21_Sub12 method1660
	(int i, int i_48_, Class528_Sub21_Sub12 class528_sub21_sub12);
    
    public abstract void method1661(Class528_Sub21_Sub12 class528_sub21_sub12,
				    int i, int i_49_, int i_50_, int i_51_,
				    boolean bool);
    
    public abstract void method1662(Class528_Sub21_Sub12 class528_sub21_sub12,
				    int i, int i_52_, int i_53_, int i_54_,
				    boolean bool);
    
    public abstract boolean method1663
	(Class528_Sub21_Sub12 class528_sub21_sub12, int i, int i_55_,
	 int i_56_, int i_57_, boolean bool);
    
    Class137(int i, int i_58_, int i_59_, int[][] is) {
	anInt1627 = 72919851 * i;
	anInt1626 = i_58_ * -787863149;
	int i_60_ = 0;
	for (/**/; i_59_ > 1; i_59_ >>= 1)
	    i_60_++;
	anInt1628 = 448546501 * (1 << i_60_);
	anInt1625 = i_60_ * 1472488333;
	anIntArrayArray1629 = is;
    }
    
    public abstract void method1664(int i, int i_61_, int i_62_);
    
    public abstract void method1665
	(int i, int i_63_, int[] is, int[] is_64_, int[] is_65_, int[] is_66_,
	 int[] is_67_, int[] is_68_, int[] is_69_, int[] is_70_, int[] is_71_,
	 int[] is_72_, int[] is_73_, Class164 class164, boolean bool);
    
    public abstract void method1666(int i, int i_74_, int i_75_);
    
    public abstract void method1667();
    
    public abstract void method1668();
    
    public final int method1669(int i, int i_76_, byte i_77_) {
	return anIntArrayArray1629[i][i_76_];
    }
    
    public abstract void method1670(Class528_Sub12 class528_sub12, int[] is);
    
    public abstract void method1671(int i, int i_78_, int i_79_, int i_80_,
				    int i_81_, int i_82_, int i_83_,
				    boolean[][] bools);
    
    public abstract void method1672(int i, int i_84_, int i_85_, int i_86_,
				    int i_87_, int i_88_, int i_89_,
				    boolean[][] bools);
    
    public abstract Class528_Sub21_Sub12 method1673
	(int i, int i_90_, Class528_Sub21_Sub12 class528_sub21_sub12);
    
    public abstract Class528_Sub21_Sub12 method1674
	(int i, int i_91_, Class528_Sub21_Sub12 class528_sub21_sub12);
    
    public abstract void method1675(int i, int i_92_, int[] is, int[] is_93_,
				    int[] is_94_, int[] is_95_, int[] is_96_,
				    int[] is_97_, int[] is_98_, int[] is_99_,
				    Class164 class164, boolean bool);
    
    public abstract void method1676(Class528_Sub21_Sub12 class528_sub21_sub12,
				    int i, int i_100_, int i_101_, int i_102_,
				    boolean bool);
    
    public abstract Class528_Sub21_Sub12 method1677
	(int i, int i_103_, Class528_Sub21_Sub12 class528_sub21_sub12);
    
    public abstract void method1678(Class528_Sub21_Sub12 class528_sub21_sub12,
				    int i, int i_104_, int i_105_, int i_106_,
				    boolean bool);
    
    public abstract boolean method1679
	(Class528_Sub21_Sub12 class528_sub21_sub12, int i, int i_107_,
	 int i_108_, int i_109_, boolean bool);
    
    public abstract boolean method1680
	(Class528_Sub21_Sub12 class528_sub21_sub12, int i, int i_110_,
	 int i_111_, int i_112_, boolean bool);
    
    public abstract boolean method1681
	(Class528_Sub21_Sub12 class528_sub21_sub12, int i, int i_113_,
	 int i_114_, int i_115_, boolean bool);
    
    public abstract void method1682(Class528_Sub21_Sub12 class528_sub21_sub12,
				    int i, int i_116_, int i_117_, int i_118_,
				    boolean bool);
    
    public final int method1683(int i, int i_119_) {
	int i_120_ = i >> 1543345989 * anInt1625;
	int i_121_ = i_119_ >> anInt1625 * 1543345989;
	if (i_120_ < 0 || i_121_ < 0 || i_120_ > anInt1627 * -657933437 - 1
	    || i_121_ > 1769495707 * anInt1626 - 1)
	    return 0;
	int i_122_ = i & 2130003981 * anInt1628 - 1;
	int i_123_ = i_119_ & anInt1628 * 2130003981 - 1;
	int i_124_ = ((i_122_ * anIntArrayArray1629[i_120_ + 1][i_121_]
		       + ((2130003981 * anInt1628 - i_122_)
			  * anIntArrayArray1629[i_120_][i_121_]))
		      >> 1543345989 * anInt1625);
	int i_125_ = ((((2130003981 * anInt1628 - i_122_)
			* anIntArrayArray1629[i_120_][i_121_ + 1])
		       + i_122_ * anIntArrayArray1629[1 + i_120_][i_121_ + 1])
		      >> 1543345989 * anInt1625);
	return (i_123_ * i_125_ + (anInt1628 * 2130003981 - i_123_) * i_124_
		>> 1543345989 * anInt1625);
    }
    
    public abstract void method1684(Class528_Sub12 class528_sub12, int[] is);
    
    public abstract void method1685(Class528_Sub12 class528_sub12, int[] is);
    
    public abstract void method1686
	(int i, int i_126_, int[] is, int[] is_127_, int[] is_128_,
	 int[] is_129_, int[] is_130_, int[] is_131_, int[] is_132_,
	 int[] is_133_, Class164 class164, boolean bool);
    
    public abstract void method1687(int i, int i_134_, int i_135_,
				    boolean[][] bools, boolean bool,
				    int i_136_);
    
    public final int method1688(int i, int i_137_) {
	int i_138_ = i >> 1543345989 * anInt1625;
	int i_139_ = i_137_ >> anInt1625 * 1543345989;
	if (i_138_ < 0 || i_139_ < 0 || i_138_ > anInt1627 * -657933437 - 1
	    || i_139_ > 1769495707 * anInt1626 - 1)
	    return 0;
	int i_140_ = i & 2130003981 * anInt1628 - 1;
	int i_141_ = i_137_ & anInt1628 * 2130003981 - 1;
	int i_142_ = ((i_140_ * anIntArrayArray1629[i_138_ + 1][i_139_]
		       + ((2130003981 * anInt1628 - i_140_)
			  * anIntArrayArray1629[i_138_][i_139_]))
		      >> 1543345989 * anInt1625);
	int i_143_ = ((((2130003981 * anInt1628 - i_140_)
			* anIntArrayArray1629[i_138_][i_139_ + 1])
		       + i_140_ * anIntArrayArray1629[1 + i_138_][i_139_ + 1])
		      >> 1543345989 * anInt1625);
	return (i_141_ * i_143_ + (anInt1628 * 2130003981 - i_141_) * i_142_
		>> 1543345989 * anInt1625);
    }
    
    public abstract void method1689(Class528_Sub21_Sub12 class528_sub21_sub12,
				    int i, int i_144_, int i_145_, int i_146_,
				    boolean bool);
    
    static final void method1690(Class648 class648, int i) {
	int i_147_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (client.aString11133 != null
	    && i_147_ < 1502735135 * Class667.anInt8488)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= (415692473
		   * Class5_Sub19.aClass89Array10849[i_147_].anInt1133);
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
    
    static void method1691(Class173 class173, Class229 class229, byte i) {
	boolean bool
	    = ((Class18.aClass5_Sub13_206.method10165
		(class173, class229.anInt2528 * 1272672363,
		 1956930779 * class229.anInt2529,
		 738835805 * class229.anInt2412,
		 ~0xffffff | class229.anInt2413 * -1357003215,
		 class229.anInt2435 * -172627903,
		 (class229.aBool2532
		  ? Class108.myPlayer.model
		  : null),
		 -1046772752))
	       == null);
	if (bool) {
	    Class64.aClass688_753.method8031
		(new Class528_Sub7(1272672363 * class229.anInt2528,
				   class229.anInt2529 * 1956930779,
				   738835805 * class229.anInt2412,
				   (~0xffffff
				    | -1357003215 * class229.anInt2413),
				   class229.anInt2435 * -172627903,
				   class229.aBool2532),
		 (byte) -89);
	    Class39.method811(class229, 1435904523);
	}
    }
    
    static void method1692(Class173 class173, Class229 class229, int i,
			   int i_148_, int i_149_) {
	if (null != Class108.myPlayer) {
	    class173.method2235();
	    Class243 class243 = null;
	    Class148 class148 = null;
	    if (5 == class229.anInt2378 * -319431967) {
		class243 = class229.method3197(class173, 1818697360);
		if (class243 == null)
		    return;
		class148 = class243.aClass148_2724;
		if ((class243.anInt2725 * -728362293
		     != class229.anInt2476 * -1352480433)
		    || (1661025435 * class229.anInt2458
			!= class243.anInt2728 * 1122147715))
		    throw new IllegalStateException("");
	    }
	    class173.method2204(i, i_148_,
				-1352480433 * class229.anInt2476 + i,
				i_148_ + class229.anInt2458 * 1661025435);
	    if (2 != Class98.anInt1252 * 1886713181
		&& Class98.anInt1252 * 1886713181 != 5
		&& Class322.aClass151_3483 != null) {
		class173.method2345(Class98.anIntArray1243);
		class173.method2527();
		Class578 class578
		    = client.gameScene.method5966(1273279609);
		int i_150_;
		int i_151_;
		int i_152_;
		int i_153_;
		if (-1860881523 * Class390.anInt4111 == 1) {
		    i_150_ = 51753521 * client.anInt10972;
		    i_151_ = 1159024597 * client.anInt10973;
		    i_152_ = (int) -client.aFloat11088 & 0x3fff;
		    i_153_ = 4096;
		} else {
		    Class422 class422
			= (Class108.myPlayer
			       .method7693
			   ().aClass422_4868);
		    i_150_ = (int) class422.aFloat4780;
		    i_151_ = (int) class422.aFloat4777;
		    if (6 == -1860881523 * Class390.anInt4111)
			i_152_ = ((int) -((double) Class495
						       .aClass283_Sub1_5578
						       .method3792(-16777216)
					  * 2607.5945876176133)
				  + -946910725 * client.anInt10852) & 0x3fff;
		    else
			i_152_ = (client.anInt10852 * -946910725
				  + (int) -client.aFloat11088) & 0x3fff;
		    i_153_ = 4096 - 617921616 * client.anInt11049;
		}
		int i_154_ = i_150_ / 128 + 48;
		int i_155_
		    = (48 + client.gameScene.method5967(462777875) * 4
		       - i_151_ / 128);
		if (null != class148)
		    Class322.aClass151_3483.method1804
			(((float) (-1352480433 * class229.anInt2476) / 2.0F
			  + (float) i),
			 ((float) i_148_
			  + (float) (1661025435 * class229.anInt2458) / 2.0F),
			 (float) i_154_, (float) i_155_, i_153_, i_152_ << 2,
			 class148, i, i_148_);
		else
		    Class322.aClass151_3483.method1822
			(((float) i
			  + (float) (class229.anInt2476 * -1352480433) / 2.0F),
			 ((float) i_148_
			  + (float) (class229.anInt2458 * 1661025435) / 2.0F),
			 (float) i_154_, (float) i_155_, i_153_, i_152_ << 2,
			 1, -1, 1);
		Class533 class533
		    = client.gameScene.method5968(-1778734952);
		for (Class528_Sub17 class528_sub17
			 = ((Class528_Sub17)
			    Class98.aClass688_1240.method8034(1734985919));
		     null != class528_sub17;
		     class528_sub17
			 = ((Class528_Sub17)
			    Class98.aClass688_1240.method8037(1021720175))) {
		    int i_156_ = class528_sub17.anInt10388 * 870949851;
		    int i_157_
			= ((class533.anIntArray7129[i_156_] >> 14 & 0x3fff)
			   - 961465569 * class578.anInt7607);
		    int i_158_ = ((class533.anIntArray7129[i_156_] & 0x3fff)
				  - class578.anInt7608 * -173815201);
		    int i_159_ = i_157_ * 4 + 2 - i_150_ / 128;
		    int i_160_ = 2 + i_158_ * 4 - i_151_ / 128;
		    Class108.method1375(class173, class148, class229, i,
					i_148_, i_159_, i_160_,
					class533.anIntArray7131[i_156_],
					-1947694610);
		}
		for (int i_161_ = 0; i_161_ < Class98.anInt1245 * 2064102423;
		     i_161_++) {
		    int i_162_ = (2 + 4 * Class98.anIntArray1246[i_161_]
				  - i_150_ / 128);
		    int i_163_ = (4 * Class98.anIntArray1255[i_161_] + 2
				  - i_151_ / 128);
		    Class596 class596
			= ((Class596)
			   (client.gameScene.method5976
				((short) 16795).method63
			    (Class98.anIntArray1249[i_161_], 1623843081)));
		    if (null != class596.anIntArray7767) {
			class596 = class596.method7099(Class570.playerVarsProvider,
						       Class570.playerVarsProvider,
						       1991189049);
			if (null == class596
			    || 667283375 * class596.anInt7777 == -1)
			    continue;
		    }
		    Class108.method1375(class173, class148, class229, i,
					i_148_, i_162_, i_163_,
					class596.anInt7777 * 667283375,
					-67311440);
		}
		for (Class528_Sub2 class528_sub2
			 = ((Class528_Sub2)
			    client.aClass692_11042.method8146(-1942855841));
		     class528_sub2 != null;
		     class528_sub2
			 = ((Class528_Sub2)
			    client.aClass692_11042.method8138(619002098))) {
		    int i_164_ = (int) ((-4849232331708333273L
					 * class528_sub2.aLong7107) >> 28
					& 0x3L);
		    if (i_164_ == Class98.anInt1244 * 1446039687) {
			int i_165_ = ((int) ((class528_sub2.aLong7107
					      * -4849232331708333273L)
					     & 0x3fffL)
				      - class578.anInt7607 * 961465569);
			int i_166_ = ((int) ((-4849232331708333273L
					      * class528_sub2.aLong7107) >> 14
					     & 0x3fffL)
				      - class578.anInt7608 * -173815201);
			int i_167_ = 2 + i_165_ * 4 - i_150_ / 128;
			int i_168_ = i_166_ * 4 + 2 - i_151_ / 128;
			Class302.method4031(class229, class148, i, i_148_,
					    i_167_, i_168_,
					    Class482.aClass151Array5471[0],
					    (short) 267);
		    }
		}
		Class607.method7234(class173, i_150_, i_151_, class229,
				    class148, i, i_148_, (byte) 47);
		Class691_Sub35.method10145(i_150_, i_151_, class229, class148,
					   i, i_148_, (byte) 51);
		Class169.method2102(i_150_, i_151_, class229, class243, i,
				    i_148_, 188896174);
		if (-1860881523 * Class390.anInt4111 != 1) {
		    if (-1 != -2066092601 * Class98.anInt1250) {
			int i_169_
			    = (Class98.anInt1250 * 325564188 + 2 - i_150_ / 128
			       + (Class108
				      .myPlayer
				      .method10671((byte) -90)
				  - 1) * 2);
			int i_170_
			    = (2 + Class98.anInt1247 * -1138014772
			       - i_151_ / 128
			       + (Class108
				      .myPlayer
				      .method10671((byte) -58)
				  - 1) * 2);
			Class273.method3694(class229, class148,
					    i - (-941206115
						 * Class656.anInt8434),
					    i_148_ - (Class681.anInt8594
						      * 1377275757),
					    i_169_, i_170_,
					    (Class73.aClass151Array783
					     [Class98.aBool1251 ? 1 : 0]),
					    100.0, Class263.aClass263_2861,
					    Class257.aClass257_2830,
					    (byte) -22);
		    }
		    if (!Class108.myPlayer
			 .hidden)
			class173.method2210
			    (-1352480433 * class229.anInt2476 / 2 + i - 1,
			     1661025435 * class229.anInt2458 / 2 + i_148_ - 1,
			     3, 3, -1, 555417982);
		}
		class173.method2275(Class98.anIntArray1243[0],
				    Class98.anIntArray1243[1],
				    Class98.anIntArray1243[2],
				    Class98.anIntArray1243[3]);
	    } else if (class148 != null)
		class173.method2239(-16777216, class148, i, i_148_);
	}
    }
    
    static final void method1693(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2404 * -696699221;
    }
    
    static final void method1694(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class596.method7122(class229, class226, class648, -1821224200);
    }
    
    static final void method1695(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_171_ = (((Class648) class648).anIntArray8394
		      [((Class648) class648).anInt8395 * 717927929]);
	int i_172_ = (((Class648) class648).anIntArray8394
		      [((Class648) class648).anInt8395 * 717927929 + 1]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (Class196.aClass447_2200.method5401(i_171_, -438432000)
	       .aCharArray11538[i_172_]);
    }
}
