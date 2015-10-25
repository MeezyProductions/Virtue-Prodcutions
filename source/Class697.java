/* Class697 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class697 implements Iterator
{
    int anInt8715;
    Node aClass528_8716;
    Class692 aClass692_8717;
    Node aClass528_8718 = null;
    
    void method8193(int i) {
	((Class697) this).aClass528_8716
	    = (((Class692) ((Class697) this).aClass692_8717).aClass528Array8686
	       [0].aClass528_7106);
	((Class697) this).anInt8715 = 1536705107;
	((Class697) this).aClass528_8718 = null;
    }
    
    public boolean hasNext() {
	if (((Class697) this).aClass528_8716
	    != (((Class692) ((Class697) this).aClass692_8717)
		.aClass528Array8686
		[651252187 * ((Class697) this).anInt8715 - 1]))
	    return true;
	while (651252187 * ((Class697) this).anInt8715
	       < (1361072533
		  * ((Class692) ((Class697) this).aClass692_8717).anInt8687)) {
	    if ((((Class692) ((Class697) this).aClass692_8717)
		 .aClass528Array8686
		 [(((Class697) this).anInt8715 += 1536705107) * 651252187 - 1]
		 .aClass528_7106)
		!= (((Class692) ((Class697) this).aClass692_8717)
		    .aClass528Array8686
		    [((Class697) this).anInt8715 * 651252187 - 1])) {
		((Class697) this).aClass528_8716
		    = (((Class692) ((Class697) this).aClass692_8717)
		       .aClass528Array8686
		       [651252187 * ((Class697) this).anInt8715 - 1]
		       .aClass528_7106);
		return true;
	    }
	    ((Class697) this).aClass528_8716
		= (((Class692) ((Class697) this).aClass692_8717)
		   .aClass528Array8686
		   [651252187 * ((Class697) this).anInt8715 - 1]);
	}
	return false;
    }
    
    public Node method8194(int i) {
	method8193(1335368395);
	return (Node) next();
    }
    
    void method8195() {
	((Class697) this).aClass528_8716
	    = (((Class692) ((Class697) this).aClass692_8717).aClass528Array8686
	       [0].aClass528_7106);
	((Class697) this).anInt8715 = 1536705107;
	((Class697) this).aClass528_8718 = null;
    }
    
    public boolean method8196() {
	if (((Class697) this).aClass528_8716
	    != (((Class692) ((Class697) this).aClass692_8717)
		.aClass528Array8686
		[651252187 * ((Class697) this).anInt8715 - 1]))
	    return true;
	while (651252187 * ((Class697) this).anInt8715
	       < (1361072533
		  * ((Class692) ((Class697) this).aClass692_8717).anInt8687)) {
	    if ((((Class692) ((Class697) this).aClass692_8717)
		 .aClass528Array8686
		 [(((Class697) this).anInt8715 += 1536705107) * 651252187 - 1]
		 .aClass528_7106)
		!= (((Class692) ((Class697) this).aClass692_8717)
		    .aClass528Array8686
		    [((Class697) this).anInt8715 * 651252187 - 1])) {
		((Class697) this).aClass528_8716
		    = (((Class692) ((Class697) this).aClass692_8717)
		       .aClass528Array8686
		       [651252187 * ((Class697) this).anInt8715 - 1]
		       .aClass528_7106);
		return true;
	    }
	    ((Class697) this).aClass528_8716
		= (((Class692) ((Class697) this).aClass692_8717)
		   .aClass528Array8686
		   [651252187 * ((Class697) this).anInt8715 - 1]);
	}
	return false;
    }
    
    public void remove() {
	if (((Class697) this).aClass528_8718 == null)
	    throw new IllegalStateException();
	((Class697) this).aClass528_8718.method6443(-435549495);
	((Class697) this).aClass528_8718 = null;
    }
    
    void method8197() {
	((Class697) this).aClass528_8716
	    = (((Class692) ((Class697) this).aClass692_8717).aClass528Array8686
	       [0].aClass528_7106);
	((Class697) this).anInt8715 = 1536705107;
	((Class697) this).aClass528_8718 = null;
    }
    
    public void method8198() {
	if (((Class697) this).aClass528_8718 == null)
	    throw new IllegalStateException();
	((Class697) this).aClass528_8718.method6443(-1500234074);
	((Class697) this).aClass528_8718 = null;
    }
    
    public void method8199() {
	if (((Class697) this).aClass528_8718 == null)
	    throw new IllegalStateException();
	((Class697) this).aClass528_8718.method6443(543101345);
	((Class697) this).aClass528_8718 = null;
    }
    
    public Object method8200() {
	if ((((Class692) ((Class697) this).aClass692_8717).aClass528Array8686
	     [651252187 * ((Class697) this).anInt8715 - 1])
	    != ((Class697) this).aClass528_8716) {
	    Node node = ((Class697) this).aClass528_8716;
	    ((Class697) this).aClass528_8716 = node.aClass528_7106;
	    ((Class697) this).aClass528_8718 = node;
	    return node;
	}
	while (651252187 * ((Class697) this).anInt8715
	       < (((Class692) ((Class697) this).aClass692_8717).anInt8687
		  * 1361072533)) {
	    Node node
		= (((Class692) ((Class697) this).aClass692_8717)
		   .aClass528Array8686
		   [((((Class697) this).anInt8715 += 1536705107) * 651252187
		     - 1)]
		   .aClass528_7106);
	    if (node != (((Class692) ((Class697) this).aClass692_8717)
			     .aClass528Array8686
			     [((Class697) this).anInt8715 * 651252187 - 1])) {
		((Class697) this).aClass528_8716 = node.aClass528_7106;
		((Class697) this).aClass528_8718 = node;
		return node;
	    }
	}
	return null;
    }
    
    public boolean method8201() {
	if (((Class697) this).aClass528_8716
	    != (((Class692) ((Class697) this).aClass692_8717)
		.aClass528Array8686
		[651252187 * ((Class697) this).anInt8715 - 1]))
	    return true;
	while (651252187 * ((Class697) this).anInt8715
	       < (1361072533
		  * ((Class692) ((Class697) this).aClass692_8717).anInt8687)) {
	    if ((((Class692) ((Class697) this).aClass692_8717)
		 .aClass528Array8686
		 [(((Class697) this).anInt8715 += 1536705107) * 651252187 - 1]
		 .aClass528_7106)
		!= (((Class692) ((Class697) this).aClass692_8717)
		    .aClass528Array8686
		    [((Class697) this).anInt8715 * 651252187 - 1])) {
		((Class697) this).aClass528_8716
		    = (((Class692) ((Class697) this).aClass692_8717)
		       .aClass528Array8686
		       [651252187 * ((Class697) this).anInt8715 - 1]
		       .aClass528_7106);
		return true;
	    }
	    ((Class697) this).aClass528_8716
		= (((Class692) ((Class697) this).aClass692_8717)
		   .aClass528Array8686
		   [651252187 * ((Class697) this).anInt8715 - 1]);
	}
	return false;
    }
    
    public Object next() {
	if ((((Class692) ((Class697) this).aClass692_8717).aClass528Array8686
	     [651252187 * ((Class697) this).anInt8715 - 1])
	    != ((Class697) this).aClass528_8716) {
	    Node node = ((Class697) this).aClass528_8716;
	    ((Class697) this).aClass528_8716 = node.aClass528_7106;
	    ((Class697) this).aClass528_8718 = node;
	    return node;
	}
	while (651252187 * ((Class697) this).anInt8715
	       < (((Class692) ((Class697) this).aClass692_8717).anInt8687
		  * 1361072533)) {
	    Node node
		= (((Class692) ((Class697) this).aClass692_8717)
		   .aClass528Array8686
		   [((((Class697) this).anInt8715 += 1536705107) * 651252187
		     - 1)]
		   .aClass528_7106);
	    if (node != (((Class692) ((Class697) this).aClass692_8717)
			     .aClass528Array8686
			     [((Class697) this).anInt8715 * 651252187 - 1])) {
		((Class697) this).aClass528_8716 = node.aClass528_7106;
		((Class697) this).aClass528_8718 = node;
		return node;
	    }
	}
	return null;
    }
    
    public Class697(Class692 class692) {
	((Class697) this).aClass692_8717 = class692;
	method8193(171818151);
    }
    
    void method8202() {
	((Class697) this).aClass528_8716
	    = (((Class692) ((Class697) this).aClass692_8717).aClass528Array8686
	       [0].aClass528_7106);
	((Class697) this).anInt8715 = 1536705107;
	((Class697) this).aClass528_8718 = null;
    }
    
    void method8203() {
	((Class697) this).aClass528_8716
	    = (((Class692) ((Class697) this).aClass692_8717).aClass528Array8686
	       [0].aClass528_7106);
	((Class697) this).anInt8715 = 1536705107;
	((Class697) this).aClass528_8718 = null;
    }
    
    void method8204() {
	((Class697) this).aClass528_8716
	    = (((Class692) ((Class697) this).aClass692_8717).aClass528Array8686
	       [0].aClass528_7106);
	((Class697) this).anInt8715 = 1536705107;
	((Class697) this).aClass528_8718 = null;
    }
    
    public Node method8205() {
	method8193(853664680);
	return (Node) next();
    }
    
    static final void method8206(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aBool10956 ? 1 : 0;
    }
    
    static final void method8207(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class560.method6817(class229, class226, class648,
			    Class227.aClass227_2344, (byte) 126);
    }
}
