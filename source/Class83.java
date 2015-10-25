/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class83
{
    public Interface47[] anInterface47Array820;
    
    void method1151(ByteBuffer class528_sub42, int i) {
	anInterface47Array820
	    = new Interface47[class528_sub42.readUnsignedByte((byte) 106)];
	Class379[] class379s = Class359.method4591(1104032080);
	for (int i_0_ = 0; i_0_ < anInterface47Array820.length; i_0_++)
	    anInterface47Array820[i_0_]
		= method1152(class528_sub42,
			     class379s[class528_sub42.readUnsignedByte((byte) 99)],
			     (byte) 39);
    }
    
    Interface47 method1152(ByteBuffer class528_sub42, Class379 class379,
			   byte i) {
	if (Class379.aClass379_3955 == class379)
	    return Class44.method857(class528_sub42, (byte) 0);
	if (Class379.aClass379_3965 == class379)
	    return Class198.method2838(class528_sub42, 1807660908);
	if (class379 == Class379.aClass379_3958)
	    return Class262.method3644(class528_sub42, -1926657155);
	if (Class379.aClass379_3954 == class379)
	    return Class613.method7338(class528_sub42, (byte) 0);
	if (class379 == Class379.aClass379_3960)
	    return Class374.method4685(class528_sub42, (byte) -4);
	if (class379 == Class379.aClass379_3956)
	    return Class594.method7089(class528_sub42, 168114874);
	if (Class379.aClass379_3962 == class379)
	    return Class525.method6389(class528_sub42, (byte) 0);
	if (Class379.aClass379_3961 == class379)
	    return Class5_Sub11.method10160(class528_sub42, 1842630443);
	if (class379 == Class379.aClass379_3959)
	    return Class442.method5313(class528_sub42, -962296651);
	if (Class379.aClass379_3963 == class379)
	    return Class423.method5112(class528_sub42, -2140749194);
	if (Class379.aClass379_3964 == class379)
	    return PlayerVarsProvider.method1252(class528_sub42, 655486702);
	return null;
    }
    
    void method1153(ByteBuffer class528_sub42) {
	anInterface47Array820
	    = new Interface47[class528_sub42.readUnsignedByte((byte) 84)];
	Class379[] class379s = Class359.method4591(904104951);
	for (int i = 0; i < anInterface47Array820.length; i++)
	    anInterface47Array820[i]
		= method1152(class528_sub42,
			     class379s[class528_sub42.readUnsignedByte((byte) 66)],
			     (byte) 79);
    }
    
    Class83() {
	/* empty */
    }
    
    static final void method1154(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2508
	    = Class181_Sub23.method8999(string, class648, (byte) -15);
	class229.aBool2483 = true;
    }
}
