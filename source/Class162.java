/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public abstract class Class162
{
    public static Class624 equipDefaults;
    
    Class162() {
	/* empty */
    }
    
    static final void method2067(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class572.method6861(class229, class226, class648, -1905906671);
    }
    
    public static void method2068(byte i) {
	if (Class207.aFrame2236 == null) {
	    int i_0_ = 1401768651 * client.anInt6931;
	    int i_1_ = -952966111 * client.anInt6943;
	    int i_2_ = (624323463 * client.anInt6929
			- -1117838587 * Class411.anInt4713 - i_0_);
	    int i_3_ = (1116226221 * Class106.anInt1314
			- client.anInt6933 * -2142152407 - i_1_);
	    if (i_0_ > 0 || i_2_ > 0 || i_1_ > 0 || i_3_ > 0) {
		try {
		    Container container = Class465.method5625(312287159);
		    int i_4_ = 0;
		    int i_5_ = 0;
		    if (container == Class196.aFrame2197) {
			Insets insets = Class196.aFrame2197.getInsets();
			i_4_ = insets.left;
			i_5_ = insets.top;
		    }
		    Graphics graphics = container.getGraphics();
		    graphics.setColor(Color.black);
		    if (i_0_ > 0)
			graphics.fillRect(i_4_, i_5_, i_0_,
					  Class106.anInt1314 * 1116226221);
		    if (i_1_ > 0)
			graphics.fillRect(i_4_, i_5_,
					  624323463 * client.anInt6929, i_1_);
		    if (i_2_ > 0)
			graphics.fillRect((i_4_ + client.anInt6929 * 624323463
					   - i_2_),
					  i_5_, i_2_,
					  Class106.anInt1314 * 1116226221);
		    if (i_3_ > 0)
			graphics.fillRect(i_4_,
					  (Class106.anInt1314 * 1116226221
					   + i_5_ - i_3_),
					  client.anInt6929 * 624323463, i_3_);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
    }
}
