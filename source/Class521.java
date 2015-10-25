/* Class521 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class521
{
    Class529 this$1;
    short[] aShortArray7048;
    public static long aLong7049;
    
    void method6350(byte i) {
	Class253.method3439(((Class521) this).aShortArray7048, (byte) -70);
    }
    
    byte method6351(Class324 class324, byte i) throws IOException {
	int i_0_ = 1;
	do
	    i_0_ = (i_0_ << 1
		    | class324.method4217(((Class521) this).aShortArray7048,
					  i_0_, -898702793));
	while (i_0_ < 256);
	return (byte) i_0_;
    }
    
    void method6352() {
	Class253.method3439(((Class521) this).aShortArray7048, (byte) -51);
    }
    
    void method6353() {
	Class253.method3439(((Class521) this).aShortArray7048, (byte) -123);
    }
    
    void method6354() {
	Class253.method3439(((Class521) this).aShortArray7048, (byte) -81);
    }
    
    Class521(Class529 class529) {
	((Class521) this).this$1 = class529;
	((Class521) this).aShortArray7048 = new short[768];
    }
    
    byte method6355(Class324 class324, byte i, int i_1_) throws IOException {
	int i_2_ = 1;
	do {
	    int i_3_ = i >> 7 & 0x1;
	    i <<= 1;
	    int i_4_ = class324.method4217(((Class521) this).aShortArray7048,
					   (1 + i_3_ << 8) + i_2_, -215045239);
	    i_2_ = i_2_ << 1 | i_4_;
	    if (i_3_ != i_4_) {
		for (/**/; i_2_ < 256;
		     i_2_
			 = i_2_ << 1 | class324.method4217((((Class521) this)
							    .aShortArray7048),
							   i_2_, -740297889)) {
		    /* empty */
		}
		break;
	    }
	} while (i_2_ < 256);
	return (byte) i_2_;
    }
    
    public static void method6356
	(float f, Class422 class422, Class422 class422_5_,
	 Class422 class422_6_, Class422 class422_7_, Class422 class422_8_,
	 float f_9_, float f_10_, float f_11_, float f_12_, int i) {
	if (!class422_5_.method5060(class422)) {
	    Class422 class422_13_ = Class422.method5065(class422_5_, class422);
	    float f_14_ = class422_13_.method5069();
	    if (f_9_ > 0.0F) {
		class422_7_ = Class422.method5052(class422_7_);
		class422_7_.method5095(f_10_ * (f_14_ / f_9_));
	    }
	    if (class422_7_.aFloat4780 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class422.aFloat4780) || f_14_ > f_11_) {
		class422.method5058(class422_5_);
		class422_6_.method5059();
	    } else {
		Class422 class422_15_ = Class422.method5052(class422_6_);
		class422_15_.method5070();
		Class422 class422_16_
		    = Class422.method5078(class422_15_, class422_7_);
		Class422 class422_17_
		    = Class422.method5091(class422_15_, class422_16_);
		class422_17_.method5095(0.5F);
		Class422 class422_18_ = Class422.method5052(class422_6_);
		Class422 class422_19_ = Class422.method5052(class422_13_);
		class422_19_.method5070();
		if (class422_17_.aFloat4780 > class422_19_.aFloat4780) {
		    if (class422_13_.aFloat4780 < 0.0F) {
			class422_18_.aFloat4780 += f * class422_7_.aFloat4780;
			if (class422_18_.aFloat4780 > 0.0F)
			    class422_18_.aFloat4780 = 0.0F;
		    } else {
			class422_18_.aFloat4780 -= class422_7_.aFloat4780 * f;
			if (class422_18_.aFloat4780 < 0.0F)
			    class422_18_.aFloat4780 = 0.0F;
		    }
		} else if (class422_15_.aFloat4780 < class422_8_.aFloat4780) {
		    if (class422_13_.aFloat4780 < 0.0F) {
			class422_18_.aFloat4780 -= class422_7_.aFloat4780 * f;
			if (class422_18_.aFloat4780 < -class422_8_.aFloat4780)
			    class422_18_.aFloat4780 = -class422_8_.aFloat4780;
		    } else {
			class422_18_.aFloat4780 += class422_7_.aFloat4780 * f;
			if (class422_18_.aFloat4780 > class422_8_.aFloat4780)
			    class422_18_.aFloat4780 = class422_8_.aFloat4780;
		    }
		}
		if (class422_17_.aFloat4776 > class422_19_.aFloat4776) {
		    if (class422_13_.aFloat4776 < 0.0F) {
			class422_18_.aFloat4776 += f * class422_7_.aFloat4776;
			if (class422_18_.aFloat4776 > 0.0F)
			    class422_18_.aFloat4776 = 0.0F;
		    } else {
			class422_18_.aFloat4776 -= f * class422_7_.aFloat4776;
			if (class422_18_.aFloat4776 < 0.0F)
			    class422_18_.aFloat4776 = 0.0F;
		    }
		} else if (class422_15_.aFloat4776 < class422_8_.aFloat4776) {
		    if (class422_13_.aFloat4776 < 0.0F) {
			class422_18_.aFloat4776 -= class422_7_.aFloat4776 * f;
			if (class422_18_.aFloat4776 < -class422_8_.aFloat4776)
			    class422_18_.aFloat4776 = -class422_8_.aFloat4776;
		    } else {
			class422_18_.aFloat4776 += f * class422_7_.aFloat4776;
			if (class422_18_.aFloat4776 > class422_8_.aFloat4776)
			    class422_18_.aFloat4776 = class422_8_.aFloat4776;
		    }
		}
		if (class422_17_.aFloat4777 > class422_19_.aFloat4777) {
		    if (class422_13_.aFloat4777 < 0.0F) {
			class422_18_.aFloat4777 += f * class422_7_.aFloat4777;
			if (class422_18_.aFloat4777 > 0.0F)
			    class422_18_.aFloat4777 = 0.0F;
		    } else {
			class422_18_.aFloat4777 -= f * class422_7_.aFloat4777;
			if (class422_18_.aFloat4777 < 0.0F)
			    class422_18_.aFloat4777 = 0.0F;
		    }
		} else if (class422_15_.aFloat4777 < class422_8_.aFloat4777) {
		    if (class422_13_.aFloat4777 < 0.0F) {
			class422_18_.aFloat4777 -= class422_7_.aFloat4777 * f;
			if (class422_18_.aFloat4777 < -class422_8_.aFloat4777)
			    class422_18_.aFloat4777 = -class422_8_.aFloat4777;
		    } else {
			class422_18_.aFloat4777 += f * class422_7_.aFloat4777;
			if (class422_18_.aFloat4777 > class422_8_.aFloat4777)
			    class422_18_.aFloat4777 = class422_8_.aFloat4777;
		    }
		}
		class422_6_.method5093(class422_18_, 0.8F);
		if (f_14_ < f_12_ && class422_6_.method5069() < f_12_) {
		    class422.method5058(class422_5_);
		    class422_6_.method5059();
		} else
		    class422.method5063(Class422.method5084(class422_6_, f));
		class422_15_.method5054();
		class422_18_.method5054();
		class422_19_.method5054();
	    }
	}
    }
    
    static final void method6357(Class648 class648, byte i) {
	int i_20_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anInt8410 -= -1094513834;
	String string
	    = (String) (((Class648) class648).anObjectArray8396
			[((Class648) class648).anInt8410 * -520794877]);
	String string_21_
	    = (String) (((Class648) class648).anObjectArray8396
			[-520794877 * ((Class648) class648).anInt8410 + 1]);
	if (string.length() <= 500 && string_21_.length() <= 500)
	    Class249.method3420(i_20_, string, string_21_, -660374885);
    }
}
