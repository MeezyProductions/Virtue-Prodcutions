/* Class448 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class448
{
    static final int anInt4950 = 0;
    static final int anInt4951 = 2;
    static final int anInt4952 = 4;
    static final int anInt4953 = 3;
    static final int anInt4954 = 1;
    static final int anInt4955 = 6;
    static final int anInt4956 = 7;
    
    Class448() throws Throwable {
	throw new Error();
    }
    
    static final void method5409(Class648 class648, int i) {
	boolean bool
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	if (bool)
	    Class533.method6489(6, -2112139060);
	else
	    Class533.method6489(4, -1889551065);
    }
    
    static final void method5410(int i, int i_0_, int i_1_, int i_2_, int i_3_,
				 boolean bool, boolean bool_4_, int i_5_) {
	if (!bool
	    && (i_0_ < 512 || i_1_ < 512
		|| i_0_ > (client.gameScene.method6029((short) 10463)
			   - 2) * 512
		|| i_1_ > ((client.gameScene.method5967(587587205) - 2)
			   * 512))) {
	    float[] fs = client.aFloatArray10888;
	    client.aFloatArray10888[1] = -1.0F;
	    fs[0] = -1.0F;
	} else {
	    int i_6_
		= (Class335_Sub1_Sub1.method10374(i_0_, i_1_, i, -759833206)
		   - i_3_);
	    client.aClass433_11080
		.method5217(Class587.aClass173_7714.method2529());
	    client.aClass433_11080.method5252((float) i_2_, 0.0F, 0.0F);
	    Class587.aClass173_7714.method2465(client.aClass433_11080);
	    if (bool)
		Class587.aClass173_7714.method2322((float) i_0_, (float) i_6_,
						   (float) i_1_,
						   client.aFloatArray10888);
	    else
		Class587.aClass173_7714.method2277((float) i_0_, (float) i_6_,
						   (float) i_1_,
						   client.aFloatArray10888);
	    client.aClass433_11080.method5252((float) -i_2_, 0.0F, 0.0F);
	    Class587.aClass173_7714.method2465(client.aClass433_11080);
	    if (!bool_4_) {
		client.aFloatArray10888[0]
		    -= (float) (485124999 * client.anInt11152);
		client.aFloatArray10888[1]
		    -= (float) (client.anInt11153 * 2056720113);
	    }
	}
    }
}
