/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class180 implements Definition, Interface1
{
    public boolean[] aBoolArray2089;
    static int[] anIntArray2090;
    public static Class51 aClass51_2091;
    
    Class180() {
	/* empty */
    }
    
    public void method58(ByteBuffer class528_sub42, byte i) {
	for (;;) {
	    int i_0_ = class528_sub42.readUnsignedByte((byte) 54);
	    if (i_0_ == 0)
		break;
	    method2669(class528_sub42, i_0_, -1657181925);
	}
    }
    
    void method2669(ByteBuffer class528_sub42, int i, int i_1_) {
	if (2 == i) {
	    aBoolArray2089 = new boolean[400];
	    int i_2_ = class528_sub42.method9719(65280);
	    for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
		aBoolArray2089[class528_sub42.method9719(65280)] = true;
	} else if (i == 3) {
	    class528_sub42.readUnsignedByte((byte) 12);
	    int i_4_ = class528_sub42.method9719(65280);
	    for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
		class528_sub42.method9719(65280);
		class528_sub42.readUnsignedByte((byte) 93);
	    }
	}
    }
    
    public void method61(int i) {
	/* empty */
    }
    
    public void method8(int i) {
	/* empty */
    }
    
    public void method57(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 35);
	    if (i == 0)
		break;
	    method2669(class528_sub42, i, -471882962);
	}
    }
    
    public void method60(ByteBuffer class528_sub42) {
	for (;;) {
	    int i = class528_sub42.readUnsignedByte((byte) 103);
	    if (i == 0)
		break;
	    method2669(class528_sub42, i, 864994874);
	}
    }
    
    void method2670(ByteBuffer class528_sub42, int i) {
	if (2 == i) {
	    aBoolArray2089 = new boolean[400];
	    int i_6_ = class528_sub42.method9719(65280);
	    for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
		aBoolArray2089[class528_sub42.method9719(65280)] = true;
	} else if (i == 3) {
	    class528_sub42.readUnsignedByte((byte) 5);
	    int i_8_ = class528_sub42.method9719(65280);
	    for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
		class528_sub42.method9719(65280);
		class528_sub42.readUnsignedByte((byte) 21);
	    }
	}
    }
    
    public void method59() {
	/* empty */
    }
    
    public void method9(int i, byte i_10_) {
	/* empty */
    }
    
    public static void method2671(Class173 class173, Class446 class446,
				  int i) {
	Class178[] class178s
	    = Class175.method2564(class446,
				  WeakReference_Sub1.anInt11751 * 1914657195,
				  0);
	Class215.aClass151Array2271 = new Class151[class178s.length];
	for (int i_11_ = 0; i_11_ < class178s.length; i_11_++)
	    Class215.aClass151Array2271[i_11_]
		= class173.method2334(class178s[i_11_], true);
	class178s = Class175.method2564(class446,
					1660243107 * Class276.anInt3041, 0);
	Class528_Sub3.aClass151Array10218 = new Class151[class178s.length];
	for (int i_12_ = 0; i_12_ < class178s.length; i_12_++)
	    Class528_Sub3.aClass151Array10218[i_12_]
		= class173.method2334(class178s[i_12_], true);
	class178s
	    = Class175.method2564(class446, 2023646403 * Class27.anInt252, 0);
	Class73.aClass151Array783 = new Class151[class178s.length];
	int i_13_ = 25;
	for (int i_14_ = 0; i_14_ < class178s.length; i_14_++) {
	    class178s[i_14_].method2616
		(-i_13_ + (int) (Math.random() * (double) i_13_ * 2.0),
		 -i_13_ + (int) (Math.random() * (double) i_13_ * 2.0),
		 -i_13_ + (int) (Math.random() * (double) i_13_ * 2.0));
	    Class73.aClass151Array783[i_14_]
		= class173.method2334(class178s[i_14_], true);
	}
	class178s
	    = Class175.method2564(class446,
				  Class511_Sub3.anInt10266 * -1652945949, 0);
	Class691_Sub16.aClass151Array10741 = new Class151[class178s.length];
	for (int i_15_ = 0; i_15_ < class178s.length; i_15_++)
	    Class691_Sub16.aClass151Array10741[i_15_]
		= class173.method2334(class178s[i_15_], true);
	class178s
	    = Class175.method2564(class446, Class27.anInt251 * 1238405315, 0);
	Class482.aClass151Array5471 = new Class151[class178s.length];
	i_13_ = 12;
	for (int i_16_ = 0; i_16_ < class178s.length; i_16_++) {
	    class178s[i_16_].method2616
		(-i_13_ + (int) (Math.random() * (double) i_13_ * 2.0),
		 -i_13_ + (int) (Math.random() * (double) i_13_ * 2.0),
		 -i_13_ + (int) (Math.random() * (double) i_13_ * 2.0));
	    Class482.aClass151Array5471[i_16_]
		= class173.method2334(class178s[i_16_], true);
	}
	class178s
	    = Class175.method2564(class446,
				  Class56_Sub1.anInt10850 * -439389565, 0);
	Class298.aClass151Array3262 = new Class151[class178s.length];
	i_13_ = 12;
	for (int i_17_ = 0; i_17_ < class178s.length; i_17_++) {
	    class178s[i_17_].method2616
		(-i_13_ + (int) (Math.random() * (double) i_13_ * 2.0),
		 -i_13_ + (int) (Math.random() * (double) i_13_ * 2.0),
		 -i_13_ + (int) (Math.random() * (double) i_13_ * 2.0));
	    Class298.aClass151Array3262[i_17_]
		= class173.method2334(class178s[i_17_], true);
	}
	Class82.aClass151_817
	    = class173.method2334(Class175.method2561(class446,
						      (Class168.anInt1931
						       * -867964139),
						      0),
				  true);
	Class27.aClass151_256
	    = class173.method2334(Class175.method2561(class446,
						      (Class667.anInt8489
						       * -697422457),
						      0),
				  true);
	class178s
	    = Class175.method2564(class446, 1859390257 * Class27.anInt254, 0);
	Class183.aClass151Array2101 = new Class151[class178s.length];
	for (int i_18_ = 0; i_18_ < class178s.length; i_18_++)
	    Class183.aClass151Array2101[i_18_]
		= class173.method2334(class178s[i_18_], true);
    }
    
    static void method2672(int i) {
	Class28.aClass528_Sub21_Sub11_259
	    = (new Class528_Sub21_Sub11
	       (Class39.aClass39_453.method807(Class378_Sub2.aClass668_10123,
					       (byte) 102),
		"", client.anInt11048 * -1902678583, 1006, -1, 0L, 0, 0, true,
		false, 0L, true));
    }
    
    static final void method2673(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_19_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_20_ = (((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395]);
	int i_21_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 2]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = ((Class648) class648).aClass308_8391
		  .method4093(i_19_, i_20_, i_21_, (byte) -81);
    }
}
