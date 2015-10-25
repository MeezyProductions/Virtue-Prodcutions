/* Class181_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class181_Sub18 extends Class181
{
    int anInt9842;
    int anInt9843;
    int anInt9844;
    int anInt9845;
    int anInt9846;
    public static int anInt9847;
    
    public void method2675(byte i) {
	Entity class645_sub1_sub5_sub1
	    = Class185.aClass182Array2106
		  [((Class181_Sub18) this).anInt9842 * 985864497]
		  .method2689(-1012043543);
	class645_sub1_sub5_sub1.method10683
	    (((Class181_Sub18) this).anInt9843 * 1496100791,
	     ((Class181_Sub18) this).anInt9844 * -1070623519,
	     ((Class181_Sub18) this).anInt9845 * -1155193149,
	     1624043129 * ((Class181_Sub18) this).anInt9846, client.anInt11127,
	     0, (short) -30815);
    }
    
    Class181_Sub18(ByteBuffer class528_sub42) {
	super(class528_sub42);
	((Class181_Sub18) this).anInt9842
	    = class528_sub42.readUnsignedShort(495674831) * -696016943;
	int i = class528_sub42.readUnsignedByte((byte) 22);
	if (0 != (i & 0x1)) {
	    ((Class181_Sub18) this).anInt9843
		= class528_sub42.readUnsignedShort(225049832) * 1322147335;
	    ((Class181_Sub18) this).anInt9844
		= class528_sub42.readUnsignedShort(-347171305) * 2115546913;
	} else {
	    ((Class181_Sub18) this).anInt9843 = -1322147335;
	    ((Class181_Sub18) this).anInt9844 = -2115546913;
	}
	if (0 != (i & 0x2)) {
	    ((Class181_Sub18) this).anInt9845
		= class528_sub42.readUnsignedShort(-1997632936) * -949208597;
	    ((Class181_Sub18) this).anInt9846
		= class528_sub42.readUnsignedShort(-1918441677) * 1828854729;
	} else {
	    ((Class181_Sub18) this).anInt9845 = 949208597;
	    ((Class181_Sub18) this).anInt9846 = -1828854729;
	}
	if ((i & 0x4) != 0) {
	    int i_0_ = class528_sub42.readUnsignedShort(-1741135727);
	    int i_1_ = class528_sub42.readUnsignedShort(-824401111);
	    int i_2_ = 255 * i_0_ / i_1_;
	    if (i_0_ > 0 && i_2_ < 1) {
		boolean bool = true;
	    }
	}
    }
    
    public void method2681() {
	Entity class645_sub1_sub5_sub1
	    = Class185.aClass182Array2106
		  [((Class181_Sub18) this).anInt9842 * 985864497]
		  .method2689(-1012043543);
	class645_sub1_sub5_sub1.method10683
	    (((Class181_Sub18) this).anInt9843 * 1496100791,
	     ((Class181_Sub18) this).anInt9844 * -1070623519,
	     ((Class181_Sub18) this).anInt9845 * -1155193149,
	     1624043129 * ((Class181_Sub18) this).anInt9846, client.anInt11127,
	     0, (short) -13061);
    }
    
    public void method2678() {
	Entity class645_sub1_sub5_sub1
	    = Class185.aClass182Array2106
		  [((Class181_Sub18) this).anInt9842 * 985864497]
		  .method2689(-1012043543);
	class645_sub1_sub5_sub1.method10683
	    (((Class181_Sub18) this).anInt9843 * 1496100791,
	     ((Class181_Sub18) this).anInt9844 * -1070623519,
	     ((Class181_Sub18) this).anInt9845 * -1155193149,
	     1624043129 * ((Class181_Sub18) this).anInt9846, client.anInt11127,
	     0, (short) -23759);
    }
}
