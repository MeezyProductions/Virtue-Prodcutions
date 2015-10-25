/* Class342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Vector;

public class Class342
{
    Class163_Sub1 aClass163_Sub1_3599;
    Class344 aClass344_3600;
    Class163_Sub1 aClass163_Sub1_3601;
    Interface43 anInterface43_3602;
    Interface43 anInterface43_3603;
    int anInt3604;
    Interface19 anInterface19_3605;
    int anInt3606 = 0;
    Interface43 anInterface43_3607;
    Interface19 anInterface19_3608;
    Interface21 anInterface21_3609;
    Interface21 anInterface21_3610;
    int anInt3611;
    int anInt3612;
    int anInt3613;
    Interface19 anInterface19_3614;
    Interface36 anInterface36_3615;
    boolean aBool3616;
    Vector aVector3617 = new Vector();
    Class173_Sub1 aClass173_Sub1_3618;
    Interface19 anInterface19_3619;
    Class169 aClass169_3620;
    int anInt3621;
    
    void method4496(int i, int i_0_) {
	if (((Class342) this).aBool3616) {
	    if (((Class342) this).aClass163_Sub1_3599 != null) {
		((Class342) this).aClass173_Sub1_3618.method2180
		    (((Class342) this).aClass163_Sub1_3599, -838845787);
		((Class342) this).aClass173_Sub1_3618.method2179
		    (((Class342) this).aClass163_Sub1_3601, -387907767);
		((Class342) this).aClass163_Sub1_3599.method8900
		    (0, 0, ((Class342) this).anInt3611,
		     ((Class342) this).anInt3612, 0, 0, true,
		     ((Class342) this).anInterface21_3609 != null);
	    }
	    method4514(i, i_0_);
	    ((Class342) this).aBool3616 = false;
	}
    }
    
    void method4497() {
	if (((Class342) this).anInterface36_3615 == null) {
	    ((Class342) this).anInterface36_3615
		= ((Class342) this).aClass173_Sub1_3618.method8549(false);
	    ((Class342) this).anInterface36_3615.method258(12, 4);
	    ByteBuffer bytebuffer
		= ((Class342) this).aClass173_Sub1_3618.aByteBuffer9222;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    ((Class342) this).anInterface36_3615.method197
		(0, bytebuffer.position(),
		 ((Class342) this).aClass173_Sub1_3618.aLong9223);
	    ((Class342) this).aClass344_3600
		= (((Class342) this).aClass173_Sub1_3618.method8543
		   (new Class345[] { new Class345(Class331.aClass331_3517) }));
	}
    }
    
    void method4498() {
	((Class342) this).aClass173_Sub1_3618
	    .method8553(0, ((Class342) this).anInterface36_3615);
	((Class342) this).aClass173_Sub1_3618
	    .method8552(((Class342) this).aClass344_3600);
	((Class342) this).aClass173_Sub1_3618
	    .method8561(Class363.aClass363_3839, 0, 1);
    }
    
    boolean method4499() {
	int i = ((Class342) this).aVector3617.size();
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    if (!((Class330) ((Class342) this).aVector3617.elementAt(i_1_))
		     .method4287())
		return false;
	}
	return true;
    }
    
    boolean method4500(Class330 class330) {
	Vector vector = new Vector();
	boolean bool = false;
	for (int i = 0; i < ((Class342) this).aVector3617.size(); i++) {
	    if (!bool && class330.method4283() < method4502(i).method4283()) {
		bool = true;
		if (!method4515(vector, vector.size(), class330))
		    return false;
	    }
	    vector.addElement(method4502(i));
	}
	if (!bool && !method4515(vector, vector.size(), class330))
	    return false;
	((Class342) this).aVector3617 = vector;
	return true;
    }
    
    Class342(Class173_Sub1 class173_sub1, int i, int i_2_) {
	((Class342) this).anInt3604 = 0;
	((Class342) this).anInt3621 = 0;
	((Class342) this).aClass173_Sub1_3618 = class173_sub1;
	((Class342) this).aClass169_3620 = Class169.aClass169_1935;
	((Class342) this).anInt3611 = i;
	((Class342) this).anInt3612 = i_2_;
    }
    
    void method4501(Class330 class330) {
	class330.method4308();
	((Class330) class330).aBool3513 = false;
	((Class342) this).aVector3617.removeElement(class330);
    }
    
    Class330 method4502(int i) {
	return (Class330) ((Class342) this).aVector3617.elementAt(i);
    }
    
    boolean method4503() {
	int i = ((Class342) this).aVector3617.size();
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    if (!((Class330) ((Class342) this).aVector3617.elementAt(i_3_))
		     .method4287())
		return false;
	}
	return true;
    }
    
    void method4504() {
	((Class342) this).aClass173_Sub1_3618
	    .method8553(0, ((Class342) this).anInterface36_3615);
	((Class342) this).aClass173_Sub1_3618
	    .method8552(((Class342) this).aClass344_3600);
	((Class342) this).aClass173_Sub1_3618
	    .method8561(Class363.aClass363_3839, 0, 1);
    }
    
    void method4505(int i, int i_4_) {
	if (((Class342) this).aBool3616) {
	    if (((Class342) this).aClass163_Sub1_3599 != null) {
		((Class342) this).aClass173_Sub1_3618.method2180
		    (((Class342) this).aClass163_Sub1_3599, -1031251956);
		((Class342) this).aClass173_Sub1_3618.method2179
		    (((Class342) this).aClass163_Sub1_3601, -1882311617);
		((Class342) this).aClass163_Sub1_3599.method8900
		    (0, 0, ((Class342) this).anInt3611,
		     ((Class342) this).anInt3612, 0, 0, true,
		     ((Class342) this).anInterface21_3609 != null);
	    }
	    method4514(i, i_4_);
	    ((Class342) this).aBool3616 = false;
	}
    }
    
    void method4506() {
	method4497();
	switch (((Class342) this).anInt3604) {
	case 1:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1939;
	    break;
	case 2:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1940;
	    break;
	case 0:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1935;
	    break;
	default:
	    throw new RuntimeException();
	}
	((Class342) this).aClass163_Sub1_3601
	    = ((Class342) this).aClass173_Sub1_3618.method2236();
	if (((Class342) this).aClass173_Sub1_3618.anInt9355 > 1
	    && ((Class342) this).aClass173_Sub1_3618.aBool9364
	    && ((Class342) this).aClass173_Sub1_3618.aBool9225) {
	    ((Class342) this).aClass163_Sub1_3599
		= ((Class342) this).aClass173_Sub1_3618.method2236();
	    ((Class342) this).anInterface19_3608
		= (((Class342) this).aClass173_Sub1_3618.method2416
		   (((Class342) this).anInt3611, ((Class342) this).anInt3612,
		    Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		    ((Class342) this).aClass173_Sub1_3618.anInt9355));
	    ((Class342) this).anInterface21_3610
		= (((Class342) this).aClass173_Sub1_3618.method2411
		   (((Class342) this).anInt3611, ((Class342) this).anInt3612,
		    ((Class342) this).aClass173_Sub1_3618.anInt9355));
	}
	((Class342) this).anInterface43_3602
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3605
	    = ((Class342) this).anInterface43_3602.method320(0);
	((Class342) this).anInterface43_3603
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3614
	    = ((Class342) this).anInterface43_3603.method320(0);
	((Class342) this).anInterface43_3607
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3619
	    = ((Class342) this).anInterface43_3607.method320(0);
	((Class342) this).anInterface21_3609
	    = (((Class342) this).aClass173_Sub1_3618.method2184
	       (((Class342) this).anInterface43_3607.method1(),
		((Class342) this).anInterface43_3607.method68()));
	int i = ((Class342) this).aVector3617.size();
	for (int i_5_ = 0; i_5_ < i; i_5_++) {
	    Class330 class330
		= (Class330) ((Class342) this).aVector3617.elementAt(i_5_);
	    class330.method4279(((Class342) this).anInt3611,
				((Class342) this).anInt3612);
	}
    }
    
    void method4507() {
	if (((Class342) this).anInterface36_3615 == null) {
	    ((Class342) this).anInterface36_3615
		= ((Class342) this).aClass173_Sub1_3618.method8549(false);
	    ((Class342) this).anInterface36_3615.method258(12, 4);
	    ByteBuffer bytebuffer
		= ((Class342) this).aClass173_Sub1_3618.aByteBuffer9222;
	    bytebuffer.clear();
	    bytebuffer.putFloat(0.0F);
	    bytebuffer.putFloat(1.0F);
	    bytebuffer.putFloat(2.0F);
	    ((Class342) this).anInterface36_3615.method197
		(0, bytebuffer.position(),
		 ((Class342) this).aClass173_Sub1_3618.aLong9223);
	    ((Class342) this).aClass344_3600
		= (((Class342) this).aClass173_Sub1_3618.method8543
		   (new Class345[] { new Class345(Class331.aClass331_3517) }));
	}
    }
    
    void method4508() {
	if (((Class342) this).aClass163_Sub1_3599 != null) {
	    ((Class342) this).aClass163_Sub1_3599.method115();
	    ((Class342) this).aClass163_Sub1_3599 = null;
	}
	if (((Class342) this).anInterface19_3608 != null) {
	    ((Class342) this).anInterface19_3608.method115();
	    ((Class342) this).anInterface19_3608 = null;
	}
	if (((Class342) this).anInterface21_3610 != null) {
	    ((Class342) this).anInterface21_3610.method115();
	    ((Class342) this).anInterface21_3610 = null;
	}
	if (((Class342) this).aClass163_Sub1_3601 != null)
	    ((Class342) this).aClass163_Sub1_3601.method115();
	if (((Class342) this).anInterface19_3605 != null)
	    ((Class342) this).anInterface19_3605.method115();
	if (((Class342) this).anInterface19_3614 != null)
	    ((Class342) this).anInterface19_3614.method115();
	if (((Class342) this).anInterface19_3619 != null)
	    ((Class342) this).anInterface19_3619.method115();
	if (((Class342) this).anInterface43_3602 != null)
	    ((Class342) this).anInterface43_3602.method115();
	if (((Class342) this).anInterface43_3603 != null)
	    ((Class342) this).anInterface43_3603.method115();
	if (((Class342) this).anInterface43_3607 != null)
	    ((Class342) this).anInterface43_3607.method115();
	if (((Class342) this).anInterface21_3609 != null)
	    ((Class342) this).anInterface21_3609.method115();
	int i = ((Class342) this).aVector3617.size();
	for (int i_6_ = 0; i_6_ < i; i_6_++) {
	    Class330 class330
		= (Class330) ((Class342) this).aVector3617.elementAt(i_6_);
	    class330.method4308();
	}
    }
    
    void method4509() {
	((Class342) this).aClass173_Sub1_3618
	    .method8553(0, ((Class342) this).anInterface36_3615);
	((Class342) this).aClass173_Sub1_3618
	    .method8552(((Class342) this).aClass344_3600);
	((Class342) this).aClass173_Sub1_3618
	    .method8561(Class363.aClass363_3839, 0, 1);
    }
    
    void method4510() {
	method4497();
	switch (((Class342) this).anInt3604) {
	case 1:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1939;
	    break;
	case 2:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1940;
	    break;
	case 0:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1935;
	    break;
	default:
	    throw new RuntimeException();
	}
	((Class342) this).aClass163_Sub1_3601
	    = ((Class342) this).aClass173_Sub1_3618.method2236();
	if (((Class342) this).aClass173_Sub1_3618.anInt9355 > 1
	    && ((Class342) this).aClass173_Sub1_3618.aBool9364
	    && ((Class342) this).aClass173_Sub1_3618.aBool9225) {
	    ((Class342) this).aClass163_Sub1_3599
		= ((Class342) this).aClass173_Sub1_3618.method2236();
	    ((Class342) this).anInterface19_3608
		= (((Class342) this).aClass173_Sub1_3618.method2416
		   (((Class342) this).anInt3611, ((Class342) this).anInt3612,
		    Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		    ((Class342) this).aClass173_Sub1_3618.anInt9355));
	    ((Class342) this).anInterface21_3610
		= (((Class342) this).aClass173_Sub1_3618.method2411
		   (((Class342) this).anInt3611, ((Class342) this).anInt3612,
		    ((Class342) this).aClass173_Sub1_3618.anInt9355));
	}
	((Class342) this).anInterface43_3602
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3605
	    = ((Class342) this).anInterface43_3602.method320(0);
	((Class342) this).anInterface43_3603
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3614
	    = ((Class342) this).anInterface43_3603.method320(0);
	((Class342) this).anInterface43_3607
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3619
	    = ((Class342) this).anInterface43_3607.method320(0);
	((Class342) this).anInterface21_3609
	    = (((Class342) this).aClass173_Sub1_3618.method2184
	       (((Class342) this).anInterface43_3607.method1(),
		((Class342) this).anInterface43_3607.method68()));
	int i = ((Class342) this).aVector3617.size();
	for (int i_7_ = 0; i_7_ < i; i_7_++) {
	    Class330 class330
		= (Class330) ((Class342) this).aVector3617.elementAt(i_7_);
	    class330.method4279(((Class342) this).anInt3611,
				((Class342) this).anInt3612);
	}
    }
    
    void method4511() {
	method4497();
	switch (((Class342) this).anInt3604) {
	case 1:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1939;
	    break;
	case 2:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1940;
	    break;
	case 0:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1935;
	    break;
	default:
	    throw new RuntimeException();
	}
	((Class342) this).aClass163_Sub1_3601
	    = ((Class342) this).aClass173_Sub1_3618.method2236();
	if (((Class342) this).aClass173_Sub1_3618.anInt9355 > 1
	    && ((Class342) this).aClass173_Sub1_3618.aBool9364
	    && ((Class342) this).aClass173_Sub1_3618.aBool9225) {
	    ((Class342) this).aClass163_Sub1_3599
		= ((Class342) this).aClass173_Sub1_3618.method2236();
	    ((Class342) this).anInterface19_3608
		= (((Class342) this).aClass173_Sub1_3618.method2416
		   (((Class342) this).anInt3611, ((Class342) this).anInt3612,
		    Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		    ((Class342) this).aClass173_Sub1_3618.anInt9355));
	    ((Class342) this).anInterface21_3610
		= (((Class342) this).aClass173_Sub1_3618.method2411
		   (((Class342) this).anInt3611, ((Class342) this).anInt3612,
		    ((Class342) this).aClass173_Sub1_3618.anInt9355));
	}
	((Class342) this).anInterface43_3602
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3605
	    = ((Class342) this).anInterface43_3602.method320(0);
	((Class342) this).anInterface43_3603
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3614
	    = ((Class342) this).anInterface43_3603.method320(0);
	((Class342) this).anInterface43_3607
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3619
	    = ((Class342) this).anInterface43_3607.method320(0);
	((Class342) this).anInterface21_3609
	    = (((Class342) this).aClass173_Sub1_3618.method2184
	       (((Class342) this).anInterface43_3607.method1(),
		((Class342) this).anInterface43_3607.method68()));
	int i = ((Class342) this).aVector3617.size();
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    Class330 class330
		= (Class330) ((Class342) this).aVector3617.elementAt(i_8_);
	    class330.method4279(((Class342) this).anInt3611,
				((Class342) this).anInt3612);
	}
    }
    
    void method4512() {
	method4497();
	switch (((Class342) this).anInt3604) {
	case 1:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1939;
	    break;
	case 2:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1940;
	    break;
	case 0:
	    ((Class342) this).aClass169_3620 = Class169.aClass169_1935;
	    break;
	default:
	    throw new RuntimeException();
	}
	((Class342) this).aClass163_Sub1_3601
	    = ((Class342) this).aClass173_Sub1_3618.method2236();
	if (((Class342) this).aClass173_Sub1_3618.anInt9355 > 1
	    && ((Class342) this).aClass173_Sub1_3618.aBool9364
	    && ((Class342) this).aClass173_Sub1_3618.aBool9225) {
	    ((Class342) this).aClass163_Sub1_3599
		= ((Class342) this).aClass173_Sub1_3618.method2236();
	    ((Class342) this).anInterface19_3608
		= (((Class342) this).aClass173_Sub1_3618.method2416
		   (((Class342) this).anInt3611, ((Class342) this).anInt3612,
		    Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		    ((Class342) this).aClass173_Sub1_3618.anInt9355));
	    ((Class342) this).anInterface21_3610
		= (((Class342) this).aClass173_Sub1_3618.method2411
		   (((Class342) this).anInt3611, ((Class342) this).anInt3612,
		    ((Class342) this).aClass173_Sub1_3618.anInt9355));
	}
	((Class342) this).anInterface43_3602
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3605
	    = ((Class342) this).anInterface43_3602.method320(0);
	((Class342) this).anInterface43_3603
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3614
	    = ((Class342) this).anInterface43_3603.method320(0);
	((Class342) this).anInterface43_3607
	    = (((Class342) this).aClass173_Sub1_3618.method8525
	       (Class149.aClass149_1676, ((Class342) this).aClass169_3620,
		((Class342) this).anInt3611, ((Class342) this).anInt3612));
	((Class342) this).anInterface19_3619
	    = ((Class342) this).anInterface43_3607.method320(0);
	((Class342) this).anInterface21_3609
	    = (((Class342) this).aClass173_Sub1_3618.method2184
	       (((Class342) this).anInterface43_3607.method1(),
		((Class342) this).anInterface43_3607.method68()));
	int i = ((Class342) this).aVector3617.size();
	for (int i_9_ = 0; i_9_ < i; i_9_++) {
	    Class330 class330
		= (Class330) ((Class342) this).aVector3617.elementAt(i_9_);
	    class330.method4279(((Class342) this).anInt3611,
				((Class342) this).anInt3612);
	}
    }
    
    void method4513(int i, int i_10_) {
	((Class342) this).aClass173_Sub1_3618.method2350(true);
	((Class342) this).aClass173_Sub1_3618.method8518();
	((Class342) this).aClass173_Sub1_3618.method8479(0);
	((Class342) this).aClass173_Sub1_3618.method8586(1);
	((Class342) this).aClass173_Sub1_3618.method2203();
	((Class342) this).aClass163_Sub1_3601.method8907(null);
	((Class342) this).aClass173_Sub1_3618.method8482(0, 0);
	int i_11_ = ((Class342) this).aVector3617.size();
	Vector vector = ((Class342) this).aVector3617;
	for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
	    if (((Class330) ((Class342) this).aVector3617.elementAt(i_12_))
		    .method4287()) {
		vector = new Vector();
		for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
		    if (!((Class330)
			  ((Class342) this).aVector3617.elementAt(i_13_))
			     .method4287())
			vector.addElement(((Class342) this).aVector3617
					      .elementAt(i_13_));
		}
		i_11_ = vector.size();
		break;
	    }
	}
	((Class342) this).anInterface43_3607.method218();
	for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
	    Class330 class330 = (Class330) vector.elementAt(i_14_);
	    int i_15_ = class330.method4282();
	    boolean bool = i_14_ == i_11_ - 1;
	    boolean bool_16_ = false;
	    for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
		if (i_17_ == i_15_ - 1) {
		    if (bool) {
			((Class342) this).aClass173_Sub1_3618.method2180
			    (((Class342) this).aClass163_Sub1_3601,
			     1397192431);
			((Class342) this).aClass173_Sub1_3618.method2204
			    (((Class342) this).anInt3613,
			     ((Class342) this).anInt3606,
			     ((Class342) this).anInt3613 + i,
			     ((Class342) this).anInt3606 + i_10_);
		    } else {
			bool_16_ = true;
			((Class342) this).aClass163_Sub1_3601.method8898
			    (0, ((Class342) this).anInterface19_3619);
		    }
		} else
		    ((Class342) this).aClass163_Sub1_3601
			.method8898(0, ((Class342) this).anInterface19_3614);
		Interface43 interface43 = ((Class342) this).anInterface43_3602;
		if (i_17_ == 0)
		    interface43 = ((Class342) this).anInterface43_3607;
		class330.method4280(i_17_,
				    ((Class342) this).aClass163_Sub1_3601,
				    interface43,
				    ((Class342) this).anInterface21_3609,
				    ((Class342) this).anInterface43_3607,
				    bool && i_17_ == i_15_ - 1);
		method4498();
		class330.method4281(i_17_);
		if (bool_16_)
		    ((Class342) this).anInterface43_3607.method218();
		Interface43 interface43_18_
		    = ((Class342) this).anInterface43_3602;
		((Class342) this).anInterface43_3602
		    = ((Class342) this).anInterface43_3603;
		((Class342) this).anInterface43_3603 = interface43_18_;
		Interface19 interface19 = ((Class342) this).anInterface19_3605;
		((Class342) this).anInterface19_3605
		    = ((Class342) this).anInterface19_3614;
		((Class342) this).anInterface19_3614 = interface19;
	    }
	}
	((Class342) this).aClass173_Sub1_3618.method8479(1);
	((Class342) this).aClass173_Sub1_3618.method8586(0);
	((Class342) this).aClass173_Sub1_3618.method2350(false);
	((Class342) this).aClass173_Sub1_3618.method2203();
	Object object = null;
    }
    
    void method4514(int i, int i_19_) {
	((Class342) this).aClass173_Sub1_3618.method2350(true);
	((Class342) this).aClass173_Sub1_3618.method8518();
	((Class342) this).aClass173_Sub1_3618.method8479(0);
	((Class342) this).aClass173_Sub1_3618.method8586(1);
	((Class342) this).aClass173_Sub1_3618.method2203();
	((Class342) this).aClass163_Sub1_3601.method8907(null);
	((Class342) this).aClass173_Sub1_3618.method8482(0, 0);
	int i_20_ = ((Class342) this).aVector3617.size();
	Vector vector = ((Class342) this).aVector3617;
	for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
	    if (((Class330) ((Class342) this).aVector3617.elementAt(i_21_))
		    .method4287()) {
		vector = new Vector();
		for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
		    if (!((Class330)
			  ((Class342) this).aVector3617.elementAt(i_22_))
			     .method4287())
			vector.addElement(((Class342) this).aVector3617
					      .elementAt(i_22_));
		}
		i_20_ = vector.size();
		break;
	    }
	}
	((Class342) this).anInterface43_3607.method218();
	for (int i_23_ = 0; i_23_ < i_20_; i_23_++) {
	    Class330 class330 = (Class330) vector.elementAt(i_23_);
	    int i_24_ = class330.method4282();
	    boolean bool = i_23_ == i_20_ - 1;
	    boolean bool_25_ = false;
	    for (int i_26_ = 0; i_26_ < i_24_; i_26_++) {
		if (i_26_ == i_24_ - 1) {
		    if (bool) {
			((Class342) this).aClass173_Sub1_3618.method2180
			    (((Class342) this).aClass163_Sub1_3601,
			     1042270567);
			((Class342) this).aClass173_Sub1_3618.method2204
			    (((Class342) this).anInt3613,
			     ((Class342) this).anInt3606,
			     ((Class342) this).anInt3613 + i,
			     ((Class342) this).anInt3606 + i_19_);
		    } else {
			bool_25_ = true;
			((Class342) this).aClass163_Sub1_3601.method8898
			    (0, ((Class342) this).anInterface19_3619);
		    }
		} else
		    ((Class342) this).aClass163_Sub1_3601
			.method8898(0, ((Class342) this).anInterface19_3614);
		Interface43 interface43 = ((Class342) this).anInterface43_3602;
		if (i_26_ == 0)
		    interface43 = ((Class342) this).anInterface43_3607;
		class330.method4280(i_26_,
				    ((Class342) this).aClass163_Sub1_3601,
				    interface43,
				    ((Class342) this).anInterface21_3609,
				    ((Class342) this).anInterface43_3607,
				    bool && i_26_ == i_24_ - 1);
		method4498();
		class330.method4281(i_26_);
		if (bool_25_)
		    ((Class342) this).anInterface43_3607.method218();
		Interface43 interface43_27_
		    = ((Class342) this).anInterface43_3602;
		((Class342) this).anInterface43_3602
		    = ((Class342) this).anInterface43_3603;
		((Class342) this).anInterface43_3603 = interface43_27_;
		Interface19 interface19 = ((Class342) this).anInterface19_3605;
		((Class342) this).anInterface19_3605
		    = ((Class342) this).anInterface19_3614;
		((Class342) this).anInterface19_3614 = interface19;
	    }
	}
	((Class342) this).aClass173_Sub1_3618.method8479(1);
	((Class342) this).aClass173_Sub1_3618.method8586(0);
	((Class342) this).aClass173_Sub1_3618.method2350(false);
	((Class342) this).aClass173_Sub1_3618.method2203();
	Object object = null;
    }
    
    boolean method4515(Vector vector, int i, Class330 class330) {
	if (class330.method4276() || class330.method4296()) {
	    vector.insertElementAt(class330, i);
	    class330.method4279(((Class342) this).anInt3611,
				((Class342) this).anInt3612);
	    int i_28_ = class330.method4327();
	    if (i_28_ > ((Class342) this).anInt3604)
		((Class342) this).anInt3604 = i_28_;
	    ((Class330) class330).aBool3513 = true;
	    return true;
	}
	return false;
    }
    
    boolean method4516(int i, int i_29_, int i_30_, int i_31_) {
	if (((Class342) this).aVector3617.isEmpty() || method4503())
	    return true;
	if (((Class342) this).anInt3611 != i_30_
	    || ((Class342) this).anInt3612 != i_31_
	    || (((Class342) this).aClass173_Sub1_3618.anInt9355
		!= ((Class342) this).anInt3621)) {
	    ((Class342) this).anInt3621
		= ((Class342) this).aClass173_Sub1_3618.anInt9355;
	    ((Class342) this).anInt3611 = i_30_;
	    ((Class342) this).anInt3612 = i_31_;
	    method4508();
	    method4511();
	}
	((Class342) this).aClass163_Sub1_3601
	    .method8898(0, ((Class342) this).anInterface19_3619);
	if (((Class342) this).anInterface21_3609 != null)
	    ((Class342) this).aClass163_Sub1_3601
		.method8907(((Class342) this).anInterface21_3609);
	if (((Class342) this).aClass163_Sub1_3599 != null) {
	    ((Class342) this).aClass163_Sub1_3599
		.method8898(0, ((Class342) this).anInterface19_3608);
	    ((Class342) this).aClass163_Sub1_3599
		.method8907(((Class342) this).anInterface21_3610);
	    ((Class342) this).aClass173_Sub1_3618.method2179
		(((Class342) this).aClass163_Sub1_3599, -1529811857);
	} else
	    ((Class342) this).aClass173_Sub1_3618.method2179
		(((Class342) this).aClass163_Sub1_3601, -1983246683);
	if (!((Class342) this).aClass163_Sub1_3601.method8897()) {
	    ((Class342) this).aClass173_Sub1_3618.method2180
		((((Class342) this).aClass163_Sub1_3599 != null
		  ? ((Class342) this).aClass163_Sub1_3599
		  : ((Class342) this).aClass163_Sub1_3601),
		 900780528);
	    return false;
	}
	((Class342) this).anInt3613 = i;
	((Class342) this).anInt3606 = i_29_;
	((Class342) this).aClass173_Sub1_3618.method2268(3, -16777216);
	((Class342) this).aClass173_Sub1_3618.method8545(15);
	((Class342) this).aClass173_Sub1_3618.method8571(0);
	((Class342) this).aBool3616 = true;
	return true;
    }
    
    void method4517(int i, int i_32_) {
	((Class342) this).aClass173_Sub1_3618.method2350(true);
	((Class342) this).aClass173_Sub1_3618.method8518();
	((Class342) this).aClass173_Sub1_3618.method8479(0);
	((Class342) this).aClass173_Sub1_3618.method8586(1);
	((Class342) this).aClass173_Sub1_3618.method2203();
	((Class342) this).aClass163_Sub1_3601.method8907(null);
	((Class342) this).aClass173_Sub1_3618.method8482(0, 0);
	int i_33_ = ((Class342) this).aVector3617.size();
	Vector vector = ((Class342) this).aVector3617;
	for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
	    if (((Class330) ((Class342) this).aVector3617.elementAt(i_34_))
		    .method4287()) {
		vector = new Vector();
		for (int i_35_ = 0; i_35_ < i_33_; i_35_++) {
		    if (!((Class330)
			  ((Class342) this).aVector3617.elementAt(i_35_))
			     .method4287())
			vector.addElement(((Class342) this).aVector3617
					      .elementAt(i_35_));
		}
		i_33_ = vector.size();
		break;
	    }
	}
	((Class342) this).anInterface43_3607.method218();
	for (int i_36_ = 0; i_36_ < i_33_; i_36_++) {
	    Class330 class330 = (Class330) vector.elementAt(i_36_);
	    int i_37_ = class330.method4282();
	    boolean bool = i_36_ == i_33_ - 1;
	    boolean bool_38_ = false;
	    for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
		if (i_39_ == i_37_ - 1) {
		    if (bool) {
			((Class342) this).aClass173_Sub1_3618.method2180
			    (((Class342) this).aClass163_Sub1_3601, 932357951);
			((Class342) this).aClass173_Sub1_3618.method2204
			    (((Class342) this).anInt3613,
			     ((Class342) this).anInt3606,
			     ((Class342) this).anInt3613 + i,
			     ((Class342) this).anInt3606 + i_32_);
		    } else {
			bool_38_ = true;
			((Class342) this).aClass163_Sub1_3601.method8898
			    (0, ((Class342) this).anInterface19_3619);
		    }
		} else
		    ((Class342) this).aClass163_Sub1_3601
			.method8898(0, ((Class342) this).anInterface19_3614);
		Interface43 interface43 = ((Class342) this).anInterface43_3602;
		if (i_39_ == 0)
		    interface43 = ((Class342) this).anInterface43_3607;
		class330.method4280(i_39_,
				    ((Class342) this).aClass163_Sub1_3601,
				    interface43,
				    ((Class342) this).anInterface21_3609,
				    ((Class342) this).anInterface43_3607,
				    bool && i_39_ == i_37_ - 1);
		method4498();
		class330.method4281(i_39_);
		if (bool_38_)
		    ((Class342) this).anInterface43_3607.method218();
		Interface43 interface43_40_
		    = ((Class342) this).anInterface43_3602;
		((Class342) this).anInterface43_3602
		    = ((Class342) this).anInterface43_3603;
		((Class342) this).anInterface43_3603 = interface43_40_;
		Interface19 interface19 = ((Class342) this).anInterface19_3605;
		((Class342) this).anInterface19_3605
		    = ((Class342) this).anInterface19_3614;
		((Class342) this).anInterface19_3614 = interface19;
	    }
	}
	((Class342) this).aClass173_Sub1_3618.method8479(1);
	((Class342) this).aClass173_Sub1_3618.method8586(0);
	((Class342) this).aClass173_Sub1_3618.method2350(false);
	((Class342) this).aClass173_Sub1_3618.method2203();
	Object object = null;
    }
    
    void method4518() {
	if (((Class342) this).aClass163_Sub1_3599 != null) {
	    ((Class342) this).aClass163_Sub1_3599.method115();
	    ((Class342) this).aClass163_Sub1_3599 = null;
	}
	if (((Class342) this).anInterface19_3608 != null) {
	    ((Class342) this).anInterface19_3608.method115();
	    ((Class342) this).anInterface19_3608 = null;
	}
	if (((Class342) this).anInterface21_3610 != null) {
	    ((Class342) this).anInterface21_3610.method115();
	    ((Class342) this).anInterface21_3610 = null;
	}
	if (((Class342) this).aClass163_Sub1_3601 != null)
	    ((Class342) this).aClass163_Sub1_3601.method115();
	if (((Class342) this).anInterface19_3605 != null)
	    ((Class342) this).anInterface19_3605.method115();
	if (((Class342) this).anInterface19_3614 != null)
	    ((Class342) this).anInterface19_3614.method115();
	if (((Class342) this).anInterface19_3619 != null)
	    ((Class342) this).anInterface19_3619.method115();
	if (((Class342) this).anInterface43_3602 != null)
	    ((Class342) this).anInterface43_3602.method115();
	if (((Class342) this).anInterface43_3603 != null)
	    ((Class342) this).anInterface43_3603.method115();
	if (((Class342) this).anInterface43_3607 != null)
	    ((Class342) this).anInterface43_3607.method115();
	if (((Class342) this).anInterface21_3609 != null)
	    ((Class342) this).anInterface21_3609.method115();
	int i = ((Class342) this).aVector3617.size();
	for (int i_41_ = 0; i_41_ < i; i_41_++) {
	    Class330 class330
		= (Class330) ((Class342) this).aVector3617.elementAt(i_41_);
	    class330.method4308();
	}
    }
    
    void method4519() {
	if (((Class342) this).aClass163_Sub1_3599 != null) {
	    ((Class342) this).aClass163_Sub1_3599.method115();
	    ((Class342) this).aClass163_Sub1_3599 = null;
	}
	if (((Class342) this).anInterface19_3608 != null) {
	    ((Class342) this).anInterface19_3608.method115();
	    ((Class342) this).anInterface19_3608 = null;
	}
	if (((Class342) this).anInterface21_3610 != null) {
	    ((Class342) this).anInterface21_3610.method115();
	    ((Class342) this).anInterface21_3610 = null;
	}
	if (((Class342) this).aClass163_Sub1_3601 != null)
	    ((Class342) this).aClass163_Sub1_3601.method115();
	if (((Class342) this).anInterface19_3605 != null)
	    ((Class342) this).anInterface19_3605.method115();
	if (((Class342) this).anInterface19_3614 != null)
	    ((Class342) this).anInterface19_3614.method115();
	if (((Class342) this).anInterface19_3619 != null)
	    ((Class342) this).anInterface19_3619.method115();
	if (((Class342) this).anInterface43_3602 != null)
	    ((Class342) this).anInterface43_3602.method115();
	if (((Class342) this).anInterface43_3603 != null)
	    ((Class342) this).anInterface43_3603.method115();
	if (((Class342) this).anInterface43_3607 != null)
	    ((Class342) this).anInterface43_3607.method115();
	if (((Class342) this).anInterface21_3609 != null)
	    ((Class342) this).anInterface21_3609.method115();
	int i = ((Class342) this).aVector3617.size();
	for (int i_42_ = 0; i_42_ < i; i_42_++) {
	    Class330 class330
		= (Class330) ((Class342) this).aVector3617.elementAt(i_42_);
	    class330.method4308();
	}
    }
    
    void method4520() {
	if (((Class342) this).aClass163_Sub1_3599 != null) {
	    ((Class342) this).aClass163_Sub1_3599.method115();
	    ((Class342) this).aClass163_Sub1_3599 = null;
	}
	if (((Class342) this).anInterface19_3608 != null) {
	    ((Class342) this).anInterface19_3608.method115();
	    ((Class342) this).anInterface19_3608 = null;
	}
	if (((Class342) this).anInterface21_3610 != null) {
	    ((Class342) this).anInterface21_3610.method115();
	    ((Class342) this).anInterface21_3610 = null;
	}
	if (((Class342) this).aClass163_Sub1_3601 != null)
	    ((Class342) this).aClass163_Sub1_3601.method115();
	if (((Class342) this).anInterface19_3605 != null)
	    ((Class342) this).anInterface19_3605.method115();
	if (((Class342) this).anInterface19_3614 != null)
	    ((Class342) this).anInterface19_3614.method115();
	if (((Class342) this).anInterface19_3619 != null)
	    ((Class342) this).anInterface19_3619.method115();
	if (((Class342) this).anInterface43_3602 != null)
	    ((Class342) this).anInterface43_3602.method115();
	if (((Class342) this).anInterface43_3603 != null)
	    ((Class342) this).anInterface43_3603.method115();
	if (((Class342) this).anInterface43_3607 != null)
	    ((Class342) this).anInterface43_3607.method115();
	if (((Class342) this).anInterface21_3609 != null)
	    ((Class342) this).anInterface21_3609.method115();
	int i = ((Class342) this).aVector3617.size();
	for (int i_43_ = 0; i_43_ < i; i_43_++) {
	    Class330 class330
		= (Class330) ((Class342) this).aVector3617.elementAt(i_43_);
	    class330.method4308();
	}
    }
}
