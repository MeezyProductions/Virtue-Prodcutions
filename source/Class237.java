/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class237
{
    static HashMap aHashMap2597 = new HashMap();
    public static final long aLong2598 = 60000L;
    public static final long aLong2599 = 1000L;
    static Map aMap2600;
    public static Class95_Sub1_Sub1 aClass95_Sub1_Sub1_2601;
    
    static TimeZone method3287(int i) {
	return method3290("Europe/London", (byte) 1);
    }
    
    public static String method3288(Date date, String string, int i) {
	return method3289(date, string, method3287(-273800853),
			  Class668.aClass668_8495, (byte) -90);
    }
    
    static String method3289(Date date, String string, TimeZone timezone,
			     Class668 class668, byte i) {
	if (null == aMap2600) {
	    aMap2600 = new HashMap(7);
	    Class668[] class668s = Class668.method7918(94859930);
	    for (int i_0_ = 0; i_0_ < class668s.length; i_0_++) {
		Class668 class668_1_ = class668s[i_0_];
		aMap2600.put(class668_1_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap2600.get(class668);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class668.method7921(-908970920));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_2_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_2_;
    }
    
    static {
	Calendar.getInstance(method3290("Europe/London", (byte) 1));
    }
    
    Class237() throws Throwable {
	throw new Error();
    }
    
    static TimeZone method3290(String string, byte i) {
	synchronized (aHashMap2597) {
	    TimeZone timezone = (TimeZone) aHashMap2597.get(string);
	    if (null == timezone) {
		timezone = TimeZone.getTimeZone(string);
		aHashMap2597.put(string, timezone);
	    }
	    TimeZone timezone_3_ = timezone;
	    return timezone_3_;
	}
    }
    
    static final void method3291(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1027873541 * class229.anInt2522;
    }
    
    static final void method3292(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2552
	    = Class181_Sub23.method8999(string, class648, (byte) -41);
	class229.aBool2483 = true;
    }
    
    public static int[][] method3293(int i, int i_4_, int i_5_, int i_6_,
				     int i_7_, int i_8_, float f, boolean bool,
				     int i_9_) {
	int[][] is = new int[i_4_][i];
	Class528_Sub41_Sub1 class528_sub41_sub1 = new Class528_Sub41_Sub1();
	((Class528_Sub41_Sub1) class528_sub41_sub1).aBool11741 = bool;
	((Class528_Sub41_Sub1) class528_sub41_sub1).anInt11737
	    = 312094341 * i_6_;
	((Class528_Sub41_Sub1) class528_sub41_sub1).anInt11738
	    = i_7_ * -1077570331;
	((Class528_Sub41_Sub1) class528_sub41_sub1).anInt11739
	    = i_8_ * 678079845;
	((Class528_Sub41_Sub1) class528_sub41_sub1).anInt11740
	    = (int) (4096.0F * f) * -1023698515;
	class528_sub41_sub1.method10650(-1087215923);
	Class66.method1063(i, i_4_, (byte) 74);
	for (int i_10_ = 0; i_10_ < i_4_; i_10_++)
	    class528_sub41_sub1.method10652(i_10_, is[i_10_], (byte) -19);
	return is;
    }
}
