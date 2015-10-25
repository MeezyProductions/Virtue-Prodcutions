/* Class587 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;

public class Class587 implements Iterable
{
    Class588[] aClass588Array7712;
    Class616[] aClass616Array7713;
    public static Class173 aClass173_7714;
    static Class528_Sub21_Sub11 aClass528_Sub21_Sub11_7715;
    
    void method7015(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 22);
	    if (i == 0)
		break;
	    if (1 == i) {
		int i_0_ = class528_sub42.readUnsignedByte((byte) 26);
		int i_1_ = 0;
		LinkedList linkedlist = new LinkedList();
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
		    int i_3_ = class528_sub42.readUnsignedByte((byte) 105);
		    int i_4_ = class528_sub42.readUnsignedShort(-750464474);
		    int i_5_ = class528_sub42.readUnsignedByte((byte) 53);
		    int i_6_ = 0;
		    Class616 class616 = Class616.aClass616_8031;
		    byte i_7_ = 1;
		    boolean bool = (i_5_ & 0x1) != 0;
		    if ((i_5_ & 0x2) != 0)
			i_6_ = class528_sub42.readUnsignedByte((byte) 73);
		    if ((i_5_ & 0x4) != 0)
			class616 = (((Class587) this).aClass616Array7713
				    [class528_sub42.readUnsignedByte((byte) 70)]);
		    if (0 != (i_5_ & 0x8))
			i_7_ = class528_sub42.method9627(-1276098400);
		    boolean bool_8_
			= class528_sub42.readUnsignedByte((byte) 66) == 1;
		    linkedlist.add(new Class588(i_3_, i_4_, bool, bool_8_,
						i_6_, class616, i_7_));
		    if (i_3_ > i_1_)
			i_1_ = i_3_;
		}
		((Class587) this).aClass588Array7712 = new Class588[i_1_ + 1];
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
		    Class588 class588 = (Class588) iterator.next();
		    ((Class587) this).aClass588Array7712
			[class588.method7032(-2060544527)]
			= class588;
		}
	    } else if (i == 2) {
		((Class587) this).aClass616Array7713
		    = new Class616[class528_sub42.readUnsignedByte((byte) 22)];
		for (int i_9_ = class528_sub42.readUnsignedByte((byte) 29);
		     i_9_ != 255;
		     i_9_ = class528_sub42.readUnsignedByte((byte) 59)) {
		    int[] is = new int[class528_sub42.readUnsignedShort(-1962819451)];
		    for (int i_10_ = 0; i_10_ < is.length; i_10_++)
			is[i_10_] = class528_sub42.readInt(591343569);
		    ((Class587) this).aClass616Array7713[i_9_]
			= new Class616(is);
		}
	    }
	}
    }
    
    void method7016(short i) {
	((Class587) this).aClass588Array7712 = null;
    }
    
    public Class587(Class446 class446) {
	method7026(class446.method5395((Class606.aClass606_7924.anInt7921
					* -2082684943),
				       -523637352),
		   1923308805);
    }
    
    void method7017() {
	((Class587) this).aClass588Array7712 = null;
    }
    
    public int method7018(int i) {
	return ((Class587) this).aClass588Array7712.length;
    }
    
    public Class588 method7019(int i, int i_11_) {
	return ((Class587) this).aClass588Array7712[i];
    }
    
    public Iterator method7020() {
	return new Class614(((Class587) this).aClass588Array7712);
    }
    
    void method7021() {
	((Class587) this).aClass588Array7712 = null;
    }
    
    void method7022() {
	((Class587) this).aClass588Array7712 = null;
    }
    
    public Iterator iterator() {
	return new Class614(((Class587) this).aClass588Array7712);
    }
    
    void method7023() {
	((Class587) this).aClass588Array7712 = null;
    }
    
    void method7024(byte[] is) {
	method7016((short) -24768);
	if (is == null)
	    ((Class587) this).aClass588Array7712 = new Class588[0];
	else
	    method7025(new ByteBuffer(is), -1129042746);
    }
    
    void method7025(ByteBuffer class528_sub42, int i) {
	for (;;) {
	    int i_12_ = class528_sub42.readUnsignedByte((byte) 42);
	    if (i_12_ == 0)
		break;
	    if (1 == i_12_) {
		int i_13_ = class528_sub42.readUnsignedByte((byte) 123);
		int i_14_ = 0;
		LinkedList linkedlist = new LinkedList();
		for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
		    int i_16_ = class528_sub42.readUnsignedByte((byte) 50);
		    int i_17_ = class528_sub42.readUnsignedShort(-496465027);
		    int i_18_ = class528_sub42.readUnsignedByte((byte) 50);
		    int i_19_ = 0;
		    Class616 class616 = Class616.aClass616_8031;
		    byte i_20_ = 1;
		    boolean bool = (i_18_ & 0x1) != 0;
		    if ((i_18_ & 0x2) != 0)
			i_19_ = class528_sub42.readUnsignedByte((byte) 76);
		    if ((i_18_ & 0x4) != 0)
			class616 = (((Class587) this).aClass616Array7713
				    [class528_sub42.readUnsignedByte((byte) 34)]);
		    if (0 != (i_18_ & 0x8))
			i_20_ = class528_sub42.method9627(-1311519424);
		    boolean bool_21_
			= class528_sub42.readUnsignedByte((byte) 84) == 1;
		    linkedlist.add(new Class588(i_16_, i_17_, bool, bool_21_,
						i_19_, class616, i_20_));
		    if (i_16_ > i_14_)
			i_14_ = i_16_;
		}
		((Class587) this).aClass588Array7712 = new Class588[i_14_ + 1];
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
		    Class588 class588 = (Class588) iterator.next();
		    ((Class587) this).aClass588Array7712
			[class588.method7032(1603131410)]
			= class588;
		}
	    } else if (i_12_ == 2) {
		((Class587) this).aClass616Array7713
		    = new Class616[class528_sub42.readUnsignedByte((byte) 72)];
		for (int i_22_ = class528_sub42.readUnsignedByte((byte) 63);
		     i_22_ != 255;
		     i_22_ = class528_sub42.readUnsignedByte((byte) 99)) {
		    int[] is = new int[class528_sub42.readUnsignedShort(-1257356362)];
		    for (int i_23_ = 0; i_23_ < is.length; i_23_++)
			is[i_23_] = class528_sub42.readInt(1128754555);
		    ((Class587) this).aClass616Array7713[i_22_]
			= new Class616(is);
		}
	    }
	}
    }
    
    void method7026(byte[] is, int i) {
	method7016((short) -14332);
	if (is == null)
	    ((Class587) this).aClass588Array7712 = new Class588[0];
	else
	    method7025(new ByteBuffer(is), -270818970);
    }
    
    static final void method7027(Class648 class648, byte i) {
	Class192.method2798(class648, -176781623);
    }
    
    static final void method7028(Class648 class648, int i) {
	int i_24_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (i_24_ != Class514.aClass528_Sub38_6967.aClass691_Sub22_10588
			 .method9998(1920598979)) {
	    Class514.aClass528_Sub38_6967.method9556((Class514
						      .aClass528_Sub38_6967
						      .aClass691_Sub22_10588),
						     i_24_, 202822353);
	    Class243.method3387(2146579789);
	    client.aBool11161 = false;
	}
    }
    
    static final void method7029(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_25_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	int i_26_ = (((Class648) class648).anIntArray8394
		     [1 + ((Class648) class648).anInt8395 * 717927929]);
	Class204.method2910(3, i_25_, i_26_, "", -2133134664);
    }
    
    static void method7030(String string, int i) {
	client.aString10962 = string;
	if (Class643.method7662((short) 801) != Class502.aClass502_6870) {
	    try {
		String string_27_
		    = Class196.anApplet2198
			  .getParameter(Class405.aClass405_4631.aString4645);
		String string_28_
		    = Class196.anApplet2198
			  .getParameter(Class405.aClass405_4617.aString4645);
		String string_29_
		    = new StringBuilder().append(string_27_).append
			  ("settings=").append
			  (string).append
			  ("; version=1; path=/; domain=").append
			  (string_28_).toString();
		if (string.length() == 0)
		    string_29_
			= new StringBuilder().append(string_29_).append
			      ("; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0")
			      .toString();
		else
		    string_29_
			= new StringBuilder().append(string_29_).append
			      ("; Expires=").append
			      (Class450.method5437(Class249
						       .method3417(1933599345)
						   + 94608000000L))
			      .append
			      ("; Max-Age=").append
			      (94608000L).toString();
		Class70.method1087(Class196.anApplet2198,
				   new StringBuilder().append
				       ("document.cookie=\"").append
				       (string_29_).append
				       ("\"").toString(),
				   (byte) -4);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
}
