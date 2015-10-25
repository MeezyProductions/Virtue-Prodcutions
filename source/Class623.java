/* Class623 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class623
{
    Class186 aClass186_8117 = new Class186(2);
    Class446 aClass446_8118;
    public static int anInt8119;
    
    void method7422(int i, int i_0_) {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2747(i, -587111481);
	}
    }
    
    void method7423(byte i) {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2731(-941994425);
	}
    }
    
    void method7424() {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2731(-976276741);
	}
    }
    
    void method7425(int i) {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2747(i, 666143190);
	}
    }
    
    void method7426() {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2731(-1278804400);
	}
    }
    
    void method7427() {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2731(-1189150947);
	}
    }
    
    Class623(Class446 class446) {
	((Class623) this).aClass446_8118 = class446;
    }
    
    void method7428() {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2735(-1001849438);
	}
    }
    
    void method7429(int i) {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2747(i, -595770246);
	}
    }
    
    void method7430(int i) {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2747(i, -1447553270);
	}
    }
    
    void method7431(byte i) {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2735(-853328618);
	}
    }
    
    void method7432() {
	synchronized (((Class623) this).aClass186_8117) {
	    ((Class623) this).aClass186_8117.method2735(-1334645428);
	}
    }
    
    static final void method7433(Class648 class648, int i) {
	((Class648) class648).anInt8395 -= -577899301;
	int i_1_ = (((Class648) class648).anIntArray8394
		    [((Class648) class648).anInt8395 * 717927929]);
	int i_2_ = (((Class648) class648).anIntArray8394
		    [1 + 717927929 * ((Class648) class648).anInt8395]);
	int i_3_ = (((Class648) class648).anIntArray8394
		    [2 + ((Class648) class648).anInt8395 * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_3_, (byte) -65);
	Class689.method8062(class229, i_1_, i_2_, 1160917245);
    }
    
    static final void method7434(Class648 class648, short i) {
	Class528_Sub21_Sub11 class528_sub21_sub11
	    = Class528_Sub1.method9237((byte) 98);
	if (Class60.method1001(class528_sub21_sub11, 651076312) == 7) {
	    int i_4_ = (int) class528_sub21_sub11.method10556(65280);
	    if (i_4_ >= 0 && i_4_ <= 1087758653 * GPI.localPlayerCount) {
		Player class645_sub1_sub5_sub1_sub2
		    = client.localPlayers[i_4_];
		if (class645_sub1_sub5_sub1_sub2 != null) {
		    ((Class648) class648).aClass645_Sub1_Sub5_Sub1_8389
			= class645_sub1_sub5_sub1_sub2;
		    ((Class648) class648).anIntArray8394
			[((((Class648) class648).anInt8395 += 1239022665)
			  * 717927929) - 1]
			= 1;
		    return;
		}
	    }
	}
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 0;
    }
    
    public static Class549 method7435(boolean bool, int i) {
	synchronized (Class549.aStack7418) {
	    Class549 class549;
	    if (Class549.aStack7418.isEmpty())
		class549 = new Class549();
	    else
		class549 = (Class549) Class549.aStack7418.pop();
	    ((Class549) class549).aBool7419 = bool;
	    Class549 class549_5_ = class549;
	    return class549_5_;
	}
    }
}
