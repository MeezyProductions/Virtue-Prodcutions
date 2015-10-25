/* Class537_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class537_Sub1 extends Class537
    implements MouseListener, MouseMotionListener, MouseWheelListener
{
    Class688 aClass688_10612 = new Class688();
    static final int anInt10613 = 2;
    static final int anInt10614 = 4;
    int anInt10615;
    int anInt10616;
    int anInt10617;
    static final int anInt10618 = 1;
    int anInt10619;
    Class688 aClass688_10620 = new Class688();
    int anInt10621;
    int anInt10622;
    Component aComponent10623;
    boolean aBool10624;
    
    public int method6519() {
	return -1689578463 * ((Class537_Sub1) this).anInt10615;
    }
    
    void method9569(Component component, byte i) {
	method9574(919886227);
	((Class537_Sub1) this).aComponent10623 = component;
	((Class537_Sub1) this).aComponent10623.addMouseListener(this);
	((Class537_Sub1) this).aComponent10623.addMouseMotionListener(this);
	((Class537_Sub1) this).aComponent10623.addMouseWheelListener(this);
    }
    
    void method9570() {
	if (null != ((Class537_Sub1) this).aComponent10623) {
	    ((Class537_Sub1) this).aComponent10623
		.removeMouseWheelListener(this);
	    ((Class537_Sub1) this).aComponent10623
		.removeMouseMotionListener(this);
	    ((Class537_Sub1) this).aComponent10623.removeMouseListener(this);
	    ((Class537_Sub1) this).aComponent10623 = null;
	    ((Class537_Sub1) this).anInt10622 = 0;
	    ((Class537_Sub1) this).anInt10616 = 0;
	    ((Class537_Sub1) this).anInt10615 = 0;
	    ((Class537_Sub1) this).anInt10621 = 0;
	    ((Class537_Sub1) this).anInt10617 = 0;
	    ((Class537_Sub1) this).anInt10619 = 0;
	    ((Class537_Sub1) this).aClass688_10612 = null;
	    ((Class537_Sub1) this).aClass688_10620 = null;
	}
    }
    
    public int method6522() {
	return -181703877 * ((Class537_Sub1) this).anInt10616;
    }
    
    void method9571(int i, int i_0_, int i_1_) {
	((Class537_Sub1) this).anInt10619 = i * 82691905;
	((Class537_Sub1) this).anInt10617 = i_0_ * 53871821;
	if (((Class537_Sub1) this).aBool10624)
	    method9575(-1, i, i_0_, 0, -1725472735);
    }
    
    public Class528_Sub33 method6508(int i) {
	return (Class528_Sub33) ((Class537_Sub1) this).aClass688_10612
				    .method8032(-1490570711);
    }
    
    void method9572(int i, int i_2_, int i_3_, int i_4_) {
	Class528_Sub33_Sub1 class528_sub33_sub1
	    = Class5_Sub1.method10059(i, i_2_, i_3_,
				      Class249.method3417(1988770203), i_4_,
				      (byte) 0);
	((Class537_Sub1) this).aClass688_10620.method8031(class528_sub33_sub1,
							  (byte) 18);
    }
    
    public boolean method6503(short i) {
	return (((Class537_Sub1) this).anInt10622 * 605958897 & 0x1) != 0;
    }
    
    public boolean method6501(int i) {
	return (((Class537_Sub1) this).anInt10622 * 605958897 & 0x4) != 0;
    }
    
    public int method6507(int i) {
	return -1689578463 * ((Class537_Sub1) this).anInt10615;
    }
    
    public int method6504(byte i) {
	return -181703877 * ((Class537_Sub1) this).anInt10616;
    }
    
    public void method6520(byte i) {
	method9574(-978574731);
    }
    
    public synchronized void mouseClicked(MouseEvent mouseevent) {
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public void method6524() {
	method9574(-1611974382);
    }
    
    public synchronized void mouseExited(MouseEvent mouseevent) {
	method9571(mouseevent.getX(), mouseevent.getY(), 83561935);
    }
    
    int method9573(MouseEvent mouseevent, byte i) {
	if (mouseevent.getButton() == 1) {
	    if (mouseevent.isMetaDown())
		return 4;
	    return 1;
	}
	if (mouseevent.getButton() == 2)
	    return 2;
	if (mouseevent.getButton() == 3)
	    return 4;
	return 0;
    }
    
    public synchronized void mousePressed(MouseEvent mouseevent) {
	int i = method9573(mouseevent, (byte) 44);
	if (1 == i)
	    method9575(0, mouseevent.getX(), mouseevent.getY(),
		       mouseevent.getClickCount(), -1725472735);
	else if (i == 4)
	    method9575(2, mouseevent.getX(), mouseevent.getY(),
		       mouseevent.getClickCount(), -1725472735);
	else if (i == 2)
	    method9575(1, mouseevent.getX(), mouseevent.getY(),
		       mouseevent.getClickCount(), -1725472735);
	((Class537_Sub1) this).anInt10621
	    = -1495883667 * (((Class537_Sub1) this).anInt10621 * -1008834203
			     | i);
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public synchronized void method6509() {
	((Class537_Sub1) this).anInt10615
	    = -1426644831 * ((Class537_Sub1) this).anInt10619;
	((Class537_Sub1) this).anInt10616
	    = ((Class537_Sub1) this).anInt10617 * -672193089;
	((Class537_Sub1) this).anInt10622
	    = -394218059 * ((Class537_Sub1) this).anInt10621;
	Class688 class688 = ((Class537_Sub1) this).aClass688_10612;
	((Class537_Sub1) this).aClass688_10612
	    = ((Class537_Sub1) this).aClass688_10620;
	((Class537_Sub1) this).aClass688_10620 = class688;
	((Class537_Sub1) this).aClass688_10620.method8059((byte) -4);
    }
    
    public synchronized void mouseDragged(MouseEvent mouseevent) {
	method9571(mouseevent.getX(), mouseevent.getY(), 1041901443);
    }
    
    Class537_Sub1(Component component, boolean bool) {
	method9569(component, (byte) 114);
	((Class537_Sub1) this).aBool10624 = bool;
    }
    
    public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
	int i = mousewheelevent.getX();
	int i_5_ = mousewheelevent.getY();
	int i_6_ = mousewheelevent.getWheelRotation();
	method9575(6, i, i_5_, i_6_, -1725472735);
	mousewheelevent.consume();
    }
    
    public synchronized void method6499() {
	((Class537_Sub1) this).anInt10615
	    = -1426644831 * ((Class537_Sub1) this).anInt10619;
	((Class537_Sub1) this).anInt10616
	    = ((Class537_Sub1) this).anInt10617 * -672193089;
	((Class537_Sub1) this).anInt10622
	    = -394218059 * ((Class537_Sub1) this).anInt10621;
	Class688 class688 = ((Class537_Sub1) this).aClass688_10612;
	((Class537_Sub1) this).aClass688_10612
	    = ((Class537_Sub1) this).aClass688_10620;
	((Class537_Sub1) this).aClass688_10620 = class688;
	((Class537_Sub1) this).aClass688_10620.method8059((byte) -39);
    }
    
    void method9574(int i) {
	if (null != ((Class537_Sub1) this).aComponent10623) {
	    ((Class537_Sub1) this).aComponent10623
		.removeMouseWheelListener(this);
	    ((Class537_Sub1) this).aComponent10623
		.removeMouseMotionListener(this);
	    ((Class537_Sub1) this).aComponent10623.removeMouseListener(this);
	    ((Class537_Sub1) this).aComponent10623 = null;
	    ((Class537_Sub1) this).anInt10622 = 0;
	    ((Class537_Sub1) this).anInt10616 = 0;
	    ((Class537_Sub1) this).anInt10615 = 0;
	    ((Class537_Sub1) this).anInt10621 = 0;
	    ((Class537_Sub1) this).anInt10617 = 0;
	    ((Class537_Sub1) this).anInt10619 = 0;
	    ((Class537_Sub1) this).aClass688_10612 = null;
	    ((Class537_Sub1) this).aClass688_10620 = null;
	}
    }
    
    public boolean method6497() {
	return (((Class537_Sub1) this).anInt10622 * 605958897 & 0x1) != 0;
    }
    
    public synchronized void method6498(int i) {
	((Class537_Sub1) this).anInt10615
	    = -1426644831 * ((Class537_Sub1) this).anInt10619;
	((Class537_Sub1) this).anInt10616
	    = ((Class537_Sub1) this).anInt10617 * -672193089;
	((Class537_Sub1) this).anInt10622
	    = -394218059 * ((Class537_Sub1) this).anInt10621;
	Class688 class688 = ((Class537_Sub1) this).aClass688_10612;
	((Class537_Sub1) this).aClass688_10612
	    = ((Class537_Sub1) this).aClass688_10620;
	((Class537_Sub1) this).aClass688_10620 = class688;
	((Class537_Sub1) this).aClass688_10620.method8059((byte) -54);
    }
    
    public boolean method6511() {
	return 0 != (605958897 * ((Class537_Sub1) this).anInt10622 & 0x2);
    }
    
    public boolean method6512() {
	return 0 != (605958897 * ((Class537_Sub1) this).anInt10622 & 0x2);
    }
    
    public boolean method6513() {
	return (((Class537_Sub1) this).anInt10622 * 605958897 & 0x4) != 0;
    }
    
    void method9575(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
	Class528_Sub33_Sub1 class528_sub33_sub1
	    = Class5_Sub1.method10059(i, i_7_, i_8_,
				      Class249.method3417(2029195341), i_9_,
				      (byte) 0);
	((Class537_Sub1) this).aClass688_10620.method8031(class528_sub33_sub1,
							  (byte) -16);
    }
    
    public boolean method6515() {
	return (((Class537_Sub1) this).anInt10622 * 605958897 & 0x4) != 0;
    }
    
    public int method6517() {
	return -1689578463 * ((Class537_Sub1) this).anInt10615;
    }
    
    public boolean method6505(byte i) {
	return 0 != (605958897 * ((Class537_Sub1) this).anInt10622 & 0x2);
    }
    
    public boolean method6514() {
	return (((Class537_Sub1) this).anInt10622 * 605958897 & 0x4) != 0;
    }
    
    public int method6523() {
	return -181703877 * ((Class537_Sub1) this).anInt10616;
    }
    
    public int method6506() {
	return -181703877 * ((Class537_Sub1) this).anInt10616;
    }
    
    public Class528_Sub33 method6500() {
	return (Class528_Sub33) ((Class537_Sub1) this).aClass688_10612
				    .method8032(-1490570711);
    }
    
    public synchronized void mouseReleased(MouseEvent mouseevent) {
	int i = method9573(mouseevent, (byte) 11);
	if (0 == (-1008834203 * ((Class537_Sub1) this).anInt10621 & i))
	    i = -1008834203 * ((Class537_Sub1) this).anInt10621;
	if (0 != (i & 0x1))
	    method9575(3, mouseevent.getX(), mouseevent.getY(),
		       mouseevent.getClickCount(), -1725472735);
	if (0 != (i & 0x4))
	    method9575(5, mouseevent.getX(), mouseevent.getY(),
		       mouseevent.getClickCount(), -1725472735);
	if (0 != (i & 0x2))
	    method9575(4, mouseevent.getX(), mouseevent.getY(),
		       mouseevent.getClickCount(), -1725472735);
	((Class537_Sub1) this).anInt10621
	    = (-1008834203 * ((Class537_Sub1) this).anInt10621
	       & (i ^ 0xffffffff)) * -1495883667;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public boolean method6510() {
	return (((Class537_Sub1) this).anInt10622 * 605958897 & 0x1) != 0;
    }
    
    public synchronized void mouseMoved(MouseEvent mouseevent) {
	method9571(mouseevent.getX(), mouseevent.getY(), 98560081);
    }
    
    public synchronized void mouseEntered(MouseEvent mouseevent) {
	method9571(mouseevent.getX(), mouseevent.getY(), 1675717659);
    }
    
    void method9576() {
	if (null != ((Class537_Sub1) this).aComponent10623) {
	    ((Class537_Sub1) this).aComponent10623
		.removeMouseWheelListener(this);
	    ((Class537_Sub1) this).aComponent10623
		.removeMouseMotionListener(this);
	    ((Class537_Sub1) this).aComponent10623.removeMouseListener(this);
	    ((Class537_Sub1) this).aComponent10623 = null;
	    ((Class537_Sub1) this).anInt10622 = 0;
	    ((Class537_Sub1) this).anInt10616 = 0;
	    ((Class537_Sub1) this).anInt10615 = 0;
	    ((Class537_Sub1) this).anInt10621 = 0;
	    ((Class537_Sub1) this).anInt10617 = 0;
	    ((Class537_Sub1) this).anInt10619 = 0;
	    ((Class537_Sub1) this).aClass688_10612 = null;
	    ((Class537_Sub1) this).aClass688_10620 = null;
	}
    }
    
    public int method6518() {
	return -1689578463 * ((Class537_Sub1) this).anInt10615;
    }
    
    public void method6521() {
	method9574(-1459827419);
    }
    
    public void method6525() {
	method9574(-830758594);
    }
    
    static final void method9577(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	VarDefinition.method4134(class229, class226, class648, -2072770973);
    }
}
