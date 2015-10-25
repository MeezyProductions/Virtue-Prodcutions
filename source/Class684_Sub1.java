/* Class684_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class684_Sub1 extends Class684
{
    Class422 aClass422_10774;
    Class422 aClass422_10775 = new Class422();
    boolean aBool10776;
    Class422 aClass422_10777;
    Interface30 anInterface30_10778;
    Class422 aClass422_10779 = new Class422(Float.NaN, Float.NaN, Float.NaN);
    
    public void method10053() {
	if (((Class684_Sub1) this).anInterface30_10778 != null)
	    ((Class684_Sub1) this).anInterface30_10778
		= (((Class684_Sub1) this).aClass283_8607.method3825
		       ((byte) 1).method164
		   (((Class684_Sub1) this).anInterface30_10778
			.method175((byte) -118),
		    ((Class684_Sub1) this).anInterface30_10778
			.method168(-943950641),
		    (byte) -109));
    }
    
    public void method10054(Interface30 interface30, Class422 class422,
			    boolean bool, int i) {
	((Class684_Sub1) this).anInterface30_10778 = interface30;
	((Class684_Sub1) this).aClass422_10775.method5058(class422);
	((Class684_Sub1) this).aBool10776 = bool;
	interface30.method169(-1385546009);
    }
    
    public void method10055(byte i) {
	if (((Class684_Sub1) this).anInterface30_10778 != null)
	    ((Class684_Sub1) this).anInterface30_10778
		= (((Class684_Sub1) this).aClass283_8607.method3825
		       ((byte) 1).method164
		   (((Class684_Sub1) this).anInterface30_10778
			.method175((byte) -15),
		    ((Class684_Sub1) this).anInterface30_10778
			.method168(-943950641),
		    (byte) -77));
    }
    
    public void method7989(Class284 class284, Class433 class433, int i,
			   int i_0_, float f, short i_1_) {
	Class422 class422
	    = Class422.method5052(((Class684_Sub1) this).aClass283_8607
				      .method3788((short) -13031));
	class422.aFloat4780 -= (float) i;
	class422.aFloat4777 -= (float) i_0_;
	class422.aFloat4776 *= -1.0F;
	Class422 class422_2_ = method7987(-1914997382);
	class422_2_.aFloat4780 -= (float) i;
	class422_2_.aFloat4777 -= (float) i_0_;
	class422_2_.aFloat4776 *= -1.0F;
	class433.method5220((double) class422.aFloat4780,
			    (double) class422.aFloat4776,
			    (double) class422.aFloat4777,
			    (double) class422_2_.aFloat4780,
			    (double) class422_2_.aFloat4776,
			    (double) class422_2_.aFloat4777, 0.0F, 1.0F, 0.0F);
	class422.method5054();
	class422_2_.method5054();
    }
    
    public void method7993(float f) {
	if (((Class684_Sub1) this).anInterface30_10778 != null) {
	    ((Class684_Sub1) this).aClass422_10777.method5058
		(((Class684_Sub1) this).anInterface30_10778.method169
		     (-1603976174).method9411(1224241231));
	    ((Class684_Sub1) this).aClass283_8607.method3761
		(false, f, ((Class684_Sub1) this).aClass422_10779,
		 ((Class684_Sub1) this).aClass283_8607.method3793((byte) -103),
		 ((Class684_Sub1) this).aClass422_10777,
		 ((Class684_Sub1) this).aClass422_10774, 160264665);
	}
    }
    
    public Class422 method7987(int i) {
	Class422 class422
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10779);
	Class422 class422_3_
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10775);
	if (((Class684_Sub1) this).aBool10776)
	    class422_3_.method5075(((Class684_Sub1) this)
				       .anInterface30_10778
				       .method170((byte) 0));
	class422.method5063(class422_3_);
	class422_3_.method5054();
	return class422;
    }
    
    public Class422 method7988(int i) {
	Class422 class422
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10777);
	Class422 class422_4_
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10775);
	if (((Class684_Sub1) this).aBool10776)
	    class422_4_.method5075(((Class684_Sub1) this)
				       .anInterface30_10778
				       .method170((byte) 0));
	class422.method5063(class422_4_);
	class422_4_.method5054();
	return class422;
    }
    
    public Class422 method10056(int i) {
	return ((Class684_Sub1) this).aClass422_10779;
    }
    
    public void method7990(ByteBuffer class528_sub42, int i) {
	Class295 class295
	    = Class95_Sub1_Sub2.method10305(class528_sub42
						.readUnsignedByte((byte) 78),
					    (byte) 69);
	int i_5_ = class528_sub42.readUnsignedShort(97370134);
	((Class684_Sub1) this).anInterface30_10778
	    = ((Class684_Sub1) this).aClass283_8607.method3825((byte) 1)
		  .method164(class295, i_5_, (byte) -12);
	((Class684_Sub1) this).aClass422_10775.method5056(class528_sub42);
	if (class528_sub42.readUnsignedByte((byte) 48) == 1)
	    ((Class684_Sub1) this).aBool10776 = true;
	else
	    ((Class684_Sub1) this).aBool10776 = false;
    }
    
    public void method7991(float f) {
	if (((Class684_Sub1) this).anInterface30_10778 != null) {
	    ((Class684_Sub1) this).aClass422_10777.method5058
		(((Class684_Sub1) this).anInterface30_10778.method169
		     (-357702968).method9411(-349165777));
	    ((Class684_Sub1) this).aClass283_8607.method3761
		(false, f, ((Class684_Sub1) this).aClass422_10779,
		 ((Class684_Sub1) this).aClass283_8607.method3793((byte) -25),
		 ((Class684_Sub1) this).aClass422_10777,
		 ((Class684_Sub1) this).aClass422_10774, -1291967695);
	}
    }
    
    public void method7999(float f) {
	if (((Class684_Sub1) this).anInterface30_10778 != null) {
	    ((Class684_Sub1) this).aClass422_10777.method5058
		(((Class684_Sub1) this).anInterface30_10778.method169
		     (-1269585577).method9411(-1783175579));
	    ((Class684_Sub1) this).aClass283_8607.method3761
		(false, f, ((Class684_Sub1) this).aClass422_10779,
		 ((Class684_Sub1) this).aClass283_8607.method3793((byte) 90),
		 ((Class684_Sub1) this).aClass422_10777,
		 ((Class684_Sub1) this).aClass422_10774, 951109555);
	}
    }
    
    public void method7994(float f) {
	if (((Class684_Sub1) this).anInterface30_10778 != null) {
	    ((Class684_Sub1) this).aClass422_10777.method5058
		(((Class684_Sub1) this).anInterface30_10778.method169
		     (433870283).method9411(-1796645413));
	    ((Class684_Sub1) this).aClass283_8607.method3761
		(false, f, ((Class684_Sub1) this).aClass422_10779,
		 ((Class684_Sub1) this).aClass283_8607.method3793((byte) -51),
		 ((Class684_Sub1) this).aClass422_10777,
		 ((Class684_Sub1) this).aClass422_10774, -1456376436);
	}
    }
    
    public void method7996(Class284 class284, Class433 class433, int i,
			   int i_6_, float f) {
	Class422 class422
	    = Class422.method5052(((Class684_Sub1) this).aClass283_8607
				      .method3788((short) -9673));
	class422.aFloat4780 -= (float) i;
	class422.aFloat4777 -= (float) i_6_;
	class422.aFloat4776 *= -1.0F;
	Class422 class422_7_ = method7987(-1914997382);
	class422_7_.aFloat4780 -= (float) i;
	class422_7_.aFloat4777 -= (float) i_6_;
	class422_7_.aFloat4776 *= -1.0F;
	class433.method5220((double) class422.aFloat4780,
			    (double) class422.aFloat4776,
			    (double) class422.aFloat4777,
			    (double) class422_7_.aFloat4780,
			    (double) class422_7_.aFloat4776,
			    (double) class422_7_.aFloat4777, 0.0F, 1.0F, 0.0F);
	class422.method5054();
	class422_7_.method5054();
    }
    
    public void method7997(Class284 class284, Class433 class433, int i,
			   int i_8_, float f) {
	Class422 class422
	    = Class422.method5052(((Class684_Sub1) this).aClass283_8607
				      .method3788((short) 15899));
	class422.aFloat4780 -= (float) i;
	class422.aFloat4777 -= (float) i_8_;
	class422.aFloat4776 *= -1.0F;
	Class422 class422_9_ = method7987(-1914997382);
	class422_9_.aFloat4780 -= (float) i;
	class422_9_.aFloat4777 -= (float) i_8_;
	class422_9_.aFloat4776 *= -1.0F;
	class433.method5220((double) class422.aFloat4780,
			    (double) class422.aFloat4776,
			    (double) class422.aFloat4777,
			    (double) class422_9_.aFloat4780,
			    (double) class422_9_.aFloat4776,
			    (double) class422_9_.aFloat4777, 0.0F, 1.0F, 0.0F);
	class422.method5054();
	class422_9_.method5054();
    }
    
    public Class422 method7992() {
	Class422 class422
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10779);
	Class422 class422_10_
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10775);
	if (((Class684_Sub1) this).aBool10776)
	    class422_10_.method5075(((Class684_Sub1) this)
					.anInterface30_10778
					.method170((byte) 0));
	class422.method5063(class422_10_);
	class422_10_.method5054();
	return class422;
    }
    
    public Class422 method7998() {
	Class422 class422
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10779);
	Class422 class422_11_
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10775);
	if (((Class684_Sub1) this).aBool10776)
	    class422_11_.method5075(((Class684_Sub1) this)
					.anInterface30_10778
					.method170((byte) 0));
	class422.method5063(class422_11_);
	class422_11_.method5054();
	return class422;
    }
    
    public Class422 method7985() {
	Class422 class422
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10779);
	Class422 class422_12_
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10775);
	if (((Class684_Sub1) this).aBool10776)
	    class422_12_.method5075(((Class684_Sub1) this)
					.anInterface30_10778
					.method170((byte) 0));
	class422.method5063(class422_12_);
	class422_12_.method5054();
	return class422;
    }
    
    public Class422 method8001() {
	Class422 class422
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10779);
	Class422 class422_13_
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10775);
	if (((Class684_Sub1) this).aBool10776)
	    class422_13_.method5075(((Class684_Sub1) this)
					.anInterface30_10778
					.method170((byte) 0));
	class422.method5063(class422_13_);
	class422_13_.method5054();
	return class422;
    }
    
    public Class422 method8000() {
	Class422 class422
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10777);
	Class422 class422_14_
	    = Class422.method5052(((Class684_Sub1) this).aClass422_10775);
	if (((Class684_Sub1) this).aBool10776)
	    class422_14_.method5075(((Class684_Sub1) this)
					.anInterface30_10778
					.method170((byte) 0));
	class422.method5063(class422_14_);
	class422_14_.method5054();
	return class422;
    }
    
    public void method8003(ByteBuffer class528_sub42) {
	Class295 class295
	    = Class95_Sub1_Sub2.method10305(class528_sub42
						.readUnsignedByte((byte) 98),
					    (byte) 107);
	int i = class528_sub42.readUnsignedShort(412805610);
	((Class684_Sub1) this).anInterface30_10778
	    = ((Class684_Sub1) this).aClass283_8607.method3825((byte) 1)
		  .method164(class295, i, (byte) -30);
	((Class684_Sub1) this).aClass422_10775.method5056(class528_sub42);
	if (class528_sub42.readUnsignedByte((byte) 96) == 1)
	    ((Class684_Sub1) this).aBool10776 = true;
	else
	    ((Class684_Sub1) this).aBool10776 = false;
    }
    
    public void method8002(ByteBuffer class528_sub42) {
	Class295 class295
	    = Class95_Sub1_Sub2.method10305(class528_sub42
						.readUnsignedByte((byte) 51),
					    (byte) 77);
	int i = class528_sub42.readUnsignedShort(172183920);
	((Class684_Sub1) this).anInterface30_10778
	    = ((Class684_Sub1) this).aClass283_8607.method3825((byte) 1)
		  .method164(class295, i, (byte) -46);
	((Class684_Sub1) this).aClass422_10775.method5056(class528_sub42);
	if (class528_sub42.readUnsignedByte((byte) 110) == 1)
	    ((Class684_Sub1) this).aBool10776 = true;
	else
	    ((Class684_Sub1) this).aBool10776 = false;
    }
    
    public boolean method7986(int i) {
	return !Float.isNaN(((Class684_Sub1) this).aClass422_10779.aFloat4780);
    }
    
    public void method8005(ByteBuffer class528_sub42) {
	Class295 class295
	    = Class95_Sub1_Sub2.method10305(class528_sub42
						.readUnsignedByte((byte) 82),
					    (byte) 91);
	int i = class528_sub42.readUnsignedShort(-1355542171);
	((Class684_Sub1) this).anInterface30_10778
	    = ((Class684_Sub1) this).aClass283_8607.method3825((byte) 1)
		  .method164(class295, i, (byte) -10);
	((Class684_Sub1) this).aClass422_10775.method5056(class528_sub42);
	if (class528_sub42.readUnsignedByte((byte) 117) == 1)
	    ((Class684_Sub1) this).aBool10776 = true;
	else
	    ((Class684_Sub1) this).aBool10776 = false;
    }
    
    public void method8004(float f, int i) {
	if (((Class684_Sub1) this).anInterface30_10778 != null) {
	    ((Class684_Sub1) this).aClass422_10777.method5058
		(((Class684_Sub1) this).anInterface30_10778.method169
		     (-786716555).method9411(-879793830));
	    ((Class684_Sub1) this).aClass283_8607.method3761
		(false, f, ((Class684_Sub1) this).aClass422_10779,
		 ((Class684_Sub1) this).aClass283_8607.method3793((byte) 5),
		 ((Class684_Sub1) this).aClass422_10777,
		 ((Class684_Sub1) this).aClass422_10774, 1362058738);
	}
    }
    
    public Class684_Sub1(Class283 class283) {
	super(class283);
	((Class684_Sub1) this).aClass422_10777
	    = new Class422(Float.NaN, Float.NaN, Float.NaN);
	((Class684_Sub1) this).aClass422_10774 = new Class422();
    }
    
    public boolean method7995() {
	return !Float.isNaN(((Class684_Sub1) this).aClass422_10779.aFloat4780);
    }
}
