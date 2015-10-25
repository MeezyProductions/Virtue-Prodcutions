/* Class554 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class554
{
    int anInt7437;
    int anInt7438;
    int anInt7439;
    int anInt7440;
    int anInt7441;
    int anInt7442;
    int anInt7443;
    int anInt7444;
    int anInt7445;
    int anInt7446;
    
    public boolean method6735(int i, int i_0_, int i_1_) {
	if (i < ((Class554) this).anInt7438 || i > ((Class554) this).anInt7442)
	    return false;
	if (i_0_ < ((Class554) this).anInt7443
	    || i_0_ > ((Class554) this).anInt7444)
	    return false;
	if (i_1_ < ((Class554) this).anInt7441
	    || i_1_ > ((Class554) this).anInt7446)
	    return false;
	int i_2_ = i - ((Class554) this).anInt7439;
	int i_3_ = i_1_ - ((Class554) this).anInt7440;
	return i_2_ * i_2_ + i_3_ * i_3_ < ((Class554) this).anInt7445;
    }
    
    Class554(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
	     int i_10_, int i_11_, int i_12_) {
	((Class554) this).anInt7439 = i;
	((Class554) this).anInt7437 = i_4_;
	((Class554) this).anInt7440 = i_5_;
	((Class554) this).anInt7445 = i_6_ * i_6_;
	((Class554) this).anInt7438 = ((Class554) this).anInt7439 + i_7_;
	((Class554) this).anInt7442 = ((Class554) this).anInt7439 + i_8_;
	((Class554) this).anInt7443 = ((Class554) this).anInt7437 + i_9_;
	((Class554) this).anInt7444 = ((Class554) this).anInt7437 + i_10_;
	((Class554) this).anInt7441 = ((Class554) this).anInt7440 + i_11_;
	((Class554) this).anInt7446 = ((Class554) this).anInt7440 + i_12_;
    }
    
    void method6736(int i, int i_13_, int i_14_, int i_15_, int i_16_,
		    int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
	((Class554) this).anInt7439 = i;
	((Class554) this).anInt7437 = i_13_;
	((Class554) this).anInt7440 = i_14_;
	((Class554) this).anInt7445 = i_15_ * i_15_;
	((Class554) this).anInt7438 = ((Class554) this).anInt7439 + i_16_;
	((Class554) this).anInt7442 = ((Class554) this).anInt7439 + i_17_;
	((Class554) this).anInt7443 = ((Class554) this).anInt7437 + i_18_;
	((Class554) this).anInt7444 = ((Class554) this).anInt7437 + i_19_;
	((Class554) this).anInt7441 = ((Class554) this).anInt7440 + i_20_;
	((Class554) this).anInt7446 = ((Class554) this).anInt7440 + i_21_;
    }
    
    public boolean method6737(int i, int i_22_, int i_23_) {
	if (i < ((Class554) this).anInt7438 || i > ((Class554) this).anInt7442)
	    return false;
	if (i_22_ < ((Class554) this).anInt7443
	    || i_22_ > ((Class554) this).anInt7444)
	    return false;
	if (i_23_ < ((Class554) this).anInt7441
	    || i_23_ > ((Class554) this).anInt7446)
	    return false;
	int i_24_ = i - ((Class554) this).anInt7439;
	int i_25_ = i_23_ - ((Class554) this).anInt7440;
	return i_24_ * i_24_ + i_25_ * i_25_ < ((Class554) this).anInt7445;
    }
}
