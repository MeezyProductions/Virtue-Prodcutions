/* Class172_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class172_Sub6 extends Class172
{
    Class151[] aClass151Array9709;
    Class151[] aClass151Array9710;
    int[] anIntArray9711;
    int[] anIntArray9712;
    int[] anIntArray9713;
    Class173_Sub3 aClass173_Sub3_9714;
    int[] anIntArray9715;
    
    void method2135(char c, int i, int i_0_, int i_1_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub6) this).aClass173_Sub3_9714)
		.anIntArray9719)) {
	    i += ((Class172_Sub6) this).anIntArray9715[c];
	    i_0_ += ((Class172_Sub6) this).anIntArray9711[c];
	    if (bool)
		((Class172_Sub6) this).aClass151Array9709[c]
		    .method1780(i, i_0_, 1, i_1_, 1);
	    else
		((Class172_Sub6) this).aClass151Array9710[c]
		    .method1780(i, i_0_, 1, i_1_, 1);
	}
    }
    
    void method2125(char c, int i, int i_2_, int i_3_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub6) this).aClass173_Sub3_9714)
		.anIntArray9719)) {
	    i += ((Class172_Sub6) this).anIntArray9715[c];
	    i_2_ += ((Class172_Sub6) this).anIntArray9711[c];
	    if (bool)
		((Class172_Sub6) this).aClass151Array9709[c]
		    .method1780(i, i_2_, 1, i_3_, 1);
	    else
		((Class172_Sub6) this).aClass151Array9710[c]
		    .method1780(i, i_2_, 1, i_3_, 1);
	}
    }
    
    void method2132(char c, int i, int i_4_, int i_5_, boolean bool,
		    Class148 class148, int i_6_, int i_7_) {
	/* empty */
    }
    
    void method2129(char c, int i, int i_8_, int i_9_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub6) this).aClass173_Sub3_9714)
		.anIntArray9719)) {
	    i += ((Class172_Sub6) this).anIntArray9715[c];
	    i_8_ += ((Class172_Sub6) this).anIntArray9711[c];
	    if (bool)
		((Class172_Sub6) this).aClass151Array9709[c]
		    .method1780(i, i_8_, 1, i_9_, 1);
	    else
		((Class172_Sub6) this).aClass151Array9710[c]
		    .method1780(i, i_8_, 1, i_9_, 1);
	}
    }
    
    void method2134(char c, int i, int i_10_, int i_11_, boolean bool) {
	if (null
	    != (((Class173_Sub3) ((Class172_Sub6) this).aClass173_Sub3_9714)
		.anIntArray9719)) {
	    i += ((Class172_Sub6) this).anIntArray9715[c];
	    i_10_ += ((Class172_Sub6) this).anIntArray9711[c];
	    if (bool)
		((Class172_Sub6) this).aClass151Array9709[c]
		    .method1780(i, i_10_, 1, i_11_, 1);
	    else
		((Class172_Sub6) this).aClass151Array9710[c]
		    .method1780(i, i_10_, 1, i_11_, 1);
	}
    }
    
    void method2139(char c, int i, int i_12_, int i_13_, boolean bool,
		    Class148 class148, int i_14_, int i_15_) {
	/* empty */
    }
    
    Class172_Sub6(Class173_Sub3 class173_sub3, Class1 class1,
		  Class178_Sub1[] class178_sub1s, int[] is, int[] is_16_) {
	super(class173_sub3, class1);
	((Class172_Sub6) this).aClass173_Sub3_9714 = class173_sub3;
	((Class172_Sub6) this).aClass173_Sub3_9714 = class173_sub3;
	((Class172_Sub6) this).anIntArray9712 = is;
	((Class172_Sub6) this).anIntArray9713 = is_16_;
	((Class172_Sub6) this).aClass151Array9710
	    = new Class151[class178_sub1s.length];
	((Class172_Sub6) this).aClass151Array9709
	    = new Class151[class178_sub1s.length];
	((Class172_Sub6) this).anIntArray9711 = new int[class178_sub1s.length];
	((Class172_Sub6) this).anIntArray9715 = new int[class178_sub1s.length];
	for (int i = 0; i < class178_sub1s.length; i++) {
	    ((Class172_Sub6) this).aClass151Array9710[i]
		= ((Class172_Sub6) this).aClass173_Sub3_9714
		      .method2334(class178_sub1s[i], false);
	    int[] is_17_ = (int[]) class178_sub1s[i].method2629(false).clone();
	    for (int i_18_ = 0; i_18_ < is_17_.length; i_18_++) {
		int i_19_ = is_17_[i_18_];
		int i_20_
		    = (byte) ((4 * (i_19_ >> 8 & 0xff)
			       + 3 * (i_19_ >> 16 & 0xff) + (i_19_ & 0xff))
			      >> 3);
		is_17_[i_18_] = (is_17_[i_18_] & ~0xffffff | i_20_ << 16
				 | i_20_ << 8 | i_20_);
	    }
	    ((Class172_Sub6) this).aClass151Array9709[i]
		= (((Class172_Sub6) this).aClass173_Sub3_9714.method2382
		   (is_17_, 0, ((Class172_Sub6) this).anIntArray9712[i],
		    ((Class172_Sub6) this).anIntArray9712[i],
		    ((Class172_Sub6) this).anIntArray9713[i], false));
	    ((Class172_Sub6) this).anIntArray9711[i]
		= class178_sub1s[i].method2605();
	    ((Class172_Sub6) this).anIntArray9715[i]
		= class178_sub1s[i].method2603();
	}
    }
    
    void method2137(char c, int i, int i_21_, int i_22_, boolean bool,
		    Class148 class148, int i_23_, int i_24_) {
	/* empty */
    }
    
    void method2138(char c, int i, int i_25_, int i_26_, boolean bool,
		    Class148 class148, int i_27_, int i_28_) {
	/* empty */
    }
    
    void method2136(char c, int i, int i_29_, int i_30_, boolean bool,
		    Class148 class148, int i_31_, int i_32_) {
	/* empty */
    }
}
