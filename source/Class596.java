/* Class596 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class596 implements Definition
{
    int anInt7763;
    byte[] aByteArray7764;
    public int anInt7765;
    Class599 aClass599_7766;
    public int[] anIntArray7767;
    public boolean aBool7768;
    int[][] anIntArrayArray7769;
    public String aString7770 = "null";
    short[] aShortArray7771;
    short[] aShortArray7772;
    Interface12 anInterface12_7773;
    short[] aShortArray7774;
    short[] aShortArray7775;
    public boolean aBool7776;
    public int anInt7777;
    byte aByte7778;
    byte aByte7779;
    byte aByte7780;
    byte aByte7781 = 0;
    boolean aBool7782;
    public int anInt7783;
    public int anInt7784;
    public int anInt7785;
    byte aByte7786;
    int anInt7787;
    int anInt7788;
    public int anInt7789;
    public String[] aStringArray7790;
    public int anInt7791;
    public boolean aBool7792;
    int[] anIntArray7793;
    int anInt7794;
    int[] anIntArray7795;
    int anInt7796;
    public boolean aBool7797;
    byte[] aByteArray7798;
    int anInt7799;
    public Class431 aClass431_7800;
    public int anInt7801;
    public int anInt7802;
    public int anInt7803;
    public boolean aBool7804;
    public boolean aBool7805;
    byte[] aByteArray7806;
    int anInt7807;
    public int anInt7808;
    int anInt7809;
    int anInt7810;
    int anInt7811;
    public int anInt7812 = -1102015815;
    static final int anInt7813 = 6;
    int anInt7814;
    int anInt7815;
    public boolean aBool7816;
    public int anInt7817;
    public int anInt7818;
    public boolean aBool7819;
    public boolean aBool7820;
    byte[] aByteArray7821;
    int anInt7822;
    public int anInt7823;
    public int anInt7824;
    public int anInt7825;
    public int anInt7826;
    public int anInt7827;
    public int anInt7828;
    public int[] anIntArray7829;
    public boolean aBool7830;
    int[] anIntArray7831;
    int anInt7832;
    public boolean aBool7833;
    Class692 aClass692_7834;
    public boolean aBool7835;
    public int[] anIntArray7836;
    public int anInt7837;
    public boolean aBool7838;
    public boolean aBool7839;
    static final int anInt7840 = 127007;
    public Class598 aClass598_7841;
    public static short[] aShortArray7842 = new short[256];
    public int anInt7843 = -1508239899;
    
    public int method7092(int i, int i_0_) {
	if (null == ((Class596) this).aClass692_7834)
	    return i_0_;
	Class528_Sub17 class528_sub17
	    = ((Class528_Sub17)
	       ((Class596) this).aClass692_7834.method8137((long) i));
	if (class528_sub17 == null)
	    return i_0_;
	return 870949851 * class528_sub17.anInt10388;
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_1_ = class528_sub42.readUnsignedByte((byte) 110);
	    if (i_1_ == 0)
		break;
	    method7093(class528_sub42, i_1_, -1627043705);
	}
    }
    
    public void method61(int i) {
	method7094(152442088);
	if (((Class596) this).aBool7782)
	    anInt7784 = 0;
	if (!((Class599) ((Class596) this).aClass599_7766).aBool7859
	    && aBool7833) {
	    aStringArray7790 = null;
	    anIntArray7836 = null;
	}
    }
    
    void method7093(ByteBuffer class528_sub42, int i, int i_2_) {
	if (1 == i) {
	    int i_3_ = class528_sub42.readUnsignedByte((byte) 110);
	    ((Class596) this).aByteArray7764 = new byte[i_3_];
	    ((Class596) this).anIntArrayArray7769 = new int[i_3_][];
	    for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
		((Class596) this).aByteArray7764[i_4_]
		    = class528_sub42.method9627(-1518683385);
		int i_5_ = class528_sub42.readUnsignedByte((byte) 111);
		((Class596) this).anIntArrayArray7769[i_4_] = new int[i_5_];
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
		    ((Class596) this).anIntArrayArray7769[i_4_][i_6_]
			= class528_sub42.method9645((short) 7600);
	    }
	} else if (i == 2)
	    aString7770 = class528_sub42.readString(1148993233).intern();
	else if (14 == i)
	    anInt7812 = class528_sub42.readUnsignedByte((byte) 112) * -1102015815;
	else if (i == 15)
	    anInt7843 = class528_sub42.readUnsignedByte((byte) 96) * -1508239899;
	else if (i == 17)
	    anInt7784 = 0;
	else if (18 != i) {
	    if (19 == i)
		anInt7785 = class528_sub42.readUnsignedByte((byte) 71) * 2019489617;
	    else if (21 == i)
		((Class596) this).aByte7786 = (byte) 1;
	    else if (22 == i)
		aBool7820 = true;
	    else if (23 == i)
		anInt7789 = -1017460903;
	    else if (24 == i) {
		int i_7_ = class528_sub42.method9645((short) -14304);
		if (-1 != i_7_)
		    ((Class596) this).anIntArray7795 = new int[] { i_7_ };
	    } else if (27 == i)
		anInt7784 = 1480493503;
	    else if (i == 28)
		anInt7817
		    = (class528_sub42.readUnsignedByte((byte) 16) << 2) * -210363615;
	    else if (29 == i)
		((Class596) this).anInt7796
		    = class528_sub42.method9627(-1411976651) * 228907821;
	    else if (i == 39)
		((Class596) this).anInt7794
		    = class528_sub42.method9627(-2030381356) * -705312857;
	    else if (i >= 30 && i < 35)
		aStringArray7790[i - 30]
		    = class528_sub42.readString(279032908).intern();
	    else if (40 == i) {
		int i_8_ = class528_sub42.readUnsignedByte((byte) 62);
		((Class596) this).aShortArray7771 = new short[i_8_];
		((Class596) this).aShortArray7772 = new short[i_8_];
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
		    ((Class596) this).aShortArray7771[i_9_]
			= (short) class528_sub42.readUnsignedShort(-278601997);
		    ((Class596) this).aShortArray7772[i_9_]
			= (short) class528_sub42.readUnsignedShort(-255098743);
		}
	    } else if (i == 41) {
		int i_10_ = class528_sub42.readUnsignedByte((byte) 109);
		((Class596) this).aShortArray7774 = new short[i_10_];
		((Class596) this).aShortArray7775 = new short[i_10_];
		for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
		    ((Class596) this).aShortArray7774[i_11_]
			= (short) class528_sub42.readUnsignedShort(-1923560697);
		    ((Class596) this).aShortArray7775[i_11_]
			= (short) class528_sub42.readUnsignedShort(-955959455);
		}
	    } else if (i == 42) {
		int i_12_ = class528_sub42.readUnsignedByte((byte) 74);
		((Class596) this).aByteArray7798 = new byte[i_12_];
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
		    ((Class596) this).aByteArray7798[i_13_]
			= class528_sub42.method9627(-1474249845);
	    } else if (i == 44) {
		int i_14_ = class528_sub42.readUnsignedShort(-988980817);
		int i_15_ = 0;
		for (int i_16_ = i_14_; i_16_ > 0; i_16_ >>= 1)
		    i_15_++;
		((Class596) this).aByteArray7821 = new byte[i_15_];
		byte i_17_ = 0;
		for (int i_18_ = 0; i_18_ < i_15_; i_18_++) {
		    if ((i_14_ & 1 << i_18_) > 0) {
			((Class596) this).aByteArray7821[i_18_] = i_17_;
			i_17_++;
		    } else
			((Class596) this).aByteArray7821[i_18_] = (byte) -1;
		}
	    } else if (45 == i) {
		int i_19_ = class528_sub42.readUnsignedShort(222984182);
		int i_20_ = 0;
		for (int i_21_ = i_19_; i_21_ > 0; i_21_ >>= 1)
		    i_20_++;
		((Class596) this).aByteArray7806 = new byte[i_20_];
		byte i_22_ = 0;
		for (int i_23_ = 0; i_23_ < i_20_; i_23_++) {
		    if ((i_19_ & 1 << i_23_) > 0) {
			((Class596) this).aByteArray7806[i_23_] = i_22_;
			i_22_++;
		    } else
			((Class596) this).aByteArray7806[i_23_] = (byte) -1;
		}
	    } else if (i == 62)
		aBool7805 = true;
	    else if (i == 64)
		aBool7797 = false;
	    else if (i == 65)
		((Class596) this).anInt7807
		    = class528_sub42.readUnsignedShort(-1851767965) * -22215973;
	    else if (66 == i)
		((Class596) this).anInt7799
		    = class528_sub42.readUnsignedShort(150553033) * 649129591;
	    else if (i == 67)
		((Class596) this).anInt7809
		    = class528_sub42.readUnsignedShort(517871464) * -1437513339;
	    else if (i == 69)
		class528_sub42.readUnsignedByte((byte) 83);
	    else if (i == 70)
		((Class596) this).anInt7810
		    = ((class528_sub42.method9642(-164924237) << 2)
		       * -788135943);
	    else if (71 == i)
		((Class596) this).anInt7811
		    = ((class528_sub42.method9642(-1795755100) << 2)
		       * 1838883867);
	    else if (i == 72)
		((Class596) this).anInt7788
		    = ((class528_sub42.method9642(-867370674) << 2)
		       * -1807646191);
	    else if (73 == i)
		aBool7816 = true;
	    else if (74 == i)
		((Class596) this).aBool7782 = true;
	    else if (75 == i)
		anInt7818 = class528_sub42.readUnsignedByte((byte) 99) * 713545473;
	    else if (i == 77 || 92 == i) {
		((Class596) this).anInt7763
		    = class528_sub42.readUnsignedShort(512878564) * -2027308633;
		if (65535 == ((Class596) this).anInt7763 * 115564055)
		    ((Class596) this).anInt7763 = 2027308633;
		((Class596) this).anInt7822
		    = class528_sub42.readUnsignedShort(-145556198) * -529676635;
		if (65535 == ((Class596) this).anInt7822 * -634605267)
		    ((Class596) this).anInt7822 = 529676635;
		int i_24_ = -1;
		if (i == 92)
		    i_24_ = class528_sub42.method9645((short) 1310);
		int i_25_ = class528_sub42.readUnsignedByte((byte) 116);
		anIntArray7767 = new int[i_25_ + 2];
		for (int i_26_ = 0; i_26_ <= i_25_; i_26_++)
		    anIntArray7767[i_26_]
			= class528_sub42.method9645((short) -3823);
		anIntArray7767[1 + i_25_] = i_24_;
	    } else if (78 == i) {
		anInt7823 = class528_sub42.readUnsignedShort(-668954960) * -910577143;
		anInt7824 = class528_sub42.readUnsignedByte((byte) 35) * 1460977583;
	    } else if (79 == i) {
		anInt7827 = class528_sub42.readUnsignedShort(464326592) * -30154669;
		anInt7828 = class528_sub42.readUnsignedShort(-578121407) * 141502817;
		anInt7824 = class528_sub42.readUnsignedByte((byte) 50) * 1460977583;
		int i_27_ = class528_sub42.readUnsignedByte((byte) 27);
		anIntArray7829 = new int[i_27_];
		for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
		    anIntArray7829[i_28_]
			= class528_sub42.readUnsignedShort(-1528965071);
	    } else if (i == 81) {
		((Class596) this).aByte7786 = (byte) 2;
		((Class596) this).anInt7787
		    = class528_sub42.readUnsignedByte((byte) 92) * -295805184;
	    } else if (i == 82)
		aBool7839 = true;
	    else if (i == 88)
		aBool7819 = false;
	    else if (89 == i)
		aBool7830 = false;
	    else if (91 == i)
		aBool7833 = true;
	    else if (i == 93) {
		((Class596) this).aByte7786 = (byte) 3;
		((Class596) this).anInt7787
		    = class528_sub42.readUnsignedShort(-690949285) * 133062239;
	    } else if (94 == i)
		((Class596) this).aByte7786 = (byte) 4;
	    else if (i == 95) {
		((Class596) this).aByte7786 = (byte) 5;
		((Class596) this).anInt7787
		    = class528_sub42.method9642(-332424449) * 133062239;
	    } else if (97 == i)
		aBool7792 = true;
	    else if (98 == i)
		aBool7835 = true;
	    else if (i == 99 || 100 == i) {
		class528_sub42.readUnsignedByte((byte) 13);
		class528_sub42.readUnsignedShort(-954401841);
	    } else if (i == 101)
		anInt7808 = class528_sub42.readUnsignedByte((byte) 75) * -998464325;
	    else if (i == 102)
		anInt7801 = class528_sub42.readUnsignedShort(-628891356) * 1779867555;
	    else if (i == 103)
		anInt7789 = 0;
	    else if (104 == i)
		anInt7826 = class528_sub42.readUnsignedByte((byte) 62) * -887579021;
	    else if (i == 105)
		aBool7804 = true;
	    else if (106 == i) {
		int i_29_ = class528_sub42.readUnsignedByte((byte) 27);
		int i_30_ = 0;
		((Class596) this).anIntArray7795 = new int[i_29_];
		((Class596) this).anIntArray7793 = new int[i_29_];
		for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
		    ((Class596) this).anIntArray7795[i_31_]
			= class528_sub42.method9645((short) -5641);
		    i_30_ += ((Class596) this).anIntArray7793[i_31_]
			= class528_sub42.readUnsignedByte((byte) 77);
		}
		for (int i_32_ = 0; i_32_ < i_29_; i_32_++)
		    ((Class596) this).anIntArray7793[i_32_]
			= (65535 * ((Class596) this).anIntArray7793[i_32_]
			   / i_30_);
	    } else if (107 == i)
		anInt7777
		    = class528_sub42.readUnsignedShort(-1842847624) * -913914033;
	    else if (i >= 150 && i < 155) {
		aStringArray7790[i - 150]
		    = class528_sub42.readString(658403005).intern();
		if (!((Class599) ((Class596) this).aClass599_7766).aBool7859)
		    aStringArray7790[i - 150] = null;
	    } else if (160 == i) {
		int i_33_ = class528_sub42.readUnsignedByte((byte) 67);
		anIntArray7836 = new int[i_33_];
		for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
		    anIntArray7836[i_34_]
			= class528_sub42.readUnsignedShort(89980831);
	    } else if (162 == i) {
		((Class596) this).aByte7786 = (byte) 3;
		((Class596) this).anInt7787
		    = class528_sub42.readInt(-590499534) * 133062239;
	    } else if (i == 163) {
		((Class596) this).aByte7778
		    = class528_sub42.method9627(-1050729108);
		((Class596) this).aByte7779
		    = class528_sub42.method9627(-1482542251);
		((Class596) this).aByte7780
		    = class528_sub42.method9627(-1219713834);
		((Class596) this).aByte7781
		    = class528_sub42.method9627(-1910666046);
	    } else if (i == 164)
		((Class596) this).anInt7832
		    = class528_sub42.method9642(1812482900) * 867850741;
	    else if (i == 165)
		((Class596) this).anInt7814
		    = class528_sub42.method9642(1799426624) * -1417199097;
	    else if (i == 166)
		((Class596) this).anInt7815
		    = class528_sub42.method9642(-1942205506) * -658477293;
	    else if (i == 167)
		anInt7802
		    = class528_sub42.readUnsignedShort(-2043530914) * -2101845475;
	    else if (168 != i && i != 169) {
		if (170 == i)
		    anInt7837 = class528_sub42.method9719(65280) * 687143651;
		else if (i == 171)
		    anInt7791 = class528_sub42.method9719(65280) * 1055006495;
		else if (173 == i) {
		    anInt7783
			= class528_sub42.readUnsignedShort(-1503969511) * -362260517;
		    anInt7803
			= class528_sub42.readUnsignedShort(-410464096) * -1473589403;
		} else if (177 == i)
		    aBool7776 = true;
		else if (178 == i)
		    anInt7825
			= class528_sub42.readUnsignedByte((byte) 64) * -1743142975;
		else if (186 == i)
		    aClass598_7841
			= ((Class598)
			   Class443.method5321(Class148_Sub1
						   .method8269((byte) 63),
					       class528_sub42
						   .readUnsignedByte((byte) 86),
					       2004586828));
		else if (188 != i) {
		    if (i == 189)
			aBool7768 = true;
		    else if (i >= 190 && i < 196) {
			if (null == ((Class596) this).anIntArray7831) {
			    ((Class596) this).anIntArray7831 = new int[6];
			    Arrays.fill(((Class596) this).anIntArray7831, -1);
			}
			((Class596) this).anIntArray7831[i - 190]
			    = class528_sub42.readUnsignedShort(-289927140);
		    } else if (i == 196)
			Class443.method5321(Class528_Sub34
						.method9517((short) 255),
					    class528_sub42
						.readUnsignedByte((byte) 15),
					    1426575627);
		    else if (i == 197)
			Class443.method5321(Class533.method6486(-960487345),
					    class528_sub42
						.readUnsignedByte((byte) 122),
					    793867528);
		    else if (i != 198 && i != 199) {
			if (200 == i)
			    aBool7838 = true;
			else if (201 == i) {
			    aClass431_7800 = new Class431();
			    aClass431_7800.aFloat4824
				= (float) class528_sub42
					      .method9640(-1616801937);
			    aClass431_7800.aFloat4826
				= (float) class528_sub42
					      .method9640(-1436876514);
			    aClass431_7800.aFloat4822
				= (float) class528_sub42
					      .method9640(-1311569269);
			    aClass431_7800.aFloat4823
				= (float) class528_sub42
					      .method9640(-1503477824);
			    aClass431_7800.aFloat4827
				= (float) class528_sub42
					      .method9640(-1771549235);
			    aClass431_7800.aFloat4825
				= (float) class528_sub42
					      .method9640(-1731519855);
			} else if (i == 249) {
			    int i_35_ = class528_sub42.readUnsignedByte((byte) 62);
			    if (((Class596) this).aClass692_7834 == null) {
				int i_36_
				    = Class327.method4259(i_35_, -2134279851);
				((Class596) this).aClass692_7834
				    = new Class692(i_36_);
			    }
			    for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
				boolean bool
				    = (class528_sub42.readUnsignedByte((byte) 27)
				       == 1);
				int i_38_
				    = class528_sub42.readTriByte(485207805);
				Node node;
				if (bool)
				    node
					= new Class528_Sub31(class528_sub42
								 .readString
								 (1914010276)
								 .intern());
				else
				    node
					= new Class528_Sub17(class528_sub42
								 .readInt
							     (-9963858));
				((Class596) this).aClass692_7834
				    .method8142(node, (long) i_38_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method7094(int i) {
	if (567849393 * anInt7785 == -1) {
	    anInt7785 = 0;
	    if (((Class596) this).aByteArray7764 != null
		&& ((Class596) this).aByteArray7764.length == 1
		&& (1922173025 * Class605.aClass605_7893.anInt7905
		    == ((Class596) this).aByteArray7764[0]))
		anInt7785 = 2019489617;
	    for (int i_39_ = 0; i_39_ < 5; i_39_++) {
		if (aStringArray7790[i_39_] != null) {
		    anInt7785 = 2019489617;
		    break;
		}
	    }
	}
	if (-1 == anInt7818 * -2062997247)
	    anInt7818 = (0 != 751199807 * anInt7784 ? 1 : 0) * 713545473;
	if (method7101(1899098149) || aBool7835 || anIntArray7767 != null)
	    aBool7776 = true;
	if (anInt7785 * 567849393 <= 0
	    && Class598.aClass598_7856 != aClass598_7841) {
	    /* empty */
	}
    }
    
    public final boolean method7095(int i, int i_40_) {
	if (((Class596) this).anIntArrayArray7769 == null)
	    return true;
	boolean bool = true;
	for (int i_41_ = 0; i_41_ < ((Class596) this).aByteArray7764.length;
	     i_41_++) {
	    if (i == ((Class596) this).aByteArray7764[i_41_]) {
		for (int i_42_ = 0;
		     (i_42_
		      < ((Class596) this).anIntArrayArray7769[i_41_].length);
		     i_42_++) {
		    if (!((Class596) this).aClass599_7766.method7141
			 (((Class596) this).anIntArrayArray7769[i_41_][i_42_],
			  1889801950))
			bool = false;
		}
	    }
	}
	return bool;
    }
    
    public final boolean method7096(Class608 class608, int i) {
	if (null == ((Class596) this).anIntArrayArray7769)
	    return true;
	boolean bool = true;
	for (int i_43_ = 0;
	     i_43_ < ((Class596) this).anIntArrayArray7769.length; i_43_++) {
	    for (int i_44_ = 0;
		 i_44_ < ((Class596) this).anIntArrayArray7769[i_43_].length;
		 i_44_++) {
		boolean bool_45_
		    = (((Class596) this).aClass599_7766.method7141
		       (((Class596) this).anIntArrayArray7769[i_43_][i_44_],
			1521483090));
		bool &= bool_45_;
		if (!bool_45_)
		    class608.anInt7947
			= -277978303 * (((Class596) this).anIntArrayArray7769
					[i_43_][i_44_]);
	    }
	}
	return bool;
    }
    
    public final synchronized Class20 method7097
	(Class173 class173, int i, int i_46_, int i_47_, Class137 class137,
	 Class137 class137_48_, int i_49_, int i_50_, int i_51_, boolean bool,
	 Class591 class591, byte i_52_) {
	if (Class303.method4039(i_46_, (byte) -106))
	    i_46_ = 1922173025 * Class605.aClass605_7896.anInt7905;
	long l = (long) (i_47_
			 + ((i_46_ << 3) + (anInt7765 * -1439030235 << 10)));
	l |= (long) (class173.anInt1985 * 1967042207 << 29);
	if (null != class591)
	    l |= ((Class591) class591).aLong7739 * -9074284310246164891L << 32;
	int i_53_ = i;
	if (((Class596) this).aByte7786 == 3)
	    i_53_ |= 0x7;
	else {
	    if (((Class596) this).aByte7786 != 0
		|| -1386574921 * ((Class596) this).anInt7814 != 0)
		i_53_ |= 0x2;
	    if (((Class596) this).anInt7832 * 332057181 != 0)
		i_53_ |= 0x1;
	    if (-787565797 * ((Class596) this).anInt7815 != 0)
		i_53_ |= 0x4;
	}
	if (bool)
	    i_53_ |= 0x40000;
	boolean bool_54_ = (((Class596) this).aByte7786 != 0
			    && (null != class137 || class137_48_ != null));
	boolean bool_55_ = (0 != ((Class596) this).anInt7832 * 332057181
			    || ((Class596) this).anInt7814 * -1386574921 != 0
			    || ((Class596) this).anInt7815 * -787565797 != 0);
	Class20 class20;
	synchronized (((Class599) ((Class596) this).aClass599_7766)
		      .aClass186_7860) {
	    class20 = (Class20) ((Class599) ((Class596) this).aClass599_7766)
				    .aClass186_7860.method2727(l);
	}
	Class157 class157
	    = (Class157) (class20 != null ? class20.anObject208 : null);
	Class528_Sub21_Sub12 class528_sub21_sub12 = null;
	if (class157 == null
	    || class173.method2245(class157.method1874(), i_53_) != 0) {
	    if (class157 != null)
		i_53_ = class173.method2366(i_53_, class157.method1874());
	    int i_56_ = i_53_;
	    if (1922173025 * Class605.aClass605_7893.anInt7905 == i_46_
		&& i_47_ > 3)
		i_56_ |= 0x5;
	    class157 = method7109(class173, i_56_, i_46_, i_47_, class591,
				  1161349286);
	    if (class157 == null)
		return null;
	    if (i_46_ == Class605.aClass605_7893.anInt7905 * 1922173025
		&& i_47_ > 3)
		class157.method1878(2048);
	    if (bool && !bool_54_ && !bool_55_)
		class528_sub21_sub12 = class157.method1899(null);
	    class157.method1873(i_53_);
	    class20 = new Class20(class157, class528_sub21_sub12);
	    synchronized (((Class599) ((Class596) this).aClass599_7766)
			  .aClass186_7860) {
		((Class599) ((Class596) this).aClass599_7766)
		    .aClass186_7860.method2729(class20, l);
	    }
	} else {
	    class528_sub21_sub12 = (Class528_Sub21_Sub12) class20.anObject209;
	    if (bool && class528_sub21_sub12 == null && !bool_54_ && !bool_55_)
		class528_sub21_sub12
		    = (Class528_Sub21_Sub12) (class20.anObject209
					      = class157.method1899(null));
	}
	if (bool_54_ || bool_55_) {
	    class157 = class157.method1951((byte) 0, i_53_, true);
	    if (bool_54_)
		class157.method1883(((Class596) this).aByte7786,
				    ((Class596) this).anInt7787 * 2139192735,
				    class137, class137_48_, i_49_, i_50_,
				    i_51_);
	    if (bool_55_)
		class157.method1880(332057181 * ((Class596) this).anInt7832,
				    ((Class596) this).anInt7814 * -1386574921,
				    ((Class596) this).anInt7815 * -787565797);
	    if (bool)
		class528_sub21_sub12 = class157.method1899(null);
	    class157.method1873(i);
	} else
	    class157 = class157.method1951((byte) 0, i, true);
	((Class599) ((Class596) this).aClass599_7766).aClass20_7865.anObject208
	    = class157;
	((Class599) ((Class596) this).aClass599_7766).aClass20_7865.anObject209
	    = class528_sub21_sub12;
	return ((Class599) ((Class596) this).aClass599_7766).aClass20_7865;
    }
    
    public final boolean method7098(int i) {
	if (((Class596) this).anIntArrayArray7769 == null)
	    return true;
	boolean bool = true;
	for (int i_57_ = 0; i_57_ < ((Class596) this).aByteArray7764.length;
	     i_57_++) {
	    if (i == ((Class596) this).aByteArray7764[i_57_]) {
		for (int i_58_ = 0;
		     (i_58_
		      < ((Class596) this).anIntArrayArray7769[i_57_].length);
		     i_58_++) {
		    if (!((Class596) this).aClass599_7766.method7141
			 (((Class596) this).anIntArrayArray7769[i_57_][i_58_],
			  1554927768))
			bool = false;
		}
	    }
	}
	return bool;
    }
    
    public final Class596 method7099(IMultiVarDefinitionsLoader iMultiVarDefinitionsLoader,
				     IMultiVarValueReader iMultiVarValueReader, int i) {
	int i_59_ = -1;
	if (-1 != ((Class596) this).anInt7763 * 115564055) {
	    VarDefinition varDefinition
		= iMultiVarDefinitionsLoader.method79(((Class596) this).anInt7763 * 115564055,
				       (byte) 10);
	    if (null != varDefinition)
		i_59_ = iMultiVarValueReader.method97(varDefinition, -1860881523);
	} else if (((Class596) this).anInt7822 * -634605267 != -1) {
	    Class142 class142
		= iMultiVarDefinitionsLoader.method82(VarDomainType.PLAYER_CONFIGS,
				       (((Class596) this).anInt7822
					* -634605267),
				       24573948);
	    if (class142 != null)
		i_59_ = iMultiVarValueReader.method114(class142, (byte) 2);
	}
	if (i_59_ < 0 || i_59_ >= anIntArray7767.length - 1) {
	    int i_60_ = anIntArray7767[anIntArray7767.length - 1];
	    if (-1 != i_60_)
		return (Class596) ((Class596) this).anInterface12_7773
				      .method63(i_60_, 1609448295);
	    return null;
	}
	if (-1 == anIntArray7767[i_59_])
	    return null;
	return (Class596) ((Class596) this).anInterface12_7773
			      .method63(anIntArray7767[i_59_], 370731799);
    }
    
    public int method7100() {
	if (null != ((Class596) this).anIntArray7795) {
	    if (((Class596) this).anIntArray7795.length > 1) {
		int i = (int) (Math.random() * 65535.0);
		for (int i_61_ = 0;
		     i_61_ < ((Class596) this).anIntArray7795.length;
		     i_61_++) {
		    if (i <= ((Class596) this).anIntArray7793[i_61_])
			return ((Class596) this).anIntArray7795[i_61_];
		    i -= ((Class596) this).anIntArray7793[i_61_];
		}
	    } else
		return ((Class596) this).anIntArray7795[0];
	}
	return -1;
    }
    
    public boolean method7101(int i) {
	return null != ((Class596) this).anIntArray7795;
    }
    
    public boolean method7102(int i) {
	return (((Class596) this).anIntArray7795 != null
		&& ((Class596) this).anIntArray7795.length > 1);
    }
    
    public int method7103(byte i) {
	if (null != ((Class596) this).anIntArray7795) {
	    if (((Class596) this).anIntArray7795.length > 1) {
		int i_62_ = (int) (Math.random() * 65535.0);
		for (int i_63_ = 0;
		     i_63_ < ((Class596) this).anIntArray7795.length;
		     i_63_++) {
		    if (i_62_ <= ((Class596) this).anIntArray7793[i_63_])
			return ((Class596) this).anIntArray7795[i_63_];
		    i_62_ -= ((Class596) this).anIntArray7793[i_63_];
		}
	    } else
		return ((Class596) this).anIntArray7795[0];
	}
	return -1;
    }
    
    public int[] method7104(byte i) {
	return ((Class596) this).anIntArray7795;
    }
    
    public boolean method7105(int i) {
	if (null == anIntArray7767)
	    return -1 != -1227654087 * anInt7823 || anIntArray7829 != null;
	for (int i_64_ = 0; i_64_ < anIntArray7767.length; i_64_++) {
	    if (-1 != anIntArray7767[i_64_]) {
		Class596 class596_65_
		    = ((Class596)
		       ((Class596) this).anInterface12_7773
			   .method63(anIntArray7767[i_64_], -267009849));
		if (-1 != class596_65_.anInt7823 * -1227654087
		    || class596_65_.anIntArray7829 != null)
		    return true;
	    }
	}
	return false;
    }
    
    public int method7106(int i, byte i_66_) {
	if (null == ((Class596) this).anIntArray7831)
	    return -1;
	return ((Class596) this).anIntArray7831[i];
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 96);
	    if (i == 0)
		break;
	    method7093(class528_sub42, i, 681444637);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 45);
	    if (i == 0)
		break;
	    method7093(class528_sub42, i, -1086439935);
	}
    }
    
    public void method59() {
	method7094(-353345698);
	if (((Class596) this).aBool7782)
	    anInt7784 = 0;
	if (!((Class599) ((Class596) this).aClass599_7766).aBool7859
	    && aBool7833) {
	    aStringArray7790 = null;
	    anIntArray7836 = null;
	}
    }
    
    public boolean method7107(int i, int i_67_) {
	if (null != ((Class596) this).anIntArray7795 && -1 != i) {
	    for (int i_68_ = 0;
		 i_68_ < ((Class596) this).anIntArray7795.length; i_68_++) {
		if (i == ((Class596) this).anIntArray7795[i_68_])
		    return true;
	    }
	}
	return false;
    }
    
    public int method7108() {
	if (null != ((Class596) this).anIntArray7795) {
	    if (((Class596) this).anIntArray7795.length > 1) {
		int i = (int) (Math.random() * 65535.0);
		for (int i_69_ = 0;
		     i_69_ < ((Class596) this).anIntArray7795.length;
		     i_69_++) {
		    if (i <= ((Class596) this).anIntArray7793[i_69_])
			return ((Class596) this).anIntArray7795[i_69_];
		    i -= ((Class596) this).anIntArray7793[i_69_];
		}
	    } else
		return ((Class596) this).anIntArray7795[0];
	}
	return -1;
    }
    
    Class157 method7109(Class173 class173, int i, int i_70_, int i_71_,
			Class591 class591, int i_72_) {
	int i_73_ = 188689573 * ((Class596) this).anInt7796 + 64;
	int i_74_ = -292016013 * ((Class596) this).anInt7794 + 850;
	int i_75_ = i;
	boolean bool
	    = (aBool7805
	       || (i_70_ == 1922173025 * Class605.aClass605_7891.anInt7905
		   && i_71_ > 3));
	if (bool)
	    i |= 0x10;
	if (i_71_ == 0) {
	    if (((Class596) this).anInt7807 * 944318803 != 128
		|| 0 != ((Class596) this).anInt7810 * -1824615863)
		i |= 0x1;
	    if (128 != -581613747 * ((Class596) this).anInt7809
		|| ((Class596) this).anInt7788 * 1813884657 != 0)
		i |= 0x4;
	} else
	    i |= 0xd;
	if (128 != ((Class596) this).anInt7799 * -927511737
	    || 0 != ((Class596) this).anInt7811 * -1958341101)
	    i |= 0x2;
	if (null != ((Class596) this).aShortArray7771)
	    i |= 0x4000;
	if (null != ((Class596) this).aShortArray7774)
	    i |= 0x8000;
	if (((Class596) this).aByte7781 != 0)
	    i |= 0x80000;
	Class157 class157 = null;
	if (null != ((Class596) this).aByteArray7764) {
	    int i_76_ = -1;
	    for (int i_77_ = 0;
		 i_77_ < ((Class596) this).aByteArray7764.length; i_77_++) {
		if (i_70_ == ((Class596) this).aByteArray7764[i_77_]) {
		    i_76_ = i_77_;
		    break;
		}
	    }
	    if (-1 == i_76_)
		return null;
	    int[] is = ((null != class591
			 && null != ((Class591) class591).anIntArray7738)
			? ((Class591) class591).anIntArray7738
			: ((Class596) this).anIntArrayArray7769[i_76_]);
	    int i_78_ = is.length;
	    if (i_78_ > 0) {
		long l = (long) (class173.anInt1985 * 1967042207);
		for (int i_79_ = 0; i_79_ < i_78_; i_79_++)
		    l = (long) is[i_79_] + 67783L * l;
		synchronized (((Class599) ((Class596) this).aClass599_7766)
			      .aClass186_7862) {
		    class157 = ((Class157)
				((Class599) ((Class596) this).aClass599_7766)
				    .aClass186_7862.method2727(l));
		}
		if (class157 != null) {
		    if (i_73_ != class157.method1928())
			i |= 0x1000;
		    if (i_74_ != class157.method1912())
			i |= 0x2000;
		}
		if (class157 == null
		    || class173.method2245(class157.method1874(), i) != 0) {
		    int i_80_ = i | 0x1f01f;
		    if (null != class157)
			i_80_ = class173.method2366(i_80_,
						    class157.method1874());
		    Class177 class177 = null;
		    synchronized (((Class599) ((Class596) this).aClass599_7766)
				  .aClass177Array7864) {
			for (int i_81_ = 0; i_81_ < i_78_; i_81_++) {
			    byte[] is_82_
				= ((Class596) this).aClass599_7766
				      .method7140(is[i_81_], 525402923);
			    if (is_82_ == null) {
				Class157 class157_83_ = null;
				return class157_83_;
			    }
			    class177 = new Class177(is_82_);
			    if (class177.anInt2035 < 13)
				class177.method2585(2);
			    if (i_78_ > 1)
				((Class599) ((Class596) this).aClass599_7766)
				    .aClass177Array7864[i_81_]
				    = class177;
			}
			if (i_78_ > 1)
			    class177
				= new Class177((((Class599) (((Class596) this)
							     .aClass599_7766))
						.aClass177Array7864),
					       i_78_);
		    }
		    class157
			= class173.method2244(class177, i_80_,
					      (((Class599) (((Class596) this)
							    .aClass599_7766))
					       .anInt7858) * -940349351,
					      i_73_, i_74_);
		    synchronized (((Class599) ((Class596) this).aClass599_7766)
				  .aClass186_7862) {
			((Class599) ((Class596) this).aClass599_7766)
			    .aClass186_7862.method2729(class157, l);
		    }
		}
	    }
	}
	if (class157 == null)
	    return null;
	Class157 class157_84_ = class157.method1951((byte) 0, i, true);
	if (i_73_ != class157.method1928())
	    class157_84_.method1910(i_73_);
	if (i_74_ != class157.method1912())
	    class157_84_.method1915(i_74_);
	if (bool)
	    class157_84_.method2002();
	if (1922173025 * Class605.aClass605_7896.anInt7905 == i_70_
	    && i_71_ > 3) {
	    class157_84_.method1932(2048);
	    class157_84_.method1880(180, 0, -180);
	}
	i_71_ &= 0x3;
	if (i_71_ == 1)
	    class157_84_.method1932(4096);
	else if (i_71_ == 2)
	    class157_84_.method1932(8192);
	else if (3 == i_71_)
	    class157_84_.method1932(12288);
	if (((Class596) this).aShortArray7771 != null) {
	    short[] is;
	    if (null != class591
		&& ((Class591) class591).aShortArray7740 != null)
		is = ((Class591) class591).aShortArray7740;
	    else
		is = ((Class596) this).aShortArray7772;
	    for (int i_85_ = 0;
		 i_85_ < ((Class596) this).aShortArray7771.length; i_85_++) {
		if (null != ((Class596) this).aByteArray7798
		    && i_85_ < ((Class596) this).aByteArray7798.length)
		    class157_84_.method1914((((Class596) this).aShortArray7771
					     [i_85_]),
					    aShortArray7842[(((Class596) this)
							     .aByteArray7798
							     [i_85_]) & 0xff]);
		else
		    class157_84_.method1914((((Class596) this).aShortArray7771
					     [i_85_]),
					    is[i_85_]);
	    }
	}
	if (((Class596) this).aShortArray7774 != null) {
	    short[] is;
	    if (class591 != null
		&& null != ((Class591) class591).aShortArray7737)
		is = ((Class591) class591).aShortArray7737;
	    else
		is = ((Class596) this).aShortArray7775;
	    for (int i_86_ = 0;
		 i_86_ < ((Class596) this).aShortArray7774.length; i_86_++)
		class157_84_.method1916((((Class596) this).aShortArray7774
					 [i_86_]),
					is[i_86_]);
	}
	if (0 != ((Class596) this).aByte7781)
	    class157_84_.method1917(((Class596) this).aByte7778,
				    ((Class596) this).aByte7779,
				    ((Class596) this).aByte7780,
				    ((Class596) this).aByte7781 & 0xff);
	if (128 != ((Class596) this).anInt7807 * 944318803
	    || 128 != -927511737 * ((Class596) this).anInt7799
	    || -581613747 * ((Class596) this).anInt7809 != 128)
	    class157_84_.method2011(((Class596) this).anInt7807 * 944318803,
				    -927511737 * ((Class596) this).anInt7799,
				    ((Class596) this).anInt7809 * -581613747);
	if (((Class596) this).anInt7810 * -1824615863 != 0
	    || ((Class596) this).anInt7811 * -1958341101 != 0
	    || 1813884657 * ((Class596) this).anInt7788 != 0)
	    class157_84_.method1880(-1824615863 * ((Class596) this).anInt7810,
				    -1958341101 * ((Class596) this).anInt7811,
				    1813884657 * ((Class596) this).anInt7788);
	class157_84_.method1873(i_75_);
	return class157_84_;
    }
    
    public int method7110(int i, int i_87_) {
	if (null == ((Class596) this).aClass692_7834)
	    return i_87_;
	Class528_Sub17 class528_sub17
	    = ((Class528_Sub17)
	       ((Class596) this).aClass692_7834.method8137((long) i));
	if (class528_sub17 == null)
	    return i_87_;
	return 870949851 * class528_sub17.anInt10388;
    }
    
    Class596(int i, Class599 class599, Interface12 interface12) {
	anInt7784 = -1333980290;
	anInt7785 = -2019489617;
	((Class596) this).aByte7786 = (byte) 0;
	((Class596) this).anInt7787 = -133062239;
	aBool7820 = false;
	anInt7789 = 1017460903;
	anInt7837 = -1767058624;
	anInt7791 = 0;
	((Class596) this).anIntArray7795 = null;
	((Class596) this).anIntArray7793 = null;
	aBool7838 = false;
	anInt7817 = -578369472;
	((Class596) this).anInt7796 = 0;
	((Class596) this).anInt7794 = 0;
	anInt7777 = 913914033;
	anInt7801 = -1779867555;
	aBool7792 = false;
	anInt7808 = 0;
	aBool7804 = false;
	aBool7805 = false;
	aBool7797 = true;
	((Class596) this).anInt7807 = 1451322752;
	((Class596) this).anInt7799 = 1484209024;
	((Class596) this).anInt7809 = 681886336;
	((Class596) this).anInt7810 = 0;
	((Class596) this).anInt7811 = 0;
	((Class596) this).anInt7788 = 0;
	((Class596) this).anInt7832 = 0;
	((Class596) this).anInt7814 = 0;
	((Class596) this).anInt7815 = 0;
	aBool7816 = false;
	((Class596) this).aBool7782 = false;
	anInt7818 = -713545473;
	anInt7802 = 0;
	((Class596) this).anInt7763 = 2027308633;
	((Class596) this).anInt7822 = 529676635;
	anInt7823 = 910577143;
	anInt7824 = 0;
	anInt7825 = 0;
	anInt7826 = 1300616333;
	anInt7827 = 0;
	anInt7828 = 0;
	aBool7830 = true;
	aBool7839 = false;
	aBool7819 = true;
	aBool7833 = false;
	aBool7835 = false;
	anInt7783 = 1750588160;
	anInt7803 = 718234880;
	aBool7776 = false;
	aBool7768 = false;
	aClass598_7841 = Class598.aClass598_7855;
	anInt7765 = 2024363949 * i;
	((Class596) this).aClass599_7766 = class599;
	((Class596) this).anInterface12_7773 = interface12;
	aStringArray7790
	    = (String[]) ((Class599) ((Class596) this).aClass599_7766)
			     .aStringArray7863.clone();
    }
    
    public boolean method7111() {
	if (null == anIntArray7767)
	    return -1 != -1227654087 * anInt7823 || anIntArray7829 != null;
	for (int i = 0; i < anIntArray7767.length; i++) {
	    if (-1 != anIntArray7767[i]) {
		Class596 class596_88_
		    = (Class596) ((Class596) this).anInterface12_7773
				     .method63(anIntArray7767[i], 1254285477);
		if (-1 != class596_88_.anInt7823 * -1227654087
		    || class596_88_.anIntArray7829 != null)
		    return true;
	    }
	}
	return false;
    }
    
    public int method7112(int i, int i_89_, int i_90_) {
	if (null == ((Class596) this).aClass692_7834)
	    return i_89_;
	Class528_Sub17 class528_sub17
	    = ((Class528_Sub17)
	       ((Class596) this).aClass692_7834.method8137((long) i));
	if (class528_sub17 == null)
	    return i_89_;
	return 870949851 * class528_sub17.anInt10388;
    }
    
    public boolean method7113() {
	return null != ((Class596) this).anIntArray7795;
    }
    
    public boolean method7114() {
	return (((Class596) this).anIntArray7795 != null
		&& ((Class596) this).anIntArray7795.length > 1);
    }
    
    public boolean method7115() {
	return (((Class596) this).anIntArray7795 != null
		&& ((Class596) this).anIntArray7795.length > 1);
    }
    
    public final synchronized Class157 method7116
	(Class173 class173, int i, int i_91_, int i_92_, Class137 class137,
	 Class137 class137_93_, int i_94_, int i_95_, int i_96_,
	 Class690 class690, Class591 class591, byte i_97_) {
	if (Class303.method4039(i_91_, (byte) 30))
	    i_91_ = Class605.aClass605_7896.anInt7905 * 1922173025;
	long l
	    = (long) ((i_91_ << 3) + (anInt7765 * -1439030235 << 10) + i_92_);
	int i_98_ = i;
	l |= (long) (1967042207 * class173.anInt1985 << 29);
	if (class591 != null)
	    l |= -9074284310246164891L * ((Class591) class591).aLong7739 << 32;
	if (null != class690)
	    i |= class690.method8078(-491740611);
	if (((Class596) this).aByte7786 == 3)
	    i |= 0x7;
	else {
	    if (0 != ((Class596) this).aByte7786
		|| 0 != ((Class596) this).anInt7814 * -1386574921)
		i |= 0x2;
	    if (332057181 * ((Class596) this).anInt7832 != 0)
		i |= 0x1;
	    if (-787565797 * ((Class596) this).anInt7815 != 0)
		i |= 0x4;
	}
	if (i_91_ == 1922173025 * Class605.aClass605_7893.anInt7905
	    && i_92_ > 3)
	    i |= 0x5;
	Class157 class157;
	synchronized (((Class599) ((Class596) this).aClass599_7766)
		      .aClass186_7861) {
	    class157 = (Class157) ((Class599) ((Class596) this).aClass599_7766)
				      .aClass186_7861.method2727(l);
	}
	if (null == class157
	    || class173.method2245(class157.method1874(), i) != 0) {
	    if (class157 != null)
		i = class173.method2366(i, class157.method1874());
	    class157
		= method7109(class173, i, i_91_, i_92_, class591, 1161349286);
	    if (class157 == null)
		return null;
	    synchronized (((Class599) ((Class596) this).aClass599_7766)
			  .aClass186_7861) {
		((Class599) ((Class596) this).aClass599_7766)
		    .aClass186_7861.method2729(class157, l);
	    }
	}
	boolean bool = false;
	if (null != class690) {
	    class157 = class157.method1951((byte) 1, i, true);
	    bool = true;
	    class690.method8079(class157, i_92_ & 0x3, 837075363);
	}
	if (Class605.aClass605_7893.anInt7905 * 1922173025 == i_91_
	    && i_92_ > 3) {
	    if (!bool) {
		class157 = class157.method1951((byte) 3, i, true);
		bool = true;
	    }
	    class157.method1878(2048);
	}
	if (((Class596) this).aByte7786 != 0) {
	    if (!bool) {
		class157 = class157.method1951((byte) 3, i, true);
		bool = true;
	    }
	    class157.method1883(((Class596) this).aByte7786,
				((Class596) this).anInt7787 * 2139192735,
				class137, class137_93_, i_94_, i_95_, i_96_);
	}
	if (332057181 * ((Class596) this).anInt7832 != 0
	    || 0 != -1386574921 * ((Class596) this).anInt7814
	    || ((Class596) this).anInt7815 * -787565797 != 0) {
	    if (!bool) {
		class157 = class157.method1951((byte) 3, i, true);
		bool = true;
	    }
	    class157.method1880(((Class596) this).anInt7832 * 332057181,
				-1386574921 * ((Class596) this).anInt7814,
				((Class596) this).anInt7815 * -787565797);
	}
	if (bool)
	    class157.method1873(i_98_);
	return class157;
    }
    
    public String method7117(int i, String string, byte i_99_) {
	if (((Class596) this).aClass692_7834 == null)
	    return string;
	Class528_Sub31 class528_sub31
	    = ((Class528_Sub31)
	       ((Class596) this).aClass692_7834.method8137((long) i));
	if (class528_sub31 == null)
	    return string;
	return (String) class528_sub31.anObject10468;
    }
    
    public int method7118(int i) {
	if (null == ((Class596) this).anIntArray7831)
	    return -1;
	return ((Class596) this).anIntArray7831[i];
    }
    
    public int method7119(int i) {
	if (null == ((Class596) this).anIntArray7831)
	    return -1;
	return ((Class596) this).anIntArray7831[i];
    }
    
    public int method7120(int i) {
	if (null == ((Class596) this).anIntArray7831)
	    return -1;
	return ((Class596) this).anIntArray7831[i];
    }
    
    static final void method7121(Class648 class648, int i) {
	int i_100_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_100_, (byte) 25);
	Class226 class226 = Class380.aClass226Array3970[i_100_ >> 16];
	Class160.method2059(class229, class226, false, 2, class648,
			    -1649643344);
    }
    
    static final void method7122(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2520
	    = Class181_Sub23.method8999(string, class648, (byte) -30);
	class229.aBool2483 = true;
    }
    
    static final void method7123(Class648 class648, byte i) {
	Class690.method8123((((Class648) class648).anIntArray8394
			     [((((Class648) class648).anInt8395 -= 1239022665)
			       * 717927929)]),
			    2125890159);
    }
    
    static final void method7124(Class648 class648, int i) {
	throw new RuntimeException("");
    }
    
    static final void method7125
	(Entity class645_sub1_sub5_sub1, int i) {
	Class690 class690 = class645_sub1_sub5_sub1.aClass690_11774;
	if ((-1416183947 * class645_sub1_sub5_sub1.anInt11793
	     == client.anInt11127)
	    || !class690.method8067((byte) 35)
	    || class690.method8094(1, -179960038)) {
	    int i_101_ = (class645_sub1_sub5_sub1.anInt11793 * -1416183947
			  - class645_sub1_sub5_sub1.anInt11792 * -1833893027);
	    int i_102_ = (client.anInt11127
			  - class645_sub1_sub5_sub1.anInt11792 * -1833893027);
	    int i_103_
		= (class645_sub1_sub5_sub1.anInt11766 * 784833024
		   + class645_sub1_sub5_sub1.method10671((byte) -68) * 256);
	    int i_104_
		= (class645_sub1_sub5_sub1.anInt11765 * -573747712
		   + class645_sub1_sub5_sub1.method10671((byte) -28) * 256);
	    int i_105_
		= (-286734848 * class645_sub1_sub5_sub1.anInt11787
		   + class645_sub1_sub5_sub1.method10671((byte) -5) * 256);
	    int i_106_
		= (-1682003456 * class645_sub1_sub5_sub1.anInt11789
		   + class645_sub1_sub5_sub1.method10671((byte) -18) * 256);
	    int i_107_
		= (i_105_ * i_102_ + (i_101_ - i_102_) * i_103_) / i_101_;
	    int i_108_
		= (i_104_ * (i_101_ - i_102_) + i_102_ * i_106_) / i_101_;
	    int i_109_
		= Class335_Sub1_Sub1.method10374(i_107_, i_108_,
						 (class645_sub1_sub5_sub1
						  .anInt11790) * 991304933,
						 -759833206);
	    int i_110_
		= Class335_Sub1_Sub1.method10374(i_105_, i_106_,
						 (class645_sub1_sub5_sub1
						  .anInt11791) * -1080767853,
						 -759833206);
	    int i_111_
		= ((i_101_ - i_102_) * i_109_ + i_110_ * i_102_) / i_101_;
	    class645_sub1_sub5_sub1.method7682((float) i_107_, (float) i_111_,
					       (float) i_108_);
	}
	class645_sub1_sub5_sub1.anInt11816 = 0;
	class645_sub1_sub5_sub1.method10663((1222279203
					     * (class645_sub1_sub5_sub1
						.anInt11794)),
					    false, -2111177788);
    }
}
