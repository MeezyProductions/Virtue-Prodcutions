/* Class493 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class493
{
    static String aString5524;
    public static String aString5525;
    public static String aString5526;
    public static String aString5527;
    
    Class493() throws Throwable {
	throw new Error();
    }
    
    static {
	String string = "Unknown";
	try {
	    string = System.getProperty("java.vendor").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("java.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.name").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString5525 = string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString5527 = string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString5524 = string.toLowerCase();
	aString5526 = String.format("%s (%s) [%s]",
				    new Object[] { aString5525, aString5527,
						   aString5524 });
	string = "~/";
	try {
	    string = System.getProperty("user.home").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	new File(string);
    }
    
    static final void method5952(Class648 class648, byte i) {
	((Class648) class648).anInt8399 -= 464011950;
	if ((((Class648) class648).aLongArray8398
	     [((Class648) class648).anInt8399 * 683825767])
	    >= (((Class648) class648).aLongArray8398
		[683825767 * ((Class648) class648).anInt8399 + 1]))
	    ((Class648) class648).anInt8390
		+= ((((Class648) class648).anIntArray8414
		     [((Class648) class648).anInt8390 * -630179809])
		    * 1888568287);
    }
    
    static final void method5953(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.aBool2415
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	Class39.method811(class229, 1435904523);
    }
    
    static void method5954(BitBuffer class528_sub42_sub2, byte i) {
	boolean bool = class528_sub42_sub2.readUnsignedByte((byte) 100) == 1;
	if (bool) {
	    boolean bool_0_ = false;
	    int i_1_ = class528_sub42_sub2.method10625(-2020452921) << 24;
	    i_1_ |= class528_sub42_sub2.method10625(354230476) << 16;
	    i_1_ |= class528_sub42_sub2.method10625(-163984077) << 8;
	    i_1_ |= class528_sub42_sub2.method10625(-1619495486);
	    Class180.aClass51_2091.method897((Class242.aLong2723
					      * 846658696245770097L),
					     i_1_, 1276862571);
	}
    }
}
