/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class176
{
    public int anInt2026;
    public static Class172 aClass172_2027;
    public int anInt2028;
    public int anInt2029;
    int anInt2030;
    static Class1 aClass1_2031;
    
    Class176 method2566(int i, int i_0_) {
	return new Class176(1984522459 * anInt2028, i,
			    ((Class176) this).anInt2030 * 98003883,
			    anInt2029 * -530518277);
    }
    
    Class176(int i, int i_1_, int i_2_, int i_3_) {
	anInt2028 = i * 1205621587;
	anInt2026 = i_1_ * 1878387043;
	((Class176) this).anInt2030 = -620218621 * i_2_;
	anInt2029 = i_3_ * 1330900019;
    }
    
    static final void method2567(Class648 class648, int i) {
	VarDefinition varDefinition
	    = (VarDefinition) (((Class648) class648).aClass528_Sub21_Sub14_8397
			  .anObjectArray11622
			  [((Class648) class648).anInt8390 * -630179809]);
	Interface17 interface17
	    = ((Interface17)
	       ((((Class648) class648).anIntArray8414
		 [((Class648) class648).anInt8390 * -630179809]) == 0
		? ((Class648) class648).aMap8417
		      .get(varDefinition.aClass142_3415.aClass445_1639)
		: ((Class648) class648).aMap8411
		      .get(varDefinition.aClass142_3415.aClass445_1639)));
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = interface17.method97(varDefinition, -1860881523);
    }
    
    static void method2568(int i, int i_4_, int i_5_, int i_6_, int i_7_,
			   int i_8_, Class591 class591, byte i_9_) {
	Class528_Sub9 class528_sub9 = null;
	for (Class528_Sub9 class528_sub9_10_
		 = ((Class528_Sub9)
		    Class528_Sub9.aClass688_10274.method8034(1192694269));
	     class528_sub9_10_ != null;
	     class528_sub9_10_ = (Class528_Sub9) Class528_Sub9
						     .aClass688_10274
						     .method8037(-13047325)) {
	    if ((1377052225 * ((Class528_Sub9) class528_sub9_10_).anInt10289
		 == i)
		&& i_4_ == -419484275 * class528_sub9_10_.anInt10276
		&& i_5_ == class528_sub9_10_.anInt10288 * 1250348405
		&& i_6_ == (((Class528_Sub9) class528_sub9_10_).anInt10275
			    * -1126754717)) {
		class528_sub9 = class528_sub9_10_;
		break;
	    }
	}
	if (class528_sub9 == null) {
	    class528_sub9 = new Class528_Sub9();
	    ((Class528_Sub9) class528_sub9).anInt10289 = i * -193009215;
	    ((Class528_Sub9) class528_sub9).anInt10275 = 769661771 * i_6_;
	    class528_sub9.anInt10276 = -2046894779 * i_4_;
	    class528_sub9.anInt10288 = i_5_ * -677389603;
	    Class528_Sub9.aClass688_10274.method8031(class528_sub9,
						     (byte) -38);
	}
	class528_sub9.anInt10281 = i_7_ * -1188402619;
	((Class528_Sub9) class528_sub9).anInt10283 = i_8_ * -1952474425;
	((Class528_Sub9) class528_sub9).aClass591_10286 = class591;
	((Class528_Sub9) class528_sub9).aBool10285 = true;
	((Class528_Sub9) class528_sub9).aBool10277 = false;
    }
    
    public static boolean method2569(int i) {
	do {
	    boolean bool;
	    try {
		if (IcmpService_Sub1.available())
		    break;
		bool = false;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	} while (false);
	if (null != IcmpService_Sub1.anIcmpService_Sub1_10611)
	    throw new IllegalStateException("");
	IcmpService_Sub1.anIcmpService_Sub1_10611 = new IcmpService_Sub1();
	Thread thread = new Thread(new Class633());
	thread.setDaemon(true);
	thread.start();
	return true;
    }
    
    static final void method2570(Class229 class229, Class226 class226,
				 Class648 class648, byte i) {
	int i_11_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	if (i_11_ == 1032506869 * Class229.anInt2391
	    || i_11_ == -1620318229 * Class229.anInt2470
	    || Class229.anInt2536 * 229565833 == i_11_
	    || i_11_ == -1835999081 * Class229.anInt2368)
	    class229.anInt2481 = 1833395217 * i_11_;
    }
}
