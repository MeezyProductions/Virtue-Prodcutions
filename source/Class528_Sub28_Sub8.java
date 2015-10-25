/* Class528_Sub28_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub28_Sub8 extends Class528_Sub28
{
    static Class76 aClass76_11468;
    Class343 this$0;
    int anInt11469;
    
    void method9461(ByteBuffer class528_sub42) {
	((Class528_Sub28_Sub8) this).anInt11469
	    = class528_sub42.readUnsignedShort(-990497805) * -177864607;
    }
    
    void method9464(ByteBuffer class528_sub42, int i) {
	((Class528_Sub28_Sub8) this).anInt11469
	    = class528_sub42.readUnsignedShort(-2061127587) * -177864607;
    }
    
    void method9459(Class308 class308, int i) {
	class308.method4087((((Class528_Sub28_Sub8) this).anInt11469
			     * 1847370657),
			    (byte) 24);
    }
    
    void method9462(ByteBuffer class528_sub42) {
	((Class528_Sub28_Sub8) this).anInt11469
	    = class528_sub42.readUnsignedShort(-1884852750) * -177864607;
    }
    
    void method9463(ByteBuffer class528_sub42) {
	((Class528_Sub28_Sub8) this).anInt11469
	    = class528_sub42.readUnsignedShort(-1277898096) * -177864607;
    }
    
    void method9465(Class308 class308) {
	class308.method4087((((Class528_Sub28_Sub8) this).anInt11469
			     * 1847370657),
			    (byte) 22);
    }
    
    void method9460(ByteBuffer class528_sub42) {
	((Class528_Sub28_Sub8) this).anInt11469
	    = class528_sub42.readUnsignedShort(-1304527022) * -177864607;
    }
    
    void method9466(Class308 class308) {
	class308.method4087((((Class528_Sub28_Sub8) this).anInt11469
			     * 1847370657),
			    (byte) -97);
    }
    
    Class528_Sub28_Sub8(Class343 class343) {
	((Class528_Sub28_Sub8) this).this$0 = class343;
	((Class528_Sub28_Sub8) this).anInt11469 = 177864607;
    }
    
    public static void method10424(String string, boolean bool, int i) {
	string = string.toLowerCase();
	Class181_Sub18.anInt9847 = 0;
	if (-1395996705 * client.anInt11116 != 1920054043 * client.anInt11167
	    || bool != client.aBool10961
	    || !string.equals(Class441.aString4902)) {
	    Class441.aString4902 = string;
	    client.anInt11167 = -856586611 * client.anInt11116;
	    client.aBool10961 = bool;
	    short[] is = new short[16];
	    int i_0_ = 0;
	    int i_1_ = bool ? 32768 : 0;
	    int i_2_
		= i_1_ + (bool ? 1435618427 * Class33.aClass46_314.anInt537
			  : Class33.aClass46_314.anInt533 * -1103690081);
	    for (int i_3_ = i_1_; i_3_ < i_2_; i_3_++) {
		Class528_Sub21_Sub4 class528_sub21_sub4
		    = Class33.aClass46_314.method861(i_3_, (byte) -35);
		if (class528_sub21_sub4.aBool11533
		    && class528_sub21_sub4.method10476(-1332021716).toLowerCase
			   ().indexOf(string) != -1) {
		    if (i_0_ >= 50) {
			Class552.anInt7428 = 1211704533;
			Class18.aShortArray207 = null;
			return;
		    }
		    if (i_0_ >= is.length) {
			short[] is_4_ = new short[2 * is.length];
			for (int i_5_ = 0; i_5_ < i_0_; i_5_++)
			    is_4_[i_5_] = is[i_5_];
			is = is_4_;
		    }
		    is[i_0_++] = (short) i_3_;
		}
	    }
	    Class18.aShortArray207 = is;
	    Class552.anInt7428 = -1211704533 * i_0_;
	    String[] strings = new String[939068291 * Class552.anInt7428];
	    for (int i_6_ = 0; i_6_ < 939068291 * Class552.anInt7428; i_6_++)
		strings[i_6_]
		    = Class33.aClass46_314.method861(is[i_6_], (byte) -80)
			  .method10476(1697599894);
	    Class194.method2814(strings, Class18.aShortArray207, 761050906);
	}
    }
}
