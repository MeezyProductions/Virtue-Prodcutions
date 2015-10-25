/* Exception_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub7 extends Exception
{
    public String aString11223;
    public int anInt11224;
    
    Exception_Sub7(int i, String string) {
	this(i, string, null);
    }
    
    Exception_Sub7(int i, String string, Throwable throwable) {
	super(throwable);
	aString11223 = string;
	anInt11224 = -2064207179 * i;
    }
}
