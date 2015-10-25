/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class183 implements Interface42
{
    Class218 this$0;
    static Class151[] aClass151Array2101;
    
    public float method319() {
	return ((float) Class514.aClass528_Sub38_6967.aClass691_Sub34_10608
			    .method10132((byte) 9)
		/ 255.0F);
    }
    
    public float method318(byte i) {
	return ((float) Class514.aClass528_Sub38_6967.aClass691_Sub34_10608
			    .method10132((byte) 1)
		/ 255.0F);
    }
    
    public float method317() {
	return ((float) Class514.aClass528_Sub38_6967.aClass691_Sub34_10608
			    .method10132((byte) 30)
		/ 255.0F);
    }
    
    Class183(Class218 class218) {
	((Class183) this).this$0 = class218;
    }
    
    static final void method2702(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class69.method1082(class229, class226, class648, (short) -19826);
    }
    
    static final void method2703(Class648 class648, int i) {
	Class142 class142
	    = (Class142) (((Class648) class648).aClass528_Sub21_Sub14_8397
			  .anObjectArray11622
			  [-630179809 * ((Class648) class648).anInt8390]);
	Interface17 interface17
	    = ((Interface17)
	       (0 == (((Class648) class648).anIntArray8414
		      [-630179809 * ((Class648) class648).anInt8390])
		? ((Class648) class648).aMap8417.get(class142.aClass445_1639)
		: ((Class648) class648).aMap8411
		      .get(class142.aClass445_1639)));
	Class483 class483 = class142.aClass459_1638.method5564(-138765695);
	if (class483 == Class483.aClass483_5480)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= interface17.method114(class142, (byte) 25);
	else if (Class483.aClass483_5472 == class483)
	    ((Class648) class648).aLongArray8398
		[((((Class648) class648).anInt8399 += 232005975) * 683825767
		  - 1)]
		= interface17.method93(class142, -1958832091);
	else if (Class483.aClass483_5474 == class483) {
	    try {
		String string
		    = (String) interface17.method109(class142, 1499689034);
		if (null == string)
		    string = "null";
		((Class648) class648).anObjectArray8396
		    [((((Class648) class648).anInt8410 += 1600226731)
		      * -520794877) - 1]
		    = string;
	    } catch (Exception exception) {
		throw new RuntimeException(exception);
	    }
	} else
	    throw new RuntimeException();
    }
    
    static void method2704(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			   int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
			   int i_9_, int i_10_, int i_11_, int i_12_,
			   boolean bool, int i_13_, byte i_14_) {
	if (0 != i_0_ && i_2_ != -1) {
	    Entity class645_sub1_sub5_sub1 = null;
	    if (i_0_ < 0) {
		int i_15_ = -i_0_ - 1;
		if (client.anInt11025 * -1453744879 == i_15_)
		    class645_sub1_sub5_sub1
			= Class108.myPlayer;
		else
		    class645_sub1_sub5_sub1
			= (client.localPlayers
			   [i_15_]);
	    } else {
		int i_16_ = i_0_ - 1;
		Class528_Sub31 class528_sub31
		    = ((Class528_Sub31)
		       client.aClass692_11110.method8137((long) i_16_));
		if (class528_sub31 != null)
		    class645_sub1_sub5_sub1 = ((Entity)
					       class528_sub31.anObject10468);
	    }
	    if (class645_sub1_sub5_sub1 != null) {
		RenderType renderType
		    = class645_sub1_sub5_sub1.getRender(-1247866746);
		if (null != renderType.anIntArrayArray7678
		    && renderType.anIntArrayArray7678[i_2_] != null)
		    i_3_ -= renderType.anIntArrayArray7678[i_2_][1];
		if (renderType.anIntArrayArray7675 != null
		    && renderType.anIntArrayArray7675[i_2_] != null)
		    i_3_ -= renderType.anIntArrayArray7675[i_2_][1];
	    }
	}
	Class645_Sub1_Sub5_Sub6 class645_sub1_sub5_sub6
	    = new Class645_Sub1_Sub5_Sub6(client.aClass495_10935
					      .method5973((byte) 37),
					  i, Class149.anInt1687 * -457709349,
					  Class149.anInt1687 * -457709349,
					  i_5_, i_6_, i_3_,
					  i_9_ + client.anInt11127,
					  i_10_ + client.anInt11127, i_11_,
					  i_12_, i_0_, i_1_, i_4_, bool, i_2_,
					  i_13_);
	class645_sub1_sub5_sub6.method10883
	    (i_7_, i_8_,
	     Class335_Sub1_Sub1.method10374(i_7_, i_8_,
					    Class149.anInt1687 * -457709349,
					    -759833206) - i_4_,
	     i_9_ + client.anInt11127, 555932962);
	client.aClass688_11043.method8031
	    (new Class528_Sub21_Sub10(class645_sub1_sub5_sub6), (byte) 36);
    }
    
    static final void method2705(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class525.method6388(class229, class226, class648, 188909626);
    }
    
    public static byte[] method2706(CharSequence charsequence, int i) {
	int i_17_ = charsequence.length();
	byte[] is = new byte[i_17_];
	for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
	    char c = charsequence.charAt(i_18_);
	    if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
		is[i_18_] = (byte) c;
	    else if (c == '\u20ac')
		is[i_18_] = (byte) -128;
	    else if ('\u201a' == c)
		is[i_18_] = (byte) -126;
	    else if (c == '\u0192')
		is[i_18_] = (byte) -125;
	    else if (c == '\u201e')
		is[i_18_] = (byte) -124;
	    else if (c == '\u2026')
		is[i_18_] = (byte) -123;
	    else if ('\u2020' == c)
		is[i_18_] = (byte) -122;
	    else if (c == '\u2021')
		is[i_18_] = (byte) -121;
	    else if ('\u02c6' == c)
		is[i_18_] = (byte) -120;
	    else if (c == '\u2030')
		is[i_18_] = (byte) -119;
	    else if (c == '\u0160')
		is[i_18_] = (byte) -118;
	    else if (c == '\u2039')
		is[i_18_] = (byte) -117;
	    else if (c == '\u0152')
		is[i_18_] = (byte) -116;
	    else if ('\u017d' == c)
		is[i_18_] = (byte) -114;
	    else if (c == '\u2018')
		is[i_18_] = (byte) -111;
	    else if ('\u2019' == c)
		is[i_18_] = (byte) -110;
	    else if (c == '\u201c')
		is[i_18_] = (byte) -109;
	    else if (c == '\u201d')
		is[i_18_] = (byte) -108;
	    else if ('\u2022' == c)
		is[i_18_] = (byte) -107;
	    else if ('\u2013' == c)
		is[i_18_] = (byte) -106;
	    else if (c == '\u2014')
		is[i_18_] = (byte) -105;
	    else if ('\u02dc' == c)
		is[i_18_] = (byte) -104;
	    else if ('\u2122' == c)
		is[i_18_] = (byte) -103;
	    else if (c == '\u0161')
		is[i_18_] = (byte) -102;
	    else if (c == '\u203a')
		is[i_18_] = (byte) -101;
	    else if (c == '\u0153')
		is[i_18_] = (byte) -100;
	    else if ('\u017e' == c)
		is[i_18_] = (byte) -98;
	    else if (c == '\u0178')
		is[i_18_] = (byte) -97;
	    else
		is[i_18_] = (byte) 63;
	}
	return is;
    }
    
    static final void method2707(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class176.method2570(class229, class226, class648, (byte) 26);
    }
}
