/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.FileOutputStream;
import java.io.IOException;

public class Class315
{
    short[] aShortArray3444;
    int anInt3445;
    static FileOutputStream aFileOutputStream3446;
    
    public int method4154(Class324 class324, int i) throws IOException {
	int i_0_ = 1;
	for (int i_1_ = ((Class315) this).anInt3445 * 415047437; 0 != i_1_;
	     i_1_--)
	    i_0_ = ((i_0_ << 1)
		    + class324.method4217(((Class315) this).aShortArray3444,
					  i_0_, -367970105));
	return i_0_ - (1 << ((Class315) this).anInt3445 * 415047437);
    }
    
    public int method4155(Class324 class324, int i) throws IOException {
	int i_2_ = 1;
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < ((Class315) this).anInt3445 * 415047437;
	     i_4_++) {
	    int i_5_ = class324.method4217(((Class315) this).aShortArray3444,
					   i_2_, -1477018196);
	    i_2_ <<= 1;
	    i_2_ += i_5_;
	    i_3_ |= i_5_ << i_4_;
	}
	return i_3_;
    }
    
    public void method4156() {
	Class253.method3439(((Class315) this).aShortArray3444, (byte) -52);
    }
    
    public void method4157(int i) {
	Class253.method3439(((Class315) this).aShortArray3444, (byte) -6);
    }
    
    public Class315(int i) {
	((Class315) this).anInt3445 = i * -1952135227;
	((Class315) this).aShortArray3444 = new short[1 << i];
    }
    
    public void method4158() {
	Class253.method3439(((Class315) this).aShortArray3444, (byte) -25);
    }
    
    static final void method4159(Class648 class648, byte i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class238.method3295(class229, class226, class648, 1070847419);
    }
    
    static final void method4160(Class648 class648, int i) {
	int i_6_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_6_, (byte) 52);
	if (null == class229.aString2473)
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= "";
	else
	    ((Class648) class648).anObjectArray8396
		[((((Class648) class648).anInt8410 += 1600226731) * -520794877
		  - 1)]
		= class229.aString2473;
    }
    
    static final void method4161(Class648 class648, int i) {
	CharSequence charsequence
	    = (CharSequence) (((Class648) class648).anObjectArray8396
			      [((((Class648) class648).anInt8410 -= 1600226731)
				* -520794877)]);
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = Class388.method4768(charsequence, (short) -599);
    }
    
    static void method4162(Class433 class433, Class418 class418, int i,
			   int i_7_, int i_8_) {
	if (null == Class28.aClass418_287)
	    Class28.aClass418_287 = new Class418(class418);
	else
	    Class28.aClass418_287.method4986(class418);
	Class28.aClass433_289.method5217(class433);
	Class28.anInt285 = -1262500675 * i;
	Class28.anInt272 = i_7_ * 757956253;
    }
    
    static final void method4163(Class648 class648, int i) {
	int i_9_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_9_, (byte) 16);
	Class226 class226 = Class380.aClass226Array3970[i_9_ >> 16];
	Class211.method2959(class229, class226, class648, 66866548);
    }
}
