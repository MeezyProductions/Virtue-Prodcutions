/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class146
{
    static float[] aFloatArray1662 = new float[16384];
    static float[] aFloatArray1663 = new float[16384];
    
    Class146() throws Throwable {
	throw new Error();
    }
    
    static {
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    aFloatArray1662[i] = (float) Math.sin((double) i * d);
	    aFloatArray1663[i] = (float) Math.cos((double) i * d);
	}
    }
}
