/* Class399 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class Class399
{
    static final int anInt4416 = 5;
    static final int anInt4417 = 9;
    static final int anInt4418 = 11;
    static final int anInt4419 = 2;
    static final int anInt4420 = 6;
    static final int anInt4421 = 7;
    static final int anInt4422 = 10;
    static final int anInt4423 = 13;
    static final int anInt4424 = 12;
    static final int anInt4425 = 8;
    static final int anInt4426 = 3;
    static final int anInt4427 = 4;
    static final int anInt4428 = 1;
    
    Class399() throws Throwable {
	throw new Error();
    }
    
    static final void method4829(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= 1900146029;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [2 + 717927929 * ((Class648) class648).anInt8395]);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [3 + ((Class648) class648).anInt8395 * 717927929]);
	int i_4_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 4]);
	if (-1 == i_2_)
	    throw new RuntimeException();
	Class7 class7
	    = (Class7) Class551.aClass5_Sub17_7422.method63(i_2_, 980465006);
	if (class7.aClass459_131.method68() != i_1_)
	    throw new RuntimeException();
	if (class7.aClass459_129.method68() != i_0_)
	    throw new RuntimeException();
	int[] is = class7.method548(Integer.valueOf(i_3_), (byte) -61);
	if (i_4_ < 0 || null == is || is.length <= i_4_)
	    throw new RuntimeException();
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = is[i_4_];
    }
    
    static String method4830(long l, int i, boolean bool, int i_5_) {
	Calendar calendar;
	if (bool) {
	    Class528_Sub36.method9536(l);
	    calendar = Class38.aCalendar340;
	} else {
	    Class482.method5864(l);
	    calendar = Class38.aCalendar339;
	}
	int i_6_ = calendar.get(5);
	int i_7_ = calendar.get(2) + 1;
	int i_8_ = calendar.get(1);
	int i_9_ = calendar.get(11);
	int i_10_ = calendar.get(12);
	return new StringBuilder().append(Integer.toString(i_6_ / 10)).append
		   (i_6_ % 10).append
		   ("/").append
		   (i_7_ / 10).append
		   (i_7_ % 10).append
		   ("/").append
		   (i_8_ % 100 / 10).append
		   (i_8_ % 10).append
		   (" ").append
		   (i_9_ / 10).append
		   (i_9_ % 10).append
		   (":").append
		   (i_10_ / 10).append
		   (i_10_ % 10).toString();
    }
    
    public static void method4831(int i) {
	if (IcmpService_Sub1.anIcmpService_Sub1_10611 != null) {
	    try {
		IcmpService_Sub1.anIcmpService_Sub1_10611.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    IcmpService_Sub1.anIcmpService_Sub1_10611 = null;
	}
    }
}
