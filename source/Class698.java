/* Class698 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class698 implements IClientEnum
{
    public static Class698 aClass698_8719;
    static Class698 aClass698_8720;
    static Class698 aClass698_8721;
    public static Class698 aClass698_8722;
    static Class698 aClass698_8723;
    static Class698 aClass698_8724;
    static Class698 aClass698_8725;
    int anInt8726;
    static Class698 aClass698_8727;
    public static Class698 aClass698_8728 = new Class698(-2);
    
    Class698(int i) {
	((Class698) this).anInt8726 = i * 1932143599;
    }
    
    public int method68() {
	return ((Class698) this).anInt8726 * -2062130417;
    }
    
    public int method72() {
	return ((Class698) this).anInt8726 * -2062130417;
    }
    
    public int method5() {
	return ((Class698) this).anInt8726 * -2062130417;
    }
    
    static {
	aClass698_8719 = new Class698(-3);
	aClass698_8721 = new Class698(2);
	aClass698_8722 = new Class698(3);
	aClass698_8723 = new Class698(4);
	aClass698_8724 = new Class698(5);
	aClass698_8725 = new Class698(6);
	aClass698_8720 = new Class698(7);
	aClass698_8727 = new Class698(8);
    }
    
    public int method73() {
	return ((Class698) this).anInt8726 * -2062130417;
    }
    
    public int method71() {
	return ((Class698) this).anInt8726 * -2062130417;
    }
    
    public int method6() {
	return ((Class698) this).anInt8726 * -2062130417;
    }
    
    static final void method8208(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub9_10582
		  .method9890((byte) 16);
    }
    
    static final void method8209(int i, int i_0_, int i_1_, boolean bool,
				 int i_2_) {
	if (Class256.method3468(i, null, (byte) 0))
	    Class302.method4033((Class380.aClass226Array3970[i]
				 .aClass229Array2336),
				-1, i_0_, i_1_, bool, -458536317);
    }
    
    public static Class564 method8210(ByteBuffer class528_sub42, int i) {
	int i_3_ = class528_sub42.readUnsignedByte((byte) 96);
	int[] is = new int[i_3_];
	for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
	    is[i_4_] = class528_sub42.readUnsignedByte((byte) 10);
	return new Class564(is);
    }
    
    public static void method8211(String string, int i) {
	if (client.aBool10899
	    && (Class296.anInt3249 * -856748185 & 0x18) != 0) {
	    boolean bool = false;
	    int i_5_ = 1087758653 * GPI.localPlayerCount;
	    int[] is = GPI.localPlayerIndicies;
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
		Player class645_sub1_sub5_sub1_sub2
		    = client.localPlayers[is[i_6_]];
		if (class645_sub1_sub5_sub1_sub2.displayUnfiltered != null
		    && class645_sub1_sub5_sub1_sub2.displayUnfiltered
			   .equalsIgnoreCase(string)
		    && (((Class108.myPlayer
			  == class645_sub1_sub5_sub1_sub2)
			 && (Class296.anInt3249 * -856748185 & 0x10) != 0)
			|| 0 != (-856748185 * Class296.anInt3249 & 0x8))) {
		    Class528_Sub34 class528_sub34
			= Class656.method7845(OutgoingOpcode.aClass403_4496,
					      (client.aClass109_10930
					       .aClass10_1379),
					      -2061334009);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeLEShortA(is[i_6_], -2073669648);
		    class528_sub34.aClass528_Sub42_Sub2_10481.writeLEShortA
			(1961354633 * client.anInt11053, -1973824271);
		    class528_sub34.aClass528_Sub42_Sub2_10481
			.writeByte(0, (byte) 16);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9660
			(-1114833639 * client.anInt11052, 804784074);
		    class528_sub34.aClass528_Sub42_Sub2_10481.method9671
			(-771216895 * Class487.anInt5494, 668499139);
		    client.aClass109_10930.method1380(class528_sub34,
						      274443107);
		    Class568.method6847((class645_sub1_sub5_sub1_sub2
					 .sceneXQueue[0]),
					(class645_sub1_sub5_sub1_sub2
					 .sceneYQueue[0]),
					-1981652076);
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
					   (string).toString(), (byte) -32);
	    if (client.aBool10899)
		Class7.method565(-1187426900);
	}
    }
    
    static void method8212(Class689 class689, int i) {
	Class75.aClass689_790 = class689;
	Class43.aString529 = null;
    }
}
