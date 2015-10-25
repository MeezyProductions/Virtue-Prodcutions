/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44 implements Interface4
{
    Class aClass531;
    
    public Class method45(short i) {
	return ((Class44) this).aClass531;
    }
    
    public Definition method42(int i, Interface12 interface12, int i_0_) {
	Definition definition;
	try {
	    Definition interface10_1_
		= (Definition) ((Class44) this).aClass531.newInstance();
	    ((Interface1) interface10_1_).method9(i, (byte) -13);
	    definition = interface10_1_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return definition;
    }
    
    public Class44(Class var_class) {
	((Class44) this).aClass531 = var_class;
    }
    
    public Definition method43(int i, Interface12 interface12) {
	Definition definition;
	try {
	    Definition interface10_2_
		= (Definition) ((Class44) this).aClass531.newInstance();
	    ((Interface1) interface10_2_).method9(i, (byte) 18);
	    definition = interface10_2_;
	} catch (Exception exception) {
	    exception.printStackTrace();
	    return null;
	}
	return definition;
    }
    
    public Class method44() {
	return ((Class44) this).aClass531;
    }
    
    public Class method41() {
	return ((Class44) this).aClass531;
    }
    
    public Class method46() {
	return ((Class44) this).aClass531;
    }
    
    static final void method856(Class648 class648, int i) {
	boolean bool = true;
	if (client.aBool10853) {
	    try {
		Object object = Class398.aClass398_4412.method4819((byte) -34);
		if (null != object)
		    bool = ((Boolean) object).booleanValue();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = bool ? 1 : 0;
    }
    
    public static Class380 method857(ByteBuffer class528_sub42, byte i) {
	int i_3_ = class528_sub42.readInt(441581243);
	return new Class380(i_3_);
    }
}
