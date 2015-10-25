/* Class516 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class516
{
    Class520 this$0;
    Class304[] aClass304Array6968;
    Class304[] aClass304Array6969;
    public static Class446 aClass446_6970;
    
    Class516(Class520 class520) {
	((Class516) this).this$0 = class520;
	((Class516) this).aClass304Array6969 = new Class304[16];
	((Class516) this).aClass304Array6968 = new Class304[16];
	new Class304(8);
	for (int i = 0; i < 16; i++) {
	    ((Class516) this).aClass304Array6969[i] = new Class304(3);
	    ((Class516) this).aClass304Array6968[i] = new Class304(3);
	}
    }
    
    static final void method6281(Class648 class648, int i) {
	Class142 class142
	    = (Class142) (((Class648) class648).aClass528_Sub21_Sub14_8397
			  .anObjectArray11622
			  [-630179809 * ((Class648) class648).anInt8390]);
	Interface17 interface17
	    = ((Interface17)
	       (0 == (((Class648) class648).anIntArray8414
		      [((Class648) class648).anInt8390 * -630179809])
		? ((Class648) class648).aMap8417.get(class142.aClass445_1639)
		: ((Class648) class648).aMap8411
		      .get(class142.aClass445_1639)));
	Class483 class483 = class142.aClass459_1638.method5564(-451713186);
	if (Class483.aClass483_5480 == class483) {
	    if (VarDomainType.CLIENT_CONFIGS == class142.aClass445_1639)
		Class466.method5644(class142, (byte) -123);
	    interface17.method92(class142,
				 (((Class648) class648).anIntArray8394
				  [(((Class648) class648).anInt8395
				    -= 1239022665) * 717927929]),
				 -1917770223);
	} else if (class483 == Class483.aClass483_5472)
	    interface17.method107(class142,
				  (((Class648) class648).aLongArray8398
				   [(((Class648) class648).anInt8399
				     -= 232005975) * 683825767]));
	else if (class483 == Class483.aClass483_5474) {
	    if (VarDomainType.CLIENT_CONFIGS == class142.aClass445_1639)
		Class625.method7449(class142, -1958804812);
	    interface17.method113(class142,
				  (((Class648) class648).anObjectArray8396
				   [(((Class648) class648).anInt8410
				     -= 1600226731) * -520794877]),
				  -1939007169);
	} else
	    throw new RuntimeException();
    }
    
    static final void method6282(Class648 class648, int i) {
	int i_0_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_0_, (byte) -38);
	Class226 class226 = Class380.aClass226Array3970[i_0_ >> 16];
	Class525.method6388(class229, class226, class648, 188909626);
    }
    
    public static short method6283(int i, int i_1_) {
	int i_2_ = i >> 10 & 0x3f;
	int i_3_ = i >> 3 & 0x70;
	int i_4_ = i & 0x7f;
	i_3_ = i_4_ <= 64 ? i_4_ * i_3_ >> 7 : (127 - i_4_) * i_3_ >> 7;
	int i_5_ = i_3_ + i_4_;
	int i_6_;
	if (i_5_ != 0)
	    i_6_ = (i_3_ << 8) / i_5_;
	else
	    i_6_ = i_3_ << 1;
	int i_7_ = i_5_;
	return (short) (i_2_ << 10 | i_6_ >> 4 << 7 | i_7_);
    }
}
