/* Class511_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class511_Sub2_Sub1_Sub1 extends Class511_Sub2_Sub1
{
    short aShort11937;
    short aShort11938;
    short aShort11939;
    short aShort11940;
    int anInt11941;
    int anInt11942;
    short aShort11943;
    short aShort11944;
    Class613 aClass613_11945;
    short aShort11946;
    
    void method10807(Class613 class613, int i, int i_0_, int i_1_, int i_2_,
		     int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
		     int i_8_, int i_9_, int i_10_, int i_11_, boolean bool,
		     boolean bool_12_) {
	((Class511_Sub2_Sub1_Sub1) this).aClass613_11945 = class613;
	anInt11511 = i << 12;
	anInt11512 = i_0_ << 12;
	anInt11509 = i_1_ << 12;
	anInt11513 = i_7_;
	((Class511_Sub2_Sub1_Sub1) this).aShort11946
	    = ((Class511_Sub2_Sub1_Sub1) this).aShort11943 = (short) i_6_;
	anInt11508 = i_8_;
	aShort11516 = (short) i_9_;
	((Class511_Sub2_Sub1_Sub1) this).aShort11944 = (short) i_10_;
	anInt11515 = i_11_;
	aBool11510 = bool_12_;
	((Class511_Sub2_Sub1_Sub1) this).aShort11937 = (short) i_2_;
	((Class511_Sub2_Sub1_Sub1) this).aShort11940 = (short) i_3_;
	((Class511_Sub2_Sub1_Sub1) this).aShort11939 = (short) i_4_;
	((Class511_Sub2_Sub1_Sub1) this).anInt11942 = i_5_;
	method10808();
    }
    
    void method10808() {
	int i = (((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					  .aClass613_11945)).aClass612_7992)
		 .anInt7977);
	if ((((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				      .aClass613_11945)).aClass612_7992)
	     .aClass511_Sub2_Sub1_Sub1Array7980[i])
	    != null)
	    ((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				     .aClass613_11945)).aClass612_7992)
		.aClass511_Sub2_Sub1_Sub1Array7980[i].method10810();
	((Class612)
	 (((Class613) ((Class511_Sub2_Sub1_Sub1) this).aClass613_11945)
	  .aClass612_7992)).aClass511_Sub2_Sub1_Sub1Array7980[i]
	    = this;
	((Class511_Sub2_Sub1_Sub1) this).aShort11938
	    = (short) ((Class612) (((Class613) ((Class511_Sub2_Sub1_Sub1)
						this).aClass613_11945)
				   .aClass612_7992)).anInt7977;
	((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				 .aClass613_11945)).aClass612_7992).anInt7977
	    = i + 1 & 0x1fff;
	((Class613) ((Class511_Sub2_Sub1_Sub1) this).aClass613_11945)
	    .aClass695_7994.method8175(this, (byte) 75);
    }
    
    void method10809(long l, int i) {
	((Class511_Sub2_Sub1_Sub1) this).aShort11943 -= i;
	if (((Class511_Sub2_Sub1_Sub1) this).aShort11943 <= 0)
	    method10810();
	else {
	    int i_13_ = anInt11511 >> 12;
	    int i_14_ = anInt11512 >> 12;
	    int i_15_ = anInt11509 >> 12;
	    Class612 class612 = (((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					      .aClass613_11945))
				 .aClass612_7992);
	    Class386 class386 = (((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					      .aClass613_11945))
				 .aClass386_7991);
	    if (class386.anInt4011 * 88964119 != 0) {
		if ((((Class511_Sub2_Sub1_Sub1) this).aShort11946
		     - ((Class511_Sub2_Sub1_Sub1) this).aShort11943)
		    <= class386.anInt4045 * -1690361081) {
		    int i_16_
			= ((anInt11513 >> 8 & 0xff00)
			   + (((Class511_Sub2_Sub1_Sub1) this).anInt11941 >> 16
			      & 0xff)
			   + class386.anInt4062 * -2088949179 * i);
		    int i_17_
			= ((anInt11513 & 0xff00)
			   + (((Class511_Sub2_Sub1_Sub1) this).anInt11941 >> 8
			      & 0xff)
			   + class386.anInt4060 * -646066259 * i);
		    int i_18_ = ((anInt11513 << 8 & 0xff00)
				 + (((Class511_Sub2_Sub1_Sub1) this).anInt11941
				    & 0xff)
				 + class386.anInt4061 * -1185292709 * i);
		    if (i_16_ < 0)
			i_16_ = 0;
		    else if (i_16_ > 65535)
			i_16_ = 65535;
		    if (i_17_ < 0)
			i_17_ = 0;
		    else if (i_17_ > 65535)
			i_17_ = 65535;
		    if (i_18_ < 0)
			i_18_ = 0;
		    else if (i_18_ > 65535)
			i_18_ = 65535;
		    anInt11513 &= ~0xffffff;
		    anInt11513 |= (((i_16_ & 0xff00) << 8) + (i_17_ & 0xff00)
				   + ((i_18_ & 0xff00) >> 8));
		    ((Class511_Sub2_Sub1_Sub1) this).anInt11941 &= ~0xffffff;
		    ((Class511_Sub2_Sub1_Sub1) this).anInt11941
			|= (((i_16_ & 0xff) << 16) + ((i_17_ & 0xff) << 8)
			    + (i_18_ & 0xff));
		}
		if ((((Class511_Sub2_Sub1_Sub1) this).aShort11946
		     - ((Class511_Sub2_Sub1_Sub1) this).aShort11943)
		    <= class386.anInt4020 * 469891861) {
		    int i_19_
			= ((anInt11513 >> 16 & 0xff00)
			   + (((Class511_Sub2_Sub1_Sub1) this).anInt11941 >> 24
			      & 0xff)
			   + class386.anInt4050 * 1734011977 * i);
		    if (i_19_ < 0)
			i_19_ = 0;
		    else if (i_19_ > 65535)
			i_19_ = 65535;
		    anInt11513 &= 0xffffff;
		    anInt11513 |= (i_19_ & 0xff00) << 16;
		    ((Class511_Sub2_Sub1_Sub1) this).anInt11941 &= 0xffffff;
		    ((Class511_Sub2_Sub1_Sub1) this).anInt11941
			|= (i_19_ & 0xff) << 24;
		}
	    }
	    if (class386.anInt4002 * 1922263025 != -1
		&& ((((Class511_Sub2_Sub1_Sub1) this).aShort11946
		     - ((Class511_Sub2_Sub1_Sub1) this).aShort11943)
		    <= class386.anInt4063 * 645289145))
		((Class511_Sub2_Sub1_Sub1) this).anInt11942
		    += class386.anInt4064 * -1896629801 * i;
	    if (class386.anInt4006 * -1884179083 != -1
		&& ((((Class511_Sub2_Sub1_Sub1) this).aShort11946
		     - ((Class511_Sub2_Sub1_Sub1) this).aShort11943)
		    <= class386.anInt4065 * -436520499))
		anInt11508 += class386.anInt4066 * -212308659 * i;
	    if (((Class511_Sub2_Sub1_Sub1) this).aShort11944 != 0)
		aShort11516
		    = (short) (aShort11516 + (((Class511_Sub2_Sub1_Sub1) this)
					      .aShort11944) * i
			       & 0x3fff);
	    double d = (double) ((Class511_Sub2_Sub1_Sub1) this).aShort11937;
	    double d_20_
		= (double) ((Class511_Sub2_Sub1_Sub1) this).aShort11940;
	    double d_21_
		= (double) ((Class511_Sub2_Sub1_Sub1) this).aShort11939;
	    boolean bool = false;
	    if (class386.anInt4000 * 302369091 == 1) {
		int i_22_
		    = i_13_ - (((Class617)
				((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					     .aClass613_11945)).aClass617_7998)
			       .anInt8043) * -426359943;
		int i_23_
		    = i_14_ - (((Class617)
				((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					     .aClass613_11945)).aClass617_7998)
			       .anInt8039) * 1328281815;
		int i_24_
		    = i_15_ - (((Class617)
				((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					     .aClass613_11945)).aClass617_7998)
			       .anInt8045) * -611760253;
		int i_25_
		    = ((int) Math.sqrt((double) (i_22_ * i_22_ + i_23_ * i_23_
						 + i_24_ * i_24_))
		       >> 2);
		long l_26_
		    = (long) (class386.anInt4001 * -1328827011 * i_25_ * i);
		((Class511_Sub2_Sub1_Sub1) this).anInt11942
		    -= ((long) ((Class511_Sub2_Sub1_Sub1) this).anInt11942
			* l_26_) >> 18;
	    } else if (class386.anInt4000 * 302369091 == 2) {
		int i_27_
		    = i_13_ - (((Class617)
				((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					     .aClass613_11945)).aClass617_7998)
			       .anInt8043) * -426359943;
		int i_28_
		    = i_14_ - (((Class617)
				((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					     .aClass613_11945)).aClass617_7998)
			       .anInt8039) * 1328281815;
		int i_29_
		    = i_15_ - (((Class617)
				((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					     .aClass613_11945)).aClass617_7998)
			       .anInt8045) * -611760253;
		int i_30_ = i_27_ * i_27_ + i_28_ * i_28_ + i_29_ * i_29_;
		long l_31_
		    = (long) (class386.anInt4001 * -1328827011 * i_30_ * i);
		((Class511_Sub2_Sub1_Sub1) this).anInt11942
		    -= ((long) ((Class511_Sub2_Sub1_Sub1) this).anInt11942
			* l_31_) >> 28;
	    }
	    if (class386.anIntArray4019 != null) {
		Iterator iterator = ((Class612) class612).aList7982.iterator();
		while (iterator.hasNext()) {
		    Class528_Sub24 class528_sub24
			= (Class528_Sub24) iterator.next();
		    Class388 class388
			= ((Class528_Sub24) class528_sub24).aClass388_10417;
		    if (class388.anInt4084 * 1035648539 != 1) {
			boolean bool_32_ = false;
			for (int i_33_ = 0;
			     i_33_ < class386.anIntArray4019.length; i_33_++) {
			    if (class386.anIntArray4019[i_33_]
				== class388.anInt4083 * -1330640567) {
				bool_32_ = true;
				break;
			    }
			}
			if (bool_32_) {
			    double d_34_
				= (double) (i_13_
					    - (((Class528_Sub24)
						class528_sub24).anInt10413
					       * -862679451));
			    double d_35_
				= (double) (i_14_
					    - (((Class528_Sub24)
						class528_sub24).anInt10414
					       * -566612879));
			    double d_36_
				= (double) (i_15_
					    - (((Class528_Sub24)
						class528_sub24).anInt10415
					       * 1379574357));
			    double d_37_ = (d_34_ * d_34_ + d_35_ * d_35_
					    + d_36_ * d_36_);
			    if (!(d_37_
				  > (double) (class388.aLong4095
					      * -2543783651806867857L))) {
				double d_38_ = Math.sqrt(d_37_);
				if (d_38_ == 0.0)
				    d_38_ = 1.0;
				double d_39_
				    = ((d_34_ * (double) (((Class528_Sub24)
							   class528_sub24)
							  .aFloat10416)
					+ d_35_ * (double) (class388.anInt4076
							    * 2007456999)
					+ d_36_ * (double) (((Class528_Sub24)
							     class528_sub24)
							    .aFloat10411))
				       * 65535.0
				       / ((double) (class388.anInt4078
						    * -2024137899)
					  * d_38_));
				if (!(d_39_ < (double) (class388.anInt4096
							* -927586181))) {
				    double d_40_ = 0.0;
				    if (class388.anInt4080 * -1345816459 == 1)
					d_40_ = (d_38_ / 16.0
						 * (double) (class388.anInt4090
							     * 1910269211));
				    else if (class388.anInt4080 * -1345816459
					     == 2)
					d_40_ = (d_38_ / 16.0 * (d_38_ / 16.0)
						 * (double) (class388.anInt4090
							     * 1910269211));
				    if (class388.anInt4092 * -18309903 == 0) {
					if (class388.anInt4091 * 2064878879
					    == 0) {
					    d += ((double) (((Class528_Sub24)
							     class528_sub24)
							    .aFloat10416)
						  - d_40_) * (double) i;
					    d_20_ += ((double) ((class388
								 .anInt4076)
								* 2007456999)
						      - d_40_) * (double) i;
					    d_21_
						+= ((double) (((Class528_Sub24)
							       class528_sub24)
							      .aFloat10411)
						    - d_40_) * (double) i;
					    bool = true;
					} else {
					    anInt11511
						+= ((double) (((Class528_Sub24)
							       class528_sub24)
							      .aFloat10416)
						    - d_40_) * (double) i;
					    anInt11512
						+= ((double) ((class388
							       .anInt4076)
							      * 2007456999)
						    - d_40_) * (double) i;
					    anInt11509
						+= ((double) (((Class528_Sub24)
							       class528_sub24)
							      .aFloat10411)
						    - d_40_) * (double) i;
					}
				    } else {
					double d_41_
					    = (d_34_ / d_38_
					       * (double) (class388.anInt4078
							   * -2024137899));
					double d_42_
					    = (d_35_ / d_38_
					       * (double) (class388.anInt4078
							   * -2024137899));
					double d_43_
					    = (d_36_ / d_38_
					       * (double) (class388.anInt4078
							   * -2024137899));
					if (class388.anInt4091 * 2064878879
					    == 0) {
					    d += d_41_ * (double) i;
					    d_20_ += d_42_ * (double) i;
					    d_21_ += d_43_ * (double) i;
					    bool = true;
					} else {
					    anInt11511 += d_41_ * (double) i;
					    anInt11512 += d_42_ * (double) i;
					    anInt11509 += d_43_ * (double) i;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (class386.anIntArray4005 != null) {
		for (int i_44_ = 0; i_44_ < class386.anIntArray4005.length;
		     i_44_++) {
		    Class528_Sub24 class528_sub24
			= ((Class528_Sub24)
			   (Class621.aClass692_8062.method8137
			    ((long) class386.anIntArray4005[i_44_])));
		    while (class528_sub24 != null) {
			Class388 class388 = (((Class528_Sub24) class528_sub24)
					     .aClass388_10417);
			double d_45_
			    = (double) (i_13_
					- (((Class528_Sub24) class528_sub24)
					   .anInt10413) * -862679451);
			double d_46_
			    = (double) (i_14_
					- (((Class528_Sub24) class528_sub24)
					   .anInt10414) * -566612879);
			double d_47_
			    = (double) (i_15_
					- (((Class528_Sub24) class528_sub24)
					   .anInt10415) * 1379574357);
			double d_48_
			    = d_45_ * d_45_ + d_46_ * d_46_ + d_47_ * d_47_;
			if (d_48_ > (double) (class388.aLong4095
					      * -2543783651806867857L))
			    class528_sub24 = ((Class528_Sub24)
					      Class621.aClass692_8062
						  .method8143((short) 255));
			else {
			    double d_49_ = Math.sqrt(d_48_);
			    if (d_49_ == 0.0)
				d_49_ = 1.0;
			    if (class388.anInt4085 * -32190419 > 0
				&& class388.anInt4085 * -32190419 < 2047) {
				double d_50_
				    = ((d_45_ * (double) (((Class528_Sub24)
							   class528_sub24)
							  .aFloat10416)
					+ d_46_ * (double) (class388.anInt4076
							    * 2007456999)
					+ d_47_ * (double) (((Class528_Sub24)
							     class528_sub24)
							    .aFloat10411))
				       * 16384.0
				       / ((double) (class388.anInt4078
						    * -2024137899)
					  * d_49_));
				if (d_50_ < (double) (class388.anInt4096
						      * -927586181)) {
				    class528_sub24
					= ((Class528_Sub24)
					   Class621.aClass692_8062
					       .method8143((short) 255));
				    continue;
				}
			    }
			    double d_51_ = 0.0;
			    if (class388.anInt4080 * -1345816459 == 1)
				d_51_ = (d_49_ / 16.0
					 * (double) (class388.anInt4090
						     * 1910269211));
			    else if (class388.anInt4080 * -1345816459 == 2)
				d_51_ = (d_49_ / 16.0 * (d_49_ / 16.0)
					 * (double) (class388.anInt4090
						     * 1910269211));
			    if (class388.anInt4092 * -18309903 == 0) {
				if (class388.anInt4091 * 2064878879 == 0) {
				    d += ((double) ((Class528_Sub24)
						    class528_sub24).aFloat10416
					  - d_51_) * (double) i;
				    d_20_ += ((double) (class388.anInt4076
							* 2007456999)
					      - d_51_) * (double) i;
				    d_21_ += ((double) (((Class528_Sub24)
							 class528_sub24)
							.aFloat10411)
					      - d_51_) * (double) i;
				    bool = true;
				} else {
				    anInt11511 += ((double) (((Class528_Sub24)
							      class528_sub24)
							     .aFloat10416)
						   - d_51_) * (double) i;
				    anInt11512 += ((double) (class388.anInt4076
							     * 2007456999)
						   - d_51_) * (double) i;
				    anInt11509 += ((double) (((Class528_Sub24)
							      class528_sub24)
							     .aFloat10411)
						   - d_51_) * (double) i;
				}
			    } else {
				double d_52_ = (d_45_ / d_49_
						* (double) (class388.anInt4078
							    * -2024137899));
				double d_53_ = (d_46_ / d_49_
						* (double) (class388.anInt4078
							    * -2024137899));
				double d_54_ = (d_47_ / d_49_
						* (double) (class388.anInt4078
							    * -2024137899));
				if (class388.anInt4091 * 2064878879 == 0) {
				    d += d_52_ * (double) i;
				    d_20_ += d_53_ * (double) i;
				    d_21_ += d_54_ * (double) i;
				    bool = true;
				} else {
				    anInt11511 += d_52_ * (double) i;
				    anInt11512 += d_53_ * (double) i;
				    anInt11509 += d_54_ * (double) i;
				}
			    }
			    class528_sub24 = ((Class528_Sub24)
					      Class621.aClass692_8062
						  .method8143((short) 255));
			}
		    }
		}
	    }
	    if (class386.anIntArray4021 != null) {
		if (class386.anIntArray4022 == null) {
		    class386.anIntArray4022
			= new int[class386.anIntArray4021.length];
		    for (int i_55_ = 0; i_55_ < class386.anIntArray4021.length;
			 i_55_++) {
			Class621.anInterface46_8069.method328((class386
							       .anIntArray4021
							       [i_55_]),
							      -1096368889);
			class386.anIntArray4022[i_55_]
			    = Class314.method4150((class386.anIntArray4021
						   [i_55_]),
						  (byte) 84);
		    }
		}
		for (int i_56_ = 0; i_56_ < class386.anIntArray4022.length;
		     i_56_++) {
		    Class388 class388 = (Class621.aClass388Array8067
					 [class386.anIntArray4022[i_56_]]);
		    if (class388.anInt4091 * 2064878879 == 0) {
			d += (double) (class388.anInt4086 * -1983225347 * i);
			d_20_
			    += (double) (class388.anInt4076 * 2007456999 * i);
			d_21_
			    += (double) (class388.anInt4088 * 1809699657 * i);
			bool = true;
		    } else {
			anInt11511 += class388.anInt4086 * -1983225347 * i;
			anInt11512 += class388.anInt4076 * 2007456999 * i;
			anInt11509 += class388.anInt4088 * 1809699657 * i;
		    }
		}
	    }
	    if (bool) {
		while (d > 32767.0 || d_20_ > 32767.0 || d_21_ > 32767.0
		       || d < -32767.0 || d_20_ < -32767.0
		       || d_21_ < -32767.0) {
		    d /= 2.0;
		    d_20_ /= 2.0;
		    d_21_ /= 2.0;
		    ((Class511_Sub2_Sub1_Sub1) this).anInt11942 <<= 1;
		}
		((Class511_Sub2_Sub1_Sub1) this).aShort11937 = (short) (int) d;
		((Class511_Sub2_Sub1_Sub1) this).aShort11940
		    = (short) (int) d_20_;
		((Class511_Sub2_Sub1_Sub1) this).aShort11939
		    = (short) (int) d_21_;
	    }
	    anInt11511
		+= (((long) ((Class511_Sub2_Sub1_Sub1) this).aShort11937
		     * (long) (((Class511_Sub2_Sub1_Sub1) this).anInt11942
			       << 2))
		    >> 23) * (long) i;
	    anInt11512
		+= (((long) ((Class511_Sub2_Sub1_Sub1) this).aShort11940
		     * (long) (((Class511_Sub2_Sub1_Sub1) this).anInt11942
			       << 2))
		    >> 23) * (long) i;
	    anInt11509
		+= (((long) ((Class511_Sub2_Sub1_Sub1) this).aShort11939
		     * (long) (((Class511_Sub2_Sub1_Sub1) this).anInt11942
			       << 2))
		    >> 23) * (long) i;
	}
    }
    
    void method10810() {
	((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				 .aClass613_11945)).aClass612_7992)
	    .aClass511_Sub2_Sub1_Sub1Array7980
	    [((Class511_Sub2_Sub1_Sub1) this).aShort11938]
	    = null;
	Class621.aClass511_Sub2_Sub1_Sub1Array8055[(Class621.anInt8057
						    * -1023378695)]
	    = this;
	Class621.anInt8057
	    = (Class621.anInt8057 * -1023378695 + 1 & 0x3ff) * 1919493961;
	method6259(1407383585);
	method9279((byte) 0);
    }
    
    Class511_Sub2_Sub1_Sub1
	(Class613 class613, int i, int i_57_, int i_58_, int i_59_, int i_60_,
	 int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_,
	 int i_67_, int i_68_, boolean bool, boolean bool_69_) {
	((Class511_Sub2_Sub1_Sub1) this).aClass613_11945 = class613;
	anInt11511 = i << 12;
	anInt11512 = i_57_ << 12;
	anInt11509 = i_58_ << 12;
	anInt11513 = i_64_;
	((Class511_Sub2_Sub1_Sub1) this).aShort11946
	    = ((Class511_Sub2_Sub1_Sub1) this).aShort11943 = (short) i_63_;
	anInt11508 = i_65_;
	aShort11516 = (short) i_66_;
	((Class511_Sub2_Sub1_Sub1) this).aShort11944 = (short) i_67_;
	anInt11515 = i_68_;
	aBool11510 = bool_69_;
	((Class511_Sub2_Sub1_Sub1) this).aShort11937 = (short) i_59_;
	((Class511_Sub2_Sub1_Sub1) this).aShort11940 = (short) i_60_;
	((Class511_Sub2_Sub1_Sub1) this).aShort11939 = (short) i_61_;
	((Class511_Sub2_Sub1_Sub1) this).anInt11942 = i_62_;
	method10808();
    }
    
    void method10811(Class538 class538, Class173 class173, long l) {
	int i = anInt11511 >> 12 + class538.anInt7148 * -1532596617;
	int i_70_ = anInt11509 >> 12 + class538.anInt7148 * -1532596617;
	int i_71_ = anInt11512 >> 12;
	if (i_71_ > 262144 || i_71_ < -262144 || i < 0
	    || i >= class538.anInt7158 * -1102718643 || i_70_ < 0
	    || i_70_ >= class538.anInt7159 * -532233529)
	    method10810();
	else {
	    Class612 class612 = (((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					      .aClass613_11945))
				 .aClass612_7992);
	    Class386 class386 = (((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					      .aClass613_11945))
				 .aClass386_7991);
	    Class137[] class137s = class538.aClass137Array7161;
	    int i_72_ = ((Class612) class612).anInt7976;
	    Class546 class546 = (class538.aClass546ArrayArrayArray7160
				 [((Class612) class612).anInt7976][i][i_70_]);
	    if (class546 != null)
		i_72_ = class546.aByte7402;
	    int i_73_ = class137s[i_72_].method1669(i, i_70_, (byte) 0);
	    int i_74_;
	    if (i_72_ < class538.anInt7184 * -353005885 - 1)
		i_74_ = class137s[i_72_ + 1].method1669(i, i_70_, (byte) 0);
	    else
		i_74_ = i_73_ - (8 << class538.anInt7148 * -1532596617);
	    if (class386.aBool4044) {
		if (class386.anInt4024 * 1246041169 == -1 && i_71_ > i_73_) {
		    method10810();
		    return;
		}
		if (class386.anInt4024 * 1246041169 >= 0
		    && i_71_ > class137s[class386.anInt4024 * 1246041169]
				   .method1669(i, i_70_, (byte) 0)) {
		    method10810();
		    return;
		}
		if (class386.anInt4025 * -878318731 == -1 && i_71_ < i_74_) {
		    method10810();
		    return;
		}
		if (class386.anInt4025 * -878318731 >= 0
		    && i_71_ < class137s
				   [class386.anInt4025 * -878318731 + 1]
				   .method1669(i, i_70_, (byte) 0)) {
		    method10810();
		    return;
		}
	    }
	    int i_75_;
	    for (i_75_ = class538.anInt7184 * -353005885 - 1;
		 (i_75_ > 0
		  && i_71_ > class137s[i_75_].method1669(i, i_70_, (byte) 0));
		 i_75_--) {
		/* empty */
	    }
	    if (class386.aBool4042 && i_75_ == 0
		&& i_71_ > class137s[0].method1669(i, i_70_, (byte) 0))
		method10810();
	    else if (i_75_ == class538.anInt7184 * -353005885 - 1
		     && (class137s[i_75_].method1669(i, i_70_, (byte) 0)
			 - i_71_) > 8 << class538.anInt7148 * -1532596617)
		method10810();
	    else {
		class546
		    = class538.aClass546ArrayArrayArray7160[i_75_][i][i_70_];
		if (class546 == null) {
		    if (i_75_ == 0
			|| (class538.aClass546ArrayArrayArray7160[0][i][i_70_]
			    == null))
			class546 = class538.aClass546ArrayArrayArray7160[0]
				       [i][i_70_] = new Class546(0);
		    boolean bool = ((class538.aClass546ArrayArrayArray7160[0]
				     [i][i_70_].aClass546_7392)
				    != null);
		    if (i_75_ == 3 && bool)
			i_75_--;
		    for (int i_76_ = 1; i_76_ <= i_75_; i_76_++) {
			if ((class538.aClass546ArrayArrayArray7160[i_76_][i]
			     [i_70_])
			    == null) {
			    class546
				= class538.aClass546ArrayArrayArray7160
				      [i_76_][i][i_70_]
				= new Class546(i_76_);
			    if (bool)
				class546.aByte7402++;
			}
		    }
		    if (class546 == null)
			class546 = (class538.aClass546ArrayArrayArray7160
				    [i_75_][i][i_70_]);
		}
		if (class386.aBool4056) {
		    int i_77_ = anInt11511 >> 12;
		    int i_78_ = anInt11509 >> 12;
		    if (class546.aClass645_Sub1_Sub3_7393 != null) {
			Class554 class554
			    = class546.aClass645_Sub1_Sub3_7393
				  .method9780(class173, 1462349049);
			if (class554 != null
			    && class554.method6735(i_77_, i_71_, i_78_)) {
			    method10810();
			    return;
			}
		    }
		    if (class546.aClass645_Sub1_Sub3_7394 != null) {
			Class554 class554
			    = class546.aClass645_Sub1_Sub3_7394
				  .method9780(class173, 718285568);
			if (class554 != null
			    && class554.method6735(i_77_, i_71_, i_78_)) {
			    method10810();
			    return;
			}
		    }
		    if (class546.aClass645_Sub1_Sub4_7397 != null) {
			Class554 class554
			    = class546.aClass645_Sub1_Sub4_7397
				  .method9780(class173, -69205616);
			if (class554 != null
			    && class554.method6735(i_77_, i_71_, i_78_)) {
			    method10810();
			    return;
			}
		    }
		    for (Class542 class542 = class546.aClass542_7399;
			 class542 != null;
			 class542 = class542.aClass542_7238) {
			Class554 class554
			    = class542.aClass645_Sub1_Sub5_7239
				  .method9780(class173, -710317002);
			if (class554 != null
			    && class554.method6735(i_77_, i_71_, i_78_)) {
			    method10810();
			    return;
			}
		    }
		}
		((Class612) class612).aClass171_7987.aClass685_1959
		    .method8010(this, (byte) 0);
	    }
	}
    }
    
    void method10812() {
	int i = (((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					  .aClass613_11945)).aClass612_7992)
		 .anInt7977);
	if ((((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				      .aClass613_11945)).aClass612_7992)
	     .aClass511_Sub2_Sub1_Sub1Array7980[i])
	    != null)
	    ((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				     .aClass613_11945)).aClass612_7992)
		.aClass511_Sub2_Sub1_Sub1Array7980[i].method10810();
	((Class612)
	 (((Class613) ((Class511_Sub2_Sub1_Sub1) this).aClass613_11945)
	  .aClass612_7992)).aClass511_Sub2_Sub1_Sub1Array7980[i]
	    = this;
	((Class511_Sub2_Sub1_Sub1) this).aShort11938
	    = (short) ((Class612) (((Class613) ((Class511_Sub2_Sub1_Sub1)
						this).aClass613_11945)
				   .aClass612_7992)).anInt7977;
	((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				 .aClass613_11945)).aClass612_7992).anInt7977
	    = i + 1 & 0x1fff;
	((Class613) ((Class511_Sub2_Sub1_Sub1) this).aClass613_11945)
	    .aClass695_7994.method8175(this, (byte) 24);
    }
    
    void method10813() {
	int i = (((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
					  .aClass613_11945)).aClass612_7992)
		 .anInt7977);
	if ((((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				      .aClass613_11945)).aClass612_7992)
	     .aClass511_Sub2_Sub1_Sub1Array7980[i])
	    != null)
	    ((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				     .aClass613_11945)).aClass612_7992)
		.aClass511_Sub2_Sub1_Sub1Array7980[i].method10810();
	((Class612)
	 (((Class613) ((Class511_Sub2_Sub1_Sub1) this).aClass613_11945)
	  .aClass612_7992)).aClass511_Sub2_Sub1_Sub1Array7980[i]
	    = this;
	((Class511_Sub2_Sub1_Sub1) this).aShort11938
	    = (short) ((Class612) (((Class613) ((Class511_Sub2_Sub1_Sub1)
						this).aClass613_11945)
				   .aClass612_7992)).anInt7977;
	((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				 .aClass613_11945)).aClass612_7992).anInt7977
	    = i + 1 & 0x1fff;
	((Class613) ((Class511_Sub2_Sub1_Sub1) this).aClass613_11945)
	    .aClass695_7994.method8175(this, (byte) 22);
    }
    
    void method10814() {
	((Class612) ((Class613) (((Class511_Sub2_Sub1_Sub1) this)
				 .aClass613_11945)).aClass612_7992)
	    .aClass511_Sub2_Sub1_Sub1Array7980
	    [((Class511_Sub2_Sub1_Sub1) this).aShort11938]
	    = null;
	Class621.aClass511_Sub2_Sub1_Sub1Array8055[(Class621.anInt8057
						    * -1023378695)]
	    = this;
	Class621.anInt8057
	    = (Class621.anInt8057 * -1023378695 + 1 & 0x3ff) * 1919493961;
	method6259(1311561961);
	method9279((byte) 0);
    }
}
