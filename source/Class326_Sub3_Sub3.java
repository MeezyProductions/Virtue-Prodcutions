/* Class326_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class326_Sub3_Sub3 extends Class326_Sub3
{
    int anInt11391 = 0;
    float[] aFloatArray11392;
    float[] aFloatArray11393;
    
    public float method9141() {
	return ((Class326_Sub3_Sub3) this).aFloat10060;
    }
    
    public float method4255() {
	return ((Class326_Sub3_Sub3) this).aClass432Array10058
		   [1363150985 * ((Class326_Sub3_Sub3) this).anInt11391]
		   .method5207(((Class326_Sub3_Sub3) this).aFloat10060);
    }
    
    public Class326_Sub3_Sub3(Class283 class283) {
	super(class283);
    }
    
    void method9139(ByteBuffer class528_sub42, int i, byte i_0_) {
	((Class326_Sub3_Sub3) this).aFloatArray11392 = new float[i];
	((Class326_Sub3_Sub3) this).aFloatArray11393 = new float[i];
	((Class326_Sub3_Sub3) this).anInt11391 = 0;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    ((Class326_Sub3_Sub3) this).aFloatArray11392[i_1_]
		= class528_sub42.method9635(-1536165350);
	    ((Class326_Sub3_Sub3) this).aFloatArray11393[i_1_]
		= class528_sub42.method9635(-2113349852);
	}
    }
    
    public Class422 method4236(byte i) {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class326_Sub3_Sub3) this).aClass432Array10058
			  [((Class326_Sub3_Sub3) this).anInt11391 * 1363150985]
			  .method5206(((Class326_Sub3_Sub3) this).aFloat10060);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    public double[] method4240(int i) {
	return ((Class326_Sub3_Sub3) this).aClass432Array10058
		   [((Class326_Sub3_Sub3) this).anInt11391 * 1363150985]
		   .method5206(((Class326_Sub3_Sub3) this).aFloat10060);
    }
    
    public float method9126(short i) {
	return ((Class326_Sub3_Sub3) this).aFloat10060;
    }
    
    public float method4250(int i) {
	return ((Class326_Sub3_Sub3) this).aClass432Array10058
		   [1363150985 * ((Class326_Sub3_Sub3) this).anInt11391]
		   .method5207(((Class326_Sub3_Sub3) this).aFloat10060);
    }
    
    float method9128(float f, float f_2_, float f_3_, int i) {
	float f_4_ = (((Class326_Sub3_Sub3) this).aFloat10060
		      / (float) ((Class326_Sub3_Sub3) this)
				    .aClass432Array10058
				    [1363150985 * (((Class326_Sub3_Sub3) this)
						   .anInt11391)]
				    .method5208());
	float f_5_
	    = ((((Class326_Sub3_Sub3) this).aFloatArray11392
		[1363150985 * ((Class326_Sub3_Sub3) this).anInt11391])
	       + (((((Class326_Sub3_Sub3) this).aFloatArray11393
		    [((Class326_Sub3_Sub3) this).anInt11391 * 1363150985])
		   - (((Class326_Sub3_Sub3) this).aFloatArray11392
		      [1363150985 * ((Class326_Sub3_Sub3) this).anInt11391]))
		  * f_4_));
	return f_5_;
    }
    
    void method9132(ByteBuffer class528_sub42, int i) {
	((Class326_Sub3_Sub3) this).aFloatArray11392 = new float[i];
	((Class326_Sub3_Sub3) this).aFloatArray11393 = new float[i];
	((Class326_Sub3_Sub3) this).anInt11391 = 0;
	for (int i_6_ = 0; i_6_ < i; i_6_++) {
	    ((Class326_Sub3_Sub3) this).aFloatArray11392[i_6_]
		= class528_sub42.method9635(-2041142717);
	    ((Class326_Sub3_Sub3) this).aFloatArray11393[i_6_]
		= class528_sub42.method9635(-2041945314);
	}
    }
    
    void method9134() {
	((Class326_Sub3_Sub3) this).anInt11391 += -277090887;
    }
    
    void method9138(float f, float f_7_) {
	((Class326_Sub3_Sub3) this).aFloat10060 += f;
	if (((Class326_Sub3_Sub3) this).aFloat10060
	    > (float) ((Class326_Sub3_Sub3) this).aClass432Array10058
			  [1363150985 * ((Class326_Sub3_Sub3) this).anInt11391]
			  .method5208())
	    ((Class326_Sub3_Sub3) this).aFloat10060
		= (float) ((Class326_Sub3_Sub3) this).aClass432Array10058
			      [(1363150985
				* ((Class326_Sub3_Sub3) this).anInt11391)]
			      .method5208();
    }
    
    void method9136(ByteBuffer class528_sub42, int i) {
	((Class326_Sub3_Sub3) this).aFloatArray11392 = new float[i];
	((Class326_Sub3_Sub3) this).aFloatArray11393 = new float[i];
	((Class326_Sub3_Sub3) this).anInt11391 = 0;
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    ((Class326_Sub3_Sub3) this).aFloatArray11392[i_8_]
		= class528_sub42.method9635(-1605447137);
	    ((Class326_Sub3_Sub3) this).aFloatArray11393[i_8_]
		= class528_sub42.method9635(-1872126561);
	}
    }
    
    public Class422 method4248() {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class326_Sub3_Sub3) this).aClass432Array10058
			  [((Class326_Sub3_Sub3) this).anInt11391 * 1363150985]
			  .method5206(((Class326_Sub3_Sub3) this).aFloat10060);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    public Class422 method4254() {
	Class422 class422 = Class422.method5100();
	double[] ds = ((Class326_Sub3_Sub3) this).aClass432Array10058
			  [((Class326_Sub3_Sub3) this).anInt11391 * 1363150985]
			  .method5206(((Class326_Sub3_Sub3) this).aFloat10060);
	class422.aFloat4780 = (float) ds[0];
	class422.aFloat4776 = (float) ds[1];
	class422.aFloat4777 = (float) ds[2];
	return class422;
    }
    
    public double[] method4237() {
	return ((Class326_Sub3_Sub3) this).aClass432Array10058
		   [((Class326_Sub3_Sub3) this).anInt11391 * 1363150985]
		   .method5206(((Class326_Sub3_Sub3) this).aFloat10060);
    }
    
    void method9127(float f, float f_9_, int i) {
	((Class326_Sub3_Sub3) this).aFloat10060 += f;
	if (((Class326_Sub3_Sub3) this).aFloat10060
	    > (float) ((Class326_Sub3_Sub3) this).aClass432Array10058
			  [1363150985 * ((Class326_Sub3_Sub3) this).anInt11391]
			  .method5208())
	    ((Class326_Sub3_Sub3) this).aFloat10060
		= (float) ((Class326_Sub3_Sub3) this).aClass432Array10058
			      [(1363150985
				* ((Class326_Sub3_Sub3) this).anInt11391)]
			      .method5208();
    }
    
    void method9137(float f, float f_10_) {
	((Class326_Sub3_Sub3) this).aFloat10060 += f;
	if (((Class326_Sub3_Sub3) this).aFloat10060
	    > (float) ((Class326_Sub3_Sub3) this).aClass432Array10058
			  [1363150985 * ((Class326_Sub3_Sub3) this).anInt11391]
			  .method5208())
	    ((Class326_Sub3_Sub3) this).aFloat10060
		= (float) ((Class326_Sub3_Sub3) this).aClass432Array10058
			      [(1363150985
				* ((Class326_Sub3_Sub3) this).anInt11391)]
			      .method5208();
    }
    
    float method9133(float f, float f_11_, float f_12_) {
	float f_13_
	    = (((Class326_Sub3_Sub3) this).aFloat10060
	       / (float) ((Class326_Sub3_Sub3) this).aClass432Array10058
			     [(1363150985
			       * ((Class326_Sub3_Sub3) this).anInt11391)]
			     .method5208());
	float f_14_
	    = ((((Class326_Sub3_Sub3) this).aFloatArray11392
		[1363150985 * ((Class326_Sub3_Sub3) this).anInt11391])
	       + (((((Class326_Sub3_Sub3) this).aFloatArray11393
		    [((Class326_Sub3_Sub3) this).anInt11391 * 1363150985])
		   - (((Class326_Sub3_Sub3) this).aFloatArray11392
		      [1363150985 * ((Class326_Sub3_Sub3) this).anInt11391]))
		  * f_13_));
	return f_14_;
    }
    
    public float method9130() {
	return ((Class326_Sub3_Sub3) this).aFloat10060;
    }
    
    public float method9140() {
	return ((Class326_Sub3_Sub3) this).aFloat10060;
    }
    
    public float method9131() {
	return ((Class326_Sub3_Sub3) this).aFloat10060;
    }
    
    void method9129(int i) {
	((Class326_Sub3_Sub3) this).anInt11391 += -277090887;
    }
}
