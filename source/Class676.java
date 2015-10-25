/* Class676 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class676
{
    public static int anInt8551;
    
    Class676() throws Throwable {
	throw new Error();
    }
    
    static final int method7948(int i, int i_0_, int i_1_) {
	int i_2_
	    = (Class164.method2091(i + 45365, 91923 + i_0_, 4, (byte) 0) - 128
	       + ((Class164.method2091(10294 + i, 37821 + i_0_, 2, (byte) 0)
		   - 128)
		  >> 1)
	       + (Class164.method2091(i, i_0_, 1, (byte) 0) - 128 >> 2));
	i_2_ = 35 + (int) (0.3 * (double) i_2_);
	if (i_2_ < 10)
	    i_2_ = 10;
	else if (i_2_ > 60)
	    i_2_ = 60;
	return i_2_;
    }
    
    static final void method7949(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class493.aString5525.startsWith("mac") ? 1 : 0;
    }
}
