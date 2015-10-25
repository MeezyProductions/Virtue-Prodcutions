/* Class691_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class691_Sub16 extends Class691
{
    public static final int anInt10739 = 1;
    public static final int anInt10740 = 0;
    static Class151[] aClass151Array10741;
    
    void method8128(int i, byte i_0_) {
	anInt8681 = -1594538169 * i;
    }
    
    public Class691_Sub16(Class528_Sub38 class528_sub38) {
	super(class528_sub38);
    }
    
    public boolean method9948() {
	return true;
    }
    
    int method8125(int i) {
	return 1;
    }
    
    public boolean method9949(int i) {
	return true;
    }
    
    public int method8126(int i, int i_1_) {
	if (i != 0
	    && (aClass528_Sub38_8685.aClass691_Sub21_10583.method9982((byte) 0)
		== 2))
	    return 3;
	if (i == 0 || aClass528_Sub38_8685.aClass691_Sub23_10606
			  .method10004(2089765808) == 1)
	    return 1;
	return 2;
    }
    
    public int method9950() {
	return -1318047113 * anInt8681;
    }
    
    public Class691_Sub16(int i, Class528_Sub38 class528_sub38) {
	super(i, class528_sub38);
    }
    
    int method8129() {
	return 1;
    }
    
    int method8130() {
	return 1;
    }
    
    public int method8127(int i) {
	if (i != 0
	    && (aClass528_Sub38_8685.aClass691_Sub21_10583.method9982((byte) 0)
		== 2))
	    return 3;
	if (i == 0 || aClass528_Sub38_8685.aClass691_Sub23_10606
			  .method10004(1030879530) == 1)
	    return 1;
	return 2;
    }
    
    void method8132(int i) {
	anInt8681 = -1594538169 * i;
    }
    
    public void method9951(int i) {
	if (anInt8681 * -1318047113 != 0
	    && aClass528_Sub38_8685.aClass691_Sub23_10606
		   .method10004(-195861821) != 1)
	    anInt8681 = 0;
	if (0 != -1318047113 * anInt8681
	    && (aClass528_Sub38_8685.aClass691_Sub21_10583.method9982((byte) 0)
		== 2))
	    anInt8681 = 0;
	if (-1318047113 * anInt8681 < 0 || anInt8681 * -1318047113 > 1)
	    anInt8681 = method8125(1882534017) * -1594538169;
    }
    
    public boolean method9952() {
	return true;
    }
    
    public int method9953(int i) {
	return -1318047113 * anInt8681;
    }
    
    void method8131(int i) {
	anInt8681 = -1594538169 * i;
    }
    
    static void method9954(long[] ls, Object[] objects, int i, int i_2_,
			   int i_3_) {
	if (i < i_2_) {
	    int i_4_ = (i_2_ + i) / 2;
	    int i_5_ = i;
	    long l = ls[i_4_];
	    ls[i_4_] = ls[i_2_];
	    ls[i_2_] = l;
	    Object object = objects[i_4_];
	    objects[i_4_] = objects[i_2_];
	    objects[i_2_] = object;
	    int i_6_ = l == 9223372036854775807L ? 0 : 1;
	    for (int i_7_ = i; i_7_ < i_2_; i_7_++) {
		if (ls[i_7_] < l + (long) (i_7_ & i_6_)) {
		    long l_8_ = ls[i_7_];
		    ls[i_7_] = ls[i_5_];
		    ls[i_5_] = l_8_;
		    Object object_9_ = objects[i_7_];
		    objects[i_7_] = objects[i_5_];
		    objects[i_5_++] = object_9_;
		}
	    }
	    ls[i_2_] = ls[i_5_];
	    ls[i_5_] = l;
	    objects[i_2_] = objects[i_5_];
	    objects[i_5_] = object;
	    method9954(ls, objects, i, i_5_ - 1, -1780577587);
	    method9954(ls, objects, 1 + i_5_, i_2_, 1720637926);
	}
    }
}
