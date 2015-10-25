/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Array;
import java.util.Iterator;

public class Class25 implements Interface12
{
    protected int anInt232;
    SharedConfigsType aClass644_233;
    Class446 aClass446_234;
    Definition[] anInterface10Array235;
    Definition anInterface10_236;
    Interface4 anInterface4_237;
    static String aString238;
    static int anInt239;
    
    public Definition method64(int i) {
	if (i < 0) {
	    if (null == ((Class25) this).anInterface10_236)
		((Class25) this).anInterface10_236
		    = ((Class25) this).anInterface4_237.method42(-1, this,
								 -1913224835);
	    return ((Class25) this).anInterface10_236;
	}
	if (((Class25) this).anInterface10Array235[i] == null)
	    method704(i, -522972781);
	return ((Class25) this).anInterface10Array235[i];
    }
    
    public Definition method65(int i) {
	if (i < 0) {
	    if (null == ((Class25) this).anInterface10_236)
		((Class25) this).anInterface10_236
		    = ((Class25) this).anInterface4_237.method42(-1, this,
								 -1506574837);
	    return ((Class25) this).anInterface10_236;
	}
	if (((Class25) this).anInterface10Array235[i] == null)
	    method704(i, -522972781);
	return ((Class25) this).anInterface10Array235[i];
    }
    
    void method704(int i, int i_0_) {
	if (null == ((Class25) this).anInterface10Array235[i]) {
	    try {
		((Class25) this).anInterface10Array235[i]
		    = ((Class25) this).anInterface4_237.method42(i, this,
								 -1175427675);
	    } catch (Exception exception) {
		exception.printStackTrace();
		return;
	    }
	    Object object = null;
	    byte[] is = Class457.method5530(((Class25) this).aClass446_234,
					    ((Class25) this).aClass644_233, i,
					    (byte) -122);
	    if (null != is)
		((Class25) this).anInterface10Array235[i]
		    .method58(new ByteBuffer(is), (byte) 108);
	    ((Class25) this).anInterface10Array235[i].method61(392970714);
	}
    }
    
    public int method62(short i) {
	return ((Class25) this).anInterface10Array235.length;
    }
    
    public Iterator iterator() {
	return new Class29(this);
    }
    
    public Definition method63(int i, int i_1_) {
	if (i < 0) {
	    if (null == ((Class25) this).anInterface10_236)
		((Class25) this).anInterface10_236
		    = ((Class25) this).anInterface4_237.method42(-1, this,
								 -773783104);
	    return ((Class25) this).anInterface10_236;
	}
	if (((Class25) this).anInterface10Array235[i] == null)
	    method704(i, -522972781);
	return ((Class25) this).anInterface10Array235[i];
    }
    
    Class25(Class673 class673, Class668 class668, SharedConfigsType sharedConfigsType,
	    Class446 class446, Interface4 interface4, boolean bool) {
	((Class25) this).anInterface4_237 = interface4;
	((Class25) this).aClass644_233 = sharedConfigsType;
	((Class25) this).aClass446_234 = class446;
	anInt232 = Class31.method753(((Class25) this).aClass446_234,
				     ((Class25) this).aClass644_233,
				     (byte) 60) * -693092523;
	((Class25) this).anInterface10Array235
	    = (Definition[]) Array.newInstance(((Class25) this)
						    .anInterface4_237
						    .method45((short) 255),
						anInt232 * -1530804739);
	if (bool) {
	    for (int i = 0; i < -1530804739 * anInt232; i++)
		method704(i, -522972781);
	}
    }
    
    public int method5() {
	return ((Class25) this).anInterface10Array235.length;
    }
    
    public Iterator method705() {
	return new Class29(this);
    }
    
    void method706(int i) {
	if (null == ((Class25) this).anInterface10Array235[i]) {
	    try {
		((Class25) this).anInterface10Array235[i]
		    = ((Class25) this).anInterface4_237.method42(i, this,
								 -1204232740);
	    } catch (Exception exception) {
		exception.printStackTrace();
		return;
	    }
	    Object object = null;
	    byte[] is = Class457.method5530(((Class25) this).aClass446_234,
					    ((Class25) this).aClass644_233, i,
					    (byte) -34);
	    if (null != is)
		((Class25) this).anInterface10Array235[i]
		    .method58(new ByteBuffer(is), (byte) 85);
	    ((Class25) this).anInterface10Array235[i].method61(103282272);
	}
    }
    
    void method707(int i) {
	if (null == ((Class25) this).anInterface10Array235[i]) {
	    try {
		((Class25) this).anInterface10Array235[i]
		    = ((Class25) this).anInterface4_237.method42(i, this,
								 -519819676);
	    } catch (Exception exception) {
		exception.printStackTrace();
		return;
	    }
	    Object object = null;
	    byte[] is = Class457.method5530(((Class25) this).aClass446_234,
					    ((Class25) this).aClass644_233, i,
					    (byte) -48);
	    if (null != is)
		((Class25) this).anInterface10Array235[i]
		    .method58(new ByteBuffer(is), (byte) 102);
	    ((Class25) this).anInterface10Array235[i].method61(696736309);
	}
    }
}
