/* Class616 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class616
{
    static Class616 aClass616_8031 = new Class616();
    int[] anIntArray8032;
    public static boolean aBool8033;
    
    int method7356(int i) {
	if (i < 1)
	    return 0;
	if (i > ((Class616) this).anIntArray8032.length)
	    i = ((Class616) this).anIntArray8032.length;
	return ((Class616) this).anIntArray8032[i - 1];
    }
    
    final void method7357(int i) {
	for (int i_0_ = 1; i_0_ < ((Class616) this).anIntArray8032.length;
	     i_0_++) {
	    if (((Class616) this).anIntArray8032[i_0_ - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i_0_ - 1).toString());
	    if (((Class616) this).anIntArray8032[i_0_]
		< ((Class616) this).anIntArray8032[i_0_ - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i_0_).toString());
	}
    }
    
    final void method7358() {
	for (int i = 1; i < ((Class616) this).anIntArray8032.length; i++) {
	    if (((Class616) this).anIntArray8032[i - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i - 1).toString());
	    if (((Class616) this).anIntArray8032[i]
		< ((Class616) this).anIntArray8032[i - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i).toString());
	}
    }
    
    Class616() {
	((Class616) this).anIntArray8032 = new int[120];
	int i = 0;
	for (int i_1_ = 0; i_1_ < 120; i_1_++) {
	    int i_2_ = 1 + i_1_;
	    int i_3_ = (int) ((double) i_2_
			      + 300.0 * Math.pow(2.0, (double) i_2_ / 7.0));
	    i += i_3_;
	    ((Class616) this).anIntArray8032[i_1_] = i / 4;
	}
	method7357(1791223936);
    }
    
    int method7359(int i, int i_4_) {
	if (i < 1)
	    return 0;
	if (i > ((Class616) this).anIntArray8032.length)
	    i = ((Class616) this).anIntArray8032.length;
	return ((Class616) this).anIntArray8032[i - 1];
    }
    
    int method7360(int i, int i_5_) {
	int i_6_ = 0;
	for (int i_7_ = 0;
	     (i_7_ < ((Class616) this).anIntArray8032.length
	      && i >= ((Class616) this).anIntArray8032[i_7_]);
	     i_7_++)
	    i_6_ = i_7_ + 1;
	return i_6_;
    }
    
    int method7361(int i) {
	int i_8_ = 0;
	for (int i_9_ = 0;
	     (i_9_ < ((Class616) this).anIntArray8032.length
	      && i >= ((Class616) this).anIntArray8032[i_9_]);
	     i_9_++)
	    i_8_ = i_9_ + 1;
	return i_8_;
    }
    
    int method7362(int i) {
	int i_10_ = 0;
	for (int i_11_ = 0;
	     (i_11_ < ((Class616) this).anIntArray8032.length
	      && i >= ((Class616) this).anIntArray8032[i_11_]);
	     i_11_++)
	    i_10_ = i_11_ + 1;
	return i_10_;
    }
    
    int method7363(int i) {
	int i_12_ = 0;
	for (int i_13_ = 0;
	     (i_13_ < ((Class616) this).anIntArray8032.length
	      && i >= ((Class616) this).anIntArray8032[i_13_]);
	     i_13_++)
	    i_12_ = i_13_ + 1;
	return i_12_;
    }
    
    int method7364(int i) {
	if (i < 1)
	    return 0;
	if (i > ((Class616) this).anIntArray8032.length)
	    i = ((Class616) this).anIntArray8032.length;
	return ((Class616) this).anIntArray8032[i - 1];
    }
    
    int method7365(int i) {
	if (i < 1)
	    return 0;
	if (i > ((Class616) this).anIntArray8032.length)
	    i = ((Class616) this).anIntArray8032.length;
	return ((Class616) this).anIntArray8032[i - 1];
    }
    
    Class616(int[] is) {
	if (is == null)
	    throw new NullPointerException();
	((Class616) this).anIntArray8032 = is;
	method7357(1699356352);
    }
    
    int method7366(int i) {
	if (i < 1)
	    return 0;
	if (i > ((Class616) this).anIntArray8032.length)
	    i = ((Class616) this).anIntArray8032.length;
	return ((Class616) this).anIntArray8032[i - 1];
    }
    
    static final void method7367(Class648 class648, int i)
	throws Exception_Sub4 {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_14_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	Class422 class422
	    = Class422.method5051((float) i_14_, (float) i_14_, (float) i_14_);
	Class495.aClass283_Sub1_5578.method3771(class422, 1297539230);
	class422.method5054();
    }
    
    static final void method7368(Class648 class648, short i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub12_10590
		  .method9915((byte) 1) == 1 ? 1 : 0;
    }
    
    static final void method7369(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub8_10565
		  .method9884(819330344) ? 1 : 0;
    }
    
    public static void method7370(Iterable iterable,
				  ByteBuffer class528_sub42, int i) {
	int i_15_ = Class558.method6775(iterable, -531941123);
	class528_sub42.method9622(i_15_, 980539535);
	if (0 != i_15_) {
	    for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
		class528_sub42.payload
		    [class528_sub42.pointer * -185904669 + i_16_]
		    = (byte) 0;
	    Iterator iterator = iterable.iterator();
	    while (iterator.hasNext()) {
		IClientEnum iClientEnum = (IClientEnum) iterator.next();
		int i_17_ = iClientEnum.method68();
		int i_18_ = i_17_ / 8;
		class528_sub42.payload
		    [i_18_ + -185904669 * class528_sub42.pointer]
		    |= 1 << (i_17_ & 0x7);
	    }
	    class528_sub42.pointer += i_15_ * 2015001547;
	}
    }
    
    static final void method7371(Class648 class648, byte i) {
	int i_19_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class570.playerVarsProvider.method471(i_19_, -61474679);
    }
    
    static final void method7372(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.aBool2444 = false;
	Class39.method811(class229, 1435904523);
    }
    
    static final void method7373(int i, int i_20_, int i_21_, int i_22_,
				 int i_23_) {
	int i_24_ = client.anInt11113 * -740223033;
	int i_25_ = 2134586505 * client.anInt10965;
	if (client.anInt11006 * 1341659413 == 1) {
	    Class151 class151 = (Class691_Sub16.aClass151Array10741
				 [client.anInt11005 * 1450042455 / 100]);
	    class151.method1773(i_24_ - 8, i_25_ - 8);
	}
	if (2 == client.anInt11006 * 1341659413) {
	    Class151 class151 = (Class691_Sub16.aClass151Array10741
				 [4 + client.anInt11005 * 1450042455 / 100]);
	    class151.method1773(i_24_ - 8, i_25_ - 8);
	}
    }
}
