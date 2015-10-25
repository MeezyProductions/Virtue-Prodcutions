/* Class335_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class335_Sub1 extends Class335
{
    static Class418 aClass418_9915 = new Class418();
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9916;
    Class418[] aClass418Array9917;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9918;
    static final int anInt9919 = 64;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9920;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9921;
    static final int anInt9922 = 1;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9923;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9924;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9925;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9926;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9927;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9928;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9929;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9930;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9931;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9932;
    static final int anInt9933 = 2;
    static final int anInt9934 = 4;
    static final int anInt9935 = 8;
    static final int anInt9936 = 16;
    static final int anInt9937 = 32;
    protected Class258 aClass258_9938;
    static final int anInt9939 = 128;
    int anInt9940;
    int[] anIntArray9941;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9942;
    Class528_Sub22_Sub1 aClass528_Sub22_Sub1_9943;
    float[] aFloatArray9944 = new float[3];
    
    void method9025(int i) {
	((Class335_Sub1) this).aClass418Array9917[0].method5013();
	method9051(i);
    }
    
    void method4374() {
	method9047(Class433.aClass433_4838);
    }
    
    abstract boolean method9026() throws Exception_Sub2;
    
    void method9027() {
	method9032(aClass173_Sub1_3573.aBool9343);
	method9028(aClass173_Sub1_3573.method8533());
	method9029();
	method4360();
    }
    
    void method4361() {
	if (aClass258_9938 != null)
	    aClass258_9938.method3479();
    }
    
    void method9028(Class418 class418) {
	if (aClass258_9938 != null && aClass258_9938.method3490()
	    && aClass173_Sub1_3573.method8616() == 0) {
	    int i = aClass258_9938.method3530(-812992221);
	    if ((((Class335_Sub1) this).anIntArray9941[i] & 0x80) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9916 != null) {
		aClass258_9938.method3496((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9916),
					  class418, (short) -3663);
		((Class335_Sub1) this).anIntArray9941[i] &= ~0x80;
	    }
	}
    }
    
    void method9029() {
	if (aClass258_9938 != null && aClass258_9938.method3490()) {
	    int i = aClass258_9938.method3530(-812992221);
	    int i_0_ = ((Class335_Sub1) this).anIntArray9941[i];
	    if ((i_0_ & 0x1) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9930 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9930),
					  aClass173_Sub1_3573.method8487(),
					  1039407702);
	    if ((i_0_ & 0x2) != 0) {
		if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9932 != null)
		    aClass258_9938.method3499((((Class335_Sub1) this)
					       .aClass528_Sub22_Sub1_9932),
					      aClass173_Sub1_3573.method8582(),
					      -1096477746);
		if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9924 != null) {
		    ((Class335_Sub1) this).aFloatArray9944[0] = 0.0F;
		    ((Class335_Sub1) this).aFloatArray9944[1] = 0.0F;
		    ((Class335_Sub1) this).aFloatArray9944[2] = 0.0F;
		    aClass173_Sub1_3573.method2529().method5234
			(((Class335_Sub1) this).aFloatArray9944[0],
			 ((Class335_Sub1) this).aFloatArray9944[1],
			 ((Class335_Sub1) this).aFloatArray9944[2],
			 ((Class335_Sub1) this).aFloatArray9944);
		    aClass258_9938.method3480
			(((Class335_Sub1) this).aClass528_Sub22_Sub1_9924,
			 ((Class335_Sub1) this).aFloatArray9944[0],
			 ((Class335_Sub1) this).aFloatArray9944[1],
			 ((Class335_Sub1) this).aFloatArray9944[2],
			 (short) 8974);
		}
	    }
	    if ((i_0_ & 0x10) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9921 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9921),
					  aClass173_Sub1_3573.method8492(),
					  1030242604);
	    if ((i_0_ & 0x8) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9920 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9920),
					  aClass173_Sub1_3573.method8659(),
					  -1583598100);
	    if ((i_0_ & 0x4) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9942 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9942),
					  aClass173_Sub1_3573.method8493(),
					  -2025051774);
	    if ((i_0_ & 0x20) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9927 != null) {
		aClass418_9915.method4998(aClass173_Sub1_3573.method8492(),
					  aClass173_Sub1_3573.method8493());
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9927),
					  aClass418_9915, 542119399);
	    }
	    if ((i_0_ & 0x40) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9923 != null) {
		aClass418_9915.method4998(aClass173_Sub1_3573.method8582(),
					  aClass173_Sub1_3573.method8493());
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9923),
					  aClass418_9915, 1151007408);
	    }
	    if (aClass173_Sub1_3573.method8616() == 0
		&& (((Class335_Sub1) this).anIntArray9941[i] & 0x80) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9916 != null) {
		aClass258_9938.method3496((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9916),
					  aClass173_Sub1_3573.method8533(),
					  (short) -7741);
		((Class335_Sub1) this).anIntArray9941[i] &= ~0x80;
	    }
	    ((Class335_Sub1) this).anIntArray9941[i] = 0;
	}
    }
    
    void method9030(int i, Class433 class433) {
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9925 != null) {
	    Class418 class418 = aClass173_Sub1_3573.method8659();
	    float[] fs
		= { class418.aFloatArray4768[12], class418.aFloatArray4768[13],
		    class418.aFloatArray4768[14] };
	    float[] fs_1_ = { 0.0F, 0.0F, 0.0F };
	    class418.method4972(fs_1_);
	    float[] fs_2_ = { 0.0F, 0.0F, 0.0F };
	    aClass173_Sub1_3573.method2529().method5233(0.0F, 0.0F, 0.0F,
							fs_2_);
	    class433.method5230(fs);
	    aClass258_9938.method3480((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9925),
				      fs[0], fs[1], fs[2], (short) 28079);
	}
    }
    
    void method9031(int i) {
	((Class335_Sub1) this).aClass418Array9917[0].method5013();
	method9051(i);
    }
    
    void method9032(boolean bool) {
	if (aClass258_9938 != null && aClass258_9938.method3490()) {
	    if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9931 != null)
		aClass258_9938.method3480((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9931),
					  (aClass173_Sub1_3573.aFloat9295
					   * aClass173_Sub1_3573.aFloat9298),
					  (aClass173_Sub1_3573.aFloat9296
					   * aClass173_Sub1_3573.aFloat9298),
					  (aClass173_Sub1_3573.aFloat9251
					   * aClass173_Sub1_3573.aFloat9298),
					  (short) 9442);
	    if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9943 != null)
		aClass258_9938.method3480
		    (((Class335_Sub1) this).aClass528_Sub22_Sub1_9943,
		     aClass173_Sub1_3573.aFloatArray9290[0],
		     aClass173_Sub1_3573.aFloatArray9290[1],
		     aClass173_Sub1_3573.aFloatArray9290[2], (short) 14913);
	    if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9928 != null)
		aClass258_9938.method3480((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9928),
					  (aClass173_Sub1_3573.aFloat9295
					   * aClass173_Sub1_3573.aFloat9299),
					  (aClass173_Sub1_3573.aFloat9296
					   * aClass173_Sub1_3573.aFloat9299),
					  (aClass173_Sub1_3573.aFloat9251
					   * aClass173_Sub1_3573.aFloat9299),
					  (short) 10294);
	    if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9929 != null)
		aClass258_9938.method3480((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9929),
					  (-aClass173_Sub1_3573.aFloat9295
					   * aClass173_Sub1_3573.aFloat9300),
					  (-aClass173_Sub1_3573.aFloat9296
					   * aClass173_Sub1_3573.aFloat9300),
					  (-aClass173_Sub1_3573.aFloat9251
					   * aClass173_Sub1_3573.aFloat9300),
					  (short) 30296);
	    if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9918 != null)
		aClass258_9938.method3491((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9918),
					  64.0F + Math.abs(aClass173_Sub1_3573
							   .aFloatArray9290
							   [1]) * 928.0F,
					  1452989077);
	}
    }
    
    void method4360() {
	/* empty */
    }
    
    void method9033(Class433 class433) {
	Class418 class418 = aClass173_Sub1_3573.aClass418_9243;
	class418.method5035(class433);
	int i = aClass258_9938.method3530(-812992221);
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9930 != null) {
	    aClass258_9938.method3499((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9930),
				      class418, -451300181);
	    ((Class335_Sub1) this).anIntArray9941[i] &= ~0x1;
	}
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9921 != null) {
	    aClass418_9915.method4998(class418,
				      aClass173_Sub1_3573.method8582());
	    aClass258_9938.method3499((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9921),
				      aClass418_9915, 1370015940);
	    ((Class335_Sub1) this).anIntArray9941[i] &= ~0x10;
	}
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9927 != null) {
	    aClass418_9915.method4998(class418,
				      aClass173_Sub1_3573.method8666());
	    aClass258_9938.method3499((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9927),
				      aClass418_9915, 1460884332);
	    ((Class335_Sub1) this).anIntArray9941[i] &= ~0x20;
	}
	method9030(i, class433);
	method9045(i, class433);
    }
    
    Class335_Sub1(Class173_Sub1 class173_sub1) {
	super(class173_sub1);
	new Class433();
	((Class335_Sub1) this).aClass418Array9917
	    = new Class418[aClass173_Sub1_3573.anInt9235];
	for (int i = 0; i < aClass173_Sub1_3573.anInt9235; i++)
	    ((Class335_Sub1) this).aClass418Array9917[i] = new Class418();
    }
    
    void method4362() {
	method9047(Class433.aClass433_4838);
    }
    
    void method4357() {
	if (aClass258_9938 != null)
	    aClass258_9938.method3479();
    }
    
    void method4363() {
	aClass258_9938.method3478();
	((Class335_Sub1) this).anIntArray9941[aClass258_9938
						  .method3530(-812992221)]
	    = -1;
	method9025(0);
	method9027();
    }
    
    void method9034() {
	if (aClass258_9938 != null && aClass258_9938.method3490()) {
	    int i = aClass258_9938.method3530(-812992221);
	    int i_3_ = ((Class335_Sub1) this).anIntArray9941[i];
	    if ((i_3_ & 0x1) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9930 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9930),
					  aClass173_Sub1_3573.method8487(),
					  -1468549551);
	    if ((i_3_ & 0x2) != 0) {
		if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9932 != null)
		    aClass258_9938.method3499((((Class335_Sub1) this)
					       .aClass528_Sub22_Sub1_9932),
					      aClass173_Sub1_3573.method8582(),
					      1287042089);
		if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9924 != null) {
		    ((Class335_Sub1) this).aFloatArray9944[0] = 0.0F;
		    ((Class335_Sub1) this).aFloatArray9944[1] = 0.0F;
		    ((Class335_Sub1) this).aFloatArray9944[2] = 0.0F;
		    aClass173_Sub1_3573.method2529().method5234
			(((Class335_Sub1) this).aFloatArray9944[0],
			 ((Class335_Sub1) this).aFloatArray9944[1],
			 ((Class335_Sub1) this).aFloatArray9944[2],
			 ((Class335_Sub1) this).aFloatArray9944);
		    aClass258_9938.method3480
			(((Class335_Sub1) this).aClass528_Sub22_Sub1_9924,
			 ((Class335_Sub1) this).aFloatArray9944[0],
			 ((Class335_Sub1) this).aFloatArray9944[1],
			 ((Class335_Sub1) this).aFloatArray9944[2],
			 (short) 8090);
		}
	    }
	    if ((i_3_ & 0x10) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9921 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9921),
					  aClass173_Sub1_3573.method8492(),
					  276785806);
	    if ((i_3_ & 0x8) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9920 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9920),
					  aClass173_Sub1_3573.method8659(),
					  -1703492573);
	    if ((i_3_ & 0x4) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9942 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9942),
					  aClass173_Sub1_3573.method8493(),
					  1264515669);
	    if ((i_3_ & 0x20) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9927 != null) {
		aClass418_9915.method4998(aClass173_Sub1_3573.method8492(),
					  aClass173_Sub1_3573.method8493());
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9927),
					  aClass418_9915, 1872340406);
	    }
	    if ((i_3_ & 0x40) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9923 != null) {
		aClass418_9915.method4998(aClass173_Sub1_3573.method8582(),
					  aClass173_Sub1_3573.method8493());
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9923),
					  aClass418_9915, -1802251656);
	    }
	    if (aClass173_Sub1_3573.method8616() == 0
		&& (((Class335_Sub1) this).anIntArray9941[i] & 0x80) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9916 != null) {
		aClass258_9938.method3496((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9916),
					  aClass173_Sub1_3573.method8533(),
					  (short) -8281);
		((Class335_Sub1) this).anIntArray9941[i] &= ~0x80;
	    }
	    ((Class335_Sub1) this).anIntArray9941[i] = 0;
	}
    }
    
    void method9035(Class418 class418) {
	if (aClass258_9938 != null && aClass258_9938.method3490()
	    && aClass173_Sub1_3573.method8616() == 0) {
	    int i = aClass258_9938.method3530(-812992221);
	    if ((((Class335_Sub1) this).anIntArray9941[i] & 0x80) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9916 != null) {
		aClass258_9938.method3496((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9916),
					  class418, (short) 11752);
		((Class335_Sub1) this).anIntArray9941[i] &= ~0x80;
	    }
	}
    }
    
    void method4366() {
	aClass258_9938.method3478();
	((Class335_Sub1) this).anIntArray9941[aClass258_9938
						  .method3530(-812992221)]
	    = -1;
	method9025(0);
	method9027();
    }
    
    void method4367() {
	if (aClass258_9938 != null)
	    aClass258_9938.method3479();
    }
    
    void method4356() {
	aClass258_9938.method3478();
	((Class335_Sub1) this).anIntArray9941[aClass258_9938
						  .method3530(-812992221)]
	    = -1;
	method9025(0);
	method9027();
    }
    
    void method4376() {
	/* empty */
    }
    
    void method4371() {
	aClass258_9938.method3478();
	((Class335_Sub1) this).anIntArray9941[aClass258_9938
						  .method3530(-812992221)]
	    = -1;
	method9025(0);
	method9027();
    }
    
    void method9036(boolean bool) {
	if (aClass258_9938 != null && aClass258_9938.method3490()) {
	    if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9931 != null)
		aClass258_9938.method3480((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9931),
					  (aClass173_Sub1_3573.aFloat9295
					   * aClass173_Sub1_3573.aFloat9298),
					  (aClass173_Sub1_3573.aFloat9296
					   * aClass173_Sub1_3573.aFloat9298),
					  (aClass173_Sub1_3573.aFloat9251
					   * aClass173_Sub1_3573.aFloat9298),
					  (short) 22385);
	    if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9943 != null)
		aClass258_9938.method3480
		    (((Class335_Sub1) this).aClass528_Sub22_Sub1_9943,
		     aClass173_Sub1_3573.aFloatArray9290[0],
		     aClass173_Sub1_3573.aFloatArray9290[1],
		     aClass173_Sub1_3573.aFloatArray9290[2], (short) 16994);
	    if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9928 != null)
		aClass258_9938.method3480((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9928),
					  (aClass173_Sub1_3573.aFloat9295
					   * aClass173_Sub1_3573.aFloat9299),
					  (aClass173_Sub1_3573.aFloat9296
					   * aClass173_Sub1_3573.aFloat9299),
					  (aClass173_Sub1_3573.aFloat9251
					   * aClass173_Sub1_3573.aFloat9299),
					  (short) 27915);
	    if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9929 != null)
		aClass258_9938.method3480((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9929),
					  (-aClass173_Sub1_3573.aFloat9295
					   * aClass173_Sub1_3573.aFloat9300),
					  (-aClass173_Sub1_3573.aFloat9296
					   * aClass173_Sub1_3573.aFloat9300),
					  (-aClass173_Sub1_3573.aFloat9251
					   * aClass173_Sub1_3573.aFloat9300),
					  (short) 30808);
	    if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9918 != null)
		aClass258_9938.method3491((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9918),
					  64.0F + Math.abs(aClass173_Sub1_3573
							   .aFloatArray9290
							   [1]) * 928.0F,
					  -291897796);
	}
    }
    
    void method4375() {
	method9047(Class433.aClass433_4838);
    }
    
    void method4368() {
	method9047(Class433.aClass433_4838);
    }
    
    void method4365() {
	aClass258_9938.method3478();
	((Class335_Sub1) this).anIntArray9941[aClass258_9938
						  .method3530(-812992221)]
	    = -1;
	method9025(0);
	method9027();
    }
    
    abstract boolean method9037() throws Exception_Sub2;
    
    abstract boolean method9038() throws Exception_Sub2;
    
    void method9039() {
	method9032(aClass173_Sub1_3573.aBool9343);
	method9028(aClass173_Sub1_3573.method8533());
	method9029();
	method4360();
    }
    
    void method9040() {
	method9032(aClass173_Sub1_3573.aBool9343);
	method9028(aClass173_Sub1_3573.method8533());
	method9029();
	method4360();
    }
    
    void method9041() {
	method9032(aClass173_Sub1_3573.aBool9343);
	method9028(aClass173_Sub1_3573.method8533());
	method9029();
	method4360();
    }
    
    boolean method9042(String string) throws Exception_Sub2 {
	aClass258_9938 = aClass173_Sub1_3573.method8580(string);
	if (aClass258_9938 == null)
	    throw new Exception_Sub2("");
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9916
	    = aClass258_9938.method3522("textureMatrix", 326724314);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9930
	    = aClass258_9938.method3522("modelMatrix", -1650577740);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9932
	    = aClass258_9938.method3522("viewMatrix", -190277400);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9942
	    = aClass258_9938.method3522("projectionMatrix", -1997562877);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9921
	    = aClass258_9938.method3522("modelViewMatrix", 1871601896);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9927
	    = aClass258_9938.method3522("modelViewProjectionMatrix",
					-1181478200);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9923
	    = aClass258_9938.method3522("viewProjectionMatrix", -610397017);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9931
	    = aClass258_9938.method3522("ambientColour", 721748342);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9943
	    = aClass258_9938.method3522("sunDirection", -1931946896);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9928
	    = aClass258_9938.method3522("sunColour", 1817895729);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9929
	    = aClass258_9938.method3522("antiSunColour", -847252566);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9918
	    = aClass258_9938.method3522("sunExponent", 699986303);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9924
	    = aClass258_9938.method3522("eyePosition", -669526590);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9925
	    = aClass258_9938.method3522("eyePositionOS", 1275298514);
	((Class335_Sub1) this).aClass528_Sub22_Sub1_9926
	    = aClass258_9938.method3522("sunDirectionOS", 322537917);
	if (!method9026()) {
	    aClass258_9938 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9916 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9930 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9932 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9942 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9921 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9927 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9923 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9931 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9943 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9928 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9929 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9918 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9924 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9925 = null;
	    ((Class335_Sub1) this).aClass528_Sub22_Sub1_9926 = null;
	    return false;
	}
	if (aClass258_9938.method3489(2014815060) == null) {
	    Class262 class262 = aClass258_9938.method3487(-1232652593);
	    if (class262 == null)
		throw new Exception_Sub2(new StringBuilder().append
					     (aClass258_9938
						  .method3481(-1406241610))
					     .append
					     ("").toString());
	    aClass258_9938.method3488(class262);
	}
	((Class335_Sub1) this).anInt9940
	    = aClass258_9938.method3477(2129589470);
	((Class335_Sub1) this).anIntArray9941
	    = new int[((Class335_Sub1) this).anInt9940];
	return true;
    }
    
    void method9043(Class418 class418) {
	if (aClass258_9938 != null && aClass258_9938.method3490()
	    && aClass173_Sub1_3573.method8616() == 0) {
	    int i = aClass258_9938.method3530(-812992221);
	    if ((((Class335_Sub1) this).anIntArray9941[i] & 0x80) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9916 != null) {
		aClass258_9938.method3496((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9916),
					  class418, (short) 12025);
		((Class335_Sub1) this).anIntArray9941[i] &= ~0x80;
	    }
	}
    }
    
    void method9044() {
	if (aClass258_9938 != null && aClass258_9938.method3490()) {
	    int i = aClass258_9938.method3530(-812992221);
	    int i_4_ = ((Class335_Sub1) this).anIntArray9941[i];
	    if ((i_4_ & 0x1) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9930 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9930),
					  aClass173_Sub1_3573.method8487(),
					  -1423167987);
	    if ((i_4_ & 0x2) != 0) {
		if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9932 != null)
		    aClass258_9938.method3499((((Class335_Sub1) this)
					       .aClass528_Sub22_Sub1_9932),
					      aClass173_Sub1_3573.method8582(),
					      -1130739372);
		if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9924 != null) {
		    ((Class335_Sub1) this).aFloatArray9944[0] = 0.0F;
		    ((Class335_Sub1) this).aFloatArray9944[1] = 0.0F;
		    ((Class335_Sub1) this).aFloatArray9944[2] = 0.0F;
		    aClass173_Sub1_3573.method2529().method5234
			(((Class335_Sub1) this).aFloatArray9944[0],
			 ((Class335_Sub1) this).aFloatArray9944[1],
			 ((Class335_Sub1) this).aFloatArray9944[2],
			 ((Class335_Sub1) this).aFloatArray9944);
		    aClass258_9938.method3480
			(((Class335_Sub1) this).aClass528_Sub22_Sub1_9924,
			 ((Class335_Sub1) this).aFloatArray9944[0],
			 ((Class335_Sub1) this).aFloatArray9944[1],
			 ((Class335_Sub1) this).aFloatArray9944[2],
			 (short) 19904);
		}
	    }
	    if ((i_4_ & 0x10) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9921 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9921),
					  aClass173_Sub1_3573.method8492(),
					  -1761148486);
	    if ((i_4_ & 0x8) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9920 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9920),
					  aClass173_Sub1_3573.method8659(),
					  1556056356);
	    if ((i_4_ & 0x4) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9942 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9942),
					  aClass173_Sub1_3573.method8493(),
					  -202770602);
	    if ((i_4_ & 0x20) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9927 != null) {
		aClass418_9915.method4998(aClass173_Sub1_3573.method8492(),
					  aClass173_Sub1_3573.method8493());
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9927),
					  aClass418_9915, 689140430);
	    }
	    if ((i_4_ & 0x40) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9923 != null) {
		aClass418_9915.method4998(aClass173_Sub1_3573.method8582(),
					  aClass173_Sub1_3573.method8493());
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9923),
					  aClass418_9915, 1560771430);
	    }
	    if (aClass173_Sub1_3573.method8616() == 0
		&& (((Class335_Sub1) this).anIntArray9941[i] & 0x80) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9916 != null) {
		aClass258_9938.method3496((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9916),
					  aClass173_Sub1_3573.method8533(),
					  (short) -18442);
		((Class335_Sub1) this).anIntArray9941[i] &= ~0x80;
	    }
	    ((Class335_Sub1) this).anIntArray9941[i] = 0;
	}
    }
    
    void method9045(int i, Class433 class433) {
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9926 != null) {
	    float[] fs = { aClass173_Sub1_3573.aFloatArray9290[0],
			   aClass173_Sub1_3573.aFloatArray9290[1],
			   aClass173_Sub1_3573.aFloatArray9290[2] };
	    class433.method5240(fs);
	    aClass258_9938.method3480((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9926),
				      fs[0], fs[1], fs[2], (short) 26992);
	}
    }
    
    void method9046() {
	if (aClass258_9938 != null && aClass258_9938.method3490()) {
	    int i = aClass258_9938.method3530(-812992221);
	    int i_5_ = ((Class335_Sub1) this).anIntArray9941[i];
	    if ((i_5_ & 0x1) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9930 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9930),
					  aClass173_Sub1_3573.method8487(),
					  -1697173590);
	    if ((i_5_ & 0x2) != 0) {
		if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9932 != null)
		    aClass258_9938.method3499((((Class335_Sub1) this)
					       .aClass528_Sub22_Sub1_9932),
					      aClass173_Sub1_3573.method8582(),
					      1952375002);
		if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9924 != null) {
		    ((Class335_Sub1) this).aFloatArray9944[0] = 0.0F;
		    ((Class335_Sub1) this).aFloatArray9944[1] = 0.0F;
		    ((Class335_Sub1) this).aFloatArray9944[2] = 0.0F;
		    aClass173_Sub1_3573.method2529().method5234
			(((Class335_Sub1) this).aFloatArray9944[0],
			 ((Class335_Sub1) this).aFloatArray9944[1],
			 ((Class335_Sub1) this).aFloatArray9944[2],
			 ((Class335_Sub1) this).aFloatArray9944);
		    aClass258_9938.method3480
			(((Class335_Sub1) this).aClass528_Sub22_Sub1_9924,
			 ((Class335_Sub1) this).aFloatArray9944[0],
			 ((Class335_Sub1) this).aFloatArray9944[1],
			 ((Class335_Sub1) this).aFloatArray9944[2],
			 (short) 10742);
		}
	    }
	    if ((i_5_ & 0x10) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9921 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9921),
					  aClass173_Sub1_3573.method8492(),
					  1686229695);
	    if ((i_5_ & 0x8) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9920 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9920),
					  aClass173_Sub1_3573.method8659(),
					  785249407);
	    if ((i_5_ & 0x4) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9942 != null)
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9942),
					  aClass173_Sub1_3573.method8493(),
					  -1122000830);
	    if ((i_5_ & 0x20) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9927 != null) {
		aClass418_9915.method4998(aClass173_Sub1_3573.method8492(),
					  aClass173_Sub1_3573.method8493());
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9927),
					  aClass418_9915, -1866396002);
	    }
	    if ((i_5_ & 0x40) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9923 != null) {
		aClass418_9915.method4998(aClass173_Sub1_3573.method8582(),
					  aClass173_Sub1_3573.method8493());
		aClass258_9938.method3499((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9923),
					  aClass418_9915, 801319316);
	    }
	    if (aClass173_Sub1_3573.method8616() == 0
		&& (((Class335_Sub1) this).anIntArray9941[i] & 0x80) != 0
		&& ((Class335_Sub1) this).aClass528_Sub22_Sub1_9916 != null) {
		aClass258_9938.method3496((((Class335_Sub1) this)
					   .aClass528_Sub22_Sub1_9916),
					  aClass173_Sub1_3573.method8533(),
					  (short) -7198);
		((Class335_Sub1) this).anIntArray9941[i] &= ~0x80;
	    }
	    ((Class335_Sub1) this).anIntArray9941[i] = 0;
	}
    }
    
    void method4372() {
	/* empty */
    }
    
    void method9047(Class433 class433) {
	Class418 class418 = aClass173_Sub1_3573.aClass418_9243;
	class418.method5035(class433);
	int i = aClass258_9938.method3530(-812992221);
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9930 != null) {
	    aClass258_9938.method3499((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9930),
				      class418, 727925322);
	    ((Class335_Sub1) this).anIntArray9941[i] &= ~0x1;
	}
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9921 != null) {
	    aClass418_9915.method4998(class418,
				      aClass173_Sub1_3573.method8582());
	    aClass258_9938.method3499((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9921),
				      aClass418_9915, 144216055);
	    ((Class335_Sub1) this).anIntArray9941[i] &= ~0x10;
	}
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9927 != null) {
	    aClass418_9915.method4998(class418,
				      aClass173_Sub1_3573.method8666());
	    aClass258_9938.method3499((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9927),
				      aClass418_9915, 1840328239);
	    ((Class335_Sub1) this).anIntArray9941[i] &= ~0x20;
	}
	method9030(i, class433);
	method9045(i, class433);
    }
    
    void method9048(int i) {
	for (int i_6_ = 0; i_6_ < ((Class335_Sub1) this).anInt9940; i_6_++)
	    ((Class335_Sub1) this).anIntArray9941[i_6_] |= 128 << i;
    }
    
    void method9049(int i) {
	for (int i_7_ = 0; i_7_ < ((Class335_Sub1) this).anInt9940; i_7_++)
	    ((Class335_Sub1) this).anIntArray9941[i_7_] |= 128 << i;
    }
    
    void method4369() {
	method9047(Class433.aClass433_4838);
    }
    
    void method9050(Class433 class433) {
	Class418 class418 = aClass173_Sub1_3573.aClass418_9243;
	class418.method5035(class433);
	int i = aClass258_9938.method3530(-812992221);
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9930 != null) {
	    aClass258_9938.method3499((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9930),
				      class418, -229252585);
	    ((Class335_Sub1) this).anIntArray9941[i] &= ~0x1;
	}
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9921 != null) {
	    aClass418_9915.method4998(class418,
				      aClass173_Sub1_3573.method8582());
	    aClass258_9938.method3499((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9921),
				      aClass418_9915, -1113275635);
	    ((Class335_Sub1) this).anIntArray9941[i] &= ~0x10;
	}
	if (((Class335_Sub1) this).aClass528_Sub22_Sub1_9927 != null) {
	    aClass418_9915.method4998(class418,
				      aClass173_Sub1_3573.method8666());
	    aClass258_9938.method3499((((Class335_Sub1) this)
				       .aClass528_Sub22_Sub1_9927),
				      aClass418_9915, 465612442);
	    ((Class335_Sub1) this).anIntArray9941[i] &= ~0x20;
	}
	method9030(i, class433);
	method9045(i, class433);
    }
    
    void method9051(int i) {
	for (int i_8_ = 0; i_8_ < ((Class335_Sub1) this).anInt9940; i_8_++)
	    ((Class335_Sub1) this).anIntArray9941[i_8_] |= 128 << i;
    }
}
