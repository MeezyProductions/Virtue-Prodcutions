/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

import jaclib.nanotime.QueryPerformanceCounter;

public abstract class Class509
    implements Interface58, Runnable, FocusListener, WindowListener
{
    public static Class501 aClass501_6921;
    protected static String aString6922;
    protected static volatile boolean aBool6923;
    public static int anInt6924;
    static final int anInt6925 = 32;
    static Class502 aClass502_6926;
    static long[] aLongArray6927;
    static final String aString6928 = "main_file_cache.dat2";
    protected static int anInt6929;
    static long[] aLongArray6930;
    public static int anInt6931;
    static final int anInt6932 = 0;
    public static int anInt6933;
    protected static volatile boolean aBool6934;
    static int anInt6935;
    boolean aBool6936;
    static volatile long aLong6937;
    static long aLong6938 = 1971526020167935232L;
    static volatile boolean aBool6939;
    static final long aLong6940 = 3221225472L;
    static final int anInt6941 = 1048576;
    static final String aString6942 = "rw";
    public static int anInt6943;
    static final String aString6944 = "main_file_cache.idx";
    static final String aString6945 = "main_file_cache.idx255";
    static final String aString6946 = "random.dat";
    static Class22 aClass22_6947;
    protected static Class22 aClass22_6948;
    static int anInt6949;
    static String[] aStringArray6950;
    static final int anInt6951 = 1;
    protected static boolean aBool6952;
    public static int anInt6953 = 0;
    static long aLong6954;
    static boolean aBool6955;
    boolean aBool6956 = false;
    public static int anInt6957;
    public static int anInt6958;
    protected static Class22 aClass22_6959;
    
    void method6173(String string, int i) {
	if (!this.aBool6956) {
	    this.aBool6956 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class70.method1086(Class196.anApplet2198, "loggedout",
				   (byte) 35);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class196.anApplet2198.getAppletContext().showDocument
		    (new URL(Class196.anApplet2198.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws").toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    @Override
	public void supplyApplet(Applet applet) {
	Class196.anApplet2198 = applet;
    }
    
    void method6174() {
	long l = Class249.method3417(2043998639);
	long l_0_ = aLongArray6930[Class212.anInt2248 * -814286055];
	aLongArray6930[Class212.anInt2248 * -814286055] = l;
	Class212.anInt2248
	    = 1026699561 * (Class212.anInt2248 * -814286055 + 1 & 0x1f);
	if (l_0_ != 0L && l <= l_0_) {
	    /* empty */
	}
	synchronized (this) {
	    Class395.aBool4154 = aBool6939;
	}
	method6191(-1666838449);
    }
    
    public final void method6175(FocusEvent focusevent) {
	aBool6939 = false;
    }
    
    File method6176(String string, String string_1_, int i, int i_2_) {
	String string_3_
	    = (0 == i ? ""
	       : new StringBuilder().append("").append(i).toString());
	Class322.aFile3482
	    = new File(Class700.aString8735,
		       new StringBuilder().append("jagex_cl_").append
			   (string).append
			   ("_").append
			   (string_1_).append
			   (string_3_).append
			   (".dat").toString());
	String string_4_ = null;
	String string_5_ = null;
	boolean bool = false;
	if (Class322.aFile3482.exists()) {
	    try {
		Class23 class23
		    = new Class23(Class322.aFile3482, "rw", 10000L);
		int i_6_;
		ByteBuffer class528_sub42;
		for (class528_sub42 = (new ByteBuffer
				       ((int) class23.method680(-1989708934)));
		     (class528_sub42.pointer * -185904669
		      < class528_sub42.payload.length);
		     class528_sub42.pointer += 2015001547 * i_6_) {
		    i_6_ = class23.method692(class528_sub42.payload,
					     (-185904669
					      * class528_sub42.pointer),
					     ((class528_sub42
					       .payload).length
					      - (class528_sub42.pointer
						 * -185904669)),
					     2016708410);
		    if (i_6_ == -1)
			throw new IOException();
		}
		class528_sub42.pointer = 0;
		i_6_ = class528_sub42.readUnsignedByte((byte) 7);
		if (i_6_ < 1 || i_6_ > 3)
		    throw new IOException(new StringBuilder().append("").append
					      (i_6_).toString());
		int i_7_ = 0;
		if (i_6_ > 1)
		    i_7_ = class528_sub42.readUnsignedByte((byte) 81);
		if (i_6_ <= 2) {
		    string_4_ = class528_sub42.method9637((byte) 9);
		    if (1 == i_7_)
			string_5_ = class528_sub42.method9637((byte) -4);
		} else {
		    string_4_ = class528_sub42.method9638(-1696689249);
		    if (1 == i_7_)
			string_5_ = class528_sub42.method9638(-2046964693);
		}
		class23.method683((byte) 66);
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	    if (string_4_ != null) {
		File file = new File(string_4_);
		if (!file.exists())
		    string_4_ = null;
	    }
	    if (string_4_ != null) {
		File file = new File(string_4_, "test.dat");
		if (!method6218(file, true, 1298590966))
		    string_4_ = null;
	    }
	}
	if (string_4_ == null && i == 0) {
	while_15_:
	    for (int i_8_ = 0; i_8_ < aStringArray6950.length; i_8_++) {
		for (int i_9_ = 0; i_9_ < Class249.aStringArray2781.length;
		     i_9_++) {
		    File file
			= new File(new StringBuilder().append
				       (Class249.aStringArray2781[i_9_]).append
				       (aStringArray6950[i_8_]).append
				       (File.separatorChar).append
				       (string).append
				       (File.separatorChar).toString());
		    if (file.exists() && method6218(new File(file, "test.dat"),
						    true, -781518082)) {
			string_4_ = file.toString();
			bool = true;
			break while_15_;
		    }
		}
	    }
	}
	if (null == string_4_) {
	    string_4_ = new StringBuilder().append(Class700.aString8735).append
			    (File.separatorChar).append
			    ("jagexcache").append
			    (string_3_).append
			    (File.separatorChar).append
			    (string).append
			    (File.separatorChar).append
			    (string_1_).append
			    (File.separatorChar).toString();
	    bool = true;
	}
	if (null != string_5_) {
	    File file = new File(string_5_);
	    File file_10_ = new File(string_4_);
	    try {
		File[] files = file.listFiles();
		File[] files_11_ = files;
		for (int i_12_ = 0; i_12_ < files_11_.length; i_12_++) {
		    File file_13_ = files_11_[i_12_];
		    File file_14_ = new File(file_10_, file_13_.getName());
		    boolean bool_15_ = file_13_.renameTo(file_14_);
		    if (!bool_15_)
			throw new IOException();
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
	    }
	    bool = true;
	}
	if (bool)
	    method6177(new File(string_4_), null, (byte) 32);
	return new File(string_4_);
    }
    
    void method6177(File file, File file_16_, byte i) {
	try {
	    Class23 class23 = new Class23(Class322.aFile3482, "rw", 10000L);
	    ByteBuffer class528_sub42 = new ByteBuffer(500);
	    class528_sub42.writeByte(3, (byte) 61);
	    class528_sub42.writeByte(file_16_ != null ? 1 : 0, (byte) 108);
	    class528_sub42.method9617(file.getPath(), 1037080822);
	    if (file_16_ != null)
		class528_sub42.method9617(file_16_.getPath(), 1037080822);
	    class23.method689(class528_sub42.payload, 0,
			      class528_sub42.pointer * -185904669,
			      -981152859);
	    class23.method683((byte) 124);
	} catch (IOException ioexception) {
	    ioexception.printStackTrace();
	}
    }
    
    @Override
	public void method369(Applet applet) {
	Class196.anApplet2198 = applet;
    }
    
    synchronized void method6178(String string, int i) {
	Class196.aFrame2197 = new Frame();
	Class196.aFrame2197.setTitle(string);
	Class196.aFrame2197.setResizable(true);
	Class196.aFrame2197.addWindowListener(this);
	Class196.aFrame2197.setBackground(Color.black);
	Class196.aFrame2197.setVisible(true);
	Class196.aFrame2197.toFront();
	Insets insets = Class196.aFrame2197.getInsets();
	Class196.aFrame2197.setSize((insets.left + 624323463 * anInt6929
				     + insets.right),
				    (insets.bottom
				     + (Class106.anInt1314 * 1116226221
					+ insets.top)));
    }
    
    synchronized void method6179(byte i) {
	method6181((byte) -100);
	Container container = Class465.method5625(312287159);
	Class64.aCanvas754 = new Canvas_Sub1(container);
	method6180(container, -1161783656);
    }
    
    void method6180(Container container, int i) {
	container.setBackground(Color.black);
	container.setLayout(null);
	container.add(Class64.aCanvas754);
	Class64.aCanvas754.setSize(-1117838587 * Class411.anInt4713,
				   anInt6933 * -2142152407);
	Class64.aCanvas754.setVisible(true);
	if (container == Class196.aFrame2197) {
	    Insets insets = Class196.aFrame2197.getInsets();
	    Class64.aCanvas754.setLocation((insets.left
					    + anInt6931 * 1401768651),
					   (insets.top
					    + -952966111 * anInt6943));
	} else
	    Class64.aCanvas754.setLocation(1401768651 * anInt6931,
					   -952966111 * anInt6943);
	Class64.aCanvas754.addFocusListener(this);
	Class64.aCanvas754.requestFocus();
	Class395.aBool4154 = true;
	aBool6939 = true;
	Class64.aCanvas754.setFocusTraversalKeysEnabled(false);
	aBool6934 = true;
	aBool6923 = false;
	aLong6937 = Class249.method3417(1934207250) * 4585926225619508733L;
    }
    
    void method6181(byte i) {
	if (Class64.aCanvas754 != null) {
	    Class64.aCanvas754.removeFocusListener(this);
	    Class64.aCanvas754.getParent().setBackground(Color.black);
	    Class64.aCanvas754.getParent().remove(Class64.aCanvas754);
	}
    }
    
    final boolean method6182(int i) {
	String string
	    = Class196.anApplet2198.getDocumentBase().getHost().toLowerCase();
	if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
	    return true;
	if (string.equals("runescape.com")
	    || string.endsWith(".runescape.com"))
	    return true;
	if (string.equals("stellardawn.com")
	    || string.endsWith(".stellardawn.com"))
	    return true;
	if (string.endsWith("127.0.0.1"))
	    return true;
	for (/**/;
	     (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
	      && string.charAt(string.length() - 1) <= '9');
	     string = string.substring(0, string.length() - 1)) {
	    /* empty */
	}
	if (string.endsWith("192.168.1."))
	    return true;
	method6173("invalidhost", -1556627988);
	return false;
    }
    
    @Override
	public void run() {
	do {
	    try {
		try {
		    method6209(1746508300);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    VarDomainType.method5340(method6214(808149822), throwable,
					1899848312);
		    method6173("crash", -1556627988);
		    method6187(true, -1323966452);
		    break;
		}
		method6187(true, -988858260);
			} catch (Exception object) {
		method6187(true, 1132379586);
		throw object;
	    }
	} while (false);
    }
    
    String method6183() {
	return null;
    }
    
    static void method6184() {
	try {
	    File file = new File(Class700.aString8735, "random.dat");
	    if (file.exists())
		aClass22_6947
		    = new Class22(new Class23(file, "rw", 25L), 24, 0);
	    else {
	    while_16_:
		for (int i = 0; i < aStringArray6950.length; i++) {
		    for (int i_17_ = 0;
			 i_17_ < Class249.aStringArray2781.length; i_17_++) {
			File file_18_
			    = new File(new StringBuilder().append
					   (Class249.aStringArray2781[i_17_])
					   .append
					   (aStringArray6950[i]).append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_18_.exists()) {
			    aClass22_6947
				= new Class22(new Class23(file_18_, "rw", 25L),
					      24, 0);
			    break while_16_;
			}
		    }
		}
	    }
	    if (aClass22_6947 == null) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		aClass22_6947
		    = new Class22(new Class23(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
    
    void method6185(int i) {
	long l = Class249.method3417(2086318108);
	long l_19_ = (aLongArray6927
		      [1017623197 * Class691_Sub22.anInt10754 - 1 & 0x1f]);
	long l_20_ = aLongArray6927[1017623197 * Class691_Sub22.anInt10754];
	aLongArray6927[Class691_Sub22.anInt10754 * 1017623197] = l;
	Class691_Sub22.anInt10754
	    = (1 + Class691_Sub22.anInt10754 * 1017623197 & 0x1f) * 873227189;
	if (0L != l_20_ && l > l_20_) {
	    int i_21_ = (int) (l - l_20_);
	    anInt6924 = -817279597 * (int) (l - l_19_);
	    anInt6953 = ((i_21_ >> 1) + 32000) / i_21_ * 1155358085;
	}
	if ((anInt6935 += -1792025583) * -818375439 - 1 > 50) {
	    anInt6935 -= 593034066;
	    aBool6934 = true;
	    Class64.aCanvas754.setSize(-1117838587 * Class411.anInt4713,
				       -2142152407 * anInt6933);
	    Class64.aCanvas754.setVisible(true);
	    if (Class196.aFrame2197 != null && null == Class207.aFrame2236) {
		Insets insets = Class196.aFrame2197.getInsets();
		Class64.aCanvas754.setLocation((insets.left
						+ 1401768651 * anInt6931),
					       (insets.top
						+ anInt6943 * -952966111));
	    } else
		Class64.aCanvas754.setLocation(1401768651 * anInt6931,
					       anInt6943 * -952966111);
	}
	method6206(-1012297887);
    }
    
    void method6186(int i) {
	long l = Class249.method3417(2018952715);
	long l_22_ = aLongArray6930[Class212.anInt2248 * -814286055];
	aLongArray6930[Class212.anInt2248 * -814286055] = l;
	Class212.anInt2248
	    = 1026699561 * (Class212.anInt2248 * -814286055 + 1 & 0x1f);
	if (l_22_ != 0L && l <= l_22_) {
	    /* empty */
	}
	synchronized (this) {
	    Class395.aBool4154 = aBool6939;
	}
	method6191(-2022440674);
    }
    
    final void method6187(boolean bool, int i) {
	synchronized (this) {
	    if (aBool6955)
		return;
	    aBool6955 = true;
	}
	try {
	    method6192(-780160589);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    aClass22_6948.method662(-2058582516);
	    for (int i_23_ = 0; i_23_ < Class638.anInt8252 * 1348740411;
		 i_23_++)
		Class5_Sub18.aClass22Array10848[i_23_].method662(936126546);
	    aClass22_6959.method662(-1086731667);
	    aClass22_6947.method662(-625040768);
	} catch (Exception exception) {
	    /* empty */
	}
	if (this.aBool6936) {
	    try {
		QueryPerformanceCounter.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	if (Class240.method3312((byte) 0))
	    Class214.method2971(-1534571328).method357((byte) 0);
	if (Class64.aCanvas754 != null) {
	    try {
		Class64.aCanvas754.removeFocusListener(this);
		Class64.aCanvas754.getParent().remove(Class64.aCanvas754);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if (null != Class196.aFrame2197) {
	    Class196.aFrame2197.setVisible(false);
	    Class196.aFrame2197.dispose();
	    Class196.aFrame2197 = null;
	}
    }
    
    @Override
	public void start() {
	if (!aBool6955)
	    aLong6954 = 0L;
    }
    
    @Override
	public void stop() {
	if (!aBool6955)
	    aLong6954 = ((Class249.method3417(1901903250) + 4000L)
			 * -65514621285598135L);
    }
    
    @Override
	public void destroy() {
	if (!aBool6955) {
	    aLong6954 = Class249.method3417(1940629509) * -65514621285598135L;
	    Class511_Sub1.method9241(5000L);
	    method6187(false, -761554227);
	}
    }
    
    @Override
	public final void update(Graphics graphics) {
	paint(graphics);
    }
    
    @Override
	public void method366() {
	if (!aBool6955)
	    aLong6954 = 0L;
    }
    
    abstract void method6188();
    
    @Override
	public final void focusLost(FocusEvent focusevent) {
	aBool6939 = false;
    }
    
    @Override
	public final void windowActivated(WindowEvent windowevent) {
	/* empty */
    }
    
    void method6189() {
	long l = Class249.method3417(2050852998);
	long l_24_ = aLongArray6930[Class212.anInt2248 * -814286055];
	aLongArray6930[Class212.anInt2248 * -814286055] = l;
	Class212.anInt2248
	    = 1026699561 * (Class212.anInt2248 * -814286055 + 1 & 0x1f);
	if (l_24_ != 0L && l <= l_24_) {
	    /* empty */
	}
	synchronized (this) {
	    Class395.aBool4154 = aBool6939;
	}
	method6191(-2142647966);
    }
    
    @Override
	public final void windowClosing(WindowEvent windowevent) {
	aBool6952 = true;
	destroy();
    }
    
    @Override
	public final void windowDeactivated(WindowEvent windowevent) {
	/* empty */
    }
    
    @Override
	public final void windowDeiconified(WindowEvent windowevent) {
	/* empty */
    }
    
    @Override
	public final void windowOpened(WindowEvent windowevent) {
	/* empty */
    }
    
    abstract void method6190(byte i);
    
    abstract void method6191(int i);
    
    @Override
	public abstract void init();
    
    abstract void method6192(int i);
    
    final boolean method6193() {
	String string
	    = Class196.anApplet2198.getDocumentBase().getHost().toLowerCase();
	if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
	    return true;
	if (string.equals("runescape.com")
	    || string.endsWith(".runescape.com"))
	    return true;
	if (string.equals("stellardawn.com")
	    || string.endsWith(".stellardawn.com"))
	    return true;
	if (string.endsWith("127.0.0.1"))
	    return true;
	for (/**/;
	     (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
	      && string.charAt(string.length() - 1) <= '9');
	     string = string.substring(0, string.length() - 1)) {
	    /* empty */
	}
	if (string.endsWith("192.168.1."))
	    return true;
	method6173("invalidhost", -1556627988);
	return false;
    }
    
    void method6194(String string, String string_25_, byte i) {
	if (!this.aBool6956) {
	    this.aBool6956 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class70.method1086(Class196.anApplet2198, "loggedout",
				   (byte) -81);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class196.anApplet2198.getAppletContext().showDocument
		    (new URL(Class196.anApplet2198.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws?").append
				 (string_25_).toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    void method6195() {
	long l = Class249.method3417(2135002577);
	long l_26_ = (aLongArray6927
		      [1017623197 * Class691_Sub22.anInt10754 - 1 & 0x1f]);
	long l_27_ = aLongArray6927[1017623197 * Class691_Sub22.anInt10754];
	aLongArray6927[Class691_Sub22.anInt10754 * 1017623197] = l;
	Class691_Sub22.anInt10754
	    = (1 + Class691_Sub22.anInt10754 * 1017623197 & 0x1f) * 873227189;
	if (0L != l_27_ && l > l_27_) {
	    int i = (int) (l - l_27_);
	    anInt6924 = -817279597 * (int) (l - l_26_);
	    anInt6953 = ((i >> 1) + 32000) / i * 1155358085;
	}
	if ((anInt6935 += -1792025583) * -818375439 - 1 > 50) {
	    anInt6935 -= 593034066;
	    aBool6934 = true;
	    Class64.aCanvas754.setSize(-1117838587 * Class411.anInt4713,
				       -2142152407 * anInt6933);
	    Class64.aCanvas754.setVisible(true);
	    if (Class196.aFrame2197 != null && null == Class207.aFrame2236) {
		Insets insets = Class196.aFrame2197.getInsets();
		Class64.aCanvas754.setLocation((insets.left
						+ 1401768651 * anInt6931),
					       (insets.top
						+ anInt6943 * -952966111));
	    } else
		Class64.aCanvas754.setLocation(1401768651 * anInt6931,
					       anInt6943 * -952966111);
	}
	method6206(-1012297887);
    }
    
    void method6196(Class502 class502, boolean bool, int i) {
	if (class502 == null)
	    throw new NullPointerException();
	if (class502 != Class502.aClass502_6871
	    && Class502.aClass502_6870 != class502)
	    throw new IllegalStateException();
	aClass502_6926 = class502;
	if (aClass502_6926 != Class502.aClass502_6870) {
	    if (bool)
		aClass502_6926 = Class502.aClass502_6872;
	}
    }
    
    static {
	anInt6924 = 0;
	aLongArray6927 = new long[32];
	aLongArray6930 = new long[32];
	anInt6931 = 0;
	anInt6943 = 0;
	aString6922 = null;
	aBool6934 = true;
	anInt6935 = 1635373364;
	aBool6923 = false;
	aLong6937 = 0L;
	aBool6952 = false;
	aBool6939 = true;
	aClass22_6947 = null;
	aClass22_6948 = null;
	aClass22_6959 = null;
	aClass502_6926 = null;
	aLong6954 = 0L;
	aBool6955 = false;
	anInt6957 = -1737748123;
	anInt6958 = 1503727029;
    }
    
    public void method6197() {
	do {
	    try {
		try {
		    method6209(45460902);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    VarDomainType.method5340(method6214(-862794092), throwable,
					2120330345);
		    method6173("crash", -1556627988);
		    method6187(true, 181566340);
		    break;
		}
		method6187(true, 1838759579);
			} catch (Exception object) {
		method6187(true, 386909464);
		throw object;
	    }
	} while (false);
    }
    
    abstract void method6198();
    
    abstract void method6199();
    
    abstract void method6200();
    
    public void method6201(byte i) throws Exception_Sub1 {
	if (!this.aBool6936) {
	    Class214.method2971(-1013048253).method362("jaclib", (byte) 1);
	    try {
		QueryPerformanceCounter.init();
	    } catch (Throwable throwable) {
		if (Class312.aString3440.startsWith("win"))
		    throw new Exception_Sub1(128, "jaclib");
	    }
	    this.aBool6936 = true;
	}
    }
    
    abstract void method6202();
    
    @Override
	public final synchronized void paint(Graphics graphics) {
	if (!aBool6955) {
	    aBool6934 = true;
	    if ((Class249.method3417(2030344312)
		 - aLong6937 * 4420192977038731093L)
		> 1000L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (null == rectangle
		    || (rectangle.width >= anInt6929 * 624323463
			&& (rectangle.height
			    >= 1116226221 * Class106.anInt1314)))
		    aBool6923 = true;
	    }
	}
    }
    
    abstract void method6203();
    
    String method6204() {
	return null;
    }
    
    String method6205() {
	return null;
    }
    
    abstract void method6206(int i);
    
    String method6207() {
	return null;
    }
    
    abstract void method6208();
    
    @Override
	public void method370(Applet applet) {
	Class196.anApplet2198 = applet;
    }
    
    @Override
	public void method371(Applet applet) {
	Class196.anApplet2198 = applet;
    }
    
    void method6209(int i) {
	if (null != Class293.aString3221) {
	    String string = Class293.aString3221.toLowerCase();
	    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
		String string_28_ = Class156.aString1735;
		if (string_28_.equals("1.1") || string_28_.startsWith("1.1.")
		    || string_28_.equals("1.2")
		    || string_28_.startsWith("1.2.")
		    || string_28_.equals("1.3")
		    || string_28_.startsWith("1.3.")
		    || string_28_.equals("1.4")
		    || string_28_.startsWith("1.4.")
		    || string_28_.equals("1.5")
		    || string_28_.startsWith("1.5.")
		    || string_28_.equals("1.6.0")) {
		    method6173("wrongjava", -1556627988);
		    return;
		}
		if (string_28_.startsWith("1.6.0_")) {
		    int i_29_;
		    for (i_29_ = 6;
			 (i_29_ < string_28_.length()
			  && Class42.method832(string_28_.charAt(i_29_),
					       -154602312));
			 i_29_++) {
			/* empty */
		    }
		    String string_30_ = string_28_.substring(6, i_29_);
		    if (Class615.method7353(string_30_, -232811045)
			&& Class454.method5495(string_30_, 717927929) < 10) {
			method6173("wrongjava", -1556627988);
			return;
		    }
		}
	    }
	}
	Class465.method5625(312287159).setFocusCycleRoot(true);
	anInt6957 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1)
		     * 1737748123);
	anInt6958 = Runtime.getRuntime().availableProcessors() * 1503727029;
	method6179((byte) 85);
	method6190((byte) 9);
	aClass501_6921 = Class218.method3139((byte) 124);
	while (0L == aLong6954 * -4235802857362737671L
	       || (Class249.method3417(2093663259)
		   < aLong6954 * -4235802857362737671L)) {
	    anInt6949
		= (aClass501_6921.method6095(aLong6938 * 7052794948836738025L)
		   * -990201107);
	    for (int i_31_ = 0; i_31_ < anInt6949 * 1861661413; i_31_++)
		method6186(-465542506);
	    method6185(-1661165210);
	    Class278.method3729(Class64.aCanvas754, 1391809983);
	}
    }
    
    @Override
	public void method373() {
	if (!aBool6955)
	    aLong6954 = ((Class249.method3417(2115667197) + 4000L)
			 * -65514621285598135L);
    }
    
    void method6210() {
	long l = Class249.method3417(1935041048);
	long l_32_ = (aLongArray6927
		      [1017623197 * Class691_Sub22.anInt10754 - 1 & 0x1f]);
	long l_33_ = aLongArray6927[1017623197 * Class691_Sub22.anInt10754];
	aLongArray6927[Class691_Sub22.anInt10754 * 1017623197] = l;
	Class691_Sub22.anInt10754
	    = (1 + Class691_Sub22.anInt10754 * 1017623197 & 0x1f) * 873227189;
	if (0L != l_33_ && l > l_33_) {
	    int i = (int) (l - l_33_);
	    anInt6924 = -817279597 * (int) (l - l_32_);
	    anInt6953 = ((i >> 1) + 32000) / i * 1155358085;
	}
	if ((anInt6935 += -1792025583) * -818375439 - 1 > 50) {
	    anInt6935 -= 593034066;
	    aBool6934 = true;
	    Class64.aCanvas754.setSize(-1117838587 * Class411.anInt4713,
				       -2142152407 * anInt6933);
	    Class64.aCanvas754.setVisible(true);
	    if (Class196.aFrame2197 != null && null == Class207.aFrame2236) {
		Insets insets = Class196.aFrame2197.getInsets();
		Class64.aCanvas754.setLocation((insets.left
						+ 1401768651 * anInt6931),
					       (insets.top
						+ anInt6943 * -952966111));
	    } else
		Class64.aCanvas754.setLocation(1401768651 * anInt6931,
					       anInt6943 * -952966111);
	}
	method6206(-1012297887);
    }
    
    @Override
	public void method382(Applet applet) {
	Class196.anApplet2198 = applet;
    }
    
    @Override
	public final void focusGained(FocusEvent focusevent) {
	aBool6939 = true;
	aBool6934 = true;
    }
    
    void method6211() {
	if (null != Class293.aString3221) {
	    String string = Class293.aString3221.toLowerCase();
	    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
		String string_34_ = Class156.aString1735;
		if (string_34_.equals("1.1") || string_34_.startsWith("1.1.")
		    || string_34_.equals("1.2")
		    || string_34_.startsWith("1.2.")
		    || string_34_.equals("1.3")
		    || string_34_.startsWith("1.3.")
		    || string_34_.equals("1.4")
		    || string_34_.startsWith("1.4.")
		    || string_34_.equals("1.5")
		    || string_34_.startsWith("1.5.")
		    || string_34_.equals("1.6.0")) {
		    method6173("wrongjava", -1556627988);
		    return;
		}
		if (string_34_.startsWith("1.6.0_")) {
		    int i;
		    for (i = 6; (i < string_34_.length()
				 && Class42.method832(string_34_.charAt(i),
						      1662710244)); i++) {
			/* empty */
		    }
		    String string_35_ = string_34_.substring(6, i);
		    if (Class615.method7353(string_35_, 2004423914)
			&& Class454.method5495(string_35_, 717927929) < 10) {
			method6173("wrongjava", -1556627988);
			return;
		    }
		}
	    }
	}
	Class465.method5625(312287159).setFocusCycleRoot(true);
	anInt6957 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1)
		     * 1737748123);
	anInt6958 = Runtime.getRuntime().availableProcessors() * 1503727029;
	method6179((byte) 62);
	method6190((byte) 52);
	aClass501_6921 = Class218.method3139((byte) 124);
	while (0L == aLong6954 * -4235802857362737671L
	       || (Class249.method3417(1928982347)
		   < aLong6954 * -4235802857362737671L)) {
	    anInt6949
		= (aClass501_6921.method6095(aLong6938 * 7052794948836738025L)
		   * -990201107);
	    for (int i = 0; i < anInt6949 * 1861661413; i++)
		method6186(-1052409382);
	    method6185(-1773745968);
	    Class278.method3729(Class64.aCanvas754, -330289562);
	}
    }
    
    synchronized void method6212() {
	method6181((byte) 85);
	Container container = Class465.method5625(312287159);
	Class64.aCanvas754 = new Canvas_Sub1(container);
	method6180(container, 363776158);
    }
    
    @Override
	public final void windowIconified(WindowEvent windowevent) {
	/* empty */
    }
    
    void method6213() {
	if (Class64.aCanvas754 != null) {
	    Class64.aCanvas754.removeFocusListener(this);
	    Class64.aCanvas754.getParent().setBackground(Color.black);
	    Class64.aCanvas754.getParent().remove(Class64.aCanvas754);
	}
    }
    
    String method6214(int i) {
	return null;
    }
    
    void method6215() {
	if (null != Class293.aString3221) {
	    String string = Class293.aString3221.toLowerCase();
	    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
		String string_36_ = Class156.aString1735;
		if (string_36_.equals("1.1") || string_36_.startsWith("1.1.")
		    || string_36_.equals("1.2")
		    || string_36_.startsWith("1.2.")
		    || string_36_.equals("1.3")
		    || string_36_.startsWith("1.3.")
		    || string_36_.equals("1.4")
		    || string_36_.startsWith("1.4.")
		    || string_36_.equals("1.5")
		    || string_36_.startsWith("1.5.")
		    || string_36_.equals("1.6.0")) {
		    method6173("wrongjava", -1556627988);
		    return;
		}
		if (string_36_.startsWith("1.6.0_")) {
		    int i;
		    for (i = 6; (i < string_36_.length()
				 && Class42.method832(string_36_.charAt(i),
						      -1339558252)); i++) {
			/* empty */
		    }
		    String string_37_ = string_36_.substring(6, i);
		    if (Class615.method7353(string_37_, 662398892)
			&& Class454.method5495(string_37_, 717927929) < 10) {
			method6173("wrongjava", -1556627988);
			return;
		    }
		}
	    }
	}
	Class465.method5625(312287159).setFocusCycleRoot(true);
	anInt6957 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1)
		     * 1737748123);
	anInt6958 = Runtime.getRuntime().availableProcessors() * 1503727029;
	method6179((byte) 90);
	method6190((byte) 127);
	aClass501_6921 = Class218.method3139((byte) 124);
	while (0L == aLong6954 * -4235802857362737671L
	       || (Class249.method3417(1976624991)
		   < aLong6954 * -4235802857362737671L)) {
	    anInt6949
		= (aClass501_6921.method6095(aLong6938 * 7052794948836738025L)
		   * -990201107);
	    for (int i = 0; i < anInt6949 * 1861661413; i++)
		method6186(584988817);
	    method6185(-1833714191);
	    Class278.method3729(Class64.aCanvas754, 760062540);
	}
    }
    
    @Override
	public final void windowClosed(WindowEvent windowevent) {
	/* empty */
    }
    
    void method6216() {
	long l = Class249.method3417(2078893533);
	long l_38_ = aLongArray6930[Class212.anInt2248 * -814286055];
	aLongArray6930[Class212.anInt2248 * -814286055] = l;
	Class212.anInt2248
	    = 1026699561 * (Class212.anInt2248 * -814286055 + 1 & 0x1f);
	if (l_38_ != 0L && l <= l_38_) {
	    /* empty */
	}
	synchronized (this) {
	    Class395.aBool4154 = aBool6939;
	}
	method6191(-1760585289);
    }
    
    void method6217() {
	long l = Class249.method3417(2122258428);
	long l_39_ = aLongArray6930[Class212.anInt2248 * -814286055];
	aLongArray6930[Class212.anInt2248 * -814286055] = l;
	Class212.anInt2248
	    = 1026699561 * (Class212.anInt2248 * -814286055 + 1 & 0x1f);
	if (l_39_ != 0L && l <= l_39_) {
	    /* empty */
	}
	synchronized (this) {
	    Class395.aBool4154 = aBool6939;
	}
	method6191(-2093038542);
    }
    
    boolean method6218(File file, boolean bool, int i) {
	boolean bool_40_;
	try {
	    RandomAccessFile randomaccessfile
		= new RandomAccessFile(file, "rw");
	    int i_41_ = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i_41_);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    if (bool)
		file.delete();
	    bool_40_ = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool_40_;
    }
    
    void method6219() {
	long l = Class249.method3417(2030177171);
	long l_42_ = aLongArray6930[Class212.anInt2248 * -814286055];
	aLongArray6930[Class212.anInt2248 * -814286055] = l;
	Class212.anInt2248
	    = 1026699561 * (Class212.anInt2248 * -814286055 + 1 & 0x1f);
	if (l_42_ != 0L && l <= l_42_) {
	    /* empty */
	}
	synchronized (this) {
	    Class395.aBool4154 = aBool6939;
	}
	method6191(-1884332800);
    }
    
    public final void method6220(FocusEvent focusevent) {
	aBool6939 = true;
	aBool6934 = true;
    }
    
    void method6221() {
	long l = Class249.method3417(1997002342);
	long l_43_ = (aLongArray6927
		      [1017623197 * Class691_Sub22.anInt10754 - 1 & 0x1f]);
	long l_44_ = aLongArray6927[1017623197 * Class691_Sub22.anInt10754];
	aLongArray6927[Class691_Sub22.anInt10754 * 1017623197] = l;
	Class691_Sub22.anInt10754
	    = (1 + Class691_Sub22.anInt10754 * 1017623197 & 0x1f) * 873227189;
	if (0L != l_44_ && l > l_44_) {
	    int i = (int) (l - l_44_);
	    anInt6924 = -817279597 * (int) (l - l_43_);
	    anInt6953 = ((i >> 1) + 32000) / i * 1155358085;
	}
	if ((anInt6935 += -1792025583) * -818375439 - 1 > 50) {
	    anInt6935 -= 593034066;
	    aBool6934 = true;
	    Class64.aCanvas754.setSize(-1117838587 * Class411.anInt4713,
				       -2142152407 * anInt6933);
	    Class64.aCanvas754.setVisible(true);
	    if (Class196.aFrame2197 != null && null == Class207.aFrame2236) {
		Insets insets = Class196.aFrame2197.getInsets();
		Class64.aCanvas754.setLocation((insets.left
						+ 1401768651 * anInt6931),
					       (insets.top
						+ anInt6943 * -952966111));
	    } else
		Class64.aCanvas754.setLocation(1401768651 * anInt6931,
					       anInt6943 * -952966111);
	}
	method6206(-1012297887);
    }
    
    String method6222() {
	return null;
    }
    
    public static final int method6223() {
	return (int) (1000000000L / (aLong6938 * 7052794948836738025L));
    }
    
    public static final void method6224() {
	aClass501_6921.method6104((byte) -15);
	for (int i = 0; i < 32; i++)
	    aLongArray6927[i] = 0L;
	for (int i = 0; i < 32; i++)
	    aLongArray6930[i] = 0L;
	anInt6949 = 0;
    }
    
    public static final void method6225() {
	aClass501_6921.method6104((byte) -25);
	for (int i = 0; i < 32; i++)
	    aLongArray6927[i] = 0L;
	for (int i = 0; i < 32; i++)
	    aLongArray6930[i] = 0L;
	anInt6949 = 0;
    }
    
    @Override
	public void method367() {
	if (!aBool6955)
	    aLong6954 = 0L;
    }
    
    Class509() {
	this.aBool6936 = false;
    }
    
    @Override
	public void method374() {
	if (!aBool6955)
	    aLong6954 = ((Class249.method3417(2128316314) + 4000L)
			 * -65514621285598135L);
    }
    
    @Override
	public void method364() {
	if (!aBool6955)
	    aLong6954 = ((Class249.method3417(2065549403) + 4000L)
			 * -65514621285598135L);
    }
    
    abstract void method6226();
    
    @Override
	public void method372() {
	if (!aBool6955) {
	    aLong6954 = Class249.method3417(1927590090) * -65514621285598135L;
	    Class511_Sub1.method9241(5000L);
	    method6187(false, -1431634899);
	}
    }
    
    @Override
	public final void method379(Graphics graphics) {
	paint(graphics);
    }
    
    @Override
	public final synchronized void method380(Graphics graphics) {
	if (!aBool6955) {
	    aBool6934 = true;
	    if ((Class249.method3417(2108841548)
		 - aLong6937 * 4420192977038731093L)
		> 1000L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (null == rectangle
		    || (rectangle.width >= anInt6929 * 624323463
			&& (rectangle.height
			    >= 1116226221 * Class106.anInt1314)))
		    aBool6923 = true;
	    }
	}
    }
    
    @Override
	public void method377() {
	if (!aBool6955)
	    aLong6954 = ((Class249.method3417(2010387614) + 4000L)
			 * -65514621285598135L);
    }
    
    @Override
	public void method376() {
	if (!aBool6955)
	    aLong6954 = ((Class249.method3417(2077166311) + 4000L)
			 * -65514621285598135L);
    }
    
    @Override
	public final void method378(Graphics graphics) {
	paint(graphics);
    }
    
    @Override
	public abstract void method381();
    
    @Override
	public abstract void method375();
    
    @Override
	public abstract void method365();
    
    @Override
	public abstract void method368();
    
    public static final void method6227() {
	Class193.anImage2172 = null;
	Class5_Sub15.aFont10842 = null;
    }
    
    void method6228() {
	if (null != Class293.aString3221) {
	    String string = Class293.aString3221.toLowerCase();
	    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
		String string_45_ = Class156.aString1735;
		if (string_45_.equals("1.1") || string_45_.startsWith("1.1.")
		    || string_45_.equals("1.2")
		    || string_45_.startsWith("1.2.")
		    || string_45_.equals("1.3")
		    || string_45_.startsWith("1.3.")
		    || string_45_.equals("1.4")
		    || string_45_.startsWith("1.4.")
		    || string_45_.equals("1.5")
		    || string_45_.startsWith("1.5.")
		    || string_45_.equals("1.6.0")) {
		    method6173("wrongjava", -1556627988);
		    return;
		}
		if (string_45_.startsWith("1.6.0_")) {
		    int i;
		    for (i = 6; (i < string_45_.length()
				 && Class42.method832(string_45_.charAt(i),
						      -963252547)); i++) {
			/* empty */
		    }
		    String string_46_ = string_45_.substring(6, i);
		    if (Class615.method7353(string_46_, 1972787889)
			&& Class454.method5495(string_46_, 717927929) < 10) {
			method6173("wrongjava", -1556627988);
			return;
		    }
		}
	    }
	}
	Class465.method5625(312287159).setFocusCycleRoot(true);
	anInt6957 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1)
		     * 1737748123);
	anInt6958 = Runtime.getRuntime().availableProcessors() * 1503727029;
	method6179((byte) 43);
	method6190((byte) 89);
	aClass501_6921 = Class218.method3139((byte) 124);
	while (0L == aLong6954 * -4235802857362737671L
	       || (Class249.method3417(2053492044)
		   < aLong6954 * -4235802857362737671L)) {
	    anInt6949
		= (aClass501_6921.method6095(aLong6938 * 7052794948836738025L)
		   * -990201107);
	    for (int i = 0; i < anInt6949 * 1861661413; i++)
		method6186(1217955849);
	    method6185(-2118994960);
	    Class278.method3729(Class64.aCanvas754, 292862381);
	}
    }
    
    abstract void method6229();
    
    void method6230(String string) {
	if (!this.aBool6956) {
	    this.aBool6956 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class70.method1086(Class196.anApplet2198, "loggedout",
				   (byte) -47);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class196.anApplet2198.getAppletContext().showDocument
		    (new URL(Class196.anApplet2198.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws").toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    final void method6231(String string, String string_47_, int i, int i_48_,
			  int i_49_, int i_50_, int i_51_) throws Exception {
	Class638.anInt8252 = 370371571 * i_48_;
	Class517.anInt6971 = i * 516702241;
	RuntimeException_Sub4.anInt11930 = i_49_ * 1710923727;
	Class387.anInt4073 = -1830605105 * i_50_;
	Class293.aString3221 = "Unknown";
	Class156.aString1735 = "1.1";
	try {
	    Class293.aString3221 = System.getProperty("java.vendor");
	    Class156.aString1735 = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    Class106.aString1315 = System.getProperty("os.name");
	} catch (Exception exception) {
	    Class106.aString1315 = "Unknown";
	}
	Class312.aString3440 = Class106.aString1315.toLowerCase();
	try {
	    Class674.aString8539 = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    Class674.aString8539 = "";
	}
	try {
	    Class278.aString3050
		= System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    Class278.aString3050 = "";
	}
	try {
	    Class700.aString8735 = System.getProperty("user.home");
	    if (null != Class700.aString8735)
		Class700.aString8735
		    = new StringBuilder().append(Class700.aString8735).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (Class312.aString3440.startsWith("win")) {
		if (null == Class700.aString8735)
		    Class700.aString8735 = System.getenv("USERPROFILE");
	    } else if (Class700.aString8735 == null)
		Class700.aString8735 = System.getenv("HOME");
	    if (null != Class700.aString8735)
		Class700.aString8735
		    = new StringBuilder().append(Class700.aString8735).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	if (Class700.aString8735 == null)
	    Class700.aString8735 = "~/";
	try {
	    Class473.anEventQueue5427
		= Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	Class249.aStringArray2781
	    = new String[] { "c:/rscache/", "/rscache/", "c:/windows/",
			     "c:/winnt/", "c:/", Class700.aString8735, "/tmp/",
			     "" };
	aStringArray6950
	    = new String[] { new StringBuilder().append(".jagex_cache_").append
				 (-816626719 * Class517.anInt6971).toString(),
			     new StringBuilder().append(".file_store_").append
				 (-816626719 * Class517.anInt6971)
				 .toString() };
    while_18_:
	for (int i_52_ = 0; i_52_ < 4; i_52_++) {
	    Class109.aFile1396
		= method6176(string, string_47_, i_52_, 690769050);
	    if (!Class109.aFile1396.exists())
		Class109.aFile1396.mkdirs();
	    File[] files = Class109.aFile1396.listFiles();
	    if (null != files) {
		File[] files_53_ = files;
		for (int i_54_ = 0; i_54_ < files_53_.length; i_54_++) {
		    File file = files_53_[i_54_];
		    if (!method6218(file, false, -1901398591))
			continue while_18_;
		}
	    }
	    break;
	}
	IncomingPacket.method4810(Class109.aFile1396, -39803189);
	Class528_Sub37.method9552(-2030620372);
	aClass22_6948
	    = new Class22(new Class23((Class182.method2695
				       ("main_file_cache.dat2", 869813091)),
				      "rw", 3221225472L),
			  5200, 0);
	aClass22_6959
	    = new Class22(new Class23((Class182.method2695
				       ("main_file_cache.idx255", 151713418)),
				      "rw", 1048576L),
			  6000, 0);
	Class5_Sub18.aClass22Array10848
	    = new Class22[Class638.anInt8252 * 1348740411];
	for (int i_55_ = 0; i_55_ < Class638.anInt8252 * 1348740411; i_55_++)
	    Class5_Sub18.aClass22Array10848[i_55_]
		= new Class22(new Class23((Class182.method2695
					   (new StringBuilder().append
						("main_file_cache.idx").append
						(i_55_).toString(),
					    -1233863937)),
					  "rw", 1048576L),
			      6000, 0);
	try {
	    Class181.aClass702_2093 = new Class702();
	} catch (Exception exception) {
	    Class700.aBool8733 = false;
	}
	Class289.aClass506_3183 = new Class506();
	ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
	for (ThreadGroup threadgroup_56_ = threadgroup.getParent();
	     threadgroup_56_ != null;
	     threadgroup_56_ = threadgroup.getParent())
	    threadgroup = threadgroup_56_;
	Thread[] threads = new Thread[1000];
	threadgroup.enumerate(threads);
	for (int i_57_ = 0; i_57_ < threads.length; i_57_++) {
	    if (threads[i_57_] != null
		&& threads[i_57_].getName().startsWith("AWT"))
		threads[i_57_].setPriority(1);
	}
	Thread thread = new Thread(this);
	thread.setDaemon(true);
	thread.start();
	thread.setPriority(1);
    }
    
    final void method6232(Class510 class510, String string, String string_58_,
			  int i, int i_59_, int i_60_, int i_61_, boolean bool,
			  int i_62_) {
	try {
	    method6196(Class502.aClass502_6871, bool, 136933885);
	    anInt6929 = ((Class411.anInt4713
			  = class510.method6239(2072414382) * 1161376205)
			 * 1658558483);
	    Class106.anInt1314
		= ((anInt6933 = class510.method6240(-1745791208) * -1380560103)
		   * 1870461933);
	    anInt6931 = 0;
	    anInt6943 = 0;
	    if (Class643.method7662((short) 1245) == Class502.aClass502_6872) {
		anInt6929 += 1516164206 * class510.method6241((byte) -118);
		Class106.anInt1314
		    += 1489035850 * class510.method6242((byte) 6);
		method6178(class510.method6247(-514203560), -1205039257);
	    }
	    RuntimeException_Sub4.anApplet11933 = Class196.anApplet2198;
	    method6231(string, string_58_, i, i_59_, i_60_, i_61_, 1750124146);
	} catch (Throwable throwable) {
	    VarDomainType.method5340(null, throwable, 1802154395);
	    method6173("crash", -1556627988);
	}
    }
    
    static void method6233(Class648 class648, int i) {
	class648.anInt8395 -= -1816921966;
	int i_63_ = (class648.anIntArray8394
		     [717927929 * class648.anInt8395]);
	int i_64_ = (class648.anIntArray8394
		     [717927929 * class648.anInt8395 + 1]);
	TwitchWebcamDevice twitchwebcamdevice
	    = Class264.method3658(i_63_, (byte) 2);
	TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
	if (twitchwebcamdevice != null)
	    twitchwebcamdevicecapability
		= twitchwebcamdevice.method1179(i_64_);
	if (twitchwebcamdevicecapability == null) {
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	} else {
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 555645557 * twitchwebcamdevicecapability.anInt1106;
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= twitchwebcamdevicecapability.anInt1107 * -847254329;
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1987359461 * twitchwebcamdevicecapability.anInt1108;
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= twitchwebcamdevicecapability.anInt1109 * 119066631;
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= twitchwebcamdevicecapability.anInt1110 * 2128534695;
	}
    }
    
    static final void method6234(Class648 class648, byte i) {
	class648.anInt8395 -= -1816921966;
	int i_65_ = (class648.anIntArray8394
		     [class648.anInt8395 * 717927929]);
	int i_66_ = (class648.anIntArray8394
		     [1 + 717927929 * class648.anInt8395]);
	if (i_65_ == 0)
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	else if (0 == i_66_)
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 2147483647;
	else
	    class648.anIntArray8394
		[((class648.anInt8395 += 1239022665) * 717927929
		  - 1)]
		= (int) Math.pow(i_65_, 1.0 / i_66_);
    }
    
    static final void method6235(Class648 class648, byte i) {
	Class192.method2798(class648, -176781623);
    }
    
    public static void method6236(Class528_Sub21 class528_sub21,
				  Class528_Sub21 class528_sub21_67_, int i) {
	if (null != class528_sub21.aClass528_Sub21_10406)
	    class528_sub21.method9429((byte) -6);
	class528_sub21.aClass528_Sub21_10406 = class528_sub21_67_;
	class528_sub21.aClass528_Sub21_10408
	    = class528_sub21_67_.aClass528_Sub21_10408;
	class528_sub21.aClass528_Sub21_10406.aClass528_Sub21_10408
	    = class528_sub21;
	class528_sub21.aClass528_Sub21_10408.aClass528_Sub21_10406
	    = class528_sub21;
    }
    
    static final void method6237(Class648 class648, int i) {
	class648.anInt8395 -= 1239022665;
	int i_68_ = (class648.anIntArray8394
		     [class648.anInt8395 * 717927929]);
	Class365.aClass218_3848.method3088(i_68_, 91328607);
    }
}
