/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source
{
    private int anInt2219 = 1077839139;
    private long aLong2220;
    
    protected NativeBuffer() {
	/* empty */
    }
    
    public final int method1() {
	return anInt2219 * 289549685;
    }
    
    public final long method2() {
	return aLong2220 * 172108402354646573L;
    }
    
    public void method3(byte[] is, int i, int i_0_, int i_1_) {
	if (0L == aLong2220 * 172108402354646573L | is == null | i < 0
	    | i_1_ + i > is.length | i_0_ < 0
	    | i_1_ + i_0_ > 289549685 * anInt2219)
	    throw new RuntimeException();
	put(aLong2220 * 172108402354646573L, is, i, i_0_, i_1_);
    }
    
    private final native void get(long l, byte[] is, int i, int i_2_,
				  int i_3_);
    
    private final native void put(long l, byte[] is, int i, int i_4_,
				  int i_5_);
    
    public void method4(byte[] is, int i, int i_6_, int i_7_) {
	if (0L == aLong2220 * 172108402354646573L | is == null | i < 0
	    | i_7_ + i > is.length | i_6_ < 0
	    | i_7_ + i_6_ > 289549685 * anInt2219)
	    throw new RuntimeException();
	put(aLong2220 * 172108402354646573L, is, i, i_6_, i_7_);
    }
    
    public final int method5() {
	return anInt2219 * 289549685;
    }
    
    public final int method6() {
	return anInt2219 * 289549685;
    }
    
    public final long method7() {
	return aLong2220 * 172108402354646573L;
    }
}
