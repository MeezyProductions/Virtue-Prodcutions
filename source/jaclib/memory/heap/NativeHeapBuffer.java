/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;
import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source
{
    private int anInt1074;
    public NativeHeap aNativeHeap1075;
    private int anInt1076;
    private boolean aBool1077 = true;
    
    NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
	aNativeHeap1075 = nativeheap;
	anInt1076 = i * 1959627801;
	anInt1074 = i_0_ * 1089640499;
    }
    
    private final synchronized boolean method1167() {
	return aNativeHeap1075.method1341() && aBool1077;
    }
    
    public final long method2() {
	return aNativeHeap1075.getBufferAddress(2135625769 * anInt1076);
    }
    
    public final int method1() {
	return anInt1074 * 140124923;
    }
    
    public final synchronized void method3(byte[] is, int i, int i_1_,
					   int i_2_) {
	if (!method1167() | null == is | i < 0 | i + i_2_ > is.length
	    | i_1_ < 0 | i_2_ + i_1_ > 140124923 * anInt1074)
	    throw new RuntimeException();
	aNativeHeap1075.put(anInt1076 * 2135625769, is, i, i_1_, i_2_);
    }
    
    public final synchronized void method1168() {
	if (method1167())
	    aNativeHeap1075.deallocateBuffer(2135625769 * anInt1076);
	aBool1077 = false;
    }
    
    protected final synchronized void finalize() throws Throwable {
	super.finalize();
	method1168();
    }
    
    public final synchronized void method4(byte[] is, int i, int i_3_,
					   int i_4_) {
	if (!method1167() | null == is | i < 0 | i + i_4_ > is.length
	    | i_3_ < 0 | i_4_ + i_3_ > 140124923 * anInt1074)
	    throw new RuntimeException();
	aNativeHeap1075.put(anInt1076 * 2135625769, is, i, i_3_, i_4_);
    }
    
    protected final synchronized void method1169() throws Throwable {
	super.finalize();
	method1168();
    }
    
    protected final synchronized void method1170() throws Throwable {
	super.finalize();
	method1168();
    }
    
    protected final synchronized void method1171() throws Throwable {
	super.finalize();
	method1168();
    }
    
    protected final synchronized void method1172() throws Throwable {
	super.finalize();
	method1168();
    }
    
    public final int method5() {
	return anInt1074 * 140124923;
    }
    
    public final int method6() {
	return anInt1074 * 140124923;
    }
    
    public final long method7() {
	return aNativeHeap1075.getBufferAddress(2135625769 * anInt1076);
    }
    
    private final synchronized boolean method1173() {
	return aNativeHeap1075.method1341() && aBool1077;
    }
    
    private final synchronized boolean method1174() {
	return aNativeHeap1075.method1341() && aBool1077;
    }
}
