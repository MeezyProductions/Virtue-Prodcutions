/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class523
{
    static Class524 aClass524_7052;
    static final int anInt7053 = 5;
    
    Class523() throws Throwable {
	throw new Error();
    }
    
    static {
	new Class520();
	aClass524_7052 = new Class524();
    }
    
    static final void method6365(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	boolean bool = 1 == (((Class648) class648).anIntArray8394
			     [((Class648) class648).anInt8395 * 717927929]);
	int i_0_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 5);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class560.method6817(class229, class226, class648,
			    (bool ? Class227.aClass227_2343
			     : Class227.aClass227_2340),
			    (byte) 77);
    }
    
    static final void method6366(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2540
	    = Class181_Sub23.method8999(string, class648, (byte) -56);
	class229.aBool2483 = true;
    }
    
    static final void method6367(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	Class232_Sub1.method8993(string, -2020035422);
    }
    
    static final void method6368(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class528_Sub21_Sub6 class528_sub21_sub6
	    = Class196.aClass447_2200.method5401(i_1_, -438432000);
	if (class528_sub21_sub6.anIntArray11541 == null)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= class528_sub21_sub6.anIntArray11541.length;
    }
    
    static Class696[] method6369(byte i) {
	return (new Class696[]
		{ Class696.aClass696_8711, Class696.aClass696_8713,
		  Class696.aClass696_8710, Class696.aClass696_8709,
		  Class696.aClass696_8712 });
    }
    
    public static int[] method6370(int i, byte i_2_) {
	int[] is = new int[3];
	Class482.method5864(Class586.method7012(i, 1684450290));
	is[0] = Class38.aCalendar339.get(5);
	is[1] = Class38.aCalendar339.get(2);
	is[2] = Class38.aCalendar339.get(1);
	return is;
    }
    
    static String method6371(byte[] is, int i, int i_3_, byte i_4_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_5_ = i; i_5_ < i + i_3_; i_5_ += 3) {
	    int i_6_ = is[i_5_] & 0xff;
	    stringbuilder.append(Class677.aCharArray8552[i_6_ >>> 2]);
	    if (i_5_ < i_3_ - 1) {
		int i_7_ = is[1 + i_5_] & 0xff;
		stringbuilder.append(Class677.aCharArray8552
				     [(i_6_ & 0x3) << 4 | i_7_ >>> 4]);
		if (i_5_ < i_3_ - 2) {
		    int i_8_ = is[i_5_ + 2] & 0xff;
		    stringbuilder.append
			(Class677.aCharArray8552
			 [(i_7_ & 0xf) << 2 | i_8_ >>> 6])
			.append(Class677.aCharArray8552[i_8_ & 0x3f]);
		} else
		    stringbuilder.append
			(Class677.aCharArray8552[(i_7_ & 0xf) << 2])
			.append('=');
	    } else
		stringbuilder.append
		    (Class677.aCharArray8552[(i_6_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
    
    static final void method6372(Class648 class648, int i) {
	int i_9_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_9_, (byte) 65);
	Class226 class226 = Class380.aClass226Array3970[i_9_ >> 16];
	Class643.method7660(class229, class226, class648, (byte) -54);
    }
    
    static String method6373(Class528_Sub21_Sub5 class528_sub21_sub5, int i) {
	return new StringBuilder().append
		   (((Class528_Sub21_Sub5) class528_sub21_sub5).aString11536)
		   .append
		   (Class666.method7905(16777215, (short) 32194)).append
		   (" >").toString();
    }
}
