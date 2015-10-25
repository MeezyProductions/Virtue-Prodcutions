/* Class528_Sub42_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

public class Class528_Sub42_Sub1 extends ByteBuffer
{
    Class528_Sub42_Sub1(int i) {
	super(i);
    }
    
    void method10614(float f) {
	int i = Stream.floatToRawIntBits(f);
	payload[(pointer += 2015001547) * -185904669 - 1]
	    = (byte) i;
	payload[(pointer += 2015001547) * -185904669 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += 2015001547) * -185904669 - 1]
	    = (byte) (i >> 16);
	payload[(pointer += 2015001547) * -185904669 - 1]
	    = (byte) (i >> 24);
    }
    
    void method10615(float f) {
	int i = Stream.floatToRawIntBits(f);
	payload[(pointer += 2015001547) * -185904669 - 1]
	    = (byte) (i >> 24);
	payload[(pointer += 2015001547) * -185904669 - 1]
	    = (byte) (i >> 16);
	payload[(pointer += 2015001547) * -185904669 - 1]
	    = (byte) (i >> 8);
	payload[(pointer += 2015001547) * -185904669 - 1]
	    = (byte) i;
    }
}
