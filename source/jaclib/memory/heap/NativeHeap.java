/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap
{
    long peer;
    private int anInt1303;
    private boolean aBool1304;
    
    public NativeHeap(int i) {
	anInt1303 = i * 1987197785;
	allocateHeap(399793385 * anInt1303);
	aBool1304 = true;
    }
    
    synchronized boolean method1341() {
	return aBool1304;
    }
    
    public NativeHeapBuffer method1342(int i, boolean bool) {
	if (!aBool1304)
	    throw new IllegalStateException();
	return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }
    
    public synchronized void method1343() {
	if (aBool1304)
	    deallocateHeap();
	aBool1304 = false;
    }
    
    private native void allocateHeap(int i);
    
    private native void deallocateHeap();
    
    synchronized native int allocateBuffer(int i, boolean bool);
    
    synchronized native long getBufferAddress(int i);
    
    synchronized native void get(int i, byte[] is, int i_0_, int i_1_,
				 int i_2_);
    
    synchronized native void put(int i, byte[] is, int i_3_, int i_4_,
				 int i_5_);
    
    synchronized native void deallocateBuffer(int i);
    
    public synchronized native void copy(long l, long l_6_, int i);
    
    protected synchronized void finalize() throws Throwable {
	super.finalize();
	method1343();
    }
    
    protected synchronized void method1344() throws Throwable {
	super.finalize();
	method1343();
    }
    
    protected synchronized void method1345() throws Throwable {
	super.finalize();
	method1343();
    }
    
    protected synchronized void method1346() throws Throwable {
	super.finalize();
	method1343();
    }
    
    protected synchronized void method1347() throws Throwable {
	super.finalize();
	method1343();
    }
    
    synchronized boolean method1348() {
	return aBool1304;
    }
    
    public synchronized void method1349() {
	if (aBool1304)
	    deallocateHeap();
	aBool1304 = false;
    }
    
    public synchronized void method1350() {
	if (aBool1304)
	    deallocateHeap();
	aBool1304 = false;
    }
}
