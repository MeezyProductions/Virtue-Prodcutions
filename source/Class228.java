/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class228
{
    static final String aString2348 = "#";
    
    Class228() throws Throwable {
	throw new Error();
    }
    
    static final void method3186(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_0_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aClass487ArrayArray11004[i_1_][i_0_].method5886((byte) 4);
    }
    
    static final void method3187(Class648 class648, byte i) {
	NPC class645_sub1_sub5_sub1_sub1
	    = ((NPC)
	       ((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389);
	Class299 class299 = class645_sub1_sub5_sub1_sub1.aClass299_12043;
	if (null != class299.anIntArray3302)
	    class299
		= class299.method3996(Class570.playerVarsProvider,
				      Class570.playerVarsProvider, -1852110451);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class299 != null ? 1 : 0;
    }
    
    static String method3188(long l, int i, int i_2_) {
	Class482.method5864(l);
	int i_3_ = Class38.aCalendar339.get(5);
	int i_4_ = Class38.aCalendar339.get(2) + 1;
	int i_5_ = Class38.aCalendar339.get(1);
	return new StringBuilder().append(Integer.toString(i_3_ / 10)).append
		   (i_3_ % 10).append
		   ("/").append
		   (i_4_ / 10).append
		   (i_4_ % 10).append
		   ("/").append
		   (i_5_ % 100 / 10).append
		   (i_5_ % 10).toString();
    }
}
