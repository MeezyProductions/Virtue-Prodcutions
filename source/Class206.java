/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class206 implements Interface25
{
    int anInt2230;
    Class207 this$0;
    public static Class528_Sub36 aClass528_Sub36_2231;
    
    public void method139(Class216 class216) {
	class216.method3017(((Class206) this).anInt2230 * -834625695,
			    2003079762);
	class216.method3028(((Class206) this).anInt2230 * -834625695,
			    -409616959);
    }
    
    public void method140(Class216 class216, int i) {
	class216.method3017(((Class206) this).anInt2230 * -834625695,
			    1958649720);
	class216.method3028(((Class206) this).anInt2230 * -834625695,
			    -483381968);
    }
    
    public void method141(Class216 class216) {
	class216.method3017(((Class206) this).anInt2230 * -834625695,
			    1764818702);
	class216.method3028(((Class206) this).anInt2230 * -834625695,
			    -1463818340);
    }
    
    Class206(Class207 class207, ByteBuffer class528_sub42) {
	((Class206) this).this$0 = class207;
	((Class206) this).anInt2230
	    = class528_sub42.readUnsignedShort(-1241727534) * 449201313;
    }
    
    public void method138(Class216 class216) {
	class216.method3017(((Class206) this).anInt2230 * -834625695,
			    2068399522);
	class216.method3028(((Class206) this).anInt2230 * -834625695,
			    -1380233088);
    }
    
    static boolean method2920(int i, int i_0_) {
	return 57 == i || 58 == i || i == 1007 || 25 == i || i == 30;
    }
    
    static void method2921(int i) {
	synchronized (Class326.aclient3497) {
	    if (null != Class207.aFrame2236) {
		/* empty */
	    } else {
		Container container = Class465.method5625(312287159);
		if (null == container) {
		    /* empty */
		} else {
		    client.anInt6929 = container.getSize().width * 758082103;
		    Class106.anInt1314
			= container.getSize().height * -1402965723;
		    if (container == Class196.aFrame2197) {
			Insets insets = Class196.aFrame2197.getInsets();
			client.anInt6929
			    -= (insets.right + insets.left) * 758082103;
			Class106.anInt1314
			    -= -1402965723 * (insets.top + insets.bottom);
		    }
		    if (client.anInt6929 * 624323463 <= 0)
			client.anInt6929 = 758082103;
		    if (Class106.anInt1314 * 1116226221 <= 0)
			Class106.anInt1314 = -1402965723;
		    if (Class377.method4705(406371429) != 1)
			Class181_Sub22.method8996((byte) 65);
		    else {
			Class411.anInt4713 = 1227861909 * client.anInt11124;
			client.anInt6931 = ((client.anInt6929 * 624323463
					     - client.anInt11124 * 473615593)
					    / 2 * -79148317);
			client.anInt6933 = -1420585039 * client.anInt11022;
			client.anInt6943 = 0;
		    }
		    if (ModeWhere.LIVE != Class646.aClass665_8386
			&& Class411.anInt4713 * -1117838587 < 1024
			&& client.anInt6933 * -2142152407 >= 768) {
			/* empty */
		    }
		    Class64.aCanvas754.setSize((Class411.anInt4713
						* -1117838587),
					       client.anInt6933 * -2142152407);
		    if (Class587.aClass173_7714 != null) {
			Class587.aClass173_7714.method2178
			    (Class64.aCanvas754,
			     -1117838587 * Class411.anInt4713,
			     client.anInt6933 * -2142152407, (byte) 64);
			Class565.method6832(Class587.aClass173_7714,
					    Class249.method3417(1933260050));
		    }
		    if (container == Class196.aFrame2197) {
			Insets insets = Class196.aFrame2197.getInsets();
			Class64.aCanvas754.setLocation
			    (insets.left + client.anInt6931 * 1401768651,
			     -952966111 * client.anInt6943 + insets.top);
		    } else
			Class64.aCanvas754.setLocation((1401768651
							* client.anInt6931),
						       (client.anInt6943
							* -952966111));
		    Class5_Sub19.method10187(90475165);
		    if (client.anInt10978 * 2088127151 != -1)
			Class285.method3853(true, 1831733819);
		    Class162.method2068((byte) 2);
		}
	    }
	}
    }
    
    static int[] method2922(Class528_Sub34 class528_sub34, int i) {
	ByteBuffer class528_sub42 = new ByteBuffer(518);
	int[] is = new int[4];
	for (int i_1_ = 0; i_1_ < 4; i_1_++)
	    is[i_1_] = (int) (Math.random() * 9.9999999E7);
	class528_sub42.writeByte(10, (byte) -21);
	class528_sub42.writeInt(is[0], 2106906917);
	class528_sub42.writeInt(is[1], 2144940437);
	class528_sub42.writeInt(is[2], 2020512567);
	class528_sub42.writeInt(is[3], 2116974889);
	for (int i_2_ = 0; i_2_ < 10; i_2_++)
	    class528_sub42.writeInt((int) (Math.random() * 9.9999999E7),
				      2007627962);
	class528_sub42.method9717((int) (Math.random() * 9.9999999E7),
				  (byte) -58);
	class528_sub42.method9650(RSAKeys.LOGIN_EXPONENT,
				  RSAKeys.LOGIN_MODULUS, 728270902);
	class528_sub34.aClass528_Sub42_Sub2_10481.method9618
	    (class528_sub42.payload, 0,
	     -185904669 * class528_sub42.pointer, 45305880);
	return is;
    }
    
    static final void method2923(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub25_10592
		  .method10028((byte) -28);
    }
    
    static final void method2924(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_3_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_4_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_3_ > i_4_ ? i_3_ : i_4_;
    }
}
