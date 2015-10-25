/* Class527 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;


public class Class527
{
    int[] anIntArray7096;
    int anInt7097;
    int anInt7098;
    int[] anIntArray7099;
    LinkedList aLinkedList7100;
    public Class157 aClass157_7101;
    static int anInt7102 = 0;
    boolean aBool7103;
    public static Class95_Sub1_Sub1 aClass95_Sub1_Sub1_7104;
    
    public void method6417(Class538 class538, int i) {
	if (null != class538 && null != this.aLinkedList7100) {
	    Iterator iterator = this.aLinkedList7100.iterator();
	    while (iterator.hasNext()) {
		Class645_Sub1_Sub5_Sub5 class645_sub1_sub5_sub5
		    = (Class645_Sub1_Sub5_Sub5) iterator.next();
		class538.method6556(class645_sub1_sub5_sub5.aByte10675,
				    class645_sub1_sub5_sub5.aShort11747,
				    class645_sub1_sub5_sub5.aShort11745,
				    new Class522(class645_sub1_sub5_sub5),
				    -739272912);
	    }
	}
    }
    
    Class157 method6418(Class173 class173, int i) {
	Class177 class177
	    = Class177.method2590(Class287.aClass446_3161,
				  1388121779 * this.anInt7097, 0);
	if (class177 == null)
	    return null;
	if (class177.anInt2035 < 13)
	    class177.method2585(2);
	return class173.method2244(class177, 2048, -1817347227 * anInt7102, 64,
				   768);
    }
    
    public void method6419(Class538 class538, byte i) {
	if (null != class538 && this.anInt7098 * 1318942069 > 0) {
	    method6420(class538, (byte) -90);
	    Iterator iterator = this.aLinkedList7100.iterator();
	    while (iterator.hasNext()) {
		Class645_Sub1_Sub5_Sub5 class645_sub1_sub5_sub5
		    = (Class645_Sub1_Sub5_Sub5) iterator.next();
		class538.method6545(class645_sub1_sub5_sub5, false,
				    1612014468);
	    }
	    this.aBool7103 = true;
	}
    }
    
    void method6420(Class538 class538, byte i) {
	this.aLinkedList7100 = new LinkedList();
	Class466 class466 = client.aClass495_10935.method6006((byte) 0);
	Class578 class578 = client.aClass495_10935.method5966(1273279609);
	Class578 class578_0_
	    = new Class578(Class181_Sub5.anInt9778 * 1926870089,
			   this.anIntArray7099[0],
			   this.anIntArray7096[0]);
	for (int i_1_ = 1; i_1_ < this.anInt7098 * 1318942069;
	     i_1_++) {
	    Class578 class578_2_
		= new Class578(1926870089 * Class181_Sub5.anInt9778,
			       this.anIntArray7099[i_1_],
			       this.anIntArray7096[i_1_]);
	    while ((961465569 * class578_0_.anInt7607
		    != 961465569 * class578_2_.anInt7607)
		   || (-173815201 * class578_2_.anInt7608
		       != -173815201 * class578_0_.anInt7608)) {
		if (class578_0_.anInt7607 * 961465569
		    < class578_2_.anInt7607 * 961465569)
		    class578_0_.anInt7607 += 2080077601;
		else if (961465569 * class578_0_.anInt7607
			 > 961465569 * class578_2_.anInt7607)
		    class578_0_.anInt7607 -= 2080077601;
		if (class578_0_.anInt7608 * -173815201
		    < class578_2_.anInt7608 * -173815201)
		    class578_0_.anInt7608 += -615837281;
		else if (class578_0_.anInt7608 * -173815201
			 > -173815201 * class578_2_.anInt7608)
		    class578_0_.anInt7608 -= -615837281;
		int i_3_ = 1926870089 * Class181_Sub5.anInt9778;
		int i_4_ = (961465569 * class578_0_.anInt7607
			    - class578.anInt7607 * 961465569);
		int i_5_ = (-173815201 * class578_0_.anInt7608
			    - class578.anInt7608 * -173815201);
		if (i_4_ >= 0 && i_4_ < -1102718643 * class538.anInt7158
		    && i_5_ >= 0 && i_5_ < class538.anInt7159 * -532233529) {
		    int i_6_ = 256 + (i_4_ << 9);
		    int i_7_ = 256 + (i_5_ << 9);
		    if (class466.method5633(i_4_, i_5_, (short) 4875))
			i_3_++;
		    this.aLinkedList7100.add
			(new Class645_Sub1_Sub5_Sub5
			 (class538, this, Class181_Sub5.anInt9778 * 1926870089,
			  i_3_, i_6_,
			  Class335_Sub1_Sub1.method10374(i_6_, i_7_,
							 (1926870089
							  * (Class181_Sub5
							     .anInt9778)),
							 -759833206),
			  i_7_));
		}
	    }
	    class578_0_ = class578_2_;
	}
    }
    
    public void method6421(byte i) {
	this.aBool7103 = false;
	aClass157_7101 = null;
    }
    
    public boolean method6422(int i) {
	return this.aBool7103;
    }
    
    public boolean method6423() {
	return this.aBool7103;
    }
    
    public static void method6424(int i) {
	anInt7102 = 440417901 * i;
    }
    
    public Class527(Class173 class173, ByteBuffer class528_sub42, int i) {
	this.anInt7097 = 338055291 * i;
	this.anInt7098
	    = class528_sub42.method9640(-1941807432) * -1899629859;
	this.anIntArray7099
	    = new int[1318942069 * this.anInt7098];
	this.anIntArray7096
	    = new int[1318942069 * this.anInt7098];
	int i_8_ = class528_sub42.readUnsignedShort(-1544834263);
	int i_9_ = class528_sub42.readUnsignedShort(-19606927);
	for (int i_10_ = 0; i_10_ < 1318942069 * this.anInt7098;
	     i_10_++) {
	    this.anIntArray7099[i_10_]
		= i_8_ + class528_sub42.method9627(-1765020066);
	    this.anIntArray7096[i_10_]
		= i_9_ + class528_sub42.method9627(-1877365953);
	}
	aClass157_7101 = method6418(class173, 1587708285);
    }
    
    public boolean method6425(Class173 class173, int i) {
	aClass157_7101 = method6418(class173, 1094364840);
	return aClass157_7101 != null;
    }
    
    public static void method6426(int i) {
	anInt7102 = 440417901 * i;
    }
    
    public void method6427() {
	this.aBool7103 = false;
	aClass157_7101 = null;
    }
    
    public static void method6428(int i) {
	anInt7102 = 440417901 * i;
    }
    
    public boolean method6429() {
	return this.aBool7103;
    }
    
    public void method6430() {
	this.aBool7103 = false;
	aClass157_7101 = null;
    }
    
    public boolean method6431() {
	return this.aBool7103;
    }
    
    public static int method6432(int i, int i_11_, byte i_12_) {
	Class581.aTwitchWebcamFrameData7639 = new TwitchWebcamFrameData();
	if (i < 0 || i >= Class581.aTwitchWebcamDeviceArray7641.length)
	    return -1;
	return (Canvas_Sub1.aTwitchTV11693.StartWebcamDevice
		((-2005136543
		  * Class581.aTwitchWebcamDeviceArray7641[i].anInt1098),
		 i_11_));
    }
    
    static final void method6433(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.anInt2406
	    = ((class648.anIntArray8394
		[(class648.anInt8395 -= 1239022665) * 717927929])
	       * -1305479987);
	Class39.method811(class229, 1435904523);
    }
    
    static Class147[] method6434(int i) {
	return (new Class147[]
		{ Class147.aClass147_1671, Class147.aClass147_1668,
		  Class147.aClass147_1666, Class147.aClass147_1669,
		  Class147.aClass147_1670, Class147.aClass147_1665,
		  Class147.aClass147_1667 });
    }
    
    static final void method6435(Class648 class648, int i) {
	if ((Class495.aClass283_Sub1_5578.method3787((byte) -17)
	     != Class297.aClass297_3251)
	    || (Class495.aClass283_Sub1_5578.method3786((byte) 84)
		!= Class294.aClass294_3225))
	    throw new RuntimeException();
	Class422 class422
	    = ((Class326_Sub1)
	       Class495.aClass283_Sub1_5578.method3811(887996827))
		  .method9088((byte) 3);
	Class422 class422_13_
	    = ((Class684_Sub1)
	       Class495.aClass283_Sub1_5578.method3785((byte) -31))
		  .method10056(-1440072680);
	Class422 class422_14_ = Class422.method5052(class422);
	class422_14_.method5055(class422_13_);
	float f = Class535.method6496(class422_14_.aFloat4780,
				      class422_14_.aFloat4777, -1571579763);
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = (int) (2607.5945876176133 * f) & 0x3fff;
    }
}
