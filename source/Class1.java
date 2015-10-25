/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class1
{
    byte[] aByteArray9;
    public int anInt10;
    byte[][] aByteArrayArray11;
    public int anInt12;
    public int anInt13;
    static String[] aStringArray14 = new String[100];
    public Interface75 anInterface75_15;
    static int anInt16;
    
    public int method489(int i, byte i_0_) {
	return ((Class1) this).aByteArray9[i] & 0xff;
    }
    
    public int method490(String string, int i) {
	return method504(string, null, (byte) 122);
    }
    
    Class1(byte[] is, Interface75 interface75) {
	anInterface75_15 = interface75;
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	int i = class528_sub42.readUnsignedByte((byte) 33);
	if (i != 0)
	    throw new RuntimeException("");
	boolean bool = class528_sub42.readUnsignedByte((byte) 27) == 1;
	((Class1) this).aByteArray9 = new byte[256];
	class528_sub42.method9718(((Class1) this).aByteArray9, 0, 256,
				  -1456124512);
	if (bool) {
	    int[] is_1_ = new int[256];
	    int[] is_2_ = new int[256];
	    for (int i_3_ = 0; i_3_ < 256; i_3_++)
		is_1_[i_3_] = class528_sub42.readUnsignedByte((byte) 105);
	    for (int i_4_ = 0; i_4_ < 256; i_4_++)
		is_2_[i_4_] = class528_sub42.readUnsignedByte((byte) 34);
	    byte[][] is_5_ = new byte[256][];
	    for (int i_6_ = 0; i_6_ < 256; i_6_++) {
		is_5_[i_6_] = new byte[is_1_[i_6_]];
		byte i_7_ = 0;
		for (int i_8_ = 0; i_8_ < is_5_[i_6_].length; i_8_++) {
		    i_7_ += class528_sub42.method9627(-962148297);
		    is_5_[i_6_][i_8_] = i_7_;
		}
	    }
	    byte[][] is_9_ = new byte[256][];
	    for (int i_10_ = 0; i_10_ < 256; i_10_++) {
		is_9_[i_10_] = new byte[is_1_[i_10_]];
		byte i_11_ = 0;
		for (int i_12_ = 0; i_12_ < is_9_[i_10_].length; i_12_++) {
		    i_11_ += class528_sub42.method9627(-1497119240);
		    is_9_[i_10_][i_12_] = i_11_;
		}
	    }
	    ((Class1) this).aByteArrayArray11 = new byte[256][256];
	    for (int i_13_ = 0; i_13_ < 256; i_13_++) {
		if (32 != i_13_ && 160 != i_13_) {
		    for (int i_14_ = 0; i_14_ < 256; i_14_++) {
			if (32 != i_14_ && i_14_ != 160)
			    ((Class1) this).aByteArrayArray11[i_13_][i_14_]
				= (byte) Class147.method1721(is_5_, is_9_,
							     is_2_,
							     (((Class1) this)
							      .aByteArray9),
							     is_1_, i_13_,
							     i_14_, (byte) 0);
		    }
		}
	    }
	    anInt10 = 1434797377 * (is_1_[32] + is_2_[32]);
	} else
	    anInt10 = class528_sub42.readUnsignedByte((byte) 105) * 1434797377;
	class528_sub42.readUnsignedByte((byte) 52);
	class528_sub42.readUnsignedByte((byte) 74);
	anInt12 = class528_sub42.readUnsignedByte((byte) 77) * -427566767;
	anInt13 = class528_sub42.readUnsignedByte((byte) 122) * -1070223305;
    }
    
    public String method491(String string, int i, Interface3[] interface3s,
			    byte i_15_) {
	if (method504(string, interface3s, (byte) 119) <= i)
	    return string;
	i -= method504("...", null, (byte) 86);
	int i_16_ = -1;
	int i_17_ = -1;
	int i_18_ = 0;
	int i_19_ = string.length();
	String string_20_ = "";
	for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
	    char c = string.charAt(i_21_);
	    if (c == 60)
		i_16_ = i_21_;
	    else {
		if (c == 62 && -1 != i_16_) {
		    String string_22_ = string.substring(i_16_ + 1, i_21_);
		    i_16_ = -1;
		    if (string_22_.equals("lt"))
			c = '<';
		    else if (string_22_.equals("gt"))
			c = '>';
		    else if (string_22_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_22_.equals("shy"))
			c = '\u00ad';
		    else if (string_22_.equals("times"))
			c = '\u00d7';
		    else if (string_22_.equals("euro"))
			c = '\u20ac';
		    else if (string_22_.equals("copy"))
			c = '\u00a9';
		    else if (string_22_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_22_.startsWith("img=")
			    && interface3s != null) {
			    try {
				int i_23_
				    = Class454.method5495(string_22_
							      .substring(4),
							  717927929);
				i_18_ += interface3s[i_23_].method40();
				i_17_ = -1;
				if (i_18_ > i)
				    return new StringBuilder().append
					       (string_20_).append
					       ("...").toString();
				string_20_ = string.substring(0, 1 + i_21_);
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_22_.startsWith("sprite=")
				   && anInterface75_15 != null) {
			    try {
				int i_24_ = -1;
				int i_25_ = string_22_.indexOf(',');
				if (i_25_ == -1)
				    i_24_ = (Class454.method5495
					     (string_22_.substring(7),
					      717927929));
				else
				    i_24_ = (Class454.method5495
					     (string_22_.substring(7, i_25_),
					      717927929));
				i_18_ += anInterface75_15.method484(i_24_,
								    665950456);
				i_17_ = -1;
				if (i_18_ > i)
				    return new StringBuilder().append
					       (string_20_).append
					       ("...").toString();
				string_20_ = string.substring(0, i_21_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (-1 == i_16_) {
		    i_18_ += ((((Class1) this).aByteArray9
			       [Class450.method5438(c, -313631962) & 0xff])
			      & 0xff);
		    if (((Class1) this).aByteArrayArray11 != null
			&& -1 != i_17_)
			i_18_ += ((Class1) this).aByteArrayArray11[i_17_][c];
		    i_17_ = c;
		    int i_26_ = i_18_;
		    if (null != ((Class1) this).aByteArrayArray11)
			i_26_ += ((Class1) this).aByteArrayArray11[c][46];
		    if (i_26_ > i)
			return new StringBuilder().append(string_20_).append
				   ("...").toString();
		    string_20_ = string.substring(0, i_21_ + 1);
		}
	    }
	}
	return string;
    }
    
    public int method492(String string, int[] is, String[] strings,
			 Interface3[] interface3s, int i) {
	return method493(string, is, strings, interface3s, true, -1714041841);
    }
    
    int method493(String string, int[] is, String[] strings,
		  Interface3[] interface3s, boolean bool, int i) {
	if (null == string)
	    return 0;
	int i_27_ = 0;
	int i_28_ = 0;
	int i_29_ = -1;
	int i_30_ = 0;
	int i_31_ = 0;
	int i_32_ = -1;
	int i_33_ = -1;
	int i_34_ = 0;
	int i_35_ = string.length();
	for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
	    int i_37_
		= Class450.method5438(string.charAt(i_36_), 740458395) & 0xff;
	    int i_38_ = 0;
	    if (60 == i_37_)
		i_32_ = i_36_;
	    else {
		int i_39_;
		if (i_32_ != -1) {
		    if (i_37_ != 62)
			continue;
		    i_39_ = i_32_;
		    String string_40_ = string.substring(i_32_ + 1, i_36_);
		    i_32_ = -1;
		    if (string_40_.equals("br")) {
			strings[i_34_] = string.substring(i_28_, 1 + i_36_);
			if (++i_34_ >= strings.length)
			    return 0;
			i_28_ = i_36_ + 1;
			i_27_ = 0;
			i_29_ = -1;
			i_33_ = -1;
			continue;
		    }
		    if (string_40_.equals("lt")) {
			i_38_ += method489(60, (byte) -3);
			if (null != ((Class1) this).aByteArrayArray11
			    && -1 != i_33_)
			    i_38_ += (((Class1) this).aByteArrayArray11[i_33_]
				      [60]);
			i_33_ = 60;
		    } else if (string_40_.equals("gt")) {
			i_38_ += method489(62, (byte) -91);
			if (null != ((Class1) this).aByteArrayArray11
			    && i_33_ != -1)
			    i_38_ += (((Class1) this).aByteArrayArray11[i_33_]
				      [62]);
			i_33_ = 62;
		    } else if (string_40_.equals("nbsp")) {
			i_38_ += method489(160, (byte) -79);
			if (((Class1) this).aByteArrayArray11 != null
			    && -1 != i_33_)
			    i_38_ += (((Class1) this).aByteArrayArray11[i_33_]
				      [160]);
			i_33_ = 160;
		    } else if (string_40_.equals("shy")) {
			i_38_ += method489(173, (byte) -30);
			if (null != ((Class1) this).aByteArrayArray11
			    && i_33_ != -1)
			    i_38_ += (((Class1) this).aByteArrayArray11[i_33_]
				      [173]);
			i_33_ = 173;
		    } else if (string_40_.equals("times")) {
			i_38_ += method489(215, (byte) -25);
			if (((Class1) this).aByteArrayArray11 != null
			    && i_33_ != -1)
			    i_38_ += (((Class1) this).aByteArrayArray11[i_33_]
				      [215]);
			i_33_ = 215;
		    } else if (string_40_.equals("euro")) {
			i_38_ += method489(8364, (byte) -16);
			if (null != ((Class1) this).aByteArrayArray11
			    && i_33_ != -1)
			    i_38_ += (((Class1) this).aByteArrayArray11[i_33_]
				      [8364]);
			i_33_ = 8364;
		    } else if (string_40_.equals("copy")) {
			i_38_ += method489(169, (byte) -111);
			if (null != ((Class1) this).aByteArrayArray11
			    && i_33_ != -1)
			    i_38_ += (((Class1) this).aByteArrayArray11[i_33_]
				      [169]);
			i_33_ = 169;
		    } else if (string_40_.equals("reg")) {
			i_38_ += method489(174, (byte) -53);
			if (null != ((Class1) this).aByteArrayArray11
			    && -1 != i_33_)
			    i_38_ += (((Class1) this).aByteArrayArray11[i_33_]
				      [174]);
			i_33_ = 174;
		    } else if (string_40_.startsWith("img=")
			       && interface3s != null) {
			try {
			    int i_41_
				= Class454.method5495(string_40_.substring(4),
						      717927929);
			    i_38_ += interface3s[i_41_].method40();
			    i_33_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    } else if (string_40_.startsWith("sprite=")
			       && anInterface75_15 != null) {
			try {
			    int i_42_ = -1;
			    int i_43_ = string_40_.indexOf(',');
			    if (-1 == i_43_)
				i_42_ = Class454.method5495(string_40_
								.substring(7),
							    717927929);
			    else
				i_42_ = (Class454.method5495
					 (string_40_.substring(7, i_43_),
					  717927929));
			    i_38_ += anInterface75_15.method484(i_42_,
								1946113004);
			    i_33_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
			continue;
		    }
		    i_37_ = -1;
		} else {
		    i_39_ = i_36_;
		    i_38_ += method489(i_37_, (byte) -91);
		    if (null != ((Class1) this).aByteArrayArray11
			&& -1 != i_33_)
			i_38_
			    += ((Class1) this).aByteArrayArray11[i_33_][i_37_];
		    i_33_ = i_37_;
		}
		if (i_38_ > 0) {
		    i_27_ += i_38_;
		    if (null != is) {
			if (32 == i_37_) {
			    i_29_ = i_36_;
			    i_30_ = i_27_;
			    i_31_ = bool ? 1 : 0;
			}
			if (i_27_
			    > is[i_34_ < is.length ? i_34_ : is.length - 1]) {
			    if (i_29_ >= 0) {
				strings[i_34_]
				    = string.substring(i_28_,
						       i_29_ + 1 - i_31_);
				if (++i_34_ >= strings.length)
				    return 0;
				i_28_ = i_29_ + 1;
				i_29_ = -1;
				i_27_ -= i_30_;
				i_33_ = -1;
			    } else {
				strings[i_34_]
				    = string.substring(i_28_, i_39_);
				if (++i_34_ >= strings.length)
				    return 0;
				i_28_ = i_39_;
				i_29_ = -1;
				i_27_ = i_38_;
				i_33_ = -1;
			    }
			}
			if (i_37_ == 45) {
			    i_29_ = i_36_;
			    i_30_ = i_27_;
			    i_31_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_28_) {
	    strings[i_34_] = string.substring(i_28_, string.length());
	    i_34_++;
	}
	return i_34_;
    }
    
    public int method494(String string, int i, Interface3[] interface3s,
			 short i_44_) {
	int i_45_ = method492(string, new int[] { i }, aStringArray14,
			      interface3s, -1711164004);
	int i_46_ = 0;
	for (int i_47_ = 0; i_47_ < i_45_; i_47_++) {
	    int i_48_
		= method504(aStringArray14[i_47_], interface3s, (byte) 72);
	    if (i_48_ > i_46_)
		i_46_ = i_48_;
	}
	return i_46_;
    }
    
    public int method495(String string, int i, Interface3[] interface3s,
			 byte i_49_) {
	return method492(string, new int[] { i }, aStringArray14, interface3s,
			 -1711164004);
    }
    
    public String method496(String string, int i, Interface3[] interface3s,
			    int i_50_, byte i_51_) {
	int i_52_ = method492(string, new int[] { i }, aStringArray14,
			      interface3s, -1711164004);
	if (i_50_ >= 0 && i_50_ < i_52_)
	    return aStringArray14[i_50_];
	return null;
    }
    
    public int method497(int i, char c, byte i_53_) {
	if (((Class1) this).aByteArrayArray11 != null)
	    return ((Class1) this).aByteArrayArray11[i][c];
	return 0;
    }
    
    public int method498(String string, int i, int i_54_,
			 Interface3[] interface3s, int i_55_) {
	if (0 == i_54_)
	    i_54_ = anInt10 * -167621951;
	int i_56_ = method492(string, new int[] { i }, aStringArray14,
			      interface3s, -1711164004);
	int i_57_ = (i_56_ - 1) * i_54_;
	return i_57_ + -55898191 * anInt12 + anInt13 * -46594681;
    }
    
    public Point method499(String string, int i, int i_58_, int i_59_,
			   Interface3[] interface3s, int i_60_) {
	if (i_59_ <= 0)
	    return new Point(0, i_58_ + -55898191 * anInt12);
	if (i_59_ > string.length())
	    i_59_ = string.length();
	if (i_58_ == 0)
	    i_58_ = anInt10 * -167621951;
	int i_61_ = method493(string, new int[] { i }, aStringArray14,
			      interface3s, false, 1911357880);
	int i_62_ = 0;
	for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
	    int i_64_ = aStringArray14[i_63_].length();
	    if (i_62_ + i_64_ > i_59_
		|| i_63_ == i_61_ - 1 && i_59_ == string.length()) {
		String string_65_ = string.substring(i_62_, i_59_);
		if (string_65_.endsWith("<br>")) {
		    string_65_ = "";
		    i_62_ += i_64_;
		    i_63_++;
		}
		int i_66_ = method504(string_65_, interface3s, (byte) 104);
		int i_67_ = anInt12 * -55898191 + i_58_ * i_63_;
		return new Point(i_66_, i_67_);
	    }
	    i_62_ += i_64_;
	}
	return null;
    }
    
    public int method500(int i) {
	return ((Class1) this).aByteArray9[i] & 0xff;
    }
    
    public int method501(String string) {
	return method504(string, null, (byte) 121);
    }
    
    public int method502(String string) {
	return method504(string, null, (byte) 127);
    }
    
    public int method503(int i) {
	return ((Class1) this).aByteArray9[i] & 0xff;
    }
    
    public int method504(String string, Interface3[] interface3s, byte i) {
	if (null == string)
	    return 0;
	int i_68_ = -1;
	int i_69_ = -1;
	int i_70_ = 0;
	int i_71_ = string.length();
	for (int i_72_ = 0; i_72_ < i_71_; i_72_++) {
	    char c = string.charAt(i_72_);
	    if (60 == c)
		i_68_ = i_72_;
	    else {
		if (c == 62 && -1 != i_68_) {
		    String string_73_ = string.substring(1 + i_68_, i_72_);
		    i_68_ = -1;
		    if (string_73_.equals("lt"))
			c = '<';
		    else if (string_73_.equals("gt"))
			c = '>';
		    else if (string_73_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_73_.equals("shy"))
			c = '\u00ad';
		    else if (string_73_.equals("times"))
			c = '\u00d7';
		    else if (string_73_.equals("euro"))
			c = '\u20ac';
		    else if (string_73_.equals("copy"))
			c = '\u00a9';
		    else if (string_73_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_73_.startsWith("img=")
			    && null != interface3s) {
			    try {
				int i_74_
				    = Class454.method5495(string_73_
							      .substring(4),
							  717927929);
				i_70_ += interface3s[i_74_].method40();
				i_69_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_73_.startsWith("sprite=")
				   && anInterface75_15 != null) {
			    try {
				int i_75_ = -1;
				int i_76_ = string_73_.indexOf(',');
				if (-1 == i_76_)
				    i_75_ = (Class454.method5495
					     (string_73_.substring(7),
					      717927929));
				else
				    i_75_ = (Class454.method5495
					     (string_73_.substring(7, i_76_),
					      717927929));
				i_70_
				    += anInterface75_15.method484(i_75_,
								  2130322715);
				i_69_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (-1 == i_68_) {
		    i_70_ += ((((Class1) this).aByteArray9
			       [Class450.method5438(c, -1717275105) & 0xff])
			      & 0xff);
		    if (((Class1) this).aByteArrayArray11 != null
			&& i_69_ != -1)
			i_70_ += ((Class1) this).aByteArrayArray11[i_69_][c];
		    i_69_ = c;
		}
	    }
	}
	return i_70_;
    }
    
    public int method505(String string, int i, int i_77_, int i_78_, int i_79_,
			 Interface3[] interface3s, byte i_80_) {
	if (i_77_ == 0)
	    i_77_ = anInt10 * -167621951;
	int i_81_ = method493(string, new int[] { i }, aStringArray14,
			      interface3s, false, -941042265);
	if (0 == i_81_)
	    return 0;
	if (i_79_ < 0)
	    i_79_ = 0;
	i_79_ /= i_77_;
	if (i_79_ >= i_81_)
	    i_79_ = i_81_ - 1;
	String string_82_ = aStringArray14[i_79_];
	int i_83_ = 0;
	int i_84_ = 0;
	int i_85_;
	for (i_85_ = 0; i_85_ < i_78_ && i_83_ < string_82_.length();
	     i_85_ = method504(string_82_.substring(0, ++i_83_), interface3s,
			       (byte) 94))
	    i_84_ = i_85_;
	if (i_83_ == string_82_.length() && string_82_.endsWith("<br>"))
	    i_83_ -= 4;
	if (i_78_ - i_84_ < i_85_ - i_78_)
	    i_83_--;
	for (int i_86_ = 0; i_86_ < i_79_; i_86_++)
	    i_83_ += aStringArray14[i_86_].length();
	return i_83_;
    }
    
    static final void method506(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	client.anInt10940
	    = 304671021 * (((Class648) class648).anIntArray8394
			   [((Class648) class648).anInt8395 * 717927929]);
	Class474.aClass699_5429
	    = Class272.method3691((((Class648) class648).anIntArray8394
				   [1 + (717927929
					 * ((Class648) class648).anInt8395)]),
				  (byte) 98);
	if (Class474.aClass699_5429 == null)
	    Class474.aClass699_5429 = Class699.aClass699_8730;
	client.anInt10998
	    = -921749439 * (((Class648) class648).anIntArray8394
			    [717927929 * ((Class648) class648).anInt8395 + 2]);
	Class109 class109 = Class591.method7078((byte) 22);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4525,
				  class109.aClass10_1379, -2101239500);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeByte(-1196536155 * client.anInt10940, (byte) -17);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
	    (1269576623 * Class474.aClass699_5429.anInt8731, (byte) 72);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeByte(client.anInt10998 * -1857497151, (byte) -74);
	class109.method1380(class528_sub34, 1207915439);
    }
}
