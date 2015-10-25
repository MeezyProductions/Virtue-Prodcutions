/* Class551_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class551_Sub1 extends Class551
{
    Class547 aClass547_10666;
    Socket aSocket10667;
    Class553 aClass553_10668;
    
    public void method6694(int i) {
	((Class551_Sub1) this).aClass547_10666.method6667(4194304);
	try {
	    ((Class551_Sub1) this).aSocket10667.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	((Class551_Sub1) this).aClass553_10668.method6722(-1629811823);
    }
    
    public boolean method6690(int i, int i_0_) throws IOException {
	return ((Class551_Sub1) this).aClass553_10668.method6718(i,
								 1688539781);
    }
    
    public int method6691(int i) throws IOException {
	return ((Class551_Sub1) this).aClass553_10668.method6728((byte) 20);
    }
    
    public void method6695(int i) {
	((Class551_Sub1) this).aClass553_10668.method6723((byte) 123);
	((Class551_Sub1) this).aClass547_10666.method6671((byte) -74);
    }
    
    public void method6693(byte[] is, int i, int i_1_, byte i_2_)
	throws IOException {
	((Class551_Sub1) this).aClass547_10666.method6666(is, i, i_1_,
							  1202626379);
    }
    
    void method9741() {
	method6694(-1051249221);
    }
    
    public int method6689(byte[] is, int i, int i_3_, int i_4_)
	throws IOException {
	return ((Class551_Sub1) this).aClass553_10668.method6721(is, i, i_3_,
								 139724702);
    }
    
    public void finalize() {
	method6694(-1051249221);
    }
    
    void method9742() {
	method6694(-1051249221);
    }
    
    public boolean method6697(int i) throws IOException {
	return ((Class551_Sub1) this).aClass553_10668.method6718(i,
								 1711890878);
    }
    
    void method9743() {
	method6694(-1051249221);
    }
    
    public int method6700(byte[] is, int i, int i_5_) throws IOException {
	return ((Class551_Sub1) this).aClass553_10668.method6721(is, i, i_5_,
								 -2093660614);
    }
    
    public boolean method6705(int i) throws IOException {
	return ((Class551_Sub1) this).aClass553_10668.method6718(i,
								 -1680154123);
    }
    
    public int method6702() throws IOException {
	return ((Class551_Sub1) this).aClass553_10668.method6728((byte) 9);
    }
    
    public boolean method6698(int i) throws IOException {
	return ((Class551_Sub1) this).aClass553_10668.method6718(i,
								 -603265731);
    }
    
    public int method6699() throws IOException {
	return ((Class551_Sub1) this).aClass553_10668.method6728((byte) 11);
    }
    
    void method9744() {
	method6694(-1051249221);
    }
    
    Class551_Sub1(Socket socket, int i) throws IOException {
	((Class551_Sub1) this).aSocket10667 = socket;
	((Class551_Sub1) this).aSocket10667.setSoTimeout(30000);
	((Class551_Sub1) this).aSocket10667.setTcpNoDelay(true);
	((Class551_Sub1) this).aClass553_10668
	    = new Class553(((Class551_Sub1) this).aSocket10667
			       .getInputStream(),
			   i);
	((Class551_Sub1) this).aClass547_10666
	    = new Class547(((Class551_Sub1) this).aSocket10667
			       .getOutputStream(),
			   i);
    }
    
    public int method6701(byte[] is, int i, int i_6_) throws IOException {
	return ((Class551_Sub1) this).aClass553_10668.method6721(is, i, i_6_,
								 104147704);
    }
    
    public void method6692(byte[] is, int i, int i_7_) throws IOException {
	((Class551_Sub1) this).aClass547_10666.method6666(is, i, i_7_,
							  201115328);
    }
    
    public void method6696() {
	((Class551_Sub1) this).aClass547_10666.method6667(4194304);
	try {
	    ((Class551_Sub1) this).aSocket10667.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	((Class551_Sub1) this).aClass553_10668.method6722(791557960);
    }
    
    public void method6703() {
	((Class551_Sub1) this).aClass553_10668.method6723((byte) 123);
	((Class551_Sub1) this).aClass547_10666.method6671((byte) -121);
    }
    
    public void method6704() {
	((Class551_Sub1) this).aClass553_10668.method6723((byte) 86);
	((Class551_Sub1) this).aClass547_10666.method6671((byte) -51);
    }
    
    public void method6706() {
	((Class551_Sub1) this).aClass553_10668.method6723((byte) 61);
	((Class551_Sub1) this).aClass547_10666.method6671((byte) -109);
    }
    
    public static boolean method9745(int i, int i_8_, byte i_9_) {
	if (Class641.aClass364_8273 == null
	    || Class641.aClass364_8273.method4609((byte) 100) == null)
	    return false;
	if (i == i_8_)
	    return true;
	Class351 class351 = Class641.aClass364_8273.method4609((byte) 84)
				.method4582(i, (byte) 55);
	Class351 class351_10_ = Class641.aClass364_8273.method4609
				    ((byte) 86).method4582(i_8_, (byte) 15);
	Class351 class351_11_ = class351;
    while_83_:
	do {
	    do {
		if (null == class351_11_)
		    break while_83_;
		class351_11_ = class351_11_.method4561(-85258087);
		if (class351_11_ == class351_10_)
		    return true;
	    } while (class351 != class351_11_);
	    return false;
	} while (false);
	class351_11_ = class351_10_;
    while_84_:
	do {
	    do {
		if (class351_11_ == null)
		    break while_84_;
		class351_11_ = class351_11_.method4561(-1599689730);
		if (class351_11_ == class351)
		    return true;
	    } while (class351_11_ != class351_10_);
	    return false;
	} while (false);
	return false;
    }
}
