/* Class539 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public final class Class539
{
    Class22 aClass22_7212 = null;
    int anInt7213;
    Class22 aClass22_7214 = null;
    static byte[] aByteArray7215 = new byte[520];
    int anInt7216;
    
    public String method6606() {
	return new StringBuilder().append("").append
		   (-541302287 * ((Class539) this).anInt7216).toString();
    }
    
    public boolean method6607(int i, byte[] is, int i_0_, int i_1_) {
	synchronized (((Class539) this).aClass22_7212) {
	    if (i_0_ < 0 || i_0_ > -1524903545 * ((Class539) this).anInt7213)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("").append
						       ((((Class539) this)
							 .anInt7216)
							* -541302287)
						       .append
						       (',').append
						       (i).append
						       (',').append
						       (i_0_).toString());
	    boolean bool = method6608(i, is, i_0_, true, -845580804);
	    if (!bool)
		bool = method6608(i, is, i_0_, false, 862861222);
	    boolean bool_2_ = bool;
	    return bool_2_;
	}
    }
    
    boolean method6608(int i, byte[] is, int i_3_, boolean bool, int i_4_) {
	synchronized (((Class539) this).aClass22_7212) {
	    boolean bool_5_;
	    try {
		int i_6_;
		if (bool) {
		    if (((Class539) this).aClass22_7214.method664(-1255879663)
			< (long) (6 + i * 6)) {
			boolean bool_7_ = false;
			return bool_7_;
		    }
		    ((Class539) this).aClass22_7214.method678((long) (i * 6));
		    ((Class539) this).aClass22_7214.method667(aByteArray7215,
							      0, 6, 250090811);
		    i_6_ = ((aByteArray7215[5] & 0xff)
			    + (((aByteArray7215[3] & 0xff) << 16)
			       + ((aByteArray7215[4] & 0xff) << 8)));
		    if (i_6_ <= 0
			|| (long) i_6_ > ((Class539) this).aClass22_7212
					     .method664(-1255879663) / 520L) {
			boolean bool_8_ = false;
			return bool_8_;
		    }
		} else {
		    i_6_ = (int) ((((Class539) this).aClass22_7212
				       .method664(-1255879663)
				   + 519L)
				  / 520L);
		    if (i_6_ == 0)
			i_6_ = 1;
		}
		aByteArray7215[0] = (byte) (i_3_ >> 16);
		aByteArray7215[1] = (byte) (i_3_ >> 8);
		aByteArray7215[2] = (byte) i_3_;
		aByteArray7215[3] = (byte) (i_6_ >> 16);
		aByteArray7215[4] = (byte) (i_6_ >> 8);
		aByteArray7215[5] = (byte) i_6_;
		((Class539) this).aClass22_7214.method678((long) (6 * i));
		((Class539) this).aClass22_7214.method668(aByteArray7215, 0, 6,
							  (byte) 21);
		int i_9_ = 0;
		int i_10_ = 0;
		while (i_9_ < i_3_) {
		    int i_11_ = 0;
		    if (bool) {
			((Class539) this).aClass22_7212
			    .method678(520L * (long) i_6_);
			int i_12_;
			int i_13_;
			int i_14_;
			if (i > 65535) {
			    try {
				((Class539) this).aClass22_7212.method667
				    (aByteArray7215, 0, 10, 250090811);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_12_ = ((aByteArray7215[3] & 0xff)
				     + (((aByteArray7215[2] & 0xff) << 8)
					+ (((aByteArray7215[0] & 0xff) << 24)
					   + ((aByteArray7215[1] & 0xff)
					      << 16))));
			    i_13_ = (((aByteArray7215[4] & 0xff) << 8)
				     + (aByteArray7215[5] & 0xff));
			    i_11_ = (((aByteArray7215[7] & 0xff) << 8)
				     + ((aByteArray7215[6] & 0xff) << 16)
				     + (aByteArray7215[8] & 0xff));
			    i_14_ = aByteArray7215[9] & 0xff;
			} else {
			    try {
				((Class539) this).aClass22_7212.method667
				    (aByteArray7215, 0, 8, 250090811);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_12_ = (((aByteArray7215[0] & 0xff) << 8)
				     + (aByteArray7215[1] & 0xff));
			    i_13_ = ((aByteArray7215[3] & 0xff)
				     + ((aByteArray7215[2] & 0xff) << 8));
			    i_11_ = ((aByteArray7215[6] & 0xff)
				     + (((aByteArray7215[5] & 0xff) << 8)
					+ ((aByteArray7215[4] & 0xff) << 16)));
			    i_14_ = aByteArray7215[7] & 0xff;
			}
			if (i != i_12_ || i_13_ != i_10_
			    || (-541302287 * ((Class539) this).anInt7216
				!= i_14_)) {
			    boolean bool_15_ = false;
			    return bool_15_;
			}
			if (i_11_ < 0
			    || (long) i_11_ > (((Class539) this)
						   .aClass22_7212
						   .method664(-1255879663)
					       / 520L)) {
			    boolean bool_16_ = false;
			    return bool_16_;
			}
		    }
		    if (i_11_ == 0) {
			bool = false;
			i_11_ = (int) ((((Class539) this).aClass22_7212
					    .method664(-1255879663)
					+ 519L)
				       / 520L);
			if (0 == i_11_)
			    i_11_++;
			if (i_6_ == i_11_)
			    i_11_++;
		    }
		    if (i > 65535) {
			if (i_3_ - i_9_ <= 510)
			    i_11_ = 0;
			aByteArray7215[0] = (byte) (i >> 24);
			aByteArray7215[1] = (byte) (i >> 16);
			aByteArray7215[2] = (byte) (i >> 8);
			aByteArray7215[3] = (byte) i;
			aByteArray7215[4] = (byte) (i_10_ >> 8);
			aByteArray7215[5] = (byte) i_10_;
			aByteArray7215[6] = (byte) (i_11_ >> 16);
			aByteArray7215[7] = (byte) (i_11_ >> 8);
			aByteArray7215[8] = (byte) i_11_;
			aByteArray7215[9]
			    = (byte) (-541302287
				      * ((Class539) this).anInt7216);
			((Class539) this).aClass22_7212
			    .method678(520L * (long) i_6_);
			((Class539) this).aClass22_7212
			    .method668(aByteArray7215, 0, 10, (byte) 51);
			int i_17_ = i_3_ - i_9_;
			if (i_17_ > 510)
			    i_17_ = 510;
			((Class539) this).aClass22_7212
			    .method668(is, i_9_, i_17_, (byte) 46);
			i_9_ += i_17_;
		    } else {
			if (i_3_ - i_9_ <= 512)
			    i_11_ = 0;
			aByteArray7215[0] = (byte) (i >> 8);
			aByteArray7215[1] = (byte) i;
			aByteArray7215[2] = (byte) (i_10_ >> 8);
			aByteArray7215[3] = (byte) i_10_;
			aByteArray7215[4] = (byte) (i_11_ >> 16);
			aByteArray7215[5] = (byte) (i_11_ >> 8);
			aByteArray7215[6] = (byte) i_11_;
			aByteArray7215[7] = (byte) (((Class539) this).anInt7216
						    * -541302287);
			((Class539) this).aClass22_7212
			    .method678(520L * (long) i_6_);
			((Class539) this).aClass22_7212
			    .method668(aByteArray7215, 0, 8, (byte) 63);
			int i_18_ = i_3_ - i_9_;
			if (i_18_ > 512)
			    i_18_ = 512;
			((Class539) this).aClass22_7212
			    .method668(is, i_9_, i_18_, (byte) 64);
			i_9_ += i_18_;
		    }
		    i_6_ = i_11_;
		    i_10_++;
		}
		bool_5_ = true;
	    } catch (IOException ioexception) {
		boolean bool_19_ = false;
		return bool_19_;
	    }
	    return bool_5_;
	}
    }
    
    public String toString() {
	return new StringBuilder().append("").append
		   (-541302287 * ((Class539) this).anInt7216).toString();
    }
    
    public String method6609() {
	return new StringBuilder().append("").append
		   (-541302287 * ((Class539) this).anInt7216).toString();
    }
    
    public String method6610() {
	return new StringBuilder().append("").append
		   (-541302287 * ((Class539) this).anInt7216).toString();
    }
    
    public Class539(int i, Class22 class22, Class22 class22_20_, int i_21_) {
	((Class539) this).anInt7213 = -1466749736;
	((Class539) this).anInt7216 = i * 1885761297;
	((Class539) this).aClass22_7212 = class22;
	((Class539) this).aClass22_7214 = class22_20_;
	((Class539) this).anInt7213 = -172415945 * i_21_;
    }
    
    public String method6611() {
	return new StringBuilder().append("").append
		   (-541302287 * ((Class539) this).anInt7216).toString();
    }
    
    public byte[] method6612(int i, byte i_22_) {
	synchronized (((Class539) this).aClass22_7212) {
	    byte[] is;
	    try {
		if (((Class539) this).aClass22_7214.method664(-1255879663)
		    < (long) (6 + i * 6)) {
		    byte[] is_23_ = null;
		    return is_23_;
		}
		((Class539) this).aClass22_7214.method678((long) (i * 6));
		((Class539) this).aClass22_7214.method667(aByteArray7215, 0, 6,
							  250090811);
		int i_24_ = (((aByteArray7215[1] & 0xff) << 8)
			     + ((aByteArray7215[0] & 0xff) << 16)
			     + (aByteArray7215[2] & 0xff));
		int i_25_ = ((aByteArray7215[5] & 0xff)
			     + (((aByteArray7215[4] & 0xff) << 8)
				+ ((aByteArray7215[3] & 0xff) << 16)));
		if (i_24_ < 0
		    || i_24_ > -1524903545 * ((Class539) this).anInt7213) {
		    byte[] is_26_ = null;
		    return is_26_;
		}
		if (i_25_ <= 0
		    || (long) i_25_ > ((Class539) this).aClass22_7212
					  .method664(-1255879663) / 520L) {
		    byte[] is_27_ = null;
		    return is_27_;
		}
		byte[] is_28_ = new byte[i_24_];
		int i_29_ = 0;
		int i_30_ = 0;
		while (i_29_ < i_24_) {
		    if (0 == i_25_) {
			byte[] is_31_ = null;
			return is_31_;
		    }
		    ((Class539) this).aClass22_7212
			.method678(520L * (long) i_25_);
		    int i_32_ = i_24_ - i_29_;
		    int i_33_;
		    int i_34_;
		    int i_35_;
		    int i_36_;
		    int i_37_;
		    if (i > 65535) {
			if (i_32_ > 510)
			    i_32_ = 510;
			i_33_ = 10;
			((Class539) this).aClass22_7212.method667
			    (aByteArray7215, 0, i_32_ + i_33_, 250090811);
			i_34_ = ((aByteArray7215[3] & 0xff)
				 + (((aByteArray7215[0] & 0xff) << 24)
				    + ((aByteArray7215[1] & 0xff) << 16)
				    + ((aByteArray7215[2] & 0xff) << 8)));
			i_35_ = ((aByteArray7215[5] & 0xff)
				 + ((aByteArray7215[4] & 0xff) << 8));
			i_36_ = ((aByteArray7215[8] & 0xff)
				 + (((aByteArray7215[6] & 0xff) << 16)
				    + ((aByteArray7215[7] & 0xff) << 8)));
			i_37_ = aByteArray7215[9] & 0xff;
		    } else {
			if (i_32_ > 512)
			    i_32_ = 512;
			i_33_ = 8;
			((Class539) this).aClass22_7212.method667
			    (aByteArray7215, 0, i_33_ + i_32_, 250090811);
			i_34_ = (((aByteArray7215[0] & 0xff) << 8)
				 + (aByteArray7215[1] & 0xff));
			i_35_ = ((aByteArray7215[3] & 0xff)
				 + ((aByteArray7215[2] & 0xff) << 8));
			i_36_ = ((aByteArray7215[6] & 0xff)
				 + (((aByteArray7215[5] & 0xff) << 8)
				    + ((aByteArray7215[4] & 0xff) << 16)));
			i_37_ = aByteArray7215[7] & 0xff;
		    }
		    if (i_34_ != i || i_35_ != i_30_
			|| i_37_ != -541302287 * ((Class539) this).anInt7216) {
			byte[] is_38_ = null;
			return is_38_;
		    }
		    if (i_36_ < 0
			|| (long) i_36_ > ((Class539) this).aClass22_7212
					      .method664(-1255879663) / 520L) {
			byte[] is_39_ = null;
			return is_39_;
		    }
		    int i_40_ = i_32_ + i_33_;
		    for (int i_41_ = i_33_; i_41_ < i_40_; i_41_++)
			is_28_[i_29_++] = aByteArray7215[i_41_];
		    i_25_ = i_36_;
		    i_30_++;
		}
		is = is_28_;
	    } catch (IOException ioexception) {
		byte[] is_42_ = null;
		return is_42_;
	    }
	    return is;
	}
    }
    
    static final void method6613(Class648 class648, int i) {
	int i_43_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_43_, (byte) -56);
	int i_44_ = -1;
	int i_45_ = -1;
	Class243 class243
	    = class229.method3197(Class587.aClass173_7714, 2142988956);
	if (null != class243) {
	    i_44_ = -728362293 * class243.anInt2725;
	    i_45_ = class243.anInt2728 * 1122147715;
	}
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_44_;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_45_;
    }
    
    static final void method6614(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub22_10588
		  .method9998(174218556);
    }
    
    static boolean method6615(int i, int i_46_) {
	return 11 == i || i == 5 || i == 15;
    }
    
    static final void method6616(int i, int i_47_, byte i_48_) {
	if (Class256.method3468(i, null, (byte) 0))
	    Class301.method4026((Class380.aClass226Array3970[i]
				 .aClass229Array2336),
				i_47_, (byte) 125);
    }
}
