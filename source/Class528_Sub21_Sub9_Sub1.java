/* Class528_Sub21_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Class528_Sub21_Sub9_Sub1 extends Class528_Sub21_Sub9
{
    Future aFuture11947;
    int anInt11948;
    
    int method10548() {
	if (((Class528_Sub21_Sub9_Sub1) this).aFuture11947 == null)
	    return 0;
	return (((Class528_Sub21_Sub9_Sub1) this).aFuture11947.isDone() ? 100
		: 0);
    }
    
    int method10546(int i) {
	if (((Class528_Sub21_Sub9_Sub1) this).aFuture11947 == null)
	    return 0;
	return (((Class528_Sub21_Sub9_Sub1) this).aFuture11947.isDone() ? 100
		: 0);
    }
    
    byte[] method10545(int i) {
	do {
	    if (((Class528_Sub21_Sub9_Sub1) this).aFuture11947.isDone()) {
		byte[] is;
		try {
		    is = ((Class452)
			  ((Class528_Sub21_Sub9_Sub1) this).aFuture11947.get())
			     .method5444((byte) 66);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    byte[] method10547() {
	do {
	    if (((Class528_Sub21_Sub9_Sub1) this).aFuture11947.isDone()) {
		byte[] is;
		try {
		    is = ((Class452)
			  ((Class528_Sub21_Sub9_Sub1) this).aFuture11947.get())
			     .method5444((byte) 62);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    byte[] method10549() {
	do {
	    if (((Class528_Sub21_Sub9_Sub1) this).aFuture11947.isDone()) {
		byte[] is;
		try {
		    is = ((Class452)
			  ((Class528_Sub21_Sub9_Sub1) this).aFuture11947.get())
			     .method5444((byte) 92);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    byte[] method10544() {
	do {
	    if (((Class528_Sub21_Sub9_Sub1) this).aFuture11947.isDone()) {
		byte[] is;
		try {
		    is = ((Class452)
			  ((Class528_Sub21_Sub9_Sub1) this).aFuture11947.get())
			     .method5444((byte) -79);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    Class528_Sub21_Sub9_Sub1(int i) {
	((Class528_Sub21_Sub9_Sub1) this).anInt11948 = i * -374324297;
    }
    
    byte[] method10551() {
	do {
	    if (((Class528_Sub21_Sub9_Sub1) this).aFuture11947.isDone()) {
		byte[] is;
		try {
		    is = ((Class452)
			  ((Class528_Sub21_Sub9_Sub1) this).aFuture11947.get())
			     .method5444((byte) -86);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    void method10815(Future future, byte i) {
	((Class528_Sub21_Sub9_Sub1) this).aFuture11947 = future;
    }
    
    int method10550() {
	if (((Class528_Sub21_Sub9_Sub1) this).aFuture11947 == null)
	    return 0;
	return (((Class528_Sub21_Sub9_Sub1) this).aFuture11947.isDone() ? 100
		: 0);
    }
    
    int method10552() {
	if (((Class528_Sub21_Sub9_Sub1) this).aFuture11947 == null)
	    return 0;
	return (((Class528_Sub21_Sub9_Sub1) this).aFuture11947.isDone() ? 100
		: 0);
    }
}
