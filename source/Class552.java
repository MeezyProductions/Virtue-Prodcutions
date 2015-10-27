/* Class552 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

public class Class552 implements Definition, Interface1
{
    int anInt7423;
    int anInt7424 = 1577190227;
    int[] anIntArray7425;
    Class548 aClass548_7426;
    int anInt7427 = 584693993;
    public static int anInt7428;
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 14);
	    if (0 == i_0_)
		break;
	    method6708(class528_sub42, i_0_, (byte) -100);
	}
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 125);
	    if (0 == i)
		break;
	    method6708(class528_sub42, i, (byte) 32);
	}
    }
    
    public void method9(int i, byte i_1_) {
	/* empty */
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    Class552() {
	((Class552) this).aClass548_7426 = Class548.aClass548_7415;
	((Class552) this).anInt7423 = 945196379;
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 127);
	    if (0 == i)
		break;
	    method6708(class528_sub42, i, (byte) -15);
	}
    }
    
    public void method59() {
	/* empty */
    }
    
    void method6708(ByteBuffer class528_sub42, int i, byte i_2_) {
	if (i == 1)
	    ((Class552) this).anInt7424
		= class528_sub42.readUnsignedShort(-1650066493) * -1577190227;
	else if (i == 2) {
	    ((Class552) this).anIntArray7425
		= new int[class528_sub42.readUnsignedByte((byte) 48)];
	    for (int i_3_ = 0; i_3_ < ((Class552) this).anIntArray7425.length;
		 i_3_++)
		((Class552) this).anIntArray7425[i_3_]
		    = class528_sub42.readUnsignedShort(-551531250);
	} else if (i == 3)
	    ((Class552) this).anInt7427
		= class528_sub42.readUnsignedByte((byte) 99) * -584693993;
	else if (i == 4)
	    ((Class552) this).aClass548_7426
		= ((Class548)
		   Class443.method5321(Class691_Sub15.method9946(-677467993),
				       class528_sub42.readUnsignedByte((byte) 17),
				       1769722028));
	else if (i == 5)
	    ((Class552) this).anInt7423
		= class528_sub42.method9645((short) 7967) * -945196379;
	else if (i == 6)
	    class528_sub42.method9645((short) -144);
    }
    
    void method6709(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    ((Class552) this).anInt7424
		= class528_sub42.readUnsignedShort(864433178) * -1577190227;
	else if (i == 2) {
	    ((Class552) this).anIntArray7425
		= new int[class528_sub42.readUnsignedByte((byte) 61)];
	    for (int i_4_ = 0; i_4_ < ((Class552) this).anIntArray7425.length;
		 i_4_++)
		((Class552) this).anIntArray7425[i_4_]
		    = class528_sub42.readUnsignedShort(-803196602);
	} else if (i == 3)
	    ((Class552) this).anInt7427
		= class528_sub42.readUnsignedByte((byte) 74) * -584693993;
	else if (i == 4)
	    ((Class552) this).aClass548_7426
		= ((Class548)
		   Class443.method5321(Class691_Sub15.method9946(-1382995340),
				       class528_sub42.readUnsignedByte((byte) 29),
				       1060628035));
	else if (i == 5)
	    ((Class552) this).anInt7423
		= class528_sub42.method9645((short) 6648) * -945196379;
	else if (i == 6)
	    class528_sub42.method9645((short) -18358);
    }
    
    public void method8(int i) {
	/* empty */
    }
    
    void method6710(ByteBuffer class528_sub42, int i) {
	if (i == 1)
	    ((Class552) this).anInt7424
		= class528_sub42.readUnsignedShort(-372851725) * -1577190227;
	else if (i == 2) {
	    ((Class552) this).anIntArray7425
		= new int[class528_sub42.readUnsignedByte((byte) 71)];
	    for (int i_5_ = 0; i_5_ < ((Class552) this).anIntArray7425.length;
		 i_5_++)
		((Class552) this).anIntArray7425[i_5_]
		    = class528_sub42.readUnsignedShort(-548597317);
	} else if (i == 3)
	    ((Class552) this).anInt7427
		= class528_sub42.readUnsignedByte((byte) 57) * -584693993;
	else if (i == 4)
	    ((Class552) this).aClass548_7426
		= ((Class548)
		   Class443.method5321(Class691_Sub15.method9946(-430128696),
				       class528_sub42.readUnsignedByte((byte) 43),
				       638946707));
	else if (i == 5)
	    ((Class552) this).anInt7423
		= class528_sub42.method9645((short) -7295) * -945196379;
	else if (i == 6)
	    class528_sub42.method9645((short) -13218);
    }
    
    static final void method6711(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub14_10570,
	     (((Class648) class648).anIntArray8394
	      [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]),
	     518441166);
	Class243.method3387(2142431174);
    }
    
    static final void method6712(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = null == Class691_Sub32.aClass216_10805 ? 0 : 1;
    }
    
    public static void method6713(int i, int i_6_, int i_7_, int i_8_,
				  int i_9_, int i_10_, int i_11_, int i_12_,
				  int i_13_) {
	if (i_6_ >= 0 && i_7_ >= 0
	    && i_6_ < client.gameScene.method6029((short) 8086) - 1
	    && i_7_ < client.gameScene.method5967(2138830421) - 1) {
	    if (client.gameScene.method5973((byte) 21) != null) {
		if (i_8_ == 0) {
		    Interface60 interface60
			= ((Interface60)
			   client.gameScene.method5973((byte) 68)
			       .method6600(i, i_6_, i_7_, (byte) -49));
		    Interface60 interface60_14_
			= ((Interface60)
			   client.gameScene.method5973((byte) 40)
			       .method6554(i, i_6_, i_7_, -665622189));
		    if (null != interface60 && 2 != i_9_) {
			if (interface60 instanceof Class645_Sub1_Sub3_Sub1)
			    ((Class645_Sub1_Sub3_Sub1) interface60)
				.aClass505_11877
				.method6125(i_11_, i_12_, 2119145652);
			else
			    Class92.method1228(i, i_8_, i_6_, i_7_,
					       interface60
						   .method397((short) 8549),
					       i_10_, i_9_, i_11_, i_12_,
					       -568792360);
		    }
		    if (interface60_14_ != null) {
			if (interface60_14_ instanceof Class645_Sub1_Sub3_Sub1)
			    ((Class645_Sub1_Sub3_Sub1) interface60_14_)
				.aClass505_11877
				.method6125(i_11_, i_12_, 1601626621);
			else
			    Class92.method1228(i, i_8_, i_6_, i_7_,
					       interface60_14_
						   .method397((short) 12990),
					       i_10_, i_9_, i_11_, i_12_,
					       1851472303);
		    }
		} else if (i_8_ == 1) {
		    Interface60 interface60
			= ((Interface60)
			   client.gameScene.method5973((byte) 88)
			       .method6555(i, i_6_, i_7_, -881923819));
		    if (interface60 != null) {
			if (interface60 instanceof Class645_Sub1_Sub1_Sub1)
			    ((Class645_Sub1_Sub1_Sub1) interface60)
				.aClass505_11839
				.method6125(i_11_, i_12_, 1552563461);
			else {
			    int i_15_ = interface60.method397((short) 10480);
			    if (4 == i_9_ || i_9_ == 5)
				Class92.method1228(i, i_8_, i_6_, i_7_, i_15_,
						   i_10_, 4, i_11_, i_12_,
						   425162332);
			    else if (i_9_ == 6)
				Class92.method1228(i, i_8_, i_6_, i_7_, i_15_,
						   4 + i_10_, 4, i_11_, i_12_,
						   1038852673);
			    else if (i_9_ == 7)
				Class92.method1228(i, i_8_, i_6_, i_7_, i_15_,
						   4 + (2 + i_10_ & 0x3), 4,
						   i_11_, i_12_, -458887673);
			    else if (8 == i_9_) {
				Class92.method1228(i, i_8_, i_6_, i_7_, i_15_,
						   i_10_ + 4, 4, i_11_, i_12_,
						   -387534872);
				Class92.method1228(i, i_8_, i_6_, i_7_, i_15_,
						   (i_10_ + 2 & 0x3) + 4, 4,
						   i_11_, i_12_, -379760320);
			    }
			}
		    }
		} else if (i_8_ == 2) {
		    Interface60 interface60
			= ((Interface60)
			   (client.gameScene.method5973((byte) 115)
				.method6583
			    (i, i_6_, i_7_, client.anInterface62_11170,
			     2102191850)));
		    if (null != interface60) {
			if (i_9_ == 11)
			    i_9_ = 10;
			if (interface60 instanceof Class645_Sub1_Sub5_Sub2)
			    ((Class645_Sub1_Sub5_Sub2) interface60)
				.aClass505_11860
				.method6125(i_11_, i_12_, 1825664085);
			else
			    Class92.method1228(i, i_8_, i_6_, i_7_,
					       interface60
						   .method397((short) 3922),
					       i_10_, i_9_, i_11_, i_12_,
					       335367929);
		    }
		} else if (i_8_ == 3) {
		    Interface60 interface60
			= ((Interface60)
			   client.gameScene.method5973((byte) 16)
			       .method6591(i, i_6_, i_7_, -1982823679));
		    if (null != interface60) {
			if (interface60 instanceof Class645_Sub1_Sub4_Sub2)
			    ((Class645_Sub1_Sub4_Sub2) interface60)
				.aClass505_11852
				.method6125(i_11_, i_12_, 2082696434);
			else
			    Class92.method1228(i, i_8_, i_6_, i_7_,
					       interface60
						   .method397((short) 17782),
					       i_10_, i_9_, i_11_, i_12_,
					       208658827);
		    }
		}
	    }
	}
    }
    
    static final void method6714(Class648 class648, byte i) {
	if (823767661 * ((Class648) class648).anInt8400 != 0) {
	    Class639 class639 = (((Class648) class648).aClass639Array8401
				 [(((Class648) class648).anInt8400
				   -= -1801050267) * 823767661]);
	    ((Class648) class648).aClass528_Sub21_Sub14_8397
		= ((Class639) class639).aClass528_Sub21_Sub14_8256;
	    ((Class648) class648).aClass496Array8415
		= (((Class648) class648).aClass528_Sub21_Sub14_8397
		   .aClass496Array11629);
	    ((Class648) class648).anIntArray8414
		= (((Class648) class648).aClass528_Sub21_Sub14_8397
		   .anIntArray11621);
	    ((Class648) class648).anInt8390
		= ((Class639) class639).anInt8255 * -1099270355;
	    ((Class648) class648).anIntArray8405
		= ((Class639) class639).anIntArray8254;
	    ((Class648) class648).anObjectArray8412
		= ((Class639) class639).anObjectArray8257;
	    ((Class648) class648).aLongArray8407
		= ((Class639) class639).aLongArray8258;
	}
    }
    
    static boolean method6715(int i) {
	if (null == Class492.aClass528_Sub21_Sub11_5522)
	    return false;
	if (382057983 * ((Class528_Sub21_Sub11)
			 Class492.aClass528_Sub21_Sub11_5522).anInt11595
	    >= 2000)
	    ((Class528_Sub21_Sub11) Class492.aClass528_Sub21_Sub11_5522)
		.anInt11595
		-= 669227056;
	if (1007
	    == (((Class528_Sub21_Sub11) Class492.aClass528_Sub21_Sub11_5522)
		.anInt11595) * 382057983)
	    return true;
	return false;
    }
    
    static Class280 method6716(int i, byte i_16_) {
	if (i == Class280.aClass280_3061.anInt3063 * 1970239675)
	    return Class280.aClass280_3061;
	if (Class280.aClass280_3062.anInt3063 * 1970239675 == i)
	    return Class280.aClass280_3062;
	return null;
    }
    
    static void method6717(int i) {
	Class416.aClass544_4749.method6642(816472559);
	Class95_Sub1_Sub2.aClass537_11200.method6520((byte) 39);
	Class326.aclient3497.method6179((byte) 17);
	Class64.aCanvas754.setBackground(Color.black);
	client.anInt11050 = 1918947249;
	Class416.aClass544_4749
	    = Class542.method6627(Class64.aCanvas754, 832048346);
	Class95_Sub1_Sub2.aClass537_11200
	    = Class259.method3579(Class64.aCanvas754, true, 490592517);
    }
}
