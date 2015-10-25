/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class37
{
    public int anInt336;
    int anInt337;
    
    public void method793(int i) {
	anInt336 = i * -87375317;
	((Class37) this).anInt337 = 0;
    }
    
    public boolean method794(int i, int i_0_, int i_1_, int i_2_) {
	int i_3_ = ((Class37) this).anInt337 * -443693123;
	if (-247599997 * anInt336 == i
	    && ((Class37) this).anInt337 * -443693123 == 0)
	    return false;
	boolean bool;
	if (((Class37) this).anInt337 * -443693123 == 0) {
	    if (i > -247599997 * anInt336 && i <= -247599997 * anInt336 + i_0_
		|| (i < anInt336 * -247599997
		    && i >= anInt336 * -247599997 - i_0_)) {
		anInt336 = i * -87375317;
		return false;
	    }
	    bool = true;
	} else if (-443693123 * ((Class37) this).anInt337 > 0
		   && i > -247599997 * anInt336) {
	    int i_4_
		= (-443693123 * ((Class37) this).anInt337
		   * (((Class37) this).anInt337 * -443693123) / (2 * i_0_));
	    int i_5_ = i_4_ + -247599997 * anInt336;
	    if (i_5_ >= i || i_5_ < -247599997 * anInt336)
		bool = false;
	    else
		bool = true;
	} else if (((Class37) this).anInt337 * -443693123 < 0
		   && i < -247599997 * anInt336) {
	    int i_6_
		= (((Class37) this).anInt337 * -443693123
		   * (((Class37) this).anInt337 * -443693123) / (2 * i_0_));
	    int i_7_ = -247599997 * anInt336 - i_6_;
	    if (i_7_ <= i || i_7_ > -247599997 * anInt336)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt336 * -247599997) {
		((Class37) this).anInt337 += 327560085 * i_0_;
		if (0 != i_1_ && ((Class37) this).anInt337 * -443693123 > i_1_)
		    ((Class37) this).anInt337 = 327560085 * i_1_;
	    } else {
		((Class37) this).anInt337 -= 327560085 * i_0_;
		if (i_1_ != 0
		    && ((Class37) this).anInt337 * -443693123 < -i_1_)
		    ((Class37) this).anInt337 = 327560085 * -i_1_;
	    }
	    if (((Class37) this).anInt337 * -443693123 != i_3_) {
		int i_8_ = (-443693123 * ((Class37) this).anInt337
			    * (((Class37) this).anInt337 * -443693123)
			    / (2 * i_0_));
		if (i > -247599997 * anInt336) {
		    if (i_8_ + -247599997 * anInt336 > i)
			((Class37) this).anInt337 = i_3_ * 327560085;
		} else if (i < anInt336 * -247599997
			   && -247599997 * anInt336 - i_8_ < i)
		    ((Class37) this).anInt337 = i_3_ * 327560085;
	    }
	} else if (-443693123 * ((Class37) this).anInt337 > 0) {
	    ((Class37) this).anInt337 -= i_0_ * 327560085;
	    if (-443693123 * ((Class37) this).anInt337 < 0)
		((Class37) this).anInt337 = 0;
	} else {
	    ((Class37) this).anInt337 += 327560085 * i_0_;
	    if (-443693123 * ((Class37) this).anInt337 > 0)
		((Class37) this).anInt337 = 0;
	}
	anInt336 += -87375317 * (i_3_ + -443693123 * ((Class37) this).anInt337
				 >> 1);
	return bool;
    }
    
    public int method795(int i) {
	return -247599997 * anInt336 & 0x3fff;
    }
    
    public void method796(int i) {
	anInt336 = -87375317 * (-247599997 * anInt336 & 0x3fff);
    }
    
    public boolean method797(int i, int i_9_, int i_10_) {
	int i_11_ = ((Class37) this).anInt337 * -443693123;
	if (-247599997 * anInt336 == i
	    && ((Class37) this).anInt337 * -443693123 == 0)
	    return false;
	boolean bool;
	if (((Class37) this).anInt337 * -443693123 == 0) {
	    if (i > -247599997 * anInt336 && i <= -247599997 * anInt336 + i_9_
		|| (i < anInt336 * -247599997
		    && i >= anInt336 * -247599997 - i_9_)) {
		anInt336 = i * -87375317;
		return false;
	    }
	    bool = true;
	} else if (-443693123 * ((Class37) this).anInt337 > 0
		   && i > -247599997 * anInt336) {
	    int i_12_
		= (-443693123 * ((Class37) this).anInt337
		   * (((Class37) this).anInt337 * -443693123) / (2 * i_9_));
	    int i_13_ = i_12_ + -247599997 * anInt336;
	    if (i_13_ >= i || i_13_ < -247599997 * anInt336)
		bool = false;
	    else
		bool = true;
	} else if (((Class37) this).anInt337 * -443693123 < 0
		   && i < -247599997 * anInt336) {
	    int i_14_
		= (((Class37) this).anInt337 * -443693123
		   * (((Class37) this).anInt337 * -443693123) / (2 * i_9_));
	    int i_15_ = -247599997 * anInt336 - i_14_;
	    if (i_15_ <= i || i_15_ > -247599997 * anInt336)
		bool = false;
	    else
		bool = true;
	} else
	    bool = false;
	if (bool) {
	    if (i > anInt336 * -247599997) {
		((Class37) this).anInt337 += 327560085 * i_9_;
		if (0 != i_10_
		    && ((Class37) this).anInt337 * -443693123 > i_10_)
		    ((Class37) this).anInt337 = 327560085 * i_10_;
	    } else {
		((Class37) this).anInt337 -= 327560085 * i_9_;
		if (i_10_ != 0
		    && ((Class37) this).anInt337 * -443693123 < -i_10_)
		    ((Class37) this).anInt337 = 327560085 * -i_10_;
	    }
	    if (((Class37) this).anInt337 * -443693123 != i_11_) {
		int i_16_ = (-443693123 * ((Class37) this).anInt337
			     * (((Class37) this).anInt337 * -443693123)
			     / (2 * i_9_));
		if (i > -247599997 * anInt336) {
		    if (i_16_ + -247599997 * anInt336 > i)
			((Class37) this).anInt337 = i_11_ * 327560085;
		} else if (i < anInt336 * -247599997
			   && -247599997 * anInt336 - i_16_ < i)
		    ((Class37) this).anInt337 = i_11_ * 327560085;
	    }
	} else if (-443693123 * ((Class37) this).anInt337 > 0) {
	    ((Class37) this).anInt337 -= i_9_ * 327560085;
	    if (-443693123 * ((Class37) this).anInt337 < 0)
		((Class37) this).anInt337 = 0;
	} else {
	    ((Class37) this).anInt337 += 327560085 * i_9_;
	    if (-443693123 * ((Class37) this).anInt337 > 0)
		((Class37) this).anInt337 = 0;
	}
	anInt336 += -87375317 * (i_11_ + -443693123 * ((Class37) this).anInt337
				 >> 1);
	return bool;
    }
    
    public void method798(int i, byte i_17_) {
	anInt336 = i * -87375317;
	((Class37) this).anInt337 = 0;
    }
    
    public int method799() {
	return -247599997 * anInt336 & 0x3fff;
    }
    
    public int method800() {
	return -247599997 * anInt336 & 0x3fff;
    }
    
    public int method801() {
	return -247599997 * anInt336 & 0x3fff;
    }
    
    static final void method802(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class160.method2059(class229, class226, true, 2, class648,
			    -1649643344);
    }
}
