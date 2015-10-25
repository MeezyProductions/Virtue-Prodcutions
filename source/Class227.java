/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class227 implements IClientEnum
{
    public static Class227 aClass227_2339;
    public static Class227 aClass227_2340;
    public static Class227 aClass227_2341 = new Class227(4, 0);
    public static Class227 aClass227_2342;
    public static Class227 aClass227_2343 = new Class227(2, 1);
    public static Class227 aClass227_2344;
    public int anInt2345;
    int anInt2346;
    public static int anInt2347;
    
    Class227(int i, int i_0_) {
	anInt2345 = -1363652027 * i;
	this.anInt2346 = -1399239951 * i_0_;
    }
    
    @Override
	public int method68() {
	return -648649199 * this.anInt2346;
    }
    
    static {
	aClass227_2340 = new Class227(1, 2);
	aClass227_2342 = new Class227(5, 3);
	aClass227_2339 = new Class227(0, 4);
	aClass227_2344 = new Class227(3, 5);
    }
    
    public int method5() {
	return -648649199 * this.anInt2346;
    }
    
    public int method6() {
	return -648649199 * this.anInt2346;
    }
    
    static void method3181(Class682 class682, byte i) {
	Class181_Sub23.aClass682_9880 = class682;
    }
    
    public int method71() {
	return -648649199 * this.anInt2346;
    }
    
    public int method73() {
	return -648649199 * this.anInt2346;
    }
    
    public int method72() {
	return -648649199 * this.anInt2346;
    }
    
    public static void method3182(int i, int i_1_, String string,
				  String string_2_, String string_3_,
				  String string_4_, String string_5_, int i_6_,
				  Class384 class384, int i_7_) {
	Class265 class265
	    = (Class265) Class277.aMap3046.get(Integer.valueOf(i));
	if (null == class265) {
	    class265 = new Class265();
	    Class277.aMap3046.put(Integer.valueOf(i), class265);
	}
	Class528_Sub21_Sub13 class528_sub21_sub13
	    = class265.method3661(i, i_1_, string, string_2_, string_3_,
				  string_4_, string_5_, i_6_, class384,
				  1389991658);
	Class277.aClass692_3044.method8142(class528_sub21_sub13,
					   (class528_sub21_sub13
						    .anInt11616)
						   * 1394353867);
	Class277.aClass679_3043.method7959(class528_sub21_sub13, -1017417936);
	client.anInt11099 = 1931111673 * client.anInt11018;
    }
    
    public static byte[] method3183(byte[] is, int i, int i_8_, int i_9_) {
	byte[] is_10_;
	if (i > 0) {
	    is_10_ = new byte[i_8_];
	    for (int i_11_ = 0; i_11_ < i_8_; i_11_++)
		is_10_[i_11_] = is[i + i_11_];
	} else
	    is_10_ = is;
	Class11 class11 = new Class11();
	class11.method611((byte) -8);
	class11.method610(is_10_, 8 * i_8_);
	byte[] is_12_ = new byte[64];
	class11.method609(is_12_, 0, 873563674);
	return is_12_;
    }
    
    static byte method3184(int i, int i_13_, int i_14_) {
	if (i != Class605.aClass605_7909.anInt7905 * 1922173025)
	    return (byte) 0;
	if ((i_13_ & 0x1) == 0)
	    return (byte) 1;
	return (byte) 2;
    }

	static ByteBuffer method3185(int i) {
		ByteBuffer class528_sub42 = Class631.method7548((byte) 1);
		long l;
		if (-1 != Class54.anInt631 * 1871118701)
			l = 1871118701 * Class54.anInt631;
		else if (-1L == -9152589463575654529L * Class54.aLong632)
			l = Class312.method4146(Class54.aString662, -289324303);
		else
			l = -9152589463575654529L * Class54.aLong632;
		Class242.aLong2723 = -1489602343244240495L * l;
		Class54.method958(class528_sub42, l);
		class528_sub42.writeString(Class54.aString663, -1936289654);
		class528_sub42.method9606(-5723296372089232599L * Class54.aLong661);
		class528_sub42.method9606(-5833773103864383205L * client.aLong11168);
		class528_sub42.method9650(RSAKeys.LOGIN_EXPONENT, RSAKeys.LOGIN_MODULUS, 728270902);
		return class528_sub42;
	}

}
