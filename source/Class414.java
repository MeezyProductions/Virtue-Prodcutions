/* Class414 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Class414 implements Interface75
{
    Class446 aClass446_4731;
    Class446 aClass446_4732;
    Class186 aClass186_4733 = new Class186(20);
    Class186 aClass186_4734 = new Class186(20);
    Class173 aClass173_4735 = null;
    Class186 aClass186_4736;
    int[] anIntArray4737;
    Map aMap4738 = null;
    
    public void method4932(Interface50 interface50, int i) {
	((Class414) this).aMap4738
	    = new HashMap(((Class414) this).anIntArray4737.length);
	for (int i_0_ = 0; i_0_ < ((Class414) this).anIntArray4737.length;
	     i_0_++) {
	    int i_1_ = ((Class414) this).anIntArray4737[i_0_];
	    Class1 class1
		= Class392.method4800(((Class414) this).aClass446_4732, i_1_,
				      this, (byte) 53);
	    byte[] is
		= ((Class414) this).aClass446_4731.method5395(i_1_,
							      -1499572448);
	    Object object
		= interface50.method341(is, class1, true, 1849152569);
	    ((Class414) this).aMap4738.put(Integer.valueOf(i_0_),
					   new Class20(object, class1));
	}
    }
    
    public Class151[] method483(Class173 class173, int i) {
	if (null == ((Class414) this).aClass186_4736)
	    return null;
	if (null != class173) {
	    if (class173 != ((Class414) this).aClass173_4735)
		((Class414) this).aClass186_4736.method2731(-1384044895);
	    ((Class414) this).aClass173_4735 = class173;
	} else
	    class173 = ((Class414) this).aClass173_4735;
	if (class173 != null) {
	    Class151[] class151s
		= ((Class151[])
		   ((Class414) this).aClass186_4736.method2727((long) i));
	    if (class151s == null) {
		Class178[] class178s
		    = Class175.method2564(((Class414) this).aClass446_4731, i,
					  0);
		if (null != class178s && class178s.length > 0) {
		    class151s = new Class151[class178s.length];
		    for (int i_2_ = 0; i_2_ < class178s.length; i_2_++)
			class151s[i_2_]
			    = class173.method2334(class178s[i_2_], true);
		    ((Class414) this).aClass186_4736.method2729(class151s,
								(long) i);
		}
	    }
	    return class151s;
	}
	return null;
    }
    
    public int method4933() {
	if (null == ((Class414) this).anIntArray4737)
	    return 0;
	return 2 * ((Class414) this).anIntArray4737.length;
    }
    
    public int method4934(boolean bool, int i) {
	if (((Class414) this).anIntArray4737 == null)
	    return 0;
	if (!bool && ((Class414) this).aMap4738 != null)
	    return ((Class414) this).anIntArray4737.length * 2;
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < ((Class414) this).anIntArray4737.length;
	     i_4_++) {
	    int i_5_ = ((Class414) this).anIntArray4737[i_4_];
	    if (((Class414) this).aClass446_4731.method5357(i_5_,
							    (short) -7279))
		i_3_++;
	    if (((Class414) this).aClass446_4732.method5357(i_5_,
							    (short) -6226))
		i_3_++;
	}
	return i_3_;
    }
    
    public int method4935(int i) {
	if (null == ((Class414) this).anIntArray4737)
	    return 0;
	return 2 * ((Class414) this).anIntArray4737.length;
    }
    
    public Object method4936(Interface50 interface50, int i, boolean bool,
			     boolean bool_6_, byte i_7_) {
	if (i == -1)
	    return null;
	if (((Class414) this).anIntArray4737 != null) {
	    for (int i_8_ = 0; i_8_ < ((Class414) this).anIntArray4737.length;
		 i_8_++) {
		if (i == ((Class414) this).anIntArray4737[i_8_])
		    return (((Class20) ((Class414) this).aMap4738
					   .get(Integer.valueOf(i_8_)))
			    .anObject208);
	    }
	}
	Object object = ((Class414) this).aClass186_4733
			    .method2727((long) (i << 1 | (bool_6_ ? 1 : 0)));
	if (object != null)
	    return object;
	byte[] is
	    = ((Class414) this).aClass446_4731.method5395(i, -1545939583);
	if (is == null)
	    return null;
	Class1 class1 = method4938(interface50, i, bool, false, (byte) 8);
	if (null == class1)
	    return null;
	object = interface50.method341(is, class1, bool_6_, 1451151863);
	((Class414) this).aClass186_4733
	    .method2729(object, (long) (i << 1 | (bool_6_ ? 1 : 0)));
	return object;
    }
    
    public Class1 method4937(Interface50 interface50, int i, int i_9_) {
	return method4938(interface50, i, true, true, (byte) 8);
    }
    
    Class1 method4938(Interface50 interface50, int i, boolean bool,
		      boolean bool_10_, byte i_11_) {
	if (-1 == i)
	    return null;
	if (null != ((Class414) this).anIntArray4737) {
	    for (int i_12_ = 0;
		 i_12_ < ((Class414) this).anIntArray4737.length; i_12_++) {
		if (i == ((Class414) this).anIntArray4737[i_12_])
		    return ((Class1)
			    (((Class20) ((Class414) this).aMap4738
					    .get(Integer.valueOf(i_12_)))
			     .anObject209));
	    }
	}
	if (bool_10_)
	    ((Class414) this).aClass446_4731.method5357(i, (short) -22133);
	Class1 class1
	    = (Class1) ((Class414) this).aClass186_4734.method2727((long) i);
	if (class1 != null)
	    return class1;
	class1 = Class392.method4800(((Class414) this).aClass446_4732, i, this,
				     (byte) 122);
	if (class1 == null)
	    return null;
	if (bool)
	    ((Class414) this).aClass186_4734.method2729(class1, (long) i);
	return class1;
    }
    
    public int method4939() {
	if (null == ((Class414) this).anIntArray4737)
	    return 0;
	return 2 * ((Class414) this).anIntArray4737.length;
    }
    
    public void method4940(int i) {
	((Class414) this).aClass186_4734.method2735(-177808688);
	((Class414) this).aClass186_4733.method2735(265915415);
	if (null != ((Class414) this).aClass186_4736)
	    ((Class414) this).aClass186_4736.method2735(-602017333);
    }
    
    public int method4941() {
	return method4934(false, 489345571);
    }
    
    public int method484(int i, int i_13_) {
	Class151[] class151s
	    = method482(((Class414) this).aClass173_4735, i, 1812969592);
	if (null != class151s)
	    return class151s[0].method40();
	return 0;
    }
    
    public int method4942(byte i) {
	return method4934(false, 832178707);
    }
    
    public Class414(Class173 class173, Class446 class446,
		    Class446 class446_14_, int[] is) {
	((Class414) this).aClass173_4735 = class173;
	((Class414) this).aClass446_4731 = class446;
	((Class414) this).aClass446_4732 = class446_14_;
	((Class414) this).anIntArray4737 = is;
	((Class414) this).aClass186_4736 = new Class186(20);
    }
    
    public void method4943() {
	((Class414) this).aMap4738 = null;
    }
    
    public Class151[] method482(Class173 class173, int i, int i_15_) {
	if (null == ((Class414) this).aClass186_4736)
	    return null;
	if (null != class173) {
	    if (class173 != ((Class414) this).aClass173_4735)
		((Class414) this).aClass186_4736.method2731(-1765858170);
	    ((Class414) this).aClass173_4735 = class173;
	} else
	    class173 = ((Class414) this).aClass173_4735;
	if (class173 != null) {
	    Class151[] class151s
		= ((Class151[])
		   ((Class414) this).aClass186_4736.method2727((long) i));
	    if (class151s == null) {
		Class178[] class178s
		    = Class175.method2564(((Class414) this).aClass446_4731, i,
					  0);
		if (null != class178s && class178s.length > 0) {
		    class151s = new Class151[class178s.length];
		    for (int i_16_ = 0; i_16_ < class178s.length; i_16_++)
			class151s[i_16_]
			    = class173.method2334(class178s[i_16_], true);
		    ((Class414) this).aClass186_4736.method2729(class151s,
								(long) i);
		}
	    }
	    return class151s;
	}
	return null;
    }
    
    public int method488(int i) {
	Class151[] class151s
	    = method482(((Class414) this).aClass173_4735, i, 1110036898);
	if (null != class151s)
	    return class151s[0].method40();
	return 0;
    }
    
    public void method4944(int i) {
	((Class414) this).aClass186_4734.method2731(-1534693739);
	((Class414) this).aClass186_4733.method2731(-1334225667);
	if (null != ((Class414) this).aClass186_4736)
	    ((Class414) this).aClass186_4736.method2731(-2130202496);
    }
    
    public int method4945() {
	return method4934(false, 295201355);
    }
    
    public int method4946() {
	return method4934(false, 288758837);
    }
    
    public int method4947() {
	if (null == ((Class414) this).anIntArray4737)
	    return 0;
	return 2 * ((Class414) this).anIntArray4737.length;
    }
    
    public void method4948() {
	((Class414) this).aClass186_4734.method2735(1219847661);
	((Class414) this).aClass186_4733.method2735(-130958529);
	if (null != ((Class414) this).aClass186_4736)
	    ((Class414) this).aClass186_4736.method2735(-637298729);
    }
    
    public void method4949(int i) {
	((Class414) this).aClass186_4734.method2747(i, 932703617);
	((Class414) this).aClass186_4733.method2747(i, -2105735059);
	if (null != ((Class414) this).aClass186_4736)
	    ((Class414) this).aClass186_4736.method2747(i, -1559409735);
    }
    
    public void method4950(int i) {
	((Class414) this).aClass186_4734.method2747(i, -840106435);
	((Class414) this).aClass186_4733.method2747(i, -526141511);
	if (null != ((Class414) this).aClass186_4736)
	    ((Class414) this).aClass186_4736.method2747(i, -2003969072);
    }
    
    public void method4951() {
	((Class414) this).aClass186_4734.method2731(-1295314738);
	((Class414) this).aClass186_4733.method2731(-1588681952);
	if (null != ((Class414) this).aClass186_4736)
	    ((Class414) this).aClass186_4736.method2731(-1391474556);
    }
    
    public void method4952(int i) {
	((Class414) this).aMap4738 = null;
    }
    
    public void method4953() {
	((Class414) this).aMap4738 = null;
    }
    
    public int method487(int i) {
	Class151[] class151s
	    = method482(((Class414) this).aClass173_4735, i, 2091363177);
	if (null != class151s)
	    return class151s[0].method40();
	return 0;
    }
    
    public void method4954() {
	((Class414) this).aClass186_4734.method2735(1410847020);
	((Class414) this).aClass186_4733.method2735(-1125498349);
	if (null != ((Class414) this).aClass186_4736)
	    ((Class414) this).aClass186_4736.method2735(-32779150);
    }
    
    public void method4955() {
	((Class414) this).aMap4738 = null;
    }
    
    public Class151[] method485(Class173 class173, int i) {
	if (null == ((Class414) this).aClass186_4736)
	    return null;
	if (null != class173) {
	    if (class173 != ((Class414) this).aClass173_4735)
		((Class414) this).aClass186_4736.method2731(-1600900971);
	    ((Class414) this).aClass173_4735 = class173;
	} else
	    class173 = ((Class414) this).aClass173_4735;
	if (class173 != null) {
	    Class151[] class151s
		= ((Class151[])
		   ((Class414) this).aClass186_4736.method2727((long) i));
	    if (class151s == null) {
		Class178[] class178s
		    = Class175.method2564(((Class414) this).aClass446_4731, i,
					  0);
		if (null != class178s && class178s.length > 0) {
		    class151s = new Class151[class178s.length];
		    for (int i_17_ = 0; i_17_ < class178s.length; i_17_++)
			class151s[i_17_]
			    = class173.method2334(class178s[i_17_], true);
		    ((Class414) this).aClass186_4736.method2729(class151s,
								(long) i);
		}
	    }
	    return class151s;
	}
	return null;
    }
    
    public Class151[] method481(Class173 class173, int i) {
	if (null == ((Class414) this).aClass186_4736)
	    return null;
	if (null != class173) {
	    if (class173 != ((Class414) this).aClass173_4735)
		((Class414) this).aClass186_4736.method2731(-1394349602);
	    ((Class414) this).aClass173_4735 = class173;
	} else
	    class173 = ((Class414) this).aClass173_4735;
	if (class173 != null) {
	    Class151[] class151s
		= ((Class151[])
		   ((Class414) this).aClass186_4736.method2727((long) i));
	    if (class151s == null) {
		Class178[] class178s
		    = Class175.method2564(((Class414) this).aClass446_4731, i,
					  0);
		if (null != class178s && class178s.length > 0) {
		    class151s = new Class151[class178s.length];
		    for (int i_18_ = 0; i_18_ < class178s.length; i_18_++)
			class151s[i_18_]
			    = class173.method2334(class178s[i_18_], true);
		    ((Class414) this).aClass186_4736.method2729(class151s,
								(long) i);
		}
	    }
	    return class151s;
	}
	return null;
    }
    
    public Class151[] method486(Class173 class173, int i) {
	if (null == ((Class414) this).aClass186_4736)
	    return null;
	if (null != class173) {
	    if (class173 != ((Class414) this).aClass173_4735)
		((Class414) this).aClass186_4736.method2731(-917219275);
	    ((Class414) this).aClass173_4735 = class173;
	} else
	    class173 = ((Class414) this).aClass173_4735;
	if (class173 != null) {
	    Class151[] class151s
		= ((Class151[])
		   ((Class414) this).aClass186_4736.method2727((long) i));
	    if (class151s == null) {
		Class178[] class178s
		    = Class175.method2564(((Class414) this).aClass446_4731, i,
					  0);
		if (null != class178s && class178s.length > 0) {
		    class151s = new Class151[class178s.length];
		    for (int i_19_ = 0; i_19_ < class178s.length; i_19_++)
			class151s[i_19_]
			    = class173.method2334(class178s[i_19_], true);
		    ((Class414) this).aClass186_4736.method2729(class151s,
								(long) i);
		}
	    }
	    return class151s;
	}
	return null;
    }
    
    public void method4956(int i, int i_20_) {
	((Class414) this).aClass186_4734.method2747(i, -1877816939);
	((Class414) this).aClass186_4733.method2747(i, -1432000254);
	if (null != ((Class414) this).aClass186_4736)
	    ((Class414) this).aClass186_4736.method2747(i, -1487376136);
    }
    
    static final void method4957(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 1182830015 * Class623.anInt8119;
    }
    
    static final void method4958(Class648 class648, int i) {
	Class528_Sub28.method9467((((Class648) class648).anIntArray8394
				   [(((Class648) class648).anInt8395
				     -= 1239022665) * 717927929]),
				  (short) -12259);
    }
    
    public static String method4959(long l, int i, boolean bool, short i_21_) {
	Calendar calendar;
	if (bool) {
	    Class528_Sub36.method9536(l);
	    calendar = Class38.aCalendar340;
	} else {
	    Class482.method5864(l);
	    calendar = Class38.aCalendar339;
	}
	int i_22_ = calendar.get(5);
	int i_23_ = calendar.get(2);
	int i_24_ = calendar.get(1);
	int i_25_ = calendar.get(11);
	int i_26_ = calendar.get(12);
	if (3 == i)
	    return Class399.method4830(l, i, bool, 1281669227);
	return new StringBuilder().append(Integer.toString(i_22_ / 10)).append
		   (i_22_ % 10).append
		   ("-").append
		   (Class38.aStringArrayArray338[i][i_23_]).append
		   ("-").append
		   (i_24_).append
		   (" ").append
		   (i_25_ / 10).append
		   (i_25_ % 10).append
		   (":").append
		   (i_26_ / 10).append
		   (i_26_ % 10).toString();
    }
    
    static final int method4960(Class77 class77, int i) {
	if (class77 == null)
	    return 12;
	switch (113261371 * ((Class77) class77).anInt805) {
	case 5:
	    return 20;
	default:
	    return 12;
	}
    }
}
