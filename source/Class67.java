/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class67 implements IClientEnum
{
    public static Class67 aClass67_761;
    int anInt762;
    public static Class67 aClass67_763 = new Class67(0);
    public static Class446 aClass446_764;
    static int anInt765;
    
    public int method68() {
	return ((Class67) this).anInt762 * -1252430991;
    }
    
    public int method72() {
	return ((Class67) this).anInt762 * -1252430991;
    }
    
    static {
	aClass67_761 = new Class67(1);
    }
    
    public int method5() {
	return ((Class67) this).anInt762 * -1252430991;
    }
    
    public int method6() {
	return ((Class67) this).anInt762 * -1252430991;
    }
    
    Class67(int i) {
	((Class67) this).anInt762 = 1937241489 * i;
    }
    
    public int method71() {
	return ((Class67) this).anInt762 * -1252430991;
    }
    
    public int method73() {
	return ((Class67) this).anInt762 * -1252430991;
    }
    
    static Class528_Sub38 method1068(int i) {
	Class23 class23 = null;
	Class528_Sub38 class528_sub38
	    = new Class528_Sub38(client.aClass673_11108, 0);
	try {
	    class23
		= Class223.method3160("", client.aClass673_11108.aString8534,
				      false, (byte) 15);
	    byte[] is = new byte[(int) class23.method680(-2069633227)];
	    int i_0_;
	    for (int i_1_ = 0; i_1_ < is.length; i_1_ += i_0_) {
		i_0_ = class23.method692(is, i_1_, is.length - i_1_,
					 2104581795);
		if (i_0_ == -1)
		    throw new IOException();
	    }
	    class528_sub38 = new Class528_Sub38(new ByteBuffer(is),
						client.aClass673_11108, 0);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class23 != null)
		class23.method683((byte) 36);
	} catch (Exception exception) {
	    /* empty */
	}
	return class528_sub38;
    }
}
