/* Class556 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class556 implements Definition
{
    Class560 aClass560_7453;
    static final int anInt7454 = 70;
    public int anInt7455 = -1205543717;
    public int anInt7456;
    public int anInt7457;
    public int anInt7458;
    public int anInt7459;
    public int anInt7460;
    public int anInt7461;
    public int anInt7462;
    public int anInt7463;
    public int anInt7464;
    public int anInt7465 = 1586136693;
    
    void method6749(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    class528_sub42.readUnsignedShort(-1752384915);
	else if (2 == i)
	    anInt7455 = class528_sub42.readUnsignedByte((byte) 49) * 1797474341;
	else if (3 == i)
	    anInt7465 = class528_sub42.readUnsignedByte((byte) 106) * 460981387;
	else if (4 == i)
	    anInt7457 = 0;
	else if (5 == i)
	    anInt7459 = class528_sub42.readUnsignedShort(349156560) * -1920823999;
	else if (6 == i)
	    class528_sub42.readUnsignedByte((byte) 102);
	else if (7 == i)
	    anInt7460 = class528_sub42.method9645((short) -13744) * 1206909987;
	else if (8 == i)
	    anInt7461 = class528_sub42.method9645((short) 16007) * -1216095205;
	else if (9 == i)
	    anInt7456 = class528_sub42.method9645((short) 8857) * -276899527;
	else if (10 == i)
	    anInt7464 = class528_sub42.method9645((short) -6051) * -640570669;
	else if (i == 11)
	    anInt7457 = class528_sub42.readUnsignedShort(-1794041859) * -1302682021;
	else if (i == 12)
	    anInt7463 = class528_sub42.method9645((short) -17921) * 1300736393;
	else if (i == 13)
	    anInt7462 = class528_sub42.method9645((short) 4201) * 1628897889;
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 56);
	    if (i_0_ == 0)
		break;
	    method6750(class528_sub42, i_0_, -2003835148);
	}
    }
    
    void method6750(ByteBuffer class528_sub42, int i, int i_1_) {
	if (i == 1)
	    class528_sub42.readUnsignedShort(-1670594284);
	else if (2 == i)
	    anInt7455 = class528_sub42.readUnsignedByte((byte) 55) * 1797474341;
	else if (3 == i)
	    anInt7465 = class528_sub42.readUnsignedByte((byte) 44) * 460981387;
	else if (4 == i)
	    anInt7457 = 0;
	else if (5 == i)
	    anInt7459 = class528_sub42.readUnsignedShort(-1110841131) * -1920823999;
	else if (6 == i)
	    class528_sub42.readUnsignedByte((byte) 67);
	else if (7 == i)
	    anInt7460 = class528_sub42.method9645((short) 1698) * 1206909987;
	else if (8 == i)
	    anInt7461 = class528_sub42.method9645((short) 21734) * -1216095205;
	else if (9 == i)
	    anInt7456 = class528_sub42.method9645((short) -3455) * -276899527;
	else if (10 == i)
	    anInt7464 = class528_sub42.method9645((short) 1867) * -640570669;
	else if (i == 11)
	    anInt7457 = class528_sub42.readUnsignedShort(-446240586) * -1302682021;
	else if (i == 12)
	    anInt7463 = class528_sub42.method9645((short) -27214) * 1300736393;
	else if (i == 13)
	    anInt7462 = class528_sub42.method9645((short) -3182) * 1628897889;
    }
    
    public Class151 method6751(Class173 class173, int i, int i_2_) {
	if (i < 0)
	    return null;
	Class151 class151
	    = (Class151) ((Class560) ((Class556) this).aClass560_7453)
			     .aClass186_7512.method2727((long) i);
	if (class151 == null) {
	    method6753(class173, (byte) 50);
	    class151 = (Class151) ((Class560) ((Class556) this).aClass560_7453)
				      .aClass186_7512.method2727((long) i);
	}
	return class151;
    }
    
    void method6752(Class173 class173, int i, int i_3_) {
	Class446 class446
	    = ((Class560) ((Class556) this).aClass560_7453).aClass446_7511;
	if (i >= 0
	    && ((Class560) ((Class556) this).aClass560_7453).aClass186_7512
		   .method2727((long) i) == null
	    && class446.method5357(i, (short) 155)) {
	    Class178 class178 = Class175.method2562(class446, i);
	    ((Class560) ((Class556) this).aClass560_7453).aClass186_7512
		.method2729(class173.method2334(class178, true), (long) i);
	}
    }
    
    void method6753(Class173 class173, byte i) {
	method6752(class173, anInt7460 * 1393464203, -337716689);
	method6752(class173, -134570477 * anInt7461, -337716689);
	method6752(class173, -101825271 * anInt7456, -337716689);
	method6752(class173, 1840004443 * anInt7464, -337716689);
	method6752(class173, anInt7463 * -508584775, -337716689);
	method6752(class173, anInt7462 * 366551457, -337716689);
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 120);
	    if (i == 0)
		break;
	    method6750(class528_sub42, i, -1172319826);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 116);
	    if (i == 0)
		break;
	    method6750(class528_sub42, i, -1776111239);
	}
    }
    
    Class556(int i, Class560 class560) {
	anInt7457 = 1302682021;
	anInt7458 = -1975938197;
	anInt7459 = -1313693754;
	anInt7460 = -1206909987;
	anInt7461 = 1216095205;
	anInt7456 = 276899527;
	anInt7464 = 640570669;
	anInt7463 = -1300736393;
	anInt7462 = -1628897889;
	((Class556) this).aClass560_7453 = class560;
    }
    
    public Class151 method6754(Class173 class173, int i) {
	if (i < 0)
	    return null;
	Class151 class151
	    = (Class151) ((Class560) ((Class556) this).aClass560_7453)
			     .aClass186_7512.method2727((long) i);
	if (class151 == null) {
	    method6753(class173, (byte) 77);
	    class151 = (Class151) ((Class560) ((Class556) this).aClass560_7453)
				      .aClass186_7512.method2727((long) i);
	}
	return class151;
    }
    
    public void method59() {
	/* empty */
    }
    
    public Class151 method6755(Class173 class173, int i) {
	if (i < 0)
	    return null;
	Class151 class151
	    = (Class151) ((Class560) ((Class556) this).aClass560_7453)
			     .aClass186_7512.method2727((long) i);
	if (class151 == null) {
	    method6753(class173, (byte) 79);
	    class151 = (Class151) ((Class560) ((Class556) this).aClass560_7453)
				      .aClass186_7512.method2727((long) i);
	}
	return class151;
    }
    
    public static void method6756(int i) {
	Class647.aClass198_8388.method2833(829206041);
    }
    
    static final void method6757(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) -54);
	Class226 class226 = Class380.aClass226Array3970[i_4_ >> 16];
	Class207.method2929(class229, class226, class648, (byte) -78);
    }
    
    static Class528_Sub21_Sub14 method6758(byte[] is, int i) {
	return new Class528_Sub21_Sub14(new ByteBuffer(is),
					(Class645_Sub1_Sub3_Sub1
					 .anInterface15_11879));
    }
}
