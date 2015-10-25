/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class316 implements Interface31
{
    Class446 aClass446_3447;
    Class446 aClass446_3448;
    long aLong3449;
    Class172 aClass172_3450;
    int anInt3451;
    Class378 aClass378_3452;
    
    public void method187(short i) {
	Class1 class1
	    = Class392.method4800(((Class316) this).aClass446_3448,
				  201912255 * (((Class316) this).aClass378_3452
					       .anInt3945),
				  Class625.aClass414_8129, (byte) 110);
	((Class316) this).aClass172_3450
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class316) this).aClass446_3447,
				    (((Class316) this).aClass378_3452.anInt3945
				     * 201912255)),
		true));
    }
    
    public void method190(boolean bool, byte i) {
	int i_0_
	    = ((((Class316) this).aClass378_3452.aClass381_3950.method4720
		(((Class316) this).aClass378_3452.anInt3953 * 732946715,
		 473615593 * client.anInt11124, -1271569952))
	       + -1658519425 * ((Class316) this).aClass378_3452.anInt3947);
	int i_1_
	    = ((((Class316) this).aClass378_3452.aClass377_3946.method4700
		(((Class316) this).aClass378_3452.anInt3952 * -973094999,
		 client.anInt11022 * -14625703, -256319305))
	       + -1924139657 * ((Class316) this).aClass378_3452.anInt3948);
	method4164(bool, i_0_, i_1_, (byte) -93);
	method4170(bool, i_0_, i_1_, 178143108);
	String string = Class293.aClass292_3215.method3911((byte) -124);
	if ((Class249.method3417(2088118420)
	     - ((Class316) this).aLong3449 * 128825887314549611L)
	    > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class293.aClass292_3215.method3914(1843856233).anInt3143
		       * -2117598397)
		      .append
		      (")").toString();
	((Class316) this).aClass172_3450.method2130
	    (string,
	     i_0_ + ((Class316) this).aClass378_3452.anInt3953 * 732946715 / 2,
	     (2021621295 * ((Class316) this).aClass378_3452.anInt3951
	      + (i_1_
		 + -973094999 * ((Class316) this).aClass378_3452.anInt3952 / 2
		 + 4)),
	     -1503629071 * ((Class316) this).aClass378_3452.anInt3949, -1,
	     (byte) 0);
    }
    
    abstract void method4164(boolean bool, int i, int i_2_, byte i_3_);
    
    abstract void method4165(boolean bool, int i, int i_4_);
    
    public boolean method186(int i) {
	boolean bool = true;
	if (!((Class316) this).aClass446_3447.method5357((201912255
							  * (((Class316) this)
							     .aClass378_3452
							     .anInt3945)),
							 (short) -6971))
	    bool = false;
	if (!((Class316) this).aClass446_3448.method5357((201912255
							  * (((Class316) this)
							     .aClass378_3452
							     .anInt3945)),
							 (short) -7662))
	    bool = false;
	return bool;
    }
    
    Class316(Class446 class446, Class446 class446_5_, Class378 class378) {
	((Class316) this).aClass446_3447 = class446;
	((Class316) this).aClass446_3448 = class446_5_;
	((Class316) this).aClass378_3452 = class378;
    }
    
    int method4166(int i) {
	int i_6_ = Class293.aClass292_3215.method3922(573735360);
	int i_7_ = i_6_ * 100;
	if (-598496417 * ((Class316) this).anInt3451 == i_6_ && 0 != i_6_) {
	    int i_8_ = Class293.aClass292_3215.method3910(1422061289);
	    if (i_8_ > i_6_) {
		long l = (((Class316) this).aLong3449 * 128825887314549611L
			  - Class293.aClass292_3215.method3919(1452515925));
		if (l > 0L) {
		    long l_9_
			= 10000L * l / (long) i_6_ * (long) (i_8_ - i_6_);
		    long l_10_ = ((Class249.method3417(2032222282)
				   - (((Class316) this).aLong3449
				      * 128825887314549611L))
				  * 10000L);
		    if (l_10_ < l_9_)
			i_7_
			    = (int) ((long) (i_8_ - i_6_) * l_10_ * 100L / l_9_
				     + (long) (100 * i_6_));
		    else
			i_7_ = i_8_ * 100;
		}
	    }
	} else {
	    ((Class316) this).anInt3451 = 743534751 * i_6_;
	    ((Class316) this).aLong3449
		= Class249.method3417(1989491169) * 4058555022857222467L;
	}
	return i_7_;
    }
    
    public void method188(boolean bool) {
	int i = ((((Class316) this).aClass378_3452.aClass381_3950.method4720
		  (((Class316) this).aClass378_3452.anInt3953 * 732946715,
		   473615593 * client.anInt11124, -1878251716))
		 + -1658519425 * ((Class316) this).aClass378_3452.anInt3947);
	int i_11_
	    = ((((Class316) this).aClass378_3452.aClass377_3946.method4700
		(((Class316) this).aClass378_3452.anInt3952 * -973094999,
		 client.anInt11022 * -14625703, -464651323))
	       + -1924139657 * ((Class316) this).aClass378_3452.anInt3948);
	method4164(bool, i, i_11_, (byte) 67);
	method4170(bool, i, i_11_, 1137078630);
	String string = Class293.aClass292_3215.method3911((byte) -78);
	if ((Class249.method3417(2045245231)
	     - ((Class316) this).aLong3449 * 128825887314549611L)
	    > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class293.aClass292_3215.method3914(1936829350).anInt3143
		       * -2117598397)
		      .append
		      (")").toString();
	((Class316) this).aClass172_3450.method2130
	    (string,
	     i + ((Class316) this).aClass378_3452.anInt3953 * 732946715 / 2,
	     (2021621295 * ((Class316) this).aClass378_3452.anInt3951
	      + (i_11_
		 + -973094999 * ((Class316) this).aClass378_3452.anInt3952 / 2
		 + 4)),
	     -1503629071 * ((Class316) this).aClass378_3452.anInt3949, -1,
	     (byte) 0);
    }
    
    public void method189(boolean bool) {
	int i = ((((Class316) this).aClass378_3452.aClass381_3950.method4720
		  (((Class316) this).aClass378_3452.anInt3953 * 732946715,
		   473615593 * client.anInt11124, 12137958))
		 + -1658519425 * ((Class316) this).aClass378_3452.anInt3947);
	int i_12_
	    = ((((Class316) this).aClass378_3452.aClass377_3946.method4700
		(((Class316) this).aClass378_3452.anInt3952 * -973094999,
		 client.anInt11022 * -14625703, -1344322274))
	       + -1924139657 * ((Class316) this).aClass378_3452.anInt3948);
	method4164(bool, i, i_12_, (byte) -100);
	method4170(bool, i, i_12_, -1823795202);
	String string = Class293.aClass292_3215.method3911((byte) -65);
	if ((Class249.method3417(1955986442)
	     - ((Class316) this).aLong3449 * 128825887314549611L)
	    > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class293.aClass292_3215.method3914(1862927444).anInt3143
		       * -2117598397)
		      .append
		      (")").toString();
	((Class316) this).aClass172_3450.method2130
	    (string,
	     i + ((Class316) this).aClass378_3452.anInt3953 * 732946715 / 2,
	     (2021621295 * ((Class316) this).aClass378_3452.anInt3951
	      + (i_12_
		 + -973094999 * ((Class316) this).aClass378_3452.anInt3952 / 2
		 + 4)),
	     -1503629071 * ((Class316) this).aClass378_3452.anInt3949, -1,
	     (byte) 0);
    }
    
    public void method185(boolean bool) {
	int i = ((((Class316) this).aClass378_3452.aClass381_3950.method4720
		  (((Class316) this).aClass378_3452.anInt3953 * 732946715,
		   473615593 * client.anInt11124, 701691783))
		 + -1658519425 * ((Class316) this).aClass378_3452.anInt3947);
	int i_13_
	    = ((((Class316) this).aClass378_3452.aClass377_3946.method4700
		(((Class316) this).aClass378_3452.anInt3952 * -973094999,
		 client.anInt11022 * -14625703, -1635532463))
	       + -1924139657 * ((Class316) this).aClass378_3452.anInt3948);
	method4164(bool, i, i_13_, (byte) -18);
	method4170(bool, i, i_13_, -1982267473);
	String string = Class293.aClass292_3215.method3911((byte) -1);
	if ((Class249.method3417(1916486898)
	     - ((Class316) this).aLong3449 * 128825887314549611L)
	    > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class293.aClass292_3215.method3914(1750799678).anInt3143
		       * -2117598397)
		      .append
		      (")").toString();
	((Class316) this).aClass172_3450.method2130
	    (string,
	     i + ((Class316) this).aClass378_3452.anInt3953 * 732946715 / 2,
	     (2021621295 * ((Class316) this).aClass378_3452.anInt3951
	      + (i_13_
		 + -973094999 * ((Class316) this).aClass378_3452.anInt3952 / 2
		 + 4)),
	     -1503629071 * ((Class316) this).aClass378_3452.anInt3949, -1,
	     (byte) 0);
    }
    
    public void method191() {
	Class1 class1
	    = Class392.method4800(((Class316) this).aClass446_3448,
				  201912255 * (((Class316) this).aClass378_3452
					       .anInt3945),
				  Class625.aClass414_8129, (byte) 80);
	((Class316) this).aClass172_3450
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class316) this).aClass446_3447,
				    (((Class316) this).aClass378_3452.anInt3945
				     * 201912255)),
		true));
    }
    
    public void method192() {
	Class1 class1
	    = Class392.method4800(((Class316) this).aClass446_3448,
				  201912255 * (((Class316) this).aClass378_3452
					       .anInt3945),
				  Class625.aClass414_8129, (byte) 12);
	((Class316) this).aClass172_3450
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class316) this).aClass446_3447,
				    (((Class316) this).aClass378_3452.anInt3945
				     * 201912255)),
		true));
    }
    
    public void method193() {
	Class1 class1
	    = Class392.method4800(((Class316) this).aClass446_3448,
				  201912255 * (((Class316) this).aClass378_3452
					       .anInt3945),
				  Class625.aClass414_8129, (byte) 63);
	((Class316) this).aClass172_3450
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class316) this).aClass446_3447,
				    (((Class316) this).aClass378_3452.anInt3945
				     * 201912255)),
		true));
    }
    
    public void method116() {
	Class1 class1
	    = Class392.method4800(((Class316) this).aClass446_3448,
				  201912255 * (((Class316) this).aClass378_3452
					       .anInt3945),
				  Class625.aClass414_8129, (byte) 105);
	((Class316) this).aClass172_3450
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class316) this).aClass446_3447,
				    (((Class316) this).aClass378_3452.anInt3945
				     * 201912255)),
		true));
    }
    
    public void method194() {
	Class1 class1
	    = Class392.method4800(((Class316) this).aClass446_3448,
				  201912255 * (((Class316) this).aClass378_3452
					       .anInt3945),
				  Class625.aClass414_8129, (byte) 95);
	((Class316) this).aClass172_3450
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class316) this).aClass446_3447,
				    (((Class316) this).aClass378_3452.anInt3945
				     * 201912255)),
		true));
    }
    
    public void method195() {
	Class1 class1
	    = Class392.method4800(((Class316) this).aClass446_3448,
				  201912255 * (((Class316) this).aClass378_3452
					       .anInt3945),
				  Class625.aClass414_8129, (byte) 77);
	((Class316) this).aClass172_3450
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class316) this).aClass446_3447,
				    (((Class316) this).aClass378_3452.anInt3945
				     * 201912255)),
		true));
    }
    
    abstract void method4167(boolean bool, int i, int i_14_);
    
    abstract void method4168(boolean bool, int i, int i_15_);
    
    public boolean method196() {
	boolean bool = true;
	if (!((Class316) this).aClass446_3447.method5357((201912255
							  * (((Class316) this)
							     .aClass378_3452
							     .anInt3945)),
							 (short) 15866))
	    bool = false;
	if (!((Class316) this).aClass446_3448.method5357((201912255
							  * (((Class316) this)
							     .aClass378_3452
							     .anInt3945)),
							 (short) -28560))
	    bool = false;
	return bool;
    }
    
    int method4169() {
	int i = Class293.aClass292_3215.method3922(-2038098120);
	int i_16_ = i * 100;
	if (-598496417 * ((Class316) this).anInt3451 == i && 0 != i) {
	    int i_17_ = Class293.aClass292_3215.method3910(1827384500);
	    if (i_17_ > i) {
		long l = (((Class316) this).aLong3449 * 128825887314549611L
			  - Class293.aClass292_3215.method3919(1169937599));
		if (l > 0L) {
		    long l_18_ = 10000L * l / (long) i * (long) (i_17_ - i);
		    long l_19_ = ((Class249.method3417(2078971505)
				   - (((Class316) this).aLong3449
				      * 128825887314549611L))
				  * 10000L);
		    if (l_19_ < l_18_)
			i_16_
			    = (int) ((long) (i_17_ - i) * l_19_ * 100L / l_18_
				     + (long) (100 * i));
		    else
			i_16_ = i_17_ * 100;
		}
	    }
	} else {
	    ((Class316) this).anInt3451 = 743534751 * i;
	    ((Class316) this).aLong3449
		= Class249.method3417(1986346326) * 4058555022857222467L;
	}
	return i_16_;
    }
    
    abstract void method4170(boolean bool, int i, int i_20_, int i_21_);
    
    abstract void method4171(boolean bool, int i, int i_22_);
    
    abstract void method4172(boolean bool, int i, int i_23_);
    
    abstract void method4173(boolean bool, int i, int i_24_);
    
    int method4174() {
	int i = Class293.aClass292_3215.method3922(-501355971);
	int i_25_ = i * 100;
	if (-598496417 * ((Class316) this).anInt3451 == i && 0 != i) {
	    int i_26_ = Class293.aClass292_3215.method3910(2085498483);
	    if (i_26_ > i) {
		long l = (((Class316) this).aLong3449 * 128825887314549611L
			  - Class293.aClass292_3215.method3919(43922925));
		if (l > 0L) {
		    long l_27_ = 10000L * l / (long) i * (long) (i_26_ - i);
		    long l_28_ = ((Class249.method3417(1964728206)
				   - (((Class316) this).aLong3449
				      * 128825887314549611L))
				  * 10000L);
		    if (l_28_ < l_27_)
			i_25_
			    = (int) ((long) (i_26_ - i) * l_28_ * 100L / l_27_
				     + (long) (100 * i));
		    else
			i_25_ = i_26_ * 100;
		}
	    }
	} else {
	    ((Class316) this).anInt3451 = 743534751 * i;
	    ((Class316) this).aLong3449
		= Class249.method3417(2040132935) * 4058555022857222467L;
	}
	return i_25_;
    }
    
    int method4175() {
	int i = Class293.aClass292_3215.method3922(947574526);
	int i_29_ = i * 100;
	if (-598496417 * ((Class316) this).anInt3451 == i && 0 != i) {
	    int i_30_ = Class293.aClass292_3215.method3910(1237363841);
	    if (i_30_ > i) {
		long l = (((Class316) this).aLong3449 * 128825887314549611L
			  - Class293.aClass292_3215.method3919(1823073337));
		if (l > 0L) {
		    long l_31_ = 10000L * l / (long) i * (long) (i_30_ - i);
		    long l_32_ = ((Class249.method3417(2010374031)
				   - (((Class316) this).aLong3449
				      * 128825887314549611L))
				  * 10000L);
		    if (l_32_ < l_31_)
			i_29_
			    = (int) ((long) (i_30_ - i) * l_32_ * 100L / l_31_
				     + (long) (100 * i));
		    else
			i_29_ = i_30_ * 100;
		}
	    }
	} else {
	    ((Class316) this).anInt3451 = 743534751 * i;
	    ((Class316) this).aLong3449
		= Class249.method3417(1949523062) * 4058555022857222467L;
	}
	return i_29_;
    }
    
    int method4176() {
	int i = Class293.aClass292_3215.method3922(565233760);
	int i_33_ = i * 100;
	if (-598496417 * ((Class316) this).anInt3451 == i && 0 != i) {
	    int i_34_ = Class293.aClass292_3215.method3910(1913094522);
	    if (i_34_ > i) {
		long l = (((Class316) this).aLong3449 * 128825887314549611L
			  - Class293.aClass292_3215.method3919(200023599));
		if (l > 0L) {
		    long l_35_ = 10000L * l / (long) i * (long) (i_34_ - i);
		    long l_36_ = ((Class249.method3417(1980914695)
				   - (((Class316) this).aLong3449
				      * 128825887314549611L))
				  * 10000L);
		    if (l_36_ < l_35_)
			i_33_
			    = (int) ((long) (i_34_ - i) * l_36_ * 100L / l_35_
				     + (long) (100 * i));
		    else
			i_33_ = i_34_ * 100;
		}
	    }
	} else {
	    ((Class316) this).anInt3451 = 743534751 * i;
	    ((Class316) this).aLong3449
		= Class249.method3417(2085530493) * 4058555022857222467L;
	}
	return i_33_;
    }
    
    int method4177() {
	int i = Class293.aClass292_3215.method3922(757250496);
	int i_37_ = i * 100;
	if (-598496417 * ((Class316) this).anInt3451 == i && 0 != i) {
	    int i_38_ = Class293.aClass292_3215.method3910(1711715404);
	    if (i_38_ > i) {
		long l = (((Class316) this).aLong3449 * 128825887314549611L
			  - Class293.aClass292_3215.method3919(-746833055));
		if (l > 0L) {
		    long l_39_ = 10000L * l / (long) i * (long) (i_38_ - i);
		    long l_40_ = ((Class249.method3417(1990189244)
				   - (((Class316) this).aLong3449
				      * 128825887314549611L))
				  * 10000L);
		    if (l_40_ < l_39_)
			i_37_
			    = (int) ((long) (i_38_ - i) * l_40_ * 100L / l_39_
				     + (long) (100 * i));
		    else
			i_37_ = i_38_ * 100;
		}
	    }
	} else {
	    ((Class316) this).anInt3451 = 743534751 * i;
	    ((Class316) this).aLong3449
		= Class249.method3417(1981509682) * 4058555022857222467L;
	}
	return i_37_;
    }
    
    static final void method4178(Class648 class648, int i) {
	int i_41_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_41_, (byte) 30);
	Class226 class226 = Class380.aClass226Array3970[i_41_ >> 16];
	Class43.method855(class229, class226, class648, -1154668737);
    }
}
