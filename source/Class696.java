/* Class696 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class696
{
    public int anInt8708;
    public static Class696 aClass696_8709 = new Class696("LIVE", 0);
    public static Class696 aClass696_8710;
    public static Class696 aClass696_8711;
    static Class696 aClass696_8712;
    public static Class696 aClass696_8713 = new Class696("BUILDLIVE", 3);
    public String aString8714;
    
    Class696(String string, int i) {
	aString8714 = string;
	anInt8708 = i * -686942603;
    }
    
    static {
	aClass696_8710 = new Class696("RC", 1);
	aClass696_8711 = new Class696("WIP", 2);
	aClass696_8712 = new Class696("INTBETA", 4);
    }
    
    static final void method8189(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 0);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class191.method2791(class229, class226, class648, -1824368032);
    }
    
    public static void method8190(int i) {
	Container container = Class465.method5625(312287159);
	int i_1_ = container.getSize().width;
	int i_2_ = container.getSize().height;
	if (Class196.aFrame2197 == container) {
	    Insets insets = Class196.aFrame2197.getInsets();
	    i_1_ -= insets.left + insets.right;
	    i_2_ -= insets.top + insets.bottom;
	}
	if (i_1_ != 624323463 * client.anInt6929
	    || 1116226221 * Class106.anInt1314 != i_2_ || client.aBool10896) {
	    if (null == Class587.aClass173_7714
		|| Class587.aClass173_7714.method2467())
		Class206.method2921(-1485997660);
	    else {
		client.anInt6929 = i_1_ * 758082103;
		Class106.anInt1314 = -1402965723 * i_2_;
	    }
	    client.aLong11017 = ((Class249.method3417(1982962368) + 500L)
				 * 6001322816216855593L);
	    client.aBool10896 = false;
	}
    }
    
    static void method8191(Class229 class229, int i, int i_3_, int i_4_) {
	if (0 == class229.aByte2539)
	    class229.anInt2388 = class229.anInt2384 * 567923753;
	else if (1 == class229.aByte2539)
	    class229.anInt2388
		= ((i - class229.anInt2476 * -1352480433) / 2
		   + class229.anInt2384 * -475672303) * -1291726439;
	else if (class229.aByte2539 == 2)
	    class229.anInt2388
		= -1291726439 * (i - -1352480433 * class229.anInt2476
				 - class229.anInt2384 * -475672303);
	else if (class229.aByte2539 == 3)
	    class229.anInt2388
		= -1291726439 * (-475672303 * class229.anInt2384 * i >> 14);
	else if (class229.aByte2539 == 4)
	    class229.anInt2388 = ((i - -1352480433 * class229.anInt2476) / 2
				  + (i * (class229.anInt2384 * -475672303)
				     >> 14)) * -1291726439;
	else
	    class229.anInt2388 = (i - -1352480433 * class229.anInt2476
				  - (i * (-475672303 * class229.anInt2384)
				     >> 14)) * -1291726439;
	if (0 == class229.aByte2381)
	    class229.anInt2360 = class229.anInt2369 * 464048113;
	else if (1 == class229.aByte2381)
	    class229.anInt2360
		= ((i_3_ - 1661025435 * class229.anInt2458) / 2
		   + -719681027 * class229.anInt2369) * -601360891;
	else if (class229.aByte2381 == 2)
	    class229.anInt2360
		= (i_3_ - class229.anInt2458 * 1661025435
		   - -719681027 * class229.anInt2369) * -601360891;
	else if (class229.aByte2381 == 3)
	    class229.anInt2360
		= -601360891 * (i_3_ * (class229.anInt2369 * -719681027)
				>> 14);
	else if (class229.aByte2381 == 4)
	    class229.anInt2360
		= -601360891 * ((i_3_ - class229.anInt2458 * 1661025435) / 2
				+ (-719681027 * class229.anInt2369 * i_3_
				   >> 14));
	else
	    class229.anInt2360
		= -601360891 * (i_3_ - class229.anInt2458 * 1661025435
				- (class229.anInt2369 * -719681027 * i_3_
				   >> 14));
	if (client.aBool11062
	    && (client.method10201(class229).anInt10455 * -450987711 != 0
		|| 0 == class229.anInt2378 * -319431967)) {
	    if (class229.anInt2388 * -147131735 < 0)
		class229.anInt2388 = 0;
	    else if ((-147131735 * class229.anInt2388
		      + class229.anInt2476 * -1352480433)
		     > i)
		class229.anInt2388
		    = -1291726439 * (i - class229.anInt2476 * -1352480433);
	    if (-1087215923 * class229.anInt2360 < 0)
		class229.anInt2360 = 0;
	    else if ((1661025435 * class229.anInt2458
		      + class229.anInt2360 * -1087215923)
		     > i_3_)
		class229.anInt2360
		    = -601360891 * (i_3_ - class229.anInt2458 * 1661025435);
	}
    }
    
    static final void method8192(Class648 class648, byte i) {
	throw new RuntimeException("");
    }
}
