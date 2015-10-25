/* Class450 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

final class Class450 implements Interface8
{
    public static final void method5430(byte i) {
	Class509.aClass501_6921.method6104((byte) -16);
	for (int i_0_ = 0; i_0_ < 32; i_0_++)
	    Class509.aLongArray6927[i_0_] = 0L;
	for (int i_1_ = 0; i_1_ < 32; i_1_++)
	    Class509.aLongArray6930[i_1_] = 0L;
	Class509.anInt6949 = 0;
    }
    
    static final void method5431(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class608.method7239(class229, class648, 1259646693);
    }
    
    static final void method5432(Class648 class648, byte i) {
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_2_, (byte) 95);
	Class226 class226 = Class380.aClass226Array3970[i_2_ >> 16];
	Class386.method4745(class229, class226, class648, -964248851);
    }
    
    static final void method5433(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2514
	    = Class181_Sub23.method8999(string, class648, (byte) -25);
	class229.aBool2483 = true;
    }
    
    static final void method5434(Class648 class648, int i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = ((Class648) class648).aClass308_8391.aStringArray3401[i_3_];
    }
    
    static final void method5435(Class648 class648, int i) {
	long l = Class249.method3417(2064222053);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) (l / 60000L);
    }
    
    static final void method5436(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (-1 == i_4_)
	    Class514.aClass528_Sub38_6967.method9556
		(Class514.aClass528_Sub38_6967.aClass691_Sub17_10586,
		 Class514.aClass528_Sub38_6967.aClass691_Sub17_10585
		     .method9955(1901899007),
		 186004065);
	else
	    Class514.aClass528_Sub38_6967.method9556((Class514
						      .aClass528_Sub38_6967
						      .aClass691_Sub17_10586),
						     i_4_, 577179887);
	Class541.method6620(1021323976);
    }
    
    static String method5437(long l) {
	return Class237.method3288(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz",
				   2142019630);
    }
    
    public static byte method5438(char c, int i) {
	byte i_5_;
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    i_5_ = (byte) c;
	else if (c == '\u20ac')
	    i_5_ = (byte) -128;
	else if (c == '\u201a')
	    i_5_ = (byte) -126;
	else if ('\u0192' == c)
	    i_5_ = (byte) -125;
	else if ('\u201e' == c)
	    i_5_ = (byte) -124;
	else if (c == '\u2026')
	    i_5_ = (byte) -123;
	else if ('\u2020' == c)
	    i_5_ = (byte) -122;
	else if ('\u2021' == c)
	    i_5_ = (byte) -121;
	else if (c == '\u02c6')
	    i_5_ = (byte) -120;
	else if ('\u2030' == c)
	    i_5_ = (byte) -119;
	else if (c == '\u0160')
	    i_5_ = (byte) -118;
	else if ('\u2039' == c)
	    i_5_ = (byte) -117;
	else if (c == '\u0152')
	    i_5_ = (byte) -116;
	else if ('\u017d' == c)
	    i_5_ = (byte) -114;
	else if ('\u2018' == c)
	    i_5_ = (byte) -111;
	else if ('\u2019' == c)
	    i_5_ = (byte) -110;
	else if (c == '\u201c')
	    i_5_ = (byte) -109;
	else if (c == '\u201d')
	    i_5_ = (byte) -108;
	else if (c == '\u2022')
	    i_5_ = (byte) -107;
	else if (c == '\u2013')
	    i_5_ = (byte) -106;
	else if (c == '\u2014')
	    i_5_ = (byte) -105;
	else if ('\u02dc' == c)
	    i_5_ = (byte) -104;
	else if (c == '\u2122')
	    i_5_ = (byte) -103;
	else if (c == '\u0161')
	    i_5_ = (byte) -102;
	else if (c == '\u203a')
	    i_5_ = (byte) -101;
	else if (c == '\u0153')
	    i_5_ = (byte) -100;
	else if (c == '\u017e')
	    i_5_ = (byte) -98;
	else if (c == '\u0178')
	    i_5_ = (byte) -97;
	else
	    i_5_ = (byte) 63;
	return i_5_;
    }
    
    public static final void method5439(String string, boolean bool, int i) {
	int i_6_ = client.aBool10914 ? 400 : 100;
	if (string != null) {
	    if (-1924608781 * client.anInt11024 >= i_6_)
		Class640.method7592
		    (4,
		     (client.aBool10914
		      ? Class39.aClass39_489.method807((Class378_Sub2
							.aClass668_10123),
						       (byte) 102)
		      : Class39.aClass39_490.method807((Class378_Sub2
							.aClass668_10123),
						       (byte) 102)),
		     (byte) 30);
	    else {
		String string_7_
		    = Class487.method5889(string, Class688.aClass77_8657,
					  (byte) -50);
		if (null != string_7_) {
		    for (int i_8_ = 0; i_8_ < client.anInt11024 * -1924608781;
			 i_8_++) {
			Class33 class33 = client.aClass33Array11164[i_8_];
			String string_9_
			    = Class487.method5889(class33.aString311,
						  Class688.aClass77_8657,
						  (byte) -110);
			if (null != string_9_ && string_9_.equals(string_7_)) {
			    Class640.method7592(4,
						new StringBuilder().append
						    (string).append
						    (Class39.aClass39_491
							 .method807
						     ((Class378_Sub2
						       .aClass668_10123),
						      (byte) 102))
						    .toString(),
						(byte) -33);
			    return;
			}
			if (class33.aString313 != null) {
			    String string_10_
				= Class487.method5889(class33.aString313,
						      Class688.aClass77_8657,
						      (byte) -28);
			    if (string_10_ != null
				&& string_10_.equals(string_7_)) {
				Class640.method7592(4,
						    new StringBuilder().append
							(string).append
							(Class39
							     .aClass39_491
							     .method807
							 ((Class378_Sub2
							   .aClass668_10123),
							  (byte) 102))
							.toString(),
						    (byte) 57);
				return;
			    }
			}
		    }
		    for (int i_11_ = 0;
			 i_11_ < -1314218023 * client.anInt11157; i_11_++) {
			Class62 class62 = client.aClass62Array11160[i_11_];
			String string_12_
			    = Class487.method5889(class62.aString720,
						  Class688.aClass77_8657,
						  (byte) -88);
			if (null != string_12_
			    && string_12_.equals(string_7_)) {
			    Class640.method7592
				(4, new StringBuilder().append
					(Class39.aClass39_365.method807
					 (Class378_Sub2.aClass668_10123,
					  (byte) 102))
					.append
					(string).append
					(Class39.aClass39_460.method807
					 (Class378_Sub2.aClass668_10123,
					  (byte) 102))
					.toString(), (byte) 76);
			    return;
			}
			if (class62.aString715 != null) {
			    String string_13_
				= Class487.method5889(class62.aString715,
						      Class688.aClass77_8657,
						      (byte) -99);
			    if (null != string_13_
				&& string_13_.equals(string_7_)) {
				Class640.method7592
				    (4, new StringBuilder().append
					    (Class39.aClass39_365.method807
					     (Class378_Sub2.aClass668_10123,
					      (byte) 102))
					    .append
					    (string).append
					    (Class39.aClass39_460.method807
					     (Class378_Sub2.aClass668_10123,
					      (byte) 102))
					    .toString(), (byte) -9);
				return;
			    }
			}
		    }
		    if (Class487.method5889
			    ((Class108.myPlayer
			      .displayUnfiltered),
			     Class688.aClass77_8657, (byte) -87)
			    .equals(string_7_))
			Class640.method7592(4, (Class39.aClass39_493.method807
						(Class378_Sub2.aClass668_10123,
						 (byte) 102)), (byte) -8);
		    else {
			Class109 class109 = Class591.method7078((byte) 124);
			Class528_Sub34 class528_sub34
			    = Class656.method7845(OutgoingOpcode.aClass403_4514,
						  class109.aClass10_1379,
						  -2055093219);
			class528_sub34.aClass528_Sub42_Sub2_10481.writeByte
			    (Class14.method627(string, 318589987) + 1,
			     (byte) -18);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeString(string, -1936289654);
			class528_sub34.aClass528_Sub42_Sub2_10481
			    .writeByte(bool ? 1 : 0, (byte) -44);
			class109.method1380(class528_sub34, 530915035);
		    }
		}
	    }
	}
    }
}
