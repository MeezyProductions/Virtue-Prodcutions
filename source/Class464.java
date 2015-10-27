/* Class464 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class464
{
    int anInt5302;
    int anInt5303;
    Class442 aClass442_5304;
    public static int anInt5305;
    
    int method5603() {
	return -353740733 * ((Class464) this).anInt5302;
    }
    
    Class442 method5604(int i) {
	return ((Class464) this).aClass442_5304;
    }
    
    Class464(ByteBuffer class528_sub42) {
	((Class464) this).aClass442_5304
	    = ((Class442)
	       Class443.method5321(Class442.method5309(744664223),
				   class528_sub42.readUnsignedByte((byte) 27),
				   1080775915));
	((Class464) this).anInt5303
	    = class528_sub42.readInt(-1519931581) * 2136172991;
	if (((Class464) this).aClass442_5304 != Class442.aClass442_4908)
	    ((Class464) this).anInt5302
		= class528_sub42.readInt(1008375617) * -987057045;
	else
	    ((Class464) this).anInt5302
		= -683841451 * ((Class464) this).anInt5303;
    }
    
    int method5605(int i) {
	return -353740733 * ((Class464) this).anInt5302;
    }
    
    int method5606() {
	return ((Class464) this).anInt5303 * -2136897985;
    }
    
    int method5607(byte i) {
	return ((Class464) this).anInt5303 * -2136897985;
    }
    
    int method5608() {
	return -353740733 * ((Class464) this).anInt5302;
    }
    
    int method5609() {
	return -353740733 * ((Class464) this).anInt5302;
    }
    
    public static void method5610(int[] is, int[] is_0_, int i, int i_1_,
				  int i_2_) {
	if (i < i_1_) {
	    int i_3_ = (i + i_1_) / 2;
	    int i_4_ = i;
	    int i_5_ = is[i_3_];
	    is[i_3_] = is[i_1_];
	    is[i_1_] = i_5_;
	    int i_6_ = is_0_[i_3_];
	    is_0_[i_3_] = is_0_[i_1_];
	    is_0_[i_1_] = i_6_;
	    int i_7_ = 2147483647 == i_5_ ? 0 : 1;
	    for (int i_8_ = i; i_8_ < i_1_; i_8_++) {
		if (is[i_8_] < (i_8_ & i_7_) + i_5_) {
		    int i_9_ = is[i_8_];
		    is[i_8_] = is[i_4_];
		    is[i_4_] = i_9_;
		    int i_10_ = is_0_[i_8_];
		    is_0_[i_8_] = is_0_[i_4_];
		    is_0_[i_4_++] = i_10_;
		}
	    }
	    is[i_1_] = is[i_4_];
	    is[i_4_] = i_5_;
	    is_0_[i_1_] = is_0_[i_4_];
	    is_0_[i_4_] = i_6_;
	    method5610(is, is_0_, i, i_4_ - 1, 1600680729);
	    method5610(is, is_0_, i_4_ + 1, i_1_, 1584486117);
	}
    }
    
    static final void method5611(Class648 class648, int i) {
	Class528_Sub19 class528_sub19
	    = (Class528_Sub19) (((Class648) class648).anObjectArray8396
				[(((Class648) class648).anInt8410
				  -= 1600226731) * -520794877]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = -1852661307 * class528_sub19.anInt10393;
    }
    
    static final void method5612(Class648 class648, int i) {
	Class514.aClass528_Sub38_6967.method9556
	    (Class514.aClass528_Sub38_6967.aClass691_Sub16_10576,
	     ((((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	      == 1) ? 1 : 0,
	     218097881);
	client.gameScene.method5989(2016078152);
	Class243.method3387(2144298523);
	client.aBool11161 = false;
    }
    
    static final void method5613(Class648 class648, int i) {
	long l = Class249.method3417(1947513366);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class214.method2972(l);
    }
    
    static final void method5614(Class648 class648, byte i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	Class528_Sub34 class528_sub34
	    = Class656.method7845(OutgoingOpcode.aClass403_4456,
				  client.aClass109_10930.aClass10_1379,
				  -2085624849);
	class528_sub34.aClass528_Sub42_Sub2_10481
	    .writeByte(string.length() + 1, (byte) -29);
	class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
							     -1936289654);
	client.aClass109_10930.method1380(class528_sub34, 1096334240);
    }
    
    static final void method5615(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = client.aBool10966 ? 1 : 0;
    }
    
    static final void method5616(Class648 class648, int i)
	throws Exception_Sub4 {
	int i_11_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class495.aClass283_Sub1_5578.method3831(Class144.method1713(i_11_,
								    857980141),
						true, 684143918);
	client.aBool10982 = true;
    }
    
    static final void method5617(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	if (Class494.method5957(string, class648, (short) 520) != null)
	    string = string.substring(0, string.length() - 1);
	class229.anObjectArray2494
	    = Class181_Sub23.method8999(string, class648, (byte) 31);
	class229.aBool2483 = true;
    }
}
