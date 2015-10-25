/* Class692 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public final class Class692 implements Iterable
{
    Node[] aClass528Array8686;
    int anInt8687;
    Node aClass528_8688;
    long aLong8689;
    Node aClass528_8690;
    int anInt8691 = 0;
    
    public int method8136(Node[] class528s, int i) {
	int i_0_ = 0;
	for (int i_1_ = 0; i_1_ < 1361072533 * ((Class692) this).anInt8687;
	     i_1_++) {
	    Node node = ((Class692) this).aClass528Array8686[i_1_];
	    for (Node class528_2_ = node.aClass528_7106;
		 class528_2_ != node;
		 class528_2_ = class528_2_.aClass528_7106)
		class528s[i_0_++] = class528_2_;
	}
	return i_0_;
    }
    
    public Node method8137(long l) {
	((Class692) this).aLong8689 = l * -4990737163116640265L;
	Node node
	    = (((Class692) this).aClass528Array8686
	       [(int) (l & (long) (1361072533 * ((Class692) this).anInt8687
				   - 1))]);
	for (((Class692) this).aClass528_8688 = node.aClass528_7106;
	     node != ((Class692) this).aClass528_8688;
	     ((Class692) this).aClass528_8688
		 = ((Class692) this).aClass528_8688.aClass528_7106) {
	    if ((-4849232331708333273L
		 * ((Class692) this).aClass528_8688.aLong7107)
		== l) {
		Node class528_3_ = ((Class692) this).aClass528_8688;
		((Class692) this).aClass528_8688
		    = ((Class692) this).aClass528_8688.aClass528_7106;
		return class528_3_;
	    }
	}
	((Class692) this).aClass528_8688 = null;
	return null;
    }
    
    public Node method8138(int i) {
	if (1492913761 * ((Class692) this).anInt8691 > 0
	    && (((Class692) this).aClass528_8690
		!= (((Class692) this).aClass528Array8686
		    [1492913761 * ((Class692) this).anInt8691 - 1]))) {
	    Node node = ((Class692) this).aClass528_8690;
	    ((Class692) this).aClass528_8690 = node.aClass528_7106;
	    return node;
	}
	while (((Class692) this).anInt8691 * 1492913761
	       < ((Class692) this).anInt8687 * 1361072533) {
	    Node node
		= (((Class692) this).aClass528Array8686
		   [((((Class692) this).anInt8691 += 1567430049) * 1492913761
		     - 1)]
		   .aClass528_7106);
	    if (node != (((Class692) this).aClass528Array8686
			     [((Class692) this).anInt8691 * 1492913761 - 1])) {
		((Class692) this).aClass528_8690 = node.aClass528_7106;
		return node;
	    }
	}
	return null;
    }
    
    public int method8139(short i) {
	int i_4_ = 0;
	for (int i_5_ = 0; i_5_ < 1361072533 * ((Class692) this).anInt8687;
	     i_5_++) {
	    Node node = ((Class692) this).aClass528Array8686[i_5_];
	    for (Node class528_6_ = node.aClass528_7106;
		 class528_6_ != node;
		 class528_6_ = class528_6_.aClass528_7106)
		i_4_++;
	}
	return i_4_;
    }
    
    public int method8140() {
	int i = 0;
	for (int i_7_ = 0; i_7_ < 1361072533 * ((Class692) this).anInt8687;
	     i_7_++) {
	    Node node = ((Class692) this).aClass528Array8686[i_7_];
	    for (Node class528_8_ = node.aClass528_7106;
		 class528_8_ != node;
		 class528_8_ = class528_8_.aClass528_7106)
		i++;
	}
	return i;
    }
    
    public void method8141(int i) {
	for (int i_9_ = 0; i_9_ < 1361072533 * ((Class692) this).anInt8687;
	     i_9_++) {
	    Node node = ((Class692) this).aClass528Array8686[i_9_];
	    for (;;) {
		Node class528_10_ = node.aClass528_7106;
		if (node == class528_10_)
		    break;
		class528_10_.method6443(1533211055);
	    }
	}
	((Class692) this).aClass528_8688 = null;
	((Class692) this).aClass528_8690 = null;
    }
    
    public Iterator iterator() {
	return new Class697(this);
    }
    
    public void method8142(Node node, long l) {
	if (null != node.aClass528_7105)
	    node.method6443(771667676);
	Node class528_11_
	    = (((Class692) this).aClass528Array8686
	       [(int) (l & (long) (1361072533 * ((Class692) this).anInt8687
				   - 1))]);
	node.aClass528_7105 = class528_11_.aClass528_7105;
	node.aClass528_7106 = class528_11_;
	node.aClass528_7105.aClass528_7106 = node;
	node.aClass528_7106.aClass528_7105 = node;
	node.aLong7107 = -9171965245836510057L * l;
    }
    
    public Node method8143(short i) {
	if (null == ((Class692) this).aClass528_8688)
	    return null;
	for (Node node
		 = (((Class692) this).aClass528Array8686
		    [(int) (-8809101368748447289L * ((Class692) this).aLong8689
			    & (long) (1361072533 * ((Class692) this).anInt8687
				      - 1))]);
	     ((Class692) this).aClass528_8688 != node;
	     ((Class692) this).aClass528_8688
		 = ((Class692) this).aClass528_8688.aClass528_7106) {
	    if ((-4849232331708333273L
		 * ((Class692) this).aClass528_8688.aLong7107)
		== -8809101368748447289L * ((Class692) this).aLong8689) {
		Node class528_12_ = ((Class692) this).aClass528_8688;
		((Class692) this).aClass528_8688
		    = ((Class692) this).aClass528_8688.aClass528_7106;
		return class528_12_;
	    }
	}
	((Class692) this).aClass528_8688 = null;
	return null;
    }
    
    public Iterator method8144() {
	return new Class697(this);
    }
    
    public void method8145() {
	for (int i = 0; i < 1361072533 * ((Class692) this).anInt8687; i++) {
	    Node node = ((Class692) this).aClass528Array8686[i];
	    for (;;) {
		Node class528_13_ = node.aClass528_7106;
		if (node == class528_13_)
		    break;
		class528_13_.method6443(-826760703);
	    }
	}
	((Class692) this).aClass528_8688 = null;
	((Class692) this).aClass528_8690 = null;
    }
    
    public Class692(int i) {
	((Class692) this).anInt8687 = 1683845565 * i;
	((Class692) this).aClass528Array8686 = new Node[i];
	for (int i_14_ = 0; i_14_ < i; i_14_++) {
	    Node node
		= ((Class692) this).aClass528Array8686[i_14_] = new Node();
	    node.aClass528_7106 = node;
	    node.aClass528_7105 = node;
	}
    }
    
    public Node method8146(int i) {
	((Class692) this).anInt8691 = 0;
	return method8138(-397355972);
    }
    
    public int method8147() {
	int i = 0;
	for (int i_15_ = 0; i_15_ < 1361072533 * ((Class692) this).anInt8687;
	     i_15_++) {
	    Node node = ((Class692) this).aClass528Array8686[i_15_];
	    for (Node class528_16_ = node.aClass528_7106;
		 class528_16_ != node;
		 class528_16_ = class528_16_.aClass528_7106)
		i++;
	}
	return i;
    }
    
    public int method8148() {
	int i = 0;
	for (int i_17_ = 0; i_17_ < 1361072533 * ((Class692) this).anInt8687;
	     i_17_++) {
	    Node node = ((Class692) this).aClass528Array8686[i_17_];
	    for (Node class528_18_ = node.aClass528_7106;
		 class528_18_ != node;
		 class528_18_ = class528_18_.aClass528_7106)
		i++;
	}
	return i;
    }
    
    public Node method8149() {
	if (null == ((Class692) this).aClass528_8688)
	    return null;
	for (Node node
		 = (((Class692) this).aClass528Array8686
		    [(int) (-8809101368748447289L * ((Class692) this).aLong8689
			    & (long) (1361072533 * ((Class692) this).anInt8687
				      - 1))]);
	     ((Class692) this).aClass528_8688 != node;
	     ((Class692) this).aClass528_8688
		 = ((Class692) this).aClass528_8688.aClass528_7106) {
	    if ((-4849232331708333273L
		 * ((Class692) this).aClass528_8688.aLong7107)
		== -8809101368748447289L * ((Class692) this).aLong8689) {
		Node class528_19_ = ((Class692) this).aClass528_8688;
		((Class692) this).aClass528_8688
		    = ((Class692) this).aClass528_8688.aClass528_7106;
		return class528_19_;
	    }
	}
	((Class692) this).aClass528_8688 = null;
	return null;
    }
    
    public void method8150() {
	for (int i = 0; i < 1361072533 * ((Class692) this).anInt8687; i++) {
	    Node node = ((Class692) this).aClass528Array8686[i];
	    for (;;) {
		Node class528_20_ = node.aClass528_7106;
		if (node == class528_20_)
		    break;
		class528_20_.method6443(77884119);
	    }
	}
	((Class692) this).aClass528_8688 = null;
	((Class692) this).aClass528_8690 = null;
    }
    
    public void method8151() {
	for (int i = 0; i < 1361072533 * ((Class692) this).anInt8687; i++) {
	    Node node = ((Class692) this).aClass528Array8686[i];
	    for (;;) {
		Node class528_21_ = node.aClass528_7106;
		if (node == class528_21_)
		    break;
		class528_21_.method6443(600403234);
	    }
	}
	((Class692) this).aClass528_8688 = null;
	((Class692) this).aClass528_8690 = null;
    }
    
    public static void method8152
	(NPC class645_sub1_sub5_sub1_sub1, int i) {
	for (Class528_Sub11 class528_sub11
		 = ((Class528_Sub11)
		    Class528_Sub11.aClass688_10313.method8034(1727675243));
	     class528_sub11 != null;
	     class528_sub11 = (Class528_Sub11) Class528_Sub11
						   .aClass688_10313
						   .method8037(-780508018)) {
	    if (class645_sub1_sub5_sub1_sub1
		== (((Class528_Sub11) class528_sub11)
		    .aClass645_Sub1_Sub5_Sub1_Sub1_10326)) {
		if (((Class528_Sub11) class528_sub11).aClass469_10337
		    != null) {
		    ((Class528_Sub11) class528_sub11).aClass469_10337
			.method5742(100, 2061758703);
		    Class365.aClass218_3848.method3101((((Class528_Sub11)
							 class528_sub11)
							.aClass469_10337),
						       1516235275);
		    ((Class528_Sub11) class528_sub11).aClass469_10337 = null;
		}
		class528_sub11.method6443(1149454950);
		break;
	    }
	}
    }
    
    static final void method8153(Class648 class648, int i) {
	int i_22_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_22_, (byte) 8);
	Class226 class226 = Class380.aClass226Array3970[i_22_ >> 16];
	Entity.method10728(class229, class226, class648,
					    (byte) -72);
    }
}
