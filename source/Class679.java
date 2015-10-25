/* Class679 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class679 implements Iterable
{
    public Class528_Sub21 aClass528_Sub21_8561 = new Class528_Sub21();
    Class528_Sub21 aClass528_Sub21_8562;
    public static Class460_Sub1[] aClass460_Sub1Array8563;
    public static Class446 aClass446_8564;
    
    Class528_Sub21 method7958(Class528_Sub21 class528_sub21, int i) {
	Class528_Sub21 class528_sub21_0_;
	if (class528_sub21 == null)
	    class528_sub21_0_ = aClass528_Sub21_8561.aClass528_Sub21_10408;
	else
	    class528_sub21_0_ = class528_sub21;
	if (class528_sub21_0_ == aClass528_Sub21_8561) {
	    ((Class679) this).aClass528_Sub21_8562 = null;
	    return null;
	}
	((Class679) this).aClass528_Sub21_8562
	    = class528_sub21_0_.aClass528_Sub21_10408;
	return class528_sub21_0_;
    }
    
    public void method7959(Class528_Sub21 class528_sub21, int i) {
	if (null != class528_sub21.aClass528_Sub21_10406)
	    class528_sub21.method9429((byte) -112);
	class528_sub21.aClass528_Sub21_10406
	    = aClass528_Sub21_8561.aClass528_Sub21_10406;
	class528_sub21.aClass528_Sub21_10408 = aClass528_Sub21_8561;
	class528_sub21.aClass528_Sub21_10406.aClass528_Sub21_10408
	    = class528_sub21;
	class528_sub21.aClass528_Sub21_10408.aClass528_Sub21_10406
	    = class528_sub21;
    }
    
    public Class528_Sub21 method7960(int i) {
	return method7958(null, 1942459584);
    }
    
    public void method7961(int i) {
	while (aClass528_Sub21_8561
	       != aClass528_Sub21_8561.aClass528_Sub21_10408)
	    aClass528_Sub21_8561.aClass528_Sub21_10408.method9429((byte) -116);
    }
    
    public Class528_Sub21 method7962(int i) {
	Class528_Sub21 class528_sub21
	    = aClass528_Sub21_8561.aClass528_Sub21_10408;
	if (aClass528_Sub21_8561 == class528_sub21)
	    return null;
	class528_sub21.method9429((byte) -116);
	return class528_sub21;
    }
    
    public Iterator method7963() {
	return new Class693(this);
    }
    
    public int method7964(int i) {
	int i_1_ = 0;
	for (Class528_Sub21 class528_sub21
		 = aClass528_Sub21_8561.aClass528_Sub21_10408;
	     class528_sub21 != aClass528_Sub21_8561;
	     class528_sub21 = class528_sub21.aClass528_Sub21_10408)
	    i_1_++;
	return i_1_;
    }
    
    public Iterator iterator() {
	return new Class693(this);
    }
    
    public void method7965() {
	while (aClass528_Sub21_8561
	       != aClass528_Sub21_8561.aClass528_Sub21_10408)
	    aClass528_Sub21_8561.aClass528_Sub21_10408.method9429((byte) -24);
    }
    
    public void method7966() {
	while (aClass528_Sub21_8561
	       != aClass528_Sub21_8561.aClass528_Sub21_10408)
	    aClass528_Sub21_8561.aClass528_Sub21_10408.method9429((byte) -118);
    }
    
    public void method7967() {
	while (aClass528_Sub21_8561
	       != aClass528_Sub21_8561.aClass528_Sub21_10408)
	    aClass528_Sub21_8561.aClass528_Sub21_10408.method9429((byte) -115);
    }
    
    public int method7968() {
	int i = 0;
	for (Class528_Sub21 class528_sub21
		 = aClass528_Sub21_8561.aClass528_Sub21_10408;
	     class528_sub21 != aClass528_Sub21_8561;
	     class528_sub21 = class528_sub21.aClass528_Sub21_10408)
	    i++;
	return i;
    }
    
    public Class528_Sub21 method7969(int i) {
	Class528_Sub21 class528_sub21 = ((Class679) this).aClass528_Sub21_8562;
	if (aClass528_Sub21_8561 == class528_sub21) {
	    ((Class679) this).aClass528_Sub21_8562 = null;
	    return null;
	}
	((Class679) this).aClass528_Sub21_8562
	    = class528_sub21.aClass528_Sub21_10408;
	return class528_sub21;
    }
    
    public Class679() {
	aClass528_Sub21_8561.aClass528_Sub21_10408 = aClass528_Sub21_8561;
	aClass528_Sub21_8561.aClass528_Sub21_10406 = aClass528_Sub21_8561;
    }
    
    public static Class157 method7970(Class173 class173, int i, int i_2_,
				      int i_3_, int i_4_, int i_5_, int i_6_) {
	long l = (long) i_5_;
	Class157 class157 = (Class157) Class96.aClass186_1215.method2727(l);
	int i_7_ = 2055;
	if (class157 == null) {
	    Class177 class177
		= Class177.method2590(Class287.aClass446_3161, i_5_, 0);
	    if (null == class177)
		return null;
	    if (class177.anInt2035 < 13)
		class177.method2585(2);
	    class157
		= class173.method2244(class177, i_7_,
				      Class96.anInt1214 * -861692983, 64, 768);
	    Class96.aClass186_1215.method2729(class157, l);
	}
	class157 = class157.method1951((byte) 6, i_7_, true);
	if (i != 0)
	    class157.method1878(i);
	if (0 != i_2_)
	    class157.method1934(i_2_);
	if (0 != i_3_)
	    class157.method1879(i_3_);
	if (0 != i_4_)
	    class157.method1880(0, i_4_, 0);
	return class157;
    }
}
