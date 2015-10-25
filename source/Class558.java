/* Class558 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class558
{
    byte[] aByteArray7468;
    SourceDataLine aSourceDataLine7469;
    int anInt7470;
    int anInt7471;
    int anInt7472;
    int anInt7473;
    byte[] aByteArray7474;
    float aFloat7475;
    boolean aBool7476;
    int anInt7477;
    List aList7478;
    Class364_Sub1 this$0;
    static int[] anIntArray7479;
    
    void method6762(int i) {
	if (((Class558) this).aBool7476) {
	    if (null != ((Class558) this).aSourceDataLine7469)
		((Class558) this).anInt7470
		    = (((Class558) this).aSourceDataLine7469.available()
		       * -285775381);
	}
    }
    
    void method6763(int i) {
	((Class558) this).anInt7473 = 0;
	method6764((byte) -65);
	int i_0_;
	for (/**/; ((Class558) this).anInt7473 * -1874828709 > 0;
	     ((Class558) this).anInt7473 -= i_0_ * 606207443) {
	    i_0_ = ((Class558) this).anInt7473 * -1874828709;
	    if (((Class558) this).anInt7472 * 1840563491 + i_0_
		>= ((Class558) this).aByteArray7474.length)
		i_0_ = (((Class558) this).aByteArray7474.length
			- ((Class558) this).anInt7472 * 1840563491);
	    ((Class558) this).aSourceDataLine7469.write
		(((Class558) this).aByteArray7474,
		 1840563491 * ((Class558) this).anInt7472, i_0_);
	    for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
		((Class558) this).aByteArray7474
		    [1840563491 * ((Class558) this).anInt7472 + i_1_]
		    = (byte) 0;
	    ((Class558) this).anInt7472 += -233205109 * i_0_;
	    ((Class558) this).anInt7472
		= (((Class558) this).anInt7472 * 1840563491
		   % ((Class558) this).aByteArray7474.length * -233205109);
	}
    }
    
    void method6764(byte i) {
	synchronized (this) {
	    int i_2_ = 2147483647;
	    double d
		= (double) (-1741534583 * ((Class558) this).anInt7471 / 8
			    * (((Class558) this).anInt7477 * -1976799581));
	    boolean bool = false;
	    Iterator iterator = ((Class558) this).aList7478.iterator();
	    while (iterator.hasNext()) {
		Class531 class531 = (Class531) iterator.next();
		int i_3_ = (((Class531) class531).aByteArray7115.length
			    - 1941408267 * ((Class531) class531).anInt7114);
		if (((Class531) class531).aFloat7123
		    != ((Class558) this).aFloat7475) {
		    i_3_ *= (((Class558) this).aFloat7475
			     / ((Class531) class531).aFloat7123);
		    i_3_ = (int) (d * Math.ceil((double) i_3_ / d));
		}
		((Class531) class531).anInt7120 = i_3_ * -24588081;
		if (i_3_ > 0 && i_3_ < i_2_) {
		    bool = true;
		    i_2_ = i_3_;
		}
	    }
	    if (i_2_ > -1507297597 * ((Class558) this).anInt7470)
		i_2_ = -1507297597 * ((Class558) this).anInt7470;
	    if (0 == i_2_ || false == bool) {
		/* empty */
	    } else {
		int i_4_ = ((Class558) this).anInt7471 * -1741534583 / 8;
		Iterator iterator_5_ = ((Class558) this).aList7478.iterator();
		while (iterator_5_.hasNext()) {
		    Class531 class531 = (Class531) iterator_5_.next();
		    if (((Class531) class531).anInt7120 * 1665807919 >= i_2_) {
			int i_6_ = 1840563491 * ((Class558) this).anInt7472;
			int i_7_ = 0;
			int i_8_
			    = ((Class531) class531).anInt7122 * 1271132363 / 8;
			double d_9_ = 0.0;
			int i_10_ = 0;
			double d_11_ = (double) ((Class558) this).aFloat7475;
			double d_12_
			    = (double) ((Class531) class531).aFloat7123;
			int i_13_
			    = 489756355 * ((Class531) class531).anInt7117;
			for (/**/;
			     (1665807919 * ((Class531) class531).anInt7120 > 0
			      && i_7_ < i_2_);
			     i_7_ += i_8_) {
			    short i_14_ = 0;
			    short i_15_ = 0;
			    byte[] is = ((Class558) this).aByteArray7468;
			    for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
				is[i_16_] = (((Class558) this).aByteArray7474
					     [i_16_ + i_6_]);
				i_14_ |= (is[i_16_] & 0xff) << 8 * i_16_;
			    }
			    if (((Class558) this).aFloat7475
				!= ((Class531) class531).aFloat7123) {
				byte[] is_17_
				    = ((Class531) class531).aByteArray7118;
				float f = (float) (d_9_ / d_11_ * d_12_);
				float f_18_ = (float) Math.floor((double) f);
				short i_19_ = 0;
				short i_20_ = 0;
				int i_21_ = (int) Math.floor((double) f);
				int i_22_ = (int) Math.ceil((double) f);
				i_21_ = (i_10_ * is_17_.length
					 + i_21_ * (is_17_.length
						    * (-738907699
						       * (((Class531) class531)
							  .anInt7119))));
				i_22_ = (is_17_.length * i_10_
					 + (((Class531) class531).anInt7119
					    * -738907699 * is_17_.length
					    * i_22_));
				i_21_ += i_13_;
				i_22_ += i_13_;
				i_21_ %= (((Class531) class531)
					  .aByteArray7115).length;
				i_22_ %= (((Class531) class531)
					  .aByteArray7115).length;
				for (int i_23_ = 0; i_23_ < is_17_.length;
				     i_23_++) {
				    is_17_[i_23_]
					= (((Class531) class531).aByteArray7115
					   [i_21_ + i_23_]);
				    i_19_
					|= (is_17_[i_23_] & 0xff) << i_23_ * 8;
				}
				for (int i_24_ = 0; i_24_ < is_17_.length;
				     i_24_++) {
				    is_17_[i_24_]
					= (((Class531) class531).aByteArray7115
					   [i_24_ + i_22_]);
				    i_20_
					|= (is_17_[i_24_] & 0xff) << 8 * i_24_;
				}
				float f_25_ = f - f_18_;
				if (f_25_ < 0.0F || f_25_ > 1.0F)
				    throw new RuntimeException("");
				float f_26_ = (float) (i_20_ - i_19_);
				i_15_ = (short) (int) (f_26_ * f_25_
						       + (float) i_19_);
				i_10_ = ++i_10_ % (-738907699
						   * (((Class531) class531)
						      .anInt7119));
				if (0 == i_10_)
				    d_9_++;
			    } else {
				byte[] is_27_
				    = ((Class531) class531).aByteArray7118;
				for (int i_28_ = 0; i_28_ < is_27_.length;
				     i_28_++) {
				    is_27_[i_28_]
					= (((Class531) class531).aByteArray7115
					   [(((Class531) class531).anInt7117
					     * 489756355) + i_28_]);
				    i_15_
					|= (is_27_[i_28_] & 0xff) << i_28_ * 8;
				}
				((Class531) class531).anInt7117
				    += i_8_ * -1952724501;
				Class531 class531_29_;
				((Class531) (class531_29_
					     = class531)).anInt7117
				    = (-1952724501
				       * (489756355
					  * ((Class531) class531_29_).anInt7117
					  % (((Class531) class531)
					     .aByteArray7115).length));
				((Class531) class531).anInt7114
				    += 193278371 * i_8_;
			    }
			    i_15_ += i_14_;
			    if (i_15_ > 32767)
				i_15_ = (short) 32767;
			    if (i_15_ < -32768)
				i_15_ = (short) -32768;
			    ((Class558) this).aByteArray7474[i_6_]
				= (byte) i_15_;
			    ((Class558) this).aByteArray7474[1 + i_6_]
				= (byte) (i_15_ >> 8);
			    i_6_ += i_4_;
			    i_6_ %= ((Class558) this).aByteArray7474.length;
			}
			if (((Class531) class531).aFloat7123
			    != ((Class558) this).aFloat7475) {
			    double d_30_ = (double) i_2_ * (d_12_ / d_11_);
			    int i_31_ = (int) (d * Math.ceil(d_30_ / d));
			    ((Class531) class531).anInt7117
				+= i_31_ * -1952724501;
			    Class531 class531_32_;
			    ((Class531) (class531_32_ = class531)).anInt7117
				= (489756355
				   * ((Class531) class531_32_).anInt7117
				   % (((Class531) class531)
				      .aByteArray7115).length
				   * -1952724501);
			    ((Class531) class531).anInt7114
				+= i_31_ * 193278371;
			}
		    }
		}
		((Class558) this).anInt7473 = i_2_ * 606207443;
	    }
	}
    }
    
    void method6765(Class531 class531, int i) {
	((Class558) this).aList7478.remove(class531);
    }
    
    void method6766() {
	if (((Class558) this).aBool7476) {
	    if (null != ((Class558) this).aSourceDataLine7469)
		((Class558) this).anInt7470
		    = (((Class558) this).aSourceDataLine7469.available()
		       * -285775381);
	}
    }
    
    void method6767() {
	if (((Class558) this).aBool7476) {
	    if (null != ((Class558) this).aSourceDataLine7469)
		((Class558) this).anInt7470
		    = (((Class558) this).aSourceDataLine7469.available()
		       * -285775381);
	}
    }
    
    void method6768() {
	if (((Class558) this).aBool7476) {
	    if (null != ((Class558) this).aSourceDataLine7469)
		((Class558) this).anInt7470
		    = (((Class558) this).aSourceDataLine7469.available()
		       * -285775381);
	}
    }
    
    void method6769(Class531 class531, int i) {
	((Class558) this).aList7478.add(class531);
    }
    
    void method6770() {
	synchronized (this) {
	    int i = 2147483647;
	    double d
		= (double) (-1741534583 * ((Class558) this).anInt7471 / 8
			    * (((Class558) this).anInt7477 * -1976799581));
	    boolean bool = false;
	    Iterator iterator = ((Class558) this).aList7478.iterator();
	    while (iterator.hasNext()) {
		Class531 class531 = (Class531) iterator.next();
		int i_33_ = (((Class531) class531).aByteArray7115.length
			     - 1941408267 * ((Class531) class531).anInt7114);
		if (((Class531) class531).aFloat7123
		    != ((Class558) this).aFloat7475) {
		    i_33_ *= (((Class558) this).aFloat7475
			      / ((Class531) class531).aFloat7123);
		    i_33_ = (int) (d * Math.ceil((double) i_33_ / d));
		}
		((Class531) class531).anInt7120 = i_33_ * -24588081;
		if (i_33_ > 0 && i_33_ < i) {
		    bool = true;
		    i = i_33_;
		}
	    }
	    if (i > -1507297597 * ((Class558) this).anInt7470)
		i = -1507297597 * ((Class558) this).anInt7470;
	    if (0 == i || false == bool) {
		/* empty */
	    } else {
		int i_34_ = ((Class558) this).anInt7471 * -1741534583 / 8;
		Iterator iterator_35_ = ((Class558) this).aList7478.iterator();
		while (iterator_35_.hasNext()) {
		    Class531 class531 = (Class531) iterator_35_.next();
		    if (((Class531) class531).anInt7120 * 1665807919 >= i) {
			int i_36_ = 1840563491 * ((Class558) this).anInt7472;
			int i_37_ = 0;
			int i_38_
			    = ((Class531) class531).anInt7122 * 1271132363 / 8;
			double d_39_ = 0.0;
			int i_40_ = 0;
			double d_41_ = (double) ((Class558) this).aFloat7475;
			double d_42_
			    = (double) ((Class531) class531).aFloat7123;
			int i_43_
			    = 489756355 * ((Class531) class531).anInt7117;
			for (/**/;
			     (1665807919 * ((Class531) class531).anInt7120 > 0
			      && i_37_ < i);
			     i_37_ += i_38_) {
			    short i_44_ = 0;
			    short i_45_ = 0;
			    byte[] is = ((Class558) this).aByteArray7468;
			    for (int i_46_ = 0; i_46_ < is.length; i_46_++) {
				is[i_46_] = (((Class558) this).aByteArray7474
					     [i_46_ + i_36_]);
				i_44_ |= (is[i_46_] & 0xff) << 8 * i_46_;
			    }
			    if (((Class558) this).aFloat7475
				!= ((Class531) class531).aFloat7123) {
				byte[] is_47_
				    = ((Class531) class531).aByteArray7118;
				float f = (float) (d_39_ / d_41_ * d_42_);
				float f_48_ = (float) Math.floor((double) f);
				short i_49_ = 0;
				short i_50_ = 0;
				int i_51_ = (int) Math.floor((double) f);
				int i_52_ = (int) Math.ceil((double) f);
				i_51_ = (i_40_ * is_47_.length
					 + i_51_ * (is_47_.length
						    * (-738907699
						       * (((Class531) class531)
							  .anInt7119))));
				i_52_ = (is_47_.length * i_40_
					 + (((Class531) class531).anInt7119
					    * -738907699 * is_47_.length
					    * i_52_));
				i_51_ += i_43_;
				i_52_ += i_43_;
				i_51_ %= (((Class531) class531)
					  .aByteArray7115).length;
				i_52_ %= (((Class531) class531)
					  .aByteArray7115).length;
				for (int i_53_ = 0; i_53_ < is_47_.length;
				     i_53_++) {
				    is_47_[i_53_]
					= (((Class531) class531).aByteArray7115
					   [i_51_ + i_53_]);
				    i_49_
					|= (is_47_[i_53_] & 0xff) << i_53_ * 8;
				}
				for (int i_54_ = 0; i_54_ < is_47_.length;
				     i_54_++) {
				    is_47_[i_54_]
					= (((Class531) class531).aByteArray7115
					   [i_54_ + i_52_]);
				    i_50_
					|= (is_47_[i_54_] & 0xff) << 8 * i_54_;
				}
				float f_55_ = f - f_48_;
				if (f_55_ < 0.0F || f_55_ > 1.0F)
				    throw new RuntimeException("");
				float f_56_ = (float) (i_50_ - i_49_);
				i_45_ = (short) (int) (f_56_ * f_55_
						       + (float) i_49_);
				i_40_ = ++i_40_ % (-738907699
						   * (((Class531) class531)
						      .anInt7119));
				if (0 == i_40_)
				    d_39_++;
			    } else {
				byte[] is_57_
				    = ((Class531) class531).aByteArray7118;
				for (int i_58_ = 0; i_58_ < is_57_.length;
				     i_58_++) {
				    is_57_[i_58_]
					= (((Class531) class531).aByteArray7115
					   [(((Class531) class531).anInt7117
					     * 489756355) + i_58_]);
				    i_45_
					|= (is_57_[i_58_] & 0xff) << i_58_ * 8;
				}
				((Class531) class531).anInt7117
				    += i_38_ * -1952724501;
				Class531 class531_59_;
				((Class531) (class531_59_
					     = class531)).anInt7117
				    = (-1952724501
				       * (489756355
					  * ((Class531) class531_59_).anInt7117
					  % (((Class531) class531)
					     .aByteArray7115).length));
				((Class531) class531).anInt7114
				    += 193278371 * i_38_;
			    }
			    i_45_ += i_44_;
			    if (i_45_ > 32767)
				i_45_ = (short) 32767;
			    if (i_45_ < -32768)
				i_45_ = (short) -32768;
			    ((Class558) this).aByteArray7474[i_36_]
				= (byte) i_45_;
			    ((Class558) this).aByteArray7474[1 + i_36_]
				= (byte) (i_45_ >> 8);
			    i_36_ += i_34_;
			    i_36_ %= ((Class558) this).aByteArray7474.length;
			}
			if (((Class531) class531).aFloat7123
			    != ((Class558) this).aFloat7475) {
			    double d_60_ = (double) i * (d_42_ / d_41_);
			    int i_61_ = (int) (d * Math.ceil(d_60_ / d));
			    ((Class531) class531).anInt7117
				+= i_61_ * -1952724501;
			    Class531 class531_62_;
			    ((Class531) (class531_62_ = class531)).anInt7117
				= (489756355
				   * ((Class531) class531_62_).anInt7117
				   % (((Class531) class531)
				      .aByteArray7115).length
				   * -1952724501);
			    ((Class531) class531).anInt7114
				+= i_61_ * 193278371;
			}
		    }
		}
		((Class558) this).anInt7473 = i * 606207443;
	    }
	}
    }
    
    void method6771() {
	synchronized (this) {
	    int i = 2147483647;
	    double d
		= (double) (-1741534583 * ((Class558) this).anInt7471 / 8
			    * (((Class558) this).anInt7477 * -1976799581));
	    boolean bool = false;
	    Iterator iterator = ((Class558) this).aList7478.iterator();
	    while (iterator.hasNext()) {
		Class531 class531 = (Class531) iterator.next();
		int i_63_ = (((Class531) class531).aByteArray7115.length
			     - 1941408267 * ((Class531) class531).anInt7114);
		if (((Class531) class531).aFloat7123
		    != ((Class558) this).aFloat7475) {
		    i_63_ *= (((Class558) this).aFloat7475
			      / ((Class531) class531).aFloat7123);
		    i_63_ = (int) (d * Math.ceil((double) i_63_ / d));
		}
		((Class531) class531).anInt7120 = i_63_ * -24588081;
		if (i_63_ > 0 && i_63_ < i) {
		    bool = true;
		    i = i_63_;
		}
	    }
	    if (i > -1507297597 * ((Class558) this).anInt7470)
		i = -1507297597 * ((Class558) this).anInt7470;
	    if (0 == i || false == bool) {
		/* empty */
	    } else {
		int i_64_ = ((Class558) this).anInt7471 * -1741534583 / 8;
		Iterator iterator_65_ = ((Class558) this).aList7478.iterator();
		while (iterator_65_.hasNext()) {
		    Class531 class531 = (Class531) iterator_65_.next();
		    if (((Class531) class531).anInt7120 * 1665807919 >= i) {
			int i_66_ = 1840563491 * ((Class558) this).anInt7472;
			int i_67_ = 0;
			int i_68_
			    = ((Class531) class531).anInt7122 * 1271132363 / 8;
			double d_69_ = 0.0;
			int i_70_ = 0;
			double d_71_ = (double) ((Class558) this).aFloat7475;
			double d_72_
			    = (double) ((Class531) class531).aFloat7123;
			int i_73_
			    = 489756355 * ((Class531) class531).anInt7117;
			for (/**/;
			     (1665807919 * ((Class531) class531).anInt7120 > 0
			      && i_67_ < i);
			     i_67_ += i_68_) {
			    short i_74_ = 0;
			    short i_75_ = 0;
			    byte[] is = ((Class558) this).aByteArray7468;
			    for (int i_76_ = 0; i_76_ < is.length; i_76_++) {
				is[i_76_] = (((Class558) this).aByteArray7474
					     [i_76_ + i_66_]);
				i_74_ |= (is[i_76_] & 0xff) << 8 * i_76_;
			    }
			    if (((Class558) this).aFloat7475
				!= ((Class531) class531).aFloat7123) {
				byte[] is_77_
				    = ((Class531) class531).aByteArray7118;
				float f = (float) (d_69_ / d_71_ * d_72_);
				float f_78_ = (float) Math.floor((double) f);
				short i_79_ = 0;
				short i_80_ = 0;
				int i_81_ = (int) Math.floor((double) f);
				int i_82_ = (int) Math.ceil((double) f);
				i_81_ = (i_70_ * is_77_.length
					 + i_81_ * (is_77_.length
						    * (-738907699
						       * (((Class531) class531)
							  .anInt7119))));
				i_82_ = (is_77_.length * i_70_
					 + (((Class531) class531).anInt7119
					    * -738907699 * is_77_.length
					    * i_82_));
				i_81_ += i_73_;
				i_82_ += i_73_;
				i_81_ %= (((Class531) class531)
					  .aByteArray7115).length;
				i_82_ %= (((Class531) class531)
					  .aByteArray7115).length;
				for (int i_83_ = 0; i_83_ < is_77_.length;
				     i_83_++) {
				    is_77_[i_83_]
					= (((Class531) class531).aByteArray7115
					   [i_81_ + i_83_]);
				    i_79_
					|= (is_77_[i_83_] & 0xff) << i_83_ * 8;
				}
				for (int i_84_ = 0; i_84_ < is_77_.length;
				     i_84_++) {
				    is_77_[i_84_]
					= (((Class531) class531).aByteArray7115
					   [i_84_ + i_82_]);
				    i_80_
					|= (is_77_[i_84_] & 0xff) << 8 * i_84_;
				}
				float f_85_ = f - f_78_;
				if (f_85_ < 0.0F || f_85_ > 1.0F)
				    throw new RuntimeException("");
				float f_86_ = (float) (i_80_ - i_79_);
				i_75_ = (short) (int) (f_86_ * f_85_
						       + (float) i_79_);
				i_70_ = ++i_70_ % (-738907699
						   * (((Class531) class531)
						      .anInt7119));
				if (0 == i_70_)
				    d_69_++;
			    } else {
				byte[] is_87_
				    = ((Class531) class531).aByteArray7118;
				for (int i_88_ = 0; i_88_ < is_87_.length;
				     i_88_++) {
				    is_87_[i_88_]
					= (((Class531) class531).aByteArray7115
					   [(((Class531) class531).anInt7117
					     * 489756355) + i_88_]);
				    i_75_
					|= (is_87_[i_88_] & 0xff) << i_88_ * 8;
				}
				((Class531) class531).anInt7117
				    += i_68_ * -1952724501;
				Class531 class531_89_;
				((Class531) (class531_89_
					     = class531)).anInt7117
				    = (-1952724501
				       * (489756355
					  * ((Class531) class531_89_).anInt7117
					  % (((Class531) class531)
					     .aByteArray7115).length));
				((Class531) class531).anInt7114
				    += 193278371 * i_68_;
			    }
			    i_75_ += i_74_;
			    if (i_75_ > 32767)
				i_75_ = (short) 32767;
			    if (i_75_ < -32768)
				i_75_ = (short) -32768;
			    ((Class558) this).aByteArray7474[i_66_]
				= (byte) i_75_;
			    ((Class558) this).aByteArray7474[1 + i_66_]
				= (byte) (i_75_ >> 8);
			    i_66_ += i_64_;
			    i_66_ %= ((Class558) this).aByteArray7474.length;
			}
			if (((Class531) class531).aFloat7123
			    != ((Class558) this).aFloat7475) {
			    double d_90_ = (double) i * (d_72_ / d_71_);
			    int i_91_ = (int) (d * Math.ceil(d_90_ / d));
			    ((Class531) class531).anInt7117
				+= i_91_ * -1952724501;
			    Class531 class531_92_;
			    ((Class531) (class531_92_ = class531)).anInt7117
				= (489756355
				   * ((Class531) class531_92_).anInt7117
				   % (((Class531) class531)
				      .aByteArray7115).length
				   * -1952724501);
			    ((Class531) class531).anInt7114
				+= i_91_ * 193278371;
			}
		    }
		}
		((Class558) this).anInt7473 = i * 606207443;
	    }
	}
    }
    
    void method6772() {
	((Class558) this).anInt7473 = 0;
	method6764((byte) -10);
	int i;
	for (/**/; ((Class558) this).anInt7473 * -1874828709 > 0;
	     ((Class558) this).anInt7473 -= i * 606207443) {
	    i = ((Class558) this).anInt7473 * -1874828709;
	    if (((Class558) this).anInt7472 * 1840563491 + i
		>= ((Class558) this).aByteArray7474.length)
		i = (((Class558) this).aByteArray7474.length
		     - ((Class558) this).anInt7472 * 1840563491);
	    ((Class558) this).aSourceDataLine7469.write
		(((Class558) this).aByteArray7474,
		 1840563491 * ((Class558) this).anInt7472, i);
	    for (int i_93_ = 0; i_93_ < i; i_93_++)
		((Class558) this).aByteArray7474
		    [1840563491 * ((Class558) this).anInt7472 + i_93_]
		    = (byte) 0;
	    ((Class558) this).anInt7472 += -233205109 * i;
	    ((Class558) this).anInt7472
		= (((Class558) this).anInt7472 * 1840563491
		   % ((Class558) this).aByteArray7474.length * -233205109);
	}
    }
    
    Class558(Class364_Sub1 class364_sub1, float f, int i) {
	((Class558) this).this$0 = class364_sub1;
	((Class558) this).anInt7471 = -870007920;
	((Class558) this).anInt7477 = 756378134;
	((Class558) this).aList7478 = new ArrayList();
	if (!((Class558) this).aBool7476) {
	    ((Class558) this).aFloat7475 = f;
	    if (((Class558) this).anInt7471 * -1741534583 > 16)
		throw new RuntimeException("");
	    try {
		AudioFormat audioformat
		    = new AudioFormat(((Class558) this).aFloat7475,
				      (((Class558) this).anInt7471
				       * -1741534583),
				      (-1976799581
				       * ((Class558) this).anInt7477),
				      true, false);
		try {
		    DataLine.Info info
			= (new DataLine.Info
			   (javax.sound.sampled.SourceDataLine.class,
			    audioformat, i));
		    ((Class558) this).aSourceDataLine7469
			= (SourceDataLine) AudioSystem.getLine(info);
		} catch (IllegalArgumentException illegalargumentexception) {
		    return;
		}
		((Class558) this).aSourceDataLine7469.open(audioformat, i);
		((Class558) this).aSourceDataLine7469.start();
	    } catch (LineUnavailableException lineunavailableexception) {
		return;
	    }
	    ((Class558) this).aByteArray7474 = new byte[i];
	    ((Class558) this).aByteArray7468
		= new byte[-1741534583 * ((Class558) this).anInt7471 / 8];
	    ((Class558) this).anInt7472 = 0;
	    ((Class558) this).aBool7476 = true;
	}
    }
    
    void method6773() {
	((Class558) this).anInt7473 = 0;
	method6764((byte) -41);
	int i;
	for (/**/; ((Class558) this).anInt7473 * -1874828709 > 0;
	     ((Class558) this).anInt7473 -= i * 606207443) {
	    i = ((Class558) this).anInt7473 * -1874828709;
	    if (((Class558) this).anInt7472 * 1840563491 + i
		>= ((Class558) this).aByteArray7474.length)
		i = (((Class558) this).aByteArray7474.length
		     - ((Class558) this).anInt7472 * 1840563491);
	    ((Class558) this).aSourceDataLine7469.write
		(((Class558) this).aByteArray7474,
		 1840563491 * ((Class558) this).anInt7472, i);
	    for (int i_94_ = 0; i_94_ < i; i_94_++)
		((Class558) this).aByteArray7474
		    [1840563491 * ((Class558) this).anInt7472 + i_94_]
		    = (byte) 0;
	    ((Class558) this).anInt7472 += -233205109 * i;
	    ((Class558) this).anInt7472
		= (((Class558) this).anInt7472 * 1840563491
		   % ((Class558) this).aByteArray7474.length * -233205109);
	}
    }
    
    static final void method6774(Class648 class648, short i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_95_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929]);
	boolean bool = ((((Class648) class648).anIntArray8394
			 [1 + 717927929 * ((Class648) class648).anInt8395])
			== 1);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub24_10577),
						 i_95_, 1936848869);
	if (!bool)
	    Class514.aClass528_Sub38_6967.method9556((Class514
						      .aClass528_Sub38_6967
						      .aClass691_Sub35_10597),
						     0, 187200699);
	Class243.method3387(2146476069);
	client.aBool11161 = false;
    }
    
    static int method6775(Iterable iterable, int i) {
	int i_96_ = -1;
	Iterator iterator = iterable.iterator();
	while (iterator.hasNext()) {
	    IClientEnum iClientEnum = (IClientEnum) iterator.next();
	    if (iClientEnum.method68() > i_96_)
		i_96_ = iClientEnum.method68();
	}
	return (i_96_ + 8) / 8;
    }
    
    public static int method6776(short i) {
	synchronized (PlayerModel.aClass186_7972) {
	    int i_97_ = PlayerModel.aClass186_7972.method2734(1884259624);
	    return i_97_;
	}
    }
}
