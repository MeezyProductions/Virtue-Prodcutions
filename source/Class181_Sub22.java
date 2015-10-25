/* Class181_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class181_Sub22 extends Class181
{
    int anInt9869;
    int anInt9870;
    int anInt9871;
    int anInt9872;
    int anInt9873;
    
    public void method2675(byte i) {
	OutputStream_Sub1.aClass195Array10839
	    [858270997 * ((Class181_Sub22) this).anInt9871].method2816
	    (-1546094853 * ((Class181_Sub22) this).anInt9872,
	     ((Class181_Sub22) this).anInt9870 * 1005981597,
	     -780900439 * ((Class181_Sub22) this).anInt9869,
	     -1155493235 * ((Class181_Sub22) this).anInt9873, 62355862);
    }
    
    public void method2678() {
	OutputStream_Sub1.aClass195Array10839
	    [858270997 * ((Class181_Sub22) this).anInt9871].method2816
	    (-1546094853 * ((Class181_Sub22) this).anInt9872,
	     ((Class181_Sub22) this).anInt9870 * 1005981597,
	     -780900439 * ((Class181_Sub22) this).anInt9869,
	     -1155493235 * ((Class181_Sub22) this).anInt9873, -725210303);
    }
    
    Class181_Sub22(ByteBuffer class528_sub42) {
	super(class528_sub42);
	((Class181_Sub22) this).anInt9871
	    = class528_sub42.readUnsignedShort(-1135265096) * -956515779;
	int i = class528_sub42.readInt(-1760956950);
	((Class181_Sub22) this).anInt9870 = -559944011 * (i >>> 16);
	((Class181_Sub22) this).anInt9869 = (i & 0xffff) * 282406041;
	((Class181_Sub22) this).anInt9872
	    = class528_sub42.readUnsignedByte((byte) 16) * 207561779;
	((Class181_Sub22) this).anInt9873
	    = class528_sub42.readUnsignedByte((byte) 13) * 523927621;
    }
    
    public void method2681() {
	OutputStream_Sub1.aClass195Array10839
	    [858270997 * ((Class181_Sub22) this).anInt9871].method2816
	    (-1546094853 * ((Class181_Sub22) this).anInt9872,
	     ((Class181_Sub22) this).anInt9870 * 1005981597,
	     -780900439 * ((Class181_Sub22) this).anInt9869,
	     -1155493235 * ((Class181_Sub22) this).anInt9873, -291697763);
    }
    
    static void method8996(byte i) {
	int i_0_ = 0;
	if (null != Class514.aClass528_Sub38_6967)
	    i_0_ = Class514.aClass528_Sub38_6967.aClass691_Sub13_10587
		       .method9925((byte) 1);
	if (i_0_ == 2) {
	    int i_1_ = (624323463 * client.anInt6929 > 800 ? 800
			: 624323463 * client.anInt6929);
	    int i_2_ = (Class106.anInt1314 * 1116226221 > 600 ? 600
			: Class106.anInt1314 * 1116226221);
	    Class411.anInt4713 = i_1_ * 1161376205;
	    client.anInt6931
		= (624323463 * client.anInt6929 - i_1_) / 2 * -79148317;
	    client.anInt6933 = i_2_ * -1380560103;
	    client.anInt6943 = 0;
	} else if (1 == i_0_) {
	    int i_3_ = (624323463 * client.anInt6929 > 1024 ? 1024
			: 624323463 * client.anInt6929);
	    int i_4_ = (1116226221 * Class106.anInt1314 > 768 ? 768
			: Class106.anInt1314 * 1116226221);
	    Class411.anInt4713 = 1161376205 * i_3_;
	    client.anInt6931
		= -79148317 * ((624323463 * client.anInt6929 - i_3_) / 2);
	    client.anInt6933 = -1380560103 * i_4_;
	    client.anInt6943 = 0;
	} else {
	    Class411.anInt4713 = -1959267813 * client.anInt6929;
	    client.anInt6931 = 0;
	    client.anInt6933 = -51734043 * Class106.anInt1314;
	    client.anInt6943 = 0;
	}
    }
    
    static final void method8997(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	client.aShort11111
	    = (short) (((Class648) class648).anIntArray8394
		       [((Class648) class648).anInt8395 * 717927929]);
	if (client.aShort11111 <= 0)
	    client.aShort11111 = (short) 256;
	client.aShort11147
	    = (short) (((Class648) class648).anIntArray8394
		       [1 + 717927929 * ((Class648) class648).anInt8395]);
	if (client.aShort11147 <= 0)
	    client.aShort11147 = (short) 320;
    }
    
    static final void method8998(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class43.method855(class229, class226, class648, -2146633290);
    }
}
