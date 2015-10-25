/* Class431 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class431
{
    static float[] aFloatArray4820;
    static float[] aFloatArray4821;
    public float aFloat4822;
    public float aFloat4823;
    public float aFloat4824;
    public float aFloat4825;
    public float aFloat4826;
    public float aFloat4827;
    static float[] aFloatArray4828 = new float[8];
    
    public boolean method5202(int i, int i_0_, int i_1_, int i_2_,
			      Class418 class418, float f, float f_3_,
			      float f_4_, float f_5_) {
	boolean bool = false;
	float f_6_ = 3.4028235E38F;
	float f_7_ = -3.4028235E38F;
	float f_8_ = 3.4028235E38F;
	float f_9_ = -3.4028235E38F;
	aFloatArray4828[0] = aFloat4824;
	aFloatArray4821[0] = aFloat4826;
	aFloatArray4820[0] = aFloat4822;
	aFloatArray4828[1] = aFloat4823;
	aFloatArray4821[1] = aFloat4826;
	aFloatArray4820[1] = aFloat4822;
	aFloatArray4828[2] = aFloat4824;
	aFloatArray4821[2] = aFloat4827;
	aFloatArray4820[2] = aFloat4822;
	aFloatArray4828[3] = aFloat4823;
	aFloatArray4821[3] = aFloat4827;
	aFloatArray4820[3] = aFloat4822;
	aFloatArray4828[4] = aFloat4824;
	aFloatArray4821[4] = aFloat4826;
	aFloatArray4820[4] = aFloat4825;
	aFloatArray4828[5] = aFloat4823;
	aFloatArray4821[5] = aFloat4826;
	aFloatArray4820[5] = aFloat4825;
	aFloatArray4828[6] = aFloat4824;
	aFloatArray4821[6] = aFloat4827;
	aFloatArray4820[6] = aFloat4825;
	aFloatArray4828[7] = aFloat4823;
	aFloatArray4821[7] = aFloat4827;
	aFloatArray4820[7] = aFloat4825;
	for (int i_10_ = 0; i_10_ < 8; i_10_++) {
	    float f_11_ = aFloatArray4828[i_10_];
	    float f_12_ = aFloatArray4821[i_10_];
	    float f_13_ = aFloatArray4820[i_10_];
	    float f_14_ = (class418.aFloatArray4768[2] * f_11_
			   + class418.aFloatArray4768[6] * f_12_
			   + class418.aFloatArray4768[10] * f_13_
			   + class418.aFloatArray4768[14]);
	    float f_15_ = (class418.aFloatArray4768[3] * f_11_
			   + class418.aFloatArray4768[7] * f_12_
			   + class418.aFloatArray4768[11] * f_13_
			   + class418.aFloatArray4768[15]);
	    if (f_14_ >= -f_15_) {
		float f_16_ = (class418.aFloatArray4768[0] * f_11_
			       + class418.aFloatArray4768[4] * f_12_
			       + class418.aFloatArray4768[8] * f_13_
			       + class418.aFloatArray4768[12]);
		float f_17_ = (class418.aFloatArray4768[1] * f_11_
			       + class418.aFloatArray4768[5] * f_12_
			       + class418.aFloatArray4768[9] * f_13_
			       + class418.aFloatArray4768[13]);
		float f_18_ = f + f_4_ * f_16_ / f_15_;
		float f_19_ = f_3_ + f_5_ * f_17_ / f_15_;
		if (f_18_ < f_6_)
		    f_6_ = f_18_;
		if (f_18_ > f_7_)
		    f_7_ = f_18_;
		if (f_19_ < f_8_)
		    f_8_ = f_19_;
		if (f_19_ > f_9_)
		    f_9_ = f_19_;
		bool = true;
	    }
	}
	int i_20_ = i + i_1_;
	int i_21_ = i_0_ + i_2_;
	if (bool && (float) i_20_ > f_6_ && (float) i < f_7_
	    && (float) i_21_ > f_8_ && (float) i_0_ < f_9_)
	    return true;
	return false;
    }
    
    static {
	aFloatArray4821 = new float[8];
	aFloatArray4820 = new float[8];
    }
}
