/* Class285_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class Class285_Sub1 extends Class285
{
    public Class method41() {
	return Class299.class;
    }
    
    public Definition method42(int i, Interface12 interface12, int i_0_) {
	return new Class299(i, this, interface12);
    }
    
    public Class method45(short i) {
	return Class299.class;
    }
    
    public Class method46() {
	return Class299.class;
    }
    
    public Definition method43(int i, Interface12 interface12) {
	return new Class299(i, this, interface12);
    }
    
    public Class method44() {
	return Class299.class;
    }
    
    Class285_Sub1(boolean bool, Class446 class446, Class668 class668,
		  Class673 class673) {
	super(bool, class446, class668, class673);
    }
    
    static Class method8989(String string, int i)
	throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    static final void method8990(Class648 class648, int i) {
	String string = "";
	if (null != Class141_Sub1.aClipboard8801) {
	    Transferable transferable
		= Class141_Sub1.aClipboard8801.getContents(null);
	    if (transferable != null) {
		try {
		    string
			= (String) transferable.getTransferData(DataFlavor
								.stringFlavor);
		    if (null == string)
			string = "";
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = string;
    }
}
