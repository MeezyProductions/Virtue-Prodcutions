/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class5 implements Interface12
{
    public int anInt116;
    SharedConfigsType aClass644_117;
    protected Interface4 anInterface4_118;
    Class186 aClass186_119;
    Class446 aClass446_120;
    static Class1 aClass1_121;
    
    public void method534() {
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2735(1339542268);
	}
    }
    
    public Definition method63(int i, int i_0_) {
	Definition definition;
	synchronized (((Class5) this).aClass186_119) {
	    definition = ((Definition)
			   ((Class5) this).aClass186_119.method2727((long) i));
	}
	if (null != definition)
	    return definition;
	definition = method535(i, (byte) -6);
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2729(definition, (long) i);
	}
	return definition;
    }
    
    Definition method535(int i, byte i_1_) {
	byte[] is;
	synchronized (((Class5) this).aClass446_120) {
	    is = Class457.method5530(((Class5) this).aClass446_120,
				     ((Class5) this).aClass644_117, i,
				     (byte) -49);
	}
	Definition definition
	    = anInterface4_118.method42(i, this, -1653117369);
	if (null != is)
	    definition.method58(new ByteBuffer(is), (byte) 89);
	definition.method61(-1285011594);
	return definition;
    }
    
    public int method62(short i) {
	return -1906415229 * anInt116;
    }
    
    public void method536(byte i) {
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2731(-1977412334);
	}
    }
    
    public void method537() {
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2731(-1772410102);
	}
    }
    
    public void method538(int i, short i_2_) {
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2747(i, 1468027026);
	}
    }
    
    public void method539(int i) {
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2735(-408400597);
	}
    }
    
    public Iterator iterator() {
	return new Class41(this);
    }
    
    public Definition method64(int i) {
	Definition definition;
	synchronized (((Class5) this).aClass186_119) {
	    definition = ((Definition)
			   ((Class5) this).aClass186_119.method2727((long) i));
	}
	if (null != definition)
	    return definition;
	definition = method535(i, (byte) 3);
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2729(definition, (long) i);
	}
	return definition;
    }
    
    public Definition method65(int i) {
	Definition definition;
	synchronized (((Class5) this).aClass186_119) {
	    definition = ((Definition)
			   ((Class5) this).aClass186_119.method2727((long) i));
	}
	if (null != definition)
	    return definition;
	definition = method535(i, (byte) -37);
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2729(definition, (long) i);
	}
	return definition;
    }
    
    public int method5() {
	return -1906415229 * anInt116;
    }
    
    public Iterator method540() {
	return new Class41(this);
    }
    
    public void method541(int i) {
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2747(i, 367275223);
	}
    }
    
    public void method542(int i) {
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2747(i, -208167907);
	}
    }
    
    public void method543(int i, byte i_3_) {
	synchronized (((Class5) this).aClass186_119) {
	    ((Class5) this).aClass186_119.method2731(-866884825);
	    ((Class5) this).aClass186_119 = new Class186(i);
	}
    }
    
    Class5(Class673 class673, Class668 class668, Class446 class446,
	   SharedConfigsType sharedConfigsType, int i, Interface4 interface4) {
	((Class5) this).aClass446_120 = class446;
	((Class5) this).aClass644_117 = sharedConfigsType;
	anInterface4_118 = interface4;
	anInt116 = (Class31.method753(((Class5) this).aClass446_120,
				      ((Class5) this).aClass644_117, (byte) 96)
		    * -1949110997);
	((Class5) this).aClass186_119 = new Class186(i);
    }
    
    public static void method544(int i, int i_4_, int i_5_, boolean bool,
				 byte i_6_) {
	Class528_Sub21_Sub17 class528_sub21_sub17
	    = Class518_Sub1.aClass528_Sub21_Sub17_7017;
	Class518_Sub1.method6288(i);
	Class518_Sub1.aBool7007 = false;
	if (class528_sub21_sub17 != Class518_Sub1.aClass528_Sub21_Sub17_7017)
	    OutgoingOpcode.method4860(-354695735);
	Class518_Sub1.anInt10689 = 505716431 * i_4_;
	Class518_Sub1.anInt10690 = -686985895 * i_5_;
	Class518_Sub1.aBool10691 = bool;
    }
    
    static final void method545(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub4_10578
		  .method9853(-1651618157) ? 1 : 0;
    }
    
    static final void method546(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_7_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_8_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	((Class648) class648).aClass387_8404.anIntArray4072[i_7_] = i_8_;
    }
}
