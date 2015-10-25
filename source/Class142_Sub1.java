/* Class142_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;

public class Class142_Sub1 extends Class142
{
    public int anInt8886;
    
    void method1707(ByteBuffer class528_sub42, int i) {
	Class246 class246
	    = (Class246) Class443.method5321(Class593.method7086(-1206284111),
					     i, 1494771308);
	if (class246 == Class246.aClass246_2761)
	    anInt8886 = class528_sub42.readUnsignedShort(-90579910) * 722850805;
    }
    
    void method1709(ByteBuffer class528_sub42, int i, int i_0_) {
	Class246 class246
	    = (Class246) Class443.method5321(Class593.method7086(-1511806886),
					     i, 1338826620);
	if (class246 == Class246.aClass246_2761)
	    anInt8886 = class528_sub42.readUnsignedShort(-771418522) * 722850805;
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    Class142_Sub1(VarDomainType varDomainType, int i) {
	super(varDomainType, i);
    }
    
    void method1706(ByteBuffer class528_sub42, int i) {
	Class246 class246
	    = (Class246) Class443.method5321(Class593.method7086(-2017615064),
					     i, 1657741468);
	if (class246 == Class246.aClass246_2761)
	    anInt8886 = class528_sub42.readUnsignedShort(-1612073435) * 722850805;
    }
    
    public void method59() {
	/* empty */
    }
    
    public static Class446 method8321(Class52 class52, boolean bool, int i,
				      boolean bool_1_, boolean bool_2_,
				      int i_3_) {
	if (Class679.aClass460_Sub1Array8563 == null) {
	    Class679.aClass460_Sub1Array8563
		= new Class460_Sub1[Class668.method7924(-890612545)];
	    Class179.aMap2088 = new HashMap();
	}
	Class539 class539 = null;
	int i_4_ = class52.method912(-770080678);
	if (client.aClass22_6948 != null && !Class528_Sub21_Sub1.aBool11195)
	    class539 = new Class539(i_4_, client.aClass22_6948,
				    Class5_Sub18.aClass22Array10848[i_4_],
				    (i_4_ == Class52.aClass52_599
						 .method912(-817062290)
				     ? 8000000 : 2000000));
	Class679.aClass460_Sub1Array8563[i_4_]
	    = Class244.aClass428_2737.method5155(i_4_, class539,
						 Class671.aClass539_8527,
						 class52
						     .method910(-2115531485),
						 -535767493);
	if (bool_2_)
	    Class679.aClass460_Sub1Array8563[i_4_].method9193(-1005192847);
	Class446 class446
	    = new Class446(Class679.aClass460_Sub1Array8563[i_4_], bool, i);
	Class179.aMap2088.put(class52, class446);
	return class446;
    }
}
