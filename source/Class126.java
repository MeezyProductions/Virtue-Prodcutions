/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

public class Class126
{
    Class173_Sub2 aClass173_Sub2_1564;
    Buffer aBuffer1565;
    
    void method1613(byte[] is, int i) {
	if (((Class126) this).aBuffer1565 == null
	    || ((Class126) this).aBuffer1565.method1() < i)
	    ((Class126) this).aBuffer1565
		= ((Class173_Sub2) ((Class126) this).aClass173_Sub2_1564)
		      .aNativeHeap9459.method1342(i, false);
	((Class126) this).aBuffer1565.method3(is, 0, 0, i);
    }
    
    Class126(Class173_Sub2 class173_sub2, byte[] is, int i) {
	((Class126) this).aClass173_Sub2_1564 = class173_sub2;
	((Class126) this).aBuffer1565
	    = ((Class173_Sub2) ((Class126) this).aClass173_Sub2_1564)
		  .aNativeHeap9459.method1342(i, false);
	if (is != null)
	    ((Class126) this).aBuffer1565.method3(is, 0, 0, i);
    }
    
    void method1614(byte[] is, int i) {
	if (((Class126) this).aBuffer1565 == null
	    || ((Class126) this).aBuffer1565.method1() < i)
	    ((Class126) this).aBuffer1565
		= ((Class173_Sub2) ((Class126) this).aClass173_Sub2_1564)
		      .aNativeHeap9459.method1342(i, false);
	((Class126) this).aBuffer1565.method3(is, 0, 0, i);
    }
    
    Class126(Class173_Sub2 class173_sub2, Buffer buffer) {
	((Class126) this).aClass173_Sub2_1564 = class173_sub2;
	((Class126) this).aBuffer1565 = buffer;
    }
}
