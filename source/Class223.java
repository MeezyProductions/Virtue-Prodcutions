/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

class Class223 implements Interface69
{
    static Class381 aClass381_2327;
    Class218 this$0;
    
    @Override
	public void method466(Interface67 interface67, int i, int i_0_,
			  boolean bool) {
	this.this$0.method3082((byte) -68).add(interface67);
	if (bool)
	    this.this$0.method3084(527219053)
		.method2729(interface67, i_0_);
	else
	    this.this$0.method3083(-1181883724).method2730
		(interface67, i_0_, interface67.method414(1875156863),
		 -1226267209);
    }
    
    @Override
	public void method465(Interface67 interface67, int i, int i_1_,
			  boolean bool, int i_2_) {
	this.this$0.method3082((byte) -66).add(interface67);
	if (bool)
	    this.this$0.method3084(-1098369501)
		.method2729(interface67, i_1_);
	else
	    this.this$0.method3083(-1181883724).method2730
		(interface67, i_1_, interface67.method414(1426900927),
		 -1226267209);
    }
    
    @Override
	public void method462(Interface67 interface67, byte i) {
	if (null != interface67)
	    this.this$0.method3083(-1181883724)
		.method2727(interface67.method415((byte) -69));
    }
    
    @Override
	public void method468(Interface67 interface67) {
	if (null != interface67)
	    this.this$0.method3083(-1181883724)
		.method2727(interface67.method415((byte) -103));
    }
    
    @Override
	public void method464(Interface67 interface67, int i, int i_3_,
			  boolean bool) {
	this.this$0.method3082((byte) -122).add(interface67);
	if (bool)
	    this.this$0.method3084(-800322992)
		.method2729(interface67, i_3_);
	else
	    this.this$0.method3083(-1181883724).method2730
		(interface67, i_3_, interface67.method414(667017441),
		 -1226267209);
    }
    
    @Override
	public void method463(Interface67 interface67, int i, int i_4_,
			  boolean bool) {
	this.this$0.method3082((byte) -29).add(interface67);
	if (bool)
	    this.this$0.method3084(-358728567)
		.method2729(interface67, i_4_);
	else
	    this.this$0.method3083(-1181883724).method2730
		(interface67, i_4_, interface67.method414(873581468),
		 -1226267209);
    }
    
    Class223(Class218 class218) {
	this.this$0 = class218;
    }
    
    @Override
	public void method461(Interface67 interface67) {
	if (null != interface67)
	    this.this$0.method3083(-1181883724)
		.method2727(interface67.method415((byte) -18));
    }
    
    @Override
	public void method467(Interface67 interface67, int i, int i_5_,
			  boolean bool) {
	this.this$0.method3082((byte) -57).add(interface67);
	if (bool)
	    this.this$0.method3084(-1923951066)
		.method2729(interface67, i_5_);
	else
	    this.this$0.method3083(-1181883724).method2730
		(interface67, i_5_, interface67.method414(984612522),
		 -1226267209);
    }
    
    @Override
	public void method469(Interface67 interface67) {
	if (null != interface67)
	    this.this$0.method3083(-1181883724)
		.method2727(interface67.method415((byte) -5));
    }
    
    public static final void method3159(int i) {
	Class54.stage = -1245312932;
	Class54.anInt669 = 592408594;
	Class54.anInt668 = -762511274;
    }
    
    public static Class23 method3160(String string, String string_6_,
				     boolean bool, byte i) {
	File file = new File(Class109.aFile1396,
			     new StringBuilder().append("preferences").append
				 (string).append
				 (".dat").toString());
	do {
	    if (file.exists()) {
		Class23 class23;
		try {
		    Class23 class23_7_ = new Class23(file, "rw", 10000L);
		    class23 = class23_7_;
		} catch (IOException ioexception) {
		    break;
		}
		return class23;
	    }
	} while (false);
	String string_8_ = "";
	if (33 == -816626719 * Class517.anInt6971)
	    string_8_ = "_rc";
	else if (34 == -816626719 * Class517.anInt6971)
	    string_8_ = "_wip";
	File file_9_ = new File(Class700.aString8735,
				new StringBuilder().append("jagex_").append
				    (string_6_).append
				    ("_preferences").append
				    (string).append
				    (string_8_).append
				    (".dat").toString());
	do {
	    if (!bool && file_9_.exists()) {
		Class23 class23;
		try {
		    Class23 class23_10_ = new Class23(file_9_, "rw", 10000L);
		    class23 = class23_10_;
		} catch (IOException ioexception) {
		    break;
		}
		return class23;
	    }
	} while (false);
	Class23 class23;
	try {
	    Class23 class23_11_ = new Class23(file, "rw", 10000L);
	    class23 = class23_11_;
	} catch (IOException ioexception) {
	    throw new RuntimeException();
	}
	return class23;
    }
    
