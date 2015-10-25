/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class226
{
    public boolean aBool2335;
    public Class229[] aClass229Array2336;
    Class229[] aClass229Array2337;
    public static int anInt2338;
    
    public Class229[] method3175(int i) {
	return (((Class226) this).aClass229Array2337 == null
		? aClass229Array2336 : ((Class226) this).aClass229Array2337);
    }
    
    Class226(boolean bool, Class229[] class229s) {
	aClass229Array2336 = class229s;
	aBool2335 = bool;
    }
    
    public Class229[] method3176(int i) {
	if (((Class226) this).aClass229Array2337 == null) {
	    int i_0_ = aClass229Array2336.length;
	    ((Class226) this).aClass229Array2337 = new Class229[i_0_];
	    System.arraycopy(aClass229Array2336, 0,
			     ((Class226) this).aClass229Array2337, 0,
			     aClass229Array2336.length);
	}
	return ((Class226) this).aClass229Array2337;
    }
    
    public Class229 method3177(int i, byte i_1_) {
	if (306930455 * aClass229Array2336[0].anInt2376 >>> 16 != i >>> 16)
	    throw new IllegalArgumentException();
	return aClass229Array2336[i & 0xffff];
    }
    
    static void method3178(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	if (Class654.aBool8430) {
	    Class615.method7354(0 != (((Class648) class648).anIntArray8394
				      [(((Class648) class648).anInt8395
					* 717927929)]),
				1002859421);
	    Class57.method984((((Class648) class648).anIntArray8394
			       [(((Class648) class648).anInt8395 * 717927929
				 + 1)]) != 0,
			      -817546365);
	    Class203.method2864(0 != (((Class648) class648).anIntArray8394
				      [2 + (((Class648) class648).anInt8395
					    * 717927929)]),
				(short) 20017);
	}
    }
    
    static final void method3179(Class648 class648, byte i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = string.toLowerCase();
    }
    
    static final void method3180(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_2_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [1 + ((Class648) class648).anInt8395 * 717927929]);
	int i_4_ = (((Class648) class648).anIntArray8394
		    [2 + ((Class648) class648).anInt8395 * 717927929]);
	Class171.method2115(i_4_, Class230.method3236(i_2_, i_3_, 1676999262),
			    class648, -1318920204);
    }
}
