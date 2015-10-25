/* Class656 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class656
{
    static int anInt8434;
    
    Class656() throws Throwable {
	throw new Error();
    }
    
    public static Class528_Sub34 method7845(OutgoingOpcode outgoingOpcode, ISAACCipher iSAACCipher,
					    int i) {
	Class528_Sub34 class528_sub34 = Class141.method1701((byte) 96);
	((Class528_Sub34) class528_sub34).aClass403_10482 = outgoingOpcode;
	((Class528_Sub34) class528_sub34).anInt10480
	    = ((OutgoingOpcode) outgoingOpcode).anInt4577 * -530775725;
	if (((Class528_Sub34) class528_sub34).anInt10480 * -857144775 == -1)
	    class528_sub34.aClass528_Sub42_Sub2_10481
		= new BitBuffer(260);
	else if (-2
		 == ((Class528_Sub34) class528_sub34).anInt10480 * -857144775)
	    class528_sub34.aClass528_Sub42_Sub2_10481
		= new BitBuffer(10000);
	else if (-857144775 * ((Class528_Sub34) class528_sub34).anInt10480
		 <= 18)
	    class528_sub34.aClass528_Sub42_Sub2_10481
		= new BitBuffer(20);
	else if (((Class528_Sub34) class528_sub34).anInt10480 * -857144775
		 <= 98)
	    class528_sub34.aClass528_Sub42_Sub2_10481
		= new BitBuffer(100);
	else
	    class528_sub34.aClass528_Sub42_Sub2_10481
		= new BitBuffer(260);
	class528_sub34.aClass528_Sub42_Sub2_10481.method10616(iSAACCipher,
							      914180937);
	class528_sub34.aClass528_Sub42_Sub2_10481.method10617
	    ((((OutgoingOpcode) ((Class528_Sub34) class528_sub34).aClass403_10482)
	      .anInt4576) * 647563927,
	     -1319948689);
	class528_sub34.anInt10479 = 0;
	return class528_sub34;
    }
    
    static void method7846(Class418 class418, boolean bool, float f,
			   float f_0_, float f_1_, float f_2_, int i, int i_3_,
			   byte i_4_) {
	int i_5_ = client.aClass495_10935.method5972(1750031412);
	int i_6_ = client.aClass495_10935.method6020(1012377122);
	class418.method4984(f, f_0_, f_1_, f_2_, (float) i_6_, (float) i_5_,
			    (float) i, (float) i_3_);
    }
}
