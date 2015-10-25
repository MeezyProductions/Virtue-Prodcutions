/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class Class78
{
    Inflater anInflater808;
    
    Class78(int i, int i_0_, int i_1_) {
	/* empty */
    }
    
    public byte[] method1134(byte[] is, int i) {
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	class528_sub42.pointer = (is.length - 4) * 2015001547;
	int i_2_ = class528_sub42.method9631(-296132915);
	byte[] is_3_ = new byte[i_2_];
	class528_sub42.pointer = 0;
	method1136(class528_sub42, is_3_, -2105712428);
	return is_3_;
    }
    
    public Class78() {
	this(-1, 1000000, 1000000);
    }
    
    public byte[] method1135(byte[] is) {
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	class528_sub42.pointer = (is.length - 4) * 2015001547;
	int i = class528_sub42.method9631(-296132915);
	byte[] is_4_ = new byte[i];
	class528_sub42.pointer = 0;
	method1136(class528_sub42, is_4_, 624825144);
	return is_4_;
    }
    
    public void method1136(ByteBuffer class528_sub42, byte[] is, int i) {
	if ((class528_sub42.payload
	     [-185904669 * class528_sub42.pointer]) != 31
	    || (class528_sub42.payload
		[1 + -185904669 * class528_sub42.pointer]) != -117)
	    throw new RuntimeException("");
	if (((Class78) this).anInflater808 == null)
	    ((Class78) this).anInflater808 = new Inflater(true);
	try {
	    ((Class78) this).anInflater808.setInput
		(class528_sub42.payload,
		 -185904669 * class528_sub42.pointer + 10,
		 (class528_sub42.payload.length
		  - (class528_sub42.pointer * -185904669 + 10 + 8)));
	    ((Class78) this).anInflater808.inflate(is);
	} catch (Exception exception) {
	    ((Class78) this).anInflater808.reset();
	    throw new RuntimeException("");
	}
	((Class78) this).anInflater808.reset();
    }
    
    public byte[] method1137(byte[] is) {
	ByteBuffer class528_sub42 = new ByteBuffer(is);
	class528_sub42.pointer = (is.length - 4) * 2015001547;
	int i = class528_sub42.method9631(-296132915);
	byte[] is_5_ = new byte[i];
	class528_sub42.pointer = 0;
	method1136(class528_sub42, is_5_, -1399753007);
	return is_5_;
    }
    
    static final void method1138(Class648 class648, int i) {
	/* empty */
    }
}
