/* Class513 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class513
{
    Class513() throws Throwable {
	throw new Error();
    }
    
    static int method6270(int i) {
	if (i == 9 || 10 == i)
	    return 1;
	if (i == 11)
	    return 8;
	return i;
    }
    
    static final void method6271(Class648 class648, byte i) {
	if (Class700.aBool8733 && Class207.aFrame2236 != null)
	    Class289.method3875(Class514.aClass528_Sub38_6967
				    .aClass691_Sub3_10593
				    .method9844((byte) 32),
				-1, -1, false, 2130003981);
    }
    
    static final void method6272(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int i_0_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929 + 1]);
	if (!Class649.method7733(string.charAt(0), (byte) 107))
	    throw new RuntimeException();
	if (string.isEmpty() || string.length() > 10)
	    throw new RuntimeException();
	if (!Class96.aClass259_1226.method3573(string, i_0_, i_1_, 1977609681))
	    throw new RuntimeException();
    }
    
    static final void method6273(Class229 class229, Class226 class226,
				 Class648 class648, short i) {
	class229.anInt2407
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * 1670343475);
	Class39.method811(class229, 1435904523);
    }
    
    static void method6274(Class173 class173, int i, int i_2_, int i_3_,
			   int i_4_, int i_5_) {
	class173.method2204(i, i_2_, i_3_ + i, i_4_ + i_2_);
	if (Class518_Sub1.anInt10685 * -962898353 < 100) {
	    int i_6_ = 20;
	    int i_7_ = i + i_3_ / 2;
	    int i_8_ = i_4_ / 2 + i_2_ - 18 - i_6_;
	    class173.method2216(i, i_2_, i_3_, i_4_, -16777216, 0);
	    class173.method2215(i_7_ - 152, i_8_, 304, 34,
				client.aColorArray10909
				    [1181441341 * client.anInt10863].getRGB(),
				0);
	    class173.method2216(i_7_ - 150, 2 + i_8_,
				Class518_Sub1.anInt10685 * 1406272237, 30,
				client.aColorArray10919
				    [1181441341 * client.anInt10863].getRGB(),
				0);
	    Class176.aClass172_2027.method2130
		(Class39.aClass39_462.method807(Class378_Sub2.aClass668_10123,
						(byte) 102),
		 i_7_, i_6_ + i_8_,
		 client.aColorArray10910[client.anInt10863 * 1181441341]
		     .getRGB(),
		 -1, (byte) 0);
	} else {
	    int i_9_ = (Class200_Sub1.anInt9820 * -1004126987
			- (int) ((float) i_3_ / Class518_Sub1.aFloat7023));
	    int i_10_ = (-1160116407 * Class98.anInt1256
			 + (int) ((float) i_4_ / Class518_Sub1.aFloat7023));
	    int i_11_ = ((int) ((float) i_3_ / Class518_Sub1.aFloat7023)
			 + Class200_Sub1.anInt9820 * -1004126987);
	    int i_12_ = (-1160116407 * Class98.anInt1256
			 - (int) ((float) i_4_ / Class518_Sub1.aFloat7023));
	    Class224.anInt2331
		= ((-1004126987 * Class200_Sub1.anInt9820
		    - (int) ((float) i_3_ / Class518_Sub1.aFloat7023))
		   * 277875547);
	    Class687.anInt8654
		= ((Class98.anInt1256 * -1160116407
		    - (int) ((float) i_4_ / Class518_Sub1.aFloat7023))
		   * 1803261857);
	    Class300_Sub1.anInt9902
		= 669877649 * (int) ((float) (2 * i_3_)
				     / Class518_Sub1.aFloat7023);
	    Class686.anInt8615
		= ((int) ((float) (2 * i_4_) / Class518_Sub1.aFloat7023)
		   * 726118653);
	    Class518_Sub1.aClass186_6994 = Class518_Sub1.aClass186_7018;
	    Class518_Sub1.method6324(i_9_ + Class518_Sub1.anInt6972,
				     i_10_ + Class518_Sub1.anInt6995,
				     i_11_ + Class518_Sub1.anInt6972,
				     Class518_Sub1.anInt6995 + i_12_, i, i_2_,
				     i + i_3_, i_2_ + i_4_ + 1);
	    Class518_Sub1.method6289(class173, !Class518_Sub1.aBool10707,
				     !Class518_Sub1.aBool10705,
				     client.aBool10966, false);
	    Class688 class688 = Class518_Sub1.method6302(class173);
	    Class316_Sub3.method9124(class173, class688, 0, 0, 1743064914);
	    if (client.aBool10887) {
		int i_13_ = i_3_ + i - 5;
		int i_14_ = i_2_ + i_4_ - 8;
		Class191.aClass172_2171.method2119
		    (new StringBuilder().append("Fps: ").append
			 (Class509.anInt6953 * 296883021).append
			 (" (").append
			 (1886312603 * Class509.anInt6924).append
			 (" ms)").toString(),
		     i_13_, i_14_, 16776960, -1, (byte) -26);
		i_14_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_15_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_16_ = 16776960;
		if (i_15_ > 65536)
		    i_16_ = 16711680;
		Class191.aClass172_2171.method2119(new StringBuilder().append
						       ("Mem:").append
						       (i_15_).append
						       ("k").toString(),
						   i_13_, i_14_, i_16_, -1,
						   (byte) -25);
		i_14_ -= 15;
	    }
	    Class518_Sub1.aClass186_7018.method2747(5, 346923537);
	}
    }
}
