/* Class651 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class651
{
    int anInt8422;
    Class578 aClass578_8423;
    int anInt8424;
    
    int method7742(byte i) {
	return client.anIntArray10941[((Class651) this).anInt8422 * 261512613];
    }
    
    public Interface60 method7743(byte i) {
	Interface60 interface60 = method7744(1324201973);
	if (interface60 == null)
	    return null;
	if (interface60.method397((short) 8627)
	    != 2004681743 * ((Class651) this).anInt8424)
	    return null;
	return interface60;
    }
    
    Interface60 method7744(int i) {
	int i_0_ = -2013577247 * ((Class651) this).aClass578_8423.anInt7606;
	Class578 class578 = client.aClass495_10935.method5966(1273279609);
	int i_1_ = (961465569 * ((Class651) this).aClass578_8423.anInt7607
		    - 961465569 * class578.anInt7607);
	int i_2_ = (-173815201 * ((Class651) this).aClass578_8423.anInt7608
		    - class578.anInt7608 * -173815201);
	if (i_1_ < 0 || i_2_ < 0
	    || i_1_ >= client.aClass495_10935.method6029((short) 28672)
	    || i_2_ >= client.aClass495_10935.method5967(-702963548)
	    || client.aClass495_10935.method5973((byte) 4) == null)
	    return null;
	switch (method7742((byte) 8)) {
	case 3:
	    return ((Interface60)
		    client.aClass495_10935.method5973((byte) 85)
			.method6591(i_0_, i_1_, i_2_, -1159329523));
	default:
	    return null;
	case 1:
	    return (Interface60) client.aClass495_10935.method5973
				     ((byte) 33)
				     .method6555(i_0_, i_1_, i_2_, -881923819);
	case 0:
	    return (Interface60) client.aClass495_10935.method5973
				     ((byte) 69)
				     .method6600(i_0_, i_1_, i_2_, (byte) -61);
	case 2:
	    return ((Interface60)
		    (client.aClass495_10935.method5973((byte) 117).method6583
		     (i_0_, i_1_, i_2_, client.anInterface62_11170,
		      1965603660)));
	}
    }
    
    public Class651(Class578 class578, int i, int i_3_, int i_4_) {
	((Class651) this).aClass578_8423 = class578;
	((Class651) this).anInt8422 = i * 1395212845;
	((Class651) this).anInt8424 = i_4_ * 817195759;
    }
    
    int method7745() {
	return client.anIntArray10941[((Class651) this).anInt8422 * 261512613];
    }
    
    static final void method7746(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -446398623 * Class54.anInt670;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 1000687987 * Class54.anInt672;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1880432705 * Class54.anInt645;
	Class54.anInt670 = -1351928130;
	Class54.anInt672 = 1975712837;
	Class54.anInt645 = -1451823167;
    }
    
    static boolean method7747(int i) {
	Class54.anInt651 = 540606397;
	Class54.aClass109_624 = client.aClass109_11162;
	return Class455.method5516((-9152589463575654529L * Class54.aLong632
				    == -1L),
				   true, "", "",
				   Class54.aLong632 * -9152589463575654529L);
    }
    
    static boolean method7748(byte i) {
	return Class184.method2709(Class293.aClass597_3223.aClass564_7851,
				   1271473924);
    }
    
    public static Interface67 method7749(Class446 class446, int i,
					 Interface69 interface69, boolean bool,
					 Class186 class186, byte i_5_) {
	if (Class641.aClass364_8273 != null) {
	    if (bool)
		return new Class603(class446, i, Class641.aClass364_8273,
				    interface69);
	    return new Class589(class446, i, Class641.aClass364_8273,
				interface69, class186);
	}
	return null;
    }
}
