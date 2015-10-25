/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class439
{
    public static final int anInt4890 = 5;
    public static final int anInt4891 = 3;
    static short aShort4892;
    public static final int anInt4893 = 1;
    public static final int anInt4894 = 2;
    public static final int anInt4895 = 6;
    public static final int anInt4896 = 4;
    public static short[][] aShortArrayArray4897;
    
    Class439() throws Throwable {
	throw new Error();
    }
    
    public static Class551 method5301(Socket socket, int i, int i_0_)
	throws IOException {
	return new Class551_Sub1(socket, i);
    }
    
    static final void method5302(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class57.method985(class229, class648, -1971210320);
    }
    
    static final void method5303(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.anInt11050 * 134866607;
    }
    
    static final void method5304(Class648 class648, short i)
	throws Exception_Sub4 {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	Class422 class422
	    = Class422.method5051((float) i_1_, (float) i_1_, (float) i_1_);
	if (class422.aFloat4780 == -1.0F)
	    class422.aFloat4780 = Float.POSITIVE_INFINITY;
	if (class422.aFloat4776 == -1.0F)
	    class422.aFloat4776 = Float.POSITIVE_INFINITY;
	if (-1.0F == class422.aFloat4777)
	    class422.aFloat4777 = Float.POSITIVE_INFINITY;
	Class495.aClass283_Sub1_5578.method3768(class422, (byte) 52);
	Class495.aClass283_Sub1_5578.method3770((float) i_2_ / 1000.0F,
						-429689235);
	class422.method5054();
    }
}
