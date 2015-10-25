/* Class417 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class417
{
    public static final int anInt4750 = 14336;
    public static final int anInt4751 = 14;
    public static final int anInt4752 = 16384;
    public static final double aDouble4753 = 2607.5945876176133;
    public static final int anInt4754 = 1024;
    public static final int anInt4755 = 16383;
    public static final int anInt4756 = 16384;
    public static final int anInt4757 = 16383;
    public static final int anInt4758 = 2048;
    public static final int anInt4759 = 4096;
    public static final int anInt4760 = 6144;
    public static final int anInt4761 = 8192;
    public static final int anInt4762 = 10240;
    public static final int anInt4763 = 14;
    public static final int anInt4764 = 12288;
    public static final int anInt4765 = 16384;
    public static int[] anIntArray4766 = new int[16384];
    public static int[] anIntArray4767 = new int[16384];
    
    public static float method4970(int i) {
	i &= 0x3fff;
	return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
    }
    
    static {
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    anIntArray4766[i] = (int) (16384.0 * Math.sin((double) i * d));
	    anIntArray4767[i] = (int) (16384.0 * Math.cos((double) i * d));
	}
    }
    
    Class417() throws Throwable {
	throw new Error();
    }
    
    public static float method4971(int i) {
	i &= 0x3fff;
	return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
    }
}
