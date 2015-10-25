/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class214 implements Interface25
{
    int anInt2256;
    Class207 this$0;
    int anInt2257;
    
    Class214(Class207 class207, ByteBuffer class528_sub42) {
	((Class214) this).this$0 = class207;
	int i = class528_sub42.readUnsignedShort(324364199);
	if (65535 != i) {
	    ((Class214) this).anInt2257 = 227419163 * i;
	    ((Class214) this).anInt2256
		= class528_sub42.readInt(724038825) * -1582870265;
	} else {
	    ((Class214) this).anInt2257 = -227419163;
	    ((Class214) this).anInt2256 = 0;
	}
    }
    
    public void method140(Class216 class216, int i) {
	if (-1 != ((Class214) this).anInt2257 * 1905989139) {
	    try {
		class216.method3030(16711680).method98
		    ((VarDefinition) (((Class207) ((Class214) this).this$0)
				     .anInterface24_2232.method132
				     (1633072348).method63
				 (((Class214) this).anInt2257 * 1905989139,
				  -78079978)),
		     ((Class214) this).anInt2256 * -449753929, (byte) -14);
	    } catch (Exception_Sub3 exception_sub3) {
		/* empty */
	    }
	}
    }
    
    public void method141(Class216 class216) {
	if (-1 != ((Class214) this).anInt2257 * 1905989139) {
	    try {
		class216.method3030(16711680).method98
		    ((VarDefinition) (((Class207) ((Class214) this).this$0)
				     .anInterface24_2232.method132
				     (944431959).method63
				 (((Class214) this).anInt2257 * 1905989139,
				  -476392457)),
		     ((Class214) this).anInt2256 * -449753929, (byte) -105);
	    } catch (Exception_Sub3 exception_sub3) {
		/* empty */
	    }
	}
    }
    
    public void method139(Class216 class216) {
	if (-1 != ((Class214) this).anInt2257 * 1905989139) {
	    try {
		class216.method3030(16711680).method98
		    ((VarDefinition) (((Class207) ((Class214) this).this$0)
				     .anInterface24_2232.method132
				     (1261938261).method63
				 (((Class214) this).anInt2257 * 1905989139,
				  1181674283)),
		     ((Class214) this).anInt2256 * -449753929, (byte) -19);
	    } catch (Exception_Sub3 exception_sub3) {
		/* empty */
	    }
	}
    }
    
    public void method138(Class216 class216) {
	if (-1 != ((Class214) this).anInt2257 * 1905989139) {
	    try {
		class216.method3030(16711680).method98
		    ((VarDefinition) (((Class207) ((Class214) this).this$0)
				     .anInterface24_2232.method132
				     (1007008706).method63
				 (((Class214) this).anInt2257 * 1905989139,
				  -958106861)),
		     ((Class214) this).anInt2256 * -449753929, (byte) 5);
	    } catch (Exception_Sub3 exception_sub3) {
		/* empty */
	    }
	}
    }
    
    public static Class289 method2970(int i, int i_0_) {
	if (((Class289) Class289.aClass289_3181).anInt3180 * -13214185 == i)
	    return Class289.aClass289_3181;
	if (((Class289) Class289.aClass289_3179).anInt3180 * -13214185 == i)
	    return Class289.aClass289_3179;
	if (i == -13214185 * ((Class289) Class289.aClass289_3178).anInt3180)
	    return Class289.aClass289_3178;
	return null;
    }
    
    public static Interface57 method2971(int i) {
	if (null == Class503.anInterface57_6873)
	    throw new IllegalStateException("");
	return Class503.anInterface57_6873;
    }
    
    public static int method2972(long l) {
	Class482.method5864(l);
	return Class38.aCalendar339.get(1);
    }
    
    public static void method2973(int i, String string, int i_1_) {
	int i_2_ = GPI.localPlayerCount * 1087758653;
	int[] is = GPI.localPlayerIndicies;
	boolean bool = false;
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    Player class645_sub1_sub5_sub1_sub2
		= client.localPlayers[is[i_3_]];
	    if (class645_sub1_sub5_sub1_sub2 != null
		&& (class645_sub1_sub5_sub1_sub2
		    != Class108.myPlayer)
		&& null != class645_sub1_sub5_sub1_sub2.displayUnfiltered
		&& class645_sub1_sub5_sub1_sub2.displayUnfiltered
		       .equalsIgnoreCase(string)) {
		OutgoingOpcode outgoingOpcode = null;
		if (i == 1)
		    outgoingOpcode = OutgoingOpcode.aClass403_4526;
		else if (2 == i)
		    outgoingOpcode = OutgoingOpcode.aClass403_4492;
		else if (i == 3)
		    outgoingOpcode = OutgoingOpcode.aClass403_4473;
		else if (i == 4)
		    outgoingOpcode = OutgoingOpcode.aClass403_4503;
		else if (i == 5)
		    outgoingOpcode = OutgoingOpcode.aClass403_4490;
		else if (i == 6)
		    outgoingOpcode = OutgoingOpcode.aClass403_4457;
		else if (7 == i)
		    outgoingOpcode = OutgoingOpcode.aClass403_4468;
		else if (i == 8)
		    outgoingOpcode = OutgoingOpcode.aClass403_4499;
		else if (i == 9)
		    outgoingOpcode = OutgoingOpcode.aClass403_4569;
		else if (10 == i)
		    outgoingOpcode = OutgoingOpcode.aClass403_4472;
		if (null != outgoingOpcode) {
		    Class528_Sub34 class528_sub34
			= Class656.method7845(outgoingOpcode,
					      (client.aClass109_10930
					       .aClass10_1379),
					      -2036999745);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeByteC(0, 2110360428);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.method9717(is[i_3_], (byte) -12);
		    client.aClass109_10930.method1380(class528_sub34,
						      1337562300);
		}
		bool = true;
		break;
	    }
	}
	if (!bool)
	    Class640.method7592(4, new StringBuilder().append
				       (Class39.aClass39_508.method807
					(Class378_Sub2.aClass668_10123,
					 (byte) 102))
				       .append
				       (string).toString(), (byte) -23);
    }
    
    static final void method2974(Class648 class648, int i) {
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_4_, (byte) 4);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2410 * 2073033379;
    }
    
    static final void method2975(Class648 class648, int i) {
	int i_5_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (((ItemType) Class18.aClass5_Sub13_206.method63(i_5_, 1590199647))
	       .anInt80) * 1543201881;
    }
}
