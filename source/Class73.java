/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class73
{
    WeakReference_Sub1[] aWeakReference_Sub1Array779;
    int anInt780;
    ReferenceQueue aReferenceQueue781 = new ReferenceQueue();
    public static short[][][] aShortArrayArrayArray782;
    static Class151[] aClass151Array783;
    
    public Class73() {
	((Class73) this).aWeakReference_Sub1Array779
	    = new WeakReference_Sub1[16];
    }
    
    void method1103(byte i) {
	WeakReference_Sub1[] weakreference_sub1s
	    = ((Class73) this).aWeakReference_Sub1Array779;
	((Class73) this).aWeakReference_Sub1Array779
	    = new WeakReference_Sub1[weakreference_sub1s.length * 2];
	WeakReference_Sub1[] weakreference_sub1s_0_ = weakreference_sub1s;
	for (int i_1_ = 0; i_1_ < weakreference_sub1s_0_.length; i_1_++) {
	    WeakReference_Sub1 weakreference_sub1_2_;
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s_0_[i_1_];
		 null != weakreference_sub1;
		 weakreference_sub1 = weakreference_sub1_2_) {
		weakreference_sub1_2_
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_11752);
		int i_3_
		    = ((1419488419
			* ((WeakReference_Sub1) weakreference_sub1).anInt11753)
		       & (((Class73) this).aWeakReference_Sub1Array779.length
			  - 1));
		((WeakReference_Sub1) weakreference_sub1)
		    .aWeakReference_Sub1_11752
		    = ((Class73) this).aWeakReference_Sub1Array779[i_3_];
		((Class73) this).aWeakReference_Sub1Array779[i_3_]
		    = weakreference_sub1;
	    }
	}
    }
    
    public ArrayList method1104(int i) {
	method1106((byte) -2);
	ArrayList arraylist
	    = new ArrayList(-2114770197 * ((Class73) this).anInt780);
	WeakReference_Sub1[] weakreference_sub1s
	    = ((Class73) this).aWeakReference_Sub1Array779;
	for (int i_4_ = 0; i_4_ < weakreference_sub1s.length; i_4_++) {
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s[i_4_];
		 null != weakreference_sub1;
		 weakreference_sub1
		     = (((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_11752)) {
		Object object = weakreference_sub1.get();
		if (null != object)
		    arraylist.add(object);
	    }
	}
	return arraylist;
    }
    
    public void method1105(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method1106((byte) -37);
	int i = System.identityHashCode(object);
	int i_5_ = i & ((Class73) this).aWeakReference_Sub1Array779.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class73) this).aWeakReference_Sub1Array779[i_5_];
	if (null != weakreference_sub1) {
	    if (weakreference_sub1.get() == object) {
		((Class73) this).aWeakReference_Sub1Array779[i_5_]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_11752);
		((Class73) this).anInt780 -= 452013507;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_6_
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_11752);
		    if (null == weakreference_sub1_6_)
			break;
		    if (weakreference_sub1_6_.get() == object) {
			((WeakReference_Sub1) weakreference_sub1)
			    .aWeakReference_Sub1_11752
			    = (((WeakReference_Sub1) weakreference_sub1_6_)
			       .aWeakReference_Sub1_11752);
			((Class73) this).anInt780 -= 452013507;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_6_;
		}
	    }
	}
    }
    
    void method1106(byte i) {
	for (;;) {
	    WeakReference_Sub1 weakreference_sub1
		= ((WeakReference_Sub1)
		   ((Class73) this).aReferenceQueue781.poll());
	    if (null == weakreference_sub1)
		break;
	    int i_7_
		= ((((WeakReference_Sub1) weakreference_sub1).anInt11753
		    * 1419488419)
		   & ((Class73) this).aWeakReference_Sub1Array779.length - 1);
	    WeakReference_Sub1 weakreference_sub1_8_
		= ((Class73) this).aWeakReference_Sub1Array779[i_7_];
	    if (weakreference_sub1_8_ == weakreference_sub1) {
		((Class73) this).aWeakReference_Sub1Array779[i_7_]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_11752);
		((Class73) this).anInt780 -= 452013507;
	    } else {
		for (/**/;
		     (weakreference_sub1_8_ != null
		      && (weakreference_sub1
			  != (((WeakReference_Sub1) weakreference_sub1_8_)
			      .aWeakReference_Sub1_11752)));
		     weakreference_sub1_8_
			 = (((WeakReference_Sub1) weakreference_sub1_8_)
			    .aWeakReference_Sub1_11752)) {
		    /* empty */
		}
		if (null != weakreference_sub1_8_) {
		    ((WeakReference_Sub1) weakreference_sub1_8_)
			.aWeakReference_Sub1_11752
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_11752);
		    ((Class73) this).anInt780 -= 452013507;
		}
	    }
	}
    }
    
    void method1107() {
	for (;;) {
	    WeakReference_Sub1 weakreference_sub1
		= ((WeakReference_Sub1)
		   ((Class73) this).aReferenceQueue781.poll());
	    if (null == weakreference_sub1)
		break;
	    int i
		= ((((WeakReference_Sub1) weakreference_sub1).anInt11753
		    * 1419488419)
		   & ((Class73) this).aWeakReference_Sub1Array779.length - 1);
	    WeakReference_Sub1 weakreference_sub1_9_
		= ((Class73) this).aWeakReference_Sub1Array779[i];
	    if (weakreference_sub1_9_ == weakreference_sub1) {
		((Class73) this).aWeakReference_Sub1Array779[i]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_11752);
		((Class73) this).anInt780 -= 452013507;
	    } else {
		for (/**/;
		     (weakreference_sub1_9_ != null
		      && (weakreference_sub1
			  != (((WeakReference_Sub1) weakreference_sub1_9_)
			      .aWeakReference_Sub1_11752)));
		     weakreference_sub1_9_
			 = (((WeakReference_Sub1) weakreference_sub1_9_)
			    .aWeakReference_Sub1_11752)) {
		    /* empty */
		}
		if (null != weakreference_sub1_9_) {
		    ((WeakReference_Sub1) weakreference_sub1_9_)
			.aWeakReference_Sub1_11752
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_11752);
		    ((Class73) this).anInt780 -= 452013507;
		}
	    }
	}
    }
    
    public void method1108(Object object) {
	if (object == null)
	    throw new NullPointerException();
	method1106((byte) 31);
	int i = System.identityHashCode(object);
	int i_10_
	    = i & ((Class73) this).aWeakReference_Sub1Array779.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class73) this).aWeakReference_Sub1Array779[i_10_];
	if (null != weakreference_sub1) {
	    if (weakreference_sub1.get() == object) {
		((Class73) this).aWeakReference_Sub1Array779[i_10_]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_11752);
		((Class73) this).anInt780 -= 452013507;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_11_
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_11752);
		    if (null == weakreference_sub1_11_)
			break;
		    if (weakreference_sub1_11_.get() == object) {
			((WeakReference_Sub1) weakreference_sub1)
			    .aWeakReference_Sub1_11752
			    = (((WeakReference_Sub1) weakreference_sub1_11_)
			       .aWeakReference_Sub1_11752);
			((Class73) this).anInt780 -= 452013507;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_11_;
		}
	    }
	}
    }
    
    public void method1109(Object object, int i) {
	if (object == null)
	    throw new NullPointerException();
	method1106((byte) -97);
	int i_12_ = System.identityHashCode(object);
	int i_13_
	    = i_12_ & ((Class73) this).aWeakReference_Sub1Array779.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class73) this).aWeakReference_Sub1Array779[i_13_];
	if (null != weakreference_sub1) {
	    if (weakreference_sub1.get() == object) {
		((Class73) this).aWeakReference_Sub1Array779[i_13_]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_11752);
		((Class73) this).anInt780 -= 452013507;
	    } else {
		for (;;) {
		    WeakReference_Sub1 weakreference_sub1_14_
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_11752);
		    if (null == weakreference_sub1_14_)
			break;
		    if (weakreference_sub1_14_.get() == object) {
			((WeakReference_Sub1) weakreference_sub1)
			    .aWeakReference_Sub1_11752
			    = (((WeakReference_Sub1) weakreference_sub1_14_)
			       .aWeakReference_Sub1_11752);
			((Class73) this).anInt780 -= 452013507;
			break;
		    }
		    weakreference_sub1 = weakreference_sub1_14_;
		}
	    }
	}
    }
    
    void method1110() {
	WeakReference_Sub1[] weakreference_sub1s
	    = ((Class73) this).aWeakReference_Sub1Array779;
	((Class73) this).aWeakReference_Sub1Array779
	    = new WeakReference_Sub1[weakreference_sub1s.length * 2];
	WeakReference_Sub1[] weakreference_sub1s_15_ = weakreference_sub1s;
	for (int i = 0; i < weakreference_sub1s_15_.length; i++) {
	    WeakReference_Sub1 weakreference_sub1_16_;
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s_15_[i];
		 null != weakreference_sub1;
		 weakreference_sub1 = weakreference_sub1_16_) {
		weakreference_sub1_16_
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_11752);
		int i_17_
		    = ((1419488419
			* ((WeakReference_Sub1) weakreference_sub1).anInt11753)
		       & (((Class73) this).aWeakReference_Sub1Array779.length
			  - 1));
		((WeakReference_Sub1) weakreference_sub1)
		    .aWeakReference_Sub1_11752
		    = ((Class73) this).aWeakReference_Sub1Array779[i_17_];
		((Class73) this).aWeakReference_Sub1Array779[i_17_]
		    = weakreference_sub1;
	    }
	}
    }
    
    void method1111() {
	WeakReference_Sub1[] weakreference_sub1s
	    = ((Class73) this).aWeakReference_Sub1Array779;
	((Class73) this).aWeakReference_Sub1Array779
	    = new WeakReference_Sub1[weakreference_sub1s.length * 2];
	WeakReference_Sub1[] weakreference_sub1s_18_ = weakreference_sub1s;
	for (int i = 0; i < weakreference_sub1s_18_.length; i++) {
	    WeakReference_Sub1 weakreference_sub1_19_;
	    for (WeakReference_Sub1 weakreference_sub1
		     = weakreference_sub1s_18_[i];
		 null != weakreference_sub1;
		 weakreference_sub1 = weakreference_sub1_19_) {
		weakreference_sub1_19_
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_11752);
		int i_20_
		    = ((1419488419
			* ((WeakReference_Sub1) weakreference_sub1).anInt11753)
		       & (((Class73) this).aWeakReference_Sub1Array779.length
			  - 1));
		((WeakReference_Sub1) weakreference_sub1)
		    .aWeakReference_Sub1_11752
		    = ((Class73) this).aWeakReference_Sub1Array779[i_20_];
		((Class73) this).aWeakReference_Sub1Array779[i_20_]
		    = weakreference_sub1;
	    }
	}
    }
    
    public void method1112(Object object, Object object_21_, int i) {
	if (object == null)
	    throw new NullPointerException();
	method1106((byte) -71);
	int i_22_ = System.identityHashCode(object);
	int i_23_
	    = i_22_ & ((Class73) this).aWeakReference_Sub1Array779.length - 1;
	WeakReference_Sub1 weakreference_sub1
	    = ((Class73) this).aWeakReference_Sub1Array779[i_23_];
	if (weakreference_sub1 == null) {
	    ((Class73) this).aWeakReference_Sub1Array779[i_23_]
		= new WeakReference_Sub1(object,
					 ((Class73) this).aReferenceQueue781,
					 i_22_, object_21_);
	    ((Class73) this).anInt780 += 452013507;
	    if (-2114770197 * ((Class73) this).anInt780
		>= ((Class73) this).aWeakReference_Sub1Array779.length)
		method1103((byte) -76);
	} else {
	    for (/**/; weakreference_sub1.get() != object;
		 weakreference_sub1
		     = (((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_11752)) {
		if ((((WeakReference_Sub1) weakreference_sub1)
		     .aWeakReference_Sub1_11752)
		    == null) {
		    ((WeakReference_Sub1) weakreference_sub1)
			.aWeakReference_Sub1_11752
			= new WeakReference_Sub1(object,
						 (((Class73) this)
						  .aReferenceQueue781),
						 i_22_, object_21_);
		    ((Class73) this).anInt780 += 452013507;
		    if (-2114770197 * ((Class73) this).anInt780
			>= ((Class73) this).aWeakReference_Sub1Array779.length)
			method1103((byte) -33);
		    break;
		}
	    }
	}
    }
    
    void method1113() {
	for (;;) {
	    WeakReference_Sub1 weakreference_sub1
		= ((WeakReference_Sub1)
		   ((Class73) this).aReferenceQueue781.poll());
	    if (null == weakreference_sub1)
		break;
	    int i
		= ((((WeakReference_Sub1) weakreference_sub1).anInt11753
		    * 1419488419)
		   & ((Class73) this).aWeakReference_Sub1Array779.length - 1);
	    WeakReference_Sub1 weakreference_sub1_24_
		= ((Class73) this).aWeakReference_Sub1Array779[i];
	    if (weakreference_sub1_24_ == weakreference_sub1) {
		((Class73) this).aWeakReference_Sub1Array779[i]
		    = (((WeakReference_Sub1) weakreference_sub1)
		       .aWeakReference_Sub1_11752);
		((Class73) this).anInt780 -= 452013507;
	    } else {
		for (/**/;
		     (weakreference_sub1_24_ != null
		      && (weakreference_sub1
			  != (((WeakReference_Sub1) weakreference_sub1_24_)
			      .aWeakReference_Sub1_11752)));
		     weakreference_sub1_24_
			 = (((WeakReference_Sub1) weakreference_sub1_24_)
			    .aWeakReference_Sub1_11752)) {
		    /* empty */
		}
		if (null != weakreference_sub1_24_) {
		    ((WeakReference_Sub1) weakreference_sub1_24_)
			.aWeakReference_Sub1_11752
			= (((WeakReference_Sub1) weakreference_sub1)
			   .aWeakReference_Sub1_11752);
		    ((Class73) this).anInt780 -= 452013507;
		}
	    }
	}
    }
    
    public static boolean method1114(int i, int i_25_) {
	return (i >= Class605.aClass605_7901.anInt7905 * 1922173025
		&& i <= Class605.aClass605_7906.anInt7905 * 1922173025);
    }
    
    public static int method1115(int i, int i_26_, int i_27_, int i_28_) {
	i_27_ &= 0x3;
	if (i_27_ == 0)
	    return i_26_;
	if (1 == i_27_)
	    return 7 - i;
	if (2 == i_27_)
	    return 7 - i_26_;
	return i;
    }
}
