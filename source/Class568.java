/* Class568 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class568 implements Interface63
{
    Class50 aClass50_7551;
    
    public void method309(int i) {
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4511,
				  client.aClass109_10930.aClass10_1379,
				  -2115092588);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(((Class568) this)
								 .aClass50_7551
								 .method68(),
							     (byte) -19);
	client.aClass109_10930.method1380(class528_sub34, 280171713);
    }
    
    Class568(Class50 class50) {
	((Class568) this).aClass50_7551 = class50;
    }
    
    public void method263() {
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4511,
				  client.aClass109_10930.aClass10_1379,
				  -1905241995);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(((Class568) this)
								 .aClass50_7551
								 .method68(),
							     (byte) -20);
	client.aClass109_10930.method1380(class528_sub34, 1769120511);
    }
    
    static void method6842(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class191.method2794(Class587.aClass173_7714, 1645935901);
    }
    
    static final void method6843(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) 39);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	VarDefinition.method4134(class229, class226, class648, -2072770973);
    }
    
    static final void method6844(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class375.method4690((Class272.aClass528_Sub36_2903
			     == ((Class648) class648).aClass528_Sub36_8416),
			    i_1_, 656099512);
    }
    
    static void method6845(Class58_Sub1 class58_sub1, int i, int i_2_,
			   int i_3_) {
	class58_sub1.method9763(i, (byte) 8);
	int i_4_;
	if (i_2_ > 100000) {
	    Class62.method1021(-1583435812);
	    i_4_ = 4;
	} else if (i_2_ > 50000) {
	    Class194.method2813(401955681);
	    i_4_ = 3;
	} else if (i_2_ > 10000) {
	    IncomingPacket.method4816(-104225822);
	    i_4_ = 2;
	} else {
	    Class239.method3310(true, (byte) -43);
	    i_4_ = 1;
	}
	if (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
		.method10014(-1824619963)
	    != i) {
	    Class514.aClass528_Sub38_6967.method9556((Class514
						      .aClass528_Sub38_6967
						      .aClass691_Sub24_10577),
						     i, 1592486106);
	    Class186.method2754(i, false, 1725547941);
	} else
	    Class514.aClass528_Sub38_6967.method9557((Class514
						      .aClass528_Sub38_6967
						      .aClass691_Sub24_10594),
						     true, (byte) -119);
	Class243.method3387(2138988817);
	class58_sub1.method9757(i_4_, (byte) 55);
    }
    
    static final void method6846(Class648 class648, int i) {
	int i_5_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_5_, (byte) -61);
	Class57.method985(class229, class648, -1971210320);
    }
    
    static final void method6847(int i, int i_6_, int i_7_) {
	Class98.anInt1250 = i * -713309193;
	Class98.anInt1247 = i_6_ * 620673979;
	Class98.aBool1251 = false;
	Class319.method4200(778438177);
    }
}
