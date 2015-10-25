/* RuntimeException_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class RuntimeException_Sub4 extends RuntimeException
{
    public static int anInt11930;
    public static String aString11931;
    static Interface59 anInterface59_11932 = null;
    public static Applet anApplet11933;
    String aString11934;
    static long aLong11935;
    Throwable aThrowable11936;
    
    RuntimeException_Sub4(Throwable throwable, String string) {
	((RuntimeException_Sub4) this).aString11934 = string;
	((RuntimeException_Sub4) this).aThrowable11936 = throwable;
	initCause(throwable);
    }
}
