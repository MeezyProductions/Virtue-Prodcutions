/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class Class171
{
    public Class685 aClass685_1959 = new Class685();
    public static final int anInt1960 = 8191;
    
    static final void method2115(int i, Class229 class229, Class648 class648,
				 int i_0_) {
	if (i < 1 || i > 10)
	    throw new RuntimeException();
	Class204.method2910(i, class229.anInt2376 * 306930455,
			    class229.anInt2377 * 1835803215, "", -2133134664);
    }
    
    static boolean method2116(int i, int i_1_, int i_2_, int i_3_) {
	Class538 class538 = client.gameScene.method5973((byte) 73);
	boolean bool = true;
	Interface60 interface60
	    = (Interface60) class538.method6600(i, i_1_, i_2_, (byte) -59);
	if (interface60 != null)
	    bool &= RenderType.method6991(interface60, -104650304);
	interface60
	    = (Interface60) class538.method6583(i, i_1_, i_2_,
						client.anInterface62_11170,
						2041540739);
	if (null != interface60)
	    bool &= RenderType.method6991(interface60, -2135473172);
	interface60
	    = (Interface60) class538.method6591(i, i_1_, i_2_, -2090651648);
	if (null != interface60)
	    bool &= RenderType.method6991(interface60, -1220500344);
	return bool;
    }
    
    static final void method2117(int i, int i_4_, int i_5_, int i_6_,
				 byte i_7_) {
	for (int i_8_ = 0; i_8_ < -230570629 * client.anInt11114; i_8_++) {
	    Rectangle rectangle = client.aRectangleArray11090[i_8_];
	    if (rectangle.x + rectangle.width > i && rectangle.x < i + i_5_
		&& rectangle.height + rectangle.y > i_4_
		&& rectangle.y < i_6_ + i_4_)
		client.aBoolArray10855[i_8_] = true;
	}
    }
    
    static final void method2118(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub34_10591,
	     (((Class648) class648).anIntArray8394
	      [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]),
	     443444729);
	Class243.method3387(2135049156);
	client.aBool11161 = false;
    }
}
