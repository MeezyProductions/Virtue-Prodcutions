/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class86
{
    static final int anInt857 = 1;
    static final int anInt858 = 12;
    static char[] aCharArray859
	= { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4',
	    '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3',
	    '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9',
	    '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd',
	    '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6',
	    '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5',
	    '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da',
	    '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178',
	    '\u00f1', '\u00d1', '\u00df' };
    static char[] aCharArray860 = { '[', ']', '#' };
    
    static final boolean method1156(char c) {
	return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
    }
    
    Class86() throws Throwable {
	throw new Error();
    }
    
    static final boolean method1157(char c) {
	return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
    }
    
    static final boolean method1158(char c) {
	return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
    }
    
    static void method1159(int i, int i_0_, boolean bool, int i_1_) {
	Class148_Sub1.aBoolArrayArray8790[i][i_0_] = bool;
    }
    
    static final void method1160(Class648 class648, byte i) {
	int i_2_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	int i_3_ = i_2_ >> 16;
	if (Class380.aClass226Array3970[i_3_] == null)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	else {
	    String string = (Class380.aClass226Array3970[i_3_]
			     .aClass229Array2336[i_2_].aString2468);
	    if (null == string)
		((Class648) class648).anObjectArray8396
		    [((((Class648) class648).anInt8410 += 1600226731)
		      * -520794877) - 1]
		    = "";
	    else
		((Class648) class648).anObjectArray8396
		    [((((Class648) class648).anInt8410 += 1600226731)
		      * -520794877) - 1]
		    = string;
	}
    }
}
