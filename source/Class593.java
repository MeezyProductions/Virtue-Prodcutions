/* Class593 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class593 implements IClientEnum
{
    static Class593 aClass593_7749;
    static Class593 aClass593_7750;
    static Class593 aClass593_7751 = new Class593(0);
    static Class593 aClass593_7752;
    static Class593 aClass593_7753;
    static Class593 aClass593_7754;
    int anInt7755;
    
    public int method6() {
	return ((Class593) this).anInt7755 * 178611281;
    }
    
    public int method71() {
	return ((Class593) this).anInt7755 * 178611281;
    }
    
    public int method68() {
	return ((Class593) this).anInt7755 * 178611281;
    }
    
    public int method5() {
	return ((Class593) this).anInt7755 * 178611281;
    }
    
    static {
	aClass593_7750 = new Class593(1);
	aClass593_7749 = new Class593(2);
	aClass593_7752 = new Class593(3);
	aClass593_7753 = new Class593(4);
	aClass593_7754 = new Class593(5);
    }
    
    public int method72() {
	return ((Class593) this).anInt7755 * 178611281;
    }
    
    Class593(int i) {
	((Class593) this).anInt7755 = i * -241802063;
    }
    
    public int method73() {
	return ((Class593) this).anInt7755 * 178611281;
    }
    
    static final void method7082(Class648 class648, byte i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = ((Class648) class648).aClass308_8391.anIntArray3387[i_0_];
    }
    
    static final void method7083(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_1_ % i_2_;
    }
    
    public static String method7084(byte[] is, int i, int i_3_, byte i_4_) {
	char[] cs = new char[i_3_];
	int i_5_ = 0;
	for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
	    int i_7_ = is[i + i_6_] & 0xff;
	    if (0 != i_7_) {
		if (i_7_ >= 128 && i_7_ < 160) {
		    int i_8_ = Class662.aCharArray8451[i_7_ - 128];
		    if (i_8_ == 0)
			i_8_ = 63;
		    i_7_ = i_8_;
		}
		cs[i_5_++] = (char) i_7_;
	    }
	}
	return new String(cs, 0, i_5_);
    }
    
    static final void method7085(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.aBool2538
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	Class39.method811(class229, 1435904523);
	if (-1 == class229.anInt2377 * 1835803215 && !class226.aBool2335)
	    Class571.method6859(class229.anInt2376 * 306930455, 2039742490);
    }
    
    static Class246[] method7086(int i) {
	return (new Class246[]
		{ Class246.aClass246_2746, Class246.aClass246_2756,
		  Class246.aClass246_2761, Class246.aClass246_2748,
		  Class246.aClass246_2755, Class246.aClass246_2765,
		  Class246.aClass246_2749, Class246.aClass246_2759,
		  Class246.aClass246_2752, Class246.aClass246_2754,
		  Class246.aClass246_2763, Class246.aClass246_2758,
		  Class246.aClass246_2753, Class246.aClass246_2757,
		  Class246.aClass246_2751, Class246.aClass246_2760,
		  Class246.aClass246_2747, Class246.aClass246_2762 });
    }
}
