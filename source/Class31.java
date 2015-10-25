/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class31 implements Interface29
{
    Class31() {
	/* empty */
    }
    
    public Interface30 method164(Class295 class295, int i, byte i_0_) {
	if (Class295.aClass295_3235 == class295)
	    return client.localPlayers[i];
	if (Class295.aClass295_3234 == class295) {
	    Class528_Sub31 class528_sub31
		= (Class528_Sub31) client.aClass692_11110.method8137((long) i);
	    if (class528_sub31 != null)
		return (Interface30) class528_sub31.anObject10468;
	}
	return null;
    }
    
    public Interface30 method166(Class295 class295, int i) {
	if (Class295.aClass295_3235 == class295)
	    return client.localPlayers[i];
	if (Class295.aClass295_3234 == class295) {
	    Class528_Sub31 class528_sub31
		= (Class528_Sub31) client.aClass692_11110.method8137((long) i);
	    if (class528_sub31 != null)
		return (Interface30) class528_sub31.anObject10468;
	}
	return null;
    }
    
    public Interface30 method165(Class295 class295, int i) {
	if (Class295.aClass295_3235 == class295)
	    return client.localPlayers[i];
	if (Class295.aClass295_3234 == class295) {
	    Class528_Sub31 class528_sub31
		= (Class528_Sub31) client.aClass692_11110.method8137((long) i);
	    if (class528_sub31 != null)
		return (Interface30) class528_sub31.anObject10468;
	}
	return null;
    }
    
    static int method753(Class446 class446, SharedConfigsType sharedConfigsType, byte i) {
	if (class446 != null) {
	    if (sharedConfigsType.method7666((byte) -41) > 1) {
		int i_1_ = class446.method5356(-2059398471) - 1;
		return (i_1_ * sharedConfigsType.method7666((byte) -118)
			+ class446.method5345(i_1_, 2052365111));
	    }
	    return class446.method5345(sharedConfigsType.anInt8359 * -787098075,
				       2052365111);
	}
	return 0;
    }
}
