/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class124
{
    int anInt1552;
    int anInt1553 = 0;
    int anInt1554;
    Class115 aClass115_1555;
    Class173_Sub2 aClass173_Sub2_1556;
    Class110[] aClass110Array1557;
    Class110_Sub2 aClass110_Sub2_1558;
    
    boolean method1603(Class120 class120, int i) {
	if (((Class124) this).anInt1554 == 0)
	    return false;
	((Class124) this).aClass110Array1557
	    [((Class124) this).anInt1554 & 0x7fffffff].method1414(class120, i);
	return true;
    }
    
    boolean method1604(int i) {
	return ((Class124) this).aClass110Array1557[i].method1415();
    }
    
    Class124(Class173_Sub2 class173_sub2) {
	((Class124) this).anInt1552 = 0;
	((Class124) this).anInt1554 = 0;
	((Class124) this).aClass173_Sub2_1556 = class173_sub2;
	((Class124) this).aClass115_1555 = new Class115(class173_sub2);
	((Class124) this).aClass110Array1557 = new Class110[16];
	((Class124) this).aClass110Array1557[1]
	    = new Class110_Sub8(class173_sub2);
	((Class124) this).aClass110Array1557[2]
	    = new Class110_Sub1(class173_sub2,
				((Class124) this).aClass115_1555);
	((Class124) this).aClass110Array1557[4]
	    = new Class110_Sub3(class173_sub2,
				((Class124) this).aClass115_1555);
	((Class124) this).aClass110Array1557[5]
	    = new Class110_Sub6(class173_sub2,
				((Class124) this).aClass115_1555);
	((Class124) this).aClass110Array1557[6]
	    = new Class110_Sub7(class173_sub2);
	((Class124) this).aClass110Array1557[7]
	    = new Class110_Sub5(class173_sub2);
	((Class124) this).aClass110Array1557[3]
	    = ((Class124) this).aClass110_Sub2_1558
	    = new Class110_Sub2(class173_sub2);
	((Class124) this).aClass110Array1557[8]
	    = new Class110_Sub9(class173_sub2,
				((Class124) this).aClass115_1555);
	((Class124) this).aClass110Array1557[9]
	    = new Class110_Sub4(class173_sub2,
				((Class124) this).aClass115_1555);
	if (!((Class124) this).aClass110Array1557[8].method1415())
	    ((Class124) this).aClass110Array1557[8]
		= ((Class124) this).aClass110Array1557[4];
	if (!((Class124) this).aClass110Array1557[9].method1415())
	    ((Class124) this).aClass110Array1557[9]
		= ((Class124) this).aClass110Array1557[8];
    }
    
    boolean method1605(int i) {
	return ((Class124) this).aClass110Array1557[i].method1415();
    }
    
    boolean method1606(int i) {
	return ((Class124) this).aClass110Array1557[i].method1415();
    }
    
    void method1607(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
	bool_2_ &= ((Class124) this).aClass173_Sub2_1556.method8806();
	if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_1_ = i_0_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (((Class124) this).anInt1554 != i) {
	    if (((Class124) this).anInt1554 != 0)
		((Class124) this).aClass110Array1557
		    [((Class124) this).anInt1554 & 0x7fffffff].method1409();
	    if (i != 0) {
		((Class124) this).aClass110Array1557[i & 0x7fffffff]
		    .method1419(bool);
		((Class124) this).aClass110Array1557[i & 0x7fffffff]
		    .method1405(bool);
		((Class124) this).aClass110Array1557[i & 0x7fffffff]
		    .method1410(i_0_, i_1_);
	    }
	    ((Class124) this).anInt1554 = i;
	    ((Class124) this).anInt1553 = i_0_;
	    ((Class124) this).anInt1552 = i_1_;
	} else if (((Class124) this).anInt1554 != 0) {
	    ((Class124) this).aClass110Array1557
		[((Class124) this).anInt1554 & 0x7fffffff].method1405(bool);
	    if (((Class124) this).anInt1553 != i_0_
		|| ((Class124) this).anInt1552 != i_1_) {
		((Class124) this).aClass110Array1557
		    [((Class124) this).anInt1554 & 0x7fffffff]
		    .method1410(i_0_, i_1_);
		((Class124) this).anInt1553 = i_0_;
		((Class124) this).anInt1552 = i_1_;
	    }
	}
    }
}
