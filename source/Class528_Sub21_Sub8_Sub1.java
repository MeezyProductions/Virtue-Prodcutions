/* Class528_Sub21_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub21_Sub8_Sub1 extends Class528_Sub21_Sub8
{
    Class266 aClass266_11978;
    float aFloat11979;
    float aFloat11980;
    float aFloat11981;
    
    public void method10539(ByteBuffer class528_sub42, int i) {
	((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
	    = Class166.method2098(class528_sub42.readUnsignedByte((byte) 110),
				  -1761555851);
	((Class528_Sub21_Sub8_Sub1) this).aFloat11980
	    = class528_sub42.method9635(-1450922811);
	((Class528_Sub21_Sub8_Sub1) this).aFloat11979
	    = class528_sub42.method9635(-2124725605);
    }
    
    public void method10536(Class284 class284, Class433 class433,
			    Class418 class418) {
	float f = (float) Math.sin((double) ((Class528_Sub21_Sub8_Sub1) this)
					    .aFloat11981);
	float f_0_ = f * ((Class528_Sub21_Sub8_Sub1) this).aFloat11980;
	if (Class266.aClass266_2873
	    == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978) {
	    Class284 class284_1_;
	    (class284_1_ = class284).anInt3118
		= ((int) ((float) (class284_1_.anInt3118 * 1992071425) + f_0_)
		   * 330589953);
	    class433.method5252(f_0_, 0.0F, 0.0F);
	} else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		   == Class266.aClass266_2872) {
	    Class284 class284_2_;
	    (class284_2_ = class284).anInt3116
		= ((int) ((float) (class284_2_.anInt3116 * -1338437335) + f_0_)
		   * -160556263);
	    class433.method5252(0.0F, f_0_, 0.0F);
	} else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		   == Class266.aClass266_2871) {
	    Class284 class284_3_;
	    (class284_3_ = class284).anInt3117
		= 1998082863 * (int) (f_0_ + (float) (class284_3_.anInt3117
						      * 944493519));
	    class433.method5252(0.0F, 0.0F, f_0_);
	} else if (Class266.aClass266_2874
		   == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978)
	    class433.method5256(1.0F, 0.0F, 0.0F, f_0_);
	else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		 == Class266.aClass266_2875)
	    class433.method5256(0.0F, 1.0F, 0.0F, f_0_);
	else if (Class266.aClass266_2876
		 == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978)
	    class433.method5256(0.0F, 0.0F, 1.0F, f_0_);
    }
    
    public Class528_Sub21_Sub8_Sub1(int i, Class266 class266, float f,
				    float f_4_) {
	super(i);
	((Class528_Sub21_Sub8_Sub1) this).aClass266_11978 = class266;
	((Class528_Sub21_Sub8_Sub1) this).aFloat11980 = f;
	((Class528_Sub21_Sub8_Sub1) this).aFloat11979 = f_4_;
    }
    
    Class528_Sub21_Sub8_Sub1(int i, ByteBuffer class528_sub42) {
	super(i);
	((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
	    = Class166.method2098(class528_sub42.readUnsignedByte((byte) 121),
				  -1856265516);
	((Class528_Sub21_Sub8_Sub1) this).aFloat11980
	    = class528_sub42.method9635(-1403806861);
	((Class528_Sub21_Sub8_Sub1) this).aFloat11979
	    = class528_sub42.method9635(-1576524073);
    }
    
    public void method10543(ByteBuffer class528_sub42) {
	((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
	    = Class166.method2098(class528_sub42.readUnsignedByte((byte) 27),
				  -1984857852);
	((Class528_Sub21_Sub8_Sub1) this).aFloat11980
	    = class528_sub42.method9635(-2056628113);
	((Class528_Sub21_Sub8_Sub1) this).aFloat11979
	    = class528_sub42.method9635(-1993070031);
    }
    
    public void method10537(float f) {
	((Class528_Sub21_Sub8_Sub1) this).aFloat11981
	    += f * ((Class528_Sub21_Sub8_Sub1) this).aFloat11979;
    }
    
    public void method10538(float f) {
	((Class528_Sub21_Sub8_Sub1) this).aFloat11981
	    += f * ((Class528_Sub21_Sub8_Sub1) this).aFloat11979;
    }
    
    public void method10535(Class284 class284, Class433 class433,
			    Class418 class418, int i) {
	float f = (float) Math.sin((double) ((Class528_Sub21_Sub8_Sub1) this)
					    .aFloat11981);
	float f_5_ = f * ((Class528_Sub21_Sub8_Sub1) this).aFloat11980;
	if (Class266.aClass266_2873
	    == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978) {
	    Class284 class284_6_;
	    (class284_6_ = class284).anInt3118
		= ((int) ((float) (class284_6_.anInt3118 * 1992071425) + f_5_)
		   * 330589953);
	    class433.method5252(f_5_, 0.0F, 0.0F);
	} else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		   == Class266.aClass266_2872) {
	    Class284 class284_7_;
	    (class284_7_ = class284).anInt3116
		= ((int) ((float) (class284_7_.anInt3116 * -1338437335) + f_5_)
		   * -160556263);
	    class433.method5252(0.0F, f_5_, 0.0F);
	} else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		   == Class266.aClass266_2871) {
	    Class284 class284_8_;
	    (class284_8_ = class284).anInt3117
		= 1998082863 * (int) (f_5_ + (float) (class284_8_.anInt3117
						      * 944493519));
	    class433.method5252(0.0F, 0.0F, f_5_);
	} else if (Class266.aClass266_2874
		   == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978)
	    class433.method5256(1.0F, 0.0F, 0.0F, f_5_);
	else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		 == Class266.aClass266_2875)
	    class433.method5256(0.0F, 1.0F, 0.0F, f_5_);
	else if (Class266.aClass266_2876
		 == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978)
	    class433.method5256(0.0F, 0.0F, 1.0F, f_5_);
    }
    
    public void method10540(Class284 class284, Class433 class433,
			    Class418 class418) {
	float f = (float) Math.sin((double) ((Class528_Sub21_Sub8_Sub1) this)
					    .aFloat11981);
	float f_9_ = f * ((Class528_Sub21_Sub8_Sub1) this).aFloat11980;
	if (Class266.aClass266_2873
	    == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978) {
	    Class284 class284_10_;
	    (class284_10_ = class284).anInt3118
		= ((int) ((float) (class284_10_.anInt3118 * 1992071425) + f_9_)
		   * 330589953);
	    class433.method5252(f_9_, 0.0F, 0.0F);
	} else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		   == Class266.aClass266_2872) {
	    Class284 class284_11_;
	    (class284_11_ = class284).anInt3116
		= (int) ((float) (class284_11_.anInt3116 * -1338437335)
			 + f_9_) * -160556263;
	    class433.method5252(0.0F, f_9_, 0.0F);
	} else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		   == Class266.aClass266_2871) {
	    Class284 class284_12_;
	    (class284_12_ = class284).anInt3117
		= 1998082863 * (int) (f_9_ + (float) (class284_12_.anInt3117
						      * 944493519));
	    class433.method5252(0.0F, 0.0F, f_9_);
	} else if (Class266.aClass266_2874
		   == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978)
	    class433.method5256(1.0F, 0.0F, 0.0F, f_9_);
	else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		 == Class266.aClass266_2875)
	    class433.method5256(0.0F, 1.0F, 0.0F, f_9_);
	else if (Class266.aClass266_2876
		 == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978)
	    class433.method5256(0.0F, 0.0F, 1.0F, f_9_);
    }
    
    public void method10534(float f, int i) {
	((Class528_Sub21_Sub8_Sub1) this).aFloat11981
	    += f * ((Class528_Sub21_Sub8_Sub1) this).aFloat11979;
    }
    
    public void method10542(Class284 class284, Class433 class433,
			    Class418 class418) {
	float f = (float) Math.sin((double) ((Class528_Sub21_Sub8_Sub1) this)
					    .aFloat11981);
	float f_13_ = f * ((Class528_Sub21_Sub8_Sub1) this).aFloat11980;
	if (Class266.aClass266_2873
	    == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978) {
	    Class284 class284_14_;
	    (class284_14_ = class284).anInt3118
		= (int) ((float) (class284_14_.anInt3118 * 1992071425)
			 + f_13_) * 330589953;
	    class433.method5252(f_13_, 0.0F, 0.0F);
	} else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		   == Class266.aClass266_2872) {
	    Class284 class284_15_;
	    (class284_15_ = class284).anInt3116
		= (int) ((float) (class284_15_.anInt3116 * -1338437335)
			 + f_13_) * -160556263;
	    class433.method5252(0.0F, f_13_, 0.0F);
	} else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		   == Class266.aClass266_2871) {
	    Class284 class284_16_;
	    (class284_16_ = class284).anInt3117
		= 1998082863 * (int) (f_13_ + (float) (class284_16_.anInt3117
						       * 944493519));
	    class433.method5252(0.0F, 0.0F, f_13_);
	} else if (Class266.aClass266_2874
		   == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978)
	    class433.method5256(1.0F, 0.0F, 0.0F, f_13_);
	else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		 == Class266.aClass266_2875)
	    class433.method5256(0.0F, 1.0F, 0.0F, f_13_);
	else if (Class266.aClass266_2876
		 == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978)
	    class433.method5256(0.0F, 0.0F, 1.0F, f_13_);
    }
    
    public void method10541(Class284 class284, Class433 class433,
			    Class418 class418) {
	float f = (float) Math.sin((double) ((Class528_Sub21_Sub8_Sub1) this)
					    .aFloat11981);
	float f_17_ = f * ((Class528_Sub21_Sub8_Sub1) this).aFloat11980;
	if (Class266.aClass266_2873
	    == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978) {
	    Class284 class284_18_;
	    (class284_18_ = class284).anInt3118
		= (int) ((float) (class284_18_.anInt3118 * 1992071425)
			 + f_17_) * 330589953;
	    class433.method5252(f_17_, 0.0F, 0.0F);
	} else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		   == Class266.aClass266_2872) {
	    Class284 class284_19_;
	    (class284_19_ = class284).anInt3116
		= (int) ((float) (class284_19_.anInt3116 * -1338437335)
			 + f_17_) * -160556263;
	    class433.method5252(0.0F, f_17_, 0.0F);
	} else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		   == Class266.aClass266_2871) {
	    Class284 class284_20_;
	    (class284_20_ = class284).anInt3117
		= 1998082863 * (int) (f_17_ + (float) (class284_20_.anInt3117
						       * 944493519));
	    class433.method5252(0.0F, 0.0F, f_17_);
	} else if (Class266.aClass266_2874
		   == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978)
	    class433.method5256(1.0F, 0.0F, 0.0F, f_17_);
	else if (((Class528_Sub21_Sub8_Sub1) this).aClass266_11978
		 == Class266.aClass266_2875)
	    class433.method5256(0.0F, 1.0F, 0.0F, f_17_);
	else if (Class266.aClass266_2876
		 == ((Class528_Sub21_Sub8_Sub1) this).aClass266_11978)
	    class433.method5256(0.0F, 0.0F, 1.0F, f_17_);
    }
}
