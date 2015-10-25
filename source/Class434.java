/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class434
{
    public float[] aFloatArray4844 = new float[9];
    
    void method5258() {
	aFloatArray4844[0] = 1.0F;
	aFloatArray4844[1] = 0.0F;
	aFloatArray4844[2] = 0.0F;
	aFloatArray4844[3] = 0.0F;
	aFloatArray4844[4] = 1.0F;
	aFloatArray4844[5] = 0.0F;
	aFloatArray4844[6] = 0.0F;
	aFloatArray4844[7] = 0.0F;
	aFloatArray4844[8] = 1.0F;
    }
    
    public Class430 method5259() {
	Class430 class430 = new Class430();
	double d = (double) (1.0F + aFloatArray4844[0] + aFloatArray4844[4]
			     + aFloatArray4844[8]);
	if (d > 1.0E-8) {
	    float f = (float) (Math.sqrt(d) * 2.0);
	    class430.aFloat4816
		= (aFloatArray4844[7] - aFloatArray4844[5]) / f;
	    class430.aFloat4819
		= (aFloatArray4844[2] - aFloatArray4844[6]) / f;
	    class430.aFloat4818
		= (aFloatArray4844[3] - aFloatArray4844[1]) / f;
	    class430.aFloat4815 = 0.25F * f;
	} else if (aFloatArray4844[0] > aFloatArray4844[4]
		   && aFloatArray4844[0] > aFloatArray4844[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4844[0]
						   - aFloatArray4844[4]
						   - aFloatArray4844[8]))
			       * 2.0);
	    class430.aFloat4816 = 0.25F * f;
	    class430.aFloat4819
		= (aFloatArray4844[3] + aFloatArray4844[1]) / f;
	    class430.aFloat4818
		= (aFloatArray4844[2] + aFloatArray4844[6]) / f;
	    class430.aFloat4815
		= (aFloatArray4844[7] - aFloatArray4844[5]) / f;
	} else if (aFloatArray4844[4] > aFloatArray4844[8]) {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4844[4]
						   - aFloatArray4844[0]
						   - aFloatArray4844[8]))
			       * 2.0);
	    class430.aFloat4816
		= (aFloatArray4844[3] + aFloatArray4844[1]) / f;
	    class430.aFloat4819 = 0.25F * f;
	    class430.aFloat4818
		= (aFloatArray4844[7] + aFloatArray4844[5]) / f;
	    class430.aFloat4815
		= (aFloatArray4844[2] - aFloatArray4844[6]) / f;
	} else {
	    float f = (float) (Math.sqrt((double) (1.0F + aFloatArray4844[8]
						   - aFloatArray4844[0]
						   - aFloatArray4844[4]))
			       * 2.0);
	    class430.aFloat4816
		= (aFloatArray4844[2] + aFloatArray4844[6]) / f;
	    class430.aFloat4819
		= (aFloatArray4844[7] + aFloatArray4844[5]) / f;
	    class430.aFloat4818 = 0.25F * f;
	    class430.aFloat4815
		= (aFloatArray4844[3] - aFloatArray4844[1]) / f;
	}
	return class430;
    }
    
    void method5260() {
	aFloatArray4844[0] = 1.0F;
	aFloatArray4844[1] = 0.0F;
	aFloatArray4844[2] = 0.0F;
	aFloatArray4844[3] = 0.0F;
	aFloatArray4844[4] = 1.0F;
	aFloatArray4844[5] = 0.0F;
	aFloatArray4844[6] = 0.0F;
	aFloatArray4844[7] = 0.0F;
	aFloatArray4844[8] = 1.0F;
    }
    
    public Class434() {
	method5260();
    }
    
    void method5261() {
	aFloatArray4844[0] = 1.0F;
	aFloatArray4844[1] = 0.0F;
	aFloatArray4844[2] = 0.0F;
	aFloatArray4844[3] = 0.0F;
	aFloatArray4844[4] = 1.0F;
	aFloatArray4844[5] = 0.0F;
	aFloatArray4844[6] = 0.0F;
	aFloatArray4844[7] = 0.0F;
	aFloatArray4844[8] = 1.0F;
    }
    
    void method5262() {
	aFloatArray4844[0] = 1.0F;
	aFloatArray4844[1] = 0.0F;
	aFloatArray4844[2] = 0.0F;
	aFloatArray4844[3] = 0.0F;
	aFloatArray4844[4] = 1.0F;
	aFloatArray4844[5] = 0.0F;
	aFloatArray4844[6] = 0.0F;
	aFloatArray4844[7] = 0.0F;
	aFloatArray4844[8] = 1.0F;
    }
}
