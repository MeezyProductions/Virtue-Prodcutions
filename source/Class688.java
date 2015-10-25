/* Class688 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collection;
import java.util.Iterator;

public class Class688 implements Iterable, Collection
{
    public Node aClass528_8655 = new Node();
    Node aClass528_8656;
    static Class77 aClass77_8657;
    static Class187 aClass187_8658;
    
    public Object[] method8030() {
	return method8041((byte) -4);
    }
    
    public boolean removeAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public void method8031(Node node, byte i) {
	if (null != node.aClass528_7105)
	    node.method6443(-1756446432);
	node.aClass528_7105 = aClass528_8655.aClass528_7105;
	node.aClass528_7106 = aClass528_8655;
	node.aClass528_7105.aClass528_7106 = node;
	node.aClass528_7106.aClass528_7105 = node;
    }
    
    public Node method8032(int i) {
	Node node = aClass528_8655.aClass528_7106;
	if (aClass528_8655 == node)
	    return null;
	node.method6443(196752014);
	return node;
    }
    
    void method8033(Class688 class688_0_, Node node, int i) {
	Node class528_1_ = aClass528_8655.aClass528_7105;
	aClass528_8655.aClass528_7105 = node.aClass528_7105;
	node.aClass528_7105.aClass528_7106 = aClass528_8655;
	if (aClass528_8655 != node) {
	    node.aClass528_7105
		= class688_0_.aClass528_8655.aClass528_7105;
	    node.aClass528_7105.aClass528_7106 = node;
	    class528_1_.aClass528_7106 = class688_0_.aClass528_8655;
	    class688_0_.aClass528_8655.aClass528_7105 = class528_1_;
	}
    }
    
    public Node method8034(int i) {
	return method8035(null, 1060652177);
    }
    
    Node method8035(Node node, int i) {
	Node class528_2_;
	if (null == node)
	    class528_2_ = aClass528_8655.aClass528_7106;
	else
	    class528_2_ = node;
	if (class528_2_ == aClass528_8655) {
	    ((Class688) this).aClass528_8656 = null;
	    return null;
	}
	((Class688) this).aClass528_8656 = class528_2_.aClass528_7106;
	return class528_2_;
    }
    
    public Node method8036(byte i) {
	return method8043(null, (byte) 22);
    }
    
    public Node method8037(int i) {
	Node node = ((Class688) this).aClass528_8656;
	if (node == aClass528_8655) {
	    ((Class688) this).aClass528_8656 = null;
	    return null;
	}
	((Class688) this).aClass528_8656 = node.aClass528_7106;
	return node;
    }
    
    public Node method8038(int i) {
	Node node = ((Class688) this).aClass528_8656;
	if (node == aClass528_8655) {
	    ((Class688) this).aClass528_8656 = null;
	    return null;
	}
	((Class688) this).aClass528_8656 = node.aClass528_7105;
	return node;
    }
    
    public int method8039(int i) {
	int i_3_ = 0;
	for (Node node = aClass528_8655.aClass528_7106;
	     aClass528_8655 != node; node = node.aClass528_7106)
	    i_3_++;
	return i_3_;
    }
    
    public boolean method8040(byte i) {
	return aClass528_8655.aClass528_7106 == aClass528_8655;
    }
    
    Node[] method8041(byte i) {
	Node[] class528s = new Node[method8039(-470240995)];
	int i_4_ = 0;
	for (Node node = aClass528_8655.aClass528_7106;
	     aClass528_8655 != node; node = node.aClass528_7106)
	    class528s[i_4_++] = node;
	return class528s;
    }
    
    public boolean isEmpty() {
	return method8040((byte) -103);
    }
    
    public boolean contains(Object object) {
	throw new RuntimeException();
    }
    
    public Object[] toArray() {
	return method8041((byte) -31);
    }
    
    boolean method8042(Node node, int i) {
	method8031(node, (byte) -4);
	return true;
    }
    
    public boolean containsAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean add(Object object) {
	return method8042((Node) object, -1380614842);
    }
    
    Node method8043(Node node, byte i) {
	Node class528_5_;
	if (node == null)
	    class528_5_ = aClass528_8655.aClass528_7105;
	else
	    class528_5_ = node;
	if (aClass528_8655 == class528_5_) {
	    ((Class688) this).aClass528_8656 = null;
	    return null;
	}
	((Class688) this).aClass528_8656 = class528_5_.aClass528_7105;
	return class528_5_;
    }
    
    public boolean retainAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public void clear() {
	method8059((byte) 13);
    }
    
    public int size() {
	return method8039(-697288214);
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public int hashCode() {
	return super.hashCode();
    }
    
    public Object[] toArray(Object[] objects) {
	int i = 0;
	for (Node node = aClass528_8655.aClass528_7106;
	     node != aClass528_8655; node = node.aClass528_7106)
	    objects[i++] = node;
	return objects;
    }
    
    public boolean method8044(Object object) {
	return super.equals(object);
    }
    
    public int method8045() {
	return super.hashCode();
    }
    
    public boolean method8046(Object object) {
	return super.equals(object);
    }
    
    public boolean addAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public Iterator method8047() {
	return new Class703(this);
    }
    
    public int method8048() {
	return method8039(716013783);
    }
    
    public int method8049() {
	return method8039(-2110201807);
    }
    
    public boolean method8050(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method8051(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method8052(Object object) {
	throw new RuntimeException();
    }
    
    public Object[] method8053() {
	return method8041((byte) -106);
    }
    
    public void method8054(Class688 class688_6_, int i) {
	if (aClass528_8655 != aClass528_8655.aClass528_7106)
	    method8033(class688_6_, aClass528_8655.aClass528_7106, 52974634);
    }
    
    public void method8055() {
	while (aClass528_8655 != aClass528_8655.aClass528_7106)
	    aClass528_8655.aClass528_7106.method6443(-1737235748);
    }
    
    public int method8056() {
	return super.hashCode();
    }
    
    public int method8057() {
	return super.hashCode();
    }
    
    public void method8058() {
	while (aClass528_8655 != aClass528_8655.aClass528_7106)
	    aClass528_8655.aClass528_7106.method6443(-1679733681);
    }
    
    public void method8059(byte i) {
	while (aClass528_8655 != aClass528_8655.aClass528_7106)
	    aClass528_8655.aClass528_7106.method6443(-1838708661);
    }
    
    public boolean method8060() {
	return method8040((byte) -110);
    }
    
    public Class688() {
	aClass528_8655.aClass528_7106 = aClass528_8655;
	aClass528_8655.aClass528_7105 = aClass528_8655;
    }
    
    public boolean remove(Object object) {
	throw new RuntimeException();
    }
    
    public Iterator iterator() {
	return new Class703(this);
    }
    
    static final void method8061(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_7_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	boolean bool = ((((Class648) class648).anIntArray8394
			 [717927929 * ((Class648) class648).anInt8395 + 1])
			== 1);
	Class528_Sub41.method9602(i_7_, string, bool, -1594370151);
    }
}
