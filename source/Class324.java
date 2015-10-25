/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.InputStream;

public class Class324
{
    static final int anInt3486 = -16777216;
    static final int anInt3487 = 11;
    static final int anInt3488 = 2048;
    static final int anInt3489 = 5;
    int anInt3490;
    int anInt3491;
    InputStream anInputStream3492;
    
    public final void method4215(int i) throws IOException {
	((Class324) this).anInt3491 = 0;
	((Class324) this).anInt3490 = 1226291233;
	for (int i_0_ = 0; i_0_ < 5; i_0_++)
	    ((Class324) this).anInt3491
		= (327578535 * ((Class324) this).anInt3491 << 8
		   | ((Class324) this).anInputStream3492.read()) * -912587753;
    }
    
    public final void method4216(InputStream inputstream, int i) {
	((Class324) this).anInputStream3492 = inputstream;
    }
    
    public int method4217(short[] is, int i, int i_1_) throws IOException {
	int i_2_ = is[i];
	int i_3_ = i_2_ * (-176540641 * ((Class324) this).anInt3490 >>> 11);
	if ((((Class324) this).anInt3491 * 327578535 ^ ~0x7fffffff)
	    < (i_3_ ^ ~0x7fffffff)) {
	    ((Class324) this).anInt3490 = -1226291233 * i_3_;
	    is[i] = (short) (i_2_ + (2048 - i_2_ >>> 5));
	    if ((((Class324) this).anInt3490 * -176540641 & ~0xffffff) == 0) {
		((Class324) this).anInt3491
		    = ((327578535 * ((Class324) this).anInt3491 << 8
			| ((Class324) this).anInputStream3492.read())
		       * -912587753);
		((Class324) this).anInt3490
		    = ((((Class324) this).anInt3490 * -176540641 << 8)
		       * -1226291233);
	    }
	    return 0;
	}
	((Class324) this).anInt3490 -= -1226291233 * i_3_;
	((Class324) this).anInt3491 -= -912587753 * i_3_;
	is[i] = (short) (i_2_ - (i_2_ >>> 5));
	if ((-176540641 * ((Class324) this).anInt3490 & ~0xffffff) == 0) {
	    ((Class324) this).anInt3491
		= (327578535 * ((Class324) this).anInt3491 << 8
		   | ((Class324) this).anInputStream3492.read()) * -912587753;
	    ((Class324) this).anInt3490
		= ((((Class324) this).anInt3490 * -176540641 << 8)
		   * -1226291233);
	}
	return 1;
    }
    
    public final int method4218(int i) throws IOException {
	int i_4_ = 0;
	for (int i_5_ = i; 0 != i_5_; i_5_--) {
	    ((Class324) this).anInt3490
		= -1226291233 * (-176540641 * ((Class324) this).anInt3490
				 >>> 1);
	    int i_6_ = ((327578535 * ((Class324) this).anInt3491
			 - ((Class324) this).anInt3490 * -176540641)
			>>> 31);
	    ((Class324) this).anInt3491
		-= ((-176540641 * ((Class324) this).anInt3490 & i_6_ - 1)
		    * -912587753);
	    i_4_ = i_4_ << 1 | 1 - i_6_;
	    if (0 == (-176540641 * ((Class324) this).anInt3490 & ~0xffffff)) {
		((Class324) this).anInt3491
		    = ((327578535 * ((Class324) this).anInt3491 << 8
			| ((Class324) this).anInputStream3492.read())
		       * -912587753);
		((Class324) this).anInt3490
		    = -1226291233 * (((Class324) this).anInt3490 * -176540641
				     << 8);
	    }
	}
	return i_4_;
    }
    
    public final void method4219() {
	((Class324) this).anInputStream3492 = null;
    }
    
    public final void method4220() throws IOException {
	((Class324) this).anInt3491 = 0;
	((Class324) this).anInt3490 = 1226291233;
	for (int i = 0; i < 5; i++)
	    ((Class324) this).anInt3491
		= (327578535 * ((Class324) this).anInt3491 << 8
		   | ((Class324) this).anInputStream3492.read()) * -912587753;
    }
    
