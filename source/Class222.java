/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class222 implements Interface42
{
    Class218 this$0;
    
    public float method317() {
	return ((float) Class514.aClass528_Sub38_6967.aClass691_Sub34_10607
			    .method10132((byte) 26)
		/ 255.0F);
    }
    
    public float method318(byte i) {
	return ((float) Class514.aClass528_Sub38_6967.aClass691_Sub34_10607
			    .method10132((byte) 9)
		/ 255.0F);
    }
    
    public float method319() {
	return ((float) Class514.aClass528_Sub38_6967.aClass691_Sub34_10607
			    .method10132((byte) 109)
		/ 255.0F);
    }
    
    Class222(Class218 class218) {
	((Class222) this).this$0 = class218;
    }
    
    static final void method3155(Class648 class648, short i) {
	((Class648) class648).aLongArray8407
	    [(((Class648) class648).anIntArray8414
	      [((Class648) class648).anInt8390 * -630179809])]
	    = (((Class648) class648).aLongArray8398
	       [(((Class648) class648).anInt8399 -= 232005975) * 683825767]);
    }
    
    static final void method3156(Class645_Sub1 class645_sub1, int i,
				 boolean bool, boolean bool_0_, int i_1_) {
	int i_2_;
	int i_3_;
	if (class645_sub1 instanceof Class645_Sub1_Sub5
	    && class645_sub1 instanceof Interface60) {
	    Class645_Sub1_Sub5 class645_sub1_sub5
		= (Class645_Sub1_Sub5) class645_sub1;
	    int i_4_ = ((class645_sub1_sub5.aShort11743
			 - class645_sub1_sub5.aShort11747 + 1)
			<< 9);
	    int i_5_ = (1 + (class645_sub1_sub5.aShort11746
			     - class645_sub1_sub5.aShort11745)
			<< 9);
	    i_2_ = i_4_ / 2 + (class645_sub1_sub5.aShort11747 << 9);
	    i_3_ = i_5_ / 2 + (class645_sub1_sub5.aShort11745 << 9);
	} else {
	    Class422 class422 = class645_sub1.method7693().aClass422_4868;
	    i_2_ = (int) class422.aFloat4780;
	    i_3_ = (int) class422.aFloat4777;
	}
	Class448.method5410(class645_sub1.aByte10675, i_2_, i_3_, 0, i, bool,
			    bool_0_, -431419824);
    }
    
    public static void method3157(String string, int i) {
	Class99.aString1264 = string;
	Class99.anInt1269 = Class99.aString1264.length() * 105656261;
    }
    
    static void method3158(int i) {
	if (-1202639803 * Class99.anInt1263 > 0) {
	    int i_6_ = 0;
	    for (int i_7_ = 0; i_7_ < Class99.aStringArray1259.length;
		 i_7_++) {
		if (Class99.aStringArray1259[i_7_].indexOf("--> ") != -1
		    && ++i_6_ == -1202639803 * Class99.anInt1263) {
		    Class99.aString1264
			= (Class99.aStringArray1259[i_7_].substring
			   (Class99.aStringArray1259[i_7_].indexOf('>') + 2));
		    break;
		}
	    }
	} else
	    Class99.aString1264 = "";
    }
}
