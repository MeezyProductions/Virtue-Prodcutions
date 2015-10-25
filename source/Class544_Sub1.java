/* Class544_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class544_Sub1 extends Class544
    implements KeyListener, FocusListener
{
    static final int anInt10641 = 128;
    Class688 aClass688_10642 = new Class688();
    Class688 aClass688_10643 = new Class688();
    static int[] anIntArray10644
	= { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0,
	    0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96,
	    98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22,
	    23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39,
	    54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64,
	    0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0,
	    88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101,
	    128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140,
	    141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0,
	    0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    boolean[] aBoolArray10645 = new boolean[112];
    Component aComponent10646;
    static final int anInt10647 = 112;
    
    static void method9589() {
	anIntArray10644[44] = 71;
	anIntArray10644[45] = 26;
	anIntArray10644[46] = 72;
	anIntArray10644[47] = 73;
	anIntArray10644[59] = 57;
	anIntArray10644[61] = 27;
	anIntArray10644[91] = 42;
	anIntArray10644[92] = 74;
	anIntArray10644[93] = 43;
	anIntArray10644[192] = 28;
	anIntArray10644[222] = 58;
	anIntArray10644[520] = 59;
    }
    
    void method9590(Component component, int i) {
	method9592(-253648291);
	((Class544_Sub1) this).aComponent10646 = component;
	((Class544_Sub1) this).aComponent10646.addKeyListener(this);
	((Class544_Sub1) this).aComponent10646.addFocusListener(this);
    }
    
    public void method6642(int i) {
	method9592(-1027778778);
    }
    
    void method9591(int i, char c, int i_0_, byte i_1_) {
	Class528_Sub27 class528_sub27 = new Class528_Sub27();
	((Class528_Sub27) class528_sub27).anInt10442 = -727368081 * i;
	((Class528_Sub27) class528_sub27).aChar10440 = c;
	((Class528_Sub27) class528_sub27).anInt10441 = i_0_ * -1748711273;
	((Class528_Sub27) class528_sub27).aLong10444
	    = Class249.method3417(2088355232) * -8674869999415351061L;
	((Class544_Sub1) this).aClass688_10643.method8031(class528_sub27,
							  (byte) 22);
    }
    
    public Interface61 method6645(int i) {
	return (Interface61) ((Class544_Sub1) this).aClass688_10642
				 .method8032(-1490570711);
    }
    
    void method9592(int i) {
	if (((Class544_Sub1) this).aComponent10646 != null) {
	    ((Class544_Sub1) this).aComponent10646.removeKeyListener(this);
	    ((Class544_Sub1) this).aComponent10646.removeFocusListener(this);
	    ((Class544_Sub1) this).aComponent10646 = null;
	    for (int i_2_ = 0; i_2_ < 112; i_2_++)
		((Class544_Sub1) this).aBoolArray10645[i_2_] = false;
	    ((Class544_Sub1) this).aClass688_10642.method8059((byte) -94);
	    ((Class544_Sub1) this).aClass688_10643.method8059((byte) -33);
	}
    }
    
    public synchronized void method6643(int i) {
	((Class544_Sub1) this).aClass688_10642.method8059((byte) -114);
	for (Class528_Sub27 class528_sub27
		 = (Class528_Sub27) ((Class544_Sub1) this).aClass688_10643
					.method8032(-1490570711);
	     class528_sub27 != null;
	     class528_sub27
		 = (Class528_Sub27) ((Class544_Sub1) this).aClass688_10643
					.method8032(-1490570711)) {
	    ((Class528_Sub27) class528_sub27).anInt10443
		= method9593((byte) -122) * -741342155;
	    if (-662708081 * ((Class528_Sub27) class528_sub27).anInt10442
		== 0) {
		if (!((Class544_Sub1) this).aBoolArray10645
		     [(1578841895
		       * ((Class528_Sub27) class528_sub27).anInt10441)]) {
		    Class528_Sub27 class528_sub27_3_ = new Class528_Sub27();
		    ((Class528_Sub27) class528_sub27_3_).anInt10442 = 0;
		    ((Class528_Sub27) class528_sub27_3_).aChar10440 = '\uffff';
		    ((Class528_Sub27) class528_sub27_3_).anInt10441
			= ((Class528_Sub27) class528_sub27).anInt10441 * 1;
		    ((Class528_Sub27) class528_sub27_3_).aLong10444
			= ((Class528_Sub27) class528_sub27).aLong10444 * 1L;
		    ((Class528_Sub27) class528_sub27_3_).anInt10443
			= 1 * ((Class528_Sub27) class528_sub27).anInt10443;
		    ((Class544_Sub1) this).aClass688_10642
			.method8031(class528_sub27_3_, (byte) -73);
		    ((Class544_Sub1) this).aBoolArray10645
			[(((Class528_Sub27) class528_sub27).anInt10441
			  * 1578841895)]
			= true;
		}
		((Class528_Sub27) class528_sub27).anInt10442 = -1454736162;
		((Class544_Sub1) this).aClass688_10642
		    .method8031(class528_sub27, (byte) 4);
	    } else if (1 == (-662708081
			     * ((Class528_Sub27) class528_sub27).anInt10442)) {
		if (((Class544_Sub1) this).aBoolArray10645
		    [(1578841895
		      * ((Class528_Sub27) class528_sub27).anInt10441)]) {
		    ((Class544_Sub1) this).aClass688_10642
			.method8031(class528_sub27, (byte) 4);
		    ((Class544_Sub1) this).aBoolArray10645
			[(((Class528_Sub27) class528_sub27).anInt10441
			  * 1578841895)]
			= false;
		}
	    } else if (-1 == -662708081 * (((Class528_Sub27) class528_sub27)
					   .anInt10442)) {
		for (int i_4_ = 0; i_4_ < 112; i_4_++) {
		    if (((Class544_Sub1) this).aBoolArray10645[i_4_]) {
			Class528_Sub27 class528_sub27_5_
			    = new Class528_Sub27();
			((Class528_Sub27) class528_sub27_5_).anInt10442
			    = -727368081;
			((Class528_Sub27) class528_sub27_5_).aChar10440
			    = '\uffff';
			((Class528_Sub27) class528_sub27_5_).anInt10441
			    = -1748711273 * i_4_;
			((Class528_Sub27) class528_sub27_5_).aLong10444
			    = (((Class528_Sub27) class528_sub27).aLong10444
			       * 1L);
			((Class528_Sub27) class528_sub27_5_).anInt10443
			    = 1 * ((Class528_Sub27) class528_sub27).anInt10443;
			((Class544_Sub1) this).aClass688_10642
			    .method8031(class528_sub27_5_, (byte) 41);
			((Class544_Sub1) this).aBoolArray10645[i_4_] = false;
		    }
		}
	    } else if (3 == (-662708081
			     * ((Class528_Sub27) class528_sub27).anInt10442))
		((Class544_Sub1) this).aClass688_10642
		    .method8031(class528_sub27, (byte) 75);
	}
    }
    
    int method9593(byte i) {
	int i_6_ = 0;
	if (((Class544_Sub1) this).aBoolArray10645[81])
	    i_6_ |= 0x1;
	if (((Class544_Sub1) this).aBoolArray10645[82])
	    i_6_ |= 0x4;
	if (((Class544_Sub1) this).aBoolArray10645[86])
	    i_6_ |= 0x2;
	return i_6_;
    }
    
    public synchronized void focusLost(FocusEvent focusevent) {
	method9591(-1, '\0', 0, (byte) 80);
    }
    
    public boolean method6649(int i) {
	if (i < 0 || i >= 112)
	    return false;
	return ((Class544_Sub1) this).aBoolArray10645[i];
    }
    
    public synchronized void keyPressed(KeyEvent keyevent) {
	method9597(keyevent, 0, (byte) 8);
    }
    
    public void focusGained(FocusEvent focusevent) {
	/* empty */
    }
    
    public synchronized void keyTyped(KeyEvent keyevent) {
	char c = keyevent.getKeyChar();
	if (c != '\uffff' && ModeWhere.method7894(c, -276590675)) {
	    method9591(3, c, -1, (byte) 47);
	    keyevent.consume();
	}
    }
    
    public synchronized void method6651() {
	((Class544_Sub1) this).aClass688_10642.method8059((byte) -101);
	for (Class528_Sub27 class528_sub27
		 = (Class528_Sub27) ((Class544_Sub1) this).aClass688_10643
					.method8032(-1490570711);
	     class528_sub27 != null;
	     class528_sub27
		 = (Class528_Sub27) ((Class544_Sub1) this).aClass688_10643
					.method8032(-1490570711)) {
	    ((Class528_Sub27) class528_sub27).anInt10443
		= method9593((byte) -124) * -741342155;
	    if (-662708081 * ((Class528_Sub27) class528_sub27).anInt10442
		== 0) {
		if (!((Class544_Sub1) this).aBoolArray10645
		     [(1578841895
		       * ((Class528_Sub27) class528_sub27).anInt10441)]) {
		    Class528_Sub27 class528_sub27_7_ = new Class528_Sub27();
		    ((Class528_Sub27) class528_sub27_7_).anInt10442 = 0;
		    ((Class528_Sub27) class528_sub27_7_).aChar10440 = '\uffff';
		    ((Class528_Sub27) class528_sub27_7_).anInt10441
			= ((Class528_Sub27) class528_sub27).anInt10441 * 1;
		    ((Class528_Sub27) class528_sub27_7_).aLong10444
			= ((Class528_Sub27) class528_sub27).aLong10444 * 1L;
		    ((Class528_Sub27) class528_sub27_7_).anInt10443
			= 1 * ((Class528_Sub27) class528_sub27).anInt10443;
		    ((Class544_Sub1) this).aClass688_10642
			.method8031(class528_sub27_7_, (byte) 2);
		    ((Class544_Sub1) this).aBoolArray10645
			[(((Class528_Sub27) class528_sub27).anInt10441
			  * 1578841895)]
			= true;
		}
		((Class528_Sub27) class528_sub27).anInt10442 = -1454736162;
		((Class544_Sub1) this).aClass688_10642
		    .method8031(class528_sub27, (byte) -41);
	    } else if (1 == (-662708081
			     * ((Class528_Sub27) class528_sub27).anInt10442)) {
		if (((Class544_Sub1) this).aBoolArray10645
		    [(1578841895
		      * ((Class528_Sub27) class528_sub27).anInt10441)]) {
		    ((Class544_Sub1) this).aClass688_10642
			.method8031(class528_sub27, (byte) 10);
		    ((Class544_Sub1) this).aBoolArray10645
			[(((Class528_Sub27) class528_sub27).anInt10441
			  * 1578841895)]
			= false;
		}
	    } else if (-1 == -662708081 * (((Class528_Sub27) class528_sub27)
					   .anInt10442)) {
		for (int i = 0; i < 112; i++) {
		    if (((Class544_Sub1) this).aBoolArray10645[i]) {
			Class528_Sub27 class528_sub27_8_
			    = new Class528_Sub27();
			((Class528_Sub27) class528_sub27_8_).anInt10442
			    = -727368081;
			((Class528_Sub27) class528_sub27_8_).aChar10440
			    = '\uffff';
			((Class528_Sub27) class528_sub27_8_).anInt10441
			    = -1748711273 * i;
			((Class528_Sub27) class528_sub27_8_).aLong10444
			    = (((Class528_Sub27) class528_sub27).aLong10444
			       * 1L);
			((Class528_Sub27) class528_sub27_8_).anInt10443
			    = 1 * ((Class528_Sub27) class528_sub27).anInt10443;
			((Class544_Sub1) this).aClass688_10642
			    .method8031(class528_sub27_8_, (byte) -53);
			((Class544_Sub1) this).aBoolArray10645[i] = false;
		    }
		}
	    } else if (3 == (-662708081
			     * ((Class528_Sub27) class528_sub27).anInt10442))
		((Class544_Sub1) this).aClass688_10642
		    .method8031(class528_sub27, (byte) 84);
	}
    }
    
    public synchronized void keyReleased(KeyEvent keyevent) {
	method9597(keyevent, 1, (byte) 8);
    }
    
    public void method9594(FocusEvent focusevent) {
	/* empty */
    }
    
    public boolean method6650(int i) {
	if (i < 0 || i >= 112)
	    return false;
	return ((Class544_Sub1) this).aBoolArray10645[i];
    }
    
    static void method9595() {
	anIntArray10644[44] = 71;
	anIntArray10644[45] = 26;
	anIntArray10644[46] = 72;
	anIntArray10644[47] = 73;
	anIntArray10644[59] = 57;
	anIntArray10644[61] = 27;
	anIntArray10644[91] = 42;
	anIntArray10644[92] = 74;
	anIntArray10644[93] = 43;
	anIntArray10644[192] = 28;
	anIntArray10644[222] = 58;
	anIntArray10644[520] = 59;
    }
    
    void method9596() {
	if (((Class544_Sub1) this).aComponent10646 != null) {
	    ((Class544_Sub1) this).aComponent10646.removeKeyListener(this);
	    ((Class544_Sub1) this).aComponent10646.removeFocusListener(this);
	    ((Class544_Sub1) this).aComponent10646 = null;
	    for (int i = 0; i < 112; i++)
		((Class544_Sub1) this).aBoolArray10645[i] = false;
	    ((Class544_Sub1) this).aClass688_10642.method8059((byte) -61);
	    ((Class544_Sub1) this).aClass688_10643.method8059((byte) -64);
	}
    }
    
    public Interface61 method6647() {
	return (Interface61) ((Class544_Sub1) this).aClass688_10642
				 .method8032(-1490570711);
    }
    
    public boolean method6646(int i) {
	if (i < 0 || i >= 112)
	    return false;
	return ((Class544_Sub1) this).aBoolArray10645[i];
    }
    
    public boolean method6653(int i) {
	if (i < 0 || i >= 112)
	    return false;
	return ((Class544_Sub1) this).aBoolArray10645[i];
    }
    
    void method9597(KeyEvent keyevent, int i, byte i_9_) {
	int i_10_ = keyevent.getKeyCode();
	if (i_10_ != 0) {
	    if (i_10_ >= 0 && i_10_ < anIntArray10644.length) {
		i_10_ = anIntArray10644[i_10_];
		if (0 == i && 0 != (i_10_ & 0x80))
		    i_10_ = 0;
		else
		    i_10_ &= ~0x80;
	    } else
		i_10_ = 0;
	} else
	    i_10_ = 0;
	if (0 != i_10_) {
	    method9591(i, '\uffff', i_10_, (byte) 109);
	    keyevent.consume();
	}
    }
    
    public void method6655() {
	method9592(-193689051);
    }
    
    public synchronized void method6648() {
	((Class544_Sub1) this).aClass688_10642.method8059((byte) -1);
	for (Class528_Sub27 class528_sub27
		 = (Class528_Sub27) ((Class544_Sub1) this).aClass688_10643
					.method8032(-1490570711);
	     class528_sub27 != null;
	     class528_sub27
		 = (Class528_Sub27) ((Class544_Sub1) this).aClass688_10643
					.method8032(-1490570711)) {
	    ((Class528_Sub27) class528_sub27).anInt10443
		= method9593((byte) -98) * -741342155;
	    if (-662708081 * ((Class528_Sub27) class528_sub27).anInt10442
		== 0) {
		if (!((Class544_Sub1) this).aBoolArray10645
		     [(1578841895
		       * ((Class528_Sub27) class528_sub27).anInt10441)]) {
		    Class528_Sub27 class528_sub27_11_ = new Class528_Sub27();
		    ((Class528_Sub27) class528_sub27_11_).anInt10442 = 0;
		    ((Class528_Sub27) class528_sub27_11_).aChar10440
			= '\uffff';
		    ((Class528_Sub27) class528_sub27_11_).anInt10441
			= ((Class528_Sub27) class528_sub27).anInt10441 * 1;
		    ((Class528_Sub27) class528_sub27_11_).aLong10444
			= ((Class528_Sub27) class528_sub27).aLong10444 * 1L;
		    ((Class528_Sub27) class528_sub27_11_).anInt10443
			= 1 * ((Class528_Sub27) class528_sub27).anInt10443;
		    ((Class544_Sub1) this).aClass688_10642
			.method8031(class528_sub27_11_, (byte) 48);
		    ((Class544_Sub1) this).aBoolArray10645
			[(((Class528_Sub27) class528_sub27).anInt10441
			  * 1578841895)]
			= true;
		}
		((Class528_Sub27) class528_sub27).anInt10442 = -1454736162;
		((Class544_Sub1) this).aClass688_10642
		    .method8031(class528_sub27, (byte) -17);
	    } else if (1 == (-662708081
			     * ((Class528_Sub27) class528_sub27).anInt10442)) {
		if (((Class544_Sub1) this).aBoolArray10645
		    [(1578841895
		      * ((Class528_Sub27) class528_sub27).anInt10441)]) {
		    ((Class544_Sub1) this).aClass688_10642
			.method8031(class528_sub27, (byte) -39);
		    ((Class544_Sub1) this).aBoolArray10645
			[(((Class528_Sub27) class528_sub27).anInt10441
			  * 1578841895)]
			= false;
		}
	    } else if (-1 == -662708081 * (((Class528_Sub27) class528_sub27)
					   .anInt10442)) {
		for (int i = 0; i < 112; i++) {
		    if (((Class544_Sub1) this).aBoolArray10645[i]) {
			Class528_Sub27 class528_sub27_12_
			    = new Class528_Sub27();
			((Class528_Sub27) class528_sub27_12_).anInt10442
			    = -727368081;
			((Class528_Sub27) class528_sub27_12_).aChar10440
			    = '\uffff';
			((Class528_Sub27) class528_sub27_12_).anInt10441
			    = -1748711273 * i;
			((Class528_Sub27) class528_sub27_12_).aLong10444
			    = (((Class528_Sub27) class528_sub27).aLong10444
			       * 1L);
			((Class528_Sub27) class528_sub27_12_).anInt10443
			    = 1 * ((Class528_Sub27) class528_sub27).anInt10443;
			((Class544_Sub1) this).aClass688_10642
			    .method8031(class528_sub27_12_, (byte) -48);
			((Class544_Sub1) this).aBoolArray10645[i] = false;
		    }
		}
	    } else if (3 == (-662708081
			     * ((Class528_Sub27) class528_sub27).anInt10442))
		((Class544_Sub1) this).aClass688_10642
		    .method8031(class528_sub27, (byte) -67);
	}
    }
    
    public synchronized void method6652() {
	((Class544_Sub1) this).aClass688_10642.method8059((byte) -32);
	for (Class528_Sub27 class528_sub27
		 = (Class528_Sub27) ((Class544_Sub1) this).aClass688_10643
					.method8032(-1490570711);
	     class528_sub27 != null;
	     class528_sub27
		 = (Class528_Sub27) ((Class544_Sub1) this).aClass688_10643
					.method8032(-1490570711)) {
	    ((Class528_Sub27) class528_sub27).anInt10443
		= method9593((byte) -60) * -741342155;
	    if (-662708081 * ((Class528_Sub27) class528_sub27).anInt10442
		== 0) {
		if (!((Class544_Sub1) this).aBoolArray10645
		     [(1578841895
		       * ((Class528_Sub27) class528_sub27).anInt10441)]) {
		    Class528_Sub27 class528_sub27_13_ = new Class528_Sub27();
		    ((Class528_Sub27) class528_sub27_13_).anInt10442 = 0;
		    ((Class528_Sub27) class528_sub27_13_).aChar10440
			= '\uffff';
		    ((Class528_Sub27) class528_sub27_13_).anInt10441
			= ((Class528_Sub27) class528_sub27).anInt10441 * 1;
		    ((Class528_Sub27) class528_sub27_13_).aLong10444
			= ((Class528_Sub27) class528_sub27).aLong10444 * 1L;
		    ((Class528_Sub27) class528_sub27_13_).anInt10443
			= 1 * ((Class528_Sub27) class528_sub27).anInt10443;
		    ((Class544_Sub1) this).aClass688_10642
			.method8031(class528_sub27_13_, (byte) 53);
		    ((Class544_Sub1) this).aBoolArray10645
			[(((Class528_Sub27) class528_sub27).anInt10441
			  * 1578841895)]
			= true;
		}
		((Class528_Sub27) class528_sub27).anInt10442 = -1454736162;
		((Class544_Sub1) this).aClass688_10642
		    .method8031(class528_sub27, (byte) 91);
	    } else if (1 == (-662708081
			     * ((Class528_Sub27) class528_sub27).anInt10442)) {
		if (((Class544_Sub1) this).aBoolArray10645
		    [(1578841895
		      * ((Class528_Sub27) class528_sub27).anInt10441)]) {
		    ((Class544_Sub1) this).aClass688_10642
			.method8031(class528_sub27, (byte) 20);
		    ((Class544_Sub1) this).aBoolArray10645
			[(((Class528_Sub27) class528_sub27).anInt10441
			  * 1578841895)]
			= false;
		}
	    } else if (-1 == -662708081 * (((Class528_Sub27) class528_sub27)
					   .anInt10442)) {
		for (int i = 0; i < 112; i++) {
		    if (((Class544_Sub1) this).aBoolArray10645[i]) {
			Class528_Sub27 class528_sub27_14_
			    = new Class528_Sub27();
			((Class528_Sub27) class528_sub27_14_).anInt10442
			    = -727368081;
			((Class528_Sub27) class528_sub27_14_).aChar10440
			    = '\uffff';
			((Class528_Sub27) class528_sub27_14_).anInt10441
			    = -1748711273 * i;
			((Class528_Sub27) class528_sub27_14_).aLong10444
			    = (((Class528_Sub27) class528_sub27).aLong10444
			       * 1L);
			((Class528_Sub27) class528_sub27_14_).anInt10443
			    = 1 * ((Class528_Sub27) class528_sub27).anInt10443;
			((Class544_Sub1) this).aClass688_10642
			    .method8031(class528_sub27_14_, (byte) -25);
			((Class544_Sub1) this).aBoolArray10645[i] = false;
		    }
		}
	    } else if (3 == (-662708081
			     * ((Class528_Sub27) class528_sub27).anInt10442))
		((Class544_Sub1) this).aClass688_10642
		    .method8031(class528_sub27, (byte) -27);
	}
    }
    
    Class544_Sub1(Component component) {
	ModeWhere.method7897(-1645013191);
	method9590(component, -24571094);
    }
    
    public synchronized void method9598(FocusEvent focusevent) {
	method9591(-1, '\0', 0, (byte) 51);
    }
    
    public void method6654() {
	method9592(-1359880998);
    }
    
    public boolean method6644(int i, int i_15_) {
	if (i < 0 || i >= 112)
	    return false;
	return ((Class544_Sub1) this).aBoolArray10645[i];
    }
    
    static final void method9599(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub13_10587,
	     (((Class648) class648).anIntArray8394
	      [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]),
	     525312797);
	Class243.method3387(2134808444);
	client.aBool10896 = true;
    }
}
