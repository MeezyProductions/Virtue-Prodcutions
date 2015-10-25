/* Class181_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class181_Sub1 extends Class181
{
    int anInt9114;
    int anInt9115;
    int anInt9116;
    int anInt9117;
    int anInt9118;
    
    public void method2681() {
	Class185.aClass182Array2106
	    [388549931 * ((Class181_Sub1) this).anInt9115].method2688
	    (-920103127 * ((Class181_Sub1) this).anInt9114,
	     1977111249 * ((Class181_Sub1) this).anInt9116,
	     1161958121 * ((Class181_Sub1) this).anInt9117,
	     ((Class181_Sub1) this).anInt9118 * -3341777, 269975288);
    }
    
    public void method2675(byte i) {
	Class185.aClass182Array2106
	    [388549931 * ((Class181_Sub1) this).anInt9115].method2688
	    (-920103127 * ((Class181_Sub1) this).anInt9114,
	     1977111249 * ((Class181_Sub1) this).anInt9116,
	     1161958121 * ((Class181_Sub1) this).anInt9117,
	     ((Class181_Sub1) this).anInt9118 * -3341777, 1486100620);
    }
    
    Class181_Sub1(ByteBuffer class528_sub42) {
	super(class528_sub42);
	((Class181_Sub1) this).anInt9115
	    = class528_sub42.readUnsignedShort(-124511743) * -2055632509;
	int i = class528_sub42.readInt(452790516);
	((Class181_Sub1) this).anInt9114 = (i >>> 16) * -312199911;
	((Class181_Sub1) this).anInt9116 = (i & 0xffff) * -897366479;
	((Class181_Sub1) this).anInt9117
	    = class528_sub42.readUnsignedByte((byte) 10) * -1542068903;
	((Class181_Sub1) this).anInt9118
	    = class528_sub42.method9640(-1237840436) * -841644849;
    }
    
    public void method2678() {
	Class185.aClass182Array2106
	    [388549931 * ((Class181_Sub1) this).anInt9115].method2688
	    (-920103127 * ((Class181_Sub1) this).anInt9114,
	     1977111249 * ((Class181_Sub1) this).anInt9116,
	     1161958121 * ((Class181_Sub1) this).anInt9117,
	     ((Class181_Sub1) this).anInt9118 * -3341777, 162772781);
    }
    
    static void method8396(Entity class645_sub1_sub5_sub1,
			   int i, byte i_0_) {
	if (class645_sub1_sub5_sub1.anIntArray11819 != null) {
	    Class666 class666
		= ((Class666)
		   Class443.method5321(Class666.method7904(-1991981068), i,
				       2094013784));
	    int i_1_ = (class645_sub1_sub5_sub1.anIntArray11819
			[class666.method7900(-1458341479)]);
	    if (i_1_ != class645_sub1_sub5_sub1.aClass690_11774
			    .method8068(-772845955)) {
		class645_sub1_sub5_sub1.aClass690_11774.method8122
		    (i_1_, class645_sub1_sub5_sub1.aClass690_11774
			       .method8076((byte) 22), 170817725);
		class645_sub1_sub5_sub1.anInt11818
		    = class645_sub1_sub5_sub1.quenedStepCount * -1128762047;
	    }
	}
    }
    
    public static void method8397(Class229 class229, int i, int i_2_,
				  int i_3_) {
	if (null != class229) {
	    if (null != class229.anObjectArray2494) {
		Class528_Sub30 class528_sub30 = new Class528_Sub30();
		class528_sub30.aClass229_10461 = class229;
		class528_sub30.anObjectArray10460 = class229.anObjectArray2494;
		Class555.method6741(class528_sub30, (short) 5713);
	    }
	    client.aBool10899 = true;
	    Class487.anInt5494 = -1882350313 * class229.anInt2376;
	    client.anInt11052 = class229.anInt2377 * -824893529;
	    Class296.anInt3249 = i * -817259433;
	    Class690.anInt8680 = -2091562925 * i_2_;
	    client.anInt11053 = class229.anInt2528 * 1391435091;
	    Class528_Sub6.anInt10255 = 953783373 * class229.anInt2396;
	    client.anInt11048 = class229.anInt2397 * 1668643339;
	    Class39.method811(class229, 1435904523);
	}
    }
    
    static void method8398(int[] is, double d) {
	if (d != Class156.aDouble1734) {
	    for (int i = 0; i < 256; i++) {
		int i_4_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
		Class156.anIntArray1733[i] = i_4_ > 255 ? 255 : i_4_;
	    }
	    Class156.aDouble1734 = d;
	}
	for (int i = 0; i < is.length; i++) {
	    int i_5_ = Class156.anIntArray1733[is[i] >> 16 & 0xff];
	    int i_6_ = Class156.anIntArray1733[is[i] >> 8 & 0xff];
	    int i_7_ = Class156.anIntArray1733[is[i] >> 0 & 0xff];
	    is[i] = is[i] & ~0xffffff | i_5_ << 16 | i_6_ << 8 | i_7_;
	}
    }
    
    static final void method8399(Class648 class648, byte i) {
	int i_8_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) (Math.random() * (double) i_8_);
    }
}
