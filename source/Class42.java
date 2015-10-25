/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class42 implements Interface50
{
    public Object method341(byte[] is, Class1 class1, boolean bool, int i) {
	return Class587.aClass173_7714
		   .method2240(class1, Class175.method2563(is), bool);
    }
    
    public Object method342(byte[] is, Class1 class1, boolean bool) {
	return Class587.aClass173_7714
		   .method2240(class1, Class175.method2563(is), bool);
    }
    
    public Object method343(byte[] is, Class1 class1, boolean bool) {
	return Class587.aClass173_7714
		   .method2240(class1, Class175.method2563(is), bool);
    }
    
    public static void method828(String string, String string_0_, int i,
				 boolean bool, String string_1_, int i_2_) {
	if (client.anInt10876 * 175711435 == 14) {
	    Class528_Sub34 class528_sub34
		= Class656.method7845(OutgoingOpcode.aClass403_4466,
				      client.aClass109_11162.aClass10_1379,
				      -1924400099);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9717(0, (byte) 6);
	    int i_3_
		= (-185904669
		   * class528_sub34.aClass528_Sub42_Sub2_10481.pointer);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string,
								 -1936289654);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string_0_,
								 -1936289654);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(i,
								 (byte) -30);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeByte(bool ? 1 : 0,
								 (byte) -29);
	    class528_sub34.aClass528_Sub42_Sub2_10481.writeString(string_1_,
								 -1936289654);
	    class528_sub34.aClass528_Sub42_Sub2_10481.pointer += 1220108941;
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9705
		(Class43.anIntArray525, i_3_,
		 (-185904669
		  * class528_sub34.aClass528_Sub42_Sub2_10481.pointer),
		 16711935);
	    class528_sub34.aClass528_Sub42_Sub2_10481.method9620
		((class528_sub34.aClass528_Sub42_Sub2_10481.pointer
		  * -185904669) - i_3_,
		 -1892699603);
	    client.aClass109_11162.method1380(class528_sub34, 1365548432);
	    if (i < 13) {
		client.aBool10956 = true;
		Class98.method1309(-1361602895);
	    }
	    Class409.aClass681_4709 = Class681.aClass681_8575;
	}
    }
    
    public static void method829(boolean bool, byte i) {
	if (Class581.aBool7628 != bool) {
	    Class680.method7979(-1087340700);
	    Class581.aBool7628 = bool;
	}
    }
    
    static final void method830(Class648 class648, int i) {
	String string = (String) (((Class648) class648).anObjectArray8396
				  [(((Class648) class648).anInt8410
				    -= 1600226731) * -520794877]);
	int i_4_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class655.method7842(string, i_4_ == 1, (byte) 95);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 939068291 * Class552.anInt7428;
    }
    
    static final void method831(Class648 class648, int i) {
	int i_5_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub16_10576
		  .method8126(i_5_, -1955030095);
    }
    
    public static boolean method832(char c, int i) {
	return c >= '0' && c <= '9';
    }
    
    static final void method833(Class648 class648, byte i) {
	int i_6_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_6_, (byte) 19);
	Class226 class226 = Class380.aClass226Array3970[i_6_ >> 16];
	Class464.method5617(class229, class226, class648, 620677008);
    }
    
    static final void method834(Class648 class648, byte i) {
	int i_7_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_7_, (byte) -54);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = (1 == 292816267 * class229.anInt2418
	       ? class229.anInt2419 * -1386163263 : -1);
    }
}
