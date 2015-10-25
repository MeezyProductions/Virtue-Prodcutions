/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class364
{
    public abstract void method4602();
    
    abstract Object method4603(Class351 class351);
    
    Class364() {
	/* empty */
    }
    
    public abstract void method4604(Object object, int i);
    
    public abstract Object method4605(int i, int i_0_, Class365 class365,
				      Class362 class362, int i_1_, float f,
				      byte i_2_);
    
    public abstract void method4606(int i);
    
    public abstract Class468 method4607(Class480 class480, byte i);
    
    abstract Object method4608(Class351 class351, int i);
    
    public abstract Class355 method4609(byte i);
    
    public abstract void method4610(int i);
    
    public abstract void method4611();
    
    public abstract void method4612();
    
    public abstract int method4613(Object object, int i);
    
    public abstract Object method4614(int i, int i_3_, Class365 class365,
				      Class362 class362, int i_4_, float f);
    
    public abstract int method4615(Object object);
    
    public abstract void method4616(Object object);
    
    public abstract void method4617(Object object, byte[] is, int i, int i_5_);
    
    public abstract void method4618(Object object, byte[] is, int i, int i_6_);
    
    public abstract Class468 method4619(Class480 class480);
    
    public abstract Object method4620(int i, int i_7_, Class365 class365,
				      Class362 class362, int i_8_, float f);
    
    public abstract Class468 method4621(Class480 class480);
    
    public abstract Class355 method4622();
    
    abstract Object method4623(Class351 class351);
    
    abstract Object method4624(Class351 class351);
    
    public abstract Class355 method4625();
    
    public abstract void method4626(Object object, byte[] is, int i, int i_9_,
				    byte i_10_);
    
    public abstract Class355 method4627();
    
    public abstract Class355 method4628();
    
    public abstract Class468 method4629(Class480 class480);
    
    static void method4630(Class648 class648, int i) {
	((Class648) class648).anObjectArray8396
	    [(((Class648) class648).anInt8410 += 1600226731) * -520794877 - 1]
	    = ((Class256)
	       Class669.aClass25_Sub1_8522.method63((((Class648) class648)
						     .anIntArray8394
						     [((((Class648) class648)
							    .anInt8395
							-= 1239022665)
						       * 717927929)]),
						    1025543630)).aString2821;
    }
    
    static final void method4631(Class648 class648, int i) {
	Class646 class646 = (((Class648) class648).aBool8418
			     ? ((Class648) class648).aClass646_8406
			     : ((Class648) class648).aClass646_8392);
	Class229 class229 = ((Class646) class646).aClass229_8385;
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = class229.anInt2423 * -1052877275;
    }
    
    static String method4632(int i, int i_11_, boolean bool, int i_12_) {
	if (i_11_ < 2 || i_11_ > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i_11_).toString());
	if (!bool || i < 0)
	    return Integer.toString(i, i_11_);
	int i_13_ = 2;
	int i_14_ = i / i_11_;
	while (i_14_ != 0) {
	    i_14_ /= i_11_;
	    i_13_++;
	}
	char[] cs = new char[i_13_];
	cs[0] = '+';
	for (int i_15_ = i_13_ - 1; i_15_ > 0; i_15_--) {
	    int i_16_ = i;
	    i /= i_11_;
	    int i_17_ = i_16_ - i * i_11_;
	    if (i_17_ >= 10)
		cs[i_15_] = (char) (87 + i_17_);
	    else
		cs[i_15_] = (char) (i_17_ + 48);
	}
	return new String(cs);
    }
    
    static final void method4633(Class648 class648, short i) {
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = 100;
    }
    
    static final void method4634(Class648 class648, int i) {
	int i_18_
	    = (((Class648) class648).anIntArray8394
	       [(((Class648) class648).anInt8395 -= 1239022665) * 717927929]);
	((Class648) class648).anIntArray8394
	    [(((Class648) class648).anInt8395 += 1239022665) * 717927929 - 1]
	    = Class514.aClass528_Sub38_6967.aClass691_Sub9_10582
		  .method8126(i_18_, -1955030095);
    }
}
