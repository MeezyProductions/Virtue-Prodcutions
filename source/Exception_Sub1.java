/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub1 extends Exception
{
    public String aString11213;
    public int anInt11214;
    
    public Exception_Sub1(int i, String string) {
	this(i, string, null);
    }
    
    public Exception_Sub1(int i, String string, Throwable throwable) {
	super(throwable);
	aString11213 = string;
	anInt11214 = i * -802814287;
    }
}
