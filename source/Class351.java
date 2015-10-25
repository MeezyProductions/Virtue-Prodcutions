/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class351
{
    Class351 aClass351_3785;
    float aFloat3786;
    Interface42 anInterface42_3787;
    float aFloat3788;
    long aLong3789;
    float aFloat3790;
    float aFloat3791;
    long aLong3792;
    
    public float method4551() {
	float f = ((Class351) this).aFloat3791;
	for (Class351 class351_0_ = ((Class351) this).aClass351_3785;
	     null != class351_0_;
	     class351_0_ = class351_0_.method4561(-411552705))
	    f *= class351_0_.method4554(-2003565863);
	f = Math.min(Math.max(f, 0.0F), 1.0F);
	return f;
    }
    
    public float method4552(int i) {
	float f = 1.0F;
	for (Class351 class351_1_ = this; class351_1_ != null;
	     class351_1_ = class351_1_.method4561(-1557003560))
	    f *= class351_1_.method4556((byte) -122);
	return f;
    }
    
    Class351(int i, float f, Object object, Class355 class355,
	     Interface42 interface42, Class351 class351_2_) {
	((Class351) this).aClass351_3785 = class351_2_;
	((Class351) this).anInterface42_3787 = interface42;
	((Class351) this).aFloat3791 = 1.0F;
	((Class351) this).aFloat3788 = f;
	((Class351) this).aFloat3790 = -1.0F;
	((Class351) this).aFloat3786 = -1.0F;
	((Class351) this).aLong3789 = 1884244292671132113L;
	((Class351) this).aLong3792 = 4720765729073948417L;
    }
    
    public float method4553(int i) {
	float f = ((Class351) this).aFloat3791;
	for (Class351 class351_3_ = ((Class351) this).aClass351_3785;
	     null != class351_3_;
	     class351_3_ = class351_3_.method4561(899294200))
	    f *= class351_3_.method4554(-1364361763);
	f = Math.min(Math.max(f, 0.0F), 1.0F);
	return f;
    }
    
    public float method4554(int i) {
	return ((Class351) this).aFloat3791;
    }
    
    public void method4555(float f, int i) {
	if (((Class351) this).anInterface42_3787 == null) {
	    ((Class351) this).aFloat3786 = f;
	    ((Class351) this).aFloat3790 = ((Class351) this).aFloat3791;
	    ((Class351) this).aLong3789
		= Class249.method3417(2023917082) * -1884244292671132113L;
	    ((Class351) this).aLong3792
		= (((Class351) this).aLong3789 * -2718660015409308111L
		   + 7538773009053500316L);
	}
    }
    
    float method4556(byte i) {
	return ((Class351) this).aFloat3788;
    }
    
    void method4557() {
	if (((Class351) this).anInterface42_3787 != null) {
	    float f
		= ((Class351) this).anInterface42_3787.method318((byte) 75);
	    if (f != ((Class351) this).aFloat3791
		&& ((Class351) this).aFloat3786 < 0.0F) {
		((Class351) this).aFloat3790 = ((Class351) this).aFloat3791;
		((Class351) this).aFloat3786 = f;
		((Class351) this).aLong3789
		    = Class249.method3417(1969981640) * -1884244292671132113L;
		((Class351) this).aLong3792
		    = (7538773009053500316L
		       + ((Class351) this).aLong3789 * -2718660015409308111L);
	    }
	}
	if (((Class351) this).aFloat3786 >= 0.0F) {
	    long l = Class249.method3417(2132952520);
	    if (l > ((Class351) this).aLong3792 * -1949238957047191809L) {
		((Class351) this).aFloat3791 = ((Class351) this).aFloat3786;
		((Class351) this).aFloat3786 = -1.0F;
	    } else {
		float f = (((Class351) this).aFloat3786
			   - ((Class351) this).aFloat3790);
		long l_4_
		    = (((Class351) this).aLong3792 * -1949238957047191809L
		       - ((Class351) this).aLong3789 * -2223052737925982001L);
		float f_5_ = f / (float) l_4_;
		((Class351) this).aFloat3791
		    = (f_5_ * (float) (l - (-2223052737925982001L
					    * ((Class351) this).aLong3789))
		       + ((Class351) this).aFloat3790);
		if (((Class351) this).aFloat3791
		    == ((Class351) this).aFloat3786)
		    ((Class351) this).aFloat3786 = -1.0F;
	    }
	}
	((Class351) this).aFloat3791
	    = Math.min(1.0F, Math.max(((Class351) this).aFloat3791, 0.0F));
    }
    
    void method4558() {
	if (((Class351) this).anInterface42_3787 != null) {
	    float f
		= ((Class351) this).anInterface42_3787.method318((byte) 108);
	    if (f != ((Class351) this).aFloat3791
		&& ((Class351) this).aFloat3786 < 0.0F) {
		((Class351) this).aFloat3790 = ((Class351) this).aFloat3791;
		((Class351) this).aFloat3786 = f;
		((Class351) this).aLong3789
		    = Class249.method3417(2113446013) * -1884244292671132113L;
		((Class351) this).aLong3792
		    = (7538773009053500316L
		       + ((Class351) this).aLong3789 * -2718660015409308111L);
	    }
	}
	if (((Class351) this).aFloat3786 >= 0.0F) {
	    long l = Class249.method3417(1909267101);
	    if (l > ((Class351) this).aLong3792 * -1949238957047191809L) {
		((Class351) this).aFloat3791 = ((Class351) this).aFloat3786;
		((Class351) this).aFloat3786 = -1.0F;
	    } else {
		float f = (((Class351) this).aFloat3786
			   - ((Class351) this).aFloat3790);
		long l_6_
		    = (((Class351) this).aLong3792 * -1949238957047191809L
		       - ((Class351) this).aLong3789 * -2223052737925982001L);
		float f_7_ = f / (float) l_6_;
		((Class351) this).aFloat3791
		    = (f_7_ * (float) (l - (-2223052737925982001L
					    * ((Class351) this).aLong3789))
		       + ((Class351) this).aFloat3790);
		if (((Class351) this).aFloat3791
		    == ((Class351) this).aFloat3786)
		    ((Class351) this).aFloat3786 = -1.0F;
	    }
	}
	((Class351) this).aFloat3791
	    = Math.min(1.0F, Math.max(((Class351) this).aFloat3791, 0.0F));
    }
    
    public float method4559() {
	float f = ((Class351) this).aFloat3791;
	for (Class351 class351_8_ = ((Class351) this).aClass351_3785;
	     null != class351_8_;
	     class351_8_ = class351_8_.method4561(1585926197))
	    f *= class351_8_.method4554(-21336906);
	f = Math.min(Math.max(f, 0.0F), 1.0F);
	return f;
    }
    
    void method4560(short i) {
	if (((Class351) this).anInterface42_3787 != null) {
	    float f
		= ((Class351) this).anInterface42_3787.method318((byte) 116);
	    if (f != ((Class351) this).aFloat3791
		&& ((Class351) this).aFloat3786 < 0.0F) {
		((Class351) this).aFloat3790 = ((Class351) this).aFloat3791;
		((Class351) this).aFloat3786 = f;
		((Class351) this).aLong3789
		    = Class249.method3417(2027533791) * -1884244292671132113L;
		((Class351) this).aLong3792
		    = (7538773009053500316L
		       + ((Class351) this).aLong3789 * -2718660015409308111L);
	    }
	}
	if (((Class351) this).aFloat3786 >= 0.0F) {
	    long l = Class249.method3417(2085826927);
	    if (l > ((Class351) this).aLong3792 * -1949238957047191809L) {
		((Class351) this).aFloat3791 = ((Class351) this).aFloat3786;
		((Class351) this).aFloat3786 = -1.0F;
	    } else {
		float f = (((Class351) this).aFloat3786
			   - ((Class351) this).aFloat3790);
		long l_9_
		    = (((Class351) this).aLong3792 * -1949238957047191809L
		       - ((Class351) this).aLong3789 * -2223052737925982001L);
		float f_10_ = f / (float) l_9_;
		((Class351) this).aFloat3791
		    = (f_10_ * (float) (l - (-2223052737925982001L
					     * ((Class351) this).aLong3789))
		       + ((Class351) this).aFloat3790);
		if (((Class351) this).aFloat3791
		    == ((Class351) this).aFloat3786)
		    ((Class351) this).aFloat3786 = -1.0F;
	    }
	}
	((Class351) this).aFloat3791
	    = Math.min(1.0F, Math.max(((Class351) this).aFloat3791, 0.0F));
    }
    
    public Class351 method4561(int i) {
	return ((Class351) this).aClass351_3785;
    }
    
    void method4562() {
	if (((Class351) this).anInterface42_3787 != null) {
	    float f
		= ((Class351) this).anInterface42_3787.method318((byte) 100);
	    if (f != ((Class351) this).aFloat3791
		&& ((Class351) this).aFloat3786 < 0.0F) {
		((Class351) this).aFloat3790 = ((Class351) this).aFloat3791;
		((Class351) this).aFloat3786 = f;
		((Class351) this).aLong3789
		    = Class249.method3417(1960035434) * -1884244292671132113L;
		((Class351) this).aLong3792
		    = (7538773009053500316L
		       + ((Class351) this).aLong3789 * -2718660015409308111L);
	    }
	}
	if (((Class351) this).aFloat3786 >= 0.0F) {
	    long l = Class249.method3417(1980760711);
	    if (l > ((Class351) this).aLong3792 * -1949238957047191809L) {
		((Class351) this).aFloat3791 = ((Class351) this).aFloat3786;
		((Class351) this).aFloat3786 = -1.0F;
	    } else {
		float f = (((Class351) this).aFloat3786
			   - ((Class351) this).aFloat3790);
		long l_11_
		    = (((Class351) this).aLong3792 * -1949238957047191809L
		       - ((Class351) this).aLong3789 * -2223052737925982001L);
		float f_12_ = f / (float) l_11_;
		((Class351) this).aFloat3791
		    = (f_12_ * (float) (l - (-2223052737925982001L
					     * ((Class351) this).aLong3789))
		       + ((Class351) this).aFloat3790);
		if (((Class351) this).aFloat3791
		    == ((Class351) this).aFloat3786)
		    ((Class351) this).aFloat3786 = -1.0F;
	    }
	}
	((Class351) this).aFloat3791
	    = Math.min(1.0F, Math.max(((Class351) this).aFloat3791, 0.0F));
    }
    
    static final void method4563(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.anInt2430
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * -44552751);
	Class39.method811(class229, 1435904523);
	if (-1 == 1835803215 * class229.anInt2377 && !class226.aBool2335)
	    Class550.method6688(class229.anInt2376 * 306930455, -1203793876);
    }
    
    static final void method4564(Class229 class229, Class226 class226,
				 Class648 class648, int i) {
	class229.anInt2480
	    = ((((Class648) class648).anIntArray8394
		[(((Class648) class648).anInt8395 -= 1239022665) * 717927929])
	       * 1570434705);
    }
    
    static final void method4565(Class648 class648, byte i) {
	((Class648) class648).anInt8395 -= -1816921966;
	int i_13_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_14_ = (((Class648) class648).anIntArray8394
		     [1 + ((Class648) class648).anInt8395 * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = i_13_ | 1 << i_14_;
    }
    
    static final void method4566(Class648 class648, int i) {
	int i_15_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	ItemType itemType
	    = (ItemType) Class18.aClass5_Sub13_206.method63(i_15_, 308466460);
	if (282882573 * itemType.anInt79 == -1
	    && 2034274079 * itemType.anInt96 >= 0)
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= itemType.anInt96 * 2034274079;
	else
	    ((Class648) class648).anIntArray8394
		[((((Class648) class648).anInt8395 += 1239022665) * 717927929
		  - 1)]
		= i_15_;
    }
    
    static final void method4567(Class648 class648, int i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = ((Class648) class648).aClass645_Sub1_Sub2_Sub1_8409
		  .method9785(2128565811);
    }
    
    static final void method4568(Class648 class648, int i) {
	int i_16_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	Class229 class229 = Class623_Sub1.method9755(i_16_, (byte) 4);
	Class226 class226 = Class380.aClass226Array3970[i_16_ >> 16];
	Class372.method4677(class229, class226, class648, -1374168739);
    }
    
    public static int method4569(int i, int i_17_, int i_18_, int i_19_) {
	i_18_ &= 0x3;
	if (0 == i_18_)
	    return i;
	if (1 == i_18_)
	    return i_17_;
	if (2 == i_18_)
	    return 4095 - i;
	return 4095 - i_17_;
    }
    
    static final void method4570(Class648 class648, int i)
	throws Exception_Sub4 {
	((Class648) class648).anInt8395 -= 661123364;
	int i_20_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395]);
	int i_21_ = (((Class648) class648).anIntArray8394
		     [717927929 * ((Class648) class648).anInt8395 + 1]);
	int i_22_ = (((Class648) class648).anIntArray8394
		     [((Class648) class648).anInt8395 * 717927929 + 2]);
	Class422 class422
	    = Class422.method5051((float) i_20_, (float) i_21_, (float) i_22_);
	Class495.aClass283_Sub1_5578.method3818(class422, 1627839357);
	class422.method5054();
    }
    
    static long method4571(CharSequence charsequence, int i) {
	long l = 0L;
	int i_23_ = charsequence.length();
	for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_24_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) (c + '\001' - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) (c + '\001' - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) (c + '\033' - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
	    /* empty */
	}
	return l;
    }
}
