/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class382
{
    Object anObject3975;
    int anInt3976;
    
    Class382(Object object, int i) {
	((Class382) this).anObject3975 = object;
	((Class382) this).anInt3976 = i * 516400787;
    }
    
    public static int method4724(byte i) {
	return 10;
    }
    
    static final void method4725(Class648 class648, short i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) -81);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.method10203(class229) ? 1 : 0;
    }
    
    static final void method4726(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class663.method7890(i_1_, i_2_, true, 10874079);
    }
    
    public static void method4727(byte i) {
	if (null != Class293.aClass292_3215)
	    Class293.aClass292_3215.method3915(16837905);
	if (null != Class482.aThread5470) {
	    for (;;) {
		try {
		    Class482.aThread5470.join();
		    break;
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
    
    static final void method4728(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= 1239022665;
    }
}
