/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class70
{
    public static Object method1085(Applet applet, String string,
				    Object[] objects, int i) throws Throwable {
	return JSObject.getWindow(applet).call(string, objects);
    }
    
    public static Object method1086(Applet applet, String string, byte i)
	throws Throwable {
	return JSObject.getWindow(applet).call(string, null);
    }
    
    public static void method1087(Applet applet, String string, byte i)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    public static void method1088(Applet applet, String string)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    Class70() throws Throwable {
	throw new Error();
    }
}
