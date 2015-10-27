/* Class703 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;


public class Class703 implements Iterator
{
    Node aClass528_8744 = null;
    Node aClass528_8745;
    Class688 aClass688_8746;
    
    public Object method8227() {
	Node node = this.aClass528_8745;
	if (this.aClass688_8746.aClass528_8655 == node) {
	    node = null;
	    this.aClass528_8745 = null;
	} else
	    this.aClass528_8745 = node.aClass528_7106;
	this.aClass528_8744 = node;
	return node;
    }
    
    public void method8228(Class688 class688, int i) {
	this.aClass688_8746 = class688;
	this.aClass528_8745
	    = this.aClass688_8746.aClass528_8655.aClass528_7106;
	this.aClass528_8744 = null;
    }
    
    void method8229(byte i) {
	this.aClass528_8745
	    = this.aClass688_8746.aClass528_8655.aClass528_7106;
	this.aClass528_8744 = null;
    }
    
    public Node method8230(int i) {
	method8229((byte) 14);
	return (Node) next();
    }
    
    @Override
	public void remove() {
	if (this.aClass528_8744 == null)
	    throw new IllegalStateException();
	this.aClass528_8744.method6443(-699990272);
	this.aClass528_8744 = null;
    }
    
    @Override
	public boolean hasNext() {
	return (this.aClass688_8746.aClass528_8655
		!= this.aClass528_8745);
    }
    
    public Node method8231() {
	method8229((byte) 20);
	return (Node) next();
    }
    
    @Override
	public Object next() {
	Node node = this.aClass528_8745;
	if (this.aClass688_8746.aClass528_8655 == node) {
	    node = null;
	    this.aClass528_8745 = null;
	} else
	    this.aClass528_8745 = node.aClass528_7106;
	this.aClass528_8744 = node;
	return node;
    }
    
    public void method8232() {
	if (this.aClass528_8744 == null)
	    throw new IllegalStateException();
	this.aClass528_8744.method6443(2028483411);
	this.aClass528_8744 = null;
    }
    
    public boolean method8233() {
	return (this.aClass688_8746.aClass528_8655
		!= this.aClass528_8745);
    }
    
    public boolean method8234() {
	return (this.aClass688_8746.aClass528_8655
		!= this.aClass528_8745);
    }
    
    public void method8235() {
	if (this.aClass528_8744 == null)
	    throw new IllegalStateException();
	this.aClass528_8744.method6443(2035717102);
	this.aClass528_8744 = null;
    }
    
    void method8236() {
	this.aClass528_8745
	    = this.aClass688_8746.aClass528_8655.aClass528_7106;
	this.aClass528_8744 = null;
    }
    
    void method8237() {
	this.aClass528_8745
	    = this.aClass688_8746.aClass528_8655.aClass528_7106;
	this.aClass528_8744 = null;
    }
    
    public Node method8238() {
	method8229((byte) 52);
	return (Node) next();
    }
    
    public Class703(Class688 class688) {
	this.aClass688_8746 = class688;
	this.aClass528_8745
	    = this.aClass688_8746.aClass528_8655.aClass528_7106;
	this.aClass528_8744 = null;
    }
    
    static final void method8239(Class648 class648, byte i) {
	int i_0_
	    = (class648.anIntArray8394
	       [(class648.anInt8395 -= 1239022665) * 717927929]);
	ItemType itemType
	    = (ItemType) Class18.aClass5_Sub13_206.method63(i_0_, -1228029410);
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = itemType.aBool89 ? 1 : 0;
    }
    
    static final void method8240(Class648 class648, byte i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub8_10565,
	     (class648.anIntArray8394
	      [(class648.anInt8395 -= 1239022665) * 717927929]),
	     -60611600);
	client.gameScene.method5989(2016078152);
	Class243.method3387(2147184020);
	client.aBool11161 = false;
    }
    
    static void method8241(Class648 class648, byte i) {
	class648.anInt8395 -= -1816921966;
	int i_1_ = (class648.anIntArray8394
		    [class648.anInt8395 * 717927929]);
	int i_2_ = (class648.anIntArray8394
		    [1 + 717927929 * class648.anInt8395]);
	TwitchWebcamDevice twitchwebcamdevice
	    = Class264.method3658(i_1_, (byte) 2);
	TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
	if (twitchwebcamdevice != null)
	    twitchwebcamdevicecapability = twitchwebcamdevice.method1178(i_2_);
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
		= twitchwebcamdevicecapability.anInt1106 * 555645557;
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
		= 2128534695 * twitchwebcamdevicecapability.anInt1110;
	}
    }
    
    static int method8242(Class528_Sub21_Sub11 class528_sub21_sub11,
			  Class1 class1, int i) {
	String string
	    = Class511_Sub6.method9344(class528_sub21_sub11, (byte) -106);
	int[] is = Class62.method1022(class528_sub21_sub11, (byte) 54);
	if (null != is)
	    string = new StringBuilder().append(string).append
			 (Class262.method3645(is, (byte) 52)).toString();
	int i_3_
	    = class1.method504(string, Class298.aClass151Array3262, (byte) 99);
	if (class528_sub21_sub11.aBool11592)
	    i_3_ += Class27.aClass151_256.method1766() + 4;
	return i_3_;
    }
}
