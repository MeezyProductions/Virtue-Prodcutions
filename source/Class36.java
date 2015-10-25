/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class36
{
    public static Class36 aClass36_331;
    public static Class36 aClass36_332 = new Class36();
    public static Class36 aClass36_333 = new Class36();
    public static Class36 aClass36_334;
    static Class229 aClass229_335;
    
    static final void method785(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class649.method7730((char) i_0_, -1005250399) ? 1 : 0;
    }
    
    static {
	aClass36_331 = new Class36();
	aClass36_334 = new Class36();
    }
    
    static final void method786(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class7 class7
	    = (Class7) Class551.aClass5_Sub17_7422.method63(i_1_, 1780027487);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class7.method550(2063454189);
    }
    
    static final void method787(Class229 class229, Class648 class648, int i) {
	Class1 class1
	    = class229.method3193(Class625.aClass414_8129,
				  client.anInterface50_10917, (byte) -62);
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Point point = class1.method499(class229.aString2455,
				       -1352480433 * class229.anInt2476,
				       -1557508349 * class229.anInt2380, i_2_,
				       Class298.aClass151Array3262, 33753641);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = point.x;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = point.y;
    }
    
    public static Object method788(byte[] is, boolean bool, byte i) {
	if (null == is)
	    return null;
	if (is.length > 136) {
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
	    bytebuffer.position(0);
	    bytebuffer.put(is);
	    return bytebuffer;
	}
	if (bool)
	    return Arrays.copyOf(is, is.length);
	return is;
    }
    
    Class36() {
	/* empty */
    }
    
    static final void method789(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aShort11144;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aShort11085;
    }
    
    static final void method790(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class318.method4191(class229, class226, class648, (byte) 16);
    }
    
    public static void method791(String string, boolean bool, int i) {
	if (client.anInt10876 * 175711435 == 12
	    && (!Class181.method2686(-1712965615)
		&& !Class528_Sub36.method9535(-49837458))) {
	    Class54.aString640 = string;
	    Class54.aBool671 = bool;
	    Class487.method5890(13, 2130003981);
	}
    }
    
    static final void method792(Class229 class229, Class226 class226,
				Class648 class648, byte i) {
	class229.aBool2416
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	Class39.method811(class229, 1435904523);
    }
}
