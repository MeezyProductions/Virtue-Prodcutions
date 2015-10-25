/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Class38
{
    static String[][] aStringArrayArray338
	= { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
	      "Oct", "Nov", "Dec" },
	    { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug",
	      "Sep", "Okt", "Nov", "Dez" },
	    { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil",
	      "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" },
	    { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set",
	      "out", "nov", "dez" },
	    { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep",
	      "okt", "nov", "dec" },
	    { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
	      "Oct", "Nov", "Dec" },
	    { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep",
	      "oct", "nov", "dic" } };
    static Calendar aCalendar339 = Calendar.getInstance();
    static Calendar aCalendar340
	= Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    
    static void method803(long l) {
	aCalendar340.setTime(new Date(l));
    }
    
    Class38() throws Throwable {
	throw new Error();
    }
    
    static final void method804(Class648 class648, short i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 1835803215 * class229.anInt2377;
    }
    
    public static void method805(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 int i_4_, String string, int i_5_) {
	Class511_Sub6 class511_sub6 = new Class511_Sub6();
	((Class511_Sub6) class511_sub6).anInt10304 = -1558423107 * i;
	((Class511_Sub6) class511_sub6).anInt10310 = i_0_ * 288536161;
	((Class511_Sub6) class511_sub6).anInt10306 = i_1_ * -1202803529;
	((Class511_Sub6) class511_sub6).anInt10308
	    = (i_3_ + client.anInt11127) * -535162549;
	((Class511_Sub6) class511_sub6).anInt10307 = -208905829 * i_2_;
	((Class511_Sub6) class511_sub6).aString10305 = string;
	((Class511_Sub6) class511_sub6).anInt10309 = 1687311675 * i_4_;
	client.aClass695_11045.method8175(class511_sub6, (byte) 41);
    }
}
