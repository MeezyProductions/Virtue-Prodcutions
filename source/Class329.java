/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class329
{
    Class173_Sub1 aClass173_Sub1_3509;
    Interface22 anInterface22_3510;
    Class186 aClass186_3511 = new Class186(10485760, 256);
    
    Interface34 method4265(Class160 class160) {
	return method4266(class160, class160.anInt1774 * -726179659);
    }
    
    Interface34 method4266(Class160 class160, int i) {
	long l = (long) (i << 16 | class160.anInt1762 * 1586906309);
	Interface34 interface34
	    = (Interface34) ((Class329) this).aClass186_3511.method2727(l);
	if (interface34 != null)
	    return interface34;
	if (!method4267(class160, i))
	    return null;
	if (i == -1)
	    i = class160.anInt1774 * -726179659;
	Interface34 interface34_0_;
	if (!class160.aBool1777
	    || !((Class329) this).aClass173_Sub1_3509.method2271()) {
	    int[] is;
	    if (class160.aClass583_1771 != Class583.aClass583_7695
		|| !Class687.method8029(class160.aByte1790, 1753109338))
		is = (((Class329) this).anInterface22_3510.method127
		      (Class600.aClass600_7866,
		       class160.anInt1762 * 1586906309, 0.7F, i, i, false,
		       (byte) 9));
	    else
		is = (((Class329) this).anInterface22_3510.method117
		      (Class600.aClass600_7866,
		       class160.anInt1762 * 1586906309, 0.7F, i, i, true,
		       1614034301));
	    if (is == null)
		return null;
	    interface34_0_
		= ((Class329) this).aClass173_Sub1_3509.method8516(i, i, true,
								   is);
	} else {
	    float[] fs
		= (((Class329) this).anInterface22_3510.method119
		   (Class600.aClass600_7866, class160.anInt1762 * 1586906309,
		    0.7F, i, i, false, 542364180));
	    interface34_0_
		= ((Class329) this).aClass173_Sub1_3509
		      .method8575(Class149.aClass149_1676, i, i, true, fs);
	}
	interface34_0_.method220(class160.aByte1780 == 1,
				 class160.aByte1781 == 1);
	((Class329) this).aClass186_3511.method2730(interface34_0_, l, i * i,
						    -1226267209);
	return interface34_0_;
    }
    
    Class329(Class173_Sub1 class173_sub1, Interface22 interface22) {
	((Class329) this).aClass173_Sub1_3509 = class173_sub1;
	((Class329) this).anInterface22_3510 = interface22;
    }
    
    boolean method4267(Class160 class160, int i) {
	if (i == -1)
	    i = class160.anInt1774 * -726179659;
	if (!class160.aBool1777
	    || !((Class329) this).aClass173_Sub1_3509.method2271()) {
	    if (class160.aClass583_1771 != Class583.aClass583_7695
		|| !Class687.method8029(class160.aByte1790, 1013175469))
		return (((Class329) this).anInterface22_3510.method122
			(Class600.aClass600_7866,
			 class160.anInt1762 * 1586906309,
			 Class595.aClass595_7761, 0.7F, i, i, false,
			 (byte) 58));
	    return (((Class329) this).anInterface22_3510.method122
		    (Class600.aClass600_7866, class160.anInt1762 * 1586906309,
		     Class595.aClass595_7760, 0.7F, i, i, true, (byte) 70));
	}
	return (((Class329) this).anInterface22_3510.method122
		(Class600.aClass600_7866, class160.anInt1762 * 1586906309,
		 Class595.aClass595_7762, 0.7F, i, i, false, (byte) 87));
    }
    
    void method4268() {
	((Class329) this).aClass186_3511.method2747(5, -1437408817);
    }
    
    void method4269() {
	((Class329) this).aClass186_3511.method2731(-1187308858);
    }
    
    void method4270() {
	((Class329) this).aClass186_3511.method2747(5, 465739619);
    }
    
    void method4271() {
	((Class329) this).aClass186_3511.method2731(-1416336628);
    }
    
    void method4272() {
	((Class329) this).aClass186_3511.method2731(-2036742616);
    }
}
