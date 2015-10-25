/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class115
{
    Class120_Sub4[] aClass120_Sub4Array1411;
    static final int anInt1412 = 128;
    Class120_Sub4[] aClass120_Sub4Array1413 = null;
    static final int anInt1414 = 16;
    static Object anObject1415;
    static final int anInt1416 = 4000;
    Class120_Sub2 aClass120_Sub2_1417 = null;
    Class120_Sub2 aClass120_Sub2_1418;
    static Object anObject1419;
    Class120_Sub2 aClass120_Sub2_1420;
    boolean aBool1421;
    static Object anObject1422;
    static final int anInt1423 = 128;
    
    Class115(Class173_Sub2 class173_sub2) {
	((Class115) this).aClass120_Sub4Array1411 = null;
	((Class115) this).aClass120_Sub2_1418 = null;
	((Class115) this).aClass120_Sub2_1420 = null;
	((Class115) this).aBool1421
	    = ((Class173_Sub2) class173_sub2).aBool9574;
	method1441(class173_sub2);
	if (!((Class115) this).aBool1421) {
	    ((Class115) this).aClass120_Sub4Array1413 = new Class120_Sub4[16];
	    for (int i = 0; i < 16; i++) {
		byte[] is = Class255.method3451(anObject1419, i * 32768, 32768,
						(byte) -62);
		((Class115) this).aClass120_Sub4Array1413[i]
		    = new Class120_Sub4(class173_sub2, 3553,
					Class149.aClass149_1679,
					Class169.aClass169_1935, 128, 128,
					true, is, Class149.aClass149_1679,
					false);
	    }
	    ((Class115) this).aClass120_Sub4Array1411 = new Class120_Sub4[16];
	    for (int i = 0; i < 16; i++) {
		byte[] is = Class255.method3451(anObject1422, i * 32768, 32768,
						(byte) -55);
		((Class115) this).aClass120_Sub4Array1411[i]
		    = new Class120_Sub4(class173_sub2, 3553,
					Class149.aClass149_1679,
					Class169.aClass169_1935, 128, 128,
					true, is, Class149.aClass149_1679,
					false);
	    }
	} else {
	    byte[] is = Class653.method7795(anObject1419, false, (byte) -73);
	    ((Class115) this).aClass120_Sub2_1417
		= new Class120_Sub2(class173_sub2, Class149.aClass149_1679,
				    Class169.aClass169_1935, 128, 128, 16, is,
				    Class149.aClass149_1679);
	    is = Class653.method7795(anObject1422, false, (byte) -110);
	    ((Class115) this).aClass120_Sub2_1418
		= new Class120_Sub2(class173_sub2, Class149.aClass149_1679,
				    Class169.aClass169_1935, 128, 128, 16, is,
				    Class149.aClass149_1679);
	    Class153 class153 = ((Class173_Sub2) class173_sub2).aClass153_9444;
	    if (class153.method1827()) {
		is = Class653.method7795(anObject1415, false, (byte) -42);
		((Class115) this).aClass120_Sub2_1420
		    = new Class120_Sub2(class173_sub2, Class149.aClass149_1676,
					Class169.aClass169_1935, 128, 128, 16);
		Class120_Sub2 class120_sub2
		    = new Class120_Sub2(class173_sub2, Class149.aClass149_1680,
					Class169.aClass169_1935, 128, 128, 16,
					is, Class149.aClass149_1680);
		if (!class153.method1828(((Class115) this).aClass120_Sub2_1420,
					 class120_sub2, 2.0F)) {
		    ((Class115) this).aClass120_Sub2_1420.method1573();
		    ((Class115) this).aClass120_Sub2_1420 = null;
		} else
		    ((Class115) this).aClass120_Sub2_1420.method1547();
		class120_sub2.method1573();
	    }
	}
    }
    
    static void method1441(Class173_Sub2 class173_sub2) {
	if (anObject1419 == null) {
	    Class412_Sub2_Sub1 class412_sub2_sub1 = new Class412_Sub2_Sub1();
	    byte[] is = class412_sub2_sub1.method10422(128, 128, 16);
	    anObject1419 = Class36.method788(is, false, (byte) -32);
	}
	if (anObject1422 == null) {
	    Class412_Sub1_Sub2 class412_sub1_sub2 = new Class412_Sub1_Sub2();
	    byte[] is = class412_sub1_sub2.method10458(128, 128, 16);
	    anObject1422 = Class36.method788(is, false, (byte) 75);
	}
	Class153 class153 = ((Class173_Sub2) class173_sub2).aClass153_9444;
	if (class153.method1827() && anObject1415 == null) {
	    byte[] is = Class515.method6279(128, 128, 16, 8,
					    new Class512_Sub1(419684), 4.0F,
					    4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1415 = Class36.method788(is, false, (byte) -8);
	}
    }
}
