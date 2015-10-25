/* AbstractQueue_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue
{
    Comparator aComparator11717;
    Class382[] aClass382Array11718;
    int anInt11719;
    int anInt11720 = 0;
    Map aMap11721;
    
    public Object method10631() {
	if (0 == 288425381 * ((AbstractQueue_Sub1) this).anInt11719)
	    return null;
	return (((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[0])
		.anObject3975);
    }
    
    public Iterator method10632() {
	return new Class390(this);
    }
    
    void method10633(int i) {
	int i_0_ = 1 + (((AbstractQueue_Sub1) this).aClass382Array11718.length
			<< 1);
	((AbstractQueue_Sub1) this).aClass382Array11718
	    = ((Class382[])
	       Arrays.copyOf(((AbstractQueue_Sub1) this).aClass382Array11718,
			     i_0_));
    }
    
    public int size() {
	return ((AbstractQueue_Sub1) this).anInt11719 * 288425381;
    }
    
    public boolean offer(Object object) {
	if (((AbstractQueue_Sub1) this).aMap11721.containsKey(object))
	    throw new IllegalArgumentException("");
	((AbstractQueue_Sub1) this).anInt11720 += 12827253;
	int i = ((AbstractQueue_Sub1) this).anInt11719 * 288425381;
	if (i >= ((AbstractQueue_Sub1) this).aClass382Array11718.length)
	    method10633(-1089097277);
	((AbstractQueue_Sub1) this).anInt11719 += 1408129581;
	if (0 == i) {
	    ((AbstractQueue_Sub1) this).aClass382Array11718[0]
		= new Class382(object, 0);
	    ((AbstractQueue_Sub1) this).aMap11721.put
		(object, ((AbstractQueue_Sub1) this).aClass382Array11718[0]);
	} else {
	    ((AbstractQueue_Sub1) this).aClass382Array11718[i]
		= new Class382(object, i);
	    ((AbstractQueue_Sub1) this).aMap11721.put
		(object, ((AbstractQueue_Sub1) this).aClass382Array11718[i]);
	    method10634(i, 1576737690);
	}
	return true;
    }
    
    public Object[] toArray() {
	Object[] objects = super.toArray();
	if (((AbstractQueue_Sub1) this).aComparator11717 != null)
	    Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator11717);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    public Object poll() {
	if (0 == ((AbstractQueue_Sub1) this).anInt11719 * 288425381)
	    return null;
	((AbstractQueue_Sub1) this).anInt11720 += 12827253;
	Object object
	    = (((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[0])
	       .anObject3975);
	((AbstractQueue_Sub1) this).aMap11721.remove(object);
	((AbstractQueue_Sub1) this).anInt11719 -= 1408129581;
	if (288425381 * ((AbstractQueue_Sub1) this).anInt11719 == 0)
	    ((AbstractQueue_Sub1) this).aClass382Array11718
		[((AbstractQueue_Sub1) this).anInt11719 * 288425381]
		= null;
	else {
	    ((AbstractQueue_Sub1) this).aClass382Array11718[0]
		= (((AbstractQueue_Sub1) this).aClass382Array11718
		   [288425381 * ((AbstractQueue_Sub1) this).anInt11719]);
	    ((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[0])
		.anInt3976
		= 0;
	    ((AbstractQueue_Sub1) this).aClass382Array11718
		[((AbstractQueue_Sub1) this).anInt11719 * 288425381]
		= null;
	    method10635(0, 2101407895);
	}
	return object;
    }
    
    public boolean remove(Object object) {
	Class382 class382
	    = (Class382) ((AbstractQueue_Sub1) this).aMap11721.remove(object);
	if (class382 == null)
	    return false;
	((AbstractQueue_Sub1) this).anInt11720 += 12827253;
	((AbstractQueue_Sub1) this).anInt11719 -= 1408129581;
	if (((AbstractQueue_Sub1) this).anInt11719 * 288425381
	    == -1859950693 * ((Class382) class382).anInt3976) {
	    ((AbstractQueue_Sub1) this).aClass382Array11718
		[((AbstractQueue_Sub1) this).anInt11719 * 288425381]
		= null;
	    return true;
	}
	Class382 class382_1_
	    = (((AbstractQueue_Sub1) this).aClass382Array11718
	       [((AbstractQueue_Sub1) this).anInt11719 * 288425381]);
	((AbstractQueue_Sub1) this).aClass382Array11718
	    [288425381 * ((AbstractQueue_Sub1) this).anInt11719]
	    = null;
	((AbstractQueue_Sub1) this).aClass382Array11718
	    [((Class382) class382).anInt3976 * -1859950693]
	    = class382_1_;
	((Class382) (((AbstractQueue_Sub1) this).aClass382Array11718
		     [-1859950693 * ((Class382) class382).anInt3976]))
	    .anInt3976
	    = 1 * ((Class382) class382).anInt3976;
	method10635(-1859950693 * ((Class382) class382).anInt3976, 2093426838);
	if (class382_1_ == (((AbstractQueue_Sub1) this).aClass382Array11718
			    [-1859950693 * ((Class382) class382).anInt3976]))
	    method10634(((Class382) class382).anInt3976 * -1859950693,
			1908822664);
	return true;
    }
    
    void method10634(int i, int i_2_) {
	Class382 class382 = ((AbstractQueue_Sub1) this).aClass382Array11718[i];
	int i_3_;
	for (/**/; i > 0; i = i_3_) {
	    i_3_ = i - 1 >>> 1;
	    Class382 class382_4_
		= ((AbstractQueue_Sub1) this).aClass382Array11718[i_3_];
	    if (((AbstractQueue_Sub1) this).aComparator11717 != null) {
		if ((((AbstractQueue_Sub1) this).aComparator11717.compare
		     (((Class382) class382).anObject3975,
		      ((Class382) class382_4_).anObject3975))
		    >= 0)
		    break;
	    } else if (((Comparable) ((Class382) class382).anObject3975)
			   .compareTo(((Class382) class382_4_).anObject3975)
		       >= 0)
		break;
	    ((AbstractQueue_Sub1) this).aClass382Array11718[i] = class382_4_;
	    ((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[i])
		.anInt3976
		= 516400787 * i;
	}
	((AbstractQueue_Sub1) this).aClass382Array11718[i] = class382;
	((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[i])
	    .anInt3976
	    = i * 516400787;
    }
    
    void method10635(int i, int i_5_) {
	Class382 class382 = ((AbstractQueue_Sub1) this).aClass382Array11718[i];
	int i_6_;
	for (int i_7_
		 = ((AbstractQueue_Sub1) this).anInt11719 * 288425381 >>> 1;
	     i < i_7_; i = i_6_) {
	    int i_8_ = 1 + (i << 1);
	    Class382 class382_9_
		= ((AbstractQueue_Sub1) this).aClass382Array11718[i_8_];
	    int i_10_ = 2 + (i << 1);
	    Class382 class382_11_
		= ((AbstractQueue_Sub1) this).aClass382Array11718[i_10_];
	    if (((AbstractQueue_Sub1) this).aComparator11717 != null) {
		if (i_10_ < 288425381 * ((AbstractQueue_Sub1) this).anInt11719
		    && (((AbstractQueue_Sub1) this).aComparator11717.compare
			(((Class382) class382_9_).anObject3975,
			 ((Class382) class382_11_).anObject3975)) > 0)
		    i_6_ = i_10_;
		else
		    i_6_ = i_8_;
	    } else if ((i_10_
			< ((AbstractQueue_Sub1) this).anInt11719 * 288425381)
		       && (((Comparable) ((Class382) class382_9_).anObject3975)
			       .compareTo
			   (((Class382) class382_11_).anObject3975)) > 0)
		i_6_ = i_10_;
	    else
		i_6_ = i_8_;
	    if (null != ((AbstractQueue_Sub1) this).aComparator11717) {
		if ((((AbstractQueue_Sub1) this).aComparator11717.compare
		     (((Class382) class382).anObject3975,
		      ((Class382) (((AbstractQueue_Sub1) this)
				   .aClass382Array11718[i_6_])).anObject3975))
		    <= 0)
		    break;
	    } else if ((((Comparable) ((Class382) class382).anObject3975)
			    .compareTo
			(((Class382) (((AbstractQueue_Sub1) this)
				      .aClass382Array11718[i_6_]))
			 .anObject3975))
		       <= 0)
		break;
	    ((AbstractQueue_Sub1) this).aClass382Array11718[i]
		= ((AbstractQueue_Sub1) this).aClass382Array11718[i_6_];
	    ((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[i])
		.anInt3976
		= 516400787 * i;
	}
	((AbstractQueue_Sub1) this).aClass382Array11718[i] = class382;
	((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[i])
	    .anInt3976
	    = i * 516400787;
    }
    
    public Iterator iterator() {
	return new Class390(this);
    }
    
    public boolean contains(Object object) {
	return ((AbstractQueue_Sub1) this).aMap11721.containsKey(object);
    }
    
    public int method10636() {
	return ((AbstractQueue_Sub1) this).anInt11719 * 288425381;
    }
    
    public Object method10637() {
	if (0 == 288425381 * ((AbstractQueue_Sub1) this).anInt11719)
	    return null;
	return (((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[0])
		.anObject3975);
    }
    
    public int method10638() {
	return ((AbstractQueue_Sub1) this).anInt11719 * 288425381;
    }
    
    public AbstractQueue_Sub1(int i, Comparator comparator) {
	((AbstractQueue_Sub1) this).aClass382Array11718 = new Class382[i];
	((AbstractQueue_Sub1) this).aMap11721 = new HashMap();
	((AbstractQueue_Sub1) this).aComparator11717 = comparator;
    }
    
    public boolean method10639(Object object) {
	Class382 class382
	    = (Class382) ((AbstractQueue_Sub1) this).aMap11721.remove(object);
	if (class382 == null)
	    return false;
	((AbstractQueue_Sub1) this).anInt11720 += 12827253;
	((AbstractQueue_Sub1) this).anInt11719 -= 1408129581;
	if (((AbstractQueue_Sub1) this).anInt11719 * 288425381
	    == -1859950693 * ((Class382) class382).anInt3976) {
	    ((AbstractQueue_Sub1) this).aClass382Array11718
		[((AbstractQueue_Sub1) this).anInt11719 * 288425381]
		= null;
	    return true;
	}
	Class382 class382_12_
	    = (((AbstractQueue_Sub1) this).aClass382Array11718
	       [((AbstractQueue_Sub1) this).anInt11719 * 288425381]);
	((AbstractQueue_Sub1) this).aClass382Array11718
	    [288425381 * ((AbstractQueue_Sub1) this).anInt11719]
	    = null;
	((AbstractQueue_Sub1) this).aClass382Array11718
	    [((Class382) class382).anInt3976 * -1859950693]
	    = class382_12_;
	((Class382) (((AbstractQueue_Sub1) this).aClass382Array11718
		     [-1859950693 * ((Class382) class382).anInt3976]))
	    .anInt3976
	    = 1 * ((Class382) class382).anInt3976;
	method10635(-1859950693 * ((Class382) class382).anInt3976, 2097206922);
	if (class382_12_ == (((AbstractQueue_Sub1) this).aClass382Array11718
			     [-1859950693 * ((Class382) class382).anInt3976]))
	    method10634(((Class382) class382).anInt3976 * -1859950693,
			-1590961241);
	return true;
    }
    
    void method10640(int i) {
	Class382 class382 = ((AbstractQueue_Sub1) this).aClass382Array11718[i];
	int i_13_;
	for (int i_14_
		 = ((AbstractQueue_Sub1) this).anInt11719 * 288425381 >>> 1;
	     i < i_14_; i = i_13_) {
	    int i_15_ = 1 + (i << 1);
	    Class382 class382_16_
		= ((AbstractQueue_Sub1) this).aClass382Array11718[i_15_];
	    int i_17_ = 2 + (i << 1);
	    Class382 class382_18_
		= ((AbstractQueue_Sub1) this).aClass382Array11718[i_17_];
	    if (((AbstractQueue_Sub1) this).aComparator11717 != null) {
		if (i_17_ < 288425381 * ((AbstractQueue_Sub1) this).anInt11719
		    && (((AbstractQueue_Sub1) this).aComparator11717.compare
			(((Class382) class382_16_).anObject3975,
			 ((Class382) class382_18_).anObject3975)) > 0)
		    i_13_ = i_17_;
		else
		    i_13_ = i_15_;
	    } else if ((i_17_
			< ((AbstractQueue_Sub1) this).anInt11719 * 288425381)
		       && (((Comparable)
			    ((Class382) class382_16_).anObject3975)
			       .compareTo
			   (((Class382) class382_18_).anObject3975)) > 0)
		i_13_ = i_17_;
	    else
		i_13_ = i_15_;
	    if (null != ((AbstractQueue_Sub1) this).aComparator11717) {
		if ((((AbstractQueue_Sub1) this).aComparator11717.compare
		     (((Class382) class382).anObject3975,
		      ((Class382) (((AbstractQueue_Sub1) this)
				   .aClass382Array11718[i_13_])).anObject3975))
		    <= 0)
		    break;
	    } else if ((((Comparable) ((Class382) class382).anObject3975)
			    .compareTo
			(((Class382) (((AbstractQueue_Sub1) this)
				      .aClass382Array11718[i_13_]))
			 .anObject3975))
		       <= 0)
		break;
	    ((AbstractQueue_Sub1) this).aClass382Array11718[i]
		= ((AbstractQueue_Sub1) this).aClass382Array11718[i_13_];
	    ((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[i])
		.anInt3976
		= 516400787 * i;
	}
	((AbstractQueue_Sub1) this).aClass382Array11718[i] = class382;
	((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[i])
	    .anInt3976
	    = i * 516400787;
    }
    
    public Object peek() {
	if (0 == 288425381 * ((AbstractQueue_Sub1) this).anInt11719)
	    return null;
	return (((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[0])
		.anObject3975);
    }
    
    void method10641(int i) {
	Class382 class382 = ((AbstractQueue_Sub1) this).aClass382Array11718[i];
	int i_19_;
	for (/**/; i > 0; i = i_19_) {
	    i_19_ = i - 1 >>> 1;
	    Class382 class382_20_
		= ((AbstractQueue_Sub1) this).aClass382Array11718[i_19_];
	    if (((AbstractQueue_Sub1) this).aComparator11717 != null) {
		if ((((AbstractQueue_Sub1) this).aComparator11717.compare
		     (((Class382) class382).anObject3975,
		      ((Class382) class382_20_).anObject3975))
		    >= 0)
		    break;
	    } else if (((Comparable) ((Class382) class382).anObject3975)
			   .compareTo(((Class382) class382_20_).anObject3975)
		       >= 0)
		break;
	    ((AbstractQueue_Sub1) this).aClass382Array11718[i] = class382_20_;
	    ((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[i])
		.anInt3976
		= 516400787 * i;
	}
	((AbstractQueue_Sub1) this).aClass382Array11718[i] = class382;
	((Class382) ((AbstractQueue_Sub1) this).aClass382Array11718[i])
	    .anInt3976
	    = i * 516400787;
    }
    
    public AbstractQueue_Sub1(int i) {
	this(i, null);
    }
    
    public boolean method10642(Object object) {
	return ((AbstractQueue_Sub1) this).aMap11721.containsKey(object);
    }
    
    public boolean method10643(Object object) {
	return ((AbstractQueue_Sub1) this).aMap11721.containsKey(object);
    }
    
    public Object[] method10644() {
	Object[] objects = super.toArray();
	if (((AbstractQueue_Sub1) this).aComparator11717 != null)
	    Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator11717);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    public Object[] method10645() {
	Object[] objects = super.toArray();
	if (((AbstractQueue_Sub1) this).aComparator11717 != null)
	    Arrays.sort(objects, ((AbstractQueue_Sub1) this).aComparator11717);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    static final void method10646(Class648 class648, int i) {
	Class602_Sub1 class602_sub1 = Class272.method3690(1805059741);
	if (class602_sub1 != null) {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -336009345 * class602_sub1.anInt10631;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -736802669 * class602_sub1.anInt7877;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class602_sub1.aString10629;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= class602_sub1.method9583(1551156498);
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class602_sub1.method9584(2040571771);
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= class602_sub1.anInt7873 * 1759698505;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 1955028611 * class602_sub1.anInt10627;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class602_sub1.aString10630;
	} else {
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= -1;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= 0;
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	}
    }
}
