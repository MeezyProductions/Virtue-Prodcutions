/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class296 implements Definition, Interface1
{
    public int anInt3237;
    public int anInt3238;
    public int anInt3239;
    public int anInt3240;
    public boolean aBool3241;
    public int anInt3242 = -61838360;
    public int anInt3243 = -1039238427;
    public int anInt3244;
    public int anInt3245;
    public int anInt3246;
    public int anInt3247;
    static Class446 aClass446_3248;
    static int anInt3249;
    
    public void method9(int i, byte i_0_) {
	/* empty */
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_1_ = class528_sub42.readUnsignedByte((byte) 57);
	    if (i_1_ == 0)
		break;
	    method3970(class528_sub42, i_1_, -506574672);
	}
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    Class296() {
	/* empty */
    }
    
    void method3970(ByteBuffer class528_sub42, int i, int i_2_) {
	if (i == 1)
	    anInt3242 = class528_sub42.readUnsignedShort(765618521) * 529141117;
	else if (2 == i)
	    aBool3241 = true;
	else if (3 == i) {
	    anInt3239 = class528_sub42.method9642(-1717213505) * 1915320817;
	    anInt3237 = class528_sub42.method9642(2084588317) * -1544574337;
	    anInt3245 = class528_sub42.method9642(-927790059) * 1979287827;
	} else if (i == 4)
	    anInt3240 = class528_sub42.readUnsignedByte((byte) 67) * 1137013525;
	else if (5 == i)
	    anInt3244 = class528_sub42.method9645((short) 18619) * -842353021;
	else if (i == 6)
	    anInt3243 = class528_sub42.readTriByte(1327316708) * 1492223259;
	else if (7 == i) {
	    anInt3238 = class528_sub42.method9642(918672749) * -618959115;
	    anInt3246 = class528_sub42.method9642(887496425) * -896804105;
	    anInt3247 = class528_sub42.method9642(1745061828) * 2122118775;
	}
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 23);
	    if (i == 0)
		break;
	    method3970(class528_sub42, i, -506574672);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 65);
	    if (i == 0)
		break;
	    method3970(class528_sub42, i, -506574672);
	}
    }
    
    public void method59() {
	/* empty */
    }
    
    public void method8(int i) {
	/* empty */
    }
    
    void method3971(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    anInt3242 = class528_sub42.readUnsignedShort(-1604804424) * 529141117;
	else if (2 == i)
	    aBool3241 = true;
	else if (3 == i) {
	    anInt3239 = class528_sub42.method9642(-367504995) * 1915320817;
	    anInt3237 = class528_sub42.method9642(1407021209) * -1544574337;
	    anInt3245 = class528_sub42.method9642(-1677840579) * 1979287827;
	} else if (i == 4)
	    anInt3240 = class528_sub42.readUnsignedByte((byte) 56) * 1137013525;
	else if (5 == i)
	    anInt3244 = class528_sub42.method9645((short) 9670) * -842353021;
	else if (i == 6)
	    anInt3243 = class528_sub42.readTriByte(-294736438) * 1492223259;
	else if (7 == i) {
	    anInt3238 = class528_sub42.method9642(-1228859980) * -618959115;
	    anInt3246 = class528_sub42.method9642(642211089) * -896804105;
	    anInt3247 = class528_sub42.method9642(1803810877) * 2122118775;
	}
    }
    
    static final void method3972(Class648 class648, int i) {
	int i_3_ = (((Class648) class648).anIntArray8414
		    [-630179809 * ((Class648) class648).anInt8390]);
	Class528_Sub21_Sub14 class528_sub21_sub14
	    = Class510.method6253(i_3_, (byte) -50);
	if (class528_sub21_sub14 == null)
	    throw new RuntimeException();
	int[] is = new int[-1274963297 * class528_sub21_sub14.anInt11628];
	Object[] objects
	    = new Object[class528_sub21_sub14.anInt11623 * 558215757];
	long[] ls = new long[class528_sub21_sub14.anInt11625 * -567751509];
	for (int i_4_ = 0;
	     i_4_ < -1602976059 * class528_sub21_sub14.anInt11620; i_4_++)
	    is[i_4_]
		= (((Class648) class648).anIntArray8394
		   [(717927929 * ((Class648) class648).anInt8395
		     - class528_sub21_sub14.anInt11620 * -1602976059 + i_4_)]);
	for (int i_5_ = 0; i_5_ < -43785873 * class528_sub21_sub14.anInt11627;
	     i_5_++)
	    objects[i_5_]
		= (((Class648) class648).anObjectArray8396
		   [i_5_ + (((Class648) class648).anInt8410 * -520794877
			    - -43785873 * class528_sub21_sub14.anInt11627)]);
	for (int i_6_ = 0;
	     i_6_ < -1499609843 * class528_sub21_sub14.anInt11624; i_6_++)
	    ls[i_6_]
		= (((Class648) class648).aLongArray8398
		   [(((Class648) class648).anInt8399 * 683825767
		     - -1499609843 * class528_sub21_sub14.anInt11624 + i_6_)]);
	((Class648) class648).anInt8395
	    -= class528_sub21_sub14.anInt11620 * -538879443;
	((Class648) class648).anInt8410
	    -= class528_sub21_sub14.anInt11627 * -1041940443;
	((Class648) class648).anInt8399
	    -= -842488725 * class528_sub21_sub14.anInt11624;
	Class639 class639 = new Class639();
	((Class639) class639).aClass528_Sub21_Sub14_8256
	    = ((Class648) class648).aClass528_Sub21_Sub14_8397;
	((Class639) class639).anInt8255
	    = -1089212251 * ((Class648) class648).anInt8390;
	((Class639) class639).anIntArray8254
	    = ((Class648) class648).anIntArray8405;
	((Class639) class639).anObjectArray8257
	    = ((Class648) class648).anObjectArray8412;
	((Class639) class639).aLongArray8258
	    = ((Class648) class648).aLongArray8407;
	if (823767661 * ((Class648) class648).anInt8400
	    >= ((Class648) class648).aClass639Array8401.length)
	    throw new RuntimeException();
	((Class648) class648).aClass639Array8401
	    [(((Class648) class648).anInt8400 += -1801050267) * 823767661 - 1]
	    = class639;
	((Class648) class648).aClass528_Sub21_Sub14_8397
	    = class528_sub21_sub14;
	((Class648) class648).aClass496Array8415
	    = (((Class648) class648).aClass528_Sub21_Sub14_8397
	       .aClass496Array11629);
	((Class648) class648).anIntArray8414
	    = ((Class648) class648).aClass528_Sub21_Sub14_8397.anIntArray11621;
	((Class648) class648).anInt8390 = -1888568287;
	((Class648) class648).anIntArray8405 = is;
	((Class648) class648).anObjectArray8412 = objects;
	((Class648) class648).aLongArray8407 = ls;
    }
    
    static final void method3973(Class648 class648, byte i) {
	int i_7_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_7_, (byte) 97);
	Class530.method6464(class229, class648, 65280);
    }
    
    public static int method3974(int i, int i_8_) {
	int i_9_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_9_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_9_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_9_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_9_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_9_++;
	}
	return i_9_ + i;
    }
    
    static final void method3975(Class648 class648, int i) {
	int i_10_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub5_10579
		  .method8126(i_10_, -1955030095);
    }
    
    static final void method3976(Class648 class648, int i) {
	if (client.aBool10853)
	    Class398.aClass398_4402.method4821(1286245074);
    }
}
