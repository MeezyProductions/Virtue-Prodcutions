/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class121
{
    boolean aBool1500 = false;
    boolean aBool1501 = true;
    boolean aBool1502 = false;
    float aFloat1503;
    boolean aBool1504;
    float aFloat1505;
    int[] anIntArray1506;
    float aFloat1507;
    float aFloat1508;
    Class173_Sub3 aClass173_Sub3_1509;
    float aFloat1510;
    float aFloat1511;
    float aFloat1512;
    int anInt1513;
    int anInt1514;
    float aFloat1515;
    Class107 aClass107_1516;
    int anInt1517;
    int[] anIntArray1518;
    float[] aFloatArray1519;
    int anInt1520;
    int anInt1521;
    int[] anIntArray1522;
    int anInt1523;
    Class583 aClass583_1524;
    int anInt1525;
    int anInt1526 = 0;
    int anInt1527;
    boolean aBool1528;
    int anInt1529;
    int[] anIntArray1530;
    int anInt1531;
    int anInt1532;
    int anInt1533;
    int anInt1534;
    int[] anIntArray1535;
    int anInt1536;
    boolean aBool1537;
    float aFloat1538;
    
    final void method1576(boolean bool, boolean bool_0_, boolean bool_1_,
			  float f, float f_2_, float f_3_, float f_4_,
			  float f_5_, float f_6_, float f_7_, float f_8_,
			  float f_9_, float f_10_, float f_11_, float f_12_) {
	if (!bool)
	    method1582(false, bool_0_, bool_1_, f, f_2_, f_3_, f_4_, f_5_,
		       f_6_, f_7_, f_8_, f_9_, 0);
	else if (((Class121) this).aBool1500) {
	    ((Class121) this).aClass173_Sub3_1509.method2214
		((int) f_4_, (int) f, (int) f_5_, (int) f_2_,
		 Class72.anIntArray777[(int) f_10_ & 0xffff], (byte) 87);
	    ((Class121) this).aClass173_Sub3_1509.method2214
		((int) f_5_, (int) f_2_, (int) f_6_, (int) f_3_,
		 Class72.anIntArray777[(int) f_10_ & 0xffff], (byte) 102);
	    ((Class121) this).aClass173_Sub3_1509.method2214
		((int) f_6_, (int) f_3_, (int) f_4_, (int) f,
		 Class72.anIntArray777[(int) f_10_ & 0xffff], (byte) 32);
	} else {
	    float f_13_ = f_5_ - f_4_;
	    float f_14_ = f_2_ - f;
	    float f_15_ = f_6_ - f_4_;
	    float f_16_ = f_3_ - f;
	    float f_17_ = f_11_ - f_10_;
	    float f_18_ = f_12_ - f_10_;
	    float f_19_ = f_8_ - f_7_;
	    float f_20_ = f_9_ - f_7_;
	    float f_21_;
	    if (f_3_ != f_2_)
		f_21_ = (f_6_ - f_5_) / (f_3_ - f_2_);
	    else
		f_21_ = 0.0F;
	    float f_22_;
	    if (f_2_ != f)
		f_22_ = f_13_ / f_14_;
	    else
		f_22_ = 0.0F;
	    float f_23_;
	    if (f_3_ != f)
		f_23_ = f_15_ / f_16_;
	    else
		f_23_ = 0.0F;
	    float f_24_ = f_13_ * f_16_ - f_15_ * f_14_;
	    if (f_24_ != 0.0F) {
		float f_25_ = (f_17_ * f_16_ - f_18_ * f_14_) / f_24_;
		float f_26_ = (f_18_ * f_13_ - f_17_ * f_15_) / f_24_;
		float f_27_ = (f_19_ * f_16_ - f_20_ * f_14_) / f_24_;
		float f_28_ = (f_20_ * f_13_ - f_19_ * f_15_) / f_24_;
		if (f <= f_2_ && f <= f_3_) {
		    if (!(f >= (float) ((Class121) this).anInt1520)) {
			if (f_2_ > (float) ((Class121) this).anInt1520)
			    f_2_ = (float) ((Class121) this).anInt1520;
			if (f_3_ > (float) ((Class121) this).anInt1520)
			    f_3_ = (float) ((Class121) this).anInt1520;
			f_10_ = f_10_ - f_25_ * f_4_ + f_25_;
			f_7_ = f_7_ - f_27_ * f_4_ + f_27_;
			if (f_2_ < f_3_) {
			    f_6_ = f_4_;
			    if (f < 0.0F) {
				f_6_ -= f_23_ * f;
				f_4_ -= f_22_ * f;
				f_10_ -= f_26_ * f;
				f_7_ -= f_28_ * f;
				f = 0.0F;
			    }
			    if (f_2_ < 0.0F) {
				f_5_ -= f_21_ * f_2_;
				f_2_ = 0.0F;
			    }
			    if (f != f_2_ && f_23_ < f_22_
				|| f == f_2_ && f_23_ > f_21_) {
				f += 0.5F;
				f_2_ += 0.5F;
				f_3_ = (float) (int) (f_3_ + 0.5F) - f_2_;
				f_2_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_2_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_6_,
					       (int) f_4_, f_10_, f_25_, f_7_,
					       f_27_);
				    f_6_ += f_23_;
				    f_4_ += f_22_;
				    f_10_ += f_26_;
				    f_7_ += f_28_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_3_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_6_,
					       (int) f_5_, f_10_, f_25_, f_7_,
					       f_27_);
				    f_6_ += f_23_;
				    f_5_ += f_21_;
				    f_10_ += f_26_;
				    f_7_ += f_28_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    } else {
				f += 0.5F;
				f_2_ += 0.5F;
				f_3_ = (float) (int) (f_3_ + 0.5F) - f_2_;
				f_2_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_2_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_4_,
					       (int) f_6_, f_10_, f_25_, f_7_,
					       f_27_);
				    f_6_ += f_23_;
				    f_4_ += f_22_;
				    f_10_ += f_26_;
				    f_7_ += f_28_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_3_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_5_,
					       (int) f_6_, f_10_, f_25_, f_7_,
					       f_27_);
				    f_6_ += f_23_;
				    f_5_ += f_21_;
				    f_10_ += f_26_;
				    f_7_ += f_28_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    }
			} else {
			    f_5_ = f_4_;
			    if (f < 0.0F) {
				f_5_ -= f_23_ * f;
				f_4_ -= f_22_ * f;
				f_10_ -= f_26_ * f;
				f_7_ -= f_28_ * f;
				f = 0.0F;
			    }
			    if (f_3_ < 0.0F) {
				f_6_ -= f_21_ * f_3_;
				f_3_ = 0.0F;
			    }
			    if (f != f_3_ && f_23_ < f_22_
				|| f == f_3_ && f_21_ > f_22_) {
				f += 0.5F;
				f_3_ += 0.5F;
				f_2_ = (float) (int) (f_2_ + 0.5F) - f_3_;
				f_3_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_3_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_5_,
					       (int) f_4_, f_10_, f_25_, f_7_,
					       f_27_);
				    f_5_ += f_23_;
				    f_4_ += f_22_;
				    f_10_ += f_26_;
				    f_7_ += f_28_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_2_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_6_,
					       (int) f_4_, f_10_, f_25_, f_7_,
					       f_27_);
				    f_6_ += f_21_;
				    f_4_ += f_22_;
				    f_10_ += f_26_;
				    f_7_ += f_28_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    } else {
				f += 0.5F;
				f_3_ += 0.5F;
				f_2_ = (float) (int) (f_2_ + 0.5F) - f_3_;
				f_3_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_3_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_4_,
					       (int) f_5_, f_10_, f_25_, f_7_,
					       f_27_);
				    f_5_ += f_23_;
				    f_4_ += f_22_;
				    f_10_ += f_26_;
				    f_7_ += f_28_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_2_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_4_,
					       (int) f_6_, f_10_, f_25_, f_7_,
					       f_27_);
				    f_6_ += f_21_;
				    f_4_ += f_22_;
				    f_10_ += f_26_;
				    f_7_ += f_28_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    }
			}
		    }
		} else if (f_2_ <= f_3_) {
		    if (!(f_2_ >= (float) ((Class121) this).anInt1520)) {
			if (f_3_ > (float) ((Class121) this).anInt1520)
			    f_3_ = (float) ((Class121) this).anInt1520;
			if (f > (float) ((Class121) this).anInt1520)
			    f = (float) ((Class121) this).anInt1520;
			f_11_ = f_11_ - f_25_ * f_5_ + f_25_;
			f_8_ = f_8_ - f_27_ * f_5_ + f_27_;
			if (f_3_ < f) {
			    f_4_ = f_5_;
			    if (f_2_ < 0.0F) {
				f_4_ -= f_22_ * f_2_;
				f_5_ -= f_21_ * f_2_;
				f_11_ -= f_26_ * f_2_;
				f_8_ -= f_28_ * f_2_;
				f_2_ = 0.0F;
			    }
			    if (f_3_ < 0.0F) {
				f_6_ -= f_23_ * f_3_;
				f_3_ = 0.0F;
			    }
			    if (f_2_ != f_3_ && f_22_ < f_21_
				|| f_2_ == f_3_ && f_22_ > f_23_) {
				f_2_ += 0.5F;
				f_3_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_3_;
				f_3_ -= f_2_;
				f_2_ = (float) (((Class121) this)
						.anIntArray1506[(int) f_2_]);
				while (--f_3_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_2_, 0, 0, (int) f_4_,
					       (int) f_5_, f_11_, f_25_, f_8_,
					       f_27_);
				    f_4_ += f_22_;
				    f_5_ += f_21_;
				    f_11_ += f_26_;
				    f_8_ += f_28_;
				    f_2_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_2_, 0, 0, (int) f_4_,
					       (int) f_6_, f_11_, f_25_, f_8_,
					       f_27_);
				    f_4_ += f_22_;
				    f_6_ += f_23_;
				    f_11_ += f_26_;
				    f_8_ += f_28_;
				    f_2_
					+= (float) ((Class121) this).anInt1517;
				}
			    } else {
				f_2_ += 0.5F;
				f_3_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_3_;
				f_3_ -= f_2_;
				f_2_ = (float) (((Class121) this)
						.anIntArray1506[(int) f_2_]);
				while (--f_3_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_2_, 0, 0, (int) f_5_,
					       (int) f_4_, f_11_, f_25_, f_8_,
					       f_27_);
				    f_4_ += f_22_;
				    f_5_ += f_21_;
				    f_11_ += f_26_;
				    f_8_ += f_28_;
				    f_2_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_2_, 0, 0, (int) f_6_,
					       (int) f_4_, f_11_, f_25_, f_8_,
					       f_27_);
				    f_4_ += f_22_;
				    f_6_ += f_23_;
				    f_11_ += f_26_;
				    f_8_ += f_28_;
				    f_2_
					+= (float) ((Class121) this).anInt1517;
				}
			    }
			} else {
			    f_6_ = f_5_;
			    if (f_2_ < 0.0F) {
				f_6_ -= f_22_ * f_2_;
				f_5_ -= f_21_ * f_2_;
				f_11_ -= f_26_ * f_2_;
				f_8_ -= f_28_ * f_2_;
				f_2_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_4_ -= f_23_ * f;
				f = 0.0F;
			    }
			    if (f_22_ < f_21_) {
				f_2_ += 0.5F;
				f += 0.5F;
				f_3_ = (float) (int) (f_3_ + 0.5F) - f;
				f -= f_2_;
				f_2_ = (float) (((Class121) this)
						.anIntArray1506[(int) f_2_]);
				while (--f >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_2_, 0, 0, (int) f_6_,
					       (int) f_5_, f_11_, f_25_, f_8_,
					       f_27_);
				    f_6_ += f_22_;
				    f_5_ += f_21_;
				    f_11_ += f_26_;
				    f_8_ += f_28_;
				    f_2_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f_3_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_2_, 0, 0, (int) f_4_,
					       (int) f_5_, f_11_, f_25_, f_8_,
					       f_27_);
				    f_4_ += f_23_;
				    f_5_ += f_21_;
				    f_11_ += f_26_;
				    f_8_ += f_28_;
				    f_2_
					+= (float) ((Class121) this).anInt1517;
				}
			    } else {
				f_2_ += 0.5F;
				f += 0.5F;
				f_3_ = (float) (int) (f_3_ + 0.5F) - f;
				f -= f_2_;
				f_2_ = (float) (((Class121) this)
						.anIntArray1506[(int) f_2_]);
				while (--f >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_2_, 0, 0, (int) f_5_,
					       (int) f_6_, f_11_, f_25_, f_8_,
					       f_27_);
				    f_6_ += f_22_;
				    f_5_ += f_21_;
				    f_11_ += f_26_;
				    f_8_ += f_28_;
				    f_2_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f_3_ >= 0.0F) {
				    method1592(bool_0_, bool_1_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_2_, 0, 0, (int) f_5_,
					       (int) f_4_, f_11_, f_25_, f_8_,
					       f_27_);
				    f_4_ += f_23_;
				    f_5_ += f_21_;
				    f_11_ += f_26_;
				    f_8_ += f_28_;
				    f_2_
					+= (float) ((Class121) this).anInt1517;
				}
			    }
			}
		    }
		} else if (!(f_3_ >= (float) ((Class121) this).anInt1520)) {
		    if (f > (float) ((Class121) this).anInt1520)
			f = (float) ((Class121) this).anInt1520;
		    if (f_2_ > (float) ((Class121) this).anInt1520)
			f_2_ = (float) ((Class121) this).anInt1520;
		    f_12_ = f_12_ - f_25_ * f_6_ + f_25_;
		    f_9_ = f_9_ - f_27_ * f_6_ + f_27_;
		    if (f < f_2_) {
			f_5_ = f_6_;
			if (f_3_ < 0.0F) {
			    f_5_ -= f_21_ * f_3_;
			    f_6_ -= f_23_ * f_3_;
			    f_12_ -= f_26_ * f_3_;
			    f_9_ -= f_28_ * f_3_;
			    f_3_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_4_ -= f_22_ * f;
			    f = 0.0F;
			}
			if (f_21_ < f_23_) {
			    f_3_ += 0.5F;
			    f += 0.5F;
			    f_2_ = (float) (int) (f_2_ + 0.5F) - f;
			    f -= f_3_;
			    f_3_ = (float) (((Class121) this).anIntArray1506
					    [(int) f_3_]);
			    while (--f >= 0.0F) {
				method1592(bool_0_, bool_1_,
					   ((Class121) this).anIntArray1518,
					   (int) f_3_, 0, 0, (int) f_5_,
					   (int) f_6_, f_12_, f_25_, f_9_,
					   f_27_);
				f_5_ += f_21_;
				f_6_ += f_23_;
				f_12_ += f_26_;
				f_9_ += f_28_;
				f_3_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f_2_ >= 0.0F) {
				method1592(bool_0_, bool_1_,
					   ((Class121) this).anIntArray1518,
					   (int) f_3_, 0, 0, (int) f_5_,
					   (int) f_4_, f_12_, f_25_, f_9_,
					   f_27_);
				f_5_ += f_21_;
				f_4_ += f_22_;
				f_12_ += f_26_;
				f_9_ += f_28_;
				f_3_ += (float) ((Class121) this).anInt1517;
			    }
			} else {
			    f_3_ += 0.5F;
			    f += 0.5F;
			    f_2_ = (float) (int) (f_2_ + 0.5F) - f;
			    f -= f_3_;
			    f_3_ = (float) (((Class121) this).anIntArray1506
					    [(int) f_3_]);
			    while (--f >= 0.0F) {
				method1592(bool_0_, bool_1_,
					   ((Class121) this).anIntArray1518,
					   (int) f_3_, 0, 0, (int) f_6_,
					   (int) f_5_, f_12_, f_25_, f_9_,
					   f_27_);
				f_5_ += f_21_;
				f_6_ += f_23_;
				f_12_ += f_26_;
				f_9_ += f_28_;
				f_3_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f_2_ >= 0.0F) {
				method1592(bool_0_, bool_1_,
					   ((Class121) this).anIntArray1518,
					   (int) f_3_, 0, 0, (int) f_4_,
					   (int) f_5_, f_12_, f_25_, f_9_,
					   f_27_);
				f_5_ += f_21_;
				f_4_ += f_22_;
				f_12_ += f_26_;
				f_9_ += f_28_;
				f_3_ += (float) ((Class121) this).anInt1517;
			    }
			}
		    } else {
			f_4_ = f_6_;
			if (f_3_ < 0.0F) {
			    f_4_ -= f_21_ * f_3_;
			    f_6_ -= f_23_ * f_3_;
			    f_12_ -= f_26_ * f_3_;
			    f_9_ -= f_28_ * f_3_;
			    f_3_ = 0.0F;
			}
			if (f_2_ < 0.0F) {
			    f_5_ -= f_22_ * f_2_;
			    f_2_ = 0.0F;
			}
			if (f_21_ < f_23_) {
			    f_3_ += 0.5F;
			    f_2_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_2_;
			    f_2_ -= f_3_;
			    f_3_ = (float) (((Class121) this).anIntArray1506
					    [(int) f_3_]);
			    while (--f_2_ >= 0.0F) {
				method1592(bool_0_, bool_1_,
					   ((Class121) this).anIntArray1518,
					   (int) f_3_, 0, 0, (int) f_4_,
					   (int) f_6_, f_12_, f_25_, f_9_,
					   f_27_);
				f_4_ += f_21_;
				f_6_ += f_23_;
				f_12_ += f_26_;
				f_9_ += f_28_;
				f_3_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f >= 0.0F) {
				method1592(bool_0_, bool_1_,
					   ((Class121) this).anIntArray1518,
					   (int) f_3_, 0, 0, (int) f_5_,
					   (int) f_6_, f_12_, f_25_, f_9_,
					   f_27_);
				f_5_ += f_22_;
				f_6_ += f_23_;
				f_12_ += f_26_;
				f_9_ += f_28_;
				f_3_ += (float) ((Class121) this).anInt1517;
			    }
			} else {
			    f_3_ += 0.5F;
			    f_2_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_2_;
			    f_2_ -= f_3_;
			    f_3_ = (float) (((Class121) this).anIntArray1506
					    [(int) f_3_]);
			    while (--f_2_ >= 0.0F) {
				method1592(bool_0_, bool_1_,
					   ((Class121) this).anIntArray1518,
					   (int) f_3_, 0, 0, (int) f_6_,
					   (int) f_4_, f_12_, f_25_, f_9_,
					   f_27_);
				f_4_ += f_21_;
				f_6_ += f_23_;
				f_12_ += f_26_;
				f_9_ += f_28_;
				f_3_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f >= 0.0F) {
				method1592(bool_0_, bool_1_,
					   ((Class121) this).anIntArray1518,
					   (int) f_3_, 0, 0, (int) f_6_,
					   (int) f_5_, f_12_, f_25_, f_9_,
					   f_27_);
				f_5_ += f_22_;
				f_6_ += f_23_;
				f_12_ += f_26_;
				f_9_ += f_28_;
				f_3_ += (float) ((Class121) this).anInt1517;
			    }
			}
		    }
		}
	    }
	}
    }
    
    int method1577() {
	return (((Class121) this).anIntArray1506[0]
		/ ((Class121) this).anInt1517);
    }
    
    final void method1578(boolean bool) {
	((Class121) this).aBool1500 = bool;
    }
    
    final void method1579(boolean bool, boolean bool_29_, boolean bool_30_,
			  int[] is, int i, int i_31_, int i_32_, int i_33_,
			  int i_34_, float f, float f_35_) {
	if (((Class121) this).aBool1504) {
	    if (i_34_ > ((Class121) this).anInt1513)
		i_34_ = ((Class121) this).anInt1513;
	    if (i_33_ < 0)
		i_33_ = 0;
	}
	if (i_33_ < i_34_) {
	    i += i_33_ - 1;
	    i_32_ = i_34_ - i_33_ >> 2;
	    f += f_35_ * (float) i_33_;
	    if (((Class107) ((Class121) this).aClass107_1516).aBool1344) {
		if (((Class121) this).anInt1526 == 0) {
		    while (--i_32_ >= 0) {
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    if (bool)
				is[i] = i_31_;
			    if (bool_29_)
				((Class121) this).aFloatArray1519[i] = f;
			}
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    if (bool)
				is[i] = i_31_;
			    if (bool_29_)
				((Class121) this).aFloatArray1519[i] = f;
			}
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    if (bool)
				is[i] = i_31_;
			    if (bool_29_)
				((Class121) this).aFloatArray1519[i] = f;
			}
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    if (bool)
				is[i] = i_31_;
			    if (bool_29_)
				((Class121) this).aFloatArray1519[i] = f;
			}
			f += f_35_;
		    }
		    i_32_ = i_34_ - i_33_ & 0x3;
		    while (--i_32_ >= 0) {
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    if (bool)
				is[i] = i_31_;
			    if (bool_29_)
				((Class121) this).aFloatArray1519[i] = f;
			}
			f += f_35_;
		    }
		} else if (((Class121) this).anInt1526 == 254) {
		    if (i_33_ != 0
			&& i_34_ <= ((Class121) this).anInt1513 - 1) {
			while (--i_32_ >= 0) {
			    i++;
			    if ((!bool_29_
				 || f < ((Class121) this).aFloatArray1519[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_35_;
			    i++;
			    if ((!bool_29_
				 || f < ((Class121) this).aFloatArray1519[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_35_;
			    i++;
			    if ((!bool_29_
				 || f < ((Class121) this).aFloatArray1519[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_35_;
			    i++;
			    if ((!bool_29_
				 || f < ((Class121) this).aFloatArray1519[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_35_;
			}
			i_32_ = i_34_ - i_33_ & 0x3;
			while (--i_32_ >= 0) {
			    i++;
			    if ((!bool_29_
				 || f < ((Class121) this).aFloatArray1519[i])
				&& bool)
				is[i - 1] = is[i];
			    f += f_35_;
			}
		    }
		} else {
		    int i_36_ = ((Class121) this).anInt1526;
		    int i_37_ = 256 - ((Class121) this).anInt1526;
		    i_31_ = (((i_31_ & 0xff00ff) * i_37_ >> 8 & 0xff00ff)
			     + ((i_31_ & 0xff00) * i_37_ >> 8 & 0xff00));
		    while (--i_32_ >= 0) {
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    if (bool) {
				int i_38_ = is[i];
				if (bool_30_)
				    is[i]
					= ((i_37_ | i_38_ >> 24) << 24
					   | (i_31_
					      + (((i_38_ & 0xff00ff) * i_36_
						  >> 8)
						 & 0xff00ff)
					      + ((i_38_ & 0xff00) * i_36_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_31_
					     + ((i_38_ & 0xff00ff) * i_36_ >> 8
						& 0xff00ff)
					     + ((i_38_ & 0xff00) * i_36_ >> 8
						& 0xff00));
			    }
			    if (bool_29_)
				((Class121) this).aFloatArray1519[i] = f;
			}
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    if (bool) {
				int i_39_ = is[i];
				if (bool_30_)
				    is[i]
					= ((i_37_ | i_39_ >> 24) << 24
					   | (i_31_
					      + (((i_39_ & 0xff00ff) * i_36_
						  >> 8)
						 & 0xff00ff)
					      + ((i_39_ & 0xff00) * i_36_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_31_
					     + ((i_39_ & 0xff00ff) * i_36_ >> 8
						& 0xff00ff)
					     + ((i_39_ & 0xff00) * i_36_ >> 8
						& 0xff00));
			    }
			    if (bool_29_)
				((Class121) this).aFloatArray1519[i] = f;
			}
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    if (bool) {
				int i_40_ = is[i];
				if (bool_30_)
				    is[i]
					= ((i_37_ | i_40_ >> 24) << 24
					   | (i_31_
					      + (((i_40_ & 0xff00ff) * i_36_
						  >> 8)
						 & 0xff00ff)
					      + ((i_40_ & 0xff00) * i_36_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_31_
					     + ((i_40_ & 0xff00ff) * i_36_ >> 8
						& 0xff00ff)
					     + ((i_40_ & 0xff00) * i_36_ >> 8
						& 0xff00));
			    }
			    if (bool_29_)
				((Class121) this).aFloatArray1519[i] = f;
			}
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    if (bool) {
				int i_41_ = is[i];
				if (bool_30_)
				    is[i]
					= ((i_37_ | i_41_ >> 24) << 24
					   | (i_31_
					      + (((i_41_ & 0xff00ff) * i_36_
						  >> 8)
						 & 0xff00ff)
					      + ((i_41_ & 0xff00) * i_36_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_31_
					     + ((i_41_ & 0xff00ff) * i_36_ >> 8
						& 0xff00ff)
					     + ((i_41_ & 0xff00) * i_36_ >> 8
						& 0xff00));
			    }
			    if (bool_29_)
				((Class121) this).aFloatArray1519[i] = f;
			}
			f += f_35_;
		    }
		    i_32_ = i_34_ - i_33_ & 0x3;
		    while (--i_32_ >= 0) {
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    if (bool) {
				int i_42_ = is[i];
				if (bool_30_)
				    is[i]
					= ((i_37_ | i_42_ >> 24) << 24
					   | (i_31_
					      + (((i_42_ & 0xff00ff) * i_36_
						  >> 8)
						 & 0xff00ff)
					      + ((i_42_ & 0xff00) * i_36_ >> 8
						 & 0xff00)));
				else
				    is[i] = (i_31_
					     + ((i_42_ & 0xff00ff) * i_36_ >> 8
						& 0xff00ff)
					     + ((i_42_ & 0xff00) * i_36_ >> 8
						& 0xff00));
			    }
			    if (bool_29_)
				((Class121) this).aFloatArray1519[i] = f;
			}
			f += f_35_;
		    }
		}
	    } else if (bool) {
		if (((Class121) this).anInt1526 == 0) {
		    while (--i_32_ >= 0) {
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i])
			    is[i] = i_31_;
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i])
			    is[i] = i_31_;
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i])
			    is[i] = i_31_;
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i])
			    is[i] = i_31_;
			f += f_35_;
		    }
		    i_32_ = i_34_ - i_33_ & 0x3;
		    while (--i_32_ >= 0) {
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i])
			    is[i] = i_31_;
			f += f_35_;
		    }
		} else if (((Class121) this).anInt1526 == 254) {
		    if (i_33_ != 0
			&& i_34_ <= ((Class121) this).anInt1513 - 1) {
			while (--i_32_ >= 0) {
			    i++;
			    if (!bool_29_
				|| f < ((Class121) this).aFloatArray1519[i])
				is[i - 1] = is[i];
			    f += f_35_;
			    i++;
			    if (!bool_29_
				|| f < ((Class121) this).aFloatArray1519[i])
				is[i - 1] = is[i];
			    f += f_35_;
			    i++;
			    if (!bool_29_
				|| f < ((Class121) this).aFloatArray1519[i])
				is[i - 1] = is[i];
			    f += f_35_;
			    i++;
			    if (!bool_29_
				|| f < ((Class121) this).aFloatArray1519[i])
				is[i - 1] = is[i];
			    f += f_35_;
			}
			i_32_ = i_34_ - i_33_ & 0x3;
			while (--i_32_ >= 0) {
			    i++;
			    if (!bool_29_
				|| f < ((Class121) this).aFloatArray1519[i])
				is[i - 1] = is[i];
			    f += f_35_;
			}
		    }
		} else {
		    int i_43_ = ((Class121) this).anInt1526;
		    int i_44_ = 256 - ((Class121) this).anInt1526;
		    i_31_ = (((i_31_ & 0xff00ff) * i_44_ >> 8 & 0xff00ff)
			     + ((i_31_ & 0xff00) * i_44_ >> 8 & 0xff00));
		    while (--i_32_ >= 0) {
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    int i_45_ = is[i];
			    if (bool_30_)
				is[i] = ((i_44_ | i_45_ >> 24) << 24
					 | (i_31_
					    + ((i_45_ & 0xff00ff) * i_43_ >> 8
					       & 0xff00ff)
					    + ((i_45_ & 0xff00) * i_43_ >> 8
					       & 0xff00)));
			    else
				is[i] = (i_31_
					 + ((i_45_ & 0xff00ff) * i_43_ >> 8
					    & 0xff00ff)
					 + ((i_45_ & 0xff00) * i_43_ >> 8
					    & 0xff00));
			}
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    int i_46_ = is[i];
			    if (bool_30_)
				is[i] = ((i_44_ | i_46_ >> 24) << 24
					 | (i_31_
					    + ((i_46_ & 0xff00ff) * i_43_ >> 8
					       & 0xff00ff)
					    + ((i_46_ & 0xff00) * i_43_ >> 8
					       & 0xff00)));
			    else
				is[i] = (i_31_
					 + ((i_46_ & 0xff00ff) * i_43_ >> 8
					    & 0xff00ff)
					 + ((i_46_ & 0xff00) * i_43_ >> 8
					    & 0xff00));
			}
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    int i_47_ = is[i];
			    if (bool_30_)
				is[i] = ((i_44_ | i_47_ >> 24) << 24
					 | (i_31_
					    + ((i_47_ & 0xff00ff) * i_43_ >> 8
					       & 0xff00ff)
					    + ((i_47_ & 0xff00) * i_43_ >> 8
					       & 0xff00)));
			    else
				is[i] = (i_31_
					 + ((i_47_ & 0xff00ff) * i_43_ >> 8
					    & 0xff00ff)
					 + ((i_47_ & 0xff00) * i_43_ >> 8
					    & 0xff00));
			}
			f += f_35_;
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    int i_48_ = is[i];
			    if (bool_30_)
				is[i] = ((i_44_ | i_48_ >> 24) << 24
					 | (i_31_
					    + ((i_48_ & 0xff00ff) * i_43_ >> 8
					       & 0xff00ff)
					    + ((i_48_ & 0xff00) * i_43_ >> 8
					       & 0xff00)));
			    else
				is[i] = (i_31_
					 + ((i_48_ & 0xff00ff) * i_43_ >> 8
					    & 0xff00ff)
					 + ((i_48_ & 0xff00) * i_43_ >> 8
					    & 0xff00));
			}
			f += f_35_;
		    }
		    i_32_ = i_34_ - i_33_ & 0x3;
		    while (--i_32_ >= 0) {
			i++;
			if (!bool_29_
			    || f < ((Class121) this).aFloatArray1519[i]) {
			    int i_49_ = is[i];
			    if (bool_30_)
				is[i] = ((i_44_ | i_49_ >> 24) << 24
					 | (i_31_
					    + ((i_49_ & 0xff00ff) * i_43_ >> 8
					       & 0xff00ff)
					    + ((i_49_ & 0xff00) * i_43_ >> 8
					       & 0xff00)));
			    else
				is[i] = (i_31_
					 + ((i_49_ & 0xff00ff) * i_43_ >> 8
					    & 0xff00ff)
					 + ((i_49_ & 0xff00) * i_43_ >> 8
					    & 0xff00));
			}
			f += f_35_;
		    }
		}
	    }
	}
    }
    
    final void method1580(boolean bool, boolean bool_50_, boolean bool_51_,
			  float f, float f_52_, float f_53_, float f_54_,
			  float f_55_, float f_56_, float f_57_, float f_58_,
			  float f_59_, int i, int i_60_, int i_61_) {
	if (!bool)
	    method1582(false, bool_50_, bool_51_, f, f_52_, f_53_, f_54_,
		       f_55_, f_56_, f_57_, f_58_, f_59_, 0);
	else if (((Class121) this).aBool1500) {
	    ((Class121) this).aClass173_Sub3_1509.method2214((int) f_54_,
							     (int) f,
							     (int) f_55_,
							     (int) f_52_,
							     ~0xffffff | i,
							     (byte) 82);
	    ((Class121) this).aClass173_Sub3_1509.method2214((int) f_55_,
							     (int) f_52_,
							     (int) f_56_,
							     (int) f_53_,
							     ~0xffffff | i,
							     (byte) 40);
	    ((Class121) this).aClass173_Sub3_1509.method2214((int) f_56_,
							     (int) f_53_,
							     (int) f_54_,
							     (int) f,
							     ~0xffffff | i,
							     (byte) 22);
	} else {
	    float f_62_ = f_55_ - f_54_;
	    float f_63_ = f_52_ - f;
	    float f_64_ = f_56_ - f_54_;
	    float f_65_ = f_53_ - f;
	    float f_66_ = f_58_ - f_57_;
	    float f_67_ = f_59_ - f_57_;
	    float f_68_ = (float) ((i_60_ & 0xff0000) - (i & 0xff0000));
	    float f_69_ = (float) ((i_61_ & 0xff0000) - (i & 0xff0000));
	    float f_70_ = (float) ((i_60_ & 0xff00) - (i & 0xff00));
	    float f_71_ = (float) ((i_61_ & 0xff00) - (i & 0xff00));
	    float f_72_ = (float) ((i_60_ & 0xff) - (i & 0xff));
	    float f_73_ = (float) ((i_61_ & 0xff) - (i & 0xff));
	    float f_74_;
	    if (f_53_ != f_52_)
		f_74_ = (f_56_ - f_55_) / (f_53_ - f_52_);
	    else
		f_74_ = 0.0F;
	    float f_75_;
	    if (f_52_ != f)
		f_75_ = f_62_ / f_63_;
	    else
		f_75_ = 0.0F;
	    float f_76_;
	    if (f_53_ != f)
		f_76_ = f_64_ / f_65_;
	    else
		f_76_ = 0.0F;
	    float f_77_ = f_62_ * f_65_ - f_64_ * f_63_;
	    if (f_77_ != 0.0F) {
		float f_78_ = (f_66_ * f_65_ - f_67_ * f_63_) / f_77_;
		float f_79_ = (f_67_ * f_62_ - f_66_ * f_64_) / f_77_;
		float f_80_ = (f_68_ * f_65_ - f_69_ * f_63_) / f_77_;
		float f_81_ = (f_69_ * f_62_ - f_68_ * f_64_) / f_77_;
		float f_82_ = (f_70_ * f_65_ - f_71_ * f_63_) / f_77_;
		float f_83_ = (f_71_ * f_62_ - f_70_ * f_64_) / f_77_;
		float f_84_ = (f_72_ * f_65_ - f_73_ * f_63_) / f_77_;
		float f_85_ = (f_73_ * f_62_ - f_72_ * f_64_) / f_77_;
		if (f <= f_52_ && f <= f_53_) {
		    if (!(f >= (float) ((Class121) this).anInt1520)) {
			if (f_52_ > (float) ((Class121) this).anInt1520)
			    f_52_ = (float) ((Class121) this).anInt1520;
			if (f_53_ > (float) ((Class121) this).anInt1520)
			    f_53_ = (float) ((Class121) this).anInt1520;
			f_57_ = f_57_ - f_78_ * f_54_ + f_78_;
			float f_86_
			    = (float) (i & 0xff0000) - f_80_ * f_54_ + f_80_;
			float f_87_
			    = (float) (i & 0xff00) - f_82_ * f_54_ + f_82_;
			float f_88_
			    = (float) (i & 0xff) - f_84_ * f_54_ + f_84_;
			if (f_52_ < f_53_) {
			    f_56_ = f_54_;
			    if (f < 0.0F) {
				f_56_ -= f_76_ * f;
				f_54_ -= f_75_ * f;
				f_57_ -= f_79_ * f;
				f_86_ -= f_81_ * f;
				f_87_ -= f_83_ * f;
				f_88_ -= f_85_ * f;
				f = 0.0F;
			    }
			    if (f_52_ < 0.0F) {
				f_55_ -= f_74_ * f_52_;
				f_52_ = 0.0F;
			    }
			    if (f != f_52_ && f_76_ < f_75_
				|| f == f_52_ && f_76_ > f_74_) {
				f += 0.5F;
				f_52_ += 0.5F;
				f_53_ = (float) (int) (f_53_ + 0.5F) - f_52_;
				f_52_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_52_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_56_,
					       (int) f_54_, f_57_, f_78_,
					       f_86_, f_80_, f_87_, f_82_,
					       f_88_, f_84_);
				    f_56_ += f_76_;
				    f_54_ += f_75_;
				    f_57_ += f_79_;
				    f_86_ += f_81_;
				    f_87_ += f_83_;
				    f_88_ += f_85_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_53_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_56_,
					       (int) f_55_, f_57_, f_78_,
					       f_86_, f_80_, f_87_, f_82_,
					       f_88_, f_84_);
				    f_56_ += f_76_;
				    f_55_ += f_74_;
				    f_57_ += f_79_;
				    f_86_ += f_81_;
				    f_87_ += f_83_;
				    f_88_ += f_85_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    } else {
				f += 0.5F;
				f_52_ += 0.5F;
				f_53_ = (float) (int) (f_53_ + 0.5F) - f_52_;
				f_52_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_52_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_54_,
					       (int) f_56_, f_57_, f_78_,
					       f_86_, f_80_, f_87_, f_82_,
					       f_88_, f_84_);
				    f_56_ += f_76_;
				    f_54_ += f_75_;
				    f_57_ += f_79_;
				    f_86_ += f_81_;
				    f_87_ += f_83_;
				    f_88_ += f_85_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_53_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_55_,
					       (int) f_56_, f_57_, f_78_,
					       f_86_, f_80_, f_87_, f_82_,
					       f_88_, f_84_);
				    f_56_ += f_76_;
				    f_55_ += f_74_;
				    f_57_ += f_79_;
				    f_86_ += f_81_;
				    f_87_ += f_83_;
				    f_88_ += f_85_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    }
			} else {
			    f_55_ = f_54_;
			    if (f < 0.0F) {
				f_55_ -= f_76_ * f;
				f_54_ -= f_75_ * f;
				f_57_ -= f_79_ * f;
				f_86_ -= f_81_ * f;
				f_87_ -= f_83_ * f;
				f_88_ -= f_85_ * f;
				f = 0.0F;
			    }
			    if (f_53_ < 0.0F) {
				f_56_ -= f_74_ * f_53_;
				f_53_ = 0.0F;
			    }
			    if (f != f_53_ && f_76_ < f_75_
				|| f == f_53_ && f_74_ > f_75_) {
				f += 0.5F;
				f_53_ += 0.5F;
				f_52_ = (float) (int) (f_52_ + 0.5F) - f_53_;
				f_53_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_53_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_55_,
					       (int) f_54_, f_57_, f_78_,
					       f_86_, f_80_, f_87_, f_82_,
					       f_88_, f_84_);
				    f_55_ += f_76_;
				    f_54_ += f_75_;
				    f_57_ += f_79_;
				    f_86_ += f_81_;
				    f_87_ += f_83_;
				    f_88_ += f_85_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_52_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_56_,
					       (int) f_54_, f_57_, f_78_,
					       f_86_, f_80_, f_87_, f_82_,
					       f_88_, f_84_);
				    f_56_ += f_74_;
				    f_54_ += f_75_;
				    f_57_ += f_79_;
				    f_86_ += f_81_;
				    f_87_ += f_83_;
				    f_88_ += f_85_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    } else {
				f += 0.5F;
				f_53_ += 0.5F;
				f_52_ = (float) (int) (f_52_ + 0.5F) - f_53_;
				f_53_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_53_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_54_,
					       (int) f_55_, f_57_, f_78_,
					       f_86_, f_80_, f_87_, f_82_,
					       f_88_, f_84_);
				    f_55_ += f_76_;
				    f_54_ += f_75_;
				    f_57_ += f_79_;
				    f_86_ += f_81_;
				    f_87_ += f_83_;
				    f_88_ += f_85_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_52_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, 0, 0, (int) f_54_,
					       (int) f_56_, f_57_, f_78_,
					       f_86_, f_80_, f_87_, f_82_,
					       f_88_, f_84_);
				    f_56_ += f_74_;
				    f_54_ += f_75_;
				    f_57_ += f_79_;
				    f_86_ += f_81_;
				    f_87_ += f_83_;
				    f_88_ += f_85_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    }
			}
		    }
		} else if (f_52_ <= f_53_) {
		    if (!(f_52_ >= (float) ((Class121) this).anInt1520)) {
			if (f_53_ > (float) ((Class121) this).anInt1520)
			    f_53_ = (float) ((Class121) this).anInt1520;
			if (f > (float) ((Class121) this).anInt1520)
			    f = (float) ((Class121) this).anInt1520;
			f_58_ = f_58_ - f_78_ * f_55_ + f_78_;
			float f_89_ = ((float) (i_60_ & 0xff0000)
				       - f_80_ * f_55_ + f_80_);
			float f_90_
			    = (float) (i_60_ & 0xff00) - f_82_ * f_55_ + f_82_;
			float f_91_
			    = (float) (i_60_ & 0xff) - f_84_ * f_55_ + f_84_;
			if (f_53_ < f) {
			    f_54_ = f_55_;
			    if (f_52_ < 0.0F) {
				f_54_ -= f_75_ * f_52_;
				f_55_ -= f_74_ * f_52_;
				f_58_ -= f_79_ * f_52_;
				f_89_ -= f_81_ * f_52_;
				f_90_ -= f_83_ * f_52_;
				f_91_ -= f_85_ * f_52_;
				f_52_ = 0.0F;
			    }
			    if (f_53_ < 0.0F) {
				f_56_ -= f_76_ * f_53_;
				f_53_ = 0.0F;
			    }
			    if (f_52_ != f_53_ && f_75_ < f_74_
				|| f_52_ == f_53_ && f_75_ > f_76_) {
				f_52_ += 0.5F;
				f_53_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_53_;
				f_53_ -= f_52_;
				f_52_ = (float) (((Class121) this)
						 .anIntArray1506[(int) f_52_]);
				while (--f_53_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_52_, 0, 0, (int) f_54_,
					       (int) f_55_, f_58_, f_78_,
					       f_89_, f_80_, f_90_, f_82_,
					       f_91_, f_84_);
				    f_54_ += f_75_;
				    f_55_ += f_74_;
				    f_58_ += f_79_;
				    f_89_ += f_81_;
				    f_90_ += f_83_;
				    f_91_ += f_85_;
				    f_52_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_52_, 0, 0, (int) f_54_,
					       (int) f_56_, f_58_, f_78_,
					       f_89_, f_80_, f_90_, f_82_,
					       f_91_, f_84_);
				    f_54_ += f_75_;
				    f_56_ += f_76_;
				    f_58_ += f_79_;
				    f_89_ += f_81_;
				    f_90_ += f_83_;
				    f_91_ += f_85_;
				    f_52_
					+= (float) ((Class121) this).anInt1517;
				}
			    } else {
				f_52_ += 0.5F;
				f_53_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_53_;
				f_53_ -= f_52_;
				f_52_ = (float) (((Class121) this)
						 .anIntArray1506[(int) f_52_]);
				while (--f_53_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_52_, 0, 0, (int) f_55_,
					       (int) f_54_, f_58_, f_78_,
					       f_89_, f_80_, f_90_, f_82_,
					       f_91_, f_84_);
				    f_54_ += f_75_;
				    f_55_ += f_74_;
				    f_58_ += f_79_;
				    f_89_ += f_81_;
				    f_90_ += f_83_;
				    f_91_ += f_85_;
				    f_52_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_52_, 0, 0, (int) f_56_,
					       (int) f_54_, f_58_, f_78_,
					       f_89_, f_80_, f_90_, f_82_,
					       f_91_, f_84_);
				    f_54_ += f_75_;
				    f_56_ += f_76_;
				    f_58_ += f_79_;
				    f_89_ += f_81_;
				    f_90_ += f_83_;
				    f_91_ += f_85_;
				    f_52_
					+= (float) ((Class121) this).anInt1517;
				}
			    }
			} else {
			    f_56_ = f_55_;
			    if (f_52_ < 0.0F) {
				f_56_ -= f_75_ * f_52_;
				f_55_ -= f_74_ * f_52_;
				f_58_ -= f_79_ * f_52_;
				f_89_ -= f_81_ * f_52_;
				f_90_ -= f_83_ * f_52_;
				f_91_ -= f_85_ * f_52_;
				f_52_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_54_ -= f_76_ * f;
				f = 0.0F;
			    }
			    if (f_75_ < f_74_) {
				f_52_ += 0.5F;
				f += 0.5F;
				f_53_ = (float) (int) (f_53_ + 0.5F) - f;
				f -= f_52_;
				f_52_ = (float) (((Class121) this)
						 .anIntArray1506[(int) f_52_]);
				while (--f >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_52_, 0, 0, (int) f_56_,
					       (int) f_55_, f_58_, f_78_,
					       f_89_, f_80_, f_90_, f_82_,
					       f_91_, f_84_);
				    f_56_ += f_75_;
				    f_55_ += f_74_;
				    f_58_ += f_79_;
				    f_89_ += f_81_;
				    f_90_ += f_83_;
				    f_91_ += f_85_;
				    f_52_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f_53_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_52_, 0, 0, (int) f_54_,
					       (int) f_55_, f_58_, f_78_,
					       f_89_, f_80_, f_90_, f_82_,
					       f_91_, f_84_);
				    f_54_ += f_76_;
				    f_55_ += f_74_;
				    f_58_ += f_79_;
				    f_89_ += f_81_;
				    f_90_ += f_83_;
				    f_91_ += f_85_;
				    f_52_
					+= (float) ((Class121) this).anInt1517;
				}
			    } else {
				f_52_ += 0.5F;
				f += 0.5F;
				f_53_ = (float) (int) (f_53_ + 0.5F) - f;
				f -= f_52_;
				f_52_ = (float) (((Class121) this)
						 .anIntArray1506[(int) f_52_]);
				while (--f >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_52_, 0, 0, (int) f_55_,
					       (int) f_56_, f_58_, f_78_,
					       f_89_, f_80_, f_90_, f_82_,
					       f_91_, f_84_);
				    f_56_ += f_75_;
				    f_55_ += f_74_;
				    f_58_ += f_79_;
				    f_89_ += f_81_;
				    f_90_ += f_83_;
				    f_91_ += f_85_;
				    f_52_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f_53_ >= 0.0F) {
				    method1581(bool_50_, bool_51_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_52_, 0, 0, (int) f_55_,
					       (int) f_54_, f_58_, f_78_,
					       f_89_, f_80_, f_90_, f_82_,
					       f_91_, f_84_);
				    f_54_ += f_76_;
				    f_55_ += f_74_;
				    f_58_ += f_79_;
				    f_89_ += f_81_;
				    f_90_ += f_83_;
				    f_91_ += f_85_;
				    f_52_
					+= (float) ((Class121) this).anInt1517;
				}
			    }
			}
		    }
		} else if (!(f_53_ >= (float) ((Class121) this).anInt1520)) {
		    if (f > (float) ((Class121) this).anInt1520)
			f = (float) ((Class121) this).anInt1520;
		    if (f_52_ > (float) ((Class121) this).anInt1520)
			f_52_ = (float) ((Class121) this).anInt1520;
		    f_59_ = f_59_ - f_78_ * f_56_ + f_78_;
		    float f_92_
			= (float) (i_61_ & 0xff0000) - f_80_ * f_56_ + f_80_;
		    float f_93_
			= (float) (i_61_ & 0xff00) - f_82_ * f_56_ + f_82_;
		    float f_94_
			= (float) (i_61_ & 0xff) - f_84_ * f_56_ + f_84_;
		    if (f < f_52_) {
			f_55_ = f_56_;
			if (f_53_ < 0.0F) {
			    f_55_ -= f_74_ * f_53_;
			    f_56_ -= f_76_ * f_53_;
			    f_59_ -= f_79_ * f_53_;
			    f_92_ -= f_81_ * f_53_;
			    f_93_ -= f_83_ * f_53_;
			    f_94_ -= f_85_ * f_53_;
			    f_53_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_54_ -= f_75_ * f;
			    f = 0.0F;
			}
			if (f_74_ < f_76_) {
			    f_53_ += 0.5F;
			    f += 0.5F;
			    f_52_ = (float) (int) (f_52_ + 0.5F) - f;
			    f -= f_53_;
			    f_53_ = (float) (((Class121) this).anIntArray1506
					     [(int) f_53_]);
			    while (--f >= 0.0F) {
				method1581(bool_50_, bool_51_,
					   ((Class121) this).anIntArray1518,
					   (int) f_53_, 0, 0, (int) f_55_,
					   (int) f_56_, f_59_, f_78_, f_92_,
					   f_80_, f_93_, f_82_, f_94_, f_84_);
				f_55_ += f_74_;
				f_56_ += f_76_;
				f_59_ += f_79_;
				f_92_ += f_81_;
				f_93_ += f_83_;
				f_94_ += f_85_;
				f_53_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f_52_ >= 0.0F) {
				method1581(bool_50_, bool_51_,
					   ((Class121) this).anIntArray1518,
					   (int) f_53_, 0, 0, (int) f_55_,
					   (int) f_54_, f_59_, f_78_, f_92_,
					   f_80_, f_93_, f_82_, f_94_, f_84_);
				f_55_ += f_74_;
				f_54_ += f_75_;
				f_59_ += f_79_;
				f_92_ += f_81_;
				f_93_ += f_83_;
				f_94_ += f_85_;
				f_53_ += (float) ((Class121) this).anInt1517;
			    }
			} else {
			    f_53_ += 0.5F;
			    f += 0.5F;
			    f_52_ = (float) (int) (f_52_ + 0.5F) - f;
			    f -= f_53_;
			    f_53_ = (float) (((Class121) this).anIntArray1506
					     [(int) f_53_]);
			    while (--f >= 0.0F) {
				method1581(bool_50_, bool_51_,
					   ((Class121) this).anIntArray1518,
					   (int) f_53_, 0, 0, (int) f_56_,
					   (int) f_55_, f_59_, f_78_, f_92_,
					   f_80_, f_93_, f_82_, f_94_, f_84_);
				f_55_ += f_74_;
				f_56_ += f_76_;
				f_59_ += f_79_;
				f_92_ += f_81_;
				f_93_ += f_83_;
				f_94_ += f_85_;
				f_53_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f_52_ >= 0.0F) {
				method1581(bool_50_, bool_51_,
					   ((Class121) this).anIntArray1518,
					   (int) f_53_, 0, 0, (int) f_54_,
					   (int) f_55_, f_59_, f_78_, f_92_,
					   f_80_, f_93_, f_82_, f_94_, f_84_);
				f_55_ += f_74_;
				f_54_ += f_75_;
				f_59_ += f_79_;
				f_92_ += f_81_;
				f_93_ += f_83_;
				f_94_ += f_85_;
				f_53_ += (float) ((Class121) this).anInt1517;
			    }
			}
		    } else {
			f_54_ = f_56_;
			if (f_53_ < 0.0F) {
			    f_54_ -= f_74_ * f_53_;
			    f_56_ -= f_76_ * f_53_;
			    f_59_ -= f_79_ * f_53_;
			    f_92_ -= f_81_ * f_53_;
			    f_93_ -= f_83_ * f_53_;
			    f_94_ -= f_85_ * f_53_;
			    f_53_ = 0.0F;
			}
			if (f_52_ < 0.0F) {
			    f_55_ -= f_75_ * f_52_;
			    f_52_ = 0.0F;
			}
			if (f_74_ < f_76_) {
			    f_53_ += 0.5F;
			    f_52_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_52_;
			    f_52_ -= f_53_;
			    f_53_ = (float) (((Class121) this).anIntArray1506
					     [(int) f_53_]);
			    while (--f_52_ >= 0.0F) {
				method1581(bool_50_, bool_51_,
					   ((Class121) this).anIntArray1518,
					   (int) f_53_, 0, 0, (int) f_54_,
					   (int) f_56_, f_59_, f_78_, f_92_,
					   f_80_, f_93_, f_82_, f_94_, f_84_);
				f_54_ += f_74_;
				f_56_ += f_76_;
				f_59_ += f_79_;
				f_92_ += f_81_;
				f_93_ += f_83_;
				f_94_ += f_85_;
				f_53_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f >= 0.0F) {
				method1581(bool_50_, bool_51_,
					   ((Class121) this).anIntArray1518,
					   (int) f_53_, 0, 0, (int) f_55_,
					   (int) f_56_, f_59_, f_78_, f_92_,
					   f_80_, f_93_, f_82_, f_94_, f_84_);
				f_55_ += f_75_;
				f_56_ += f_76_;
				f_59_ += f_79_;
				f_92_ += f_81_;
				f_93_ += f_83_;
				f_94_ += f_85_;
				f_53_ += (float) ((Class121) this).anInt1517;
			    }
			} else {
			    f_53_ += 0.5F;
			    f_52_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_52_;
			    f_52_ -= f_53_;
			    f_53_ = (float) (((Class121) this).anIntArray1506
					     [(int) f_53_]);
			    while (--f_52_ >= 0.0F) {
				method1581(bool_50_, bool_51_,
					   ((Class121) this).anIntArray1518,
					   (int) f_53_, 0, 0, (int) f_56_,
					   (int) f_54_, f_59_, f_78_, f_92_,
					   f_80_, f_93_, f_82_, f_94_, f_84_);
				f_54_ += f_74_;
				f_56_ += f_76_;
				f_59_ += f_79_;
				f_92_ += f_81_;
				f_93_ += f_83_;
				f_94_ += f_85_;
				f_53_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f >= 0.0F) {
				method1581(bool_50_, bool_51_,
					   ((Class121) this).anIntArray1518,
					   (int) f_53_, 0, 0, (int) f_56_,
					   (int) f_55_, f_59_, f_78_, f_92_,
					   f_80_, f_93_, f_82_, f_94_, f_84_);
				f_55_ += f_75_;
				f_56_ += f_76_;
				f_59_ += f_79_;
				f_92_ += f_81_;
				f_93_ += f_83_;
				f_94_ += f_85_;
				f_53_ += (float) ((Class121) this).anInt1517;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method1581(boolean bool, boolean bool_95_, int[] is, int i,
			  int i_96_, int i_97_, int i_98_, int i_99_, float f,
			  float f_100_, float f_101_, float f_102_,
			  float f_103_, float f_104_, float f_105_,
			  float f_106_) {
	if (((Class121) this).aBool1504) {
	    if (i_99_ > ((Class121) this).anInt1513)
		i_99_ = ((Class121) this).anInt1513;
	    if (i_98_ < 0)
		i_98_ = 0;
	}
	if (i_98_ < i_99_) {
	    if (((Class121) this).aBool1537) {
		i += i_98_;
		f_101_ += f_102_ * (float) i_98_;
		f_103_ += f_104_ * (float) i_98_;
		f_105_ += f_106_ * (float) i_98_;
		if (((Class121) this).aBool1501) {
		    i_97_ = i_99_ - i_98_ >> 2;
		    f_102_ *= 4.0F;
		    f_104_ *= 4.0F;
		    f_106_ *= 4.0F;
		    if (((Class121) this).anInt1526 == 0) {
			if (i_97_ > 0) {
			    do {
				i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						     | (int) f_103_ & 0xff00
						     | (int) f_105_ & 0xff);
				f_101_ += f_102_;
				f_103_ += f_104_;
				f_105_ += f_106_;
				is[i++] = i_96_;
				is[i++] = i_96_;
				is[i++] = i_96_;
				is[i++] = i_96_;
			    } while (--i_97_ > 0);
			}
			i_97_ = i_99_ - i_98_ & 0x3;
			if (i_97_ > 0) {
			    i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						 | (int) f_103_ & 0xff00
						 | (int) f_105_ & 0xff);
			    do
				is[i++] = i_96_;
			    while (--i_97_ > 0);
			}
		    } else if (!((Class121) this).aBool1502) {
			int i_107_ = ((Class121) this).anInt1526;
			int i_108_ = 256 - ((Class121) this).anInt1526;
			if (i_97_ > 0) {
			    do {
				i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						     | (int) f_103_ & 0xff00
						     | (int) f_105_ & 0xff);
				f_101_ += f_102_;
				f_103_ += f_104_;
				f_105_ += f_106_;
				i_96_ = (((i_96_ & 0xff00ff) * i_108_ >> 8
					  & 0xff00ff)
					 + ((i_96_ & 0xff00) * i_108_ >> 8
					    & 0xff00));
				int i_109_ = is[i];
				if (bool_95_) {
				    is[i++]
					= ((i_108_ | i_109_ >> 24) << 24
					   | (i_96_
					      + (((i_109_ & 0xff00ff) * i_107_
						  >> 8)
						 & 0xff00ff)
					      + (((i_109_ & 0xff00) * i_107_
						  >> 8)
						 & 0xff00)));
				    i_109_ = is[i];
				    is[i++]
					= ((i_108_ | i_109_ >> 24) << 24
					   | (i_96_
					      + (((i_109_ & 0xff00ff) * i_107_
						  >> 8)
						 & 0xff00ff)
					      + (((i_109_ & 0xff00) * i_107_
						  >> 8)
						 & 0xff00)));
				    i_109_ = is[i];
				    is[i++]
					= ((i_108_ | i_109_ >> 24) << 24
					   | (i_96_
					      + (((i_109_ & 0xff00ff) * i_107_
						  >> 8)
						 & 0xff00ff)
					      + (((i_109_ & 0xff00) * i_107_
						  >> 8)
						 & 0xff00)));
				    i_109_ = is[i];
				    is[i++]
					= ((i_108_ | i_109_ >> 24) << 24
					   | (i_96_
					      + (((i_109_ & 0xff00ff) * i_107_
						  >> 8)
						 & 0xff00ff)
					      + (((i_109_ & 0xff00) * i_107_
						  >> 8)
						 & 0xff00)));
				} else {
				    is[i++]
					= (i_96_
					   + ((i_109_ & 0xff00ff) * i_107_ >> 8
					      & 0xff00ff)
					   + ((i_109_ & 0xff00) * i_107_ >> 8
					      & 0xff00));
				    i_109_ = is[i];
				    is[i++]
					= (i_96_
					   + ((i_109_ & 0xff00ff) * i_107_ >> 8
					      & 0xff00ff)
					   + ((i_109_ & 0xff00) * i_107_ >> 8
					      & 0xff00));
				    i_109_ = is[i];
				    is[i++]
					= (i_96_
					   + ((i_109_ & 0xff00ff) * i_107_ >> 8
					      & 0xff00ff)
					   + ((i_109_ & 0xff00) * i_107_ >> 8
					      & 0xff00));
				    i_109_ = is[i];
				    is[i++]
					= (i_96_
					   + ((i_109_ & 0xff00ff) * i_107_ >> 8
					      & 0xff00ff)
					   + ((i_109_ & 0xff00) * i_107_ >> 8
					      & 0xff00));
				}
			    } while (--i_97_ > 0);
			}
			i_97_ = i_99_ - i_98_ & 0x3;
			if (i_97_ > 0) {
			    i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						 | (int) f_103_ & 0xff00
						 | (int) f_105_ & 0xff);
			    i_96_ = (((i_96_ & 0xff00ff) * i_108_ >> 8
				      & 0xff00ff)
				     + ((i_96_ & 0xff00) * i_108_ >> 8
					& 0xff00));
			    do {
				int i_110_ = is[i];
				if (bool_95_)
				    is[i++]
					= ((i_108_ | i_110_ >> 24) << 24
					   | (i_96_
					      + (((i_110_ & 0xff00ff) * i_107_
						  >> 8)
						 & 0xff00ff)
					      + (((i_110_ & 0xff00) * i_107_
						  >> 8)
						 & 0xff00)));
				else
				    is[i++]
					= (i_96_
					   + ((i_110_ & 0xff00ff) * i_107_ >> 8
					      & 0xff00ff)
					   + ((i_110_ & 0xff00) * i_107_ >> 8
					      & 0xff00));
			    } while (--i_97_ > 0);
			}
		    } else {
			if (i_97_ > 0) {
			    do {
				i_96_ = ((int) f_101_ & 0xff0000
					 | (int) f_103_ & 0xff00
					 | (int) f_105_ & 0xff);
				f_101_ += f_102_;
				f_103_ += f_104_;
				f_105_ += f_106_;
				int[] is_111_ = is;
				int i_112_ = i++;
				int i_113_ = i_96_;
				int i_114_ = is_111_[i_112_];
				int i_115_ = i_113_ + i_114_;
				int i_116_ = ((i_113_ & 0xff00ff)
					      + (i_114_ & 0xff00ff));
				i_114_
				    = (i_116_ & 0x1000100) + (i_115_ - i_116_
							      & 0x10000);
				is_111_[i_112_] = (~0xffffff | i_115_ - i_114_
						   | i_114_ - (i_114_ >>> 8));
				int[] is_117_ = is;
				i_115_ = i++;
				i_116_ = i_96_;
				int i_118_ = is_117_[i_115_];
				int i_119_ = i_116_ + i_118_;
				int i_120_ = ((i_116_ & 0xff00ff)
					      + (i_118_ & 0xff00ff));
				i_118_
				    = (i_120_ & 0x1000100) + (i_119_ - i_120_
							      & 0x10000);
				is_117_[i_115_] = (~0xffffff | i_119_ - i_118_
						   | i_118_ - (i_118_ >>> 8));
				int[] is_121_ = is;
				i_119_ = i++;
				i_120_ = i_96_;
				int i_122_ = is_121_[i_119_];
				int i_123_ = i_120_ + i_122_;
				int i_124_ = ((i_120_ & 0xff00ff)
					      + (i_122_ & 0xff00ff));
				i_122_
				    = (i_124_ & 0x1000100) + (i_123_ - i_124_
							      & 0x10000);
				is_121_[i_119_] = (~0xffffff | i_123_ - i_122_
						   | i_122_ - (i_122_ >>> 8));
				int[] is_125_ = is;
				i_123_ = i++;
				i_124_ = i_96_;
				int i_126_ = is_125_[i_123_];
				int i_127_ = i_124_ + i_126_;
				int i_128_ = ((i_124_ & 0xff00ff)
					      + (i_126_ & 0xff00ff));
				i_126_
				    = (i_128_ & 0x1000100) + (i_127_ - i_128_
							      & 0x10000);
				is_125_[i_123_] = (~0xffffff | i_127_ - i_126_
						   | i_126_ - (i_126_ >>> 8));
			    } while (--i_97_ > 0);
			}
			i_97_ = i_99_ - i_98_ & 0x3;
			if (i_97_ > 0) {
			    i_96_ = ((int) f_101_ & 0xff0000
				     | (int) f_103_ & 0xff00
				     | (int) f_105_ & 0xff);
			    do {
				int[] is_129_ = is;
				int i_130_ = i++;
				int i_131_ = i_96_;
				int i_132_ = is_129_[i_130_];
				int i_133_ = i_131_ + i_132_;
				int i_134_ = ((i_131_ & 0xff00ff)
					      + (i_132_ & 0xff00ff));
				i_132_
				    = (i_134_ & 0x1000100) + (i_133_ - i_134_
							      & 0x10000);
				is_129_[i_130_] = (~0xffffff | i_133_ - i_132_
						   | i_132_ - (i_132_ >>> 8));
			    } while (--i_97_ > 0);
			}
		    }
		} else {
		    i_97_ = i_99_ - i_98_;
		    if (((Class121) this).anInt1526 == 0) {
			do {
			    is[i++] = ~0xffffff | ((int) f_101_ & 0xff0000
						   | (int) f_103_ & 0xff00
						   | (int) f_105_ & 0xff);
			    f_101_ += f_102_;
			    f_103_ += f_104_;
			    f_105_ += f_106_;
			} while (--i_97_ > 0);
		    } else if (!((Class121) this).aBool1502) {
			int i_135_ = ((Class121) this).anInt1526;
			int i_136_ = 256 - ((Class121) this).anInt1526;
			do {
			    i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						 | (int) f_103_ & 0xff00
						 | (int) f_105_ & 0xff);
			    f_101_ += f_102_;
			    f_103_ += f_104_;
			    f_105_ += f_106_;
			    i_96_ = (((i_96_ & 0xff00ff) * i_136_ >> 8
				      & 0xff00ff)
				     + ((i_96_ & 0xff00) * i_136_ >> 8
					& 0xff00));
			    int i_137_ = is[i];
			    if (bool_95_)
				is[i++]
				    = ((i_136_ | i_137_ >> 24) << 24
				       | (i_96_
					  + ((i_137_ & 0xff00ff) * i_135_ >> 8
					     & 0xff00ff)
					  + ((i_137_ & 0xff00) * i_135_ >> 8
					     & 0xff00)));
			    else
				is[i++] = (i_96_
					   + ((i_137_ & 0xff00ff) * i_135_ >> 8
					      & 0xff00ff)
					   + ((i_137_ & 0xff00) * i_135_ >> 8
					      & 0xff00));
			} while (--i_97_ > 0);
		    } else {
			do {
			    int[] is_138_ = is;
			    int i_139_ = i++;
			    int i_140_ = ((int) f_101_ & 0xff0000
					  | (int) f_103_ & 0xff00
					  | (int) f_105_ & 0xff);
			    int i_141_ = is_138_[i_139_];
			    int i_142_ = i_140_ + i_141_;
			    int i_143_
				= (i_140_ & 0xff00ff) + (i_141_ & 0xff00ff);
			    i_141_ = (i_143_ & 0x1000100) + (i_142_ - i_143_
							     & 0x10000);
			    is_138_[i_139_] = (~0xffffff | i_142_ - i_141_
					       | i_141_ - (i_141_ >>> 8));
			    f_101_ += f_102_;
			    f_103_ += f_104_;
			    f_105_ += f_106_;
			} while (--i_97_ > 0);
		    }
		}
	    } else {
		i += i_98_ - 1;
		f += f_100_ * (float) i_98_;
		f_101_ += f_102_ * (float) i_98_;
		f_103_ += f_104_ * (float) i_98_;
		f_105_ += f_106_ * (float) i_98_;
		if (((Class107) ((Class121) this).aClass107_1516).aBool1344) {
		    if (((Class121) this).aBool1501) {
			i_97_ = i_99_ - i_98_ >> 2;
			f_102_ *= 4.0F;
			f_104_ *= 4.0F;
			f_106_ *= 4.0F;
			if (((Class121) this).anInt1526 == 0) {
			    if (i_97_ > 0) {
				do {
				    i_96_
					= ~0xffffff | ((int) f_101_ & 0xff0000
						       | (int) f_103_ & 0xff00
						       | (int) f_105_ & 0xff);
				    f_101_ += f_102_;
				    f_103_ += f_104_;
				    f_105_ += f_106_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					is[i] = i_96_;
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					is[i] = i_96_;
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					is[i] = i_96_;
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					is[i] = i_96_;
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				} while (--i_97_ > 0);
			    }
			    i_97_ = i_99_ - i_98_ & 0x3;
			    if (i_97_ > 0) {
				i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						     | (int) f_103_ & 0xff00
						     | (int) f_105_ & 0xff);
				do {
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					is[i] = i_96_;
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				} while (--i_97_ > 0);
			    }
			} else if (!((Class121) this).aBool1502) {
			    int i_144_ = ((Class121) this).anInt1526;
			    int i_145_ = 256 - ((Class121) this).anInt1526;
			    if (i_97_ > 0) {
				do {
				    i_96_
					= ~0xffffff | ((int) f_101_ & 0xff0000
						       | (int) f_103_ & 0xff00
						       | (int) f_105_ & 0xff);
				    f_101_ += f_102_;
				    f_103_ += f_104_;
				    f_105_ += f_106_;
				    i_96_ = (((i_96_ & 0xff00ff) * i_145_ >> 8
					      & 0xff00ff)
					     + ((i_96_ & 0xff00) * i_145_ >> 8
						& 0xff00));
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					int i_146_ = is[i];
					if (bool_95_)
					    is[i] = (((i_145_ | i_146_ >> 24)
						      << 24)
						     | (i_96_
							+ (((i_146_ & 0xff00ff)
							    * i_144_) >> 8
							   & 0xff00ff)
							+ (((i_146_ & 0xff00)
							    * i_144_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_96_
						     + (((i_146_ & 0xff00ff)
							 * i_144_) >> 8
							& 0xff00ff)
						     + (((i_146_ & 0xff00)
							 * i_144_) >> 8
							& 0xff00));
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					int i_147_ = is[i];
					if (bool_95_)
					    is[i] = (((i_145_ | i_147_ >> 24)
						      << 24)
						     | (i_96_
							+ (((i_147_ & 0xff00ff)
							    * i_144_) >> 8
							   & 0xff00ff)
							+ (((i_147_ & 0xff00)
							    * i_144_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_96_
						     + (((i_147_ & 0xff00ff)
							 * i_144_) >> 8
							& 0xff00ff)
						     + (((i_147_ & 0xff00)
							 * i_144_) >> 8
							& 0xff00));
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					int i_148_ = is[i];
					if (bool_95_)
					    is[i] = (((i_145_ | i_148_ >> 24)
						      << 24)
						     | (i_96_
							+ (((i_148_ & 0xff00ff)
							    * i_144_) >> 8
							   & 0xff00ff)
							+ (((i_148_ & 0xff00)
							    * i_144_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_96_
						     + (((i_148_ & 0xff00ff)
							 * i_144_) >> 8
							& 0xff00ff)
						     + (((i_148_ & 0xff00)
							 * i_144_) >> 8
							& 0xff00));
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					int i_149_ = is[i];
					if (bool_95_)
					    is[i] = (((i_145_ | i_149_ >> 24)
						      << 24)
						     | (i_96_
							+ (((i_149_ & 0xff00ff)
							    * i_144_) >> 8
							   & 0xff00ff)
							+ (((i_149_ & 0xff00)
							    * i_144_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_96_
						     + (((i_149_ & 0xff00ff)
							 * i_144_) >> 8
							& 0xff00ff)
						     + (((i_149_ & 0xff00)
							 * i_144_) >> 8
							& 0xff00));
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				} while (--i_97_ > 0);
			    }
			    i_97_ = i_99_ - i_98_ & 0x3;
			    if (i_97_ > 0) {
				i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						     | (int) f_103_ & 0xff00
						     | (int) f_105_ & 0xff);
				i_96_ = (((i_96_ & 0xff00ff) * i_145_ >> 8
					  & 0xff00ff)
					 + ((i_96_ & 0xff00) * i_145_ >> 8
					    & 0xff00));
				do {
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					int i_150_ = is[i];
					if (bool_95_)
					    is[i] = (((i_145_ | i_150_ >> 24)
						      << 24)
						     | (i_96_
							+ (((i_150_ & 0xff00ff)
							    * i_144_) >> 8
							   & 0xff00ff)
							+ (((i_150_ & 0xff00)
							    * i_144_) >> 8
							   & 0xff00)));
					else
					    is[i] = (i_96_
						     + (((i_150_ & 0xff00ff)
							 * i_144_) >> 8
							& 0xff00ff)
						     + (((i_150_ & 0xff00)
							 * i_144_) >> 8
							& 0xff00));
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				} while (--i_97_ > 0);
			    }
			} else {
			    if (i_97_ > 0) {
				do {
				    i_96_ = ((int) f_101_ & 0xff0000
					     | (int) f_103_ & 0xff00
					     | (int) f_105_ & 0xff);
				    f_101_ += f_102_;
				    f_103_ += f_104_;
				    f_105_ += f_106_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					int[] is_151_ = is;
					int i_152_ = i;
					int i_153_ = i_96_;
					int i_154_ = is_151_[i_152_];
					int i_155_ = i_153_ + i_154_;
					int i_156_ = ((i_153_ & 0xff00ff)
						      + (i_154_ & 0xff00ff));
					i_154_
					    = ((i_156_ & 0x1000100)
					       + (i_155_ - i_156_ & 0x10000));
					is_151_[i_152_]
					    = (~0xffffff | i_155_ - i_154_
					       | i_154_ - (i_154_ >>> 8));
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					int[] is_157_ = is;
					int i_158_ = i;
					int i_159_ = i_96_;
					int i_160_ = is_157_[i_158_];
					int i_161_ = i_159_ + i_160_;
					int i_162_ = ((i_159_ & 0xff00ff)
						      + (i_160_ & 0xff00ff));
					i_160_
					    = ((i_162_ & 0x1000100)
					       + (i_161_ - i_162_ & 0x10000));
					is_157_[i_158_]
					    = (~0xffffff | i_161_ - i_160_
					       | i_160_ - (i_160_ >>> 8));
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					int[] is_163_ = is;
					int i_164_ = i;
					int i_165_ = i_96_;
					int i_166_ = is_163_[i_164_];
					int i_167_ = i_165_ + i_166_;
					int i_168_ = ((i_165_ & 0xff00ff)
						      + (i_166_ & 0xff00ff));
					i_166_
					    = ((i_168_ & 0x1000100)
					       + (i_167_ - i_168_ & 0x10000));
					is_163_[i_164_]
					    = (~0xffffff | i_167_ - i_166_
					       | i_166_ - (i_166_ >>> 8));
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					int[] is_169_ = is;
					int i_170_ = i;
					int i_171_ = i_96_;
					int i_172_ = is_169_[i_170_];
					int i_173_ = i_171_ + i_172_;
					int i_174_ = ((i_171_ & 0xff00ff)
						      + (i_172_ & 0xff00ff));
					i_172_
					    = ((i_174_ & 0x1000100)
					       + (i_173_ - i_174_ & 0x10000));
					is_169_[i_170_]
					    = (~0xffffff | i_173_ - i_172_
					       | i_172_ - (i_172_ >>> 8));
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				} while (--i_97_ > 0);
			    }
			    i_97_ = i_99_ - i_98_ & 0x3;
			    if (i_97_ > 0) {
				i_96_ = ((int) f_101_ & 0xff0000
					 | (int) f_103_ & 0xff00
					 | (int) f_105_ & 0xff);
				do {
				    i++;
				    if (!bool || f < (((Class121) this)
						      .aFloatArray1519[i])) {
					int[] is_175_ = is;
					int i_176_ = i;
					int i_177_ = i_96_;
					int i_178_ = is_175_[i_176_];
					int i_179_ = i_177_ + i_178_;
					int i_180_ = ((i_177_ & 0xff00ff)
						      + (i_178_ & 0xff00ff));
					i_178_
					    = ((i_180_ & 0x1000100)
					       + (i_179_ - i_180_ & 0x10000));
					is_175_[i_176_]
					    = (~0xffffff | i_179_ - i_178_
					       | i_178_ - (i_178_ >>> 8));
					if (bool)
					    ((Class121) this)
						.aFloatArray1519[i]
						= f;
				    }
				    f += f_100_;
				} while (--i_97_ > 0);
			    }
			}
		    } else {
			i_97_ = i_99_ - i_98_;
			if (((Class121) this).anInt1526 == 0) {
			    do {
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    is[i]
					= ~0xffffff | ((int) f_101_ & 0xff0000
						       | (int) f_103_ & 0xff00
						       | (int) f_105_ & 0xff);
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f;
				}
				f += f_100_;
				f_101_ += f_102_;
				f_103_ += f_104_;
				f_105_ += f_106_;
			    } while (--i_97_ > 0);
			} else if (!((Class121) this).aBool1502) {
			    int i_181_ = ((Class121) this).anInt1526;
			    int i_182_ = 256 - ((Class121) this).anInt1526;
			    do {
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    i_96_
					= ~0xffffff | ((int) f_101_ & 0xff0000
						       | (int) f_103_ & 0xff00
						       | (int) f_105_ & 0xff);
				    i_96_ = (((i_96_ & 0xff00ff) * i_182_ >> 8
					      & 0xff00ff)
					     + ((i_96_ & 0xff00) * i_182_ >> 8
						& 0xff00));
				    int i_183_ = is[i];
				    if (bool_95_)
					is[i] = ((i_182_ | i_183_ >> 24) << 24
						 | (i_96_
						    + (((i_183_ & 0xff00ff)
							* i_181_) >> 8
						       & 0xff00ff)
						    + (((i_183_ & 0xff00)
							* i_181_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_96_
					       + (((i_183_ & 0xff00ff) * i_181_
						   >> 8)
						  & 0xff00ff)
					       + (((i_183_ & 0xff00) * i_181_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f;
				}
				f += f_100_;
				f_101_ += f_102_;
				f_103_ += f_104_;
				f_105_ += f_106_;
			    } while (--i_97_ > 0);
			} else {
			    do {
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int[] is_184_ = is;
				    int i_185_ = i;
				    int i_186_ = ((int) f_101_ & 0xff0000
						  | (int) f_103_ & 0xff00
						  | (int) f_105_ & 0xff);
				    int i_187_ = is_184_[i_185_];
				    int i_188_ = i_186_ + i_187_;
				    int i_189_ = ((i_186_ & 0xff00ff)
						  + (i_187_ & 0xff00ff));
				    i_187_ = ((i_189_ & 0x1000100)
					      + (i_188_ - i_189_ & 0x10000));
				    is_184_[i_185_]
					= (~0xffffff | i_188_ - i_187_
					   | i_187_ - (i_187_ >>> 8));
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f;
				}
				f += f_100_;
				f_101_ += f_102_;
				f_103_ += f_104_;
				f_105_ += f_106_;
			    } while (--i_97_ > 0);
			}
		    }
		} else if (((Class121) this).aBool1501) {
		    i_97_ = i_99_ - i_98_ >> 2;
		    f_102_ *= 4.0F;
		    f_104_ *= 4.0F;
		    f_106_ *= 4.0F;
		    if (((Class121) this).anInt1526 == 0) {
			if (i_97_ > 0) {
			    do {
				i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						     | (int) f_103_ & 0xff00
						     | (int) f_105_ & 0xff);
				f_101_ += f_102_;
				f_103_ += f_104_;
				f_105_ += f_106_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i]))
				    is[i] = i_96_;
				f += f_100_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i]))
				    is[i] = i_96_;
				f += f_100_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i]))
				    is[i] = i_96_;
				f += f_100_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i]))
				    is[i] = i_96_;
				f += f_100_;
			    } while (--i_97_ > 0);
			}
			i_97_ = i_99_ - i_98_ & 0x3;
			if (i_97_ > 0) {
			    i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						 | (int) f_103_ & 0xff00
						 | (int) f_105_ & 0xff);
			    do {
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i]))
				    is[i] = i_96_;
				f += f_100_;
			    } while (--i_97_ > 0);
			}
		    } else if (!((Class121) this).aBool1502) {
			int i_190_ = ((Class121) this).anInt1526;
			int i_191_ = 256 - ((Class121) this).anInt1526;
			if (i_97_ > 0) {
			    do {
				i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						     | (int) f_103_ & 0xff00
						     | (int) f_105_ & 0xff);
				f_101_ += f_102_;
				f_103_ += f_104_;
				f_105_ += f_106_;
				i_96_ = (((i_96_ & 0xff00ff) * i_191_ >> 8
					  & 0xff00ff)
					 + ((i_96_ & 0xff00) * i_191_ >> 8
					    & 0xff00));
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int i_192_ = is[i];
				    if (bool_95_)
					is[i] = ((i_191_ | i_192_ >> 24) << 24
						 | (i_96_
						    + (((i_192_ & 0xff00ff)
							* i_190_) >> 8
						       & 0xff00ff)
						    + (((i_192_ & 0xff00)
							* i_190_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_96_
					       + (((i_192_ & 0xff00ff) * i_190_
						   >> 8)
						  & 0xff00ff)
					       + (((i_192_ & 0xff00) * i_190_
						   >> 8)
						  & 0xff00));
				}
				f += f_100_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int i_193_ = is[i];
				    if (bool_95_)
					is[i] = ((i_191_ | i_193_ >> 24) << 24
						 | (i_96_
						    + (((i_193_ & 0xff00ff)
							* i_190_) >> 8
						       & 0xff00ff)
						    + (((i_193_ & 0xff00)
							* i_190_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_96_
					       + (((i_193_ & 0xff00ff) * i_190_
						   >> 8)
						  & 0xff00ff)
					       + (((i_193_ & 0xff00) * i_190_
						   >> 8)
						  & 0xff00));
				}
				f += f_100_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int i_194_ = is[i];
				    if (bool_95_)
					is[i] = ((i_191_ | i_194_ >> 24) << 24
						 | (i_96_
						    + (((i_194_ & 0xff00ff)
							* i_190_) >> 8
						       & 0xff00ff)
						    + (((i_194_ & 0xff00)
							* i_190_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_96_
					       + (((i_194_ & 0xff00ff) * i_190_
						   >> 8)
						  & 0xff00ff)
					       + (((i_194_ & 0xff00) * i_190_
						   >> 8)
						  & 0xff00));
				}
				f += f_100_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int i_195_ = is[i];
				    if (bool_95_)
					is[i] = ((i_191_ | i_195_ >> 24) << 24
						 | (i_96_
						    + (((i_195_ & 0xff00ff)
							* i_190_) >> 8
						       & 0xff00ff)
						    + (((i_195_ & 0xff00)
							* i_190_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_96_
					       + (((i_195_ & 0xff00ff) * i_190_
						   >> 8)
						  & 0xff00ff)
					       + (((i_195_ & 0xff00) * i_190_
						   >> 8)
						  & 0xff00));
				}
				f += f_100_;
			    } while (--i_97_ > 0);
			}
			i_97_ = i_99_ - i_98_ & 0x3;
			if (i_97_ > 0) {
			    i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						 | (int) f_103_ & 0xff00
						 | (int) f_105_ & 0xff);
			    i_96_ = (((i_96_ & 0xff00ff) * i_191_ >> 8
				      & 0xff00ff)
				     + ((i_96_ & 0xff00) * i_191_ >> 8
					& 0xff00));
			    do {
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int i_196_ = is[i];
				    if (bool_95_)
					is[i] = ((i_191_ | i_196_ >> 24) << 24
						 | (i_96_
						    + (((i_196_ & 0xff00ff)
							* i_190_) >> 8
						       & 0xff00ff)
						    + (((i_196_ & 0xff00)
							* i_190_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_96_
					       + (((i_196_ & 0xff00ff) * i_190_
						   >> 8)
						  & 0xff00ff)
					       + (((i_196_ & 0xff00) * i_190_
						   >> 8)
						  & 0xff00));
				}
				f += f_100_;
			    } while (--i_97_ > 0);
			}
		    } else {
			if (i_97_ > 0) {
			    do {
				i_96_ = ((int) f_101_ & 0xff0000
					 | (int) f_103_ & 0xff00
					 | (int) f_105_ & 0xff);
				f_101_ += f_102_;
				f_103_ += f_104_;
				f_105_ += f_106_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int[] is_197_ = is;
				    int i_198_ = i;
				    int i_199_ = i_96_;
				    int i_200_ = is_197_[i_198_];
				    int i_201_ = i_199_ + i_200_;
				    int i_202_ = ((i_199_ & 0xff00ff)
						  + (i_200_ & 0xff00ff));
				    i_200_ = ((i_202_ & 0x1000100)
					      + (i_201_ - i_202_ & 0x10000));
				    is_197_[i_198_]
					= (~0xffffff | i_201_ - i_200_
					   | i_200_ - (i_200_ >>> 8));
				}
				f += f_100_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int[] is_203_ = is;
				    int i_204_ = i;
				    int i_205_ = i_96_;
				    int i_206_ = is_203_[i_204_];
				    int i_207_ = i_205_ + i_206_;
				    int i_208_ = ((i_205_ & 0xff00ff)
						  + (i_206_ & 0xff00ff));
				    i_206_ = ((i_208_ & 0x1000100)
					      + (i_207_ - i_208_ & 0x10000));
				    is_203_[i_204_]
					= (~0xffffff | i_207_ - i_206_
					   | i_206_ - (i_206_ >>> 8));
				}
				f += f_100_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int[] is_209_ = is;
				    int i_210_ = i;
				    int i_211_ = i_96_;
				    int i_212_ = is_209_[i_210_];
				    int i_213_ = i_211_ + i_212_;
				    int i_214_ = ((i_211_ & 0xff00ff)
						  + (i_212_ & 0xff00ff));
				    i_212_ = ((i_214_ & 0x1000100)
					      + (i_213_ - i_214_ & 0x10000));
				    is_209_[i_210_]
					= (~0xffffff | i_213_ - i_212_
					   | i_212_ - (i_212_ >>> 8));
				}
				f += f_100_;
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int[] is_215_ = is;
				    int i_216_ = i;
				    int i_217_ = i_96_;
				    int i_218_ = is_215_[i_216_];
				    int i_219_ = i_217_ + i_218_;
				    int i_220_ = ((i_217_ & 0xff00ff)
						  + (i_218_ & 0xff00ff));
				    i_218_ = ((i_220_ & 0x1000100)
					      + (i_219_ - i_220_ & 0x10000));
				    is_215_[i_216_]
					= (~0xffffff | i_219_ - i_218_
					   | i_218_ - (i_218_ >>> 8));
				}
				f += f_100_;
			    } while (--i_97_ > 0);
			}
			i_97_ = i_99_ - i_98_ & 0x3;
			if (i_97_ > 0) {
			    i_96_ = ((int) f_101_ & 0xff0000
				     | (int) f_103_ & 0xff00
				     | (int) f_105_ & 0xff);
			    do {
				i++;
				if (!bool || f < (((Class121) this)
						  .aFloatArray1519[i])) {
				    int[] is_221_ = is;
				    int i_222_ = i;
				    int i_223_ = i_96_;
				    int i_224_ = is_221_[i_222_];
				    int i_225_ = i_223_ + i_224_;
				    int i_226_ = ((i_223_ & 0xff00ff)
						  + (i_224_ & 0xff00ff));
				    i_224_ = ((i_226_ & 0x1000100)
					      + (i_225_ - i_226_ & 0x10000));
				    is_221_[i_222_]
					= (~0xffffff | i_225_ - i_224_
					   | i_224_ - (i_224_ >>> 8));
				}
				f += f_100_;
			    } while (--i_97_ > 0);
			}
		    }
		} else {
		    i_97_ = i_99_ - i_98_;
		    if (((Class121) this).anInt1526 == 0) {
			do {
			    i++;
			    if (!bool
				|| f < ((Class121) this).aFloatArray1519[i])
				is[i] = ~0xffffff | ((int) f_101_ & 0xff0000
						     | (int) f_103_ & 0xff00
						     | (int) f_105_ & 0xff);
			    f += f_100_;
			    f_101_ += f_102_;
			    f_103_ += f_104_;
			    f_105_ += f_106_;
			} while (--i_97_ > 0);
		    } else if (!((Class121) this).aBool1502) {
			int i_227_ = ((Class121) this).anInt1526;
			int i_228_ = 256 - ((Class121) this).anInt1526;
			do {
			    i++;
			    if (!bool
				|| f < ((Class121) this).aFloatArray1519[i]) {
				i_96_ = ~0xffffff | ((int) f_101_ & 0xff0000
						     | (int) f_103_ & 0xff00
						     | (int) f_105_ & 0xff);
				i_96_ = (((i_96_ & 0xff00ff) * i_228_ >> 8
					  & 0xff00ff)
					 + ((i_96_ & 0xff00) * i_228_ >> 8
					    & 0xff00));
				int i_229_ = is[i];
				if (bool_95_)
				    is[i]
					= ((i_228_ | i_229_ >> 24) << 24
					   | (i_96_
					      + (((i_229_ & 0xff00ff) * i_227_
						  >> 8)
						 & 0xff00ff)
					      + (((i_229_ & 0xff00) * i_227_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_96_
					   + ((i_229_ & 0xff00ff) * i_227_ >> 8
					      & 0xff00ff)
					   + ((i_229_ & 0xff00) * i_227_ >> 8
					      & 0xff00));
			    }
			    f += f_100_;
			    f_101_ += f_102_;
			    f_103_ += f_104_;
			    f_105_ += f_106_;
			} while (--i_97_ > 0);
		    } else {
			do {
			    i++;
			    if (!bool
				|| f < ((Class121) this).aFloatArray1519[i]) {
				int[] is_230_ = is;
				int i_231_ = i;
				int i_232_ = ((int) f_101_ & 0xff0000
					      | (int) f_103_ & 0xff00
					      | (int) f_105_ & 0xff);
				int i_233_ = is_230_[i_231_];
				int i_234_ = i_232_ + i_233_;
				int i_235_ = ((i_232_ & 0xff00ff)
					      + (i_233_ & 0xff00ff));
				i_233_
				    = (i_235_ & 0x1000100) + (i_234_ - i_235_
							      & 0x10000);
				is_230_[i_231_] = (~0xffffff | i_234_ - i_233_
						   | i_233_ - (i_233_ >>> 8));
			    }
			    f += f_100_;
			    f_101_ += f_102_;
			    f_103_ += f_104_;
			    f_105_ += f_106_;
			} while (--i_97_ > 0);
		    }
		}
	    }
	}
    }
    
    final void method1582(boolean bool, boolean bool_236_, boolean bool_237_,
			  float f, float f_238_, float f_239_, float f_240_,
			  float f_241_, float f_242_, float f_243_,
			  float f_244_, float f_245_, int i) {
	if (((Class121) this).aBool1500) {
	    ((Class121) this).aClass173_Sub3_1509.method2214((int) f_240_,
							     (int) f,
							     (int) f_241_,
							     (int) f_238_, i,
							     (byte) 22);
	    ((Class121) this).aClass173_Sub3_1509.method2214((int) f_241_,
							     (int) f_238_,
							     (int) f_242_,
							     (int) f_239_, i,
							     (byte) 99);
	    ((Class121) this).aClass173_Sub3_1509.method2214((int) f_242_,
							     (int) f_239_,
							     (int) f_240_,
							     (int) f, i,
							     (byte) 50);
	} else {
	    float f_246_ = f_241_ - f_240_;
	    float f_247_ = f_238_ - f;
	    float f_248_ = f_242_ - f_240_;
	    float f_249_ = f_239_ - f;
	    float f_250_ = f_244_ - f_243_;
	    float f_251_ = f_245_ - f_243_;
	    float f_252_ = 0.0F;
	    if (f_238_ != f)
		f_252_ = (f_241_ - f_240_) / (f_238_ - f);
	    float f_253_ = 0.0F;
	    if (f_239_ != f_238_)
		f_253_ = (f_242_ - f_241_) / (f_239_ - f_238_);
	    float f_254_ = 0.0F;
	    if (f_239_ != f)
		f_254_ = (f_240_ - f_242_) / (f - f_239_);
	    float f_255_ = f_246_ * f_249_ - f_248_ * f_247_;
	    if (f_255_ != 0.0F) {
		float f_256_ = (f_250_ * f_249_ - f_251_ * f_247_) / f_255_;
		float f_257_ = (f_251_ * f_246_ - f_250_ * f_248_) / f_255_;
		if (f <= f_238_ && f <= f_239_) {
		    if (!(f >= (float) ((Class121) this).anInt1520)) {
			if (f_238_ > (float) ((Class121) this).anInt1520)
			    f_238_ = (float) ((Class121) this).anInt1520;
			if (f_239_ > (float) ((Class121) this).anInt1520)
			    f_239_ = (float) ((Class121) this).anInt1520;
			f_243_ = f_243_ - f_256_ * f_240_ + f_256_;
			if (f_238_ < f_239_) {
			    f_242_ = f_240_;
			    if (f < 0.0F) {
				f_242_ -= f_254_ * f;
				f_240_ -= f_252_ * f;
				f_243_ -= f_257_ * f;
				f = 0.0F;
			    }
			    if (f_238_ < 0.0F) {
				f_241_ -= f_253_ * f_238_;
				f_238_ = 0.0F;
			    }
			    if (f != f_238_ && f_254_ < f_252_
				|| f == f_238_ && f_254_ > f_253_) {
				f += 0.5F;
				f_238_ += 0.5F;
				f_239_
				    = (float) (int) (f_239_ + 0.5F) - f_238_;
				f_238_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_238_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, i, 0, (int) f_242_,
					       (int) f_240_, f_243_, f_256_);
				    f_242_ += f_254_;
				    f_240_ += f_252_;
				    f_243_ += f_257_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_239_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, i, 0, (int) f_242_,
					       (int) f_241_, f_243_, f_256_);
				    f_242_ += f_254_;
				    f_241_ += f_253_;
				    f_243_ += f_257_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    } else {
				f += 0.5F;
				f_238_ += 0.5F;
				f_239_
				    = (float) (int) (f_239_ + 0.5F) - f_238_;
				f_238_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_238_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, i, 0, (int) f_240_,
					       (int) f_242_, f_243_, f_256_);
				    f_242_ += f_254_;
				    f_240_ += f_252_;
				    f_243_ += f_257_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_239_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, i, 0, (int) f_241_,
					       (int) f_242_, f_243_, f_256_);
				    f_242_ += f_254_;
				    f_241_ += f_253_;
				    f_243_ += f_257_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    }
			} else {
			    f_241_ = f_240_;
			    if (f < 0.0F) {
				f_241_ -= f_254_ * f;
				f_240_ -= f_252_ * f;
				f_243_ -= f_257_ * f;
				f = 0.0F;
			    }
			    if (f_239_ < 0.0F) {
				f_242_ -= f_253_ * f_239_;
				f_239_ = 0.0F;
			    }
			    if (f != f_239_ && f_254_ < f_252_
				|| f == f_239_ && f_253_ > f_252_) {
				f += 0.5F;
				f_239_ += 0.5F;
				f_238_
				    = (float) (int) (f_238_ + 0.5F) - f_239_;
				f_239_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_239_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, i, 0, (int) f_241_,
					       (int) f_240_, f_243_, f_256_);
				    f_241_ += f_254_;
				    f_240_ += f_252_;
				    f_243_ += f_257_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_238_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, i, 0, (int) f_242_,
					       (int) f_240_, f_243_, f_256_);
				    f_242_ += f_253_;
				    f_240_ += f_252_;
				    f_243_ += f_257_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    } else {
				f += 0.5F;
				f_239_ += 0.5F;
				f_238_
				    = (float) (int) (f_238_ + 0.5F) - f_239_;
				f_239_ -= f;
				f = (float) (((Class121) this).anIntArray1506
					     [(int) f]);
				while (--f_239_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, i, 0, (int) f_240_,
					       (int) f_241_, f_243_, f_256_);
				    f_241_ += f_254_;
				    f_240_ += f_252_;
				    f_243_ += f_257_;
				    f += (float) ((Class121) this).anInt1517;
				}
				while (--f_238_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f, i, 0, (int) f_240_,
					       (int) f_242_, f_243_, f_256_);
				    f_242_ += f_253_;
				    f_240_ += f_252_;
				    f_243_ += f_257_;
				    f += (float) ((Class121) this).anInt1517;
				}
			    }
			}
		    }
		} else if (f_238_ <= f_239_) {
		    if (!(f_238_ >= (float) ((Class121) this).anInt1520)) {
			if (f_239_ > (float) ((Class121) this).anInt1520)
			    f_239_ = (float) ((Class121) this).anInt1520;
			if (f > (float) ((Class121) this).anInt1520)
			    f = (float) ((Class121) this).anInt1520;
			f_244_ = f_244_ - f_256_ * f_241_ + f_256_;
			if (f_239_ < f) {
			    f_240_ = f_241_;
			    if (f_238_ < 0.0F) {
				f_240_ -= f_252_ * f_238_;
				f_241_ -= f_253_ * f_238_;
				f_244_ -= f_257_ * f_238_;
				f_238_ = 0.0F;
			    }
			    if (f_239_ < 0.0F) {
				f_242_ -= f_254_ * f_239_;
				f_239_ = 0.0F;
			    }
			    if (f_238_ != f_239_ && f_252_ < f_253_
				|| f_238_ == f_239_ && f_252_ > f_254_) {
				f_238_ += 0.5F;
				f_239_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_239_;
				f_239_ -= f_238_;
				f_238_
				    = (float) (((Class121) this).anIntArray1506
					       [(int) f_238_]);
				while (--f_239_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_238_, i, 0,
					       (int) f_240_, (int) f_241_,
					       f_244_, f_256_);
				    f_240_ += f_252_;
				    f_241_ += f_253_;
				    f_244_ += f_257_;
				    f_238_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_238_, i, 0,
					       (int) f_240_, (int) f_242_,
					       f_244_, f_256_);
				    f_240_ += f_252_;
				    f_242_ += f_254_;
				    f_244_ += f_257_;
				    f_238_
					+= (float) ((Class121) this).anInt1517;
				}
			    } else {
				f_238_ += 0.5F;
				f_239_ += 0.5F;
				f = (float) (int) (f + 0.5F) - f_239_;
				f_239_ -= f_238_;
				f_238_
				    = (float) (((Class121) this).anIntArray1506
					       [(int) f_238_]);
				while (--f_239_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_238_, i, 0,
					       (int) f_241_, (int) f_240_,
					       f_244_, f_256_);
				    f_240_ += f_252_;
				    f_241_ += f_253_;
				    f_244_ += f_257_;
				    f_238_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_238_, i, 0,
					       (int) f_242_, (int) f_240_,
					       f_244_, f_256_);
				    f_240_ += f_252_;
				    f_242_ += f_254_;
				    f_244_ += f_257_;
				    f_238_
					+= (float) ((Class121) this).anInt1517;
				}
			    }
			} else {
			    f_242_ = f_241_;
			    if (f_238_ < 0.0F) {
				f_242_ -= f_252_ * f_238_;
				f_241_ -= f_253_ * f_238_;
				f_244_ -= f_257_ * f_238_;
				f_238_ = 0.0F;
			    }
			    if (f < 0.0F) {
				f_240_ -= f_254_ * f;
				f = 0.0F;
			    }
			    if (f_252_ < f_253_) {
				f_238_ += 0.5F;
				f += 0.5F;
				f_239_ = (float) (int) (f_239_ + 0.5F) - f;
				f -= f_238_;
				f_238_
				    = (float) (((Class121) this).anIntArray1506
					       [(int) f_238_]);
				while (--f >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_238_, i, 0,
					       (int) f_242_, (int) f_241_,
					       f_244_, f_256_);
				    f_242_ += f_252_;
				    f_241_ += f_253_;
				    f_244_ += f_257_;
				    f_238_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f_239_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_238_, i, 0,
					       (int) f_240_, (int) f_241_,
					       f_244_, f_256_);
				    f_240_ += f_254_;
				    f_241_ += f_253_;
				    f_244_ += f_257_;
				    f_238_
					+= (float) ((Class121) this).anInt1517;
				}
			    } else {
				f_238_ += 0.5F;
				f += 0.5F;
				f_239_ = (float) (int) (f_239_ + 0.5F) - f;
				f -= f_238_;
				f_238_
				    = (float) (((Class121) this).anIntArray1506
					       [(int) f_238_]);
				while (--f >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_238_, i, 0,
					       (int) f_241_, (int) f_242_,
					       f_244_, f_256_);
				    f_242_ += f_252_;
				    f_241_ += f_253_;
				    f_244_ += f_257_;
				    f_238_
					+= (float) ((Class121) this).anInt1517;
				}
				while (--f_239_ >= 0.0F) {
				    method1579(bool, bool_236_, bool_237_,
					       (((Class121) this)
						.anIntArray1518),
					       (int) f_238_, i, 0,
					       (int) f_241_, (int) f_240_,
					       f_244_, f_256_);
				    f_240_ += f_254_;
				    f_241_ += f_253_;
				    f_244_ += f_257_;
				    f_238_
					+= (float) ((Class121) this).anInt1517;
				}
			    }
			}
		    }
		} else if (!(f_239_ >= (float) ((Class121) this).anInt1520)) {
		    if (f > (float) ((Class121) this).anInt1520)
			f = (float) ((Class121) this).anInt1520;
		    if (f_238_ > (float) ((Class121) this).anInt1520)
			f_238_ = (float) ((Class121) this).anInt1520;
		    f_245_ = f_245_ - f_256_ * f_242_ + f_256_;
		    if (f < f_238_) {
			f_241_ = f_242_;
			if (f_239_ < 0.0F) {
			    f_241_ -= f_253_ * f_239_;
			    f_242_ -= f_254_ * f_239_;
			    f_245_ -= f_257_ * f_239_;
			    f_239_ = 0.0F;
			}
			if (f < 0.0F) {
			    f_240_ -= f_252_ * f;
			    f = 0.0F;
			}
			if (f_253_ < f_254_) {
			    f_239_ += 0.5F;
			    f += 0.5F;
			    f_238_ = (float) (int) (f_238_ + 0.5F) - f;
			    f -= f_239_;
			    f_239_ = (float) (((Class121) this).anIntArray1506
					      [(int) f_239_]);
			    while (--f >= 0.0F) {
				method1579(bool, bool_236_, bool_237_,
					   ((Class121) this).anIntArray1518,
					   (int) f_239_, i, 0, (int) f_241_,
					   (int) f_242_, f_245_, f_256_);
				f_241_ += f_253_;
				f_242_ += f_254_;
				f_245_ += f_257_;
				f_239_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f_238_ >= 0.0F) {
				method1579(bool, bool_236_, bool_237_,
					   ((Class121) this).anIntArray1518,
					   (int) f_239_, i, 0, (int) f_241_,
					   (int) f_240_, f_245_, f_256_);
				f_241_ += f_253_;
				f_240_ += f_252_;
				f_245_ += f_257_;
				f_239_ += (float) ((Class121) this).anInt1517;
			    }
			} else {
			    f_239_ += 0.5F;
			    f += 0.5F;
			    f_238_ = (float) (int) (f_238_ + 0.5F) - f;
			    f -= f_239_;
			    f_239_ = (float) (((Class121) this).anIntArray1506
					      [(int) f_239_]);
			    while (--f >= 0.0F) {
				method1579(bool, bool_236_, bool_237_,
					   ((Class121) this).anIntArray1518,
					   (int) f_239_, i, 0, (int) f_242_,
					   (int) f_241_, f_245_, f_256_);
				f_241_ += f_253_;
				f_242_ += f_254_;
				f_245_ += f_257_;
				f_239_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f_238_ >= 0.0F) {
				method1579(bool, bool_236_, bool_237_,
					   ((Class121) this).anIntArray1518,
					   (int) f_239_, i, 0, (int) f_240_,
					   (int) f_241_, f_245_, f_256_);
				f_241_ += f_253_;
				f_240_ += f_252_;
				f_245_ += f_257_;
				f_239_ += (float) ((Class121) this).anInt1517;
			    }
			}
		    } else {
			f_240_ = f_242_;
			if (f_239_ < 0.0F) {
			    f_240_ -= f_253_ * f_239_;
			    f_242_ -= f_254_ * f_239_;
			    f_245_ -= f_257_ * f_239_;
			    f_239_ = 0.0F;
			}
			if (f_238_ < 0.0F) {
			    f_241_ -= f_252_ * f_238_;
			    f_238_ = 0.0F;
			}
			if (f_253_ < f_254_) {
			    f_239_ += 0.5F;
			    f_238_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_238_;
			    f_238_ -= f_239_;
			    f_239_ = (float) (((Class121) this).anIntArray1506
					      [(int) f_239_]);
			    while (--f_238_ >= 0.0F) {
				method1579(bool, bool_236_, bool_237_,
					   ((Class121) this).anIntArray1518,
					   (int) f_239_, i, 0, (int) f_240_,
					   (int) f_242_, f_245_, f_256_);
				f_240_ += f_253_;
				f_242_ += f_254_;
				f_245_ += f_257_;
				f_239_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f >= 0.0F) {
				method1579(bool, bool_236_, bool_237_,
					   ((Class121) this).anIntArray1518,
					   (int) f_239_, i, 0, (int) f_241_,
					   (int) f_242_, f_245_, f_256_);
				f_241_ += f_252_;
				f_242_ += f_254_;
				f_245_ += f_257_;
				f_239_ += (float) ((Class121) this).anInt1517;
			    }
			} else {
			    f_239_ += 0.5F;
			    f_238_ += 0.5F;
			    f = (float) (int) (f + 0.5F) - f_238_;
			    f_238_ -= f_239_;
			    f_239_ = (float) (((Class121) this).anIntArray1506
					      [(int) f_239_]);
			    while (--f_238_ >= 0.0F) {
				method1579(bool, bool_236_, bool_237_,
					   ((Class121) this).anIntArray1518,
					   (int) f_239_, i, 0, (int) f_242_,
					   (int) f_240_, f_245_, f_256_);
				f_240_ += f_253_;
				f_242_ += f_254_;
				f_245_ += f_257_;
				f_239_ += (float) ((Class121) this).anInt1517;
			    }
			    while (--f >= 0.0F) {
				method1579(bool, bool_236_, bool_237_,
					   ((Class121) this).anIntArray1518,
					   (int) f_239_, i, 0, (int) f_242_,
					   (int) f_241_, f_245_, f_256_);
				f_241_ += f_252_;
				f_242_ += f_254_;
				f_245_ += f_257_;
				f_239_ += (float) ((Class121) this).anInt1517;
			    }
			}
		    }
		}
	    }
	}
    }
    
    final void method1583
	(boolean bool, boolean bool_258_, boolean bool_259_, float f,
	 float f_260_, float f_261_, float f_262_, float f_263_, float f_264_,
	 float f_265_, float f_266_, float f_267_, float f_268_, float f_269_,
	 float f_270_, float f_271_, float f_272_, float f_273_, float f_274_,
	 float f_275_, float f_276_, int i, int i_277_, int i_278_, int i_279_,
	 float f_280_, float f_281_, float f_282_, int i_283_) {
	if (!bool)
	    method1582(false, bool_258_, bool_259_, f, f_260_, f_261_, f_262_,
		       f_263_, f_264_, f_265_, f_266_, f_267_, 0);
	else {
	    int i_284_ = i_283_ & 0xffff;
	    if (i_284_ != ((Class121) this).anInt1521) {
		((Class121) this).anIntArray1522
		    = ((Class121) this).aClass173_Sub3_1509.method8926(i_284_);
		if (((Class121) this).anIntArray1522 == null) {
		    ((Class121) this).anInt1521 = -1;
		    ((Class121) this).anInt1526 = 255 - (i >> 24 & 0xff);
		    ((Class121) this).anInt1525 = 0;
		    int i_285_ = (Class72.anIntArray777
				  [Class516.method6283(((Class121) this)
							   .aClass173_Sub3_1509
							   .method8936(i_283_),
						       515814180) & 0xffff]);
		    int i_286_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_285_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_285_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_285_ & 0xff) >> 8);
		    method1580(true, bool_258_, bool_259_, f, f_260_, f_261_,
			       f_262_, f_263_, f_264_, f_265_, f_266_, f_267_,
			       Class405.method4873(i_286_, i_279_, f_280_,
						   2040829392),
			       Class405.method4873(i_286_, i_279_, f_281_,
						   2040829392),
			       Class405.method4873(i_286_, i_279_, f_282_,
						   2040829392));
		    return;
		}
		((Class121) this).anInt1521 = i_284_;
		((Class121) this).anInt1523
		    = ((Class121) this).aClass173_Sub3_1509.method8950(i_283_);
		((Class121) this).anInt1514 = ((Class121) this).anInt1523 - 1;
		((Class121) this).aClass583_1524
		    = ((Class121) this).aClass173_Sub3_1509.method8929(i_283_);
		((Class121) this).aBool1528
		    = ((Class121) this).aClass173_Sub3_1509.method8944(i_283_);
		((Class121) this).anInt1525
		    = (((Class121) this).aClass173_Sub3_1509.method8925(i_283_)
		       & 0xff);
	    }
	    ((Class121) this).anInt1531 = i_279_;
	    if (!(f <= f_260_) || !(f <= f_261_)) {
		if (f_260_ <= f_261_) {
		    float f_287_ = f_262_;
		    f_262_ = f_263_;
		    f_263_ = f_287_;
		    f_287_ = f;
		    f = f_260_;
		    f_260_ = f_287_;
		    f_287_ = f_265_;
		    f_265_ = f_266_;
		    f_266_ = f_287_;
		    f_287_ = f_271_;
		    f_271_ = f_272_;
		    f_272_ = f_287_;
		    f_287_ = f_274_;
		    f_274_ = f_275_;
		    f_275_ = f_287_;
		    f_287_ = f_268_;
		    f_268_ = f_269_;
		    f_269_ = f_287_;
		    f_287_ = f_280_;
		    f_280_ = f_281_;
		    f_281_ = f_287_;
		    int i_288_ = i;
		    i = i_277_;
		    i_277_ = i_288_;
		} else {
		    float f_289_ = f_262_;
		    f_262_ = f_264_;
		    f_264_ = f_289_;
		    f_289_ = f;
		    f = f_261_;
		    f_261_ = f_289_;
		    f_289_ = f_265_;
		    f_265_ = f_267_;
		    f_267_ = f_289_;
		    f_289_ = f_271_;
		    f_271_ = f_273_;
		    f_273_ = f_289_;
		    f_289_ = f_274_;
		    f_274_ = f_276_;
		    f_276_ = f_289_;
		    f_289_ = f_268_;
		    f_268_ = f_270_;
		    f_270_ = f_289_;
		    f_289_ = f_280_;
		    f_280_ = f_282_;
		    f_282_ = f_289_;
		    int i_290_ = i;
		    i = i_278_;
		    i_278_ = i_290_;
		}
	    }
	    f_271_ /= f_268_;
	    f_272_ /= f_269_;
	    f_273_ /= f_270_;
	    f_274_ /= f_268_;
	    f_275_ /= f_269_;
	    f_276_ /= f_270_;
	    f_265_ = 1.0F / f_265_;
	    f_266_ = 1.0F / f_266_;
	    f_267_ = 1.0F / f_267_;
	    f_268_ = 1.0F / f_268_;
	    f_269_ = 1.0F / f_269_;
	    f_270_ = 1.0F / f_270_;
	    float f_291_ = (float) (i >> 24 & 0xff);
	    float f_292_ = (float) (i_277_ >> 24 & 0xff);
	    float f_293_ = (float) (i_278_ >> 24 & 0xff);
	    float f_294_ = (float) (i >> 16 & 0xff);
	    float f_295_ = (float) (i_277_ >> 16 & 0xff);
	    float f_296_ = (float) (i_278_ >> 16 & 0xff);
	    float f_297_ = (float) (i >> 8 & 0xff);
	    float f_298_ = (float) (i_277_ >> 8 & 0xff);
	    float f_299_ = (float) (i_278_ >> 8 & 0xff);
	    float f_300_ = (float) (i & 0xff);
	    float f_301_ = (float) (i_277_ & 0xff);
	    float f_302_ = (float) (i_278_ & 0xff);
	    float f_303_ = 0.0F;
	    float f_304_ = 0.0F;
	    float f_305_ = 0.0F;
	    float f_306_ = 0.0F;
	    float f_307_ = 0.0F;
	    float f_308_ = 0.0F;
	    float f_309_ = 0.0F;
	    float f_310_ = 0.0F;
	    float f_311_ = 0.0F;
	    float f_312_ = 0.0F;
	    if (f_260_ != f) {
		float f_313_ = f_260_ - f;
		f_303_ = (f_263_ - f_262_) / f_313_;
		f_304_ = (f_266_ - f_265_) / f_313_;
		f_305_ = (f_269_ - f_268_) / f_313_;
		f_306_ = (f_272_ - f_271_) / f_313_;
		f_307_ = (f_275_ - f_274_) / f_313_;
		f_308_ = (f_281_ - f_280_) / f_313_;
		f_309_ = (f_292_ - f_291_) / f_313_;
		f_310_ = (f_295_ - f_294_) / f_313_;
		f_311_ = (f_298_ - f_297_) / f_313_;
		f_312_ = (f_301_ - f_300_) / f_313_;
	    }
	    float f_314_ = 0.0F;
	    float f_315_ = 0.0F;
	    float f_316_ = 0.0F;
	    float f_317_ = 0.0F;
	    float f_318_ = 0.0F;
	    float f_319_ = 0.0F;
	    float f_320_ = 0.0F;
	    float f_321_ = 0.0F;
	    float f_322_ = 0.0F;
	    float f_323_ = 0.0F;
	    if (f_261_ != f_260_) {
		float f_324_ = f_261_ - f_260_;
		f_314_ = (f_264_ - f_263_) / f_324_;
		f_315_ = (f_267_ - f_266_) / f_324_;
		f_316_ = (f_270_ - f_269_) / f_324_;
		f_317_ = (f_273_ - f_272_) / f_324_;
		f_318_ = (f_276_ - f_275_) / f_324_;
		f_319_ = (f_282_ - f_281_) / f_324_;
		f_320_ = (f_293_ - f_292_) / f_324_;
		f_321_ = (f_296_ - f_295_) / f_324_;
		f_322_ = (f_299_ - f_298_) / f_324_;
		f_323_ = (f_302_ - f_301_) / f_324_;
	    }
	    float f_325_ = 0.0F;
	    float f_326_ = 0.0F;
	    float f_327_ = 0.0F;
	    float f_328_ = 0.0F;
	    float f_329_ = 0.0F;
	    float f_330_ = 0.0F;
	    float f_331_ = 0.0F;
	    float f_332_ = 0.0F;
	    float f_333_ = 0.0F;
	    float f_334_ = 0.0F;
	    if (f != f_261_) {
		float f_335_ = f - f_261_;
		f_325_ = (f_262_ - f_264_) / f_335_;
		f_326_ = (f_265_ - f_267_) / f_335_;
		f_327_ = (f_268_ - f_270_) / f_335_;
		f_328_ = (f_271_ - f_273_) / f_335_;
		f_329_ = (f_274_ - f_276_) / f_335_;
		f_330_ = (f_280_ - f_282_) / f_335_;
		f_331_ = (f_291_ - f_293_) / f_335_;
		f_332_ = (f_294_ - f_296_) / f_335_;
		f_333_ = (f_297_ - f_299_) / f_335_;
		f_334_ = (f_300_ - f_302_) / f_335_;
	    }
	    if (!(f >= (float) ((Class121) this).anInt1520)) {
		if (f_260_ > (float) ((Class121) this).anInt1520)
		    f_260_ = (float) ((Class121) this).anInt1520;
		if (f_261_ > (float) ((Class121) this).anInt1520)
		    f_261_ = (float) ((Class121) this).anInt1520;
		if (f_260_ < f_261_) {
		    f_264_ = f_262_;
		    f_267_ = f_265_;
		    f_270_ = f_268_;
		    f_273_ = f_271_;
		    f_276_ = f_274_;
		    f_282_ = f_280_;
		    f_293_ = f_291_;
		    f_296_ = f_294_;
		    f_299_ = f_297_;
		    f_302_ = f_300_;
		    if (f < 0.0F) {
			f_262_ -= f_303_ * f;
			f_264_ -= f_325_ * f;
			f_265_ -= f_304_ * f;
			f_267_ -= f_326_ * f;
			f_268_ -= f_305_ * f;
			f_270_ -= f_327_ * f;
			f_271_ -= f_306_ * f;
			f_273_ -= f_328_ * f;
			f_274_ -= f_307_ * f;
			f_276_ -= f_329_ * f;
			f_280_ -= f_308_ * f;
			f_282_ -= f_330_ * f;
			f_291_ -= f_309_ * f;
			f_293_ -= f_331_ * f;
			f_294_ -= f_309_ * f;
			f_296_ -= f_331_ * f;
			f_297_ -= f_309_ * f;
			f_299_ -= f_331_ * f;
			f_300_ -= f_309_ * f;
			f_302_ -= f_331_ * f;
			f = 0.0F;
		    }
		    if (f_260_ < 0.0F) {
			f_263_ -= f_314_ * f_260_;
			f_266_ -= f_315_ * f_260_;
			f_269_ -= f_316_ * f_260_;
			f_272_ -= f_317_ * f_260_;
			f_275_ -= f_318_ * f_260_;
			f_281_ -= f_319_ * f_260_;
			f_292_ -= f_320_ * f_260_;
			f_295_ -= f_321_ * f_260_;
			f_298_ -= f_322_ * f_260_;
			f_301_ -= f_323_ * f_260_;
			f_260_ = 0.0F;
		    }
		    if (f != f_260_ && f_325_ < f_303_
			|| f == f_260_ && f_325_ > f_314_) {
			f += 0.5F;
			f_260_ += 0.5F;
			f_261_ = (float) (int) (f_261_ + 0.5F) - f_260_;
			f_260_ -= f;
			f = (float) ((Class121) this).anIntArray1506[(int) f];
			while (--f_260_ >= 0.0F) {
			    method1584(bool_258_, bool_259_,
				       ((Class121) this).anIntArray1518,
				       ((Class121) this).anIntArray1522,
				       (int) f, (int) f_264_, (int) f_262_,
				       f_267_, f_265_, f_270_, f_268_, f_273_,
				       f_271_, f_276_, f_274_, f_282_, f_280_,
				       f_293_, f_291_, f_296_, f_294_, f_299_,
				       f_297_, f_302_, f_300_);
			    f_262_ += f_303_;
			    f_264_ += f_325_;
			    f_265_ += f_304_;
			    f_267_ += f_326_;
			    f_268_ += f_305_;
			    f_270_ += f_327_;
			    f_271_ += f_306_;
			    f_273_ += f_328_;
			    f_274_ += f_307_;
			    f_276_ += f_329_;
			    f_280_ += f_308_;
			    f_282_ += f_330_;
			    f_291_ += f_309_;
			    f_293_ += f_331_;
			    f_294_ += f_310_;
			    f_296_ += f_332_;
			    f_297_ += f_311_;
			    f_299_ += f_333_;
			    f_300_ += f_312_;
			    f_302_ += f_334_;
			    f += (float) ((Class121) this).anInt1517;
			}
			while (--f_261_ >= 0.0F) {
			    method1584(bool_258_, bool_259_,
				       ((Class121) this).anIntArray1518,
				       ((Class121) this).anIntArray1522,
				       (int) f, (int) f_264_, (int) f_263_,
				       f_267_, f_266_, f_270_, f_269_, f_273_,
				       f_272_, f_276_, f_275_, f_282_, f_281_,
				       f_293_, f_292_, f_296_, f_295_, f_299_,
				       f_298_, f_302_, f_301_);
			    f_263_ += f_314_;
			    f_264_ += f_325_;
			    f_266_ += f_315_;
			    f_267_ += f_326_;
			    f_269_ += f_316_;
			    f_270_ += f_327_;
			    f_272_ += f_317_;
			    f_273_ += f_328_;
			    f_275_ += f_318_;
			    f_276_ += f_329_;
			    f_281_ += f_319_;
			    f_282_ += f_330_;
			    f_292_ += f_320_;
			    f_293_ += f_331_;
			    f_295_ += f_321_;
			    f_296_ += f_332_;
			    f_298_ += f_322_;
			    f_299_ += f_333_;
			    f_301_ += f_323_;
			    f_302_ += f_334_;
			    f += (float) ((Class121) this).anInt1517;
			}
		    } else {
			f += 0.5F;
			f_260_ += 0.5F;
			f_261_ = (float) (int) (f_261_ + 0.5F) - f_260_;
			f_260_ -= f;
			f = (float) ((Class121) this).anIntArray1506[(int) f];
			while (--f_260_ >= 0.0F) {
			    method1584(bool_258_, bool_259_,
				       ((Class121) this).anIntArray1518,
				       ((Class121) this).anIntArray1522,
				       (int) f, (int) f_262_, (int) f_264_,
				       f_265_, f_267_, f_268_, f_270_, f_271_,
				       f_273_, f_274_, f_276_, f_280_, f_282_,
				       f_291_, f_293_, f_294_, f_296_, f_297_,
				       f_299_, f_300_, f_302_);
			    f_262_ += f_303_;
			    f_264_ += f_325_;
			    f_265_ += f_304_;
			    f_267_ += f_326_;
			    f_268_ += f_305_;
			    f_270_ += f_327_;
			    f_271_ += f_306_;
			    f_273_ += f_328_;
			    f_274_ += f_307_;
			    f_276_ += f_329_;
			    f_280_ += f_308_;
			    f_282_ += f_330_;
			    f_291_ += f_309_;
			    f_293_ += f_331_;
			    f_294_ += f_310_;
			    f_296_ += f_332_;
			    f_297_ += f_311_;
			    f_299_ += f_333_;
			    f_300_ += f_312_;
			    f_302_ += f_334_;
			    f += (float) ((Class121) this).anInt1517;
			}
			while (--f_261_ >= 0.0F) {
			    method1584(bool_258_, bool_259_,
				       ((Class121) this).anIntArray1518,
				       ((Class121) this).anIntArray1522,
				       (int) f, (int) f_263_, (int) f_264_,
				       f_266_, f_267_, f_269_, f_270_, f_272_,
				       f_273_, f_275_, f_276_, f_281_, f_282_,
				       f_292_, f_293_, f_295_, f_296_, f_298_,
				       f_299_, f_301_, f_302_);
			    f_263_ += f_314_;
			    f_264_ += f_325_;
			    f_266_ += f_315_;
			    f_267_ += f_326_;
			    f_269_ += f_316_;
			    f_270_ += f_327_;
			    f_272_ += f_317_;
			    f_273_ += f_328_;
			    f_275_ += f_318_;
			    f_276_ += f_329_;
			    f_281_ += f_319_;
			    f_282_ += f_330_;
			    f_292_ += f_320_;
			    f_293_ += f_331_;
			    f_295_ += f_321_;
			    f_296_ += f_332_;
			    f_298_ += f_322_;
			    f_299_ += f_333_;
			    f_301_ += f_323_;
			    f_302_ += f_334_;
			    f += (float) ((Class121) this).anInt1517;
			}
		    }
		} else {
		    f_263_ = f_262_;
		    f_266_ = f_265_;
		    f_269_ = f_268_;
		    f_272_ = f_271_;
		    f_275_ = f_274_;
		    f_281_ = f_280_;
		    f_292_ = f_291_;
		    f_295_ = f_294_;
		    f_298_ = f_297_;
		    f_301_ = f_300_;
		    if (f < 0.0F) {
			f_262_ -= f_303_ * f;
			f_263_ -= f_325_ * f;
			f_265_ -= f_304_ * f;
			f_266_ -= f_326_ * f;
			f_268_ -= f_305_ * f;
			f_269_ -= f_327_ * f;
			f_271_ -= f_306_ * f;
			f_272_ -= f_328_ * f;
			f_274_ -= f_307_ * f;
			f_275_ -= f_329_ * f;
			f_280_ -= f_308_ * f;
			f_281_ -= f_330_ * f;
			f_291_ -= f_309_ * f;
			f_292_ -= f_331_ * f;
			f_294_ -= f_309_ * f;
			f_295_ -= f_331_ * f;
			f_297_ -= f_309_ * f;
			f_298_ -= f_331_ * f;
			f_300_ -= f_309_ * f;
			f_301_ -= f_331_ * f;
			f = 0.0F;
		    }
		    if (f_261_ < 0.0F) {
			f_264_ -= f_314_ * f_261_;
			f_267_ -= f_315_ * f_261_;
			f_270_ -= f_316_ * f_261_;
			f_273_ -= f_317_ * f_261_;
			f_276_ -= f_318_ * f_261_;
			f_282_ -= f_319_ * f_261_;
			f_293_ -= f_320_ * f_261_;
			f_296_ -= f_321_ * f_261_;
			f_299_ -= f_322_ * f_261_;
			f_302_ -= f_323_ * f_261_;
			f_261_ = 0.0F;
		    }
		    if (f != f_261_ && f_325_ < f_303_
			|| f == f_261_ && f_314_ > f_303_) {
			f += 0.5F;
			f_261_ += 0.5F;
			f_260_ = (float) (int) (f_260_ + 0.5F) - f_261_;
			f_261_ -= f;
			f = (float) ((Class121) this).anIntArray1506[(int) f];
			while (--f_261_ >= 0.0F) {
			    method1584(bool_258_, bool_259_,
				       ((Class121) this).anIntArray1518,
				       ((Class121) this).anIntArray1522,
				       (int) f, (int) f_263_, (int) f_262_,
				       f_266_, f_265_, f_269_, f_268_, f_272_,
				       f_271_, f_275_, f_274_, f_281_, f_280_,
				       f_292_, f_291_, f_295_, f_294_, f_298_,
				       f_297_, f_301_, f_300_);
			    f_262_ += f_303_;
			    f_263_ += f_325_;
			    f_265_ += f_304_;
			    f_266_ += f_326_;
			    f_268_ += f_305_;
			    f_269_ += f_327_;
			    f_271_ += f_306_;
			    f_272_ += f_328_;
			    f_274_ += f_307_;
			    f_275_ += f_329_;
			    f_280_ += f_308_;
			    f_281_ += f_330_;
			    f_291_ += f_309_;
			    f_292_ += f_331_;
			    f_294_ += f_310_;
			    f_295_ += f_332_;
			    f_297_ += f_311_;
			    f_298_ += f_333_;
			    f_300_ += f_312_;
			    f_301_ += f_334_;
			    f += (float) ((Class121) this).anInt1517;
			}
			while (--f_260_ >= 0.0F) {
			    method1584(bool_258_, bool_259_,
				       ((Class121) this).anIntArray1518,
				       ((Class121) this).anIntArray1522,
				       (int) f, (int) f_264_, (int) f_262_,
				       f_267_, f_265_, f_270_, f_268_, f_273_,
				       f_271_, f_276_, f_274_, f_282_, f_280_,
				       f_293_, f_291_, f_296_, f_294_, f_299_,
				       f_297_, f_302_, f_300_);
			    f_264_ += f_314_;
			    f_262_ += f_303_;
			    f_267_ += f_315_;
			    f_265_ += f_304_;
			    f_270_ += f_316_;
			    f_268_ += f_305_;
			    f_273_ += f_317_;
			    f_271_ += f_306_;
			    f_276_ += f_318_;
			    f_274_ += f_307_;
			    f_282_ += f_319_;
			    f_280_ += f_308_;
			    f_293_ += f_320_;
			    f_291_ += f_309_;
			    f_296_ += f_321_;
			    f_294_ += f_310_;
			    f_299_ += f_322_;
			    f_297_ += f_311_;
			    f_302_ += f_323_;
			    f_300_ += f_312_;
			    f += (float) ((Class121) this).anInt1517;
			}
		    } else {
			f += 0.5F;
			f_261_ += 0.5F;
			f_260_ = (float) (int) (f_260_ + 0.5F) - f_261_;
			f_261_ -= f;
			f = (float) ((Class121) this).anIntArray1506[(int) f];
			while (--f_261_ >= 0.0F) {
			    method1584(bool_258_, bool_259_,
				       ((Class121) this).anIntArray1518,
				       ((Class121) this).anIntArray1522,
				       (int) f, (int) f_262_, (int) f_263_,
				       f_265_, f_266_, f_268_, f_269_, f_271_,
				       f_272_, f_274_, f_275_, f_280_, f_281_,
				       f_291_, f_292_, f_294_, f_295_, f_297_,
				       f_298_, f_300_, f_301_);
			    f_263_ += f_325_;
			    f_262_ += f_303_;
			    f_266_ += f_326_;
			    f_265_ += f_304_;
			    f_269_ += f_327_;
			    f_268_ += f_305_;
			    f_272_ += f_328_;
			    f_271_ += f_306_;
			    f_275_ += f_329_;
			    f_274_ += f_307_;
			    f_281_ += f_330_;
			    f_280_ += f_308_;
			    f_292_ += f_331_;
			    f_291_ += f_309_;
			    f_295_ += f_332_;
			    f_294_ += f_310_;
			    f_298_ += f_333_;
			    f_297_ += f_311_;
			    f_301_ += f_334_;
			    f_300_ += f_312_;
			    f += (float) ((Class121) this).anInt1517;
			}
			while (--f_260_ >= 0.0F) {
			    method1584(bool_258_, bool_259_,
				       ((Class121) this).anIntArray1518,
				       ((Class121) this).anIntArray1522,
				       (int) f, (int) f_262_, (int) f_264_,
				       f_265_, f_267_, f_268_, f_270_, f_271_,
				       f_273_, f_274_, f_276_, f_280_, f_282_,
				       f_291_, f_293_, f_294_, f_296_, f_297_,
				       f_299_, f_300_, f_302_);
			    f_262_ += f_303_;
			    f_264_ += f_314_;
			    f_265_ += f_304_;
			    f_267_ += f_315_;
			    f_268_ += f_305_;
			    f_270_ += f_316_;
			    f_271_ += f_306_;
			    f_273_ += f_317_;
			    f_274_ += f_307_;
			    f_276_ += f_318_;
			    f_280_ += f_308_;
			    f_282_ += f_319_;
			    f_291_ += f_309_;
			    f_293_ += f_320_;
			    f_294_ += f_310_;
			    f_296_ += f_321_;
			    f_297_ += f_311_;
			    f_299_ += f_322_;
			    f_300_ += f_312_;
			    f_302_ += f_323_;
			    f += (float) ((Class121) this).anInt1517;
			}
		    }
		}
	    }
	}
    }
    
    final void method1584
	(boolean bool, boolean bool_336_, int[] is, int[] is_337_, int i,
	 int i_338_, int i_339_, float f, float f_340_, float f_341_,
	 float f_342_, float f_343_, float f_344_, float f_345_, float f_346_,
	 float f_347_, float f_348_, float f_349_, float f_350_, float f_351_,
	 float f_352_, float f_353_, float f_354_, float f_355_,
	 float f_356_) {
	int i_357_ = i_339_ - i_338_;
	float f_358_ = 1.0F / (float) i_357_;
	float f_359_ = (f_340_ - f) * f_358_;
	float f_360_ = (f_342_ - f_341_) * f_358_;
	float f_361_ = (f_344_ - f_343_) * f_358_;
	float f_362_ = (f_346_ - f_345_) * f_358_;
	float f_363_ = (f_348_ - f_347_) * f_358_;
	float f_364_ = (f_350_ - f_349_) * f_358_;
	float f_365_ = (f_352_ - f_351_) * f_358_;
	float f_366_ = (f_354_ - f_353_) * f_358_;
	float f_367_ = (f_356_ - f_355_) * f_358_;
	if (((Class121) this).aBool1504) {
	    if (i_339_ > ((Class121) this).anInt1513)
		i_339_ = ((Class121) this).anInt1513;
	    if (i_338_ < 0) {
		f -= f_359_ * (float) i_338_;
		f_341_ -= f_360_ * (float) i_338_;
		f_343_ -= f_361_ * (float) i_338_;
		f_345_ -= f_362_ * (float) i_338_;
		f_347_ -= f_363_ * (float) i_338_;
		f_349_ -= f_364_ * (float) i_338_;
		f_351_ -= f_365_ * (float) i_338_;
		f_353_ -= f_366_ * (float) i_338_;
		f_355_ -= f_367_ * (float) i_338_;
		i_338_ = 0;
	    }
	}
	if (i_338_ < i_339_) {
	    i_357_ = i_339_ - i_338_;
	    i += i_338_;
	    while (i_357_-- > 0) {
		float f_368_ = 1.0F / f;
		float f_369_ = 1.0F / f_341_;
		if (!bool || f_368_ < ((Class121) this).aFloatArray1519[i]) {
		    int i_370_ = (int) (f_343_ * f_369_
					* (float) ((Class121) this).anInt1523);
		    if (((Class121) this).aBool1528)
			i_370_ &= ((Class121) this).anInt1514;
		    else if (i_370_ < 0)
			i_370_ = 0;
		    else if (i_370_ > ((Class121) this).anInt1514)
			i_370_ = ((Class121) this).anInt1514;
		    int i_371_ = (int) (f_345_ * f_369_
					* (float) ((Class121) this).anInt1523);
		    if (((Class121) this).aBool1528)
			i_371_ &= ((Class121) this).anInt1514;
		    else if (i_371_ < 0)
			i_371_ = 0;
		    else if (i_371_ > ((Class121) this).anInt1514)
			i_371_ = ((Class121) this).anInt1514;
		    int i_372_
			= (((Class121) this).anIntArray1522
			   [i_371_ * ((Class121) this).anInt1523 + i_370_]);
		    int i_373_ = 255;
		    if (((Class121) this).aClass583_1524
			== Class583.aClass583_7697)
			i_373_ = (int) ((float) (i_372_ >> 24 & 0xff) * f_349_
					/ 255.0F);
		    else if (((Class121) this).aClass583_1524
			     == Class583.aClass583_7696) {
			if ((i_372_ >> 24 & 0xff)
			    > ((Class121) this).anInt1525)
			    i_373_ = 255;
			else
			    i_373_ = 0;
		    } else
			i_373_ = (int) f_349_;
		    if (i_373_ != 0) {
			if (i_373_ != 255) {
			    int i_374_
				= (~0xffffff
				   | ((int) (f_351_ * (float) (i_372_ >> 16
							       & 0xff)) << 8
				      & 0xff0000)
				   | (int) (f_353_ * (float) (i_372_ >> 8
							      & 0xff)) & 0xff00
				   | ((int) (f_355_ * (float) (i_372_ & 0xff))
				      >> 8));
			    if (f_347_ != 0.0F) {
				int i_375_ = (int) (255.0F - f_347_);
				int i_376_
				    = (((((Class121) this).anInt1531
					 & 0xff00ff) * (int) f_347_ & ~0xff00ff
					| (((Class121) this).anInt1531
					   & 0xff00) * (int) f_347_ & 0xff0000)
				       >>> 8);
				i_374_ = ((((i_374_ & 0xff00ff) * i_375_
					    & ~0xff00ff)
					   | ((i_374_ & 0xff00) * i_375_
					      & 0xff0000))
					  >>> 8) + i_376_;
			    }
			    int i_377_ = is[i];
			    int i_378_ = 255 - i_373_;
			    i_374_ = ((((i_377_ & 0xff00ff) * i_378_
					+ (i_374_ & 0xff00ff) * i_373_)
				       & ~0xff00ff)
				      + (((i_377_ & 0xff00) * i_378_
					  + (i_374_ & 0xff00) * i_373_)
					 & 0xff0000)) >> 8;
			    if (bool_336_)
				is[i] = (i_373_ | is[i] >> 24) << 24 | i_374_;
			    else
				is[i] = i_374_;
			    if (bool)
				((Class121) this).aFloatArray1519[i] = f_368_;
			} else {
			    int i_379_
				= (~0xffffff
				   | ((int) (f_351_ * (float) (i_372_ >> 16
							       & 0xff)) << 8
				      & 0xff0000)
				   | (int) (f_353_ * (float) (i_372_ >> 8
							      & 0xff)) & 0xff00
				   | ((int) (f_355_ * (float) (i_372_ & 0xff))
				      >> 8));
			    if (f_347_ != 0.0F) {
				int i_380_ = (int) (255.0F - f_347_);
				int i_381_
				    = (((((Class121) this).anInt1531
					 & 0xff00ff) * (int) f_347_ & ~0xff00ff
					| (((Class121) this).anInt1531
					   & 0xff00) * (int) f_347_ & 0xff0000)
				       >>> 8);
				i_379_ = ((((i_379_ & 0xff00ff) * i_380_
					    & ~0xff00ff)
					   | ((i_379_ & 0xff00) * i_380_
					      & 0xff0000))
					  >>> 8) + i_381_;
			    }
			    if (bool_336_)
				is[i] = i_373_ << 24 | i_379_;
			    else
				is[i] = i_379_;
			    if (bool)
				((Class121) this).aFloatArray1519[i] = f_368_;
			}
		    }
		}
		i++;
		f += f_359_;
		f_341_ += f_360_;
		f_343_ += f_361_;
		f_345_ += f_362_;
		f_347_ += f_363_;
		f_349_ += f_364_;
		f_351_ += f_365_;
		f_353_ += f_366_;
		f_355_ += f_367_;
	    }
	}
    }
    
    final void method1585
	(boolean bool, boolean bool_382_, boolean bool_383_, float f,
	 float f_384_, float f_385_, float f_386_, float f_387_, float f_388_,
	 float f_389_, float f_390_, float f_391_, float f_392_, float f_393_,
	 float f_394_, float f_395_, float f_396_, float f_397_, float f_398_,
	 float f_399_, float f_400_, int i, int i_401_, int i_402_, int i_403_,
	 float f_404_, float f_405_, float f_406_, int i_407_, float f_408_,
	 int i_409_, float f_410_, int i_411_, float f_412_) {
	if (!bool)
	    method1582(false, bool_382_, bool_383_, f, f_384_, f_385_, f_386_,
		       f_387_, f_388_, f_389_, f_390_, f_391_, 0);
	else {
	    ((Class121) this).anInt1531 = i_403_;
	    if (!(f <= f_384_) || !(f <= f_385_)) {
		if (f_384_ <= f_385_) {
		    float f_413_ = f_386_;
		    f_386_ = f_387_;
		    f_387_ = f_413_;
		    f_413_ = f;
		    f = f_384_;
		    f_384_ = f_413_;
		    f_413_ = f_389_;
		    f_389_ = f_390_;
		    f_390_ = f_413_;
		    f_413_ = f_395_;
		    f_395_ = f_396_;
		    f_396_ = f_413_;
		    f_413_ = f_398_;
		    f_398_ = f_399_;
		    f_399_ = f_413_;
		    f_413_ = f_392_;
		    f_392_ = f_393_;
		    f_393_ = f_413_;
		    f_413_ = f_404_;
		    f_404_ = f_405_;
		    f_405_ = f_413_;
		    f_413_ = f_408_;
		    f_408_ = f_410_;
		    f_410_ = f_413_;
		    int i_414_ = i;
		    i = i_401_;
		    i_401_ = i_414_;
		    i_414_ = i_407_;
		    i_407_ = i_409_;
		    i_409_ = i_414_;
		} else {
		    float f_415_ = f_386_;
		    f_386_ = f_388_;
		    f_388_ = f_415_;
		    f_415_ = f;
		    f = f_385_;
		    f_385_ = f_415_;
		    f_415_ = f_389_;
		    f_389_ = f_391_;
		    f_391_ = f_415_;
		    f_415_ = f_395_;
		    f_395_ = f_397_;
		    f_397_ = f_415_;
		    f_415_ = f_398_;
		    f_398_ = f_400_;
		    f_400_ = f_415_;
		    f_415_ = f_392_;
		    f_392_ = f_394_;
		    f_394_ = f_415_;
		    f_415_ = f_404_;
		    f_404_ = f_406_;
		    f_406_ = f_415_;
		    f_415_ = f_408_;
		    f_408_ = f_412_;
		    f_412_ = f_415_;
		    int i_416_ = i;
		    i = i_402_;
		    i_402_ = i_416_;
		    i_416_ = i_407_;
		    i_407_ = i_411_;
		    i_411_ = i_416_;
		}
	    }
	    int i_417_ = i_407_ & 0xffff;
	    int i_418_ = i_409_ & 0xffff;
	    int i_419_ = i_411_ & 0xffff;
	    if (i_417_ != ((Class121) this).anInt1521) {
		((Class121) this).anIntArray1522
		    = ((Class121) this).aClass173_Sub3_1509.method8926(i_417_);
		if (((Class121) this).anIntArray1522 == null) {
		    ((Class121) this).anInt1521 = -1;
		    ((Class121) this).anInt1526 = 255 - (i >> 24 & 0xff);
		    int i_420_ = (Class72.anIntArray777
				  [Class516.method6283(((Class121) this)
							   .aClass173_Sub3_1509
							   .method8936(i_407_),
						       515814180) & 0xffff]);
		    int i_421_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_420_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_420_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_420_ & 0xff) >> 8);
		    method1580(true, bool_382_, bool_383_, f, f_384_, f_385_,
			       f_386_, f_387_, f_388_, f_389_, f_390_, f_391_,
			       Class405.method4873(i_421_, i_403_, f_404_,
						   2040829392),
			       Class405.method4873(i_421_, i_403_, f_405_,
						   2040829392),
			       Class405.method4873(i_421_, i_403_, f_406_,
						   2040829392));
		    return;
		}
		((Class121) this).anInt1521 = i_417_;
		((Class121) this).anInt1523
		    = ((Class121) this).aClass173_Sub3_1509.method8950(i_407_);
		((Class121) this).anInt1514 = ((Class121) this).anInt1523 - 1;
		((Class121) this).aClass583_1524
		    = ((Class121) this).aClass173_Sub3_1509.method8929(i_407_);
	    }
	    ((Class121) this).aFloat1505 = f_408_;
	    if (i_418_ != ((Class121) this).anInt1529) {
		((Class121) this).anIntArray1530
		    = ((Class121) this).aClass173_Sub3_1509.method8926(i_418_);
		if (((Class121) this).anIntArray1530 == null) {
		    ((Class121) this).anInt1529 = -1;
		    ((Class121) this).anInt1526 = 255 - (i >> 24 & 0xff);
		    int i_422_ = (Class72.anIntArray777
				  [Class516.method6283(((Class121) this)
							   .aClass173_Sub3_1509
							   .method8936(i_409_),
						       515814180) & 0xffff]);
		    int i_423_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_422_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_422_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_422_ & 0xff) >> 8);
		    method1580(true, bool_382_, bool_383_, f, f_384_, f_385_,
			       f_386_, f_387_, f_388_, f_389_, f_390_, f_391_,
			       Class405.method4873(i_423_, i_403_, f_404_,
						   2040829392),
			       Class405.method4873(i_423_, i_403_, f_405_,
						   2040829392),
			       Class405.method4873(i_423_, i_403_, f_406_,
						   2040829392));
		    return;
		}
		((Class121) this).anInt1529 = i_418_;
		((Class121) this).anInt1533
		    = ((Class121) this).aClass173_Sub3_1509.method8950(i_409_);
		((Class121) this).anInt1532 = ((Class121) this).anInt1533 - 1;
	    }
	    ((Class121) this).aFloat1515 = f_410_;
	    if (i_419_ != ((Class121) this).anInt1534) {
		((Class121) this).anIntArray1535
		    = ((Class121) this).aClass173_Sub3_1509.method8926(i_419_);
		if (((Class121) this).anIntArray1535 == null) {
		    ((Class121) this).anInt1534 = -1;
		    ((Class121) this).anInt1526 = 255 - (i >> 24 & 0xff);
		    int i_424_ = (Class72.anIntArray777
				  [Class516.method6283(((Class121) this)
							   .aClass173_Sub3_1509
							   .method8936(i_411_),
						       515814180) & 0xffff]);
		    int i_425_
			= (~0xffffff
			   | ((i >> 16 & 0xff) * (i_424_ >> 16 & 0xff) << 8
			      & 0xff0000)
			   | (i >> 8 & 0xff) * (i_424_ >> 8 & 0xff) & 0xff00
			   | (i & 0xff) * (i_424_ & 0xff) >> 8);
		    method1580(true, bool_382_, bool_383_, (float) (int) f,
			       (float) (int) f_384_, (float) (int) f_385_,
			       (float) (int) f_386_, (float) (int) f_387_,
			       (float) (int) f_388_, (float) (int) f_389_,
			       (float) (int) f_390_, (float) (int) f_391_,
			       Class405.method4873(i_425_, i_403_, f_404_,
						   2040829392),
			       Class405.method4873(i_425_, i_403_, f_405_,
						   2040829392),
			       Class405.method4873(i_425_, i_403_, f_406_,
						   2040829392));
		    return;
		}
		((Class121) this).anInt1534 = i_419_;
		((Class121) this).anInt1536
		    = ((Class121) this).aClass173_Sub3_1509.method8950(i_411_);
		((Class121) this).anInt1527 = ((Class121) this).anInt1536 - 1;
	    }
	    ((Class121) this).aFloat1538 = f_412_;
	    f_395_ /= f_392_;
	    f_396_ /= f_393_;
	    f_397_ /= f_394_;
	    f_398_ /= f_392_;
	    f_399_ /= f_393_;
	    f_400_ /= f_394_;
	    f_389_ = 1.0F / f_389_;
	    f_390_ = 1.0F / f_390_;
	    f_391_ = 1.0F / f_391_;
	    f_392_ = 1.0F / f_392_;
	    f_393_ = 1.0F / f_393_;
	    f_394_ = 1.0F / f_394_;
	    float f_426_ = (float) (i >> 24 & 0xff);
	    float f_427_ = (float) (i_401_ >> 24 & 0xff);
	    float f_428_ = (float) (i_402_ >> 24 & 0xff);
	    float f_429_ = (float) (i >> 16 & 0xff);
	    float f_430_ = (float) (i_401_ >> 16 & 0xff);
	    float f_431_ = (float) (i_402_ >> 16 & 0xff);
	    float f_432_ = (float) (i >> 8 & 0xff);
	    float f_433_ = (float) (i_401_ >> 8 & 0xff);
	    float f_434_ = (float) (i_402_ >> 8 & 0xff);
	    float f_435_ = (float) (i & 0xff);
	    float f_436_ = (float) (i_401_ & 0xff);
	    float f_437_ = (float) (i_402_ & 0xff);
	    float f_438_ = 1.0F;
	    float f_439_ = 0.0F;
	    float f_440_ = 0.0F;
	    float f_441_ = 0.0F;
	    float f_442_ = 1.0F;
	    float f_443_ = 0.0F;
	    float f_444_ = 0.0F;
	    float f_445_ = 0.0F;
	    float f_446_ = 0.0F;
	    float f_447_ = 0.0F;
	    float f_448_ = 0.0F;
	    float f_449_ = 0.0F;
	    float f_450_ = 0.0F;
	    float f_451_ = 0.0F;
	    float f_452_ = 0.0F;
	    float f_453_ = 0.0F;
	    float f_454_ = 0.0F;
	    float f_455_ = 0.0F;
	    if (f_384_ != f) {
		float f_456_ = f_384_ - f;
		f_444_ = (f_387_ - f_386_) / f_456_;
		f_445_ = (f_390_ - f_389_) / f_456_;
		f_446_ = (f_393_ - f_392_) / f_456_;
		f_447_ = (f_396_ - f_395_) / f_456_;
		f_448_ = (f_399_ - f_398_) / f_456_;
		f_449_ = (f_405_ - f_404_) / f_456_;
		f_450_ = (f_427_ - f_426_) / f_456_;
		f_451_ = (f_430_ - f_429_) / f_456_;
		f_452_ = (f_433_ - f_432_) / f_456_;
		f_453_ = (f_436_ - f_435_) / f_456_;
		f_454_ = (f_439_ - f_438_) / f_456_;
		f_455_ = (f_442_ - f_441_) / f_456_;
	    }
	    float f_457_ = 0.0F;
	    float f_458_ = 0.0F;
	    float f_459_ = 0.0F;
	    float f_460_ = 0.0F;
	    float f_461_ = 0.0F;
	    float f_462_ = 0.0F;
	    float f_463_ = 0.0F;
	    float f_464_ = 0.0F;
	    float f_465_ = 0.0F;
	    float f_466_ = 0.0F;
	    float f_467_ = 0.0F;
	    float f_468_ = 0.0F;
	    if (f_385_ != f_384_) {
		float f_469_ = f_385_ - f_384_;
		f_457_ = (f_388_ - f_387_) / f_469_;
		f_458_ = (f_391_ - f_390_) / f_469_;
		f_459_ = (f_394_ - f_393_) / f_469_;
		f_460_ = (f_397_ - f_396_) / f_469_;
		f_461_ = (f_400_ - f_399_) / f_469_;
		f_462_ = (f_406_ - f_405_) / f_469_;
		f_463_ = (f_428_ - f_427_) / f_469_;
		f_464_ = (f_431_ - f_430_) / f_469_;
		f_465_ = (f_434_ - f_433_) / f_469_;
		f_466_ = (f_437_ - f_436_) / f_469_;
		f_467_ = (f_440_ - f_439_) / f_469_;
		f_468_ = (f_443_ - f_442_) / f_469_;
	    }
	    float f_470_ = 0.0F;
	    float f_471_ = 0.0F;
	    float f_472_ = 0.0F;
	    float f_473_ = 0.0F;
	    float f_474_ = 0.0F;
	    float f_475_ = 0.0F;
	    float f_476_ = 0.0F;
	    float f_477_ = 0.0F;
	    float f_478_ = 0.0F;
	    float f_479_ = 0.0F;
	    float f_480_ = 0.0F;
	    float f_481_ = 0.0F;
	    if (f != f_385_) {
		float f_482_ = f - f_385_;
		f_470_ = (f_386_ - f_388_) / f_482_;
		f_471_ = (f_389_ - f_391_) / f_482_;
		f_472_ = (f_392_ - f_394_) / f_482_;
		f_473_ = (f_395_ - f_397_) / f_482_;
		f_474_ = (f_398_ - f_400_) / f_482_;
		f_475_ = (f_404_ - f_406_) / f_482_;
		f_476_ = (f_426_ - f_428_) / f_482_;
		f_477_ = (f_429_ - f_431_) / f_482_;
		f_478_ = (f_432_ - f_434_) / f_482_;
		f_479_ = (f_435_ - f_437_) / f_482_;
		f_480_ = (f_438_ - f_440_) / f_482_;
		f_481_ = (f_441_ - f_443_) / f_482_;
	    }
	    if (!(f >= (float) ((Class121) this).anInt1520)) {
		if (f_384_ > (float) ((Class121) this).anInt1520)
		    f_384_ = (float) ((Class121) this).anInt1520;
		if (f_385_ > (float) ((Class121) this).anInt1520)
		    f_385_ = (float) ((Class121) this).anInt1520;
		if (f_384_ < f_385_) {
		    f_388_ = f_386_;
		    f_391_ = f_389_;
		    f_394_ = f_392_;
		    f_397_ = f_395_;
		    f_400_ = f_398_;
		    f_406_ = f_404_;
		    f_428_ = f_426_;
		    f_431_ = f_429_;
		    f_434_ = f_432_;
		    f_437_ = f_435_;
		    f_440_ = f_438_;
		    f_443_ = f_441_;
		    if (f < 0.0F) {
			f_386_ -= f_444_ * f;
			f_388_ -= f_470_ * f;
			f_389_ -= f_445_ * f;
			f_391_ -= f_471_ * f;
			f_392_ -= f_446_ * f;
			f_394_ -= f_472_ * f;
			f_395_ -= f_447_ * f;
			f_397_ -= f_473_ * f;
			f_398_ -= f_448_ * f;
			f_400_ -= f_474_ * f;
			f_404_ -= f_449_ * f;
			f_406_ -= f_475_ * f;
			f_426_ -= f_450_ * f;
			f_428_ -= f_476_ * f;
			f_429_ -= f_451_ * f;
			f_431_ -= f_477_ * f;
			f_432_ -= f_452_ * f;
			f_434_ -= f_478_ * f;
			f_435_ -= f_453_ * f;
			f_437_ -= f_479_ * f;
			f_438_ -= f_454_ * f;
			f_440_ -= f_480_ * f;
			f_441_ -= f_455_ * f;
			f_443_ -= f_481_ * f;
			f = 0.0F;
		    }
		    if (f_384_ < 0.0F) {
			f_387_ -= f_457_ * f_384_;
			f_390_ -= f_458_ * f_384_;
			f_393_ -= f_459_ * f_384_;
			f_396_ -= f_460_ * f_384_;
			f_399_ -= f_461_ * f_384_;
			f_405_ -= f_462_ * f_384_;
			f_427_ -= f_463_ * f_384_;
			f_430_ -= f_464_ * f_384_;
			f_433_ -= f_465_ * f_384_;
			f_436_ -= f_466_ * f_384_;
			f_439_ -= f_467_ * f_384_;
			f_442_ -= f_468_ * f_384_;
			f_384_ = 0.0F;
		    }
		    if (f != f_384_ && f_470_ < f_444_
			|| f == f_384_ && f_470_ > f_457_) {
			f += 0.5F;
			f_384_ += 0.5F;
			f_385_ = (float) (int) (f_385_ + 0.5F) - f_384_;
			f_384_ -= f;
			f = (float) ((Class121) this).anIntArray1506[(int) f];
			while (--f_384_ >= 0.0F) {
			    method1586(bool_382_, bool_383_,
				       ((Class121) this).anIntArray1518,
				       (int) f, (int) f_388_, (int) f_386_,
				       f_391_, f_389_, f_394_, f_392_, f_397_,
				       f_395_, f_400_, f_398_, f_406_, f_404_,
				       f_428_, f_426_, f_431_, f_429_, f_434_,
				       f_432_, f_437_, f_435_, f_440_, f_438_,
				       f_443_, f_441_);
			    f_386_ += f_444_;
			    f_388_ += f_470_;
			    f_389_ += f_445_;
			    f_391_ += f_471_;
			    f_392_ += f_446_;
			    f_394_ += f_472_;
			    f_395_ += f_447_;
			    f_397_ += f_473_;
			    f_398_ += f_448_;
			    f_400_ += f_474_;
			    f_404_ += f_449_;
			    f_406_ += f_475_;
			    f_426_ += f_450_;
			    f_428_ += f_476_;
			    f_429_ += f_451_;
			    f_431_ += f_477_;
			    f_432_ += f_452_;
			    f_434_ += f_478_;
			    f_435_ += f_453_;
			    f_437_ += f_479_;
			    f_438_ += f_454_;
			    f_440_ += f_480_;
			    f_441_ += f_455_;
			    f_443_ += f_481_;
			    f += (float) ((Class121) this).anInt1517;
			}
			while (--f_385_ >= 0.0F) {
			    method1586(bool_382_, bool_383_,
				       ((Class121) this).anIntArray1518,
				       (int) f, (int) f_388_, (int) f_387_,
				       f_391_, f_390_, f_394_, f_393_, f_397_,
				       f_396_, f_400_, f_399_, f_406_, f_405_,
				       f_428_, f_427_, f_431_, f_430_, f_434_,
				       f_433_, f_437_, f_436_, f_440_, f_439_,
				       f_443_, f_442_);
			    f_387_ += f_457_;
			    f_388_ += f_470_;
			    f_390_ += f_458_;
			    f_391_ += f_471_;
			    f_393_ += f_459_;
			    f_394_ += f_472_;
			    f_396_ += f_460_;
			    f_397_ += f_473_;
			    f_399_ += f_461_;
			    f_400_ += f_474_;
			    f_405_ += f_462_;
			    f_406_ += f_475_;
			    f_427_ += f_463_;
			    f_428_ += f_476_;
			    f_430_ += f_464_;
			    f_431_ += f_477_;
			    f_433_ += f_465_;
			    f_434_ += f_478_;
			    f_436_ += f_466_;
			    f_437_ += f_479_;
			    f_439_ += f_467_;
			    f_440_ += f_480_;
			    f_442_ += f_468_;
			    f_443_ += f_481_;
			    f += (float) ((Class121) this).anInt1517;
			}
		    } else {
			f += 0.5F;
			f_384_ += 0.5F;
			f_385_ = (float) (int) (f_385_ + 0.5F) - f_384_;
			f_384_ -= f;
			f = (float) ((Class121) this).anIntArray1506[(int) f];
			while (--f_384_ >= 0.0F) {
			    method1586(bool_382_, bool_383_,
				       ((Class121) this).anIntArray1518,
				       (int) f, (int) f_386_, (int) f_388_,
				       f_389_, f_391_, f_392_, f_394_, f_395_,
				       f_397_, f_398_, f_400_, f_404_, f_406_,
				       f_426_, f_428_, f_429_, f_431_, f_432_,
				       f_434_, f_435_, f_437_, f_438_, f_440_,
				       f_441_, f_443_);
			    f_386_ += f_444_;
			    f_388_ += f_470_;
			    f_389_ += f_445_;
			    f_391_ += f_471_;
			    f_392_ += f_446_;
			    f_394_ += f_472_;
			    f_395_ += f_447_;
			    f_397_ += f_473_;
			    f_398_ += f_448_;
			    f_400_ += f_474_;
			    f_404_ += f_449_;
			    f_406_ += f_475_;
			    f_426_ += f_450_;
			    f_428_ += f_476_;
			    f_429_ += f_451_;
			    f_431_ += f_477_;
			    f_432_ += f_452_;
			    f_434_ += f_478_;
			    f_435_ += f_453_;
			    f_437_ += f_479_;
			    f_438_ += f_454_;
			    f_440_ += f_480_;
			    f_441_ += f_455_;
			    f_443_ += f_481_;
			    f += (float) ((Class121) this).anInt1517;
			}
			while (--f_385_ >= 0.0F) {
			    method1586(bool_382_, bool_383_,
				       ((Class121) this).anIntArray1518,
				       (int) f, (int) f_387_, (int) f_388_,
				       f_390_, f_391_, f_393_, f_394_, f_396_,
				       f_397_, f_399_, f_400_, f_405_, f_406_,
				       f_427_, f_428_, f_430_, f_431_, f_433_,
				       f_434_, f_436_, f_437_, f_439_, f_440_,
				       f_442_, f_443_);
			    f_387_ += f_457_;
			    f_388_ += f_470_;
			    f_390_ += f_458_;
			    f_391_ += f_471_;
			    f_393_ += f_459_;
			    f_394_ += f_472_;
			    f_396_ += f_460_;
			    f_397_ += f_473_;
			    f_399_ += f_461_;
			    f_400_ += f_474_;
			    f_405_ += f_462_;
			    f_406_ += f_475_;
			    f_427_ += f_463_;
			    f_428_ += f_476_;
			    f_430_ += f_464_;
			    f_431_ += f_477_;
			    f_433_ += f_465_;
			    f_434_ += f_478_;
			    f_436_ += f_466_;
			    f_437_ += f_479_;
			    f_439_ += f_467_;
			    f_440_ += f_480_;
			    f_442_ += f_468_;
			    f_443_ += f_481_;
			    f += (float) ((Class121) this).anInt1517;
			}
		    }
		} else {
		    f_387_ = f_386_;
		    f_390_ = f_389_;
		    f_393_ = f_392_;
		    f_396_ = f_395_;
		    f_399_ = f_398_;
		    f_405_ = f_404_;
		    f_427_ = f_426_;
		    f_430_ = f_429_;
		    f_433_ = f_432_;
		    f_436_ = f_435_;
		    f_439_ = f_438_;
		    f_442_ = f_441_;
		    if (f < 0.0F) {
			f_386_ -= f_444_ * f;
			f_387_ -= f_470_ * f;
			f_389_ -= f_445_ * f;
			f_390_ -= f_471_ * f;
			f_392_ -= f_446_ * f;
			f_393_ -= f_472_ * f;
			f_395_ -= f_447_ * f;
			f_396_ -= f_473_ * f;
			f_398_ -= f_448_ * f;
			f_399_ -= f_474_ * f;
			f_404_ -= f_449_ * f;
			f_405_ -= f_475_ * f;
			f_426_ -= f_450_ * f;
			f_427_ -= f_476_ * f;
			f_429_ -= f_451_ * f;
			f_430_ -= f_477_ * f;
			f_432_ -= f_452_ * f;
			f_433_ -= f_478_ * f;
			f_435_ -= f_453_ * f;
			f_436_ -= f_479_ * f;
			f_438_ -= f_454_ * f;
			f_439_ -= f_480_ * f;
			f_441_ -= f_455_ * f;
			f_442_ -= f_481_ * f;
			f = 0.0F;
		    }
		    if (f_385_ < 0.0F) {
			f_388_ -= f_457_ * f_385_;
			f_391_ -= f_458_ * f_385_;
			f_394_ -= f_459_ * f_385_;
			f_397_ -= f_460_ * f_385_;
			f_400_ -= f_461_ * f_385_;
			f_406_ -= f_462_ * f_385_;
			f_428_ -= f_463_ * f_385_;
			f_431_ -= f_464_ * f_385_;
			f_434_ -= f_465_ * f_385_;
			f_437_ -= f_466_ * f_385_;
			f_440_ -= f_467_ * f_385_;
			f_443_ -= f_468_ * f_385_;
			f_385_ = 0.0F;
		    }
		    if (f != f_385_ && f_470_ < f_444_
			|| f == f_385_ && f_457_ > f_444_) {
			f += 0.5F;
			f_385_ += 0.5F;
			f_384_ = (float) (int) (f_384_ + 0.5F) - f_385_;
			f_385_ -= f;
			f = (float) ((Class121) this).anIntArray1506[(int) f];
			while (--f_385_ >= 0.0F) {
			    method1586(bool_382_, bool_383_,
				       ((Class121) this).anIntArray1518,
				       (int) f, (int) f_387_, (int) f_386_,
				       f_390_, f_389_, f_393_, f_392_, f_396_,
				       f_395_, f_399_, f_398_, f_405_, f_404_,
				       f_427_, f_426_, f_430_, f_429_, f_433_,
				       f_432_, f_436_, f_435_, f_439_, f_438_,
				       f_442_, f_441_);
			    f_386_ += f_444_;
			    f_387_ += f_470_;
			    f_389_ += f_445_;
			    f_390_ += f_471_;
			    f_392_ += f_446_;
			    f_393_ += f_472_;
			    f_395_ += f_447_;
			    f_396_ += f_473_;
			    f_398_ += f_448_;
			    f_399_ += f_474_;
			    f_404_ += f_449_;
			    f_405_ += f_475_;
			    f_426_ += f_450_;
			    f_427_ += f_476_;
			    f_429_ += f_451_;
			    f_430_ += f_477_;
			    f_432_ += f_452_;
			    f_433_ += f_478_;
			    f_435_ += f_453_;
			    f_436_ += f_479_;
			    f_438_ += f_454_;
			    f_439_ += f_480_;
			    f_441_ += f_455_;
			    f_442_ += f_481_;
			    f += (float) ((Class121) this).anInt1517;
			}
			while (--f_384_ >= 0.0F) {
			    method1586(bool_382_, bool_383_,
				       ((Class121) this).anIntArray1518,
				       (int) f, (int) f_388_, (int) f_386_,
				       f_391_, f_389_, f_394_, f_392_, f_397_,
				       f_395_, f_400_, f_398_, f_406_, f_404_,
				       f_428_, f_426_, f_431_, f_429_, f_434_,
				       f_432_, f_437_, f_435_, f_440_, f_438_,
				       f_443_, f_441_);
			    f_388_ += f_457_;
			    f_386_ += f_444_;
			    f_391_ += f_458_;
			    f_389_ += f_445_;
			    f_394_ += f_459_;
			    f_392_ += f_446_;
			    f_397_ += f_460_;
			    f_395_ += f_447_;
			    f_400_ += f_461_;
			    f_398_ += f_448_;
			    f_406_ += f_462_;
			    f_404_ += f_449_;
			    f_428_ += f_463_;
			    f_426_ += f_450_;
			    f_431_ += f_464_;
			    f_429_ += f_451_;
			    f_434_ += f_465_;
			    f_432_ += f_452_;
			    f_437_ += f_466_;
			    f_435_ += f_453_;
			    f_440_ += f_467_;
			    f_438_ += f_454_;
			    f_443_ += f_468_;
			    f_441_ += f_455_;
			    f += (float) ((Class121) this).anInt1517;
			}
		    } else {
			f += 0.5F;
			f_385_ += 0.5F;
			f_384_ = (float) (int) (f_384_ + 0.5F) - f_385_;
			f_385_ -= f;
			f = (float) ((Class121) this).anIntArray1506[(int) f];
			while (--f_385_ >= 0.0F) {
			    method1586(bool_382_, bool_383_,
				       ((Class121) this).anIntArray1518,
				       (int) f, (int) f_386_, (int) f_387_,
				       f_389_, f_390_, f_392_, f_393_, f_395_,
				       f_396_, f_398_, f_399_, f_404_, f_405_,
				       f_426_, f_427_, f_429_, f_430_, f_432_,
				       f_433_, f_435_, f_436_, f_438_, f_439_,
				       f_441_, f_442_);
			    f_387_ += f_470_;
			    f_386_ += f_444_;
			    f_390_ += f_471_;
			    f_389_ += f_445_;
			    f_393_ += f_472_;
			    f_392_ += f_446_;
			    f_396_ += f_473_;
			    f_395_ += f_447_;
			    f_399_ += f_474_;
			    f_398_ += f_448_;
			    f_405_ += f_475_;
			    f_404_ += f_449_;
			    f_427_ += f_476_;
			    f_426_ += f_450_;
			    f_430_ += f_477_;
			    f_429_ += f_451_;
			    f_433_ += f_478_;
			    f_432_ += f_452_;
			    f_436_ += f_479_;
			    f_435_ += f_453_;
			    f_439_ += f_480_;
			    f_438_ += f_454_;
			    f_442_ += f_481_;
			    f_441_ += f_455_;
			    f += (float) ((Class121) this).anInt1517;
			}
			while (--f_384_ >= 0.0F) {
			    method1586(bool_382_, bool_383_,
				       ((Class121) this).anIntArray1518,
				       (int) f, (int) f_386_, (int) f_388_,
				       f_389_, f_391_, f_392_, f_394_, f_395_,
				       f_397_, f_398_, f_400_, f_404_, f_406_,
				       f_426_, f_428_, f_429_, f_431_, f_432_,
				       f_434_, f_435_, f_437_, f_438_, f_440_,
				       f_441_, f_443_);
			    f_386_ += f_444_;
			    f_388_ += f_457_;
			    f_389_ += f_445_;
			    f_391_ += f_458_;
			    f_392_ += f_446_;
			    f_394_ += f_459_;
			    f_395_ += f_447_;
			    f_397_ += f_460_;
			    f_398_ += f_448_;
			    f_400_ += f_461_;
			    f_404_ += f_449_;
			    f_406_ += f_462_;
			    f_426_ += f_450_;
			    f_428_ += f_463_;
			    f_429_ += f_451_;
			    f_431_ += f_464_;
			    f_432_ += f_452_;
			    f_434_ += f_465_;
			    f_435_ += f_453_;
			    f_437_ += f_466_;
			    f_438_ += f_454_;
			    f_440_ += f_467_;
			    f_441_ += f_455_;
			    f_443_ += f_468_;
			    f += (float) ((Class121) this).anInt1517;
			}
		    }
		}
	    }
	}
    }
    
    final void method1586
	(boolean bool, boolean bool_483_, int[] is, int i, int i_484_,
	 int i_485_, float f, float f_486_, float f_487_, float f_488_,
	 float f_489_, float f_490_, float f_491_, float f_492_, float f_493_,
	 float f_494_, float f_495_, float f_496_, float f_497_, float f_498_,
	 float f_499_, float f_500_, float f_501_, float f_502_, float f_503_,
	 float f_504_, float f_505_, float f_506_) {
	int i_507_ = i_485_ - i_484_;
	float f_508_ = 1.0F / (float) i_507_;
	float f_509_ = (f_486_ - f) * f_508_;
	float f_510_ = (f_488_ - f_487_) * f_508_;
	float f_511_ = (f_490_ - f_489_) * f_508_;
	float f_512_ = (f_492_ - f_491_) * f_508_;
	float f_513_ = (f_494_ - f_493_) * f_508_;
	float f_514_ = (f_496_ - f_495_) * f_508_;
	float f_515_ = (f_498_ - f_497_) * f_508_;
	float f_516_ = (f_500_ - f_499_) * f_508_;
	float f_517_ = (f_502_ - f_501_) * f_508_;
	float f_518_ = (f_504_ - f_503_) * f_508_;
	float f_519_ = (f_506_ - f_505_) * f_508_;
	if (((Class121) this).aBool1504) {
	    if (i_485_ > ((Class121) this).anInt1513)
		i_485_ = ((Class121) this).anInt1513;
	    if (i_484_ < 0) {
		f -= f_509_ * (float) i_484_;
		f_487_ -= f_510_ * (float) i_484_;
		f_489_ -= f_511_ * (float) i_484_;
		f_491_ -= f_512_ * (float) i_484_;
		f_493_ -= f_513_ * (float) i_484_;
		f_495_ -= f_514_ * (float) i_484_;
		f_497_ -= f_515_ * (float) i_484_;
		f_499_ -= f_516_ * (float) i_484_;
		f_501_ -= f_517_ * (float) i_484_;
		f_503_ -= f_518_ * (float) i_484_;
		f_505_ -= f_519_ * (float) i_484_;
		i_484_ = 0;
	    }
	}
	if (i_484_ < i_485_) {
	    i_507_ = i_485_ - i_484_;
	    i += i_484_;
	    while (i_507_-- > 0) {
		float f_520_ = 1.0F / f;
		float f_521_ = 1.0F / f_487_;
		if (!bool || f_520_ < ((Class121) this).aFloatArray1519[i]) {
		    float f_522_ = f_489_ * f_521_;
		    float f_523_ = f_491_ * f_521_;
		    int i_524_
			= ((int) (f_522_ * (float) ((Class121) this).anInt1523
				  * ((Class121) this).aFloat1505)
			   & ((Class121) this).anInt1514);
		    int i_525_
			= ((int) (f_523_ * (float) ((Class121) this).anInt1523
				  * ((Class121) this).aFloat1505)
			   & ((Class121) this).anInt1514);
		    int i_526_
			= (((Class121) this).anIntArray1522
			   [i_525_ * ((Class121) this).anInt1523 + i_524_]);
		    i_524_
			= ((int) (f_522_ * (float) ((Class121) this).anInt1533
				  * ((Class121) this).aFloat1515)
			   & ((Class121) this).anInt1532);
		    i_525_
			= ((int) (f_523_ * (float) ((Class121) this).anInt1533
				  * ((Class121) this).aFloat1515)
			   & ((Class121) this).anInt1532);
		    int i_527_
			= (((Class121) this).anIntArray1530
			   [i_525_ * ((Class121) this).anInt1533 + i_524_]);
		    i_524_
			= ((int) (f_522_ * (float) ((Class121) this).anInt1536
				  * ((Class121) this).aFloat1538)
			   & ((Class121) this).anInt1527);
		    i_525_
			= ((int) (f_523_ * (float) ((Class121) this).anInt1536
				  * ((Class121) this).aFloat1538)
			   & ((Class121) this).anInt1527);
		    int i_528_
			= (((Class121) this).anIntArray1535
			   [i_525_ * ((Class121) this).anInt1536 + i_524_]);
		    float f_529_ = 1.0F - (f_503_ + f_505_);
		    i_526_
			= (~0xffffff
			   | ((int) (f_503_ * (float) (i_526_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_503_ * (float) (i_526_ >> 8 & 0xff)) << 8
			   | (int) (f_503_ * (float) (i_526_ & 0xff)));
		    i_527_
			= (~0xffffff
			   | ((int) (f_505_ * (float) (i_527_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_505_ * (float) (i_527_ >> 8 & 0xff)) << 8
			   | (int) (f_505_ * (float) (i_527_ & 0xff)));
		    i_528_
			= (~0xffffff
			   | ((int) (f_529_ * (float) (i_528_ >> 16 & 0xff))
			      << 16)
			   | (int) (f_529_ * (float) (i_528_ >> 8 & 0xff)) << 8
			   | (int) (f_529_ * (float) (i_528_ & 0xff)));
		    int i_530_ = i_526_ + i_527_ + i_528_;
		    int i_531_
			= (~0xffffff
			   | ((int) (f_497_ * (float) (i_530_ >> 16 & 0xff))
			      << 8) & 0xff0000
			   | ((int) (f_499_ * (float) (i_530_ >> 8 & 0xff))
			      & 0xff00)
			   | (int) (f_501_ * (float) (i_530_ & 0xff)) >> 8);
		    if (f_493_ != 0.0F) {
			int i_532_ = (int) (255.0F - f_493_);
			int i_533_ = (((((Class121) this).anInt1531
					& 0xff00ff) * (int) f_493_ & ~0xff00ff
				       | (((Class121) this).anInt1531
					  & 0xff00) * (int) f_493_ & 0xff0000)
				      >>> 8);
			i_531_ = (((i_531_ & 0xff00ff) * i_532_ & ~0xff00ff
				   | (i_531_ & 0xff00) * i_532_ & 0xff0000)
				  >>> 8) + i_533_;
		    }
		    if (bool_483_)
			is[i] = ((int) f_495_ | is[i] >> 24) << 24 | i_531_;
		    else
			is[i] = i_531_;
		    if (bool)
			((Class121) this).aFloatArray1519[i] = f_520_;
		}
		i++;
		f += f_509_;
		f_487_ += f_510_;
		f_489_ += f_511_;
		f_491_ += f_512_;
		f_493_ += f_513_;
		f_495_ += f_514_;
		f_497_ += f_515_;
		f_499_ += f_516_;
		f_501_ += f_517_;
		f_503_ += f_518_;
		f_505_ += f_519_;
	    }
	}
    }
    
    int method1587() {
	return (((Class121) this).anIntArray1506[0]
		% ((Class121) this).anInt1517);
    }
    
    int method1588() {
	return (((Class121) this).anIntArray1506[0]
		/ ((Class121) this).anInt1517);
    }
    
    int method1589() {
	return (((Class121) this).anIntArray1506[0]
		/ ((Class121) this).anInt1517);
    }
    
    final void method1590(boolean bool) {
	((Class121) this).aBool1500 = bool;
    }
    
    final void method1591(boolean bool) {
	((Class121) this).aBool1500 = bool;
    }
    
    final void method1592(boolean bool, boolean bool_534_, int[] is, int i,
			  int i_535_, int i_536_, int i_537_, int i_538_,
			  float f, float f_539_, float f_540_, float f_541_) {
	if (((Class121) this).aBool1504) {
	    if (i_538_ > ((Class121) this).anInt1513)
		i_538_ = ((Class121) this).anInt1513;
	    if (i_537_ < 0)
		i_537_ = 0;
	}
	if (i_537_ < i_538_) {
	    i += i_537_ - 1;
	    f += f_539_ * (float) i_537_;
	    f_540_ += f_541_ * (float) i_537_;
	    if (((Class107) ((Class121) this).aClass107_1516).aBool1344) {
		if (((Class121) this).aBool1501) {
		    i_536_ = i_538_ - i_537_ >> 2;
		    f_539_ *= 4.0F;
		    if (((Class121) this).anInt1526 == 0) {
			if (i_536_ > 0) {
			    do {
				i_535_
				    = Class72.anIntArray777[(int) f & 0xffff];
				f += f_539_;
				i++;
				if (!bool || f_540_ < (((Class121) this)
						       .aFloatArray1519[i])) {
				    is[i] = i_535_;
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f_540_;
				}
				f_540_ += f_541_;
				i++;
				if (!bool || f_540_ < (((Class121) this)
						       .aFloatArray1519[i])) {
				    is[i] = i_535_;
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f_540_;
				}
				f_540_ += f_541_;
				i++;
				if (!bool || f_540_ < (((Class121) this)
						       .aFloatArray1519[i])) {
				    is[i] = i_535_;
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f_540_;
				}
				f_540_ += f_541_;
				i++;
				if (!bool || f_540_ < (((Class121) this)
						       .aFloatArray1519[i])) {
				    is[i] = i_535_;
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f_540_;
				}
				f_540_ += f_541_;
			    } while (--i_536_ > 0);
			}
			i_536_ = i_538_ - i_537_ & 0x3;
			if (i_536_ > 0) {
			    i_535_ = Class72.anIntArray777[(int) f & 0xffff];
			    do {
				i++;
				if (!bool || f_540_ < (((Class121) this)
						       .aFloatArray1519[i])) {
				    is[i] = i_535_;
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f_540_;
				}
				f_540_ += f_541_;
			    } while (--i_536_ > 0);
			}
		    } else {
			int i_542_ = ((Class121) this).anInt1526;
			int i_543_ = 256 - ((Class121) this).anInt1526;
			if (i_536_ > 0) {
			    do {
				i_535_
				    = Class72.anIntArray777[(int) f & 0xffff];
				f += f_539_;
				i_535_ = (((i_535_ & 0xff00ff) * i_543_ >> 8
					   & 0xff00ff)
					  + ((i_535_ & 0xff00) * i_543_ >> 8
					     & 0xff00));
				i++;
				if (!bool || f_540_ < (((Class121) this)
						       .aFloatArray1519[i])) {
				    int i_544_ = is[i];
				    if (bool_534_)
					is[i] = ((i_543_ | i_544_ >> 24) << 24
						 | (i_535_
						    + (((i_544_ & 0xff00ff)
							* i_542_) >> 8
						       & 0xff00ff)
						    + (((i_544_ & 0xff00)
							* i_542_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_535_
					       + (((i_544_ & 0xff00ff) * i_542_
						   >> 8)
						  & 0xff00ff)
					       + (((i_544_ & 0xff00) * i_542_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f_540_;
				}
				f_540_ += f_541_;
				i++;
				if (!bool || f_540_ < (((Class121) this)
						       .aFloatArray1519[i])) {
				    int i_545_ = is[i];
				    if (bool_534_)
					is[i] = ((i_543_ | i_545_ >> 24) << 24
						 | (i_535_
						    + (((i_545_ & 0xff00ff)
							* i_542_) >> 8
						       & 0xff00ff)
						    + (((i_545_ & 0xff00)
							* i_542_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_535_
					       + (((i_545_ & 0xff00ff) * i_542_
						   >> 8)
						  & 0xff00ff)
					       + (((i_545_ & 0xff00) * i_542_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f_540_;
				}
				f_540_ += f_541_;
				i++;
				if (!bool || f_540_ < (((Class121) this)
						       .aFloatArray1519[i])) {
				    int i_546_ = is[i];
				    if (bool_534_)
					is[i] = ((i_543_ | i_546_ >> 24) << 24
						 | (i_535_
						    + (((i_546_ & 0xff00ff)
							* i_542_) >> 8
						       & 0xff00ff)
						    + (((i_546_ & 0xff00)
							* i_542_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_535_
					       + (((i_546_ & 0xff00ff) * i_542_
						   >> 8)
						  & 0xff00ff)
					       + (((i_546_ & 0xff00) * i_542_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f_540_;
				}
				f_540_ += f_541_;
				i++;
				if (!bool || f_540_ < (((Class121) this)
						       .aFloatArray1519[i])) {
				    int i_547_ = is[i];
				    if (bool_534_)
					is[i] = ((i_543_ | i_547_ >> 24) << 24
						 | (i_535_
						    + (((i_547_ & 0xff00ff)
							* i_542_) >> 8
						       & 0xff00ff)
						    + (((i_547_ & 0xff00)
							* i_542_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_535_
					       + (((i_547_ & 0xff00ff) * i_542_
						   >> 8)
						  & 0xff00ff)
					       + (((i_547_ & 0xff00) * i_542_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f_540_;
				}
				f_540_ += f_541_;
			    } while (--i_536_ > 0);
			}
			i_536_ = i_538_ - i_537_ & 0x3;
			if (i_536_ > 0) {
			    i_535_ = Class72.anIntArray777[(int) f & 0xffff];
			    i_535_ = (((i_535_ & 0xff00ff) * i_543_ >> 8
				       & 0xff00ff)
				      + ((i_535_ & 0xff00) * i_543_ >> 8
					 & 0xff00));
			    do {
				i++;
				if (!bool || f_540_ < (((Class121) this)
						       .aFloatArray1519[i])) {
				    int i_548_ = is[i];
				    if (bool_534_)
					is[i] = ((i_543_ | i_548_ >> 24) << 24
						 | (i_535_
						    + (((i_548_ & 0xff00ff)
							* i_542_) >> 8
						       & 0xff00ff)
						    + (((i_548_ & 0xff00)
							* i_542_) >> 8
						       & 0xff00)));
				    else
					is[i]
					    = (i_535_
					       + (((i_548_ & 0xff00ff) * i_542_
						   >> 8)
						  & 0xff00ff)
					       + (((i_548_ & 0xff00) * i_542_
						   >> 8)
						  & 0xff00));
				    if (bool)
					((Class121) this).aFloatArray1519[i]
					    = f_540_;
				}
				f_540_ += f_541_;
			    } while (--i_536_ > 0);
			}
		    }
		} else {
		    i_536_ = i_538_ - i_537_;
		    if (((Class121) this).anInt1526 == 0) {
			do {
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i])) {
				is[i]
				    = Class72.anIntArray777[(int) f & 0xffff];
				if (bool)
				    ((Class121) this).aFloatArray1519[i]
					= f_540_;
			    }
			    f_540_ += f_541_;
			    f += f_539_;
			} while (--i_536_ > 0);
		    } else {
			int i_549_ = ((Class121) this).anInt1526;
			int i_550_ = 256 - ((Class121) this).anInt1526;
			do {
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i])) {
				i_535_
				    = Class72.anIntArray777[(int) f & 0xffff];
				i_535_ = (((i_535_ & 0xff00ff) * i_550_ >> 8
					   & 0xff00ff)
					  + ((i_535_ & 0xff00) * i_550_ >> 8
					     & 0xff00));
				int i_551_ = is[i];
				if (bool_534_)
				    is[i]
					= ((i_550_ | i_551_ >> 24) << 24
					   | (i_535_
					      + (((i_551_ & 0xff00ff) * i_549_
						  >> 8)
						 & 0xff00ff)
					      + (((i_551_ & 0xff00) * i_549_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_535_
					   + ((i_551_ & 0xff00ff) * i_549_ >> 8
					      & 0xff00ff)
					   + ((i_551_ & 0xff00) * i_549_ >> 8
					      & 0xff00));
				if (bool)
				    ((Class121) this).aFloatArray1519[i]
					= f_540_;
			    }
			    f += f_539_;
			    f_540_ += f_541_;
			} while (--i_536_ > 0);
		    }
		}
	    } else if (((Class121) this).aBool1501) {
		i_536_ = i_538_ - i_537_ >> 2;
		f_539_ *= 4.0F;
		if (((Class121) this).anInt1526 == 0) {
		    if (i_536_ > 0) {
			do {
			    i_535_ = Class72.anIntArray777[(int) f & 0xffff];
			    f += f_539_;
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i]))
				is[i] = i_535_;
			    f_540_ += f_541_;
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i]))
				is[i] = i_535_;
			    f_540_ += f_541_;
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i]))
				is[i] = i_535_;
			    f_540_ += f_541_;
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i]))
				is[i] = i_535_;
			    f_540_ += f_541_;
			} while (--i_536_ > 0);
		    }
		    i_536_ = i_538_ - i_537_ & 0x3;
		    if (i_536_ > 0) {
			i_535_ = Class72.anIntArray777[(int) f & 0xffff];
			do {
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i]))
				is[i] = i_535_;
			    f_540_ += f_541_;
			} while (--i_536_ > 0);
		    }
		} else {
		    int i_552_ = ((Class121) this).anInt1526;
		    int i_553_ = 256 - ((Class121) this).anInt1526;
		    if (i_536_ > 0) {
			do {
			    i_535_ = Class72.anIntArray777[(int) f & 0xffff];
			    f += f_539_;
			    i_535_ = (((i_535_ & 0xff00ff) * i_553_ >> 8
				       & 0xff00ff)
				      + ((i_535_ & 0xff00) * i_553_ >> 8
					 & 0xff00));
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i])) {
				int i_554_ = is[i];
				if (bool_534_)
				    is[i]
					= ((i_553_ | i_554_ >> 24) << 24
					   | (i_535_
					      + (((i_554_ & 0xff00ff) * i_552_
						  >> 8)
						 & 0xff00ff)
					      + (((i_554_ & 0xff00) * i_552_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_535_
					   + ((i_554_ & 0xff00ff) * i_552_ >> 8
					      & 0xff00ff)
					   + ((i_554_ & 0xff00) * i_552_ >> 8
					      & 0xff00));
			    }
			    f_540_ += f_541_;
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i])) {
				int i_555_ = is[i];
				if (bool_534_)
				    is[i]
					= ((i_553_ | i_555_ >> 24) << 24
					   | (i_535_
					      + (((i_555_ & 0xff00ff) * i_552_
						  >> 8)
						 & 0xff00ff)
					      + (((i_555_ & 0xff00) * i_552_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_535_
					   + ((i_555_ & 0xff00ff) * i_552_ >> 8
					      & 0xff00ff)
					   + ((i_555_ & 0xff00) * i_552_ >> 8
					      & 0xff00));
			    }
			    f_540_ += f_541_;
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i])) {
				int i_556_ = is[i];
				if (bool_534_)
				    is[i]
					= ((i_553_ | i_556_ >> 24) << 24
					   | (i_535_
					      + (((i_556_ & 0xff00ff) * i_552_
						  >> 8)
						 & 0xff00ff)
					      + (((i_556_ & 0xff00) * i_552_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_535_
					   + ((i_556_ & 0xff00ff) * i_552_ >> 8
					      & 0xff00ff)
					   + ((i_556_ & 0xff00) * i_552_ >> 8
					      & 0xff00));
			    }
			    f_540_ += f_541_;
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i])) {
				int i_557_ = is[i];
				if (bool_534_)
				    is[i]
					= ((i_553_ | i_557_ >> 24) << 24
					   | (i_535_
					      + (((i_557_ & 0xff00ff) * i_552_
						  >> 8)
						 & 0xff00ff)
					      + (((i_557_ & 0xff00) * i_552_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_535_
					   + ((i_557_ & 0xff00ff) * i_552_ >> 8
					      & 0xff00ff)
					   + ((i_557_ & 0xff00) * i_552_ >> 8
					      & 0xff00));
			    }
			    f_540_ += f_541_;
			} while (--i_536_ > 0);
		    }
		    i_536_ = i_538_ - i_537_ & 0x3;
		    if (i_536_ > 0) {
			i_535_ = Class72.anIntArray777[(int) f & 0xffff];
			i_535_
			    = (((i_535_ & 0xff00ff) * i_553_ >> 8 & 0xff00ff)
			       + ((i_535_ & 0xff00) * i_553_ >> 8 & 0xff00));
			do {
			    i++;
			    if (!bool || f_540_ < (((Class121) this)
						   .aFloatArray1519[i])) {
				int i_558_ = is[i];
				if (bool_534_)
				    is[i]
					= ((i_553_ | i_558_ >> 24) << 24
					   | (i_535_
					      + (((i_558_ & 0xff00ff) * i_552_
						  >> 8)
						 & 0xff00ff)
					      + (((i_558_ & 0xff00) * i_552_
						  >> 8)
						 & 0xff00)));
				else
				    is[i]
					= (i_535_
					   + ((i_558_ & 0xff00ff) * i_552_ >> 8
					      & 0xff00ff)
					   + ((i_558_ & 0xff00) * i_552_ >> 8
					      & 0xff00));
			    }
			    f_540_ += f_541_;
			} while (--i_536_ > 0);
		    }
		}
	    } else {
		i_536_ = i_538_ - i_537_;
		if (((Class121) this).anInt1526 == 0) {
		    do {
			i++;
			if (!bool
			    || f_540_ < ((Class121) this).aFloatArray1519[i])
			    is[i] = Class72.anIntArray777[(int) f & 0xffff];
			f_540_ += f_541_;
			f += f_539_;
		    } while (--i_536_ > 0);
		} else {
		    int i_559_ = ((Class121) this).anInt1526;
		    int i_560_ = 256 - ((Class121) this).anInt1526;
		    do {
			i++;
			if (!bool
			    || f_540_ < ((Class121) this).aFloatArray1519[i]) {
			    i_535_ = Class72.anIntArray777[(int) f & 0xffff];
			    i_535_ = (((i_535_ & 0xff00ff) * i_560_ >> 8
				       & 0xff00ff)
				      + ((i_535_ & 0xff00) * i_560_ >> 8
					 & 0xff00));
			    int i_561_ = is[i];
			    if (bool_534_)
				is[i]
				    = ((i_560_ | i_561_ >> 24) << 24
				       | (i_535_
					  + ((i_561_ & 0xff00ff) * i_559_ >> 8
					     & 0xff00ff)
					  + ((i_561_ & 0xff00) * i_559_ >> 8
					     & 0xff00)));
			    else
				is[i] = (i_535_
					 + ((i_561_ & 0xff00ff) * i_559_ >> 8
					    & 0xff00ff)
					 + ((i_561_ & 0xff00) * i_559_ >> 8
					    & 0xff00));
			}
			f += f_539_;
			f_540_ += f_541_;
		    } while (--i_536_ > 0);
		}
	    }
	}
    }
    
    int method1593() {
	return (((Class121) this).anIntArray1506[0]
		% ((Class121) this).anInt1517);
    }
    
    Class121(Class173_Sub3 class173_sub3, Class107 class107) {
	((Class121) this).aBool1504 = false;
	((Class121) this).aBool1537 = false;
	((Class121) this).anIntArray1506 = new int[4096];
	((Class121) this).aFloat1511 = 0.0F;
	((Class121) this).aFloat1503 = 1.0F;
	((Class121) this).anInt1521 = -1;
	((Class121) this).anIntArray1522 = null;
	((Class121) this).anInt1523 = 0;
	((Class121) this).anInt1514 = 0;
	((Class121) this).aFloat1505 = 0.0F;
	((Class121) this).anInt1525 = 0;
	((Class121) this).aBool1528 = true;
	((Class121) this).anInt1529 = -1;
	((Class121) this).anIntArray1530 = null;
	((Class121) this).anInt1533 = 0;
	((Class121) this).anInt1532 = 0;
	((Class121) this).aFloat1515 = 0.0F;
	((Class121) this).anInt1534 = -1;
	((Class121) this).anIntArray1535 = null;
	((Class121) this).anInt1536 = 0;
	((Class121) this).anInt1527 = 0;
	((Class121) this).aFloat1538 = 0.0F;
	((Class121) this).aClass173_Sub3_1509 = class173_sub3;
	((Class121) this).aClass107_1516 = class107;
	((Class121) this).anInt1517
	    = (((Class173_Sub3) ((Class121) this).aClass173_Sub3_1509)
	       .anInt9735) * 111437289;
	((Class121) this).anIntArray1518
	    = (((Class173_Sub3) ((Class121) this).aClass173_Sub3_1509)
	       .anIntArray9719);
	((Class121) this).aFloatArray1519
	    = (((Class173_Sub3) ((Class121) this).aClass173_Sub3_1509)
	       .aFloatArray9716);
	((Class121) this).aClass583_1524 = Class583.aClass583_7695;
    }
}
