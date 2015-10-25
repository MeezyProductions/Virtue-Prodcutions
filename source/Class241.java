/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Class241 implements Interface37
{
    int anInt2652;
    int anInt2653;
    int anInt2654;
    int anInt2655;
    int anInt2656;
    Interface40 anInterface40_2657;
    boolean[] aBoolArray2658;
    Class369 aClass369_2659;
    Class365 aClass365_2660;
    Class362 aClass362_2661;
    int anInt2662;
    int[] anIntArray2663;
    int anInt2664;
    float aFloat2665;
    int anInt2666;
    Class251[] aClass251Array2667;
    Class245[] aClass245Array2668;
    int[] anIntArray2669;
    boolean[] aBoolArray2670;
    int anInt2671;
    Class247[] aClass247Array2672;
    int anInt2673;
    Class247[] aClass247Array2674;
    int anInt2675;
    List aList2676 = new ArrayList();
    boolean[] aBoolArray2677;
    int anInt2678;
    Class247 aClass247_2679;
    Class247 aClass247_2680;
    Class247 aClass247_2681;
    Class247 aClass247_2682;
    Class247 aClass247_2683;
    static Class186 aClass186_2684;
    int[] anIntArray2685;
    List aList2686;
    Class248[] aClass248Array2687;
    int anInt2688;
    ByteBuffer aClass528_Sub42_2689;
    int anInt2690;
    int anInt2691;
    boolean aBool2692;
    static List aList2693 = new ArrayList();
    boolean aBool2694;
    boolean aBool2695;
    Class247 aClass247_2696;
    int anInt2697;
    int anInt2698;
    int anInt2699;
    int anInt2700;
    int anInt2701;
    List aList2702;
    int anInt2703;
    int anInt2704;
    boolean aBool2705;
    List aList2706;
    List aList2707;
    AtomicReference anAtomicReference2708;
    int anInt2709;
    Class234[] aClass234Array2710;
    Class247[] aClass247Array2711;
    boolean aBool2712;
    int anInt2713;
    int anInt2714;
    int anInt2715;
    byte[] aByteArray2716;
    int anInt2717;
    int anInt2718;
    boolean aBool2719;
    boolean[] aBoolArray2720;
    boolean[] aBoolArray2721;
    
    public Class362 method291() {
	return ((Class241) this).aClass362_2661;
    }
    
    public void method277(Interface40 interface40) {
	((Class241) this).anInterface40_2657 = interface40;
    }
    
    public void method263() {
	if (method261() != Class369.aClass369_3861) {
	    method3326(false);
	    method3316(Class369.aClass369_3864);
	} else {
	    method3326(false);
	    method3316(Class369.aClass369_3867);
	}
    }
    
    public Class369 method261() {
	return ((Class241) this).aClass369_2659;
    }
    
    void method3316(Class369 class369) {
	((Class241) this).aClass369_2659 = class369;
    }
    
    public void method262(Interface40 interface40) {
	((Class241) this).anInterface40_2657 = interface40;
    }
    
    public int method289(int i) {
	return i / (method264().anInt3842 * 1968729145 / 8);
    }
    
    void method3317() {
	if (method261() != Class369.aClass369_3865) {
	    method3370();
	    if (method261() == Class369.aClass369_3861)
		method3316(Class369.aClass369_3862);
	}
    }
    
    void method3318() {
	int i = method3336(8) + 1;
	Iterator iterator = aList2693.iterator();
	while (iterator.hasNext()) {
	    Class250 class250 = (Class250) iterator.next();
	    if (((Class250) class250).anInt2787 == 0
		&& ((Class250) class250).anInt2785 == 0) {
		if (((Class250) class250).aClass245Array2782.length == i
		    && (((Class250) class250).anInt2784
			== ((Class241) this).anInt2653)
		    && (((Class250) class250).anInt2783
			== ((Class241) this).anInt2704)
		    && (((Class250) class250).anInt2786
			== ((Class241) this).anInt2655)) {
		    ((Class241) this).aClass245Array2668
			= ((Class250) class250).aClass245Array2782;
		    for (int i_0_ = 0;
			 i_0_ < ((Class241) this).aClass245Array2668.length;
			 i_0_++)
			((Class241) this).aClass245Array2668[i_0_]
			    .method3405(this);
		    return;
		}
	    }
	}
	((Class241) this).aClass245Array2668 = new Class245[i];
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    if (((Class241) this).aClass245Array2668[i_1_] == null)
		((Class241) this).aClass245Array2668[i_1_] = new Class245();
	    ((Class241) this).aClass245Array2668[i_1_].method3396(this);
	}
	Class250 class250 = new Class250(((Class241) this).anInt2653,
					 ((Class241) this).anInt2704,
					 ((Class241) this).anInt2654,
					 ((Class241) this).anInt2715,
					 ((Class241) this).anInt2655,
					 ((Class241) this).aClass245Array2668);
	aList2693.add(class250);
    }
    
    public int method73() {
	return method3347();
    }
    
    public int method160(int i) {
	return i / (method264().anInt3842 * 1968729145 / 8);
    }
    
    public int method270(int i) {
	return i * (method264().anInt3842 * 1968729145 / 8);
    }
    
    int method3319() {
	if (method271())
	    return ((Class241) this).anInt2704;
	throw new RuntimeException("");
    }
    
    public Class365 method264() {
	return ((Class241) this).aClass365_2660;
    }
    
    public Class369 method283() {
	return ((Class241) this).aClass369_2659;
    }
    
    public void method266(int i, Class365 class365, Class362 class362,
			  int i_2_) {
	((Class241) this).anInt2662 = i_2_;
	if (method3320(i, class365, class362)) {
	    ((Class241) this).aClass365_2660 = class365;
	    ((Class241) this).aClass362_2661 = class362;
	} else
	    throw new RuntimeException("");
    }
    
    boolean method3320(int i, Class365 class365, Class362 class362) {
	if (class365 == Class365.aClass365_3846)
	    return true;
	if (class365 == Class365.aClass365_3844)
	    return true;
	if (class365 == Class365.aClass365_3845)
	    return true;
	if (class365 == Class365.aClass365_3843)
	    return true;
	return false;
    }
    
    Class247[] method3321(int i, int i_3_) {
	Class247[] class247s = new Class247[i];
	for (int i_4_ = 0; i_4_ < class247s.length; i_4_++)
	    class247s[i_4_] = method3324(i_3_);
	return class247s;
    }
    
    public int method215() {
	if (((Class241) this).aBool2694)
	    return (method3348() < ((Class241) this).anInt2662
		    ? ((Class241) this).anInt2662 : method3348());
	throw new RuntimeException("");
    }
    
    public synchronized boolean method271() {
	return ((Class241) this).aBool2695;
    }
    
    void method3322(Class247 class247) {
	if (class247 != null) {
	    synchronized (aClass186_2684) {
		((Class247) class247).aBool2767 = false;
	    }
	}
    }
    
    void method3323(byte[] is, int i) {
	((Class241) this).aByteArray2716 = is;
	((Class241) this).anInt2717 = i;
	((Class241) this).anInt2688 = 0;
    }
    
    Class247 method3324(int i) {
	synchronized (aClass186_2684) {
	    Object object = null;
	    Class247 class247 = (Class247) aClass186_2684.method2742(93606162);
	    Class247 class247_5_ = null;
	    int i_6_ = i;
	    for (/**/; class247 != null;
		 class247 = (Class247) aClass186_2684.method2749(880455050)) {
		if (((Class247) class247).aFloatArray2769.length > i
		    && !((Class247) class247).aBool2767
		    && (class247_5_ == null
			|| (((Class247) class247).aFloatArray2769.length
			    < i_6_))) {
		    class247_5_ = class247;
		    i_6_ = ((Class247) class247_5_).aFloatArray2769.length;
		}
		if (((Class247) class247).aFloatArray2769.length == i
		    && !((Class247) class247).aBool2767)
		    break;
	    }
	    if (class247 == null)
		class247 = class247_5_;
	    if (class247 == null) {
		class247 = new Class247(this);
		int i_7_ = 0;
		boolean bool = false;
		while (!bool && i_7_ < 1000) {
		    if (aClass186_2684.method2727((long) i_7_) != null)
			i_7_++;
		    else
			bool = true;
		}
		((Class247) class247).anInt2768 = i_7_;
		float[] fs = new float[i];
		((Class247) class247).aFloatArray2769 = fs;
		((Class247) class247).aBool2767 = true;
		((Class247) class247).anInt2766 = i;
		if (aClass186_2684.method2736(-1407318076) >= i * 4) {
		    /* empty */
		}
		aClass186_2684.method2730(class247,
					  (long) (((Class247) class247)
						  .anInt2768),
					  fs.length * 4, -1226267209);
	    } else {
		for (int i_8_ = 0;
		     i_8_ < ((Class247) class247).aFloatArray2769.length;
		     i_8_++)
		    ((Class247) class247).aFloatArray2769[i_8_] = 0.0F;
		((Class247) class247).anInt2766 = i;
	    }
	    ((Class247) class247).aBool2767 = true;
	    Class247 class247_9_ = class247;
	    return class247_9_;
	}
    }
    
    public void method299(boolean bool, int i, int i_10_, int i_11_) {
	((Class241) this).aBool2712 = bool;
	((Class241) this).anInt2673 = i;
	((Class241) this).anInt2671 = i_10_;
	((Class241) this).anInt2664 = i_11_;
    }
    
    void method3325(Class247[] class247s) {
	if (class247s != null) {
	    for (int i = 0; i < class247s.length; i++)
		method3322(class247s[i]);
	}
    }
    
    synchronized void method3326(boolean bool) {
	if (!bool) {
	    ((Class241) this).anInt2666 = 0;
	    ((Class241) this).anInt2678 = 0;
	    ((Class241) this).aBoolArray2670 = null;
	    ((Class241) this).anIntArray2669 = null;
	    method3325(((Class241) this).aClass247Array2711);
	    ((Class241) this).aClass247Array2711 = null;
	    method3325(((Class241) this).aClass247Array2674);
	    ((Class241) this).aClass247Array2674 = null;
	    ((Class241) this).anInt2652 = 0;
	    ((Class241) this).anInt2718 = 0;
	    ((Class241) this).aBoolArray2677 = null;
	    method3325(((Class241) this).aClass247Array2672);
	    ((Class241) this).aClass247Array2672 = null;
	    method3322(((Class241) this).aClass247_2679);
	    method3322(((Class241) this).aClass247_2680);
	    method3322(((Class241) this).aClass247_2681);
	    method3322(((Class241) this).aClass247_2682);
	    method3322(((Class241) this).aClass247_2683);
	    method3322(((Class241) this).aClass247_2696);
	    ((Class241) this).aClass247_2679 = null;
	    ((Class241) this).aClass247_2680 = null;
	    ((Class241) this).aClass247_2681 = null;
	    ((Class241) this).aClass247_2682 = null;
	    ((Class241) this).aClass247_2683 = null;
	    ((Class241) this).aClass247_2696 = null;
	    ((Class241) this).anIntArray2685 = null;
	    ((Class241) this).anIntArray2663 = null;
	}
	((Class241) this).anInt2714 = 0;
	Iterator iterator = ((Class241) this).aList2702.iterator();
	while (iterator.hasNext()) {
	    ByteBuffer class528_sub42 = (ByteBuffer) iterator.next();
	    class528_sub42.method9632((byte) 0);
	}
	((Class241) this).aList2702.clear();
	((Class241) this).aBool2719 = false;
	if (((Class241) this).aClass528_Sub42_2689 != null) {
	    synchronized (((Class241) this).aClass528_Sub42_2689) {
		((Class241) this).aClass528_Sub42_2689.method9632((byte) 7);
		((Class241) this).aClass528_Sub42_2689 = null;
	    }
	}
	((Class241) this).anInt2690 = 0;
	((Class241) this).anInt2691 = 0;
	if (!bool) {
	    synchronized (((Class241) this).aList2686) {
		Iterator iterator_12_ = ((Class241) this).aList2686.iterator();
		while (iterator_12_.hasNext()) {
		    ByteBuffer class528_sub42
			= (ByteBuffer) iterator_12_.next();
		    class528_sub42.method9632((byte) 22);
		}
		((Class241) this).aList2686.clear();
	    }
	    ((Class241) this).anInt2713 = 0;
	}
	synchronized (((Class241) this).aList2676) {
	    Iterator iterator_13_ = ((Class241) this).aList2676.iterator();
	    while (iterator_13_.hasNext()) {
		ByteBuffer class528_sub42
		    = (ByteBuffer) iterator_13_.next();
		class528_sub42.method9632((byte) -10);
	    }
	    ((Class241) this).aList2676.clear();
	}
	((Class241) this).aBool2692 = false;
	((Class241) this).anInt2700 = 0;
	((Class241) this).anInt2699 = -1;
	((Class241) this).anInt2703 = -1;
	if (!bool) {
	    method3356(false);
	    ((Class241) this).aBool2694 = false;
	    ((Class241) this).anInt2671 = -1;
	    ((Class241) this).anInt2664 = -1;
	    ((Class241) this).anInt2673 = 0;
	    ((Class241) this).anInt2656 = 0;
	    ((Class241) this).anInt2697 = -1;
	    ((Class241) this).anInt2698 = -1;
	    ((Class241) this).anInt2701 = -1;
	    ((Class241) this).anInt2675 = -1;
	    ((Class241) this).aBool2705 = false;
	    ((Class241) this).aBool2712 = false;
	} else {
	    ((Class241) this).anInt2656++;
	    ((Class241) this).aBool2705 = true;
	}
    }
    
    void method3327(ByteBuffer class528_sub42) {
	((Class241) this).aList2702.add(class528_sub42);
    }
    
    boolean method3328() {
	return ((Class241) this).aBool2719;
    }
    
    boolean method3329(ByteBuffer class528_sub42) {
	if (class528_sub42.readUnsignedByte((byte) 23) != 79
	    || class528_sub42.readUnsignedByte((byte) 12) != 103
	    || class528_sub42.readUnsignedByte((byte) 85) != 103
	    || class528_sub42.readUnsignedByte((byte) 14) != 83)
	    return false;
	return true;
    }
    
    int method3330() {
	int i = ((((Class241) this).aByteArray2716[((Class241) this).anInt2717]
		  >> ((Class241) this).anInt2688)
		 & 0x1);
	((Class241) this).anInt2688++;
	((Class241) this).anInt2717 += ((Class241) this).anInt2688 >> 3;
	((Class241) this).anInt2688 &= 0x7;
	return i;
    }
    
    synchronized void method3331() {
	int i
	    = (((Class241) this).aClass528_Sub42_2689 != null
	       ? ((Class241) this).aClass528_Sub42_2689.pointer * -185904669
	       : 0);
	int i_14_ = 0;
	Iterator iterator = ((Class241) this).aList2702.iterator();
	while (iterator.hasNext()) {
	    ByteBuffer class528_sub42 = (ByteBuffer) iterator.next();
	    i_14_ += class528_sub42.pointer * -185904669;
	}
	if (((Class241) this).aClass528_Sub42_2689 != null) {
	    if ((((Class241) this).aClass528_Sub42_2689.payload.length
		 - (((Class241) this).aClass528_Sub42_2689.pointer
		    * -185904669))
		< i_14_) {
		ByteBuffer class528_sub42
		    = method3346(i_14_ + ((Class241) this).anInt2690);
		class528_sub42.method9618
		    (((Class241) this).aClass528_Sub42_2689.payload,
		     (((Class241) this).aClass528_Sub42_2689.pointer
		      * -185904669) - ((Class241) this).anInt2691,
		     ((Class241) this).anInt2690, -39029932);
		((Class241) this).aClass528_Sub42_2689.method9632((byte) -58);
		((Class241) this).aClass528_Sub42_2689 = class528_sub42;
		i = ((Class241) this).anInt2691;
	    }
	} else {
	    ((Class241) this).aClass528_Sub42_2689 = method3346(i_14_);
	    ((Class241) this).anInt2690 = 0;
	    i = 0;
	}
	iterator = ((Class241) this).aList2702.iterator();
	while (iterator.hasNext()) {
	    ByteBuffer class528_sub42 = (ByteBuffer) iterator.next();
	    ((Class241) this).aClass528_Sub42_2689.method9618
		(class528_sub42.payload, 0,
		 class528_sub42.pointer * -185904669, -1627465519);
	    ((Class241) this).anInt2690
		+= class528_sub42.pointer * -185904669;
	    class528_sub42.method9632((byte) 28);
	}
	((Class241) this).aClass528_Sub42_2689.pointer
	    = (i - ((Class241) this).anInt2691) * 2015001547;
	((Class241) this).anInt2691 = 0;
	((Class241) this).aList2702.clear();
	while (((Class241) this).aBool2719
	       && ((((Class241) this).aClass528_Sub42_2689.pointer
		    * -185904669)
		   < (((Class241) this).aClass528_Sub42_2689
		      .payload).length)) {
	    if (((Class241) this).aBool2695
		&& ((float) (((Class241) this).anInt2713 / method3319())
		    > ((Class241) this).aFloat2665))
		break;
	    if (((Class241) this).aClass528_Sub42_2689 == null
		|| ((Class241) this).anInt2690 < 27) {
		if (((Class241) this).aClass528_Sub42_2689 != null) {
		    ((Class241) this).anInt2691 = ((Class241) this).anInt2690;
		    ((Class241) this).aClass528_Sub42_2689.pointer
			+= ((Class241) this).anInt2690 * 2015001547;
		}
		((Class241) this).aBool2719 = false;
		break;
	    }
	    int i_15_ = (((Class241) this).aClass528_Sub42_2689.pointer
			 * -185904669);
	    int i_16_ = 0;
	    int i_17_ = 0;
	    if (!method3329(((Class241) this).aClass528_Sub42_2689))
		break;
	    ((Class241) this).anInt2703++;
	    if (((Class241) this).anInt2675 < 0)
		((Class241) this).anInt2701++;
	    ((Class241) this).aList2706.clear();
	    ((Class241) this).aList2707.clear();
	    ((Class241) this).aClass528_Sub42_2689.readUnsignedByte((byte) 11);
	    int i_18_ = ((Class241) this).aClass528_Sub42_2689
			    .readUnsignedByte((byte) 107);
	    int i_19_
		= ((((Class241) this).aClass528_Sub42_2689.readUnsignedByte((byte) 5)
		    & 0xff)
		   | (((Class241) this).aClass528_Sub42_2689
			  .readUnsignedByte((byte) 80)
		      & 0xff) << 8
		   | (((Class241) this).aClass528_Sub42_2689
			  .readUnsignedByte((byte) 110)
		      & 0xff) << 16
		   | ((Class241) this).aClass528_Sub42_2689
			 .readUnsignedByte((byte) 52) << 24);
	    i_16_ = i_19_ - i_16_;
	    ((Class241) this).aClass528_Sub42_2689.pointer += -2119713616;
	    int i_20_ = ((Class241) this).aClass528_Sub42_2689
			    .readUnsignedByte((byte) 106);
	    int i_21_ = (((Class241) this).aClass528_Sub42_2689.pointer
			 * -185904669);
	    int i_22_ = i_21_ + i_20_;
	    if (i_22_ > i_15_ + ((Class241) this).anInt2690) {
		((Class241) this).aClass528_Sub42_2689.pointer
		    = (i_15_ + ((Class241) this).anInt2690) * 2015001547;
		((Class241) this).anInt2691
		    = (((Class241) this).aClass528_Sub42_2689.pointer
		       * -185904669) - i_15_;
		((Class241) this).aBool2719 = false;
	    }
	    int i_23_ = i_22_;
	    int i_24_ = 0;
	    if (((Class241) this).aBool2719) {
		for (int i_25_ = 0; i_25_ < i_20_; i_25_++) {
		    int i_26_ = ((((Class241) this).aClass528_Sub42_2689
				  .payload[i_21_++])
				 & 0xff);
		    i_22_ += i_26_;
		    i_24_ += i_26_;
		    if (i_22_ > i_15_ + ((Class241) this).anInt2690) {
			((Class241) this).aClass528_Sub42_2689.pointer
			    = ((i_15_ + ((Class241) this).anInt2690)
			       * 2015001547);
			((Class241) this).anInt2691
			    = (((Class241) this).aClass528_Sub42_2689
			       .pointer) * -185904669 - i_15_;
			((Class241) this).aBool2719 = false;
			break;
		    }
		    if (i_26_ < 255) {
			((Class241) this).aList2706
			    .add(Integer.valueOf(i_23_));
			((Class241) this).aList2707
			    .add(Integer.valueOf(i_24_));
			i_23_ = i_22_;
			i_24_ = 0;
		    }
		}
	    }
	    if (((Class241) this).aBool2719) {
		int i_27_ = i_22_;
		int i_28_ = -1;
		Iterator iterator_29_ = ((Class241) this).aList2706.iterator();
		Iterator iterator_30_ = ((Class241) this).aList2707.iterator();
		boolean bool = false;
		((Class241) this).anInt2709 = 0;
		while (iterator_29_.hasNext()) {
		    Integer integer = (Integer) iterator_29_.next();
		    Integer integer_31_ = (Integer) iterator_30_.next();
		    i_28_++;
		    if (method271() && ((Class241) this).aBool2705 == true
			&& (((Class241) this).anInt2703
			    < ((Class241) this).anInt2701)
			&& i_28_ < ((Class241) this).anInt2675) {
			Class241 class241_32_ = this;
			((Class241) class241_32_).anInt2700
			    = ((Class241) class241_32_).anInt2700 + (bool ? 0
								     : i_16_);
			bool = true;
		    } else {
			((Class241) this).anAtomicReference2708.set(null);
			boolean bool_33_
			    = method3340((((Class241) this)
					  .aClass528_Sub42_2689
					  .payload),
					 integer.intValue(),
					 integer_31_.intValue(),
					 (((Class241) this)
					  .anAtomicReference2708));
			Class247[] class247s
			    = ((Class247[])
			       ((Class241) this).anAtomicReference2708.get());
			if (bool_33_
			    && (((Class241) this).aBool2705 != true
				|| (((Class241) this).anInt2703
				    >= ((Class241) this).anInt2701)
				|| i_28_ >= ((Class241) this).anInt2675)) {
			    if (class247s != null) {
				int i_34_
				    = ((Class247) class247s[0]).anInt2766;
				((Class241) this).anInt2714 += i_34_;
				if (((Class241) this).anInt2714 > i_19_
				    && i_18_ == 4) {
				    ((Class241) this).anInt2709
					= (((Class241) this).anInt2714 - i_19_
					   - ((Class241) this).anInt2709);
				    i_34_ -= ((Class241) this).anInt2709;
				    if (((Class241) this).anInt2709
					> ((Class247) class247s[0]).anInt2766)
					((Class241) this).anInt2709
					    = (((Class247) class247s[0])
					       .anInt2766);
				    if (i_34_ < 0)
					i_34_ = 0;
				}
				int i_35_ = 0;
				int i_36_
				    = method270(i_34_) * class247s.length;
				if (((Class241) this).aBool2705 == true
				    && (((Class241) this).anInt2700
					< ((Class241) this).anInt2671)) {
				    int i_37_ = i_36_;
				    i_36_ -= method270((((Class241) this)
							.anInt2671)
						       - (((Class241) this)
							  .anInt2700));
				    if (i_36_ <= 0) {
					((Class241) this).anInt2700
					    += method160(i_37_);
					method3325(class247s);
					Object object = null;
					continue;
				    }
				    i_35_ += (((Class241) this).anInt2671
					      - ((Class241) this).anInt2700);
				}
				if ((((Class241) this).anInt2700 + i_34_
				     > ((Class241) this).anInt2664)
				    && ((((Class241) this).anInt2656
					 < ((Class241) this).anInt2673)
					|| ((Class241) this).anInt2673 < 0)
				    && ((Class241) this).aBool2712) {
				    i_36_ -= method270((((Class241) this)
							.anInt2700)
						       + i_34_
						       - (((Class241) this)
							  .anInt2664)
						       - 1);
				    if (i_36_ <= 0) {
					method3325(class247s);
					Object object = null;
					continue;
				    }
				}
				int i_38_ = method215();
				if (method3348() < method215()) {
				    int i_39_ = method215() - method3348();
				    i_36_ += i_36_ / method3348() * i_39_;
				}
				ByteBuffer class528_sub42
				    = method3346(i_36_);
				for (int i_40_ = i_35_; i_40_ < i_34_;
				     i_40_++) {
				    boolean bool_41_
					= ((Class241) this).aBool2705;
				    if (((Class241) this).anInt2673 != 0) {
					if (((Class241) this).anInt2700
					    == ((Class241) this).anInt2671) {
					    if (((Class241) this).anInt2697
						< 0) {
						((Class241) this).anInt2697
						    = (((Class241) this)
						       .anInt2699);
						((Class241) this).anInt2675
						    = i_28_;
					    }
					    ((Class241) this).aBool2705
						= false;
					}
					if ((((Class241) this).anInt2700
					     == ((Class241) this).anInt2664)
					    && ((Class241) this).anInt2698 < 0)
					    ((Class241) this).anInt2698
						= ((Class241) this).anInt2699;
					if ((((Class241) this).anInt2700
					     > ((Class241) this).anInt2664)
					    && ((((Class241) this).anInt2656
						 < ((Class241) this).anInt2673)
						|| (((Class241) this).anInt2673
						    < 0))
					    && ((Class241) this).aBool2712)
					    bool_41_ = true;
				    }
				    if (bool_41_
					&& ((((Class241) this).anInt2700
					     < ((Class241) this).anInt2671)
					    || (((Class241) this).anInt2700
						> (((Class241) this)
						   .anInt2664)))) {
					((Class241) this).anInt2700++;
					if (++i_17_ > i_16_)
					    throw new RuntimeException();
				    } else {
					for (int i_42_ = 0; i_42_ < i_38_;
					     i_42_++) {
					    float f;
					    if (i_42_ < class247s.length)
						f = (((Class247)
						      class247s[i_42_])
						     .aFloatArray2769[i_40_]);
					    else
						f = (((Class247)
						      (class247s
						       [i_42_ % method3348()]))
						     .aFloatArray2769[i_40_]);
					    if ((((Class241) this)
						 .aClass365_2660)
						== Class365.aClass365_3846) {
						int i_43_ = method3343(f);
						if ((((Class241) this)
						     .aClass362_2661)
						    == Class362.aClass362_3833)
						    class528_sub42.writeLEShort
							(i_43_, -1102718643);
						else
						    class528_sub42.method9717
							(i_43_, (byte) 101);
					    } else if ((((Class241) this)
							.aClass365_2660)
						       == (Class365
							   .aClass365_3845)) {
						int i_44_ = method3344(f);
						if ((((Class241) this)
						     .aClass362_2661)
						    == Class362.aClass362_3833)
						    class528_sub42.writeLEShort
							(i_44_, -1102718643);
						else
						    class528_sub42.method9717
							(i_44_, (byte) -27);
					    } else if ((((Class241) this)
							.aClass365_2660)
						       == (Class365
							   .aClass365_3844)) {
						int i_45_ = method3371(f);
						class528_sub42.writeByte
						    (i_45_, (byte) -17);
					    } else if ((((Class241) this)
							.aClass365_2660)
						       == (Class365
							   .aClass365_3843)) {
						int i_46_ = method3345(f);
						class528_sub42.writeByte
						    (i_46_, (byte) 3);
					    }
					}
					((Class241) this).anInt2700++;
					i_17_++;
				    }
				}
				synchronized (((Class241) this).aList2686) {
				    ((Class241) this).anInt2713
					+= (method160(class528_sub42.pointer
						      * -185904669)
					    / method215());
				    ((Class241) this).aList2686
					.add(class528_sub42);
				}
			    }
			} else if (method271()) {
			    ((Class241) this).anInt2652 = 0;
			    if (((Class241) this).aClass247Array2674 == null
				|| ((((Class241) this).aClass247Array2674
				     != null)
				    && (((((Class241) this)
					  .aClass247Array2674).length
					 != ((Class241) this).anInt2653)
					|| (((Class247) (((Class241) this)
							 .aClass247Array2674
							 [0])).anInt2766
					    != (((Class241) this)
						.anInt2678))))) {
				if (((Class241) this).aClass247Array2674
				    != null)
				    method3325(((Class241) this)
					       .aClass247Array2674);
				((Class241) this).aClass247Array2674
				    = method3321(((Class241) this).anInt2653,
						 ((Class241) this).anInt2678);
			    }
			}
			method3325(class247s);
			Object object = null;
		    }
		}
		((Class241) this).aClass528_Sub42_2689.pointer
		    = i_27_ * 2015001547;
		((Class241) this).anInt2690 -= i_27_ - i_15_;
	    }
	}
    }
    
    int method3332() {
	return ((Class241) this).anInt2717;
    }
    
    int method3333() {
	return ((Class241) this).anInt2688;
    }
    
    float method3334(int i) {
	int i_47_ = i & 0x1fffff;
	int i_48_ = i & ~0x7fffffff;
	int i_49_ = (i & 0x7fe00000) >> 21;
	if (i_48_ != 0)
	    i_47_ = -i_47_;
	return (float) ((double) i_47_
			* Math.pow(2.0, (double) (i_49_ - 788)));
    }
    
    int method3335() {
	int i = ((((Class241) this).aByteArray2716[((Class241) this).anInt2717]
		  >> ((Class241) this).anInt2688)
		 & 0x1);
	((Class241) this).anInt2688++;
	((Class241) this).anInt2717 += ((Class241) this).anInt2688 >> 3;
	((Class241) this).anInt2688 &= 0x7;
	return i;
    }
    
    int method3336(int i) {
	int i_50_ = 0;
	int i_51_ = 0;
	int i_52_;
	for (/**/; i >= 8 - ((Class241) this).anInt2688; i -= i_52_) {
	    i_52_ = 8 - ((Class241) this).anInt2688;
	    int i_53_ = (1 << i_52_) - 1;
	    i_50_ += (((((Class241) this).aByteArray2716
			[((Class241) this).anInt2717])
		       >> ((Class241) this).anInt2688)
		      & i_53_) << i_51_;
	    ((Class241) this).anInt2688 = 0;
	    ((Class241) this).anInt2717++;
	    i_51_ += i_52_;
	}
	if (i > 0) {
	    i_52_ = (1 << i) - 1;
	    i_50_ += (((((Class241) this).aByteArray2716
			[((Class241) this).anInt2717])
		       >> ((Class241) this).anInt2688)
		      & i_52_) << i_51_;
	    ((Class241) this).anInt2688 += i;
	}
	return i_50_;
    }
    
    void method3337() {
	((Class241) this).aByteArray2716 = null;
    }
    
    void method3338() {
	int i = method3336(8) + 1;
	Iterator iterator = aList2693.iterator();
	while (iterator.hasNext()) {
	    Class250 class250 = (Class250) iterator.next();
	    if (((Class250) class250).anInt2787 == 0
		&& ((Class250) class250).anInt2785 == 0) {
		if (((Class250) class250).aClass245Array2782.length == i
		    && (((Class250) class250).anInt2784
			== ((Class241) this).anInt2653)
		    && (((Class250) class250).anInt2783
			== ((Class241) this).anInt2704)
		    && (((Class250) class250).anInt2786
			== ((Class241) this).anInt2655)) {
		    ((Class241) this).aClass245Array2668
			= ((Class250) class250).aClass245Array2782;
		    for (int i_54_ = 0;
			 i_54_ < ((Class241) this).aClass245Array2668.length;
			 i_54_++)
			((Class241) this).aClass245Array2668[i_54_]
			    .method3405(this);
		    return;
		}
	    }
	}
	((Class241) this).aClass245Array2668 = new Class245[i];
	for (int i_55_ = 0; i_55_ < i; i_55_++) {
	    if (((Class241) this).aClass245Array2668[i_55_] == null)
		((Class241) this).aClass245Array2668[i_55_] = new Class245();
	    ((Class241) this).aClass245Array2668[i_55_].method3396(this);
	}
	Class250 class250 = new Class250(((Class241) this).anInt2653,
					 ((Class241) this).anInt2704,
					 ((Class241) this).anInt2654,
					 ((Class241) this).anInt2715,
					 ((Class241) this).anInt2655,
					 ((Class241) this).aClass245Array2668);
	aList2693.add(class250);
    }
    
    int method3339(int i) {
	int i_56_ = 0;
	for (/**/; i > 0; i >>= 1)
	    i_56_++;
	return i_56_;
    }
    
    boolean method3340(byte[] is, int i, int i_57_,
		       AtomicReference atomicreference) {
	if (is == null)
	    throw new RuntimeException("");
	if (i + i_57_ > is.length)
	    return false;
	method3323(is, i);
	int i_58_ = method3335();
	if (i_58_ != 0) {
	    method3350(is, i);
	    return false;
	}
	if (!method271())
	    throw new RuntimeException();
	int i_59_
	    = method3336(method3339(((Class241) this).anIntArray2669.length
				    - 1));
	boolean bool = ((Class241) this).aBoolArray2670[i_59_];
	int i_60_
	    = bool ? ((Class241) this).anInt2678 : ((Class241) this).anInt2666;
	boolean bool_61_ = false;
	boolean bool_62_ = false;
	if (bool) {
	    bool_61_ = method3335() != 0;
	    bool_62_ = method3335() != 0;
	}
	int i_63_ = i_60_ >> 1;
	int i_64_;
	int i_65_;
	int i_66_;
	if (bool && !bool_61_) {
	    i_64_ = (i_60_ >> 2) - (((Class241) this).anInt2666 >> 2);
	    i_65_ = (i_60_ >> 2) + (((Class241) this).anInt2666 >> 2);
	    i_66_ = ((Class241) this).anInt2666 >> 1;
	} else {
	    i_64_ = 0;
	    i_65_ = i_63_;
	    i_66_ = i_60_ >> 1;
	}
	int i_67_;
	int i_68_;
	int i_69_;
	if (bool && !bool_62_) {
	    i_67_ = i_60_ - (i_60_ >> 2) - (((Class241) this).anInt2666 >> 2);
	    i_68_ = i_60_ - (i_60_ >> 2) + (((Class241) this).anInt2666 >> 2);
	    i_69_ = ((Class241) this).anInt2666 >> 1;
	} else {
	    i_67_ = i_63_;
	    i_68_ = i_60_;
	    i_69_ = i_60_ >> 1;
	}
	Class248 class248 = (((Class241) this).aClass248Array2687
			     [((Class241) this).anIntArray2669[i_59_]]);
	if (((Class241) this).aBoolArray2658 == null
	    || (((Class241) this).aBoolArray2658.length
		!= ((Class241) this).anInt2653)) {
	    ((Class241) this).aBoolArray2658
		= new boolean[((Class241) this).anInt2653];
	    ((Class241) this).aBoolArray2720
		= new boolean[((Class241) this).anInt2653];
	}
	for (int i_70_ = 0; i_70_ < ((Class241) this).anInt2653; i_70_++) {
	    int i_71_ = (((Class248) class248).anIntArray2770 != null
			 ? ((Class248) class248).anIntArray2770[i_70_] : 0);
	    int i_72_ = i_71_;
	    int i_73_ = ((Class248) class248).anIntArray2773[i_72_];
	    ((Class241) this).aBoolArray2658[i_70_]
		= !((Class241) this).aClass234Array2710[i_73_]
		       .method3267(i_70_);
	    ((Class241) this).aBoolArray2720[i_70_]
		= ((Class241) this).aBoolArray2658[i_70_];
	}
	for (int i_74_ = 0; i_74_ < ((Class248) class248).anInt2772; i_74_++) {
	    if (!(((Class241) this).aBoolArray2658
		  [((Class248) class248).anIntArray2776[i_74_]])
		|| !(((Class241) this).aBoolArray2658
		     [((Class248) class248).anIntArray2777[i_74_]])) {
		((Class241) this).aBoolArray2658[(((Class248) class248)
						  .anIntArray2776[i_74_])]
		    = false;
		((Class241) this).aBoolArray2658[(((Class248) class248)
						  .anIntArray2777[i_74_])]
		    = false;
	    }
	}
	if (((Class241) this).aBoolArray2721 == null
	    || (((Class241) this).aBoolArray2721.length
		!= ((Class241) this).anInt2653))
	    ((Class241) this).aBoolArray2721
		= new boolean[((Class241) this).anInt2653];
	for (int i_75_ = 0; i_75_ < ((Class248) class248).anInt2775; i_75_++) {
	    int i_76_ = 0;
	    for (int i_77_ = 0; i_77_ < ((Class241) this).anInt2653; i_77_++) {
		int i_78_
		    = (((Class248) class248).anIntArray2770 != null
		       ? ((Class248) class248).anIntArray2770[i_77_] : i_75_);
		if (i_78_ == i_75_)
		    ((Class241) this).aBoolArray2721[i_76_++]
			= ((Class241) this).aBoolArray2658[i_77_];
	    }
	    Class251 class251
		= (((Class241) this).aClass251Array2667
		   [((Class248) class248).anIntArray2771[i_75_]]);
	    Object object = null;
	    Class247[] class247s;
	    if (((Class251) class251).anInt2790 == 2) {
		Class247[] class247s_79_
		    = method3321(1, ((Class241) this).anInt2653 * i_60_);
		for (int i_80_ = 0; i_80_ < i_60_; i_80_++) {
		    for (int i_81_ = 0; i_81_ < ((Class241) this).anInt2653;
			 i_81_++) {
			try {
			    ((Class247) class247s_79_[0]).aFloatArray2769
				[i_80_ * ((Class241) this).anInt2653 + i_81_]
				= (((Class247) (((Class241) this)
						.aClass247Array2672[i_81_]))
				   .aFloatArray2769[i_80_]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		class247s_79_
		    = class251.method3425(class247s_79_, i_60_ >> 1,
					  ((Class241) this).aBoolArray2721);
		class247s = ((Class241) this).aClass247Array2672;
		for (int i_82_ = 0; i_82_ < i_60_; i_82_++) {
		    for (int i_83_ = 0; i_83_ < ((Class241) this).anInt2653;
			 i_83_++) {
			try {
			    ((Class247) class247s[i_83_]).aFloatArray2769
				[i_82_]
				= (((Class247) class247s_79_[0])
				   .aFloatArray2769
				   [(((Class241) this).anInt2653 * i_82_
				     + i_83_)]);
			} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			    arrayindexoutofboundsexception.printStackTrace();
			}
		    }
		}
		method3325(class247s_79_);
		Object object_84_ = null;
	    } else
		class247s
		    = class251.method3425(((Class241) this).aClass247Array2672,
					  i_60_ >> 1,
					  ((Class241) this).aBoolArray2721);
	    if (((Class248) class248).anIntArray2770 != null) {
		i_76_ = 0;
		for (int i_85_ = 0; i_85_ < ((Class241) this).anInt2653;
		     i_85_++) {
		    int i_86_ = ((Class248) class248).anIntArray2770[i_85_];
		    if (i_86_ == i_75_)
			((Class241) this).aClass247Array2672[i_85_]
			    = class247s[i_76_++];
		}
	    } else {
		if (((Class241) this).aClass247Array2672 != class247s)
		    method3325(((Class241) this).aClass247Array2672);
		((Class241) this).aClass247Array2672 = class247s;
	    }
	}
	for (int i_87_ = ((Class248) class248).anInt2772 - 1; i_87_ >= 0;
	     i_87_--) {
	    Class247 class247
		= (((Class241) this).aClass247Array2672
		   [((Class248) class248).anIntArray2776[i_87_]]);
	    Class247 class247_88_
		= (((Class241) this).aClass247Array2672
		   [((Class248) class248).anIntArray2777[i_87_]]);
	    for (int i_89_ = 0; i_89_ < ((Class247) class247).anInt2766;
		 i_89_++) {
		float f = ((Class247) class247).aFloatArray2769[i_89_];
		float f_90_ = ((Class247) class247_88_).aFloatArray2769[i_89_];
		float f_91_ = f;
		float f_92_ = f_90_;
		if (f > 0.0F) {
		    if (f_90_ > 0.0F) {
			f_91_ = f;
			f_92_ = f - f_90_;
		    } else {
			f_92_ = f;
			f_91_ = f + f_90_;
		    }
		} else if (f_90_ > 0.0F) {
		    f_91_ = f;
		    f_92_ = f + f_90_;
		} else {
		    f_92_ = f;
		    f_91_ = f - f_90_;
		}
		((Class247) class247).aFloatArray2769[i_89_] = f_91_;
		((Class247) class247_88_).aFloatArray2769[i_89_] = f_92_;
	    }
	}
	for (int i_93_ = 0; i_93_ < ((Class241) this).aBoolArray2658.length;
	     i_93_++)
	    ((Class241) this).aBoolArray2658[i_93_]
		= ((Class241) this).aBoolArray2720[i_93_];
	for (int i_94_ = 0; i_94_ < ((Class241) this).anInt2653; i_94_++) {
	    if (!((Class241) this).aBoolArray2658[i_94_]) {
		int i_95_
		    = (((Class248) class248).anIntArray2770 != null
		       ? ((Class248) class248).anIntArray2770[i_94_] : 0);
		int i_96_ = i_95_;
		int i_97_ = ((Class248) class248).anIntArray2773[i_96_];
		((Class241) this).aClass234Array2710[i_97_].method3268(i_94_);
		((Class241) this).aClass234Array2710[i_97_].method3269
		    (((Class241) this).aClass247Array2672[i_94_], i_60_ >> 1,
		     i_94_);
	    }
	}
	for (int i_98_ = 0; i_98_ < ((Class241) this).anInt2653; i_98_++) {
	    if (((Class241) this).aBoolArray2658[i_98_]) {
		for (int i_99_ = i_60_ >> 1; i_99_ < i_60_; i_99_++)
		    ((Class247) ((Class241) this).aClass247Array2672[i_98_])
			.aFloatArray2769[i_99_]
			= 0.0F;
	    } else {
		int i_100_ = i_60_ >> 1;
		int i_101_ = i_60_ >> 2;
		int i_102_ = i_60_ >> 3;
		Class247 class247
		    = ((Class241) this).aClass247Array2672[i_98_];
		for (int i_103_ = 0; i_103_ < i_100_; i_103_++)
		    ((Class247) class247).aFloatArray2769[i_103_] *= 0.5F;
		for (int i_104_ = i_100_; i_104_ < i_60_; i_104_++)
		    ((Class247) class247).aFloatArray2769[i_104_]
			= -(((Class247) class247).aFloatArray2769
			    [i_60_ - i_104_ - 1]);
		Class247 class247_105_
		    = (bool ? ((Class241) this).aClass247_2682
		       : ((Class241) this).aClass247_2679);
		Class247 class247_106_
		    = (bool ? ((Class241) this).aClass247_2683
		       : ((Class241) this).aClass247_2680);
		Class247 class247_107_
		    = (bool ? ((Class241) this).aClass247_2696
		       : ((Class241) this).aClass247_2681);
		int[] is_108_ = (bool ? ((Class241) this).anIntArray2663
				 : ((Class241) this).anIntArray2685);
		for (int i_109_ = 0; i_109_ < i_101_; i_109_++) {
		    float f
			= (((Class247) class247).aFloatArray2769[4 * i_109_]
			   - (((Class247) class247).aFloatArray2769
			      [i_60_ - 4 * i_109_ - 1]));
		    float f_110_ = ((((Class247) class247).aFloatArray2769
				     [4 * i_109_ + 2])
				    - (((Class247) class247).aFloatArray2769
				       [i_60_ - 4 * i_109_ - 3]));
		    float f_111_ = (((Class247) class247_105_).aFloatArray2769
				    [2 * i_109_]);
		    float f_112_ = (((Class247) class247_105_).aFloatArray2769
				    [2 * i_109_ + 1]);
		    ((Class247) class247).aFloatArray2769[(i_60_ - 4 * i_109_
							   - 1)]
			= f * f_111_ - f_110_ * f_112_;
		    ((Class247) class247).aFloatArray2769[(i_60_ - 4 * i_109_
							   - 3)]
			= f * f_112_ + f_110_ * f_111_;
		}
		for (int i_113_ = 0; i_113_ < i_102_; i_113_++) {
		    float f = (((Class247) class247).aFloatArray2769
			       [i_100_ + 3 + 4 * i_113_]);
		    float f_114_ = (((Class247) class247).aFloatArray2769
				    [i_100_ + 1 + 4 * i_113_]);
		    float f_115_ = (((Class247) class247).aFloatArray2769
				    [4 * i_113_ + 3]);
		    float f_116_ = (((Class247) class247).aFloatArray2769
				    [4 * i_113_ + 1]);
		    ((Class247) class247).aFloatArray2769[(i_100_ + 3
							   + 4 * i_113_)]
			= f + f_115_;
		    ((Class247) class247).aFloatArray2769[(i_100_ + 1
							   + 4 * i_113_)]
			= f_114_ + f_116_;
		    float f_117_ = (((Class247) class247_105_).aFloatArray2769
				    [i_100_ - 4 - 4 * i_113_]);
		    float f_118_ = (((Class247) class247_105_).aFloatArray2769
				    [i_100_ - 3 - 4 * i_113_]);
		    ((Class247) class247).aFloatArray2769[4 * i_113_ + 3]
			= (f - f_115_) * f_117_ - (f_114_ - f_116_) * f_118_;
		    ((Class247) class247).aFloatArray2769[4 * i_113_ + 1]
			= (f_114_ - f_116_) * f_117_ + (f - f_115_) * f_118_;
		}
		int i_119_ = Class296.method3974(i_60_ - 1, -297612638);
		for (int i_120_ = 0; i_120_ < i_119_ - 3; i_120_++) {
		    int i_121_ = i_60_ >> i_120_ + 2;
		    int i_122_ = 8 << i_120_;
		    for (int i_123_ = 0; i_123_ < 2 << i_120_; i_123_++) {
			int i_124_ = i_60_ - i_121_ * 2 * i_123_;
			int i_125_ = i_60_ - i_121_ * (2 * i_123_ + 1);
			for (int i_126_ = 0; i_126_ < i_60_ >> i_120_ + 4;
			     i_126_++) {
			    int i_127_ = 4 * i_126_;
			    float f = (((Class247) class247).aFloatArray2769
				       [i_124_ - 1 - i_127_]);
			    float f_128_
				= (((Class247) class247).aFloatArray2769
				   [i_124_ - 3 - i_127_]);
			    float f_129_
				= (((Class247) class247).aFloatArray2769
				   [i_125_ - 1 - i_127_]);
			    float f_130_
				= (((Class247) class247).aFloatArray2769
				   [i_125_ - 3 - i_127_]);
			    ((Class247) class247).aFloatArray2769[(i_124_ - 1
								   - i_127_)]
				= f + f_129_;
			    ((Class247) class247).aFloatArray2769[(i_124_ - 3
								   - i_127_)]
				= f_128_ + f_130_;
			    float f_131_ = (((Class247) class247_105_)
					    .aFloatArray2769[i_126_ * i_122_]);
			    float f_132_
				= (((Class247) class247_105_).aFloatArray2769
				   [i_126_ * i_122_ + 1]);
			    ((Class247) class247).aFloatArray2769[(i_125_ - 1
								   - i_127_)]
				= ((f - f_129_) * f_131_
				   - (f_128_ - f_130_) * f_132_);
			    ((Class247) class247).aFloatArray2769[(i_125_ - 3
								   - i_127_)]
				= ((f_128_ - f_130_) * f_131_
				   + (f - f_129_) * f_132_);
			}
		    }
		}
		for (int i_133_ = 1; i_133_ < i_102_ - 1; i_133_++) {
		    int i_134_ = is_108_[i_133_];
		    if (i_133_ < i_134_) {
			int i_135_ = 8 * i_133_;
			int i_136_ = 8 * i_134_;
			float f = (((Class247) class247).aFloatArray2769
				   [i_135_ + 1]);
			((Class247) class247).aFloatArray2769[i_135_ + 1]
			    = (((Class247) class247).aFloatArray2769
			       [i_136_ + 1]);
			((Class247) class247).aFloatArray2769[i_136_ + 1] = f;
			f = ((Class247) class247).aFloatArray2769[i_135_ + 3];
			((Class247) class247).aFloatArray2769[i_135_ + 3]
			    = (((Class247) class247).aFloatArray2769
			       [i_136_ + 3]);
			((Class247) class247).aFloatArray2769[i_136_ + 3] = f;
			f = ((Class247) class247).aFloatArray2769[i_135_ + 5];
			((Class247) class247).aFloatArray2769[i_135_ + 5]
			    = (((Class247) class247).aFloatArray2769
			       [i_136_ + 5]);
			((Class247) class247).aFloatArray2769[i_136_ + 5] = f;
			f = ((Class247) class247).aFloatArray2769[i_135_ + 7];
			((Class247) class247).aFloatArray2769[i_135_ + 7]
			    = (((Class247) class247).aFloatArray2769
			       [i_136_ + 7]);
			((Class247) class247).aFloatArray2769[i_136_ + 7] = f;
		    }
		}
		for (int i_137_ = 0; i_137_ < i_100_; i_137_++)
		    ((Class247) class247).aFloatArray2769[i_137_]
			= (((Class247) class247).aFloatArray2769
			   [2 * i_137_ + 1]);
		for (int i_138_ = 0; i_138_ < i_102_; i_138_++) {
		    ((Class247) class247).aFloatArray2769[(i_60_ - 1
							   - 2 * i_138_)]
			= ((Class247) class247).aFloatArray2769[4 * i_138_];
		    ((Class247) class247).aFloatArray2769[(i_60_ - 2
							   - 2 * i_138_)]
			= (((Class247) class247).aFloatArray2769
			   [4 * i_138_ + 1]);
		    ((Class247) class247).aFloatArray2769[(i_60_ - i_101_ - 1
							   - 2 * i_138_)]
			= (((Class247) class247).aFloatArray2769
			   [4 * i_138_ + 2]);
		    ((Class247) class247).aFloatArray2769[(i_60_ - i_101_ - 2
							   - 2 * i_138_)]
			= (((Class247) class247).aFloatArray2769
			   [4 * i_138_ + 3]);
		}
		for (int i_139_ = 0; i_139_ < i_102_; i_139_++) {
		    float f = (((Class247) class247_107_).aFloatArray2769
			       [2 * i_139_]);
		    float f_140_ = (((Class247) class247_107_).aFloatArray2769
				    [2 * i_139_ + 1]);
		    float f_141_ = (((Class247) class247).aFloatArray2769
				    [i_100_ + 2 * i_139_]);
		    float f_142_ = (((Class247) class247).aFloatArray2769
				    [i_100_ + 2 * i_139_ + 1]);
		    float f_143_ = (((Class247) class247).aFloatArray2769
				    [i_60_ - 2 - 2 * i_139_]);
		    float f_144_ = (((Class247) class247).aFloatArray2769
				    [i_60_ - 1 - 2 * i_139_]);
		    float f_145_
			= f_140_ * (f_141_ - f_143_) + f * (f_142_ + f_144_);
		    ((Class247) class247).aFloatArray2769[i_100_ + 2 * i_139_]
			= (f_141_ + f_143_ + f_145_) * 0.5F;
		    ((Class247) class247).aFloatArray2769[(i_60_ - 2
							   - 2 * i_139_)]
			= (f_141_ + f_143_ - f_145_) * 0.5F;
		    f_145_
			= f_140_ * (f_142_ + f_144_) - f * (f_141_ - f_143_);
		    ((Class247) class247).aFloatArray2769[(i_100_ + 2 * i_139_
							   + 1)]
			= (f_142_ - f_144_ + f_145_) * 0.5F;
		    ((Class247) class247).aFloatArray2769[(i_60_ - 1
							   - 2 * i_139_)]
			= (-f_142_ + f_144_ + f_145_) * 0.5F;
		}
		for (int i_146_ = 0; i_146_ < i_101_; i_146_++) {
		    ((Class247) class247).aFloatArray2769[i_146_]
			= (((((Class247) class247).aFloatArray2769
			     [2 * i_146_ + i_100_])
			    * (((Class247) class247_106_).aFloatArray2769
			       [2 * i_146_]))
			   + ((((Class247) class247).aFloatArray2769
			       [2 * i_146_ + 1 + i_100_])
			      * (((Class247) class247_106_).aFloatArray2769
				 [2 * i_146_ + 1])));
		    ((Class247) class247).aFloatArray2769[i_100_ - 1 - i_146_]
			= (((((Class247) class247).aFloatArray2769
			     [2 * i_146_ + i_100_])
			    * (((Class247) class247_106_).aFloatArray2769
			       [2 * i_146_ + 1]))
			   - ((((Class247) class247).aFloatArray2769
			       [2 * i_146_ + 1 + i_100_])
			      * (((Class247) class247_106_).aFloatArray2769
				 [2 * i_146_])));
		}
		for (int i_147_ = 0; i_147_ < i_101_; i_147_++)
		    ((Class247) class247).aFloatArray2769[(i_60_ - i_101_
							   + i_147_)]
			= -((Class247) class247).aFloatArray2769[i_147_];
		for (int i_148_ = 0; i_148_ < i_101_; i_148_++)
		    ((Class247) class247).aFloatArray2769[i_148_]
			= (((Class247) class247).aFloatArray2769
			   [i_101_ + i_148_]);
		for (int i_149_ = 0; i_149_ < i_101_; i_149_++)
		    ((Class247) class247).aFloatArray2769[i_101_ + i_149_]
			= -(((Class247) class247).aFloatArray2769
			    [i_101_ - i_149_ - 1]);
		for (int i_150_ = 0; i_150_ < i_101_; i_150_++)
		    ((Class247) class247).aFloatArray2769[i_100_ + i_150_]
			= (((Class247) class247).aFloatArray2769
			   [i_60_ - i_150_ - 1]);
		for (int i_151_ = i_64_; i_151_ < i_65_; i_151_++) {
		    float f
			= (float) Math.sin(((double) (i_151_ - i_64_) + 0.5)
					   / (double) i_66_ * 0.5
					   * 3.141592653589793);
		    ((Class247) ((Class241) this).aClass247Array2672[i_98_])
			.aFloatArray2769[i_151_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
		for (int i_152_ = i_67_; i_152_ < i_68_; i_152_++) {
		    float f
			= (float) Math.sin((((double) (i_152_ - i_67_) + 0.5)
					    / (double) i_69_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		    ((Class247) ((Class241) this).aClass247Array2672[i_98_])
			.aFloatArray2769[i_152_]
			*= (float) Math.sin(1.5707963267948966 * (double) f
					    * (double) f);
		}
	    }
	}
	Class247[] class247s = null;
	if (((Class241) this).anInt2652 > 0) {
	    int i_153_ = ((Class241) this).anInt2652 + i_60_ >> 2;
	    class247s = method3321(((Class241) this).anInt2653, i_153_);
	    for (int i_154_ = 0; i_154_ < ((Class241) this).anInt2653;
		 i_154_++) {
		if (!((Class241) this).aBoolArray2677[i_154_]) {
		    for (int i_155_ = 0; i_155_ < ((Class241) this).anInt2718;
			 i_155_++) {
			int i_156_
			    = (((Class241) this).anInt2652 >> 1) + i_155_;
			((Class247) class247s[i_154_]).aFloatArray2769[i_155_]
			    += (((Class247)
				 ((Class241) this).aClass247Array2674[i_154_])
				.aFloatArray2769[i_156_]);
		    }
		}
		if (!((Class241) this).aBoolArray2658[i_154_]) {
		    for (int i_157_ = i_64_; i_157_ < i_60_ >> 1; i_157_++) {
			int i_158_ = (((Class247) class247s[i_154_]).anInt2766
				      - (i_60_ >> 1) + i_157_);
			((Class247) class247s[i_154_]).aFloatArray2769[i_158_]
			    += (((Class247)
				 ((Class241) this).aClass247Array2672[i_154_])
				.aFloatArray2769[i_157_]);
		    }
		}
	    }
	}
	Class247[] class247s_159_ = ((Class241) this).aClass247Array2674;
	((Class241) this).aClass247Array2674
	    = ((Class241) this).aClass247Array2672;
	((Class241) this).aClass247Array2672 = class247s_159_;
	((Class241) this).anInt2652 = i_60_;
	((Class241) this).anInt2718 = i_68_ - (i_60_ >> 1);
	((Class241) this).aBoolArray2677 = ((Class241) this).aBoolArray2658;
	atomicreference.set(class247s);
	return true;
    }
    
    int method3341() {
	return ((Class241) this).anInt2688;
    }
    
    public Class241(float f) {
	((Class241) this).aClass369_2659 = Class369.aClass369_3864;
	((Class241) this).aList2702 = new ArrayList();
	((Class241) this).aClass528_Sub42_2689 = null;
	((Class241) this).anInt2690 = 0;
	((Class241) this).anInt2691 = 0;
	((Class241) this).aList2686 = new ArrayList();
	((Class241) this).aList2706 = new ArrayList();
	((Class241) this).aList2707 = new ArrayList();
	((Class241) this).anAtomicReference2708 = new AtomicReference(null);
	((Class241) this).anInt2709 = 0;
	((Class241) this).aBool2712 = false;
	((Class241) this).anInt2713 = 0;
	((Class241) this).aBoolArray2658 = null;
	((Class241) this).aBoolArray2720 = null;
	((Class241) this).aBoolArray2721 = null;
	((Class241) this).aFloat2665 = f;
	((Class241) this).aClass365_2660 = Class365.aClass365_3846;
	((Class241) this).aClass362_2661 = Class362.aClass362_3833;
	method3326(false);
    }
    
    synchronized void method3342() {
	int i
	    = (((Class241) this).aClass528_Sub42_2689 != null
	       ? ((Class241) this).aClass528_Sub42_2689.pointer * -185904669
	       : 0);
	int i_160_ = 0;
	Iterator iterator = ((Class241) this).aList2702.iterator();
	while (iterator.hasNext()) {
	    ByteBuffer class528_sub42 = (ByteBuffer) iterator.next();
	    i_160_ += class528_sub42.pointer * -185904669;
	}
	if (((Class241) this).aClass528_Sub42_2689 != null) {
	    if ((((Class241) this).aClass528_Sub42_2689.payload.length
		 - (((Class241) this).aClass528_Sub42_2689.pointer
		    * -185904669))
		< i_160_) {
		ByteBuffer class528_sub42
		    = method3346(i_160_ + ((Class241) this).anInt2690);
		class528_sub42.method9618
		    (((Class241) this).aClass528_Sub42_2689.payload,
		     (((Class241) this).aClass528_Sub42_2689.pointer
		      * -185904669) - ((Class241) this).anInt2691,
		     ((Class241) this).anInt2690, -1504950038);
		((Class241) this).aClass528_Sub42_2689.method9632((byte) 20);
		((Class241) this).aClass528_Sub42_2689 = class528_sub42;
		i = ((Class241) this).anInt2691;
	    }
	} else {
	    ((Class241) this).aClass528_Sub42_2689 = method3346(i_160_);
	    ((Class241) this).anInt2690 = 0;
	    i = 0;
	}
	iterator = ((Class241) this).aList2702.iterator();
	while (iterator.hasNext()) {
	    ByteBuffer class528_sub42 = (ByteBuffer) iterator.next();
	    ((Class241) this).aClass528_Sub42_2689.method9618
		(class528_sub42.payload, 0,
		 class528_sub42.pointer * -185904669, -66637995);
	    ((Class241) this).anInt2690
		+= class528_sub42.pointer * -185904669;
	    class528_sub42.method9632((byte) -69);
	}
	((Class241) this).aClass528_Sub42_2689.pointer
	    = (i - ((Class241) this).anInt2691) * 2015001547;
	((Class241) this).anInt2691 = 0;
	((Class241) this).aList2702.clear();
	while (((Class241) this).aBool2719
	       && ((((Class241) this).aClass528_Sub42_2689.pointer
		    * -185904669)
		   < (((Class241) this).aClass528_Sub42_2689
		      .payload).length)) {
	    if (((Class241) this).aBool2695
		&& ((float) (((Class241) this).anInt2713 / method3319())
		    > ((Class241) this).aFloat2665))
		break;
	    if (((Class241) this).aClass528_Sub42_2689 == null
		|| ((Class241) this).anInt2690 < 27) {
		if (((Class241) this).aClass528_Sub42_2689 != null) {
		    ((Class241) this).anInt2691 = ((Class241) this).anInt2690;
		    ((Class241) this).aClass528_Sub42_2689.pointer
			+= ((Class241) this).anInt2690 * 2015001547;
		}
		((Class241) this).aBool2719 = false;
		break;
	    }
	    int i_161_ = (((Class241) this).aClass528_Sub42_2689.pointer
			  * -185904669);
	    int i_162_ = 0;
	    int i_163_ = 0;
	    if (!method3329(((Class241) this).aClass528_Sub42_2689))
		break;
	    ((Class241) this).anInt2703++;
	    if (((Class241) this).anInt2675 < 0)
		((Class241) this).anInt2701++;
	    ((Class241) this).aList2706.clear();
	    ((Class241) this).aList2707.clear();
	    ((Class241) this).aClass528_Sub42_2689.readUnsignedByte((byte) 2);
	    int i_164_
		= ((Class241) this).aClass528_Sub42_2689.readUnsignedByte((byte) 19);
	    int i_165_ = (((Class241) this).aClass528_Sub42_2689
			      .readUnsignedByte((byte) 55) & 0xff
			  | (((Class241) this).aClass528_Sub42_2689
				 .readUnsignedByte((byte) 11)
			     & 0xff) << 8
			  | (((Class241) this).aClass528_Sub42_2689
				 .readUnsignedByte((byte) 17)
			     & 0xff) << 16
			  | ((Class241) this).aClass528_Sub42_2689
				.readUnsignedByte((byte) 120) << 24);
	    i_162_ = i_165_ - i_162_;
	    ((Class241) this).aClass528_Sub42_2689.pointer += -2119713616;
	    int i_166_
		= ((Class241) this).aClass528_Sub42_2689.readUnsignedByte((byte) 40);
	    int i_167_ = (((Class241) this).aClass528_Sub42_2689.pointer
			  * -185904669);
	    int i_168_ = i_167_ + i_166_;
	    if (i_168_ > i_161_ + ((Class241) this).anInt2690) {
		((Class241) this).aClass528_Sub42_2689.pointer
		    = (i_161_ + ((Class241) this).anInt2690) * 2015001547;
		((Class241) this).anInt2691
		    = (((Class241) this).aClass528_Sub42_2689.pointer
		       * -185904669) - i_161_;
		((Class241) this).aBool2719 = false;
	    }
	    int i_169_ = i_168_;
	    int i_170_ = 0;
	    if (((Class241) this).aBool2719) {
		for (int i_171_ = 0; i_171_ < i_166_; i_171_++) {
		    int i_172_ = ((((Class241) this).aClass528_Sub42_2689
				   .payload[i_167_++])
				  & 0xff);
		    i_168_ += i_172_;
		    i_170_ += i_172_;
		    if (i_168_ > i_161_ + ((Class241) this).anInt2690) {
			((Class241) this).aClass528_Sub42_2689.pointer
			    = ((i_161_ + ((Class241) this).anInt2690)
			       * 2015001547);
			((Class241) this).anInt2691
			    = (((Class241) this).aClass528_Sub42_2689
			       .pointer) * -185904669 - i_161_;
			((Class241) this).aBool2719 = false;
			break;
		    }
		    if (i_172_ < 255) {
			((Class241) this).aList2706
			    .add(Integer.valueOf(i_169_));
			((Class241) this).aList2707
			    .add(Integer.valueOf(i_170_));
			i_169_ = i_168_;
			i_170_ = 0;
		    }
		}
	    }
	    if (((Class241) this).aBool2719) {
		int i_173_ = i_168_;
		int i_174_ = -1;
		Iterator iterator_175_
		    = ((Class241) this).aList2706.iterator();
		Iterator iterator_176_
		    = ((Class241) this).aList2707.iterator();
		boolean bool = false;
		((Class241) this).anInt2709 = 0;
		while (iterator_175_.hasNext()) {
		    Integer integer = (Integer) iterator_175_.next();
		    Integer integer_177_ = (Integer) iterator_176_.next();
		    i_174_++;
		    if (method271() && ((Class241) this).aBool2705 == true
			&& (((Class241) this).anInt2703
			    < ((Class241) this).anInt2701)
			&& i_174_ < ((Class241) this).anInt2675) {
			Class241 class241_178_ = this;
			((Class241) class241_178_).anInt2700
			    = (((Class241) class241_178_).anInt2700
			       + (bool ? 0 : i_162_));
			bool = true;
		    } else {
			((Class241) this).anAtomicReference2708.set(null);
			boolean bool_179_
			    = method3340((((Class241) this)
					  .aClass528_Sub42_2689
					  .payload),
					 integer.intValue(),
					 integer_177_.intValue(),
					 (((Class241) this)
					  .anAtomicReference2708));
			Class247[] class247s
			    = ((Class247[])
			       ((Class241) this).anAtomicReference2708.get());
			if (bool_179_
			    && (((Class241) this).aBool2705 != true
				|| (((Class241) this).anInt2703
				    >= ((Class241) this).anInt2701)
				|| i_174_ >= ((Class241) this).anInt2675)) {
			    if (class247s != null) {
				int i_180_
				    = ((Class247) class247s[0]).anInt2766;
				((Class241) this).anInt2714 += i_180_;
				if (((Class241) this).anInt2714 > i_165_
				    && i_164_ == 4) {
				    ((Class241) this).anInt2709
					= (((Class241) this).anInt2714 - i_165_
					   - ((Class241) this).anInt2709);
				    i_180_ -= ((Class241) this).anInt2709;
				    if (((Class241) this).anInt2709
					> ((Class247) class247s[0]).anInt2766)
					((Class241) this).anInt2709
					    = (((Class247) class247s[0])
					       .anInt2766);
				    if (i_180_ < 0)
					i_180_ = 0;
				}
				int i_181_ = 0;
				int i_182_
				    = method270(i_180_) * class247s.length;
				if (((Class241) this).aBool2705 == true
				    && (((Class241) this).anInt2700
					< ((Class241) this).anInt2671)) {
				    int i_183_ = i_182_;
				    i_182_ -= method270((((Class241) this)
							 .anInt2671)
							- (((Class241) this)
							   .anInt2700));
				    if (i_182_ <= 0) {
					((Class241) this).anInt2700
					    += method160(i_183_);
					method3325(class247s);
					Object object = null;
					continue;
				    }
				    i_181_ += (((Class241) this).anInt2671
					       - ((Class241) this).anInt2700);
				}
				if ((((Class241) this).anInt2700 + i_180_
				     > ((Class241) this).anInt2664)
				    && ((((Class241) this).anInt2656
					 < ((Class241) this).anInt2673)
					|| ((Class241) this).anInt2673 < 0)
				    && ((Class241) this).aBool2712) {
				    i_182_ -= method270((((Class241) this)
							 .anInt2700)
							+ i_180_
							- (((Class241) this)
							   .anInt2664)
							- 1);
				    if (i_182_ <= 0) {
					method3325(class247s);
					Object object = null;
					continue;
				    }
				}
				int i_184_ = method215();
				if (method3348() < method215()) {
				    int i_185_ = method215() - method3348();
				    i_182_ += i_182_ / method3348() * i_185_;
				}
				ByteBuffer class528_sub42
				    = method3346(i_182_);
				for (int i_186_ = i_181_; i_186_ < i_180_;
				     i_186_++) {
				    boolean bool_187_
					= ((Class241) this).aBool2705;
				    if (((Class241) this).anInt2673 != 0) {
					if (((Class241) this).anInt2700
					    == ((Class241) this).anInt2671) {
					    if (((Class241) this).anInt2697
						< 0) {
						((Class241) this).anInt2697
						    = (((Class241) this)
						       .anInt2699);
						((Class241) this).anInt2675
						    = i_174_;
					    }
					    ((Class241) this).aBool2705
						= false;
					}
					if ((((Class241) this).anInt2700
					     == ((Class241) this).anInt2664)
					    && ((Class241) this).anInt2698 < 0)
					    ((Class241) this).anInt2698
						= ((Class241) this).anInt2699;
					if ((((Class241) this).anInt2700
					     > ((Class241) this).anInt2664)
					    && ((((Class241) this).anInt2656
						 < ((Class241) this).anInt2673)
						|| (((Class241) this).anInt2673
						    < 0))
					    && ((Class241) this).aBool2712)
					    bool_187_ = true;
				    }
				    if (bool_187_
					&& ((((Class241) this).anInt2700
					     < ((Class241) this).anInt2671)
					    || (((Class241) this).anInt2700
						> (((Class241) this)
						   .anInt2664)))) {
					((Class241) this).anInt2700++;
					if (++i_163_ > i_162_)
					    throw new RuntimeException();
				    } else {
					for (int i_188_ = 0; i_188_ < i_184_;
					     i_188_++) {
					    float f;
					    if (i_188_ < class247s.length)
						f = (((Class247)
						      class247s[i_188_])
						     .aFloatArray2769[i_186_]);
					    else
						f = (((Class247)
						      (class247s
						       [(i_188_
							 % method3348())]))
						     .aFloatArray2769[i_186_]);
					    if ((((Class241) this)
						 .aClass365_2660)
						== Class365.aClass365_3846) {
						int i_189_ = method3343(f);
						if ((((Class241) this)
						     .aClass362_2661)
						    == Class362.aClass362_3833)
						    class528_sub42.writeLEShort
							(i_189_, -1102718643);
						else
						    class528_sub42.method9717
							(i_189_, (byte) -9);
					    } else if ((((Class241) this)
							.aClass365_2660)
						       == (Class365
							   .aClass365_3845)) {
						int i_190_ = method3344(f);
						if ((((Class241) this)
						     .aClass362_2661)
						    == Class362.aClass362_3833)
						    class528_sub42.writeLEShort
							(i_190_, -1102718643);
						else
						    class528_sub42.method9717
							(i_190_, (byte) -38);
					    } else if ((((Class241) this)
							.aClass365_2660)
						       == (Class365
							   .aClass365_3844)) {
						int i_191_ = method3371(f);
						class528_sub42.writeByte
						    (i_191_, (byte) -10);
					    } else if ((((Class241) this)
							.aClass365_2660)
						       == (Class365
							   .aClass365_3843)) {
						int i_192_ = method3345(f);
						class528_sub42.writeByte
						    (i_192_, (byte) -99);
					    }
					}
					((Class241) this).anInt2700++;
					i_163_++;
				    }
				}
				synchronized (((Class241) this).aList2686) {
				    ((Class241) this).anInt2713
					+= (method160(class528_sub42.pointer
						      * -185904669)
					    / method215());
				    ((Class241) this).aList2686
					.add(class528_sub42);
				}
			    }
			} else if (method271()) {
			    ((Class241) this).anInt2652 = 0;
			    if (((Class241) this).aClass247Array2674 == null
				|| ((((Class241) this).aClass247Array2674
				     != null)
				    && (((((Class241) this)
					  .aClass247Array2674).length
					 != ((Class241) this).anInt2653)
					|| (((Class247) (((Class241) this)
							 .aClass247Array2674
							 [0])).anInt2766
					    != (((Class241) this)
						.anInt2678))))) {
				if (((Class241) this).aClass247Array2674
				    != null)
				    method3325(((Class241) this)
					       .aClass247Array2674);
				((Class241) this).aClass247Array2674
				    = method3321(((Class241) this).anInt2653,
						 ((Class241) this).anInt2678);
			    }
			}
			method3325(class247s);
			Object object = null;
		    }
		}
		((Class241) this).aClass528_Sub42_2689.pointer
		    = i_173_ * 2015001547;
		((Class241) this).anInt2690 -= i_173_ - i_161_;
	    }
	}
    }
    
    int method3343(float f) {
	int i = (int) (f * 32767.0F);
	if (i > 32767)
	    return 32767;
	if (i < -32768)
	    return -32768;
	return i;
    }
    
    int method3344(float f) {
	int i = (int) (f * 32767.0F + 32768.0F);
	if (i > 65535)
	    return 65535;
	if (i < 0)
	    return 0;
	return i;
    }
    
    int method3345(float f) {
	int i = (int) (f * 127.0F + 128.0F);
	if (i > 255)
	    return 255;
	if (i < 0)
	    return 0;
	return i;
    }
    
    public void method191() {
	if (method261() == Class369.aClass369_3867
	    || method261() == Class369.aClass369_3864
	    || method261() == Class369.aClass369_3862) {
	    method3316(Class369.aClass369_3861);
	    method3364();
	}
    }
    
    ByteBuffer method3346(int i) {
	return new ByteBuffer(i, true);
    }
    
    int method3347() {
	return ((Class241) this).anInt2713;
    }
    
    public void method286(int i, Class365 class365, Class362 class362,
			  int i_193_) {
	((Class241) this).anInt2662 = i_193_;
	if (method3320(i, class365, class362)) {
	    ((Class241) this).aClass365_2660 = class365;
	    ((Class241) this).aClass362_2661 = class362;
	} else
	    throw new RuntimeException("");
    }
    
    public void method275(boolean bool) {
	if (!bool)
	    method263();
	else if (method261() == Class369.aClass369_3866) {
	    method3326(true);
	    method3316(Class369.aClass369_3862);
	}
    }
    
    public Class369 method274() {
	return ((Class241) this).aClass369_2659;
    }
    
    public int method267(int i) {
	return i * (method264().anInt3842 * 1968729145 / 8);
    }
    
    public Class369 method276() {
	return ((Class241) this).aClass369_2659;
    }
    
    public void method280() {
	if (method261() == Class369.aClass369_3867
	    || method261() == Class369.aClass369_3864
	    || method261() == Class369.aClass369_3862) {
	    method3316(Class369.aClass369_3861);
	    method3364();
	}
    }
    
    public void method278(Interface40 interface40) {
	((Class241) this).anInterface40_2657 = interface40;
    }
    
    int method3348() {
	if (((Class241) this).aBool2694)
	    return ((Class241) this).anInt2653;
	throw new RuntimeException("");
    }
    
    public ByteBuffer method281(int i) {
	ByteBuffer class528_sub42 = method3352(i);
	return class528_sub42;
    }
    
    public int method268() {
	return method3347();
    }
    
    public int method297(int i) {
	return i * (method264().anInt3842 * 1968729145 / 8);
    }
    
    public int method295() {
	if (((Class241) this).aBool2694)
	    return (method3348() < ((Class241) this).anInt2662
		    ? ((Class241) this).anInt2662 : method3348());
	throw new RuntimeException("");
    }
    
    synchronized void method3349(ByteBuffer class528_sub42) {
	((Class241) this).aList2676.add(class528_sub42);
	method3316(Class369.aClass369_3862);
    }
    
    void method3350(byte[] is, int i) {
	((Class241) this).anInt2714 = 0;
	if (!method271()) {
	    if (is == null)
		throw new RuntimeException("");
	    int i_194_ = 0;
	    if (method3365(is, i, 1))
		i_194_ = 1;
	    else if (method3365(is, i, 3))
		i_194_ = 3;
	    else if (method3365(is, i, 5))
		i_194_ = 5;
	    else
		throw new RuntimeException(new StringBuilder().append("")
					       .append
					       (i_194_).toString());
	    if (i_194_ == 1) {
		method3323(is, i + 7);
		int i_195_ = method3336(32);
		((Class241) this).anInt2653 = method3336(8);
		((Class241) this).anInt2704 = method3336(32);
		((Class241) this).anInt2654 = method3336(32);
		((Class241) this).anInt2655 = method3336(32);
		((Class241) this).anInt2715 = method3336(32);
		((Class241) this).anInt2666 = 1 << method3336(4);
		((Class241) this).anInt2678 = 1 << method3336(4);
		int i_196_ = 1 << method3336(1);
		if (i_195_ != 0 || i_196_ == 0)
		    throw new RuntimeException("");
		((Class241) this).aBool2694 = true;
		((Class241) this).anInt2699++;
	    } else if (i_194_ != 3 && i_194_ == 5) {
		if (!method3365(is, i, 5))
		    throw new RuntimeException("");
		method3323(is, i + 7);
		if (((Class241) this).aClass247Array2672 != null) {
		    method3325(((Class241) this).aClass247Array2672);
		    ((Class241) this).aClass247Array2672 = null;
		}
		((Class241) this).aClass247Array2672
		    = method3321(((Class241) this).anInt2653,
				 ((Class241) this).anInt2678);
		for (int i_197_ = 0; i_197_ < 2; i_197_++) {
		    int i_198_ = (i_197_ != 0 ? ((Class241) this).anInt2678
				  : ((Class241) this).anInt2666);
		    int i_199_ = i_198_ >> 1;
		    int i_200_ = i_198_ >> 2;
		    int i_201_ = i_198_ >> 3;
		    Class247 class247 = method3324(i_199_);
		    for (int i_202_ = 0; i_202_ < i_200_; i_202_++) {
			((Class247) class247).aFloatArray2769[2 * i_202_]
			    = (float) Math.cos((double) (4 * i_202_)
					       * 3.141592653589793
					       / (double) i_198_);
			((Class247) class247).aFloatArray2769[2 * i_202_ + 1]
			    = -(float) Math.sin((double) (4 * i_202_)
						* 3.141592653589793
						/ (double) i_198_);
		    }
		    Class247 class247_203_ = method3324(i_199_);
		    for (int i_204_ = 0; i_204_ < i_200_; i_204_++) {
			((Class247) class247_203_).aFloatArray2769[2 * i_204_]
			    = (float) Math.cos((double) (2 * i_204_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_198_));
			((Class247) class247_203_).aFloatArray2769[(2 * i_204_
								    + 1)]
			    = (float) Math.sin((double) (2 * i_204_ + 1)
					       * 3.141592653589793
					       / (double) (2 * i_198_));
		    }
		    Class247 class247_205_ = method3324(i_200_);
		    for (int i_206_ = 0; i_206_ < i_201_; i_206_++) {
			((Class247) class247_205_).aFloatArray2769[2 * i_206_]
			    = (float) Math.cos((double) (4 * i_206_ + 2)
					       * 3.141592653589793
					       / (double) i_198_);
			((Class247) class247_205_).aFloatArray2769[(2 * i_206_
								    + 1)]
			    = -(float) Math.sin((double) (4 * i_206_ + 2)
						* 3.141592653589793
						/ (double) i_198_);
		    }
		    int[] is_207_ = new int[i_201_];
		    int i_208_ = Class296.method3974(i_201_ - 1, 510019487);
		    for (int i_209_ = 0; i_209_ < i_201_; i_209_++)
			is_207_[i_209_]
			    = Class571.method6858(i_209_, i_208_, (byte) 34);
		    if (i_197_ != 0) {
			((Class241) this).aClass247_2682 = class247;
			((Class241) this).aClass247_2683 = class247_203_;
			((Class241) this).aClass247_2696 = class247_205_;
			((Class241) this).anIntArray2663 = is_207_;
		    } else {
			((Class241) this).aClass247_2679 = class247;
			((Class241) this).aClass247_2680 = class247_203_;
			((Class241) this).aClass247_2681 = class247_205_;
			((Class241) this).anIntArray2685 = is_207_;
		    }
		}
		method3338();
		int i_210_ = method3336(6) + 1;
		for (int i_211_ = 0; i_211_ < i_210_; i_211_++)
		    method3336(16);
		i_210_ = method3336(6) + 1;
		if (((Class241) this).aClass234Array2710 == null
		    || ((Class241) this).aClass234Array2710.length != i_210_)
		    ((Class241) this).aClass234Array2710
			= new Class234[i_210_];
		for (int i_212_ = 0; i_212_ < i_210_; i_212_++) {
		    if (((Class241) this).aClass234Array2710[i_212_] == null)
			((Class241) this).aClass234Array2710[i_212_]
			    = new Class234();
		    ((Class241) this).aClass234Array2710[i_212_]
			.method3261(this, ((Class241) this).anInt2653);
		}
		int i_213_ = method3336(6) + 1;
		if (((Class241) this).aClass251Array2667 == null
		    || ((Class241) this).aClass251Array2667.length != i_213_)
		    ((Class241) this).aClass251Array2667
			= new Class251[i_213_];
		for (int i_214_ = 0; i_214_ < i_213_; i_214_++) {
		    if (((Class241) this).aClass251Array2667[i_214_] == null)
			((Class241) this).aClass251Array2667[i_214_]
			    = new Class251();
		    ((Class241) this).aClass251Array2667[i_214_]
			.method3426(this);
		}
		int i_215_ = method3336(6) + 1;
		if (((Class241) this).aClass248Array2687 == null
		    || ((Class241) this).aClass248Array2687.length != i_215_)
		    ((Class241) this).aClass248Array2687
			= new Class248[i_215_];
		for (int i_216_ = 0; i_216_ < i_215_; i_216_++) {
		    if (((Class241) this).aClass248Array2687[i_216_] == null)
			((Class241) this).aClass248Array2687[i_216_]
			    = new Class248();
		    ((Class241) this).aClass248Array2687[i_216_]
			.method3411(this);
		}
		int i_217_ = method3336(6) + 1;
		((Class241) this).aBoolArray2670 = new boolean[i_217_];
		((Class241) this).anIntArray2669 = new int[i_217_];
		for (int i_218_ = 0; i_218_ < i_217_; i_218_++) {
		    ((Class241) this).aBoolArray2670[i_218_]
			= method3335() != 0;
		    method3336(16);
		    method3336(16);
		    ((Class241) this).anIntArray2669[i_218_] = method3336(8);
		}
		method3356(true);
	    }
	}
    }
    
    public int method296() {
	if (((Class241) this).aBool2694)
	    return (method3348() < ((Class241) this).anInt2662
		    ? ((Class241) this).anInt2662 : method3348());
	throw new RuntimeException("");
    }
    
    int method3351() {
	if (method271())
	    return ((Class241) this).anInt2704;
	throw new RuntimeException("");
    }
    
    public Class365 method300() {
	return ((Class241) this).aClass365_2660;
    }
    
    public Class365 method288() {
	return ((Class241) this).aClass365_2660;
    }
    
    public Class362 method272() {
	return ((Class241) this).aClass362_2661;
    }
    
    ByteBuffer method3352(int i) {
	ByteBuffer class528_sub42 = method3346(method270(i));
	int i_219_ = i;
	synchronized (((Class241) this).aList2686) {
	    while (!((Class241) this).aList2686.isEmpty()) {
		ByteBuffer class528_sub42_220_
		    = (ByteBuffer) ((Class241) this).aList2686.remove(0);
		((Class241) this).anInt2713
		    -= (method160(class528_sub42_220_.pointer * -185904669)
			/ method215());
		int i_221_ = method270(i_219_);
		int i_222_
		    = (class528_sub42_220_.pointer * -185904669 < i_221_
		       ? class528_sub42_220_.pointer * -185904669 : i_221_);
		class528_sub42.method9618(class528_sub42_220_.payload,
					  0, i_222_, 1417095549);
		i_219_ -= method160(i_222_);
		int i_223_
		    = class528_sub42_220_.pointer * -185904669 - i_222_;
		if (i_223_ != 0) {
		    System.arraycopy(class528_sub42_220_.payload,
				     i_222_,
				     class528_sub42_220_.payload, 0,
				     i_223_);
		    class528_sub42_220_.pointer = i_223_ * 2015001547;
		    ((Class241) this).anInt2713
			+= method160(i_223_) / method215();
		    ((Class241) this).aList2686.add(0, class528_sub42_220_);
		} else
		    class528_sub42_220_.method9632((byte) 44);
		if (i_219_ <= 0)
		    break;
	    }
	    if (((Class241) this).aList2686.isEmpty()
		&& method261() == Class369.aClass369_3865)
		method3316(Class369.aClass369_3866);
	}
	return class528_sub42;
    }
    
    public void method293(int i, Class365 class365, Class362 class362,
			  int i_224_) {
	((Class241) this).anInt2662 = i_224_;
	if (method3320(i, class365, class362)) {
	    ((Class241) this).aClass365_2660 = class365;
	    ((Class241) this).aClass362_2661 = class362;
	} else
	    throw new RuntimeException("");
    }
    
    static {
	aClass186_2684 = new Class186(524288, 1024);
    }
    
    public synchronized boolean method287() {
	return ((Class241) this).aBool2695;
    }
    
    int method3353() {
	if (((Class241) this).aBool2694)
	    return ((Class241) this).anInt2653;
	throw new RuntimeException("");
    }
    
    int method3354() {
	if (((Class241) this).aBool2694)
	    return ((Class241) this).anInt2653;
	throw new RuntimeException("");
    }
    
    public ByteBuffer method269(int i) {
	ByteBuffer class528_sub42 = method3352(i);
	return class528_sub42;
    }
    
    public int method285(int i) {
	return i * (method264().anInt3842 * 1968729145 / 8);
    }
    
    int method3355(int i) {
	int i_225_ = 0;
	int i_226_ = 0;
	int i_227_;
	for (/**/; i >= 8 - ((Class241) this).anInt2688; i -= i_227_) {
	    i_227_ = 8 - ((Class241) this).anInt2688;
	    int i_228_ = (1 << i_227_) - 1;
	    i_225_ += (((((Class241) this).aByteArray2716
			 [((Class241) this).anInt2717])
			>> ((Class241) this).anInt2688)
		       & i_228_) << i_226_;
	    ((Class241) this).anInt2688 = 0;
	    ((Class241) this).anInt2717++;
	    i_226_ += i_227_;
	}
	if (i > 0) {
	    i_227_ = (1 << i) - 1;
	    i_225_ += (((((Class241) this).aByteArray2716
			 [((Class241) this).anInt2717])
			>> ((Class241) this).anInt2688)
		       & i_227_) << i_226_;
	    ((Class241) this).anInt2688 += i;
	}
	return i_225_;
    }
    
    public void method279(Interface40 interface40) {
	((Class241) this).anInterface40_2657 = interface40;
    }
    
    public synchronized boolean method298() {
	return ((Class241) this).aBool2695;
    }
    
    public Class362 method290() {
	return ((Class241) this).aClass362_2661;
    }
    
    public void method294(boolean bool) {
	if (!bool)
	    method263();
	else if (method261() == Class369.aClass369_3866) {
	    method3326(true);
	    method3316(Class369.aClass369_3862);
	}
    }
    
    synchronized void method3356(boolean bool) {
	((Class241) this).aBool2695 = bool;
    }
    
    void method3357() {
	if (method261() != Class369.aClass369_3865) {
	    method3370();
	    if (method261() == Class369.aClass369_3861)
		method3316(Class369.aClass369_3862);
	}
    }
    
    void method3358() {
	if (method261() != Class369.aClass369_3865) {
	    method3370();
	    if (method261() == Class369.aClass369_3861)
		method3316(Class369.aClass369_3862);
	}
    }
    
    void method3359() {
	if (method261() != Class369.aClass369_3865) {
	    method3370();
	    if (method261() == Class369.aClass369_3861)
		method3316(Class369.aClass369_3862);
	}
    }
    
    public Class362 method265() {
	return ((Class241) this).aClass362_2661;
    }
    
    public int method284() {
	if (((Class241) this).aBool2694)
	    return (method3348() < ((Class241) this).anInt2662
		    ? ((Class241) this).anInt2662 : method3348());
	throw new RuntimeException("");
    }
    
    int method3360() {
	return ((Class241) this).anInt2717;
    }
    
    public void method51(ByteBuffer class528_sub42) {
	if (method261() == Class369.aClass369_3865
	    || method261() == Class369.aClass369_3866) {
	    if (class528_sub42 != null)
		class528_sub42.method9632((byte) -16);
	} else if (class528_sub42 == null) {
	    boolean bool = (((Class241) this).aBool2712
			    && ((((Class241) this).anInt2673 > 0
				 && (((Class241) this).anInt2656
				     < ((Class241) this).anInt2673))
				|| ((Class241) this).anInt2673 < 0));
	    if (((Class241) this).aList2686.isEmpty()) {
		if (!bool) {
		    method3337();
		    method3316(Class369.aClass369_3866);
		}
	    } else if (!bool) {
		method3337();
		method3316(Class369.aClass369_3865);
	    }
	    if (bool)
		method3326(true);
	} else
	    method3349(class528_sub42);
    }
    
    int method3361() {
	return ((Class241) this).anInt2688;
    }
    
    public int method282(int i) {
	return i / (method264().anInt3842 * 1968729145 / 8);
    }
    
    void method3362() {
	((Class241) this).aByteArray2716 = null;
    }
    
    void method3363() {
	((Class241) this).aByteArray2716 = null;
    }
    
    void method3364() {
	if (method261() != Class369.aClass369_3865) {
	    method3370();
	    if (method261() == Class369.aClass369_3861)
		method3316(Class369.aClass369_3862);
	}
    }
    
    boolean method3365(byte[] is, int i, int i_229_) {
	if (is[i] != i_229_)
	    return false;
	if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114
	    || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
	    return false;
	return true;
    }
    
    void method3366() {
	if (method261() != Class369.aClass369_3867
	    && method261() != Class369.aClass369_3863
	    && (!((Class241) this).aBool2695
		|| !((float) (((Class241) this).anInt2713 / method3319())
		     > ((Class241) this).aFloat2665))) {
	    if (!method3328()) {
		ByteBuffer class528_sub42
		    = ((ByteBuffer)
		       ((((Class241) this).aList2676 != null
			 && !((Class241) this).aList2676.isEmpty())
			? ((Class241) this).aList2676.get(0) : null));
		if (class528_sub42 == null) {
		    if (!((Class241) this).aBool2692) {
			method3316(Class369.aClass369_3863);
			((Class241) this).anInterface40_2657
			    .method309(1239022665);
			((Class241) this).aBool2692 = true;
		    }
		    return;
		}
		((Class241) this).aBool2692 = false;
		((Class241) this).aBool2719 = true;
		((Class241) this).aList2676.remove(0);
		method3327(class528_sub42);
	    }
	    method3342();
	}
    }
    
    void method3367() {
	if (method261() != Class369.aClass369_3867
	    && method261() != Class369.aClass369_3863
	    && (!((Class241) this).aBool2695
		|| !((float) (((Class241) this).anInt2713 / method3319())
		     > ((Class241) this).aFloat2665))) {
	    if (!method3328()) {
		ByteBuffer class528_sub42
		    = ((ByteBuffer)
		       ((((Class241) this).aList2676 != null
			 && !((Class241) this).aList2676.isEmpty())
			? ((Class241) this).aList2676.get(0) : null));
		if (class528_sub42 == null) {
		    if (!((Class241) this).aBool2692) {
			method3316(Class369.aClass369_3863);
			((Class241) this).anInterface40_2657
			    .method309(1239022665);
			((Class241) this).aBool2692 = true;
		    }
		    return;
		}
		((Class241) this).aBool2692 = false;
		((Class241) this).aBool2719 = true;
		((Class241) this).aList2676.remove(0);
		method3327(class528_sub42);
	    }
	    method3342();
	}
    }
    
    void method3368() {
	if (method261() != Class369.aClass369_3867
	    && method261() != Class369.aClass369_3863
	    && (!((Class241) this).aBool2695
		|| !((float) (((Class241) this).anInt2713 / method3319())
		     > ((Class241) this).aFloat2665))) {
	    if (!method3328()) {
		ByteBuffer class528_sub42
		    = ((ByteBuffer)
		       ((((Class241) this).aList2676 != null
			 && !((Class241) this).aList2676.isEmpty())
			? ((Class241) this).aList2676.get(0) : null));
		if (class528_sub42 == null) {
		    if (!((Class241) this).aBool2692) {
			method3316(Class369.aClass369_3863);
			((Class241) this).anInterface40_2657
			    .method309(1239022665);
			((Class241) this).aBool2692 = true;
		    }
		    return;
		}
		((Class241) this).aBool2692 = false;
		((Class241) this).aBool2719 = true;
		((Class241) this).aList2676.remove(0);
		method3327(class528_sub42);
	    }
	    method3342();
	}
    }
    
    void method3369() {
	if (method261() != Class369.aClass369_3867
	    && method261() != Class369.aClass369_3863
	    && (!((Class241) this).aBool2695
		|| !((float) (((Class241) this).anInt2713 / method3319())
		     > ((Class241) this).aFloat2665))) {
	    if (!method3328()) {
		ByteBuffer class528_sub42
		    = ((ByteBuffer)
		       ((((Class241) this).aList2676 != null
			 && !((Class241) this).aList2676.isEmpty())
			? ((Class241) this).aList2676.get(0) : null));
		if (class528_sub42 == null) {
		    if (!((Class241) this).aBool2692) {
			method3316(Class369.aClass369_3863);
			((Class241) this).anInterface40_2657
			    .method309(1239022665);
			((Class241) this).aBool2692 = true;
		    }
		    return;
		}
		((Class241) this).aBool2692 = false;
		((Class241) this).aBool2719 = true;
		((Class241) this).aList2676.remove(0);
		method3327(class528_sub42);
	    }
	    method3342();
	}
    }
    
    public void method292(boolean bool, int i, int i_230_, int i_231_) {
	((Class241) this).aBool2712 = bool;
	((Class241) this).anInt2673 = i;
	((Class241) this).anInt2671 = i_230_;
	((Class241) this).anInt2664 = i_231_;
    }
    
    void method3370() {
	if (method261() != Class369.aClass369_3867
	    && method261() != Class369.aClass369_3863
	    && (!((Class241) this).aBool2695
		|| !((float) (((Class241) this).anInt2713 / method3319())
		     > ((Class241) this).aFloat2665))) {
	    if (!method3328()) {
		ByteBuffer class528_sub42
		    = ((ByteBuffer)
		       ((((Class241) this).aList2676 != null
			 && !((Class241) this).aList2676.isEmpty())
			? ((Class241) this).aList2676.get(0) : null));
		if (class528_sub42 == null) {
		    if (!((Class241) this).aBool2692) {
			method3316(Class369.aClass369_3863);
			((Class241) this).anInterface40_2657
			    .method309(1239022665);
			((Class241) this).aBool2692 = true;
		    }
		    return;
		}
		((Class241) this).aBool2692 = false;
		((Class241) this).aBool2719 = true;
		((Class241) this).aList2676.remove(0);
		method3327(class528_sub42);
	    }
	    method3342();
	}
    }
    
    int method3371(float f) {
	int i = (int) (f * 127.0F);
	if (i > 127)
	    return 127;
	if (i < -128)
	    return -128;
	return i;
    }
    
    public void method260(boolean bool, int i, int i_232_, int i_233_) {
	((Class241) this).aBool2712 = bool;
	((Class241) this).anInt2673 = i;
	((Class241) this).anInt2671 = i_232_;
	((Class241) this).anInt2664 = i_233_;
    }
    
    public void method273(ByteBuffer class528_sub42) {
	if (method261() == Class369.aClass369_3865
	    || method261() == Class369.aClass369_3866) {
	    if (class528_sub42 != null)
		class528_sub42.method9632((byte) -26);
	} else if (class528_sub42 == null) {
	    boolean bool = (((Class241) this).aBool2712
			    && ((((Class241) this).anInt2673 > 0
				 && (((Class241) this).anInt2656
				     < ((Class241) this).anInt2673))
				|| ((Class241) this).anInt2673 < 0));
	    if (((Class241) this).aList2686.isEmpty()) {
		if (!bool) {
		    method3337();
		    method3316(Class369.aClass369_3866);
		}
	    } else if (!bool) {
		method3337();
		method3316(Class369.aClass369_3865);
	    }
	    if (bool)
		method3326(true);
	} else
	    method3349(class528_sub42);
    }
    
    public void method301(ByteBuffer class528_sub42) {
	if (method261() == Class369.aClass369_3865
	    || method261() == Class369.aClass369_3866) {
	    if (class528_sub42 != null)
		class528_sub42.method9632((byte) 84);
	} else if (class528_sub42 == null) {
	    boolean bool = (((Class241) this).aBool2712
			    && ((((Class241) this).anInt2673 > 0
				 && (((Class241) this).anInt2656
				     < ((Class241) this).anInt2673))
				|| ((Class241) this).anInt2673 < 0));
	    if (((Class241) this).aList2686.isEmpty()) {
		if (!bool) {
		    method3337();
		    method3316(Class369.aClass369_3866);
		}
	    } else if (!bool) {
		method3337();
		method3316(Class369.aClass369_3865);
	    }
	    if (bool)
		method3326(true);
	} else
	    method3349(class528_sub42);
    }
}
