/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class443 implements Comparable
{
    long aLong4910;
    Object anObject4911;
    long aLong4912;
    Object anObject4913;
    
    int method5314(Class443 class443_0_, int i) {
	if (((Class443) this).aLong4910 * 4924720375732968735L
	    < ((Class443) class443_0_).aLong4910 * 4924720375732968735L)
	    return -1;
	if (((Class443) this).aLong4910 * 4924720375732968735L
	    > ((Class443) class443_0_).aLong4910 * 4924720375732968735L)
	    return 1;
	return 0;
    }
    
    public boolean equals(Object object) {
	if (object instanceof Class443)
	    return ((Class443) this).anObject4911
		       .equals(((Class443) (Class443) object).anObject4911);
	throw new IllegalArgumentException();
    }
    
    public int hashCode() {
	return ((Class443) this).anObject4911.hashCode();
    }
    
    public int compareTo(Object object) {
	return method5314((Class443) object, -1185856045);
    }
    
    public boolean method5315(Object object) {
	if (object instanceof Class443)
	    return ((Class443) this).anObject4911
		       .equals(((Class443) (Class443) object).anObject4911);
	throw new IllegalArgumentException();
    }
    
    public boolean method5316(Object object) {
	if (object instanceof Class443)
	    return ((Class443) this).anObject4911
		       .equals(((Class443) (Class443) object).anObject4911);
	throw new IllegalArgumentException();
    }
    
    Class443(Object object, Object object_1_) {
	((Class443) this).anObject4913 = object;
	((Class443) this).anObject4911 = object_1_;
    }
    
    public int method5317() {
	return ((Class443) this).anObject4911.hashCode();
    }
    
    public int method5318() {
	return ((Class443) this).anObject4911.hashCode();
    }
    
    public int method5319() {
	return ((Class443) this).anObject4911.hashCode();
    }
    
    public static boolean method5320(int i, int i_2_, int i_3_) {
	if (!Class28.aBool273)
	    return false;
	int i_4_ = i >> 16;
	int i_5_ = i & 0xffff;
	if (null == Class380.aClass226Array3970[i_4_]
	    || (null
		== Class380.aClass226Array3970[i_4_].aClass229Array2336[i_5_]))
	    return false;
	Class229 class229
	    = Class380.aClass226Array3970[i_4_].aClass229Array2336[i_5_];
	if (i_2_ != -1 || class229.anInt2378 * -319431967 != 0) {
	    for (Class528_Sub21_Sub11 class528_sub21_sub11
		     = ((Class528_Sub21_Sub11)
			Class28.aClass688_274.method8034(2111452524));
		 class528_sub21_sub11 != null;
		 class528_sub21_sub11
		     = ((Class528_Sub21_Sub11)
			Class28.aClass688_274.method8037(-23325493))) {
		if ((((Class528_Sub21_Sub11) class528_sub21_sub11).anInt11593
		     * 517389195) == i_2_
		    && (1000490939 * ((Class528_Sub21_Sub11)
				      class528_sub21_sub11).anInt11590
			== 306930455 * class229.anInt2376)
		    && (382057983 * ((Class528_Sub21_Sub11)
				     class528_sub21_sub11).anInt11595 == 58
			|| 1007 == 382057983 * (((Class528_Sub21_Sub11)
						 class528_sub21_sub11)
						.anInt11595)
			|| (((Class528_Sub21_Sub11) class528_sub21_sub11)
			    .anInt11595) * 382057983 == 25
			|| 57 == 382057983 * ((Class528_Sub21_Sub11)
					      class528_sub21_sub11).anInt11595
			|| (382057983 * ((Class528_Sub21_Sub11)
					 class528_sub21_sub11).anInt11595
			    == 30)))
		    return true;
	    }
	} else {
	    for (Class528_Sub21_Sub11 class528_sub21_sub11
		     = ((Class528_Sub21_Sub11)
			Class28.aClass688_274.method8034(1720416545));
		 null != class528_sub21_sub11;
		 class528_sub21_sub11
		     = ((Class528_Sub21_Sub11)
			Class28.aClass688_274.method8037(-765813833))) {
		if (58 == 382057983 * ((Class528_Sub21_Sub11)
				       class528_sub21_sub11).anInt11595
		    || 382057983 * ((Class528_Sub21_Sub11)
				    class528_sub21_sub11).anInt11595 == 1007
		    || 382057983 * ((Class528_Sub21_Sub11)
				    class528_sub21_sub11).anInt11595 == 25
		    || 57 == 382057983 * ((Class528_Sub21_Sub11)
					  class528_sub21_sub11).anInt11595
		    || 30 == (((Class528_Sub21_Sub11) class528_sub21_sub11)
			      .anInt11595) * 382057983) {
		    for (Class229 class229_6_
			     = (Class623_Sub1.method9755
				((((Class528_Sub21_Sub11) class528_sub21_sub11)
				  .anInt11590) * 1000490939,
				 (byte) 75));
			 class229_6_ != null;
			 class229_6_
			     = Class242.method3379((Class380.aClass226Array3970
						    [(class229_6_.anInt2376
						      * 306930455) >> 16]),
						   class229_6_, (byte) -79)) {
			if (class229_6_.anInt2376 * 306930455
			    == class229.anInt2376 * 306930455)
			    return true;
		    }
		}
	    }
	}
	return false;
    }
    
    public static IClientEnum method5321(IClientEnum[] interface74s, int i,
					 int i_7_) {
	IClientEnum[] interface74s_8_ = interface74s;
	for (int i_9_ = 0; i_9_ < interface74s_8_.length; i_9_++) {
	    IClientEnum iClientEnum = interface74s_8_[i_9_];
	    if (i == iClientEnum.method68())
		return iClientEnum;
	}
	return null;
    }
    
    static Class181 method5322(ByteBuffer class528_sub42, int i) {
	int i_10_ = class528_sub42.readUnsignedByte((byte) 120);
	Class85 class85 = Class528_Sub20.method9428(i_10_, -1502149524);
	Class181 class181 = null;
	switch (class85.anInt855 * 1761095857) {
	case 5:
	    class181 = new Class181_Sub1(class528_sub42);
	    break;
	case 11:
	    class181 = new Class181_Sub3(class528_sub42);
	    break;
	case 2:
	    class181 = new Class181_Sub17(class528_sub42);
	    break;
	case 24:
	    class181 = new Class181_Sub2(class528_sub42);
	    break;
	case 23:
	    class181 = new Class181_Sub14(class528_sub42, true);
	    break;
	case 4:
	    class181 = new Class181_Sub14(class528_sub42, false);
	    break;
	case 26:
	    class181 = new Class181_Sub20(class528_sub42);
	    break;
	case 10:
	    class181 = new Class181_Sub6(class528_sub42, 1, 0);
	    break;
	case 12:
	    class181 = new Class181_Sub6(class528_sub42, 0, 1);
	    break;
	case 15:
	    class181 = new Class181_Sub4(class528_sub42);
	    break;
	case 14:
	    class181 = new Class181_Sub6(class528_sub42, 0, 0);
	    break;
	case 9:
	    class181 = new Class181_Sub12(class528_sub42);
	    break;
	case 30:
	    class181 = new Class181_Sub11(class528_sub42);
	    break;
	case 21:
	    class181 = new Class181_Sub5(class528_sub42);
	    break;
	case 28:
	    class181 = new Class181_Sub18(class528_sub42);
	    break;
	case 18:
	    class181 = new Class181_Sub8(class528_sub42);
	    break;
	case 6:
	    class181 = new Class181_Sub6(class528_sub42, 1, 1);
	    break;
	case 16:
	    class181 = new Class181_Sub15(class528_sub42);
	    break;
	case 1:
	    class181 = new Class181_Sub21(class528_sub42);
	    break;
	case 20:
	    class181 = new Class181_Sub10_Sub1(class528_sub42);
	    break;
	case 19:
	    class181 = new Class181_Sub7(class528_sub42);
	    break;
	case 0:
	    class181 = new Class181_Sub10_Sub2(class528_sub42);
	    break;
	case 13:
	    class181 = new Class181_Sub9(class528_sub42);
	    break;
	case 17:
	    class181 = new Class181_Sub19(class528_sub42);
	    break;
	case 3:
	    class181 = new Class181_Sub13(class528_sub42);
	    break;
	case 27:
	    class181 = new Class181_Sub16(class528_sub42);
	    break;
	case 29:
	    class181 = new Class181_Sub22(class528_sub42);
	    break;
	default:
	    break;
	case 25:
	    class181 = new Class181_Sub23(class528_sub42);
	}
	return class181;
    }
    
    static int method5323
	(NPC class645_sub1_sub5_sub1_sub1, int i) {
	Class299 class299 = class645_sub1_sub5_sub1_sub1.aClass299_12043;
	if (null != class299.anIntArray3302) {
	    class299
		= class299.method3996(Class570.playerVarsProvider,
				      Class570.playerVarsProvider, -2010416649);
	    if (class299 == null)
		return -1;
	}
	int i_11_ = class299.anInt3319 * -187353901;
	RenderType renderType
	    = class645_sub1_sub5_sub1_sub1.getRender(-808629137);
	int i_12_ = class645_sub1_sub5_sub1_sub1.aClass690_Sub3_11803
			.method8068(-772845955);
	if (i_12_ == -1
	    || class645_sub1_sub5_sub1_sub1.aClass690_Sub3_11803.aBool10798)
	    i_11_ = class299.anInt3318 * 1163904713;
	else if (renderType.anInt7660 * 630040273 == i_12_
		 || -1724508225 * renderType.anInt7666 == i_12_
		 || renderType.anInt7679 * 384769079 == i_12_
		 || 888920185 * renderType.anInt7662 == i_12_)
	    i_11_ = -1701765647 * class299.anInt3335;
	else if (renderType.anInt7664 * 1022705985 == i_12_
		 || i_12_ == renderType.anInt7684 * -1467373345
		 || 299271595 * renderType.anInt7667 == i_12_
		 || renderType.anInt7669 * -137509863 == i_12_)
	    i_11_ = class299.anInt3297 * -58040955;
	return i_11_;
    }
    
    public static int method5324(String string, String string_13_, int i) {
	if (!Class581.aBool7626)
	    return 12;
	if (Class591.method7078((byte) 81) != client.aClass109_10930)
	    return 42;
	return Canvas_Sub1.aTwitchTV11693.Login(string, string_13_);
    }
}
