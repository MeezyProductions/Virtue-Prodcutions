/* Class545 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class545
{
    static final int anInt7381 = 2;
    static final int anInt7382 = 12;
    int anInt7383;
    static final int anInt7384 = 1;
    static final int anInt7385 = 39168;
    static final int anInt7386 = 8;
    int anInt7387 = 0;
    Class559 aClass559_7388;
    static final int anInt7389 = 2011;
    static final int anInt7390 = -2011;
    
    final boolean method6660(int[] is, int i, int i_0_, int i_1_, int i_2_,
			     int i_3_, int i_4_, int i_5_) {
	if (i_2_ > i_5_)
	    i_2_ = i_5_;
	if (i_1_ < 0)
	    i_1_ = 0;
	if (i_1_ >= i_2_)
	    return true;
	i += i_1_ - 1;
	i_0_ = i_2_ - i_1_ >> 2;
	i_3_ += i_4_ * i_1_;
	if (((Class545) this).anInt7383 == 1) {
	    ((Class545) this).anInt7387 += i_0_;
	    while (--i_0_ >= 0) {
		if (i_3_ < is[++i])
		    is[i] = i_3_;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    is[i] = i_3_;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    is[i] = i_3_;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    is[i] = i_3_;
		i_3_ += i_4_;
	    }
	    i_0_ = i_2_ - i_1_ & 0x3;
	    while (--i_0_ >= 0) {
		if (i_3_ < is[++i])
		    is[i] = i_3_;
		i_3_ += i_4_;
	    }
	} else {
	    i_3_ -= 39168;
	    while (--i_0_ >= 0) {
		if (i_3_ < is[++i])
		    return false;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    return false;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    return false;
		i_3_ += i_4_;
		if (i_3_ < is[++i])
		    return false;
		i_3_ += i_4_;
	    }
	    i_0_ = i_2_ - i_1_ & 0x3;
	    while (--i_0_ >= 0) {
		if (i_3_ < is[++i])
		    return false;
		i_3_ += i_4_;
	    }
	}
	return true;
    }
    
    Class545(Class559 class559) {
	((Class545) this).aClass559_7388 = class559;
    }
    
    final boolean method6661(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			     int i_10_, int i_11_, int i_12_, int i_13_) {
	if (i > 2011 || i_6_ > 2011 || i_7_ > 2011 || i_8_ > 2011
	    || i_9_ > 2011 || i_10_ > 2011)
	    return false;
	if (i < -2011 || i_6_ < -2011 || i_7_ < -2011 || i_8_ < -2011
	    || i_9_ < -2011 || i_10_ < -2011)
	    return false;
	if (((Class545) this).anInt7383 == 2) {
	    int i_14_
		= i_8_ + i * (((Class559) ((Class545) this).aClass559_7388)
			      .anInt7508);
	    if (i_14_ >= 0
		&& i_14_ < (((Class559) ((Class545) this).aClass559_7388)
			    .anIntArray7504).length
		&& ((i_11_ << 8) - 39168
		    < (((Class559) ((Class545) this).aClass559_7388)
		       .anIntArray7504[i_14_])))
		return false;
	    i_14_
		= i_9_ + i_6_ * (((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508);
	    if (i_14_ >= 0
		&& i_14_ < (((Class559) ((Class545) this).aClass559_7388)
			    .anIntArray7504).length
		&& ((i_12_ << 8) - 39168
		    < (((Class559) ((Class545) this).aClass559_7388)
		       .anIntArray7504[i_14_])))
		return false;
	    i_14_
		= i_10_ + i_7_ * (((Class559) ((Class545) this).aClass559_7388)
				  .anInt7508);
	    if (i_14_ >= 0
		&& i_14_ < (((Class559) ((Class545) this).aClass559_7388)
			    .anIntArray7504).length
		&& ((i_13_ << 8) - 39168
		    < (((Class559) ((Class545) this).aClass559_7388)
		       .anIntArray7504[i_14_])))
		return false;
	}
	int i_15_ = i_9_ - i_8_;
	int i_16_ = i_6_ - i;
	int i_17_ = i_10_ - i_8_;
	int i_18_ = i_7_ - i;
	int i_19_ = i_12_ - i_11_;
	int i_20_ = i_13_ - i_11_;
	if (i < i_6_ && i < i_7_) {
	    i--;
	    if (i_6_ > i_7_)
		i_6_++;
	    else
		i_7_++;
	} else if (i_6_ < i_7_) {
	    i_6_--;
	    if (i > i_7_)
		i++;
	    else
		i_7_++;
	} else {
	    i_7_--;
	    if (i > i_6_)
		i++;
	    else
		i_6_++;
	}
	int i_21_ = 0;
	if (i_6_ != i)
	    i_21_ = (i_9_ - i_8_ << 12) / (i_6_ - i);
	int i_22_ = 0;
	if (i_7_ != i_6_)
	    i_22_ = (i_10_ - i_9_ << 12) / (i_7_ - i_6_);
	int i_23_ = 0;
	if (i_7_ != i)
	    i_23_ = (i_8_ - i_10_ << 12) / (i - i_7_);
	int i_24_ = i_15_ * i_18_ - i_17_ * i_16_;
	if (i_24_ == 0)
	    return false;
	int i_25_ = (i_19_ * i_18_ - i_20_ * i_16_ << 8) / i_24_;
	int i_26_ = (i_20_ * i_15_ - i_19_ * i_17_ << 8) / i_24_;
	if (i <= i_6_ && i <= i_7_) {
	    if (i >= ((Class559) ((Class545) this).aClass559_7388).anInt7489)
		return true;
	    if (i_6_ > ((Class559) ((Class545) this).aClass559_7388).anInt7489)
		i_6_ = ((Class559) ((Class545) this).aClass559_7388).anInt7489;
	    if (i_7_ > ((Class559) ((Class545) this).aClass559_7388).anInt7489)
		i_7_ = ((Class559) ((Class545) this).aClass559_7388).anInt7489;
	    i_11_ = (i_11_ << 8) - i_25_ * i_8_ + i_25_;
	    if (i_6_ < i_7_) {
		i_10_ = i_8_ <<= 12;
		if (i < 0) {
		    i_10_ -= i_23_ * i;
		    i_8_ -= i_21_ * i;
		    i_11_ -= i_26_ * i;
		    i = 0;
		}
		i_9_ <<= 12;
		if (i_6_ < 0) {
		    i_9_ -= i_22_ * i_6_;
		    i_6_ = 0;
		}
		if (i != i_6_ && i_23_ < i_21_ || i == i_6_ && i_23_ > i_22_) {
		    i_7_ -= i_6_;
		    i_6_ -= i;
		    i *= (((Class559) ((Class545) this).aClass559_7388)
			  .anInt7508);
		    while (--i_6_ >= 0) {
			if (!method6660((((Class559)
					  ((Class545) this).aClass559_7388)
					 .anIntArray7504),
					i, 0, (i_10_ >> 12) - 1,
					(i_8_ >> 12) + 1, i_11_, i_25_,
					(((Class559)
					  ((Class545) this).aClass559_7388)
					 .anInt7508)))
			    return false;
			i_10_ += i_23_;
			i_8_ += i_21_;
			i_11_ += i_26_;
			i += (((Class559) ((Class545) this).aClass559_7388)
			      .anInt7508);
		    }
		    while (--i_7_ >= 0) {
			if (!method6660((((Class559)
					  ((Class545) this).aClass559_7388)
					 .anIntArray7504),
					i, 0, (i_10_ >> 12) - 1,
					(i_9_ >> 12) + 1, i_11_, i_25_,
					(((Class559)
					  ((Class545) this).aClass559_7388)
					 .anInt7508)))
			    return false;
			i_10_ += i_23_;
			i_9_ += i_22_;
			i_11_ += i_26_;
			i += (((Class559) ((Class545) this).aClass559_7388)
			      .anInt7508);
		    }
		    return true;
		}
		i_7_ -= i_6_;
		i_6_ -= i;
		i *= ((Class559) ((Class545) this).aClass559_7388).anInt7508;
		while (--i_6_ >= 0) {
		    if (!method6660((((Class559)
				      ((Class545) this).aClass559_7388)
				     .anIntArray7504),
				    i, 0, (i_8_ >> 12) - 1, (i_10_ >> 12) + 1,
				    i_11_, i_25_,
				    ((Class559) (((Class545) this)
						 .aClass559_7388)).anInt7508))
			return false;
		    i_10_ += i_23_;
		    i_8_ += i_21_;
		    i_11_ += i_26_;
		    i += (((Class559) ((Class545) this).aClass559_7388)
			  .anInt7508);
		}
		while (--i_7_ >= 0) {
		    if (!method6660((((Class559)
				      ((Class545) this).aClass559_7388)
				     .anIntArray7504),
				    i, 0, (i_9_ >> 12) - 1, (i_10_ >> 12) + 1,
				    i_11_, i_25_,
				    ((Class559) (((Class545) this)
						 .aClass559_7388)).anInt7508))
			return false;
		    i_10_ += i_23_;
		    i_9_ += i_22_;
		    i_11_ += i_26_;
		    i += (((Class559) ((Class545) this).aClass559_7388)
			  .anInt7508);
		}
		return true;
	    }
	    i_9_ = i_8_ <<= 12;
	    if (i < 0) {
		i_9_ -= i_23_ * i;
		i_8_ -= i_21_ * i;
		i_11_ -= i_26_ * i;
		i = 0;
	    }
	    i_10_ <<= 12;
	    if (i_7_ < 0) {
		i_10_ -= i_22_ * i_7_;
		i_7_ = 0;
	    }
	    if (i != i_7_ && i_23_ < i_21_ || i == i_7_ && i_22_ > i_21_) {
		i_6_ -= i_7_;
		i_7_ -= i;
		i *= ((Class559) ((Class545) this).aClass559_7388).anInt7508;
		while (--i_7_ >= 0) {
		    if (!method6660((((Class559)
				      ((Class545) this).aClass559_7388)
				     .anIntArray7504),
				    i, 0, (i_9_ >> 12) - 1, (i_8_ >> 12) + 1,
				    i_11_, i_25_,
				    ((Class559) (((Class545) this)
						 .aClass559_7388)).anInt7508))
			return false;
		    i_9_ += i_23_;
		    i_8_ += i_21_;
		    i_11_ += i_26_;
		    i += (((Class559) ((Class545) this).aClass559_7388)
			  .anInt7508);
		}
		while (--i_6_ >= 0) {
		    if (!method6660((((Class559)
				      ((Class545) this).aClass559_7388)
				     .anIntArray7504),
				    i, 0, (i_10_ >> 12) - 1, (i_8_ >> 12) + 1,
				    i_11_, i_25_,
				    ((Class559) (((Class545) this)
						 .aClass559_7388)).anInt7508))
			return false;
		    i_10_ += i_22_;
		    i_8_ += i_21_;
		    i_11_ += i_26_;
		    i += (((Class559) ((Class545) this).aClass559_7388)
			  .anInt7508);
		}
		return true;
	    }
	    i_6_ -= i_7_;
	    i_7_ -= i;
	    i *= ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    while (--i_7_ >= 0) {
		if (!method6660((((Class559) ((Class545) this).aClass559_7388)
				 .anIntArray7504),
				i, 0, (i_8_ >> 12) - 1, (i_9_ >> 12) + 1,
				i_11_, i_25_,
				(((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508)))
		    return false;
		i_9_ += i_23_;
		i_8_ += i_21_;
		i_11_ += i_26_;
		i += ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    }
	    while (--i_6_ >= 0) {
		if (!method6660((((Class559) ((Class545) this).aClass559_7388)
				 .anIntArray7504),
				i, 0, (i_8_ >> 12) - 1, (i_10_ >> 12) + 1,
				i_11_, i_25_,
				(((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508)))
		    return false;
		i_10_ += i_22_;
		i_8_ += i_21_;
		i_11_ += i_26_;
		i += ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    }
	    return true;
	}
	if (i_6_ <= i_7_) {
	    if (i_6_
		>= ((Class559) ((Class545) this).aClass559_7388).anInt7489)
		return true;
	    if (i_7_ > ((Class559) ((Class545) this).aClass559_7388).anInt7489)
		i_7_ = ((Class559) ((Class545) this).aClass559_7388).anInt7489;
	    if (i > ((Class559) ((Class545) this).aClass559_7388).anInt7489)
		i = ((Class559) ((Class545) this).aClass559_7388).anInt7489;
	    i_12_ = (i_12_ << 8) - i_25_ * i_9_ + i_25_;
	    if (i_7_ < i) {
		i_8_ = i_9_ <<= 12;
		if (i_6_ < 0) {
		    i_8_ -= i_21_ * i_6_;
		    i_9_ -= i_22_ * i_6_;
		    i_12_ -= i_26_ * i_6_;
		    i_6_ = 0;
		}
		i_10_ <<= 12;
		if (i_7_ < 0) {
		    i_10_ -= i_23_ * i_7_;
		    i_7_ = 0;
		}
		if (i_6_ != i_7_ && i_21_ < i_22_
		    || i_6_ == i_7_ && i_21_ > i_23_) {
		    i -= i_7_;
		    i_7_ -= i_6_;
		    i_6_ *= (((Class559) ((Class545) this).aClass559_7388)
			     .anInt7508);
		    while (--i_7_ >= 0) {
			if (!method6660((((Class559)
					  ((Class545) this).aClass559_7388)
					 .anIntArray7504),
					i_6_, 0, (i_8_ >> 12) - 1,
					(i_9_ >> 12) + 1, i_12_, i_25_,
					(((Class559)
					  ((Class545) this).aClass559_7388)
					 .anInt7508)))
			    return false;
			i_8_ += i_21_;
			i_9_ += i_22_;
			i_12_ += i_26_;
			i_6_ += (((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508);
		    }
		    while (--i >= 0) {
			if (!method6660((((Class559)
					  ((Class545) this).aClass559_7388)
					 .anIntArray7504),
					i_6_, 0, (i_8_ >> 12) - 1,
					(i_10_ >> 12) + 1, i_12_, i_25_,
					(((Class559)
					  ((Class545) this).aClass559_7388)
					 .anInt7508)))
			    return false;
			i_8_ += i_21_;
			i_10_ += i_23_;
			i_12_ += i_26_;
			i_6_ += (((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508);
		    }
		    return true;
		}
		i -= i_7_;
		i_7_ -= i_6_;
		i_6_
		    *= ((Class559) ((Class545) this).aClass559_7388).anInt7508;
		while (--i_7_ >= 0) {
		    if (!method6660((((Class559)
				      ((Class545) this).aClass559_7388)
				     .anIntArray7504),
				    i_6_, 0, (i_9_ >> 12) - 1,
				    (i_8_ >> 12) + 1, i_12_, i_25_,
				    ((Class559) (((Class545) this)
						 .aClass559_7388)).anInt7508))
			return false;
		    i_8_ += i_21_;
		    i_9_ += i_22_;
		    i_12_ += i_26_;
		    i_6_ += (((Class559) ((Class545) this).aClass559_7388)
			     .anInt7508);
		}
		while (--i >= 0) {
		    if (!method6660((((Class559)
				      ((Class545) this).aClass559_7388)
				     .anIntArray7504),
				    i_6_, 0, (i_10_ >> 12) - 1,
				    (i_8_ >> 12) + 1, i_12_, i_25_,
				    ((Class559) (((Class545) this)
						 .aClass559_7388)).anInt7508))
			return false;
		    i_8_ += i_21_;
		    i_10_ += i_23_;
		    i_12_ += i_26_;
		    i_6_ += (((Class559) ((Class545) this).aClass559_7388)
			     .anInt7508);
		}
		return true;
	    }
	    i_10_ = i_9_ <<= 12;
	    if (i_6_ < 0) {
		i_10_ -= i_21_ * i_6_;
		i_9_ -= i_22_ * i_6_;
		i_12_ -= i_26_ * i_6_;
		i_6_ = 0;
	    }
	    i_8_ <<= 12;
	    if (i < 0) {
		i_8_ -= i_23_ * i;
		i = 0;
	    }
	    if (i_21_ < i_22_) {
		i_7_ -= i;
		i -= i_6_;
		i_6_
		    *= ((Class559) ((Class545) this).aClass559_7388).anInt7508;
		while (--i >= 0) {
		    if (!method6660((((Class559)
				      ((Class545) this).aClass559_7388)
				     .anIntArray7504),
				    i_6_, 0, (i_10_ >> 12) - 1,
				    (i_9_ >> 12) + 1, i_12_, i_25_,
				    ((Class559) (((Class545) this)
						 .aClass559_7388)).anInt7508))
			return false;
		    i_10_ += i_21_;
		    i_9_ += i_22_;
		    i_12_ += i_26_;
		    i_6_ += (((Class559) ((Class545) this).aClass559_7388)
			     .anInt7508);
		}
		while (--i_7_ >= 0) {
		    if (!method6660((((Class559)
				      ((Class545) this).aClass559_7388)
				     .anIntArray7504),
				    i_6_, 0, (i_8_ >> 12) - 1,
				    (i_9_ >> 12) + 1, i_12_, i_25_,
				    ((Class559) (((Class545) this)
						 .aClass559_7388)).anInt7508))
			return false;
		    i_8_ += i_23_;
		    i_9_ += i_22_;
		    i_12_ += i_26_;
		    i_6_ += (((Class559) ((Class545) this).aClass559_7388)
			     .anInt7508);
		}
		return true;
	    }
	    i_7_ -= i;
	    i -= i_6_;
	    i_6_ *= ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    while (--i >= 0) {
		if (!method6660((((Class559) ((Class545) this).aClass559_7388)
				 .anIntArray7504),
				i_6_, 0, (i_9_ >> 12) - 1, (i_10_ >> 12) + 1,
				i_12_, i_25_,
				(((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508)))
		    return false;
		i_10_ += i_21_;
		i_9_ += i_22_;
		i_12_ += i_26_;
		i_6_
		    += ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    }
	    while (--i_7_ >= 0) {
		if (!method6660((((Class559) ((Class545) this).aClass559_7388)
				 .anIntArray7504),
				i_6_, 0, (i_9_ >> 12) - 1, (i_8_ >> 12) + 1,
				i_12_, i_25_,
				(((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508)))
		    return false;
		i_8_ += i_23_;
		i_9_ += i_22_;
		i_12_ += i_26_;
		i_6_
		    += ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    }
	    return true;
	}
	if (i_7_ >= ((Class559) ((Class545) this).aClass559_7388).anInt7489)
	    return true;
	if (i > ((Class559) ((Class545) this).aClass559_7388).anInt7489)
	    i = ((Class559) ((Class545) this).aClass559_7388).anInt7489;
	if (i_6_ > ((Class559) ((Class545) this).aClass559_7388).anInt7489)
	    i_6_ = ((Class559) ((Class545) this).aClass559_7388).anInt7489;
	i_13_ = (i_13_ << 8) - i_25_ * i_10_ + i_25_;
	if (i < i_6_) {
	    i_9_ = i_10_ <<= 12;
	    if (i_7_ < 0) {
		i_9_ -= i_22_ * i_7_;
		i_10_ -= i_23_ * i_7_;
		i_13_ -= i_26_ * i_7_;
		i_7_ = 0;
	    }
	    i_8_ <<= 12;
	    if (i < 0) {
		i_8_ -= i_21_ * i;
		i = 0;
	    }
	    if (i_22_ < i_23_) {
		i_6_ -= i;
		i -= i_7_;
		i_7_
		    *= ((Class559) ((Class545) this).aClass559_7388).anInt7508;
		while (--i >= 0) {
		    if (!method6660((((Class559)
				      ((Class545) this).aClass559_7388)
				     .anIntArray7504),
				    i_7_, 0, (i_9_ >> 12) - 1,
				    (i_10_ >> 12) + 1, i_13_, i_25_,
				    ((Class559) (((Class545) this)
						 .aClass559_7388)).anInt7508))
			return false;
		    i_9_ += i_22_;
		    i_10_ += i_23_;
		    i_13_ += i_26_;
		    i_7_ += (((Class559) ((Class545) this).aClass559_7388)
			     .anInt7508);
		}
		while (--i_6_ >= 0) {
		    if (!method6660((((Class559)
				      ((Class545) this).aClass559_7388)
				     .anIntArray7504),
				    i_7_, 0, (i_9_ >> 12) - 1,
				    (i_8_ >> 12) + 1, i_13_, i_25_,
				    ((Class559) (((Class545) this)
						 .aClass559_7388)).anInt7508))
			return false;
		    i_9_ += i_22_;
		    i_8_ += i_21_;
		    i_13_ += i_26_;
		    i_7_ += (((Class559) ((Class545) this).aClass559_7388)
			     .anInt7508);
		}
		return true;
	    }
	    i_6_ -= i;
	    i -= i_7_;
	    i_7_ *= ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    while (--i >= 0) {
		if (!method6660((((Class559) ((Class545) this).aClass559_7388)
				 .anIntArray7504),
				i_7_, 0, (i_10_ >> 12) - 1, (i_9_ >> 12) + 1,
				i_13_, i_25_,
				(((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508)))
		    return false;
		i_9_ += i_22_;
		i_10_ += i_23_;
		i_13_ += i_26_;
		i_7_
		    += ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    }
	    while (--i_6_ >= 0) {
		if (!method6660((((Class559) ((Class545) this).aClass559_7388)
				 .anIntArray7504),
				i_7_, 0, (i_8_ >> 12) - 1, (i_9_ >> 12) + 1,
				i_13_, i_25_,
				(((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508)))
		    return false;
		i_9_ += i_22_;
		i_8_ += i_21_;
		i_13_ += i_26_;
		i_7_
		    += ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    }
	    return true;
	}
	i_8_ = i_10_ <<= 12;
	if (i_7_ < 0) {
	    i_8_ -= i_22_ * i_7_;
	    i_10_ -= i_23_ * i_7_;
	    i_13_ -= i_26_ * i_7_;
	    i_7_ = 0;
	}
	i_9_ <<= 12;
	if (i_6_ < 0) {
	    i_9_ -= i_21_ * i_6_;
	    i_6_ = 0;
	}
	if (i_22_ < i_23_) {
	    i -= i_6_;
	    i_6_ -= i_7_;
	    i_7_ *= ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    while (--i_6_ >= 0) {
		if (!method6660((((Class559) ((Class545) this).aClass559_7388)
				 .anIntArray7504),
				i_7_, 0, (i_8_ >> 12) - 1, (i_10_ >> 12) + 1,
				i_13_, i_25_,
				(((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508)))
		    return false;
		i_8_ += i_22_;
		i_10_ += i_23_;
		i_13_ += i_26_;
		i_7_
		    += ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    }
	    while (--i >= 0) {
		if (!method6660((((Class559) ((Class545) this).aClass559_7388)
				 .anIntArray7504),
				i_7_, 0, (i_9_ >> 12) - 1, (i_10_ >> 12) + 1,
				i_13_, i_25_,
				(((Class559) ((Class545) this).aClass559_7388)
				 .anInt7508)))
		    return false;
		i_9_ += i_21_;
		i_10_ += i_23_;
		i_13_ += i_26_;
		i_7_
		    += ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	    }
	    return true;
	}
	i -= i_6_;
	i_6_ -= i_7_;
	i_7_ *= ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	while (--i_6_ >= 0) {
	    if (!method6660((((Class559) ((Class545) this).aClass559_7388)
			     .anIntArray7504),
			    i_7_, 0, (i_10_ >> 12) - 1, (i_8_ >> 12) + 1,
			    i_13_, i_25_,
			    (((Class559) ((Class545) this).aClass559_7388)
			     .anInt7508)))
		return false;
	    i_8_ += i_22_;
	    i_10_ += i_23_;
	    i_13_ += i_26_;
	    i_7_ += ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	}
	while (--i >= 0) {
	    if (!method6660((((Class559) ((Class545) this).aClass559_7388)
			     .anIntArray7504),
			    i_7_, 0, (i_10_ >> 12) - 1, (i_9_ >> 12) + 1,
			    i_13_, i_25_,
			    (((Class559) ((Class545) this).aClass559_7388)
			     .anInt7508)))
		return false;
	    i_9_ += i_21_;
	    i_10_ += i_23_;
	    i_13_ += i_26_;
	    i_7_ += ((Class559) ((Class545) this).aClass559_7388).anInt7508;
	}
	return true;
    }
}
