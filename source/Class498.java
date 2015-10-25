/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class498
{
    BitBuffer aClass528_Sub42_Sub2_6836;
    Class489 aClass489_6837;
    
    public Class498(Class489 class489,
		    BitBuffer class528_sub42_sub2) {
	((Class498) this).aClass489_6837 = class489;
	((Class498) this).aClass528_Sub42_Sub2_6836 = class528_sub42_sub2;
    }
    
    public static void method6068
	(Entity class645_sub1_sub5_sub1, int[] is,
	 int[] is_0_, int[] is_1_, int i) {
	for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
	    int i_3_ = is[i_2_];
	    int i_4_ = is_1_[i_2_];
	    int i_5_ = is_0_[i_2_];
	    for (int i_6_ = 0;
		 0 != i_4_ && i_6_ < (class645_sub1_sub5_sub1
				      .aClass690_Sub1_Sub1Array11804).length;
		 i_4_ >>>= 1) {
		if (0 != (i_4_ & 0x1)) {
		    if (i_3_ == -1)
			class645_sub1_sub5_sub1
			    .aClass690_Sub1_Sub1Array11804[i_6_]
			    = null;
		    else {
			Class190 class190
			    = (Class190) Class379.aClass5_Sub4_3966
					     .method63(i_3_, -1693401860);
			int i_7_ = 1575787233 * class190.anInt2156;
			Class690_Sub1_Sub1 class690_sub1_sub1
			    = (class645_sub1_sub5_sub1
			       .aClass690_Sub1_Sub1Array11804[i_6_]);
			if (class690_sub1_sub1 != null
			    && class690_sub1_sub1.method8067((byte) 64)) {
			    if (i_3_
				== class690_sub1_sub1.method8068(-772845955)) {
				if (i_7_ == 0) {
				    class645_sub1_sub5_sub1
					.aClass690_Sub1_Sub1Array11804[i_6_]
					= null;
				    class690_sub1_sub1 = null;
				} else if (1 == i_7_) {
				    class690_sub1_sub1.method8084(-527997842);
				    class690_sub1_sub1.anInt11700
					= 1091703985 * i_5_;
				} else if (2 == i_7_)
				    class690_sub1_sub1.method8083((byte) 9);
			    } else if (class190.anInt2150 * -449880687
				       >= ((class690_sub1_sub1.method8073
					    (-427695401).anInt2150)
					   * -449880687)) {
				class645_sub1_sub5_sub1
				    .aClass690_Sub1_Sub1Array11804[i_6_]
				    = null;
				class690_sub1_sub1 = null;
			    }
			}
			if (class690_sub1_sub1 == null
			    || !class690_sub1_sub1.method8067((byte) 70)) {
			    class690_sub1_sub1
				= class645_sub1_sub5_sub1
				      .aClass690_Sub1_Sub1Array11804[i_6_]
				= (new Class690_Sub1_Sub1
				   (class645_sub1_sub5_sub1));
			    class690_sub1_sub1.method8069(i_3_, (byte) 12);
			    class690_sub1_sub1.anInt11700 = 1091703985 * i_5_;
			}
		    }
		}
		i_6_++;
	    }
	}
    }
    
    static boolean method6069(int i, int i_8_) {
	return i == 8 || i == 12 || 13 == i || i == 9;
    }
    
    public static void method6070(Interface72 interface72, int i) {
	if (IcmpService_Sub1.anIcmpService_Sub1_10611 == null)
	    throw new IllegalStateException("");
	((IcmpService_Sub1) IcmpService_Sub1.anIcmpService_Sub1_10611)
	    .aList10610.add(interface72);
    }
    
    static void method6071(byte i) {
	Class220.anIntArray2326
	    = RenderType.method6993(2048, 35, 8, 8, 4, 0.4F, true, (short) 222);
    }
}
