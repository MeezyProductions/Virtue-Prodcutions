/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class23
{
    long aLong227;
    RandomAccessFile aRandomAccessFile228;
    long aLong229;
    
    public final long method680(int i) throws IOException {
	return ((Class23) this).aRandomAccessFile228.length();
    }
    
    final void method681(long l) throws IOException {
	((Class23) this).aRandomAccessFile228.seek(l);
	((Class23) this).aLong229 = -377770533296138397L * l;
    }
    
    final void method682(long l) throws IOException {
	((Class23) this).aRandomAccessFile228.seek(l);
	((Class23) this).aLong229 = -377770533296138397L * l;
    }
    
    public final void method683(byte i) throws IOException {
	if (((Class23) this).aRandomAccessFile228 != null) {
	    ((Class23) this).aRandomAccessFile228.close();
	    ((Class23) this).aRandomAccessFile228 = null;
	}
    }
    
    void method684() throws Throwable {
	if (((Class23) this).aRandomAccessFile228 != null) {
	    System.out.println("");
	    method683((byte) 48);
	}
    }
    
    void method685() throws Throwable {
	if (((Class23) this).aRandomAccessFile228 != null) {
	    System.out.println("");
	    method683((byte) 106);
	}
    }
    
    public void finalize() throws Throwable {
	if (((Class23) this).aRandomAccessFile228 != null) {
	    System.out.println("");
	    method683((byte) 24);
	}
    }
    
    public final long method686() throws IOException {
	return ((Class23) this).aRandomAccessFile228.length();
    }
    
    void method687() throws Throwable {
	if (((Class23) this).aRandomAccessFile228 != null) {
	    System.out.println("");
	    method683((byte) 43);
	}
    }
    
    void method688() throws Throwable {
	if (((Class23) this).aRandomAccessFile228 != null) {
	    System.out.println("");
	    method683((byte) 126);
	}
    }
    
    public final void method689(byte[] is, int i, int i_0_, int i_1_)
	throws IOException {
	if (-5544915800882404789L * ((Class23) this).aLong229 + (long) i_0_
	    > ((Class23) this).aLong227 * 1903450922506708389L) {
	    ((Class23) this).aRandomAccessFile228
		.seek(((Class23) this).aLong227 * 1903450922506708389L);
	    ((Class23) this).aRandomAccessFile228.write(1);
	    throw new EOFException();
	}
	((Class23) this).aRandomAccessFile228.write(is, i, i_0_);
	((Class23) this).aLong229 += -377770533296138397L * (long) i_0_;
    }
    
    final void method690(long l) throws IOException {
	((Class23) this).aRandomAccessFile228.seek(l);
	((Class23) this).aLong229 = -377770533296138397L * l;
    }
    
    final void method691(long l) throws IOException {
	((Class23) this).aRandomAccessFile228.seek(l);
	((Class23) this).aLong229 = -377770533296138397L * l;
    }
    
    public final int method692(byte[] is, int i, int i_2_, int i_3_)
	throws IOException {
	int i_4_ = ((Class23) this).aRandomAccessFile228.read(is, i, i_2_);
	if (i_4_ > 0)
	    ((Class23) this).aLong229 += -377770533296138397L * (long) i_4_;
	return i_4_;
    }
    
    public final void method693() throws IOException {
	if (((Class23) this).aRandomAccessFile228 != null) {
	    ((Class23) this).aRandomAccessFile228.close();
	    ((Class23) this).aRandomAccessFile228 = null;
	}
    }
    
    public final void method694() throws IOException {
	if (((Class23) this).aRandomAccessFile228 != null) {
	    ((Class23) this).aRandomAccessFile228.close();
	    ((Class23) this).aRandomAccessFile228 = null;
	}
    }
    
    public Class23(File file, String string, long l) throws IOException {
	if (l == -1L)
	    l = 9223372036854775807L;
	if (file.length() > l)
	    file.delete();
	((Class23) this).aRandomAccessFile228
	    = new RandomAccessFile(file, string);
	((Class23) this).aLong227 = 5139420831289801261L * l;
	((Class23) this).aLong229 = 0L;
	int i = ((Class23) this).aRandomAccessFile228.read();
	if (-1 != i && !string.equals("r")) {
	    ((Class23) this).aRandomAccessFile228.seek(0L);
	    ((Class23) this).aRandomAccessFile228.write(i);
	}
	((Class23) this).aRandomAccessFile228.seek(0L);
    }
    
    public final long method695() throws IOException {
	return ((Class23) this).aRandomAccessFile228.length();
    }
    
    static final void method696(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_5_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_6_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	Class365.aClass218_3848.method3127(i_5_, i_6_, -1602286878);
    }
    
    public static void method697(String string, String string_7_,
				 String string_8_, boolean bool, int i) {
	if (string.length() <= 320 && Class445_Sub5.method9223(449313726)) {
	    client.aClass109_11162.method1382(-1218150295);
	    Class609.method7241(-905166323);
	    Class54.aString662 = string;
	    Class54.aString663 = string_7_;
	    Class54.aString640 = string_8_;
	    Class54.aBool671 = bool;
	    Class487.method5890(10, 2130003981);
	}
    }
}
