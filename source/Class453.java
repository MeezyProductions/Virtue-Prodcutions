/* Class453 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class Class453 implements Callable
{
    URL anURL4975;
    Class528_Sub21_Sub9_Sub1 aClass528_Sub21_Sub9_Sub1_4976;
    Class449 this$0;
    public static int anInt4977;
    
    public Object method5451() throws Exception {
	URLConnection urlconnection
	    = ((Class453) this).anURL4975.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    ((Class449) ((Class453) this).this$0).aLong4964
		= Class249.method3417(1905518552) * 4353927268210136235L;
	    bool = false;
	}
	return new Class452(((Class453) this).this$0,
			    bool ? urlconnection.getInputStream() : null,
			    ((Class453) this).aClass528_Sub21_Sub9_Sub1_4976,
			    ((Class453) this).anURL4975);
    }
    
    Class453(Class449 class449, URL url,
	     Class528_Sub21_Sub9_Sub1 class528_sub21_sub9_sub1) {
	((Class453) this).this$0 = class449;
	((Class453) this).anURL4975 = url;
	((Class453) this).aClass528_Sub21_Sub9_Sub1_4976
	    = class528_sub21_sub9_sub1;
    }
    
    public Object method5452() throws Exception {
	URLConnection urlconnection
	    = ((Class453) this).anURL4975.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    ((Class449) ((Class453) this).this$0).aLong4964
		= Class249.method3417(1912621390) * 4353927268210136235L;
	    bool = false;
	}
	return new Class452(((Class453) this).this$0,
			    bool ? urlconnection.getInputStream() : null,
			    ((Class453) this).aClass528_Sub21_Sub9_Sub1_4976,
			    ((Class453) this).anURL4975);
    }
    
    public Object call() throws Exception {
	URLConnection urlconnection
	    = ((Class453) this).anURL4975.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    ((Class449) ((Class453) this).this$0).aLong4964
		= Class249.method3417(2076245130) * 4353927268210136235L;
	    bool = false;
	}
	return new Class452(((Class453) this).this$0,
			    bool ? urlconnection.getInputStream() : null,
			    ((Class453) this).aClass528_Sub21_Sub9_Sub1_4976,
			    ((Class453) this).anURL4975);
    }
    
    static final void method5453(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (Class518.aClass528_Sub21_Sub17_7017 != null
	       ? 2000200341 * Class518.aClass528_Sub21_Sub17_7017.anInt11644
	       : -1);
    }
    
    static int method5454(char c, Class668 class668, int i) {
	int i_0_ = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i_0_ = (c << 4) + 1;
	}
	if (c == 241 && class668 == Class668.aClass668_8502)
	    i_0_ = 1762;
	return i_0_;
    }
    
    public static Class689[] method5455(int i) {
	return (new Class689[]
		{ Class689.aClass689_8663, Class689.aClass689_8664,
		  Class689.aClass689_8661, Class689.aClass689_8659,
		  Class689.aClass689_8660 });
    }
    
    static final void method5456(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.anInt11127;
    }
    
    static final void method5457(Class648 class648, int i) {
	int i_1_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_1_, (byte) -94);
	Class226 class226 = Class380.aClass226Array3970[i_1_ >> 16];
	Class69.method1082(class229, class226, class648, (short) -14423);
    }
    
    static final void method5458
	(Entity class645_sub1_sub5_sub1,
	 Entity class645_sub1_sub5_sub1_2_, int i, int i_3_,
	 int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, byte i_9_) {
	int i_10_ = class645_sub1_sub5_sub1_2_.method10703(-1796575137);
	if (-1 != i_10_) {
	    Object object = null;
	    Class151 class151
		= (Class151) client.aClass186_10977.method2727((long) i_10_);
	    if (null == class151) {
		Class178[] class178s
		    = Class175.method2564(Class623_Sub1.aClass446_10671, i_10_,
					  0);
		if (class178s == null)
		    return;
		class151
		    = Class587.aClass173_7714.method2334(class178s[0], true);
		client.aClass186_10977.method2729(class151, (long) i_10_);
	    }
	    Class422 class422
		= class645_sub1_sub5_sub1.method7693().aClass422_4868;
	    Class448.method5410(class645_sub1_sub5_sub1.aByte10675,
				(int) class422.aFloat4780,
				(int) class422.aFloat4777,
				class645_sub1_sub5_sub1
				    .method10671((byte) -102) * 256,
				0, false, false, -431419824);
	    int i_11_
		= (int) (client.aFloatArray10888[0] + (float) i_3_ - 18.0F);
	    int i_12_ = (int) (client.aFloatArray10888[1] + (float) i_4_
			       - 16.0F - 54.0F);
	    i_11_ += i / 4 * 18;
	    i_12_ += i % 4 * 18;
	    class151.method1773(i_11_, i_12_);
	    if (class645_sub1_sub5_sub1 == class645_sub1_sub5_sub1_2_)
		Class587.aClass173_7714.method2206(i_11_ - 1, i_12_ - 1, 18,
						   18, -256, -1224077816);
	    Class511_Sub1 class511_sub1 = Class531.method6473(-21661378);
	    ((Class511_Sub1) class511_sub1).aClass645_Sub1_Sub5_Sub1_10204
		= class645_sub1_sub5_sub1_2_;
	    ((Class511_Sub1) class511_sub1).anInt10205 = i_11_ * -1423602119;
	    ((Class511_Sub1) class511_sub1).anInt10202 = 494545939 * i_12_;
	    ((Class511_Sub1) class511_sub1).anInt10207
		= -1059993899 * (i_11_ + 16);
	    ((Class511_Sub1) class511_sub1).anInt10208
		= 1751882473 * (16 + i_12_);
	    client.aClass695_11000.method8175(class511_sub1, (byte) 70);
	}
    }
    
    static final void method5459(Class648 class648, int i) {
	int i_13_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = ((Class210) Class691_Sub32.aClass216_10805.method3039
			      (-1878717624).get(i_13_))
		  .method2947(1021111917);
    }
}
