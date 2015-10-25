/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class53 implements Definition
{
    public int anInt617;
    public int anInt618;
    int[] anIntArray619;
    public boolean aBool620 = false;
    Class56 aClass56_621;
    public static Class587 aClass587_622;
    static Class446 aClass446_623;
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 25);
	    if (0 == i_0_)
		break;
	    method925(class528_sub42, i_0_, 362226372);
	}
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    public Class151 method920(Class173 class173, int i, boolean bool,
			      byte i_1_) {
	long l = (long) (anInt618 * 2038482793 | i << 16 | (bool ? 262144 : 0)
			 | 1967042207 * class173.anInt1985 << 19);
	Class151 class151
	    = (Class151) ((Class56) ((Class53) this).aClass56_621)
			     .aClass186_682.method2727(l);
	if (null != class151)
	    return class151;
	method926(class173, i, bool, l);
	return (Class151) ((Class56) ((Class53) this).aClass56_621)
			      .aClass186_682.method2727(l);
    }
    
    public int[] method921(Class173 class173, int i, boolean bool, int i_2_) {
	if (((Class53) this).anIntArray619 != null)
	    return ((Class53) this).anIntArray619;
	long l = (long) (anInt618 * 2038482793 | i << 16 | (bool ? 262144 : 0)
			 | class173.anInt1985 * 1967042207 << 19);
	method926(class173, i, bool, l);
	return ((Class53) this).anIntArray619;
    }
    
    public boolean method922(int i) {
	return ((Class56) ((Class53) this).aClass56_621).aClass446_683
		   .method5357(anInt618 * 2038482793, (short) 3350);
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 61);
	    if (0 == i)
		break;
	    method925(class528_sub42, i, 362226372);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 47);
	    if (0 == i)
		break;
	    method925(class528_sub42, i, 362226372);
	}
    }
    
    public void method59() {
	/* empty */
    }
    
    void method923(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    anInt618 = class528_sub42.method9645((short) 1684) * -713541415;
	else if (i == 2)
	    anInt617 = class528_sub42.readTriByte(1552970831) * 1127749603;
	else if (i == 3)
	    aBool620 = true;
	else if (4 == i)
	    anInt618 = 713541415;
    }
    
    void method924(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    anInt618 = class528_sub42.method9645((short) -3727) * -713541415;
	else if (i == 2)
	    anInt617 = class528_sub42.readTriByte(-1810291902) * 1127749603;
	else if (i == 3)
	    aBool620 = true;
	else if (4 == i)
	    anInt618 = 713541415;
    }
    
    void method925(ByteBuffer class528_sub42, int i, int i_3_) {
	if (i == 1)
	    anInt618 = class528_sub42.method9645((short) -21311) * -713541415;
	else if (i == 2)
	    anInt617 = class528_sub42.readTriByte(-1684620056) * 1127749603;
	else if (i == 3)
	    aBool620 = true;
	else if (4 == i)
	    anInt618 = 713541415;
    }
    
    void method926(Class173 class173, int i, boolean bool, long l) {
	if (((Class56) ((Class53) this).aClass56_621).aClass446_683
		.method5357(anInt618 * 2038482793, (short) -13731)) {
	    Class178 class178
		= Class175.method2561((((Class56)
					((Class53) this).aClass56_621)
				       .aClass446_683),
				      anInt618 * 2038482793, 0);
	    if (null != class178) {
		class178.method2621();
		if (bool)
		    class178.method2613();
		for (int i_4_ = 0; i_4_ < i; i_4_++)
		    class178.method2648();
		((Class53) this).anIntArray619 = class178.method2629(false);
		if (0 != anInt617 * 2028856779) {
		    int i_5_ = (2028856779 * anInt617 & 0xff0000) >> 16;
		    int i_6_ = (anInt617 * 2028856779 & 0xff00) >> 8;
		    int i_7_ = anInt617 * 2028856779 & 0xff;
		    for (int i_8_ = 0;
			 i_8_ < ((Class53) this).anIntArray619.length;
			 i_8_++) {
			int i_9_ = (((Class53) this).anIntArray619[i_8_] >> 24
				    & 0xff);
			int i_10_ = 256 - i_9_;
			if (i_9_ != 0) {
			    int i_11_
				= (-16777216
				   * (i_5_
				      * (((Class53) this).anIntArray619[i_8_]
					 & 0xff0000)));
			    int i_12_ = ((((Class53) this).anIntArray619[i_8_]
					  & 0xff00)
					 * i_6_ * 16711680);
			    int i_13_
				= i_7_ * (((Class53) this).anIntArray619[i_8_]
					  & 0xff) * 65280;
			    int i_14_ = (i_11_ | i_12_ | i_13_) >>> 8;
			    if (255 == i_9_)
				((Class53) this).anIntArray619[i_8_] = i_14_;
			    else {
				int i_15_
				    = ((Class53) this).anIntArray619[i_8_];
				((Class53) this).anIntArray619[i_8_]
				    = (i_9_ << 24
				       | (((i_9_ * (i_15_ & 0xff00)
					    + i_10_ * (i_14_ & 0xff00))
					   & 0xff0000)
					  + ((i_10_ * (i_14_ & 0xff00ff)
					      + (i_15_ & 0xff00ff) * i_9_)
					     & ~0xff00ff)) >> 8);
			    }
			}
		    }
		}
	    }
	    Class151 class151 = class173.method2334(class178, true);
	    if (class151 != null)
		((Class56) ((Class53) this).aClass56_621).aClass186_682
		    .method2729(class151, l);
	}
    }
    
    public boolean method927() {
	return ((Class56) ((Class53) this).aClass56_621).aClass446_683
		   .method5357(anInt618 * 2038482793, (short) 14274);
    }
    
    Class53(int i, Class56 class56) {
	((Class53) this).aClass56_621 = class56;
    }
    
    static final void method928(Class648 class648, byte i) {
	int i_16_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_16_, (byte) -52);
	Class226 class226 = Class380.aClass226Array3970[i_16_ >> 16];
	Class191.method2791(class229, class226, class648, 234988187);
    }
    
    static final void method929(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class320.method4202(class229, class226, class648, -2134138080);
    }
}