    static boolean method3161(TwitchEvent twitchevent, long l) {
	if (!Class581.aBool7648) {
	    switch (twitchevent.eventType) {
	    case 7:
	    case 8:
	    case 9:
		return false;
	    }
	}
	if (twitchevent.eventType == 33) {
	    if (Class581.aTwitchWebcamFrameData7639 == null)
		return false;
	    int i = ((TwitchEventResult) twitchevent).result;
	    int i_12_ = (Canvas_Sub1.aTwitchTV11693.GetWebcamFrameData
			 (i, Class581.aTwitchWebcamFrameData7639));
	    if (0 == i_12_) {
		if (Class581.aBool7646)
		    Class581.aTwitchWebcamFrameData7639.method8243();
		if (Class581.aBool7647)
		    Class581.aTwitchWebcamFrameData7639.method8244();
		Class313.method4148(1508172368);
		Class581.aLong7619 = -7131929054418058949L * l;
		Class385.method4735(33, 0, (byte) 8);
	    } else
		Class581.aClass151_7645 = null;
	    return false;
	}
	if (twitchevent.eventType == 30) {
	    int i = ((TwitchEventResult) twitchevent).result;
	    if (i == 0 || 1 == i)
		ScenePacketType.method4842(-1609162629);
	    else if (i == 2)
		Class581.aLong7619 = l * -7131929054418058949L;
	}
	if (twitchevent.eventType == 34) {
	    Class427.aTwitchEventLiveStreams4800
		= (TwitchEventLiveStreams) twitchevent;
	    Class385.method4735(34, 0, (byte) -89);
	}
	return true;
    }
    
    public static void method3162(byte i) {
	if (Class176.method2569(-789745823))
	    Class498.method6070(new Class625(), -800172601);
    }
    
    static final void method3163(Class648 class648, int i) {
	int i_13_
	    = (class648.anIntArray8394
	       [(class648.anInt8395 -= 1239022665) * 717927929]);
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub23_10606
		  .method8126(i_13_, -1955030095);
    }
    
    static final void method3164(Class648 class648, int i) {
	Class95.method1262(class648.aClass645_Sub1_Sub5_Sub1_8389,
			   (class648.anIntArray8394
			    [((class648.anInt8395 -= 1239022665)
			      * 717927929)]),
			   true, 2147114441);
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) client.aFloatArray10888[0];
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) client.aFloatArray10888[1];
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) client.aFloatArray10888[2];
    }
    
    static Class85[] method3165(int i) {
	return new Class85[] { Class85.aClass85_847, Class85.aClass85_845,
			       Class85.aClass85_844, Class85.aClass85_831,
			       Class85.aClass85_839, Class85.aClass85_841,
			       Class85.aClass85_832, Class85.aClass85_849,
			       Class85.aClass85_829, Class85.aClass85_851,
			       Class85.aClass85_830, Class85.aClass85_854,
			       Class85.aClass85_850, Class85.aClass85_833,
			       Class85.aClass85_848, Class85.aClass85_837,
			       Class85.aClass85_835, Class85.aClass85_838,
			       Class85.aClass85_834, Class85.aClass85_826,
			       Class85.aClass85_846, Class85.aClass85_828,
			       Class85.aClass85_842, Class85.aClass85_853,
			       Class85.aClass85_843, Class85.aClass85_840,
			       Class85.aClass85_836, Class85.aClass85_824,
			       Class85.aClass85_827, Class85.aClass85_852,
			       Class85.aClass85_825 };
    }
    
    static final void method3166(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (class648.anObjectArray8396
				  [(class648.anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2512
	    = Class181_Sub23.method8999(string, class648, (byte) 34);
	class229.aBool2483 = true;
    }
    
    static final void method3167(Class648 class648, int i) {
	class648.anInt8410 -= -1094513834;
	String string
	    = (String) (class648.anObjectArray8396
			[class648.anInt8410 * -520794877]);
	String string_14_
	    = (String) (class648.anObjectArray8396
			[class648.anInt8410 * -520794877 + 1]);
	if ((class648.anIntArray8394
	     [(class648.anInt8395 -= 1239022665) * 717927929])
	    == 1)
	    class648.anObjectArray8396
		[((class648.anInt8410 += 1600226731) * -520794877
		  - 1)]
		= string;
	else
	    class648.anObjectArray8396
		[((class648.anInt8410 += 1600226731) * -520794877
		  - 1)]
		= string_14_;
    }
    
    static final void method3168(Class648 class648, byte i)
	throws Exception_Sub4 {
	class648.anInt8395 -= -1816921966;
	int i_15_ = (class648.anIntArray8394
		     [717927929 * class648.anInt8395]);
	float f = ((class648.anIntArray8394
			    [1 + 717927929 * class648.anInt8395])
		   / 1000.0F);
	Class495.aClass283_Sub1_5578.method3778(i_15_, f, 1349187979);
    }
}
