/* Class379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class379
{
    public static Class379 aClass379_3954;
    public static Class379 aClass379_3955 = new Class379(1);
    public static Class379 aClass379_3956;
    public int anInt3957;
    public static Class379 aClass379_3958;
    public static Class379 aClass379_3959;
    public static Class379 aClass379_3960;
    public static Class379 aClass379_3961;
    public static Class379 aClass379_3962;
    public static Class379 aClass379_3963;
    public static Class379 aClass379_3964;
    public static Class379 aClass379_3965 = new Class379(2);
    public static Class5_Sub4 aClass5_Sub4_3966;
    public static int anInt3967;
    
    Class379(int i) {
	anInt3957 = i * -799197107;
    }
    
    static {
	aClass379_3956 = new Class379(2);
	aClass379_3962 = new Class379(2);
	aClass379_3958 = new Class379(1);
	aClass379_3960 = new Class379(1);
	aClass379_3954 = new Class379(1);
	aClass379_3961 = new Class379(2);
	aClass379_3959 = new Class379(1);
	aClass379_3963 = new Class379(2);
	aClass379_3964 = new Class379(1);
    }
    
    public static int method4712(int i, int i_0_, int i_1_, byte i_2_) {
	i_1_ &= 0x3;
	if (i_1_ == 0)
	    return i;
	if (i_1_ == 1)
	    return i_0_;
	if (i_1_ == 2)
	    return 7 - i;
	return 7 - i_0_;
    }
    
    static final void method4713(Class648 class648, byte i) {
	String string;
	if (null != Class108.myPlayer
	    && (Class108.myPlayer.displayFiltered
		!= null))
	    string = Class108.myPlayer
			 .method10929(true, (short) -436);
	else
	    string = "";
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = string;
    }
    
    static final void method4714(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub7_10589
		  .method9874((short) -14591) ? 1 : 0;
    }
    
    static final void method4715(Class648 class648, int i) {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub13_10587
		  .method8126(i_3_, -1955030095);
    }
    
    static final void method4716(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	Class79 class79
	    = (Class79) Class208.aClass5_Sub10_2239.method63(i_4_, -915421390);
	if (!class79.aString811.equals(string))
	    class229.method3228(i_4_, string, 689733046);
	else
	    class229.method3223(i_4_, -711774313);
    }
}
