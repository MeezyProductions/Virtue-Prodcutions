/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public class Class279
{
    public int anInt3053;
    static Class279 aClass279_3054;
    public static Class279 aClass279_3055 = new Class279(0, 104);
    static Class279 aClass279_3056;
    static Class279 aClass279_3057;
    static Class279 aClass279_3058;
    public int anInt3059;
    static Class279 aClass279_3060;
    
    Class279(int i, int i_0_) {
	anInt3059 = 1300146557 * i;
	anInt3053 = 1450156245 * i_0_;
    }
    
    static {
	aClass279_3054 = new Class279(1, 120);
	aClass279_3057 = new Class279(2, 136);
	aClass279_3056 = new Class279(3, 168);
	aClass279_3060 = new Class279(4, 72);
	aClass279_3058 = new Class279(5, 256);
    }
    
    static final void method3732(Class648 class648, short i) {
	Class590.method7075(class648,
			    Class108.myPlayer,
			    -55898191);
    }
    
    public static Class683[] method3733(Class702 class702, byte i) {
	int[] is = class702.method8222(-1222819977);
	Class683[] class683s = new Class683[is.length >> 2];
	for (int i_1_ = 0; i_1_ < class683s.length; i_1_++) {
	    Class683 class683 = new Class683();
	    class683s[i_1_] = class683;
	    class683.anInt8604 = 1414526627 * is[i_1_ << 2];
	    class683.anInt8605 = is[1 + (i_1_ << 2)] * -522915291;
	    class683.anInt8603 = 66407401 * is[2 + (i_1_ << 2)];
	    ((Class683) class683).anInt8602 = is[3 + (i_1_ << 2)] * 2051346129;
	}
	return class683s;
    }
    
    static String method3734(Class229 class229, int i) {
	if (client.method10201(class229).method9474(84700778) == 0)
	    return null;
	if (class229.aString2482 == null
	    || class229.aString2482.trim().length() == 0) {
	    if (client.aBool11062)
		return "Hidden-use";
	    return null;
	}
	return class229.aString2482;
    }
    
    public static final void method3735(Class528_Sub39 class528_sub39,
					boolean bool, boolean bool_2_, int i) {
	int i_3_ = class528_sub39.anInt10625 * 905908359;
	int i_4_ = (int) (-4849232331708333273L * class528_sub39.aLong7107);
	class528_sub39.method6443(1380799091);
	if (bool)
	    Class210.method2957(i_3_, -757283107);
	Class375.method4691(i_3_, -953573741);
	Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) -32);
	if (null != class229)
	    Class39.method811(class229, 1435904523);
	Class253.method3435(i_3_, (byte) -23);
	if (!bool_2_ && -1 != client.anInt10978 * 2088127151)
	    Class539.method6616(2088127151 * client.anInt10978, 1, (byte) -82);
	Class697 class697 = new Class697(client.aClass692_11097);
	for (Class528_Sub39 class528_sub39_5_
		 = (Class528_Sub39) class697.method8194(-1324111195);
	     class528_sub39_5_ != null;
	     class528_sub39_5_ = (Class528_Sub39) class697.next()) {
	    if (!class528_sub39_5_.method6441(-219181626)) {
		class528_sub39_5_
		    = (Class528_Sub39) class697.method8194(-1324111195);
		if (null == class528_sub39_5_)
		    break;
	    }
	    if (3 == class528_sub39_5_.anInt10626 * 17672073) {
		int i_6_ = (int) (class528_sub39_5_.aLong7107
				  * -4849232331708333273L);
		if (i_6_ >>> 16 == i_3_)
		    method3735(class528_sub39_5_, true, bool_2_, -1616467927);
	    }
	}
    }
    
    public static Map method3736(Class95_Sub1[] class95_sub1s, int i) {
	if (null == class95_sub1s || 0 == class95_sub1s.length)
	    return null;
	HashMap hashmap = new HashMap();
	Class95_Sub1[] class95_sub1s_7_ = class95_sub1s;
	for (int i_8_ = 0; i_8_ < class95_sub1s_7_.length; i_8_++) {
	    Class95_Sub1 class95_sub1 = class95_sub1s_7_[i_8_];
	    hashmap.put(class95_sub1.aClass445_8775, class95_sub1);
	}
	return hashmap;
    }
}
