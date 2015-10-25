/* Class5_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class5_Sub7 extends Class5
{
    public static Class5_Sub5 aClass5_Sub5_10838;
    
    public Class5_Sub7(Class673 class673, Class668 class668, Class446 class446,
		       Class446 class446_0_) {
	super(class673, class668, class446, SharedConfigsType.aClass644_8297, 64,
	      new Class318(class446_0_));
    }
    
    static void method10151(Cs2Context cs2Context, int i, int i_1_,
			    Class648 class648, int i_2_) {
	Class528_Sub21_Sub14 class528_sub21_sub14
	    = Class192.method2796(cs2Context, i, i_1_, (byte) 96);
	if (class528_sub21_sub14 == null)
	    Class236.method3282(-1724526546);
	else {
	    ((Class648) class648).anIntArray8405
		= new int[class528_sub21_sub14.anInt11628 * -1274963297];
	    ((Class648) class648).anObjectArray8412
		= new Object[class528_sub21_sub14.anInt11623 * 558215757];
	    if (Cs2Context.aClass561_7518 == class528_sub21_sub14.aClass561_11626
		|| (class528_sub21_sub14.aClass561_11626
		    == Cs2Context.aClass561_7520)
		|| (class528_sub21_sub14.aClass561_11626
		    == Cs2Context.aClass561_7515)) {
		((Class648) class648).anIntArray8405[0] = i;
		((Class648) class648).anIntArray8405[1]
		    = Class95_Sub1_Sub2.aClass537_11200.method6507(1192869321);
		((Class648) class648).anIntArray8405[2]
		    = Class95_Sub1_Sub2.aClass537_11200.method6504((byte) -47);
	    } else if ((Cs2Context.aClass561_7519
			== class528_sub21_sub14.aClass561_11626)
		       || (class528_sub21_sub14.aClass561_11626
			   == Cs2Context.aClass561_7514)
		       || (Cs2Context.aClass561_7517
			   == class528_sub21_sub14.aClass561_11626)
		       || (Cs2Context.aClass561_7516
			   == class528_sub21_sub14.aClass561_11626)
		       || (class528_sub21_sub14.aClass561_11626
			   == Cs2Context.aClass561_7532))
		((Class648) class648).anIntArray8405[0] = i;
	    else if (class528_sub21_sub14.aClass561_11626
		     == Cs2Context.aClass561_7526)
		((Class648) class648).anIntArray8405[0]
		    = -1363424283 * ((Class648) class648).anInt8413;
	    Class309.method4126(class528_sub21_sub14, 200000, class648,
				(byte) 3);
	}
    }
    
    static final void method10152(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_3_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_4_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	Class679 class679
	    = Class518.method6330(i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff);
	boolean bool = false;
	for (Class528_Sub21_Sub17 class528_sub21_sub17
		 = (Class528_Sub21_Sub17) class679.method7960(-1550587110);
	     class528_sub21_sub17 != null;
	     class528_sub21_sub17
		 = (Class528_Sub21_Sub17) class679.method7969(1840067791)) {
	    if (class528_sub21_sub17.anInt11644 * 2000200341 == i_4_) {
		bool = true;
		break;
	    }
	}
	if (bool)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
    }
}
