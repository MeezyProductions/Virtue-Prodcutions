/* Class524 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Class524
{
    short[] aShortArray7054;
    Class324 aClass324_7055;
    int anInt7056;
    Class532 aClass532_7057;
    short[] aShortArray7058;
    short[] aShortArray7059;
    Class315[] aClass315Array7060;
    short[] aShortArray7061;
    Class529 aClass529_7062;
    short[] aShortArray7063;
    Class315 aClass315_7064;
    short[] aShortArray7065;
    Class532 aClass532_7066;
    short[] aShortArray7067;
    Class508 aClass508_7068 = new Class508();
    int anInt7069;
    int anInt7070;
    
    boolean method6374(int i, int i_0_, int i_1_) {
	if (i > 8 || i_0_ > 4 || i_1_ > 4)
	    return false;
	((Class524) this).aClass529_7062.method6454(i_0_, i, -541735869);
	int i_2_ = 1 << i_1_;
	((Class524) this).aClass532_7066.method6474(i_2_, (short) 25582);
	((Class524) this).aClass532_7057.method6474(i_2_, (short) 20494);
	((Class524) this).anInt7070 = -1159295101 * (i_2_ - 1);
	return true;
    }
    
    boolean method6375(int i) {
	if (i < 0)
	    return false;
	if (i != 1956175163 * ((Class524) this).anInt7056) {
	    ((Class524) this).anInt7056 = 1212543987 * i;
	    ((Class524) this).anInt7069
		= (Math.max(((Class524) this).anInt7056 * 1956175163, 1)
		   * -103236149);
	    ((Class524) this).aClass508_7068.method6159
		(Math.max(((Class524) this).anInt7069 * -151486493, 4096),
		 1478258034);
	}
	return true;
    }
    
    Class524() {
	((Class524) this).aClass324_7055 = new Class324();
	((Class524) this).aShortArray7054 = new short[192];
	((Class524) this).aShortArray7067 = new short[12];
	((Class524) this).aShortArray7058 = new short[12];
	((Class524) this).aShortArray7059 = new short[12];
	((Class524) this).aShortArray7065 = new short[12];
	((Class524) this).aShortArray7061 = new short[192];
	((Class524) this).aClass315Array7060 = new Class315[4];
	((Class524) this).aShortArray7063 = new short[114];
	((Class524) this).aClass315_7064 = new Class315(4);
	((Class524) this).aClass532_7066 = new Class532(this);
	((Class524) this).aClass532_7057 = new Class532(this);
	((Class524) this).aClass529_7062 = new Class529(this);
	((Class524) this).anInt7056 = -1212543987;
	((Class524) this).anInt7069 = 103236149;
	for (int i = 0; i < 4; i++)
	    ((Class524) this).aClass315Array7060[i] = new Class315(6);
    }
    
    void method6376(int i) throws IOException {
	((Class524) this).aClass508_7068.method6157(false, 1074608864);
	Class253.method3439(((Class524) this).aShortArray7054, (byte) -75);
	Class253.method3439(((Class524) this).aShortArray7061, (byte) -27);
	Class253.method3439(((Class524) this).aShortArray7067, (byte) -121);
	Class253.method3439(((Class524) this).aShortArray7058, (byte) -25);
	Class253.method3439(((Class524) this).aShortArray7059, (byte) -12);
	Class253.method3439(((Class524) this).aShortArray7065, (byte) -124);
	Class253.method3439(((Class524) this).aShortArray7063, (byte) -70);
	((Class524) this).aClass529_7062.method6451((byte) 0);
	for (int i_3_ = 0; i_3_ < 4; i_3_++)
	    ((Class524) this).aClass315Array7060[i_3_].method4157(946487593);
	((Class524) this).aClass532_7066.method6476(412439590);
	((Class524) this).aClass532_7057.method6476(-157904337);
	((Class524) this).aClass315_7064.method4157(273284800);
	((Class524) this).aClass324_7055.method4215(71164929);
    }
    
    boolean method6377(InputStream inputstream, OutputStream outputstream,
		       long l) throws IOException {
	((Class524) this).aClass324_7055.method4216(inputstream, 1896400781);
	((Class524) this).aClass508_7068.method6155(outputstream, 2009686272);
	method6376(1754555951);
	int i = Class242.method3376((byte) -125);
	int i_4_ = 0;
	int i_5_ = 0;
	int i_6_ = 0;
	int i_7_ = 0;
	long l_8_ = 0L;
	byte i_9_ = 0;
	while (l < 0L || l_8_ < l) {
	    int i_10_ = (int) l_8_ & ((Class524) this).anInt7070 * -2110752981;
	    if (((Class524) this).aClass324_7055.method4217((((Class524) this)
							     .aShortArray7054),
							    (i << 4) + i_10_,
							    -1878088151)
		== 0) {
		Class521 class521
		    = ((Class524) this).aClass529_7062
			  .method6453((int) l_8_, i_9_, 1007378345);
		if (!Class511_Sub2.method9283(i, 1361901758))
		    i_9_
			= class521.method6355(((Class524) this).aClass324_7055,
					      (((Class524) this)
						   .aClass508_7068.method6161
					       (i_4_, 1632534981)),
					      1133557169);
		else
		    i_9_
			= class521.method6351(((Class524) this).aClass324_7055,
					      (byte) -43);
		((Class524) this).aClass508_7068.method6160(i_9_, (byte) 58);
		i = Class658.method7855(i, 1759853076);
		l_8_++;
	    } else {
		int i_11_;
		if ((((Class524) this).aClass324_7055.method4217
		     (((Class524) this).aShortArray7067, i, 1952940865))
		    == 1) {
		    i_11_ = 0;
		    if ((((Class524) this).aClass324_7055.method4217
			 (((Class524) this).aShortArray7058, i, -263815872))
			== 0) {
			if ((((Class524) this).aClass324_7055.method4217
			     (((Class524) this).aShortArray7061,
			      i_10_ + (i << 4), 589042686))
			    == 0) {
			    i = Class421.method5047(i, -238748896);
			    i_11_ = 1;
			}
		    } else {
			int i_12_;
			if ((((Class524) this).aClass324_7055.method4217
			     (((Class524) this).aShortArray7059, i,
			      -1925191663))
			    == 0)
			    i_12_ = i_5_;
			else {
			    if ((((Class524) this).aClass324_7055.method4217
				 (((Class524) this).aShortArray7065, i,
				  -1699500104))
				== 0)
				i_12_ = i_6_;
			    else {
				i_12_ = i_7_;
				i_7_ = i_6_;
			    }
			    i_6_ = i_5_;
			}
			i_5_ = i_4_;
			i_4_ = i_12_;
		    }
		    if (0 == i_11_) {
			i_11_ = (((Class524) this).aClass532_7057.method6475
				 (((Class524) this).aClass324_7055, i_10_,
				  -2023239859)) + 2;
			i = Class528_Sub9.method9332(i, -1242096458);
		    }
		} else {
		    i_7_ = i_6_;
		    i_6_ = i_5_;
		    i_5_ = i_4_;
		    i_11_ = 2 + (((Class524) this).aClass532_7066.method6475
				 (((Class524) this).aClass324_7055, i_10_,
				  -2023239859));
		    i = Class95.method1260(i, (byte) 37);
		    int i_13_
			= (((Class524) this).aClass315Array7060
			       [Class311.method4140(i_11_, 720224832)]
			       .method4154
			   (((Class524) this).aClass324_7055, 429194968));
		    if (i_13_ >= 4) {
			int i_14_ = (i_13_ >> 1) - 1;
			i_4_ = (0x2 | i_13_ & 0x1) << i_14_;
			if (i_13_ < 14)
			    i_4_ += Class520.method6349((((Class524) this)
							 .aShortArray7063),
							i_4_ - i_13_ - 1,
							(((Class524) this)
							 .aClass324_7055),
							i_14_, 201794535);
			else {
			    i_4_ += (((Class524) this).aClass324_7055
					 .method4221(i_14_ - 4, -1844857973)
				     << 4);
			    i_4_
				+= (((Class524) this).aClass315_7064.method4155
				    (((Class524) this).aClass324_7055,
				     879697848));
			    if (i_4_ < 0) {
				if (i_4_ != -1)
				    return false;
				break;
			    }
			}
		    } else
			i_4_ = i_13_;
		}
		if ((long) i_4_ >= l_8_
		    || i_4_ >= -151486493 * ((Class524) this).anInt7069)
		    return false;
		((Class524) this).aClass508_7068.method6167(i_4_, i_11_,
							    185010834);
		l_8_ += (long) i_11_;
		i_9_ = ((Class524) this).aClass508_7068.method6161(0,
								   -820061885);
	    }
	}
	((Class524) this).aClass508_7068.method6158(821757843);
	((Class524) this).aClass508_7068.method6156((byte) -68);
	((Class524) this).aClass324_7055.method4222((byte) 10);
	return true;
    }
    
    boolean method6378(int i, int i_15_) {
	if (i < 0)
	    return false;
	if (i != 1956175163 * ((Class524) this).anInt7056) {
	    ((Class524) this).anInt7056 = 1212543987 * i;
	    ((Class524) this).anInt7069
		= (Math.max(((Class524) this).anInt7056 * 1956175163, 1)
		   * -103236149);
	    ((Class524) this).aClass508_7068.method6159
		(Math.max(((Class524) this).anInt7069 * -151486493, 4096),
		 1859939360);
	}
	return true;
    }
    
    void method6379() throws IOException {
	((Class524) this).aClass508_7068.method6157(false, 1074608864);
	Class253.method3439(((Class524) this).aShortArray7054, (byte) -95);
	Class253.method3439(((Class524) this).aShortArray7061, (byte) -71);
	Class253.method3439(((Class524) this).aShortArray7067, (byte) -46);
	Class253.method3439(((Class524) this).aShortArray7058, (byte) -124);
	Class253.method3439(((Class524) this).aShortArray7059, (byte) -122);
	Class253.method3439(((Class524) this).aShortArray7065, (byte) -70);
	Class253.method3439(((Class524) this).aShortArray7063, (byte) -62);
	((Class524) this).aClass529_7062.method6451((byte) -52);
	for (int i = 0; i < 4; i++)
	    ((Class524) this).aClass315Array7060[i].method4157(760703019);
	((Class524) this).aClass532_7066.method6476(-1840716137);
	((Class524) this).aClass532_7057.method6476(-111438416);
	((Class524) this).aClass315_7064.method4157(-685265363);
	((Class524) this).aClass324_7055.method4215(-1200271014);
    }
    
    boolean method6380(int i, int i_16_, int i_17_, byte i_18_) {
	if (i > 8 || i_16_ > 4 || i_17_ > 4)
	    return false;
	((Class524) this).aClass529_7062.method6454(i_16_, i, 951183200);
	int i_19_ = 1 << i_17_;
	((Class524) this).aClass532_7066.method6474(i_19_, (short) 30314);
	((Class524) this).aClass532_7057.method6474(i_19_, (short) 22023);
	((Class524) this).anInt7070 = -1159295101 * (i_19_ - 1);
	return true;
    }
    
    boolean method6381(byte[] is, int i) {
	if (is.length < 5)
	    return false;
	int i_20_ = is[0] & 0xff;
	int i_21_ = i_20_ % 9;
	int i_22_ = i_20_ / 9;
	int i_23_ = i_22_ % 5;
	int i_24_ = i_22_ / 5;
	int i_25_ = 0;
	for (int i_26_ = 0; i_26_ < 4; i_26_++)
	    i_25_ += (is[i_26_ + 1] & 0xff) << 8 * i_26_;
	if (!method6380(i_21_, i_23_, i_24_, (byte) 8))
	    return false;
	return method6378(i_25_, -1788062188);
    }
    
    boolean method6382(int i, int i_27_, int i_28_) {
	if (i > 8 || i_27_ > 4 || i_28_ > 4)
	    return false;
	((Class524) this).aClass529_7062.method6454(i_27_, i, -386666173);
	int i_29_ = 1 << i_28_;
	((Class524) this).aClass532_7066.method6474(i_29_, (short) 13341);
	((Class524) this).aClass532_7057.method6474(i_29_, (short) 19855);
	((Class524) this).anInt7070 = -1159295101 * (i_29_ - 1);
	return true;
    }
    
    boolean method6383(int i) {
	if (i < 0)
	    return false;
	if (i != 1956175163 * ((Class524) this).anInt7056) {
	    ((Class524) this).anInt7056 = 1212543987 * i;
	    ((Class524) this).anInt7069
		= (Math.max(((Class524) this).anInt7056 * 1956175163, 1)
		   * -103236149);
	    ((Class524) this).aClass508_7068.method6159
		(Math.max(((Class524) this).anInt7069 * -151486493, 4096),
		 1814345642);
	}
	return true;
    }
}
