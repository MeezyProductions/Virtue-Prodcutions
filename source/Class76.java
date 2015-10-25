/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class76
{
    Class446 aClass446_791;
    static Class446 aClass446_792;
    static final int anInt793 = 0;
    int anInt794;
    Class80[] aClass80Array795;
    
    public Class76(Class673 class673, Class668 class668, Class446 class446) {
	((Class76) this).aClass446_791 = class446;
	ByteBuffer class528_sub42
	    = new ByteBuffer(((Class76) this).aClass446_791
				     .method5348(0, 0, -1617359773));
	int i = ((null == class528_sub42.payload
		  || class528_sub42.payload.length < 1)
		 ? -1 : class528_sub42.readUnsignedByte((byte) 92));
	if (i < 4) {
	    ((Class76) this).aClass80Array795 = new Class80[0];
	    ((Class76) this).anInt794 = 1545905071;
	} else {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 59);
	    Class379[] class379s = Class359.method4591(1447043715);
	    boolean bool = true;
	    if (class379s.length != i_0_)
		bool = false;
	    else {
		for (int i_1_ = 0; i_1_ < class379s.length; i_1_++) {
		    int i_2_ = class528_sub42.readUnsignedByte((byte) 55);
		    if (i_2_ != -692535163 * class379s[i_1_].anInt3957) {
			bool = false;
			break;
		    }
		}
	    }
	    if (bool) {
		int i_3_ = class528_sub42.readUnsignedByte((byte) 64);
		int i_4_ = class528_sub42.readUnsignedByte((byte) 13);
		int i_5_;
		int i_6_;
		if (i > 2) {
		    ((Class76) this).anInt794
			= class528_sub42.method9642(1817250734) * -1545905071;
		    i_5_ = class528_sub42.readTriByte(356573015);
		    i_6_ = class528_sub42.readUnsignedShort(-1375825797);
		} else {
		    ((Class76) this).anInt794 = 1545905071;
		    i_5_ = 0;
		    i_6_ = 0;
		}
		((Class76) this).aClass80Array795 = new Class80[i_4_ + 1];
		for (int i_7_ = 0; i_7_ < i_3_; i_7_++) {
		    int i_8_ = class528_sub42.readUnsignedByte((byte) 39);
		    boolean bool_9_
			= class528_sub42.readUnsignedByte((byte) 120) == 1;
		    int i_10_ = class528_sub42.readUnsignedShort(-170112600);
		    Class84[] class84s;
		    if (309554353 * ((Class76) this).anInt794 == -1) {
			class84s = new Class84[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
			    int i_12_ = class528_sub42.readUnsignedShort(312091682);
			    int i_13_ = class528_sub42.readTriByte(178586581);
			    int i_14_ = class528_sub42.readUnsignedShort(-1956625635);
			    class84s[i_11_] = new Class84(i_12_, i_13_, i_14_);
			}
			((Class76) this).aClass80Array795[i_8_]
			    = new Class80(bool_9_, class84s);
		    } else {
			class84s = new Class84[1 + i_10_];
			class84s[0] = new Class84(309554353 * (((Class76) this)
							       .anInt794),
						  i_5_, i_6_);
			for (int i_15_ = 0; i_15_ < i_10_; i_15_++) {
			    int i_16_ = class528_sub42.readUnsignedShort(-486005655);
			    int i_17_ = class528_sub42.readTriByte(-1640265501);
			    int i_18_ = class528_sub42.readUnsignedShort(-298691442);
			    class84s[1 + i_15_]
				= new Class84(i_16_, i_17_, i_18_);
			}
		    }
		    ((Class76) this).aClass80Array795[i_8_]
			= new Class80(bool_9_, class84s);
		}
		for (int i_19_ = 0; i_19_ < 1 + i_4_; i_19_++) {
		    if (((Class76) this).aClass80Array795[i_19_] == null)
			((Class76) this).aClass80Array795[i_19_]
			    = method1123(i_5_, i_6_, (short) -24140);
		}
	    } else {
		((Class76) this).aClass80Array795 = new Class80[0];
		((Class76) this).anInt794 = 1545905071;
	    }
	}
    }
    
    public Class83 method1120(int i, int i_20_) {
	byte[] is
	    = ((Class76) this).aClass446_791.method5348(i, 0, -1196496475);
	Class83 class83 = new Class83();
	class83.method1151(new ByteBuffer(is), 2077055842);
	return class83;
    }
    
    public Class84[] method1121(int i, int i_21_) {
	if (i < 0 || i >= ((Class76) this).aClass80Array795.length)
	    return (((Class80) method1123(0, 0, (short) -26950))
		    .aClass84Array814);
	Class80 class80 = ((Class76) this).aClass80Array795[i];
	if (!((Class80) class80).aBool813
	    || ((Class80) class80).aClass84Array814.length <= 1)
	    return ((Class80) class80).aClass84Array814;
	int i_22_ = -1 == ((Class76) this).anInt794 * 309554353 ? 0 : 1;
	Random random = new Random();
	Class84[] class84s
	    = new Class84[((Class80) class80).aClass84Array814.length];
	System.arraycopy(((Class80) class80).aClass84Array814, 0, class84s, 0,
			 class84s.length);
	for (int i_23_ = i_22_; i_23_ < class84s.length; i_23_++) {
	    int i_24_
		= (Class511_Sub6.method9346(random, class84s.length - i_22_,
					    -779430548)
		   + i_22_);
	    Class84 class84 = ((Class80) class80).aClass84Array814[i_23_];
	    class84s[i_23_] = class84s[i_24_];
	    class84s[i_24_] = class84;
	}
	return class84s;
    }
    
    public boolean method1122(int i) {
	return 309554353 * ((Class76) this).anInt794 != -1;
    }
    
    Class80 method1123(int i, int i_25_, short i_26_) {
	if (-1 == ((Class76) this).anInt794 * 309554353)
	    return new Class80(false, new Class84[0]);
	Class84 class84
	    = new Class84(309554353 * ((Class76) this).anInt794, i, i_25_);
	return new Class80(false, new Class84[] { class84 });
    }
    
    public boolean method1124() {
	return 309554353 * ((Class76) this).anInt794 != -1;
    }
    
    public boolean method1125() {
	return 309554353 * ((Class76) this).anInt794 != -1;
    }
    
    public boolean method1126() {
	return 309554353 * ((Class76) this).anInt794 != -1;
    }
    
    public static void method1127(int i, int i_27_, byte i_28_) {
	Class518_Sub1.anInt10692 = (i - Class518_Sub1.anInt6972) * 847541453;
	Class518_Sub1.anInt10687
	    = (i_27_ - Class518_Sub1.anInt6995) * -1998421085;
    }
}
