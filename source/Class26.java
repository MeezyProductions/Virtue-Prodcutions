/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */


public abstract class Class26
{
    protected boolean aBool240;
    protected int anInt241;
    protected int anInt242;
    protected int anInt243;
    protected boolean aBool244;
    protected int anInt245;
    protected int anInt246;
    protected int anInt247;
    protected int anInt248;
    
    Class26(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
	    boolean bool, boolean bool_5_, int i_6_) {
	anInt248 = -1523009293 * i;
	anInt241 = i_0_ * -1978906535;
	anInt242 = (i_1_ > 65535 ? 65535 : i_1_) * 1544922441;
	anInt243 = -1741388699 * i_2_;
	anInt245 = (i_3_ > 255 ? 255 : i_3_) * 1503970049;
	anInt247 = 561198601 * i_4_;
	aBool244 = bool;
	aBool240 = bool_5_;
	anInt246 = 1761084881 * i_6_;
    }
    
    static boolean method708(short i) {
	if (Class539.method6615(client.anInt10876 * 175711435, -1926929191))
	    return false;
	return true;
    }
    
    public static TwitchWebcamDevice method709(String string, int i) {
	if (Class581.aTwitchWebcamDeviceArray7641 == null)
	    return null;
	for (int i_7_ = 0; i_7_ < Class581.aTwitchWebcamDeviceArray7641.length;
	     i_7_++) {
	    if (Class581.aTwitchWebcamDeviceArray7641[i_7_].aString1095
		    .equals(string))
		return Class581.aTwitchWebcamDeviceArray7641[i_7_];
	}
	return null;
    }
}
