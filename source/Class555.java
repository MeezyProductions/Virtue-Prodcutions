/* Class555 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class555
{
    int anInt7447;
    public List aList7448 = new LinkedList();
    int anInt7449;
    boolean aBool7450 = false;
    public static int anInt7451;
    public static Class25_Sub2 aClass25_Sub2_7452;
    
    Class555(boolean bool) {
	((Class555) this).anInt7449 = 0;
	((Class555) this).anInt7447 = 0;
	((Class555) this).aBool7450 = bool;
    }
    
    public void method6738(int i) {
	Iterator iterator = aList7448.iterator();
	while (iterator.hasNext()) {
	    Class549 class549 = (Class549) iterator.next();
	    iterator.remove();
	    Class528_Sub3.method9247(class549, (short) 128);
	}
    }
    
    void method6739(Class549 class549, int i) {
	Class645_Sub1 class645_sub1 = class549.aClass645_Sub1_7417;
	boolean bool = true;
	Class159[] class159s
	    = class549.aClass645_Sub1_7417.aClass159Array10678;
	for (int i_0_ = 0; i_0_ < class159s.length; i_0_++) {
	    if (class159s[i_0_].aBool1751) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    ((Class549) class549).aClass555_7420 = this;
	    if (((Class555) this).aBool7450) {
		Iterator iterator = aList7448.iterator();
		while (iterator.hasNext()) {
		    Class549 class549_1_ = (Class549) iterator.next();
		    if (class645_sub1 == class549_1_.aClass645_Sub1_7417) {
			iterator.remove();
			Class528_Sub3.method9247(class549_1_, (short) 128);
		    }
		}
	    }
	    ListIterator listiterator = aList7448.listIterator();
	    while (listiterator.hasNext()) {
		Class549 class549_2_ = (Class549) listiterator.next();
		if (830655065 * ((Class645_Sub1) class645_sub1).anInt10677
		    >= (((Class645_Sub1) class549_2_.aClass645_Sub1_7417)
			.anInt10677) * 830655065) {
		    listiterator.previous();
		    listiterator.add(class549);
		    return;
		}
	    }
	    aList7448.add(class549);
	}
    }
    
    public void method6740() {
	Iterator iterator = aList7448.iterator();
	while (iterator.hasNext()) {
	    Class549 class549 = (Class549) iterator.next();
	    iterator.remove();
	    Class528_Sub3.method9247(class549, (short) 128);
	}
    }
    
    public static void method6741(Class528_Sub30 class528_sub30, short i) {
	Class232_Sub1.method8994(class528_sub30, 200000, (byte) 50);
    }
    
    static final void method6742(Class648 class648, short i) {
	((Class648) class648).anInt8395 -= -577899301;
	Class365.aClass218_3848.method3109
	    ((((Class648) class648).anIntArray8394
	      [717927929 * ((Class648) class648).anInt8395]),
	     (((Class648) class648).anIntArray8394
	      [1 + ((Class648) class648).anInt8395 * 717927929]),
	     (byte) 89);
    }
    
    static final void method6743(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_3_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_4_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395 + 1]);
	ItemType itemType
	    = (ItemType) Class18.aClass5_Sub13_206.method63(i_3_, -148200624);
	if (i_4_ >= 1 && i_4_ <= 5 && itemType.aStringArray90[i_4_ - 1] != null)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= itemType.aStringArray90[i_4_ - 1];
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
    }
    
    static final void method6744(Class648 class648, int i) {
	VarDefinition.method4137((byte) 62);
    }
    
    static final void method6745(Class648 class648, byte i) {
	int i_5_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	int i_6_ = i_5_ >> 14 & 0x3fff;
	int i_7_ = i_5_ & 0x3fff;
	Class578 class578 = client.gameScene.method5966(1273279609);
	i_6_ -= class578.anInt7607 * 961465569;
	if (i_6_ < 0)
	    i_6_ = 0;
	else if (i_6_ >= client.gameScene.method6029((short) 27113))
	    i_6_ = client.gameScene.method6029((short) 23089);
	i_7_ -= class578.anInt7608 * -173815201;
	if (i_7_ < 0)
	    i_7_ = 0;
	else if (i_7_ >= client.gameScene.method5967(1143085132))
	    i_7_ = client.gameScene.method5967(508656990);
	client.anInt10972 = (256 + (i_6_ << 9)) * 1852466897;
	client.anInt10973 = -1016106627 * ((i_7_ << 9) + 256);
	Class390.anInt4111 = 1043416901;
	Class386.anInt4069 = 1476949137;
	Class690_Sub2.anInt10780 = 1603116895;
	client.aBool10982 = true;
    }
    
    public static void method6746(Applet applet, String string, int i) {
	Class499.anApplet6841 = applet;
	Class499.aString6843 = string;
    }
    
    public static boolean method6747(int i, boolean bool, int i_8_) {
	if (Class518_Sub1.anInt10695 * 1054739841 == i)
	    Class518_Sub1.aBool10708 = bool;
	else if (i == 94799211 * Class518_Sub1.anInt10680)
	    Class518_Sub1.aBool10707 = bool;
	else if (i == -734926547 * Class518_Sub1.anInt10681)
	    Class518_Sub1.aBool10705 = bool;
	else
	    return false;
	return true;
    }
    
    static final void method6748(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2394
	    = Class181_Sub23.method8999(string, class648, (byte) -84);
	class229.aBool2483 = true;
    }
}
