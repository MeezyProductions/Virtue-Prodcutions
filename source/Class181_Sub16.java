/* Class181_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class181_Sub16 extends Class181
{
    int anInt9832;
    int anInt9833;
    public static int anInt9834;
    static Class151 aClass151_9835;
    
    Class181_Sub16(ByteBuffer class528_sub42) {
	super(class528_sub42);
	((Class181_Sub16) this).anInt9833
	    = class528_sub42.readUnsignedShort(-421582019) * -1996411879;
	((Class181_Sub16) this).anInt9832
	    = class528_sub42.readUnsignedByte((byte) 115) * -238445155;
    }
    
    public void method2675(byte i) {
	Class365.aClass218_3848.method3126
	    (-2008190935 * ((Class181_Sub16) this).anInt9833,
	     ((Class181_Sub16) this).anInt9832 * -223031115, 253150651);
    }
    
    public void method2678() {
	Class365.aClass218_3848.method3126
	    (-2008190935 * ((Class181_Sub16) this).anInt9833,
	     ((Class181_Sub16) this).anInt9832 * -223031115, 611128350);
    }
    
    public void method2681() {
	Class365.aClass218_3848.method3126
	    (-2008190935 * ((Class181_Sub16) this).anInt9833,
	     ((Class181_Sub16) this).anInt9832 * -223031115, 220309966);
    }
    
    static void method8968(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [717927929 * ((Class648) class648).anInt8395 - 1]
	    = (((Class256)
		Class669.aClass25_Sub1_8522.method63((((Class648) class648)
						      .anIntArray8394
						      [((((Class648) class648)
							 .anInt8395)
							* 717927929) - 1]),
						     -1140539102)).anInt2818
	       * 2045043393);
    }
    
    static int method8969(byte[] is, int i, int i_0_, byte i_1_) {
	int i_2_ = -1;
	for (int i_3_ = i; i_3_ < i_0_; i_3_++)
	    i_2_ = i_2_ >>> 8 ^ (ByteBuffer.anIntArray10659
				 [(i_2_ ^ is[i_3_]) & 0xff]);
	i_2_ ^= 0xffffffff;
	return i_2_;
    }
    
    static final void method8970
	(Entity class645_sub1_sub5_sub1, int i) {
	int i_4_ = (class645_sub1_sub5_sub1.anInt11792 * -1833893027
		    - client.anInt11127);
	int i_5_ = (784833024 * class645_sub1_sub5_sub1.anInt11766
		    + class645_sub1_sub5_sub1.method10671((byte) -76) * 256);
	int i_6_ = (class645_sub1_sub5_sub1.anInt11765 * -573747712
		    + class645_sub1_sub5_sub1.method10671((byte) -94) * 256);
	int i_7_ = Class335_Sub1_Sub1.method10374(i_5_, i_6_,
						  (991304933
						   * (class645_sub1_sub5_sub1
						      .anInt11790)),
						  -759833206);
	Class422 class422
	    = class645_sub1_sub5_sub1.method7693().aClass422_4868;
	class645_sub1_sub5_sub1.method7682
	    ((float) ((int) class422.aFloat4780
		      + (i_5_ - (int) class422.aFloat4780) / i_4_),
	     (float) ((i_7_ - (int) class422.aFloat4776) / i_4_
		      + (int) class422.aFloat4776),
	     (float) ((int) class422.aFloat4777
		      + (i_6_ - (int) class422.aFloat4777) / i_4_));
	class645_sub1_sub5_sub1.anInt11816 = 0;
	class645_sub1_sub5_sub1.method10691((1222279203
					     * (class645_sub1_sub5_sub1
						.anInt11794)),
					    (byte) -13);
    }
}
