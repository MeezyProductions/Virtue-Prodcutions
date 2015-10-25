/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.LinkedList;

public class Class207
{

    Interface24 anInterface24_2232;
    int anInt2233 = -1087543941;
    LinkedList aLinkedList2234 = new LinkedList();
    long aLong2235;
    public static Frame aFrame2236;
    static Class5_Sub4 aClass5_Sub4_2237;
    
    public Class207(ByteBuffer class528_sub42, Interface24 interface24) {
	this.anInterface24_2232 = interface24;
	this.aLong2235
	    = class528_sub42.method9633(771973092) * 8981507744125862559L;
	this.anInt2233
	    = class528_sub42.readInt(-669805546) * 1087543941;
	for (int i = class528_sub42.readUnsignedByte((byte) 90); i != 0;
	     i = class528_sub42.readUnsignedByte((byte) 27)) {
	    Class230 class230
		= ((Class230)
		   Class443.method5321(Class230.method3235(-447059813), i,
				       1846443180));
	    Interface25 interface25;
	    switch (-1983112805 * class230.anInt2563) {
	    case 13:
		interface25 = new Class235(this, class528_sub42);
		break;
	    case 2:
		interface25 = new Class203(this, class528_sub42);
		break;
	    case 7:
		interface25 = new Class211(this, class528_sub42);
		break;
	    case 6:
		interface25 = new Class238(this, class528_sub42);
		break;
	    case 3:
		interface25 = new Class225(this, class528_sub42);
		break;
	    case 1:
		interface25 = new Class206(this, class528_sub42);
		break;
	    case 8:
		interface25 = new Class209(this, class528_sub42);
		break;
	    case 10:
		interface25 = new Class219(this);
		break;
	    case 12:
		interface25 = new Class233(this);
		break;
	    case 9:
		interface25 = new Class212(this, class528_sub42);
		break;
	    case 11:
		interface25 = new Class214(this, class528_sub42);
		break;
	    case 5:
		interface25 = new Class236(this, class528_sub42);
		break;
	    default:
		throw new IllegalStateException("");
	    case 4:
		interface25 = new PacketDecoder(this, class528_sub42);
		break;
	    case 0:
		interface25 = new Class224(this, class528_sub42);
	    }
	    this.aLinkedList2234.add(interface25);
	}
    }
    
    public void method2925(Class216 class216, int i) {
	if ((-350815217910761041L * class216.aLong2275
	     != 7348956240272677215L * this.aLong2235)
	    || (class216.method3020(-1128762047)
		!= this.anInt2233 * -2026418611))
	    throw new IllegalStateException("");
	Iterator iterator = this.aLinkedList2234.iterator();
	while (iterator.hasNext()) {
	    Interface25 interface25 = (Interface25) iterator.next();
	    interface25.method140(class216, -2093412763);
	}
	class216.method3021(-880420621);
    }
    
    public void method2926(Class216 class216) {
	if ((-350815217910761041L * class216.aLong2275
	     != 7348956240272677215L * this.aLong2235)
	    || (class216.method3020(-1128762047)
		!= this.anInt2233 * -2026418611))
	    throw new IllegalStateException("");
	Iterator iterator = this.aLinkedList2234.iterator();
	while (iterator.hasNext()) {
	    Interface25 interface25 = (Interface25) iterator.next();
	    interface25.method140(class216, -2093412763);
	}
	class216.method3021(-296658457);
    }
    
    public static int[] method2927(BufferedImage bufferedimage, int i) {
	if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
	    int[] is = null;
	    is = bufferedimage.getRaster().getPixels(0, 0,
						     bufferedimage.getWidth(),
						     bufferedimage.getHeight(),
						     is);
	    int[] is_0_
		= (new int
		   [bufferedimage.getWidth() * bufferedimage.getHeight()]);
	    if (bufferedimage.getType() == 10) {
		for (int i_1_ = 0; i_1_ < is_0_.length; i_1_++)
		    is_0_[i_1_] = -16777216 + ((is[i_1_] << 8)
					       + (is[i_1_] << 16) + is[i_1_]);
	    } else {
		for (int i_2_ = 0; i_2_ < is_0_.length; i_2_++) {
		    int i_3_ = 2 * i_2_;
		    is_0_[i_2_] = ((is[i_3_] << 16) + (is[i_3_] << 8)
				   + (is[i_3_] + (is[1 + i_3_] << 24)));
		}
	    }
	    return is_0_;
	}
	return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(),
				    bufferedimage.getHeight(), null, 0,
				    bufferedimage.getWidth());
    }
    
    static void method2928(byte i) {
	/* empty */
    }
    
    static final void method2929(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	String string = (String) (class648.anObjectArray8396
				  [(class648.anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2524
	    = Class181_Sub23.method8999(string, class648, (byte) -29);
	class229.aBool2483 = true;
    }
    
    static final void method2930(Class648 class648, byte i) {
	class648.anInt8395 -= -577899301;
	int i_4_ = (class648.anIntArray8394
		    [717927929 * class648.anInt8395]);
	int i_5_ = (class648.anIntArray8394
		    [1 + class648.anInt8395 * 717927929]);
	int i_6_ = (class648.anIntArray8394
		    [2 + class648.anInt8395 * 717927929]);
	Class528_Sub21_Sub4 class528_sub21_sub4
	    = Class33.aClass46_314.method861(i_4_, (byte) -45);
	if ((class528_sub21_sub4.method10469(i_5_, (byte) 1).anInt8181
	     * -1583454915)
	    != 0)
	    throw new RuntimeException("");
	class648.anIntArray8394
	    [(class648.anInt8395 += 1239022665) * 717927929 - 1]
	    = class528_sub21_sub4.method10470(i_5_, i_6_, (byte) 1);
    }
    
    public static void method2931(int i, String string, boolean bool,
				  byte i_7_) {
	if (Class445_Sub5.method9223(-434309488)) {
	    if (1871118701 * Class54.anInt631 != i)
		Class54.aLong632 = 7408127865711447937L;
	    Class54.anInt631 = -1168625563 * i;
	    Class54.aString640 = string;
	    Class54.aBool671 = bool;
	    Class487.method5890(2, 2130003981);
	}
    }
}
