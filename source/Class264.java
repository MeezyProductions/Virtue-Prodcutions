

public class Class264
{
    public String aString2863;
    public String aString2864;
    static Class165 aClass165_2865;
    public static int anInt2866;
    
    Class264() {
	/* empty */
    }
    
    void method3654(Class267 class267, int i) {
	aString2863 = class267.method3669(-862388051);
	aString2864 = class267.method3669(623658999);
    }
    
    void method3655(Class267 class267) {
	aString2863 = class267.method3669(1230702656);
	aString2864 = class267.method3669(-1824875091);
    }
    
    static Class298 method3656(int i, byte i_0_) {
	if (-193471441 * Class298.aClass298_3257.anInt3260 == i)
	    return Class298.aClass298_3257;
	if (i == -193471441 * Class298.aClass298_3258.anInt3260)
	    return Class298.aClass298_3258;
	if (i == Class298.aClass298_3259.anInt3260 * -193471441)
	    return Class298.aClass298_3259;
	return null;
    }
    
    static void method3657(boolean bool, byte i) {
	Class99.aString1264 = Class99.aString1264.trim();
	Class99.anInt1263 = 0;
	if (Class99.aString1264.length() == 0)
	    Class99.anInt1269 = 0;
	else {
	    Class364_Sub2.method9236(new StringBuilder().append("--> ").append
					 (Class99.aString1264).toString(),
				     (byte) -44);
	    Class445_Sub5.method9222(Class99.aString1264, false, bool,
				     2008672007);
	    if (!bool) {
		Class99.anInt1269 = 0;
		Class99.aString1264 = "";
	    } else
		Class99.anInt1269 = Class99.aString1264.length() * 105656261;
	}
    }
    
    public static TwitchWebcamDevice method3658(int i, byte i_1_) {
	if (null == Class581.aTwitchWebcamDeviceArray7641)
	    return null;
	for (int i_2_ = 0; i_2_ < Class581.aTwitchWebcamDeviceArray7641.length;
	     i_2_++) {
	    if ((Class581.aTwitchWebcamDeviceArray7641[i_2_].anInt1097
		 * 1730387545)
		== i)
		return Class581.aTwitchWebcamDeviceArray7641[i_2_];
	}
	return null;
    }
    
    static final void method3659(Class648 class648, int i) {
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub23_10606
		  .method10006((byte) 97) ? 1 : 0;
    }
    
    public static int method3660(int i, int i_3_, int i_4_, int i_5_) {
	if (Class518_Sub1.anInt10685 * -962898353 < 100)
	    return -2;
	int i_6_ = -2;
	int i_7_ = 2147483647;
	int i_8_ = i_3_ - Class518_Sub1.anInt6972;
	int i_9_ = i_4_ - Class518_Sub1.anInt6995;
	for (Class528_Sub25 class528_sub25
		 = ((Class528_Sub25)
		    Class518_Sub1.aClass688_6993.method8034(1385431366));
	     null != class528_sub25;
	     class528_sub25 = (Class528_Sub25) Class518_Sub1.aClass688_6993
						   .method8037(1001567981)) {
	    if (i == -123895777 * class528_sub25.anInt10420) {
		int i_10_ = class528_sub25.anInt10424 * -1196920295;
		int i_11_ = 1481938899 * class528_sub25.anInt10423;
		int i_12_ = (Class518_Sub1.anInt6972 + i_10_ << 14
			     | Class518_Sub1.anInt6995 + i_11_);
		int i_13_ = ((i_9_ - i_11_) * (i_9_ - i_11_)
			     + (i_8_ - i_10_) * (i_8_ - i_10_));
		if (i_6_ < 0 || i_13_ < i_7_) {
		    i_6_ = i_12_;
		    i_7_ = i_13_;
		}
	    }
	}
	return i_6_;
    }
}
