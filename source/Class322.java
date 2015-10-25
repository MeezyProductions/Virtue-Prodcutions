/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class322 implements Interface31
{
    Class172 aClass172_3476;
    long aLong3477 = 4394163198505203357L;
    Class446 aClass446_3478;
    Class389 aClass389_3479;
    Class446 aClass446_3480;
    int anInt3481;
    static File aFile3482;
    static Class151 aClass151_3483;
    
    public void method194() {
	Class1 class1
	    = Class392.method4800(((Class322) this).aClass446_3478,
				  1108894779 * (((Class322) this)
						.aClass389_3479.anInt4104),
				  Class625.aClass414_8129, (byte) 29);
	((Class322) this).aClass172_3476
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class322) this).aClass446_3480,
				    1108894779 * (((Class322) this)
						  .aClass389_3479.anInt4104)),
		true));
    }
    
    public void method190(boolean bool, byte i) {
	int i_0_
	    = (((Class322) this).aClass389_3479.aClass381_4105
		   .method4720(0, client.anInt11124 * 473615593, 163947318)
	       + -88273459 * ((Class322) this).aClass389_3479.anInt4098);
	int i_1_
	    = (((Class322) this).aClass389_3479.aClass377_4101
		   .method4700(0, -14625703 * client.anInt11022, -569647326)
	       + 1378578313 * ((Class322) this).aClass389_3479.anInt4102);
	String string;
	switch (((Class322) this).aClass389_3479.anInt4107 * 1993408153) {
	default:
	    string = "";
	    break;
	case 0:
	    string = Class293.aClass292_3215.method3912(-1931707864);
	    break;
	case 1:
	    string
		= new StringBuilder().append("").append
		      (Class293.aClass292_3215.method3922(-1055706527)).append
		      ("%").toString();
	    break;
	case 2:
	    string = Class293.aClass292_3215.method3911((byte) -58);
	}
	int i_2_ = Class293.aClass292_3215.method3922(-1508766436);
	if (3741883269587075147L * ((Class322) this).aLong3477 < 0L
	    || i_2_ == 0
	    || i_2_ != -1802817495 * ((Class322) this).anInt3481) {
	    ((Class322) this).aLong3477
		= Class249.method3417(2064292002) * -4394163198505203357L;
	    ((Class322) this).anInt3481 = i_2_ * 205483033;
	}
	if (1 != 1993408153 * ((Class322) this).aClass389_3479.anInt4107
	    && (Class249.method3417(1913374482)
		- ((Class322) this).aLong3477 * 3741883269587075147L) > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class293.aClass292_3215.method3914(1904684974).anInt3143
		       * -2117598397)
		      .append
		      (")").toString();
	((Class322) this).aClass172_3476.method2130(string, i_0_, i_1_,
						    (-97189731
						     * (((Class322) this)
							.aClass389_3479
							.anInt4106)),
						    -1, (byte) 0);
    }
    
    public boolean method186(int i) {
	boolean bool = true;
	if (!((Class322) this).aClass446_3480.method5357(((((Class322) this)
							   .aClass389_3479
							   .anInt4104)
							  * 1108894779),
							 (short) 24400))
	    bool = false;
	if (!((Class322) this).aClass446_3478.method5357(((((Class322) this)
							   .aClass389_3479
							   .anInt4104)
							  * 1108894779),
							 (short) 9828))
	    bool = false;
	return bool;
    }
    
    public void method188(boolean bool) {
	int i = (((Class322) this).aClass389_3479.aClass381_4105
		     .method4720(0, client.anInt11124 * 473615593, -112781184)
		 + -88273459 * ((Class322) this).aClass389_3479.anInt4098);
	int i_3_
	    = (((Class322) this).aClass389_3479.aClass377_4101
		   .method4700(0, -14625703 * client.anInt11022, -1704519060)
	       + 1378578313 * ((Class322) this).aClass389_3479.anInt4102);
	String string;
	switch (((Class322) this).aClass389_3479.anInt4107 * 1993408153) {
	default:
	    string = "";
	    break;
	case 0:
	    string = Class293.aClass292_3215.method3912(-1356452607);
	    break;
	case 1:
	    string = new StringBuilder().append("").append
			 (Class293.aClass292_3215.method3922(339750891)).append
			 ("%").toString();
	    break;
	case 2:
	    string = Class293.aClass292_3215.method3911((byte) -74);
	}
	int i_4_ = Class293.aClass292_3215.method3922(-1573810167);
	if (3741883269587075147L * ((Class322) this).aLong3477 < 0L
	    || i_4_ == 0
	    || i_4_ != -1802817495 * ((Class322) this).anInt3481) {
	    ((Class322) this).aLong3477
		= Class249.method3417(1900942451) * -4394163198505203357L;
	    ((Class322) this).anInt3481 = i_4_ * 205483033;
	}
	if (1 != 1993408153 * ((Class322) this).aClass389_3479.anInt4107
	    && (Class249.method3417(2073198265)
		- ((Class322) this).aLong3477 * 3741883269587075147L) > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class293.aClass292_3215.method3914(1810715295).anInt3143
		       * -2117598397)
		      .append
		      (")").toString();
	((Class322) this).aClass172_3476.method2130(string, i, i_3_,
						    (-97189731
						     * (((Class322) this)
							.aClass389_3479
							.anInt4106)),
						    -1, (byte) 0);
    }
    
    Class322(Class446 class446, Class446 class446_5_, Class389 class389) {
	((Class322) this).aClass446_3480 = class446;
	((Class322) this).aClass446_3478 = class446_5_;
	((Class322) this).aClass389_3479 = class389;
    }
    
    public void method189(boolean bool) {
	int i = (((Class322) this).aClass389_3479.aClass381_4105
		     .method4720(0, client.anInt11124 * 473615593, -835088187)
		 + -88273459 * ((Class322) this).aClass389_3479.anInt4098);
	int i_6_
	    = (((Class322) this).aClass389_3479.aClass377_4101
		   .method4700(0, -14625703 * client.anInt11022, -690243647)
	       + 1378578313 * ((Class322) this).aClass389_3479.anInt4102);
	String string;
	switch (((Class322) this).aClass389_3479.anInt4107 * 1993408153) {
	default:
	    string = "";
	    break;
	case 0:
	    string = Class293.aClass292_3215.method3912(-1978586702);
	    break;
	case 1:
	    string
		= new StringBuilder().append("").append
		      (Class293.aClass292_3215.method3922(1849278503)).append
		      ("%").toString();
	    break;
	case 2:
	    string = Class293.aClass292_3215.method3911((byte) -18);
	}
	int i_7_ = Class293.aClass292_3215.method3922(-2075095191);
	if (3741883269587075147L * ((Class322) this).aLong3477 < 0L
	    || i_7_ == 0
	    || i_7_ != -1802817495 * ((Class322) this).anInt3481) {
	    ((Class322) this).aLong3477
		= Class249.method3417(1992823181) * -4394163198505203357L;
	    ((Class322) this).anInt3481 = i_7_ * 205483033;
	}
	if (1 != 1993408153 * ((Class322) this).aClass389_3479.anInt4107
	    && (Class249.method3417(1958817809)
		- ((Class322) this).aLong3477 * 3741883269587075147L) > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class293.aClass292_3215.method3914(1902079842).anInt3143
		       * -2117598397)
		      .append
		      (")").toString();
	((Class322) this).aClass172_3476.method2130(string, i, i_6_,
						    (-97189731
						     * (((Class322) this)
							.aClass389_3479
							.anInt4106)),
						    -1, (byte) 0);
    }
    
    public void method195() {
	Class1 class1
	    = Class392.method4800(((Class322) this).aClass446_3478,
				  1108894779 * (((Class322) this)
						.aClass389_3479.anInt4104),
				  Class625.aClass414_8129, (byte) 54);
	((Class322) this).aClass172_3476
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class322) this).aClass446_3480,
				    1108894779 * (((Class322) this)
						  .aClass389_3479.anInt4104)),
		true));
    }
    
    public void method187(short i) {
	Class1 class1
	    = Class392.method4800(((Class322) this).aClass446_3478,
				  1108894779 * (((Class322) this)
						.aClass389_3479.anInt4104),
				  Class625.aClass414_8129, (byte) 104);
	((Class322) this).aClass172_3476
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class322) this).aClass446_3480,
				    1108894779 * (((Class322) this)
						  .aClass389_3479.anInt4104)),
		true));
    }
    
    public void method192() {
	Class1 class1
	    = Class392.method4800(((Class322) this).aClass446_3478,
				  1108894779 * (((Class322) this)
						.aClass389_3479.anInt4104),
				  Class625.aClass414_8129, (byte) 41);
	((Class322) this).aClass172_3476
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class322) this).aClass446_3480,
				    1108894779 * (((Class322) this)
						  .aClass389_3479.anInt4104)),
		true));
    }
    
    public void method185(boolean bool) {
	int i = (((Class322) this).aClass389_3479.aClass381_4105
		     .method4720(0, client.anInt11124 * 473615593, -1210275606)
		 + -88273459 * ((Class322) this).aClass389_3479.anInt4098);
	int i_8_
	    = (((Class322) this).aClass389_3479.aClass377_4101
		   .method4700(0, -14625703 * client.anInt11022, -1637434454)
	       + 1378578313 * ((Class322) this).aClass389_3479.anInt4102);
	String string;
	switch (((Class322) this).aClass389_3479.anInt4107 * 1993408153) {
	default:
	    string = "";
	    break;
	case 0:
	    string = Class293.aClass292_3215.method3912(-1944842287);
	    break;
	case 1:
	    string = new StringBuilder().append("").append
			 (Class293.aClass292_3215.method3922(679293134)).append
			 ("%").toString();
	    break;
	case 2:
	    string = Class293.aClass292_3215.method3911((byte) -14);
	}
	int i_9_ = Class293.aClass292_3215.method3922(-1824310380);
	if (3741883269587075147L * ((Class322) this).aLong3477 < 0L
	    || i_9_ == 0
	    || i_9_ != -1802817495 * ((Class322) this).anInt3481) {
	    ((Class322) this).aLong3477
		= Class249.method3417(1960599458) * -4394163198505203357L;
	    ((Class322) this).anInt3481 = i_9_ * 205483033;
	}
	if (1 != 1993408153 * ((Class322) this).aClass389_3479.anInt4107
	    && (Class249.method3417(1895078149)
		- ((Class322) this).aLong3477 * 3741883269587075147L) > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class293.aClass292_3215.method3914(2030058344).anInt3143
		       * -2117598397)
		      .append
		      (")").toString();
	((Class322) this).aClass172_3476.method2130(string, i, i_8_,
						    (-97189731
						     * (((Class322) this)
							.aClass389_3479
							.anInt4106)),
						    -1, (byte) 0);
    }
    
    public void method193() {
	Class1 class1
	    = Class392.method4800(((Class322) this).aClass446_3478,
				  1108894779 * (((Class322) this)
						.aClass389_3479.anInt4104),
				  Class625.aClass414_8129, (byte) 26);
	((Class322) this).aClass172_3476
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class322) this).aClass446_3480,
				    1108894779 * (((Class322) this)
						  .aClass389_3479.anInt4104)),
		true));
    }
    
    public void method116() {
	Class1 class1
	    = Class392.method4800(((Class322) this).aClass446_3478,
				  1108894779 * (((Class322) this)
						.aClass389_3479.anInt4104),
				  Class625.aClass414_8129, (byte) 81);
	((Class322) this).aClass172_3476
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class322) this).aClass446_3480,
				    1108894779 * (((Class322) this)
						  .aClass389_3479.anInt4104)),
		true));
    }
    
    public void method191() {
	Class1 class1
	    = Class392.method4800(((Class322) this).aClass446_3478,
				  1108894779 * (((Class322) this)
						.aClass389_3479.anInt4104),
				  Class625.aClass414_8129, (byte) 43);
	((Class322) this).aClass172_3476
	    = (Class587.aClass173_7714.method2240
	       (class1,
		Class175.method2565(((Class322) this).aClass446_3480,
				    1108894779 * (((Class322) this)
						  .aClass389_3479.anInt4104)),
		true));
    }
    
    public boolean method196() {
	boolean bool = true;
	if (!((Class322) this).aClass446_3480.method5357(((((Class322) this)
							   .aClass389_3479
							   .anInt4104)
							  * 1108894779),
							 (short) -8035))
	    bool = false;
	if (!((Class322) this).aClass446_3478.method5357(((((Class322) this)
							   .aClass389_3479
							   .anInt4104)
							  * 1108894779),
							 (short) 7708))
	    bool = false;
	return bool;
    }
    
    public static String method4210(long l, int i, byte i_10_) {
	Class482.method5864(l);
	int i_11_ = Class38.aCalendar339.get(11);
	int i_12_ = Class38.aCalendar339.get(12);
	int i_13_ = Class38.aCalendar339.get(13);
	return new StringBuilder().append(Integer.toString(i_11_ / 10)).append
		   (i_11_ % 10).append
		   (":").append
		   (i_12_ / 10).append
		   (i_12_ % 10).append
		   (":").append
		   (i_13_ / 10).append
		   (i_13_ % 10).toString();
    }
    
    public static void method4211(byte i) {
	Class634.method7560(true, 1128711134);
    }
}
