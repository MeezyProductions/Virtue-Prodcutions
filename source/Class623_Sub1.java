/* Class623_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class623_Sub1 extends Class623 implements Interface4
{
    public static Class446 aClass446_10671;
    
    public Class method46() {
	return Class637.class;
    }
    
    public Definition method42(int i, Interface12 interface12, int i_0_) {
	return new Class637(i, this);
    }
    
    public Class method45(short i) {
	return Class637.class;
    }
    
    public Definition method43(int i, Interface12 interface12) {
	return new Class637(i, this);
    }
    
    public Class method44() {
	return Class637.class;
    }
    
    public Class method41() {
	return Class637.class;
    }
    
    Class623_Sub1(Class446 class446) {
	super(class446);
    }
    
    public static Class151 method9753(int i) {
	return Class581.aClass151_7645;
    }
    
    public static void method9754(int i, int i_1_, short i_2_) {
	ClientPacket class528_sub21_sub7
	    = Class79.method1146(20, (long) i_1_ << 32 | (long) i);
	class528_sub21_sub7.method10495(1276994);
    }
    
    public static Class229 method9755(int i, byte i_3_) {
	int i_4_ = i >> 16;
	if (null == Class380.aClass226Array3970[i_4_]
	    || (Class380.aClass226Array3970[i_4_].method3177(i, (byte) 69)
		== null)) {
	    boolean bool = Class256.method3468(i_4_, null, (byte) 0);
	    if (!bool)
		return null;
	}
	return Class380.aClass226Array3970[i_4_].method3177(i, (byte) 126);
    }
}
