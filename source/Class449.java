/* Class449 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class449
{
    static final int anInt4957 = 10000;
    int anInt4958;
    static final int anInt4959 = 60000;
    static final int anInt4960 = 10;
    volatile int anInt4961 = 0;
    static final int anInt4962 = 2;
    ExecutorService anExecutorService4963 = Executors.newFixedThreadPool(2);
    long aLong4964;
    String aString4965;
    int anInt4966;
    static final int anInt4967 = 10000;
    boolean aBool4968 = false;
    
    void method5411(boolean bool) {
	((Class449) this).aBool4968 = bool;
    }
    
    boolean method5412(byte i) {
	return 729872277 * ((Class449) this).anInt4961 >= 10;
    }
    
    void method5413(boolean bool, int i) {
	((Class449) this).aBool4968 = bool;
    }
    
    void method5414(int i) {
	((Class449) this).anInt4961 -= 1541053373;
    }
    
    Class528_Sub21_Sub9_Sub1 method5415(int i, int i_0_, byte i_1_,
					boolean bool, int i_2_, int i_3_,
					short i_4_) {
	if (i < 0 || i_0_ < 0)
	    throw new RuntimeException(new StringBuilder().append(i).append
					   (",").append
					   (i_0_).toString());
	if (method5412((byte) 110))
	    return null;
	boolean bool_5_ = 255 == i && 255 == i_0_;
	if (!((Class449) this).aBool4968 && !bool_5_)
	    return null;
	if (((Class449) this).aLong4964 * -6688653357037124093L + 10000L
	    >= Class249.method3417(2133691992))
	    return null;
	Object object = null;
	String string;
	if (bool_5_)
	    string = new StringBuilder().append("&cb=").append
			 (Class249.method3417(2013992180)).toString();
	else
	    string = new StringBuilder().append("&c=").append(i_2_).append
			 ("&v=").append
			 (i_3_).toString();
	URL url;
	try {
	    url = new URL("http", ((Class449) this).aString4965,
			  ((Class449) this).anInt4958 * 729668151,
			  new StringBuilder().append("/ms?m=").append
			      (((Class449) this).anInt4966 * 1937247691).append
			      ("&a=").append
			      (i).append
			      ("&g=").append
			      (i_0_).append
			      (string).toString());
	} catch (MalformedURLException malformedurlexception) {
	    return null;
	}
	Class528_Sub21_Sub9_Sub1 class528_sub21_sub9_sub1
	    = new Class528_Sub21_Sub9_Sub1(i_1_);
	((Class528_Sub21_Sub9_Sub1) class528_sub21_sub9_sub1).aBool11577
	    = bool;
	((Class449) this).anInt4961 += 1541053373;
	Future future
	    = ((Class449) this).anExecutorService4963
		  .submit(new Class453(this, url, class528_sub21_sub9_sub1));
	class528_sub21_sub9_sub1.method10815(future, (byte) 2);
	return class528_sub21_sub9_sub1;
    }
    
    public void method5416(int i) {
	((Class449) this).anExecutorService4963.shutdown();
    }
    
    boolean method5417() {
	return 729872277 * ((Class449) this).anInt4961 >= 10;
    }
    
    public Class449(String string, int i, int i_6_) {
	((Class449) this).aString4965 = string;
	((Class449) this).anInt4958 = i * 583203719;
	((Class449) this).anInt4966 = i_6_ * -577064989;
    }
    
    Class528_Sub21_Sub9_Sub1 method5418(int i) {
	return method5415(255, 255, (byte) 0, true, 0, 0, (short) 255);
    }
    
    boolean method5419() {
	return 729872277 * ((Class449) this).anInt4961 >= 10;
    }
    
    void method5420() {
	((Class449) this).anInt4961 -= 1541053373;
    }
    
    void method5421() {
	((Class449) this).anInt4961 -= 1541053373;
    }
    
    public void method5422() {
	((Class449) this).anExecutorService4963.shutdown();
    }
    
    public void method5423() {
	((Class449) this).anExecutorService4963.shutdown();
    }
    
    public void method5424() {
	((Class449) this).anExecutorService4963.shutdown();
    }
    
    void method5425(boolean bool) {
	((Class449) this).aBool4968 = bool;
    }
    
    boolean method5426() {
	return 729872277 * ((Class449) this).anInt4961 >= 10;
    }
    
    public static final void method5427(int i, String string, Color color,
					Color color_7_, Color color_8_,
					int i_9_) {
	try {
	    Graphics graphics = Class64.aCanvas754.getGraphics();
	    if (Class5_Sub15.aFont10842 == null)
		Class5_Sub15.aFont10842 = new Font("Helvetica", 1, 13);
	    if (color == null)
		color = new Color(140, 17, 17);
	    if (color_7_ == null)
		color_7_ = new Color(140, 17, 17);
	    if (null == color_8_)
		color_8_ = new Color(255, 255, 255);
	    try {
		if (null == Class193.anImage2172)
		    Class193.anImage2172
			= (Class64.aCanvas754.createImage
			   (-1117838587 * Class411.anInt4713,
			    -2142152407 * Class509.anInt6933));
		Graphics graphics_10_ = Class193.anImage2172.getGraphics();
		graphics_10_.setColor(Color.black);
		graphics_10_.fillRect(0, 0, -1117838587 * Class411.anInt4713,
				      Class509.anInt6933 * -2142152407);
		int i_11_ = -1117838587 * Class411.anInt4713 / 2 - 152;
		int i_12_ = -2142152407 * Class509.anInt6933 / 2 - 18;
		graphics_10_.setColor(color_7_);
		graphics_10_.drawRect(i_11_, i_12_, 303, 33);
		graphics_10_.setColor(color);
		graphics_10_.fillRect(2 + i_11_, i_12_ + 2, i * 3, 30);
		graphics_10_.setColor(Color.black);
		graphics_10_.drawRect(i_11_ + 1, i_12_ + 1, 301, 31);
		graphics_10_.fillRect(3 * i + (2 + i_11_), 2 + i_12_,
				      300 - 3 * i, 30);
		graphics_10_.setFont(Class5_Sub15.aFont10842);
		graphics_10_.setColor(color_8_);
		graphics_10_.drawString(string,
					(i_11_
					 + (304 - string.length() * 6) / 2),
					i_12_ + 22);
		if (null != Class509.aString6922) {
		    graphics_10_.setFont(Class5_Sub15.aFont10842);
		    graphics_10_.setColor(color_8_);
		    graphics_10_.drawString
			(Class509.aString6922,
			 (Class411.anInt4713 * -1117838587 / 2
			  - Class509.aString6922.length() * 6 / 2),
			 -2142152407 * Class509.anInt6933 / 2 - 26);
		}
		graphics.drawImage(Class193.anImage2172, 0, 0, null);
	    } catch (Exception exception) {
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, Class411.anInt4713 * -1117838587,
				  -2142152407 * Class509.anInt6933);
		int i_13_ = Class411.anInt4713 * -1117838587 / 2 - 152;
		int i_14_ = -2142152407 * Class509.anInt6933 / 2 - 18;
		graphics.setColor(color_7_);
		graphics.drawRect(i_13_, i_14_, 303, 33);
		graphics.setColor(color);
		graphics.fillRect(2 + i_13_, i_14_ + 2, i * 3, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(i_13_ + 1, i_14_ + 1, 301, 31);
		graphics.fillRect(i_13_ + 2 + 3 * i, i_14_ + 2, 300 - i * 3,
				  30);
		graphics.setFont(Class5_Sub15.aFont10842);
		graphics.setColor(color_8_);
		if (null != Class509.aString6922) {
		    graphics.setFont(Class5_Sub15.aFont10842);
		    graphics.setColor(color_8_);
		    graphics.drawString(Class509.aString6922,
					(-1117838587 * Class411.anInt4713 / 2
					 - (Class509.aString6922.length() * 6
					    / 2)),
					(-2142152407 * Class509.anInt6933 / 2
					 - 26));
		}
		graphics.drawString(string,
				    i_13_ + (304 - string.length() * 6) / 2,
				    i_14_ + 22);
	    }
	} catch (Exception exception) {
	    Class64.aCanvas754.repaint();
	}
    }
    
    static final void method5428(Class648 class648, int i) {
	int i_15_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_15_, (byte) -102);
	Class226 class226 = Class380.aClass226Array3970[i_15_ >> 16];
	Class602.method7179(class229, class226, class648, -1357253381);
    }
    
    static final void method5429(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_16_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_17_ = (((Class648) class648).anIntArray8394
		     [1 + 717927929 * ((Class648) class648).anInt8395]);
	if (-1 == i_17_)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= Class196.aClass447_2200.method5401(i_16_, -438432000)
		      .method10487((char) i_17_, 1645584252);
    }
}
