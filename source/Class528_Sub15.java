/* Class528_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class528_Sub15 extends Node
{
    abstract void method9395(Class528_Sub36 class528_sub36, int i);
    
    abstract void method9396(ByteBuffer class528_sub42, byte i);
    
    Class528_Sub15() {
	/* empty */
    }
    
    abstract void method9397(ByteBuffer class528_sub42);
    
    abstract void method9398(ByteBuffer class528_sub42);
    
    abstract void method9399(Class528_Sub36 class528_sub36);
    
    abstract void method9400(Class528_Sub36 class528_sub36);
    
    abstract void method9401(Class528_Sub36 class528_sub36);
    
    public static boolean method9402(String string, int i) {
	if (null == string)
	    return false;
	for (int i_0_ = 0; i_0_ < -1924608781 * client.anInt11024; i_0_++) {
	    Class33 class33 = client.aClass33Array11164[i_0_];
	    if (string.equalsIgnoreCase(class33.aString311))
		return true;
	    if (string.equalsIgnoreCase(class33.aString313))
		return true;
	}
	return false;
    }
    
    static void method9403(int i, int i_1_, int i_2_, byte i_3_) {
	if (1008 == i)
	    Class504.method6119(Cs2Context.aClass561_7519, i_1_, i_2_,
				786342110);
	else if (1009 == i)
	    Class504.method6119(Cs2Context.aClass561_7514, i_1_, i_2_,
				-1160026252);
	else if (1010 == i)
	    Class504.method6119(Cs2Context.aClass561_7517, i_1_, i_2_,
				1195435721);
	else if (1011 == i)
	    Class504.method6119(Cs2Context.aClass561_7516, i_1_, i_2_,
				-1613472004);
	else if (1012 == i)
	    Class504.method6119(Cs2Context.aClass561_7532, i_1_, i_2_,
				961086766);
    }
}
