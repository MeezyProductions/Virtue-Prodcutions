/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class66
{
    static Class463 aClass463_755 = new Class463(16, Class441.aClass441_4899);
    public static int[] anIntArray756;
    static int anInt757;
    static final int anInt758 = 12;
    public static int[] anIntArray759;
    public static int anInt760;
    
    public static void method1062(int i, int i_0_) {
	if (i != 736531093 * anInt760) {
	    anIntArray759 = new int[i];
	    for (int i_1_ = 0; i_1_ < i; i_1_++)
		anIntArray759[i_1_] = (i_1_ << 12) / i;
	    anInt760 = i * 994355389;
	}
	if (anInt757 * 1270807153 != i_0_) {
	    if (i_0_ != anInt760 * 736531093) {
		anIntArray756 = new int[i_0_];
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
		    anIntArray756[i_2_] = (i_2_ << 12) / i_0_;
	    } else
		anIntArray756 = anIntArray759;
	    anInt757 = 168658577 * i_0_;
	}
    }
    
    public static void method1063(int i, int i_3_, byte i_4_) {
	if (i != 736531093 * anInt760) {
	    anIntArray759 = new int[i];
	    for (int i_5_ = 0; i_5_ < i; i_5_++)
		anIntArray759[i_5_] = (i_5_ << 12) / i;
	    anInt760 = i * 994355389;
	}
	if (anInt757 * 1270807153 != i_3_) {
	    if (i_3_ != anInt760 * 736531093) {
		anIntArray756 = new int[i_3_];
		for (int i_6_ = 0; i_6_ < i_3_; i_6_++)
		    anIntArray756[i_6_] = (i_6_ << 12) / i_3_;
	    } else
		anIntArray756 = anIntArray759;
	    anInt757 = 168658577 * i_3_;
	}
    }
    
    public static byte[] method1064(int i, int i_7_) {
	byte[] is = ((byte[])
		     aClass463_755.method5592(Integer.valueOf(i), -921285466));
	if (is == null) {
	    is = new byte[512];
	    Random random = new Random((long) i);
	    for (int i_8_ = 0; i_8_ < 255; i_8_++)
		is[i_8_] = (byte) i_8_;
	    for (int i_9_ = 0; i_9_ < 255; i_9_++) {
		int i_10_ = 255 - i_9_;
		int i_11_
		    = Class511_Sub6.method9346(random, i_10_, -1585594121);
		byte i_12_ = is[i_11_];
		is[i_11_] = is[i_10_];
		is[i_10_] = is[511 - i_9_] = i_12_;
	    }
	    aClass463_755.method5593(Integer.valueOf(i), is, (byte) 22);
	}
	return is;
    }
    
    public static void method1065(int i, int i_13_) {
	if (i != 736531093 * anInt760) {
	    anIntArray759 = new int[i];
	    for (int i_14_ = 0; i_14_ < i; i_14_++)
		anIntArray759[i_14_] = (i_14_ << 12) / i;
	    anInt760 = i * 994355389;
	}
	if (anInt757 * 1270807153 != i_13_) {
	    if (i_13_ != anInt760 * 736531093) {
		anIntArray756 = new int[i_13_];
		for (int i_15_ = 0; i_15_ < i_13_; i_15_++)
		    anIntArray756[i_15_] = (i_15_ << 12) / i_13_;
	    } else
		anIntArray756 = anIntArray759;
	    anInt757 = 168658577 * i_13_;
	}
    }
    
    public static void method1066(int i, int i_16_) {
	if (i != 736531093 * anInt760) {
	    anIntArray759 = new int[i];
	    for (int i_17_ = 0; i_17_ < i; i_17_++)
		anIntArray759[i_17_] = (i_17_ << 12) / i;
	    anInt760 = i * 994355389;
	}
	if (anInt757 * 1270807153 != i_16_) {
	    if (i_16_ != anInt760 * 736531093) {
		anIntArray756 = new int[i_16_];
		for (int i_18_ = 0; i_18_ < i_16_; i_18_++)
		    anIntArray756[i_18_] = (i_18_ << 12) / i_16_;
	    } else
		anIntArray756 = anIntArray759;
	    anInt757 = 168658577 * i_16_;
	}
    }
    
    Class66() throws Throwable {
	throw new Error();
    }
    
    public static void method1067(int i, int i_19_, int i_20_, int i_21_,
				  int i_22_, int i_23_, int i_24_, int i_25_) {
	Class528_Sub9 class528_sub9 = null;
	for (Class528_Sub9 class528_sub9_26_
		 = ((Class528_Sub9)
		    Class528_Sub9.aClass688_10287.method8034(1422845432));
	     null != class528_sub9_26_;
	     class528_sub9_26_ = (Class528_Sub9) Class528_Sub9
						     .aClass688_10287
						     .method8037(-663868748)) {
	    if (i == (1377052225
		      * ((Class528_Sub9) class528_sub9_26_).anInt10289)
		&& i_19_ == class528_sub9_26_.anInt10276 * -419484275
		&& i_20_ == 1250348405 * class528_sub9_26_.anInt10288
		&& i_21_ == -1126754717 * (((Class528_Sub9) class528_sub9_26_)
					   .anInt10275)) {
		class528_sub9 = class528_sub9_26_;
		break;
	    }
	}
	if (class528_sub9 == null) {
	    class528_sub9 = new Class528_Sub9();
	    ((Class528_Sub9) class528_sub9).anInt10289 = -193009215 * i;
	    ((Class528_Sub9) class528_sub9).anInt10275 = 769661771 * i_21_;
	    class528_sub9.anInt10276 = i_19_ * -2046894779;
	    class528_sub9.anInt10288 = i_20_ * -677389603;
	    if (i_19_ >= 0 && i_20_ >= 0
		&& i_19_ < client.gameScene.method6029((short) 22155)
		&& i_20_ < client.gameScene.method5967(1694013264))
		Class181_Sub5.method8958(class528_sub9, 1317018922);
	    Class528_Sub9.aClass688_10287.method8031(class528_sub9, (byte) 81);
	}
	class528_sub9.anInt10281 = i_22_ * -1188402619;
	((Class528_Sub9) class528_sub9).anInt10283 = i_23_ * -1952474425;
	class528_sub9.anInt10282 = i_24_ * -1707519795;
	((Class528_Sub9) class528_sub9).aBool10285 = true;
	((Class528_Sub9) class528_sub9).aBool10277 = false;
    }
}
