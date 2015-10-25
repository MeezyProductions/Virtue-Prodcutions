/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public abstract class Class8
{
    int anInt136;
    String aString137;
    
    public abstract Socket method567(int i) throws IOException;
    
    Class8() {
	/* empty */
    }
    
    public abstract Socket method568() throws IOException;
    
    Socket method569(int i) throws IOException {
	return new Socket(((Class8) this).aString137,
			  1935038759 * ((Class8) this).anInt136);
    }
    
    public abstract Socket method570() throws IOException;
    
    public abstract Socket method571() throws IOException;
}
