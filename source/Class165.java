/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class165
{
    Class160[] aClass160Array1834;
    int anInt1835;
    
    public Class160 method2093(int i, byte i_0_) {
	return ((Class165) this).aClass160Array1834[i];
    }
    
    public Class165(Class446 class446) {
	((Class165) this).anInt1835
	    = class446.method5345(0, 2052365111) * -1544608309;
	((Class165) this).aClass160Array1834
	    = new Class160[-132327453 * ((Class165) this).anInt1835];
	for (int i = 0; i < -132327453 * ((Class165) this).anInt1835; i++) {
	    ByteBuffer class528_sub42
		= new ByteBuffer(class446.method5348(0, i, -2010239017));
	    if (null == class528_sub42.payload)
		((Class165) this).aClass160Array1834[i] = null;
	    else {
		try {
		    Class160 class160 = new Class160();
		    class160.method2058(i, class528_sub42, -155618627);
		    ((Class165) this).aClass160Array1834[i] = class160;
		} catch (Exception exception) {
		    ((Class165) this).aClass160Array1834[i] = null;
		}
	    }
	}
    }
}
