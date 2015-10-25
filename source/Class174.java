/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class174
{
    public static final int anInt2009 = 16;
    public static int[] anIntArray2010 = { 3, 7, 15 };
    public static final int anInt2011 = 1023;
    public static final int anInt2012 = 32;
    public static int[] anIntArray2013 = { 2047, 16383, 65535 };
    public static final int anInt2014 = 8191;
    public static final int anInt2015 = 8;
    public static final int anInt2016 = 1;
    public static final int anInt2017 = 0;
    public static final int anInt2018 = 16;
    public static final int anInt2019 = 0;
    public static final int anInt2020 = 2;
    public static final int anInt2021 = 64;
    public static final int anInt2022 = 2;
    
    Class174() throws Throwable {
	throw new Error();
    }
    
    static final void method2556(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.anInt11025 * -1453744879;
    }
    
    static final void method2557(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class514.aClass528_Sub38_6967.method9556((Class514.aClass528_Sub38_6967
						  .aClass691_Sub1_10571),
						 i_0_, 1623654243);
	client.aClass495_10935.method5989(2016078152);
	Class243.method3387(2136317762);
	client.aBool11161 = false;
    }
    
    static final void method2558(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [717927929 * ((Class648) class648).anInt8395]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [1 + ((Class648) class648).anInt8395 * 717927929]);
	if (Class108.myPlayer.model
	    != null) {
	    for (int i_3_ = 0; i_3_ < Class282.anIntArray3076.length; i_3_++) {
		if (Class282.anIntArray3076[i_3_] == i_1_) {
		    Class108.myPlayer
			.model.method7282
			(i_3_, i_2_, ISAACCipher.aClass5_Sub7_157, (byte) 57);
		    return;
		}
	    }
	    for (int i_4_ = 0; i_4_ < Class282.anIntArray3077.length; i_4_++) {
		if (i_1_ == Class282.anIntArray3077[i_4_]) {
		    Class108.myPlayer
			.model.method7282
			(i_4_, i_2_, ISAACCipher.aClass5_Sub7_157, (byte) 11);
		    break;
		}
	    }
	}
    }
    
    static final void method2559(Class648 class648, byte i) {
	Class570.method6856(-592825187);
    }
    
    static final void method2560(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub10_10572
		  .method9901(-1888478825);
    }
}
