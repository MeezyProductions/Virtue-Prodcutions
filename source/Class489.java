/* Class489 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class489
{
    static Class489 aClass489_5498;
    public static Class489 aClass489_5499;
    public static Class489 STATIC;
    static Class489 aClass489_5501;
    static Class489 aClass489_5502;
    public static Class489 aClass489_5503 = new Class489(false, false);
    public static Class489 DYNAMIC;
    public static Class489 aClass489_5505;
    boolean aBool5506;
    boolean aBool5507;
    
    public boolean method5909() {
	return ((Class489) this).aBool5507;
    }
    
    boolean method5910(int i) {
	return ((Class489) this).aBool5506;
    }
    
    public boolean method5911(int i) {
	return ((Class489) this).aBool5507;
    }
    
    Class489(boolean bool, boolean bool_0_) {
	((Class489) this).aBool5506 = bool;
	((Class489) this).aBool5507 = bool_0_;
    }
    
    boolean method5912() {
	return ((Class489) this).aBool5506;
    }
    
    static {
	aClass489_5499 = new Class489(true, false);
	STATIC = new Class489(false, false);
	DYNAMIC = new Class489(true, false);
	aClass489_5502 = new Class489(true, false);
	aClass489_5501 = new Class489(true, true);
	aClass489_5498 = new Class489(true, true);
	aClass489_5505 = new Class489(false, false);
    }
    
    boolean method5913() {
	return ((Class489) this).aBool5506;
    }
    
    public boolean method5914() {
	return ((Class489) this).aBool5507;
    }
    
    static final void method5915(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	class229.aBool2374
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	Class39.method811(class229, 1435904523);
    }
    
    static final void method5916(Class648 class648, int i) {
	NPC class645_sub1_sub5_sub1_sub1
	    = ((NPC)
	       ((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389);
	String string = class645_sub1_sub5_sub1_sub1.aString12044;
	Class299 class299 = class645_sub1_sub5_sub1_sub1.aClass299_12043;
	if (class299.anIntArray3302 != null) {
	    class299 = class299.method3996(Class570.playerVarsProvider,
					   Class570.playerVarsProvider, -379743408);
	    if (null == class299)
		string = "";
	    else
		string = class299.aString3269;
	}
	if (null == string)
	    string = "";
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = string;
    }
    
    static final void method5917(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub21_10583
		  .method9982((byte) 0);
    }
}
