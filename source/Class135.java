/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class135
{
    Class186 aClass186_1622 = new Class186(10485760, 256);
    Class173_Sub2 aClass173_Sub2_1623;
    Interface22 anInterface22_1624;
    
    void method1640() {
	((Class135) this).aClass186_1622.method2747(5, -2108101645);
    }
    
    Class120_Sub4 method1641(Class160 class160) {
	return method1642(class160, class160.anInt1774 * -726179659);
    }
    
    Class120_Sub4 method1642(Class160 class160, int i) {
	Class120_Sub4 class120_sub4
	    = ((Class120_Sub4)
	       ((Class135) this).aClass186_1622
		   .method2727((long) (class160.anInt1762 * 1586906309)));
	if (class120_sub4 != null)
	    return class120_sub4;
	if (!method1644(Class600.aClass600_7866, class160, i))
	    return null;
	if (i == -1)
	    i = class160.anInt1774 * -726179659;
	Class120_Sub4 class120_sub4_0_;
	if (!class160.aBool1777
	    || !((Class135) this).aClass173_Sub2_1623.method2271()) {
	    int[] is;
	    if (class160.aClass583_1771 != Class583.aClass583_7695
		|| !Class687.method8029(class160.aByte1790, 1926578191))
		is = (((Class135) this).anInterface22_1624.method127
		      (Class600.aClass600_7866,
		       class160.anInt1762 * 1586906309, 0.7F, i, i, false,
		       (byte) 9));
	    else
		is = (((Class135) this).anInterface22_1624.method117
		      (Class600.aClass600_7866,
		       class160.anInt1762 * 1586906309, 0.7F, i, i, true,
		       1703483514));
	    class120_sub4_0_
		= new Class120_Sub4(((Class135) this).aClass173_Sub2_1623,
				    3553, i, i, class160.aByte1757 != 0, is, 0,
				    0, false);
	} else {
	    float[] fs
		= (((Class135) this).anInterface22_1624.method119
		   (Class600.aClass600_7866, class160.anInt1762 * 1586906309,
		    0.7F, i, i, false, -1949893347));
	    class120_sub4_0_
		= new Class120_Sub4(((Class135) this).aClass173_Sub2_1623,
				    3553, Class149.aClass149_1676,
				    Class169.aClass169_1939, i, i,
				    class160.aByte1757 != 0, fs,
				    Class149.aClass149_1676);
	}
	class120_sub4_0_.method8259(class160.aByte1780 == 1,
				    class160.aByte1781 == 1);
	((Class135) this).aClass186_1622.method2730(class120_sub4_0_,
						    (long) (class160.anInt1762
							    * 1586906309),
						    i * i, -1226267209);
	return class120_sub4_0_;
    }
    
    void method1643() {
	((Class135) this).aClass186_1622.method2731(-1818643583);
    }
    
    boolean method1644(Class600 class600, Class160 class160, int i) {
	if (i == -1)
	    i = class160.anInt1774 * -726179659;
	if (!class160.aBool1777
	    || !((Class135) this).aClass173_Sub2_1623.method2271()) {
	    if (class160.aClass583_1771 != Class583.aClass583_7695
		|| !Class687.method8029(class160.aByte1790, 1525692429))
		return (((Class135) this).anInterface22_1624.method122
			(class600, class160.anInt1762 * 1586906309,
			 Class595.aClass595_7761, 0.7F, i, i, false,
			 (byte) 114));
	    return (((Class135) this).anInterface22_1624.method122
		    (class600, class160.anInt1762 * 1586906309,
		     Class595.aClass595_7760, 0.7F, i, i, true, (byte) 42));
	}
	return (((Class135) this).anInterface22_1624.method122
		(class600, class160.anInt1762 * 1586906309,
		 Class595.aClass595_7762, 0.7F, i, i, false, (byte) 62));
    }
    
    void method1645() {
	((Class135) this).aClass186_1622.method2747(5, 259033314);
    }
    
    void method1646() {
	((Class135) this).aClass186_1622.method2747(5, -1558452628);
    }
    
    Class135(Class173_Sub2 class173_sub2, Interface22 interface22) {
	((Class135) this).aClass173_Sub2_1623 = class173_sub2;
	((Class135) this).anInterface22_1624 = interface22;
    }
    
    void method1647() {
	((Class135) this).aClass186_1622.method2731(-1636567710);
    }
    
    void method1648() {
	((Class135) this).aClass186_1622.method2731(-1395672785);
    }
}
