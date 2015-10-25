/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class32 implements Runnable
{
    InetAddress anInetAddress307;
    volatile String aString308;
    static int anInt309;
    
    Class32(int i) throws UnknownHostException {
	((Class32) this).anInetAddress307
	    = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff),
						    (byte) (i >> 16 & 0xff),
						    (byte) (i >> 8 & 0xff),
						    (byte) (i & 0xff) });
    }
    
    public String method754(int i) {
	return ((Class32) this).aString308;
    }
    
    public void run() {
	((Class32) this).aString308
	    = ((Class32) this).anInetAddress307.getHostName();
    }
    
    public void method755() {
	((Class32) this).aString308
	    = ((Class32) this).anInetAddress307.getHostName();
    }
    
    public String method756() {
	return ((Class32) this).aString308;
    }
    
    public static boolean method757(int i, int i_0_) {
	return i == 0 || 2 == i;
    }
}
