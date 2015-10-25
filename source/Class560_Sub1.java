/* Class560_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class560_Sub1 extends Class560 implements Interface4
{
    public Class method46() {
	return Class556.class;
    }
    
    public Definition method42(int i, Interface12 interface12, int i_0_) {
	return new Class556(i, this);
    }
    
    public Class method45(short i) {
	return Class556.class;
    }
    
    Class560_Sub1(Class446 class446) {
	super(class446);
    }
    
    public Class method44() {
	return Class556.class;
    }
    
    public Class method41() {
	return Class556.class;
    }
    
    public Definition method43(int i, Interface12 interface12) {
	return new Class556(i, this);
    }
    
    public static int method9840(int i) {
	if (3 == -244674793 * Class581.anInt7630)
	    return -1;
	if (0 != Class581.anInt7630 * -244674793)
	    return Class581.anInt7629 * -58829207;
	if (Class581.aStringArray7631 == null) {
	    if (Class493.aString5525.startsWith("mac ")) {
		if (Class493.aString5527.startsWith("ppc")) {
		    Class581.anInt7630 = -701183499;
		    return -1;
		}
		Class581.aStringArray7631 = new String[3];
		Class581.aStringArray7631[0] = "sdk-mac-dynamic";
		Class581.aStringArray7631[1] = "twitchsdk";
		Class581.aStringArray7631[2] = "twitchtv";
		Class581.aBoolArray7643 = new boolean[3];
		Class581.aBoolArray7643[0] = false;
		Class581.aBoolArray7643[1] = false;
		Class581.aBoolArray7643[2] = true;
	    } else if (Class493.aString5525.startsWith("win")) {
		Class581.aStringArray7631 = new String[6];
		Class581.aStringArray7631[0] = "avutil-ttv-51";
		Class581.aStringArray7631[1] = "libmp3lame-ttv";
		Class581.aStringArray7631[2] = "swresample-ttv-0";
		Class581.aStringArray7631[5] = "twitchtv";
		if (Class493.aString5527.startsWith("amd64")
		    || Class493.aString5527.startsWith("x86_64")) {
		    Class581.aStringArray7631[3] = "libmfxsw64";
		    Class581.aStringArray7631[4] = "twitchsdk_64_release";
		} else if (Class493.aString5527.startsWith("i386")
			   || Class493.aString5527.startsWith("i486")
			   || Class493.aString5527.startsWith("i586")
			   || Class493.aString5527.startsWith("x86")) {
		    Class581.aStringArray7631[3] = "libmfxsw32";
		    Class581.aStringArray7631[4] = "twitchsdk_32_release";
		} else {
		    Class581.anInt7630 = -701183499;
		    return -1;
		}
		Class581.aBoolArray7643 = new boolean[6];
		Class581.aBoolArray7643[0] = true;
		Class581.aBoolArray7643[1] = true;
		Class581.aBoolArray7643[2] = true;
		Class581.aBoolArray7643[3] = false;
		Class581.aBoolArray7643[4] = true;
		Class581.aBoolArray7643[5] = true;
	    } else {
		Class581.anInt7630 = -701183499;
		return -1;
	    }
	}
	Class581.anInt7630 = -233727833;
	return 0;
    }
    
    public static int method9841(int i, int i_1_, boolean bool, int i_2_) {
	Class528_Sub6 class528_sub6 = IncomingPacket.method4814(i, bool, 40621884);
	if (null == class528_sub6)
	    return 0;
	if (i_1_ < 0
	    || i_1_ >= ((Class528_Sub6) class528_sub6).anIntArray10252.length)
	    return 0;
	return ((Class528_Sub6) class528_sub6).anIntArray10252[i_1_];
    }
}
