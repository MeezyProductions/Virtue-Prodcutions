/* Class181_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

public abstract class Class181_Sub10 extends Class181
{
    int anInt9805;
    int anInt9806;
    int anInt9807;
    
    boolean method2677(byte i) {
	Class669 class669
	    = ((Class669)
	       Class2.aClass5_Sub12_24.method63((((Class181_Sub10) this)
						 .anInt9807) * -62166223,
						1242846712));
	boolean bool = class669.method7930((byte) 0);
	Class190 class190
	    = ((Class190)
	       Class379.aClass5_Sub4_3966
		   .method63(class669.anInt8519 * 916695593, -638590746));
	bool &= class190.method2776(-810960482);
	return bool;
    }
    
    Class181_Sub10(ByteBuffer class528_sub42) {
	super(class528_sub42);
	((Class181_Sub10) this).anInt9807
	    = class528_sub42.readUnsignedShort(-1892638819) * -1698951727;
	((Class181_Sub10) this).anInt9806
	    = class528_sub42.readUnsignedShort(-1477181771) * 1126939607;
	((Class181_Sub10) this).anInt9805
	    = class528_sub42.readUnsignedByte((byte) 100) * 356722949;
    }
    
    boolean method2679() {
	Class669 class669
	    = ((Class669)
	       Class2.aClass5_Sub12_24.method63((((Class181_Sub10) this)
						 .anInt9807) * -62166223,
						-1678949569));
	boolean bool = class669.method7930((byte) 0);
	Class190 class190
	    = ((Class190)
	       Class379.aClass5_Sub4_3966
		   .method63(class669.anInt8519 * 916695593, 116333806));
	bool &= class190.method2776(-1204249101);
	return bool;
    }
    
    boolean method2680() {
	Class669 class669
	    = ((Class669)
	       Class2.aClass5_Sub12_24.method63((((Class181_Sub10) this)
						 .anInt9807) * -62166223,
						-1392703093));
	boolean bool = class669.method7930((byte) 0);
	Class190 class190
	    = ((Class190)
	       Class379.aClass5_Sub4_3966
		   .method63(class669.anInt8519 * 916695593, 2047639412));
	bool &= class190.method2776(-1719723477);
	return bool;
    }
    
    public static Class173 method8961
	(int i, Canvas canvas, Class165 class165, Interface22 interface22,
	 Interface44 interface44, Interface45 interface45,
	 Interface46 interface46, Class446 class446, int i_0_, int i_1_) {
	int i_2_ = 0;
	int i_3_ = 0;
	if (null != canvas) {
	    Dimension dimension = canvas.getSize();
	    i_2_ = dimension.width;
	    i_3_ = dimension.height;
	}
	return Class173.method2292(i, canvas, class165, interface22,
				   interface44, interface45, interface46,
				   class446, i_0_, i_2_, i_3_, (byte) -79);
    }
    
    static final void method8962(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class193.method2804(class229, class226, class648, -1050335314);
    }
}
