/* Class419 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class419
{
    static float[] aFloatArray4770 = new float[16384];
    static float[] aFloatArray4771 = new float[16384];
    
    Class419() throws Throwable {
	throw new Error();
    }
    
    static {
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    aFloatArray4770[i] = (float) Math.sin((double) i * d);
	    aFloatArray4771[i] = (float) Math.cos((double) i * d);
	}
    }
}
