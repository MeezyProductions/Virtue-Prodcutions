/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

public class Class320 implements Interface31
{
    Class380 aClass380_3465;
    public static Class95_Sub1_Sub1 aClass95_Sub1_Sub1_3466;
    
    public void method188(boolean bool) {
	if (bool)
	    Class587.aClass173_7714.method2216
		(0, 0, Class411.anInt4713 * -1117838587,
		 -2142152407 * Class509.anInt6933,
		 1873721725 * ((Class320) this).aClass380_3465.anInt3968, 0);
    }
    
    public void method193() {
	/* empty */
    }
    
    public void method187(short i) {
	/* empty */
    }
    
    public void method190(boolean bool, byte i) {
	if (bool)
	    Class587.aClass173_7714.method2216
		(0, 0, Class411.anInt4713 * -1117838587,
		 -2142152407 * Class509.anInt6933,
		 1873721725 * ((Class320) this).aClass380_3465.anInt3968, 0);
    }
    
    public boolean method186(int i) {
	return true;
    }
    
    public void method189(boolean bool) {
	if (bool)
	    Class587.aClass173_7714.method2216
		(0, 0, Class411.anInt4713 * -1117838587,
		 -2142152407 * Class509.anInt6933,
		 1873721725 * ((Class320) this).aClass380_3465.anInt3968, 0);
    }
    
    public void method185(boolean bool) {
	if (bool)
	    Class587.aClass173_7714.method2216
		(0, 0, Class411.anInt4713 * -1117838587,
		 -2142152407 * Class509.anInt6933,
		 1873721725 * ((Class320) this).aClass380_3465.anInt3968, 0);
    }
    
    public void method191() {
	/* empty */
    }
    
    public void method192() {
	/* empty */
    }
    
    Class320(Class380 class380) {
	((Class320) this).aClass380_3465 = class380;
    }
    
    public void method116() {
	/* empty */
    }
    
    public void method194() {
	/* empty */
    }
    
    public void method195() {
	/* empty */
    }
    
    public boolean method196() {
	return true;
    }
    
    static String method4201(ByteBuffer class528_sub42, int i, byte i_0_) {
	String string;
	try {
	    int i_1_ = class528_sub42.method9719(65280);
	    if (i_1_ > i)
		i_1_ = i;
	    byte[] is = new byte[i_1_];
	    class528_sub42.pointer
		+= (Class276.aClass254_3040.method3441
		    (class528_sub42.payload,
		     -185904669 * class528_sub42.pointer, is, 0, i_1_,
		     (short) 732)) * 2015001547;
	    String string_2_ = Class593.method7084(is, 0, i_1_, (byte) 82);
	    string = string_2_;
	} catch (Exception exception) {
	    return "Cabbage";
	}
	return string;
    }
    
    static final void method4202(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.aBool2405
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       == 1);
	Class39.method811(class229, 1435904523);
    }
    
    public static int method4203(int i, int i_3_, int i_4_) {
	if (-1 == Class184.aClass622_2103.anInt8101 * -28945389)
	    return 1;
	if (i != Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
		     .method10014(-1824619963)) {
	    HandshakeOpcode.method4869
		(i,
		 Class39.aClass39_440.method807(Class378_Sub2.aClass668_10123,
						(byte) 102),
		 true, -46045190);
	    if (Class514.aClass528_Sub38_6967.aClass691_Sub24_10594
		    .method10014(-1824619963)
		!= i)
		return -1;
	}
	int i_5_;
	try {
	    Dimension dimension = Class64.aCanvas754.getSize();
	    Class691_Sub18.method9964
		(Class39.aClass39_440.method807(Class378_Sub2.aClass668_10123,
						(byte) 102),
		 true, Class587.aClass173_7714, Class191.aClass172_2171,
		 Class27.aClass1_253, 521725105);
	    Class177 class177
		= Class177.method2590(Class287.aClass446_3161,
				      (Class184.aClass622_2103.anInt8101
				       * -28945389),
				      0);
	    long l = Class249.method3417(2114990352);
	    Class587.aClass173_7714.method2203();
	    client.aClass433_11080.method5248(0.0F, 256.0F, 0.0F);
	    Class587.aClass173_7714.method2465(client.aClass433_11080);
	    Class418 class418 = Class587.aClass173_7714.method2241();
	    class418.method4984((float) (dimension.width / 2),
				(float) (dimension.height / 2), 512.0F, 512.0F,
				(float) client.aClass495_10935
					    .method6020(1880394154),
				(float) client.aClass495_10935
					    .method5972(876236010),
				(float) dimension.width,
				(float) dimension.height);
	    Class587.aClass173_7714.method2252(class418);
	    Class587.aClass173_7714.method2477(1.0F);
	    Class587.aClass173_7714.method2160(16777215, 0.5F, 0.5F, 20.0F,
					       -50.0F, 30.0F);
	    Class157 class157
		= Class587.aClass173_7714.method2244(class177, 2048, 64, 64,
						     768);
	    int i_6_ = 0;
	while_4_:
	    for (int i_7_ = 0; i_7_ < 500; i_7_++) {
		Class587.aClass173_7714.method2268(3, 0);
		for (int i_8_ = 15; i_8_ >= 0; i_8_--) {
		    for (int i_9_ = 0; i_9_ <= i_8_; i_9_++) {
			client.aClass433_10879.method5248
			    ((float) (int) (((float) i_9_
					     - (float) i_8_ / 2.0F)
					    * 512.0F),
			     0.0F, (float) ((i_8_ + 1) * 512));
			class157.method1897(client.aClass433_10879, null, 0);
			i_6_++;
			if (Class249.method3417(2010684150) - l >= (long) i_3_)
			    break while_4_;
		    }
		}
	    }
	    Class587.aClass173_7714.method2155();
	    long l_10_
		= (long) (i_6_ * 1000) / (Class249.method3417(2109827238) - l);
	    Class587.aClass173_7714.method2268(3, 0);
	    i_5_ = (int) l_10_;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return -1;
	}
	return i_5_;
    }
}
