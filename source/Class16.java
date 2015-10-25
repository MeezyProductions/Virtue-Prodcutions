/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.LinkedList;

public class Class16
{
    public int anInt191;
    public int anInt192;
    public int anInt193;
    public String aString194;
    boolean aBool195 = true;
    boolean aBool196 = false;
    
    public void method634(int i) {
	if (!((Class16) this).aBool195) {
	    ((Class16) this).aBool195 = true;
	    ((Class16) this).aBool196 = true;
	} else if (((Class16) this).aBool196)
	    ((Class16) this).aBool196 = false;
	else
	    ((Class16) this).aBool195 = false;
    }
    
    public boolean method635(Class16 class16_0_, int i) {
	if (null == class16_0_)
	    return false;
	return (2027542149 * class16_0_.anInt192 == 2027542149 * anInt192
		&& aString194.equals(class16_0_.aString194)
		&& anInt193 * -1255012695 == class16_0_.anInt193 * -1255012695
		&& anInt191 * 1401645101 == class16_0_.anInt191 * 1401645101);
    }
    
    public Socket method636() throws IOException {
	if (!((Class16) this).aBool196)
	    return new Socket(InetAddress.getByName(aString194),
			      (((Class16) this).aBool195
			       ? anInt191 * 1401645101
			       : -1255012695 * anInt193));
	return Class657.method7848
		   (aString194,
		    (((Class16) this).aBool195 ? 1401645101 * anInt191
		     : -1255012695 * anInt193),
		    -185904669)
		   .method567(1325753228);
    }
    
    public void method637() {
	if (!((Class16) this).aBool195) {
	    ((Class16) this).aBool195 = true;
	    ((Class16) this).aBool196 = true;
	} else if (((Class16) this).aBool196)
	    ((Class16) this).aBool196 = false;
	else
	    ((Class16) this).aBool195 = false;
    }
    
    public void method638() {
	if (!((Class16) this).aBool195) {
	    ((Class16) this).aBool195 = true;
	    ((Class16) this).aBool196 = true;
	} else if (((Class16) this).aBool196)
	    ((Class16) this).aBool196 = false;
	else
	    ((Class16) this).aBool195 = false;
    }
    
    public Socket method639(int i) throws IOException {
	if (!((Class16) this).aBool196)
	    return new Socket(InetAddress.getByName(aString194),
			      (((Class16) this).aBool195
			       ? anInt191 * 1401645101
			       : -1255012695 * anInt193));
	return Class657.method7848
		   (aString194,
		    (((Class16) this).aBool195 ? 1401645101 * anInt191
		     : -1255012695 * anInt193),
		    -185904669)
		   .method567(2130672428);
    }
    
    public static void method640(Class173 class173, long l, int i, int i_1_,
				 byte i_2_) {
	do {
	    if (class173.method2426() && class173.method2427() > -1) {
		int i_3_ = class173.method2427();
		Class577 class577 = null;
		if (!Class581.aLinkedList7633.isEmpty())
		    class577 = (Class577) Class581.aLinkedList7633.getFirst();
		if (class577 == null
		    || i_3_ != ((Class577) class577).anInt7604 * -1673672115) {
		    class173.method2232();
		    Class581.aLinkedList7633.clear();
		} else {
		    Class581.aLinkedList7633.removeFirst();
		    class173.method2254();
		    boolean bool = false;
		    int i_4_;
		    if (((Class577) class577).aLinkedList7605.isEmpty()
			&& class173.method2189()) {
			long l_5_
			    = class173.method2194((Class444.anInt4914
						   * 339071345),
						  (1374421313
						   * Class492.anInt5521));
			i_4_ = (Canvas_Sub1.aTwitchTV11693.SubmitFrame
				(l_5_, class173.method2531(),
				 Class581.aBool7628, i, i_1_));
			class173.method2352(l_5_);
		    } else {
			class173.method2196(Class444.anInt4914 * 339071345,
					    Class492.anInt5521 * 1374421313,
					    Class35.anIntArray330,
					    Class463.anIntArray5301);
			Class297.method3984
			    (Class35.anIntArray330,
			     ((Class577) class577).aLinkedList7605,
			     78255305 * ((Class577) class577).anInt7602,
			     ((Class577) class577).anInt7603 * 1396602397,
			     ((Class577) class577).aFloat7601, 1963869883);
			i_4_ = (Canvas_Sub1.aTwitchTV11693.SubmitFrameRaw
				(Class35.anIntArray330, Class581.aBool7628, i,
				 i_1_));
		    }
		    class173.method2237();
		    if (i_4_ == 2072)
			Class581.aLong7644 = 8805214917521779203L * l;
		    else if (23 == i_4_)
			Class581.aLong7635 = 8168348763693966207L * l;
		    else if (-995 == i_4_ || i_4_ != 0)
			break;
		}
	    }
	} while (false);
	if (Class581.aBool7637) {
	    if (null == Class35.anIntArray330) {
		Class35.anIntArray330
		    = new int[(Class581.aBool7628 ? i * i_1_
			       : (1374421313 * Class492.anInt5521
				  * (339071345 * Class444.anInt4914)))];
		Class463.anIntArray5301
		    = new int[(Class581.aBool7628 ? i_1_ * i
			       : (Class492.anInt5521 * 1374421313
				  * (339071345 * Class444.anInt4914)))];
	    }
	    if (!class173.method2426()) {
		class173.method2254();
		class173.method2196(339071345 * Class444.anInt4914,
				    Class492.anInt5521 * 1374421313,
				    Class35.anIntArray330,
				    Class463.anIntArray5301);
		Class297.method3984(Class35.anIntArray330,
				    Class581.aLinkedList7640,
				    1354853215 * class173.anInt2002,
				    class173.anInt2007 * -2074272721,
				    class173.aFloat2008, 621389324);
		int i_6_
		    = (Canvas_Sub1.aTwitchTV11693.SubmitFrameRaw
		       (Class35.anIntArray330, Class581.aBool7628, i, i_1_));
		class173.method2237();
		Class581.aLinkedList7640.clear();
		do {
		    if (i_6_ == 2072)
			Class581.aLong7644 = 8805214917521779203L * l;
		    else if (i_6_ == 23)
			Class581.aLong7635 = 8168348763693966207L * l;
		    else if (-995 == i_6_ || i_6_ != 0)
			break;
		} while (false);
	    } else {
		class173.method2193(client.anInt11127,
				    Class444.anInt4914 * 339071345,
				    Class492.anInt5521 * 1374421313);
		Class581.aLinkedList7633.add
		    (new Class577(client.anInt11127, Class581.aLinkedList7640,
				  1354853215 * class173.anInt2002,
				  -2074272721 * class173.anInt2007,
				  class173.aFloat2008));
		Class581.aLinkedList7640 = new LinkedList();
	    }
	    Class581.aBool7637 = false;
	}
    }
    
    static final void method641(Class648 class648, int i) {
	((Class648) class648).anInt8410 -= -1094513834;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (Class657.method7849
	       ((String) (((Class648) class648).anObjectArray8396
			  [((Class648) class648).anInt8410 * -520794877]),
		(String) (((Class648) class648).anObjectArray8396
			  [1 + -520794877 * ((Class648) class648).anInt8410]),
		Class378_Sub2.aClass668_10123, (byte) 2));
    }
}