    public final int method4221(int i, int i_7_) throws IOException {
	int i_8_ = 0;
	for (int i_9_ = i; 0 != i_9_; i_9_--) {
	    ((Class324) this).anInt3490
		= -1226291233 * (-176540641 * ((Class324) this).anInt3490
				 >>> 1);
	    int i_10_ = ((327578535 * ((Class324) this).anInt3491
			  - ((Class324) this).anInt3490 * -176540641)
			 >>> 31);
	    ((Class324) this).anInt3491
		-= ((-176540641 * ((Class324) this).anInt3490 & i_10_ - 1)
		    * -912587753);
	    i_8_ = i_8_ << 1 | 1 - i_10_;
	    if (0 == (-176540641 * ((Class324) this).anInt3490 & ~0xffffff)) {
		((Class324) this).anInt3491
		    = ((327578535 * ((Class324) this).anInt3491 << 8
			| ((Class324) this).anInputStream3492.read())
		       * -912587753);
		((Class324) this).anInt3490
		    = -1226291233 * (((Class324) this).anInt3490 * -176540641
				     << 8);
	    }
	}
	return i_8_;
    }
    
    public final void method4222(byte i) {
	((Class324) this).anInputStream3492 = null;
    }
    
    public final int method4223(int i) throws IOException {
	int i_11_ = 0;
	for (int i_12_ = i; 0 != i_12_; i_12_--) {
	    ((Class324) this).anInt3490
		= -1226291233 * (-176540641 * ((Class324) this).anInt3490
				 >>> 1);
	    int i_13_ = ((327578535 * ((Class324) this).anInt3491
			  - ((Class324) this).anInt3490 * -176540641)
			 >>> 31);
	    ((Class324) this).anInt3491
		-= ((-176540641 * ((Class324) this).anInt3490 & i_13_ - 1)
		    * -912587753);
	    i_11_ = i_11_ << 1 | 1 - i_13_;
	    if (0 == (-176540641 * ((Class324) this).anInt3490 & ~0xffffff)) {
		((Class324) this).anInt3491
		    = ((327578535 * ((Class324) this).anInt3491 << 8
			| ((Class324) this).anInputStream3492.read())
		       * -912587753);
		((Class324) this).anInt3490
		    = -1226291233 * (((Class324) this).anInt3490 * -176540641
				     << 8);
	    }
	}
	return i_11_;
    }
    
    public final int method4224(int i) throws IOException {
	int i_14_ = 0;
	for (int i_15_ = i; 0 != i_15_; i_15_--) {
	    ((Class324) this).anInt3490
		= -1226291233 * (-176540641 * ((Class324) this).anInt3490
				 >>> 1);
	    int i_16_ = ((327578535 * ((Class324) this).anInt3491
			  - ((Class324) this).anInt3490 * -176540641)
			 >>> 31);
	    ((Class324) this).anInt3491
		-= ((-176540641 * ((Class324) this).anInt3490 & i_16_ - 1)
		    * -912587753);
	    i_14_ = i_14_ << 1 | 1 - i_16_;
	    if (0 == (-176540641 * ((Class324) this).anInt3490 & ~0xffffff)) {
		((Class324) this).anInt3491
		    = ((327578535 * ((Class324) this).anInt3491 << 8
			| ((Class324) this).anInputStream3492.read())
		       * -912587753);
		((Class324) this).anInt3490
		    = -1226291233 * (((Class324) this).anInt3490 * -176540641
				     << 8);
	    }
	}
	return i_14_;
    }
    
    public final void method4225() throws IOException {
	((Class324) this).anInt3491 = 0;
	((Class324) this).anInt3490 = 1226291233;
	for (int i = 0; i < 5; i++)
	    ((Class324) this).anInt3491
		= (327578535 * ((Class324) this).anInt3491 << 8
		   | ((Class324) this).anInputStream3492.read()) * -912587753;
    }
    
    static final void method4226(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	Class226 class226 = ((Class646) class646).aClass226_8384;
	Class514.method6277(class229, class226, class648, 868566537);
    }
    
    static final void method4227(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.anInt2350
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * 1501098495);
    }
    
    public static byte[] method4228(byte[] is, int i) {
	if (is == null)
	    return null;
	byte[] is_17_ = new byte[is.length];
	System.arraycopy(is, 0, is_17_, 0, is.length);
	return is_17_;
    }
    
    static final void method4229(Class648 class648, byte i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub32_10598
		  .method10100((byte) 1);
    }
}
