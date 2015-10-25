/* Class581 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Class581
{
    static long aLong7615;
    static final int anInt7616 = 0;
    static final int anInt7617 = 1;
    static final int anInt7618 = 2;
    static long aLong7619;
    static final int anInt7620 = 0;
    static final int anInt7621 = 1;
    static final int anInt7622 = 2;
    static float aFloat7623;
    static int anInt7624;
    static int anInt7625;
    static boolean aBool7626;
    static int anInt7627;
    static boolean aBool7628;
    static int anInt7629;
    static int anInt7630;
    static String[] aStringArray7631;
    static final int anInt7632 = 3;
    static LinkedList aLinkedList7633;
    static final int anInt7634 = 2000;
    static long aLong7635;
    static int anInt7636;
    static boolean aBool7637;
    static int anInt7638;
    static TwitchWebcamFrameData aTwitchWebcamFrameData7639;
    static LinkedList aLinkedList7640;
    static TwitchWebcamDevice[] aTwitchWebcamDeviceArray7641;
    static int anInt7642;
    static boolean[] aBoolArray7643;
    static long aLong7644;
    static Class151 aClass151_7645;
    static boolean aBool7646;
    static boolean aBool7647;
    static boolean aBool7648 = false;
    public static Class5_Sub19 aClass5_Sub19_7649;
    
    public static int method6925() {
	if (!Class239.method3309((byte) -62))
	    return 0;
	return 1855854259 * anInt7638;
    }
    
    static {
	aFloat7623 = 0.2F;
	anInt7624 = 2128062295;
	anInt7636 = -1791173856;
	anInt7625 = 0;
	anInt7627 = 607582480;
	anInt7630 = 0;
	anInt7629 = 0;
	aBoolArray7643 = null;
	aStringArray7631 = null;
	aBool7626 = false;
	aLong7615 = 0L;
	aLong7644 = 0L;
	aLong7635 = 0L;
	anInt7638 = 0;
	aBool7637 = false;
	aBool7628 = false;
	aTwitchWebcamFrameData7639 = null;
	aLinkedList7640 = new LinkedList();
	aLinkedList7633 = new LinkedList();
	anInt7642 = 1106371201;
	aTwitchWebcamDeviceArray7641 = null;
	aLong7619 = 0L;
	aClass151_7645 = null;
	aBool7646 = false;
	aBool7647 = false;
    }
    
    public static void method6926() {
	anInt7642 = 1106371201;
    }
    
    public static void method6927() {
	anInt7642 = 1106371201;
    }
    
    public static int method6928() {
	return Canvas_Sub1.aTwitchTV11693.GetChatState();
    }
    
    public static void method6929() {
	anInt7642 = 1106371201;
    }
    
    public static int method6930() {
	return (aTwitchWebcamDeviceArray7641 == null ? 0
		: aTwitchWebcamDeviceArray7641.length);
    }
    
    public static int method6931() {
	if (Class427.aTwitchEventLiveStreams4800 == null
	    || (741057151 * anInt7642
		>= Class427.aTwitchEventLiveStreams4800.streamCount - 1))
	    return -1;
	return (anInt7642 += -1106371201) * 741057151;
    }
    
    public static void method6932(boolean bool) {
	/* empty */
    }
    
    public static int method6933() {
	return anInt7630 * -244674793;
    }
    
    public static void method6934(boolean bool) {
	/* empty */
    }
    
    public static void method6935(boolean bool) {
	/* empty */
    }
    
    public static void method6936(boolean bool) {
	/* empty */
    }
    
    public static void method6937() {
	if (aBool7626) {
	    int i = Canvas_Sub1.aTwitchTV11693.ShutdownTTV();
	    if (0 == i) {
		Canvas_Sub1.aTwitchTV11693 = null;
		aBool7626 = false;
	    }
	}
    }
    
    public static void method6938() {
	anInt7642 = 1106371201;
    }
    
    public static int method6939() {
	if (Class427.aTwitchEventLiveStreams4800 == null
	    || (741057151 * anInt7642
		>= Class427.aTwitchEventLiveStreams4800.streamCount - 1))
	    return -1;
	return (anInt7642 += -1106371201) * 741057151;
    }
    
    static void method6940() {
	if (null == aClass151_7645
	    || aClass151_7645.method1766() != aTwitchWebcamFrameData7639.width
	    || (aClass151_7645.method1767()
		!= aTwitchWebcamFrameData7639.height))
	    aClass151_7645 = (Class587.aClass173_7714.method2382
			      (aTwitchWebcamFrameData7639.buffer, 0,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.height, false));
	else
	    aClass151_7645.method1770(0, 0, aTwitchWebcamFrameData7639.width,
				      aTwitchWebcamFrameData7639.height,
				      aTwitchWebcamFrameData7639.buffer, 0,
				      aTwitchWebcamFrameData7639.width);
    }
    
    public static int method6941() {
	if (3 == -244674793 * anInt7630)
	    return -1;
	if (0 != anInt7630 * -244674793)
	    return anInt7629 * -58829207;
	if (aStringArray7631 == null) {
	    if (Class493.aString5525.startsWith("mac ")) {
		if (Class493.aString5527.startsWith("ppc")) {
		    anInt7630 = -701183499;
		    return -1;
		}
		aStringArray7631 = new String[3];
		aStringArray7631[0] = "sdk-mac-dynamic";
		aStringArray7631[1] = "twitchsdk";
		aStringArray7631[2] = "twitchtv";
		aBoolArray7643 = new boolean[3];
		aBoolArray7643[0] = false;
		aBoolArray7643[1] = false;
		aBoolArray7643[2] = true;
	    } else if (Class493.aString5525.startsWith("win")) {
		aStringArray7631 = new String[6];
		aStringArray7631[0] = "avutil-ttv-51";
		aStringArray7631[1] = "libmp3lame-ttv";
		aStringArray7631[2] = "swresample-ttv-0";
		aStringArray7631[5] = "twitchtv";
		if (Class493.aString5527.startsWith("amd64")
		    || Class493.aString5527.startsWith("x86_64")) {
		    aStringArray7631[3] = "libmfxsw64";
		    aStringArray7631[4] = "twitchsdk_64_release";
		} else if (Class493.aString5527.startsWith("i386")
			   || Class493.aString5527.startsWith("i486")
			   || Class493.aString5527.startsWith("i586")
			   || Class493.aString5527.startsWith("x86")) {
		    aStringArray7631[3] = "libmfxsw32";
		    aStringArray7631[4] = "twitchsdk_32_release";
		} else {
		    anInt7630 = -701183499;
		    return -1;
		}
		aBoolArray7643 = new boolean[6];
		aBoolArray7643[0] = true;
		aBoolArray7643[1] = true;
		aBoolArray7643[2] = true;
		aBoolArray7643[3] = false;
		aBoolArray7643[4] = true;
		aBoolArray7643[5] = true;
	    } else {
		anInt7630 = -701183499;
		return -1;
	    }
	}
	anInt7630 = -233727833;
	return 0;
    }
    
    public static void method6942() {
	if (aBool7626) {
	    int i = Canvas_Sub1.aTwitchTV11693.ShutdownTTV();
	    if (0 == i) {
		Canvas_Sub1.aTwitchTV11693 = null;
		aBool7626 = false;
	    }
	}
    }
    
    public static void method6943() {
	if (aBool7626) {
	    int i = Canvas_Sub1.aTwitchTV11693.ShutdownTTV();
	    if (0 == i) {
		Canvas_Sub1.aTwitchTV11693 = null;
		aBool7626 = false;
	    }
	}
    }
    
    public static void method6944() {
	if (aBool7626) {
	    int i = Canvas_Sub1.aTwitchTV11693.ShutdownTTV();
	    if (0 == i) {
		Canvas_Sub1.aTwitchTV11693 = null;
		aBool7626 = false;
	    }
	}
    }
    
    public static boolean method6945() {
	return (null != Canvas_Sub1.aTwitchTV11693
		&& Canvas_Sub1.aTwitchTV11693.IsStreaming());
    }
    
    public static int method6946() {
	return Canvas_Sub1.aTwitchTV11693.GetLoginState();
    }
    
    public static int method6947() {
	if (!aBool7626)
	    return 12;
	Class191.method2794(Class587.aClass173_7714, 1645935901);
	return Canvas_Sub1.aTwitchTV11693.Logout();
    }
    
    static void method6948() {
	aBool7637 = false;
	Class35.anIntArray330 = null;
	Class463.anIntArray5301 = null;
	aLinkedList7640.clear();
	aLinkedList7633.clear();
	Class587.aClass173_7714.method2342();
    }
    
    static void method6949() {
	aBool7637 = false;
	Class35.anIntArray330 = null;
	Class463.anIntArray5301 = null;
	aLinkedList7640.clear();
	aLinkedList7633.clear();
	Class587.aClass173_7714.method2342();
    }
    
    public static void method6950(boolean bool) {
	/* empty */
    }
    
    public static int method6951() {
	if (3 == -244674793 * anInt7630)
	    return -1;
	if (0 != anInt7630 * -244674793)
	    return anInt7629 * -58829207;
	if (aStringArray7631 == null) {
	    if (Class493.aString5525.startsWith("mac ")) {
		if (Class493.aString5527.startsWith("ppc")) {
		    anInt7630 = -701183499;
		    return -1;
		}
		aStringArray7631 = new String[3];
		aStringArray7631[0] = "sdk-mac-dynamic";
		aStringArray7631[1] = "twitchsdk";
		aStringArray7631[2] = "twitchtv";
		aBoolArray7643 = new boolean[3];
		aBoolArray7643[0] = false;
		aBoolArray7643[1] = false;
		aBoolArray7643[2] = true;
	    } else if (Class493.aString5525.startsWith("win")) {
		aStringArray7631 = new String[6];
		aStringArray7631[0] = "avutil-ttv-51";
		aStringArray7631[1] = "libmp3lame-ttv";
		aStringArray7631[2] = "swresample-ttv-0";
		aStringArray7631[5] = "twitchtv";
		if (Class493.aString5527.startsWith("amd64")
		    || Class493.aString5527.startsWith("x86_64")) {
		    aStringArray7631[3] = "libmfxsw64";
		    aStringArray7631[4] = "twitchsdk_64_release";
		} else if (Class493.aString5527.startsWith("i386")
			   || Class493.aString5527.startsWith("i486")
			   || Class493.aString5527.startsWith("i586")
			   || Class493.aString5527.startsWith("x86")) {
		    aStringArray7631[3] = "libmfxsw32";
		    aStringArray7631[4] = "twitchsdk_32_release";
		} else {
		    anInt7630 = -701183499;
		    return -1;
		}
		aBoolArray7643 = new boolean[6];
		aBoolArray7643[0] = true;
		aBoolArray7643[1] = true;
		aBoolArray7643[2] = true;
		aBoolArray7643[3] = false;
		aBoolArray7643[4] = true;
		aBoolArray7643[5] = true;
	    } else {
		anInt7630 = -701183499;
		return -1;
	    }
	}
	anInt7630 = -233727833;
	return 0;
    }
    
    public static boolean method6952() {
	if (Class493.aString5525.startsWith("win"))
	    return true;
	return false;
    }
    
    public static boolean method6953() {
	if (Class493.aString5525.startsWith("win"))
	    return true;
	return false;
    }
    
    public static int method6954() {
	return anInt7630 * -244674793;
    }
    
    Class581() throws Throwable {
	throw new Error();
    }
    
    static void method6955(int i, int i_0_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_0_);
	Class571 class571 = twitcheventresult.method4837();
	if (class571 != null)
	    Class630.method7526(class571.method68(), twitcheventresult,
				1664203779);
    }
    
    static void method6956(int i, int i_1_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_1_);
	Class571 class571 = twitcheventresult.method4837();
	if (class571 != null)
	    Class630.method7526(class571.method68(), twitcheventresult,
				578728163);
    }
    
    static void method6957(int i, int i_2_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_2_);
	Class571 class571 = twitcheventresult.method4837();
	if (class571 != null)
	    Class630.method7526(class571.method68(), twitcheventresult,
				1550876031);
    }
    
    static void method6958(int i, int i_3_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_3_);
	Class571 class571 = twitcheventresult.method4837();
	if (class571 != null)
	    Class630.method7526(class571.method68(), twitcheventresult,
				1613270689);
    }
    
    static void method6959(int i, int i_4_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_4_);
	Class571 class571 = twitcheventresult.method4837();
	if (class571 != null)
	    Class630.method7526(class571.method68(), twitcheventresult,
				2112159845);
    }
    
    static void method6960() {
	if (null == aClass151_7645
	    || aClass151_7645.method1766() != aTwitchWebcamFrameData7639.width
	    || (aClass151_7645.method1767()
		!= aTwitchWebcamFrameData7639.height))
	    aClass151_7645 = (Class587.aClass173_7714.method2382
			      (aTwitchWebcamFrameData7639.buffer, 0,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.height, false));
	else
	    aClass151_7645.method1770(0, 0, aTwitchWebcamFrameData7639.width,
				      aTwitchWebcamFrameData7639.height,
				      aTwitchWebcamFrameData7639.buffer, 0,
				      aTwitchWebcamFrameData7639.width);
    }
    
    static void method6961() {
	if (null == aClass151_7645
	    || aClass151_7645.method1766() != aTwitchWebcamFrameData7639.width
	    || (aClass151_7645.method1767()
		!= aTwitchWebcamFrameData7639.height))
	    aClass151_7645 = (Class587.aClass173_7714.method2382
			      (aTwitchWebcamFrameData7639.buffer, 0,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.height, false));
	else
	    aClass151_7645.method1770(0, 0, aTwitchWebcamFrameData7639.width,
				      aTwitchWebcamFrameData7639.height,
				      aTwitchWebcamFrameData7639.buffer, 0,
				      aTwitchWebcamFrameData7639.width);
    }
    
    static void method6962() {
	if (null == aClass151_7645
	    || aClass151_7645.method1766() != aTwitchWebcamFrameData7639.width
	    || (aClass151_7645.method1767()
		!= aTwitchWebcamFrameData7639.height))
	    aClass151_7645 = (Class587.aClass173_7714.method2382
			      (aTwitchWebcamFrameData7639.buffer, 0,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.height, false));
	else
	    aClass151_7645.method1770(0, 0, aTwitchWebcamFrameData7639.width,
				      aTwitchWebcamFrameData7639.height,
				      aTwitchWebcamFrameData7639.buffer, 0,
				      aTwitchWebcamFrameData7639.width);
    }
    
    public static void method6963(boolean bool) {
	/* empty */
    }
    
    static void method6964() {
	if (null == aClass151_7645
	    || aClass151_7645.method1766() != aTwitchWebcamFrameData7639.width
	    || (aClass151_7645.method1767()
		!= aTwitchWebcamFrameData7639.height))
	    aClass151_7645 = (Class587.aClass173_7714.method2382
			      (aTwitchWebcamFrameData7639.buffer, 0,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.height, false));
	else
	    aClass151_7645.method1770(0, 0, aTwitchWebcamFrameData7639.width,
				      aTwitchWebcamFrameData7639.height,
				      aTwitchWebcamFrameData7639.buffer, 0,
				      aTwitchWebcamFrameData7639.width);
    }
    
    static void method6965() {
	if (null == aClass151_7645
	    || aClass151_7645.method1766() != aTwitchWebcamFrameData7639.width
	    || (aClass151_7645.method1767()
		!= aTwitchWebcamFrameData7639.height))
	    aClass151_7645 = (Class587.aClass173_7714.method2382
			      (aTwitchWebcamFrameData7639.buffer, 0,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.width,
			       aTwitchWebcamFrameData7639.height, false));
	else
	    aClass151_7645.method1770(0, 0, aTwitchWebcamFrameData7639.width,
				      aTwitchWebcamFrameData7639.height,
				      aTwitchWebcamFrameData7639.buffer, 0,
				      aTwitchWebcamFrameData7639.width);
    }
    
    public static void method6966(boolean bool) {
	/* empty */
    }
    
    public static void method6967() {
	aClass151_7645 = null;
    }
    
    static void method6968() {
	aTwitchWebcamDeviceArray7641
	    = Canvas_Sub1.aTwitchTV11693.GetWebcamDevices();
    }
    
    public static int method6969(int i) {
	aTwitchWebcamFrameData7639 = null;
	aClass151_7645 = null;
	if (i < 0 || i >= aTwitchWebcamDeviceArray7641.length)
	    return -1;
	return (Canvas_Sub1.aTwitchTV11693.StopWebcamDevice
		(-2005136543 * aTwitchWebcamDeviceArray7641[i].anInt1098));
    }
    
    static void method6970() {
	aTwitchWebcamDeviceArray7641
	    = Canvas_Sub1.aTwitchTV11693.GetWebcamDevices();
    }
    
    static void method6971() {
	aTwitchWebcamDeviceArray7641
	    = Canvas_Sub1.aTwitchTV11693.GetWebcamDevices();
    }
    
    public static boolean method6972() {
	return aBool7637;
    }
    
    public static void method6973(int i, int i_5_, int i_6_, int i_7_) {
	aLinkedList7640.addLast(new Class573(i, i_5_, i_6_ - i, i_7_ - i_5_));
    }
    
    public static void method6974() {
	aClass151_7645 = null;
    }
    
    public static boolean method6975() {
	if (Class493.aString5525.startsWith("win")) {
	    String string = "msvcr110.dll";
	    String string_8_ = "msvcp110.dll";
	    String[] strings = { string, string_8_ };
	    String string_9_ = System.getenv("WINDIR");
	    if ("" == string_9_)
		return false;
	    for (int i = 0; i < strings.length; i++) {
		File file
		    = new File(new StringBuilder().append(string_9_).append
				   ("\\system32\\").append
				   (strings[i]).toString());
		if (!file.exists() || file.isDirectory())
		    return false;
	    }
	    return true;
	}
	if (Class493.aString5525.startsWith("mac")) {
	    boolean bool;
	    try {
		Process process = Runtime.getRuntime().exec("ps -few");
		BufferedReader bufferedreader
		    = (new BufferedReader
		       (new InputStreamReader(process.getInputStream())));
		do {
		    boolean bool_10_;
		    try {
			int i = process.waitFor();
			if (i == 0)
			    break;
			bool_10_ = false;
		    } catch (InterruptedException interruptedexception) {
			return false;
		    }
		    return bool_10_;
		} while (false);
		boolean bool_11_ = false;
	    while_12_:
		do {
		    String string;
		    do {
			if ((string = bufferedreader.readLine()) == null)
			    break while_12_;
		    } while (string.toLowerCase().indexOf("soundflowerbed")
			     == -1);
		    bool_11_ = true;
		} while (false);
		bufferedreader.close();
		bool = bool_11_;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	return false;
    }
    
    static void method6976(byte i) {
	Class326_Sub2 class326_sub2
	    = ((Class326_Sub2)
	       Class71.aClass283_Sub1_774.method3811(-1321324362));
	Class684_Sub4 class684_sub4
	    = ((Class684_Sub4)
	       Class71.aClass283_Sub1_774.method3785((byte) -28));
	Class422 class422 = class326_sub2.method4236((byte) 103);
	Class430 class430 = class684_sub4.method10117(-1505696792);
	if (null != client.aClass229_11027) {
	    int i_12_ = client.aClass229_11027.anInt2476 * -1352480433;
	    int i_13_ = 1661025435 * client.aClass229_11027.anInt2458;
	    float f = 1000.0F;
	    float f_14_ = (float) (2.0 * Math.atan(i_12_
							     / 2.0F / f));
	    float f_15_ = (float) (2.0 * Math.atan(i_13_
							     / 2.0F / f));
	    try {
		Class71.aClass283_Sub1_774.method3776(f_14_, f_15_, 200548057);
	    } catch (Exception_Sub4 exception_sub4) {
		/* empty */
	    }
	}
	if (Class95_Sub1_Sub2.aClass537_11200.method6505((byte) 117)) {
	    Class430 class430_16_ = Class430.method5188();
	    class430_16_.method5168(1.0F, 0.0F, 0.0F,
				    ((Class95_Sub1_Sub2
						  .aClass537_11200
						  .method6504((byte) 30)
					      - 2104599061 * Class71.anInt773)
				     / 200.0F));
	    class430.method5176(class430_16_);
	    Class422 class422_17_ = Class422.method5051(0.0F, 1.0F, 0.0F);
	    class422_17_.method5075(class430);
	    Class430 class430_18_ = Class430.method5188();
	    class430_18_.method5167(class422_17_,
				    ((-661900155 * Class71.anInt775
					      - Class95_Sub1_Sub2
						    .aClass537_11200
						    .method6507(-746166485))
				     / 200.0F));
	    class430.method5176(class430_18_);
	    class684_sub4.method10110(class430, -899325525);
	}
	Class71.anInt775
	    = (Class95_Sub1_Sub2.aClass537_11200.method6507(-618687332)
	       * -970742707);
	Class71.anInt773
	    = (Class95_Sub1_Sub2.aClass537_11200.method6504((byte) -74)
	       * -1102045891);
	class430.method5170();
	if (Class416.aClass544_4749.method6644(98, -215869729)) {
	    Class422 class422_19_ = Class422.method5051(0.0F, 0.0F, 25.0F);
	    class422_19_.method5075(class430);
	    class422_19_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_19_);
	}
	if (Class416.aClass544_4749.method6644(99, -506983270)) {
	    Class422 class422_20_ = Class422.method5051(0.0F, 0.0F, -25.0F);
	    class422_20_.method5075(class430);
	    class422_20_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_20_);
	}
	if (Class416.aClass544_4749.method6644(96, 146621449)) {
	    Class422 class422_21_ = Class422.method5051(-25.0F, 0.0F, 0.0F);
	    class422_21_.method5075(class430);
	    class422_21_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_21_);
	}
	if (Class416.aClass544_4749.method6644(97, -1402249726)) {
	    Class422 class422_22_ = Class422.method5051(25.0F, 0.0F, 0.0F);
	    class422_22_.method5075(class430);
	    class422_22_.aFloat4776 *= -1.0F;
	    class422.method5063(class422_22_);
	}
	Class528_Sub19 class528_sub19
	    = new Class528_Sub19(0, (int) class422.aFloat4780,
				 (int) class422.aFloat4776,
				 (int) class422.aFloat4777);
	class326_sub2.method9108(class528_sub19, 1555890467);
	Class578 class578 = client.aClass495_10935.method5966(1273279609);
	int i_23_ = class578.anInt7607 * 961465569 << 9;
	int i_24_ = -173815201 * class578.anInt7608 << 9;
	Class71.aClass283_Sub1_774.method3760(0.02F,
					      (client.aClass495_10935
						   .method6024
					       (-765386834)
					       .anIntArrayArrayArray5087),
					      client.aClass495_10935
						  .method6006((byte) 0),
					      i_23_, i_24_, -2137352661);
    }
    
    static void method6977(String string, int i) {
	Class75.aClass689_790 = Class689.aClass689_8661;
	Class43.aString529 = string;
    }
    
    static final void method6978(Class648 class648, int i) {
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = (Class495.aClass283_Sub1_5578.method3787((byte) -94) == null ? -1
	       : (Class495.aClass283_Sub1_5578.method3787((byte) -46).anInt3252
		  * 1961095325));
    }
}
