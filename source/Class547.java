/* Class547 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class Class547 implements Runnable
{
    byte[] aByteArray7404;
    OutputStream anOutputStream7405;
    int anInt7406;
    Thread aThread7407;
    int anInt7408 = 0;
    int anInt7409 = 0;
    IOException anIOException7410;
    boolean aBool7411;
    static int anInt7412;
    public static int anInt7413;
    
    public void run() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (((Class547) this).anIOException7410 != null)
			return;
		    if (817903219 * ((Class547) this).anInt7408
			<= 1455420077 * ((Class547) this).anInt7409)
			i = (1455420077 * ((Class547) this).anInt7409
			     - 817903219 * ((Class547) this).anInt7408);
		    else
			i = (961062813 * ((Class547) this).anInt7406
			     - ((Class547) this).anInt7408 * 817903219
			     + ((Class547) this).anInt7409 * 1455420077);
		    if (i > 0)
			break;
		    try {
			((Class547) this).anOutputStream7405.flush();
		    } catch (IOException ioexception) {
			((Class547) this).anIOException7410 = ioexception;
			return;
		    }
		    if (method6673(-1625690258))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (i + ((Class547) this).anInt7408 * 817903219
		    <= ((Class547) this).anInt7406 * 961062813)
		    ((Class547) this).anOutputStream7405.write
			(((Class547) this).aByteArray7404,
			 ((Class547) this).anInt7408 * 817903219, i);
		else {
		    int i_0_ = (((Class547) this).anInt7406 * 961062813
				- 817903219 * ((Class547) this).anInt7408);
		    ((Class547) this).anOutputStream7405.write
			(((Class547) this).aByteArray7404,
			 817903219 * ((Class547) this).anInt7408, i_0_);
		    ((Class547) this).anOutputStream7405
			.write(((Class547) this).aByteArray7404, 0, i - i_0_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    ((Class547) this).anIOException7410 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		((Class547) this).anInt7408
		    = ((i + ((Class547) this).anInt7408 * 817903219)
		       % (961062813 * ((Class547) this).anInt7406)
		       * 830365371);
	    }
	} while (!method6673(1305202451));
    }
    
    void method6666(byte[] is, int i, int i_1_, int i_2_) throws IOException {
	if (i_1_ < 0 || i < 0 || i_1_ + i > is.length)
	    throw new IOException();
	synchronized (this) {
	    if (null != ((Class547) this).anIOException7410)
		throw new IOException(((Class547) this).anIOException7410
					  .toString());
	    int i_3_;
	    if (((Class547) this).anInt7408 * 817903219
		<= 1455420077 * ((Class547) this).anInt7409)
		i_3_ = (((Class547) this).anInt7406 * 961062813
			- 1455420077 * ((Class547) this).anInt7409
			+ 817903219 * ((Class547) this).anInt7408 - 1);
	    else
		i_3_ = (((Class547) this).anInt7408 * 817903219
			- ((Class547) this).anInt7409 * 1455420077 - 1);
	    if (i_3_ < i_1_)
		throw new IOException("");
	    if (i_1_ + 1455420077 * ((Class547) this).anInt7409
		<= 961062813 * ((Class547) this).anInt7406)
		System.arraycopy(is, i, ((Class547) this).aByteArray7404,
				 1455420077 * ((Class547) this).anInt7409,
				 i_1_);
	    else {
		int i_4_ = (961062813 * ((Class547) this).anInt7406
			    - 1455420077 * ((Class547) this).anInt7409);
		System.arraycopy(is, i, ((Class547) this).aByteArray7404,
				 1455420077 * ((Class547) this).anInt7409,
				 i_4_);
		System.arraycopy(is, i_4_ + i,
				 ((Class547) this).aByteArray7404, 0,
				 i_1_ - i_4_);
	    }
	    ((Class547) this).anInt7409
		= 2025079077 * ((1455420077 * ((Class547) this).anInt7409
				 + i_1_)
				% (((Class547) this).anInt7406 * 961062813));
	    this.notifyAll();
	}
    }
    
    void method6667(int i) {
	synchronized (this) {
	    ((Class547) this).aBool7411 = true;
	    this.notifyAll();
	}
	try {
	    ((Class547) this).aThread7407.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    Class547(OutputStream outputstream, int i) {
	((Class547) this).anOutputStream7405 = outputstream;
	((Class547) this).anInt7406 = (i + 1) * 436344501;
	((Class547) this).aByteArray7404
	    = new byte[((Class547) this).anInt7406 * 961062813];
	((Class547) this).aThread7407 = new Thread(this);
	((Class547) this).aThread7407.setDaemon(true);
	((Class547) this).aThread7407.start();
    }
    
    public void method6668() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (((Class547) this).anIOException7410 != null)
			return;
		    if (817903219 * ((Class547) this).anInt7408
			<= 1455420077 * ((Class547) this).anInt7409)
			i = (1455420077 * ((Class547) this).anInt7409
			     - 817903219 * ((Class547) this).anInt7408);
		    else
			i = (961062813 * ((Class547) this).anInt7406
			     - ((Class547) this).anInt7408 * 817903219
			     + ((Class547) this).anInt7409 * 1455420077);
		    if (i > 0)
			break;
		    try {
			((Class547) this).anOutputStream7405.flush();
		    } catch (IOException ioexception) {
			((Class547) this).anIOException7410 = ioexception;
			return;
		    }
		    if (method6673(-837567458))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (i + ((Class547) this).anInt7408 * 817903219
		    <= ((Class547) this).anInt7406 * 961062813)
		    ((Class547) this).anOutputStream7405.write
			(((Class547) this).aByteArray7404,
			 ((Class547) this).anInt7408 * 817903219, i);
		else {
		    int i_5_ = (((Class547) this).anInt7406 * 961062813
				- 817903219 * ((Class547) this).anInt7408);
		    ((Class547) this).anOutputStream7405.write
			(((Class547) this).aByteArray7404,
			 817903219 * ((Class547) this).anInt7408, i_5_);
		    ((Class547) this).anOutputStream7405
			.write(((Class547) this).aByteArray7404, 0, i - i_5_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    ((Class547) this).anIOException7410 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		((Class547) this).anInt7408
		    = ((i + ((Class547) this).anInt7408 * 817903219)
		       % (961062813 * ((Class547) this).anInt7406)
		       * 830365371);
	    }
	} while (!method6673(1377877619));
    }
    
    boolean method6669() {
	if (((Class547) this).aBool7411) {
	    try {
		((Class547) this).anOutputStream7405.close();
		if (((Class547) this).anIOException7410 == null)
		    ((Class547) this).anIOException7410 = new IOException("");
	    } catch (IOException ioexception) {
		if (((Class547) this).anIOException7410 == null)
		    ((Class547) this).anIOException7410
			= new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    void method6670() {
	synchronized (this) {
	    ((Class547) this).aBool7411 = true;
	    this.notifyAll();
	}
	try {
	    ((Class547) this).aThread7407.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method6671(byte i) {
	((Class547) this).anOutputStream7405 = new OutputStream_Sub1();
    }
    
    void method6672() {
	synchronized (this) {
	    ((Class547) this).aBool7411 = true;
	    this.notifyAll();
	}
	try {
	    ((Class547) this).aThread7407.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    boolean method6673(int i) {
	if (((Class547) this).aBool7411) {
	    try {
		((Class547) this).anOutputStream7405.close();
		if (((Class547) this).anIOException7410 == null)
		    ((Class547) this).anIOException7410 = new IOException("");
	    } catch (IOException ioexception) {
		if (((Class547) this).anIOException7410 == null)
		    ((Class547) this).anIOException7410
			= new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    static final void method6674(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 0;
    }
    
    static final void method6675(Class648 class648, int i) {
	int i_6_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (1234694097 * client.anInt11158 == 2
	    && i_6_ < client.anInt11157 * -1314218023)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -2018563491 * client.aClass62Array11160[i_6_].anInt717;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
}
