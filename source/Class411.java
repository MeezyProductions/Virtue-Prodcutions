/* Class411 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class411
{
    public int anInt4711;
    public Object anObject4712;
    public static int anInt4713;
    
    public Class411(int i, Object object) {
	anInt4711 = i * 1965816621;
	anObject4712 = object;
    }
    
    public Class411(int i) {
	anInt4711 = 1965816621 * i;
    }
    
    public boolean equals(Object object) {
	if (!(object instanceof Class411))
	    return false;
	Class411 class411_0_ = (Class411) object;
	if (null == class411_0_.anObject4712 && null != anObject4712)
	    return false;
	if (anObject4712 == null && null != class411_0_.anObject4712)
	    return false;
	if (class411_0_.anInt4711 * 1862601893 == anInt4711 * 1862601893
	    && class411_0_.anObject4712.equals(anObject4712))
	    return true;
	return false;
    }
    
    public boolean method4902(Object object) {
	if (!(object instanceof Class411))
	    return false;
	Class411 class411_1_ = (Class411) object;
	if (null == class411_1_.anObject4712 && null != anObject4712)
	    return false;
	if (anObject4712 == null && null != class411_1_.anObject4712)
	    return false;
	if (class411_1_.anInt4711 * 1862601893 == anInt4711 * 1862601893
	    && class411_1_.anObject4712.equals(anObject4712))
	    return true;
	return false;
    }
    
    public boolean method4903(Object object) {
	if (!(object instanceof Class411))
	    return false;
	Class411 class411_2_ = (Class411) object;
	if (null == class411_2_.anObject4712 && null != anObject4712)
	    return false;
	if (anObject4712 == null && null != class411_2_.anObject4712)
	    return false;
	if (class411_2_.anInt4711 * 1862601893 == anInt4711 * 1862601893
	    && class411_2_.anObject4712.equals(anObject4712))
	    return true;
	return false;
    }
    
    static final void method4904(Class648 class648, int i)
	throws Exception_Sub4 {
	int i_3_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class495.aClass283_Sub1_5578.method3763(Class654.method7841(i_3_,
								    742516331),
						true, -1881955579);
	client.aBool10982 = true;
    }
    
    static final void method4905(Class648 class648, byte i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int i_5_
	    = Class359.method4590(Class646.aClass665_8386,
				  Class678.aClass678_8557, i_4_, 1769287123);
	int i_6_
	    = Class610.method7268(Class646.aClass665_8386,
				  Class678.aClass678_8557, i_4_, (byte) -103);
	if (12 != client.anInt10876 * 175711435
	    || Class181.method2686(-1712965615))
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= (Class168.method2100(i_4_, string, i_5_, i_6_, 1154971370)
		   ? 1 : 0);
    }
    
    public static String method4906(int i, byte i_7_) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
}
