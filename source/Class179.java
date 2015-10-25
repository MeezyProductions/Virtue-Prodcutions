/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.Map;

public class Class179
{
    int[] anIntArray2081;
    int[] anIntArray2082;
    int[] anIntArray2083;
    int[] anIntArray2084;
    int[] anIntArray2085;
    int[] anIntArray2086;
    int[] anIntArray2087;
    public static Map aMap2088;
    
    Class179(ByteBuffer class528_sub42) {
	int i = class528_sub42.method9719(65280);
	((Class179) this).anIntArray2087 = new int[i];
	((Class179) this).anIntArray2082 = new int[i];
	((Class179) this).anIntArray2083 = new int[i];
	((Class179) this).anIntArray2081 = new int[i];
	((Class179) this).anIntArray2085 = new int[i];
	((Class179) this).anIntArray2086 = new int[i];
	((Class179) this).anIntArray2084 = new int[i];
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    ((Class179) this).anIntArray2087[i_0_]
		= class528_sub42.readUnsignedShort(-657282130) - 5120;
	    ((Class179) this).anIntArray2083[i_0_]
		= class528_sub42.readUnsignedShort(206531306) - 5120;
	    ((Class179) this).anIntArray2082[i_0_]
		= class528_sub42.method9642(2081345145);
	    ((Class179) this).anIntArray2085[i_0_]
		= class528_sub42.readUnsignedShort(-1168875268) - 5120;
	    ((Class179) this).anIntArray2084[i_0_]
		= class528_sub42.readUnsignedShort(-1014366510) - 5120;
	    ((Class179) this).anIntArray2086[i_0_]
		= class528_sub42.method9642(1639637349);
	    ((Class179) this).anIntArray2081[i_0_]
		= class528_sub42.method9642(1909852479);
	}
    }
    
    void method2661(int i) {
	int[][] is = new int[((Class179) this).anIntArray2087.length << 1][4];
	for (int i_1_ = 0; i_1_ < ((Class179) this).anIntArray2087.length;
	     i_1_++) {
	    is[i_1_ * 2][0] = ((Class179) this).anIntArray2087[i_1_];
	    is[2 * i_1_][1] = ((Class179) this).anIntArray2082[i_1_];
	    is[i_1_ * 2][2] = ((Class179) this).anIntArray2083[i_1_];
	    is[2 * i_1_][3] = ((Class179) this).anIntArray2081[i_1_];
	    is[1 + 2 * i_1_][0] = ((Class179) this).anIntArray2085[i_1_];
	    is[1 + i_1_ * 2][1] = ((Class179) this).anIntArray2086[i_1_];
	    is[2 * i_1_ + 1][2] = ((Class179) this).anIntArray2084[i_1_];
	    is[i_1_ * 2 + 1][3] = ((Class179) this).anIntArray2081[i_1_];
	}
	client.anIntArrayArrayArray10986[i] = is;
    }
    
    void method2662(int i, byte i_2_) {
	int[][] is = new int[((Class179) this).anIntArray2087.length << 1][4];
	for (int i_3_ = 0; i_3_ < ((Class179) this).anIntArray2087.length;
	     i_3_++) {
	    is[i_3_ * 2][0] = ((Class179) this).anIntArray2087[i_3_];
	    is[2 * i_3_][1] = ((Class179) this).anIntArray2082[i_3_];
	    is[i_3_ * 2][2] = ((Class179) this).anIntArray2083[i_3_];
	    is[2 * i_3_][3] = ((Class179) this).anIntArray2081[i_3_];
	    is[1 + 2 * i_3_][0] = ((Class179) this).anIntArray2085[i_3_];
	    is[1 + i_3_ * 2][1] = ((Class179) this).anIntArray2086[i_3_];
	    is[2 * i_3_ + 1][2] = ((Class179) this).anIntArray2084[i_3_];
	    is[i_3_ * 2 + 1][3] = ((Class179) this).anIntArray2081[i_3_];
	}
	client.anIntArrayArrayArray10986[i] = is;
    }
    
    void method2663(int i) {
	int[][] is = new int[((Class179) this).anIntArray2087.length << 1][4];
	for (int i_4_ = 0; i_4_ < ((Class179) this).anIntArray2087.length;
	     i_4_++) {
	    is[i_4_ * 2][0] = ((Class179) this).anIntArray2087[i_4_];
	    is[2 * i_4_][1] = ((Class179) this).anIntArray2082[i_4_];
	    is[i_4_ * 2][2] = ((Class179) this).anIntArray2083[i_4_];
	    is[2 * i_4_][3] = ((Class179) this).anIntArray2081[i_4_];
	    is[1 + 2 * i_4_][0] = ((Class179) this).anIntArray2085[i_4_];
	    is[1 + i_4_ * 2][1] = ((Class179) this).anIntArray2086[i_4_];
	    is[2 * i_4_ + 1][2] = ((Class179) this).anIntArray2084[i_4_];
	    is[i_4_ * 2 + 1][3] = ((Class179) this).anIntArray2081[i_4_];
	}
	client.anIntArrayArrayArray10986[i] = is;
    }
    
    static final void method2664(Class648 class648, int i) {
	boolean bool = false;
	if (client.aBool10853) {
	    try {
		Object object
		    = (Class398.aClass398_4410.method4823
		       ((new Object[]
			 { Integer.valueOf(-146114513 * Class474.anInt5428),
			   Boolean.valueOf((Class108
					    .myPlayer
					    .gender) == 1),
			   Integer.valueOf(((Class648) class648).anIntArray8394
					   [(((Class648) class648).anInt8395
					     -= 1239022665) * 717927929]) }),
			902931975));
		if (null != object)
		    bool = ((Boolean) object).booleanValue();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = bool ? 1 : 0;
    }
    
    static final void method2665(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_5_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_6_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	Class204.method2910(10, i_5_, i_6_, "", -2133134664);
    }
    
    static final void method2666(int i, int i_7_, int i_8_, int i_9_,
				 int i_10_, int i_11_, byte i_12_) {
	Class96[] class96s = client.aClass96Array11016;
	for (int i_13_ = 0; i_13_ < class96s.length; i_13_++) {
	    Class96 class96 = class96s[i_13_];
	    if (class96 != null && 2 == class96.anInt1224 * -411936407) {
		Class448.method5410(((Class96) class96).anInt1217 * -912481805,
				    -1857643871 * class96.anInt1218,
				    1777883189 * class96.anInt1219, 0,
				    ((Class96) class96).anInt1220 * -716190262,
				    false, false, -431419824);
		if (client.aFloatArray10888[0] > -1.0F
		    && client.anInt11127 % 20 < 10) {
		    Class151 class151
			= (Class215.aClass151Array2271
			   [1574185279 * ((Class96) class96).anInt1225]);
		    int i_14_ = (int) (client.aFloatArray10888[0] + (float) i
				       - 12.0F);
		    int i_15_ = (int) (client.aFloatArray10888[1]
				       + (float) i_7_ - 28.0F);
		    class151.method1773(i_14_, i_15_);
		}
	    }
	}
    }
    
    static Class163_Sub2_Sub3 method2667(Class173_Sub3 class173_sub3,
					 Canvas canvas, int i, int i_16_,
					 int i_17_) {
	Class163_Sub2_Sub3_Sub1 class163_sub2_sub3_sub1
	    = new Class163_Sub2_Sub3_Sub1(class173_sub3, canvas, i, i_16_);
	return class163_sub2_sub3_sub1;
    }
    
    static final void method2668(Class648 class648, byte i)
	throws Exception_Sub4 {
	((Class648) class648).anInt8395 -= 661123364;
	int i_18_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_19_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 1]);
	int i_20_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395 + 2]);
	int i_21_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 3]);
	Class422 class422
	    = Class422.method5051((float) i_18_, (float) i_19_, (float) i_20_);
	if (-1.0F == class422.aFloat4780)
	    class422.aFloat4780 = Float.POSITIVE_INFINITY;
	if (-1.0F == class422.aFloat4776)
	    class422.aFloat4776 = Float.POSITIVE_INFINITY;
	if (class422.aFloat4777 == -1.0F)
	    class422.aFloat4777 = Float.POSITIVE_INFINITY;
	Class495.aClass283_Sub1_5578.method3767(class422, 13336084);
	Class495.aClass283_Sub1_5578.method3765((float) i_21_ / 1000.0F,
						(byte) 56);
	class422.method5054();
    }
}
